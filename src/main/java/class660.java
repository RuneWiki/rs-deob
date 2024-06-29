import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class660 extends class573 {

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "[I")
    private int[] field9507 = new int[257];

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public static int field9506 = 0;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field9511;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
    public static int field9513;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "I")
    public static int field9516;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ki", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field9517;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "[Lf;")
    public static class702[] field9508;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "[[I")
    private int[][] field9509;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V")
    private final void method3752(int arg0, byte arg1) {
        ++field9513;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field9509 = new int[4][4];
                                this.field9509[0][0] = 2048;
                                this.field9509[0][1] = 0;
                                this.field9509[0][3] = 0;
                                this.field9509[0][2] = 4096;
                                this.field9509[1][0] = 2867;
                                this.field9509[1][3] = 0;
                                this.field9509[1][2] = 4096;
                                this.field9509[1][1] = 4096;
                                this.field9509[2][2] = 4096;
                                this.field9509[2][3] = 0;
                                this.field9509[2][1] = 4096;
                                this.field9509[2][0] = 3276;
                                this.field9509[3][3] = 0;
                                this.field9509[3][0] = 4096;
                                this.field9509[3][1] = 4096;
                                this.field9509[3][2] = 0;
                            } else {
                                this.field9509 = new int[16][4];
                                this.field9509[0][2] = 192;
                                this.field9509[0][0] = 0;
                                this.field9509[0][1] = 80;
                                this.field9509[0][3] = 321;
                                this.field9509[1][3] = 562;
                                this.field9509[1][1] = 321;
                                this.field9509[1][2] = 449;
                                this.field9509[1][0] = 155;
                                this.field9509[2][0] = 389;
                                this.field9509[2][2] = 690;
                                this.field9509[2][1] = 578;
                                this.field9509[2][3] = 803;
                                this.field9509[3][0] = 671;
                                this.field9509[3][2] = 995;
                                this.field9509[3][1] = 947;
                                this.field9509[3][3] = 1140;
                                this.field9509[4][0] = 897;
                                this.field9509[4][3] = 1509;
                                this.field9509[4][1] = 1285;
                                this.field9509[4][2] = 1397;
                                this.field9509[5][3] = 1413;
                                this.field9509[5][0] = 1175;
                                this.field9509[5][1] = 1525;
                                this.field9509[5][2] = 1429;
                                this.field9509[6][1] = 1734;
                                this.field9509[6][2] = 1461;
                                this.field9509[6][0] = 1368;
                                this.field9509[6][3] = 1333;
                                this.field9509[7][0] = 1507;
                                this.field9509[7][3] = 1702;
                                this.field9509[7][2] = 1525;
                                this.field9509[7][1] = 1413;
                                this.field9509[8][2] = 1590;
                                this.field9509[8][1] = 1108;
                                this.field9509[8][0] = 1736;
                                this.field9509[8][3] = 2056;
                                this.field9509[9][0] = 2088;
                                this.field9509[9][2] = 2056;
                                this.field9509[9][1] = 1766;
                                this.field9509[9][3] = 2666;
                                this.field9509[10][1] = 2409;
                                this.field9509[10][2] = 2586;
                                this.field9509[10][0] = 2355;
                                this.field9509[10][3] = 3276;
                                this.field9509[11][2] = 3148;
                                this.field9509[11][1] = 3116;
                                this.field9509[11][3] = 3228;
                                this.field9509[11][0] = 2691;
                                this.field9509[12][0] = 3031;
                                this.field9509[12][3] = 3196;
                                this.field9509[12][1] = 3806;
                                this.field9509[12][2] = 3710;
                                this.field9509[13][1] = 3437;
                                this.field9509[13][3] = 3019;
                                this.field9509[13][2] = 3421;
                                this.field9509[13][0] = 3522;
                                this.field9509[14][0] = 3727;
                                this.field9509[14][1] = 3116;
                                this.field9509[14][3] = 3228;
                                this.field9509[14][2] = 3148;
                                this.field9509[15][0] = 4096;
                                this.field9509[15][3] = 2746;
                                this.field9509[15][1] = 2377;
                                this.field9509[15][2] = 2505;
                            }
                        } else {
                            this.field9509 = new int[6][4];
                            this.field9509[0][1] = 0;
                            this.field9509[0][3] = 0;
                            this.field9509[0][2] = 0;
                            this.field9509[0][0] = 0;
                            this.field9509[1][3] = 1493;
                            this.field9509[1][0] = 1843;
                            this.field9509[1][2] = 0;
                            this.field9509[1][1] = 0;
                            this.field9509[2][1] = 0;
                            this.field9509[2][3] = 2939;
                            this.field9509[2][2] = 0;
                            this.field9509[2][0] = 2457;
                            this.field9509[3][2] = 1124;
                            this.field9509[3][0] = 2781;
                            this.field9509[3][3] = 3565;
                            this.field9509[3][1] = 0;
                            this.field9509[4][3] = 4031;
                            this.field9509[4][1] = 546;
                            this.field9509[4][2] = 3084;
                            this.field9509[4][0] = 3481;
                            this.field9509[5][1] = 4096;
                            this.field9509[5][2] = 4096;
                            this.field9509[5][0] = 4096;
                            this.field9509[5][3] = 4096;
                        }
                    } else {
                        this.field9509 = new int[7][4];
                        this.field9509[0][0] = 0;
                        this.field9509[0][3] = 4096;
                        this.field9509[0][1] = 0;
                        this.field9509[0][2] = 0;
                        this.field9509[1][0] = 663;
                        this.field9509[1][1] = 0;
                        this.field9509[1][3] = 4096;
                        this.field9509[1][2] = 4096;
                        this.field9509[2][3] = 0;
                        this.field9509[2][1] = 0;
                        this.field9509[2][2] = 4096;
                        this.field9509[2][0] = 1363;
                        this.field9509[3][3] = 0;
                        this.field9509[3][1] = 4096;
                        this.field9509[3][0] = 2048;
                        this.field9509[3][2] = 4096;
                        this.field9509[4][3] = 0;
                        this.field9509[4][0] = 2727;
                        this.field9509[4][2] = 0;
                        this.field9509[4][1] = 4096;
                        this.field9509[5][1] = 4096;
                        this.field9509[5][3] = 4096;
                        this.field9509[5][2] = 0;
                        this.field9509[5][0] = 3411;
                        this.field9509[6][3] = 4096;
                        this.field9509[6][2] = 0;
                        this.field9509[6][0] = 4096;
                        this.field9509[6][1] = 0;
                    }
                } else {
                    this.field9509 = new int[8][4];
                    this.field9509[0][2] = 2602;
                    this.field9509[0][3] = 2361;
                    this.field9509[0][0] = 0;
                    this.field9509[0][1] = 2650;
                    this.field9509[1][0] = 2867;
                    this.field9509[1][3] = 1558;
                    this.field9509[1][2] = 1799;
                    this.field9509[1][1] = 2313;
                    this.field9509[2][2] = 1734;
                    this.field9509[2][1] = 2618;
                    this.field9509[2][0] = 3072;
                    this.field9509[2][3] = 1413;
                    this.field9509[3][1] = 2296;
                    this.field9509[3][3] = 947;
                    this.field9509[3][0] = 3276;
                    this.field9509[3][2] = 1220;
                    this.field9509[4][1] = 2072;
                    this.field9509[4][2] = 963;
                    this.field9509[4][0] = 3481;
                    this.field9509[4][3] = 722;
                    this.field9509[5][3] = 1766;
                    this.field9509[5][2] = 2152;
                    this.field9509[5][0] = 3686;
                    this.field9509[5][1] = 2730;
                    this.field9509[6][1] = 2232;
                    this.field9509[6][2] = 1060;
                    this.field9509[6][3] = 915;
                    this.field9509[6][0] = 3891;
                    this.field9509[7][0] = 4096;
                    this.field9509[7][3] = 1140;
                    this.field9509[7][2] = 1413;
                    this.field9509[7][1] = 1686;
                }
            } else {
                this.field9509 = new int[2][4];
                this.field9509[0][2] = 0;
                this.field9509[0][3] = 0;
                this.field9509[0][1] = 0;
                this.field9509[0][0] = 0;
                this.field9509[1][2] = 4096;
                this.field9509[1][0] = 4096;
                this.field9509[1][1] = 4096;
                this.field9509[1][3] = 4096;
            }
        }
        if (arg1 != -118) {
            field9506 = 16;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public static final void method3753(boolean arg0) {
        ++field9511;
        if (class410.field5946 == null) {
            class410.field5946 = new int[65536];
            if (arg0) {
                double var1 = -0.015D + Math.random() * 0.03D + 0.7D;
                int var3 = 0;
                for (int var4 = 0; var4 < 512; ++var4) {
                    float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                    float var6 = (float) (7 & var4) / 8.0F + 0.0625F;
                    for (int var7 = 0; ~var7 > -129; ++var7) {
                        float var8 = (float) var7 / 128.0F;
                        float var9 = 0.0F;
                        float var10 = 0.0F;
                        float var11 = 0.0F;
                        float var12 = var5 / 60.0F;
                        int var13 = (int) var12;
                        int var14 = var13 % 6;
                        float var15 = (float) (-var13) + var12;
                        float var16 = (1.0F - var6) * var8;
                        float var17 = (-(var6 * var15) + 1.0F) * var8;
                        float var18 = (-((1.0F - var15) * var6) + 1.0F) * var8;
                        if (var14 == 0) {
                            var11 = var16;
                            var10 = var18;
                            var9 = var8;
                        } else if (var14 != 1) {
                            if (~var14 == -3) {
                                var10 = var8;
                                var9 = var16;
                                var11 = var18;
                            } else if (var14 != 3) {
                                if (var14 == 4) {
                                    var11 = var8;
                                    var9 = var18;
                                    var10 = var16;
                                } else if (~var14 == -6) {
                                    var11 = var17;
                                    var9 = var8;
                                    var10 = var16;
                                }
                            } else {
                                var10 = var17;
                                var9 = var16;
                                var11 = var8;
                            }
                        } else {
                            var10 = var8;
                            var9 = var17;
                            var11 = var16;
                        }
                        float var19 = (float) Math.pow((double) var9, var1);
                        float var20 = (float) Math.pow((double) var10, var1);
                        float var21 = (float) Math.pow((double) var11, var1);
                        int var22 = (int) (var19 * 256.0F);
                        int var23 = (int) (var20 * 256.0F);
                        int var24 = (int) (var21 * 256.0F);
                        int var25 = (var22 << 16) + (var23 << 8) + -16777216 + var24;
                        class410.field5946[var3++] = var25;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V")
    public static void method3754(boolean arg0) {
        if (!arg0) {
            method3756(-98, 13, -82, 119, 61, (byte) -5, 42, 41);
        }
        field9508 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method3755(String arg0, boolean arg1) {
        ++field9510;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; class164.field2749 > var2; ++var2) {
                if (arg0.equalsIgnoreCase(class343.field5109[var2])) {
                    return true;
                }
            }
            if (arg0.equalsIgnoreCase(class532.field7456.field8631)) {
                return true;
            } else {
                return arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method3756(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 == -81) {
            ++field9516;
            if (arg3 >= 0 && ~arg1 <= -1 && ~arg3 > ~(class675.field9604 + -1) && class218.field3316 + -1 > arg1) {
                if (class257.field3792 == null) {
                    return;
                }
                if (~arg0 == -1) {
                    class83 var8 = (class83) class264.method1729(arg4, arg3, arg1);
                    class83 var9 = (class83) class453.method2731(arg4, arg3, arg1);
                    if (var8 != null && arg6 != 2) {
                        if (var8 instanceof class458) {
                            ((class458) var8).field6523.method1469(arg2, 17601);
                        } else {
                            class445.method2678(arg0, -2, arg2, arg3, arg7, var8.method841((byte) 52), arg1, arg6, arg4);
                        }
                    }
                    if (var9 != null) {
                        if (var9 instanceof class458) {
                            ((class458) var9).field6523.method1469(arg2, 17601);
                            return;
                        }
                        class445.method2678(arg0, -2, arg2, arg3, arg7, var9.method841((byte) 52), arg1, arg6, arg4);
                        return;
                    }
                    return;
                }
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        class83 var10 = (class83) class63.method756(arg4, arg3, arg1, field9517 != null ? field9517 : (field9517 = method3758("qu")));
                        if (var10 != null) {
                            if (arg6 == 11) {
                                arg6 = 10;
                            }
                            if (var10 instanceof class533) {
                                ((class533) var10).field7468.method1469(arg2, 17601);
                                return;
                            }
                            class445.method2678(arg0, -2, arg2, arg3, arg7, var10.method841((byte) 52), arg1, arg6, arg4);
                            return;
                        }
                    } else {
                        if (arg0 != 3) {
                            return;
                        }
                        class83 var11 = (class83) class697.method3897(arg4, arg3, arg1);
                        if (var11 == null) {
                            return;
                        }
                        if (!(var11 instanceof class704)) {
                            class445.method2678(arg0, -2, arg2, arg3, arg7, var11.method841((byte) 52), arg1, arg6, arg4);
                            return;
                        }
                        ((class704) var11).field9893.method1469(arg2, 17601);
                    }
                    return;
                }
                class83 var12 = (class83) class275.method1797(arg4, arg3, arg1);
                if (var12 != null) {
                    if (var12 instanceof class433) {
                        ((class433) var12).field6263.method1469(arg2, 17601);
                        return;
                    }
                    int var13 = var12.method841((byte) 52);
                    if (~arg6 != -5 && ~arg6 != -6) {
                        if (~arg6 != -7) {
                            if (arg6 != 7) {
                                if (arg6 == 8) {
                                    class445.method2678(arg0, -2, arg2, arg3, arg7 + 4, var13, arg1, 4, arg4);
                                    class445.method2678(arg0, -2, arg2, arg3, (arg7 + 2 & 3) + 4, var13, arg1, 4, arg4);
                                    return;
                                }
                            } else {
                                class445.method2678(arg0, -2, arg2, arg3, (3 & arg7 + 2) + 4, var13, arg1, 4, arg4);
                            }
                            return;
                        }
                        class445.method2678(arg0, -2, arg2, arg3, arg7 + 4, var13, arg1, 4, arg4);
                        return;
                    }
                    class445.method2678(arg0, arg5 + 79, arg2, arg3, arg7, var13, arg1, 4, arg4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field9515;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (arg0 > -116) {
            this.method3752(-20, (byte) -80);
        }
        if (super.field8320.field3295) {
            int[] var4 = this.method3292(0, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class540.field7555; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field9507[var9];
                var5[var8] = class481.method2919(4080, var10 >> 12);
                var6[var8] = class481.method2919(4080, var10 >> 4);
                var7[var8] = class481.method2919(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class660() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            int var4 = arg0.method732(-559537960);
            if (~var4 != -1) {
                this.method3752(var4, (byte) -118);
            } else {
                this.field9509 = new int[arg0.method732(-559537960)][4];
                for (int var5 = 0; var5 < this.field9509.length; ++var5) {
                    this.field9509[var5][0] = arg0.method723((byte) -25);
                    this.field9509[var5][1] = arg0.method732(-559537960) << 4;
                    this.field9509[var5][2] = arg0.method732(class691.method3871(arg2, -559537957)) << 4;
                    this.field9509[var5][3] = arg0.method732(-559537960) << 4;
                }
            }
        }
        ++field9514;
        if (arg2 != 3) {
            this.method3752(-114, (byte) -22);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        ++field9512;
        if (this.field9509 == null) {
            this.method3752(1, (byte) -118);
        }
        if (arg0 == 4095) {
            this.method3757((byte) 40);
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
    private final void method3757(byte arg0) {
        ++field9505;
        int var2 = -36 / ((-68 - arg0) / 35);
        int var3 = this.field9509.length;
        if (var3 > 0) {
            for (int var4 = 0; ~var4 > -258; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; ~var3 < ~var7 && ~this.field9509[var7][0] >= ~var6; ++var7) {
                    ++var5;
                }
                int var12;
                int var13;
                int var14;
                if (var5 < var3) {
                    int[] var8 = this.field9509[var5];
                    if (~var5 < -1) {
                        int[] var9 = this.field9509[var5 - 1];
                        int var10 = (-var9[0] + var6 << 12) / (var8[0] + -var9[0]);
                        int var11 = -var10 + 4096;
                        var12 = var8[1] * var10 + var9[1] * var11 >> 12;
                        var13 = var8[3] * var10 + var9[3] * var11 >> 12;
                        var14 = var8[2] * var10 + var9[2] * var11 >> 12;
                    } else {
                        var13 = var8[3];
                        var14 = var8[2];
                        var12 = var8[1];
                    }
                } else {
                    int[] var15 = this.field9509[var3 + -1];
                    var13 = var15[3];
                    var12 = var15[1];
                    var14 = var15[2];
                }
                int var16 = var12 >> 4;
                int var17 = var14 >> 4;
                int var18 = var13 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (var18 >= 0) {
                    if (~var18 < -256) {
                        var18 = 255;
                    }
                } else {
                    var18 = 0;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                this.field9507[var4] = class2.method189(var18, class2.method189(var17 << 8, var16 << 16));
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3758(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
