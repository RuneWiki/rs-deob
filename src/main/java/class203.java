import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class203 extends class288 {

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "[Z")
    public static boolean[] field3265 = new boolean[100];

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3260 = "Loaded update list";

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "Lsf;")
    public static class95 field3255 = new class95();

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "Z")
    public static boolean field3268 = false;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
    public static int field3269 = 0;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "Ljj;")
    public static class134 field3258;

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
    public class203() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)I")
    public static final int method1361(int arg0) {
        ++field3264;
        if (arg0 != 8) {
            method1362(-30, (class95) null, false, 121, -16, -51, 57);
        }
        return 6;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILsf;ZIIII)Ljg;")
    public static final class271 method1362(int arg0, class95 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3259;
        if (arg6 != 925569457) {
            method1363(true);
        }
        int var8 = (arg4 << 19) + (!arg2 ? 0 : 65536) + arg0 - -(arg5 << 17);
        long var9 = (long) arg3 * 3147483667L - -((long) var8 * 3849834839L);
        class271 var11 = (class271) class111.field1908.method1839((byte) 107, var9);
        if (var11 != null) {
            return var11;
        } else {
            class145.field2341 = false;
            class271 var12 = class281.method1884(arg4, arg3, false, false, arg5, false, arg2, arg0, arg1);
            if (var12 != null && !class145.field2341) {
                class111.field1908.method1830(var9, -26, var12);
            }
            return var12;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)V")
    public static void method1363(boolean arg0) {
        field3255 = null;
        if (arg0) {
            method1362(82, (class95) null, true, 7, -100, -92, -72);
        }
        field3260 = null;
        field3258 = null;
        field3265 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field3263;
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            for (int var4 = 0; class186.field2986 > var4; ++var4) {
                this.method1364(arg1, (byte) -37, var4);
                int[] var5 = this.method1931((byte) -125, 0, class109.field1895);
                var3[var4] = var5[class251.field4017];
            }
        }
        if (arg0 != 0) {
            field3258 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            super.field4612 = arg0.method1779(-105) == 1;
        }
        ++field3266;
        if (arg1 != -19) {
            field3255 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBI)V")
    private final void method1364(int arg0, byte arg1, int arg2) {
        ++field3261;
        int var4 = class1.field15[arg0];
        int var5 = class246.field3958[arg2];
        float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 + -2048));
        if (arg1 == -37) {
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class251.field4017 = arg2;
                class109.field1895 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class251.field4017 = arg0;
                class109.field1895 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class109.field1895 = arg2;
                class251.field4017 = -arg0 + class186.field2986;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class109.field1895 = -arg0 + class205.field3296;
                class251.field4017 = arg2;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class109.field1895 = -arg0 + class205.field3296;
                class251.field4017 = class186.field2986 - arg2;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class109.field1895 = -arg2 + class205.field3296;
                class251.field4017 = -arg0 + class186.field2986;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class109.field1895 = -arg2 + class205.field3296;
                class251.field4017 = arg0;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class109.field1895 = arg0;
                class251.field4017 = -arg2 + class186.field2986;
            }
            class251.field4017 &= class34.field422;
            class109.field1895 &= class144.field2332;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()V")
    public static final void method1365() {
        class267.field4324 = 0;
        label191: for (int var0 = 0; var0 < class297.field4693; ++var0) {
            class240 var1 = class218.field3493[var0];
            if (class95.field1418 != null) {
                for (int var2 = 0; var2 < class95.field1418.length; ++var2) {
                    if (class95.field1418[var2] != -1000000 && (var1.field3853 <= class95.field1418[var2] || var1.field3841 <= class95.field1418[var2]) && (var1.field3838 <= class256.field4097[var2] || var1.field3835 <= class256.field4097[var2]) && (var1.field3838 >= class18.field216[var2] || var1.field3835 >= class18.field216[var2]) && (var1.field3837 <= class66.field931[var2] || var1.field3832 <= class66.field931[var2]) && (var1.field3837 >= class271.field4385[var2] || var1.field3832 >= class271.field4385[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field3856 == 1) {
                int var3 = var1.field3836 - class177.field2861 + class54.field771;
                if (var3 >= 0 && var3 <= class54.field771 + class54.field771) {
                    int var4 = var1.field3840 - class21.field265 + class54.field771;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3834 - class21.field265 + class54.field771;
                    if (var5 > class54.field771 + class54.field771) {
                        var5 = class54.field771 + class54.field771;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class259.field4124[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class209.field3435 - var1.field3838;
                        if (var7 > 32) {
                            var1.field3833 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3833 = 2;
                            var7 = -var7;
                        }
                        var1.field3855 = (var1.field3837 - class30.field365 << 8) / var7;
                        var1.field3839 = (var1.field3832 - class30.field365 << 8) / var7;
                        var1.field3854 = (var1.field3853 - class243.field3896 << 8) / var7;
                        var1.field3850 = (var1.field3841 - class243.field3896 << 8) / var7;
                        class12.field168[class267.field4324++] = var1;
                    }
                }
            } else if (var1.field3856 == 2) {
                int var8 = var1.field3840 - class21.field265 + class54.field771;
                if (var8 >= 0 && var8 <= class54.field771 + class54.field771) {
                    int var9 = var1.field3836 - class177.field2861 + class54.field771;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3851 - class177.field2861 + class54.field771;
                    if (var10 > class54.field771 + class54.field771) {
                        var10 = class54.field771 + class54.field771;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class259.field4124[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class30.field365 - var1.field3837;
                        if (var12 > 32) {
                            var1.field3833 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3833 = 4;
                            var12 = -var12;
                        }
                        var1.field3843 = (var1.field3838 - class209.field3435 << 8) / var12;
                        var1.field3849 = (var1.field3835 - class209.field3435 << 8) / var12;
                        var1.field3854 = (var1.field3853 - class243.field3896 << 8) / var12;
                        var1.field3850 = (var1.field3841 - class243.field3896 << 8) / var12;
                        class12.field168[class267.field4324++] = var1;
                    }
                }
            } else if (var1.field3856 == 4) {
                int var13 = var1.field3853 - class243.field3896;
                if (var13 > 128) {
                    int var14 = var1.field3840 - class21.field265 + class54.field771;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3834 - class21.field265 + class54.field771;
                    if (var15 > class54.field771 + class54.field771) {
                        var15 = class54.field771 + class54.field771;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3836 - class177.field2861 + class54.field771;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3851 - class177.field2861 + class54.field771;
                        if (var17 > class54.field771 + class54.field771) {
                            var17 = class54.field771 + class54.field771;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; ++var19) {
                            for (int var20 = var14; var20 <= var15; ++var20) {
                                if (class259.field4124[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3833 = 5;
                            var1.field3843 = (var1.field3838 - class209.field3435 << 8) / var13;
                            var1.field3849 = (var1.field3835 - class209.field3435 << 8) / var13;
                            var1.field3855 = (var1.field3837 - class30.field365 << 8) / var13;
                            var1.field3839 = (var1.field3832 - class30.field365 << 8) / var13;
                            class12.field168[class267.field4324++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[III[I)V")
    public static final void method1366(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg2 < arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg2; ~var9 > ~arg0; ++var9) {
                if (var7 - -(var9 & 1) < arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method1366(var6 - 1, arg1, arg2, 0, arg4);
            method1366(arg0, arg1, var6 + 1, arg3, arg4);
        }
        if (arg3 == 0) {
            ++field3254;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        ++field3253;
        if (arg0 != 1) {
            field3255 = null;
        }
        int[][] var3 = super.field4598.method812(arg1, 65535);
        if (super.field4598.field1954) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class186.field2986 < ~var7; ++var7) {
                this.method1364(arg1, (byte) -37, var7);
                int[][] var8 = this.method1930(0, class109.field1895, (byte) 39);
                var4[var7] = var8[0][class251.field4017];
                var5[var7] = var8[1][class251.field4017];
                var6[var7] = var8[2][class251.field4017];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(B)V")
    public static final void method1367(byte arg0) {
        ++field3256;
        while (class166.field2709.method1237(class73.field1001, 8) >= 11) {
            int var1 = class166.field2709.method1239(-49, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class260.field4141[var1] == null) {
                var2 = true;
                class260.field4141[var1] = new class235();
                if (class113.field1952[var1] != null) {
                    class260.field4141[var1].method1550(class113.field1952[var1], (byte) 6);
                }
            }
            class51.field721[class70.field969++] = var1;
            class235 var3 = class260.field4141[var1];
            var3.field656 = class9.field141;
            int var4 = class166.field2709.method1239(-65, 5);
            int var5 = class166.field2709.method1239(-31, 1);
            if (~var5 == -2) {
                class28.field335[class61.field834++] = var1;
            }
            int var6 = class166.field2709.method1239(-85, 5);
            if (~var4 < -16) {
                var4 -= 32;
            }
            int var7 = class62.field845[class166.field2709.method1239(-113, 3)];
            if (var2) {
                var3.field691 = var3.field657 = var7;
            }
            int var8 = class166.field2709.method1239(107, 1);
            if (var6 > 15) {
                var6 -= 32;
            }
            var3.method1551(class197.field3179.field692[0] + var6, ~var8 == -2, false, class197.field3179.field610[0] - -var4);
        }
        class166.field2709.method1241((byte) 0);
        if (arg0 <= 82) {
            field3268 = true;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjj;Ljj;)V")
    public static final void method1368(int arg0, class134 arg1, class134 arg2) {
        class133.field2203 = arg2;
        class162.field2631 = arg1;
        if (arg0 != 32) {
            field3255 = null;
        }
        class22.field276 = class133.field2203.method948((byte) -97, 3);
        ++field3267;
    }
}
