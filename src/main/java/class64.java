import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WMHCOPKE")
public class class64 {

    @OriginalMember(owner = "client!WMHCOPKE", name = "r", descriptor = "I")
    private int field1644 = -192;

    @OriginalMember(owner = "client!WMHCOPKE", name = "t", descriptor = "I")
    private int field1646 = -214;

    @OriginalMember(owner = "client!WMHCOPKE", name = "F", descriptor = "I")
    private int field1657 = -309;

    @OriginalMember(owner = "client!WMHCOPKE", name = "G", descriptor = "I")
    private int field1658 = -840;

    @OriginalMember(owner = "client!WMHCOPKE", name = "x", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "client!WMHCOPKE", name = "y", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "client!WMHCOPKE", name = "l", descriptor = "[[[I")
    private int[][][] field1638;

    @OriginalMember(owner = "client!WMHCOPKE", name = "s", descriptor = "[[[B")
    private byte[][][] field1645;

    @OriginalMember(owner = "client!WMHCOPKE", name = "g", descriptor = "[[[B")
    private byte[][][] field1633;

    @OriginalMember(owner = "client!WMHCOPKE", name = "D", descriptor = "[[[B")
    private byte[][][] field1655;

    @OriginalMember(owner = "client!WMHCOPKE", name = "o", descriptor = "[[[B")
    private byte[][][] field1641;

    @OriginalMember(owner = "client!WMHCOPKE", name = "j", descriptor = "[[[B")
    private byte[][][] field1636;

    @OriginalMember(owner = "client!WMHCOPKE", name = "m", descriptor = "[[[I")
    private int[][][] field1639;

    @OriginalMember(owner = "client!WMHCOPKE", name = "i", descriptor = "[[[B")
    private byte[][][] field1635;

    @OriginalMember(owner = "client!WMHCOPKE", name = "C", descriptor = "[[I")
    private int[][] field1654;

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "[I")
    private int[] field1627;

    @OriginalMember(owner = "client!WMHCOPKE", name = "b", descriptor = "[I")
    private int[] field1628;

    @OriginalMember(owner = "client!WMHCOPKE", name = "c", descriptor = "[I")
    private int[] field1629;

    @OriginalMember(owner = "client!WMHCOPKE", name = "d", descriptor = "[I")
    private int[] field1630;

    @OriginalMember(owner = "client!WMHCOPKE", name = "e", descriptor = "[I")
    private int[] field1631;

    @OriginalMember(owner = "client!WMHCOPKE", name = "f", descriptor = "[I")
    private static final int[] field1632 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!WMHCOPKE", name = "h", descriptor = "B")
    private static byte field1634 = -112;

    @OriginalMember(owner = "client!WMHCOPKE", name = "k", descriptor = "I")
    private static int field1637 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!WMHCOPKE", name = "n", descriptor = "B")
    private static byte field1640 = 4;

    @OriginalMember(owner = "client!WMHCOPKE", name = "q", descriptor = "[I")
    private static final int[] field1643 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!WMHCOPKE", name = "u", descriptor = "I")
    private static int field1647 = -302;

    @OriginalMember(owner = "client!WMHCOPKE", name = "v", descriptor = "I")
    public static int field1648 = 99;

    @OriginalMember(owner = "client!WMHCOPKE", name = "A", descriptor = "Z")
    public static boolean field1652 = true;

    @OriginalMember(owner = "client!WMHCOPKE", name = "B", descriptor = "[I")
    private static final int[] field1653 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!WMHCOPKE", name = "E", descriptor = "I")
    private static int field1656 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!WMHCOPKE", name = "H", descriptor = "[I")
    private static final int[] field1659 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!WMHCOPKE", name = "z", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!WMHCOPKE", name = "p", descriptor = "Z")
    private static boolean field1642;

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(II)I")
    private static final int method560(int arg0, int arg1) {
        int var2 = method569(arg0 + 45365, arg1 + 91923, 4) + (method569(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method569(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "([BZII)Z")
    public static final boolean method561(byte[] arg0, boolean arg1, int arg2, int arg3) {
        boolean var4 = true;
        class52 var5 = new class52(arg0, true);
        int var6 = -1;
        if (arg1) {
            throw new NullPointerException();
        }
        label52: while (true) {
            int var7 = var5.method475();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method475();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method461() >> 2;
                    int var15 = arg2 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class47 var17 = class47.method417(var6);
                        if (var14 != 22 || !field1652 || var17.field1290 || var17.field1269) {
                            var4 &= var17.method422(field1640);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method475();
                if (var10 == 0) {
                    break;
                }
                var5.method461();
            }
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(IIII)I")
    public int method562(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            field1642 = !field1642;
        }
        if ((this.field1645[arg3][arg2][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (this.field1645[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(I[LOXMJPDWD;I[BIII)V")
    public final void method563(int arg0, class41[] arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 + var13 > 0 && arg4 + var13 < 103 && arg5 + var14 > 0 && arg5 + var14 < 103) {
                        arg1[var8].field1193[arg4 + var13][arg5 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class52 var9 = new class52(arg3, true);
        if (arg2 != -39848) {
            return;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method564(var9, arg6, 0, arg0, 0, arg5 + var12, var10, arg4 + var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(LSVWJKJVI;IIIIIII)V")
    private final void method564(class52 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 0) {
            this.field1657 = 153;
        }
        if (arg7 < 0 || arg7 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var11 = arg0.method461();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg0.method461();
                    return;
                }
                if (var11 <= 49) {
                    arg0.method461();
                }
            }
        }
        this.field1645[arg6][arg7][arg5] = 0;
        while (true) {
            int var9 = arg0.method461();
            if (var9 == 0) {
                if (arg6 == 0) {
                    this.field1638[0][arg7][arg5] = -method560(arg7 + arg1 + 932731, arg5 + 556238 + arg3) * 8;
                    return;
                } else {
                    this.field1638[arg6][arg7][arg5] = this.field1638[arg6 - 1][arg7][arg5] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg0.method461();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg6 == 0) {
                    this.field1638[0][arg7][arg5] = -var10 * 8;
                    return;
                }
                this.field1638[arg6][arg7][arg5] = this.field1638[arg6 - 1][arg7][arg5] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1655[arg6][arg7][arg5] = arg0.method462();
                this.field1641[arg6][arg7][arg5] = (byte) ((var9 - 2) / 4);
                this.field1636[arg6][arg7][arg5] = (byte) (var9 + arg2 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1645[arg6][arg7][arg5] = (byte) (var9 - 49);
            } else {
                this.field1633[arg6][arg7][arg5] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "b", descriptor = "(II)I")
    private final int method565(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "c", descriptor = "(II)I")
    private static final int method566(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "d", descriptor = "(II)I")
    private static final int method567(int arg0, int arg1) {
        int var2 = method573(arg0 - 1, arg1 - 1) + method573(arg0 + 1, arg1 - 1) + method573(arg0 - 1, arg1 + 1) + method573(arg0 + 1, arg1 + 1);
        int var3 = method573(arg0 - 1, arg1) + method573(arg0 + 1, arg1) + method573(arg0, arg1 - 1) + method573(arg0, arg1 + 1);
        int var4 = method573(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(ZIII)V")
    public final void method568(boolean arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field1638[arg3][arg2 + var5][arg1 + var8] = 0;
            }
        }
        if (arg0) {
            return;
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field1638[arg3][arg2][arg1 + var6] = this.field1638[arg3][arg2 - 1][arg1 + var6];
            }
        }
        if (arg1 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1638[arg3][arg2 + var7][arg1] = this.field1638[arg3][arg2 + var7][arg1 - 1];
            }
        }
        if (arg2 > 0 && this.field1638[arg3][arg2 - 1][arg1] != 0) {
            this.field1638[arg3][arg2][arg1] = this.field1638[arg3][arg2 - 1][arg1];
        } else if (arg1 > 0 && this.field1638[arg3][arg2][arg1 - 1] != 0) {
            this.field1638[arg3][arg2][arg1] = this.field1638[arg3][arg2][arg1 - 1];
        } else if (arg2 > 0 && arg1 > 0 && this.field1638[arg3][arg2 - 1][arg1 - 1] != 0) {
            this.field1638[arg3][arg2][arg1] = this.field1638[arg3][arg2 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(III)I")
    private static final int method569(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method567(var3, var5);
        int var8 = method567(var3 + 1, var5);
        int var9 = method567(var3, var5 + 1);
        int var10 = method567(var3 + 1, var5 + 1);
        int var11 = method571(var7, var8, var4, arg2);
        int var12 = method571(var9, var10, var4, arg2);
        return method571(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "b", descriptor = "(III)Z")
    public static final boolean method570(int arg0, int arg1, int arg2) {
        class47 var3 = class47.method417(arg0);
        if (arg2 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method421((byte) -31, arg1);
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "b", descriptor = "(IIII)I")
    private static final int method571(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class48.field1330[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(LSVWJKJVI;LIHBKBLZU;I)V")
    public static final void method572(class52 arg0, class16 arg1, int arg2) {
        if (arg2 <= 0) {
            field1642 = !field1642;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg0.method475();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class47 var5 = class47.method417(var3);
            var5.method415(607, arg1);
            while (true) {
                int var6 = arg0.method475();
                if (var6 == 0) {
                    break;
                }
                arg0.method461();
            }
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "e", descriptor = "(II)I")
    private static final int method573(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(LGXHGUSOD;[LOXMJPDWD;I)V")
    public final void method574(class13 arg0, class41[] arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1645[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1645[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method383(var111, var110, -56);
                        }
                    }
                }
            }
        }
        field1656 += (int) (Math.random() * 5.0D) - 2;
        if (field1656 < -8) {
            field1656 = -8;
        }
        if (field1656 > 8) {
            field1656 = 8;
        }
        field1637 += (int) (Math.random() * 5.0D) - 2;
        if (field1637 < -16) {
            field1637 = -16;
        }
        if (field1637 > 16) {
            field1637 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1635[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1650 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1649 - 1; var101++) {
                    int var102 = this.field1638[var5][var101 + 1][var56] - this.field1638[var5][var101 - 1][var56];
                    int var103 = this.field1638[var5][var101][var56 + 1] - this.field1638[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1654[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1650; var57++) {
                this.field1627[var57] = 0;
                this.field1628[var57] = 0;
                this.field1629[var57] = 0;
                this.field1630[var57] = 0;
                this.field1631[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1649 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1650; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1649) {
                        int var96 = this.field1633[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class9 var97 = class9.field594[var96 - 1];
                            this.field1627[var61] += var97.field603;
                            this.field1628[var61] += var97.field601;
                            this.field1629[var61] += var97.field602;
                            this.field1630[var61] += var97.field604;
                            var10002 = this.field1631[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1649) {
                        int var99 = this.field1633[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class9 var100 = class9.field594[var99 - 1];
                            this.field1627[var61] -= var100.field603;
                            this.field1628[var61] -= var100.field601;
                            this.field1629[var61] -= var100.field602;
                            this.field1630[var61] -= var100.field604;
                            var10002 = this.field1631[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1649 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1650 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1650) {
                            var62 += this.field1627[var68];
                            var63 += this.field1628[var68];
                            var64 += this.field1629[var68];
                            var65 += this.field1630[var68];
                            var66 += this.field1631[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1650) {
                            var62 -= this.field1627[var69];
                            var63 -= this.field1628[var69];
                            var64 -= this.field1629[var69];
                            var65 -= this.field1630[var69];
                            var66 -= this.field1631[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1650 - 1 && (!field1652 || (this.field1645[0][var58][var67] & 0x2) != 0 || (this.field1645[var5][var58][var67] & 0x10) == 0 && this.method562(var67, -572, var58, var5) == field1651)) {
                            if (var5 < field1648) {
                                field1648 = var5;
                            }
                            int var70 = this.field1633[var5][var58][var67] & 0xFF;
                            int var71 = this.field1655[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1638[var5][var58][var67];
                                int var73 = this.field1638[var5][var58 + 1][var67];
                                int var74 = this.field1638[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1638[var5][var58][var67 + 1];
                                int var76 = this.field1654[var58][var67];
                                int var77 = this.field1654[var58 + 1][var67];
                                int var78 = this.field1654[var58 + 1][var67 + 1];
                                int var79 = this.field1654[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method576(var82, var83, var84);
                                    int var85 = field1656 + var82 & 0xFF;
                                    int var86 = field1637 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method576(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1641[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class9.field594[var71 - 1].field599) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1639[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class48.field1341[method566(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method194(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method566(var80, var76), method566(var80, var77), method566(var80, var78), method566(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1641[var5][var58][var67] + 1;
                                    byte var90 = this.field1636[var5][var58][var67];
                                    class9 var91 = class9.field594[var71 - 1];
                                    int var92 = var91.field597;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class48.method430(var92, false);
                                        var94 = -1;
                                    } else if (var91.field596 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class48.field1341[this.method565(var91.field605, 96)];
                                    } else {
                                        var94 = this.method576(var91.field600, var91.field601, var91.field602);
                                        var93 = class48.field1341[this.method565(var91.field605, 96)];
                                    }
                                    arg0.method194(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method566(var80, var76), method566(var80, var77), method566(var80, var78), method566(var80, var79), this.method565(var94, var76), this.method565(var94, var77), this.method565(var94, var78), this.method565(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1650 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1649 - 1; var60++) {
                    arg0.method193(var5, var60, var59, this.method562(var59, -572, var60, var5));
                }
            }
        }
        arg0.method220(-50, -10, 754, -50);
        if (arg2 < 9 || arg2 > 9) {
            return;
        }
        for (int var6 = 0; var6 < this.field1649; var6++) {
            for (int var47 = 0; var47 < this.field1650; var47++) {
                if ((this.field1645[1][var6][var47] & 0x2) == 2) {
                    arg0.method191(var6, var47, -36016);
                }
            }
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field1650; var12++) {
                    for (int var13 = 0; var13 <= this.field1649; var13++) {
                        if ((this.field1639[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1639[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1650 && (this.field1639[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1639[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1639[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1638[var17][var13][var14] - var21;
                                int var23 = this.field1638[var16][var13][var14];
                                class13.method192(var22, var15 * 128 + 128, false, var13 * 128, 1, var13 * 128, var14 * 128, var23, var10);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1639[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1639[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1639[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1649 && (this.field1639[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1639[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1639[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1638[var29][var26][var12] - var33;
                                int var35 = this.field1638[var28][var26][var12];
                                class13.method192(var34, var12 * 128, false, var27 * 128 + 128, 2, var26 * 128, var12 * 128, var35, var10);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1639[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1639[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1639[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1650 && (this.field1639[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1639[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field1649) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1639[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field1638[var11][var38][var40];
                                class13.method192(var44, var41 * 128 + 128, false, var39 * 128 + 128, 4, var38 * 128, var40 * 128, var44, var10);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1639[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(I[[[IIZILOXMJPDWD;LGXHGUSOD;IIII)V")
    public static final void method575(int arg0, int[][][] arg1, int arg2, boolean arg3, int arg4, class41 arg5, class13 arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg1[arg8][arg0][arg10];
        int var12 = arg1[arg8][arg0 + 1][arg10];
        int var13 = arg1[arg8][arg0 + 1][arg10 + 1];
        int var14 = arg1[arg8][arg0][arg10 + 1];
        if (!arg3) {
            field1647 = -108;
        }
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class47 var16 = class47.method417(arg2);
        int var17 = (arg2 << 14) + (arg10 << 7) + arg0 + 1073741824;
        if (!var16.field1290) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg9 << 6) + arg4);
        if (arg4 == 22) {
            class21 var19;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var19 = var16.method414(22, arg9, var11, var12, var13, var14, -1);
            } else {
                var19 = new class17(var13, var12, arg2, var16.field1314, -371, 22, arg9, true, var11, var14);
            }
            arg6.method195(var19, arg0, arg10, var17, (byte) -58, var15, arg7, var18);
            if (var16.field1270 && var16.field1290) {
                arg5.method383(arg10, arg0, -56);
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class21 var39;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var39 = var16.method414(10, arg9, var11, var12, var13, var14, -1);
            } else {
                var39 = new class17(var13, var12, arg2, var16.field1314, -371, 10, arg9, true, var11, var14);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg4 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg9 == 1 || arg9 == 3) {
                    var41 = var16.field1297;
                    var42 = var16.field1289;
                } else {
                    var41 = var16.field1289;
                    var42 = var16.field1297;
                }
                arg6.method199(arg7, var17, field1634, var39, var41, var15, var18, arg10, var42, arg0, var40);
            }
            if (var16.field1270) {
                arg5.method382(arg10, 6, var16.field1297, var16.field1289, arg9, var16.field1278, arg0);
            }
        } else if (arg4 >= 12) {
            class21 var20;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var20 = var16.method414(arg4, arg9, var11, var12, var13, var14, -1);
            } else {
                var20 = new class17(var13, var12, arg2, var16.field1314, -371, arg4, arg9, true, var11, var14);
            }
            arg6.method199(arg7, var17, field1634, var20, 1, var15, var18, arg10, 1, arg0, 0);
            if (var16.field1270) {
                arg5.method382(arg10, 6, var16.field1297, var16.field1289, arg9, var16.field1278, arg0);
            }
        } else if (arg4 == 0) {
            class21 var21;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var21 = var16.method414(0, arg9, var11, var12, var13, var14, -1);
            } else {
                var21 = new class17(var13, var12, arg2, var16.field1314, -371, 0, arg9, true, var11, var14);
            }
            arg6.method197(arg0, 0, null, var17, var21, field1643[arg9], -33711, var18, arg10, var15, arg7);
            if (var16.field1270) {
                arg5.method381(arg4, 741, arg10, var16.field1278, arg9, arg0);
            }
        } else if (arg4 == 1) {
            class21 var22;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var22 = var16.method414(1, arg9, var11, var12, var13, var14, -1);
            } else {
                var22 = new class17(var13, var12, arg2, var16.field1314, -371, 1, arg9, true, var11, var14);
            }
            arg6.method197(arg0, 0, null, var17, var22, field1632[arg9], -33711, var18, arg10, var15, arg7);
            if (var16.field1270) {
                arg5.method381(arg4, 741, arg10, var16.field1278, arg9, arg0);
            }
        } else if (arg4 == 2) {
            int var23 = arg9 + 1 & 0x3;
            class21 var24;
            class21 var25;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var24 = var16.method414(2, arg9 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method414(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class17(var13, var12, arg2, var16.field1314, -371, 2, arg9 + 4, true, var11, var14);
                var25 = new class17(var13, var12, arg2, var16.field1314, -371, 2, var23, true, var11, var14);
            }
            arg6.method197(arg0, field1643[var23], var25, var17, var24, field1643[arg9], -33711, var18, arg10, var15, arg7);
            if (var16.field1270) {
                arg5.method381(arg4, 741, arg10, var16.field1278, arg9, arg0);
            }
        } else if (arg4 == 3) {
            class21 var26;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var26 = var16.method414(3, arg9, var11, var12, var13, var14, -1);
            } else {
                var26 = new class17(var13, var12, arg2, var16.field1314, -371, 3, arg9, true, var11, var14);
            }
            arg6.method197(arg0, 0, null, var17, var26, field1632[arg9], -33711, var18, arg10, var15, arg7);
            if (var16.field1270) {
                arg5.method381(arg4, 741, arg10, var16.field1278, arg9, arg0);
            }
        } else if (arg4 == 9) {
            class21 var27;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var27 = var16.method414(arg4, arg9, var11, var12, var13, var14, -1);
            } else {
                var27 = new class17(var13, var12, arg2, var16.field1314, -371, arg4, arg9, true, var11, var14);
            }
            arg6.method199(arg7, var17, field1634, var27, 1, var15, var18, arg10, 1, arg0, 0);
            if (var16.field1270) {
                arg5.method382(arg10, 6, var16.field1297, var16.field1289, arg9, var16.field1278, arg0);
            }
        } else {
            if (var16.field1300) {
                if (arg9 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg9 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg9 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg4 == 4) {
                class21 var32;
                if (var16.field1314 == -1 && var16.field1285 == null) {
                    var32 = var16.method414(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class17(var13, var12, arg2, var16.field1314, -371, 4, 0, true, var11, var14);
                }
                arg6.method198(arg7, 0, var32, var17, field1643[arg9], 0, var18, 450, arg0, arg9 * 512, var15, arg10);
            } else if (arg4 == 5) {
                int var33 = 16;
                int var34 = arg6.method215(arg7, arg0, arg10);
                if (var34 > 0) {
                    var33 = class47.method417(var34 >> 14 & 0x7FFF).field1313;
                }
                class21 var35;
                if (var16.field1314 == -1 && var16.field1285 == null) {
                    var35 = var16.method414(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class17(var13, var12, arg2, var16.field1314, -371, 4, 0, true, var11, var14);
                }
                arg6.method198(arg7, field1659[arg9] * var33, var35, var17, field1643[arg9], field1653[arg9] * var33, var18, 450, arg0, arg9 * 512, var15, arg10);
            } else if (arg4 == 6) {
                class21 var36;
                if (var16.field1314 == -1 && var16.field1285 == null) {
                    var36 = var16.method414(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class17(var13, var12, arg2, var16.field1314, -371, 4, 0, true, var11, var14);
                }
                arg6.method198(arg7, 0, var36, var17, 256, 0, var18, 450, arg0, arg9, var15, arg10);
            } else if (arg4 == 7) {
                class21 var37;
                if (var16.field1314 == -1 && var16.field1285 == null) {
                    var37 = var16.method414(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class17(var13, var12, arg2, var16.field1314, -371, 4, 0, true, var11, var14);
                }
                arg6.method198(arg7, 0, var37, var17, 512, 0, var18, 450, arg0, arg9, var15, arg10);
            } else if (arg4 == 8) {
                class21 var38;
                if (var16.field1314 == -1 && var16.field1285 == null) {
                    var38 = var16.method414(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class17(var13, var12, arg2, var16.field1314, -371, 4, 0, true, var11, var14);
                }
                arg6.method198(arg7, 0, var38, var17, 768, 0, var18, 450, arg0, arg9, var15, arg10);
            }
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "c", descriptor = "(III)I")
    private final int method576(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(IIILOXMJPDWD;IILGXHGUSOD;II)V")
    private final void method577(int arg0, int arg1, int arg2, class41 arg3, int arg4, int arg5, class13 arg6, int arg7, int arg8) {
        if (field1652 && (this.field1645[0][arg8][arg0] & 0x2) == 0) {
            if ((this.field1645[arg2][arg8][arg0] & 0x10) != 0) {
                return;
            }
            if (this.method562(arg0, -572, arg8, arg2) != field1651) {
                return;
            }
        }
        if (arg2 < field1648) {
            field1648 = arg2;
        }
        int var10 = this.field1638[arg2][arg8][arg0];
        int var11 = this.field1638[arg2][arg8 + 1][arg0];
        int var12 = this.field1638[arg2][arg8 + 1][arg0 + 1];
        int var13 = this.field1638[arg2][arg8][arg0 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        if (arg7 >= 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        class47 var16 = class47.method417(arg4);
        int var17 = (arg4 << 14) + (arg0 << 7) + arg8 + 1073741824;
        if (!var16.field1290) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg5 << 6) + arg1);
        if (arg1 == 22) {
            if (!field1652 || var16.field1290 || var16.field1269) {
                class21 var19;
                if (var16.field1314 == -1 && var16.field1285 == null) {
                    var19 = var16.method414(22, arg5, var10, var11, var12, var13, -1);
                } else {
                    var19 = new class17(var12, var11, arg4, var16.field1314, -371, 22, arg5, true, var10, var13);
                }
                arg6.method195(var19, arg8, arg0, var17, (byte) -58, var14, arg2, var18);
                if (var16.field1270 && var16.field1290 && arg3 != null) {
                    arg3.method383(arg0, arg8, -56);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class21 var39;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var39 = var16.method414(10, arg5, var10, var11, var12, var13, -1);
            } else {
                var39 = new class17(var12, var11, arg4, var16.field1314, -371, 10, arg5, true, var10, var13);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg1 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg5 == 1 || arg5 == 3) {
                    var41 = var16.field1297;
                    var42 = var16.field1289;
                } else {
                    var41 = var16.field1289;
                    var42 = var16.field1297;
                }
                if (arg6.method199(arg2, var17, field1634, var39, var41, var14, var18, arg0, var42, arg8, var40) && var16.field1296) {
                    class19 var43;
                    if (var39 instanceof class19) {
                        var43 = (class19) var39;
                    } else {
                        var43 = var16.method414(10, arg5, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field834 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field1635[arg2][arg8 + var44][arg0 + var45]) {
                                    this.field1635[arg2][arg8 + var44][arg0 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var16.field1270 && arg3 != null) {
                arg3.method382(arg0, 6, var16.field1297, var16.field1289, arg5, var16.field1278, arg8);
            }
        } else if (arg1 >= 12) {
            class21 var20;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var20 = var16.method414(arg1, arg5, var10, var11, var12, var13, -1);
            } else {
                var20 = new class17(var12, var11, arg4, var16.field1314, -371, arg1, arg5, true, var10, var13);
            }
            arg6.method199(arg2, var17, field1634, var20, 1, var14, var18, arg0, 1, arg8, 0);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg2 > 0) {
                this.field1639[arg2][arg8][arg0] |= 0x924;
            }
            if (var16.field1270 && arg3 != null) {
                arg3.method382(arg0, 6, var16.field1297, var16.field1289, arg5, var16.field1278, arg8);
            }
        } else if (arg1 == 0) {
            class21 var21;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var21 = var16.method414(0, arg5, var10, var11, var12, var13, -1);
            } else {
                var21 = new class17(var12, var11, arg4, var16.field1314, -371, 0, arg5, true, var10, var13);
            }
            arg6.method197(arg8, 0, null, var17, var21, field1643[arg5], -33711, var18, arg0, var14, arg2);
            if (arg5 == 0) {
                if (var16.field1296) {
                    this.field1635[arg2][arg8][arg0] = 50;
                    this.field1635[arg2][arg8][arg0 + 1] = 50;
                }
                if (var16.field1276) {
                    this.field1639[arg2][arg8][arg0] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var16.field1296) {
                    this.field1635[arg2][arg8][arg0 + 1] = 50;
                    this.field1635[arg2][arg8 + 1][arg0 + 1] = 50;
                }
                if (var16.field1276) {
                    this.field1639[arg2][arg8][arg0 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var16.field1296) {
                    this.field1635[arg2][arg8 + 1][arg0] = 50;
                    this.field1635[arg2][arg8 + 1][arg0 + 1] = 50;
                }
                if (var16.field1276) {
                    this.field1639[arg2][arg8 + 1][arg0] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var16.field1296) {
                    this.field1635[arg2][arg8][arg0] = 50;
                    this.field1635[arg2][arg8 + 1][arg0] = 50;
                }
                if (var16.field1276) {
                    this.field1639[arg2][arg8][arg0] |= 0x492;
                }
            }
            if (var16.field1270 && arg3 != null) {
                arg3.method381(arg1, 741, arg0, var16.field1278, arg5, arg8);
            }
            if (var16.field1313 != 16) {
                arg6.method205(arg8, arg2, arg0, 0, var16.field1313);
            }
        } else if (arg1 == 1) {
            class21 var22;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var22 = var16.method414(1, arg5, var10, var11, var12, var13, -1);
            } else {
                var22 = new class17(var12, var11, arg4, var16.field1314, -371, 1, arg5, true, var10, var13);
            }
            arg6.method197(arg8, 0, null, var17, var22, field1632[arg5], -33711, var18, arg0, var14, arg2);
            if (var16.field1296) {
                if (arg5 == 0) {
                    this.field1635[arg2][arg8][arg0 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field1635[arg2][arg8 + 1][arg0 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field1635[arg2][arg8 + 1][arg0] = 50;
                } else if (arg5 == 3) {
                    this.field1635[arg2][arg8][arg0] = 50;
                }
            }
            if (var16.field1270 && arg3 != null) {
                arg3.method381(arg1, 741, arg0, var16.field1278, arg5, arg8);
            }
        } else if (arg1 == 2) {
            int var23 = arg5 + 1 & 0x3;
            class21 var24;
            class21 var25;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var24 = var16.method414(2, arg5 + 4, var10, var11, var12, var13, -1);
                var25 = var16.method414(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new class17(var12, var11, arg4, var16.field1314, -371, 2, arg5 + 4, true, var10, var13);
                var25 = new class17(var12, var11, arg4, var16.field1314, -371, 2, var23, true, var10, var13);
            }
            arg6.method197(arg8, field1643[var23], var25, var17, var24, field1643[arg5], -33711, var18, arg0, var14, arg2);
            if (var16.field1276) {
                if (arg5 == 0) {
                    this.field1639[arg2][arg8][arg0] |= 0x249;
                    this.field1639[arg2][arg8][arg0 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    this.field1639[arg2][arg8][arg0 + 1] |= 0x492;
                    this.field1639[arg2][arg8 + 1][arg0] |= 0x249;
                } else if (arg5 == 2) {
                    this.field1639[arg2][arg8 + 1][arg0] |= 0x249;
                    this.field1639[arg2][arg8][arg0] |= 0x492;
                } else if (arg5 == 3) {
                    this.field1639[arg2][arg8][arg0] |= 0x492;
                    this.field1639[arg2][arg8][arg0] |= 0x249;
                }
            }
            if (var16.field1270 && arg3 != null) {
                arg3.method381(arg1, 741, arg0, var16.field1278, arg5, arg8);
            }
            if (var16.field1313 != 16) {
                arg6.method205(arg8, arg2, arg0, 0, var16.field1313);
            }
        } else if (arg1 == 3) {
            class21 var26;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var26 = var16.method414(3, arg5, var10, var11, var12, var13, -1);
            } else {
                var26 = new class17(var12, var11, arg4, var16.field1314, -371, 3, arg5, true, var10, var13);
            }
            arg6.method197(arg8, 0, null, var17, var26, field1632[arg5], -33711, var18, arg0, var14, arg2);
            if (var16.field1296) {
                if (arg5 == 0) {
                    this.field1635[arg2][arg8][arg0 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field1635[arg2][arg8 + 1][arg0 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field1635[arg2][arg8 + 1][arg0] = 50;
                } else if (arg5 == 3) {
                    this.field1635[arg2][arg8][arg0] = 50;
                }
            }
            if (var16.field1270 && arg3 != null) {
                arg3.method381(arg1, 741, arg0, var16.field1278, arg5, arg8);
            }
        } else if (arg1 == 9) {
            class21 var27;
            if (var16.field1314 == -1 && var16.field1285 == null) {
                var27 = var16.method414(arg1, arg5, var10, var11, var12, var13, -1);
            } else {
                var27 = new class17(var12, var11, arg4, var16.field1314, -371, arg1, arg5, true, var10, var13);
            }
            arg6.method199(arg2, var17, field1634, var27, 1, var14, var18, arg0, 1, arg8, 0);
            if (var16.field1270 && arg3 != null) {
                arg3.method382(arg0, 6, var16.field1297, var16.field1289, arg5, var16.field1278, arg8);
            }
        } else {
            if (var16.field1300) {
                if (arg5 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg5 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg5 == 3) {
                    int var31 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var31;
                }
            }
            if (arg1 == 4) {
                class21 var32;
                if (var16.field1314 == -1 && var16.field1285 == null) {
                    var32 = var16.method414(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new class17(var12, var11, arg4, var16.field1314, -371, 4, 0, true, var10, var13);
                }
                arg6.method198(arg2, 0, var32, var17, field1643[arg5], 0, var18, 450, arg8, arg5 * 512, var14, arg0);
            } else if (arg1 == 5) {
                int var33 = 16;
                int var34 = arg6.method215(arg2, arg8, arg0);
                if (var34 > 0) {
                    var33 = class47.method417(var34 >> 14 & 0x7FFF).field1313;
                }
                class21 var35;
                if (var16.field1314 == -1 && var16.field1285 == null) {
                    var35 = var16.method414(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class17(var12, var11, arg4, var16.field1314, -371, 4, 0, true, var10, var13);
                }
                arg6.method198(arg2, field1659[arg5] * var33, var35, var17, field1643[arg5], field1653[arg5] * var33, var18, 450, arg8, arg5 * 512, var14, arg0);
            } else if (arg1 == 6) {
                class21 var36;
                if (var16.field1314 == -1 && var16.field1285 == null) {
                    var36 = var16.method414(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class17(var12, var11, arg4, var16.field1314, -371, 4, 0, true, var10, var13);
                }
                arg6.method198(arg2, 0, var36, var17, 256, 0, var18, 450, arg8, arg5, var14, arg0);
            } else if (arg1 == 7) {
                class21 var37;
                if (var16.field1314 == -1 && var16.field1285 == null) {
                    var37 = var16.method414(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class17(var12, var11, arg4, var16.field1314, -371, 4, 0, true, var10, var13);
                }
                arg6.method198(arg2, 0, var37, var17, 512, 0, var18, 450, arg8, arg5, var14, arg0);
            } else if (arg1 == 8) {
                class21 var38;
                if (var16.field1314 == -1 && var16.field1285 == null) {
                    var38 = var16.method414(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new class17(var12, var11, arg4, var16.field1314, -371, 4, 0, true, var10, var13);
                }
                arg6.method198(arg2, 0, var38, var17, 768, 0, var18, 450, arg8, arg5, var14, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "<init>", descriptor = "([[[I[[[BIBI)V")
    public class64(int[][][] arg0, byte[][][] arg1, int arg2, byte arg3, int arg4) {
        field1648 = 99;
        this.field1649 = arg2;
        this.field1650 = arg4;
        this.field1638 = arg0;
        this.field1645 = arg1;
        this.field1633 = new byte[4][this.field1649][this.field1650];
        this.field1655 = new byte[4][this.field1649][this.field1650];
        this.field1641 = new byte[4][this.field1649][this.field1650];
        this.field1636 = new byte[4][this.field1649][this.field1650];
        this.field1639 = new int[4][this.field1649 + 1][this.field1650 + 1];
        if (arg3 != 36) {
            this.field1658 = -236;
        }
        this.field1635 = new byte[4][this.field1649 + 1][this.field1650 + 1];
        this.field1654 = new int[this.field1649 + 1][this.field1650 + 1];
        this.field1627 = new int[this.field1650];
        this.field1628 = new int[this.field1650];
        this.field1629 = new int[this.field1650];
        this.field1630 = new int[this.field1650];
        this.field1631 = new int[this.field1650];
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "([BIILGXHGUSOD;I[LOXMJPDWD;)V")
    public final void method578(byte[] arg0, int arg1, int arg2, class13 arg3, int arg4, class41[] arg5) {
        class52 var7 = new class52(arg0, true);
        int var8 = -1;
        if (arg2 != 6107) {
            return;
        }
        while (true) {
            int var9 = var7.method475();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method475();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method461();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg1 + var13;
                int var19 = arg4 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1645[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class41 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg5[var20];
                    }
                    this.method577(var19, var16, var14, var21, var8, var17, arg3, -302, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(IIIII)V")
    public final void method579(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            field1642 = !field1642;
        }
        for (int var6 = arg2; var6 <= arg2 + arg4; var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg3; var7++) {
                if (var7 >= 0 && var7 < this.field1649 && var6 >= 0 && var6 < this.field1650) {
                    this.field1635[0][var7][var6] = 127;
                    if (arg0 == var7 && var7 > 0) {
                        this.field1638[0][var7][var6] = this.field1638[0][var7 - 1][var6];
                    }
                    if (arg0 + arg3 == var7 && var7 < this.field1649 - 1) {
                        this.field1638[0][var7][var6] = this.field1638[0][var7 + 1][var6];
                    }
                    if (arg2 == var6 && var6 > 0) {
                        this.field1638[0][var7][var6] = this.field1638[0][var7][var6 - 1];
                    }
                    if (arg2 + arg4 == var6 && var6 < this.field1650 - 1) {
                        this.field1638[0][var7][var6] = this.field1638[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(III[BBIIII[LOXMJPDWD;)V")
    public final void method580(int arg0, int arg1, int arg2, byte[] arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class41[] arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg5 + var11 > 0 && arg5 + var11 < 103 && arg6 + var16 > 0 && arg6 + var16 < 103) {
                    arg9[arg7].field1193[arg5 + var11][arg6 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class52 var12 = new class52(arg3, true);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg8 == var13 && var14 >= arg2 && var14 < arg2 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
                        this.method564(var12, 0, arg0, 0, 0, arg6 + class69.method587(var15 & 0x7, 7, arg0, var14 & 0x7), arg7, arg5 + class69.method586(var15 & 0x7, 0, var14 & 0x7, arg0));
                    } else {
                        this.method564(var12, 0, 0, 0, 0, -1, 0, -1);
                    }
                }
            }
        }
        if (arg4 != 74) {
            this.field1646 = 258;
        }
    }

    @OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(IIII[LOXMJPDWD;II[BILGXHGUSOD;I)V")
    public final void method581(int arg0, int arg1, int arg2, int arg3, class41[] arg4, int arg5, int arg6, byte[] arg7, int arg8, class13 arg9, int arg10) {
        class52 var12 = new class52(arg7, true);
        int var13 = -1;
        if (arg6 >= 0) {
            return;
        }
        while (true) {
            int var14 = var12.method475();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method475();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method461();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg5 == var19 && var18 >= arg3 && var18 < arg3 + 8 && var17 >= arg2 && var17 < arg2 + 8) {
                    class47 var23 = class47.method417(var13);
                    int var24 = arg8 + class69.method588(var23.field1289, var17 & 0x7, arg1, 426, var18 & 0x7, var23.field1297, var22);
                    int var25 = arg0 + class69.method589(var18 & 0x7, var17 & 0x7, var22, arg1, var23.field1297, false, var23.field1289);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg10;
                        if ((this.field1645[1][var24][var25] & 0x2) == 2) {
                            var26 = arg10 - 1;
                        }
                        class41 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg4[var26];
                        }
                        this.method577(var25, var21, arg10, var27, var13, arg1 + var22 & 0x3, arg9, -302, var24);
                    }
                }
            }
        }
    }
}
