import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class69 extends class184 {

    @OriginalMember(owner = "client!er", name = "F", descriptor = "I")
    private int field890 = 0;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "I")
    private int field889 = 1;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    private int field896 = 0;

    @OriginalMember(owner = "client!er", name = "P", descriptor = "Lkg;")
    public static class179 field900 = new class179(3, 2);

    @OriginalMember(owner = "client!er", name = "D", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!er", name = "N", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V", line = 4)
    public static void method608(byte arg0) {
        if (arg0 == -73) {
            field900 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(B)Z", line = 14)
    public static final boolean method609(byte arg0) {
        ++field892;
        try {
            if (class176.field2324 == 2) {
                if (class173.field2247 == null) {
                    class173.field2247 = class366.method2101(class534.field7859, class76.field985, class156.field1978);
                    if (class173.field2247 == null) {
                        return false;
                    }
                }
                if (class434.field6169 == null) {
                    class434.field6169 = new class76(class267.field3380, class186.field2438);
                }
                if (class155.field1965.method2651(class434.field6169, class271.field3421, class173.field2247, 22050, -1)) {
                    class155.field1965.method2668(92);
                    class155.field1965.method2664((byte) -78, class1.field5);
                    class155.field1965.method2666(-119, class498.field7216, class173.field2247);
                    class173.field2247 = null;
                    class176.field2324 = 0;
                    class434.field6169 = null;
                    class534.field7859 = null;
                    return true;
                }
            }
            if (arg0 < 111) {
                method615(4, -60, 0.12623422F, 39, -1.2040879F, 101, -77, -0.21511924F, 48, -109, (float[]) null, 114, -93);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class155.field1965.method2686((byte) 58);
            class534.field7859 = null;
            class176.field2324 = 0;
            class434.field6169 = null;
            class173.field2247 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BILfh;)V", line = 69)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 3) {
                    this.field889 = arg2.method2737(false);
                }
            } else {
                this.field896 = arg2.method2737(false);
            }
        } else {
            this.field890 = arg2.method2737(false);
        }
        ++field894;
        int var5 = -26 / ((arg0 - -13) / 51);
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V", line = 111)
    public static final void method610(byte arg0) {
        class383.field5049 = class274.field3437.field3823 + 2 - -class274.field3437.field3824;
        class99.field1199 = new String[500];
        class346.field4446 = class159.field2030.field3823 + 2 - -class159.field2030.field3824;
        if (arg0 > -90) {
            field900 = null;
        }
        ++field893;
        for (int var1 = 0; class99.field1199.length > var1; ++var1) {
            class99.field1199[var1] = "";
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V", line = 232)
    public class69() {
        super(0, true);
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(B)V", line = 135)
    public static final void method611(byte arg0) {
        ++field897;
        class303.field3890.method282(((float) class407.field5817.field3655 * 0.1F + 0.7F) * 1.1523438F);
        class303.field3890.method328(class60.field782, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class303.field3890.method343(class401.field5717, -1, 256);
        class303.field3890.method294(class377.field4960);
        int var1 = -41 % ((-1 - arg0) / 50);
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(I)[Ltm;", line = 152)
    public static final class266[] method612(int arg0) {
        if (arg0 != 27420) {
            field900 = null;
        }
        if (class113.field1508 == null) {
            class266[] var1 = class465.method2800(false, class219.field2794);
            class266[] var2 = new class266[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; ~var4 > ~var1.length; ++var4) {
                class266 var8 = var1[var4];
                if ((~var8.field3353 >= -1 || ~var8.field3353 <= -25) && ~var8.field3356 <= -801 && ~var8.field3352 <= -601 && (class105.field1333 >= 96 || ~class377.field4959 != -1 || ~var8.field3356 >= -1025 && var8.field3352 <= 768)) {
                    for (int var9 = 0; ~var9 > ~var3; ++var9) {
                        class266 var10 = var2[var9];
                        if (var8.field3356 == var10.field3356 && ~var8.field3352 == ~var10.field3352) {
                            if (~var8.field3353 < ~var10.field3353) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    ++var3;
                }
            }
            class113.field1508 = new class266[var3];
            class318.method1871(var2, 0, class113.field1508, 0, var3);
            int[] var5 = new int[class113.field1508.length];
            for (int var6 = 0; class113.field1508.length > var6; ++var6) {
                class266 var7 = class113.field1508[var6];
                var5[var6] = var7.field3356 * var7.field3352;
            }
            class84.method683(class113.field1508, var5, true);
        }
        ++field898;
        return class113.field1508;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IBIII)V", line = 235)
    public static final void method613(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field891;
        class237.field3019 = arg0;
        class147.field1870 = arg3;
        if (arg1 < 88) {
            field900 = null;
        }
        class533.field7845 = arg2;
        class289.field3694 = arg4;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIB)V", line = 250)
    public static final void method614(int arg0, int arg1, byte arg2) {
        ++field899;
        if (arg2 < -77) {
            class153 var3 = class75.method656(5, 255, arg0);
            var3.method1003((byte) -52);
            var3.field1933 = arg1;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIFIFIIFII[FII)V", line = 265)
    public static final void method615(int arg0, int arg1, float arg2, int arg3, float arg4, int arg5, int arg6, float arg7, int arg8, int arg9, float[] arg10, int arg11, int arg12) {
        int var13 = arg5 - arg11;
        ++field901;
        int var14 = arg12 - arg6;
        int var15 = arg8 - arg1;
        float var16 = arg10[2] * (float) var15 + arg10[0] * (float) var13 + arg10[1] * (float) var14;
        float var17 = arg10[5] * (float) var15 + arg10[arg9] * (float) var13 + arg10[4] * (float) var14;
        float var18 = arg10[8] * (float) var15 + arg10[7] * (float) var14 + arg10[6] * (float) var13;
        float var19;
        float var20;
        if (~arg3 != -1) {
            if (arg3 != 1) {
                if (~arg3 == -3) {
                    var19 = -var17 + arg7 + 0.5F;
                    var20 = -var16 + arg2 + 0.5F;
                } else if (arg3 != 3) {
                    if (arg3 != 4) {
                        var19 = -var17 + arg7 + 0.5F;
                        var20 = -var18 + arg4 + 0.5F;
                    } else {
                        var20 = arg4 + var18 + 0.5F;
                        var19 = -var17 + arg7 + 0.5F;
                    }
                } else {
                    var19 = -var17 + arg7 + 0.5F;
                    var20 = arg2 + var16 + 0.5F;
                }
            } else {
                var20 = arg2 + var16 + 0.5F;
                var19 = arg4 + var18 + 0.5F;
            }
        } else {
            var19 = -var18 + arg4 + 0.5F;
            var20 = arg2 + var16 + 0.5F;
        }
        if (arg0 != 1) {
            if (arg0 != 2) {
                if (arg0 == 3) {
                    float var21 = var20;
                    var20 = var19;
                    var19 = -var21;
                }
            } else {
                var19 = -var19;
                var20 = -var20;
            }
        } else {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        }
        class371.field4795 = var20;
        class299.field3854 = var19;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[I", line = 349)
    public final int[] method6(int arg0, int arg1) {
        ++field895;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (arg1 != 578) {
            this.field889 = 76;
        }
        if (super.field2409.field436) {
            int var4 = class334.field4218[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class245.field3167; ++var6) {
                int var7 = class347.field4461[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field890 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field889 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field889;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field896 == 0) {
                    var12 = class397.field5691[(4089 & var12) >> 4] + 4096 >> 1;
                } else if (this.field896 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(Z)V", line = 422)
    public final void method109(boolean arg0) {
        class93.method721(4096);
        ++field888;
        if (arg0) {
            method613(71, (byte) 39, 83, -127, 54);
        }
    }
}
