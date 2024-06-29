import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class316 extends class210 {

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    private int field4625 = 4;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    private int field4620 = 4;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "[I")
    public static int[] field4619 = new int[1000];

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "[[[B")
    public static byte[][][] field4632;

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 3)
    public class316() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V", line = 8)
    public static final void method2085(int arg0, int arg1) {
        class166.field2196 = arg1;
        int var2 = -80 % ((2 - arg0) / 50);
        class151.field2052 = 3;
        ++field4622;
        class178.field2538 = -1;
        class267.field3966 = 100;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V", line = 21)
    public static final void method2086(int arg0, int arg1) {
        ++field4626;
        class363 var2 = class42.field555;
        synchronized (class42.field555) {
            class42.field555.method2300(arg1, true);
        }
        class363 var3 = class83.field1019;
        synchronized (class83.field1019) {
            class83.field1019.method2300(arg1, true);
            if (arg0 != 4) {
                field4632 = null;
            }
        }
        class363 var4 = class18.field293;
        synchronized (class18.field293) {
            class18.field293.method2300(arg1, true);
        }
        class363 var5 = class329.field4898;
        synchronized (class329.field4898) {
            class329.field4898.method2300(arg1, true);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[[I", line = 43)
    public final int[][] method58(int arg0, int arg1) {
        ++field4623;
        int[][] var3 = super.field2967.method1572(123, arg0);
        if (super.field2967.field3454) {
            int var4 = class202.field2852 / this.field4620;
            int var5 = class130.field1771 / this.field4625;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method1444(1, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1444(1, 0, class130.field1771 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class202.field2852 < ~var14; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class202.field2852 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        if (arg1 <= 94) {
            method2089(2, (class9) null, 43, 118, 77, -84);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILat;)V", line = 113)
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg1 == -11941) {
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    this.field4625 = arg2.method1738((byte) -62);
                }
            } else {
                this.field4620 = arg2.method1738((byte) -74);
            }
            ++field4624;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)V", line = 149)
    public static final void method2087(int arg0, boolean arg1) {
        ++field4633;
        if (arg1) {
            field4632 = null;
        }
        class125 var2 = class56.method428(arg0, 16, -3636);
        var2.method847(44);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[I", line = 171)
    public final int[] method361(int arg0, byte arg1) {
        ++field4630;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (arg1 != -38) {
            this.field4625 = 112;
        }
        if (super.field2950.field4111) {
            int var4 = class202.field2852 / this.field4620;
            int var5 = class130.field1771 / this.field4625;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method1447(0, -121, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1447(class130.field1771 * var7 / var5, -114, 0);
            }
            for (int var8 = 0; ~var8 > ~class202.field2852; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class202.field2852 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 223)
    public static final void method2088(String arg0, int arg1) {
        ++field4629;
        if (arg0 != null) {
            if ((class373.field5450 < 100 || class408.field5877) && ~class373.field5450 > -201) {
                String var2 = class17.method223(0, arg0);
                if (var2 != null) {
                    for (int var3 = 0; ~var3 > ~class373.field5450; ++var3) {
                        String var7 = class17.method223(0, class271.field4015[var3]);
                        if (var7 != null && var7.equals(var2)) {
                            class328.method2147(128, arg0 + class441.field6421.method2543(false, class153.field2073));
                            return;
                        }
                        if (class419.field6077[var3] != null) {
                            String var8 = class17.method223(0, class419.field6077[var3]);
                            if (var8 != null && var8.equals(var2)) {
                                class328.method2147(arg1 ^ 873, arg0 + class441.field6421.method2543(false, class153.field2073));
                                return;
                            }
                        }
                    }
                    for (int var4 = 0; ~class238.field3533 < ~var4; ++var4) {
                        String var5 = class17.method223(arg1 + -1001, class163.field2161[var4]);
                        if (var5 != null && var5.equals(var2)) {
                            class328.method2147(128, class451.field6656.method2543(false, class153.field2073) + arg0 + class353.field5153.method2543(false, class153.field2073));
                            return;
                        }
                        if (class334.field4937[var4] != null) {
                            String var6 = class17.method223(0, class334.field4937[var4]);
                            if (var6 != null && var6.equals(var2)) {
                                class328.method2147(arg1 ^ 873, class451.field6656.method2543(false, class153.field2073) + arg0 + class353.field5153.method2543(false, class153.field2073));
                                return;
                            }
                        }
                    }
                    if (class17.method223(0, class187.field2619.field5587).equals(var2)) {
                        class328.method2147(128, class282.field4144.method2543(false, class153.field2073));
                    } else {
                        class257.method1773((byte) -10, class433.field6312);
                        ++class311.field4573;
                        class159.field2132.method1727(arg1 ^ -919, class248.method1646(arg0, (byte) -114));
                        class159.field2132.method1712(arg0, -42);
                        if (arg1 != 1001) {
                            method2086(-90, -37);
                        }
                    }
                }
            } else {
                class328.method2147(128, class228.field3432.method2543(false, class153.field2073));
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILfp;IIII)V", line = 327)
    public static final void method2089(int arg0, class9 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.method77(arg0, arg3, arg0 - -arg5, arg2 + arg3);
        ++field4627;
        arg1.method150(-123, arg3, arg0, arg2, -16777216, arg5);
        if (~class41.field549 <= -101) {
            float var6 = (float) class66.field872 / (float) class66.field877;
            int var7 = arg5;
            int var8 = arg2;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg5 * var6);
            } else {
                var7 = (int) ((float) arg2 / var6);
            }
            int var9 = (arg5 - var7) / 2 + arg0;
            int var10 = (-var8 + arg2) / 2 + arg3;
            if (class171.field2235 == null || class171.field2235.method1868() != arg5 || class171.field2235.method1862() != arg2) {
                class66.method476(class66.field870, class66.field860 - -class66.field872, class66.field877 + class66.field870, class66.field860, var9, var10, var7 + var9, var8 + var10);
                class66.method498(arg1);
                class171.field2235 = arg1.method123(var9, var10, var7, var8, false);
            }
            class171.field2235.method1915(var9, var10);
            int var11 = class109.field1481 * var7 / class66.field877;
            if (arg4 == 16776960) {
                int var12 = class233.field3493 * var8 / class66.field872;
                int var13 = class31.field429 * var7 / class66.field877 + var9;
                int var14 = -(class120.field1611 * var8 / class66.field872) + -var12 + var8 + var10;
                int var15 = -1996554240;
                if (class408.field5869 == class166.field2191) {
                    var15 = -1996488705;
                }
                arg1.method164(var13, var14, var11, var12, var15, 1);
                arg1.method156(var13, var14, var11, var12, var15, 0);
                if (~class151.field2052 < -1) {
                    int var16;
                    if (class267.field3966 <= 50) {
                        var16 = class267.field3966 * 5;
                    } else {
                        var16 = (-class267.field3966 + 100) * 5;
                    }
                    for (class376 var17 = (class376) class66.field857.method2478(1603); var17 != null; var17 = (class376) class66.field857.method2486((byte) -82)) {
                        class110 var18 = class443.method2721(arg4 ^ -16776972, var17.field5483);
                        if (class423.method2609(var18, arg4 + -16749558)) {
                            if (class166.field2196 != var17.field5483) {
                                if (class178.field2538 != -1 && ~class178.field2538 == ~var18.field1530) {
                                    int var19 = var17.field5484 * var7 / class66.field877 + var9;
                                    int var20 = (-var17.field5497 + class66.field872) * var8 / class66.field872 + var10;
                                    arg1.method150(-103, var20 + -2, var19 - 2, 4, 16776960 | var16 << 24, 4);
                                }
                            } else {
                                int var21 = var17.field5484 * var7 / class66.field877 + var9;
                                int var22 = (-var17.field5497 + class66.field872) * var8 / class66.field872 + var10;
                                arg1.method150(-86, var22 + -2, var21 + -2, 4, var16 << 24 | 16776960, 4);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V", line = 427)
    public static void method2090(int arg0) {
        field4632 = null;
        field4619 = null;
        if (arg0 > -109) {
            method2087(4, false);
        }
    }
}
