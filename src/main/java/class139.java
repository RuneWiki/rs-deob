import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class139 extends class37 {

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field3327;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3325;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3326;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "[B")
    private byte[] field3324;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "()V")
    public final void method264() {
        if (this.field3326 != null) {
            this.field3326.close();
            this.field3326 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
    public final void method266(Component arg0, int arg1, boolean arg2) {
        class106.field2447 = arg2;
        class52.field1106 = arg1;
        this.field3325 = new AudioFormat((float) class52.field1106, 16, class106.field2447 ? 2 : 1, true, false);
        this.field3324 = new byte[0x100 << (class106.field2447 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()I")
    public final int method262() {
        return this.field3326.available() >> (class106.field2447 ? 2 : 1);
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "()V")
    public final void method268() {
        int var1 = 256;
        if (class106.field2447) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = field779[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3324[var2 * 2] = (byte) (var3 >> 8);
            this.field3324[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3326.write(this.field3324, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public final void method260(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3327 == null ? (field3327 = method1113("javax.sound.sampled.SourceDataLine")) : field3327, this.field3325, arg0 << (class106.field2447 ? 2 : 1));
            this.field3326 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3326.open();
            this.field3326.start();
        } catch (LineUnavailableException var4) {
            this.field3326 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1113(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
