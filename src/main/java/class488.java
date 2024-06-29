import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class488 extends class151 {

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public int field6477;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public int field6478;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public int field6479;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public int field6480;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public int field6481;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public int field6482;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public int field6483;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public int field6484;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    public int field6485;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "I")
    public int field6486;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    public int field6487;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    public int field6488;

    @OriginalMember(owner = "client!su", name = "O", descriptor = "([I)V")
    public final void method132(int[] arg0) {
        int var2 = arg0[0] - this.field6485;
        int var3 = arg0[1] - this.field6483;
        int var4 = arg0[2] - this.field6487;
        arg0[0] = this.field6477 * var4 + this.field6486 * var3 + this.field6478 * var2 >> 14;
        arg0[1] = this.field6479 * var4 + this.field6488 * var3 + this.field6482 * var2 >> 14;
        arg0[2] = this.field6481 * var4 + this.field6484 * var2 + this.field6480 * var3 >> 14;
    }

    @OriginalMember(owner = "client!su", name = "S", descriptor = "(I)V")
    public final void method135(int arg0) {
        int var2 = class237.field3196[arg0 & 0x3FFF];
        int var3 = class237.field3193[arg0 & 0x3FFF];
        int var4 = this.field6486;
        int var5 = this.field6488;
        int var6 = this.field6480;
        int var7 = this.field6483;
        this.field6486 = var2 * var4 - this.field6477 * var3 >> 14;
        this.field6477 = this.field6477 * var2 + var3 * var4 >> 14;
        this.field6488 = var2 * var5 - this.field6479 * var3 >> 14;
        this.field6479 = this.field6479 * var2 + var3 * var5 >> 14;
        this.field6480 = var2 * var6 - this.field6481 * var3 >> 14;
        this.field6481 = this.field6481 * var2 + var3 * var6 >> 14;
        this.field6483 = var2 * var7 - this.field6487 * var3 >> 14;
        this.field6487 = this.field6487 * var2 + var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!su", name = "G", descriptor = "(III)V")
    public final void method143(int arg0, int arg1, int arg2) {
        this.field6485 += arg0;
        this.field6483 += arg1;
        this.field6487 += arg2;
    }

    @OriginalMember(owner = "client!su", name = "R", descriptor = "(III[I)V")
    public final void method134(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field6484 * arg2 + this.field6482 * arg1 + this.field6478 * arg0 >> 14;
        arg3[1] = this.field6480 * arg2 + this.field6488 * arg1 + this.field6486 * arg0 >> 14;
        arg3[2] = this.field6481 * arg2 + this.field6479 * arg1 + this.field6477 * arg0 >> 14;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public final void method138(int arg0) {
        this.field6488 = 16384;
        this.field6478 = this.field6481 = class237.field3196[arg0 & 0x3FFF];
        this.field6484 = class237.field3193[arg0 & 0x3FFF];
        this.field6477 = -this.field6484;
        this.field6482 = this.field6485 = this.field6486 = this.field6480 = this.field6483 = this.field6479 = this.field6487 = 0;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "()Lq;")
    public final class151 method131() {
        class488 var1 = new class488();
        var1.field6478 = this.field6478;
        var1.field6482 = this.field6482;
        var1.field6484 = this.field6484;
        var1.field6485 = this.field6485;
        var1.field6486 = this.field6486;
        var1.field6488 = this.field6488;
        var1.field6480 = this.field6480;
        var1.field6483 = this.field6483;
        var1.field6477 = this.field6477;
        var1.field6479 = this.field6479;
        var1.field6481 = this.field6481;
        var1.field6487 = this.field6487;
        return var1;
    }

    @OriginalMember(owner = "client!su", name = "Y", descriptor = "()V")
    public final void method137() {
        this.field6486 = this.field6477 = this.field6482 = this.field6479 = this.field6484 = this.field6480 = this.field6485 = this.field6483 = this.field6487 = 0;
        this.field6478 = this.field6488 = this.field6481 = 16384;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(III[I)V")
    public final void method145(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field6484 * arg2 + this.field6482 * arg1 + this.field6478 * arg0 >> 14) + this.field6485;
        arg3[1] = (this.field6480 * arg2 + this.field6488 * arg1 + this.field6486 * arg0 >> 14) + this.field6483;
        arg3[2] = (this.field6481 * arg2 + this.field6479 * arg1 + this.field6477 * arg0 >> 14) + this.field6487;
    }

    @OriginalMember(owner = "client!su", name = "GA", descriptor = "(III)V")
    public final void method146(int arg0, int arg1, int arg2) {
        this.field6486 = this.field6477 = this.field6482 = this.field6479 = this.field6484 = this.field6480 = 0;
        this.field6478 = this.field6488 = this.field6481 = 16384;
        this.field6485 = arg0;
        this.field6483 = arg1;
        this.field6487 = arg2;
    }

    @OriginalMember(owner = "client!su", name = "ra", descriptor = "(I)V")
    public final void method149(int arg0) {
        this.field6481 = 16384;
        this.field6478 = this.field6488 = class237.field3196[arg0 & 0x3FFF];
        this.field6486 = class237.field3193[arg0 & 0x3FFF];
        this.field6482 = -this.field6486;
        this.field6484 = this.field6485 = this.field6480 = this.field6483 = this.field6477 = this.field6479 = this.field6487 = 0;
    }

    @OriginalMember(owner = "client!su", name = "XA", descriptor = "(I)V")
    public final void method147(int arg0) {
        this.field6478 = 16384;
        this.field6488 = this.field6481 = class237.field3196[arg0 & 0x3FFF];
        this.field6479 = class237.field3193[arg0 & 0x3FFF];
        this.field6480 = -this.field6479;
        this.field6482 = this.field6484 = this.field6485 = this.field6486 = this.field6483 = this.field6477 = this.field6487 = 0;
    }

    @OriginalMember(owner = "client!su", name = "pa", descriptor = "(IIIIII)V")
    public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class237.field3196[arg3 & 0x3FFF];
        int var8 = class237.field3193[arg3 & 0x3FFF];
        int var9 = class237.field3196[arg4 & 0x3FFF];
        int var10 = class237.field3193[arg4 & 0x3FFF];
        int var11 = class237.field3196[arg5 & 0x3FFF];
        int var12 = class237.field3193[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 14;
        int var14 = var8 * var12 >> 14;
        this.field6478 = var9 * var11 + var10 * var14 >> 14;
        this.field6486 = -var9 * var12 + var10 * var13 >> 14;
        this.field6477 = var7 * var10 >> 14;
        this.field6482 = var7 * var12 >> 14;
        this.field6488 = var7 * var11 >> 14;
        this.field6479 = -var8;
        this.field6484 = -var10 * var11 + var9 * var14 >> 14;
        this.field6480 = var9 * var13 + var10 * var12 >> 14;
        this.field6481 = var7 * var9 >> 14;
        this.field6485 = -arg0 * this.field6478 - this.field6482 * arg1 - this.field6484 * arg2 >> 14;
        this.field6483 = -arg0 * this.field6486 - this.field6488 * arg1 - this.field6480 * arg2 >> 14;
        this.field6487 = -arg0 * this.field6477 - this.field6479 * arg1 - this.field6481 * arg2 >> 14;
    }

    @OriginalMember(owner = "client!su", name = "P", descriptor = "(I)V")
    public final void method136(int arg0) {
        int var2 = class237.field3196[arg0 & 0x3FFF];
        int var3 = class237.field3193[arg0 & 0x3FFF];
        int var4 = this.field6478;
        int var5 = this.field6482;
        int var6 = this.field6484;
        int var7 = this.field6485;
        this.field6478 = this.field6477 * var3 + var2 * var4 >> 14;
        this.field6477 = this.field6477 * var2 - var3 * var4 >> 14;
        this.field6482 = this.field6479 * var3 + var2 * var5 >> 14;
        this.field6479 = this.field6479 * var2 - var3 * var5 >> 14;
        this.field6484 = this.field6481 * var3 + var2 * var6 >> 14;
        this.field6481 = this.field6481 * var2 - var3 * var6 >> 14;
        this.field6485 = this.field6487 * var3 + var2 * var7 >> 14;
        this.field6487 = this.field6487 * var2 - var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!su", name = "la", descriptor = "(Lq;)V")
    public final void method133(class151 arg0) {
        class488 var2 = (class488) arg0;
        this.field6478 = var2.field6478;
        this.field6482 = var2.field6482;
        this.field6484 = var2.field6484;
        this.field6485 = var2.field6485;
        this.field6486 = var2.field6486;
        this.field6488 = var2.field6488;
        this.field6480 = var2.field6480;
        this.field6483 = var2.field6483;
        this.field6477 = var2.field6477;
        this.field6479 = var2.field6479;
        this.field6481 = var2.field6481;
        this.field6487 = var2.field6487;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
    public class488() {
        this.method137();
    }
}
