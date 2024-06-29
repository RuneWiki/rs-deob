import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class122 extends class123 {

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    private int field2465;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field2467;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2463;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2464;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "[B")
    private byte[] field2466;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "()I")
    public final int method558() {
        return this.field2465 - (this.field2464.available() >> (class76.field1583 ? 2 : 1));
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method557(Component arg0) {
        this.field2463 = new AudioFormat((float) class175.field3378, 16, class76.field1583 ? 2 : 1, true, false);
        this.field2466 = new byte[0x100 << (class76.field1583 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "()V")
    public final void method555() {
        this.field2464.flush();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
    public final void method561() {
        if (this.field2464 != null) {
            this.field2464.close();
            this.field2464 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public final void method559(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2467 == null ? (field2467 = method817("javax.sound.sampled.SourceDataLine")) : field2467, this.field2463, arg0 << (class76.field1583 ? 2 : 1));
            this.field2464 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2464.open();
            this.field2464.start();
            this.field2465 = arg0;
        } catch (LineUnavailableException var4) {
            if (class104.method711(arg0, (byte) 125) == 1) {
                this.field2464 = null;
                throw var4;
            } else {
                this.method559(class130.method857((byte) 118, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()V")
    public final void method560() {
        int var1 = 256;
        if (class76.field1583) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2478[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2466[var2 * 2] = (byte) (var3 >> 8);
            this.field2466[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2464.write(this.field2466, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method817(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
