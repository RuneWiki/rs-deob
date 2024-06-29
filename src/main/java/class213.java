import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class213 extends class346 {

    @OriginalMember(owner = "client!fq", name = "J", descriptor = "Z")
    private boolean field3300 = false;

    @OriginalMember(owner = "client!fq", name = "I", descriptor = "I")
    private int field3299;

    @OriginalMember(owner = "client!fq", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field3304;

    @OriginalMember(owner = "client!fq", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3303;

    @OriginalMember(owner = "client!fq", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3301;

    @OriginalMember(owner = "client!fq", name = "L", descriptor = "[B")
    private byte[] field3302;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "()I", line = 10)
    public final int method1464() {
        return this.field3299 - (this.field3301.available() >> (class488.field6898 ? 2 : 1));
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V", line = 22)
    public final void method1465(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3304 == null ? (field3304 = method1470("javax.sound.sampled.SourceDataLine")) : field3304, this.field3303, arg0 << (class488.field6898 ? 2 : 1));
            this.field3301 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3301.open();
            this.field3301.start();
            this.field3299 = arg0;
        } catch (LineUnavailableException var4) {
            if (class358.method2262(false, arg0) == 1) {
                this.field3301 = null;
                throw var4;
            } else {
                this.method1465(class433.method2595(arg0, (byte) -82));
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 22)
    public static Class method1470(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 46)
    public final void method1466(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3300 = true;
                    }
                }
            }
        }
        this.field3303 = new AudioFormat((float) class114.field1746, 16, class488.field6898 ? 2 : 1, true, false);
        this.field3302 = new byte[0x100 << (class488.field6898 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "()V", line = 81)
    public final void method1467() {
        if (this.field3301 != null) {
            this.field3301.close();
            this.field3301 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "()V", line = 96)
    public final void method1468() throws LineUnavailableException {
        this.field3301.flush();
        if (!this.field3300) {
            return;
        }
        this.field3301.close();
        this.field3301 = null;
        Info var1 = new Info(field3304 == null ? (field3304 = method1470("javax.sound.sampled.SourceDataLine")) : field3304, this.field3303, this.field3299 << (class488.field6898 ? 2 : 1));
        this.field3301 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3301.open();
        this.field3301.start();
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "()V", line = 117)
    public final void method1469() {
        int var1 = 256;
        if (class488.field6898) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4819[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3302[var2 * 2] = (byte) (var3 >> 8);
            this.field3302[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3301.write(this.field3302, 0, var1 << 1);
    }
}
