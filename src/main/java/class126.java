import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class126 extends class17 {

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "[B")
    private byte[] field3040 = new byte[512];

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3041 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field3042;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3039;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "()V", line = 10)
    public final void method81() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field334[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field3040[var1 * 2] = (byte) (var2 >> 8);
            this.field3040[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field3039.write(this.field3040, 0, 512);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()V", line = 27)
    public final void method85() {
        if (this.field3039 != null) {
            this.field3039.close();
            this.field3039 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 41)
    public final void method82(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3042 == null ? (field3042 = method947("javax.sound.sampled.SourceDataLine")) : field3042, this.field3041, arg0 * 2);
            this.field3039 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3039.open();
            this.field3039.start();
        } catch (LineUnavailableException var4) {
            this.field3039 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 41)
    public static Class method947(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 54)
    public class126() throws Exception {
        super(22050);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()I", line = 65)
    public final int method83() {
        return this.field3039.available() >> 1;
    }
}
