import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class166 extends class300 {

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "Z")
    private boolean field2558 = true;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    private int field2563 = 4096;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field2567 = 10;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "Ljf;")
    public static class216 field2560 = new class216(64);

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "[I")
    public static int[] field2569;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field2566;
        if (arg1 >= -43) {
            this.method35((class170) null, (byte) -84, -37);
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field2558 = ~arg0.method1218(-106) == -2;
            }
        } else {
            this.field2563 = arg0.method1186((byte) -110);
        }
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)V")
    public static final void method1135(byte arg0) {
        if (arg0 == 120) {
            ++field2565;
            for (class211 var1 = (class211) class108.field1576.method1548(arg0 ^ 120); var1 != null; var1 = (class211) class108.field1576.method1549(124)) {
                class142 var2 = var1.field3294;
                if (~class148.field2204 == ~var2.field2095 && ~var2.field2108 <= ~class311.field4996) {
                    if (var2.field2073 <= class311.field4996) {
                        if (var2.field2091 > 0) {
                            class86 var3 = class191.field3045[var2.field2091 + -1];
                            if (var3 != null && var3.field3915 >= 0 && var3.field3915 < 13312 && var3.field3920 >= 0 && ~var3.field3920 > -13313) {
                                var2.method927(class52.method351(-93, var3.field3920, var3.field3915, var2.field2095) - var2.field2116, var3.field3915, 0, var3.field3920, class311.field4996);
                            }
                        }
                        if (~var2.field2091 > -1) {
                            int var4 = -var2.field2091 + -1;
                            class1 var5;
                            if (~class22.field289 == ~var4) {
                                var5 = class214.field3347;
                            } else {
                                var5 = class35.field409[var4];
                            }
                            if (var5 != null && var5.field3915 >= 0 && var5.field3915 < 13312 && ~var5.field3920 <= -1 && var5.field3920 < 13312) {
                                var2.method927(class52.method351(-120, var5.field3920, var5.field3915, var2.field2095) + -var2.field2116, var5.field3915, 0, var5.field3920, class311.field4996);
                            }
                        }
                        var2.method919(false, class135.field1949);
                        class71.method464(class148.field2204, (int) var2.field2085, (int) var2.field2114, (int) var2.field2089, 60, var2, var2.field2096, -1L, false);
                    }
                } else {
                    var1.method1764(64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(IBI)I")
    public static final int method1136(int arg0, byte arg1, int arg2) {
        if (arg1 != -74) {
            method1137(53);
        }
        class182 var3 = (class182) class38.field464.method1064(-1, (long) arg0);
        ++field2562;
        if (var3 == null) {
            return 0;
        } else {
            return ~arg2 <= -1 && var3.field2866.length > arg2 ? var3.field2866[arg2] : 0;
        }
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V")
    public static void method1137(int arg0) {
        field2569 = null;
        if (arg0 <= -84) {
            field2560 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        int[][] var3 = super.field4786.method538(arg1, (byte) 87);
        ++field2559;
        int var4 = 71 / (-arg0 / 47);
        if (super.field4786.field1200) {
            int[] var5 = this.method2018(0, -1, arg1 + -1 & class285.field4611);
            int[] var6 = this.method2018(0, -1, arg1);
            int[] var7 = this.method2018(0, -1, arg1 + 1 & class285.field4611);
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class180.field2826; ++var11) {
                int var12 = (var7[var11] - var5[var11]) * this.field2563;
                int var13 = (var6[class277.field4503 & var11 + 1] + -var6[var11 + -1 & class277.field4503]) * this.field2563;
                int var14 = var13 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var12 >> 12;
                int var17 = var16 * var16 >> 12;
                int var18 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 + 4096 + var15) / 4096.0F)));
                int var19;
                int var20;
                int var21;
                if (~var18 != -1) {
                    var19 = 16777216 / var18;
                    var20 = var12 / var18;
                    var21 = var13 / var18;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                }
                if (this.field2558) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var21 = (var21 >> 1) + 2048;
                }
                var8[var11] = var21;
                var10[var11] = var20;
                var9[var11] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZIZ)V")
    public static final void method1138(int arg0, boolean arg1, int arg2, boolean arg3) {
        ++field2568;
        if (arg2 <= 113) {
            field2561 = 77;
        }
        int var10002;
        for (int var4 = 0; ~var4 > ~class80.field1211; ++var4) {
            class86 var21 = class191.field3045[class187.field2939[var4]];
            if (var21 != null && var21.method1(5) && var21.field1321.method849(189076065)) {
                int var22 = var21.method8((byte) -45);
                if (!arg3) {
                    if (!var21.field1321.field1917 == arg1 || ~arg0 != -1 && ~arg0 != ~var22) {
                        continue;
                    }
                } else if (!var21.field1321.field1938) {
                    continue;
                }
                if (~var22 == -2) {
                    if (~(127 & var21.field3915) == -65 && ~(var21.field3920 & 127) == -65) {
                        int var23 = var21.field3915 >> 7;
                        int var24 = var21.field3920 >> 7;
                        if (~var23 <= -1 && var23 < 104 && var24 >= 0 && var24 < 104) {
                            var10002 = class114.field1671[var23][var24]++;
                        }
                    }
                } else if (((var22 & 1) != 0 || (127 & var21.field3915) == 0 && (var21.field3920 & 127) == 0) && ((1 & var22) != 1 || (127 & var21.field3915) == 64 && (var21.field3920 & 127) == 64)) {
                    int var25 = -(var22 * 64) + var21.field3915 >> 7;
                    int var26 = -(var22 * 64) + var21.field3920 >> 7;
                    int var27 = var21.method8((byte) -120) + var25;
                    int var28 = var26 - -var21.method8((byte) -123);
                    if (~var28 < -105) {
                        var28 = 104;
                    }
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                    if (~var27 < -105) {
                        var27 = 104;
                    }
                    for (int var29 = var25; ~var27 < ~var29; ++var29) {
                        for (int var30 = var26; var30 < var28; ++var30) {
                            var10002 = class114.field1671[var29][var30]++;
                        }
                    }
                }
            }
        }
        label210: for (int var5 = 0; ~var5 > ~class80.field1211; ++var5) {
            long var6 = 536870912L | (long) class187.field2939[var5] << 32;
            class86 var8 = class191.field3045[class187.field2939[var5]];
            if (var8 != null && var8.method1(5) && var8.field1321.method849(189076065)) {
                int var9 = var8.method8((byte) -65);
                if (arg3) {
                    if (!var8.field1321.field1938) {
                        continue;
                    }
                } else if (arg1 == !var8.field1321.field1917 || arg0 != 0 && ~arg0 != ~var9) {
                    continue;
                }
                var8.field3903 = true;
                if (~var9 == -2) {
                    if ((var8.field3915 & 127) == 64 && (var8.field3920 & 127) == 64) {
                        int var10 = var8.field3920 >> 7;
                        int var11 = var8.field3915 >> 7;
                        if (~var11 > -1 || ~var11 <= -105 || var10 < 0 || ~var10 <= -105) {
                            continue;
                        }
                        if (~class114.field1671[var11][var10] < -2) {
                            var10002 = class114.field1671[var11][var10]--;
                            continue;
                        }
                    }
                } else if (~(var9 & 1) == -1 && (var8.field3915 & 127) == 0 && ~(127 & var8.field3920) == -1 || ~(var9 & 1) == -2 && (var8.field3915 & 127) == 64 && ~(var8.field3920 & 127) == -65) {
                    int var12 = -(var9 * 64) + var8.field3915 >> 7;
                    int var13 = -(var9 * 64) + var8.field3920 >> 7;
                    int var14 = var9 + var12;
                    if (~var12 > -1) {
                        var12 = 0;
                    }
                    if (~var14 < -105) {
                        var14 = 104;
                    }
                    int var15 = var9 + var13;
                    boolean var16 = true;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    if (var15 > 104) {
                        var15 = 104;
                    }
                    for (int var17 = var12; ~var14 < ~var17; ++var17) {
                        for (int var20 = var13; var15 > var20; ++var20) {
                            if (class114.field1671[var17][var20] <= 1) {
                                var16 = false;
                                break;
                            }
                        }
                    }
                    if (var16) {
                        int var18 = var12;
                        while (true) {
                            if (var14 <= var18) {
                                continue label210;
                            }
                            for (int var19 = var13; var15 > var19; ++var19) {
                                var10002 = class114.field1671[var18][var19]--;
                            }
                            ++var18;
                        }
                    }
                }
                var8.field3903 = false;
                if (!var8.field1321.field1906) {
                    var6 |= Long.MIN_VALUE;
                }
                var8.field3986 = class52.method351(-100, var8.field3920, var8.field3915, class148.field2204);
                class71.method464(class148.field2204, var8.field3915, var8.field3920, var8.field3986, var9 * 64 + 60 + -64, var8, var8.field3913, var6, var8.field3956);
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class166() {
        super(1, false);
    }
}
