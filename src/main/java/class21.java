import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class21 extends class115 {

    @OriginalMember(owner = "client!o", name = "L", descriptor = "[I")
    private int[] field214 = new int[257];

    @OriginalMember(owner = "client!o", name = "N", descriptor = "Lfi;")
    public static class331 field216 = new class331(20);

    @OriginalMember(owner = "client!o", name = "W", descriptor = "Ljava/lang/String;")
    public static String field225 = " ";

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "[I")
    public static int[] field227 = new int[1000];

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "[[I")
    private int[][] field212;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
    public final void method140(int arg0) {
        if (arg0 == 0) {
            ++field215;
            if (this.field212 == null) {
                this.method143(1, (byte) 120);
            }
            this.method146((byte) -64);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class21() {
        super(1, false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILjava/lang/String;[BII)I")
    public static final int method141(int arg0, int arg1, String arg2, byte[] arg3, int arg4, int arg5) {
        ++field223;
        int var6 = -arg4 + arg5;
        for (int var7 = arg1; ~var6 < ~var7; ++var7) {
            char var8 = arg2.charAt(arg4 + var7);
            if (var8 > 0 && ~var8 > -129 || ~var8 <= -161 && var8 <= 255) {
                arg3[arg0 + var7] = (byte) var8;
            } else if (~var8 != -8365) {
                if (var8 == 8218) {
                    arg3[arg0 + var7] = -126;
                } else if (var8 == 402) {
                    arg3[arg0 - -var7] = -125;
                } else if (var8 != 8222) {
                    if (var8 == 8230) {
                        arg3[arg0 + var7] = -123;
                    } else if (var8 != 8224) {
                        if (var8 != 8225) {
                            if (~var8 == -711) {
                                arg3[arg0 + var7] = -120;
                            } else if (var8 == 8240) {
                                arg3[arg0 - -var7] = -119;
                            } else if (var8 != 352) {
                                if (var8 == 8249) {
                                    arg3[arg0 + var7] = -117;
                                } else if (var8 == 338) {
                                    arg3[arg0 - -var7] = -116;
                                } else if (var8 == 381) {
                                    arg3[arg0 - -var7] = -114;
                                } else if (var8 == 8216) {
                                    arg3[arg0 + var7] = -111;
                                } else if (~var8 == -8218) {
                                    arg3[arg0 + var7] = -110;
                                } else if (var8 != 8220) {
                                    if (~var8 == -8222) {
                                        arg3[arg0 + var7] = -108;
                                    } else if (~var8 == -8227) {
                                        arg3[arg0 + var7] = -107;
                                    } else if (~var8 != -8212) {
                                        if (var8 == 8212) {
                                            arg3[arg0 + var7] = -105;
                                        } else if (~var8 != -733) {
                                            if (~var8 != -8483) {
                                                if (~var8 == -354) {
                                                    arg3[arg0 + var7] = -102;
                                                } else if (~var8 == -8251) {
                                                    arg3[arg0 - -var7] = -101;
                                                } else if (~var8 != -340) {
                                                    if (~var8 != -383) {
                                                        if (~var8 == -377) {
                                                            arg3[arg0 + var7] = -97;
                                                        } else {
                                                            arg3[arg0 + var7] = 63;
                                                        }
                                                    } else {
                                                        arg3[arg0 + var7] = -98;
                                                    }
                                                } else {
                                                    arg3[arg0 - -var7] = -100;
                                                }
                                            } else {
                                                arg3[arg0 + var7] = -103;
                                            }
                                        } else {
                                            arg3[arg0 - -var7] = -104;
                                        }
                                    } else {
                                        arg3[arg0 + var7] = -106;
                                    }
                                } else {
                                    arg3[arg0 + var7] = -109;
                                }
                            } else {
                                arg3[arg0 + var7] = -118;
                            }
                        } else {
                            arg3[arg0 + var7] = -121;
                        }
                    } else {
                        arg3[arg0 + var7] = -122;
                    }
                } else {
                    arg3[arg0 + var7] = -124;
                }
            } else {
                arg3[arg0 + var7] = -128;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V")
    public static final void method142(int arg0) {
        ++field213;
        class148.field2076 = null;
        if (arg0 != 2) {
            field226 = -104;
        }
        class216.field2951 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V")
    private final void method143(int arg0, byte arg1) {
        if (arg1 <= 61) {
            this.method149((byte) -88, (class211) null, -30);
        }
        ++field219;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field212 = new int[4][4];
                                    this.field212[0][0] = 2048;
                                    this.field212[0][1] = 0;
                                    this.field212[0][3] = 0;
                                    this.field212[0][2] = 4096;
                                    this.field212[1][0] = 2867;
                                    this.field212[1][3] = 0;
                                    this.field212[1][2] = 4096;
                                    this.field212[1][1] = 4096;
                                    this.field212[2][2] = 4096;
                                    this.field212[2][1] = 4096;
                                    this.field212[2][0] = 3276;
                                    this.field212[2][3] = 0;
                                    this.field212[3][3] = 0;
                                    this.field212[3][0] = 4096;
                                    this.field212[3][2] = 0;
                                    this.field212[3][1] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field212 = new int[16][4];
                                this.field212[0][1] = 80;
                                this.field212[0][2] = 192;
                                this.field212[0][0] = 0;
                                this.field212[0][3] = 321;
                                this.field212[1][0] = 155;
                                this.field212[1][3] = 562;
                                this.field212[1][1] = 321;
                                this.field212[1][2] = 449;
                                this.field212[2][1] = 578;
                                this.field212[2][3] = 803;
                                this.field212[2][0] = 389;
                                this.field212[2][2] = 690;
                                this.field212[3][0] = 671;
                                this.field212[3][3] = 1140;
                                this.field212[3][1] = 947;
                                this.field212[3][2] = 995;
                                this.field212[4][3] = 1509;
                                this.field212[4][0] = 897;
                                this.field212[4][2] = 1397;
                                this.field212[4][1] = 1285;
                                this.field212[5][0] = 1175;
                                this.field212[5][1] = 1525;
                                this.field212[5][3] = 1413;
                                this.field212[5][2] = 1429;
                                this.field212[6][0] = 1368;
                                this.field212[6][1] = 1734;
                                this.field212[6][3] = 1333;
                                this.field212[6][2] = 1461;
                                this.field212[7][2] = 1525;
                                this.field212[7][1] = 1413;
                                this.field212[7][3] = 1702;
                                this.field212[7][0] = 1507;
                                this.field212[8][3] = 2056;
                                this.field212[8][1] = 1108;
                                this.field212[8][0] = 1736;
                                this.field212[8][2] = 1590;
                                this.field212[9][3] = 2666;
                                this.field212[9][1] = 1766;
                                this.field212[9][0] = 2088;
                                this.field212[9][2] = 2056;
                                this.field212[10][3] = 3276;
                                this.field212[10][0] = 2355;
                                this.field212[10][2] = 2586;
                                this.field212[10][1] = 2409;
                                this.field212[11][1] = 3116;
                                this.field212[11][2] = 3148;
                                this.field212[11][3] = 3228;
                                this.field212[11][0] = 2691;
                                this.field212[12][0] = 3031;
                                this.field212[12][1] = 3806;
                                this.field212[12][2] = 3710;
                                this.field212[12][3] = 3196;
                                this.field212[13][0] = 3522;
                                this.field212[13][2] = 3421;
                                this.field212[13][3] = 3019;
                                this.field212[13][1] = 3437;
                                this.field212[14][0] = 3727;
                                this.field212[14][2] = 3148;
                                this.field212[14][1] = 3116;
                                this.field212[14][3] = 3228;
                                this.field212[15][0] = 4096;
                                this.field212[15][1] = 2377;
                                this.field212[15][2] = 2505;
                                this.field212[15][3] = 2746;
                            }
                        } else {
                            this.field212 = new int[6][4];
                            this.field212[0][1] = 0;
                            this.field212[0][0] = 0;
                            this.field212[0][3] = 0;
                            this.field212[0][2] = 0;
                            this.field212[1][2] = 0;
                            this.field212[1][0] = 1843;
                            this.field212[1][3] = 1493;
                            this.field212[1][1] = 0;
                            this.field212[2][3] = 2939;
                            this.field212[2][2] = 0;
                            this.field212[2][1] = 0;
                            this.field212[2][0] = 2457;
                            this.field212[3][0] = 2781;
                            this.field212[3][2] = 1124;
                            this.field212[3][1] = 0;
                            this.field212[3][3] = 3565;
                            this.field212[4][3] = 4031;
                            this.field212[4][1] = 546;
                            this.field212[4][2] = 3084;
                            this.field212[4][0] = 3481;
                            this.field212[5][0] = 4096;
                            this.field212[5][2] = 4096;
                            this.field212[5][3] = 4096;
                            this.field212[5][1] = 4096;
                        }
                    } else {
                        this.field212 = new int[7][4];
                        this.field212[0][3] = 4096;
                        this.field212[0][0] = 0;
                        this.field212[0][1] = 0;
                        this.field212[0][2] = 0;
                        this.field212[1][0] = 663;
                        this.field212[1][2] = 4096;
                        this.field212[1][1] = 0;
                        this.field212[1][3] = 4096;
                        this.field212[2][0] = 1363;
                        this.field212[2][2] = 4096;
                        this.field212[2][3] = 0;
                        this.field212[2][1] = 0;
                        this.field212[3][2] = 4096;
                        this.field212[3][0] = 2048;
                        this.field212[3][3] = 0;
                        this.field212[3][1] = 4096;
                        this.field212[4][3] = 0;
                        this.field212[4][1] = 4096;
                        this.field212[4][0] = 2727;
                        this.field212[4][2] = 0;
                        this.field212[5][2] = 0;
                        this.field212[5][0] = 3411;
                        this.field212[5][3] = 4096;
                        this.field212[5][1] = 4096;
                        this.field212[6][2] = 0;
                        this.field212[6][1] = 0;
                        this.field212[6][0] = 4096;
                        this.field212[6][3] = 4096;
                    }
                } else {
                    this.field212 = new int[8][4];
                    this.field212[0][2] = 2602;
                    this.field212[0][3] = 2361;
                    this.field212[0][1] = 2650;
                    this.field212[0][0] = 0;
                    this.field212[1][2] = 1799;
                    this.field212[1][3] = 1558;
                    this.field212[1][1] = 2313;
                    this.field212[1][0] = 2867;
                    this.field212[2][3] = 1413;
                    this.field212[2][1] = 2618;
                    this.field212[2][2] = 1734;
                    this.field212[2][0] = 3072;
                    this.field212[3][0] = 3276;
                    this.field212[3][1] = 2296;
                    this.field212[3][2] = 1220;
                    this.field212[3][3] = 947;
                    this.field212[4][0] = 3481;
                    this.field212[4][1] = 2072;
                    this.field212[4][2] = 963;
                    this.field212[4][3] = 722;
                    this.field212[5][0] = 3686;
                    this.field212[5][1] = 2730;
                    this.field212[5][3] = 1766;
                    this.field212[5][2] = 2152;
                    this.field212[6][3] = 915;
                    this.field212[6][1] = 2232;
                    this.field212[6][0] = 3891;
                    this.field212[6][2] = 1060;
                    this.field212[7][1] = 1686;
                    this.field212[7][2] = 1413;
                    this.field212[7][3] = 1140;
                    this.field212[7][0] = 4096;
                }
            } else {
                this.field212 = new int[2][4];
                this.field212[0][1] = 0;
                this.field212[0][2] = 0;
                this.field212[0][3] = 0;
                this.field212[0][0] = 0;
                this.field212[1][2] = 4096;
                this.field212[1][3] = 4096;
                this.field212[1][0] = 4096;
                this.field212[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[[I")
    public final int[][] method144(int arg0, int arg1) {
        ++field220;
        int var3 = 76 % ((arg1 - -80) / 45);
        int[][] var4 = super.field1342.method2530(arg0, (byte) 98);
        if (super.field1342.field5819) {
            int[] var5 = this.method631(true, 0, arg0);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            for (int var9 = 0; class218.field2979 > var9; ++var9) {
                int var10 = var5[var9] >> 4;
                if (~var10 > -1) {
                    var10 = 0;
                }
                if (~var10 < -257) {
                    var10 = 256;
                }
                int var11 = this.field214[var10];
                var6[var9] = class40.method253(var11 >> 12, 4080);
                var7[var9] = class40.method253(var11 >> 4, 4080);
                var8[var9] = class40.method253(var11 << 4, 4080);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "(I)V")
    public static void method145(int arg0) {
        if (arg0 != 4096) {
            field227 = null;
        }
        field225 = null;
        field216 = null;
        field227 = null;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V")
    private final void method146(byte arg0) {
        ++field217;
        if (arg0 == -64) {
            int var2 = this.field212.length;
            if (~var2 < -1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var2 > var6 && var5 >= this.field212[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var4 >= var2) {
                        int[] var7 = this.field212[var2 + -1];
                        var8 = var7[3];
                        var9 = var7[1];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field212[var4];
                        if (var4 > 0) {
                            int[] var12 = this.field212[var4 + -1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                            int var14 = 4096 - var13;
                            var9 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                            var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                            var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                        } else {
                            var10 = var11[2];
                            var8 = var11[3];
                            var9 = var11[1];
                        }
                    }
                    int var15 = var9 >> 4;
                    int var16 = var8 >> 4;
                    int var17 = var10 >> 4;
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (var15 > 255) {
                        var15 = 255;
                    }
                    if (~var17 <= -1) {
                        if (var17 > 255) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    this.field214[var3] = class164.method1059(class164.method1059(var17 << 8, var15 << 16), var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "j", descriptor = "(I)Llk;")
    public static final class350 method147(int arg0) {
        ++field222;
        if (arg0 != 5) {
            return null;
        } else {
            try {
                return (class350) Class.forName("hb").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(B)V")
    public static final void method148(byte arg0) {
        if (class306.field4385 > 0) {
            int var1 = 0;
            for (int var2 = 0; ~class133.field1857.length < ~var2; ++var2) {
                if (class133.field1857[var2].startsWith("--> ")) {
                    ++var1;
                    if (~class306.field4385 == ~var1) {
                        class400.field5813 = class133.field1857[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class400.field5813 = "";
        }
        int var3 = 57 / ((-52 - arg0) / 63);
        ++field224;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLbk;I)V")
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (~arg2 == -1) {
            int var4 = arg1.method1342((byte) -127);
            if (var4 != 0) {
                this.method143(var4, (byte) 80);
            } else {
                this.field212 = new int[arg1.method1342((byte) -127)][4];
                for (int var5 = 0; var5 < this.field212.length; ++var5) {
                    this.field212[var5][0] = arg1.method1355(32136);
                    this.field212[var5][1] = arg1.method1342((byte) -128) << 4;
                    this.field212[var5][2] = arg1.method1342((byte) -128) << 4;
                    this.field212[var5][3] = arg1.method1342((byte) -126) << 4;
                }
            }
        }
        if (arg0 < 83) {
            this.method149((byte) 51, (class211) null, -106);
        }
        ++field218;
    }
}
