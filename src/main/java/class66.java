import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class66 {

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "[I")
    private int[] field1343 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "[I")
    private int[] field1352 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "Lcq;")
    private class329 field1333;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!iv", name = "A", descriptor = "Lri;")
    private class75 field1358;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "Z")
    public boolean field1342;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "[[[B")
    public byte[][][] field1354;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "[[[B")
    private byte[][][] field1345;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "[[[I")
    public int[][][] field1355;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "[[[B")
    private byte[][][] field1335;

    @OriginalMember(owner = "client!iv", name = "B", descriptor = "[[[B")
    private byte[][][] field1359;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "[[[B")
    private byte[][][] field1349;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "[[[B")
    public byte[][][] field1344;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "([Lsd;Lnn;IIBII)V", line = 5)
    public final void method575(class63[] arg0, class289 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1339++;
        if (!this.field1342) {
            for (int var8 = 0; var8 < 4; var8++) {
                class63 var9 = arg0[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg6 + var10;
                        int var13 = arg5 + var11;
                        if (var12 >= 0 && var12 < this.field1341 && var13 >= 0 && this.field1336 > var13) {
                            var9.method551(var13, var12, -4);
                        }
                    }
                }
            }
        }
        if (arg4 > -17) {
            return;
        }
        int var14 = arg3 + arg6;
        int var15 = arg2 + arg5;
        for (int var16 = 0; var16 < this.field1348; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method581(false, (byte) 99, var14 + var17, 0, arg6 + var17, 0, 0, arg1, var16, arg5 + var18, var15 + var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILza;Lqc;I[[BI[Z[[BII[[BILsb;I)V", line = 82)
    private final void method576(int arg0, class288 arg1, class526 arg2, int arg3, byte[][] arg4, int arg5, boolean[] arg6, byte[][] arg7, int arg8, int arg9, byte[][] arg10, int arg11, class193 arg12, int arg13) {
        field1347++;
        boolean[] var15 = arg12 != null && arg12.field3123 ? class215.field3398[arg13] : class136.field2294[arg13];
        if (arg5 > 0) {
            if (arg9 > 0) {
                int var16 = arg10[arg9 - 1][arg5 - 1] & 0xFF;
                if (var16 > 0) {
                    class193 var17 = this.field1333.method2077(var16 - 1, (byte) 64);
                    if (var17.field3114 != -1 && var17.field3123) {
                        byte var18 = arg4[arg9 - 1][arg5 - 1];
                        int var19 = arg7[arg9 - 1][arg5 - 1] * 2 + 4 & 0x7;
                        int var20 = class114.method949((byte) 74, var17, arg1);
                        if (class64.field1307[var18][var19]) {
                            class527.field7657[0] = var17.field3114;
                            class464.field6888[0] = var20;
                            class40.field570[0] = arg1.method421() ? var17.field3121 : var17.field3115;
                            class287.field4340[0] = var17.field3124;
                            class211.field3372[0] = var17.field3120;
                            class18.field294[0] = 256;
                        }
                    }
                }
            }
            if (arg9 < (arg11 - 1)) {
                int var21 = arg10[arg9 + 1][arg5 - 1] & 0xFF;
                if (var21 > 0) {
                    class193 var22 = this.field1333.method2077(var21 - 1, (byte) 64);
                    if (var22.field3114 != -1 && var22.field3123) {
                        byte var23 = arg4[arg9 + 1][arg5 - 1];
                        int var24 = arg7[arg9 + 1][arg5 - 1] * 2 + 6 & 0x7;
                        int var25 = class114.method949((byte) 21, var22, arg1);
                        if (class64.field1307[var23][var24]) {
                            class527.field7657[2] = var22.field3114;
                            class464.field6888[2] = var25;
                            class40.field570[2] = arg1.method421() ? var22.field3121 : var22.field3115;
                            class287.field4340[2] = var22.field3124;
                            class211.field3372[2] = var22.field3120;
                            class18.field294[2] = 512;
                        }
                    }
                }
            }
        }
        if ((arg8 - 1) > arg5) {
            if (arg9 > 0) {
                int var26 = arg10[arg9 - 1][arg5 + 1] & 0xFF;
                if (var26 > 0) {
                    class193 var27 = this.field1333.method2077(var26 - 1, (byte) 64);
                    if (var27.field3114 != -1 && var27.field3123) {
                        byte var28 = arg4[arg9 - 1][arg5 + 1];
                        int var29 = arg7[arg9 - 1][arg5 + 1] * 2 + 2 & 0x7;
                        int var30 = class114.method949((byte) 102, var27, arg1);
                        if (class64.field1307[var28][var29]) {
                            class527.field7657[6] = var27.field3114;
                            class464.field6888[6] = var30;
                            class40.field570[6] = arg1.method421() ? var27.field3121 : var27.field3115;
                            class287.field4340[6] = var27.field3124;
                            class211.field3372[6] = var27.field3120;
                            class18.field294[6] = 64;
                        }
                    }
                }
            }
            if ((arg11 - 1) > arg9) {
                int var31 = arg10[arg9 + 1][arg5 + 1] & 0xFF;
                if (var31 > 0) {
                    class193 var32 = this.field1333.method2077(var31 - 1, (byte) 64);
                    if (var32.field3114 != -1 && var32.field3123) {
                        byte var33 = arg4[arg9 + 1][arg5 + 1];
                        int var34 = arg7[arg9 + 1][arg5 + 1] * 2 & 0x7;
                        int var35 = class114.method949((byte) 88, var32, arg1);
                        if (class64.field1307[var33][var34]) {
                            class527.field7657[4] = var32.field3114;
                            class464.field6888[4] = var35;
                            class40.field570[4] = arg1.method421() ? var32.field3121 : var32.field3115;
                            class287.field4340[4] = var32.field3124;
                            class211.field3372[4] = var32.field3120;
                            class18.field294[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg5 > 0) {
            int var36 = arg10[arg9][arg5 - 1] & 0xFF;
            if (var36 > 0) {
                class193 var37 = this.field1333.method2077(var36 - 1, (byte) 64);
                if (var37.field3114 != -1) {
                    byte var38 = arg4[arg9][arg5 - 1];
                    byte var39 = arg7[arg9][arg5 - 1];
                    if (var37.field3123) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class114.method949((byte) 98, var37, arg1);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class64.field1307[var38][var41] && var37.field3120 >= class211.field3372[var40]) {
                                class527.field7657[var40] = var37.field3114;
                                class464.field6888[var40] = var42;
                                class40.field570[var40] = arg1.method421() ? var37.field3121 : var37.field3115;
                                class287.field4340[var40] = var37.field3124;
                                if (class211.field3372[var40] == var37.field3120) {
                                    class18.field294[var40] = class418.method2558(class18.field294[var40], 32);
                                } else {
                                    class18.field294[var40] = 32;
                                }
                                class211.field3372[var40] = var37.field3120;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[-(-arg0) & 0x3]) {
                            arg6[0] = class215.field3398[var38][class490.method2960(var39 + 2, 3)];
                        }
                    } else if (!var15[arg0 & 0x3]) {
                        arg6[0] = class136.field2294[var38][class490.method2960(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg8 - 1 > arg5) {
            int var44 = arg10[arg9][arg5 + 1] & 0xFF;
            if (var44 > 0) {
                class193 var45 = this.field1333.method2077(var44 - 1, (byte) 64);
                if (var45.field3114 != -1) {
                    byte var46 = arg4[arg9][arg5 + 1];
                    byte var47 = arg7[arg9][arg5 + 1];
                    if (var45.field3123) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class114.method949((byte) 97, var45, arg1);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class64.field1307[var46][var49] && var45.field3120 >= class211.field3372[var48]) {
                                class527.field7657[var48] = var45.field3114;
                                class464.field6888[var48] = var50;
                                class40.field570[var48] = arg1.method421() ? var45.field3121 : var45.field3115;
                                class287.field4340[var48] = var45.field3124;
                                if (class211.field3372[var48] == var45.field3120) {
                                    class18.field294[var48] = class418.method2558(class18.field294[var48], 16);
                                } else {
                                    class18.field294[var48] = 16;
                                }
                                class211.field3372[var48] = var45.field3120;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg0 + 2 & 0x3]) {
                            arg6[2] = class215.field3398[var46][class490.method2960(var47, 3)];
                        }
                    } else if (!var15[arg0 + 2 & 0x3]) {
                        arg6[2] = class136.field2294[var46][class490.method2960(3, var47)];
                    }
                }
            }
        }
        if (arg9 > 0) {
            int var52 = arg10[arg9 - 1][arg5] & 0xFF;
            if (var52 > 0) {
                class193 var53 = this.field1333.method2077(var52 - 1, (byte) 64);
                if (var53.field3114 != -1) {
                    byte var54 = arg4[arg9 - 1][arg5];
                    byte var55 = arg7[arg9 - 1][arg5];
                    if (var53.field3123) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class114.method949((byte) 69, var53, arg1);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class64.field1307[var54][var57] && var53.field3120 >= class211.field3372[var56]) {
                                class527.field7657[var56] = var53.field3114;
                                class464.field6888[var56] = var58;
                                class40.field570[var56] = arg1.method421() ? var53.field3121 : var53.field3115;
                                class287.field4340[var56] = var53.field3124;
                                if (class211.field3372[var56] == var53.field3120) {
                                    class18.field294[var56] = class418.method2558(class18.field294[var56], 8);
                                } else {
                                    class18.field294[var56] = 8;
                                }
                                class211.field3372[var56] = var53.field3120;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg0 + 3 & 0x3]) {
                            arg6[3] = class215.field3398[var54][class490.method2960(var55 + 1, 3)];
                        }
                    } else if (!var15[arg0 + 3 & 0x3]) {
                        arg6[3] = class136.field2294[var54][class490.method2960(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg9 < (arg11 - 1)) {
            int var60 = arg10[arg9 + 1][arg5] & 0xFF;
            if (var60 > 0) {
                class193 var61 = this.field1333.method2077(var60 - 1, (byte) 64);
                if (var61.field3114 != -1) {
                    byte var62 = arg4[arg9 + 1][arg5];
                    byte var63 = arg7[arg9 + 1][arg5];
                    if (var61.field3123) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class114.method949((byte) 83, var61, arg1);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class64.field1307[var62][var65] && class211.field3372[var64] <= var61.field3120) {
                                class527.field7657[var64] = var61.field3114;
                                class464.field6888[var64] = var66;
                                class40.field570[var64] = arg1.method421() ? var61.field3121 : var61.field3115;
                                class287.field4340[var64] = var61.field3124;
                                if (class211.field3372[var64] == var61.field3120) {
                                    class18.field294[var64] = class418.method2558(class18.field294[var64], 4);
                                } else {
                                    class18.field294[var64] = 4;
                                }
                                class211.field3372[var64] = var61.field3120;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg0 + 1 & 0x3]) {
                            arg6[1] = class215.field3398[var62][class490.method2960(var63 + 3, 3)];
                        }
                    } else if (!var15[arg0 + 1 & 0x3]) {
                        arg6[1] = class136.field2294[var62][class490.method2960(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg12 != null) {
            int var68 = class114.method949((byte) 65, arg12, arg1);
            if (arg12.field3123) {
                for (int var69 = 0; var69 < 8; var69++) {
                    int var70 = var69 - (arg0 * 2) & 0x7;
                    if (class64.field1307[arg13][var69] && class211.field3372[var70] <= arg12.field3120) {
                        class527.field7657[var70] = arg12.field3114;
                        class464.field6888[var70] = var68;
                        class40.field570[var70] = arg1.method421() ? arg12.field3121 : arg12.field3115;
                        class287.field4340[var70] = arg12.field3124;
                        if (class211.field3372[var70] == arg12.field3120) {
                            class18.field294[var70] = class418.method2558(class18.field294[var70], 2);
                        } else {
                            class18.field294[var70] = 2;
                        }
                        class211.field3372[var70] = arg12.field3120;
                    }
                }
            }
        }
        int var71 = -73 % ((82 - arg3) / 42);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)I", line = 541)
    public static final int method577(int arg0, int arg1) {
        if (arg0 == -1) {
            field1356++;
            return arg1 == 16711935 ? -1 : class226.method1506(arg1, -9388);
        } else {
            return -114;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIII)V", line = 560)
    public final void method578(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1332++;
        int var6 = -22 % ((arg0 + 2) / 37);
        for (int var7 = 0; var7 < this.field1348; var7++) {
            this.method586(arg3, arg2, 69, arg1, var7, arg4);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lza;[Lsd;[[[IB)V", line = 576)
    public final void method579(class288 arg0, class63[] arg1, int[][][] arg2, byte arg3) {
        if (!this.field1342) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field1341; var6++) {
                    for (int var7 = 0; var7 < this.field1336; var7++) {
                        if ((class22.field333[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class22.field333[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method564(var7, false, var6);
                            }
                        }
                    }
                }
            }
        }
        int var9 = -39 / ((arg3 + 6) / 41);
        field1346++;
        for (int var10 = 0; var10 < this.field1348; var10++) {
            int var11 = 0;
            int var12 = 0;
            if (!this.field1342) {
                if (class521.field7571) {
                    var11 |= 0x2;
                }
                if (class446.field6644) {
                    var12 |= 0x8;
                }
                if (class230.field3567 != 0) {
                    if (var10 == 0 | class27.field443) {
                        var12 |= 0x10;
                    }
                    var11 |= 0x1;
                }
            }
            if (class521.field7571) {
                var12 |= 0x7;
            }
            if (!class107.field1984) {
                var12 |= 0x20;
            }
            int[][] var13 = arg2 == null || arg2.length <= var10 ? this.field1355[var10] : arg2[var10];
            class316.method1996(var10, arg0.method376(this.field1341, this.field1336, this.field1355[var10], var13, 128, var11, var12));
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lya;IILya;Lya;[[ILza;)V", line = 683)
    private final void method580(class38 arg0, int arg1, int arg2, class38 arg3, class38 arg4, int[][] arg5, class288 arg6) {
        field1340++;
        byte[][] var8 = this.field1359[arg2];
        byte[][] var9 = this.field1335[arg2];
        byte[][] var10 = this.field1345[arg2];
        byte[][] var11 = this.field1349[arg2];
        if (arg1 >= -96) {
            return;
        }
        for (int var12 = 0; var12 < this.field1341; var12++) {
            int var13 = this.field1341 - 1 > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field1336; var14++) {
                int var15 = var14 < (this.field1336 - 1) ? var14 + 1 : var14;
                if (class179.field2882 == -1 || class377.method2314(arg2, class179.field2882, var14, var12, false)) {
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
                        class193 var26 = var21 == 0 ? null : this.field1333.method2077(var21 - 1, (byte) 64);
                        class526 var27 = var22 == 0 ? null : this.field1358.method679(32020, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class193 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3114 == -1 && var26.field3109 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3123;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field1341 > var12 && this.field1336 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var32++;
                                var35++;
                            } else {
                                var35--;
                                var32--;
                            }
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var34++;
                                var32++;
                            } else {
                                var34--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var34--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var35++;
                                var36++;
                            } else {
                                var35--;
                                var36--;
                            }
                            int var37 = var35 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg0.method177(var12, var14) - arg0.method177(var13, var15);
                                var38 = arg0.method177(var13, var14) - arg0.method177(var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class211.field3372[var39] = -1;
                            class18.field294[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3123 ? class215.field3398[var19] : class136.field2294[var19];
                        this.method576(var20, arg6, var27, 127, var8, var14, var18, var9, this.field1336, var12, var11, this.field1341, var26, var19);
                        boolean var41 = var26 != null && var26.field3114 != var26.field3109;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class211.field3372[var42] >= 0 && class527.field7657[var42] != class464.field6888[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class196.method1321(var18[1], class490.method2960(class18.field294[4], class18.field294[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class196.method1321(var18[3], class490.method2960(class18.field294[6], class18.field294[0]) == 0);
                        }
                        if (!var40[-(-var20) & 0x3]) {
                            var18[0] = class196.method1321(var18[0], class490.method2960(class18.field294[2], class18.field294[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class196.method1321(var18[2], class490.method2960(class18.field294[4], class18.field294[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var48 = var27 == null ? 0 : class479.field7065[var19];
                            var49 = class516.field7481[var19];
                            var47 = var26 == null ? 0 : class321.field4906[var19];
                            var46 = class18.field292[var19];
                            var45 = class1.field48[var19];
                        } else if (var17) {
                            var44 = class380.field5557[var19];
                            var45 = class188.field3016[var19];
                            var46 = class14.field256[var19];
                            var47 = var26 == null ? 0 : class186.field2982[var19];
                            var48 = var27 == null ? 0 : class372.field5457[var19];
                            var49 = class310.field4696[var19];
                        } else {
                            var44 = class382.field5590[var19];
                            var45 = class428.field6408[var19];
                            var48 = var27 == null ? 0 : class10.field140[var19];
                            var49 = class214.field3394[var19];
                            var46 = class151.field2495[var19];
                            var47 = var26 == null ? 0 : class415.field6266[var19];
                        }
                        int var50 = var47 + var48;
                        if (var50 <= 0) {
                            class52.method486(arg2, var12, var14);
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
                            int[] var61 = arg4 == null && arg3 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field3114;
                                var63 = arg6.method421() ? var26.field3121 : var26.field3115;
                                var64 = var26.field3124;
                                int var65 = class114.method949((byte) 68, var26, arg6);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class304.field4556[0] = var45[var51];
                                        class304.field4556[1] = 1;
                                        class304.field4556[2] = var49[var51];
                                        class304.field4556[3] = 1;
                                        class304.field4556[4] = var46[var51];
                                        var98 = 6;
                                        class304.field4556[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class304.field4556[0] = var45[var51];
                                        class304.field4556[1] = 5;
                                        class304.field4556[2] = var49[var51];
                                        class304.field4556[3] = 5;
                                        class304.field4556[4] = var46[var51];
                                        class304.field4556[5] = var49[var51];
                                        var98 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class304.field4556[0] = var45[var51];
                                        class304.field4556[1] = 3;
                                        class304.field4556[2] = var49[var51];
                                        class304.field4556[3] = 3;
                                        class304.field4556[4] = var46[var51];
                                        class304.field4556[5] = var49[var51];
                                        var98 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class304.field4556[0] = var45[var51];
                                        class304.field4556[1] = 7;
                                        class304.field4556[2] = var49[var51];
                                        class304.field4556[3] = 7;
                                        class304.field4556[4] = var46[var51];
                                        class304.field4556[5] = var49[var51];
                                        var98 = 6;
                                    } else {
                                        class304.field4556[0] = var45[var51];
                                        class304.field4556[1] = var46[var51];
                                        var98 = 3;
                                        class304.field4556[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class304.field4556[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field1352[var100];
                                        int var103 = this.field1343[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = var103;
                                            var105 = 128 - var102;
                                        } else if (var20 == 2) {
                                            var104 = 128 - var102;
                                            var105 = 128 - var103;
                                        } else if (var20 == 3) {
                                            var105 = var102;
                                            var104 = 128 - var103;
                                        } else {
                                            var104 = var102;
                                            var105 = var103;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class64.field1307[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg4.method186(var106, var107) - arg0.method186(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class64.field1307[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg0.method186(var108, var109) - arg4.method186(var108, var109);
                                            } else if (arg3 != null && !class273.field4141[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg3.method186(var110, var111) - arg0.method186(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field3120 < class211.field3372[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class464.field6888[var101];
                                            }
                                            var59[var52] = class287.field4340[var101];
                                            var58[var52] = class40.field570[var101];
                                            var57[var52] = class527.field7657[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg6.method421() ? var26.field3121 : var26.field3115;
                                            var59[var52] = var26.field3124;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field1342 && arg2 == 0) {
                                    class230.method1519(var12, var14, var26.field3125, var26.field3116 * 8, var26.field3126);
                                }
                                if (var19 != 12 && var26.field3114 != -1 && var26.field3118) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class321.field4906[var19];
                            } else if (var17) {
                                var51 += class186.field2982[var19];
                            } else {
                                var51 += class415.field6266[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class526 var67 = this.field1358.method679(32020, var22 - 1);
                                class526 var68 = this.field1358.method679(32020, var23 - 1);
                                class526 var69 = this.field1358.method679(32020, var24 - 1);
                                class526 var70 = this.field1358.method679(32020, var25 - 1);
                                for (int var71 = 0; var71 < var48; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class304.field4556[0] = var45[var51];
                                        class304.field4556[1] = 1;
                                        class304.field4556[2] = var49[var51];
                                        class304.field4556[3] = 1;
                                        class304.field4556[4] = var46[var51];
                                        var73 = 6;
                                        class304.field4556[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class304.field4556[0] = var45[var51];
                                        class304.field4556[1] = 5;
                                        class304.field4556[2] = var49[var51];
                                        class304.field4556[3] = 5;
                                        class304.field4556[4] = var46[var51];
                                        var73 = 6;
                                        class304.field4556[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class304.field4556[0] = var45[var51];
                                        class304.field4556[1] = 3;
                                        class304.field4556[2] = var49[var51];
                                        class304.field4556[3] = 3;
                                        class304.field4556[4] = var46[var51];
                                        var73 = 6;
                                        class304.field4556[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class304.field4556[0] = var45[var51];
                                        class304.field4556[1] = 7;
                                        class304.field4556[2] = var49[var51];
                                        class304.field4556[3] = 7;
                                        class304.field4556[4] = var46[var51];
                                        var73 = 6;
                                        class304.field4556[5] = var49[var51];
                                    } else {
                                        class304.field4556[0] = var45[var51];
                                        class304.field4556[1] = var46[var51];
                                        var73 = 3;
                                        class304.field4556[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class304.field4556[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field1352[var75];
                                        int var78 = this.field1343[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = var78;
                                            var80 = 128 - var77;
                                        } else if (var20 == 2) {
                                            var80 = 128 - var78;
                                            var79 = 128 - var77;
                                        } else if (var20 == 3) {
                                            var79 = 128 - var78;
                                            var80 = var77;
                                        } else {
                                            var80 = var78;
                                            var79 = var77;
                                        }
                                        var55[var52] = var79;
                                        var56[var52] = var80;
                                        if (var60 != null && class64.field1307[var19][var75]) {
                                            int var81 = (var12 << 7) + var79;
                                            int var82 = (var14 << 7) + var80;
                                            var60[var52] = arg4.method186(var81, var82) - arg0.method186(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class64.field1307[var19][var75]) {
                                                int var83 = (var12 << 7) + var79;
                                                int var84 = (var14 << 7) + var80;
                                                var61[var52] = arg0.method186(var83, var84) - arg4.method186(var83, var84);
                                            } else if (arg3 != null && !class273.field4141[var19][var75]) {
                                                int var85 = (var12 << 7) + var79;
                                                int var86 = (var14 << 7) + var80;
                                                var61[var52] = arg3.method186(var85, var86) - arg0.method186(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class211.field3372[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class464.field6888[var76];
                                            }
                                            var59[var52] = class287.field4340[var76];
                                            var58[var52] = class40.field570[var76];
                                            var57[var52] = class527.field7657[var76];
                                        } else {
                                            if (var17 && class64.field1307[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg5[var12][var14];
                                                var58[var52] = var67.field7652;
                                                var59[var52] = var67.field7647;
                                            } else if (var79 == 0 && var80 == 128) {
                                                var57[var52] = arg5[var12][var15];
                                                var58[var52] = var68.field7652;
                                                var59[var52] = var68.field7647;
                                            } else if (var79 == 128 && var80 == 128) {
                                                var57[var52] = arg5[var13][var15];
                                                var58[var52] = var69.field7652;
                                                var59[var52] = var69.field7647;
                                            } else if (var79 == 128 && var80 == 0) {
                                                var57[var52] = arg5[var13][var14];
                                                var58[var52] = var70.field7652;
                                                var59[var52] = var70.field7647;
                                            } else {
                                                if (var79 >= 64) {
                                                    if (var80 < 64) {
                                                        var58[var52] = var70.field7652;
                                                        var59[var52] = var70.field7647;
                                                    } else {
                                                        var58[var52] = var69.field7652;
                                                        var59[var52] = var69.field7647;
                                                    }
                                                } else if (var80 >= 64) {
                                                    var58[var52] = var68.field7652;
                                                    var59[var52] = var68.field7647;
                                                } else {
                                                    var58[var52] = var67.field7652;
                                                    var59[var52] = var67.field7647;
                                                }
                                                int var87 = class151.method1108(arg5[var13][var14], arg5[var12][var14], -18404, var79 << 7 >> 7);
                                                int var88 = class151.method1108(arg5[var13][var15], arg5[var12][var15], -18404, var79 << 7 >> 7);
                                                var57[var52] = class151.method1108(var88, var87, -18404, var80 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field7638) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg0.method177(var12, var14);
                            int var90 = arg0.method177(var13, var14);
                            int var91 = arg0.method177(var13, var15);
                            int var92 = arg0.method177(var12, var15);
                            if (arg2 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field3111) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field1354[arg2][var12][var14] = (byte) class418.method2558(this.field1354[arg2][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field1342) {
                                var94 = class205.method1399(var12, var14);
                                var95 = class34.method237(var12, var14);
                                var96 = class399.method2476(var12, var14);
                            }
                            arg0.method188(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class52.method486(arg2, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZBIIIIILnn;III)V", line = 1547)
    private final void method581(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class289 arg7, int arg8, int arg9, int arg10) {
        if (arg5 == 1) {
            arg6 = 1;
        } else if (arg5 == 2) {
            arg6 = 1;
            arg3 = 1;
        } else if (arg5 == 3) {
            arg3 = 1;
        }
        int var12 = -81 % ((arg1 - 29) / 36);
        field1353++;
        if (arg4 < 0 || arg4 >= this.field1341 || arg9 < 0 || arg9 >= this.field1336) {
            while (true) {
                int var15 = arg7.method1858(-3256);
                if (var15 == 0) {
                    return;
                }
                if (var15 == 1) {
                    arg7.method1858(-3256);
                    return;
                }
                if (var15 <= 49) {
                    arg7.method1858(-3256);
                }
            }
        }
        if (!this.field1342 && !arg0) {
            class22.field333[arg8][arg4][arg9] = 0;
        }
        while (true) {
            int var13 = arg7.method1858(-3256);
            if (var13 == 0) {
                if (this.field1342) {
                    this.field1355[0][arg3 + arg4][arg9 + arg6] = 0;
                    return;
                } else if (arg8 == 0) {
                    this.field1355[0][arg3 + arg4][arg6 + arg9] = -class284.method1777(arg2 + 932731, -122, arg10 + 556238) * 8 << 0;
                    return;
                } else {
                    this.field1355[arg8][arg4 + arg3][arg6 + arg9] = this.field1355[arg8 - 1][arg3 + arg4][arg6 + arg9] - 240;
                    return;
                }
            }
            if (var13 == 1) {
                int var14 = arg7.method1858(-3256);
                if (!this.field1342) {
                    if (var14 == 1) {
                        var14 = 0;
                    }
                    if (arg8 == 0) {
                        this.field1355[0][arg4 + arg3][arg6 + arg9] = -var14 * 8 << 0;
                        return;
                    }
                    this.field1355[arg8][arg3 + arg4][arg6 + arg9] = this.field1355[arg8 - 1][arg3 + arg4][arg6 + arg9] - (var14 * 8 << 0);
                    return;
                }
                this.field1355[0][arg4 + arg3][arg6 + arg9] = var14 * 8 << 0;
                return;
            }
            if (var13 <= 49) {
                if (arg0) {
                    arg7.method1858(-3256);
                } else {
                    this.field1349[arg8][arg4][arg9] = arg7.method1816(true);
                    this.field1359[arg8][arg4][arg9] = (byte) ((var13 - 2) / 4);
                    this.field1335[arg8][arg4][arg9] = (byte) class490.method2960(arg5 + var13 - 2, 3);
                }
            } else if (var13 <= 81) {
                if (!this.field1342 && !arg0) {
                    class22.field333[arg8][arg4][arg9] = (byte) (var13 - 49);
                }
            } else if (!arg0) {
                this.field1345[arg8][arg4][arg9] = (byte) (var13 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "([[IBI)V", line = 1673)
    public final void method582(int[][] arg0, byte arg1, int arg2) {
        field1338++;
        int[][] var4 = this.field1355[arg2];
        if (arg1 >= -45) {
            this.field1344 = null;
        }
        for (int var5 = 0; var5 < this.field1341 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field1336 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lnn;IIIII[Lsd;III)V", line = 1700)
    public final void method583(class289 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class63[] arg6, int arg7, int arg8, int arg9) {
        field1334++;
        int var11 = (arg9 & 0x7) * 8;
        int var12 = (arg3 & 0x7) * 8;
        if (!this.field1342) {
            class63 var13 = arg6[arg8];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg5 + class82.method772(var14 & 0x7, var15 & 0x7, arg2, -1);
                    int var17 = class464.method2781(var15 & 0x7, arg2, (byte) -55, var14 & 0x7) + arg1;
                    if (var16 > 0 && var16 < this.field1341 - 1 && var17 > 0 && (this.field1336 - 1) > var17) {
                        var13.method551(var17, var16, -4);
                    }
                }
            }
        }
        int var18 = (arg9 & 0xFFFFFFF8) << 3;
        int var19 = arg3 & 0x1FFFFFF8 << 3;
        int var20 = arg4;
        byte var21 = 0;
        if (arg2 == 1) {
            var21 = 1;
        } else if (arg2 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg2 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field1348; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg7 != var22 || var23 < var11 || var11 + 8 < var23 || var12 > var24 || (var12 + 8) < var24) {
                        this.method581(false, (byte) -28, 0, 0, -1, 0, 0, arg0, 0, -1, 0);
                    } else if (var11 + 8 == var23 || (var12 + 8) == var24) {
                        int var31;
                        int var32;
                        if (arg2 == 0) {
                            var31 = var24 - (var12 - arg1);
                            var32 = arg5 - (var11 - var23);
                        } else if (arg2 == 1) {
                            var31 = arg1 + 8 - (-var11 + var23);
                            var32 = arg5 + var24 - var12;
                        } else if (arg2 == 2) {
                            var31 = 8 - var24 - (-var12 - arg1);
                            var32 = arg5 - var23 - (-var11 - 8);
                        } else {
                            var32 = var12 + arg5 + 8 - var24;
                            var31 = -var11 - (-var23 - arg1);
                        }
                        this.method581(true, (byte) 70, var18 + var23, 0, var32, 0, 0, arg0, arg8, var31, var19 + var24);
                    } else {
                        int var25 = class82.method772(var23 & 0x7, var24 & 0x7, arg2, ~arg4) + arg5;
                        int var26 = class464.method2781(var24 & 0x7, arg2, (byte) -115, var23 & 0x7) + arg1;
                        this.method581(false, (byte) -16, var18 + var23, var20, var25, arg2, var21, arg0, arg8, var26, var19 + var24);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg2 == 0) {
                                var30 = var27 - (var11 - arg5);
                                var29 = var28 + arg1 - var12;
                            } else if (arg2 == 1) {
                                var29 = arg1 + 8 - (var27 - var11);
                                var30 = arg5 + var28 - var12;
                            } else if (arg2 == 2) {
                                var29 = arg1 + var12 + 8 - var28;
                                var30 = var11 + arg5 + 8 - var27;
                            } else {
                                var29 = arg1 + var27 - var11;
                                var30 = arg5 + 8 - (-var12 + var28);
                            }
                            if (var30 >= 0 && this.field1341 > var30 && var29 >= 0 && this.field1336 > var29) {
                                this.field1355[arg8][var30][var29] = this.field1355[arg8][var20 + var25][var21 + var26];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(IIIZLcq;Lri;)V", line = 2479)
    public class66(int arg0, int arg1, int arg2, boolean arg3, class329 arg4, class75 arg5) {
        this.field1333 = arg4;
        this.field1341 = arg1;
        this.field1358 = arg5;
        this.field1336 = arg2;
        this.field1348 = arg0;
        this.field1342 = arg3;
        this.field1354 = new byte[this.field1348][this.field1341 + 1][this.field1336 + 1];
        this.field1345 = new byte[this.field1348][this.field1341][this.field1336];
        this.field1355 = new int[this.field1348][this.field1341 + 1][this.field1336 + 1];
        this.field1335 = new byte[this.field1348][this.field1341][this.field1336];
        this.field1359 = new byte[this.field1348][this.field1341][this.field1336];
        this.field1349 = new byte[this.field1348][this.field1341][this.field1336];
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lya;Lza;Lya;B)V", line = 1878)
    public final void method584(class38 arg0, class288 arg1, class38 arg2, byte arg3) {
        field1337++;
        int[][] var5 = new int[this.field1341][this.field1336];
        if (class224.field3505 == null || class224.field3505.length != this.field1336) {
            class316.field4801 = new int[this.field1336];
            class502.field7348 = new int[this.field1336];
            class322.field4923 = new int[this.field1336];
            class286.field4312 = new int[this.field1336];
            class224.field3505 = new int[this.field1336];
        }
        if (arg3 != -45) {
            method577(22, 104);
        }
        for (int var6 = 0; var6 < this.field1348; var6++) {
            for (int var8 = 0; var8 < this.field1336; var8++) {
                class224.field3505[var8] = 0;
                class286.field4312[var8] = 0;
                class322.field4923[var8] = 0;
                class502.field7348[var8] = 0;
                class316.field4801[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field1341; var9++) {
                for (int var10 = 0; var10 < this.field1336; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field1341) {
                        int var20 = this.field1345[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class526 var21 = this.field1358.method679(arg3 + 32065, var20 + -1);
                            class224.field3505[var10] += var21.field7642;
                            class286.field4312[var10] += var21.field7644;
                            class322.field4923[var10] += var21.field7651;
                            class502.field7348[var10] += var21.field7649;
                            var10002 = class316.field4801[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field1345[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class526 var24 = this.field1358.method679(32020, var23 - 1);
                            class224.field3505[var10] -= var24.field7642;
                            class286.field4312[var10] -= var24.field7644;
                            class322.field4923[var10] -= var24.field7651;
                            class502.field7348[var10] -= var24.field7649;
                            var10002 = class316.field4801[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field1336; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field1336) {
                            var14 += class502.field7348[var17];
                            var11 += class224.field3505[var17];
                            var12 += class286.field4312[var17];
                            var15 += class316.field4801[var17];
                            var13 += class322.field4923[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var11 -= class224.field3505[var18];
                            var15 -= class316.field4801[var18];
                            var13 -= class322.field4923[var18];
                            var14 -= class502.field7348[var18];
                            var12 -= class286.field4312[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class485.method2904(false, var12 / var15, var11 * 256 / var14, var13 / var15);
                        }
                    }
                }
            }
            if (class218.field3421) {
                this.method580(class520.field7560[var6], -110, var6, var6 == 0 ? arg2 : null, var6 == 0 ? arg0 : null, var5, arg1);
            } else {
                this.method585(var6 == 0 ? arg0 : null, var5, class520.field7560[var6], var6, var6 == 0 ? arg2 : null, 92, arg1);
            }
            this.field1345[var6] = null;
            this.field1349[var6] = null;
            this.field1359[var6] = null;
            this.field1335[var6] = null;
        }
        if (!this.field1342) {
            if (class230.field3567 != 0) {
                class82.method771();
            }
            if (class521.field7571) {
                class234.method1536();
            }
        }
        for (int var7 = 0; var7 < this.field1348; var7++) {
            class520.field7560[var7].method187();
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lya;[[ILya;ILya;ILza;)V", line = 2056)
    private final void method585(class38 arg0, int[][] arg1, class38 arg2, int arg3, class38 arg4, int arg5, class288 arg6) {
        field1351++;
        if (arg5 < 9) {
            this.method583(null, 104, -108, -76, -16, 41, null, 106, -60, 100);
        }
        for (int var8 = 0; var8 < this.field1341; var8++) {
            for (int var9 = 0; var9 < this.field1336; var9++) {
                if (class179.field2882 == -1 || class377.method2314(arg3, class179.field2882, var9, var8, false)) {
                    byte var10 = this.field1359[arg3][var8][var9];
                    byte var11 = this.field1335[arg3][var8][var9];
                    int var12 = this.field1349[arg3][var8][var9] & 0xFF;
                    int var13 = this.field1345[arg3][var8][var9] & 0xFF;
                    class193 var14 = var12 == 0 ? null : this.field1333.method2077(var12 - 1, (byte) 64);
                    class526 var15 = var13 == 0 ? null : this.field1358.method679(32020, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class321.field4906[var10];
                        var16 = var15 == null ? 0 : class479.field7065[var10];
                    } else if (var14 != null) {
                        var17 = class321.field4906[var10];
                    } else if (var15 != null) {
                        var16 = class321.field4906[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field3114 == -1 && var14.field3109 == -1 && var14.field3121 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg6.method421() ? var14.field3121 : var14.field3115;
                            if (class309.field4692) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field3124;
                                if (var14.field3114 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field3114;
                                }
                                if (var14.field3109 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field3109;
                                }
                                var19++;
                            }
                            if (!this.field1342 && arg3 == 0) {
                                class230.method1519(var8, var9, var14.field3125, var14.field3116 * 8, var14.field3126);
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
                            int var28 = var15.field7652;
                            if (class309.field4692) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field7647;
                                var20[var19] = arg1[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field1352.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg0 == null ? null : new int[var31];
                        int[] var35 = arg0 == null && arg4 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field1352[var36];
                            int var46 = this.field1343[var36];
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
                            if (var34 != null && class64.field1307[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg0.method186(var49, var50) - arg2.method186(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg0 != null && !class64.field1307[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg2.method186(var51, var52) - arg0.method186(var51, var52);
                                } else if (arg4 != null && !class273.field4141[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg4.method186(var53, var54) - arg2.method186(var53, var54);
                                }
                            }
                        }
                        int var37 = arg2.method177(var8, var9);
                        int var38 = arg2.method177(var8 + 1, var9);
                        int var39 = arg2.method177(var8 + 1, var9 + 1);
                        int var40 = arg2.method177(var8, var9 + 1);
                        if (arg3 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field3111) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field1354[arg3][var8][var9] = (byte) class418.method2558(this.field1354[arg3][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field1342) {
                            var42 = class205.method1399(var8, var9);
                            var43 = class34.method237(var8, var9);
                            var44 = class399.method2476(var8, var9);
                        }
                        arg2.method191(var8, var9, var32, var34, var33, var35, class1.field48[var10], class18.field292[var10], class516.field7481[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class52.method486(arg3, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIII)V", line = 2382)
    private final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 85 % ((-arg2 - 19) / 53);
        for (int var8 = arg0; var8 < (arg0 + arg5); var8++) {
            for (int var11 = arg3; var11 < arg1 + arg3; var11++) {
                if (var11 >= 0 && this.field1341 > var11 && var8 >= 0 && var8 < this.field1336) {
                    this.field1355[arg4][var11][var8] = arg4 <= 0 ? 0 : this.field1355[arg4 - 1][var11][var8] - 240;
                }
            }
        }
        field1350++;
        if (arg3 > 0 && this.field1341 > arg3) {
            for (int var9 = arg0 + 1; var9 < arg0 + arg5; var9++) {
                if (var9 >= 0 && this.field1336 > var9) {
                    this.field1355[arg4][arg3][var9] = this.field1355[arg4][arg3 - 1][var9];
                }
            }
        }
        if (arg0 > 0 && arg0 < this.field1336) {
            for (int var10 = arg3 + 1; var10 < (arg3 + arg1); var10++) {
                if (var10 >= 0 && this.field1341 > var10) {
                    this.field1355[arg4][var10][arg0] = this.field1355[arg4][var10][arg0 - 1];
                }
            }
        }
        if (arg3 < 0 || arg0 < 0 || arg3 >= this.field1341 || this.field1336 <= arg0) {
            return;
        }
        if (arg4 != 0) {
            if (arg3 > 0 && this.field1355[arg4][arg3 - 1][arg0] != this.field1355[arg4 - 1][arg3 - 1][arg0]) {
                this.field1355[arg4][arg3][arg0] = this.field1355[arg4][arg3 - 1][arg0];
                return;
            }
            if (arg0 > 0 && this.field1355[arg4 - 1][arg3][arg0 - 1] != this.field1355[arg4][arg3][arg0 - 1]) {
                this.field1355[arg4][arg3][arg0] = this.field1355[arg4][arg3][arg0 - 1];
                return;
            }
            if (arg3 > 0 && arg0 > 0 && this.field1355[arg4 - 1][arg3 - 1][arg0 - 1] != this.field1355[arg4][arg3 - 1][arg0 - 1]) {
                this.field1355[arg4][arg3][arg0] = this.field1355[arg4][arg3 - 1][arg0 - 1];
                return;
            }
            return;
        }
        if (arg3 > 0 && this.field1355[arg4][arg3 - 1][arg0] != 0) {
            this.field1355[arg4][arg3][arg0] = this.field1355[arg4][arg3 - 1][arg0];
            return;
        }
        if (arg0 > 0 && this.field1355[arg4][arg3][arg0 - 1] != 0) {
            this.field1355[arg4][arg3][arg0] = this.field1355[arg4][arg3][arg0 - 1];
            return;
        }
        if (arg3 > 0 && arg0 > 0 && this.field1355[arg4][arg3 - 1][arg0 - 1] != 0) {
            this.field1355[arg4][arg3][arg0] = this.field1355[arg4][arg3 - 1][arg0 - 1];
            return;
        }
    }
}
