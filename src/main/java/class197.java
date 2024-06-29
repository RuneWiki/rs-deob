import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class197 extends class139 {

    @OriginalMember(owner = "client!hp", name = "Q", descriptor = "[I")
    private int[] field2875 = new int[257];

    @OriginalMember(owner = "client!hp", name = "R", descriptor = "Ldt;")
    public static class145 field2876 = null;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!hp", name = "O", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!hp", name = "S", descriptor = "Ljava/awt/Image;")
    public static Image field2877;

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "[[I")
    private int[][] field2874;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZIBZ)V")
    public static final void method1198(int arg0, boolean arg1, int arg2, byte arg3, boolean arg4) {
        ++field2868;
        class318.method2037(arg4, 0, class156.field2323.length + -1, -1, arg2, arg1, arg0);
        class105.field1339 = 0;
        class206.field3159 = null;
        if (arg3 <= 13) {
            method1202((byte) 103);
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        ++field2867;
        if (arg0 != 7) {
            field2877 = null;
        }
        if (this.field2874 == null) {
            this.method1199(1, (byte) -127);
        }
        this.method1200(101);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)V")
    private final void method1199(int arg0, byte arg1) {
        ++field2866;
        int var3 = -65 / ((-72 - arg1) / 50);
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field2874 = new int[4][4];
                                    this.field2874[0][2] = 4096;
                                    this.field2874[0][0] = 2048;
                                    this.field2874[0][1] = 0;
                                    this.field2874[0][3] = 0;
                                    this.field2874[1][2] = 4096;
                                    this.field2874[1][0] = 2867;
                                    this.field2874[1][3] = 0;
                                    this.field2874[1][1] = 4096;
                                    this.field2874[2][3] = 0;
                                    this.field2874[2][2] = 4096;
                                    this.field2874[2][1] = 4096;
                                    this.field2874[2][0] = 3276;
                                    this.field2874[3][1] = 4096;
                                    this.field2874[3][2] = 0;
                                    this.field2874[3][3] = 0;
                                    this.field2874[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field2874 = new int[16][4];
                                this.field2874[0][1] = 80;
                                this.field2874[0][2] = 192;
                                this.field2874[0][0] = 0;
                                this.field2874[0][3] = 321;
                                this.field2874[1][3] = 562;
                                this.field2874[1][2] = 449;
                                this.field2874[1][0] = 155;
                                this.field2874[1][1] = 321;
                                this.field2874[2][0] = 389;
                                this.field2874[2][2] = 690;
                                this.field2874[2][1] = 578;
                                this.field2874[2][3] = 803;
                                this.field2874[3][1] = 947;
                                this.field2874[3][2] = 995;
                                this.field2874[3][0] = 671;
                                this.field2874[3][3] = 1140;
                                this.field2874[4][3] = 1509;
                                this.field2874[4][0] = 897;
                                this.field2874[4][2] = 1397;
                                this.field2874[4][1] = 1285;
                                this.field2874[5][0] = 1175;
                                this.field2874[5][1] = 1525;
                                this.field2874[5][2] = 1429;
                                this.field2874[5][3] = 1413;
                                this.field2874[6][1] = 1734;
                                this.field2874[6][2] = 1461;
                                this.field2874[6][0] = 1368;
                                this.field2874[6][3] = 1333;
                                this.field2874[7][0] = 1507;
                                this.field2874[7][2] = 1525;
                                this.field2874[7][3] = 1702;
                                this.field2874[7][1] = 1413;
                                this.field2874[8][3] = 2056;
                                this.field2874[8][0] = 1736;
                                this.field2874[8][2] = 1590;
                                this.field2874[8][1] = 1108;
                                this.field2874[9][1] = 1766;
                                this.field2874[9][2] = 2056;
                                this.field2874[9][0] = 2088;
                                this.field2874[9][3] = 2666;
                                this.field2874[10][1] = 2409;
                                this.field2874[10][2] = 2586;
                                this.field2874[10][0] = 2355;
                                this.field2874[10][3] = 3276;
                                this.field2874[11][1] = 3116;
                                this.field2874[11][2] = 3148;
                                this.field2874[11][3] = 3228;
                                this.field2874[11][0] = 2691;
                                this.field2874[12][1] = 3806;
                                this.field2874[12][0] = 3031;
                                this.field2874[12][2] = 3710;
                                this.field2874[12][3] = 3196;
                                this.field2874[13][3] = 3019;
                                this.field2874[13][2] = 3421;
                                this.field2874[13][1] = 3437;
                                this.field2874[13][0] = 3522;
                                this.field2874[14][3] = 3228;
                                this.field2874[14][1] = 3116;
                                this.field2874[14][2] = 3148;
                                this.field2874[14][0] = 3727;
                                this.field2874[15][3] = 2746;
                                this.field2874[15][1] = 2377;
                                this.field2874[15][0] = 4096;
                                this.field2874[15][2] = 2505;
                            }
                        } else {
                            this.field2874 = new int[6][4];
                            this.field2874[0][2] = 0;
                            this.field2874[0][3] = 0;
                            this.field2874[0][1] = 0;
                            this.field2874[0][0] = 0;
                            this.field2874[1][1] = 0;
                            this.field2874[1][3] = 1493;
                            this.field2874[1][0] = 1843;
                            this.field2874[1][2] = 0;
                            this.field2874[2][0] = 2457;
                            this.field2874[2][2] = 0;
                            this.field2874[2][1] = 0;
                            this.field2874[2][3] = 2939;
                            this.field2874[3][0] = 2781;
                            this.field2874[3][2] = 1124;
                            this.field2874[3][1] = 0;
                            this.field2874[3][3] = 3565;
                            this.field2874[4][0] = 3481;
                            this.field2874[4][1] = 546;
                            this.field2874[4][3] = 4031;
                            this.field2874[4][2] = 3084;
                            this.field2874[5][0] = 4096;
                            this.field2874[5][2] = 4096;
                            this.field2874[5][1] = 4096;
                            this.field2874[5][3] = 4096;
                        }
                    } else {
                        this.field2874 = new int[7][4];
                        this.field2874[0][2] = 0;
                        this.field2874[0][1] = 0;
                        this.field2874[0][3] = 4096;
                        this.field2874[0][0] = 0;
                        this.field2874[1][2] = 4096;
                        this.field2874[1][0] = 663;
                        this.field2874[1][1] = 0;
                        this.field2874[1][3] = 4096;
                        this.field2874[2][0] = 1363;
                        this.field2874[2][3] = 0;
                        this.field2874[2][2] = 4096;
                        this.field2874[2][1] = 0;
                        this.field2874[3][0] = 2048;
                        this.field2874[3][2] = 4096;
                        this.field2874[3][1] = 4096;
                        this.field2874[3][3] = 0;
                        this.field2874[4][1] = 4096;
                        this.field2874[4][3] = 0;
                        this.field2874[4][2] = 0;
                        this.field2874[4][0] = 2727;
                        this.field2874[5][2] = 0;
                        this.field2874[5][3] = 4096;
                        this.field2874[5][0] = 3411;
                        this.field2874[5][1] = 4096;
                        this.field2874[6][1] = 0;
                        this.field2874[6][2] = 0;
                        this.field2874[6][3] = 4096;
                        this.field2874[6][0] = 4096;
                    }
                } else {
                    this.field2874 = new int[8][4];
                    this.field2874[0][1] = 2650;
                    this.field2874[0][0] = 0;
                    this.field2874[0][3] = 2361;
                    this.field2874[0][2] = 2602;
                    this.field2874[1][3] = 1558;
                    this.field2874[1][1] = 2313;
                    this.field2874[1][0] = 2867;
                    this.field2874[1][2] = 1799;
                    this.field2874[2][0] = 3072;
                    this.field2874[2][2] = 1734;
                    this.field2874[2][1] = 2618;
                    this.field2874[2][3] = 1413;
                    this.field2874[3][1] = 2296;
                    this.field2874[3][3] = 947;
                    this.field2874[3][2] = 1220;
                    this.field2874[3][0] = 3276;
                    this.field2874[4][3] = 722;
                    this.field2874[4][0] = 3481;
                    this.field2874[4][2] = 963;
                    this.field2874[4][1] = 2072;
                    this.field2874[5][2] = 2152;
                    this.field2874[5][1] = 2730;
                    this.field2874[5][0] = 3686;
                    this.field2874[5][3] = 1766;
                    this.field2874[6][1] = 2232;
                    this.field2874[6][0] = 3891;
                    this.field2874[6][3] = 915;
                    this.field2874[6][2] = 1060;
                    this.field2874[7][1] = 1686;
                    this.field2874[7][3] = 1140;
                    this.field2874[7][2] = 1413;
                    this.field2874[7][0] = 4096;
                }
            } else {
                this.field2874 = new int[2][4];
                this.field2874[0][1] = 0;
                this.field2874[0][3] = 0;
                this.field2874[0][2] = 0;
                this.field2874[0][0] = 0;
                this.field2874[1][2] = 4096;
                this.field2874[1][3] = 4096;
                this.field2874[1][1] = 4096;
                this.field2874[1][0] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            int var4 = arg0.method1701(arg1 + -23076);
            if (var4 != 0) {
                this.method1199(var4, (byte) 99);
            } else {
                this.field2874 = new int[arg0.method1701(-23121)][4];
                for (int var5 = 0; this.field2874.length > var5; ++var5) {
                    this.field2874[var5][0] = arg0.method1729(65280);
                    this.field2874[var5][1] = arg0.method1701(class125.method786(arg1, 23164)) << 4;
                    this.field2874[var5][2] = arg0.method1701(-23121) << 4;
                    this.field2874[var5][3] = arg0.method1701(class125.method786(arg1, 23164)) << 4;
                }
            }
        }
        ++field2869;
        if (arg1 != -45) {
            field2877 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V")
    private final void method1200(int arg0) {
        ++field2873;
        if (arg0 > 71) {
            int var2 = this.field2874.length;
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var2 > var6 && ~var5 <= ~this.field2874[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var2 >= ~var4) {
                        int[] var7 = this.field2874[var2 - 1];
                        var8 = var7[1];
                        var9 = var7[3];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field2874[var4];
                        if (~var4 >= -1) {
                            var9 = var11[3];
                            var10 = var11[2];
                            var8 = var11[1];
                        } else {
                            int[] var12 = this.field2874[var4 - 1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                            int var14 = -var13 + 4096;
                            var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                            var9 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                            var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                        }
                    }
                    int var15 = var8 >> 4;
                    int var16 = var9 >> 4;
                    int var17 = var10 >> 4;
                    if (~var16 <= -1) {
                        if (~var16 < -256) {
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
                    if (~var15 <= -1) {
                        if (~var15 < -256) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    this.field2875[var3] = class248.method1549(var16, class248.method1549(var17 << 8, var15 << 16));
                }
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
    public class197() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field2872;
        if (arg0 >= -67) {
            return null;
        } else {
            int[][] var3 = super.field1835.method999((byte) 104, arg1);
            if (super.field1835.field2395) {
                int[] var4 = this.method879((byte) -29, arg1, 0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; var8 < class356.field5147; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (var9 > 256) {
                        var9 = 256;
                    }
                    int var10 = this.field2875[var9];
                    var5[var8] = class367.method2256(4080, var10 >> 12);
                    var6[var8] = class367.method2256(var10 >> 4, 4080);
                    var7[var8] = class367.method2256(var10 << 4, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIII)V")
    public static final void method1201(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2870;
        int var5 = arg3;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        class103.method579((byte) 115, -arg1 + arg4, arg1 + arg4, arg0, class128.field1676[arg2]);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            ++var5;
            if (var7 >= 0) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class128.field1676[arg2 - -var6];
                int[] var10 = class128.field1676[arg2 - var6];
                int var11 = arg4 + var5;
                int var12 = -var5 + arg4;
                class103.method579((byte) 115, var12, var11, arg0, var9);
                class103.method579((byte) 115, var12, var11, arg0, var10);
            }
            int var13 = arg4 - -var6;
            int var14 = -var6 + arg4;
            int[] var15 = class128.field1676[arg2 - -var5];
            int[] var16 = class128.field1676[-var5 + arg2];
            class103.method579((byte) 115, var14, var13, arg0, var15);
            class103.method579((byte) 115, var14, var13, arg0, var16);
        }
    }

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "(B)V")
    public static void method1202(byte arg0) {
        field2877 = null;
        field2876 = null;
        if (arg0 > -42) {
            method1201(-60, -74, -4, -7, -33);
        }
    }
}
