import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class16 extends class257 {

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "[F")
    private static float[] field161 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "F")
    public float field150;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "F")
    public float field151;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "F")
    public float field152;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "F")
    public float field153;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "F")
    public float field154;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "F")
    public float field155;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "F")
    public float field156;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "F")
    public float field157;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "F")
    public float field158;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "F")
    public float field159;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "F")
    public float field160;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "F")
    public float field162;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)V", line = 4)
    public final void method96(int arg0, int arg1, int arg2) {
        this.field154 = (float) arg0;
        this.field160 = this.field150 = this.field152 = 1.0F;
        this.field156 = (float) arg1;
        this.field162 = (float) arg2;
        this.field158 = this.field157 = this.field151 = this.field155 = this.field153 = this.field159 = 0.0F;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lde;I)V", line = 20)
    public final void method97(class257 arg0, int arg1) {
        class16 var3 = (class16) arg0;
        this.field151 = var3.field158;
        this.field160 = var3.field160;
        this.field153 = var3.field157;
        this.field158 = var3.field151;
        this.field150 = var3.field150;
        this.field157 = var3.field153;
        if (arg1 != 1) {
            this.method108(45, -26, 85, (int[]) null);
        }
        this.field159 = var3.field155;
        this.field155 = var3.field159;
        this.field154 = -(this.field153 * var3.field162 + this.field160 * var3.field154 + this.field151 * var3.field156);
        this.field152 = var3.field152;
        this.field156 = -(this.field159 * var3.field162 + this.field158 * var3.field154 + this.field150 * var3.field156);
        this.field162 = -(this.field152 * var3.field162 + this.field157 * var3.field154 + this.field155 * var3.field156);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)[F", line = 42)
    public final float[] method98(boolean arg0) {
        field161[4] = this.field151;
        field161[13] = this.field156;
        field161[8] = this.field153;
        if (!arg0) {
            this.field158 = 0.24531278F;
        }
        field161[0] = this.field160;
        field161[12] = this.field154;
        field161[14] = this.field162;
        field161[1] = this.field158;
        field161[2] = this.field157;
        field161[9] = this.field159;
        field161[5] = this.field150;
        field161[6] = this.field155;
        field161[10] = this.field152;
        return field161;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)[F", line = 67)
    public final float[] method99(boolean arg0) {
        field161[1] = this.field158;
        field161[14] = 0.0F;
        field161[0] = this.field160;
        field161[10] = this.field152;
        field161[2] = this.field157;
        field161[6] = this.field155;
        field161[4] = this.field151;
        field161[13] = 0.0F;
        field161[8] = this.field153;
        if (!arg0) {
            this.field162 = 0.4316509F;
        }
        field161[9] = this.field159;
        field161[12] = 0.0F;
        field161[5] = this.field150;
        return field161;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V", line = 89)
    public final void method100() {
        this.field160 = this.field150 = this.field152 = 1.0F;
        this.field158 = this.field157 = this.field151 = this.field155 = this.field153 = this.field159 = this.field154 = this.field156 = this.field162 = 0.0F;
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V", line = 97)
    public final void method101(int arg0) {
        this.field152 = 1.0F;
        this.field160 = this.field150 = class326.field4543[arg0 & 0x3FFF];
        this.field158 = class326.field4544[arg0 & 0x3FFF];
        this.field153 = this.field154 = this.field159 = this.field156 = this.field157 = this.field155 = this.field162 = 0.0F;
        this.field151 = -this.field158;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 110)
    public final void method102(int arg0) {
        float var2 = class326.field4543[arg0 & 0x3FFF];
        float var3 = class326.field4544[arg0 & 0x3FFF];
        float var4 = this.field160;
        float var5 = this.field151;
        float var6 = this.field153;
        this.field160 = this.field157 * var3 + var2 * var4;
        float var7 = this.field154;
        this.field151 = this.field155 * var3 + var2 * var5;
        this.field157 = this.field157 * var2 - (var3 * var4);
        this.field153 = this.field152 * var3 + var2 * var6;
        this.field155 = this.field155 * var2 - var3 * var5;
        this.field152 = this.field152 * var2 - (var3 * var6);
        this.field154 = this.field162 * var3 + var2 * var7;
        this.field162 = this.field162 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([I)V", line = 136)
    public final void method103(int[] arg0) {
        float var2 = (float) arg0[0] - this.field154;
        float var3 = (float) arg0[1] - this.field156;
        float var4 = (float) arg0[2] - this.field162;
        arg0[2] = (int) (this.field152 * var4 + this.field159 * var3 + this.field153 * var2);
        arg0[0] = (int) (this.field157 * var4 + this.field160 * var2 + this.field158 * var3);
        arg0[1] = (int) (this.field155 * var4 + this.field151 * var2 + this.field150 * var3);
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V", line = 154)
    public final void method104(int arg0) {
        float var2 = class326.field4543[arg0 & 0x3FFF];
        float var3 = class326.field4544[arg0 & 0x3FFF];
        float var4 = this.field158;
        float var5 = this.field150;
        float var6 = this.field159;
        this.field158 = var2 * var4 - (this.field157 * var3);
        float var7 = this.field156;
        this.field157 = this.field157 * var2 + var3 * var4;
        this.field150 = var2 * var5 - (this.field155 * var3);
        this.field155 = this.field155 * var2 + var3 * var5;
        this.field159 = var2 * var6 - this.field152 * var3;
        this.field152 = this.field152 * var2 + var3 * var6;
        this.field156 = var2 * var7 - this.field162 * var3;
        this.field162 = this.field162 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()Lmi;", line = 180)
    public final class16 method105() {
        class16 var1 = new class16();
        var1.field154 = this.field154;
        var1.field152 = this.field152;
        var1.field160 = this.field160;
        var1.field155 = this.field155;
        var1.field151 = this.field151;
        var1.field150 = this.field150;
        var1.field162 = this.field162;
        var1.field157 = this.field157;
        var1.field156 = this.field156;
        var1.field159 = this.field159;
        var1.field158 = this.field158;
        var1.field153 = this.field153;
        return var1;
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V", line = 204)
    public final void method106(int arg0) {
        this.field160 = 1.0F;
        this.field150 = this.field152 = class326.field4543[arg0 & 0x3FFF];
        this.field155 = class326.field4544[arg0 & 0x3FFF];
        this.field159 = -this.field155;
        this.field151 = this.field153 = this.field154 = this.field158 = this.field156 = this.field157 = this.field162 = 0.0F;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V", line = 215)
    public final void method107(int arg0, int arg1, int arg2) {
        this.field156 += (float) arg1;
        this.field154 += (float) arg0;
        this.field162 += (float) arg2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III[I)V", line = 224)
    public final void method108(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field152 + (float) arg0 * this.field157 + (float) arg1 * this.field155 + this.field162);
        arg3[0] = (int) ((float) arg2 * this.field153 + (float) arg0 * this.field160 + (float) arg1 * this.field151 + this.field154);
        arg3[1] = (int) ((float) arg2 * this.field159 + (float) arg0 * this.field158 + (float) arg1 * this.field150 + this.field156);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lde;)V", line = 239)
    public final void method109(class257 arg0) {
        class16 var2 = (class16) arg0;
        this.field154 = var2.field154;
        this.field152 = var2.field152;
        this.field151 = var2.field151;
        this.field160 = var2.field160;
        this.field155 = var2.field155;
        this.field150 = var2.field150;
        this.field153 = var2.field153;
        this.field156 = var2.field156;
        this.field159 = var2.field159;
        this.field157 = var2.field157;
        this.field158 = var2.field158;
        this.field162 = var2.field162;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V", line = 258)
    public final void method110(int arg0) {
        this.field150 = 1.0F;
        this.field160 = this.field152 = class326.field4543[arg0 & 0x3FFF];
        this.field153 = class326.field4544[arg0 & 0x3FFF];
        this.field157 = -this.field153;
        this.field151 = this.field154 = this.field158 = this.field159 = this.field156 = this.field155 = this.field162 = 0.0F;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 268)
    public class16() {
        this.method100();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V", line = 278)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class326.field4543[arg3 & 0x3FFF];
        float var8 = class326.field4544[arg3 & 0x3FFF];
        float var9 = class326.field4543[arg4 & 0x3FFF];
        float var10 = class326.field4544[arg4 & 0x3FFF];
        float var11 = class326.field4543[arg5 & 0x3FFF];
        float var12 = class326.field4544[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field157 = var7 * var10;
        this.field150 = var7 * var11;
        this.field159 = var9 * var13 + var10 * var12;
        this.field153 = -var10 * var11 + var9 * var14;
        this.field155 = -var8;
        this.field151 = var7 * var12;
        this.field160 = var9 * var11 + var10 * var14;
        this.field158 = -var9 * var12 + var10 * var13;
        this.field152 = var7 * var9;
        this.field156 = (float) (-arg0) * this.field158 - (float) arg1 * this.field150 - ((float) arg2 * this.field159);
        this.field162 = (float) (-arg0) * this.field157 - ((float) arg1 * this.field155) - (float) arg2 * this.field152;
        this.field154 = (float) (-arg0) * this.field160 - (float) arg1 * this.field151 - ((float) arg2 * this.field153);
    }
}
