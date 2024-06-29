import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class428 extends class187 {

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "[F")
    private static float[] field6225 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "F")
    public float field6217;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "F")
    public float field6218;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "F")
    public float field6219;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "F")
    public float field6220;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "F")
    public float field6221;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "F")
    public float field6222;

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "F")
    public float field6223;

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "F")
    public float field6224;

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "F")
    public float field6226;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "F")
    public float field6227;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "F")
    public float field6228;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "F")
    public float field6229;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)[F", line = 4)
    public final float[] method2636(int arg0) {
        field6225[2] = this.field6227;
        field6225[14] = 0.0F;
        field6225[0] = this.field6218;
        field6225[9] = this.field6222;
        field6225[5] = this.field6220;
        field6225[8] = this.field6223;
        field6225[4] = this.field6221;
        field6225[10] = this.field6228;
        field6225[1] = this.field6226;
        field6225[6] = this.field6229;
        field6225[13] = 0.0F;
        field6225[12] = 0.0F;
        return arg0 == -30862 ? field6225 : (float[]) null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "()V", line = 26)
    public final void method827() {
        this.field6218 = this.field6220 = this.field6228 = 1.0F;
        this.field6226 = this.field6227 = this.field6221 = this.field6229 = this.field6223 = this.field6222 = this.field6224 = this.field6217 = this.field6219 = 0.0F;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLm;)V", line = 36)
    public final void method2637(byte arg0, class187 arg1) {
        class428 var3 = (class428) arg1;
        this.field6221 = var3.field6226;
        this.field6218 = var3.field6218;
        this.field6223 = var3.field6227;
        this.field6220 = var3.field6220;
        this.field6226 = var3.field6221;
        this.field6227 = var3.field6223;
        this.field6222 = var3.field6229;
        this.field6224 = -(this.field6223 * var3.field6219 + this.field6221 * var3.field6217 + this.field6218 * var3.field6224);
        if (arg0 != 76) {
            this.field6223 = 0.4552831F;
        }
        this.field6228 = var3.field6228;
        this.field6229 = var3.field6222;
        this.field6217 = -(this.field6222 * var3.field6219 + this.field6226 * var3.field6224 + this.field6220 * var3.field6217);
        this.field6219 = -(this.field6228 * var3.field6219 + this.field6229 * var3.field6217 + this.field6227 * var3.field6224);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIII)V", line = 60)
    public final void method822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class97.field1205[arg3 & 0x3FFF];
        float var8 = class97.field1206[arg3 & 0x3FFF];
        float var9 = class97.field1205[arg4 & 0x3FFF];
        float var10 = class97.field1206[arg4 & 0x3FFF];
        float var11 = class97.field1205[arg5 & 0x3FFF];
        float var12 = class97.field1206[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field6226 = -var9 * var12 + var10 * var13;
        this.field6222 = var9 * var13 + var10 * var12;
        this.field6218 = var9 * var11 + var10 * var14;
        this.field6227 = var7 * var10;
        this.field6228 = var7 * var9;
        this.field6229 = -var8;
        this.field6221 = var7 * var12;
        this.field6223 = -var10 * var11 + var9 * var14;
        this.field6220 = var7 * var11;
        this.field6224 = (float) (-arg0) * this.field6218 - (float) arg1 * this.field6221 - ((float) arg2 * this.field6223);
        this.field6219 = (float) (-arg0) * this.field6227 - (float) arg1 * this.field6229 - (float) arg2 * this.field6228;
        this.field6217 = (float) (-arg0) * this.field6226 - (float) arg1 * this.field6220 - (float) arg2 * this.field6222;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "()Lvr;", line = 93)
    public final class428 method2638() {
        class428 var1 = new class428();
        var1.field6220 = this.field6220;
        var1.field6219 = this.field6219;
        var1.field6228 = this.field6228;
        var1.field6223 = this.field6223;
        var1.field6217 = this.field6217;
        var1.field6229 = this.field6229;
        var1.field6221 = this.field6221;
        var1.field6226 = this.field6226;
        var1.field6224 = this.field6224;
        var1.field6218 = this.field6218;
        var1.field6222 = this.field6222;
        var1.field6227 = this.field6227;
        return var1;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(III)V", line = 113)
    public final void method823(int arg0, int arg1, int arg2) {
        this.field6217 += (float) arg1;
        this.field6224 += (float) arg0;
        this.field6219 += (float) arg2;
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)V", line = 126)
    public final void method828(int arg0) {
        this.field6220 = 1.0F;
        this.field6218 = this.field6228 = class97.field1205[arg0 & 0x3FFF];
        this.field6223 = class97.field1206[arg0 & 0x3FFF];
        this.field6227 = -this.field6223;
        this.field6221 = this.field6224 = this.field6226 = this.field6222 = this.field6217 = this.field6229 = this.field6219 = 0.0F;
    }

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "(I)V", line = 139)
    public final void method826(int arg0) {
        this.field6218 = 1.0F;
        this.field6220 = this.field6228 = class97.field1205[arg0 & 0x3FFF];
        this.field6229 = class97.field1206[arg0 & 0x3FFF];
        this.field6222 = -this.field6229;
        this.field6221 = this.field6223 = this.field6224 = this.field6226 = this.field6217 = this.field6227 = this.field6219 = 0.0F;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lm;)V", line = 153)
    public final void method832(class187 arg0) {
        class428 var2 = (class428) arg0;
        this.field6217 = var2.field6217;
        this.field6220 = var2.field6220;
        this.field6227 = var2.field6227;
        this.field6224 = var2.field6224;
        this.field6219 = var2.field6219;
        this.field6228 = var2.field6228;
        this.field6221 = var2.field6221;
        this.field6218 = var2.field6218;
        this.field6223 = var2.field6223;
        this.field6226 = var2.field6226;
        this.field6222 = var2.field6222;
        this.field6229 = var2.field6229;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V", line = 174)
    public final void method833(int arg0) {
        this.field6228 = 1.0F;
        this.field6218 = this.field6220 = class97.field1205[arg0 & 0x3FFF];
        this.field6226 = class97.field1206[arg0 & 0x3FFF];
        this.field6223 = this.field6224 = this.field6222 = this.field6217 = this.field6227 = this.field6229 = this.field6219 = 0.0F;
        this.field6221 = -this.field6226;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "([I)V", line = 187)
    public final void method825(int[] arg0) {
        float var2 = (float) arg0[0] - this.field6224;
        float var3 = (float) arg0[1] - this.field6217;
        float var4 = (float) arg0[2] - this.field6219;
        arg0[1] = (int) (this.field6229 * var4 + this.field6221 * var2 + this.field6220 * var3);
        arg0[0] = (int) (this.field6227 * var4 + this.field6226 * var3 + this.field6218 * var2);
        arg0[2] = (int) (this.field6228 * var4 + this.field6223 * var2 + this.field6222 * var3);
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V", line = 203)
    public final void method830(int arg0) {
        float var2 = class97.field1205[arg0 & 0x3FFF];
        float var3 = class97.field1206[arg0 & 0x3FFF];
        float var4 = this.field6226;
        float var5 = this.field6220;
        float var6 = this.field6222;
        float var7 = this.field6217;
        this.field6226 = var2 * var4 - this.field6227 * var3;
        this.field6227 = this.field6227 * var2 + var3 * var4;
        this.field6220 = var2 * var5 - (this.field6229 * var3);
        this.field6222 = var2 * var6 - (this.field6228 * var3);
        this.field6229 = this.field6229 * var2 + var3 * var5;
        this.field6217 = var2 * var7 - (this.field6219 * var3);
        this.field6228 = this.field6228 * var2 + var3 * var6;
        this.field6219 = this.field6219 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V", line = 231)
    public final void method821(int arg0) {
        float var2 = class97.field1205[arg0 & 0x3FFF];
        float var3 = class97.field1206[arg0 & 0x3FFF];
        float var4 = this.field6218;
        float var5 = this.field6221;
        float var6 = this.field6223;
        this.field6218 = this.field6227 * var3 + var2 * var4;
        float var7 = this.field6224;
        this.field6221 = this.field6229 * var3 + var2 * var5;
        this.field6227 = this.field6227 * var2 - var3 * var4;
        this.field6229 = this.field6229 * var2 - var3 * var5;
        this.field6223 = this.field6228 * var3 + var2 * var6;
        this.field6228 = this.field6228 * var2 - var3 * var6;
        this.field6224 = this.field6219 * var3 + var2 * var7;
        this.field6219 = this.field6219 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)[F", line = 257)
    public final float[] method2639(boolean arg0) {
        field6225[10] = this.field6228;
        field6225[6] = this.field6229;
        field6225[5] = this.field6220;
        field6225[13] = this.field6217;
        field6225[9] = this.field6222;
        field6225[2] = this.field6227;
        field6225[14] = this.field6219;
        if (arg0) {
            return (float[]) null;
        }
        field6225[0] = this.field6218;
        field6225[4] = this.field6221;
        field6225[12] = this.field6224;
        field6225[1] = this.field6226;
        field6225[8] = this.field6223;
        return field6225;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III[I)V", line = 279)
    public final void method829(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field6228 + (float) arg0 * this.field6227 + (float) arg1 * this.field6229 + this.field6219);
        arg3[1] = (int) ((float) arg2 * this.field6222 + (float) arg0 * this.field6226 + (float) arg1 * this.field6220 + this.field6217);
        arg3[0] = (int) ((float) arg2 * this.field6223 + (float) arg0 * this.field6218 + (float) arg1 * this.field6221 + this.field6224);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V", line = 291)
    public final void method831(int arg0, int arg1, int arg2) {
        this.field6224 = (float) arg0;
        this.field6226 = this.field6227 = this.field6221 = this.field6229 = this.field6223 = this.field6222 = 0.0F;
        this.field6218 = this.field6220 = this.field6228 = 1.0F;
        this.field6217 = (float) arg1;
        this.field6219 = (float) arg2;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V", line = 301)
    public class428() {
        this.method827();
    }
}
