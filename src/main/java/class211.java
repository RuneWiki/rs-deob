import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class211 extends class8 {

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "[I")
    private int[] field3451 = new int[257];

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "[I")
    public static int[] field3441 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "Ljava/lang/String;")
    public static String field3448 = "scroll:";

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field3445 = new String[100];

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!gl", name = "W", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "[[B")
    public static byte[][] field3447;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "[[I")
    private int[][] field3438;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1452(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class241.field3894 = arg1;
        class129.field2084 = arg2;
        class148.field2370 = arg3;
        class66.field1083 = new class134[arg0][class241.field3894][class129.field2084];
        class219.field3586 = new int[arg0][class241.field3894 + 1][class129.field2084 + 1];
        if (arg4) {
            class76.field1215 = new class134[1][class241.field3894][class129.field2084];
            class226.field3750 = new int[class241.field3894][class129.field2084];
            class83.field1307 = new int[1][class241.field3894 + 1][class129.field2084 + 1];
        } else {
            class76.field1215 = null;
            class226.field3750 = null;
            class83.field1307 = null;
        }
        class143.method985(false);
        class34.field541 = new class126[500];
        class179.field2821 = 0;
        class175.field2756 = new class126[500];
        class73.field1194 = 0;
        class284.field4482 = new int[arg0][class241.field3894 + 1][class129.field2084 + 1];
        class155.field2505 = new class289[5000];
        class78.field1260 = 0;
        class87.field1394 = new class289[100];
        class254.field4040 = new boolean[class148.field2370 + class148.field2370 + 1][class148.field2370 + class148.field2370 + 1];
        class144.field2315 = new boolean[class148.field2370 + class148.field2370 + 2][class148.field2370 + class148.field2370 + 2];
        class206.field3311 = new byte[arg0][class241.field3894][class129.field2084];
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V")
    public static void method1453(int arg0) {
        int var1 = -113 % ((34 - arg0) / 60);
        field3445 = null;
        field3447 = null;
        field3441 = null;
        field3448 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        int var3 = -7 / ((arg1 - -48) / 46);
        ++field3449;
        int[][] var4 = super.field93.method248(arg0, 17416);
        if (super.field93.field470) {
            int[] var5 = this.method61(arg0, -55, 0);
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            for (int var9 = 0; ~var9 > ~class231.field3798; ++var9) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var10 > 256) {
                    var10 = 256;
                }
                int var11 = this.field3451[var10];
                var8[var9] = class202.method1393(var11, 16711680) >> 12;
                var6[var9] = class202.method1393(4080, var11 >> 4);
                var7[var9] = class202.method1393(4080, var11 << 4);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class211() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method1454(int arg0, String arg1, boolean arg2) {
        ++field3450;
        int var3 = 0;
        String var4 = arg1.toLowerCase();
        short[] var5 = new short[16];
        for (int var6 = arg0; var6 < class136.field2254; ++var6) {
            class12 var9 = class83.method595(var6, -92);
            if ((!arg2 || var9.field163) && var9.field206 == -1 && ~var9.field186 == 0 && ~var9.field177 == -1 && var9.field174.toLowerCase().indexOf(var4) != -1) {
                if (var3 >= 250) {
                    class71.field1165 = -1;
                    class231.field3804 = null;
                    return;
                }
                if (~var5.length >= ~var3) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var3; ++var11) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var3++] = (short) var6;
            }
        }
        class231.field3804 = var5;
        class71.field1165 = var3;
        class197.field3150 = 0;
        String[] var7 = new String[class71.field1165];
        for (int var8 = 0; var8 < class71.field1165; ++var8) {
            var7[var8] = class83.method595(var5[var8], -112).field174;
        }
        class78.method546(class231.field3804, var7, (byte) 91);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)V")
    public static final void method1455(int arg0, boolean arg1) {
        ++field3439;
        if (!arg1) {
            method1455(-52, false);
        }
        class259 var2 = class213.method1464((byte) -103, arg0, 3);
        var2.method1772((byte) 110);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        if (arg0) {
            method1455(-80, false);
        }
        ++field3446;
        if (this.field3438 == null) {
            this.method1458(1, 2);
        }
        this.method1456(4096);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        ++field3443;
        if (arg0 > 62) {
            if (arg2 == 0) {
                int var4 = arg1.method1517((byte) -96);
                if (var4 != 0) {
                    this.method1458(var4, 2);
                } else {
                    this.field3438 = new int[arg1.method1517((byte) -96)][4];
                    for (int var5 = 0; this.field3438.length > var5; ++var5) {
                        this.field3438[var5][0] = arg1.method1521((byte) 113);
                        this.field3438[var5][1] = arg1.method1517((byte) -96) << 4;
                        this.field3438[var5][2] = arg1.method1517((byte) -96) << 4;
                        this.field3438[var5][3] = arg1.method1517((byte) -96) << 4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V")
    private final void method1456(int arg0) {
        ++field3442;
        if (arg0 != 4096) {
            field3444 = -104;
        }
        int var2 = this.field3438.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && ~this.field3438[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (~var2 < ~var4) {
                    int[] var7 = this.field3438[var4];
                    if (var4 > 0) {
                        int[] var8 = this.field3438[var4 + -1];
                        int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[2] * var9 - -(var8[2] * var10) >> 12;
                        var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var13 = var7[3] * var9 + var8[3] * var10 >> 12;
                    } else {
                        var13 = var7[3];
                        var12 = var7[1];
                        var11 = var7[2];
                    }
                } else {
                    int[] var14 = this.field3438[var2 + -1];
                    var12 = var14[1];
                    var13 = var14[3];
                    var11 = var14[2];
                }
                int var15 = var11 >> 4;
                int var16 = var12 >> 4;
                if (var15 >= 0) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                int var17 = var13 >> 4;
                if (~var16 <= -1) {
                    if (~var16 < -256) {
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
                this.field3451[var3] = class220.method1495(var17, class220.method1495(var15 << 8, var16 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)I")
    public static final int method1457(int arg0) {
        ++field3440;
        if (arg0 != 0) {
            field3441 = null;
        }
        return ((~class107.field1745 != -1 ? 1 : 0) << 22) + ((~class94.field1550 == -1 ? 0 : 1) << 20) + ((class107.field1776 ? 1 : 0) << 16) + ((!class236.field3851 ? 0 : 1) << 15) + ((3 & class97.field1575) << 11) + (((!class78.field1254 ? 0 : 1) << 10) + ((!class79.field1269 ? 0 : 1) << 8) + (7 & class20.field342) - -((class10.field151 ? 1 : 0) << 3) - (-((class229.field3785 ? 1 : 0) << 4) - ((class22.field361 ? 1 : 0) << 5))) - (-((class284.field4487 ? 1 : 0) << 6) - (((!class51.field893 ? 0 : 1) << 7) + ((!class281.field4459 ? 0 : 1) << 9) + ((class169.field2671 ? 1 : 0) << 13))) + ((!class260.field4139 ? 0 : 1) << 19) - (-((~class284.field4480 != -1 ? 1 : 0) << 21) + -(class130.method924() << 23));
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(II)V")
    private final void method1458(int arg0, int arg1) {
        if (arg1 == 2) {
            ++field3452;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (~arg0 == -7) {
                                        this.field3438 = new int[4][4];
                                        this.field3438[0][1] = 0;
                                        this.field3438[1][1] = 4096;
                                        this.field3438[0][2] = 4096;
                                        this.field3438[0][0] = 2048;
                                        this.field3438[2][1] = 4096;
                                        this.field3438[3][1] = 4096;
                                        this.field3438[1][2] = 4096;
                                        this.field3438[1][0] = 2867;
                                        this.field3438[0][3] = 0;
                                        this.field3438[2][0] = 3276;
                                        this.field3438[3][0] = 4096;
                                        this.field3438[1][3] = 0;
                                        this.field3438[2][3] = 0;
                                        this.field3438[2][2] = 4096;
                                        this.field3438[3][2] = 0;
                                        this.field3438[3][3] = 0;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field3438 = new int[16][4];
                                    this.field3438[0][3] = 321;
                                    this.field3438[0][0] = 0;
                                    this.field3438[0][1] = 80;
                                    this.field3438[0][2] = 192;
                                    this.field3438[1][2] = 449;
                                    this.field3438[1][3] = 562;
                                    this.field3438[2][3] = 803;
                                    this.field3438[2][2] = 690;
                                    this.field3438[1][1] = 321;
                                    this.field3438[2][1] = 578;
                                    this.field3438[3][2] = 995;
                                    this.field3438[4][2] = 1397;
                                    this.field3438[3][1] = 947;
                                    this.field3438[1][0] = 155;
                                    this.field3438[3][3] = 1140;
                                    this.field3438[4][3] = 1509;
                                    this.field3438[4][1] = 1285;
                                    this.field3438[2][0] = 389;
                                    this.field3438[5][3] = 1413;
                                    this.field3438[5][1] = 1525;
                                    this.field3438[6][1] = 1734;
                                    this.field3438[7][1] = 1413;
                                    this.field3438[6][3] = 1333;
                                    this.field3438[3][0] = 671;
                                    this.field3438[7][3] = 1702;
                                    this.field3438[4][0] = 897;
                                    this.field3438[5][0] = 1175;
                                    this.field3438[5][2] = 1429;
                                    this.field3438[6][0] = 1368;
                                    this.field3438[6][2] = 1461;
                                    this.field3438[7][0] = 1507;
                                    this.field3438[8][1] = 1108;
                                    this.field3438[9][1] = 1766;
                                    this.field3438[10][1] = 2409;
                                    this.field3438[11][1] = 3116;
                                    this.field3438[8][0] = 1736;
                                    this.field3438[12][1] = 3806;
                                    this.field3438[9][0] = 2088;
                                    this.field3438[13][1] = 3437;
                                    this.field3438[8][3] = 2056;
                                    this.field3438[7][2] = 1525;
                                    this.field3438[8][2] = 1590;
                                    this.field3438[14][1] = 3116;
                                    this.field3438[9][3] = 2666;
                                    this.field3438[9][2] = 2056;
                                    this.field3438[15][1] = 2377;
                                    this.field3438[10][3] = 3276;
                                    this.field3438[10][0] = 2355;
                                    this.field3438[11][0] = 2691;
                                    this.field3438[10][2] = 2586;
                                    this.field3438[12][0] = 3031;
                                    this.field3438[11][2] = 3148;
                                    this.field3438[11][3] = 3228;
                                    this.field3438[12][2] = 3710;
                                    this.field3438[12][3] = 3196;
                                    this.field3438[13][3] = 3019;
                                    this.field3438[13][0] = 3522;
                                    this.field3438[14][3] = 3228;
                                    this.field3438[14][0] = 3727;
                                    this.field3438[13][2] = 3421;
                                    this.field3438[15][0] = 4096;
                                    this.field3438[15][3] = 2746;
                                    this.field3438[14][2] = 3148;
                                    this.field3438[15][2] = 2505;
                                }
                            } else {
                                this.field3438 = new int[6][4];
                                this.field3438[0][0] = 0;
                                this.field3438[0][1] = 0;
                                this.field3438[0][3] = 0;
                                this.field3438[1][0] = 1843;
                                this.field3438[0][2] = 0;
                                this.field3438[1][1] = 0;
                                this.field3438[2][0] = 2457;
                                this.field3438[1][3] = 1493;
                                this.field3438[2][3] = 2939;
                                this.field3438[3][0] = 2781;
                                this.field3438[4][0] = 3481;
                                this.field3438[3][3] = 3565;
                                this.field3438[1][2] = 0;
                                this.field3438[5][0] = 4096;
                                this.field3438[2][2] = 0;
                                this.field3438[2][1] = 0;
                                this.field3438[3][2] = 1124;
                                this.field3438[3][1] = 0;
                                this.field3438[4][2] = 3084;
                                this.field3438[4][3] = 4031;
                                this.field3438[4][1] = 546;
                                this.field3438[5][2] = 4096;
                                this.field3438[5][1] = 4096;
                                this.field3438[5][3] = 4096;
                            }
                        } else {
                            this.field3438 = new int[7][4];
                            this.field3438[0][0] = 0;
                            this.field3438[0][3] = 4096;
                            this.field3438[0][1] = 0;
                            this.field3438[1][0] = 663;
                            this.field3438[1][1] = 0;
                            this.field3438[0][2] = 0;
                            this.field3438[2][0] = 1363;
                            this.field3438[1][3] = 4096;
                            this.field3438[1][2] = 4096;
                            this.field3438[2][3] = 0;
                            this.field3438[2][2] = 4096;
                            this.field3438[3][0] = 2048;
                            this.field3438[3][2] = 4096;
                            this.field3438[2][1] = 0;
                            this.field3438[3][1] = 4096;
                            this.field3438[4][1] = 4096;
                            this.field3438[4][2] = 0;
                            this.field3438[4][0] = 2727;
                            this.field3438[5][1] = 4096;
                            this.field3438[6][1] = 0;
                            this.field3438[5][0] = 3411;
                            this.field3438[5][2] = 0;
                            this.field3438[3][3] = 0;
                            this.field3438[6][0] = 4096;
                            this.field3438[4][3] = 0;
                            this.field3438[5][3] = 4096;
                            this.field3438[6][2] = 0;
                            this.field3438[6][3] = 4096;
                        }
                    } else {
                        this.field3438 = new int[8][4];
                        this.field3438[0][1] = 2650;
                        this.field3438[0][3] = 2361;
                        this.field3438[1][3] = 1558;
                        this.field3438[2][3] = 1413;
                        this.field3438[0][0] = 0;
                        this.field3438[1][0] = 2867;
                        this.field3438[1][1] = 2313;
                        this.field3438[2][1] = 2618;
                        this.field3438[3][3] = 947;
                        this.field3438[2][0] = 3072;
                        this.field3438[0][2] = 2602;
                        this.field3438[3][1] = 2296;
                        this.field3438[1][2] = 1799;
                        this.field3438[4][1] = 2072;
                        this.field3438[4][3] = 722;
                        this.field3438[5][1] = 2730;
                        this.field3438[5][3] = 1766;
                        this.field3438[6][1] = 2232;
                        this.field3438[7][1] = 1686;
                        this.field3438[6][3] = 915;
                        this.field3438[2][2] = 1734;
                        this.field3438[7][3] = 1140;
                        this.field3438[3][2] = 1220;
                        this.field3438[3][0] = 3276;
                        this.field3438[4][0] = 3481;
                        this.field3438[5][0] = 3686;
                        this.field3438[6][0] = 3891;
                        this.field3438[7][0] = 4096;
                        this.field3438[4][2] = 963;
                        this.field3438[5][2] = 2152;
                        this.field3438[6][2] = 1060;
                        this.field3438[7][2] = 1413;
                    }
                } else {
                    this.field3438 = new int[2][4];
                    this.field3438[0][2] = 0;
                    this.field3438[0][3] = 0;
                    this.field3438[1][3] = 4096;
                    this.field3438[1][2] = 4096;
                    this.field3438[0][1] = 0;
                    this.field3438[1][1] = 4096;
                    this.field3438[0][0] = 0;
                    this.field3438[1][0] = 4096;
                }
            }
        }
    }
}
