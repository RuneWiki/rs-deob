import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class112 extends class42 {

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "Lni;")
    private class369 field1664;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "Lbt;")
    private class33 field1667;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "Lgu;")
    private class417 field1662;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    private int field1670;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "[[F")
    private float[][] field1665;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "[[F")
    private float[][] field1661;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "[[F")
    private float[][] field1656;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Lwn;")
    private class519 field1645;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "Low;")
    private class235 field1668;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "Lhl;")
    private class375 field1646;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "Lvn;")
    private class209 field1672;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "Lus;")
    private class1 field1669;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "Ljd;")
    private class157 field1648;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "Ljd;")
    private class157 field1671;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "[I")
    public static int[] field1650 = new int[4];

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field1659 = 0;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field1663 = 0;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field1651 = -1;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "Lqv;")
    public static class316 field1660 = new class316(64, -1);

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "Lbd;")
    public static class44 field1675 = new class44("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(SZ)V")
    private final void method793(short arg0, boolean arg1) {
        if (this.field1667.field713) {
            this.field1645.method3016(arg0, -34);
        } else {
            this.field1645.method3062(arg0, (byte) -53);
        }
        field1657++;
        this.field1652++;
        if (arg1) {
            this.method795(115, -48, 15, -125, null);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILtf;B)V")
    public static final void method794(int arg0, int arg1, class198 arg2, byte arg3) {
        if (arg2.field2914 == 0) {
            arg2.field2957 = arg2.field3022;
        } else if (arg2.field2914 == 1) {
            arg2.field2957 = (arg1 - arg2.field2988) / 2 + arg2.field3022;
        } else if (arg2.field2914 == 2) {
            arg2.field2957 = arg1 - arg2.field2988 - arg2.field3022;
        } else if (arg2.field2914 == 3) {
            arg2.field2957 = arg2.field3022 * arg1 >> 14;
        } else if (arg2.field2914 == 4) {
            arg2.field2957 = (arg1 - arg2.field2988) / 2 + (arg2.field3022 * arg1 >> 14);
        } else {
            arg2.field2957 = arg1 - arg2.field2988 - (arg2.field3022 * arg1 >> 14);
        }
        int var4 = -76 % ((72 - arg3) / 42);
        field1673++;
        if (arg2.field2912 == 0) {
            arg2.field2924 = arg2.field3036;
        } else if (arg2.field2912 == 1) {
            arg2.field2924 = (arg0 - arg2.field3008) / 2 + arg2.field3036;
        } else if (arg2.field2912 == 2) {
            arg2.field2924 = arg0 - (arg2.field3036 + arg2.field3008);
        } else if (arg2.field2912 == 3) {
            arg2.field2924 = arg2.field3036 * arg0 >> 14;
        } else if (arg2.field2912 == 4) {
            arg2.field2924 = (arg2.field3036 * arg0 >> 14) + (arg0 - arg2.field3008) / 2;
        } else {
            arg2.field2924 = arg0 - arg2.field3008 - (arg2.field3036 * arg0 >> 14);
        }
        if (!class65.field1107 || client.method1395(arg2).field4366 == 0 && arg2.field2941 != 0) {
            return;
        }
        if (arg2.field2957 < 0) {
            arg2.field2957 = 0;
        } else if (arg1 < (arg2.field2988 + arg2.field2957)) {
            arg2.field2957 = arg1 - arg2.field2988;
        }
        if (arg2.field2924 < 0) {
            arg2.field2924 = 0;
        } else if ((arg2.field2924 + arg2.field3008) > arg0) {
            arg2.field2924 = arg0 - arg2.field3008;
            return;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII[[Z)V")
    public final void method795(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field1666++;
        if (this.field1672 == null || arg2 != 0 || this.field1670 > (arg1 + arg3) || this.field1653 < arg1 - arg3 || this.field1674 > (arg0 + arg3) || arg0 - arg3 > this.field1658) {
            return;
        }
        for (int var6 = this.field1674; var6 <= this.field1658; var6++) {
            for (int var7 = this.field1670; var7 <= this.field1653; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg0;
                if (-arg3 < var8 && var8 < arg3 && -arg3 < var9 && arg3 > var9 && arg4[arg3 + var8][arg3 + var9]) {
                    this.field1667.method356((int) (this.field1664.method2258((byte) 21) * 255.0F) << 24, 255);
                    this.field1667.method319(this.field1671, null, null, 22146, this.field1648);
                    this.field1667.method266(4, (byte) -118, 0, this.field1652, this.field1672);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method796(int arg0) {
        field1660 = null;
        if (arg0 <= -63) {
            field1675 = null;
            field1650 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIII)V")
    private final void method797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1655++;
        long var8 = -1L;
        int var10 = (arg2 << this.field1662.field345) + arg1;
        int var11 = arg3 + (arg5 << this.field1662.field345);
        int var12 = this.field1662.method143(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class42 var13 = this.field1646.method2284(true, var8);
            if (var13 != null) {
                this.method793(((class545) var13).field7989, false);
                return;
            }
        }
        short var14 = (short) (this.field1647++);
        if (var8 != -1L) {
            this.field1646.method2292(var8, new class545(var14), (byte) -128);
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg3 == 0) {
            var15 = this.field1665[arg0][arg6];
            var16 = this.field1661[arg0][arg6];
            var17 = this.field1656[arg0][arg6];
        } else if (this.field1662.field346 == arg1 && arg3 == 0) {
            var16 = this.field1661[arg0 + 1][arg6];
            var15 = this.field1665[arg0 + 1][arg6];
            var17 = this.field1656[arg0 + 1][arg6];
        } else if (this.field1662.field346 == arg1 && this.field1662.field346 == arg3) {
            var15 = this.field1665[arg0 + 1][arg6 + 1];
            var16 = this.field1661[arg0 + 1][arg6 + 1];
            var17 = this.field1656[arg0 + 1][arg6 + 1];
        } else if (arg1 == 0 && this.field1662.field346 == arg3) {
            var17 = this.field1656[arg0][arg6 + 1];
            var16 = this.field1661[arg0][arg6 + 1];
            var15 = this.field1665[arg0][arg6 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field1662.field346;
            float var19 = (float) arg3 / (float) this.field1662.field346;
            float var20 = this.field1656[arg0][arg6];
            float var21 = this.field1665[arg0][arg6];
            float var22 = this.field1661[arg0][arg6];
            float var23 = this.field1656[arg0 + 1][arg6];
            float var24 = this.field1665[arg0 + 1][arg6];
            float var25 = (this.field1665[arg0 + 1][arg6 + 1] - var24) * var18 + var24;
            float var26 = (this.field1661[arg0][arg6 + 1] - var22) * var18 + var22;
            float var27 = (this.field1656[arg0 + 1][arg6 + 1] - var23) * var18 + var23;
            float var28 = (this.field1665[arg0][arg6 + 1] - var21) * var18 + var21;
            float var29 = (this.field1656[arg0][arg6 + 1] - var20) * var18 + var20;
            float var30 = this.field1661[arg0 + 1][arg6];
            float var31 = (this.field1661[arg0 + 1][arg6 + 1] - var30) * var18 + var30;
            var17 = (var27 - var29) * var19 + var29;
            var15 = (var25 - var28) * var19 + var28;
            var16 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field1664.method2264((byte) -84) - var10);
        float var33 = (float) (this.field1664.method2262(6) - var12);
        float var34 = (float) (this.field1664.method2261((byte) 96) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field1664.method2260(true);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var39 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        if (arg4 != -19824) {
            method794(27, -31, null, (byte) 109);
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1664.method2259(127);
        int var45 = (int) ((float) ((var44 & 0xFFD499) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF48) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field1667.field713) {
            this.field1668.method1558((byte) 117, (float) var10);
            this.field1668.method1558((byte) 117, (float) var12);
            this.field1668.method1558((byte) 117, (float) var11);
        } else {
            this.field1668.method1559(-106, (float) var10);
            this.field1668.method1559(-128, (float) var12);
            this.field1668.method1559(-126, (float) var11);
        }
        this.field1668.method3048(-2034159384, var45);
        this.field1668.method3048(-2034159384, var46);
        this.field1668.method3048(-2034159384, var47);
        this.field1668.method3048(-2034159384, 255);
        this.method793(var14, false);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)I")
    public static final int method798(byte arg0, int arg1) {
        field1644++;
        int var2 = -74 % ((37 - arg0) / 54);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
    public static final int method799(String arg0, String arg1, int arg2, int arg3) {
        field1649++;
        int var4 = arg0.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || var5 > (var7 - var9)) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if (var7 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class86.method638(87, var22);
            var9 = class86.method638(66, var24);
            char var26 = class80.method611(arg2, (byte) 121, var22);
            char var27 = class80.method611(arg2, (byte) 121, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class426.method2527(true, arg2, var28) - class426.method2527(true, arg2, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class426.method2527(true, arg2, var20) - class426.method2527(true, arg2, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        } else if (arg3 > -65) {
            return -80;
        } else {
            for (int var13 = 0; var13 < var10; var13++) {
                char var14 = arg0.charAt(var13);
                char var15 = arg1.charAt(var13);
                if (var14 != var15) {
                    return class426.method2527(true, arg2, var14) - class426.method2527(true, arg2, var15);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lbt;Lgu;Lni;[I)V")
    public class112(class33 arg0, class417 arg1, class369 arg2, int[] arg3) {
        this.field1664 = arg2;
        this.field1667 = arg0;
        this.field1662 = arg1;
        int var5 = this.field1664.method2260(true) - (arg1.field346 >> 1);
        this.field1670 = this.field1664.method2264((byte) -85) - var5 >> arg1.field345;
        this.field1653 = var5 + this.field1664.method2264((byte) -76) >> arg1.field345;
        this.field1674 = this.field1664.method2261((byte) 96) - var5 >> arg1.field345;
        this.field1658 = var5 + this.field1664.method2261((byte) 96) >> arg1.field345;
        int var6 = this.field1653 - (this.field1670 - 1);
        int var7 = this.field1658 + 1 - this.field1674;
        this.field1665 = new float[var6 + 1][var7 + 1];
        this.field1661 = new float[var6 + 1][var7 + 1];
        this.field1656 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = var8 + this.field1674;
            if (var24 > 0 && var24 < this.field1662.field350 - 1) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field1670 + var25;
                    if (var26 > 0 && var26 < this.field1662.field347 - 1) {
                        int var27 = arg1.method156(var26 + 1, var24) - arg1.method156(var26 - 1, var24);
                        int var28 = arg1.method156(var26, var24 + 1) - arg1.method156(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + var28 * var28 + 65536)));
                        this.field1656[var25][var8] = (float) var27 * var29;
                        this.field1665[var25][var8] = var29 * -256.0F;
                        this.field1661[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field1674; var11 <= this.field1658; var11++) {
            if (var11 >= 0 && var11 < arg1.field350) {
                for (int var21 = this.field1670; var21 <= this.field1653; var21++) {
                    if (var21 >= 0 && arg1.field347 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field5898[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field1653 - this.field1670;
            }
        }
        if (var9 > 0) {
            this.field1645 = new class519(var9 * 2);
            this.field1668 = new class235(var9 * 16);
            this.field1646 = new class375(class487.method2869(1366891568, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field1674; var14 <= this.field1658; var14++) {
                if (var14 >= 0 && var14 < arg1.field350) {
                    int var15 = 0;
                    for (int var16 = this.field1670; var16 <= this.field1653; var16++) {
                        if (var16 >= 0 && arg1.field347 > var16) {
                            int var17 = arg3[var12];
                            int[] var18 = arg1.field5898[var16][var14];
                            int[] var19 = arg1.field5900[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method797(var15, var18[var20], var16, var19[var20], -19824, var14, var13);
                                    }
                                } else if (var17 == 3) {
                                    this.method797(var15, 0, var16, 0, -19824, var14, var13);
                                    this.method797(var15, arg1.field346, var16, 0, -19824, var14, var13);
                                    this.method797(var15, 0, var16, arg1.field346, -19824, var14, var13);
                                } else if (var17 == 2) {
                                    this.method797(var15, arg1.field346, var16, 0, -19824, var14, var13);
                                    this.method797(var15, arg1.field346, var16, arg1.field346, -19824, var14, var13);
                                    this.method797(var15, 0, var16, 0, -19824, var14, var13);
                                } else if (var17 == 5) {
                                    this.method797(var15, arg1.field346, var16, arg1.field346, -19824, var14, var13);
                                    this.method797(var15, 0, var16, arg1.field346, -19824, var14, var13);
                                    this.method797(var15, arg1.field346, var16, 0, -19824, var14, var13);
                                } else if (var17 == 4) {
                                    this.method797(var15, 0, var16, arg1.field346, -19824, var14, var13);
                                    this.method797(var15, 0, var16, 0, -19824, var14, var13);
                                    this.method797(var15, arg1.field346, var16, arg1.field346, -19824, var14, var13);
                                }
                            }
                        }
                        var12++;
                        var15++;
                    }
                } else {
                    var12 += this.field1653 - this.field1670;
                }
                var13++;
            }
            this.field1672 = this.field1667.method271(false, false, this.field1645.field7545, 5123, this.field1645.field7558);
            this.field1669 = this.field1667.method193(267135248, false, 16, this.field1668.field7558, this.field1668.field7545);
            this.field1648 = new class157(this.field1669, 5126, 3, 0);
            this.field1671 = new class157(this.field1669, 5121, 4, 12);
        } else {
            this.field1669 = null;
            this.field1648 = null;
            this.field1671 = null;
            this.field1672 = null;
        }
        this.field1668 = null;
        this.field1645 = null;
        this.field1646 = null;
        this.field1656 = this.field1665 = this.field1661 = null;
    }

    static {
        new class44(null, "geschickt werden.", null, null);
    }
}
