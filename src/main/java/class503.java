import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class503 extends class232 {

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    private int field7516 = 1;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    private int field7520 = 1;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field7524 = new String[] { method3794(method3793("kj8 \u0006")), method3794(method3793("tnz\u000e")), method3794(method3793("a58LS")), method3794(method3793("kj8&\u0006")), method3794(method3793("kj8.\u0006")), method3794(method3793("ov")), method3794(method3793("kj8$\u0006")), method3794(method3793("ow")), method3794(method3793("kj8#\u0006")), method3794(method3793("kj8'\u0006")) };

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "[[Ljava/lang/String;")
    public static String[][] field7517 = new String[][] { { method3794(method3793("W*")), method3794(method3793("W)")), method3794(method3793("I*")), "F" }, { method3794(method3793("W*")), method3794(method3793("W)")), method3794(method3793("W(")), method3794(method3793("I*")), method3794(method3793("I)")), "F" }, { method3794(method3793("W*")), method3794(method3793("W)")), method3794(method3793("W(")), method3794(method3793("W/")), method3794(method3793("I*")), method3794(method3793("I)")), method3794(method3793("I(")), "F" } };

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZLjava/lang/String;)[B", line = 5)
    public static final byte[] method3790(boolean arg0, String arg1) {
        try {
            ++field7518;
            int var2 = arg1.length();
            if (!arg0) {
                method3791(24);
            }
            if (~var2 == -1) {
                return new byte[0];
            } else {
                int var3 = var2 + 3 & -4;
                int var4 = var3 / 4 * 3;
                if (~var2 < ~(var3 + -2) && class373.method3076((byte) -105, arg1.charAt(var3 + -2)) != -1) {
                    if (var3 + -1 >= var2 || class373.method3076((byte) 125, arg1.charAt(var3 - 1)) == -1) {
                        --var4;
                    }
                } else {
                    var4 -= 2;
                }
                byte[] var5 = new byte[var4];
                class568.method4175(0, arg1, var5, arg0);
                return var5;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7524[3] + arg0 + ',' + (arg1 != null ? field7524[2] : field7524[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V", line = 36)
    public class503() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILwq;I)V", line = 41)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg0 > 96) {
                if (arg2 != 0) {
                    if (arg2 != 1) {
                        if (arg2 == 2) {
                            super.field3605 = arg1.method1645((byte) -118) == 1;
                        }
                    } else {
                        this.field7516 = arg1.method1645((byte) -110);
                    }
                } else {
                    this.field7520 = arg1.method1645((byte) -124);
                }
                ++field7521;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7524[9] + arg0 + ',' + (arg1 != null ? field7524[2] : field7524[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)[I", line = 87)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field7523;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                int var4 = this.field7516 + this.field7516 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field7520 + this.field7520 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field7516 + arg0; ~var9 >= ~(this.field7516 + arg0); ++var9) {
                    int[] var10 = this.method2022(var9 & class315.field5126, 0, 0);
                    int[] var11 = new int[class449.field6969];
                    int var12 = 0;
                    for (int var13 = -this.field7520; var13 <= this.field7520; ++var13) {
                        var12 += var10[var13 & class250.field3824];
                    }
                    int var14 = 0;
                    while (~var14 > ~class449.field6969) {
                        var11[var14] = var7 * var12 >> 16;
                        int var15 = var12 - var10[var14 - this.field7520 & class250.field3824];
                        ++var14;
                        var12 = var10[class250.field3824 & this.field7520 + var14] + var15;
                    }
                    var8[-arg0 + this.field7516 + var9] = var11;
                }
                for (int var16 = 0; class449.field6969 > var16; ++var16) {
                    int var17 = 0;
                    for (int var18 = 0; var18 < var4; ++var18) {
                        var17 += var8[var18][var16];
                    }
                    var3[var16] = var5 * var17 >> 16;
                }
            }
            if (arg1 != 123) {
                method3792((byte) -110);
            }
            return var3;
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field7524[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V", line = 174)
    public static final void method3791(int arg0) {
        try {
            ++field7522;
            class152.method1380(class623.field8996.field6404.method3711(true), true);
            int var1 = (class791.field11550 >> 12) + (class397.field6289 >> 3);
            int var2 = (class141.field2011 >> 3) + (class133.field1896 >> 12);
            class673.field9554 = class438.field6846.field9975 = 0;
            class438.field6846.method5362(8, 8, (byte) -59);
            byte var3 = 18;
            class74.field1067 = new int[var3];
            class620.field8953 = new byte[var3][];
            class382.field6143 = new byte[var3][];
            class325.field5293 = new int[var3];
            class221.field3483 = new byte[var3][];
            class548.field8055 = new byte[var3][];
            class395.field6269 = new byte[var3][];
            class380.field6122 = new int[var3];
            class426.field6724 = new int[var3];
            class543.field7995 = new int[var3];
            class641.field9196 = new int[var3];
            class710.field10276 = new int[var3][4];
            int var4 = 0;
            for (int var5 = (-(class126.field1823 >> 4) + var1) / 8; ~var5 >= ~(((class126.field1823 >> 4) + var1) / 8); ++var5) {
                for (int var6 = (var2 - (class169.field2725 >> 4)) / 8; var6 <= ((class169.field2725 >> 4) + var2) / 8; ++var6) {
                    int var7 = (var5 << 8) - -var6;
                    class543.field7995[var4] = var7;
                    class380.field6122[var4] = class686.field9915.method585(-1, "m" + var5 + "_" + var6);
                    class426.field6724[var4] = class686.field9915.method585(-1, "l" + var5 + "_" + var6);
                    class74.field1067[var4] = class686.field9915.method585(-1, "n" + var5 + "_" + var6);
                    class325.field5293[var4] = class686.field9915.method585(-1, field7524[5] + var5 + "_" + var6);
                    class641.field9196[var4] = class686.field9915.method585(arg0 + -334, field7524[7] + var5 + "_" + var6);
                    if (~class74.field1067[var4] == 0) {
                        class380.field6122[var4] = -1;
                        class426.field6724[var4] = -1;
                        class325.field5293[var4] = -1;
                        class641.field9196[var4] = -1;
                    }
                    ++var4;
                }
            }
            for (int var8 = var4; ~var8 > ~class74.field1067.length; ++var8) {
                class74.field1067[var8] = -1;
                class380.field6122[var8] = -1;
                class426.field6724[var8] = -1;
                class325.field5293[var8] = -1;
                class641.field9196[var8] = -1;
            }
            if (arg0 != 333) {
                field7517 = null;
            }
            byte var9;
            if (class315.field5127 != 3) {
                if (class315.field5127 == 9) {
                    var9 = 10;
                } else {
                    if (~class315.field5127 != -8) {
                        throw new RuntimeException("");
                    }
                    var9 = 8;
                }
            } else {
                var9 = 4;
            }
            class796.method5716(var1, false, -116, var9, var2);
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7524[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)[[I", line = 275)
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field7519;
            int[][] var3 = super.field3599.method1580(arg1, (byte) -122);
            if (arg0 != -3093) {
                this.method63(-16, (class176) null, -30);
            }
            if (super.field3599.field2743) {
                int var4 = this.field7516 + 1 + this.field7516;
                int var5 = 65536 / var4;
                int var6 = this.field7520 + 1 - -this.field7520;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field7516 + arg1; ~var9 >= ~(this.field7516 + arg1); ++var9) {
                    int[][] var10 = this.method2023((byte) 103, var9 & class315.field5126, 0);
                    int[][] var11 = new int[3][class449.field6969];
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int[] var15 = var10[0];
                    int[] var16 = var10[1];
                    int[] var17 = var10[2];
                    for (int var18 = -this.field7520; var18 <= this.field7520; ++var18) {
                        int var19 = class250.field3824 & var18;
                        var13 += var16[var19];
                        var14 += var17[var19];
                        var12 += var15[var19];
                    }
                    int[] var20 = var11[0];
                    int[] var21 = var11[1];
                    int[] var22 = var11[2];
                    int var23 = 0;
                    while (var23 < class449.field6969) {
                        var20[var23] = var7 * var12 >> 16;
                        var21[var23] = var7 * var13 >> 16;
                        var22[var23] = var7 * var14 >> 16;
                        int var24 = -this.field7520 + var23 & class250.field3824;
                        ++var23;
                        int var25 = var14 - var17[var24];
                        int var26 = var13 - var16[var24];
                        int var27 = var12 - var15[var24];
                        int var28 = this.field7520 + var23 & class250.field3824;
                        var14 = var17[var28] + var25;
                        var12 = var15[var28] + var27;
                        var13 = var16[var28] + var26;
                    }
                    var8[var9 - (-this.field7516 + arg1)] = var11;
                }
                int[] var29 = var3[0];
                int[] var30 = var3[1];
                int[] var31 = var3[2];
                for (int var32 = 0; ~var32 > ~class449.field6969; ++var32) {
                    int var33 = 0;
                    int var34 = 0;
                    int var35 = 0;
                    for (int var36 = 0; ~var4 < ~var36; ++var36) {
                        int[][] var37 = var8[var36];
                        var35 += var37[2][var32];
                        var33 += var37[0][var32];
                        var34 += var37[1][var32];
                    }
                    var29[var32] = var5 * var33 >> 16;
                    var30[var32] = var5 * var34 >> 16;
                    var31[var32] = var5 * var35 >> 16;
                }
            }
            return var3;
        } catch (RuntimeException var39) {
            throw class590.method4333(var39, field7524[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V", line = 414)
    public static void method3792(byte arg0) {
        try {
            int var1 = -41 / ((arg0 - -56) / 39);
            field7517 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7524[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3793(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3794(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 98;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
