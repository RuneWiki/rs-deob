import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class359 extends class124 {

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public int field4874;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public int field4875;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public int field4876;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public int field4877;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public int field4878;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public int field4879;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public int field4880;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public int field4882;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public int field4883;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public int field4884;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    public int field4885;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "()Lc;")
    public final class124 method750() {
        class359 var1 = new class359();
        var1.field4885 = this.field4885;
        var1.field4878 = this.field4878;
        var1.field4884 = this.field4884;
        var1.field4883 = this.field4883;
        var1.field4879 = this.field4879;
        var1.field4875 = this.field4875;
        var1.field4880 = this.field4880;
        var1.field4877 = this.field4877;
        var1.field4876 = this.field4876;
        var1.field4882 = this.field4882;
        var1.field4881 = this.field4881;
        var1.field4874 = this.field4874;
        return var1;
    }

    @OriginalMember(owner = "client!cn", name = "ca", descriptor = "(I)V")
    public final void method749(int arg0) {
        this.field4875 = 32768;
        this.field4885 = this.field4881 = class456.field6811[arg0 & 0x3FFF];
        this.field4884 = class456.field6812[arg0 & 0x3FFF];
        this.field4876 = -this.field4884;
        this.field4878 = this.field4883 = this.field4879 = this.field4880 = this.field4877 = this.field4882 = this.field4874 = 0;
    }

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "(I)V")
    public final void method756(int arg0) {
        this.field4881 = 32768;
        this.field4885 = this.field4875 = class456.field6811[arg0 & 0x3FFF];
        this.field4879 = class456.field6812[arg0 & 0x3FFF];
        this.field4878 = -this.field4879;
        this.field4884 = this.field4883 = this.field4880 = this.field4877 = this.field4876 = this.field4882 = this.field4874 = 0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III[I)V")
    public final void method737(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field4884 * arg2 + this.field4885 * arg0 + this.field4878 * arg1 >> 15) + this.field4883;
        arg3[1] = (this.field4880 * arg2 + this.field4879 * arg0 + this.field4875 * arg1 >> 15) + this.field4877;
        arg3[2] = (this.field4881 * arg2 + this.field4882 * arg1 + this.field4876 * arg0 >> 15) + this.field4874;
    }

    @OriginalMember(owner = "client!cn", name = "wa", descriptor = "([I)V")
    public final void method754(int[] arg0) {
        int var2 = arg0[0] - this.field4883;
        int var3 = arg0[1] - this.field4877;
        int var4 = arg0[2] - this.field4874;
        arg0[0] = this.field4876 * var4 + this.field4885 * var2 + this.field4879 * var3 >> 15;
        arg0[1] = this.field4882 * var4 + this.field4878 * var2 + this.field4875 * var3 >> 15;
        arg0[2] = this.field4881 * var4 + this.field4884 * var2 + this.field4880 * var3 >> 15;
    }

    @OriginalMember(owner = "client!cn", name = "U", descriptor = "(III)V")
    public final void method743(int arg0, int arg1, int arg2) {
        this.field4879 = this.field4876 = this.field4878 = this.field4882 = this.field4884 = this.field4880 = 0;
        this.field4885 = this.field4875 = this.field4881 = 32768;
        this.field4883 = arg0;
        this.field4877 = arg1;
        this.field4874 = arg2;
    }

    @OriginalMember(owner = "client!cn", name = "W", descriptor = "(III)V")
    public final void method757(int arg0, int arg1, int arg2) {
        this.field4883 += arg0;
        this.field4877 += arg1;
        this.field4874 += arg2;
    }

    @OriginalMember(owner = "client!cn", name = "EA", descriptor = "(I)V")
    public final void method742(int arg0) {
        int var2 = class456.field6811[arg0 & 0x3FFF];
        int var3 = class456.field6812[arg0 & 0x3FFF];
        int var4 = this.field4885;
        int var5 = this.field4878;
        int var6 = this.field4884;
        int var7 = this.field4883;
        this.field4885 = this.field4876 * var3 + var2 * var4 >> 15;
        this.field4876 = this.field4876 * var2 - var3 * var4 >> 15;
        this.field4878 = this.field4882 * var3 + var2 * var5 >> 15;
        this.field4882 = this.field4882 * var2 - var3 * var5 >> 15;
        this.field4884 = this.field4881 * var3 + var2 * var6 >> 15;
        this.field4881 = this.field4881 * var2 - var3 * var6 >> 15;
        this.field4883 = this.field4874 * var3 + var2 * var7 >> 15;
        this.field4874 = this.field4874 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)V")
    public final void method747(int arg0) {
        this.field4885 = 32768;
        this.field4875 = this.field4881 = class456.field6811[arg0 & 0x3FFF];
        this.field4882 = class456.field6812[arg0 & 0x3FFF];
        this.field4880 = -this.field4882;
        this.field4878 = this.field4884 = this.field4883 = this.field4879 = this.field4877 = this.field4876 = this.field4874 = 0;
    }

    @OriginalMember(owner = "client!cn", name = "K", descriptor = "(III[I)V")
    public final void method745(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field4884 * arg2 + this.field4885 * arg0 + this.field4878 * arg1 >> 15;
        arg3[1] = this.field4880 * arg2 + this.field4879 * arg0 + this.field4875 * arg1 >> 15;
        arg3[2] = this.field4881 * arg2 + this.field4882 * arg1 + this.field4876 * arg0 >> 15;
    }

    @OriginalMember(owner = "client!cn", name = "ea", descriptor = "(I)V")
    public final void method751(int arg0) {
        int var2 = class456.field6811[arg0 & 0x3FFF];
        int var3 = class456.field6812[arg0 & 0x3FFF];
        int var4 = this.field4879;
        int var5 = this.field4875;
        int var6 = this.field4880;
        int var7 = this.field4877;
        this.field4879 = var2 * var4 - this.field4876 * var3 >> 15;
        this.field4876 = this.field4876 * var2 + var3 * var4 >> 15;
        this.field4875 = var2 * var5 - this.field4882 * var3 >> 15;
        this.field4882 = this.field4882 * var2 + var3 * var5 >> 15;
        this.field4880 = var2 * var6 - this.field4881 * var3 >> 15;
        this.field4881 = this.field4881 * var2 + var3 * var6 >> 15;
        this.field4877 = var2 * var7 - this.field4874 * var3 >> 15;
        this.field4874 = this.field4874 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!cn", name = "ha", descriptor = "(Lc;)V")
    public final void method753(class124 arg0) {
        class359 var2 = (class359) arg0;
        this.field4885 = var2.field4885;
        this.field4878 = var2.field4878;
        this.field4884 = var2.field4884;
        this.field4883 = var2.field4883;
        this.field4879 = var2.field4879;
        this.field4875 = var2.field4875;
        this.field4880 = var2.field4880;
        this.field4877 = var2.field4877;
        this.field4876 = var2.field4876;
        this.field4882 = var2.field4882;
        this.field4881 = var2.field4881;
        this.field4874 = var2.field4874;
    }

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "()V")
    public final void method741() {
        this.field4879 = this.field4876 = this.field4878 = this.field4882 = this.field4884 = this.field4880 = this.field4883 = this.field4877 = this.field4874 = 0;
        this.field4885 = this.field4875 = this.field4881 = 32768;
    }

    @OriginalMember(owner = "client!cn", name = "YA", descriptor = "(IIIIII)V")
    public final void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class456.field6811[arg3 & 0x3FFF];
        int var8 = class456.field6812[arg3 & 0x3FFF];
        int var9 = class456.field6811[arg4 & 0x3FFF];
        int var10 = class456.field6812[arg4 & 0x3FFF];
        int var11 = class456.field6811[arg5 & 0x3FFF];
        int var12 = class456.field6812[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field4885 = var9 * var11 + var10 * var14 >> 15;
        this.field4879 = -var9 * var12 + var10 * var13 >> 15;
        this.field4876 = var7 * var10 >> 15;
        this.field4878 = var7 * var12 >> 15;
        this.field4875 = var7 * var11 >> 15;
        this.field4882 = -var8;
        this.field4884 = -var10 * var11 + var9 * var14 >> 15;
        this.field4880 = var9 * var13 + var10 * var12 >> 15;
        this.field4881 = var7 * var9 >> 15;
        this.field4883 = -arg0 * this.field4885 - this.field4878 * arg1 - this.field4884 * arg2 >> 15;
        this.field4877 = -arg0 * this.field4879 - this.field4875 * arg1 - this.field4880 * arg2 >> 15;
        this.field4874 = -arg0 * this.field4876 - this.field4882 * arg1 - this.field4881 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
    public class359() {
        this.method741();
    }
}
