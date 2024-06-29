import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class368 {

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "[I")
    private int[] field4578 = new int[64];

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
    private int[] field4580 = new int[1600];

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    private int field4582 = 0;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
    private int[] field4571 = new int[8191];

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[[Lqg;")
    private class488[][] field4568 = new class488[1600][64];

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[[Lqg;")
    private class488[][] field4564 = new class488[64][768];

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lnca;")
    private class785 field4585;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Loda;")
    private class129 field4574;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Loda;")
    private class129 field4572;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lje;")
    private class422 field4565;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lbt;")
    public static class48 field4577;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method2142(int arg0, boolean arg1) {
        class118.field1503.method4295(class118.field1503.field10676, 0, false);
        field4584++;
        class118.field1503.method4295(class118.field1503.field10632, 0, false);
        class118.field1503.method4295(class118.field1503.field10652, 1, false);
        class118.field1503.method4295(class118.field1503.field10650, 1, false);
        class118.field1503.method4295(class118.field1503.field10649, 0, false);
        class118.field1503.method4295(class118.field1503.field10657, 0, false);
        if (arg0 != -23156) {
            return;
        }
        class118.field1503.method4295(class118.field1503.field10677, 0, false);
        class118.field1503.method4295(class118.field1503.field10659, 0, false);
        class118.field1503.method4295(class118.field1503.field10660, 0, false);
        class118.field1503.method4295(class118.field1503.field10664, 0, false);
        class118.field1503.method4295(class118.field1503.field10672, 0, false);
        class118.field1503.method4295(class118.field1503.field10641, 0, false);
        class118.field1503.method4295(class118.field1503.field10628, 0, false);
        class118.field1503.method4295(class118.field1503.field10675, 0, false);
        class118.field1503.method4295(class118.field1503.field10631, 0, false);
        class118.field1503.method4295(class118.field1503.field10648, 0, false);
        class118.field1503.method4295(class118.field1503.field10643, 0, false);
        class118.field1503.method4295(class118.field1503.field10658, 0, false);
        class118.field1503.method4295(class118.field1503.field10667, 0, false);
        class573.method3325(-1);
        class118.field1503.method4295(class118.field1503.field10639, 2, false);
        class118.field1503.method4295(class118.field1503.field10647, 1, false);
        class725.method4110((byte) 114);
        class185.method1233(-24497);
        class723.field10141 = true;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILwg;B)V", line = 44)
    private final void method2143(int arg0, class449 arg1, byte arg2) {
        field4567++;
        class92.field1222 = arg1.field6255;
        arg1.method2647((float) arg0, 93);
        arg1.method2662((byte) 99);
        if (arg2 < 101) {
            field4577 = null;
        }
        arg1.method2679(16383, false);
        arg1.method2666(8, false);
        arg1.method2706(109);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILwg;)V", line = 63)
    public final void method2144(int arg0, class449 arg1) {
        field4573++;
        this.field4574.method273(786336, (byte) 125, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lwg;I)V", line = 72)
    private final void method2145(class449 arg0, int arg1) {
        field4581++;
        arg0.method2666(8, true);
        if (arg1 < -73) {
            arg0.method2679(16383, true);
            if (class92.field1222 != arg0.field6255) {
                arg0.method626(class92.field1222);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILwg;)V", line = 88)
    private final void method2146(int arg0, class449 arg1) {
        class92.field1222 = arg1.field6255;
        field4575++;
        arg1.method2696(false);
        if (arg0 == 26645) {
            arg1.method2679(16383, false);
            arg1.method2666(arg0 - 26637, false);
            arg1.method2706(80);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILwg;B)V", line = 110)
    private final void method2147(int arg0, class449 arg1, byte arg2) {
        field4576++;
        int var4 = 0;
        class256 var5 = arg1.method2677(0);
        float var6 = var5.field3027;
        float var7 = var5.field3031;
        float var8 = var5.field3007;
        if (arg2 != -7) {
            method2142(-74, true);
        }
        float var9 = var5.field3018;
        float var10 = var5.field2991;
        float var11 = var5.field3004;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field4574.method271(true, (byte) -115);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method2650((byte) 86, var21);
        if (Stream.method3985()) {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field4580[var48] > 64 ? 64 : this.field4580[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class488 var63 = this.field4568[var48][var50];
                        int var64 = var63.field6816;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field6812 >> 12);
                        float var70 = (float) (var63.field6817 >> 12);
                        float var71 = (float) (var63.field6821 >> 12);
                        int var72 = var63.field6819 >> 12;
                        var22.method3979((float) (-var72) * var12 + var69);
                        var22.method3979((float) (-var72) * var13 + var70);
                        var22.method3979((float) (-var72) * var14 + var71);
                        if (arg1.field6245 == 0) {
                            var22.method3980(var65, var66, var67, var68);
                        } else {
                            var22.method3983(var65, var66, var67, var68);
                        }
                        var22.method3979(0.0F);
                        var22.method3979(0.0F);
                        var22.method3979((float) var72 * var15 + var69);
                        var22.method3979((float) var72 * var16 + var70);
                        var22.method3979((float) var72 * var17 + var71);
                        if (arg1.field6245 == 0) {
                            var22.method3980(var65, var66, var67, var68);
                        } else {
                            var22.method3983(var65, var66, var67, var68);
                        }
                        var22.method3979(1.0F);
                        var22.method3979(0.0F);
                        var22.method3979((float) var72 * var12 + var69);
                        var22.method3979((float) var72 * var13 + var70);
                        var22.method3979((float) var72 * var14 + var71);
                        if (arg1.field6245 == 0) {
                            var22.method3980(var65, var66, var67, var68);
                        } else {
                            var22.method3983(var65, var66, var67, var68);
                        }
                        var22.method3979(1.0F);
                        var22.method3979(1.0F);
                        var22.method3979((float) var72 * var18 + var69);
                        var22.method3979((float) var72 * var19 + var70);
                        var22.method3979((float) var72 * var20 + var71);
                        if (arg1.field6245 == 0) {
                            var22.method3980(var65, var66, var67, var68);
                        } else {
                            var22.method3983(var65, var66, var67, var68);
                        }
                        var22.method3979(0.0F);
                        var4++;
                        var22.method3979(1.0F);
                    }
                    if (this.field4580[var48] > 64) {
                        int var51 = this.field4580[var48] - 64 - 1;
                        for (int var52 = this.field4578[var51] - 1; var52 >= 0; var52--) {
                            class488 var53 = this.field4564[var51][var52];
                            int var54 = var53.field6816;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field6812 >> 12);
                            float var60 = (float) (var53.field6817 >> 12);
                            float var61 = (float) (var53.field6821 >> 12);
                            int var62 = var53.field6819 >> 12;
                            var22.method3979((float) (-var62) * var12 + var59);
                            var22.method3979((float) (-var62) * var13 + var60);
                            var22.method3979((float) (-var62) * var14 + var61);
                            if (arg1.field6245 == 0) {
                                var22.method3980(var55, var56, var57, var58);
                            } else {
                                var22.method3983(var55, var56, var57, var58);
                            }
                            var22.method3979(0.0F);
                            var22.method3979(0.0F);
                            var22.method3979((float) var62 * var15 + var59);
                            var22.method3979((float) var62 * var16 + var60);
                            var22.method3979((float) var62 * var17 + var61);
                            if (arg1.field6245 == 0) {
                                var22.method3980(var55, var56, var57, var58);
                            } else {
                                var22.method3983(var55, var56, var57, var58);
                            }
                            var22.method3979(1.0F);
                            var22.method3979(0.0F);
                            var22.method3979((float) var62 * var12 + var59);
                            var22.method3979((float) var62 * var13 + var60);
                            var22.method3979((float) var62 * var14 + var61);
                            if (arg1.field6245 == 0) {
                                var22.method3980(var55, var56, var57, var58);
                            } else {
                                var22.method3983(var55, var56, var57, var58);
                            }
                            var22.method3979(1.0F);
                            var22.method3979(1.0F);
                            var22.method3979((float) var62 * var18 + var59);
                            var22.method3979((float) var62 * var19 + var60);
                            var22.method3979((float) var62 * var20 + var61);
                            if (arg1.field6245 == 0) {
                                var22.method3980(var55, var56, var57, var58);
                            } else {
                                var22.method3983(var55, var56, var57, var58);
                            }
                            var22.method3979(0.0F);
                            var22.method3979(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field4580[var23] > 64 ? 64 : this.field4580[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class488 var38 = this.field4568[var23][var25];
                        int var39 = var38.field6816;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field6812 >> 12);
                        float var45 = (float) (var38.field6817 >> 12);
                        float var46 = (float) (var38.field6821 >> 12);
                        int var47 = var38.field6819 >> 12;
                        var22.method3981((float) (-var47) * var12 + var44);
                        var22.method3981((float) (-var47) * var13 + var45);
                        var22.method3981((float) (-var47) * var14 + var46);
                        if (arg1.field6245 == 0) {
                            var22.method3980(var40, var41, var42, var43);
                        } else {
                            var22.method3983(var40, var41, var42, var43);
                        }
                        var22.method3981(0.0F);
                        var22.method3981(0.0F);
                        var22.method3981((float) var47 * var15 + var44);
                        var22.method3981((float) var47 * var16 + var45);
                        var22.method3981((float) var47 * var17 + var46);
                        if (arg1.field6245 == 0) {
                            var22.method3980(var40, var41, var42, var43);
                        } else {
                            var22.method3983(var40, var41, var42, var43);
                        }
                        var22.method3981(1.0F);
                        var22.method3981(0.0F);
                        var22.method3981((float) var47 * var12 + var44);
                        var22.method3981((float) var47 * var13 + var45);
                        var22.method3981((float) var47 * var14 + var46);
                        if (arg1.field6245 == 0) {
                            var22.method3980(var40, var41, var42, var43);
                        } else {
                            var22.method3983(var40, var41, var42, var43);
                        }
                        var22.method3981(1.0F);
                        var22.method3981(1.0F);
                        var22.method3981((float) var47 * var18 + var44);
                        var22.method3981((float) var47 * var19 + var45);
                        var22.method3981((float) var47 * var20 + var46);
                        if (arg1.field6245 == 0) {
                            var22.method3980(var40, var41, var42, var43);
                        } else {
                            var22.method3983(var40, var41, var42, var43);
                        }
                        var22.method3981(0.0F);
                        var22.method3981(1.0F);
                        var4++;
                    }
                    if (this.field4580[var23] > 64) {
                        int var26 = this.field4580[var23] - 64 - 1;
                        for (int var27 = this.field4578[var26] - 1; var27 >= 0; var27--) {
                            class488 var28 = this.field4564[var26][var27];
                            int var29 = var28.field6816;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field6812 >> 12);
                            float var35 = (float) (var28.field6817 >> 12);
                            float var36 = (float) (var28.field6821 >> 12);
                            int var37 = var28.field6819 >> 12;
                            var22.method3981((float) (-var37) * var12 + var34);
                            var22.method3981((float) (-var37) * var13 + var35);
                            var22.method3981((float) (-var37) * var14 + var36);
                            if (arg1.field6245 == 0) {
                                var22.method3980(var30, var31, var32, var33);
                            } else {
                                var22.method3983(var30, var31, var32, var33);
                            }
                            var22.method3981(0.0F);
                            var22.method3981(0.0F);
                            var22.method3981((float) var37 * var15 + var34);
                            var22.method3981((float) var37 * var16 + var35);
                            var22.method3981((float) var37 * var17 + var36);
                            if (arg1.field6245 == 0) {
                                var22.method3980(var30, var31, var32, var33);
                            } else {
                                var22.method3983(var30, var31, var32, var33);
                            }
                            var22.method3981(1.0F);
                            var22.method3981(0.0F);
                            var22.method3981((float) var37 * var12 + var34);
                            var22.method3981((float) var37 * var13 + var35);
                            var22.method3981((float) var37 * var14 + var36);
                            if (arg1.field6245 == 0) {
                                var22.method3980(var30, var31, var32, var33);
                            } else {
                                var22.method3983(var30, var31, var32, var33);
                            }
                            var22.method3981(1.0F);
                            var22.method3981(1.0F);
                            var22.method3981((float) var37 * var18 + var34);
                            var22.method3981((float) var37 * var19 + var35);
                            var22.method3981((float) var37 * var20 + var36);
                            if (arg1.field6245 == 0) {
                                var22.method3980(var30, var31, var32, var33);
                            } else {
                                var22.method3983(var30, var31, var32, var33);
                            }
                            var22.method3981(0.0F);
                            var22.method3981(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3992();
        if (this.field4574.method275(22022)) {
            arg1.method64(0, this.field4574, 0);
            arg1.method64(0, this.field4572, 1);
            arg1.method85((byte) 96, this.field4585);
            arg1.method1(this.field4565, (byte) 10, var4 * 4, class67.field920, 0, var4 * 2, 0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLaf;ILwg;)V", line = 497)
    public final void method2148(boolean arg0, class460 arg1, int arg2, class449 arg3) {
        field4566++;
        if (arg3.field6222 == null) {
            return;
        }
        if (arg2 < 0) {
            this.method2146(26645, arg3);
        } else {
            this.method2143(arg2, arg3, (byte) 125);
        }
        float var5 = arg3.field6222.field3021;
        float var6 = arg3.field6222.field2994;
        float var7 = arg3.field6222.field3009;
        float var8 = arg3.field6222.field3006;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class208 var12 = arg1.field6472.field1810;
            for (class208 var13 = var12.field2467; var13 != var12; var13 = var13.field2467) {
                class488 var14 = (class488) var13;
                int var15 = (int) ((float) (var14.field6821 >> 12) * var7 + (float) (var14.field6817 >> 12) * var6 + (float) (var14.field6812 >> 12) * var5 + var8);
                this.field4571[var9++] = var15;
                if (var15 < var10) {
                    var10 = var15;
                }
                if (var15 > var11) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = (class391.method2293((byte) -33, var16) - class534.field7517) + 1;
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            int var18 = 0;
            class208 var19 = var12.field2467;
            int var20 = -2;
            boolean var21 = arg0;
            boolean var22 = true;
            while (var12 != var19) {
                this.field4582 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field4580[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field4578[var24] = 0;
                }
                while (var12 != var19) {
                    class488 var25 = (class488) var19;
                    if (var22) {
                        var22 = false;
                        var20 = var25.field6814;
                        var21 = var25.field6820;
                    }
                    if (var18 > 0 && (var25.field6814 != var20 || var21 != var25.field6820)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field4571[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field4580[var26] < 64) {
                            this.field4568[var26][this.field4580[var26]++] = var25;
                        } else {
                            label102: {
                                if (this.field4580[var26] == 64) {
                                    if (this.field4582 == 64) {
                                        break label102;
                                    }
                                    this.field4580[var26] += this.field4582++ + 1;
                                }
                                class488[] var10000 = this.field4564[this.field4580[var26] - 64 - 1];
                                int var10002 = this.field4580[var26] - 65;
                                int var10004 = this.field4578[this.field4580[var26] - 65];
                                this.field4578[var10002] = this.field4578[this.field4580[var26] - 65] + 1;
                                var10000[var10004] = var25;
                            }
                        }
                    }
                    var19 = var19.field2467;
                }
                arg3.method2711(-1, false, var20 >= 0 ? var20 : -1, false);
                if (var21 && class92.field1222 != arg3.field6255) {
                    arg3.method626(class92.field1222);
                } else if (arg3.field6255 != 1.0F) {
                    arg3.method626(1.0F);
                }
                this.method2147(var16, arg3, (byte) -7);
            }
        } catch (Exception var27) {
        }
        this.method2145(arg3, -94);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIII)V", line = 657)
    public static final void method2149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4570++;
        if (class647.method3652(arg7, 0)) {
            int var10 = 0;
            if (arg2 == -1) {
                int var11 = 0;
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                if (class769.field10572) {
                    var12 = class247.field2910;
                    var10 = class582.field7956;
                    var11 = class581.field7918;
                    var14 = class300.field3599;
                    var13 = class446.field5979;
                    class300.field3599 = 1;
                }
                if (class642.field8762[arg7] == null) {
                    class413.method2461(arg5, true, class316.field3880[arg7], arg0, arg6, arg3, arg4, -1, arg5 < 0, arg1, arg8);
                } else {
                    class413.method2461(arg5, true, class642.field8762[arg7], arg0, arg6, arg3, arg4, -1, ~arg5 > -1, arg1, arg8);
                }
                if (class769.field10572) {
                    if (arg5 >= 0 && class300.field3599 == 2) {
                        class326.method1945(class581.field7918, class247.field2910, class582.field7956, class446.field5979, false);
                    }
                    class581.field7918 = var11;
                    class446.field5979 = var13;
                    class582.field7956 = var10;
                    class247.field2910 = var12;
                    class300.field3599 = var14;
                }
            }
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class255.field2977[var9] = true;
            }
        } else {
            class255.field2977[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lwg;)V", line = 768)
    public class368(class449 arg0) {
        this.field4585 = arg0.method68(77, new class585[] { new class585(new class504[] { class504.field7122, class504.field7129, class504.field7134 }), new class585(class504.field7125) });
        this.field4574 = arg0.method57(14, true);
        this.field4572 = arg0.method57(14, false);
        this.field4572.method273(393168, (byte) 125, 12);
        this.field4565 = arg0.method15(false, false);
        this.field4565.method2529(88, 49146);
        Buffer var2 = this.field4565.method2527((byte) -84, true);
        if (var2 != null) {
            Stream var3 = arg0.method2650((byte) -94, var2);
            if (Stream.method3985()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3991(var5);
                    var3.method3991(var5 + 1);
                    var3.method3991(var5 + 2);
                    var3.method3991(var5 + 2);
                    var3.method3991(var5 + 3);
                    var3.method3991(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3988(var7);
                    var3.method3988(var7 + 1);
                    var3.method3988(var7 + 2);
                    var3.method3988(var7 + 2);
                    var3.method3988(var7 + 3);
                    var3.method3988(var7);
                }
            }
            var3.method3992();
            this.field4565.method2526(1234);
        }
        Buffer var8 = this.field4572.method271(true, (byte) -114);
        if (var8 != null) {
            Stream var9 = arg0.method2650((byte) 115, var8);
            if (Stream.method3985()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3979(0.0F);
                    var9.method3979(-1.0F);
                    var9.method3979(0.0F);
                    var9.method3979(0.0F);
                    var9.method3979(-1.0F);
                    var9.method3979(0.0F);
                    var9.method3979(0.0F);
                    var9.method3979(-1.0F);
                    var9.method3979(0.0F);
                    var9.method3979(0.0F);
                    var9.method3979(-1.0F);
                    var9.method3979(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3981(0.0F);
                    var9.method3981(-1.0F);
                    var9.method3981(0.0F);
                    var9.method3981(0.0F);
                    var9.method3981(-1.0F);
                    var9.method3981(0.0F);
                    var9.method3981(0.0F);
                    var9.method3981(-1.0F);
                    var9.method3981(0.0F);
                    var9.method3981(0.0F);
                    var9.method3981(-1.0F);
                    var9.method3981(0.0F);
                }
            }
            var9.method3992();
            this.field4572.method275(22022);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 728)
    public final void method2150(int arg0) {
        if (arg0 != -28179) {
            this.field4582 = 73;
        }
        field4579++;
        this.field4574.method274((byte) 46);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 757)
    public static void method2151(int arg0) {
        if (arg0 <= 0) {
            field4577 = null;
        }
    }
}
