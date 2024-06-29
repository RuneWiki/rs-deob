import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class192 extends class265 {

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    private int field3377 = 0;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    private int field3383 = 0;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    private int field3355 = -32768;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "Z")
    private boolean field3371 = false;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    private int field3353;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public int field3361;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    private int field3388;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    private int field3365;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    private int field3354;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    private int field3381;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    private int field3362;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lph;")
    private class78 field3351;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Lp;")
    public static class280 field3360 = class18.method140((byte) -124, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
    public static int[] field3359 = new int[2048];

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "J")
    public static long field3373 = 0L;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "Lp;")
    public static class280 field3370 = class18.method140((byte) -118, "lila:");

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Lsb;")
    public static class221 field3358 = new class221(20);

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "Lp;")
    private static class280 field3394 = class18.method140((byte) -119, " has logged out)3");

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "Lp;")
    public static class280 field3393 = field3394;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "D")
    private double field3367;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "D")
    public double field3372;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "D")
    private double field3374;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "D")
    public double field3376;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "D")
    private double field3378;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "D")
    public double field3379;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "D")
    private double field3380;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "D")
    private double field3385;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    private int field3363;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Ltg;")
    public static class180 field3356;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "Lla;")
    private class95 field3391;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method1326(int arg0) {
        field3359 = null;
        field3358 = null;
        field3360 = null;
        field3356 = null;
        field3393 = null;
        field3370 = null;
        if (arg0 != 383) {
            method1328((byte) 105, 8, 34, 15, 62, false);
        }
        field3394 = null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIIII)V")
    public final void method1327(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 102) {
            return;
        }
        if (!this.field3371) {
            double var6 = (double) (arg0 - this.field3388);
            double var8 = (double) (arg1 - this.field3362);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3376 = (double) this.field3381 * var6 / var10 + (double) this.field3388;
            this.field3372 = (double) this.field3381 * var8 / var10 + (double) this.field3362;
            this.field3379 = (double) this.field3365;
        }
        field3392++;
        double var12 = (double) (this.field3390 + 1 - arg3);
        this.field3380 = ((double) arg1 - this.field3372) / var12;
        this.field3374 = ((double) arg0 - this.field3376) / var12;
        this.field3367 = Math.sqrt(this.field3380 * this.field3380 + this.field3374 * this.field3374);
        if (!this.field3371) {
            this.field3385 = -this.field3367 * Math.tan((double) this.field3354 * 0.02454369D);
        }
        this.field3378 = ((double) arg4 - this.field3379 - (this.field3385 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIJILla;)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class95 arg10) {
        field3384++;
        class256 var13 = this.method1331(53);
        if (var13 != null) {
            var13.method427(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3391);
            this.field3355 = var13.method426();
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()I")
    public final int method426() {
        field3387++;
        return this.field3355;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIIIIZ)V")
    public static final void method1328(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class102.field1665++;
        field3375++;
        if (!arg5) {
            class150.method1043(-2657, true);
            class277.method1841(true, (byte) 127);
            class150.method1043(-2657, false);
        }
        class277.method1841(false, (byte) 115);
        if (!arg5) {
            class78.method576(626388240);
        }
        class78.method577(-18315);
        if (class4.field113 == 1) {
            int var6 = class220.field3759;
            int var7 = class25.field487 + class210.field3615 & 0x7FF;
            if ((class279.field4883 / 256) > var6) {
                var6 = class279.field4883 / 256;
            }
            if (class237.field4121[4] && (class11.field230[4] + 128) > var6) {
                var6 = class11.field230[4] + 128;
            }
            class225.method1515(class67.field1115, arg3, var6, var6 * 3 + 600, var7, 27593, class158.method1123(class231.field4013, class262.field4631.field4791, -6230, class262.field4631.field4793) - 50, class183.field3224);
        }
        int var8 = client.field2695;
        int var9 = class22.field406;
        int var10 = class78.field1273;
        int var11 = class8.field170;
        int var12 = class220.field3827;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class237.field4121[var13]) {
                int var19 = (int) ((double) (-class6.field131[var13]) + (double) (class6.field131[var13] * 2 + 1) * Math.random() + Math.sin((double) class83.field1379[var13] / 100.0D * (double) class245.field4307[var13]) * (double) class11.field230[var13]);
                if (var13 == 4) {
                    class8.field170 += var19;
                    if (class8.field170 < 128) {
                        class8.field170 = 128;
                    }
                    if (class8.field170 > 383) {
                        class8.field170 = 383;
                    }
                }
                if (var13 == 2) {
                    class78.field1273 += var19;
                }
                if (var13 == 3) {
                    class220.field3827 = class220.field3827 + var19 & 0x7FF;
                }
                if (var13 == 1) {
                    class22.field406 += var19;
                }
                if (var13 == 0) {
                    client.field2695 += var19;
                }
            }
        }
        class262.method1777(1);
        class151.method1061(arg2, arg1, arg2 + arg4, arg1 + arg3);
        class146.method1022();
        if (class31.field582 || class30.field573 < arg2 || arg2 + arg4 <= class30.field573 || class23.field416 < arg1 || class23.field416 >= (arg1 + arg3)) {
            class99.field1600 = 0;
            class107.field1775 = false;
        } else {
            int var14 = class37.field663;
            class107.field1775 = true;
            int var15 = class13.field262;
            class99.field1600 = 0;
            int var16 = class211.field3623;
            class12.field250 = (class23.field416 - arg1) * (var16 - var15) / arg3 + var15;
            int var17 = class162.field2831;
            class161.field2822 = (var17 - var14) * (class30.field573 - arg2) / arg4 + var14;
        }
        class128.method884(-19552);
        byte var18 = class75.method562(-99) == 2 ? (byte) class102.field1665 : 1;
        if (arg0 < 12) {
            method1330(91);
        }
        class151.method1057(arg2, arg1, arg4, arg3, 0);
        class243.method1655(client.field2695, class22.field406, class78.field1273, class8.field170, class220.field3827, class268.field4705, class54.field879, class109.field1826, class275.field4769, class8.field177, class194.field3419, class231.field4013 + 1, var18, class262.field4631.field4791 >> 7, class262.field4631.field4793 >> 7);
        class128.method884(-19552);
        class158.method1126();
        class228.method1537(-27791, 256, arg4, 256, arg2, arg1, arg3);
        class258.method1749(256, 38, arg1, arg2, arg4, arg3, 256);
        ((class215) class146.field2539).method1442(class165.field2889, (byte) -111);
        class182.method1268(arg4, arg3, arg1, -8, arg2);
        class78.field1273 = var10;
        class22.field406 = var9;
        client.field2695 = var8;
        class220.field3827 = var12;
        class8.field170 = var11;
        if (class28.field528 && class168.field2941.method1744((byte) 88) == 0) {
            class28.field528 = false;
        }
        if (class28.field528) {
            class151.method1057(arg2, arg1, arg4, arg3, 0);
            class200.method1373(false, 6, class196.field3435);
        }
        if (!arg5 && !class28.field528 && !class31.field582 && class30.field573 >= arg2 && class30.field573 < (arg2 + arg4) && arg1 <= class23.field416 && arg1 + arg3 > class23.field416) {
            client.method1102(class23.field416, arg1, arg3, 41, arg4, class30.field573, arg2);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public static final void method1329(int arg0) {
        class237.field4119.method1485((byte) -126);
        field3369++;
        if (arg0 != 2) {
            method1330(47);
        }
        class116.field2101.method1485((byte) -75);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public static final void method1330(int arg0) {
        field3357++;
        int var1 = 0;
        if (arg0 != -26342) {
            return;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class100.method714(-1, class220.field3787, var1, var3, true, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIII)V")
    public final void method429(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3352++;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)Lik;")
    private final class256 method1331(int arg0) {
        field3386++;
        class241 var2 = class199.method1368(-940, this.field3353);
        class256 var3 = var2.method1637(this.field3383, -50);
        if (var3 == null) {
            return null;
        }
        if (arg0 <= 27) {
            this.field3365 = -91;
        }
        var3.method1602(this.field3363);
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
    public final void method1332(int arg0, int arg1) {
        this.field3379 += this.field3378 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field3385;
        this.field3371 = true;
        this.field3376 += (double) arg1 * this.field3374;
        field3368++;
        if (arg0 != -19519) {
            return;
        }
        this.field3372 += (double) arg1 * this.field3380;
        this.field3385 += (double) arg1 * this.field3378;
        this.field3364 = (int) (Math.atan2(this.field3374, this.field3380) * 325.949D) + 1024 & 0x7FF;
        this.field3363 = (int) (Math.atan2(this.field3385, this.field3367) * 325.949D) & 0x7FF;
        if (this.field3351 == null) {
            return;
        }
        this.field3377 += arg1;
        while (true) {
            do {
                do {
                    if (this.field3377 <= this.field3351.field1268[this.field3383]) {
                        return;
                    }
                    this.field3377 -= this.field3351.field1268[this.field3383];
                    this.field3383++;
                } while (this.field3351.field1275.length > this.field3383);
                this.field3383 -= this.field3351.field1285;
            } while (this.field3383 >= 0 && this.field3351.field1275.length > this.field3383);
            this.field3383 = 0;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3371 = false;
        this.field3353 = arg0;
        this.field3361 = arg1;
        this.field3388 = arg2;
        this.field3382 = arg9;
        this.field3365 = arg4;
        this.field3354 = arg7;
        this.field3366 = arg5;
        this.field3381 = arg8;
        this.field3362 = arg3;
        this.field3389 = arg10;
        this.field3390 = arg6;
        int var12 = class199.method1368(-940, this.field3353).field4210;
        if (var12 == -1) {
            this.field3351 = null;
        } else {
            this.field3351 = class207.method1401((byte) -22, var12);
        }
    }
}
