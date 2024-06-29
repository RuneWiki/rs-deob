import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class266 extends class578 {

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "[I")
    private int[] field3612;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "[I")
    private int[] field3606;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "Lrk;")
    private class30 field3595;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Lrk;")
    private class30 field3602;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "Lrk;")
    private class30 field3596;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "[Lrk;")
    private class30[] field3603;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "[I")
    public static int[] field3610 = new int[13];

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "Len;")
    public static class290 field3609 = new class290("", 15);

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "Llaa;")
    public static class105 field3604;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "Lr;")
    public static class166 field3600;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "Llf;")
    public static class215 field3599;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIZLsea;IILfa;D)[I")
    public final int[] method1618(boolean arg0, int arg1, boolean arg2, class648 arg3, int arg4, int arg5, class212 arg6, double arg7) {
        class463.field6382 = arg3;
        field3601++;
        class400.field5606 = arg6;
        for (int var10 = 0; var10 < this.field3603.length; var10++) {
            this.field3603[var10].method293(false, arg1, arg4);
        }
        class174.method1227(arg7, 30890);
        class360.method2061((byte) 87, arg4, arg1);
        int[] var11 = new int[arg1 * arg4];
        int var12;
        byte var13;
        int var14;
        if (arg0) {
            var13 = -1;
            var12 = -1;
            var14 = arg4 - 1;
        } else {
            var12 = arg4;
            var13 = 1;
            var14 = 0;
        }
        int var15 = arg5;
        for (int var16 = 0; var16 < arg1; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3602.field378) {
                int[] var22 = this.field3602.method48(1, var16);
                var20 = var22;
                var19 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field3602.method30(var16, (byte) 7);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            if (arg2) {
                var15 = var16;
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class40.field471[var24];
                int var28 = class40.field471[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class40.field471[var26];
                int var30 = (var28 << 8) + ((var27 << 16) + var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg2) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3603.length; var17++) {
            this.field3603[var17].method290(53);
        }
        return var11;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILsea;Lfa;)Z")
    public final boolean method1619(int arg0, class648 arg1, class212 arg2) {
        field3611++;
        if (class220.field3080 < 0) {
            for (int var4 = 0; var4 < this.field3606.length; var4++) {
                if (!arg1.method3623(-92, this.field3606[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3606.length; var5++) {
                if (!arg1.method3630(this.field3606[var5], class220.field3080, -118)) {
                    return false;
                }
            }
        }
        if (arg0 != -1) {
            method1622(99);
        }
        for (int var6 = 0; var6 < this.field3612.length; var6++) {
            if (!arg2.method1367(this.field3612[var6], false)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method1620(byte arg0) {
        field3609 = null;
        field3599 = null;
        field3604 = null;
        field3600 = null;
        int var1 = -126 / ((-arg0 - 49) / 37);
        field3610 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lsea;Lfa;IIZI)[F")
    public final float[] method1621(class648 arg0, class212 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class463.field6382 = arg0;
        class400.field5606 = arg1;
        field3597++;
        for (int var7 = 0; var7 < this.field3603.length; var7++) {
            this.field3603[var7].method293(false, arg3, arg5);
        }
        class360.method2061((byte) 87, arg5, arg3);
        float[] var8 = new float[arg3 * 4 * arg5];
        int var9 = 0;
        for (int var10 = 0; var10 < arg3; var10++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3602.field378) {
                int[] var13 = this.field3602.method48(1, var10);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3602.method30(var10, (byte) 7);
                var14 = var17[0];
                var16 = var17[1];
                var15 = var17[2];
            }
            int[] var18;
            if (this.field3596.field378) {
                var18 = this.field3596.method48(1, var10);
            } else {
                var18 = this.field3596.method30(var10, (byte) 7)[0];
            }
            if (arg4) {
                var9 = var10 << 2;
            }
            int[] var19;
            if (this.field3595.field378) {
                var19 = this.field3595.method48(1, var10);
            } else {
                var19 = this.field3595.method30(var10, (byte) 7)[0];
            }
            for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                float var21 = (float) var18[var20] / 4096.0F;
                if ((var21 < 0.0F)) {
                    var21 = 0.0F;
                } else if (var21 > 1.0F) {
                    var21 = 1.0F;
                }
                float var22 = ((float) var19[var20] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var14[var20] * var22;
                var8[var9++] = (float) var16[var20] * var22;
                var8[var9++] = (float) var15[var20] * var22;
                var8[var9++] = var21;
                if (arg4) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        int var11 = -110 % ((82 - arg2) / 43);
        for (int var12 = 0; var12 < this.field3603.length; var12++) {
            this.field3603[var12].method290(46);
        }
        return var8;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
    public static final void method1622(int arg0) {
        field3605++;
        class406.method2362(0, (long) class186.field2697, class334.field4506);
        if (class631.field8758 != -1) {
            class22.method231(class631.field8758, (byte) -122);
        }
        for (int var1 = arg0; var1 < class84.field1247; var1++) {
            if (class130.field1872[var1]) {
                class325.field4428[var1] = true;
            }
            class633.field8764[var1] = class130.field1872[var1];
            class130.field1872[var1] = false;
        }
        class98.field1374 = class186.field2697;
        if (class631.field8758 != -1) {
            class84.field1247 = 0;
            class450.method2560(124);
        }
        class334.field4506.method193();
        class465.method2624(true, class334.field4506);
        int var2 = class475.method2679(16);
        if (var2 == -1) {
            var2 = class112.field1563;
        }
        if (var2 == -1) {
            var2 = class236.field3252;
        }
        class267.method1626((byte) 10, var2);
        class41.field479 = 0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIILsea;IDLfa;)[I")
    public final int[] method1623(boolean arg0, int arg1, int arg2, class648 arg3, int arg4, double arg5, class212 arg6) {
        field3608++;
        class463.field6382 = arg3;
        class400.field5606 = arg6;
        for (int var9 = 0; var9 < this.field3603.length; var9++) {
            this.field3603[var9].method293(false, arg4, arg1);
        }
        if (arg2 != 30321) {
            field3610 = null;
        }
        class174.method1227(arg5, 30890);
        class360.method2061((byte) 87, arg1, arg4);
        int[] var10 = new int[arg1 * arg4 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3602.field378) {
                int[] var18 = this.field3602.method48(arg2 ^ 0x7670, var12);
                var17 = var18;
                var16 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field3602.method30(var12, (byte) 7);
                var15 = var14[0];
                var16 = var14[2];
                var17 = var14[1];
            }
            if (arg0) {
                var11 = var12;
            }
            int[] var19;
            if (this.field3596.field378) {
                var19 = this.field3596.method48(1, var12);
            } else {
                var19 = this.field3596.method30(var12, (byte) 7)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class40.field471[var21];
                int var25 = class40.field471[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class40.field471[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var27 << 24) + ((var24 << 16) - (-(var25 << 8) - var26));
                if (arg0) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field3603.length; var13++) {
            this.field3603[var13].method290(68);
        }
        return var10;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lin;Lr;BII)V")
    public static final void method1624(class78 arg0, class166 arg1, byte arg2, int arg3, int arg4) {
        field3594++;
        class618 var5 = arg0.method608(arg1, (byte) -124);
        if (var5 == null) {
            return;
        }
        arg1.method200(arg4, arg3, arg0.field1104 + arg4, arg0.field1050 + arg3);
        if (class533.field7214 == 2 || class533.field7214 == 5 || class265.field3585 == null) {
            arg1.method112(-16777216, var5, arg4, arg3);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class203.field2863 == 4) {
                var8 = class247.field3386;
                var9 = class323.field4403;
                var7 = (int) (-class705.field9964) & 0x3FFF;
                var6 = 4096;
            } else {
                var6 = 4096 - class216.field3062 * 16;
                var7 = (int) (-class705.field9964) + class174.field2526 & 0x3FFF;
                var8 = class143.field2063.field4042;
                var9 = class143.field2063.field4047;
            }
            int var10 = var8 / 128 + 48 - (class401.field5620 * 2 + -208);
            int var11 = class257.field3508 * 4 + 48 + 208 - (class257.field3508 * 2) - (var9 / 128);
            class265.field3585.method3928((float) arg0.field1104 / 2.0F + (float) arg4, (float) arg0.field1050 / 2.0F + (float) arg3, (float) var10, (float) var11, var6, var7 << 2, var5, arg4, arg3);
            for (class72 var12 = (class72) class342.field4590.method1436(28964); var12 != null; var12 = (class72) class342.field4590.method1443((byte) 6)) {
                int var58 = var12.field956;
                int var59 = (class451.field6190.field6741[var58] >> 14 & 0x3FFF) - class498.field6774;
                int var60 = (class451.field6190.field6741[var58] & 0x3FFF) - class613.field8555;
                int var61 = var59 * 4 + 2 - var8 / 128;
                int var62 = var60 * 4 + 2 - (var9 / 128);
                class16.method76(arg3, arg0, var62, arg4, arg1, class451.field6190.field6747[var58], var61, var5, (byte) -34);
            }
            for (int var13 = 0; var13 < class65.field855; var13++) {
                int var55 = class584.field8242[var13] * 4 + 2 - (var8 / 128);
                int var56 = class527.field7146[var13] * 4 + 2 - (var9 / 128);
                class301 var57 = class475.field6543.method2685(class531.field7179[var13], -96);
                if (var57.field4113 != null) {
                    var57 = var57.method1833(-113, class578.field8156);
                    if (var57 == null || var57.field4136 == -1) {
                        continue;
                    }
                }
                class16.method76(arg3, arg0, var56, arg4, arg1, var57.field4136, var55, var5, (byte) -34);
            }
            for (class385 var14 = (class385) class687.field9801.method977(0); var14 != null; var14 = (class385) class687.field9801.method975(-1)) {
                int var50 = (int) (var14.field5623 >> 28 & 0x3L);
                if (class234.field3232 == var50) {
                    int var51 = (int) (var14.field5623 & 0x3FFFL) - class498.field6774;
                    int var52 = (int) (var14.field5623 >> 14 & 0x3FFFL) - class613.field8555;
                    int var53 = var51 * 4 + 2 - (var8 / 128);
                    int var54 = var52 * 4 + 2 - (var9 / 128);
                    class160.method1130(arg3, 256, var54, var5, arg4, arg0, class116.field1586[0], var53);
                }
            }
            for (int var15 = 0; var15 < class698.field9912; var15++) {
                class393 var45 = (class393) class299.field4071.method970((byte) 89, (long) class636.field8790[var15]);
                if (var45 != null) {
                    class61 var46 = var45.field5552;
                    if (var46.method508(false) && class143.field2063.field4053 == var46.field4053) {
                        class568 var47 = var46.field674;
                        if (var47 != null && var47.field8079 != null) {
                            var47 = var47.method3259((byte) 108, class578.field8156);
                        }
                        if (var47 != null && var47.field8058 && var47.field8054) {
                            int var48 = var46.field4042 / 128 - (var8 / 128);
                            int var49 = var46.field4047 / 128 - (var9 / 128);
                            if (var47.field8051 == -1) {
                                class160.method1130(arg3, 256, var49, var5, arg4, arg0, class116.field1586[1], var48);
                            } else {
                                class16.method76(arg3, arg0, var49, arg4, arg1, var47.field8051, var48, var5, (byte) -34);
                            }
                        }
                    }
                }
            }
            int var16 = class528.field7160;
            int[] var17 = class439.field6091;
            for (int var18 = 0; var18 < var16; var18++) {
                class677 var37 = class671.field9407[var17[var18]];
                if (var37 != null && var37.method3848(false) && !var37.field9697 && class143.field2063 != var37 && class143.field2063.field4053 == var37.field4053) {
                    int var38 = var37.field4042 / 128 - (var8 / 128);
                    int var39 = var37.field4047 / 128 - (var9 / 128);
                    boolean var40 = false;
                    for (int var41 = 0; var41 < class671.field9419; var41++) {
                        if (var37.field9693.equals(class696.field9891[var41]) && class531.field7187[var41] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var42 = false;
                    for (int var43 = 0; var43 < class56.field633; var43++) {
                        if (var37.field9693.equals(class174.field2525[var43].field3181)) {
                            var42 = true;
                            break;
                        }
                    }
                    boolean var44 = false;
                    if (class143.field2063.field9709 != 0 && var37.field9709 != 0 && class143.field2063.field9709 == var37.field9709) {
                        var44 = true;
                    }
                    if (var37.field9660) {
                        class160.method1130(arg3, arg2 + 367, var39, var5, arg4, arg0, class116.field1586[6], var38);
                    } else if (var40) {
                        class160.method1130(arg3, arg2 + 367, var39, var5, arg4, arg0, class116.field1586[3], var38);
                    } else if (var42) {
                        class160.method1130(arg3, 256, var39, var5, arg4, arg0, class116.field1586[5], var38);
                    } else if (var44) {
                        class160.method1130(arg3, 256, var39, var5, arg4, arg0, class116.field1586[4], var38);
                    } else {
                        class160.method1130(arg3, 256, var39, var5, arg4, arg0, class116.field1586[2], var38);
                    }
                }
            }
            class372[] var19 = class309.field4278;
            for (int var20 = 0; var20 < var19.length; var20++) {
                class372 var23 = var19[var20];
                if (var23 != null && var23.field5001 != 0 && (class186.field2697 % 20) < 10) {
                    if (var23.field5001 == 1) {
                        class393 var24 = (class393) class299.field4071.method970((byte) 89, (long) var23.field5009);
                        if (var24 != null) {
                            class61 var25 = var24.field5552;
                            int var26 = var25.field4042 / 128 - (var8 / 128);
                            int var27 = var25.field4047 / 128 - (var9 / 128);
                            class187.method1287(121, 360000L, var26, arg0, var5, arg3, var23.field5010, arg4, var27);
                        }
                    }
                    if (var23.field5001 == 2) {
                        int var28 = var23.field5005 / 128 - (var8 / 128);
                        int var29 = var23.field5003 / 128 - (var9 / 128);
                        long var30 = (long) (var23.field5012 << 7);
                        long var32 = var30 * var30;
                        class187.method1287(125, var32, var28, arg0, var5, arg3, var23.field5010, arg4, var29);
                    }
                    if (var23.field5001 == 10 && var23.field5009 >= 0 && class671.field9407.length > var23.field5009) {
                        class677 var34 = class671.field9407[var23.field5009];
                        if (var34 != null) {
                            int var35 = var34.field4042 / 128 - (var8 / 128);
                            int var36 = var34.field4047 / 128 - (var9 / 128);
                            class187.method1287(126, 360000L, var35, arg0, var5, arg3, var23.field5010, arg4, var36);
                        }
                    }
                }
            }
            if (class203.field2863 != 4) {
                if (class525.field7124 != 0) {
                    int var21 = (class525.field7124 * 4 + ((class143.field2063.method881(-120) + -1) * 2) + 2) - (var8 / 128);
                    int var22 = class289.field3961 * 4 + (-(var9 / 128) - (-(class143.field2063.method881(-122) * 2) - -2)) + 2;
                    class160.method1130(arg3, arg2 ^ 0xFFFFFE91, var22, var5, arg4, arg0, class635.field8775[class583.field8209 ? 1 : 0], var21);
                }
                if (!class143.field2063.field9697) {
                    arg1.method1170(-1, 3, arg4 + (arg0.field1104 / 2) - 1, 3, arg3 + (arg0.field1050 / 2) - 1, -28207);
                }
            }
        }
        if (arg2 != -111) {
            field3609 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class266() {
        this.field3612 = new int[0];
        this.field3606 = new int[0];
        this.field3595 = new class320(0);
        this.field3595.field376 = 1;
        this.field3602 = new class320();
        this.field3602.field376 = 1;
        this.field3596 = new class320();
        this.field3603 = new class30[] { this.field3602, this.field3596, this.field3595 };
        this.field3596.field376 = 1;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lac;)V")
    public class266(class501 arg0) {
        int var2 = arg0.method2874((byte) -75);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field3603 = new class30[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class30 var16 = class653.method3686((byte) -74, arg0);
            if (var16.method288((byte) -112) >= 0) {
                var3++;
            }
            if (var16.method289(0) >= 0) {
                var4++;
            }
            int var17 = var16.field371.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2874((byte) -75);
            }
            this.field3603[var6] = var16;
        }
        this.field3606 = new int[var3];
        int var7 = 0;
        this.field3612 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class30 var11 = this.field3603[var9];
            int var12 = var11.field371.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field371[var13] = this.field3603[var5[var9][var13]];
            }
            int var14 = var11.method288((byte) -112);
            int var15 = var11.method289(0);
            if (var14 > 0) {
                this.field3606[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3612[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field3602 = this.field3603[arg0.method2874((byte) -75)];
        this.field3596 = this.field3603[arg0.method2874((byte) -75)];
        this.field3595 = this.field3603[arg0.method2874((byte) -75)];
        Object var10 = null;
    }
}
