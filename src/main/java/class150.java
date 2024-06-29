import java.awt.Container;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class150 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "[I")
    private int[] field2529;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "[I")
    private int[] field2548;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lve;")
    public static class255 field2542 = class87.method607(36, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Lve;")
    public static class255 field2547 = class87.method607(72, "hitmarks");

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Z")
    public static boolean field2546 = true;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Lve;")
    public static class255 field2545 = class87.method607(53, "blinken3:");

    @OriginalMember(owner = "client!g", name = "w", descriptor = "Lve;")
    public static class255 field2551 = class87.method607(32, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!g", name = "v", descriptor = "Lwl;")
    public static class81 field2550 = new class81(64);

    @OriginalMember(owner = "client!g", name = "y", descriptor = "[S")
    public static short[] field2553 = new short[256];

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    private int field2532;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    private int field2537;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    private int field2538;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    private int field2540;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2533;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[S")
    public static short[] field2544;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "[[B")
    public static byte[][] field2539;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Z", line = 12)
    public static final boolean method1109(int arg0, byte arg1) {
        if (arg1 != 89) {
            method1114((byte) 6);
        }
        field2543++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 25)
    private final void method1110(int arg0) {
        field2534++;
        int var2 = 82 % ((arg0 + 17) / 56);
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = -1640531527;
        for (int var11 = 0; var11 < 4; var11++) {
            int var12 = var10 ^ var9 << 11;
            int var13 = var8 + var9;
            int var14 = var13 ^ var8 >>> 2;
            int var15 = var6 + var14;
            int var16 = var7 + var12;
            int var17 = var8 + var16;
            int var18 = var17 ^ var16 << 8;
            int var19 = var15 + var16;
            int var20 = var5 + var18;
            var7 = var19 ^ var15 >>> 16;
            int var21 = var15 + var20;
            int var22 = var4 + var7;
            var6 = var21 ^ var20 << 10;
            int var23 = var20 + var22;
            int var24 = var3 + var6;
            var5 = var23 ^ var22 >>> 4;
            int var25 = var5 + var12;
            int var26 = var22 + var24;
            var4 = var26 ^ var24 << 8;
            int var27 = var24 + var25;
            var9 = var4 + var14;
            var3 = var27 ^ var25 >>> 9;
            var8 = var3 + var18;
            var10 = var9 + var25;
        }
        for (int var28 = 0; var28 < 256; var28 += 8) {
            int var29 = this.field2529[var28 + 1] + var9;
            int var30 = this.field2529[var28 + 2] + var8;
            int var31 = this.field2529[var28 + 7] + var3;
            int var32 = this.field2529[var28 + 6] + var4;
            int var33 = this.field2529[var28 + 5] + var5;
            int var34 = this.field2529[var28] + var10;
            int var35 = this.field2529[var28 + 4] + var6;
            int var36 = this.field2529[var28 + 3] + var7;
            int var37 = var34 ^ var29 << 11;
            int var38 = var36 + var37;
            int var39 = var29 + var30;
            int var40 = var39 ^ var30 >>> 2;
            int var41 = var35 + var40;
            int var42 = var30 + var38;
            int var43 = var42 ^ var38 << 8;
            int var44 = var38 + var41;
            var7 = var44 ^ var41 >>> 16;
            int var45 = var33 + var43;
            int var46 = var41 + var45;
            int var47 = var7 + var32;
            var6 = var46 ^ var45 << 10;
            int var48 = var45 + var47;
            int var49 = var6 + var31;
            var5 = var48 ^ var47 >>> 4;
            int var50 = var5 + var37;
            int var51 = var47 + var49;
            var4 = var51 ^ var49 << 8;
            int var52 = var49 + var50;
            var9 = var4 + var40;
            var3 = var52 ^ var50 >>> 9;
            var8 = var3 + var43;
            var10 = var9 + var50;
            this.field2548[var28] = var10;
            this.field2548[var28 + 1] = var9;
            this.field2548[var28 + 2] = var8;
            this.field2548[var28 + 3] = var7;
            this.field2548[var28 + 4] = var6;
            this.field2548[var28 + 5] = var5;
            this.field2548[var28 + 6] = var4;
            this.field2548[var28 + 7] = var3;
        }
        for (int var53 = 0; var53 < 256; var53 += 8) {
            int var54 = this.field2548[var53 + 1] + var9;
            int var55 = this.field2548[var53 + 6] + var4;
            int var56 = this.field2548[var53 + 7] + var3;
            int var57 = this.field2548[var53 + 3] + var7;
            int var58 = this.field2548[var53 + 5] + var5;
            int var59 = this.field2548[var53 + 4] + var6;
            int var60 = this.field2548[var53 + 2] + var8;
            int var61 = this.field2548[var53] + var10;
            int var62 = var61 ^ var54 << 11;
            int var63 = var57 + var62;
            int var64 = var54 + var60;
            int var65 = var64 ^ var60 >>> 2;
            int var66 = var60 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var58 + var67;
            int var69 = var59 + var65;
            int var70 = var63 + var69;
            var7 = var70 ^ var69 >>> 16;
            int var71 = var68 + var69;
            var6 = var71 ^ var68 << 10;
            int var72 = var6 + var56;
            int var73 = var7 + var55;
            int var74 = var68 + var73;
            var5 = var74 ^ var73 >>> 4;
            int var75 = var5 + var62;
            int var76 = var72 + var73;
            var4 = var76 ^ var72 << 8;
            var9 = var4 + var65;
            int var77 = var72 + var75;
            var3 = var77 ^ var75 >>> 9;
            var10 = var9 + var75;
            var8 = var3 + var67;
            this.field2548[var53] = var10;
            this.field2548[var53 + 1] = var9;
            this.field2548[var53 + 2] = var8;
            this.field2548[var53 + 3] = var7;
            this.field2548[var53 + 4] = var6;
            this.field2548[var53 + 5] = var5;
            this.field2548[var53 + 6] = var4;
            this.field2548[var53 + 7] = var3;
        }
        this.method1113(-1168259326);
        this.field2537 = 256;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)I", line = 177)
    public final int method1111(boolean arg0) {
        if (this.field2537-- == 0) {
            this.method1113(-1168259326);
            this.field2537 = 255;
        }
        field2535++;
        if (!arg0) {
            field2549 = -41;
        }
        return this.field2529[this.field2537];
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZII[Ltl;IIIII)V", line = 198)
    public static final void method1112(int arg0, boolean arg1, int arg2, int arg3, class197[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class281.field4827) {
            class126.method938(arg3, arg6, arg9, arg5);
        } else {
            class175.method1258(arg3, arg6, arg9, arg5);
            class283.method1997();
        }
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class197 var11 = arg4[var10];
            if (var11 != null && (var11.field3353 == arg7 || arg7 == -1412584499 && class300.field5110 == var11)) {
                int var12;
                if (arg2 == -1) {
                    class247.field4147[class279.field4784] = var11.field3332 + arg0;
                    class271.field4679[class279.field4784] = var11.field3305 + arg8;
                    class49.field745[class279.field4784] = var11.field3294;
                    class10.field146[class279.field4784] = var11.field3253;
                    var12 = class279.field4784++;
                } else {
                    var12 = arg2;
                }
                var11.field3248 = var12;
                var11.field3278 = class277.field4768;
                if (!var11.field3365 || !client.method1674(var11)) {
                    if (var11.field3392 > 0) {
                        class201.method1462(var11, -53);
                    }
                    int var13 = var11.field3305 + arg8;
                    int var14 = var11.field3339;
                    int var15 = var11.field3332 + arg0;
                    if (class198.field3421 && (client.method1673(var11) != 0 || var11.field3281 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class300.field5110 == var11) {
                        if (arg7 != -1412584499 && !var11.field3363) {
                            class113.field1910 = arg8;
                            class264.field4470 = arg0;
                            class44.field687 = arg4;
                            continue;
                        }
                        if (class10.field138 && class130.field2142) {
                            int var16 = class2.field31;
                            int var17 = class67.field994;
                            int var18 = var16 - class16.field232;
                            if (class156.field2658 > var18) {
                                var18 = class156.field2658;
                            }
                            if ((var11.field3294 + var18) > (class156.field2658 + class30.field493.field3294)) {
                                var18 = class156.field2658 + class30.field493.field3294 - var11.field3294;
                            }
                            var15 = var18;
                            int var19 = var17 - class197.field3255;
                            if (var19 < class50.field755) {
                                var19 = class50.field755;
                            }
                            if ((var11.field3253 + var19) > (class50.field755 + class30.field493.field3253)) {
                                var19 = class50.field755 + class30.field493.field3253 - var11.field3253;
                            }
                            var13 = var19;
                        }
                        if (!var11.field3363) {
                            var14 = 128;
                        }
                    }
                    int var20;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field3281 == 2) {
                        var25 = arg5;
                        var24 = arg9;
                        var23 = arg3;
                        var20 = arg6;
                    } else {
                        var20 = arg6 >= var13 ? arg6 : var13;
                        int var21 = var11.field3294 + var15;
                        int var22 = var11.field3253 + var13;
                        var23 = var15 > arg3 ? var15 : arg3;
                        if (var11.field3281 == 9) {
                            var22++;
                            var21++;
                        }
                        var24 = var21 >= arg9 ? arg9 : var21;
                        var25 = arg5 > var22 ? var22 : arg5;
                    }
                    if (!var11.field3365 || var23 < var24 && var25 > var20) {
                        if (var11.field3392 != 0) {
                            if (var11.field3392 == 1337 || var11.field3392 == 1403 && class281.field4827) {
                                class239.field3984 = var15;
                                class288.field4961 = var11;
                                class276.field4740 = var13;
                                class260.method1813(var13, (byte) -48, var15, var11.field3253, var11.field3294, var11.field3392 == 1403);
                                if (class281.field4827) {
                                    class126.method938(arg3, arg6, arg9, arg5);
                                } else {
                                    class175.method1258(arg3, arg6, arg9, arg5);
                                }
                                continue;
                            }
                            if (var11.field3392 == 1338) {
                                if (var11.method1414(-65536)) {
                                    class109.method840(var12, (byte) -116, var13, var11, var15);
                                    if (class281.field4827) {
                                        class126.method938(arg3, arg6, arg9, arg5);
                                    } else {
                                        class175.method1258(arg3, arg6, arg9, arg5);
                                    }
                                }
                                continue;
                            }
                            if (var11.field3392 == 1339) {
                                if (var11.method1414(-65536)) {
                                    class275.method1932(var13, 68, var12, var15, var11);
                                    if (class281.field4827) {
                                        class126.method938(arg3, arg6, arg9, arg5);
                                    } else {
                                        class175.method1258(arg3, arg6, arg9, arg5);
                                    }
                                }
                                continue;
                            }
                            if (var11.field3392 == 1400) {
                                class167.method1217(var11.field3294, 9179409, var15, var13, var11.field3253);
                                class187.field3008[var12] = true;
                                class236.field3931[var12] = true;
                                if (class281.field4827) {
                                    class126.method938(arg3, arg6, arg9, arg5);
                                } else {
                                    class175.method1258(arg3, arg6, arg9, arg5);
                                }
                                continue;
                            }
                            if (var11.field3392 == 1401) {
                                class7.method41(var11.field3253, var15, var11.field3294, 0, var13);
                                class187.field3008[var12] = true;
                                class236.field3931[var12] = true;
                                if (class281.field4827) {
                                    class126.method938(arg3, arg6, arg9, arg5);
                                } else {
                                    class175.method1258(arg3, arg6, arg9, arg5);
                                }
                                continue;
                            }
                            if (var11.field3392 == 1402) {
                                if (!class281.field4827) {
                                    class129.method956(false, var15, var13);
                                    class187.field3008[var12] = true;
                                    class236.field3931[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field3392 == 1405) {
                                if (!class103.field1734) {
                                    continue;
                                }
                                int var111 = var11.field3294 + var15;
                                int var112 = var13 + 15;
                                class102.field1719.method500(class3.method14(new class255[] { class295.field5066, class215.method1532(class59.field913, true) }, (byte) -54), var111, var112, 16776960, -1);
                                Runtime var113 = Runtime.getRuntime();
                                int var114 = (int) ((var113.totalMemory() - var113.freeMemory()) / 1024L);
                                int var126 = var112 + 15;
                                int var115 = 16776960;
                                if (var114 > 65536) {
                                    var115 = 16711680;
                                }
                                class102.field1719.method500(class3.method14(new class255[] { class168.field2826, class215.method1532(var114, true), class183.field2953 }, (byte) -105), var111, var126, var115, -1);
                                var112 = var126 + 15;
                                if (class281.field4827) {
                                    int var116 = 16776960;
                                    int var117 = (class139.field2327 + class139.field2325 + class139.field2326) / 1024;
                                    if (var117 > 65536) {
                                        var116 = 16711680;
                                    }
                                    class102.field1719.method500(class3.method14(new class255[] { class287.field4918, class215.method1532(var117, true), class183.field2953 }, (byte) -58), var111, var112, var116, -1);
                                    var112 += 15;
                                }
                                int var118 = 16776960;
                                int var119 = 0;
                                int var120 = 0;
                                int var121 = 0;
                                for (int var122 = 0; var122 < 27; var122++) {
                                    var119 += class187.field3024[var122].method104(63);
                                    var120 += class187.field3024[var122].method92(96);
                                    var121 += class187.field3024[var122].method98((byte) -100);
                                }
                                int var123 = var121 * 100 / var119;
                                int var124 = var120 * 10000 / var119;
                                class255 var125 = class3.method14(new class255[] { class160.field2706, class269.method1872(2, 0, 114, true, (long) var124), class78.field1277, class215.method1532(var123, true), class136.field2264 }, (byte) -96);
                                class6.field82.method500(var125, var111, var112, var118, -1);
                                class187.field3008[var12] = true;
                                var112 += 12;
                                class236.field3931[var12] = true;
                                continue;
                            }
                        }
                        if (!class156.field2651) {
                            if (var11.field3281 == 0 && var11.field3344 && var23 <= class251.field4239 && class197.field3306 >= var20 && var24 > class251.field4239 && var25 > class197.field3306 && !class198.field3421) {
                                class136.field2272 = 1;
                                class203.field3509[0] = class84.field1349;
                                class44.field684[0] = class49.field728;
                                class264.field4466[0] = 1007;
                            }
                            if (var23 <= class251.field4239 && class197.field3306 >= var20 && var24 > class251.field4239 && class197.field3306 < var25) {
                                class222.method1556(class197.field3306 - var13, -var15 + class251.field4239, var11, -92);
                            }
                        }
                        if (var11.field3281 == 0) {
                            if (!var11.field3365 && client.method1674(var11) && class56.field874 != var11) {
                                continue;
                            }
                            if (!var11.field3365) {
                                if (var11.field3310 > (var11.field3384 - var11.field3253)) {
                                    var11.field3310 = var11.field3384 - var11.field3253;
                                }
                                if (var11.field3310 < 0) {
                                    var11.field3310 = 0;
                                }
                            }
                            method1112(var15 - var11.field3371, true, var12, var23, arg4, var25, var20, var11.field3256, var13 - var11.field3310, var24);
                            if (var11.field3359 != null) {
                                method1112(var15 - var11.field3371, arg1, var12, var23, var11.field3359, var25, var20, var11.field3256, var13 - var11.field3310, var24);
                            }
                            class155 var26 = (class155) class158.field2675.method280((long) var11.field3256, 29153);
                            if (var26 != null) {
                                if (var26.field2649 == 0 && !class156.field2651 && class251.field4239 >= var23 && class197.field3306 >= var20 && class251.field4239 < var24 && class197.field3306 < var25 && !class198.field3421) {
                                    class136.field2272 = 1;
                                    class203.field3509[0] = class84.field1349;
                                    class44.field684[0] = class49.field728;
                                    class264.field4466[0] = 1007;
                                }
                                class16.method77(var23, var25, var15, (byte) 96, var12, var26.field2637, var24, var13, var20);
                            }
                            if (class281.field4827) {
                                class126.method938(arg3, arg6, arg9, arg5);
                            } else {
                                class175.method1258(arg3, arg6, arg9, arg5);
                                class283.method1997();
                            }
                        }
                        if (class4.field62[var12] || class239.field3995 > 1) {
                            if (var11.field3281 == 0 && !var11.field3365 && var11.field3384 > var11.field3253) {
                                class53.method330(var15 + var11.field3294, var13, var11.field3384, var11.field3253, var11.field3310, (byte) -69);
                            }
                            if (var11.field3281 != 1) {
                                if (var11.field3281 == 2) {
                                    int var27 = 0;
                                    for (int var28 = 0; var28 < var11.field3303; var28++) {
                                        for (int var29 = 0; var29 < var11.field3343; var29++) {
                                            int var30 = (var11.field3362 + 32) * var29 + var15;
                                            int var31 = (var11.field3267 + 32) * var28 + var13;
                                            if (var27 < 20) {
                                                var30 += var11.field3388[var27];
                                                var31 += var11.field3244[var27];
                                            }
                                            if (var11.field3352[var27] > 0) {
                                                boolean var32 = false;
                                                boolean var33 = false;
                                                int var34 = var11.field3352[var27] - 1;
                                                if (var30 + 32 > arg3 && arg9 > var30 && arg6 < (var31 + 32) && var31 < arg5 || class51.field767 == var11 && class47.field704 == var27) {
                                                    class269 var35;
                                                    if (class72.field1182 == 1 && class131.field2170 == var27 && class77.field1262 == var11.field3256) {
                                                        var35 = class264.method1841(0, var11.field3268, 2, (byte) 125, var11.field3360[var27], var34);
                                                    } else {
                                                        var35 = class264.method1841(3153952, var11.field3268, 1, (byte) -122, var11.field3360[var27], var34);
                                                    }
                                                    if (class283.field4874) {
                                                        class187.field3008[var12] = true;
                                                    }
                                                    if (var35 == null) {
                                                        class108.method834((byte) 49, var11);
                                                    } else if (class51.field767 == var11 && class47.field704 == var27) {
                                                        int var36 = class67.field994 - class274.field4703;
                                                        int var37 = class2.field31 - class79.field1287;
                                                        if (var37 < 5 && var37 > -5) {
                                                            var37 = 0;
                                                        }
                                                        if (var36 < 5 && var36 > -5) {
                                                            var36 = 0;
                                                        }
                                                        if (class114.field1926 < 5) {
                                                            var37 = 0;
                                                            var36 = 0;
                                                        }
                                                        var35.method395(var30 + var37, var31 + var36, 128);
                                                        if (arg7 != -1) {
                                                            class197 var38 = arg4[arg7 & 0xFFFF];
                                                            int var39;
                                                            int var40;
                                                            if (class281.field4827) {
                                                                var39 = class126.field2090;
                                                                var40 = class126.field2087;
                                                            } else {
                                                                var39 = class175.field2893;
                                                                var40 = class175.field2896;
                                                            }
                                                            if ((var31 + var36) < var39 && var38.field3310 > 0) {
                                                                int var41 = (var39 - var31 - var36) * class122.field2036 / 3;
                                                                if ((class122.field2036 * 10) < var41) {
                                                                    var41 = class122.field2036 * 10;
                                                                }
                                                                if (var41 > var38.field3310) {
                                                                    var41 = var38.field3310;
                                                                }
                                                                class274.field4703 += var41;
                                                                var38.field3310 -= var41;
                                                                class108.method834((byte) 49, var38);
                                                            }
                                                            if (var36 + var31 + 32 > var40 && var38.field3384 - var38.field3253 > var38.field3310) {
                                                                int var42 = (var31 + var36 + 32 - var40) * class122.field2036 / 3;
                                                                if ((class122.field2036 * 10) < var42) {
                                                                    var42 = class122.field2036 * 10;
                                                                }
                                                                if (var38.field3384 - var38.field3310 - var38.field3253 < var42) {
                                                                    var42 = var38.field3384 - var38.field3253 - var38.field3310;
                                                                }
                                                                class274.field4703 -= var42;
                                                                var38.field3310 += var42;
                                                                class108.method834((byte) 49, var38);
                                                            }
                                                        }
                                                    } else if (class268.field4584 == var11 && class144.field2406 == var27) {
                                                        var35.method395(var30, var31, 128);
                                                    } else {
                                                        var35.method291(var30, var31);
                                                    }
                                                }
                                            } else if (var11.field3290 != null && var27 < 20) {
                                                class269 var43 = var11.method1418(var27, 25760);
                                                if (var43 != null) {
                                                    var43.method291(var30, var31);
                                                } else if (class3.field39) {
                                                    class108.method834((byte) 49, var11);
                                                }
                                            }
                                            var27++;
                                        }
                                    }
                                } else if (var11.field3281 == 3) {
                                    int var110;
                                    if (class159.method1158(30439, var11)) {
                                        var110 = var11.field3257;
                                        if (class56.field874 == var11 && var11.field3315 != 0) {
                                            var110 = var11.field3315;
                                        }
                                    } else {
                                        var110 = var11.field3331;
                                        if (class56.field874 == var11 && var11.field3390 != 0) {
                                            var110 = var11.field3390;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field3288) {
                                            if (class281.field4827) {
                                                class126.method936(var15, var13, var11.field3294, var11.field3253, var110);
                                            } else {
                                                class175.method1249(var15, var13, var11.field3294, var11.field3253, var110);
                                            }
                                        } else if (class281.field4827) {
                                            class126.method926(var15, var13, var11.field3294, var11.field3253, var110);
                                        } else {
                                            class175.method1253(var15, var13, var11.field3294, var11.field3253, var110);
                                        }
                                    } else if (var11.field3288) {
                                        if (class281.field4827) {
                                            class126.method932(var15, var13, var11.field3294, var11.field3253, var110, 256 - (var14 & 0xFF));
                                        } else {
                                            class175.method1241(var15, var13, var11.field3294, var11.field3253, var110, 256 - (var14 & 0xFF));
                                        }
                                    } else if (class281.field4827) {
                                        class126.method929(var15, var13, var11.field3294, var11.field3253, var110, 256 - (var14 & 0xFF));
                                    } else {
                                        class175.method1243(var15, var13, var11.field3294, var11.field3253, var110, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field3281 == 4) {
                                    class71 var106 = var11.method1417(class44.field681, (byte) -91);
                                    if (var106 != null) {
                                        class255 var107 = var11.field3298;
                                        int var108;
                                        if (class159.method1158(30439, var11)) {
                                            var108 = var11.field3257;
                                            if (class56.field874 == var11 && var11.field3315 != 0) {
                                                var108 = var11.field3315;
                                            }
                                            if (var11.field3382.method1774(-41) > 0) {
                                                var107 = var11.field3382;
                                            }
                                        } else {
                                            var108 = var11.field3331;
                                            if (class56.field874 == var11 && var11.field3390 != 0) {
                                                var108 = var11.field3390;
                                            }
                                        }
                                        if (var11.field3365 && var11.field3397 != -1) {
                                            class192 var109 = class132.method990((byte) -119, var11.field3397);
                                            var107 = var109.field3112;
                                            if (var107 == null) {
                                                var107 = class242.field4061;
                                            }
                                            if ((var109.field3066 == 1 || var11.field3262 != 1) && var11.field3262 != -1) {
                                                var107 = class3.method14(new class255[] { class293.field5038, var107, class123.field2047, class159.method1159(-127, var11.field3262) }, (byte) -121);
                                            }
                                        }
                                        if (class68.field1009 == var11) {
                                            var108 = var11.field3331;
                                            var107 = class236.field3876;
                                        }
                                        if (!var11.field3365) {
                                            var107 = class172.method1225(var11, var107, 2);
                                        }
                                        var106.method488(var107, var15, var13, var11.field3294, var11.field3253, var108, var11.field3265 ? 0 : -1, var11.field3283, var11.field3252, var11.field3328);
                                    } else if (class3.field39) {
                                        class108.method834((byte) 49, var11);
                                    }
                                } else if (var11.field3281 == 5) {
                                    if (var11.field3365) {
                                        class269 var90;
                                        if (var11.field3397 == -1) {
                                            var90 = var11.method1409((byte) -117, false);
                                        } else {
                                            var90 = class264.method1841(var11.field3323, var11.field3268, var11.field3299, (byte) 96, var11.field3262, var11.field3397);
                                        }
                                        if (var90 != null) {
                                            int var91 = var90.field4622;
                                            int var92 = var90.field4634;
                                            if (var11.field3368) {
                                                int var93 = (var11.field3294 - (1 - var92)) / var92;
                                                int var94 = (var11.field3253 + var91 - 1) / var91;
                                                if (class281.field4827) {
                                                    class126.method934(var15, var13, var11.field3294 + var15, var11.field3253 + var13);
                                                    boolean var95 = class116.method881(var90.field4619, (byte) -69);
                                                    boolean var96 = class116.method881(var90.field4628, (byte) -69);
                                                    class98 var97 = (class98) var90;
                                                    if (var95 && var96) {
                                                        if (var14 == 0) {
                                                            var97.method771(var15, var13, var93, var94);
                                                        } else {
                                                            var97.method776(var15, var13, 256 - (var14 & 0xFF), var93, var94);
                                                        }
                                                    } else if (var95) {
                                                        for (int var98 = 0; var98 < var94; var98++) {
                                                            if (var14 == 0) {
                                                                var97.method771(var15, var91 * var98 + var13, var93, 1);
                                                            } else {
                                                                var97.method776(var15, var91 * var98 + var13, -(var14 & 0xFF) + 256, var93, 1);
                                                            }
                                                        }
                                                    } else if (var96) {
                                                        for (int var99 = 0; var99 < var93; var99++) {
                                                            if (var14 == 0) {
                                                                var97.method771(var92 * var99 + var15, var13, 1, var94);
                                                            } else {
                                                                var97.method776(var15 + (var92 * var99), var13, 256 - (var14 & 0xFF), 1, var94);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var100 = 0; var100 < var93; var100++) {
                                                            for (int var101 = 0; var101 < var94; var101++) {
                                                                if (var14 == 0) {
                                                                    var90.method291(var92 * var100 + var15, var91 * var101 + var13);
                                                                } else {
                                                                    var90.method395(var92 * var100 + var15, var91 * var101 + var13, 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class126.method938(arg3, arg6, arg9, arg5);
                                                } else {
                                                    class175.method1251(var15, var13, var15 + var11.field3294, var11.field3253 + var13);
                                                    for (int var102 = 0; var102 < var93; var102++) {
                                                        for (int var103 = 0; var103 < var94; var103++) {
                                                            if (var11.field3385 != 0) {
                                                                var90.method1873(4096, var91 * var103 + (var91 / 2) + var13, (byte) 123, var92 / 2 + (var15 + (var92 * var102)), var11.field3385);
                                                            } else if (var14 == 0) {
                                                                var90.method291(var92 * var102 + var15, var91 * var103 + var13);
                                                            } else {
                                                                var90.method395(var92 * var102 + var15, var91 * var103 + var13, 256 - (var14 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class175.method1258(arg3, arg6, arg9, arg5);
                                                }
                                            } else {
                                                int var104 = var11.field3294 * 4096 / var92;
                                                if (var11.field3385 != 0) {
                                                    var90.method1873(var104, var11.field3253 / 2 + var13, (byte) 123, var11.field3294 / 2 + var15, var11.field3385);
                                                } else if (var14 != 0) {
                                                    var90.method399(var15, var13, var11.field3294, var11.field3253, 256 - (var14 & 0xFF));
                                                } else if (var11.field3294 == var92 && var11.field3253 == var91) {
                                                    var90.method291(var15, var13);
                                                } else {
                                                    var90.method572(var15, var13, var11.field3294, var11.field3253);
                                                }
                                            }
                                        } else if (class3.field39) {
                                            class108.method834((byte) 49, var11);
                                        }
                                    } else {
                                        class269 var105 = var11.method1409((byte) -117, class159.method1158(30439, var11));
                                        if (var105 != null) {
                                            var105.method291(var15, var13);
                                        } else if (class3.field39) {
                                            class108.method834((byte) 49, var11);
                                        }
                                    }
                                } else if (var11.field3281 == 6) {
                                    boolean var71 = class159.method1158(30439, var11);
                                    int var72;
                                    if (var71) {
                                        var72 = var11.field3282;
                                    } else {
                                        var72 = var11.field3309;
                                    }
                                    int var73 = 0;
                                    class227 var74 = null;
                                    if (var11.field3397 != -1) {
                                        class192 var75 = class132.method990((byte) -119, var11.field3397);
                                        if (var75 != null) {
                                            class192 var76 = var75.method1319(-36, var11.field3262);
                                            class271 var77 = var72 == -1 ? null : class181.method1269(99, var72);
                                            var74 = var76.method1330(1, var11.field3373, var77, -129);
                                            if (var74 == null) {
                                                class108.method834((byte) 49, var11);
                                            } else {
                                                var73 = -var74.method176() / 2;
                                            }
                                        }
                                    } else if (var11.field3274 == 5) {
                                        if (var11.field3399 == -1) {
                                            var74 = class34.field543.method2155(12, -1, (class271) null, (class271) null, -1);
                                        } else {
                                            int var78 = var11.field3399 & 0x7FF;
                                            if (class14.field210 == var78) {
                                                var78 = 2047;
                                            }
                                            class242 var79 = class151.field2555[var78];
                                            class271 var80 = var72 == -1 ? null : class181.method1269(126, var72);
                                            if (var79 != null && (int) var79.field4068.method1764((byte) -104) << 11 == (var11.field3399 & 0xFFFFF800)) {
                                                var74 = var79.field4057.method2155(12, var11.field3373, (class271) null, var80, 0);
                                            }
                                        }
                                    } else if (var72 == -1) {
                                        var74 = var11.method1423((class271) null, -32, class276.field4742.field4057, -1, var71);
                                        if (var74 == null && class3.field39) {
                                            class108.method834((byte) 49, var11);
                                        }
                                    } else {
                                        class271 var81 = class181.method1269(90, var72);
                                        var74 = var11.method1423(var81, -94, class276.field4742.field4057, var11.field3373, var71);
                                        if (var74 == null && class3.field39) {
                                            class108.method834((byte) 49, var11);
                                        }
                                    }
                                    if (var74 != null) {
                                        int var82;
                                        if (var11.field3400 <= 0) {
                                            var82 = 256;
                                        } else {
                                            var82 = (var11.field3294 << 8) / var11.field3400;
                                        }
                                        int var83;
                                        if (var11.field3280 <= 0) {
                                            var83 = 256;
                                        } else {
                                            var83 = (var11.field3253 << 8) / var11.field3280;
                                        }
                                        int var84 = (var11.field3364 * var82 >> 8) + var11.field3294 / 2 + var15;
                                        int var85 = (var11.field3324 * var83 >> 8) + var11.field3253 / 2 + var13;
                                        if (class281.field4827) {
                                            if (var11.field3403) {
                                                class281.method1967(var84, var85, var11.field3259, var11.field3379, var82, var83);
                                            } else {
                                                class281.method1980(var84, var85, var82, var83);
                                                class281.method1961((float) var11.field3377, (float) var11.field3379 * 1.5F);
                                            }
                                            class281.method1966();
                                            class281.method1968(true);
                                            class281.method1971(false);
                                            class296.method2082(64);
                                            if (class141.field2340) {
                                                class126.method927();
                                                class281.method1954();
                                                class126.method938(arg3, arg6, arg9, arg5);
                                                class141.field2340 = false;
                                            }
                                            if (var11.field3320) {
                                                class281.method1958();
                                            }
                                            int var86 = class283.field4877[var11.field3251] * var11.field3259 >> 16;
                                            int var87 = class283.field4870[var11.field3251] * var11.field3259 >> 16;
                                            if (var11.field3365) {
                                                var74.method1357(0, var11.field3350, var11.field3340, var11.field3251, var11.field3258, var73 + var86 + var11.field3357, var11.field3357 + var87);
                                            } else {
                                                var74.method1357(0, var11.field3350, 0, var11.field3251, 0, var86, var87);
                                            }
                                            if (var11.field3320) {
                                                class281.method1957();
                                            }
                                        } else {
                                            class283.method1996(var84, var85);
                                            int var88 = class283.field4877[var11.field3251] * var11.field3259 >> 16;
                                            int var89 = class283.field4870[var11.field3251] * var11.field3259 >> 16;
                                            if (!var11.field3365) {
                                                var74.method1357(0, var11.field3350, 0, var11.field3251, 0, var88, var89);
                                            } else if (var11.field3403) {
                                                ((class267) var74).method1856(0, var11.field3350, var11.field3340, var11.field3251, var11.field3258, var11.field3357 + var88 + var73, var11.field3357 + var89, var11.field3259);
                                            } else {
                                                var74.method1357(0, var11.field3350, var11.field3340, var11.field3251, var11.field3258, var73 + var88 + var11.field3357, var11.field3357 + var89);
                                            }
                                            class283.method2012();
                                        }
                                    }
                                } else {
                                    if (var11.field3281 == 7) {
                                        class71 var44 = var11.method1417(class44.field681, (byte) -62);
                                        if (var44 == null) {
                                            if (class3.field39) {
                                                class108.method834((byte) 49, var11);
                                            }
                                            continue;
                                        }
                                        int var45 = 0;
                                        for (int var46 = 0; var46 < var11.field3303; var46++) {
                                            for (int var47 = 0; var47 < var11.field3343; var47++) {
                                                if (var11.field3352[var45] > 0) {
                                                    class192 var48 = class132.method990((byte) -119, var11.field3352[var45] - 1);
                                                    class255 var49;
                                                    if (var48.field3066 != 1 && var11.field3360[var45] == 1) {
                                                        var49 = class3.method14(new class255[] { class293.field5038, var48.field3112, class160.field2705 }, (byte) -128);
                                                    } else {
                                                        var49 = class3.method14(new class255[] { class293.field5038, var48.field3112, class123.field2047, class159.method1159(-114, var11.field3360[var45]) }, (byte) -59);
                                                    }
                                                    int var50 = (var11.field3267 + 12) * var46 + var13;
                                                    int var51 = (var11.field3362 + 115) * var47 + var15;
                                                    if (var11.field3283 == 0) {
                                                        var44.method494(var49, var51, var50, var11.field3331, var11.field3265 ? 0 : -1);
                                                    } else if (var11.field3283 == 1) {
                                                        var44.method497(var49, var51 + 57, var50, var11.field3331, var11.field3265 ? 0 : -1);
                                                    } else {
                                                        var44.method500(var49, var51 + 115 - 1, var50, var11.field3331, var11.field3265 ? 0 : -1);
                                                    }
                                                }
                                                var45++;
                                            }
                                        }
                                    }
                                    if (var11.field3281 == 8 && class264.field4472 == var11 && class80.field1296 == class256.field4362) {
                                        int var52 = 0;
                                        int var53 = 0;
                                        class71 var54 = class102.field1719;
                                        class255 var55 = var11.field3298;
                                        class255 var56 = class172.method1225(var11, var55, 2);
                                        while (var56.method1774(-41) > 0) {
                                            int var57 = var56.method1790((byte) -108, class216.field3669);
                                            class255 var58;
                                            if (var57 == -1) {
                                                var58 = var56;
                                                var56 = class49.field728;
                                            } else {
                                                var58 = var56.method1780(var57, -10449, 0);
                                                var56 = var56.method1786(var57 + 4, 9751);
                                            }
                                            int var59 = var54.method498(var58);
                                            var53 += var54.field1122 + 1;
                                            if (var59 > var52) {
                                                var52 = var59;
                                            }
                                        }
                                        var53 += 7;
                                        var52 += 6;
                                        int var60 = var13 + var11.field3253 + 5;
                                        int var61 = var11.field3294 + var15 - var52 - 5;
                                        if (var15 + 5 > var61) {
                                            var61 = var15 + 5;
                                        }
                                        if (arg9 < var61 + var52) {
                                            var61 = arg9 - var52;
                                        }
                                        if (arg5 < (var53 + var60)) {
                                            var60 = arg5 - var53;
                                        }
                                        if (class281.field4827) {
                                            class126.method936(var61, var60, var52, var53, 16777120);
                                            class126.method926(var61, var60, var52, var53, 0);
                                        } else {
                                            class175.method1249(var61, var60, var52, var53, 16777120);
                                            class175.method1253(var61, var60, var52, var53, 0);
                                        }
                                        class255 var62 = var11.field3298;
                                        int var63 = var54.field1122 + var60 + 2;
                                        class255 var64 = class172.method1225(var11, var62, 2);
                                        while (var64.method1774(-41) > 0) {
                                            int var65 = var64.method1790((byte) -15, class216.field3669);
                                            class255 var66;
                                            if (var65 == -1) {
                                                var66 = var64;
                                                var64 = class49.field728;
                                            } else {
                                                var66 = var64.method1780(var65, -10449, 0);
                                                var64 = var64.method1786(var65 + 4, 9751);
                                            }
                                            var54.method494(var66, var61 + 3, var63, 0, -1);
                                            var63 += var54.field1122 + 1;
                                        }
                                    }
                                    if (var11.field3281 == 9) {
                                        int var67;
                                        int var68;
                                        int var69;
                                        int var70;
                                        if (var11.field3321) {
                                            var67 = var15 + var11.field3294;
                                            var68 = var11.field3253 + var13;
                                            var69 = var13;
                                            var70 = var15;
                                        } else {
                                            var69 = var11.field3253 + var13;
                                            var68 = var13;
                                            var70 = var15;
                                            var67 = var11.field3294 + var15;
                                        }
                                        if (var11.field3394 == 1) {
                                            if (class281.field4827) {
                                                class126.method930(var70, var68, var67, var69, var11.field3331);
                                            } else {
                                                class175.method1246(var70, var68, var67, var69, var11.field3331);
                                            }
                                        } else if (class281.field4827) {
                                            class126.method940(var70, var68, var67, var69, var11.field3331, var11.field3394);
                                        } else {
                                            class175.method1260(var70, var68, var67, var69, var11.field3331, var11.field3394);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field2531++;
        if (!arg1) {
            method1115(false, -104, -76, true, -32, 69, -80);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V", line = 1408)
    private final void method1113(int arg0) {
        if (arg0 != -1168259326) {
            this.field2529 = (int[]) null;
        }
        this.field2538 += ++this.field2540;
        field2536++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2548[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2532 ^= this.field2532 << 13;
                } else {
                    this.field2532 ^= this.field2532 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2532 ^= this.field2532 << 2;
            } else {
                this.field2532 ^= this.field2532 >>> 16;
            }
            this.field2532 += this.field2548[var2 + 128 & 0xFF];
            int var4;
            this.field2548[var2] = var4 = this.field2532 + (this.field2548[class154.method1134(var3, 1020) >> 2] + this.field2538);
            this.field2529[var2] = this.field2538 = var3 + this.field2548[class154.method1134(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V", line = 1475)
    private class150() {
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 1479)
    public static void method1114(byte arg0) {
        field2542 = null;
        field2550 = null;
        field2533 = null;
        field2551 = null;
        int var1 = -9 / ((72 - arg0) / 36);
        field2539 = (byte[][]) null;
        field2545 = null;
        field2553 = null;
        field2544 = null;
        field2547 = null;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "([I)V", line = 1494)
    public class150(int[] arg0) {
        this.field2529 = new int[256];
        this.field2548 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2529[var2] = arg0[var2];
        }
        this.method1110(79);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZIIZIII)V", line = 1521)
    public static final void method1115(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            class281.method1982();
        }
        if (class307.field5221 != null && (arg1 != 3 || class264.field4469 != arg2 || class9.field133 != arg4)) {
            class3.method22(class221.field3728, class307.field5221, -86);
            class307.field5221 = null;
        }
        if (arg1 == 3 && class307.field5221 == null) {
            class307.field5221 = class91.method686(arg2, 0, 0, class221.field3728, arg4, (byte) -68);
            if (class307.field5221 != null) {
                class264.field4469 = arg2;
                class9.field133 = arg4;
                class174.method1235(100, class221.field3728);
            }
        }
        field2541++;
        if (arg1 == 3 && class307.field5221 == null) {
            method1115(true, class289.field4979, -1, true, -1, -18, arg6);
            return;
        }
        Container var7;
        if (class307.field5221 != null) {
            var7 = class307.field5221;
        } else if (class37.field561 == null) {
            var7 = class221.field3728.field626;
        } else {
            var7 = class37.field561;
        }
        class289.field4980 = var7.getSize().width;
        class107.field1790 = var7.getSize().height;
        if (class37.field561 == var7) {
            Insets var8 = class37.field561.getInsets();
            class107.field1790 -= var8.top + var8.bottom;
            class289.field4980 -= var8.right + var8.left;
        }
        if (arg1 >= 2) {
            class64.field965 = 0;
            class162.field2728 = 0;
            class210.field3589 = class289.field4980;
            class201.field3479 = class107.field1790;
        } else {
            class201.field3479 = 503;
            class162.field2728 = 0;
            class64.field965 = (class289.field4980 - 765) / 2;
            class210.field3589 = 765;
        }
        if (arg0) {
            class23.method127(80, class240.field3999);
            class248.method1711(0, class240.field3999);
            if (class69.field1036 != null) {
                class69.field1036.method693((byte) 109, class240.field3999);
            }
            class85.field1385.method2036(-125);
            class127.method946(class240.field3999, (byte) -79);
            class120.method892(class240.field3999, false);
            if (class69.field1036 != null) {
                class69.field1036.method695(class240.field3999, 119);
            }
        } else {
            if (class281.field4827) {
                class281.method1989(class210.field3589, class201.field3479);
            }
            class240.field3999.setSize(class210.field3589, class201.field3479);
            if (class37.field561 == var7) {
                Insets var9 = class37.field561.getInsets();
                class240.field3999.setLocation(class64.field965 + var9.left, class162.field2728 + var9.top);
            } else {
                class240.field3999.setLocation(class64.field965, class162.field2728);
            }
        }
        if (arg1 == 0 && arg6 > 0) {
            class281.method1962(class240.field3999);
        }
        if (arg3 && arg1 > 0) {
            class240.field3999.setIgnoreRepaint(true);
            if (!class136.field2273) {
                class143.method1061();
                class69.field1033 = null;
                class69.field1033 = class17.method84(class210.field3589, (byte) 126, class240.field3999, class201.field3479);
                class175.method1250();
                if (class18.field281 == 5) {
                    class271.method1895(class277.field4761, (byte) 83, true);
                } else {
                    class256.method1796(class241.field4009, -8921, false);
                }
                try {
                    Graphics var10 = class240.field3999.getGraphics();
                    class69.field1033.method1123(0, var10, (byte) 54, 0);
                } catch (Exception var15) {
                }
                class252.method1726((byte) 124);
                if (arg6 == 0) {
                    class69.field1033 = class17.method84(765, (byte) 122, class240.field3999, 503);
                } else {
                    class69.field1033 = null;
                }
                class169 var12 = class221.field3728.method236(-70, class85.field1385.getClass());
                while (var12.field2833 == 0) {
                    class137.method1027(100L, 0);
                }
                if (var12.field2833 == 1) {
                    class136.field2273 = true;
                }
            }
            if (class136.field2273) {
                class281.method1959(class240.field3999, class250.field4222 * 2);
            }
        }
        if (!class281.field4827 && arg1 > 0) {
            method1115(true, 0, -1, true, -1, 68, arg6);
            return;
        }
        if (arg1 > 0 && arg6 == 0) {
            class97.field1680.setPriority(5);
            class69.field1033 = null;
            class267.method1865();
            ((class132) class283.field4866).method978(200, 250);
            if (class114.field1921) {
                class283.method2008(0.7F);
            }
        } else if (arg1 == 0 && arg6 > 0) {
            class97.field1680.setPriority(1);
            class69.field1033 = class17.method84(765, (byte) 125, class240.field3999, 503);
            class267.method1864();
            ((class132) class283.field4866).method978(20, 250);
            if (class114.field1921) {
                if (class79.field1291 == 1) {
                    class283.method2008(0.9F);
                }
                if (class79.field1291 == 2) {
                    class283.method2008(0.8F);
                }
                if (class79.field1291 == 3) {
                    class283.method2008(0.7F);
                }
                if (class79.field1291 == 4) {
                    class283.method2008(0.6F);
                }
            }
            class142.method1058();
        }
        if (arg3) {
            class260.method1810(false);
        }
        if (arg1 < 2) {
            class79.field1289 = false;
        } else {
            class79.field1289 = true;
        }
        if (class264.field4459 != -1) {
            class155.method1141(-67, true);
        }
        if (client.field4041 != null && (class18.field281 == 30 || class18.field281 == 25)) {
            class136.method1023(7498);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class187.field3008[var13] = true;
        }
        class17.field254 = true;
        int var14 = -39 % ((arg5 - 25) / 36);
    }
}
