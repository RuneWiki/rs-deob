import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class397 {

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "[I")
    private int[] field5052 = new int[8191];

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "[[Lfu;")
    private class66[][] field5047 = new class66[64][768];

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "[I")
    private int[] field5056 = new int[1600];

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    private int field5051 = 0;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "[[Lfu;")
    private class66[][] field5062 = new class66[1600][64];

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "[I")
    private int[] field5063 = new int[64];

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "Lhj;")
    private class150 field5059;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "Lcu;")
    private class269 field5050;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "Lcu;")
    private class269 field5053;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "Lui;")
    private class498 field5060;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "Luca;")
    public static class289 field5054;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIZIII)V", line = 3)
    public static final void method2269(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field5064++;
        if (arg4) {
            method2272(80);
        }
        if (arg1 == arg7) {
            class2.method6(arg3, arg5, arg0, arg6, arg7, 50, arg2);
        } else if (class265.field3552 <= (arg6 - arg7) && arg6 + arg7 <= class641.field8924 && (arg5 - arg1) >= class165.field2061 && class99.field1309 >= arg1 + arg5) {
            class594.method3225(arg6, -17784, arg5, arg2, arg1, arg7, arg3, arg0);
        } else {
            class213.method1368(arg3, arg7, arg6, arg1, arg2, 87, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lfc;B)V", line = 26)
    public final void method2270(class575 arg0, byte arg1) {
        this.field5050.method649((byte) 115, 24, 786336);
        field5055++;
        if (arg1 < 44) {
            this.field5053 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILfc;Lqu;)V", line = 39)
    public final void method2271(int arg0, class575 arg1, class282 arg2) {
        field5058++;
        if (arg1.field7673 == null) {
            return;
        }
        this.method2273(arg1, true);
        float var4 = arg1.field7673.field1702;
        float var5 = arg1.field7673.field1689;
        float var6 = arg1.field7673.field1699;
        float var7 = arg1.field7673.field1707;
        try {
            if (arg2.field3677) {
                int var8 = arg2.field3674 - arg2.field3676;
                int var9;
                if (var8 + 2 <= 1600) {
                    var8 += 2;
                    var9 = 0;
                } else {
                    var9 = class127.method924(12, var8) + 1 - class402.field5137;
                    var8 = (var8 >> var9) + 2;
                }
                class154 var10 = arg2.field3673.field7895;
                class154 var11 = var10.field1956;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field5051 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field5056[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field5063[var16] = 0;
                    }
                    while (var10 != var11) {
                        class66 var17 = (class66) var11;
                        if (var14) {
                            var12 = var17.field905;
                            var14 = false;
                            var13 = var17.field892;
                        } else if (var17.field905 != var12 || var17.field892 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field895 >> 12) * var6 + (float) (var17.field899 >> 12) * var4 + (float) (var17.field894 >> 12) * var5 + var7) - arg2.field3676 >> var9;
                        if (var18 < 1600) {
                            if (this.field5056[var18] < 64) {
                                this.field5062[var18][this.field5056[var18]++] = var17;
                            } else {
                                label156: {
                                    if (this.field5056[var18] == 64) {
                                        if (this.field5051 == 64) {
                                            break label156;
                                        }
                                        this.field5056[var18] += (this.field5051++) + 1;
                                    }
                                    this.field5047[this.field5056[var18] - 64 - 1][this.field5063[this.field5056[var18] - 64 - 1]++] = var17;
                                }
                            }
                        }
                        var11 = var11.field1956;
                    }
                    arg1.method3065(false, false, 14721, var12 <= 0 ? -1 : var12);
                    if (var13 && class21.field228 != arg1.field7678) {
                        arg1.method360(class21.field228);
                    } else if (arg1.field7678 != 1.0F) {
                        arg1.method360(1.0F);
                    }
                    this.method2275(var8, 53, arg1);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class154 var22 = arg2.field3673.field7895;
                for (class154 var23 = var22.field1956; var23 != var22; var23 = var23.field1956) {
                    class66 var24 = (class66) var23;
                    int var25 = (int) ((float) (var24.field895 >> 12) * var6 + (float) (var24.field899 >> 12) * var4 + (float) (var24.field894 >> 12) * var5 + var7);
                    if (var21 < var25) {
                        var21 = var25;
                    }
                    this.field5052[var19++] = var25;
                    if (var20 > var25) {
                        var20 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = class127.method924(arg0 - 53, var26) + 1 - class402.field5137;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                class154 var28 = var22.field1956;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field5051 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field5056[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field5063[var34] = 0;
                    }
                    while (var22 != var28) {
                        class66 var35 = (class66) var28;
                        if (var32) {
                            var32 = false;
                            var30 = var35.field905;
                            var31 = var35.field892;
                        }
                        if (var29 > 0 && (var35.field905 != var30 || var31 != var35.field892)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field5052[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field5056[var36] < 64) {
                                this.field5062[var36][this.field5056[var36]++] = var35;
                            } else {
                                label200: {
                                    if (this.field5056[var36] == 64) {
                                        if (this.field5051 == 64) {
                                            break label200;
                                        }
                                        this.field5056[var36] += this.field5051++ + 1;
                                    }
                                    class66[] var38 = this.field5047[this.field5056[var36] - 64 - 1];
                                    int var10002 = this.field5056[var36] - 65;
                                    int var10004 = this.field5063[this.field5056[var36] - 65];
                                    this.field5063[var10002] = this.field5063[this.field5056[var36] - 65] + 1;
                                    var38[var10004] = var35;
                                }
                            }
                        }
                        var28 = var28.field1956;
                    }
                    arg1.method3065(false, false, 14721, var30 >= 0 ? var30 : -1);
                    if (var31 && class21.field228 != arg1.field7678) {
                        arg1.method360(class21.field228);
                    } else if (arg1.field7678 != 1.0F) {
                        arg1.method360(1.0F);
                    }
                    this.method2275(var26, 117, arg1);
                }
            }
            if (arg0 != 65) {
                this.method2275(31, -114, null);
            }
        } catch (Exception var37) {
        }
        this.method2276(arg1, -92);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 306)
    public static void method2272(int arg0) {
        field5054 = null;
        if (arg0 != 3429) {
            field5054 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lfc;Z)V", line = 317)
    private final void method2273(class575 arg0, boolean arg1) {
        field5049++;
        class21.field228 = arg0.field7678;
        if (!arg1) {
            this.field5060 = null;
        }
        arg0.method3141(8);
        arg0.method3120(false, 0);
        arg0.method3083(false, !arg1);
        arg0.method3133((byte) 123);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V", line = 335)
    public final void method2274(boolean arg0) {
        field5061++;
        if (!arg0) {
            this.method2271(-14, null, null);
        }
        this.field5050.method645(-67);
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lfc;)V", line = 777)
    public class397(class575 arg0) {
        this.field5059 = arg0.method230((byte) -125, new class560[] { new class560(new class568[] { class568.field7414, class568.field7417, class568.field7420 }), new class560(class568.field7415) });
        this.field5050 = arg0.method159(true, false);
        this.field5053 = arg0.method159(false, false);
        this.field5053.method649((byte) 124, 12, 393168);
        this.field5060 = arg0.method186(false, true);
        this.field5060.method2429(49146, (byte) -96);
        Buffer var2 = this.field5060.method647(false, true);
        if (var2 != null) {
            Stream var3 = arg0.method3087(var2, 6);
            if (Stream.method1964()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method1961(var7);
                    var3.method1961(var7 + 1);
                    var3.method1961(var7 + 2);
                    var3.method1961(var7 + 2);
                    var3.method1961(var7 + 3);
                    var3.method1961(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method1959(var5);
                    var3.method1959(var5 + 1);
                    var3.method1959(var5 + 2);
                    var3.method1959(var5 + 2);
                    var3.method1959(var5 + 3);
                    var3.method1959(var5);
                }
            }
            var3.method1955();
            this.field5060.method646(-107);
        }
        Buffer var8 = this.field5053.method647(false, true);
        if (var8 != null) {
            Stream var9 = arg0.method3087(var8, 6);
            if (Stream.method1964()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method1958(0.0F);
                    var9.method1958(-1.0F);
                    var9.method1958(0.0F);
                    var9.method1958(0.0F);
                    var9.method1958(-1.0F);
                    var9.method1958(0.0F);
                    var9.method1958(0.0F);
                    var9.method1958(-1.0F);
                    var9.method1958(0.0F);
                    var9.method1958(0.0F);
                    var9.method1958(-1.0F);
                    var9.method1958(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method1956(0.0F);
                    var9.method1956(-1.0F);
                    var9.method1956(0.0F);
                    var9.method1956(0.0F);
                    var9.method1956(-1.0F);
                    var9.method1956(0.0F);
                    var9.method1956(0.0F);
                    var9.method1956(-1.0F);
                    var9.method1956(0.0F);
                    var9.method1956(0.0F);
                    var9.method1956(-1.0F);
                    var9.method1956(0.0F);
                }
            }
            var9.method1955();
            this.field5053.method646(-111);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILfc;)V", line = 352)
    private final void method2275(int arg0, int arg1, class575 arg2) {
        field5048++;
        int var4 = 0;
        class131 var5 = arg2.method3074((byte) -97);
        float var6 = var5.field1716;
        float var7 = var5.field1710;
        float var8 = var5.field1718;
        float var9 = var5.field1731;
        float var10 = var5.field1688;
        float var11 = var5.field1733;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field5050.method647(false, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg2.method3087(var21, 6);
        int var23 = 75 % ((-arg1 - 31) / 33);
        if (Stream.method1964()) {
            for (int var49 = arg0 - 1; var49 >= 0; var49--) {
                int var50 = this.field5056[var49] <= 64 ? this.field5056[var49] : 64;
                if (var50 > 0) {
                    for (int var51 = var50 - 1; var51 >= 0; var51--) {
                        class66 var64 = this.field5062[var49][var51];
                        int var65 = var64.field902;
                        byte var66 = (byte) (var65 >> 16);
                        byte var67 = (byte) (var65 >> 8);
                        byte var68 = (byte) var65;
                        byte var69 = (byte) (var65 >>> 24);
                        float var70 = (float) (var64.field899 >> 12);
                        float var71 = (float) (var64.field894 >> 12);
                        float var72 = (float) (var64.field895 >> 12);
                        int var73 = var64.field903 >> 12;
                        var22.method1958((float) (-var73) * var12 + var70);
                        var22.method1958((float) (-var73) * var13 + var71);
                        var22.method1958((float) (-var73) * var14 + var72);
                        if (arg2.field7738 == 0) {
                            var22.method1966(var66, var67, var68, var69);
                        } else {
                            var22.method1965(var66, var67, var68, var69);
                        }
                        var22.method1958(0.0F);
                        var22.method1958(0.0F);
                        var22.method1958((float) var73 * var15 + var70);
                        var22.method1958((float) var73 * var16 + var71);
                        var22.method1958((float) var73 * var17 + var72);
                        if (arg2.field7738 == 0) {
                            var22.method1966(var66, var67, var68, var69);
                        } else {
                            var22.method1965(var66, var67, var68, var69);
                        }
                        var22.method1958(1.0F);
                        var22.method1958(0.0F);
                        var22.method1958((float) var73 * var12 + var70);
                        var22.method1958((float) var73 * var13 + var71);
                        var22.method1958((float) var73 * var14 + var72);
                        if (arg2.field7738 == 0) {
                            var22.method1966(var66, var67, var68, var69);
                        } else {
                            var22.method1965(var66, var67, var68, var69);
                        }
                        var22.method1958(1.0F);
                        var22.method1958(1.0F);
                        var22.method1958((float) var73 * var18 + var70);
                        var22.method1958((float) var73 * var19 + var71);
                        var22.method1958((float) var73 * var20 + var72);
                        if (arg2.field7738 == 0) {
                            var22.method1966(var66, var67, var68, var69);
                        } else {
                            var22.method1965(var66, var67, var68, var69);
                        }
                        var22.method1958(0.0F);
                        var22.method1958(1.0F);
                        var4++;
                    }
                    if (this.field5056[var49] > 64) {
                        int var52 = this.field5056[var49] - 64 - 1;
                        for (int var53 = this.field5063[var52] - 1; var53 >= 0; var53--) {
                            class66 var54 = this.field5047[var52][var53];
                            int var55 = var54.field902;
                            byte var56 = (byte) (var55 >> 16);
                            byte var57 = (byte) (var55 >> 8);
                            byte var58 = (byte) var55;
                            byte var59 = (byte) (var55 >>> 24);
                            float var60 = (float) (var54.field899 >> 12);
                            float var61 = (float) (var54.field894 >> 12);
                            float var62 = (float) (var54.field895 >> 12);
                            int var63 = var54.field903 >> 12;
                            var22.method1958((float) (-var63) * var12 + var60);
                            var22.method1958((float) (-var63) * var13 + var61);
                            var22.method1958((float) (-var63) * var14 + var62);
                            if (arg2.field7738 == 0) {
                                var22.method1966(var56, var57, var58, var59);
                            } else {
                                var22.method1965(var56, var57, var58, var59);
                            }
                            var22.method1958(0.0F);
                            var22.method1958(0.0F);
                            var22.method1958((float) var63 * var15 + var60);
                            var22.method1958((float) var63 * var16 + var61);
                            var22.method1958((float) var63 * var17 + var62);
                            if (arg2.field7738 == 0) {
                                var22.method1966(var56, var57, var58, var59);
                            } else {
                                var22.method1965(var56, var57, var58, var59);
                            }
                            var22.method1958(1.0F);
                            var22.method1958(0.0F);
                            var22.method1958((float) var63 * var12 + var60);
                            var22.method1958((float) var63 * var13 + var61);
                            var22.method1958((float) var63 * var14 + var62);
                            if (arg2.field7738 == 0) {
                                var22.method1966(var56, var57, var58, var59);
                            } else {
                                var22.method1965(var56, var57, var58, var59);
                            }
                            var22.method1958(1.0F);
                            var22.method1958(1.0F);
                            var22.method1958((float) var63 * var18 + var60);
                            var22.method1958((float) var63 * var19 + var61);
                            var22.method1958((float) var63 * var20 + var62);
                            if (arg2.field7738 == 0) {
                                var22.method1966(var56, var57, var58, var59);
                            } else {
                                var22.method1965(var56, var57, var58, var59);
                            }
                            var22.method1958(0.0F);
                            var4++;
                            var22.method1958(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var24 = arg0 - 1; var24 >= 0; var24--) {
                int var25 = this.field5056[var24] > 64 ? 64 : this.field5056[var24];
                if (var25 > 0) {
                    for (int var26 = var25 - 1; var26 >= 0; var26--) {
                        class66 var39 = this.field5062[var24][var26];
                        int var40 = var39.field902;
                        byte var41 = (byte) (var40 >> 16);
                        byte var42 = (byte) (var40 >> 8);
                        byte var43 = (byte) var40;
                        byte var44 = (byte) (var40 >>> 24);
                        float var45 = (float) (var39.field899 >> 12);
                        float var46 = (float) (var39.field894 >> 12);
                        float var47 = (float) (var39.field895 >> 12);
                        int var48 = var39.field903 >> 12;
                        var22.method1956((float) (-var48) * var12 + var45);
                        var22.method1956((float) (-var48) * var13 + var46);
                        var22.method1956((float) (-var48) * var14 + var47);
                        if (arg2.field7738 == 0) {
                            var22.method1966(var41, var42, var43, var44);
                        } else {
                            var22.method1965(var41, var42, var43, var44);
                        }
                        var22.method1956(0.0F);
                        var22.method1956(0.0F);
                        var22.method1956((float) var48 * var15 + var45);
                        var22.method1956((float) var48 * var16 + var46);
                        var22.method1956((float) var48 * var17 + var47);
                        if (arg2.field7738 == 0) {
                            var22.method1966(var41, var42, var43, var44);
                        } else {
                            var22.method1965(var41, var42, var43, var44);
                        }
                        var22.method1956(1.0F);
                        var22.method1956(0.0F);
                        var22.method1956((float) var48 * var12 + var45);
                        var22.method1956((float) var48 * var13 + var46);
                        var22.method1956((float) var48 * var14 + var47);
                        if (arg2.field7738 == 0) {
                            var22.method1966(var41, var42, var43, var44);
                        } else {
                            var22.method1965(var41, var42, var43, var44);
                        }
                        var22.method1956(1.0F);
                        var22.method1956(1.0F);
                        var22.method1956((float) var48 * var18 + var45);
                        var22.method1956((float) var48 * var19 + var46);
                        var22.method1956((float) var48 * var20 + var47);
                        if (arg2.field7738 == 0) {
                            var22.method1966(var41, var42, var43, var44);
                        } else {
                            var22.method1965(var41, var42, var43, var44);
                        }
                        var22.method1956(0.0F);
                        var22.method1956(1.0F);
                        var4++;
                    }
                    if (this.field5056[var24] > 64) {
                        int var27 = this.field5056[var24] - 1 - 64;
                        for (int var28 = this.field5063[var27] - 1; var28 >= 0; var28--) {
                            class66 var29 = this.field5047[var27][var28];
                            int var30 = var29.field902;
                            byte var31 = (byte) (var30 >> 16);
                            byte var32 = (byte) (var30 >> 8);
                            byte var33 = (byte) var30;
                            byte var34 = (byte) (var30 >>> 24);
                            float var35 = (float) (var29.field899 >> 12);
                            float var36 = (float) (var29.field894 >> 12);
                            float var37 = (float) (var29.field895 >> 12);
                            int var38 = var29.field903 >> 12;
                            var22.method1956((float) (-var38) * var12 + var35);
                            var22.method1956((float) (-var38) * var13 + var36);
                            var22.method1956((float) (-var38) * var14 + var37);
                            if (arg2.field7738 == 0) {
                                var22.method1966(var31, var32, var33, var34);
                            } else {
                                var22.method1965(var31, var32, var33, var34);
                            }
                            var22.method1956(0.0F);
                            var22.method1956(0.0F);
                            var22.method1956((float) var38 * var15 + var35);
                            var22.method1956((float) var38 * var16 + var36);
                            var22.method1956((float) var38 * var17 + var37);
                            if (arg2.field7738 == 0) {
                                var22.method1966(var31, var32, var33, var34);
                            } else {
                                var22.method1965(var31, var32, var33, var34);
                            }
                            var22.method1956(1.0F);
                            var22.method1956(0.0F);
                            var22.method1956((float) var38 * var12 + var35);
                            var22.method1956((float) var38 * var13 + var36);
                            var22.method1956((float) var38 * var14 + var37);
                            if (arg2.field7738 == 0) {
                                var22.method1966(var31, var32, var33, var34);
                            } else {
                                var22.method1965(var31, var32, var33, var34);
                            }
                            var22.method1956(1.0F);
                            var22.method1956(1.0F);
                            var22.method1956((float) var38 * var18 + var35);
                            var22.method1956((float) var38 * var19 + var36);
                            var22.method1956((float) var38 * var20 + var37);
                            if (arg2.field7738 == 0) {
                                var22.method1966(var31, var32, var33, var34);
                            } else {
                                var22.method1965(var31, var32, var33, var34);
                            }
                            var22.method1956(0.0F);
                            var22.method1956(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method1955();
        if (this.field5050.method646(-127)) {
            arg2.method155(0, this.field5050, -40);
            arg2.method155(1, this.field5053, -48);
            arg2.method187(-2, this.field5059);
            arg2.method164(0, class527.field6860, -49, 0, var4 * 2, var4 * 4, this.field5060);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lfc;I)V", line = 747)
    private final void method2276(class575 arg0, int arg1) {
        field5057++;
        if (arg1 > -34) {
            return;
        }
        arg0.method3083(true, false);
        arg0.method3120(true, 0);
        if (class21.field228 != arg0.field7678) {
            arg0.method360(class21.field228);
        }
    }
}
