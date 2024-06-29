import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class128 extends class89 {

    @OriginalMember(owner = "client!li", name = "p", descriptor = "[B")
    public byte[] field2334;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "[Loc;")
    public class155[] field2345;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "[B")
    public byte[] field2343;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "[I")
    private int[] field2341;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "[S")
    public short[] field2353;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "[Lcb;")
    public class24[] field2332;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "[B")
    public byte[] field2348;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field2336 = 0;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "Lqe;")
    public static class179 field2342 = class206.method1380("hint_mapmarkers", (byte) 33);

    @OriginalMember(owner = "client!li", name = "F", descriptor = "Lqe;")
    private static class179 field2350 = class206.method1380("Please try using a different world)3", (byte) -126);

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Lqe;")
    public static class179 field2337 = field2350;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "Lqe;")
    public static class179 field2346 = field2350;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Lqe;")
    public static class179 field2333 = field2350;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "Lqe;")
    public static class179 field2347 = field2350;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "Lqe;")
    public static class179 field2352 = field2350;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "Lqe;")
    public static class179 field2349 = field2350;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "Lnb;")
    public static class143 field2354;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "[[[B")
    public static byte[][][] field2340;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "[[[B")
    public static byte[][][] field2344;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public final void method822(int arg0) {
        this.field2341 = null;
        field2339++;
        if (arg0 != 2) {
            this.method825(null, null, 82, null);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method823(boolean arg0) {
        field2333 = null;
        field2347 = null;
        field2350 = null;
        if (!arg0) {
            method824(-45, -127, 93, 6, -108, 126, -55, 56, 71);
        }
        field2340 = null;
        field2354 = null;
        field2344 = null;
        field2342 = null;
        field2337 = null;
        field2352 = null;
        field2349 = null;
        field2346 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2338++;
        int var9 = arg8 - arg4;
        int var10 = arg2 - arg1;
        int var11 = (arg6 - arg7 << 16) / var9;
        if (class146.field2655 > arg8) {
            var9++;
        }
        int var12 = (arg0 - arg5 << 16) / var10;
        if (arg2 < class202.field3736) {
            var10++;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            int var30 = var11 * var13 >> 16;
            int var31 = (var13 + 1) * var11 >> 16;
            int var32 = var31 - var30;
            if (var32 > 0) {
                int var33 = var13 + arg4 >> 6;
                int var34 = arg7 + var31;
                int var35 = arg7 + var30;
                int[][] var36 = class237.field4371[var33];
                byte[][] var37 = class102.field1951[var33];
                byte[][] var38 = class201.field3728[var33];
                byte[][] var39 = class102.field1947[var33];
                byte[][] var40 = field2340[var33];
                byte[][] var41 = class90.field1696[var33];
                for (int var42 = 0; var42 < var10; var42++) {
                    int var43 = var12 * var42 >> 16;
                    int var44 = (var42 + 1) * var12 >> 16;
                    int var45 = var44 - var43;
                    if (var45 > 0) {
                        int var46 = arg5 + var43;
                        int var47 = arg1 + var42 >> 6;
                        int var48 = arg1 + var42 & 0x3F;
                        int var49 = arg5 + var44;
                        int var50 = var13 + arg4 & 0x3F;
                        int var51 = (var48 << 6) + var50;
                        int var54;
                        if (var36[var47] == null) {
                            int var52 = arg1 + var42 & 0x4;
                            int var53 = arg4 + var13 & 0x4;
                            if ((var53 >= 2 || var52 <= 2) && (var53 <= 2 || var52 >= 2)) {
                                var54 = class155.field2795[class174.field3113 + 1];
                            } else {
                                var54 = 4936552;
                            }
                        } else {
                            var54 = var36[var47][var51];
                        }
                        int var55 = var37[var47] == null ? 0 : class155.field2795[var37[var47][var51] & 0xFF];
                        int var56 = var39[var47] == null ? 0 : class155.field2795[var39[var47][var51] & 0xFF];
                        if (var55 == 0 && var56 == 0) {
                            class145.method937(var35, var46, var32, var45, var54);
                        } else {
                            if (var55 != 0) {
                                if (var55 == -1) {
                                    var55 = 1;
                                }
                                byte var57 = var38[var47] == null ? 0 : var38[var47][var51];
                                int var58 = var57 & 0xFC;
                                if (var58 == 0 || var32 <= 1 || var45 <= 1) {
                                    class145.method937(var35, var46, var32, var45, var55);
                                } else {
                                    class144.method905(var57 & 0x3, var45, true, var55, -28056, var35, class145.field2640, var46, var54, var32, var58 >> 2);
                                }
                            }
                            if (var56 != 0) {
                                if (var56 == -1) {
                                    var56 = var54;
                                }
                                byte var59 = var40[var47][var51];
                                int var60 = var59 & 0xFC;
                                if (var60 == 0 || var32 <= 1 || var45 <= 1) {
                                    class145.method937(var35, var46, var32, var45, var56);
                                }
                                class144.method905(var59 & 0x3, var45, var55 == 0, var56, -28056, var35, class145.field2640, var46, 0, var32, var60 >> 2);
                            }
                        }
                        if (var41[var47] != null) {
                            int var61 = var41[var47][var51] & 0xFF;
                            if (var61 != 0) {
                                int var62;
                                if (var32 == 1) {
                                    var62 = var35;
                                } else {
                                    var62 = var34 - 1;
                                }
                                int var63;
                                if (var45 == 1) {
                                    var63 = var46;
                                } else {
                                    var63 = var49 - 1;
                                }
                                int var64 = 13421772;
                                if (var61 >= 5 && var61 <= 8 || var61 >= 13 && var61 <= 16 || var61 >= 21 && var61 <= 24 || var61 == 27 || var61 == 28) {
                                    var64 = 13369344;
                                    var61 -= 4;
                                }
                                if (var61 == 1) {
                                    class145.method936(var35, var46, var45, var64);
                                } else if (var61 == 2) {
                                    class145.method931(var35, var46, var32, var64);
                                } else if (var61 == 3) {
                                    class145.method936(var62, var46, var45, var64);
                                } else if (var61 == 4) {
                                    class145.method931(var35, var63, var32, var64);
                                } else if (var61 == 9) {
                                    class145.method936(var35, var46, var45, 16777215);
                                    class145.method931(var35, var46, var32, var64);
                                } else if (var61 == 10) {
                                    class145.method936(var62, var46, var45, 16777215);
                                    class145.method931(var35, var46, var32, var64);
                                } else if (var61 == 11) {
                                    class145.method936(var62, var46, var45, 16777215);
                                    class145.method931(var35, var63, var32, var64);
                                } else if (var61 == 12) {
                                    class145.method936(var35, var46, var45, 16777215);
                                    class145.method931(var35, var63, var32, var64);
                                } else if (var61 == 17) {
                                    class145.method931(var35, var46, 1, var64);
                                } else if (var61 == 18) {
                                    class145.method931(var62, var46, 1, var64);
                                } else if (var61 == 19) {
                                    class145.method931(var62, var63, 1, var64);
                                } else if (var61 == 20) {
                                    class145.method931(var35, var63, 1, var64);
                                } else if (var61 == 25) {
                                    for (int var66 = 0; var66 < var45; var66++) {
                                        class145.method931(var35 + var66, -var66 + var63, 1, var64);
                                    }
                                } else if (var61 == 26) {
                                    for (int var65 = 0; var65 < var45; var65++) {
                                        class145.method931(var35 + var65, var46 + var65, 1, var64);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg3 < 108) {
            field2340 = null;
        }
        for (int var14 = 0; var14 < var9; var14++) {
            int var15 = (var14 + 1) * var11 >> 16;
            int var16 = var11 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int var10000 = arg7 + var15;
                byte[][] var19 = class188.field3502[var14 + arg4 >> 6];
                int var20 = arg7 + var16;
                for (int var21 = 0; var21 < var10; var21++) {
                    int var22 = var12 * var21 >> 16;
                    int var23 = (var21 + 1) * var12 >> 16;
                    int var24 = var23 - var22;
                    if (var24 > 0) {
                        var10000 = arg5 + var23;
                        int var26 = arg5 + var22;
                        int var27 = arg1 + var21 >> 6;
                        int var28 = ((arg1 + var21 & 0x3F) << 6) + (var14 + arg4 & 0x3F);
                        if (var19[var27] != null) {
                            int var29 = var19[var27][var28] & 0xFF;
                            if (var29 != 0) {
                                if (var29 == 47 || var29 == 53) {
                                    class100.field1876[var29 - 1].method459(var20, var26, var17 * 2 + 1, var24 * 2 - -1);
                                } else {
                                    class100.field1876[var29 - 1].method459(var20 - var17 / 2, -(var24 / 2) + var26, var17 * 2, var24 * 2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([BLpj;I[I)Z")
    public final boolean method825(byte[] arg0, class173 arg1, int arg2, int[] arg3) {
        field2331++;
        boolean var5 = true;
        int var6 = 0;
        class24 var7 = null;
        if (arg2 < 18) {
            return true;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field2341[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1094(arg3, var9 >> 2, (byte) 125);
                        } else {
                            var7 = arg1.method1093(arg3, var9 >> 2, (byte) 124);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2332[var8] = var7;
                        this.field2341[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class128() {
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "([B)V")
    public class128(byte[] arg0) {
        this.field2334 = new byte[128];
        this.field2345 = new class155[128];
        this.field2343 = new byte[128];
        this.field2341 = new int[128];
        this.field2353 = new short[128];
        int var2 = 0;
        this.field2332 = new class24[128];
        this.field2348 = new byte[128];
        class185 var3 = new class185(arg0);
        while (var3.field3397[var3.field3432 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1204(false);
        }
        var2++;
        var3.field3432++;
        int var6 = var3.field3432;
        var3.field3432 += var2;
        int var7;
        for (var7 = 0; var3.field3397[var3.field3432 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1204(false);
        }
        var7++;
        var3.field3432++;
        int var10 = var3.field3432;
        var3.field3432 += var7;
        int var11;
        for (var11 = 0; var3.field3397[var3.field3432 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1204(false);
        }
        var3.field3432++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method1243(3);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class155[] var18 = new class155[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class155 var102 = var18[var19] = new class155();
            int var103 = var3.method1243(3);
            if (var103 > 0) {
                var102.field2775 = new byte[var103 * 2];
            }
            int var104 = var3.method1243(3);
            if (var104 > 0) {
                var102.field2784 = new byte[var104 * 2 + 2];
                var102.field2784[1] = 64;
            }
        }
        int var20 = var3.method1243(3);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method1243(3);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var3.field3397[var3.field3432 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method1204(false);
        }
        var3.field3432++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1243(3);
            this.field2353[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1243(3);
            this.field2353[var30] = (short) (this.field2353[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 < var25.length) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var3.method1218(-103);
            }
            this.field2353[var34] = (short) (this.field2353[var34] + class107.method696(32768, var33 - 1 << 14));
            this.field2341[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2341[var38] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var35) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                    var37 = var3.field3397[var6++] - 1;
                }
                this.field2348[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2341[var42] != 0) {
                if (var41 == 0) {
                    var40 = var3.field3397[var10++] + 16 << 2;
                    if (var8.length > var39) {
                        var41 = var8[var39++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field2334[var42] = (byte) var40;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class155 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2341[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length > var44) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field2345[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var49 >= var25.length) {
                    var47 = -1;
                } else {
                    var47 = var25[var49++];
                }
                if (this.field2341[var50] > 0) {
                    var48 = var3.method1243(3) + 1;
                }
            }
            this.field2343[var50] = (byte) var48;
            var47--;
        }
        this.field2351 = var3.method1243(3) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class155 var99 = var18[var51];
            if (var99.field2775 != null) {
                for (int var100 = 1; var100 < var99.field2775.length; var100 += 2) {
                    var99.field2775[var100] = var3.method1204(false);
                }
            }
            if (var99.field2784 != null) {
                for (int var101 = 3; var101 < var99.field2784.length - 2; var101 += 2) {
                    var99.field2784[var101] = var3.method1204(false);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method1204(false);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method1204(false);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class155 var96 = var18[var54];
            if (var96.field2784 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2784.length; var98 += 2) {
                    var97 = var3.method1243(3) + var97 + 1;
                    var96.field2784[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class155 var93 = var18[var55];
            if (var93.field2775 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2775.length; var95 += 2) {
                    var94 += var3.method1243(3) + 1;
                    var93.field2775[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method1243(3);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var3.method1243(3) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field2343[var60] = (byte) (this.field2343[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                int var65 = (var64 - var58) / 2 + (var64 - var58) * var59;
                byte var66 = var21[var61 + 1];
                var61 += 2;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class100.method632((byte) 53, var64 - var58, var65);
                    var65 += var66 - var59;
                    this.field2343[var67] = (byte) (this.field2343[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var59 = var66;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field2343[var62] = (byte) (this.field2343[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var3.method1243(3);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var3.method1243(3) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field2334[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2334[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                int var78 = var23[var74 + 1] << 1;
                byte var79 = var23[var74];
                int var80 = (var79 - var71) * var72 + (var79 - var71) / 2;
                var74 += 2;
                for (int var81 = var71; var81 < var79; var81++) {
                    int var82 = class100.method632((byte) 65, var79 - var71, var80);
                    var80 += var78 - var72;
                    int var83 = (this.field2334[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2334[var81] = (byte) var83;
                }
                var72 = var78;
                var71 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field2334[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2334[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2789 = var3.method1243(3);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class155 var92 = var18[var86];
            if (var92.field2775 != null) {
                var92.field2778 = var3.method1243(3);
            }
            if (var92.field2784 != null) {
                var92.field2773 = var3.method1243(3);
            }
            if (var92.field2789 > 0) {
                var92.field2774 = var3.method1243(3);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2779 = var3.method1243(3);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class155 var91 = var18[var88];
            if (var91.field2779 > 0) {
                var91.field2787 = var3.method1243(3);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class155 var90 = var18[var89];
            if (var90.field2787 > 0) {
                var90.field2782 = var3.method1243(3);
            }
        }
    }
}
