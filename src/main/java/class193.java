import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class193 extends class391 {

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public int field2849;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public int field2850;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
    public int field2855;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "(III)V", line = 8)
    public final void method1285(int arg0, int arg1, int arg2) {
        this.field2847 += arg0;
        this.field2846 += arg1;
        this.field2855 += arg2;
    }

    @OriginalMember(owner = "client!eq", name = "S", descriptor = "(I)V", line = 14)
    public final void method1286(int arg0) {
        int var2 = class675.field9541[arg0 & 0x3FFF];
        int var3 = class675.field9542[arg0 & 0x3FFF];
        int var4 = this.field2845;
        int var5 = this.field2848;
        int var6 = this.field2850;
        int var7 = this.field2846;
        this.field2845 = var2 * var4 - this.field2856 * var3 >> 14;
        this.field2856 = this.field2856 * var2 + var3 * var4 >> 14;
        this.field2848 = var2 * var5 - this.field2852 * var3 >> 14;
        this.field2852 = this.field2852 * var2 + var3 * var5 >> 14;
        this.field2850 = var2 * var6 - this.field2849 * var3 >> 14;
        this.field2849 = this.field2849 * var2 + var3 * var6 >> 14;
        this.field2846 = var2 * var7 - this.field2855 * var3 >> 14;
        this.field2855 = this.field2855 * var2 + var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!eq", name = "R", descriptor = "(III[I)V", line = 35)
    public final void method1287(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field2854 * arg2 + this.field2853 * arg1 + this.field2851 * arg0 >> 14;
        arg3[1] = this.field2850 * arg2 + this.field2848 * arg1 + this.field2845 * arg0 >> 14;
        arg3[2] = this.field2849 * arg2 + this.field2856 * arg0 + this.field2852 * arg1 >> 14;
    }

    @OriginalMember(owner = "client!eq", name = "GA", descriptor = "(III)V", line = 40)
    public final void method1288(int arg0, int arg1, int arg2) {
        this.field2845 = this.field2856 = this.field2853 = this.field2852 = this.field2854 = this.field2850 = 0;
        this.field2851 = this.field2848 = this.field2849 = 16384;
        this.field2847 = arg0;
        this.field2846 = arg1;
        this.field2855 = arg2;
    }

    @OriginalMember(owner = "client!eq", name = "O", descriptor = "([I)V", line = 53)
    public final void method1289(int[] arg0) {
        int var2 = arg0[0] - this.field2847;
        int var3 = arg0[1] - this.field2846;
        int var4 = arg0[2] - this.field2855;
        arg0[0] = this.field2856 * var4 + this.field2851 * var2 + this.field2845 * var3 >> 14;
        arg0[1] = this.field2852 * var4 + this.field2853 * var2 + this.field2848 * var3 >> 14;
        arg0[2] = this.field2849 * var4 + this.field2854 * var2 + this.field2850 * var3 >> 14;
    }

    @OriginalMember(owner = "client!eq", name = "pa", descriptor = "(IIIIII)V", line = 64)
    public final void method1290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class675.field9541[arg3 & 0x3FFF];
        int var8 = class675.field9542[arg3 & 0x3FFF];
        int var9 = class675.field9541[arg4 & 0x3FFF];
        int var10 = class675.field9542[arg4 & 0x3FFF];
        int var11 = class675.field9541[arg5 & 0x3FFF];
        int var12 = class675.field9542[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 14;
        int var14 = var8 * var12 >> 14;
        this.field2851 = var9 * var11 + var10 * var14 >> 14;
        this.field2845 = -var9 * var12 + var10 * var13 >> 14;
        this.field2856 = var7 * var10 >> 14;
        this.field2853 = var7 * var12 >> 14;
        this.field2848 = var7 * var11 >> 14;
        this.field2852 = -var8;
        this.field2854 = -var10 * var11 + var9 * var14 >> 14;
        this.field2850 = var9 * var13 + var10 * var12 >> 14;
        this.field2849 = var7 * var9 >> 14;
        this.field2847 = -arg0 * this.field2851 - this.field2853 * arg1 - this.field2854 * arg2 >> 14;
        this.field2846 = -arg0 * this.field2845 - this.field2848 * arg1 - this.field2850 * arg2 >> 14;
        this.field2855 = -arg0 * this.field2856 - this.field2852 * arg1 - this.field2849 * arg2 >> 14;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III[I)V", line = 93)
    public final void method1291(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field2854 * arg2 + this.field2853 * arg1 + this.field2851 * arg0 >> 14) + this.field2847;
        arg3[1] = (this.field2850 * arg2 + this.field2848 * arg1 + this.field2845 * arg0 >> 14) + this.field2846;
        arg3[2] = (this.field2849 * arg2 + this.field2856 * arg0 + this.field2852 * arg1 >> 14) + this.field2855;
    }

    @OriginalMember(owner = "client!eq", name = "ra", descriptor = "(I)V", line = 98)
    public final void method1292(int arg0) {
        this.field2849 = 16384;
        this.field2851 = this.field2848 = class675.field9541[arg0 & 0x3FFF];
        this.field2845 = class675.field9542[arg0 & 0x3FFF];
        this.field2853 = -this.field2845;
        this.field2854 = this.field2847 = this.field2850 = this.field2846 = this.field2856 = this.field2852 = this.field2855 = 0;
    }

    @OriginalMember(owner = "client!eq", name = "XA", descriptor = "(I)V", line = 106)
    public final void method1293(int arg0) {
        this.field2851 = 16384;
        this.field2848 = this.field2849 = class675.field9541[arg0 & 0x3FFF];
        this.field2852 = class675.field9542[arg0 & 0x3FFF];
        this.field2850 = -this.field2852;
        this.field2853 = this.field2854 = this.field2847 = this.field2845 = this.field2846 = this.field2856 = this.field2855 = 0;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V", line = 113)
    public final void method1294(int arg0) {
        this.field2848 = 16384;
        this.field2851 = this.field2849 = class675.field9541[arg0 & 0x3FFF];
        this.field2854 = class675.field9542[arg0 & 0x3FFF];
        this.field2856 = -this.field2854;
        this.field2853 = this.field2847 = this.field2845 = this.field2850 = this.field2846 = this.field2852 = this.field2855 = 0;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "()Lq;", line = 124)
    public final class391 method1295() {
        class193 var1 = new class193();
        var1.field2851 = this.field2851;
        var1.field2853 = this.field2853;
        var1.field2854 = this.field2854;
        var1.field2847 = this.field2847;
        var1.field2845 = this.field2845;
        var1.field2848 = this.field2848;
        var1.field2850 = this.field2850;
        var1.field2846 = this.field2846;
        var1.field2856 = this.field2856;
        var1.field2852 = this.field2852;
        var1.field2849 = this.field2849;
        var1.field2855 = this.field2855;
        return var1;
    }

    @OriginalMember(owner = "client!eq", name = "Y", descriptor = "()V", line = 140)
    public final void method1296() {
        this.field2845 = this.field2856 = this.field2853 = this.field2852 = this.field2854 = this.field2850 = this.field2847 = this.field2846 = this.field2855 = 0;
        this.field2851 = this.field2848 = this.field2849 = 16384;
    }

    @OriginalMember(owner = "client!eq", name = "P", descriptor = "(I)V", line = 147)
    public final void method1297(int arg0) {
        int var2 = class675.field9541[arg0 & 0x3FFF];
        int var3 = class675.field9542[arg0 & 0x3FFF];
        int var4 = this.field2851;
        int var5 = this.field2853;
        int var6 = this.field2854;
        int var7 = this.field2847;
        this.field2851 = this.field2856 * var3 + var2 * var4 >> 14;
        this.field2856 = this.field2856 * var2 - var3 * var4 >> 14;
        this.field2853 = this.field2852 * var3 + var2 * var5 >> 14;
        this.field2852 = this.field2852 * var2 - var3 * var5 >> 14;
        this.field2854 = this.field2849 * var3 + var2 * var6 >> 14;
        this.field2849 = this.field2849 * var2 - var3 * var6 >> 14;
        this.field2847 = this.field2855 * var3 + var2 * var7 >> 14;
        this.field2855 = this.field2855 * var2 - var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V", line = 167)
    public class193() {
        this.method1296();
    }

    @OriginalMember(owner = "client!eq", name = "la", descriptor = "(Lq;)V", line = 172)
    public final void method1298(class391 arg0) {
        class193 var2 = (class193) arg0;
        this.field2851 = var2.field2851;
        this.field2853 = var2.field2853;
        this.field2854 = var2.field2854;
        this.field2847 = var2.field2847;
        this.field2845 = var2.field2845;
        this.field2848 = var2.field2848;
        this.field2850 = var2.field2850;
        this.field2846 = var2.field2846;
        this.field2856 = var2.field2856;
        this.field2852 = var2.field2852;
        this.field2849 = var2.field2849;
        this.field2855 = var2.field2855;
    }
}
