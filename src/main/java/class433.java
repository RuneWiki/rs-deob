import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class433 extends class309 {

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "[F")
    private static float[] field6136 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "F")
    public float field6125;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "F")
    public float field6126;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "F")
    public float field6127;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "F")
    public float field6128;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "F")
    public float field6129;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "F")
    public float field6130;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "F")
    public float field6131;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "F")
    public float field6132;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "F")
    public float field6133;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "F")
    public float field6134;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "F")
    public float field6135;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "F")
    public float field6137;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLve;)V")
    public final void method2672(byte arg0, class309 arg1) {
        class433 var3 = (class433) arg1;
        this.field6137 = var3.field6125;
        this.field6130 = var3.field6130;
        if (arg0 >= -81) {
            this.method1856();
        }
        this.field6128 = var3.field6129;
        this.field6134 = var3.field6134;
        this.field6129 = var3.field6128;
        this.field6126 = var3.field6133;
        this.field6125 = var3.field6137;
        this.field6127 = -(this.field6137 * var3.field6132 + this.field6130 * var3.field6127 + this.field6128 * var3.field6135);
        this.field6131 = var3.field6131;
        this.field6133 = var3.field6126;
        this.field6135 = -(this.field6126 * var3.field6132 + this.field6134 * var3.field6135 + this.field6129 * var3.field6127);
        this.field6132 = -(this.field6131 * var3.field6132 + this.field6133 * var3.field6135 + this.field6125 * var3.field6127);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lve;)V")
    public final void method1871(class309 arg0) {
        class433 var2 = (class433) arg0;
        this.field6133 = var2.field6133;
        this.field6132 = var2.field6132;
        this.field6137 = var2.field6137;
        this.field6129 = var2.field6129;
        this.field6134 = var2.field6134;
        this.field6125 = var2.field6125;
        this.field6127 = var2.field6127;
        this.field6126 = var2.field6126;
        this.field6135 = var2.field6135;
        this.field6128 = var2.field6128;
        this.field6130 = var2.field6130;
        this.field6131 = var2.field6131;
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)[F")
    public final float[] method2673(int arg0) {
        field6136[1] = this.field6129;
        field6136[0] = this.field6130;
        field6136[12] = 0.0F;
        field6136[8] = this.field6137;
        field6136[arg0] = this.field6133;
        field6136[10] = this.field6131;
        field6136[13] = 0.0F;
        field6136[2] = this.field6125;
        field6136[4] = this.field6128;
        field6136[9] = this.field6126;
        field6136[5] = this.field6134;
        field6136[14] = 0.0F;
        return field6136;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(III)V")
    public final void method1869(int arg0, int arg1, int arg2) {
        this.field6132 += (float) arg2;
        this.field6135 += (float) arg1;
        this.field6127 += (float) arg0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public final void method1858(int arg0) {
        this.field6130 = 1.0F;
        this.field6134 = this.field6131 = class434.field6138[arg0 & 0x3FFF];
        this.field6133 = class434.field6139[arg0 & 0x3FFF];
        this.field6126 = -this.field6133;
        this.field6128 = this.field6137 = this.field6127 = this.field6129 = this.field6135 = this.field6125 = this.field6132 = 0.0F;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII)V")
    public final void method1872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class434.field6138[arg3 & 0x3FFF];
        float var8 = class434.field6139[arg3 & 0x3FFF];
        float var9 = class434.field6138[arg4 & 0x3FFF];
        float var10 = class434.field6139[arg4 & 0x3FFF];
        float var11 = class434.field6138[arg5 & 0x3FFF];
        float var12 = class434.field6139[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field6125 = var7 * var10;
        this.field6126 = var9 * var13 + var10 * var12;
        this.field6134 = var7 * var11;
        this.field6130 = var9 * var11 + var10 * var14;
        this.field6133 = -var8;
        this.field6128 = var7 * var12;
        this.field6131 = var7 * var9;
        this.field6137 = -var10 * var11 + var9 * var14;
        this.field6129 = -var9 * var12 + var10 * var13;
        this.field6135 = (float) (-arg0) * this.field6129 - ((float) arg1 * this.field6134) - ((float) arg2 * this.field6126);
        this.field6132 = (float) (-arg0) * this.field6125 - (float) arg1 * this.field6133 - ((float) arg2 * this.field6131);
        this.field6127 = (float) (-arg0) * this.field6130 - ((float) arg1 * this.field6128) - ((float) arg2 * this.field6137);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)[F")
    public final float[] method2674(byte arg0) {
        field6136[0] = this.field6130;
        field6136[14] = this.field6132;
        if (arg0 > -4) {
            this.field6126 = -0.81941587F;
        }
        field6136[1] = this.field6129;
        field6136[10] = this.field6131;
        field6136[12] = this.field6127;
        field6136[5] = this.field6134;
        field6136[13] = this.field6135;
        field6136[9] = this.field6126;
        field6136[6] = this.field6133;
        field6136[4] = this.field6128;
        field6136[2] = this.field6125;
        field6136[8] = this.field6137;
        return field6136;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public final void method1866(int arg0, int arg1, int arg2) {
        this.field6130 = this.field6134 = this.field6131 = 1.0F;
        this.field6127 = (float) arg0;
        this.field6132 = (float) arg2;
        this.field6129 = this.field6125 = this.field6128 = this.field6133 = this.field6137 = this.field6126 = 0.0F;
        this.field6135 = (float) arg1;
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
    public final void method1870(int arg0) {
        this.field6134 = 1.0F;
        this.field6130 = this.field6131 = class434.field6138[arg0 & 0x3FFF];
        this.field6137 = class434.field6139[arg0 & 0x3FFF];
        this.field6125 = -this.field6137;
        this.field6128 = this.field6127 = this.field6129 = this.field6126 = this.field6135 = this.field6133 = this.field6132 = 0.0F;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
    public final void method1862(int arg0) {
        this.field6131 = 1.0F;
        this.field6130 = this.field6134 = class434.field6138[arg0 & 0x3FFF];
        this.field6129 = class434.field6139[arg0 & 0x3FFF];
        this.field6137 = this.field6127 = this.field6126 = this.field6135 = this.field6125 = this.field6133 = this.field6132 = 0.0F;
        this.field6128 = -this.field6129;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V")
    public final void method1865(int arg0) {
        float var2 = class434.field6138[arg0 & 0x3FFF];
        float var3 = class434.field6139[arg0 & 0x3FFF];
        float var4 = this.field6130;
        float var5 = this.field6128;
        float var6 = this.field6137;
        this.field6130 = this.field6125 * var3 + var2 * var4;
        float var7 = this.field6127;
        this.field6125 = this.field6125 * var2 - (var3 * var4);
        this.field6128 = this.field6133 * var3 + var2 * var5;
        this.field6133 = this.field6133 * var2 - var3 * var5;
        this.field6137 = this.field6131 * var3 + var2 * var6;
        this.field6131 = this.field6131 * var2 - (var3 * var6);
        this.field6127 = this.field6132 * var3 + var2 * var7;
        this.field6132 = this.field6132 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
    public final void method1856() {
        this.field6129 = this.field6125 = this.field6128 = this.field6133 = this.field6137 = this.field6126 = this.field6127 = this.field6135 = this.field6132 = 0.0F;
        this.field6130 = this.field6134 = this.field6131 = 1.0F;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public final void method1859(int arg0) {
        float var2 = class434.field6138[arg0 & 0x3FFF];
        float var3 = class434.field6139[arg0 & 0x3FFF];
        float var4 = this.field6129;
        float var5 = this.field6134;
        float var6 = this.field6126;
        float var7 = this.field6135;
        this.field6129 = var2 * var4 - (this.field6125 * var3);
        this.field6134 = var2 * var5 - (this.field6133 * var3);
        this.field6125 = this.field6125 * var2 + var3 * var4;
        this.field6133 = this.field6133 * var2 + var3 * var5;
        this.field6126 = var2 * var6 - (this.field6131 * var3);
        this.field6135 = var2 * var7 - (this.field6132 * var3);
        this.field6131 = this.field6131 * var2 + var3 * var6;
        this.field6132 = this.field6132 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()Lvh;")
    public final class433 method2675() {
        class433 var1 = new class433();
        var1.field6132 = this.field6132;
        var1.field6129 = this.field6129;
        var1.field6130 = this.field6130;
        var1.field6125 = this.field6125;
        var1.field6135 = this.field6135;
        var1.field6131 = this.field6131;
        var1.field6134 = this.field6134;
        var1.field6126 = this.field6126;
        var1.field6127 = this.field6127;
        var1.field6133 = this.field6133;
        var1.field6137 = this.field6137;
        var1.field6128 = this.field6128;
        return var1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[I)V")
    public final void method1860(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field6137 + (float) arg0 * this.field6130 + (float) arg1 * this.field6128 + this.field6127);
        arg3[2] = (int) ((float) arg2 * this.field6131 + (float) arg0 * this.field6125 + (float) arg1 * this.field6133 + this.field6132);
        arg3[1] = (int) ((float) arg2 * this.field6126 + (float) arg0 * this.field6129 + (float) arg1 * this.field6134 + this.field6135);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class433() {
        this.method1856();
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([I)V")
    public final void method1857(int[] arg0) {
        float var2 = (float) arg0[0] - this.field6127;
        float var3 = (float) arg0[1] - this.field6135;
        float var4 = (float) arg0[2] - this.field6132;
        arg0[2] = (int) (this.field6131 * var4 + this.field6137 * var2 + this.field6126 * var3);
        arg0[0] = (int) (this.field6125 * var4 + this.field6130 * var2 + this.field6129 * var3);
        arg0[1] = (int) (this.field6133 * var4 + this.field6134 * var3 + this.field6128 * var2);
    }
}
