import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class263 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[I")
    public static int[] field4678 = new int[64];

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lqk;")
    public static class207 field4680 = class24.method212(255, ": ");

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field4682 = 0;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
    public static final void method1817(int arg0, int arg1) {
        field4677++;
        if (arg0 != -6645) {
            field4680 = null;
        }
        class90 var2 = class221.method1575(2, arg1, 1651481952);
        var2.method651(-27655);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1818(int arg0) {
        field4678 = null;
        if (arg0 != 50) {
            field4678 = null;
        }
        field4680 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIIBII)V")
    public static final void method1819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        field4681++;
        int var11 = arg2 - arg4;
        int var12 = arg3 - arg6;
        int var13 = -1;
        int var14 = 983040 / arg9;
        if (class78.field1430 > 0) {
            if (class26.field535 <= 10) {
                var13 = class26.field535 * 5;
            } else {
                var13 = 50 - ((class26.field535 - 10) * 5);
            }
        }
        int var15 = 983040 / arg7;
        int var16 = -111 % ((arg8 - 19) / 58);
        for (int var17 = -var14; var17 < (var12 + var14); var17++) {
            int var19 = arg9 * var17 + arg5 >> 16;
            int var20 = (var17 + 1) * arg9 + arg5 >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var10000 = arg10 + var20;
                int var23 = arg10 + var19;
                int var24 = var17 + arg6 >> 6;
                if (var24 >= 0 && (class127.field2221.length - 1) >= var24) {
                    int[][] var25 = class127.field2221[var24];
                    for (int var26 = -var15; var26 < var11 + var15; var26++) {
                        int var27 = arg7 * var26 + arg0 >> 16;
                        int var28 = (var26 + 1) * arg7 + arg0 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg1 + var27;
                            var10000 = arg1 + var28;
                            int var32 = var26 + arg4 >> 6;
                            if (var32 >= 0 && var25.length - 1 >= var32 && var25[var32] != null) {
                                int var33 = (arg4 + var26 & 0x3F << 6) + (arg6 + var17 & 0x3F);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class22 var35 = class33.method251(0, var34 - 1);
                                    if (!class195.field3435[var35.field362]) {
                                        if (var13 != -1 && class201.field3556 == var35.field362) {
                                            class73 var36 = new class73();
                                            var36.field1352 = var23;
                                            var36.field1343 = var30;
                                            var36.field1339 = var35.field362;
                                            class280.field4921.method931(var36, 116);
                                        } else {
                                            class280.field4920[var35.field362].method381(var23 - 7, var30 - 7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class73 var18 = (class73) class280.field4921.method922((byte) 96); var18 != null; var18 = (class73) class280.field4921.method928(119)) {
            class23.method168(var18.field1352, var18.field1343, 15, 16776960, var13);
            class23.method168(var18.field1352, var18.field1343, 13, 16776960, var13);
            class23.method168(var18.field1352, var18.field1343, 11, 16776960, var13);
            class23.method168(var18.field1352, var18.field1343, 9, 16776960, var13);
            class280.field4920[var18.field1339].method381(var18.field1352 - 7, var18.field1343 + -7);
        }
        class280.field4921.method924(-30865);
    }
}
