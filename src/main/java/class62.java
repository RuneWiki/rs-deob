import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class62 extends class315 {

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V", line = 4)
    public final void method477(int arg0) {
        int var2 = class172.field2456[arg0 & 0x3FFF];
        int var3 = class172.field2450[arg0 & 0x3FFF];
        int var4 = this.field848;
        int var5 = this.field855;
        int var6 = this.field852;
        int var7 = this.field856;
        this.field848 = var2 * var4 - this.field851 * var3 >> 15;
        this.field851 = this.field851 * var2 + var3 * var4 >> 15;
        this.field855 = var2 * var5 - this.field847 * var3 >> 15;
        this.field847 = this.field847 * var2 + var3 * var5 >> 15;
        this.field852 = var2 * var6 - this.field846 * var3 >> 15;
        this.field846 = this.field846 * var2 + var3 * var6 >> 15;
        this.field856 = var2 * var7 - this.field853 * var3 >> 15;
        this.field853 = this.field853 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V", line = 28)
    public final void method478(int arg0, int arg1, int arg2) {
        this.field845 += arg0;
        this.field856 += arg1;
        this.field853 += arg2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([I)V", line = 35)
    public final void method479(int[] arg0) {
        int var2 = arg0[0] - this.field845;
        int var3 = arg0[1] - this.field856;
        int var4 = arg0[2] - this.field853;
        arg0[0] = this.field851 * var4 + this.field850 * var2 + this.field848 * var3 >> 15;
        arg0[1] = this.field847 * var4 + this.field855 * var3 + this.field854 * var2 >> 15;
        arg0[2] = this.field846 * var4 + this.field852 * var3 + this.field849 * var2 >> 15;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()Lk;", line = 47)
    public final class62 method480() {
        class62 var1 = new class62();
        var1.field850 = this.field850;
        var1.field854 = this.field854;
        var1.field849 = this.field849;
        var1.field845 = this.field845;
        var1.field848 = this.field848;
        var1.field855 = this.field855;
        var1.field852 = this.field852;
        var1.field856 = this.field856;
        var1.field851 = this.field851;
        var1.field847 = this.field847;
        var1.field846 = this.field846;
        var1.field853 = this.field853;
        return var1;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 63)
    public final void method481(int arg0) {
        this.field850 = 32768;
        this.field855 = this.field846 = class172.field2456[arg0 & 0x3FFF];
        this.field847 = class172.field2450[arg0 & 0x3FFF];
        this.field852 = -this.field847;
        this.field854 = this.field849 = this.field845 = this.field848 = this.field856 = this.field851 = this.field853 = 0;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(III)V", line = 70)
    public final void method482(int arg0, int arg1, int arg2) {
        this.field848 = this.field851 = this.field854 = this.field847 = this.field849 = this.field852 = 0;
        this.field850 = this.field855 = this.field846 = 32768;
        this.field845 = arg0;
        this.field856 = arg1;
        this.field853 = arg2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III[I)V", line = 79)
    public final void method483(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field849 * arg2 + this.field854 * arg1 + this.field850 * arg0 >> 15) + this.field845;
        arg3[1] = (this.field852 * arg2 + this.field855 * arg1 + this.field848 * arg0 >> 15) + this.field856;
        arg3[2] = (this.field846 * arg2 + this.field851 * arg0 + this.field847 * arg1 >> 15) + this.field853;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIII)V", line = 86)
    public final void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class172.field2456[arg3 & 0x3FFF];
        int var8 = class172.field2450[arg3 & 0x3FFF];
        int var9 = class172.field2456[arg4 & 0x3FFF];
        int var10 = class172.field2450[arg4 & 0x3FFF];
        int var11 = class172.field2456[arg5 & 0x3FFF];
        int var12 = class172.field2450[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field850 = var9 * var11 + var10 * var14 >> 15;
        this.field848 = -var9 * var12 + var10 * var13 >> 15;
        this.field851 = var7 * var10 >> 15;
        this.field854 = var7 * var12 >> 15;
        this.field855 = var7 * var11 >> 15;
        this.field847 = -var8;
        this.field849 = -var10 * var11 + var9 * var14 >> 15;
        this.field852 = var9 * var13 + var10 * var12 >> 15;
        this.field846 = var7 * var9 >> 15;
        this.field845 = -arg0 * this.field850 - this.field854 * arg1 - this.field849 * arg2 >> 15;
        this.field856 = -arg0 * this.field848 - this.field855 * arg1 - this.field852 * arg2 >> 15;
        this.field853 = -arg0 * this.field851 - this.field847 * arg1 - this.field846 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V", line = 116)
    public final void method485(int arg0) {
        this.field846 = 32768;
        this.field850 = this.field855 = class172.field2456[arg0 & 0x3FFF];
        this.field848 = class172.field2450[arg0 & 0x3FFF];
        this.field854 = -this.field848;
        this.field849 = this.field845 = this.field852 = this.field856 = this.field851 = this.field847 = this.field853 = 0;
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V", line = 123)
    public final void method486(int arg0) {
        this.field855 = 32768;
        this.field850 = this.field846 = class172.field2456[arg0 & 0x3FFF];
        this.field849 = class172.field2450[arg0 & 0x3FFF];
        this.field851 = -this.field849;
        this.field854 = this.field845 = this.field848 = this.field852 = this.field856 = this.field847 = this.field853 = 0;
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V", line = 131)
    public final void method487(int arg0) {
        int var2 = class172.field2456[arg0 & 0x3FFF];
        int var3 = class172.field2450[arg0 & 0x3FFF];
        int var4 = this.field850;
        int var5 = this.field854;
        int var6 = this.field849;
        int var7 = this.field845;
        this.field850 = this.field851 * var3 + var2 * var4 >> 15;
        this.field851 = this.field851 * var2 - var3 * var4 >> 15;
        this.field854 = this.field847 * var3 + var2 * var5 >> 15;
        this.field847 = this.field847 * var2 - var3 * var5 >> 15;
        this.field849 = this.field846 * var3 + var2 * var6 >> 15;
        this.field846 = this.field846 * var2 - var3 * var6 >> 15;
        this.field845 = this.field853 * var3 + var2 * var7 >> 15;
        this.field853 = this.field853 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V", line = 157)
    public final void method488() {
        this.field848 = this.field851 = this.field854 = this.field847 = this.field849 = this.field852 = this.field845 = this.field856 = this.field853 = 0;
        this.field850 = this.field855 = this.field846 = 32768;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lmu;)V", line = 162)
    public final void method489(class315 arg0) {
        class62 var2 = (class62) arg0;
        this.field850 = var2.field850;
        this.field854 = var2.field854;
        this.field849 = var2.field849;
        this.field845 = var2.field845;
        this.field848 = var2.field848;
        this.field855 = var2.field855;
        this.field852 = var2.field852;
        this.field856 = var2.field856;
        this.field851 = var2.field851;
        this.field847 = var2.field847;
        this.field846 = var2.field846;
        this.field853 = var2.field853;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V", line = 177)
    public class62() {
        this.method488();
    }
}
