import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class126 extends class283 {

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "I")
    private int field1943 = 4096;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "I")
    private int field1942 = 4096;

    @OriginalMember(owner = "client!sk", name = "fb", descriptor = "I")
    private int field1950 = 4096;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    private int field1941 = 409;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "[I")
    private int[] field1940 = new int[3];

    @OriginalMember(owner = "client!sk", name = "eb", descriptor = "Lna;")
    public static class26 field1949 = class69.method505("Musik)2Engine vorbereitet)3", (byte) -121);

    @OriginalMember(owner = "client!sk", name = "gb", descriptor = "J")
    public static long field1951 = 0L;

    @OriginalMember(owner = "client!sk", name = "cb", descriptor = "Lna;")
    public static class26 field1947 = class69.method505("Untersuchen", (byte) -127);

    @OriginalMember(owner = "client!sk", name = "bb", descriptor = "Lgn;")
    public static class5 field1946 = new class5(64);

    @OriginalMember(owner = "client!sk", name = "kb", descriptor = "I")
    public static int field1955 = 0;

    @OriginalMember(owner = "client!sk", name = "lb", descriptor = "Z")
    public static boolean field1956 = false;

    @OriginalMember(owner = "client!sk", name = "ib", descriptor = "I")
    public static int field1953 = 0;

    @OriginalMember(owner = "client!sk", name = "hb", descriptor = "Ln;")
    public static class282 field1952 = new class282(64);

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!sk", name = "ab", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!sk", name = "db", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!sk", name = "jb", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!sk", name = "mb", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILwa;)V", line = 5)
    public static final void method859(int arg0, class82 arg1) {
        if (arg0 != -21774) {
            method861(-115, 107, 60, 70, -41, 115);
        }
        field1935++;
        while (true) {
            while (arg1.field1301 < arg1.field1280.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method642((byte) -23) == 1) {
                    var3 = true;
                    var2 = arg1.method642((byte) -76);
                    var4 = arg1.method642((byte) -88);
                }
                int var5 = arg1.method642((byte) -70);
                int var6 = arg1.method642((byte) -89);
                int var7 = var5 * 64 - class135.field2057;
                int var8 = class317.field5436 + class9.field111 - var6 * 64 - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class38.field623 > var7 + 63 && var8 < class317.field5436) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || (var2 * 8) <= var11 && var2 * 8 + 8 > var11 && var12 >= var4 * 8 && var4 * 8 + 8 > var12) {
                                byte var13 = arg1.method599(false);
                                if (var13 != 0) {
                                    if (class315.field5386[var9][var10] == null) {
                                        class315.field5386[var9][var10] = new byte[4096];
                                    }
                                    class315.field5386[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method599(false);
                                    if (class263.field4310[var9][var10] == null) {
                                        class263.field4310[var9][var10] = new byte[4096];
                                    }
                                    class263.field4310[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method599(false);
                        if (var16 != 0) {
                            arg1.field1301++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIBIII)V", line = 105)
    public static final void method860(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field1938++;
        int var8 = 0;
        int var9 = arg0 - arg3;
        int var10 = 0;
        int var11 = arg7;
        int var12 = arg7 * arg7;
        int var13 = arg7 - arg3;
        int var14 = arg0 * arg0;
        int var15 = var12 << 1;
        int var16 = var13 * var13;
        int var17 = var9 * var9;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = var17 << 1;
        int var21 = var13 << 1;
        int var22 = arg7 << 1;
        int var23 = (1 - var22) * var14 + var15;
        int var24 = var12 - ((var22 - 1) * var18);
        int var25 = (1 - var21) * var17 + var19;
        int var26 = var16 - (var21 - 1) * var20;
        int var27 = var12 << 2;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var15 * 3;
        int var31 = (var22 - 3) * var18;
        int var32 = -113 % ((arg4 - 56) / 41);
        int var33 = var17 << 2;
        int var34 = var19 * 3;
        int var35 = (var21 - 3) * var20;
        int var36 = (arg7 - 1) * var28;
        int var37 = var29;
        int var38 = var27;
        int var39 = (var13 - 1) * var33;
        if (arg5 >= class80.field1259 && class117.field1840 >= arg5) {
            int[] var40 = class45.field710[arg5];
            int var41 = class308.method2151(class27.field454, arg6 - arg0, (byte) 0, class225.field3572);
            int var42 = class308.method2151(class27.field454, arg6 + arg0, (byte) 0, class225.field3572);
            int var43 = class308.method2151(class27.field454, arg6 - var9, (byte) 0, class225.field3572);
            int var44 = class308.method2151(class27.field454, arg6 + var9, (byte) 0, class225.field3572);
            class76.method543(var40, var41, 127, var43, arg2);
            class76.method543(var40, var43, 105, var44, arg1);
            class76.method543(var40, var44, -67, var42, arg2);
        }
        while (var11 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var30;
                    var30 += var27;
                    var8++;
                    var24 += var38;
                    var38 += var27;
                }
            }
            boolean var45 = var11 <= var13;
            if (var24 < 0) {
                var24 += var38;
                var23 += var30;
                var8++;
                var38 += var27;
                var30 += var27;
            }
            if (var45) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var26 += var37;
                        var37 += var29;
                        var25 += var34;
                        var34 += var29;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var37;
                    var25 += var34;
                    var37 += var29;
                    var34 += var29;
                }
                var25 += -var39;
                var39 -= var33;
                var26 += -var35;
                var35 -= var33;
            }
            var24 += -var31;
            var23 += -var36;
            var36 -= var28;
            var31 -= var28;
            var11--;
            int var46 = arg5 + var11;
            int var47 = arg5 - var11;
            if (class80.field1259 <= var46 && class117.field1840 >= var47) {
                int var48 = class308.method2151(class27.field454, arg6 + var8, (byte) 0, class225.field3572);
                int var49 = class308.method2151(class27.field454, arg6 - var8, (byte) 0, class225.field3572);
                if (var45) {
                    int var50 = class308.method2151(class27.field454, arg6 + var10, (byte) 0, class225.field3572);
                    int var51 = class308.method2151(class27.field454, arg6 - var10, (byte) 0, class225.field3572);
                    if (class80.field1259 <= var47) {
                        int[] var52 = class45.field710[var47];
                        class76.method543(var52, var49, 120, var51, arg2);
                        class76.method543(var52, var51, -107, var50, arg1);
                        class76.method543(var52, var50, -102, var48, arg2);
                    }
                    if (var46 <= class117.field1840) {
                        int[] var53 = class45.field710[var46];
                        class76.method543(var53, var49, 87, var51, arg2);
                        class76.method543(var53, var51, -92, var50, arg1);
                        class76.method543(var53, var50, 124, var48, arg2);
                    }
                } else {
                    if (class80.field1259 <= var47) {
                        class76.method543(class45.field710[var47], var49, -122, var48, arg2);
                    }
                    if (class117.field1840 >= var46) {
                        class76.method543(class45.field710[var46], var49, 89, var48, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILwa;Z)V", line = 317)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field1945++;
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            this.field1941 = arg1.method576(1);
        } else if (arg0 == 1) {
            this.field1942 = arg1.method576(1);
        } else if (arg0 == 2) {
            this.field1943 = arg1.method576(1);
        } else if (arg0 == 3) {
            this.field1950 = arg1.method576(1);
        } else if (arg0 == 4) {
            int var5 = arg1.method633((byte) 107);
            this.field1940[2] = class4.method23(var5, 255) >> 12;
            this.field1940[1] = class4.method23(var5 >> 4, 4080);
            this.field1940[0] = class4.method23(16711680, var5) << 4;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)V", line = 387)
    public static final void method861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1937++;
        if (arg1 > -83) {
            field1955 = 115;
        }
        int var6 = arg5 - arg3;
        int var7 = arg2 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class294.method2065(false, arg2, arg4, arg0, arg3);
            }
        } else if (var7 == 0) {
            class196.method1320(arg3, arg0, true, arg5, arg4);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class225.field3572 > arg3) {
                var10 = class225.field3572;
                var11 = (class225.field3572 * var8 >> 12) + var9;
            } else if (arg3 > class27.field454) {
                var11 = (class27.field454 * var8 >> 12) + var9;
                var10 = class27.field454;
            } else {
                var10 = arg3;
                var11 = arg4;
            }
            int var12;
            int var13;
            if (arg5 < class225.field3572) {
                var12 = class225.field3572;
                var13 = (class225.field3572 * var8 >> 12) + var9;
            } else if (class27.field454 < arg5) {
                var12 = class27.field454;
                var13 = var9 + (class27.field454 * var8 >> 12);
            } else {
                var13 = arg2;
                var12 = arg5;
            }
            if (class80.field1259 > var13) {
                var12 = (class80.field1259 - var9 << 12) / var8;
                var13 = class80.field1259;
            } else if (var13 > class117.field1840) {
                var13 = class117.field1840;
                var12 = (class117.field1840 - var9 << 12) / var8;
            }
            if (var11 < class80.field1259) {
                var11 = class80.field1259;
                var10 = (class80.field1259 - var9 << 12) / var8;
            } else if (class117.field1840 < var11) {
                var11 = class117.field1840;
                var10 = (class117.field1840 - var9 << 12) / var8;
            }
            class86.method677((byte) 6, arg0, var13, var11, var12, var10);
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V", line = 489)
    public class126() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(JI)V", line = 504)
    public static final void method862(long arg0, int arg1) {
        field1934++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class244.method1685(arg0 - 1L, (byte) -123);
            class244.method1685(1L, (byte) 24);
        } else {
            class244.method1685(arg0, (byte) -128);
        }
        if (arg1 != 64) {
            method863(4, -35);
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(II)I", line = 527)
    public static final int method863(int arg0, int arg1) {
        if (arg0 != 2) {
            field1954 = -40;
        }
        field1939++;
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(B)V", line = 551)
    public static void method864(byte arg0) {
        int var1 = 100 / ((76 - arg0) / 44);
        field1952 = null;
        field1949 = null;
        field1947 = null;
        field1946 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lve;I)Z", line = 562)
    public static final boolean method865(class266 arg0, int arg1) {
        field1948++;
        return arg0.method1900(arg1, class324.field5598);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)[[I", line = 597)
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method3(51, 104);
        }
        int[][] var3 = this.field4719.method2182((byte) 91, arg1);
        if (this.field4719.field5381) {
            int[][] var4 = this.method1994(arg1, 0, (byte) -96);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class101.field1632; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field1940[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field1941 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field1940[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field1941) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field1940[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field1941) {
                            var8[var11] = this.field1950 * var12 >> 12;
                            var9[var11] = this.field1943 * var14 >> 12;
                            var10[var11] = this.field1942 * var16 >> 12;
                        } else {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        }
                    }
                }
            }
        }
        field1944++;
        return var3;
    }
}
