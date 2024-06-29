import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class422 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lfja;")
    public static class783 field5785 = new class783(66, 5);

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lfja;")
    public static class783 field5786 = new class783(73, -1);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIII)V", line = 7)
    public static final void method2496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5783++;
        class434.method2541(arg2, true);
        int var7 = 0;
        int var8 = arg2 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        if (arg4 != -112215519) {
            field5785 = null;
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class223.field3260 <= arg3 && class706.field9700 >= arg3) {
            int[] var15 = class298.field4105[arg3];
            int var16 = class748.method4155(class268.field3766, 16, arg0 - arg2, class236.field3392);
            int var17 = class748.method4155(class268.field3766, 16, arg0 + arg2, class236.field3392);
            int var18 = class748.method4155(class268.field3766, arg4 ^ 0xF94FBA31, arg0 - var8, class236.field3392);
            int var19 = class748.method4155(class268.field3766, 16, arg0 + var8, class236.field3392);
            class679.method3826(var15, var18, arg4 ^ 0xF94FBA2A, var16, arg1);
            class679.method3826(var15, var19, arg4 ^ 0xF94FBA2A, var18, arg5);
            class679.method3826(var15, var17, arg4 + 112215530, var19, arg1);
        }
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class384.field5207[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg3 - var9;
                int var21 = arg3 + var9;
                if (var21 >= class223.field3260 && class706.field9700 >= var20) {
                    if (var8 > var9) {
                        int var22 = class384.field5207[var9];
                        int var23 = class748.method4155(class268.field3766, 16, arg0 + var7, class236.field3392);
                        int var24 = class748.method4155(class268.field3766, 16, arg0 - var7, class236.field3392);
                        int var25 = class748.method4155(class268.field3766, 16, arg0 + var22, class236.field3392);
                        int var26 = class748.method4155(class268.field3766, 16, arg0 - var22, class236.field3392);
                        if (var21 <= class706.field9700) {
                            int[] var27 = class298.field4105[var21];
                            class679.method3826(var27, var26, 11, var24, arg1);
                            class679.method3826(var27, var25, 11, var26, arg5);
                            class679.method3826(var27, var23, 11, var25, arg1);
                        }
                        if (var20 >= class223.field3260) {
                            int[] var28 = class298.field4105[var20];
                            class679.method3826(var28, var26, 11, var24, arg1);
                            class679.method3826(var28, var25, 11, var26, arg5);
                            class679.method3826(var28, var23, 11, var25, arg1);
                        }
                    } else {
                        int var29 = class748.method4155(class268.field3766, 16, arg0 + var7, class236.field3392);
                        int var30 = class748.method4155(class268.field3766, 16, arg0 - var7, class236.field3392);
                        if (var21 <= class706.field9700) {
                            class679.method3826(class298.field4105[var21], var29, 11, var30, arg1);
                        }
                        if (class223.field3260 <= var20) {
                            class679.method3826(class298.field4105[var20], var29, 11, var30, arg1);
                        }
                    }
                }
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (var32 >= class223.field3260 && var31 <= class706.field9700) {
                int var33 = arg0 + var9;
                int var34 = arg0 - var9;
                if (class268.field3766 <= var33 && class236.field3392 >= var34) {
                    int var35 = class748.method4155(class268.field3766, arg4 + 112215535, var33, class236.field3392);
                    int var36 = class748.method4155(class268.field3766, 16, var34, class236.field3392);
                    if (var8 > var7) {
                        int var37 = var11 < var7 ? class384.field5207[var7] : var11;
                        int var38 = class748.method4155(class268.field3766, 16, arg0 + var37, class236.field3392);
                        int var39 = class748.method4155(class268.field3766, 16, arg0 - var37, class236.field3392);
                        if (class706.field9700 >= var32) {
                            int[] var40 = class298.field4105[var32];
                            class679.method3826(var40, var39, arg4 + 112215530, var36, arg1);
                            class679.method3826(var40, var38, 11, var39, arg5);
                            class679.method3826(var40, var35, arg4 ^ 0xF94FBA2A, var38, arg1);
                        }
                        if (class223.field3260 <= var31) {
                            int[] var41 = class298.field4105[var31];
                            class679.method3826(var41, var39, 11, var36, arg1);
                            class679.method3826(var41, var38, 11, var39, arg5);
                            class679.method3826(var41, var35, arg4 ^ 0xF94FBA2A, var38, arg1);
                        }
                    } else {
                        if (class706.field9700 >= var32) {
                            class679.method3826(class298.field4105[var32], var35, 11, var36, arg1);
                        }
                        if (var31 >= class223.field3260) {
                            class679.method3826(class298.field4105[var31], var35, 11, var36, arg1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 188)
    public static final void method2497(int arg0) {
        field5787++;
        class393.method2384((byte) 84);
        if (arg0 != 0) {
            field5786 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Llu;B)[Lmb;", line = 199)
    public static final class277[] method2498(class742 arg0, byte arg1) {
        field5784++;
        if (!arg0.method4113((byte) -113)) {
            return new class277[0];
        }
        if (arg1 != -21) {
            field5785 = null;
        }
        class545 var2 = arg0.method4122(24);
        while (var2.field7412 == 0) {
            class643.method3577(10L, 0);
        }
        if (var2.field7412 == 2) {
            return new class277[0];
        }
        int[] var3 = (int[]) var2.field7416;
        class277[] var4 = new class277[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class277 var6 = new class277();
            var4[var5] = var6;
            var6.field3832 = var3[var5 << 2];
            var6.field3831 = var3[(var5 << 2) + 1];
            var6.field3842 = var3[(var5 << 2) + 2];
            var6.field3840 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 242)
    public static void method2499(byte arg0) {
        field5785 = null;
        field5786 = null;
        if (arg0 != -50) {
            method2498(null, (byte) -36);
        }
    }
}
