import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class451 extends class125 {

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public int field6582;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public int field6583;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public int field6584;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public int field6585;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public int field6586;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public int field6587;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public int field6588;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public int field6589;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public int field6590;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public int field6591;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public int field6592;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public int field6593;

    @OriginalMember(owner = "client!gj", name = "ja", descriptor = "(I)V")
    public final void method210(int arg0) {
        int var2 = class281.field4279[arg0 & 0x3FFF];
        int var3 = class281.field4278[arg0 & 0x3FFF];
        int var4 = this.field6586;
        int var5 = this.field6591;
        int var6 = this.field6585;
        int var7 = this.field6590;
        this.field6586 = this.field6584 * var3 + var2 * var4 >> 15;
        this.field6584 = this.field6584 * var2 - var3 * var4 >> 15;
        this.field6591 = this.field6583 * var3 + var2 * var5 >> 15;
        this.field6583 = this.field6583 * var2 - var3 * var5 >> 15;
        this.field6585 = this.field6593 * var3 + var2 * var6 >> 15;
        this.field6593 = this.field6593 * var2 - var3 * var6 >> 15;
        this.field6590 = this.field6592 * var3 + var2 * var7 >> 15;
        this.field6592 = this.field6592 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!gj", name = "ka", descriptor = "(I)V")
    public final void method208(int arg0) {
        int var2 = class281.field4279[arg0 & 0x3FFF];
        int var3 = class281.field4278[arg0 & 0x3FFF];
        int var4 = this.field6589;
        int var5 = this.field6582;
        int var6 = this.field6588;
        int var7 = this.field6587;
        this.field6589 = var2 * var4 - this.field6584 * var3 >> 15;
        this.field6584 = this.field6584 * var2 + var3 * var4 >> 15;
        this.field6582 = var2 * var5 - this.field6583 * var3 >> 15;
        this.field6583 = this.field6583 * var2 + var3 * var5 >> 15;
        this.field6588 = var2 * var6 - this.field6593 * var3 >> 15;
        this.field6593 = this.field6593 * var2 + var3 * var6 >> 15;
        this.field6587 = var2 * var7 - this.field6592 * var3 >> 15;
        this.field6592 = this.field6592 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "(III)V")
    public final void method206(int arg0, int arg1, int arg2) {
        this.field6589 = this.field6584 = this.field6591 = this.field6583 = this.field6585 = this.field6588 = 0;
        this.field6586 = this.field6582 = this.field6593 = 32768;
        this.field6590 = arg0;
        this.field6587 = arg1;
        this.field6592 = arg2;
    }

    @OriginalMember(owner = "client!gj", name = "xa", descriptor = "()V")
    public final void method209() {
        this.field6589 = this.field6584 = this.field6591 = this.field6583 = this.field6585 = this.field6588 = this.field6590 = this.field6587 = this.field6592 = 0;
        this.field6586 = this.field6582 = this.field6593 = 32768;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()Lc;")
    public final class125 method205() {
        class451 var1 = new class451();
        var1.field6586 = this.field6586;
        var1.field6591 = this.field6591;
        var1.field6585 = this.field6585;
        var1.field6590 = this.field6590;
        var1.field6589 = this.field6589;
        var1.field6582 = this.field6582;
        var1.field6588 = this.field6588;
        var1.field6587 = this.field6587;
        var1.field6584 = this.field6584;
        var1.field6583 = this.field6583;
        var1.field6593 = this.field6593;
        var1.field6592 = this.field6592;
        return var1;
    }

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "([I)V")
    public final void method215(int[] arg0) {
        int var2 = arg0[0] - this.field6590;
        int var3 = arg0[1] - this.field6587;
        int var4 = arg0[2] - this.field6592;
        arg0[0] = this.field6584 * var4 + this.field6589 * var3 + this.field6586 * var2 >> 15;
        arg0[1] = this.field6583 * var4 + this.field6591 * var2 + this.field6582 * var3 >> 15;
        arg0[2] = this.field6593 * var4 + this.field6588 * var3 + this.field6585 * var2 >> 15;
    }

    @OriginalMember(owner = "client!gj", name = "ra", descriptor = "(I)V")
    public final void method216(int arg0) {
        this.field6582 = 32768;
        this.field6586 = this.field6593 = class281.field4279[arg0 & 0x3FFF];
        this.field6585 = class281.field4278[arg0 & 0x3FFF];
        this.field6584 = -this.field6585;
        this.field6591 = this.field6590 = this.field6589 = this.field6588 = this.field6587 = this.field6583 = this.field6592 = 0;
    }

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "(I)V")
    public final void method219(int arg0) {
        this.field6586 = 32768;
        this.field6582 = this.field6593 = class281.field4279[arg0 & 0x3FFF];
        this.field6583 = class281.field4278[arg0 & 0x3FFF];
        this.field6588 = -this.field6583;
        this.field6591 = this.field6585 = this.field6590 = this.field6589 = this.field6587 = this.field6584 = this.field6592 = 0;
    }

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "(III[I)V")
    public final void method217(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field6585 * arg2 + this.field6591 * arg1 + this.field6586 * arg0 >> 15;
        arg3[1] = this.field6588 * arg2 + this.field6589 * arg0 + this.field6582 * arg1 >> 15;
        arg3[2] = this.field6593 * arg2 + this.field6584 * arg0 + this.field6583 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "(III)V")
    public final void method207(int arg0, int arg1, int arg2) {
        this.field6590 += arg0;
        this.field6587 += arg1;
        this.field6592 += arg2;
    }

    @OriginalMember(owner = "client!gj", name = "za", descriptor = "(Lc;)V")
    public final void method214(class125 arg0) {
        class451 var2 = (class451) arg0;
        this.field6586 = var2.field6586;
        this.field6591 = var2.field6591;
        this.field6585 = var2.field6585;
        this.field6590 = var2.field6590;
        this.field6589 = var2.field6589;
        this.field6582 = var2.field6582;
        this.field6588 = var2.field6588;
        this.field6587 = var2.field6587;
        this.field6584 = var2.field6584;
        this.field6583 = var2.field6583;
        this.field6593 = var2.field6593;
        this.field6592 = var2.field6592;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[I)V")
    public final void method220(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field6585 * arg2 + this.field6591 * arg1 + this.field6586 * arg0 >> 15) + this.field6590;
        arg3[1] = (this.field6588 * arg2 + this.field6589 * arg0 + this.field6582 * arg1 >> 15) + this.field6587;
        arg3[2] = (this.field6593 * arg2 + this.field6584 * arg0 + this.field6583 * arg1 >> 15) + this.field6592;
    }

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "(IIIIII)V")
    public final void method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class281.field4279[arg3 & 0x3FFF];
        int var8 = class281.field4278[arg3 & 0x3FFF];
        int var9 = class281.field4279[arg4 & 0x3FFF];
        int var10 = class281.field4278[arg4 & 0x3FFF];
        int var11 = class281.field4279[arg5 & 0x3FFF];
        int var12 = class281.field4278[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field6586 = var9 * var11 + var10 * var14 >> 15;
        this.field6589 = -var9 * var12 + var10 * var13 >> 15;
        this.field6584 = var7 * var10 >> 15;
        this.field6591 = var7 * var12 >> 15;
        this.field6582 = var7 * var11 >> 15;
        this.field6583 = -var8;
        this.field6585 = -var10 * var11 + var9 * var14 >> 15;
        this.field6588 = var9 * var13 + var10 * var12 >> 15;
        this.field6593 = var7 * var9 >> 15;
        this.field6590 = -arg0 * this.field6586 - this.field6591 * arg1 - this.field6585 * arg2 >> 15;
        this.field6587 = -arg0 * this.field6589 - this.field6582 * arg1 - this.field6588 * arg2 >> 15;
        this.field6592 = -arg0 * this.field6584 - this.field6583 * arg1 - this.field6593 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "(I)V")
    public final void method211(int arg0) {
        this.field6593 = 32768;
        this.field6586 = this.field6582 = class281.field4279[arg0 & 0x3FFF];
        this.field6589 = class281.field4278[arg0 & 0x3FFF];
        this.field6591 = -this.field6589;
        this.field6585 = this.field6590 = this.field6588 = this.field6587 = this.field6584 = this.field6583 = this.field6592 = 0;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class451() {
        this.method209();
    }
}
