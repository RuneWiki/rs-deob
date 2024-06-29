import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class477 extends class449 {

    @OriginalMember(owner = "client!io", name = "q", descriptor = "Lap;")
    public static class310 field6758 = new class310(0, 4);

    @OriginalMember(owner = "client!io", name = "R", descriptor = "Lch;")
    public static class151 field6784 = new class151("M", "M", "M", "M");

    @OriginalMember(owner = "client!io", name = "S", descriptor = "Lor;")
    public static class275 field6785 = null;

    @OriginalMember(owner = "client!io", name = "T", descriptor = "Z")
    public static boolean field6786 = false;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public int field6760;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public int field6761;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public int field6762;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public int field6763;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    public int field6764;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "I")
    public int field6765;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "I")
    public int field6766;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    public int field6768;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "I")
    public int field6769;

    @OriginalMember(owner = "client!io", name = "D", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    public int field6773;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    public int field6774;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "I")
    public int field6775;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public int field6778;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public int field6779;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!io", name = "O", descriptor = "I")
    public int field6781;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "I")
    public int field6782;

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "I")
    public int field6783;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "Llr;")
    public class215 field6759;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "Lgn;")
    public class368 field6770;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "Lqq;")
    public class44 field6767;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "Lig;")
    public class83 field6777;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
    public static final void method2823(boolean arg0) {
        class263.field3787 = new class172[class38.field479.method2658(-1)][];
        field6771++;
        if (arg0) {
            class340.field4698 = new boolean[class38.field479.method2658(-1)];
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
    public final void method2824(boolean arg0) {
        this.field6777 = null;
        field6780++;
        this.field6759 = null;
        if (!arg0) {
            method2825((byte) -49);
        }
        this.field6770 = null;
        this.field6767 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public static void method2825(byte arg0) {
        field6784 = null;
        field6758 = null;
        if (arg0 != 93) {
            method2825((byte) -115);
        }
        field6785 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IZIII)Lra;")
    public static final class249 method2826(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field6776++;
        class249 var5 = new class249();
        var5.field3593 = arg0;
        var5.field3591 = arg3;
        class310.field4399.method1100(var5, -115, (long) arg4);
        class110.method878(arg0, true);
        if (arg2 != -741861886) {
            field6786 = true;
        }
        class172 var6 = class361.method2217(arg4, -1060820048);
        if (var6 != null) {
            class184.method1314(var6, arg2 + 741861994);
        }
        if (class315.field4453 != null) {
            class184.method1314(class315.field4453, 105);
            class315.field4453 = null;
        }
        class257.method1739(-24);
        if (var6 != null) {
            class110.method877(var6, !arg1, -1);
        }
        if (!arg1) {
            class457.method2740(arg0);
        }
        if (!arg1 && class238.field3475 != -1) {
            class225.method1533(16, 1, class238.field3475);
        }
        return var5;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6772++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg1 - arg0;
        int var12 = arg5 - arg0;
        int var13 = arg1 * arg1;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        if (arg7 <= 54) {
            method2827(-48, 91, -82, 92, -115, 19, 99, -29);
        }
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class373.field5141[arg2];
        class61.method558(arg3 - var11, -10647, var39, arg3 - arg1, arg4);
        class61.method558(arg3 + var11, -10647, var39, arg3 - var11, arg6);
        class61.method558(arg1 + arg3, -10647, var39, arg3 + var11, arg4);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var36 -= var27;
            var32 -= var27;
            int var41 = arg2 - var9;
            int var42 = arg2 + var9;
            int var43 = arg3 + var8;
            int var44 = arg3 - var8;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = arg3 - var10;
                class61.method558(var46, -10647, class373.field5141[var41], var44, arg4);
                class61.method558(var45, -10647, class373.field5141[var41], var46, arg6);
                class61.method558(var43, -10647, class373.field5141[var41], var45, arg4);
                class61.method558(var46, -10647, class373.field5141[var42], var44, arg4);
                class61.method558(var45, -10647, class373.field5141[var42], var46, arg6);
                class61.method558(var43, -10647, class373.field5141[var42], var45, arg4);
            } else {
                class61.method558(var43, -10647, class373.field5141[var41], var44, arg4);
                class61.method558(var43, -10647, class373.field5141[var42], var44, arg4);
            }
        }
    }
}
