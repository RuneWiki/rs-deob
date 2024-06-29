import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class496 extends class397 {

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public int field6657;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public int field6658;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public int field6659;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public int field6660;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public int field6661;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public int field6662;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public int field6663;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
    public int field6664;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
    public int field6665;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
    public int field6666;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
    public int field6667;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
    public int field6668;

    @OriginalMember(owner = "client!pt", name = "S", descriptor = "(I)V")
    public final void method555(int arg0) {
        int var2 = class126.field2105[arg0 & 0x3FFF];
        int var3 = class126.field2116[arg0 & 0x3FFF];
        int var4 = this.field6663;
        int var5 = this.field6659;
        int var6 = this.field6658;
        int var7 = this.field6660;
        this.field6663 = var2 * var4 - this.field6667 * var3 >> 14;
        this.field6667 = this.field6667 * var2 + var3 * var4 >> 14;
        this.field6659 = var2 * var5 - this.field6666 * var3 >> 14;
        this.field6666 = this.field6666 * var2 + var3 * var5 >> 14;
        this.field6658 = var2 * var6 - this.field6665 * var3 >> 14;
        this.field6665 = this.field6665 * var2 + var3 * var6 >> 14;
        this.field6660 = var2 * var7 - this.field6662 * var3 >> 14;
        this.field6662 = this.field6662 * var2 + var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!pt", name = "la", descriptor = "(Lq;)V")
    public final void method560(class397 arg0) {
        class496 var2 = (class496) arg0;
        this.field6661 = var2.field6661;
        this.field6657 = var2.field6657;
        this.field6668 = var2.field6668;
        this.field6664 = var2.field6664;
        this.field6663 = var2.field6663;
        this.field6659 = var2.field6659;
        this.field6658 = var2.field6658;
        this.field6660 = var2.field6660;
        this.field6667 = var2.field6667;
        this.field6666 = var2.field6666;
        this.field6665 = var2.field6665;
        this.field6662 = var2.field6662;
    }

    @OriginalMember(owner = "client!pt", name = "G", descriptor = "(III)V")
    public final void method571(int arg0, int arg1, int arg2) {
        this.field6664 += arg0;
        this.field6660 += arg1;
        this.field6662 += arg2;
    }

    @OriginalMember(owner = "client!pt", name = "R", descriptor = "(III[I)V")
    public final void method565(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field6668 * arg2 + this.field6661 * arg0 + this.field6657 * arg1 >> 14;
        arg3[1] = this.field6658 * arg2 + this.field6663 * arg0 + this.field6659 * arg1 >> 14;
        arg3[2] = this.field6665 * arg2 + this.field6667 * arg0 + this.field6666 * arg1 >> 14;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(III[I)V")
    public final void method579(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field6668 * arg2 + this.field6661 * arg0 + this.field6657 * arg1 >> 14) + this.field6664;
        arg3[1] = (this.field6658 * arg2 + this.field6663 * arg0 + this.field6659 * arg1 >> 14) + this.field6660;
        arg3[2] = (this.field6665 * arg2 + this.field6667 * arg0 + this.field6666 * arg1 >> 14) + this.field6662;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public final void method572(int arg0) {
        this.field6659 = 16384;
        this.field6661 = this.field6665 = class126.field2105[arg0 & 0x3FFF];
        this.field6668 = class126.field2116[arg0 & 0x3FFF];
        this.field6667 = -this.field6668;
        this.field6657 = this.field6664 = this.field6663 = this.field6658 = this.field6660 = this.field6666 = this.field6662 = 0;
    }

    @OriginalMember(owner = "client!pt", name = "Y", descriptor = "()V")
    public final void method580() {
        this.field6663 = this.field6667 = this.field6657 = this.field6666 = this.field6668 = this.field6658 = this.field6664 = this.field6660 = this.field6662 = 0;
        this.field6661 = this.field6659 = this.field6665 = 16384;
    }

    @OriginalMember(owner = "client!pt", name = "O", descriptor = "([I)V")
    public final void method569(int[] arg0) {
        int var2 = arg0[0] - this.field6664;
        int var3 = arg0[1] - this.field6660;
        int var4 = arg0[2] - this.field6662;
        arg0[0] = this.field6667 * var4 + this.field6663 * var3 + this.field6661 * var2 >> 14;
        arg0[1] = this.field6666 * var4 + this.field6659 * var3 + this.field6657 * var2 >> 14;
        arg0[2] = this.field6665 * var4 + this.field6668 * var2 + this.field6658 * var3 >> 14;
    }

    @OriginalMember(owner = "client!pt", name = "GA", descriptor = "(III)V")
    public final void method576(int arg0, int arg1, int arg2) {
        this.field6663 = this.field6667 = this.field6657 = this.field6666 = this.field6668 = this.field6658 = 0;
        this.field6661 = this.field6659 = this.field6665 = 16384;
        this.field6664 = arg0;
        this.field6660 = arg1;
        this.field6662 = arg2;
    }

    @OriginalMember(owner = "client!pt", name = "ra", descriptor = "(I)V")
    public final void method573(int arg0) {
        this.field6665 = 16384;
        this.field6661 = this.field6659 = class126.field2105[arg0 & 0x3FFF];
        this.field6663 = class126.field2116[arg0 & 0x3FFF];
        this.field6657 = -this.field6663;
        this.field6668 = this.field6664 = this.field6658 = this.field6660 = this.field6667 = this.field6666 = this.field6662 = 0;
    }

    @OriginalMember(owner = "client!pt", name = "XA", descriptor = "(I)V")
    public final void method586(int arg0) {
        this.field6661 = 16384;
        this.field6659 = this.field6665 = class126.field2105[arg0 & 0x3FFF];
        this.field6666 = class126.field2116[arg0 & 0x3FFF];
        this.field6658 = -this.field6666;
        this.field6657 = this.field6668 = this.field6664 = this.field6663 = this.field6660 = this.field6667 = this.field6662 = 0;
    }

    @OriginalMember(owner = "client!pt", name = "pa", descriptor = "(IIIIII)V")
    public final void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class126.field2105[arg3 & 0x3FFF];
        int var8 = class126.field2116[arg3 & 0x3FFF];
        int var9 = class126.field2105[arg4 & 0x3FFF];
        int var10 = class126.field2116[arg4 & 0x3FFF];
        int var11 = class126.field2105[arg5 & 0x3FFF];
        int var12 = class126.field2116[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 14;
        int var14 = var8 * var12 >> 14;
        this.field6661 = var9 * var11 + var10 * var14 >> 14;
        this.field6663 = -var9 * var12 + var10 * var13 >> 14;
        this.field6667 = var7 * var10 >> 14;
        this.field6657 = var7 * var12 >> 14;
        this.field6659 = var7 * var11 >> 14;
        this.field6666 = -var8;
        this.field6668 = -var10 * var11 + var9 * var14 >> 14;
        this.field6658 = var9 * var13 + var10 * var12 >> 14;
        this.field6665 = var7 * var9 >> 14;
        this.field6664 = -arg0 * this.field6661 - this.field6657 * arg1 - this.field6668 * arg2 >> 14;
        this.field6660 = -arg0 * this.field6663 - this.field6659 * arg1 - this.field6658 * arg2 >> 14;
        this.field6662 = -arg0 * this.field6667 - this.field6666 * arg1 - this.field6665 * arg2 >> 14;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
    public class496() {
        this.method580();
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "()Lq;")
    public final class397 method587() {
        class496 var1 = new class496();
        var1.field6661 = this.field6661;
        var1.field6657 = this.field6657;
        var1.field6668 = this.field6668;
        var1.field6664 = this.field6664;
        var1.field6663 = this.field6663;
        var1.field6659 = this.field6659;
        var1.field6658 = this.field6658;
        var1.field6660 = this.field6660;
        var1.field6667 = this.field6667;
        var1.field6666 = this.field6666;
        var1.field6665 = this.field6665;
        var1.field6662 = this.field6662;
        return var1;
    }

    @OriginalMember(owner = "client!pt", name = "P", descriptor = "(I)V")
    public final void method570(int arg0) {
        int var2 = class126.field2105[arg0 & 0x3FFF];
        int var3 = class126.field2116[arg0 & 0x3FFF];
        int var4 = this.field6661;
        int var5 = this.field6657;
        int var6 = this.field6668;
        int var7 = this.field6664;
        this.field6661 = this.field6667 * var3 + var2 * var4 >> 14;
        this.field6667 = this.field6667 * var2 - var3 * var4 >> 14;
        this.field6657 = this.field6666 * var3 + var2 * var5 >> 14;
        this.field6666 = this.field6666 * var2 - var3 * var5 >> 14;
        this.field6668 = this.field6665 * var3 + var2 * var6 >> 14;
        this.field6665 = this.field6665 * var2 - var3 * var6 >> 14;
        this.field6664 = this.field6662 * var3 + var2 * var7 >> 14;
        this.field6662 = this.field6662 * var2 - var3 * var7 >> 14;
    }
}
