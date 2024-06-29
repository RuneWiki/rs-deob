import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class213 extends class55 {

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "Z")
    private boolean field3328 = false;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    private int field3327;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field3330;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3326;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3325;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "[B")
    private byte[] field3329;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "()V")
    public final void method405() {
        if (this.field3325 != null) {
            this.field3325.close();
            this.field3325 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
    public final void method394() throws LineUnavailableException {
        this.field3325.flush();
        if (!this.field3328) {
            return;
        }
        this.field3325.close();
        this.field3325 = null;
        Info var1 = new Info(field3330 == null ? (field3330 = method1439("javax.sound.sampled.SourceDataLine")) : field3330, this.field3326, this.field3327 << (class72.field1013 ? 2 : 1));
        this.field3325 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3325.open();
        this.field3325.start();
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "()V")
    public final void method401() {
        int var1 = 256;
        if (class72.field1013) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field766[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3329[var2 * 2] = (byte) (var3 >> 8);
            this.field3329[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3325.write(this.field3329, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method404(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3328 = true;
                    }
                }
            }
        }
        this.field3326 = new AudioFormat((float) class290.field4582, 16, class72.field1013 ? 2 : 1, true, false);
        this.field3329 = new byte[0x100 << (class72.field1013 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public final void method400(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3330 == null ? (field3330 = method1439("javax.sound.sampled.SourceDataLine")) : field3330, this.field3326, arg0 << (class72.field1013 ? 2 : 1));
            this.field3325 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3325.open();
            this.field3325.start();
            this.field3327 = arg0;
        } catch (LineUnavailableException var4) {
            if (class155.method1029(30264, arg0) == 1) {
                this.field3325 = null;
                throw var4;
            } else {
                this.method400(class279.method1869((byte) -93, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "()I")
    public final int method403() {
        return this.field3327 - (this.field3325.available() >> (class72.field1013 ? 2 : 1));
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1439(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
