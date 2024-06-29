import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 extends class50 {

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field2317;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2313;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2315;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "[B")
    private byte[] field2316;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "()I")
    public final int method384() {
        return this.field2314 - (this.field2315.available() >> (class38.field1048 ? 2 : 1));
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
    public final void method386(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2317 == null ? (field2317 = method696("javax.sound.sampled.SourceDataLine")) : field2317, this.field2313, arg0 << (class38.field1048 ? 2 : 1));
            this.field2315 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2315.open();
            this.field2315.start();
            this.field2314 = arg0;
        } catch (LineUnavailableException var4) {
            if (class12.method81(arg0, 20957) == 1) {
                this.field2315 = null;
                throw var4;
            } else {
                this.method386(class74.method559(arg0, false));
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method375(Component arg0) {
        this.field2313 = new AudioFormat((float) class37.field1007, 16, class38.field1048 ? 2 : 1, true, false);
        this.field2316 = new byte[0x100 << (class38.field1048 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()V")
    public final void method376() {
        int var1 = 256;
        if (class38.field1048) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1334[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2316[var2 * 2] = (byte) (var3 >> 8);
            this.field2316[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2315.write(this.field2316, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()V")
    public final void method380() {
        if (this.field2315 != null) {
            this.field2315.close();
            this.field2315 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
    public final void method372() {
        this.field2315.flush();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method696(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
