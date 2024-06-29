import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class123 extends class198 {

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    private int field1873 = 4096;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    private int field1876 = 4096;

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
    private int field1880 = 409;

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "[I")
    private int[] field1885 = new int[3];

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "I")
    private int field1886 = 4096;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "Z")
    public static boolean field1878 = true;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1879 = "Loaded wordpack";

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "Z")
    public static boolean field1884 = false;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)V")
    public static final void method808(int arg0) {
        ++field1877;
        if (class226.method1572(12283) == 2) {
            byte var1 = (byte) (class80.field1274 + -4 & 255);
            int var2 = class80.field1274 % 104;
            int var3 = 0;
            if (arg0 == 721849927) {
                while (var3 < 4) {
                    for (int var16 = 0; ~var16 > -105; ++var16) {
                        class219.field3506[var3][var2][var16] = var1;
                    }
                    ++var3;
                }
                if (~class165.field2600 != -4) {
                    for (int var4 = 0; var4 < 2; ++var4) {
                        class248.field3942[var4] = -1000000;
                        class216.field3446[var4] = 1000000;
                        class93.field1417[var4] = 0;
                        class218.field3479[var4] = 1000000;
                        class157.field2501[var4] = 0;
                    }
                    if (class92.field1402 == 1) {
                        if ((class128.field1972[class165.field2600][class309.field5006.field836 >> 7][class309.field5006.field850 >> 7] & 4) != 0) {
                            class249.method1735((byte) -88, class309.field5006.field836 >> 7, 0, class309.field5006.field850 >> 7, class27.field346, false);
                        }
                        if (class132.field2037 < 310) {
                            int var5 = class53.field715 >> 7;
                            int var6 = class174.field2724 >> 7;
                            int var7 = class309.field5006.field850 >> 7;
                            int var8 = class309.field5006.field836 >> 7;
                            int var9;
                            if (var5 < var8) {
                                var9 = var8 - var5;
                            } else {
                                var9 = -var8 + var5;
                            }
                            int var10;
                            if (var7 <= var6) {
                                var10 = -var7 + var6;
                            } else {
                                var10 = var7 - var6;
                            }
                            if ((var9 != 0 || ~var10 != -1) && ~var9 < 103 && ~var9 > -105 && var10 > -104 && var10 < 104) {
                                if (~var9 < ~var10) {
                                    int var11 = var10 * 65536 / var9;
                                    int var12 = 32768;
                                    while (~var5 != ~var8) {
                                        if (~var8 < ~var5) {
                                            ++var5;
                                        } else if (~var5 < ~var8) {
                                            --var5;
                                        }
                                        if (~(class128.field1972[class165.field2600][var5][var6] & 4) != -1) {
                                            class249.method1735((byte) -71, var5, 1, var6, class27.field346, false);
                                            return;
                                        }
                                        var12 += var11;
                                        if (~var12 <= -65537) {
                                            var12 -= 65536;
                                            if (~var6 > ~var7) {
                                                ++var6;
                                            } else if (var7 < var6) {
                                                --var6;
                                            }
                                            if (~(class128.field1972[class165.field2600][var5][var6] & 4) != -1) {
                                                class249.method1735((byte) -69, var5, 1, var6, class27.field346, false);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                }
                                int var13 = var9 * 65536 / var10;
                                int var14 = 32768;
                                while (var6 != var7) {
                                    if (var6 < var7) {
                                        ++var6;
                                    } else if (~var7 > ~var6) {
                                        --var6;
                                    }
                                    if ((4 & class128.field1972[class165.field2600][var5][var6]) != 0) {
                                        class249.method1735((byte) -61, var5, 1, var6, class27.field346, false);
                                        return;
                                    }
                                    var14 += var13;
                                    if (~var14 <= -65537) {
                                        var14 -= 65536;
                                        if (var8 > var5) {
                                            ++var5;
                                        } else if (~var5 < ~var8) {
                                            --var5;
                                        }
                                        if ((4 & class128.field1972[class165.field2600][var5][var6]) != 0) {
                                            class249.method1735((byte) -58, var5, 1, var6, class27.field346, false);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            class159.method1055("RC: " + var5 + "," + var6 + " " + var8 + "," + var7 + " " + class101.field1517 + "," + class254.field4063, arg0 ^ -721865478, (Throwable) null);
                            return;
                        }
                    } else {
                        int var15 = class12.method66(class53.field715, class165.field2600, class174.field2724, arg0 + -721849927);
                        if (-class262.field4326 + var15 >= 800 || ~(class128.field1972[class165.field2600][class53.field715 >> 7][class174.field2724 >> 7] & 4) == -1) {
                            return;
                        }
                        class249.method1735((byte) -128, class53.field715 >> 7, 1, class174.field2724 >> 7, class27.field346, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            int var5 = arg1.method1401((byte) -103);
                            this.field1885[2] = class10.method53(0, var5 >> 12);
                            this.field1885[1] = class10.method53(65280, var5) >> 4;
                            this.field1885[0] = class10.method53(267386880, var5 << 4);
                        }
                    } else {
                        this.field1873 = arg1.method1419(74);
                    }
                } else {
                    this.field1886 = arg1.method1419(76);
                }
            } else {
                this.field1876 = arg1.method1419(82);
            }
        } else {
            this.field1880 = arg1.method1419(126);
        }
        int var6 = -103 % ((arg0 - 60) / 61);
        ++field1875;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class123() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)I")
    public static final int method809(int arg0, int arg1) {
        if (arg0 < 98) {
            field1884 = true;
        }
        ++field1874;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        if (arg1 != -2) {
            this.field1873 = -90;
        }
        int[][] var3 = super.field3150.method642(arg0, 1);
        if (super.field3150.field1498) {
            int[][] var4 = this.method1372(0, arg0, (byte) 104);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class42.field590; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field1885[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field1880) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field1885[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field1880) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field1885[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field1880) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field1873 * var12 >> 12;
                            var9[var11] = this.field1886 * var14 >> 12;
                            var10[var11] = this.field1876 * var16 >> 12;
                        }
                    }
                }
            }
        }
        ++field1882;
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(BIIIII)V")
    public static final void method810(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1881;
        if (arg1 == arg3) {
            class103.method670(arg2, arg4, arg5, true, arg3);
        } else {
            if (~class53.field711 >= ~(arg5 - arg3) && class87.field1356 >= arg5 - -arg3 && ~(-arg1 + arg2) <= ~class63.field941 && arg2 - -arg1 <= class75.field1180) {
                class198.method1371((byte) 96, arg4, arg2, arg3, arg1, arg5);
            } else {
                class131.method880(101, arg5, arg3, arg4, arg2, arg1);
            }
            int var6 = 124 % ((arg0 - 61) / 47);
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)V")
    public static final void method811(byte arg0) {
        ++field1883;
        int var1 = 99 / ((-32 - arg0) / 55);
        class66.field974.method144(0);
        class50.field682.method144(0);
        class276.field4561.method144(0);
        class264.field4353.method144(0);
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(B)V")
    public static void method812(byte arg0) {
        field1879 = null;
        int var1 = 79 / ((-65 - arg0) / 53);
    }
}
