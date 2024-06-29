import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class485 extends class149 {

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Z")
    private boolean field6864 = false;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    private int field6862;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field6865;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field6863;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field6861;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "[B")
    private byte[] field6860;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V", line = 10)
    public final void method1057() {
        if (this.field6861 != null) {
            this.field6861.close();
            this.field6861 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()V", line = 28)
    public final void method1061() {
        int var1 = 256;
        if (class217.field3139) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2040[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field6860[var2 * 2] = (byte) (var3 >> 8);
            this.field6860[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field6861.write(this.field6860, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()V", line = 61)
    public final void method1060() throws LineUnavailableException {
        this.field6861.flush();
        if (!this.field6864) {
            return;
        }
        this.field6861.close();
        this.field6861 = null;
        Info var1 = new Info(field6865 == null ? (field6865 = method2862("javax.sound.sampled.SourceDataLine")) : field6865, this.field6863, this.field6862 << (class217.field3139 ? 2 : 1));
        this.field6861 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field6861.open();
        this.field6861.start();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 68)
    public static Class method2862(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 81)
    public final void method1064(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field6864 = true;
                    }
                }
            }
        }
        this.field6863 = new AudioFormat((float) class192.field2868, 16, class217.field3139 ? 2 : 1, true, false);
        this.field6860 = new byte[0x100 << (class217.field3139 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()I", line = 120)
    public final int method1063() {
        return this.field6862 - (this.field6861.available() >> (class217.field3139 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V", line = 131)
    public final void method1068(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field6865 == null ? (field6865 = method2862("javax.sound.sampled.SourceDataLine")) : field6865, this.field6863, arg0 << (class217.field3139 ? 2 : 1));
            this.field6861 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field6861.open();
            this.field6861.start();
            this.field6862 = arg0;
        } catch (LineUnavailableException var4) {
            if (class435.method2643(0, arg0) == 1) {
                this.field6861 = null;
                throw var4;
            } else {
                this.method1068(class169.method1230(0, arg0));
            }
        }
    }
}
