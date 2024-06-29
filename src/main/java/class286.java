import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class286 extends class232 {

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "[I")
    private int[] field4622 = new int[257];

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field4623 = new String[] { method2428(method2427(",\u001a\u0019)|")), method2428(method2427("\u0012\u0010A\t82\u001a\u0017\u000f&:\u001a^\r:/^G\u001a1(\u001bC")), method2428(method2427(",\u001a\u0019,|")), method2428(method2427(",\u001a\u0019-|")), method2428(method2427(" P\u0019F)")), method2428(method2427("5\u000b[\u0004")), method2428(method2427(",\u001a\u0019*|")), method2428(method2427(",\u001a\u0019+|")) };

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "F")
    public static float field4621;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "[[I")
    private int[][] field4619;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    private final void method2425(int arg0) {
        try {
            ++field4615;
            if (arg0 != 0) {
                this.field4619 = null;
            }
            int var2 = this.field4619.length;
            if (~var2 < -1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && this.field4619[var6][0] <= var5; ++var6) {
                        ++var4;
                    }
                    int var11;
                    int var12;
                    int var13;
                    if (~var2 < ~var4) {
                        int[] var7 = this.field4619[var4];
                        if (var4 > 0) {
                            int[] var8 = this.field4619[var4 + -1];
                            int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                            int var10 = -var9 + 4096;
                            var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                            var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                            var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                        } else {
                            var12 = var7[3];
                            var11 = var7[1];
                            var13 = var7[2];
                        }
                    } else {
                        int[] var14 = this.field4619[var2 + -1];
                        var13 = var14[2];
                        var11 = var14[1];
                        var12 = var14[3];
                    }
                    int var15 = var12 >> 4;
                    int var16 = var13 >> 4;
                    int var17 = var11 >> 4;
                    if (var16 >= 0) {
                        if (~var16 < -256) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (var15 > 255) {
                        var15 = 255;
                    }
                    this.field4622[var3] = class553.method4099(var15, class553.method4099(var16 << 8, var17 << 16));
                }
            }
        } catch (RuntimeException var19) {
            throw class590.method4333(var19, field4623[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class286() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field4620;
            if (arg0 < 96) {
                this.method2426(64, -74);
            }
            if (arg2 == 0) {
                int var4 = arg1.method1645((byte) -96);
                if (var4 != 0) {
                    this.method2426(var4, 0);
                } else {
                    this.field4619 = new int[arg1.method1645((byte) -110)][4];
                    for (int var5 = 0; ~this.field4619.length < ~var5; ++var5) {
                        this.field4619[var5][0] = arg1.method1687((byte) -80);
                        this.field4619[var5][1] = arg1.method1645((byte) -118) << 4;
                        this.field4619[var5][2] = arg1.method1645((byte) -73) << 4;
                        this.field4619[var5][3] = arg1.method1645((byte) -75) << 4;
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4623[3] + arg0 + ',' + (arg1 != null ? field4623[4] : field4623[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V")
    private final void method2426(int arg0, int arg1) {
        try {
            ++field4618;
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (arg0 != 3) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (arg0 != 6) {
                                        throw new RuntimeException(field4623[1]);
                                    }
                                    this.field4619 = new int[4][4];
                                    this.field4619[0][3] = 0;
                                    this.field4619[0][2] = 4096;
                                    this.field4619[0][0] = 2048;
                                    this.field4619[0][1] = 0;
                                    this.field4619[1][2] = 4096;
                                    this.field4619[1][3] = 0;
                                    this.field4619[1][0] = 2867;
                                    this.field4619[1][1] = 4096;
                                    this.field4619[2][0] = 3276;
                                    this.field4619[2][2] = 4096;
                                    this.field4619[2][3] = 0;
                                    this.field4619[2][1] = 4096;
                                    this.field4619[3][0] = 4096;
                                    this.field4619[3][2] = 0;
                                    this.field4619[3][1] = 4096;
                                    this.field4619[3][3] = 0;
                                } else {
                                    this.field4619 = new int[16][4];
                                    this.field4619[0][1] = 80;
                                    this.field4619[0][0] = 0;
                                    this.field4619[0][3] = 321;
                                    this.field4619[0][2] = 192;
                                    this.field4619[1][2] = 449;
                                    this.field4619[1][0] = 155;
                                    this.field4619[1][3] = 562;
                                    this.field4619[1][1] = 321;
                                    this.field4619[2][3] = 803;
                                    this.field4619[2][1] = 578;
                                    this.field4619[2][2] = 690;
                                    this.field4619[2][0] = 389;
                                    this.field4619[3][0] = 671;
                                    this.field4619[3][3] = 1140;
                                    this.field4619[3][1] = 947;
                                    this.field4619[3][2] = 995;
                                    this.field4619[4][2] = 1397;
                                    this.field4619[4][3] = 1509;
                                    this.field4619[4][1] = 1285;
                                    this.field4619[4][0] = 897;
                                    this.field4619[5][1] = 1525;
                                    this.field4619[5][2] = 1429;
                                    this.field4619[5][3] = 1413;
                                    this.field4619[5][0] = 1175;
                                    this.field4619[6][3] = 1333;
                                    this.field4619[6][2] = 1461;
                                    this.field4619[6][1] = 1734;
                                    this.field4619[6][0] = 1368;
                                    this.field4619[7][0] = 1507;
                                    this.field4619[7][1] = 1413;
                                    this.field4619[7][3] = 1702;
                                    this.field4619[7][2] = 1525;
                                    this.field4619[8][1] = 1108;
                                    this.field4619[8][0] = 1736;
                                    this.field4619[8][2] = 1590;
                                    this.field4619[8][3] = 2056;
                                    this.field4619[9][0] = 2088;
                                    this.field4619[9][1] = 1766;
                                    this.field4619[9][2] = 2056;
                                    this.field4619[9][3] = 2666;
                                    this.field4619[10][0] = 2355;
                                    this.field4619[10][1] = 2409;
                                    this.field4619[10][3] = 3276;
                                    this.field4619[10][2] = 2586;
                                    this.field4619[11][3] = 3228;
                                    this.field4619[11][1] = 3116;
                                    this.field4619[11][2] = 3148;
                                    this.field4619[11][0] = 2691;
                                    this.field4619[12][0] = 3031;
                                    this.field4619[12][2] = 3710;
                                    this.field4619[12][3] = 3196;
                                    this.field4619[12][1] = 3806;
                                    this.field4619[13][0] = 3522;
                                    this.field4619[13][2] = 3421;
                                    this.field4619[13][1] = 3437;
                                    this.field4619[13][3] = 3019;
                                    this.field4619[14][2] = 3148;
                                    this.field4619[14][0] = 3727;
                                    this.field4619[14][1] = 3116;
                                    this.field4619[14][3] = 3228;
                                    this.field4619[15][0] = 4096;
                                    this.field4619[15][3] = 2746;
                                    this.field4619[15][1] = 2377;
                                    this.field4619[15][2] = 2505;
                                }
                            } else {
                                this.field4619 = new int[6][4];
                                this.field4619[0][3] = 0;
                                this.field4619[0][0] = 0;
                                this.field4619[0][2] = 0;
                                this.field4619[0][1] = 0;
                                this.field4619[1][1] = 0;
                                this.field4619[1][0] = 1843;
                                this.field4619[1][2] = 0;
                                this.field4619[1][3] = 1493;
                                this.field4619[2][2] = 0;
                                this.field4619[2][0] = 2457;
                                this.field4619[2][1] = 0;
                                this.field4619[2][3] = 2939;
                                this.field4619[3][0] = 2781;
                                this.field4619[3][1] = 0;
                                this.field4619[3][3] = 3565;
                                this.field4619[3][2] = 1124;
                                this.field4619[4][1] = 546;
                                this.field4619[4][0] = 3481;
                                this.field4619[4][2] = 3084;
                                this.field4619[4][3] = 4031;
                                this.field4619[5][2] = 4096;
                                this.field4619[5][0] = 4096;
                                this.field4619[5][1] = 4096;
                                this.field4619[5][3] = 4096;
                            }
                        } else {
                            this.field4619 = new int[7][4];
                            this.field4619[0][1] = 0;
                            this.field4619[0][2] = 0;
                            this.field4619[0][3] = 4096;
                            this.field4619[0][0] = 0;
                            this.field4619[1][0] = 663;
                            this.field4619[1][2] = 4096;
                            this.field4619[1][1] = 0;
                            this.field4619[1][3] = 4096;
                            this.field4619[2][0] = 1363;
                            this.field4619[2][3] = 0;
                            this.field4619[2][1] = 0;
                            this.field4619[2][2] = 4096;
                            this.field4619[3][1] = 4096;
                            this.field4619[3][3] = 0;
                            this.field4619[3][0] = 2048;
                            this.field4619[3][2] = 4096;
                            this.field4619[4][0] = 2727;
                            this.field4619[4][1] = 4096;
                            this.field4619[4][2] = 0;
                            this.field4619[4][3] = 0;
                            this.field4619[5][2] = 0;
                            this.field4619[5][0] = 3411;
                            this.field4619[5][1] = 4096;
                            this.field4619[5][3] = 4096;
                            this.field4619[6][0] = 4096;
                            this.field4619[6][2] = 0;
                            this.field4619[6][1] = 0;
                            this.field4619[6][3] = 4096;
                        }
                    } else {
                        this.field4619 = new int[8][4];
                        this.field4619[0][3] = 2361;
                        this.field4619[0][0] = 0;
                        this.field4619[0][1] = 2650;
                        this.field4619[0][2] = 2602;
                        this.field4619[1][2] = 1799;
                        this.field4619[1][3] = 1558;
                        this.field4619[1][0] = 2867;
                        this.field4619[1][1] = 2313;
                        this.field4619[2][1] = 2618;
                        this.field4619[2][2] = 1734;
                        this.field4619[2][0] = 3072;
                        this.field4619[2][3] = 1413;
                        this.field4619[3][2] = 1220;
                        this.field4619[3][1] = 2296;
                        this.field4619[3][0] = 3276;
                        this.field4619[3][3] = 947;
                        this.field4619[4][0] = 3481;
                        this.field4619[4][3] = 722;
                        this.field4619[4][2] = 963;
                        this.field4619[4][1] = 2072;
                        this.field4619[5][3] = 1766;
                        this.field4619[5][2] = 2152;
                        this.field4619[5][1] = 2730;
                        this.field4619[5][0] = 3686;
                        this.field4619[6][2] = 1060;
                        this.field4619[6][0] = 3891;
                        this.field4619[6][1] = 2232;
                        this.field4619[6][3] = 915;
                        this.field4619[7][1] = 1686;
                        this.field4619[7][3] = 1140;
                        this.field4619[7][2] = 1413;
                        this.field4619[7][0] = 4096;
                    }
                } else {
                    this.field4619 = new int[2][4];
                    this.field4619[0][0] = 0;
                    this.field4619[0][1] = 0;
                    this.field4619[0][3] = 0;
                    this.field4619[0][2] = 0;
                    this.field4619[1][3] = 4096;
                    this.field4619[1][0] = 4096;
                    this.field4619[1][2] = 4096;
                    this.field4619[1][1] = 4096;
                }
            }
            if (arg1 != 0) {
                this.method63(-116, (class176) null, 91);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4623[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)[[I")
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field4616;
            int[][] var3 = super.field3599.method1580(arg1, (byte) -123);
            if (arg0 != -3093) {
                this.method2426(-113, 59);
            }
            if (super.field3599.field2743) {
                int[] var4 = this.method2022(arg1, 0, arg0 + 3093);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; var8 < class449.field6969; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field4622[var9];
                    var5[var8] = class292.method2485(16711680, var10) >> 12;
                    var6[var8] = class292.method2485(4080, var10 >> 4);
                    var7[var8] = class292.method2485(var10, 255) << 4;
                }
            }
            return var3;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field4623[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public final void method67(byte arg0) {
        try {
            int var2 = -92 / ((arg0 - 73) / 34);
            if (this.field4619 == null) {
                this.method2426(1, 0);
            }
            ++field4617;
            this.method2425(0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4623[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2427(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 84);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2428(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 55;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 84;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
