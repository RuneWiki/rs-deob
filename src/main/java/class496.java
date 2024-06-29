import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class496 extends class136 {

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "[I")
    private int[] field7270 = new int[257];

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "Lsl;")
    public static class318 field7272 = new class318(0, -1);

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7276 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field7278 = 0;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field7279 = 0;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field7277 = -1;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "[I")
    public static int[] field7280;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "[[I")
    private int[][] field7274;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public final void method269(boolean arg0) {
        if (arg0) {
            field7272 = null;
        }
        if (this.field7274 == null) {
            this.method2972(1, (byte) -68);
        }
        ++field7273;
        this.method2970(-10610);
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V")
    private final void method2970(int arg0) {
        if (arg0 == -10610) {
            ++field7268;
            int var2 = this.field7274.length;
            if (~var2 < -1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var2 < ~var6 && ~this.field7274[var6][0] >= ~var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var2 <= var4) {
                        int[] var7 = this.field7274[var2 + -1];
                        var8 = var7[2];
                        var9 = var7[3];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field7274[var4];
                        if (var4 <= 0) {
                            var8 = var11[2];
                            var9 = var11[3];
                            var10 = var11[1];
                        } else {
                            int[] var12 = this.field7274[var4 + -1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                            int var14 = 4096 - var13;
                            var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                            var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                            var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                        }
                    }
                    int var15 = var9 >> 4;
                    int var16 = var10 >> 4;
                    int var17 = var8 >> 4;
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (var15 > 255) {
                        var15 = 255;
                    }
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (~var16 < -256) {
                        var16 = 255;
                    }
                    if (~var17 <= -1) {
                        if (var17 > 255) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    this.field7270[var3] = class244.method1606(var15, class244.method1606(var17 << 8, var16 << 16));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg1 == 0) {
            int var4 = arg2.method577(arg0 ^ 251);
            if (~var4 == -1) {
                this.field7274 = new int[arg2.method577(255)][4];
                for (int var5 = 0; ~var5 > ~this.field7274.length; ++var5) {
                    this.field7274[var5][0] = arg2.method623((byte) -89);
                    this.field7274[var5][1] = arg2.method577(255) << 4;
                    this.field7274[var5][2] = arg2.method577(255) << 4;
                    this.field7274[var5][3] = arg2.method577(255) << 4;
                }
            } else {
                this.method2972(var4, (byte) -96);
            }
        }
        if (arg0 != 4) {
            this.field7270 = null;
        }
        ++field7271;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()V")
    public static final void method2971() {
        if (class418.field6169 != null) {
            for (int var0 = 0; var0 < class418.field6169.length; ++var0) {
                for (int var1 = 0; var1 < class241.field3562; ++var1) {
                    for (int var2 = 0; var2 < class497.field7388; ++var2) {
                        if (class418.field6169[var0][var1][var2] != null) {
                            class418.field6169[var0][var1][var2].method1071((byte) 0);
                        }
                        class418.field6169[var0][var1][var2] = null;
                    }
                }
            }
        }
        class418.field6169 = null;
        class283.field4115 = null;
        if (class336.field4678 != null) {
            for (int var3 = 0; var3 < class336.field4678.length; ++var3) {
                for (int var4 = 0; var4 < class241.field3562; ++var4) {
                    for (int var5 = 0; var5 < class497.field7388; ++var5) {
                        if (class336.field4678[var3][var4][var5] != null) {
                            class336.field4678[var3][var4][var5].method1071((byte) 0);
                        }
                        class336.field4678[var3][var4][var5] = null;
                    }
                }
            }
        }
        class336.field4678 = null;
        class52.field578 = null;
        class422.field6240 = null;
        class131.field1899 = null;
        class209.field3030 = 0;
        if (class382.field5621 != null) {
            for (int var6 = 0; var6 < class209.field3030; ++var6) {
                class382.field5621[var6] = null;
            }
        }
        if (class481.field7063 != null) {
            for (int var7 = 0; var7 < class435.field6376; ++var7) {
                class481.field7063[var7] = null;
            }
            class435.field6376 = 0;
        }
        if (class9.field115 != null) {
            for (int var8 = 0; var8 < class122.field1791; ++var8) {
                class9.field115[var8] = null;
            }
            for (int var9 = 0; var9 < class308.field4395; ++var9) {
                for (int var10 = 0; var10 < class241.field3562; ++var10) {
                    for (int var11 = 0; var11 < class497.field7388; ++var11) {
                        class270.field3980[var9][var10][var11] = 0L;
                    }
                }
            }
            class122.field1791 = 0;
        }
        class6.field80 = null;
        class393.method2407(false);
        class111.field1573.method2953(79);
        class453.field6667 = null;
        class394.field5789 = null;
        class506.field7486 = null;
        class198.field2896 = null;
        class405.field6000 = null;
        class442.field6561 = null;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class496() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)V")
    private final void method2972(int arg0, byte arg1) {
        if (arg1 >= -64) {
            this.field7270 = null;
        }
        ++field7275;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field7274 = new int[4][4];
                                    this.field7274[0][3] = 0;
                                    this.field7274[0][1] = 0;
                                    this.field7274[0][2] = 4096;
                                    this.field7274[0][0] = 2048;
                                    this.field7274[1][0] = 2867;
                                    this.field7274[1][1] = 4096;
                                    this.field7274[1][2] = 4096;
                                    this.field7274[1][3] = 0;
                                    this.field7274[2][0] = 3276;
                                    this.field7274[2][1] = 4096;
                                    this.field7274[2][2] = 4096;
                                    this.field7274[2][3] = 0;
                                    this.field7274[3][2] = 0;
                                    this.field7274[3][3] = 0;
                                    this.field7274[3][0] = 4096;
                                    this.field7274[3][1] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field7274 = new int[16][4];
                                this.field7274[0][0] = 0;
                                this.field7274[0][2] = 192;
                                this.field7274[0][1] = 80;
                                this.field7274[0][3] = 321;
                                this.field7274[1][2] = 449;
                                this.field7274[1][3] = 562;
                                this.field7274[1][1] = 321;
                                this.field7274[1][0] = 155;
                                this.field7274[2][3] = 803;
                                this.field7274[2][1] = 578;
                                this.field7274[2][2] = 690;
                                this.field7274[2][0] = 389;
                                this.field7274[3][2] = 995;
                                this.field7274[3][1] = 947;
                                this.field7274[3][3] = 1140;
                                this.field7274[3][0] = 671;
                                this.field7274[4][2] = 1397;
                                this.field7274[4][1] = 1285;
                                this.field7274[4][3] = 1509;
                                this.field7274[4][0] = 897;
                                this.field7274[5][0] = 1175;
                                this.field7274[5][3] = 1413;
                                this.field7274[5][1] = 1525;
                                this.field7274[5][2] = 1429;
                                this.field7274[6][1] = 1734;
                                this.field7274[6][0] = 1368;
                                this.field7274[6][2] = 1461;
                                this.field7274[6][3] = 1333;
                                this.field7274[7][2] = 1525;
                                this.field7274[7][3] = 1702;
                                this.field7274[7][1] = 1413;
                                this.field7274[7][0] = 1507;
                                this.field7274[8][3] = 2056;
                                this.field7274[8][1] = 1108;
                                this.field7274[8][2] = 1590;
                                this.field7274[8][0] = 1736;
                                this.field7274[9][3] = 2666;
                                this.field7274[9][2] = 2056;
                                this.field7274[9][1] = 1766;
                                this.field7274[9][0] = 2088;
                                this.field7274[10][2] = 2586;
                                this.field7274[10][1] = 2409;
                                this.field7274[10][0] = 2355;
                                this.field7274[10][3] = 3276;
                                this.field7274[11][2] = 3148;
                                this.field7274[11][0] = 2691;
                                this.field7274[11][1] = 3116;
                                this.field7274[11][3] = 3228;
                                this.field7274[12][0] = 3031;
                                this.field7274[12][3] = 3196;
                                this.field7274[12][1] = 3806;
                                this.field7274[12][2] = 3710;
                                this.field7274[13][2] = 3421;
                                this.field7274[13][3] = 3019;
                                this.field7274[13][0] = 3522;
                                this.field7274[13][1] = 3437;
                                this.field7274[14][2] = 3148;
                                this.field7274[14][0] = 3727;
                                this.field7274[14][3] = 3228;
                                this.field7274[14][1] = 3116;
                                this.field7274[15][2] = 2505;
                                this.field7274[15][0] = 4096;
                                this.field7274[15][3] = 2746;
                                this.field7274[15][1] = 2377;
                            }
                        } else {
                            this.field7274 = new int[6][4];
                            this.field7274[0][0] = 0;
                            this.field7274[0][1] = 0;
                            this.field7274[0][3] = 0;
                            this.field7274[0][2] = 0;
                            this.field7274[1][0] = 1843;
                            this.field7274[1][2] = 0;
                            this.field7274[1][1] = 0;
                            this.field7274[1][3] = 1493;
                            this.field7274[2][1] = 0;
                            this.field7274[2][2] = 0;
                            this.field7274[2][0] = 2457;
                            this.field7274[2][3] = 2939;
                            this.field7274[3][1] = 0;
                            this.field7274[3][3] = 3565;
                            this.field7274[3][0] = 2781;
                            this.field7274[3][2] = 1124;
                            this.field7274[4][0] = 3481;
                            this.field7274[4][3] = 4031;
                            this.field7274[4][2] = 3084;
                            this.field7274[4][1] = 546;
                            this.field7274[5][0] = 4096;
                            this.field7274[5][3] = 4096;
                            this.field7274[5][1] = 4096;
                            this.field7274[5][2] = 4096;
                        }
                    } else {
                        this.field7274 = new int[7][4];
                        this.field7274[0][0] = 0;
                        this.field7274[0][1] = 0;
                        this.field7274[0][3] = 4096;
                        this.field7274[0][2] = 0;
                        this.field7274[1][1] = 0;
                        this.field7274[1][2] = 4096;
                        this.field7274[1][0] = 663;
                        this.field7274[1][3] = 4096;
                        this.field7274[2][2] = 4096;
                        this.field7274[2][1] = 0;
                        this.field7274[2][3] = 0;
                        this.field7274[2][0] = 1363;
                        this.field7274[3][2] = 4096;
                        this.field7274[3][0] = 2048;
                        this.field7274[3][3] = 0;
                        this.field7274[3][1] = 4096;
                        this.field7274[4][2] = 0;
                        this.field7274[4][1] = 4096;
                        this.field7274[4][0] = 2727;
                        this.field7274[4][3] = 0;
                        this.field7274[5][3] = 4096;
                        this.field7274[5][1] = 4096;
                        this.field7274[5][2] = 0;
                        this.field7274[5][0] = 3411;
                        this.field7274[6][0] = 4096;
                        this.field7274[6][3] = 4096;
                        this.field7274[6][1] = 0;
                        this.field7274[6][2] = 0;
                    }
                } else {
                    this.field7274 = new int[8][4];
                    this.field7274[0][3] = 2361;
                    this.field7274[0][0] = 0;
                    this.field7274[0][1] = 2650;
                    this.field7274[0][2] = 2602;
                    this.field7274[1][3] = 1558;
                    this.field7274[1][1] = 2313;
                    this.field7274[1][2] = 1799;
                    this.field7274[1][0] = 2867;
                    this.field7274[2][3] = 1413;
                    this.field7274[2][1] = 2618;
                    this.field7274[2][0] = 3072;
                    this.field7274[2][2] = 1734;
                    this.field7274[3][0] = 3276;
                    this.field7274[3][3] = 947;
                    this.field7274[3][1] = 2296;
                    this.field7274[3][2] = 1220;
                    this.field7274[4][3] = 722;
                    this.field7274[4][2] = 963;
                    this.field7274[4][0] = 3481;
                    this.field7274[4][1] = 2072;
                    this.field7274[5][3] = 1766;
                    this.field7274[5][0] = 3686;
                    this.field7274[5][1] = 2730;
                    this.field7274[5][2] = 2152;
                    this.field7274[6][1] = 2232;
                    this.field7274[6][0] = 3891;
                    this.field7274[6][3] = 915;
                    this.field7274[6][2] = 1060;
                    this.field7274[7][0] = 4096;
                    this.field7274[7][1] = 1686;
                    this.field7274[7][2] = 1413;
                    this.field7274[7][3] = 1140;
                }
            } else {
                this.field7274 = new int[2][4];
                this.field7274[0][3] = 0;
                this.field7274[0][1] = 0;
                this.field7274[0][0] = 0;
                this.field7274[0][2] = 0;
                this.field7274[1][1] = 4096;
                this.field7274[1][3] = 4096;
                this.field7274[1][2] = 4096;
                this.field7274[1][0] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)[[I")
    public final int[][] method272(byte arg0, int arg1) {
        ++field7269;
        int[][] var3 = super.field1952.method3127((byte) -118, arg1);
        if (arg0 <= 33) {
            this.method2972(-46, (byte) 89);
        }
        if (super.field1952.field7770) {
            int[] var4 = this.method1033(arg1, 0, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class467.field6889; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field7270[var9];
                var5[var8] = class345.method2089(4080, var10 >> 12);
                var6[var8] = class345.method2089(var10, 65280) >> 4;
                var7[var8] = class345.method2089(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)V")
    public static void method2973(int arg0) {
        field7272 = null;
        field7280 = null;
        field7276 = null;
        if (arg0 != 10) {
            method2973(94);
        }
    }
}
