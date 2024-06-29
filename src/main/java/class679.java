import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class679 {

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "[[Lab;")
    private class668[][] field9314 = new class668[1600][64];

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "[[Lab;")
    private class668[][] field9310 = new class668[64][768];

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
    private int field9316 = 0;

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "[I")
    private int[] field9319 = new int[64];

    @OriginalMember(owner = "client!ufa", name = "t", descriptor = "[I")
    private int[] field9326 = new int[8191];

    @OriginalMember(owner = "client!ufa", name = "q", descriptor = "[I")
    private int[] field9323 = new int[1600];

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "Llb;")
    private class542 field9317;

    @OriginalMember(owner = "client!ufa", name = "r", descriptor = "Lada;")
    private class161 field9324;

    @OriginalMember(owner = "client!ufa", name = "s", descriptor = "Lada;")
    private class161 field9325;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "Lgfa;")
    private class749 field9312;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "Lkt;")
    public static class155 field9315 = new class155();

    @OriginalMember(owner = "client!ufa", name = "w", descriptor = "I")
    public static int field9329 = 0;

    @OriginalMember(owner = "client!ufa", name = "v", descriptor = "Lgda;")
    public static class53 field9328 = new class53(11, 8);

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "F")
    public static float field9308;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!ufa", name = "n", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!ufa", name = "p", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!ufa", name = "u", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!ufa", name = "o", descriptor = "[I")
    public static int[] field9321;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLsr;I)V", line = 13)
    private final void method3802(byte arg0, class251 arg1, int arg2) {
        field9313++;
        class621.field8656 = arg1.field3597;
        arg1.method1646((float) arg2, 31823);
        if (arg0 >= 44) {
            arg1.method1603(1);
            arg1.method1615(0, false);
            arg1.method1629(false, (byte) -31);
            arg1.method1659((byte) 100);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lsr;)V", line = 679)
    public class679(class251 arg0) {
        this.field9317 = arg0.method1466(new class459[] { new class459(new class295[] { class295.field4149, class295.field4156, class295.field4158 }), new class459(class295.field4155) }, (byte) 108);
        this.field9324 = arg0.method1429(true, 30519);
        this.field9325 = arg0.method1429(false, 30519);
        this.field9325.method1061(-124, 12, 393168);
        this.field9312 = arg0.method1485((byte) 92, false);
        this.field9312.method2157(49146, (byte) 69);
        Buffer var2 = this.field9312.method2154(27599, true);
        if (var2 != null) {
            Stream var3 = arg0.method1666(var2, true);
            if (Stream.method3662()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3654(var7);
                    var3.method3654(var7 + 1);
                    var3.method3654(var7 + 2);
                    var3.method3654(var7 + 2);
                    var3.method3654(var7 + 3);
                    var3.method3654(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3655(var5);
                    var3.method3655(var5 + 1);
                    var3.method3655(var5 + 2);
                    var3.method3655(var5 + 2);
                    var3.method3655(var5 + 3);
                    var3.method3655(var5);
                }
            }
            var3.method3656();
            this.field9312.method2156((byte) 112);
        }
        Buffer var8 = this.field9325.method1063(-5419, true);
        if (var8 != null) {
            Stream var9 = arg0.method1666(var8, true);
            if (Stream.method3662()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3666(0.0F);
                    var9.method3666(-1.0F);
                    var9.method3666(0.0F);
                    var9.method3666(0.0F);
                    var9.method3666(-1.0F);
                    var9.method3666(0.0F);
                    var9.method3666(0.0F);
                    var9.method3666(-1.0F);
                    var9.method3666(0.0F);
                    var9.method3666(0.0F);
                    var9.method3666(-1.0F);
                    var9.method3666(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3658(0.0F);
                    var9.method3658(-1.0F);
                    var9.method3658(0.0F);
                    var9.method3658(0.0F);
                    var9.method3658(-1.0F);
                    var9.method3658(0.0F);
                    var9.method3658(0.0F);
                    var9.method3658(-1.0F);
                    var9.method3658(0.0F);
                    var9.method3658(0.0F);
                    var9.method3658(-1.0F);
                    var9.method3658(0.0F);
                }
            }
            var9.method3656();
            this.field9325.method1060(-17151);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V", line = 40)
    public static void method3803(int arg0) {
        field9315 = null;
        field9328 = null;
        int var1 = -11 / ((84 - arg0) / 34);
        field9321 = null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILsr;B)V", line = 53)
    private final void method3804(int arg0, class251 arg1, byte arg2) {
        field9318++;
        int var4 = 0;
        class328 var5 = arg1.method1654(-75);
        float var6 = var5.field4531;
        float var7 = var5.field4541;
        float var8 = var5.field4556;
        float var9 = var5.field4558;
        float var10 = var5.field4562;
        float var11 = var5.field4571;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        if (arg2 >= -10) {
            method3803(-86);
        }
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field9324.method1063(-5419, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method1666(var21, true);
        if (Stream.method3662()) {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field9323[var48] > 64 ? 64 : this.field9323[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class668 var63 = this.field9314[var48][var50];
                        int var64 = var63.field9084;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field9077 >> 12);
                        float var70 = (float) (var63.field9079 >> 12);
                        float var71 = (float) (var63.field9072 >> 12);
                        int var72 = var63.field9080 >> 12;
                        var22.method3666((float) (-var72) * var12 + var69);
                        var22.method3666((float) (-var72) * var13 + var70);
                        var22.method3666((float) (-var72) * var14 + var71);
                        if (arg1.field3599 == 0) {
                            var22.method3665(var65, var66, var67, var68);
                        } else {
                            var22.method3652(var65, var66, var67, var68);
                        }
                        var22.method3666(0.0F);
                        var22.method3666(0.0F);
                        var22.method3666((float) var72 * var15 + var69);
                        var22.method3666((float) var72 * var16 + var70);
                        var22.method3666((float) var72 * var17 + var71);
                        if (arg1.field3599 == 0) {
                            var22.method3665(var65, var66, var67, var68);
                        } else {
                            var22.method3652(var65, var66, var67, var68);
                        }
                        var22.method3666(1.0F);
                        var22.method3666(0.0F);
                        var22.method3666((float) var72 * var12 + var69);
                        var22.method3666((float) var72 * var13 + var70);
                        var22.method3666((float) var72 * var14 + var71);
                        if (arg1.field3599 == 0) {
                            var22.method3665(var65, var66, var67, var68);
                        } else {
                            var22.method3652(var65, var66, var67, var68);
                        }
                        var22.method3666(1.0F);
                        var22.method3666(1.0F);
                        var22.method3666((float) var72 * var18 + var69);
                        var22.method3666((float) var72 * var19 + var70);
                        var22.method3666((float) var72 * var20 + var71);
                        if (arg1.field3599 == 0) {
                            var22.method3665(var65, var66, var67, var68);
                        } else {
                            var22.method3652(var65, var66, var67, var68);
                        }
                        var22.method3666(0.0F);
                        var4++;
                        var22.method3666(1.0F);
                    }
                    if (this.field9323[var48] > 64) {
                        int var51 = this.field9323[var48] - 64 - 1;
                        for (int var52 = this.field9319[var51] - 1; var52 >= 0; var52--) {
                            class668 var53 = this.field9310[var51][var52];
                            int var54 = var53.field9084;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field9077 >> 12);
                            float var60 = (float) (var53.field9079 >> 12);
                            float var61 = (float) (var53.field9072 >> 12);
                            int var62 = var53.field9080 >> 12;
                            var22.method3666((float) (-var62) * var12 + var59);
                            var22.method3666((float) (-var62) * var13 + var60);
                            var22.method3666((float) (-var62) * var14 + var61);
                            if (arg1.field3599 == 0) {
                                var22.method3665(var55, var56, var57, var58);
                            } else {
                                var22.method3652(var55, var56, var57, var58);
                            }
                            var22.method3666(0.0F);
                            var22.method3666(0.0F);
                            var22.method3666((float) var62 * var15 + var59);
                            var22.method3666((float) var62 * var16 + var60);
                            var22.method3666((float) var62 * var17 + var61);
                            if (arg1.field3599 == 0) {
                                var22.method3665(var55, var56, var57, var58);
                            } else {
                                var22.method3652(var55, var56, var57, var58);
                            }
                            var22.method3666(1.0F);
                            var22.method3666(0.0F);
                            var22.method3666((float) var62 * var12 + var59);
                            var22.method3666((float) var62 * var13 + var60);
                            var22.method3666((float) var62 * var14 + var61);
                            if (arg1.field3599 == 0) {
                                var22.method3665(var55, var56, var57, var58);
                            } else {
                                var22.method3652(var55, var56, var57, var58);
                            }
                            var22.method3666(1.0F);
                            var22.method3666(1.0F);
                            var22.method3666((float) var62 * var18 + var59);
                            var22.method3666((float) var62 * var19 + var60);
                            var22.method3666((float) var62 * var20 + var61);
                            if (arg1.field3599 == 0) {
                                var22.method3665(var55, var56, var57, var58);
                            } else {
                                var22.method3652(var55, var56, var57, var58);
                            }
                            var22.method3666(0.0F);
                            var22.method3666(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field9323[var23] <= 64 ? this.field9323[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class668 var38 = this.field9314[var23][var25];
                        int var39 = var38.field9084;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field9077 >> 12);
                        float var45 = (float) (var38.field9079 >> 12);
                        float var46 = (float) (var38.field9072 >> 12);
                        int var47 = var38.field9080 >> 12;
                        var22.method3658((float) (-var47) * var12 + var44);
                        var22.method3658((float) (-var47) * var13 + var45);
                        var22.method3658((float) (-var47) * var14 + var46);
                        if (arg1.field3599 == 0) {
                            var22.method3665(var40, var41, var42, var43);
                        } else {
                            var22.method3652(var40, var41, var42, var43);
                        }
                        var22.method3658(0.0F);
                        var22.method3658(0.0F);
                        var22.method3658((float) var47 * var15 + var44);
                        var22.method3658((float) var47 * var16 + var45);
                        var22.method3658((float) var47 * var17 + var46);
                        if (arg1.field3599 == 0) {
                            var22.method3665(var40, var41, var42, var43);
                        } else {
                            var22.method3652(var40, var41, var42, var43);
                        }
                        var22.method3658(1.0F);
                        var22.method3658(0.0F);
                        var22.method3658((float) var47 * var12 + var44);
                        var22.method3658((float) var47 * var13 + var45);
                        var22.method3658((float) var47 * var14 + var46);
                        if (arg1.field3599 == 0) {
                            var22.method3665(var40, var41, var42, var43);
                        } else {
                            var22.method3652(var40, var41, var42, var43);
                        }
                        var22.method3658(1.0F);
                        var22.method3658(1.0F);
                        var22.method3658((float) var47 * var18 + var44);
                        var22.method3658((float) var47 * var19 + var45);
                        var22.method3658((float) var47 * var20 + var46);
                        if (arg1.field3599 == 0) {
                            var22.method3665(var40, var41, var42, var43);
                        } else {
                            var22.method3652(var40, var41, var42, var43);
                        }
                        var22.method3658(0.0F);
                        var22.method3658(1.0F);
                        var4++;
                    }
                    if (this.field9323[var23] > 64) {
                        int var26 = this.field9323[var23] - 64 - 1;
                        for (int var27 = this.field9319[var26] - 1; var27 >= 0; var27--) {
                            class668 var28 = this.field9310[var26][var27];
                            int var29 = var28.field9084;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field9077 >> 12);
                            float var35 = (float) (var28.field9079 >> 12);
                            float var36 = (float) (var28.field9072 >> 12);
                            int var37 = var28.field9080 >> 12;
                            var22.method3658((float) (-var37) * var12 + var34);
                            var22.method3658((float) (-var37) * var13 + var35);
                            var22.method3658((float) (-var37) * var14 + var36);
                            if (arg1.field3599 == 0) {
                                var22.method3665(var30, var31, var32, var33);
                            } else {
                                var22.method3652(var30, var31, var32, var33);
                            }
                            var22.method3658(0.0F);
                            var22.method3658(0.0F);
                            var22.method3658((float) var37 * var15 + var34);
                            var22.method3658((float) var37 * var16 + var35);
                            var22.method3658((float) var37 * var17 + var36);
                            if (arg1.field3599 == 0) {
                                var22.method3665(var30, var31, var32, var33);
                            } else {
                                var22.method3652(var30, var31, var32, var33);
                            }
                            var22.method3658(1.0F);
                            var22.method3658(0.0F);
                            var22.method3658((float) var37 * var12 + var34);
                            var22.method3658((float) var37 * var13 + var35);
                            var22.method3658((float) var37 * var14 + var36);
                            if (arg1.field3599 == 0) {
                                var22.method3665(var30, var31, var32, var33);
                            } else {
                                var22.method3652(var30, var31, var32, var33);
                            }
                            var22.method3658(1.0F);
                            var22.method3658(1.0F);
                            var22.method3658((float) var37 * var18 + var34);
                            var22.method3658((float) var37 * var19 + var35);
                            var22.method3658((float) var37 * var20 + var36);
                            if (arg1.field3599 == 0) {
                                var22.method3665(var30, var31, var32, var33);
                            } else {
                                var22.method3652(var30, var31, var32, var33);
                            }
                            var22.method3658(0.0F);
                            var22.method3658(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3656();
        if (this.field9324.method1060(-17151)) {
            arg1.method1460(0, 1, this.field9324);
            arg1.method1460(1, 1, this.field9325);
            arg1.method1479(this.field9317, 16);
            arg1.method1475(var4 * 4, var4 * 2, class441.field6289, -17390, 0, this.field9312, 0);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lsr;Ldm;IB)V", line = 442)
    public final void method3805(class251 arg0, class50 arg1, int arg2, byte arg3) {
        field9307++;
        if (arg0.field3526 == null) {
            return;
        }
        if (arg2 < 0) {
            this.method3806(arg0, (byte) 121);
        } else {
            this.method3802((byte) 122, arg0, arg2);
        }
        float var5 = arg0.field3526.field4546;
        if (arg3 != -49) {
            return;
        }
        float var6 = arg0.field3526.field4535;
        float var7 = arg0.field3526.field4559;
        float var8 = arg0.field3526.field4577;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class661 var12 = arg1.field578.field4407;
            for (class661 var13 = var12.field9046; var13 != var12; var13 = var13.field9046) {
                class668 var14 = (class668) var13;
                int var15 = (int) ((float) (var14.field9072 >> 12) * var7 + (float) (var14.field9079 >> 12) * var6 + (float) (var14.field9077 >> 12) * var5 + var8);
                if (var11 < var15) {
                    var11 = var15;
                }
                this.field9326[var9++] = var15;
                if (var10 > var15) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = class378.method2374((byte) 97, var16) + 1 - class109.field1310;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class661 var19 = var12.field9046;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field9316 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field9323[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field9319[var24] = 0;
                }
                while (var12 != var19) {
                    class668 var25 = (class668) var19;
                    if (var22) {
                        var21 = var25.field9074;
                        var20 = var25.field9082;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field9082 != var20 || var25.field9074 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field9326[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field9323[var26] < 64) {
                            this.field9314[var26][this.field9323[var26]++] = var25;
                        } else {
                            label98: {
                                if (this.field9323[var26] == 64) {
                                    if (this.field9316 == 64) {
                                        break label98;
                                    }
                                    this.field9323[var26] += this.field9316++ + 1;
                                }
                                class668[] var10000 = this.field9310[this.field9323[var26] - 64 - 1];
                                int var10002 = this.field9323[var26] - 65;
                                int var10004 = this.field9319[this.field9323[var26] - 65];
                                this.field9319[var10002] = this.field9319[this.field9323[var26] - 65] + 1;
                                var10000[var10004] = var25;
                            }
                        }
                    }
                    var19 = var19.field9046;
                }
                arg0.method1605(false, var20 >= 0 ? var20 : -1, 32242, false);
                if (var21 && class621.field8656 != arg0.field3597) {
                    arg0.method406(class621.field8656);
                } else if (arg0.field3597 != 1.0F) {
                    arg0.method406(1.0F);
                }
                this.method3804(var16, arg0, (byte) -68);
            }
        } catch (Exception var27) {
        }
        this.method3808(arg0, 0);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lsr;B)V", line = 605)
    private final void method3806(class251 arg0, byte arg1) {
        field9320++;
        class621.field8656 = arg0.field3597;
        if (arg1 < 90) {
            field9329 = 60;
        }
        arg0.method1604(false);
        arg0.method1615(0, false);
        arg0.method1629(false, (byte) -32);
        arg0.method1659((byte) 100);
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V", line = 621)
    public final void method3807(int arg0) {
        field9309++;
        if (arg0 <= 109) {
            this.method3802((byte) 96, null, -104);
        }
        this.field9324.method1059(5342);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lsr;I)V", line = 641)
    private final void method3808(class251 arg0, int arg1) {
        field9322++;
        arg0.method1629(true, (byte) -100);
        arg0.method1615(arg1 + arg1, true);
        if (class621.field8656 != arg0.field3597) {
            arg0.method406(class621.field8656);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLsr;)V", line = 653)
    public final void method3809(byte arg0, class251 arg1) {
        field9311++;
        if (arg0 >= 84) {
            this.field9324.method1061(22, 24, 786336);
        }
    }
}
