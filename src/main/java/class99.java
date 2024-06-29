import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class99 extends class53 {

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
    private int field2426;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field2427;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2424;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2423;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "[B")
    private byte[] field2425;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V")
    public final void method161(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2427 == null ? (field2427 = method818("javax.sound.sampled.SourceDataLine")) : field2427, this.field2424, arg0 << (class43.field949 ? 2 : 1));
            this.field2423 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2423.open();
            this.field2423.start();
            this.field2426 = arg0;
        } catch (LineUnavailableException var4) {
            if (class139.method1132(-492595358, arg0) == 1) {
                this.field2423 = null;
                throw var4;
            } else {
                this.method161(class65.method594(72, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()V")
    public final void method159() {
        this.field2423.flush();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method158(Component arg0) {
        this.field2424 = new AudioFormat((float) class1.field4, 16, class43.field949 ? 2 : 1, true, false);
        this.field2425 = new byte[0x100 << (class43.field949 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()V")
    public final void method162() {
        if (this.field2423 != null) {
            this.field2423.close();
            this.field2423 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
    public final void method157() {
        int var1 = 256;
        if (class43.field949) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1206[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2425[var2 * 2] = (byte) (var3 >> 8);
            this.field2425[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2423.write(this.field2425, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "()I")
    public final int method160() {
        return this.field2426 - (this.field2423.available() >> (class43.field949 ? 2 : 1));
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method818(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
