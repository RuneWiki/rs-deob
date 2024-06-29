import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class143 extends class7 {

    @OriginalMember(owner = "client!od", name = "db", descriptor = "[I")
    private int[] field2769 = new int[257];

    @OriginalMember(owner = "client!od", name = "V", descriptor = "Lob;")
    public static class141 field2761 = class175.method1195(40, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "Lob;")
    public static class141 field2764 = class175.method1195(40, "null");

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "Lob;")
    public static class141 field2772 = class175.method1195(40, "Angreifen");

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "Lca;")
    public static class22 field2760;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "Ljava/awt/Image;")
    public static Image field2766;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "[[I")
    private int[][] field2758;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        ++field2757;
        int var4 = 74 % ((66 - arg1) / 57);
        if (~arg0 == -1) {
            int var5 = arg2.method991(255);
            if (var5 != 0) {
                this.method947(27209, var5);
            } else {
                this.field2758 = new int[arg2.method991(255)][4];
                for (int var6 = 0; ~this.field2758.length < ~var6; ++var6) {
                    this.field2758[var6][0] = arg2.method1007(75);
                    this.field2758[var6][1] = arg2.method991(255) << 4;
                    this.field2758[var6][2] = arg2.method991(255) << 4;
                    this.field2758[var6][3] = arg2.method991(255) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILpe;I)Lfa;")
    public static final class52 method942(int arg0, class154 arg1, int arg2) {
        ++field2763;
        if (!class12.method76((byte) 98, arg1, arg2)) {
            return null;
        } else {
            if (arg0 != 1) {
                field2760 = null;
            }
            return class115.method743(false);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public static final void method943(byte arg0) {
        ++field2759;
        class108.field2087.method1385(9946);
        if (arg0 == 57) {
            class166.field3218.method1385(9946);
            class204.field3916.method1385(9946);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        ++field2762;
        int[][] var3 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[] var4 = this.method52(arg0, 0, 57);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class117.field2272; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field2769[var9];
                var5[var8] = class15.method94(var10 >> 12, 4080);
                var6[var8] = class15.method94(var10 >> 4, 4080);
                var7[var8] = class15.method94(var10, 255) << 4;
            }
        }
        int var11 = -10 % ((-42 - arg1) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
    public static final void method944(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; ~var5 > ~class41.field807; ++var5) {
            if (arg1 < class37.field739[var5] + class109.field2109[var5] && arg1 + arg2 > class37.field739[var5] && arg0 < class16.field289[var5] - -class108.field2089[var5] && class16.field289[var5] < arg0 + arg3) {
                class141.field2737[var5] = true;
            }
        }
        ++field2768;
        if (arg4 != 2) {
            method942(-111, (class154) null, 12);
        }
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        if (this.field2758 == null) {
            this.method947(27209, 1);
        }
        if (arg0 == 1) {
            this.method946((byte) 120);
            ++field2771;
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
    public static void method945(byte arg0) {
        field2764 = null;
        field2766 = null;
        field2760 = null;
        if (arg0 == -56) {
            field2772 = null;
            field2761 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
    private final void method946(byte arg0) {
        ++field2765;
        if (arg0 < 32) {
            field2772 = null;
        }
        int var2 = this.field2758.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && ~var5 <= ~this.field2758[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 > ~var2) {
                    int[] var7 = this.field2758[var4];
                    if (var4 <= 0) {
                        var8 = var7[2];
                        var9 = var7[1];
                        var10 = var7[3];
                    } else {
                        int[] var11 = this.field2758[var4 + -1];
                        int var12 = (var5 - var11[0] << 12) / (var7[0] + -var11[0]);
                        int var13 = 4096 - var12;
                        var8 = var7[2] * var12 + var11[2] * var13 >> 12;
                        var10 = var7[3] * var12 + var11[3] * var13 >> 12;
                        var9 = var7[1] * var12 + var11[1] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field2758[var2 + -1];
                    var8 = var14[2];
                    var10 = var14[3];
                    var9 = var14[1];
                }
                int var15 = var10 >> 4;
                int var16 = var9 >> 4;
                int var17 = var8 >> 4;
                if (~var17 <= -1) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (~var16 <= -1) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                this.field2769[var3] = class57.method389(var15, class57.method389(var16 << 16, var17 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class143() {
        super(1, false);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)V")
    private final void method947(int arg0, int arg1) {
        if (arg0 != 27209) {
            this.method947(37, -78);
        }
        ++field2767;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field2758 = new int[4][4];
                                    this.field2758[0][1] = 0;
                                    this.field2758[0][3] = 0;
                                    this.field2758[1][1] = 4096;
                                    this.field2758[0][2] = 4096;
                                    this.field2758[1][3] = 0;
                                    this.field2758[1][2] = 4096;
                                    this.field2758[2][2] = 4096;
                                    this.field2758[2][3] = 0;
                                    this.field2758[2][1] = 4096;
                                    this.field2758[3][2] = 0;
                                    this.field2758[3][3] = 0;
                                    this.field2758[3][1] = 4096;
                                    this.field2758[0][0] = 2048;
                                    this.field2758[1][0] = 2867;
                                    this.field2758[2][0] = 3276;
                                    this.field2758[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field2758 = new int[16][4];
                                this.field2758[0][0] = 0;
                                this.field2758[0][2] = 192;
                                this.field2758[1][2] = 449;
                                this.field2758[0][3] = 321;
                                this.field2758[0][1] = 80;
                                this.field2758[1][0] = 155;
                                this.field2758[1][1] = 321;
                                this.field2758[2][0] = 389;
                                this.field2758[2][2] = 690;
                                this.field2758[1][3] = 562;
                                this.field2758[2][3] = 803;
                                this.field2758[3][0] = 671;
                                this.field2758[2][1] = 578;
                                this.field2758[3][1] = 947;
                                this.field2758[4][1] = 1285;
                                this.field2758[3][2] = 995;
                                this.field2758[3][3] = 1140;
                                this.field2758[4][2] = 1397;
                                this.field2758[4][3] = 1509;
                                this.field2758[5][3] = 1413;
                                this.field2758[5][1] = 1525;
                                this.field2758[5][2] = 1429;
                                this.field2758[4][0] = 897;
                                this.field2758[6][2] = 1461;
                                this.field2758[6][1] = 1734;
                                this.field2758[6][3] = 1333;
                                this.field2758[7][2] = 1525;
                                this.field2758[7][1] = 1413;
                                this.field2758[7][3] = 1702;
                                this.field2758[8][3] = 2056;
                                this.field2758[9][3] = 2666;
                                this.field2758[10][3] = 3276;
                                this.field2758[8][1] = 1108;
                                this.field2758[8][2] = 1590;
                                this.field2758[9][2] = 2056;
                                this.field2758[5][0] = 1175;
                                this.field2758[11][3] = 3228;
                                this.field2758[12][3] = 3196;
                                this.field2758[6][0] = 1368;
                                this.field2758[7][0] = 1507;
                                this.field2758[8][0] = 1736;
                                this.field2758[9][1] = 1766;
                                this.field2758[10][2] = 2586;
                                this.field2758[13][3] = 3019;
                                this.field2758[9][0] = 2088;
                                this.field2758[10][1] = 2409;
                                this.field2758[10][0] = 2355;
                                this.field2758[11][1] = 3116;
                                this.field2758[11][0] = 2691;
                                this.field2758[12][1] = 3806;
                                this.field2758[11][2] = 3148;
                                this.field2758[12][2] = 3710;
                                this.field2758[14][3] = 3228;
                                this.field2758[15][3] = 2746;
                                this.field2758[13][1] = 3437;
                                this.field2758[14][1] = 3116;
                                this.field2758[12][0] = 3031;
                                this.field2758[15][1] = 2377;
                                this.field2758[13][0] = 3522;
                                this.field2758[14][0] = 3727;
                                this.field2758[13][2] = 3421;
                                this.field2758[14][2] = 3148;
                                this.field2758[15][2] = 2505;
                                this.field2758[15][0] = 4096;
                            }
                        } else {
                            this.field2758 = new int[6][4];
                            this.field2758[0][2] = 0;
                            this.field2758[1][2] = 0;
                            this.field2758[0][0] = 0;
                            this.field2758[1][0] = 1843;
                            this.field2758[2][0] = 2457;
                            this.field2758[3][0] = 2781;
                            this.field2758[0][3] = 0;
                            this.field2758[4][0] = 3481;
                            this.field2758[0][1] = 0;
                            this.field2758[1][1] = 0;
                            this.field2758[1][3] = 1493;
                            this.field2758[2][1] = 0;
                            this.field2758[2][2] = 0;
                            this.field2758[3][1] = 0;
                            this.field2758[4][1] = 546;
                            this.field2758[5][1] = 4096;
                            this.field2758[5][0] = 4096;
                            this.field2758[3][2] = 1124;
                            this.field2758[4][2] = 3084;
                            this.field2758[5][2] = 4096;
                            this.field2758[2][3] = 2939;
                            this.field2758[3][3] = 3565;
                            this.field2758[4][3] = 4031;
                            this.field2758[5][3] = 4096;
                        }
                    } else {
                        this.field2758 = new int[7][4];
                        this.field2758[0][3] = 4096;
                        this.field2758[0][0] = 0;
                        this.field2758[0][2] = 0;
                        this.field2758[1][3] = 4096;
                        this.field2758[1][0] = 663;
                        this.field2758[2][3] = 0;
                        this.field2758[1][2] = 4096;
                        this.field2758[2][0] = 1363;
                        this.field2758[3][0] = 2048;
                        this.field2758[4][0] = 2727;
                        this.field2758[3][3] = 0;
                        this.field2758[0][1] = 0;
                        this.field2758[1][1] = 0;
                        this.field2758[5][0] = 3411;
                        this.field2758[2][2] = 4096;
                        this.field2758[3][2] = 4096;
                        this.field2758[6][0] = 4096;
                        this.field2758[4][2] = 0;
                        this.field2758[2][1] = 0;
                        this.field2758[4][3] = 0;
                        this.field2758[3][1] = 4096;
                        this.field2758[5][3] = 4096;
                        this.field2758[6][3] = 4096;
                        this.field2758[5][2] = 0;
                        this.field2758[6][2] = 0;
                        this.field2758[4][1] = 4096;
                        this.field2758[5][1] = 4096;
                        this.field2758[6][1] = 0;
                    }
                } else {
                    this.field2758 = new int[8][4];
                    this.field2758[0][2] = 2602;
                    this.field2758[0][3] = 2361;
                    this.field2758[0][0] = 0;
                    this.field2758[1][3] = 1558;
                    this.field2758[2][3] = 1413;
                    this.field2758[1][0] = 2867;
                    this.field2758[0][1] = 2650;
                    this.field2758[1][1] = 2313;
                    this.field2758[2][1] = 2618;
                    this.field2758[2][0] = 3072;
                    this.field2758[3][3] = 947;
                    this.field2758[3][0] = 3276;
                    this.field2758[4][0] = 3481;
                    this.field2758[1][2] = 1799;
                    this.field2758[2][2] = 1734;
                    this.field2758[4][3] = 722;
                    this.field2758[5][0] = 3686;
                    this.field2758[3][1] = 2296;
                    this.field2758[3][2] = 1220;
                    this.field2758[6][0] = 3891;
                    this.field2758[5][3] = 1766;
                    this.field2758[7][0] = 4096;
                    this.field2758[6][3] = 915;
                    this.field2758[4][1] = 2072;
                    this.field2758[4][2] = 963;
                    this.field2758[5][1] = 2730;
                    this.field2758[5][2] = 2152;
                    this.field2758[6][2] = 1060;
                    this.field2758[7][2] = 1413;
                    this.field2758[7][3] = 1140;
                    this.field2758[6][1] = 2232;
                    this.field2758[7][1] = 1686;
                }
            } else {
                this.field2758 = new int[2][4];
                this.field2758[0][2] = 0;
                this.field2758[0][3] = 0;
                this.field2758[0][1] = 0;
                this.field2758[0][0] = 0;
                this.field2758[1][2] = 4096;
                this.field2758[1][1] = 4096;
                this.field2758[1][0] = 4096;
                this.field2758[1][3] = 4096;
            }
        }
    }
}
