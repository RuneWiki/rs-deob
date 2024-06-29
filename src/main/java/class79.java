import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class79 extends class315 {

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "[F")
    private static float[] field1112 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "F")
    public float field1109;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "F")
    public float field1110;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "F")
    public float field1111;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "F")
    public float field1113;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "F")
    public float field1114;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "F")
    public float field1115;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "F")
    public float field1116;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "F")
    public float field1117;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "F")
    public float field1118;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "F")
    public float field1119;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "F")
    public float field1120;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "F")
    public float field1121;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "(I)[F", line = 8)
    public final float[] method657(int arg0) {
        if (arg0 <= 66) {
            this.field1114 = 0.93333286F;
        }
        field1112[14] = 0.0F;
        field1112[2] = this.field1110;
        field1112[1] = this.field1117;
        field1112[9] = this.field1116;
        field1112[8] = this.field1115;
        field1112[12] = 0.0F;
        field1112[5] = this.field1118;
        field1112[0] = this.field1114;
        field1112[10] = this.field1120;
        field1112[13] = 0.0F;
        field1112[6] = this.field1111;
        field1112[4] = this.field1109;
        return field1112;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V", line = 30)
    public final void method485(int arg0) {
        this.field1120 = 1.0F;
        this.field1114 = this.field1118 = class194.field2946[arg0 & 0x3FFF];
        this.field1117 = class194.field2947[arg0 & 0x3FFF];
        this.field1109 = -this.field1117;
        this.field1115 = this.field1119 = this.field1116 = this.field1121 = this.field1110 = this.field1111 = this.field1113 = 0.0F;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "()Lvp;", line = 43)
    public final class79 method658() {
        class79 var1 = new class79();
        var1.field1111 = this.field1111;
        var1.field1115 = this.field1115;
        var1.field1116 = this.field1116;
        var1.field1113 = this.field1113;
        var1.field1114 = this.field1114;
        var1.field1119 = this.field1119;
        var1.field1117 = this.field1117;
        var1.field1118 = this.field1118;
        var1.field1121 = this.field1121;
        var1.field1120 = this.field1120;
        var1.field1109 = this.field1109;
        var1.field1110 = this.field1110;
        return var1;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(III[I)V", line = 67)
    public final void method483(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field1116 + (float) arg0 * this.field1117 + (float) arg1 * this.field1118 + this.field1121);
        arg3[0] = (int) ((float) arg2 * this.field1115 + (float) arg0 * this.field1114 + (float) arg1 * this.field1109 + this.field1119);
        arg3[2] = (int) ((float) arg2 * this.field1120 + (float) arg0 * this.field1110 + (float) arg1 * this.field1111 + this.field1113);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLmu;)V", line = 78)
    public final void method659(byte arg0, class315 arg1) {
        int var3 = -71 % ((arg0 - 62) / 54);
        class79 var4 = (class79) arg1;
        this.field1109 = var4.field1117;
        this.field1114 = var4.field1114;
        this.field1115 = var4.field1110;
        this.field1117 = var4.field1109;
        this.field1118 = var4.field1118;
        this.field1110 = var4.field1115;
        this.field1116 = var4.field1111;
        this.field1111 = var4.field1116;
        this.field1119 = -(this.field1115 * var4.field1113 + this.field1114 * var4.field1119 + this.field1109 * var4.field1121);
        this.field1120 = var4.field1120;
        this.field1121 = -(this.field1116 * var4.field1113 + this.field1118 * var4.field1121 + this.field1117 * var4.field1119);
        this.field1113 = -(this.field1120 * var4.field1113 + this.field1111 * var4.field1121 + this.field1110 * var4.field1119);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(III)V", line = 99)
    public final void method482(int arg0, int arg1, int arg2) {
        this.field1119 = (float) arg0;
        this.field1121 = (float) arg1;
        this.field1117 = this.field1110 = this.field1109 = this.field1111 = this.field1115 = this.field1116 = 0.0F;
        this.field1114 = this.field1118 = this.field1120 = 1.0F;
        this.field1113 = (float) arg2;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([I)V", line = 115)
    public final void method479(int[] arg0) {
        float var2 = (float) arg0[0] - this.field1119;
        float var3 = (float) arg0[1] - this.field1121;
        float var4 = (float) arg0[2] - this.field1113;
        arg0[0] = (int) (this.field1110 * var4 + this.field1117 * var3 + this.field1114 * var2);
        arg0[2] = (int) (this.field1120 * var4 + this.field1116 * var3 + this.field1115 * var2);
        arg0[1] = (int) (this.field1111 * var4 + this.field1118 * var3 + this.field1109 * var2);
    }

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "(I)V", line = 129)
    public final void method486(int arg0) {
        this.field1118 = 1.0F;
        this.field1114 = this.field1120 = class194.field2946[arg0 & 0x3FFF];
        this.field1115 = class194.field2947[arg0 & 0x3FFF];
        this.field1110 = -this.field1115;
        this.field1109 = this.field1119 = this.field1117 = this.field1116 = this.field1121 = this.field1111 = this.field1113 = 0.0F;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "()V", line = 143)
    public final void method488() {
        this.field1117 = this.field1110 = this.field1109 = this.field1111 = this.field1115 = this.field1116 = this.field1119 = this.field1121 = this.field1113 = 0.0F;
        this.field1114 = this.field1118 = this.field1120 = 1.0F;
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V", line = 152)
    public final void method477(int arg0) {
        float var2 = class194.field2946[arg0 & 0x3FFF];
        float var3 = class194.field2947[arg0 & 0x3FFF];
        float var4 = this.field1117;
        float var5 = this.field1118;
        float var6 = this.field1116;
        this.field1117 = var2 * var4 - this.field1110 * var3;
        float var7 = this.field1121;
        this.field1110 = this.field1110 * var2 + var3 * var4;
        this.field1118 = var2 * var5 - this.field1111 * var3;
        this.field1111 = this.field1111 * var2 + var3 * var5;
        this.field1116 = var2 * var6 - (this.field1120 * var3);
        this.field1120 = this.field1120 * var2 + var3 * var6;
        this.field1121 = var2 * var7 - (this.field1113 * var3);
        this.field1113 = this.field1113 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIII)V", line = 179)
    public final void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class194.field2946[arg3 & 0x3FFF];
        float var8 = class194.field2947[arg3 & 0x3FFF];
        float var9 = class194.field2946[arg4 & 0x3FFF];
        float var10 = class194.field2947[arg4 & 0x3FFF];
        float var11 = class194.field2946[arg5 & 0x3FFF];
        float var12 = class194.field2947[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1120 = var7 * var9;
        this.field1114 = var9 * var11 + var10 * var14;
        this.field1109 = var7 * var12;
        this.field1111 = -var8;
        this.field1117 = -var9 * var12 + var10 * var13;
        this.field1110 = var7 * var10;
        this.field1118 = var7 * var11;
        this.field1115 = -var10 * var11 + var9 * var14;
        this.field1116 = var9 * var13 + var10 * var12;
        this.field1121 = (float) (-arg0) * this.field1117 - (float) arg1 * this.field1118 - (float) arg2 * this.field1116;
        this.field1113 = (float) (-arg0) * this.field1110 - ((float) arg1 * this.field1111) - ((float) arg2 * this.field1120);
        this.field1119 = (float) (-arg0) * this.field1114 - ((float) arg1 * this.field1109) - (float) arg2 * this.field1115;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lmu;)V", line = 212)
    public final void method489(class315 arg0) {
        class79 var2 = (class79) arg0;
        this.field1121 = var2.field1121;
        this.field1117 = var2.field1117;
        this.field1115 = var2.field1115;
        this.field1109 = var2.field1109;
        this.field1113 = var2.field1113;
        this.field1110 = var2.field1110;
        this.field1118 = var2.field1118;
        this.field1119 = var2.field1119;
        this.field1116 = var2.field1116;
        this.field1111 = var2.field1111;
        this.field1114 = var2.field1114;
        this.field1120 = var2.field1120;
    }

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "(I)[F", line = 233)
    public final float[] method660(int arg0) {
        field1112[13] = this.field1121;
        field1112[10] = this.field1120;
        field1112[9] = this.field1116;
        field1112[0] = this.field1114;
        field1112[6] = this.field1111;
        field1112[5] = this.field1118;
        if (arg0 >= -13) {
            this.method659((byte) 31, (class315) null);
        }
        field1112[12] = this.field1119;
        field1112[1] = this.field1117;
        field1112[8] = this.field1115;
        field1112[14] = this.field1113;
        field1112[4] = this.field1109;
        field1112[2] = this.field1110;
        return field1112;
    }

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "(I)V", line = 256)
    public final void method487(int arg0) {
        float var2 = class194.field2946[arg0 & 0x3FFF];
        float var3 = class194.field2947[arg0 & 0x3FFF];
        float var4 = this.field1114;
        float var5 = this.field1109;
        float var6 = this.field1115;
        this.field1114 = this.field1110 * var3 + var2 * var4;
        float var7 = this.field1119;
        this.field1109 = this.field1111 * var3 + var2 * var5;
        this.field1110 = this.field1110 * var2 - var3 * var4;
        this.field1111 = this.field1111 * var2 - (var3 * var5);
        this.field1115 = this.field1120 * var3 + var2 * var6;
        this.field1119 = this.field1113 * var3 + var2 * var7;
        this.field1120 = this.field1120 * var2 - (var3 * var6);
        this.field1113 = this.field1113 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)V", line = 282)
    public final void method478(int arg0, int arg1, int arg2) {
        this.field1119 += (float) arg0;
        this.field1113 += (float) arg2;
        this.field1121 += (float) arg1;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)V", line = 291)
    public final void method481(int arg0) {
        this.field1114 = 1.0F;
        this.field1118 = this.field1120 = class194.field2946[arg0 & 0x3FFF];
        this.field1111 = class194.field2947[arg0 & 0x3FFF];
        this.field1109 = this.field1115 = this.field1119 = this.field1117 = this.field1121 = this.field1110 = this.field1113 = 0.0F;
        this.field1116 = -this.field1111;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V", line = 301)
    public class79() {
        this.method488();
    }
}
