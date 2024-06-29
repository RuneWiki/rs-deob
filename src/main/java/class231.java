import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class231 extends class36 {

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "Z")
    private boolean field3655 = false;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    private int field3653;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field3656;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3651;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3652;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "[B")
    private byte[] field3654;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 12)
    public final void method239(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3656 == null ? (field3656 = method1650("javax.sound.sampled.SourceDataLine")) : field3656, this.field3651, arg0 << (class112.field1656 ? 2 : 1));
            this.field3652 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3652.open();
            this.field3652.start();
            this.field3653 = arg0;
        } catch (LineUnavailableException var4) {
            if (class298.method2056(arg0, 1802566600) == 1) {
                this.field3652 = null;
                throw var4;
            } else {
                this.method239(class110.method746(arg0, -705295902));
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 12)
    public static Class method1650(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()V", line = 36)
    public final void method245() {
        int var1 = 256;
        if (class112.field1656) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field547[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3654[var2 * 2] = (byte) (var3 >> 8);
            this.field3654[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3652.write(this.field3654, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "()V", line = 69)
    public final void method247() throws LineUnavailableException {
        this.field3652.flush();
        if (!this.field3655) {
            return;
        }
        this.field3652.close();
        this.field3652 = null;
        Info var1 = new Info(field3656 == null ? (field3656 = method1650("javax.sound.sampled.SourceDataLine")) : field3656, this.field3651, this.field3653 << (class112.field1656 ? 2 : 1));
        this.field3652 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3652.open();
        this.field3652.start();
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()V", line = 87)
    public final void method241() {
        if (this.field3652 != null) {
            this.field3652.close();
            this.field3652 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 101)
    public final void method249(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3655 = true;
                    }
                }
            }
        }
        this.field3651 = new AudioFormat((float) class202.field3240, 16, class112.field1656 ? 2 : 1, true, false);
        this.field3654 = new byte[0x100 << (class112.field1656 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()I", line = 136)
    public final int method237() {
        return this.field3653 - (this.field3652.available() >> (class112.field1656 ? 2 : 1));
    }
}
