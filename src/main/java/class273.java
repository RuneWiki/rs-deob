import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class273 extends class2 {

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field4801 = 0;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "Lqk;")
    public static class207 field4802 = class24.method212(255, "cyan:");

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field4804 = 0;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Lqk;")
    public static class207 field4806;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Lmd;")
    public static class220 field4800;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILpk;)V")
    public static final void method1852(int arg0, class99 arg1) {
        class241.field4399 = arg1;
        class160.field2842 = class241.field4399.method698(7, arg0);
        field4803++;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    public static void method1853(byte arg0) {
        field4800 = null;
        field4802 = null;
        field4806 = null;
        if (arg0 <= 58) {
            field4799 = -94;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V")
    public static final void method1854(boolean arg0, int arg1) {
        class90 var2 = class221.method1575(6, arg1, 1651481952);
        field4805++;
        var2.method651(-27655);
        if (arg0) {
            method1853((byte) 40);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1855(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var8 = class20.method116(arg4, arg7 + arg1, arg5 + arg6);
        field4807++;
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x7C82A) >> 14;
            int var11 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            int var12 = ((int) var8 & 0x3128FA) >> 20;
            class22 var13 = class33.method251(0, var11);
            if (var13.field386 == -1) {
                int[] var14 = class23.field435;
                int var15 = arg2;
                if (var8 > 0L) {
                    var15 = arg3;
                }
                int var16 = arg7 * 4 + (((52736 - (arg6 * 512)) * 4) + 24624);
                if (var10 == 0 || var10 == 2) {
                    if (var12 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var12 == 1) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var12 == 2) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 515] = var15;
                        var14[var16 + 3 + 1024] = var15;
                        var14[var16 + 1539] = var15;
                    } else if (var12 == 3) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1536 + 1] = var15;
                        var14[var16 + 1536 + 2] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
                if (var10 == 3) {
                    if (var12 == 0) {
                        var14[var16] = var15;
                    } else if (var12 == 1) {
                        var14[var16 + 3] = var15;
                    } else if (var12 == 2) {
                        var14[var16 + 1536 + 3] = var15;
                    } else if (var12 == 3) {
                        var14[var16 + 1536] = var15;
                    }
                }
                if (var10 == 2) {
                    if (var12 == 3) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var12 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var12 == 1) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 3 + 512] = var15;
                        var14[var16 + 3 + 1024] = var15;
                        var14[var16 + 1539] = var15;
                    } else if (var12 == 2) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1536 + 1] = var15;
                        var14[var16 + 1536 + 2] = var15;
                        var14[var16 + 1539] = var15;
                    }
                }
            } else if (!class255.method1773(var13, var12, false, arg5, arg1, arg6, arg7)) {
                return false;
            }
        }
        long var17 = class59.method433(arg4, arg1 + arg7, arg5 + arg6);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 14 & 0x1F;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class22 var21 = class33.method251(0, var20);
            int var22 = (int) var17 >> 20 & 0x3;
            if (var21.field386 == -1) {
                if (var19 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class23.field435;
                    int var25 = arg7 * 4 + (103 - arg6) * 512 * 4 + 24624;
                    if (var22 == 0 || var22 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1 + 1024] = var23;
                        var24[var25 + 514] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 512 + 1] = var23;
                        var24[var25 + 1024 + 2] = var23;
                        var24[var25 + 3 + 1536] = var23;
                    }
                }
            } else if (!class255.method1773(var21, var22, false, arg5, arg1, arg6, arg7)) {
                return false;
            }
        }
        long var26 = class237.method1689(arg4, arg1 + arg7, arg5 + arg6);
        if (arg0 != 16769) {
            field4799 = 28;
        }
        if (var26 != 0L) {
            int var28 = ((int) var26 & 0x352297) >> 20;
            int var29 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            class22 var30 = class33.method251(0, var29);
            if (var30.field386 != -1 && !class255.method1773(var30, var28, false, arg5, arg1, arg6, arg7)) {
                return false;
            }
        }
        return true;
    }
}
