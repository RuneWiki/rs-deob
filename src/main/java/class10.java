import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class10 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field81 = 64;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Z")
    public static boolean field83 = false;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field80 = 0;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field86 = 0;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Ljava/awt/Image;")
    public static Image field84;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([FZ)[F", line = 5)
    public static final float[] method40(float[] arg0, boolean arg1) {
        if (!arg1) {
            method41(80);
        }
        field87++;
        if (arg0 == null) {
            return null;
        } else {
            float[] var2 = new float[arg0.length];
            class242.method1846(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 24)
    public static void method41(int arg0) {
        field84 = null;
        if (arg0 != 0) {
            method42(-17, 33, -39);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V", line = 35)
    public static final void method42(int arg0, int arg1, int arg2) {
        field85++;
        class122.field2096 = class235.field3904[arg2][arg1].field2870;
        class111.field1811 = class235.field3904[arg2][arg1].field2876;
        class98.field1634 = class235.field3904[arg2][arg1].field2863;
        class167.method1297((float) class122.field2096, (float) class111.field1811, (float) class98.field1634);
        if (arg0 != -11887) {
            field84 = (Image) null;
        }
    }
}
