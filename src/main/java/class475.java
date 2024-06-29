import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class475 {

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[I")
    private int[] field6657 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "[I")
    private int[] field6667 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "Z")
    public boolean field6677;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public int field6673;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Liv;")
    private class81 field6654;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public int field6680;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Lsca;")
    private class40 field6662;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public int field6670;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "[[[B")
    private byte[][][] field6658;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "[[[B")
    private byte[][][] field6671;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[[[B")
    private byte[][][] field6659;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "[[[B")
    private byte[][][] field6675;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "[[[B")
    public byte[][][] field6661;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "[[[I")
    public int[][][] field6681;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "Lpq;")
    public static class165 field6674;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "[[[B")
    public byte[][][] field6682;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILqa;Lsa;[[ILsa;Lsa;)V")
    private final void method2762(int arg0, int arg1, class206 arg2, class174 arg3, int[][] arg4, class174 arg5, class174 arg6) {
        field6664++;
        int var8 = 9 / ((arg1 - 47) / 35);
        for (int var9 = 0; var9 < this.field6680; var9++) {
            for (int var10 = 0; var10 < this.field6673; var10++) {
                if (class16.field123 == -1 || class566.method3298(var9, arg0, class16.field123, (byte) -121, var10)) {
                    byte var11 = this.field6671[arg0][var9][var10];
                    byte var12 = this.field6658[arg0][var9][var10];
                    int var13 = this.field6659[arg0][var9][var10] & 0xFF;
                    int var14 = this.field6675[arg0][var9][var10] & 0xFF;
                    class259 var15 = var13 == 0 ? null : this.field6654.method477(var13 - 1, (byte) 30);
                    class414 var16 = var14 == 0 ? null : this.field6662.method211(var14 - 1, 1);
                    int var17 = 0;
                    int var18 = 0;
                    if (var11 != 0) {
                        var18 = var15 == null ? 0 : class587.field8517[var11];
                        var17 = var16 == null ? 0 : class199.field2391[var11];
                    } else if (var15 != null) {
                        var18 = class587.field8517[var11];
                    } else if (var16 != null) {
                        var17 = class587.field8517[var11];
                    }
                    int var19 = var17 + var18;
                    int var20 = 0;
                    if (var19 != 0) {
                        int[] var21 = new int[var19];
                        int[] var22 = new int[var19];
                        int[] var23 = new int[var19];
                        int[] var24 = new int[var19];
                        boolean var25 = false;
                        if (var15 == null || var15.field3332 == -1 && var15.field3343 == -1 && var15.field3336 == -1) {
                            for (int var28 = 0; var28 < var18; var28++) {
                                var21[var20] = -1;
                                var20++;
                            }
                        } else {
                            int var26 = arg2.method271() ? var15.field3336 : var15.field3338;
                            if (class274.field3618) {
                                var26 = -1;
                            }
                            for (int var27 = 0; var27 < var18; var27++) {
                                var23[var20] = var26;
                                var24[var20] = var15.field3334;
                                if (var15.field3332 == -1) {
                                    var21[var20] = -1;
                                } else {
                                    var21[var20] = var15.field3332;
                                }
                                if (var15.field3343 == -1) {
                                    var22[var20] = -1;
                                } else {
                                    var22[var20] = var15.field3343;
                                    var25 = true;
                                }
                                var20++;
                            }
                            if (!this.field6677 && arg0 == 0) {
                                class70.method383(var9, var10, var15.field3345, var15.field3333 * 8, var15.field3331);
                            }
                        }
                        if (!var25) {
                            var22 = null;
                        }
                        if (var16 == null) {
                            for (int var31 = 0; var31 < var17; var31++) {
                                var21[var20] = -1;
                                var20++;
                            }
                        } else {
                            int var29 = var16.field5377;
                            if (class274.field3618) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var17; var30++) {
                                var23[var20] = var29;
                                var24[var20] = var16.field5382;
                                var21[var20] = arg4[var9][var10];
                                if (var22 != null) {
                                    var22[var20] = -1;
                                }
                                var20++;
                            }
                        }
                        int var32 = this.field6667.length;
                        int[] var33 = new int[var32];
                        int[] var34 = new int[var32];
                        int[] var35 = arg6 == null ? null : new int[var32];
                        int[] var36 = arg6 == null && arg5 == null ? null : new int[var32];
                        for (int var37 = 0; var37 < var32; var37++) {
                            int var46 = this.field6667[var37];
                            int var47 = this.field6657[var37];
                            if (var12 == 0) {
                                var33[var37] = var46;
                                var34[var37] = var47;
                            } else if (var12 == 1) {
                                var33[var37] = var47;
                                var34[var37] = 128 - var46;
                            } else if (var12 == 2) {
                                var33[var37] = 128 - var46;
                                var34[var37] = 128 - var47;
                            } else if (var12 == 3) {
                                var33[var37] = 128 - var47;
                                var34[var37] = var46;
                            }
                            if (var35 != null && class219.field2701[var11][var37]) {
                                int var50 = (var9 << 7) + var46;
                                int var51 = (var10 << 7) + var46;
                                var35[var37] = arg6.method847(var50, var51) - arg3.method847(var50, var51);
                            }
                            if (var36 != null) {
                                if (arg6 != null && !class219.field2701[var11][var37]) {
                                    int var52 = (var9 << 7) + var46;
                                    int var53 = (var10 << 7) + var46;
                                    var36[var37] = arg3.method847(var52, var53) - arg6.method847(var52, var53);
                                } else if (arg5 != null && !class343.field4425[var11][var37]) {
                                    int var54 = (var9 << 7) + var46;
                                    int var55 = (var10 << 7) + var46;
                                    var36[var37] = arg5.method847(var54, var55) - arg3.method847(var54, var55);
                                }
                            }
                        }
                        int var38 = arg3.method855(var9, var10);
                        int var39 = arg3.method855(var9 + 1, var10);
                        int var40 = arg3.method855(var9 + 1, var10 + 1);
                        int var41 = arg3.method855(var9, var10 + 1);
                        if (arg0 > 0) {
                            boolean var42 = true;
                            if (var14 == 0 && var11 != 0) {
                                var42 = false;
                            }
                            if (var13 > 0 && var15 != null && !var15.field3342) {
                                var42 = false;
                            }
                            if (var42 && var38 == var39 && var38 == var40 && var38 == var41) {
                                this.field6661[arg0][var9][var10] = (byte) class42.method223(this.field6661[arg0][var9][var10], 4);
                            }
                        }
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        if (this.field6677) {
                            var43 = class198.method1070(var9, var10);
                            var44 = class557.method3267(var9, var10);
                            var45 = class80.method465(var9, var10);
                        }
                        arg3.method846(var9, var10, var33, var35, var34, var36, class10.field81[var11], class46.field394[var11], class152.field1839[var11], var21, var22, var23, var24, var43, var44, var45, false);
                        class220.method1270(arg0, var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZIIIIIIIILos;)V")
    private final void method2763(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class374 arg10) {
        if (arg5 == 1) {
            arg0 = 1;
        } else if (arg5 == 2) {
            arg6 = 1;
            arg0 = 1;
        } else if (arg5 == 3) {
            arg6 = 1;
        }
        field6668++;
        if (arg2 >= 0 && this.field6680 > arg2 && arg9 >= 0 && arg9 < this.field6673) {
            if (!this.field6677 && !arg1) {
                class330.field4304[arg4][arg2][arg9] = 0;
            }
            while (true) {
                int var12 = arg10.method2129(-76);
                if (var12 == 0) {
                    if (this.field6677) {
                        this.field6681[0][arg2 + arg6][arg9 + arg0] = 0;
                    } else if (arg4 == 0) {
                        this.field6681[0][arg2 + arg6][arg0 + arg9] = -class175.method971(60, arg8 + 932731, arg3 + 556238) * 8 << 0;
                    } else {
                        this.field6681[arg4][arg2 + arg6][arg0 + arg9] = this.field6681[arg4 - 1][arg2 + arg6][arg0 + arg9] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg10.method2129(-98);
                    if (this.field6677) {
                        this.field6681[0][arg2 + arg6][arg0 + arg9] = var13 * 8 << 0;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg4 == 0) {
                            this.field6681[0][arg2 + arg6][arg0 + arg9] = -var13 * 8 << 0;
                        } else {
                            this.field6681[arg4][arg2 + arg6][arg0 + arg9] = this.field6681[arg4 - 1][arg2 + arg6][arg0 + arg9] - (var13 * 8 << 0);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg1) {
                        arg10.method2129(-116);
                    } else {
                        this.field6659[arg4][arg2][arg9] = arg10.method2124(113);
                        this.field6671[arg4][arg2][arg9] = (byte) ((var12 - 2) / 4);
                        this.field6658[arg4][arg2][arg9] = (byte) class288.method1624(arg5 + var12 - 2, 3);
                    }
                } else if (var12 <= 81) {
                    if (!this.field6677 && !arg1) {
                        class330.field4304[arg4][arg2][arg9] = (byte) (var12 - 49);
                    }
                } else if (!arg1) {
                    this.field6675[arg4][arg2][arg9] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg10.method2129(-91);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg10.method2129(-107);
                    break;
                }
                if (var14 <= 49) {
                    arg10.method2129(-115);
                }
            }
        }
        if (arg7 > -29) {
            this.method2767(-126, null, null, null);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIB)V")
    public final void method2764(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field6663++;
        for (int var6 = 0; var6 < this.field6670; var6++) {
            this.method2775(arg2, var6, arg1, arg0, arg3, -1);
        }
        if (arg4 > -46) {
            this.field6670 = 58;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lqa;Lsa;Lsa;I)V")
    public final void method2765(class206 arg0, class174 arg1, class174 arg2, int arg3) {
        field6672++;
        if (class368.field4861 == null || class368.field4861.length != this.field6673) {
            class368.field4861 = new int[this.field6673];
            class93.field1140 = new int[this.field6673];
            class513.field7254 = new int[this.field6673];
            class373.field4898 = new int[this.field6673];
            class554.field8152 = new int[this.field6673];
        }
        int[][] var5 = new int[this.field6680][this.field6673];
        if (arg3 > -47) {
            field6674 = null;
        }
        for (int var6 = 0; var6 < this.field6670; var6++) {
            for (int var8 = 0; var8 < this.field6673; var8++) {
                class368.field4861[var8] = 0;
                class93.field1140[var8] = 0;
                class373.field4898[var8] = 0;
                class554.field8152[var8] = 0;
                class513.field7254[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field6680; var9++) {
                for (int var10 = 0; var10 < this.field6673; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field6680) {
                        int var20 = this.field6675[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class414 var21 = this.field6662.method211(var20 - 1, 1);
                            class368.field4861[var10] += var21.field5372;
                            class93.field1140[var10] += var21.field5371;
                            class373.field4898[var10] += var21.field5369;
                            class554.field8152[var10] += var21.field5376;
                            var10002 = class513.field7254[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field6675[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class414 var24 = this.field6662.method211(var23 - 1, 1);
                            class368.field4861[var10] -= var24.field5372;
                            class93.field1140[var10] -= var24.field5371;
                            class373.field4898[var10] -= var24.field5369;
                            class554.field8152[var10] -= var24.field5376;
                            var10002 = class513.field7254[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field6673; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field6673) {
                            var12 += class93.field1140[var17];
                            var11 += class368.field4861[var17];
                            var13 += class373.field4898[var17];
                            var14 += class554.field8152[var17];
                            var15 += class513.field7254[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class93.field1140[var18];
                            var14 -= class554.field8152[var18];
                            var11 -= class368.field4861[var18];
                            var15 -= class513.field7254[var18];
                            var13 -= class373.field4898[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class162.method886(var11 * 256 / var14, var12 / var15, var13 / var15, 4);
                        }
                    }
                }
            }
            if (class241.field3008) {
                this.method2771(arg0, 0, var6, class128.field1574[var6], var6 == 0 ? arg1 : null, var6 == 0 ? arg2 : null, var5);
            } else {
                this.method2762(var6, 109, arg0, class128.field1574[var6], var5, var6 == 0 ? arg1 : null, var6 == 0 ? arg2 : null);
            }
            this.field6675[var6] = null;
            this.field6659[var6] = null;
            this.field6671[var6] = null;
            this.field6658[var6] = null;
        }
        if (!this.field6677) {
            if (class362.field4762 != 0) {
                class288.method1621();
            }
            if (class22.field152) {
                class582.method3385();
            }
        }
        for (int var7 = 0; var7 < this.field6670; var7++) {
            class128.field1574[var7].method842();
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Z")
    public static final boolean method2766(int arg0) {
        field6678++;
        try {
            if (~class578.field8436 == arg0) {
                if (class161.field1963 == null) {
                    class161.field1963 = class215.method1235(class527.field7382, class175.field2117, class503.field6979);
                    if (class161.field1963 == null) {
                        return false;
                    }
                }
                if (class14.field111 == null) {
                    class14.field111 = new class585(class443.field6119, class471.field6599);
                }
                if (class390.field5159.method1535(class184.field2233, class161.field1963, class14.field111, -1, 22050)) {
                    class390.field5159.method1533((byte) -104);
                    class390.field5159.method1532((byte) -125, class79.field923);
                    class390.field5159.method1536(class121.field1518, (byte) -122, class161.field1963);
                    class14.field111 = null;
                    class161.field1963 = null;
                    class527.field7382 = null;
                    class578.field8436 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class390.field5159.method1540((byte) -29);
            class527.field7382 = null;
            class578.field8436 = 0;
            class161.field1963 = null;
            class14.field111 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[Lqt;Lqa;[[[I)V")
    public final void method2767(int arg0, class542[] arg1, class206 arg2, int[][][] arg3) {
        if (!this.field6677) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field6680; var6++) {
                    for (int var7 = 0; var7 < this.field6673; var7++) {
                        if ((class330.field4304[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class330.field4304[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method3161(var6, -126, var7);
                            }
                        }
                    }
                }
            }
        }
        field6656++;
        if (arg0 != 20706) {
            return;
        }
        for (int var9 = 0; var9 < this.field6670; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field6677) {
                if (class188.field2261) {
                    var11 |= 0x8;
                }
                if (class22.field152) {
                    var10 |= 0x2;
                }
                if (class362.field4762 != 0) {
                    var10 |= 0x1;
                    if (class439.field6081 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class22.field152) {
                var11 |= 0x7;
            }
            if (!class50.field429) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || arg3.length <= var9 ? this.field6681[var9] : arg3[var9];
            class566.method3297(var9, arg2.method265(this.field6680, this.field6673, this.field6681[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[Lqt;ILos;II)V")
    public final void method2768(int arg0, int arg1, class542[] arg2, int arg3, class374 arg4, int arg5, int arg6) {
        if (!this.field6677) {
            for (int var8 = 0; var8 < 4; var8++) {
                class542 var9 = arg2[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg0 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && this.field6680 > var12 && var13 >= 0 && this.field6673 > var13) {
                            var9.method3159(var12, (byte) -126, var13);
                        }
                    }
                }
            }
        }
        if (arg6 != -1) {
            this.field6682 = null;
        }
        field6660++;
        int var14 = arg0 + arg1;
        int var15 = arg3 + arg5;
        for (int var16 = 0; var16 < this.field6670; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2763(0, false, var17 + arg0, var15 + var18, var16, 0, 0, -82, var14 + var17, var18 - -arg3, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lvn;[Z[[B[[BLhca;IILqa;I[[BIIII)V")
    private final void method2769(class259 arg0, boolean[] arg1, byte[][] arg2, byte[][] arg3, class414 arg4, int arg5, int arg6, class206 arg7, int arg8, byte[][] arg9, int arg10, int arg11, int arg12, int arg13) {
        field6666++;
        if (arg13 != 27683) {
            this.field6680 = -63;
        }
        boolean[] var15 = arg0 != null && arg0.field3330 ? class612.field8879[arg10] : class552.field8126[arg10];
        if (arg6 > 0) {
            if (arg5 > 0) {
                int var16 = arg3[arg5 - 1][arg6 - 1] & 0xFF;
                if (var16 > 0) {
                    class259 var17 = this.field6654.method477(var16 - 1, (byte) -115);
                    if (var17.field3332 != -1 && var17.field3330) {
                        byte var18 = arg9[arg5 - 1][arg6 - 1];
                        int var19 = arg2[arg5 - 1][arg6 - 1] * 2 + 4 & 0x7;
                        int var20 = class196.method1064((byte) -51, var17, arg7);
                        if (class219.field2701[var18][var19]) {
                            class544.field7973[0] = var17.field3332;
                            class420.field5436[0] = var20;
                            class483.field6754[0] = arg7.method271() ? var17.field3336 : var17.field3338;
                            class200.field2401[0] = var17.field3334;
                            class143.field1708[0] = var17.field3339;
                            class344.field4463[0] = 256;
                        }
                    }
                }
            }
            if (arg12 - 1 > arg5) {
                int var21 = arg3[arg5 + 1][arg6 - 1] & 0xFF;
                if (var21 > 0) {
                    class259 var22 = this.field6654.method477(var21 - 1, (byte) 63);
                    if (var22.field3332 != -1 && var22.field3330) {
                        byte var23 = arg9[arg5 + 1][arg6 - 1];
                        int var24 = arg2[arg5 + 1][arg6 - 1] * 2 + 6 & 0x7;
                        int var25 = class196.method1064((byte) -51, var22, arg7);
                        if (class219.field2701[var23][var24]) {
                            class544.field7973[2] = var22.field3332;
                            class420.field5436[2] = var25;
                            class483.field6754[2] = arg7.method271() ? var22.field3336 : var22.field3338;
                            class200.field2401[2] = var22.field3334;
                            class143.field1708[2] = var22.field3339;
                            class344.field4463[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg6 < arg11 - 1) {
            if (arg5 > 0) {
                int var26 = arg3[arg5 - 1][arg6 + 1] & 0xFF;
                if (var26 > 0) {
                    class259 var27 = this.field6654.method477(var26 - 1, (byte) 74);
                    if (var27.field3332 != -1 && var27.field3330) {
                        byte var28 = arg9[arg5 - 1][arg6 + 1];
                        int var29 = arg2[arg5 - 1][arg6 + 1] * 2 + 2 & 0x7;
                        int var30 = class196.method1064((byte) -51, var27, arg7);
                        if (class219.field2701[var28][var29]) {
                            class544.field7973[6] = var27.field3332;
                            class420.field5436[6] = var30;
                            class483.field6754[6] = arg7.method271() ? var27.field3336 : var27.field3338;
                            class200.field2401[6] = var27.field3334;
                            class143.field1708[6] = var27.field3339;
                            class344.field4463[6] = 64;
                        }
                    }
                }
            }
            if (arg12 - 1 > arg5) {
                int var31 = arg3[arg5 + 1][arg6 + 1] & 0xFF;
                if (var31 > 0) {
                    class259 var32 = this.field6654.method477(var31 - 1, (byte) 76);
                    if (var32.field3332 != -1 && var32.field3330) {
                        byte var33 = arg9[arg5 + 1][arg6 + 1];
                        int var34 = arg2[arg5 + 1][arg6 + 1] * 2 & 0x7;
                        int var35 = class196.method1064((byte) -51, var32, arg7);
                        if (class219.field2701[var33][var34]) {
                            class544.field7973[4] = var32.field3332;
                            class420.field5436[4] = var35;
                            class483.field6754[4] = arg7.method271() ? var32.field3336 : var32.field3338;
                            class200.field2401[4] = var32.field3334;
                            class143.field1708[4] = var32.field3339;
                            class344.field4463[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg6 > 0) {
            int var36 = arg3[arg5][arg6 - 1] & 0xFF;
            if (var36 > 0) {
                class259 var37 = this.field6654.method477(var36 - 1, (byte) 123);
                if (var37.field3332 != -1) {
                    byte var38 = arg9[arg5][arg6 - 1];
                    byte var39 = arg2[arg5][arg6 - 1];
                    if (var37.field3330) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class196.method1064((byte) -51, var37, arg7);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class219.field2701[var38][var41] && var37.field3339 >= class143.field1708[var40]) {
                                class544.field7973[var40] = var37.field3332;
                                class420.field5436[var40] = var42;
                                class483.field6754[var40] = arg7.method271() ? var37.field3336 : var37.field3338;
                                class200.field2401[var40] = var37.field3334;
                                if (class143.field1708[var40] == var37.field3339) {
                                    class344.field4463[var40] = class42.method223(class344.field4463[var40], 32);
                                } else {
                                    class344.field4463[var40] = 32;
                                }
                                class143.field1708[var40] = var37.field3339;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[-(-arg8) & 0x3]) {
                            arg1[0] = class612.field8879[var38][class288.method1624(var39 + 2, 3)];
                        }
                    } else if (!var15[arg8 & 0x3]) {
                        arg1[0] = class552.field8126[var38][class288.method1624(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg11 - 1 > arg6) {
            int var44 = arg3[arg5][arg6 + 1] & 0xFF;
            if (var44 > 0) {
                class259 var45 = this.field6654.method477(var44 - 1, (byte) 58);
                if (var45.field3332 != -1) {
                    byte var46 = arg9[arg5][arg6 + 1];
                    byte var47 = arg2[arg5][arg6 + 1];
                    if (var45.field3330) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class196.method1064((byte) -51, var45, arg7);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class219.field2701[var46][var49] && class143.field1708[var48] <= var45.field3339) {
                                class544.field7973[var48] = var45.field3332;
                                class420.field5436[var48] = var50;
                                class483.field6754[var48] = arg7.method271() ? var45.field3336 : var45.field3338;
                                class200.field2401[var48] = var45.field3334;
                                if (class143.field1708[var48] == var45.field3339) {
                                    class344.field4463[var48] = class42.method223(class344.field4463[var48], 16);
                                } else {
                                    class344.field4463[var48] = 16;
                                }
                                class143.field1708[var48] = var45.field3339;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg8 + 2 & 0x3]) {
                            arg1[2] = class612.field8879[var46][class288.method1624(var47, 3)];
                        }
                    } else if (!var15[arg8 + 2 & 0x3]) {
                        arg1[2] = class552.field8126[var46][class288.method1624(3, var47)];
                    }
                }
            }
        }
        if (arg5 > 0) {
            int var52 = arg3[arg5 - 1][arg6] & 0xFF;
            if (var52 > 0) {
                class259 var53 = this.field6654.method477(var52 - 1, (byte) -120);
                if (var53.field3332 != -1) {
                    byte var54 = arg9[arg5 - 1][arg6];
                    byte var55 = arg2[arg5 - 1][arg6];
                    if (var53.field3330) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class196.method1064((byte) -51, var53, arg7);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class219.field2701[var54][var57] && var53.field3339 >= class143.field1708[var56]) {
                                class544.field7973[var56] = var53.field3332;
                                class420.field5436[var56] = var58;
                                class483.field6754[var56] = arg7.method271() ? var53.field3336 : var53.field3338;
                                class200.field2401[var56] = var53.field3334;
                                if (class143.field1708[var56] == var53.field3339) {
                                    class344.field4463[var56] = class42.method223(class344.field4463[var56], 8);
                                } else {
                                    class344.field4463[var56] = 8;
                                }
                                class143.field1708[var56] = var53.field3339;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg8 + 3 & 0x3]) {
                            arg1[3] = class612.field8879[var54][class288.method1624(var55 + 1, 3)];
                        }
                    } else if (!var15[arg8 + 3 & 0x3]) {
                        arg1[3] = class552.field8126[var54][class288.method1624(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg5 < arg12 - 1) {
            int var60 = arg3[arg5 + 1][arg6] & 0xFF;
            if (var60 > 0) {
                class259 var61 = this.field6654.method477(var60 - 1, (byte) 89);
                if (var61.field3332 != -1) {
                    byte var62 = arg9[arg5 + 1][arg6];
                    byte var63 = arg2[arg5 + 1][arg6];
                    if (var61.field3330) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class196.method1064((byte) -51, var61, arg7);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class219.field2701[var62][var65] && var61.field3339 >= class143.field1708[var64]) {
                                class544.field7973[var64] = var61.field3332;
                                class420.field5436[var64] = var66;
                                class483.field6754[var64] = arg7.method271() ? var61.field3336 : var61.field3338;
                                class200.field2401[var64] = var61.field3334;
                                if (class143.field1708[var64] == var61.field3339) {
                                    class344.field4463[var64] = class42.method223(class344.field4463[var64], 4);
                                } else {
                                    class344.field4463[var64] = 4;
                                }
                                class143.field1708[var64] = var61.field3339;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg8 + 1 & 0x3]) {
                            arg1[1] = class612.field8879[var62][class288.method1624(3, var63 + 3)];
                        }
                    } else if (!var15[arg8 + 1 & 0x3]) {
                        arg1[1] = class552.field8126[var62][class288.method1624(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        int var68 = class196.method1064((byte) -51, arg0, arg7);
        if (!arg0.field3330) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg8 * 2) & 0x7;
            if (class219.field2701[arg10][var69] && arg0.field3339 >= class143.field1708[var70]) {
                class544.field7973[var70] = arg0.field3332;
                class420.field5436[var70] = var68;
                class483.field6754[var70] = arg7.method271() ? arg0.field3336 : arg0.field3338;
                class200.field2401[var70] = arg0.field3334;
                if (class143.field1708[var70] == arg0.field3339) {
                    class344.field4463[var70] = class42.method223(class344.field4463[var70], 2);
                } else {
                    class344.field4463[var70] = 2;
                }
                class143.field1708[var70] = arg0.field3339;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI[Lqt;IIILos;III)V")
    public final void method2770(boolean arg0, int arg1, class542[] arg2, int arg3, int arg4, int arg5, class374 arg6, int arg7, int arg8, int arg9) {
        field6669++;
        int var11 = (arg5 & 0x7) * 8;
        int var12 = (arg8 & 0x7) * 8;
        if (!this.field6677) {
            class542 var13 = arg2[arg7];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class209.method1203(arg9, var14 & 0x7, var15 & 0x7, 0) + arg4;
                    int var17 = class182.method996(7, var15 & 0x7, var14 & 0x7, arg9) + arg1;
                    if (var16 > 0 && var16 < this.field6680 - 1 && var17 > 0 && var17 < (this.field6673 - 1)) {
                        var13.method3159(var16, (byte) -102, var17);
                    }
                }
            }
        }
        if (arg0) {
            this.field6661 = null;
        }
        int var18 = (arg5 & 0xFFFFFFF8) << 3;
        int var19 = arg8 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg9 == 1) {
            var21 = 1;
        } else if (arg9 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg9 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field6670; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg3 == var22 && var11 <= var23 && (var11 + 8) >= var23 && var24 >= var12 && var12 + 8 >= var24) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var12 + 8) == var24) {
                            if (arg9 == 0) {
                                var26 = var24 + arg1 - var12;
                                var25 = var23 + arg4 - var11;
                            } else if (arg9 == 1) {
                                var25 = var24 + arg4 - var12;
                                var26 = arg1 - var23 - (-var11 - 8);
                            } else if (arg9 == 2) {
                                var26 = arg1 + 8 - (var24 - var12);
                                var25 = arg4 + 8 - (var23 - var11);
                            } else {
                                var26 = arg1 + var23 - var11;
                                var25 = var12 + arg4 + 8 - var24;
                            }
                            this.method2763(0, true, var25, var19 + var24, arg7, 0, 0, -99, var18 + var23, var26, arg6);
                        } else {
                            var25 = class209.method1203(arg9, var23 & 0x7, var24 & 0x7, 0) + arg4;
                            var26 = class182.method996(7, var24 & 0x7, var23 & 0x7, arg9) + arg1;
                            this.method2763(var21, false, var25, var19 + var24, arg7, arg9, var20, -82, var18 + var23, var26, arg6);
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
                                if (arg9 == 0) {
                                    var32 = var30 - (var12 - arg1);
                                    var31 = var29 + arg4 - var11;
                                } else if (arg9 == 1) {
                                    var32 = var11 + arg1 + 8 - var29;
                                    var31 = var30 + arg4 - var12;
                                } else if (arg9 == 2) {
                                    var31 = arg4 + var11 + 8 - var29;
                                    var32 = arg1 + var12 + 8 - var30;
                                } else {
                                    var32 = arg1 + var29 - var11;
                                    var31 = var12 + arg4 + 8 - var30;
                                }
                                if (var31 >= 0 && var31 < this.field6680 && var32 >= 0 && var32 < this.field6673) {
                                    this.field6681[arg7][var31][var32] = this.field6681[arg7][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method2763(0, false, -1, 0, 0, 0, 0, -116, 0, -1, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lqa;IILsa;Lsa;Lsa;[[I)V")
    private final void method2771(class206 arg0, int arg1, int arg2, class174 arg3, class174 arg4, class174 arg5, int[][] arg6) {
        field6679++;
        byte[][] var8 = this.field6671[arg2];
        byte[][] var9 = this.field6658[arg2];
        byte[][] var10 = this.field6675[arg2];
        byte[][] var11 = this.field6659[arg2];
        for (int var12 = arg1; var12 < this.field6680; var12++) {
            int var13 = var12 < (this.field6680 - 1) ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field6673; var14++) {
                int var15 = this.field6673 - 1 > var14 ? var14 + 1 : var14;
                if (class16.field123 == -1 || class566.method3298(var12, arg2, class16.field123, (byte) -121, var14)) {
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
                        class259 var26 = var21 == 0 ? null : this.field6654.method477(var21 - 1, (byte) -127);
                        class414 var27 = var22 == 0 ? null : this.field6662.method211(var22 - 1, 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class259 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3332 == -1 && var26.field3343 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3330;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field6680 > var12 && this.field6673 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var32++;
                            } else {
                                var32--;
                                var35--;
                            }
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var35++;
                            } else {
                                var33--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var33--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var36--;
                                var32--;
                            }
                            int var37 = var32 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg3.method855(var12, var14) - arg3.method855(var13, var15);
                                var38 = arg3.method855(var13, var14) - arg3.method855(var12, var15);
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
                            class143.field1708[var39] = -1;
                            class344.field4463[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3330 ? class612.field8879[var19] : class552.field8126[var19];
                        this.method2769(var26, var18, var9, var11, var27, var12, var14, arg0, var20, var8, var19, this.field6673, this.field6680, 27683);
                        boolean var41 = var26 != null && var26.field3343 != var26.field3332;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class143.field1708[var42] >= 0 && class544.field7973[var42] != class420.field5436[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class619.method3557(var18[1], class288.method1624(class344.field4463[2], class344.field4463[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class619.method3557(var18[3], class288.method1624(class344.field4463[0], class344.field4463[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class619.method3557(var18[0], class288.method1624(class344.field4463[0], class344.field4463[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class619.method3557(var18[2], class288.method1624(class344.field4463[6], class344.field4463[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var45 = var26 == null ? 0 : class587.field8517[var19];
                            var46 = class46.field394[var19];
                            var47 = class152.field1839[var19];
                            var48 = var27 == null ? 0 : class199.field2391[var19];
                            var49 = class10.field81[var19];
                        } else if (var17) {
                            var47 = class55.field479[var19];
                            var48 = var27 == null ? 0 : class386.field5088[var19];
                            var45 = var26 == null ? 0 : class593.field8617[var19];
                            var49 = class411.field5350[var19];
                            var44 = class388.field5125[var19];
                            var46 = class208.field2502[var19];
                        } else {
                            var47 = class605.field8735[var19];
                            var48 = var27 == null ? 0 : class484.field6770[var19];
                            var46 = class507.field7036[var19];
                            var44 = class193.field2340[var19];
                            var45 = var26 == null ? 0 : class102.field1256[var19];
                            var49 = class369.field4869[var19];
                        }
                        int var50 = var45 + var48;
                        if (var50 <= 0) {
                            class220.method1270(arg2, var12, var14);
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
                                var62 = var26.field3332;
                                var63 = arg0.method271() ? var26.field3336 : var26.field3338;
                                var64 = var26.field3334;
                                int var65 = class196.method1064((byte) -51, var26, arg0);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class50.field430[0] = var49[var51];
                                        class50.field430[1] = 1;
                                        class50.field430[2] = var47[var51];
                                        class50.field430[3] = 1;
                                        class50.field430[4] = var46[var51];
                                        class50.field430[5] = var47[var51];
                                        var98 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class50.field430[0] = var49[var51];
                                        class50.field430[1] = 5;
                                        class50.field430[2] = var47[var51];
                                        class50.field430[3] = 5;
                                        class50.field430[4] = var46[var51];
                                        class50.field430[5] = var47[var51];
                                        var98 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class50.field430[0] = var49[var51];
                                        class50.field430[1] = 3;
                                        class50.field430[2] = var47[var51];
                                        class50.field430[3] = 3;
                                        class50.field430[4] = var46[var51];
                                        class50.field430[5] = var47[var51];
                                        var98 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class50.field430[0] = var49[var51];
                                        class50.field430[1] = 7;
                                        class50.field430[2] = var47[var51];
                                        class50.field430[3] = 7;
                                        class50.field430[4] = var46[var51];
                                        var98 = 6;
                                        class50.field430[5] = var47[var51];
                                    } else {
                                        class50.field430[0] = var49[var51];
                                        class50.field430[1] = var46[var51];
                                        class50.field430[2] = var47[var51];
                                        var98 = 3;
                                    }
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class50.field430[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field6667[var100];
                                        int var103 = this.field6657[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = var103;
                                            var105 = 128 - var102;
                                        } else if (var20 == 2) {
                                            var105 = 128 - var103;
                                            var104 = 128 - var102;
                                        } else if (var20 == 3) {
                                            var105 = var102;
                                            var104 = 128 - var103;
                                        } else {
                                            var105 = var103;
                                            var104 = var102;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class219.field2701[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg5.method847(var106, var107) - arg3.method847(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class219.field2701[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg3.method847(var108, var109) - arg5.method847(var108, var109);
                                            } else if (arg4 != null && !class343.field4425[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg4.method847(var110, var111) - arg3.method847(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field3339 < class143.field1708[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class420.field5436[var101];
                                            }
                                            var59[var52] = class200.field2401[var101];
                                            var58[var52] = class483.field6754[var101];
                                            var57[var52] = class544.field7973[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg0.method271() ? var26.field3336 : var26.field3338;
                                            var59[var52] = var26.field3334;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field6677 && arg2 == 0) {
                                    class70.method383(var12, var14, var26.field3345, var26.field3333 * 8, var26.field3331);
                                }
                                if (var19 != 12 && var26.field3332 != -1 && var26.field3344) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class587.field8517[var19];
                            } else if (var17) {
                                var51 += class593.field8617[var19];
                            } else {
                                var51 += class102.field1256[var19];
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
                                class414 var67 = this.field6662.method211(var22 - 1, arg1 + 1);
                                class414 var68 = this.field6662.method211(var23 - 1, 1);
                                class414 var69 = this.field6662.method211(var24 - 1, 1);
                                class414 var70 = this.field6662.method211(var25 - 1, 1);
                                for (int var71 = 0; var71 < var48; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class50.field430[0] = var49[var51];
                                        class50.field430[1] = 1;
                                        class50.field430[2] = var47[var51];
                                        class50.field430[3] = 1;
                                        class50.field430[4] = var46[var51];
                                        var73 = 6;
                                        class50.field430[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class50.field430[0] = var49[var51];
                                        class50.field430[1] = 5;
                                        class50.field430[2] = var47[var51];
                                        class50.field430[3] = 5;
                                        class50.field430[4] = var46[var51];
                                        class50.field430[5] = var47[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class50.field430[0] = var49[var51];
                                        class50.field430[1] = 3;
                                        class50.field430[2] = var47[var51];
                                        class50.field430[3] = 3;
                                        class50.field430[4] = var46[var51];
                                        var73 = 6;
                                        class50.field430[5] = var47[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class50.field430[0] = var49[var51];
                                        class50.field430[1] = 7;
                                        class50.field430[2] = var47[var51];
                                        class50.field430[3] = 7;
                                        class50.field430[4] = var46[var51];
                                        var73 = 6;
                                        class50.field430[5] = var47[var51];
                                    } else {
                                        class50.field430[0] = var49[var51];
                                        class50.field430[1] = var46[var51];
                                        class50.field430[2] = var47[var51];
                                        var73 = 3;
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class50.field430[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field6667[var75];
                                        int var78 = this.field6657[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var80 = 128 - var77;
                                            var79 = var78;
                                        } else if (var20 == 2) {
                                            var80 = 128 - var78;
                                            var79 = 128 - var77;
                                        } else if (var20 == 3) {
                                            var79 = 128 - var78;
                                            var80 = var77;
                                        } else {
                                            var79 = var77;
                                            var80 = var78;
                                        }
                                        var55[var52] = var79;
                                        var56[var52] = var80;
                                        if (var60 != null && class219.field2701[var19][var75]) {
                                            int var81 = (var12 << 7) + var79;
                                            int var82 = (var14 << 7) + var80;
                                            var60[var52] = arg5.method847(var81, var82) - arg3.method847(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class219.field2701[var19][var75]) {
                                                int var83 = (var12 << 7) + var79;
                                                int var84 = (var14 << 7) + var80;
                                                var61[var52] = arg3.method847(var83, var84) - arg5.method847(var83, var84);
                                            } else if (arg4 != null && !class343.field4425[var19][var75]) {
                                                int var85 = (var12 << 7) + var79;
                                                int var86 = (var14 << 7) + var80;
                                                var61[var52] = arg4.method847(var85, var86) - arg3.method847(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class143.field1708[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class420.field5436[var76];
                                            }
                                            var59[var52] = class200.field2401[var76];
                                            var58[var52] = class483.field6754[var76];
                                            var57[var52] = class544.field7973[var76];
                                        } else {
                                            if (var17 && class219.field2701[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var67.field5377;
                                                var59[var52] = var67.field5382;
                                            } else if (var79 == 0 && var80 == 128) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var68.field5377;
                                                var59[var52] = var68.field5382;
                                            } else if (var79 == 128 && var80 == 128) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var69.field5377;
                                                var59[var52] = var69.field5382;
                                            } else if (var79 == 128 && var80 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var70.field5377;
                                                var59[var52] = var70.field5382;
                                            } else {
                                                if (var79 >= 64) {
                                                    if (var80 < 64) {
                                                        var58[var52] = var70.field5377;
                                                        var59[var52] = var70.field5382;
                                                    } else {
                                                        var58[var52] = var69.field5377;
                                                        var59[var52] = var69.field5382;
                                                    }
                                                } else if (var80 < 64) {
                                                    var58[var52] = var67.field5377;
                                                    var59[var52] = var67.field5382;
                                                } else {
                                                    var58[var52] = var68.field5377;
                                                    var59[var52] = var68.field5382;
                                                }
                                                int var87 = class430.method2493(arg1 + 896, arg6[var13][var14], arg6[var12][var14], var79 << 7 >> 7);
                                                int var88 = class430.method2493(896, arg6[var13][var15], arg6[var12][var15], var79 << 7 >> 7);
                                                var57[var52] = class430.method2493(896, var88, var87, var80 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field5370) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg3.method855(var12, var14);
                            int var90 = arg3.method855(var13, var14);
                            int var91 = arg3.method855(var13, var15);
                            int var92 = arg3.method855(var12, var15);
                            if (arg2 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field3342) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field6661[arg2][var12][var14] = (byte) class42.method223(this.field6661[arg2][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field6677) {
                                var94 = class198.method1070(var12, var14);
                                var95 = class557.method3267(var12, var14);
                                var96 = class80.method465(var12, var14);
                            }
                            arg3.method849(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class220.method1270(arg2, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([[III)V")
    public final void method2772(int[][] arg0, int arg1, int arg2) {
        field6655++;
        int[][] var4 = this.field6681[arg2];
        int var5 = 0;
        if (arg1 > -9) {
            return;
        }
        while (var5 < this.field6680 + 1) {
            for (int var6 = 0; var6 < this.field6673 + 1; var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public static void method2773(int arg0) {
        if (arg0 != 17375) {
            field6674 = null;
        }
        field6674 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZZI)V")
    public static final void method2774(boolean arg0, boolean arg1, int arg2) {
        field6676++;
        if (arg2 != -1) {
            return;
        }
        if (arg1) {
            class376.field5014--;
            if (class376.field5014 == 0) {
                class404.field5317 = null;
            }
        }
        if (!arg0) {
            return;
        }
        class450.field6237--;
        if (class450.field6237 == 0) {
            class103.field1259 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIII)V")
    private final void method2775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6665++;
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var10 = arg4; var10 < (arg3 + arg4); var10++) {
                if (var10 >= 0 && this.field6680 > var10 && var7 >= 0 && this.field6673 > var7) {
                    this.field6681[arg1][var10][var7] = arg1 <= 0 ? 0 : this.field6681[arg1 - 1][var10][var7] - 240;
                }
            }
        }
        if (arg4 > 0 && this.field6680 > arg4) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg2; var8++) {
                if (var8 >= 0 && var8 < this.field6673) {
                    this.field6681[arg1][arg4][var8] = this.field6681[arg1][arg4 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && arg0 < this.field6673) {
            for (int var9 = arg4 + 1; var9 < (arg3 + arg4); var9++) {
                if (var9 >= 0 && var9 < this.field6680) {
                    this.field6681[arg1][var9][arg0] = this.field6681[arg1][var9][arg0 - 1];
                }
            }
        }
        if (~arg4 > arg5 || arg0 < 0 || this.field6680 <= arg4 || this.field6673 <= arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 > 0 && this.field6681[arg1][arg4 - 1][arg0] != 0) {
                this.field6681[arg1][arg4][arg0] = this.field6681[arg1][arg4 - 1][arg0];
                return;
            }
            if (arg0 > 0 && this.field6681[arg1][arg4][arg0 - 1] != 0) {
                this.field6681[arg1][arg4][arg0] = this.field6681[arg1][arg4][arg0 - 1];
                return;
            }
            if (arg4 > 0 && arg0 > 0 && this.field6681[arg1][arg4 - 1][arg0 - 1] != 0) {
                this.field6681[arg1][arg4][arg0] = this.field6681[arg1][arg4 - 1][arg0 - 1];
                return;
            }
        } else if (arg4 <= 0 || this.field6681[arg1 - 1][arg4 - 1][arg0] == this.field6681[arg1][arg4 - 1][arg0]) {
            if (arg0 <= 0 || this.field6681[arg1 - 1][arg4][arg0 - 1] == this.field6681[arg1][arg4][arg0 - 1]) {
                if (arg4 > 0 && arg0 > 0 && this.field6681[arg1][arg4 - 1][arg0 - 1] != this.field6681[arg1 - 1][arg4 - 1][arg0 - 1]) {
                    this.field6681[arg1][arg4][arg0] = this.field6681[arg1][arg4 - 1][arg0 - 1];
                    return;
                }
                return;
            }
            this.field6681[arg1][arg4][arg0] = this.field6681[arg1][arg4][arg0 - 1];
        } else {
            this.field6681[arg1][arg4][arg0] = this.field6681[arg1][arg4 - 1][arg0];
            return;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IIIZLiv;Lsca;)V")
    public class475(int arg0, int arg1, int arg2, boolean arg3, class81 arg4, class40 arg5) {
        this.field6677 = arg3;
        this.field6673 = arg2;
        this.field6654 = arg4;
        this.field6680 = arg1;
        this.field6662 = arg5;
        this.field6670 = arg0;
        this.field6658 = new byte[this.field6670][this.field6680][this.field6673];
        this.field6671 = new byte[this.field6670][this.field6680][this.field6673];
        this.field6659 = new byte[this.field6670][this.field6680][this.field6673];
        this.field6675 = new byte[this.field6670][this.field6680][this.field6673];
        this.field6661 = new byte[this.field6670][this.field6680 + 1][this.field6673 + 1];
        this.field6681 = new int[this.field6670][this.field6680 + 1][this.field6673 + 1];
    }
}
