import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class19 {

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "B")
    private byte field340;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field341 = 0;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "Lak;")
    public static class152 field346 = new class152(64);

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field348 = 0;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Ljb;")
    public static class11 field347;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Lbe;")
    public static class218 field349;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIII)V")
    public static final void method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field338++;
        for (int var6 = arg4; var6 <= (arg1 + arg4); var6++) {
            for (int var11 = arg3; var11 <= (arg2 + arg3); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class113.field1836[arg0][var11][var6] = 127;
                }
            }
        }
        if (arg5 > -3) {
            return;
        }
        for (int var7 = arg4; var7 < (arg1 + arg4); var7++) {
            for (int var10 = arg3; var10 < arg2 + arg3; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class31.field505[arg0][var10][var7] = arg0 > 0 ? class31.field505[arg0 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var8 = arg4 + 1; var8 < (arg4 + arg1); var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class31.field505[arg0][arg3][var8] = class31.field505[arg0][arg3 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var9 = arg3 + 1; var9 < arg3 + arg2; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class31.field505[arg0][var9][arg4] = class31.field505[arg0][var9][arg4 - 1];
                }
            }
        }
        if (arg3 < 0 || arg4 < 0 || arg3 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 <= 0 || class31.field505[arg0][arg3 - 1][arg4] == 0) {
                if (arg4 > 0 && class31.field505[arg0][arg3][arg4 - 1] != 0) {
                    class31.field505[arg0][arg3][arg4] = class31.field505[arg0][arg3][arg4 - 1];
                    return;
                }
                if (arg3 > 0 && arg4 > 0 && class31.field505[arg0][arg3 - 1][arg4 - 1] != 0) {
                    class31.field505[arg0][arg3][arg4] = class31.field505[arg0][arg3 - 1][arg4 - 1];
                    return;
                }
                return;
            }
            class31.field505[arg0][arg3][arg4] = class31.field505[arg0][arg3 - 1][arg4];
        } else if (arg3 <= 0 || class31.field505[arg0][arg3 - 1][arg4] == class31.field505[arg0 - 1][arg3 - 1][arg4]) {
            if (arg4 > 0 && class31.field505[arg0][arg3][arg4 - 1] != class31.field505[arg0 - 1][arg3][arg4 - 1]) {
                class31.field505[arg0][arg3][arg4] = class31.field505[arg0][arg3][arg4 - 1];
                return;
            }
            if (arg3 > 0 && arg4 > 0 && class31.field505[arg0][arg3 - 1][arg4 - 1] != class31.field505[arg0 - 1][arg3 - 1][arg4 - 1]) {
                class31.field505[arg0][arg3][arg4] = class31.field505[arg0][arg3 - 1][arg4 - 1];
                return;
            }
        } else {
            class31.field505[arg0][arg3][arg4] = class31.field505[arg0][arg3 - 1][arg4];
            return;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILmj;)I")
    public static final int method176(int arg0, class178 arg1) {
        field332++;
        class64 var2 = arg1.field3117;
        if (var2.field1050 != null) {
            var2 = var2.method458((byte) -54);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 != -1) {
            method176(-30, (class178) null);
        }
        int var3 = var2.field1018;
        if (arg1.field2655 == arg1.field2629) {
            var3 = var2.field997;
        } else if (arg1.field2629 == arg1.field2625) {
            var3 = var2.field1045;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)I")
    public final int method177(boolean arg0) {
        if (arg0) {
            return 9;
        } else {
            field344++;
            return (this.field340 & 0x8) == 8 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lsc;ZB)V")
    public static final void method178(class181 arg0, boolean arg1, byte arg2) {
        class181 var3 = arg0.method1216(-91);
        field334++;
        short[] var4 = new short[16];
        int var5 = 0;
        if (arg2 <= 70) {
            return;
        }
        for (int var6 = 0; var6 < class188.field3325; var6++) {
            class99 var9 = class237.method1620(-29539, var6);
            if ((!arg1 || var9.field1654) && var9.field1642 == -1 && var9.field1596 == -1 && var9.field1653 == 0 && var9.field1652.method1216(-91).method1220((byte) -127, var3) != -1) {
                if (var5 >= 250) {
                    class115.field1877 = -1;
                    class99.field1610 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class2.field60 = 0;
        class115.field1877 = var5;
        class99.field1610 = var4;
        class181[] var7 = new class181[class115.field1877];
        for (int var8 = 0; var8 < class115.field1877; var8++) {
            var7[var8] = class237.method1620(-29539, var4[var8]).field1652;
        }
        class100.method670(var7, class99.field1610, (byte) 105);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
    public static final void method179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field339++;
        if (class11.field219 <= arg4 && arg4 <= class124.field2032) {
            int var5 = class144.method931(110, class125.field2056, class23.field408, arg1);
            int var6 = class144.method931(-17, class125.field2056, class23.field408, arg0);
            class175.method1171(var5, var6, -99, arg2, arg4);
        }
        int var7 = 122 / (arg3 / 43);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I")
    public final int method180(int arg0) {
        field345++;
        if (arg0 != 7) {
            this.method177(false);
        }
        return this.field340 & 0x7;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI[Ljc;)V")
    public static final void method181(boolean arg0, int arg1, class8[] arg2) {
        field342++;
        if (!arg0) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class70.field1129[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class70.field1129[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg2[var6].method64(var4, (byte) 113, var5);
                            }
                        }
                    }
                }
            }
            class127.field2107 += (int) (Math.random() * 5.0D) - 2;
            if (class127.field2107 < -8) {
                class127.field2107 = -8;
            }
            class57.field869 += (int) (Math.random() * 5.0D) - 2;
            if (class127.field2107 > 8) {
                class127.field2107 = 8;
            }
            if (class57.field869 < -16) {
                class57.field869 = -16;
            }
            if (class57.field869 > 16) {
                class57.field869 = 16;
            }
        }
        byte var7;
        if (arg0) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int[][] var8 = new int[104][104];
        int var9 = class127.field2107 >> 2 << 10;
        int var10 = class57.field869 >> 1;
        int[][] var11 = new int[104][104];
        for (int var12 = arg1; var12 < var7; var12++) {
            byte[][] var51 = class113.field1836[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class31.field505[var12][var100 + 1][var54] - class31.field505[var12][var100 - 1][var54];
                    int var103 = class31.field505[var12][var100][var54 + 1] - class31.field505[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = -65536 / var104;
                    int var107 = (var51[var100][var54 - 1] >> 2) + (var51[var100 + 1][var54] >> 3) + (var51[var100][var54] >> 1) + ((var51[var100 + -1][var54] >> 2) - -(var51[var100][var54 - -1] >> 3));
                    int var108 = (var102 << 8) / var104;
                    int var109 = (var108 * -50 + var105 * -50 + var106 * -10) / var53 + var101;
                    var11[var100][var54] = var109 - var107;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class124.field2027[var55] = 0;
                class218.field3749[var55] = 0;
                class196.field3424[var55] = 0;
                class203.field3508[var55] = 0;
                class107.field1746[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class2.field61[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class52 var96 = class95.method627(8741, var95 - 1);
                            class124.field2027[var85] += var96.field833;
                            class218.field3749[var85] += var96.field820;
                            class196.field3424[var85] += var96.field831;
                            class203.field3508[var85] += var96.field829;
                            var10002 = class107.field1746[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class2.field61[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class52 var99 = class95.method627(8741, var98 - 1);
                            class124.field2027[var85] -= var99.field833;
                            class218.field3749[var85] -= var99.field820;
                            class196.field3424[var85] -= var99.field831;
                            class203.field3508[var85] -= var99.field829;
                            var10002 = class107.field1746[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 + 5;
                        if (var92 < 104) {
                            var87 += class196.field3424[var92];
                            var89 += class218.field3749[var92];
                            var86 += class124.field2027[var92];
                            var88 += class203.field3508[var92];
                            var90 += class107.field1746[var92];
                        }
                        int var93 = var91 - 5;
                        if (var93 >= 0) {
                            var89 -= class218.field3749[var93];
                            var90 -= class107.field1746[var93];
                            var87 -= class196.field3424[var93];
                            var86 -= class124.field2027[var93];
                            var88 -= class203.field3508[var93];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var8[var56][var91] = class256.method1745(class102.method690(arg1, 4), var87 / var90, var86 * 256 / var88, var89 / var90);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg0 || class219.method1460(51885665) || (class70.field1129[0][var57][var58] & 0x2) != 0 || (class70.field1129[var12][var57][var58] & 0x10) == 0 && class106.method714((byte) 119, var58, var57, var12) == class31.field509) {
                        if (class107.field1754 > var12) {
                            class107.field1754 = var12;
                        }
                        int var59 = class2.field61[var12][var57][var58] & 0xFF;
                        int var60 = class35.field548[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class31.field505[var12][var57][var58];
                            int var62 = class31.field505[var12][var57 + 1][var58];
                            int var63 = class31.field505[var12][var57 + 1][var58 + 1];
                            int var64 = class31.field505[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class18.field328[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class261.method1777(var60 - 1, -27950).field4564) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var63 && var61 == var64) {
                                    class52.field813[var12][var57][var58] = class185.method1291(class52.field813[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var59 > 0) {
                                var66 = var8[var57][var58];
                                int var67 = (var66 & 0x7F) + var10;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var66 + var9 & 0xFC00) + (var66 & 0x380) + var67;
                                var69 = class72.field1148[class7.method55((byte) 90, 96, var68)];
                            } else {
                                var69 = 0;
                                var66 = -1;
                            }
                            int var70 = var11[var57][var58];
                            int var71 = var11[var57 + 1][var58];
                            int var72 = var11[var57][var58 + 1];
                            int var73 = var11[var57 + 1][var58 + 1];
                            if (var60 == 0) {
                                class31.method249(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class7.method55((byte) 118, var70, var66), class7.method55((byte) 69, var71, var66), class7.method55((byte) 103, var73, var66), class7.method55((byte) 81, var72, var66), 0, 0, 0, 0, var69, 0);
                            } else {
                                int var74 = class18.field328[var12][var57][var58] + 1;
                                byte var75 = class1.field29[var12][var57][var58];
                                class262 var76 = class261.method1777(var60 - 1, -27950);
                                int var77 = var76.field4576;
                                if (var77 >= 0 && !class72.field1157.method939(88, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = class72.field1148[class75.method524(96, class72.field1157.method948(65535, var77), 50)];
                                    var79 = -1;
                                } else if (var76.field4567 == -1) {
                                    var79 = -2;
                                    var78 = 0;
                                } else {
                                    var79 = var76.field4567;
                                    int var80 = (var79 & 0x7F) + var10;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var9 + var79 & 0xFC00) + (var79 & 0x380) + var80;
                                    var78 = class72.field1148[class75.method524(96, var81, 50)];
                                }
                                if (var76.field4574 >= 0) {
                                    int var82 = var76.field4574;
                                    int var83 = (var82 & 0x7F) + var10;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var9 + var82 & 0xFC00) + ((var82 & 0x380) + var83);
                                    var78 = class72.field1148[class75.method524(96, var84, 50)];
                                }
                                class31.method249(var12, var57, var58, var74, var75, var77, var61, var62, var63, var64, class7.method55((byte) 88, var70, var66), class7.method55((byte) 108, var71, var66), class7.method55((byte) 122, var73, var66), class7.method55((byte) 123, var72, var66), class75.method524(var70, var79, 50), class75.method524(var71, var79, 50), class75.method524(var73, var79, 50), class75.method524(var72, var79, 50), var69, var78);
                            }
                        }
                    }
                }
            }
            class2.field61[var12] = null;
            class35.field548[var12] = null;
            class18.field328[var12] = null;
            class1.field29[var12] = null;
            class113.field1836[var12] = null;
        }
        class140.method894(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class70.field1129[1][var13][var50] & 0x2) == 2) {
                    class4.method37(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class52.field813[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var15;
                        int var18 = var15;
                        int var19 = var14;
                        while (var18 > 0 && (class52.field813[var14][var16][var18 - 1] & 0x1) != 0) {
                            var18--;
                        }
                        while (var17 < 104 && (class52.field813[var14][var16][var17 + 1] & 0x1) != 0) {
                            var17++;
                        }
                        int var20;
                        label349: for (var20 = var14; var20 > 0; var20--) {
                            for (int var21 = var18; var21 <= var17; var21++) {
                                if ((class52.field813[var20 - 1][var16][var21] & 0x1) == 0) {
                                    break label349;
                                }
                            }
                        }
                        label338: while (var19 < 3) {
                            for (int var22 = var18; var22 <= var17; var22++) {
                                if ((class52.field813[var19 + 1][var16][var22] & 0x1) == 0) {
                                    break label338;
                                }
                            }
                            var19++;
                        }
                        int var23 = (var17 + 1 - var18) * (var19 + 1 - var20);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class31.field505[var19][var16][var18] - var24;
                            int var26 = class31.field505[var20][var16][var18];
                            class23.method204(1, var16 * 128, var16 * 128, var18 * 128, var17 * 128 + 128, var25, var26);
                            for (int var27 = var20; var27 <= var19; var27++) {
                                for (int var28 = var18; var28 <= var17; var28++) {
                                    class52.field813[var27][var16][var28] = class5.method43(class52.field813[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class52.field813[var14][var16][var15] & 0x2) != 0) {
                        int var29;
                        for (var29 = var16; var29 > 0 && (class52.field813[var14][var29 - 1][var15] & 0x2) != 0; var29--) {
                        }
                        int var30;
                        for (var30 = var16; var30 < 104 && (class52.field813[var14][var30 + 1][var15] & 0x2) != 0; var30++) {
                        }
                        int var31 = var14;
                        int var32;
                        label403: for (var32 = var14; var32 > 0; var32--) {
                            for (int var33 = var29; var33 <= var30; var33++) {
                                if ((class52.field813[var32 - 1][var33][var15] & 0x2) == 0) {
                                    break label403;
                                }
                            }
                        }
                        label392: while (var31 < 3) {
                            for (int var34 = var29; var34 <= var30; var34++) {
                                if ((class52.field813[var31 + 1][var34][var15] & 0x2) == 0) {
                                    break label392;
                                }
                            }
                            var31++;
                        }
                        int var35 = (var30 + 1 - var29) * (var31 + 1 - var32);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class31.field505[var31][var29][var15] - var36;
                            int var38 = class31.field505[var32][var29][var15];
                            class23.method204(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var32; var39 <= var31; var39++) {
                                for (int var40 = var29; var40 <= var30; var40++) {
                                    class52.field813[var39][var40][var15] = class5.method43(class52.field813[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class52.field813[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43;
                        for (var43 = var15; var43 > 0 && (class52.field813[var14][var16][var43 - 1] & 0x4) != 0; var43--) {
                        }
                        int var44;
                        for (var44 = var15; var44 < 104 && (class52.field813[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        label458: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class52.field813[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label458;
                                }
                            }
                            var41--;
                        }
                        label447: while (var42 < 104) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class52.field813[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label447;
                                }
                            }
                            var42++;
                        }
                        if (((var44 + 1 - var43) * (var42 + 1 - var41)) >= 4) {
                            int var47 = class31.field505[var14][var41][var43];
                            class23.method204(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var43; var49 <= var44; var49++) {
                                    class52.field813[var14][var48][var49] = class5.method43(class52.field813[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method182(int arg0) {
        field347 = null;
        field349 = null;
        if (arg0 != 37) {
            method178((class181) null, false, (byte) -80);
        }
        field346 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)I")
    public static final int method183(int arg0, int arg1, int arg2) {
        field351++;
        int var3 = -65 % ((arg0 + 43) / 51);
        int var4 = 0;
        while (arg2 > 0) {
            arg2--;
            var4 = var4 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class19() {
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lvf;)V")
    public class19(class230 arg0) {
        this.field340 = arg0.method1563(-255688184);
        this.field343 = arg0.method1535(2);
        this.field337 = arg0.method1529(-32494);
        this.field336 = arg0.method1529(-32494);
        this.field350 = arg0.method1529(-32494);
        this.field330 = arg0.method1529(-32494);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IJ)Lsc;")
    public static final class181 method184(int arg0, long arg1) {
        field333++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            if (arg0 != -26890) {
                field346 = null;
            }
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class238.field4143[(int) (var8 - (arg1 * 37L))];
            }
            class181 var7 = new class181();
            var7.field3166 = var6;
            var7.field3155 = var6.length;
            return var7;
        }
    }
}
