import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class35 extends class12 {

    @OriginalMember(owner = "client!lha", name = "p", descriptor = "Laf;")
    public static class39 field343 = new class39(3000000, 200);

    @OriginalMember(owner = "client!lha", name = "g", descriptor = "F")
    public float field334;

    @OriginalMember(owner = "client!lha", name = "j", descriptor = "F")
    public float field337;

    @OriginalMember(owner = "client!lha", name = "t", descriptor = "F")
    public float field347;

    @OriginalMember(owner = "client!lha", name = "x", descriptor = "F")
    public float field351;

    @OriginalMember(owner = "client!lha", name = "B", descriptor = "F")
    public float field355;

    @OriginalMember(owner = "client!lha", name = "C", descriptor = "F")
    public float field356;

    @OriginalMember(owner = "client!lha", name = "D", descriptor = "F")
    public float field357;

    @OriginalMember(owner = "client!lha", name = "L", descriptor = "F")
    public float field365;

    @OriginalMember(owner = "client!lha", name = "M", descriptor = "F")
    public float field366;

    @OriginalMember(owner = "client!lha", name = "Q", descriptor = "F")
    public float field370;

    @OriginalMember(owner = "client!lha", name = "S", descriptor = "F")
    public float field372;

    @OriginalMember(owner = "client!lha", name = "T", descriptor = "F")
    public float field373;

    @OriginalMember(owner = "client!lha", name = "f", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!lha", name = "h", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!lha", name = "i", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!lha", name = "l", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!lha", name = "m", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!lha", name = "n", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!lha", name = "o", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!lha", name = "q", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!lha", name = "r", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!lha", name = "s", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!lha", name = "u", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!lha", name = "v", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!lha", name = "w", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!lha", name = "y", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!lha", name = "z", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!lha", name = "E", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!lha", name = "G", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!lha", name = "H", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!lha", name = "I", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!lha", name = "J", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!lha", name = "K", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!lha", name = "O", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!lha", name = "P", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!lha", name = "R", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!lha", name = "U", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!lha", name = "V", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!lha", name = "W", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!lha", name = "F", descriptor = "Lae;")
    public static class283 field359;

    @OriginalMember(owner = "client!lha", name = "A", descriptor = "Lkb;")
    public static class495 field354;

    @OriginalMember(owner = "client!lha", name = "N", descriptor = "Lgia;")
    public static class512 field367;

    @OriginalMember(owner = "client!lha", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field338;

    @OriginalMember(owner = "client!lha", name = "e", descriptor = "(I)V")
    public final void method51(int arg0) {
        field360++;
        float var2 = class281.field4029[arg0 & 0x3FFF];
        float var3 = class281.field4032[arg0 & 0x3FFF];
        float var4 = this.field337;
        float var5 = this.field370;
        float var6 = this.field372;
        this.field337 = this.field334 * var3 + var2 * var4;
        float var7 = this.field351;
        this.field370 = this.field365 * var3 + var2 * var5;
        this.field334 = this.field334 * var2 - var3 * var4;
        this.field372 = this.field355 * var3 + var2 * var6;
        this.field365 = this.field365 * var2 - var3 * var5;
        this.field355 = this.field355 * var2 - (var3 * var6);
        this.field351 = this.field366 * var3 + var2 * var7;
        this.field366 = this.field366 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!lha", name = "g", descriptor = "(I)[F")
    public final float[] method281(int arg0) {
        class265.field3855[14] = this.field366;
        class265.field3855[12] = this.field351;
        class265.field3855[9] = this.field356;
        class265.field3855[4] = this.field370;
        class265.field3855[2] = this.field334;
        if (arg0 != -27708) {
            return null;
        }
        class265.field3855[8] = this.field372;
        class265.field3855[13] = this.field357;
        field374++;
        class265.field3855[5] = this.field373;
        class265.field3855[6] = this.field365;
        class265.field3855[1] = this.field347;
        class265.field3855[10] = this.field355;
        class265.field3855[0] = this.field337;
        return class265.field3855;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "([BI)Lraa;")
    public static final class508 method282(byte[] arg0, int arg1) {
        field349++;
        class508 var2 = new class508();
        class511 var3 = new class511(arg0);
        var3.field6962 = var3.field6979.length - 2;
        int var4 = var3.method3002(-1);
        int var5 = var3.field6979.length - var4 - 2 - 16;
        var3.field6962 = var5;
        int var6 = var3.method3008(64);
        var2.field6896 = var3.method3002(-1);
        var2.field6895 = var3.method3002(-1);
        var2.field6899 = var3.method3002(-1);
        var2.field6894 = var3.method3002(-1);
        var2.field6891 = var3.method3002(~arg1);
        var2.field6892 = var3.method3002(-1);
        int var7 = var3.method3013(arg1 - 113);
        if (var7 > 0) {
            var2.field6893 = new class638[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method3002(-1);
                class638 var10 = new class638(class179.method1142(var9, 64));
                var2.field6893[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method3008(64);
                    int var12 = var3.method3008(arg1 + 64);
                    var10.method3666((byte) 65, (long) var11, new class324(var12));
                }
            }
        }
        var3.field6962 = 0;
        var2.field6897 = var3.method2998((byte) -111);
        var2.field6888 = new int[var6];
        int var13 = arg1;
        while (var3.field6962 < var5) {
            int var14 = var3.method3002(arg1 - 1);
            if (var14 == 3) {
                if (var2.field6890 == null) {
                    var2.field6890 = new String[var6];
                }
                var2.field6890[var13] = var3.method2993((byte) -49).intern();
            } else if (var14 == 54) {
                if (var2.field6898 == null) {
                    var2.field6898 = new long[var6];
                }
                var2.field6898[var13] = var3.method3020(true);
            } else {
                if (var2.field6889 == null) {
                    var2.field6889 = new int[var6];
                }
                if (var14 >= 150 || var14 == 21 || var14 == 38 || var14 == 39) {
                    var2.field6889[var13] = var3.method3013(-124);
                } else {
                    var2.field6889[var13] = var3.method3008(64);
                }
            }
            var2.field6888[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lha", name = "h", descriptor = "(I)V")
    public final void method283(int arg0) {
        this.field373 = -this.field373;
        if (arg0 != 16383) {
            this.method42();
        }
        this.field334 = -this.field334;
        this.field356 = -this.field356;
        this.field347 = -this.field347;
        this.field366 = -this.field366;
        this.field365 = -this.field365;
        field369++;
        this.field355 = -this.field355;
        this.field357 = -this.field357;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Loo;)V")
    public final void method49(class12 arg0) {
        field335++;
        class35 var2 = (class35) arg0;
        this.field347 = var2.field347;
        this.field351 = var2.field351;
        this.field337 = var2.field337;
        this.field370 = var2.field370;
        this.field365 = var2.field365;
        this.field334 = var2.field334;
        this.field366 = var2.field366;
        this.field356 = var2.field356;
        this.field373 = var2.field373;
        this.field357 = var2.field357;
        this.field355 = var2.field355;
        this.field372 = var2.field372;
    }

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "(I)V")
    public final void method45(int arg0) {
        field358++;
        float var2 = class281.field4029[arg0 & 0x3FFF];
        float var3 = class281.field4032[arg0 & 0x3FFF];
        float var4 = this.field337;
        float var5 = this.field370;
        float var6 = this.field372;
        float var7 = this.field351;
        this.field337 = var2 * var4 - (this.field347 * var3);
        this.field370 = var2 * var5 - this.field373 * var3;
        this.field347 = this.field347 * var2 + var3 * var4;
        this.field373 = this.field373 * var2 + var3 * var5;
        this.field372 = var2 * var6 - this.field356 * var3;
        this.field356 = this.field356 * var2 + var3 * var6;
        this.field351 = var2 * var7 - this.field357 * var3;
        this.field357 = this.field357 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIIII)V")
    public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field361++;
        float var7 = class281.field4029[arg3 & 0x3FFF];
        float var8 = class281.field4032[arg3 & 0x3FFF];
        float var9 = class281.field4029[arg4 & 0x3FFF];
        float var10 = class281.field4032[arg4 & 0x3FFF];
        float var11 = class281.field4029[arg5 & 0x3FFF];
        float var12 = class281.field4032[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field373 = var7 * var11;
        this.field370 = var7 * var12;
        this.field355 = var7 * var9;
        this.field356 = var9 * var13 + var10 * var12;
        this.field337 = var9 * var11 + var10 * var14;
        this.field365 = -var8;
        this.field334 = var7 * var10;
        this.field372 = -var10 * var11 + var9 * var14;
        this.field347 = -var9 * var12 + var10 * var13;
        this.field357 = (float) (-arg0) * this.field347 - (float) arg1 * this.field373 - (float) arg2 * this.field356;
        this.field351 = (float) (-arg0) * this.field337 - (float) arg1 * this.field370 - (float) arg2 * this.field372;
        this.field366 = (float) (-arg0) * this.field334 - (float) arg1 * this.field365 - (float) arg2 * this.field355;
    }

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "(III[I)V")
    public final void method48(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field351);
        field368++;
        int var6 = (int) ((float) arg2 - this.field366);
        int var7 = (int) ((float) arg1 - this.field357);
        arg3[2] = (int) ((float) var6 * this.field355 + (float) var5 * this.field372 + (float) var7 * this.field356);
        arg3[0] = (int) ((float) var6 * this.field334 + (float) var5 * this.field337 + (float) var7 * this.field347);
        arg3[1] = (int) ((float) var6 * this.field365 + (float) var5 * this.field370 + (float) var7 * this.field373);
    }

    @OriginalMember(owner = "client!lha", name = "d", descriptor = "(I)V")
    public final void method46(int arg0) {
        field342++;
        this.field355 = 1.0F;
        this.field337 = this.field373 = class281.field4029[arg0 & 0x3FFF];
        this.field347 = class281.field4032[arg0 & 0x3FFF];
        this.field370 = -this.field347;
        this.field372 = this.field351 = this.field356 = this.field357 = this.field334 = this.field365 = this.field366 = 0.0F;
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)V")
    public final void method40(int arg0) {
        field363++;
        this.field337 = 1.0F;
        this.field373 = this.field355 = class281.field4029[arg0 & 0x3FFF];
        this.field365 = class281.field4032[arg0 & 0x3FFF];
        this.field356 = -this.field365;
        this.field370 = this.field372 = this.field351 = this.field347 = this.field357 = this.field334 = this.field366 = 0.0F;
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(III)V")
    public final void method50(int arg0, int arg1, int arg2) {
        this.field357 = arg1;
        this.field366 = arg2;
        this.field347 = this.field334 = this.field370 = this.field365 = this.field372 = this.field356 = 0.0F;
        this.field351 = arg0;
        this.field337 = this.field373 = this.field355 = 1.0F;
        field345++;
    }

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "()V")
    public static final void method284() {
        class322.method2042(1, class266.field3869);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lha;I)V")
    public static final void method285(class473 arg0, int arg1) {
        if (arg1 < 107) {
            return;
        }
        if (class263.field3850) {
            class468.method2798(-128, arg0);
        } else {
            class201.method1298(16, arg0);
        }
        field340++;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "([I)V")
    public final void method34(int[] arg0) {
        field353++;
        float var2 = (float) arg0[0] - this.field351;
        float var3 = (float) arg0[1] - this.field357;
        float var4 = (float) arg0[2] - this.field366;
        arg0[1] = (int) (this.field365 * var4 + this.field373 * var3 + this.field370 * var2);
        arg0[2] = (int) (this.field355 * var4 + this.field372 * var2 + this.field356 * var3);
        arg0[0] = (int) (this.field334 * var4 + this.field347 * var3 + this.field337 * var2);
    }

    @OriginalMember(owner = "client!lha", name = "f", descriptor = "(I)V")
    public final void method52(int arg0) {
        field364++;
        float var2 = class281.field4029[arg0 & 0x3FFF];
        float var3 = class281.field4032[arg0 & 0x3FFF];
        float var4 = this.field347;
        float var5 = this.field373;
        float var6 = this.field356;
        float var7 = this.field357;
        this.field347 = var2 * var4 - this.field334 * var3;
        this.field373 = var2 * var5 - this.field365 * var3;
        this.field334 = this.field334 * var2 + var3 * var4;
        this.field365 = this.field365 * var2 + var3 * var5;
        this.field356 = var2 * var6 - (this.field355 * var3);
        this.field355 = this.field355 * var2 + var3 * var6;
        this.field357 = var2 * var7 - (this.field366 * var3);
        this.field366 = this.field366 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(III[I)V")
    public final void method43(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field355 + (float) arg0 * this.field334 + (float) arg1 * this.field365);
        field333++;
        arg3[0] = (int) ((float) arg2 * this.field372 + (float) arg0 * this.field337 + (float) arg1 * this.field370);
        arg3[1] = (int) ((float) arg2 * this.field356 + (float) arg0 * this.field347 + (float) arg1 * this.field373);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "()Loo;")
    public final class12 method37() {
        field348++;
        class35 var1 = new class35();
        var1.field347 = this.field347;
        var1.field372 = this.field372;
        var1.field355 = this.field355;
        var1.field351 = this.field351;
        var1.field356 = this.field356;
        var1.field373 = this.field373;
        var1.field366 = this.field366;
        var1.field334 = this.field334;
        var1.field365 = this.field365;
        var1.field337 = this.field337;
        var1.field357 = this.field357;
        var1.field370 = this.field370;
        return var1;
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "()V")
    public final void method42() {
        this.field337 = this.field373 = this.field355 = 1.0F;
        field376++;
        this.field347 = this.field334 = this.field370 = this.field365 = this.field372 = this.field356 = this.field351 = this.field357 = this.field366 = 0.0F;
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(B)[F")
    public final float[] method286(byte arg0) {
        class265.field3855[1] = this.field347;
        class265.field3855[0] = this.field337;
        class265.field3855[9] = this.field356;
        class265.field3855[6] = this.field365;
        class265.field3855[12] = 0.0F;
        class265.field3855[14] = 0.0F;
        class265.field3855[13] = 0.0F;
        class265.field3855[8] = this.field372;
        int var2 = 36 / ((arg0 - 17) / 44);
        class265.field3855[5] = this.field373;
        field352++;
        class265.field3855[10] = this.field355;
        class265.field3855[4] = this.field370;
        class265.field3855[2] = this.field334;
        return class265.field3855;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(III[I)V")
    public final void method33(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field356 + (float) arg0 * this.field347 + (float) arg1 * this.field373 + this.field357);
        arg3[2] = (int) ((float) arg2 * this.field355 + (float) arg0 * this.field334 + (float) arg1 * this.field365 + this.field366);
        field336++;
        arg3[0] = (int) ((float) arg2 * this.field372 + (float) arg0 * this.field337 + (float) arg1 * this.field370 + this.field351);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IZ)V")
    public static final void method287(int arg0, boolean arg1) {
        field339++;
        if (arg0 != 1) {
            method282(null, 15);
        }
        int var2 = class687.field9584;
        int var3 = class91.field1066;
        if (arg1 && class529.field7284) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class111.field1332.method140(var3, var2);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(III)V")
    public final void method47(int arg0, int arg1, int arg2) {
        this.field366 += arg2;
        this.field357 += arg1;
        field350++;
        this.field351 += arg0;
    }

    @OriginalMember(owner = "client!lha", name = "i", descriptor = "(I)V")
    public static void method288(int arg0) {
        field343 = null;
        field367 = null;
        field359 = null;
        field354 = null;
        if (arg0 != -16) {
            field367 = null;
        }
        field338 = null;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(FFFF[FB)V")
    public final void method289(float arg0, float arg1, float arg2, float arg3, float[] arg4, byte arg5) {
        field375++;
        if (arg5 != 48) {
            this.field355 = -0.19161564F;
        }
        float var8;
        float var9;
        float var10;
        if ((arg2 > 0.00390625F) || (arg2 < -0.00390625F)) {
            float var12 = -arg0 / arg2;
            var8 = this.field347 * var12 + this.field357;
            var9 = this.field337 * var12 + this.field351;
            var10 = this.field334 * var12 + this.field366;
        } else if ((arg3 > 0.00390625F) || (arg3 < -0.00390625F)) {
            float var11 = -arg0 / arg3;
            var8 = this.field373 * var11 + this.field357;
            var10 = this.field365 * var11 + this.field366;
            var9 = this.field370 * var11 + this.field351;
        } else {
            float var7 = -arg0 / arg1;
            var8 = this.field356 * var7 + this.field357;
            var9 = this.field372 * var7 + this.field351;
            var10 = this.field355 * var7 + this.field366;
        }
        arg4[2] = this.field355 * arg1 + this.field365 * arg3 + this.field334 * arg2;
        arg4[0] = this.field372 * arg1 + this.field370 * arg3 + this.field337 * arg2;
        arg4[1] = this.field356 * arg1 + this.field373 * arg3 + this.field347 * arg2;
        arg4[3] = -(arg4[2] * var10 + arg4[1] * var8 + arg4[0] * var9);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Loo;Z)V")
    public final void method290(class12 arg0, boolean arg1) {
        field344++;
        class35 var3 = (class35) arg0;
        this.field372 = var3.field334;
        this.field337 = var3.field337;
        this.field370 = var3.field347;
        this.field373 = var3.field373;
        this.field334 = var3.field372;
        this.field347 = var3.field370;
        if (!arg1) {
            this.method50(52, 98, -103);
        }
        this.field356 = var3.field365;
        this.field355 = var3.field355;
        this.field351 = -(this.field372 * var3.field366 + this.field370 * var3.field357 + this.field337 * var3.field351);
        this.field365 = var3.field356;
        this.field357 = -(this.field356 * var3.field366 + this.field373 * var3.field357 + this.field347 * var3.field351);
        this.field366 = -(this.field355 * var3.field366 + this.field365 * var3.field357 + this.field334 * var3.field351);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIB)I")
    public static final int method291(int arg0, int arg1, byte arg2) {
        field346++;
        int var3 = arg0 >> 31 & arg1 - 1;
        return arg2 > -33 ? -121 : ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V")
    public final void method38(int arg0) {
        field371++;
        this.field373 = 1.0F;
        this.field337 = this.field355 = class281.field4029[arg0 & 0x3FFF];
        this.field372 = class281.field4032[arg0 & 0x3FFF];
        this.field370 = this.field351 = this.field347 = this.field356 = this.field357 = this.field365 = this.field366 = 0.0F;
        this.field334 = -this.field372;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(FIIIIFF)V")
    public final void method292(float arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6) {
        field341++;
        if (arg3 == arg4) {
            this.field355 = 1.0F;
            this.field337 = arg2;
            this.field347 = this.field334 = this.field370 = this.field365 = this.field372 = this.field356 = 0.0F;
            this.field373 = arg1;
        } else {
            float var8 = class281.field4029[arg4 & 0x3FFF];
            float var9 = class281.field4032[arg4 & 0x3FFF];
            this.field337 = (float) arg2 * var8;
            this.field370 = (float) arg1 * -var9;
            this.field373 = (float) arg1 * var8;
            this.field334 = this.field365 = this.field372 = this.field356 = 0.0F;
            this.field347 = (float) arg2 * var9;
            this.field355 = 1.0F;
        }
        this.field351 = arg5;
        this.field357 = arg0;
        this.field366 = arg6;
    }

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "()V")
    public class35() {
        this.method42();
    }
}
