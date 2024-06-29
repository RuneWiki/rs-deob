import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class148 extends class381 {

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "[S")
    public short[] field2275;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "[B")
    public byte[] field2265;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "[I")
    private int[] field2285;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "[B")
    public byte[] field2278;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "[Lqn;")
    public class198[] field2269;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "[Lkf;")
    public class294[] field2268;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "[B")
    public byte[] field2283;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public int field2277;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2266 = "Choose Option";

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "[[I")
    public static int[][] field2267 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field2273 = 0;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "[[B")
    public static byte[][] field2280 = new byte[50][];

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field2271 = 0;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field2281 = 0;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public static int field2284 = 255;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "[I")
    public static int[] field2276 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 18)
    public static void method1138(int arg0) {
        field2276 = null;
        field2267 = null;
        field2266 = null;
        if (arg0 != -1) {
            field2266 = null;
        }
        field2280 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;ILap;)I", line = 44)
    public static final int method1139(String arg0, int arg1, class289 arg2) {
        field2282++;
        int var3 = arg2.field3938;
        byte[] var4 = class413.method2556(arg0, 82);
        arg2.method1823(var4.length, -2);
        arg2.field3938 += class94.field1372.method64(var4, arg1, arg2.field3882, arg2.field3938, 24177, var4.length);
        return arg2.field3938 - var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 65)
    public final void method1140(boolean arg0) {
        this.field2285 = null;
        if (arg0) {
            method1139((String) null, 16, (class289) null);
        }
        field2279++;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V", line = 83)
    public static final void method1141(byte arg0) {
        class107[] var1 = class89.field1325;
        synchronized (class89.field1325) {
            if (arg0 <= 66) {
                return;
            }
            int var2 = 0;
            while (true) {
                if (var2 >= class89.field1325.length) {
                    break;
                }
                class89.field1325[var2] = new class107();
                class385.field5428[var2] = 0;
                var2++;
            }
        }
        field2272++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([B[IBLie;)Z", line = 118)
    public final boolean method1142(byte[] arg0, int[] arg1, byte arg2, class53 arg3) {
        field2270++;
        boolean var5 = true;
        int var6 = 0;
        class294 var7 = null;
        int var8 = 95 % ((22 - arg2) / 53);
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg0 == null || arg0[var9] != 0) {
                int var10 = this.field2285[var9];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg3.method511(var10 >> 2, -96, arg1);
                        } else {
                            var7 = arg3.method512(var10 >> 2, arg1, 0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2268[var9] = var7;
                        this.field2285[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 172)
    public class148() {
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "([B)V", line = 174)
    public class148(byte[] arg0) {
        this.field2275 = new short[128];
        this.field2265 = new byte[128];
        this.field2285 = new int[128];
        this.field2278 = new byte[128];
        this.field2269 = new class198[128];
        this.field2268 = new class294[128];
        this.field2283 = new byte[128];
        class289 var2 = new class289(arg0);
        int var3;
        for (var3 = 0; var2.field3882[var2.field3938 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1868((byte) -121);
        }
        var2.field3938++;
        var3++;
        int var6 = var2.field3938;
        var2.field3938 += var3;
        int var7;
        for (var7 = 0; var2.field3882[var2.field3938 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1868((byte) -124);
        }
        var7++;
        var2.field3938++;
        int var10 = var2.field3938;
        var2.field3938 += var7;
        int var11;
        for (var11 = 0; var2.field3882[var2.field3938 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1868((byte) -125);
        }
        var2.field3938++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1861((byte) -72);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class198[] var19 = new class198[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class198 var103 = var19[var20] = new class198();
            int var104 = var2.method1861((byte) -72);
            if (var104 > 0) {
                var103.field2825 = new byte[var104 * 2];
            }
            int var105 = var2.method1861((byte) -72);
            if (var105 > 0) {
                var103.field2822 = new byte[var105 * 2 + 2];
                var103.field2822[1] = 64;
            }
        }
        int var21 = var2.method1861((byte) -72);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method1861((byte) -72);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field3882[var2.field3938 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1868((byte) -124);
        }
        var25++;
        var2.field3938++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1861((byte) -72);
            this.field2275[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1861((byte) -72);
            this.field2275[var31] = (short) (this.field2275[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method1850(2);
            }
            this.field2275[var35] = (short) (this.field2275[var35] + (class323.method2059(2, var34 - 1) << 14));
            var32--;
            this.field2285[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2285[var39] != 0) {
                if (var37 == 0) {
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                    var38 = var2.field3882[var6++] - 1;
                }
                this.field2265[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2285[var43] != 0) {
                if (var40 == 0) {
                    var42 = var2.field3882[var10++] + 16 << 2;
                    if (var8.length > var41) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field2283[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class198 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2285[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field2269[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length > var48) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field2285[var51] > 0) {
                    var50 = var2.method1861((byte) -72) + 1;
                }
            }
            var49--;
            this.field2278[var51] = (byte) var50;
        }
        this.field2277 = var2.method1861((byte) -72) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class198 var100 = var19[var52];
            if (var100.field2825 != null) {
                for (int var101 = 1; var101 < var100.field2825.length; var101 += 2) {
                    var100.field2825[var101] = var2.method1868((byte) -123);
                }
            }
            if (var100.field2822 != null) {
                for (int var102 = 3; var102 < var100.field2822.length - 2; var102 += 2) {
                    var100.field2822[var102] = var2.method1868((byte) -128);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1868((byte) -123);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1868((byte) -126);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class198 var97 = var19[var55];
            if (var97.field2822 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2822.length; var99 += 2) {
                    var98 += var2.method1861((byte) -72) + 1;
                    var97.field2822[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class198 var94 = var19[var56];
            if (var94.field2825 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2825.length; var96 += 2) {
                    var95 = var95 + var2.method1861((byte) -72) + 1;
                    var94.field2825[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1861((byte) -72);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method1861((byte) -72) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2278[var61] = (byte) (this.field2278[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class204.method1424(var65 - var59, (byte) 47, var67);
                    var67 += var66 - var60;
                    this.field2278[var68] = (byte) (this.field2278[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2278[var63] = (byte) (this.field2278[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method1861((byte) -72);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method1861((byte) -72) + (var70 + 1);
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2283[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2283[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class204.method1424(var79 - var72, (byte) 39, var81);
                    int var84 = (this.field2283[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2283[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var72 = var79;
                var75 += 2;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field2283[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2283[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field2824 = var2.method1861((byte) -72);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class198 var93 = var19[var87];
            if (var93.field2825 != null) {
                var93.field2829 = var2.method1861((byte) -72);
            }
            if (var93.field2822 != null) {
                var93.field2823 = var2.method1861((byte) -72);
            }
            if (var93.field2824 > 0) {
                var93.field2819 = var2.method1861((byte) -72);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field2816 = var2.method1861((byte) -72);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class198 var92 = var19[var89];
            if (var92.field2816 > 0) {
                var92.field2828 = var2.method1861((byte) -72);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class198 var91 = var19[var90];
            if (var91.field2828 > 0) {
                var91.field2830 = var2.method1861((byte) -72);
            }
        }
    }
}
