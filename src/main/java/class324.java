import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class324 extends class417 {

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[F")
    private static float[] field4441 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "F")
    public float field4429;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "F")
    public float field4430;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "F")
    public float field4431;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "F")
    public float field4432;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "F")
    public float field4433;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "F")
    public float field4434;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "F")
    public float field4435;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "F")
    public float field4436;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "F")
    public float field4437;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "F")
    public float field4438;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "F")
    public float field4439;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "F")
    public float field4440;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[I)V", line = 5)
    public final void method692(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field4437 + (float) arg0 * this.field4436 + (float) arg1 * this.field4429 + this.field4431);
        arg3[2] = (int) ((float) arg2 * this.field4430 + (float) arg0 * this.field4440 + (float) arg1 * this.field4439 + this.field4434);
        arg3[0] = (int) ((float) arg2 * this.field4435 + (float) arg0 * this.field4433 + (float) arg1 * this.field4432 + this.field4438);
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V", line = 14)
    public final void method698(int arg0) {
        this.field4429 = 1.0F;
        this.field4433 = this.field4430 = class72.field1039[arg0 & 0x3FFF];
        this.field4435 = class72.field1040[arg0 & 0x3FFF];
        this.field4440 = -this.field4435;
        this.field4432 = this.field4438 = this.field4436 = this.field4437 = this.field4431 = this.field4439 = this.field4434 = 0.0F;
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)[F", line = 28)
    public final float[] method2082(int arg0) {
        field4441[0] = this.field4433;
        field4441[12] = this.field4438;
        field4441[4] = this.field4432;
        field4441[14] = this.field4434;
        field4441[2] = this.field4440;
        field4441[6] = this.field4439;
        field4441[8] = this.field4435;
        field4441[9] = this.field4437;
        field4441[1] = this.field4436;
        if (arg0 != -4061) {
            this.method2083(-122, (class417) null);
        }
        field4441[10] = this.field4430;
        field4441[13] = this.field4431;
        field4441[5] = this.field4429;
        return field4441;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILic;)V", line = 51)
    public final void method2083(int arg0, class417 arg1) {
        class324 var3 = (class324) arg1;
        if (arg0 != 12) {
            this.field4437 = -0.7715625F;
        }
        this.field4432 = var3.field4436;
        this.field4433 = var3.field4433;
        this.field4435 = var3.field4440;
        this.field4436 = var3.field4432;
        this.field4429 = var3.field4429;
        this.field4440 = var3.field4435;
        this.field4437 = var3.field4439;
        this.field4438 = -(this.field4435 * var3.field4434 + this.field4433 * var3.field4438 + this.field4432 * var3.field4431);
        this.field4439 = var3.field4437;
        this.field4430 = var3.field4430;
        this.field4431 = -(this.field4437 * var3.field4434 + this.field4436 * var3.field4438 + this.field4429 * var3.field4431);
        this.field4434 = -(this.field4430 * var3.field4434 + this.field4440 * var3.field4438 + this.field4439 * var3.field4431);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIII)V", line = 77)
    public final void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class72.field1039[arg3 & 0x3FFF];
        float var8 = class72.field1040[arg3 & 0x3FFF];
        float var9 = class72.field1039[arg4 & 0x3FFF];
        float var10 = class72.field1040[arg4 & 0x3FFF];
        float var11 = class72.field1039[arg5 & 0x3FFF];
        float var12 = class72.field1040[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4433 = var9 * var11 + var10 * var14;
        this.field4436 = -var9 * var12 + var10 * var13;
        this.field4432 = var7 * var12;
        this.field4429 = var7 * var11;
        this.field4435 = -var10 * var11 + var9 * var14;
        this.field4437 = var9 * var13 + var10 * var12;
        this.field4439 = -var8;
        this.field4440 = var7 * var10;
        this.field4430 = var7 * var9;
        this.field4431 = (float) (-arg0) * this.field4436 - ((float) arg1 * this.field4429) - (float) arg2 * this.field4437;
        this.field4434 = (float) (-arg0) * this.field4440 - (float) arg1 * this.field4439 - ((float) arg2 * this.field4430);
        this.field4438 = (float) (-arg0) * this.field4433 - ((float) arg1 * this.field4432) - (float) arg2 * this.field4435;
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)[F", line = 111)
    public final float[] method2084(int arg0) {
        field4441[9] = this.field4437;
        field4441[6] = this.field4439;
        field4441[4] = this.field4432;
        field4441[1] = this.field4436;
        field4441[13] = 0.0F;
        field4441[0] = this.field4433;
        field4441[12] = 0.0F;
        field4441[10] = this.field4430;
        field4441[5] = this.field4429;
        int var2 = -117 / ((arg0 - 13) / 36);
        field4441[14] = 0.0F;
        field4441[2] = this.field4440;
        field4441[8] = this.field4435;
        return field4441;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()Lnd;", line = 134)
    public final class324 method2085() {
        class324 var1 = new class324();
        var1.field4430 = this.field4430;
        var1.field4437 = this.field4437;
        var1.field4429 = this.field4429;
        var1.field4435 = this.field4435;
        var1.field4439 = this.field4439;
        var1.field4436 = this.field4436;
        var1.field4434 = this.field4434;
        var1.field4440 = this.field4440;
        var1.field4431 = this.field4431;
        var1.field4433 = this.field4433;
        var1.field4432 = this.field4432;
        var1.field4438 = this.field4438;
        return var1;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V", line = 154)
    public final void method702(int arg0, int arg1, int arg2) {
        this.field4431 = (float) arg1;
        this.field4433 = this.field4429 = this.field4430 = 1.0F;
        this.field4434 = (float) arg2;
        this.field4436 = this.field4440 = this.field4432 = this.field4439 = this.field4435 = this.field4437 = 0.0F;
        this.field4438 = (float) arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 166)
    public final void method701(int arg0) {
        this.field4433 = 1.0F;
        this.field4429 = this.field4430 = class72.field1039[arg0 & 0x3FFF];
        this.field4439 = class72.field1040[arg0 & 0x3FFF];
        this.field4432 = this.field4435 = this.field4438 = this.field4436 = this.field4431 = this.field4440 = this.field4434 = 0.0F;
        this.field4437 = -this.field4439;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lic;)V", line = 178)
    public final void method699(class417 arg0) {
        class324 var2 = (class324) arg0;
        this.field4439 = var2.field4439;
        this.field4437 = var2.field4437;
        this.field4431 = var2.field4431;
        this.field4435 = var2.field4435;
        this.field4438 = var2.field4438;
        this.field4436 = var2.field4436;
        this.field4433 = var2.field4433;
        this.field4430 = var2.field4430;
        this.field4434 = var2.field4434;
        this.field4429 = var2.field4429;
        this.field4432 = var2.field4432;
        this.field4440 = var2.field4440;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([I)V", line = 199)
    public final void method703(int[] arg0) {
        float var2 = (float) arg0[0] - this.field4438;
        float var3 = (float) arg0[1] - this.field4431;
        float var4 = (float) arg0[2] - this.field4434;
        arg0[0] = (int) (this.field4440 * var4 + this.field4436 * var3 + this.field4433 * var2);
        arg0[2] = (int) (this.field4430 * var4 + this.field4437 * var3 + this.field4435 * var2);
        arg0[1] = (int) (this.field4439 * var4 + this.field4432 * var2 + this.field4429 * var3);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V", line = 212)
    public final void method693() {
        this.field4433 = this.field4429 = this.field4430 = 1.0F;
        this.field4436 = this.field4440 = this.field4432 = this.field4439 = this.field4435 = this.field4437 = this.field4438 = this.field4431 = this.field4434 = 0.0F;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V", line = 220)
    public final void method696(int arg0, int arg1, int arg2) {
        this.field4434 += (float) arg2;
        this.field4438 += (float) arg0;
        this.field4431 += (float) arg1;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V", line = 234)
    public final void method695(int arg0) {
        float var2 = class72.field1039[arg0 & 0x3FFF];
        float var3 = class72.field1040[arg0 & 0x3FFF];
        float var4 = this.field4436;
        float var5 = this.field4429;
        float var6 = this.field4437;
        float var7 = this.field4431;
        this.field4436 = var2 * var4 - this.field4440 * var3;
        this.field4429 = var2 * var5 - this.field4439 * var3;
        this.field4440 = this.field4440 * var2 + var3 * var4;
        this.field4439 = this.field4439 * var2 + var3 * var5;
        this.field4437 = var2 * var6 - this.field4430 * var3;
        this.field4431 = var2 * var7 - this.field4434 * var3;
        this.field4430 = this.field4430 * var2 + var3 * var6;
        this.field4434 = this.field4434 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 261)
    public final void method700(int arg0) {
        this.field4430 = 1.0F;
        this.field4433 = this.field4429 = class72.field1039[arg0 & 0x3FFF];
        this.field4436 = class72.field1040[arg0 & 0x3FFF];
        this.field4432 = -this.field4436;
        this.field4435 = this.field4438 = this.field4437 = this.field4431 = this.field4440 = this.field4439 = this.field4434 = 0.0F;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 276)
    public final void method704(int arg0) {
        float var2 = class72.field1039[arg0 & 0x3FFF];
        float var3 = class72.field1040[arg0 & 0x3FFF];
        float var4 = this.field4433;
        float var5 = this.field4432;
        float var6 = this.field4435;
        float var7 = this.field4438;
        this.field4433 = this.field4440 * var3 + var2 * var4;
        this.field4432 = this.field4439 * var3 + var2 * var5;
        this.field4440 = this.field4440 * var2 - var3 * var4;
        this.field4439 = this.field4439 * var2 - var3 * var5;
        this.field4435 = this.field4430 * var3 + var2 * var6;
        this.field4430 = this.field4430 * var2 - (var3 * var6);
        this.field4438 = this.field4434 * var3 + var2 * var7;
        this.field4434 = this.field4434 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 298)
    public class324() {
        this.method693();
    }
}
