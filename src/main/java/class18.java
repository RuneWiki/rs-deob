import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class18 extends class71 {

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "[F")
    private static float[] field179 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "F")
    public float field176;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "F")
    public float field177;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "F")
    public float field178;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "F")
    public float field180;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "F")
    public float field181;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "F")
    public float field182;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "F")
    public float field183;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "F")
    public float field184;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "F")
    public float field185;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "F")
    public float field186;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "F")
    public float field187;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "F")
    public float field188;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
    public final void method116() {
        this.field185 = this.field183 = this.field182 = this.field181 = this.field187 = this.field178 = this.field186 = this.field184 = this.field188 = 0.0F;
        this.field176 = this.field177 = this.field180 = 1.0F;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    public final void method117(int arg0) {
        this.field177 = 1.0F;
        this.field176 = this.field180 = class212.field2902[arg0 & 0x3FFF];
        this.field187 = class212.field2903[arg0 & 0x3FFF];
        this.field183 = -this.field187;
        this.field182 = this.field186 = this.field185 = this.field178 = this.field184 = this.field181 = this.field188 = 0.0F;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public final void method118(int arg0) {
        this.field180 = 1.0F;
        this.field176 = this.field177 = class212.field2902[arg0 & 0x3FFF];
        this.field185 = class212.field2903[arg0 & 0x3FFF];
        this.field187 = this.field186 = this.field178 = this.field184 = this.field183 = this.field181 = this.field188 = 0.0F;
        this.field182 = -this.field185;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)[F")
    public final float[] method119(byte arg0) {
        field179[1] = this.field185;
        field179[9] = this.field178;
        field179[13] = 0.0F;
        field179[12] = 0.0F;
        field179[4] = this.field182;
        field179[0] = this.field176;
        field179[2] = this.field183;
        int var2 = 73 % ((arg0) / 50);
        field179[10] = this.field180;
        field179[6] = this.field181;
        field179[14] = 0.0F;
        field179[5] = this.field177;
        field179[8] = this.field187;
        return field179;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lvr;)V")
    public final void method120(class71 arg0) {
        class18 var2 = (class18) arg0;
        this.field188 = var2.field188;
        this.field176 = var2.field176;
        this.field185 = var2.field185;
        this.field177 = var2.field177;
        this.field182 = var2.field182;
        this.field178 = var2.field178;
        this.field183 = var2.field183;
        this.field180 = var2.field180;
        this.field186 = var2.field186;
        this.field187 = var2.field187;
        this.field181 = var2.field181;
        this.field184 = var2.field184;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([I)V")
    public final void method121(int[] arg0) {
        float var2 = (float) arg0[0] - this.field186;
        float var3 = (float) arg0[1] - this.field184;
        float var4 = (float) arg0[2] - this.field188;
        arg0[2] = (int) (this.field180 * var4 + this.field187 * var2 + this.field178 * var3);
        arg0[0] = (int) (this.field183 * var4 + this.field185 * var3 + this.field176 * var2);
        arg0[1] = (int) (this.field181 * var4 + this.field182 * var2 + this.field177 * var3);
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)[F")
    public final float[] method122(byte arg0) {
        field179[4] = this.field182;
        field179[13] = this.field184;
        field179[8] = this.field187;
        field179[5] = this.field177;
        field179[10] = this.field180;
        field179[12] = this.field186;
        field179[6] = this.field181;
        field179[9] = this.field178;
        field179[2] = this.field183;
        field179[0] = this.field176;
        field179[1] = this.field185;
        if (arg0 != 10) {
            this.field182 = -0.8584499F;
        }
        field179[14] = this.field188;
        return field179;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)V")
    public final void method123(int arg0, int arg1, int arg2) {
        this.field176 = this.field177 = this.field180 = 1.0F;
        this.field184 = (float) arg1;
        this.field188 = (float) arg2;
        this.field186 = (float) arg0;
        this.field185 = this.field183 = this.field182 = this.field181 = this.field187 = this.field178 = 0.0F;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
    public final void method124(int arg0, int arg1, int arg2) {
        this.field184 += (float) arg1;
        this.field186 += (float) arg0;
        this.field188 += (float) arg2;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
    public final void method125(int arg0) {
        float var2 = class212.field2902[arg0 & 0x3FFF];
        float var3 = class212.field2903[arg0 & 0x3FFF];
        float var4 = this.field176;
        float var5 = this.field182;
        float var6 = this.field187;
        float var7 = this.field186;
        this.field176 = this.field183 * var3 + var2 * var4;
        this.field183 = this.field183 * var2 - (var3 * var4);
        this.field182 = this.field181 * var3 + var2 * var5;
        this.field187 = this.field180 * var3 + var2 * var6;
        this.field181 = this.field181 * var2 - (var3 * var5);
        this.field180 = this.field180 * var2 - var3 * var6;
        this.field186 = this.field188 * var3 + var2 * var7;
        this.field188 = this.field188 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()Lnc;")
    public final class18 method126() {
        class18 var1 = new class18();
        var1.field188 = this.field188;
        var1.field184 = this.field184;
        var1.field186 = this.field186;
        var1.field183 = this.field183;
        var1.field178 = this.field178;
        var1.field176 = this.field176;
        var1.field177 = this.field177;
        var1.field182 = this.field182;
        var1.field187 = this.field187;
        var1.field185 = this.field185;
        var1.field181 = this.field181;
        var1.field180 = this.field180;
        return var1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIII)V")
    public final void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class212.field2902[arg3 & 0x3FFF];
        float var8 = class212.field2903[arg3 & 0x3FFF];
        float var9 = class212.field2902[arg4 & 0x3FFF];
        float var10 = class212.field2903[arg4 & 0x3FFF];
        float var11 = class212.field2902[arg5 & 0x3FFF];
        float var12 = class212.field2903[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field182 = var7 * var12;
        this.field180 = var7 * var9;
        this.field187 = -var10 * var11 + var9 * var14;
        this.field176 = var9 * var11 + var10 * var14;
        this.field178 = var9 * var13 + var10 * var12;
        this.field183 = var7 * var10;
        this.field185 = -var9 * var12 + var10 * var13;
        this.field181 = -var8;
        this.field177 = var7 * var11;
        this.field188 = (float) (-arg0) * this.field183 - ((float) arg1 * this.field181) - ((float) arg2 * this.field180);
        this.field186 = (float) (-arg0) * this.field176 - (float) arg1 * this.field182 - ((float) arg2 * this.field187);
        this.field184 = (float) (-arg0) * this.field185 - (float) arg1 * this.field177 - ((float) arg2 * this.field178);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lvr;I)V")
    public final void method128(class71 arg0, int arg1) {
        class18 var3 = (class18) arg0;
        this.field187 = var3.field183;
        this.field176 = var3.field176;
        this.field182 = var3.field185;
        this.field183 = var3.field187;
        this.field177 = var3.field177;
        this.field178 = var3.field181;
        if (arg1 != 2) {
            this.method130(113, -31, 39, (int[]) null);
        }
        this.field185 = var3.field182;
        this.field181 = var3.field178;
        this.field180 = var3.field180;
        this.field186 = -(this.field187 * var3.field188 + this.field182 * var3.field184 + this.field176 * var3.field186);
        this.field184 = -(this.field178 * var3.field188 + this.field185 * var3.field186 + this.field177 * var3.field184);
        this.field188 = -(this.field180 * var3.field188 + this.field183 * var3.field186 + this.field181 * var3.field184);
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public final void method129(int arg0) {
        this.field176 = 1.0F;
        this.field177 = this.field180 = class212.field2902[arg0 & 0x3FFF];
        this.field181 = class212.field2903[arg0 & 0x3FFF];
        this.field178 = -this.field181;
        this.field182 = this.field187 = this.field186 = this.field185 = this.field184 = this.field183 = this.field188 = 0.0F;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[I)V")
    public final void method130(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field180 + (float) arg0 * this.field183 + (float) arg1 * this.field181 + this.field188);
        arg3[1] = (int) ((float) arg2 * this.field178 + (float) arg0 * this.field185 + (float) arg1 * this.field177 + this.field184);
        arg3[0] = (int) ((float) arg2 * this.field187 + (float) arg0 * this.field176 + (float) arg1 * this.field182 + this.field186);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public final void method131(int arg0) {
        float var2 = class212.field2902[arg0 & 0x3FFF];
        float var3 = class212.field2903[arg0 & 0x3FFF];
        float var4 = this.field185;
        float var5 = this.field177;
        float var6 = this.field178;
        float var7 = this.field184;
        this.field185 = var2 * var4 - (this.field183 * var3);
        this.field183 = this.field183 * var2 + var3 * var4;
        this.field177 = var2 * var5 - (this.field181 * var3);
        this.field181 = this.field181 * var2 + var3 * var5;
        this.field178 = var2 * var6 - this.field180 * var3;
        this.field184 = var2 * var7 - this.field188 * var3;
        this.field180 = this.field180 * var2 + var3 * var6;
        this.field188 = this.field188 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class18() {
        this.method116();
    }
}
