import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class538 extends class396 {

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public int field6780;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public int field6781;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public int field6782;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public int field6783;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public int field6784;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public int field6785;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public int field6786;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public int field6787;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public int field6788;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public int field6789;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
    public int field6790;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
    public int field6791;

    @OriginalMember(owner = "client!cr", name = "GA", descriptor = "(III)V", line = 4)
    public final void method591(int arg0, int arg1, int arg2) {
        this.field6783 = this.field6788 = this.field6785 = this.field6784 = this.field6786 = this.field6782 = 0;
        this.field6780 = this.field6791 = this.field6787 = 16384;
        this.field6790 = arg0;
        this.field6781 = arg1;
        this.field6789 = arg2;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 11)
    public final void method580(int arg0) {
        this.field6791 = 16384;
        this.field6780 = this.field6787 = class243.field3128[arg0 & 0x3FFF];
        this.field6786 = class243.field3129[arg0 & 0x3FFF];
        this.field6788 = -this.field6786;
        this.field6785 = this.field6790 = this.field6783 = this.field6782 = this.field6781 = this.field6784 = this.field6789 = 0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III[I)V", line = 20)
    public final void method582(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field6786 * arg2 + this.field6785 * arg1 + this.field6780 * arg0 >> 14) + this.field6790;
        arg3[1] = (this.field6782 * arg2 + this.field6791 * arg1 + this.field6783 * arg0 >> 14) + this.field6781;
        arg3[2] = (this.field6787 * arg2 + this.field6788 * arg0 + this.field6784 * arg1 >> 14) + this.field6789;
    }

    @OriginalMember(owner = "client!cr", name = "O", descriptor = "([I)V", line = 28)
    public final void method578(int[] arg0) {
        int var2 = arg0[0] - this.field6790;
        int var3 = arg0[1] - this.field6781;
        int var4 = arg0[2] - this.field6789;
        arg0[0] = this.field6788 * var4 + this.field6783 * var3 + this.field6780 * var2 >> 14;
        arg0[1] = this.field6784 * var4 + this.field6791 * var3 + this.field6785 * var2 >> 14;
        arg0[2] = this.field6787 * var4 + this.field6786 * var2 + this.field6782 * var3 >> 14;
    }

    @OriginalMember(owner = "client!cr", name = "la", descriptor = "(Lq;)V", line = 41)
    public final void method583(class396 arg0) {
        class538 var2 = (class538) arg0;
        this.field6780 = var2.field6780;
        this.field6785 = var2.field6785;
        this.field6786 = var2.field6786;
        this.field6790 = var2.field6790;
        this.field6783 = var2.field6783;
        this.field6791 = var2.field6791;
        this.field6782 = var2.field6782;
        this.field6781 = var2.field6781;
        this.field6788 = var2.field6788;
        this.field6784 = var2.field6784;
        this.field6787 = var2.field6787;
        this.field6789 = var2.field6789;
    }

    @OriginalMember(owner = "client!cr", name = "pa", descriptor = "(IIIIII)V", line = 58)
    public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class243.field3128[arg3 & 0x3FFF];
        int var8 = class243.field3129[arg3 & 0x3FFF];
        int var9 = class243.field3128[arg4 & 0x3FFF];
        int var10 = class243.field3129[arg4 & 0x3FFF];
        int var11 = class243.field3128[arg5 & 0x3FFF];
        int var12 = class243.field3129[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 14;
        int var14 = var8 * var12 >> 14;
        this.field6780 = var9 * var11 + var10 * var14 >> 14;
        this.field6783 = -var9 * var12 + var10 * var13 >> 14;
        this.field6788 = var7 * var10 >> 14;
        this.field6785 = var7 * var12 >> 14;
        this.field6791 = var7 * var11 >> 14;
        this.field6784 = -var8;
        this.field6786 = -var10 * var11 + var9 * var14 >> 14;
        this.field6782 = var9 * var13 + var10 * var12 >> 14;
        this.field6787 = var7 * var9 >> 14;
        this.field6790 = -arg0 * this.field6780 - this.field6785 * arg1 - this.field6786 * arg2 >> 14;
        this.field6781 = -arg0 * this.field6783 - this.field6791 * arg1 - this.field6782 * arg2 >> 14;
        this.field6789 = -arg0 * this.field6788 - this.field6784 * arg1 - this.field6787 * arg2 >> 14;
    }

    @OriginalMember(owner = "client!cr", name = "Y", descriptor = "()V", line = 87)
    public final void method584() {
        this.field6783 = this.field6788 = this.field6785 = this.field6784 = this.field6786 = this.field6782 = this.field6790 = this.field6781 = this.field6789 = 0;
        this.field6780 = this.field6791 = this.field6787 = 16384;
    }

    @OriginalMember(owner = "client!cr", name = "P", descriptor = "(I)V", line = 92)
    public final void method589(int arg0) {
        int var2 = class243.field3128[arg0 & 0x3FFF];
        int var3 = class243.field3129[arg0 & 0x3FFF];
        int var4 = this.field6780;
        int var5 = this.field6785;
        int var6 = this.field6786;
        int var7 = this.field6790;
        this.field6780 = this.field6788 * var3 + var2 * var4 >> 14;
        this.field6788 = this.field6788 * var2 - var3 * var4 >> 14;
        this.field6785 = this.field6784 * var3 + var2 * var5 >> 14;
        this.field6784 = this.field6784 * var2 - var3 * var5 >> 14;
        this.field6786 = this.field6787 * var3 + var2 * var6 >> 14;
        this.field6787 = this.field6787 * var2 - var3 * var6 >> 14;
        this.field6790 = this.field6789 * var3 + var2 * var7 >> 14;
        this.field6789 = this.field6789 * var2 - var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!cr", name = "S", descriptor = "(I)V", line = 114)
    public final void method579(int arg0) {
        int var2 = class243.field3128[arg0 & 0x3FFF];
        int var3 = class243.field3129[arg0 & 0x3FFF];
        int var4 = this.field6783;
        int var5 = this.field6791;
        int var6 = this.field6782;
        int var7 = this.field6781;
        this.field6783 = var2 * var4 - this.field6788 * var3 >> 14;
        this.field6788 = this.field6788 * var2 + var3 * var4 >> 14;
        this.field6791 = var2 * var5 - this.field6784 * var3 >> 14;
        this.field6784 = this.field6784 * var2 + var3 * var5 >> 14;
        this.field6782 = var2 * var6 - this.field6787 * var3 >> 14;
        this.field6787 = this.field6787 * var2 + var3 * var6 >> 14;
        this.field6781 = var2 * var7 - this.field6789 * var3 >> 14;
        this.field6789 = this.field6789 * var2 + var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "()Lq;", line = 138)
    public final class396 method576() {
        class538 var1 = new class538();
        var1.field6780 = this.field6780;
        var1.field6785 = this.field6785;
        var1.field6786 = this.field6786;
        var1.field6790 = this.field6790;
        var1.field6783 = this.field6783;
        var1.field6791 = this.field6791;
        var1.field6782 = this.field6782;
        var1.field6781 = this.field6781;
        var1.field6788 = this.field6788;
        var1.field6784 = this.field6784;
        var1.field6787 = this.field6787;
        var1.field6789 = this.field6789;
        return var1;
    }

    @OriginalMember(owner = "client!cr", name = "XA", descriptor = "(I)V", line = 157)
    public final void method573(int arg0) {
        this.field6780 = 16384;
        this.field6791 = this.field6787 = class243.field3128[arg0 & 0x3FFF];
        this.field6784 = class243.field3129[arg0 & 0x3FFF];
        this.field6782 = -this.field6784;
        this.field6785 = this.field6786 = this.field6790 = this.field6783 = this.field6781 = this.field6788 = this.field6789 = 0;
    }

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "(III)V", line = 165)
    public final void method588(int arg0, int arg1, int arg2) {
        this.field6790 += arg0;
        this.field6781 += arg1;
        this.field6789 += arg2;
    }

    @OriginalMember(owner = "client!cr", name = "ra", descriptor = "(I)V", line = 172)
    public final void method593(int arg0) {
        this.field6787 = 16384;
        this.field6780 = this.field6791 = class243.field3128[arg0 & 0x3FFF];
        this.field6783 = class243.field3129[arg0 & 0x3FFF];
        this.field6785 = -this.field6783;
        this.field6786 = this.field6790 = this.field6782 = this.field6781 = this.field6788 = this.field6784 = this.field6789 = 0;
    }

    @OriginalMember(owner = "client!cr", name = "R", descriptor = "(III[I)V", line = 179)
    public final void method574(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field6786 * arg2 + this.field6785 * arg1 + this.field6780 * arg0 >> 14;
        arg3[1] = this.field6782 * arg2 + this.field6791 * arg1 + this.field6783 * arg0 >> 14;
        arg3[2] = this.field6787 * arg2 + this.field6788 * arg0 + this.field6784 * arg1 >> 14;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V", line = 184)
    public class538() {
        this.method584();
    }
}
