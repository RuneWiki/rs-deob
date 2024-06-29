import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class136 extends class18 {

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    private int field3123;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field3125;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3124;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3121;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "[B")
    private byte[] field3122;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public final void method128(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3125 == null ? (field3125 = method1044("javax.sound.sampled.SourceDataLine")) : field3125, this.field3124, arg0 << (class7.field105 ? 2 : 1));
            this.field3121 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3121.open();
            this.field3121.start();
            this.field3123 = arg0;
        } catch (LineUnavailableException var4) {
            if (class152.method1181(117, arg0) == 1) {
                this.field3121 = null;
                throw var4;
            } else {
                this.method128(class30.method236(arg0, 118));
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
    public final void method129() {
        if (this.field3121 != null) {
            this.field3121.close();
            this.field3121 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()V")
    public final void method130() {
        int var1 = 256;
        if (class7.field105) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field370[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3122[var2 * 2] = (byte) (var3 >> 8);
            this.field3122[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3121.write(this.field3122, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()V")
    public final void method131() {
        this.field3121.flush();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()I")
    public final int method127() {
        return this.field3123 - (this.field3121.available() >> (class7.field105 ? 2 : 1));
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method133(Component arg0) {
        this.field3124 = new AudioFormat((float) class140.field3224, 16, class7.field105 ? 2 : 1, true, false);
        this.field3122 = new byte[0x100 << (class7.field105 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1044(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
