import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class101 extends class50 {

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    private int field2524;

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "Ljava/lang/Class;")
    public static Class field2526;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2522;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2523;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "[B")
    private byte[] field2525;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()I")
    public final int method397() {
        return this.field2524 - (this.field2523.available() >> (class20.field568 ? 2 : 1));
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method412(Component arg0) {
        this.field2522 = new AudioFormat((float) class48.field1282, 16, class20.field568 ? 2 : 1, true, false);
        this.field2525 = new byte[0x100 << (class20.field568 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public final void method403(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2526 == null ? (field2526 = method815("javax.sound.sampled.SourceDataLine")) : field2526, this.field2522, arg0 << (class20.field568 ? 2 : 1));
            this.field2523 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2523.open();
            this.field2523.start();
            this.field2524 = arg0;
        } catch (LineUnavailableException var4) {
            if (class111.method899(arg0, false) == 1) {
                this.field2523 = null;
                throw var4;
            } else {
                this.method403(class151.method1220(arg0, false));
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()V")
    public final void method406() {
        this.field2523.flush();
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()V")
    public final void method398() {
        int var1 = 256;
        if (class20.field568) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1319[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2525[var2 * 2] = (byte) (var3 >> 8);
            this.field2525[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2523.write(this.field2525, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "()V")
    public final void method408() {
        if (this.field2523 != null) {
            this.field2523.close();
            this.field2523 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method815(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
