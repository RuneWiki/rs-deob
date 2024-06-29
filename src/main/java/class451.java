import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class451 {

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Lfe;")
    public static class384 field6569 = new class384(16);

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "[I")
    public static int[] field6571 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "F")
    public static float field6572;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "[Ljo;")
    public static class210[] field6573;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IBI)V")
    public static final void method2625(int arg0, byte arg1, int arg2) {
        field6568++;
        class338 var3 = class380.method2294((byte) 121, arg2, 16);
        var3.method2052((byte) 86);
        var3.field4930 = arg0;
        if (arg1 > -61) {
            method2625(-54, (byte) 38, 101);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public static void method2626(int arg0) {
        if (arg0 != -1) {
            method2627(-114, 66, 125, -47, 59, 31, -39);
        }
        field6573 = null;
        field6571 = null;
        field6569 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class467.method2736(arg5, 0);
        field6570++;
        int var7 = 0;
        int var8 = arg5 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        if (arg3 < 89) {
            field6569 = null;
        }
        int var13 = -1;
        int var14 = -1;
        if (arg4 >= class7.field131 && arg4 <= class92.field1252) {
            int[] var15 = class41.field629[arg4];
            int var16 = class372.method2266(class473.field6839, -20228, class63.field933, arg1 - arg5);
            int var17 = class372.method2266(class473.field6839, -20228, class63.field933, arg1 + arg5);
            int var18 = class372.method2266(class473.field6839, -20228, class63.field933, arg1 - var8);
            int var19 = class372.method2266(class473.field6839, -20228, class63.field933, arg1 + var8);
            class238.method1440(var15, arg2, var18, var16, -14726);
            class238.method1440(var15, arg6, var19, var18, -14726);
            class238.method1440(var15, arg2, var17, var19, -14726);
        }
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class77.field1092[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg4 - var9;
                int var21 = arg4 + var9;
                if (var21 >= class7.field131 && var20 <= class92.field1252) {
                    if (var9 >= var8) {
                        int var22 = class372.method2266(class473.field6839, -20228, class63.field933, arg1 + var7);
                        int var23 = class372.method2266(class473.field6839, -20228, class63.field933, arg1 - var7);
                        if (class92.field1252 >= var21) {
                            class238.method1440(class41.field629[var21], arg2, var22, var23, -14726);
                        }
                        if (var20 >= class7.field131) {
                            class238.method1440(class41.field629[var20], arg2, var22, var23, -14726);
                        }
                    } else {
                        int var24 = class77.field1092[var9];
                        int var25 = class372.method2266(class473.field6839, -20228, class63.field933, arg1 + var7);
                        int var26 = class372.method2266(class473.field6839, -20228, class63.field933, arg1 - var7);
                        int var27 = class372.method2266(class473.field6839, -20228, class63.field933, arg1 + var24);
                        int var28 = class372.method2266(class473.field6839, -20228, class63.field933, arg1 - var24);
                        if (class92.field1252 >= var21) {
                            int[] var29 = class41.field629[var21];
                            class238.method1440(var29, arg2, var28, var26, -14726);
                            class238.method1440(var29, arg6, var27, var28, -14726);
                            class238.method1440(var29, arg2, var25, var27, -14726);
                        }
                        if (var20 >= class7.field131) {
                            int[] var30 = class41.field629[var20];
                            class238.method1440(var30, arg2, var28, var26, -14726);
                            class238.method1440(var30, arg6, var27, var28, -14726);
                            class238.method1440(var30, arg2, var25, var27, -14726);
                        }
                    }
                }
            }
            int var31 = arg4 - var7;
            int var32 = arg4 + var7;
            if (var32 >= class7.field131 && class92.field1252 >= var31) {
                int var33 = arg1 + var9;
                int var34 = arg1 - var9;
                if (var33 >= class473.field6839 && var34 <= class63.field933) {
                    int var35 = class372.method2266(class473.field6839, -20228, class63.field933, var33);
                    int var36 = class372.method2266(class473.field6839, -20228, class63.field933, var34);
                    if (var8 <= var7) {
                        if (class92.field1252 >= var32) {
                            class238.method1440(class41.field629[var32], arg2, var35, var36, -14726);
                        }
                        if (var31 >= class7.field131) {
                            class238.method1440(class41.field629[var31], arg2, var35, var36, -14726);
                        }
                    } else {
                        int var37 = var7 <= var11 ? var11 : class77.field1092[var7];
                        int var38 = class372.method2266(class473.field6839, -20228, class63.field933, arg1 + var37);
                        int var39 = class372.method2266(class473.field6839, -20228, class63.field933, arg1 - var37);
                        if (var32 <= class92.field1252) {
                            int[] var40 = class41.field629[var32];
                            class238.method1440(var40, arg2, var39, var36, -14726);
                            class238.method1440(var40, arg6, var38, var39, -14726);
                            class238.method1440(var40, arg2, var35, var38, -14726);
                        }
                        if (class7.field131 <= var31) {
                            int[] var41 = class41.field629[var31];
                            class238.method1440(var41, arg2, var39, var36, -14726);
                            class238.method1440(var41, arg6, var38, var39, -14726);
                            class238.method1440(var41, arg2, var35, var38, -14726);
                        }
                    }
                }
            }
        }
    }
}
