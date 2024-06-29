import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class221 extends class289 {

    @OriginalMember(owner = "client!cu", name = "F", descriptor = "Z")
    private boolean field3155 = false;

    @OriginalMember(owner = "client!cu", name = "H", descriptor = "I")
    private int field3157;

    @OriginalMember(owner = "client!cu", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field3160;

    @OriginalMember(owner = "client!cu", name = "G", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3156;

    @OriginalMember(owner = "client!cu", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3158;

    @OriginalMember(owner = "client!cu", name = "J", descriptor = "[B")
    private byte[] field3159;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V", line = 12)
    public final void method1420(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3160 == null ? (field3160 = method1426("javax.sound.sampled.SourceDataLine")) : field3160, this.field3156, arg0 << (class27.field430 ? 2 : 1));
            this.field3158 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3158.open();
            this.field3158.start();
            this.field3157 = arg0;
        } catch (LineUnavailableException var4) {
            if (class741.method4124(arg0, -58) == 1) {
                this.field3158 = null;
                throw var4;
            } else {
                this.method1420(class737.method4119(arg0, (byte) -128));
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 12)
    public static Class method1426(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "()V", line = 34)
    public final void method1421() throws LineUnavailableException {
        this.field3158.flush();
        if (!this.field3155) {
            return;
        }
        this.field3158.close();
        this.field3158 = null;
        Info var1 = new Info(field3160 == null ? (field3160 = method1426("javax.sound.sampled.SourceDataLine")) : field3160, this.field3156, this.field3157 << (class27.field430 ? 2 : 1));
        this.field3158 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3158.open();
        this.field3158.start();
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 56)
    public final void method1422(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3155 = true;
                    }
                }
            }
        }
        this.field3156 = new AudioFormat((float) class405.field5646, 16, class27.field430 ? 2 : 1, true, false);
        this.field3159 = new byte[0x100 << (class27.field430 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "()I", line = 94)
    public final int method1423() {
        return this.field3157 - (this.field3158.available() >> (class27.field430 ? 2 : 1));
    }

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "()V", line = 103)
    public final void method1424() {
        int var1 = 256;
        if (class27.field430) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4106[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3159[var2 * 2] = (byte) (var3 >> 8);
            this.field3159[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3158.write(this.field3159, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "()V", line = 136)
    public final void method1425() {
        if (this.field3158 != null) {
            this.field3158.close();
            this.field3158 = null;
        }
    }
}
