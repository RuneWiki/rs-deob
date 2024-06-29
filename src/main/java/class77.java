import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class77 {

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "[I")
    private int[] field1317 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "[I")
    private int[] field1347 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Z")
    public boolean field1319;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Luo;")
    private class468 field1325;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Lot;")
    private class500 field1324;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "[[[B")
    private byte[][][] field1346;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "[[[B")
    public byte[][][] field1330;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "[[[I")
    public int[][][] field1348;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "[[[B")
    private byte[][][] field1341;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "[[[B")
    private byte[][][] field1336;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "[[[B")
    private byte[][][] field1345;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "Z")
    public static boolean field1340 = true;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Lnk;")
    public static class326 field1327 = new class326(42, 3);

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "Z")
    public static boolean field1350 = false;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "Lvv;")
    public static class313 field1349 = new class313(85, 8);

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "Lvv;")
    public static class313 field1352 = new class313(108, 0);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "[I")
    public static int[] field1320;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "[[[B")
    public byte[][][] field1328;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V", line = 8)
    private final void method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg1; var7 < arg1 + arg0; var7++) {
            for (int var10 = arg2; var10 < (arg2 + arg5); var10++) {
                if (var10 >= 0 && this.field1331 > var10 && var7 >= 0 && var7 < this.field1339) {
                    this.field1348[arg3][var10][var7] = arg3 > 0 ? this.field1348[arg3 - 1][var10][var7] - 240 : 0;
                }
            }
        }
        if (arg4 < 61) {
            method559(-1);
        }
        field1344++;
        if (arg2 > 0 && this.field1331 > arg2) {
            for (int var8 = arg1 + 1; var8 < (arg1 + arg0); var8++) {
                if (var8 >= 0 && this.field1339 > var8) {
                    this.field1348[arg3][arg2][var8] = this.field1348[arg3][arg2 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && this.field1339 > arg1) {
            for (int var9 = arg2 + 1; var9 < (arg2 + arg5); var9++) {
                if (var9 >= 0 && this.field1331 > var9) {
                    this.field1348[arg3][var9][arg1] = this.field1348[arg3][var9][arg1 - 1];
                }
            }
        }
        if (arg2 < 0 || arg1 < 0 || arg2 >= this.field1331 || arg1 >= this.field1339) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 > 0 && this.field1348[arg3][arg2 - 1][arg1] != 0) {
                this.field1348[arg3][arg2][arg1] = this.field1348[arg3][arg2 - 1][arg1];
                return;
            }
            if (arg1 <= 0 || this.field1348[arg3][arg2][arg1 - 1] == 0) {
                if (arg2 > 0 && arg1 > 0 && this.field1348[arg3][arg2 - 1][arg1 - 1] != 0) {
                    this.field1348[arg3][arg2][arg1] = this.field1348[arg3][arg2 - 1][arg1 - 1];
                    return;
                }
                return;
            }
            this.field1348[arg3][arg2][arg1] = this.field1348[arg3][arg2][arg1 - 1];
        } else if (arg2 <= 0 || this.field1348[arg3 - 1][arg2 - 1][arg1] == this.field1348[arg3][arg2 - 1][arg1]) {
            if (arg1 > 0 && this.field1348[arg3 - 1][arg2][arg1 - 1] != this.field1348[arg3][arg2][arg1 - 1]) {
                this.field1348[arg3][arg2][arg1] = this.field1348[arg3][arg2][arg1 - 1];
                return;
            }
            if (arg2 > 0 && arg1 > 0 && this.field1348[arg3][arg2 - 1][arg1 - 1] != this.field1348[arg3 - 1][arg2 - 1][arg1 - 1]) {
                this.field1348[arg3][arg2][arg1] = this.field1348[arg3][arg2 - 1][arg1 - 1];
                return;
            }
        } else {
            this.field1348[arg3][arg2][arg1] = this.field1348[arg3][arg2 - 1][arg1];
            return;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lya;Lza;ILya;)V", line = 109)
    public final void method550(class220 arg0, class491 arg1, int arg2, class220 arg3) {
        field1333++;
        int[][] var5 = new int[this.field1331][this.field1339];
        if (class471.field6985 == null || class471.field6985.length != this.field1339) {
            class535.field7863 = new int[this.field1339];
            class303.field4856 = new int[this.field1339];
            class202.field3204 = new int[this.field1339];
            class471.field6985 = new int[this.field1339];
            class129.field2224 = new int[this.field1339];
        }
        for (int var6 = 0; var6 < this.field1321; var6++) {
            for (int var8 = 0; var8 < this.field1339; var8++) {
                class471.field6985[var8] = 0;
                class535.field7863[var8] = 0;
                class202.field3204[var8] = 0;
                class303.field4856[var8] = 0;
                class129.field2224[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field1331; var9++) {
                for (int var10 = 0; var10 < this.field1339; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field1331 > var19) {
                        int var20 = this.field1336[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class479 var21 = this.field1324.method2957((byte) 103, var20 - 1);
                            class471.field6985[var10] += var21.field7065;
                            class535.field7863[var10] += var21.field7063;
                            class202.field3204[var10] += var21.field7070;
                            class303.field4856[var10] += var21.field7069;
                            var10002 = class129.field2224[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field1336[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class479 var24 = this.field1324.method2957((byte) 106, var23 - 1);
                            class471.field6985[var10] -= var24.field7065;
                            class535.field7863[var10] -= var24.field7063;
                            class202.field3204[var10] -= var24.field7070;
                            class303.field4856[var10] -= var24.field7069;
                            var10002 = class129.field2224[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field1339; var16++) {
                        int var17 = var16 + 5;
                        if (this.field1339 > var17) {
                            var13 += class202.field3204[var17];
                            var12 += class535.field7863[var17];
                            var14 += class303.field4856[var17];
                            var11 += class471.field6985[var17];
                            var15 += class129.field2224[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class535.field7863[var18];
                            var13 -= class202.field3204[var18];
                            var11 -= class471.field6985[var18];
                            var15 -= class129.field2224[var18];
                            var14 -= class303.field4856[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class231.method1597(var11 * 256 / var14, var12 / var15, var13 / var15, -27818);
                        }
                    }
                }
            }
            if (class1.field3) {
                this.method562(class360.field5592[var6], arg1, var5, (byte) 102, var6 == 0 ? arg0 : null, var6 == 0 ? arg3 : null, var6);
            } else {
                this.method563(arg1, var6 == 0 ? arg0 : null, var5, (byte) 98, var6, class360.field5592[var6], var6 == 0 ? arg3 : null);
            }
            this.field1336[var6] = null;
            this.field1346[var6] = null;
            this.field1341[var6] = null;
            this.field1345[var6] = null;
        }
        if (!this.field1319) {
            if (class177.field2810 != 0) {
                class479.method2821();
            }
            if (class71.field1234) {
                class364.method2326();
            }
        }
        if (arg2 == 28205) {
            for (int var7 = 0; var7 < this.field1321; var7++) {
                class360.field5592[var7].method1524();
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 286)
    public static void method551(int arg0) {
        field1352 = null;
        if (arg0 >= -71) {
            field1352 = null;
        }
        field1349 = null;
        field1327 = null;
        field1320 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 299)
    public static final void method552(byte arg0) {
        class326.field5138.method647((byte) 125);
        field1338++;
        class261.field4357.field301 = 0;
        class212.field3373 = null;
        class265.field4447 = 0;
        class339.field5325 = null;
        class165.field2609 = 0;
        class157.field2544 = null;
        class345.field5408 = 0;
        class506.field7365.field301 = 0;
        class534.field7847 = null;
        if (arg0 != -2) {
            method552((byte) -122);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class188.field2943[var1] = null;
        }
        class468.field6951 = 0;
        class139.field2317 = 0;
        class4.field41 = null;
        class12.field136 = 0;
        class236.field4084 = null;
        class485.field7118 = 0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lir;IIIIIIIBII)Z", line = 333)
    public static final boolean method553(class251 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        field1326++;
        int var11 = arg6;
        int var12 = arg10;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        class330.field5195[var13][var14] = 99;
        int var16 = arg10 - var14;
        class71.field1218[var13][var14] = 0;
        byte var17 = 0;
        class194.field3041[var17] = arg6;
        int var18 = 0;
        byte var10001 = var17;
        int var27 = var17 + 1;
        class82.field1443[var10001] = arg10;
        int[][] var19 = arg0.field4288;
        int var20 = 49 / ((3 - arg8) / 60);
        while (var27 != var18) {
            var12 = class82.field1443[var18];
            var11 = class194.field3041[var18];
            int var21 = var12 - var16;
            int var22 = var11 - arg0.field4274;
            int var23 = var12 - arg0.field4271;
            int var24 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            if (arg7 == -4) {
                if (arg2 == var11 && arg5 == var12) {
                    class347.field5458 = var11;
                    class452.field6743 = var12;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class239.method1640(1, arg5, var11, var12, arg9, arg2, false, arg1, 1)) {
                    class452.field6743 = var12;
                    class347.field5458 = var11;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg0.method1715(1, arg1, arg5, var11, var12, 1, -94, arg2, arg9, arg4)) {
                    class347.field5458 = var11;
                    class452.field6743 = var12;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg0.method1701(var12, arg1, arg5, var11, 1, arg4, arg2, arg9, false)) {
                    class452.field6743 = var12;
                    class347.field5458 = var11;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg0.method1703(arg2, arg3, arg7, arg5, -49, var11, var12, 1)) {
                    class347.field5458 = var11;
                    class452.field6743 = var12;
                    return true;
                }
            } else if (arg0.method1698(var12, 76, arg5, arg3, 1, var11, arg2, arg7)) {
                class452.field6743 = var12;
                class347.field5458 = var11;
                return true;
            }
            int var26 = class71.field1218[var24][var21] + 1;
            if (var24 > 0 && class330.field5195[var24 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x42240000) == 0) {
                class194.field3041[var27] = var11 - 1;
                class82.field1443[var27] = var12;
                class330.field5195[var24 - 1][var21] = 2;
                var27 = var27 + 1 & 0xFFF;
                class71.field1218[var24 - 1][var21] = var26;
            }
            if (var24 < 127 && class330.field5195[var24 + 1][var21] == 0 && (var19[var22 + 1][var23] & 0x60240000) == 0) {
                class194.field3041[var27] = var11 + 1;
                class82.field1443[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class330.field5195[var24 + 1][var21] = 8;
                class71.field1218[var24 + 1][var21] = var26;
            }
            if (var21 > 0 && class330.field5195[var24][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x40A40000) == 0) {
                class194.field3041[var27] = var11;
                class82.field1443[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class330.field5195[var24][var21 - 1] = 1;
                class71.field1218[var24][var21 - 1] = var26;
            }
            if (var21 < 127 && class330.field5195[var24][var21 + 1] == 0 && (var19[var22][var23 + 1] & 0x48240000) == 0) {
                class194.field3041[var27] = var11;
                class82.field1443[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class330.field5195[var24][var21 + 1] = 4;
                class71.field1218[var24][var21 + 1] = var26;
            }
            if (var24 > 0 && var21 > 0 && class330.field5195[var24 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22 - 1][var23] & 0x42240000) == 0 && (var19[var22][var23 - 1] & 0x40A40000) == 0) {
                class194.field3041[var27] = var11 - 1;
                class82.field1443[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class330.field5195[var24 - 1][var21 - 1] = 3;
                class71.field1218[var24 - 1][var21 - 1] = var26;
            }
            if (var24 < 127 && var21 > 0 && class330.field5195[var24 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 1][var23] & 0x60240000) == 0 && (var19[var22][var23 - 1] & 0x40A40000) == 0) {
                class194.field3041[var27] = var11 + 1;
                class82.field1443[var27] = var12 - 1;
                class330.field5195[var24 + 1][var21 - 1] = 9;
                var27 = var27 + 1 & 0xFFF;
                class71.field1218[var24 + 1][var21 - 1] = var26;
            }
            if (var24 > 0 && var21 < 127 && class330.field5195[var24 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var22 - 1][var23] & 0x42240000) == 0 && (var19[var22][var23 + 1] & 0x48240000) == 0) {
                class194.field3041[var27] = var11 - 1;
                class82.field1443[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class330.field5195[var24 - 1][var21 + 1] = 6;
                class71.field1218[var24 - 1][var21 + 1] = var26;
            }
            if (var24 < 127 && var21 < 127 && class330.field5195[var24 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var22 + 1][var23] & 0x60240000) == 0 && (var19[var22][var23 + 1] & 0x48240000) == 0) {
                class194.field3041[var27] = var11 + 1;
                class82.field1443[var27] = var12 + 1;
                class330.field5195[var24 + 1][var21 + 1] = 12;
                var27 = var27 + 1 & 0xFFF;
                class71.field1218[var24 + 1][var21 + 1] = var26;
            }
        }
        class452.field6743 = var12;
        class347.field5458 = var11;
        return false;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIZII)V", line = 587)
    public final void method554(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field1321; var6++) {
            this.method549(arg4, arg0, arg3, var6, 93, arg1);
        }
        if (arg2) {
            field1320 = null;
        }
        field1322++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([Lir;Lza;[[[II)V", line = 604)
    public final void method555(class251[] arg0, class491 arg1, int[][][] arg2, int arg3) {
        field1337++;
        if (arg3 != 128) {
            method552((byte) -90);
        }
        if (!this.field1319) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field1331; var6++) {
                    for (int var7 = 0; var7 < this.field1339; var7++) {
                        if ((class192.field2982[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class192.field2982[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method1700((byte) -23, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field1321; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field1319) {
                if (class71.field1234) {
                    var10 |= 0x2;
                }
                if (class448.field6684) {
                    var11 |= 0x8;
                }
                if (class177.field2810 != 0) {
                    var10 |= 0x1;
                    if (class396.field6054 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class71.field1234) {
                var11 |= 0x7;
            }
            if (!class527.field7767) {
                var11 |= 0x20;
            }
            int[][] var12 = arg2 == null || var9 >= arg2.length ? this.field1348[var9] : arg2[var9];
            class516.method3047(var9, arg1.method814(this.field1331, this.field1339, this.field1348[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILia;III[Lir;III)V", line = 707)
    public final void method556(int arg0, int arg1, class23 arg2, int arg3, int arg4, int arg5, class251[] arg6, int arg7, int arg8, int arg9) {
        field1335++;
        int var11 = (arg0 & 0x7) * 8;
        if (!this.field1319) {
            class251 var12 = arg6[arg9];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class339.method2144(true, var14 & 0x7, arg8, var13 & 0x7) + arg7;
                    int var16 = arg3 + class396.method2477(arg8, var13 & 0x7, var14 & 0x7, (byte) 88);
                    if (var15 > 0 && var15 < this.field1331 - 1 && var16 > 0 && var16 < this.field1339 - 1) {
                        var12.method1705(var15, var16, -2097153);
                    }
                }
            }
        }
        int var17 = (arg4 & 0x7) * 8;
        int var18 = (arg0 & 0xFFFFFFF8) << 3;
        int var19 = arg4 & 0x1FFFFFF8 << 3;
        int var20 = arg5;
        byte var21 = 0;
        if (arg8 == 1) {
            var21 = 1;
        } else if (arg8 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg8 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field1321; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 == var22 && var11 <= var23 && var23 <= var11 + 8 && var17 <= var24 && var24 <= (var17 + 8)) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var17 + 8) == var24) {
                            if (arg8 == 0) {
                                var25 = arg7 + var23 - var11;
                                var26 = var24 + arg3 - var17;
                            } else if (arg8 == 1) {
                                var26 = var11 + arg3 + 8 - var23;
                                var25 = arg7 + var24 - var17;
                            } else if (arg8 == 2) {
                                var26 = var17 + arg3 + 8 - var24;
                                var25 = var11 + arg7 + 8 - var23;
                            } else {
                                var26 = arg3 + var23 - var11;
                                var25 = var17 - (var24 - (arg7 + 8));
                            }
                            this.method560(var26, 1, arg9, 0, var18 + var23, var25, arg2, true, var19 + var24, 0, 0);
                        } else {
                            var25 = arg7 + class339.method2144(true, var24 & 0x7, arg8, var23 & 0x7);
                            var26 = class396.method2477(arg8, var23 & 0x7, var24 & 0x7, (byte) 88) + arg3;
                            this.method560(var26, arg5 + 1, arg9, var21, var18 + var23, var25, arg2, false, var19 + var24, var20, arg8);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var29 = var23 == 63 ? 64 : var23;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg8 == 0) {
                                    var31 = var29 - (var11 - arg7);
                                    var32 = arg3 + var30 - var17;
                                } else if (arg8 == 1) {
                                    var31 = arg7 + var30 - var17;
                                    var32 = var11 + arg3 + 8 - var29;
                                } else if (arg8 == 2) {
                                    var31 = var11 + arg7 + 8 - var29;
                                    var32 = arg3 + var17 + 8 - var30;
                                } else {
                                    var32 = arg3 - (var11 - var29);
                                    var31 = var17 + arg7 + 8 - var30;
                                }
                                if (var31 >= 0 && this.field1331 > var31 && var32 >= 0 && this.field1339 > var32) {
                                    this.field1348[arg9][var31][var32] = this.field1348[arg9][var20 + var25][var26 + var21];
                                }
                            }
                        }
                    } else {
                        this.method560(-1, 1, 0, 0, 0, -1, arg2, false, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lrl;[[BII[ZLza;Lfv;IIII[[BB[[B)V", line = 908)
    private final void method557(class479 arg0, byte[][] arg1, int arg2, int arg3, boolean[] arg4, class491 arg5, class471 arg6, int arg7, int arg8, int arg9, int arg10, byte[][] arg11, byte arg12, byte[][] arg13) {
        if (arg12 != 63) {
            this.field1339 = 39;
        }
        field1343++;
        boolean[] var15 = arg6 != null && arg6.field6980 ? class192.field2990[arg10] : class207.field3268[arg10];
        if (arg8 > 0) {
            if (arg3 > 0) {
                int var16 = arg1[arg3 - 1][arg8 - 1] & 0xFF;
                if (var16 > 0) {
                    class471 var17 = this.field1325.method2780(var16 - 1, (byte) -48);
                    if (var17.field6972 != -1 && var17.field6980) {
                        byte var18 = arg13[arg3 - 1][arg8 - 1];
                        int var19 = arg11[arg3 - 1][arg8 - 1] * 2 + 4 & 0x7;
                        int var20 = class201.method1327(var17, arg5, -1);
                        if (class99.field1647[var18][var19]) {
                            class451.field6722[0] = var17.field6972;
                            class285.field4675[0] = var20;
                            class350.field5470[0] = arg5.method831() ? var17.field6986 : var17.field6978;
                            class465.field6911[0] = var17.field6982;
                            class536.field7875[0] = var17.field6991;
                            class350.field5474[0] = 256;
                        }
                    }
                }
            }
            if (arg2 - 1 > arg3) {
                int var21 = arg1[arg3 + 1][arg8 - 1] & 0xFF;
                if (var21 > 0) {
                    class471 var22 = this.field1325.method2780(var21 - 1, (byte) -48);
                    if (var22.field6972 != -1 && var22.field6980) {
                        byte var23 = arg13[arg3 + 1][arg8 - 1];
                        int var24 = (arg11[arg3 + 1][arg8 - 1] * 2) + 6 & 0x7;
                        int var25 = class201.method1327(var22, arg5, -1);
                        if (class99.field1647[var23][var24]) {
                            class451.field6722[2] = var22.field6972;
                            class285.field4675[2] = var25;
                            class350.field5470[2] = arg5.method831() ? var22.field6986 : var22.field6978;
                            class465.field6911[2] = var22.field6982;
                            class536.field7875[2] = var22.field6991;
                            class350.field5474[2] = 512;
                        }
                    }
                }
            }
        }
        if ((arg7 - 1) > arg8) {
            if (arg3 > 0) {
                int var26 = arg1[arg3 - 1][arg8 + 1] & 0xFF;
                if (var26 > 0) {
                    class471 var27 = this.field1325.method2780(var26 - 1, (byte) -48);
                    if (var27.field6972 != -1 && var27.field6980) {
                        byte var28 = arg13[arg3 - 1][arg8 + 1];
                        int var29 = (arg11[arg3 - 1][arg8 + 1] * 2) + 2 & 0x7;
                        int var30 = class201.method1327(var27, arg5, arg12 - 64);
                        if (class99.field1647[var28][var29]) {
                            class451.field6722[6] = var27.field6972;
                            class285.field4675[6] = var30;
                            class350.field5470[6] = arg5.method831() ? var27.field6986 : var27.field6978;
                            class465.field6911[6] = var27.field6982;
                            class536.field7875[6] = var27.field6991;
                            class350.field5474[6] = 64;
                        }
                    }
                }
            }
            if (arg3 < (arg2 - 1)) {
                int var31 = arg1[arg3 + 1][arg8 + 1] & 0xFF;
                if (var31 > 0) {
                    class471 var32 = this.field1325.method2780(var31 - 1, (byte) -48);
                    if (var32.field6972 != -1 && var32.field6980) {
                        byte var33 = arg13[arg3 + 1][arg8 + 1];
                        int var34 = -(-(arg11[arg3 + 1][arg8 + 1] * 2)) & 0x7;
                        int var35 = class201.method1327(var32, arg5, arg12 ^ 0xFFFFFFC0);
                        if (class99.field1647[var33][var34]) {
                            class451.field6722[4] = var32.field6972;
                            class285.field4675[4] = var35;
                            class350.field5470[4] = arg5.method831() ? var32.field6986 : var32.field6978;
                            class465.field6911[4] = var32.field6982;
                            class536.field7875[4] = var32.field6991;
                            class350.field5474[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg8 > 0) {
            int var36 = arg1[arg3][arg8 - 1] & 0xFF;
            if (var36 > 0) {
                class471 var37 = this.field1325.method2780(var36 - 1, (byte) -48);
                if (var37.field6972 != -1) {
                    byte var38 = arg13[arg3][arg8 - 1];
                    byte var39 = arg11[arg3][arg8 - 1];
                    if (var37.field6980) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class201.method1327(var37, arg5, -1);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class99.field1647[var38][var41] && class536.field7875[var40] <= var37.field6991) {
                                class451.field6722[var40] = var37.field6972;
                                class285.field4675[var40] = var42;
                                class350.field5470[var40] = arg5.method831() ? var37.field6986 : var37.field6978;
                                class465.field6911[var40] = var37.field6982;
                                if (class536.field7875[var40] == var37.field6991) {
                                    class350.field5474[var40] = class338.method2141(class350.field5474[var40], 32);
                                } else {
                                    class350.field5474[var40] = 32;
                                }
                                class536.field7875[var40] = var37.field6991;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg9 & 0x3]) {
                            arg4[0] = class192.field2990[var38][class344.method2224(3, var39 + 2)];
                        }
                    } else if (!var15[arg9 & 0x3]) {
                        arg4[0] = class207.field3268[var38][class344.method2224(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg7 - 1 > arg8) {
            int var44 = arg1[arg3][arg8 + 1] & 0xFF;
            if (var44 > 0) {
                class471 var45 = this.field1325.method2780(var44 - 1, (byte) -48);
                if (var45.field6972 != -1) {
                    byte var46 = arg13[arg3][arg8 + 1];
                    byte var47 = arg11[arg3][arg8 + 1];
                    if (var45.field6980) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class201.method1327(var45, arg5, -1);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class99.field1647[var46][var49] && var45.field6991 >= class536.field7875[var48]) {
                                class451.field6722[var48] = var45.field6972;
                                class285.field4675[var48] = var50;
                                class350.field5470[var48] = arg5.method831() ? var45.field6986 : var45.field6978;
                                class465.field6911[var48] = var45.field6982;
                                if (class536.field7875[var48] == var45.field6991) {
                                    class350.field5474[var48] = class338.method2141(class350.field5474[var48], 16);
                                } else {
                                    class350.field5474[var48] = 16;
                                }
                                class536.field7875[var48] = var45.field6991;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg9 + 2 & 0x3]) {
                            arg4[2] = class192.field2990[var46][class344.method2224(3, var47)];
                        }
                    } else if (!var15[arg9 + 2 & 0x3]) {
                        arg4[2] = class207.field3268[var46][class344.method2224(-(-var47), 3)];
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var52 = arg1[arg3 - 1][arg8] & 0xFF;
            if (var52 > 0) {
                class471 var53 = this.field1325.method2780(var52 - 1, (byte) -48);
                if (var53.field6972 != -1) {
                    byte var54 = arg13[arg3 - 1][arg8];
                    byte var55 = arg11[arg3 - 1][arg8];
                    if (var53.field6980) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class201.method1327(var53, arg5, -1);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class99.field1647[var54][var57] && var53.field6991 >= class536.field7875[var56]) {
                                class451.field6722[var56] = var53.field6972;
                                class285.field4675[var56] = var58;
                                class350.field5470[var56] = arg5.method831() ? var53.field6986 : var53.field6978;
                                class465.field6911[var56] = var53.field6982;
                                if (class536.field7875[var56] == var53.field6991) {
                                    class350.field5474[var56] = class338.method2141(class350.field5474[var56], 8);
                                } else {
                                    class350.field5474[var56] = 8;
                                }
                                class536.field7875[var56] = var53.field6991;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg9 + 3 & 0x3]) {
                            arg4[3] = class192.field2990[var54][class344.method2224(var55 + 1, 3)];
                        }
                    } else if (!var15[arg9 + 3 & 0x3]) {
                        arg4[3] = class207.field3268[var54][class344.method2224(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg2 - 1 > arg3) {
            int var60 = arg1[arg3 + 1][arg8] & 0xFF;
            if (var60 > 0) {
                class471 var61 = this.field1325.method2780(var60 - 1, (byte) -48);
                if (var61.field6972 != -1) {
                    byte var62 = arg13[arg3 + 1][arg8];
                    byte var63 = arg11[arg3 + 1][arg8];
                    if (var61.field6980) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class201.method1327(var61, arg5, -1);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class99.field1647[var62][var65] && class536.field7875[var64] <= var61.field6991) {
                                class451.field6722[var64] = var61.field6972;
                                class285.field4675[var64] = var66;
                                class350.field5470[var64] = arg5.method831() ? var61.field6986 : var61.field6978;
                                class465.field6911[var64] = var61.field6982;
                                if (class536.field7875[var64] == var61.field6991) {
                                    class350.field5474[var64] = class338.method2141(class350.field5474[var64], 4);
                                } else {
                                    class350.field5474[var64] = 4;
                                }
                                class536.field7875[var64] = var61.field6991;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg9 + 1 & 0x3]) {
                            arg4[1] = class192.field2990[var62][class344.method2224(3, var63 + 3)];
                        }
                    } else if (!var15[arg9 + 1 & 0x3]) {
                        arg4[1] = class207.field3268[var62][class344.method2224(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg6 == null) {
            return;
        }
        int var68 = class201.method1327(arg6, arg5, -1);
        if (!arg6.field6980) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg9 * 2) & 0x7;
            if (class99.field1647[arg10][var69] && arg6.field6991 >= class536.field7875[var70]) {
                class451.field6722[var70] = arg6.field6972;
                class285.field4675[var70] = var68;
                class350.field5470[var70] = arg5.method831() ? arg6.field6986 : arg6.field6978;
                class465.field6911[var70] = arg6.field6982;
                if (class536.field7875[var70] == arg6.field6991) {
                    class350.field5474[var70] = class338.method2141(class350.field5474[var70], 2);
                } else {
                    class350.field5474[var70] = 2;
                }
                class536.field7875[var70] = arg6.field6991;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI[Lir;ILia;II)V", line = 1381)
    public final void method558(byte arg0, int arg1, class251[] arg2, int arg3, class23 arg4, int arg5, int arg6) {
        if (!this.field1319) {
            for (int var8 = 0; var8 < 4; var8++) {
                class251 var9 = arg2[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg5 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && var12 < this.field1331 && var13 >= 0 && this.field1339 > var13) {
                            var9.method1705(var12, var13, -2097153);
                        }
                    }
                }
            }
        }
        field1332++;
        int var14 = arg6 + arg5;
        int var15 = arg1 + arg3;
        for (int var16 = 0; var16 < this.field1321; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method560(arg3 + var18, 1, var16, 0, var14 + var17, arg5 + var17, arg4, false, var15 + var18, 0, 0);
                }
            }
        }
        if (arg0 >= -95) {
            method559(66);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 1457)
    public static final void method559(int arg0) {
        class533.field7842.method910(((float) class510.field7403.field5108 * 0.1F + 0.7F) * 1.1523438F);
        field1323++;
        class533.field7842.method859(class506.field7373, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class533.field7842.method847(class126.field2185, arg0, 256);
        class533.field7842.method894(class65.field975);
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIZLuo;Lot;)V", line = 2826)
    public class77(int arg0, int arg1, int arg2, boolean arg3, class468 arg4, class500 arg5) {
        this.field1321 = arg0;
        this.field1319 = arg3;
        this.field1339 = arg2;
        this.field1325 = arg4;
        this.field1324 = arg5;
        this.field1331 = arg1;
        this.field1346 = new byte[this.field1321][this.field1331][this.field1339];
        this.field1330 = new byte[this.field1321][this.field1331 + 1][this.field1339 + 1];
        this.field1348 = new int[this.field1321][this.field1331 + 1][this.field1339 + 1];
        this.field1341 = new byte[this.field1321][this.field1331][this.field1339];
        this.field1336 = new byte[this.field1321][this.field1331][this.field1339];
        this.field1345 = new byte[this.field1321][this.field1331][this.field1339];
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIILia;ZIII)V", line = 1471)
    private final void method560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class23 arg6, boolean arg7, int arg8, int arg9, int arg10) {
        if (arg10 == 1) {
            arg3 = 1;
        } else if (arg10 == 2) {
            arg9 = 1;
            arg3 = 1;
        } else if (arg10 == 3) {
            arg9 = 1;
        }
        if (arg1 != 1) {
            this.field1347 = null;
        }
        field1318++;
        if (arg5 < 0 || arg5 >= this.field1331 || arg0 < 0 || arg0 >= this.field1339) {
            while (true) {
                int var14 = arg6.method126((byte) -77);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg6.method126((byte) -81);
                    return;
                }
                if (var14 <= 49) {
                    arg6.method126((byte) -87);
                }
            }
        }
        if (!this.field1319 && !arg7) {
            class192.field2982[arg2][arg5][arg0] = 0;
        }
        while (true) {
            int var12 = arg6.method126((byte) -71);
            if (var12 == 0) {
                if (this.field1319) {
                    this.field1348[0][arg5 + arg9][arg0 + arg3] = 0;
                    return;
                } else if (arg2 == 0) {
                    this.field1348[0][arg5 + arg9][arg0 + arg3] = -class117.method938(-11, arg4 + 932731, 556238 - -arg8) * 8 << 0;
                    return;
                } else {
                    this.field1348[arg2][arg5 + arg9][arg0 + arg3] = this.field1348[arg2 - 1][arg5 + arg9][arg0 + arg3] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg6.method126((byte) -122);
                if (!this.field1319) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg2 != 0) {
                        this.field1348[arg2][arg5 + arg9][arg0 + arg3] = this.field1348[arg2 - 1][arg5 + arg9][arg0 + arg3] - (var13 * 8 << 0);
                        return;
                    }
                    this.field1348[0][arg5 + arg9][arg0 + arg3] = -var13 * 8 << 0;
                    return;
                }
                this.field1348[0][arg5 + arg9][arg0 + arg3] = var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg7) {
                    arg6.method126((byte) -101);
                } else {
                    this.field1346[arg2][arg5][arg0] = arg6.method167(arg1 - 3);
                    this.field1341[arg2][arg5][arg0] = (byte) ((var12 - 2) / 4);
                    this.field1345[arg2][arg5][arg0] = (byte) class344.method2224(var12 + arg10 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field1319 && !arg7) {
                    class192.field2982[arg2][arg5][arg0] = (byte) (var12 - 49);
                }
            } else if (!arg7) {
                this.field1336[arg2][arg5][arg0] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB[[I)V", line = 1596)
    public final void method561(int arg0, byte arg1, int[][] arg2) {
        field1329++;
        int[][] var4 = this.field1348[arg0];
        for (int var5 = 0; var5 < (this.field1331 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field1339 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
        if (arg1 != -7) {
            this.field1346 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lya;Lza;[[IBLya;Lya;I)V", line = 1633)
    private final void method562(class220 arg0, class491 arg1, int[][] arg2, byte arg3, class220 arg4, class220 arg5, int arg6) {
        field1316++;
        byte[][] var8 = this.field1341[arg6];
        if (arg3 <= 23) {
            method552((byte) -48);
        }
        byte[][] var9 = this.field1345[arg6];
        byte[][] var10 = this.field1336[arg6];
        byte[][] var11 = this.field1346[arg6];
        for (int var12 = 0; var12 < this.field1331; var12++) {
            int var13 = this.field1331 - 1 > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field1339; var14++) {
                int var15 = var14 >= this.field1339 - 1 ? var14 : var14 + 1;
                if (class431.field6462 == -1 || class5.method18(arg6, 110, var12, class431.field6462, var14)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class471 var26 = var21 == 0 ? null : this.field1325.method2780(var21 - 1, (byte) -48);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class479 var27 = var22 == 0 ? null : this.field1324.method2957((byte) 66, var22 - 1);
                        class471 var28 = var26;
                        if (var26 != null) {
                            if (var26.field6972 == -1 && var26.field6975 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field6980;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field1331 > var12 && var14 < this.field1339) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var35++;
                            } else {
                                var33--;
                                var35--;
                            }
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var32++;
                            } else {
                                var32--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var32++;
                                var36++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var35--;
                                var36--;
                            }
                            int var37 = var35 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg0.method1516(var12, var14) - arg0.method1516(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg0.method1516(var13, var14) - arg0.method1516(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class536.field7875[var39] = -1;
                            class350.field5474[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field6980 ? class192.field2990[var19] : class207.field3268[var19];
                        this.method557(var27, var11, this.field1331, var12, var18, arg1, var26, this.field1339, var14, var20, var19, var9, (byte) 63, var8);
                        boolean var41 = var26 != null && var26.field6975 != var26.field6972;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class536.field7875[var42] >= 0 && class451.field6722[var42] != class285.field4675[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class204.method1341(var18[1], class344.method2224(class350.field5474[2], class350.field5474[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class204.method1341(var18[3], class344.method2224(class350.field5474[6], class350.field5474[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class204.method1341(var18[0], class344.method2224(class350.field5474[0], class350.field5474[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class204.method1341(var18[2], class344.method2224(class350.field5474[4], class350.field5474[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var49 = class528.field7774[var19];
                            var48 = class9.field94[var19];
                            var47 = var26 == null ? 0 : class179.field2847[var19];
                            var46 = var27 == null ? 0 : class477.field7055[var19];
                            var45 = class70.field1211[var19];
                        } else if (var17) {
                            var44 = class403.field6130[var19];
                            var45 = class147.field2397[var19];
                            var46 = var27 == null ? 0 : class222.field3825[var19];
                            var47 = var26 == null ? 0 : class79.field1380[var19];
                            var48 = class127.field2186[var19];
                            var49 = class255.field4321[var19];
                        } else {
                            var48 = class417.field6317[var19];
                            var46 = var27 == null ? 0 : class519.field7668[var19];
                            var44 = class300.field4814[var19];
                            var45 = class463.field6885[var19];
                            var47 = var26 == null ? 0 : class451.field6739[var19];
                            var49 = class325.field5126[var19];
                        }
                        int var50 = var46 + var47;
                        if (var50 <= 0) {
                            class40.method300(arg6, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg5 == null ? null : new int[var53];
                            int[] var61 = arg5 == null && arg4 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field6972;
                                var63 = arg1.method831() ? var26.field6986 : var26.field6978;
                                var64 = var26.field6982;
                                int var65 = class201.method1327(var26, arg1, -1);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class304.field4862[0] = var45[var51];
                                        class304.field4862[1] = 1;
                                        class304.field4862[2] = var48[var51];
                                        class304.field4862[3] = 1;
                                        class304.field4862[4] = var49[var51];
                                        class304.field4862[5] = var48[var51];
                                        var98 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class304.field4862[0] = var45[var51];
                                        class304.field4862[1] = 5;
                                        class304.field4862[2] = var48[var51];
                                        class304.field4862[3] = 5;
                                        class304.field4862[4] = var49[var51];
                                        var98 = 6;
                                        class304.field4862[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class304.field4862[0] = var45[var51];
                                        class304.field4862[1] = 3;
                                        class304.field4862[2] = var48[var51];
                                        class304.field4862[3] = 3;
                                        class304.field4862[4] = var49[var51];
                                        class304.field4862[5] = var48[var51];
                                        var98 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class304.field4862[0] = var45[var51];
                                        class304.field4862[1] = 7;
                                        class304.field4862[2] = var48[var51];
                                        class304.field4862[3] = 7;
                                        class304.field4862[4] = var49[var51];
                                        class304.field4862[5] = var48[var51];
                                        var98 = 6;
                                    } else {
                                        class304.field4862[0] = var45[var51];
                                        class304.field4862[1] = var49[var51];
                                        var98 = 3;
                                        class304.field4862[2] = var48[var51];
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class304.field4862[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field1347[var100];
                                        int var103 = this.field1317[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = 128 - var102;
                                            var105 = var103;
                                        } else if (var20 == 2) {
                                            var105 = 128 - var102;
                                            var104 = 128 - var103;
                                        } else if (var20 == 3) {
                                            var105 = 128 - var103;
                                            var104 = var102;
                                        } else {
                                            var105 = var102;
                                            var104 = var103;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var104;
                                        if (var60 != null && class99.field1647[var19][var100]) {
                                            int var106 = (var12 << 7) + var105;
                                            int var107 = (var14 << 7) + var104;
                                            var60[var52] = arg5.method1517(var106, var107) - arg0.method1517(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class99.field1647[var19][var100]) {
                                                int var108 = (var12 << 7) + var105;
                                                int var109 = (var14 << 7) + var104;
                                                var61[var52] = arg0.method1517(var108, var109) - arg5.method1517(var108, var109);
                                            } else if (arg4 != null && !class375.field5832[var19][var100]) {
                                                int var110 = (var12 << 7) + var105;
                                                int var111 = (var14 << 7) + var104;
                                                var61[var52] = arg4.method1517(var110, var111) - arg0.method1517(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && class536.field7875[var101] > var26.field6991) {
                                            if (var54 != null) {
                                                var54[var52] = class285.field4675[var101];
                                            }
                                            var59[var52] = class465.field6911[var101];
                                            var58[var52] = class350.field5470[var101];
                                            var57[var52] = class451.field6722[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg1.method831() ? var26.field6986 : var26.field6978;
                                            var59[var52] = var26.field6982;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field1319 && arg6 == 0) {
                                    class480.method2828(var12, var14, var26.field6981, var26.field6969 * 8, var26.field6987);
                                }
                                if (var19 != 12 && var26.field6972 != -1 && var26.field6976) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class179.field2847[var19];
                            } else if (var17) {
                                var51 += class79.field1380[var19];
                            } else {
                                var51 += class451.field6739[var19];
                            }
                            if (var27 != null) {
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class479 var67 = this.field1324.method2957((byte) 110, var22 - 1);
                                class479 var68 = this.field1324.method2957((byte) 103, var23 - 1);
                                class479 var69 = this.field1324.method2957((byte) 84, var24 - 1);
                                class479 var70 = this.field1324.method2957((byte) 87, var25 - 1);
                                for (int var71 = 0; var71 < var46; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class304.field4862[0] = var45[var51];
                                        class304.field4862[1] = 1;
                                        class304.field4862[2] = var48[var51];
                                        class304.field4862[3] = 1;
                                        class304.field4862[4] = var49[var51];
                                        var73 = 6;
                                        class304.field4862[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class304.field4862[0] = var45[var51];
                                        class304.field4862[1] = 5;
                                        class304.field4862[2] = var48[var51];
                                        class304.field4862[3] = 5;
                                        class304.field4862[4] = var49[var51];
                                        class304.field4862[5] = var48[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class304.field4862[0] = var45[var51];
                                        class304.field4862[1] = 3;
                                        class304.field4862[2] = var48[var51];
                                        class304.field4862[3] = 3;
                                        class304.field4862[4] = var49[var51];
                                        class304.field4862[5] = var48[var51];
                                        var73 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class304.field4862[0] = var45[var51];
                                        class304.field4862[1] = 7;
                                        class304.field4862[2] = var48[var51];
                                        class304.field4862[3] = 7;
                                        class304.field4862[4] = var49[var51];
                                        var73 = 6;
                                        class304.field4862[5] = var48[var51];
                                    } else {
                                        class304.field4862[0] = var45[var51];
                                        class304.field4862[1] = var49[var51];
                                        class304.field4862[2] = var48[var51];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class304.field4862[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field1347[var75];
                                        int var78 = this.field1317[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 128 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var80 = 128 - var77;
                                            var79 = 128 - var78;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 128 - var78;
                                        } else {
                                            var79 = var78;
                                            var80 = var77;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class99.field1647[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg5.method1517(var81, var82) - arg0.method1517(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class99.field1647[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg0.method1517(var83, var84) - arg5.method1517(var83, var84);
                                            } else if (arg4 != null && !class375.field5832[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg4.method1517(var85, var86) - arg0.method1517(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class536.field7875[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class285.field4675[var76];
                                            }
                                            var59[var52] = class465.field6911[var76];
                                            var58[var52] = class350.field5470[var76];
                                            var57[var52] = class451.field6722[var76];
                                        } else {
                                            if (var17 && class99.field1647[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg2[var12][var14];
                                                var58[var52] = var67.field7064;
                                                var59[var52] = var67.field7071;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg2[var12][var15];
                                                var58[var52] = var68.field7064;
                                                var59[var52] = var68.field7071;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg2[var13][var15];
                                                var58[var52] = var69.field7064;
                                                var59[var52] = var69.field7071;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg2[var13][var14];
                                                var58[var52] = var70.field7064;
                                                var59[var52] = var70.field7071;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var79 >= 64) {
                                                        var58[var52] = var68.field7064;
                                                        var59[var52] = var68.field7071;
                                                    } else {
                                                        var58[var52] = var67.field7064;
                                                        var59[var52] = var67.field7071;
                                                    }
                                                } else if (var79 >= 64) {
                                                    var58[var52] = var69.field7064;
                                                    var59[var52] = var69.field7071;
                                                } else {
                                                    var58[var52] = var70.field7064;
                                                    var59[var52] = var70.field7071;
                                                }
                                                int var87 = class397.method2484(var80 << 7 >> 7, arg2[var12][var14], arg2[var13][var14], (byte) -120);
                                                int var88 = class397.method2484(var80 << 7 >> 7, arg2[var12][var15], arg2[var13][var15], (byte) -113);
                                                var57[var52] = class397.method2484(var79 << 7 >> 7, var87, var88, (byte) -109);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field7066) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg0.method1516(var12, var14);
                            int var90 = arg0.method1516(var13, var14);
                            int var91 = arg0.method1516(var13, var15);
                            int var92 = arg0.method1516(var12, var15);
                            if (arg6 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field6983) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field1330[arg6][var12][var14] = (byte) class338.method2141(this.field1330[arg6][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field1319) {
                                var94 = class214.method1432(var12, var14);
                                var95 = class327.method2059(var12, var14);
                                var96 = class204.method1338(var12, var14);
                            }
                            arg0.method1523(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class40.method300(arg6, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lza;Lya;[[IBILya;Lya;)V", line = 2494)
    private final void method563(class491 arg0, class220 arg1, int[][] arg2, byte arg3, int arg4, class220 arg5, class220 arg6) {
        for (int var8 = 0; var8 < this.field1331; var8++) {
            for (int var9 = 0; var9 < this.field1339; var9++) {
                if (class431.field6462 == -1 || class5.method18(arg4, -127, var8, class431.field6462, var9)) {
                    byte var10 = this.field1341[arg4][var8][var9];
                    byte var11 = this.field1345[arg4][var8][var9];
                    int var12 = this.field1346[arg4][var8][var9] & 0xFF;
                    int var13 = this.field1336[arg4][var8][var9] & 0xFF;
                    class471 var14 = var12 == 0 ? null : this.field1325.method2780(var12 - 1, (byte) -48);
                    class479 var15 = var13 == 0 ? null : this.field1324.method2957((byte) 78, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class179.field2847[var10];
                        var16 = var15 == null ? 0 : class477.field7055[var10];
                    } else if (var14 != null) {
                        var17 = class179.field2847[var10];
                    } else if (var15 != null) {
                        var16 = class179.field2847[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field6972 == -1 && var14.field6975 == -1 && var14.field6986 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg0.method831() ? var14.field6986 : var14.field6978;
                            if (class446.field6674) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field6982;
                                if (var14.field6972 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field6972;
                                }
                                if (var14.field6975 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field6975;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field1319 && arg4 == 0) {
                                class480.method2828(var8, var9, var14.field6981, var14.field6969 * 8, var14.field6987);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field7064;
                            if (class446.field6674) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field7071;
                                var20[var19] = arg2[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field1347.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg6 == null ? null : new int[var31];
                        int[] var35 = arg6 == null && arg1 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field1347[var36];
                            int var46 = this.field1317[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class99.field1647[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg6.method1517(var49, var50) - arg5.method1517(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg6 != null && !class99.field1647[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg5.method1517(var51, var52) - arg6.method1517(var51, var52);
                                } else if (arg1 != null && !class375.field5832[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg1.method1517(var53, var54) - arg5.method1517(var53, var54);
                                }
                            }
                        }
                        int var37 = arg5.method1516(var8, var9);
                        int var38 = arg5.method1516(var8 + 1, var9);
                        int var39 = arg5.method1516(var8 + 1, var9 + 1);
                        int var40 = arg5.method1516(var8, var9 + 1);
                        if (arg4 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field6983) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field1330[arg4][var8][var9] = (byte) class338.method2141(this.field1330[arg4][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field1319) {
                            var42 = class214.method1432(var8, var9);
                            var43 = class327.method2059(var8, var9);
                            var44 = class204.method1338(var8, var9);
                        }
                        arg5.method1520(var8, var9, var32, var34, var33, var35, class70.field1211[var10], class528.field7774[var10], class9.field94[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class40.method300(arg4, var8, var9);
                    }
                }
            }
        }
        field1334++;
        if (arg3 != 98) {
            field1340 = true;
        }
    }
}
