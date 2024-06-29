import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class76 extends class51 {

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    private int field1870;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field1873;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1871;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1872;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "[B")
    private byte[] field1869;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
    public final void method493() {
        this.field1872.flush();
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
    public final void method496() {
        if (this.field1872 != null) {
            this.field1872.close();
            this.field1872 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method507(Component arg0) {
        this.field1871 = new AudioFormat((float) class124.field2762, 16, class125.field2774 ? 2 : 1, true, false);
        this.field1869 = new byte[0x100 << (class125.field2774 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()I")
    public final int method495() {
        return this.field1870 - (this.field1872.available() >> (class125.field2774 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()V")
    public final void method502() {
        int var1 = 256;
        if (class125.field2774) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1225[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1869[var2 * 2] = (byte) (var3 >> 8);
            this.field1869[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1872.write(this.field1869, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public final void method492(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1873 == null ? (field1873 = method690("javax.sound.sampled.SourceDataLine")) : field1873, this.field1871, arg0 << (class125.field2774 ? 2 : 1));
            this.field1872 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1872.open();
            this.field1872.start();
            this.field1870 = arg0;
        } catch (LineUnavailableException var4) {
            if (class93.method807(0, arg0) == 1) {
                this.field1872 = null;
                throw var4;
            } else {
                this.method492(class165.method1120(arg0, 121));
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method690(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
