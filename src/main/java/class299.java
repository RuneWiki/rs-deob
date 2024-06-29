import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class299 extends class83 {

    @OriginalMember(owner = "client!je", name = "L", descriptor = "[I")
    private int[] field4075 = new int[257];

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public static int field4077 = 0;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field4081 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    public static volatile int field4080 = 0;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "Lum;")
    public static class184 field4074;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "[[I")
    private int[][] field4076;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V", line = 7)
    private final void method1768(int arg0) {
        ++field4085;
        if (arg0 == 4) {
            int var2 = this.field4076.length;
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var6 > ~var2 && ~this.field4076[var6][0] >= ~var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var4 >= var2) {
                        int[] var7 = this.field4076[var2 - 1];
                        var8 = var7[2];
                        var9 = var7[3];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field4076[var4];
                        if (var4 > 0) {
                            int[] var12 = this.field4076[var4 + -1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                            int var14 = -var13 + 4096;
                            var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                            var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                            var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                        } else {
                            var9 = var11[3];
                            var10 = var11[1];
                            var8 = var11[2];
                        }
                    }
                    int var15 = var9 >> 4;
                    int var16 = var8 >> 4;
                    int var17 = var10 >> 4;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    if (~var15 <= -1) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (~var16 < -256) {
                        var16 = 255;
                    }
                    this.field4075[var3] = class392.method2441(var15, class392.method2441(var17 << 16, var16 << 8));
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V", line = 111)
    public final void method120(boolean arg0) {
        ++field4082;
        if (this.field4076 == null) {
            this.method1770(4432, 1);
        }
        this.method1768(4);
        if (arg0) {
            this.field4075 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V", line = 125)
    public static final void method1769(int arg0) {
        ++field4078;
        if (~class248.field3339 != -1) {
            try {
                if (++class96.field1146 > 1500) {
                    if (class264.field3605 != null) {
                        class264.field3605.method1538((byte) 5);
                        class264.field3605 = null;
                    }
                    if (class305.field4137 >= 1) {
                        class297.field4046 = -5;
                        class248.field3339 = 0;
                        return;
                    }
                    class248.field3339 = 1;
                    if (class40.field404 != class275.field3729) {
                        class40.field404 = class275.field3729;
                    } else {
                        class40.field404 = class449.field6518;
                    }
                    class96.field1146 = 0;
                    ++class305.field4137;
                }
                if (class248.field3339 == 1) {
                    class77.field875 = class159.field2055.method2783(class40.field404, 0, class199.field2655);
                    class248.field3339 = 2;
                }
                if (~class248.field3339 == -3) {
                    if (class77.field875.field4123 == 2) {
                        throw new IOException();
                    }
                    if (~class77.field875.field4123 != -2) {
                        return;
                    }
                    class264.field3605 = new class278((Socket) class77.field875.field4126, class159.field2055);
                    class77.field875 = null;
                    class264.field3605.method1537(class281.field3857.field3406, false, class281.field3857.field3389, 0);
                    if (class281.field3855 != null) {
                        class281.field3855.method2153(-80);
                    }
                    if (class414.field5973 != null) {
                        class414.field5973.method2153(-55);
                    }
                    int var1 = class264.field3605.method1540(1824);
                    if (class281.field3855 != null) {
                        class281.field3855.method2153(-59);
                    }
                    if (class414.field5973 != null) {
                        class414.field5973.method2153(-81);
                    }
                    if (var1 != 101) {
                        class248.field3339 = 0;
                        class297.field4046 = var1;
                        class264.field3605.method1538((byte) 5);
                        class264.field3605 = null;
                        return;
                    }
                    class248.field3339 = 3;
                }
                if (~class248.field3339 == -4) {
                    if (~class264.field3605.method1539(-32565) <= -3) {
                        int var2 = class264.field3605.method1540(1824) << 8 | class264.field3605.method1540(1824);
                        class188.method1015(-26378, var2);
                        if (class281.field3854 == -1) {
                            class297.field4046 = 6;
                            class248.field3339 = 0;
                            class264.field3605.method1538((byte) 5);
                            class264.field3605 = null;
                        } else {
                            class248.field3339 = 0;
                            class264.field3605.method1538((byte) 5);
                            class264.field3605 = null;
                            class385.method2387(-3);
                        }
                    }
                } else if (arg0 > -63) {
                    method1769(-72);
                }
            } catch (IOException var3) {
                if (class264.field3605 != null) {
                    class264.field3605.method1538((byte) 5);
                    class264.field3605 = null;
                }
                if (~class305.field4137 <= -2) {
                    class297.field4046 = -4;
                    class248.field3339 = 0;
                } else {
                    class248.field3339 = 1;
                    if (~class40.field404 == ~class275.field3729) {
                        class40.field404 = class449.field6518;
                    } else {
                        class40.field404 = class275.field3729;
                    }
                    ++class305.field4137;
                    class96.field1146 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(II)V", line = 271)
    private final void method1770(int arg0, int arg1) {
        ++field4079;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4076 = new int[4][4];
                                this.field4076[0][0] = 2048;
                                this.field4076[0][2] = 4096;
                                this.field4076[0][1] = 0;
                                this.field4076[0][3] = 0;
                                this.field4076[1][0] = 2867;
                                this.field4076[1][2] = 4096;
                                this.field4076[1][1] = 4096;
                                this.field4076[1][3] = 0;
                                this.field4076[2][1] = 4096;
                                this.field4076[2][3] = 0;
                                this.field4076[2][2] = 4096;
                                this.field4076[2][0] = 3276;
                                this.field4076[3][3] = 0;
                                this.field4076[3][0] = 4096;
                                this.field4076[3][2] = 0;
                                this.field4076[3][1] = 4096;
                            } else {
                                this.field4076 = new int[16][4];
                                this.field4076[0][2] = 192;
                                this.field4076[0][3] = 321;
                                this.field4076[0][1] = 80;
                                this.field4076[0][0] = 0;
                                this.field4076[1][1] = 321;
                                this.field4076[1][2] = 449;
                                this.field4076[1][3] = 562;
                                this.field4076[1][0] = 155;
                                this.field4076[2][1] = 578;
                                this.field4076[2][0] = 389;
                                this.field4076[2][2] = 690;
                                this.field4076[2][3] = 803;
                                this.field4076[3][3] = 1140;
                                this.field4076[3][2] = 995;
                                this.field4076[3][1] = 947;
                                this.field4076[3][0] = 671;
                                this.field4076[4][2] = 1397;
                                this.field4076[4][3] = 1509;
                                this.field4076[4][1] = 1285;
                                this.field4076[4][0] = 897;
                                this.field4076[5][3] = 1413;
                                this.field4076[5][1] = 1525;
                                this.field4076[5][0] = 1175;
                                this.field4076[5][2] = 1429;
                                this.field4076[6][3] = 1333;
                                this.field4076[6][2] = 1461;
                                this.field4076[6][1] = 1734;
                                this.field4076[6][0] = 1368;
                                this.field4076[7][1] = 1413;
                                this.field4076[7][3] = 1702;
                                this.field4076[7][0] = 1507;
                                this.field4076[7][2] = 1525;
                                this.field4076[8][0] = 1736;
                                this.field4076[8][1] = 1108;
                                this.field4076[8][2] = 1590;
                                this.field4076[8][3] = 2056;
                                this.field4076[9][2] = 2056;
                                this.field4076[9][3] = 2666;
                                this.field4076[9][1] = 1766;
                                this.field4076[9][0] = 2088;
                                this.field4076[10][2] = 2586;
                                this.field4076[10][1] = 2409;
                                this.field4076[10][0] = 2355;
                                this.field4076[10][3] = 3276;
                                this.field4076[11][0] = 2691;
                                this.field4076[11][1] = 3116;
                                this.field4076[11][3] = 3228;
                                this.field4076[11][2] = 3148;
                                this.field4076[12][0] = 3031;
                                this.field4076[12][1] = 3806;
                                this.field4076[12][2] = 3710;
                                this.field4076[12][3] = 3196;
                                this.field4076[13][2] = 3421;
                                this.field4076[13][3] = 3019;
                                this.field4076[13][0] = 3522;
                                this.field4076[13][1] = 3437;
                                this.field4076[14][1] = 3116;
                                this.field4076[14][3] = 3228;
                                this.field4076[14][2] = 3148;
                                this.field4076[14][0] = 3727;
                                this.field4076[15][0] = 4096;
                                this.field4076[15][3] = 2746;
                                this.field4076[15][1] = 2377;
                                this.field4076[15][2] = 2505;
                            }
                        } else {
                            this.field4076 = new int[6][4];
                            this.field4076[0][3] = 0;
                            this.field4076[0][2] = 0;
                            this.field4076[0][1] = 0;
                            this.field4076[0][0] = 0;
                            this.field4076[1][2] = 0;
                            this.field4076[1][0] = 1843;
                            this.field4076[1][1] = 0;
                            this.field4076[1][3] = 1493;
                            this.field4076[2][2] = 0;
                            this.field4076[2][3] = 2939;
                            this.field4076[2][0] = 2457;
                            this.field4076[2][1] = 0;
                            this.field4076[3][2] = 1124;
                            this.field4076[3][3] = 3565;
                            this.field4076[3][0] = 2781;
                            this.field4076[3][1] = 0;
                            this.field4076[4][1] = 546;
                            this.field4076[4][3] = 4031;
                            this.field4076[4][2] = 3084;
                            this.field4076[4][0] = 3481;
                            this.field4076[5][1] = 4096;
                            this.field4076[5][0] = 4096;
                            this.field4076[5][3] = 4096;
                            this.field4076[5][2] = 4096;
                        }
                    } else {
                        this.field4076 = new int[7][4];
                        this.field4076[0][0] = 0;
                        this.field4076[0][1] = 0;
                        this.field4076[0][2] = 0;
                        this.field4076[0][3] = 4096;
                        this.field4076[1][0] = 663;
                        this.field4076[1][2] = 4096;
                        this.field4076[1][3] = 4096;
                        this.field4076[1][1] = 0;
                        this.field4076[2][0] = 1363;
                        this.field4076[2][3] = 0;
                        this.field4076[2][1] = 0;
                        this.field4076[2][2] = 4096;
                        this.field4076[3][0] = 2048;
                        this.field4076[3][1] = 4096;
                        this.field4076[3][2] = 4096;
                        this.field4076[3][3] = 0;
                        this.field4076[4][3] = 0;
                        this.field4076[4][2] = 0;
                        this.field4076[4][0] = 2727;
                        this.field4076[4][1] = 4096;
                        this.field4076[5][3] = 4096;
                        this.field4076[5][2] = 0;
                        this.field4076[5][0] = 3411;
                        this.field4076[5][1] = 4096;
                        this.field4076[6][0] = 4096;
                        this.field4076[6][1] = 0;
                        this.field4076[6][3] = 4096;
                        this.field4076[6][2] = 0;
                    }
                } else {
                    this.field4076 = new int[8][4];
                    this.field4076[0][3] = 2361;
                    this.field4076[0][0] = 0;
                    this.field4076[0][2] = 2602;
                    this.field4076[0][1] = 2650;
                    this.field4076[1][0] = 2867;
                    this.field4076[1][2] = 1799;
                    this.field4076[1][3] = 1558;
                    this.field4076[1][1] = 2313;
                    this.field4076[2][1] = 2618;
                    this.field4076[2][0] = 3072;
                    this.field4076[2][2] = 1734;
                    this.field4076[2][3] = 1413;
                    this.field4076[3][3] = 947;
                    this.field4076[3][1] = 2296;
                    this.field4076[3][0] = 3276;
                    this.field4076[3][2] = 1220;
                    this.field4076[4][3] = 722;
                    this.field4076[4][0] = 3481;
                    this.field4076[4][1] = 2072;
                    this.field4076[4][2] = 963;
                    this.field4076[5][3] = 1766;
                    this.field4076[5][1] = 2730;
                    this.field4076[5][0] = 3686;
                    this.field4076[5][2] = 2152;
                    this.field4076[6][1] = 2232;
                    this.field4076[6][3] = 915;
                    this.field4076[6][0] = 3891;
                    this.field4076[6][2] = 1060;
                    this.field4076[7][3] = 1140;
                    this.field4076[7][1] = 1686;
                    this.field4076[7][2] = 1413;
                    this.field4076[7][0] = 4096;
                }
            } else {
                this.field4076 = new int[2][4];
                this.field4076[0][0] = 0;
                this.field4076[0][3] = 0;
                this.field4076[0][1] = 0;
                this.field4076[0][2] = 0;
                this.field4076[1][2] = 4096;
                this.field4076[1][0] = 4096;
                this.field4076[1][3] = 4096;
                this.field4076[1][1] = 4096;
            }
        }
        if (arg0 != 4432) {
            this.method1770(-122, 110);
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V", line = 523)
    public static void method1771(int arg0) {
        field4074 = null;
        if (arg0 != 4096) {
            method1769(63);
        }
        field4081 = null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 581)
    public class299() {
        super(1, false);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBLtq;)V", line = 543)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        if (~arg0 == -1) {
            int var4 = arg2.method1350(31351);
            if (var4 != 0) {
                this.method1770(4432, var4);
            } else {
                this.field4076 = new int[arg2.method1350(31351)][4];
                for (int var5 = 0; ~var5 > ~this.field4076.length; ++var5) {
                    this.field4076[var5][0] = arg2.method1374(-2);
                    this.field4076[var5][1] = arg2.method1350(31351) << 4;
                    this.field4076[var5][2] = arg2.method1350(31351) << 4;
                    this.field4076[var5][3] = arg2.method1350(31351) << 4;
                }
            }
        }
        ++field4084;
        int var6 = -6 / ((-27 - arg1) / 50);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)[[I", line = 585)
    public final int[][] method21(boolean arg0, int arg1) {
        ++field4083;
        if (!arg0) {
            this.method1770(-89, -123);
        }
        int[][] var3 = super.field927.method1774((byte) 106, arg1);
        if (super.field927.field4104) {
            int[] var4 = this.method451(0, 88, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class420.field6139; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4075[var9];
                var5[var8] = class262.method1461(var10 >> 12, 4080);
                var6[var8] = class262.method1461(var10 >> 4, 4080);
                var7[var8] = class262.method1461(4080, var10 << 4);
            }
        }
        return var3;
    }
}
