import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class265 extends class238 {

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "Ldk;")
    public static class326 field3861 = new class326("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "Lwf;")
    public static class79 field3873 = new class79(66, 2);

    @OriginalMember(owner = "client!ep", name = "M", descriptor = "Lus;")
    public static class1 field3884 = new class1(75, 10);

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public int field3858;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public int field3860;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    public int field3864;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
    public int field3865;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public int field3867;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
    public int field3871;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
    public int field3875;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "I")
    public int field3877;

    @OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!ep", name = "I", descriptor = "I")
    public int field3880;

    @OriginalMember(owner = "client!ep", name = "J", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!ep", name = "K", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ep", name = "L", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!ep", name = "N", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ep", name = "O", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "Lds;")
    public class12 field3872;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "Lrm;")
    public class259 field3857;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "Laf;")
    public class275 field3866;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "Lnd;")
    public class352 field3863;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "Lfl;")
    public static class480 field3859;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public static final void method1631(int arg0) {
        field3870++;
        if (arg0 != -1) {
            return;
        }
        for (class393 var1 = (class393) class34.field445.method2843(1123227612); var1 != null; var1 = (class393) class34.field445.method2842(arg0 ^ 0x9C405171)) {
            if (var1.field5570 > 0) {
                var1.field5570--;
            }
            if (var1.field5570 != 0) {
                if (var1.field5575 > 0) {
                    var1.field5575--;
                }
                if (var1.field5575 == 0 && var1.field5573 >= 1 && var1.field5579 >= 1 && var1.field5573 <= (class58.field758 - 2) && var1.field5579 <= class287.field4181 - 2 && (var1.field5572 < 0 || class413.method2440(var1.field5567, var1.field5572, (byte) 111))) {
                    class420.method2466(var1.field5579, var1.field5581, -1, var1.field5567, var1.field5577, var1.field5572, 32512, var1.field5578, var1.field5573);
                    var1.field5575 = -1;
                    if (var1.field5583 == var1.field5572 && var1.field5583 == -1) {
                        var1.method1510((byte) -13);
                    } else if (var1.field5583 == var1.field5572 && var1.field5578 == var1.field5571 && var1.field5574 == var1.field5567) {
                        var1.method1510((byte) -13);
                    }
                }
            } else if (var1.field5583 < 0 || class413.method2440(var1.field5574, var1.field5583, (byte) 115)) {
                class420.method2466(var1.field5579, var1.field5581, -1, var1.field5574, var1.field5577, var1.field5583, arg0 ^ 0xFFFF80FF, var1.field5571, var1.field5573);
                var1.method1510((byte) -13);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1632(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3886++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg4 - arg2;
        if (arg1 != -34) {
            return;
        }
        int var12 = arg7 - arg2;
        int var13 = arg4 * arg4;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
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
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        if (arg0 >= class345.field5011 && arg0 <= class485.field6827) {
            int[] var38 = class128.field1676[arg0];
            int var39 = class156.method978(0, arg6 - arg4, class94.field1209, class168.field2449);
            int var40 = class156.method978(0, arg6 + arg4, class94.field1209, class168.field2449);
            int var41 = class156.method978(arg1 + 34, -var11 + arg6, class94.field1209, class168.field2449);
            int var42 = class156.method978(arg1 + 34, arg6 - -var11, class94.field1209, class168.field2449);
            class103.method579((byte) 115, var39, var41, arg5, var38);
            class103.method579((byte) 115, var41, var42, arg3, var38);
            class103.method579((byte) 115, var42, var40, arg5, var38);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
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
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (class345.field5011 <= var46 && var45 <= class485.field6827) {
                int var47 = class156.method978(0, arg6 + var8, class94.field1209, class168.field2449);
                int var48 = class156.method978(0, arg6 - var8, class94.field1209, class168.field2449);
                if (var44) {
                    int var49 = class156.method978(0, arg6 + var10, class94.field1209, class168.field2449);
                    int var50 = class156.method978(0, arg6 - var10, class94.field1209, class168.field2449);
                    if (class345.field5011 <= var45) {
                        int[] var51 = class128.field1676[var45];
                        class103.method579((byte) 115, var48, var50, arg5, var51);
                        class103.method579((byte) 115, var50, var49, arg3, var51);
                        class103.method579((byte) 115, var49, var47, arg5, var51);
                    }
                    if (class485.field6827 >= var46) {
                        int[] var52 = class128.field1676[var46];
                        class103.method579((byte) 115, var48, var50, arg5, var52);
                        class103.method579((byte) 115, var50, var49, arg3, var52);
                        class103.method579((byte) 115, var49, var47, arg5, var52);
                    }
                } else {
                    if (var45 >= class345.field5011) {
                        class103.method579((byte) 115, var48, var47, arg5, class128.field1676[var45]);
                    }
                    if (class485.field6827 >= var46) {
                        class103.method579((byte) 115, var48, var47, arg5, class128.field1676[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIJLjava/lang/String;ZILjava/lang/String;ZI)V")
    public static final void method1633(int arg0, int arg1, int arg2, int arg3, long arg4, String arg5, boolean arg6, int arg7, String arg8, boolean arg9, int arg10) {
        field3869++;
        if (class19.field260 || class476.field6690 >= 500) {
            return;
        }
        int var12 = arg10 == -1 ? class360.field5183 : arg10;
        class451 var13 = new class451(arg8, arg5, var12, arg0, arg1, arg4, arg2, arg3, arg6, arg9);
        if (arg7 == 500) {
            class160.field2365.method2845(var13, (byte) 37);
            class476.field6690++;
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    public static void method1634(int arg0) {
        field3859 = null;
        if (arg0 != 1) {
            field3859 = null;
        }
        field3873 = null;
        field3861 = null;
        field3884 = null;
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
    public final void method1635(int arg0) {
        field3882++;
        this.field3872 = null;
        this.field3863 = null;
        this.field3866 = null;
        if (arg0 == -1) {
            this.field3857 = null;
        }
    }
}
