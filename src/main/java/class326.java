import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class326 extends class165 {

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public int field4488;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public int field4489;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public int field4490;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public int field4491;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public int field4492;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public int field4493;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public int field4496;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public int field4497;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public int field4498;

    @OriginalMember(owner = "client!ba", name = "ta", descriptor = "(I)V", line = 3)
    public final void method345(int arg0) {
        this.field4496 = 32768;
        this.field4493 = this.field4491 = class589.field8735[arg0 & 0x3FFF];
        this.field4495 = class589.field8742[arg0 & 0x3FFF];
        this.field4498 = -this.field4495;
        this.field4492 = this.field4490 = this.field4494 = this.field4497 = this.field4488 = this.field4487 = this.field4489 = 0;
    }

    @OriginalMember(owner = "client!ba", name = "TA", descriptor = "(III)V", line = 12)
    public final void method338(int arg0, int arg1, int arg2) {
        this.field4490 += arg0;
        this.field4497 += arg1;
        this.field4489 += arg2;
    }

    @OriginalMember(owner = "client!ba", name = "XA", descriptor = "(I)V", line = 21)
    public final void method352(int arg0) {
        int var2 = class589.field8735[arg0 & 0x3FFF];
        int var3 = class589.field8742[arg0 & 0x3FFF];
        int var4 = this.field4493;
        int var5 = this.field4498;
        int var6 = this.field4492;
        int var7 = this.field4490;
        this.field4493 = this.field4488 * var3 + var2 * var4 >> 15;
        this.field4488 = this.field4488 * var2 - var3 * var4 >> 15;
        this.field4498 = this.field4487 * var3 + var2 * var5 >> 15;
        this.field4487 = this.field4487 * var2 - var3 * var5 >> 15;
        this.field4492 = this.field4496 * var3 + var2 * var6 >> 15;
        this.field4496 = this.field4496 * var2 - var3 * var6 >> 15;
        this.field4490 = this.field4489 * var3 + var2 * var7 >> 15;
        this.field4489 = this.field4489 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ba", name = "ha", descriptor = "()V", line = 43)
    public final void method336() {
        this.field4495 = this.field4488 = this.field4498 = this.field4487 = this.field4492 = this.field4494 = this.field4490 = this.field4497 = this.field4489 = 0;
        this.field4493 = this.field4491 = this.field4496 = 32768;
    }

    @OriginalMember(owner = "client!ba", name = "EA", descriptor = "(Lm;)V", line = 48)
    public final void method337(class165 arg0) {
        class326 var2 = (class326) arg0;
        this.field4493 = var2.field4493;
        this.field4498 = var2.field4498;
        this.field4492 = var2.field4492;
        this.field4490 = var2.field4490;
        this.field4495 = var2.field4495;
        this.field4491 = var2.field4491;
        this.field4494 = var2.field4494;
        this.field4497 = var2.field4497;
        this.field4488 = var2.field4488;
        this.field4487 = var2.field4487;
        this.field4496 = var2.field4496;
        this.field4489 = var2.field4489;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()Lm;", line = 65)
    public final class165 method335() {
        class326 var1 = new class326();
        var1.field4493 = this.field4493;
        var1.field4498 = this.field4498;
        var1.field4492 = this.field4492;
        var1.field4490 = this.field4490;
        var1.field4495 = this.field4495;
        var1.field4491 = this.field4491;
        var1.field4494 = this.field4494;
        var1.field4497 = this.field4497;
        var1.field4488 = this.field4488;
        var1.field4487 = this.field4487;
        var1.field4496 = this.field4496;
        var1.field4489 = this.field4489;
        return var1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III[I)V", line = 81)
    public final void method341(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field4492 * arg2 + this.field4498 * arg1 + this.field4493 * arg0 >> 15) + this.field4490;
        arg3[1] = (this.field4494 * arg2 + this.field4495 * arg0 + this.field4491 * arg1 >> 15) + this.field4497;
        arg3[2] = (this.field4496 * arg2 + this.field4488 * arg0 + this.field4487 * arg1 >> 15) + this.field4489;
    }

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "(IIIIII)V", line = 90)
    public final void method339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class589.field8735[arg3 & 0x3FFF];
        int var8 = class589.field8742[arg3 & 0x3FFF];
        int var9 = class589.field8735[arg4 & 0x3FFF];
        int var10 = class589.field8742[arg4 & 0x3FFF];
        int var11 = class589.field8735[arg5 & 0x3FFF];
        int var12 = class589.field8742[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field4493 = var9 * var11 + var10 * var14 >> 15;
        this.field4495 = -var9 * var12 + var10 * var13 >> 15;
        this.field4488 = var7 * var10 >> 15;
        this.field4498 = var7 * var12 >> 15;
        this.field4491 = var7 * var11 >> 15;
        this.field4487 = -var8;
        this.field4492 = -var10 * var11 + var9 * var14 >> 15;
        this.field4494 = var9 * var13 + var10 * var12 >> 15;
        this.field4496 = var7 * var9 >> 15;
        this.field4490 = -arg0 * this.field4493 - this.field4498 * arg1 - this.field4492 * arg2 >> 15;
        this.field4497 = -arg0 * this.field4495 - this.field4491 * arg1 - this.field4494 * arg2 >> 15;
        this.field4489 = -arg0 * this.field4488 - this.field4487 * arg1 - this.field4496 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ba", name = "va", descriptor = "([I)V", line = 124)
    public final void method351(int[] arg0) {
        int var2 = arg0[0] - this.field4490;
        int var3 = arg0[1] - this.field4497;
        int var4 = arg0[2] - this.field4489;
        arg0[0] = this.field4488 * var4 + this.field4495 * var3 + this.field4493 * var2 >> 15;
        arg0[1] = this.field4487 * var4 + this.field4498 * var2 + this.field4491 * var3 >> 15;
        arg0[2] = this.field4496 * var4 + this.field4494 * var3 + this.field4492 * var2 >> 15;
    }

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "(I)V", line = 135)
    public final void method342(int arg0) {
        int var2 = class589.field8735[arg0 & 0x3FFF];
        int var3 = class589.field8742[arg0 & 0x3FFF];
        int var4 = this.field4495;
        int var5 = this.field4491;
        int var6 = this.field4494;
        int var7 = this.field4497;
        this.field4495 = var2 * var4 - this.field4488 * var3 >> 15;
        this.field4488 = this.field4488 * var2 + var3 * var4 >> 15;
        this.field4491 = var2 * var5 - this.field4487 * var3 >> 15;
        this.field4487 = this.field4487 * var2 + var3 * var5 >> 15;
        this.field4494 = var2 * var6 - this.field4496 * var3 >> 15;
        this.field4496 = this.field4496 * var2 + var3 * var6 >> 15;
        this.field4497 = var2 * var7 - this.field4489 * var3 >> 15;
        this.field4489 = this.field4489 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ba", name = "ma", descriptor = "(I)V", line = 157)
    public final void method344(int arg0) {
        this.field4491 = 32768;
        this.field4493 = this.field4496 = class589.field8735[arg0 & 0x3FFF];
        this.field4492 = class589.field8742[arg0 & 0x3FFF];
        this.field4488 = -this.field4492;
        this.field4498 = this.field4490 = this.field4495 = this.field4494 = this.field4497 = this.field4487 = this.field4489 = 0;
    }

    @OriginalMember(owner = "client!ba", name = "oa", descriptor = "(III)V", line = 165)
    public final void method353(int arg0, int arg1, int arg2) {
        this.field4495 = this.field4488 = this.field4498 = this.field4487 = this.field4492 = this.field4494 = 0;
        this.field4493 = this.field4491 = this.field4496 = 32768;
        this.field4490 = arg0;
        this.field4497 = arg1;
        this.field4489 = arg2;
    }

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "(III[I)V", line = 172)
    public final void method343(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field4492 * arg2 + this.field4498 * arg1 + this.field4493 * arg0 >> 15;
        arg3[1] = this.field4494 * arg2 + this.field4495 * arg0 + this.field4491 * arg1 >> 15;
        arg3[2] = this.field4496 * arg2 + this.field4488 * arg0 + this.field4487 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 177)
    public class326() {
        this.method336();
    }

    @OriginalMember(owner = "client!ba", name = "KA", descriptor = "(I)V", line = 181)
    public final void method355(int arg0) {
        this.field4493 = 32768;
        this.field4491 = this.field4496 = class589.field8735[arg0 & 0x3FFF];
        this.field4487 = class589.field8742[arg0 & 0x3FFF];
        this.field4494 = -this.field4487;
        this.field4498 = this.field4492 = this.field4490 = this.field4495 = this.field4497 = this.field4488 = this.field4489 = 0;
    }
}
