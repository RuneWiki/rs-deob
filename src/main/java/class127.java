import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class127 extends class80 {

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    private int field2880;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "Ljava/lang/Class;")
    public static Class field2883;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2881;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2879;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "[B")
    private byte[] field2882;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "()V")
    public final void method617() {
        if (this.field2879 != null) {
            this.field2879.close();
            this.field2879 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "()V")
    public final void method622() {
        int var1 = 256;
        if (class38.field922) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1968[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2882[var2 * 2] = (byte) (var3 >> 8);
            this.field2882[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2879.write(this.field2882, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()I")
    public final int method616() {
        return this.field2880 - (this.field2879.available() >> (class38.field922 ? 2 : 1));
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public final void method607() {
        this.field2879.flush();
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public final void method620(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2883 == null ? (field2883 = method961("javax.sound.sampled.SourceDataLine")) : field2883, this.field2881, arg0 << (class38.field922 ? 2 : 1));
            this.field2879 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2879.open();
            this.field2879.start();
            this.field2880 = arg0;
        } catch (LineUnavailableException var4) {
            if (class28.method214(858993459, arg0) == 1) {
                this.field2879 = null;
                throw var4;
            } else {
                this.method620(class19.method159(-473856792, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method613(Component arg0) {
        this.field2881 = new AudioFormat((float) class134.field3037, 16, class38.field922 ? 2 : 1, true, false);
        this.field2882 = new byte[0x100 << (class38.field922 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method961(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
