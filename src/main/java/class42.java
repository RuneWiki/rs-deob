import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class42 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field651 = 0;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
    public static int[] field653;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "[Lul;")
    public static class306[] field654;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method316(int arg0) {
        field654 = null;
        if (arg0 <= -111) {
            field653 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field652++;
        int var8 = 0;
        if (arg7 != 31) {
            return;
        }
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg6 - arg0;
        int var12 = arg4 - arg0;
        int var13 = arg6 * arg6;
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
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
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
        int[] var39 = class227.field3201[arg5];
        class370.method2440(arg2 - var11, var39, arg3, arg2 - arg6, 126);
        class370.method2440(arg2 + var11, var39, arg1, arg2 - var11, 62);
        class370.method2440(arg2 + arg6, var39, arg3, arg2 + var11, 125);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
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
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var41 = arg5 - var9;
            int var42 = arg5 + var9;
            int var43 = arg2 + var8;
            int var44 = arg2 - var8;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class370.method2440(var46, class227.field3201[var41], arg3, var44, 61);
                class370.method2440(var45, class227.field3201[var41], arg1, var46, 126);
                class370.method2440(var43, class227.field3201[var41], arg3, var45, 70);
                class370.method2440(var46, class227.field3201[var42], arg3, var44, 73);
                class370.method2440(var45, class227.field3201[var42], arg1, var46, 76);
                class370.method2440(var43, class227.field3201[var42], arg3, var45, arg7 ^ 0x45);
            } else {
                class370.method2440(var43, class227.field3201[var41], arg3, var44, 100);
                class370.method2440(var43, class227.field3201[var42], arg3, var44, 116);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
    public static final void method318() {
        if (class108.field1475 != null) {
            for (int var0 = 0; var0 < class108.field1475.length; var0++) {
                for (int var1 = 0; var1 < class308.field4403; var1++) {
                    for (int var2 = 0; var2 < class413.field6175; var2++) {
                        if (class108.field1475[var0][var1][var2] != null) {
                            class108.field1475[var0][var1][var2].method74((byte) 110);
                        }
                        class108.field1475[var0][var1][var2] = null;
                    }
                }
            }
        }
        class108.field1475 = null;
        class198.field2829 = null;
        if (class39.field633 != null) {
            for (int var3 = 0; var3 < class39.field633.length; var3++) {
                for (int var4 = 0; var4 < class308.field4403; var4++) {
                    for (int var5 = 0; var5 < class413.field6175; var5++) {
                        if (class39.field633[var3][var4][var5] != null) {
                            class39.field633[var3][var4][var5].method74((byte) 110);
                        }
                        class39.field633[var3][var4][var5] = null;
                    }
                }
            }
        }
        class39.field633 = null;
        class425.field6324 = null;
        class343.field5032 = null;
        class88.field1226 = null;
        class37.field609 = 0;
        if (field654 != null) {
            for (int var6 = 0; var6 < class37.field609; var6++) {
                field654[var6] = null;
            }
        }
        if (class143.field1881 != null) {
            for (int var7 = 0; var7 < class401.field5966; var7++) {
                class143.field1881[var7] = null;
            }
            class401.field5966 = 0;
        }
        if (class74.field997 != null) {
            for (int var8 = 0; var8 < class134.field1789; var8++) {
                class74.field997[var8] = null;
            }
            for (int var9 = 0; var9 < class137.field1817; var9++) {
                for (int var10 = 0; var10 < class308.field4403; var10++) {
                    for (int var11 = 0; var11 < class413.field6175; var11++) {
                        class38.field612[var9][var10][var11] = 0;
                    }
                }
            }
            class134.field1789 = 0;
        }
        class63.field900 = null;
        class255.method1607((byte) -125);
        class357.field5232.method977(0);
        class30.field514 = null;
        class274.field4030 = null;
        class196.field2800 = null;
        class310.field4442 = null;
    }
}
