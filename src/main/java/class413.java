import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class413 extends class17 {

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "[I")
    private int[] field5834 = new int[257];

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "I")
    public static int field5842 = -1;

    @OriginalMember(owner = "client!uo", name = "T", descriptor = "Lkn;")
    public static class530 field5845;

    @OriginalMember(owner = "client!uo", name = "R", descriptor = "F")
    public static float field5843;

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!uo", name = "S", descriptor = "Lnd;")
    public static class388 field5844;

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "[[I")
    private int[][] field5835;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)V")
    public final void method31(int arg0) {
        if (arg0 == -9) {
            if (this.field5835 == null) {
                this.method2449((byte) 120, 1);
            }
            ++field5832;
            this.method2446((byte) -69);
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
    private final void method2446(byte arg0) {
        ++field5837;
        int var2 = this.field5835.length;
        if (arg0 != -69) {
            this.method2449((byte) -46, 29);
        }
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && ~this.field5835[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field5835[var2 + -1];
                    var8 = var7[2];
                    var9 = var7[1];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field5835[var4];
                    if (var4 <= 0) {
                        var9 = var11[1];
                        var10 = var11[3];
                        var8 = var11[2];
                    } else {
                        int[] var12 = this.field5835[var4 - 1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                    }
                }
                int var15 = var10 >> 4;
                int var16 = var8 >> 4;
                int var17 = var9 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                if (~var15 <= -1) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field5834[var3] = class170.method1067(var15, class170.method1067(var16 << 8, var17 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZZ)V")
    public static final void method2447(boolean arg0, boolean arg1) {
        class169.field2464 = 0;
        class225.field3244 = 0;
        ++field5841;
        class81.method607(1);
        class278.method1741(20856, arg0);
        class240.method1510((byte) 72);
        boolean var2 = arg1;
        for (int var3 = 0; class225.field3244 > var3; ++var3) {
            int var5 = class8.field126[var3];
            class378 var6 = (class378) class125.field1687.method2405((long) var5, -96);
            class429 var7 = var6.field5353;
            if (class424.field5977 && class153.method982(-114, var5)) {
                class343.method2047(true);
            }
            if (class390.field5481 != var7.field3316) {
                if (var7.field6055.method1938((byte) -123)) {
                    class336.method2010(var7, (byte) -78);
                }
                var7.method2541((class322) null, false);
                var6.method2891(111);
                var2 = true;
            }
        }
        if (var2) {
            class481.field6704 = class125.field1687.method2406(!arg1);
            class125.field1687.method2407(class367.field5245, (byte) 65);
        }
        if (class190.field2715 != class264.field3874.field5665) {
            throw new RuntimeException("gnp1 pos:" + class264.field3874.field5665 + " psize:" + class190.field2715);
        } else {
            for (int var4 = 0; class434.field6110 > var4; ++var4) {
                if (class125.field1687.method2405((long) class488.field6834[var4], -46) == null) {
                    throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class434.field6110);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field5840;
        if (arg1 != -25) {
            return null;
        } else {
            int[][] var3 = super.field201.method1851(arg0, (byte) -56);
            if (super.field201.field4431) {
                int[] var4 = this.method88(arg0, -4526, 0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; var8 < class530.field7763; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var9 > 256) {
                        var9 = 256;
                    }
                    int var10 = this.field5834[var9];
                    var5[var8] = class239.method1507(4080, var10 >> 12);
                    var6[var8] = class239.method1507(4080, var10 >> 4);
                    var7[var8] = class239.method1507(var10 << 4, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ll;ILza;IIII)V")
    public static final void method2448(class16 arg0, int arg1, class290 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class433.field6100 < 100) {
            class417.method2466(-1684459574, arg0, arg2);
        }
        ++field5833;
        arg2.method301(arg5, arg3, arg1 + arg5, arg3 + arg4);
        if (class433.field6100 < 100) {
            byte var7 = 20;
            int var8 = arg1 / 2 + arg5;
            arg2.method325(arg5, arg3, arg1, arg4, -16777216, 0);
            int var9 = arg4 / 2 + arg3 + -var7 + -18;
            arg2.method288(var8 - 152, var9, 304, 34, class504.field7459[class143.field1867].getRGB(), 0);
            arg2.method325(var8 + -150, var9 - -2, class433.field6100 * 3, 30, class516.field7598[class143.field1867].getRGB(), 0);
            class107.field1431.method1913(class231.field3398.method3116(class149.field1979, (byte) 98), class390.field5482[class143.field1867].getRGB(), -1, var7 + var9, false, var8);
        } else {
            int var10 = class307.field4455 - (int) ((float) arg1 / class245.field3556);
            if (arg6 < 46) {
                method2451(-16, -100);
            }
            int var11 = (int) ((float) arg4 / class245.field3556) + class421.field5935;
            int var12 = (int) ((float) arg1 / class245.field3556) + class307.field4455;
            int var13 = -((int) ((float) arg4 / class245.field3556)) + class421.field5935;
            class108.field1486 = -((int) ((float) arg4 / class245.field3556)) + class421.field5935;
            class97.field1276 = (int) ((float) (arg4 * 2) / class245.field3556);
            class540.field7898 = -((int) ((float) arg1 / class245.field3556)) + class307.field4455;
            class476.field6634 = (int) ((float) (arg1 * 2) / class245.field3556);
            class245.method1551(class245.field3574 + var10, class245.field3586 + var11, class245.field3574 + var12, class245.field3586 + var13, arg5, arg3, arg5 - -arg1, arg3 + arg4 + 1);
            class245.method1553(arg2);
            class455 var14 = class245.method1543(arg2);
            class493.method2862(false, arg2, var14, 0, 0);
            if (~class367.field5246 < -1) {
                --class515.field7594;
                if (class515.field7594 == 0) {
                    class515.field7594 = 20;
                    --class367.field5246;
                }
            }
            if (class496.field7035) {
                int var15 = arg1 + arg5 + -5;
                int var16 = arg3 + arg4 + -8;
                class38.field415.method1921(var16, var15, "Fps:" + class530.field7764, 16776960, 92, -1);
                int var20 = var16 - 15;
                Runtime var17 = Runtime.getRuntime();
                int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
                int var19 = 16776960;
                if (var18 > 65536) {
                    var19 = 16711680;
                }
                class38.field415.method1921(var20, var15, "Mem:" + var18 + "k", var19, 51, -1);
                var16 = var20 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BI)V")
    private final void method2449(byte arg0, int arg1) {
        if (arg0 != 120) {
            field5844 = null;
        }
        ++field5836;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field5835 = new int[4][4];
                                    this.field5835[0][3] = 0;
                                    this.field5835[0][1] = 0;
                                    this.field5835[0][0] = 2048;
                                    this.field5835[0][2] = 4096;
                                    this.field5835[1][3] = 0;
                                    this.field5835[1][2] = 4096;
                                    this.field5835[1][1] = 4096;
                                    this.field5835[1][0] = 2867;
                                    this.field5835[2][1] = 4096;
                                    this.field5835[2][0] = 3276;
                                    this.field5835[2][2] = 4096;
                                    this.field5835[2][3] = 0;
                                    this.field5835[3][0] = 4096;
                                    this.field5835[3][1] = 4096;
                                    this.field5835[3][3] = 0;
                                    this.field5835[3][2] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field5835 = new int[16][4];
                                this.field5835[0][3] = 321;
                                this.field5835[0][0] = 0;
                                this.field5835[0][2] = 192;
                                this.field5835[0][1] = 80;
                                this.field5835[1][0] = 155;
                                this.field5835[1][2] = 449;
                                this.field5835[1][3] = 562;
                                this.field5835[1][1] = 321;
                                this.field5835[2][2] = 690;
                                this.field5835[2][3] = 803;
                                this.field5835[2][1] = 578;
                                this.field5835[2][0] = 389;
                                this.field5835[3][2] = 995;
                                this.field5835[3][1] = 947;
                                this.field5835[3][0] = 671;
                                this.field5835[3][3] = 1140;
                                this.field5835[4][2] = 1397;
                                this.field5835[4][0] = 897;
                                this.field5835[4][1] = 1285;
                                this.field5835[4][3] = 1509;
                                this.field5835[5][0] = 1175;
                                this.field5835[5][3] = 1413;
                                this.field5835[5][2] = 1429;
                                this.field5835[5][1] = 1525;
                                this.field5835[6][3] = 1333;
                                this.field5835[6][2] = 1461;
                                this.field5835[6][0] = 1368;
                                this.field5835[6][1] = 1734;
                                this.field5835[7][2] = 1525;
                                this.field5835[7][0] = 1507;
                                this.field5835[7][3] = 1702;
                                this.field5835[7][1] = 1413;
                                this.field5835[8][2] = 1590;
                                this.field5835[8][3] = 2056;
                                this.field5835[8][0] = 1736;
                                this.field5835[8][1] = 1108;
                                this.field5835[9][3] = 2666;
                                this.field5835[9][1] = 1766;
                                this.field5835[9][2] = 2056;
                                this.field5835[9][0] = 2088;
                                this.field5835[10][1] = 2409;
                                this.field5835[10][0] = 2355;
                                this.field5835[10][2] = 2586;
                                this.field5835[10][3] = 3276;
                                this.field5835[11][1] = 3116;
                                this.field5835[11][2] = 3148;
                                this.field5835[11][0] = 2691;
                                this.field5835[11][3] = 3228;
                                this.field5835[12][1] = 3806;
                                this.field5835[12][0] = 3031;
                                this.field5835[12][3] = 3196;
                                this.field5835[12][2] = 3710;
                                this.field5835[13][3] = 3019;
                                this.field5835[13][1] = 3437;
                                this.field5835[13][0] = 3522;
                                this.field5835[13][2] = 3421;
                                this.field5835[14][1] = 3116;
                                this.field5835[14][3] = 3228;
                                this.field5835[14][0] = 3727;
                                this.field5835[14][2] = 3148;
                                this.field5835[15][2] = 2505;
                                this.field5835[15][0] = 4096;
                                this.field5835[15][1] = 2377;
                                this.field5835[15][3] = 2746;
                            }
                        } else {
                            this.field5835 = new int[6][4];
                            this.field5835[0][2] = 0;
                            this.field5835[0][3] = 0;
                            this.field5835[0][0] = 0;
                            this.field5835[0][1] = 0;
                            this.field5835[1][2] = 0;
                            this.field5835[1][1] = 0;
                            this.field5835[1][3] = 1493;
                            this.field5835[1][0] = 1843;
                            this.field5835[2][2] = 0;
                            this.field5835[2][3] = 2939;
                            this.field5835[2][0] = 2457;
                            this.field5835[2][1] = 0;
                            this.field5835[3][1] = 0;
                            this.field5835[3][2] = 1124;
                            this.field5835[3][0] = 2781;
                            this.field5835[3][3] = 3565;
                            this.field5835[4][3] = 4031;
                            this.field5835[4][1] = 546;
                            this.field5835[4][0] = 3481;
                            this.field5835[4][2] = 3084;
                            this.field5835[5][3] = 4096;
                            this.field5835[5][0] = 4096;
                            this.field5835[5][1] = 4096;
                            this.field5835[5][2] = 4096;
                        }
                    } else {
                        this.field5835 = new int[7][4];
                        this.field5835[0][2] = 0;
                        this.field5835[0][0] = 0;
                        this.field5835[0][3] = 4096;
                        this.field5835[0][1] = 0;
                        this.field5835[1][2] = 4096;
                        this.field5835[1][3] = 4096;
                        this.field5835[1][0] = 663;
                        this.field5835[1][1] = 0;
                        this.field5835[2][2] = 4096;
                        this.field5835[2][3] = 0;
                        this.field5835[2][1] = 0;
                        this.field5835[2][0] = 1363;
                        this.field5835[3][1] = 4096;
                        this.field5835[3][0] = 2048;
                        this.field5835[3][3] = 0;
                        this.field5835[3][2] = 4096;
                        this.field5835[4][2] = 0;
                        this.field5835[4][0] = 2727;
                        this.field5835[4][3] = 0;
                        this.field5835[4][1] = 4096;
                        this.field5835[5][1] = 4096;
                        this.field5835[5][2] = 0;
                        this.field5835[5][0] = 3411;
                        this.field5835[5][3] = 4096;
                        this.field5835[6][1] = 0;
                        this.field5835[6][0] = 4096;
                        this.field5835[6][2] = 0;
                        this.field5835[6][3] = 4096;
                    }
                } else {
                    this.field5835 = new int[8][4];
                    this.field5835[0][0] = 0;
                    this.field5835[0][1] = 2650;
                    this.field5835[0][2] = 2602;
                    this.field5835[0][3] = 2361;
                    this.field5835[1][3] = 1558;
                    this.field5835[1][2] = 1799;
                    this.field5835[1][0] = 2867;
                    this.field5835[1][1] = 2313;
                    this.field5835[2][0] = 3072;
                    this.field5835[2][1] = 2618;
                    this.field5835[2][2] = 1734;
                    this.field5835[2][3] = 1413;
                    this.field5835[3][3] = 947;
                    this.field5835[3][2] = 1220;
                    this.field5835[3][0] = 3276;
                    this.field5835[3][1] = 2296;
                    this.field5835[4][3] = 722;
                    this.field5835[4][1] = 2072;
                    this.field5835[4][0] = 3481;
                    this.field5835[4][2] = 963;
                    this.field5835[5][2] = 2152;
                    this.field5835[5][1] = 2730;
                    this.field5835[5][0] = 3686;
                    this.field5835[5][3] = 1766;
                    this.field5835[6][1] = 2232;
                    this.field5835[6][2] = 1060;
                    this.field5835[6][0] = 3891;
                    this.field5835[6][3] = 915;
                    this.field5835[7][2] = 1413;
                    this.field5835[7][3] = 1140;
                    this.field5835[7][0] = 4096;
                    this.field5835[7][1] = 1686;
                }
            } else {
                this.field5835 = new int[2][4];
                this.field5835[0][3] = 0;
                this.field5835[0][2] = 0;
                this.field5835[0][0] = 0;
                this.field5835[0][1] = 0;
                this.field5835[1][0] = 4096;
                this.field5835[1][2] = 4096;
                this.field5835[1][1] = 4096;
                this.field5835[1][3] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)V")
    public static void method2450(byte arg0) {
        field5845 = null;
        field5844 = null;
        if (arg0 != -108) {
            method2451(25, 94);
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(II)I")
    public static final int method2451(int arg0, int arg1) {
        if (arg1 != 255) {
            return -25;
        } else {
            ++field5839;
            return 255 & arg0;
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
    public class413() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method2452(byte arg0, String[] arg1) {
        ++field5831;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        if (arg0 <= 98) {
            method2448((class16) null, 110, (class290) null, -53, 97, 8, -55);
        }
        return var2;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 != 5159) {
            this.method31(87);
        }
        if (~arg1 == -1) {
            int var4 = arg0.method2357((byte) 114);
            if (var4 != 0) {
                this.method2449((byte) 120, var4);
            } else {
                this.field5835 = new int[arg0.method2357((byte) 106)][4];
                for (int var5 = 0; ~var5 > ~this.field5835.length; ++var5) {
                    this.field5835[var5][0] = arg0.method2338(0);
                    this.field5835[var5][1] = arg0.method2357((byte) 116) << 4;
                    this.field5835[var5][2] = arg0.method2357((byte) 112) << 4;
                    this.field5835[var5][3] = arg0.method2357((byte) 110) << 4;
                }
            }
        }
        ++field5838;
    }

    static {
        new class530((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        new class32("", 73);
        field5845 = new class530("wave2:", "welle2:", "ondulation2:", "onda2:");
    }
}
