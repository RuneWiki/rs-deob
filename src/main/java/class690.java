import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class690 implements class454 {

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "Ljava/lang/String;")
    private String field9763;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field9759;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public static int field9762;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "Z")
    private boolean field9761;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(III)Z")
    public static final boolean method3884(int arg0, int arg1, int arg2) {
        field9759++;
        boolean var3 = (arg2 & 0x37) == arg1 ? class777.method4273(arg2, 0, arg0) : class415.method2486(arg2, arg0, 8192);
        return class714.method4041(arg2, (byte) 36, arg0) | (arg0 & 0x10000) != 0 | var3;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9760++;
        class426.method2536(-1, arg0);
        int var7 = 0;
        int var8 = arg0 - arg5;
        if (arg2 < ~var8) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg6 >= class738.field10297 && class414.field5846 >= arg6) {
            int[] var14 = class347.field5087[arg6];
            int var15 = class387.method2374(1, arg3 - arg0, class450.field6463, class285.field4372);
            int var16 = class387.method2374(1, arg0 + arg3, class450.field6463, class285.field4372);
            int var17 = class387.method2374(1, arg3 - var8, class450.field6463, class285.field4372);
            int var18 = class387.method2374(1, arg3 + var8, class450.field6463, class285.field4372);
            class382.method2347(var15, var14, arg1, 7, var17);
            class382.method2347(var17, var14, arg4, 7, var18);
            class382.method2347(var18, var14, arg1, arg2 + 8, var16);
        }
        int var19 = -1;
        while (var9 > var7) {
            var19 += 2;
            var13 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class251.field3554[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg6 - var9;
                int var21 = arg6 + var9;
                if (class738.field10297 <= var21 && class414.field5846 >= var20) {
                    if (var9 < var8) {
                        int var22 = class251.field3554[var9];
                        int var23 = class387.method2374(1, arg3 + var7, class450.field6463, class285.field4372);
                        int var24 = class387.method2374(1, arg3 - var7, class450.field6463, class285.field4372);
                        int var25 = class387.method2374(1, arg3 + var22, class450.field6463, class285.field4372);
                        int var26 = class387.method2374(1, arg3 - var22, class450.field6463, class285.field4372);
                        if (var21 <= class414.field5846) {
                            int[] var27 = class347.field5087[var21];
                            class382.method2347(var24, var27, arg1, 7, var26);
                            class382.method2347(var26, var27, arg4, 7, var25);
                            class382.method2347(var25, var27, arg1, 7, var23);
                        }
                        if (var20 >= class738.field10297) {
                            int[] var28 = class347.field5087[var20];
                            class382.method2347(var24, var28, arg1, 7, var26);
                            class382.method2347(var26, var28, arg4, 7, var25);
                            class382.method2347(var25, var28, arg1, 7, var23);
                        }
                    } else {
                        int var29 = class387.method2374(1, arg3 + var7, class450.field6463, class285.field4372);
                        int var30 = class387.method2374(arg2 + 2, -var7 + arg3, class450.field6463, class285.field4372);
                        if (var21 <= class414.field5846) {
                            class382.method2347(var30, class347.field5087[var21], arg1, 7, var29);
                        }
                        if (var20 >= class738.field10297) {
                            class382.method2347(var30, class347.field5087[var20], arg1, arg2 + 8, var29);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (class738.field10297 <= var32 && class414.field5846 >= var31) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (class450.field6463 <= var33 && class285.field4372 >= var34) {
                    int var35 = class387.method2374(1, var33, class450.field6463, class285.field4372);
                    int var36 = class387.method2374(1, var34, class450.field6463, class285.field4372);
                    if (var8 > var7) {
                        int var37 = var11 >= var7 ? var11 : class251.field3554[var7];
                        int var38 = class387.method2374(arg2 ^ 0xFFFFFFFE, arg3 + var37, class450.field6463, class285.field4372);
                        int var39 = class387.method2374(arg2 ^ 0xFFFFFFFE, arg3 - var37, class450.field6463, class285.field4372);
                        if (class414.field5846 >= var32) {
                            int[] var40 = class347.field5087[var32];
                            class382.method2347(var36, var40, arg1, 7, var39);
                            class382.method2347(var39, var40, arg4, 7, var38);
                            class382.method2347(var38, var40, arg1, 7, var35);
                        }
                        if (var31 >= class738.field10297) {
                            int[] var41 = class347.field5087[var31];
                            class382.method2347(var36, var41, arg1, 7, var39);
                            class382.method2347(var39, var41, arg4, 7, var38);
                            class382.method2347(var38, var41, arg1, 7, var35);
                        }
                    } else {
                        if (var32 <= class414.field5846) {
                            class382.method2347(var36, class347.field5087[var32], arg1, arg2 + 8, var35);
                        }
                        if (class738.field10297 <= var31) {
                            class382.method2347(var36, class347.field5087[var31], arg1, 7, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)I")
    public final int method1558(int arg0) {
        field9762++;
        int var2 = class17.method144(this.field9763, false);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field9761 = true;
            int var3 = -91 % ((arg0 - 44) / 57);
            return 100;
        }
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)Z")
    public final boolean method3886(int arg0) {
        field9764++;
        if (arg0 != -2) {
            field9766 = -19;
        }
        return this.field9761;
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)Lbja;")
    public final class34 method1557(int arg0) {
        if (arg0 == -29120) {
            field9765++;
            return class34.field450;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class690(String arg0) {
        this.field9763 = arg0;
    }
}
