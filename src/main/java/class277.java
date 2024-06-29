import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class277 extends class74 {

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "[I")
    private int[] field4365 = new int[257];

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "I")
    public static int field4366 = 0;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    public static int field4362 = 0;

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "[B")
    public static byte[] field4368;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!rk", name = "Y", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!rk", name = "Z", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "Lne;")
    public static class52 field4358;

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "[[I")
    private int[][] field4367;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        ++field4361;
        int[][] var3 = super.field1248.method269(false, arg0);
        if (super.field1248.field550) {
            int[] var4 = this.method590(0, 0, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class178.field2662 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field4365[var9];
                var5[var8] = class3.method48(var10, 16711680) >> 12;
                var6[var8] = class3.method48(var10, 65280) >> 4;
                var7[var8] = class3.method48(255, var10) << 4;
            }
        }
        if (arg1 >= -112) {
            this.method493(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        if (this.field4367 == null) {
            this.method1858(-115, 1);
        }
        if (!arg0) {
            this.method1860(-89);
            ++field4364;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
    private final void method1858(int arg0, int arg1) {
        ++field4359;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4367 = new int[4][4];
                                this.field4367[0][3] = 0;
                                this.field4367[0][0] = 2048;
                                this.field4367[0][1] = 0;
                                this.field4367[0][2] = 4096;
                                this.field4367[1][1] = 4096;
                                this.field4367[1][0] = 2867;
                                this.field4367[1][2] = 4096;
                                this.field4367[2][1] = 4096;
                                this.field4367[2][0] = 3276;
                                this.field4367[3][1] = 4096;
                                this.field4367[3][0] = 4096;
                                this.field4367[1][3] = 0;
                                this.field4367[2][3] = 0;
                                this.field4367[2][2] = 4096;
                                this.field4367[3][2] = 0;
                                this.field4367[3][3] = 0;
                            } else {
                                this.field4367 = new int[16][4];
                                this.field4367[0][2] = 192;
                                this.field4367[0][1] = 80;
                                this.field4367[1][2] = 449;
                                this.field4367[0][3] = 321;
                                this.field4367[2][2] = 690;
                                this.field4367[3][2] = 995;
                                this.field4367[1][1] = 321;
                                this.field4367[2][1] = 578;
                                this.field4367[0][0] = 0;
                                this.field4367[4][2] = 1397;
                                this.field4367[3][1] = 947;
                                this.field4367[4][1] = 1285;
                                this.field4367[1][3] = 562;
                                this.field4367[5][1] = 1525;
                                this.field4367[5][2] = 1429;
                                this.field4367[6][1] = 1734;
                                this.field4367[7][1] = 1413;
                                this.field4367[6][2] = 1461;
                                this.field4367[8][1] = 1108;
                                this.field4367[1][0] = 155;
                                this.field4367[9][1] = 1766;
                                this.field4367[2][3] = 803;
                                this.field4367[10][1] = 2409;
                                this.field4367[2][0] = 389;
                                this.field4367[7][2] = 1525;
                                this.field4367[11][1] = 3116;
                                this.field4367[12][1] = 3806;
                                this.field4367[3][3] = 1140;
                                this.field4367[8][2] = 1590;
                                this.field4367[3][0] = 671;
                                this.field4367[4][0] = 897;
                                this.field4367[5][0] = 1175;
                                this.field4367[13][1] = 3437;
                                this.field4367[4][3] = 1509;
                                this.field4367[5][3] = 1413;
                                this.field4367[6][3] = 1333;
                                this.field4367[6][0] = 1368;
                                this.field4367[7][0] = 1507;
                                this.field4367[14][1] = 3116;
                                this.field4367[9][2] = 2056;
                                this.field4367[8][0] = 1736;
                                this.field4367[7][3] = 1702;
                                this.field4367[8][3] = 2056;
                                this.field4367[10][2] = 2586;
                                this.field4367[9][3] = 2666;
                                this.field4367[15][1] = 2377;
                                this.field4367[10][3] = 3276;
                                this.field4367[9][0] = 2088;
                                this.field4367[10][0] = 2355;
                                this.field4367[11][3] = 3228;
                                this.field4367[12][3] = 3196;
                                this.field4367[13][3] = 3019;
                                this.field4367[11][0] = 2691;
                                this.field4367[14][3] = 3228;
                                this.field4367[12][0] = 3031;
                                this.field4367[13][0] = 3522;
                                this.field4367[14][0] = 3727;
                                this.field4367[11][2] = 3148;
                                this.field4367[15][0] = 4096;
                                this.field4367[15][3] = 2746;
                                this.field4367[12][2] = 3710;
                                this.field4367[13][2] = 3421;
                                this.field4367[14][2] = 3148;
                                this.field4367[15][2] = 2505;
                            }
                        } else {
                            this.field4367 = new int[6][4];
                            this.field4367[0][0] = 0;
                            this.field4367[0][3] = 0;
                            this.field4367[0][2] = 0;
                            this.field4367[1][0] = 1843;
                            this.field4367[1][3] = 1493;
                            this.field4367[2][3] = 2939;
                            this.field4367[0][1] = 0;
                            this.field4367[3][3] = 3565;
                            this.field4367[1][2] = 0;
                            this.field4367[4][3] = 4031;
                            this.field4367[2][0] = 2457;
                            this.field4367[5][3] = 4096;
                            this.field4367[2][2] = 0;
                            this.field4367[1][1] = 0;
                            this.field4367[3][2] = 1124;
                            this.field4367[2][1] = 0;
                            this.field4367[4][2] = 3084;
                            this.field4367[3][0] = 2781;
                            this.field4367[4][0] = 3481;
                            this.field4367[5][0] = 4096;
                            this.field4367[3][1] = 0;
                            this.field4367[5][2] = 4096;
                            this.field4367[4][1] = 546;
                            this.field4367[5][1] = 4096;
                        }
                    } else {
                        this.field4367 = new int[7][4];
                        this.field4367[0][0] = 0;
                        this.field4367[0][2] = 0;
                        this.field4367[0][1] = 0;
                        this.field4367[1][1] = 0;
                        this.field4367[0][3] = 4096;
                        this.field4367[1][0] = 663;
                        this.field4367[1][3] = 4096;
                        this.field4367[2][1] = 0;
                        this.field4367[3][1] = 4096;
                        this.field4367[4][1] = 4096;
                        this.field4367[5][1] = 4096;
                        this.field4367[1][2] = 4096;
                        this.field4367[6][1] = 0;
                        this.field4367[2][0] = 1363;
                        this.field4367[2][3] = 0;
                        this.field4367[3][3] = 0;
                        this.field4367[4][3] = 0;
                        this.field4367[5][3] = 4096;
                        this.field4367[6][3] = 4096;
                        this.field4367[3][0] = 2048;
                        this.field4367[4][0] = 2727;
                        this.field4367[5][0] = 3411;
                        this.field4367[2][2] = 4096;
                        this.field4367[3][2] = 4096;
                        this.field4367[4][2] = 0;
                        this.field4367[5][2] = 0;
                        this.field4367[6][0] = 4096;
                        this.field4367[6][2] = 0;
                    }
                } else {
                    this.field4367 = new int[8][4];
                    this.field4367[0][1] = 2650;
                    this.field4367[1][1] = 2313;
                    this.field4367[2][1] = 2618;
                    this.field4367[0][0] = 0;
                    this.field4367[0][2] = 2602;
                    this.field4367[3][1] = 2296;
                    this.field4367[1][2] = 1799;
                    this.field4367[0][3] = 2361;
                    this.field4367[1][0] = 2867;
                    this.field4367[4][1] = 2072;
                    this.field4367[2][2] = 1734;
                    this.field4367[3][2] = 1220;
                    this.field4367[2][0] = 3072;
                    this.field4367[3][0] = 3276;
                    this.field4367[4][2] = 963;
                    this.field4367[1][3] = 1558;
                    this.field4367[2][3] = 1413;
                    this.field4367[4][0] = 3481;
                    this.field4367[5][0] = 3686;
                    this.field4367[3][3] = 947;
                    this.field4367[5][2] = 2152;
                    this.field4367[6][2] = 1060;
                    this.field4367[6][0] = 3891;
                    this.field4367[4][3] = 722;
                    this.field4367[5][1] = 2730;
                    this.field4367[5][3] = 1766;
                    this.field4367[6][1] = 2232;
                    this.field4367[7][2] = 1413;
                    this.field4367[7][1] = 1686;
                    this.field4367[6][3] = 915;
                    this.field4367[7][3] = 1140;
                    this.field4367[7][0] = 4096;
                }
            } else {
                this.field4367 = new int[2][4];
                this.field4367[0][2] = 0;
                this.field4367[1][2] = 4096;
                this.field4367[0][3] = 0;
                this.field4367[0][0] = 0;
                this.field4367[0][1] = 0;
                this.field4367[1][0] = 4096;
                this.field4367[1][3] = 4096;
                this.field4367[1][1] = 4096;
            }
        }
        int var4 = -63 / ((-58 - arg0) / 50);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field4360;
        if (arg0 == -79) {
            if (~arg2 == -1) {
                int var4 = arg1.method333((byte) -59);
                if (~var4 != -1) {
                    this.method1858(23, var4);
                } else {
                    this.field4367 = new int[arg1.method333((byte) -59)][4];
                    for (int var5 = 0; ~this.field4367.length < ~var5; ++var5) {
                        this.field4367[var5][0] = arg1.method293(-49);
                        this.field4367[var5][1] = arg1.method333((byte) -59) << 4;
                        this.field4367[var5][2] = arg1.method333((byte) -59) << 4;
                        this.field4367[var5][3] = arg1.method333((byte) -59) << 4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V")
    public static void method1859(byte arg0) {
        int var1 = 107 % ((arg0 - 11) / 46);
        field4358 = null;
        field4368 = null;
    }

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "(I)V")
    private final void method1860(int arg0) {
        int var2 = 47 % ((-12 - arg0) / 58);
        ++field4357;
        int var3 = this.field4367.length;
        if (var3 > 0) {
            for (int var4 = 0; ~var4 > -258; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; var7 < var3 && ~var6 <= ~this.field4367[var7][0]; ++var7) {
                    ++var5;
                }
                int var12;
                int var13;
                int var14;
                if (~var3 < ~var5) {
                    int[] var8 = this.field4367[var5];
                    if (var5 > 0) {
                        int[] var9 = this.field4367[var5 + -1];
                        int var10 = (-var9[0] + var6 << 12) / (var8[0] + -var9[0]);
                        int var11 = -var10 + 4096;
                        var12 = var8[2] * var10 + var9[2] * var11 >> 12;
                        var13 = var8[1] * var10 + var9[1] * var11 >> 12;
                        var14 = var8[3] * var10 - -(var9[3] * var11) >> 12;
                    } else {
                        var13 = var8[1];
                        var14 = var8[3];
                        var12 = var8[2];
                    }
                } else {
                    int[] var15 = this.field4367[var3 + -1];
                    var14 = var15[3];
                    var12 = var15[2];
                    var13 = var15[1];
                }
                int var16 = var14 >> 4;
                int var17 = var12 >> 4;
                if (~var17 > -1) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                int var18 = var13 >> 4;
                if (var18 >= 0) {
                    if (~var18 < -256) {
                        var18 = 255;
                    }
                } else {
                    var18 = 0;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                this.field4365[var4] = class115.method840(class115.method840(var18 << 16, var17 << 8), var16);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class277() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1861(int arg0, String arg1) {
        if (arg0 != -64) {
            method1861(24, (String) null);
        }
        int var2 = arg1.length();
        ++field4370;
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; ~var2 < ~var5; ++var5) {
            char var6 = arg1.charAt(var5);
            if (~var4 == -1) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class164.method1093(-126, var6);
            }
            if (!Character.isLetter(var6)) {
                if (~var6 != -47 && ~var6 != -64 && ~var6 != -34) {
                    if (!Character.isSpaceChar(var6)) {
                        var4 = 1;
                    } else if (~var4 != -3) {
                        var4 = 1;
                    }
                } else {
                    var4 = 2;
                }
            } else {
                var4 = 0;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    static {
        int var0 = 0;
        field4368 = new byte[32896];
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; var1 >= var2; ++var2) {
                field4368[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 - -65535)) / 65535.0F))));
            }
        }
    }
}
