import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class155 extends class115 {

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "I")
    private int field2267 = 1;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    private int field2266 = 1;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2263 = "Starting 3d Library";

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "[[[I")
    public static int[][][] field2273 = new int[4][13][13];

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "Z")
    public static boolean field2272 = true;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "Lnk;")
    public static class11 field2271;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "Lve;")
    public static class233 field2275;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        if (arg0 >= -33) {
            field2272 = true;
        }
        int[][] var3 = super.field1716.method6(arg1, (byte) -88);
        if (super.field1716.field23) {
            int var4 = this.field2267 + 1 - -this.field2267;
            int var5 = this.field2266 + 1 + this.field2266;
            int var6 = 65536 / var5;
            int var7 = 65536 / var4;
            int[][][] var8 = new int[var5][][];
            for (int var9 = -this.field2266 + arg1; arg1 - -this.field2266 >= var9; ++var9) {
                int var19 = 0;
                int var20 = 0;
                int[][] var21 = this.method798(0, 0, class5.field136 & var9);
                int[][] var22 = new int[3][class77.field1178];
                int var23 = 0;
                int[] var24 = var21[2];
                int[] var25 = var21[0];
                int[] var26 = var21[1];
                for (int var27 = -this.field2267; ~this.field2267 <= ~var27; ++var27) {
                    int var37 = class207.field2992 & var27;
                    var23 += var24[var37];
                    var19 += var25[var37];
                    var20 += var26[var37];
                }
                int[] var28 = var22[0];
                int[] var29 = var22[1];
                int[] var30 = var22[2];
                int var31 = 0;
                while (class77.field1178 > var31) {
                    var28[var31] = var7 * var19 >> 16;
                    var29[var31] = var7 * var20 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class207.field2992 & var31 - this.field2267;
                    int var33 = var23 - var24[var32];
                    int var34 = var19 - var25[var32];
                    ++var31;
                    int var35 = var20 - var26[var32];
                    int var36 = this.field2267 + var31 & class207.field2992;
                    var23 = var24[var36] + var33;
                    var19 = var25[var36] + var34;
                    var20 = var26[var36] + var35;
                }
                var8[this.field2266 + var9 + -arg1] = var22;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class77.field1178; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var5 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var6 * var14 >> 16;
                var11[var13] = var6 * var15 >> 16;
                var12[var13] = var6 * var16 >> 16;
            }
        }
        ++field2270;
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V")
    public static final void method1046(byte arg0) {
        ++field2265;
        class161.field2332.method260(0);
        if (arg0 < 15) {
            field2263 = null;
        }
        class54.field824.method260(0);
        class24.field316.method260(0);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field2268;
        if (arg0 != -1) {
            field2272 = false;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1713 = ~arg1.method760(false) == -2;
                }
            } else {
                this.field2266 = arg1.method760(false);
            }
        } else {
            this.field2267 = arg1.method760(false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V")
    public static void method1047(byte arg0) {
        int var1 = -95 % ((11 - arg0) / 32);
        field2263 = null;
        field2273 = null;
        field2275 = null;
        field2271 = null;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(III)Ljava/lang/String;")
    public static final String method1048(int arg0, int arg1, int arg2) {
        ++field2261;
        int var3 = -arg1 + arg0;
        if (~var3 > 8) {
            return "<col=ff0000>";
        } else {
            if (arg2 > -31) {
                field2271 = null;
            }
            if (var3 < -6) {
                return "<col=ff3000>";
            } else if (var3 < -3) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else {
                return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class155() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLvi;)V")
    public static final void method1049(byte arg0, class5 arg1) {
        if (arg0 > 34) {
            int var2 = -class82.field1267 + arg1.field76;
            ++field2269;
            int var3 = arg1.field43 * 128 - -(64 * arg1.method57(0));
            int var4 = arg1.field49 * 128 + arg1.method57(0) * 64;
            arg1.field124 = 0;
            arg1.field45 += (-arg1.field45 + var3) / var2;
            if (arg1.field92 == 0) {
                arg1.field127 = 1024;
            }
            arg1.field94 += (-arg1.field94 + var4) / var2;
            if (arg1.field92 == 1) {
                arg1.field127 = 1536;
            }
            if (arg1.field92 == 2) {
                arg1.field127 = 0;
            }
            if (~arg1.field92 == -4) {
                arg1.field127 = 512;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILve;)V")
    public static final void method1050(int arg0, class233 arg1) {
        if (arg0 != 3) {
            field2271 = null;
        }
        ++field2262;
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(II)V")
    public static final void method1051(int arg0, int arg1) {
        class131 var2 = class16.field233[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class131 var4 = class16.field233[var3][arg0][arg1] = class16.field233[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field1913;
                for (int var5 = 0; var5 < var4.field1926; ++var5) {
                    class162 var6 = var4.field1908[var5];
                    if ((var6.field2350 >> 29 & 3L) == 2L && var6.field2353 == arg0 && var6.field2357 == arg1) {
                        --var6.field2358;
                    }
                }
            }
        }
        if (class16.field233[0][arg0][arg1] == null) {
            class16.field233[0][arg0][arg1] = new class131(0, arg0, arg1);
        }
        class16.field233[0][arg0][arg1].field1920 = var2;
        class16.field233[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field2274;
        if (arg0 != 242152972) {
            return null;
        } else {
            int[] var3 = super.field1705.method463(arg1, false);
            if (super.field1705.field1072) {
                int var4 = this.field2266 + this.field2266 + 1;
                int var5 = 65536 / var4;
                int[][] var6 = new int[var4][];
                int var7 = this.field2267 + this.field2267 - -1;
                int var8 = 65536 / var7;
                for (int var9 = -this.field2266 + arg1; var9 <= arg1 - -this.field2266; ++var9) {
                    int[] var13 = this.method797(0, class5.field136 & var9, 107);
                    int[] var14 = new int[class77.field1178];
                    int var15 = 0;
                    for (int var16 = -this.field2267; var16 <= this.field2267; ++var16) {
                        var15 += var13[class207.field2992 & var16];
                    }
                    int var17 = 0;
                    while (~class77.field1178 < ~var17) {
                        var14[var17] = var8 * var15 >> 16;
                        int var18 = var15 - var13[class207.field2992 & -this.field2267 + var17];
                        ++var17;
                        var15 = var13[this.field2267 + var17 & class207.field2992] + var18;
                    }
                    var6[var9 - -this.field2266 + -arg1] = var14;
                }
                for (int var10 = 0; ~class77.field1178 < ~var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var4 > var12; ++var12) {
                        var11 += var6[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(III)J")
    public static final long method1052(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        return var3 != null && var3.field1923 != null ? var3.field1923.field4555 : 0L;
    }
}
