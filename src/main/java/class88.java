import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class88 extends class206 {

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field1557;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1553;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1556;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "[B")
    private byte[] field1554;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()V")
    public final void method538() {
        this.field1556.flush();
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public final void method539(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1557 == null ? (field1557 = method544("javax.sound.sampled.SourceDataLine")) : field1557, this.field1553, arg0 << (class29.field437 ? 2 : 1));
            this.field1556 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1556.open();
            this.field1556.start();
            this.field1555 = arg0;
        } catch (LineUnavailableException var4) {
            if (class34.method221(arg0, true) == 1) {
                this.field1556 = null;
                throw var4;
            } else {
                this.method539(class13.method85(arg0, 76));
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
    public final void method540() {
        if (this.field1556 != null) {
            this.field1556.close();
            this.field1556 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()V")
    public final void method541() {
        int var1 = 256;
        if (class29.field437) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4007[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1554[var2 * 2] = (byte) (var3 >> 8);
            this.field1554[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1556.write(this.field1554, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()I")
    public final int method542() {
        return this.field1555 - (this.field1556.available() >> (class29.field437 ? 2 : 1));
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method543(Component arg0) {
        this.field1553 = new AudioFormat((float) class57.field1003, 16, class29.field437 ? 2 : 1, true, false);
        this.field1554 = new byte[0x100 << (class29.field437 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method544(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
