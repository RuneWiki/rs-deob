import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class267 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field3899 = 0;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lrv;")
    public static class73 field3902 = new class73(1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method1686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3900++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg2 - arg7;
        int var12 = arg4 - arg7;
        int var13 = arg2 * arg2;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((arg1 + var21) * var18);
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
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class112.field1523[arg5];
        class447.method2605(-7, arg3 - arg2, arg6, arg3 - var11, var39);
        class447.method2605(-7, arg3 - var11, arg0, arg3 + var11, var39);
        class447.method2605(-7, arg3 + var11, arg6, arg2 + arg3, var39);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
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
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var41 = arg5 - var9;
            int var42 = arg5 + var9;
            int var43 = arg3 + var8;
            int var44 = arg3 - var8;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = arg3 - var10;
                class447.method2605(-7, var44, arg6, var46, class112.field1523[var41]);
                class447.method2605(-7, var46, arg0, var45, class112.field1523[var41]);
                class447.method2605(-7, var45, arg6, var43, class112.field1523[var41]);
                class447.method2605(arg1 - 6, var44, arg6, var46, class112.field1523[var42]);
                class447.method2605(arg1 - 6, var46, arg0, var45, class112.field1523[var42]);
                class447.method2605(-7, var45, arg6, var43, class112.field1523[var42]);
            } else {
                class447.method2605(arg1 - 6, var44, arg6, var43, class112.field1523[var41]);
                class447.method2605(-7, var44, arg6, var43, class112.field1523[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V", line = 176)
    public static final void method1687(int arg0, int arg1) {
        if (arg0 >= -44) {
            method1690(10);
        }
        field3898++;
        class45 var2 = class354.method2094(arg1, (byte) -63, 7);
        var2.method261(4);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 189)
    public static final void method1688(int arg0) {
        if (arg0 != 3) {
            field3902 = null;
        }
        class230.field3393 = 0;
        class282.field4153 = -1;
        class156.field2352 = -1;
        class243.field3527 = -1;
        field3896++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V", line = 204)
    public static final void method1689(boolean arg0) {
        class186.field2682 = null;
        class431.field6091 = null;
        class68.field862 = null;
        class102.field1357 = null;
        class487.field6796 = null;
        class411.field5805 = null;
        class422.field5952 = null;
        field3901++;
        class215.field3119 = null;
        class138.field1809 = null;
        if (arg0) {
            field3899 = -100;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 230)
    public static void method1690(int arg0) {
        if (arg0 != 0) {
            method1686(-78, 51, 104, 22, 93, -105, 16, 13);
        }
        field3902 = null;
    }
}
