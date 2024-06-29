import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class356 extends class436 {

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "[I")
    private int[] field5018 = new int[257];

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field5011 = new String[5];

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "Ljava/lang/String;")
    public static String field5010 = "Stellar Dawn is loading - please wait...";

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    public static int field5021 = 0;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "[[I")
    private int[][] field5019;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(II)V")
    private final void method2298(int arg0, int arg1) {
        ++field5022;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field5019 = new int[4][4];
                                this.field5019[0][3] = 0;
                                this.field5019[0][2] = 4096;
                                this.field5019[0][0] = 2048;
                                this.field5019[0][1] = 0;
                                this.field5019[1][0] = 2867;
                                this.field5019[1][1] = 4096;
                                this.field5019[1][3] = 0;
                                this.field5019[1][2] = 4096;
                                this.field5019[2][1] = 4096;
                                this.field5019[2][2] = 4096;
                                this.field5019[2][3] = 0;
                                this.field5019[2][0] = 3276;
                                this.field5019[3][3] = 0;
                                this.field5019[3][0] = 4096;
                                this.field5019[3][1] = 4096;
                                this.field5019[3][2] = 0;
                            } else {
                                this.field5019 = new int[16][4];
                                this.field5019[0][3] = 321;
                                this.field5019[0][2] = 192;
                                this.field5019[0][0] = 0;
                                this.field5019[0][1] = 80;
                                this.field5019[1][3] = 562;
                                this.field5019[1][1] = 321;
                                this.field5019[1][2] = 449;
                                this.field5019[1][0] = 155;
                                this.field5019[2][2] = 690;
                                this.field5019[2][0] = 389;
                                this.field5019[2][1] = 578;
                                this.field5019[2][3] = 803;
                                this.field5019[3][3] = 1140;
                                this.field5019[3][2] = 995;
                                this.field5019[3][0] = 671;
                                this.field5019[3][1] = 947;
                                this.field5019[4][1] = 1285;
                                this.field5019[4][3] = 1509;
                                this.field5019[4][2] = 1397;
                                this.field5019[4][0] = 897;
                                this.field5019[5][2] = 1429;
                                this.field5019[5][0] = 1175;
                                this.field5019[5][3] = 1413;
                                this.field5019[5][1] = 1525;
                                this.field5019[6][1] = 1734;
                                this.field5019[6][3] = 1333;
                                this.field5019[6][0] = 1368;
                                this.field5019[6][2] = 1461;
                                this.field5019[7][3] = 1702;
                                this.field5019[7][2] = 1525;
                                this.field5019[7][1] = 1413;
                                this.field5019[7][0] = 1507;
                                this.field5019[8][1] = 1108;
                                this.field5019[8][2] = 1590;
                                this.field5019[8][3] = 2056;
                                this.field5019[8][0] = 1736;
                                this.field5019[9][1] = 1766;
                                this.field5019[9][2] = 2056;
                                this.field5019[9][3] = 2666;
                                this.field5019[9][0] = 2088;
                                this.field5019[10][3] = 3276;
                                this.field5019[10][2] = 2586;
                                this.field5019[10][1] = 2409;
                                this.field5019[10][0] = 2355;
                                this.field5019[11][0] = 2691;
                                this.field5019[11][1] = 3116;
                                this.field5019[11][2] = 3148;
                                this.field5019[11][3] = 3228;
                                this.field5019[12][0] = 3031;
                                this.field5019[12][1] = 3806;
                                this.field5019[12][3] = 3196;
                                this.field5019[12][2] = 3710;
                                this.field5019[13][1] = 3437;
                                this.field5019[13][3] = 3019;
                                this.field5019[13][2] = 3421;
                                this.field5019[13][0] = 3522;
                                this.field5019[14][1] = 3116;
                                this.field5019[14][0] = 3727;
                                this.field5019[14][2] = 3148;
                                this.field5019[14][3] = 3228;
                                this.field5019[15][3] = 2746;
                                this.field5019[15][1] = 2377;
                                this.field5019[15][2] = 2505;
                                this.field5019[15][0] = 4096;
                            }
                        } else {
                            this.field5019 = new int[6][4];
                            this.field5019[0][1] = 0;
                            this.field5019[0][0] = 0;
                            this.field5019[0][2] = 0;
                            this.field5019[0][3] = 0;
                            this.field5019[1][2] = 0;
                            this.field5019[1][3] = 1493;
                            this.field5019[1][1] = 0;
                            this.field5019[1][0] = 1843;
                            this.field5019[2][0] = 2457;
                            this.field5019[2][1] = 0;
                            this.field5019[2][3] = 2939;
                            this.field5019[2][2] = 0;
                            this.field5019[3][2] = 1124;
                            this.field5019[3][3] = 3565;
                            this.field5019[3][1] = 0;
                            this.field5019[3][0] = 2781;
                            this.field5019[4][1] = 546;
                            this.field5019[4][3] = 4031;
                            this.field5019[4][2] = 3084;
                            this.field5019[4][0] = 3481;
                            this.field5019[5][3] = 4096;
                            this.field5019[5][2] = 4096;
                            this.field5019[5][0] = 4096;
                            this.field5019[5][1] = 4096;
                        }
                    } else {
                        this.field5019 = new int[7][4];
                        this.field5019[0][3] = 4096;
                        this.field5019[0][2] = 0;
                        this.field5019[0][0] = 0;
                        this.field5019[0][1] = 0;
                        this.field5019[1][3] = 4096;
                        this.field5019[1][2] = 4096;
                        this.field5019[1][1] = 0;
                        this.field5019[1][0] = 663;
                        this.field5019[2][1] = 0;
                        this.field5019[2][2] = 4096;
                        this.field5019[2][3] = 0;
                        this.field5019[2][0] = 1363;
                        this.field5019[3][0] = 2048;
                        this.field5019[3][2] = 4096;
                        this.field5019[3][1] = 4096;
                        this.field5019[3][3] = 0;
                        this.field5019[4][2] = 0;
                        this.field5019[4][0] = 2727;
                        this.field5019[4][1] = 4096;
                        this.field5019[4][3] = 0;
                        this.field5019[5][1] = 4096;
                        this.field5019[5][3] = 4096;
                        this.field5019[5][0] = 3411;
                        this.field5019[5][2] = 0;
                        this.field5019[6][1] = 0;
                        this.field5019[6][0] = 4096;
                        this.field5019[6][3] = 4096;
                        this.field5019[6][2] = 0;
                    }
                } else {
                    this.field5019 = new int[8][4];
                    this.field5019[0][2] = 2602;
                    this.field5019[0][1] = 2650;
                    this.field5019[0][3] = 2361;
                    this.field5019[0][0] = 0;
                    this.field5019[1][3] = 1558;
                    this.field5019[1][2] = 1799;
                    this.field5019[1][1] = 2313;
                    this.field5019[1][0] = 2867;
                    this.field5019[2][2] = 1734;
                    this.field5019[2][0] = 3072;
                    this.field5019[2][3] = 1413;
                    this.field5019[2][1] = 2618;
                    this.field5019[3][0] = 3276;
                    this.field5019[3][1] = 2296;
                    this.field5019[3][2] = 1220;
                    this.field5019[3][3] = 947;
                    this.field5019[4][2] = 963;
                    this.field5019[4][0] = 3481;
                    this.field5019[4][1] = 2072;
                    this.field5019[4][3] = 722;
                    this.field5019[5][0] = 3686;
                    this.field5019[5][2] = 2152;
                    this.field5019[5][1] = 2730;
                    this.field5019[5][3] = 1766;
                    this.field5019[6][0] = 3891;
                    this.field5019[6][1] = 2232;
                    this.field5019[6][3] = 915;
                    this.field5019[6][2] = 1060;
                    this.field5019[7][3] = 1140;
                    this.field5019[7][0] = 4096;
                    this.field5019[7][1] = 1686;
                    this.field5019[7][2] = 1413;
                }
            } else {
                this.field5019 = new int[2][4];
                this.field5019[0][0] = 0;
                this.field5019[0][1] = 0;
                this.field5019[0][2] = 0;
                this.field5019[0][3] = 0;
                this.field5019[1][0] = 4096;
                this.field5019[1][1] = 4096;
                this.field5019[1][3] = 4096;
                this.field5019[1][2] = 4096;
            }
        }
        if (arg1 != 789) {
            this.method85(22, -27);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg0 != 34) {
            method2300((byte) 93, -123, 37, 1, 100);
        }
        ++field5013;
        if (arg1 == 0) {
            int var4 = arg2.method2429(0);
            if (var4 != 0) {
                this.method2298(var4, arg0 ^ 823);
            } else {
                this.field5019 = new int[arg2.method2429(0)][4];
                for (int var5 = 0; this.field5019.length > var5; ++var5) {
                    this.field5019[var5][0] = arg2.method2403((byte) 72);
                    this.field5019[var5][1] = arg2.method2429(0) << 4;
                    this.field5019[var5][2] = arg2.method2429(arg0 + -34) << 4;
                    this.field5019[var5][3] = arg2.method2429(0) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method2299(String arg0, byte arg1) throws ClassNotFoundException {
        ++field5014;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else {
            if (arg1 != -27) {
                field5020 = -98;
            }
            if (arg0.equals("I")) {
                return Integer.TYPE;
            } else if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else {
                return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BIIII)V")
    public static final void method2300(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5015;
        class399 var5 = class269.method1655(8, arg1, -58);
        var5.method2583((byte) 71);
        var5.field5829 = arg4;
        int var6 = -24 / ((60 - arg0) / 62);
        var5.field5837 = arg3;
        var5.field5842 = arg2;
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V")
    public static void method2301(int arg0) {
        int var1 = 121 % ((52 - arg0) / 52);
        field5010 = null;
        field5011 = null;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (this.field5019 == null) {
            this.method2298(1, 789);
        }
        ++field5009;
        this.method2302(arg0 ^ -10);
        if (arg0 != -14) {
            this.method85(98, 27);
        }
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V")
    private final void method2302(int arg0) {
        if (arg0 == 4) {
            ++field5017;
            int var2 = this.field5019.length;
            if (var2 > 0) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var2 > var6 && var5 >= this.field5019[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var4 <= ~var2) {
                        int[] var7 = this.field5019[var2 + -1];
                        var8 = var7[1];
                        var9 = var7[2];
                        var10 = var7[3];
                    } else {
                        int[] var11 = this.field5019[var4];
                        if (var4 <= 0) {
                            var8 = var11[1];
                            var10 = var11[3];
                            var9 = var11[2];
                        } else {
                            int[] var12 = this.field5019[var4 + -1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                            int var14 = -var13 + 4096;
                            var10 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                            var9 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                            var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                        }
                    }
                    int var15 = var9 >> 4;
                    int var16 = var8 >> 4;
                    int var17 = var10 >> 4;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (var15 > 255) {
                        var15 = 255;
                    }
                    if (~var16 <= -1) {
                        if (var16 > 255) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (var17 > 255) {
                        var17 = 255;
                    }
                    this.field5018[var3] = class311.method1970(var17, class311.method1970(var15 << 8, var16 << 16));
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)[[I")
    public final int[][] method85(int arg0, int arg1) {
        ++field5012;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (super.field6259.field3950) {
            int[] var4 = this.method2729(0, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class43.field653; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field5018[var9];
                var5[var8] = class318.method2028(var10 >> 12, 4080);
                var6[var8] = class318.method2028(65280, var10) >> 4;
                var7[var8] = class318.method2028(var10, 255) << 4;
            }
        }
        if (arg0 != -13348) {
            field5021 = 6;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class356() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "(I)V")
    public static final void method2303(int arg0) {
        ++field5016;
        if (arg0 != -20844) {
            method2300((byte) 18, -95, 43, -51, -124);
        }
        class55.method372();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class24.field326[var1].method24((byte) -118);
        }
        class157.method1058(true);
        class33.method246(-1);
        System.gc();
    }
}
