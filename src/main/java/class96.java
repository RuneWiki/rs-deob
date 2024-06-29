import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class96 extends class222 {

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "[I")
    private int[] field1652 = new int[257];

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "Lsb;")
    public static class98 field1658 = class47.method368("Fallen lassen", 0);

    @OriginalMember(owner = "client!s", name = "X", descriptor = "Lsb;")
    public static class98 field1649 = class47.method368("::tele ", 0);

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "I")
    public static int field1660 = 0;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1654 = new CRC32();

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "Lsb;")
    public static class98 field1661 = class47.method368("scape main", 0);

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
    public static int field1662 = 0;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "[[I")
    private int[][] field1656;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class96() {
        super(1, false);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (~arg2 == -1) {
            int var4 = arg0.method1446(5350);
            if (~var4 != -1) {
                this.method691(var4, (byte) -64);
            } else {
                this.field1656 = new int[arg0.method1446(5350)][4];
                for (int var5 = 0; this.field1656.length > var5; ++var5) {
                    this.field1656[var5][0] = arg0.method1487(15);
                    this.field1656[var5][1] = arg0.method1446(5350) << 4;
                    this.field1656[var5][2] = arg0.method1446(5350) << 4;
                    this.field1656[var5][3] = arg0.method1446(5350) << 4;
                }
            }
        }
        if (arg1) {
            this.field1656 = null;
        }
        ++field1653;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(B)V")
    public static final void method690(byte arg0) {
        ++field1659;
        if (arg0 < 97) {
            field1654 = null;
        }
        class113.field2010.method1554((byte) -109);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)V")
    private final void method691(int arg0, byte arg1) {
        ++field1655;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1656 = new int[4][4];
                                this.field1656[0][0] = 2048;
                                this.field1656[0][1] = 0;
                                this.field1656[1][1] = 4096;
                                this.field1656[1][0] = 2867;
                                this.field1656[0][3] = 0;
                                this.field1656[2][0] = 3276;
                                this.field1656[3][0] = 4096;
                                this.field1656[1][3] = 0;
                                this.field1656[0][2] = 4096;
                                this.field1656[1][2] = 4096;
                                this.field1656[2][2] = 4096;
                                this.field1656[3][2] = 0;
                                this.field1656[2][1] = 4096;
                                this.field1656[2][3] = 0;
                                this.field1656[3][3] = 0;
                                this.field1656[3][1] = 4096;
                            } else {
                                this.field1656 = new int[16][4];
                                this.field1656[0][3] = 321;
                                this.field1656[1][3] = 562;
                                this.field1656[0][2] = 192;
                                this.field1656[1][2] = 449;
                                this.field1656[2][2] = 690;
                                this.field1656[2][3] = 803;
                                this.field1656[0][1] = 80;
                                this.field1656[0][0] = 0;
                                this.field1656[3][2] = 995;
                                this.field1656[1][0] = 155;
                                this.field1656[2][0] = 389;
                                this.field1656[3][3] = 1140;
                                this.field1656[4][2] = 1397;
                                this.field1656[1][1] = 321;
                                this.field1656[3][0] = 671;
                                this.field1656[4][3] = 1509;
                                this.field1656[4][0] = 897;
                                this.field1656[5][2] = 1429;
                                this.field1656[5][3] = 1413;
                                this.field1656[6][2] = 1461;
                                this.field1656[5][0] = 1175;
                                this.field1656[6][0] = 1368;
                                this.field1656[7][0] = 1507;
                                this.field1656[2][1] = 578;
                                this.field1656[8][0] = 1736;
                                this.field1656[3][1] = 947;
                                this.field1656[4][1] = 1285;
                                this.field1656[5][1] = 1525;
                                this.field1656[7][2] = 1525;
                                this.field1656[9][0] = 2088;
                                this.field1656[10][0] = 2355;
                                this.field1656[11][0] = 2691;
                                this.field1656[6][3] = 1333;
                                this.field1656[6][1] = 1734;
                                this.field1656[8][2] = 1590;
                                this.field1656[7][1] = 1413;
                                this.field1656[8][1] = 1108;
                                this.field1656[7][3] = 1702;
                                this.field1656[9][1] = 1766;
                                this.field1656[8][3] = 2056;
                                this.field1656[9][3] = 2666;
                                this.field1656[9][2] = 2056;
                                this.field1656[10][2] = 2586;
                                this.field1656[10][3] = 3276;
                                this.field1656[11][3] = 3228;
                                this.field1656[11][2] = 3148;
                                this.field1656[12][2] = 3710;
                                this.field1656[12][3] = 3196;
                                this.field1656[13][3] = 3019;
                                this.field1656[13][2] = 3421;
                                this.field1656[10][1] = 2409;
                                this.field1656[14][3] = 3228;
                                this.field1656[14][2] = 3148;
                                this.field1656[11][1] = 3116;
                                this.field1656[15][2] = 2505;
                                this.field1656[12][1] = 3806;
                                this.field1656[15][3] = 2746;
                                this.field1656[12][0] = 3031;
                                this.field1656[13][1] = 3437;
                                this.field1656[13][0] = 3522;
                                this.field1656[14][1] = 3116;
                                this.field1656[15][1] = 2377;
                                this.field1656[14][0] = 3727;
                                this.field1656[15][0] = 4096;
                            }
                        } else {
                            this.field1656 = new int[6][4];
                            this.field1656[0][0] = 0;
                            this.field1656[0][2] = 0;
                            this.field1656[0][1] = 0;
                            this.field1656[1][1] = 0;
                            this.field1656[2][1] = 0;
                            this.field1656[1][0] = 1843;
                            this.field1656[0][3] = 0;
                            this.field1656[3][1] = 0;
                            this.field1656[1][3] = 1493;
                            this.field1656[4][1] = 546;
                            this.field1656[2][3] = 2939;
                            this.field1656[1][2] = 0;
                            this.field1656[2][0] = 2457;
                            this.field1656[2][2] = 0;
                            this.field1656[3][3] = 3565;
                            this.field1656[3][2] = 1124;
                            this.field1656[3][0] = 2781;
                            this.field1656[5][1] = 4096;
                            this.field1656[4][3] = 4031;
                            this.field1656[5][3] = 4096;
                            this.field1656[4][2] = 3084;
                            this.field1656[5][2] = 4096;
                            this.field1656[4][0] = 3481;
                            this.field1656[5][0] = 4096;
                        }
                    } else {
                        this.field1656 = new int[7][4];
                        this.field1656[0][2] = 0;
                        this.field1656[0][0] = 0;
                        this.field1656[0][1] = 0;
                        this.field1656[0][3] = 4096;
                        this.field1656[1][3] = 4096;
                        this.field1656[2][3] = 0;
                        this.field1656[1][2] = 4096;
                        this.field1656[1][1] = 0;
                        this.field1656[2][2] = 4096;
                        this.field1656[2][1] = 0;
                        this.field1656[3][2] = 4096;
                        this.field1656[3][3] = 0;
                        this.field1656[1][0] = 663;
                        this.field1656[2][0] = 1363;
                        this.field1656[3][0] = 2048;
                        this.field1656[4][3] = 0;
                        this.field1656[4][2] = 0;
                        this.field1656[4][0] = 2727;
                        this.field1656[3][1] = 4096;
                        this.field1656[5][2] = 0;
                        this.field1656[4][1] = 4096;
                        this.field1656[5][3] = 4096;
                        this.field1656[6][3] = 4096;
                        this.field1656[5][0] = 3411;
                        this.field1656[6][2] = 0;
                        this.field1656[5][1] = 4096;
                        this.field1656[6][0] = 4096;
                        this.field1656[6][1] = 0;
                    }
                } else {
                    this.field1656 = new int[8][4];
                    this.field1656[0][1] = 2650;
                    this.field1656[1][1] = 2313;
                    this.field1656[0][3] = 2361;
                    this.field1656[1][3] = 1558;
                    this.field1656[2][3] = 1413;
                    this.field1656[0][2] = 2602;
                    this.field1656[1][2] = 1799;
                    this.field1656[0][0] = 0;
                    this.field1656[1][0] = 2867;
                    this.field1656[2][1] = 2618;
                    this.field1656[2][2] = 1734;
                    this.field1656[2][0] = 3072;
                    this.field1656[3][1] = 2296;
                    this.field1656[3][0] = 3276;
                    this.field1656[3][3] = 947;
                    this.field1656[4][3] = 722;
                    this.field1656[5][3] = 1766;
                    this.field1656[4][1] = 2072;
                    this.field1656[5][1] = 2730;
                    this.field1656[4][0] = 3481;
                    this.field1656[6][1] = 2232;
                    this.field1656[3][2] = 1220;
                    this.field1656[5][0] = 3686;
                    this.field1656[6][0] = 3891;
                    this.field1656[4][2] = 963;
                    this.field1656[5][2] = 2152;
                    this.field1656[6][3] = 915;
                    this.field1656[7][1] = 1686;
                    this.field1656[6][2] = 1060;
                    this.field1656[7][2] = 1413;
                    this.field1656[7][3] = 1140;
                    this.field1656[7][0] = 4096;
                }
            } else {
                this.field1656 = new int[2][4];
                this.field1656[0][1] = 0;
                this.field1656[1][1] = 4096;
                this.field1656[0][0] = 0;
                this.field1656[0][3] = 0;
                this.field1656[1][3] = 4096;
                this.field1656[1][0] = 4096;
                this.field1656[0][2] = 0;
                this.field1656[1][2] = 4096;
            }
        }
        if (arg1 >= -41) {
            field1648 = -22;
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        int[][] var3 = super.field3834.method627(4103, arg0);
        if (super.field3834.field1486) {
            int[] var4 = this.method1537((byte) 91, 0, arg0);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class13.field253; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field1652[var9];
                var6[var8] = class214.method1427(4080, var10 >> 12);
                var5[var8] = class214.method1427(4080, var10 >> 4);
                var7[var8] = class214.method1427(4080, var10 << 4);
            }
        }
        if (arg1 != 1) {
            return null;
        } else {
            ++field1657;
            return var3;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        ++field1650;
        if (this.field1656 == null) {
            this.method691(1, (byte) -74);
        }
        int var2 = 124 % ((arg0 - 57) / 51);
        this.method693((byte) -21);
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
    public static void method692(int arg0) {
        field1654 = null;
        if (arg0 != -12318) {
            field1649 = null;
        }
        field1658 = null;
        field1661 = null;
        field1649 = null;
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(B)V")
    private final void method693(byte arg0) {
        ++field1651;
        int var2 = this.field1656.length;
        if (arg0 != -21) {
            this.method693((byte) 4);
        }
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = var3 << 4;
                int var5 = 0;
                for (int var6 = 0; var6 < var2 && this.field1656[var6][0] <= var4; ++var6) {
                    ++var5;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 < ~var5) {
                    int[] var7 = this.field1656[var5];
                    if (~var5 >= -1) {
                        var8 = var7[1];
                        var9 = var7[2];
                        var10 = var7[3];
                    } else {
                        int[] var11 = this.field1656[var5 + -1];
                        int var12 = (-var11[0] + var4 << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var10 = var7[3] * var12 - -(var11[3] * var13) >> 12;
                        var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                        var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field1656[var2 + -1];
                    var8 = var14[1];
                    var10 = var14[3];
                    var9 = var14[2];
                }
                int var15 = var9 >> 4;
                int var16 = var10 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                int var17 = var8 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                this.field1652[var3] = class67.method471(var16, class67.method471(var17 << 16, var15 << 8));
            }
        }
    }
}
