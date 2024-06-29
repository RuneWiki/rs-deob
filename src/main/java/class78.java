import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class78 {

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "[I")
    private int[] field1184;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[I")
    private int[] field1181;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Z")
    public static boolean field1171 = false;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lqe;")
    public static class168 field1179 = class66.method448("<col=ffff00>", -114);

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field1175 = 1;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    private int field1185;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    private final void method520(int arg0) {
        field1180++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var69 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var71 << 8;
            var8 = var3 + var64;
            int var76 = var71 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        if (arg0 != 30908) {
            this.method520(36);
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1184[var11 + 3] + var6;
            int var38 = this.field1184[var11 + 5] + var4;
            int var39 = this.field1184[var11 + 6] + var3;
            int var40 = this.field1184[var11 + 4] + var5;
            int var41 = this.field1184[var11 + 1] + var8;
            int var42 = this.field1184[var11] + var9;
            int var43 = var42 ^ var41 << 11;
            int var44 = this.field1184[var11 + 2] + var7;
            int var45 = var37 + var43;
            int var46 = var41 + var44;
            int var47 = this.field1184[var11 + 7] + var2;
            int var48 = var46 ^ var44 >>> 2;
            int var49 = var40 + var48;
            int var50 = var44 + var45;
            int var51 = var50 ^ var45 << 8;
            int var52 = var45 + var49;
            var6 = var52 ^ var49 >>> 16;
            int var53 = var6 + var39;
            int var54 = var38 + var51;
            int var55 = var49 + var54;
            var5 = var55 ^ var54 << 10;
            int var56 = var5 + var47;
            int var57 = var53 + var54;
            var4 = var57 ^ var53 >>> 4;
            int var58 = var4 + var43;
            int var59 = var53 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            this.field1181[var11] = var9;
            this.field1181[var11 + 1] = var8;
            var7 = var2 + var51;
            this.field1181[var11 + 2] = var7;
            this.field1181[var11 + 3] = var6;
            this.field1181[var11 + 4] = var5;
            this.field1181[var11 + 5] = var4;
            this.field1181[var11 + 6] = var3;
            this.field1181[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1181[var12 + 6] + var3;
            int var14 = this.field1181[var12 + 7] + var2;
            int var15 = this.field1181[var12] + var9;
            int var16 = this.field1181[var12 + 4] + var5;
            int var17 = this.field1181[var12 + 1] + var8;
            int var18 = var15 ^ var17 << 11;
            int var19 = this.field1181[var12 + 5] + var4;
            int var20 = this.field1181[var12 + 3] + var6;
            int var21 = this.field1181[var12 + 2] + var7;
            int var22 = var17 + var21;
            int var23 = var22 ^ var21 >>> 2;
            int var24 = var16 + var23;
            int var25 = var18 + var20;
            int var26 = var21 + var25;
            int var27 = var26 ^ var25 << 8;
            int var28 = var24 + var25;
            var6 = var28 ^ var24 >>> 16;
            int var29 = var6 + var13;
            int var30 = var19 + var27;
            int var31 = var24 + var30;
            var5 = var31 ^ var30 << 10;
            int var32 = var5 + var14;
            int var33 = var29 + var30;
            var4 = var33 ^ var29 >>> 4;
            int var34 = var29 + var32;
            int var35 = var4 + var18;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var8 = var3 + var23;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            this.field1181[var12] = var9;
            this.field1181[var12 + 1] = var8;
            var7 = var2 + var27;
            this.field1181[var12 + 2] = var7;
            this.field1181[var12 + 3] = var6;
            this.field1181[var12 + 4] = var5;
            this.field1181[var12 + 5] = var4;
            this.field1181[var12 + 6] = var3;
            this.field1181[var12 + 7] = var2;
        }
        this.method521((byte) 110);
        this.field1185 = 256;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    private final void method521(byte arg0) {
        this.field1174 += ++this.field1178;
        field1176++;
        if (arg0 <= 17) {
            this.field1185 = -86;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1181[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1173 ^= this.field1173 << 13;
                } else {
                    this.field1173 ^= this.field1173 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1173 ^= this.field1173 << 2;
            } else {
                this.field1173 ^= this.field1173 >>> 16;
            }
            this.field1173 += this.field1181[var2 + 128 & 0xFF];
            int var4;
            this.field1181[var2] = var4 = this.field1174 + this.field1173 + this.field1181[class86.method571(var3 >> 2, 255)];
            this.field1184[var2] = this.field1174 = var3 + this.field1181[class86.method571(261331, var4) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([Ltb;ZI)V")
    public static final void method522(class52[] arg0, boolean arg1, int arg2) {
        field1172++;
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class205.field3561[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class205.field3561[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method368(var5, var6, (byte) -113);
                            }
                        }
                    }
                }
            }
            class247.field4279 += (int) (Math.random() * 5.0D) - 2;
            if (class247.field4279 < -16) {
                class247.field4279 = -16;
            }
            class193.field3365 += (int) (Math.random() * 5.0D) - 2;
            if (class193.field3365 < -8) {
                class193.field3365 = -8;
            }
            if (class193.field3365 > 8) {
                class193.field3365 = 8;
            }
            if (class247.field4279 > 16) {
                class247.field4279 = 16;
            }
        }
        int var8 = class193.field3365 >> 2 << 10;
        int var9 = class247.field4279 >> 1;
        if (arg2 != -9) {
            field1182 = 9;
        }
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var55 = class179.field3155[var12];
            int var56 = (int) Math.sqrt(5100.0D);
            int var57 = var56 * 768 >> 8;
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var106 = 1; var106 < 103; var106++) {
                    byte var107 = 74;
                    int var108 = class23.field275[var12][var106 + 1][var58] - class23.field275[var12][var106 - 1][var58];
                    int var109 = class23.field275[var12][var106][var58 + 1] - class23.field275[var12][var106][var58 - 1];
                    int var110 = (int) Math.sqrt((double) (var108 * var108 + var109 * var109 + 65536));
                    int var111 = (var108 << 8) / var110;
                    int var112 = (var109 << 8) / var110;
                    int var113 = -65536 / var110;
                    int var114 = (var111 * -50 + var113 * -10 + var112 * -50) / var57 + var107;
                    int var115 = (var55[var106][var58 + 1] >> 3) + (var55[var106 - 1][var58] >> 2) + (var55[var106][var58] >> 1) + (var55[var106][var58 - 1] >> 2) + (var55[var106 - -1][var58] >> 3);
                    var10[var106][var58] = var114 - var115;
                }
            }
            for (int var59 = 0; var59 < 104; var59++) {
                class30.field369[var59] = 0;
                class135.field2360[var59] = 0;
                class254.field4397[var59] = 0;
                class208.field3614[var59] = 0;
                class9.field99[var59] = 0;
            }
            for (int var60 = -5; var60 < 104; var60++) {
                for (int var91 = 0; var91 < 104; var91++) {
                    int var100 = var60 + 5;
                    int var10002;
                    if (var100 < 104) {
                        int var101 = class76.field1138[var12][var100][var91] & 0xFF;
                        if (var101 > 0) {
                            class123 var102 = class223.method1461(var101 - 1, false);
                            class30.field369[var91] += var102.field2037;
                            class135.field2360[var91] += var102.field2039;
                            class254.field4397[var91] += var102.field2025;
                            class208.field3614[var91] += var102.field2029;
                            var10002 = class9.field99[var91]++;
                        }
                    }
                    int var103 = var60 - 5;
                    if (var103 >= 0) {
                        int var104 = class76.field1138[var12][var103][var91] & 0xFF;
                        if (var104 > 0) {
                            class123 var105 = class223.method1461(var104 - 1, false);
                            class30.field369[var91] -= var105.field2037;
                            class135.field2360[var91] -= var105.field2039;
                            class254.field4397[var91] -= var105.field2025;
                            class208.field3614[var91] -= var105.field2029;
                            var10002 = class9.field99[var91]--;
                        }
                    }
                }
                if (var60 >= 0) {
                    int var92 = 0;
                    int var93 = 0;
                    int var94 = 0;
                    int var95 = 0;
                    int var96 = 0;
                    for (int var97 = -5; var97 < 104; var97++) {
                        int var98 = var97 + 5;
                        if (var98 < 104) {
                            var94 += class254.field4397[var98];
                            var96 += class9.field99[var98];
                            var95 += class208.field3614[var98];
                            var93 += class135.field2360[var98];
                            var92 += class30.field369[var98];
                        }
                        int var99 = var97 - 5;
                        if (var99 >= 0) {
                            var92 -= class30.field369[var99];
                            var94 -= class254.field4397[var99];
                            var93 -= class135.field2360[var99];
                            var96 -= class9.field99[var99];
                            var95 -= class208.field3614[var99];
                        }
                        if (var97 >= 0 && var96 > 0) {
                            var11[var60][var97] = class242.method1592(var93 / var96, -13646, var94 / var96, var92 * 256 / var95);
                        }
                    }
                }
            }
            for (int var61 = 1; var61 < 103; var61++) {
                for (int var64 = 1; var64 < 103; var64++) {
                    if (arg1 || class119.method816((byte) 49) || (class205.field3561[0][var61][var64] & 0x2) != 0 || (class205.field3561[var12][var61][var64] & 0x10) == 0 && class179.method1180(-5552, var64, var12, var61) == class118.field1938) {
                        if (class31.field378 > var12) {
                            class31.field378 = var12;
                        }
                        int var65 = class96.field1510[var12][var61][var64] & 0xFF;
                        int var66 = class76.field1138[var12][var61][var64] & 0xFF;
                        if (var66 > 0 || var65 > 0) {
                            int var67 = class23.field275[var12][var61][var64];
                            int var68 = class23.field275[var12][var61 + 1][var64];
                            int var69 = class23.field275[var12][var61 + 1][var64 + 1];
                            int var70 = class23.field275[var12][var61][var64 + 1];
                            if (var12 > 0) {
                                boolean var71 = true;
                                if (var66 == 0 && class176.field3081[var12][var61][var64] != 0) {
                                    var71 = false;
                                }
                                if (var65 > 0 && !class238.method1550(4, var65 - 1).field1503) {
                                    var71 = false;
                                }
                                if (var71 && var67 == var68 && var67 == var69 && var67 == var70) {
                                    class139.field2467[var12][var61][var64] = class102.method675(class139.field2467[var12][var61][var64], 2340);
                                }
                            }
                            int var72;
                            int var73;
                            if (var66 <= 0) {
                                var72 = 0;
                                var73 = -1;
                            } else {
                                var73 = var11[var61][var64];
                                int var74 = (var73 & 0x7F) + var9;
                                if (var74 < 0) {
                                    var74 = 0;
                                } else if (var74 > 127) {
                                    var74 = 127;
                                }
                                int var75 = (var8 + var73 & 0xFC00) + (var73 & 0x380) + var74;
                                var72 = class248.field4296[class120.method820(96, var75, (byte) -94)];
                            }
                            int var76 = var10[var61][var64];
                            int var77 = var10[var61 + 1][var64 + 1];
                            int var78 = var10[var61][var64 + 1];
                            int var79 = var10[var61 + 1][var64];
                            if (var65 == 0) {
                                class176.method1163(var12, var61, var64, 0, 0, -1, var67, var68, var69, var70, class120.method820(var76, var73, (byte) -94), class120.method820(var79, var73, (byte) -94), class120.method820(var77, var73, (byte) -94), class120.method820(var78, var73, (byte) -94), 0, 0, 0, 0, var72, 0);
                            } else {
                                int var80 = class176.field3081[var12][var61][var64] + 1;
                                byte var81 = class221.field3792[var12][var61][var64];
                                class95 var82 = class238.method1550(4, var65 - 1);
                                int var83 = var82.field1492;
                                if (var83 >= 0 && !class248.field4299.method680(arg2 ^ 0xFFFFEEA2, var83)) {
                                    var83 = -1;
                                }
                                int var84;
                                int var85;
                                if (var83 >= 0) {
                                    var84 = class248.field4296[class83.method549((byte) -115, 96, class248.field4299.method681(var83, 1))];
                                    var85 = -1;
                                } else if (var82.field1496 == -1) {
                                    var84 = 0;
                                    var85 = -2;
                                } else {
                                    var85 = var82.field1496;
                                    int var86 = (var85 & 0x7F) + var9;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 127) {
                                        var86 = 127;
                                    }
                                    int var87 = (var8 + var85 & 0xFC00) + var86 + (var85 & 0x380);
                                    var84 = class248.field4296[class83.method549((byte) -117, 96, var87)];
                                }
                                if (var82.field1495 >= 0) {
                                    int var88 = var82.field1495;
                                    int var89 = (var88 & 0x7F) + var9;
                                    if (var89 < 0) {
                                        var89 = 0;
                                    } else if (var89 > 127) {
                                        var89 = 127;
                                    }
                                    int var90 = (var88 & 0x380) + (var8 + var88 & 0xFC00) + var89;
                                    var84 = class248.field4296[class83.method549((byte) -120, 96, var90)];
                                }
                                class176.method1163(var12, var61, var64, var80, var81, var83, var67, var68, var69, var70, class120.method820(var76, var73, (byte) -94), class120.method820(var79, var73, (byte) -94), class120.method820(var77, var73, (byte) -94), class120.method820(var78, var73, (byte) -94), class83.method549((byte) -113, var76, var85), class83.method549((byte) -123, var79, var85), class83.method549((byte) -125, var77, var85), class83.method549((byte) -127, var78, var85), var72, var84);
                            }
                        }
                    }
                }
            }
            if (!arg1) {
                for (int var62 = 1; var62 < 103; var62++) {
                    for (int var63 = 1; var63 < 103; var63++) {
                        if ((class205.field3561[0][var63][var62] & 0x2) == 0) {
                            class177.method1170(var12, var63, var62, class179.method1180(-5552, var62, var12, var63));
                        } else {
                            class177.method1170(var12, var63, var62, 0);
                        }
                    }
                }
            }
            class76.field1138[var12] = null;
            class96.field1510[var12] = null;
            class176.field3081[var12] = null;
            class221.field3792[var12] = null;
            class179.field3155[var12] = null;
        }
        class55.method383(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var54 = 0; var54 < 104; var54++) {
                if ((class205.field3561[1][var13][var54] & 0x2) == 2) {
                    class101.method663(var13, var54);
                }
            }
        }
        int var14 = 1;
        int var15 = 4;
        int var16 = 2;
        for (int var17 = 0; var17 < 4; var17++) {
            if (var17 > 0) {
                var14 <<= 0x3;
                var15 <<= 0x3;
                var16 <<= 0x3;
            }
            for (int var18 = 0; var18 <= var17; var18++) {
                for (int var19 = 0; var19 <= 104; var19++) {
                    for (int var20 = 0; var20 <= 104; var20++) {
                        if ((class139.field2467[var18][var20][var19] & var14) != 0) {
                            int var21;
                            for (var21 = var19; var21 > 0 && (var14 & class139.field2467[var18][var20][var21 - 1]) != 0; var21--) {
                            }
                            int var22;
                            for (var22 = var19; var22 < 104 && (var14 & class139.field2467[var18][var20][var22 + 1]) != 0; var22++) {
                            }
                            int var23 = var18;
                            int var24 = var18;
                            label376: while (var23 > 0) {
                                for (int var25 = var21; var25 <= var22; var25++) {
                                    if ((class139.field2467[var23 - 1][var20][var25] & var14) == 0) {
                                        break label376;
                                    }
                                }
                                var23--;
                            }
                            label365: while (var24 < var17) {
                                for (int var26 = var21; var26 <= var22; var26++) {
                                    if ((var14 & class139.field2467[var24 + 1][var20][var26]) == 0) {
                                        break label365;
                                    }
                                }
                                var24++;
                            }
                            int var27 = (var22 + 1 - var21) * (var24 + 1 - var23);
                            if (var27 >= 8) {
                                short var28 = 240;
                                int var29 = class23.field275[var24][var20][var21] - var28;
                                int var30 = class23.field275[var23][var20][var21];
                                class159.method1041(var17, 1, var20 * 128, var20 * 128, var21 * 128, var22 * 128 + 128, var29, var30);
                                for (int var31 = var23; var31 <= var24; var31++) {
                                    for (int var32 = var21; var32 <= var22; var32++) {
                                        class139.field2467[var31][var20][var32] = class86.method571(class139.field2467[var31][var20][var32], ~var14);
                                    }
                                }
                            }
                        }
                        if ((class139.field2467[var18][var20][var19] & var16) != 0) {
                            int var33;
                            for (var33 = var20; var33 > 0 && (class139.field2467[var18][var33 - 1][var19] & var16) != 0; var33--) {
                            }
                            int var34;
                            for (var34 = var20; var34 < 104 && (class139.field2467[var18][var34 + 1][var19] & var16) != 0; var34++) {
                            }
                            int var35 = var18;
                            int var36 = var18;
                            label431: while (var35 > 0) {
                                for (int var37 = var33; var37 <= var34; var37++) {
                                    if ((var16 & class139.field2467[var35 - 1][var37][var19]) == 0) {
                                        break label431;
                                    }
                                }
                                var35--;
                            }
                            label420: while (var36 < var17) {
                                for (int var38 = var33; var38 <= var34; var38++) {
                                    if ((var16 & class139.field2467[var36 + 1][var38][var19]) == 0) {
                                        break label420;
                                    }
                                }
                                var36++;
                            }
                            int var39 = (var34 + 1 - var33) * (-var35 + 1 + var36);
                            if (var39 >= 8) {
                                short var40 = 240;
                                int var41 = class23.field275[var36][var33][var19] - var40;
                                int var42 = class23.field275[var35][var33][var19];
                                class159.method1041(var17, 2, var33 * 128, var34 * 128 + 128, var19 * 128, var19 * 128, var41, var42);
                                for (int var43 = var35; var43 <= var36; var43++) {
                                    for (int var44 = var33; var44 <= var34; var44++) {
                                        class139.field2467[var43][var44][var19] = class86.method571(class139.field2467[var43][var44][var19], ~var16);
                                    }
                                }
                            }
                        }
                        if ((var15 & class139.field2467[var18][var20][var19]) != 0) {
                            int var45 = var20;
                            int var46;
                            for (var46 = var19; var46 > 0 && (class139.field2467[var18][var20][var46 - 1] & var15) != 0; var46--) {
                            }
                            int var47 = var20;
                            int var48;
                            for (var48 = var19; var48 < 104 && (var15 & class139.field2467[var18][var20][var48 + 1]) != 0; var48++) {
                            }
                            label486: while (var45 > 0) {
                                for (int var49 = var46; var49 <= var48; var49++) {
                                    if ((var15 & class139.field2467[var18][var45 - 1][var49]) == 0) {
                                        break label486;
                                    }
                                }
                                var45--;
                            }
                            label475: while (var47 < 104) {
                                for (int var50 = var46; var50 <= var48; var50++) {
                                    if ((var15 & class139.field2467[var18][var47 + 1][var50]) == 0) {
                                        break label475;
                                    }
                                }
                                var47++;
                            }
                            if ((var47 + 1 - var45) * (var48 + 1 + -var46) >= 4) {
                                int var51 = class23.field275[var18][var45][var46];
                                class159.method1041(var17, 4, var45 * 128, var47 * 128 + 128, var46 * 128, var48 * 128 + 128, var51, var51);
                                for (int var52 = var45; var52 <= var47; var52++) {
                                    for (int var53 = var46; var53 <= var48; var53++) {
                                        class139.field2467[var18][var52][var53] = class86.method571(class139.field2467[var18][var52][var53], ~var15);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)I")
    public final int method523(byte arg0) {
        int var2 = -46 % ((60 - arg0) / 57);
        field1183++;
        if (this.field1185-- == 0) {
            this.method521((byte) 52);
            this.field1185 = 255;
        }
        return this.field1184[this.field1185];
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
    public static void method524(byte arg0) {
        field1179 = null;
        if (arg0 > -9) {
            method525(-50, 92, 55, 15, -38, -61);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    private class78() {
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIII)V")
    public static final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1177++;
        int var6 = arg5 - arg3;
        int var7 = arg0 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class3.method23(arg3, (byte) -66, arg1, arg4, arg0);
            }
        } else if (var7 == 0) {
            class13.method45(arg1, arg4, arg5, arg3, 74);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class174.field3055 > arg3) {
                var10 = class174.field3055;
                var11 = var9 + (class174.field3055 * var8 >> 12);
            } else if (class249.field4314 >= arg3) {
                var11 = arg4;
                var10 = arg3;
            } else {
                var11 = (class249.field4314 * var8 >> 12) + var9;
                var10 = class249.field4314;
            }
            if (class222.field3811 > var11) {
                var11 = class222.field3811;
                var10 = (class222.field3811 - var9 << 12) / var8;
            } else if (class196.field3402 < var11) {
                var10 = (class196.field3402 - var9 << 12) / var8;
                var11 = class196.field3402;
            }
            int var12;
            int var13;
            if (arg5 < class174.field3055) {
                var12 = class174.field3055;
                var13 = (class174.field3055 * var8 >> 12) + var9;
            } else if (arg5 > class249.field4314) {
                var12 = class249.field4314;
                var13 = (class249.field4314 * var8 >> 12) + var9;
            } else {
                var13 = arg0;
                var12 = arg5;
            }
            if (var13 < class222.field3811) {
                var13 = class222.field3811;
                var12 = (class222.field3811 - var9 << 12) / var8;
            } else if (var13 > class196.field3402) {
                var12 = (class196.field3402 - var9 << 12) / var8;
                var13 = class196.field3402;
            }
            class198.method1272(var10, var11, arg1, var13, arg2, var12);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([I)V")
    public class78(int[] arg0) {
        this.field1184 = new int[256];
        this.field1181 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1184[var2] = arg0[var2];
        }
        this.method520(30908);
    }
}
