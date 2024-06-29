import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class183 extends class165 {

    @OriginalMember(owner = "client!re", name = "N", descriptor = "Z")
    private boolean field3310 = false;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    private int field3308;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field3311;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3307;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3309;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "[B")
    private byte[] field3306;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "()V")
    public final void method41() throws LineUnavailableException {
        this.field3309.flush();
        if (!this.field3310) {
            return;
        }
        this.field3309.close();
        this.field3309 = null;
        Info var1 = new Info(field3311 == null ? (field3311 = method1149("javax.sound.sampled.SourceDataLine")) : field3311, this.field3307, this.field3308 << (class149.field2668 ? 2 : 1));
        this.field3309 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3309.open();
        this.field3309.start();
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()I")
    public final int method38() {
        return this.field3308 - (this.field3309.available() >> (class149.field2668 ? 2 : 1));
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public final void method39(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3311 == null ? (field3311 = method1149("javax.sound.sampled.SourceDataLine")) : field3311, this.field3307, arg0 << (class149.field2668 ? 2 : 1));
            this.field3309 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3309.open();
            this.field3309.start();
            this.field3308 = arg0;
        } catch (LineUnavailableException var4) {
            if (class236.method1532(true, arg0) == 1) {
                this.field3309 = null;
                throw var4;
            } else {
                this.method39(class54.method373(arg0, 77));
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()V")
    public final void method37() {
        int var1 = 256;
        if (class149.field2668) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2983[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3306[var2 * 2] = (byte) (var3 >> 8);
            this.field3306[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3309.write(this.field3306, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "()V")
    public final void method35() {
        if (this.field3309 != null) {
            this.field3309.close();
            this.field3309 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method36(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3310 = true;
                    }
                }
            }
        }
        this.field3307 = new AudioFormat((float) class204.field3624, 16, class149.field2668 ? 2 : 1, true, false);
        this.field3306 = new byte[0x100 << (class149.field2668 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1149(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
