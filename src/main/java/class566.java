import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class566 extends class211 {

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "[I")
    private int[] field8393 = new int[257];

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field8401 = new String[] { method4225(method4224("&uk\u0007C")), method4225(method4224("1`")), method4225(method4224("&uk\u000fC")), method4225(method4224("&uk\u0005C")), method4225(method4224("&uk\rC")), method4225(method4224("<8k`\u0016")), method4225(method4224(")c)\"")), method4225(method4224("&uk\u000bC")), method4225(method4224("&uk\nC")), method4225(method4224("\u000ex3/\u0007.re)\u0019&r,+\u0005365<\u000e4s1")) };

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "Lun;")
    public static class444 field8395;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field8400;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "[[I")
    private int[][] field8394;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V")
    public static void method4219(int arg0) {
        try {
            if (arg0 != -15739) {
                field8395 = null;
            }
            field8395 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8401[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    private final void method4220(int arg0) {
        try {
            ++field8392;
            int var2 = this.field8394.length;
            if (var2 > arg0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && var5 >= this.field8394[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var11;
                    int var12;
                    int var13;
                    if (var4 < var2) {
                        int[] var7 = this.field8394[var4];
                        if (var4 > 0) {
                            int[] var8 = this.field8394[var4 + -1];
                            int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                            int var10 = 4096 - var9;
                            var11 = var7[3] * var9 - -(var8[3] * var10) >> 12;
                            var12 = var7[2] * var9 + var8[2] * var10 >> 12;
                            var13 = var7[1] * var9 + var8[1] * var10 >> 12;
                        } else {
                            var11 = var7[3];
                            var12 = var7[2];
                            var13 = var7[1];
                        }
                    } else {
                        int[] var14 = this.field8394[var2 + -1];
                        var11 = var14[3];
                        var12 = var14[2];
                        var13 = var14[1];
                    }
                    int var15 = var13 >> 4;
                    int var16 = var11 >> 4;
                    int var17 = var12 >> 4;
                    if (var17 >= 0) {
                        if (var17 > 255) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    if (var15 >= 0) {
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
                    this.field8393[var3] = class544.method4107(var16, class544.method4107(var15 << 16, var17 << 8));
                }
            }
        } catch (RuntimeException var19) {
            throw class759.method5498(var19, field8401[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (~arg1 == -1) {
                int var4 = arg2.method1455((byte) 62);
                if (var4 == 0) {
                    this.field8394 = new int[arg2.method1455((byte) 62)][4];
                    for (int var5 = 0; var5 < this.field8394.length; ++var5) {
                        this.field8394[var5][0] = arg2.method1445((byte) 103);
                        this.field8394[var5][1] = arg2.method1455((byte) 62) << 4;
                        this.field8394[var5][2] = arg2.method1455((byte) 62) << 4;
                        this.field8394[var5][3] = arg2.method1455((byte) 62) << 4;
                    }
                } else {
                    this.method4222(var4, 2355);
                }
            }
            if (arg0 <= 67) {
                this.method234(-105, -76);
            }
            ++field8397;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field8401[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8401[5] : field8401[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class566() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public final void method437(int arg0) {
        try {
            ++field8399;
            if (arg0 != 27132) {
                this.method201((byte) -69, 114, (class163) null);
            }
            if (this.field8394 == null) {
                this.method4222(1, arg0 + -24777);
            }
            this.method4220(0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8401[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[[I")
    public final int[][] method234(int arg0, int arg1) {
        try {
            if (arg1 >= -38) {
                field8395 = null;
            }
            ++field8396;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (super.field3230.field10931) {
                int[] var4 = this.method1856(0, arg0, 83);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; ~var8 > ~class343.field5332; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field8393[var9];
                    var5[var8] = class291.method2359(var10, 16711680) >> 12;
                    var6[var8] = class291.method2359(var10 >> 4, 4080);
                    var7[var8] = class291.method2359(255, var10) << 4;
                }
            }
            return var3;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field8401[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
    public static final void method4221() {
        for (int var0 = 0; var0 < class559.field8328; ++var0) {
            if (!class192.field2596[var0]) {
                class643 var1 = class96.field1076[var0];
                class471 var2 = var1.field9313;
                int var3 = var1.field9330;
                int var4 = var2.method3579((byte) 125) - class578.field8582;
                int var5 = (var4 * 2 >> class602.field8828) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3577(-32630) - var4 >> class602.field8828;
                int var9 = var2.method3580((byte) -123) - var4 >> class602.field8828;
                int var10 = var2.method3580((byte) 117) + var4 >> class602.field8828;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class216.field3296) {
                    var10 = class216.field3296 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field9327[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class132.field1543) {
                        var16 = class132.field1543 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class343 var19 = class261.method2196(var3, var17, var11, field8400 != null ? field8400 : (field8400 = method4223(field8401[1])));
                        if (var19 != null && var19.field5328 != 0) {
                            if (var19.field5328 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field9327[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field9327[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field9327[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field9327[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    ++var6;
                }
                class192.field2596[var0] = true;
                class555.field8261[var3].method1499(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)V")
    private final void method4222(int arg0, int arg1) {
        try {
            ++field8398;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (~arg0 != -6) {
                                    if (~arg0 != -7) {
                                        throw new RuntimeException(field8401[9]);
                                    }
                                    this.field8394 = new int[4][4];
                                    this.field8394[0][3] = 0;
                                    this.field8394[0][1] = 0;
                                    this.field8394[0][2] = 4096;
                                    this.field8394[0][0] = 2048;
                                    this.field8394[1][1] = 4096;
                                    this.field8394[1][3] = 0;
                                    this.field8394[1][0] = 2867;
                                    this.field8394[1][2] = 4096;
                                    this.field8394[2][0] = 3276;
                                    this.field8394[2][3] = 0;
                                    this.field8394[2][2] = 4096;
                                    this.field8394[2][1] = 4096;
                                    this.field8394[3][0] = 4096;
                                    this.field8394[3][3] = 0;
                                    this.field8394[3][1] = 4096;
                                    this.field8394[3][2] = 0;
                                } else {
                                    this.field8394 = new int[16][4];
                                    this.field8394[0][3] = 321;
                                    this.field8394[0][1] = 80;
                                    this.field8394[0][2] = 192;
                                    this.field8394[0][0] = 0;
                                    this.field8394[1][2] = 449;
                                    this.field8394[1][1] = 321;
                                    this.field8394[1][3] = 562;
                                    this.field8394[1][0] = 155;
                                    this.field8394[2][0] = 389;
                                    this.field8394[2][3] = 803;
                                    this.field8394[2][2] = 690;
                                    this.field8394[2][1] = 578;
                                    this.field8394[3][1] = 947;
                                    this.field8394[3][0] = 671;
                                    this.field8394[3][2] = 995;
                                    this.field8394[3][3] = 1140;
                                    this.field8394[4][1] = 1285;
                                    this.field8394[4][2] = 1397;
                                    this.field8394[4][3] = 1509;
                                    this.field8394[4][0] = 897;
                                    this.field8394[5][2] = 1429;
                                    this.field8394[5][1] = 1525;
                                    this.field8394[5][0] = 1175;
                                    this.field8394[5][3] = 1413;
                                    this.field8394[6][0] = 1368;
                                    this.field8394[6][1] = 1734;
                                    this.field8394[6][2] = 1461;
                                    this.field8394[6][3] = 1333;
                                    this.field8394[7][0] = 1507;
                                    this.field8394[7][1] = 1413;
                                    this.field8394[7][3] = 1702;
                                    this.field8394[7][2] = 1525;
                                    this.field8394[8][0] = 1736;
                                    this.field8394[8][1] = 1108;
                                    this.field8394[8][3] = 2056;
                                    this.field8394[8][2] = 1590;
                                    this.field8394[9][1] = 1766;
                                    this.field8394[9][2] = 2056;
                                    this.field8394[9][0] = 2088;
                                    this.field8394[9][3] = 2666;
                                    this.field8394[10][1] = 2409;
                                    this.field8394[10][3] = 3276;
                                    this.field8394[10][2] = 2586;
                                    this.field8394[10][0] = 2355;
                                    this.field8394[11][0] = 2691;
                                    this.field8394[11][3] = 3228;
                                    this.field8394[11][2] = 3148;
                                    this.field8394[11][1] = 3116;
                                    this.field8394[12][3] = 3196;
                                    this.field8394[12][0] = 3031;
                                    this.field8394[12][2] = 3710;
                                    this.field8394[12][1] = 3806;
                                    this.field8394[13][0] = 3522;
                                    this.field8394[13][1] = 3437;
                                    this.field8394[13][3] = 3019;
                                    this.field8394[13][2] = 3421;
                                    this.field8394[14][2] = 3148;
                                    this.field8394[14][1] = 3116;
                                    this.field8394[14][3] = 3228;
                                    this.field8394[14][0] = 3727;
                                    this.field8394[15][0] = 4096;
                                    this.field8394[15][3] = 2746;
                                    this.field8394[15][1] = 2377;
                                    this.field8394[15][2] = 2505;
                                }
                            } else {
                                this.field8394 = new int[6][4];
                                this.field8394[0][3] = 0;
                                this.field8394[0][2] = 0;
                                this.field8394[0][1] = 0;
                                this.field8394[0][0] = 0;
                                this.field8394[1][3] = 1493;
                                this.field8394[1][0] = 1843;
                                this.field8394[1][2] = 0;
                                this.field8394[1][1] = 0;
                                this.field8394[2][1] = 0;
                                this.field8394[2][2] = 0;
                                this.field8394[2][3] = 2939;
                                this.field8394[2][0] = 2457;
                                this.field8394[3][1] = 0;
                                this.field8394[3][0] = 2781;
                                this.field8394[3][3] = 3565;
                                this.field8394[3][2] = 1124;
                                this.field8394[4][3] = 4031;
                                this.field8394[4][1] = 546;
                                this.field8394[4][2] = 3084;
                                this.field8394[4][0] = 3481;
                                this.field8394[5][0] = 4096;
                                this.field8394[5][1] = 4096;
                                this.field8394[5][2] = 4096;
                                this.field8394[5][3] = 4096;
                            }
                        } else {
                            this.field8394 = new int[7][4];
                            this.field8394[0][3] = 4096;
                            this.field8394[0][1] = 0;
                            this.field8394[0][2] = 0;
                            this.field8394[0][0] = 0;
                            this.field8394[1][2] = 4096;
                            this.field8394[1][0] = 663;
                            this.field8394[1][3] = 4096;
                            this.field8394[1][1] = 0;
                            this.field8394[2][0] = 1363;
                            this.field8394[2][1] = 0;
                            this.field8394[2][2] = 4096;
                            this.field8394[2][3] = 0;
                            this.field8394[3][1] = 4096;
                            this.field8394[3][0] = 2048;
                            this.field8394[3][3] = 0;
                            this.field8394[3][2] = 4096;
                            this.field8394[4][0] = 2727;
                            this.field8394[4][3] = 0;
                            this.field8394[4][1] = 4096;
                            this.field8394[4][2] = 0;
                            this.field8394[5][2] = 0;
                            this.field8394[5][0] = 3411;
                            this.field8394[5][1] = 4096;
                            this.field8394[5][3] = 4096;
                            this.field8394[6][0] = 4096;
                            this.field8394[6][2] = 0;
                            this.field8394[6][1] = 0;
                            this.field8394[6][3] = 4096;
                        }
                    } else {
                        this.field8394 = new int[8][4];
                        this.field8394[0][2] = 2602;
                        this.field8394[0][0] = 0;
                        this.field8394[0][3] = 2361;
                        this.field8394[0][1] = 2650;
                        this.field8394[1][0] = 2867;
                        this.field8394[1][2] = 1799;
                        this.field8394[1][3] = 1558;
                        this.field8394[1][1] = 2313;
                        this.field8394[2][0] = 3072;
                        this.field8394[2][1] = 2618;
                        this.field8394[2][3] = 1413;
                        this.field8394[2][2] = 1734;
                        this.field8394[3][1] = 2296;
                        this.field8394[3][2] = 1220;
                        this.field8394[3][3] = 947;
                        this.field8394[3][0] = 3276;
                        this.field8394[4][2] = 963;
                        this.field8394[4][1] = 2072;
                        this.field8394[4][0] = 3481;
                        this.field8394[4][3] = 722;
                        this.field8394[5][3] = 1766;
                        this.field8394[5][0] = 3686;
                        this.field8394[5][1] = 2730;
                        this.field8394[5][2] = 2152;
                        this.field8394[6][2] = 1060;
                        this.field8394[6][0] = 3891;
                        this.field8394[6][3] = 915;
                        this.field8394[6][1] = 2232;
                        this.field8394[7][3] = 1140;
                        this.field8394[7][2] = 1413;
                        this.field8394[7][1] = 1686;
                        this.field8394[7][0] = 4096;
                    }
                } else {
                    this.field8394 = new int[2][4];
                    this.field8394[0][1] = 0;
                    this.field8394[0][3] = 0;
                    this.field8394[0][2] = 0;
                    this.field8394[0][0] = 0;
                    this.field8394[1][3] = 4096;
                    this.field8394[1][1] = 4096;
                    this.field8394[1][0] = 4096;
                    this.field8394[1][2] = 4096;
                }
            }
            if (arg1 != 2355) {
                this.method201((byte) 98, -33, (class163) null);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8401[8] + arg0 + ',' + arg1 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4223(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4224(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 107);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4225(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 22;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 78;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
