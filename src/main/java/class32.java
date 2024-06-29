import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class32 extends Canvas {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field480;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field488 = -1;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Z")
    public static boolean field489 = false;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Lah;")
    public static class176 field487;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "[[S")
    public static short[][] field484;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V", line = 4)
    public static void method268(boolean arg0) {
        field487 = null;
        field484 = (short[][]) null;
        if (!arg0) {
            method269(-96, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 18)
    public class32(Component arg0) {
        this.field480 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 27)
    public final void paint(Graphics arg0) {
        field486++;
        this.field480.paint(arg0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I[B)[B", line = 36)
    public static final byte[] method269(int arg0, byte[] arg1) {
        if (arg0 < 10) {
            return (byte[]) null;
        }
        field479++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class298.method2103(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dl", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 54)
    public final void update(Graphics arg0) {
        field481++;
        this.field480.update(arg0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)[F", line = 63)
    public static final float[] method270(int arg0) {
        field483++;
        float var1 = class234.method1611() + class234.method1612();
        int var2 = class234.method1613();
        class218.field3365[3] = 1.0F;
        float var3 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        float var4 = (float) ((var2 & 0xFFD1) >> 8) / 255.0F;
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class218.field3365[2] = class153.field2482[2] * var5 * var6 * var1;
        class218.field3365[0] = class153.field2482[0] * var3 * var6 * var1;
        class218.field3365[1] = class153.field2482[arg0] * var4 * var6 * var1;
        return class218.field3365;
    }
}
