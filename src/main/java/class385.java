import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class385 extends class202 {

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "[F")
    private static float[] field5523 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "F")
    public float field5516;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "F")
    public float field5517;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "F")
    public float field5518;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "F")
    public float field5519;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "F")
    public float field5520;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "F")
    public float field5521;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "F")
    public float field5522;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "F")
    public float field5524;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "F")
    public float field5525;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "F")
    public float field5526;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "F")
    public float field5527;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "F")
    public float field5528;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V")
    public final void method1527(int arg0, int arg1, int arg2) {
        this.field5517 = this.field5520 = this.field5525 = this.field5519 = this.field5528 = this.field5527 = 0.0F;
        this.field5518 = this.field5521 = this.field5522 = 1.0F;
        this.field5526 = (float) arg1;
        this.field5516 = (float) arg2;
        this.field5524 = (float) arg0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIII)V")
    public final void method1537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class374.field5309[arg3 & 0x3FFF];
        float var8 = class374.field5308[arg3 & 0x3FFF];
        float var9 = class374.field5309[arg4 & 0x3FFF];
        float var10 = class374.field5308[arg4 & 0x3FFF];
        float var11 = class374.field5309[arg5 & 0x3FFF];
        float var12 = class374.field5308[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field5525 = var7 * var12;
        this.field5522 = var7 * var9;
        this.field5520 = var7 * var10;
        this.field5519 = -var8;
        this.field5518 = var9 * var11 + var10 * var14;
        this.field5527 = var9 * var13 + var10 * var12;
        this.field5528 = -var10 * var11 + var9 * var14;
        this.field5517 = -var9 * var12 + var10 * var13;
        this.field5521 = var7 * var11;
        this.field5516 = (float) (-arg0) * this.field5520 - ((float) arg1 * this.field5519) - (float) arg2 * this.field5522;
        this.field5524 = (float) (-arg0) * this.field5518 - (float) arg1 * this.field5525 - (float) arg2 * this.field5528;
        this.field5526 = (float) (-arg0) * this.field5517 - ((float) arg1 * this.field5521) - ((float) arg2 * this.field5527);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III[I)V")
    public final void method1535(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field5528 + (float) arg0 * this.field5518 + (float) arg1 * this.field5525 + this.field5524);
        arg3[1] = (int) ((float) arg2 * this.field5527 + (float) arg0 * this.field5517 + (float) arg1 * this.field5521 + this.field5526);
        arg3[2] = (int) ((float) arg2 * this.field5522 + (float) arg0 * this.field5520 + (float) arg1 * this.field5519 + this.field5516);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "()Lfl;")
    public final class385 method2439() {
        class385 var1 = new class385();
        var1.field5522 = this.field5522;
        var1.field5528 = this.field5528;
        var1.field5519 = this.field5519;
        var1.field5521 = this.field5521;
        var1.field5520 = this.field5520;
        var1.field5527 = this.field5527;
        var1.field5518 = this.field5518;
        var1.field5517 = this.field5517;
        var1.field5524 = this.field5524;
        var1.field5525 = this.field5525;
        var1.field5516 = this.field5516;
        var1.field5526 = this.field5526;
        return var1;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
    public final void method1532(int arg0) {
        this.field5522 = 1.0F;
        this.field5518 = this.field5521 = class374.field5309[arg0 & 0x3FFF];
        this.field5517 = class374.field5308[arg0 & 0x3FFF];
        this.field5528 = this.field5524 = this.field5527 = this.field5526 = this.field5520 = this.field5519 = this.field5516 = 0.0F;
        this.field5525 = -this.field5517;
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)V")
    public final void method1542(int arg0) {
        float var2 = class374.field5309[arg0 & 0x3FFF];
        float var3 = class374.field5308[arg0 & 0x3FFF];
        float var4 = this.field5517;
        float var5 = this.field5521;
        float var6 = this.field5527;
        this.field5517 = var2 * var4 - (this.field5520 * var3);
        float var7 = this.field5526;
        this.field5520 = this.field5520 * var2 + var3 * var4;
        this.field5521 = var2 * var5 - (this.field5519 * var3);
        this.field5527 = var2 * var6 - (this.field5522 * var3);
        this.field5519 = this.field5519 * var2 + var3 * var5;
        this.field5522 = this.field5522 * var2 + var3 * var6;
        this.field5526 = var2 * var7 - this.field5516 * var3;
        this.field5516 = this.field5516 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLpo;)V")
    public final void method2440(byte arg0, class202 arg1) {
        class385 var3 = (class385) arg1;
        this.field5518 = var3.field5518;
        this.field5525 = var3.field5517;
        this.field5528 = var3.field5520;
        this.field5521 = var3.field5521;
        this.field5527 = var3.field5519;
        this.field5520 = var3.field5528;
        this.field5517 = var3.field5525;
        this.field5519 = var3.field5527;
        this.field5524 = -(this.field5528 * var3.field5516 + this.field5525 * var3.field5526 + this.field5518 * var3.field5524);
        this.field5522 = var3.field5522;
        this.field5526 = -(this.field5527 * var3.field5516 + this.field5521 * var3.field5526 + this.field5517 * var3.field5524);
        if (arg0 == -12) {
            this.field5516 = -(this.field5522 * var3.field5516 + this.field5520 * var3.field5524 + this.field5519 * var3.field5526);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()V")
    public final void method1531() {
        this.field5517 = this.field5520 = this.field5525 = this.field5519 = this.field5528 = this.field5527 = this.field5524 = this.field5526 = this.field5516 = 0.0F;
        this.field5518 = this.field5521 = this.field5522 = 1.0F;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([I)V")
    public final void method1539(int[] arg0) {
        float var2 = (float) arg0[0] - this.field5524;
        float var3 = (float) arg0[1] - this.field5526;
        float var4 = (float) arg0[2] - this.field5516;
        arg0[2] = (int) (this.field5522 * var4 + this.field5528 * var2 + this.field5527 * var3);
        arg0[0] = (int) (this.field5520 * var4 + this.field5518 * var2 + this.field5517 * var3);
        arg0[1] = (int) (this.field5519 * var4 + this.field5525 * var2 + this.field5521 * var3);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lpo;)V")
    public final void method1530(class202 arg0) {
        class385 var2 = (class385) arg0;
        this.field5522 = var2.field5522;
        this.field5517 = var2.field5517;
        this.field5526 = var2.field5526;
        this.field5524 = var2.field5524;
        this.field5518 = var2.field5518;
        this.field5520 = var2.field5520;
        this.field5519 = var2.field5519;
        this.field5521 = var2.field5521;
        this.field5525 = var2.field5525;
        this.field5527 = var2.field5527;
        this.field5528 = var2.field5528;
        this.field5516 = var2.field5516;
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
    public final void method1541(int arg0) {
        this.field5521 = 1.0F;
        this.field5518 = this.field5522 = class374.field5309[arg0 & 0x3FFF];
        this.field5528 = class374.field5308[arg0 & 0x3FFF];
        this.field5520 = -this.field5528;
        this.field5525 = this.field5524 = this.field5517 = this.field5527 = this.field5526 = this.field5519 = this.field5516 = 0.0F;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)[F")
    public final float[] method2441(byte arg0) {
        field5523[8] = this.field5528;
        field5523[1] = this.field5517;
        field5523[4] = this.field5525;
        field5523[9] = this.field5527;
        field5523[13] = 0.0F;
        field5523[2] = this.field5520;
        field5523[12] = 0.0F;
        field5523[6] = this.field5519;
        field5523[14] = 0.0F;
        if (arg0 == -66) {
            field5523[0] = this.field5518;
            field5523[10] = this.field5522;
            field5523[5] = this.field5521;
            return field5523;
        } else {
            return (float[]) null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public final void method1529(int arg0) {
        this.field5518 = 1.0F;
        this.field5521 = this.field5522 = class374.field5309[arg0 & 0x3FFF];
        this.field5519 = class374.field5308[arg0 & 0x3FFF];
        this.field5527 = -this.field5519;
        this.field5525 = this.field5528 = this.field5524 = this.field5517 = this.field5526 = this.field5520 = this.field5516 = 0.0F;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(III)V")
    public final void method1528(int arg0, int arg1, int arg2) {
        this.field5526 += (float) arg1;
        this.field5524 += (float) arg0;
        this.field5516 += (float) arg2;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)[F")
    public final float[] method2442(byte arg0) {
        field5523[9] = this.field5527;
        field5523[14] = this.field5516;
        field5523[6] = this.field5519;
        field5523[4] = this.field5525;
        field5523[8] = this.field5528;
        field5523[0] = this.field5518;
        if (arg0 != -128) {
            this.field5522 = 1.2013607F;
        }
        field5523[13] = this.field5526;
        field5523[10] = this.field5522;
        field5523[12] = this.field5524;
        field5523[5] = this.field5521;
        field5523[1] = this.field5517;
        field5523[2] = this.field5520;
        return field5523;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
    public final void method1534(int arg0) {
        float var2 = class374.field5309[arg0 & 0x3FFF];
        float var3 = class374.field5308[arg0 & 0x3FFF];
        float var4 = this.field5518;
        float var5 = this.field5525;
        float var6 = this.field5528;
        this.field5518 = this.field5520 * var3 + var2 * var4;
        float var7 = this.field5524;
        this.field5520 = this.field5520 * var2 - (var3 * var4);
        this.field5525 = this.field5519 * var3 + var2 * var5;
        this.field5528 = this.field5522 * var3 + var2 * var6;
        this.field5519 = this.field5519 * var2 - var3 * var5;
        this.field5522 = this.field5522 * var2 - var3 * var6;
        this.field5524 = this.field5516 * var3 + var2 * var7;
        this.field5516 = this.field5516 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
    public class385() {
        this.method1531();
    }
}
