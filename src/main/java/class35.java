import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class35 extends class182 {

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "Z")
    private boolean field561 = false;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field566;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field562;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field563;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "[B")
    private byte[] field564;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 11)
    public final void method244(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field561 = true;
                    }
                }
            }
        }
        this.field562 = new AudioFormat((float) class386.field5629, 16, class418.field6010 ? 2 : 1, true, false);
        this.field564 = new byte[0x100 << (class418.field6010 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()V", line = 52)
    public final void method245() {
        int var1 = 256;
        if (class418.field6010) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2417[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field564[var2 * 2] = (byte) (var3 >> 8);
            this.field564[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field563.write(this.field564, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 87)
    public final void method246(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field566 == null ? (field566 = method250("javax.sound.sampled.SourceDataLine")) : field566, this.field562, arg0 << (class418.field6010 ? 2 : 1));
            this.field563 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field563.open();
            this.field563.start();
            this.field565 = arg0;
        } catch (LineUnavailableException var4) {
            if (class279.method1803(arg0, 2) == 1) {
                this.field563 = null;
                throw var4;
            } else {
                this.method246(class719.method4014(arg0, (byte) -100));
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 87)
    public static Class method250(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "()V", line = 108)
    public final void method247() throws LineUnavailableException {
        this.field563.flush();
        if (!this.field561) {
            return;
        }
        this.field563.close();
        this.field563 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field566 == null ? (field566 = method250("javax.sound.sampled.SourceDataLine")) : field566, this.field562, this.field565 << (class418.field6010 ? 2 : 1));
        this.field563 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field563.open();
        this.field563.start();
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "()V", line = 132)
    public final void method248() {
        if (this.field563 != null) {
            this.field563.close();
            this.field563 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()I", line = 149)
    public final int method249() {
        return this.field565 - (this.field563.available() >> (class418.field6010 ? 2 : 1));
    }
}
