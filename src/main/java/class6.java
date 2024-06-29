import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "[I")
    private int[] field90 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "[I")
    private int[] field106 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public int field105;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Lvo;")
    private class31 field89;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Z")
    public boolean field94;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "Lkb;")
    private class467 field111;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "[[[B")
    private byte[][][] field95;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "[[[I")
    public int[][][] field99;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "[[[B")
    public byte[][][] field103;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "[[[B")
    private byte[][][] field113;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "[[[B")
    private byte[][][] field104;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "[[[B")
    private byte[][][] field116;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[[B")
    public static byte[][] field91 = new byte[50][];

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lak;")
    public static class222 field97 = new class222(10, 2, 2, 0);

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "Liu;")
    public static class390 field114 = new class390(17, 3);

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "[[[B")
    public byte[][][] field110;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZIIILae;IIIII)V", line = 16)
    private final void method46(int arg0, boolean arg1, int arg2, int arg3, int arg4, class156 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field86++;
        if (arg7 == 1) {
            arg2 = 1;
        } else if (arg7 == 2) {
            arg2 = 1;
            arg10 = 1;
        } else if (arg7 == 3) {
            arg10 = 1;
        }
        if (arg4 >= 0 && this.field102 > arg4 && arg3 >= 0 && arg3 < this.field105) {
            if (!this.field94 && !arg1) {
                class379.field5661[arg6][arg4][arg3] = 0;
            }
            while (true) {
                int var12 = arg5.method941((byte) 125);
                if (var12 == 0) {
                    if (this.field94) {
                        this.field99[0][arg4 + arg10][arg2 + arg3] = 0;
                    } else if (arg6 == 0) {
                        this.field99[0][arg4 + arg10][arg2 + arg3] = -class131.method726(-128, arg0 + 556238, 932731 - -arg8) * 8 << 0;
                    } else {
                        this.field99[arg6][arg4 + arg10][arg2 + arg3] = this.field99[arg6 - 1][arg4 + arg10][arg3 + arg2] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg5.method941((byte) 126);
                    if (this.field94) {
                        this.field99[0][arg4 + arg10][arg3 + arg2] = var13 * 8 << 0;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg6 == 0) {
                            this.field99[0][arg4 + arg10][arg2 + arg3] = -var13 * 8 << 0;
                        } else {
                            this.field99[arg6][arg4 + arg10][arg3 + arg2] = this.field99[arg6 - 1][arg4 + arg10][arg2 + arg3] - (var13 * 8 << 0);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg1) {
                        arg5.method941((byte) 123);
                    } else {
                        this.field95[arg6][arg4][arg3] = arg5.method946(37);
                        this.field104[arg6][arg4][arg3] = (byte) ((var12 - 2) / 4);
                        this.field116[arg6][arg4][arg3] = (byte) class500.method3013(3, arg7 + var12 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!this.field94 && !arg1) {
                        class379.field5661[arg6][arg4][arg3] = (byte) (var12 - 49);
                    }
                } else if (!arg1) {
                    this.field113[arg6][arg4][arg3] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg5.method941((byte) 124);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg5.method941((byte) 123);
                    break;
                }
                if (var14 <= 49) {
                    arg5.method941((byte) 125);
                }
            }
        }
        if (arg9 != 4) {
            this.method57(null, null, null, null, -103, (byte) -16, null);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)Llk;", line = 149)
    public static final class397 method47(byte arg0, int arg1) {
        if (arg0 >= -35) {
            return null;
        }
        field96++;
        if (arg1 == 0) {
            return new class111();
        } else if (arg1 == 1) {
            return new class89();
        } else if (arg1 == 2) {
            return new class237();
        } else if (arg1 == 3) {
            return new class69();
        } else if (arg1 == 4) {
            return new class378();
        } else if (arg1 == 5) {
            return new class188();
        } else if (arg1 == 6) {
            return new class150();
        } else if (arg1 == 7) {
            return new class78();
        } else if (arg1 == 8) {
            return new class4();
        } else if (arg1 == 9) {
            return new class158();
        } else if (arg1 == 10) {
            return new class300();
        } else if (arg1 == 11) {
            return new class488();
        } else if (arg1 == 12) {
            return new class115();
        } else if (arg1 == 13) {
            return new class415();
        } else if (arg1 == 14) {
            return new class392();
        } else if (arg1 == 15) {
            return new class208();
        } else if (arg1 == 16) {
            return new class153();
        } else if (arg1 == 17) {
            return new class259();
        } else if (arg1 == 18) {
            return new class251();
        } else if (arg1 == 19) {
            return new class358();
        } else if (arg1 == 20) {
            return new class112();
        } else if (arg1 == 21) {
            return new class92();
        } else if (arg1 == 22) {
            return new class506();
        } else if (arg1 == 23) {
            return new class292();
        } else if (arg1 == 24) {
            return new class181();
        } else if (arg1 == 25) {
            return new class341();
        } else if (arg1 == 26) {
            return new class291();
        } else if (arg1 == 27) {
            return new class161();
        } else if (arg1 == 28) {
            return new class174();
        } else if (arg1 == 29) {
            return new class449();
        } else if (arg1 == 30) {
            return new class228();
        } else if (arg1 == 31) {
            return new class128();
        } else if (arg1 == 32) {
            return new class18();
        } else if (arg1 == 33) {
            return new class340();
        } else if (arg1 == 34) {
            return new class306();
        } else if (arg1 == 35) {
            return new class35();
        } else if (arg1 == 36) {
            return new class166();
        } else if (arg1 == 37) {
            return new class376();
        } else if (arg1 == 38) {
            return new class289();
        } else if (arg1 == 39) {
            return new class71();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Log;Log;Log;ILeq;I[[I)V", line = 467)
    private final void method48(class441 arg0, class441 arg1, class441 arg2, int arg3, class134 arg4, int arg5, int[][] arg6) {
        field100++;
        if (arg3 >= -39) {
            this.field111 = null;
        }
        byte[][] var8 = this.field104[arg5];
        byte[][] var9 = this.field116[arg5];
        byte[][] var10 = this.field113[arg5];
        byte[][] var11 = this.field95[arg5];
        for (int var12 = 0; var12 < this.field102; var12++) {
            int var13 = var12 >= (this.field102 - 1) ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field105; var14++) {
                int var15 = var14 < this.field105 - 1 ? var14 + 1 : var14;
                if (class450.field6562 == -1 || class195.method1222(class450.field6562, var12, arg5, false, var14)) {
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
                        class117 var26 = var21 == 0 ? null : this.field89.method253(-2, var21 - 1);
                        class285 var27 = var22 == 0 ? null : this.field111.method2735((byte) 48, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class117 var28 = var26;
                        if (var26 != null) {
                            if (var26.field1502 == -1 && var26.field1519 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field1514;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field102 > var12 && this.field105 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var34--;
                                var33--;
                            }
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var34++;
                            } else {
                                var34--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var35--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var36--;
                                var33--;
                            }
                            int var37 = var33 - var35;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg0.method848(var12, var14) - arg0.method848(var13, var15);
                                var38 = arg0.method848(var13, var14) - arg0.method848(var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class282.field4030[var39] = -1;
                            class127.field1625[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field1514 ? class51.field762[var19] : class416.field6157[var19];
                        this.method55(var26, var27, var11, this.field105, var14, arg4, var20, var12, this.field102, var19, var9, var8, var18, -50);
                        boolean var41 = var26 != null && var26.field1519 != var26.field1502;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class282.field4030[var42] >= 0 && class55.field853[var42] != class107.field1428[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class164.method1036(var18[1], class500.method3013(class127.field1625[4], class127.field1625[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class164.method1036(var18[3], class500.method3013(class127.field1625[6], class127.field1625[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class164.method1036(var18[0], class500.method3013(class127.field1625[0], class127.field1625[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class164.method1036(var18[2], class500.method3013(class127.field1625[6], class127.field1625[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var46 = var26 == null ? 0 : class246.field3536[var19];
                            var49 = var27 == null ? 0 : class230.field3223[var19];
                            var45 = class399.field5880[var19];
                            var48 = class326.field4757[var19];
                            var47 = class317.field4658[var19];
                        } else if (var17) {
                            var45 = class97.field1296[var19];
                            var44 = class168.field2214[var19];
                            var46 = var26 == null ? 0 : class127.field1629[var19];
                            var47 = class488.field7472[var19];
                            var48 = class75.field1070[var19];
                            var49 = var27 == null ? 0 : class345.field4993[var19];
                        } else {
                            var47 = class160.field2073[var19];
                            var45 = class34.field553[var19];
                            var49 = var27 == null ? 0 : class391.field5795[var19];
                            var44 = class336.field4871[var19];
                            var48 = class201.field2789[var19];
                            var46 = var26 == null ? 0 : class83.field1131[var19];
                        }
                        int var50 = var46 + var49;
                        if (var50 <= 0) {
                            class456.method2660(arg5, var12, var14);
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
                            int[] var60 = arg1 == null ? null : new int[var53];
                            int[] var61 = arg1 == null && arg2 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field1502;
                                var63 = arg4.method831() ? var26.field1506 : var26.field1521;
                                var64 = var26.field1509;
                                int var65 = class381.method2299(var26, 39, arg4);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class457.field6667[0] = var47[var51];
                                        class457.field6667[1] = 1;
                                        class457.field6667[2] = var48[var51];
                                        class457.field6667[3] = 1;
                                        class457.field6667[4] = var45[var51];
                                        var68 = 6;
                                        class457.field6667[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class457.field6667[0] = var47[var51];
                                        class457.field6667[1] = 5;
                                        class457.field6667[2] = var48[var51];
                                        class457.field6667[3] = 5;
                                        class457.field6667[4] = var45[var51];
                                        var68 = 6;
                                        class457.field6667[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class457.field6667[0] = var47[var51];
                                        class457.field6667[1] = 3;
                                        class457.field6667[2] = var48[var51];
                                        class457.field6667[3] = 3;
                                        class457.field6667[4] = var45[var51];
                                        var68 = 6;
                                        class457.field6667[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class457.field6667[0] = var47[var51];
                                        class457.field6667[1] = 7;
                                        class457.field6667[2] = var48[var51];
                                        class457.field6667[3] = 7;
                                        class457.field6667[4] = var45[var51];
                                        var68 = 6;
                                        class457.field6667[5] = var48[var51];
                                    } else {
                                        class457.field6667[0] = var47[var51];
                                        class457.field6667[1] = var45[var51];
                                        class457.field6667[2] = var48[var51];
                                        var68 = 3;
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class457.field6667[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field90[var70];
                                        int var73 = this.field106[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 128 - var72;
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
                                        if (var60 != null && class281.field4022[var19][var70]) {
                                            int var76 = (var12 << 7) + var74;
                                            int var77 = (var14 << 7) + var75;
                                            var60[var52] = arg1.method855(var76, var77) - arg0.method855(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class281.field4022[var19][var70]) {
                                                int var78 = (var12 << 7) + var74;
                                                int var79 = (var14 << 7) + var75;
                                                var61[var52] = arg0.method855(var78, var79) - arg1.method855(var78, var79);
                                            } else if (arg2 != null && !class470.field6796[var19][var70]) {
                                                int var80 = (var12 << 7) + var74;
                                                int var81 = (var14 << 7) + var75;
                                                var61[var52] = arg2.method855(var80, var81) - arg0.method855(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && var26.field1513 < class282.field4030[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class107.field1428[var71];
                                            }
                                            var59[var52] = class181.field2589[var71];
                                            var58[var52] = class434.field6369[var71];
                                            var57[var52] = class55.field853[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg4.method831() ? var26.field1506 : var26.field1521;
                                            var59[var52] = var26.field1509;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field94 && arg5 == 0) {
                                    class165.method1043(var12, var14, var26.field1516, var26.field1511 * 8, var26.field1504);
                                }
                                if (var19 != 12 && var26.field1502 != -1 && var26.field1512) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class246.field3536[var19];
                            } else if (var17) {
                                var51 += class127.field1629[var19];
                            } else {
                                var51 += class83.field1131[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class285 var82 = this.field111.method2735((byte) 64, var22 - 1);
                                class285 var83 = this.field111.method2735((byte) 93, var23 - 1);
                                class285 var84 = this.field111.method2735((byte) 95, var24 - 1);
                                class285 var85 = this.field111.method2735((byte) 82, var25 - 1);
                                for (int var86 = 0; var86 < var49; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class457.field6667[0] = var47[var51];
                                        class457.field6667[1] = 1;
                                        class457.field6667[2] = var48[var51];
                                        class457.field6667[3] = 1;
                                        class457.field6667[4] = var45[var51];
                                        class457.field6667[5] = var48[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class457.field6667[0] = var47[var51];
                                        class457.field6667[1] = 5;
                                        class457.field6667[2] = var48[var51];
                                        class457.field6667[3] = 5;
                                        class457.field6667[4] = var45[var51];
                                        var88 = 6;
                                        class457.field6667[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class457.field6667[0] = var47[var51];
                                        class457.field6667[1] = 3;
                                        class457.field6667[2] = var48[var51];
                                        class457.field6667[3] = 3;
                                        class457.field6667[4] = var45[var51];
                                        class457.field6667[5] = var48[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class457.field6667[0] = var47[var51];
                                        class457.field6667[1] = 7;
                                        class457.field6667[2] = var48[var51];
                                        class457.field6667[3] = 7;
                                        class457.field6667[4] = var45[var51];
                                        class457.field6667[5] = var48[var51];
                                        var88 = 6;
                                    } else {
                                        class457.field6667[0] = var47[var51];
                                        class457.field6667[1] = var45[var51];
                                        class457.field6667[2] = var48[var51];
                                        var88 = 3;
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class457.field6667[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field90[var90];
                                        int var93 = this.field106[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 128 - var92;
                                        } else if (var20 == 2) {
                                            var95 = 128 - var93;
                                            var94 = 128 - var92;
                                        } else if (var20 == 3) {
                                            var94 = 128 - var93;
                                            var95 = var92;
                                        } else {
                                            var94 = var92;
                                            var95 = var93;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class281.field4022[var19][var90]) {
                                            int var96 = (var12 << 7) + var94;
                                            int var97 = (var14 << 7) + var95;
                                            var60[var52] = arg1.method855(var96, var97) - arg0.method855(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class281.field4022[var19][var90]) {
                                                int var98 = (var12 << 7) + var94;
                                                int var99 = (var14 << 7) + var95;
                                                var61[var52] = arg0.method855(var98, var99) - arg1.method855(var98, var99);
                                            } else if (arg2 != null && !class470.field6796[var19][var90]) {
                                                int var100 = (var12 << 7) + var94;
                                                int var101 = (var14 << 7) + var95;
                                                var61[var52] = arg2.method855(var100, var101) - arg0.method855(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class282.field4030[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class107.field1428[var91];
                                            }
                                            var59[var52] = class181.field2589[var91];
                                            var58[var52] = class434.field6369[var91];
                                            var57[var52] = class55.field853[var91];
                                        } else {
                                            if (var17 && class281.field4022[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var82.field4062;
                                                var59[var52] = var82.field4070;
                                            } else if (var94 == 0 && var95 == 128) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var83.field4062;
                                                var59[var52] = var83.field4070;
                                            } else if (var94 == 128 && var95 == 128) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var84.field4062;
                                                var59[var52] = var84.field4070;
                                            } else if (var94 == 128 && var95 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var85.field4062;
                                                var59[var52] = var85.field4070;
                                            } else {
                                                if (var94 < 64) {
                                                    if (var95 >= 64) {
                                                        var58[var52] = var83.field4062;
                                                        var59[var52] = var83.field4070;
                                                    } else {
                                                        var58[var52] = var82.field4062;
                                                        var59[var52] = var82.field4070;
                                                    }
                                                } else if (var95 >= 64) {
                                                    var58[var52] = var84.field4062;
                                                    var59[var52] = var84.field4070;
                                                } else {
                                                    var58[var52] = var85.field4062;
                                                    var59[var52] = var85.field4070;
                                                }
                                                int var102 = class258.method1599(127, arg6[var12][var14], arg6[var13][var14], var94 << 7 >> 7);
                                                int var103 = class258.method1599(127, arg6[var12][var15], arg6[var13][var15], var94 << 7 >> 7);
                                                var57[var52] = class258.method1599(127, var102, var103, var95 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field4061) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg0.method848(var12, var14);
                            int var105 = arg0.method848(var13, var14);
                            int var106 = arg0.method848(var13, var15);
                            int var107 = arg0.method848(var12, var15);
                            if (arg5 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field1520) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field103[arg5][var12][var14] = (byte) class51.method379(this.field103[arg5][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field94) {
                                var109 = class339.method2060(var12, var14);
                                var110 = class1.method1(var12, var14);
                                var111 = class506.method3041(var12, var14);
                            }
                            arg0.method862(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class456.method2660(arg5, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V", line = 1327)
    public static final void method49(int arg0, byte arg1) {
        field92++;
        if (arg0 == -1 || !class370.field5561[arg0]) {
            return;
        }
        class184.field2616.method1464(arg0, false);
        class181.field2591[arg0] = null;
        class135.field1730[arg0] = null;
        int var2 = 64 / ((arg1 - 49) / 61);
        class370.field5561[arg0] = false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 1346)
    public static void method50(byte arg0) {
        field97 = null;
        if (arg0 == -59) {
            field114 = null;
            field91 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([[[I[Lqo;ILeq;)V", line = 1358)
    public final void method51(int[][][] arg0, class19[] arg1, int arg2, class134 arg3) {
        if (!this.field94) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field102; var6++) {
                    for (int var7 = 0; var7 < this.field105; var7++) {
                        if ((class379.field5661[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class379.field5661[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method132(var7, var6, false);
                            }
                        }
                    }
                }
            }
        }
        field87++;
        for (int var9 = arg2; var9 < this.field115; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field94) {
                if (class63.field930) {
                    var11 |= 0x8;
                }
                if (class153.field1967) {
                    var10 |= 0x2;
                }
                if (class103.field1391 != 0) {
                    if (class280.field4012 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class153.field1967) {
                var11 |= 0x7;
            }
            int[][] var12 = arg0 == null || var9 >= arg0.length ? this.field99[var9] : arg0[var9];
            class49.method373(var9, arg3.method753(this.field102, this.field105, this.field99[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLae;IIII[Lqo;)V", line = 1448)
    public final void method52(byte arg0, class156 arg1, int arg2, int arg3, int arg4, int arg5, class19[] arg6) {
        if (!this.field94) {
            for (int var8 = 0; var8 < 4; var8++) {
                class19 var9 = arg6[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg2 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && var12 < this.field102 && var13 >= 0 && var13 < this.field105) {
                            var9.method133(var12, var13, 90);
                        }
                    }
                }
            }
        }
        field88++;
        int var14 = arg2 + arg4;
        if (arg0 > -88) {
            return;
        }
        int var15 = arg3 + arg5;
        for (int var16 = 0; var16 < this.field115; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method46(var15 + var18, false, 0, arg3 + var18, arg2 + var17, arg1, var16, 0, var14 + var17, 4, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIII)V", line = 1527)
    public final void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg1; var7 < arg1 + arg2; var7++) {
            for (int var10 = arg3; var10 < arg3 + arg5; var10++) {
                if (var10 >= 0 && this.field102 > var10 && var7 >= 0 && this.field105 > var7) {
                    this.field99[arg4][var10][var7] = arg4 <= 0 ? 0 : this.field99[arg4 - 1][var10][var7] - 240;
                }
            }
        }
        field112++;
        if (arg3 > 0 && arg3 < this.field102) {
            for (int var8 = arg1 + 1; var8 < (arg1 + arg2); var8++) {
                if (var8 >= 0 && var8 < this.field105) {
                    this.field99[arg4][arg3][var8] = this.field99[arg4][arg3 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < this.field105) {
            for (int var9 = arg3 + 1; var9 < arg3 + arg5; var9++) {
                if (var9 >= 0 && this.field102 > var9) {
                    this.field99[arg4][var9][arg1] = this.field99[arg4][var9][arg1 - 1];
                }
            }
        }
        if (arg3 >= 0 && arg1 >= 0 && arg3 < this.field102 && arg1 < this.field105) {
            if (arg4 == 0) {
                if (arg3 > 0 && this.field99[arg4][arg3 - 1][arg1] != 0) {
                    this.field99[arg4][arg3][arg1] = this.field99[arg4][arg3 - 1][arg1];
                } else if (arg1 > 0 && this.field99[arg4][arg3][arg1 - 1] != 0) {
                    this.field99[arg4][arg3][arg1] = this.field99[arg4][arg3][arg1 - 1];
                } else if (arg3 > 0 && arg1 > 0 && this.field99[arg4][arg3 - 1][arg1 - 1] != 0) {
                    this.field99[arg4][arg3][arg1] = this.field99[arg4][arg3 - 1][arg1 - 1];
                }
            } else if (arg3 > 0 && this.field99[arg4][arg3 - 1][arg1] != this.field99[arg4 - 1][arg3 - 1][arg1]) {
                this.field99[arg4][arg3][arg1] = this.field99[arg4][arg3 - 1][arg1];
            } else if (arg1 > 0 && this.field99[arg4 - 1][arg3][arg1 - 1] != this.field99[arg4][arg3][arg1 - 1]) {
                this.field99[arg4][arg3][arg1] = this.field99[arg4][arg3][arg1 - 1];
            } else if (arg3 > 0 && arg1 > 0 && this.field99[arg4 - 1][arg3 - 1][arg1 - 1] != this.field99[arg4][arg3 - 1][arg1 - 1]) {
                this.field99[arg4][arg3][arg1] = this.field99[arg4][arg3 - 1][arg1 - 1];
            }
        }
        if (arg0 < 64) {
            this.method58(null, (byte) -116, 68);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIZLvo;Lkb;)V", line = 2622)
    public class6(int arg0, int arg1, int arg2, boolean arg3, class31 arg4, class467 arg5) {
        this.field105 = arg2;
        this.field89 = arg4;
        this.field115 = arg0;
        this.field94 = arg3;
        this.field111 = arg5;
        this.field102 = arg1;
        this.field95 = new byte[this.field115][this.field102][this.field105];
        this.field99 = new int[this.field115][this.field102 + 1][this.field105 + 1];
        this.field103 = new byte[this.field115][this.field102 + 1][this.field105 + 1];
        this.field113 = new byte[this.field115][this.field102][this.field105];
        this.field104 = new byte[this.field115][this.field102][this.field105];
        this.field116 = new byte[this.field115][this.field102][this.field105];
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIII[Lqo;Lae;II)V", line = 1631)
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class19[] arg6, class156 arg7, int arg8, int arg9) {
        field98++;
        int var11 = (arg4 & 0x7) * 8;
        if (!this.field94) {
            class19 var12 = arg6[arg3];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg9 + class503.method3030(var13 & 0x7, 66, arg2, var14 & 0x7);
                    int var16 = arg0 + class227.method1398(arg2, (byte) -91, var13 & 0x7, var14 & 0x7);
                    if (var15 > 0 && var15 < (this.field102 - 1) && var16 > 0 && (this.field105 - 1) > var16) {
                        var12.method133(var15, var16, arg8 + 12040);
                    }
                }
            }
        }
        int var17 = (arg5 & 0x7) * 8;
        int var18 = arg4 & 0x1FFFFFF8 << 3;
        int var19 = (arg5 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg8 != -11968) {
            this.method53(81, -116, -12, -99, 95, 120);
        }
        if (arg2 == 1) {
            var21 = 1;
        } else if (arg2 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg2 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field115; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 != var22 || var11 > var23 || var23 > (var11 + 8) || var24 < var17 || (var17 + 8) < var24) {
                        this.method46(0, false, 0, -1, -1, arg7, 0, 0, 0, 4, 0);
                    } else if (var11 + 8 == var23 || (var17 + 8) == var24) {
                        int var31;
                        int var32;
                        if (arg2 == 0) {
                            var31 = var24 - (var17 - arg0);
                            var32 = arg9 + var23 - var11;
                        } else if (arg2 == 1) {
                            var31 = -var23 - (-var11 - (arg0 + 8));
                            var32 = arg9 + var24 - var17;
                        } else if (arg2 == 2) {
                            var31 = var17 + arg0 + 8 - var24;
                            var32 = var11 + arg9 + 8 - var23;
                        } else {
                            var31 = var23 + arg0 - var11;
                            var32 = arg9 + var17 + 8 - var24;
                        }
                        this.method46(var19 + var24, true, 0, var31, var32, arg7, arg3, 0, var18 + var23, 4, 0);
                    } else {
                        int var25 = arg9 + class503.method3030(var23 & 0x7, arg8 ^ 0xFFFFD13B, arg2, var24 & 0x7);
                        int var26 = arg0 + class227.method1398(arg2, (byte) -81, var23 & 0x7, var24 & 0x7);
                        this.method46(var19 + var24, false, var21, var26, var25, arg7, arg3, arg2, var18 + var23, 4, var20);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg2 == 0) {
                                var29 = var28 + arg0 - var17;
                                var30 = arg9 - (var11 - var27);
                            } else if (arg2 == 1) {
                                var30 = arg9 + var28 - var17;
                                var29 = var11 + 8 - (var27 - arg0);
                            } else if (arg2 == 2) {
                                var30 = var11 + arg9 + 8 - var27;
                                var29 = var17 + arg0 + 8 - var28;
                            } else {
                                var29 = var27 + arg0 - var11;
                                var30 = var17 + arg9 + 8 - var28;
                            }
                            if (var30 >= 0 && var30 < this.field102 && var29 >= 0 && this.field105 > var29) {
                                this.field99[arg3][var30][var29] = this.field99[arg3][var20 + var25][var26 + var21];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lvp;Lgr;[[BIILeq;IIII[[B[[B[ZI)V", line = 1811)
    private final void method55(class117 arg0, class285 arg1, byte[][] arg2, int arg3, int arg4, class134 arg5, int arg6, int arg7, int arg8, int arg9, byte[][] arg10, byte[][] arg11, boolean[] arg12, int arg13) {
        field101++;
        if (arg0 != null && arg1 != null || arg1 != null && arg9 == 12 || arg0 != null && arg9 == 0) {
            boolean[] var15 = arg0 != null && arg0.field1514 ? class51.field762[arg9] : class416.field6157[arg9];
            if (arg4 > 0) {
                if (arg7 > 0) {
                    int var16 = arg2[arg7 - 1][arg4 - 1] & 0xFF;
                    if (var16 > 0) {
                        class117 var17 = this.field89.method253(arg13 ^ 0x30, var16 - 1);
                        if (var17.field1502 != -1 && var17.field1514) {
                            byte var18 = arg11[arg7 - 1][arg4 - 1];
                            int var19 = arg10[arg7 - 1][arg4 - 1] * 2 + 4 & 0x7;
                            int var20 = class381.method2299(var17, 39, arg5);
                            if (class281.field4022[var18][var19]) {
                                class55.field853[0] = var17.field1502;
                                class107.field1428[0] = var20;
                                class434.field6369[0] = arg5.method831() ? var17.field1506 : var17.field1521;
                                class181.field2589[0] = var17.field1509;
                                class282.field4030[0] = var17.field1513;
                                class127.field1625[0] = 256;
                            }
                        }
                    }
                }
                if (arg8 - 1 > arg7) {
                    int var21 = arg2[arg7 + 1][arg4 - 1] & 0xFF;
                    if (var21 > 0) {
                        class117 var22 = this.field89.method253(-2, var21 - 1);
                        if (var22.field1502 != -1 && var22.field1514) {
                            byte var23 = arg11[arg7 + 1][arg4 - 1];
                            int var24 = arg10[arg7 + 1][arg4 - 1] * 2 + 6 & 0x7;
                            int var25 = class381.method2299(var22, arg13 ^ 0xFFFFFF9E, arg5);
                            if (class281.field4022[var23][var24]) {
                                class55.field853[2] = var22.field1502;
                                class107.field1428[2] = var25;
                                class434.field6369[2] = arg5.method831() ? var22.field1506 : var22.field1521;
                                class181.field2589[2] = var22.field1509;
                                class282.field4030[2] = var22.field1513;
                                class127.field1625[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg4 < arg3 - 1) {
                if (arg7 > 0) {
                    int var26 = arg2[arg7 - 1][arg4 + 1] & 0xFF;
                    if (var26 > 0) {
                        class117 var27 = this.field89.method253(-2, var26 - 1);
                        if (var27.field1502 != -1 && var27.field1514) {
                            byte var28 = arg11[arg7 - 1][arg4 + 1];
                            int var29 = arg10[arg7 - 1][arg4 + 1] * 2 + 2 & 0x7;
                            int var30 = class381.method2299(var27, 90, arg5);
                            if (class281.field4022[var28][var29]) {
                                class55.field853[6] = var27.field1502;
                                class107.field1428[6] = var30;
                                class434.field6369[6] = arg5.method831() ? var27.field1506 : var27.field1521;
                                class181.field2589[6] = var27.field1509;
                                class282.field4030[6] = var27.field1513;
                                class127.field1625[6] = 64;
                            }
                        }
                    }
                }
                if (arg7 < arg8 - 1) {
                    int var31 = arg2[arg7 + 1][arg4 + 1] & 0xFF;
                    if (var31 > 0) {
                        class117 var32 = this.field89.method253(-2, var31 - 1);
                        if (var32.field1502 != -1 && var32.field1514) {
                            byte var33 = arg11[arg7 + 1][arg4 + 1];
                            int var34 = arg10[arg7 + 1][arg4 + 1] * 2 & 0x7;
                            int var35 = class381.method2299(var32, 90, arg5);
                            if (class281.field4022[var33][var34]) {
                                class55.field853[4] = var32.field1502;
                                class107.field1428[4] = var35;
                                class434.field6369[4] = arg5.method831() ? var32.field1506 : var32.field1521;
                                class181.field2589[4] = var32.field1509;
                                class282.field4030[4] = var32.field1513;
                                class127.field1625[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg4 > 0) {
                int var36 = arg2[arg7][arg4 - 1] & 0xFF;
                if (var36 > 0) {
                    class117 var37 = this.field89.method253(arg13 + 48, var36 - 1);
                    if (var37.field1502 != -1) {
                        byte var38 = arg11[arg7][arg4 - 1];
                        byte var39 = arg10[arg7][arg4 - 1];
                        if (var37.field1514) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class381.method2299(var37, 33, arg5);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var41 &= 0x7;
                                var40 &= 0x7;
                                if (class281.field4022[var38][var41] && var37.field1513 >= class282.field4030[var40]) {
                                    class55.field853[var40] = var37.field1502;
                                    class107.field1428[var40] = var42;
                                    class434.field6369[var40] = arg5.method831() ? var37.field1506 : var37.field1521;
                                    class181.field2589[var40] = var37.field1509;
                                    if (class282.field4030[var40] == var37.field1513) {
                                        class127.field1625[var40] = class51.method379(class127.field1625[var40], 32);
                                    } else {
                                        class127.field1625[var40] = 32;
                                    }
                                    class282.field4030[var40] = var37.field1513;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg6 & 0x3]) {
                                arg12[0] = class51.field762[var38][class500.method3013(3, var39 + 2)];
                            }
                        } else if (!var15[arg6 & 0x3]) {
                            arg12[0] = class416.field6157[var38][class500.method3013(3, var39 + 2)];
                        }
                    }
                }
            }
            if ((arg3 - 1) > arg4) {
                int var44 = arg2[arg7][arg4 + 1] & 0xFF;
                if (var44 > 0) {
                    class117 var45 = this.field89.method253(-2, var44 - 1);
                    if (var45.field1502 != -1) {
                        byte var46 = arg11[arg7][arg4 + 1];
                        byte var47 = arg10[arg7][arg4 + 1];
                        if (var45.field1514) {
                            int var48 = 4;
                            int var49 = (var47 * 2) + 2;
                            int var50 = class381.method2299(var45, arg13 ^ 0xFFFFFFD4, arg5);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var49 &= 0x7;
                                var48 &= 0x7;
                                if (class281.field4022[var46][var49] && var45.field1513 >= class282.field4030[var48]) {
                                    class55.field853[var48] = var45.field1502;
                                    class107.field1428[var48] = var50;
                                    class434.field6369[var48] = arg5.method831() ? var45.field1506 : var45.field1521;
                                    class181.field2589[var48] = var45.field1509;
                                    if (class282.field4030[var48] == var45.field1513) {
                                        class127.field1625[var48] = class51.method379(class127.field1625[var48], 16);
                                    } else {
                                        class127.field1625[var48] = 16;
                                    }
                                    class282.field4030[var48] = var45.field1513;
                                }
                                var49--;
                                var48++;
                            }
                            if (!var15[arg6 + 2 & 0x3]) {
                                arg12[2] = class51.field762[var46][class500.method3013(-(-var47), 3)];
                            }
                        } else if (!var15[arg6 + 2 & 0x3]) {
                            arg12[2] = class416.field6157[var46][class500.method3013(-(-var47), 3)];
                        }
                    }
                }
            }
            if (arg7 > 0) {
                int var52 = arg2[arg7 - 1][arg4] & 0xFF;
                if (var52 > 0) {
                    class117 var53 = this.field89.method253(-2, var52 - 1);
                    if (var53.field1502 != -1) {
                        byte var54 = arg11[arg7 - 1][arg4];
                        byte var55 = arg10[arg7 - 1][arg4];
                        if (var53.field1514) {
                            int var56 = 6;
                            int var57 = var55 * 2 + 4;
                            int var58 = class381.method2299(var53, 28, arg5);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var57 &= 0x7;
                                var56 &= 0x7;
                                if (class281.field4022[var54][var57] && var53.field1513 >= class282.field4030[var56]) {
                                    class55.field853[var56] = var53.field1502;
                                    class107.field1428[var56] = var58;
                                    class434.field6369[var56] = arg5.method831() ? var53.field1506 : var53.field1521;
                                    class181.field2589[var56] = var53.field1509;
                                    if (class282.field4030[var56] == var53.field1513) {
                                        class127.field1625[var56] = class51.method379(class127.field1625[var56], 8);
                                    } else {
                                        class127.field1625[var56] = 8;
                                    }
                                    class282.field4030[var56] = var53.field1513;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg6 + 3 & 0x3]) {
                                arg12[3] = class51.field762[var54][class500.method3013(3, var55 + 1)];
                            }
                        } else if (!var15[arg6 + 3 & 0x3]) {
                            arg12[3] = class416.field6157[var54][class500.method3013(var55 + 1, 3)];
                        }
                    }
                }
            }
            if (arg8 - 1 > arg7) {
                int var60 = arg2[arg7 + 1][arg4] & 0xFF;
                if (var60 > 0) {
                    class117 var61 = this.field89.method253(-2, var60 - 1);
                    if (var61.field1502 != -1) {
                        byte var62 = arg11[arg7 + 1][arg4];
                        byte var63 = arg10[arg7 + 1][arg4];
                        if (var61.field1514) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class381.method2299(var61, 106, arg5);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var65 &= 0x7;
                                var64 &= 0x7;
                                if (class281.field4022[var62][var65] && class282.field4030[var64] <= var61.field1513) {
                                    class55.field853[var64] = var61.field1502;
                                    class107.field1428[var64] = var66;
                                    class434.field6369[var64] = arg5.method831() ? var61.field1506 : var61.field1521;
                                    class181.field2589[var64] = var61.field1509;
                                    if (class282.field4030[var64] == var61.field1513) {
                                        class127.field1625[var64] = class51.method379(class127.field1625[var64], 4);
                                    } else {
                                        class127.field1625[var64] = 4;
                                    }
                                    class282.field4030[var64] = var61.field1513;
                                }
                                var64--;
                                var65++;
                            }
                            if (!var15[arg6 + 1 & 0x3]) {
                                arg12[1] = class51.field762[var62][class500.method3013(3, var63 + 3)];
                            }
                        } else if (!var15[arg6 + 1 & 0x3]) {
                            arg12[1] = class416.field6157[var62][class500.method3013(var63 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg0 != null) {
            int var68 = class381.method2299(arg0, arg13 ^ 0xFFFFFF94, arg5);
            if (arg0.field1514) {
                for (int var69 = 0; var69 < 8; var69++) {
                    int var70 = var69 - (arg6 * 2) & 0x7;
                    if (class281.field4022[arg9][var69] && arg0.field1513 >= class282.field4030[var70]) {
                        class55.field853[var70] = arg0.field1502;
                        class107.field1428[var70] = var68;
                        class434.field6369[var70] = arg5.method831() ? arg0.field1506 : arg0.field1521;
                        class181.field2589[var70] = arg0.field1509;
                        if (class282.field4030[var70] == arg0.field1513) {
                            class127.field1625[var70] = class51.method379(class127.field1625[var70], 2);
                        } else {
                            class127.field1625[var70] = 2;
                        }
                        class282.field4030[var70] = arg0.field1513;
                    }
                }
            }
        }
        if (arg13 != -50) {
            this.field116 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V", line = 2283)
    public final void method56(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field93++;
        if (arg1 < 53) {
            this.field116 = null;
        }
        for (int var6 = 0; var6 < this.field115; var6++) {
            this.method53(117, arg4, arg0, arg2, var6, arg3);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([[ILog;Log;Log;IBLeq;)V", line = 2309)
    private final void method57(int[][] arg0, class441 arg1, class441 arg2, class441 arg3, int arg4, byte arg5, class134 arg6) {
        for (int var8 = 0; var8 < this.field102; var8++) {
            for (int var9 = 0; var9 < this.field105; var9++) {
                if (class450.field6562 == -1 || class195.method1222(class450.field6562, var8, arg4, false, var9)) {
                    byte var10 = this.field104[arg4][var8][var9];
                    byte var11 = this.field116[arg4][var8][var9];
                    int var12 = this.field95[arg4][var8][var9] & 0xFF;
                    int var13 = this.field113[arg4][var8][var9] & 0xFF;
                    class117 var14 = var12 == 0 ? null : this.field89.method253(-2, var12 - 1);
                    class285 var15 = var13 == 0 ? null : this.field111.method2735((byte) 54, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class230.field3223[var10];
                        var17 = var14 == null ? 0 : class246.field3536[var10];
                    } else if (var14 != null) {
                        var17 = class246.field3536[var10];
                    } else if (var15 != null) {
                        var16 = class246.field3536[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field1502 == -1 && var14.field1519 == -1 && var14.field1506 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg6.method831() ? var14.field1506 : var14.field1521;
                            if (class124.field1612) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field1509;
                                if (var14.field1502 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field1502;
                                }
                                if (var14.field1519 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field1519;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field94 && arg4 == 0) {
                                class165.method1043(var8, var9, var14.field1516, var14.field1511 * 8, var14.field1504);
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
                            int var28 = var15.field4062;
                            if (class124.field1612) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field4070;
                                var20[var19] = arg0[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field90.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg1 == null ? null : new int[var31];
                        int[] var35 = arg1 == null && arg2 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field90[var36];
                            int var46 = this.field106[var36];
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
                            if (var34 != null && class281.field4022[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg1.method855(var49, var50) - arg3.method855(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg1 != null && !class281.field4022[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg3.method855(var51, var52) - arg1.method855(var51, var52);
                                } else if (arg2 != null && !class470.field6796[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg2.method855(var53, var54) - arg3.method855(var53, var54);
                                }
                            }
                        }
                        int var37 = arg3.method848(var8, var9);
                        int var38 = arg3.method848(var8 + 1, var9);
                        int var39 = arg3.method848(var8 + 1, var9 + 1);
                        int var40 = arg3.method848(var8, var9 + 1);
                        if (arg4 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field1520) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field103[arg4][var8][var9] = (byte) class51.method379(this.field103[arg4][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field94) {
                            var42 = class339.method2060(var8, var9);
                            var43 = class1.method1(var8, var9);
                            var44 = class506.method3041(var8, var9);
                        }
                        arg3.method865(var8, var9, var32, var34, var33, var35, class317.field4658[var10], class399.field5880[var10], class326.field4757[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class456.method2660(arg4, var8, var9);
                    }
                }
            }
        }
        if (arg5 < 90) {
            this.field110 = null;
        }
        field108++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([[IBI)V", line = 2641)
    public final void method58(int[][] arg0, byte arg1, int arg2) {
        field107++;
        int[][] var4 = this.field99[arg2];
        if (arg1 > -84) {
            this.method46(-68, false, 2, 5, -93, null, 2, 96, -7, -96, 119);
        }
        for (int var5 = 0; var5 < this.field102 + 1; var5++) {
            for (int var6 = 0; var6 < this.field105 + 1; var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILeq;Log;Log;)V", line = 2668)
    public final void method59(int arg0, class134 arg1, class441 arg2, class441 arg3) {
        field109++;
        int[][] var5 = new int[this.field102][this.field105];
        if (class357.field5298 == null || class357.field5298.length != this.field105) {
            class223.field3157 = new int[this.field105];
            class450.field6566 = new int[this.field105];
            class165.field2162 = new int[this.field105];
            class357.field5298 = new int[this.field105];
            class479.field6930 = new int[this.field105];
        }
        for (int var6 = 0; var6 < this.field115; var6++) {
            for (int var8 = 0; var8 < this.field105; var8++) {
                class357.field5298[var8] = 0;
                class223.field3157[var8] = 0;
                class450.field6566[var8] = 0;
                class165.field2162[var8] = 0;
                class479.field6930[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field102; var9++) {
                for (int var10 = 0; var10 < this.field105; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field102) {
                        int var20 = this.field113[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class285 var21 = this.field111.method2735((byte) 83, var20 - 1);
                            class357.field5298[var10] += var21.field4060;
                            class223.field3157[var10] += var21.field4065;
                            class450.field6566[var10] += var21.field4069;
                            class165.field2162[var10] += var21.field4067;
                            var10002 = class479.field6930[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field113[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class285 var24 = this.field111.method2735((byte) 105, var23 - 1);
                            class357.field5298[var10] -= var24.field4060;
                            class223.field3157[var10] -= var24.field4065;
                            class450.field6566[var10] -= var24.field4069;
                            class165.field2162[var10] -= var24.field4067;
                            var10002 = class479.field6930[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field105; var16++) {
                        int var17 = var16 + 5;
                        if (this.field105 > var17) {
                            var13 += class450.field6566[var17];
                            var15 += class479.field6930[var17];
                            var12 += class223.field3157[var17];
                            var11 += class357.field5298[var17];
                            var14 += class165.field2162[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class450.field6566[var18];
                            var11 -= class357.field5298[var18];
                            var15 -= class479.field6930[var18];
                            var12 -= class223.field3157[var18];
                            var14 -= class165.field2162[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class310.method1860(var12 / var15, var13 / var15, var11 * 256 / var14, (byte) -124);
                        }
                    }
                }
            }
            if (class148.field1917) {
                this.method48(class311.field4527[var6], var6 == 0 ? arg2 : null, var6 == 0 ? arg3 : null, -52, arg1, var6, var5);
            } else {
                this.method57(var5, var6 == 0 ? arg2 : null, var6 == 0 ? arg3 : null, class311.field4527[var6], var6, (byte) 104, arg1);
            }
            this.field113[var6] = null;
            this.field95[var6] = null;
            this.field104[var6] = null;
            this.field116[var6] = null;
        }
        if (arg0 < 24) {
            return;
        }
        if (!this.field94) {
            if (class103.field1391 != 0) {
                class503.method3029();
            }
            if (class153.field1967) {
                class358.method2173();
            }
        }
        for (int var7 = 0; var7 < this.field115; var7++) {
            class311.field4527[var7].method847();
        }
    }
}
