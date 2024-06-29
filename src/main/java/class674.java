import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class674 {

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "[I")
    public static int[] field9677 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "[[I")
    public static int[][] field9680 = new int[128][128];

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field9678 = new Hashtable();

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "I")
    public static int field9679;

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "Llo;")
    public static class699 field9674;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIZIII)Z")
    public static final boolean method3833(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field9673++;
        int var9 = class206.field2472.field2689[0];
        int var10 = class206.field2472.field2686[0];
        if (var9 < 0 || var9 >= class473.field6604 || var10 < 0 || var10 >= class205.field2465) {
            return false;
        } else if (~arg2 <= arg1 && class473.field6604 > arg2 && arg7 >= 0 && arg7 < class205.field2465) {
            int var11 = class564.method3297(arg5, (byte) -11, arg2, arg7, class206.field2472.method1284((byte) -124), class349.field4642[class206.field2472.field532], class190.field2322, var10, arg8, class566.field8283, var9, arg3, arg4, arg0, arg6);
            if (var11 < 1) {
                return false;
            }
            class432.field6201 = class190.field2322[var11 - 1];
            class147.field1798 = class566.field8283[var11 - 1];
            class276.field3775 = false;
            class561.method3278(arg1 + 1);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z)V")
    public static final void method3834(boolean arg0) {
        if (!arg0) {
            field9675 = -125;
        }
        class656.field9311.method3242(59);
        field9676++;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
    public static void method3835(int arg0) {
        field9677 = null;
        if (arg0 != -10258) {
            field9675 = -42;
        }
        field9674 = null;
        field9680 = null;
        field9678 = null;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIB)V")
    public static final void method3836(int arg0, int arg1, byte arg2) {
        field9681++;
        class618 var3 = class562.field8128[arg0][arg1];
        if (var3 != null) {
            class19.field523 = var3.field8861;
            class665.field9408 = var3.field8877;
            class681.field9751 = var3.field8862;
        }
        class573.method3356(-70);
        if (arg2 != 120) {
            field9678 = null;
        }
    }
}
