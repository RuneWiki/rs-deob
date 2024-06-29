import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class62 extends class105 {

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!jaa", name = "l", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!jaa", name = "n", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!jaa", name = "ha", descriptor = "()V")
    public final void method354() {
        this.field853 = this.field854 = this.field855 = this.field859 = this.field851 = this.field857 = this.field849 = this.field858 = this.field850 = 0;
        this.field856 = this.field852 = this.field848 = 16384;
    }

    @OriginalMember(owner = "client!jaa", name = "ta", descriptor = "(I)V")
    public final void method355(int arg0) {
        this.field848 = 16384;
        this.field856 = this.field852 = class310.field3965[arg0 & 0x3FFF];
        this.field853 = class310.field3966[arg0 & 0x3FFF];
        this.field855 = -this.field853;
        this.field851 = this.field849 = this.field857 = this.field858 = this.field854 = this.field859 = this.field850 = 0;
    }

    @OriginalMember(owner = "client!jaa", name = "XA", descriptor = "(I)V")
    public final void method356(int arg0) {
        int var2 = class310.field3965[arg0 & 0x3FFF];
        int var3 = class310.field3966[arg0 & 0x3FFF];
        int var4 = this.field856;
        int var5 = this.field855;
        int var6 = this.field851;
        int var7 = this.field849;
        this.field856 = this.field854 * var3 + var2 * var4 >> 14;
        this.field854 = this.field854 * var2 - var3 * var4 >> 14;
        this.field855 = this.field859 * var3 + var2 * var5 >> 14;
        this.field859 = this.field859 * var2 - var3 * var5 >> 14;
        this.field851 = this.field848 * var3 + var2 * var6 >> 14;
        this.field848 = this.field848 * var2 - var3 * var6 >> 14;
        this.field849 = this.field850 * var3 + var2 * var7 >> 14;
        this.field850 = this.field850 * var2 - var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "()Lm;")
    public final class105 method357() {
        class62 var1 = new class62();
        var1.field856 = this.field856;
        var1.field855 = this.field855;
        var1.field851 = this.field851;
        var1.field849 = this.field849;
        var1.field853 = this.field853;
        var1.field852 = this.field852;
        var1.field857 = this.field857;
        var1.field858 = this.field858;
        var1.field854 = this.field854;
        var1.field859 = this.field859;
        var1.field848 = this.field848;
        var1.field850 = this.field850;
        return var1;
    }

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "(I)V")
    public final void method358(int arg0) {
        int var2 = class310.field3965[arg0 & 0x3FFF];
        int var3 = class310.field3966[arg0 & 0x3FFF];
        int var4 = this.field853;
        int var5 = this.field852;
        int var6 = this.field857;
        int var7 = this.field858;
        this.field853 = var2 * var4 - this.field854 * var3 >> 14;
        this.field854 = this.field854 * var2 + var3 * var4 >> 14;
        this.field852 = var2 * var5 - this.field859 * var3 >> 14;
        this.field859 = this.field859 * var2 + var3 * var5 >> 14;
        this.field857 = var2 * var6 - this.field848 * var3 >> 14;
        this.field848 = this.field848 * var2 + var3 * var6 >> 14;
        this.field858 = var2 * var7 - this.field850 * var3 >> 14;
        this.field850 = this.field850 * var2 + var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!jaa", name = "ma", descriptor = "(I)V")
    public final void method359(int arg0) {
        this.field852 = 16384;
        this.field856 = this.field848 = class310.field3965[arg0 & 0x3FFF];
        this.field851 = class310.field3966[arg0 & 0x3FFF];
        this.field854 = -this.field851;
        this.field855 = this.field849 = this.field853 = this.field857 = this.field858 = this.field859 = this.field850 = 0;
    }

    @OriginalMember(owner = "client!jaa", name = "B", descriptor = "(IIIIII)V")
    public final void method360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class310.field3965[arg3 & 0x3FFF];
        int var8 = class310.field3966[arg3 & 0x3FFF];
        int var9 = class310.field3965[arg4 & 0x3FFF];
        int var10 = class310.field3966[arg4 & 0x3FFF];
        int var11 = class310.field3965[arg5 & 0x3FFF];
        int var12 = class310.field3966[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 14;
        int var14 = var8 * var12 >> 14;
        this.field856 = var9 * var11 + var10 * var14 >> 14;
        this.field853 = -var9 * var12 + var10 * var13 >> 14;
        this.field854 = var7 * var10 >> 14;
        this.field855 = var7 * var12 >> 14;
        this.field852 = var7 * var11 >> 14;
        this.field859 = -var8;
        this.field851 = -var10 * var11 + var9 * var14 >> 14;
        this.field857 = var9 * var13 + var10 * var12 >> 14;
        this.field848 = var7 * var9 >> 14;
        this.field849 = -arg0 * this.field856 - this.field855 * arg1 - this.field851 * arg2 >> 14;
        this.field858 = -arg0 * this.field853 - this.field852 * arg1 - this.field857 * arg2 >> 14;
        this.field850 = -arg0 * this.field854 - this.field859 * arg1 - this.field848 * arg2 >> 14;
    }

    @OriginalMember(owner = "client!jaa", name = "oa", descriptor = "(III)V")
    public final void method361(int arg0, int arg1, int arg2) {
        this.field853 = this.field854 = this.field855 = this.field859 = this.field851 = this.field857 = 0;
        this.field856 = this.field852 = this.field848 = 16384;
        this.field849 = arg0;
        this.field858 = arg1;
        this.field850 = arg2;
    }

    @OriginalMember(owner = "client!jaa", name = "EA", descriptor = "(Lm;)V")
    public final void method362(class105 arg0) {
        class62 var2 = (class62) arg0;
        this.field856 = var2.field856;
        this.field855 = var2.field855;
        this.field851 = var2.field851;
        this.field849 = var2.field849;
        this.field853 = var2.field853;
        this.field852 = var2.field852;
        this.field857 = var2.field857;
        this.field858 = var2.field858;
        this.field854 = var2.field854;
        this.field859 = var2.field859;
        this.field848 = var2.field848;
        this.field850 = var2.field850;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III[I)V")
    public final void method363(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field851 * arg2 + this.field856 * arg0 + this.field855 * arg1 >> 14) + this.field849;
        arg3[1] = (this.field857 * arg2 + this.field853 * arg0 + this.field852 * arg1 >> 14) + this.field858;
        arg3[2] = (this.field848 * arg2 + this.field859 * arg1 + this.field854 * arg0 >> 14) + this.field850;
    }

    @OriginalMember(owner = "client!jaa", name = "va", descriptor = "([I)V")
    public final void method364(int[] arg0) {
        int var2 = arg0[0] - this.field849;
        int var3 = arg0[1] - this.field858;
        int var4 = arg0[2] - this.field850;
        arg0[0] = this.field854 * var4 + this.field856 * var2 + this.field853 * var3 >> 14;
        arg0[1] = this.field859 * var4 + this.field855 * var2 + this.field852 * var3 >> 14;
        arg0[2] = this.field848 * var4 + this.field857 * var3 + this.field851 * var2 >> 14;
    }

    @OriginalMember(owner = "client!jaa", name = "TA", descriptor = "(III)V")
    public final void method365(int arg0, int arg1, int arg2) {
        this.field849 += arg0;
        this.field858 += arg1;
        this.field850 += arg2;
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V")
    public class62() {
        this.method354();
    }

    @OriginalMember(owner = "client!jaa", name = "KA", descriptor = "(I)V")
    public final void method366(int arg0) {
        this.field856 = 16384;
        this.field852 = this.field848 = class310.field3965[arg0 & 0x3FFF];
        this.field859 = class310.field3966[arg0 & 0x3FFF];
        this.field857 = -this.field859;
        this.field855 = this.field851 = this.field849 = this.field853 = this.field858 = this.field854 = this.field850 = 0;
    }

    @OriginalMember(owner = "client!jaa", name = "I", descriptor = "(III[I)V")
    public final void method367(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field851 * arg2 + this.field856 * arg0 + this.field855 * arg1 >> 14;
        arg3[1] = this.field857 * arg2 + this.field853 * arg0 + this.field852 * arg1 >> 14;
        arg3[2] = this.field848 * arg2 + this.field859 * arg1 + this.field854 * arg0 >> 14;
    }
}
