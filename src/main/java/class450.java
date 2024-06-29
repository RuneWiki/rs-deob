import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class450 extends class635 {

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "Z")
    private boolean field6183 = false;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    private int field6184;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field6188;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field6186;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field6185;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "[B")
    private byte[] field6187;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 14)
    public final void method2282(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field6188 == null ? (field6188 = method2651("javax.sound.sampled.SourceDataLine")) : field6188, this.field6186, arg0 << (class209.field3076 ? 2 : 1));
            this.field6185 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field6185.open();
            this.field6185.start();
            this.field6184 = arg0;
        } catch (LineUnavailableException var4) {
            if (class469.method2741(97, arg0) == 1) {
                this.field6185 = null;
                throw var4;
            } else {
                this.method2282(class661.method3706(arg0, true));
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 14)
    public static Class method2651(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V", line = 38)
    public final void method2279() throws LineUnavailableException {
        this.field6185.flush();
        if (!this.field6183) {
            return;
        }
        this.field6185.close();
        this.field6185 = null;
        Info var1 = new Info(field6188 == null ? (field6188 = method2651("javax.sound.sampled.SourceDataLine")) : field6188, this.field6186, this.field6184 << (class209.field3076 ? 2 : 1));
        this.field6185 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field6185.open();
        this.field6185.start();
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 59)
    public final void method2283(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field6183 = true;
                    }
                }
            }
        }
        this.field6186 = new AudioFormat((float) class702.field9843, 16, class209.field3076 ? 2 : 1, true, false);
        this.field6187 = new byte[0x100 << (class209.field3076 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()V", line = 99)
    public final void method2280() {
        if (this.field6185 != null) {
            this.field6185.close();
            this.field6185 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "()I", line = 115)
    public final int method2281() {
        return this.field6184 - (this.field6185.available() >> (class209.field3076 ? 2 : 1));
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "()V", line = 124)
    public final void method2277() {
        int var1 = 256;
        if (class209.field3076) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field8966[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field6187[var2 * 2] = (byte) (var3 >> 8);
            this.field6187[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field6185.write(this.field6187, 0, var1 << 1);
    }
}
