import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class330 extends class666 {

    @OriginalMember(owner = "client!uv", name = "Q", descriptor = "[I")
    private int[] field4285 = new int[257];

    @OriginalMember(owner = "client!uv", name = "D", descriptor = "F")
    public static float field4273;

    @OriginalMember(owner = "client!uv", name = "E", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!uv", name = "F", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!uv", name = "G", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!uv", name = "I", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!uv", name = "J", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!uv", name = "K", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!uv", name = "L", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!uv", name = "M", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!uv", name = "O", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!uv", name = "P", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!uv", name = "R", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!uv", name = "H", descriptor = "[[I")
    private int[][] field4277;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILjava/lang/String;)V", line = 5)
    public static final void method1859(int arg0, String arg1) {
        System.exit(1);
        ++field4278;
        if (arg0 != 0) {
            method1864(-114, -78, -95);
        }
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(III)V", line = 21)
    public static final void method1860(int arg0, int arg1, int arg2) {
        ++field4282;
        class530 var3 = class242.method1402(arg0 ^ -76, arg0, arg1);
        var3.method3025((byte) -69);
        var3.field7593 = arg2;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)[[I", line = 36)
    public final int[][] method1251(int arg0, byte arg1) {
        ++field4279;
        int[][] var3 = super.field9471.method3639(120, arg0);
        if (arg1 != 98) {
            return null;
        } else {
            if (super.field9471.field9180) {
                int[] var4 = this.method3739(0, arg1 ^ -29, arg0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; class501.field7222 > var8; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field4285[var9];
                    var5[var8] = class203.method1246(var10, 16711680) >> 12;
                    var6[var8] = class203.method1246(4080, var10 >> 4);
                    var7[var8] = class203.method1246(var10 << 4, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)V", line = 86)
    private final void method1861(byte arg0, int arg1) {
        ++field4281;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4277 = new int[4][4];
                                this.field4277[0][2] = 4096;
                                this.field4277[0][3] = 0;
                                this.field4277[0][0] = 2048;
                                this.field4277[0][1] = 0;
                                this.field4277[1][3] = 0;
                                this.field4277[1][1] = 4096;
                                this.field4277[1][2] = 4096;
                                this.field4277[1][0] = 2867;
                                this.field4277[2][2] = 4096;
                                this.field4277[2][0] = 3276;
                                this.field4277[2][3] = 0;
                                this.field4277[2][1] = 4096;
                                this.field4277[3][0] = 4096;
                                this.field4277[3][1] = 4096;
                                this.field4277[3][3] = 0;
                                this.field4277[3][2] = 0;
                            } else {
                                this.field4277 = new int[16][4];
                                this.field4277[0][3] = 321;
                                this.field4277[0][0] = 0;
                                this.field4277[0][1] = 80;
                                this.field4277[0][2] = 192;
                                this.field4277[1][1] = 321;
                                this.field4277[1][0] = 155;
                                this.field4277[1][2] = 449;
                                this.field4277[1][3] = 562;
                                this.field4277[2][2] = 690;
                                this.field4277[2][1] = 578;
                                this.field4277[2][0] = 389;
                                this.field4277[2][3] = 803;
                                this.field4277[3][3] = 1140;
                                this.field4277[3][2] = 995;
                                this.field4277[3][0] = 671;
                                this.field4277[3][1] = 947;
                                this.field4277[4][0] = 897;
                                this.field4277[4][2] = 1397;
                                this.field4277[4][1] = 1285;
                                this.field4277[4][3] = 1509;
                                this.field4277[5][3] = 1413;
                                this.field4277[5][2] = 1429;
                                this.field4277[5][1] = 1525;
                                this.field4277[5][0] = 1175;
                                this.field4277[6][2] = 1461;
                                this.field4277[6][3] = 1333;
                                this.field4277[6][1] = 1734;
                                this.field4277[6][0] = 1368;
                                this.field4277[7][0] = 1507;
                                this.field4277[7][2] = 1525;
                                this.field4277[7][3] = 1702;
                                this.field4277[7][1] = 1413;
                                this.field4277[8][0] = 1736;
                                this.field4277[8][1] = 1108;
                                this.field4277[8][2] = 1590;
                                this.field4277[8][3] = 2056;
                                this.field4277[9][2] = 2056;
                                this.field4277[9][3] = 2666;
                                this.field4277[9][0] = 2088;
                                this.field4277[9][1] = 1766;
                                this.field4277[10][0] = 2355;
                                this.field4277[10][2] = 2586;
                                this.field4277[10][1] = 2409;
                                this.field4277[10][3] = 3276;
                                this.field4277[11][0] = 2691;
                                this.field4277[11][3] = 3228;
                                this.field4277[11][2] = 3148;
                                this.field4277[11][1] = 3116;
                                this.field4277[12][2] = 3710;
                                this.field4277[12][3] = 3196;
                                this.field4277[12][1] = 3806;
                                this.field4277[12][0] = 3031;
                                this.field4277[13][2] = 3421;
                                this.field4277[13][1] = 3437;
                                this.field4277[13][3] = 3019;
                                this.field4277[13][0] = 3522;
                                this.field4277[14][3] = 3228;
                                this.field4277[14][0] = 3727;
                                this.field4277[14][1] = 3116;
                                this.field4277[14][2] = 3148;
                                this.field4277[15][3] = 2746;
                                this.field4277[15][1] = 2377;
                                this.field4277[15][0] = 4096;
                                this.field4277[15][2] = 2505;
                            }
                        } else {
                            this.field4277 = new int[6][4];
                            this.field4277[0][2] = 0;
                            this.field4277[0][3] = 0;
                            this.field4277[0][0] = 0;
                            this.field4277[0][1] = 0;
                            this.field4277[1][3] = 1493;
                            this.field4277[1][0] = 1843;
                            this.field4277[1][2] = 0;
                            this.field4277[1][1] = 0;
                            this.field4277[2][3] = 2939;
                            this.field4277[2][0] = 2457;
                            this.field4277[2][1] = 0;
                            this.field4277[2][2] = 0;
                            this.field4277[3][2] = 1124;
                            this.field4277[3][0] = 2781;
                            this.field4277[3][1] = 0;
                            this.field4277[3][3] = 3565;
                            this.field4277[4][0] = 3481;
                            this.field4277[4][3] = 4031;
                            this.field4277[4][1] = 546;
                            this.field4277[4][2] = 3084;
                            this.field4277[5][3] = 4096;
                            this.field4277[5][2] = 4096;
                            this.field4277[5][1] = 4096;
                            this.field4277[5][0] = 4096;
                        }
                    } else {
                        this.field4277 = new int[7][4];
                        this.field4277[0][1] = 0;
                        this.field4277[0][3] = 4096;
                        this.field4277[0][0] = 0;
                        this.field4277[0][2] = 0;
                        this.field4277[1][3] = 4096;
                        this.field4277[1][2] = 4096;
                        this.field4277[1][0] = 663;
                        this.field4277[1][1] = 0;
                        this.field4277[2][0] = 1363;
                        this.field4277[2][1] = 0;
                        this.field4277[2][3] = 0;
                        this.field4277[2][2] = 4096;
                        this.field4277[3][1] = 4096;
                        this.field4277[3][3] = 0;
                        this.field4277[3][0] = 2048;
                        this.field4277[3][2] = 4096;
                        this.field4277[4][1] = 4096;
                        this.field4277[4][2] = 0;
                        this.field4277[4][0] = 2727;
                        this.field4277[4][3] = 0;
                        this.field4277[5][2] = 0;
                        this.field4277[5][3] = 4096;
                        this.field4277[5][1] = 4096;
                        this.field4277[5][0] = 3411;
                        this.field4277[6][2] = 0;
                        this.field4277[6][0] = 4096;
                        this.field4277[6][3] = 4096;
                        this.field4277[6][1] = 0;
                    }
                } else {
                    this.field4277 = new int[8][4];
                    this.field4277[0][1] = 2650;
                    this.field4277[0][0] = 0;
                    this.field4277[0][3] = 2361;
                    this.field4277[0][2] = 2602;
                    this.field4277[1][2] = 1799;
                    this.field4277[1][1] = 2313;
                    this.field4277[1][0] = 2867;
                    this.field4277[1][3] = 1558;
                    this.field4277[2][3] = 1413;
                    this.field4277[2][2] = 1734;
                    this.field4277[2][1] = 2618;
                    this.field4277[2][0] = 3072;
                    this.field4277[3][1] = 2296;
                    this.field4277[3][0] = 3276;
                    this.field4277[3][2] = 1220;
                    this.field4277[3][3] = 947;
                    this.field4277[4][1] = 2072;
                    this.field4277[4][3] = 722;
                    this.field4277[4][0] = 3481;
                    this.field4277[4][2] = 963;
                    this.field4277[5][2] = 2152;
                    this.field4277[5][3] = 1766;
                    this.field4277[5][0] = 3686;
                    this.field4277[5][1] = 2730;
                    this.field4277[6][0] = 3891;
                    this.field4277[6][3] = 915;
                    this.field4277[6][1] = 2232;
                    this.field4277[6][2] = 1060;
                    this.field4277[7][1] = 1686;
                    this.field4277[7][0] = 4096;
                    this.field4277[7][2] = 1413;
                    this.field4277[7][3] = 1140;
                }
            } else {
                this.field4277 = new int[2][4];
                this.field4277[0][1] = 0;
                this.field4277[0][0] = 0;
                this.field4277[0][2] = 0;
                this.field4277[0][3] = 0;
                this.field4277[1][2] = 4096;
                this.field4277[1][3] = 4096;
                this.field4277[1][0] = 4096;
                this.field4277[1][1] = 4096;
            }
        }
        if (arg0 < 15) {
            method1860(-4, -95, 58);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILiaa;Z)V", line = 341)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (arg0 == 0) {
            int var4 = arg1.method2541(92);
            if (var4 == 0) {
                this.field4277 = new int[arg1.method2541(120)][4];
                for (int var5 = 0; var5 < this.field4277.length; ++var5) {
                    this.field4277[var5][0] = arg1.method2574(-1758460248);
                    this.field4277[var5][1] = arg1.method2541(99) << 4;
                    this.field4277[var5][2] = arg1.method2541(69) << 4;
                    this.field4277[var5][3] = arg1.method2541(65) << 4;
                }
            } else {
                this.method1861((byte) 91, var4);
            }
        }
        ++field4286;
        if (!arg2) {
            this.field4285 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V", line = 382)
    private final void method1862(byte arg0) {
        ++field4280;
        if (arg0 == 39) {
            int var2 = this.field4277.length;
            if (~var2 < -1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var6 > ~var2 && ~this.field4277[var6][0] >= ~var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var2 <= var4) {
                        int[] var7 = this.field4277[var2 - 1];
                        var8 = var7[2];
                        var9 = var7[3];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field4277[var4];
                        if (var4 <= 0) {
                            var8 = var11[2];
                            var9 = var11[3];
                            var10 = var11[1];
                        } else {
                            int[] var12 = this.field4277[var4 + -1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                            int var14 = 4096 - var13;
                            var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                            var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                            var9 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                        }
                    }
                    int var15 = var8 >> 4;
                    int var16 = var9 >> 4;
                    int var17 = var10 >> 4;
                    if (~var16 <= -1) {
                        if (var16 > 255) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 255) {
                        var17 = 255;
                    }
                    if (var15 >= 0) {
                        if (~var15 < -256) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    this.field4285[var3] = class139.method776(var16, class139.method776(var17 << 16, var15 << 8));
                }
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V", line = 486)
    public class330() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "(III)B", line = 489)
    public static final byte method1863(int arg0, int arg1, int arg2) {
        ++field4274;
        if (arg2 != 2841) {
            return -29;
        } else if (~arg0 != -10) {
            return 0;
        } else {
            return (byte) ((arg1 & 1) != 0 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V", line = 508)
    public final void method118(int arg0) {
        if (this.field4277 == null) {
            this.method1861((byte) 82, 1);
        }
        ++field4283;
        this.method1862((byte) 39);
        if (arg0 != -9) {
            this.field4285 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "(III)V", line = 523)
    public static final void method1864(int arg0, int arg1, int arg2) {
        ++field4284;
        int var3 = class612.field8650.method3622(62, class221.field2743.method1296(class226.field2899, (byte) 64));
        if (arg1 <= -115) {
            for (class208 var4 = (class208) class530.field7597.method3174((byte) 49); var4 != null; var4 = (class208) class530.field7597.method3168(false)) {
                int var8 = class231.method1345(var4, (byte) -71);
                if (~var3 > ~var8) {
                    var3 = var8;
                }
            }
            var3 += 8;
            int var5 = class145.field1625 * 16 + 21;
            int var6 = -(var3 / 2) + arg0;
            if (class399.field5336 < var3 + var6) {
                var6 = -var3 + class399.field5336;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            int var7 = arg2;
            if (class416.field5524 < var5 + arg2) {
                var7 = class416.field5524 - var5;
            }
            if (~var7 > -1) {
                var7 = 0;
            }
            client.field3414 = var6;
            class350.field4586 = var3;
            class553.field7888 = var7;
            class70.field749 = (!class604.field8551 ? 22 : 26) + class145.field1625 * 16;
            class215.field2615 = true;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Frame;BLpe;)V", line = 577)
    public static final void method1865(Frame arg0, byte arg1, class556 arg2) {
        if (arg1 != 111) {
            method1863(6, 25, -41);
        }
        ++field4276;
        while (true) {
            class199 var3 = arg2.method3134(0, arg0);
            while (var3.field2437 == 0) {
                class370.method2025(arg1 ^ -112, 10L);
            }
            if (var3.field2437 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class370.method2025(-1, 100L);
        }
    }
}
