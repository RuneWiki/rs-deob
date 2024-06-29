import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class87 {

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "[[Lfm;")
    private class688[][] field1120 = new class688[64][768];

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "[I")
    private int[] field1119 = new int[8191];

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "[I")
    private int[] field1117 = new int[64];

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "[I")
    private int[] field1125 = new int[1600];

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    private int field1126 = 0;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "[[Lfm;")
    private class688[][] field1129 = new class688[1600][64];

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "Lbf;")
    private class502 field1135;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "Lii;")
    private class519 field1127;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "Lii;")
    private class519 field1128;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "Lvl;")
    private class13 field1122;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "Lm;")
    public static class180 field1123 = new class180();

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "Ldga;")
    public static class195 field1134 = new class195();

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!qu", name = "t", descriptor = "[Lxa;")
    public static class468[] field1136;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZLkea;)V")
    private final void method657(int arg0, boolean arg1, class223 arg2) {
        field1133++;
        int var4 = 0;
        class581 var5 = arg2.method1338((byte) 48);
        float var6 = var5.field7781;
        float var7 = var5.field7779;
        float var8 = var5.field7798;
        float var9 = var5.field7812;
        float var10 = var5.field7819;
        float var11 = var5.field7822;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field1127.method62(true, arg1);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg2.method1289(66, var21);
        if (Stream.method3525()) {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field1125[var23] > 64 ? 64 : this.field1125[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class688 var38 = this.field1129[var23][var25];
                        int var39 = var38.field9476;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field9471 >> 12);
                        float var45 = (float) (var38.field9480 >> 12);
                        float var46 = (float) (var38.field9475 >> 12);
                        int var47 = var38.field9469 >> 12;
                        var22.method3517((float) (-var47) * var12 + var44);
                        var22.method3517((float) (-var47) * var13 + var45);
                        var22.method3517((float) (-var47) * var14 + var46);
                        if (arg2.field2856 == 0) {
                            var22.method3518(var40, var41, var42, var43);
                        } else {
                            var22.method3522(var40, var41, var42, var43);
                        }
                        var22.method3517(0.0F);
                        var22.method3517(0.0F);
                        var22.method3517((float) var47 * var15 + var44);
                        var22.method3517((float) var47 * var16 + var45);
                        var22.method3517((float) var47 * var17 + var46);
                        if (arg2.field2856 == 0) {
                            var22.method3518(var40, var41, var42, var43);
                        } else {
                            var22.method3522(var40, var41, var42, var43);
                        }
                        var22.method3517(1.0F);
                        var22.method3517(0.0F);
                        var22.method3517((float) var47 * var12 + var44);
                        var22.method3517((float) var47 * var13 + var45);
                        var22.method3517((float) var47 * var14 + var46);
                        if (arg2.field2856 == 0) {
                            var22.method3518(var40, var41, var42, var43);
                        } else {
                            var22.method3522(var40, var41, var42, var43);
                        }
                        var22.method3517(1.0F);
                        var22.method3517(1.0F);
                        var22.method3517((float) var47 * var18 + var44);
                        var22.method3517((float) var47 * var19 + var45);
                        var22.method3517((float) var47 * var20 + var46);
                        if (arg2.field2856 == 0) {
                            var22.method3518(var40, var41, var42, var43);
                        } else {
                            var22.method3522(var40, var41, var42, var43);
                        }
                        var22.method3517(0.0F);
                        var4++;
                        var22.method3517(1.0F);
                    }
                    if (this.field1125[var23] > 64) {
                        int var26 = this.field1125[var23] - 65;
                        for (int var27 = this.field1117[var26] - 1; var27 >= 0; var27--) {
                            class688 var28 = this.field1120[var26][var27];
                            int var29 = var28.field9476;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field9471 >> 12);
                            float var35 = (float) (var28.field9480 >> 12);
                            float var36 = (float) (var28.field9475 >> 12);
                            int var37 = var28.field9469 >> 12;
                            var22.method3517((float) (-var37) * var12 + var34);
                            var22.method3517((float) (-var37) * var13 + var35);
                            var22.method3517((float) (-var37) * var14 + var36);
                            if (arg2.field2856 == 0) {
                                var22.method3518(var30, var31, var32, var33);
                            } else {
                                var22.method3522(var30, var31, var32, var33);
                            }
                            var22.method3517(0.0F);
                            var22.method3517(0.0F);
                            var22.method3517((float) var37 * var15 + var34);
                            var22.method3517((float) var37 * var16 + var35);
                            var22.method3517((float) var37 * var17 + var36);
                            if (arg2.field2856 == 0) {
                                var22.method3518(var30, var31, var32, var33);
                            } else {
                                var22.method3522(var30, var31, var32, var33);
                            }
                            var22.method3517(1.0F);
                            var22.method3517(0.0F);
                            var22.method3517((float) var37 * var12 + var34);
                            var22.method3517((float) var37 * var13 + var35);
                            var22.method3517((float) var37 * var14 + var36);
                            if (arg2.field2856 == 0) {
                                var22.method3518(var30, var31, var32, var33);
                            } else {
                                var22.method3522(var30, var31, var32, var33);
                            }
                            var22.method3517(1.0F);
                            var22.method3517(1.0F);
                            var22.method3517((float) var37 * var18 + var34);
                            var22.method3517((float) var37 * var19 + var35);
                            var22.method3517((float) var37 * var20 + var36);
                            if (arg2.field2856 == 0) {
                                var22.method3518(var30, var31, var32, var33);
                            } else {
                                var22.method3522(var30, var31, var32, var33);
                            }
                            var22.method3517(0.0F);
                            var22.method3517(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field1125[var48] <= 64 ? this.field1125[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class688 var63 = this.field1129[var48][var50];
                        int var64 = var63.field9476;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field9471 >> 12);
                        float var70 = (float) (var63.field9480 >> 12);
                        float var71 = (float) (var63.field9475 >> 12);
                        int var72 = var63.field9469 >> 12;
                        var22.method3527((float) (-var72) * var12 + var69);
                        var22.method3527((float) (-var72) * var13 + var70);
                        var22.method3527((float) (-var72) * var14 + var71);
                        if (arg2.field2856 == 0) {
                            var22.method3518(var65, var66, var67, var68);
                        } else {
                            var22.method3522(var65, var66, var67, var68);
                        }
                        var22.method3527(0.0F);
                        var22.method3527(0.0F);
                        var22.method3527((float) var72 * var15 + var69);
                        var22.method3527((float) var72 * var16 + var70);
                        var22.method3527((float) var72 * var17 + var71);
                        if (arg2.field2856 == 0) {
                            var22.method3518(var65, var66, var67, var68);
                        } else {
                            var22.method3522(var65, var66, var67, var68);
                        }
                        var22.method3527(1.0F);
                        var22.method3527(0.0F);
                        var22.method3527((float) var72 * var12 + var69);
                        var22.method3527((float) var72 * var13 + var70);
                        var22.method3527((float) var72 * var14 + var71);
                        if (arg2.field2856 == 0) {
                            var22.method3518(var65, var66, var67, var68);
                        } else {
                            var22.method3522(var65, var66, var67, var68);
                        }
                        var22.method3527(1.0F);
                        var22.method3527(1.0F);
                        var22.method3527((float) var72 * var18 + var69);
                        var22.method3527((float) var72 * var19 + var70);
                        var22.method3527((float) var72 * var20 + var71);
                        if (arg2.field2856 == 0) {
                            var22.method3518(var65, var66, var67, var68);
                        } else {
                            var22.method3522(var65, var66, var67, var68);
                        }
                        var22.method3527(0.0F);
                        var22.method3527(1.0F);
                        var4++;
                    }
                    if (this.field1125[var48] > 64) {
                        int var51 = this.field1125[var48] - 64 - 1;
                        for (int var52 = this.field1117[var51] - 1; var52 >= 0; var52--) {
                            class688 var53 = this.field1120[var51][var52];
                            int var54 = var53.field9476;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field9471 >> 12);
                            float var60 = (float) (var53.field9480 >> 12);
                            float var61 = (float) (var53.field9475 >> 12);
                            int var62 = var53.field9469 >> 12;
                            var22.method3527((float) (-var62) * var12 + var59);
                            var22.method3527((float) (-var62) * var13 + var60);
                            var22.method3527((float) (-var62) * var14 + var61);
                            if (arg2.field2856 == 0) {
                                var22.method3518(var55, var56, var57, var58);
                            } else {
                                var22.method3522(var55, var56, var57, var58);
                            }
                            var22.method3527(0.0F);
                            var22.method3527(0.0F);
                            var22.method3527((float) var62 * var15 + var59);
                            var22.method3527((float) var62 * var16 + var60);
                            var22.method3527((float) var62 * var17 + var61);
                            if (arg2.field2856 == 0) {
                                var22.method3518(var55, var56, var57, var58);
                            } else {
                                var22.method3522(var55, var56, var57, var58);
                            }
                            var22.method3527(1.0F);
                            var22.method3527(0.0F);
                            var22.method3527((float) var62 * var12 + var59);
                            var22.method3527((float) var62 * var13 + var60);
                            var22.method3527((float) var62 * var14 + var61);
                            if (arg2.field2856 == 0) {
                                var22.method3518(var55, var56, var57, var58);
                            } else {
                                var22.method3522(var55, var56, var57, var58);
                            }
                            var22.method3527(1.0F);
                            var22.method3527(1.0F);
                            var22.method3527((float) var62 * var18 + var59);
                            var22.method3527((float) var62 * var19 + var60);
                            var22.method3527((float) var62 * var20 + var61);
                            if (arg2.field2856 == 0) {
                                var22.method3518(var55, var56, var57, var58);
                            } else {
                                var22.method3522(var55, var56, var57, var58);
                            }
                            var22.method3527(0.0F);
                            var4++;
                            var22.method3527(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3530();
        if (this.field1127.method61((byte) 96)) {
            arg2.method363(-81, 0, this.field1127);
            arg2.method363(-80, 1, this.field1128);
            arg2.method344(28303, this.field1135);
            arg2.method375(0, (byte) 126, 0, var4 * 4, var4 * 2, class701.field9803, this.field1122);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILkea;)V")
    public final void method658(int arg0, class223 arg1) {
        field1121++;
        if (arg0 == -32108) {
            this.field1127.method2814(24, (byte) -99, 786336);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public static void method659(int arg0) {
        field1136 = null;
        field1134 = null;
        field1123 = null;
        if (arg0 < 59) {
            method661(-101, 9, 115, 46, 76, -108, -70);
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        int var2 = -21 / ((19 - arg0) / 33);
        field1124++;
        this.field1127.method60(5634);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIII)V")
    public static final void method661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= class292.field3700 && class337.field4186 >= arg6 && class125.field1524 <= arg5 && arg1 <= class377.field4848) {
            if (arg4 == 1) {
                class706.method3898(arg3, 113, arg1, arg6, arg5, arg2);
            } else {
                class306.method1821(arg2, arg4, arg3, arg5, arg6, 6, arg1);
            }
        } else if (arg4 == 1) {
            class196.method1151(arg5, arg3, arg2, arg6, false, arg1);
        } else {
            class248.method1483(arg6, arg5, (byte) -87, arg2, arg4, arg3, arg1);
        }
        field1118++;
        if (arg0 != -990813300) {
            method661(75, -89, -2, -66, -30, -35, -66);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lkea;Z)V")
    private final void method662(class223 arg0, boolean arg1) {
        arg0.method1272(true, (byte) -12);
        field1130++;
        arg0.method1281(true, arg1);
        if (class74.field985 != arg0.field2815) {
            arg0.method449(class74.field985);
        }
        if (arg1) {
            field1136 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILkea;Lig;)V")
    public final void method663(int arg0, class223 arg1, class228 arg2) {
        field1131++;
        if (arg1.field2776 == null) {
            return;
        }
        this.method664((byte) 126, arg1);
        float var4 = arg1.field2776.field7788;
        float var5 = arg1.field2776.field7807;
        float var6 = arg1.field2776.field7802;
        if (arg0 != -22942) {
            this.field1122 = null;
        }
        float var7 = arg1.field2776.field7826;
        try {
            if (arg2.field2945) {
                int var8 = arg2.field2946 - arg2.field2947;
                int var9;
                if ((var8 + 2) <= 1600) {
                    var8 += 2;
                    var9 = 0;
                } else {
                    var9 = class505.method2756(var8, arg0 - 42595) + (1 - class99.field1264);
                    var8 = (var8 >> var9) + 2;
                }
                class634 var10 = arg2.field2940.field6862;
                class634 var11 = var10.field8593;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field1126 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field1125[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field1117[var16] = 0;
                    }
                    while (var10 != var11) {
                        class688 var17 = (class688) var11;
                        if (var14) {
                            var14 = false;
                            var12 = var17.field9483;
                            var13 = var17.field9481;
                        } else if (var17.field9483 != var12 || var13 != var17.field9481) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field9475 >> 12) * var6 + (float) (var17.field9480 >> 12) * var5 + (float) (var17.field9471 >> 12) * var4 + var7) - arg2.field2947 >> var9;
                        if (var18 < 1600) {
                            if (this.field1125[var18] < 64) {
                                this.field1129[var18][this.field1125[var18]++] = var17;
                            } else {
                                label194: {
                                    if (this.field1125[var18] == 64) {
                                        if (this.field1126 == 64) {
                                            break label194;
                                        }
                                        this.field1125[var18] += this.field1126++ + 1;
                                    }
                                    this.field1120[this.field1125[var18] - 1 - 64][this.field1117[this.field1125[var18] - 64 - 1]++] = var17;
                                }
                            }
                        }
                        var11 = var11.field8593;
                    }
                    arg1.method1312(false, arg0 + 22942, var12 > 0 ? var12 : -1, false);
                    if (var13 && class74.field985 != arg1.field2815) {
                        arg1.method449(class74.field985);
                    } else if (arg1.field2815 != 1.0F) {
                        arg1.method449(1.0F);
                    }
                    this.method657(var8, true, arg1);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class634 var22 = arg2.field2940.field6862;
                for (class634 var23 = var22.field8593; var23 != var22; var23 = var23.field8593) {
                    class688 var24 = (class688) var23;
                    int var25 = (int) ((float) (var24.field9475 >> 12) * var6 + (float) (var24.field9480 >> 12) * var5 + (float) (var24.field9471 >> 12) * var4 + var7);
                    if (var21 < var25) {
                        var21 = var25;
                    }
                    if (var25 < var20) {
                        var20 = var25;
                    }
                    this.field1119[var19++] = var25;
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = class505.method2756(var26, -65537) + 1 - class99.field1264;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                int var28 = 0;
                class634 var29 = var22.field8593;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var29) {
                    this.field1126 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field1125[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field1117[var34] = 0;
                    }
                    while (var22 != var29) {
                        class688 var35 = (class688) var29;
                        if (var32) {
                            var32 = false;
                            var31 = var35.field9481;
                            var30 = var35.field9483;
                        }
                        if (var28 > 0 && (var35.field9483 != var30 || var35.field9481 != var31)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field1119[var28++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field1125[var36] >= 64) {
                                label144: {
                                    if (this.field1125[var36] == 64) {
                                        if (this.field1126 == 64) {
                                            break label144;
                                        }
                                        this.field1125[var36] += (this.field1126++) + 1;
                                    }
                                    this.field1120[this.field1125[var36] - 65][this.field1117[this.field1125[var36] - 1 - 64]++] = var35;
                                }
                            } else {
                                this.field1129[var36][this.field1125[var36]++] = var35;
                            }
                        }
                        var29 = var29.field8593;
                    }
                    arg1.method1312(false, 0, var30 < 0 ? -1 : var30, false);
                    if (var31 && class74.field985 != arg1.field2815) {
                        arg1.method449(class74.field985);
                    } else if (arg1.field2815 != 1.0F) {
                        arg1.method449(1.0F);
                    }
                    this.method657(var26, true, arg1);
                }
            }
        } catch (Exception var37) {
        }
        this.method662(arg1, false);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLkea;)V")
    private final void method664(byte arg0, class223 arg1) {
        field1132++;
        class74.field985 = arg1.field2815;
        arg1.method1347((byte) -8);
        arg1.method1281(false, false);
        arg1.method1272(false, (byte) -67);
        arg1.method1311(-113);
        if (arg0 < 119) {
            this.method663(-9, null, null);
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lkea;)V")
    public class87(class223 arg0) {
        this.field1135 = arg0.method350(new class192[] { new class192(new class133[] { class133.field1606, class133.field1617, class133.field1619 }), new class192(class133.field1611) }, (byte) -120);
        this.field1127 = arg0.method341(104, true);
        this.field1128 = arg0.method341(104, false);
        this.field1128.method2814(12, (byte) -99, 393168);
        this.field1122 = arg0.method340((byte) 118, false);
        this.field1122.method59(-29529, 49146);
        Buffer var2 = this.field1122.method62(true, true);
        if (var2 != null) {
            Stream var3 = arg0.method1289(-58, var2);
            if (Stream.method3525()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3526(var5);
                    var3.method3526(var5 + 1);
                    var3.method3526(var5 + 2);
                    var3.method3526(var5 + 2);
                    var3.method3526(var5 + 3);
                    var3.method3526(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3519(var7);
                    var3.method3519(var7 + 1);
                    var3.method3519(var7 + 2);
                    var3.method3519(var7 + 2);
                    var3.method3519(var7 + 3);
                    var3.method3519(var7);
                }
            }
            var3.method3530();
            this.field1122.method61((byte) 96);
        }
        Buffer var8 = this.field1128.method62(true, true);
        if (var8 != null) {
            Stream var9 = arg0.method1289(-55, var8);
            if (Stream.method3525()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3517(0.0F);
                    var9.method3517(-1.0F);
                    var9.method3517(0.0F);
                    var9.method3517(0.0F);
                    var9.method3517(-1.0F);
                    var9.method3517(0.0F);
                    var9.method3517(0.0F);
                    var9.method3517(-1.0F);
                    var9.method3517(0.0F);
                    var9.method3517(0.0F);
                    var9.method3517(-1.0F);
                    var9.method3517(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3527(0.0F);
                    var9.method3527(-1.0F);
                    var9.method3527(0.0F);
                    var9.method3527(0.0F);
                    var9.method3527(-1.0F);
                    var9.method3527(0.0F);
                    var9.method3527(0.0F);
                    var9.method3527(-1.0F);
                    var9.method3527(0.0F);
                    var9.method3527(0.0F);
                    var9.method3527(-1.0F);
                    var9.method3527(0.0F);
                }
            }
            var9.method3530();
            this.field1128.method61((byte) 96);
        }
    }
}
