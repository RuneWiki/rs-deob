import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class378 extends class45 {

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "Lug;")
    public static class392 field5715 = new class392();

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "Lrn;")
    public static class174 field5718 = new class174(12, 8);

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "[I")
    public static int[] field5720 = new int[2];

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "[I")
    public static int[] field5719;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILcu;)V", line = 3)
    public static final void method2348(int arg0, int arg1, class145 arg2) {
        if (class1.field15 != null) {
            try {
                class1.field15.method753(0, 0L);
                class1.field15.method752(arg2.field2270, false, 24, arg0);
            } catch (Exception var3) {
            }
        }
        ++field5714;
        if (arg1 != -31317) {
            field5719 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[I", line = 26)
    public final int[] method35(int arg0, int arg1) {
        ++field5716;
        if (arg0 != 0) {
            field5715 = null;
        }
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            int[][] var4 = this.method437(0, arg1, -80);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class259.field3768 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/Object;II)[B", line = 67)
    public static final byte[] method2349(int arg0, Object arg1, int arg2, int arg3) {
        ++field5717;
        if (arg1 == null) {
            return null;
        } else {
            if (arg2 <= 0) {
                field5718 = null;
            }
            if (arg1 instanceof byte[]) {
                byte[] var4 = (byte[]) arg1;
                return class414.method2508(arg0, 105, var4, arg3);
            } else if (arg1 instanceof class91) {
                class91 var5 = (class91) arg1;
                return var5.method709(arg0, 32259, arg3);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 100)
    public static final void method2350(boolean arg0) {
        if (arg0) {
            method2350(false);
        }
        ++field5712;
        class471.field7073.method2419((byte) 106);
        for (class208 var1 = (class208) class339.field5122.method2427(104); var1 != null; var1 = (class208) class339.field5122.method2422(-74)) {
            if (var1.field3005 < 1000) {
                var1.method2090(-1);
                class471.field7073.method2417(111, var1);
            }
        }
        class471.field7073.method2431(class339.field5122, (byte) -111);
        int var2 = -1;
        class432 var3 = (class432) class502.field7411.method2427(117);
        if (var3 != null) {
            var2 = var3.method2187((byte) 11);
        }
        if (!class197.field2903) {
            if (var2 == 0 && (~class300.field4272 == -2 && ~class363.field5500 < -3 || class516.method3081((byte) -46))) {
                var2 = 2;
            }
            if (var2 == 2 && class363.field5500 > 0 && var3 != null) {
                if (class475.field7100 == null && ~class333.field5035 == -1) {
                    class219.method1457(var3.method2183(-5), var3.method2186((byte) 114), -20);
                } else {
                    class440.field6579 = 2;
                }
            }
            if (~var2 == -1 && ~class363.field5500 < -1) {
                class222.method1474(-128);
            }
            if (class475.field7100 == null && class333.field5035 == 0) {
                class440.field6579 = 0;
                class446.field6663 = null;
                return;
            }
        } else {
            if (~var2 == 0) {
                int var4 = class166.field2579.method1024(!arg0);
                int var5 = class166.field2579.method1019((byte) 3);
                if (var4 < class106.field1766 - 10 || ~var4 < ~(class499.field7375 + class106.field1766 - -10) || class215.field3104 + -10 > var5 || class215.field3104 + 10 + class87.field1529 < var5) {
                    class197.field2903 = false;
                    class62.method534((byte) 60, class499.field7375, class87.field1529, class106.field1766, class215.field3104);
                }
            }
            if (~var2 != -1) {
                return;
            }
            int var6 = class106.field1766;
            int var7 = class215.field3104;
            int var8 = class499.field7375;
            int var9 = var3.method2183(-5);
            int var10 = var3.method2186((byte) 116);
            int var11 = -1;
            for (int var12 = 0; class363.field5500 > var12; ++var12) {
                if (class295.field4199) {
                    int var16 = var7 - (-((-var12 + class363.field5500 + -1) * 16) + -33);
                    if (~var9 < ~var6 && var6 + var8 > var9 && var10 > var16 + -13 && ~(var16 + 4) < ~var10) {
                        var11 = var12;
                    }
                } else {
                    int var17 = var7 + 31 - -((class363.field5500 - var12 + -1) * 16);
                    if (~var9 < ~var6 && var9 < var6 + var8 && ~(var17 + -13) > ~var10 && ~var10 > ~(var17 - -3)) {
                        var11 = var12;
                    }
                }
            }
            if (~var11 != 0) {
                int var13 = 0;
                class510 var14 = new class510(class339.field5122);
                for (class208 var15 = (class208) var14.method3056(false); var15 != null; var15 = (class208) var14.method3055(-81)) {
                    if (~var11 == ~var13) {
                        class282.method1802(var9, true, var15, var10);
                    }
                    ++var13;
                }
            }
            class197.field2903 = false;
            class62.method534((byte) 60, class499.field7375, class87.field1529, class106.field1766, class215.field3104);
        }
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V", line = 255)
    public static void method2351(int arg0) {
        field5719 = null;
        if (arg0 != 499) {
            field5715 = null;
        }
        field5718 = null;
        field5720 = null;
        field5715 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IJ)V", line = 268)
    public static final void method2352(int arg0, long arg1) {
        ++field5713;
        int var3 = class115.field1905 + class139.field2224.field6228;
        int var4 = class435.field6453 + class139.field2224.field6233;
        if (~(-var3 + class305.field4654) > 499 || class305.field4654 - var3 > 500 || class524.field7771 - var4 < -500 || ~(-var4 + class524.field7771) < -501) {
            class524.field7771 = var4;
            class305.field4654 = var3;
        }
        if (~class305.field4654 != ~var3) {
            int var5 = -class305.field4654 + var3;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (~var5 >= -1) {
                if (var6 != 0) {
                    if (var5 > var6) {
                        var6 = var5;
                    }
                } else {
                    var6 = -1;
                }
            } else if (var6 != 0) {
                if (var5 < var6) {
                    var6 = var5;
                }
            } else {
                var6 = 1;
            }
            class305.field4654 += var6;
        }
        if (class524.field7771 != var4) {
            int var7 = -class524.field7771 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 != 0) {
                    if (~var8 > ~var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = -1;
                }
            } else if (var8 != 0) {
                if (~var8 < ~var7) {
                    var8 = var7;
                }
            } else {
                var8 = 1;
            }
            class524.field7771 += var8;
        }
        if (!class443.field6623.field601) {
            class455.field6790 += (float) arg1 * class168.field2614 / 6.0F;
            class526.field7779 += (float) arg1 * class174.field2668 / 6.0F;
        }
        class207.method1403(-19057);
        if (arg0 != -555) {
            field5720 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 364)
    public class378() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)Z", line = 367)
    public static final boolean method2353(int arg0, int arg1, int arg2, int arg3) {
        if (!class341.method2177(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class426.field6345;
            int var5 = arg2 << class426.field6345;
            int var6 = class88.field1546[arg0].method376(arg1, arg2) - 1;
            int var7 = var6 - (120 << class426.field6345 - 7);
            int var8 = var6 - (230 << class426.field6345 - 7);
            int var9 = var6 - (238 << class426.field6345 - 7);
            if (arg3 == 1) {
                if (var4 > class472.field7077) {
                    if (!class14.method91(var4, var6, var5)) {
                        return false;
                    }
                    if (!class14.method91(var4, var6, class130.field2075 + var5)) {
                        return false;
                    }
                    if (!class14.method91(var4, var6, class177.field2697 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class14.method91(var4, var7, var5)) {
                        return false;
                    }
                    if (!class14.method91(var4, var7, class130.field2075 + var5)) {
                        return false;
                    }
                    if (!class14.method91(var4, var7, class177.field2697 + var5)) {
                        return false;
                    }
                }
                if (!class14.method91(var4, var8, var5)) {
                    return false;
                } else if (!class14.method91(var4, var8, class130.field2075 + var5)) {
                    return false;
                } else {
                    return class14.method91(var4, var8, class177.field2697 + var5);
                }
            } else if (arg3 == 2) {
                if (var5 < class350.field5363) {
                    if (!class14.method91(var4, var6, class177.field2697 + var5)) {
                        return false;
                    }
                    if (!class14.method91(class130.field2075 + var4, var6, class177.field2697 + var5)) {
                        return false;
                    }
                    if (!class14.method91(class177.field2697 + var4, var6, class177.field2697 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class14.method91(var4, var7, class177.field2697 + var5)) {
                        return false;
                    }
                    if (!class14.method91(class130.field2075 + var4, var7, class177.field2697 + var5)) {
                        return false;
                    }
                    if (!class14.method91(class177.field2697 + var4, var7, class177.field2697 + var5)) {
                        return false;
                    }
                }
                if (!class14.method91(var4, var8, class177.field2697 + var5)) {
                    return false;
                } else if (!class14.method91(class130.field2075 + var4, var8, class177.field2697 + var5)) {
                    return false;
                } else {
                    return class14.method91(class177.field2697 + var4, var8, class177.field2697 + var5);
                }
            } else if (arg3 == 4) {
                if (var4 < class472.field7077) {
                    if (!class14.method91(class177.field2697 + var4, var6, var5)) {
                        return false;
                    }
                    if (!class14.method91(class177.field2697 + var4, var6, class130.field2075 + var5)) {
                        return false;
                    }
                    if (!class14.method91(class177.field2697 + var4, var6, class177.field2697 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class14.method91(class177.field2697 + var4, var7, var5)) {
                        return false;
                    }
                    if (!class14.method91(class177.field2697 + var4, var7, class130.field2075 + var5)) {
                        return false;
                    }
                    if (!class14.method91(class177.field2697 + var4, var7, class177.field2697 + var5)) {
                        return false;
                    }
                }
                if (!class14.method91(class177.field2697 + var4, var8, var5)) {
                    return false;
                } else if (!class14.method91(class177.field2697 + var4, var8, class130.field2075 + var5)) {
                    return false;
                } else {
                    return class14.method91(class177.field2697 + var4, var8, class177.field2697 + var5);
                }
            } else if (arg3 == 8) {
                if (var5 > class350.field5363) {
                    if (!class14.method91(var4, var6, var5)) {
                        return false;
                    }
                    if (!class14.method91(class130.field2075 + var4, var6, var5)) {
                        return false;
                    }
                    if (!class14.method91(class177.field2697 + var4, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class14.method91(var4, var7, var5)) {
                        return false;
                    }
                    if (!class14.method91(class130.field2075 + var4, var7, var5)) {
                        return false;
                    }
                    if (!class14.method91(class177.field2697 + var4, var7, var5)) {
                        return false;
                    }
                }
                if (!class14.method91(var4, var8, var5)) {
                    return false;
                } else if (!class14.method91(class130.field2075 + var4, var8, var5)) {
                    return false;
                } else {
                    return class14.method91(class177.field2697 + var4, var8, var5);
                }
            } else if (!class14.method91(class130.field2075 + var4, var9, class130.field2075 + var5)) {
                return false;
            } else if (arg3 == 16) {
                return class14.method91(var4, var8, class177.field2697 + var5);
            } else if (arg3 == 32) {
                return class14.method91(class177.field2697 + var4, var8, class177.field2697 + var5);
            } else if (arg3 == 64) {
                return class14.method91(class177.field2697 + var4, var8, var5);
            } else if (arg3 == 128) {
                return class14.method91(var4, var8, var5);
            } else {
                return true;
            }
        }
    }
}
