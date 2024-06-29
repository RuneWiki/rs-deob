import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class111 extends class126 {

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "[B")
    private byte[] field2426 = new byte[512];

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2428 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field2429;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2427;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()I")
    public final int method42() {
        return this.field2427.available() >> 1;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "()V")
    public final void method45() {
        if (this.field2427 != null) {
            this.field2427.close();
            this.field2427 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class111() throws Exception {
        super(22050);
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()V")
    public final void method43() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field2729[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field2426[var1 * 2] = (byte) (var2 >> 8);
            this.field2426[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field2427.write(this.field2426, 0, 512);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public final void method44(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2429 == null ? (field2429 = method823("javax.sound.sampled.SourceDataLine")) : field2429, this.field2428, arg0 * 2);
            this.field2427 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2427.open();
            this.field2427.start();
        } catch (LineUnavailableException var4) {
            this.field2427 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method823(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
