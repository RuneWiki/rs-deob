import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class387 extends class145 {

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "[I")
    private int[] field5443 = new int[257];

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public static int field5445 = 1;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "Ljava/lang/String;")
    public static String field5447 = "Loaded sprites";

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "Z")
    public static boolean field5455 = false;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "Lpe;")
    public static class391 field5450;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "[[I")
    private int[][] field5448;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        if (this.field5448 == null) {
            this.method2396(1, (byte) 47);
        }
        ++field5454;
        this.method2397(-16594);
        if (arg0 != 77) {
            this.field5448 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)Lac;")
    public static final class216 method2393(int arg0, int arg1) {
        ++field5446;
        if (arg1 != 1) {
            field5450 = null;
        }
        if (arg0 == 0) {
            if ((double) class99.field1419 == 3.0D) {
                return class411.field5753;
            }
            if ((double) class99.field1419 == 4.0D) {
                return class126.field1759;
            }
            if ((double) class99.field1419 == 6.0D) {
                return class370.field5087;
            }
            if ((double) class99.field1419 >= 8.0D) {
                return class424.field5963;
            }
        } else if (arg0 == 1) {
            if ((double) class99.field1419 == 3.0D) {
                return class370.field5087;
            }
            if ((double) class99.field1419 == 4.0D) {
                return class424.field5963;
            }
            if ((double) class99.field1419 == 6.0D) {
                return class263.field3537;
            }
            if ((double) class99.field1419 >= 8.0D) {
                return class154.field2340;
            }
        } else if (~arg0 == -3) {
            if ((double) class99.field1419 == 3.0D) {
                return class263.field3537;
            }
            if ((double) class99.field1419 == 4.0D) {
                return class154.field2340;
            }
            if ((double) class99.field1419 == 6.0D) {
                return class52.field855;
            }
            if ((double) class99.field1419 >= 8.0D) {
                return class278.field3743;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V")
    public static void method2394(boolean arg0) {
        field5447 = null;
        if (!arg0) {
            method2395(-45, (class384) null);
        }
        field5450 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        int var4 = -102 / ((arg1 - 11) / 52);
        ++field5444;
        if (arg2 == 0) {
            int var5 = arg0.method1861((byte) -72);
            if (~var5 != -1) {
                this.method2396(var5, (byte) 47);
            } else {
                this.field5448 = new int[arg0.method1861((byte) -72)][4];
                for (int var6 = 0; ~this.field5448.length < ~var6; ++var6) {
                    this.field5448[var6][0] = arg0.method1853(-98);
                    this.field5448[var6][1] = arg0.method1861((byte) -72) << 4;
                    this.field5448[var6][2] = arg0.method1861((byte) -72) << 4;
                    this.field5448[var6][3] = arg0.method1861((byte) -72) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILoo;)Z")
    public static final boolean method2395(int arg0, class384 arg1) {
        ++field5451;
        if (arg1 == null) {
            return false;
        } else {
            if (arg0 < 13) {
                field5445 = 14;
            }
            if (!arg1.field5397) {
                return false;
            } else if (!arg1.method2382(-14605)) {
                return false;
            } else if (class97.field1402.method614(-103, (long) arg1.field5406) != null) {
                return false;
            } else {
                return class402.field5609.method614(-81, (long) arg1.field5408) == null;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class387() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
    private final void method2396(int arg0, byte arg1) {
        ++field5449;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field5448 = new int[4][4];
                                this.field5448[0][3] = 0;
                                this.field5448[0][1] = 0;
                                this.field5448[0][2] = 4096;
                                this.field5448[0][0] = 2048;
                                this.field5448[1][3] = 0;
                                this.field5448[1][0] = 2867;
                                this.field5448[1][1] = 4096;
                                this.field5448[1][2] = 4096;
                                this.field5448[2][1] = 4096;
                                this.field5448[2][2] = 4096;
                                this.field5448[2][3] = 0;
                                this.field5448[2][0] = 3276;
                                this.field5448[3][0] = 4096;
                                this.field5448[3][1] = 4096;
                                this.field5448[3][3] = 0;
                                this.field5448[3][2] = 0;
                            } else {
                                this.field5448 = new int[16][4];
                                this.field5448[0][0] = 0;
                                this.field5448[0][3] = 321;
                                this.field5448[0][1] = 80;
                                this.field5448[0][2] = 192;
                                this.field5448[1][3] = 562;
                                this.field5448[1][0] = 155;
                                this.field5448[1][2] = 449;
                                this.field5448[1][1] = 321;
                                this.field5448[2][2] = 690;
                                this.field5448[2][1] = 578;
                                this.field5448[2][3] = 803;
                                this.field5448[2][0] = 389;
                                this.field5448[3][3] = 1140;
                                this.field5448[3][2] = 995;
                                this.field5448[3][0] = 671;
                                this.field5448[3][1] = 947;
                                this.field5448[4][3] = 1509;
                                this.field5448[4][1] = 1285;
                                this.field5448[4][2] = 1397;
                                this.field5448[4][0] = 897;
                                this.field5448[5][3] = 1413;
                                this.field5448[5][2] = 1429;
                                this.field5448[5][0] = 1175;
                                this.field5448[5][1] = 1525;
                                this.field5448[6][0] = 1368;
                                this.field5448[6][1] = 1734;
                                this.field5448[6][2] = 1461;
                                this.field5448[6][3] = 1333;
                                this.field5448[7][2] = 1525;
                                this.field5448[7][3] = 1702;
                                this.field5448[7][0] = 1507;
                                this.field5448[7][1] = 1413;
                                this.field5448[8][0] = 1736;
                                this.field5448[8][3] = 2056;
                                this.field5448[8][1] = 1108;
                                this.field5448[8][2] = 1590;
                                this.field5448[9][3] = 2666;
                                this.field5448[9][2] = 2056;
                                this.field5448[9][1] = 1766;
                                this.field5448[9][0] = 2088;
                                this.field5448[10][1] = 2409;
                                this.field5448[10][3] = 3276;
                                this.field5448[10][2] = 2586;
                                this.field5448[10][0] = 2355;
                                this.field5448[11][2] = 3148;
                                this.field5448[11][3] = 3228;
                                this.field5448[11][1] = 3116;
                                this.field5448[11][0] = 2691;
                                this.field5448[12][0] = 3031;
                                this.field5448[12][3] = 3196;
                                this.field5448[12][2] = 3710;
                                this.field5448[12][1] = 3806;
                                this.field5448[13][2] = 3421;
                                this.field5448[13][0] = 3522;
                                this.field5448[13][1] = 3437;
                                this.field5448[13][3] = 3019;
                                this.field5448[14][3] = 3228;
                                this.field5448[14][0] = 3727;
                                this.field5448[14][2] = 3148;
                                this.field5448[14][1] = 3116;
                                this.field5448[15][3] = 2746;
                                this.field5448[15][2] = 2505;
                                this.field5448[15][1] = 2377;
                                this.field5448[15][0] = 4096;
                            }
                        } else {
                            this.field5448 = new int[6][4];
                            this.field5448[0][0] = 0;
                            this.field5448[0][1] = 0;
                            this.field5448[0][3] = 0;
                            this.field5448[0][2] = 0;
                            this.field5448[1][0] = 1843;
                            this.field5448[1][1] = 0;
                            this.field5448[1][2] = 0;
                            this.field5448[1][3] = 1493;
                            this.field5448[2][1] = 0;
                            this.field5448[2][3] = 2939;
                            this.field5448[2][2] = 0;
                            this.field5448[2][0] = 2457;
                            this.field5448[3][3] = 3565;
                            this.field5448[3][0] = 2781;
                            this.field5448[3][2] = 1124;
                            this.field5448[3][1] = 0;
                            this.field5448[4][1] = 546;
                            this.field5448[4][2] = 3084;
                            this.field5448[4][0] = 3481;
                            this.field5448[4][3] = 4031;
                            this.field5448[5][1] = 4096;
                            this.field5448[5][3] = 4096;
                            this.field5448[5][2] = 4096;
                            this.field5448[5][0] = 4096;
                        }
                    } else {
                        this.field5448 = new int[7][4];
                        this.field5448[0][1] = 0;
                        this.field5448[0][3] = 4096;
                        this.field5448[0][2] = 0;
                        this.field5448[0][0] = 0;
                        this.field5448[1][0] = 663;
                        this.field5448[1][1] = 0;
                        this.field5448[1][2] = 4096;
                        this.field5448[1][3] = 4096;
                        this.field5448[2][0] = 1363;
                        this.field5448[2][1] = 0;
                        this.field5448[2][3] = 0;
                        this.field5448[2][2] = 4096;
                        this.field5448[3][0] = 2048;
                        this.field5448[3][3] = 0;
                        this.field5448[3][1] = 4096;
                        this.field5448[3][2] = 4096;
                        this.field5448[4][0] = 2727;
                        this.field5448[4][1] = 4096;
                        this.field5448[4][3] = 0;
                        this.field5448[4][2] = 0;
                        this.field5448[5][3] = 4096;
                        this.field5448[5][1] = 4096;
                        this.field5448[5][0] = 3411;
                        this.field5448[5][2] = 0;
                        this.field5448[6][0] = 4096;
                        this.field5448[6][2] = 0;
                        this.field5448[6][3] = 4096;
                        this.field5448[6][1] = 0;
                    }
                } else {
                    this.field5448 = new int[8][4];
                    this.field5448[0][2] = 2602;
                    this.field5448[0][3] = 2361;
                    this.field5448[0][1] = 2650;
                    this.field5448[0][0] = 0;
                    this.field5448[1][1] = 2313;
                    this.field5448[1][3] = 1558;
                    this.field5448[1][0] = 2867;
                    this.field5448[1][2] = 1799;
                    this.field5448[2][3] = 1413;
                    this.field5448[2][0] = 3072;
                    this.field5448[2][1] = 2618;
                    this.field5448[2][2] = 1734;
                    this.field5448[3][1] = 2296;
                    this.field5448[3][3] = 947;
                    this.field5448[3][0] = 3276;
                    this.field5448[3][2] = 1220;
                    this.field5448[4][1] = 2072;
                    this.field5448[4][2] = 963;
                    this.field5448[4][0] = 3481;
                    this.field5448[4][3] = 722;
                    this.field5448[5][0] = 3686;
                    this.field5448[5][1] = 2730;
                    this.field5448[5][2] = 2152;
                    this.field5448[5][3] = 1766;
                    this.field5448[6][1] = 2232;
                    this.field5448[6][0] = 3891;
                    this.field5448[6][2] = 1060;
                    this.field5448[6][3] = 915;
                    this.field5448[7][0] = 4096;
                    this.field5448[7][3] = 1140;
                    this.field5448[7][1] = 1686;
                    this.field5448[7][2] = 1413;
                }
            } else {
                this.field5448 = new int[2][4];
                this.field5448[0][0] = 0;
                this.field5448[0][2] = 0;
                this.field5448[0][3] = 0;
                this.field5448[0][1] = 0;
                this.field5448[1][3] = 4096;
                this.field5448[1][1] = 4096;
                this.field5448[1][0] = 4096;
                this.field5448[1][2] = 4096;
            }
        }
        if (arg1 != 47) {
            this.method2((class289) null, (byte) 125, -37);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method4(boolean arg0, int arg1) {
        if (!arg0) {
            field5450 = null;
        }
        ++field5452;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771) {
            int[] var4 = this.method1119(0, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class156.field2364; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field5443[var9];
                var5[var8] = class323.method2059(var10 >> 12, 4080);
                var6[var8] = class323.method2059(var10, 65280) >> 4;
                var7[var8] = class323.method2059(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
    private final void method2397(int arg0) {
        ++field5453;
        if (arg0 != -16594) {
            this.method2397(114);
        }
        int var2 = this.field5448.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && var5 >= this.field5448[var6][0]; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (~var4 > ~var2) {
                    int[] var7 = this.field5448[var4];
                    if (var4 > 0) {
                        int[] var8 = this.field5448[var4 - 1];
                        int var9 = (var5 - var8[0] << 12) / (var7[0] + -var8[0]);
                        int var10 = 4096 - var9;
                        var11 = var7[2] * var9 - -(var8[2] * var10) >> 12;
                        var12 = var7[3] * var9 - -(var8[3] * var10) >> 12;
                        var13 = var7[1] * var9 - -(var8[1] * var10) >> 12;
                    } else {
                        var13 = var7[1];
                        var11 = var7[2];
                        var12 = var7[3];
                    }
                } else {
                    int[] var14 = this.field5448[var2 + -1];
                    var12 = var14[3];
                    var11 = var14[2];
                    var13 = var14[1];
                }
                int var15 = var12 >> 4;
                int var16 = var11 >> 4;
                int var17 = var13 >> 4;
                if (~var17 > -1) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (var15 >= 0) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field5443[var3] = class260.method1678(var15, class260.method1678(var16 << 8, var17 << 16));
            }
        }
    }
}
