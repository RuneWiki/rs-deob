import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class637 extends class65 {

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "[I")
    private int[] field8944;

    @OriginalMember(owner = "client!caa", name = "o", descriptor = "[B")
    public byte[] field8945;

    @OriginalMember(owner = "client!caa", name = "p", descriptor = "[Lso;")
    public class538[] field8946;

    @OriginalMember(owner = "client!caa", name = "t", descriptor = "[B")
    public byte[] field8950;

    @OriginalMember(owner = "client!caa", name = "w", descriptor = "[S")
    public short[] field8953;

    @OriginalMember(owner = "client!caa", name = "v", descriptor = "[Luh;")
    public class413[] field8952;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "[B")
    public byte[] field8943;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public int field8941;

    @OriginalMember(owner = "client!caa", name = "x", descriptor = "Lcb;")
    public static class631 field8954 = new class631(71, -1);

    @OriginalMember(owner = "client!caa", name = "y", descriptor = "Z")
    public static boolean field8955 = false;

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "I")
    public static int field8956 = -1;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!caa", name = "q", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!caa", name = "r", descriptor = "I")
    public static int field8948;

    @OriginalMember(owner = "client!caa", name = "u", descriptor = "I")
    public static int field8951;

    @OriginalMember(owner = "client!caa", name = "s", descriptor = "Lla;")
    public static class422 field8949;

    @OriginalMember(owner = "client!caa", name = "A", descriptor = "[[Z")
    public static boolean[][] field8957;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V", line = 3)
    public final void method3604(int arg0) {
        if (arg0 != -1) {
            field8956 = -37;
        }
        field8947++;
        this.field8944 = null;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Llr;I[I[B)Z", line = 14)
    public final boolean method3605(class745 arg0, int arg1, int[] arg2, byte[] arg3) {
        field8948++;
        boolean var5 = true;
        int var6 = 0;
        class538 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field8944[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method4167((byte) 38, var9 >> 2, arg2);
                        } else {
                            var7 = arg0.method4166(var9 >> 2, arg1 ^ 0x73F9, arg2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field8946[var8] = var7;
                        this.field8944[var8] = 0;
                    }
                }
            }
        }
        if (arg1 != -29689) {
            this.method3605(null, -77, null, null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V", line = 73)
    public static final void method3606(int arg0) {
        field8951++;
        class497.field7205.method1603((byte) 119);
        class338.field4951.method1698((byte) -72);
        class174.field2980.method995(arg0 ^ 0xFFFF8FEA);
        class576.field8167.method3072(109);
        class740.field10382.method3435((byte) -37);
        class556.field7917.method748((byte) -95);
        class83.field1219.method2353(25841);
        class41.field718.method1533(false);
        class52.field836.method1718((byte) -104);
        class346.field5119.method3692(false);
        class581.field8222.method1547(-116);
        class629.field8840.method3846(-50);
        class617.field8704.method2554((byte) 34);
        class122.field1882.method3639(0);
        class382.field5728.method1996(false);
        class691.field9803.method2535((byte) -127);
        if (arg0 != -28907) {
            return;
        }
        class416.field6122.method4209((byte) -54);
        class451.field6568.method2396(90);
        class520.field7513.method1414(-1413);
        class184.field3100.method142(7358);
        class430.field6290.method3996((byte) -70);
        class395.method2456((byte) -10);
        class37.method213(-104);
        class298.method1917(-43);
        class353.method2265(0);
        class705.method3912(0);
        class453.field6589.method71((byte) 44);
        class341.field5052.method71((byte) 44);
        class65.field1041.method71((byte) 44);
        class527.field7586.method71((byte) 44);
        class464.field6775.method71((byte) 44);
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V", line = 118)
    public static void method3607(int arg0) {
        field8957 = null;
        field8954 = null;
        if (arg0 != 0) {
            method3607(-111);
        }
        field8949 = null;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V", line = 142)
    public static final void method3608(byte arg0) {
        field8942++;
        if (class74.field1107 == null) {
            return;
        }
        class74.field1107 = null;
        class598.method3436(class598.field8460, class304.field4621, (byte) -123, class265.field4129, class85.field1258);
        if (arg0 != 101) {
            method3607(-17);
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V", line = 163)
    public class637() {
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "([B)V", line = 170)
    public class637(byte[] arg0) {
        this.field8944 = new int[128];
        this.field8945 = new byte[128];
        this.field8946 = new class538[128];
        this.field8950 = new byte[128];
        this.field8953 = new short[128];
        this.field8952 = new class413[128];
        this.field8943 = new byte[128];
        class301 var2 = new class301(arg0);
        int var3;
        for (var3 = 0; var2.field4543[var2.field4534 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1984(4);
        }
        var3++;
        var2.field4534++;
        int var6 = var2.field4534;
        var2.field4534 += var3;
        int var7;
        for (var7 = 0; var2.field4543[var2.field4534 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1984(4);
        }
        var7++;
        var2.field4534++;
        int var10 = var2.field4534;
        var2.field4534 += var7;
        int var11;
        for (var11 = 0; var2.field4543[var2.field4534 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1984(4);
        }
        var11++;
        var2.field4534++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1987(-26);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class413[] var19 = new class413[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class413 var103 = var19[var20] = new class413();
            int var104 = var2.method1987(-68);
            if (var104 > 0) {
                var103.field6082 = new byte[var104 * 2];
            }
            int var105 = var2.method1987(-67);
            if (var105 > 0) {
                var103.field6081 = new byte[var105 * 2 + 2];
                var103.field6081[1] = 64;
            }
        }
        int var21 = var2.method1987(-73);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method1987(-119);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field4543[var2.field4534 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1984(4);
        }
        var2.field4534++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1987(-85);
            this.field8953[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1987(-48);
            this.field8953[var31] = (short) (this.field8953[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 < var26.length) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method1960((byte) 112);
            }
            this.field8953[var35] = (short) (this.field8953[var35] + class636.method3603(var34 - 1 << 14, 32768));
            var32--;
            this.field8944[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field8944[var39] != 0) {
                if (var37 == 0) {
                    if (var4.length <= var36) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                    var38 = var2.field4543[var6++] - 1;
                }
                var37--;
                this.field8950[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field8944[var43] != 0) {
                if (var40 == 0) {
                    if (var41 < var8.length) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                    var42 = var2.field4543[var10++] + 16 << 2;
                }
                var40--;
                this.field8943[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class413 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field8944[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length > var45) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field8952[var47] = var46;
                var44--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length <= var48) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field8944[var51] > 0) {
                    var50 = var2.method1987(-106) + 1;
                }
            }
            this.field8945[var51] = (byte) var50;
            var49--;
        }
        this.field8941 = var2.method1987(-123) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class413 var100 = var19[var52];
            if (var100.field6082 != null) {
                for (int var101 = 1; var101 < var100.field6082.length; var101 += 2) {
                    var100.field6082[var101] = var2.method1984(4);
                }
            }
            if (var100.field6081 != null) {
                for (int var102 = 3; var102 < var100.field6081.length - 2; var102 += 2) {
                    var100.field6081[var102] = var2.method1984(4);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1984(4);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1984(4);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class413 var97 = var19[var55];
            if (var97.field6081 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field6081.length; var99 += 2) {
                    var98 = var2.method1987(-112) + var98 + 1;
                    var97.field6081[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class413 var94 = var19[var56];
            if (var94.field6082 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field6082.length; var96 += 2) {
                    var95 = var2.method1987(-76) + var95 + 1;
                    var94.field6082[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1987(-111);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method1987(-123) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field8945[var61] = (byte) (this.field8945[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class540.method3164(-126, var67, var65 - var59);
                    var67 += var66 - var60;
                    this.field8945[var68] = (byte) (this.field8945[var68] * var69 + 32 >> 6);
                }
                var62 += 2;
                var59 = var65;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field8945[var63] = (byte) (this.field8945[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method1987(-15);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method1987(-50) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field8943[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field8943[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class540.method3164(-115, var81, var79 - var72);
                    int var84 = (this.field8943[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field8943[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field8943[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field8943[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field6085 = var2.method1987(-99);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class413 var93 = var19[var87];
            if (var93.field6082 != null) {
                var93.field6086 = var2.method1987(-44);
            }
            if (var93.field6081 != null) {
                var93.field6080 = var2.method1987(-21);
            }
            if (var93.field6085 > 0) {
                var93.field6084 = var2.method1987(-58);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field6090 = var2.method1987(-115);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class413 var92 = var19[var89];
            if (var92.field6090 > 0) {
                var92.field6083 = var2.method1987(-93);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class413 var91 = var19[var90];
            if (var91.field6083 > 0) {
                var91.field6089 = var2.method1987(-107);
            }
        }
    }
}
