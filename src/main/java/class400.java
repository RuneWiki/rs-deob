import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class400 {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Z")
    public static boolean field5933 = false;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "[I")
    public static int[] field5937 = new int[5];

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lfa;")
    public static class156 field5935 = new class156(8);

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lbg;")
    public static class324 field5939 = new class324(95, -2);

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field5940 = 2;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "F")
    public static float field5932;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static void method2462(boolean arg0) {
        field5937 = null;
        field5935 = null;
        field5939 = null;
        if (!arg0) {
            method2463((byte) 108, -7, -16, -24, 108, 77, -79);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BIIIIII)V")
    public static final void method2463(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class151.method1089(false, arg3);
        field5934++;
        int var7 = 0;
        int var8 = arg3 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg0 <= 126) {
            field5932 = 0.8350775F;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg6 >= class471.field6963 && class401.field5947 >= arg6) {
            int[] var15 = class141.field1996[arg6];
            int var16 = class332.method2034(class126.field1842, -24309, arg5 - arg3, class72.field992);
            int var17 = class332.method2034(class126.field1842, -24309, arg3 + arg5, class72.field992);
            int var18 = class332.method2034(class126.field1842, -24309, arg5 - var8, class72.field992);
            int var19 = class332.method2034(class126.field1842, -24309, arg5 + var8, class72.field992);
            class531.method3136(var16, 122, arg4, var18, var15);
            class531.method3136(var18, -80, arg2, var19, var15);
            class531.method3136(var19, 122, arg4, var17, var15);
        }
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class430.field6323[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg6 - var9;
                int var21 = arg6 + var9;
                if (class471.field6963 <= var21 && var20 <= class401.field5947) {
                    if (var8 <= var9) {
                        int var22 = class332.method2034(class126.field1842, -24309, arg5 + var7, class72.field992);
                        int var23 = class332.method2034(class126.field1842, -24309, arg5 - var7, class72.field992);
                        if (var21 <= class401.field5947) {
                            class531.method3136(var23, 125, arg4, var22, class141.field1996[var21]);
                        }
                        if (var20 >= class471.field6963) {
                            class531.method3136(var23, 119, arg4, var22, class141.field1996[var20]);
                        }
                    } else {
                        int var24 = class430.field6323[var9];
                        int var25 = class332.method2034(class126.field1842, -24309, arg5 + var7, class72.field992);
                        int var26 = class332.method2034(class126.field1842, -24309, arg5 - var7, class72.field992);
                        int var27 = class332.method2034(class126.field1842, -24309, arg5 + var24, class72.field992);
                        int var28 = class332.method2034(class126.field1842, -24309, arg5 - var24, class72.field992);
                        if (var21 <= class401.field5947) {
                            int[] var29 = class141.field1996[var21];
                            class531.method3136(var26, 118, arg4, var28, var29);
                            class531.method3136(var28, -103, arg2, var27, var29);
                            class531.method3136(var27, -90, arg4, var25, var29);
                        }
                        if (var20 >= class471.field6963) {
                            int[] var30 = class141.field1996[var20];
                            class531.method3136(var26, 122, arg4, var28, var30);
                            class531.method3136(var28, -106, arg2, var27, var30);
                            class531.method3136(var27, -108, arg4, var25, var30);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (class471.field6963 <= var32 && var31 <= class401.field5947) {
                int var33 = arg5 + var9;
                int var34 = arg5 - var9;
                if (class72.field992 <= var33 && var34 <= class126.field1842) {
                    int var35 = class332.method2034(class126.field1842, -24309, var33, class72.field992);
                    int var36 = class332.method2034(class126.field1842, -24309, var34, class72.field992);
                    if (var7 < var8) {
                        int var37 = var7 <= var11 ? var11 : class430.field6323[var7];
                        int var38 = class332.method2034(class126.field1842, -24309, arg5 + var37, class72.field992);
                        int var39 = class332.method2034(class126.field1842, -24309, arg5 - var37, class72.field992);
                        if (var32 <= class401.field5947) {
                            int[] var40 = class141.field1996[var32];
                            class531.method3136(var36, -75, arg4, var39, var40);
                            class531.method3136(var39, 124, arg2, var38, var40);
                            class531.method3136(var38, 125, arg4, var35, var40);
                        }
                        if (class471.field6963 <= var31) {
                            int[] var41 = class141.field1996[var31];
                            class531.method3136(var36, 120, arg4, var39, var41);
                            class531.method3136(var39, 126, arg2, var38, var41);
                            class531.method3136(var38, 119, arg4, var35, var41);
                        }
                    } else {
                        if (var32 <= class401.field5947) {
                            class531.method3136(var36, 127, arg4, var35, class141.field1996[var32]);
                        }
                        if (class471.field6963 <= var31) {
                            class531.method3136(var36, -79, arg4, var35, class141.field1996[var31]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)Z")
    public static final boolean method2464(byte arg0, int arg1) {
        field5931++;
        if (arg0 == 126) {
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } else {
            return true;
        }
    }
}
