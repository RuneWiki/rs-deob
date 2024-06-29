import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class25 extends class156 {

    @OriginalMember(owner = "client!n", name = "o", descriptor = "[F")
    private static float[] field454 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!n", name = "h", descriptor = "F")
    public float field447;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "F")
    public float field448;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "F")
    public float field449;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "F")
    public float field450;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "F")
    public float field451;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "F")
    public float field452;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "F")
    public float field453;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "F")
    public float field455;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "F")
    public float field456;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "F")
    public float field457;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "F")
    public float field458;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "F")
    public float field459;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 5)
    public final void method305(int arg0) {
        this.field459 = 1.0F;
        this.field458 = this.field447 = class320.field4315[arg0 & 0x3FFF];
        this.field452 = class320.field4316[arg0 & 0x3FFF];
        this.field450 = this.field451 = this.field448 = this.field455 = this.field457 = this.field456 = this.field453 = 0.0F;
        this.field449 = -this.field452;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([I)V", line = 17)
    public final void method306(int[] arg0) {
        float var2 = (float) arg0[0] - this.field451;
        float var3 = (float) arg0[1] - this.field455;
        float var4 = (float) arg0[2] - this.field453;
        arg0[2] = (int) (this.field459 * var4 + this.field450 * var2 + this.field448 * var3);
        arg0[0] = (int) (this.field457 * var4 + this.field458 * var2 + this.field452 * var3);
        arg0[1] = (int) (this.field456 * var4 + this.field449 * var2 + this.field447 * var3);
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)[F", line = 31)
    public final float[] method307(int arg0) {
        field454[5] = this.field447;
        field454[8] = this.field450;
        field454[arg0] = this.field457;
        field454[9] = this.field448;
        field454[14] = 0.0F;
        field454[13] = 0.0F;
        field454[12] = 0.0F;
        field454[6] = this.field456;
        field454[10] = this.field459;
        field454[4] = this.field449;
        field454[0] = this.field458;
        field454[1] = this.field452;
        return field454;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(III)V", line = 51)
    public final void method308(int arg0, int arg1, int arg2) {
        this.field452 = this.field457 = this.field449 = this.field456 = this.field450 = this.field448 = 0.0F;
        this.field455 = (float) arg1;
        this.field453 = (float) arg2;
        this.field451 = (float) arg0;
        this.field458 = this.field447 = this.field459 = 1.0F;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()Ln;", line = 63)
    public final class25 method309() {
        class25 var1 = new class25();
        var1.field448 = this.field448;
        var1.field457 = this.field457;
        var1.field452 = this.field452;
        var1.field449 = this.field449;
        var1.field453 = this.field453;
        var1.field459 = this.field459;
        var1.field447 = this.field447;
        var1.field450 = this.field450;
        var1.field455 = this.field455;
        var1.field451 = this.field451;
        var1.field456 = this.field456;
        var1.field458 = this.field458;
        return var1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)V", line = 86)
    public final void method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class320.field4315[arg3 & 0x3FFF];
        float var8 = class320.field4316[arg3 & 0x3FFF];
        float var9 = class320.field4315[arg4 & 0x3FFF];
        float var10 = class320.field4316[arg4 & 0x3FFF];
        float var11 = class320.field4315[arg5 & 0x3FFF];
        float var12 = class320.field4316[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field449 = var7 * var12;
        this.field448 = var9 * var13 + var10 * var12;
        this.field450 = -var10 * var11 + var9 * var14;
        this.field456 = -var8;
        this.field447 = var7 * var11;
        this.field459 = var7 * var9;
        this.field452 = -var9 * var12 + var10 * var13;
        this.field458 = var9 * var11 + var10 * var14;
        this.field457 = var7 * var10;
        this.field453 = (float) (-arg0) * this.field457 - ((float) arg1 * this.field456) - (float) arg2 * this.field459;
        this.field451 = (float) (-arg0) * this.field458 - ((float) arg1 * this.field449) - ((float) arg2 * this.field450);
        this.field455 = (float) (-arg0) * this.field452 - ((float) arg1 * this.field447) - ((float) arg2 * this.field448);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 118)
    public final void method311() {
        this.field458 = this.field447 = this.field459 = 1.0F;
        this.field452 = this.field457 = this.field449 = this.field456 = this.field450 = this.field448 = this.field451 = this.field455 = this.field453 = 0.0F;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 128)
    public final void method312(int arg0) {
        this.field447 = 1.0F;
        this.field458 = this.field459 = class320.field4315[arg0 & 0x3FFF];
        this.field450 = class320.field4316[arg0 & 0x3FFF];
        this.field457 = -this.field450;
        this.field449 = this.field451 = this.field452 = this.field448 = this.field455 = this.field456 = this.field453 = 0.0F;
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V", line = 144)
    public final void method313(int arg0) {
        float var2 = class320.field4315[arg0 & 0x3FFF];
        float var3 = class320.field4316[arg0 & 0x3FFF];
        float var4 = this.field452;
        float var5 = this.field447;
        float var6 = this.field448;
        float var7 = this.field455;
        this.field452 = var2 * var4 - (this.field457 * var3);
        this.field447 = var2 * var5 - (this.field456 * var3);
        this.field457 = this.field457 * var2 + var3 * var4;
        this.field448 = var2 * var6 - this.field459 * var3;
        this.field456 = this.field456 * var2 + var3 * var5;
        this.field459 = this.field459 * var2 + var3 * var6;
        this.field455 = var2 * var7 - this.field453 * var3;
        this.field453 = this.field453 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)[F", line = 170)
    public final float[] method314(byte arg0) {
        field454[6] = this.field456;
        field454[0] = this.field458;
        field454[14] = this.field453;
        field454[5] = this.field447;
        field454[1] = this.field452;
        field454[10] = this.field459;
        field454[12] = this.field451;
        field454[8] = this.field450;
        field454[2] = this.field457;
        int var2 = -15 % ((-arg0 - 30) / 61);
        field454[4] = this.field449;
        field454[13] = this.field455;
        field454[9] = this.field448;
        return field454;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III[I)V", line = 193)
    public final void method315(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field450 + (float) arg0 * this.field458 + (float) arg1 * this.field449 + this.field451);
        arg3[2] = (int) ((float) arg2 * this.field459 + (float) arg0 * this.field457 + (float) arg1 * this.field456 + this.field453);
        arg3[1] = (int) ((float) arg2 * this.field448 + (float) arg0 * this.field452 + (float) arg1 * this.field447 + this.field455);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lmk;)V", line = 203)
    public final void method316(class156 arg0) {
        class25 var2 = (class25) arg0;
        this.field451 = var2.field451;
        this.field447 = var2.field447;
        this.field448 = var2.field448;
        this.field449 = var2.field449;
        this.field456 = var2.field456;
        this.field455 = var2.field455;
        this.field453 = var2.field453;
        this.field458 = var2.field458;
        this.field452 = var2.field452;
        this.field459 = var2.field459;
        this.field450 = var2.field450;
        this.field457 = var2.field457;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lmk;I)V", line = 227)
    public final void method317(class156 arg0, int arg1) {
        class25 var3 = (class25) arg0;
        this.field450 = var3.field457;
        this.field458 = var3.field458;
        this.field449 = var3.field452;
        this.field452 = var3.field449;
        this.field457 = var3.field450;
        this.field447 = var3.field447;
        this.field448 = var3.field456;
        this.field451 = -(this.field450 * var3.field453 + this.field458 * var3.field451 + this.field449 * var3.field455);
        this.field456 = var3.field448;
        if (arg1 == 16383) {
            this.field459 = var3.field459;
            this.field455 = -(this.field448 * var3.field453 + this.field452 * var3.field451 + this.field447 * var3.field455);
            this.field453 = -(this.field459 * var3.field453 + this.field457 * var3.field451 + this.field456 * var3.field455);
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V", line = 253)
    public final void method318(int arg0) {
        this.field458 = 1.0F;
        this.field447 = this.field459 = class320.field4315[arg0 & 0x3FFF];
        this.field456 = class320.field4316[arg0 & 0x3FFF];
        this.field448 = -this.field456;
        this.field449 = this.field450 = this.field451 = this.field452 = this.field455 = this.field457 = this.field453 = 0.0F;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V", line = 264)
    public final void method319(int arg0, int arg1, int arg2) {
        this.field455 += (float) arg1;
        this.field453 += (float) arg2;
        this.field451 += (float) arg0;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 275)
    public final void method320(int arg0) {
        float var2 = class320.field4315[arg0 & 0x3FFF];
        float var3 = class320.field4316[arg0 & 0x3FFF];
        float var4 = this.field458;
        float var5 = this.field449;
        float var6 = this.field450;
        this.field458 = this.field457 * var3 + var2 * var4;
        float var7 = this.field451;
        this.field449 = this.field456 * var3 + var2 * var5;
        this.field457 = this.field457 * var2 - (var3 * var4);
        this.field450 = this.field459 * var3 + var2 * var6;
        this.field456 = this.field456 * var2 - (var3 * var5);
        this.field459 = this.field459 * var2 - (var3 * var6);
        this.field451 = this.field453 * var3 + var2 * var7;
        this.field453 = this.field453 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 298)
    public class25() {
        this.method311();
    }
}
