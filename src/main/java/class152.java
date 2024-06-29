import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class152 extends class73 {

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "I")
    private int field3082;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field3084;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3080;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3083;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "[B")
    private byte[] field3081;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method452(Component arg0) {
        this.field3080 = new AudioFormat((float) class38.field726, 16, class88.field1708 ? 2 : 1, true, false);
        this.field3081 = new byte[0x100 << (class88.field1708 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V")
    public final void method457(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3084 == null ? (field3084 = method961("javax.sound.sampled.SourceDataLine")) : field3084, this.field3080, arg0 << (class88.field1708 ? 2 : 1));
            this.field3083 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3083.open();
            this.field3083.start();
            this.field3082 = arg0;
        } catch (LineUnavailableException var4) {
            if (class116.method736(-15299220, arg0) == 1) {
                this.field3083 = null;
                throw var4;
            } else {
                this.method457(class145.method915(arg0, -16431));
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "()V")
    public final void method453() {
        int var1 = 256;
        if (class88.field1708) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1419[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3081[var2 * 2] = (byte) (var3 >> 8);
            this.field3081[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3083.write(this.field3081, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "()V")
    public final void method454() {
        if (this.field3083 != null) {
            this.field3083.close();
            this.field3083 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()V")
    public final void method447() {
        this.field3083.flush();
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()I")
    public final int method451() {
        return this.field3082 - (this.field3083.available() >> (class88.field1708 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method961(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
