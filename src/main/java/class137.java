import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class137 extends class297 {

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "[I")
    private int[] field2229 = new int[257];

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public static int field2225 = 0;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "Lpa;")
    public static class2 field2222 = new class2();

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field2238 = " from your friend list first.";

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
    public static int field2240 = 0;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
    public static int field2241 = 0;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "[I")
    public static int[] field2233;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "[[I")
    private int[][] field2227;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V", line = 4)
    public final void method247(byte arg0) {
        if (this.field2227 == null) {
            this.method1057(1, (byte) -121);
        }
        if (arg0 != 68) {
            method1053(-86);
        }
        field2237++;
        this.method1054((byte) -95);
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V", line = 22)
    public static final void method1053(int arg0) {
        class304.field4842.method2283((byte) 77);
        field2235++;
        int var1 = -15 / ((-arg0 - 13) / 57);
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V", line = 34)
    private final void method1054(byte arg0) {
        field2224++;
        int var2 = this.field2227.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && this.field2227[var6][0] <= var5; var6++) {
                    var4++;
                }
                int var11;
                int var12;
                int var13;
                if (var4 < var2) {
                    int[] var7 = this.field2227[var4];
                    if (var4 > 0) {
                        int[] var8 = this.field2227[var4 - 1];
                        int var9 = (var5 - var8[0] << 12) / (var7[0] - var8[0]);
                        int var10 = 4096 - var9;
                        var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                        var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                    } else {
                        var12 = var7[3];
                        var11 = var7[1];
                        var13 = var7[2];
                    }
                } else {
                    int[] var14 = this.field2227[var2 - 1];
                    var12 = var14[3];
                    var11 = var14[1];
                    var13 = var14[2];
                }
                int var15 = var11 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                int var16 = var12 >> 4;
                int var17 = var13 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field2229[var3] = class251.method1740(var16, class251.method1740(var15 << 16, var17 << 8));
            }
        }
        int var18 = 16 % ((13 - arg0) / 62);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 136)
    public class137() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(B)V", line = 140)
    public static final void method1055(byte arg0) {
        field2226++;
        class225.field3481.method2283((byte) 77);
        if (arg0 > -46) {
            field2239 = 113;
        }
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V", line = 152)
    public static void method1056(int arg0) {
        if (arg0 != -24127) {
            field2225 = -100;
        }
        field2238 = null;
        field2222 = null;
        field2233 = null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(IB)V", line = 165)
    private final void method1057(int arg0, byte arg1) {
        field2234++;
        if (arg1 != -121 || arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            this.field2227 = new int[2][4];
            this.field2227[0][0] = 0;
            this.field2227[0][1] = 0;
            this.field2227[0][3] = 0;
            this.field2227[1][0] = 4096;
            this.field2227[1][1] = 4096;
            this.field2227[1][3] = 4096;
            this.field2227[0][2] = 0;
            this.field2227[1][2] = 4096;
        } else if (arg0 == 2) {
            this.field2227 = new int[8][4];
            this.field2227[0][1] = 2650;
            this.field2227[0][0] = 0;
            this.field2227[1][0] = 2867;
            this.field2227[1][1] = 2313;
            this.field2227[0][2] = 2602;
            this.field2227[2][1] = 2618;
            this.field2227[1][2] = 1799;
            this.field2227[3][1] = 2296;
            this.field2227[4][1] = 2072;
            this.field2227[0][3] = 2361;
            this.field2227[5][1] = 2730;
            this.field2227[1][3] = 1558;
            this.field2227[2][3] = 1413;
            this.field2227[6][1] = 2232;
            this.field2227[2][2] = 1734;
            this.field2227[2][0] = 3072;
            this.field2227[3][3] = 947;
            this.field2227[7][1] = 1686;
            this.field2227[3][2] = 1220;
            this.field2227[4][2] = 963;
            this.field2227[3][0] = 3276;
            this.field2227[4][3] = 722;
            this.field2227[5][2] = 2152;
            this.field2227[6][2] = 1060;
            this.field2227[4][0] = 3481;
            this.field2227[5][3] = 1766;
            this.field2227[6][3] = 915;
            this.field2227[5][0] = 3686;
            this.field2227[7][3] = 1140;
            this.field2227[7][2] = 1413;
            this.field2227[6][0] = 3891;
            this.field2227[7][0] = 4096;
        } else if (arg0 == 3) {
            this.field2227 = new int[7][4];
            this.field2227[0][3] = 4096;
            this.field2227[0][0] = 0;
            this.field2227[0][2] = 0;
            this.field2227[1][0] = 663;
            this.field2227[2][0] = 1363;
            this.field2227[0][1] = 0;
            this.field2227[1][3] = 4096;
            this.field2227[3][0] = 2048;
            this.field2227[1][2] = 4096;
            this.field2227[4][0] = 2727;
            this.field2227[5][0] = 3411;
            this.field2227[6][0] = 4096;
            this.field2227[2][2] = 4096;
            this.field2227[2][3] = 0;
            this.field2227[1][1] = 0;
            this.field2227[3][2] = 4096;
            this.field2227[4][2] = 0;
            this.field2227[2][1] = 0;
            this.field2227[5][2] = 0;
            this.field2227[3][3] = 0;
            this.field2227[6][2] = 0;
            this.field2227[4][3] = 0;
            this.field2227[5][3] = 4096;
            this.field2227[6][3] = 4096;
            this.field2227[3][1] = 4096;
            this.field2227[4][1] = 4096;
            this.field2227[5][1] = 4096;
            this.field2227[6][1] = 0;
        } else if (arg0 == 4) {
            this.field2227 = new int[6][4];
            this.field2227[0][2] = 0;
            this.field2227[0][0] = 0;
            this.field2227[0][3] = 0;
            this.field2227[1][2] = 0;
            this.field2227[0][1] = 0;
            this.field2227[1][0] = 1843;
            this.field2227[2][0] = 2457;
            this.field2227[1][1] = 0;
            this.field2227[2][2] = 0;
            this.field2227[1][3] = 1493;
            this.field2227[3][2] = 1124;
            this.field2227[2][1] = 0;
            this.field2227[3][1] = 0;
            this.field2227[3][0] = 2781;
            this.field2227[2][3] = 2939;
            this.field2227[4][1] = 546;
            this.field2227[5][1] = 4096;
            this.field2227[4][0] = 3481;
            this.field2227[4][2] = 3084;
            this.field2227[5][2] = 4096;
            this.field2227[3][3] = 3565;
            this.field2227[5][0] = 4096;
            this.field2227[4][3] = 4031;
            this.field2227[5][3] = 4096;
        } else if (arg0 == 5) {
            this.field2227 = new int[16][4];
            this.field2227[0][3] = 321;
            this.field2227[1][3] = 562;
            this.field2227[0][2] = 192;
            this.field2227[0][1] = 80;
            this.field2227[0][0] = 0;
            this.field2227[1][2] = 449;
            this.field2227[1][1] = 321;
            this.field2227[2][1] = 578;
            this.field2227[2][3] = 803;
            this.field2227[3][3] = 1140;
            this.field2227[1][0] = 155;
            this.field2227[2][0] = 389;
            this.field2227[3][0] = 671;
            this.field2227[3][1] = 947;
            this.field2227[4][3] = 1509;
            this.field2227[4][1] = 1285;
            this.field2227[5][1] = 1525;
            this.field2227[2][2] = 690;
            this.field2227[5][3] = 1413;
            this.field2227[3][2] = 995;
            this.field2227[4][0] = 897;
            this.field2227[6][3] = 1333;
            this.field2227[5][0] = 1175;
            this.field2227[6][1] = 1734;
            this.field2227[6][0] = 1368;
            this.field2227[7][3] = 1702;
            this.field2227[8][3] = 2056;
            this.field2227[9][3] = 2666;
            this.field2227[4][2] = 1397;
            this.field2227[5][2] = 1429;
            this.field2227[7][1] = 1413;
            this.field2227[10][3] = 3276;
            this.field2227[6][2] = 1461;
            this.field2227[8][1] = 1108;
            this.field2227[7][2] = 1525;
            this.field2227[11][3] = 3228;
            this.field2227[8][2] = 1590;
            this.field2227[12][3] = 3196;
            this.field2227[9][1] = 1766;
            this.field2227[7][0] = 1507;
            this.field2227[13][3] = 3019;
            this.field2227[14][3] = 3228;
            this.field2227[10][1] = 2409;
            this.field2227[9][2] = 2056;
            this.field2227[11][1] = 3116;
            this.field2227[12][1] = 3806;
            this.field2227[13][1] = 3437;
            this.field2227[8][0] = 1736;
            this.field2227[9][0] = 2088;
            this.field2227[15][3] = 2746;
            this.field2227[10][2] = 2586;
            this.field2227[14][1] = 3116;
            this.field2227[10][0] = 2355;
            this.field2227[11][2] = 3148;
            this.field2227[15][1] = 2377;
            this.field2227[12][2] = 3710;
            this.field2227[11][0] = 2691;
            this.field2227[12][0] = 3031;
            this.field2227[13][2] = 3421;
            this.field2227[13][0] = 3522;
            this.field2227[14][0] = 3727;
            this.field2227[14][2] = 3148;
            this.field2227[15][0] = 4096;
            this.field2227[15][2] = 2505;
        } else if (arg0 == 6) {
            this.field2227 = new int[4][4];
            this.field2227[0][3] = 0;
            this.field2227[0][1] = 0;
            this.field2227[1][1] = 4096;
            this.field2227[0][2] = 4096;
            this.field2227[2][1] = 4096;
            this.field2227[3][1] = 4096;
            this.field2227[1][2] = 4096;
            this.field2227[2][2] = 4096;
            this.field2227[3][2] = 0;
            this.field2227[1][3] = 0;
            this.field2227[2][3] = 0;
            this.field2227[0][0] = 2048;
            this.field2227[1][0] = 2867;
            this.field2227[2][0] = 3276;
            this.field2227[3][0] = 4096;
            this.field2227[3][3] = 0;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/lang/String;)I", line = 416)
    public static final int method1058(int arg0, String arg1) {
        field2228++;
        if (class62.field903 == null || arg1.length() == 0) {
            return -1;
        }
        int var2 = 0;
        int var3 = -88 / ((arg0 - 45) / 58);
        while (class62.field903.field1782 > var2) {
            if (class237.method1693(class220.method1603(" ", (byte) 5, "<br>", class62.field903.field1775[var2]), (byte) -9, arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lpk;I)V", line = 443)
    public static final void method1059(class120 arg0, int arg1) {
        field2232++;
        if (arg1 != 0) {
            method1059((class120) null, -88);
        }
        class233.field3546 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ltk;Ljava/lang/String;I)Ljava/lang/String;", line = 454)
    public static final String method1060(class266 arg0, String arg1, int arg2) {
        if (arg2 != -7276) {
            method1058(-29, (String) null);
        }
        if (arg1.indexOf("%") != -1) {
            label57: while (true) {
                int var3 = arg1.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label57;
                                                        }
                                                        String var9 = "";
                                                        if (class38.field570 != null) {
                                                            if (class38.field570.field409 == null) {
                                                                var9 = class2.method69(class38.field570.field406, false);
                                                            } else {
                                                                var9 = (String) class38.field570.field409;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class209.method1536(999999999, class161.method1186(arg2 + 7276, arg0, 4)) + arg1.substring(var7 + 2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class209.method1536(999999999, class161.method1186(arg2 + 7276, arg0, 3)) + arg1.substring(var6 + 2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class209.method1536(arg2 ^ 0xC4652A6B, class161.method1186(0, arg0, 2)) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class209.method1536(999999999, class161.method1186(0, arg0, 1)) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class209.method1536(arg2 ^ 0xC4652A6B, class161.method1186(0, arg0, 0)) + arg1.substring(var3 + 2);
            }
        }
        field2223++;
        return arg1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[[I", line = 548)
    public final int[][] method172(int arg0, byte arg1) {
        field2236++;
        if (arg1 != 63) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480) {
            int[] var4 = this.method2109(arg0, (byte) 27, 0);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class31.field491; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2229[var9];
                var6[var8] = class164.method1234(var10 >> 12, 4080);
                var5[var8] = class164.method1234(var10, 65280) >> 4;
                var7[var8] = class164.method1234(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(CBI)I", line = 598)
    public static final int method1061(char arg0, byte arg1, int arg2) {
        field2230++;
        if (arg1 != 35) {
            field2233 = (int[]) null;
        }
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILaj;)V", line = 633)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg1 != 255) {
            return;
        }
        field2231++;
        if (arg0 != 0) {
            return;
        }
        int var4 = arg2.method15((byte) 81);
        if (var4 != 0) {
            this.method1057(var4, (byte) -121);
            return;
        }
        this.field2227 = new int[arg2.method15((byte) 127)][4];
        for (int var5 = 0; var5 < this.field2227.length; var5++) {
            this.field2227[var5][0] = arg2.method56(19612);
            this.field2227[var5][1] = arg2.method15((byte) -39) << 4;
            this.field2227[var5][2] = arg2.method15((byte) 98) << 4;
            this.field2227[var5][3] = arg2.method15((byte) 103) << 4;
        }
    }
}
