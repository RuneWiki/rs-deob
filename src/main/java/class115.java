import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class115 {

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Z")
    public static boolean field1984 = false;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "Lqk;")
    public static class207 field1998 = class24.method212(255, "null");

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lbf;")
    public static class199 field1993 = new class199(64);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public int field1978;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public int field1980;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public int field1996;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public int field2004;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Luh;")
    public static class100 field1987;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Lmd;")
    public static class220 field1991;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "Ldk;")
    public static class275 field2002;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Llk;")
    public static class81 field1992;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZI)V")
    public static final void method814(int arg0, boolean arg1, int arg2) {
        if (class88.field1595 != arg2) {
            class68.field1211 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class68.field1211[var3] = (var3 << 12) / arg2;
            }
            class94.field1684 = arg2 - 1;
            class167.field2943 = arg2 == 64 ? 2048 : 4096;
            class88.field1595 = arg2;
        }
        field1997++;
        if (arg1 || class30.field620 == arg0) {
            return;
        }
        if (class88.field1595 == arg0) {
            class282.field4964 = class68.field1211;
        } else {
            class282.field4964 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class282.field4964[var4] = (var4 << 12) / arg0;
            }
        }
        class233.field4294 = arg0 - 1;
        class30.field620 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method815(byte arg0) {
        if (arg0 != 16) {
            return;
        }
        field1998 = null;
        field1992 = null;
        field2002 = null;
        field1987 = null;
        field1993 = null;
        field1991 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method816(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2003++;
        if (arg5 == arg6 && arg1 == arg2 && arg0 == arg4 && arg3 == arg9) {
            class196.method1363(arg4, arg1, arg6, arg7, arg9, (byte) 52);
        } else {
            int var10 = arg6;
            int var11 = arg1;
            int var12 = arg5 * 3;
            int var13 = arg1 * 3;
            int var14 = arg2 * 3;
            int var15 = arg6 * 3;
            int var16 = arg0 * 3;
            int var17 = arg3 * 3;
            int var18 = var12 + arg4 - arg6 - var16;
            int var19 = var16 + var15 - var12 - var12;
            int var20 = var14 + arg9 - var17 - arg1;
            int var21 = var12 - var15;
            int var22 = var17 - var14 - (var14 - var13);
            int var23 = var14 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var19 * var25;
                int var27 = var22 * var25;
                int var28 = var23 * var24;
                int var29 = var24 * var25 >> 12;
                int var30 = var18 * var29;
                int var31 = var20 * var29;
                int var32 = var21 * var24;
                int var33 = (var30 + var32 + var26 >> 12) + arg6;
                int var34 = (var31 + var27 + var28 >> 12) + arg1;
                class196.method1363(var33, var11, var10, arg7, var34, (byte) -94);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg8 != 3) {
            method816(95, 116, -90, 84, -2, 31, -74, 71, 3, -86);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1979++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg7 - arg6;
        int var12 = arg2 - arg6;
        int var13 = arg7 * arg7;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = arg2 << 1;
        int var22 = (1 - var21) * var13 + var17;
        int var23 = var12 << 1;
        int var24 = (1 - var23) * var15 + var20;
        int var25 = var14 - ((var21 - 1) * var18);
        int var26 = var14 << 2;
        int var27 = var16 - ((var23 - 1) * var19);
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        if (arg0 < 43) {
            return;
        }
        int var32 = (var21 - 3) * var18;
        int var33 = var20 * 3;
        int var34 = (var23 - 3) * var19;
        int var35 = var26;
        int var36 = var30;
        int var37 = (arg2 - 1) * var28;
        int[] var38 = class15.field238[arg3];
        int var39 = (var12 - 1) * var29;
        class215.method1544(arg5 - arg7, -var11 + arg5, var38, arg4, -98);
        class215.method1544(arg5 - var11, arg5 + var11, var38, arg1, 126);
        class215.method1544(arg5 + var11, arg5 - -arg7, var38, arg4, -31);
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var25 += var35;
                    var8++;
                    var35 += var26;
                    var22 += var31;
                    var31 += var26;
                }
            }
            if (var25 < 0) {
                var8++;
                var22 += var31;
                var31 += var26;
                var25 += var35;
                var35 += var26;
            }
            var25 += -var32;
            boolean var40 = var12 >= var9;
            var9--;
            int var41 = arg3 + var9;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var10++;
                        var27 += var36;
                        var36 += var30;
                        var24 += var33;
                        var33 += var30;
                    }
                }
                if (var27 < 0) {
                    var24 += var33;
                    var10++;
                    var27 += var36;
                    var33 += var30;
                    var36 += var30;
                }
                var24 += -var39;
                var27 += -var34;
                var39 -= var29;
                var34 -= var29;
            }
            int var42 = arg3 - var9;
            var22 += -var37;
            var37 -= var28;
            var32 -= var28;
            int var43 = arg5 + var8;
            int var44 = arg5 - var8;
            if (var40) {
                int var45 = arg5 - var10;
                class215.method1544(var44, var45, class15.field238[var42], arg4, -34);
                int var46 = arg5 + var10;
                class215.method1544(var45, var46, class15.field238[var42], arg1, 106);
                class215.method1544(var46, var43, class15.field238[var42], arg4, 88);
                class215.method1544(var44, var45, class15.field238[var41], arg4, 119);
                class215.method1544(var45, var46, class15.field238[var41], arg1, -49);
                class215.method1544(var46, var43, class15.field238[var41], arg4, -72);
            } else {
                class215.method1544(var44, var43, class15.field238[var42], arg4, 87);
                class215.method1544(var44, var43, class15.field238[var41], arg4, 105);
            }
        }
    }
}
