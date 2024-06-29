import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class257 extends class124 {

    @OriginalMember(owner = "client!ku", name = "D", descriptor = "[[Z")
    public static boolean[][] field3425 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ku", name = "G", descriptor = "[I")
    public static int[] field3428 = new int[64];

    @OriginalMember(owner = "client!ku", name = "T", descriptor = "[I")
    public static int[] field3440 = new int[16];

    @OriginalMember(owner = "client!ku", name = "I", descriptor = "Law;")
    public static class55 field3430 = new class55(16);

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "F")
    public float field3405;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "F")
    public float field3410;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "F")
    public float field3411;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "F")
    public float field3412;

    @OriginalMember(owner = "client!ku", name = "s", descriptor = "F")
    public float field3414;

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "F")
    public float field3424;

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "F")
    public float field3426;

    @OriginalMember(owner = "client!ku", name = "F", descriptor = "F")
    public float field3427;

    @OriginalMember(owner = "client!ku", name = "H", descriptor = "F")
    public float field3429;

    @OriginalMember(owner = "client!ku", name = "J", descriptor = "F")
    public float field3431;

    @OriginalMember(owner = "client!ku", name = "K", descriptor = "F")
    public float field3432;

    @OriginalMember(owner = "client!ku", name = "Q", descriptor = "F")
    public float field3437;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ku", name = "r", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ku", name = "t", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ku", name = "w", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ku", name = "x", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ku", name = "B", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ku", name = "L", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ku", name = "M", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ku", name = "N", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ku", name = "P", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ku", name = "R", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ku", name = "S", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ku", name = "U", descriptor = "I")
    public static int field3441;

    static {
        new class305("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III[I)V", line = 7)
    public final void method737(int arg0, int arg1, int arg2, int[] arg3) {
        field3416++;
        arg3[2] = (int) ((float) arg2 * this.field3411 + (float) arg0 * this.field3437 + (float) arg1 * this.field3410 + this.field3426);
        arg3[0] = (int) ((float) arg2 * this.field3424 + (float) arg0 * this.field3431 + (float) arg1 * this.field3427 + this.field3412);
        arg3[1] = (int) ((float) arg2 * this.field3414 + (float) arg0 * this.field3405 + (float) arg1 * this.field3429 + this.field3432);
    }

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "()V", line = 24)
    public final void method741() {
        field3423++;
        this.field3405 = this.field3437 = this.field3427 = this.field3410 = this.field3424 = this.field3414 = this.field3412 = this.field3432 = this.field3426 = 0.0F;
        this.field3431 = this.field3429 = this.field3411 = 1.0F;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BLc;)V", line = 33)
    public final void method1584(byte arg0, class124 arg1) {
        field3438++;
        class257 var3 = (class257) arg1;
        this.field3427 = var3.field3405;
        this.field3424 = var3.field3437;
        if (arg0 > -59) {
            this.method749(100);
        }
        this.field3431 = var3.field3431;
        this.field3414 = var3.field3410;
        this.field3437 = var3.field3424;
        this.field3405 = var3.field3427;
        this.field3429 = var3.field3429;
        this.field3410 = var3.field3414;
        this.field3412 = -(this.field3424 * var3.field3426 + this.field3431 * var3.field3412 + this.field3427 * var3.field3432);
        this.field3411 = var3.field3411;
        this.field3432 = -(this.field3414 * var3.field3426 + this.field3429 * var3.field3432 + this.field3405 * var3.field3412);
        this.field3426 = -(this.field3411 * var3.field3426 + this.field3437 * var3.field3412 + this.field3410 * var3.field3432);
    }

    @OriginalMember(owner = "client!ku", name = "K", descriptor = "(III[I)V", line = 64)
    public final void method745(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field3414 + (float) arg0 * this.field3405 + (float) arg1 * this.field3429);
        arg3[2] = (int) ((float) arg2 * this.field3411 + (float) arg0 * this.field3437 + (float) arg1 * this.field3410);
        field3417++;
        arg3[0] = (int) ((float) arg2 * this.field3424 + (float) arg0 * this.field3431 + (float) arg1 * this.field3427);
    }

    @OriginalMember(owner = "client!ku", name = "YA", descriptor = "(IIIIII)V", line = 74)
    public final void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3408++;
        float var7 = class471.field6994[arg3 & 0x3FFF];
        float var8 = class471.field6996[arg3 & 0x3FFF];
        float var9 = class471.field6994[arg4 & 0x3FFF];
        float var10 = class471.field6996[arg4 & 0x3FFF];
        float var11 = class471.field6994[arg5 & 0x3FFF];
        float var12 = class471.field6996[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3424 = -var10 * var11 + var9 * var14;
        this.field3437 = var7 * var10;
        this.field3429 = var7 * var11;
        this.field3410 = -var8;
        this.field3411 = var7 * var9;
        this.field3427 = var7 * var12;
        this.field3431 = var9 * var11 + var10 * var14;
        this.field3414 = var9 * var13 + var10 * var12;
        this.field3405 = -var9 * var12 + var10 * var13;
        this.field3432 = (float) (-arg0) * this.field3405 - (float) arg1 * this.field3429 - (float) arg2 * this.field3414;
        this.field3426 = (float) (-arg0) * this.field3437 - ((float) arg1 * this.field3410) - (float) arg2 * this.field3411;
        this.field3412 = (float) (-arg0) * this.field3431 - ((float) arg1 * this.field3427) - ((float) arg2 * this.field3424);
    }

    @OriginalMember(owner = "client!ku", name = "U", descriptor = "(III)V", line = 109)
    public final void method743(int arg0, int arg1, int arg2) {
        this.field3412 = arg0;
        this.field3432 = arg1;
        this.field3426 = arg2;
        this.field3431 = this.field3429 = this.field3411 = 1.0F;
        this.field3405 = this.field3437 = this.field3427 = this.field3410 = this.field3424 = this.field3414 = 0.0F;
        field3413++;
    }

    @OriginalMember(owner = "client!ku", name = "W", descriptor = "(III)V", line = 124)
    public final void method757(int arg0, int arg1, int arg2) {
        this.field3412 += arg0;
        this.field3432 += arg1;
        this.field3426 += arg2;
        field3418++;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILjk;)Ljava/lang/String;", line = 135)
    public static final String method1585(int arg0, int arg1, class450 arg2) {
        field3441++;
        if (!client.method1253(arg2).method1398(arg1, arg0 ^ arg0) && arg2.field6675 == null) {
            return null;
        } else if (arg2.field6622 == null || arg2.field6622.length <= arg1 || arg2.field6622[arg1] == null || arg2.field6622[arg1].trim().length() == 0) {
            return class94.field1134 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field6622[arg1];
        }
    }

    @OriginalMember(owner = "client!ku", name = "wa", descriptor = "([I)V", line = 159)
    public final void method754(int[] arg0) {
        field3407++;
        float var2 = (float) arg0[0] - this.field3412;
        float var3 = (float) arg0[1] - this.field3432;
        float var4 = (float) arg0[2] - this.field3426;
        arg0[2] = (int) (this.field3411 * var4 + this.field3424 * var2 + this.field3414 * var3);
        arg0[1] = (int) (this.field3410 * var4 + this.field3429 * var3 + this.field3427 * var2);
        arg0[0] = (int) (this.field3437 * var4 + this.field3431 * var2 + this.field3405 * var3);
    }

    @OriginalMember(owner = "client!ku", name = "ea", descriptor = "(I)V", line = 175)
    public final void method751(int arg0) {
        field3434++;
        float var2 = class471.field6994[arg0 & 0x3FFF];
        float var3 = class471.field6996[arg0 & 0x3FFF];
        float var4 = this.field3405;
        float var5 = this.field3429;
        float var6 = this.field3414;
        this.field3405 = var2 * var4 - this.field3437 * var3;
        float var7 = this.field3432;
        this.field3437 = this.field3437 * var2 + var3 * var4;
        this.field3429 = var2 * var5 - (this.field3410 * var3);
        this.field3414 = var2 * var6 - this.field3411 * var3;
        this.field3410 = this.field3410 * var2 + var3 * var5;
        this.field3411 = this.field3411 * var2 + var3 * var6;
        this.field3432 = var2 * var7 - this.field3426 * var3;
        this.field3426 = this.field3426 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "(I)V", line = 203)
    public final void method756(int arg0) {
        field3439++;
        this.field3411 = 1.0F;
        this.field3431 = this.field3429 = class471.field6994[arg0 & 0x3FFF];
        this.field3405 = class471.field6996[arg0 & 0x3FFF];
        this.field3424 = this.field3412 = this.field3414 = this.field3432 = this.field3437 = this.field3410 = this.field3426 = 0.0F;
        this.field3427 = -this.field3405;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(FIIFFII)V", line = 221)
    public final void method1586(float arg0, int arg1, int arg2, float arg3, float arg4, int arg5, int arg6) {
        if (arg5 == 0) {
            this.field3431 = arg6;
            this.field3411 = 1.0F;
            this.field3405 = this.field3437 = this.field3427 = this.field3410 = this.field3424 = this.field3414 = 0.0F;
            this.field3429 = arg2;
        } else {
            float var8 = class471.field6994[arg5 & 0x3FFF];
            float var9 = class471.field6996[arg5 & 0x3FFF];
            this.field3437 = this.field3410 = this.field3424 = this.field3414 = 0.0F;
            this.field3431 = (float) arg6 * var8;
            this.field3427 = (float) arg2 * -var9;
            this.field3411 = 1.0F;
            this.field3405 = (float) arg6 * var9;
            this.field3429 = (float) arg2 * var8;
        }
        field3435++;
        int var10 = 60 / ((arg1 - 30) / 43);
        this.field3432 = arg3;
        this.field3412 = arg4;
        this.field3426 = arg0;
    }

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "(I)V", line = 262)
    public final void method747(int arg0) {
        this.field3431 = 1.0F;
        field3406++;
        this.field3429 = this.field3411 = class471.field6994[arg0 & 0x3FFF];
        this.field3410 = class471.field6996[arg0 & 0x3FFF];
        this.field3427 = this.field3424 = this.field3412 = this.field3405 = this.field3432 = this.field3437 = this.field3426 = 0.0F;
        this.field3414 = -this.field3410;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V", line = 277)
    public static void method1587(int arg0) {
        if (arg0 == 16383) {
            field3440 = null;
            field3425 = null;
            field3430 = null;
            field3428 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "ca", descriptor = "(I)V", line = 290)
    public final void method749(int arg0) {
        this.field3429 = 1.0F;
        field3419++;
        this.field3431 = this.field3411 = class471.field6994[arg0 & 0x3FFF];
        this.field3424 = class471.field6996[arg0 & 0x3FFF];
        this.field3437 = -this.field3424;
        this.field3427 = this.field3412 = this.field3405 = this.field3414 = this.field3432 = this.field3410 = this.field3426 = 0.0F;
    }

    @OriginalMember(owner = "client!ku", name = "EA", descriptor = "(I)V", line = 302)
    public final void method742(int arg0) {
        field3421++;
        float var2 = class471.field6994[arg0 & 0x3FFF];
        float var3 = class471.field6996[arg0 & 0x3FFF];
        float var4 = this.field3431;
        float var5 = this.field3427;
        float var6 = this.field3424;
        float var7 = this.field3412;
        this.field3431 = this.field3437 * var3 + var2 * var4;
        this.field3437 = this.field3437 * var2 - var3 * var4;
        this.field3427 = this.field3410 * var3 + var2 * var5;
        this.field3424 = this.field3411 * var3 + var2 * var6;
        this.field3410 = this.field3410 * var2 - var3 * var5;
        this.field3411 = this.field3411 * var2 - (var3 * var6);
        this.field3412 = this.field3426 * var3 + var2 * var7;
        this.field3426 = this.field3426 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BI)V", line = 329)
    public static final void method1588(byte arg0, int arg1) {
        if (class33.field339 == null) {
            class33.field339 = new byte[4][class308.field4128][class426.field6200];
        }
        field3433++;
        if (arg1 != 4) {
            field3440 = null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class308.field4128; var3++) {
                for (int var4 = 0; var4 < class426.field6200; var4++) {
                    class33.field339[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V", line = 365)
    public class257() {
        this.method741();
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I[SI)[S", line = 374)
    public static final short[] method1589(int arg0, short[] arg1, int arg2) {
        field3420++;
        if (arg2 >= -4) {
            field3425 = null;
        }
        short[] var3 = new short[arg0];
        class438.method2686(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "()Lc;", line = 388)
    public final class124 method750() {
        field3422++;
        class257 var1 = new class257();
        var1.field3410 = this.field3410;
        var1.field3437 = this.field3437;
        var1.field3405 = this.field3405;
        var1.field3414 = this.field3414;
        var1.field3432 = this.field3432;
        var1.field3431 = this.field3431;
        var1.field3429 = this.field3429;
        var1.field3424 = this.field3424;
        var1.field3412 = this.field3412;
        var1.field3411 = this.field3411;
        var1.field3427 = this.field3427;
        var1.field3426 = this.field3426;
        return var1;
    }

    @OriginalMember(owner = "client!ku", name = "ha", descriptor = "(Lc;)V", line = 414)
    public final void method753(class124 arg0) {
        field3436++;
        class257 var2 = (class257) arg0;
        this.field3424 = var2.field3424;
        this.field3411 = var2.field3411;
        this.field3431 = var2.field3431;
        this.field3426 = var2.field3426;
        this.field3437 = var2.field3437;
        this.field3427 = var2.field3427;
        this.field3410 = var2.field3410;
        this.field3414 = var2.field3414;
        this.field3429 = var2.field3429;
        this.field3412 = var2.field3412;
        this.field3432 = var2.field3432;
        this.field3405 = var2.field3405;
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)[F", line = 435)
    public final float[] method1590(int arg0) {
        class21.field198[6] = this.field3410;
        class21.field198[8] = this.field3424;
        class21.field198[13] = this.field3432;
        field3415++;
        class21.field198[9] = this.field3414;
        class21.field198[4] = this.field3427;
        class21.field198[12] = this.field3412;
        class21.field198[5] = this.field3429;
        class21.field198[10] = this.field3411;
        class21.field198[1] = this.field3405;
        class21.field198[14] = this.field3426;
        class21.field198[2] = this.field3437;
        class21.field198[arg0] = this.field3431;
        return class21.field198;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)[F", line = 455)
    public final float[] method1591(boolean arg0) {
        class21.field198[5] = this.field3429;
        field3409++;
        class21.field198[0] = this.field3431;
        class21.field198[8] = this.field3424;
        class21.field198[9] = this.field3414;
        class21.field198[4] = this.field3427;
        class21.field198[6] = this.field3410;
        class21.field198[10] = this.field3411;
        class21.field198[13] = 0.0F;
        class21.field198[12] = 0.0F;
        class21.field198[14] = 0.0F;
        if (!arg0) {
            this.method1584((byte) -115, null);
        }
        class21.field198[1] = this.field3405;
        class21.field198[2] = this.field3437;
        return class21.field198;
    }
}
