import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class class300 extends class256 {

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "Ldq;")
    public class416 field4375;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public int field4348;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field4367 = 0;

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
    public static int field4372 = 0;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field4347 = 0;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field4356 = 0;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field4357 = 0;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
    private static int field4369 = 0;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "I")
    private static int field4374 = 0;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field4354 = 0;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    private static int field4346;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public int field4351;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    private static int field4353;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    private static int field4355;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    public int field4363;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "I")
    private static int field4366;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "I")
    public int field4378;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "[I")
    private int[] field4373;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILsg;II)V")
    public abstract void method78(int arg0, int arg1, class226 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(FFFFFF)V")
    private final void method2020(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4363 + this.field4348 + this.field4378;
        int var8 = this.field4370 + this.field4352 + this.field4351;
        if (this.field4348 != var7 || this.field4352 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field4370 * var11;
            float var14 = (float) this.field4370 * var12;
            float var15 = (float) this.field4363 * var9;
            float var16 = (float) this.field4363 * var10;
            float var17 = (float) this.field4378 * -var9;
            float var18 = (float) this.field4378 * -var10;
            float var19 = (float) this.field4351 * -var11;
            float var20 = (float) this.field4351 * -var12;
            arg0 += var13 + var15;
            arg1 += var14 + var16;
            arg2 += var13 + var17;
            arg3 += var14 + var18;
            arg4 += var15 + var19;
            arg5 += var16 + var20;
        }
        float var21 = arg2 + arg4 - arg0;
        float var22 = arg5 + arg3 - arg1;
        float var23;
        float var24;
        if (arg0 < arg2) {
            var23 = arg0;
            var24 = arg2;
        } else {
            var23 = arg2;
            var24 = arg0;
        }
        if (arg4 < var23) {
            var23 = arg4;
        }
        if (var21 < var23) {
            var23 = var21;
        }
        if (arg4 > var24) {
            var24 = arg4;
        }
        if (var21 > var24) {
            var24 = var21;
        }
        float var25;
        float var26;
        if (arg1 < arg3) {
            var25 = arg1;
            var26 = arg3;
        } else {
            var25 = arg3;
            var26 = arg1;
        }
        if (arg5 < var25) {
            var25 = arg5;
        }
        if (var22 < var25) {
            var25 = var22;
        }
        if (arg5 > var26) {
            var26 = arg5;
        }
        if (var22 > var26) {
            var26 = var22;
        }
        if (var23 < (float) this.field4375.field5978) {
            var23 = (float) this.field4375.field5978;
        }
        if (var24 > (float) this.field4375.field5961) {
            var24 = (float) this.field4375.field5961;
        }
        if (var25 < (float) this.field4375.field5985) {
            var25 = (float) this.field4375.field5985;
        }
        if (var26 > (float) this.field4375.field5965) {
            var26 = (float) this.field4375.field5965;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field4360 = this.field4375.field5980;
        field4362 = (int) ((float) ((int) var25 * field4360) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4350 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field4348 / var29);
        field4368 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field4352 / var30);
        field4365 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field4348 / var30);
        field4358 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field4352 / var29);
        field4346 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field4366 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field4359 = (this.field4348 >> 1 << 12) + (field4366 * field4365 >> 4);
        field4377 = (this.field4352 >> 1 << 12) + (field4366 * field4358 >> 4);
        field4349 = field4350 * field4346 >> 4;
        field4371 = field4368 * field4346 >> 4;
        field4355 = (int) var23;
        field4364 = (int) var27;
        field4353 = (int) var25;
        field4361 = (int) var28;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "([I[III)V")
    public abstract void method743(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "()I")
    public final int method80() {
        return this.field4352;
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "()I")
    public final int method75() {
        return this.field4370 + this.field4352 + this.field4351;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)V")
    public abstract void method742(int arg0, int arg1);

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIII)V")
    public abstract void method86(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(IIII)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3) {
        this.field4363 = arg0;
        this.field4370 = arg1;
        this.field4378 = arg2;
        this.field4351 = arg3;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "()I")
    public final int method87() {
        return this.field4348;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method81(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4375.method2625()) {
            throw new IllegalStateException();
        }
        this.method2020(arg0, arg1, arg2, arg3, arg4, arg5);
        field4376 = arg7;
        if (arg6 != 0) {
            field4367 = arg7 >>> 24;
            field4347 = 256 - field4367;
            if (arg6 == 1) {
                field4356 = (arg7 & 0xFF0000) >> 16;
                field4357 = (arg7 & 0xFF00) >> 8;
                field4354 = arg7 & 0xFF;
            } else {
                field4374 = arg7 >>> 24;
                field4369 = 256 - field4374;
                int var10 = (arg7 & 0xFF00FF) * field4369 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field4369 & 0xFF0000;
                field4372 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method742(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method742(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method742(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method742(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method742(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method742(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method742(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method742(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method742(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "()I")
    public final int method83() {
        return this.field4363 + this.field4348 + this.field4378;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(FFFFFFLsg;II)V")
    public final void method82(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class226 arg6, int arg7, int arg8) {
        if (this.field4375.method2625()) {
            throw new IllegalStateException();
        }
        this.method2020(arg0, arg1, arg2, arg3, arg4, arg5);
        class447 var10 = (class447) arg6;
        this.method743(var10.field6382, var10.field6386, field4355 - arg7, -arg8 - (field4361 - field4353));
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Ldq;II)V")
    public class300(class416 arg0, int arg1, int arg2) {
        this.field4375 = arg0;
        this.field4348 = arg1;
        this.field4352 = arg2;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIII)V")
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4375.method2625()) {
            throw new IllegalStateException();
        }
        if (this.field4373 == null) {
            this.field4373 = new int[4];
        }
        this.field4375.method904(this.field4373);
        this.field4375.method1004(this.field4375.field5978, this.field4375.field5985, arg0 + arg2, arg1 + arg3);
        int var8 = this.method83();
        int var9 = this.method75();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method86(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4375.method937(this.field4373[0], this.field4373[1], this.field4373[2], this.field4373[3]);
    }
}
