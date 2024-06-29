import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class32 extends class139 {

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "Z")
    public static boolean field638 = false;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "Lfc;")
    public static class54 field632 = new class54(30);

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "Lrf;")
    public static class163 field640 = class53.method392(51, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "Lu;")
    public static class184 field636;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "[[I")
    private int[][] field631;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        ++field637;
        if (arg1 != 21) {
            this.method212(-68, -77);
        }
        if (~arg0 == -1) {
            int var4 = arg2.method344(255);
            if (~var4 != -1) {
                this.method212(1, var4);
            } else {
                this.field631 = new int[arg2.method344(255)][4];
                for (int var5 = 0; ~this.field631.length < ~var5; ++var5) {
                    this.field631[var5][0] = arg2.method390((byte) 125);
                    this.field631[var5][1] = arg2.method344(255) << 4;
                    this.field631[var5][2] = arg2.method344(class70.method502(arg1, 234)) << 4;
                    this.field631[var5][3] = arg2.method344(255) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        ++field634;
        if (this.field631 == null) {
            this.method212(arg0 ^ 1, 1);
        }
        if (arg0 != 0) {
            this.method212(-121, 39);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class32() {
        super(1, false);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BZLja;)V")
    public static final void method211(byte arg0, boolean arg1, class87 arg2) {
        ++field639;
        int var3 = arg2.field1903;
        int var4 = (int) arg2.field1950;
        arg2.method630(69);
        if (arg1) {
            class201.method1321(124, var3);
        }
        class118.method810(var3, -107);
        class84 var5 = class138.method907(var4, false);
        if (var5 != null) {
            class194.method1295((byte) -128, var5);
        }
        class184.field3678 = 0;
        field638 = false;
        class191.method1287(class118.field2507, class19.field305, class4.field43, class193.field3803, -7807);
        if (~class62.field1314 != 0) {
            class31.method208(1, class62.field1314, (byte) -123);
        }
        if (arg0 >= -1) {
            field632 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(II)V")
    private final void method212(int arg0, int arg1) {
        ++field635;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field631 = new int[4][4];
                                this.field631[0][3] = 0;
                                this.field631[0][1] = 0;
                                this.field631[0][0] = 2048;
                                this.field631[1][0] = 2867;
                                this.field631[0][2] = 4096;
                                this.field631[1][3] = 0;
                                this.field631[1][1] = 4096;
                                this.field631[1][2] = 4096;
                                this.field631[2][3] = 0;
                                this.field631[2][2] = 4096;
                                this.field631[2][0] = 3276;
                                this.field631[3][3] = 0;
                                this.field631[3][2] = 0;
                                this.field631[3][0] = 4096;
                                this.field631[2][1] = 4096;
                                this.field631[3][1] = 4096;
                            } else {
                                this.field631 = new int[16][4];
                                this.field631[0][3] = 321;
                                this.field631[0][2] = 192;
                                this.field631[1][3] = 562;
                                this.field631[1][2] = 449;
                                this.field631[0][0] = 0;
                                this.field631[2][3] = 803;
                                this.field631[2][2] = 690;
                                this.field631[3][2] = 995;
                                this.field631[3][3] = 1140;
                                this.field631[0][1] = 80;
                                this.field631[1][0] = 155;
                                this.field631[4][3] = 1509;
                                this.field631[1][1] = 321;
                                this.field631[5][3] = 1413;
                                this.field631[6][3] = 1333;
                                this.field631[2][1] = 578;
                                this.field631[4][2] = 1397;
                                this.field631[3][1] = 947;
                                this.field631[7][3] = 1702;
                                this.field631[2][0] = 389;
                                this.field631[3][0] = 671;
                                this.field631[8][3] = 2056;
                                this.field631[4][0] = 897;
                                this.field631[5][0] = 1175;
                                this.field631[9][3] = 2666;
                                this.field631[6][0] = 1368;
                                this.field631[5][2] = 1429;
                                this.field631[10][3] = 3276;
                                this.field631[6][2] = 1461;
                                this.field631[7][2] = 1525;
                                this.field631[8][2] = 1590;
                                this.field631[9][2] = 2056;
                                this.field631[4][1] = 1285;
                                this.field631[11][3] = 3228;
                                this.field631[5][1] = 1525;
                                this.field631[6][1] = 1734;
                                this.field631[7][1] = 1413;
                                this.field631[8][1] = 1108;
                                this.field631[9][1] = 1766;
                                this.field631[10][1] = 2409;
                                this.field631[12][3] = 3196;
                                this.field631[10][2] = 2586;
                                this.field631[13][3] = 3019;
                                this.field631[11][2] = 3148;
                                this.field631[11][1] = 3116;
                                this.field631[14][3] = 3228;
                                this.field631[12][2] = 3710;
                                this.field631[7][0] = 1507;
                                this.field631[12][1] = 3806;
                                this.field631[8][0] = 1736;
                                this.field631[15][3] = 2746;
                                this.field631[9][0] = 2088;
                                this.field631[13][1] = 3437;
                                this.field631[10][0] = 2355;
                                this.field631[11][0] = 2691;
                                this.field631[14][1] = 3116;
                                this.field631[12][0] = 3031;
                                this.field631[13][0] = 3522;
                                this.field631[14][0] = 3727;
                                this.field631[15][1] = 2377;
                                this.field631[13][2] = 3421;
                                this.field631[15][0] = 4096;
                                this.field631[14][2] = 3148;
                                this.field631[15][2] = 2505;
                            }
                        } else {
                            this.field631 = new int[6][4];
                            this.field631[0][1] = 0;
                            this.field631[1][1] = 0;
                            this.field631[0][0] = 0;
                            this.field631[0][2] = 0;
                            this.field631[1][2] = 0;
                            this.field631[2][1] = 0;
                            this.field631[3][1] = 0;
                            this.field631[1][0] = 1843;
                            this.field631[4][1] = 546;
                            this.field631[2][0] = 2457;
                            this.field631[2][2] = 0;
                            this.field631[3][2] = 1124;
                            this.field631[4][2] = 3084;
                            this.field631[0][3] = 0;
                            this.field631[5][2] = 4096;
                            this.field631[5][1] = 4096;
                            this.field631[3][0] = 2781;
                            this.field631[4][0] = 3481;
                            this.field631[5][0] = 4096;
                            this.field631[1][3] = 1493;
                            this.field631[2][3] = 2939;
                            this.field631[3][3] = 3565;
                            this.field631[4][3] = 4031;
                            this.field631[5][3] = 4096;
                        }
                    } else {
                        this.field631 = new int[7][4];
                        this.field631[0][2] = 0;
                        this.field631[1][2] = 4096;
                        this.field631[2][2] = 4096;
                        this.field631[0][1] = 0;
                        this.field631[3][2] = 4096;
                        this.field631[4][2] = 0;
                        this.field631[0][0] = 0;
                        this.field631[0][3] = 4096;
                        this.field631[5][2] = 0;
                        this.field631[6][2] = 0;
                        this.field631[1][0] = 663;
                        this.field631[1][3] = 4096;
                        this.field631[2][3] = 0;
                        this.field631[1][1] = 0;
                        this.field631[3][3] = 0;
                        this.field631[2][1] = 0;
                        this.field631[4][3] = 0;
                        this.field631[3][1] = 4096;
                        this.field631[4][1] = 4096;
                        this.field631[5][3] = 4096;
                        this.field631[6][3] = 4096;
                        this.field631[5][1] = 4096;
                        this.field631[6][1] = 0;
                        this.field631[2][0] = 1363;
                        this.field631[3][0] = 2048;
                        this.field631[4][0] = 2727;
                        this.field631[5][0] = 3411;
                        this.field631[6][0] = 4096;
                    }
                } else {
                    this.field631 = new int[8][4];
                    this.field631[0][1] = 2650;
                    this.field631[0][3] = 2361;
                    this.field631[1][3] = 1558;
                    this.field631[0][0] = 0;
                    this.field631[2][3] = 1413;
                    this.field631[1][1] = 2313;
                    this.field631[1][0] = 2867;
                    this.field631[2][0] = 3072;
                    this.field631[3][0] = 3276;
                    this.field631[2][1] = 2618;
                    this.field631[3][1] = 2296;
                    this.field631[0][2] = 2602;
                    this.field631[1][2] = 1799;
                    this.field631[4][1] = 2072;
                    this.field631[4][0] = 3481;
                    this.field631[3][3] = 947;
                    this.field631[2][2] = 1734;
                    this.field631[3][2] = 1220;
                    this.field631[5][0] = 3686;
                    this.field631[6][0] = 3891;
                    this.field631[5][1] = 2730;
                    this.field631[4][3] = 722;
                    this.field631[7][0] = 4096;
                    this.field631[4][2] = 963;
                    this.field631[5][3] = 1766;
                    this.field631[6][1] = 2232;
                    this.field631[6][3] = 915;
                    this.field631[5][2] = 2152;
                    this.field631[7][1] = 1686;
                    this.field631[7][3] = 1140;
                    this.field631[6][2] = 1060;
                    this.field631[7][2] = 1413;
                }
            } else {
                this.field631 = new int[2][4];
                this.field631[0][3] = 0;
                this.field631[0][1] = 0;
                this.field631[0][0] = 0;
                this.field631[0][2] = 0;
                this.field631[1][0] = 4096;
                this.field631[1][2] = 4096;
                this.field631[1][3] = 4096;
                this.field631[1][1] = 4096;
            }
        }
        if (arg0 != 1) {
            field632 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field633;
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885) {
            int var4 = this.field631.length;
            int[] var5 = this.method917(arg1, 0, true);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            if (var4 <= 0) {
                for (int var9 = 0; ~var9 > ~class23.field402; ++var9) {
                    var7[var9] = 0;
                    var8[var9] = 0;
                    var6[var9] = 0;
                }
            } else {
                for (int var10 = 0; ~class23.field402 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = var5[var10];
                    for (int var13 = 0; ~var13 > ~var4 && this.field631[var13][0] <= var12; ++var13) {
                        ++var11;
                    }
                    if (var11 >= var4) {
                        int[] var14 = this.field631[var4 + -1];
                        var7[var10] = var14[1];
                        var8[var10] = var14[2];
                        var6[var10] = var14[3];
                    } else {
                        int[] var15 = this.field631[var11];
                        if (var11 <= 0) {
                            var7[var10] = var15[1];
                            var8[var10] = var15[2];
                            var6[var10] = var15[3];
                        } else {
                            int[] var16 = this.field631[var11 + -1];
                            int var17 = (-var16[0] + var12 << 12) / (var15[0] + -var16[0]);
                            int var18 = -var17 + 4096;
                            var7[var10] = var15[1] * var17 - -(var16[1] * var18) >> 12;
                            var8[var10] = var15[2] * var17 + var16[2] * var18 >> 12;
                            var6[var10] = var15[3] * var17 + var16[3] * var18 >> 12;
                        }
                    }
                }
            }
        }
        if (arg0 < 53) {
            method211((byte) -60, false, (class87) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
    public static void method213(int arg0) {
        field640 = null;
        field632 = null;
        field636 = null;
        if (arg0 != -24121) {
            method211((byte) 26, true, (class87) null);
        }
    }
}
