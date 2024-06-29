import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class618 extends class631 {

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    private int field8575 = 0;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Z")
    public boolean field8572 = false;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "Lgi;")
    public class640 field8579 = new class640();

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Lgi;")
    private class640 field8583 = new class640();

    @OriginalMember(owner = "client!od", name = "H", descriptor = "Z")
    private boolean field8591 = false;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Lmp;")
    public class140 field8574;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "J")
    private long field8570;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lii;")
    public class514 field8567;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lefa;")
    public class153 field8571;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lvu;")
    public class204 field8568;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field8566 = -1;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "S")
    public static short field8582 = 1;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Ljava/lang/String;")
    public static String field8577 = "";

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public int field8573;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    private int field8584;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    private int field8585;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    private int field8586;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    private int field8587;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    private int field8588;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    private int field8589;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    private int field8590;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Lfea;")
    public static class47 field8581;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I[BIILjava/lang/String;I)I")
    public static final int method3417(int arg0, byte[] arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg2 >= -90) {
            return 71;
        }
        field8569++;
        int var6 = arg5 - arg3;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg0 + var7] = -97;
            } else {
                arg1[arg0 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIJILr;)V")
    public final void method3418(boolean arg0, int arg1, long arg2, int arg3, class562 arg4) {
        if (arg3 != 25172) {
            this.field8574 = null;
        }
        if (this.field8572) {
            arg0 = false;
        } else if (class310.field4194 < this.field8571.field2121) {
            arg0 = false;
        } else if (class67.field825 > class590.field8140[class310.field4194]) {
            arg0 = false;
        } else if (this.field8591) {
            arg0 = false;
        } else if (this.field8571.field2129 != -1) {
            int var7 = (int) (arg2 - this.field8570);
            if (this.field8571.field2157 || this.field8571.field2129 >= var7) {
                var7 %= this.field8571.field2129;
            } else {
                arg0 = false;
            }
            if (!this.field8571.field2137 && this.field8571.field2131 > var7) {
                arg0 = false;
            }
            if (this.field8571.field2137 && var7 >= this.field8571.field2131) {
                arg0 = false;
            }
        }
        field8576++;
        if (arg0) {
            class114.field1459++;
            int var8 = (this.field8579.field8828 + this.field8579.field8823 + this.field8579.field8833) / 3;
            int var9 = (this.field8579.field8835 + this.field8579.field8830 + this.field8579.field8820) / 3;
            int var10 = (this.field8579.field8832 + this.field8579.field8821 + this.field8579.field8831) / 3;
            if (this.field8579.field8822 != var8 || this.field8579.field8829 != var9 || this.field8579.field8825 != var10) {
                this.field8579.field8822 = var8;
                this.field8579.field8825 = var10;
                this.field8579.field8829 = var9;
                int var11 = this.field8579.field8828 - this.field8579.field8823;
                int var12 = this.field8579.field8830 - this.field8579.field8820;
                int var13 = this.field8579.field8831 - this.field8579.field8821;
                int var14 = this.field8579.field8833 - this.field8579.field8823;
                int var15 = this.field8579.field8835 - this.field8579.field8820;
                int var16 = this.field8579.field8832 - this.field8579.field8821;
                this.field8588 = var11 * var15 - (var12 * var14);
                this.field8584 = var13 * var14 - var11 * var16;
                this.field8586 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field8586 <= 32767 && this.field8584 <= 32767 && this.field8588 <= 32767 && this.field8586 >= -32767 && this.field8584 >= -32767 && this.field8588 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field8586 * this.field8586 + this.field8584 * this.field8584 + (this.field8588 * this.field8588)));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field8584 = this.field8584 * 32767 / var17;
                        this.field8588 = this.field8588 * 32767 / var17;
                        this.field8586 = this.field8586 * 32767 / var17;
                        if (this.field8571.field2097 > 0 || this.field8571.field2161 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field8588, (double) this.field8586) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field8584, Math.sqrt((double) (this.field8588 * this.field8588 + this.field8586 * this.field8586))) * 2607.5945876176133D);
                            this.field8589 = this.field8571.field2097 - this.field8571.field2118;
                            this.field8587 = this.field8571.field2118 + var18 - (this.field8589 >> 1);
                            this.field8585 = this.field8571.field2161 - this.field8571.field2096;
                            this.field8590 = var19 + this.field8571.field2096 - (this.field8585 >> 1);
                        }
                        break;
                    }
                    this.field8588 >>= 0x1;
                    this.field8586 >>= 0x1;
                    this.field8584 >>= 0x1;
                }
            }
            this.field8575 += (int) ((Math.random() * (double) (this.field8571.field2116 - this.field8571.field2115) + (double) this.field8571.field2115) * (double) arg1);
            if (this.field8575 > 63) {
                int var20 = this.field8575 >> 6;
                this.field8575 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field8571.field2097 <= 0 && this.field8571.field2161 <= 0) {
                        var22 = this.field8586;
                        var23 = this.field8588;
                        var24 = this.field8584;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field8589) + this.field8587;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class240.field3176[var26];
                        int var28 = class240.field3177[var26];
                        int var29 = this.field8590 + (int) (Math.random() * (double) this.field8585);
                        int var30 = var29 & 0x1FFF;
                        int var31 = class240.field3176[var30];
                        int var32 = class240.field3177[var30];
                        byte var33 = 13;
                        var24 = (var32 << 1) * -1;
                        var22 = var28 * var31 >> var33;
                        var23 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - var34 - var35;
                    int var37 = (int) ((float) this.field8579.field8833 * var36 + (float) this.field8579.field8828 * var35 + (float) this.field8579.field8823 * var34);
                    int var38 = (int) ((float) this.field8579.field8835 * var36 + (float) this.field8579.field8830 * var35 + (float) this.field8579.field8820 * var34);
                    int var39 = (int) ((float) this.field8579.field8832 * var36 + (float) this.field8579.field8831 * var35 + (float) this.field8579.field8821 * var34);
                    int var40 = (int) ((float) this.field8583.field8833 * var36 + (float) this.field8583.field8828 * var35 + (float) this.field8583.field8823 * var34);
                    int var41 = (int) ((float) this.field8583.field8835 * var36 + (float) this.field8583.field8830 * var35 + (float) this.field8583.field8820 * var34);
                    int var42 = (int) ((float) this.field8583.field8832 * var36 + (float) this.field8583.field8831 * var35 + (float) this.field8583.field8821 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) (Math.random() * (double) var44 + (double) var41);
                    int var48 = (int) ((double) var45 * Math.random() + (double) var42);
                    int var49 = (int) (Math.random() * (double) (this.field8571.field2149 - this.field8571.field2155)) + this.field8571.field2155;
                    int var50 = (int) ((double) (this.field8571.field2094 - this.field8571.field2146) * Math.random()) + this.field8571.field2146;
                    int var51 = (int) (Math.random() * (double) (this.field8571.field2132 - this.field8571.field2138)) + this.field8571.field2138;
                    int var52;
                    if (this.field8571.field2156) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field8571.field2143 + (double) this.field8571.field2123 * Math.random()) << 24 | (int) ((double) this.field8571.field2108 * var53 + (double) this.field8571.field2142) << 16 | (int) ((double) this.field8571.field2126 * var53 + (double) this.field8571.field2148) << 8 | (int) ((double) this.field8571.field2151 * var53 + (double) this.field8571.field2145);
                    } else {
                        var52 = (int) ((double) this.field8571.field2151 * Math.random() + (double) this.field8571.field2145) | (int) ((double) this.field8571.field2126 * Math.random() + (double) this.field8571.field2148) << 8 | (int) (Math.random() * (double) this.field8571.field2108 + (double) this.field8571.field2142) << 16 | (int) (Math.random() * (double) this.field8571.field2123 + (double) this.field8571.field2143) << 24;
                    }
                    int var55 = this.field8571.field2120;
                    if (!arg4.method1094() && !this.field8571.field2113) {
                        var55 = -1;
                    }
                    if (class376.field4982 == class33.field465) {
                        new class145(this, var46, var47, var48, var22, var24, var23, var49, var50, var52, var51, var55, this.field8571.field2140, this.field8571.field2163);
                    } else {
                        class145 var56 = class324.field4368[class33.field465];
                        class33.field465 = class33.field465 + 1 & 0x3FF;
                        var56.method831(this, var46, var47, var48, var22, var24, var23, var49, var50, var52, var51, var55, this.field8571.field2140, this.field8571.field2163);
                    }
                }
            }
        }
        if (!this.field8579.method3543(arg3 - 33351, this.field8583)) {
            class640 var58 = this.field8583;
            this.field8583 = this.field8579;
            this.field8579 = var58;
            this.field8579.field8832 = this.field8574.field1905;
            this.field8579.field8821 = this.field8574.field1906;
            this.field8579.field8835 = this.field8574.field1892;
            this.field8579.field8831 = this.field8574.field1896;
            this.field8579.field8830 = this.field8574.field1897;
            this.field8579.field8820 = this.field8574.field1887;
            this.field8579.field8823 = this.field8574.field1895;
            this.field8579.field8833 = this.field8574.field1893;
            this.field8579.field8828 = this.field8574.field1889;
        }
        this.field8573 = 0;
        for (class145 var59 = (class145) this.field8568.method1298((byte) 40); var59 != null; var59 = (class145) this.field8568.method1305((byte) -110)) {
            var59.method830(arg2, arg1);
            this.field8573++;
        }
        class125.field1752 += this.field8573;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method3419(int arg0) {
        field8581 = null;
        if (arg0 != -1) {
            method3417(-11, null, -42, 45, null, 72);
        }
        field8577 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(JBLr;)V")
    public final void method3420(long arg0, byte arg1, class562 arg2) {
        if (arg1 == -108) {
            field8578++;
            for (class145 var5 = (class145) this.field8568.method1298((byte) 40); var5 != null; var5 = (class145) this.field8568.method1305((byte) -114)) {
                var5.method829(arg2, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public final void method3421(int arg0) {
        this.field8579.field8832 = this.field8574.field1905;
        this.field8579.field8831 = this.field8574.field1896;
        field8580++;
        this.field8579.field8828 = this.field8574.field1889;
        this.field8579.field8833 = this.field8574.field1893;
        this.field8579.field8821 = this.field8574.field1906;
        this.field8579.field8823 = this.field8574.field1895;
        this.field8579.field8820 = this.field8574.field1887;
        this.field8579.field8835 = this.field8574.field1892;
        if (arg0 != -256) {
            this.field8583 = null;
        }
        this.field8579.field8830 = this.field8574.field1897;
        if (this.field8579.field8828 == this.field8579.field8823 && this.field8579.field8833 == this.field8579.field8828 && this.field8579.field8830 == this.field8579.field8820 && this.field8579.field8835 == this.field8579.field8830 && this.field8579.field8831 == this.field8579.field8821 && this.field8579.field8832 == this.field8579.field8831) {
            this.field8591 = true;
        } else if (this.field8591) {
            this.field8583.field8821 = this.field8579.field8821;
            this.field8583.field8831 = this.field8579.field8831;
            this.field8583.field8833 = this.field8579.field8833;
            this.field8583.field8835 = this.field8579.field8835;
            this.field8583.field8823 = this.field8579.field8823;
            this.field8583.field8830 = this.field8579.field8830;
            this.field8583.field8828 = this.field8579.field8828;
            this.field8583.field8820 = this.field8579.field8820;
            this.field8583.field8832 = this.field8579.field8832;
            this.field8591 = false;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lr;Lmp;Lii;J)V")
    public class618(class562 arg0, class140 arg1, class514 arg2, long arg3) {
        this.field8574 = arg1;
        this.field8570 = arg3;
        this.field8567 = arg2;
        this.field8571 = this.field8574.method787((byte) -12);
        if (!arg0.method1094() && this.field8571.field2109 != -1) {
            this.field8571 = class35.method204((byte) -112, this.field8571.field2109);
        }
        this.field8568 = new class204();
        this.field8575 = (int) ((double) this.field8575 + Math.random() * 64.0D);
        this.method3421(-256);
        this.field8583.field8823 = this.field8579.field8823;
        this.field8583.field8820 = this.field8579.field8820;
        this.field8583.field8830 = this.field8579.field8830;
        this.field8583.field8835 = this.field8579.field8835;
        this.field8583.field8833 = this.field8579.field8833;
        this.field8583.field8832 = this.field8579.field8832;
        this.field8583.field8831 = this.field8579.field8831;
        this.field8583.field8821 = this.field8579.field8821;
        this.field8583.field8828 = this.field8579.field8828;
    }
}
