import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class349 extends class18 {

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "[F")
    private static float[] field4956 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "F")
    public float field4948;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "F")
    public float field4949;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "F")
    public float field4950;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "F")
    public float field4951;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "F")
    public float field4952;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "F")
    public float field4953;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "F")
    public float field4954;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "F")
    public float field4955;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "F")
    public float field4957;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "F")
    public float field4958;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "F")
    public float field4959;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "F")
    public float field4960;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III[I)V", line = 6)
    public final void method122(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field4955 + (float) arg0 * this.field4950 + (float) arg1 * this.field4954 + this.field4951);
        arg3[1] = (int) ((float) arg2 * this.field4957 + (float) arg0 * this.field4953 + (float) arg1 * this.field4948 + this.field4949);
        arg3[0] = (int) ((float) arg2 * this.field4959 + (float) arg0 * this.field4958 + (float) arg1 * this.field4960 + this.field4952);
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)[F", line = 15)
    public final float[] method2234(int arg0) {
        field4956[13] = this.field4949;
        int var2 = 89 % ((-arg0 - 7) / 61);
        field4956[2] = this.field4950;
        field4956[5] = this.field4948;
        field4956[12] = this.field4952;
        field4956[9] = this.field4957;
        field4956[10] = this.field4955;
        field4956[14] = this.field4951;
        field4956[4] = this.field4960;
        field4956[6] = this.field4954;
        field4956[1] = this.field4953;
        field4956[0] = this.field4958;
        field4956[8] = this.field4959;
        return field4956;
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)V", line = 38)
    public final void method130(int arg0) {
        float var2 = class196.field2818[arg0 & 0x3FFF];
        float var3 = class196.field2819[arg0 & 0x3FFF];
        float var4 = this.field4953;
        float var5 = this.field4948;
        float var6 = this.field4957;
        this.field4953 = var2 * var4 - (this.field4950 * var3);
        float var7 = this.field4949;
        this.field4950 = this.field4950 * var2 + var3 * var4;
        this.field4948 = var2 * var5 - this.field4954 * var3;
        this.field4957 = var2 * var6 - this.field4955 * var3;
        this.field4954 = this.field4954 * var2 + var3 * var5;
        this.field4949 = var2 * var7 - (this.field4951 * var3);
        this.field4955 = this.field4955 * var2 + var3 * var6;
        this.field4951 = this.field4951 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLnc;)V", line = 64)
    public final void method2235(byte arg0, class18 arg1) {
        class349 var3 = (class349) arg1;
        this.field4960 = var3.field4953;
        this.field4958 = var3.field4958;
        this.field4959 = var3.field4950;
        this.field4953 = var3.field4960;
        this.field4950 = var3.field4959;
        this.field4957 = var3.field4954;
        this.field4948 = var3.field4948;
        this.field4955 = var3.field4955;
        this.field4952 = -(this.field4959 * var3.field4951 + this.field4960 * var3.field4949 + this.field4958 * var3.field4952);
        this.field4954 = var3.field4957;
        this.field4949 = -(this.field4957 * var3.field4951 + this.field4953 * var3.field4952 + this.field4948 * var3.field4949);
        if (arg0 < 103) {
            this.method122(17, 48, -13, (int[]) null);
        }
        this.field4951 = -(this.field4955 * var3.field4951 + this.field4954 * var3.field4949 + this.field4950 * var3.field4952);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "()V", line = 87)
    public final void method129() {
        this.field4958 = this.field4948 = this.field4955 = 1.0F;
        this.field4953 = this.field4950 = this.field4960 = this.field4954 = this.field4959 = this.field4957 = this.field4952 = this.field4949 = this.field4951 = 0.0F;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)[F", line = 95)
    public final float[] method2236(byte arg0) {
        field4956[10] = this.field4955;
        field4956[5] = this.field4948;
        field4956[13] = 0.0F;
        field4956[6] = this.field4954;
        field4956[9] = this.field4957;
        field4956[14] = 0.0F;
        field4956[4] = this.field4960;
        if (arg0 != -81) {
            this.field4960 = -0.9629343F;
        }
        field4956[8] = this.field4959;
        field4956[0] = this.field4958;
        field4956[12] = 0.0F;
        field4956[2] = this.field4950;
        field4956[1] = this.field4953;
        return field4956;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIII)V", line = 118)
    public final void method131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class196.field2818[arg3 & 0x3FFF];
        float var8 = class196.field2819[arg3 & 0x3FFF];
        float var9 = class196.field2818[arg4 & 0x3FFF];
        float var10 = class196.field2819[arg4 & 0x3FFF];
        float var11 = class196.field2818[arg5 & 0x3FFF];
        float var12 = class196.field2819[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4948 = var7 * var11;
        this.field4953 = -var9 * var12 + var10 * var13;
        this.field4959 = -var10 * var11 + var9 * var14;
        this.field4957 = var9 * var13 + var10 * var12;
        this.field4955 = var7 * var9;
        this.field4950 = var7 * var10;
        this.field4960 = var7 * var12;
        this.field4954 = -var8;
        this.field4958 = var9 * var11 + var10 * var14;
        this.field4952 = (float) (-arg0) * this.field4958 - ((float) arg1 * this.field4960) - ((float) arg2 * this.field4959);
        this.field4949 = (float) (-arg0) * this.field4953 - ((float) arg1 * this.field4948) - (float) arg2 * this.field4957;
        this.field4951 = (float) (-arg0) * this.field4950 - (float) arg1 * this.field4954 - (float) arg2 * this.field4955;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 154)
    public final void method120(int arg0) {
        this.field4955 = 1.0F;
        this.field4958 = this.field4948 = class196.field2818[arg0 & 0x3FFF];
        this.field4953 = class196.field2819[arg0 & 0x3FFF];
        this.field4960 = -this.field4953;
        this.field4959 = this.field4952 = this.field4957 = this.field4949 = this.field4950 = this.field4954 = this.field4951 = 0.0F;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "()Lpm;", line = 169)
    public final class349 method2237() {
        class349 var1 = new class349();
        var1.field4948 = this.field4948;
        var1.field4951 = this.field4951;
        var1.field4949 = this.field4949;
        var1.field4958 = this.field4958;
        var1.field4953 = this.field4953;
        var1.field4950 = this.field4950;
        var1.field4955 = this.field4955;
        var1.field4960 = this.field4960;
        var1.field4952 = this.field4952;
        var1.field4959 = this.field4959;
        var1.field4957 = this.field4957;
        var1.field4954 = this.field4954;
        return var1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([I)V", line = 192)
    public final void method121(int[] arg0) {
        float var2 = (float) arg0[0] - this.field4952;
        float var3 = (float) arg0[1] - this.field4949;
        float var4 = (float) arg0[2] - this.field4951;
        arg0[1] = (int) (this.field4954 * var4 + this.field4960 * var2 + this.field4948 * var3);
        arg0[0] = (int) (this.field4950 * var4 + this.field4958 * var2 + this.field4953 * var3);
        arg0[2] = (int) (this.field4955 * var4 + this.field4959 * var2 + this.field4957 * var3);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lnc;)V", line = 209)
    public final void method132(class18 arg0) {
        class349 var2 = (class349) arg0;
        this.field4951 = var2.field4951;
        this.field4950 = var2.field4950;
        this.field4960 = var2.field4960;
        this.field4958 = var2.field4958;
        this.field4948 = var2.field4948;
        this.field4954 = var2.field4954;
        this.field4949 = var2.field4949;
        this.field4959 = var2.field4959;
        this.field4955 = var2.field4955;
        this.field4952 = var2.field4952;
        this.field4957 = var2.field4957;
        this.field4953 = var2.field4953;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 233)
    public final void method119(int arg0) {
        float var2 = class196.field2818[arg0 & 0x3FFF];
        float var3 = class196.field2819[arg0 & 0x3FFF];
        float var4 = this.field4958;
        float var5 = this.field4960;
        float var6 = this.field4959;
        float var7 = this.field4952;
        this.field4958 = this.field4950 * var3 + var2 * var4;
        this.field4950 = this.field4950 * var2 - var3 * var4;
        this.field4960 = this.field4954 * var3 + var2 * var5;
        this.field4959 = this.field4955 * var3 + var2 * var6;
        this.field4954 = this.field4954 * var2 - (var3 * var5);
        this.field4955 = this.field4955 * var2 - var3 * var6;
        this.field4952 = this.field4951 * var3 + var2 * var7;
        this.field4951 = this.field4951 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 258)
    public final void method123(int arg0) {
        this.field4948 = 1.0F;
        this.field4958 = this.field4955 = class196.field2818[arg0 & 0x3FFF];
        this.field4959 = class196.field2819[arg0 & 0x3FFF];
        this.field4960 = this.field4952 = this.field4953 = this.field4957 = this.field4949 = this.field4954 = this.field4951 = 0.0F;
        this.field4950 = -this.field4959;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)V", line = 269)
    public final void method125(int arg0, int arg1, int arg2) {
        this.field4949 += (float) arg1;
        this.field4952 += (float) arg0;
        this.field4951 += (float) arg2;
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V", line = 279)
    public final void method128(int arg0) {
        this.field4958 = 1.0F;
        this.field4948 = this.field4955 = class196.field2818[arg0 & 0x3FFF];
        this.field4954 = class196.field2819[arg0 & 0x3FFF];
        this.field4957 = -this.field4954;
        this.field4960 = this.field4959 = this.field4952 = this.field4953 = this.field4949 = this.field4950 = this.field4951 = 0.0F;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 289)
    public class349() {
        this.method129();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V", line = 298)
    public final void method116(int arg0, int arg1, int arg2) {
        this.field4953 = this.field4950 = this.field4960 = this.field4954 = this.field4959 = this.field4957 = 0.0F;
        this.field4951 = (float) arg2;
        this.field4952 = (float) arg0;
        this.field4958 = this.field4948 = this.field4955 = 1.0F;
        this.field4949 = (float) arg1;
    }
}
