import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 extends class155 {

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field893;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field890;

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field892;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "[B")
    private byte[] field891;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()V")
    public final void method271() {
        int var1 = 256;
        if (class144.field3258) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3514[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field891[var2 * 2] = (byte) (var3 >> 8);
            this.field891[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field892.write(this.field891, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public final void method272(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field893 == null ? (field893 = method277("javax.sound.sampled.SourceDataLine")) : field893, this.field890, arg0 << (class144.field3258 ? 2 : 1));
            this.field892 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field892.open();
            this.field892.start();
            this.field889 = arg0;
        } catch (LineUnavailableException var4) {
            if (class146.method1117(false, arg0) == 1) {
                this.field892 = null;
                throw var4;
            } else {
                this.method272(class10.method66(-128, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
    public final void method273() {
        if (this.field892 != null) {
            this.field892.close();
            this.field892 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()I")
    public final int method274() {
        return this.field889 - (this.field892.available() >> (class144.field3258 ? 2 : 1));
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
    public final void method275() {
        this.field892.flush();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method276(Component arg0) {
        this.field890 = new AudioFormat((float) class14.field318, 16, class144.field3258 ? 2 : 1, true, false);
        this.field891 = new byte[0x100 << (class144.field3258 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method277(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
