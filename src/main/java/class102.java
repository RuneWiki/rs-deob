import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class102 extends class179 {

    @OriginalMember(owner = "client!af", name = "G", descriptor = "[I")
    private int[] field1583;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "[I")
    private int[] field1569;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "Lba;")
    private class270 field1587;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "Lba;")
    private class270 field1576;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "Lba;")
    private class270 field1581;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "[Lba;")
    private class270[] field1586;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field1572 = 2;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "S")
    public static short field1585 = 1;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "Ldp;")
    public static class174 field1582;

    // $FF: synthetic field
    @OriginalMember(owner = "client!af", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field1592;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "[Z")
    public static boolean[] field1590;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1573++;
        if (arg2 >= -5) {
            field1579 = 72;
        }
        class425.method2665(arg6, 0, arg5, arg7, arg3, 4227, arg1, arg4, arg0);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lcj;IZIDIZLdp;)[I")
    public final int[] method838(class181 arg0, int arg1, boolean arg2, int arg3, double arg4, int arg5, boolean arg6, class174 arg7) {
        class443.field6441 = arg7;
        field1589++;
        class285.field4272 = arg0;
        for (int var10 = 0; var10 < this.field1586.length; var10++) {
            this.field1586[var10].method219(arg3, arg1, 0);
        }
        class281.method1992((byte) 67, arg4);
        if (arg5 != -7983) {
            return null;
        }
        class106.method941(arg1, arg5 ^ 0xFFFFE0DD, arg3);
        int[] var11 = new int[arg1 * arg3];
        byte var12;
        int var13;
        int var14;
        if (arg2) {
            var12 = -1;
            var13 = -1;
            var14 = arg3 - 1;
        } else {
            var13 = arg3;
            var12 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1576.field4055) {
                int[] var18 = this.field1576.method81((byte) 45, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1576.method123(true, var16);
                var19 = var22[0];
                var21 = var22[1];
                var20 = var22[2];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
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
                int var27 = class257.field3725[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class257.field3725[var25];
                int var29 = class257.field3725[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg6) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1586.length; var17++) {
            this.field1586[var17].method122((byte) -26);
        }
        return var11;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    public static final void method839(int arg0, int arg1) {
        field1580++;
        class137.field2190.method104(arg0, (byte) -34);
        if (arg1 != 1) {
            method847(31);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)I")
    public static final int method840(int arg0, int arg1) {
        field1570++;
        if (arg1 != 6590) {
            field1579 = 104;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lcj;Ldp;I)Z")
    public final boolean method841(class181 arg0, class174 arg1, int arg2) {
        field1578++;
        if (class389.field5578 > 0) {
            for (int var4 = 0; var4 < this.field1583.length; var4++) {
                if (!arg1.method1358(class389.field5578, -113, this.field1583[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1583.length; var5++) {
                if (!arg1.method1348(255, this.field1583[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1569.length; var6++) {
            if (!arg0.method1415((byte) 118, this.field1569[var6])) {
                return false;
            }
        }
        if (arg2 != -706298236) {
            method837(70, 90, -23, -94, -54, 79, 111, -84);
        }
        return true;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)Laj;")
    public static final class71 method842(int arg0) {
        field1575++;
        if (arg0 > -11) {
            field1590 = null;
        }
        try {
            return new class165();
        } catch (Throwable var2) {
            try {
                return (class71) Class.forName("hd").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class57();
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)I")
    public static final int method843(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return -22;
        }
        field1577++;
        if (arg2 <= arg0) {
            return arg0 > arg1 ? arg1 : arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILcj;ILdp;DZB)[I")
    public final int[] method844(int arg0, class181 arg1, int arg2, class174 arg3, double arg4, boolean arg5, byte arg6) {
        int var9 = -119 % ((arg6 + 32) / 50);
        class443.field6441 = arg3;
        class285.field4272 = arg1;
        field1591++;
        for (int var10 = 0; var10 < this.field1586.length; var10++) {
            this.field1586[var10].method219(arg2, arg0, 0);
        }
        class281.method1992((byte) 112, arg4);
        class106.method941(arg0, 22, arg2);
        int[] var11 = new int[arg2 * 4 * arg0];
        int var12 = 0;
        for (int var13 = 0; var13 < arg0; var13++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field1576.field4055) {
                int[] var19 = this.field1576.method81((byte) 28, var13);
                var16 = var19;
                var18 = var19;
                var17 = var19;
            } else {
                int[][] var15 = this.field1576.method123(true, var13);
                var16 = var15[0];
                var17 = var15[2];
                var18 = var15[1];
            }
            int[] var20;
            if (this.field1581.field4055) {
                var20 = this.field1581.method81((byte) 93, var13);
            } else {
                var20 = this.field1581.method123(true, var13)[0];
            }
            if (arg5) {
                var12 = var13;
            }
            for (int var21 = arg2 - 1; var21 >= 0; var21--) {
                int var22 = var16[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var18[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var17[var21] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class257.field3725[var22];
                int var26 = class257.field3725[var23];
                int var27 = class257.field3725[var24];
                int var28;
                if (var25 == 0 && var26 == 0 && var27 == 0) {
                    var28 = 0;
                } else {
                    var28 = var20[var21] >> 4;
                    if (var28 > 255) {
                        var28 = 255;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                }
                var11[var12++] = (var25 << 16) + ((var28 << 24) - (-(var26 << 8) - var27));
                if (arg5) {
                    var12 += arg2 - 1;
                }
            }
        }
        for (int var14 = 0; var14 < this.field1586.length; var14++) {
            this.field1586[var14].method122((byte) -26);
        }
        return var11;
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
    public static final void method845(int arg0) {
        field1584++;
        int var1 = -43 % ((arg0 - 75) / 39);
        for (int var2 = -1; var2 < class21.field317; var2++) {
            int var3;
            if (var2 == -1) {
                var3 = 2047;
            } else {
                var3 = class75.field1290[var2];
            }
            class127 var4 = class367.field5225[var3];
            if (var4 != null) {
                class254.method1836(var4.method1070((byte) -50), var4, (byte) 66);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
    public static final void method846(int arg0) {
        if (arg0 != -1) {
            field1572 = -113;
        }
        while (true) {
            class8 var1;
            class390 var3;
            do {
                do {
                    var1 = (class8) class132.field2135.method150(arg0 + 1);
                    if (var1 == null) {
                        field1571++;
                        return;
                    }
                } while (class443.field6447 == null);
                if (var1.field116 < 0) {
                    int var2 = -var1.field116 - 1;
                    if (class379.field5381 == var2) {
                        var3 = class86.field1394;
                    } else {
                        var3 = class367.field5225[var2];
                    }
                } else {
                    int var4 = var1.field116 - 1;
                    var3 = class447.field6512[var4];
                }
            } while (var3 == null);
            class45 var5 = class451.method2812(122, var1.field112);
            int var6;
            int var7;
            if (var1.field106 == 1 || var1.field106 == 3) {
                var6 = var5.field724;
                var7 = var5.field717;
            } else {
                var6 = var5.field717;
                var7 = var5.field724;
            }
            int var8 = (var6 >> 1) + var1.field107;
            int var9 = (var6 + 1 >> 1) + var1.field107;
            int var10 = (var7 >> 1) + var1.field101;
            int var11 = (var7 + 1 >> 1) + var1.field101;
            class126 var12 = class50.field816[var3.field6509];
            int var13 = var12.method794(var8, var10) - (-var12.method794(var9, var10) + (-var12.method794(var8, var11) - var12.method794(var9, var11))) >> 2;
            class395 var14 = null;
            int var15 = class9.field121[var1.field111];
            if (var15 == 0) {
                var14 = (class395) class219.method1656(var3.field6509, var1.field107, var1.field101);
            } else if (var15 == 1) {
                var14 = (class395) class336.method2189(var3.field6509, var1.field107, var1.field101);
            } else if (var15 == 2) {
                var14 = (class395) class371.method2358(var3.field6509, var1.field107, var1.field101, field1592 == null ? (field1592 = method850("sc")) : field1592);
            } else if (var15 == 3) {
                var14 = (class395) class37.method311(var3.field6509, var1.field107, var1.field101);
            }
            if (var14 != null) {
                class164.method1273(0, -1, 256, var1.field101, var1.field104, var1.field102 + 1, var15, var1.field107, var3.field6509, 0);
                var3.field5710 = var1.field107 * 128 + var6 * 64;
                var3.field5697 = var13;
                var3.field5702 = var14;
                var3.field5709 = class267.field4002 + var1.field104;
                var3.field5707 = class267.field4002 + var1.field102;
                var3.field5708 = var1.field101 * 128 + var7 * 64;
                int var16 = var1.field100;
                int var17 = var1.field113;
                int var18 = var1.field109;
                if (var16 > var17) {
                    int var19 = var16;
                    var16 = var17;
                    var17 = var19;
                }
                int var20 = var1.field114;
                if (var18 > var20) {
                    int var21 = var18;
                    var18 = var20;
                    var20 = var21;
                }
                var3.field5700 = var1.field107 + var17;
                var3.field5706 = var1.field107 + var16;
                var3.field5692 = var1.field101 + var20;
                var3.field5705 = var1.field101 + var18;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class102() {
        this.field1583 = new int[0];
        this.field1569 = new int[0];
        this.field1587 = new class392(0);
        this.field1587.field4059 = 1;
        this.field1576 = new class392();
        this.field1576.field4059 = 1;
        this.field1581 = new class392();
        this.field1581.field4059 = 1;
        this.field1586 = new class270[] { this.field1576, this.field1581, this.field1587 };
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lec;)V")
    public class102(class37 arg0) {
        int var2 = arg0.method271((byte) 115);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field1586 = new class270[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class270 var16 = class91.method772(arg0, (byte) 62);
            if (var16.method128(115) >= 0) {
                var3++;
            }
            if (var16.method220((byte) 73) >= 0) {
                var4++;
            }
            int var17 = var16.field4063.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method271((byte) 111);
            }
            this.field1586[var6] = var16;
        }
        this.field1583 = new int[var3];
        int var7 = 0;
        this.field1569 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class270 var11 = this.field1586[var9];
            int var12 = var11.field4063.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4063[var13] = this.field1586[var5[var9][var13]];
            }
            int var14 = var11.method128(-9);
            int var15 = var11.method220((byte) 73);
            if (var14 > 0) {
                this.field1583[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1569[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1576 = this.field1586[arg0.method271((byte) 106)];
        this.field1581 = this.field1586[arg0.method271((byte) 107)];
        Object var10 = null;
        this.field1587 = this.field1586[arg0.method271((byte) 116)];
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
    public static void method847(int arg0) {
        field1582 = null;
        field1590 = null;
        if (arg0 > -5) {
            method840(89, 34);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lcj;IZLdp;BI)[F")
    public final float[] method848(class181 arg0, int arg1, boolean arg2, class174 arg3, byte arg4, int arg5) {
        field1574++;
        class443.field6441 = arg3;
        class285.field4272 = arg0;
        for (int var7 = 0; var7 < this.field1586.length; var7++) {
            this.field1586[var7].method219(arg1, arg5, 0);
        }
        class106.method941(arg5, 74, arg1);
        float[] var8 = new float[arg1 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1576.field4055) {
                int[] var12 = this.field1576.method81((byte) 121, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field1576.method123(true, var10);
                var14 = var16[1];
                var13 = var16[0];
                var15 = var16[2];
            }
            int[] var17;
            if (this.field1581.field4055) {
                var17 = this.field1581.method81((byte) 39, var10);
            } else {
                var17 = this.field1581.method123(true, var10)[0];
            }
            if (arg2) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field1587.field4055) {
                var18 = this.field1587.method81((byte) 65, var10);
            } else {
                var18 = this.field1587.method123(true, var10)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg2) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field1586.length; var11++) {
            this.field1586[var11].method122((byte) -26);
        }
        if (arg4 <= 113) {
            this.method841((class181) null, (class174) null, -37);
        }
        return var8;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)Lmb;")
    public static final class258 method849(byte arg0, int arg1, int arg2) {
        field1588++;
        class258 var3 = class342.method2207(arg1, (byte) 14);
        if (arg0 != -105) {
            return null;
        } else if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3869 == null || arg2 >= var3.field3869.length) {
            return null;
        } else {
            return var3.field3869[arg2];
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method850(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
