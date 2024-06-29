import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 extends class132 {

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    private int field1135;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field1138;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1136;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1134;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "[B")
    private byte[] field1137;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "()V")
    public final void method397() {
        if (this.field1134 != null) {
            this.field1134.close();
            this.field1134 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()I")
    public final int method398() {
        return this.field1135 - (this.field1134.available() >> (class41.field765 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method399(Component arg0) {
        this.field1136 = new AudioFormat((float) class84.field1873, 16, class41.field765 ? 2 : 1, true, false);
        this.field1137 = new byte[0x100 << (class41.field765 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
    public final void method400() {
        this.field1134.flush();
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public final void method401(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1138 == null ? (field1138 = method403("javax.sound.sampled.SourceDataLine")) : field1138, this.field1136, arg0 << (class41.field765 ? 2 : 1));
            this.field1134 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1134.open();
            this.field1134.start();
            this.field1135 = arg0;
        } catch (LineUnavailableException var4) {
            if (class103.method821(arg0, (byte) -25) == 1) {
                this.field1134 = null;
                throw var4;
            } else {
                this.method401(class42.method274(0, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()V")
    public final void method402() {
        int var1 = 256;
        if (class41.field765) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2895[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1137[var2 * 2] = (byte) (var3 >> 8);
            this.field1137[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1134.write(this.field1137, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method403(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
