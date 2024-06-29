import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class518 {

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "[I")
    private int[] field7631 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
    private int[] field7621 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public int field7639;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Z")
    public boolean field7626;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "Ldb;")
    private class210 field7638;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Lhn;")
    private class506 field7627;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public int field7623;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public int field7637;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "[[[B")
    private byte[][][] field7635;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "[[[B")
    private byte[][][] field7630;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "[[[B")
    private byte[][][] field7633;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "[[[B")
    public byte[][][] field7616;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "[[[B")
    private byte[][][] field7629;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "[[[I")
    public int[][][] field7641;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "J")
    public static long field7624 = -1L;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[[[B")
    public byte[][][] field7615;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI[[I)V")
    public final void method3042(byte arg0, int arg1, int[][] arg2) {
        field7619++;
        int[][] var4 = this.field7641[arg1];
        if (arg0 != 16) {
            field7624 = 85L;
        }
        for (int var5 = 0; var5 < (this.field7637 + 1); var5++) {
            for (int var6 = 0; var6 < this.field7623 + 1; var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILqa;I[[BIII[[B[[BLwp;Lmv;[ZII)V")
    private final void method3043(int arg0, class162 arg1, int arg2, byte[][] arg3, int arg4, int arg5, int arg6, byte[][] arg7, byte[][] arg8, class118 arg9, class252 arg10, boolean[] arg11, int arg12, int arg13) {
        field7628++;
        if (arg10 != null && arg9 != null || arg9 != null && arg13 == 12 || arg10 != null && arg13 == 0) {
            boolean[] var15 = arg10 != null && arg10.field3493 ? class273.field3720[arg13] : class4.field61[arg13];
            if (arg2 > 0) {
                if (arg12 > 0) {
                    int var16 = arg8[arg12 - 1][arg2 - 1] & 0xFF;
                    if (var16 > 0) {
                        class252 var17 = this.field7638.method1273(var16 - 1, (byte) 118);
                        if (var17.field3503 != -1 && var17.field3493) {
                            byte var18 = arg7[arg12 - 1][arg2 - 1];
                            int var19 = (arg3[arg12 - 1][arg2 - 1] * 2) + 4 & 0x7;
                            int var20 = class288.method1648(var17, arg1, false);
                            if (class412.field6034[var18][var19]) {
                                class246.field3433[0] = var17.field3503;
                                class423.field6172[0] = var20;
                                class302.field4138[0] = arg1.method450() ? var17.field3504 : var17.field3495;
                                class83.field1160[0] = var17.field3492;
                                class138.field1974[0] = var17.field3505;
                                class287.field3852[0] = 256;
                            }
                        }
                    }
                }
                if (arg0 - 1 > arg12) {
                    int var21 = arg8[arg12 + 1][arg2 - 1] & 0xFF;
                    if (var21 > 0) {
                        class252 var22 = this.field7638.method1273(var21 - 1, (byte) 119);
                        if (var22.field3503 != -1 && var22.field3493) {
                            byte var23 = arg7[arg12 + 1][arg2 - 1];
                            int var24 = arg3[arg12 + 1][arg2 - 1] * 2 + 6 & 0x7;
                            int var25 = class288.method1648(var22, arg1, false);
                            if (class412.field6034[var23][var24]) {
                                class246.field3433[2] = var22.field3503;
                                class423.field6172[2] = var25;
                                class302.field4138[2] = arg1.method450() ? var22.field3504 : var22.field3495;
                                class83.field1160[2] = var22.field3492;
                                class138.field1974[2] = var22.field3505;
                                class287.field3852[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg2 < arg6 - 1) {
                if (arg12 > 0) {
                    int var26 = arg8[arg12 - 1][arg2 + 1] & 0xFF;
                    if (var26 > 0) {
                        class252 var27 = this.field7638.method1273(var26 - 1, (byte) 115);
                        if (var27.field3503 != -1 && var27.field3493) {
                            byte var28 = arg7[arg12 - 1][arg2 + 1];
                            int var29 = arg3[arg12 - 1][arg2 + 1] * 2 + 2 & 0x7;
                            int var30 = class288.method1648(var27, arg1, false);
                            if (class412.field6034[var28][var29]) {
                                class246.field3433[6] = var27.field3503;
                                class423.field6172[6] = var30;
                                class302.field4138[6] = arg1.method450() ? var27.field3504 : var27.field3495;
                                class83.field1160[6] = var27.field3492;
                                class138.field1974[6] = var27.field3505;
                                class287.field3852[6] = 64;
                            }
                        }
                    }
                }
                if (arg12 < (arg0 - 1)) {
                    int var31 = arg8[arg12 + 1][arg2 + 1] & 0xFF;
                    if (var31 > 0) {
                        class252 var32 = this.field7638.method1273(var31 - 1, (byte) 126);
                        if (var32.field3503 != -1 && var32.field3493) {
                            byte var33 = arg7[arg12 + 1][arg2 + 1];
                            int var34 = -(-(arg3[arg12 + 1][arg2 + 1] * 2)) & 0x7;
                            int var35 = class288.method1648(var32, arg1, false);
                            if (class412.field6034[var33][var34]) {
                                class246.field3433[4] = var32.field3503;
                                class423.field6172[4] = var35;
                                class302.field4138[4] = arg1.method450() ? var32.field3504 : var32.field3495;
                                class83.field1160[4] = var32.field3492;
                                class138.field1974[4] = var32.field3505;
                                class287.field3852[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg2 > 0) {
                int var36 = arg8[arg12][arg2 - 1] & 0xFF;
                if (var36 > 0) {
                    class252 var37 = this.field7638.method1273(var36 - 1, (byte) 109);
                    if (var37.field3503 != -1) {
                        byte var38 = arg7[arg12][arg2 - 1];
                        byte var39 = arg3[arg12][arg2 - 1];
                        if (var37.field3493) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class288.method1648(var37, arg1, false);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var40 &= 0x7;
                                var41 &= 0x7;
                                if (class412.field6034[var38][var41] && class138.field1974[var40] <= var37.field3505) {
                                    class246.field3433[var40] = var37.field3503;
                                    class423.field6172[var40] = var42;
                                    class302.field4138[var40] = arg1.method450() ? var37.field3504 : var37.field3495;
                                    class83.field1160[var40] = var37.field3492;
                                    if (class138.field1974[var40] == var37.field3505) {
                                        class287.field3852[var40] = class25.method183(class287.field3852[var40], 32);
                                    } else {
                                        class287.field3852[var40] = 32;
                                    }
                                    class138.field1974[var40] = var37.field3505;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg5 & 0x3]) {
                                arg11[0] = class273.field3720[var38][class118.method750(var39 + 2, 3)];
                            }
                        } else if (!var15[-(-arg5) & 0x3]) {
                            arg11[0] = class4.field61[var38][class118.method750(3, var39 + 2)];
                        }
                    }
                }
            }
            if (arg6 - 1 > arg2) {
                int var44 = arg8[arg12][arg2 + 1] & 0xFF;
                if (var44 > 0) {
                    class252 var45 = this.field7638.method1273(var44 - 1, (byte) 112);
                    if (var45.field3503 != -1) {
                        byte var46 = arg7[arg12][arg2 + 1];
                        byte var47 = arg3[arg12][arg2 + 1];
                        if (var45.field3493) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class288.method1648(var45, arg1, false);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var48 &= 0x7;
                                var49 &= 0x7;
                                if (class412.field6034[var46][var49] && class138.field1974[var48] <= var45.field3505) {
                                    class246.field3433[var48] = var45.field3503;
                                    class423.field6172[var48] = var50;
                                    class302.field4138[var48] = arg1.method450() ? var45.field3504 : var45.field3495;
                                    class83.field1160[var48] = var45.field3492;
                                    if (class138.field1974[var48] == var45.field3505) {
                                        class287.field3852[var48] = class25.method183(class287.field3852[var48], 16);
                                    } else {
                                        class287.field3852[var48] = 16;
                                    }
                                    class138.field1974[var48] = var45.field3505;
                                }
                                var49--;
                                var48++;
                            }
                            if (!var15[arg5 + 2 & 0x3]) {
                                arg11[2] = class273.field3720[var46][class118.method750(3, var47)];
                            }
                        } else if (!var15[arg5 + 2 & 0x3]) {
                            arg11[2] = class4.field61[var46][class118.method750(3, var47)];
                        }
                    }
                }
            }
            if (arg12 > 0) {
                int var52 = arg8[arg12 - 1][arg2] & 0xFF;
                if (var52 > 0) {
                    class252 var53 = this.field7638.method1273(var52 - 1, (byte) 114);
                    if (var53.field3503 != -1) {
                        byte var54 = arg7[arg12 - 1][arg2];
                        byte var55 = arg3[arg12 - 1][arg2];
                        if (var53.field3493) {
                            int var56 = 6;
                            int var57 = var55 * 2 + 4;
                            int var58 = class288.method1648(var53, arg1, false);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var56 &= 0x7;
                                var57 &= 0x7;
                                if (class412.field6034[var54][var57] && var53.field3505 >= class138.field1974[var56]) {
                                    class246.field3433[var56] = var53.field3503;
                                    class423.field6172[var56] = var58;
                                    class302.field4138[var56] = arg1.method450() ? var53.field3504 : var53.field3495;
                                    class83.field1160[var56] = var53.field3492;
                                    if (class138.field1974[var56] == var53.field3505) {
                                        class287.field3852[var56] = class25.method183(class287.field3852[var56], 8);
                                    } else {
                                        class287.field3852[var56] = 8;
                                    }
                                    class138.field1974[var56] = var53.field3505;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg5 + 3 & 0x3]) {
                                arg11[3] = class273.field3720[var54][class118.method750(var55 + 1, 3)];
                            }
                        } else if (!var15[arg5 + 3 & 0x3]) {
                            arg11[3] = class4.field61[var54][class118.method750(var55 + 1, 3)];
                        }
                    }
                }
            }
            if (arg0 - 1 > arg12) {
                int var60 = arg8[arg12 + 1][arg2] & 0xFF;
                if (var60 > 0) {
                    class252 var61 = this.field7638.method1273(var60 - 1, (byte) 122);
                    if (var61.field3503 != -1) {
                        byte var62 = arg7[arg12 + 1][arg2];
                        byte var63 = arg3[arg12 + 1][arg2];
                        if (var61.field3493) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class288.method1648(var61, arg1, false);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var64 &= 0x7;
                                var65 &= 0x7;
                                if (class412.field6034[var62][var65] && var61.field3505 >= class138.field1974[var64]) {
                                    class246.field3433[var64] = var61.field3503;
                                    class423.field6172[var64] = var66;
                                    class302.field4138[var64] = arg1.method450() ? var61.field3504 : var61.field3495;
                                    class83.field1160[var64] = var61.field3492;
                                    if (class138.field1974[var64] == var61.field3505) {
                                        class287.field3852[var64] = class25.method183(class287.field3852[var64], 4);
                                    } else {
                                        class287.field3852[var64] = 4;
                                    }
                                    class138.field1974[var64] = var61.field3505;
                                }
                                var65++;
                                var64--;
                            }
                            if (!var15[arg5 + 1 & 0x3]) {
                                arg11[1] = class273.field3720[var62][class118.method750(3, var63 + 3)];
                            }
                        } else if (!var15[arg5 + 1 & 0x3]) {
                            arg11[1] = class4.field61[var62][class118.method750(var63 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg10 != null) {
            int var68 = class288.method1648(arg10, arg1, false);
            if (arg10.field3493) {
                for (int var69 = 0; var69 < 8; var69++) {
                    int var70 = var69 - (arg5 * 2) & 0x7;
                    if (class412.field6034[arg13][var69] && class138.field1974[var70] <= arg10.field3505) {
                        class246.field3433[var70] = arg10.field3503;
                        class423.field6172[var70] = var68;
                        class302.field4138[var70] = arg1.method450() ? arg10.field3504 : arg10.field3495;
                        class83.field1160[var70] = arg10.field3492;
                        if (class138.field1974[var70] == arg10.field3505) {
                            class287.field3852[var70] = class25.method183(class287.field3852[var70], 2);
                        } else {
                            class287.field3852[var70] = 2;
                        }
                        class138.field1974[var70] = arg10.field3505;
                    }
                }
            }
        }
        if (arg4 != 1) {
            this.field7639 = -2;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZLlh;IIIIIII)V")
    private final void method3044(int arg0, int arg1, boolean arg2, class365 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = -111 / ((arg9 - 7) / 37);
        if (arg0 == 1) {
            arg7 = 1;
        } else if (arg0 == 2) {
            arg7 = 1;
            arg8 = 1;
        } else if (arg0 == 3) {
            arg8 = 1;
        }
        field7618++;
        if (arg6 < 0 || this.field7637 <= arg6 || arg1 < 0 || this.field7623 <= arg1) {
            while (true) {
                int var15 = arg3.method2099(255);
                if (var15 == 0) {
                    return;
                }
                if (var15 == 1) {
                    arg3.method2099(255);
                    return;
                }
                if (var15 <= 49) {
                    arg3.method2099(255);
                }
            }
        }
        if (!this.field7626 && !arg2) {
            class456.field6661[arg4][arg6][arg1] = 0;
        }
        while (true) {
            int var13 = arg3.method2099(255);
            if (var13 == 0) {
                if (this.field7626) {
                    this.field7641[0][arg6 + arg8][arg1 + arg7] = 0;
                    return;
                } else if (arg4 == 0) {
                    this.field7641[0][arg6 + arg8][arg1 + arg7] = -class454.method2680(arg5 + 556238, arg10 + 932731, 6135) * 8 << 0;
                    return;
                } else {
                    this.field7641[arg4][arg6 + arg8][arg1 + arg7] = this.field7641[arg4 - 1][arg6 + arg8][arg1 + arg7] - 240;
                    return;
                }
            }
            if (var13 == 1) {
                int var14 = arg3.method2099(255);
                if (this.field7626) {
                    this.field7641[0][arg6 + arg8][arg1 + arg7] = var14 * 8 << 0;
                    return;
                }
                if (var14 == 1) {
                    var14 = 0;
                }
                if (arg4 == 0) {
                    this.field7641[0][arg6 + arg8][arg1 + arg7] = -var14 * 8 << 0;
                    return;
                }
                this.field7641[arg4][arg6 + arg8][arg1 + arg7] = this.field7641[arg4 - 1][arg6 + arg8][arg1 + arg7] - (var14 * 8 << 0);
                return;
            }
            if (var13 <= 49) {
                if (arg2) {
                    arg3.method2099(255);
                } else {
                    this.field7630[arg4][arg6][arg1] = arg3.method2081((byte) 0);
                    this.field7635[arg4][arg6][arg1] = (byte) ((var13 - 2) / 4);
                    this.field7633[arg4][arg6][arg1] = (byte) class118.method750(arg0 + var13 - 2, 3);
                }
            } else if (var13 <= 81) {
                if (!this.field7626 && !arg2) {
                    class456.field6661[arg4][arg6][arg1] = (byte) (var13 - 49);
                }
            } else if (!arg2) {
                this.field7629[arg4][arg6][arg1] = (byte) (var13 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lqa;ILna;Lna;)V")
    public final void method3045(class162 arg0, int arg1, class35 arg2, class35 arg3) {
        field7625++;
        int[][] var5 = new int[this.field7637][this.field7623];
        if (class344.field4744 == null || class344.field4744.length != this.field7623) {
            class270.field3694 = new int[this.field7623];
            class269.field3688 = new int[this.field7623];
            class23.field377 = new int[this.field7623];
            class344.field4744 = new int[this.field7623];
            class86.field1191 = new int[this.field7623];
        }
        if (arg1 != 27881) {
            return;
        }
        for (int var6 = 0; var6 < this.field7639; var6++) {
            for (int var8 = 0; var8 < this.field7623; var8++) {
                class344.field4744[var8] = 0;
                class269.field3688[var8] = 0;
                class86.field1191[var8] = 0;
                class23.field377[var8] = 0;
                class270.field3694[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field7637; var9++) {
                for (int var10 = 0; var10 < this.field7623; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field7637) {
                        int var20 = this.field7629[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class118 var21 = this.field7627.method2975((byte) 124, var20 - 1);
                            class344.field4744[var10] += var21.field1599;
                            class269.field3688[var10] += var21.field1586;
                            class86.field1191[var10] += var21.field1597;
                            class23.field377[var10] += var21.field1589;
                            var10002 = class270.field3694[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field7629[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class118 var24 = this.field7627.method2975((byte) 48, var23 - 1);
                            class344.field4744[var10] -= var24.field1599;
                            class269.field3688[var10] -= var24.field1586;
                            class86.field1191[var10] -= var24.field1597;
                            class23.field377[var10] -= var24.field1589;
                            var10002 = class270.field3694[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field7623; var16++) {
                        int var17 = var16 + 5;
                        if (this.field7623 > var17) {
                            var12 += class269.field3688[var17];
                            var11 += class344.field4744[var17];
                            var14 += class23.field377[var17];
                            var15 += class270.field3694[var17];
                            var13 += class86.field1191[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class86.field1191[var18];
                            var12 -= class269.field3688[var18];
                            var14 -= class23.field377[var18];
                            var11 -= class344.field4744[var18];
                            var15 -= class270.field3694[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class225.method1336(var11 * 256 / var14, var12 / var15, (byte) 26, var13 / var15);
                        }
                    }
                }
            }
            if (class454.field6633) {
                this.method3048(arg0, var6, var6 == 0 ? arg2 : null, (byte) 117, var5, var6 == 0 ? arg3 : null, class383.field5391[var6]);
            } else {
                this.method3050(var6 == 0 ? arg2 : null, arg0, var5, var6 == 0 ? arg3 : null, var6, true, class383.field5391[var6]);
            }
            this.field7629[var6] = null;
            this.field7630[var6] = null;
            this.field7635[var6] = null;
            this.field7633[var6] = null;
        }
        if (!this.field7626) {
            if (class281.field3790 != 0) {
                class415.method2483();
            }
            if (class455.field6645) {
                class12.method103();
            }
        }
        for (int var7 = 0; var7 < this.field7639; var7++) {
            class383.field5391[var7].method235();
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZLlh;[Lid;II)V")
    public final void method3046(int arg0, int arg1, boolean arg2, class365 arg3, class413[] arg4, int arg5, int arg6) {
        field7632++;
        if (!this.field7626) {
            for (int var8 = 0; var8 < 4; var8++) {
                class413 var9 = arg4[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg6 + var10;
                        int var13 = arg0 + var11;
                        if (var12 >= 0 && this.field7637 > var12 && var13 >= 0 && var13 < this.field7623) {
                            var9.method2475(-2097153, var13, var12);
                        }
                    }
                }
            }
        }
        int var14 = arg1 + arg6;
        int var15 = arg0 + arg5;
        for (int var16 = 0; var16 < this.field7639; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method3044(0, var18 + arg0, false, arg3, var16, var15 + var18, arg6 + var17, 0, 0, -83, var14 + var17);
                }
            }
        }
        if (arg2) {
            this.method3047(-128, -17, -119, -5, 36, -42);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V")
    public final void method3047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7640++;
        for (int var7 = arg5; var7 < (arg1 + arg5); var7++) {
            for (int var10 = arg0; var10 < (arg0 + arg4); var10++) {
                if (var10 >= 0 && this.field7637 > var10 && var7 >= 0 && var7 < this.field7623) {
                    this.field7641[arg3][var10][var7] = arg3 > 0 ? this.field7641[arg3 - 1][var10][var7] - 240 : 0;
                }
            }
        }
        if (~arg0 < arg2 && arg0 < this.field7637) {
            for (int var8 = arg5 + 1; var8 < arg1 + arg5; var8++) {
                if (var8 >= 0 && var8 < this.field7623) {
                    this.field7641[arg3][arg0][var8] = this.field7641[arg3][arg0 - 1][var8];
                }
            }
        }
        if (arg5 > 0 && arg5 < this.field7623) {
            for (int var9 = arg0 + 1; var9 < arg0 + arg4; var9++) {
                if (var9 >= 0 && var9 < this.field7637) {
                    this.field7641[arg3][var9][arg5] = this.field7641[arg3][var9][arg5 - 1];
                }
            }
        }
        if (arg0 < 0 || arg5 < 0 || arg0 >= this.field7637 || this.field7623 <= arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 > 0 && this.field7641[arg3][arg0 - 1][arg5] != 0) {
                this.field7641[arg3][arg0][arg5] = this.field7641[arg3][arg0 - 1][arg5];
                return;
            }
            if (arg5 > 0 && this.field7641[arg3][arg0][arg5 - 1] != 0) {
                this.field7641[arg3][arg0][arg5] = this.field7641[arg3][arg0][arg5 - 1];
                return;
            }
            if (arg0 > 0 && arg5 > 0 && this.field7641[arg3][arg0 - 1][arg5 - 1] != 0) {
                this.field7641[arg3][arg0][arg5] = this.field7641[arg3][arg0 - 1][arg5 - 1];
                return;
            }
        } else if (arg0 <= 0 || this.field7641[arg3][arg0 - 1][arg5] == this.field7641[arg3 - 1][arg0 - 1][arg5]) {
            if (arg5 > 0 && this.field7641[arg3][arg0][arg5 - 1] != this.field7641[arg3 - 1][arg0][arg5 - 1]) {
                this.field7641[arg3][arg0][arg5] = this.field7641[arg3][arg0][arg5 - 1];
                return;
            }
            if (arg0 > 0 && arg5 > 0 && this.field7641[arg3 - 1][arg0 - 1][arg5 - 1] != this.field7641[arg3][arg0 - 1][arg5 - 1]) {
                this.field7641[arg3][arg0][arg5] = this.field7641[arg3][arg0 - 1][arg5 - 1];
                return;
            }
            return;
        } else {
            this.field7641[arg3][arg0][arg5] = this.field7641[arg3][arg0 - 1][arg5];
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lqa;ILna;B[[ILna;Lna;)V")
    private final void method3048(class162 arg0, int arg1, class35 arg2, byte arg3, int[][] arg4, class35 arg5, class35 arg6) {
        field7620++;
        byte[][] var8 = this.field7635[arg1];
        byte[][] var9 = this.field7633[arg1];
        byte[][] var10 = this.field7629[arg1];
        byte[][] var11 = this.field7630[arg1];
        int var12 = 0;
        if (arg3 <= 73) {
            this.method3052(123, 52, 113, -74, null, 11, -102, 66, 84, null);
        }
        while (this.field7637 > var12) {
            int var13 = var12 >= (this.field7637 - 1) ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field7623; var14++) {
                int var15 = (this.field7623 - 1) > var14 ? var14 + 1 : var14;
                if (class222.field3094 == -1 || class361.method2003((byte) -43, var12, var14, class222.field3094, arg1)) {
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
                        class252 var26 = var21 == 0 ? null : this.field7638.method1273(var21 - 1, (byte) 106);
                        class118 var27 = var22 == 0 ? null : this.field7627.method2975((byte) -119, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class252 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3503 == -1 && var26.field3491 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3493;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field7637 && this.field7623 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var33--;
                                var35--;
                            }
                            if (var10[var13][var14] == var22) {
                                var34++;
                                var35++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var34--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var36--;
                                var33--;
                            }
                            int var37 = var33 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg6.method221(var12, var14) - arg6.method221(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg6.method221(var13, var14) - arg6.method221(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class138.field1974[var39] = -1;
                            class287.field3852[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3493 ? class273.field3720[var19] : class4.field61[var19];
                        this.method3043(this.field7637, arg0, var14, var9, 1, var20, this.field7623, var8, var11, var27, var26, var18, var12, var19);
                        boolean var41 = var26 != null && var26.field3503 != var26.field3491;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class138.field1974[var42] >= 0 && class423.field6172[var42] != class246.field3433[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class247.method1456(var18[1], class118.method750(class287.field3852[4], class287.field3852[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class247.method1456(var18[3], class118.method750(class287.field3852[0], class287.field3852[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class247.method1456(var18[0], class118.method750(class287.field3852[2], class287.field3852[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class247.method1456(var18[2], class118.method750(class287.field3852[6], class287.field3852[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var45 = var26 == null ? 0 : class209.field2955[var19];
                            var46 = var27 == null ? 0 : class366.field5134[var19];
                            var47 = class296.field4094[var19];
                            var48 = class200.field2862[var19];
                            var49 = class319.field4408[var19];
                        } else if (var17) {
                            var49 = class499.field7344[var19];
                            var45 = var26 == null ? 0 : client.field2805[var19];
                            var44 = class28.field420[var19];
                            var47 = class510.field7496[var19];
                            var46 = var27 == null ? 0 : class58.field790[var19];
                            var48 = class368.field5173[var19];
                        } else {
                            var47 = class76.field1098[var19];
                            var46 = var27 == null ? 0 : class467.field6833[var19];
                            var49 = class212.field3022[var19];
                            var48 = class287.field3853[var19];
                            var45 = var26 == null ? 0 : class424.field6192[var19];
                            var44 = class196.field2827[var19];
                        }
                        int var50 = var45 + var46;
                        if (var50 <= 0) {
                            class239.method1385(arg1, var12, var14);
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
                            int[] var61 = arg5 == null && arg2 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field3503;
                                var63 = arg0.method450() ? var26.field3504 : var26.field3495;
                                var64 = var26.field3492;
                                int var65 = class288.method1648(var26, arg0, false);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class209.field2967[0] = var47[var51];
                                        class209.field2967[1] = 1;
                                        class209.field2967[2] = var48[var51];
                                        class209.field2967[3] = 1;
                                        class209.field2967[4] = var49[var51];
                                        var98 = 6;
                                        class209.field2967[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class209.field2967[0] = var47[var51];
                                        class209.field2967[1] = 5;
                                        class209.field2967[2] = var48[var51];
                                        class209.field2967[3] = 5;
                                        class209.field2967[4] = var49[var51];
                                        class209.field2967[5] = var48[var51];
                                        var98 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class209.field2967[0] = var47[var51];
                                        class209.field2967[1] = 3;
                                        class209.field2967[2] = var48[var51];
                                        class209.field2967[3] = 3;
                                        class209.field2967[4] = var49[var51];
                                        class209.field2967[5] = var48[var51];
                                        var98 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class209.field2967[0] = var47[var51];
                                        class209.field2967[1] = 7;
                                        class209.field2967[2] = var48[var51];
                                        class209.field2967[3] = 7;
                                        class209.field2967[4] = var49[var51];
                                        class209.field2967[5] = var48[var51];
                                        var98 = 6;
                                    } else {
                                        class209.field2967[0] = var47[var51];
                                        class209.field2967[1] = var49[var51];
                                        var98 = 3;
                                        class209.field2967[2] = var48[var51];
                                    }
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class209.field2967[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field7621[var100];
                                        int var103 = this.field7631[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = 128 - var102;
                                            var105 = var103;
                                        } else if (var20 == 2) {
                                            var105 = 128 - var102;
                                            var104 = 128 - var103;
                                        } else if (var20 == 3) {
                                            var104 = var102;
                                            var105 = 128 - var103;
                                        } else {
                                            var105 = var102;
                                            var104 = var103;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var104;
                                        if (var60 != null && class412.field6034[var19][var100]) {
                                            int var106 = (var12 << 7) + var105;
                                            int var107 = (var14 << 7) + var104;
                                            var60[var52] = arg5.method232(var106, var107) - arg6.method232(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class412.field6034[var19][var100]) {
                                                int var108 = (var12 << 7) + var105;
                                                int var109 = (var14 << 7) + var104;
                                                var61[var52] = arg6.method232(var108, var109) - arg5.method232(var108, var109);
                                            } else if (arg2 != null && !class125.field1726[var19][var100]) {
                                                int var110 = (var12 << 7) + var105;
                                                int var111 = (var14 << 7) + var104;
                                                var61[var52] = arg2.method232(var110, var111) - arg6.method232(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && class138.field1974[var101] > var26.field3505) {
                                            if (var54 != null) {
                                                var54[var52] = class423.field6172[var101];
                                            }
                                            var59[var52] = class83.field1160[var101];
                                            var58[var52] = class302.field4138[var101];
                                            var57[var52] = class246.field3433[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg0.method450() ? var26.field3504 : var26.field3495;
                                            var59[var52] = var26.field3492;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field7626 && arg1 == 0) {
                                    class489.method2871(var12, var14, var26.field3508, var26.field3500 * 8, var26.field3502);
                                }
                                if (var19 != 12 && var26.field3503 != -1 && var26.field3498) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class209.field2955[var19];
                            } else if (var17) {
                                var51 += client.field2805[var19];
                            } else {
                                var51 += class424.field6192[var19];
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
                                class118 var67 = this.field7627.method2975((byte) 42, var22 - 1);
                                class118 var68 = this.field7627.method2975((byte) 109, var23 - 1);
                                class118 var69 = this.field7627.method2975((byte) 86, var24 - 1);
                                class118 var70 = this.field7627.method2975((byte) -124, var25 - 1);
                                for (int var71 = 0; var71 < var46; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class209.field2967[0] = var47[var51];
                                        class209.field2967[1] = 1;
                                        class209.field2967[2] = var48[var51];
                                        class209.field2967[3] = 1;
                                        class209.field2967[4] = var49[var51];
                                        class209.field2967[5] = var48[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class209.field2967[0] = var47[var51];
                                        class209.field2967[1] = 5;
                                        class209.field2967[2] = var48[var51];
                                        class209.field2967[3] = 5;
                                        class209.field2967[4] = var49[var51];
                                        var73 = 6;
                                        class209.field2967[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class209.field2967[0] = var47[var51];
                                        class209.field2967[1] = 3;
                                        class209.field2967[2] = var48[var51];
                                        class209.field2967[3] = 3;
                                        class209.field2967[4] = var49[var51];
                                        var73 = 6;
                                        class209.field2967[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class209.field2967[0] = var47[var51];
                                        class209.field2967[1] = 7;
                                        class209.field2967[2] = var48[var51];
                                        class209.field2967[3] = 7;
                                        class209.field2967[4] = var49[var51];
                                        class209.field2967[5] = var48[var51];
                                        var73 = 6;
                                    } else {
                                        class209.field2967[0] = var47[var51];
                                        class209.field2967[1] = var49[var51];
                                        class209.field2967[2] = var48[var51];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class209.field2967[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field7621[var75];
                                        int var78 = this.field7631[var75];
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
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class412.field6034[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg5.method232(var81, var82) - arg6.method232(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class412.field6034[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg6.method232(var83, var84) - arg5.method232(var83, var84);
                                            } else if (arg2 != null && !class125.field1726[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg2.method232(var85, var86) - arg6.method232(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class138.field1974[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class423.field6172[var76];
                                            }
                                            var59[var52] = class83.field1160[var76];
                                            var58[var52] = class302.field4138[var76];
                                            var57[var52] = class246.field3433[var76];
                                        } else {
                                            if (var17 && class412.field6034[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg4[var12][var14];
                                                var58[var52] = var67.field1584;
                                                var59[var52] = var67.field1595;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg4[var12][var15];
                                                var58[var52] = var68.field1584;
                                                var59[var52] = var68.field1595;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg4[var13][var15];
                                                var58[var52] = var69.field1584;
                                                var59[var52] = var69.field1595;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg4[var13][var14];
                                                var58[var52] = var70.field1584;
                                                var59[var52] = var70.field1595;
                                            } else {
                                                if (var80 >= 64) {
                                                    if (var79 < 64) {
                                                        var58[var52] = var70.field1584;
                                                        var59[var52] = var70.field1595;
                                                    } else {
                                                        var58[var52] = var69.field1584;
                                                        var59[var52] = var69.field1595;
                                                    }
                                                } else if (var79 >= 64) {
                                                    var58[var52] = var68.field1584;
                                                    var59[var52] = var68.field1595;
                                                } else {
                                                    var58[var52] = var67.field1584;
                                                    var59[var52] = var67.field1595;
                                                }
                                                int var87 = class528.method3104(arg4[var12][var14], 64512, var80 << 7 >> 7, arg4[var13][var14]);
                                                int var88 = class528.method3104(arg4[var12][var15], 64512, var80 << 7 >> 7, arg4[var13][var15]);
                                                var57[var52] = class528.method3104(var87, 64512, var79 << 7 >> 7, var88);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field1592) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg6.method221(var12, var14);
                            int var90 = arg6.method221(var13, var14);
                            int var91 = arg6.method221(var13, var15);
                            int var92 = arg6.method221(var12, var15);
                            if (arg1 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field3510) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field7616[arg1][var12][var14] = (byte) class25.method183(this.field7616[arg1][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field7626) {
                                var94 = class366.method2119(var12, var14);
                                var95 = class232.method1355(var12, var14);
                                var96 = class3.method18(var12, var14);
                            }
                            arg6.method223(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class239.method1385(arg1, var12, var14);
                        }
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)V")
    public final void method3049(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field7639; var6++) {
            this.method3047(arg3, arg0, -1, var6, arg2, arg1);
        }
        field7617++;
        if (arg4 != -24914) {
            this.method3046(-37, -84, true, null, null, 0, -60);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lna;Lqa;[[ILna;IZLna;)V")
    private final void method3050(class35 arg0, class162 arg1, int[][] arg2, class35 arg3, int arg4, boolean arg5, class35 arg6) {
        if (!arg5) {
            this.method3051(null, null, null, -26);
        }
        field7622++;
        for (int var8 = 0; var8 < this.field7637; var8++) {
            for (int var9 = 0; var9 < this.field7623; var9++) {
                if (class222.field3094 == -1 || class361.method2003((byte) -6, var8, var9, class222.field3094, arg4)) {
                    byte var10 = this.field7635[arg4][var8][var9];
                    byte var11 = this.field7633[arg4][var8][var9];
                    int var12 = this.field7630[arg4][var8][var9] & 0xFF;
                    int var13 = this.field7629[arg4][var8][var9] & 0xFF;
                    class252 var14 = var12 == 0 ? null : this.field7638.method1273(var12 - 1, (byte) 102);
                    class118 var15 = var13 == 0 ? null : this.field7627.method2975((byte) 76, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class209.field2955[var10];
                        var16 = var15 == null ? 0 : class366.field5134[var10];
                    } else if (var14 != null) {
                        var17 = class209.field2955[var10];
                    } else if (var15 != null) {
                        var16 = class209.field2955[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field3503 == -1 && var14.field3491 == -1 && var14.field3504 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg1.method450() ? var14.field3504 : var14.field3495;
                            if (class348.field4774) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field3492;
                                if (var14.field3503 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field3503;
                                }
                                if (var14.field3491 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field3491;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field7626 && arg4 == 0) {
                                class489.method2871(var8, var9, var14.field3508, var14.field3500 * 8, var14.field3502);
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
                            int var28 = var15.field1584;
                            if (class348.field4774) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field1595;
                                var20[var19] = arg2[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field7621.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg3 == null ? null : new int[var31];
                        int[] var35 = arg3 == null && arg0 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field7621[var36];
                            int var46 = this.field7631[var36];
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
                            if (var34 != null && class412.field6034[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg3.method232(var49, var50) - arg6.method232(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg3 != null && !class412.field6034[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg6.method232(var51, var52) - arg3.method232(var51, var52);
                                } else if (arg0 != null && !class125.field1726[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg0.method232(var53, var54) - arg6.method232(var53, var54);
                                }
                            }
                        }
                        int var37 = arg6.method221(var8, var9);
                        int var38 = arg6.method221(var8 + 1, var9);
                        int var39 = arg6.method221(var8 + 1, var9 + 1);
                        int var40 = arg6.method221(var8, var9 + 1);
                        if (arg4 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field3510) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field7616[arg4][var8][var9] = (byte) class25.method183(this.field7616[arg4][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field7626) {
                            var42 = class366.method2119(var8, var9);
                            var43 = class232.method1355(var8, var9);
                            var44 = class3.method18(var8, var9);
                        }
                        arg6.method222(var8, var9, var32, var34, var33, var35, class296.field4094[var10], class319.field4408[var10], class200.field2862[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class239.method1385(arg4, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([[[I[Lid;Lqa;I)V")
    public final void method3051(int[][][] arg0, class413[] arg1, class162 arg2, int arg3) {
        if (!this.field7626) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field7637; var6++) {
                    for (int var7 = 0; var7 < this.field7623; var7++) {
                        if ((class456.field6661[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class456.field6661[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method2470(var6, var7, false);
                            }
                        }
                    }
                }
            }
        }
        field7634++;
        for (int var9 = 0; var9 < this.field7639; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field7626) {
                if (class254.field3526) {
                    var11 |= 0x8;
                }
                if (class455.field6645) {
                    var10 |= 0x2;
                }
                if (class281.field3790 != 0) {
                    if (class448.field6479 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class455.field6645) {
                var11 |= 0x7;
            }
            if (!class261.field3587) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || var9 >= arg0.length ? this.field7641[var9] : arg0[var9];
            class152.method959(var9, arg2.method518(this.field7637, this.field7623, this.field7641[var9], var12, 128, var10, var11));
        }
        if (arg3 > -6) {
            this.field7633 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIILlh;IIII[Lid;)V")
    public final void method3052(int arg0, int arg1, int arg2, int arg3, class365 arg4, int arg5, int arg6, int arg7, int arg8, class413[] arg9) {
        field7636++;
        int var11 = (arg1 & 0x7) * 8;
        int var12 = (arg0 & 0x7) * 8;
        if (!this.field7626) {
            class413 var13 = arg9[arg2];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg3 + class347.method1922(arg5, var14 & 0x7, 74, var15 & 0x7);
                    int var17 = class495.method2927(var14 & 0x7, (byte) 104, var15 & 0x7, arg5) + arg7;
                    if (var16 > 0 && (this.field7637 - 1) > var16 && var17 > 0 && (this.field7623 - 1) > var17) {
                        var13.method2475(arg8 - 2097165, var17, var16);
                    }
                }
            }
        }
        if (arg8 != 12) {
            this.method3052(20, 73, 47, -108, null, 46, -38, 7, 127, null);
        }
        int var18 = (arg1 & 0xFFFFFFF8) << 3;
        int var19 = (arg0 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg5 == 1) {
            var21 = 1;
        } else if (arg5 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg5 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field7639; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg6 != var22 || var11 > var23 || var23 > (var11 + 8) || var12 > var24 || var24 > var12 + 8) {
                        this.method3044(0, -1, false, arg4, 0, 0, -1, 0, 0, 86, 0);
                    } else if (var11 + 8 == var23 || var12 + 8 == var24) {
                        int var31;
                        int var32;
                        if (arg5 == 0) {
                            var32 = arg3 - (var11 - var23);
                            var31 = arg7 - (var12 - var24);
                        } else if (arg5 == 1) {
                            var31 = var11 + arg7 + 8 - var23;
                            var32 = arg3 + var24 - var12;
                        } else if (arg5 == 2) {
                            var31 = var12 + arg7 + 8 - var24;
                            var32 = arg3 + 8 - (-var11 + var23);
                        } else {
                            var31 = var23 - (var11 - arg7);
                            var32 = var12 + arg3 + 8 - var24;
                        }
                        this.method3044(0, var31, true, arg4, arg2, var19 + var24, var32, 0, 0, -56, var18 + var23);
                    } else {
                        int var25 = arg3 + class347.method1922(arg5, var23 & 0x7, arg8 ^ 0xFFFFFF8A, var24 & 0x7);
                        int var26 = class495.method2927(var23 & 0x7, (byte) 104, var24 & 0x7, arg5) + arg7;
                        this.method3044(arg5, var26, false, arg4, arg2, var19 + var24, var25, var21, var20, arg8 ^ 0xFFFFFFBD, var18 + var23);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg5 == 0) {
                                var29 = var27 + arg3 - var11;
                                var30 = var28 - (var12 - arg7);
                            } else if (arg5 == 1) {
                                var29 = var28 + arg3 - var12;
                                var30 = var11 + arg7 + 8 - var27;
                            } else if (arg5 == 2) {
                                var29 = var11 + arg3 + 8 - var27;
                                var30 = var12 + arg7 + 8 - var28;
                            } else {
                                var29 = arg3 + 8 - (-var12 + var28);
                                var30 = arg7 + var27 - var11;
                            }
                            if (var29 >= 0 && var29 < this.field7637 && var30 >= 0 && this.field7623 > var30) {
                                this.field7641[arg2][var29][var30] = this.field7641[arg2][var20 + var25][var21 + var26];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIZLdb;Lhn;)V")
    public class518(int arg0, int arg1, int arg2, boolean arg3, class210 arg4, class506 arg5) {
        this.field7639 = arg0;
        this.field7626 = arg3;
        this.field7638 = arg4;
        this.field7627 = arg5;
        this.field7623 = arg2;
        this.field7637 = arg1;
        this.field7635 = new byte[this.field7639][this.field7637][this.field7623];
        this.field7630 = new byte[this.field7639][this.field7637][this.field7623];
        this.field7633 = new byte[this.field7639][this.field7637][this.field7623];
        this.field7616 = new byte[this.field7639][this.field7637 + 1][this.field7623 + 1];
        this.field7629 = new byte[this.field7639][this.field7637][this.field7623];
        this.field7641 = new int[this.field7639][this.field7637 + 1][this.field7623 + 1];
    }
}
