import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class516 extends class24 {

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "Z")
    private boolean field7352 = false;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    private int field7349;

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field7354;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field7350;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field7351;

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "[B")
    private byte[] field7353;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "()V", line = 11)
    public final void method118() {
        if (this.field7351 != null) {
            this.field7351.close();
            this.field7351 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 26)
    public final void method114(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field7352 = true;
                    }
                }
            }
        }
        this.field7350 = new AudioFormat((float) class277.field3387, 16, class54.field556 ? 2 : 1, true, false);
        this.field7353 = new byte[0x100 << (class54.field556 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V", line = 63)
    public final void method115(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field7354 == null ? (field7354 = method3039("javax.sound.sampled.SourceDataLine")) : field7354, this.field7350, arg0 << (class54.field556 ? 2 : 1));
            this.field7351 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field7351.open();
            this.field7351.start();
            this.field7349 = arg0;
        } catch (LineUnavailableException var4) {
            if (class729.method4062(arg0, -126) == 1) {
                this.field7351 = null;
                throw var4;
            } else {
                this.method115(class756.method4202(true, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 63)
    public static Class method3039(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "()V", line = 85)
    public final void method105() throws LineUnavailableException {
        this.field7351.flush();
        if (!this.field7352) {
            return;
        }
        this.field7351.close();
        this.field7351 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field7354 == null ? (field7354 = method3039("javax.sound.sampled.SourceDataLine")) : field7354, this.field7350, this.field7349 << (class54.field556 ? 2 : 1));
        this.field7351 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field7351.open();
        this.field7351.start();
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "()V", line = 108)
    public final void method119() {
        int var1 = 256;
        if (class54.field556) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field223[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field7353[var2 * 2] = (byte) (var3 >> 8);
            this.field7353[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field7351.write(this.field7353, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "()I", line = 143)
    public final int method112() {
        return this.field7349 - (this.field7351.available() >> (class54.field556 ? 2 : 1));
    }
}
