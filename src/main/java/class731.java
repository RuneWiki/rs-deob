import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class731 {

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lfc;")
    private class262 field10190 = new class262(128);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lni;")
    private class522 field10187;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field10186;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lbg;")
    public static class465 field10191;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZII)Z")
    public static final boolean method4095(boolean arg0, int arg1, int arg2) {
        field10186++;
        if (arg0) {
            field10191 = null;
        }
        return class572.method3214(arg1, arg2, 83) || class90.method644(55, arg2, arg1);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method4096(int arg0) {
        if (arg0 != -23881) {
            method4096(-97);
        }
        field10191 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lsp;")
    public final class635 method4097(int arg0, int arg1) {
        field10188++;
        class262 var3 = this.field10190;
        class635 var4;
        synchronized (this.field10190) {
            var4 = (class635) this.field10190.method1571(-123, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field10187.method2885(class595.method3293(arg0, (byte) 39), class256.method1527(arg0, false), false);
        class635 var6 = new class635();
        if (var5 != null) {
            var6.method3572(new class611(var5), 4);
        }
        class262 var7 = this.field10190;
        synchronized (this.field10190) {
            this.field10190.method1574((long) arg0, var6, (byte) -80);
            if (arg1 != 1028602529) {
                method4098(46, 67, -18, (byte) 67, 54, 98, -114);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIBIII)V")
    public static final void method4098(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field10189++;
        class191.method1065(256, arg0);
        int var7 = 0;
        int var8 = arg0 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = 28 / ((arg3 - 17) / 58);
        int var14 = -1;
        int var15 = -1;
        if (class759.field10576 <= arg4 && class29.field238 >= arg4) {
            int[] var16 = class300.field4036[arg4];
            int var17 = class105.method716(false, class165.field2070, class122.field1604, arg5 - arg0);
            int var18 = class105.method716(false, class165.field2070, class122.field1604, arg0 + arg5);
            int var19 = class105.method716(false, class165.field2070, class122.field1604, arg5 - var8);
            int var20 = class105.method716(false, class165.field2070, class122.field1604, arg5 + var8);
            class168.method980(arg1, var16, var17, var19, (byte) -126);
            class168.method980(arg2, var16, var19, var20, (byte) -123);
            class168.method980(arg1, var16, var20, var18, (byte) -125);
        }
        while (var9 > var7) {
            var15 += 2;
            var14 += 2;
            var12 += var15;
            var10 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class449.field6284[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var21 = arg4 - var9;
                int var22 = arg4 + var9;
                if (class759.field10576 <= var22 && class29.field238 >= var21) {
                    if (var8 <= var9) {
                        int var23 = class105.method716(false, class165.field2070, class122.field1604, arg5 + var7);
                        int var24 = class105.method716(false, class165.field2070, class122.field1604, arg5 - var7);
                        if (var22 <= class29.field238) {
                            class168.method980(arg1, class300.field4036[var22], var24, var23, (byte) 50);
                        }
                        if (var21 >= class759.field10576) {
                            class168.method980(arg1, class300.field4036[var21], var24, var23, (byte) 14);
                        }
                    } else {
                        int var25 = class449.field6284[var9];
                        int var26 = class105.method716(false, class165.field2070, class122.field1604, arg5 + var7);
                        int var27 = class105.method716(false, class165.field2070, class122.field1604, arg5 - var7);
                        int var28 = class105.method716(false, class165.field2070, class122.field1604, arg5 + var25);
                        int var29 = class105.method716(false, class165.field2070, class122.field1604, arg5 - var25);
                        if (class29.field238 >= var22) {
                            int[] var30 = class300.field4036[var22];
                            class168.method980(arg1, var30, var27, var29, (byte) -127);
                            class168.method980(arg2, var30, var29, var28, (byte) 24);
                            class168.method980(arg1, var30, var28, var26, (byte) -127);
                        }
                        if (var21 >= class759.field10576) {
                            int[] var31 = class300.field4036[var21];
                            class168.method980(arg1, var31, var27, var29, (byte) -123);
                            class168.method980(arg2, var31, var29, var28, (byte) 81);
                            class168.method980(arg1, var31, var28, var26, (byte) -126);
                        }
                    }
                }
            }
            int var32 = arg4 - var7;
            int var33 = arg4 + var7;
            if (var33 >= class759.field10576 && class29.field238 >= var32) {
                int var34 = arg5 + var9;
                int var35 = arg5 - var9;
                if (class122.field1604 <= var34 && var35 <= class165.field2070) {
                    int var36 = class105.method716(false, class165.field2070, class122.field1604, var34);
                    int var37 = class105.method716(false, class165.field2070, class122.field1604, var35);
                    if (var7 >= var8) {
                        if (var33 <= class29.field238) {
                            class168.method980(arg1, class300.field4036[var33], var37, var36, (byte) 122);
                        }
                        if (class759.field10576 <= var32) {
                            class168.method980(arg1, class300.field4036[var32], var37, var36, (byte) -128);
                        }
                    } else {
                        int var38 = var7 <= var11 ? var11 : class449.field6284[var7];
                        int var39 = class105.method716(false, class165.field2070, class122.field1604, arg5 + var38);
                        int var40 = class105.method716(false, class165.field2070, class122.field1604, arg5 - var38);
                        if (class29.field238 >= var33) {
                            int[] var41 = class300.field4036[var33];
                            class168.method980(arg1, var41, var37, var40, (byte) -123);
                            class168.method980(arg2, var41, var40, var39, (byte) -127);
                            class168.method980(arg1, var41, var39, var36, (byte) 57);
                        }
                        if (var32 >= class759.field10576) {
                            int[] var42 = class300.field4036[var32];
                            class168.method980(arg1, var42, var37, var40, (byte) -128);
                            class168.method980(arg2, var42, var40, var39, (byte) 15);
                            class168.method980(arg1, var42, var39, var36, (byte) 73);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lrga;ILni;)V")
    public class731(class242 arg0, int arg1, class522 arg2) {
        this.field10187 = arg2;
        if (this.field10187 != null) {
            int var4 = this.field10187.method2892((byte) -11) - 1;
            this.field10187.method2901(0, var4);
        }
    }
}
