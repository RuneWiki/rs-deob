import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class93 extends class361 {

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "[F")
    private static float[] field1300 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "F")
    public float field1295;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "F")
    public float field1296;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "F")
    public float field1297;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "F")
    public float field1298;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "F")
    public float field1299;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "F")
    public float field1301;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "F")
    public float field1302;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "F")
    public float field1303;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "F")
    public float field1304;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "F")
    public float field1305;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "F")
    public float field1306;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "F")
    public float field1307;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "()V")
    public final void method601() {
        this.field1299 = this.field1306 = this.field1298 = 1.0F;
        this.field1307 = this.field1297 = this.field1303 = this.field1296 = this.field1304 = this.field1301 = this.field1302 = this.field1305 = this.field1295 = 0.0F;
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)[F")
    public final float[] method602(int arg0) {
        field1300[5] = this.field1306;
        field1300[8] = this.field1304;
        if (arg0 != -3139) {
            this.method609(-88);
        }
        field1300[13] = 0.0F;
        field1300[14] = 0.0F;
        field1300[10] = this.field1298;
        field1300[6] = this.field1296;
        field1300[2] = this.field1297;
        field1300[0] = this.field1299;
        field1300[9] = this.field1301;
        field1300[1] = this.field1307;
        field1300[4] = this.field1303;
        field1300[12] = 0.0F;
        return field1300;
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V")
    public final void method603(int arg0) {
        float var2 = class58.field770[arg0 & 0x3FFF];
        float var3 = class58.field769[arg0 & 0x3FFF];
        float var4 = this.field1307;
        float var5 = this.field1306;
        float var6 = this.field1301;
        float var7 = this.field1305;
        this.field1307 = var2 * var4 - this.field1297 * var3;
        this.field1306 = var2 * var5 - this.field1296 * var3;
        this.field1297 = this.field1297 * var2 + var3 * var4;
        this.field1296 = this.field1296 * var2 + var3 * var5;
        this.field1301 = var2 * var6 - (this.field1298 * var3);
        this.field1298 = this.field1298 * var2 + var3 * var6;
        this.field1305 = var2 * var7 - this.field1295 * var3;
        this.field1295 = this.field1295 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
    public final void method604(int arg0, int arg1, int arg2) {
        this.field1305 += (float) arg1;
        this.field1302 += (float) arg0;
        this.field1295 += (float) arg2;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([I)V")
    public final void method605(int[] arg0) {
        float var2 = (float) arg0[0] - this.field1302;
        float var3 = (float) arg0[1] - this.field1305;
        float var4 = (float) arg0[2] - this.field1295;
        arg0[1] = (int) (this.field1296 * var4 + this.field1306 * var3 + this.field1303 * var2);
        arg0[0] = (int) (this.field1297 * var4 + this.field1307 * var3 + this.field1299 * var2);
        arg0[2] = (int) (this.field1298 * var4 + this.field1304 * var2 + this.field1301 * var3);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III[I)V")
    public final void method606(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field1301 + (float) arg0 * this.field1307 + (float) arg1 * this.field1306 + this.field1305);
        arg3[2] = (int) ((float) arg2 * this.field1298 + (float) arg0 * this.field1297 + (float) arg1 * this.field1296 + this.field1295);
        arg3[0] = (int) ((float) arg2 * this.field1304 + (float) arg0 * this.field1299 + (float) arg1 * this.field1303 + this.field1302);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public final void method607(int arg0) {
        float var2 = class58.field770[arg0 & 0x3FFF];
        float var3 = class58.field769[arg0 & 0x3FFF];
        float var4 = this.field1299;
        float var5 = this.field1303;
        float var6 = this.field1304;
        this.field1299 = this.field1297 * var3 + var2 * var4;
        float var7 = this.field1302;
        this.field1297 = this.field1297 * var2 - var3 * var4;
        this.field1303 = this.field1296 * var3 + var2 * var5;
        this.field1296 = this.field1296 * var2 - var3 * var5;
        this.field1304 = this.field1298 * var3 + var2 * var6;
        this.field1302 = this.field1295 * var3 + var2 * var7;
        this.field1298 = this.field1298 * var2 - (var3 * var6);
        this.field1295 = this.field1295 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "()Lpm;")
    public final class93 method608() {
        class93 var1 = new class93();
        var1.field1302 = this.field1302;
        var1.field1304 = this.field1304;
        var1.field1297 = this.field1297;
        var1.field1299 = this.field1299;
        var1.field1296 = this.field1296;
        var1.field1295 = this.field1295;
        var1.field1301 = this.field1301;
        var1.field1305 = this.field1305;
        var1.field1306 = this.field1306;
        var1.field1298 = this.field1298;
        var1.field1303 = this.field1303;
        var1.field1307 = this.field1307;
        return var1;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
    public final void method609(int arg0) {
        this.field1298 = 1.0F;
        this.field1299 = this.field1306 = class58.field770[arg0 & 0x3FFF];
        this.field1307 = class58.field769[arg0 & 0x3FFF];
        this.field1304 = this.field1302 = this.field1301 = this.field1305 = this.field1297 = this.field1296 = this.field1295 = 0.0F;
        this.field1303 = -this.field1307;
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V")
    public final void method610(int arg0) {
        this.field1306 = 1.0F;
        this.field1299 = this.field1298 = class58.field770[arg0 & 0x3FFF];
        this.field1304 = class58.field769[arg0 & 0x3FFF];
        this.field1303 = this.field1302 = this.field1307 = this.field1301 = this.field1305 = this.field1296 = this.field1295 = 0.0F;
        this.field1297 = -this.field1304;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)V")
    public final void method611(int arg0, int arg1, int arg2) {
        this.field1305 = (float) arg1;
        this.field1299 = this.field1306 = this.field1298 = 1.0F;
        this.field1307 = this.field1297 = this.field1303 = this.field1296 = this.field1304 = this.field1301 = 0.0F;
        this.field1302 = (float) arg0;
        this.field1295 = (float) arg2;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIII)V")
    public final void method612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class58.field770[arg3 & 0x3FFF];
        float var8 = class58.field769[arg3 & 0x3FFF];
        float var9 = class58.field770[arg4 & 0x3FFF];
        float var10 = class58.field769[arg4 & 0x3FFF];
        float var11 = class58.field770[arg5 & 0x3FFF];
        float var12 = class58.field769[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1296 = -var8;
        this.field1297 = var7 * var10;
        this.field1299 = var9 * var11 + var10 * var14;
        this.field1303 = var7 * var12;
        this.field1306 = var7 * var11;
        this.field1304 = -var10 * var11 + var9 * var14;
        this.field1301 = var9 * var13 + var10 * var12;
        this.field1307 = -var9 * var12 + var10 * var13;
        this.field1298 = var7 * var9;
        this.field1295 = (float) (-arg0) * this.field1297 - (float) arg1 * this.field1296 - (float) arg2 * this.field1298;
        this.field1302 = (float) (-arg0) * this.field1299 - (float) arg1 * this.field1303 - ((float) arg2 * this.field1304);
        this.field1305 = (float) (-arg0) * this.field1307 - (float) arg1 * this.field1306 - ((float) arg2 * this.field1301);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljd;B)V")
    public final void method613(class361 arg0, byte arg1) {
        class93 var3 = (class93) arg0;
        this.field1299 = var3.field1299;
        this.field1303 = var3.field1307;
        this.field1304 = var3.field1297;
        this.field1306 = var3.field1306;
        this.field1307 = var3.field1303;
        this.field1301 = var3.field1296;
        this.field1297 = var3.field1304;
        if (arg1 > -111) {
            return;
        }
        this.field1298 = var3.field1298;
        this.field1296 = var3.field1301;
        this.field1302 = -(this.field1304 * var3.field1295 + this.field1303 * var3.field1305 + this.field1299 * var3.field1302);
        this.field1305 = -(this.field1301 * var3.field1295 + this.field1307 * var3.field1302 + this.field1306 * var3.field1305);
        this.field1295 = -(this.field1298 * var3.field1295 + this.field1297 * var3.field1302 + this.field1296 * var3.field1305);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljd;)V")
    public final void method614(class361 arg0) {
        class93 var2 = (class93) arg0;
        this.field1304 = var2.field1304;
        this.field1296 = var2.field1296;
        this.field1298 = var2.field1298;
        this.field1307 = var2.field1307;
        this.field1297 = var2.field1297;
        this.field1301 = var2.field1301;
        this.field1295 = var2.field1295;
        this.field1306 = var2.field1306;
        this.field1302 = var2.field1302;
        this.field1305 = var2.field1305;
        this.field1299 = var2.field1299;
        this.field1303 = var2.field1303;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
    public final void method615(int arg0) {
        this.field1299 = 1.0F;
        this.field1306 = this.field1298 = class58.field770[arg0 & 0x3FFF];
        this.field1296 = class58.field769[arg0 & 0x3FFF];
        this.field1303 = this.field1304 = this.field1302 = this.field1307 = this.field1305 = this.field1297 = this.field1295 = 0.0F;
        this.field1301 = -this.field1296;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)[F")
    public final float[] method616(byte arg0) {
        field1300[13] = this.field1305;
        field1300[2] = this.field1297;
        field1300[12] = this.field1302;
        field1300[6] = this.field1296;
        if (arg0 <= 1) {
            return (float[]) null;
        }
        field1300[10] = this.field1298;
        field1300[14] = this.field1295;
        field1300[0] = this.field1299;
        field1300[9] = this.field1301;
        field1300[4] = this.field1303;
        field1300[8] = this.field1304;
        field1300[5] = this.field1306;
        field1300[1] = this.field1307;
        return field1300;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
    public class93() {
        this.method601();
    }
}
