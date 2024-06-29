import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class173 extends class723 {

    @OriginalMember(owner = "client!js", name = "c", descriptor = "F")
    public float field2328;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "F")
    public float field2331;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "F")
    public float field2332;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "F")
    public float field2335;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "F")
    public float field2339;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "F")
    public float field2340;

    @OriginalMember(owner = "client!js", name = "r", descriptor = "F")
    public float field2343;

    @OriginalMember(owner = "client!js", name = "A", descriptor = "F")
    public float field2352;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "F")
    public float field2364;

    @OriginalMember(owner = "client!js", name = "S", descriptor = "F")
    public float field2370;

    @OriginalMember(owner = "client!js", name = "U", descriptor = "F")
    public float field2372;

    @OriginalMember(owner = "client!js", name = "ab", descriptor = "F")
    public float field2378;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!js", name = "s", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!js", name = "t", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!js", name = "u", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!js", name = "v", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!js", name = "w", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!js", name = "x", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!js", name = "y", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!js", name = "B", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!js", name = "C", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!js", name = "D", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!js", name = "E", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!js", name = "F", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!js", name = "G", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!js", name = "H", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!js", name = "Q", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!js", name = "R", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!js", name = "T", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!js", name = "V", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!js", name = "W", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!js", name = "X", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!js", name = "Y", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!js", name = "Z", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "[I")
    public static int[] field2366;

    @OriginalMember(owner = "client!js", name = "P", descriptor = "[Ltba;")
    public static class320[] field2367;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "(I)V")
    public final void method844(int arg0) {
        field2354++;
        float var2 = class162.field2244[arg0 & 0x3FFF];
        float var3 = class162.field2243[arg0 & 0x3FFF];
        float var4 = this.field2378;
        float var5 = this.field2364;
        float var6 = this.field2335;
        this.field2378 = var2 * var4 - this.field2332 * var3;
        float var7 = this.field2340;
        this.field2364 = var2 * var5 - this.field2339 * var3;
        this.field2332 = this.field2332 * var2 + var3 * var4;
        this.field2339 = this.field2339 * var2 + var3 * var5;
        this.field2335 = var2 * var6 - (this.field2331 * var3);
        this.field2340 = var2 * var7 - this.field2328 * var3;
        this.field2331 = this.field2331 * var2 + var3 * var6;
        this.field2328 = this.field2328 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIII)V")
    public final void method853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2361++;
        float var7 = class162.field2244[arg3 & 0x3FFF];
        float var8 = class162.field2243[arg3 & 0x3FFF];
        float var9 = class162.field2244[arg4 & 0x3FFF];
        float var10 = class162.field2243[arg4 & 0x3FFF];
        float var11 = class162.field2244[arg5 & 0x3FFF];
        float var12 = class162.field2243[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field2331 = var7 * var9;
        this.field2352 = var7 * var12;
        this.field2372 = var9 * var11 + var10 * var14;
        this.field2364 = var7 * var11;
        this.field2332 = var7 * var10;
        this.field2370 = -var10 * var11 + var9 * var14;
        this.field2335 = var9 * var13 + var10 * var12;
        this.field2378 = -var9 * var12 + var10 * var13;
        this.field2339 = -var8;
        this.field2343 = (float) (-arg0) * this.field2372 - ((float) arg1 * this.field2352) - ((float) arg2 * this.field2370);
        this.field2328 = (float) (-arg0) * this.field2332 - (float) arg1 * this.field2339 - (float) arg2 * this.field2331;
        this.field2340 = (float) (-arg0) * this.field2378 - ((float) arg1 * this.field2364) - (float) arg2 * this.field2335;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "()V")
    public final void method860() {
        field2345++;
        this.field2372 = this.field2364 = this.field2331 = 1.0F;
        this.field2378 = this.field2332 = this.field2352 = this.field2339 = this.field2370 = this.field2335 = this.field2343 = this.field2340 = this.field2328 = 0.0F;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "()Luha;")
    public final class723 method859() {
        field2374++;
        class173 var1 = new class173();
        var1.field2332 = this.field2332;
        var1.field2372 = this.field2372;
        var1.field2335 = this.field2335;
        var1.field2378 = this.field2378;
        var1.field2340 = this.field2340;
        var1.field2339 = this.field2339;
        var1.field2370 = this.field2370;
        var1.field2364 = this.field2364;
        var1.field2352 = this.field2352;
        var1.field2331 = this.field2331;
        var1.field2328 = this.field2328;
        var1.field2343 = this.field2343;
        return var1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Luha;)V")
    public final void method864(class723 arg0) {
        field2330++;
        class173 var2 = (class173) arg0;
        this.field2378 = var2.field2378;
        this.field2372 = var2.field2372;
        this.field2343 = var2.field2343;
        this.field2335 = var2.field2335;
        this.field2339 = var2.field2339;
        this.field2331 = var2.field2331;
        this.field2352 = var2.field2352;
        this.field2328 = var2.field2328;
        this.field2332 = var2.field2332;
        this.field2370 = var2.field2370;
        this.field2340 = var2.field2340;
        this.field2364 = var2.field2364;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([FI)[F")
    public final float[] method1077(float[] arg0, int arg1) {
        arg0[4] = this.field2378;
        field2329++;
        if (arg1 >= -40) {
            this.method871(89, 18, 24, null);
        }
        arg0[7] = this.field2340;
        arg0[1] = this.field2352;
        arg0[2] = this.field2370;
        arg0[0] = this.field2372;
        arg0[6] = this.field2335;
        arg0[5] = this.field2364;
        arg0[3] = this.field2343;
        return arg0;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Luha;I)V")
    public final void method1078(class723 arg0, int arg1) {
        field2346++;
        class173 var3 = (class173) arg0;
        this.field2378 = var3.field2378;
        this.field2328 = 0.0F;
        this.field2352 = var3.field2352;
        this.field2340 = 0.0F;
        this.field2370 = var3.field2370;
        this.field2343 = 0.0F;
        this.field2339 = var3.field2339;
        this.field2364 = var3.field2364;
        this.field2331 = var3.field2331;
        if (arg1 != 16383) {
            field2366 = null;
        }
        this.field2335 = var3.field2335;
        this.field2372 = var3.field2372;
        this.field2332 = var3.field2332;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B[F)[F")
    public final float[] method1079(byte arg0, float[] arg1) {
        arg1[8] = this.field2370;
        arg1[4] = this.field2352;
        arg1[0] = this.field2372;
        if (arg0 != 104) {
            return null;
        }
        arg1[6] = this.field2339;
        arg1[1] = this.field2378;
        arg1[13] = this.field2340;
        arg1[10] = this.field2331;
        arg1[15] = 1.0F;
        arg1[5] = this.field2364;
        field2342++;
        arg1[3] = 0.0F;
        arg1[12] = this.field2343;
        arg1[2] = this.field2332;
        arg1[14] = this.field2328;
        arg1[9] = this.field2335;
        arg1[7] = 0.0F;
        arg1[11] = 0.0F;
        return arg1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(FFFFBFFFFF)V")
    public final void method1080(float arg0, float arg1, float arg2, float arg3, byte arg4, float arg5, float arg6, float arg7, float arg8, float arg9) {
        if (arg4 < 15) {
            return;
        }
        this.field2335 = arg3;
        this.field2378 = arg1;
        this.field2343 = 0.0F;
        this.field2328 = 0.0F;
        this.field2340 = 0.0F;
        this.field2370 = arg9;
        this.field2364 = arg0;
        this.field2331 = arg5;
        this.field2332 = arg2;
        field2360++;
        this.field2352 = arg8;
        this.field2339 = arg7;
        this.field2372 = arg6;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(FFFI)V")
    public final void method1081(float arg0, float arg1, float arg2, int arg3) {
        this.field2378 = this.field2332 = this.field2352 = this.field2339 = this.field2370 = this.field2335 = 0.0F;
        this.field2340 = arg0;
        this.field2372 = this.field2364 = this.field2331 = arg3;
        field2358++;
        this.field2343 = arg2;
        this.field2328 = arg1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIFIFIF)V")
    public final void method1082(int arg0, int arg1, float arg2, int arg3, float arg4, int arg5, float arg6) {
        if (arg1 == 0) {
            this.field2372 = (arg3 * 2);
            this.field2378 = this.field2332 = this.field2352 = this.field2339 = this.field2370 = this.field2335 = 0.0F;
            this.field2364 = (arg5 * 2);
            this.field2343 = (float) (-arg3) + arg2;
            this.field2328 = arg6;
            this.field2331 = 1.0F;
            this.field2340 = arg4 - (float) arg5;
        } else {
            float var8 = class162.field2244[arg1 & 0x3FFF];
            float var9 = class162.field2243[arg1 & 0x3FFF];
            this.field2378 = var9 * 2.0F * (float) arg3;
            this.field2332 = this.field2339 = this.field2370 = this.field2335 = 0.0F;
            this.field2328 = arg6;
            this.field2352 = var9 * -2.0F * (float) arg5;
            this.field2364 = var8 * 2.0F * (float) arg5;
            this.field2340 = (var9 * -0.5F - var8 * 0.5F) * (float) (arg5 * 2) + arg4;
            this.field2331 = 1.0F;
            this.field2343 = (var9 * 0.5F - (var8 * 0.5F)) * (float) (arg3 * 2) + arg2;
            this.field2372 = var8 * 2.0F * (float) arg3;
        }
        field2353++;
        if (arg0 != 2) {
            this.field2328 = -1.0922904F;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILuha;)V")
    public final void method1083(int arg0, class723 arg1) {
        field2375++;
        class173 var3 = (class173) arg1;
        float var4 = this.field2372;
        float var5 = this.field2378;
        float var6 = this.field2352;
        float var7 = this.field2364;
        float var8 = this.field2370;
        float var9 = this.field2335;
        int var10 = 118 / ((-arg0 - 68) / 51);
        float var11 = this.field2343;
        this.field2372 = this.field2332 * var3.field2370 + var3.field2372 * var4 + var3.field2352 * var5;
        float var12 = this.field2340;
        this.field2378 = this.field2332 * var3.field2335 + var3.field2378 * var4 + var3.field2364 * var5;
        this.field2332 = this.field2332 * var3.field2331 + var3.field2339 * var5 + var3.field2332 * var4;
        this.field2352 = this.field2339 * var3.field2370 + var3.field2372 * var6 + var3.field2352 * var7;
        this.field2364 = this.field2339 * var3.field2335 + var3.field2378 * var6 + var3.field2364 * var7;
        this.field2339 = this.field2339 * var3.field2331 + var3.field2339 * var7 + var3.field2332 * var6;
        this.field2370 = this.field2331 * var3.field2370 + var3.field2372 * var8 + var3.field2352 * var9;
        this.field2335 = this.field2331 * var3.field2335 + var3.field2378 * var8 + var3.field2364 * var9;
        this.field2340 = this.field2328 * var3.field2335 + var3.field2378 * var11 + var3.field2364 * var12 + var3.field2340;
        this.field2331 = this.field2331 * var3.field2331 + var3.field2339 * var9 + var3.field2332 * var8;
        this.field2343 = this.field2328 * var3.field2370 + var3.field2372 * var11 + var3.field2352 * var12 + var3.field2343;
        this.field2328 = this.field2328 * var3.field2331 + var3.field2339 * var12 + var3.field2332 * var11 + var3.field2328;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([FB)[F")
    public final float[] method1084(float[] arg0, byte arg1) {
        field2368++;
        arg0[6] = this.field2335;
        arg0[2] = this.field2370;
        arg0[10] = this.field2331;
        arg0[12] = 0.0F;
        int var3 = 75 / ((arg1 - 32) / 40);
        arg0[7] = 0.0F;
        arg0[15] = 0.0F;
        arg0[8] = this.field2332;
        arg0[14] = 0.0F;
        arg0[11] = 0.0F;
        arg0[1] = this.field2352;
        arg0[0] = this.field2372;
        arg0[13] = 0.0F;
        arg0[3] = 0.0F;
        arg0[9] = this.field2339;
        arg0[4] = this.field2378;
        arg0[5] = this.field2364;
        return arg0;
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
    public final void method873(int arg0) {
        field2356++;
        float var2 = class162.field2244[arg0 & 0x3FFF];
        float var3 = class162.field2243[arg0 & 0x3FFF];
        float var4 = this.field2372;
        float var5 = this.field2352;
        float var6 = this.field2370;
        this.field2372 = this.field2332 * var3 + var2 * var4;
        float var7 = this.field2343;
        this.field2332 = this.field2332 * var2 - (var3 * var4);
        this.field2352 = this.field2339 * var3 + var2 * var5;
        this.field2339 = this.field2339 * var2 - (var3 * var5);
        this.field2370 = this.field2331 * var3 + var2 * var6;
        this.field2331 = this.field2331 * var2 - (var3 * var6);
        this.field2343 = this.field2328 * var3 + var2 * var7;
        this.field2328 = this.field2328 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Luha;B)V")
    public final void method1085(class723 arg0, byte arg1) {
        field2377++;
        class173 var3 = (class173) arg0;
        this.field2370 = var3.field2332;
        this.field2352 = var3.field2378;
        this.field2372 = var3.field2372;
        this.field2378 = var3.field2352;
        this.field2332 = var3.field2370;
        this.field2335 = var3.field2339;
        this.field2364 = var3.field2364;
        this.field2331 = var3.field2331;
        this.field2339 = var3.field2335;
        if (arg1 != -87) {
            this.field2332 = 0.38222146F;
        }
        this.field2343 = -(this.field2370 * var3.field2328 + this.field2372 * var3.field2343 + this.field2352 * var3.field2340);
        this.field2340 = -(this.field2335 * var3.field2328 + this.field2378 * var3.field2343 + this.field2364 * var3.field2340);
        this.field2328 = -(this.field2331 * var3.field2328 + this.field2339 * var3.field2340 + this.field2332 * var3.field2343);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III)V")
    public final void method848(int arg0, int arg1, int arg2) {
        this.field2378 = this.field2332 = this.field2352 = this.field2339 = this.field2370 = this.field2335 = 0.0F;
        this.field2340 = arg1;
        this.field2372 = this.field2364 = this.field2331 = 1.0F;
        this.field2328 = arg2;
        this.field2343 = arg0;
        field2338++;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(FZFF)V")
    public final void method1086(float arg0, boolean arg1, float arg2, float arg3) {
        this.field2364 *= arg3;
        this.field2339 *= arg0;
        field2365++;
        this.field2343 *= arg2;
        this.field2331 *= arg0;
        this.field2332 *= arg0;
        this.field2328 *= arg0;
        if (!arg1) {
            return;
        }
        this.field2378 *= arg3;
        this.field2335 *= arg3;
        this.field2372 *= arg2;
        this.field2340 *= arg3;
        this.field2352 *= arg2;
        this.field2370 *= arg2;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I[F)[F")
    public final float[] method1087(int arg0, float[] arg1) {
        arg1[1] = this.field2378;
        arg1[6] = 0.0F;
        arg1[15] = 1.0F;
        arg1[4] = this.field2352;
        field2363++;
        arg1[13] = 0.0F;
        arg1[2] = arg0;
        arg1[10] = this.field2328;
        arg1[9] = this.field2340;
        arg1[11] = 0.0F;
        arg1[5] = this.field2364;
        arg1[0] = this.field2372;
        arg1[7] = 0.0F;
        arg1[3] = 0.0F;
        arg1[12] = 0.0F;
        arg1[14] = 0.0F;
        arg1[8] = this.field2343;
        return arg1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(FBFF)F")
    public final float method1088(float arg0, byte arg1, float arg2, float arg3) {
        if (arg1 <= 32) {
            this.method861(38, -112, 1, null);
        }
        field2359++;
        return this.field2331 * arg3 + this.field2339 * arg2 + this.field2332 * arg0 + this.field2328;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(FFIF)F")
    public final float method1089(float arg0, float arg1, int arg2, float arg3) {
        field2349++;
        if (arg2 >= -47) {
            this.method1094(0.5603547F, 0.29236314F, 0.50422066F, -124);
        }
        return this.field2370 * arg1 + this.field2372 * arg0 + this.field2352 * arg3 + this.field2343;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(B[F)[F")
    public final float[] method1090(byte arg0, float[] arg1) {
        field2351++;
        arg1[14] = 0.0F;
        arg1[4] = this.field2378;
        arg1[0] = this.field2372;
        arg1[6] = this.field2335;
        if (arg0 != -116) {
            return null;
        }
        arg1[3] = this.field2343;
        arg1[7] = this.field2340;
        arg1[2] = this.field2370;
        arg1[11] = this.field2328;
        arg1[1] = this.field2352;
        arg1[5] = this.field2364;
        arg1[8] = this.field2332;
        arg1[10] = this.field2331;
        arg1[9] = this.field2339;
        arg1[13] = 0.0F;
        arg1[15] = 1.0F;
        arg1[12] = 0.0F;
        return arg1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([I)V")
    public final void method870(int[] arg0) {
        field2362++;
        float var2 = (float) arg0[0] - this.field2343;
        float var3 = (float) arg0[1] - this.field2340;
        float var4 = (float) arg0[2] - this.field2328;
        arg0[1] = (int) (this.field2339 * var4 + this.field2364 * var3 + this.field2352 * var2);
        arg0[0] = (int) (this.field2332 * var4 + this.field2378 * var3 + this.field2372 * var2);
        arg0[2] = (int) (this.field2331 * var4 + this.field2370 * var2 + this.field2335 * var3);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(FFFI)V")
    public final void method1091(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 != 1) {
            return;
        }
        this.field2378 = 0.0F;
        this.field2343 = 0.0F;
        this.field2372 = arg2;
        field2337++;
        this.field2340 = 0.0F;
        this.field2370 = 0.0F;
        this.field2331 = arg1;
        this.field2339 = 0.0F;
        this.field2332 = 0.0F;
        this.field2352 = 0.0F;
        this.field2328 = 0.0F;
        this.field2364 = arg0;
        this.field2335 = 0.0F;
    }

    @OriginalMember(owner = "client!js", name = "e", descriptor = "(I)V")
    public final void method843(int arg0) {
        this.field2372 = 1.0F;
        field2341++;
        this.field2364 = this.field2331 = class162.field2244[arg0 & 0x3FFF];
        this.field2339 = class162.field2243[arg0 & 0x3FFF];
        this.field2335 = -this.field2339;
        this.field2352 = this.field2370 = this.field2343 = this.field2378 = this.field2340 = this.field2332 = this.field2328 = 0.0F;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public final void method846(int arg0) {
        field2336++;
        this.field2331 = 1.0F;
        this.field2372 = this.field2364 = class162.field2244[arg0 & 0x3FFF];
        this.field2378 = class162.field2243[arg0 & 0x3FFF];
        this.field2370 = this.field2343 = this.field2335 = this.field2340 = this.field2332 = this.field2339 = this.field2328 = 0.0F;
        this.field2352 = -this.field2378;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(III)V")
    public final void method851(int arg0, int arg1, int arg2) {
        this.field2343 += arg0;
        this.field2340 += arg1;
        this.field2328 += arg2;
        field2355++;
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(I)V")
    public final void method866(int arg0) {
        field2376++;
        this.field2364 = 1.0F;
        this.field2372 = this.field2331 = class162.field2244[arg0 & 0x3FFF];
        this.field2370 = class162.field2243[arg0 & 0x3FFF];
        this.field2352 = this.field2343 = this.field2378 = this.field2335 = this.field2340 = this.field2339 = this.field2328 = 0.0F;
        this.field2332 = -this.field2370;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
    public static void method1092(byte arg0) {
        int var1 = -123 % ((-arg0 - 31) / 52);
        field2367 = null;
        field2366 = null;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(III[I)V")
    public final void method872(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field2331 + (float) arg0 * this.field2332 + (float) arg1 * this.field2339);
        field2344++;
        arg3[1] = (int) ((float) arg2 * this.field2335 + (float) arg0 * this.field2378 + (float) arg1 * this.field2364);
        arg3[0] = (int) ((float) arg2 * this.field2370 + (float) arg0 * this.field2372 + (float) arg1 * this.field2352);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
    public final void method847(int arg0) {
        field2348++;
        float var2 = class162.field2244[arg0 & 0x3FFF];
        float var3 = class162.field2243[arg0 & 0x3FFF];
        float var4 = this.field2372;
        float var5 = this.field2352;
        float var6 = this.field2370;
        float var7 = this.field2343;
        this.field2372 = var2 * var4 - this.field2378 * var3;
        this.field2352 = var2 * var5 - (this.field2364 * var3);
        this.field2378 = this.field2378 * var2 + var3 * var4;
        this.field2364 = this.field2364 * var2 + var3 * var5;
        this.field2370 = var2 * var6 - this.field2335 * var3;
        this.field2343 = var2 * var7 - this.field2340 * var3;
        this.field2335 = this.field2335 * var2 + var3 * var6;
        this.field2340 = this.field2340 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(III[I)V")
    public final void method871(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg1 - this.field2340);
        field2350++;
        int var6 = (int) ((float) arg2 - this.field2328);
        int var7 = (int) ((float) arg0 - this.field2343);
        arg3[1] = (int) ((float) var6 * this.field2339 + (float) var5 * this.field2364 + (float) var7 * this.field2352);
        arg3[2] = (int) ((float) var6 * this.field2331 + (float) var5 * this.field2335 + (float) var7 * this.field2370);
        arg3[0] = (int) ((float) var6 * this.field2332 + (float) var5 * this.field2378 + (float) var7 * this.field2372);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III[I)V")
    public final void method861(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field2331 + (float) arg0 * this.field2332 + (float) arg1 * this.field2339 + this.field2328);
        arg3[1] = (int) ((float) arg2 * this.field2335 + (float) arg0 * this.field2378 + (float) arg1 * this.field2364 + this.field2340);
        field2357++;
        arg3[0] = (int) ((float) arg2 * this.field2370 + (float) arg0 * this.field2372 + (float) arg1 * this.field2352 + this.field2343);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(FFBF)V")
    public final void method1093(float arg0, float arg1, byte arg2, float arg3) {
        if (arg2 != -46) {
            this.method846(-8);
        }
        field2373++;
        this.field2340 += arg0;
        this.field2343 += arg3;
        this.field2328 += arg1;
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(FFFI)F")
    public final float method1094(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 != -20995) {
            this.method1083(22, null);
        }
        field2347++;
        return this.field2335 * arg2 + this.field2378 * arg1 + this.field2364 * arg0 + this.field2340;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(B)V")
    public final void method1095(byte arg0) {
        this.field2378 = -this.field2378;
        this.field2331 = -this.field2331;
        field2334++;
        this.field2364 = -this.field2364;
        this.field2328 = -this.field2328;
        this.field2335 = -this.field2335;
        int var2 = -92 / ((52 - arg0) / 33);
        this.field2340 = -this.field2340;
        this.field2339 = -this.field2339;
        this.field2332 = -this.field2332;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([FFBFFF)V")
    public final void method1096(float[] arg0, float arg1, byte arg2, float arg3, float arg4, float arg5) {
        field2369++;
        int var7 = -113 % ((4 - arg2) / 55);
        arg0[1] = this.field2335 * arg3 + this.field2378 * arg4 + this.field2364 * arg1;
        arg0[2] = this.field2331 * arg3 + this.field2339 * arg1 + this.field2332 * arg4;
        arg0[0] = this.field2370 * arg3 + this.field2372 * arg4 + this.field2352 * arg1;
        float var9;
        float var10;
        float var11;
        if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var13 = -arg5 / arg4;
            var10 = this.field2332 * var13 + this.field2328;
            var9 = this.field2372 * var13 + this.field2343;
            var11 = this.field2378 * var13 + this.field2340;
        } else if ((arg1 > 0.00390625F) || (arg1 < -0.00390625F)) {
            float var12 = -arg5 / arg1;
            var10 = this.field2339 * var12 + this.field2328;
            var11 = this.field2364 * var12 + this.field2340;
            var9 = this.field2352 * var12 + this.field2343;
        } else {
            float var8 = -arg5 / arg3;
            var9 = this.field2370 * var8 + this.field2343;
            var10 = this.field2331 * var8 + this.field2328;
            var11 = this.field2335 * var8 + this.field2340;
        }
        arg0[3] = -(arg0[2] * var10 + arg0[0] * var9 + arg0[1] * var11);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Luha;Luha;)V")
    public final void method1097(class723 arg0, class723 arg1) {
        field2333++;
        class173 var3 = (class173) arg0;
        class173 var4 = (class173) arg1;
        this.field2372 = var3.field2370 * var4.field2332 + var3.field2372 * var4.field2372 + var3.field2352 * var4.field2378;
        this.field2378 = var3.field2335 * var4.field2332 + var3.field2378 * var4.field2372 + var3.field2364 * var4.field2378;
        this.field2332 = var3.field2331 * var4.field2332 + var3.field2339 * var4.field2378 + var3.field2332 * var4.field2372;
        this.field2352 = var3.field2370 * var4.field2339 + var3.field2372 * var4.field2352 + var3.field2352 * var4.field2364;
        this.field2364 = var3.field2335 * var4.field2339 + var3.field2378 * var4.field2352 + var3.field2364 * var4.field2364;
        this.field2339 = var3.field2331 * var4.field2339 + var3.field2339 * var4.field2364 + var3.field2332 * var4.field2352;
        this.field2370 = var3.field2370 * var4.field2331 + var3.field2372 * var4.field2370 + var3.field2352 * var4.field2335;
        this.field2335 = var3.field2335 * var4.field2331 + var3.field2378 * var4.field2370 + var3.field2364 * var4.field2335;
        this.field2343 = var3.field2370 * var4.field2328 + var3.field2372 * var4.field2343 + var3.field2352 * var4.field2340 + var3.field2343;
        this.field2331 = var3.field2331 * var4.field2331 + var3.field2339 * var4.field2335 + var3.field2332 * var4.field2370;
        this.field2340 = var3.field2335 * var4.field2328 + var3.field2378 * var4.field2343 + var3.field2364 * var4.field2340 + var3.field2340;
        this.field2328 = var3.field2331 * var4.field2328 + var3.field2339 * var4.field2340 + var3.field2332 * var4.field2343 + var3.field2328;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BFFF[F)V")
    public final void method1098(byte arg0, float arg1, float arg2, float arg3, float[] arg4) {
        arg4[2] = this.field2331 * arg1 + this.field2339 * arg3 + this.field2332 * arg2;
        if (arg0 == 35) {
            field2371++;
            arg4[1] = this.field2335 * arg1 + this.field2378 * arg2 + this.field2364 * arg3;
            arg4[0] = this.field2370 * arg1 + this.field2372 * arg2 + this.field2352 * arg3;
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
    public class173() {
        this.method860();
    }
}
