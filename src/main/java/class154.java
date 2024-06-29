import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class154 extends class264 {

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "[I")
    private int[] field2130 = new int[257];

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ln", name = "W", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ln", name = "X", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "[[I")
    private int[][] field2131;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "[[I")
    public static int[][] field2133;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "[[Z")
    public static boolean[][] field2129;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field2137;
        if (~arg2 == -1) {
            int var4 = arg1.method1172((byte) 62);
            if (~var4 == -1) {
                this.field2131 = new int[arg1.method1172((byte) -115)][4];
                for (int var5 = 0; ~var5 > ~this.field2131.length; ++var5) {
                    this.field2131[var5][0] = arg1.method1134(-16848);
                    this.field2131[var5][1] = arg1.method1172((byte) -112) << 4;
                    this.field2131[var5][2] = arg1.method1172((byte) -107) << 4;
                    this.field2131[var5][3] = arg1.method1172((byte) 77) << 4;
                }
            } else {
                this.method1095(var4, (byte) 58);
            }
        }
        if (arg0 < 31) {
            this.method7((byte) 61, (class161) null, -52);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILvh;)V")
    public static final void method1091(int arg0, class84 arg1) {
        ++field2132;
        arg1.method710(false);
        int var2 = class168.field2432;
        class39 var3 = class262.field3781 = class112.field1570[var2] = new class39();
        var3.field5751 = var2;
        int var4 = arg1.method712(false, 30);
        byte var5 = (byte) (var4 >> 28);
        if (arg0 == 255) {
            int var6 = (268421553 & var4) >> 14;
            int var7 = 16383 & var4;
            var3.field5811[0] = -class279.field4012 + var6;
            var3.field4537 = (var3.field5811[0] << 7) + (var3.method245(arg0 ^ 4507) << 6);
            var3.field5807[0] = -class189.field2810 + var7;
            var3.field4530 = (var3.field5807[0] << 7) + (var3.method245(arg0 ^ 4507) << 6);
            class387.field5306 = var3.field4531 = var5;
            if (class141.field1970[var2] != null) {
                var3.method247(class141.field1970[var2], (byte) 22);
            }
            class143.field1996 = 0;
            class464.field6536[class143.field1996++] = var2;
            class232.field3389[var2] = 0;
            class138.field1921 = 0;
            for (int var8 = 1; var8 < 2048; ++var8) {
                if (~var2 != ~var8) {
                    int var9 = arg1.method712(false, 18);
                    int var10 = var9 >> 16;
                    int var11 = var9 >> 8 & 255;
                    int var12 = 255 & var9;
                    class320.field4514[var8] = (var10 << 28) + (var11 << 14) + var12;
                    class389.field5382[var8] = 0;
                    class317.field4463[var8] = -1;
                    class441.field6263[class138.field1921++] = var8;
                    class232.field3389[var8] = 0;
                }
            }
            arg1.method715((byte) 125);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
    private final void method1092(boolean arg0) {
        ++field2134;
        if (arg0) {
            this.method5((byte) 12, -84);
        }
        int var2 = this.field2131.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && this.field2131[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field2131[var2 + -1];
                    var8 = var7[1];
                    var9 = var7[3];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field2131[var4];
                    if (~var4 >= -1) {
                        var8 = var11[1];
                        var10 = var11[2];
                        var9 = var11[3];
                    } else {
                        int[] var12 = this.field2131[var4 - 1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                        var8 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                    }
                }
                int var15 = var10 >> 4;
                int var16 = var8 >> 4;
                int var17 = var9 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                this.field2130[var3] = class142.method1024(var17, class142.method1024(var16 << 16, var15 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)V")
    public static final void method1093(int arg0, int arg1) {
        class365.field5020 = 1000 / arg1;
        ++field2136;
        if (arg0 != 65280) {
            field2129 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)V")
    public static void method1094(boolean arg0) {
        if (arg0) {
            field2133 = null;
            field2129 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
    public class154() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)V")
    private final void method1095(int arg0, byte arg1) {
        ++field2127;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field2131 = new int[4][4];
                                this.field2131[0][2] = 4096;
                                this.field2131[0][3] = 0;
                                this.field2131[0][0] = 2048;
                                this.field2131[0][1] = 0;
                                this.field2131[1][2] = 4096;
                                this.field2131[1][3] = 0;
                                this.field2131[1][1] = 4096;
                                this.field2131[1][0] = 2867;
                                this.field2131[2][2] = 4096;
                                this.field2131[2][1] = 4096;
                                this.field2131[2][3] = 0;
                                this.field2131[2][0] = 3276;
                                this.field2131[3][3] = 0;
                                this.field2131[3][1] = 4096;
                                this.field2131[3][2] = 0;
                                this.field2131[3][0] = 4096;
                            } else {
                                this.field2131 = new int[16][4];
                                this.field2131[0][2] = 192;
                                this.field2131[0][1] = 80;
                                this.field2131[0][0] = 0;
                                this.field2131[0][3] = 321;
                                this.field2131[1][3] = 562;
                                this.field2131[1][2] = 449;
                                this.field2131[1][0] = 155;
                                this.field2131[1][1] = 321;
                                this.field2131[2][1] = 578;
                                this.field2131[2][3] = 803;
                                this.field2131[2][2] = 690;
                                this.field2131[2][0] = 389;
                                this.field2131[3][1] = 947;
                                this.field2131[3][3] = 1140;
                                this.field2131[3][0] = 671;
                                this.field2131[3][2] = 995;
                                this.field2131[4][3] = 1509;
                                this.field2131[4][2] = 1397;
                                this.field2131[4][1] = 1285;
                                this.field2131[4][0] = 897;
                                this.field2131[5][0] = 1175;
                                this.field2131[5][1] = 1525;
                                this.field2131[5][2] = 1429;
                                this.field2131[5][3] = 1413;
                                this.field2131[6][3] = 1333;
                                this.field2131[6][2] = 1461;
                                this.field2131[6][0] = 1368;
                                this.field2131[6][1] = 1734;
                                this.field2131[7][1] = 1413;
                                this.field2131[7][3] = 1702;
                                this.field2131[7][2] = 1525;
                                this.field2131[7][0] = 1507;
                                this.field2131[8][3] = 2056;
                                this.field2131[8][0] = 1736;
                                this.field2131[8][1] = 1108;
                                this.field2131[8][2] = 1590;
                                this.field2131[9][0] = 2088;
                                this.field2131[9][1] = 1766;
                                this.field2131[9][2] = 2056;
                                this.field2131[9][3] = 2666;
                                this.field2131[10][0] = 2355;
                                this.field2131[10][2] = 2586;
                                this.field2131[10][1] = 2409;
                                this.field2131[10][3] = 3276;
                                this.field2131[11][1] = 3116;
                                this.field2131[11][0] = 2691;
                                this.field2131[11][3] = 3228;
                                this.field2131[11][2] = 3148;
                                this.field2131[12][1] = 3806;
                                this.field2131[12][3] = 3196;
                                this.field2131[12][0] = 3031;
                                this.field2131[12][2] = 3710;
                                this.field2131[13][1] = 3437;
                                this.field2131[13][0] = 3522;
                                this.field2131[13][3] = 3019;
                                this.field2131[13][2] = 3421;
                                this.field2131[14][0] = 3727;
                                this.field2131[14][3] = 3228;
                                this.field2131[14][2] = 3148;
                                this.field2131[14][1] = 3116;
                                this.field2131[15][3] = 2746;
                                this.field2131[15][0] = 4096;
                                this.field2131[15][2] = 2505;
                                this.field2131[15][1] = 2377;
                            }
                        } else {
                            this.field2131 = new int[6][4];
                            this.field2131[0][1] = 0;
                            this.field2131[0][2] = 0;
                            this.field2131[0][3] = 0;
                            this.field2131[0][0] = 0;
                            this.field2131[1][3] = 1493;
                            this.field2131[1][1] = 0;
                            this.field2131[1][2] = 0;
                            this.field2131[1][0] = 1843;
                            this.field2131[2][0] = 2457;
                            this.field2131[2][3] = 2939;
                            this.field2131[2][1] = 0;
                            this.field2131[2][2] = 0;
                            this.field2131[3][3] = 3565;
                            this.field2131[3][0] = 2781;
                            this.field2131[3][1] = 0;
                            this.field2131[3][2] = 1124;
                            this.field2131[4][3] = 4031;
                            this.field2131[4][1] = 546;
                            this.field2131[4][0] = 3481;
                            this.field2131[4][2] = 3084;
                            this.field2131[5][1] = 4096;
                            this.field2131[5][2] = 4096;
                            this.field2131[5][3] = 4096;
                            this.field2131[5][0] = 4096;
                        }
                    } else {
                        this.field2131 = new int[7][4];
                        this.field2131[0][1] = 0;
                        this.field2131[0][0] = 0;
                        this.field2131[0][3] = 4096;
                        this.field2131[0][2] = 0;
                        this.field2131[1][3] = 4096;
                        this.field2131[1][1] = 0;
                        this.field2131[1][2] = 4096;
                        this.field2131[1][0] = 663;
                        this.field2131[2][0] = 1363;
                        this.field2131[2][3] = 0;
                        this.field2131[2][2] = 4096;
                        this.field2131[2][1] = 0;
                        this.field2131[3][1] = 4096;
                        this.field2131[3][3] = 0;
                        this.field2131[3][0] = 2048;
                        this.field2131[3][2] = 4096;
                        this.field2131[4][1] = 4096;
                        this.field2131[4][0] = 2727;
                        this.field2131[4][3] = 0;
                        this.field2131[4][2] = 0;
                        this.field2131[5][1] = 4096;
                        this.field2131[5][0] = 3411;
                        this.field2131[5][2] = 0;
                        this.field2131[5][3] = 4096;
                        this.field2131[6][2] = 0;
                        this.field2131[6][3] = 4096;
                        this.field2131[6][1] = 0;
                        this.field2131[6][0] = 4096;
                    }
                } else {
                    this.field2131 = new int[8][4];
                    this.field2131[0][3] = 2361;
                    this.field2131[0][1] = 2650;
                    this.field2131[0][0] = 0;
                    this.field2131[0][2] = 2602;
                    this.field2131[1][0] = 2867;
                    this.field2131[1][1] = 2313;
                    this.field2131[1][3] = 1558;
                    this.field2131[1][2] = 1799;
                    this.field2131[2][3] = 1413;
                    this.field2131[2][0] = 3072;
                    this.field2131[2][1] = 2618;
                    this.field2131[2][2] = 1734;
                    this.field2131[3][2] = 1220;
                    this.field2131[3][3] = 947;
                    this.field2131[3][1] = 2296;
                    this.field2131[3][0] = 3276;
                    this.field2131[4][3] = 722;
                    this.field2131[4][0] = 3481;
                    this.field2131[4][1] = 2072;
                    this.field2131[4][2] = 963;
                    this.field2131[5][2] = 2152;
                    this.field2131[5][1] = 2730;
                    this.field2131[5][0] = 3686;
                    this.field2131[5][3] = 1766;
                    this.field2131[6][3] = 915;
                    this.field2131[6][1] = 2232;
                    this.field2131[6][0] = 3891;
                    this.field2131[6][2] = 1060;
                    this.field2131[7][2] = 1413;
                    this.field2131[7][0] = 4096;
                    this.field2131[7][1] = 1686;
                    this.field2131[7][3] = 1140;
                }
            } else {
                this.field2131 = new int[2][4];
                this.field2131[0][0] = 0;
                this.field2131[0][1] = 0;
                this.field2131[0][2] = 0;
                this.field2131[0][3] = 0;
                this.field2131[1][2] = 4096;
                this.field2131[1][0] = 4096;
                this.field2131[1][1] = 4096;
                this.field2131[1][3] = 4096;
            }
        }
        if (arg1 <= 32) {
            this.method5((byte) -76, -125);
        }
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V")
    public final void method95(int arg0) {
        if (this.field2131 == null) {
            this.method1095(1, (byte) 115);
        }
        if (arg0 == -8) {
            ++field2135;
            this.method1092(false);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(BI)[[I")
    public final int[][] method5(byte arg0, int arg1) {
        ++field2128;
        int[][] var3 = super.field3816.method1928((byte) 123, arg1);
        if (super.field3816.field4208) {
            int[] var4 = this.method1788(arg1, (byte) -50, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class478.field6792; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field2130[var9];
                var5[var8] = class88.method739(var10, 16711680) >> 12;
                var6[var8] = class88.method739(var10, 65280) >> 4;
                var7[var8] = class88.method739(var10, 255) << 4;
            }
        }
        if (arg0 != 116) {
            this.method5((byte) -28, 62);
        }
        return var3;
    }

    static {
        new class151("From", "Von:", "De", "De");
    }
}
