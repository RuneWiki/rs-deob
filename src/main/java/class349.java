import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class349 extends class723 {

    @OriginalMember(owner = "client!mda", name = "A", descriptor = "[Lwca;")
    public static class729[] field4441 = new class729[8];

    @OriginalMember(owner = "client!mda", name = "G", descriptor = "Z")
    public static boolean field4447 = false;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "F")
    public float field4419;

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "F")
    public float field4424;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "F")
    public float field4428;

    @OriginalMember(owner = "client!mda", name = "s", descriptor = "F")
    public float field4433;

    @OriginalMember(owner = "client!mda", name = "u", descriptor = "F")
    public float field4435;

    @OriginalMember(owner = "client!mda", name = "v", descriptor = "F")
    public float field4436;

    @OriginalMember(owner = "client!mda", name = "x", descriptor = "F")
    public float field4438;

    @OriginalMember(owner = "client!mda", name = "y", descriptor = "F")
    public float field4439;

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "F")
    public float field4440;

    @OriginalMember(owner = "client!mda", name = "B", descriptor = "F")
    public float field4442;

    @OriginalMember(owner = "client!mda", name = "E", descriptor = "F")
    public float field4445;

    @OriginalMember(owner = "client!mda", name = "F", descriptor = "F")
    public float field4446;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!mda", name = "q", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!mda", name = "r", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!mda", name = "t", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!mda", name = "w", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!mda", name = "C", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!mda", name = "D", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!mda", name = "p", descriptor = "Lej;")
    public static class179 field4430;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(III[I)V")
    public final void method861(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field4440 + (float) arg0 * this.field4446 + (float) arg1 * this.field4436 + this.field4424);
        arg3[1] = (int) ((float) arg2 * this.field4442 + (float) arg0 * this.field4438 + (float) arg1 * this.field4433 + this.field4439);
        arg3[2] = (int) ((float) arg2 * this.field4445 + (float) arg0 * this.field4435 + (float) arg1 * this.field4419 + this.field4428);
        field4422++;
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)V")
    public final void method847(int arg0) {
        field4437++;
        float var2 = class162.field2244[arg0 & 0x3FFF];
        float var3 = class162.field2243[arg0 & 0x3FFF];
        float var4 = this.field4446;
        float var5 = this.field4436;
        float var6 = this.field4440;
        this.field4446 = var2 * var4 - (this.field4438 * var3);
        float var7 = this.field4424;
        this.field4438 = this.field4438 * var2 + var3 * var4;
        this.field4436 = var2 * var5 - this.field4433 * var3;
        this.field4433 = this.field4433 * var2 + var3 * var5;
        this.field4440 = var2 * var6 - (this.field4442 * var3);
        this.field4442 = this.field4442 * var2 + var3 * var6;
        this.field4424 = var2 * var7 - (this.field4439 * var3);
        this.field4439 = this.field4439 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
    public final void method846(int arg0) {
        this.field4445 = 1.0F;
        field4426++;
        this.field4446 = this.field4433 = class162.field2244[arg0 & 0x3FFF];
        this.field4438 = class162.field2243[arg0 & 0x3FFF];
        this.field4440 = this.field4424 = this.field4442 = this.field4439 = this.field4435 = this.field4419 = this.field4428 = 0.0F;
        this.field4436 = -this.field4438;
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "()V")
    public final void method860() {
        this.field4438 = this.field4435 = this.field4436 = this.field4419 = this.field4440 = this.field4442 = this.field4424 = this.field4439 = this.field4428 = 0.0F;
        field4431++;
        this.field4446 = this.field4433 = this.field4445 = 1.0F;
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(III[I)V")
    public final void method872(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field4440 + (float) arg0 * this.field4446 + (float) arg1 * this.field4436);
        arg3[2] = (int) ((float) arg2 * this.field4445 + (float) arg0 * this.field4435 + (float) arg1 * this.field4419);
        field4444++;
        arg3[1] = (int) ((float) arg2 * this.field4442 + (float) arg0 * this.field4438 + (float) arg1 * this.field4433);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIIII)V")
    public final void method853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4421++;
        float var7 = class162.field2244[arg3 & 0x3FFF];
        float var8 = class162.field2243[arg3 & 0x3FFF];
        float var9 = class162.field2244[arg4 & 0x3FFF];
        float var10 = class162.field2243[arg4 & 0x3FFF];
        float var11 = class162.field2244[arg5 & 0x3FFF];
        float var12 = class162.field2243[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4435 = var7 * var10;
        this.field4438 = -var9 * var12 + var10 * var13;
        this.field4446 = var9 * var11 + var10 * var14;
        this.field4436 = var7 * var12;
        this.field4419 = -var8;
        this.field4445 = var7 * var9;
        this.field4433 = var7 * var11;
        this.field4440 = -var10 * var11 + var9 * var14;
        this.field4442 = var9 * var13 + var10 * var12;
        this.field4428 = (float) (-arg0) * this.field4435 - (float) arg1 * this.field4419 - (float) arg2 * this.field4445;
        this.field4424 = (float) (-arg0) * this.field4446 - (float) arg1 * this.field4436 - (float) arg2 * this.field4440;
        this.field4439 = (float) (-arg0) * this.field4438 - ((float) arg1 * this.field4433) - (float) arg2 * this.field4442;
    }

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "(I)V")
    public static void method1992(int arg0) {
        field4430 = null;
        field4441 = null;
        if (arg0 != 16383) {
            field4447 = false;
        }
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(III[I)V")
    public final void method871(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field4424);
        field4420++;
        int var6 = (int) ((float) arg1 - this.field4439);
        int var7 = (int) ((float) arg2 - this.field4428);
        arg3[2] = (int) ((float) var7 * this.field4445 + (float) var5 * this.field4440 + (float) var6 * this.field4442);
        arg3[0] = (int) ((float) var7 * this.field4435 + (float) var5 * this.field4446 + (float) var6 * this.field4438);
        arg3[1] = (int) ((float) var7 * this.field4419 + (float) var5 * this.field4436 + (float) var6 * this.field4433);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "()Luha;")
    public final class723 method859() {
        field4434++;
        class349 var1 = new class349();
        var1.field4435 = this.field4435;
        var1.field4439 = this.field4439;
        var1.field4436 = this.field4436;
        var1.field4433 = this.field4433;
        var1.field4428 = this.field4428;
        var1.field4445 = this.field4445;
        var1.field4438 = this.field4438;
        var1.field4424 = this.field4424;
        var1.field4440 = this.field4440;
        var1.field4446 = this.field4446;
        var1.field4419 = this.field4419;
        var1.field4442 = this.field4442;
        return var1;
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(III)V")
    public final void method851(int arg0, int arg1, int arg2) {
        this.field4439 += arg1;
        this.field4424 += arg0;
        field4427++;
        this.field4428 += arg2;
    }

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "(I)V")
    public final void method843(int arg0) {
        this.field4446 = 1.0F;
        field4417++;
        this.field4433 = this.field4445 = class162.field2244[arg0 & 0x3FFF];
        this.field4419 = class162.field2243[arg0 & 0x3FFF];
        this.field4442 = -this.field4419;
        this.field4436 = this.field4440 = this.field4424 = this.field4438 = this.field4439 = this.field4435 = this.field4428 = 0.0F;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Luha;)V")
    public final void method864(class723 arg0) {
        field4432++;
        class349 var2 = (class349) arg0;
        this.field4440 = var2.field4440;
        this.field4445 = var2.field4445;
        this.field4446 = var2.field4446;
        this.field4438 = var2.field4438;
        this.field4424 = var2.field4424;
        this.field4419 = var2.field4419;
        this.field4433 = var2.field4433;
        this.field4435 = var2.field4435;
        this.field4439 = var2.field4439;
        this.field4428 = var2.field4428;
        this.field4442 = var2.field4442;
        this.field4436 = var2.field4436;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V")
    public class349() {
        this.method860();
    }

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V")
    public final void method866(int arg0) {
        this.field4433 = 1.0F;
        field4443++;
        this.field4446 = this.field4445 = class162.field2244[arg0 & 0x3FFF];
        this.field4440 = class162.field2243[arg0 & 0x3FFF];
        this.field4435 = -this.field4440;
        this.field4436 = this.field4424 = this.field4438 = this.field4442 = this.field4439 = this.field4419 = this.field4428 = 0.0F;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "([I)V")
    public final void method870(int[] arg0) {
        field4425++;
        float var2 = (float) arg0[0] - this.field4424;
        float var3 = (float) arg0[1] - this.field4439;
        float var4 = (float) arg0[2] - this.field4428;
        arg0[0] = (int) (this.field4435 * var4 + this.field4446 * var2 + this.field4438 * var3);
        arg0[1] = (int) (this.field4419 * var4 + this.field4436 * var2 + this.field4433 * var3);
        arg0[2] = (int) (this.field4445 * var4 + this.field4442 * var3 + this.field4440 * var2);
    }

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "(I)V")
    public final void method844(int arg0) {
        field4429++;
        float var2 = class162.field2244[arg0 & 0x3FFF];
        float var3 = class162.field2243[arg0 & 0x3FFF];
        float var4 = this.field4438;
        float var5 = this.field4433;
        float var6 = this.field4442;
        this.field4438 = var2 * var4 - (this.field4435 * var3);
        float var7 = this.field4439;
        this.field4433 = var2 * var5 - this.field4419 * var3;
        this.field4435 = this.field4435 * var2 + var3 * var4;
        this.field4419 = this.field4419 * var2 + var3 * var5;
        this.field4442 = var2 * var6 - (this.field4445 * var3);
        this.field4445 = this.field4445 * var2 + var3 * var6;
        this.field4439 = var2 * var7 - this.field4428 * var3;
        this.field4428 = this.field4428 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)V")
    public final void method873(int arg0) {
        field4423++;
        float var2 = class162.field2244[arg0 & 0x3FFF];
        float var3 = class162.field2243[arg0 & 0x3FFF];
        float var4 = this.field4446;
        float var5 = this.field4436;
        float var6 = this.field4440;
        this.field4446 = this.field4435 * var3 + var2 * var4;
        float var7 = this.field4424;
        this.field4436 = this.field4419 * var3 + var2 * var5;
        this.field4435 = this.field4435 * var2 - var3 * var4;
        this.field4419 = this.field4419 * var2 - (var3 * var5);
        this.field4440 = this.field4445 * var3 + var2 * var6;
        this.field4424 = this.field4428 * var3 + var2 * var7;
        this.field4445 = this.field4445 * var2 - var3 * var6;
        this.field4428 = this.field4428 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)V")
    public final void method848(int arg0, int arg1, int arg2) {
        this.field4428 = arg2;
        this.field4424 = arg0;
        field4418++;
        this.field4438 = this.field4435 = this.field4436 = this.field4419 = this.field4440 = this.field4442 = 0.0F;
        this.field4439 = arg1;
        this.field4446 = this.field4433 = this.field4445 = 1.0F;
    }
}
