import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class327 extends class435 {

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "[F")
    private static float[] field5135 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "F")
    public float field5124;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "F")
    public float field5125;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "F")
    public float field5126;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "F")
    public float field5127;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "F")
    public float field5128;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "F")
    public float field5129;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "F")
    public float field5130;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "F")
    public float field5131;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "F")
    public float field5132;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "F")
    public float field5133;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "F")
    public float field5134;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "F")
    public float field5136;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)V", line = 6)
    public final void method1993(int arg0) {
        float var2 = class69.field859[arg0 & 0x3FFF];
        float var3 = class69.field860[arg0 & 0x3FFF];
        float var4 = this.field5133;
        float var5 = this.field5126;
        float var6 = this.field5136;
        this.field5133 = var2 * var4 - (this.field5125 * var3);
        float var7 = this.field5131;
        this.field5125 = this.field5125 * var2 + var3 * var4;
        this.field5126 = var2 * var5 - (this.field5128 * var3);
        this.field5136 = var2 * var6 - this.field5134 * var3;
        this.field5128 = this.field5128 * var2 + var3 * var5;
        this.field5131 = var2 * var7 - (this.field5127 * var3);
        this.field5134 = this.field5134 * var2 + var3 * var6;
        this.field5127 = this.field5127 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lpg;)V", line = 31)
    public final void method1992(class435 arg0) {
        class327 var2 = (class327) arg0;
        this.field5128 = var2.field5128;
        this.field5131 = var2.field5131;
        this.field5132 = var2.field5132;
        this.field5124 = var2.field5124;
        this.field5129 = var2.field5129;
        this.field5136 = var2.field5136;
        this.field5134 = var2.field5134;
        this.field5125 = var2.field5125;
        this.field5130 = var2.field5130;
        this.field5126 = var2.field5126;
        this.field5127 = var2.field5127;
        this.field5133 = var2.field5133;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([I)V", line = 51)
    public final void method1985(int[] arg0) {
        float var2 = (float) arg0[0] - this.field5132;
        float var3 = (float) arg0[1] - this.field5131;
        float var4 = (float) arg0[2] - this.field5127;
        arg0[2] = (int) (this.field5134 * var4 + this.field5136 * var3 + this.field5124 * var2);
        arg0[0] = (int) (this.field5125 * var4 + this.field5133 * var3 + this.field5130 * var2);
        arg0[1] = (int) (this.field5128 * var4 + this.field5129 * var2 + this.field5126 * var3);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)V", line = 66)
    public final void method1984(int arg0, int arg1, int arg2) {
        this.field5132 = (float) arg0;
        this.field5127 = (float) arg2;
        this.field5131 = (float) arg1;
        this.field5133 = this.field5125 = this.field5129 = this.field5128 = this.field5124 = this.field5136 = 0.0F;
        this.field5130 = this.field5126 = this.field5134 = 1.0F;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 79)
    public final void method1989(int arg0) {
        this.field5134 = 1.0F;
        this.field5130 = this.field5126 = class69.field859[arg0 & 0x3FFF];
        this.field5133 = class69.field860[arg0 & 0x3FFF];
        this.field5124 = this.field5132 = this.field5136 = this.field5131 = this.field5125 = this.field5128 = this.field5127 = 0.0F;
        this.field5129 = -this.field5133;
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)[F", line = 90)
    public final float[] method2172(int arg0) {
        field5135[1] = this.field5133;
        field5135[12] = 0.0F;
        field5135[5] = this.field5126;
        field5135[13] = 0.0F;
        field5135[0] = this.field5130;
        field5135[6] = this.field5128;
        field5135[10] = this.field5134;
        field5135[9] = this.field5136;
        field5135[8] = this.field5124;
        field5135[2] = this.field5125;
        field5135[4] = this.field5129;
        field5135[14] = (float) arg0;
        return field5135;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 110)
    public final void method1994(int arg0) {
        float var2 = class69.field859[arg0 & 0x3FFF];
        float var3 = class69.field860[arg0 & 0x3FFF];
        float var4 = this.field5130;
        float var5 = this.field5129;
        float var6 = this.field5124;
        float var7 = this.field5132;
        this.field5130 = this.field5125 * var3 + var2 * var4;
        this.field5125 = this.field5125 * var2 - (var3 * var4);
        this.field5129 = this.field5128 * var3 + var2 * var5;
        this.field5128 = this.field5128 * var2 - var3 * var5;
        this.field5124 = this.field5134 * var3 + var2 * var6;
        this.field5132 = this.field5127 * var3 + var2 * var7;
        this.field5134 = this.field5134 * var2 - var3 * var6;
        this.field5127 = this.field5127 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)[F", line = 136)
    public final float[] method2173(int arg0) {
        field5135[1] = this.field5133;
        field5135[8] = this.field5124;
        field5135[2] = this.field5125;
        field5135[6] = this.field5128;
        field5135[13] = this.field5131;
        field5135[10] = this.field5134;
        field5135[9] = this.field5136;
        if (arg0 >= -18) {
            this.field5124 = 1.3314993F;
        }
        field5135[12] = this.field5132;
        field5135[0] = this.field5130;
        field5135[4] = this.field5129;
        field5135[14] = this.field5127;
        field5135[5] = this.field5126;
        return field5135;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "()Llq;", line = 160)
    public final class327 method2174() {
        class327 var1 = new class327();
        var1.field5125 = this.field5125;
        var1.field5131 = this.field5131;
        var1.field5124 = this.field5124;
        var1.field5126 = this.field5126;
        var1.field5134 = this.field5134;
        var1.field5132 = this.field5132;
        var1.field5133 = this.field5133;
        var1.field5127 = this.field5127;
        var1.field5129 = this.field5129;
        var1.field5136 = this.field5136;
        var1.field5130 = this.field5130;
        var1.field5128 = this.field5128;
        return var1;
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V", line = 180)
    public final void method1986(int arg0) {
        this.field5130 = 1.0F;
        this.field5126 = this.field5134 = class69.field859[arg0 & 0x3FFF];
        this.field5128 = class69.field860[arg0 & 0x3FFF];
        this.field5129 = this.field5124 = this.field5132 = this.field5133 = this.field5131 = this.field5125 = this.field5127 = 0.0F;
        this.field5136 = -this.field5128;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIII)V", line = 196)
    public final void method1987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class69.field859[arg3 & 0x3FFF];
        float var8 = class69.field860[arg3 & 0x3FFF];
        float var9 = class69.field859[arg4 & 0x3FFF];
        float var10 = class69.field860[arg4 & 0x3FFF];
        float var11 = class69.field859[arg5 & 0x3FFF];
        float var12 = class69.field860[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field5126 = var7 * var11;
        this.field5124 = -var10 * var11 + var9 * var14;
        this.field5136 = var9 * var13 + var10 * var12;
        this.field5129 = var7 * var12;
        this.field5128 = -var8;
        this.field5134 = var7 * var9;
        this.field5133 = -var9 * var12 + var10 * var13;
        this.field5130 = var9 * var11 + var10 * var14;
        this.field5125 = var7 * var10;
        this.field5132 = (float) (-arg0) * this.field5130 - (float) arg1 * this.field5129 - ((float) arg2 * this.field5124);
        this.field5127 = (float) (-arg0) * this.field5125 - ((float) arg1 * this.field5128) - ((float) arg2 * this.field5134);
        this.field5131 = (float) (-arg0) * this.field5133 - (float) arg1 * this.field5126 - (float) arg2 * this.field5136;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "()V", line = 229)
    public final void method1988() {
        this.field5130 = this.field5126 = this.field5134 = 1.0F;
        this.field5133 = this.field5125 = this.field5129 = this.field5128 = this.field5124 = this.field5136 = this.field5132 = this.field5131 = this.field5127 = 0.0F;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III[I)V", line = 239)
    public final void method1996(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field5134 + (float) arg0 * this.field5125 + (float) arg1 * this.field5128 + this.field5127);
        arg3[1] = (int) ((float) arg2 * this.field5136 + (float) arg0 * this.field5133 + (float) arg1 * this.field5126 + this.field5131);
        arg3[0] = (int) ((float) arg2 * this.field5124 + (float) arg0 * this.field5130 + (float) arg1 * this.field5129 + this.field5132);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(III)V", line = 248)
    public final void method1995(int arg0, int arg1, int arg2) {
        this.field5132 += (float) arg0;
        this.field5131 += (float) arg1;
        this.field5127 += (float) arg2;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lpg;I)V", line = 260)
    public final void method2175(class435 arg0, int arg1) {
        if (arg1 != 2708) {
            field5135 = (float[]) null;
        }
        class327 var3 = (class327) arg0;
        this.field5130 = var3.field5130;
        this.field5129 = var3.field5133;
        this.field5124 = var3.field5125;
        this.field5136 = var3.field5128;
        this.field5133 = var3.field5129;
        this.field5126 = var3.field5126;
        this.field5125 = var3.field5124;
        this.field5132 = -(this.field5124 * var3.field5127 + this.field5130 * var3.field5132 + this.field5129 * var3.field5131);
        this.field5134 = var3.field5134;
        this.field5128 = var3.field5136;
        this.field5131 = -(this.field5136 * var3.field5127 + this.field5133 * var3.field5132 + this.field5126 * var3.field5131);
        this.field5127 = -(this.field5134 * var3.field5127 + this.field5128 * var3.field5131 + this.field5125 * var3.field5132);
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V", line = 286)
    public final void method1991(int arg0) {
        this.field5126 = 1.0F;
        this.field5130 = this.field5134 = class69.field859[arg0 & 0x3FFF];
        this.field5124 = class69.field860[arg0 & 0x3FFF];
        this.field5125 = -this.field5124;
        this.field5129 = this.field5132 = this.field5133 = this.field5136 = this.field5131 = this.field5128 = this.field5127 = 0.0F;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V", line = 299)
    public class327() {
        this.method1988();
    }
}
