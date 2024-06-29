import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class257 extends class154 {

    @OriginalMember(owner = "client!os", name = "m", descriptor = "[F")
    private static float[] field3802 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!os", name = "k", descriptor = "F")
    public float field3800;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "F")
    public float field3801;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "F")
    public float field3803;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "F")
    public float field3804;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "F")
    public float field3805;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "F")
    public float field3806;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "F")
    public float field3807;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "F")
    public float field3808;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "F")
    public float field3809;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "F")
    public float field3810;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "F")
    public float field3811;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "F")
    public float field3812;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(III)V")
    public final void method1134(int arg0, int arg1, int arg2) {
        this.field3804 += (float) arg1;
        this.field3806 += (float) arg2;
        this.field3809 += (float) arg0;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "()Los;")
    public final class257 method1778() {
        class257 var1 = new class257();
        var1.field3803 = this.field3803;
        var1.field3810 = this.field3810;
        var1.field3808 = this.field3808;
        var1.field3805 = this.field3805;
        var1.field3800 = this.field3800;
        var1.field3807 = this.field3807;
        var1.field3804 = this.field3804;
        var1.field3812 = this.field3812;
        var1.field3811 = this.field3811;
        var1.field3801 = this.field3801;
        var1.field3809 = this.field3809;
        var1.field3806 = this.field3806;
        return var1;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public final void method1131(int arg0) {
        this.field3805 = 1.0F;
        this.field3807 = this.field3812 = class227.field3376[arg0 & 0x3FFF];
        this.field3803 = class227.field3377[arg0 & 0x3FFF];
        this.field3810 = -this.field3803;
        this.field3811 = this.field3808 = this.field3809 = this.field3800 = this.field3804 = this.field3801 = this.field3806 = 0.0F;
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(I)V")
    public final void method1140(int arg0) {
        float var2 = class227.field3376[arg0 & 0x3FFF];
        float var3 = class227.field3377[arg0 & 0x3FFF];
        float var4 = this.field3800;
        float var5 = this.field3807;
        float var6 = this.field3810;
        float var7 = this.field3804;
        this.field3800 = var2 * var4 - (this.field3801 * var3);
        this.field3807 = var2 * var5 - (this.field3803 * var3);
        this.field3801 = this.field3801 * var2 + var3 * var4;
        this.field3810 = var2 * var6 - (this.field3812 * var3);
        this.field3803 = this.field3803 * var2 + var3 * var5;
        this.field3812 = this.field3812 * var2 + var3 * var6;
        this.field3804 = var2 * var7 - (this.field3806 * var3);
        this.field3806 = this.field3806 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V")
    public final void method1144(int arg0) {
        this.field3812 = 1.0F;
        this.field3805 = this.field3807 = class227.field3376[arg0 & 0x3FFF];
        this.field3800 = class227.field3377[arg0 & 0x3FFF];
        this.field3811 = -this.field3800;
        this.field3808 = this.field3809 = this.field3810 = this.field3804 = this.field3801 = this.field3803 = this.field3806 = 0.0F;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)[F")
    public final float[] method1779(byte arg0) {
        field3802[8] = this.field3808;
        field3802[9] = this.field3810;
        field3802[14] = 0.0F;
        field3802[4] = this.field3811;
        field3802[12] = 0.0F;
        if (arg0 <= 104) {
            return (float[]) null;
        }
        field3802[2] = this.field3801;
        field3802[6] = this.field3803;
        field3802[10] = this.field3812;
        field3802[5] = this.field3807;
        field3802[0] = this.field3805;
        field3802[1] = this.field3800;
        field3802[13] = 0.0F;
        return field3802;
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)V")
    public final void method1136(int arg0) {
        this.field3807 = 1.0F;
        this.field3805 = this.field3812 = class227.field3376[arg0 & 0x3FFF];
        this.field3808 = class227.field3377[arg0 & 0x3FFF];
        this.field3801 = -this.field3808;
        this.field3811 = this.field3809 = this.field3800 = this.field3810 = this.field3804 = this.field3803 = this.field3806 = 0.0F;
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
    public final void method1143(int arg0) {
        float var2 = class227.field3376[arg0 & 0x3FFF];
        float var3 = class227.field3377[arg0 & 0x3FFF];
        float var4 = this.field3805;
        float var5 = this.field3811;
        float var6 = this.field3808;
        float var7 = this.field3809;
        this.field3805 = this.field3801 * var3 + var2 * var4;
        this.field3811 = this.field3803 * var3 + var2 * var5;
        this.field3801 = this.field3801 * var2 - (var3 * var4);
        this.field3803 = this.field3803 * var2 - (var3 * var5);
        this.field3808 = this.field3812 * var3 + var2 * var6;
        this.field3812 = this.field3812 * var2 - var3 * var6;
        this.field3809 = this.field3806 * var3 + var2 * var7;
        this.field3806 = this.field3806 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III[I)V")
    public final void method1147(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field3812 + (float) arg0 * this.field3801 + (float) arg1 * this.field3803 + this.field3806);
        arg3[0] = (int) ((float) arg2 * this.field3808 + (float) arg0 * this.field3805 + (float) arg1 * this.field3811 + this.field3809);
        arg3[1] = (int) ((float) arg2 * this.field3810 + (float) arg0 * this.field3800 + (float) arg1 * this.field3807 + this.field3804);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([I)V")
    public final void method1145(int[] arg0) {
        float var2 = (float) arg0[0] - this.field3809;
        float var3 = (float) arg0[1] - this.field3804;
        float var4 = (float) arg0[2] - this.field3806;
        arg0[2] = (int) (this.field3812 * var4 + this.field3810 * var3 + this.field3808 * var2);
        arg0[1] = (int) (this.field3803 * var4 + this.field3811 * var2 + this.field3807 * var3);
        arg0[0] = (int) (this.field3801 * var4 + this.field3805 * var2 + this.field3800 * var3);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "()V")
    public final void method1137() {
        this.field3805 = this.field3807 = this.field3812 = 1.0F;
        this.field3800 = this.field3801 = this.field3811 = this.field3803 = this.field3808 = this.field3810 = this.field3809 = this.field3804 = this.field3806 = 0.0F;
    }

    @OriginalMember(owner = "client!os", name = "i", descriptor = "(I)[F")
    public final float[] method1780(int arg0) {
        field3802[9] = this.field3810;
        field3802[10] = this.field3812;
        field3802[6] = this.field3803;
        field3802[14] = this.field3806;
        field3802[0] = this.field3805;
        field3802[13] = this.field3804;
        field3802[arg0] = this.field3807;
        field3802[8] = this.field3808;
        field3802[12] = this.field3809;
        field3802[2] = this.field3801;
        field3802[1] = this.field3800;
        field3802[4] = this.field3811;
        return field3802;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIII)V")
    public final void method1142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class227.field3376[arg3 & 0x3FFF];
        float var8 = class227.field3377[arg3 & 0x3FFF];
        float var9 = class227.field3376[arg4 & 0x3FFF];
        float var10 = class227.field3377[arg4 & 0x3FFF];
        float var11 = class227.field3376[arg5 & 0x3FFF];
        float var12 = class227.field3377[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3807 = var7 * var11;
        this.field3801 = var7 * var10;
        this.field3803 = -var8;
        this.field3811 = var7 * var12;
        this.field3810 = var9 * var13 + var10 * var12;
        this.field3800 = -var9 * var12 + var10 * var13;
        this.field3812 = var7 * var9;
        this.field3808 = -var10 * var11 + var9 * var14;
        this.field3805 = var9 * var11 + var10 * var14;
        this.field3806 = (float) (-arg0) * this.field3801 - (float) arg1 * this.field3803 - ((float) arg2 * this.field3812);
        this.field3804 = (float) (-arg0) * this.field3800 - (float) arg1 * this.field3807 - ((float) arg2 * this.field3810);
        this.field3809 = (float) (-arg0) * this.field3805 - ((float) arg1 * this.field3811) - ((float) arg2 * this.field3808);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
    public final void method1133(int arg0, int arg1, int arg2) {
        this.field3804 = (float) arg1;
        this.field3806 = (float) arg2;
        this.field3805 = this.field3807 = this.field3812 = 1.0F;
        this.field3809 = (float) arg0;
        this.field3800 = this.field3801 = this.field3811 = this.field3803 = this.field3808 = this.field3810 = 0.0F;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILs;)V")
    public final void method1781(int arg0, class154 arg1) {
        class257 var3 = (class257) arg1;
        this.field3808 = var3.field3801;
        this.field3805 = var3.field3805;
        this.field3811 = var3.field3800;
        this.field3810 = var3.field3803;
        this.field3807 = var3.field3807;
        this.field3801 = var3.field3808;
        this.field3800 = var3.field3811;
        this.field3803 = var3.field3810;
        this.field3812 = var3.field3812;
        this.field3809 = -(this.field3808 * var3.field3806 + this.field3811 * var3.field3804 + this.field3805 * var3.field3809);
        if (arg0 != 1) {
            this.field3810 = 0.82963616F;
        }
        this.field3804 = -(this.field3810 * var3.field3806 + this.field3807 * var3.field3804 + this.field3800 * var3.field3809);
        this.field3806 = -(this.field3812 * var3.field3806 + this.field3803 * var3.field3804 + this.field3801 * var3.field3809);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ls;)V")
    public final void method1139(class154 arg0) {
        class257 var2 = (class257) arg0;
        this.field3805 = var2.field3805;
        this.field3804 = var2.field3804;
        this.field3807 = var2.field3807;
        this.field3806 = var2.field3806;
        this.field3801 = var2.field3801;
        this.field3810 = var2.field3810;
        this.field3811 = var2.field3811;
        this.field3809 = var2.field3809;
        this.field3812 = var2.field3812;
        this.field3803 = var2.field3803;
        this.field3800 = var2.field3800;
        this.field3808 = var2.field3808;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
    public class257() {
        this.method1137();
    }
}
