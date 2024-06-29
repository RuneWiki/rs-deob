import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class35 extends class118 {

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "[F")
    private static float[] field539 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "F")
    public float field538;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "F")
    public float field540;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "F")
    public float field541;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "F")
    public float field542;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "F")
    public float field543;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "F")
    public float field544;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "F")
    public float field545;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "F")
    public float field546;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "F")
    public float field547;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "F")
    public float field548;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "F")
    public float field549;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "F")
    public float field550;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)[F", line = 4)
    public final float[] method263(byte arg0) {
        field539[4] = this.field550;
        field539[0] = this.field541;
        field539[5] = this.field540;
        field539[9] = this.field538;
        field539[1] = this.field549;
        field539[13] = this.field546;
        field539[10] = this.field542;
        field539[2] = this.field547;
        field539[12] = this.field548;
        field539[8] = this.field545;
        if (arg0 < 72) {
            this.field542 = -0.5555363F;
        }
        field539[6] = this.field543;
        field539[14] = this.field544;
        return field539;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()V", line = 29)
    public final void method264() {
        this.field549 = this.field547 = this.field550 = this.field543 = this.field545 = this.field538 = this.field548 = this.field546 = this.field544 = 0.0F;
        this.field541 = this.field540 = this.field542 = 1.0F;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)[F", line = 38)
    public final float[] method265(byte arg0) {
        field539[10] = this.field542;
        field539[1] = this.field549;
        field539[9] = this.field538;
        field539[5] = this.field540;
        field539[8] = this.field545;
        if (arg0 != -103) {
            this.field542 = -0.61485565F;
        }
        field539[2] = this.field547;
        field539[13] = 0.0F;
        field539[14] = 0.0F;
        field539[12] = 0.0F;
        field539[0] = this.field541;
        field539[6] = this.field543;
        field539[4] = this.field550;
        return field539;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILug;)V", line = 62)
    public final void method266(int arg0, class118 arg1) {
        if (arg0 != -9682) {
            return;
        }
        class35 var3 = (class35) arg1;
        this.field541 = var3.field541;
        this.field550 = var3.field549;
        this.field545 = var3.field547;
        this.field547 = var3.field545;
        this.field538 = var3.field543;
        this.field540 = var3.field540;
        this.field549 = var3.field550;
        this.field542 = var3.field542;
        this.field543 = var3.field538;
        this.field548 = -(this.field545 * var3.field544 + this.field550 * var3.field546 + this.field541 * var3.field548);
        this.field546 = -(this.field538 * var3.field544 + this.field549 * var3.field548 + this.field540 * var3.field546);
        this.field544 = -(this.field542 * var3.field544 + this.field547 * var3.field548 + this.field543 * var3.field546);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([I)V", line = 85)
    public final void method267(int[] arg0) {
        float var2 = (float) arg0[0] - this.field548;
        float var3 = (float) arg0[1] - this.field546;
        float var4 = (float) arg0[2] - this.field544;
        arg0[0] = (int) (this.field547 * var4 + this.field549 * var3 + this.field541 * var2);
        arg0[2] = (int) (this.field542 * var4 + this.field545 * var2 + this.field538 * var3);
        arg0[1] = (int) (this.field543 * var4 + this.field550 * var2 + this.field540 * var3);
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V", line = 102)
    public final void method268(int arg0) {
        float var2 = class401.field5868[arg0 & 0x3FFF];
        float var3 = class401.field5867[arg0 & 0x3FFF];
        float var4 = this.field549;
        float var5 = this.field540;
        float var6 = this.field538;
        float var7 = this.field546;
        this.field549 = var2 * var4 - this.field547 * var3;
        this.field540 = var2 * var5 - this.field543 * var3;
        this.field547 = this.field547 * var2 + var3 * var4;
        this.field538 = var2 * var6 - (this.field542 * var3);
        this.field543 = this.field543 * var2 + var3 * var5;
        this.field546 = var2 * var7 - this.field544 * var3;
        this.field542 = this.field542 * var2 + var3 * var6;
        this.field544 = this.field544 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lug;)V", line = 132)
    public final void method269(class118 arg0) {
        class35 var2 = (class35) arg0;
        this.field542 = var2.field542;
        this.field548 = var2.field548;
        this.field545 = var2.field545;
        this.field550 = var2.field550;
        this.field547 = var2.field547;
        this.field544 = var2.field544;
        this.field549 = var2.field549;
        this.field538 = var2.field538;
        this.field546 = var2.field546;
        this.field540 = var2.field540;
        this.field541 = var2.field541;
        this.field543 = var2.field543;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 151)
    public final void method270(int arg0) {
        this.field541 = 1.0F;
        this.field540 = this.field542 = class401.field5868[arg0 & 0x3FFF];
        this.field543 = class401.field5867[arg0 & 0x3FFF];
        this.field538 = -this.field543;
        this.field550 = this.field545 = this.field548 = this.field549 = this.field546 = this.field547 = this.field544 = 0.0F;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V", line = 162)
    public final void method271(int arg0, int arg1, int arg2) {
        this.field548 += (float) arg0;
        this.field544 += (float) arg2;
        this.field546 += (float) arg1;
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V", line = 171)
    public final void method272(int arg0) {
        this.field542 = 1.0F;
        this.field541 = this.field540 = class401.field5868[arg0 & 0x3FFF];
        this.field549 = class401.field5867[arg0 & 0x3FFF];
        this.field545 = this.field548 = this.field538 = this.field546 = this.field547 = this.field543 = this.field544 = 0.0F;
        this.field550 = -this.field549;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V", line = 182)
    public final void method273(int arg0) {
        this.field540 = 1.0F;
        this.field541 = this.field542 = class401.field5868[arg0 & 0x3FFF];
        this.field545 = class401.field5867[arg0 & 0x3FFF];
        this.field547 = -this.field545;
        this.field550 = this.field548 = this.field549 = this.field538 = this.field546 = this.field543 = this.field544 = 0.0F;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V", line = 193)
    public final void method274(int arg0, int arg1, int arg2) {
        this.field544 = (float) arg2;
        this.field548 = (float) arg0;
        this.field546 = (float) arg1;
        this.field549 = this.field547 = this.field550 = this.field543 = this.field545 = this.field538 = 0.0F;
        this.field541 = this.field540 = this.field542 = 1.0F;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()Lsd;", line = 206)
    public final class35 method275() {
        class35 var1 = new class35();
        var1.field541 = this.field541;
        var1.field540 = this.field540;
        var1.field549 = this.field549;
        var1.field547 = this.field547;
        var1.field538 = this.field538;
        var1.field550 = this.field550;
        var1.field545 = this.field545;
        var1.field546 = this.field546;
        var1.field543 = this.field543;
        var1.field544 = this.field544;
        var1.field548 = this.field548;
        var1.field542 = this.field542;
        return var1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V", line = 227)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class401.field5868[arg3 & 0x3FFF];
        float var8 = class401.field5867[arg3 & 0x3FFF];
        float var9 = class401.field5868[arg4 & 0x3FFF];
        float var10 = class401.field5867[arg4 & 0x3FFF];
        float var11 = class401.field5868[arg5 & 0x3FFF];
        float var12 = class401.field5867[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field542 = var7 * var9;
        this.field541 = var9 * var11 + var10 * var14;
        this.field545 = -var10 * var11 + var9 * var14;
        this.field547 = var7 * var10;
        this.field543 = -var8;
        this.field549 = -var9 * var12 + var10 * var13;
        this.field540 = var7 * var11;
        this.field538 = var9 * var13 + var10 * var12;
        this.field550 = var7 * var12;
        this.field544 = (float) (-arg0) * this.field547 - ((float) arg1 * this.field543) - ((float) arg2 * this.field542);
        this.field548 = (float) (-arg0) * this.field541 - (float) arg1 * this.field550 - ((float) arg2 * this.field545);
        this.field546 = (float) (-arg0) * this.field549 - (float) arg1 * this.field540 - ((float) arg2 * this.field538);
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 264)
    public final void method277(int arg0) {
        float var2 = class401.field5868[arg0 & 0x3FFF];
        float var3 = class401.field5867[arg0 & 0x3FFF];
        float var4 = this.field541;
        float var5 = this.field550;
        float var6 = this.field545;
        float var7 = this.field548;
        this.field541 = this.field547 * var3 + var2 * var4;
        this.field550 = this.field543 * var3 + var2 * var5;
        this.field547 = this.field547 * var2 - (var3 * var4);
        this.field543 = this.field543 * var2 - (var3 * var5);
        this.field545 = this.field542 * var3 + var2 * var6;
        this.field548 = this.field544 * var3 + var2 * var7;
        this.field542 = this.field542 * var2 - var3 * var6;
        this.field544 = this.field544 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 293)
    public class35() {
        this.method264();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III[I)V", line = 302)
    public final void method278(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field545 + (float) arg0 * this.field541 + (float) arg1 * this.field550 + this.field548);
        arg3[1] = (int) ((float) arg2 * this.field538 + (float) arg0 * this.field549 + (float) arg1 * this.field540 + this.field546);
        arg3[2] = (int) ((float) arg2 * this.field542 + (float) arg0 * this.field547 + (float) arg1 * this.field543 + this.field544);
    }
}
