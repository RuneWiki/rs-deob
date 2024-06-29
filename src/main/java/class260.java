import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class260 extends class168 {

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "Lqe;")
    public static class465 field3809 = new class465(106, 0);

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "[S")
    public static short[] field3811 = new short[] { 30, 23, 17, 22, 4, 18, 8, 12 };

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!oba", name = "k", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lgs;)V")
    public static final void method1768(class43 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            int var10002;
            for (int var2 = 0; var2 < class189.field2729[var1]; var2++) {
                if (class307.field4351[var1][var2] == arg0) {
                    class622.method3594(class307.field4351[var1], var2 + 1, class307.field4351[var1], var2, class189.field2729[var1] - var2 - 1);
                    var10002 = class189.field2729[var1]--;
                    class70.field1267 = true;
                    return;
                }
            }
            for (int var3 = 0; var3 < class444.field6176[var1]; var3++) {
                if (class319.field4524[var1][var3] == arg0) {
                    class622.method3594(class319.field4524[var1], var3 + 1, class319.field4524[var1], var3, class444.field6176[var1] - var3 - 1);
                    var10002 = class444.field6176[var1]--;
                    return;
                }
            }
            for (int var4 = 0; var4 < class579.field8176[var1]; var4++) {
                if (class598.field8718[var1][var4] == arg0) {
                    class622.method3594(class598.field8718[var1], var4 + 1, class598.field8718[var1], var4, class579.field8176[var1] - var4 - 1);
                    var10002 = class579.field8176[var1]--;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)Z")
    public static final boolean method1769(int arg0) {
        field3812++;
        int var1 = -73 / ((arg0 + 50) / 58);
        return class731.field10231 != 0;
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)V")
    public static void method1770(int arg0) {
        field3809 = null;
        field3811 = null;
        if (arg0 != -1) {
            method1770(-113);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3815++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg4 - arg3;
        int var12 = arg0 - arg3;
        int var13 = arg4 * arg4;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        if (arg5 != -27050) {
            return;
        }
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
        int var36 = (arg0 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class329.field4651[arg6];
        class399.method2472(27113, arg7 - arg4, arg7 - var11, arg2, var39);
        class399.method2472(27113, arg7 - var11, arg7 + var11, arg1, var39);
        class399.method2472(27113, arg7 + var11, arg7 - -arg4, arg2, var39);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var41 = arg6 - var9;
            int var42 = arg6 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class399.method2472(arg5 + 54163, var44, var46, arg2, class329.field4651[var41]);
                class399.method2472(27113, var46, var45, arg1, class329.field4651[var41]);
                class399.method2472(27113, var45, var43, arg2, class329.field4651[var41]);
                class399.method2472(arg5 ^ 0xFFFFFFBF, var44, var46, arg2, class329.field4651[var42]);
                class399.method2472(27113, var46, var45, arg1, class329.field4651[var42]);
                class399.method2472(arg5 ^ 0xFFFFFFBF, var45, var43, arg2, class329.field4651[var42]);
            } else {
                class399.method2472(27113, var44, var43, arg2, class329.field4651[var41]);
                class399.method2472(27113, var44, var43, arg2, class329.field4651[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)Z")
    public static final boolean method1772(int arg0, int arg1, int arg2) {
        field3813++;
        return arg0 <= 7 ? true : (class494.method2973(56, arg1, arg2) | class206.method1433(arg2, (byte) 62, arg1) | class32.method208(arg2, arg1, (byte) -19)) & class264.method1779(arg2, arg1, false);
    }
}
