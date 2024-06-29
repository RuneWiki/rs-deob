import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class51 extends class94 {

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "[B")
    private byte[] field1361 = new byte[512];

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1360 = new AudioFormat(22050.0F, 16, 1, true, false);

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field1362;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1359;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 11)
    public final void method434(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1362 == null ? (field1362 = method525("javax.sound.sampled.SourceDataLine")) : field1362, this.field1360, arg0 * 2);
            this.field1359 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1359.open();
            this.field1359.start();
        } catch (LineUnavailableException var4) {
            this.field1359 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 11)
    public static Class method525(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "()I", line = 25)
    public final int method435() {
        return this.field1359.available() >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()V", line = 33)
    public final void method437() {
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = field2350[var1];
            if ((var2 + 8388608 & 0xFF000000) != 0) {
                var2 = var2 >> 31 ^ 0x7FFFFF;
            }
            this.field1361[var1 * 2] = (byte) (var2 >> 8);
            this.field1361[var1 * 2 + 1] = (byte) (var2 >> 16);
        }
        this.field1359.write(this.field1361, 0, 512);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 49)
    public class51() throws Exception {
        super(22050);
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "()V", line = 59)
    public final void method436() {
        if (this.field1359 != null) {
            this.field1359.close();
            this.field1359 = null;
        }
    }
}
