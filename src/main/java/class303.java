import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class303 extends class116 {

    @OriginalMember(owner = "client!da", name = "y", descriptor = "[F")
    private static float[] field4348 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!da", name = "n", descriptor = "F")
    public float field4337;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "F")
    public float field4338;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "F")
    public float field4339;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "F")
    public float field4340;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "F")
    public float field4341;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "F")
    public float field4342;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "F")
    public float field4343;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "F")
    public float field4344;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "F")
    public float field4345;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "F")
    public float field4346;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "F")
    public float field4347;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "F")
    public float field4349;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 4)
    public final void method803(int arg0) {
        this.field4341 = 1.0F;
        this.field4344 = this.field4339 = class331.field4874[arg0 & 0x3FFF];
        this.field4338 = class331.field4875[arg0 & 0x3FFF];
        this.field4342 = -this.field4338;
        this.field4337 = this.field4349 = this.field4345 = this.field4340 = this.field4343 = this.field4346 = this.field4347 = 0.0F;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 16)
    public final void method805(int arg0) {
        this.field4339 = 1.0F;
        this.field4344 = this.field4341 = class331.field4874[arg0 & 0x3FFF];
        this.field4337 = class331.field4875[arg0 & 0x3FFF];
        this.field4343 = -this.field4337;
        this.field4342 = this.field4349 = this.field4338 = this.field4345 = this.field4340 = this.field4346 = this.field4347 = 0.0F;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V", line = 31)
    public final void method816(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class331.field4874[arg3 & 0x3FFF];
        float var8 = class331.field4875[arg3 & 0x3FFF];
        float var9 = class331.field4874[arg4 & 0x3FFF];
        float var10 = class331.field4875[arg4 & 0x3FFF];
        float var11 = class331.field4874[arg5 & 0x3FFF];
        float var12 = class331.field4875[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4339 = var7 * var11;
        this.field4345 = var9 * var13 + var10 * var12;
        this.field4342 = var7 * var12;
        this.field4337 = -var10 * var11 + var9 * var14;
        this.field4346 = -var8;
        this.field4344 = var9 * var11 + var10 * var14;
        this.field4343 = var7 * var10;
        this.field4338 = -var9 * var12 + var10 * var13;
        this.field4341 = var7 * var9;
        this.field4349 = (float) (-arg0) * this.field4344 - ((float) arg1 * this.field4342) - (float) arg2 * this.field4337;
        this.field4340 = (float) (-arg0) * this.field4338 - ((float) arg1 * this.field4339) - (float) arg2 * this.field4345;
        this.field4347 = (float) (-arg0) * this.field4343 - (float) arg1 * this.field4346 - ((float) arg2 * this.field4341);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Lda;", line = 66)
    public final class303 method1913() {
        class303 var1 = new class303();
        var1.field4339 = this.field4339;
        var1.field4349 = this.field4349;
        var1.field4337 = this.field4337;
        var1.field4340 = this.field4340;
        var1.field4341 = this.field4341;
        var1.field4347 = this.field4347;
        var1.field4338 = this.field4338;
        var1.field4346 = this.field4346;
        var1.field4345 = this.field4345;
        var1.field4344 = this.field4344;
        var1.field4343 = this.field4343;
        var1.field4342 = this.field4342;
        return var1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V", line = 87)
    public final void method802(int arg0, int arg1, int arg2) {
        this.field4340 += (float) arg1;
        this.field4349 += (float) arg0;
        this.field4347 += (float) arg2;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V", line = 100)
    public final void method820(int arg0) {
        float var2 = class331.field4874[arg0 & 0x3FFF];
        float var3 = class331.field4875[arg0 & 0x3FFF];
        float var4 = this.field4344;
        float var5 = this.field4342;
        float var6 = this.field4337;
        float var7 = this.field4349;
        this.field4344 = this.field4343 * var3 + var2 * var4;
        this.field4342 = this.field4346 * var3 + var2 * var5;
        this.field4343 = this.field4343 * var2 - var3 * var4;
        this.field4337 = this.field4341 * var3 + var2 * var6;
        this.field4346 = this.field4346 * var2 - (var3 * var5);
        this.field4341 = this.field4341 * var2 - var3 * var6;
        this.field4349 = this.field4347 * var3 + var2 * var7;
        this.field4347 = this.field4347 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)[F", line = 125)
    public final float[] method1914(byte arg0) {
        field4348[10] = this.field4341;
        field4348[5] = this.field4339;
        field4348[0] = this.field4344;
        field4348[13] = this.field4340;
        field4348[9] = this.field4345;
        field4348[1] = this.field4338;
        field4348[8] = this.field4337;
        field4348[4] = this.field4342;
        field4348[14] = this.field4347;
        if (arg0 < 98) {
            this.method806(76);
        }
        field4348[6] = this.field4346;
        field4348[12] = this.field4349;
        field4348[2] = this.field4343;
        return field4348;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V", line = 148)
    public final void method809(int arg0, int arg1, int arg2) {
        this.field4349 = (float) arg0;
        this.field4338 = this.field4343 = this.field4342 = this.field4346 = this.field4337 = this.field4345 = 0.0F;
        this.field4340 = (float) arg1;
        this.field4344 = this.field4339 = this.field4341 = 1.0F;
        this.field4347 = (float) arg2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILao;)V", line = 160)
    public final void method1915(int arg0, class116 arg1) {
        class303 var3 = (class303) arg1;
        this.field4344 = var3.field4344;
        this.field4342 = var3.field4338;
        this.field4337 = var3.field4343;
        if (arg0 != 0) {
            this.method816(48, 127, -11, -70, 82, -10);
        }
        this.field4338 = var3.field4342;
        this.field4343 = var3.field4337;
        this.field4345 = var3.field4346;
        this.field4339 = var3.field4339;
        this.field4341 = var3.field4341;
        this.field4349 = -(this.field4337 * var3.field4347 + this.field4344 * var3.field4349 + this.field4342 * var3.field4340);
        this.field4346 = var3.field4345;
        this.field4340 = -(this.field4345 * var3.field4347 + this.field4339 * var3.field4340 + this.field4338 * var3.field4349);
        this.field4347 = -(this.field4341 * var3.field4347 + this.field4346 * var3.field4340 + this.field4343 * var3.field4349);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([I)V", line = 186)
    public final void method818(int[] arg0) {
        float var2 = (float) arg0[0] - this.field4349;
        float var3 = (float) arg0[1] - this.field4340;
        float var4 = (float) arg0[2] - this.field4347;
        arg0[1] = (int) (this.field4346 * var4 + this.field4342 * var2 + this.field4339 * var3);
        arg0[2] = (int) (this.field4341 * var4 + this.field4345 * var3 + this.field4337 * var2);
        arg0[0] = (int) (this.field4343 * var4 + this.field4344 * var2 + this.field4338 * var3);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 201)
    public final void method806(int arg0) {
        this.field4344 = 1.0F;
        this.field4339 = this.field4341 = class331.field4874[arg0 & 0x3FFF];
        this.field4346 = class331.field4875[arg0 & 0x3FFF];
        this.field4345 = -this.field4346;
        this.field4342 = this.field4337 = this.field4349 = this.field4338 = this.field4340 = this.field4343 = this.field4347 = 0.0F;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V", line = 212)
    public final void method817() {
        this.field4344 = this.field4339 = this.field4341 = 1.0F;
        this.field4338 = this.field4343 = this.field4342 = this.field4346 = this.field4337 = this.field4345 = this.field4349 = this.field4340 = this.field4347 = 0.0F;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lao;)V", line = 222)
    public final void method808(class116 arg0) {
        class303 var2 = (class303) arg0;
        this.field4345 = var2.field4345;
        this.field4342 = var2.field4342;
        this.field4344 = var2.field4344;
        this.field4338 = var2.field4338;
        this.field4346 = var2.field4346;
        this.field4349 = var2.field4349;
        this.field4340 = var2.field4340;
        this.field4341 = var2.field4341;
        this.field4339 = var2.field4339;
        this.field4343 = var2.field4343;
        this.field4337 = var2.field4337;
        this.field4347 = var2.field4347;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[I)V", line = 241)
    public final void method814(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field4341 + (float) arg0 * this.field4343 + (float) arg1 * this.field4346 + this.field4347);
        arg3[0] = (int) ((float) arg2 * this.field4337 + (float) arg0 * this.field4344 + (float) arg1 * this.field4342 + this.field4349);
        arg3[1] = (int) ((float) arg2 * this.field4345 + (float) arg0 * this.field4338 + (float) arg1 * this.field4339 + this.field4340);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V", line = 252)
    public final void method807(int arg0) {
        float var2 = class331.field4874[arg0 & 0x3FFF];
        float var3 = class331.field4875[arg0 & 0x3FFF];
        float var4 = this.field4338;
        float var5 = this.field4339;
        float var6 = this.field4345;
        this.field4338 = var2 * var4 - (this.field4343 * var3);
        float var7 = this.field4340;
        this.field4339 = var2 * var5 - (this.field4346 * var3);
        this.field4343 = this.field4343 * var2 + var3 * var4;
        this.field4346 = this.field4346 * var2 + var3 * var5;
        this.field4345 = var2 * var6 - this.field4341 * var3;
        this.field4341 = this.field4341 * var2 + var3 * var6;
        this.field4340 = var2 * var7 - (this.field4347 * var3);
        this.field4347 = this.field4347 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)[F", line = 276)
    public final float[] method1916(int arg0) {
        field4348[0] = this.field4344;
        field4348[12] = 0.0F;
        field4348[13] = 0.0F;
        field4348[1] = this.field4338;
        field4348[8] = this.field4337;
        if (arg0 > -102) {
            return (float[]) null;
        }
        field4348[14] = 0.0F;
        field4348[4] = this.field4342;
        field4348[10] = this.field4341;
        field4348[9] = this.field4345;
        field4348[6] = this.field4346;
        field4348[2] = this.field4343;
        field4348[5] = this.field4339;
        return field4348;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 302)
    public class303() {
        this.method817();
    }
}
