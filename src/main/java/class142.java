import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class142 extends class51 {

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
    public static int field2933 = 0;

    @OriginalMember(owner = "client!pf", name = "jb", descriptor = "I")
    public static int field2941 = 0;

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "[I")
    public static int[] field2934 = new int[1000];

    @OriginalMember(owner = "client!pf", name = "hb", descriptor = "Led;")
    private static class43 field2939 = class191.method1219("Loaded wordpack", false);

    @OriginalMember(owner = "client!pf", name = "gb", descriptor = "Led;")
    public static class43 field2938 = field2939;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!pf", name = "eb", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!pf", name = "fb", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!pf", name = "ib", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!pf", name = "lb", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!pf", name = "mb", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!pf", name = "nb", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "Ltg;")
    public static class179 field2931;

    @OriginalMember(owner = "client!pf", name = "kb", descriptor = "[I")
    public static int[] field2942;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)Z")
    public static final boolean method903(int arg0, int arg1) {
        int var2 = 6 / ((arg1 - -7) / 52);
        ++field2940;
        return ~arg0 <= -98 && ~arg0 >= -123 || ~arg0 <= -66 && ~arg0 >= -91;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            field2939 = null;
        }
        ++field2935;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            for (int var4 = 0; ~class122.field2442 < ~var4; ++var4) {
                this.method906(-84, arg1, var4);
                int[] var5 = this.method314(0, (byte) -43, class74.field1474);
                var3[var4] = var5[class33.field611];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)I")
    public static final int method904(int arg0) {
        ++field2936;
        int var1 = 3;
        if (class51.field1034 < 310) {
            int var2 = class184.field3617 >> 7;
            int var3 = class188.field3686 >> 7;
            if ((class15.field232[class93.field1839][var2][var3] & 4) != 0) {
                var1 = class93.field1839;
            }
            int var4 = class67.field1348.field2347 >> 7;
            int var5 = class67.field1348.field2328 >> 7;
            int var6;
            if (~var2 <= ~var4) {
                var6 = -var4 + var2;
            } else {
                var6 = var4 - var2;
            }
            int var7;
            if (~var5 < ~var3) {
                var7 = var5 - var3;
            } else {
                var7 = -var5 + var3;
            }
            if (var7 < var6) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var2 != var4) {
                    var9 += var8;
                    if (var2 >= var4) {
                        if (~var2 < ~var4) {
                            --var2;
                        }
                    } else {
                        ++var2;
                    }
                    if ((4 & class15.field232[class93.field1839][var2][var3]) != 0) {
                        var1 = class93.field1839;
                    }
                    if (~var9 <= -65537) {
                        var9 -= 65536;
                        if (var5 <= var3) {
                            if (~var3 < ~var5) {
                                --var3;
                            }
                        } else {
                            ++var3;
                        }
                        if (~(class15.field232[class93.field1839][var2][var3] & 4) != -1) {
                            var1 = class93.field1839;
                        }
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var6 * 65536 / var7;
                while (var3 != var5) {
                    var10 += var11;
                    if (var3 >= var5) {
                        if (var5 < var3) {
                            --var3;
                        }
                    } else {
                        ++var3;
                    }
                    if ((class15.field232[class93.field1839][var2][var3] & 4) != 0) {
                        var1 = class93.field1839;
                    }
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var2 < var4) {
                            ++var2;
                        } else if (var2 > var4) {
                            --var2;
                        }
                        if (~(4 & class15.field232[class93.field1839][var2][var3]) != -1) {
                            var1 = class93.field1839;
                        }
                    }
                }
            }
        }
        if (arg0 != 65536) {
            field2933 = -103;
        }
        if ((4 & class15.field232[class93.field1839][class67.field1348.field2347 >> 7][class67.field1348.field2328 >> 7]) != 0) {
            var1 = class93.field1839;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        int[][] var3 = super.field1027.method1087(arg0, -2);
        ++field2937;
        int[] var4 = var3[1];
        int[] var5 = var3[0];
        int[] var6 = var3[2];
        if (arg1 != -94) {
            field2941 = -118;
        }
        if (super.field1027.field3428) {
            for (int var7 = 0; var7 < class122.field2442; ++var7) {
                this.method906(111, arg0, var7);
                int[][] var8 = this.method306(0, class74.field1474, 0);
                var5[var7] = var8[0][class33.field611];
                var4[var7] = var8[1][class33.field611];
                var6[var7] = var8[2][class33.field611];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field2932;
        if (arg1 != 0) {
            this.method27(40, -48);
        }
        if (~arg2 == -1) {
            super.field1029 = arg0.method538((byte) 113) == 1;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)V")
    public static final void method905(int arg0, int arg1, boolean arg2) {
        ++field2945;
        int[] var3 = new int[4];
        var3[0] = arg0;
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg1;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (class105.field2016[var6] != arg0) {
                var3[var5] = class105.field2016[var6];
                var4[var5] = class119.field2384[var6];
                ++var5;
            }
        }
        class105.field2016 = var3;
        class119.field2384 = var4;
        if (arg2) {
            class136.method881(class107.field2058, class119.field2384, (byte) -63, class107.field2058.length + -1, 0, class105.field2016);
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(III)V")
    private final void method906(int arg0, int arg1, int arg2) {
        ++field2944;
        int var4 = class95.field1855[arg2];
        int var5 = class40.field771[arg1];
        int var6 = -120 % ((arg0 - 73) / 38);
        float var7 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var7 >= -3.141592653589793D && (double) var7 <= -2.356194490192345D) {
            class74.field1474 = arg1;
            class33.field611 = arg2;
        } else if ((double) var7 <= -1.5707963267948966D && (double) var7 >= -2.356194490192345D) {
            class74.field1474 = arg2;
            class33.field611 = arg1;
        } else if ((double) var7 <= -0.7853981633974483D && (double) var7 >= -1.5707963267948966D) {
            class33.field611 = -arg1 + class122.field2442;
            class74.field1474 = arg2;
        } else if (var7 <= 0.0F && (double) var7 >= -0.7853981633974483D) {
            class74.field1474 = -arg1 + class112.field2144;
            class33.field611 = arg2;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class74.field1474 = -arg1 + class112.field2144;
            class33.field611 = -arg2 + class122.field2442;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class33.field611 = class122.field2442 - arg1;
            class74.field1474 = -arg2 + class112.field2144;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class33.field611 = arg1;
            class74.field1474 = -arg2 + class112.field2144;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class74.field1474 = arg1;
            class33.field611 = class122.field2442 - arg2;
        }
        class74.field1474 &= class71.field1407;
        class33.field611 &= class108.field2080;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
    public static void method907(byte arg0) {
        field2942 = null;
        field2938 = null;
        field2939 = null;
        field2931 = null;
        if (arg0 <= -43) {
            field2934 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
    public static final void method908(int arg0) {
        ++field2943;
        if (!class186.field3665) {
            class40.field756[0] = 1003;
            class112.field2141[0] = class156.field3144;
            class41.field799 = 1;
            class115.field2237[0] = class110.field2127;
        }
        if (class187.field3666 != -1) {
            class83.method511(class187.field3666, true);
        }
        for (int var1 = 0; var1 < class125.field2476; ++var1) {
            if (class107.field2056[var1]) {
                class21.field355[var1] = true;
            }
            class9.field165[var1] = class107.field2056[var1];
            class107.field2056[var1] = false;
        }
        class87.field1705 = -1;
        class167.field3323 = null;
        int var2 = -94 / ((30 - arg0) / 44);
        class60.field1234 = client.field559;
        class188.field3687 = -1;
        if (~class187.field3666 != 0) {
            class125.field2476 = 0;
            class52.method316(0, 0, 0, 115, 765, 503, 0, class187.field3666, -1);
        }
        class168.method1038();
        class159.method1002((byte) -2);
        if (!class186.field3665) {
            if (class188.field3687 != -1) {
                class53.method322(class188.field3687, (byte) 94, class87.field1705);
            }
        } else {
            class186.method1194(-121);
        }
        if (class23.field448 == 3) {
            for (int var3 = 0; ~class125.field2476 < ~var3; ++var3) {
                if (!class9.field165[var3]) {
                    if (class21.field355[var3]) {
                        class168.method1042(class96.field1872[var3], class114.field2214[var3], class27.field480[var3], class21.field364[var3], 16711680, 128);
                    }
                } else {
                    class168.method1042(class96.field1872[var3], class114.field2214[var3], class27.field480[var3], class21.field364[var3], 16711935, 128);
                }
            }
        }
        class14.method61(class93.field1839, class67.field1348.field2328, class67.field1348.field2347, 18819, class65.field1325);
        class65.field1325 = 0;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class142() {
        super(1, false);
    }
}
