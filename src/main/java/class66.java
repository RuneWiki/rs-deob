import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class66 extends class260 {

    @OriginalMember(owner = "client!af", name = "db", descriptor = "[I")
    private int[] field1362 = new int[257];

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "[I")
    public static int[] field1349 = new int[256];

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    public static int field1357 = 0;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "Loh;")
    public static class263 field1355 = class253.method1681(-120, "T");

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "Ltf;")
    public static class104 field1360;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "Loh;")
    public static class263 field1346;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "[I")
    public static int[] field1361;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "[[I")
    private int[][] field1351;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (arg0 == 0) {
            int var4 = arg2.method1301(arg1 + -14018);
            if (~var4 != -1) {
                this.method427(var4, 12741);
            } else {
                this.field1351 = new int[arg2.method1301(arg1 + -14018)][4];
                for (int var5 = 0; ~this.field1351.length < ~var5; ++var5) {
                    this.field1351[var5][0] = arg2.method1294((byte) 3);
                    this.field1351[var5][1] = arg2.method1301(-8317) << 4;
                    this.field1351[var5][2] = arg2.method1301(-8317) << 4;
                    this.field1351[var5][3] = arg2.method1301(-8317) << 4;
                }
            }
        }
        if (arg1 != 5701) {
            method426(-1);
        }
        ++field1359;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)V")
    public static final void method424(int arg0, boolean arg1) {
        if (!arg1) {
            class224.field3949.method829(arg0, (byte) -35);
            ++field1363;
            class18.field406.method829(arg0, (byte) 118);
            class103.field1956.method829(arg0, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        if (arg1 != 5) {
            method426(-97);
        }
        int[][] var3 = super.field4509.method1667(arg0, 0);
        ++field1348;
        if (super.field4509.field4346) {
            int[] var4 = this.method1711(arg0, 0, false);
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            for (int var8 = 0; ~class49.field1052 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field1362[var9];
                var7[var8] = class263.method1777(var10 >> 12, 4080);
                var5[var8] = class263.method1777(4080, var10 >> 4);
                var6[var8] = class263.method1777(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
    public static void method425(int arg0) {
        field1355 = null;
        field1346 = null;
        field1360 = null;
        field1361 = null;
        if (arg0 != 1) {
            method426(89);
        }
        field1349 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class66() {
        super(1, false);
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)Z")
    public static final boolean method426(int arg0) {
        ++field1364;
        if (arg0 != -19233) {
            field1357 = -91;
        }
        if (class260.field4515) {
            try {
                class142.field2610.method1785(-25092, class95.field1867.field4557);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(II)V")
    private final void method427(int arg0, int arg1) {
        ++field1354;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1351 = new int[4][4];
                                this.field1351[0][2] = 4096;
                                this.field1351[0][0] = 2048;
                                this.field1351[0][3] = 0;
                                this.field1351[1][0] = 2867;
                                this.field1351[1][2] = 4096;
                                this.field1351[2][2] = 4096;
                                this.field1351[1][3] = 0;
                                this.field1351[0][1] = 0;
                                this.field1351[2][3] = 0;
                                this.field1351[3][3] = 0;
                                this.field1351[3][2] = 0;
                                this.field1351[2][0] = 3276;
                                this.field1351[3][0] = 4096;
                                this.field1351[1][1] = 4096;
                                this.field1351[2][1] = 4096;
                                this.field1351[3][1] = 4096;
                            } else {
                                this.field1351 = new int[16][4];
                                this.field1351[0][1] = 80;
                                this.field1351[0][3] = 321;
                                this.field1351[1][3] = 562;
                                this.field1351[0][2] = 192;
                                this.field1351[1][2] = 449;
                                this.field1351[1][1] = 321;
                                this.field1351[0][0] = 0;
                                this.field1351[1][0] = 155;
                                this.field1351[2][3] = 803;
                                this.field1351[2][1] = 578;
                                this.field1351[3][1] = 947;
                                this.field1351[3][3] = 1140;
                                this.field1351[2][2] = 690;
                                this.field1351[2][0] = 389;
                                this.field1351[3][0] = 671;
                                this.field1351[4][0] = 897;
                                this.field1351[5][0] = 1175;
                                this.field1351[4][3] = 1509;
                                this.field1351[6][0] = 1368;
                                this.field1351[3][2] = 995;
                                this.field1351[7][0] = 1507;
                                this.field1351[4][1] = 1285;
                                this.field1351[8][0] = 1736;
                                this.field1351[4][2] = 1397;
                                this.field1351[9][0] = 2088;
                                this.field1351[5][3] = 1413;
                                this.field1351[10][0] = 2355;
                                this.field1351[5][1] = 1525;
                                this.field1351[6][1] = 1734;
                                this.field1351[7][1] = 1413;
                                this.field1351[6][3] = 1333;
                                this.field1351[5][2] = 1429;
                                this.field1351[11][0] = 2691;
                                this.field1351[12][0] = 3031;
                                this.field1351[8][1] = 1108;
                                this.field1351[6][2] = 1461;
                                this.field1351[7][2] = 1525;
                                this.field1351[8][2] = 1590;
                                this.field1351[7][3] = 1702;
                                this.field1351[9][1] = 1766;
                                this.field1351[10][1] = 2409;
                                this.field1351[9][2] = 2056;
                                this.field1351[8][3] = 2056;
                                this.field1351[13][0] = 3522;
                                this.field1351[10][2] = 2586;
                                this.field1351[11][2] = 3148;
                                this.field1351[9][3] = 2666;
                                this.field1351[12][2] = 3710;
                                this.field1351[11][1] = 3116;
                                this.field1351[14][0] = 3727;
                                this.field1351[13][2] = 3421;
                                this.field1351[12][1] = 3806;
                                this.field1351[10][3] = 3276;
                                this.field1351[14][2] = 3148;
                                this.field1351[15][0] = 4096;
                                this.field1351[11][3] = 3228;
                                this.field1351[13][1] = 3437;
                                this.field1351[14][1] = 3116;
                                this.field1351[12][3] = 3196;
                                this.field1351[13][3] = 3019;
                                this.field1351[15][1] = 2377;
                                this.field1351[14][3] = 3228;
                                this.field1351[15][3] = 2746;
                                this.field1351[15][2] = 2505;
                            }
                        } else {
                            this.field1351 = new int[6][4];
                            this.field1351[0][2] = 0;
                            this.field1351[0][1] = 0;
                            this.field1351[1][1] = 0;
                            this.field1351[0][0] = 0;
                            this.field1351[1][0] = 1843;
                            this.field1351[2][1] = 0;
                            this.field1351[0][3] = 0;
                            this.field1351[1][3] = 1493;
                            this.field1351[2][3] = 2939;
                            this.field1351[1][2] = 0;
                            this.field1351[2][2] = 0;
                            this.field1351[2][0] = 2457;
                            this.field1351[3][3] = 3565;
                            this.field1351[3][0] = 2781;
                            this.field1351[4][0] = 3481;
                            this.field1351[5][0] = 4096;
                            this.field1351[3][1] = 0;
                            this.field1351[4][3] = 4031;
                            this.field1351[5][3] = 4096;
                            this.field1351[3][2] = 1124;
                            this.field1351[4][2] = 3084;
                            this.field1351[4][1] = 546;
                            this.field1351[5][1] = 4096;
                            this.field1351[5][2] = 4096;
                        }
                    } else {
                        this.field1351 = new int[7][4];
                        this.field1351[0][0] = 0;
                        this.field1351[0][3] = 4096;
                        this.field1351[1][0] = 663;
                        this.field1351[2][0] = 1363;
                        this.field1351[0][2] = 0;
                        this.field1351[1][3] = 4096;
                        this.field1351[0][1] = 0;
                        this.field1351[1][2] = 4096;
                        this.field1351[2][2] = 4096;
                        this.field1351[2][3] = 0;
                        this.field1351[3][3] = 0;
                        this.field1351[3][2] = 4096;
                        this.field1351[1][1] = 0;
                        this.field1351[4][3] = 0;
                        this.field1351[4][2] = 0;
                        this.field1351[5][2] = 0;
                        this.field1351[5][3] = 4096;
                        this.field1351[6][2] = 0;
                        this.field1351[3][0] = 2048;
                        this.field1351[6][3] = 4096;
                        this.field1351[4][0] = 2727;
                        this.field1351[2][1] = 0;
                        this.field1351[5][0] = 3411;
                        this.field1351[3][1] = 4096;
                        this.field1351[6][0] = 4096;
                        this.field1351[4][1] = 4096;
                        this.field1351[5][1] = 4096;
                        this.field1351[6][1] = 0;
                    }
                } else {
                    this.field1351 = new int[8][4];
                    this.field1351[0][2] = 2602;
                    this.field1351[0][0] = 0;
                    this.field1351[0][1] = 2650;
                    this.field1351[1][2] = 1799;
                    this.field1351[1][0] = 2867;
                    this.field1351[1][1] = 2313;
                    this.field1351[2][0] = 3072;
                    this.field1351[3][0] = 3276;
                    this.field1351[2][1] = 2618;
                    this.field1351[2][2] = 1734;
                    this.field1351[3][1] = 2296;
                    this.field1351[3][2] = 1220;
                    this.field1351[0][3] = 2361;
                    this.field1351[4][1] = 2072;
                    this.field1351[5][1] = 2730;
                    this.field1351[6][1] = 2232;
                    this.field1351[4][0] = 3481;
                    this.field1351[5][0] = 3686;
                    this.field1351[7][1] = 1686;
                    this.field1351[1][3] = 1558;
                    this.field1351[6][0] = 3891;
                    this.field1351[2][3] = 1413;
                    this.field1351[7][0] = 4096;
                    this.field1351[4][2] = 963;
                    this.field1351[5][2] = 2152;
                    this.field1351[6][2] = 1060;
                    this.field1351[3][3] = 947;
                    this.field1351[4][3] = 722;
                    this.field1351[5][3] = 1766;
                    this.field1351[7][2] = 1413;
                    this.field1351[6][3] = 915;
                    this.field1351[7][3] = 1140;
                }
            } else {
                this.field1351 = new int[2][4];
                this.field1351[0][2] = 0;
                this.field1351[0][1] = 0;
                this.field1351[0][0] = 0;
                this.field1351[1][2] = 4096;
                this.field1351[1][0] = 4096;
                this.field1351[0][3] = 0;
                this.field1351[1][1] = 4096;
                this.field1351[1][3] = 4096;
            }
        }
        if (arg1 == 12741) {
            ;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V")
    private final void method428(byte arg0) {
        int var2 = 121 / ((arg0 - -57) / 36);
        ++field1358;
        int var3 = this.field1351.length;
        if (var3 > 0) {
            for (int var4 = 0; ~var4 > -258; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; ~var3 < ~var7 && ~var6 <= ~this.field1351[var7][0]; ++var7) {
                    ++var5;
                }
                int var12;
                int var13;
                int var14;
                if (var5 < var3) {
                    int[] var8 = this.field1351[var5];
                    if (var5 > 0) {
                        int[] var9 = this.field1351[var5 + -1];
                        int var10 = (-var9[0] + var6 << 12) / (var8[0] + -var9[0]);
                        int var11 = 4096 - var10;
                        var12 = var8[3] * var10 + var9[3] * var11 >> 12;
                        var13 = var8[1] * var10 + var9[1] * var11 >> 12;
                        var14 = var8[2] * var10 + var9[2] * var11 >> 12;
                    } else {
                        var14 = var8[2];
                        var12 = var8[3];
                        var13 = var8[1];
                    }
                } else {
                    int[] var15 = this.field1351[var3 + -1];
                    var13 = var15[1];
                    var12 = var15[3];
                    var14 = var15[2];
                }
                int var16 = var13 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                int var17 = var12 >> 4;
                int var18 = var14 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (~var18 <= -1) {
                    if (var18 > 255) {
                        var18 = 255;
                    }
                } else {
                    var18 = 0;
                }
                this.field1362[var4] = class160.method1052(class160.method1052(var16 << 16, var18 << 8), var17);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBI)V")
    public static final void method429(int arg0, byte arg1, int arg2) {
        ++field1352;
        class64 var3 = class84.method563(5, arg2, -52);
        var3.method396(true);
        int var4 = 20 % ((arg1 - -73) / 34);
        var3.field1290 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILue;B)[Lw;")
    public static final class141[] method430(int arg0, int arg1, class86 arg2, byte arg3) {
        ++field1356;
        if (!class254.method1687(arg0, (byte) 57, arg2, arg1)) {
            return null;
        } else {
            return arg3 != -27 ? null : class146.method961(true);
        }
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
    public static final void method431(int arg0) {
        ++field1347;
        class38.field865.method830(50);
        if (arg0 != 2088) {
            field1355 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        if (arg0 >= 81) {
            ++field1353;
            if (this.field1351 == null) {
                this.method427(1, 12741);
            }
            this.method428((byte) 35);
        }
    }
}
