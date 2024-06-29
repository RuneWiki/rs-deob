import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class254 extends class317 {

    @OriginalMember(owner = "client!be", name = "K", descriptor = "[I")
    public static int[] field3632 = new int[2];

    @OriginalMember(owner = "client!be", name = "U", descriptor = "[J")
    public static long[] field3642 = new long[32];

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    private int field3635;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    private int field3636;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "I")
    private int field3645;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIBIIIIIII)V", line = 4)
    public static final void method1734(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != -116) {
            method1736((byte) -75);
        }
        if (class206.field2952 <= arg6 && class259.field3813 >= arg6 && class206.field2952 <= arg4 && class259.field3813 >= arg4 && class206.field2952 <= arg7 && arg7 <= class259.field3813 && class206.field2952 <= arg3 && class259.field3813 >= arg3 && class101.field1397 <= arg8 && class44.field536 >= arg8 && class101.field1397 <= arg1 && class44.field536 >= arg1 && class101.field1397 <= arg9 && class44.field536 >= arg9 && class101.field1397 <= arg0 && arg0 <= class44.field536) {
            class296.method2015(arg1, arg0, arg6, arg7, (byte) -115, arg8, arg3, arg5, arg9, arg4);
        } else {
            class269.method1855(arg4, arg7, arg9, arg6, arg8, arg0, arg3, arg5, (byte) -105, arg1);
        }
        field3640++;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(II)V", line = 25)
    private final void method1735(int arg0, int arg1) {
        this.field3645 = arg1 >> 4 & 0xFF0;
        if (arg0 >= -31) {
            method1740((byte) 71, false, (byte) -2, 21, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), -70, -75, true, -88, (float[][]) ((float[][]) null), -98, 104, (int[][]) ((int[][]) null), (class268) null, -83);
        }
        this.field3635 = (arg1 & 0xFF) << 4;
        field3641++;
        this.field3636 = arg1 >> 12 & 0xFF0;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V", line = 39)
    public static void method1736(byte arg0) {
        if (arg0 != 122) {
            method1736((byte) -107);
        }
        field3632 = null;
        field3642 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[[I", line = 57)
    public final int[][] method53(int arg0, int arg1) {
        field3639++;
        int var3 = 66 % ((arg0 + 31) / 37);
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352) {
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class326.field4933; var8++) {
                var5[var8] = this.field3636;
                var7[var8] = this.field3645;
                var6[var8] = this.field3635;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 94)
    public class254() {
        this(0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIII)V", line = 103)
    public static final void method1737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class206.field2952 <= arg0 - arg1 && class259.field3813 >= (arg0 + arg1) && class101.field1397 <= arg6 - arg1 && (arg1 + arg6) <= class44.field536) {
            class96.method703(arg1, arg3, arg4, arg6, arg2, arg0, (byte) 76);
        } else {
            class271.method1877(arg0, arg2, -2, arg1, arg4, arg3, arg6);
        }
        field3633++;
        if (arg5 > -86) {
            method1740((byte) 102, true, (byte) 122, 101, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), 73, -60, false, 35, (float[][]) ((float[][]) null), 25, -69, (int[][]) ((int[][]) null), (class268) null, -71);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lcg;I)V", line = 126)
    public static final void method1738(class316 arg0, int arg1) {
        byte[][] var2 = new byte[class20.field258][class56.field765];
        int var3 = class186.field2574 >> 1;
        field3634++;
        int var4 = class206.field2963 >> 2 << 10;
        while (arg0.field4777 < arg0.field4798.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg0.method2219(16448) == 1) {
                var6 = arg0.method2219(16448);
                var7 = arg0.method2219(arg1 ^ 0x4041);
                var5 = true;
            }
            int var8 = arg0.method2219(arg1 + 16447);
            int var9 = arg0.method2219(16448);
            int var10 = class42.field481 + class56.field765 - var9 * 64 - 1;
            int var11 = var8 * 64 - class174.field2374;
            if (var11 >= 0 && var10 - 63 >= 0 && class20.field258 > var11 + 63 && var10 < class56.field765) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var2[var11 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var6 * 8 <= var12 && var12 < var6 * 8 + 8 && var14 >= var7 * 8 && var7 * 8 + 8 > var14) {
                            var13[var10 - var14] = arg0.method2192(3);
                        }
                    }
                }
            } else if (var5) {
                arg0.field4777 += 64;
            } else {
                arg0.field4777 += 4096;
            }
        }
        int var15 = class20.field258;
        int var16 = class56.field765;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        if (arg1 != 1) {
            method1734(-37, -107, (byte) 8, -97, 28, -76, 44, -80, 41, -100);
        }
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var15 > var24) {
                    int var25 = var2[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class119 var26 = class309.method2121(var25 - 1, arg1 ^ 0x4A);
                        var17[var23] += var26.field1616;
                        var18[var23] += var26.field1608;
                        var21[var23] += var26.field1605;
                        var20[var23] += var26.field1606;
                        var10002 = var19[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var2[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class119 var29 = class309.method2121(var28 - 1, 76);
                        var17[var23] -= var29.field1616;
                        var18[var23] -= var29.field1608;
                        var21[var23] -= var29.field1605;
                        var20[var23] -= var29.field1606;
                        var10002 = var19[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class172.field2347[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    int var38 = var36 - 5;
                    if (var16 > var37) {
                        var35 += var21[var37];
                        var34 += var20[var37];
                        var33 += var19[var37];
                        var32 += var18[var37];
                        var31 += var17[var37];
                    }
                    if (var38 >= 0) {
                        var34 -= var20[var38];
                        var35 -= var21[var38];
                        var33 -= var19[var38];
                        var32 -= var18[var38];
                        var31 -= var17[var38];
                    }
                    if (var36 >= 0 && var33 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class269.method1851(var32 / var33, false, var31 * 256 / var34, var35 / var33);
                        if (var2[var22][var36] != 0) {
                            int var41 = (var40 & 0x7F) + var3;
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var4 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class47.method303(var22, 63) + class47.method303(var36 << 6, 4032)] = class184.field2527[class110.method803(var42, client.method823(arg1, -220884315), 96)];
                        } else if (var39 != null) {
                            var39[class47.method303(var22, 63) + (class47.method303(var36, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V", line = 352)
    private class254(int arg0) {
        super(0, false);
        this.method1735(-110, arg0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lcg;II)V", line = 363)
    public final void method60(class316 arg0, int arg1, int arg2) {
        int var4 = -110 / ((-arg1 - 17) / 40);
        if (arg2 == 0) {
            this.method1735(-97, arg0.method2210((byte) -5));
        }
        field3644++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ[[[I[Lla;)V", line = 391)
    public static final void method1739(int arg0, boolean arg1, int[][][] arg2, class72[] arg3) {
        field3643++;
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class240.field3406[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class240.field3406[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg3[var7].method530(var6, var5, false);
                            }
                        }
                    }
                }
            }
            class201.field2863 += (int) (Math.random() * 5.0D) - 2;
            class327.field4947 += (int) (Math.random() * 5.0D) - 2;
            if (class327.field4947 < -8) {
                class327.field4947 = -8;
            }
            if (class201.field2863 < -16) {
                class201.field2863 = -16;
            }
            if (class327.field4947 > 8) {
                class327.field4947 = 8;
            }
            if (class201.field2863 > 16) {
                class201.field2863 = 16;
            }
        }
        byte var8;
        if (arg1) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = class327.field4947 >> 2 << 10;
        if (arg0 != -24746) {
            return;
        }
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        int var12 = class201.field2863 >> 1;
        for (int var13 = 0; var13 < var8; var13++) {
            byte[][] var14 = class242.field3458[var13];
            if (!class67.field908) {
                int var15 = (int) Math.sqrt(5100.0D);
                int var16 = var15 * 768 >> 8;
                for (int var17 = 1; var17 < 103; var17++) {
                    for (int var18 = 1; var18 < 103; var18++) {
                        byte var19 = 74;
                        int var20 = class333.field5020[var13][var18 + 1][var17] - class333.field5020[var13][var18 - 1][var17];
                        int var21 = class333.field5020[var13][var18][var17 + 1] - class333.field5020[var13][var18][var17 - 1];
                        int var22 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21 + 65536));
                        int var23 = -65536 / var22;
                        int var24 = (var14[var18 + 1][var17] >> 3) + ((var14[var18 - 1][var17] >> 2) - (-(var14[var18][var17 - 1] >> 2) - (var14[var18][var17 + 1] >> 3) - (var14[var18][var17] >> 1)));
                        int var25 = (var21 << 8) / var22;
                        int var26 = (var20 << 8) / var22;
                        int var27 = (var26 * -50 + (var23 * -10) + (var25 * -50)) / var16 + var19;
                        var11[var18][var17] = var27 - var24;
                    }
                }
            } else if (class314.field4736) {
                for (int var44 = 1; var44 < 103; var44++) {
                    for (int var45 = 1; var45 < 103; var45++) {
                        byte var46 = 74;
                        int var47 = (var14[var45][var44 + 1] >> 3) + (var14[var45][var44] >> 1) + ((var14[var45 + -1][var44] >> 2) + (var14[var45 + 1][var44] >> 3) - -(var14[var45][var44 + -1] >> 2));
                        var11[var45][var44] = var46 - var47;
                    }
                }
            } else {
                int var28 = (int) class139.field1912[0];
                int var29 = (int) class139.field1912[1];
                int var30 = (int) class139.field1912[2];
                int var31 = (int) Math.sqrt((double) (var28 * var28 + (var29 * var29) + (var30 * var30)));
                int var32 = var31 * 1024 >> 8;
                for (int var33 = 1; var33 < 103; var33++) {
                    for (int var34 = 1; var34 < 103; var34++) {
                        int var35 = class333.field5020[var13][var34][var33 + 1] - class333.field5020[var13][var34][var33 - 1];
                        byte var36 = 96;
                        int var37 = class333.field5020[var13][var34 + 1][var33] - class333.field5020[var13][var34 - 1][var33];
                        int var38 = (int) Math.sqrt((double) (var35 * var35 + var37 * var37 + 65536));
                        int var39 = (var37 << 8) / var38;
                        int var40 = -65536 / var38;
                        int var41 = (var35 << 8) / var38;
                        int var42 = (var28 * var39 + var29 * var40 + var30 * var41) / var32 + var36;
                        int var43 = (var14[var34][var33 - 1] >> 2) + ((var14[var34][var33] >> 1) + (var14[var34][var33 + 1] >> 3) + (var14[var34 + -1][var33] >> 2) + (var14[var34 + 1][var33] >> 3));
                        var11[var34][var33] = var42 - (int) ((float) var43 * 1.7F);
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class230.field3259[var48] = 0;
                class256.field3680[var48] = 0;
                class134.field1857[var48] = 0;
                class44.field542[var48] = 0;
                class82.field1196[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class247.field3565[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class119 var53 = class309.method2121(var52 - 1, 68);
                            class230.field3259[var50] += var53.field1616;
                            class256.field3680[var50] += var53.field1608;
                            class134.field1857[var50] += var53.field1605;
                            class44.field542[var50] += var53.field1606;
                            var10002 = class82.field1196[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class247.field3565[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class119 var56 = class309.method2121(var55 - 1, 67);
                            class230.field3259[var50] -= var56.field1616;
                            class256.field3680[var50] -= var56.field1608;
                            class134.field1857[var50] -= var56.field1605;
                            class44.field542[var50] -= var56.field1606;
                            var10002 = class82.field1196[var50]--;
                        }
                    }
                }
                if (var49 >= 0) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 104; var62++) {
                        int var63 = var62 + 5;
                        int var64 = var62 - 5;
                        if (var63 < 104) {
                            var59 += class134.field1857[var63];
                            var60 += class44.field542[var63];
                            var57 += class230.field3259[var63];
                            var61 += class82.field1196[var63];
                            var58 += class256.field3680[var63];
                        }
                        if (var64 >= 0) {
                            var61 -= class82.field1196[var64];
                            var59 -= class134.field1857[var64];
                            var58 -= class256.field3680[var64];
                            var57 -= class230.field3259[var64];
                            var60 -= class44.field542[var64];
                        }
                        if (var62 >= 0 && var61 > 0) {
                            var10[var49][var62] = class269.method1851(var58 / var61, false, var57 * 256 / var60, var59 / var61);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label764: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg1 || class154.method1113(-100) || (class240.field3406[0][var65][var66] & 0x2) != 0 || (class240.field3406[var13][var65][var66] & 0x10) == 0 && class28.method160(102, var66, var65, var13) == class270.field4028) {
                        if (class320.field4868 > var13) {
                            class320.field4868 = var13;
                        }
                        int var67 = class247.field3565[var13][var65][var66] & 0xFF;
                        int var68 = class221.field3164[var13][var65][var66] & 0xFF;
                        if (var67 > 0 || var68 > 0) {
                            int var69 = class333.field5020[var13][var65][var66];
                            int var70 = class333.field5020[var13][var65 + 1][var66 + 1];
                            int var71 = class333.field5020[var13][var65 + 1][var66];
                            int var72 = class333.field5020[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var67 == 0 && class232.field3277[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var68 > 0 && !class189.method1328(var68 - 1, 4).field4086) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var71 && var69 == var70 && var69 == var72) {
                                    class334.field5051[var13][var65][var66] = class190.method1334(class334.field5051[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var75;
                            if (var67 <= 0) {
                                var74 = 0;
                                var75 = -1;
                            } else {
                                var75 = var10[var65][var66];
                                int var76 = (var75 & 0x7F) + var12;
                                if (var76 < 0) {
                                    var76 = 0;
                                } else if (var76 > 127) {
                                    var76 = 127;
                                }
                                int var77 = (var9 + var75 & 0xFC00) + (var75 & 0x380) + var76;
                                var74 = class184.field2527[class110.method803(var77, -220884316, 96)];
                            }
                            int var78 = var11[var65 + 1][var66 + 1];
                            int var79 = var11[var65 + 1][var66];
                            int var80 = var11[var65][var66 + 1];
                            int var81 = var11[var65][var66];
                            if (var68 == 0) {
                                class301.method2051(var13, var65, var66, 0, 0, -1, var69, var71, var70, var72, class110.method803(var75, -220884316, var81), class110.method803(var75, -220884316, var79), class110.method803(var75, -220884316, var78), class110.method803(var75, -220884316, var80), 0, 0, 0, 0, var74, 0);
                                if (class67.field908 && var13 > 0 && var75 != -1 && class309.method2121(var67 - 1, arg0 + 24872).field1621) {
                                    class322.method2251(0, 0, true, false, var65, var66, var69 - class333.field5020[0][var65][var66], -class333.field5020[0][var65 + 1][var66] + var71, var70 - class333.field5020[0][var65 + 1][var66 + 1], -class333.field5020[0][var65][var66 + 1] + var72);
                                }
                                if (class67.field908 && !arg1 && class336.field5066 != null && var13 == 0) {
                                    for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                        for (int var83 = var66 - 1; var83 <= var66 + 1; var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class221.field3164[var13][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class273 var85 = class189.method1328(var84 - 1, arg0 + 24750);
                                                    if (var85.field4097 != -1 && class208.method1465(-120, class184.field2543.method667(110, var85.field4097))) {
                                                        class336.field5066[var65][var66] = (var85.field4098 << 24) + var85.field4099;
                                                        continue label764;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var86 = class232.field3277[var13][var65][var66] + 1;
                                byte var87 = class108.field1463[var13][var65][var66];
                                class273 var88 = class189.method1328(var68 - 1, 4);
                                if (class67.field908 && !arg1 && class336.field5066 != null && var13 == 0) {
                                    if (var88.field4097 != -1 && class208.method1465(28, class184.field2543.method667(arg0 + 24852, var88.field4097))) {
                                        class336.field5066[var65][var66] = (var88.field4098 << 24) + var88.field4099;
                                    } else {
                                        label745: for (int var89 = var65 - 1; var89 <= (var65 + 1); var89++) {
                                            for (int var90 = var66 - 1; var90 <= (var66 + 1); var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class221.field3164[var13][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class273 var92 = class189.method1328(var91 - 1, arg0 ^ 0xFFFF9F52);
                                                        if (var92.field4097 != -1 && class208.method1465(91, class184.field2543.method667(-58, var92.field4097))) {
                                                            class336.field5066[var65][var66] = (var92.field4098 << 24) + var92.field4099;
                                                            break label745;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field4097;
                                if (var93 >= 0 && !class184.field2543.method678(-4402, var93)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var97;
                                if (var93 >= 0) {
                                    var94 = -1;
                                    var97 = class184.field2527[class107.method790(90, class184.field2543.method669(var93, arg0 + 24810), 96)];
                                } else if (var88.field4095 == -1) {
                                    var94 = -2;
                                    var97 = 0;
                                } else {
                                    var94 = var88.field4095;
                                    int var95 = (var94 & 0x7F) + var12;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var9 + var94 & 0xFC00) + (var94 & 0x380) + var95;
                                    var97 = class184.field2527[class107.method790(104, var96, 96)];
                                }
                                if (var88.field4089 >= 0) {
                                    int var98 = var88.field4089;
                                    int var99 = (var98 & 0x7F) + var12;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var9 + var98 & 0xFC00) + (var98 & 0x380) + var99;
                                    var97 = class184.field2527[class107.method790(62, var100, 96)];
                                }
                                class301.method2051(var13, var65, var66, var86, var87, var93, var69, var71, var70, var72, class110.method803(var75, -220884316, var81), class110.method803(var75, -220884316, var79), class110.method803(var75, -220884316, var78), class110.method803(var75, -220884316, var80), class107.method790(125, var94, var81), class107.method790(117, var94, var79), class107.method790(arg0 + 24860, var94, var78), class107.method790(88, var94, var80), var74, var97);
                                if (class67.field908 && var13 > 0) {
                                    class322.method2251(var86, var87, var94 == -2 || !var88.field4092, var75 == -1 || !class309.method2121(var67 - 1, 55).field1621, var65, var66, var69 - class333.field5020[0][var65][var66], -class333.field5020[0][var65 + 1][var66] + var71, var70 - class333.field5020[0][var65 + 1][var66 + 1], -class333.field5020[0][var65][var66 + 1] + var72);
                                }
                            }
                        }
                    }
                }
            }
            if (class67.field908) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                int[][] var103 = class333.field5020[var13];
                float[][] var104 = new float[105][105];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg1) {
                            class268[] var115 = class162.method1169(class336.field5066, arg2, class269.field3994[0], var101, var102, class221.field3164[var13], class333.field5020[var13], var10, -104, class240.field3406, var104, var11, class108.field1463[var13], class232.field3277[var13], var13, class247.field3565[var13]);
                            class340.method2350(var13, var115);
                            break;
                        }
                        class268[] var110 = class162.method1169((int[][]) null, arg2, (int[][]) null, var101, var102, class221.field3164[var13], class333.field5020[var13], var10, 126, class240.field3406, var104, var11, class108.field1463[var13], class232.field3277[var13], var13, class247.field3565[var13]);
                        class268[] var111 = class70.method512(class108.field1463[var13], class221.field3164[var13], var11, class240.field3406, -128, class247.field3565[var13], var13, var104, var102, class232.field3277[var13], var101, class333.field5020[var13]);
                        class268[] var112 = new class268[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var110.length + var114] = var111[var114];
                        }
                        class340.method2350(var13, var112);
                        class103.method760(class108.field1463[var13], class147.field2037, -1, var101, class247.field3565[var13], class147.field2036, class232.field3277[var13], class333.field5020[var13], var104, var102, class221.field3164[var13], var13);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var103[var106 + 1][var105] - var103[var106 - 1][var105];
                        int var108 = var103[var106][var105 + 1] - var103[var106][var105 - 1];
                        float var109 = (float) Math.sqrt((double) (var108 * var108 + var107 * var107 + 65536));
                        var102[var106][var105] = (float) var107 / var109;
                        var101[var106][var105] = -256.0F / var109;
                        var104[var106][var105] = (float) var108 / var109;
                    }
                    var105++;
                }
            }
            class247.field3565[var13] = (byte[][]) null;
            class221.field3164[var13] = (byte[][]) null;
            class232.field3277[var13] = (byte[][]) null;
            class108.field1463[var13] = (byte[][]) null;
            class242.field3458[var13] = (byte[][]) null;
        }
        class70.method514(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class240.field3406[1][var116][var117] & 0x2) == 2) {
                    class115.method847(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class334.field5051[var118][var120][var119] & 0x1) != 0) {
                        int var121;
                        for (var121 = var119; var121 > 0 && (class334.field5051[var118][var120][var121 - 1] & 0x1) != 0; var121--) {
                        }
                        int var122 = var118;
                        int var123 = var118;
                        int var124;
                        for (var124 = var119; var124 < 104 && (class334.field5051[var118][var120][var124 + 1] & 0x1) != 0; var124++) {
                        }
                        label446: while (var122 > 0) {
                            for (int var125 = var121; var125 <= var124; var125++) {
                                if ((class334.field5051[var122 - 1][var120][var125] & 0x1) == 0) {
                                    break label446;
                                }
                            }
                            var122--;
                        }
                        label435: while (var123 < 3) {
                            for (int var126 = var121; var126 <= var124; var126++) {
                                if ((class334.field5051[var123 + 1][var120][var126] & 0x1) == 0) {
                                    break label435;
                                }
                            }
                            var123++;
                        }
                        int var127 = (var124 + 1 - var121) * (var123 + 1 - var122);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class333.field5020[var123][var120][var121] - var128;
                            int var130 = class333.field5020[var122][var120][var121];
                            class92.method694(1, var120 * 128, var120 * 128, var121 * 128, var124 * 128 + 128, var129, var130);
                            for (int var131 = var122; var131 <= var123; var131++) {
                                for (int var132 = var121; var132 <= var124; var132++) {
                                    class334.field5051[var131][var120][var132] = class47.method303(class334.field5051[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class334.field5051[var118][var120][var119] & 0x2) != 0) {
                        int var133;
                        for (var133 = var120; var133 > 0 && (class334.field5051[var118][var133 - 1][var119] & 0x2) != 0; var133--) {
                        }
                        int var134 = var120;
                        int var135 = var118;
                        while (var134 < 104 && (class334.field5051[var118][var134 + 1][var119] & 0x2) != 0) {
                            var134++;
                        }
                        int var136 = var118;
                        label500: while (var135 > 0) {
                            for (int var137 = var133; var137 <= var134; var137++) {
                                if ((class334.field5051[var135 - 1][var137][var119] & 0x2) == 0) {
                                    break label500;
                                }
                            }
                            var135--;
                        }
                        label489: while (var136 < 3) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class334.field5051[var136 + 1][var138][var119] & 0x2) == 0) {
                                    break label489;
                                }
                            }
                            var136++;
                        }
                        int var139 = (var136 + 1 - var135) * (var134 + 1 - var133);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class333.field5020[var136][var133][var119] - var140;
                            int var142 = class333.field5020[var135][var133][var119];
                            class92.method694(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var141, var142);
                            for (int var143 = var135; var143 <= var136; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class334.field5051[var143][var144][var119] = class47.method303(class334.field5051[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class334.field5051[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147;
                        for (var147 = var119; var147 < 104 && (class334.field5051[var118][var120][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        int var148;
                        for (var148 = var119; var148 > 0 && (class334.field5051[var118][var120][var148 - 1] & 0x4) != 0; var148--) {
                        }
                        label555: while (var146 > 0) {
                            for (int var149 = var148; var149 <= var147; var149++) {
                                if ((class334.field5051[var118][var146 - 1][var149] & 0x4) == 0) {
                                    break label555;
                                }
                            }
                            var146--;
                        }
                        label544: while (var145 < 104) {
                            for (int var150 = var148; var150 <= var147; var150++) {
                                if ((class334.field5051[var118][var145 + 1][var150] & 0x4) == 0) {
                                    break label544;
                                }
                            }
                            var145++;
                        }
                        if (((var145 + 1 - var146) * (var147 + 1 - var148)) >= 4) {
                            int var151 = class333.field5020[var118][var146][var148];
                            class92.method694(4, var146 * 128, var145 * 128 + 128, var148 * 128, var147 * 128 + 128, var151, var151);
                            for (int var152 = var146; var152 <= var145; var152++) {
                                for (int var153 = var148; var153 <= var147; var153++) {
                                    class334.field5051[var118][var152][var153] = class47.method303(class334.field5051[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BZBI[[F[[FIIZI[[FII[[ILtk;I)V", line = 1360)
    public static final void method1740(byte arg0, boolean arg1, byte arg2, int arg3, float[][] arg4, float[][] arg5, int arg6, int arg7, boolean arg8, int arg9, float[][] arg10, int arg11, int arg12, int[][] arg13, class268 arg14, int arg15) {
        field3638++;
        int var16 = (arg12 << 8) + 255;
        int var17 = (arg3 << 8) + 255;
        int var18 = (arg7 << 8) + 255;
        if (!arg8) {
            method1734(-98, -26, (byte) 112, -28, -44, 99, 63, -92, -46, -115);
        }
        int var19 = (arg15 << 8) + 255;
        int[] var20 = class119.field1604[arg2];
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class52.method356(arg6, false, arg13, arg10, (byte) -65, (int[][]) null, arg0, arg9, var20[var23 + var23], arg14, var19, var20[var23 + var23 + 1], var16, arg4, var17, 0.0F, var18, arg5);
        }
        if (arg1) {
            if (arg2 == 1) {
                var21 = new int[6];
                int var25 = class52.method356(arg6, true, arg13, arg10, (byte) -49, (int[][]) null, arg0, arg9, 64, arg14, var19, 128, var16, arg4, var17, 0.0F, var18, arg5);
                int var26 = class52.method356(arg6, true, arg13, arg10, (byte) -61, (int[][]) null, arg0, arg9, 128, arg14, var19, 64, var16, arg4, var17, 0.0F, var18, arg5);
                var21[3] = var25;
                var21[1] = var25;
                var21[0] = var26;
                var21[2] = var22[2];
                var21[4] = var22[0];
                var21[5] = var22[2];
            } else if (arg2 == 2) {
                var21 = new int[6];
                int var42 = class52.method356(arg6, true, arg13, arg10, (byte) -127, (int[][]) null, arg0, arg9, 128, arg14, var19, 128, var16, arg4, var17, 0.0F, var18, arg5);
                int var43 = class52.method356(arg6, true, arg13, arg10, (byte) -123, (int[][]) null, arg0, arg9, 64, arg14, var19, 0, var16, arg4, var17, 0.0F, var18, arg5);
                var21[3] = var42;
                var21[0] = var22[0];
                var21[2] = var42;
                var21[1] = var43;
                var21[4] = var22[1];
                var21[5] = var22[0];
            } else if (arg2 == 3) {
                var21 = new int[6];
                int var27 = class52.method356(arg6, true, arg13, arg10, (byte) -118, (int[][]) null, arg0, arg9, 0, arg14, var19, 128, var16, arg4, var17, 0.0F, var18, arg5);
                int var28 = class52.method356(arg6, true, arg13, arg10, (byte) -126, (int[][]) null, arg0, arg9, 64, arg14, var19, 0, var16, arg4, var17, 0.0F, var18, arg5);
                var21[3] = var27;
                var21[4] = var28;
                var21[1] = var22[1];
                var21[0] = var22[2];
                var21[2] = var27;
                var21[5] = var22[2];
            } else if (arg2 == 4) {
                var21 = new int[3];
                int var41 = class52.method356(arg6, true, arg13, arg10, (byte) -52, (int[][]) null, arg0, arg9, 0, arg14, var19, 128, var16, arg4, var17, 0.0F, var18, arg5);
                var21[0] = var22[3];
                var21[2] = var22[0];
                var21[1] = var41;
            } else if (arg2 == 5) {
                int var29 = class52.method356(arg6, true, arg13, arg10, (byte) -71, (int[][]) null, arg0, arg9, 128, arg14, var19, 128, var16, arg4, var17, 0.0F, var18, arg5);
                var21 = new int[] { var22[2], var29, var22[3] };
            } else if (arg2 == 6) {
                var21 = new int[6];
                int var39 = class52.method356(arg6, true, arg13, arg10, (byte) -120, (int[][]) null, arg0, arg9, 128, arg14, var19, 0, var16, arg4, var17, 0.0F, var18, arg5);
                int var40 = class52.method356(arg6, true, arg13, arg10, (byte) -122, (int[][]) null, arg0, arg9, 128, arg14, var19, 128, var16, arg4, var17, 0.0F, var18, arg5);
                var21[1] = var39;
                var21[0] = var22[3];
                var21[2] = var40;
                var21[4] = var22[0];
                var21[3] = var40;
                var21[5] = var22[3];
            } else if (arg2 == 7) {
                var21 = new int[6];
                int var37 = class52.method356(arg6, true, arg13, arg10, (byte) -109, (int[][]) null, arg0, arg9, 0, arg14, var19, 128, var16, arg4, var17, 0.0F, var18, arg5);
                int var38 = class52.method356(arg6, true, arg13, arg10, (byte) -91, (int[][]) null, arg0, arg9, 128, arg14, var19, 0, var16, arg4, var17, 0.0F, var18, arg5);
                var21[2] = var37;
                var21[0] = var22[1];
                var21[1] = var38;
                var21[5] = var22[1];
                var21[4] = var22[2];
                var21[3] = var37;
            } else if (arg2 == 8) {
                var21 = new int[3];
                int var36 = class52.method356(arg6, true, arg13, arg10, (byte) -113, (int[][]) null, arg0, arg9, 0, arg14, var19, 0, var16, arg4, var17, 0.0F, var18, arg5);
                var21[0] = var22[3];
                var21[2] = var22[4];
                var21[1] = var36;
            } else if (arg2 == 9) {
                var21 = new int[15];
                int var33 = class52.method356(arg6, true, arg13, arg10, (byte) -54, (int[][]) null, arg0, arg9, 128, arg14, var19, 64, var16, arg4, var17, 0.0F, var18, arg5);
                int var34 = class52.method356(arg6, true, arg13, arg10, (byte) -53, (int[][]) null, arg0, arg9, 96, arg14, var19, 32, var16, arg4, var17, 0.0F, var18, arg5);
                int var35 = class52.method356(arg6, true, arg13, arg10, (byte) -74, (int[][]) null, arg0, arg9, 64, arg14, var19, 0, var16, arg4, var17, 0.0F, var18, arg5);
                var21[2] = var22[4];
                var21[4] = var22[4];
                var21[12] = var34;
                var21[3] = var34;
                var21[1] = var33;
                var21[13] = var22[1];
                var21[0] = var34;
                var21[14] = var35;
                var21[8] = var22[2];
                var21[11] = var22[1];
                var21[7] = var22[3];
                var21[9] = var34;
                var21[5] = var22[3];
                var21[6] = var34;
                var21[10] = var22[2];
            } else if (arg2 == 10) {
                int var30 = class52.method356(arg6, true, arg13, arg10, (byte) -109, (int[][]) null, arg0, arg9, 0, arg14, var19, 128, var16, arg4, var17, 0.0F, var18, arg5);
                var21 = new int[] { var22[2], var30, var22[3], var22[3], var30, var22[4], var22[4], var30, var22[0] };
            } else if (arg2 == 11) {
                int var31 = class52.method356(arg6, true, arg13, arg10, (byte) -110, (int[][]) null, arg0, arg9, 0, arg14, var19, 64, var16, arg4, var17, 0.0F, var18, arg5);
                var21 = new int[12];
                int var32 = class52.method356(arg6, true, arg13, arg10, (byte) -120, (int[][]) null, arg0, arg9, 128, arg14, var19, 64, var16, arg4, var17, 0.0F, var18, arg5);
                var21[8] = var31;
                var21[7] = var32;
                var21[1] = var31;
                var21[0] = var22[3];
                var21[2] = var22[0];
                var21[6] = var22[2];
                var21[5] = var31;
                var21[3] = var22[3];
                var21[10] = var22[1];
                var21[11] = var32;
                var21[9] = var22[2];
                var21[4] = var22[2];
            }
        }
        arg14.method1847(arg11, arg9, arg6, var22, var21, false);
    }
}
