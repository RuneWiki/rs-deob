import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class511 extends class17 {

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "Z")
    public static boolean field7565 = false;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "Leh;")
    public static class246 field7566 = new class246(53, -2);

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "I")
    public static int field7567 = 0;

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "Z")
    public static boolean field7569 = true;

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "Ltn;")
    public static class60 field7568 = new class60(58, 7);

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!lu", name = "F", descriptor = "[I")
    public static int[] field7559;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)V")
    public static final void method3048(int arg0, int arg1) {
        class346.field5017 = false;
        class463.field6473 = arg0;
        ++field7564;
        class464.field6495 = -1;
        if (arg1 != 16012) {
            field7566 = null;
        }
        class234.field3410 = null;
        class15.field189 = 1;
        class123.field1680 = -1;
        class102.field1358 = 0;
    }

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "(I)V")
    public static void method3049(int arg0) {
        if (arg0 > -74) {
            method3051(-105, -85, -52, -107, -3);
        }
        field7566 = null;
        field7568 = null;
        field7559 = null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljd;B)Z")
    public static final boolean method3050(class156 arg0, byte arg1) {
        ++field7563;
        if (arg1 != 54) {
            field7559 = null;
        }
        if (arg0 == null) {
            return false;
        } else if (!arg0.field2315) {
            return false;
        } else if (!arg0.method1004(false, class245.field3548)) {
            return false;
        } else if (class403.field5681.method2405((long) arg0.field2350, -99) != null) {
            return false;
        } else {
            return class135.field1766.method2405((long) arg0.field2332, -29) == null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
    public class511() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field7562;
        if (arg1 <= 53) {
            this.method27(122, 94);
        }
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            class182.method1137(var3, 0, class530.field7763, class40.field427[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIII)V")
    public static final void method3051(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7561;
        int var5 = -122 / ((arg1 - 50) / 36);
        int var6 = 0;
        int var7 = arg4;
        int var8 = -arg4;
        class447.method2605(-7, arg3 - arg4, arg2, arg3 + arg4, class112.field1523[arg0]);
        int var9 = -1;
        while (~var7 < ~var6) {
            var9 += 2;
            var8 += var9;
            ++var6;
            if (var8 >= 0) {
                --var7;
                var8 -= var7 << 1;
                int[] var10 = class112.field1523[arg0 + var7];
                int[] var11 = class112.field1523[-var7 + arg0];
                int var12 = arg3 + var6;
                int var13 = arg3 - var6;
                class447.method2605(-7, var13, arg2, var12, var10);
                class447.method2605(-7, var13, arg2, var12, var11);
            }
            int var14 = arg3 + var7;
            int var15 = -var7 + arg3;
            int[] var16 = class112.field1523[arg0 + var6];
            int[] var17 = class112.field1523[-var6 + arg0];
            class447.method2605(-7, var15, arg2, var14, var16);
            class447.method2605(-7, var15, arg2, var14, var17);
        }
    }
}
