import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class226 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
    public static int[] field3649 = new int[256];

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
    public static int[] field3653;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lwf;")
    public static final class1 method1540(int arg0, int arg1) {
        field3652++;
        class1 var2 = (class1) class105.field1620.method1428((long) arg1, (byte) -64);
        if (var2 != null) {
            return var2;
        }
        int var3 = 96 / ((40 - arg0) / 51);
        byte[] var4 = class118.field1737.method807((byte) 103, arg1, 33);
        class1 var5 = new class1();
        if (var4 != null) {
            var5.method2(arg1, new class25(var4), -62);
        }
        class105.field1620.method1424((long) arg1, var5, -2003648287);
        return var5;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public static void method1541(boolean arg0) {
        field3649 = null;
        if (!arg0) {
            method1543(true, 68, 119, -25, 84, -115, -16, -59);
        }
        field3653 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)I")
    public static final int method1542(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method1543(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3651++;
        int var8 = arg2;
        if (arg0) {
            method1542(-10, 50);
        }
        int var9 = 0;
        int var10 = arg1 - arg5;
        int var11 = arg2 - arg5;
        int var12 = 0;
        int var13 = arg1 * arg1;
        int var14 = var10 * var10;
        int var15 = arg2 * arg2;
        int var16 = var11 * var11;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = arg2 << 1;
        int var22 = var11 << 1;
        int var23 = var15 - (var21 - 1) * var17;
        int var24 = (1 - var21) * var13 + var19;
        int var25 = (1 - var22) * var14 + var20;
        int var26 = var16 - ((var22 - 1) * var18);
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var19 * 3;
        int var32 = (var21 - 3) * var17;
        int var33 = var20 * 3;
        int var34 = (var22 - 3) * var18;
        int var35 = (arg2 - 1) * var27;
        int var36 = (var11 - 1) * var29;
        int var37 = var30;
        int var38 = var28;
        int[] var39 = class106.field1637[arg3];
        class8.method52(arg6 - arg1, var39, arg6 - var10, arg7, !arg0);
        class8.method52(arg6 - var10, var39, arg6 + var10, arg4, true);
        class8.method52(arg6 + var10, var39, arg1 + arg6, arg7, true);
        while (var8 > 0) {
            boolean var40 = var8 <= var11;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var12++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    var12++;
                }
                var25 += -var36;
                var26 += -var34;
                var34 -= var29;
                var36 -= var29;
            }
            var8--;
            int var41 = arg3 + var8;
            int var42 = arg3 - var8;
            if (var24 < 0) {
                while (var24 < 0) {
                    var9++;
                    var24 += var31;
                    var23 += var38;
                    var31 += var28;
                    var38 += var28;
                }
            }
            if (var23 < 0) {
                var23 += var38;
                var38 += var28;
                var9++;
                var24 += var31;
                var31 += var28;
            }
            int var43 = arg6 + var9;
            var24 += -var35;
            var35 -= var27;
            int var44 = arg6 - var9;
            if (var40) {
                int var45 = arg6 + var12;
                int var46 = arg6 - var12;
                class8.method52(var44, class106.field1637[var42], var46, arg7, !arg0);
                class8.method52(var46, class106.field1637[var42], var45, arg4, true);
                class8.method52(var45, class106.field1637[var42], var43, arg7, true);
                class8.method52(var44, class106.field1637[var41], var46, arg7, !arg0);
                class8.method52(var46, class106.field1637[var41], var45, arg4, true);
                class8.method52(var45, class106.field1637[var41], var43, arg7, true);
            } else {
                class8.method52(var44, class106.field1637[var42], var43, arg7, true);
                class8.method52(var44, class106.field1637[var41], var43, arg7, true);
            }
            var23 += -var32;
            var32 -= var27;
        }
    }
}
