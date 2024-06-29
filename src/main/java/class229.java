import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class229 extends class765 {

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3347 = new CRC32();

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "[F")
    public static float[] field3355 = new float[16];

    @OriginalMember(owner = "client!iq", name = "E", descriptor = "Lsv;")
    public static class570 field3350 = new class570(28, 5);

    @OriginalMember(owner = "client!iq", name = "R", descriptor = "[I")
    public static int[] field3362 = new int[4];

    @OriginalMember(owner = "client!iq", name = "T", descriptor = "Z")
    public static boolean field3364 = false;

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "Ljd;")
    public static class624 field3356 = new class624("RC", 1);

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "F")
    public float field3325;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "F")
    public float field3327;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "F")
    public float field3333;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "F")
    public float field3335;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "F")
    public float field3340;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "F")
    public float field3346;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "F")
    public float field3349;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "F")
    public float field3352;

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "F")
    public float field3359;

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "F")
    public float field3360;

    @OriginalMember(owner = "client!iq", name = "S", descriptor = "F")
    public float field3363;

    @OriginalMember(owner = "client!iq", name = "U", descriptor = "F")
    public float field3365;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!iq", name = "V", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!iq", name = "W", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!iq", name = "X", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III[I)V", line = 3)
    public final void method1549(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field3352 + (float) arg0 * this.field3359 + (float) arg1 * this.field3340);
        arg3[2] = (int) ((float) arg2 * this.field3360 + (float) arg0 * this.field3363 + (float) arg1 * this.field3333);
        field3324++;
        arg3[0] = (int) ((float) arg2 * this.field3349 + (float) arg0 * this.field3346 + (float) arg1 * this.field3335);
    }

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "(I)V", line = 13)
    public final void method1550(int arg0) {
        this.field3360 = -this.field3360;
        this.field3359 = -this.field3359;
        field3351++;
        this.field3333 = -this.field3333;
        this.field3363 = -this.field3363;
        this.field3365 = -this.field3365;
        this.field3325 = -this.field3325;
        this.field3340 = -this.field3340;
        if (arg0 <= 14) {
            this.method1558(-45, 75, -7);
        }
        this.field3352 = -this.field3352;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V", line = 32)
    public final void method1551(int arg0) {
        field3337++;
        float var2 = class483.field6637[arg0 & 0x3FFF];
        float var3 = class483.field6629[arg0 & 0x3FFF];
        float var4 = this.field3346;
        float var5 = this.field3335;
        float var6 = this.field3349;
        float var7 = this.field3327;
        this.field3346 = var2 * var4 - this.field3359 * var3;
        this.field3359 = this.field3359 * var2 + var3 * var4;
        this.field3335 = var2 * var5 - this.field3340 * var3;
        this.field3349 = var2 * var6 - this.field3352 * var3;
        this.field3340 = this.field3340 * var2 + var3 * var5;
        this.field3327 = var2 * var7 - (this.field3365 * var3);
        this.field3352 = this.field3352 * var2 + var3 * var6;
        this.field3365 = this.field3365 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ldm;)V", line = 63)
    public final void method1552(class765 arg0) {
        field3326++;
        class229 var2 = (class229) arg0;
        this.field3346 = var2.field3346;
        this.field3340 = var2.field3340;
        this.field3360 = var2.field3360;
        this.field3335 = var2.field3335;
        this.field3352 = var2.field3352;
        this.field3327 = var2.field3327;
        this.field3333 = var2.field3333;
        this.field3349 = var2.field3349;
        this.field3359 = var2.field3359;
        this.field3365 = var2.field3365;
        this.field3363 = var2.field3363;
        this.field3325 = var2.field3325;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V", line = 85)
    public final void method1553(int arg0) {
        field3348++;
        float var2 = class483.field6637[arg0 & 0x3FFF];
        float var3 = class483.field6629[arg0 & 0x3FFF];
        float var4 = this.field3359;
        float var5 = this.field3340;
        float var6 = this.field3352;
        this.field3359 = var2 * var4 - (this.field3363 * var3);
        float var7 = this.field3365;
        this.field3363 = this.field3363 * var2 + var3 * var4;
        this.field3340 = var2 * var5 - (this.field3333 * var3);
        this.field3352 = var2 * var6 - (this.field3360 * var3);
        this.field3333 = this.field3333 * var2 + var3 * var5;
        this.field3365 = var2 * var7 - this.field3325 * var3;
        this.field3360 = this.field3360 * var2 + var3 * var6;
        this.field3325 = this.field3325 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLjava/lang/String;)V", line = 117)
    public static final void method1554(byte arg0, String arg1) {
        field3341++;
        if (arg1.equals("") || arg0 >= -116) {
            return;
        }
        class622.field8781++;
        class302 var2 = class582.method3419(class427.field5929, (byte) 126, class626.field8901);
        var2.field4341.method2524(false, class389.method2339(arg1, true));
        var2.field4341.method2566(-2, arg1);
        class501.method2928(0, var2);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "([I)V", line = 137)
    public final void method1555(int[] arg0) {
        field3344++;
        float var2 = (float) arg0[0] - this.field3327;
        float var3 = (float) arg0[1] - this.field3365;
        float var4 = (float) arg0[2] - this.field3325;
        arg0[0] = (int) (this.field3363 * var4 + this.field3359 * var3 + this.field3346 * var2);
        arg0[1] = (int) (this.field3333 * var4 + this.field3340 * var3 + this.field3335 * var2);
        arg0[2] = (int) (this.field3360 * var4 + this.field3352 * var3 + this.field3349 * var2);
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "()Ldm;", line = 154)
    public final class765 method1556() {
        field3330++;
        class229 var1 = new class229();
        var1.field3325 = this.field3325;
        var1.field3346 = this.field3346;
        var1.field3365 = this.field3365;
        var1.field3333 = this.field3333;
        var1.field3340 = this.field3340;
        var1.field3360 = this.field3360;
        var1.field3327 = this.field3327;
        var1.field3359 = this.field3359;
        var1.field3352 = this.field3352;
        var1.field3349 = this.field3349;
        var1.field3335 = this.field3335;
        var1.field3363 = this.field3363;
        return var1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(FFIIZIF)V", line = 181)
    public final void method1557(float arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5, float arg6) {
        if (arg3 == 0) {
            this.field3340 = arg5;
            this.field3346 = arg2;
            this.field3360 = 1.0F;
            this.field3359 = this.field3363 = this.field3335 = this.field3333 = this.field3349 = this.field3352 = 0.0F;
        } else {
            float var8 = class483.field6637[arg3 & 0x3FFF];
            float var9 = class483.field6629[arg3 & 0x3FFF];
            this.field3346 = (float) arg2 * var8;
            this.field3360 = 1.0F;
            this.field3359 = (float) arg2 * var9;
            this.field3363 = this.field3333 = this.field3349 = this.field3352 = 0.0F;
            this.field3340 = (float) arg5 * var8;
            this.field3335 = (float) arg5 * -var9;
        }
        field3361++;
        this.field3365 = arg6;
        if (arg4) {
            this.method1569();
        }
        this.field3325 = arg0;
        this.field3327 = arg1;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(III)V", line = 216)
    public final void method1558(int arg0, int arg1, int arg2) {
        this.field3325 += arg2;
        field3358++;
        this.field3365 += arg1;
        this.field3327 += arg0;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(III[I)V", line = 227)
    public final void method1559(int arg0, int arg1, int arg2, int[] arg3) {
        field3329++;
        int var5 = (int) ((float) arg0 - this.field3327);
        int var6 = (int) ((float) arg1 - this.field3365);
        int var7 = (int) ((float) arg2 - this.field3325);
        arg3[2] = (int) ((float) var7 * this.field3360 + (float) var5 * this.field3349 + (float) var6 * this.field3352);
        arg3[1] = (int) ((float) var7 * this.field3333 + (float) var5 * this.field3335 + (float) var6 * this.field3340);
        arg3[0] = (int) ((float) var7 * this.field3363 + (float) var5 * this.field3346 + (float) var6 * this.field3359);
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V", line = 241)
    public final void method1560(int arg0) {
        field3342++;
        this.field3360 = 1.0F;
        this.field3346 = this.field3340 = class483.field6637[arg0 & 0x3FFF];
        this.field3359 = class483.field6629[arg0 & 0x3FFF];
        this.field3335 = -this.field3359;
        this.field3349 = this.field3327 = this.field3352 = this.field3365 = this.field3363 = this.field3333 = this.field3325 = 0.0F;
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V", line = 260)
    public final void method1561(int arg0) {
        this.field3340 = 1.0F;
        field3334++;
        this.field3346 = this.field3360 = class483.field6637[arg0 & 0x3FFF];
        this.field3349 = class483.field6629[arg0 & 0x3FFF];
        this.field3335 = this.field3327 = this.field3359 = this.field3352 = this.field3365 = this.field3333 = this.field3325 = 0.0F;
        this.field3363 = -this.field3349;
    }

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)V", line = 273)
    public final void method1562(int arg0) {
        this.field3346 = 1.0F;
        field3339++;
        this.field3340 = this.field3360 = class483.field6637[arg0 & 0x3FFF];
        this.field3333 = class483.field6629[arg0 & 0x3FFF];
        this.field3335 = this.field3349 = this.field3327 = this.field3359 = this.field3365 = this.field3363 = this.field3325 = 0.0F;
        this.field3352 = -this.field3333;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIBLka;I)Lmg;", line = 285)
    public static final class248 method1563(int arg0, int arg1, byte arg2, class233 arg3, int arg4) {
        field3367++;
        if (arg3 == null) {
            return null;
        } else {
            if (arg2 >= -96) {
                method1564(true, 85);
            }
            return new class248(arg4, arg1, arg0, arg3.method547(), arg3.method566(), arg3.method527(), arg3.method534(), arg3.method541(), arg3.method525(), arg3.method572());
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)Z", line = 302)
    public static final boolean method1564(boolean arg0, int arg1) {
        if (arg0) {
            field3357 = -128;
        }
        field3354++;
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLdm;)V", line = 322)
    public final void method1565(boolean arg0, class765 arg1) {
        field3332++;
        class229 var3 = (class229) arg1;
        this.field3349 = var3.field3363;
        this.field3335 = var3.field3359;
        this.field3346 = var3.field3346;
        this.field3359 = var3.field3335;
        this.field3340 = var3.field3340;
        this.field3363 = var3.field3349;
        this.field3352 = var3.field3333;
        this.field3327 = -(this.field3349 * var3.field3325 + this.field3346 * var3.field3327 + this.field3335 * var3.field3365);
        this.field3360 = var3.field3360;
        this.field3333 = var3.field3352;
        if (arg0) {
            this.field3365 = -(this.field3352 * var3.field3325 + this.field3359 * var3.field3327 + this.field3340 * var3.field3365);
            this.field3325 = -(this.field3360 * var3.field3325 + this.field3363 * var3.field3327 + this.field3333 * var3.field3365);
        }
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V", line = 354)
    public final void method1566(int arg0) {
        field3338++;
        float var2 = class483.field6637[arg0 & 0x3FFF];
        float var3 = class483.field6629[arg0 & 0x3FFF];
        float var4 = this.field3346;
        float var5 = this.field3335;
        float var6 = this.field3349;
        this.field3346 = this.field3363 * var3 + var2 * var4;
        float var7 = this.field3327;
        this.field3363 = this.field3363 * var2 - var3 * var4;
        this.field3335 = this.field3333 * var3 + var2 * var5;
        this.field3349 = this.field3360 * var3 + var2 * var6;
        this.field3333 = this.field3333 * var2 - (var3 * var5);
        this.field3327 = this.field3325 * var3 + var2 * var7;
        this.field3360 = this.field3360 * var2 - (var3 * var6);
        this.field3325 = this.field3325 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIII)V", line = 388)
    public final void method1567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3353++;
        float var7 = class483.field6637[arg3 & 0x3FFF];
        float var8 = class483.field6629[arg3 & 0x3FFF];
        float var9 = class483.field6637[arg4 & 0x3FFF];
        float var10 = class483.field6629[arg4 & 0x3FFF];
        float var11 = class483.field6637[arg5 & 0x3FFF];
        float var12 = class483.field6629[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3359 = -var9 * var12 + var10 * var13;
        this.field3352 = var9 * var13 + var10 * var12;
        this.field3333 = -var8;
        this.field3346 = var9 * var11 + var10 * var14;
        this.field3360 = var7 * var9;
        this.field3335 = var7 * var12;
        this.field3340 = var7 * var11;
        this.field3363 = var7 * var10;
        this.field3349 = -var10 * var11 + var9 * var14;
        this.field3327 = (float) (-arg0) * this.field3346 - (float) arg1 * this.field3335 - (float) arg2 * this.field3349;
        this.field3365 = (float) (-arg0) * this.field3359 - ((float) arg1 * this.field3340) - (float) arg2 * this.field3352;
        this.field3325 = (float) (-arg0) * this.field3363 - (float) arg1 * this.field3333 - ((float) arg2 * this.field3360);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V", line = 424)
    public final void method1568(int arg0, int arg1, int arg2) {
        this.field3346 = this.field3340 = this.field3360 = 1.0F;
        this.field3359 = this.field3363 = this.field3335 = this.field3333 = this.field3349 = this.field3352 = 0.0F;
        field3328++;
        this.field3365 = arg1;
        this.field3325 = arg2;
        this.field3327 = arg0;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "()V", line = 440)
    public final void method1569() {
        field3343++;
        this.field3359 = this.field3363 = this.field3335 = this.field3333 = this.field3349 = this.field3352 = this.field3327 = this.field3365 = this.field3325 = 0.0F;
        this.field3346 = this.field3340 = this.field3360 = 1.0F;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)[F", line = 454)
    public final float[] method1570(byte arg0) {
        class575.field8289[8] = this.field3349;
        class575.field8289[1] = this.field3359;
        class575.field8289[5] = this.field3340;
        class575.field8289[13] = 0.0F;
        class575.field8289[6] = this.field3333;
        class575.field8289[4] = this.field3335;
        int var2 = -9 / ((42 - arg0) / 62);
        class575.field8289[0] = this.field3346;
        field3368++;
        class575.field8289[9] = this.field3352;
        class575.field8289[2] = this.field3363;
        class575.field8289[12] = 0.0F;
        class575.field8289[10] = this.field3360;
        class575.field8289[14] = 0.0F;
        return class575.field8289;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(III[I)V", line = 477)
    public final void method1571(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field3360 + (float) arg0 * this.field3363 + (float) arg1 * this.field3333 + this.field3325);
        arg3[1] = (int) ((float) arg2 * this.field3352 + (float) arg0 * this.field3359 + (float) arg1 * this.field3340 + this.field3365);
        arg3[0] = (int) ((float) arg2 * this.field3349 + (float) arg0 * this.field3346 + (float) arg1 * this.field3335 + this.field3327);
        field3336++;
    }

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "(I)[F", line = 493)
    public final float[] method1572(int arg0) {
        class575.field8289[13] = this.field3365;
        int var2 = 36 % ((20 - arg0) / 46);
        class575.field8289[14] = this.field3325;
        class575.field8289[6] = this.field3333;
        class575.field8289[1] = this.field3359;
        class575.field8289[5] = this.field3340;
        class575.field8289[4] = this.field3335;
        field3345++;
        class575.field8289[9] = this.field3352;
        class575.field8289[2] = this.field3363;
        class575.field8289[12] = this.field3327;
        class575.field8289[10] = this.field3360;
        class575.field8289[0] = this.field3346;
        class575.field8289[8] = this.field3349;
        return class575.field8289;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V", line = 514)
    public class229() {
        this.method1569();
    }

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "(I)V", line = 522)
    public static void method1573(int arg0) {
        field3356 = null;
        field3362 = null;
        field3350 = null;
        field3347 = null;
        field3355 = null;
        if (arg0 > -103) {
            field3356 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(FF[FFFB)V", line = 536)
    public final void method1574(float arg0, float arg1, float[] arg2, float arg3, float arg4, byte arg5) {
        field3366++;
        if (arg5 != -34) {
            return;
        }
        arg2[2] = this.field3360 * arg0 + this.field3363 * arg4 + this.field3333 * arg3;
        arg2[0] = this.field3349 * arg0 + this.field3346 * arg4 + this.field3335 * arg3;
        float var8;
        float var9;
        float var10;
        if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var12 = -arg1 / arg4;
            var10 = this.field3363 * var12 + this.field3325;
            var8 = this.field3346 * var12 + this.field3327;
            var9 = this.field3359 * var12 + this.field3365;
        } else if ((arg3 > 0.00390625F) || (arg3 < -0.00390625F)) {
            float var11 = -arg1 / arg3;
            var9 = this.field3340 * var11 + this.field3365;
            var10 = this.field3333 * var11 + this.field3325;
            var8 = this.field3335 * var11 + this.field3327;
        } else {
            float var7 = -arg1 / arg0;
            var8 = this.field3349 * var7 + this.field3327;
            var9 = this.field3352 * var7 + this.field3365;
            var10 = this.field3360 * var7 + this.field3325;
        }
        arg2[1] = this.field3352 * arg0 + this.field3359 * arg4 + this.field3340 * arg3;
        arg2[3] = -(arg2[2] * var10 + arg2[0] * var8 + arg2[1] * var9);
    }
}
