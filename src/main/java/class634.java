import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class634 {

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "[[Lsaa;")
    private class272[][] field9123 = new class272[1600][64];

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "[I")
    private int[] field9132 = new int[1600];

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "[I")
    private int[] field9131 = new int[8191];

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    private int field9134 = 0;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "[[Lsaa;")
    private class272[][] field9138 = new class272[64][768];

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "[I")
    private int[] field9135 = new int[64];

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "Lrq;")
    private class293 field9133;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "Lvr;")
    private class116 field9122;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "Liaa;")
    private class419 field9129;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "[I")
    public static int[] field9126 = new int[1000];

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "J")
    public static long field9125 = -1L;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "Lvj;")
    public static class373 field9127 = new class373(100, 4);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILbda;)V", line = 4)
    private final void method3641(int arg0, class428 arg1) {
        field9121++;
        int var3 = -66 % ((73 - arg0) / 48);
        class274.field3580 = arg1.field5774;
        arg1.method2411(108);
        arg1.method2448(false, -11051);
        arg1.method2478((byte) -110, false);
        arg1.method2433(22880);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 19)
    public final void method3642(int arg0) {
        field9137++;
        this.field9133.method443(arg0 ^ 0x5C3E);
        if (arg0 != 64) {
            this.field9132 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lbda;II)V", line = 36)
    private final void method3643(class428 arg0, int arg1, int arg2) {
        field9128++;
        int var4 = 0;
        class335 var5 = arg0.method2404(false);
        float var6 = var5.field4377;
        if (arg1 != 1094263984) {
            this.field9129 = null;
        }
        float var7 = var5.field4361;
        float var8 = var5.field4343;
        float var9 = var5.field4368;
        float var10 = var5.field4366;
        float var11 = var5.field4371;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field9133.method440(-121, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method2426(var21, (byte) 11);
        if (Stream.method3340()) {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field9132[var23] <= 64 ? this.field9132[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class272 var38 = this.field9123[var23][var25];
                        int var39 = var38.field3541;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field3525 >> 12);
                        float var45 = (float) (var38.field3535 >> 12);
                        float var46 = (float) (var38.field3530 >> 12);
                        int var47 = var38.field3540 >> 12;
                        var22.method3348((float) (-var47) * var12 + var44);
                        var22.method3348((float) (-var47) * var13 + var45);
                        var22.method3348((float) (-var47) * var14 + var46);
                        var22.method3337(var42);
                        var22.method3337(var41);
                        var22.method3337(var40);
                        var22.method3337(var43);
                        var22.method3348(0.0F);
                        var22.method3348(0.0F);
                        var22.method3348((float) var47 * var15 + var44);
                        var22.method3348((float) var47 * var16 + var45);
                        var22.method3348((float) var47 * var17 + var46);
                        var22.method3337(var42);
                        var22.method3337(var41);
                        var22.method3337(var40);
                        var22.method3337(var43);
                        var22.method3348(1.0F);
                        var22.method3348(0.0F);
                        var22.method3348((float) var47 * var12 + var44);
                        var22.method3348((float) var47 * var13 + var45);
                        var22.method3348((float) var47 * var14 + var46);
                        var22.method3337(var42);
                        var22.method3337(var41);
                        var22.method3337(var40);
                        var22.method3337(var43);
                        var22.method3348(1.0F);
                        var22.method3348(1.0F);
                        var22.method3348((float) var47 * var18 + var44);
                        var22.method3348((float) var47 * var19 + var45);
                        var22.method3348((float) var47 * var20 + var46);
                        var22.method3337(var42);
                        var22.method3337(var41);
                        var22.method3337(var40);
                        var22.method3337(var43);
                        var22.method3348(0.0F);
                        var22.method3348(1.0F);
                        var4++;
                    }
                    if (this.field9132[var23] > 64) {
                        int var26 = this.field9132[var23] - 64 - 1;
                        for (int var27 = this.field9135[var26] - 1; var27 >= 0; var27--) {
                            class272 var28 = this.field9138[var26][var27];
                            int var29 = var28.field3541;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field3525 >> 12);
                            float var35 = (float) (var28.field3535 >> 12);
                            float var36 = (float) (var28.field3530 >> 12);
                            int var37 = var28.field3540 >> 12;
                            var22.method3348((float) (-var37) * var12 + var34);
                            var22.method3348((float) (-var37) * var13 + var35);
                            var22.method3348((float) (-var37) * var14 + var36);
                            var22.method3337(var32);
                            var22.method3337(var31);
                            var22.method3337(var30);
                            var22.method3337(var33);
                            var22.method3348(0.0F);
                            var22.method3348(0.0F);
                            var22.method3348((float) var37 * var15 + var34);
                            var22.method3348((float) var37 * var16 + var35);
                            var22.method3348((float) var37 * var17 + var36);
                            var22.method3337(var32);
                            var22.method3337(var31);
                            var22.method3337(var30);
                            var22.method3337(var33);
                            var22.method3348(1.0F);
                            var22.method3348(0.0F);
                            var22.method3348((float) var37 * var12 + var34);
                            var22.method3348((float) var37 * var13 + var35);
                            var22.method3348((float) var37 * var14 + var36);
                            var22.method3337(var32);
                            var22.method3337(var31);
                            var22.method3337(var30);
                            var22.method3337(var33);
                            var22.method3348(1.0F);
                            var22.method3348(1.0F);
                            var22.method3348((float) var37 * var18 + var34);
                            var22.method3348((float) var37 * var19 + var35);
                            var22.method3348((float) var37 * var20 + var36);
                            var22.method3337(var32);
                            var22.method3337(var31);
                            var22.method3337(var30);
                            var22.method3337(var33);
                            var22.method3348(0.0F);
                            var4++;
                            var22.method3348(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field9132[var48] > 64 ? 64 : this.field9132[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class272 var63 = this.field9123[var48][var50];
                        int var64 = var63.field3541;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field3525 >> 12);
                        float var70 = (float) (var63.field3535 >> 12);
                        float var71 = (float) (var63.field3530 >> 12);
                        int var72 = var63.field3540 >> 12;
                        var22.method3344((float) (-var72) * var12 + var69);
                        var22.method3344((float) (-var72) * var13 + var70);
                        var22.method3344((float) (-var72) * var14 + var71);
                        var22.method3337(var67);
                        var22.method3337(var66);
                        var22.method3337(var65);
                        var22.method3337(var68);
                        var22.method3344(0.0F);
                        var22.method3344(0.0F);
                        var22.method3344((float) var72 * var15 + var69);
                        var22.method3344((float) var72 * var16 + var70);
                        var22.method3344((float) var72 * var17 + var71);
                        var22.method3337(var67);
                        var22.method3337(var66);
                        var22.method3337(var65);
                        var22.method3337(var68);
                        var22.method3344(1.0F);
                        var22.method3344(0.0F);
                        var22.method3344((float) var72 * var12 + var69);
                        var22.method3344((float) var72 * var13 + var70);
                        var22.method3344((float) var72 * var14 + var71);
                        var22.method3337(var67);
                        var22.method3337(var66);
                        var22.method3337(var65);
                        var22.method3337(var68);
                        var22.method3344(1.0F);
                        var22.method3344(1.0F);
                        var22.method3344((float) var72 * var18 + var69);
                        var22.method3344((float) var72 * var19 + var70);
                        var22.method3344((float) var72 * var20 + var71);
                        var22.method3337(var67);
                        var22.method3337(var66);
                        var22.method3337(var65);
                        var22.method3337(var68);
                        var22.method3344(0.0F);
                        var4++;
                        var22.method3344(1.0F);
                    }
                    if (this.field9132[var48] > 64) {
                        int var51 = this.field9132[var48] - 64 - 1;
                        for (int var52 = this.field9135[var51] - 1; var52 >= 0; var52--) {
                            class272 var53 = this.field9138[var51][var52];
                            int var54 = var53.field3541;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field3525 >> 12);
                            float var60 = (float) (var53.field3535 >> 12);
                            float var61 = (float) (var53.field3530 >> 12);
                            int var62 = var53.field3540 >> 12;
                            var22.method3344((float) (-var62) * var12 + var59);
                            var22.method3344((float) (-var62) * var13 + var60);
                            var22.method3344((float) (-var62) * var14 + var61);
                            var22.method3337(var57);
                            var22.method3337(var56);
                            var22.method3337(var55);
                            var22.method3337(var58);
                            var22.method3344(0.0F);
                            var22.method3344(0.0F);
                            var22.method3344((float) var62 * var15 + var59);
                            var22.method3344((float) var62 * var16 + var60);
                            var22.method3344((float) var62 * var17 + var61);
                            var22.method3337(var57);
                            var22.method3337(var56);
                            var22.method3337(var55);
                            var22.method3337(var58);
                            var22.method3344(1.0F);
                            var22.method3344(0.0F);
                            var22.method3344((float) var62 * var12 + var59);
                            var22.method3344((float) var62 * var13 + var60);
                            var22.method3344((float) var62 * var14 + var61);
                            var22.method3337(var57);
                            var22.method3337(var56);
                            var22.method3337(var55);
                            var22.method3337(var58);
                            var22.method3344(1.0F);
                            var22.method3344(1.0F);
                            var22.method3344((float) var62 * var18 + var59);
                            var22.method3344((float) var62 * var19 + var60);
                            var22.method3344((float) var62 * var20 + var61);
                            var22.method3337(var57);
                            var22.method3337(var56);
                            var22.method3337(var55);
                            var22.method3337(var58);
                            var22.method3344(0.0F);
                            var4++;
                            var22.method3344(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3342();
        if (this.field9133.method442(-97)) {
            arg0.method1837(this.field9122, arg1 - 1094263975);
            arg0.method1792(this.field9133, 0, (byte) 89);
            arg0.method1801(0, var4 * 4, arg1 - 1094262544, class384.field5077, this.field9129, var4 * 2, 0);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V", line = 407)
    public static void method3644(int arg0) {
        if (arg0 != -30179) {
            field9125 = -47L;
        }
        field9127 = null;
        field9126 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lbda;Z)V", line = 426)
    private final void method3645(class428 arg0, boolean arg1) {
        arg0.method2478((byte) -42, arg1);
        field9136++;
        arg0.method2448(true, -11051);
        if (class274.field3580 != arg0.field5774) {
            arg0.method1165(class274.field3580);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lka;ZLbda;)V", line = 439)
    public final void method3646(class400 arg0, boolean arg1, class428 arg2) {
        field9124++;
        if (arg2.field5692 == null) {
            return;
        }
        this.method3641(-77, arg2);
        float var4 = arg2.field5692.field4364;
        float var5 = arg2.field5692.field4345;
        float var6 = arg2.field5692.field4344;
        float var7 = arg2.field5692.field4337;
        try {
            if (arg0.field5259) {
                int var8 = arg0.field5260 - arg0.field5258;
                int var9;
                if ((var8 + 2) <= 1600) {
                    var8 += 2;
                    var9 = 0;
                } else {
                    var9 = class131.method739(var8, 4) + (1 - class535.field7506);
                    var8 = (var8 >> var9) + 2;
                }
                class412 var10 = arg0.field5256.field5442;
                class412 var11 = var10.field5353;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field9134 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field9132[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field9135[var16] = 0;
                    }
                    while (var10 != var11) {
                        class272 var17 = (class272) var11;
                        if (var14) {
                            var13 = var17.field3532;
                            var12 = var17.field3534;
                            var14 = false;
                        } else if (var17.field3534 != var12 || var13 != var17.field3532) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field3530 >> 12) * var6 + (float) (var17.field3535 >> 12) * var5 + (float) (var17.field3525 >> 12) * var4 + var7) - arg0.field5258 >> var9;
                        if (var18 < 1600) {
                            if (this.field9132[var18] < 64) {
                                this.field9123[var18][this.field9132[var18]++] = var17;
                            } else {
                                label196: {
                                    if (this.field9132[var18] == 64) {
                                        if (this.field9134 == 64) {
                                            break label196;
                                        }
                                        this.field9132[var18] += this.field9134++ + 1;
                                    }
                                    this.field9138[this.field9132[var18] - 65][this.field9135[this.field9132[var18] - 64 - 1]++] = var17;
                                }
                            }
                        }
                        var11 = var11.field5353;
                    }
                    arg2.method2439(var12 >= 0 ? var12 : -1, false, false, (byte) 123);
                    if (var13 && class274.field3580 != arg2.field5774) {
                        arg2.method1165(class274.field3580);
                    } else if (arg2.field5774 != 1.0F) {
                        arg2.method1165(1.0F);
                    }
                    this.method3643(arg2, 1094263984, var8);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class412 var22 = arg0.field5256.field5442;
                for (class412 var23 = var22.field5353; var23 != var22; var23 = var23.field5353) {
                    class272 var24 = (class272) var23;
                    int var25 = (int) ((float) (var24.field3530 >> 12) * var6 + (float) (var24.field3535 >> 12) * var5 + (float) (var24.field3525 >> 12) * var4 + var7);
                    if (var20 > var25) {
                        var20 = var25;
                    }
                    if (var25 > var21) {
                        var21 = var25;
                    }
                    this.field9131[var19++] = var25;
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) <= 1600) {
                    var26 += 2;
                    var27 = 0;
                } else {
                    var27 = class131.method739(var26, 4) + 1 - class535.field7506;
                    var26 = (var26 >> var27) + 2;
                }
                class412 var28 = var22.field5353;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field9134 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field9132[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field9135[var34] = 0;
                    }
                    while (var22 != var28) {
                        class272 var35 = (class272) var28;
                        if (var32) {
                            var32 = false;
                            var31 = var35.field3532;
                            var30 = var35.field3534;
                        }
                        if (var29 > 0 && (var35.field3534 != var30 || var31 != var35.field3532)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field9131[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field9132[var36] < 64) {
                                this.field9123[var36][this.field9132[var36]++] = var35;
                            } else {
                                label146: {
                                    if (this.field9132[var36] == 64) {
                                        if (this.field9134 == 64) {
                                            break label146;
                                        }
                                        this.field9132[var36] += this.field9134++ + 1;
                                    }
                                    this.field9138[this.field9132[var36] - 65][this.field9135[this.field9132[var36] - 1 - 64]++] = var35;
                                }
                            }
                        }
                        var28 = var28.field5353;
                    }
                    arg2.method2439(var30 >= 0 ? var30 : -1, false, false, (byte) 117);
                    if (var31 && class274.field3580 != arg2.field5774) {
                        arg2.method1165(class274.field3580);
                    } else if (arg2.field5774 != 1.0F) {
                        arg2.method1165(1.0F);
                    }
                    this.method3643(arg2, 1094263984, var26);
                }
            }
        } catch (Exception var37) {
        }
        this.method3645(arg2, true);
        if (arg1) {
            this.field9133 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lbda;)V", line = 746)
    public class634(class428 arg0) {
        this.field9133 = arg0.method1823(116, true);
        this.field9122 = arg0.method1833(new class297[] { new class297(new class44[] { class44.field361, class44.field365, class44.field367 }) }, 0);
        this.field9129 = arg0.method1795(false, (byte) -101);
        this.field9129.method644(48, 49146);
        Buffer var2 = this.field9129.method440(-98, true);
        if (var2 != null) {
            Stream var3 = arg0.method2426(var2, (byte) 11);
            if (Stream.method3340()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3339(var7);
                    var3.method3339(var7 + 1);
                    var3.method3339(var7 + 2);
                    var3.method3339(var7 + 2);
                    var3.method3339(var7 + 3);
                    var3.method3339(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3341(var5);
                    var3.method3341(var5 + 1);
                    var3.method3341(var5 + 2);
                    var3.method3341(var5 + 2);
                    var3.method3341(var5 + 3);
                    var3.method3341(var5);
                }
            }
            var3.method3342();
            this.field9129.method442(-84);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Lbda;Z)V", line = 729)
    public final void method3647(class428 arg0, boolean arg1) {
        field9130++;
        this.field9133.method444(arg1, 196584, 24);
    }
}
