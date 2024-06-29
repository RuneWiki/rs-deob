import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class231 extends class122 {

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "F")
    public float field3376;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "F")
    public float field3377;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "F")
    public float field3378;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "F")
    public float field3381;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "F")
    public float field3386;

    @OriginalMember(owner = "client!tu", name = "A", descriptor = "F")
    public float field3392;

    @OriginalMember(owner = "client!tu", name = "E", descriptor = "F")
    public float field3396;

    @OriginalMember(owner = "client!tu", name = "H", descriptor = "F")
    public float field3399;

    @OriginalMember(owner = "client!tu", name = "I", descriptor = "F")
    public float field3400;

    @OriginalMember(owner = "client!tu", name = "J", descriptor = "F")
    public float field3401;

    @OriginalMember(owner = "client!tu", name = "K", descriptor = "F")
    public float field3402;

    @OriginalMember(owner = "client!tu", name = "P", descriptor = "F")
    public float field3407;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!tu", name = "B", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!tu", name = "C", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!tu", name = "D", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!tu", name = "F", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!tu", name = "G", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!tu", name = "L", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!tu", name = "M", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!tu", name = "N", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!tu", name = "O", descriptor = "Llq;")
    public static class385 field3406;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)[F", line = 3)
    public final float[] method1547(int arg0) {
        class523.field7690[2] = this.field3400;
        class523.field7690[0] = this.field3386;
        class523.field7690[12] = 0.0F;
        class523.field7690[13] = 0.0F;
        field3388++;
        class523.field7690[9] = this.field3381;
        class523.field7690[5] = this.field3396;
        class523.field7690[1] = this.field3378;
        class523.field7690[4] = this.field3401;
        class523.field7690[6] = this.field3392;
        if (arg0 < 66) {
            this.field3381 = -0.5634646F;
        }
        class523.field7690[14] = 0.0F;
        class523.field7690[10] = this.field3377;
        class523.field7690[8] = this.field3402;
        return class523.field7690;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III[I)V", line = 27)
    public final void method255(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field3402 + (float) arg0 * this.field3386 + (float) arg1 * this.field3401 + this.field3407);
        arg3[1] = (int) ((float) arg2 * this.field3381 + (float) arg0 * this.field3378 + (float) arg1 * this.field3396 + this.field3399);
        field3393++;
        arg3[2] = (int) ((float) arg2 * this.field3377 + (float) arg0 * this.field3400 + (float) arg1 * this.field3392 + this.field3376);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 38)
    public static void method1548(int arg0) {
        if (arg0 < -52) {
            field3406 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "ka", descriptor = "(I)V", line = 48)
    public final void method254(int arg0) {
        field3389++;
        float var2 = class372.field5531[arg0 & 0x3FFF];
        float var3 = class372.field5530[arg0 & 0x3FFF];
        float var4 = this.field3378;
        float var5 = this.field3396;
        float var6 = this.field3381;
        float var7 = this.field3399;
        this.field3378 = var2 * var4 - (this.field3400 * var3);
        this.field3400 = this.field3400 * var2 + var3 * var4;
        this.field3396 = var2 * var5 - this.field3392 * var3;
        this.field3392 = this.field3392 * var2 + var3 * var5;
        this.field3381 = var2 * var6 - this.field3377 * var3;
        this.field3377 = this.field3377 * var2 + var3 * var6;
        this.field3399 = var2 * var7 - this.field3376 * var3;
        this.field3376 = this.field3376 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "(IIIIII)V", line = 76)
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3387++;
        float var7 = class372.field5531[arg3 & 0x3FFF];
        float var8 = class372.field5530[arg3 & 0x3FFF];
        float var9 = class372.field5531[arg4 & 0x3FFF];
        float var10 = class372.field5530[arg4 & 0x3FFF];
        float var11 = class372.field5531[arg5 & 0x3FFF];
        float var12 = class372.field5530[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3381 = var9 * var13 + var10 * var12;
        this.field3377 = var7 * var9;
        this.field3386 = var9 * var11 + var10 * var14;
        this.field3378 = -var9 * var12 + var10 * var13;
        this.field3400 = var7 * var10;
        this.field3392 = -var8;
        this.field3401 = var7 * var12;
        this.field3396 = var7 * var11;
        this.field3402 = -var10 * var11 + var9 * var14;
        this.field3407 = (float) (-arg0) * this.field3386 - (float) arg1 * this.field3401 - (float) arg2 * this.field3402;
        this.field3399 = (float) (-arg0) * this.field3378 - (float) arg1 * this.field3396 - (float) arg2 * this.field3381;
        this.field3376 = (float) (-arg0) * this.field3400 - (float) arg1 * this.field3392 - ((float) arg2 * this.field3377);
    }

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "([I)V", line = 111)
    public final void method244(int[] arg0) {
        field3373++;
        float var2 = (float) arg0[0] - this.field3407;
        float var3 = (float) arg0[1] - this.field3399;
        float var4 = (float) arg0[2] - this.field3376;
        arg0[2] = (int) (this.field3377 * var4 + this.field3402 * var2 + this.field3381 * var3);
        arg0[1] = (int) (this.field3392 * var4 + this.field3401 * var2 + this.field3396 * var3);
        arg0[0] = (int) (this.field3400 * var4 + this.field3386 * var2 + this.field3378 * var3);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLku;)V", line = 128)
    public static final void method1549(byte arg0, class255 arg1) {
        arg1.field3747 = null;
        field3390++;
        if (arg0 != -69) {
            field3403 = -32;
        }
        if (class370.field5500 < 20) {
            class49.field543.method2948(-120, arg1);
            class370.field5500++;
        }
    }

    @OriginalMember(owner = "client!tu", name = "xa", descriptor = "()V", line = 148)
    public final void method250() {
        this.field3386 = this.field3396 = this.field3377 = 1.0F;
        field3395++;
        this.field3378 = this.field3400 = this.field3401 = this.field3392 = this.field3402 = this.field3381 = this.field3407 = this.field3399 = this.field3376 = 0.0F;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lc;Z)V", line = 158)
    public final void method1550(class122 arg0, boolean arg1) {
        field3382++;
        class231 var3 = (class231) arg0;
        this.field3402 = var3.field3400;
        this.field3401 = var3.field3378;
        this.field3386 = var3.field3386;
        this.field3381 = var3.field3392;
        this.field3400 = var3.field3402;
        this.field3378 = var3.field3401;
        this.field3396 = var3.field3396;
        this.field3407 = -(this.field3402 * var3.field3376 + this.field3401 * var3.field3399 + this.field3386 * var3.field3407);
        this.field3392 = var3.field3381;
        this.field3377 = var3.field3377;
        if (!arg1) {
            this.field3399 = -(this.field3381 * var3.field3376 + this.field3396 * var3.field3399 + this.field3378 * var3.field3407);
            this.field3376 = -(this.field3377 * var3.field3376 + this.field3400 * var3.field3407 + this.field3392 * var3.field3399);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIFIFF)V", line = 184)
    public final void method1551(int arg0, int arg1, int arg2, float arg3, int arg4, float arg5, float arg6) {
        if (arg1 == 0) {
            this.field3377 = 1.0F;
            this.field3378 = this.field3400 = this.field3401 = this.field3392 = this.field3402 = this.field3381 = 0.0F;
            this.field3386 = arg2;
            this.field3396 = arg4;
        } else {
            float var8 = class372.field5531[arg1 & 0x3FFF];
            float var9 = class372.field5530[arg1 & 0x3FFF];
            this.field3377 = 1.0F;
            this.field3401 = (float) arg4 * -var9;
            this.field3396 = (float) arg4 * var8;
            this.field3386 = (float) arg2 * var8;
            this.field3400 = this.field3392 = this.field3402 = this.field3381 = 0.0F;
            this.field3378 = (float) arg2 * var9;
        }
        field3397++;
        this.field3407 = arg5;
        this.field3376 = arg6;
        this.field3399 = arg3;
        if (arg0 != 0) {
            this.method253(-121);
        }
    }

    @OriginalMember(owner = "client!tu", name = "za", descriptor = "(Lc;)V", line = 220)
    public final void method256(class122 arg0) {
        field3374++;
        class231 var2 = (class231) arg0;
        this.field3392 = var2.field3392;
        this.field3377 = var2.field3377;
        this.field3399 = var2.field3399;
        this.field3376 = var2.field3376;
        this.field3396 = var2.field3396;
        this.field3381 = var2.field3381;
        this.field3378 = var2.field3378;
        this.field3401 = var2.field3401;
        this.field3386 = var2.field3386;
        this.field3402 = var2.field3402;
        this.field3407 = var2.field3407;
        this.field3400 = var2.field3400;
    }

    @OriginalMember(owner = "client!tu", name = "ja", descriptor = "(I)V", line = 250)
    public final void method247(int arg0) {
        field3385++;
        float var2 = class372.field5531[arg0 & 0x3FFF];
        float var3 = class372.field5530[arg0 & 0x3FFF];
        float var4 = this.field3386;
        float var5 = this.field3401;
        float var6 = this.field3402;
        this.field3386 = this.field3400 * var3 + var2 * var4;
        float var7 = this.field3407;
        this.field3401 = this.field3392 * var3 + var2 * var5;
        this.field3400 = this.field3400 * var2 - var3 * var4;
        this.field3392 = this.field3392 * var2 - var3 * var5;
        this.field3402 = this.field3377 * var3 + var2 * var6;
        this.field3377 = this.field3377 * var2 - (var3 * var6);
        this.field3407 = this.field3376 * var3 + var2 * var7;
        this.field3376 = this.field3376 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "(III)V", line = 278)
    public final void method251(int arg0, int arg1, int arg2) {
        this.field3399 += arg1;
        field3383++;
        this.field3376 += arg2;
        this.field3407 += arg0;
    }

    @OriginalMember(owner = "client!tu", name = "ra", descriptor = "(I)V", line = 288)
    public final void method253(int arg0) {
        field3404++;
        this.field3396 = 1.0F;
        this.field3386 = this.field3377 = class372.field5531[arg0 & 0x3FFF];
        this.field3402 = class372.field5530[arg0 & 0x3FFF];
        this.field3401 = this.field3407 = this.field3378 = this.field3381 = this.field3399 = this.field3392 = this.field3376 = 0.0F;
        this.field3400 = -this.field3402;
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V", line = 307)
    public static final void method1552(int arg0) {
        field3405++;
        if (class63.field744 < 0) {
            class63.field744 = 0;
            class447.field6600 = -1;
            class45.field510 = -1;
        }
        if (class63.field744 > class399.field5923) {
            class447.field6600 = -1;
            class45.field510 = -1;
            class63.field744 = class399.field5923;
        }
        if (arg0 < ~class512.field7555) {
            class45.field510 = -1;
            class447.field6600 = -1;
            class512.field7555 = 0;
        }
        if (class512.field7555 > class399.field5927) {
            class447.field6600 = -1;
            class45.field510 = -1;
            class512.field7555 = class399.field5927;
        }
    }

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "(III[I)V", line = 344)
    public final void method241(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field3381 + (float) arg0 * this.field3378 + (float) arg1 * this.field3396);
        arg3[0] = (int) ((float) arg2 * this.field3402 + (float) arg0 * this.field3386 + (float) arg1 * this.field3401);
        field3375++;
        arg3[2] = (int) ((float) arg2 * this.field3377 + (float) arg0 * this.field3400 + (float) arg1 * this.field3392);
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)[F", line = 354)
    public final float[] method1553(int arg0) {
        class523.field7690[14] = this.field3376;
        field3384++;
        class523.field7690[1] = this.field3378;
        class523.field7690[arg0] = this.field3386;
        class523.field7690[8] = this.field3402;
        class523.field7690[13] = this.field3399;
        class523.field7690[10] = this.field3377;
        class523.field7690[2] = this.field3400;
        class523.field7690[5] = this.field3396;
        class523.field7690[9] = this.field3381;
        class523.field7690[12] = this.field3407;
        class523.field7690[4] = this.field3401;
        class523.field7690[6] = this.field3392;
        return class523.field7690;
    }

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "(III)V", line = 376)
    public final void method249(int arg0, int arg1, int arg2) {
        this.field3378 = this.field3400 = this.field3401 = this.field3392 = this.field3402 = this.field3381 = 0.0F;
        this.field3386 = this.field3396 = this.field3377 = 1.0F;
        field3379++;
        this.field3376 = arg2;
        this.field3407 = arg0;
        this.field3399 = arg1;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "()Lc;", line = 390)
    public final class122 method245() {
        field3391++;
        class231 var1 = new class231();
        var1.field3376 = this.field3376;
        var1.field3392 = this.field3392;
        var1.field3386 = this.field3386;
        var1.field3400 = this.field3400;
        var1.field3377 = this.field3377;
        var1.field3381 = this.field3381;
        var1.field3407 = this.field3407;
        var1.field3378 = this.field3378;
        var1.field3399 = this.field3399;
        var1.field3402 = this.field3402;
        var1.field3401 = this.field3401;
        var1.field3396 = this.field3396;
        return var1;
    }

    @OriginalMember(owner = "client!tu", name = "O", descriptor = "(I)V", line = 420)
    public final void method243(int arg0) {
        field3398++;
        this.field3377 = 1.0F;
        this.field3386 = this.field3396 = class372.field5531[arg0 & 0x3FFF];
        this.field3378 = class372.field5530[arg0 & 0x3FFF];
        this.field3402 = this.field3407 = this.field3381 = this.field3399 = this.field3400 = this.field3392 = this.field3376 = 0.0F;
        this.field3401 = -this.field3378;
    }

    @OriginalMember(owner = "client!tu", name = "N", descriptor = "(I)V", line = 432)
    public final void method252(int arg0) {
        this.field3386 = 1.0F;
        field3394++;
        this.field3396 = this.field3377 = class372.field5531[arg0 & 0x3FFF];
        this.field3392 = class372.field5530[arg0 & 0x3FFF];
        this.field3401 = this.field3402 = this.field3407 = this.field3378 = this.field3399 = this.field3400 = this.field3376 = 0.0F;
        this.field3381 = -this.field3392;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V", line = 447)
    public class231() {
        this.method250();
    }
}
