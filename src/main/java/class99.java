import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class99 extends class79 {

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "[B")
    private byte[] field2460 = new byte[512];

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2459 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field2461;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2458;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V", line = 13)
    public final void method583(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2461 == null ? (field2461 = method760("javax.sound.sampled.SourceDataLine")) : field2461, this.field2459, arg0 * 2);
            this.field2458 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2458.open();
            this.field2458.start();
        } catch (LineUnavailableException var4) {
            this.field2458 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 13)
    public static Class method760(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()I", line = 28)
    public final int method579() {
        return this.field2458.available() >> 1;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()V", line = 36)
    public final void method580() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field2069[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field2460[var1 * 2] = (byte) (var2 >> 8);
            this.field2460[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field2458.write(this.field2460, 0, 512);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 52)
    public class99() throws Exception {
        super(22050);
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "()V", line = 61)
    public final void method582() {
        if (this.field2458 != null) {
            this.field2458.close();
            this.field2458 = null;
        }
    }
}
