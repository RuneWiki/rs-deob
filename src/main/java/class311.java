import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class311 extends class646 {

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "[I")
    private int[] field4308 = new int[257];

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "Leda;")
    public static class116 field4310 = new class116(89, -2);

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "[I")
    public static int[] field4317 = new int[8];

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "Leda;")
    public static class116 field4316 = new class116(42, 2);

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    public static int field4320 = 1407;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "[I")
    public static int[] field4318 = new int[200];

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "Lvh;")
    public static class125 field4319 = new class125(34, 7);

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "[[I")
    private int[][] field4307;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)V", line = 6)
    private final void method1878(int arg0, int arg1) {
        ++field4313;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4307 = new int[4][4];
                                this.field4307[0][2] = 4096;
                                this.field4307[0][0] = 2048;
                                this.field4307[0][1] = 0;
                                this.field4307[0][3] = 0;
                                this.field4307[1][3] = 0;
                                this.field4307[1][1] = 4096;
                                this.field4307[1][0] = 2867;
                                this.field4307[1][2] = 4096;
                                this.field4307[2][3] = 0;
                                this.field4307[2][1] = 4096;
                                this.field4307[2][0] = 3276;
                                this.field4307[2][2] = 4096;
                                this.field4307[3][2] = 0;
                                this.field4307[3][3] = 0;
                                this.field4307[3][1] = 4096;
                                this.field4307[3][0] = 4096;
                            } else {
                                this.field4307 = new int[16][4];
                                this.field4307[0][2] = 192;
                                this.field4307[0][0] = 0;
                                this.field4307[0][1] = 80;
                                this.field4307[0][3] = 321;
                                this.field4307[1][0] = 155;
                                this.field4307[1][1] = 321;
                                this.field4307[1][3] = 562;
                                this.field4307[1][2] = 449;
                                this.field4307[2][3] = 803;
                                this.field4307[2][1] = 578;
                                this.field4307[2][2] = 690;
                                this.field4307[2][0] = 389;
                                this.field4307[3][1] = 947;
                                this.field4307[3][0] = 671;
                                this.field4307[3][2] = 995;
                                this.field4307[3][3] = 1140;
                                this.field4307[4][0] = 897;
                                this.field4307[4][1] = 1285;
                                this.field4307[4][3] = 1509;
                                this.field4307[4][2] = 1397;
                                this.field4307[5][2] = 1429;
                                this.field4307[5][0] = 1175;
                                this.field4307[5][3] = 1413;
                                this.field4307[5][1] = 1525;
                                this.field4307[6][3] = 1333;
                                this.field4307[6][2] = 1461;
                                this.field4307[6][0] = 1368;
                                this.field4307[6][1] = 1734;
                                this.field4307[7][0] = 1507;
                                this.field4307[7][3] = 1702;
                                this.field4307[7][2] = 1525;
                                this.field4307[7][1] = 1413;
                                this.field4307[8][1] = 1108;
                                this.field4307[8][2] = 1590;
                                this.field4307[8][3] = 2056;
                                this.field4307[8][0] = 1736;
                                this.field4307[9][0] = 2088;
                                this.field4307[9][1] = 1766;
                                this.field4307[9][2] = 2056;
                                this.field4307[9][3] = 2666;
                                this.field4307[10][0] = 2355;
                                this.field4307[10][3] = 3276;
                                this.field4307[10][2] = 2586;
                                this.field4307[10][1] = 2409;
                                this.field4307[11][3] = 3228;
                                this.field4307[11][2] = 3148;
                                this.field4307[11][1] = 3116;
                                this.field4307[11][0] = 2691;
                                this.field4307[12][1] = 3806;
                                this.field4307[12][3] = 3196;
                                this.field4307[12][2] = 3710;
                                this.field4307[12][0] = 3031;
                                this.field4307[13][2] = 3421;
                                this.field4307[13][3] = 3019;
                                this.field4307[13][0] = 3522;
                                this.field4307[13][1] = 3437;
                                this.field4307[14][3] = 3228;
                                this.field4307[14][2] = 3148;
                                this.field4307[14][0] = 3727;
                                this.field4307[14][1] = 3116;
                                this.field4307[15][2] = 2505;
                                this.field4307[15][0] = 4096;
                                this.field4307[15][3] = 2746;
                                this.field4307[15][1] = 2377;
                            }
                        } else {
                            this.field4307 = new int[6][4];
                            this.field4307[0][0] = 0;
                            this.field4307[0][2] = 0;
                            this.field4307[0][3] = 0;
                            this.field4307[0][1] = 0;
                            this.field4307[1][1] = 0;
                            this.field4307[1][2] = 0;
                            this.field4307[1][0] = 1843;
                            this.field4307[1][3] = 1493;
                            this.field4307[2][3] = 2939;
                            this.field4307[2][1] = 0;
                            this.field4307[2][2] = 0;
                            this.field4307[2][0] = 2457;
                            this.field4307[3][1] = 0;
                            this.field4307[3][3] = 3565;
                            this.field4307[3][0] = 2781;
                            this.field4307[3][2] = 1124;
                            this.field4307[4][2] = 3084;
                            this.field4307[4][3] = 4031;
                            this.field4307[4][1] = 546;
                            this.field4307[4][0] = 3481;
                            this.field4307[5][2] = 4096;
                            this.field4307[5][0] = 4096;
                            this.field4307[5][3] = 4096;
                            this.field4307[5][1] = 4096;
                        }
                    } else {
                        this.field4307 = new int[7][4];
                        this.field4307[0][0] = 0;
                        this.field4307[0][1] = 0;
                        this.field4307[0][2] = 0;
                        this.field4307[0][3] = 4096;
                        this.field4307[1][1] = 0;
                        this.field4307[1][2] = 4096;
                        this.field4307[1][0] = 663;
                        this.field4307[1][3] = 4096;
                        this.field4307[2][0] = 1363;
                        this.field4307[2][3] = 0;
                        this.field4307[2][2] = 4096;
                        this.field4307[2][1] = 0;
                        this.field4307[3][2] = 4096;
                        this.field4307[3][1] = 4096;
                        this.field4307[3][3] = 0;
                        this.field4307[3][0] = 2048;
                        this.field4307[4][1] = 4096;
                        this.field4307[4][3] = 0;
                        this.field4307[4][0] = 2727;
                        this.field4307[4][2] = 0;
                        this.field4307[5][1] = 4096;
                        this.field4307[5][3] = 4096;
                        this.field4307[5][0] = 3411;
                        this.field4307[5][2] = 0;
                        this.field4307[6][3] = 4096;
                        this.field4307[6][0] = 4096;
                        this.field4307[6][2] = 0;
                        this.field4307[6][1] = 0;
                    }
                } else {
                    this.field4307 = new int[8][4];
                    this.field4307[0][0] = 0;
                    this.field4307[0][1] = 2650;
                    this.field4307[0][2] = 2602;
                    this.field4307[0][3] = 2361;
                    this.field4307[1][2] = 1799;
                    this.field4307[1][3] = 1558;
                    this.field4307[1][1] = 2313;
                    this.field4307[1][0] = 2867;
                    this.field4307[2][0] = 3072;
                    this.field4307[2][2] = 1734;
                    this.field4307[2][3] = 1413;
                    this.field4307[2][1] = 2618;
                    this.field4307[3][2] = 1220;
                    this.field4307[3][0] = 3276;
                    this.field4307[3][3] = 947;
                    this.field4307[3][1] = 2296;
                    this.field4307[4][3] = 722;
                    this.field4307[4][2] = 963;
                    this.field4307[4][1] = 2072;
                    this.field4307[4][0] = 3481;
                    this.field4307[5][2] = 2152;
                    this.field4307[5][3] = 1766;
                    this.field4307[5][0] = 3686;
                    this.field4307[5][1] = 2730;
                    this.field4307[6][3] = 915;
                    this.field4307[6][0] = 3891;
                    this.field4307[6][1] = 2232;
                    this.field4307[6][2] = 1060;
                    this.field4307[7][3] = 1140;
                    this.field4307[7][2] = 1413;
                    this.field4307[7][0] = 4096;
                    this.field4307[7][1] = 1686;
                }
            } else {
                this.field4307 = new int[2][4];
                this.field4307[0][0] = 0;
                this.field4307[0][2] = 0;
                this.field4307[0][3] = 0;
                this.field4307[0][1] = 0;
                this.field4307[1][1] = 4096;
                this.field4307[1][0] = 4096;
                this.field4307[1][3] = 4096;
                this.field4307[1][2] = 4096;
            }
        }
        if (arg0 >= -28) {
            this.field4307 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V", line = 259)
    public static void method1879(int arg0) {
        field4310 = null;
        field4316 = null;
        if (arg0 != 1429) {
            field4319 = null;
        }
        field4317 = null;
        field4318 = null;
        field4319 = null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 273)
    public class311() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 276)
    public static final String method1880(long arg0, int arg1) {
        ++field4315;
        if (arg0 > 0L && arg0 < 6582952005840035281L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg0; ~var4 != -1L; var4 /= 37L) {
                    ++var3;
                }
                if (arg1 >= -25) {
                    return null;
                } else {
                    StringBuffer var6 = new StringBuffer(var3);
                    while (arg0 != 0L) {
                        long var7 = arg0;
                        arg0 /= 37L;
                        char var9 = class44.field595[(int) (-(arg0 * 37L) + var7)];
                        if (~var9 == -96) {
                            int var10 = var6.length() + -1;
                            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                            var9 = 160;
                        }
                        var6.append(var9);
                    }
                    var6.reverse();
                    var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                    return var6.toString();
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V", line = 329)
    private final void method1881(int arg0) {
        if (arg0 == -19685) {
            ++field4309;
            int var2 = this.field4307.length;
            if (var2 > 0) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && ~this.field4307[var6][0] >= ~var5; ++var6) {
                        ++var4;
                    }
                    int var11;
                    int var12;
                    int var13;
                    if (var2 > var4) {
                        int[] var7 = this.field4307[var4];
                        if (~var4 < -1) {
                            int[] var8 = this.field4307[var4 + -1];
                            int var9 = (-var8[0] + var5 << 12) / (var7[0] - var8[0]);
                            int var10 = -var9 + 4096;
                            var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                            var12 = var7[2] * var9 - -(var8[2] * var10) >> 12;
                            var13 = var7[3] * var9 + var8[3] * var10 >> 12;
                        } else {
                            var12 = var7[2];
                            var11 = var7[1];
                            var13 = var7[3];
                        }
                    } else {
                        int[] var14 = this.field4307[var2 + -1];
                        var12 = var14[2];
                        var11 = var14[1];
                        var13 = var14[3];
                    }
                    int var15 = var13 >> 4;
                    int var16 = var11 >> 4;
                    int var17 = var12 >> 4;
                    if (~var17 <= -1) {
                        if (~var17 < -256) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    if (~var15 <= -1) {
                        if (~var15 < -256) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    this.field4308[var3] = class460.method2676(var15, class460.method2676(var17 << 8, var16 << 16));
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)[[I", line = 434)
    public final int[][] method298(int arg0, int arg1) {
        if (arg0 != -12424) {
            field4316 = null;
        }
        ++field4312;
        int[][] var3 = super.field9164.method1002(77, arg1);
        if (super.field9164.field2082) {
            int[] var4 = this.method3628(false, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class89.field1330 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field4308[var9];
                var5[var8] = class248.method1593(var10 >> 12, 4080);
                var6[var8] = class248.method1593(4080, var10 >> 4);
                var7[var8] = class248.method1593(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lek;IB)V", line = 483)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field4311;
        if (arg2 < 7) {
            this.method422(120);
        }
        if (arg1 == 0) {
            int var4 = arg0.method2705(-78);
            if (~var4 != -1) {
                this.method1878(-45, var4);
            } else {
                this.field4307 = new int[arg0.method2705(-122)][4];
                for (int var5 = 0; this.field4307.length > var5; ++var5) {
                    this.field4307[var5][0] = arg0.method2755((byte) -113);
                    this.field4307[var5][1] = arg0.method2705(-41) << 4;
                    this.field4307[var5][2] = arg0.method2705(-26) << 4;
                    this.field4307[var5][3] = arg0.method2705(-103) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V", line = 529)
    public static final void method1882(int arg0) {
        class366.field5078 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 534)
    public final void method422(int arg0) {
        ++field4306;
        if (this.field4307 == null) {
            this.method1878(-71, 1);
        }
        this.method1881(-19685);
        if (arg0 != -1) {
            this.method1881(119);
        }
    }
}
