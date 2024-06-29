import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class87 extends class51 {

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field2066;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2065;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2063;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "[B")
    private byte[] field2064;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
    public final void method152(Component arg0, int arg1, boolean arg2) {
        class85.field2025 = arg1;
        class121.field2826 = arg2;
        this.field2065 = new AudioFormat((float) class85.field2025, 16, class121.field2826 ? 2 : 1, true, false);
        this.field2064 = new byte[0x100 << (class121.field2826 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()I")
    public final int method153() {
        return this.field2063.available() >> (class121.field2826 ? 2 : 1);
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
    public final void method149() {
        int var1 = 256;
        if (class121.field2826) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = field1132[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2064[var2 * 2] = (byte) (var3 >> 8);
            this.field2064[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2063.write(this.field2064, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "()V")
    public final void method151() {
        if (this.field2063 != null) {
            this.field2063.close();
            this.field2063 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
    public final void method150(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2066 == null ? (field2066 = method640("javax.sound.sampled.SourceDataLine")) : field2066, this.field2065, arg0 << (class121.field2826 ? 2 : 1));
            this.field2063 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2063.open();
            this.field2063.start();
        } catch (LineUnavailableException var4) {
            this.field2063 = null;
            throw var4;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method640(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
