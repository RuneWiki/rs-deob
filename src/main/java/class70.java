import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class70 extends class210 {

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field1337;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1335;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1336;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "[B")
    private byte[] field1333;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
    public final void method415() {
        this.field1336.flush();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
    public final void method416() {
        int var1 = 256;
        if (class120.field2167) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4041[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1333[var2 * 2] = (byte) (var3 >> 8);
            this.field1333[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1336.write(this.field1333, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()I")
    public final int method417() {
        return this.field1334 - (this.field1336.available() >> (class120.field2167 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method418(Component arg0) {
        this.field1335 = new AudioFormat((float) class210.field4018, 16, class120.field2167 ? 2 : 1, true, false);
        this.field1333 = new byte[0x100 << (class120.field2167 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
    public final void method419() {
        if (this.field1336 != null) {
            this.field1336.close();
            this.field1336 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public final void method420(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1337 == null ? (field1337 = method421("javax.sound.sampled.SourceDataLine")) : field1337, this.field1335, arg0 << (class120.field2167 ? 2 : 1));
            this.field1336 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1336.open();
            this.field1336.start();
            this.field1334 = arg0;
        } catch (LineUnavailableException var4) {
            if (class150.method916(arg0, -21050) == 1) {
                this.field1336 = null;
                throw var4;
            } else {
                this.method420(class112.method692(arg0, (byte) -23));
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method421(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
