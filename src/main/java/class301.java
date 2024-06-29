import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class301 extends class223 {

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    private int field4833 = 4096;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "Z")
    private boolean field4840 = true;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field4839 = 1;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field4845 = 0;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    public static int field4850 = 50;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "[I")
    public static int[] field4843 = new int[field4850];

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "[I")
    public static int[] field4851 = new int[field4850];

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "[I")
    public static int[] field4838 = new int[field4850];

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "[I")
    public static int[] field4836 = new int[field4850];

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "[I")
    public static int[] field4846 = new int[field4850];

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field4837 = new String[field4850];

    @OriginalMember(owner = "client!ch", name = "gb", descriptor = "[I")
    public static int[] field4856 = new int[field4850];

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "[I")
    public static int[] field4842 = new int[field4850];

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!ch", name = "fb", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!ch", name = "hb", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!ch", name = "ib", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "Lbc;")
    public static class182 field4848;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "[[B")
    public static byte[][] field4847;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        if (arg0 <= 0) {
            field4836 = null;
        }
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257) {
            int[] var4 = this.method1533(0, class75.field1168 & arg1 + -1, -123);
            int[] var5 = this.method1533(0, arg1, -83);
            int[] var6 = this.method1533(0, class75.field1168 & arg1 + 1, -73);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class250.field4008; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field4833;
                int var12 = (var5[class280.field4430 & var10 + 1] + -var5[class280.field4430 & var10 + -1]) * this.field4833;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var20 = var12 / var17;
                    var19 = var11 / var17;
                }
                if (this.field4840) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        ++field4841;
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)I")
    public static final int method2015(int arg0, int arg1) {
        ++field4849;
        double var2 = (double) (255 & arg0 >> 16) / 256.0D;
        double var4 = (double) (arg0 & 255) / 256.0D;
        double var6 = (double) (255 & arg0 >> 8) / 256.0D;
        double var8 = var2;
        if (var6 < var2) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var6) {
            var10 = var6;
        }
        if (var4 > var10) {
            var10 = var4;
        }
        if (var8 > var4) {
            var8 = var4;
        }
        if (arg1 != -4357) {
            method2022(2);
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var2 != var10) {
                if (var6 == var10) {
                    var12 = (var4 - var2) / (-var8 + var10) + 2.0D;
                } else if (var4 == var10) {
                    var12 = (var2 - var6) / (-var8 + var10) + 4.0D;
                }
            } else {
                var12 = (-var4 + var6) / (-var8 + var10);
            }
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (-var8 + var10) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 >= 0) {
            if (var21 > 255) {
                var21 = 255;
            }
        } else {
            var21 = 0;
        }
        if (~var22 <= -1) {
            if (~var22 < -256) {
                var22 = 255;
            }
        } else {
            var22 = 0;
        }
        if (~var22 < -244) {
            var21 >>= 4;
        } else if (~var22 >= -218) {
            if (~var22 < -193) {
                var21 >>= 2;
            } else if (var22 > 179) {
                var21 >>= 1;
            }
        } else {
            var21 >>= 3;
        }
        return (var20 >> 2 << 10) - -(var21 >> 5 << 7) - -(var22 >> 1);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method2016(byte arg0, String arg1) {
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; ~var5 > ~var2; ++var5) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) + -var3;
        }
        if (arg0 <= 50) {
            method2018(-127);
        }
        ++field4835;
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIB)V")
    public static final void method2017(int arg0, int arg1, int arg2, byte arg3) {
        ++field4855;
        class69 var4 = class255.method1723((byte) 32, arg2, 9);
        var4.method556((byte) -117);
        var4.field1088 = arg1;
        int var5 = -32 / ((27 - arg3) / 54);
        var4.field1091 = arg0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        ++field4853;
        if (arg2 == 102) {
            if (~arg1 != -1) {
                if (~arg1 == -2) {
                    this.field4840 = arg0.method265(-90) == 1;
                }
            } else {
                this.field4833 = arg0.method260((byte) -67);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class301() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
    public static final void method2018(int arg0) {
        ++field4857;
        class110.field1705.method61(false);
        for (int var1 = 0; var1 < 32; ++var1) {
            class270.field4285[var1] = 0L;
        }
        if (arg0 != 4096) {
            field4845 = -105;
        }
        for (int var2 = 0; var2 < 32; ++var2) {
            class254.field4060[var2] = 0L;
        }
        class191.field2993 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
    public static final void method2019(int arg0) {
        class282 var1 = (class282) class22.field350.method6(-112);
        ++field4858;
        while (var1 != null) {
            class240 var2 = var1.field4453;
            if (~class130.field1941 == ~var2.field3794 && var2.field3804 >= class41.field686) {
                if (class41.field686 >= var2.field3803) {
                    if (~var2.field3820 < -1) {
                        class161 var3 = class116.field1781[var2.field3820 + -1];
                        if (var3 != null && ~var3.field4725 <= -1 && var3.field4725 < 13312 && var3.field4709 >= 0 && ~var3.field4709 > -13313) {
                            var2.method1637(var3.field4709, class41.field686, var3.field4725, 0, class254.method1721(-580808345, var2.field3794, var3.field4709, var3.field4725) - var2.field3807);
                        }
                    }
                    if (var2.field3820 < 0) {
                        int var4 = -var2.field3820 - 1;
                        class136 var5;
                        if (class107.field1677 != var4) {
                            var5 = class233.field3682[var4];
                        } else {
                            var5 = class263.field4168;
                        }
                        if (var5 != null && ~var5.field4725 <= -1 && var5.field4725 < 13312 && var5.field4709 >= 0 && var5.field4709 < 13312) {
                            var2.method1637(var5.field4709, class41.field686, var5.field4725, 0, class254.method1721(arg0 ^ 580783936, var2.field3794, var5.field4709, var5.field4725) - var2.field3807);
                        }
                    }
                    var2.method1642(true, class209.field3230);
                    class147.method1071(class130.field1941, (int) var2.field3808, (int) var2.field3793, (int) var2.field3822, 60, var2, var2.field3797, -1L, false);
                }
            } else {
                var1.method995((byte) -113);
            }
            var1 = (class282) class22.field350.method11((byte) 43);
        }
        if (arg0 != -25049) {
            method2020(40);
        }
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)V")
    public static final void method2020(int arg0) {
        if (arg0 <= -102) {
            ++field4844;
            class238.field3751.method1169(true);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZILte;II)V")
    public static final void method2021(int arg0, boolean arg1, int arg2, class80 arg3, int arg4, int arg5) {
        ++field4854;
        if (~arg3.field1231 != 0 || arg3.field1214 != null) {
            int var6 = 0;
            if (arg0 <= arg3.field1221) {
                if (arg3.field1222 > arg0) {
                    var6 += -arg0 + arg3.field1222;
                }
            } else {
                var6 += arg0 - arg3.field1221;
            }
            int var7 = class70.field1106 * arg3.field1232 >> 8;
            if (arg4 <= arg3.field1224) {
                if (arg3.field1233 > arg4) {
                    var6 += -arg4 + arg3.field1233;
                }
            } else {
                var6 += -arg3.field1224 + arg4;
            }
            if (~arg3.field1225 != -1 && ~(var6 - 64) >= ~arg3.field1225 && class70.field1106 != 0 && ~arg3.field1211 == ~arg2) {
                var6 -= 64;
                if (var6 < 0) {
                    var6 = 0;
                }
                int var8 = (-var6 + arg3.field1225) * var7 / arg3.field1225;
                if (arg3.field1220 != null) {
                    arg3.field1220.method872(var8);
                } else if (~arg3.field1231 <= -1) {
                    class71 var9 = class71.method567(class150.field2231, arg3.field1231, 0);
                    if (var9 != null) {
                        class90 var10 = var9.method565().method689(class182.field2875);
                        class119 var11 = class119.method869(var10, 100, var8);
                        var11.method878(-1);
                        class83.field1251.method244(var11);
                        arg3.field1220 = var11;
                    }
                }
                if (arg3.field1219 == null) {
                    if (arg3.field1214 != null && ~(arg3.field1216 -= arg5) >= -1) {
                        int var12 = (int) (Math.random() * (double) arg3.field1214.length);
                        class71 var13 = class71.method567(class150.field2231, arg3.field1214[var12], 0);
                        if (var13 != null) {
                            class90 var14 = var13.method565().method689(class182.field2875);
                            class119 var15 = class119.method869(var14, 100, var8);
                            var15.method878(0);
                            class83.field1251.method244(var15);
                            arg3.field1219 = var15;
                            arg3.field1216 = arg3.field1235 - -((int) ((double) (-arg3.field1235 + arg3.field1228) * Math.random()));
                        }
                    }
                } else {
                    arg3.field1219.method872(var8);
                    if (!arg3.field1219.method997(-100)) {
                        arg3.field1219 = null;
                    }
                }
                if (arg1) {
                    field4847 = null;
                }
            } else {
                if (arg3.field1220 != null) {
                    class83.field1251.method243(arg3.field1220);
                    arg3.field1220 = null;
                }
                if (arg3.field1219 != null) {
                    class83.field1251.method243(arg3.field1219);
                    arg3.field1219 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)V")
    public static void method2022(int arg0) {
        field4848 = null;
        field4847 = null;
        field4846 = null;
        field4837 = null;
        field4842 = null;
        if (arg0 != -1) {
            field4839 = -53;
        }
        field4836 = null;
        field4851 = null;
        field4856 = null;
        field4843 = null;
        field4838 = null;
    }
}
