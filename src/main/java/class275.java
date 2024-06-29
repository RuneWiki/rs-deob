import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class275 {

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    private int field3716 = 0;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "[I")
    private int[] field3717 = new int[8191];

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "[I")
    private int[] field3722 = new int[1600];

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "[I")
    private int[] field3732 = new int[64];

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "[[Lpl;")
    private class220[][] field3721 = new class220[64][768];

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "[[Lpl;")
    private class220[][] field3736 = new class220[1600][64];

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "Lqca;")
    private class547 field3718;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "Lvp;")
    private class467 field3728;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "Lvp;")
    private class467 field3730;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "Lgo;")
    private class526 field3720;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field3726 = 0;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "J")
    public static long field3725 = 0L;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "Lej;")
    public static class229 field3719 = new class229("", 17);

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "Lej;")
    public static class229 field3733 = new class229("", 15);

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "Ltk;")
    public static class73 field3735 = new class73();

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "()V")
    public static final void method1673() {
        if (class285.field3867 != null) {
            for (int var0 = 0; var0 < class285.field3867.length; var0++) {
                for (int var1 = 0; var1 < class149.field1872; var1++) {
                    for (int var2 = 0; var2 < class334.field4887; var2++) {
                        if (class285.field3867[var0][var1][var2] != null) {
                            class285.field3867[var0][var1][var2].method3613((byte) -32);
                        }
                        class285.field3867[var0][var1][var2] = null;
                    }
                }
            }
        }
        class285.field3867 = null;
        class249.field3345 = null;
        if (class644.field9128 != null) {
            for (int var3 = 0; var3 < class644.field9128.length; var3++) {
                for (int var4 = 0; var4 < class149.field1872; var4++) {
                    for (int var5 = 0; var5 < class334.field4887; var5++) {
                        if (class644.field9128[var3][var4][var5] != null) {
                            class644.field9128[var3][var4][var5].method3613((byte) -121);
                        }
                        class644.field9128[var3][var4][var5] = null;
                    }
                }
            }
        }
        class644.field9128 = null;
        class185.field2270 = null;
        class145.field1841 = null;
        class397.field5666 = null;
        class573.field7940 = 0;
        if (class357.field5182 != null) {
            for (int var6 = 0; var6 < class573.field7940; var6++) {
                class357.field5182[var6] = null;
            }
        }
        if (class438.field6043 != null) {
            for (int var7 = 0; var7 < class85.field1046; var7++) {
                class438.field6043[var7] = null;
            }
            class85.field1046 = 0;
        }
        if (class660.field9370 != null) {
            for (int var8 = 0; var8 < class334.field4895; var8++) {
                class660.field9370[var8] = null;
            }
            for (int var9 = 0; var9 < class87.field1079; var9++) {
                for (int var10 = 0; var10 < class149.field1872; var10++) {
                    for (int var11 = 0; var11 < class334.field4887; var11++) {
                        class369.field5304[var9][var10][var11] = 0L;
                    }
                }
            }
            class334.field4895 = 0;
        }
        class236.field3074 = null;
        class546.method3072((byte) 124);
        class34.field332.method2225(29483);
        class298.field3992 = null;
        class659.field9291 = null;
        class629.field8555 = null;
        class297.field3973 = null;
        class579.field8002 = null;
        class277.field3750 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLsv;)V")
    private final void method1674(byte arg0, class312 arg1) {
        arg1.method1949(-32, true);
        if (arg0 <= 31) {
            return;
        }
        field3731++;
        arg1.method2002(-1, true);
        if (class37.field374 != arg1.field4475) {
            arg1.method1986(class37.field374);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lsv;Z)V")
    public final void method1675(class312 arg0, boolean arg1) {
        field3724++;
        this.field3728.method1019(24, 786336, -26802);
        if (arg1) {
            this.field3730 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lsv;I)V")
    private final void method1676(class312 arg0, int arg1) {
        field3737++;
        class37.field374 = arg0.field4475;
        arg0.method1958(20786);
        arg0.method2002(arg1 + 11265, false);
        arg0.method1949(-32, false);
        if (arg1 != -11266) {
            this.field3722 = null;
        }
        arg0.method1916(2);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILsv;Lob;)V")
    public final void method1677(int arg0, class312 arg1, class309 arg2) {
        field3727++;
        if (arg1.field4377 == null) {
            return;
        }
        this.method1676(arg1, -11266);
        if (arg0 != 0) {
            this.field3718 = null;
        }
        float var4 = arg1.field4377.field6651;
        float var5 = arg1.field4377.field6628;
        float var6 = arg1.field4377.field6652;
        float var7 = arg1.field4377.field6647;
        try {
            if (arg2.field4148) {
                int var26 = arg2.field4149 - arg2.field4147;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = class335.method2138(var26, 36161) + 1 - class284.field3834;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                class204 var28 = arg2.field4141.field850;
                class204 var29 = var28.field2668;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field3716 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field3722[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field3732[var34] = 0;
                    }
                    while (var28 != var29) {
                        class220 var35 = (class220) var29;
                        if (var32) {
                            var31 = var35.field2865;
                            var30 = var35.field2864;
                            var32 = false;
                        } else if (var35.field2864 != var30 || var35.field2865 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field2858 >> 12) * var6 + (float) (var35.field2863 >> 12) * var5 + (float) (var35.field2856 >> 12) * var4 + var7) - arg2.field4147 >> var27;
                        if (var36 < 1600) {
                            if (this.field3722[var36] >= 64) {
                                label148: {
                                    if (this.field3722[var36] == 64) {
                                        if (this.field3716 == 64) {
                                            break label148;
                                        }
                                        this.field3722[var36] += this.field3716++ + 1;
                                    }
                                    class220[] var10000 = this.field3721[this.field3722[var36] - 64 - 1];
                                    int var10002 = this.field3722[var36] - 65;
                                    int var10004 = this.field3732[this.field3722[var36] - 65];
                                    this.field3732[var10002] = this.field3732[this.field3722[var36] - 65] + 1;
                                    var10000[var10004] = var35;
                                }
                            } else {
                                this.field3736[var36][this.field3722[var36]++] = var35;
                            }
                        }
                        var29 = var29.field2668;
                    }
                    arg1.method2018((byte) -62, var30 > 0 ? var30 : -1, false, false);
                    if (var31 && class37.field374 != arg1.field4475) {
                        arg1.method1986(class37.field374);
                    } else if (arg1.field4475 != 1.0F) {
                        arg1.method1986(1.0F);
                    }
                    this.method1678(-1, arg1, var26);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class204 var11 = arg2.field4141.field850;
                for (class204 var12 = var11.field2668; var12 != var11; var12 = var12.field2668) {
                    class220 var13 = (class220) var12;
                    int var14 = (int) ((float) (var13.field2858 >> 12) * var6 + (float) (var13.field2863 >> 12) * var5 + (float) (var13.field2856 >> 12) * var4 + var7);
                    if (var10 < var14) {
                        var10 = var14;
                    }
                    if (var14 < var9) {
                        var9 = var14;
                    }
                    this.field3717[var8++] = var14;
                }
                int var15 = var10 - var9;
                int var16;
                if ((var15 + 2) <= 1600) {
                    var16 = 0;
                    var15 += 2;
                } else {
                    var16 = class335.method2138(var15, 36161) + (1 - class284.field3834);
                    var15 = (var15 >> var16) + 2;
                }
                class204 var17 = var11.field2668;
                int var18 = 0;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var17) {
                    this.field3716 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field3722[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field3732[var23] = 0;
                    }
                    while (var11 != var17) {
                        class220 var24 = (class220) var17;
                        if (var21) {
                            var21 = false;
                            var19 = var24.field2864;
                            var20 = var24.field2865;
                        }
                        if (var18 > 0 && (var24.field2864 != var19 || var20 != var24.field2865)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field3717[var18++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field3722[var25] >= 64) {
                                label193: {
                                    if (this.field3722[var25] == 64) {
                                        if (this.field3716 == 64) {
                                            break label193;
                                        }
                                        this.field3722[var25] += this.field3716++ + 1;
                                    }
                                    this.field3721[this.field3722[var25] - 64 - 1][this.field3732[this.field3722[var25] - 64 - 1]++] = var24;
                                }
                            } else {
                                this.field3736[var25][this.field3722[var25]++] = var24;
                            }
                        }
                        var17 = var17.field2668;
                    }
                    arg1.method2018((byte) 110, var19 >= 0 ? var19 : -1, false, false);
                    if (var20 && class37.field374 != arg1.field4475) {
                        arg1.method1986(class37.field374);
                    } else if (arg1.field4475 != 1.0F) {
                        arg1.method1986(1.0F);
                    }
                    this.method1678(-1, arg1, var15);
                }
            }
        } catch (Exception var37) {
        }
        this.method1674((byte) 118, arg1);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILsv;I)V")
    private final void method1678(int arg0, class312 arg1, int arg2) {
        field3723++;
        int var4 = 0;
        class492 var5 = arg1.method1906(3);
        float var6 = var5.field6657;
        float var7 = var5.field6674;
        float var8 = var5.field6636;
        float var9 = var5.field6676;
        float var10 = var5.field6660;
        float var11 = var5.field6640;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field3728.method1025(true, (byte) 67);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method1920((byte) 84, var21);
        if (Stream.method1519()) {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field3722[var48] <= 64 ? this.field3722[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class220 var63 = this.field3736[var48][var50];
                        int var64 = var63.field2859;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field2856 >> 12);
                        float var70 = (float) (var63.field2863 >> 12);
                        float var71 = (float) (var63.field2858 >> 12);
                        int var72 = var63.field2860 >> 12;
                        var22.method1530((float) (-var72) * var12 + var69);
                        var22.method1530((float) (-var72) * var13 + var70);
                        var22.method1530((float) (-var72) * var14 + var71);
                        if (arg1.field4462 == 0) {
                            var22.method1518(var65, var66, var67, var68);
                        } else {
                            var22.method1528(var65, var66, var67, var68);
                        }
                        var22.method1530(0.0F);
                        var22.method1530(0.0F);
                        var22.method1530((float) var72 * var15 + var69);
                        var22.method1530((float) var72 * var16 + var70);
                        var22.method1530((float) var72 * var17 + var71);
                        if (arg1.field4462 == 0) {
                            var22.method1518(var65, var66, var67, var68);
                        } else {
                            var22.method1528(var65, var66, var67, var68);
                        }
                        var22.method1530(1.0F);
                        var22.method1530(0.0F);
                        var22.method1530((float) var72 * var12 + var69);
                        var22.method1530((float) var72 * var13 + var70);
                        var22.method1530((float) var72 * var14 + var71);
                        if (arg1.field4462 == 0) {
                            var22.method1518(var65, var66, var67, var68);
                        } else {
                            var22.method1528(var65, var66, var67, var68);
                        }
                        var22.method1530(1.0F);
                        var22.method1530(1.0F);
                        var22.method1530((float) var72 * var18 + var69);
                        var22.method1530((float) var72 * var19 + var70);
                        var22.method1530((float) var72 * var20 + var71);
                        if (arg1.field4462 == 0) {
                            var22.method1518(var65, var66, var67, var68);
                        } else {
                            var22.method1528(var65, var66, var67, var68);
                        }
                        var22.method1530(0.0F);
                        var22.method1530(1.0F);
                        var4++;
                    }
                    if (this.field3722[var48] > 64) {
                        int var51 = this.field3722[var48] - 64 - 1;
                        for (int var52 = this.field3732[var51] - 1; var52 >= 0; var52--) {
                            class220 var53 = this.field3721[var51][var52];
                            int var54 = var53.field2859;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field2856 >> 12);
                            float var60 = (float) (var53.field2863 >> 12);
                            float var61 = (float) (var53.field2858 >> 12);
                            int var62 = var53.field2860 >> 12;
                            var22.method1530((float) (-var62) * var12 + var59);
                            var22.method1530((float) (-var62) * var13 + var60);
                            var22.method1530((float) (-var62) * var14 + var61);
                            if (arg1.field4462 == 0) {
                                var22.method1518(var55, var56, var57, var58);
                            } else {
                                var22.method1528(var55, var56, var57, var58);
                            }
                            var22.method1530(0.0F);
                            var22.method1530(0.0F);
                            var22.method1530((float) var62 * var15 + var59);
                            var22.method1530((float) var62 * var16 + var60);
                            var22.method1530((float) var62 * var17 + var61);
                            if (arg1.field4462 == 0) {
                                var22.method1518(var55, var56, var57, var58);
                            } else {
                                var22.method1528(var55, var56, var57, var58);
                            }
                            var22.method1530(1.0F);
                            var22.method1530(0.0F);
                            var22.method1530((float) var62 * var12 + var59);
                            var22.method1530((float) var62 * var13 + var60);
                            var22.method1530((float) var62 * var14 + var61);
                            if (arg1.field4462 == 0) {
                                var22.method1518(var55, var56, var57, var58);
                            } else {
                                var22.method1528(var55, var56, var57, var58);
                            }
                            var22.method1530(1.0F);
                            var22.method1530(1.0F);
                            var22.method1530((float) var62 * var18 + var59);
                            var22.method1530((float) var62 * var19 + var60);
                            var22.method1530((float) var62 * var20 + var61);
                            if (arg1.field4462 == 0) {
                                var22.method1518(var55, var56, var57, var58);
                            } else {
                                var22.method1528(var55, var56, var57, var58);
                            }
                            var22.method1530(0.0F);
                            var22.method1530(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field3722[var23] > 64 ? 64 : this.field3722[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class220 var38 = this.field3736[var23][var25];
                        int var39 = var38.field2859;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field2856 >> 12);
                        float var45 = (float) (var38.field2863 >> 12);
                        float var46 = (float) (var38.field2858 >> 12);
                        int var47 = var38.field2860 >> 12;
                        var22.method1520((float) (-var47) * var12 + var44);
                        var22.method1520((float) (-var47) * var13 + var45);
                        var22.method1520((float) (-var47) * var14 + var46);
                        if (arg1.field4462 == 0) {
                            var22.method1518(var40, var41, var42, var43);
                        } else {
                            var22.method1528(var40, var41, var42, var43);
                        }
                        var22.method1520(0.0F);
                        var22.method1520(0.0F);
                        var22.method1520((float) var47 * var15 + var44);
                        var22.method1520((float) var47 * var16 + var45);
                        var22.method1520((float) var47 * var17 + var46);
                        if (arg1.field4462 == 0) {
                            var22.method1518(var40, var41, var42, var43);
                        } else {
                            var22.method1528(var40, var41, var42, var43);
                        }
                        var22.method1520(1.0F);
                        var22.method1520(0.0F);
                        var22.method1520((float) var47 * var12 + var44);
                        var22.method1520((float) var47 * var13 + var45);
                        var22.method1520((float) var47 * var14 + var46);
                        if (arg1.field4462 == 0) {
                            var22.method1518(var40, var41, var42, var43);
                        } else {
                            var22.method1528(var40, var41, var42, var43);
                        }
                        var22.method1520(1.0F);
                        var22.method1520(1.0F);
                        var22.method1520((float) var47 * var18 + var44);
                        var22.method1520((float) var47 * var19 + var45);
                        var22.method1520((float) var47 * var20 + var46);
                        if (arg1.field4462 == 0) {
                            var22.method1518(var40, var41, var42, var43);
                        } else {
                            var22.method1528(var40, var41, var42, var43);
                        }
                        var22.method1520(0.0F);
                        var22.method1520(1.0F);
                        var4++;
                    }
                    if (this.field3722[var23] > 64) {
                        int var26 = this.field3722[var23] - 64 - 1;
                        for (int var27 = this.field3732[var26] - 1; var27 >= 0; var27--) {
                            class220 var28 = this.field3721[var26][var27];
                            int var29 = var28.field2859;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field2856 >> 12);
                            float var35 = (float) (var28.field2863 >> 12);
                            float var36 = (float) (var28.field2858 >> 12);
                            int var37 = var28.field2860 >> 12;
                            var22.method1520((float) (-var37) * var12 + var34);
                            var22.method1520((float) (-var37) * var13 + var35);
                            var22.method1520((float) (-var37) * var14 + var36);
                            if (arg1.field4462 == 0) {
                                var22.method1518(var30, var31, var32, var33);
                            } else {
                                var22.method1528(var30, var31, var32, var33);
                            }
                            var22.method1520(0.0F);
                            var22.method1520(0.0F);
                            var22.method1520((float) var37 * var15 + var34);
                            var22.method1520((float) var37 * var16 + var35);
                            var22.method1520((float) var37 * var17 + var36);
                            if (arg1.field4462 == 0) {
                                var22.method1518(var30, var31, var32, var33);
                            } else {
                                var22.method1528(var30, var31, var32, var33);
                            }
                            var22.method1520(1.0F);
                            var22.method1520(0.0F);
                            var22.method1520((float) var37 * var12 + var34);
                            var22.method1520((float) var37 * var13 + var35);
                            var22.method1520((float) var37 * var14 + var36);
                            if (arg1.field4462 == 0) {
                                var22.method1518(var30, var31, var32, var33);
                            } else {
                                var22.method1528(var30, var31, var32, var33);
                            }
                            var22.method1520(1.0F);
                            var22.method1520(1.0F);
                            var22.method1520((float) var37 * var18 + var34);
                            var22.method1520((float) var37 * var19 + var35);
                            var22.method1520((float) var37 * var20 + var36);
                            if (arg1.field4462 == 0) {
                                var22.method1518(var30, var31, var32, var33);
                            } else {
                                var22.method1528(var30, var31, var32, var33);
                            }
                            var22.method1520(0.0F);
                            var22.method1520(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method1523();
        if (arg0 == -1 && this.field3728.method1021(true)) {
            arg1.method809(1, 0, this.field3728);
            arg1.method809(1, 1, this.field3730);
            arg1.method849((byte) 43, this.field3718);
            arg1.method818(0, var4 * 4, this.field3720, var4 * 2, arg0, class319.field4687, 0);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public final void method1679(int arg0) {
        if (arg0 == -1) {
            this.field3728.method1022((byte) 33);
            field3715++;
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    public static void method1680(int arg0) {
        field3733 = null;
        field3735 = null;
        field3719 = null;
        if (arg0 < 15) {
            method1681(44, null, 73, (byte) -33);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[BIB)I")
    public static final int method1681(int arg0, byte[] arg1, int arg2, byte arg3) {
        int var4 = 40 % ((64 - arg3) / 36);
        field3729++;
        int var5 = -1;
        for (int var6 = arg0; var6 < arg2; var6++) {
            var5 = var5 >>> 8 ^ class461.field6278[(var5 ^ arg1[var6]) & 0xFF];
        }
        return ~var5;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lsv;)V")
    public class275(class312 arg0) {
        this.field3718 = arg0.method813(new class401[] { new class401(new class102[] { class102.field1241, class102.field1243, class102.field1245 }), new class401(class102.field1242) }, 118);
        this.field3728 = arg0.method819(true, (byte) -125);
        this.field3730 = arg0.method819(false, (byte) 53);
        this.field3730.method1019(12, 393168, -26802);
        this.field3720 = arg0.method850(true, false);
        this.field3720.method1446(49146, 30419);
        Buffer var2 = this.field3720.method1025(true, (byte) 67);
        if (var2 != null) {
            Stream var3 = arg0.method1920((byte) 101, var2);
            if (Stream.method1519()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method1531(var5);
                    var3.method1531(var5 + 1);
                    var3.method1531(var5 + 2);
                    var3.method1531(var5 + 2);
                    var3.method1531(var5 + 3);
                    var3.method1531(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method1525(var7);
                    var3.method1525(var7 + 1);
                    var3.method1525(var7 + 2);
                    var3.method1525(var7 + 2);
                    var3.method1525(var7 + 3);
                    var3.method1525(var7);
                }
            }
            var3.method1523();
            this.field3720.method1021(true);
        }
        Buffer var8 = this.field3730.method1025(true, (byte) 67);
        if (var8 != null) {
            Stream var9 = arg0.method1920((byte) 103, var8);
            if (Stream.method1519()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method1530(0.0F);
                    var9.method1530(-1.0F);
                    var9.method1530(0.0F);
                    var9.method1530(0.0F);
                    var9.method1530(-1.0F);
                    var9.method1530(0.0F);
                    var9.method1530(0.0F);
                    var9.method1530(-1.0F);
                    var9.method1530(0.0F);
                    var9.method1530(0.0F);
                    var9.method1530(-1.0F);
                    var9.method1530(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method1520(0.0F);
                    var9.method1520(-1.0F);
                    var9.method1520(0.0F);
                    var9.method1520(0.0F);
                    var9.method1520(-1.0F);
                    var9.method1520(0.0F);
                    var9.method1520(0.0F);
                    var9.method1520(-1.0F);
                    var9.method1520(0.0F);
                    var9.method1520(0.0F);
                    var9.method1520(-1.0F);
                    var9.method1520(0.0F);
                }
            }
            var9.method1523();
            this.field3730.method1021(true);
        }
    }
}
