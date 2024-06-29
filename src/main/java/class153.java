import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class153 extends class107 {

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "[I")
    private int[] field2450 = new int[257];

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "Lad;")
    public static class275 field2445 = new class275(64);

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2453 = "cyan:";

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    public static int field2458 = 0;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "[[I")
    private int[][] field2455;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        if (arg0 != 35) {
            this.method300((byte) 24);
        }
        ++field2456;
        if (this.field2455 == null) {
            this.method1039((byte) -107, 1);
        }
        this.method1041(true);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class153() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILgi;)V")
    public static final void method1036(int arg0, class164 arg1) {
        class211.field3362 = arg1;
        ++field2447;
        int var2 = 12 % ((arg0 - -44) / 38);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        ++field2443;
        if (super.field1662.field3063) {
            int[] var4 = this.method756(0, arg0, -29053);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class24.field443 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field2450[var9];
                var5[var8] = class233.method1609(4080, var10 >> 12);
                var6[var8] = class233.method1609(4080, var10 >> 4);
                var7[var8] = class233.method1609(var10 << 4, 4080);
            }
        }
        if (arg1 != -117) {
            method1042((class164) null, (class164) null, (class164) null, (byte) -26);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIZI)I")
    public static final int method1037(int arg0, int arg1, boolean arg2, int arg3) {
        ++field2457;
        class74 var4 = (class74) class57.field829.method371(84, (long) arg1);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field1187.length; ++var6) {
                if (var4.field1187[var6] >= 0 && ~class140.field2283 < ~var4.field1187[var6]) {
                    class158 var7 = class107.method754(-20563, var4.field1187[var6]);
                    if (var7.field2529 != null) {
                        class71 var8 = (class71) var7.field2529.method371(114, (long) arg0);
                        if (var8 != null) {
                            if (!arg2) {
                                var5 += var8.field1138;
                            } else {
                                var5 += var4.field1188[var6] * var8.field1138;
                            }
                        }
                    }
                }
            }
            if (arg3 != -23564) {
                method1038(-65, -7);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)V")
    public static final void method1038(int arg0, int arg1) {
        ++field2448;
        class291 var2 = class61.method389(arg0, arg1, 0);
        var2.method2010(0);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)V")
    private final void method1039(byte arg0, int arg1) {
        ++field2444;
        if (arg0 == -107) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 == 6) {
                                        this.field2455 = new int[4][4];
                                        this.field2455[0][2] = 4096;
                                        this.field2455[0][3] = 0;
                                        this.field2455[1][3] = 0;
                                        this.field2455[0][1] = 0;
                                        this.field2455[1][2] = 4096;
                                        this.field2455[1][1] = 4096;
                                        this.field2455[2][1] = 4096;
                                        this.field2455[3][1] = 4096;
                                        this.field2455[2][3] = 0;
                                        this.field2455[0][0] = 2048;
                                        this.field2455[3][3] = 0;
                                        this.field2455[2][2] = 4096;
                                        this.field2455[1][0] = 2867;
                                        this.field2455[2][0] = 3276;
                                        this.field2455[3][0] = 4096;
                                        this.field2455[3][2] = 0;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field2455 = new int[16][4];
                                    this.field2455[0][3] = 321;
                                    this.field2455[1][3] = 562;
                                    this.field2455[0][2] = 192;
                                    this.field2455[2][3] = 803;
                                    this.field2455[3][3] = 1140;
                                    this.field2455[0][0] = 0;
                                    this.field2455[4][3] = 1509;
                                    this.field2455[1][0] = 155;
                                    this.field2455[0][1] = 80;
                                    this.field2455[1][2] = 449;
                                    this.field2455[1][1] = 321;
                                    this.field2455[2][0] = 389;
                                    this.field2455[5][3] = 1413;
                                    this.field2455[2][1] = 578;
                                    this.field2455[3][0] = 671;
                                    this.field2455[6][3] = 1333;
                                    this.field2455[2][2] = 690;
                                    this.field2455[3][2] = 995;
                                    this.field2455[3][1] = 947;
                                    this.field2455[7][3] = 1702;
                                    this.field2455[8][3] = 2056;
                                    this.field2455[4][1] = 1285;
                                    this.field2455[9][3] = 2666;
                                    this.field2455[10][3] = 3276;
                                    this.field2455[5][1] = 1525;
                                    this.field2455[4][2] = 1397;
                                    this.field2455[5][2] = 1429;
                                    this.field2455[6][1] = 1734;
                                    this.field2455[11][3] = 3228;
                                    this.field2455[6][2] = 1461;
                                    this.field2455[7][2] = 1525;
                                    this.field2455[12][3] = 3196;
                                    this.field2455[13][3] = 3019;
                                    this.field2455[8][2] = 1590;
                                    this.field2455[9][2] = 2056;
                                    this.field2455[10][2] = 2586;
                                    this.field2455[14][3] = 3228;
                                    this.field2455[11][2] = 3148;
                                    this.field2455[4][0] = 897;
                                    this.field2455[12][2] = 3710;
                                    this.field2455[7][1] = 1413;
                                    this.field2455[13][2] = 3421;
                                    this.field2455[14][2] = 3148;
                                    this.field2455[15][2] = 2505;
                                    this.field2455[15][3] = 2746;
                                    this.field2455[8][1] = 1108;
                                    this.field2455[9][1] = 1766;
                                    this.field2455[10][1] = 2409;
                                    this.field2455[11][1] = 3116;
                                    this.field2455[5][0] = 1175;
                                    this.field2455[12][1] = 3806;
                                    this.field2455[13][1] = 3437;
                                    this.field2455[14][1] = 3116;
                                    this.field2455[6][0] = 1368;
                                    this.field2455[7][0] = 1507;
                                    this.field2455[8][0] = 1736;
                                    this.field2455[9][0] = 2088;
                                    this.field2455[15][1] = 2377;
                                    this.field2455[10][0] = 2355;
                                    this.field2455[11][0] = 2691;
                                    this.field2455[12][0] = 3031;
                                    this.field2455[13][0] = 3522;
                                    this.field2455[14][0] = 3727;
                                    this.field2455[15][0] = 4096;
                                }
                            } else {
                                this.field2455 = new int[6][4];
                                this.field2455[0][1] = 0;
                                this.field2455[0][2] = 0;
                                this.field2455[0][0] = 0;
                                this.field2455[0][3] = 0;
                                this.field2455[1][2] = 0;
                                this.field2455[2][2] = 0;
                                this.field2455[1][3] = 1493;
                                this.field2455[3][2] = 1124;
                                this.field2455[4][2] = 3084;
                                this.field2455[2][3] = 2939;
                                this.field2455[5][2] = 4096;
                                this.field2455[3][3] = 3565;
                                this.field2455[4][3] = 4031;
                                this.field2455[1][0] = 1843;
                                this.field2455[5][3] = 4096;
                                this.field2455[1][1] = 0;
                                this.field2455[2][1] = 0;
                                this.field2455[2][0] = 2457;
                                this.field2455[3][1] = 0;
                                this.field2455[4][1] = 546;
                                this.field2455[5][1] = 4096;
                                this.field2455[3][0] = 2781;
                                this.field2455[4][0] = 3481;
                                this.field2455[5][0] = 4096;
                            }
                        } else {
                            this.field2455 = new int[7][4];
                            this.field2455[0][3] = 4096;
                            this.field2455[1][3] = 4096;
                            this.field2455[0][2] = 0;
                            this.field2455[2][3] = 0;
                            this.field2455[0][0] = 0;
                            this.field2455[3][3] = 0;
                            this.field2455[1][2] = 4096;
                            this.field2455[4][3] = 0;
                            this.field2455[5][3] = 4096;
                            this.field2455[0][1] = 0;
                            this.field2455[2][2] = 4096;
                            this.field2455[1][1] = 0;
                            this.field2455[3][2] = 4096;
                            this.field2455[4][2] = 0;
                            this.field2455[2][1] = 0;
                            this.field2455[5][2] = 0;
                            this.field2455[6][2] = 0;
                            this.field2455[3][1] = 4096;
                            this.field2455[4][1] = 4096;
                            this.field2455[1][0] = 663;
                            this.field2455[5][1] = 4096;
                            this.field2455[2][0] = 1363;
                            this.field2455[3][0] = 2048;
                            this.field2455[6][3] = 4096;
                            this.field2455[6][1] = 0;
                            this.field2455[4][0] = 2727;
                            this.field2455[5][0] = 3411;
                            this.field2455[6][0] = 4096;
                        }
                    } else {
                        this.field2455 = new int[8][4];
                        this.field2455[0][1] = 2650;
                        this.field2455[0][3] = 2361;
                        this.field2455[0][0] = 0;
                        this.field2455[1][1] = 2313;
                        this.field2455[1][3] = 1558;
                        this.field2455[2][3] = 1413;
                        this.field2455[3][3] = 947;
                        this.field2455[2][1] = 2618;
                        this.field2455[0][2] = 2602;
                        this.field2455[1][0] = 2867;
                        this.field2455[1][2] = 1799;
                        this.field2455[3][1] = 2296;
                        this.field2455[4][3] = 722;
                        this.field2455[2][2] = 1734;
                        this.field2455[4][1] = 2072;
                        this.field2455[5][1] = 2730;
                        this.field2455[5][3] = 1766;
                        this.field2455[3][2] = 1220;
                        this.field2455[4][2] = 963;
                        this.field2455[2][0] = 3072;
                        this.field2455[3][0] = 3276;
                        this.field2455[5][2] = 2152;
                        this.field2455[6][1] = 2232;
                        this.field2455[4][0] = 3481;
                        this.field2455[6][2] = 1060;
                        this.field2455[6][3] = 915;
                        this.field2455[7][2] = 1413;
                        this.field2455[7][3] = 1140;
                        this.field2455[5][0] = 3686;
                        this.field2455[6][0] = 3891;
                        this.field2455[7][1] = 1686;
                        this.field2455[7][0] = 4096;
                    }
                } else {
                    this.field2455 = new int[2][4];
                    this.field2455[0][1] = 0;
                    this.field2455[0][3] = 0;
                    this.field2455[0][0] = 0;
                    this.field2455[0][2] = 0;
                    this.field2455[1][2] = 4096;
                    this.field2455[1][0] = 4096;
                    this.field2455[1][1] = 4096;
                    this.field2455[1][3] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(B)V")
    public static void method1040(byte arg0) {
        field2445 = null;
        if (arg0 == 12) {
            field2453 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
    private final void method1041(boolean arg0) {
        if (!arg0) {
            this.method195(84, (class274) null, (byte) 54);
        }
        int var2 = this.field2455.length;
        ++field2454;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = var3 << 4;
                int var5 = 0;
                for (int var6 = 0; ~var2 < ~var6 && var4 >= this.field2455[var6][0]; ++var6) {
                    ++var5;
                }
                int var8;
                int var9;
                int var10;
                if (~var5 <= ~var2) {
                    int[] var7 = this.field2455[var2 + -1];
                    var8 = var7[2];
                    var9 = var7[1];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field2455[var5];
                    if (~var5 >= -1) {
                        var9 = var11[1];
                        var10 = var11[3];
                        var8 = var11[2];
                    } else {
                        int[] var12 = this.field2455[var5 + -1];
                        int var13 = (var4 - var12[0] << 12) / (var11[0] + -var12[0]);
                        int var14 = 4096 - var13;
                        var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var10 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                        var9 = var11[1] * var13 + var12[1] * var14 >> 12;
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
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field2450[var3] = class76.method555(var17, class76.method555(var16 << 16, var15 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg2 != 28) {
            field2445 = null;
        }
        if (arg0 == 0) {
            int var4 = arg1.method1849(255);
            if (~var4 == -1) {
                this.field2455 = new int[arg1.method1849(255)][4];
                for (int var5 = 0; ~var5 > ~this.field2455.length; ++var5) {
                    this.field2455[var5][0] = arg1.method1837(252);
                    this.field2455[var5][1] = arg1.method1849(255) << 4;
                    this.field2455[var5][2] = arg1.method1849(255) << 4;
                    this.field2455[var5][3] = arg1.method1849(255) << 4;
                }
            } else {
                this.method1039((byte) -107, var4);
            }
        }
        ++field2449;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lgi;Lgi;Lgi;B)V")
    public static final void method1042(class164 arg0, class164 arg1, class164 arg2, byte arg3) {
        class60.field873 = arg1;
        class15.field296 = arg2;
        if (arg3 != -71) {
            method1038(-121, 117);
        }
        class127.field2040 = arg0;
        ++field2451;
    }
}
