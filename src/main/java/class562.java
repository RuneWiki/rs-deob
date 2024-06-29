import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class562 {

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "Lpja;")
    private class43 field7966 = new class43(64);

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "Lgj;")
    private class662 field7964;

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "I")
    public int field7969;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "[F")
    public static float[] field7970 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "Lfja;")
    public static class783 field7963 = new class783(45, -1);

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "Lad;")
    public static class448 field7971 = new class448();

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "[I")
    public static int[] field7972 = new int[2];

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field7965;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z)V")
    public static void method3252(boolean arg0) {
        field7971 = null;
        field7970 = null;
        field7963 = null;
        if (!arg0) {
            field7970 = null;
        }
        field7972 = null;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7968++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        if (arg4 > -2) {
            return;
        }
        int var11 = arg1 - arg6;
        int var12 = arg7 - arg6;
        int var13 = arg1 * arg1;
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
        int var24 = var14 - (var21 - 1) * var18;
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
        if (arg3 >= class223.field3260 && class706.field9700 >= arg3) {
            int[] var38 = class298.field4105[arg3];
            int var39 = class748.method4155(class268.field3766, 16, arg0 - arg1, class236.field3392);
            int var40 = class748.method4155(class268.field3766, 16, arg0 + arg1, class236.field3392);
            int var41 = class748.method4155(class268.field3766, 16, arg0 - var11, class236.field3392);
            int var42 = class748.method4155(class268.field3766, 16, arg0 + var11, class236.field3392);
            class679.method3826(var38, var41, 11, var39, arg2);
            class679.method3826(var38, var42, 11, var41, arg5);
            class679.method3826(var38, var40, 11, var42, arg2);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var37 += var30;
                        var10++;
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
                var25 += -var43;
                var43 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg3 - var9;
            int var46 = arg3 + var9;
            if (var46 >= class223.field3260 && var45 <= class706.field9700) {
                int var47 = class748.method4155(class268.field3766, 16, arg0 + var8, class236.field3392);
                int var48 = class748.method4155(class268.field3766, 16, arg0 - var8, class236.field3392);
                if (var44) {
                    int var49 = class748.method4155(class268.field3766, 16, arg0 + var10, class236.field3392);
                    int var50 = class748.method4155(class268.field3766, 16, arg0 - var10, class236.field3392);
                    if (class223.field3260 <= var45) {
                        int[] var51 = class298.field4105[var45];
                        class679.method3826(var51, var50, 11, var48, arg2);
                        class679.method3826(var51, var49, 11, var50, arg5);
                        class679.method3826(var51, var47, 11, var49, arg2);
                    }
                    if (class706.field9700 >= var46) {
                        int[] var52 = class298.field4105[var46];
                        class679.method3826(var52, var50, 11, var48, arg2);
                        class679.method3826(var52, var49, 11, var50, arg5);
                        class679.method3826(var52, var47, 11, var49, arg2);
                    }
                } else {
                    if (var45 >= class223.field3260) {
                        class679.method3826(class298.field4105[var45], var47, 11, var48, arg2);
                    }
                    if (class706.field9700 >= var46) {
                        class679.method3826(class298.field4105[var46], var47, 11, var48, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZI)Lvea;")
    public final class290 method3254(boolean arg0, int arg1) {
        field7965++;
        class43 var3 = this.field7966;
        class290 var4;
        synchronized (this.field7966) {
            var4 = (class290) this.field7966.method266((byte) -106, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg0) {
            method3253(39, -34, 107, -121, -75, 38, -1, 5);
        }
        class662 var5 = this.field7964;
        byte[] var6;
        synchronized (this.field7964) {
            var6 = this.field7964.method3732(arg1, 8906, 19);
        }
        class290 var7 = new class290();
        if (var6 != null) {
            var7.method1849(8, new class93(var6));
        }
        class43 var8 = this.field7966;
        synchronized (this.field7966) {
            this.field7966.method270(var7, (long) arg1, -125);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lim;ILgj;)V")
    public class562(class598 arg0, int arg1, class662 arg2) {
        this.field7964 = arg2;
        this.field7969 = this.field7964.method3730((byte) -124, 19);
    }
}
