import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class92 {

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    private int field1455 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lmj;")
    private class144 field1445;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[Lhh;")
    public static class280[] field1447 = new class280[50];

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field1450 = 0;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lic;")
    public static class160 field1454 = new class160(50);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lsb;")
    public static class124 field1446;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lsb;")
    public static class124 field1458;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lhb;")
    private class146 field1451;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "[I")
    public static int[] field1460;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[[B")
    public static byte[][] field1452;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([SIIB[Ljava/lang/String;)V")
    public static final void method699(short[] arg0, int arg1, int arg2, byte arg3, String[] arg4) {
        int var5 = 92 % ((43 - arg3) / 34);
        if (arg1 < arg2) {
            int var6 = (arg1 + arg2) / 2;
            int var7 = arg1;
            String var8 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var8;
            short var9 = arg0[var6];
            arg0[var6] = arg0[arg2];
            arg0[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (var8 == null || arg4[var10] != null && arg4[var10].compareTo(var8) < (var10 & 0x1)) {
                    String var11 = arg4[var10];
                    arg4[var10] = arg4[var7];
                    arg4[var7] = var11;
                    short var12 = arg0[var10];
                    arg0[var10] = arg0[var7];
                    arg0[var7++] = var12;
                }
            }
            arg4[arg2] = arg4[var7];
            arg4[var7] = var8;
            arg0[arg2] = arg0[var7];
            arg0[var7] = var9;
            method699(arg0, arg1, var7 - 1, (byte) -26, arg4);
            method699(arg0, var7 + 1, arg2, (byte) 107, arg4);
        }
        field1457++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lhb;")
    public final class146 method700(int arg0) {
        field1459++;
        if (this.field1455 > 0 && this.field1445.field2380[this.field1455 - 1] != this.field1451) {
            class146 var2 = this.field1451;
            this.field1451 = var2.field2407;
            return var2;
        }
        while (this.field1445.field2370 > this.field1455) {
            class146 var3 = this.field1445.field2380[this.field1455++].field2407;
            if (this.field1445.field2380[this.field1455 - 1] != var3) {
                this.field1451 = var3.field2407;
                return var3;
            }
        }
        if (arg0 >= -62) {
            field1446 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Lhb;")
    public final class146 method701(byte arg0) {
        int var2 = -63 / ((arg0 - 19) / 62);
        this.field1455 = 0;
        field1453++;
        return this.method700(-73);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static void method702(boolean arg0) {
        field1447 = null;
        field1460 = null;
        field1454 = null;
        field1452 = null;
        if (arg0) {
            field1446 = null;
            field1458 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z[Lml;B[[[I)V")
    public static final void method703(boolean arg0, class13[] arg1, byte arg2, int[][][] arg3) {
        field1456++;
        if (arg2 < 13) {
            field1452 = null;
        }
        if (!arg0) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class43.field790[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class43.field790[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method89(var5, 28117, var6);
                            }
                        }
                    }
                }
            }
            class119.field2016 += (int) (Math.random() * 5.0D) - 2;
            class18.field262 += (int) (Math.random() * 5.0D) - 2;
            if (class18.field262 < -8) {
                class18.field262 = -8;
            }
            if (class119.field2016 < -16) {
                class119.field2016 = -16;
            }
            if (class18.field262 > 8) {
                class18.field262 = 8;
            }
            if (class119.field2016 > 16) {
                class119.field2016 = 16;
            }
        }
        byte var8;
        if (arg0) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int[][] var9 = new int[104][104];
        int var10 = class119.field2016 >> 1;
        int var11 = class18.field262 >> 2 << 10;
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var8; var13++) {
            byte[][] var52 = class127.field2098[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class21.field327[var13][var101 + 1][var55] - class21.field327[var13][var101 - 1][var55];
                    byte var103 = 74;
                    int var104 = class21.field327[var13][var101][var55 + 1] - class21.field327[var13][var101][var55 - 1];
                    int var105 = (int) Math.sqrt((double) (var102 * var102 + var104 * var104 + 65536));
                    int var106 = -65536 / var105;
                    int var107 = (var102 << 8) / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var106 * -10 + (var107 * -50 + (var108 * -50))) / var54 + var103;
                    int var110 = (var52[var101][var55] >> 1) + ((var52[var101 - 1][var55] >> 2) + (var52[var101][var55 - 1] >> 2) + (var52[var101][var55 + 1] >> 3) + (var52[var101 - -1][var55] >> 3));
                    var12[var101][var55] = var109 - var110;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class179.field2974[var56] = 0;
                class234.field3711[var56] = 0;
                class135.field2225[var56] = 0;
                class21.field332[var56] = 0;
                class204.field3289[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class229.field3658[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class259 var97 = class114.method845(var96 - 1, 29565);
                            class179.field2974[var86] += var97.field4128;
                            class234.field3711[var86] += var97.field4124;
                            class135.field2225[var86] += var97.field4127;
                            class21.field332[var86] += var97.field4119;
                            var10002 = class204.field3289[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class229.field3658[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class259 var100 = class114.method845(var99 - 1, 29565);
                            class179.field2974[var86] -= var100.field4128;
                            class234.field3711[var86] -= var100.field4124;
                            class135.field2225[var86] -= var100.field4127;
                            class21.field332[var86] -= var100.field4119;
                            var10002 = class204.field3289[var86]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; var92++) {
                        int var93 = var92 + 5;
                        if (var93 < 104) {
                            var87 += class179.field2974[var93];
                            var90 += class135.field2225[var93];
                            var88 += class234.field3711[var93];
                            var89 += class21.field332[var93];
                            var91 += class204.field3289[var93];
                        }
                        int var94 = var92 - 5;
                        if (var94 >= 0) {
                            var90 -= class135.field2225[var94];
                            var88 -= class234.field3711[var94];
                            var91 -= class204.field3289[var94];
                            var87 -= class179.field2974[var94];
                            var89 -= class21.field332[var94];
                        }
                        if (var92 >= 0 && var91 > 0) {
                            var9[var57][var92] = class223.method1503(var88 / var91, -77, var87 * 256 / var89, var90 / var91);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg0 || class9.method50(false) || (class43.field790[0][var58][var59] & 0x2) != 0 || (class43.field790[var13][var58][var59] & 0x10) == 0 && class157.method1133(var13, var59, var58, 125) == class282.field4485) {
                        if (var13 < class111.field1710) {
                            class111.field1710 = var13;
                        }
                        int var60 = class229.field3658[var13][var58][var59] & 0xFF;
                        int var61 = class185.field3042[var13][var58][var59] & 0xFF;
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class21.field327[var13][var58][var59];
                            int var63 = class21.field327[var13][var58][var59 + 1];
                            int var64 = class21.field327[var13][var58 + 1][var59 + 1];
                            int var65 = class21.field327[var13][var58 + 1][var59];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class70.field1173[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class294.method1973(-1000000, var61 - 1).field3737) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var65 && var62 == var64 && var62 == var63) {
                                    class240.field3786[var13][var58][var59] = class140.method1045(class240.field3786[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var70;
                            if (var60 > 0) {
                                var67 = var9[var58][var59];
                                int var68 = (var67 & 0x7F) + var10;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var11 + var67 & 0xFC00) + (var67 & 0x380) + var68;
                                var70 = class95.field1477[class65.method502(1795, 96, var69)];
                            } else {
                                var67 = -1;
                                var70 = 0;
                            }
                            int var71 = var12[var58][var59];
                            int var72 = var12[var58 + 1][var59 + 1];
                            int var73 = var12[var58][var59 + 1];
                            int var74 = var12[var58 + 1][var59];
                            if (var61 == 0) {
                                class56.method450(var13, var58, var59, 0, 0, -1, var62, var65, var64, var63, class65.method502(1795, var71, var67), class65.method502(1795, var74, var67), class65.method502(1795, var72, var67), class65.method502(1795, var73, var67), 0, 0, 0, 0, var70, 0);
                            } else {
                                int var75 = class70.field1173[var13][var58][var59] + 1;
                                byte var76 = class64.field1060[var13][var58][var59];
                                class236 var77 = class294.method1973(-1000000, var61 - 1);
                                int var78 = var77.field3738;
                                if (var78 >= 0 && !class95.field1483.method1611(115, var78)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var82;
                                if (var78 >= 0) {
                                    var79 = -1;
                                    var82 = class95.field1477[class35.method302(class95.field1483.method1612(-73, var78), 96, (byte) -25)];
                                } else if (var77.field3736 == -1) {
                                    var79 = -2;
                                    var82 = 0;
                                } else {
                                    var79 = var77.field3736;
                                    int var80 = (var79 & 0x7F) + var10;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var11 + var79 & 0xFC00) + (var79 & 0x380) + var80;
                                    var82 = class95.field1477[class35.method302(var81, 96, (byte) -25)];
                                }
                                if (var77.field3732 >= 0) {
                                    int var83 = var77.field3732;
                                    int var84 = (var83 & 0x7F) + var10;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var83 & 0x380) + (var11 + var83 & 0xFC00) + var84;
                                    var82 = class95.field1477[class35.method302(var85, 96, (byte) -25)];
                                }
                                class56.method450(var13, var58, var59, var75, var76, var78, var62, var65, var64, var63, class65.method502(1795, var71, var67), class65.method502(1795, var74, var67), class65.method502(1795, var72, var67), class65.method502(1795, var73, var67), class35.method302(var79, var71, (byte) -25), class35.method302(var79, var74, (byte) -25), class35.method302(var79, var72, (byte) -25), class35.method302(var79, var73, (byte) -25), var70, var82);
                            }
                        }
                    }
                }
            }
            class229.field3658[var13] = null;
            class185.field3042[var13] = null;
            class70.field1173[var13] = null;
            class64.field1060[var13] = null;
            class127.field2098[var13] = null;
        }
        class26.method235(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class43.field790[1][var14][var51] & 0x2) == 2) {
                    class33.method280(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class240.field3786[var15][var17][var16] & 0x1) != 0) {
                        int var18;
                        for (var18 = var16; var18 > 0 && (class240.field3786[var15][var17][var18 - 1] & 0x1) != 0; var18--) {
                        }
                        int var19 = var15;
                        int var20;
                        for (var20 = var16; var20 < 104 && (class240.field3786[var15][var17][var20 + 1] & 0x1) != 0; var20++) {
                        }
                        int var21 = var15;
                        label352: while (var19 > 0) {
                            for (int var22 = var18; var22 <= var20; var22++) {
                                if ((class240.field3786[var19 - 1][var17][var22] & 0x1) == 0) {
                                    break label352;
                                }
                            }
                            var19--;
                        }
                        label341: while (var21 < 3) {
                            for (int var23 = var18; var23 <= var20; var23++) {
                                if ((class240.field3786[var21 + 1][var17][var23] & 0x1) == 0) {
                                    break label341;
                                }
                            }
                            var21++;
                        }
                        int var24 = (var20 + 1 - var18) * (var21 + 1 - var19);
                        if (var24 >= 8) {
                            short var25 = 240;
                            int var26 = class21.field327[var21][var17][var18] - var25;
                            int var27 = class21.field327[var19][var17][var18];
                            class232.method1538(1, var17 * 128, var17 * 128, var18 * 128, var20 * 128 + 128, var26, var27);
                            for (int var28 = var19; var28 <= var21; var28++) {
                                for (int var29 = var18; var29 <= var20; var29++) {
                                    class240.field3786[var28][var17][var29] = class64.method498(class240.field3786[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class240.field3786[var15][var17][var16] & 0x2) != 0) {
                        int var30;
                        for (var30 = var17; var30 > 0 && (class240.field3786[var15][var30 - 1][var16] & 0x2) != 0; var30--) {
                        }
                        int var31 = var15;
                        int var32 = var15;
                        int var33;
                        for (var33 = var17; var33 < 104 && (class240.field3786[var15][var33 + 1][var16] & 0x2) != 0; var33++) {
                        }
                        label407: while (var31 > 0) {
                            for (int var34 = var30; var34 <= var33; var34++) {
                                if ((class240.field3786[var31 - 1][var34][var16] & 0x2) == 0) {
                                    break label407;
                                }
                            }
                            var31--;
                        }
                        label396: while (var32 < 3) {
                            for (int var35 = var30; var35 <= var33; var35++) {
                                if ((class240.field3786[var32 + 1][var35][var16] & 0x2) == 0) {
                                    break label396;
                                }
                            }
                            var32++;
                        }
                        int var36 = (var32 + 1 - var31) * (var33 + 1 - var30);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class21.field327[var32][var30][var16] - var37;
                            int var39 = class21.field327[var31][var30][var16];
                            class232.method1538(2, var30 * 128, var33 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                            for (int var40 = var31; var40 <= var32; var40++) {
                                for (int var41 = var30; var41 <= var33; var41++) {
                                    class240.field3786[var40][var41][var16] = class64.method498(class240.field3786[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class240.field3786[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43 = var17;
                        int var44;
                        for (var44 = var16; var44 > 0 && (class240.field3786[var15][var17][var44 - 1] & 0x4) != 0; var44--) {
                        }
                        int var45;
                        for (var45 = var16; var45 < 104 && (class240.field3786[var15][var17][var45 + 1] & 0x4) != 0; var45++) {
                        }
                        label461: while (var42 > 0) {
                            for (int var46 = var44; var46 <= var45; var46++) {
                                if ((class240.field3786[var15][var42 - 1][var46] & 0x4) == 0) {
                                    break label461;
                                }
                            }
                            var42--;
                        }
                        label450: while (var43 < 104) {
                            for (int var47 = var44; var47 <= var45; var47++) {
                                if ((class240.field3786[var15][var43 + 1][var47] & 0x4) == 0) {
                                    break label450;
                                }
                            }
                            var43++;
                        }
                        if (((var43 + 1 - var42) * (var45 + 1 - var44)) >= 4) {
                            int var48 = class21.field327[var15][var42][var44];
                            class232.method1538(4, var42 * 128, var43 * 128 + 128, var44 * 128, var45 * 128 + 128, var48, var48);
                            for (int var49 = var42; var49 <= var43; var49++) {
                                for (int var50 = var44; var50 <= var45; var50++) {
                                    class240.field3786[var15][var49][var50] = class64.method498(class240.field3786[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lmj;)V")
    public class92(class144 arg0) {
        this.field1445 = arg0;
    }
}
