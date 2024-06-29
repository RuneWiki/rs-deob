import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class319 extends class282 {

    @OriginalMember(owner = "client!is", name = "j", descriptor = "[F")
    private static float[] field4623 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!is", name = "f", descriptor = "F")
    public float field4619;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "F")
    public float field4620;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "F")
    public float field4621;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "F")
    public float field4622;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "F")
    public float field4624;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "F")
    public float field4625;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "F")
    public float field4626;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "F")
    public float field4627;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "F")
    public float field4628;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "F")
    public float field4629;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "F")
    public float field4630;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "F")
    public float field4631;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
    public final void method1015(int arg0) {
        this.field4622 = 1.0F;
        this.field4620 = this.field4629 = class165.field2432[arg0 & 0x3FFF];
        this.field4627 = class165.field2431[arg0 & 0x3FFF];
        this.field4621 = this.field4628 = this.field4624 = this.field4625 = this.field4631 = this.field4626 = this.field4630 = 0.0F;
        this.field4619 = -this.field4627;
    }

    @OriginalMember(owner = "client!is", name = "f", descriptor = "(I)V")
    public final void method1020(int arg0) {
        float var2 = class165.field2432[arg0 & 0x3FFF];
        float var3 = class165.field2431[arg0 & 0x3FFF];
        float var4 = this.field4622;
        float var5 = this.field4621;
        float var6 = this.field4628;
        this.field4622 = this.field4626 * var3 + var2 * var4;
        float var7 = this.field4624;
        this.field4626 = this.field4626 * var2 - var3 * var4;
        this.field4621 = this.field4627 * var3 + var2 * var5;
        this.field4628 = this.field4629 * var3 + var2 * var6;
        this.field4627 = this.field4627 * var2 - (var3 * var5);
        this.field4624 = this.field4630 * var3 + var2 * var7;
        this.field4629 = this.field4629 * var2 - var3 * var6;
        this.field4630 = this.field4630 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!is", name = "e", descriptor = "(I)V")
    public final void method1010(int arg0) {
        this.field4629 = 1.0F;
        this.field4622 = this.field4620 = class165.field2432[arg0 & 0x3FFF];
        this.field4625 = class165.field2431[arg0 & 0x3FFF];
        this.field4628 = this.field4624 = this.field4619 = this.field4631 = this.field4626 = this.field4627 = this.field4630 = 0.0F;
        this.field4621 = -this.field4625;
    }

    @OriginalMember(owner = "client!is", name = "g", descriptor = "(I)[F")
    public final float[] method2044(int arg0) {
        field4623[8] = this.field4628;
        field4623[14] = this.field4630;
        field4623[6] = this.field4627;
        field4623[10] = this.field4629;
        field4623[4] = this.field4621;
        field4623[13] = this.field4631;
        field4623[2] = this.field4626;
        field4623[12] = this.field4624;
        field4623[9] = this.field4619;
        field4623[0] = this.field4622;
        field4623[arg0] = this.field4625;
        field4623[5] = this.field4620;
        return field4623;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III[I)V")
    public final void method1016(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field4628 + (float) arg0 * this.field4622 + (float) arg1 * this.field4621 + this.field4624);
        arg3[1] = (int) ((float) arg2 * this.field4619 + (float) arg0 * this.field4625 + (float) arg1 * this.field4620 + this.field4631);
        arg3[2] = (int) ((float) arg2 * this.field4629 + (float) arg0 * this.field4626 + (float) arg1 * this.field4627 + this.field4630);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)[F")
    public final float[] method2045(boolean arg0) {
        field4623[4] = this.field4621;
        field4623[6] = this.field4627;
        field4623[9] = this.field4619;
        field4623[13] = 0.0F;
        field4623[10] = this.field4629;
        field4623[2] = this.field4626;
        field4623[8] = this.field4628;
        field4623[5] = this.field4620;
        field4623[14] = 0.0F;
        field4623[0] = this.field4622;
        if (arg0) {
            this.method1013((int[]) null);
        }
        field4623[1] = this.field4625;
        field4623[12] = 0.0F;
        return field4623;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(III)V")
    public final void method1019(int arg0, int arg1, int arg2) {
        this.field4631 = (float) arg1;
        this.field4630 = (float) arg2;
        this.field4625 = this.field4626 = this.field4621 = this.field4627 = this.field4628 = this.field4619 = 0.0F;
        this.field4622 = this.field4620 = this.field4629 = 1.0F;
        this.field4624 = (float) arg0;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
    public final void method1012(int arg0, int arg1, int arg2) {
        this.field4630 += (float) arg2;
        this.field4631 += (float) arg1;
        this.field4624 += (float) arg0;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Los;)V")
    public final void method1014(class282 arg0) {
        class319 var2 = (class319) arg0;
        this.field4631 = var2.field4631;
        this.field4627 = var2.field4627;
        this.field4625 = var2.field4625;
        this.field4629 = var2.field4629;
        this.field4626 = var2.field4626;
        this.field4624 = var2.field4624;
        this.field4628 = var2.field4628;
        this.field4621 = var2.field4621;
        this.field4630 = var2.field4630;
        this.field4619 = var2.field4619;
        this.field4622 = var2.field4622;
        this.field4620 = var2.field4620;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public final void method1011(int arg0) {
        this.field4620 = 1.0F;
        this.field4622 = this.field4629 = class165.field2432[arg0 & 0x3FFF];
        this.field4628 = class165.field2431[arg0 & 0x3FFF];
        this.field4626 = -this.field4628;
        this.field4621 = this.field4624 = this.field4625 = this.field4619 = this.field4631 = this.field4627 = this.field4630 = 0.0F;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "()Lis;")
    public final class319 method2046() {
        class319 var1 = new class319();
        var1.field4621 = this.field4621;
        var1.field4624 = this.field4624;
        var1.field4627 = this.field4627;
        var1.field4628 = this.field4628;
        var1.field4622 = this.field4622;
        var1.field4630 = this.field4630;
        var1.field4626 = this.field4626;
        var1.field4620 = this.field4620;
        var1.field4625 = this.field4625;
        var1.field4619 = this.field4619;
        var1.field4631 = this.field4631;
        var1.field4629 = this.field4629;
        return var1;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([I)V")
    public final void method1013(int[] arg0) {
        float var2 = (float) arg0[0] - this.field4624;
        float var3 = (float) arg0[1] - this.field4631;
        float var4 = (float) arg0[2] - this.field4630;
        arg0[2] = (int) (this.field4629 * var4 + this.field4628 * var2 + this.field4619 * var3);
        arg0[0] = (int) (this.field4626 * var4 + this.field4625 * var3 + this.field4622 * var2);
        arg0[1] = (int) (this.field4627 * var4 + this.field4621 * var2 + this.field4620 * var3);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "()V")
    public final void method1017() {
        this.field4625 = this.field4626 = this.field4621 = this.field4627 = this.field4628 = this.field4619 = this.field4624 = this.field4631 = this.field4630 = 0.0F;
        this.field4622 = this.field4620 = this.field4629 = 1.0F;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V")
    public final void method1018(int arg0) {
        float var2 = class165.field2432[arg0 & 0x3FFF];
        float var3 = class165.field2431[arg0 & 0x3FFF];
        float var4 = this.field4625;
        float var5 = this.field4620;
        float var6 = this.field4619;
        this.field4625 = var2 * var4 - this.field4626 * var3;
        float var7 = this.field4631;
        this.field4626 = this.field4626 * var2 + var3 * var4;
        this.field4620 = var2 * var5 - this.field4627 * var3;
        this.field4627 = this.field4627 * var2 + var3 * var5;
        this.field4619 = var2 * var6 - (this.field4629 * var3);
        this.field4629 = this.field4629 * var2 + var3 * var6;
        this.field4631 = var2 * var7 - this.field4630 * var3;
        this.field4630 = this.field4630 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIII)V")
    public final void method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class165.field2432[arg3 & 0x3FFF];
        float var8 = class165.field2431[arg3 & 0x3FFF];
        float var9 = class165.field2432[arg4 & 0x3FFF];
        float var10 = class165.field2431[arg4 & 0x3FFF];
        float var11 = class165.field2432[arg5 & 0x3FFF];
        float var12 = class165.field2431[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4620 = var7 * var11;
        this.field4622 = var9 * var11 + var10 * var14;
        this.field4621 = var7 * var12;
        this.field4628 = -var10 * var11 + var9 * var14;
        this.field4626 = var7 * var10;
        this.field4627 = -var8;
        this.field4629 = var7 * var9;
        this.field4619 = var9 * var13 + var10 * var12;
        this.field4625 = -var9 * var12 + var10 * var13;
        this.field4630 = (float) (-arg0) * this.field4626 - (float) arg1 * this.field4627 - (float) arg2 * this.field4629;
        this.field4631 = (float) (-arg0) * this.field4625 - (float) arg1 * this.field4620 - ((float) arg2 * this.field4619);
        this.field4624 = (float) (-arg0) * this.field4622 - ((float) arg1 * this.field4621) - (float) arg2 * this.field4628;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILos;)V")
    public final void method2047(int arg0, class282 arg1) {
        class319 var3 = (class319) arg1;
        this.field4628 = var3.field4626;
        this.field4621 = var3.field4625;
        if (arg0 != 0) {
            this.method1011(77);
        }
        this.field4622 = var3.field4622;
        this.field4620 = var3.field4620;
        this.field4625 = var3.field4621;
        this.field4626 = var3.field4628;
        this.field4619 = var3.field4627;
        this.field4627 = var3.field4619;
        this.field4629 = var3.field4629;
        this.field4624 = -(this.field4628 * var3.field4630 + this.field4622 * var3.field4624 + this.field4621 * var3.field4631);
        this.field4631 = -(this.field4619 * var3.field4630 + this.field4625 * var3.field4624 + this.field4620 * var3.field4631);
        this.field4630 = -(this.field4629 * var3.field4630 + this.field4627 * var3.field4631 + this.field4626 * var3.field4624);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
    public class319() {
        this.method1017();
    }
}
