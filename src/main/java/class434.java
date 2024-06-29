import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class434 extends class726 {

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
    private int field6191 = 0;

    @OriginalMember(owner = "client!rba", name = "v", descriptor = "Z")
    public boolean field6203 = false;

    @OriginalMember(owner = "client!rba", name = "t", descriptor = "Lvha;")
    public class685 field6201 = new class685();

    @OriginalMember(owner = "client!rba", name = "y", descriptor = "Lvha;")
    private class685 field6206 = new class685();

    @OriginalMember(owner = "client!rba", name = "C", descriptor = "Z")
    private boolean field6210 = false;

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "J")
    private long field6192;

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "Lnn;")
    public class417 field6193;

    @OriginalMember(owner = "client!rba", name = "o", descriptor = "Luj;")
    public class385 field6196;

    @OriginalMember(owner = "client!rba", name = "q", descriptor = "Lqb;")
    public class226 field6198;

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "Ltca;")
    public class174 field6190;

    @OriginalMember(owner = "client!rba", name = "s", descriptor = "Lej;")
    public static class124 field6200 = new class124(68, 2);

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "I")
    public static int field6207 = 0;

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!rba", name = "n", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!rba", name = "p", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!rba", name = "r", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!rba", name = "u", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!rba", name = "w", descriptor = "I")
    public int field6204;

    @OriginalMember(owner = "client!rba", name = "x", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!rba", name = "A", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!rba", name = "B", descriptor = "I")
    private int field6209;

    @OriginalMember(owner = "client!rba", name = "D", descriptor = "I")
    private int field6211;

    @OriginalMember(owner = "client!rba", name = "E", descriptor = "I")
    private int field6212;

    @OriginalMember(owner = "client!rba", name = "F", descriptor = "I")
    private int field6213;

    @OriginalMember(owner = "client!rba", name = "G", descriptor = "I")
    private int field6214;

    @OriginalMember(owner = "client!rba", name = "H", descriptor = "I")
    private int field6215;

    @OriginalMember(owner = "client!rba", name = "I", descriptor = "I")
    private int field6216;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(Z)V", line = 5)
    public final void method2633(boolean arg0) {
        this.field6201.field9273 = this.field6193.field6047;
        field6205++;
        this.field6201.field9269 = this.field6193.field6046;
        this.field6201.field9271 = this.field6193.field6040;
        this.field6201.field9272 = this.field6193.field6031;
        this.field6201.field9283 = this.field6193.field6033;
        this.field6201.field9282 = this.field6193.field6037;
        this.field6201.field9281 = this.field6193.field6048;
        this.field6201.field9275 = this.field6193.field6041;
        if (!arg0) {
            return;
        }
        this.field6201.field9278 = this.field6193.field6039;
        if (this.field6201.field9278 == this.field6201.field9271 && this.field6201.field9283 == this.field6201.field9271 && this.field6201.field9281 == this.field6201.field9273 && this.field6201.field9273 == this.field6201.field9272 && this.field6201.field9282 == this.field6201.field9269 && this.field6201.field9282 == this.field6201.field9275) {
            this.field6210 = true;
        } else if (this.field6210) {
            this.field6206.field9281 = this.field6201.field9281;
            this.field6210 = false;
            this.field6206.field9275 = this.field6201.field9275;
            this.field6206.field9269 = this.field6201.field9269;
            this.field6206.field9273 = this.field6201.field9273;
            this.field6206.field9271 = this.field6201.field9271;
            this.field6206.field9282 = this.field6201.field9282;
            this.field6206.field9278 = this.field6201.field9278;
            this.field6206.field9272 = this.field6201.field9272;
            this.field6206.field9283 = this.field6201.field9283;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V", line = 47)
    public static void method2634(int arg0) {
        if (arg0 != 32767) {
            method2638(null, null, 5);
        }
        field6200 = null;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IILha;IIZII)V", line = 57)
    public static final void method2635(int arg0, int arg1, class59 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field6195++;
        if (!arg5) {
            field6208 = -14;
        }
        arg2.method624(arg0, (byte) -125, arg3, arg1, arg6, arg4);
        arg2.method624(arg0 - 2, (byte) -125, arg3 + 1, arg1 + 1, 16, arg7);
        arg2.method623(arg0 - 2, arg1 + 18, arg7, arg3 + 1, arg6 + -19, 115);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lin;Lma;Lin;ZLcba;Lin;)Z", line = 70)
    public static final boolean method2636(class91 arg0, class12 arg1, class91 arg2, boolean arg3, class550 arg4, class91 arg5) {
        class100.field1805 = arg4;
        class266.field3769 = arg1;
        class88.field1563 = arg0;
        class505.field7027 = arg5;
        class666.field9098 = arg2;
        class240.field3497 = new int[16];
        if (arg3) {
            field6208 = 71;
        }
        field6199++;
        for (int var6 = 0; var6 < 16; var6++) {
            class240.field3497[var6] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZLha;J)V", line = 102)
    public final void method2637(boolean arg0, class59 arg1, long arg2) {
        field6194++;
        if (!arg0) {
            this.field6190 = null;
        }
        for (class97 var5 = (class97) this.field6190.method1301(8); var5 != null; var5 = (class97) this.field6190.method1307((byte) 126)) {
            var5.method911(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ld;Lha;I)V", line = 121)
    public static final void method2638(class152 arg0, class59 arg1, int arg2) {
        field6197++;
        if (class489.field6765 == null) {
            return;
        }
        if (class362.field5203 < 10) {
            if (!class489.field6759.method866(100, class489.field6765.field2610)) {
                class362.field5203 = class77.field1395.method850(class489.field6765.field2610, 0) / 10;
                return;
            }
            class508.method2985(-16203);
            class362.field5203 = 10;
        }
        if (class362.field5203 == 10) {
            class489.field6788 = class489.field6765.field2629 >> 6 << 6;
            class489.field6785 = class489.field6765.field2628 >> 6 << 6;
            class489.field6781 = (class489.field6765.field2620 >> 6 << 6) + 64 - class489.field6788;
            class489.field6789 = (class489.field6765.field2612 >> 6 << 6) + 64 - class489.field6785;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class489.field6765.method1253(var3, class221.field3177 + (class58.field1147.field5922 >> 9), (class58.field1147.field5933 >> 9) + class367.field5236, class58.field1147.field5926, (byte) -28)) {
                var4 = var3[1] - class489.field6788;
                var5 = var3[2] - class489.field6785;
            }
            if (!class526.field7284 && var4 >= 0 && class489.field6781 > var4 && var5 >= 0 && class489.field6789 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class33.field850 = var6;
                class614.field8388 = var7;
            } else if (class31.field802 == -1 || class501.field6993 == -1) {
                class489.field6765.method1259(var3, 123, class489.field6765.field2625 & 0x3FFF, class489.field6765.field2625 >> 14 & 0x3FFF);
                class614.field8388 = var3[2] - class489.field6785;
                class33.field850 = var3[1] - class489.field6788;
            } else {
                class489.field6765.method1259(var3, 88, class501.field6993, class31.field802);
                class501.field6993 = -1;
                class31.field802 = -1;
                if (var3 != null) {
                    class33.field850 = var3[1] - class489.field6788;
                    class614.field8388 = var3[2] - class489.field6785;
                }
                class526.field7284 = false;
            }
            if (class489.field6765.field2616 == 37) {
                class489.field6769 = 3.0F;
                class489.field6771 = 3.0F;
            } else if (class489.field6765.field2616 == 50) {
                class489.field6769 = 4.0F;
                class489.field6771 = 4.0F;
            } else if (class489.field6765.field2616 == 75) {
                class489.field6769 = 6.0F;
                class489.field6771 = 6.0F;
            } else if (class489.field6765.field2616 == 100) {
                class489.field6769 = 8.0F;
                class489.field6771 = 8.0F;
            } else if (class489.field6765.field2616 == 200) {
                class489.field6769 = 16.0F;
                class489.field6771 = 16.0F;
            } else {
                class489.field6769 = 8.0F;
                class489.field6771 = 8.0F;
            }
            class489.field6777 = (int) class489.field6769 >> 1;
            class489.field6773 = class11.method64(class489.field6777, 12871);
            class7.method27(false);
            class489.method2888();
            class591.field8075 = new class168();
            class489.field6772 += (int) (Math.random() * 5.0D) - 2;
            if (class489.field6772 < -8) {
                class489.field6772 = -8;
            }
            if (class489.field6772 > 8) {
                class489.field6772 = 8;
            }
            class489.field6775 += (int) (Math.random() * 5.0D) - 2;
            if (class489.field6775 < -16) {
                class489.field6775 = -16;
            }
            if (class489.field6775 > 16) {
                class489.field6775 = 16;
            }
            class489.method2892(arg0, class489.field6772 >> 2 << 10, class489.field6775 >> 1);
            class489.field6760.method2131((byte) 73, 256, 1024);
            class489.field6764.method1040(256, 1, 256);
            class489.field6767.method1689(4096, true);
            class732.field9890.method3433(256, 123);
            class362.field5203 = 20;
        } else if (class362.field5203 == 20) {
            class591.method3373(true, (byte) -123);
            class489.method2884(arg1, class489.field6772, class489.field6775);
            class362.field5203 = 60;
            class591.method3373(true, (byte) -122);
            class660.method3714(true);
        } else if (arg2 <= -43) {
            if (class362.field5203 == 60) {
                if (class489.field6759.method853(-18308, class489.field6765.field2610 + "_staticelements")) {
                    if (!class489.field6759.method866(100, class489.field6765.field2610 + "_staticelements")) {
                        return;
                    }
                    class489.field6768 = class312.method2031(class489.field6759, class489.field6765.field2610 + "_staticelements", class491.field6806, (byte) -91);
                } else {
                    class489.field6768 = new class350(0);
                }
                class489.method2889();
                class362.field5203 = 70;
                class591.method3373(true, (byte) -127);
                class660.method3714(true);
            } else if (class362.field5203 == 70) {
                class323.field4479 = new class342(arg1, 11, true, class458.field6458);
                class362.field5203 = 73;
                class591.method3373(true, (byte) -123);
                class660.method3714(true);
            } else if (class362.field5203 == 73) {
                class204.field2944 = new class342(arg1, 12, true, class458.field6458);
                class362.field5203 = 76;
                class591.method3373(true, (byte) -125);
                class660.method3714(true);
            } else if (class362.field5203 == 76) {
                class428.field6146 = new class342(arg1, 14, true, class458.field6458);
                class362.field5203 = 79;
                class591.method3373(true, (byte) -123);
                class660.method3714(true);
            } else if (class362.field5203 == 79) {
                class445.field6324 = new class342(arg1, 17, true, class458.field6458);
                class362.field5203 = 82;
                class591.method3373(true, (byte) -124);
                class660.method3714(true);
            } else if (class362.field5203 == 82) {
                class530.field7314 = new class342(arg1, 19, true, class458.field6458);
                class362.field5203 = 85;
                class591.method3373(true, (byte) -128);
                class660.method3714(true);
            } else if (class362.field5203 == 85) {
                class539.field7466 = new class342(arg1, 22, true, class458.field6458);
                class362.field5203 = 88;
                class591.method3373(true, (byte) -124);
                class660.method3714(true);
            } else if (class362.field5203 == 88) {
                class480.field6698 = new class342(arg1, 26, true, class458.field6458);
                class362.field5203 = 91;
                class591.method3373(true, (byte) -125);
                class660.method3714(true);
            } else {
                class214.field3034 = new class342(arg1, 30, true, class458.field6458);
                class362.field5203 = 100;
                class591.method3373(true, (byte) -119);
                class660.method3714(true);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lha;Lnn;Luj;J)V", line = 645)
    public class434(class59 arg0, class417 arg1, class385 arg2, long arg3) {
        this.field6192 = arg3;
        this.field6193 = arg1;
        this.field6196 = arg2;
        this.field6198 = this.field6193.method2573((byte) 59);
        if (!arg0.method193() && this.field6198.field3229 != -1) {
            this.field6198 = class157.method1201(this.field6198.field3229, 0);
        }
        this.field6190 = new class174();
        this.field6191 = (int) ((double) this.field6191 + Math.random() * 64.0D);
        this.method2633(true);
        this.field6206.field9283 = this.field6201.field9283;
        this.field6206.field9272 = this.field6201.field9272;
        this.field6206.field9271 = this.field6201.field9271;
        this.field6206.field9278 = this.field6201.field9278;
        this.field6206.field9273 = this.field6201.field9273;
        this.field6206.field9281 = this.field6201.field9281;
        this.field6206.field9269 = this.field6201.field9269;
        this.field6206.field9275 = this.field6201.field9275;
        this.field6206.field9282 = this.field6201.field9282;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lha;IJIZ)V", line = 361)
    public final void method2639(class59 arg0, int arg1, long arg2, int arg3, boolean arg4) {
        if (this.field6203) {
            arg4 = false;
        } else if (class667.field9109 < this.field6198.field3221) {
            arg4 = false;
        } else if (class302.field4204 > class197.field2898[class667.field9109]) {
            arg4 = false;
        } else if (this.field6210) {
            arg4 = false;
        } else if (this.field6198.field3267 != -1) {
            int var7 = (int) (arg2 - this.field6192);
            if (this.field6198.field3253 || this.field6198.field3267 >= var7) {
                var7 %= this.field6198.field3267;
            } else {
                arg4 = false;
            }
            if (!this.field6198.field3248 && var7 < this.field6198.field3235) {
                arg4 = false;
            }
            if (this.field6198.field3248 && this.field6198.field3235 <= var7) {
                arg4 = false;
            }
        }
        field6202++;
        if (arg4) {
            class514.field7142++;
            int var8 = (this.field6201.field9278 + this.field6201.field9271 + this.field6201.field9283) / 3;
            int var9 = (this.field6201.field9281 + this.field6201.field9272 + this.field6201.field9273) / 3;
            int var10 = (this.field6201.field9282 + this.field6201.field9275 + this.field6201.field9269) / 3;
            if (this.field6201.field9276 != var8 || this.field6201.field9270 != var9 || this.field6201.field9274 != var10) {
                this.field6201.field9270 = var9;
                this.field6201.field9276 = var8;
                this.field6201.field9274 = var10;
                int var11 = this.field6201.field9271 - this.field6201.field9278;
                int var12 = this.field6201.field9273 - this.field6201.field9281;
                int var13 = this.field6201.field9282 - this.field6201.field9269;
                int var14 = this.field6201.field9283 - this.field6201.field9278;
                int var15 = this.field6201.field9272 - this.field6201.field9281;
                int var16 = this.field6201.field9275 - this.field6201.field9269;
                this.field6214 = var13 * var14 - (var11 * var16);
                this.field6212 = var12 * var16 - (var13 * var15);
                this.field6215 = var11 * var15 - (var12 * var14);
                while (true) {
                    if (this.field6212 <= 32767 && this.field6214 <= 32767 && this.field6215 <= 32767 && this.field6212 >= -32767 && this.field6214 >= -32767 && this.field6215 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field6212 * this.field6212 - (-(this.field6215 * this.field6215) - (this.field6214 * this.field6214))));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field6212 = this.field6212 * 32767 / var17;
                        this.field6215 = this.field6215 * 32767 / var17;
                        this.field6214 = this.field6214 * 32767 / var17;
                        if (this.field6198.field3257 > 0 || this.field6198.field3283 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field6215, (double) this.field6212) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field6214, Math.sqrt((double) (this.field6215 * this.field6215 + this.field6212 * this.field6212))) * 2607.5945876176133D);
                            this.field6213 = this.field6198.field3257 - this.field6198.field3273;
                            this.field6216 = this.field6198.field3273 + var18 - (this.field6213 >> 1);
                            this.field6211 = this.field6198.field3283 - this.field6198.field3260;
                            this.field6209 = var19 - ((this.field6211 >> 1) - this.field6198.field3260);
                        }
                        break;
                    }
                    this.field6215 >>= 0x1;
                    this.field6214 >>= 0x1;
                    this.field6212 >>= 0x1;
                }
            }
            this.field6191 += (int) (((double) (this.field6198.field3231 - this.field6198.field3233) * Math.random() + (double) this.field6198.field3233) * (double) arg1);
            if (this.field6191 > 63) {
                int var20 = this.field6191 >> 6;
                this.field6191 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field6198.field3257 <= 0 && this.field6198.field3283 <= 0) {
                        var22 = this.field6212;
                        var23 = this.field6215;
                        var24 = this.field6214;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field6213) + this.field6216;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class255.field3698[var26];
                        int var28 = class255.field3695[var26];
                        int var29 = this.field6209 + (int) ((double) this.field6211 * Math.random());
                        int var30 = var29 & 0x1FFF;
                        int var31 = class255.field3698[var30];
                        int var32 = class255.field3695[var30];
                        byte var33 = 13;
                        var22 = var28 * var31 >> var33;
                        var24 = (var32 << 1) * -1;
                        var23 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var35 = 1.0F - var35;
                        var34 = 1.0F - var34;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field6201.field9283 * var36 + (float) this.field6201.field9278 * var34 + (float) this.field6201.field9271 * var35);
                    int var38 = (int) ((float) this.field6201.field9272 * var36 + (float) this.field6201.field9281 * var34 + (float) this.field6201.field9273 * var35);
                    int var39 = (int) ((float) this.field6201.field9275 * var36 + (float) this.field6201.field9282 * var35 + (float) this.field6201.field9269 * var34);
                    int var40 = (int) ((float) this.field6206.field9283 * var36 + (float) this.field6206.field9278 * var34 + (float) this.field6206.field9271 * var35);
                    int var41 = (int) ((float) this.field6206.field9272 * var36 + (float) this.field6206.field9281 * var34 + (float) this.field6206.field9273 * var35);
                    int var42 = (int) ((float) this.field6206.field9275 * var36 + (float) this.field6206.field9282 * var35 + (float) this.field6206.field9269 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                    int var49 = (int) (Math.random() * (double) (this.field6198.field3280 - this.field6198.field3234)) + this.field6198.field3234;
                    int var50 = this.field6198.field3236 + (int) ((double) (this.field6198.field3249 - this.field6198.field3236) * Math.random());
                    int var51 = (int) ((double) (this.field6198.field3259 - this.field6198.field3284) * Math.random()) + this.field6198.field3284;
                    int var52;
                    if (this.field6198.field3285) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field6198.field3250 * var53 + (double) this.field6198.field3241) | (int) ((double) this.field6198.field3275 * var53 + (double) this.field6198.field3271) << 16 | (int) ((double) this.field6198.field3245 * var53 + (double) this.field6198.field3232) << 8 | (int) ((double) this.field6198.field3255 + (double) this.field6198.field3252 * Math.random()) << 24;
                    } else {
                        var52 = (int) ((double) this.field6198.field3252 * Math.random() + (double) this.field6198.field3255) << 24 | (int) (Math.random() * (double) this.field6198.field3275 + (double) this.field6198.field3271) << 16 | (int) (Math.random() * (double) this.field6198.field3245 + (double) this.field6198.field3232) << 8 | (int) ((double) this.field6198.field3250 * Math.random() + (double) this.field6198.field3241);
                    }
                    int var55 = this.field6198.field3256;
                    if (!arg0.method193() && !this.field6198.field3224) {
                        var55 = -1;
                    }
                    if (client.field4219 == class465.field6524) {
                        new class97(this, var46, var47, var48, var22, var24, var23, var49, var50, var52, var51, var55, this.field6198.field3277, this.field6198.field3272);
                    } else {
                        class97 var56 = class134.field2248[class465.field6524];
                        class465.field6524 = class465.field6524 + 1 & 0x3FF;
                        var56.method912(this, var46, var47, var48, var22, var24, var23, var49, var50, var52, var51, var55, this.field6198.field3277, this.field6198.field3272);
                    }
                }
            }
        }
        if (!this.field6201.method3832(this.field6206, true)) {
            class685 var58 = this.field6206;
            this.field6206 = this.field6201;
            this.field6201 = var58;
            this.field6201.field9281 = this.field6193.field6048;
            this.field6201.field9278 = this.field6193.field6039;
            this.field6201.field9273 = this.field6193.field6047;
            this.field6201.field9275 = this.field6193.field6041;
            this.field6201.field9283 = this.field6193.field6033;
            this.field6201.field9282 = this.field6193.field6037;
            this.field6201.field9269 = this.field6193.field6046;
            this.field6201.field9276 = this.field6206.field9276;
            this.field6201.field9272 = this.field6193.field6031;
            this.field6201.field9274 = this.field6206.field9274;
            this.field6201.field9270 = this.field6206.field9270;
            this.field6201.field9271 = this.field6193.field6040;
        }
        this.field6204 = 0;
        for (class97 var59 = (class97) this.field6190.method1301(arg3 + 5); var59 != null; var59 = (class97) this.field6190.method1307((byte) 122)) {
            var59.method913(arg2, arg1);
            this.field6204++;
        }
        class464.field6515 += this.field6204;
        if (arg3 != 3) {
            method2634(124);
        }
    }
}
