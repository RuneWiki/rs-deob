import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class265 extends class124 {

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "[I")
    private int[] field4693 = new int[257];

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "Lpk;")
    public static class66 field4688 = new class66(128);

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "[[I")
    private int[][] field4692;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IB)V")
    private final void method1817(int arg0, byte arg1) {
        ++field4689;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4692 = new int[4][4];
                                this.field4692[0][1] = 0;
                                this.field4692[1][1] = 4096;
                                this.field4692[0][2] = 4096;
                                this.field4692[0][0] = 2048;
                                this.field4692[0][3] = 0;
                                this.field4692[1][2] = 4096;
                                this.field4692[2][1] = 4096;
                                this.field4692[1][0] = 2867;
                                this.field4692[2][2] = 4096;
                                this.field4692[2][0] = 3276;
                                this.field4692[3][2] = 0;
                                this.field4692[3][1] = 4096;
                                this.field4692[1][3] = 0;
                                this.field4692[2][3] = 0;
                                this.field4692[3][0] = 4096;
                                this.field4692[3][3] = 0;
                            } else {
                                this.field4692 = new int[16][4];
                                this.field4692[0][2] = 192;
                                this.field4692[0][1] = 80;
                                this.field4692[0][3] = 321;
                                this.field4692[0][0] = 0;
                                this.field4692[1][3] = 562;
                                this.field4692[1][2] = 449;
                                this.field4692[1][0] = 155;
                                this.field4692[2][0] = 389;
                                this.field4692[2][3] = 803;
                                this.field4692[3][0] = 671;
                                this.field4692[2][2] = 690;
                                this.field4692[4][0] = 897;
                                this.field4692[3][3] = 1140;
                                this.field4692[3][2] = 995;
                                this.field4692[1][1] = 321;
                                this.field4692[4][2] = 1397;
                                this.field4692[5][0] = 1175;
                                this.field4692[4][3] = 1509;
                                this.field4692[6][0] = 1368;
                                this.field4692[5][3] = 1413;
                                this.field4692[6][3] = 1333;
                                this.field4692[7][0] = 1507;
                                this.field4692[7][3] = 1702;
                                this.field4692[8][0] = 1736;
                                this.field4692[8][3] = 2056;
                                this.field4692[2][1] = 578;
                                this.field4692[3][1] = 947;
                                this.field4692[9][3] = 2666;
                                this.field4692[10][3] = 3276;
                                this.field4692[9][0] = 2088;
                                this.field4692[11][3] = 3228;
                                this.field4692[4][1] = 1285;
                                this.field4692[12][3] = 3196;
                                this.field4692[13][3] = 3019;
                                this.field4692[5][2] = 1429;
                                this.field4692[10][0] = 2355;
                                this.field4692[5][1] = 1525;
                                this.field4692[6][2] = 1461;
                                this.field4692[14][3] = 3228;
                                this.field4692[15][3] = 2746;
                                this.field4692[6][1] = 1734;
                                this.field4692[7][2] = 1525;
                                this.field4692[7][1] = 1413;
                                this.field4692[8][1] = 1108;
                                this.field4692[11][0] = 2691;
                                this.field4692[8][2] = 1590;
                                this.field4692[9][1] = 1766;
                                this.field4692[9][2] = 2056;
                                this.field4692[10][1] = 2409;
                                this.field4692[12][0] = 3031;
                                this.field4692[10][2] = 2586;
                                this.field4692[11][1] = 3116;
                                this.field4692[12][1] = 3806;
                                this.field4692[13][1] = 3437;
                                this.field4692[14][1] = 3116;
                                this.field4692[11][2] = 3148;
                                this.field4692[12][2] = 3710;
                                this.field4692[13][2] = 3421;
                                this.field4692[14][2] = 3148;
                                this.field4692[15][1] = 2377;
                                this.field4692[13][0] = 3522;
                                this.field4692[15][2] = 2505;
                                this.field4692[14][0] = 3727;
                                this.field4692[15][0] = 4096;
                            }
                        } else {
                            this.field4692 = new int[6][4];
                            this.field4692[0][0] = 0;
                            this.field4692[0][1] = 0;
                            this.field4692[0][3] = 0;
                            this.field4692[0][2] = 0;
                            this.field4692[1][0] = 1843;
                            this.field4692[1][1] = 0;
                            this.field4692[2][0] = 2457;
                            this.field4692[2][1] = 0;
                            this.field4692[1][2] = 0;
                            this.field4692[1][3] = 1493;
                            this.field4692[2][3] = 2939;
                            this.field4692[2][2] = 0;
                            this.field4692[3][2] = 1124;
                            this.field4692[4][2] = 3084;
                            this.field4692[3][0] = 2781;
                            this.field4692[5][2] = 4096;
                            this.field4692[3][3] = 3565;
                            this.field4692[4][3] = 4031;
                            this.field4692[4][0] = 3481;
                            this.field4692[5][0] = 4096;
                            this.field4692[5][3] = 4096;
                            this.field4692[3][1] = 0;
                            this.field4692[4][1] = 546;
                            this.field4692[5][1] = 4096;
                        }
                    } else {
                        this.field4692 = new int[7][4];
                        this.field4692[0][1] = 0;
                        this.field4692[0][2] = 0;
                        this.field4692[0][0] = 0;
                        this.field4692[1][0] = 663;
                        this.field4692[1][1] = 0;
                        this.field4692[2][0] = 1363;
                        this.field4692[1][2] = 4096;
                        this.field4692[2][2] = 4096;
                        this.field4692[3][0] = 2048;
                        this.field4692[3][2] = 4096;
                        this.field4692[0][3] = 4096;
                        this.field4692[2][1] = 0;
                        this.field4692[3][1] = 4096;
                        this.field4692[4][1] = 4096;
                        this.field4692[4][2] = 0;
                        this.field4692[4][0] = 2727;
                        this.field4692[5][1] = 4096;
                        this.field4692[1][3] = 4096;
                        this.field4692[2][3] = 0;
                        this.field4692[5][2] = 0;
                        this.field4692[6][2] = 0;
                        this.field4692[6][1] = 0;
                        this.field4692[5][0] = 3411;
                        this.field4692[3][3] = 0;
                        this.field4692[6][0] = 4096;
                        this.field4692[4][3] = 0;
                        this.field4692[5][3] = 4096;
                        this.field4692[6][3] = 4096;
                    }
                } else {
                    this.field4692 = new int[8][4];
                    this.field4692[0][3] = 2361;
                    this.field4692[0][1] = 2650;
                    this.field4692[1][3] = 1558;
                    this.field4692[1][1] = 2313;
                    this.field4692[0][2] = 2602;
                    this.field4692[0][0] = 0;
                    this.field4692[1][2] = 1799;
                    this.field4692[2][3] = 1413;
                    this.field4692[3][3] = 947;
                    this.field4692[2][1] = 2618;
                    this.field4692[3][1] = 2296;
                    this.field4692[1][0] = 2867;
                    this.field4692[4][3] = 722;
                    this.field4692[2][0] = 3072;
                    this.field4692[2][2] = 1734;
                    this.field4692[5][3] = 1766;
                    this.field4692[3][2] = 1220;
                    this.field4692[4][1] = 2072;
                    this.field4692[4][2] = 963;
                    this.field4692[6][3] = 915;
                    this.field4692[5][2] = 2152;
                    this.field4692[3][0] = 3276;
                    this.field4692[7][3] = 1140;
                    this.field4692[6][2] = 1060;
                    this.field4692[5][1] = 2730;
                    this.field4692[7][2] = 1413;
                    this.field4692[6][1] = 2232;
                    this.field4692[7][1] = 1686;
                    this.field4692[4][0] = 3481;
                    this.field4692[5][0] = 3686;
                    this.field4692[6][0] = 3891;
                    this.field4692[7][0] = 4096;
                }
            } else {
                this.field4692 = new int[2][4];
                this.field4692[0][1] = 0;
                this.field4692[1][1] = 4096;
                this.field4692[0][3] = 0;
                this.field4692[1][3] = 4096;
                this.field4692[0][2] = 0;
                this.field4692[0][0] = 0;
                this.field4692[1][0] = 4096;
                this.field4692[1][2] = 4096;
            }
        }
        if (arg1 > -96) {
            this.field4692 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V")
    public static final void method1818(byte arg0) {
        ++field4690;
        if (arg0 != 47) {
            field4688 = null;
        }
        int var1 = class256.field4548 >> 7;
        if (class269.field4751 < 128) {
            class269.field4751 = 128;
        }
        if (class269.field4751 > 383) {
            class269.field4751 = 383;
        }
        int var2 = class65.field1142 >> 7;
        int var3 = 0;
        class65.field1138 &= 2047;
        int var4 = class222.method1546(class261.field4598, class256.field4548, class65.field1142, 247425607);
        if (var1 > 3 && var2 > 3 && var1 < 100 && ~var2 > -101) {
            for (int var5 = var1 + -4; var1 + 4 >= var5; ++var5) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
                    int var7 = class261.field4598;
                    if (~var7 > -4 && ~(class270.field4755[1][var5][var6] & 2) == -3) {
                        ++var7;
                    }
                    int var8 = var4 - class12.field143[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (~var9 >= ~class40.field723) {
            if (var9 < class40.field723) {
                class40.field723 += (-class40.field723 + var9) / 80;
                return;
            }
        } else {
            class40.field723 += (-class40.field723 + var9) / 24;
        }
    }

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "(I)V")
    public static final void method1819(int arg0) {
        if (arg0 != -17169) {
            field4688 = null;
        }
        ++field4694;
        class262.field4634.method992(arg0 ^ 17166);
        class54.field1005.method992(-31);
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class265() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(BII)I")
    public static final int method1820(byte arg0, int arg1, int arg2) {
        ++field4687;
        if (arg1 == -1) {
            return 12345678;
        } else {
            int var3 = (arg1 & 127) * arg2 >> 7;
            if (arg0 <= 13) {
                field4688 = null;
            }
            if (~var3 <= -3) {
                if (~var3 < -127) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (65408 & arg1) + var3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (arg0 != -1) {
            this.field4693 = null;
        }
        if (this.field4692 == null) {
            this.method1817(1, (byte) -99);
        }
        ++field4698;
        this.method1822((byte) 126);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
    public static void method1821(boolean arg0) {
        field4688 = null;
        if (!arg0) {
            field4688 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (!arg2) {
            method1820((byte) 106, -90, -110);
        }
        if (~arg0 == -1) {
            int var4 = arg1.method1580(-102);
            if (var4 != 0) {
                this.method1817(var4, (byte) -128);
            } else {
                this.field4692 = new int[arg1.method1580(-45)][4];
                for (int var5 = 0; this.field4692.length > var5; ++var5) {
                    this.field4692[var5][0] = arg1.method1593(true);
                    this.field4692[var5][1] = arg1.method1580(-22) << 4;
                    this.field4692[var5][2] = arg1.method1580(-36) << 4;
                    this.field4692[var5][3] = arg1.method1580(-61) << 4;
                }
            }
        }
        ++field4691;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        int[][] var3 = super.field2053.method1775((byte) -103, arg0);
        if (arg1 != -7) {
            return null;
        } else {
            if (super.field2053.field4558) {
                int[] var4 = this.method844(0, 61, arg0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; ~class64.field1132 < ~var8; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field4693[var9];
                    var5[var8] = class167.method1128(16711680, var10) >> 12;
                    var6[var8] = class167.method1128(var10 >> 4, 4080);
                    var7[var8] = class167.method1128(255, var10) << 4;
                }
            }
            ++field4686;
            return var3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)V")
    private final void method1822(byte arg0) {
        ++field4697;
        if (arg0 <= 123) {
            this.field4693 = null;
        }
        int var2 = this.field4692.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && this.field4692[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (~var4 > ~var2) {
                    int[] var7 = this.field4692[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field4692[var4 + -1];
                        int var9 = (var5 - var8[0] << 12) / (var7[0] + -var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[2] * var9 + var8[2] * var10 >> 12;
                        var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var13 = var7[3] * var9 + var8[3] * var10 >> 12;
                    } else {
                        var12 = var7[1];
                        var11 = var7[2];
                        var13 = var7[3];
                    }
                } else {
                    int[] var14 = this.field4692[var2 + -1];
                    var12 = var14[1];
                    var11 = var14[2];
                    var13 = var14[3];
                }
                int var15 = var13 >> 4;
                int var16 = var12 >> 4;
                int var17 = var11 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                if (~var16 <= -1) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field4693[var3] = class217.method1476(var15, class217.method1476(var17 << 8, var16 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lng;B)V")
    public static final void method1823(class121 arg0, byte arg1) {
        if (arg1 <= 69) {
            method1819(-77);
        }
        class255.field4525 = arg0;
        ++field4695;
    }
}
