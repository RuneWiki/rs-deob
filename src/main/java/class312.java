import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class312 extends class279 {

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "Ltl;")
    public static class59 field5287 = class85.method639("loginscreen", 9588);

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "Ltl;")
    public static class59 field5296 = class85.method639("::errortest", 9588);

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "S")
    public static short field5294 = 1;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    public static int field5291 = 0;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "[[I")
    public static int[][] field5299 = new int[5][5000];

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)[[I", line = 9)
    public final int[][] method87(int arg0, int arg1) {
        field5290++;
        int[][] var3 = this.field4786.method1427(arg0 + 7523, arg1);
        if (this.field4786.field3297) {
            int[][] var4 = this.method1956(0, arg1, (byte) -112);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class56.field835; var11++) {
                var7[var11] = 4096 - var6[var11];
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var10[var11];
            }
        }
        return arg0 == -7523 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 54)
    public class312() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)[I", line = 65)
    public final int[] method44(boolean arg0, int arg1) {
        field5297++;
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (arg0) {
            field5299 = (int[][]) ((int[][]) null);
        }
        if (this.field4781.field354) {
            int[] var4 = this.method1960(-127, arg1, 0);
            for (int var5 = 0; var5 < class56.field835; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILs;)V", line = 105)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg0 <= -125) {
            if (arg1 == 0) {
                this.field4789 = arg2.method1221(78) == 1;
            }
            field5286++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([Lma;II)V", line = 118)
    public static final void method2154(class263[] arg0, int arg1, int arg2) {
        field5288++;
        for (int var3 = arg2; var3 < arg0.length; var3++) {
            class263 var4 = arg0[var3];
            if (var4 != null && var4.field4410 == arg1 && (!var4.field4542 || !client.method281(var4))) {
                if (var4.field4468 == 0) {
                    if (!var4.field4542 && client.method281(var4) && class111.field1812 != var4) {
                        continue;
                    }
                    method2154(arg0, var4.field4392, 0);
                    if (var4.field4377 != null) {
                        method2154(var4.field4377, var4.field4392, 0);
                    }
                    class297 var5 = (class297) class190.field3181.method685((long) var4.field4392, 128);
                    if (var5 != null) {
                        class255.method1778(var5.field5089, 0);
                    }
                }
                if (var4.field4468 == 6) {
                    if (var4.field4457 != -1 || var4.field4510 != -1) {
                        boolean var6 = class145.method1055(arg2 ^ 0x4, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field4510;
                        } else {
                            var7 = var4.field4457;
                        }
                        if (var7 != -1) {
                            class129 var8 = class265.method1834((byte) -39, var7);
                            if (var8 != null) {
                                var4.field4394 += class64.field985;
                                while (var4.field4394 > var8.field2132[var4.field4431]) {
                                    var4.field4394 -= var8.field2132[var4.field4431];
                                    var4.field4431++;
                                    if (var4.field4431 >= var8.field2118.length) {
                                        var4.field4431 -= var8.field2114;
                                        if (var4.field4431 < 0 || var8.field2118.length <= var4.field4431) {
                                            var4.field4431 = 0;
                                        }
                                    }
                                    class140.method1019(var4, (byte) 82);
                                }
                            }
                        }
                    }
                    if (var4.field4413 != 0 && !var4.field4542) {
                        int var9 = var4.field4413 >> 16;
                        int var10 = var4.field4413 << 16 >> 16;
                        int var11 = class64.field985 * var9;
                        int var12 = class64.field985 * var10;
                        var4.field4426 = var4.field4426 + var12 & 0x7FF;
                        var4.field4393 = var4.field4393 + var11 & 0x7FF;
                        class140.method1019(var4, (byte) -82);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(III)I", line = 236)
    public static final int method2155(int arg0, int arg1, int arg2) {
        if (arg0 < 76) {
            method2156((class245) null, false);
        }
        field5293++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lcd;Z)V", line = 259)
    public static final void method2156(class245 arg0, boolean arg1) {
        class259.field4322.method532(84, arg0);
        while (true) {
            class245 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class245[][] var7;
            class245 var78;
            do {
                class245 var77;
                do {
                    class245 var76;
                    do {
                        class245 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class245) class259.field4322.method526((byte) -61);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field4087);
                                            var3 = var2.field4086;
                                            var4 = var2.field4090;
                                            var5 = var2.field4088;
                                            var6 = var2.field4101;
                                            var7 = class120.field2010[var5];
                                            float var8 = 0.0F;
                                            if (class55.field815) {
                                                if (class97.field1558 == class4.field57) {
                                                    int var9 = class172.field2833[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class300.field5127 != var10) {
                                                        class300.field5127 = var10;
                                                        class27.method175(126, var10);
                                                        class141.method1025(class313.method2158((byte) -117));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class270.field4678 != var11) {
                                                        class270.field4678 = var11;
                                                        class305.method2120(108, var11);
                                                    }
                                                    int var12 = class239.field3993[0][var3 + 1][var4] + class239.field3993[0][var3][var4] + class239.field3993[0][var3][var4 + 1] + class239.field3993[0][var3 + 1][var4 + 1] >> 2;
                                                    class131.method963(-12390, -var12, 3);
                                                    var8 = 201.5F;
                                                    class55.method391(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class55.method391(var8);
                                                }
                                            }
                                            if (!var2.field4095) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class245 var13 = class120.field2010[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field4087) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class33.field469 && var3 > class224.field3631) {
                                                    class245 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field4087 && (var14.field4095 || (var2.field4089 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class33.field469 && var3 < class245.field4096 - 1) {
                                                    class245 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field4087 && (var15.field4095 || (var2.field4089 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class88.field1390 && var4 > class259.field4332) {
                                                    class245 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field4087 && (var16.field4095 || (var2.field4089 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class88.field1390 && var4 < class309.field5248 - 1) {
                                                    class245 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field4087 && (var17.field4095 || (var2.field4089 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field4095 = false;
                                            if (var2.field4084 != null) {
                                                class245 var18 = var2.field4084;
                                                if (class55.field815) {
                                                    class55.method391(201.5F - (float) (var18.field4101 + 1) * 50.0F);
                                                }
                                                if (var18.field4103 == null) {
                                                    if (var18.field4105 != null) {
                                                        if (class227.method1559(0, var3, var4)) {
                                                            class90.method665(var18.field4105, field5292, class202.field3344, class209.field3406, class113.field1831, var3, var4, true);
                                                        } else {
                                                            class90.method665(var18.field4105, field5292, class202.field3344, class209.field3406, class113.field1831, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class227.method1559(0, var3, var4)) {
                                                    class197.method1425(var18.field4103, 0, field5292, class202.field3344, class209.field3406, class113.field1831, var3, var4, true);
                                                } else {
                                                    class197.method1425(var18.field4103, 0, field5292, class202.field3344, class209.field3406, class113.field1831, var3, var4, false);
                                                }
                                                class201 var19 = var18.field4098;
                                                if (var19 != null) {
                                                    if (class55.field815) {
                                                        if ((var19.field3331 & var2.field4082) == 0) {
                                                            class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                                                        } else {
                                                            class135.method975(var19.field3331, class235.field3901, class189.field3158, class70.field1073, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field3323.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var19.field3328 - class235.field3901, var19.field3336 - class189.field3158, var19.field3324 - class70.field1073, var19.field3325);
                                                }
                                                for (int var20 = 0; var20 < var18.field4092; var20++) {
                                                    class165 var21 = var18.field4107[var20];
                                                    if (var21 != null) {
                                                        if (class55.field815) {
                                                            class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                                                        }
                                                        var21.field2688.method150(var21.field2671, field5292, class202.field3344, class209.field3406, class113.field1831, var21.field2675 - class235.field3901, var21.field2672 - class189.field3158, var21.field2677 - class70.field1073, var21.field2673);
                                                    }
                                                }
                                                if (class55.field815) {
                                                    class55.method391(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field4103 == null) {
                                                if (var2.field4105 != null) {
                                                    if (class227.method1559(var6, var3, var4)) {
                                                        class90.method665(var2.field4105, field5292, class202.field3344, class209.field3406, class113.field1831, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class90.method665(var2.field4105, field5292, class202.field3344, class209.field3406, class113.field1831, var3, var4, false);
                                                    }
                                                }
                                            } else if (class227.method1559(var6, var3, var4)) {
                                                class197.method1425(var2.field4103, var6, field5292, class202.field3344, class209.field3406, class113.field1831, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field4103.field2214 != 12345678 || class274.field4719 && var5 <= class177.field2902) {
                                                    class197.method1425(var2.field4103, var6, field5292, class202.field3344, class209.field3406, class113.field1831, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class296 var23 = var2.field4085;
                                                if (var23 != null && (var23.field5074 & 0x80000000L) != 0L) {
                                                    if (class55.field815 && var23.field5076) {
                                                        class55.method391(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class55.field815) {
                                                        class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                                                    }
                                                    var23.field5073.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var23.field5075 - class235.field3901, var23.field5083 - class189.field3158, var23.field5072 - class70.field1073, var23.field5074);
                                                    if (class55.field815 && var23.field5076) {
                                                        class55.method391(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class201 var26 = var2.field4098;
                                            class222 var27 = var2.field4104;
                                            if (var26 != null || var27 != null) {
                                                if (class33.field469 == var3) {
                                                    var24++;
                                                } else if (class33.field469 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class88.field1390 == var4) {
                                                    var24 += 3;
                                                } else if (class88.field1390 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class148.field2421[var24];
                                                var2.field4082 = class169.field2726[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field3331 & class41.field608[var24]) == 0) {
                                                    var2.field4093 = 0;
                                                } else if (var26.field3331 == 16) {
                                                    var2.field4093 = 3;
                                                    var2.field4091 = class151.field2494[var24];
                                                    var2.field4106 = 3 - var2.field4091;
                                                } else if (var26.field3331 == 32) {
                                                    var2.field4093 = 6;
                                                    var2.field4091 = class202.field3348[var24];
                                                    var2.field4106 = 6 - var2.field4091;
                                                } else if (var26.field3331 == 64) {
                                                    var2.field4093 = 12;
                                                    var2.field4091 = class314.field5313[var24];
                                                    var2.field4106 = 12 - var2.field4091;
                                                } else {
                                                    var2.field4093 = 9;
                                                    var2.field4091 = class29.field376[var24];
                                                    var2.field4106 = 9 - var2.field4091;
                                                }
                                                if ((var26.field3331 & var25) != 0 && !class99.method750(var6, var3, var4, var26.field3331)) {
                                                    if (class55.field815) {
                                                        class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                                                    }
                                                    var26.field3323.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var26.field3328 - class235.field3901, var26.field3336 - class189.field3158, var26.field3324 - class70.field1073, var26.field3325);
                                                }
                                                if ((var26.field3333 & var25) != 0 && !class99.method750(var6, var3, var4, var26.field3333)) {
                                                    if (class55.field815) {
                                                        class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                                                    }
                                                    var26.field3326.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var26.field3328 - class235.field3901, var26.field3336 - class189.field3158, var26.field3324 - class70.field1073, var26.field3325);
                                                }
                                            }
                                            if (var27 != null && !class151.method1084(var6, var3, var4, var27.field3588.method152())) {
                                                if (class55.field815) {
                                                    class55.method391(var8 - 0.5F);
                                                }
                                                if ((var27.field3601 & var25) != 0) {
                                                    if (class55.field815) {
                                                        class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                                                    }
                                                    var27.field3588.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var27.field3590 + var27.field3599 - class235.field3901, var27.field3605 - class189.field3158, var27.field3589 + var27.field3594 - class70.field1073, var27.field3606);
                                                } else if (var27.field3601 == 256) {
                                                    int var28 = var27.field3590 - class235.field3901;
                                                    int var29 = var27.field3605 - class189.field3158;
                                                    int var30 = var27.field3589 - class70.field1073;
                                                    int var31 = var27.field3602;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class55.field815) {
                                                            class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                                                        }
                                                        var27.field3588.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var27.field3599 + var28, var29, var27.field3594 + var30, var27.field3606);
                                                    } else if (var27.field3593 != null) {
                                                        if (class55.field815) {
                                                            class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                                                        }
                                                        var27.field3593.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var28, var29, var30, var27.field3606);
                                                    }
                                                }
                                                if (class55.field815) {
                                                    class55.method391(var8);
                                                }
                                            }
                                            if (var22) {
                                                class296 var34 = var2.field4085;
                                                if (var34 != null && (var34.field5074 & 0x80000000L) == 0L) {
                                                    if (class55.field815 && var34.field5076) {
                                                        class55.method391(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class55.field815) {
                                                        class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                                                    }
                                                    var34.field5073.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var34.field5075 - class235.field3901, var34.field5083 - class189.field3158, var34.field5072 - class70.field1073, var34.field5074);
                                                    if (class55.field815 && var34.field5076) {
                                                        class55.method391(var8);
                                                    }
                                                }
                                                class83 var35 = var2.field4097;
                                                if (var35 != null && var35.field1300 == 0) {
                                                    if (class55.field815) {
                                                        class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                                                    }
                                                    if (var35.field1297 != null) {
                                                        var35.field1297.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var35.field1301 - class235.field3901, var35.field1296 - class189.field3158, var35.field1299 - class70.field1073, var35.field1294);
                                                    }
                                                    if (var35.field1302 != null) {
                                                        var35.field1302.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var35.field1301 - class235.field3901, var35.field1296 - class189.field3158, var35.field1299 - class70.field1073, var35.field1294);
                                                    }
                                                    if (var35.field1295 != null) {
                                                        var35.field1295.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var35.field1301 - class235.field3901, var35.field1296 - class189.field3158, var35.field1299 - class70.field1073, var35.field1294);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field4089;
                                            if (var36 != 0) {
                                                if (var3 < class33.field469 && (var36 & 0x4) != 0) {
                                                    class245 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field4087) {
                                                        class259.field4322.method532(101, var37);
                                                    }
                                                }
                                                if (var4 < class88.field1390 && (var36 & 0x2) != 0) {
                                                    class245 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field4087) {
                                                        class259.field4322.method532(85, var38);
                                                    }
                                                }
                                                if (var3 > class33.field469 && (var36 & 0x1) != 0) {
                                                    class245 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field4087) {
                                                        class259.field4322.method532(81, var39);
                                                    }
                                                }
                                                if (var4 > class88.field1390 && (var36 & 0x8) != 0) {
                                                    class245 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field4087) {
                                                        class259.field4322.method532(123, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field4093 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field4092; var42++) {
                                                if (class59.field932 != var2.field4107[var42].field2685 && (var2.field4094[var42] & var2.field4093) == var2.field4091) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class201 var43 = var2.field4098;
                                                if (!class99.method750(var6, var3, var4, var43.field3331)) {
                                                    if (class55.field815) {
                                                        label882: {
                                                            if ((var43.field3325 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field3328 - class235.field3901;
                                                                int var45 = var43.field3324 - class70.field1073;
                                                                int var46 = (int) (var43.field3325 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class78.field1244 - 1) {
                                                                        class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class120.field2000 - 1 && var4 < class78.field1244 - 1) {
                                                                        class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class120.field2000 - 1 && var4 > 0) {
                                                                        class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field3323.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var43.field3328 - class235.field3901, var43.field3336 - class189.field3158, var43.field3324 - class70.field1073, var43.field3325);
                                                }
                                                var2.field4093 = 0;
                                            }
                                        }
                                        if (!var2.field4081) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field4092;
                                            var2.field4081 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class165 var50 = var2.field4107[var49];
                                                if (class59.field932 != var50.field2685) {
                                                    for (int var51 = var50.field2682; var51 <= var50.field2681; var51++) {
                                                        for (int var52 = var50.field2670; var52 <= var50.field2676; var52++) {
                                                            class245 var53 = var7[var51][var52];
                                                            if (var53.field4095) {
                                                                var2.field4081 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field4093 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field2682) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field2681) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field2670) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field2676) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field4093) == var2.field4106) {
                                                                    var2.field4081 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class177.field2898[var48++] = var50;
                                                    int var55 = class33.field469 - var50.field2682;
                                                    int var56 = var50.field2681 - class33.field469;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class88.field1390 - var50.field2670;
                                                    int var58 = var50.field2676 - class88.field1390;
                                                    if (var58 > var57) {
                                                        var50.field2669 = var55 + var58;
                                                    } else {
                                                        var50.field2669 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class165 var62 = class177.field2898[var61];
                                                    if (class59.field932 != var62.field2685) {
                                                        if (var62.field2669 > var59) {
                                                            var59 = var62.field2669;
                                                            var60 = var61;
                                                        } else if (var62.field2669 == var59) {
                                                            int var63 = var62.field2675 - class235.field3901;
                                                            int var64 = var62.field2677 - class70.field1073;
                                                            int var65 = class177.field2898[var60].field2675 - class235.field3901;
                                                            int var66 = class177.field2898[var60].field2677 - class70.field1073;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class165 var67 = class177.field2898[var60];
                                                var67.field2685 = class59.field932;
                                                if (!class191.method1405(var6, var67.field2682, var67.field2681, var67.field2670, var67.field2676, var67.field2688.method152())) {
                                                    if (class55.field815) {
                                                        if ((var67.field2673 & 0xFC000L) == 147456L) {
                                                            class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                                                            int var68 = var67.field2675 - class235.field3901;
                                                            int var69 = var67.field2677 - class70.field1073;
                                                            int var70 = (int) (var67.field2673 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class135.method988(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class135.method988(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class135.method988(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class135.method988(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class135.method983(class235.field3901, class189.field3158, class70.field1073, var5, var67.field2682, var67.field2670, var67.field2681, var67.field2676);
                                                        }
                                                    }
                                                    var67.field2688.method150(var67.field2671, field5292, class202.field3344, class209.field3406, class113.field1831, var67.field2675 - class235.field3901, var67.field2672 - class189.field3158, var67.field2677 - class70.field1073, var67.field2673);
                                                }
                                                for (int var71 = var67.field2682; var71 <= var67.field2681; var71++) {
                                                    for (int var72 = var67.field2670; var72 <= var67.field2676; var72++) {
                                                        class245 var73 = var7[var71][var72];
                                                        if (var73.field4093 != 0) {
                                                            class259.field4322.method532(71, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field4087) {
                                                            class259.field4322.method532(112, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field4081) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field4081 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field4087);
                            } while (var2.field4093 != 0);
                            if (var3 > class33.field469 || var3 <= class224.field3631) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field4087);
                        if (var3 < class33.field469 || var3 >= class245.field4096 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field4087);
                    if (var4 > class88.field1390 || var4 <= class259.field4332) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field4087);
                if (var4 < class88.field1390 || var4 >= class309.field5248 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field4087);
            var2.field4087 = false;
            class300.field5138--;
            class83 var79 = var2.field4097;
            if (var79 != null && var79.field1300 != 0) {
                if (class55.field815) {
                    class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                }
                if (var79.field1297 != null) {
                    var79.field1297.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var79.field1301 - class235.field3901, var79.field1296 - class189.field3158 - var79.field1300, var79.field1299 - class70.field1073, var79.field1294);
                }
                if (var79.field1302 != null) {
                    var79.field1302.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var79.field1301 - class235.field3901, var79.field1296 - class189.field3158 - var79.field1300, var79.field1299 - class70.field1073, var79.field1294);
                }
                if (var79.field1295 != null) {
                    var79.field1295.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var79.field1301 - class235.field3901, var79.field1296 - class189.field3158 - var79.field1300, var79.field1299 - class70.field1073, var79.field1294);
                }
            }
            if (var2.field4082 != 0) {
                class222 var80 = var2.field4104;
                if (var80 != null && !class151.method1084(var6, var3, var4, var80.field3588.method152())) {
                    if ((var80.field3601 & var2.field4082) != 0) {
                        if (class55.field815) {
                            class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                        }
                        var80.field3588.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var80.field3590 + var80.field3599 - class235.field3901, var80.field3605 - class189.field3158, var80.field3589 + var80.field3594 - class70.field1073, var80.field3606);
                    } else if (var80.field3601 == 256) {
                        int var81 = var80.field3590 - class235.field3901;
                        int var82 = var80.field3605 - class189.field3158;
                        int var83 = var80.field3589 - class70.field1073;
                        int var84 = var80.field3602;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class55.field815) {
                                class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                            }
                            var80.field3588.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var80.field3599 + var81, var82, var80.field3594 + var83, var80.field3606);
                        } else if (var80.field3593 != null) {
                            if (class55.field815) {
                                class135.method977(class235.field3901, class189.field3158, class70.field1073, var5, var3, var4);
                            }
                            var80.field3593.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var81, var82, var83, var80.field3606);
                        }
                    }
                }
                class201 var87 = var2.field4098;
                if (var87 != null) {
                    if ((var87.field3333 & var2.field4082) != 0 && !class99.method750(var6, var3, var4, var87.field3333)) {
                        if (class55.field815) {
                            class135.method975(var87.field3333, class235.field3901, class189.field3158, class70.field1073, var6, var3, var4);
                        }
                        var87.field3326.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var87.field3328 - class235.field3901, var87.field3336 - class189.field3158, var87.field3324 - class70.field1073, var87.field3325);
                    }
                    if ((var87.field3331 & var2.field4082) != 0 && !class99.method750(var6, var3, var4, var87.field3331)) {
                        if (class55.field815) {
                            class135.method975(var87.field3331, class235.field3901, class189.field3158, class70.field1073, var6, var3, var4);
                        }
                        var87.field3323.method150(0, field5292, class202.field3344, class209.field3406, class113.field1831, var87.field3328 - class235.field3901, var87.field3336 - class189.field3158, var87.field3324 - class70.field1073, var87.field3325);
                    }
                }
            }
            if (var5 < class105.field1732 - 1) {
                class245 var88 = class120.field2010[var5 + 1][var3][var4];
                if (var88 != null && var88.field4087) {
                    class259.field4322.method532(117, var88);
                }
            }
            if (var3 < class33.field469) {
                class245 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field4087) {
                    class259.field4322.method532(70, var89);
                }
            }
            if (var4 < class88.field1390) {
                class245 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field4087) {
                    class259.field4322.method532(127, var90);
                }
            }
            if (var3 > class33.field469) {
                class245 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field4087) {
                    class259.field4322.method532(73, var91);
                }
            }
            if (var4 > class88.field1390) {
                class245 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field4087) {
                    class259.field4322.method532(98, var92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(Z)V", line = 1244)
    public static void method2157(boolean arg0) {
        field5296 = null;
        field5287 = null;
        field5299 = (int[][]) null;
        if (arg0) {
            field5299 = (int[][]) ((int[][]) null);
        }
    }
}
