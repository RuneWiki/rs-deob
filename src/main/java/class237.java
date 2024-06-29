import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class237 {

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3569 = "red:";

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Z")
    public static boolean field3573 = false;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field3575 = 0;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3566 = "yellow:";

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field3579 = 0;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "[S")
    public static short[] field3578;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILkl;I)V")
    private final void method1552(int arg0, class114 arg1, int arg2) {
        field3571++;
        if (~arg2 == arg0) {
            this.field3576 = arg1.method756(-29901);
            this.field3570 = arg1.method760(false);
            this.field3572 = arg1.method760(false);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lkl;B)V")
    public final void method1553(class114 arg0, byte arg1) {
        if (arg1 != -38) {
            return;
        }
        field3577++;
        while (true) {
            int var3 = arg0.method760(false);
            if (var3 == 0) {
                return;
            }
            this.method1552(arg1 + 36, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Lik;")
    public static final class225 method1554(int arg0) {
        if (arg0 == -10064) {
            field3568++;
            return class70.field1099;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method1555(byte arg0) {
        if (arg0 <= -108) {
            field3569 = null;
            field3578 = null;
            field3566 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V")
    public static final void method1556(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -22059) {
            return;
        }
        for (int var5 = 0; var5 < class220.field3252; var5++) {
            if (arg0 < (class99.field1480[var5] + class263.field3964[var5]) && class99.field1480[var5] < arg0 + arg4 && arg1 < class1.field4[var5] + class109.field1579[var5] && class1.field4[var5] < arg1 + arg2) {
                class21.field278[var5] = true;
            }
        }
        field3567++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lve;III)Llk;")
    public static final class244 method1557(class233 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            field3574++;
            return class110.method718(arg0, (byte) -117, arg1, arg2) ? class166.method1106(119) : null;
        } else {
            return null;
        }
    }
}
