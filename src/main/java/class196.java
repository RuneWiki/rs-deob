import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class196 extends class156 {

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public int field2800;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
    public final void method313(int arg0) {
        int var2 = class174.field2564[arg0 & 0x3FFF];
        int var3 = class174.field2572[arg0 & 0x3FFF];
        int var4 = this.field2801;
        int var5 = this.field2799;
        int var6 = this.field2807;
        int var7 = this.field2798;
        this.field2801 = var2 * var4 - this.field2796 * var3 >> 15;
        this.field2796 = this.field2796 * var2 + var3 * var4 >> 15;
        this.field2799 = var2 * var5 - this.field2803 * var3 >> 15;
        this.field2803 = this.field2803 * var2 + var3 * var5 >> 15;
        this.field2807 = var2 * var6 - this.field2805 * var3 >> 15;
        this.field2805 = this.field2805 * var2 + var3 * var6 >> 15;
        this.field2798 = var2 * var7 - this.field2797 * var3 >> 15;
        this.field2797 = this.field2797 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V")
    public final void method308(int arg0, int arg1, int arg2) {
        this.field2801 = this.field2796 = this.field2802 = this.field2803 = this.field2800 = this.field2807 = 0;
        this.field2806 = this.field2799 = this.field2805 = 32768;
        this.field2804 = arg0;
        this.field2798 = arg1;
        this.field2797 = arg2;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
    public final void method311() {
        this.field2801 = this.field2796 = this.field2802 = this.field2803 = this.field2800 = this.field2807 = this.field2804 = this.field2798 = this.field2797 = 0;
        this.field2806 = this.field2799 = this.field2805 = 32768;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)V")
    public final void method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class174.field2564[arg3 & 0x3FFF];
        int var8 = class174.field2572[arg3 & 0x3FFF];
        int var9 = class174.field2564[arg4 & 0x3FFF];
        int var10 = class174.field2572[arg4 & 0x3FFF];
        int var11 = class174.field2564[arg5 & 0x3FFF];
        int var12 = class174.field2572[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field2806 = var9 * var11 + var10 * var14 >> 15;
        this.field2801 = -var9 * var12 + var10 * var13 >> 15;
        this.field2796 = var7 * var10 >> 15;
        this.field2802 = var7 * var12 >> 15;
        this.field2799 = var7 * var11 >> 15;
        this.field2803 = -var8;
        this.field2800 = -var10 * var11 + var9 * var14 >> 15;
        this.field2807 = var9 * var13 + var10 * var12 >> 15;
        this.field2805 = var7 * var9 >> 15;
        this.field2804 = -arg0 * this.field2806 - this.field2802 * arg1 - this.field2800 * arg2 >> 15;
        this.field2798 = -arg0 * this.field2801 - this.field2799 * arg1 - this.field2807 * arg2 >> 15;
        this.field2797 = -arg0 * this.field2796 - this.field2803 * arg1 - this.field2805 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[I)V")
    public final void method315(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field2800 * arg2 + this.field2806 * arg0 + this.field2802 * arg1 >> 15) + this.field2804;
        arg3[1] = (this.field2807 * arg2 + this.field2801 * arg0 + this.field2799 * arg1 >> 15) + this.field2798;
        arg3[2] = (this.field2805 * arg2 + this.field2803 * arg1 + this.field2796 * arg0 >> 15) + this.field2797;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lmk;)V")
    public final void method316(class156 arg0) {
        class196 var2 = (class196) arg0;
        this.field2806 = var2.field2806;
        this.field2802 = var2.field2802;
        this.field2800 = var2.field2800;
        this.field2804 = var2.field2804;
        this.field2801 = var2.field2801;
        this.field2799 = var2.field2799;
        this.field2807 = var2.field2807;
        this.field2798 = var2.field2798;
        this.field2796 = var2.field2796;
        this.field2803 = var2.field2803;
        this.field2805 = var2.field2805;
        this.field2797 = var2.field2797;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
    public final void method320(int arg0) {
        int var2 = class174.field2564[arg0 & 0x3FFF];
        int var3 = class174.field2572[arg0 & 0x3FFF];
        int var4 = this.field2806;
        int var5 = this.field2802;
        int var6 = this.field2800;
        int var7 = this.field2804;
        this.field2806 = this.field2796 * var3 + var2 * var4 >> 15;
        this.field2796 = this.field2796 * var2 - var3 * var4 >> 15;
        this.field2802 = this.field2803 * var3 + var2 * var5 >> 15;
        this.field2803 = this.field2803 * var2 - var3 * var5 >> 15;
        this.field2800 = this.field2805 * var3 + var2 * var6 >> 15;
        this.field2805 = this.field2805 * var2 - var3 * var6 >> 15;
        this.field2804 = this.field2797 * var3 + var2 * var7 >> 15;
        this.field2797 = this.field2797 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public final void method312(int arg0) {
        this.field2799 = 32768;
        this.field2806 = this.field2805 = class174.field2564[arg0 & 0x3FFF];
        this.field2800 = class174.field2572[arg0 & 0x3FFF];
        this.field2796 = -this.field2800;
        this.field2802 = this.field2804 = this.field2801 = this.field2807 = this.field2798 = this.field2803 = this.field2797 = 0;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()Lfd;")
    public final class196 method1397() {
        class196 var1 = new class196();
        var1.field2806 = this.field2806;
        var1.field2802 = this.field2802;
        var1.field2800 = this.field2800;
        var1.field2804 = this.field2804;
        var1.field2801 = this.field2801;
        var1.field2799 = this.field2799;
        var1.field2807 = this.field2807;
        var1.field2798 = this.field2798;
        var1.field2796 = this.field2796;
        var1.field2803 = this.field2803;
        var1.field2805 = this.field2805;
        var1.field2797 = this.field2797;
        return var1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
    public final void method319(int arg0, int arg1, int arg2) {
        this.field2804 += arg0;
        this.field2798 += arg1;
        this.field2797 += arg2;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class196() {
        this.method311();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([I)V")
    public final void method306(int[] arg0) {
        int var2 = arg0[0] - this.field2804;
        int var3 = arg0[1] - this.field2798;
        int var4 = arg0[2] - this.field2797;
        arg0[0] = this.field2796 * var4 + this.field2806 * var2 + this.field2801 * var3 >> 15;
        arg0[1] = this.field2803 * var4 + this.field2802 * var2 + this.field2799 * var3 >> 15;
        arg0[2] = this.field2805 * var4 + this.field2807 * var3 + this.field2800 * var2 >> 15;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    public final void method318(int arg0) {
        this.field2806 = 32768;
        this.field2799 = this.field2805 = class174.field2564[arg0 & 0x3FFF];
        this.field2803 = class174.field2572[arg0 & 0x3FFF];
        this.field2807 = -this.field2803;
        this.field2802 = this.field2800 = this.field2804 = this.field2801 = this.field2798 = this.field2796 = this.field2797 = 0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public final void method305(int arg0) {
        this.field2805 = 32768;
        this.field2806 = this.field2799 = class174.field2564[arg0 & 0x3FFF];
        this.field2801 = class174.field2572[arg0 & 0x3FFF];
        this.field2802 = -this.field2801;
        this.field2800 = this.field2804 = this.field2807 = this.field2798 = this.field2796 = this.field2803 = this.field2797 = 0;
    }
}
