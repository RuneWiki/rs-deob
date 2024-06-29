import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class228 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "J")
    public long field4122 = 0L;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field4133 = 0;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Ljd;")
    public static class86 field4126 = class122.method868(" x ", true);

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Lrk;")
    public static class257 field4136 = new class257();

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Ljd;")
    public static class86 field4140 = class122.method868(")2", true);

    @OriginalMember(owner = "client!s", name = "v", descriptor = "Ljd;")
    public static class86 field4143 = class122.method868("weiss:", true);

    @OriginalMember(owner = "client!s", name = "w", descriptor = "J")
    public static long field4144 = 0L;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field4129;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public int field4131;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public int field4135;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public int field4137;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public int field4141;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "Lbj;")
    public static class151 field4139;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Leh;")
    public class80 field4134;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Z")
    public static boolean field4130;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1590(int arg0) {
        field4140 = null;
        field4139 = null;
        field4126 = null;
        field4143 = null;
        if (arg0 != -549119647) {
            method1590(-87);
        }
        field4136 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4132++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg0 - arg7;
        int var12 = arg2 - arg7;
        int var13 = arg2 * arg2;
        int var14 = arg0 * arg0;
        int var15 = var14 << 1;
        int var16 = var12 * var12;
        int var17 = var11 * var11;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var17 << 1;
        int var21 = var11 << 1;
        int var22 = arg0 << 1;
        int var23 = (1 - var21) * var16 + var20;
        int var24 = var14 - ((var22 - 1) * var18);
        int var25 = (1 - var22) * var13 + var15;
        int var26 = var13 << 2;
        if (arg1 < 99) {
            return;
        }
        int var27 = var17 - ((var21 - 1) * var19);
        int var28 = var17 << 2;
        int var29 = var15 * 3;
        int var30 = (var22 - 3) * var18;
        int var31 = (var21 - 3) * var19;
        int var32 = var20 * 3;
        int var33 = var14 << 2;
        int var34 = var33;
        int var35 = var28;
        int var36 = (arg0 - 1) * var26;
        int var37 = var16 << 2;
        int var38 = (var11 - 1) * var37;
        int[] var39 = class249.field4420[arg6];
        class56.method412(arg4, (byte) -108, arg3 - var12, var39, arg3 - arg2);
        class56.method412(arg5, (byte) -118, arg3 + var12, var39, arg3 - var12);
        class56.method412(arg4, (byte) -123, arg3 + arg2, var39, arg3 + var12);
        while (var9 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var25 += var29;
                    var29 += var33;
                    var24 += var34;
                    var34 += var33;
                    var8++;
                }
            }
            if (var24 < 0) {
                var8++;
                var25 += var29;
                var24 += var34;
                var34 += var33;
                var29 += var33;
            }
            var24 += -var30;
            boolean var40 = var9 <= var11;
            var25 += -var36;
            var30 -= var26;
            var9--;
            if (var40) {
                if (var23 < 0) {
                    while (var23 < 0) {
                        var23 += var32;
                        var32 += var28;
                        var27 += var35;
                        var35 += var28;
                        var10++;
                    }
                }
                if (var27 < 0) {
                    var23 += var32;
                    var32 += var28;
                    var27 += var35;
                    var35 += var28;
                    var10++;
                }
                var27 += -var31;
                var31 -= var37;
                var23 += -var38;
                var38 -= var37;
            }
            var36 -= var26;
            int var41 = arg6 + var9;
            int var42 = arg6 - var9;
            int var43 = arg3 - var8;
            int var44 = arg3 + var8;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = arg3 - var10;
                class56.method412(arg4, (byte) -105, var46, class249.field4420[var42], var43);
                class56.method412(arg5, (byte) -127, var45, class249.field4420[var42], var46);
                class56.method412(arg4, (byte) -113, var44, class249.field4420[var42], var45);
                class56.method412(arg4, (byte) -92, var46, class249.field4420[var41], var43);
                class56.method412(arg5, (byte) -124, var45, class249.field4420[var41], var46);
                class56.method412(arg4, (byte) -98, var44, class249.field4420[var41], var45);
            } else {
                class56.method412(arg4, (byte) -95, var44, class249.field4420[var42], var43);
                class56.method412(arg4, (byte) -100, var44, class249.field4420[var41], var43);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILgj;I)V")
    public static final void method1592(int arg0, int arg1, class224 arg2, int arg3) {
        if (arg2.field683 == arg3 && arg3 != -1) {
            class122 var4 = class133.method952(arg3, 127);
            int var5 = var4.field2360;
            if (var5 == 1) {
                arg2.field715 = 0;
                arg2.field708 = 0;
                arg2.field724 = arg0;
                arg2.field695 = 0;
                class168.method1212(arg2.field676, arg2.field708, class124.field2412 == arg2, var4, 1928670186, arg2.field685);
            }
            if (var5 == 2) {
                arg2.field715 = 0;
            }
        } else if (arg3 == -1 || arg2.field683 == -1 || class133.method952(arg3, 127).field2373 >= class133.method952(arg2.field683, 127).field2373) {
            arg2.field742 = arg2.field704;
            arg2.field708 = 0;
            arg2.field715 = 0;
            arg2.field683 = arg3;
            arg2.field724 = arg0;
            arg2.field695 = 0;
            if (arg2.field683 != -1) {
                class168.method1212(arg2.field676, arg2.field708, class124.field2412 == arg2, class133.method952(arg2.field683, 127), 1928670186, arg2.field685);
            }
        }
        int var6 = -89 % ((arg1 - 21) / 55);
        field4124++;
    }
}
