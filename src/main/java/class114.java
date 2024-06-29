import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class114 extends class3 {

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    private int field2664;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field2666;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2665;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2662;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "[B")
    private byte[] field2663;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()I")
    public final int method24() {
        return this.field2664 - (this.field2662.available() >> (class87.field2075 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()V")
    public final void method27() {
        int var1 = 256;
        if (class87.field2075) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field63[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2663[var2 * 2] = (byte) (var3 >> 8);
            this.field2663[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2662.write(this.field2663, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method30(Component arg0) {
        this.field2665 = new AudioFormat((float) class126.field2922, 16, class87.field2075 ? 2 : 1, true, false);
        this.field2663 = new byte[0x100 << (class87.field2075 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
    public final void method28() {
        if (this.field2662 != null) {
            this.field2662.close();
            this.field2662 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public final void method26(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2666 == null ? (field2666 = method887("javax.sound.sampled.SourceDataLine")) : field2666, this.field2665, arg0 << (class87.field2075 ? 2 : 1));
            this.field2662 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2662.open();
            this.field2662.start();
            this.field2664 = arg0;
        } catch (LineUnavailableException var4) {
            if (class159.method1228(-12062, arg0) == 1) {
                this.field2662 = null;
                throw var4;
            } else {
                this.method26(class89.method707(110, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
    public final void method16() {
        this.field2662.flush();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method887(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
