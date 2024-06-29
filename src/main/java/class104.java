import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class104 extends class23 {

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
    private int field1880 = 4096;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    private int field1877 = 2048;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
    private int field1888 = 8192;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    private int field1887 = 0;

    @OriginalMember(owner = "client!jf", name = "mb", descriptor = "I")
    private int field1899 = 12288;

    @OriginalMember(owner = "client!jf", name = "jb", descriptor = "I")
    private int field1896 = 2048;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    private int field1883 = 0;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "Li;")
    public static class88 field1881 = class208.method1425(105, "(Y");

    @OriginalMember(owner = "client!jf", name = "fb", descriptor = "Li;")
    public static class88 field1892 = class208.method1425(105, "Stufe)2");

    @OriginalMember(owner = "client!jf", name = "lb", descriptor = "I")
    public static int field1898 = -1;

    @OriginalMember(owner = "client!jf", name = "kb", descriptor = "I")
    public static int field1897 = 0;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "Z")
    public static boolean field1884 = true;

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "Li;")
    public static class88 field1895 = class208.method1425(105, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!jf", name = "gb", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "Lkj;")
    public static class119 field1894;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(IBI)Z")
    private final boolean method717(int arg0, byte arg1, int arg2) {
        ++field1889;
        int var4 = 83 % ((arg1 - -28) / 60);
        int var5 = (arg2 - -arg0) * this.field1899 >> 12;
        int var6 = class150.field2922[(var5 * 255 & 1045553) >> 12];
        int var7 = (var6 << 12) / this.field1899;
        int var8 = (var7 << 12) / this.field1888;
        int var9 = this.field1880 * var8 >> 12;
        return ~(-arg0 + arg2) > ~var9 && ~(-var9) > ~(-arg0 + arg2);
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
    public static void method718(int arg0) {
        field1892 = null;
        field1881 = null;
        if (arg0 < -76) {
            field1894 = null;
            field1895 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)I")
    public static final int method719(byte arg0) {
        ++field1891;
        if (arg0 <= 114) {
            field1895 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)Z")
    public static final boolean method720(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class71.field1316; ++var3) {
            class13 var4 = class159.field3077[var3];
            if (var4.field206 == 1) {
                int var5 = var4.field185 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field199 * var5 >> 8) + var4.field191;
                    int var7 = (var4.field186 * var5 >> 8) + var4.field205;
                    int var8 = (var4.field188 * var5 >> 8) + var4.field189;
                    int var9 = (var4.field201 * var5 >> 8) + var4.field196;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field206 == 2) {
                int var10 = arg0 - var4.field185;
                if (var10 > 0) {
                    int var11 = (var4.field199 * var10 >> 8) + var4.field191;
                    int var12 = (var4.field186 * var10 >> 8) + var4.field205;
                    int var13 = (var4.field188 * var10 >> 8) + var4.field189;
                    int var14 = (var4.field201 * var10 >> 8) + var4.field196;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field206 == 3) {
                int var15 = var4.field191 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field197 * var15 >> 8) + var4.field185;
                    int var17 = (var4.field195 * var15 >> 8) + var4.field193;
                    int var18 = (var4.field188 * var15 >> 8) + var4.field189;
                    int var19 = (var4.field201 * var15 >> 8) + var4.field196;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field206 == 4) {
                int var20 = arg2 - var4.field191;
                if (var20 > 0) {
                    int var21 = (var4.field197 * var20 >> 8) + var4.field185;
                    int var22 = (var4.field195 * var20 >> 8) + var4.field193;
                    int var23 = (var4.field188 * var20 >> 8) + var4.field189;
                    int var24 = (var4.field201 * var20 >> 8) + var4.field196;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field206 == 5) {
                int var25 = arg1 - var4.field189;
                if (var25 > 0) {
                    int var26 = (var4.field197 * var25 >> 8) + var4.field185;
                    int var27 = (var4.field195 * var25 >> 8) + var4.field193;
                    int var28 = (var4.field199 * var25 >> 8) + var4.field191;
                    int var29 = (var4.field186 * var25 >> 8) + var4.field205;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        class108.method742(-10798);
        ++field1878;
        if (arg0 != -69) {
            method722(49, -83, -3, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field1888 = arg0.method301(27);
                                }
                            } else {
                                this.field1880 = arg0.method301(65);
                            }
                        } else {
                            this.field1899 = arg0.method301(47);
                        }
                    } else {
                        this.field1896 = arg0.method301(arg1 ^ -69);
                    }
                } else {
                    this.field1883 = arg0.method301(32);
                }
            } else {
                this.field1887 = arg0.method301(118);
            }
        } else {
            this.field1877 = arg0.method301(101);
        }
        ++field1890;
        if (arg1 != -3) {
            method718(-58);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field1893;
        int[] var3 = super.field379.method1080(false, arg0);
        if (arg1 <= 19) {
            method719((byte) -31);
        }
        if (super.field379.field3100) {
            int var4 = class111.field2023[arg0] + -2048;
            for (int var5 = 0; class70.field1276 > var5; ++var5) {
                int var6 = class22.field351[var5] + -2048;
                int var7 = this.field1877 + var6;
                int var8 = this.field1887 + var4;
                int var9 = ~var8 <= 2047 ? var8 : var8 - -4096;
                int var10 = ~var9 < -2049 ? var9 + -4096 : var9;
                int var11 = var7 < -2048 ? var7 + 4096 : var7;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field1896 + var4;
                int var14 = var13 < -2048 ? var13 + 4096 : var13;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = this.field1883 + var6;
                int var17 = var16 >= -2048 ? var16 : var16 - -4096;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method724(var12, var10, -120) && !this.method717(var18, (byte) 92, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BIIII)V")
    public static final void method721(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1882;
        if (class228.field4278 < 100) {
            class189.method1321((byte) 126);
        }
        class72.method480(arg3, arg4, arg1 + arg3, arg2 + arg4);
        if (class228.field4278 < 100) {
            int var5 = arg1 / 2 + arg3;
            byte var6 = 20;
            int var7 = arg2 / 2 + -var6 + -18 + arg4;
            class72.method478(arg3, arg4, arg1, arg2, 0);
            class72.method476(var5 + -152, var7, 304, 34, 9179409);
            class72.method476(var5 + -151, var7 + 1, 302, 32, 0);
            class72.method478(var5 + -150, var7 + 2, class228.field4278 * 3, 30, 9179409);
            class72.method478(var5 + -150 - -(class228.field4278 * 3), var7 - -2, -(class228.field4278 * 3) + 300, 30, 0);
            class54.field1011.method141(class196.field3765, var5, var7 - -var6, 16777215, -1);
        } else {
            class39.field693 = -((int) ((double) arg1 / class59.field1110)) + class126.field2332;
            int var8 = class126.field2332 - (int) ((double) arg1 / class59.field1110);
            class43.field727 = class157.field3035 - (int) ((double) arg2 / class59.field1110);
            class164.field3138 = (int) ((double) (arg2 * 2) / class59.field1110);
            int var9 = -((int) ((double) arg2 / class59.field1110)) + class157.field3035;
            if (arg0 >= 0) {
                class71.field1309 = (int) ((double) (arg1 * 2) / class59.field1110);
                int var10 = (int) ((double) arg1 / class59.field1110) + class126.field2332;
                int var11 = (int) ((double) arg2 / class59.field1110) + class157.field3035;
                class46.method348(arg2 + arg4, arg3 - -arg1, arg3, (byte) 78, arg4, var11, var8, var10, var9);
                class223.method1502(arg4, -1, arg3, arg1 + arg3, arg2 + arg4, var9, var10, var8, var11);
                if (class54.field1012 > 0) {
                    --class54.field1012;
                }
                if (class148.field2770) {
                    int var12 = arg1 + -5 + arg3;
                    int var13 = arg2 + arg4 + -8;
                    class3.field30.method150(class166.method1142(new class88[] { class53.field993, class170.method1214(class13.field192, -107) }, -3), var12, var13, 16776960, -1);
                    int var17 = var13 - 15;
                    Runtime var14 = Runtime.getRuntime();
                    int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
                    int var16 = 16776960;
                    if (~var15 < -65537) {
                        var16 = 16711680;
                    }
                    class3.field30.method150(class166.method1142(new class88[] { class71.field1325, class170.method1214(var15, 67), class77.field1385 }, -3), var12, var17, var16, -1);
                    var13 = var17 - 15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIB)Lpe;")
    public static final class168 method722(int arg0, int arg1, int arg2, byte arg3) {
        class168 var4 = new class168();
        var4.field3235 = arg0;
        if (arg3 != 105) {
            field1884 = false;
        }
        ++field1886;
        var4.field3231 = arg2;
        class128.field2397.method1054((long) arg1, var4, -1);
        class149.method1007(arg2, arg3 + -106);
        class174 var5 = class239.method1581(-64, arg1);
        if (var5 != null) {
            class200.method1373(arg3 ^ 65385, var5);
        }
        if (class53.field967 != null) {
            class200.method1373(65280, class53.field967);
            class53.field967 = null;
        }
        class108.field1960 = false;
        class203.field3864 = 0;
        class126.method863(class47.field889, class237.field4423, class234.field4385, class86.field1549, (byte) -126);
        if (var5 != null) {
            class110.method761(false, var5, (byte) -104);
        }
        class146.method974((byte) -87, arg2);
        if (class43.field723 != -1) {
            class137.method914(class43.field723, 1, arg3 + -101);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lu;I)V")
    public static final void method723(class218 arg0, int arg1) {
        ++field1885;
        arg0.field4095 = false;
        if (arg0.field4108 != -1) {
            class109 var2 = class15.method75(arg0.field4108, (byte) 77);
            if (var2 != null && var2.field1967 != null) {
                ++arg0.field4113;
                if (arg0.field4129 < var2.field1967.length && var2.field1992[arg0.field4129] < arg0.field4113) {
                    arg0.field4113 = 1;
                    ++arg0.field4129;
                    class60.method433(-122, class240.field4458 == arg0, arg0.field4123, arg0.field4129, arg0.field4138, var2);
                }
                if (~arg0.field4129 <= ~var2.field1967.length) {
                    arg0.field4129 = 0;
                    arg0.field4113 = 0;
                    class60.method433(99, class240.field4458 == arg0, arg0.field4123, arg0.field4129, arg0.field4138, var2);
                }
            } else {
                arg0.field4108 = -1;
            }
        }
        if (~arg0.field4082 != arg1 && class117.field2115 >= arg0.field4084) {
            if (arg0.field4077 < 0) {
                arg0.field4077 = 0;
            }
            int var3 = class62.method441(arg0.field4082, (byte) 20).field542;
            if (var3 != -1) {
                class109 var4 = class15.method75(var3, (byte) 90);
                if (var4 != null && var4.field1967 != null) {
                    ++arg0.field4122;
                    if (~var4.field1967.length < ~arg0.field4077 && ~var4.field1992[arg0.field4077] > ~arg0.field4122) {
                        ++arg0.field4077;
                        arg0.field4122 = 1;
                        class60.method433(-114, class240.field4458 == arg0, arg0.field4123, arg0.field4077, arg0.field4138, var4);
                    }
                    if (~arg0.field4077 <= ~var4.field1967.length) {
                        arg0.field4082 = -1;
                    }
                } else {
                    arg0.field4082 = -1;
                }
            } else {
                arg0.field4082 = -1;
            }
        }
        if (~arg0.field4079 != 0 && arg0.field4142 <= 1) {
            class109 var5 = class15.method75(arg0.field4079, (byte) -55);
            if (~var5.field1985 == -2 && arg0.field4139 > 0 && ~arg0.field4135 >= ~class117.field2115 && class117.field2115 > arg0.field4132) {
                arg0.field4142 = 1;
                return;
            }
        }
        if (arg0.field4079 != -1 && arg0.field4142 == 0) {
            class109 var6 = class15.method75(arg0.field4079, (byte) 118);
            if (var6 != null && var6.field1967 != null) {
                ++arg0.field4100;
                if (~arg0.field4103 > ~var6.field1967.length && var6.field1992[arg0.field4103] < arg0.field4100) {
                    arg0.field4100 = 1;
                    ++arg0.field4103;
                    class60.method433(20, class240.field4458 == arg0, arg0.field4123, arg0.field4103, arg0.field4138, var6);
                }
                if (arg0.field4103 >= var6.field1967.length) {
                    ++arg0.field4134;
                    arg0.field4103 -= var6.field1974;
                    if (~arg0.field4134 > ~var6.field1972) {
                        if (~arg0.field4103 <= -1 && arg0.field4103 < var6.field1967.length) {
                            class60.method433(-120, class240.field4458 == arg0, arg0.field4123, arg0.field4103, arg0.field4138, var6);
                        } else {
                            arg0.field4079 = -1;
                        }
                    } else {
                        arg0.field4079 = -1;
                    }
                }
                arg0.field4095 = var6.field1962;
            } else {
                arg0.field4079 = -1;
            }
        }
        if (arg0.field4142 > 0) {
            --arg0.field4142;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(III)Z")
    private final boolean method724(int arg0, int arg1, int arg2) {
        ++field1879;
        int var4 = -17 % ((32 - arg2) / 56);
        int var5 = (-arg0 + arg1) * this.field1899 >> 12;
        int var6 = class150.field2922[(var5 * 255 & 1047401) >> 12];
        int var7 = (var6 << 12) / this.field1899;
        int var8 = (var7 << 12) / this.field1888;
        int var9 = this.field1880 * var8 >> 12;
        return ~var9 < ~(arg0 - -arg1) && -var9 < arg0 + arg1;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class104() {
        super(0, true);
    }
}
