import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class223 extends class46 {

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "[I")
    public static int[] field3548 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "Z")
    public static boolean field3550 = false;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Ll;")
    public static class133 field3543;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "[[[I")
    public static int[][][] field3545;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)Lfl;", line = 11)
    public static final class50 method1581(int arg0, int arg1) {
        class50 var2 = (class50) class241.field3856.method2179(false, (long) arg0);
        field3544++;
        if (var2 != null) {
            return var2;
        } else if (arg1 == -28950) {
            byte[] var3 = class192.field2882.method980(1, arg0, 5);
            class50 var4 = new class50();
            if (var3 != null) {
                var4.method420(-13138, arg0, new class166(var3));
            }
            class241.field3856.method2173(var4, true, (long) arg0);
            return var4;
        } else {
            return (class50) null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V", line = 37)
    public static void method1582(int arg0) {
        int var1 = -10 / ((29 - arg0) / 61);
        field3545 = (int[][][]) null;
        field3543 = null;
        field3548 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Lve;", line = 59)
    public static final class279 method1583(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class279 var4 = var3.field2196;
            var3.field2196 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(II)V", line = 68)
    public class223(int arg0, int arg1) {
        this.field3547 = arg1;
        this.field3546 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)I", line = 86)
    public static final int method1584(int arg0, int arg1, int arg2, int arg3) {
        field3549++;
        int var4 = arg3 & 0x3;
        if (arg0 == var4) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }
}
