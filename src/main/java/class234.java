import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class234 extends class122 {

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "Lqp;")
    public static class466 field3321 = new class466("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "F")
    public float field3296;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "F")
    public float field3297;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "F")
    public float field3309;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "F")
    public float field3312;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "F")
    public float field3313;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "F")
    public float field3314;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "F")
    public float field3317;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "F")
    public float field3319;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "F")
    public float field3323;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "F")
    public float field3326;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "F")
    public float field3328;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "F")
    public float field3329;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "(III)V")
    public final void method188(int arg0, int arg1, int arg2) {
        this.field3312 += arg2;
        this.field3328 += arg1;
        field3303++;
        this.field3313 += arg0;
    }

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "([I)V")
    public final void method184(int[] arg0) {
        field3311++;
        float var2 = (float) arg0[0] - this.field3313;
        float var3 = (float) arg0[1] - this.field3328;
        float var4 = (float) arg0[2] - this.field3312;
        arg0[2] = (int) (this.field3317 * var4 + this.field3326 * var2 + this.field3323 * var3);
        arg0[0] = (int) (this.field3314 * var4 + this.field3309 * var2 + this.field3297 * var3);
        arg0[1] = (int) (this.field3329 * var4 + this.field3319 * var3 + this.field3296 * var2);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(FIIFIIF)V")
    public final void method1439(float arg0, int arg1, int arg2, float arg3, int arg4, int arg5, float arg6) {
        field3299++;
        if (arg1 == 0) {
            this.field3317 = 1.0F;
            this.field3297 = this.field3314 = this.field3296 = this.field3329 = this.field3326 = this.field3323 = 0.0F;
            this.field3319 = arg5;
            this.field3309 = arg4;
        } else {
            float var8 = class381.field5572[arg1 & 0x3FFF];
            float var9 = class381.field5571[arg1 & 0x3FFF];
            this.field3309 = (float) arg4 * var8;
            this.field3297 = (float) arg4 * var9;
            this.field3317 = 1.0F;
            this.field3314 = this.field3329 = this.field3326 = this.field3323 = 0.0F;
            this.field3319 = (float) arg5 * var8;
            this.field3296 = (float) arg5 * -var9;
        }
        if (arg2 == 16383) {
            this.field3313 = arg3;
            this.field3328 = arg6;
            this.field3312 = arg0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "(III[I)V")
    public final void method185(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field3317 + (float) arg0 * this.field3314 + (float) arg1 * this.field3329);
        arg3[1] = (int) ((float) arg2 * this.field3323 + (float) arg0 * this.field3297 + (float) arg1 * this.field3319);
        arg3[0] = (int) ((float) arg2 * this.field3326 + (float) arg0 * this.field3309 + (float) arg1 * this.field3296);
        field3320++;
    }

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "(I)V")
    public final void method183(int arg0) {
        field3318++;
        this.field3309 = 1.0F;
        this.field3319 = this.field3317 = class381.field5572[arg0 & 0x3FFF];
        this.field3329 = class381.field5571[arg0 & 0x3FFF];
        this.field3296 = this.field3326 = this.field3313 = this.field3297 = this.field3328 = this.field3314 = this.field3312 = 0.0F;
        this.field3323 = -this.field3329;
    }

    @OriginalMember(owner = "client!tc", name = "xa", descriptor = "()V")
    public final void method179() {
        this.field3309 = this.field3319 = this.field3317 = 1.0F;
        this.field3297 = this.field3314 = this.field3296 = this.field3329 = this.field3326 = this.field3323 = this.field3313 = this.field3328 = this.field3312 = 0.0F;
        field3302++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[I)V")
    public final void method178(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field3317 + (float) arg0 * this.field3314 + (float) arg1 * this.field3329 + this.field3312);
        field3316++;
        arg3[0] = (int) ((float) arg2 * this.field3326 + (float) arg0 * this.field3309 + (float) arg1 * this.field3296 + this.field3313);
        arg3[1] = (int) ((float) arg2 * this.field3323 + (float) arg0 * this.field3297 + (float) arg1 * this.field3319 + this.field3328);
    }

    @OriginalMember(owner = "client!tc", name = "za", descriptor = "(Lc;)V")
    public final void method192(class122 arg0) {
        field3307++;
        class234 var2 = (class234) arg0;
        this.field3314 = var2.field3314;
        this.field3312 = var2.field3312;
        this.field3323 = var2.field3323;
        this.field3326 = var2.field3326;
        this.field3319 = var2.field3319;
        this.field3317 = var2.field3317;
        this.field3328 = var2.field3328;
        this.field3309 = var2.field3309;
        this.field3313 = var2.field3313;
        this.field3297 = var2.field3297;
        this.field3329 = var2.field3329;
        this.field3296 = var2.field3296;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)[F")
    public final float[] method1440(byte arg0) {
        class373.field5477[10] = this.field3317;
        class373.field5477[4] = this.field3296;
        class373.field5477[2] = this.field3314;
        class373.field5477[6] = this.field3329;
        class373.field5477[13] = this.field3328;
        class373.field5477[9] = this.field3323;
        class373.field5477[0] = this.field3309;
        class373.field5477[14] = this.field3312;
        class373.field5477[5] = this.field3319;
        if (arg0 > -125) {
            this.method192(null);
        }
        field3306++;
        class373.field5477[12] = this.field3313;
        class373.field5477[1] = this.field3297;
        class373.field5477[8] = this.field3326;
        return class373.field5477;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1441(int arg0, int arg1, byte arg2) {
        field3325++;
        if (arg2 < 13) {
            return true;
        } else {
            return (arg0 & 0x10000) != 0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "(I)V")
    public final void method193(int arg0) {
        this.field3317 = 1.0F;
        field3300++;
        this.field3309 = this.field3319 = class381.field5572[arg0 & 0x3FFF];
        this.field3297 = class381.field5571[arg0 & 0x3FFF];
        this.field3326 = this.field3313 = this.field3323 = this.field3328 = this.field3314 = this.field3329 = this.field3312 = 0.0F;
        this.field3296 = -this.field3297;
    }

    @OriginalMember(owner = "client!tc", name = "ka", descriptor = "(I)V")
    public final void method187(int arg0) {
        field3305++;
        float var2 = class381.field5572[arg0 & 0x3FFF];
        float var3 = class381.field5571[arg0 & 0x3FFF];
        float var4 = this.field3297;
        float var5 = this.field3319;
        float var6 = this.field3323;
        this.field3297 = var2 * var4 - this.field3314 * var3;
        float var7 = this.field3328;
        this.field3319 = var2 * var5 - this.field3329 * var3;
        this.field3314 = this.field3314 * var2 + var3 * var4;
        this.field3323 = var2 * var6 - this.field3317 * var3;
        this.field3329 = this.field3329 * var2 + var3 * var5;
        this.field3317 = this.field3317 * var2 + var3 * var6;
        this.field3328 = var2 * var7 - this.field3312 * var3;
        this.field3312 = this.field3312 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!tc", name = "ja", descriptor = "(I)V")
    public final void method181(int arg0) {
        field3310++;
        float var2 = class381.field5572[arg0 & 0x3FFF];
        float var3 = class381.field5571[arg0 & 0x3FFF];
        float var4 = this.field3309;
        float var5 = this.field3296;
        float var6 = this.field3326;
        float var7 = this.field3313;
        this.field3309 = this.field3314 * var3 + var2 * var4;
        this.field3314 = this.field3314 * var2 - (var3 * var4);
        this.field3296 = this.field3329 * var3 + var2 * var5;
        this.field3329 = this.field3329 * var2 - (var3 * var5);
        this.field3326 = this.field3317 * var3 + var2 * var6;
        this.field3313 = this.field3312 * var3 + var2 * var7;
        this.field3317 = this.field3317 * var2 - (var3 * var6);
        this.field3312 = this.field3312 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "(IIIIII)V")
    public final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3324++;
        float var7 = class381.field5572[arg3 & 0x3FFF];
        float var8 = class381.field5571[arg3 & 0x3FFF];
        float var9 = class381.field5572[arg4 & 0x3FFF];
        float var10 = class381.field5571[arg4 & 0x3FFF];
        float var11 = class381.field5572[arg5 & 0x3FFF];
        float var12 = class381.field5571[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3309 = var9 * var11 + var10 * var14;
        this.field3319 = var7 * var11;
        this.field3317 = var7 * var9;
        this.field3323 = var9 * var13 + var10 * var12;
        this.field3314 = var7 * var10;
        this.field3297 = -var9 * var12 + var10 * var13;
        this.field3326 = -var10 * var11 + var9 * var14;
        this.field3329 = -var8;
        this.field3296 = var7 * var12;
        this.field3313 = (float) (-arg0) * this.field3309 - ((float) arg1 * this.field3296) - ((float) arg2 * this.field3326);
        this.field3312 = (float) (-arg0) * this.field3314 - (float) arg1 * this.field3329 - (float) arg2 * this.field3317;
        this.field3328 = (float) (-arg0) * this.field3297 - ((float) arg1 * this.field3319) - ((float) arg2 * this.field3323);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1442(int arg0) {
        field3321 = null;
        if (arg0 != 0) {
            method1441(87, -23, (byte) 15);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILc;)V")
    public final void method1443(int arg0, class122 arg1) {
        field3315++;
        class234 var3 = (class234) arg1;
        this.field3309 = var3.field3309;
        if (arg0 != 1) {
            return;
        }
        this.field3326 = var3.field3314;
        this.field3296 = var3.field3297;
        this.field3314 = var3.field3326;
        this.field3323 = var3.field3329;
        this.field3297 = var3.field3296;
        this.field3319 = var3.field3319;
        this.field3313 = -(this.field3326 * var3.field3312 + this.field3309 * var3.field3313 + this.field3296 * var3.field3328);
        this.field3317 = var3.field3317;
        this.field3329 = var3.field3323;
        this.field3328 = -(this.field3323 * var3.field3312 + this.field3319 * var3.field3328 + this.field3297 * var3.field3313);
        this.field3312 = -(this.field3317 * var3.field3312 + this.field3329 * var3.field3328 + this.field3314 * var3.field3313);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)[F")
    public final float[] method1444(int arg0) {
        class373.field5477[9] = this.field3323;
        class373.field5477[4] = this.field3296;
        class373.field5477[5] = this.field3319;
        class373.field5477[12] = 0.0F;
        field3298++;
        class373.field5477[1] = this.field3297;
        class373.field5477[0] = this.field3309;
        class373.field5477[2] = this.field3314;
        class373.field5477[10] = this.field3317;
        class373.field5477[14] = 0.0F;
        class373.field5477[6] = this.field3329;
        if (arg0 <= 50) {
            this.field3328 = 1.6439764F;
        }
        class373.field5477[8] = this.field3326;
        class373.field5477[13] = 0.0F;
        return class373.field5477;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIBILsk;)V")
    public static final void method1445(int arg0, int arg1, byte arg2, int arg3, class438 arg4) {
        if (arg1 != 16383) {
            field3321 = null;
        }
        field3308++;
        int var5 = arg4.field1127[0];
        int var6 = arg4.field1117[0];
        if (var5 < 0 || class527.field7799 <= var5 || var6 < 0 || var6 >= class422.field6182 || arg0 < 0 || class527.field7799 <= arg0 || arg3 < 0 || arg3 >= class422.field6182) {
            return;
        }
        int var7 = class74.method598(true, class244.field3415, arg1 ^ 0xFFFFC020, arg4.method626((byte) 120), class82.field1229[arg4.field1738], 0, 0, var5, 0, arg3, 0, -4, arg0, class502.field7386, var6);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg4.method2582(-17807, class244.field3415[var8], arg2, class502.field7386[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "(III)V")
    public final void method182(int arg0, int arg1, int arg2) {
        this.field3312 = arg2;
        this.field3309 = this.field3319 = this.field3317 = 1.0F;
        this.field3328 = arg1;
        this.field3297 = this.field3314 = this.field3296 = this.field3329 = this.field3326 = this.field3323 = 0.0F;
        this.field3313 = arg0;
        field3327++;
    }

    @OriginalMember(owner = "client!tc", name = "ra", descriptor = "(I)V")
    public final void method191(int arg0) {
        field3301++;
        this.field3319 = 1.0F;
        this.field3309 = this.field3317 = class381.field5572[arg0 & 0x3FFF];
        this.field3326 = class381.field5571[arg0 & 0x3FFF];
        this.field3314 = -this.field3326;
        this.field3296 = this.field3313 = this.field3297 = this.field3323 = this.field3328 = this.field3329 = this.field3312 = 0.0F;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method1446(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3304++;
        if (arg2 == arg6) {
            class138.method933(arg4, arg1, 1631, arg7, arg0, arg2, arg3);
        } else if (!arg5) {
            if (arg4 - arg2 >= class424.field6204 && class76.field1021 >= arg2 + arg4 && arg0 - arg6 >= class417.field6057 && class224.field3193 >= arg0 + arg6) {
                class357.method2140(arg6, -1, arg0, arg3, arg1, arg4, arg7, arg2);
            } else {
                class10.method45(0, arg4, arg0, arg3, arg2, arg6, arg7, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()Lc;")
    public final class122 method189() {
        field3322++;
        class234 var1 = new class234();
        var1.field3296 = this.field3296;
        var1.field3313 = this.field3313;
        var1.field3319 = this.field3319;
        var1.field3312 = this.field3312;
        var1.field3297 = this.field3297;
        var1.field3317 = this.field3317;
        var1.field3329 = this.field3329;
        var1.field3326 = this.field3326;
        var1.field3314 = this.field3314;
        var1.field3323 = this.field3323;
        var1.field3309 = this.field3309;
        var1.field3328 = this.field3328;
        return var1;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class234() {
        this.method179();
    }

    static {
        new class466("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }
}
