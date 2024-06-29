import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 extends class92 {

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    private int field2250;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field2253;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2251;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2252;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "[B")
    private byte[] field2249;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method283(Component arg0) {
        this.field2251 = new AudioFormat((float) class49.field920, 16, class73.field1624 ? 2 : 1, true, false);
        this.field2249 = new byte[0x100 << (class73.field1624 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "()V")
    public final void method281() {
        int var1 = 256;
        if (class73.field1624) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2078[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2249[var2 * 2] = (byte) (var3 >> 8);
            this.field2249[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2252.write(this.field2249, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "()V")
    public final void method286() {
        this.field2252.flush();
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "()V")
    public final void method285() {
        if (this.field2252 != null) {
            this.field2252.close();
            this.field2252 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public final void method280(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2253 == null ? (field2253 = method750("javax.sound.sampled.SourceDataLine")) : field2253, this.field2251, arg0 << (class73.field1624 ? 2 : 1));
            this.field2252 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2252.open();
            this.field2252.start();
            this.field2250 = arg0;
        } catch (LineUnavailableException var4) {
            if (class86.method640(arg0, (byte) 77) == 1) {
                this.field2252 = null;
                throw var4;
            } else {
                this.method280(class90.method701(-1953860478, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()I")
    public final int method284() {
        return this.field2250 - (this.field2252.available() >> (class73.field1624 ? 2 : 1));
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method750(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
