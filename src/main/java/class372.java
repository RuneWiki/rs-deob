import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class372 extends class702 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Z")
    private boolean field5513 = false;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    private int field5515 = 0;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    private int field5527 = 0;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    private int field5542 = 0;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    private int field5531 = 0;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    private int field5538;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lcf;")
    private class562 field5526;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    private int field5537;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Lhi;")
    private class190 field5535;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Z")
    private boolean field5523;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Z")
    private boolean field5518;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "Z")
    private boolean field5534;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Z")
    private boolean field5539;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field5521 = 0;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)I")
    public static final int method2350(int arg0, int arg1) {
        field5540++;
        if (arg1 > -34) {
            field5521 = -25;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ga", name = "da", descriptor = "(IIIIII)V")
    public final void method1742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5525++;
        int[] var7 = this.field5526.method50(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class2.method189(var7[var8], -16777216);
            }
            this.method2351(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ga", name = "ca", descriptor = "()I")
    public final int method1789() {
        field5524++;
        return this.field5538 + this.field5542 + this.field5527;
    }

    @OriginalMember(owner = "client!ga", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method1790(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field5522++;
        class391 var11 = this.field5526.method3190((byte) 63);
        class391 var12 = this.field5526.method3240(true);
        this.field5535.method774(true, this.field5523 || this.field5518 || (arg9 & 0x1) == 0 ? class540.field7542 : class34.field969);
        this.field5526.method3251(-96);
        this.field5526.method3266(-2, this.field5535);
        this.field5526.method3248(-3, arg8);
        this.field5526.method3195(-12, arg6);
        this.field5526.method3231(1, class370.field5487, (byte) -120);
        this.field5526.method3224(1, (byte) -80, class370.field5487);
        this.field5526.method3242((byte) -73, arg7);
        if (this.field5513) {
            float var13 = (float) this.method1784();
            float var14 = (float) this.method1789();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field5542 * var17;
            float var20 = (float) this.field5542 * var18;
            float var21 = (float) this.field5531 * var15;
            float var22 = (float) this.field5531 * var16;
            float var23 = (float) this.field5515 * -var15;
            float var24 = (float) this.field5515 * -var16;
            float var25 = (float) this.field5527 * -var17;
            float var26 = (float) this.field5527 * -var18;
            arg0 = arg0 + var21 + var19;
            arg2 = arg2 + var23 + var19;
            arg1 = arg1 + var22 + var20;
            arg4 = arg4 + var21 + var25;
            arg3 = arg3 + var24 + var20;
            arg5 = arg5 + var22 + var26;
        }
        var11.method2405(1.0F, arg4 - arg0, arg2 - arg0, 0.0F, 0.0F, 0.0F, arg3 - arg1, 0.0F, arg5 - arg1, 0);
        var11.method2413(-104, arg1, 0.0F, arg0);
        var12.method2421((byte) -115, 1.0F, this.field5535.method467((float) this.field5537, -13359), this.field5535.method471((float) this.field5538, 5235));
        this.field5526.method3265((byte) -88, class662.field9533);
        this.field5526.method3260((byte) -120);
        this.field5526.method3218((byte) -120);
        this.field5526.method3220((byte) -64);
        this.field5526.method3231(1, class661.field9521, (byte) -50);
        this.field5526.method3224(1, (byte) -80, class661.field9521);
    }

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "()I")
    public final int method1792() {
        field5517++;
        return this.field5537;
    }

    @OriginalMember(owner = "client!ga", name = "YA", descriptor = "(IIIIIIII)V")
    public final void method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5541++;
        class391 var9 = this.field5526.method3190((byte) 63);
        class391 var10 = this.field5526.method3240(true);
        this.field5535.method774(true, this.field5523 || this.field5518 || (arg7 & 0x1) == 0 ? class540.field7542 : class34.field969);
        this.field5526.method3251(-77);
        this.field5526.method3266(-2, this.field5535);
        this.field5526.method3248(-3, arg6);
        this.field5526.method3195(-12, arg4);
        this.field5526.method3231(1, class370.field5487, (byte) -121);
        this.field5526.method3224(1, (byte) -80, class370.field5487);
        this.field5526.method3242((byte) -73, arg5);
        var10.method2421((byte) 107, 1.0F, this.field5535.method467((float) this.field5537, -13359), this.field5535.method471((float) this.field5538, 5235));
        if (this.field5513) {
            arg2 = this.field5537 * arg2 / this.method1784();
            arg3 = this.field5538 * arg3 / this.method1789();
            arg0 += this.field5531 * arg2 / this.field5537;
            arg1 += this.field5542 * arg3 / this.field5538;
        }
        var9.method2421((byte) -55, 0.0F, (float) arg2, (float) arg3);
        var9.method891(arg0, arg1, 0);
        this.field5526.method3265((byte) -88, class662.field9533);
        this.field5526.method3260((byte) -125);
        this.field5526.method3218((byte) -120);
        this.field5526.method3220((byte) -43);
        this.field5526.method3231(1, class661.field9521, (byte) -88);
        this.field5526.method3224(1, (byte) -80, class661.field9521);
    }

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "(IIII)V")
    public final void method1787(int arg0, int arg1, int arg2, int arg3) {
        this.field5527 = arg3;
        field5529++;
        this.field5542 = arg1;
        this.field5515 = arg2;
        this.field5531 = arg0;
        this.field5513 = this.field5531 != 0 || this.field5542 != 0 || this.field5515 != 0 || this.field5527 != 0;
    }

    @OriginalMember(owner = "client!ga", name = "DA", descriptor = "(IIIIIII)V")
    public final void method1788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5533++;
        class391 var8 = this.field5526.method3190((byte) 63);
        class391 var9 = this.field5526.method3240(true);
        this.field5535.method774(true, class540.field7542);
        this.field5526.method3251(-108);
        this.field5526.method3266(-2, this.field5535);
        this.field5526.method3248(-3, arg6);
        this.field5526.method3195(-12, arg4);
        this.field5526.method3231(1, class370.field5487, (byte) -81);
        this.field5526.method3224(1, (byte) -80, class370.field5487);
        this.field5526.method3242((byte) -73, arg5);
        boolean var10 = this.field5539 && this.field5542 == 0 && this.field5527 == 0;
        boolean var11 = this.field5534 && this.field5531 == 0 && this.field5515 == 0;
        if ((var11 & var10)) {
            var9.method2421((byte) 55, 1.0F, this.field5535.method467((float) arg2, -13359), this.field5535.method471((float) arg3, 5235));
            var8.method2421((byte) 46, 0.0F, (float) arg2, (float) arg3);
            var8.method891(arg0, arg1, 0);
            this.field5526.method3265((byte) -88, class662.field9533);
            this.field5526.method3260((byte) -118);
            this.field5526.method3218((byte) -96);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method1789();
            var9.method2421((byte) -75, 1.0F, this.field5535.method467((float) arg2, -13359), this.field5535.method471((float) this.field5538, 5235));
            this.field5526.method3265((byte) -88, class662.field9533);
            int var32 = arg1 + this.field5542;
            int var33 = var32 + this.field5538;
            while (var33 <= var30) {
                var8.method2421((byte) -115, 0.0F, (float) arg2, (float) this.field5538);
                var8.method891(arg0, var32, 0);
                this.field5526.method3260((byte) -122);
                var33 += var31;
                var32 += var31;
                this.field5526.method3218((byte) -107);
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method2421((byte) -100, 1.0F, this.field5535.method467((float) arg2, -13359), this.field5535.method471((float) var34, 5235));
                this.field5526.method3265((byte) -88, class662.field9533);
                var8.method2421((byte) -84, 0.0F, (float) arg2, (float) var34);
                var8.method891(arg0, var32, 0);
                this.field5526.method3260((byte) -127);
                this.field5526.method3218((byte) 84);
            }
        } else if (var10) {
            int var12 = arg0 + arg2;
            int var13 = this.method1784();
            var9.method2421((byte) -98, 1.0F, this.field5535.method467((float) this.field5537, -13359), this.field5535.method471((float) arg3, 5235));
            this.field5526.method3265((byte) -88, class662.field9533);
            int var14 = arg0 + this.field5531;
            for (int var15 = this.field5537 + var14; var15 <= var12; var15 += var13) {
                var8.method2421((byte) -67, 0.0F, (float) this.field5537, (float) arg3);
                var8.method891(var14, arg1, 0);
                this.field5526.method3260((byte) -119);
                this.field5526.method3218((byte) 114);
                var14 += var13;
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method2421((byte) -73, 1.0F, this.field5535.method467((float) var16, -13359), this.field5535.method471((float) arg3, 5235));
                this.field5526.method3265((byte) -88, class662.field9533);
                var8.method2421((byte) -60, 0.0F, (float) var16, (float) arg3);
                var8.method891(var14, arg1, 0);
                this.field5526.method3260((byte) -125);
                this.field5526.method3218((byte) -99);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method1784();
            int var20 = this.method1789();
            int var21 = this.field5542 + arg1;
            int var22 = var21 + this.field5538;
            while (var17 >= var22) {
                var9.method2421((byte) -75, 1.0F, this.field5535.method467((float) this.field5537, -13359), this.field5535.method471((float) this.field5538, 5235));
                this.field5526.method3265((byte) -88, class662.field9533);
                int var27 = arg0 + this.field5531;
                int var28 = this.field5537 + var27;
                while (var18 >= var28) {
                    var8.method2421((byte) 67, 0.0F, (float) this.field5537, (float) this.field5538);
                    var8.method891(var27, var21, 0);
                    this.field5526.method3260((byte) -120);
                    var28 += var19;
                    this.field5526.method3218((byte) 89);
                    var27 += var19;
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method2421((byte) 46, 1.0F, this.field5535.method467((float) var29, -13359), this.field5535.method471((float) this.field5538, 5235));
                    this.field5526.method3265((byte) -88, class662.field9533);
                    var8.method2421((byte) 65, 0.0F, (float) var29, (float) this.field5538);
                    var8.method891(var27, var21, 0);
                    this.field5526.method3260((byte) -119);
                    this.field5526.method3218((byte) -120);
                }
                var22 += var20;
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method2421((byte) -75, 1.0F, this.field5535.method467((float) this.field5537, -13359), this.field5535.method471((float) var23, 5235));
                this.field5526.method3265((byte) -88, class662.field9533);
                int var24 = this.field5531 + arg0;
                for (int var25 = this.field5537 + var24; var25 <= var18; var25 += var19) {
                    var8.method2421((byte) 116, 0.0F, (float) this.field5537, (float) var23);
                    var8.method891(var24, var21, 0);
                    this.field5526.method3260((byte) -125);
                    this.field5526.method3218((byte) -107);
                    var24 += var19;
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method2421((byte) 32, 1.0F, this.field5535.method467((float) var26, -13359), this.field5535.method471((float) var23, 5235));
                    this.field5526.method3265((byte) -88, class662.field9533);
                    var8.method2421((byte) 107, 0.0F, (float) var26, (float) var23);
                    var8.method891(var24, var21, 0);
                    this.field5526.method3260((byte) -128);
                    this.field5526.method3218((byte) 70);
                }
            }
        }
        this.field5526.method3220((byte) -92);
        this.field5526.method3231(1, class661.field9521, (byte) -50);
        this.field5526.method3224(1, (byte) -80, class661.field9521);
    }

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "(IIIII)V")
    public final void method1743(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5514++;
        class391 var6 = this.field5526.method3190((byte) 63);
        class391 var7 = this.field5526.method3240(true);
        int var8 = this.field5531 + arg0;
        int var9 = this.field5542 + arg1;
        this.field5535.method774(true, class540.field7542);
        this.field5526.method3251(-94);
        this.field5526.method3266(-2, this.field5535);
        this.field5526.method3248(-3, arg4);
        this.field5526.method3195(-12, arg2);
        this.field5526.method3231(1, class370.field5487, (byte) -77);
        this.field5526.method3224(1, (byte) -80, class370.field5487);
        this.field5526.method3242((byte) -73, arg3);
        var6.method2421((byte) -58, 0.0F, (float) this.field5537, (float) this.field5538);
        var6.method891(var8, var9, 0);
        var7.method2421((byte) 120, 1.0F, this.field5535.method467((float) this.field5537, -13359), this.field5535.method471((float) this.field5538, 5235));
        this.field5526.method3265((byte) -88, class662.field9533);
        this.field5526.method3260((byte) -124);
        this.field5526.method3218((byte) 59);
        this.field5526.method3220((byte) -126);
        this.field5526.method3231(1, class661.field9521, (byte) -46);
        this.field5526.method3224(1, (byte) -80, class661.field9521);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILua;II)V")
    public final void method1744(int arg0, int arg1, class619 arg2, int arg3, int arg4) {
        field5520++;
        class520 var6 = (class520) arg2;
        int var7 = this.field5531 + arg0;
        int var8 = this.field5542 + arg1;
        class190 var9 = var6.field7368;
        this.field5535.method774(true, class540.field7542);
        this.field5526.method3251(-115);
        this.field5526.method3266(-2, this.field5535);
        this.field5526.method3248(-3, 1);
        this.field5526.method3195(-12, 1);
        class391 var10 = this.field5526.method3190((byte) 63);
        var10.method2421((byte) 35, 0.0F, (float) this.field5537, (float) this.field5538);
        var10.method891(var7, var8, 0);
        this.field5526.method3260((byte) -126);
        class391 var11 = this.field5526.method3240(true);
        var11.method2421((byte) 107, 1.0F, this.field5535.method467((float) this.field5537, -13359), this.field5535.method471((float) this.field5538, 5235));
        this.field5526.method3265((byte) -88, class662.field9533);
        this.field5526.method3223(15, 1);
        this.field5526.method3266(-2, var9);
        this.field5526.method3232(class525.field7399, class509.field7205, (byte) -96);
        this.field5526.method3231(0, class661.field9521, (byte) -80);
        class391 var12 = this.field5526.method3240(true);
        var12.method2421((byte) 112, 1.0F, var9.method467((float) this.field5537, -13359), var9.method471((float) this.field5538, 5235));
        var12.method2413(-109, var9.method471((float) (var8 - arg4), 5235), 0.0F, var9.method467((float) (var7 - arg3), -13359));
        this.field5526.method3265((byte) -88, class662.field9533);
        this.field5526.method3218((byte) 102);
        this.field5526.method3220((byte) -24);
        this.field5526.method3231(0, class435.field6296, (byte) -106);
        this.field5526.method3232(class509.field7205, class509.field7205, (byte) -107);
        this.field5526.method3266(-2, null);
        this.field5526.method3223(15, 0);
        this.field5526.method3220((byte) -66);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII[III)V")
    private final void method2351(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field5528++;
        this.field5535.method464(arg5, (byte) 119, arg0, arg4, arg6, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method1794(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class619 arg7, int arg8, int arg9) {
        field5516++;
        class391 var11 = this.field5526.method3190((byte) 63);
        class391 var12 = this.field5526.method3240(true);
        class520 var13 = (class520) arg7;
        class190 var14 = var13.field7368;
        this.field5535.method774(true, this.field5523 || this.field5518 || (arg6 & 0x1) == 0 ? class540.field7542 : class34.field969);
        this.field5526.method3251(-41);
        this.field5526.method3266(-2, this.field5535);
        this.field5526.method3248(-3, 1);
        this.field5526.method3195(-12, 1);
        if (this.field5513) {
            float var15 = (float) this.field5537 / (float) this.method1784();
            float var16 = (float) this.field5538 / (float) this.method1789();
            var11.method2405(1.0F, (arg4 - arg0) * var16, (arg2 - arg0) * var15, 0.0F, 0.0F, 0.0F, (arg3 - arg1) * var15, 0.0F, (arg5 - arg1) * var16, 0);
            var11.method2413(-125, ((float) this.field5542 + arg1) * var16, 0.0F, ((float) this.field5531 + arg0) * var15);
        } else {
            var11.method2405(1.0F, arg4 - arg0, arg2 - arg0, 0.0F, 0.0F, 0.0F, arg3 - arg1, 0.0F, arg5 - arg1, 0);
            var11.method2413(-114, arg1, 0.0F, arg0);
        }
        var12.method2421((byte) -66, 1.0F, this.field5535.method467((float) this.field5537, -13359), this.field5535.method471((float) this.field5538, 5235));
        this.field5526.method3265((byte) -88, class662.field9533);
        this.field5526.method3223(15, 1);
        this.field5526.method3266(-2, var14);
        this.field5526.method3232(class525.field7399, class509.field7205, (byte) -93);
        this.field5526.method3231(0, class661.field9521, (byte) -109);
        class391 var17 = this.field5526.method3240(true);
        var17.method896(var11);
        var17.method891(-arg8, -arg9, 0);
        var17.method2406(var14.method471(1.0F, 5235), 1.0F, var14.method467(1.0F, -13359), false);
        this.field5526.method3265((byte) -88, class662.field9533);
        this.field5526.method3260((byte) -126);
        this.field5526.method3218((byte) -73);
        this.field5526.method3220((byte) -17);
        this.field5526.method3231(0, class435.field6296, (byte) -40);
        this.field5526.method3232(class509.field7205, class509.field7205, (byte) -123);
        this.field5526.method3266(-2, null);
        this.field5526.method3223(15, 0);
        this.field5526.method3220((byte) -77);
    }

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "()I")
    public final int method1784() {
        field5530++;
        return this.field5537 - (-this.field5531 - this.field5515);
    }

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "()I")
    public final int method1785() {
        field5536++;
        return this.field5538;
    }

    @OriginalMember(owner = "client!ga", name = "xa", descriptor = "(III)V")
    public final void method1746(int arg0, int arg1, int arg2) {
        field5519++;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lcf;IIZ)V")
    public class372(class562 arg0, int arg1, int arg2, boolean arg3) {
        this.field5538 = arg2;
        this.field5526 = arg0;
        this.field5537 = arg1;
        this.field5535 = arg0.method2898((byte) 117, arg3 ? class121.field2214 : class610.field8884, class2.field372, arg1, arg2);
        this.field5535.method465(true, 13321, true);
        this.field5523 = this.field5535.method466(-29159) != arg1;
        this.field5518 = this.field5535.method472(19099) != arg2;
        this.field5534 = !this.field5523 && this.field5535.method473(27);
        this.field5539 = !this.field5518 && this.field5535.method473(27);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lcf;II[III)V")
    public class372(class562 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5538 = arg2;
        this.field5526 = arg0;
        this.field5537 = arg1;
        this.field5535 = arg0.method2861(arg5, arg2, 8, arg1, false, arg3, arg4);
        this.field5535.method465(true, 13321, true);
        this.field5523 = this.field5535.method466(-29159) != arg1;
        this.field5518 = this.field5535.method472(19099) != arg2;
        this.field5534 = !this.field5523 && this.field5535.method473(27);
        this.field5539 = !this.field5518 && this.field5535.method473(27);
    }
}
