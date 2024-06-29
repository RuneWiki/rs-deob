import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class326 extends class154 {

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public int field4726;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public int field4728;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public int field4729;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public int field4731;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public int field4732;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public int field4733;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public int field4734;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public int field4735;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public int field4736;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V")
    public final void method1140(int arg0) {
        int var2 = class447.field6390[arg0 & 0x3FFF];
        int var3 = class447.field6381[arg0 & 0x3FFF];
        int var4 = this.field4727;
        int var5 = this.field4728;
        int var6 = this.field4735;
        int var7 = this.field4737;
        this.field4727 = var2 * var4 - this.field4729 * var3 >> 15;
        this.field4729 = this.field4729 * var2 + var3 * var4 >> 15;
        this.field4728 = var2 * var5 - this.field4730 * var3 >> 15;
        this.field4730 = this.field4730 * var2 + var3 * var5 >> 15;
        this.field4735 = var2 * var6 - this.field4732 * var3 >> 15;
        this.field4732 = this.field4732 * var2 + var3 * var6 >> 15;
        this.field4737 = var2 * var7 - this.field4731 * var3 >> 15;
        this.field4731 = this.field4731 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)V")
    public final void method1143(int arg0) {
        int var2 = class447.field6390[arg0 & 0x3FFF];
        int var3 = class447.field6381[arg0 & 0x3FFF];
        int var4 = this.field4734;
        int var5 = this.field4736;
        int var6 = this.field4726;
        int var7 = this.field4733;
        this.field4734 = this.field4729 * var3 + var2 * var4 >> 15;
        this.field4729 = this.field4729 * var2 - var3 * var4 >> 15;
        this.field4736 = this.field4730 * var3 + var2 * var5 >> 15;
        this.field4730 = this.field4730 * var2 - var3 * var5 >> 15;
        this.field4726 = this.field4732 * var3 + var2 * var6 >> 15;
        this.field4732 = this.field4732 * var2 - var3 * var6 >> 15;
        this.field4733 = this.field4731 * var3 + var2 * var7 >> 15;
        this.field4731 = this.field4731 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ls;)V")
    public final void method1139(class154 arg0) {
        class326 var2 = (class326) arg0;
        this.field4734 = var2.field4734;
        this.field4736 = var2.field4736;
        this.field4726 = var2.field4726;
        this.field4733 = var2.field4733;
        this.field4727 = var2.field4727;
        this.field4728 = var2.field4728;
        this.field4735 = var2.field4735;
        this.field4737 = var2.field4737;
        this.field4729 = var2.field4729;
        this.field4730 = var2.field4730;
        this.field4732 = var2.field4732;
        this.field4731 = var2.field4731;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()Lel;")
    public final class326 method2146() {
        class326 var1 = new class326();
        var1.field4734 = this.field4734;
        var1.field4736 = this.field4736;
        var1.field4726 = this.field4726;
        var1.field4733 = this.field4733;
        var1.field4727 = this.field4727;
        var1.field4728 = this.field4728;
        var1.field4735 = this.field4735;
        var1.field4737 = this.field4737;
        var1.field4729 = this.field4729;
        var1.field4730 = this.field4730;
        var1.field4732 = this.field4732;
        var1.field4731 = this.field4731;
        return var1;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V")
    public final void method1137() {
        this.field4727 = this.field4729 = this.field4736 = this.field4730 = this.field4726 = this.field4735 = this.field4733 = this.field4737 = this.field4731 = 0;
        this.field4734 = this.field4728 = this.field4732 = 32768;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([I)V")
    public final void method1145(int[] arg0) {
        int var2 = arg0[0] - this.field4733;
        int var3 = arg0[1] - this.field4737;
        int var4 = arg0[2] - this.field4731;
        arg0[0] = this.field4729 * var4 + this.field4734 * var2 + this.field4727 * var3 >> 15;
        arg0[1] = this.field4730 * var4 + this.field4736 * var2 + this.field4728 * var3 >> 15;
        arg0[2] = this.field4732 * var4 + this.field4735 * var3 + this.field4726 * var2 >> 15;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIII)V")
    public final void method1142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class447.field6390[arg3 & 0x3FFF];
        int var8 = class447.field6381[arg3 & 0x3FFF];
        int var9 = class447.field6390[arg4 & 0x3FFF];
        int var10 = class447.field6381[arg4 & 0x3FFF];
        int var11 = class447.field6390[arg5 & 0x3FFF];
        int var12 = class447.field6381[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field4734 = var9 * var11 + var10 * var14 >> 15;
        this.field4727 = -var9 * var12 + var10 * var13 >> 15;
        this.field4729 = var7 * var10 >> 15;
        this.field4736 = var7 * var12 >> 15;
        this.field4728 = var7 * var11 >> 15;
        this.field4730 = -var8;
        this.field4726 = -var10 * var11 + var9 * var14 >> 15;
        this.field4735 = var9 * var13 + var10 * var12 >> 15;
        this.field4732 = var7 * var9 >> 15;
        this.field4733 = -arg0 * this.field4734 - this.field4736 * arg1 - this.field4726 * arg2 >> 15;
        this.field4737 = -arg0 * this.field4727 - this.field4728 * arg1 - this.field4735 * arg2 >> 15;
        this.field4731 = -arg0 * this.field4729 - this.field4730 * arg1 - this.field4732 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
    public final void method1136(int arg0) {
        this.field4728 = 32768;
        this.field4734 = this.field4732 = class447.field6390[arg0 & 0x3FFF];
        this.field4726 = class447.field6381[arg0 & 0x3FFF];
        this.field4729 = -this.field4726;
        this.field4736 = this.field4733 = this.field4727 = this.field4735 = this.field4737 = this.field4730 = this.field4731 = 0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
    public final void method1133(int arg0, int arg1, int arg2) {
        this.field4727 = this.field4729 = this.field4736 = this.field4730 = this.field4726 = this.field4735 = 0;
        this.field4734 = this.field4728 = this.field4732 = 32768;
        this.field4733 = arg0;
        this.field4737 = arg1;
        this.field4731 = arg2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public final void method1131(int arg0) {
        this.field4734 = 32768;
        this.field4728 = this.field4732 = class447.field6390[arg0 & 0x3FFF];
        this.field4730 = class447.field6381[arg0 & 0x3FFF];
        this.field4735 = -this.field4730;
        this.field4736 = this.field4726 = this.field4733 = this.field4727 = this.field4737 = this.field4729 = this.field4731 = 0;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(III)V")
    public final void method1134(int arg0, int arg1, int arg2) {
        this.field4733 += arg0;
        this.field4737 += arg1;
        this.field4731 += arg2;
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V")
    public final void method1144(int arg0) {
        this.field4732 = 32768;
        this.field4734 = this.field4728 = class447.field6390[arg0 & 0x3FFF];
        this.field4727 = class447.field6381[arg0 & 0x3FFF];
        this.field4736 = -this.field4727;
        this.field4726 = this.field4733 = this.field4735 = this.field4737 = this.field4729 = this.field4730 = this.field4731 = 0;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class326() {
        this.method1137();
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III[I)V")
    public final void method1147(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field4726 * arg2 + this.field4736 * arg1 + this.field4734 * arg0 >> 15) + this.field4733;
        arg3[1] = (this.field4735 * arg2 + this.field4728 * arg1 + this.field4727 * arg0 >> 15) + this.field4737;
        arg3[2] = (this.field4732 * arg2 + this.field4730 * arg1 + this.field4729 * arg0 >> 15) + this.field4731;
    }
}
