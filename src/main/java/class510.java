import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class510 extends class394 {

    @OriginalMember(owner = "client!cba", name = "O", descriptor = "I")
    public static int field7457 = -1;

    @OriginalMember(owner = "client!cba", name = "J", descriptor = "Lhu;")
    public static class115 field7452 = new class115("", 12);

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "F")
    public float field7424;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "F")
    public float field7426;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "F")
    public float field7429;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "F")
    public float field7432;

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "F")
    public float field7434;

    @OriginalMember(owner = "client!cba", name = "x", descriptor = "F")
    public float field7440;

    @OriginalMember(owner = "client!cba", name = "y", descriptor = "F")
    public float field7441;

    @OriginalMember(owner = "client!cba", name = "z", descriptor = "F")
    public float field7442;

    @OriginalMember(owner = "client!cba", name = "A", descriptor = "F")
    public static float field7443;

    @OriginalMember(owner = "client!cba", name = "G", descriptor = "F")
    public float field7449;

    @OriginalMember(owner = "client!cba", name = "K", descriptor = "F")
    public float field7453;

    @OriginalMember(owner = "client!cba", name = "L", descriptor = "F")
    public float field7454;

    @OriginalMember(owner = "client!cba", name = "M", descriptor = "F")
    public float field7455;

    @OriginalMember(owner = "client!cba", name = "V", descriptor = "F")
    public static float field7464;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!cba", name = "t", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!cba", name = "u", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!cba", name = "v", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!cba", name = "w", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!cba", name = "B", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!cba", name = "C", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!cba", name = "D", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!cba", name = "E", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!cba", name = "F", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!cba", name = "H", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!cba", name = "I", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!cba", name = "N", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!cba", name = "P", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!cba", name = "Q", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!cba", name = "R", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!cba", name = "S", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!cba", name = "T", descriptor = "I")
    public static int field7462;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cba", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field7465;

    @OriginalMember(owner = "client!cba", name = "U", descriptor = "[I")
    public static int[] field7463;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3027(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cba", name = "YA", descriptor = "([I)V", line = 3)
    public final void method709(int[] arg0) {
        field7425++;
        float var2 = (float) arg0[0] - this.field7441;
        float var3 = (float) arg0[1] - this.field7434;
        float var4 = (float) arg0[2] - this.field7455;
        arg0[0] = (int) (this.field7426 * var4 + this.field7454 * var3 + this.field7432 * var2);
        arg0[2] = (int) (this.field7442 * var4 + this.field7453 * var2 + this.field7449 * var3);
        arg0[1] = (int) (this.field7429 * var4 + this.field7440 * var2 + this.field7424 * var3);
    }

    @OriginalMember(owner = "client!cba", name = "M", descriptor = "(Lq;)V", line = 19)
    public final void method711(class394 arg0) {
        field7436++;
        class510 var2 = (class510) arg0;
        this.field7440 = var2.field7440;
        this.field7429 = var2.field7429;
        this.field7434 = var2.field7434;
        this.field7453 = var2.field7453;
        this.field7455 = var2.field7455;
        this.field7454 = var2.field7454;
        this.field7442 = var2.field7442;
        this.field7426 = var2.field7426;
        this.field7449 = var2.field7449;
        this.field7432 = var2.field7432;
        this.field7441 = var2.field7441;
        this.field7424 = var2.field7424;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lhea;", line = 41)
    public static final class390 method3018(Component arg0, int arg1, boolean arg2) {
        field7428++;
        if (arg1 != 0) {
            return null;
        }
        try {
            Constructor var3 = Class.forName("pm").getDeclaredConstructor(field7465 == null ? (field7465 = method3027("java.awt.Component")) : field7465, Boolean.TYPE);
            return (class390) var3.newInstance(arg0, Boolean.valueOf(arg2));
        } catch (Throwable var4) {
            return new class221(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!cba", name = "DA", descriptor = "(III[I)V", line = 58)
    public final void method725(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field7441);
        int var6 = (int) ((float) arg1 - this.field7434);
        field7433++;
        int var7 = (int) ((float) arg2 - this.field7455);
        arg3[1] = (int) ((float) var7 * this.field7429 + (float) var5 * this.field7440 + (float) var6 * this.field7424);
        arg3[0] = (int) ((float) var7 * this.field7426 + (float) var5 * this.field7432 + (float) var6 * this.field7454);
        arg3[2] = (int) ((float) var7 * this.field7442 + (float) var5 * this.field7453 + (float) var6 * this.field7449);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(III[I)V", line = 74)
    public final void method720(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field7453 + (float) arg0 * this.field7432 + (float) arg1 * this.field7440 + this.field7441);
        arg3[2] = (int) ((float) arg2 * this.field7442 + (float) arg0 * this.field7426 + (float) arg1 * this.field7429 + this.field7455);
        field7435++;
        arg3[1] = (int) ((float) arg2 * this.field7449 + (float) arg0 * this.field7454 + (float) arg1 * this.field7424 + this.field7434);
    }

    @OriginalMember(owner = "client!cba", name = "Y", descriptor = "()V", line = 84)
    public final void method710() {
        this.field7454 = this.field7426 = this.field7440 = this.field7429 = this.field7453 = this.field7449 = this.field7441 = this.field7434 = this.field7455 = 0.0F;
        this.field7432 = this.field7424 = this.field7442 = 1.0F;
        field7438++;
    }

    @OriginalMember(owner = "client!cba", name = "U", descriptor = "(III)V", line = 94)
    public final void method723(int arg0, int arg1, int arg2) {
        this.field7441 += arg0;
        this.field7434 += arg1;
        this.field7455 += arg2;
        field7437++;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(B)V", line = 105)
    public final void method3019(byte arg0) {
        this.field7429 = -this.field7429;
        this.field7442 = -this.field7442;
        this.field7455 = -this.field7455;
        this.field7454 = -this.field7454;
        this.field7426 = -this.field7426;
        this.field7434 = -this.field7434;
        this.field7424 = -this.field7424;
        if (arg0 > -89) {
            this.method710();
        }
        field7448++;
        this.field7449 = -this.field7449;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIFIFFI)V", line = 123)
    public final void method3020(int arg0, int arg1, float arg2, int arg3, float arg4, float arg5, int arg6) {
        if (arg0 == 0) {
            this.field7442 = 1.0F;
            this.field7454 = this.field7426 = this.field7440 = this.field7429 = this.field7453 = this.field7449 = 0.0F;
            this.field7432 = arg1;
            this.field7424 = arg3;
        } else {
            float var8 = class201.field2429[arg0 & 0x3FFF];
            float var9 = class201.field2423[arg0 & 0x3FFF];
            this.field7424 = (float) arg3 * var8;
            this.field7454 = (float) arg1 * var9;
            this.field7426 = this.field7429 = this.field7453 = this.field7449 = 0.0F;
            this.field7432 = (float) arg1 * var8;
            this.field7442 = 1.0F;
            this.field7440 = (float) arg3 * -var9;
        }
        field7446++;
        if (arg6 == 1) {
            this.field7434 = arg4;
            this.field7441 = arg5;
            this.field7455 = arg2;
        }
    }

    @OriginalMember(owner = "client!cba", name = "wa", descriptor = "(III[I)V", line = 161)
    public final void method717(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field7449 + (float) arg0 * this.field7454 + (float) arg1 * this.field7424);
        arg3[2] = (int) ((float) arg2 * this.field7442 + (float) arg0 * this.field7426 + (float) arg1 * this.field7429);
        arg3[0] = (int) ((float) arg2 * this.field7453 + (float) arg0 * this.field7432 + (float) arg1 * this.field7440);
        field7444++;
    }

    @OriginalMember(owner = "client!cba", name = "w", descriptor = "(I)V", line = 173)
    public final void method713(int arg0) {
        field7450++;
        float var2 = class201.field2429[arg0 & 0x3FFF];
        float var3 = class201.field2423[arg0 & 0x3FFF];
        float var4 = this.field7454;
        float var5 = this.field7424;
        float var6 = this.field7449;
        this.field7454 = var2 * var4 - this.field7426 * var3;
        float var7 = this.field7434;
        this.field7424 = var2 * var5 - this.field7429 * var3;
        this.field7426 = this.field7426 * var2 + var3 * var4;
        this.field7449 = var2 * var6 - this.field7442 * var3;
        this.field7429 = this.field7429 * var2 + var3 * var5;
        this.field7442 = this.field7442 * var2 + var3 * var6;
        this.field7434 = var2 * var7 - (this.field7455 * var3);
        this.field7455 = this.field7455 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(FFZ[FFF)V", line = 200)
    public final void method3021(float arg0, float arg1, boolean arg2, float[] arg3, float arg4, float arg5) {
        field7447++;
        float var8;
        float var9;
        float var10;
        if ((arg1 > 0.00390625F) || (arg1 < -0.00390625F)) {
            float var12 = -arg4 / arg1;
            var10 = this.field7454 * var12 + this.field7434;
            var9 = this.field7426 * var12 + this.field7455;
            var8 = this.field7432 * var12 + this.field7441;
        } else if ((arg0 > 0.00390625F) || (arg0 < -0.00390625F)) {
            float var11 = -arg4 / arg0;
            var10 = this.field7424 * var11 + this.field7434;
            var8 = this.field7440 * var11 + this.field7441;
            var9 = this.field7429 * var11 + this.field7455;
        } else {
            float var7 = -arg4 / arg5;
            var8 = this.field7453 * var7 + this.field7441;
            var9 = this.field7442 * var7 + this.field7455;
            var10 = this.field7449 * var7 + this.field7434;
        }
        arg3[0] = this.field7453 * arg5 + this.field7440 * arg0 + this.field7432 * arg1;
        arg3[1] = this.field7449 * arg5 + this.field7454 * arg1 + this.field7424 * arg0;
        arg3[2] = this.field7442 * arg5 + this.field7429 * arg0 + this.field7426 * arg1;
        if (arg2) {
            this.field7440 = 1.5816993F;
        }
        arg3[3] = -(arg3[2] * var9 + arg3[1] * var10 + arg3[0] * var8);
    }

    @OriginalMember(owner = "client!cba", name = "J", descriptor = "(I)V", line = 245)
    public final void method722(int arg0) {
        this.field7442 = 1.0F;
        field7445++;
        this.field7432 = this.field7424 = class201.field2429[arg0 & 0x3FFF];
        this.field7454 = class201.field2423[arg0 & 0x3FFF];
        this.field7453 = this.field7441 = this.field7449 = this.field7434 = this.field7426 = this.field7429 = this.field7455 = 0.0F;
        this.field7440 = -this.field7454;
    }

    @OriginalMember(owner = "client!cba", name = "na", descriptor = "(IIIIII)V", line = 260)
    public final void method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7462++;
        float var7 = class201.field2429[arg3 & 0x3FFF];
        float var8 = class201.field2423[arg3 & 0x3FFF];
        float var9 = class201.field2429[arg4 & 0x3FFF];
        float var10 = class201.field2423[arg4 & 0x3FFF];
        float var11 = class201.field2429[arg5 & 0x3FFF];
        float var12 = class201.field2423[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field7440 = var7 * var12;
        this.field7424 = var7 * var11;
        this.field7432 = var9 * var11 + var10 * var14;
        this.field7426 = var7 * var10;
        this.field7442 = var7 * var9;
        this.field7453 = -var10 * var11 + var9 * var14;
        this.field7449 = var9 * var13 + var10 * var12;
        this.field7429 = -var8;
        this.field7454 = -var9 * var12 + var10 * var13;
        this.field7455 = (float) (-arg0) * this.field7426 - ((float) arg1 * this.field7429) - ((float) arg2 * this.field7442);
        this.field7441 = (float) (-arg0) * this.field7432 - (float) arg1 * this.field7440 - (float) arg2 * this.field7453;
        this.field7434 = (float) (-arg0) * this.field7454 - ((float) arg1 * this.field7424) - ((float) arg2 * this.field7449);
    }

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "(I)V", line = 299)
    public final void method724(int arg0) {
        field7427++;
        this.field7424 = 1.0F;
        this.field7432 = this.field7442 = class201.field2429[arg0 & 0x3FFF];
        this.field7453 = class201.field2423[arg0 & 0x3FFF];
        this.field7440 = this.field7441 = this.field7454 = this.field7449 = this.field7434 = this.field7429 = this.field7455 = 0.0F;
        this.field7426 = -this.field7453;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "()Lq;", line = 311)
    public final class394 method708() {
        field7430++;
        class510 var1 = new class510();
        var1.field7449 = this.field7449;
        var1.field7424 = this.field7424;
        var1.field7441 = this.field7441;
        var1.field7432 = this.field7432;
        var1.field7453 = this.field7453;
        var1.field7442 = this.field7442;
        var1.field7455 = this.field7455;
        var1.field7429 = this.field7429;
        var1.field7440 = this.field7440;
        var1.field7454 = this.field7454;
        var1.field7426 = this.field7426;
        var1.field7434 = this.field7434;
        return var1;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)[F", line = 333)
    public final float[] method3022(int arg0) {
        class531.field7753[9] = this.field7449;
        class531.field7753[4] = this.field7440;
        class531.field7753[12] = this.field7441;
        field7460++;
        class531.field7753[13] = this.field7434;
        class531.field7753[1] = this.field7454;
        class531.field7753[14] = this.field7455;
        if (arg0 >= -59) {
            this.field7432 = 1.5250176F;
        }
        class531.field7753[8] = this.field7453;
        class531.field7753[10] = this.field7442;
        class531.field7753[5] = this.field7424;
        class531.field7753[0] = this.field7432;
        class531.field7753[2] = this.field7426;
        class531.field7753[6] = this.field7429;
        return class531.field7753;
    }

    @OriginalMember(owner = "client!cba", name = "ZA", descriptor = "(I)V", line = 357)
    public final void method714(int arg0) {
        field7431++;
        float var2 = class201.field2429[arg0 & 0x3FFF];
        float var3 = class201.field2423[arg0 & 0x3FFF];
        float var4 = this.field7432;
        float var5 = this.field7440;
        float var6 = this.field7453;
        this.field7432 = this.field7426 * var3 + var2 * var4;
        float var7 = this.field7441;
        this.field7440 = this.field7429 * var3 + var2 * var5;
        this.field7426 = this.field7426 * var2 - var3 * var4;
        this.field7429 = this.field7429 * var2 - (var3 * var5);
        this.field7453 = this.field7442 * var3 + var2 * var6;
        this.field7442 = this.field7442 * var2 - (var3 * var6);
        this.field7441 = this.field7455 * var3 + var2 * var7;
        this.field7455 = this.field7455 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lq;I)V", line = 385)
    public final void method3023(class394 arg0, int arg1) {
        field7456++;
        class510 var3 = (class510) arg0;
        this.field7440 = var3.field7454;
        this.field7432 = var3.field7432;
        this.field7453 = var3.field7426;
        this.field7426 = var3.field7453;
        this.field7449 = var3.field7429;
        if (arg1 != 14) {
            return;
        }
        this.field7454 = var3.field7440;
        this.field7424 = var3.field7424;
        this.field7442 = var3.field7442;
        this.field7441 = -(this.field7453 * var3.field7455 + this.field7440 * var3.field7434 + this.field7432 * var3.field7441);
        this.field7429 = var3.field7449;
        this.field7434 = -(this.field7449 * var3.field7455 + this.field7454 * var3.field7441 + this.field7424 * var3.field7434);
        this.field7455 = -(this.field7442 * var3.field7455 + this.field7429 * var3.field7434 + this.field7426 * var3.field7441);
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(B)V", line = 411)
    public static void method3024(byte arg0) {
        if (arg0 != 62) {
            method3018(null, 81, true);
        }
        field7452 = null;
        field7463 = null;
    }

    @OriginalMember(owner = "client!cba", name = "AA", descriptor = "(I)V", line = 427)
    public final void method718(int arg0) {
        field7461++;
        float var2 = class201.field2429[arg0 & 0x3FFF];
        float var3 = class201.field2423[arg0 & 0x3FFF];
        float var4 = this.field7432;
        float var5 = this.field7440;
        float var6 = this.field7453;
        float var7 = this.field7441;
        this.field7432 = var2 * var4 - (this.field7454 * var3);
        this.field7440 = var2 * var5 - (this.field7424 * var3);
        this.field7454 = this.field7454 * var2 + var3 * var4;
        this.field7424 = this.field7424 * var2 + var3 * var5;
        this.field7453 = var2 * var6 - (this.field7449 * var3);
        this.field7449 = this.field7449 * var2 + var3 * var6;
        this.field7441 = var2 * var7 - (this.field7434 * var3);
        this.field7434 = this.field7434 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!cba", name = "oa", descriptor = "(I)V", line = 464)
    public final void method721(int arg0) {
        field7458++;
        this.field7432 = 1.0F;
        this.field7424 = this.field7442 = class201.field2429[arg0 & 0x3FFF];
        this.field7429 = class201.field2423[arg0 & 0x3FFF];
        this.field7440 = this.field7453 = this.field7441 = this.field7454 = this.field7434 = this.field7426 = this.field7455 = 0.0F;
        this.field7449 = -this.field7429;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 476)
    public static final void method3025(String arg0, int arg1) {
        field7459++;
        if (arg0 == null) {
            return;
        }
        if (!(class700.field9897 < 200 || class626.field8987) || class700.field9897 >= 200) {
            class175.method1103((byte) 38, 4, class424.field6048.method2561(class370.field4980, arg1 ^ 0x1));
            String var2 = class424.field6049.method2561(class370.field4980, 0);
            if (var2 != null) {
                class175.method1103((byte) 38, 4, var2);
            }
            return;
        }
        String var3 = class399.method2414(arg0, false);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class700.field9897; var4++) {
            String var9 = class399.method2414(class529.field7730[var4], false);
            if (var9 != null && var9.equals(var3)) {
                class175.method1103((byte) 38, 4, arg0 + class424.field6076.method2561(class370.field4980, arg1 - 1));
                return;
            }
            if (class173.field2125[var4] != null) {
                String var10 = class399.method2414(class173.field2125[var4], false);
                if (var10 != null && var10.equals(var3)) {
                    class175.method1103((byte) 38, 4, arg0 + class424.field6076.method2561(class370.field4980, 0));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class230.field3000; var5++) {
            String var7 = class399.method2414(class100.field1340[var5], false);
            if (var7 != null && var7.equals(var3)) {
                class175.method1103((byte) 38, 4, class424.field6081.method2561(class370.field4980, 0) + arg0 + class424.field6082.method2561(class370.field4980, 0));
                return;
            }
            if (class405.field5735[var5] != null) {
                String var8 = class399.method2414(class405.field5735[var5], false);
                if (var8 != null && var8.equals(var3)) {
                    class175.method1103((byte) 38, 4, class424.field6081.method2561(class370.field4980, 0) + arg0 + class424.field6082.method2561(class370.field4980, 0));
                    return;
                }
            }
        }
        if (class399.method2414(class206.field2472.field8801, false).equals(var3)) {
            class175.method1103((byte) 38, 4, class424.field6079.method2561(class370.field4980, arg1 ^ 0x1));
        } else if (arg1 == 1) {
            class333.field4427++;
            class543 var6 = class299.method1780(class84.field1196, class57.field894, 76);
            var6.field7872.method2281((byte) 58, class251.method1534(arg0, (byte) 127));
            var6.field7872.method2269(arg0, -105);
            class511.method3028(arg1 ^ 0x1D3B, var6);
        }
    }

    @OriginalMember(owner = "client!cba", name = "NA", descriptor = "(III)V", line = 583)
    public final void method712(int arg0, int arg1, int arg2) {
        this.field7441 = arg0;
        this.field7455 = arg2;
        this.field7432 = this.field7424 = this.field7442 = 1.0F;
        this.field7434 = arg1;
        this.field7454 = this.field7426 = this.field7440 = this.field7429 = this.field7453 = this.field7449 = 0.0F;
        field7439++;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "()V", line = 601)
    public class510() {
        this.method710();
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)[F", line = 611)
    public final float[] method3026(boolean arg0) {
        class531.field7753[6] = this.field7429;
        class531.field7753[12] = 0.0F;
        class531.field7753[14] = 0.0F;
        class531.field7753[4] = this.field7440;
        class531.field7753[0] = this.field7432;
        if (!arg0) {
            return null;
        }
        class531.field7753[1] = this.field7454;
        class531.field7753[10] = this.field7442;
        class531.field7753[9] = this.field7449;
        class531.field7753[2] = this.field7426;
        class531.field7753[13] = 0.0F;
        class531.field7753[5] = this.field7424;
        class531.field7753[8] = this.field7453;
        field7451++;
        return class531.field7753;
    }
}
