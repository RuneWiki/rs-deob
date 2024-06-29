import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class394 extends class122 {

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public int field5772;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    public int field5773;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public int field5774;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public int field5775;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public int field5776;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public int field5777;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public int field5778;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    public int field5779;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
    public int field5780;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
    public int field5781;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
    public int field5782;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public int field5783;

    @OriginalMember(owner = "client!pu", name = "ja", descriptor = "(I)V", line = 4)
    public final void method181(int arg0) {
        int var2 = class183.field2678[arg0 & 0x3FFF];
        int var3 = class183.field2684[arg0 & 0x3FFF];
        int var4 = this.field5773;
        int var5 = this.field5776;
        int var6 = this.field5781;
        int var7 = this.field5777;
        this.field5773 = this.field5783 * var3 + var2 * var4 >> 15;
        this.field5783 = this.field5783 * var2 - var3 * var4 >> 15;
        this.field5776 = this.field5780 * var3 + var2 * var5 >> 15;
        this.field5780 = this.field5780 * var2 - var3 * var5 >> 15;
        this.field5781 = this.field5774 * var3 + var2 * var6 >> 15;
        this.field5774 = this.field5774 * var2 - var3 * var6 >> 15;
        this.field5777 = this.field5775 * var3 + var2 * var7 >> 15;
        this.field5775 = this.field5775 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III[I)V", line = 27)
    public final void method178(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field5781 * arg2 + this.field5776 * arg1 + this.field5773 * arg0 >> 15) + this.field5777;
        arg3[1] = (this.field5782 * arg2 + this.field5778 * arg0 + this.field5772 * arg1 >> 15) + this.field5779;
        arg3[2] = (this.field5774 * arg2 + this.field5783 * arg0 + this.field5780 * arg1 >> 15) + this.field5775;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "()Lc;", line = 33)
    public final class122 method189() {
        class394 var1 = new class394();
        var1.field5773 = this.field5773;
        var1.field5776 = this.field5776;
        var1.field5781 = this.field5781;
        var1.field5777 = this.field5777;
        var1.field5778 = this.field5778;
        var1.field5772 = this.field5772;
        var1.field5782 = this.field5782;
        var1.field5779 = this.field5779;
        var1.field5783 = this.field5783;
        var1.field5780 = this.field5780;
        var1.field5774 = this.field5774;
        var1.field5775 = this.field5775;
        return var1;
    }

    @OriginalMember(owner = "client!pu", name = "ra", descriptor = "(I)V", line = 51)
    public final void method191(int arg0) {
        this.field5772 = 32768;
        this.field5773 = this.field5774 = class183.field2678[arg0 & 0x3FFF];
        this.field5781 = class183.field2684[arg0 & 0x3FFF];
        this.field5783 = -this.field5781;
        this.field5776 = this.field5777 = this.field5778 = this.field5782 = this.field5779 = this.field5780 = this.field5775 = 0;
    }

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "(IIIIII)V", line = 59)
    public final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class183.field2678[arg3 & 0x3FFF];
        int var8 = class183.field2684[arg3 & 0x3FFF];
        int var9 = class183.field2678[arg4 & 0x3FFF];
        int var10 = class183.field2684[arg4 & 0x3FFF];
        int var11 = class183.field2678[arg5 & 0x3FFF];
        int var12 = class183.field2684[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field5773 = var9 * var11 + var10 * var14 >> 15;
        this.field5778 = -var9 * var12 + var10 * var13 >> 15;
        this.field5783 = var7 * var10 >> 15;
        this.field5776 = var7 * var12 >> 15;
        this.field5772 = var7 * var11 >> 15;
        this.field5780 = -var8;
        this.field5781 = -var10 * var11 + var9 * var14 >> 15;
        this.field5782 = var9 * var13 + var10 * var12 >> 15;
        this.field5774 = var7 * var9 >> 15;
        this.field5777 = -arg0 * this.field5773 - this.field5776 * arg1 - this.field5781 * arg2 >> 15;
        this.field5779 = -arg0 * this.field5778 - this.field5772 * arg1 - this.field5782 * arg2 >> 15;
        this.field5775 = -arg0 * this.field5783 - this.field5780 * arg1 - this.field5774 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!pu", name = "ka", descriptor = "(I)V", line = 91)
    public final void method187(int arg0) {
        int var2 = class183.field2678[arg0 & 0x3FFF];
        int var3 = class183.field2684[arg0 & 0x3FFF];
        int var4 = this.field5778;
        int var5 = this.field5772;
        int var6 = this.field5782;
        int var7 = this.field5779;
        this.field5778 = var2 * var4 - this.field5783 * var3 >> 15;
        this.field5783 = this.field5783 * var2 + var3 * var4 >> 15;
        this.field5772 = var2 * var5 - this.field5780 * var3 >> 15;
        this.field5780 = this.field5780 * var2 + var3 * var5 >> 15;
        this.field5782 = var2 * var6 - this.field5774 * var3 >> 15;
        this.field5774 = this.field5774 * var2 + var3 * var6 >> 15;
        this.field5779 = var2 * var7 - this.field5775 * var3 >> 15;
        this.field5775 = this.field5775 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "([I)V", line = 116)
    public final void method184(int[] arg0) {
        int var2 = arg0[0] - this.field5777;
        int var3 = arg0[1] - this.field5779;
        int var4 = arg0[2] - this.field5775;
        arg0[0] = this.field5783 * var4 + this.field5778 * var3 + this.field5773 * var2 >> 15;
        arg0[1] = this.field5780 * var4 + this.field5776 * var2 + this.field5772 * var3 >> 15;
        arg0[2] = this.field5774 * var4 + this.field5782 * var3 + this.field5781 * var2 >> 15;
    }

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "(III)V", line = 126)
    public final void method188(int arg0, int arg1, int arg2) {
        this.field5777 += arg0;
        this.field5779 += arg1;
        this.field5775 += arg2;
    }

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "(III)V", line = 132)
    public final void method182(int arg0, int arg1, int arg2) {
        this.field5778 = this.field5783 = this.field5776 = this.field5780 = this.field5781 = this.field5782 = 0;
        this.field5773 = this.field5772 = this.field5774 = 32768;
        this.field5777 = arg0;
        this.field5779 = arg1;
        this.field5775 = arg2;
    }

    @OriginalMember(owner = "client!pu", name = "O", descriptor = "(I)V", line = 140)
    public final void method193(int arg0) {
        this.field5774 = 32768;
        this.field5773 = this.field5772 = class183.field2678[arg0 & 0x3FFF];
        this.field5778 = class183.field2684[arg0 & 0x3FFF];
        this.field5776 = -this.field5778;
        this.field5781 = this.field5777 = this.field5782 = this.field5779 = this.field5783 = this.field5780 = this.field5775 = 0;
    }

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "(III[I)V", line = 147)
    public final void method185(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field5781 * arg2 + this.field5776 * arg1 + this.field5773 * arg0 >> 15;
        arg3[1] = this.field5782 * arg2 + this.field5778 * arg0 + this.field5772 * arg1 >> 15;
        arg3[2] = this.field5774 * arg2 + this.field5783 * arg0 + this.field5780 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!pu", name = "N", descriptor = "(I)V", line = 152)
    public final void method183(int arg0) {
        this.field5773 = 32768;
        this.field5772 = this.field5774 = class183.field2678[arg0 & 0x3FFF];
        this.field5780 = class183.field2684[arg0 & 0x3FFF];
        this.field5782 = -this.field5780;
        this.field5776 = this.field5781 = this.field5777 = this.field5778 = this.field5779 = this.field5783 = this.field5775 = 0;
    }

    @OriginalMember(owner = "client!pu", name = "za", descriptor = "(Lc;)V", line = 162)
    public final void method192(class122 arg0) {
        class394 var2 = (class394) arg0;
        this.field5773 = var2.field5773;
        this.field5776 = var2.field5776;
        this.field5781 = var2.field5781;
        this.field5777 = var2.field5777;
        this.field5778 = var2.field5778;
        this.field5772 = var2.field5772;
        this.field5782 = var2.field5782;
        this.field5779 = var2.field5779;
        this.field5783 = var2.field5783;
        this.field5780 = var2.field5780;
        this.field5774 = var2.field5774;
        this.field5775 = var2.field5775;
    }

    @OriginalMember(owner = "client!pu", name = "xa", descriptor = "()V", line = 177)
    public final void method179() {
        this.field5778 = this.field5783 = this.field5776 = this.field5780 = this.field5781 = this.field5782 = this.field5777 = this.field5779 = this.field5775 = 0;
        this.field5773 = this.field5772 = this.field5774 = 32768;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V", line = 182)
    public class394() {
        this.method179();
    }
}
