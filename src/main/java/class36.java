import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class36 extends class35 {

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field860;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field857;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field859;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "[B")
    private byte[] field858;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/awt/Component;IZ)V", line = 9)
    public final void method303(Component arg0, int arg1, boolean arg2) {
        class4.field55 = arg1;
        class45.field1098 = arg2;
        this.field857 = new AudioFormat((float) class4.field55, 16, class45.field1098 ? 2 : 1, true, false);
        this.field858 = new byte[0x100 << (class45.field1098 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()V", line = 24)
    public final void method297() {
        int var1 = 256;
        if (class45.field1098) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = field843[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field858[var2 * 2] = (byte) (var3 >> 8);
            this.field858[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field859.write(this.field858, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "()V", line = 58)
    public final void method302() {
        if (this.field859 != null) {
            this.field859.close();
            this.field859 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()I", line = 74)
    public final int method293() {
        return this.field859.available() >> (class45.field1098 ? 2 : 1);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 83)
    public final void method300(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field860 == null ? (field860 = method305("javax.sound.sampled.SourceDataLine")) : field860, this.field857, arg0 << (class45.field1098 ? 2 : 1));
            this.field859 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field859.open();
            this.field859.start();
        } catch (LineUnavailableException var4) {
            this.field859 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 83)
    public static Class method305(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
