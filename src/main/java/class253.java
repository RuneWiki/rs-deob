import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class253 extends class10 {

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "[I")
    public static int[] field3267 = new int[32];

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "F")
    public float field3252;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "F")
    public float field3253;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "F")
    public float field3255;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "F")
    public float field3257;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "F")
    public float field3259;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "F")
    public float field3261;

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "F")
    public float field3263;

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "F")
    public float field3264;

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "F")
    public float field3278;

    @OriginalMember(owner = "client!gca", name = "H", descriptor = "F")
    public float field3281;

    @OriginalMember(owner = "client!gca", name = "N", descriptor = "F")
    public float field3287;

    @OriginalMember(owner = "client!gca", name = "O", descriptor = "F")
    public float field3288;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!gca", name = "A", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!gca", name = "B", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!gca", name = "C", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!gca", name = "G", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!gca", name = "J", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!gca", name = "K", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!gca", name = "L", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!gca", name = "M", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!gca", name = "P", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "Lpc;")
    public static class670 field3282;

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "[I")
    public static int[] field3265;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(III)V")
    public final void method33(int arg0, int arg1, int arg2) {
        this.field3253 = arg0;
        this.field3259 = arg2;
        this.field3278 = arg1;
        this.field3261 = this.field3281 = this.field3263 = this.field3257 = this.field3264 = this.field3288 = 0.0F;
        this.field3287 = this.field3255 = this.field3252 = 1.0F;
        field3280++;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IFFFF[F)V")
    public final void method1503(int arg0, float arg1, float arg2, float arg3, float arg4, float[] arg5) {
        field3270++;
        arg5[0] = this.field3264 * arg1 + this.field3287 * arg3 + this.field3263 * arg4;
        float var8;
        float var9;
        float var10;
        if ((arg3 > 0.00390625F) || (arg3 < -0.00390625F)) {
            float var12 = -arg2 / arg3;
            var8 = this.field3261 * var12 + this.field3278;
            var10 = this.field3281 * var12 + this.field3259;
            var9 = this.field3287 * var12 + this.field3253;
        } else if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var11 = -arg2 / arg4;
            var9 = this.field3263 * var11 + this.field3253;
            var8 = this.field3255 * var11 + this.field3278;
            var10 = this.field3257 * var11 + this.field3259;
        } else {
            float var7 = -arg2 / arg1;
            var8 = this.field3288 * var7 + this.field3278;
            var9 = this.field3264 * var7 + this.field3253;
            var10 = this.field3252 * var7 + this.field3259;
        }
        if (arg0 == -29834) {
            arg5[2] = this.field3252 * arg1 + this.field3281 * arg3 + this.field3257 * arg4;
            arg5[1] = this.field3288 * arg1 + this.field3261 * arg3 + this.field3255 * arg4;
            arg5[3] = -(arg5[2] * var10 + arg5[0] * var9 + arg5[1] * var8);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(III[I)V")
    public final void method29(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field3253);
        int var6 = (int) ((float) arg1 - this.field3278);
        field3254++;
        int var7 = (int) ((float) arg2 - this.field3259);
        arg3[1] = (int) ((float) var7 * this.field3257 + (float) var5 * this.field3263 + (float) var6 * this.field3255);
        arg3[0] = (int) ((float) var7 * this.field3281 + (float) var5 * this.field3287 + (float) var6 * this.field3261);
        arg3[2] = (int) ((float) var7 * this.field3252 + (float) var5 * this.field3264 + (float) var6 * this.field3288);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(FIIFIBF)V")
    public final void method1504(float arg0, int arg1, int arg2, float arg3, int arg4, byte arg5, float arg6) {
        if (arg2 == 0) {
            this.field3287 = arg4;
            this.field3261 = this.field3281 = this.field3263 = this.field3257 = this.field3264 = this.field3288 = 0.0F;
            this.field3255 = arg1;
            this.field3252 = 1.0F;
        } else {
            float var8 = class1.field1[arg2 & 0x3FFF];
            float var9 = class1.field6[arg2 & 0x3FFF];
            this.field3287 = (float) arg4 * var8;
            this.field3263 = (float) arg1 * -var9;
            this.field3261 = (float) arg4 * var9;
            this.field3281 = this.field3257 = this.field3264 = this.field3288 = 0.0F;
            this.field3255 = (float) arg1 * var8;
            this.field3252 = 1.0F;
        }
        field3266++;
        this.field3278 = arg0;
        this.field3253 = arg6;
        this.field3259 = arg3;
        if (arg5 != 63) {
            this.method25(null);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
    public final void method23(int arg0) {
        field3273++;
        float var2 = class1.field1[arg0 & 0x3FFF];
        float var3 = class1.field6[arg0 & 0x3FFF];
        float var4 = this.field3287;
        float var5 = this.field3263;
        float var6 = this.field3264;
        float var7 = this.field3253;
        this.field3287 = var2 * var4 - this.field3261 * var3;
        this.field3261 = this.field3261 * var2 + var3 * var4;
        this.field3263 = var2 * var5 - this.field3255 * var3;
        this.field3264 = var2 * var6 - this.field3288 * var3;
        this.field3255 = this.field3255 * var2 + var3 * var5;
        this.field3288 = this.field3288 * var2 + var3 * var6;
        this.field3253 = var2 * var7 - this.field3278 * var3;
        this.field3278 = this.field3278 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIII)V")
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3271++;
        float var7 = class1.field1[arg3 & 0x3FFF];
        float var8 = class1.field6[arg3 & 0x3FFF];
        float var9 = class1.field1[arg4 & 0x3FFF];
        float var10 = class1.field6[arg4 & 0x3FFF];
        float var11 = class1.field1[arg5 & 0x3FFF];
        float var12 = class1.field6[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3281 = var7 * var10;
        this.field3257 = -var8;
        this.field3263 = var7 * var12;
        this.field3252 = var7 * var9;
        this.field3287 = var9 * var11 + var10 * var14;
        this.field3288 = var9 * var13 + var10 * var12;
        this.field3261 = -var9 * var12 + var10 * var13;
        this.field3264 = -var10 * var11 + var9 * var14;
        this.field3255 = var7 * var11;
        this.field3259 = (float) (-arg0) * this.field3281 - ((float) arg1 * this.field3257) - ((float) arg2 * this.field3252);
        this.field3278 = (float) (-arg0) * this.field3261 - ((float) arg1 * this.field3255) - ((float) arg2 * this.field3288);
        this.field3253 = (float) (-arg0) * this.field3287 - (float) arg1 * this.field3263 - (float) arg2 * this.field3264;
    }

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "(I)V")
    public final void method38(int arg0) {
        field3279++;
        float var2 = class1.field1[arg0 & 0x3FFF];
        float var3 = class1.field6[arg0 & 0x3FFF];
        float var4 = this.field3261;
        float var5 = this.field3255;
        float var6 = this.field3288;
        float var7 = this.field3278;
        this.field3261 = var2 * var4 - (this.field3281 * var3);
        this.field3281 = this.field3281 * var2 + var3 * var4;
        this.field3255 = var2 * var5 - (this.field3257 * var3);
        this.field3288 = var2 * var6 - (this.field3252 * var3);
        this.field3257 = this.field3257 * var2 + var3 * var5;
        this.field3278 = var2 * var7 - this.field3259 * var3;
        this.field3252 = this.field3252 * var2 + var3 * var6;
        this.field3259 = this.field3259 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "()V")
    public final void method24() {
        this.field3261 = this.field3281 = this.field3263 = this.field3257 = this.field3264 = this.field3288 = this.field3253 = this.field3278 = this.field3259 = 0.0F;
        field3260++;
        this.field3287 = this.field3255 = this.field3252 = 1.0F;
    }

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "(I)V")
    public final void method1505(int arg0) {
        this.field3281 = -this.field3281;
        this.field3278 = -this.field3278;
        this.field3288 = -this.field3288;
        if (arg0 != 2) {
            this.field3263 = -1.6680864F;
        }
        this.field3257 = -this.field3257;
        this.field3259 = -this.field3259;
        this.field3261 = -this.field3261;
        this.field3252 = -this.field3252;
        field3286++;
        this.field3255 = -this.field3255;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lhba;B)V")
    public final void method1506(class10 arg0, byte arg1) {
        field3284++;
        class253 var3 = (class253) arg0;
        this.field3287 = var3.field3287;
        this.field3264 = var3.field3281;
        this.field3263 = var3.field3261;
        this.field3281 = var3.field3264;
        this.field3255 = var3.field3255;
        this.field3261 = var3.field3263;
        if (arg1 > -83) {
            this.field3281 = 0.61483526F;
        }
        this.field3288 = var3.field3257;
        this.field3257 = var3.field3288;
        this.field3252 = var3.field3252;
        this.field3253 = -(this.field3264 * var3.field3259 + this.field3287 * var3.field3253 + this.field3263 * var3.field3278);
        this.field3278 = -(this.field3288 * var3.field3259 + this.field3261 * var3.field3253 + this.field3255 * var3.field3278);
        this.field3259 = -(this.field3252 * var3.field3259 + this.field3281 * var3.field3253 + this.field3257 * var3.field3278);
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(III[I)V")
    public final void method32(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field3288 + (float) arg0 * this.field3261 + (float) arg1 * this.field3255);
        field3268++;
        arg3[0] = (int) ((float) arg2 * this.field3264 + (float) arg0 * this.field3287 + (float) arg1 * this.field3263);
        arg3[2] = (int) ((float) arg2 * this.field3252 + (float) arg0 * this.field3281 + (float) arg1 * this.field3257);
    }

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "(I)V")
    public final void method37(int arg0) {
        field3275++;
        this.field3252 = 1.0F;
        this.field3287 = this.field3255 = class1.field1[arg0 & 0x3FFF];
        this.field3261 = class1.field6[arg0 & 0x3FFF];
        this.field3264 = this.field3253 = this.field3288 = this.field3278 = this.field3281 = this.field3257 = this.field3259 = 0.0F;
        this.field3263 = -this.field3261;
    }

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "(I)[F")
    public final float[] method1507(int arg0) {
        class476.field6575[4] = this.field3263;
        if (arg0 > -102) {
            this.field3255 = -1.0382957F;
        }
        class476.field6575[8] = this.field3264;
        class476.field6575[14] = this.field3259;
        class476.field6575[10] = this.field3252;
        class476.field6575[6] = this.field3257;
        class476.field6575[1] = this.field3261;
        class476.field6575[13] = this.field3278;
        class476.field6575[2] = this.field3281;
        field3289++;
        class476.field6575[0] = this.field3287;
        class476.field6575[5] = this.field3255;
        class476.field6575[9] = this.field3288;
        class476.field6575[12] = this.field3253;
        return class476.field6575;
    }

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "(I)V")
    public final void method40(int arg0) {
        field3285++;
        this.field3287 = 1.0F;
        this.field3255 = this.field3252 = class1.field1[arg0 & 0x3FFF];
        this.field3257 = class1.field6[arg0 & 0x3FFF];
        this.field3288 = -this.field3257;
        this.field3263 = this.field3264 = this.field3253 = this.field3261 = this.field3278 = this.field3281 = this.field3259 = 0.0F;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V")
    public static void method1508(byte arg0) {
        field3282 = null;
        if (arg0 != 66) {
            method1508((byte) -98);
        }
        field3265 = null;
        field3267 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILjga;)Ljga;")
    public static final class716 method1509(int arg0, class716 arg1) {
        field3262++;
        int var2 = -51 / ((57 - arg0) / 57);
        class716 var3 = arg1 == null ? new class716() : new class716(arg1);
        var3.method4026(26377, 128, 9);
        return var3;
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)V")
    public final void method34(int arg0) {
        this.field3255 = 1.0F;
        field3277++;
        this.field3287 = this.field3252 = class1.field1[arg0 & 0x3FFF];
        this.field3264 = class1.field6[arg0 & 0x3FFF];
        this.field3263 = this.field3253 = this.field3261 = this.field3288 = this.field3278 = this.field3257 = this.field3259 = 0.0F;
        this.field3281 = -this.field3264;
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
    public final void method30(int arg0) {
        field3283++;
        float var2 = class1.field1[arg0 & 0x3FFF];
        float var3 = class1.field6[arg0 & 0x3FFF];
        float var4 = this.field3287;
        float var5 = this.field3263;
        float var6 = this.field3264;
        this.field3287 = this.field3281 * var3 + var2 * var4;
        float var7 = this.field3253;
        this.field3263 = this.field3257 * var3 + var2 * var5;
        this.field3281 = this.field3281 * var2 - (var3 * var4);
        this.field3257 = this.field3257 * var2 - var3 * var5;
        this.field3264 = this.field3252 * var3 + var2 * var6;
        this.field3253 = this.field3259 * var3 + var2 * var7;
        this.field3252 = this.field3252 * var2 - var3 * var6;
        this.field3259 = this.field3259 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(III)V")
    public final void method39(int arg0, int arg1, int arg2) {
        this.field3278 += arg1;
        this.field3259 += arg2;
        this.field3253 += arg0;
        field3274++;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lhba;)V")
    public final void method25(class10 arg0) {
        field3269++;
        class253 var2 = (class253) arg0;
        this.field3264 = var2.field3264;
        this.field3261 = var2.field3261;
        this.field3288 = var2.field3288;
        this.field3253 = var2.field3253;
        this.field3287 = var2.field3287;
        this.field3278 = var2.field3278;
        this.field3259 = var2.field3259;
        this.field3257 = var2.field3257;
        this.field3255 = var2.field3255;
        this.field3252 = var2.field3252;
        this.field3281 = var2.field3281;
        this.field3263 = var2.field3263;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "([I)V")
    public final void method41(int[] arg0) {
        field3276++;
        float var2 = (float) arg0[0] - this.field3253;
        float var3 = (float) arg0[1] - this.field3278;
        float var4 = (float) arg0[2] - this.field3259;
        arg0[1] = (int) (this.field3257 * var4 + this.field3263 * var2 + this.field3255 * var3);
        arg0[0] = (int) (this.field3281 * var4 + this.field3287 * var2 + this.field3261 * var3);
        arg0[2] = (int) (this.field3252 * var4 + this.field3288 * var3 + this.field3264 * var2);
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(III[I)V")
    public final void method36(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field3264 + (float) arg0 * this.field3287 + (float) arg1 * this.field3263 + this.field3253);
        arg3[1] = (int) ((float) arg2 * this.field3288 + (float) arg0 * this.field3261 + (float) arg1 * this.field3255 + this.field3278);
        field3272++;
        arg3[2] = (int) ((float) arg2 * this.field3252 + (float) arg0 * this.field3281 + (float) arg1 * this.field3257 + this.field3259);
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "()Lhba;")
    public final class10 method35() {
        field3256++;
        class253 var1 = new class253();
        var1.field3259 = this.field3259;
        var1.field3278 = this.field3278;
        var1.field3253 = this.field3253;
        var1.field3257 = this.field3257;
        var1.field3255 = this.field3255;
        var1.field3281 = this.field3281;
        var1.field3287 = this.field3287;
        var1.field3264 = this.field3264;
        var1.field3261 = this.field3261;
        var1.field3252 = this.field3252;
        var1.field3263 = this.field3263;
        var1.field3288 = this.field3288;
        return var1;
    }

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "(I)[F")
    public final float[] method1510(int arg0) {
        class476.field6575[13] = 0.0F;
        class476.field6575[8] = this.field3264;
        field3258++;
        class476.field6575[2] = this.field3281;
        if (arg0 <= 45) {
            field3282 = null;
        }
        class476.field6575[10] = this.field3252;
        class476.field6575[9] = this.field3288;
        class476.field6575[1] = this.field3261;
        class476.field6575[14] = 0.0F;
        class476.field6575[0] = this.field3287;
        class476.field6575[4] = this.field3263;
        class476.field6575[6] = this.field3257;
        class476.field6575[12] = 0.0F;
        class476.field6575[5] = this.field3255;
        return class476.field6575;
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V")
    public class253() {
        this.method24();
    }
}
