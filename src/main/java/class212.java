import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class212 extends class174 {

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    private int field4166;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field4169;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4165;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4168;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "[B")
    private byte[] field4167;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4169 == null ? (field4169 = method1382("javax.sound.sampled.SourceDataLine")) : field4169, this.field4165, arg0 << (class109.field2419 ? 2 : 1));
            this.field4168 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4168.open();
            this.field4168.start();
            this.field4166 = arg0;
        } catch (LineUnavailableException var4) {
            if (class35.method353(252645135, arg0) == 1) {
                this.field4168 = null;
                throw var4;
            } else {
                this.method848(class20.method175(8237, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "()V")
    public final void method854() {
        if (this.field4168 != null) {
            this.field4168.close();
            this.field4168 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()V")
    public final void method849() {
        int var1 = 256;
        if (class109.field2419) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3527[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4167[var2 * 2] = (byte) (var3 >> 8);
            this.field4167[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4168.write(this.field4167, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()V")
    public final void method851() {
        this.field4168.flush();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method853(Component arg0) {
        this.field4165 = new AudioFormat((float) class150.field3136, 16, class109.field2419 ? 2 : 1, true, false);
        this.field4167 = new byte[0x100 << (class109.field2419 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "()I")
    public final int method850() {
        return this.field4166 - (this.field4168.available() >> (class109.field2419 ? 2 : 1));
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1382(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
