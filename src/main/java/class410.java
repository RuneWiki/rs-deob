import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class410 {

    @OriginalMember(owner = "client!we", name = "n", descriptor = "[I")
    private int[] field5212 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!we", name = "l", descriptor = "[I")
    private int[] field5210 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field5203;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public int field5208;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "Lpg;")
    private class735 field5225;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Z")
    public boolean field5215;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public int field5214;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "Lls;")
    private class142 field5221;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "[[[B")
    private byte[][][] field5218;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "[[[B")
    public byte[][][] field5216;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "[[[B")
    private byte[][][] field5223;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[[[B")
    private byte[][][] field5205;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "[[[I")
    public int[][][] field5224;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "[[[B")
    private byte[][][] field5207;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public static int field5227 = 0;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[[[B")
    public byte[][][] field5200;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lha;IIII[[B[ZIII[[BLao;[[BLpia;)V", line = 3)
    private final void method2289(class60 arg0, int arg1, int arg2, int arg3, int arg4, byte[][] arg5, boolean[] arg6, int arg7, int arg8, int arg9, byte[][] arg10, class290 arg11, byte[][] arg12, class97 arg13) {
        field5204++;
        boolean[] var15 = arg13 != null && arg13.field1341 ? class601.field8360[arg9] : class524.field7325[arg9];
        if (arg3 != 2) {
            this.field5214 = -78;
        }
        if (arg4 > 0) {
            if (arg2 > 0) {
                int var16 = arg5[arg2 - 1][arg4 - 1] & 0xFF;
                if (var16 > 0) {
                    class97 var17 = this.field5221.method1028(-5249, var16 - 1);
                    if (var17.field1342 != -1 && var17.field1341) {
                        byte var18 = arg10[arg2 - 1][arg4 - 1];
                        int var19 = (arg12[arg2 - 1][arg4 - 1] * 2) + 4 & 0x7;
                        int var20 = class448.method2527(arg0, -32440, var17);
                        if (class743.field10363[var18][var19]) {
                            class445.field5926[0] = var17.field1342;
                            class436.field5811[0] = var20;
                            class365.field4705[0] = var17.field1360;
                            class129.field1836[0] = var17.field1339;
                            class523.field7322[0] = var17.field1361;
                            class712.field9875[0] = 256;
                        }
                    }
                }
            }
            if (arg2 < arg7 - 1) {
                int var21 = arg5[arg2 + 1][arg4 - 1] & 0xFF;
                if (var21 > 0) {
                    class97 var22 = this.field5221.method1028(-5249, var21 - 1);
                    if (var22.field1342 != -1 && var22.field1341) {
                        byte var23 = arg10[arg2 + 1][arg4 - 1];
                        int var24 = arg12[arg2 + 1][arg4 - 1] * 2 + 6 & 0x7;
                        int var25 = class448.method2527(arg0, -32440, var22);
                        if (class743.field10363[var23][var24]) {
                            class445.field5926[2] = var22.field1342;
                            class436.field5811[2] = var25;
                            class365.field4705[2] = var22.field1360;
                            class129.field1836[2] = var22.field1339;
                            class523.field7322[2] = var22.field1361;
                            class712.field9875[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg4 < arg8 - 1) {
            if (arg2 > 0) {
                int var26 = arg5[arg2 - 1][arg4 + 1] & 0xFF;
                if (var26 > 0) {
                    class97 var27 = this.field5221.method1028(arg3 ^ 0xFFFFEB7D, var26 - 1);
                    if (var27.field1342 != -1 && var27.field1341) {
                        byte var28 = arg10[arg2 - 1][arg4 + 1];
                        int var29 = (arg12[arg2 - 1][arg4 + 1] * 2) + 2 & 0x7;
                        int var30 = class448.method2527(arg0, -32440, var27);
                        if (class743.field10363[var28][var29]) {
                            class445.field5926[6] = var27.field1342;
                            class436.field5811[6] = var30;
                            class365.field4705[6] = var27.field1360;
                            class129.field1836[6] = var27.field1339;
                            class523.field7322[6] = var27.field1361;
                            class712.field9875[6] = 64;
                        }
                    }
                }
            }
            if ((arg7 - 1) > arg2) {
                int var31 = arg5[arg2 + 1][arg4 + 1] & 0xFF;
                if (var31 > 0) {
                    class97 var32 = this.field5221.method1028(-5249, var31 - 1);
                    if (var32.field1342 != -1 && var32.field1341) {
                        byte var33 = arg10[arg2 + 1][arg4 + 1];
                        int var34 = -(-(arg12[arg2 + 1][arg4 + 1] * 2)) & 0x7;
                        int var35 = class448.method2527(arg0, -32440, var32);
                        if (class743.field10363[var33][var34]) {
                            class445.field5926[4] = var32.field1342;
                            class436.field5811[4] = var35;
                            class365.field4705[4] = var32.field1360;
                            class129.field1836[4] = var32.field1339;
                            class523.field7322[4] = var32.field1361;
                            class712.field9875[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg4 > 0) {
            int var36 = arg5[arg2][arg4 - 1] & 0xFF;
            if (var36 > 0) {
                class97 var37 = this.field5221.method1028(arg3 ^ 0xFFFFEB7D, var36 - 1);
                if (var37.field1342 != -1) {
                    byte var38 = arg10[arg2][arg4 - 1];
                    byte var39 = arg12[arg2][arg4 - 1];
                    if (var37.field1341) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class448.method2527(arg0, -32440, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class743.field10363[var38][var41] && var37.field1361 >= class523.field7322[var40]) {
                                class445.field5926[var40] = var37.field1342;
                                class436.field5811[var40] = var42;
                                class365.field4705[var40] = var37.field1360;
                                class129.field1836[var40] = var37.field1339;
                                if (class523.field7322[var40] == var37.field1361) {
                                    class712.field9875[var40] = class683.method3840(class712.field9875[var40], 32);
                                } else {
                                    class712.field9875[var40] = 32;
                                }
                                class523.field7322[var40] = var37.field1361;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg1 & 0x3]) {
                            arg6[0] = class601.field8360[var38][class702.method3949(3, var39 + 2)];
                        }
                    } else if (!var15[-(-arg1) & 0x3]) {
                        arg6[0] = class524.field7325[var38][class702.method3949(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg4 < (arg8 - 1)) {
            int var44 = arg5[arg2][arg4 + 1] & 0xFF;
            if (var44 > 0) {
                class97 var45 = this.field5221.method1028(arg3 ^ 0xFFFFEB7D, var44 - 1);
                if (var45.field1342 != -1) {
                    byte var46 = arg10[arg2][arg4 + 1];
                    byte var47 = arg12[arg2][arg4 + 1];
                    if (var45.field1341) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class448.method2527(arg0, arg3 ^ 0xFFFF814A, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class743.field10363[var46][var49] && class523.field7322[var48] <= var45.field1361) {
                                class445.field5926[var48] = var45.field1342;
                                class436.field5811[var48] = var50;
                                class365.field4705[var48] = var45.field1360;
                                class129.field1836[var48] = var45.field1339;
                                if (class523.field7322[var48] == var45.field1361) {
                                    class712.field9875[var48] = class683.method3840(class712.field9875[var48], 16);
                                } else {
                                    class712.field9875[var48] = 16;
                                }
                                class523.field7322[var48] = var45.field1361;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg1 + 2 & 0x3]) {
                            arg6[2] = class601.field8360[var46][class702.method3949(var47, 3)];
                        }
                    } else if (!var15[arg1 + 2 & 0x3]) {
                        arg6[2] = class524.field7325[var46][class702.method3949(3, var47)];
                    }
                }
            }
        }
        if (arg2 > 0) {
            int var52 = arg5[arg2 - 1][arg4] & 0xFF;
            if (var52 > 0) {
                class97 var53 = this.field5221.method1028(-5249, var52 - 1);
                if (var53.field1342 != -1) {
                    byte var54 = arg10[arg2 - 1][arg4];
                    byte var55 = arg12[arg2 - 1][arg4];
                    if (var53.field1341) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class448.method2527(arg0, -32440, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class743.field10363[var54][var57] && var53.field1361 >= class523.field7322[var56]) {
                                class445.field5926[var56] = var53.field1342;
                                class436.field5811[var56] = var58;
                                class365.field4705[var56] = var53.field1360;
                                class129.field1836[var56] = var53.field1339;
                                if (class523.field7322[var56] == var53.field1361) {
                                    class712.field9875[var56] = class683.method3840(class712.field9875[var56], 8);
                                } else {
                                    class712.field9875[var56] = 8;
                                }
                                class523.field7322[var56] = var53.field1361;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg1 + 3 & 0x3]) {
                            arg6[3] = class601.field8360[var54][class702.method3949(3, var55 + 1)];
                        }
                    } else if (!var15[arg1 + 3 & 0x3]) {
                        arg6[3] = class524.field7325[var54][class702.method3949(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg7 - 1 > arg2) {
            int var60 = arg5[arg2 + 1][arg4] & 0xFF;
            if (var60 > 0) {
                class97 var61 = this.field5221.method1028(-5249, var60 - 1);
                if (var61.field1342 != -1) {
                    byte var62 = arg10[arg2 + 1][arg4];
                    byte var63 = arg12[arg2 + 1][arg4];
                    if (var61.field1341) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class448.method2527(arg0, arg3 ^ 0xFFFF814A, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class743.field10363[var62][var65] && class523.field7322[var64] <= var61.field1361) {
                                class445.field5926[var64] = var61.field1342;
                                class436.field5811[var64] = var66;
                                class365.field4705[var64] = var61.field1360;
                                class129.field1836[var64] = var61.field1339;
                                if (class523.field7322[var64] == var61.field1361) {
                                    class712.field9875[var64] = class683.method3840(class712.field9875[var64], 4);
                                } else {
                                    class712.field9875[var64] = 4;
                                }
                                class523.field7322[var64] = var61.field1361;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg1 + 1 & 0x3]) {
                            arg6[1] = class601.field8360[var62][class702.method3949(3, var63 + 3)];
                        }
                    } else if (!var15[arg1 + 1 & 0x3]) {
                        arg6[1] = class524.field7325[var62][class702.method3949(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg13 == null) {
            return;
        }
        int var68 = class448.method2527(arg0, -32440, arg13);
        if (!arg13.field1341) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg1 * 2 & 0x7;
            if (class743.field10363[arg9][var69] && arg13.field1361 >= class523.field7322[var70]) {
                class445.field5926[var70] = arg13.field1342;
                class436.field5811[var70] = var68;
                class365.field4705[var70] = arg13.field1360;
                class129.field1836[var70] = arg13.field1339;
                if (class523.field7322[var70] == arg13.field1361) {
                    class712.field9875[var70] = class683.method3840(class712.field9875[var70], 2);
                } else {
                    class712.field9875[var70] = 2;
                }
                class523.field7322[var70] = arg13.field1361;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lha;BLs;Ls;)V", line = 463)
    public final void method2290(class60 arg0, byte arg1, class282 arg2, class282 arg3) {
        field5226++;
        if (class29.field520 == null || class29.field520.length != this.field5214) {
            class514.field7218 = new int[this.field5214];
            class474.field6386 = new int[this.field5214];
            class29.field520 = new int[this.field5214];
            class607.field8430 = new int[this.field5214];
            class686.field9562 = new int[this.field5214];
        }
        int var5 = -98 % ((60 - arg1) / 32);
        int[][] var6 = new int[this.field5203][this.field5214];
        for (int var7 = 0; var7 < this.field5208; var7++) {
            for (int var9 = 0; var9 < this.field5214; var9++) {
                class29.field520[var9] = 0;
                class607.field8430[var9] = 0;
                class514.field7218[var9] = 0;
                class686.field9562[var9] = 0;
                class474.field6386[var9] = 0;
            }
            for (int var10 = -5; var10 < this.field5203; var10++) {
                for (int var11 = 0; var11 < this.field5214; var11++) {
                    int var20 = var10 + 5;
                    int var10002;
                    if (var20 < this.field5203) {
                        int var21 = this.field5223[var7][var20][var11] & 0xFF;
                        if (var21 > 0) {
                            class290 var22 = this.field5225.method4099(var21 - 1, 1);
                            class29.field520[var11] += var22.field3807;
                            class607.field8430[var11] += var22.field3805;
                            class514.field7218[var11] += var22.field3803;
                            class686.field9562[var11] += var22.field3797;
                            var10002 = class474.field6386[var11]++;
                        }
                    }
                    int var23 = var10 - 5;
                    if (var23 >= 0) {
                        int var24 = this.field5223[var7][var23][var11] & 0xFF;
                        if (var24 > 0) {
                            class290 var25 = this.field5225.method4099(var24 - 1, 1);
                            class29.field520[var11] -= var25.field3807;
                            class607.field8430[var11] -= var25.field3805;
                            class514.field7218[var11] -= var25.field3803;
                            class686.field9562[var11] -= var25.field3797;
                            var10002 = class474.field6386[var11]--;
                        }
                    }
                }
                if (var10 >= 0) {
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = -5; var17 < this.field5214; var17++) {
                        int var18 = var17 + 5;
                        if (this.field5214 > var18) {
                            var14 += class514.field7218[var18];
                            var16 += class474.field6386[var18];
                            var15 += class686.field9562[var18];
                            var12 += class29.field520[var18];
                            var13 += class607.field8430[var18];
                        }
                        int var19 = var17 - 5;
                        if (var19 >= 0) {
                            var14 -= class514.field7218[var19];
                            var16 -= class474.field6386[var19];
                            var12 -= class29.field520[var19];
                            var15 -= class686.field9562[var19];
                            var13 -= class607.field8430[var19];
                        }
                        if (var17 >= 0 && var15 > 0 && var16 > 0) {
                            var6[var10][var17] = class227.method1453(var13 / var16, 0, var12 * 256 / var15, var14 / var16);
                        }
                    }
                }
            }
            if (class16.field324) {
                this.method2292(var7, var7 == 0 ? arg3 : null, (byte) -122, var6, class195.field2669[var7], var7 == 0 ? arg2 : null, arg0);
            } else {
                this.method2293(var7 == 0 ? arg2 : null, arg0, 0, var6, class195.field2669[var7], var7 == 0 ? arg3 : null, var7);
            }
            this.field5223[var7] = null;
            this.field5218[var7] = null;
            this.field5207[var7] = null;
            this.field5205[var7] = null;
        }
        if (!this.field5215) {
            if (class753.field10508 != 0) {
                class256.method1559();
            }
            if (class546.field7614) {
                class277.method1637();
            }
        }
        for (int var8 = 0; var8 < this.field5208; var8++) {
            class195.field2669[var8].method1673();
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BII)Z", line = 644)
    public static final boolean method2291(byte arg0, int arg1, int arg2) {
        if (arg0 == 53) {
            field5211++;
            return (arg2 & 0x70000) != 0 | class216.method1407(20308, arg2, arg1) || class92.method736(-110, arg2, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILs;B[[ILs;Ls;Lha;)V", line = 655)
    private final void method2292(int arg0, class282 arg1, byte arg2, int[][] arg3, class282 arg4, class282 arg5, class60 arg6) {
        field5222++;
        byte[][] var8 = this.field5207[arg0];
        byte[][] var9 = this.field5205[arg0];
        byte[][] var10 = this.field5223[arg0];
        byte[][] var11 = this.field5218[arg0];
        if (arg2 > -16) {
            this.method2301(-74, -40, null);
        }
        for (int var12 = 0; var12 < this.field5203; var12++) {
            int var13 = this.field5203 - 1 <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field5214; var14++) {
                int var15 = var14 < (this.field5214 - 1) ? var14 + 1 : var14;
                if (class526.field7349 == -1 || class520.method3024(arg0, var12, var14, class526.field7349, -29920)) {
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
                        class97 var26 = var21 == 0 ? null : this.field5221.method1028(-5249, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class290 var27 = var22 == 0 ? null : this.field5225.method4099(var22 - 1, 1);
                        class97 var28 = var26;
                        if (var26 != null) {
                            if (var26.field1342 == -1 && var26.field1346 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field1341;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field5203 && this.field5214 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            byte var35 = 0;
                            int var36 = var35 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var32++;
                            } else {
                                var34--;
                                var32--;
                            }
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var33--;
                                var34--;
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
                                var32--;
                                var36--;
                            }
                            int var37 = var32 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg4.method1677(var14, (byte) 112, var12) - arg4.method1677(var15, (byte) 105, var13);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg4.method1677(var14, (byte) 50, var13) - arg4.method1677(var15, (byte) 112, var12);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class523.field7322[var39] = -1;
                            class712.field9875[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field1341 ? class601.field8360[var19] : class524.field7325[var19];
                        this.method2289(arg6, var20, var12, 2, var14, var11, var18, this.field5203, this.field5214, var19, var8, var27, var9, var26);
                        boolean var41 = var26 != null && var26.field1346 != var26.field1342;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class523.field7322[var42] >= 0 && class445.field5926[var42] != class436.field5811[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class176.method1205(var18[1], class702.method3949(class712.field9875[2], class712.field9875[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class176.method1205(var18[3], class702.method3949(class712.field9875[0], class712.field9875[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class176.method1205(var18[0], class702.method3949(class712.field9875[2], class712.field9875[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class176.method1205(var18[2], class702.method3949(class712.field9875[6], class712.field9875[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var20 = 0;
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
                        int var46;
                        int[] var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var45 = var26 == null ? 0 : class475.field6393[var19];
                            var48 = class517.field7245[var19];
                            var49 = class726.field10125[var19];
                            var46 = var27 == null ? 0 : class356.field4582[var19];
                            var47 = class259.field3279[var19];
                        } else if (var17) {
                            var47 = class69.field975[var19];
                            var46 = var27 == null ? 0 : class416.field5305[var19];
                            var49 = class514.field7220[var19];
                            var48 = class588.field8232[var19];
                            var44 = class254.field3247[var19];
                            var45 = var26 == null ? 0 : class694.field9652[var19];
                        } else {
                            var45 = var26 == null ? 0 : class615.field8486[var19];
                            var46 = var27 == null ? 0 : class257.field3265[var19];
                            var47 = class15.field306[var19];
                            var48 = class588.field8239[var19];
                            var44 = class677.field9456[var19];
                            var49 = class695.field9656[var19];
                        }
                        int var50 = var45 + var46;
                        if (var50 <= 0) {
                            class438.method2492(arg0, var12, var14);
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
                            int[] var61 = arg1 == null && arg5 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var64 = var26.field1339;
                                var63 = var26.field1360;
                                var62 = var26.field1342;
                                int var65 = class448.method2527(arg6, -32440, var26);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class126.field1805[0] = var47[var51];
                                        class126.field1805[1] = 1;
                                        class126.field1805[2] = var48[var51];
                                        class126.field1805[3] = 1;
                                        class126.field1805[4] = var49[var51];
                                        class126.field1805[5] = var48[var51];
                                        var99 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class126.field1805[0] = var47[var51];
                                        class126.field1805[1] = 5;
                                        class126.field1805[2] = var48[var51];
                                        class126.field1805[3] = 5;
                                        class126.field1805[4] = var49[var51];
                                        var99 = 6;
                                        class126.field1805[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class126.field1805[0] = var47[var51];
                                        class126.field1805[1] = 3;
                                        class126.field1805[2] = var48[var51];
                                        class126.field1805[3] = 3;
                                        class126.field1805[4] = var49[var51];
                                        class126.field1805[5] = var48[var51];
                                        var99 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class126.field1805[0] = var47[var51];
                                        class126.field1805[1] = 7;
                                        class126.field1805[2] = var48[var51];
                                        class126.field1805[3] = 7;
                                        class126.field1805[4] = var49[var51];
                                        var99 = 6;
                                        class126.field1805[5] = var48[var51];
                                    } else {
                                        class126.field1805[0] = var47[var51];
                                        class126.field1805[1] = var49[var51];
                                        class126.field1805[2] = var48[var51];
                                        var99 = 3;
                                    }
                                    var51++;
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class126.field1805[var100];
                                        int var102 = var101 - (var20 * 2) & 0x7;
                                        int var103 = this.field5212[var101];
                                        int var104 = this.field5210[var101];
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
                                            var105 = var103;
                                            var106 = var104;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var106;
                                        if (var60 != null && class743.field10363[var19][var101]) {
                                            int var107 = (var12 << 9) + var105;
                                            int var108 = (var14 << 9) + var106;
                                            var60[var52] = arg1.method1676(var107, true, var108) - arg4.method1676(var107, true, var108);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class743.field10363[var19][var101]) {
                                                int var109 = (var12 << 9) + var105;
                                                int var110 = (var14 << 9) + var106;
                                                var61[var52] = arg4.method1676(var109, true, var110) - arg1.method1676(var109, true, var110);
                                            } else if (arg5 != null && !class645.field8930[var19][var101]) {
                                                int var111 = (var12 << 9) + var105;
                                                int var112 = (var14 << 9) + var106;
                                                var61[var52] = arg5.method1676(var111, true, var112) - arg4.method1676(var111, true, var112);
                                            }
                                        }
                                        if (var101 < 8 && var26.field1361 < class523.field7322[var102]) {
                                            if (var54 != null) {
                                                var54[var52] = class436.field5811[var102];
                                            }
                                            var59[var52] = class129.field1836[var102];
                                            var58[var52] = class365.field4705[var102];
                                            var57[var52] = class445.field5926[var102];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field1360;
                                            var59[var52] = var26.field1339;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field5215 && arg0 == 0) {
                                    class247.method1530(var12, var14, var26.field1352, var26.field1349 * 8, var26.field1355);
                                }
                                if (var19 != 12 && var26.field1342 != -1 && var26.field1343) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class475.field6393[var19];
                            } else if (var17) {
                                var51 += class694.field9652[var19];
                            } else {
                                var51 += class615.field8486[var19];
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
                                class290 var67 = this.field5225.method4099(var22 - 1, 1);
                                class290 var68 = this.field5225.method4099(var23 - 1, 1);
                                class290 var69 = this.field5225.method4099(var24 - 1, 1);
                                class290 var70 = this.field5225.method4099(var25 - 1, 1);
                                for (int var71 = 0; var71 < var46; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class126.field1805[0] = var47[var51];
                                        class126.field1805[1] = 1;
                                        class126.field1805[2] = var48[var51];
                                        class126.field1805[3] = 1;
                                        class126.field1805[4] = var49[var51];
                                        class126.field1805[5] = var48[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class126.field1805[0] = var47[var51];
                                        class126.field1805[1] = 5;
                                        class126.field1805[2] = var48[var51];
                                        class126.field1805[3] = 5;
                                        class126.field1805[4] = var49[var51];
                                        var73 = 6;
                                        class126.field1805[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class126.field1805[0] = var47[var51];
                                        class126.field1805[1] = 3;
                                        class126.field1805[2] = var48[var51];
                                        class126.field1805[3] = 3;
                                        class126.field1805[4] = var49[var51];
                                        var73 = 6;
                                        class126.field1805[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class126.field1805[0] = var47[var51];
                                        class126.field1805[1] = 7;
                                        class126.field1805[2] = var48[var51];
                                        class126.field1805[3] = 7;
                                        class126.field1805[4] = var49[var51];
                                        class126.field1805[5] = var48[var51];
                                        var73 = 6;
                                    } else {
                                        class126.field1805[0] = var47[var51];
                                        class126.field1805[1] = var49[var51];
                                        class126.field1805[2] = var48[var51];
                                        var73 = 3;
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class126.field1805[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field5212[var75];
                                        int var78 = this.field5210[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 512 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var79 = 512 - var78;
                                            var80 = 512 - var77;
                                        } else if (var20 == 3) {
                                            var80 = 512 - var78;
                                            var79 = var77;
                                        } else {
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class743.field10363[var19][var75]) {
                                            int var81 = (var12 << 9) + var80;
                                            int var82 = (var14 << 9) + var79;
                                            var60[var52] = arg1.method1676(var81, true, var82) - arg4.method1676(var81, true, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class743.field10363[var19][var75]) {
                                                int var83 = (var12 << 9) + var80;
                                                int var84 = (var14 << 9) + var79;
                                                var61[var52] = arg4.method1676(var83, true, var84) - arg1.method1676(var83, true, var84);
                                            } else if (arg5 != null && !class645.field8930[var19][var75]) {
                                                int var85 = (var12 << 9) + var80;
                                                int var86 = (var14 << 9) + var79;
                                                var61[var52] = arg5.method1676(var85, true, var86) - arg4.method1676(var85, true, var86);
                                            }
                                        }
                                        if (var75 < 8 && class523.field7322[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class436.field5811[var76];
                                            }
                                            var59[var52] = class129.field1836[var76];
                                            var58[var52] = class365.field4705[var76];
                                            var57[var52] = class445.field5926[var76];
                                        } else {
                                            if (var17 && class743.field10363[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg3[var12][var14];
                                                var58[var52] = var67.field3799;
                                                var59[var52] = var67.field3798;
                                            } else if (var80 == 0 && var79 == 512) {
                                                var57[var52] = arg3[var12][var15];
                                                var58[var52] = var68.field3799;
                                                var59[var52] = var68.field3798;
                                            } else if (var80 == 512 && var79 == 512) {
                                                var57[var52] = arg3[var13][var15];
                                                var58[var52] = var69.field3799;
                                                var59[var52] = var69.field3798;
                                            } else if (var80 == 512 && var79 == 0) {
                                                var57[var52] = arg3[var13][var14];
                                                var58[var52] = var70.field3799;
                                                var59[var52] = var70.field3798;
                                            } else {
                                                if (var80 < 256) {
                                                    if (var79 >= 256) {
                                                        var58[var52] = var68.field3799;
                                                        var59[var52] = var68.field3798;
                                                    } else {
                                                        var58[var52] = var67.field3799;
                                                        var59[var52] = var67.field3798;
                                                    }
                                                } else if (var79 >= 256) {
                                                    var58[var52] = var69.field3799;
                                                    var59[var52] = var69.field3798;
                                                } else {
                                                    var58[var52] = var70.field3799;
                                                    var59[var52] = var70.field3798;
                                                }
                                                int var87 = class475.method2718(arg3[var13][var14], arg3[var12][var14], var80 << 7 >> 9, (byte) 127);
                                                int var88 = class475.method2718(arg3[var13][var15], arg3[var12][var15], var80 << 7 >> 9, (byte) 123);
                                                var57[var52] = class475.method2718(var88, var87, var79 << 7 >> 9, (byte) 100);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field3796) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg4.method1677(var14, (byte) 5, var12);
                            int var90 = arg4.method1677(var14, (byte) 21, var13);
                            int var91 = arg4.method1677(var15, (byte) 50, var13);
                            int var92 = arg4.method1677(var15, (byte) 66, var12);
                            boolean var93 = class99.method797(var14, 1, var12);
                            if (var93 && arg0 > 1 || !var93 && arg0 > 0) {
                                boolean var94 = true;
                                if (var27 != null && !var27.field3800) {
                                    var94 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var94 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field1359) {
                                    var94 = false;
                                }
                                if (var94 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field5216[arg0][var12][var14] = (byte) class683.method3840(this.field5216[arg0][var12][var14], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field5215) {
                                var95 = class317.method1871(var12, var14);
                                var96 = class170.method1183(var12, var14);
                                var97 = class203.method1315(var12, var14);
                            }
                            arg4.method1674(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var95, var96, var97, var16);
                            class438.method2492(arg0, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ls;Lha;I[[ILs;Ls;I)V", line = 1526)
    private final void method2293(class282 arg0, class60 arg1, int arg2, int[][] arg3, class282 arg4, class282 arg5, int arg6) {
        field5213++;
        for (int var8 = arg2; var8 < this.field5203; var8++) {
            for (int var9 = 0; var9 < this.field5214; var9++) {
                if (class526.field7349 == -1 || class520.method3024(arg6, var8, var9, class526.field7349, arg2 ^ 0xFFFF8B20)) {
                    byte var10 = this.field5207[arg6][var8][var9];
                    byte var11 = this.field5205[arg6][var8][var9];
                    int var12 = this.field5218[arg6][var8][var9] & 0xFF;
                    int var13 = this.field5223[arg6][var8][var9] & 0xFF;
                    class97 var14 = var12 == 0 ? null : this.field5221.method1028(-5249, var12 - 1);
                    class290 var15 = var13 == 0 ? null : this.field5225.method4099(var13 - 1, 1);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class97 var16 = var14;
                    if (var14 != null && var14.field1342 == -1 && var14.field1346 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class356.field4582[var10];
                        int var18 = class475.field6393[var10];
                        int var19 = (var15 == null ? 0 : var17) + (var14 == null ? 0 : var18);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field1360;
                        int var23 = var15 == null ? -1 : var15.field3799;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field1346 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class259.field3279[var10][var21];
                                var25[var20] = class726.field10125[var10][var21];
                                var26[var20] = class517.field7245[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field1339;
                                var27[var20] = var14.field1342;
                                if (var30 != null) {
                                    var30[var20] = var14.field1346;
                                }
                                var21++;
                                var20++;
                            }
                            if (!this.field5215 && arg6 == 0) {
                                class247.method1530(var8, var9, var14.field1352, var14.field1349 * 8, var14.field1355);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class259.field3279[var10][var21];
                                var25[var20] = class726.field10125[var10][var21];
                                var26[var20] = class517.field7245[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field3798;
                                var27[var20] = arg3[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var20++;
                                var21++;
                            }
                        }
                        int var33 = this.field5212.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg5 == null ? null : new int[var33];
                        int[] var37 = arg5 == null && arg0 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field5212[var38];
                            int var49 = this.field5210[var38];
                            if (var11 == 0) {
                                var34[var38] = var48;
                                var35[var38] = var49;
                            } else if (var11 == 1) {
                                var34[var38] = var49;
                                var35[var38] = 512 - var48;
                            } else if (var11 == 2) {
                                var34[var38] = 512 - var48;
                                var35[var38] = 512 - var49;
                            } else if (var11 == 3) {
                                var34[var38] = 512 - var49;
                                var35[var38] = var48;
                            }
                            if (var36 != null && class743.field10363[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg5.method1676(var52, true, var53) - arg4.method1676(var52, true, var53);
                            }
                            if (var37 != null) {
                                if (arg5 != null && !class743.field10363[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg4.method1676(var54, true, var55) - arg5.method1676(var54, true, var55);
                                } else if (arg0 != null && !class645.field8930[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg0.method1676(var56, true, var57) - arg4.method1676(var56, true, var57);
                                }
                            }
                        }
                        int var39 = arg4.method1677(var9, (byte) 17, var8);
                        int var40 = arg4.method1677(var9, (byte) 121, var8 + 1);
                        int var41 = arg4.method1677(var9 + 1, (byte) 101, var8 + 1);
                        int var42 = arg4.method1677(var9 + 1, (byte) 64, var8);
                        boolean var43 = class99.method797(var9, 1, var8);
                        if (var43 && arg6 > 1 || !var43 && arg6 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field3800) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field1359) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field5216[arg6][var8][var9] = (byte) class683.method3840(this.field5216[arg6][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field5215) {
                            var45 = class317.method1871(var8, var9);
                            var46 = class170.method1183(var8, var9);
                            var47 = class203.method1315(var8, var9);
                        }
                        arg4.method1671(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class438.method2492(arg6, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILha;[Lje;[[[I)V", line = 1808)
    public final void method2294(int arg0, class60 arg1, class405[] arg2, int[][][] arg3) {
        if (!this.field5215) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field5203; var6++) {
                    for (int var7 = 0; var7 < this.field5214; var7++) {
                        if ((class305.field4001[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class305.field4001[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method2261(var6, var7, 1);
                            }
                        }
                    }
                }
            }
        }
        field5202++;
        for (int var9 = 0; var9 < this.field5208; var9++) {
            int var11 = 0;
            int var12 = 0;
            if (!this.field5215) {
                if (class546.field7614) {
                    var11 |= 0x2;
                }
                if (class719.field10018) {
                    var12 |= 0x8;
                }
                if (class753.field10508 != 0) {
                    if (var9 == 0 | class701.field9751) {
                        var12 |= 0x10;
                    }
                    var11 |= 0x1;
                }
            }
            if (class546.field7614) {
                var12 |= 0x7;
            }
            if (!class170.field2362) {
                var12 |= 0x20;
            }
            int[][] var13 = arg3 == null || arg3.length <= var9 ? this.field5224[var9] : arg3[var9];
            class516.method3002(var9, arg1.method539(this.field5203, this.field5214, this.field5224[var9], var13, 512, var11, var12));
        }
        int var10 = 82 / ((arg0 + 80) / 45);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII[Lje;IILsl;II)V", line = 1907)
    public final void method2295(int arg0, int arg1, int arg2, int arg3, class405[] arg4, int arg5, int arg6, class461 arg7, int arg8, int arg9) {
        field5220++;
        int var11 = (arg2 & 0x7) * 8;
        int var12 = (arg9 & 0x7) * 8;
        if (!this.field5215) {
            class405 var13 = arg4[arg8];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class661.method3719(var15 & 0x7, (byte) -75, var14 & 0x7, arg0) + arg5;
                    int var17 = class597.method3391(99, var14 & 0x7, arg0, var15 & 0x7) + arg6;
                    if (var16 > 0 && (this.field5203 - 1) > var16 && var17 > 0 && this.field5214 - 1 > var17) {
                        var13.method2267((byte) 104, var17, var16);
                    }
                }
            }
        }
        int var18 = (arg2 & 0xFFFFFFF8) << 3;
        int var19 = (arg9 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        if (arg1 != -1) {
            return;
        }
        byte var21 = 0;
        if (arg0 == 1) {
            var21 = 1;
        } else if (arg0 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg0 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field5208; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg3 == var22 && var23 >= var11 && (var11 + 8) >= var23 && var24 >= var12 && (var12 + 8) >= var24) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || var12 + 8 == var24) {
                            if (arg0 == 0) {
                                var25 = var23 + arg5 - var11;
                                var26 = var24 - (var12 - arg6);
                            } else if (arg0 == 1) {
                                var25 = var24 - (var12 - arg5);
                                var26 = var11 + arg6 + 8 - var23;
                            } else if (arg0 == 2) {
                                var25 = var11 + arg5 + 8 - var23;
                                var26 = -var24 - (-var12 - (arg6 + 8));
                            } else {
                                var25 = arg5 + var12 + 8 - var24;
                                var26 = arg6 + var23 - var11;
                            }
                            this.method2298(arg8, var19 + var24, 0, var25, 0, (byte) 114, 0, arg7, var18 + var23, true, var26);
                        } else {
                            var25 = arg5 + class661.method3719(var24 & 0x7, (byte) -98, var23 & 0x7, arg0);
                            var26 = class597.method3391(124, var23 & 0x7, arg0, var24 & 0x7) + arg6;
                            this.method2298(arg8, var19 + var24, var20, var25, arg0, (byte) 88, var21, arg7, var18 + var23, false, var26);
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
                                if (arg0 == 0) {
                                    var31 = var29 + arg5 - var11;
                                    var32 = arg6 + var30 - var12;
                                } else if (arg0 == 1) {
                                    var31 = var30 + arg5 - var12;
                                    var32 = arg6 + 8 - (-var11 + var29);
                                } else if (arg0 == 2) {
                                    var31 = var11 + arg5 + 8 - var29;
                                    var32 = arg6 + 8 - (var30 - var12);
                                } else {
                                    var31 = arg5 + 8 - (-var12 + var30);
                                    var32 = var29 + arg6 - var11;
                                }
                                if (var31 >= 0 && var31 < this.field5203 && var32 >= 0 && var32 < this.field5214) {
                                    this.field5224[arg8][var31][var32] = this.field5224[arg8][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method2298(0, 0, 0, -1, 0, (byte) 55, 0, arg7, 0, false, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIBI)Z", line = 2108)
    public static final boolean method2296(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field5209++;
        if (!client.field3984 || !class15.field304) {
            return false;
        } else if (class700.field9738 < 100) {
            return false;
        } else if (class571.method3277(arg1, arg2, 1, arg0)) {
            int var5 = arg2 << class480.field6531;
            int var6 = arg0 << class480.field6531;
            if (arg3 < 89) {
                method2291((byte) -89, -47, 92);
            }
            if (class25.method170(-120, class195.field2669[arg1].method1677(arg0, (byte) 17, arg2), var6, var5, class699.field9729, arg4, class699.field9729)) {
                class61.field861++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V", line = 2142)
    public final void method2297(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5219++;
        if (arg2 < -17) {
            for (int var6 = 0; var6 < this.field5208; var6++) {
                this.method2299(arg0, arg1, arg3, arg4, (byte) 63, var6);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIBILsl;IZI)V", line = 2162)
    private final void method2298(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class461 arg7, int arg8, boolean arg9, int arg10) {
        if (arg5 < 53) {
            this.method2294(-42, null, null, null);
        }
        field5206++;
        if (arg4 == 1) {
            arg6 = 1;
        } else if (arg4 == 2) {
            arg6 = 1;
            arg2 = 1;
        } else if (arg4 == 3) {
            arg2 = 1;
        }
        if (arg3 < 0 || this.field5203 <= arg3 || arg10 < 0 || arg10 >= this.field5214) {
            while (true) {
                int var14 = arg7.method2600((byte) -126);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg7.method2600((byte) -125);
                    return;
                }
                if (var14 <= 49) {
                    arg7.method2600((byte) -127);
                }
            }
        }
        if (!this.field5215 && !arg9) {
            class305.field4001[arg0][arg3][arg10] = 0;
        }
        while (true) {
            int var12 = arg7.method2600((byte) -126);
            if (var12 == 0) {
                if (this.field5215) {
                    this.field5224[0][arg2 + arg3][arg6 + arg10] = 0;
                    return;
                } else if (arg0 == 0) {
                    this.field5224[0][arg3 + arg2][arg6 + arg10] = -class540.method3098(-11, arg8 + 932731, arg1 + 556238) * 8 << 2;
                    return;
                } else {
                    this.field5224[arg0][arg2 + arg3][arg10 + arg6] = this.field5224[arg0 - 1][arg2 + arg3][arg6 + arg10] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg7.method2600((byte) -127);
                if (!this.field5215) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg0 != 0) {
                        this.field5224[arg0][arg2 + arg3][arg6 + arg10] = this.field5224[arg0 - 1][arg2 + arg3][arg6 + arg10] - (var13 * 8 << 2);
                        return;
                    }
                    this.field5224[0][arg2 + arg3][arg6 + arg10] = -var13 * 8 << 2;
                    return;
                }
                this.field5224[0][arg3 + arg2][arg10 + arg6] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg9) {
                    arg7.method2600((byte) -125);
                } else {
                    this.field5218[arg0][arg3][arg10] = arg7.method2601(0);
                    this.field5207[arg0][arg3][arg10] = (byte) ((var12 - 2) / 4);
                    this.field5205[arg0][arg3][arg10] = (byte) class702.method3949(3, arg4 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field5215 && !arg9) {
                    class305.field4001[arg0][arg3][arg10] = (byte) (var12 - 49);
                }
            } else if (!arg9) {
                this.field5223[arg0][arg3][arg10] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIBI)V", line = 2287)
    public final void method2299(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        for (int var7 = arg3; var7 < arg3 + arg2; var7++) {
            for (int var10 = arg0; var10 < arg0 + arg1; var10++) {
                if (var10 >= 0 && this.field5203 > var10 && var7 >= 0 && var7 < this.field5214) {
                    this.field5224[arg5][var10][var7] = arg5 <= 0 ? 0 : this.field5224[arg5 - 1][var10][var7] - 960;
                }
            }
        }
        if (arg4 != 63) {
            return;
        }
        field5199++;
        if (arg0 > 0 && this.field5203 > arg0) {
            for (int var8 = arg3 + 1; var8 < arg3 + arg2; var8++) {
                if (var8 >= 0 && var8 < this.field5214) {
                    this.field5224[arg5][arg0][var8] = this.field5224[arg5][arg0 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && this.field5214 > arg3) {
            for (int var9 = arg0 + 1; var9 < arg0 + arg1; var9++) {
                if (var9 >= 0 && var9 < this.field5203) {
                    this.field5224[arg5][var9][arg3] = this.field5224[arg5][var9][arg3 - 1];
                }
            }
        }
        if (arg0 < 0 || arg3 < 0 || arg0 >= this.field5203 || arg3 >= this.field5214) {
            return;
        }
        if (arg5 != 0) {
            if (arg0 > 0 && this.field5224[arg5 - 1][arg0 - 1][arg3] != this.field5224[arg5][arg0 - 1][arg3]) {
                this.field5224[arg5][arg0][arg3] = this.field5224[arg5][arg0 - 1][arg3];
                return;
            }
            if (arg3 > 0 && this.field5224[arg5][arg0][arg3 - 1] != this.field5224[arg5 - 1][arg0][arg3 - 1]) {
                this.field5224[arg5][arg0][arg3] = this.field5224[arg5][arg0][arg3 - 1];
                return;
            }
            if (arg0 > 0 && arg3 > 0 && this.field5224[arg5 - 1][arg0 - 1][arg3 - 1] != this.field5224[arg5][arg0 - 1][arg3 - 1]) {
                this.field5224[arg5][arg0][arg3] = this.field5224[arg5][arg0 - 1][arg3 - 1];
                return;
            }
            return;
        }
        if (arg0 > 0 && this.field5224[arg5][arg0 - 1][arg3] != 0) {
            this.field5224[arg5][arg0][arg3] = this.field5224[arg5][arg0 - 1][arg3];
            return;
        }
        if (arg3 > 0 && this.field5224[arg5][arg0][arg3 - 1] != 0) {
            this.field5224[arg5][arg0][arg3] = this.field5224[arg5][arg0][arg3 - 1];
            return;
        }
        if (arg0 > 0 && arg3 > 0 && this.field5224[arg5][arg0 - 1][arg3 - 1] != 0) {
            this.field5224[arg5][arg0][arg3] = this.field5224[arg5][arg0 - 1][arg3 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIZLls;Lpg;)V", line = 2502)
    public class410(int arg0, int arg1, int arg2, boolean arg3, class142 arg4, class735 arg5) {
        this.field5203 = arg1;
        this.field5208 = arg0;
        this.field5225 = arg5;
        this.field5215 = arg3;
        this.field5214 = arg2;
        this.field5221 = arg4;
        this.field5218 = new byte[this.field5208][this.field5203][this.field5214];
        this.field5216 = new byte[this.field5208][this.field5203 + 1][this.field5214 + 1];
        this.field5223 = new byte[this.field5208][this.field5203][this.field5214];
        this.field5205 = new byte[this.field5208][this.field5203][this.field5214];
        this.field5224 = new int[this.field5208][this.field5203 + 1][this.field5214 + 1];
        this.field5207 = new byte[this.field5208][this.field5203][this.field5214];
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILsl;IIB[Lje;)V", line = 2388)
    public final void method2300(int arg0, int arg1, class461 arg2, int arg3, int arg4, byte arg5, class405[] arg6) {
        if (!this.field5215) {
            for (int var8 = 0; var8 < 4; var8++) {
                class405 var9 = arg6[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg3 + var10;
                        int var13 = arg4 + var11;
                        if (var12 >= 0 && var12 < this.field5203 && var13 >= 0 && this.field5214 > var13) {
                            var9.method2267((byte) 104, var13, var12);
                        }
                    }
                }
            }
        }
        field5201++;
        if (arg5 != 22) {
            return;
        }
        int var14 = arg1 + arg3;
        int var15 = arg0 + arg4;
        for (int var16 = 0; var16 < this.field5208; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2298(var16, var15 + var18, 0, var17 + arg3, 0, (byte) 109, 0, arg2, var14 + var17, false, var18 + arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II[[I)V", line = 2466)
    public final void method2301(int arg0, int arg1, int[][] arg2) {
        field5217++;
        int[][] var4 = this.field5224[arg1];
        if (arg0 <= 103) {
            this.method2294(-35, null, null, null);
        }
        for (int var5 = 0; var5 < (this.field5203 + 1); var5++) {
            for (int var6 = 0; var6 < this.field5214 + 1; var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }
}
