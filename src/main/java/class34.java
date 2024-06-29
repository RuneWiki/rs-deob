import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 extends class228 {

    @OriginalMember(owner = "client!va", name = "T", descriptor = "[I")
    private int[] field602 = new int[257];

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "Lwk;")
    public static class273 field608 = new class273(64);

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "Loa;")
    public static class99 field611 = class221.method1463(2844, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
    public static int field613 = 0;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "Lng;")
    public static class76 field612 = new class76();

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "[I")
    public static int[] field616 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field615 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!va", name = "kb", descriptor = "I")
    public static int field619 = 0;

    @OriginalMember(owner = "client!va", name = "jb", descriptor = "S")
    public static short field618 = 1;

    @OriginalMember(owner = "client!va", name = "ib", descriptor = "Lng;")
    public static class76 field617 = new class76();

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "[[I")
    private int[][] field609;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg0 == 0) {
            int var4 = arg1.method1693((byte) 90);
            if (~var4 == -1) {
                this.field609 = new int[arg1.method1693((byte) 125)][4];
                for (int var5 = 0; ~this.field609.length < ~var5; ++var5) {
                    this.field609[var5][0] = arg1.method1740((byte) 54);
                    this.field609[var5][1] = arg1.method1693((byte) -96) << 4;
                    this.field609[var5][2] = arg1.method1693((byte) -126) << 4;
                    this.field609[var5][3] = arg1.method1693((byte) -83) << 4;
                }
            } else {
                this.method280(var4, 1734);
            }
        }
        ++field601;
        if (arg2 != -7618) {
            field615 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        if (this.field609 == null) {
            this.method280(1, arg0 ^ -1730);
        }
        this.method279(71);
        ++field605;
        if (arg0 != -8) {
            field615 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class34() {
        super(1, false);
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
    private final void method279(int arg0) {
        ++field603;
        int var2 = this.field609.length;
        if (arg0 <= 20) {
            this.method18(-102, (class261) null, 123);
        }
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && ~this.field609[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 <= ~var2) {
                    int[] var7 = this.field609[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[2];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field609[var4];
                    if (~var4 < -1) {
                        int[] var12 = this.field609[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var8 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                    } else {
                        var9 = var11[2];
                        var10 = var11[1];
                        var8 = var11[3];
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var9 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                if (var16 >= 0) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                int var17 = var10 >> 4;
                if (~var17 <= -1) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field602[var3] = class179.method1194(var15, class179.method1194(var16 << 8, var17 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(II)V")
    private final void method280(int arg0, int arg1) {
        ++field607;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field609 = new int[4][4];
                                this.field609[0][0] = 2048;
                                this.field609[0][3] = 0;
                                this.field609[1][0] = 2867;
                                this.field609[0][1] = 0;
                                this.field609[0][2] = 4096;
                                this.field609[1][2] = 4096;
                                this.field609[1][1] = 4096;
                                this.field609[2][1] = 4096;
                                this.field609[2][0] = 3276;
                                this.field609[1][3] = 0;
                                this.field609[3][1] = 4096;
                                this.field609[3][0] = 4096;
                                this.field609[2][3] = 0;
                                this.field609[3][3] = 0;
                                this.field609[2][2] = 4096;
                                this.field609[3][2] = 0;
                            } else {
                                this.field609 = new int[16][4];
                                this.field609[0][3] = 321;
                                this.field609[1][3] = 562;
                                this.field609[0][1] = 80;
                                this.field609[1][1] = 321;
                                this.field609[0][0] = 0;
                                this.field609[2][1] = 578;
                                this.field609[1][0] = 155;
                                this.field609[0][2] = 192;
                                this.field609[2][3] = 803;
                                this.field609[3][3] = 1140;
                                this.field609[4][3] = 1509;
                                this.field609[1][2] = 449;
                                this.field609[2][2] = 690;
                                this.field609[3][2] = 995;
                                this.field609[5][3] = 1413;
                                this.field609[6][3] = 1333;
                                this.field609[4][2] = 1397;
                                this.field609[2][0] = 389;
                                this.field609[3][0] = 671;
                                this.field609[5][2] = 1429;
                                this.field609[4][0] = 897;
                                this.field609[3][1] = 947;
                                this.field609[7][3] = 1702;
                                this.field609[5][0] = 1175;
                                this.field609[6][0] = 1368;
                                this.field609[7][0] = 1507;
                                this.field609[4][1] = 1285;
                                this.field609[5][1] = 1525;
                                this.field609[8][0] = 1736;
                                this.field609[6][2] = 1461;
                                this.field609[8][3] = 2056;
                                this.field609[9][3] = 2666;
                                this.field609[9][0] = 2088;
                                this.field609[10][3] = 3276;
                                this.field609[11][3] = 3228;
                                this.field609[10][0] = 2355;
                                this.field609[6][1] = 1734;
                                this.field609[7][1] = 1413;
                                this.field609[12][3] = 3196;
                                this.field609[13][3] = 3019;
                                this.field609[11][0] = 2691;
                                this.field609[8][1] = 1108;
                                this.field609[14][3] = 3228;
                                this.field609[7][2] = 1525;
                                this.field609[12][0] = 3031;
                                this.field609[15][3] = 2746;
                                this.field609[8][2] = 1590;
                                this.field609[9][2] = 2056;
                                this.field609[9][1] = 1766;
                                this.field609[13][0] = 3522;
                                this.field609[10][1] = 2409;
                                this.field609[10][2] = 2586;
                                this.field609[11][2] = 3148;
                                this.field609[14][0] = 3727;
                                this.field609[12][2] = 3710;
                                this.field609[11][1] = 3116;
                                this.field609[15][0] = 4096;
                                this.field609[13][2] = 3421;
                                this.field609[14][2] = 3148;
                                this.field609[15][2] = 2505;
                                this.field609[12][1] = 3806;
                                this.field609[13][1] = 3437;
                                this.field609[14][1] = 3116;
                                this.field609[15][1] = 2377;
                            }
                        } else {
                            this.field609 = new int[6][4];
                            this.field609[0][3] = 0;
                            this.field609[0][2] = 0;
                            this.field609[0][1] = 0;
                            this.field609[0][0] = 0;
                            this.field609[1][3] = 1493;
                            this.field609[1][0] = 1843;
                            this.field609[1][2] = 0;
                            this.field609[2][2] = 0;
                            this.field609[3][2] = 1124;
                            this.field609[2][3] = 2939;
                            this.field609[2][0] = 2457;
                            this.field609[3][0] = 2781;
                            this.field609[3][3] = 3565;
                            this.field609[4][3] = 4031;
                            this.field609[5][3] = 4096;
                            this.field609[4][2] = 3084;
                            this.field609[4][0] = 3481;
                            this.field609[5][0] = 4096;
                            this.field609[5][2] = 4096;
                            this.field609[1][1] = 0;
                            this.field609[2][1] = 0;
                            this.field609[3][1] = 0;
                            this.field609[4][1] = 546;
                            this.field609[5][1] = 4096;
                        }
                    } else {
                        this.field609 = new int[7][4];
                        this.field609[0][1] = 0;
                        this.field609[0][0] = 0;
                        this.field609[0][3] = 4096;
                        this.field609[1][1] = 0;
                        this.field609[1][0] = 663;
                        this.field609[1][3] = 4096;
                        this.field609[0][2] = 0;
                        this.field609[1][2] = 4096;
                        this.field609[2][1] = 0;
                        this.field609[2][3] = 0;
                        this.field609[2][2] = 4096;
                        this.field609[3][2] = 4096;
                        this.field609[2][0] = 1363;
                        this.field609[3][3] = 0;
                        this.field609[3][0] = 2048;
                        this.field609[4][2] = 0;
                        this.field609[4][3] = 0;
                        this.field609[5][3] = 4096;
                        this.field609[5][2] = 0;
                        this.field609[4][0] = 2727;
                        this.field609[3][1] = 4096;
                        this.field609[6][3] = 4096;
                        this.field609[4][1] = 4096;
                        this.field609[6][2] = 0;
                        this.field609[5][0] = 3411;
                        this.field609[5][1] = 4096;
                        this.field609[6][1] = 0;
                        this.field609[6][0] = 4096;
                    }
                } else {
                    this.field609 = new int[8][4];
                    this.field609[0][1] = 2650;
                    this.field609[0][3] = 2361;
                    this.field609[1][1] = 2313;
                    this.field609[2][1] = 2618;
                    this.field609[3][1] = 2296;
                    this.field609[1][3] = 1558;
                    this.field609[4][1] = 2072;
                    this.field609[5][1] = 2730;
                    this.field609[0][2] = 2602;
                    this.field609[0][0] = 0;
                    this.field609[6][1] = 2232;
                    this.field609[7][1] = 1686;
                    this.field609[1][2] = 1799;
                    this.field609[2][3] = 1413;
                    this.field609[2][2] = 1734;
                    this.field609[3][2] = 1220;
                    this.field609[4][2] = 963;
                    this.field609[1][0] = 2867;
                    this.field609[5][2] = 2152;
                    this.field609[3][3] = 947;
                    this.field609[6][2] = 1060;
                    this.field609[4][3] = 722;
                    this.field609[5][3] = 1766;
                    this.field609[2][0] = 3072;
                    this.field609[7][2] = 1413;
                    this.field609[6][3] = 915;
                    this.field609[7][3] = 1140;
                    this.field609[3][0] = 3276;
                    this.field609[4][0] = 3481;
                    this.field609[5][0] = 3686;
                    this.field609[6][0] = 3891;
                    this.field609[7][0] = 4096;
                }
            } else {
                this.field609 = new int[2][4];
                this.field609[0][2] = 0;
                this.field609[1][2] = 4096;
                this.field609[0][0] = 0;
                this.field609[0][3] = 0;
                this.field609[1][0] = 4096;
                this.field609[0][1] = 0;
                this.field609[1][1] = 4096;
                this.field609[1][3] = 4096;
            }
        }
        if (arg1 != 1734) {
            field614 = 73;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IJ)V")
    public static final void method281(int arg0, long arg1) {
        ++field606;
        if (~arg1 != -1L) {
            if ((class82.field1450 < 100 || class214.field3717) && class82.field1450 < 200) {
                if (arg0 != 12124) {
                    method281(-46, 29L);
                }
                class99 var3 = class156.method1069(arg0 ^ -12043, arg1).method690(71);
                for (int var4 = 0; ~var4 > ~class82.field1450; ++var4) {
                    if (class71.field1203[var4] == arg1) {
                        class259.method1678(class20.field234, class198.method1332(123, new class99[] { var3, class18.field190 }), (byte) -126, 0);
                        return;
                    }
                }
                for (int var5 = 0; ~class122.field2138 < ~var5; ++var5) {
                    if (class160.field2846[var5] == arg1) {
                        class259.method1678(class20.field234, class198.method1332(83, new class99[] { class85.field1470, var3, class146.field2587 }), (byte) -126, 0);
                        return;
                    }
                }
                if (var3.method679((byte) -128, class168.field3006.field3224)) {
                    class259.method1678(class20.field234, class191.field3365, (byte) -126, 0);
                } else {
                    class57.field955[class82.field1450] = var3;
                    class71.field1203[class82.field1450] = arg1;
                    ++class99.field1645;
                    class54.field891[class82.field1450] = 0;
                    class64.field1082[class82.field1450] = class20.field234;
                    class269.field4735[class82.field1450] = 0;
                    class89.field1533[class82.field1450] = false;
                    class290.field5084 = class28.field514;
                    ++class82.field1450;
                    class131.field2277.method966((byte) 49, 63);
                    class131.field2277.method1699(arg1, arg0 + -12034);
                }
            } else {
                class259.method1678(class20.field234, class19.field208, (byte) -126, 0);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        ++field604;
        if (arg0 != -27) {
            field610 = 100;
        }
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791) {
            int[] var4 = this.method1500(arg1, 0, (byte) 123);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; class234.field4046 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field602[var9];
                var6[var8] = class71.method502(4080, var10 >> 12);
                var5[var8] = class71.method502(var10 >> 4, 4080);
                var7[var8] = class71.method502(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(B)V")
    public static void method282(byte arg0) {
        field616 = null;
        field608 = null;
        field612 = null;
        field615 = null;
        field611 = null;
        if (arg0 != 115) {
            method281(-43, 33L);
        }
        field617 = null;
    }
}
