import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class690 {

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "Ljava/lang/String;")
    public static String field9699 = null;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "[[I")
    public static int[][] field9702 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field9700;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "[[[Lhl;")
    public static class486[][][] field9701;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IB)Lsda;")
    public static final class234 method3797(int arg0, byte arg1) {
        field9700++;
        class234 var2 = (class234) class472.field6588.method1986((byte) -88, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class132.field1859.method940(0, arg0, 0);
        if (arg1 < 92) {
            method3798(12, -74, 7, -76, -109, -33, -40, -126);
        }
        class234 var4 = new class234();
        if (var3 != null) {
            var4.method1478(new class96(var3), (byte) 122);
        }
        var4.method1477((byte) -105);
        class472.field6588.method1985(var4, (long) arg0, (byte) -102);
        return var4;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9698++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = arg4;
        int var11 = arg0 - arg6;
        int var12 = arg1 - arg6;
        int var13 = arg0 * arg0;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
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
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class476.field6655[arg2];
        class548.method3012(arg5 - var11, (byte) 23, arg3, arg5 - arg0, var39);
        class548.method3012(arg5 + var11, (byte) 23, arg7, arg5 - var11, var39);
        class548.method3012(arg0 + arg5, (byte) 23, arg3, arg5 + var11, var39);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var41 = arg2 - var9;
            int var42 = arg2 + var9;
            int var43 = arg5 + var8;
            int var44 = arg5 - var8;
            if (var40) {
                int var45 = arg5 + var10;
                int var46 = arg5 - var10;
                class548.method3012(var46, (byte) 23, arg3, var44, class476.field6655[var41]);
                class548.method3012(var45, (byte) 23, arg7, var46, class476.field6655[var41]);
                class548.method3012(var43, (byte) 23, arg3, var45, class476.field6655[var41]);
                class548.method3012(var46, (byte) 23, arg3, var44, class476.field6655[var42]);
                class548.method3012(var45, (byte) 23, arg7, var46, class476.field6655[var42]);
                class548.method3012(var43, (byte) 23, arg3, var45, class476.field6655[var42]);
            } else {
                class548.method3012(var43, (byte) 23, arg3, var44, class476.field6655[var41]);
                class548.method3012(var43, (byte) 23, arg3, var44, class476.field6655[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static final void method3799(int arg0) {
        class609.field8472 = null;
        class131.field1794 = -1;
        if (arg0 != 20445) {
            method3798(-14, 78, 75, 36, 117, 64, -7, 99);
        }
        field9703++;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
    public static void method3800(int arg0) {
        field9702 = null;
        field9699 = null;
        field9701 = null;
        if (arg0 != 14965) {
            method3799(104);
        }
    }
}
