import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class235 extends class97 {

    @OriginalMember(owner = "client!se", name = "J", descriptor = "Z")
    private boolean field3508 = false;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    private int field3505;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field3510;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3509;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3507;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "[B")
    private byte[] field3506;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "()V")
    public final void method928() {
        if (this.field3507 != null) {
            this.field3507.close();
            this.field3507 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "()I")
    public final int method927() {
        return this.field3505 - (this.field3507.available() >> (class238.field3527 ? 2 : 1));
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V")
    public final void method915() throws LineUnavailableException {
        this.field3507.flush();
        if (!this.field3508) {
            return;
        }
        this.field3507.close();
        this.field3507 = null;
        Info var1 = new Info(field3510 == null ? (field3510 = method1576("javax.sound.sampled.SourceDataLine")) : field3510, this.field3509, this.field3505 << (class238.field3527 ? 2 : 1));
        this.field3507 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3507.open();
        this.field3507.start();
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public final void method921(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3510 == null ? (field3510 = method1576("javax.sound.sampled.SourceDataLine")) : field3510, this.field3509, arg0 << (class238.field3527 ? 2 : 1));
            this.field3507 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3507.open();
            this.field3507.start();
            this.field3505 = arg0;
        } catch (LineUnavailableException var4) {
            if (class687.method3860((byte) -117, arg0) == 1) {
                this.field3507 = null;
                throw var4;
            } else {
                this.method921(class455.method2740(-1675135295, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()V")
    public final void method923() {
        int var1 = 256;
        if (class238.field3527) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1716[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3506[var2 * 2] = (byte) (var3 >> 8);
            this.field3506[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3507.write(this.field3506, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method920(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3508 = true;
                    }
                }
            }
        }
        this.field3509 = new AudioFormat((float) class195.field3068, 16, class238.field3527 ? 2 : 1, true, false);
        this.field3506 = new byte[0x100 << (class238.field3527 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1576(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
