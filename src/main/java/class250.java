import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class250 extends class246 {

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "Z")
    private boolean field3938 = false;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
    private int field3940;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field3942;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3937;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3939;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "[B")
    private byte[] field3941;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 14)
    public final void method528(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3942 == null ? (field3942 = method1796("javax.sound.sampled.SourceDataLine")) : field3942, this.field3937, arg0 << (class157.field2427 ? 2 : 1));
            this.field3939 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3939.open();
            this.field3939.start();
            this.field3940 = arg0;
        } catch (LineUnavailableException var4) {
            if (class9.method122(-21103920, arg0) == 1) {
                this.field3939 = null;
                throw var4;
            } else {
                this.method528(class215.method1568(479166497, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 14)
    public static Class method1796(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()V", line = 36)
    public final void method534() {
        if (this.field3939 != null) {
            this.field3939.close();
            this.field3939 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()V", line = 50)
    public final void method531() throws LineUnavailableException {
        this.field3939.flush();
        if (!this.field3938) {
            return;
        }
        this.field3939.close();
        this.field3939 = null;
        Info var1 = new Info(field3942 == null ? (field3942 = method1796("javax.sound.sampled.SourceDataLine")) : field3942, this.field3937, this.field3940 << (class157.field2427 ? 2 : 1));
        this.field3939 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3939.open();
        this.field3939.start();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 70)
    public final void method530(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3938 = true;
                    }
                }
            }
        }
        this.field3937 = new AudioFormat((float) class318.field5024, 16, class157.field2427 ? 2 : 1, true, false);
        this.field3941 = new byte[0x100 << (class157.field2427 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()V", line = 110)
    public final void method533() {
        int var1 = 256;
        if (class157.field2427) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3835[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3941[var2 * 2] = (byte) (var3 >> 8);
            this.field3941[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3939.write(this.field3941, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()I", line = 143)
    public final int method529() {
        return this.field3940 - (this.field3939.available() >> (class157.field2427 ? 2 : 1));
    }
}
