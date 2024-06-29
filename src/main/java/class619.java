import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class619 {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[I")
    public static int[] field8757 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field8759;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field8754;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3452(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field8754 = null;
        }
        field8753++;
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3453(boolean arg0, int arg1) {
        field8755++;
        if (arg0) {
            return arg1 == 0 || arg1 == 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method3454(int arg0) {
        field8757 = null;
        if (arg0 >= -61) {
            field8754 = null;
        }
        field8754 = null;
        field8759 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)I")
    public static final int method3455(int arg0, int arg1, int arg2, int arg3) {
        field8758++;
        if (arg1 != 22610) {
            method3454(29);
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }
}
