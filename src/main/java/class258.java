import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class258 extends class177 {

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "[F")
    private static float[] field3779 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "F")
    public float field3770;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "F")
    public float field3771;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "F")
    public float field3772;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "F")
    public float field3773;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "F")
    public float field3774;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "F")
    public float field3775;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "F")
    public float field3776;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "F")
    public float field3777;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "F")
    public float field3778;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "F")
    public float field3780;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "F")
    public float field3781;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "F")
    public float field3782;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 4)
    public final void method978(int arg0) {
        this.field3777 = 1.0F;
        this.field3776 = this.field3774 = class217.field2877[arg0 & 0x3FFF];
        this.field3778 = class217.field2878[arg0 & 0x3FFF];
        this.field3770 = this.field3772 = this.field3781 = this.field3775 = this.field3771 = this.field3780 = this.field3782 = 0.0F;
        this.field3773 = -this.field3778;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLvj;)V", line = 16)
    public final void method1790(byte arg0, class177 arg1) {
        class258 var3 = (class258) arg1;
        this.field3770 = var3.field3775;
        this.field3777 = var3.field3777;
        this.field3772 = var3.field3780;
        int var4 = 79 % ((arg0 + 66) / 55);
        this.field3776 = var3.field3776;
        this.field3780 = var3.field3772;
        this.field3775 = var3.field3770;
        this.field3773 = var3.field3778;
        this.field3778 = var3.field3773;
        this.field3781 = -(this.field3772 * var3.field3782 + this.field3777 * var3.field3781 + this.field3770 * var3.field3771);
        this.field3774 = var3.field3774;
        this.field3771 = -(this.field3773 * var3.field3782 + this.field3776 * var3.field3771 + this.field3775 * var3.field3781);
        this.field3782 = -(this.field3774 * var3.field3782 + this.field3780 * var3.field3781 + this.field3778 * var3.field3771);
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 37)
    public final void method984(int arg0) {
        this.field3776 = 1.0F;
        this.field3777 = this.field3774 = class217.field2877[arg0 & 0x3FFF];
        this.field3772 = class217.field2878[arg0 & 0x3FFF];
        this.field3770 = this.field3781 = this.field3775 = this.field3773 = this.field3771 = this.field3778 = this.field3782 = 0.0F;
        this.field3780 = -this.field3772;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([I)V", line = 49)
    public final void method987(int[] arg0) {
        float var2 = (float) arg0[0] - this.field3781;
        float var3 = (float) arg0[1] - this.field3771;
        float var4 = (float) arg0[2] - this.field3782;
        arg0[1] = (int) (this.field3778 * var4 + this.field3776 * var3 + this.field3770 * var2);
        arg0[0] = (int) (this.field3780 * var4 + this.field3777 * var2 + this.field3775 * var3);
        arg0[2] = (int) (this.field3774 * var4 + this.field3773 * var3 + this.field3772 * var2);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)V", line = 63)
    public final void method985(int arg0, int arg1, int arg2) {
        this.field3771 = (float) arg1;
        this.field3781 = (float) arg0;
        this.field3777 = this.field3776 = this.field3774 = 1.0F;
        this.field3775 = this.field3780 = this.field3770 = this.field3778 = this.field3772 = this.field3773 = 0.0F;
        this.field3782 = (float) arg2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III[I)V", line = 74)
    public final void method979(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field3772 + (float) arg0 * this.field3777 + (float) arg1 * this.field3770 + this.field3781);
        arg3[1] = (int) ((float) arg2 * this.field3773 + (float) arg0 * this.field3775 + (float) arg1 * this.field3776 + this.field3771);
        arg3[2] = (int) ((float) arg2 * this.field3774 + (float) arg0 * this.field3780 + (float) arg1 * this.field3778 + this.field3782);
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)[F", line = 83)
    public final float[] method1791(int arg0) {
        field3779[4] = this.field3770;
        field3779[2] = this.field3780;
        field3779[5] = this.field3776;
        field3779[0] = this.field3777;
        field3779[12] = 0.0F;
        field3779[9] = this.field3773;
        field3779[14] = 0.0F;
        field3779[8] = this.field3772;
        field3779[13] = 0.0F;
        field3779[arg0] = this.field3775;
        field3779[10] = this.field3774;
        field3779[6] = this.field3778;
        return field3779;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V", line = 102)
    public final void method982(int arg0) {
        this.field3774 = 1.0F;
        this.field3777 = this.field3776 = class217.field2877[arg0 & 0x3FFF];
        this.field3775 = class217.field2878[arg0 & 0x3FFF];
        this.field3772 = this.field3781 = this.field3773 = this.field3771 = this.field3780 = this.field3778 = this.field3782 = 0.0F;
        this.field3770 = -this.field3775;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)[F", line = 114)
    public final float[] method1792(int arg0) {
        field3779[1] = this.field3775;
        field3779[4] = this.field3770;
        field3779[12] = this.field3781;
        field3779[6] = this.field3778;
        field3779[10] = this.field3774;
        field3779[8] = this.field3772;
        field3779[5] = this.field3776;
        field3779[9] = this.field3773;
        field3779[2] = this.field3780;
        field3779[14] = this.field3782;
        field3779[0] = this.field3777;
        field3779[arg0] = this.field3771;
        return field3779;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 142)
    public final void method980(int arg0) {
        float var2 = class217.field2877[arg0 & 0x3FFF];
        float var3 = class217.field2878[arg0 & 0x3FFF];
        float var4 = this.field3777;
        float var5 = this.field3770;
        float var6 = this.field3772;
        this.field3777 = this.field3780 * var3 + var2 * var4;
        float var7 = this.field3781;
        this.field3770 = this.field3778 * var3 + var2 * var5;
        this.field3780 = this.field3780 * var2 - var3 * var4;
        this.field3778 = this.field3778 * var2 - var3 * var5;
        this.field3772 = this.field3774 * var3 + var2 * var6;
        this.field3774 = this.field3774 * var2 - var3 * var6;
        this.field3781 = this.field3782 * var3 + var2 * var7;
        this.field3782 = this.field3782 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V", line = 168)
    public final void method988(int arg0) {
        float var2 = class217.field2877[arg0 & 0x3FFF];
        float var3 = class217.field2878[arg0 & 0x3FFF];
        float var4 = this.field3775;
        float var5 = this.field3776;
        float var6 = this.field3773;
        this.field3775 = var2 * var4 - (this.field3780 * var3);
        float var7 = this.field3771;
        this.field3776 = var2 * var5 - this.field3778 * var3;
        this.field3780 = this.field3780 * var2 + var3 * var4;
        this.field3778 = this.field3778 * var2 + var3 * var5;
        this.field3773 = var2 * var6 - (this.field3774 * var3);
        this.field3774 = this.field3774 * var2 + var3 * var6;
        this.field3771 = var2 * var7 - (this.field3782 * var3);
        this.field3782 = this.field3782 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)V", line = 194)
    public final void method981(int arg0, int arg1, int arg2) {
        this.field3782 += (float) arg2;
        this.field3781 += (float) arg0;
        this.field3771 += (float) arg1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V", line = 206)
    public final void method976() {
        this.field3777 = this.field3776 = this.field3774 = 1.0F;
        this.field3775 = this.field3780 = this.field3770 = this.field3778 = this.field3772 = this.field3773 = this.field3781 = this.field3771 = this.field3782 = 0.0F;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lvj;)V", line = 217)
    public final void method986(class177 arg0) {
        class258 var2 = (class258) arg0;
        this.field3771 = var2.field3771;
        this.field3778 = var2.field3778;
        this.field3772 = var2.field3772;
        this.field3777 = var2.field3777;
        this.field3782 = var2.field3782;
        this.field3780 = var2.field3780;
        this.field3776 = var2.field3776;
        this.field3770 = var2.field3770;
        this.field3774 = var2.field3774;
        this.field3773 = var2.field3773;
        this.field3775 = var2.field3775;
        this.field3781 = var2.field3781;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII)V", line = 238)
    public final void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class217.field2877[arg3 & 0x3FFF];
        float var8 = class217.field2878[arg3 & 0x3FFF];
        float var9 = class217.field2877[arg4 & 0x3FFF];
        float var10 = class217.field2878[arg4 & 0x3FFF];
        float var11 = class217.field2877[arg5 & 0x3FFF];
        float var12 = class217.field2878[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3777 = var9 * var11 + var10 * var14;
        this.field3780 = var7 * var10;
        this.field3774 = var7 * var9;
        this.field3770 = var7 * var12;
        this.field3778 = -var8;
        this.field3773 = var9 * var13 + var10 * var12;
        this.field3775 = -var9 * var12 + var10 * var13;
        this.field3776 = var7 * var11;
        this.field3772 = -var10 * var11 + var9 * var14;
        this.field3781 = (float) (-arg0) * this.field3777 - ((float) arg1 * this.field3770) - ((float) arg2 * this.field3772);
        this.field3771 = (float) (-arg0) * this.field3775 - (float) arg1 * this.field3776 - (float) arg2 * this.field3773;
        this.field3782 = (float) (-arg0) * this.field3780 - ((float) arg1 * this.field3778) - ((float) arg2 * this.field3774);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()Lmb;", line = 275)
    public final class258 method1793() {
        class258 var1 = new class258();
        var1.field3777 = this.field3777;
        var1.field3770 = this.field3770;
        var1.field3780 = this.field3780;
        var1.field3773 = this.field3773;
        var1.field3771 = this.field3771;
        var1.field3778 = this.field3778;
        var1.field3781 = this.field3781;
        var1.field3776 = this.field3776;
        var1.field3772 = this.field3772;
        var1.field3775 = this.field3775;
        var1.field3782 = this.field3782;
        var1.field3774 = this.field3774;
        return var1;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 295)
    public class258() {
        this.method976();
    }
}
