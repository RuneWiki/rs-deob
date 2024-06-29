import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class62 extends class458 {

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    private int field653 = 0;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    private int field649 = 0;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    private int field661 = 0;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "Z")
    private boolean field669 = false;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    private int field646 = 0;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Lfo;")
    private class473 field662;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "Lae;")
    private class228 field657;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "Z")
    private boolean field672;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Z")
    private boolean field651;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "Z")
    private boolean field656;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "Z")
    private boolean field663;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()I", line = 3)
    public final int method408() {
        field660++;
        return this.field674 + this.field653 + this.field649;
    }

    @OriginalMember(owner = "client!qh", name = "EA", descriptor = "(IIII)V", line = 11)
    public final void method409(int arg0, int arg1, int arg2, int arg3) {
        this.field653 = arg1;
        this.field661 = arg2;
        this.field649 = arg3;
        this.field646 = arg0;
        field668++;
        this.field669 = this.field646 != 0 || this.field653 != 0 || this.field661 != 0 || this.field649 != 0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILfa;II)V", line = 23)
    public final void method410(int arg0, int arg1, class213 arg2, int arg3, int arg4) {
        field659++;
        class622 var6 = (class622) arg2;
        int var7 = this.field646 + arg0;
        class228 var8 = var6.field8828;
        int var9 = this.field653 + arg1;
        this.field657.method842(16327, class275.field3476);
        this.field662.method2734(-2);
        this.field662.method2696(-2, this.field657);
        this.field662.method2750(1, (byte) -73);
        this.field662.method2725(1, -31628);
        class667 var10 = this.field662.method2752((byte) 3);
        var10.method3759((float) this.field674, (float) this.field670, (byte) 43, 0.0F);
        var10.method235(var7, var9, 0);
        this.field662.method2693(28392);
        class667 var11 = this.field662.method2730(109);
        var11.method3759(this.field657.method1326(30658, (float) this.field674), this.field657.method1332((float) this.field670, 30994), (byte) 43, 1.0F);
        this.field662.method2689(false, class170.field2044);
        this.field662.method2690(1, 5);
        this.field662.method2696(-2, var8);
        this.field662.method2759(class193.field2323, (byte) -5, class676.field9584);
        this.field662.method2757(class19.field171, (byte) -73, 0);
        class667 var12 = this.field662.method2730(110);
        var12.method3759(var8.method1326(30658, (float) this.field674), var8.method1332((float) this.field670, 30994), (byte) 43, 1.0F);
        var12.method3756(false, 0.0F, var8.method1326(30658, (float) (var9 - arg4)), var8.method1332((float) (var7 - arg3), 30994));
        this.field662.method2689(false, class170.field2044);
        this.field662.method2729((byte) -85);
        this.field662.method2699((byte) -51);
        this.field662.method2757(class67.field708, (byte) -73, 0);
        this.field662.method2759(class193.field2323, (byte) -5, class193.field2323);
        this.field662.method2696(-2, null);
        this.field662.method2690(0, 5);
        this.field662.method2699((byte) -51);
    }

    @OriginalMember(owner = "client!qh", name = "GA", descriptor = "(IIIIII)V", line = 69)
    public final void method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field655++;
        int[] var7 = this.field662.method277(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class139.method776(var7[var8], -16777216);
            }
            this.method412(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII[III)V", line = 91)
    private final void method412(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field658++;
        this.field657.method1329(arg1, arg5, arg6, arg3, arg0, arg2, (byte) -112, arg4);
    }

    @OriginalMember(owner = "client!qh", name = "KA", descriptor = "(IIIIIII)V", line = 102)
    public final void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field667++;
        class667 var8 = this.field662.method2752((byte) 3);
        class667 var9 = this.field662.method2730(111);
        this.field657.method842(16327, this.field672 || this.field651 ? class275.field3476 : class17.field146);
        this.field662.method2734(-2);
        this.field662.method2696(-2, this.field657);
        this.field662.method2750(arg6, (byte) -73);
        this.field662.method2725(arg4, -31628);
        this.field662.method2757(class521.field7461, (byte) -73, 1);
        this.field662.method2723(class521.field7461, -30892, 1);
        this.field662.method2719(arg5, (byte) -125);
        var9.method3759(this.field657.method1326(30658, (float) this.field674), this.field657.method1332((float) this.field670, 30994), (byte) 43, 1.0F);
        if (this.field669) {
            arg2 = this.field670 * arg2 / this.method418();
            arg3 = this.field674 * arg3 / this.method408();
            arg1 += this.field653 * arg3 / this.field674;
            arg0 += this.field646 * arg2 / this.field670;
        }
        var8.method3759((float) arg3, (float) arg2, (byte) 43, 0.0F);
        var8.method235(arg0, arg1, 0);
        this.field662.method2689(false, class170.field2044);
        this.field662.method2693(28392);
        this.field662.method2729((byte) -85);
        this.field662.method2699((byte) -51);
        this.field662.method2757(class19.field171, (byte) -73, 1);
        this.field662.method2723(class19.field171, -30892, 1);
    }

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "(III)V", line = 141)
    public final void method414(int arg0, int arg1, int arg2) {
        field648++;
    }

    @OriginalMember(owner = "client!qh", name = "QA", descriptor = "()I", line = 161)
    public final int method415() {
        field647++;
        return this.field670;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lfo;IIZ)V", line = 569)
    public class62(class473 arg0, int arg1, int arg2, boolean arg3) {
        this.field674 = arg2;
        this.field670 = arg1;
        this.field662 = arg0;
        this.field657 = arg0.method1185(arg1, (byte) 69, arg2, arg3 ? class581.field8260 : class181.field2225, class271.field3429);
        this.field672 = arg1 != this.field657.method1330(-32601);
        this.field651 = arg2 != this.field657.method1328(-89);
        this.field656 = !this.field672 && this.field657.method1327(12832);
        this.field663 = !this.field651 && this.field657.method1327(12832);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lfo;II[III)V", line = 583)
    public class62(class473 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field670 = arg1;
        this.field674 = arg2;
        this.field662 = arg0;
        this.field657 = arg0.method1144(arg4, true, arg2, arg3, false, arg5, arg1);
        this.field672 = this.field657.method1330(-32601) != arg1;
        this.field651 = this.field657.method1328(-71) != arg2;
        this.field656 = !this.field672 && this.field657.method1327(12832);
        this.field663 = !this.field651 && this.field657.method1327(12832);
    }

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "(IIIII)V", line = 176)
    public final void method416(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field650++;
        class667 var6 = this.field662.method2752((byte) 3);
        class667 var7 = this.field662.method2730(127);
        int var8 = this.field646 + arg0;
        int var9 = this.field653 + arg1;
        this.field657.method842(16327, class275.field3476);
        this.field662.method2734(-2);
        this.field662.method2696(-2, this.field657);
        this.field662.method2750(arg4, (byte) -73);
        this.field662.method2725(arg2, -31628);
        this.field662.method2757(class521.field7461, (byte) -73, 1);
        this.field662.method2723(class521.field7461, -30892, 1);
        this.field662.method2719(arg3, (byte) -107);
        var6.method3759((float) this.field674, (float) this.field670, (byte) 43, 0.0F);
        var6.method235(var8, var9, 0);
        var7.method3759(this.field657.method1326(30658, (float) this.field674), this.field657.method1332((float) this.field670, 30994), (byte) 43, 1.0F);
        this.field662.method2689(false, class170.field2044);
        this.field662.method2693(28392);
        this.field662.method2729((byte) -85);
        this.field662.method2699((byte) -51);
        this.field662.method2757(class19.field171, (byte) -73, 1);
        this.field662.method2723(class19.field171, -30892, 1);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()I", line = 207)
    public final int method417() {
        field654++;
        return this.field674;
    }

    @OriginalMember(owner = "client!qh", name = "AA", descriptor = "()I", line = 218)
    public final int method418() {
        field664++;
        return this.field670 + this.field646 + this.field661;
    }

    @OriginalMember(owner = "client!qh", name = "sa", descriptor = "(FFFFFFIII)V", line = 237)
    public final void method419(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field666++;
        class667 var10 = this.field662.method2752((byte) 3);
        class667 var11 = this.field662.method2730(102);
        this.field657.method842(16327, this.field672 || this.field651 ? class275.field3476 : class17.field146);
        this.field662.method2734(-2);
        this.field662.method2696(-2, this.field657);
        this.field662.method2750(arg8, (byte) -73);
        this.field662.method2725(arg6, -31628);
        this.field662.method2757(class521.field7461, (byte) -73, 1);
        this.field662.method2723(class521.field7461, -30892, 1);
        this.field662.method2719(arg7, (byte) -128);
        if (this.field669) {
            float var12 = (float) this.method418();
            float var13 = (float) this.method408();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field653 * var16;
            float var19 = (float) this.field653 * var17;
            float var20 = (float) this.field646 * var14;
            float var21 = (float) this.field646 * var15;
            float var22 = (float) this.field661 * -var14;
            float var23 = (float) this.field661 * -var15;
            float var24 = (float) this.field649 * -var16;
            float var25 = (float) this.field649 * -var17;
            arg0 = arg0 + var20 + var18;
            arg1 = arg1 + var21 + var19;
            arg2 = arg2 + var22 + var18;
            arg4 = arg4 + var20 + var24;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        var10.method3742(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 103, arg5 - arg1, -arg0 + arg4, arg2 - arg0, arg3 - arg1);
        var10.method3756(false, 0.0F, arg1, arg0);
        var11.method3759(this.field657.method1326(30658, (float) this.field674), this.field657.method1332((float) this.field670, 30994), (byte) 43, 1.0F);
        this.field662.method2689(false, class170.field2044);
        this.field662.method2693(28392);
        this.field662.method2729((byte) -85);
        this.field662.method2699((byte) -51);
        this.field662.method2757(class19.field171, (byte) -73, 1);
        this.field662.method2723(class19.field171, -30892, 1);
    }

    @OriginalMember(owner = "client!qh", name = "ba", descriptor = "(IIIIIII)V", line = 307)
    public final void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field652++;
        class667 var8 = this.field662.method2752((byte) 3);
        class667 var9 = this.field662.method2730(112);
        this.field657.method842(16327, class275.field3476);
        this.field662.method2734(-2);
        this.field662.method2696(-2, this.field657);
        this.field662.method2750(arg6, (byte) -73);
        this.field662.method2725(arg4, -31628);
        this.field662.method2757(class521.field7461, (byte) -73, 1);
        this.field662.method2723(class521.field7461, -30892, 1);
        this.field662.method2719(arg5, (byte) -111);
        boolean var10 = this.field663 && this.field653 == 0 && this.field649 == 0;
        boolean var11 = this.field656 && this.field646 == 0 && this.field661 == 0;
        if ((var10 & var11)) {
            var9.method3759(this.field657.method1326(30658, (float) arg3), this.field657.method1332((float) arg2, 30994), (byte) 43, 1.0F);
            var8.method3759((float) arg3, (float) arg2, (byte) 43, 0.0F);
            var8.method235(arg0, arg1, 0);
            this.field662.method2689(false, class170.field2044);
            this.field662.method2693(28392);
            this.field662.method2729((byte) -85);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method408();
            var9.method3759(this.field657.method1326(30658, (float) this.field674), this.field657.method1332((float) arg2, 30994), (byte) 43, 1.0F);
            this.field662.method2689(false, class170.field2044);
            int var14 = this.field653 + arg1;
            for (int var15 = this.field674 + var14; var15 <= var12; var15 += var13) {
                var8.method3759((float) this.field674, (float) arg2, (byte) 43, 0.0F);
                var8.method235(arg0, var14, 0);
                this.field662.method2693(28392);
                this.field662.method2729((byte) -85);
                var14 += var13;
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method3759(this.field657.method1326(30658, (float) var16), this.field657.method1332((float) arg2, 30994), (byte) 43, 1.0F);
                this.field662.method2689(false, class170.field2044);
                var8.method3759((float) var16, (float) arg2, (byte) 43, 0.0F);
                var8.method235(arg0, var14, 0);
                this.field662.method2693(28392);
                this.field662.method2729((byte) -85);
            }
        } else if (var10) {
            int var17 = arg0 + arg2;
            int var18 = this.method418();
            var9.method3759(this.field657.method1326(30658, (float) arg3), this.field657.method1332((float) this.field670, 30994), (byte) 43, 1.0F);
            this.field662.method2689(false, class170.field2044);
            int var19 = this.field646 + arg0;
            int var20 = var19 + this.field670;
            while (var17 >= var20) {
                var8.method3759((float) arg3, (float) this.field670, (byte) 43, 0.0F);
                var8.method235(var19, arg1, 0);
                this.field662.method2693(28392);
                var20 += var18;
                this.field662.method2729((byte) -85);
                var19 += var18;
            }
            if (var17 > var19) {
                int var21 = var17 - var19;
                var9.method3759(this.field657.method1326(30658, (float) arg3), this.field657.method1332((float) var21, 30994), (byte) 43, 1.0F);
                this.field662.method2689(false, class170.field2044);
                var8.method3759((float) arg3, (float) var21, (byte) 43, 0.0F);
                var8.method235(var19, arg1, 0);
                this.field662.method2693(28392);
                this.field662.method2729((byte) -85);
            }
        } else {
            int var22 = arg1 + arg3;
            int var23 = arg0 + arg2;
            int var24 = this.method418();
            int var25 = this.method408();
            int var26 = arg1 + this.field653;
            int var27 = this.field674 + var26;
            while (var27 <= var22) {
                var9.method3759(this.field657.method1326(30658, (float) this.field674), this.field657.method1332((float) this.field670, 30994), (byte) 43, 1.0F);
                this.field662.method2689(false, class170.field2044);
                int var32 = this.field646 + arg0;
                int var33 = this.field670 + var32;
                while (var23 >= var33) {
                    var8.method3759((float) this.field674, (float) this.field670, (byte) 43, 0.0F);
                    var8.method235(var32, var26, 0);
                    this.field662.method2693(28392);
                    var32 += var24;
                    var33 += var24;
                    this.field662.method2729((byte) -85);
                }
                if (var23 > var32) {
                    int var34 = var23 - var32;
                    var9.method3759(this.field657.method1326(30658, (float) this.field674), this.field657.method1332((float) var34, 30994), (byte) 43, 1.0F);
                    this.field662.method2689(false, class170.field2044);
                    var8.method3759((float) this.field674, (float) var34, (byte) 43, 0.0F);
                    var8.method235(var32, var26, 0);
                    this.field662.method2693(28392);
                    this.field662.method2729((byte) -85);
                }
                var27 += var25;
                var26 += var25;
            }
            if (var26 < var22) {
                int var28 = var22 - var26;
                var9.method3759(this.field657.method1326(30658, (float) var28), this.field657.method1332((float) this.field670, 30994), (byte) 43, 1.0F);
                this.field662.method2689(false, class170.field2044);
                int var29 = this.field646 + arg0;
                int var30 = this.field670 + var29;
                while (var30 <= var23) {
                    var8.method3759((float) var28, (float) this.field670, (byte) 43, 0.0F);
                    var8.method235(var29, var26, 0);
                    this.field662.method2693(28392);
                    var29 += var24;
                    var30 += var24;
                    this.field662.method2729((byte) -85);
                }
                if (var23 > var29) {
                    int var31 = var23 - var29;
                    var9.method3759(this.field657.method1326(30658, (float) var28), this.field657.method1332((float) var31, 30994), (byte) 43, 1.0F);
                    this.field662.method2689(false, class170.field2044);
                    var8.method3759((float) var28, (float) var31, (byte) 43, 0.0F);
                    var8.method235(var29, var26, 0);
                    this.field662.method2693(28392);
                    this.field662.method2729((byte) -85);
                }
            }
        }
        this.field662.method2699((byte) -51);
        this.field662.method2757(class19.field171, (byte) -73, 1);
        this.field662.method2723(class19.field171, -30892, 1);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 515)
    public final void method421(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class213 arg6, int arg7, int arg8) {
        field665++;
        class667 var10 = this.field662.method2752((byte) 3);
        class667 var11 = this.field662.method2730(93);
        class622 var12 = (class622) arg6;
        class228 var13 = var12.field8828;
        this.field657.method842(16327, class17.field146);
        this.field662.method2734(-2);
        this.field662.method2696(-2, this.field657);
        this.field662.method2750(1, (byte) -73);
        this.field662.method2725(1, -31628);
        if (this.field669) {
            float var14 = (float) this.field670 / (float) this.method418();
            float var15 = (float) this.field674 / (float) this.method408();
            var10.method3742(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 110, (arg5 - arg1) * var15, (arg4 - arg0) * var15, (arg2 - arg0) * var14, (arg3 - arg1) * var14);
            var10.method3756(false, 0.0F, ((float) this.field653 + arg1) * var15, ((float) this.field646 + arg0) * var14);
        } else {
            var10.method3742(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 89, arg5 - arg1, arg4 - arg0, arg2 - arg0, arg3 - arg1);
            var10.method3756(false, 0.0F, arg1, arg0);
        }
        var11.method3759(this.field657.method1326(30658, (float) this.field674), this.field657.method1332((float) this.field670, 30994), (byte) 43, 1.0F);
        this.field662.method2689(false, class170.field2044);
        this.field662.method2690(1, 5);
        this.field662.method2696(-2, var13);
        this.field662.method2759(class193.field2323, (byte) -5, class676.field9584);
        this.field662.method2757(class19.field171, (byte) -73, 0);
        class667 var16 = this.field662.method2730(101);
        var16.method233(var10);
        var16.method235(-arg7, -arg8, 0);
        var16.method3753(1, var13.method1332(1.0F, 30994), var13.method1326(30658, 1.0F), 1.0F);
        this.field662.method2689(false, class170.field2044);
        this.field662.method2693(28392);
        this.field662.method2729((byte) -85);
        this.field662.method2699((byte) -51);
        this.field662.method2757(class67.field708, (byte) -73, 0);
        this.field662.method2759(class193.field2323, (byte) -5, class193.field2323);
        this.field662.method2696(-2, null);
        this.field662.method2690(0, 5);
        this.field662.method2699((byte) -51);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)V", line = 598)
    public static final void method422(byte arg0, int arg1, int arg2) {
        if (arg0 > -113) {
            method422((byte) -124, -77, 58);
        }
        field673++;
        if (class315.method1784(arg1, 4269)) {
            class394.method2147(arg2, class271.field3434[arg1], 16105);
        }
    }
}
