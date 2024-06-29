import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class227 extends class414 {

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Le;")
    public static class369 field3331 = new class369(1);

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "Lri;")
    public static class73 field3360 = new class73(20, 5);

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field3364 = new String[100];

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "[I")
    public static int[] field3365 = new int[100];

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "Llt;")
    public static class475 field3363 = new class475(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "F")
    public float field3329;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "F")
    public float field3334;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "F")
    public float field3335;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "F")
    public float field3338;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "F")
    public float field3341;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "F")
    public float field3344;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "F")
    public float field3346;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "F")
    public float field3347;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "F")
    public float field3348;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "F")
    public float field3349;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "F")
    public float field3352;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "F")
    public float field3355;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "F")
    public static float field3362;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)[F")
    public final float[] method1550(byte arg0) {
        class451.field6714[8] = this.field3349;
        if (arg0 < 85) {
            this.field3355 = -1.2655257F;
        }
        class451.field6714[6] = this.field3352;
        class451.field6714[10] = this.field3338;
        class451.field6714[1] = this.field3346;
        class451.field6714[14] = this.field3344;
        class451.field6714[4] = this.field3334;
        class451.field6714[2] = this.field3329;
        class451.field6714[9] = this.field3335;
        field3351++;
        class451.field6714[13] = this.field3348;
        class451.field6714[5] = this.field3355;
        class451.field6714[12] = this.field3341;
        class451.field6714[0] = this.field3347;
        return class451.field6714;
    }

    @OriginalMember(owner = "client!dj", name = "ZA", descriptor = "(III)V")
    public final void method901(int arg0, int arg1, int arg2) {
        this.field3341 += arg0;
        this.field3348 += arg1;
        field3332++;
        this.field3344 += arg2;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
    public final void method906(int arg0) {
        field3359++;
        float var2 = class23.field249[arg0 & 0x3FFF];
        float var3 = class23.field250[arg0 & 0x3FFF];
        float var4 = this.field3347;
        float var5 = this.field3334;
        float var6 = this.field3349;
        this.field3347 = this.field3329 * var3 + var2 * var4;
        float var7 = this.field3341;
        this.field3329 = this.field3329 * var2 - var3 * var4;
        this.field3334 = this.field3352 * var3 + var2 * var5;
        this.field3352 = this.field3352 * var2 - (var3 * var5);
        this.field3349 = this.field3338 * var3 + var2 * var6;
        this.field3341 = this.field3344 * var3 + var2 * var7;
        this.field3338 = this.field3338 * var2 - (var3 * var6);
        this.field3344 = this.field3344 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)[F")
    public final float[] method1551(int arg0) {
        class451.field6714[9] = this.field3335;
        class451.field6714[5] = this.field3355;
        field3358++;
        class451.field6714[6] = this.field3352;
        class451.field6714[2] = this.field3329;
        class451.field6714[13] = 0.0F;
        class451.field6714[8] = this.field3349;
        class451.field6714[0] = this.field3347;
        class451.field6714[4] = this.field3334;
        class451.field6714[12] = 0.0F;
        class451.field6714[1] = this.field3346;
        class451.field6714[10] = this.field3338;
        class451.field6714[14] = arg0;
        return class451.field6714;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBILdu;)V")
    public static final void method1552(int arg0, int arg1, byte arg2, int arg3, class237 arg4) {
        field3333++;
        long var5 = (long) (arg1 << 14 | arg3 << 28 | arg0);
        class84 var7 = (class84) class176.field2591.method2605(false, var5);
        if (var7 == null) {
            class84 var8 = new class84();
            class176.field2591.method2606(var8, var5, 0);
            var8.field1291.method809(arg4, false);
            return;
        }
        class339 var9 = class294.field4196.method453(0, arg4.field3491);
        int var10 = var9.field4813;
        if (var9.field4829 == 1) {
            var10 = (arg4.field3494 + 1) * var10;
        }
        class237 var11 = (class237) var7.field1291.method816(arg2 + 167);
        if (arg2 != -62) {
            return;
        }
        while (var11 != null) {
            class339 var12 = class294.field4196.method453(0, var11.field3491);
            int var13 = var12.field4813;
            if (var12.field4829 == 1) {
                var13 = (var11.field3494 + 1) * var13;
            }
            if (var10 > var13) {
                class229.method1571(arg4, 127, var11);
                return;
            }
            var11 = (class237) var7.field1291.method812(114);
        }
        var7.field1291.method809(arg4, false);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()Lia;")
    public final class414 method910() {
        field3340++;
        class227 var1 = new class227();
        var1.field3355 = this.field3355;
        var1.field3348 = this.field3348;
        var1.field3347 = this.field3347;
        var1.field3346 = this.field3346;
        var1.field3335 = this.field3335;
        var1.field3352 = this.field3352;
        var1.field3344 = this.field3344;
        var1.field3349 = this.field3349;
        var1.field3341 = this.field3341;
        var1.field3334 = this.field3334;
        var1.field3329 = this.field3329;
        var1.field3338 = this.field3338;
        return var1;
    }

    @OriginalMember(owner = "client!dj", name = "YA", descriptor = "(I)V")
    public final void method907(int arg0) {
        field3354++;
        this.field3347 = 1.0F;
        this.field3355 = this.field3338 = class23.field249[arg0 & 0x3FFF];
        this.field3352 = class23.field250[arg0 & 0x3FFF];
        this.field3334 = this.field3349 = this.field3341 = this.field3346 = this.field3348 = this.field3329 = this.field3344 = 0.0F;
        this.field3335 = -this.field3352;
    }

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "(III[I)V")
    public final void method912(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field3349 + (float) arg0 * this.field3347 + (float) arg1 * this.field3334);
        arg3[1] = (int) ((float) arg2 * this.field3335 + (float) arg0 * this.field3346 + (float) arg1 * this.field3355);
        field3350++;
        arg3[2] = (int) ((float) arg2 * this.field3338 + (float) arg0 * this.field3329 + (float) arg1 * this.field3352);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III[I)V")
    public final void method908(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field3335 + (float) arg0 * this.field3346 + (float) arg1 * this.field3355 + this.field3348);
        arg3[2] = (int) ((float) arg2 * this.field3338 + (float) arg0 * this.field3329 + (float) arg1 * this.field3352 + this.field3344);
        field3343++;
        arg3[0] = (int) ((float) arg2 * this.field3349 + (float) arg0 * this.field3347 + (float) arg1 * this.field3334 + this.field3341);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILia;)V")
    public final void method1553(int arg0, class414 arg1) {
        field3339++;
        class227 var3 = (class227) arg1;
        this.field3347 = var3.field3347;
        this.field3334 = var3.field3346;
        this.field3349 = var3.field3329;
        this.field3329 = var3.field3349;
        this.field3355 = var3.field3355;
        this.field3346 = var3.field3334;
        this.field3335 = var3.field3352;
        this.field3352 = var3.field3335;
        this.field3341 = -(this.field3349 * var3.field3344 + this.field3347 * var3.field3341 + this.field3334 * var3.field3348);
        this.field3338 = var3.field3338;
        this.field3348 = -(this.field3335 * var3.field3344 + this.field3355 * var3.field3348 + this.field3346 * var3.field3341);
        if (arg0 <= 7) {
            this.method1554(69, -1.1604583F, -3.3408704F, -43, 85, -0.41679126F, 119);
        }
        this.field3344 = -(this.field3338 * var3.field3344 + this.field3352 * var3.field3348 + this.field3329 * var3.field3341);
    }

    @OriginalMember(owner = "client!dj", name = "HA", descriptor = "()V")
    public final void method902() {
        this.field3346 = this.field3329 = this.field3334 = this.field3352 = this.field3349 = this.field3335 = this.field3341 = this.field3348 = this.field3344 = 0.0F;
        this.field3347 = this.field3355 = this.field3338 = 1.0F;
        field3342++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IFFIIFI)V")
    public final void method1554(int arg0, float arg1, float arg2, int arg3, int arg4, float arg5, int arg6) {
        field3353++;
        if (arg4 == arg6) {
            this.field3346 = this.field3329 = this.field3334 = this.field3352 = this.field3349 = this.field3335 = 0.0F;
            this.field3355 = arg0;
            this.field3338 = 1.0F;
            this.field3347 = arg3;
        } else {
            float var8 = class23.field249[arg4 & 0x3FFF];
            float var9 = class23.field250[arg4 & 0x3FFF];
            this.field3346 = (float) arg3 * var9;
            this.field3334 = (float) arg0 * -var9;
            this.field3347 = (float) arg3 * var8;
            this.field3329 = this.field3352 = this.field3349 = this.field3335 = 0.0F;
            this.field3338 = 1.0F;
            this.field3355 = (float) arg0 * var8;
        }
        this.field3344 = arg1;
        this.field3348 = arg5;
        this.field3341 = arg2;
    }

    @OriginalMember(owner = "client!dj", name = "ma", descriptor = "(I)V")
    public final void method911(int arg0) {
        field3356++;
        this.field3338 = 1.0F;
        this.field3347 = this.field3355 = class23.field249[arg0 & 0x3FFF];
        this.field3346 = class23.field250[arg0 & 0x3FFF];
        this.field3334 = -this.field3346;
        this.field3349 = this.field3341 = this.field3335 = this.field3348 = this.field3329 = this.field3352 = this.field3344 = 0.0F;
    }

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "(IIIIII)V")
    public final void method900(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3357++;
        float var7 = class23.field249[arg3 & 0x3FFF];
        float var8 = class23.field250[arg3 & 0x3FFF];
        float var9 = class23.field249[arg4 & 0x3FFF];
        float var10 = class23.field250[arg4 & 0x3FFF];
        float var11 = class23.field249[arg5 & 0x3FFF];
        float var12 = class23.field250[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3334 = var7 * var12;
        this.field3338 = var7 * var9;
        this.field3335 = var9 * var13 + var10 * var12;
        this.field3352 = -var8;
        this.field3347 = var9 * var11 + var10 * var14;
        this.field3349 = -var10 * var11 + var9 * var14;
        this.field3355 = var7 * var11;
        this.field3329 = var7 * var10;
        this.field3346 = -var9 * var12 + var10 * var13;
        this.field3344 = (float) (-arg0) * this.field3329 - ((float) arg1 * this.field3352) - (float) arg2 * this.field3338;
        this.field3341 = (float) (-arg0) * this.field3347 - (float) arg1 * this.field3334 - (float) arg2 * this.field3349;
        this.field3348 = (float) (-arg0) * this.field3346 - (float) arg1 * this.field3355 - (float) arg2 * this.field3335;
    }

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "(I)V")
    public final void method914(int arg0) {
        field3361++;
        this.field3355 = 1.0F;
        this.field3347 = this.field3338 = class23.field249[arg0 & 0x3FFF];
        this.field3349 = class23.field250[arg0 & 0x3FFF];
        this.field3329 = -this.field3349;
        this.field3334 = this.field3341 = this.field3346 = this.field3335 = this.field3348 = this.field3352 = this.field3344 = 0.0F;
    }

    @OriginalMember(owner = "client!dj", name = "ba", descriptor = "(Lia;)V")
    public final void method903(class414 arg0) {
        field3330++;
        class227 var2 = (class227) arg0;
        this.field3352 = var2.field3352;
        this.field3334 = var2.field3334;
        this.field3347 = var2.field3347;
        this.field3355 = var2.field3355;
        this.field3338 = var2.field3338;
        this.field3344 = var2.field3344;
        this.field3346 = var2.field3346;
        this.field3349 = var2.field3349;
        this.field3329 = var2.field3329;
        this.field3348 = var2.field3348;
        this.field3341 = var2.field3341;
        this.field3335 = var2.field3335;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class227() {
        this.method902();
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
    public static void method1555(byte arg0) {
        field3360 = null;
        if (arg0 != 89) {
            method1555((byte) 117);
        }
        field3364 = null;
        field3331 = null;
        field3365 = null;
        field3363 = null;
    }

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "([I)V")
    public final void method909(int[] arg0) {
        field3345++;
        float var2 = (float) arg0[0] - this.field3341;
        float var3 = (float) arg0[1] - this.field3348;
        float var4 = (float) arg0[2] - this.field3344;
        arg0[0] = (int) (this.field3329 * var4 + this.field3347 * var2 + this.field3346 * var3);
        arg0[2] = (int) (this.field3338 * var4 + this.field3349 * var2 + this.field3335 * var3);
        arg0[1] = (int) (this.field3352 * var4 + this.field3355 * var3 + this.field3334 * var2);
    }

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "(III)V")
    public final void method913(int arg0, int arg1, int arg2) {
        field3337++;
        this.field3344 = arg2;
        this.field3341 = arg0;
        this.field3348 = arg1;
        this.field3347 = this.field3355 = this.field3338 = 1.0F;
        this.field3346 = this.field3329 = this.field3334 = this.field3352 = this.field3349 = this.field3335 = 0.0F;
    }

    @OriginalMember(owner = "client!dj", name = "na", descriptor = "(I)V")
    public final void method905(int arg0) {
        field3336++;
        float var2 = class23.field249[arg0 & 0x3FFF];
        float var3 = class23.field250[arg0 & 0x3FFF];
        float var4 = this.field3346;
        float var5 = this.field3355;
        float var6 = this.field3335;
        float var7 = this.field3348;
        this.field3346 = var2 * var4 - (this.field3329 * var3);
        this.field3355 = var2 * var5 - this.field3352 * var3;
        this.field3329 = this.field3329 * var2 + var3 * var4;
        this.field3335 = var2 * var6 - this.field3338 * var3;
        this.field3352 = this.field3352 * var2 + var3 * var5;
        this.field3338 = this.field3338 * var2 + var3 * var6;
        this.field3348 = var2 * var7 - this.field3344 * var3;
        this.field3344 = this.field3344 * var2 + var3 * var7;
    }
}
