import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class49 {

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "Lsm;")
    private class442 field716;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lmo;")
    private class251 field704;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Z")
    public boolean field713;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "[[[B")
    private byte[][][] field706;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "[[[B")
    private byte[][][] field707;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "[[[I")
    public int[][][] field719;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "[[[B")
    private byte[][][] field702;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "[[[B")
    public byte[][][] field718;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "[[[B")
    private byte[][][] field696;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "Lsh;")
    public static class472 field722 = new class472(66, 8);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "[[I")
    public static int[][] field723;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "[[[B")
    public byte[][][] field708;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method352(byte arg0) {
        field723 = null;
        field722 = null;
        if (arg0 < 111) {
            field722 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII[Ltf;IIIILre;)V")
    public final void method353(int arg0, int arg1, int arg2, int arg3, class491[] arg4, int arg5, int arg6, int arg7, int arg8, class446 arg9) {
        field715++;
        int var11 = (arg1 & 0x7) * 8;
        int var12 = (arg8 & 0x7) * 8;
        if (!this.field713) {
            class491 var13 = arg4[arg2];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg0 + class285.method1823(14277, var15 & 0x7, arg7, var14 & 0x7);
                    int var17 = class361.method2222((byte) 120, arg7, var14 & 0x7, var15 & 0x7) + arg3;
                    if (var16 > 0 && var16 < (this.field710 - 1) && var17 > 0 && var17 < (this.field700 - 1)) {
                        var13.method2865(-2097153, var17, var16);
                    }
                }
            }
        }
        int var18 = arg1 & 0x1FFFFFF8 << 3;
        if (arg6 < 48) {
            this.method353(-115, -32, -10, -110, (class491[]) null, 58, 2, -37, -6, (class446) null);
        }
        int var19 = arg8 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg7 == 1) {
            var21 = 1;
        } else if (arg7 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg7 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field698; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg5 != var22 || var11 > var23 || (var11 + 8) < var23 || var12 > var24 || var24 > var12 + 8) {
                        this.method354(-1, false, 0, 0, arg9, -1, 0, 0, 0, 0, 0);
                    } else if (var11 + 8 == var23 || (var12 + 8) == var24) {
                        int var31;
                        int var32;
                        if (arg7 == 0) {
                            var31 = var23 + arg0 - var11;
                            var32 = var24 + arg3 - var12;
                        } else if (arg7 == 1) {
                            var32 = arg3 + (var11 - var23) + 8;
                            var31 = arg0 + var24 - var12;
                        } else if (arg7 == 2) {
                            var32 = arg3 + var12 + 8 - var24;
                            var31 = var11 - (var23 - arg0 - 8);
                        } else {
                            var32 = arg3 - (var11 - var23);
                            var31 = arg0 - (var24 - var12 - 8);
                        }
                        this.method354(var31, true, 0, arg2, arg9, var32, 0, var18 + var23, 0, var19 + var24, 0);
                    } else {
                        int var25 = arg0 + class285.method1823(14277, var24 & 0x7, arg7, var23 & 0x7);
                        int var26 = arg3 + class361.method2222((byte) 117, arg7, var23 & 0x7, var24 & 0x7);
                        this.method354(var25, false, var21, arg2, arg9, var26, var20, var18 + var23, 0, var19 + var24, arg7);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg7 == 0) {
                                var29 = arg3 + var28 - var12;
                                var30 = var27 + arg0 - var11;
                            } else if (arg7 == 1) {
                                var30 = arg0 + var28 - var12;
                                var29 = var11 + arg3 + 8 - var27;
                            } else if (arg7 == 2) {
                                var30 = arg0 + var11 + 8 - var27;
                                var29 = arg3 + 8 - (-var12 + var28);
                            } else {
                                var29 = arg3 + var27 - var11;
                                var30 = var12 + arg0 + 8 - var28;
                            }
                            if (var30 >= 0 && this.field710 > var30 && var29 >= 0 && this.field700 > var29) {
                                this.field719[arg2][var30][var29] = this.field719[arg2][var20 + var25][var26 + var21];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZIILre;IIIIII)V")
    private final void method354(int arg0, boolean arg1, int arg2, int arg3, class446 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field699++;
        if (arg10 == 1) {
            arg2 = 1;
        } else if (arg10 == 2) {
            arg6 = 1;
            arg2 = 1;
        } else if (arg10 == 3) {
            arg6 = 1;
        }
        if (arg0 >= 0 && this.field710 > arg0 && arg5 >= 0 && arg5 < this.field700) {
            if (!this.field713 && !arg1) {
                class246.field3532[arg3][arg0][arg5] = 0;
            }
            while (true) {
                int var12 = arg4.method2628(49152);
                if (var12 == 0) {
                    if (this.field713) {
                        this.field719[0][arg0 + arg6][arg2 + arg5] = 0;
                    } else if (arg3 == 0) {
                        this.field719[0][arg0 + arg6][arg2 + arg5] = -class209.method1411(arg7 + 932731, false, arg9 + 556238) * 8;
                    } else {
                        this.field719[arg3][arg0 + arg6][arg2 + arg5] = this.field719[arg3 - 1][arg0 + arg6][arg2 + arg5] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg4.method2628(49152);
                    if (this.field713) {
                        this.field719[0][arg0 + arg6][arg5 + arg2] = var13 * 8;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg3 == 0) {
                            this.field719[0][arg0 + arg6][arg5 + arg2] = -var13 * 8;
                        } else {
                            this.field719[arg3][arg0 + arg6][arg2 + arg5] = this.field719[arg3 - 1][arg0 + arg6][arg2 + arg5] - var13 * 8;
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg1) {
                        arg4.method2628(49152);
                    } else {
                        this.field707[arg3][arg0][arg5] = arg4.method2642(true);
                        this.field696[arg3][arg0][arg5] = (byte) ((var12 - 2) / 4);
                        this.field702[arg3][arg0][arg5] = (byte) class412.method2463(3, arg10 + var12 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!this.field713 && !arg1) {
                        class246.field3532[arg3][arg0][arg5] = (byte) (var12 - 49);
                    }
                } else if (!arg1) {
                    this.field706[arg3][arg0][arg5] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg4.method2628(49152);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg4.method2628(49152);
                    break;
                }
                if (var14 <= 49) {
                    arg4.method2628(49152);
                }
            }
        }
        if (arg8 != 0) {
            this.method363((byte) 55, (int[][]) null, -120);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static final void method355(int arg0) {
        if (class153.field2129.toLowerCase().indexOf("microsoft") == -1) {
            class94.field1301[44] = 71;
            class94.field1301[59] = 57;
            class94.field1301[45] = 26;
            class94.field1301[92] = 74;
            class94.field1301[47] = 73;
            class94.field1301[93] = 43;
            class94.field1301[46] = 72;
            class94.field1301[91] = 42;
            if (class153.field2139 == null) {
                class94.field1301[192] = 58;
                class94.field1301[222] = 59;
            } else {
                class94.field1301[222] = 58;
                class94.field1301[520] = 59;
                class94.field1301[192] = 28;
            }
            class94.field1301[61] = 27;
        } else {
            class94.field1301[188] = 71;
            class94.field1301[189] = 26;
            class94.field1301[190] = 72;
            class94.field1301[221] = 43;
            class94.field1301[220] = 74;
            class94.field1301[223] = 28;
            class94.field1301[192] = 58;
            class94.field1301[222] = 59;
            class94.field1301[219] = 42;
            class94.field1301[186] = 57;
            class94.field1301[187] = 27;
            class94.field1301[191] = 73;
        }
        if (arg0 != 58) {
            field722 = null;
        }
        field720++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILjava/lang/String;[BII)I")
    public static final int method356(int arg0, int arg1, String arg2, byte[] arg3, int arg4, int arg5) {
        field701++;
        if (arg0 >= -46) {
            field723 = null;
        }
        int var6 = arg1 - arg4;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg5 + var7] = -97;
            } else {
                arg3[arg5 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lcl;ILtq;Lcl;)V")
    public final void method357(class48 arg0, int arg1, class63 arg2, class48 arg3) {
        field721++;
        int[][] var5 = new int[this.field710][this.field700];
        if (class489.field6850 == null || class489.field6850.length != this.field700) {
            class433.field6159 = new int[this.field700];
            class38.field531 = new int[this.field700];
            class285.field4349 = new int[this.field700];
            class489.field6850 = new int[this.field700];
            class140.field2004 = new int[this.field700];
        }
        for (int var6 = 0; var6 < this.field698; var6++) {
            for (int var8 = 0; var8 < this.field700; var8++) {
                class489.field6850[var8] = 0;
                class38.field531[var8] = 0;
                class285.field4349[var8] = 0;
                class140.field2004[var8] = 0;
                class433.field6159[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field710; var9++) {
                for (int var10 = 0; var10 < this.field700; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field710 > var19) {
                        int var20 = this.field706[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class489 var21 = this.field716.method2566(var20 - 1, (byte) 91);
                            class489.field6850[var10] += var21.field6861;
                            class38.field531[var10] += var21.field6865;
                            class285.field4349[var10] += var21.field6851;
                            class140.field2004[var10] += var21.field6855;
                            var10002 = class433.field6159[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field706[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class489 var24 = this.field716.method2566(var23 - 1, (byte) 68);
                            class489.field6850[var10] -= var24.field6861;
                            class38.field531[var10] -= var24.field6865;
                            class285.field4349[var10] -= var24.field6851;
                            class140.field2004[var10] -= var24.field6855;
                            var10002 = class433.field6159[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field700; var16++) {
                        int var17 = var16 + 5;
                        if (this.field700 > var17) {
                            var13 += class285.field4349[var17];
                            var11 += class489.field6850[var17];
                            var12 += class38.field531[var17];
                            var15 += class433.field6159[var17];
                            var14 += class140.field2004[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var14 -= class140.field2004[var18];
                            var15 -= class433.field6159[var18];
                            var11 -= class489.field6850[var18];
                            var12 -= class38.field531[var18];
                            var13 -= class285.field4349[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class233.method1525(1391593162, var12 / var15, var13 / var15, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class115.field1600) {
                this.method360(0, var6 == 0 ? arg0 : null, var5, var6, var6 == 0 ? arg3 : null, class479.field6745[var6], arg2);
            } else {
                this.method364(var6 == 0 ? arg0 : null, var6 == 0 ? arg3 : null, var5, arg2, var6, arg1 + 520, class479.field6745[var6]);
            }
            this.field706[var6] = null;
            this.field707[var6] = null;
            this.field696[var6] = null;
            this.field702[var6] = null;
        }
        if (!this.field713) {
            if (class408.field5922 != 0) {
                class45.method329();
            }
            if (class433.field6160) {
                class68.method603();
            }
        }
        for (int var7 = arg1; var7 < this.field698; var7++) {
            class479.field6745[var7].method194();
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
    public final void method358(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 > -38) {
            this.method362(109, (class63) null, (class491[]) null, (int[][][]) null);
        }
        field705++;
        for (int var6 = 0; var6 < this.field698; var6++) {
            this.method361(false, arg2, var6, arg1, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[Ltf;Lre;III)V")
    public final void method359(int arg0, int arg1, class491[] arg2, class446 arg3, int arg4, int arg5, int arg6) {
        field709++;
        if (!this.field713) {
            for (int var8 = 0; var8 < 4; var8++) {
                class491 var9 = arg2[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg5 + var11;
                        if (var12 >= 0 && this.field710 > var12 && var13 >= 0 && var13 < this.field700) {
                            var9.method2865(-2097153, var13, var12);
                        }
                    }
                }
            }
        }
        int var14 = arg6 + arg4;
        int var15 = arg0 + arg5;
        for (int var16 = arg1; var16 < this.field698; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method354(arg4 + var17, false, 0, var16, arg3, arg5 + var18, 0, var14 + var17, 0, var15 + var18, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILcl;[[IILcl;Lcl;Ltq;)V")
    private final void method360(int arg0, class48 arg1, int[][] arg2, int arg3, class48 arg4, class48 arg5, class63 arg6) {
        field712++;
        byte[][] var8 = this.field696[arg3];
        byte[][] var9 = this.field702[arg3];
        byte[][] var10 = this.field706[arg3];
        byte[][] var11 = this.field707[arg3];
        for (int var12 = arg0; var12 < this.field710; var12++) {
            int var13 = var12 < (this.field710 - 1) ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field700; var14++) {
                int var15 = this.field700 - 1 <= var14 ? var14 : var14 + 1;
                if (class12.field181 == -1 || class103.method775(class12.field181, var12, var14, arg3, 2)) {
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
                        class172 var26 = var21 == 0 ? null : this.field704.method1599((byte) -77, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class489 var27 = var22 == 0 ? null : this.field716.method2566(var22 - 1, (byte) -126);
                        class172 var28 = var26;
                        if (var26 != null) {
                            if (var26.field2454 == -1 && var26.field2448 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field2457;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field710 && this.field700 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var32++;
                                var34++;
                            } else {
                                var34--;
                                var32--;
                            }
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var34++;
                                var35++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var35++;
                                var36++;
                            } else {
                                var36--;
                                var35--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var32++;
                                var36++;
                            } else {
                                var36--;
                                var32--;
                            }
                            int var37 = var32 - var35;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method199(var12, var14) - arg5.method199(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg5.method199(var13, var14) - arg5.method199(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class395.field5817[var39] = -1;
                            class400.field5850[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field2457 ? class468.field6583[var19] : class3.field68[var19];
                        this.method365(var14, var18, var20, (byte) 116, arg6, var19, var26, var9, this.field710, var12, var11, var8, var27, this.field700);
                        boolean var41 = var26 != null && var26.field2454 != var26.field2448;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class395.field5817[var42] >= 0 && class360.field5462[var42] != class270.field3996[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class329.method2016(var18[1], class412.method2463(class400.field5850[4], class400.field5850[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class329.method2016(var18[3], class412.method2463(class400.field5850[6], class400.field5850[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class329.method2016(var18[0], class412.method2463(class400.field5850[2], class400.field5850[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class329.method2016(var18[2], class412.method2463(class400.field5850[4], class400.field5850[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var48 = var26 == null ? 0 : class131.field1829[var19];
                            var45 = class1.field15[var19];
                            var47 = class463.field6538[var19];
                            var49 = class88.field1242[var19];
                            var46 = var27 == null ? 0 : class424.field6069[var19];
                        } else if (var17) {
                            var45 = class406.field5908[var19];
                            var46 = var27 == null ? 0 : class199.field3000[var19];
                            var44 = class484.field6792[var19];
                            var47 = class44.field606[var19];
                            var48 = var26 == null ? 0 : class382.field5659[var19];
                            var49 = class204.field3105[var19];
                        } else {
                            var45 = class46.field657[var19];
                            var44 = class355.field5382[var19];
                            var48 = var26 == null ? 0 : class263.field3913[var19];
                            var49 = class190.field2918[var19];
                            var47 = class493.field6940[var19];
                            var46 = var27 == null ? 0 : class109.field1550[var19];
                        }
                        int var50 = var48 + var46;
                        if (var50 <= 0) {
                            class13.method127(arg3, var12, var14);
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
                            int[] var60 = arg4 == null ? null : new int[var53];
                            int[] var61 = arg4 == null && arg1 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field2454;
                                var63 = arg6.method556() ? var26.field2440 : var26.field2439;
                                var64 = var26.field2438;
                                int var65 = class428.method2516(arg6, 116, var26);
                                for (int var66 = 0; var66 < var48; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class42.field572[0] = var49[var51];
                                        class42.field572[1] = 1;
                                        class42.field572[2] = var47[var51];
                                        class42.field572[3] = 1;
                                        class42.field572[4] = var45[var51];
                                        var68 = 6;
                                        class42.field572[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class42.field572[0] = var49[var51];
                                        class42.field572[1] = 5;
                                        class42.field572[2] = var47[var51];
                                        class42.field572[3] = 5;
                                        class42.field572[4] = var45[var51];
                                        class42.field572[5] = var47[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class42.field572[0] = var49[var51];
                                        class42.field572[1] = 3;
                                        class42.field572[2] = var47[var51];
                                        class42.field572[3] = 3;
                                        class42.field572[4] = var45[var51];
                                        var68 = 6;
                                        class42.field572[5] = var47[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class42.field572[0] = var49[var51];
                                        class42.field572[1] = 7;
                                        class42.field572[2] = var47[var51];
                                        class42.field572[3] = 7;
                                        class42.field572[4] = var45[var51];
                                        class42.field572[5] = var47[var51];
                                        var68 = 6;
                                    } else {
                                        class42.field572[0] = var49[var51];
                                        class42.field572[1] = var45[var51];
                                        var68 = 3;
                                        class42.field572[2] = var47[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class42.field572[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = class121.field1673[var70];
                                        int var73 = class433.field6158[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var75 = 128 - var72;
                                            var74 = var73;
                                        } else if (var20 == 2) {
                                            var75 = 128 - var73;
                                            var74 = 128 - var72;
                                        } else if (var20 == 3) {
                                            var75 = var72;
                                            var74 = 128 - var73;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class31.field411[var19][var70]) {
                                            int var76 = (var12 << 7) + var74;
                                            int var77 = (var14 << 7) + var75;
                                            var60[var52] = arg4.method204(var76, var77) - arg5.method204(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class31.field411[var19][var70]) {
                                                int var78 = (var12 << 7) + var74;
                                                int var79 = (var14 << 7) + var75;
                                                var61[var52] = arg5.method204(var78, var79) - arg4.method204(var78, var79);
                                            } else if (arg1 != null && !class398.field5831[var19][var70]) {
                                                int var80 = (var12 << 7) + var74;
                                                int var81 = (var14 << 7) + var75;
                                                var61[var52] = arg1.method204(var80, var81) - arg5.method204(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && var26.field2441 < class395.field5817[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class360.field5462[var71];
                                            }
                                            var59[var52] = class25.field322[var71];
                                            var58[var52] = class385.field5694[var71];
                                            var57[var52] = class270.field3996[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg6.method556() ? var26.field2440 : var26.field2439;
                                            var59[var52] = var26.field2438;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field713 && arg3 == 0) {
                                    class324.method1997(var12, var14, var26.field2451, var26.field2445 * 8, var26.field2455);
                                }
                                if (var19 != 12 && var26.field2454 != -1 && var26.field2447) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class131.field1829[var19];
                            } else if (var17) {
                                var51 += class382.field5659[var19];
                            } else {
                                var51 += class263.field3913[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class489 var82 = this.field716.method2566(var22 - 1, (byte) 47);
                                class489 var83 = this.field716.method2566(var23 - 1, (byte) -114);
                                class489 var84 = this.field716.method2566(var24 - 1, (byte) -113);
                                class489 var85 = this.field716.method2566(var25 - 1, (byte) -80);
                                for (int var86 = 0; var86 < var46; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class42.field572[0] = var49[var51];
                                        class42.field572[1] = 1;
                                        class42.field572[2] = var47[var51];
                                        class42.field572[3] = 1;
                                        class42.field572[4] = var45[var51];
                                        class42.field572[5] = var47[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class42.field572[0] = var49[var51];
                                        class42.field572[1] = 5;
                                        class42.field572[2] = var47[var51];
                                        class42.field572[3] = 5;
                                        class42.field572[4] = var45[var51];
                                        var88 = 6;
                                        class42.field572[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class42.field572[0] = var49[var51];
                                        class42.field572[1] = 3;
                                        class42.field572[2] = var47[var51];
                                        class42.field572[3] = 3;
                                        class42.field572[4] = var45[var51];
                                        var88 = 6;
                                        class42.field572[5] = var47[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class42.field572[0] = var49[var51];
                                        class42.field572[1] = 7;
                                        class42.field572[2] = var47[var51];
                                        class42.field572[3] = 7;
                                        class42.field572[4] = var45[var51];
                                        var88 = 6;
                                        class42.field572[5] = var47[var51];
                                    } else {
                                        class42.field572[0] = var49[var51];
                                        class42.field572[1] = var45[var51];
                                        var88 = 3;
                                        class42.field572[2] = var47[var51];
                                    }
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class42.field572[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = class121.field1673[var90];
                                        int var93 = class433.field6158[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 128 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 128 - var92;
                                            var95 = 128 - var93;
                                        } else if (var20 == 3) {
                                            var95 = var92;
                                            var94 = 128 - var93;
                                        } else {
                                            var95 = var93;
                                            var94 = var92;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class31.field411[var19][var90]) {
                                            int var96 = (var12 << 7) + var94;
                                            int var97 = (var14 << 7) + var95;
                                            var60[var52] = arg4.method204(var96, var97) - arg5.method204(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class31.field411[var19][var90]) {
                                                int var98 = (var12 << 7) + var94;
                                                int var99 = (var14 << 7) + var95;
                                                var61[var52] = arg5.method204(var98, var99) - arg4.method204(var98, var99);
                                            } else if (arg1 != null && !class398.field5831[var19][var90]) {
                                                int var100 = (var12 << 7) + var94;
                                                int var101 = (var14 << 7) + var95;
                                                var61[var52] = arg1.method204(var100, var101) - arg5.method204(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class395.field5817[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class360.field5462[var91];
                                            }
                                            var59[var52] = class25.field322[var91];
                                            var58[var52] = class385.field5694[var91];
                                            var57[var52] = class270.field3996[var91];
                                        } else {
                                            if (var17 && class31.field411[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg2[var12][var14];
                                                var58[var52] = var82.field6859;
                                                var59[var52] = var82.field6858;
                                            } else if (var94 == 0 && var95 == 128) {
                                                var57[var52] = arg2[var12][var15];
                                                var58[var52] = var83.field6859;
                                                var59[var52] = var83.field6858;
                                            } else if (var94 == 128 && var95 == 128) {
                                                var57[var52] = arg2[var13][var15];
                                                var58[var52] = var84.field6859;
                                                var59[var52] = var84.field6858;
                                            } else if (var94 == 128 && var95 == 0) {
                                                var57[var52] = arg2[var13][var14];
                                                var58[var52] = var85.field6859;
                                                var59[var52] = var85.field6858;
                                            } else {
                                                if (var94 < 64) {
                                                    if (var95 >= 64) {
                                                        var58[var52] = var83.field6859;
                                                        var59[var52] = var83.field6858;
                                                    } else {
                                                        var58[var52] = var82.field6859;
                                                        var59[var52] = var82.field6858;
                                                    }
                                                } else if (var95 < 64) {
                                                    var58[var52] = var85.field6859;
                                                    var59[var52] = var85.field6858;
                                                } else {
                                                    var58[var52] = var84.field6859;
                                                    var59[var52] = var84.field6858;
                                                }
                                                int var102 = class484.method2833(128, arg2[var12][var14], arg2[var13][var14], var94 << 7 >> 7);
                                                int var103 = class484.method2833(arg0 + 128, arg2[var12][var15], arg2[var13][var15], var94 << 7 >> 7);
                                                var57[var52] = class484.method2833(128, var102, var103, var95 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field6852) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg5.method199(var12, var14);
                            int var105 = arg5.method199(var13, var14);
                            int var106 = arg5.method199(var13, var15);
                            int var107 = arg5.method199(var12, var15);
                            if (arg3 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field2446) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field718[arg3][var12][var14] = (byte) class347.method2139(this.field718[arg3][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field713) {
                                var109 = class71.method618(var12, var14);
                                var110 = class465.method2733(var12, var14);
                                var111 = class19.method186(var12, var14);
                            }
                            arg5.method205(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class13.method127(arg3, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIIIII)V")
    public final void method361(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            this.field700 = 123;
        }
        for (int var7 = arg3; var7 < arg3 + arg4; var7++) {
            for (int var10 = arg1; var10 < arg1 + arg5; var10++) {
                if (var10 >= 0 && this.field710 > var10 && var7 >= 0 && var7 < this.field700) {
                    this.field719[arg2][var10][var7] = arg2 > 0 ? this.field719[arg2 - 1][var10][var7] - 240 : 0;
                }
            }
        }
        field714++;
        if (arg1 > 0 && this.field710 > arg1) {
            for (int var8 = arg3 + 1; var8 < (arg3 + arg4); var8++) {
                if (var8 >= 0 && this.field700 > var8) {
                    this.field719[arg2][arg1][var8] = this.field719[arg2][arg1 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < this.field700) {
            for (int var9 = arg1 + 1; var9 < arg1 + arg5; var9++) {
                if (var9 >= 0 && this.field710 > var9) {
                    this.field719[arg2][var9][arg3] = this.field719[arg2][var9][arg3 - 1];
                }
            }
        }
        if (arg1 < 0 || arg3 < 0 || this.field710 <= arg1 || this.field700 <= arg3) {
            return;
        }
        if (arg2 != 0) {
            if (arg1 > 0 && this.field719[arg2 - 1][arg1 - 1][arg3] != this.field719[arg2][arg1 - 1][arg3]) {
                this.field719[arg2][arg1][arg3] = this.field719[arg2][arg1 - 1][arg3];
                return;
            }
            if (arg3 > 0 && this.field719[arg2 - 1][arg1][arg3 - 1] != this.field719[arg2][arg1][arg3 - 1]) {
                this.field719[arg2][arg1][arg3] = this.field719[arg2][arg1][arg3 - 1];
                return;
            }
            if (arg1 > 0 && arg3 > 0 && this.field719[arg2 - 1][arg1 - 1][arg3 - 1] != this.field719[arg2][arg1 - 1][arg3 - 1]) {
                this.field719[arg2][arg1][arg3] = this.field719[arg2][arg1 - 1][arg3 - 1];
                return;
            }
            return;
        }
        if (arg1 > 0 && this.field719[arg2][arg1 - 1][arg3] != 0) {
            this.field719[arg2][arg1][arg3] = this.field719[arg2][arg1 - 1][arg3];
            return;
        }
        if (arg3 > 0 && this.field719[arg2][arg1][arg3 - 1] != 0) {
            this.field719[arg2][arg1][arg3] = this.field719[arg2][arg1][arg3 - 1];
            return;
        }
        if (arg1 > 0 && arg3 > 0 && this.field719[arg2][arg1 - 1][arg3 - 1] != 0) {
            this.field719[arg2][arg1][arg3] = this.field719[arg2][arg1 - 1][arg3 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILtq;[Ltf;[[[I)V")
    public final void method362(int arg0, class63 arg1, class491[] arg2, int[][][] arg3) {
        if (!this.field713) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field710; var6++) {
                    for (int var7 = 0; var7 < this.field700; var7++) {
                        if ((class246.field3532[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class246.field3532[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method2869(24279, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        field697++;
        int var9 = 110 / ((-arg0 - 74) / 44);
        for (int var10 = 0; var10 < this.field698; var10++) {
            int var11 = 0;
            int var12 = 0;
            if (!this.field713) {
                if (class206.field3125) {
                    var12 |= 0x8;
                }
                if (class433.field6160) {
                    var11 |= 0x2;
                }
                if (class408.field5922 != 0) {
                    if (var10 == 0 | class256.field3798) {
                        var12 |= 0x10;
                    }
                    var11 |= 0x1;
                }
            }
            if (class433.field6160) {
                var12 |= 0x7;
            }
            int[][] var13 = arg3 == null || var10 >= arg3.length ? this.field719[var10] : arg3[var10];
            class169.method1171(var10, arg1.method590(this.field710, this.field700, this.field719[var10], var13, 128, var11, var12));
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIZLmo;Lsm;)V")
    public class49(int arg0, int arg1, int arg2, boolean arg3, class251 arg4, class442 arg5) {
        this.field700 = arg2;
        this.field716 = arg5;
        this.field704 = arg4;
        this.field713 = arg3;
        this.field698 = arg0;
        this.field710 = arg1;
        this.field706 = new byte[this.field698][this.field710][this.field700];
        this.field707 = new byte[this.field698][this.field710][this.field700];
        this.field719 = new int[this.field698][this.field710 + 1][this.field700 + 1];
        this.field702 = new byte[this.field698][this.field710][this.field700];
        this.field718 = new byte[this.field698][this.field710 + 1][this.field700 + 1];
        this.field696 = new byte[this.field698][this.field710][this.field700];
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B[[II)V")
    public final void method363(byte arg0, int[][] arg1, int arg2) {
        field711++;
        int[][] var4 = this.field719[arg2];
        int var5 = 98 % ((arg0 - 4) / 63);
        for (int var6 = 0; var6 < this.field710 + 1; var6++) {
            for (int var7 = 0; var7 < this.field700 + 1; var7++) {
                var4[var6][var7] += arg1[var6][var7];
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lcl;Lcl;[[ILtq;IILcl;)V")
    private final void method364(class48 arg0, class48 arg1, int[][] arg2, class63 arg3, int arg4, int arg5, class48 arg6) {
        for (int var8 = 0; var8 < this.field710; var8++) {
            for (int var9 = 0; var9 < this.field700; var9++) {
                if (class12.field181 == -1 || class103.method775(class12.field181, var8, var9, arg4, arg5 ^ 0x20A)) {
                    byte var10 = this.field696[arg4][var8][var9];
                    byte var11 = this.field702[arg4][var8][var9];
                    int var12 = this.field707[arg4][var8][var9] & 0xFF;
                    int var13 = this.field706[arg4][var8][var9] & 0xFF;
                    class172 var14 = var12 == 0 ? null : this.field704.method1599((byte) -56, var12 - 1);
                    class489 var15 = var13 == 0 ? null : this.field716.method2566(var13 - 1, (byte) -81);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class424.field6069[var10];
                        var17 = var14 == null ? 0 : class131.field1829[var10];
                    } else if (var14 != null) {
                        var17 = class131.field1829[var10];
                    } else if (var15 != null) {
                        var16 = class131.field1829[var10];
                    }
                    int var18 = var17 + var16;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field2454 == -1 && var14.field2448 == -1 && var14.field2440 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg3.method556() ? var14.field2440 : var14.field2439;
                            if (class64.field879) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field2438;
                                if (var14.field2454 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field2454;
                                }
                                if (var14.field2448 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field2448;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field713 && arg4 == 0) {
                                class324.method1997(var8, var9, var14.field2451, var14.field2445 * 8, var14.field2455);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field6859;
                            if (class64.field879) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field6858;
                                var20[var19] = arg2[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = class121.field1673.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg1 == null ? null : new int[var31];
                        int[] var35 = arg1 == null && arg0 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = class121.field1673[var36];
                            int var46 = class433.field6158[var36];
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
                            if (var34 != null && class31.field411[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg1.method204(var49, var50) - arg6.method204(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg1 != null && !class31.field411[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg6.method204(var51, var52) - arg1.method204(var51, var52);
                                } else if (arg0 != null && !class398.field5831[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg0.method204(var53, var54) - arg6.method204(var53, var54);
                                }
                            }
                        }
                        int var37 = arg6.method199(var8, var9);
                        int var38 = arg6.method199(var8 + 1, var9);
                        int var39 = arg6.method199(var8 + 1, var9 + 1);
                        int var40 = arg6.method199(var8, var9 + 1);
                        if (arg4 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field2446) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field718[arg4][var8][var9] = (byte) class347.method2139(this.field718[arg4][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field713) {
                            var42 = class71.method618(var8, var9);
                            var43 = class465.method2733(var8, var9);
                            var44 = class19.method186(var8, var9);
                        }
                        arg6.method201(var8, var9, var32, var34, var33, var35, class88.field1242[var10], class1.field15[var10], class463.field6538[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class13.method127(arg4, var8, var9);
                    }
                }
            }
        }
        if (arg5 == 520) {
            field717++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[ZIBLtq;ILan;[[BII[[B[[BLwr;I)V")
    private final void method365(int arg0, boolean[] arg1, int arg2, byte arg3, class63 arg4, int arg5, class172 arg6, byte[][] arg7, int arg8, int arg9, byte[][] arg10, byte[][] arg11, class489 arg12, int arg13) {
        field703++;
        if (arg6 != null && arg12 != null || arg12 != null && arg5 == 12 || arg6 != null && arg5 == 0) {
            boolean[] var15 = arg6 != null && arg6.field2457 ? class468.field6583[arg5] : class3.field68[arg5];
            if (arg0 > 0) {
                if (arg9 > 0) {
                    int var16 = arg10[arg9 - 1][arg0 - 1] & 0xFF;
                    if (var16 > 0) {
                        class172 var17 = this.field704.method1599((byte) -44, var16 - 1);
                        if (var17.field2454 != -1 && var17.field2457) {
                            byte var18 = arg11[arg9 - 1][arg0 - 1];
                            int var19 = arg7[arg9 - 1][arg0 - 1] * 2 + 4 & 0x7;
                            int var20 = class428.method2516(arg4, arg3 - 149, var17);
                            if (class31.field411[var18][var19]) {
                                class270.field3996[0] = var17.field2454;
                                class360.field5462[0] = var20;
                                class385.field5694[0] = arg4.method556() ? var17.field2440 : var17.field2439;
                                class25.field322[0] = var17.field2438;
                                class395.field5817[0] = var17.field2441;
                                class400.field5850[0] = 256;
                            }
                        }
                    }
                }
                if (arg9 < arg8 - 1) {
                    int var21 = arg10[arg9 + 1][arg0 - 1] & 0xFF;
                    if (var21 > 0) {
                        class172 var22 = this.field704.method1599((byte) -95, var21 - 1);
                        if (var22.field2454 != -1 && var22.field2457) {
                            byte var23 = arg11[arg9 + 1][arg0 - 1];
                            int var24 = arg7[arg9 + 1][arg0 - 1] * 2 + 6 & 0x7;
                            int var25 = class428.method2516(arg4, -44, var22);
                            if (class31.field411[var23][var24]) {
                                class270.field3996[2] = var22.field2454;
                                class360.field5462[2] = var25;
                                class385.field5694[2] = arg4.method556() ? var22.field2440 : var22.field2439;
                                class25.field322[2] = var22.field2438;
                                class395.field5817[2] = var22.field2441;
                                class400.field5850[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg0 < arg13 - 1) {
                if (arg9 > 0) {
                    int var26 = arg10[arg9 - 1][arg0 + 1] & 0xFF;
                    if (var26 > 0) {
                        class172 var27 = this.field704.method1599((byte) -120, var26 - 1);
                        if (var27.field2454 != -1 && var27.field2457) {
                            byte var28 = arg11[arg9 - 1][arg0 + 1];
                            int var29 = (arg7[arg9 - 1][arg0 + 1] * 2) + 2 & 0x7;
                            int var30 = class428.method2516(arg4, arg3 - 150, var27);
                            if (class31.field411[var28][var29]) {
                                class270.field3996[6] = var27.field2454;
                                class360.field5462[6] = var30;
                                class385.field5694[6] = arg4.method556() ? var27.field2440 : var27.field2439;
                                class25.field322[6] = var27.field2438;
                                class395.field5817[6] = var27.field2441;
                                class400.field5850[6] = 64;
                            }
                        }
                    }
                }
                if (arg9 < (arg8 - 1)) {
                    int var31 = arg10[arg9 + 1][arg0 + 1] & 0xFF;
                    if (var31 > 0) {
                        class172 var32 = this.field704.method1599((byte) -99, var31 - 1);
                        if (var32.field2454 != -1 && var32.field2457) {
                            byte var33 = arg11[arg9 + 1][arg0 + 1];
                            int var34 = arg7[arg9 + 1][arg0 + 1] * 2 & 0x7;
                            int var35 = class428.method2516(arg4, 126, var32);
                            if (class31.field411[var33][var34]) {
                                class270.field3996[4] = var32.field2454;
                                class360.field5462[4] = var35;
                                class385.field5694[4] = arg4.method556() ? var32.field2440 : var32.field2439;
                                class25.field322[4] = var32.field2438;
                                class395.field5817[4] = var32.field2441;
                                class400.field5850[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg0 > 0) {
                int var36 = arg10[arg9][arg0 - 1] & 0xFF;
                if (var36 > 0) {
                    class172 var37 = this.field704.method1599((byte) -63, var36 - 1);
                    if (var37.field2454 != -1) {
                        byte var38 = arg11[arg9][arg0 - 1];
                        byte var39 = arg7[arg9][arg0 - 1];
                        if (var37.field2457) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class428.method2516(arg4, arg3 ^ 0xA, var37);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var40 &= 0x7;
                                var41 &= 0x7;
                                if (class31.field411[var38][var41] && class395.field5817[var40] <= var37.field2441) {
                                    class270.field3996[var40] = var37.field2454;
                                    class360.field5462[var40] = var42;
                                    class385.field5694[var40] = arg4.method556() ? var37.field2440 : var37.field2439;
                                    class25.field322[var40] = var37.field2438;
                                    if (class395.field5817[var40] == var37.field2441) {
                                        class400.field5850[var40] = class347.method2139(class400.field5850[var40], 32);
                                    } else {
                                        class400.field5850[var40] = 32;
                                    }
                                    class395.field5817[var40] = var37.field2441;
                                }
                                var40--;
                                var41++;
                            }
                            if (!var15[arg2 & 0x3]) {
                                arg1[0] = class468.field6583[var38][class412.method2463(3, var39 + 2)];
                            }
                        } else if (!var15[arg2 & 0x3]) {
                            arg1[0] = class3.field68[var38][class412.method2463(var39 + 2, 3)];
                        }
                    }
                }
            }
            if ((arg13 - 1) > arg0) {
                int var44 = arg10[arg9][arg0 + 1] & 0xFF;
                if (var44 > 0) {
                    class172 var45 = this.field704.method1599((byte) 114, var44 - 1);
                    if (var45.field2454 != -1) {
                        byte var46 = arg11[arg9][arg0 + 1];
                        byte var47 = arg7[arg9][arg0 + 1];
                        if (var45.field2457) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class428.method2516(arg4, 116, var45);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var48 &= 0x7;
                                var49 &= 0x7;
                                if (class31.field411[var46][var49] && var45.field2441 >= class395.field5817[var48]) {
                                    class270.field3996[var48] = var45.field2454;
                                    class360.field5462[var48] = var50;
                                    class385.field5694[var48] = arg4.method556() ? var45.field2440 : var45.field2439;
                                    class25.field322[var48] = var45.field2438;
                                    if (class395.field5817[var48] == var45.field2441) {
                                        class400.field5850[var48] = class347.method2139(class400.field5850[var48], 16);
                                    } else {
                                        class400.field5850[var48] = 16;
                                    }
                                    class395.field5817[var48] = var45.field2441;
                                }
                                var48++;
                                var49--;
                            }
                            if (!var15[arg2 + 2 & 0x3]) {
                                arg1[2] = class468.field6583[var46][class412.method2463(3, var47)];
                            }
                        } else if (!var15[arg2 + 2 & 0x3]) {
                            arg1[2] = class3.field68[var46][class412.method2463(3, var47)];
                        }
                    }
                }
            }
            if (arg9 > 0) {
                int var52 = arg10[arg9 - 1][arg0] & 0xFF;
                if (var52 > 0) {
                    class172 var53 = this.field704.method1599((byte) -94, var52 - 1);
                    if (var53.field2454 != -1) {
                        byte var54 = arg11[arg9 - 1][arg0];
                        byte var55 = arg7[arg9 - 1][arg0];
                        if (var53.field2457) {
                            int var56 = 6;
                            int var57 = var55 * 2 + 4;
                            int var58 = class428.method2516(arg4, 110, var53);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var57 &= 0x7;
                                var56 &= 0x7;
                                if (class31.field411[var54][var57] && var53.field2441 >= class395.field5817[var56]) {
                                    class270.field3996[var56] = var53.field2454;
                                    class360.field5462[var56] = var58;
                                    class385.field5694[var56] = arg4.method556() ? var53.field2440 : var53.field2439;
                                    class25.field322[var56] = var53.field2438;
                                    if (class395.field5817[var56] == var53.field2441) {
                                        class400.field5850[var56] = class347.method2139(class400.field5850[var56], 8);
                                    } else {
                                        class400.field5850[var56] = 8;
                                    }
                                    class395.field5817[var56] = var53.field2441;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg2 + 3 & 0x3]) {
                                arg1[3] = class468.field6583[var54][class412.method2463(var55 + 1, 3)];
                            }
                        } else if (!var15[arg2 + 3 & 0x3]) {
                            arg1[3] = class3.field68[var54][class412.method2463(3, var55 + 1)];
                        }
                    }
                }
            }
            if ((arg8 - 1) > arg9) {
                int var60 = arg10[arg9 + 1][arg0] & 0xFF;
                if (var60 > 0) {
                    class172 var61 = this.field704.method1599((byte) 123, var60 - 1);
                    if (var61.field2454 != -1) {
                        byte var62 = arg11[arg9 + 1][arg0];
                        byte var63 = arg7[arg9 + 1][arg0];
                        if (var61.field2457) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class428.method2516(arg4, 114, var61);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var64 &= 0x7;
                                var65 &= 0x7;
                                if (class31.field411[var62][var65] && class395.field5817[var64] <= var61.field2441) {
                                    class270.field3996[var64] = var61.field2454;
                                    class360.field5462[var64] = var66;
                                    class385.field5694[var64] = arg4.method556() ? var61.field2440 : var61.field2439;
                                    class25.field322[var64] = var61.field2438;
                                    if (class395.field5817[var64] == var61.field2441) {
                                        class400.field5850[var64] = class347.method2139(class400.field5850[var64], 4);
                                    } else {
                                        class400.field5850[var64] = 4;
                                    }
                                    class395.field5817[var64] = var61.field2441;
                                }
                                var65++;
                                var64--;
                            }
                            if (!var15[arg2 + 1 & 0x3]) {
                                arg1[1] = class468.field6583[var62][class412.method2463(var63 + 3, 3)];
                            }
                        } else if (!var15[arg2 + 1 & 0x3]) {
                            arg1[1] = class3.field68[var62][class412.method2463(3, var63 + 3)];
                        }
                    }
                }
            }
        }
        if (arg3 != 116) {
            this.field706 = null;
        }
        if (arg6 == null) {
            return;
        }
        int var68 = class428.method2516(arg4, -76, arg6);
        if (!arg6.field2457) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg2 * 2 & 0x7;
            if (class31.field411[arg5][var69] && arg6.field2441 >= class395.field5817[var70]) {
                class270.field3996[var70] = arg6.field2454;
                class360.field5462[var70] = var68;
                class385.field5694[var70] = arg4.method556() ? arg6.field2440 : arg6.field2439;
                class25.field322[var70] = arg6.field2438;
                if (class395.field5817[var70] == arg6.field2441) {
                    class400.field5850[var70] = class347.method2139(class400.field5850[var70], 2);
                } else {
                    class400.field5850[var70] = 2;
                }
                class395.field5817[var70] = arg6.field2441;
            }
        }
        return;
    }
}
