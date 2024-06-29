import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class335 extends class202 {

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public int field4794;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public int field4796;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public int field4797;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public int field4798;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public int field4799;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public int field4800;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public int field4801;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public int field4802;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public int field4803;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public int field4804;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
    public final void method1532(int arg0) {
        this.field4805 = 32768;
        this.field4795 = this.field4800 = class56.field898[arg0 & 0x3FFF];
        this.field4801 = class56.field897[arg0 & 0x3FFF];
        this.field4802 = -this.field4801;
        this.field4799 = this.field4803 = this.field4796 = this.field4797 = this.field4798 = this.field4794 = this.field4804 = 0;
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V")
    public final void method1534(int arg0) {
        int var2 = class56.field898[arg0 & 0x3FFF];
        int var3 = class56.field897[arg0 & 0x3FFF];
        int var4 = this.field4795;
        int var5 = this.field4802;
        int var6 = this.field4799;
        int var7 = this.field4803;
        this.field4795 = this.field4798 * var3 + var2 * var4 >> 15;
        this.field4798 = this.field4798 * var2 - var3 * var4 >> 15;
        this.field4802 = this.field4794 * var3 + var2 * var5 >> 15;
        this.field4794 = this.field4794 * var2 - var3 * var5 >> 15;
        this.field4799 = this.field4805 * var3 + var2 * var6 >> 15;
        this.field4805 = this.field4805 * var2 - var3 * var6 >> 15;
        this.field4803 = this.field4804 * var3 + var2 * var7 >> 15;
        this.field4804 = this.field4804 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)V")
    public final void method1528(int arg0, int arg1, int arg2) {
        this.field4803 += arg0;
        this.field4797 += arg1;
        this.field4804 += arg2;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()V")
    public final void method1531() {
        this.field4801 = this.field4798 = this.field4802 = this.field4794 = this.field4799 = this.field4796 = this.field4803 = this.field4797 = this.field4804 = 0;
        this.field4795 = this.field4800 = this.field4805 = 32768;
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V")
    public final void method1542(int arg0) {
        int var2 = class56.field898[arg0 & 0x3FFF];
        int var3 = class56.field897[arg0 & 0x3FFF];
        int var4 = this.field4801;
        int var5 = this.field4800;
        int var6 = this.field4796;
        int var7 = this.field4797;
        this.field4801 = var2 * var4 - this.field4798 * var3 >> 15;
        this.field4798 = this.field4798 * var2 + var3 * var4 >> 15;
        this.field4800 = var2 * var5 - this.field4794 * var3 >> 15;
        this.field4794 = this.field4794 * var2 + var3 * var5 >> 15;
        this.field4796 = var2 * var6 - this.field4805 * var3 >> 15;
        this.field4805 = this.field4805 * var2 + var3 * var6 >> 15;
        this.field4797 = var2 * var7 - this.field4804 * var3 >> 15;
        this.field4804 = this.field4804 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public final void method1529(int arg0) {
        this.field4795 = 32768;
        this.field4800 = this.field4805 = class56.field898[arg0 & 0x3FFF];
        this.field4794 = class56.field897[arg0 & 0x3FFF];
        this.field4796 = -this.field4794;
        this.field4802 = this.field4799 = this.field4803 = this.field4801 = this.field4797 = this.field4798 = this.field4804 = 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
    public final void method1527(int arg0, int arg1, int arg2) {
        this.field4801 = this.field4798 = this.field4802 = this.field4794 = this.field4799 = this.field4796 = 0;
        this.field4795 = this.field4800 = this.field4805 = 32768;
        this.field4803 = arg0;
        this.field4797 = arg1;
        this.field4804 = arg2;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III[I)V")
    public final void method1535(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field4799 * arg2 + this.field4802 * arg1 + this.field4795 * arg0 >> 15) + this.field4803;
        arg3[1] = (this.field4796 * arg2 + this.field4801 * arg0 + this.field4800 * arg1 >> 15) + this.field4797;
        arg3[2] = (this.field4805 * arg2 + this.field4798 * arg0 + this.field4794 * arg1 >> 15) + this.field4804;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "()Lol;")
    public final class335 method2184() {
        class335 var1 = new class335();
        var1.field4795 = this.field4795;
        var1.field4802 = this.field4802;
        var1.field4799 = this.field4799;
        var1.field4803 = this.field4803;
        var1.field4801 = this.field4801;
        var1.field4800 = this.field4800;
        var1.field4796 = this.field4796;
        var1.field4797 = this.field4797;
        var1.field4798 = this.field4798;
        var1.field4794 = this.field4794;
        var1.field4805 = this.field4805;
        var1.field4804 = this.field4804;
        return var1;
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
    public final void method1541(int arg0) {
        this.field4800 = 32768;
        this.field4795 = this.field4805 = class56.field898[arg0 & 0x3FFF];
        this.field4799 = class56.field897[arg0 & 0x3FFF];
        this.field4798 = -this.field4799;
        this.field4802 = this.field4803 = this.field4801 = this.field4796 = this.field4797 = this.field4794 = this.field4804 = 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lpo;)V")
    public final void method1530(class202 arg0) {
        class335 var2 = (class335) arg0;
        this.field4795 = var2.field4795;
        this.field4802 = var2.field4802;
        this.field4799 = var2.field4799;
        this.field4803 = var2.field4803;
        this.field4801 = var2.field4801;
        this.field4800 = var2.field4800;
        this.field4796 = var2.field4796;
        this.field4797 = var2.field4797;
        this.field4798 = var2.field4798;
        this.field4794 = var2.field4794;
        this.field4805 = var2.field4805;
        this.field4804 = var2.field4804;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([I)V")
    public final void method1539(int[] arg0) {
        int var2 = arg0[0] - this.field4803;
        int var3 = arg0[1] - this.field4797;
        int var4 = arg0[2] - this.field4804;
        arg0[0] = this.field4798 * var4 + this.field4801 * var3 + this.field4795 * var2 >> 15;
        arg0[1] = this.field4794 * var4 + this.field4802 * var2 + this.field4800 * var3 >> 15;
        arg0[2] = this.field4805 * var4 + this.field4799 * var2 + this.field4796 * var3 >> 15;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIII)V")
    public final void method1537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class56.field898[arg3 & 0x3FFF];
        int var8 = class56.field897[arg3 & 0x3FFF];
        int var9 = class56.field898[arg4 & 0x3FFF];
        int var10 = class56.field897[arg4 & 0x3FFF];
        int var11 = class56.field898[arg5 & 0x3FFF];
        int var12 = class56.field897[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field4795 = var9 * var11 + var10 * var14 >> 15;
        this.field4801 = -var9 * var12 + var10 * var13 >> 15;
        this.field4798 = var7 * var10 >> 15;
        this.field4802 = var7 * var12 >> 15;
        this.field4800 = var7 * var11 >> 15;
        this.field4794 = -var8;
        this.field4799 = -var10 * var11 + var9 * var14 >> 15;
        this.field4796 = var9 * var13 + var10 * var12 >> 15;
        this.field4805 = var7 * var9 >> 15;
        this.field4803 = -arg0 * this.field4795 - this.field4802 * arg1 - this.field4799 * arg2 >> 15;
        this.field4797 = -arg0 * this.field4801 - this.field4800 * arg1 - this.field4796 * arg2 >> 15;
        this.field4804 = -arg0 * this.field4798 - this.field4794 * arg1 - this.field4805 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class335() {
        this.method1531();
    }
}
