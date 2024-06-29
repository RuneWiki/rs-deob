import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class432 extends class211 {

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    private int field6349 = 1;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    private int field6351 = 1;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field6359 = new String[] { method3314(method3313("FX7m\u0013")), method3314(method3313("FX7`\u0013")), method3314(method3313("FX7e\u0013")), method3314(method3313("FX7a\u0013")), method3314(method3313("LJuH")), method3314(method3313("Y\u00117\nF")), method3314(method3313("FX7g\u0013")), method3314(method3313("FX7f\u0013")), method3314(method3313("FX7b\u0013")) };

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "Lqha;")
    public static class112 field6357 = new class112(8);

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "Lup;")
    public static class290 field6358 = new class290();

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[[I")
    public final int[][] method234(int arg0, int arg1) {
        try {
            ++field6354;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (arg1 > -38) {
                return null;
            } else {
                if (super.field3230.field10931) {
                    int var4 = this.field6351 - (-this.field6351 - 1);
                    int var5 = 65536 / var4;
                    int var6 = this.field6349 + this.field6349 + 1;
                    int var7 = 65536 / var6;
                    int[][][] var8 = new int[var4][][];
                    for (int var9 = arg0 - this.field6351; var9 <= this.field6351 + arg0; ++var9) {
                        int[][] var10 = this.method1853(0, 0, class484.field6992 & var9);
                        int[][] var11 = new int[3][class343.field5332];
                        int var12 = 0;
                        int var13 = 0;
                        int var14 = 0;
                        int[] var15 = var10[0];
                        int[] var16 = var10[1];
                        int[] var17 = var10[2];
                        for (int var18 = -this.field6349; ~this.field6349 <= ~var18; ++var18) {
                            int var19 = var18 & class3.field28;
                            var12 += var15[var19];
                            var14 += var17[var19];
                            var13 += var16[var19];
                        }
                        int[] var20 = var11[0];
                        int[] var21 = var11[1];
                        int[] var22 = var11[2];
                        int var23 = 0;
                        while (class343.field5332 > var23) {
                            var20[var23] = var7 * var12 >> 16;
                            var21[var23] = var7 * var13 >> 16;
                            var22[var23] = var7 * var14 >> 16;
                            int var24 = class3.field28 & var23 - this.field6349;
                            int var25 = var14 - var17[var24];
                            int var26 = var12 - var15[var24];
                            int var27 = var13 - var16[var24];
                            ++var23;
                            int var28 = this.field6349 + var23 & class3.field28;
                            var14 = var17[var28] + var25;
                            var12 = var15[var28] + var26;
                            var13 = var16[var28] + var27;
                        }
                        var8[-arg0 + var9 + this.field6351] = var11;
                    }
                    int[] var29 = var3[0];
                    int[] var30 = var3[1];
                    int[] var31 = var3[2];
                    for (int var32 = 0; var32 < class343.field5332; ++var32) {
                        int var33 = 0;
                        int var34 = 0;
                        int var35 = 0;
                        for (int var36 = 0; var4 > var36; ++var36) {
                            int[][] var37 = var8[var36];
                            var33 += var37[0][var32];
                            var35 += var37[2][var32];
                            var34 += var37[1][var32];
                        }
                        var29[var32] = var5 * var33 >> 16;
                        var30[var32] = var5 * var34 >> 16;
                        var31[var32] = var5 * var35 >> 16;
                    }
                }
                return var3;
            }
        } catch (RuntimeException var39) {
            throw class759.method5498(var39, field6359[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class432() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)V")
    public static final void method3309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field6350;
            int var6 = 0;
            int var7 = arg0;
            if (arg5 != 65536) {
                field6357 = null;
            }
            int var8 = arg3 * arg3;
            int var9 = arg0 * arg0;
            int var10 = var9 << 1;
            int var11 = var8 << 1;
            int var12 = arg0 << 1;
            int var13 = (1 - var12) * var8 - -var10;
            int var14 = -((var12 - 1) * var11) + var9;
            int var15 = var8 << 2;
            int var16 = var9 << 2;
            int var17 = ((var6 << 1) + 3) * var10;
            int var18 = ((arg0 << 1) - 3) * var11;
            int var19 = (var6 + 1) * var16;
            class319.method2702(class243.field3731[arg2], -arg3 + arg4, arg3 + arg4, true, arg1);
            int var20 = (arg0 - 1) * var15;
            while (~var7 < -1) {
                if (~var13 > -1) {
                    while (var13 < 0) {
                        var14 += var19;
                        var13 += var17;
                        ++var6;
                        var17 += var16;
                        var19 += var16;
                    }
                }
                if (~var14 > -1) {
                    var13 += var17;
                    var14 += var19;
                    ++var6;
                    var19 += var16;
                    var17 += var16;
                }
                var13 += -var20;
                var14 += -var18;
                var20 -= var15;
                --var7;
                var18 -= var15;
                int var21 = arg2 - var7;
                int var22 = arg2 - -var7;
                int var23 = arg4 + var6;
                int var24 = -var6 + arg4;
                class319.method2702(class243.field3731[var21], var24, var23, true, arg1);
                class319.method2702(class243.field3731[var22], var24, var23, true, arg1);
            }
        } catch (RuntimeException var26) {
            throw class759.method5498(var26, field6359[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)Z")
    public static final boolean method3310(int arg0, int arg1) {
        try {
            if (arg1 != 256) {
                method3310(93, -11);
            }
            ++field6355;
            return ~arg0 == -5 || ~arg0 == -9 || ~arg0 == -12;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6359[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)[I")
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field6356;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                int var4 = this.field6351 + this.field6351 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field6349 + this.field6349 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field6351 + arg1; ~var9 >= ~(this.field6351 + arg1); ++var9) {
                    int[] var10 = this.method1856(0, var9 & class484.field6992, 35);
                    int[] var11 = new int[class343.field5332];
                    int var12 = 0;
                    for (int var13 = -this.field6349; var13 <= this.field6349; ++var13) {
                        var12 += var10[var13 & class3.field28];
                    }
                    int var14 = 0;
                    while (class343.field5332 > var14) {
                        var11[var14] = var7 * var12 >> 16;
                        int var15 = var12 - var10[-this.field6349 + var14 & class3.field28];
                        ++var14;
                        var12 = var10[class3.field28 & var14 - -this.field6349] + var15;
                    }
                    var8[this.field6351 + var9 + -arg1] = var11;
                }
                for (int var16 = 0; ~var16 > ~class343.field5332; ++var16) {
                    int var17 = 0;
                    for (int var18 = 0; var18 < var4; ++var18) {
                        var17 += var8[var18][var16];
                    }
                    var3[var16] = var5 * var17 >> 16;
                }
            }
            if (arg0 != 8217) {
                method3311(107, (class66) null, 52, 80, (class541) null, -43, -53, 0, (class512) null);
            }
            return var3;
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field6359[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg0 >= 67) {
                if (arg1 != 0) {
                    if (~arg1 != -2) {
                        if (~arg1 == -3) {
                            super.field3235 = ~arg2.method1455((byte) 62) == -2;
                        }
                    } else {
                        this.field6351 = arg2.method1455((byte) 62);
                    }
                } else {
                    this.field6349 = arg2.method1455((byte) 62);
                }
                ++field6353;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6359[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6359[5] : field6359[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILha;IILcn;IIILaa;)V")
    public static final void method3311(int arg0, class66 arg1, int arg2, int arg3, class541 arg4, int arg5, int arg6, int arg7, class512 arg8) {
        try {
            ++field6352;
            class306 var9 = class643.field9316.method622(arg7, (byte) -111);
            if (var9 != null && var9.field4815 && var9.method2593(class276.field4168, false)) {
                if (var9.field4780 != null) {
                    int[] var10 = new int[var9.field4780.length];
                    for (int var11 = 0; var10.length / 2 > var11; ++var11) {
                        int var12;
                        if (~class185.field2559 != -5) {
                            var12 = (int) class377.field5748 + class550.field8201 & 16383;
                        } else {
                            var12 = (int) class377.field5748 & 16383;
                        }
                        int var13 = class298.field4704[var12];
                        int var14 = class298.field4703[var12];
                        if (~class185.field2559 != -5) {
                            var13 = var13 * 256 / (class681.field9866 + 256);
                            var14 = var14 * 256 / (class681.field9866 + 256);
                        }
                        var10[var11 * 2] = ((var9.field4780[var11 * 2] * 4 + arg0) * var14 + (var9.field4780[var11 * 2 + 1] * 4 + arg3) * var13 >> 14) + arg4.field8029 / 2 + arg2;
                        var10[var11 * 2 + 1] = arg4.field8045 / 2 + -((var9.field4780[var11 * 2 + 1] * 4 + arg3) * var14 + -((var9.field4780[var11 * 2] * 4 + arg0) * var13) >> 14) + arg5;
                    }
                    class442.method3396(arg1, var10, var9.field4800, arg4.field7941, arg4.field8061);
                    if (~var9.field4813 >= -1) {
                        for (int var15 = 0; ~(var10.length / 2 - 1) < ~var15; ++var15) {
                            arg1.method537(var10[var15 * 2], var10[var15 * 2 + 1], var10[var15 * 2 - -2], var10[var15 * 2 + 1 + 2], var9.field4807[var9.field4819[var15] & 255], 1, arg8, arg2, arg5);
                        }
                        arg1.method537(var10[var10.length + -2], var10[var10.length - 1], var10[0], var10[1], var9.field4807[255 & var9.field4819[var9.field4819.length - 1]], 1, arg8, arg2, arg5);
                    } else {
                        for (int var16 = 0; var10.length / 2 + -1 > var16; ++var16) {
                            int var17 = var10[var16 * 2];
                            int var18 = var10[var16 * 2 - -1];
                            int var19 = var10[(var16 + 1) * 2];
                            int var20 = var10[var16 * 2 + 1 + 2];
                            if (~var19 <= ~var17) {
                                if (~var17 == ~var19 && var20 < var18) {
                                    int var21 = var18;
                                    var18 = var20;
                                    var20 = var21;
                                }
                            } else {
                                int var22 = var17;
                                var17 = var19;
                                int var23 = var18;
                                var18 = var20;
                                var19 = var22;
                                var20 = var23;
                            }
                            arg1.method530(var17, var18, var19, var20, var9.field4807[255 & var9.field4819[var16]], 1, arg8, arg2, arg5, var9.field4813, var9.field4826, var9.field4788);
                        }
                        int var24 = var10[var10.length + -2];
                        int var25 = var10[var10.length + -1];
                        int var26 = var10[0];
                        int var27 = var10[1];
                        if (var26 < var24) {
                            int var28 = var24;
                            var24 = var26;
                            int var29 = var25;
                            var26 = var28;
                            var25 = var27;
                            var27 = var29;
                        } else if (var24 == var26 && var25 > var27) {
                            int var30 = var25;
                            var25 = var27;
                            var27 = var30;
                        }
                        arg1.method530(var24, var25, var26, var27, var9.field4807[255 & var9.field4819[var9.field4819.length + -1]], 1, arg8, arg2, arg5, var9.field4813, var9.field4826, var9.field4788);
                    }
                }
                class581 var31 = null;
                if (~var9.field4818 != 0) {
                    var31 = var9.method2601(false, -123, arg1);
                    if (var31 != null) {
                        class162.method1396(arg5, arg4, var31, false, arg2, arg8, arg3, arg0);
                    }
                }
                if (var9.field4803 != null) {
                    int var32 = 0;
                    if (var31 != null) {
                        var32 = var31.method986();
                    }
                    class67 var33 = class562.field8349;
                    class578 var34 = class493.field7083;
                    if (~var9.field4828 == -2) {
                        var34 = class64.field664;
                        var33 = class309.field4911;
                    }
                    if (~var9.field4828 == -3) {
                        var34 = class475.field6895;
                        var33 = class269.field4100;
                    }
                    class572.method4274(var34, var9.field4803, arg4, var33, arg5, var9.field4806, arg6 + -20021, arg2, arg0, arg3, arg8, var32);
                }
            }
            if (arg6 != 2376) {
                method3309(-102, -127, 33, 14, -112, -75);
            }
        } catch (RuntimeException var36) {
            throw class759.method5498(var36, field6359[3] + arg0 + ',' + (arg1 != null ? field6359[5] : field6359[4]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6359[5] : field6359[4]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field6359[5] : field6359[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
    public static void method3312(int arg0) {
        try {
            field6358 = null;
            field6357 = null;
            if (arg0 != -1671730960) {
                field6358 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6359[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3313(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3314(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 34;
                    break;
                case 1:
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 59;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
