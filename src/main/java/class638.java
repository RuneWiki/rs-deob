import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class638 extends class696 {

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "Z")
    public boolean field8826 = false;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    private int field8818 = 0;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "Ll;")
    public class278 field8831 = new class278();

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "Ll;")
    private class278 field8837 = new class278();

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "Z")
    private boolean field8839 = false;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Laj;")
    public class428 field8822;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "J")
    private long field8825;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lal;")
    public class183 field8820;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "Lhd;")
    public class332 field8836;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "Lwo;")
    public class314 field8835;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8823 = new BigInteger("be111a6fa62598c3dc22c509dadcd1fe3c5e5eefae189d8b08658c1fb3613c38546b73ab9ad654bf5544bfa913c326831c3d3c60def99d78aa26d5a2f7aa8263", 16);

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    public static volatile int field8834 = -1;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public int field8828;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    private int field8838;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    private int field8840;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    private int field8841;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    private int field8842;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    private int field8843;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    private int field8844;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    private int field8845;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
    public static final byte[] method3459(int arg0, Object arg1, boolean arg2) {
        if (arg0 != -32767) {
            return null;
        }
        field8819++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class572.method3217(105, var3) : var3;
        } else if (arg1 instanceof class242) {
            class242 var4 = (class242) arg1;
            return var4.method524(true);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBIIII)V")
    public static final void method3460(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field8824++;
        int var6 = arg5 - arg0;
        if (arg1 != 20) {
            method3459(84, null, false);
        }
        int var7 = arg4 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class127.method825(arg3, arg2, arg0, arg4, 0);
            }
        } else if (var7 == 0) {
            class643.method3494(arg3, arg2, -42, arg0, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg2 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (class108.field1334 > arg5) {
                var10 = (class108.field1334 * var8 >> 12) + var9;
                var11 = class108.field1334;
            } else if (arg5 <= class592.field8242) {
                var11 = arg5;
                var10 = arg4;
            } else {
                var10 = (class592.field8242 * var8 >> 12) + var9;
                var11 = class592.field8242;
            }
            int var12;
            int var13;
            if (class108.field1334 > arg0) {
                var13 = class108.field1334;
                var12 = (class108.field1334 * var8 >> 12) + var9;
            } else if (class592.field8242 >= arg0) {
                var12 = arg2;
                var13 = arg0;
            } else {
                var13 = class592.field8242;
                var12 = (class592.field8242 * var8 >> 12) + var9;
            }
            if (class112.field1386 > var12) {
                var13 = (class112.field1386 - var9 << 12) / var8;
                var12 = class112.field1386;
            } else if (var12 > class328.field4190) {
                var13 = (class328.field4190 - var9 << 12) / var8;
                var12 = class328.field4190;
            }
            if (class112.field1386 > var10) {
                var10 = class112.field1386;
                var11 = (class112.field1386 - var9 << 12) / var8;
            } else if (var10 > class328.field4190) {
                var11 = (class328.field4190 - var9 << 12) / var8;
                var10 = class328.field4190;
            }
            class45.method371(var12, var11, var10, var13, (byte) 44, arg3);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method3461(int arg0) {
        if (arg0 < -13) {
            field8823 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lha;IJ)V")
    public final void method3462(class454 arg0, int arg1, long arg2) {
        field8830++;
        if (arg1 > 69) {
            for (class32 var5 = (class32) this.field8835.method1839(83); var5 != null; var5 = (class32) this.field8835.method1836((byte) -26)) {
                var5.method305(arg0, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)I")
    public static final int method3463(byte arg0, int arg1) {
        field8827++;
        if (arg1 == 16711935) {
            return -1;
        } else {
            int var2 = 95 % ((arg0 - 37) / 46);
            return class257.method1567(-1597404048, arg1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Z")
    public static final boolean method3464(int arg0, int arg1) {
        if (arg1 <= 80) {
            method3459(-61, null, true);
        }
        field8833++;
        if (arg0 == 51 || arg0 == 44 || arg0 == 3 || arg0 == 50 || arg0 == 1003) {
            return true;
        } else {
            return arg0 == 5 || arg0 == 1002;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZJLha;I)V")
    public final void method3465(int arg0, boolean arg1, long arg2, class454 arg3, int arg4) {
        field8821++;
        if (this.field8826) {
            arg1 = false;
        } else if (class266.field3369 < this.field8836.field4212) {
            arg1 = false;
        } else if (class274.field3468 > class587.field8206[class266.field3369]) {
            arg1 = false;
        } else if (this.field8839) {
            arg1 = false;
        } else if (this.field8836.field4255 != -1) {
            int var7 = (int) (arg2 - this.field8825);
            if (this.field8836.field4222 || var7 <= this.field8836.field4255) {
                var7 %= this.field8836.field4255;
            } else {
                arg1 = false;
            }
            if (!this.field8836.field4219 && this.field8836.field4251 > var7) {
                arg1 = false;
            }
            if (this.field8836.field4219 && this.field8836.field4251 <= var7) {
                arg1 = false;
            }
        }
        if (arg1) {
            class706.field9952++;
            int var8 = (this.field8831.field3524 + this.field8831.field3515 + this.field8831.field3516) / 3;
            int var9 = (this.field8831.field3525 + this.field8831.field3521 + this.field8831.field3528) / 3;
            int var10 = (this.field8831.field3522 + this.field8831.field3519 + this.field8831.field3514) / 3;
            if (this.field8831.field3520 != var8 || this.field8831.field3526 != var9 || this.field8831.field3527 != var10) {
                this.field8831.field3526 = var9;
                this.field8831.field3527 = var10;
                this.field8831.field3520 = var8;
                int var11 = this.field8831.field3515 - this.field8831.field3524;
                int var12 = this.field8831.field3525 - this.field8831.field3521;
                int var13 = this.field8831.field3522 - this.field8831.field3519;
                int var14 = this.field8831.field3516 - this.field8831.field3524;
                int var15 = this.field8831.field3528 - this.field8831.field3521;
                int var16 = this.field8831.field3514 - this.field8831.field3519;
                this.field8844 = var13 * var14 - (var11 * var16);
                this.field8841 = var12 * var16 - var13 * var15;
                this.field8838 = var11 * var15 - (var12 * var14);
                while (true) {
                    if (this.field8841 <= 32767 && this.field8844 <= 32767 && this.field8838 <= 32767 && this.field8841 >= -32767 && this.field8844 >= -32767 && this.field8838 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field8841 * this.field8841 + this.field8844 * this.field8844 + this.field8838 * this.field8838));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field8838 = this.field8838 * 32767 / var17;
                        this.field8841 = this.field8841 * 32767 / var17;
                        this.field8844 = this.field8844 * 32767 / var17;
                        if (this.field8836.field4264 > 0 || this.field8836.field4273 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field8838, (double) this.field8841) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field8844, Math.sqrt((double) (this.field8841 * this.field8841 + this.field8838 * this.field8838))) * 2607.5945876176133D);
                            this.field8845 = this.field8836.field4264 - this.field8836.field4246;
                            this.field8840 = var18 + this.field8836.field4246 - (this.field8845 >> 1);
                            this.field8842 = this.field8836.field4273 - this.field8836.field4249;
                            this.field8843 = var19 + this.field8836.field4249 - (this.field8842 >> 1);
                        }
                        break;
                    }
                    this.field8838 >>= 0x1;
                    this.field8844 >>= 0x1;
                    this.field8841 >>= 0x1;
                }
            }
            this.field8818 += (int) ((Math.random() * (double) (this.field8836.field4218 - this.field8836.field4270) + (double) this.field8836.field4270) * (double) arg0);
            if (this.field8818 > 63) {
                int var20 = this.field8818 >> 6;
                this.field8818 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field8836.field4264 <= 0 && this.field8836.field4273 <= 0) {
                        var22 = this.field8841;
                        var23 = this.field8838;
                        var24 = this.field8844;
                    } else {
                        int var25 = (int) ((double) this.field8845 * Math.random()) + this.field8840;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class138.field1644[var26];
                        int var28 = class138.field1645[var26];
                        int var29 = (int) ((double) this.field8842 * Math.random()) + this.field8843;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class138.field1644[var30];
                        int var32 = class138.field1645[var30];
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
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field8831.field3516 * var36 + (float) this.field8831.field3524 * var34 + (float) this.field8831.field3515 * var35);
                    int var38 = (int) ((float) this.field8831.field3528 * var36 + (float) this.field8831.field3525 * var35 + (float) this.field8831.field3521 * var34);
                    int var39 = (int) ((float) this.field8831.field3514 * var36 + (float) this.field8831.field3522 * var35 + (float) this.field8831.field3519 * var34);
                    int var40 = (int) ((float) this.field8837.field3516 * var36 + (float) this.field8837.field3524 * var34 + (float) this.field8837.field3515 * var35);
                    int var41 = (int) ((float) this.field8837.field3528 * var36 + (float) this.field8837.field3525 * var35 + (float) this.field8837.field3521 * var34);
                    int var42 = (int) ((float) this.field8837.field3514 * var36 + (float) this.field8837.field3522 * var35 + (float) this.field8837.field3519 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + (double) var43 * Math.random());
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var42 + Math.random() * (double) var45);
                    int var49 = this.field8836.field4253 + ((int) ((double) (this.field8836.field4243 - this.field8836.field4253) * Math.random()));
                    int var50 = (int) ((double) (this.field8836.field4279 - this.field8836.field4224) * Math.random()) + this.field8836.field4224;
                    int var51 = (int) (Math.random() * (double) (this.field8836.field4210 - this.field8836.field4250)) + this.field8836.field4250;
                    int var54;
                    if (this.field8836.field4230) {
                        double var52 = Math.random();
                        var54 = (int) ((double) this.field8836.field4215 * Math.random() + (double) this.field8836.field4244) << 24 | (int) ((double) this.field8836.field4221 * var52 + (double) this.field8836.field4227) << 16 | (int) ((double) this.field8836.field4234 * var52 + (double) this.field8836.field4272) << 8 | (int) ((double) this.field8836.field4231 * var52 + (double) this.field8836.field4238);
                    } else {
                        var54 = (int) (Math.random() * (double) this.field8836.field4215 + (double) this.field8836.field4244) << 24 | (int) ((double) this.field8836.field4227 + (double) this.field8836.field4221 * Math.random()) << 16 | (int) ((double) this.field8836.field4272 + (double) this.field8836.field4234 * Math.random()) << 8 | (int) ((double) this.field8836.field4238 + (double) this.field8836.field4231 * Math.random());
                    }
                    int var55 = this.field8836.field4239;
                    if (!arg3.method149() && !this.field8836.field4247) {
                        var55 = -1;
                    }
                    if (class556.field7802 == class169.field2222) {
                        new class32(this, var46, var47, var48, var22, var24, var23, var49, var50, var54, var51, var55, this.field8836.field4237, this.field8836.field4225);
                    } else {
                        class32 var57 = class700.field9880[class169.field2222];
                        class169.field2222 = class169.field2222 + 1 & 0x3FF;
                        var57.method307(this, var46, var47, var48, var22, var24, var23, var49, var50, var54, var51, var55, this.field8836.field4237, this.field8836.field4225);
                    }
                }
            }
        }
        if (!this.field8831.method1667(this.field8837, 8221)) {
            class278 var58 = this.field8837;
            this.field8837 = this.field8831;
            this.field8831 = var58;
            this.field8831.field3515 = this.field8820.field2390;
            this.field8831.field3519 = this.field8820.field2403;
            this.field8831.field3525 = this.field8820.field2399;
            this.field8831.field3524 = this.field8820.field2395;
            this.field8831.field3514 = this.field8820.field2405;
            this.field8831.field3521 = this.field8820.field2396;
            this.field8831.field3526 = this.field8837.field3526;
            this.field8831.field3516 = this.field8820.field2409;
            this.field8831.field3520 = this.field8837.field3520;
            this.field8831.field3527 = this.field8837.field3527;
            this.field8831.field3522 = this.field8820.field2397;
            this.field8831.field3528 = this.field8820.field2406;
        }
        this.field8828 = 0;
        if (arg4 != -31691) {
            return;
        }
        for (class32 var59 = (class32) this.field8835.method1839(-120); var59 != null; var59 = (class32) this.field8835.method1836((byte) -26)) {
            var59.method304(arg2, arg0);
            this.field8828++;
        }
        class204.field2590 += this.field8828;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public final void method3466(int arg0) {
        this.field8831.field3528 = this.field8820.field2406;
        this.field8831.field3514 = this.field8820.field2405;
        this.field8831.field3525 = this.field8820.field2399;
        this.field8831.field3515 = this.field8820.field2390;
        this.field8831.field3522 = this.field8820.field2397;
        this.field8831.field3519 = this.field8820.field2403;
        if (arg0 != -4860) {
            this.field8835 = null;
        }
        field8832++;
        this.field8831.field3524 = this.field8820.field2395;
        this.field8831.field3521 = this.field8820.field2396;
        this.field8831.field3516 = this.field8820.field2409;
        if (this.field8831.field3524 == this.field8831.field3515 && this.field8831.field3516 == this.field8831.field3515 && this.field8831.field3525 == this.field8831.field3521 && this.field8831.field3528 == this.field8831.field3525 && this.field8831.field3522 == this.field8831.field3519 && this.field8831.field3522 == this.field8831.field3514) {
            this.field8839 = true;
        } else if (this.field8839) {
            this.field8837.field3514 = this.field8831.field3514;
            this.field8837.field3522 = this.field8831.field3522;
            this.field8837.field3516 = this.field8831.field3516;
            this.field8837.field3515 = this.field8831.field3515;
            this.field8837.field3528 = this.field8831.field3528;
            this.field8837.field3519 = this.field8831.field3519;
            this.field8837.field3525 = this.field8831.field3525;
            this.field8839 = false;
            this.field8837.field3521 = this.field8831.field3521;
            this.field8837.field3524 = this.field8831.field3524;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lha;Lal;Laj;J)V")
    public class638(class454 arg0, class183 arg1, class428 arg2, long arg3) {
        this.field8822 = arg2;
        this.field8825 = arg3;
        this.field8820 = arg1;
        this.field8836 = this.field8820.method1170((byte) 88);
        if (!arg0.method149() && this.field8836.field4266 != -1) {
            this.field8836 = class543.method3090(0, this.field8836.field4266);
        }
        this.field8835 = new class314();
        this.field8818 = (int) ((double) this.field8818 + Math.random() * 64.0D);
        this.method3466(-4860);
        this.field8837.field3515 = this.field8831.field3515;
        this.field8837.field3521 = this.field8831.field3521;
        this.field8837.field3516 = this.field8831.field3516;
        this.field8837.field3514 = this.field8831.field3514;
        this.field8837.field3525 = this.field8831.field3525;
        this.field8837.field3524 = this.field8831.field3524;
        this.field8837.field3528 = this.field8831.field3528;
        this.field8837.field3522 = this.field8831.field3522;
        this.field8837.field3519 = this.field8831.field3519;
    }
}
