import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class338 extends class327 {

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "[F")
    private static float[] field4865 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "F")
    public float field4857;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "F")
    public float field4858;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "F")
    public float field4859;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "F")
    public float field4860;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "F")
    public float field4861;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "F")
    public float field4862;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "F")
    public float field4863;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "F")
    public float field4864;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "F")
    public float field4866;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "F")
    public float field4867;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "F")
    public float field4868;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "F")
    public float field4869;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)[F", line = 4)
    public final float[] method2050(byte arg0) {
        field4865[6] = this.field4866;
        field4865[13] = this.field4862;
        if (arg0 != 70) {
            this.field4869 = -0.45131928F;
        }
        field4865[10] = this.field4859;
        field4865[9] = this.field4869;
        field4865[5] = this.field4860;
        field4865[0] = this.field4863;
        field4865[8] = this.field4868;
        field4865[4] = this.field4867;
        field4865[12] = this.field4858;
        field4865[2] = this.field4861;
        field4865[1] = this.field4857;
        field4865[14] = this.field4864;
        return field4865;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()V", line = 26)
    public final void method561() {
        this.field4857 = this.field4861 = this.field4867 = this.field4866 = this.field4868 = this.field4869 = this.field4858 = this.field4862 = this.field4864 = 0.0F;
        this.field4863 = this.field4860 = this.field4859 = 1.0F;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)[F", line = 35)
    public final float[] method2051(boolean arg0) {
        field4865[6] = this.field4866;
        if (!arg0) {
            return (float[]) null;
        }
        field4865[13] = 0.0F;
        field4865[14] = 0.0F;
        field4865[9] = this.field4869;
        field4865[12] = 0.0F;
        field4865[0] = this.field4863;
        field4865[2] = this.field4861;
        field4865[10] = this.field4859;
        field4865[8] = this.field4868;
        field4865[1] = this.field4857;
        field4865[4] = this.field4867;
        field4865[5] = this.field4860;
        return field4865;
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V", line = 58)
    public final void method555(int arg0) {
        this.field4859 = 1.0F;
        this.field4863 = this.field4860 = class197.field2709[arg0 & 0x3FFF];
        this.field4857 = class197.field2710[arg0 & 0x3FFF];
        this.field4868 = this.field4858 = this.field4869 = this.field4862 = this.field4861 = this.field4866 = this.field4864 = 0.0F;
        this.field4867 = -this.field4857;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "()Lij;", line = 73)
    public final class338 method2052() {
        class338 var1 = new class338();
        var1.field4863 = this.field4863;
        var1.field4862 = this.field4862;
        var1.field4866 = this.field4866;
        var1.field4861 = this.field4861;
        var1.field4869 = this.field4869;
        var1.field4867 = this.field4867;
        var1.field4868 = this.field4868;
        var1.field4858 = this.field4858;
        var1.field4864 = this.field4864;
        var1.field4860 = this.field4860;
        var1.field4857 = this.field4857;
        var1.field4859 = this.field4859;
        return var1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIII)V", line = 94)
    public final void method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class197.field2709[arg3 & 0x3FFF];
        float var8 = class197.field2710[arg3 & 0x3FFF];
        float var9 = class197.field2709[arg4 & 0x3FFF];
        float var10 = class197.field2710[arg4 & 0x3FFF];
        float var11 = class197.field2709[arg5 & 0x3FFF];
        float var12 = class197.field2710[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4868 = -var10 * var11 + var9 * var14;
        this.field4857 = -var9 * var12 + var10 * var13;
        this.field4867 = var7 * var12;
        this.field4859 = var7 * var9;
        this.field4869 = var9 * var13 + var10 * var12;
        this.field4863 = var9 * var11 + var10 * var14;
        this.field4861 = var7 * var10;
        this.field4866 = -var8;
        this.field4860 = var7 * var11;
        this.field4858 = (float) (-arg0) * this.field4863 - ((float) arg1 * this.field4867) - (float) arg2 * this.field4868;
        this.field4862 = (float) (-arg0) * this.field4857 - (float) arg1 * this.field4860 - (float) arg2 * this.field4869;
        this.field4864 = (float) (-arg0) * this.field4861 - (float) arg1 * this.field4866 - (float) arg2 * this.field4859;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lbd;)V", line = 130)
    public final void method559(class327 arg0) {
        class338 var2 = (class338) arg0;
        this.field4857 = var2.field4857;
        this.field4859 = var2.field4859;
        this.field4861 = var2.field4861;
        this.field4868 = var2.field4868;
        this.field4866 = var2.field4866;
        this.field4864 = var2.field4864;
        this.field4858 = var2.field4858;
        this.field4869 = var2.field4869;
        this.field4863 = var2.field4863;
        this.field4867 = var2.field4867;
        this.field4862 = var2.field4862;
        this.field4860 = var2.field4860;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V", line = 150)
    public final void method550(int arg0, int arg1, int arg2) {
        this.field4862 += (float) arg1;
        this.field4858 += (float) arg0;
        this.field4864 += (float) arg2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 163)
    public final void method552(int arg0) {
        float var2 = class197.field2709[arg0 & 0x3FFF];
        float var3 = class197.field2710[arg0 & 0x3FFF];
        float var4 = this.field4857;
        float var5 = this.field4860;
        float var6 = this.field4869;
        float var7 = this.field4862;
        this.field4857 = var2 * var4 - this.field4861 * var3;
        this.field4861 = this.field4861 * var2 + var3 * var4;
        this.field4860 = var2 * var5 - this.field4866 * var3;
        this.field4869 = var2 * var6 - this.field4859 * var3;
        this.field4866 = this.field4866 * var2 + var3 * var5;
        this.field4859 = this.field4859 * var2 + var3 * var6;
        this.field4862 = var2 * var7 - this.field4864 * var3;
        this.field4864 = this.field4864 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([I)V", line = 188)
    public final void method551(int[] arg0) {
        float var2 = (float) arg0[0] - this.field4858;
        float var3 = (float) arg0[1] - this.field4862;
        float var4 = (float) arg0[2] - this.field4864;
        arg0[0] = (int) (this.field4861 * var4 + this.field4863 * var2 + this.field4857 * var3);
        arg0[1] = (int) (this.field4866 * var4 + this.field4867 * var2 + this.field4860 * var3);
        arg0[2] = (int) (this.field4859 * var4 + this.field4869 * var3 + this.field4868 * var2);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(III)V", line = 204)
    public final void method553(int arg0, int arg1, int arg2) {
        this.field4857 = this.field4861 = this.field4867 = this.field4866 = this.field4868 = this.field4869 = 0.0F;
        this.field4863 = this.field4860 = this.field4859 = 1.0F;
        this.field4858 = (float) arg0;
        this.field4862 = (float) arg1;
        this.field4864 = (float) arg2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILbd;)V", line = 219)
    public final void method2053(int arg0, class327 arg1) {
        if (arg0 >= -53) {
            this.method551((int[]) null);
        }
        class338 var3 = (class338) arg1;
        this.field4868 = var3.field4861;
        this.field4867 = var3.field4857;
        this.field4863 = var3.field4863;
        this.field4857 = var3.field4867;
        this.field4861 = var3.field4868;
        this.field4860 = var3.field4860;
        this.field4869 = var3.field4866;
        this.field4858 = -(this.field4868 * var3.field4864 + this.field4867 * var3.field4862 + this.field4863 * var3.field4858);
        this.field4866 = var3.field4869;
        this.field4859 = var3.field4859;
        this.field4862 = -(this.field4869 * var3.field4864 + this.field4860 * var3.field4862 + this.field4857 * var3.field4858);
        this.field4864 = -(this.field4859 * var3.field4864 + this.field4866 * var3.field4862 + this.field4861 * var3.field4858);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III[I)V", line = 243)
    public final void method557(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field4859 + (float) arg0 * this.field4861 + (float) arg1 * this.field4866 + this.field4864);
        arg3[1] = (int) ((float) arg2 * this.field4869 + (float) arg0 * this.field4857 + (float) arg1 * this.field4860 + this.field4862);
        arg3[0] = (int) ((float) arg2 * this.field4868 + (float) arg0 * this.field4863 + (float) arg1 * this.field4867 + this.field4858);
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V", line = 253)
    public final void method558(int arg0) {
        this.field4860 = 1.0F;
        this.field4863 = this.field4859 = class197.field2709[arg0 & 0x3FFF];
        this.field4868 = class197.field2710[arg0 & 0x3FFF];
        this.field4867 = this.field4858 = this.field4857 = this.field4869 = this.field4862 = this.field4866 = this.field4864 = 0.0F;
        this.field4861 = -this.field4868;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V", line = 265)
    public final void method554(int arg0) {
        float var2 = class197.field2709[arg0 & 0x3FFF];
        float var3 = class197.field2710[arg0 & 0x3FFF];
        float var4 = this.field4863;
        float var5 = this.field4867;
        float var6 = this.field4868;
        float var7 = this.field4858;
        this.field4863 = this.field4861 * var3 + var2 * var4;
        this.field4861 = this.field4861 * var2 - var3 * var4;
        this.field4867 = this.field4866 * var3 + var2 * var5;
        this.field4866 = this.field4866 * var2 - var3 * var5;
        this.field4868 = this.field4859 * var3 + var2 * var6;
        this.field4858 = this.field4864 * var3 + var2 * var7;
        this.field4859 = this.field4859 * var2 - var3 * var6;
        this.field4864 = this.field4864 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V", line = 290)
    public final void method560(int arg0) {
        this.field4863 = 1.0F;
        this.field4860 = this.field4859 = class197.field2709[arg0 & 0x3FFF];
        this.field4866 = class197.field2710[arg0 & 0x3FFF];
        this.field4867 = this.field4868 = this.field4858 = this.field4857 = this.field4862 = this.field4861 = this.field4864 = 0.0F;
        this.field4869 = -this.field4866;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 302)
    public class338() {
        this.method561();
    }
}
