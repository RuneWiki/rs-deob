import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class144 extends class139 {

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    private int field1901 = 819;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    private int field1899 = 0;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    private int field1907 = 1024;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    private int field1911 = 1024;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    private int field1913 = 1024;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    private int field1909 = 0;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    private int field1914 = 409;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    private int field1898 = 2048;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    private int field1904 = 1024;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "Z")
    public static boolean field1910 = false;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "Lo;")
    public static class24 field1912 = new class24("WTRC", 1);

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    private int field1902;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "[I")
    public static int[] field1905;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        ++field1908;
        if (arg0 != 7) {
            field1900 = 86;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field1911 = arg0.method1729(65280);
                                        }
                                    } else {
                                        this.field1904 = arg0.method1729(arg1 ^ -65325);
                                    }
                                } else {
                                    this.field1899 = arg0.method1701(-23121);
                                }
                            } else {
                                this.field1913 = arg0.method1729(65280);
                            }
                        } else {
                            this.field1901 = arg0.method1729(65280);
                        }
                    } else {
                        this.field1914 = arg0.method1729(65280);
                    }
                } else {
                    this.field1898 = arg0.method1729(arg1 ^ -65325);
                }
            } else {
                this.field1907 = arg0.method1729(65280);
            }
        } else {
            this.field1909 = arg0.method1701(arg1 ^ 23164);
        }
        if (arg1 != -45) {
            this.method23(-27);
        }
        ++field1906;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public static void method897(int arg0) {
        int var1 = -36 % ((arg0 - -37) / 43);
        field1912 = null;
        field1905 = null;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class144() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        if (arg1 != 27782) {
            this.field1902 = 23;
        }
        ++field1915;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (super.field1844.field5045) {
            int[][] var4 = super.field1844.method2175(-95);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class356.field5147 * this.field1907 >> 12;
            int var15 = class356.field5147 * this.field1898 >> 12;
            int var16 = class241.field3615 * this.field1914 >> 12;
            int var17 = class241.field3615 * this.field1901 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                this.field1902 = class356.field5147 / 8 * this.field1913 >> 12;
                int var18 = class356.field5147 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field1909);
                while (true) {
                    while (true) {
                        int var22 = var14 + class351.method2194(103, var21, -var14 + var15);
                        int var23 = class351.method2194(72, var21, -var16 + var17) + var16;
                        int var24 = var8 + var22;
                        if (class356.field5147 < var24) {
                            var22 = -var8 + class356.field5147;
                            var24 = class356.field5147;
                        }
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (~var28 > -1) {
                                var28 += class356.field5147;
                            }
                            if (class356.field5147 < var28) {
                                var28 -= class356.field5147;
                            }
                            var29 = var26[2];
                            while (true) {
                                int[] var30 = var20[var25];
                                if (~var28 <= ~var30[0] && ~var30[1] <= ~var28) {
                                    if (~var9 != ~var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class356.field5147;
                                        }
                                        if (~var31 < ~class356.field5147) {
                                            var31 -= class356.field5147;
                                        }
                                        for (int var32 = 1; var32 <= var27; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var27; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var29 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var28 <= var31) {
                                                    if (~var36 == -1) {
                                                        var38 = 0;
                                                        var39 = Math.min(var28, var37);
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class356.field5147;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method898(var39 - var38, var35, var29 - var35, var7 + var38, var4, 121, var21);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var27;
                                int var10000 = ~var12;
                                ++var25;
                                if (var10000 >= ~var25) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (~(var23 + var29) >= ~class241.field3615) {
                            var10 = false;
                        } else {
                            var23 = class241.field3615 - var29;
                        }
                        if (~class356.field5147 == ~var24) {
                            this.method898(var22, var29, var23, var8 - -var6, var4, arg1 + -27808, var21);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var29;
                            var41[0] = var8;
                            var41[1] = var24;
                            int[][] var42 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var42;
                            var7 = var6;
                            var13 = 0;
                            var6 = class351.method2194(34, var21, class356.field5147);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class356.field5147 + var5;
                            }
                            if (~class356.field5147 > ~var43) {
                                var43 -= class356.field5147;
                            }
                            var9 = 0;
                            var11 = false;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var43 <= ~var44[0] && var43 <= var44[1]) {
                                    break;
                                }
                                ++var9;
                                if (var12 <= var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[2] = var23 + var29;
                            var45[0] = var8;
                            var45[1] = var24;
                            this.method898(var22, var29, var23, var6 + var8, var4, 109, var21);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII[[IILjava/util/Random;)V")
    private final void method898(int arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5, Random arg6) {
        int var8 = 68 % ((arg5 - 70) / 36);
        ++field1916;
        int var9 = this.field1911 <= 0 ? 4096 : -class351.method2194(-120, arg6, this.field1911) + 4096;
        int var10 = this.field1904 * this.field1902 >> 12;
        int var11 = this.field1902 + -(~var10 >= -1 ? 0 : class351.method2194(-112, arg6, var10));
        if (~arg3 <= ~class356.field5147) {
            arg3 -= class356.field5147;
        }
        if (var11 <= 0) {
            if (~class356.field5147 > ~(arg0 + arg3)) {
                int var12 = class356.field5147 - arg3;
                for (int var13 = 0; ~arg2 < ~var13; ++var13) {
                    int[] var14 = arg4[arg1 + var13];
                    class415.method2446(var14, arg3, var12, var9);
                    class415.method2446(var14, 0, arg0 - var12, var9);
                }
            } else {
                for (int var15 = 0; ~arg2 < ~var15; ++var15) {
                    class415.method2446(arg4[arg1 + var15], arg3, arg0, var9);
                }
            }
        } else if (~arg2 < -1 && arg0 > 0) {
            int var16 = arg0 / 2;
            int var17 = arg2 / 2;
            int var18 = ~var11 < ~var16 ? var16 : var11;
            int var19 = var11 <= var17 ? var11 : var17;
            int var20 = arg3 + var18;
            int var21 = -(var18 * 2) + arg0;
            for (int var22 = 0; arg2 > var22; ++var22) {
                int[] var23 = arg4[var22 - -arg1];
                if (~var19 < ~var22) {
                    int var24 = var9 * var22 / var19;
                    if (~this.field1899 != -1) {
                        for (int var25 = 0; var25 < var18; ++var25) {
                            int var26 = var9 * var25 / var18;
                            var23[class367.method2256(class414.field5822, arg3 + var25)] = var23[class367.method2256(-var25 + arg0 + arg3 + -1, class414.field5822)] = ~var26 > ~var24 ? var26 : var24;
                        }
                    } else {
                        for (int var27 = 0; var27 < var18; ++var27) {
                            int var29 = var9 * var27 / var18;
                            var23[class367.method2256(arg3 + var27, class414.field5822)] = var23[class367.method2256(arg3 - var27 + arg0 + -1, class414.field5822)] = var24 * var29 >> 12;
                        }
                    }
                    if (var20 + var21 <= class356.field5147) {
                        class415.method2446(var23, var20, var21, var24);
                    } else {
                        int var28 = -var20 + class356.field5147;
                        class415.method2446(var23, var20, var28, var24);
                        class415.method2446(var23, 0, -var28 + var21, var24);
                    }
                } else {
                    int var30 = arg2 + -1 + -var22;
                    if (~var19 < ~var30) {
                        int var31 = var9 * var30 / var19;
                        if (~this.field1899 != -1) {
                            for (int var32 = 0; ~var32 > ~var18; ++var32) {
                                int var33 = var9 * var32 / var18;
                                var23[class367.method2256(arg3 + var32, class414.field5822)] = var23[class367.method2256(class414.field5822, -var32 - 1 + arg0 + arg3)] = var31 <= var33 ? var31 : var33;
                            }
                        } else {
                            for (int var34 = 0; var18 > var34; ++var34) {
                                int var36 = var9 * var34 / var18;
                                var23[class367.method2256(class414.field5822, arg3 + var34)] = var23[class367.method2256(-var34 + arg3 + arg0 + -1, class414.field5822)] = var31 * var36 >> 12;
                            }
                        }
                        if (~class356.field5147 <= ~(var20 - -var21)) {
                            class415.method2446(var23, var20, var21, var31);
                        } else {
                            int var35 = -var20 + class356.field5147;
                            class415.method2446(var23, var20, var35, var31);
                            class415.method2446(var23, 0, -var35 + var21, var31);
                        }
                    } else {
                        for (int var37 = 0; ~var18 < ~var37; ++var37) {
                            var23[class367.method2256(class414.field5822, arg3 + var37)] = var23[class367.method2256(class414.field5822, arg3 - -arg0 + -var37 + -1)] = var9 * var37 / var18;
                        }
                        if (~class356.field5147 <= ~(var20 + var21)) {
                            class415.method2446(var23, var20, var21, var9);
                        } else {
                            int var38 = -var20 + class356.field5147;
                            class415.method2446(var23, var20, var38, var9);
                            class415.method2446(var23, 0, var21 - var38, var9);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZIBI)V")
    public static final void method899(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        ++field1917;
        if (class330.field4786 == null) {
            class141.field1878.method1941(arg3, arg0, 1, arg5, arg1, -16777216);
        } else if (~class492.field6935.field4331 <= -1 && class492.field6935.field4331 < class58.field758 * 128 && ~class492.field6935.field4317 <= -1 && class492.field6935.field4317 < class287.field4181 * 128) {
            ++class492.field6932;
            if (class492.field6935 != null && ~(class492.field6935.field4331 + 64 + -(class492.field6935.method918(false) * 64) >> 7) == ~class118.field1493 && ~(class492.field6935.field4317 - (-64 + class492.field6935.method918(false) * 64) >> 7) == ~class359.field5161) {
                class359.field5161 = -1;
                class118.field1493 = -1;
                class401.method2394(0);
            }
            class266.method1637(125);
            if (!arg2) {
                class201.method1243(-9425);
            }
            class465.method2729(arg4 + 385715427);
            class435.method2568(arg3, arg0, 334, arg1, true, arg5);
            int var6 = class334.field4859;
            int var7 = class218.field3268;
            int var8 = class102.field1297;
            int var9 = class280.field4134;
            if (~class136.field1807 == -2) {
                int var10 = (int) class483.field6806;
                if (~(class487.field6867 >> 8) < ~var10) {
                    var10 = class487.field6867 >> 8;
                }
                if (class238.field3570[4] && ~var10 > ~(class23.field306[4] + 128)) {
                    var10 = class23.field306[4] - -128;
                }
                int var11 = (int) class157.field2346 + class191.field2843 & 16383;
                class330.method2092(class353.field5098, class132.method835(class492.field6935.field4317, class29.field394, class492.field6935.field4331, 2002) - 50, (var10 >> 3) * 3 + 600, (byte) -88, var10, var11, var9, class480.field6734);
            } else if (class136.field1807 != 4) {
                if (class136.field1807 == 5) {
                    class472.method2776(var9, (byte) 61);
                }
            } else {
                int var12 = (int) class483.field6806;
                if (~(class487.field6867 >> 8) < ~var12) {
                    var12 = class487.field6867 >> 8;
                }
                if (class238.field3570[4] && var12 < class23.field306[4] + 128) {
                    var12 = class23.field306[4] + 128;
                }
                int var13 = (int) class157.field2346 & 16383;
                class330.method2092(class353.field5098, class132.method835(class317.field4596, class29.field394, class453.field6393, 2002) + -50, (var12 >> 3) * 3 + 600, (byte) -78, var12, var13, var9, class480.field6734);
            }
            int var14 = class490.field6904;
            if (arg4 != -19) {
                method899(18, 70, true, 112, (byte) -68, -79);
            }
            int var15 = class134.field1778;
            int var16 = class343.field4996;
            int var17 = class214.field3219;
            int var18 = class30.field407;
            for (int var19 = 0; ~var19 > -6; ++var19) {
                if (class238.field3570[var19]) {
                    int var22 = (int) ((double) (class407.field5713[var19] * 2 + 1) * Math.random() - (double) class407.field5713[var19] + Math.sin((double) class326.field4709[var19] / 100.0D * (double) class422.field5885[var19]) * (double) class23.field306[var19]);
                    if (~var19 == -4) {
                        class30.field407 = class30.field407 + var22 & 16383;
                    }
                    if (var19 == 2) {
                        class343.field4996 += var22;
                    }
                    if (var19 == 4) {
                        class214.field3219 += var22;
                        if (~class214.field3219 <= -1025) {
                            if (class214.field3219 > 3072) {
                                class214.field3219 = 3072;
                            }
                        } else {
                            class214.field3219 = 1024;
                        }
                    }
                    if (~var19 == -2) {
                        class134.field1778 += var22;
                    }
                    if (var19 == 0) {
                        class490.field6904 += var22;
                    }
                }
            }
            if (class490.field6904 < 0) {
                class490.field6904 = 0;
            }
            if (~class490.field6904 < ~((class287.field4186 << 7) - 1)) {
                class490.field6904 = (class287.field4186 << 7) + -1;
            }
            if (class343.field4996 < 0) {
                class343.field4996 = 0;
            }
            if (~class343.field4996 < ~((class360.field5188 << 7) - 1)) {
                class343.field4996 = (class360.field5188 << 7) + -1;
            }
            class225.method1446(arg4 ^ -28174);
            class105.method594(0);
            class141.field1878.method617(var6, var8, var6 + var7, var8 - -var9);
            class141.field1878.method679();
            int var20 = class368.field5322;
            if (class146.field2100 != null) {
                class146.field2100.method1464(class30.field407, var9, class141.field1878, var6, 126, var8, var20, var7, class214.field3219, class153.field2288 << 3);
            } else {
                class141.field1878.method678(var20);
            }
            class164.method1027(false);
            class478.field6711.method1008(class490.field6904, class134.field1778, class343.field4996, 16383 & -class214.field3219, -class30.field407 & 16383, -class140.field1861 & 16383);
            class141.field1878.method609(class478.field6711);
            class141.field1878.method604(var7 / 2 + var6, var8 - -(var9 / 2), class230.field3479 << 1, class230.field3479 << 1);
            class11.method44(class230.field3479 << 1, (byte) 3, var9 / 2 + var8, class230.field3479 << 1, var7 / 2 + var6);
            class459.method2687(16383 & -class30.field407, -class214.field3219 & 16383, class343.field4996, class490.field6904, -class140.field1861 & 16383, class134.field1778, -8028);
            byte var21 = class314.field4438.method1176(class437.field6083, 1) != 2 ? 1 : (byte) class492.field6932;
            class28.method204(class141.field1878, class353.field5090, class169.field2476, class478.field6711, class490.field6904, class134.field1778, class343.field4996, class177.field2545, class69.field875, class320.field4633, class34.field444, class421.field5881, class30.field405, class492.field6935.field4319 + 1, var21, class492.field6935.field4331 >> 7, class492.field6935.field4317 >> 7, !class314.field4438.field5783);
            class164.method1027(false);
            if (class363.field5227 == 30) {
                class410.method2424(var8, var9, 256, var6, 256, var7, -16709);
                class148.method936(false, 256, 256, var8, var7, var9, var6);
                class161.method1001(256, var9, -12, var8, var7, var6, 256);
                class396.method2382(var9, var6, var7, var8, (byte) -12);
            }
            class229.method1460();
            class343.field4996 = var16;
            class134.field1778 = var15;
            class30.field407 = var18;
            class490.field6904 = var14;
            class214.field3219 = var17;
            if (class138.field1828 && class289.field4210.method358(1) == 0) {
                class138.field1828 = false;
            }
            if (class138.field1828) {
                class141.field1878.method1941(var9, var8, 1, var7, var6, -16777216);
                class306.method1898(class92.field1166, 868, class27.field363.method2065(92, class326.field4711), false);
            }
        } else {
            class141.field1878.method1941(arg3, arg0, 1, arg5, arg1, -16777216);
        }
    }
}
