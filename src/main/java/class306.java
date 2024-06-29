import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class306 {

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "[I")
    private int[] field4321 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "[I")
    private int[] field4333 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "Ldl;")
    private class62 field4312;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "Z")
    public boolean field4309;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "Lah;")
    private class382 field4317;

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "[[[B")
    private byte[][][] field4330;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "[[[B")
    public byte[][][] field4311;

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "[[[B")
    private byte[][][] field4331;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "[[[B")
    private byte[][][] field4319;

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "[[[B")
    private byte[][][] field4324;

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "[[[I")
    public int[][][] field4328;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "Lrr;")
    public static class361 field4313 = new class361();

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!bv", name = "B", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "[[[B")
    public byte[][][] field4316;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([Ljn;Lud;ZIIII)V")
    public final void method1978(class716[] arg0, class35 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field4326++;
        if (!this.field4309) {
            for (int var8 = 0; var8 < 4; var8++) {
                class716 var9 = arg0[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg6 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && var12 < this.field4315 && var13 >= 0 && this.field4318 > var13) {
                            var9.method3989(var12, -121, var13);
                        }
                    }
                }
            }
        }
        if (!arg2) {
            this.method1987(null, null, -32, -116, null, null, null);
        }
        int var14 = arg4 + arg6;
        int var15 = arg3 + arg5;
        for (int var16 = 0; var16 < this.field4329; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1985(0, 0, arg1, 0, false, var18 + arg3, var16, var15 + var18, 0, arg6 + var17, var14 + var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BIIIII)V")
    public final void method1979(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 126) {
            this.method1985(73, -25, null, -123, true, 83, 82, 25, -73, 120, 35);
        }
        for (int var7 = arg1; var7 < arg1 + arg4; var7++) {
            for (int var10 = arg3; var10 < arg3 + arg5; var10++) {
                if (var10 >= 0 && var10 < this.field4315 && var7 >= 0 && this.field4318 > var7) {
                    this.field4328[arg2][var10][var7] = arg2 > 0 ? this.field4328[arg2 - 1][var10][var7] - 960 : 0;
                }
            }
        }
        field4322++;
        if (arg3 > 0 && arg3 < this.field4315) {
            for (int var8 = arg1 + 1; var8 < (arg1 + arg4); var8++) {
                if (var8 >= 0 && this.field4318 > var8) {
                    this.field4328[arg2][arg3][var8] = this.field4328[arg2][arg3 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && this.field4318 > arg1) {
            for (int var9 = arg3 + 1; var9 < (arg3 + arg5); var9++) {
                if (var9 >= 0 && var9 < this.field4315) {
                    this.field4328[arg2][var9][arg1] = this.field4328[arg2][var9][arg1 - 1];
                }
            }
        }
        if (arg3 < 0 || arg1 < 0 || this.field4315 <= arg3 || this.field4318 <= arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 <= 0 || this.field4328[arg2][arg3 - 1][arg1] == 0) {
                if (arg1 > 0 && this.field4328[arg2][arg3][arg1 - 1] != 0) {
                    this.field4328[arg2][arg3][arg1] = this.field4328[arg2][arg3][arg1 - 1];
                    return;
                }
                if (arg3 > 0 && arg1 > 0 && this.field4328[arg2][arg3 - 1][arg1 - 1] != 0) {
                    this.field4328[arg2][arg3][arg1] = this.field4328[arg2][arg3 - 1][arg1 - 1];
                    return;
                }
                return;
            }
            this.field4328[arg2][arg3][arg1] = this.field4328[arg2][arg3 - 1][arg1];
        } else if (arg3 <= 0 || this.field4328[arg2 - 1][arg3 - 1][arg1] == this.field4328[arg2][arg3 - 1][arg1]) {
            if (arg1 > 0 && this.field4328[arg2 - 1][arg3][arg1 - 1] != this.field4328[arg2][arg3][arg1 - 1]) {
                this.field4328[arg2][arg3][arg1] = this.field4328[arg2][arg3][arg1 - 1];
                return;
            }
            if (arg3 > 0 && arg1 > 0 && this.field4328[arg2][arg3 - 1][arg1 - 1] != this.field4328[arg2 - 1][arg3 - 1][arg1 - 1]) {
                this.field4328[arg2][arg3][arg1] = this.field4328[arg2][arg3 - 1][arg1 - 1];
                return;
            }
        } else {
            this.field4328[arg2][arg3][arg1] = this.field4328[arg2][arg3 - 1][arg1];
            return;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIBI)V")
    public final void method1980(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 == -28) {
            for (int var6 = 0; var6 < this.field4329; var6++) {
                this.method1979((byte) 126, arg4, var6, arg2, arg0, arg1);
            }
            field4307++;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([[[I[Ljn;Lha;I)V")
    public final void method1981(int[][][] arg0, class716[] arg1, class58 arg2, int arg3) {
        field4308++;
        if (!this.field4309) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field4315; var6++) {
                    for (int var7 = 0; var7 < this.field4318; var7++) {
                        if ((class435.field6078[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class435.field6078[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method3995(var7, var6, true);
                            }
                        }
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 66 / (-arg3 / 63);
        while (var9 < this.field4329) {
            int var11 = 0;
            int var12 = 0;
            if (!this.field4309) {
                if (class613.field8870) {
                    var12 |= 0x8;
                }
                if (class131.field1967) {
                    var11 |= 0x2;
                }
                if (class475.field6807 != 0) {
                    var11 |= 0x1;
                    if (var9 == 0 | class215.field3084) {
                        var12 |= 0x10;
                    }
                }
            }
            if (class131.field1967) {
                var12 |= 0x7;
            }
            if (!class718.field10050) {
                var12 |= 0x20;
            }
            int[][] var13 = arg0 == null || arg0.length <= var9 ? this.field4328[var9] : arg0[var9];
            class69.method715(var9, arg2.method621(this.field4315, this.field4318, this.field4328[var9], var13, 512, var11, var12));
            var9++;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1982(int arg0) {
        field4332++;
        if (class34.field450 || class522.field7394 == null) {
            return "";
        } else if ((class522.field7394.field1192 == null || class522.field7394.field1192.length() == 0) && class522.field7394.field1182 != null && class522.field7394.field1182.length() > 0) {
            return class522.field7394.field1182;
        } else if (arg0 == -1) {
            return class522.field7394.field1192;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B[[II)V")
    public final void method1983(byte arg0, int[][] arg1, int arg2) {
        field4306++;
        int[][] var4 = this.field4328[arg2];
        for (int var5 = 0; var5 < this.field4315 + 1; var5++) {
            for (int var6 = 0; var6 < this.field4318 + 1; var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
        if (arg0 != 80) {
            this.field4319 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
    public static void method1984(byte arg0) {
        field4313 = null;
        int var1 = 100 % ((5 - arg0) / 56);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILud;IZIIIIII)V")
    private final void method1985(int arg0, int arg1, class35 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg8 == 1) {
            arg0 = 1;
        } else if (arg8 == 2) {
            arg3 = 1;
            arg0 = 1;
        } else if (arg8 == 3) {
            arg3 = 1;
        }
        field4305++;
        if (arg1 > arg9 || arg9 >= this.field4315 || arg5 < 0 || this.field4318 <= arg5) {
            while (true) {
                int var14 = arg2.method273(255);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg2.method273(arg1 ^ 0xFF);
                    return;
                }
                if (var14 <= 49) {
                    arg2.method273(255);
                }
            }
        }
        if (!this.field4309 && !arg4) {
            class435.field6078[arg6][arg9][arg5] = 0;
        }
        while (true) {
            int var12 = arg2.method273(255);
            if (var12 == 0) {
                if (this.field4309) {
                    this.field4328[0][arg3 + arg9][arg0 + arg5] = 0;
                    return;
                } else if (arg6 == 0) {
                    this.field4328[0][arg9 + arg3][arg5 + arg0] = -class564.method3294(arg10 + 932731, (byte) -111, arg7 + 556238) * 8 << 2;
                    return;
                } else {
                    this.field4328[arg6][arg3 + arg9][arg0 + arg5] = this.field4328[arg6 - 1][arg9 + arg3][arg0 + arg5] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg2.method273(255);
                if (this.field4309) {
                    this.field4328[0][arg3 + arg9][arg0 + arg5] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg6 != 0) {
                    this.field4328[arg6][arg3 + arg9][arg0 + arg5] = this.field4328[arg6 - 1][arg3 + arg9][arg5 + arg0] - (var13 * 8 << 2);
                    return;
                }
                this.field4328[0][arg3 + arg9][arg0 + arg5] = -var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg4) {
                    arg2.method273(255);
                } else {
                    this.field4330[arg6][arg9][arg5] = arg2.method277((byte) 72);
                    this.field4319[arg6][arg9][arg5] = (byte) ((var12 - 2) / 4);
                    this.field4324[arg6][arg9][arg5] = (byte) class555.method3246(arg8 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field4309 && !arg4) {
                    class435.field6078[arg6][arg9][arg5] = (byte) (var12 - 49);
                }
            } else if (!arg4) {
                this.field4331[arg6][arg9][arg5] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II[Z[[BILwl;[[BIIILul;[[BLha;I)V")
    private final void method1986(int arg0, int arg1, boolean[] arg2, byte[][] arg3, int arg4, class406 arg5, byte[][] arg6, int arg7, int arg8, int arg9, class569 arg10, byte[][] arg11, class58 arg12, int arg13) {
        field4325++;
        if (arg8 <= 49) {
            this.method1987(null, null, 69, -124, null, null, null);
        }
        boolean[] var15 = arg10 != null && arg10.field8102 ? class50.field808[arg0] : class284.field4033[arg0];
        if (arg9 > 0) {
            if (arg13 > 0) {
                int var16 = arg6[arg13 - 1][arg9 - 1] & 0xFF;
                if (var16 > 0) {
                    class569 var17 = this.field4312.method675(var16 - 1, 4);
                    if (var17.field8093 != -1 && var17.field8102) {
                        byte var18 = arg11[arg13 - 1][arg9 - 1];
                        int var19 = arg3[arg13 - 1][arg9 - 1] * 2 + 4 & 0x7;
                        int var20 = class224.method1552(var17, (byte) -57, arg12);
                        if (class382.field5354[var18][var19]) {
                            class415.field5812[0] = var17.field8093;
                            class487.field6893[0] = var20;
                            class689.field9708[0] = var17.field8099;
                            class282.field4008[0] = var17.field8100;
                            class321.field4571[0] = var17.field8103;
                            class320.field4545[0] = 256;
                        }
                    }
                }
            }
            if ((arg1 - 1) > arg13) {
                int var21 = arg6[arg13 + 1][arg9 - 1] & 0xFF;
                if (var21 > 0) {
                    class569 var22 = this.field4312.method675(var21 - 1, 4);
                    if (var22.field8093 != -1 && var22.field8102) {
                        byte var23 = arg11[arg13 + 1][arg9 - 1];
                        int var24 = arg3[arg13 + 1][arg9 - 1] * 2 + 6 & 0x7;
                        int var25 = class224.method1552(var22, (byte) -57, arg12);
                        if (class382.field5354[var23][var24]) {
                            class415.field5812[2] = var22.field8093;
                            class487.field6893[2] = var25;
                            class689.field9708[2] = var22.field8099;
                            class282.field4008[2] = var22.field8100;
                            class321.field4571[2] = var22.field8103;
                            class320.field4545[2] = 512;
                        }
                    }
                }
            }
        }
        if ((arg4 - 1) > arg9) {
            if (arg13 > 0) {
                int var26 = arg6[arg13 - 1][arg9 + 1] & 0xFF;
                if (var26 > 0) {
                    class569 var27 = this.field4312.method675(var26 - 1, 4);
                    if (var27.field8093 != -1 && var27.field8102) {
                        byte var28 = arg11[arg13 - 1][arg9 + 1];
                        int var29 = arg3[arg13 - 1][arg9 + 1] * 2 + 2 & 0x7;
                        int var30 = class224.method1552(var27, (byte) -57, arg12);
                        if (class382.field5354[var28][var29]) {
                            class415.field5812[6] = var27.field8093;
                            class487.field6893[6] = var30;
                            class689.field9708[6] = var27.field8099;
                            class282.field4008[6] = var27.field8100;
                            class321.field4571[6] = var27.field8103;
                            class320.field4545[6] = 64;
                        }
                    }
                }
            }
            if (arg1 - 1 > arg13) {
                int var31 = arg6[arg13 + 1][arg9 + 1] & 0xFF;
                if (var31 > 0) {
                    class569 var32 = this.field4312.method675(var31 - 1, 4);
                    if (var32.field8093 != -1 && var32.field8102) {
                        byte var33 = arg11[arg13 + 1][arg9 + 1];
                        int var34 = -(-(arg3[arg13 + 1][arg9 + 1] * 2)) & 0x7;
                        int var35 = class224.method1552(var32, (byte) -57, arg12);
                        if (class382.field5354[var33][var34]) {
                            class415.field5812[4] = var32.field8093;
                            class487.field6893[4] = var35;
                            class689.field9708[4] = var32.field8099;
                            class282.field4008[4] = var32.field8100;
                            class321.field4571[4] = var32.field8103;
                            class320.field4545[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg9 > 0) {
            int var36 = arg6[arg13][arg9 - 1] & 0xFF;
            if (var36 > 0) {
                class569 var37 = this.field4312.method675(var36 - 1, 4);
                if (var37.field8093 != -1) {
                    byte var38 = arg11[arg13][arg9 - 1];
                    byte var39 = arg3[arg13][arg9 - 1];
                    if (var37.field8102) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class224.method1552(var37, (byte) -57, arg12);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class382.field5354[var38][var41] && class321.field4571[var40] <= var37.field8103) {
                                class415.field5812[var40] = var37.field8093;
                                class487.field6893[var40] = var42;
                                class689.field9708[var40] = var37.field8099;
                                class282.field4008[var40] = var37.field8100;
                                if (class321.field4571[var40] == var37.field8103) {
                                    class320.field4545[var40] = class164.method1221(class320.field4545[var40], 32);
                                } else {
                                    class320.field4545[var40] = 32;
                                }
                                class321.field4571[var40] = var37.field8103;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg7 & 0x3]) {
                            arg2[0] = class50.field808[var38][class555.method3246(var39 + 2, 3)];
                        }
                    } else if (!var15[arg7 & 0x3]) {
                        arg2[0] = class284.field4033[var38][class555.method3246(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg4 - 1 > arg9) {
            int var44 = arg6[arg13][arg9 + 1] & 0xFF;
            if (var44 > 0) {
                class569 var45 = this.field4312.method675(var44 - 1, 4);
                if (var45.field8093 != -1) {
                    byte var46 = arg11[arg13][arg9 + 1];
                    byte var47 = arg3[arg13][arg9 + 1];
                    if (var45.field8102) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class224.method1552(var45, (byte) -57, arg12);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class382.field5354[var46][var49] && class321.field4571[var48] <= var45.field8103) {
                                class415.field5812[var48] = var45.field8093;
                                class487.field6893[var48] = var50;
                                class689.field9708[var48] = var45.field8099;
                                class282.field4008[var48] = var45.field8100;
                                if (class321.field4571[var48] == var45.field8103) {
                                    class320.field4545[var48] = class164.method1221(class320.field4545[var48], 16);
                                } else {
                                    class320.field4545[var48] = 16;
                                }
                                class321.field4571[var48] = var45.field8103;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg7 + 2 & 0x3]) {
                            arg2[2] = class50.field808[var46][class555.method3246(3, var47)];
                        }
                    } else if (!var15[arg7 + 2 & 0x3]) {
                        arg2[2] = class284.field4033[var46][class555.method3246(var47, 3)];
                    }
                }
            }
        }
        if (arg13 > 0) {
            int var52 = arg6[arg13 - 1][arg9] & 0xFF;
            if (var52 > 0) {
                class569 var53 = this.field4312.method675(var52 - 1, 4);
                if (var53.field8093 != -1) {
                    byte var54 = arg11[arg13 - 1][arg9];
                    byte var55 = arg3[arg13 - 1][arg9];
                    if (var53.field8102) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class224.method1552(var53, (byte) -57, arg12);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class382.field5354[var54][var57] && var53.field8103 >= class321.field4571[var56]) {
                                class415.field5812[var56] = var53.field8093;
                                class487.field6893[var56] = var58;
                                class689.field9708[var56] = var53.field8099;
                                class282.field4008[var56] = var53.field8100;
                                if (class321.field4571[var56] == var53.field8103) {
                                    class320.field4545[var56] = class164.method1221(class320.field4545[var56], 8);
                                } else {
                                    class320.field4545[var56] = 8;
                                }
                                class321.field4571[var56] = var53.field8103;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg7 + 3 & 0x3]) {
                            arg2[3] = class50.field808[var54][class555.method3246(var55 + 1, 3)];
                        }
                    } else if (!var15[arg7 + 3 & 0x3]) {
                        arg2[3] = class284.field4033[var54][class555.method3246(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg13 < arg1 - 1) {
            int var60 = arg6[arg13 + 1][arg9] & 0xFF;
            if (var60 > 0) {
                class569 var61 = this.field4312.method675(var60 - 1, 4);
                if (var61.field8093 != -1) {
                    byte var62 = arg11[arg13 + 1][arg9];
                    byte var63 = arg3[arg13 + 1][arg9];
                    if (var61.field8102) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class224.method1552(var61, (byte) -57, arg12);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class382.field5354[var62][var65] && class321.field4571[var64] <= var61.field8103) {
                                class415.field5812[var64] = var61.field8093;
                                class487.field6893[var64] = var66;
                                class689.field9708[var64] = var61.field8099;
                                class282.field4008[var64] = var61.field8100;
                                if (class321.field4571[var64] == var61.field8103) {
                                    class320.field4545[var64] = class164.method1221(class320.field4545[var64], 4);
                                } else {
                                    class320.field4545[var64] = 4;
                                }
                                class321.field4571[var64] = var61.field8103;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg7 + 1 & 0x3]) {
                            arg2[1] = class50.field808[var62][class555.method3246(var63 + 3, 3)];
                        }
                    } else if (!var15[arg7 + 1 & 0x3]) {
                        arg2[1] = class284.field4033[var62][class555.method3246(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg10 == null) {
            return;
        }
        int var68 = class224.method1552(arg10, (byte) -57, arg12);
        if (!arg10.field8102) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg7 * 2) & 0x7;
            if (class382.field5354[arg0][var69] && class321.field4571[var70] <= arg10.field8103) {
                class415.field5812[var70] = arg10.field8093;
                class487.field6893[var70] = var68;
                class689.field9708[var70] = arg10.field8099;
                class282.field4008[var70] = arg10.field8100;
                if (class321.field4571[var70] == arg10.field8103) {
                    class320.field4545[var70] = class164.method1221(class320.field4545[var70], 2);
                } else {
                    class320.field4545[var70] = 2;
                }
                class321.field4571[var70] = arg10.field8103;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lha;[[IIILs;Ls;Ls;)V")
    private final void method1987(class58 arg0, int[][] arg1, int arg2, int arg3, class278 arg4, class278 arg5, class278 arg6) {
        field4314++;
        int var8 = 0;
        if (arg2 != 2) {
            return;
        }
        while (this.field4315 > var8) {
            for (int var9 = 0; var9 < this.field4318; var9++) {
                if (class425.field5949 == -1 || class328.method2096(var8, (byte) -73, arg3, var9, class425.field5949)) {
                    byte var10 = this.field4319[arg3][var8][var9];
                    byte var11 = this.field4324[arg3][var8][var9];
                    int var12 = this.field4330[arg3][var8][var9] & 0xFF;
                    int var13 = this.field4331[arg3][var8][var9] & 0xFF;
                    class569 var14 = var12 == 0 ? null : this.field4312.method675(var12 - 1, arg2 ^ 0x6);
                    class406 var15 = var13 == 0 ? null : this.field4317.method2400(false, var13 - 1);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class626.field8993[var10];
                        var17 = var14 == null ? 0 : class332.field4687[var10];
                    } else if (var14 != null) {
                        var17 = class332.field4687[var10];
                    } else if (var15 != null) {
                        var16 = class332.field4687[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20 = var14 == null ? -1 : var14.field8099;
                        int var21 = var15 == null ? -1 : var15.field5654;
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        int[] var25 = new int[var18];
                        boolean var26 = false;
                        boolean var27 = false;
                        if (var14 != null && (var14.field8093 != -1 || var14.field8105 != -1 || var20 != -1)) {
                            for (int var28 = 0; var28 < var17; var28++) {
                                var24[var19] = var20;
                                var25[var19] = var14.field8100;
                                if (var14.field8093 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var22[var19] = var14.field8093;
                                }
                                if (var14.field8105 == -1) {
                                    var23[var19] = -1;
                                } else {
                                    var23[var19] = var14.field8105;
                                    var26 = true;
                                }
                                var19++;
                            }
                            if (!this.field4309 && arg3 == 0) {
                                class122.method973(var8, var9, var14.field8098, var14.field8094 * 8, var14.field8107);
                            }
                        } else {
                            var27 = true;
                            for (int var29 = 0; var29 < var17; var29++) {
                                var22[var19] = -1;
                                var19++;
                            }
                        }
                        if (!var26) {
                            var23 = null;
                        }
                        if (var15 == null) {
                            if (var27) {
                                continue;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = -1;
                                var19++;
                            }
                        } else {
                            for (int var31 = 0; var31 < var16; var31++) {
                                var24[var19] = var21;
                                var25[var19] = var15.field5663;
                                var22[var19] = arg1[var8][var9];
                                if (var23 != null) {
                                    var23[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var32 = this.field4321.length;
                        int[] var33 = new int[var32];
                        int[] var34 = new int[var32];
                        int[] var35 = arg6 == null ? null : new int[var32];
                        int[] var36 = arg6 == null && arg5 == null ? null : new int[var32];
                        for (int var37 = 0; var37 < var32; var37++) {
                            int var47 = this.field4321[var37];
                            int var48 = this.field4333[var37];
                            if (var11 == 0) {
                                var33[var37] = var47;
                                var34[var37] = var48;
                            } else if (var11 == 1) {
                                var33[var37] = var48;
                                var34[var37] = 512 - var47;
                            } else if (var11 == 2) {
                                var33[var37] = 512 - var47;
                                var34[var37] = 512 - var48;
                            } else if (var11 == 3) {
                                var33[var37] = 512 - var48;
                                var34[var37] = var47;
                            }
                            if (var35 != null && class382.field5354[var10][var37]) {
                                int var51 = (var8 << 9) + var33[var37];
                                int var52 = (var9 << 9) + var34[var37];
                                var35[var37] = arg6.method1827(-3458, var51, var52) - arg4.method1827(-3458, var51, var52);
                            }
                            if (var36 != null) {
                                if (arg6 != null && !class382.field5354[var10][var37]) {
                                    int var53 = (var8 << 9) + var33[var37];
                                    int var54 = (var9 << 9) + var34[var37];
                                    var36[var37] = arg4.method1827(-3458, var53, var54) - arg6.method1827(-3458, var53, var54);
                                } else if (arg5 != null && !class289.field4069[var10][var37]) {
                                    int var55 = (var8 << 9) + var33[var37];
                                    int var56 = (var9 << 9) + var34[var37];
                                    var36[var37] = arg5.method1827(-3458, var55, var56) - arg4.method1827(arg2 - 3460, var55, var56);
                                }
                            }
                        }
                        int var38 = arg4.method1825(var9, arg2 - 130, var8);
                        int var39 = arg4.method1825(var9, arg2 - 130, var8 + 1);
                        int var40 = arg4.method1825(var9 + 1, -128, var8 + 1);
                        int var41 = arg4.method1825(var9 + 1, -128, var8);
                        boolean var42 = class634.method3647(-113, var9, var8);
                        if (var42 && arg3 > 1 || !var42 && arg3 > 0) {
                            boolean var43 = true;
                            if (var15 != null && !var15.field5657) {
                                var43 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var43 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field8106) {
                                var43 = false;
                            }
                            if (var43 && var38 == var39 && var38 == var40 && var38 == var41) {
                                this.field4311[arg3][var8][var9] = (byte) class164.method1221(this.field4311[arg3][var8][var9], 4);
                            }
                        }
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        if (this.field4309) {
                            var44 = class388.method2421(var8, var9);
                            var45 = class190.method1339(var8, var9);
                            var46 = class696.method3914(var8, var9);
                        }
                        arg4.method1080(var8, var9, var33, var35, var34, var36, class641.field9130[var10], class189.field2718[var10], class715.field9978[var10], var22, var23, var24, var25, var44, var45, var46, false);
                        class467.method2836(arg3, var8, var9);
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([Ljn;IBIIIILud;II)V")
    public final void method1988(class716[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, class35 arg7, int arg8, int arg9) {
        field4320++;
        int var11 = (arg4 & 0x7) * 8;
        int var12 = (arg8 & 0x7) * 8;
        if (!this.field4309) {
            class716 var13 = arg0[arg9];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg6 + class740.method4121(arg3, -28675, var14 & 0x7, var15 & 0x7);
                    int var17 = arg5 + class317.method2039(var14 & 0x7, var15 & 0x7, arg3, -2);
                    if (var16 > 0 && this.field4315 - 1 > var16 && var17 > 0 && (this.field4318 - 1) > var17) {
                        var13.method3989(var16, 123, var17);
                    }
                }
            }
        }
        int var18 = arg4 & 0x1FFFFFF8 << 3;
        if (arg2 >= -34) {
            field4310 = -59;
        }
        int var19 = arg8 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg3 == 1) {
            var21 = 1;
        } else if (arg3 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg3 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field4329; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 == var22 && var11 <= var23 && var11 + 8 >= var23 && var24 >= var12 && var12 + 8 >= var24) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || var12 + 8 == var24) {
                            if (arg3 == 0) {
                                var26 = arg5 - (var12 - var24);
                                var25 = arg6 + var23 - var11;
                            } else if (arg3 == 1) {
                                var26 = arg5 + var11 + 8 - var23;
                                var25 = var24 + arg6 - var12;
                            } else if (arg3 == 2) {
                                var25 = arg6 + 8 - (var23 - var11);
                                var26 = var12 + arg5 + 8 - var24;
                            } else {
                                var26 = var23 + arg5 - var11;
                                var25 = var12 + arg6 + 8 - var24;
                            }
                            this.method1985(0, 0, arg7, 0, true, var26, arg9, var19 + var24, 0, var25, var18 + var23);
                        } else {
                            var25 = class740.method4121(arg3, -28675, var23 & 0x7, var24 & 0x7) + arg6;
                            var26 = arg5 + class317.method2039(var23 & 0x7, var24 & 0x7, arg3, -2);
                            this.method1985(var21, 0, arg7, var20, false, var26, arg9, var19 + var24, arg3, var25, var18 + var23);
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
                                    var30 = var24 == 63 ? 64 : var24;
                                    var29 = var23 == 63 ? 64 : var23;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg3 == 0) {
                                    var31 = arg6 + var29 - var11;
                                    var32 = arg5 + var30 - var12;
                                } else if (arg3 == 1) {
                                    var31 = var30 + arg6 - var12;
                                    var32 = arg5 + var11 + 8 - var29;
                                } else if (arg3 == 2) {
                                    var32 = var12 + arg5 + 8 - var30;
                                    var31 = var11 + arg6 + 8 - var29;
                                } else {
                                    var32 = var29 + arg5 - var11;
                                    var31 = arg6 - (-var12 - 8) - var30;
                                }
                                if (var31 >= 0 && var31 < this.field4315 && var32 >= 0 && this.field4318 > var32) {
                                    this.field4328[arg9][var31][var32] = this.field4328[arg9][var25 + var20][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method1985(0, 0, arg7, 0, false, -1, 0, 0, 0, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ls;ILs;Ls;Lha;I[[I)V")
    private final void method1989(class278 arg0, int arg1, class278 arg2, class278 arg3, class58 arg4, int arg5, int[][] arg6) {
        field4323++;
        byte[][] var8 = this.field4319[arg5];
        byte[][] var9 = this.field4324[arg5];
        byte[][] var10 = this.field4331[arg5];
        byte[][] var11 = this.field4330[arg5];
        for (int var12 = arg1; var12 < this.field4315; var12++) {
            int var13 = var12 < this.field4315 - 1 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field4318; var14++) {
                int var15 = var14 < this.field4318 - 1 ? var14 + 1 : var14;
                if (class425.field5949 == -1 || class328.method2096(var12, (byte) -73, arg5, var14, class425.field5949)) {
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
                        class569 var26 = var21 == 0 ? null : this.field4312.method675(var21 - 1, 4);
                        class406 var27 = var22 == 0 ? null : this.field4317.method2400(false, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class569 var28 = var26;
                        if (var26 != null) {
                            if (var26.field8093 == -1 && var26.field8105 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field8102;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field4315 > var12 && this.field4318 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var32++;
                            } else {
                                var34--;
                                var32--;
                            }
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var35++;
                            } else {
                                var35--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var35++;
                                var36++;
                            } else {
                                var36--;
                                var35--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var36--;
                                var34--;
                            }
                            int var37 = var34 - var35;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg2.method1825(var14, -128, var12) - arg2.method1825(var15, -128, var13);
                                var38 = arg2.method1825(var14, -128, var13) - arg2.method1825(var15, -128, var12);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class321.field4571[var39] = -1;
                            class320.field4545[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field8102 ? class50.field808[var19] : class284.field4033[var19];
                        this.method1986(var19, this.field4315, var18, var9, this.field4318, var27, var11, var20, 54, var14, var26, var8, arg4, var12);
                        boolean var41 = var26 != null && var26.field8105 != var26.field8093;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class321.field4571[var42] >= 0 && class487.field6893[var42] != class415.field5812[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class423.method2585(var18[1], class555.method3246(class320.field4545[2], class320.field4545[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class423.method2585(var18[3], class555.method3246(class320.field4545[0], class320.field4545[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class423.method2585(var18[0], class555.method3246(class320.field4545[0], class320.field4545[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class423.method2585(var18[2], class555.method3246(class320.field4545[6], class320.field4545[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var48 = class715.field9978[var19];
                            var49 = var26 == null ? 0 : class332.field4687[var19];
                            var47 = var27 == null ? 0 : class626.field8993[var19];
                            var46 = class641.field9130[var19];
                            var45 = class189.field2718[var19];
                        } else if (var17) {
                            var47 = var27 == null ? 0 : class146.field2233[var19];
                            var48 = class104.field1740[var19];
                            var45 = class72.field1285[var19];
                            var46 = class180.field2585[var19];
                            var49 = var26 == null ? 0 : class591.field8300[var19];
                            var44 = class741.field10395[var19];
                        } else {
                            var45 = class501.field7164[var19];
                            var46 = class496.field7070[var19];
                            var47 = var27 == null ? 0 : class342.field4810[var19];
                            var44 = class468.field6745[var19];
                            var48 = class396.field5543[var19];
                            var49 = var26 == null ? 0 : class284.field4032[var19];
                        }
                        int var50 = var47 + var49;
                        if (var50 <= 0) {
                            class467.method2836(arg5, var12, var14);
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
                            int[] var60 = arg3 == null ? null : new int[var53];
                            int[] var61 = arg3 == null && arg0 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var63 = var26.field8099;
                                var64 = var26.field8100;
                                var62 = var26.field8093;
                                int var65 = class224.method1552(var26, (byte) -57, arg4);
                                for (int var66 = 0; var66 < var49; var66++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class369.field5176[0] = var46[var51];
                                        class369.field5176[1] = 1;
                                        class369.field5176[2] = var48[var51];
                                        class369.field5176[3] = 1;
                                        class369.field5176[4] = var45[var51];
                                        class369.field5176[5] = var48[var51];
                                        var99 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class369.field5176[0] = var46[var51];
                                        class369.field5176[1] = 5;
                                        class369.field5176[2] = var48[var51];
                                        class369.field5176[3] = 5;
                                        class369.field5176[4] = var45[var51];
                                        var99 = 6;
                                        class369.field5176[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class369.field5176[0] = var46[var51];
                                        class369.field5176[1] = 3;
                                        class369.field5176[2] = var48[var51];
                                        class369.field5176[3] = 3;
                                        class369.field5176[4] = var45[var51];
                                        var99 = 6;
                                        class369.field5176[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class369.field5176[0] = var46[var51];
                                        class369.field5176[1] = 7;
                                        class369.field5176[2] = var48[var51];
                                        class369.field5176[3] = 7;
                                        class369.field5176[4] = var45[var51];
                                        class369.field5176[5] = var48[var51];
                                        var99 = 6;
                                    } else {
                                        class369.field5176[0] = var46[var51];
                                        class369.field5176[1] = var45[var51];
                                        class369.field5176[2] = var48[var51];
                                        var99 = 3;
                                    }
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class369.field5176[var100];
                                        int var102 = var101 - (var20 * 2) & 0x7;
                                        int var103 = this.field4321[var101];
                                        int var104 = this.field4333[var101];
                                        int var105;
                                        int var106;
                                        if (var20 == 1) {
                                            var105 = var104;
                                            var106 = 512 - var103;
                                        } else if (var20 == 2) {
                                            var105 = 512 - var103;
                                            var106 = 512 - var104;
                                        } else if (var20 == 3) {
                                            var106 = var103;
                                            var105 = 512 - var104;
                                        } else {
                                            var106 = var104;
                                            var105 = var103;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var106;
                                        if (var60 != null && class382.field5354[var19][var101]) {
                                            int var107 = (var12 << 9) + var105;
                                            int var108 = (var14 << 9) + var106;
                                            var60[var52] = arg3.method1827(class349.method2193(arg1, -3458), var107, var108) - arg2.method1827(-3458, var107, var108);
                                        }
                                        if (var61 != null) {
                                            if (arg3 != null && !class382.field5354[var19][var101]) {
                                                int var109 = (var12 << 9) + var105;
                                                int var110 = (var14 << 9) + var106;
                                                var61[var52] = arg2.method1827(-3458, var109, var110) - arg3.method1827(arg1 - 3458, var109, var110);
                                            } else if (arg0 != null && !class289.field4069[var19][var101]) {
                                                int var111 = (var12 << 9) + var105;
                                                int var112 = (var14 << 9) + var106;
                                                var61[var52] = arg0.method1827(-3458, var111, var112) - arg2.method1827(-3458, var111, var112);
                                            }
                                        }
                                        if (var101 < 8 && class321.field4571[var102] > var26.field8103) {
                                            if (var54 != null) {
                                                var54[var52] = class487.field6893[var102];
                                            }
                                            var59[var52] = class282.field4008[var102];
                                            var58[var52] = class689.field9708[var102];
                                            var57[var52] = class415.field5812[var102];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field8099;
                                            var59[var52] = var26.field8100;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field4309 && arg5 == 0) {
                                    class122.method973(var12, var14, var26.field8098, var26.field8094 * 8, var26.field8107);
                                }
                                if (var19 != 12 && var26.field8093 != -1 && var26.field8095) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class332.field4687[var19];
                            } else if (var17) {
                                var51 += class591.field8300[var19];
                            } else {
                                var51 += class284.field4032[var19];
                            }
                            if (var27 != null) {
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class406 var67 = this.field4317.method2400(false, var22 - 1);
                                class406 var68 = this.field4317.method2400(false, var23 - 1);
                                class406 var69 = this.field4317.method2400(false, var24 - 1);
                                class406 var70 = this.field4317.method2400(false, var25 - 1);
                                for (int var71 = 0; var71 < var47; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class369.field5176[0] = var46[var51];
                                        class369.field5176[1] = 1;
                                        class369.field5176[2] = var48[var51];
                                        class369.field5176[3] = 1;
                                        class369.field5176[4] = var45[var51];
                                        var73 = 6;
                                        class369.field5176[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class369.field5176[0] = var46[var51];
                                        class369.field5176[1] = 5;
                                        class369.field5176[2] = var48[var51];
                                        class369.field5176[3] = 5;
                                        class369.field5176[4] = var45[var51];
                                        var73 = 6;
                                        class369.field5176[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class369.field5176[0] = var46[var51];
                                        class369.field5176[1] = 3;
                                        class369.field5176[2] = var48[var51];
                                        class369.field5176[3] = 3;
                                        class369.field5176[4] = var45[var51];
                                        var73 = 6;
                                        class369.field5176[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class369.field5176[0] = var46[var51];
                                        class369.field5176[1] = 7;
                                        class369.field5176[2] = var48[var51];
                                        class369.field5176[3] = 7;
                                        class369.field5176[4] = var45[var51];
                                        class369.field5176[5] = var48[var51];
                                        var73 = 6;
                                    } else {
                                        class369.field5176[0] = var46[var51];
                                        class369.field5176[1] = var45[var51];
                                        var73 = 3;
                                        class369.field5176[2] = var48[var51];
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class369.field5176[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field4321[var75];
                                        int var78 = this.field4333[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = var78;
                                            var80 = 512 - var77;
                                        } else if (var20 == 2) {
                                            var80 = 512 - var78;
                                            var79 = 512 - var77;
                                        } else if (var20 == 3) {
                                            var80 = var77;
                                            var79 = 512 - var78;
                                        } else {
                                            var80 = var78;
                                            var79 = var77;
                                        }
                                        var55[var52] = var79;
                                        var56[var52] = var80;
                                        if (var60 != null && class382.field5354[var19][var75]) {
                                            int var81 = (var12 << 9) + var79;
                                            int var82 = (var14 << 9) + var80;
                                            var60[var52] = arg3.method1827(arg1 - 3458, var81, var82) - arg2.method1827(arg1 - 3458, var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg3 != null && !class382.field5354[var19][var75]) {
                                                int var83 = (var12 << 9) + var79;
                                                int var84 = (var14 << 9) + var80;
                                                var61[var52] = arg2.method1827(class349.method2193(arg1, -3458), var83, var84) - arg3.method1827(-3458, var83, var84);
                                            } else if (arg0 != null && !class289.field4069[var19][var75]) {
                                                int var85 = (var12 << 9) + var79;
                                                int var86 = (var14 << 9) + var80;
                                                var61[var52] = arg0.method1827(-3458, var85, var86) - arg2.method1827(-3458, var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class321.field4571[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class487.field6893[var76];
                                            }
                                            var59[var52] = class282.field4008[var76];
                                            var58[var52] = class689.field9708[var76];
                                            var57[var52] = class415.field5812[var76];
                                        } else {
                                            if (var17 && class382.field5354[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var67.field5654;
                                                var59[var52] = var67.field5663;
                                            } else if (var79 == 0 && var80 == 512) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var68.field5654;
                                                var59[var52] = var68.field5663;
                                            } else if (var79 == 512 && var80 == 512) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var69.field5654;
                                                var59[var52] = var69.field5663;
                                            } else if (var79 == 512 && var80 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var70.field5654;
                                                var59[var52] = var70.field5663;
                                            } else {
                                                if (var79 >= 256) {
                                                    if (var80 < 256) {
                                                        var58[var52] = var70.field5654;
                                                        var59[var52] = var70.field5663;
                                                    } else {
                                                        var58[var52] = var69.field5654;
                                                        var59[var52] = var69.field5663;
                                                    }
                                                } else if (var80 < 256) {
                                                    var58[var52] = var67.field5654;
                                                    var59[var52] = var67.field5663;
                                                } else {
                                                    var58[var52] = var68.field5654;
                                                    var59[var52] = var68.field5663;
                                                }
                                                int var87 = class25.method154(var79 << 7 >> 9, arg6[var12][var14], arg6[var13][var14], arg1 + 26849);
                                                int var88 = class25.method154(var79 << 7 >> 9, arg6[var12][var15], arg6[var13][var15], 26849);
                                                var57[var52] = class25.method154(var80 << 7 >> 9, var87, var88, arg1 + 26849);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field5651) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg2.method1825(var14, arg1 - 128, var12);
                            int var90 = arg2.method1825(var14, arg1 ^ 0xFFFFFF80, var13);
                            int var91 = arg2.method1825(var15, -128, var13);
                            int var92 = arg2.method1825(var15, -128, var12);
                            boolean var93 = class634.method3647(-110, var14, var12);
                            if (var93 && arg5 > 1 || !var93 && arg5 > 0) {
                                boolean var94 = true;
                                if (var27 != null && !var27.field5657) {
                                    var94 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var94 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field8106) {
                                    var94 = false;
                                }
                                if (var94 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field4311[arg5][var12][var14] = (byte) class164.method1221(this.field4311[arg5][var12][var14], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field4309) {
                                var95 = class388.method2421(var12, var14);
                                var96 = class190.method1339(var12, var14);
                                var97 = class696.method3914(var12, var14);
                            }
                            arg2.method1092(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var95, var96, var97, var16);
                            class467.method2836(arg5, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ls;ILha;Ls;)V")
    public final void method1990(class278 arg0, int arg1, class58 arg2, class278 arg3) {
        field4327++;
        int[][] var5 = new int[this.field4315][this.field4318];
        if (class453.field6368 == null || class453.field6368.length != this.field4318) {
            class453.field6368 = new int[this.field4318];
            class543.field7662 = new int[this.field4318];
            class352.field4963 = new int[this.field4318];
            class594.field8505 = new int[this.field4318];
            class2.field15 = new int[this.field4318];
        }
        if (arg1 <= 40) {
            return;
        }
        for (int var6 = 0; var6 < this.field4329; var6++) {
            for (int var8 = 0; var8 < this.field4318; var8++) {
                class453.field6368[var8] = 0;
                class352.field4963[var8] = 0;
                class2.field15[var8] = 0;
                class543.field7662[var8] = 0;
                class594.field8505[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field4315; var9++) {
                for (int var10 = 0; var10 < this.field4318; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field4315) {
                        int var20 = this.field4331[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class406 var21 = this.field4317.method2400(false, var20 - 1);
                            class453.field6368[var10] += var21.field5658;
                            class352.field4963[var10] += var21.field5659;
                            class2.field15[var10] += var21.field5662;
                            class543.field7662[var10] += var21.field5664;
                            var10002 = class594.field8505[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field4331[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class406 var24 = this.field4317.method2400(false, var23 - 1);
                            class453.field6368[var10] -= var24.field5658;
                            class352.field4963[var10] -= var24.field5659;
                            class2.field15[var10] -= var24.field5662;
                            class543.field7662[var10] -= var24.field5664;
                            var10002 = class594.field8505[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field4318; var16++) {
                        int var17 = var16 + 5;
                        if (this.field4318 > var17) {
                            var12 += class352.field4963[var17];
                            var15 += class594.field8505[var17];
                            var14 += class543.field7662[var17];
                            var11 += class453.field6368[var17];
                            var13 += class2.field15[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var14 -= class543.field7662[var18];
                            var11 -= class453.field6368[var18];
                            var13 -= class2.field15[var18];
                            var12 -= class352.field4963[var18];
                            var15 -= class594.field8505[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class339.method2155(-90, var13 / var15, var11 * 256 / var14, var12 / var15);
                        }
                    }
                }
            }
            if (class290.field4077) {
                this.method1989(var6 == 0 ? arg3 : null, 0, class138.field2153[var6], var6 == 0 ? arg0 : null, arg2, var6, var5);
            } else {
                this.method1987(arg2, var5, 2, var6, class138.field2153[var6], var6 == 0 ? arg3 : null, var6 == 0 ? arg0 : null);
            }
            this.field4331[var6] = null;
            this.field4330[var6] = null;
            this.field4319[var6] = null;
            this.field4324[var6] = null;
        }
        if (!this.field4309) {
            if (class475.field6807 != 0) {
                class758.method4213();
            }
            if (class131.field1967) {
                class462.method2808();
            }
        }
        for (int var7 = 0; var7 < this.field4329; var7++) {
            class138.field2153[var7].method1085();
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIIZLdl;Lah;)V")
    public class306(int arg0, int arg1, int arg2, boolean arg3, class62 arg4, class382 arg5) {
        this.field4312 = arg4;
        this.field4309 = arg3;
        this.field4315 = arg1;
        this.field4318 = arg2;
        this.field4317 = arg5;
        this.field4329 = arg0;
        this.field4330 = new byte[this.field4329][this.field4315][this.field4318];
        this.field4311 = new byte[this.field4329][this.field4315 + 1][this.field4318 + 1];
        this.field4331 = new byte[this.field4329][this.field4315][this.field4318];
        this.field4319 = new byte[this.field4329][this.field4315][this.field4318];
        this.field4324 = new byte[this.field4329][this.field4315][this.field4318];
        this.field4328 = new int[this.field4329][this.field4315 + 1][this.field4318 + 1];
    }
}
