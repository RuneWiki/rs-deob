import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class477 extends class56 {

    @OriginalMember(owner = "client!la", name = "I", descriptor = "[I")
    private int[] field6623 = new int[257];

    @OriginalMember(owner = "client!la", name = "K", descriptor = "Lifa;")
    public static class450 field6625 = new class450();

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "[[I")
    private int[][] field6618;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)Les;", line = 3)
    public static final class403 method2834(int arg0) {
        ++field6627;
        if (arg0 > -119) {
            method2836(-106, -57, -65);
        }
        class403 var1 = class632.method3569((byte) 120);
        var1.method2404(-55, 0L);
        var1.method2388(255, class710.field9967);
        var1.method2404(-75, class616.field8285);
        var1.method2404(-75, class122.field1564);
        var1.method2409(class419.field5455, (byte) -95, class116.field1479);
        return var1;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V", line = 22)
    private final void method2835(int arg0) {
        ++field6621;
        if (arg0 <= 11) {
            this.method2838(97, (byte) 27);
        }
        int var2 = this.field6618.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && var5 >= this.field6618[var6][0]; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (var2 > var4) {
                    int[] var7 = this.field6618[var4];
                    if (var4 > 0) {
                        int[] var8 = this.field6618[var4 + -1];
                        int var9 = (var5 - var8[0] << 12) / (var7[0] + -var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[3] * var9 + var8[3] * var10 >> 12;
                        var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var13 = var7[2] * var9 - -(var8[2] * var10) >> 12;
                    } else {
                        var12 = var7[1];
                        var13 = var7[2];
                        var11 = var7[3];
                    }
                } else {
                    int[] var14 = this.field6618[var2 + -1];
                    var13 = var14[2];
                    var11 = var14[3];
                    var12 = var14[1];
                }
                int var15 = var11 >> 4;
                int var16 = var13 >> 4;
                int var17 = var12 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field6623[var3] = class5.method105(var15, class5.method105(var16 << 8, var17 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(III)I", line = 128)
    public static final int method2836(int arg0, int arg1, int arg2) {
        if (arg0 != -22025) {
            return 44;
        } else {
            ++field6620;
            int var3 = (127 & arg2) * arg1 >> 7;
            if (~var3 > -3) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (arg2 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 154)
    public class477() {
        super(1, false);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V", line = 157)
    public static void method2837(byte arg0) {
        if (arg0 != -28) {
            method2834(-87);
        }
        field6625 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)V", line = 167)
    private final void method2838(int arg0, byte arg1) {
        int var3 = -50 % ((52 - arg1) / 55);
        ++field6626;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field6618 = new int[4][4];
                                    this.field6618[0][2] = 4096;
                                    this.field6618[0][3] = 0;
                                    this.field6618[0][1] = 0;
                                    this.field6618[0][0] = 2048;
                                    this.field6618[1][2] = 4096;
                                    this.field6618[1][0] = 2867;
                                    this.field6618[1][1] = 4096;
                                    this.field6618[1][3] = 0;
                                    this.field6618[2][1] = 4096;
                                    this.field6618[2][0] = 3276;
                                    this.field6618[2][3] = 0;
                                    this.field6618[2][2] = 4096;
                                    this.field6618[3][0] = 4096;
                                    this.field6618[3][3] = 0;
                                    this.field6618[3][1] = 4096;
                                    this.field6618[3][2] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field6618 = new int[16][4];
                                this.field6618[0][3] = 321;
                                this.field6618[0][2] = 192;
                                this.field6618[0][0] = 0;
                                this.field6618[0][1] = 80;
                                this.field6618[1][3] = 562;
                                this.field6618[1][0] = 155;
                                this.field6618[1][1] = 321;
                                this.field6618[1][2] = 449;
                                this.field6618[2][2] = 690;
                                this.field6618[2][3] = 803;
                                this.field6618[2][0] = 389;
                                this.field6618[2][1] = 578;
                                this.field6618[3][2] = 995;
                                this.field6618[3][3] = 1140;
                                this.field6618[3][0] = 671;
                                this.field6618[3][1] = 947;
                                this.field6618[4][3] = 1509;
                                this.field6618[4][2] = 1397;
                                this.field6618[4][0] = 897;
                                this.field6618[4][1] = 1285;
                                this.field6618[5][0] = 1175;
                                this.field6618[5][2] = 1429;
                                this.field6618[5][1] = 1525;
                                this.field6618[5][3] = 1413;
                                this.field6618[6][0] = 1368;
                                this.field6618[6][2] = 1461;
                                this.field6618[6][3] = 1333;
                                this.field6618[6][1] = 1734;
                                this.field6618[7][1] = 1413;
                                this.field6618[7][3] = 1702;
                                this.field6618[7][2] = 1525;
                                this.field6618[7][0] = 1507;
                                this.field6618[8][1] = 1108;
                                this.field6618[8][0] = 1736;
                                this.field6618[8][3] = 2056;
                                this.field6618[8][2] = 1590;
                                this.field6618[9][3] = 2666;
                                this.field6618[9][1] = 1766;
                                this.field6618[9][2] = 2056;
                                this.field6618[9][0] = 2088;
                                this.field6618[10][3] = 3276;
                                this.field6618[10][1] = 2409;
                                this.field6618[10][0] = 2355;
                                this.field6618[10][2] = 2586;
                                this.field6618[11][3] = 3228;
                                this.field6618[11][0] = 2691;
                                this.field6618[11][2] = 3148;
                                this.field6618[11][1] = 3116;
                                this.field6618[12][2] = 3710;
                                this.field6618[12][0] = 3031;
                                this.field6618[12][3] = 3196;
                                this.field6618[12][1] = 3806;
                                this.field6618[13][1] = 3437;
                                this.field6618[13][2] = 3421;
                                this.field6618[13][3] = 3019;
                                this.field6618[13][0] = 3522;
                                this.field6618[14][3] = 3228;
                                this.field6618[14][1] = 3116;
                                this.field6618[14][2] = 3148;
                                this.field6618[14][0] = 3727;
                                this.field6618[15][3] = 2746;
                                this.field6618[15][2] = 2505;
                                this.field6618[15][0] = 4096;
                                this.field6618[15][1] = 2377;
                            }
                        } else {
                            this.field6618 = new int[6][4];
                            this.field6618[0][2] = 0;
                            this.field6618[0][0] = 0;
                            this.field6618[0][3] = 0;
                            this.field6618[0][1] = 0;
                            this.field6618[1][0] = 1843;
                            this.field6618[1][2] = 0;
                            this.field6618[1][3] = 1493;
                            this.field6618[1][1] = 0;
                            this.field6618[2][1] = 0;
                            this.field6618[2][3] = 2939;
                            this.field6618[2][2] = 0;
                            this.field6618[2][0] = 2457;
                            this.field6618[3][2] = 1124;
                            this.field6618[3][0] = 2781;
                            this.field6618[3][1] = 0;
                            this.field6618[3][3] = 3565;
                            this.field6618[4][2] = 3084;
                            this.field6618[4][1] = 546;
                            this.field6618[4][3] = 4031;
                            this.field6618[4][0] = 3481;
                            this.field6618[5][1] = 4096;
                            this.field6618[5][0] = 4096;
                            this.field6618[5][3] = 4096;
                            this.field6618[5][2] = 4096;
                        }
                    } else {
                        this.field6618 = new int[7][4];
                        this.field6618[0][2] = 0;
                        this.field6618[0][0] = 0;
                        this.field6618[0][1] = 0;
                        this.field6618[0][3] = 4096;
                        this.field6618[1][0] = 663;
                        this.field6618[1][3] = 4096;
                        this.field6618[1][1] = 0;
                        this.field6618[1][2] = 4096;
                        this.field6618[2][3] = 0;
                        this.field6618[2][2] = 4096;
                        this.field6618[2][1] = 0;
                        this.field6618[2][0] = 1363;
                        this.field6618[3][0] = 2048;
                        this.field6618[3][3] = 0;
                        this.field6618[3][1] = 4096;
                        this.field6618[3][2] = 4096;
                        this.field6618[4][3] = 0;
                        this.field6618[4][2] = 0;
                        this.field6618[4][0] = 2727;
                        this.field6618[4][1] = 4096;
                        this.field6618[5][0] = 3411;
                        this.field6618[5][3] = 4096;
                        this.field6618[5][2] = 0;
                        this.field6618[5][1] = 4096;
                        this.field6618[6][3] = 4096;
                        this.field6618[6][2] = 0;
                        this.field6618[6][1] = 0;
                        this.field6618[6][0] = 4096;
                    }
                } else {
                    this.field6618 = new int[8][4];
                    this.field6618[0][2] = 2602;
                    this.field6618[0][3] = 2361;
                    this.field6618[0][1] = 2650;
                    this.field6618[0][0] = 0;
                    this.field6618[1][3] = 1558;
                    this.field6618[1][0] = 2867;
                    this.field6618[1][1] = 2313;
                    this.field6618[1][2] = 1799;
                    this.field6618[2][3] = 1413;
                    this.field6618[2][2] = 1734;
                    this.field6618[2][1] = 2618;
                    this.field6618[2][0] = 3072;
                    this.field6618[3][2] = 1220;
                    this.field6618[3][1] = 2296;
                    this.field6618[3][0] = 3276;
                    this.field6618[3][3] = 947;
                    this.field6618[4][1] = 2072;
                    this.field6618[4][2] = 963;
                    this.field6618[4][3] = 722;
                    this.field6618[4][0] = 3481;
                    this.field6618[5][3] = 1766;
                    this.field6618[5][1] = 2730;
                    this.field6618[5][0] = 3686;
                    this.field6618[5][2] = 2152;
                    this.field6618[6][3] = 915;
                    this.field6618[6][2] = 1060;
                    this.field6618[6][0] = 3891;
                    this.field6618[6][1] = 2232;
                    this.field6618[7][0] = 4096;
                    this.field6618[7][2] = 1413;
                    this.field6618[7][1] = 1686;
                    this.field6618[7][3] = 1140;
                }
            } else {
                this.field6618 = new int[2][4];
                this.field6618[0][2] = 0;
                this.field6618[0][3] = 0;
                this.field6618[0][0] = 0;
                this.field6618[0][1] = 0;
                this.field6618[1][0] = 4096;
                this.field6618[1][2] = 4096;
                this.field6618[1][3] = 4096;
                this.field6618[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 416)
    public final void method493(byte arg0) {
        if (this.field6618 == null) {
            this.method2838(1, (byte) -123);
        }
        ++field6619;
        int var2 = 1 % ((37 - arg0) / 62);
        this.method2835(109);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILes;)V", line = 429)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        ++field6624;
        if (~arg1 == -1) {
            int var4 = arg2.method2396((byte) -90);
            if (var4 != 0) {
                this.method2838(var4, (byte) 121);
            } else {
                this.field6618 = new int[arg2.method2396((byte) 119)][4];
                for (int var5 = 0; ~var5 > ~this.field6618.length; ++var5) {
                    this.field6618[var5][0] = arg2.method2390((byte) 35);
                    this.field6618[var5][1] = arg2.method2396((byte) 106) << 4;
                    this.field6618[var5][2] = arg2.method2396((byte) 84) << 4;
                    this.field6618[var5][3] = arg2.method2396((byte) -92) << 4;
                }
            }
        }
        if (arg0 > -44) {
            this.field6623 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)[[I", line = 472)
    public final int[][] method187(byte arg0, int arg1) {
        if (arg0 < 35) {
            field6625 = null;
        }
        ++field6622;
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (super.field759.field341) {
            int[] var4 = this.method492(0, arg1, (byte) 49);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class642.field8759; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field6623[var9];
                var5[var8] = class296.method1733(var10, 16711680) >> 12;
                var6[var8] = class296.method1733(var10 >> 4, 4080);
                var7[var8] = class296.method1733(var10 << 4, 4080);
            }
        }
        return var3;
    }
}
