import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class218 extends class250 {

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "[F")
    private static float[] field3080 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "F")
    public float field3081;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "F")
    public float field3082;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "F")
    public float field3083;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "F")
    public float field3084;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "F")
    public float field3085;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "F")
    public float field3086;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "F")
    public float field3087;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "F")
    public float field3088;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "F")
    public float field3089;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "F")
    public float field3090;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "F")
    public float field3091;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "F")
    public float field3092;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public final void method1373(int arg0) {
        this.field3083 = 1.0F;
        this.field3091 = this.field3081 = class300.field4124[arg0 & 0x3FFF];
        this.field3090 = class300.field4123[arg0 & 0x3FFF];
        this.field3085 = -this.field3090;
        this.field3084 = this.field3086 = this.field3087 = this.field3082 = this.field3092 = this.field3088 = this.field3089 = 0.0F;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public final void method1374(int arg0) {
        float var2 = class300.field4124[arg0 & 0x3FFF];
        float var3 = class300.field4123[arg0 & 0x3FFF];
        float var4 = this.field3087;
        float var5 = this.field3083;
        float var6 = this.field3082;
        float var7 = this.field3092;
        this.field3087 = var2 * var4 - this.field3085 * var3;
        this.field3083 = var2 * var5 - this.field3088 * var3;
        this.field3085 = this.field3085 * var2 + var3 * var4;
        this.field3082 = var2 * var6 - (this.field3081 * var3);
        this.field3088 = this.field3088 * var2 + var3 * var5;
        this.field3081 = this.field3081 * var2 + var3 * var6;
        this.field3092 = var2 * var7 - (this.field3089 * var3);
        this.field3089 = this.field3089 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([I)V")
    public final void method1375(int[] arg0) {
        float var2 = (float) arg0[0] - this.field3086;
        float var3 = (float) arg0[1] - this.field3092;
        float var4 = (float) arg0[2] - this.field3089;
        arg0[1] = (int) (this.field3088 * var4 + this.field3084 * var2 + this.field3083 * var3);
        arg0[0] = (int) (this.field3085 * var4 + this.field3091 * var2 + this.field3087 * var3);
        arg0[2] = (int) (this.field3081 * var4 + this.field3090 * var2 + this.field3082 * var3);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ldr;)V")
    public final void method1376(class250 arg0) {
        class218 var2 = (class218) arg0;
        this.field3081 = var2.field3081;
        this.field3090 = var2.field3090;
        this.field3089 = var2.field3089;
        this.field3092 = var2.field3092;
        this.field3083 = var2.field3083;
        this.field3091 = var2.field3091;
        this.field3082 = var2.field3082;
        this.field3088 = var2.field3088;
        this.field3085 = var2.field3085;
        this.field3084 = var2.field3084;
        this.field3087 = var2.field3087;
        this.field3086 = var2.field3086;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ldr;B)V")
    public final void method1377(class250 arg0, byte arg1) {
        class218 var3 = (class218) arg0;
        if (arg1 <= 25) {
            this.method1385(-125, -76, 110, (int[]) null);
        }
        this.field3091 = var3.field3091;
        this.field3090 = var3.field3085;
        this.field3084 = var3.field3087;
        this.field3085 = var3.field3090;
        this.field3082 = var3.field3088;
        this.field3087 = var3.field3084;
        this.field3083 = var3.field3083;
        this.field3081 = var3.field3081;
        this.field3088 = var3.field3082;
        this.field3086 = -(this.field3090 * var3.field3089 + this.field3091 * var3.field3086 + this.field3084 * var3.field3092);
        this.field3092 = -(this.field3082 * var3.field3089 + this.field3087 * var3.field3086 + this.field3083 * var3.field3092);
        this.field3089 = -(this.field3081 * var3.field3089 + this.field3088 * var3.field3092 + this.field3085 * var3.field3086);
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
    public final void method1378(int arg0) {
        float var2 = class300.field4124[arg0 & 0x3FFF];
        float var3 = class300.field4123[arg0 & 0x3FFF];
        float var4 = this.field3091;
        float var5 = this.field3084;
        float var6 = this.field3090;
        this.field3091 = this.field3085 * var3 + var2 * var4;
        float var7 = this.field3086;
        this.field3084 = this.field3088 * var3 + var2 * var5;
        this.field3085 = this.field3085 * var2 - (var3 * var4);
        this.field3090 = this.field3081 * var3 + var2 * var6;
        this.field3088 = this.field3088 * var2 - var3 * var5;
        this.field3086 = this.field3089 * var3 + var2 * var7;
        this.field3081 = this.field3081 * var2 - var3 * var6;
        this.field3089 = this.field3089 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
    public final void method1379(int arg0) {
        this.field3091 = 1.0F;
        this.field3083 = this.field3081 = class300.field4124[arg0 & 0x3FFF];
        this.field3088 = class300.field4123[arg0 & 0x3FFF];
        this.field3082 = -this.field3088;
        this.field3084 = this.field3090 = this.field3086 = this.field3087 = this.field3092 = this.field3085 = this.field3089 = 0.0F;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
    public final void method1380(int arg0, int arg1, int arg2) {
        this.field3089 += (float) arg2;
        this.field3092 += (float) arg1;
        this.field3086 += (float) arg0;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)[F")
    public final float[] method1381(byte arg0) {
        field3080[14] = 0.0F;
        field3080[1] = this.field3087;
        field3080[12] = 0.0F;
        field3080[6] = this.field3088;
        field3080[5] = this.field3083;
        field3080[0] = this.field3091;
        field3080[10] = this.field3081;
        field3080[8] = this.field3090;
        field3080[2] = this.field3085;
        if (arg0 != 90) {
            this.field3087 = 2.272775F;
        }
        field3080[4] = this.field3084;
        field3080[9] = this.field3082;
        field3080[13] = 0.0F;
        return field3080;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
    public final void method1382(int arg0, int arg1, int arg2) {
        this.field3092 = (float) arg1;
        this.field3086 = (float) arg0;
        this.field3091 = this.field3083 = this.field3081 = 1.0F;
        this.field3089 = (float) arg2;
        this.field3087 = this.field3085 = this.field3084 = this.field3088 = this.field3090 = this.field3082 = 0.0F;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)V")
    public final void method1383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class300.field4124[arg3 & 0x3FFF];
        float var8 = class300.field4123[arg3 & 0x3FFF];
        float var9 = class300.field4124[arg4 & 0x3FFF];
        float var10 = class300.field4123[arg4 & 0x3FFF];
        float var11 = class300.field4124[arg5 & 0x3FFF];
        float var12 = class300.field4123[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3081 = var7 * var9;
        this.field3091 = var9 * var11 + var10 * var14;
        this.field3084 = var7 * var12;
        this.field3088 = -var8;
        this.field3083 = var7 * var11;
        this.field3082 = var9 * var13 + var10 * var12;
        this.field3087 = -var9 * var12 + var10 * var13;
        this.field3090 = -var10 * var11 + var9 * var14;
        this.field3085 = var7 * var10;
        this.field3086 = (float) (-arg0) * this.field3091 - (float) arg1 * this.field3084 - ((float) arg2 * this.field3090);
        this.field3089 = (float) (-arg0) * this.field3085 - ((float) arg1 * this.field3088) - (float) arg2 * this.field3081;
        this.field3092 = (float) (-arg0) * this.field3087 - (float) arg1 * this.field3083 - ((float) arg2 * this.field3082);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    public final void method1384(int arg0) {
        this.field3081 = 1.0F;
        this.field3091 = this.field3083 = class300.field4124[arg0 & 0x3FFF];
        this.field3087 = class300.field4123[arg0 & 0x3FFF];
        this.field3084 = -this.field3087;
        this.field3090 = this.field3086 = this.field3082 = this.field3092 = this.field3085 = this.field3088 = this.field3089 = 0.0F;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III[I)V")
    public final void method1385(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field3082 + (float) arg0 * this.field3087 + (float) arg1 * this.field3083 + this.field3092);
        arg3[0] = (int) ((float) arg2 * this.field3090 + (float) arg0 * this.field3091 + (float) arg1 * this.field3084 + this.field3086);
        arg3[2] = (int) ((float) arg2 * this.field3081 + (float) arg0 * this.field3085 + (float) arg1 * this.field3088 + this.field3089);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()Lrh;")
    public final class218 method1386() {
        class218 var1 = new class218();
        var1.field3085 = this.field3085;
        var1.field3081 = this.field3081;
        var1.field3090 = this.field3090;
        var1.field3084 = this.field3084;
        var1.field3089 = this.field3089;
        var1.field3092 = this.field3092;
        var1.field3082 = this.field3082;
        var1.field3083 = this.field3083;
        var1.field3088 = this.field3088;
        var1.field3087 = this.field3087;
        var1.field3091 = this.field3091;
        var1.field3086 = this.field3086;
        return var1;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)[F")
    public final float[] method1387(byte arg0) {
        field3080[14] = this.field3089;
        field3080[5] = this.field3083;
        field3080[4] = this.field3084;
        field3080[10] = this.field3081;
        field3080[2] = this.field3085;
        if (arg0 != -36) {
            this.method1384(-115);
        }
        field3080[1] = this.field3087;
        field3080[8] = this.field3090;
        field3080[13] = this.field3092;
        field3080[9] = this.field3082;
        field3080[12] = this.field3086;
        field3080[0] = this.field3091;
        field3080[6] = this.field3088;
        return field3080;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class218() {
        this.method1388();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V")
    public final void method1388() {
        this.field3087 = this.field3085 = this.field3084 = this.field3088 = this.field3090 = this.field3082 = this.field3086 = this.field3092 = this.field3089 = 0.0F;
        this.field3091 = this.field3083 = this.field3081 = 1.0F;
    }
}
