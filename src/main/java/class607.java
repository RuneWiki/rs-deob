import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class607 extends class177 {

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Z")
    public boolean field8825 = false;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    private int field8824 = 0;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "Lvj;")
    public class410 field8836 = new class410();

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Lvj;")
    private class410 field8842 = new class410();

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "Z")
    private boolean field8847 = false;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "J")
    private long field8834;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Ltk;")
    public class317 field8831;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Lgp;")
    public class45 field8828;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Lwf;")
    public class121 field8827;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "Lsk;")
    public class578 field8839;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "Lqfa;")
    public static class85 field8835 = new class85(17, 28);

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "Lqfa;")
    public static class85 field8841 = new class85(108, 6);

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public int field8829;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    private int field8844;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    private int field8845;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    private int field8846;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    private int field8848;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    private int field8849;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    private int field8850;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    private int field8851;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "Lf;")
    public static class702 field8840;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "[I")
    public static int[] field8843;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public final void method3492(byte arg0) {
        this.field8836.field5940 = this.field8831.field4664;
        this.field8836.field5935 = this.field8831.field4666;
        this.field8836.field5937 = this.field8831.field4679;
        this.field8836.field5932 = this.field8831.field4680;
        this.field8836.field5936 = this.field8831.field4670;
        field8830++;
        this.field8836.field5930 = this.field8831.field4682;
        this.field8836.field5944 = this.field8831.field4660;
        int var2 = -115 / ((arg0 - 19) / 50);
        this.field8836.field5942 = this.field8831.field4676;
        this.field8836.field5939 = this.field8831.field4673;
        if (this.field8836.field5939 == this.field8836.field5937 && this.field8836.field5944 == this.field8836.field5939 && this.field8836.field5936 == this.field8836.field5935 && this.field8836.field5935 == this.field8836.field5932 && this.field8836.field5940 == this.field8836.field5930 && this.field8836.field5942 == this.field8836.field5930) {
            this.field8847 = true;
        } else if (this.field8847) {
            this.field8842.field5930 = this.field8836.field5930;
            this.field8842.field5942 = this.field8836.field5942;
            this.field8842.field5940 = this.field8836.field5940;
            this.field8842.field5935 = this.field8836.field5935;
            this.field8842.field5939 = this.field8836.field5939;
            this.field8842.field5932 = this.field8836.field5932;
            this.field8847 = false;
            this.field8842.field5944 = this.field8836.field5944;
            this.field8842.field5937 = this.field8836.field5937;
            this.field8842.field5936 = this.field8836.field5936;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
    public static void method3493(byte arg0) {
        field8841 = null;
        field8835 = null;
        field8843 = null;
        int var1 = 102 % ((39 - arg0) / 53);
        field8840 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public static final void method3494(boolean arg0) {
        field8826++;
        if (class492.field7038 != null) {
            return;
        }
        class492.field7038 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0) {
            return;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3B9) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class492.field7038[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lr;BJ)V")
    public final void method3495(class167 arg0, byte arg1, long arg2) {
        field8837++;
        for (class668 var5 = (class668) this.field8839.method3317(-121); var5 != null; var5 = (class668) this.field8839.method3321(-121)) {
            var5.method3778(arg0, arg2);
        }
        int var6 = 61 % ((-arg1 - 26) / 56);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZJILr;I)V")
    public final void method3496(boolean arg0, long arg1, int arg2, class167 arg3, int arg4) {
        if (this.field8825) {
            arg0 = false;
        } else if (class696.field9800 < this.field8827.field2146) {
            arg0 = false;
        } else if (class337.field5039 > class95.field1705[class696.field9800]) {
            arg0 = false;
        } else if (this.field8847) {
            arg0 = false;
        } else if (this.field8827.field2215 != -1) {
            int var7 = (int) (arg1 - this.field8834);
            if (this.field8827.field2166 || var7 <= this.field8827.field2215) {
                var7 %= this.field8827.field2215;
            } else {
                arg0 = false;
            }
            if (!this.field8827.field2147 && var7 < this.field8827.field2156) {
                arg0 = false;
            }
            if (this.field8827.field2147 && this.field8827.field2156 <= var7) {
                arg0 = false;
            }
        }
        field8833++;
        if (arg0) {
            class311.field4628++;
            int var8 = (this.field8836.field5944 + this.field8836.field5939 + this.field8836.field5937) / 3;
            int var9 = (this.field8836.field5936 + this.field8836.field5935 + this.field8836.field5932) / 3;
            int var10 = (this.field8836.field5940 + this.field8836.field5930 + this.field8836.field5942) / 3;
            if (this.field8836.field5943 != var8 || this.field8836.field5933 != var9 || this.field8836.field5934 != var10) {
                this.field8836.field5943 = var8;
                this.field8836.field5933 = var9;
                this.field8836.field5934 = var10;
                int var11 = this.field8836.field5939 - this.field8836.field5937;
                int var12 = this.field8836.field5935 - this.field8836.field5936;
                int var13 = this.field8836.field5930 - this.field8836.field5940;
                int var14 = this.field8836.field5944 - this.field8836.field5937;
                int var15 = this.field8836.field5932 - this.field8836.field5936;
                int var16 = this.field8836.field5942 - this.field8836.field5940;
                this.field8845 = var11 * var15 - (var12 * var14);
                this.field8844 = var13 * var14 - (var11 * var16);
                this.field8849 = var12 * var16 - var13 * var15;
                while (true) {
                    if (this.field8849 <= 32767 && this.field8844 <= 32767 && this.field8845 <= 32767 && this.field8849 >= -32767 && this.field8844 >= -32767 && this.field8845 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field8849 * this.field8849 + this.field8845 * this.field8845 + (this.field8844 * this.field8844)));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field8844 = this.field8844 * 32767 / var17;
                        this.field8845 = this.field8845 * 32767 / var17;
                        this.field8849 = this.field8849 * 32767 / var17;
                        if (this.field8827.field2155 > 0 || this.field8827.field2141 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field8845, (double) this.field8849) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field8844, Math.sqrt((double) (this.field8849 * this.field8849 + this.field8845 * this.field8845))) * 2607.5945876176133D);
                            this.field8851 = this.field8827.field2155 - this.field8827.field2173;
                            this.field8846 = var18 + this.field8827.field2173 - (this.field8851 >> 1);
                            this.field8850 = this.field8827.field2141 - this.field8827.field2160;
                            this.field8848 = this.field8827.field2160 + var19 - (this.field8850 >> 1);
                        }
                        break;
                    }
                    this.field8849 >>= 0x1;
                    this.field8845 >>= 0x1;
                    this.field8844 >>= 0x1;
                }
            }
            this.field8824 += (int) (((double) (this.field8827.field2181 - this.field8827.field2193) * Math.random() + (double) this.field8827.field2193) * (double) arg2);
            if (this.field8824 > 63) {
                int var20 = this.field8824 >> 6;
                this.field8824 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field8827.field2155 <= 0 && this.field8827.field2141 <= 0) {
                        var22 = this.field8845;
                        var23 = this.field8844;
                        var24 = this.field8849;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field8851) + this.field8846;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class509.field7210[var26];
                        int var28 = class509.field7220[var26];
                        int var29 = (int) (Math.random() * (double) this.field8850) + this.field8848;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class509.field7210[var30];
                        int var32 = class509.field7220[var30];
                        byte var33 = 13;
                        var23 = (var32 << 1) * -1;
                        var24 = var28 * var31 >> var33;
                        var22 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field8836.field5944 * var36 + (float) this.field8836.field5939 * var35 + (float) this.field8836.field5937 * var34);
                    int var38 = (int) ((float) this.field8836.field5932 * var36 + (float) this.field8836.field5936 * var34 + (float) this.field8836.field5935 * var35);
                    int var39 = (int) ((float) this.field8836.field5942 * var36 + (float) this.field8836.field5940 * var34 + (float) this.field8836.field5930 * var35);
                    int var40 = (int) ((float) this.field8842.field5944 * var36 + (float) this.field8842.field5939 * var35 + (float) this.field8842.field5937 * var34);
                    int var41 = (int) ((float) this.field8842.field5932 * var36 + (float) this.field8842.field5936 * var34 + (float) this.field8842.field5935 * var35);
                    int var42 = (int) ((float) this.field8842.field5942 * var36 + (float) this.field8842.field5940 * var34 + (float) this.field8842.field5930 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                    int var49 = (int) (Math.random() * (double) (this.field8827.field2145 - this.field8827.field2194)) + this.field8827.field2194;
                    int var50 = this.field8827.field2144 + ((int) ((double) (this.field8827.field2171 - this.field8827.field2144) * Math.random()));
                    int var51 = this.field8827.field2209 + ((int) (Math.random() * (double) (this.field8827.field2178 - this.field8827.field2209)));
                    int var54;
                    if (this.field8827.field2163) {
                        double var52 = Math.random();
                        var54 = (int) ((double) this.field8827.field2189 * var52 + (double) this.field8827.field2165) << 16 | (int) ((double) this.field8827.field2187 * var52 + (double) this.field8827.field2177) << 8 | (int) ((double) this.field8827.field2159 * var52 + (double) this.field8827.field2195) | (int) ((double) this.field8827.field2175 * Math.random() + (double) this.field8827.field2218) << 24;
                    } else {
                        var54 = (int) ((double) this.field8827.field2218 + (double) this.field8827.field2175 * Math.random()) << 24 | (int) (Math.random() * (double) this.field8827.field2189 + (double) this.field8827.field2165) << 16 | (int) ((double) this.field8827.field2187 * Math.random() + (double) this.field8827.field2177) << 8 | (int) (Math.random() * (double) this.field8827.field2159 + (double) this.field8827.field2195);
                    }
                    int var55 = this.field8827.field2154;
                    if (!arg3.method25() && !this.field8827.field2180) {
                        var55 = -1;
                    }
                    if (class365.field5419 == class185.field2984) {
                        new class668(this, var46, var47, var48, var24, var23, var22, var49, var50, var54, var51, var55, this.field8827.field2188, this.field8827.field2153);
                    } else {
                        class668 var56 = class569.field8293[class365.field5419];
                        class365.field5419 = class365.field5419 + 1 & 0x3FF;
                        var56.method3775(this, var46, var47, var48, var24, var23, var22, var49, var50, var54, var51, var55, this.field8827.field2188, this.field8827.field2153);
                    }
                }
            }
        }
        if (!this.field8836.method2503(2, this.field8842)) {
            class410 var58 = this.field8842;
            this.field8842 = this.field8836;
            this.field8836 = var58;
            this.field8836.field5939 = this.field8831.field4673;
            this.field8836.field5944 = this.field8831.field4660;
            this.field8836.field5932 = this.field8831.field4680;
            this.field8836.field5940 = this.field8831.field4664;
            this.field8836.field5942 = this.field8831.field4676;
            this.field8836.field5936 = this.field8831.field4670;
            this.field8836.field5935 = this.field8831.field4666;
            this.field8836.field5930 = this.field8831.field4682;
            this.field8836.field5937 = this.field8831.field4679;
        }
        this.field8829 = 0;
        for (class668 var59 = (class668) this.field8839.method3317(-121); var59 != null; var59 = (class668) this.field8839.method3321(-121)) {
            var59.method3774(arg1, arg2);
            this.field8829++;
        }
        int var60 = -33 / ((arg4 - 61) / 63);
        class76.field1544 += this.field8829;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)I")
    public static final int method3497(int arg0, int arg1) {
        if (arg0 == 1023) {
            field8832++;
            return arg1 & 0x3FF;
        } else {
            return 33;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lr;Ltk;Lgp;J)V")
    public class607(class167 arg0, class317 arg1, class45 arg2, long arg3) {
        this.field8834 = arg3;
        this.field8831 = arg1;
        this.field8828 = arg2;
        this.field8827 = this.field8831.method2047(8);
        if (!arg0.method25() && this.field8827.field2205 != -1) {
            this.field8827 = class381.method2375(this.field8827.field2205, 0);
        }
        this.field8839 = new class578();
        this.field8824 = (int) ((double) this.field8824 + Math.random() * 64.0D);
        this.method3492((byte) -38);
        this.field8842.field5939 = this.field8836.field5939;
        this.field8842.field5942 = this.field8836.field5942;
        this.field8842.field5940 = this.field8836.field5940;
        this.field8842.field5935 = this.field8836.field5935;
        this.field8842.field5932 = this.field8836.field5932;
        this.field8842.field5936 = this.field8836.field5936;
        this.field8842.field5944 = this.field8836.field5944;
        this.field8842.field5937 = this.field8836.field5937;
        this.field8842.field5930 = this.field8836.field5930;
    }
}
