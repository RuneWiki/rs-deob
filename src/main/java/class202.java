import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class202 extends class34 {

    @OriginalMember(owner = "client!le", name = "db", descriptor = "[I")
    private int[] field3052 = new int[257];

    @OriginalMember(owner = "client!le", name = "R", descriptor = "[I")
    public static int[] field3040 = new int[128];

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
    public static int field3050 = -1;

    @OriginalMember(owner = "client!le", name = "eb", descriptor = "[I")
    public static int[] field3053 = new int[25];

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!le", name = "fb", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "Lpk;")
    public static class237 field3042;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "Lpk;")
    public static class237 field3047;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "[[I")
    private int[][] field3048;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(II)V")
    private final void method1340(int arg0, int arg1) {
        ++field3041;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3048 = new int[4][4];
                                this.field3048[0][1] = 0;
                                this.field3048[0][2] = 4096;
                                this.field3048[0][3] = 0;
                                this.field3048[0][0] = 2048;
                                this.field3048[1][2] = 4096;
                                this.field3048[1][0] = 2867;
                                this.field3048[2][0] = 3276;
                                this.field3048[3][0] = 4096;
                                this.field3048[1][3] = 0;
                                this.field3048[1][1] = 4096;
                                this.field3048[2][1] = 4096;
                                this.field3048[2][2] = 4096;
                                this.field3048[3][1] = 4096;
                                this.field3048[3][2] = 0;
                                this.field3048[2][3] = 0;
                                this.field3048[3][3] = 0;
                            } else {
                                this.field3048 = new int[16][4];
                                this.field3048[0][3] = 321;
                                this.field3048[0][0] = 0;
                                this.field3048[1][0] = 155;
                                this.field3048[0][2] = 192;
                                this.field3048[2][0] = 389;
                                this.field3048[1][2] = 449;
                                this.field3048[3][0] = 671;
                                this.field3048[2][2] = 690;
                                this.field3048[1][3] = 562;
                                this.field3048[3][2] = 995;
                                this.field3048[4][0] = 897;
                                this.field3048[5][0] = 1175;
                                this.field3048[2][3] = 803;
                                this.field3048[4][2] = 1397;
                                this.field3048[3][3] = 1140;
                                this.field3048[5][2] = 1429;
                                this.field3048[6][0] = 1368;
                                this.field3048[0][1] = 80;
                                this.field3048[4][3] = 1509;
                                this.field3048[5][3] = 1413;
                                this.field3048[6][3] = 1333;
                                this.field3048[1][1] = 321;
                                this.field3048[7][3] = 1702;
                                this.field3048[8][3] = 2056;
                                this.field3048[9][3] = 2666;
                                this.field3048[7][0] = 1507;
                                this.field3048[2][1] = 578;
                                this.field3048[8][0] = 1736;
                                this.field3048[3][1] = 947;
                                this.field3048[6][2] = 1461;
                                this.field3048[10][3] = 3276;
                                this.field3048[7][2] = 1525;
                                this.field3048[9][0] = 2088;
                                this.field3048[11][3] = 3228;
                                this.field3048[10][0] = 2355;
                                this.field3048[11][0] = 2691;
                                this.field3048[12][3] = 3196;
                                this.field3048[12][0] = 3031;
                                this.field3048[8][2] = 1590;
                                this.field3048[9][2] = 2056;
                                this.field3048[4][1] = 1285;
                                this.field3048[10][2] = 2586;
                                this.field3048[11][2] = 3148;
                                this.field3048[5][1] = 1525;
                                this.field3048[6][1] = 1734;
                                this.field3048[13][3] = 3019;
                                this.field3048[13][0] = 3522;
                                this.field3048[7][1] = 1413;
                                this.field3048[14][3] = 3228;
                                this.field3048[15][3] = 2746;
                                this.field3048[14][0] = 3727;
                                this.field3048[15][0] = 4096;
                                this.field3048[12][2] = 3710;
                                this.field3048[13][2] = 3421;
                                this.field3048[14][2] = 3148;
                                this.field3048[15][2] = 2505;
                                this.field3048[8][1] = 1108;
                                this.field3048[9][1] = 1766;
                                this.field3048[10][1] = 2409;
                                this.field3048[11][1] = 3116;
                                this.field3048[12][1] = 3806;
                                this.field3048[13][1] = 3437;
                                this.field3048[14][1] = 3116;
                                this.field3048[15][1] = 2377;
                            }
                        } else {
                            this.field3048 = new int[6][4];
                            this.field3048[0][0] = 0;
                            this.field3048[0][3] = 0;
                            this.field3048[1][0] = 1843;
                            this.field3048[0][2] = 0;
                            this.field3048[0][1] = 0;
                            this.field3048[1][1] = 0;
                            this.field3048[1][3] = 1493;
                            this.field3048[2][3] = 2939;
                            this.field3048[2][1] = 0;
                            this.field3048[2][0] = 2457;
                            this.field3048[3][0] = 2781;
                            this.field3048[1][2] = 0;
                            this.field3048[2][2] = 0;
                            this.field3048[3][2] = 1124;
                            this.field3048[3][1] = 0;
                            this.field3048[4][0] = 3481;
                            this.field3048[5][0] = 4096;
                            this.field3048[4][2] = 3084;
                            this.field3048[5][2] = 4096;
                            this.field3048[3][3] = 3565;
                            this.field3048[4][3] = 4031;
                            this.field3048[5][3] = 4096;
                            this.field3048[4][1] = 546;
                            this.field3048[5][1] = 4096;
                        }
                    } else {
                        this.field3048 = new int[7][4];
                        this.field3048[0][0] = 0;
                        this.field3048[0][2] = 0;
                        this.field3048[1][0] = 663;
                        this.field3048[2][0] = 1363;
                        this.field3048[0][1] = 0;
                        this.field3048[1][2] = 4096;
                        this.field3048[3][0] = 2048;
                        this.field3048[1][1] = 0;
                        this.field3048[2][1] = 0;
                        this.field3048[4][0] = 2727;
                        this.field3048[2][2] = 4096;
                        this.field3048[3][1] = 4096;
                        this.field3048[3][2] = 4096;
                        this.field3048[4][2] = 0;
                        this.field3048[5][2] = 0;
                        this.field3048[0][3] = 4096;
                        this.field3048[5][0] = 3411;
                        this.field3048[4][1] = 4096;
                        this.field3048[6][0] = 4096;
                        this.field3048[5][1] = 4096;
                        this.field3048[6][1] = 0;
                        this.field3048[6][2] = 0;
                        this.field3048[1][3] = 4096;
                        this.field3048[2][3] = 0;
                        this.field3048[3][3] = 0;
                        this.field3048[4][3] = 0;
                        this.field3048[5][3] = 4096;
                        this.field3048[6][3] = 4096;
                    }
                } else {
                    this.field3048 = new int[8][4];
                    this.field3048[0][0] = 0;
                    this.field3048[0][2] = 2602;
                    this.field3048[1][0] = 2867;
                    this.field3048[0][1] = 2650;
                    this.field3048[0][3] = 2361;
                    this.field3048[1][1] = 2313;
                    this.field3048[1][2] = 1799;
                    this.field3048[2][2] = 1734;
                    this.field3048[2][1] = 2618;
                    this.field3048[3][2] = 1220;
                    this.field3048[4][2] = 963;
                    this.field3048[2][0] = 3072;
                    this.field3048[3][1] = 2296;
                    this.field3048[4][1] = 2072;
                    this.field3048[3][0] = 3276;
                    this.field3048[1][3] = 1558;
                    this.field3048[5][2] = 2152;
                    this.field3048[5][1] = 2730;
                    this.field3048[4][0] = 3481;
                    this.field3048[6][2] = 1060;
                    this.field3048[2][3] = 1413;
                    this.field3048[3][3] = 947;
                    this.field3048[5][0] = 3686;
                    this.field3048[6][1] = 2232;
                    this.field3048[6][0] = 3891;
                    this.field3048[4][3] = 722;
                    this.field3048[7][0] = 4096;
                    this.field3048[5][3] = 1766;
                    this.field3048[6][3] = 915;
                    this.field3048[7][1] = 1686;
                    this.field3048[7][2] = 1413;
                    this.field3048[7][3] = 1140;
                }
            } else {
                this.field3048 = new int[2][4];
                this.field3048[0][3] = 0;
                this.field3048[1][3] = 4096;
                this.field3048[0][2] = 0;
                this.field3048[0][0] = 0;
                this.field3048[1][2] = 4096;
                this.field3048[0][1] = 0;
                this.field3048[1][0] = 4096;
                this.field3048[1][1] = 4096;
            }
        }
        if (arg0 <= 51) {
            field3053 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)V")
    public static final void method1341(int arg0) {
        ++field3051;
        if (arg0 <= 35) {
            field3053 = null;
        }
        class237.field3673.method940(61);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field3054;
        int var3 = -29 % ((arg0 - -54) / 44);
        int[][] var4 = super.field618.method91(46, arg1);
        if (super.field618.field211) {
            int[] var5 = this.method230(arg1, -15337, 0);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            for (int var9 = 0; var9 < class226.field3527; ++var9) {
                int var10 = var5[var9] >> 4;
                if (~var10 > -1) {
                    var10 = 0;
                }
                if (~var10 < -257) {
                    var10 = 256;
                }
                int var11 = this.field3052[var10];
                var6[var9] = class131.method904(4080, var11 >> 12);
                var7[var9] = class131.method904(4080, var11 >> 4);
                var8[var9] = class131.method904(4080, var11 << 4);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        if (this.field3048 == null) {
            this.method1340(68, 1);
        }
        ++field3045;
        this.method1343(4);
        int var2 = 117 % ((arg0 - -2) / 43);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
    public static final boolean method1342(String arg0, byte arg1, String arg2) {
        ++field3044;
        int var3 = arg2.length();
        int var4 = arg0.length();
        if (var3 < var4) {
            return false;
        } else {
            for (int var5 = 0; ~var5 > ~var4; ++var5) {
                char var7 = arg2.charAt(var5);
                char var8 = arg0.charAt(var5);
                if (var7 != var8 && ~Character.toLowerCase(var7) != ~Character.toLowerCase(var8) && Character.toUpperCase(var7) != Character.toUpperCase(var8)) {
                    return false;
                }
            }
            int var6 = -45 % ((arg1 - 23) / 32);
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "g", descriptor = "(I)V")
    private final void method1343(int arg0) {
        ++field3049;
        if (arg0 == 4) {
            int var2 = this.field3048.length;
            if (var2 > 0) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var2 < ~var6 && this.field3048[var6][0] <= var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var4 >= var2) {
                        int[] var7 = this.field3048[var2 - 1];
                        var8 = var7[2];
                        var9 = var7[3];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field3048[var4];
                        if (~var4 < -1) {
                            int[] var12 = this.field3048[var4 + -1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                            int var14 = -var13 + 4096;
                            var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                            var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                            var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                        } else {
                            var10 = var11[1];
                            var8 = var11[2];
                            var9 = var11[3];
                        }
                    }
                    int var15 = var8 >> 4;
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (~var15 < -256) {
                        var15 = 255;
                    }
                    int var16 = var9 >> 4;
                    if (~var16 <= -1) {
                        if (~var16 < -256) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    int var17 = var10 >> 4;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 255) {
                        var17 = 255;
                    }
                    this.field3052[var3] = class186.method1215(var16, class186.method1215(var17 << 16, var15 << 8));
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg0 != 6) {
            field3047 = null;
        }
        if (~arg1 == -1) {
            int var4 = arg2.method407(255);
            if (var4 == 0) {
                this.field3048 = new int[arg2.method407(255)][4];
                for (int var5 = 0; this.field3048.length > var5; ++var5) {
                    this.field3048[var5][0] = arg2.method423(-85);
                    this.field3048[var5][1] = arg2.method407(255) << 4;
                    this.field3048[var5][2] = arg2.method407(255) << 4;
                    this.field3048[var5][3] = arg2.method407(255) << 4;
                }
            } else {
                this.method1340(68, var4);
            }
        }
        ++field3039;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lca;I)V")
    public static final void method1344(class54 arg0, int arg1) {
        ++field3046;
        if (arg1 >= -64) {
            field3042 = null;
        }
        while (true) {
            while (arg0.field848.length > arg0.field887) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (~arg0.method407(255) == -2) {
                    var3 = arg0.method407(255);
                    var2 = true;
                    var4 = arg0.method407(255);
                }
                int var5 = arg0.method407(255);
                int var6 = arg0.method407(255);
                int var7 = class235.field3619 + -1 - (var6 * 64 + -class67.field1114);
                int var8 = var5 * 64 + -class141.field2029;
                if (~var8 <= -1 && ~(var7 + -63) <= -1 && ~(var8 + 63) > ~class133.field1956 && ~var7 > ~class235.field3619) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; ~var12 > -65; ++var12) {
                            if (!var2 || ~(var3 * 8) >= ~var11 && ~(var3 * 8 - -8) < ~var11 && var12 >= var4 * 8 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method459(false);
                                if (var13 != 0) {
                                    if (class226.field3528[var9][var10] == null) {
                                        class226.field3528[var9][var10] = new byte[4096];
                                    }
                                    class226.field3528[var9][var10][(-var12 + 63 << 6) + var11] = var13;
                                    byte var14 = arg0.method459(false);
                                    if (class63.field1059[var9][var10] == null) {
                                        class63.field1059[var9][var10] = new byte[4096];
                                    }
                                    class63.field1059[var9][var10][(-var12 + 63 << 6) - -var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; (var2 ? 64 : 4096) > var15; ++var15) {
                        byte var16 = arg0.method459(false);
                        if (var16 != 0) {
                            ++arg0.field887;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
    public static void method1345(boolean arg0) {
        field3040 = null;
        field3053 = null;
        field3047 = null;
        if (!arg0) {
            method1346(-75, -58, 109, 92, -108, 9, (class2) null);
        }
        field3042 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIILpb;)Lpb;")
    public static final class2 method1346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class2 arg6) {
        long var7 = (long) arg4;
        class2 var9 = (class2) class157.field2302.method945(var7, true);
        ++field3043;
        if (var9 == null) {
            class219 var10 = class219.method1502(class287.field4392, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1501(64, 768, -50, -10, -50);
            class157.field2302.method941(var9, var7, arg1 ^ -8448);
        }
        int var11 = arg6.method28();
        if (arg1 != 1) {
            return null;
        } else {
            int var12 = arg6.method31();
            int var13 = arg6.method15();
            int var14 = arg6.method18();
            class2 var15 = var9.method26(true, true, true);
            if (~arg3 != -1) {
                var15.method36(arg3);
            }
            class263 var16 = (class263) var15;
            if (~arg5 != ~class268.method1810(class260.field3986, arg2 - -var11, (byte) 118, arg0 + var13) || class268.method1810(class260.field3986, arg2 - -var12, (byte) 118, arg0 + var14) != arg5) {
                for (int var17 = 0; var17 < var16.field4045; ++var17) {
                    var16.field4046[var17] += -arg5 + class268.method1810(class260.field3986, var16.field4083[var17] - -arg2, (byte) 118, var16.field4054[var17] + arg0);
                }
                var16.field4067 = false;
            }
            return var15;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class202() {
        super(1, false);
    }
}
