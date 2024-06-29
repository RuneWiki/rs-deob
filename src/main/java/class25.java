import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class25 extends class151 {

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "Lft;")
    public static class285 field295 = new class285(7, 17);

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "[I")
    public static int[] field311 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "F")
    public float field288;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "F")
    public float field289;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "F")
    public float field290;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "F")
    public float field291;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "F")
    public float field293;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "F")
    public float field296;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "F")
    public float field297;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "F")
    public float field298;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "F")
    public float field302;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "F")
    public float field306;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "F")
    public float field309;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "F")
    public float field313;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)[F")
    public final float[] method130(int arg0) {
        class442.field5718[5] = this.field309;
        class442.field5718[arg0] = this.field313;
        class442.field5718[14] = 0.0F;
        class442.field5718[1] = this.field302;
        class442.field5718[9] = this.field297;
        class442.field5718[4] = this.field289;
        field281++;
        class442.field5718[13] = 0.0F;
        class442.field5718[8] = this.field296;
        class442.field5718[2] = this.field291;
        class442.field5718[10] = this.field298;
        class442.field5718[12] = 0.0F;
        class442.field5718[0] = this.field290;
        return class442.field5718;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()Lq;")
    public final class151 method131() {
        field284++;
        class25 var1 = new class25();
        var1.field302 = this.field302;
        var1.field298 = this.field298;
        var1.field306 = this.field306;
        var1.field297 = this.field297;
        var1.field313 = this.field313;
        var1.field309 = this.field309;
        var1.field291 = this.field291;
        var1.field296 = this.field296;
        var1.field288 = this.field288;
        var1.field293 = this.field293;
        var1.field289 = this.field289;
        var1.field290 = this.field290;
        return var1;
    }

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "([I)V")
    public final void method132(int[] arg0) {
        field310++;
        float var2 = (float) arg0[0] - this.field306;
        float var3 = (float) arg0[1] - this.field288;
        float var4 = (float) arg0[2] - this.field293;
        arg0[1] = (int) (this.field313 * var4 + this.field309 * var3 + this.field289 * var2);
        arg0[0] = (int) (this.field291 * var4 + this.field302 * var3 + this.field290 * var2);
        arg0[2] = (int) (this.field298 * var4 + this.field297 * var3 + this.field296 * var2);
    }

    @OriginalMember(owner = "client!pf", name = "la", descriptor = "(Lq;)V")
    public final void method133(class151 arg0) {
        field301++;
        class25 var2 = (class25) arg0;
        this.field313 = var2.field313;
        this.field306 = var2.field306;
        this.field290 = var2.field290;
        this.field291 = var2.field291;
        this.field293 = var2.field293;
        this.field298 = var2.field298;
        this.field309 = var2.field309;
        this.field297 = var2.field297;
        this.field302 = var2.field302;
        this.field296 = var2.field296;
        this.field288 = var2.field288;
        this.field289 = var2.field289;
    }

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "(III[I)V")
    public final void method134(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field296 + (float) arg0 * this.field290 + (float) arg1 * this.field289);
        arg3[2] = (int) ((float) arg2 * this.field298 + (float) arg0 * this.field291 + (float) arg1 * this.field313);
        field287++;
        arg3[1] = (int) ((float) arg2 * this.field297 + (float) arg0 * this.field302 + (float) arg1 * this.field309);
    }

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "(I)V")
    public final void method135(int arg0) {
        field292++;
        float var2 = class318.field4149[arg0 & 0x3FFF];
        float var3 = class318.field4148[arg0 & 0x3FFF];
        float var4 = this.field302;
        float var5 = this.field309;
        float var6 = this.field297;
        this.field302 = var2 * var4 - (this.field291 * var3);
        float var7 = this.field288;
        this.field309 = var2 * var5 - (this.field313 * var3);
        this.field291 = this.field291 * var2 + var3 * var4;
        this.field313 = this.field313 * var2 + var3 * var5;
        this.field297 = var2 * var6 - (this.field298 * var3);
        this.field288 = var2 * var7 - (this.field293 * var3);
        this.field298 = this.field298 * var2 + var3 * var6;
        this.field293 = this.field293 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "(I)V")
    public final void method136(int arg0) {
        field280++;
        float var2 = class318.field4149[arg0 & 0x3FFF];
        float var3 = class318.field4148[arg0 & 0x3FFF];
        float var4 = this.field290;
        float var5 = this.field289;
        float var6 = this.field296;
        float var7 = this.field306;
        this.field290 = this.field291 * var3 + var2 * var4;
        this.field291 = this.field291 * var2 - (var3 * var4);
        this.field289 = this.field313 * var3 + var2 * var5;
        this.field313 = this.field313 * var2 - (var3 * var5);
        this.field296 = this.field298 * var3 + var2 * var6;
        this.field298 = this.field298 * var2 - (var3 * var6);
        this.field306 = this.field293 * var3 + var2 * var7;
        this.field293 = this.field293 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "()V")
    public final void method137() {
        this.field302 = this.field291 = this.field289 = this.field313 = this.field296 = this.field297 = this.field306 = this.field288 = this.field293 = 0.0F;
        this.field290 = this.field309 = this.field298 = 1.0F;
        field285++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method138(int arg0) {
        field279++;
        this.field309 = 1.0F;
        this.field290 = this.field298 = class318.field4149[arg0 & 0x3FFF];
        this.field296 = class318.field4148[arg0 & 0x3FFF];
        this.field291 = -this.field296;
        this.field289 = this.field306 = this.field302 = this.field297 = this.field288 = this.field313 = this.field293 = 0.0F;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method139(int arg0, int arg1, int arg2) {
        field299++;
        if (arg2 != 27371) {
            field295 = null;
        }
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLq;)V")
    public final void method140(byte arg0, class151 arg1) {
        field307++;
        int var3 = 114 / ((arg0 - 21) / 61);
        class25 var4 = (class25) arg1;
        this.field289 = var4.field302;
        this.field296 = var4.field291;
        this.field290 = var4.field290;
        this.field302 = var4.field289;
        this.field291 = var4.field296;
        this.field309 = var4.field309;
        this.field297 = var4.field313;
        this.field313 = var4.field297;
        this.field306 = -(this.field296 * var4.field293 + this.field290 * var4.field306 + this.field289 * var4.field288);
        this.field298 = var4.field298;
        this.field288 = -(this.field297 * var4.field293 + this.field309 * var4.field288 + this.field302 * var4.field306);
        this.field293 = -(this.field298 * var4.field293 + this.field313 * var4.field288 + this.field291 * var4.field306);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(FIBIFFI)V")
    public final void method141(float arg0, int arg1, byte arg2, int arg3, float arg4, float arg5, int arg6) {
        if (arg1 == 0) {
            this.field298 = 1.0F;
            this.field302 = this.field291 = this.field289 = this.field313 = this.field296 = this.field297 = 0.0F;
            this.field309 = arg3;
            this.field290 = arg6;
        } else {
            float var8 = class318.field4149[arg1 & 0x3FFF];
            float var9 = class318.field4148[arg1 & 0x3FFF];
            this.field290 = (float) arg6 * var8;
            this.field309 = (float) arg3 * var8;
            this.field291 = this.field313 = this.field296 = this.field297 = 0.0F;
            this.field298 = 1.0F;
            this.field302 = (float) arg6 * var9;
            this.field289 = (float) arg3 * -var9;
        }
        if (arg2 != 59) {
            field311 = null;
        }
        field303++;
        this.field306 = arg5;
        this.field293 = arg0;
        this.field288 = arg4;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)[F")
    public final float[] method142(int arg0) {
        class442.field5718[9] = this.field297;
        class442.field5718[6] = this.field313;
        class442.field5718[2] = this.field291;
        class442.field5718[12] = this.field306;
        class442.field5718[14] = this.field293;
        class442.field5718[1] = this.field302;
        if (arg0 <= 12) {
            field311 = null;
        }
        class442.field5718[0] = this.field290;
        class442.field5718[8] = this.field296;
        class442.field5718[5] = this.field309;
        class442.field5718[4] = this.field289;
        class442.field5718[10] = this.field298;
        class442.field5718[13] = this.field288;
        field286++;
        return class442.field5718;
    }

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "(III)V")
    public final void method143(int arg0, int arg1, int arg2) {
        field305++;
        this.field293 += arg2;
        this.field288 += arg1;
        this.field306 += arg0;
    }

    @OriginalMember(owner = "client!pf", name = "pa", descriptor = "(IIIIII)V")
    public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field294++;
        float var7 = class318.field4149[arg3 & 0x3FFF];
        float var8 = class318.field4148[arg3 & 0x3FFF];
        float var9 = class318.field4149[arg4 & 0x3FFF];
        float var10 = class318.field4148[arg4 & 0x3FFF];
        float var11 = class318.field4149[arg5 & 0x3FFF];
        float var12 = class318.field4148[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field313 = -var8;
        this.field289 = var7 * var12;
        this.field309 = var7 * var11;
        this.field297 = var9 * var13 + var10 * var12;
        this.field290 = var9 * var11 + var10 * var14;
        this.field291 = var7 * var10;
        this.field298 = var7 * var9;
        this.field296 = -var10 * var11 + var9 * var14;
        this.field302 = -var9 * var12 + var10 * var13;
        this.field306 = (float) (-arg0) * this.field290 - (float) arg1 * this.field289 - ((float) arg2 * this.field296);
        this.field288 = (float) (-arg0) * this.field302 - ((float) arg1 * this.field309) - (float) arg2 * this.field297;
        this.field293 = (float) (-arg0) * this.field291 - ((float) arg1 * this.field313) - (float) arg2 * this.field298;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[I)V")
    public final void method145(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field296 + (float) arg0 * this.field290 + (float) arg1 * this.field289 + this.field306);
        arg3[2] = (int) ((float) arg2 * this.field298 + (float) arg0 * this.field291 + (float) arg1 * this.field313 + this.field293);
        field304++;
        arg3[1] = (int) ((float) arg2 * this.field297 + (float) arg0 * this.field302 + (float) arg1 * this.field309 + this.field288);
    }

    @OriginalMember(owner = "client!pf", name = "GA", descriptor = "(III)V")
    public final void method146(int arg0, int arg1, int arg2) {
        this.field290 = this.field309 = this.field298 = 1.0F;
        this.field288 = arg1;
        this.field306 = arg0;
        this.field302 = this.field291 = this.field289 = this.field313 = this.field296 = this.field297 = 0.0F;
        this.field293 = arg2;
        field283++;
    }

    @OriginalMember(owner = "client!pf", name = "XA", descriptor = "(I)V")
    public final void method147(int arg0) {
        field308++;
        this.field290 = 1.0F;
        this.field309 = this.field298 = class318.field4149[arg0 & 0x3FFF];
        this.field313 = class318.field4148[arg0 & 0x3FFF];
        this.field289 = this.field296 = this.field306 = this.field302 = this.field288 = this.field291 = this.field293 = 0.0F;
        this.field297 = -this.field313;
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
    public static void method148(int arg0) {
        field295 = null;
        field311 = null;
        if (arg0 < 96) {
            field312 = -37;
        }
    }

    @OriginalMember(owner = "client!pf", name = "ra", descriptor = "(I)V")
    public final void method149(int arg0) {
        field300++;
        this.field298 = 1.0F;
        this.field290 = this.field309 = class318.field4149[arg0 & 0x3FFF];
        this.field302 = class318.field4148[arg0 & 0x3FFF];
        this.field296 = this.field306 = this.field297 = this.field288 = this.field291 = this.field313 = this.field293 = 0.0F;
        this.field289 = -this.field302;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class25() {
        this.method137();
    }
}
