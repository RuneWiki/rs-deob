import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class185 extends class194 {

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    private int field3629;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field3630;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3628;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3627;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "[B")
    private byte[] field3626;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1135(Component arg0) {
        this.field3628 = new AudioFormat((float) class48.field1163, 16, class143.field2934 ? 2 : 1, true, false);
        this.field3626 = new byte[0x100 << (class143.field2934 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()I")
    public final int method1136() {
        return this.field3629 - (this.field3627.available() >> (class143.field2934 ? 2 : 1));
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()V")
    public final void method1137() {
        int var1 = 256;
        if (class143.field2934) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3843[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3626[var2 * 2] = (byte) (var3 >> 8);
            this.field3626[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3627.write(this.field3626, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public final void method1138(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3630 == null ? (field3630 = method1141("javax.sound.sampled.SourceDataLine")) : field3630, this.field3628, arg0 << (class143.field2934 ? 2 : 1));
            this.field3627 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3627.open();
            this.field3627.start();
            this.field3629 = arg0;
        } catch (LineUnavailableException var4) {
            if (class117.method740(arg0, (byte) -39) == 1) {
                this.field3627 = null;
                throw var4;
            } else {
                this.method1138(class68.method502(arg0, -28875));
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "()V")
    public final void method1139() {
        if (this.field3627 != null) {
            this.field3627.close();
            this.field3627 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "()V")
    public final void method1140() {
        this.field3627.flush();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1141(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
