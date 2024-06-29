import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class183 extends class202 {

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public int field2884;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public int field2886;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public int field2887;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public int field2894;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "(III)V", line = 8)
    public final void method1237(int arg0, int arg1, int arg2) {
        this.field2893 += arg0;
        this.field2886 += arg1;
        this.field2890 += arg2;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III[I)V", line = 14)
    public final void method1238(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field2887 * arg2 + this.field2889 * arg1 + this.field2884 * arg0 >> 15) + this.field2893;
        arg3[1] = (this.field2888 * arg2 + this.field2892 * arg0 + this.field2883 * arg1 >> 15) + this.field2886;
        arg3[2] = (this.field2885 * arg2 + this.field2894 * arg1 + this.field2891 * arg0 >> 15) + this.field2890;
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V", line = 19)
    public final void method1239(int arg0) {
        this.field2884 = 32768;
        this.field2883 = this.field2885 = class46.field755[arg0 & 0x3FFF];
        this.field2894 = class46.field757[arg0 & 0x3FFF];
        this.field2888 = -this.field2894;
        this.field2889 = this.field2887 = this.field2893 = this.field2892 = this.field2886 = this.field2891 = this.field2890 = 0;
    }

    @OriginalMember(owner = "client!md", name = "wa", descriptor = "([I)V", line = 27)
    public final void method1240(int[] arg0) {
        int var2 = arg0[0] - this.field2893;
        int var3 = arg0[1] - this.field2886;
        int var4 = arg0[2] - this.field2890;
        arg0[0] = this.field2891 * var4 + this.field2892 * var3 + this.field2884 * var2 >> 15;
        arg0[1] = this.field2894 * var4 + this.field2889 * var2 + this.field2883 * var3 >> 15;
        arg0[2] = this.field2885 * var4 + this.field2888 * var3 + this.field2887 * var2 >> 15;
    }

    @OriginalMember(owner = "client!md", name = "ha", descriptor = "(Lc;)V", line = 42)
    public final void method1241(class202 arg0) {
        class183 var2 = (class183) arg0;
        this.field2884 = var2.field2884;
        this.field2889 = var2.field2889;
        this.field2887 = var2.field2887;
        this.field2893 = var2.field2893;
        this.field2892 = var2.field2892;
        this.field2883 = var2.field2883;
        this.field2888 = var2.field2888;
        this.field2886 = var2.field2886;
        this.field2891 = var2.field2891;
        this.field2894 = var2.field2894;
        this.field2885 = var2.field2885;
        this.field2890 = var2.field2890;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()Lc;", line = 59)
    public final class202 method1242() {
        class183 var1 = new class183();
        var1.field2884 = this.field2884;
        var1.field2889 = this.field2889;
        var1.field2887 = this.field2887;
        var1.field2893 = this.field2893;
        var1.field2892 = this.field2892;
        var1.field2883 = this.field2883;
        var1.field2888 = this.field2888;
        var1.field2886 = this.field2886;
        var1.field2891 = this.field2891;
        var1.field2894 = this.field2894;
        var1.field2885 = this.field2885;
        var1.field2890 = this.field2890;
        return var1;
    }

    @OriginalMember(owner = "client!md", name = "ea", descriptor = "(I)V", line = 76)
    public final void method1243(int arg0) {
        int var2 = class46.field755[arg0 & 0x3FFF];
        int var3 = class46.field757[arg0 & 0x3FFF];
        int var4 = this.field2892;
        int var5 = this.field2883;
        int var6 = this.field2888;
        int var7 = this.field2886;
        this.field2892 = var2 * var4 - this.field2891 * var3 >> 15;
        this.field2891 = this.field2891 * var2 + var3 * var4 >> 15;
        this.field2883 = var2 * var5 - this.field2894 * var3 >> 15;
        this.field2894 = this.field2894 * var2 + var3 * var5 >> 15;
        this.field2888 = var2 * var6 - this.field2885 * var3 >> 15;
        this.field2885 = this.field2885 * var2 + var3 * var6 >> 15;
        this.field2886 = var2 * var7 - this.field2890 * var3 >> 15;
        this.field2890 = this.field2890 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!md", name = "v", descriptor = "()V", line = 97)
    public final void method1244() {
        this.field2892 = this.field2891 = this.field2889 = this.field2894 = this.field2887 = this.field2888 = this.field2893 = this.field2886 = this.field2890 = 0;
        this.field2884 = this.field2883 = this.field2885 = 32768;
    }

    @OriginalMember(owner = "client!md", name = "EA", descriptor = "(I)V", line = 106)
    public final void method1245(int arg0) {
        int var2 = class46.field755[arg0 & 0x3FFF];
        int var3 = class46.field757[arg0 & 0x3FFF];
        int var4 = this.field2884;
        int var5 = this.field2889;
        int var6 = this.field2887;
        int var7 = this.field2893;
        this.field2884 = this.field2891 * var3 + var2 * var4 >> 15;
        this.field2891 = this.field2891 * var2 - var3 * var4 >> 15;
        this.field2889 = this.field2894 * var3 + var2 * var5 >> 15;
        this.field2894 = this.field2894 * var2 - var3 * var5 >> 15;
        this.field2887 = this.field2885 * var3 + var2 * var6 >> 15;
        this.field2885 = this.field2885 * var2 - var3 * var6 >> 15;
        this.field2893 = this.field2890 * var3 + var2 * var7 >> 15;
        this.field2890 = this.field2890 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!md", name = "U", descriptor = "(III)V", line = 127)
    public final void method1246(int arg0, int arg1, int arg2) {
        this.field2892 = this.field2891 = this.field2889 = this.field2894 = this.field2887 = this.field2888 = 0;
        this.field2884 = this.field2883 = this.field2885 = 32768;
        this.field2893 = arg0;
        this.field2886 = arg1;
        this.field2890 = arg2;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 134)
    public class183() {
        this.method1244();
    }

    @OriginalMember(owner = "client!md", name = "YA", descriptor = "(IIIIII)V", line = 139)
    public final void method1247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class46.field755[arg3 & 0x3FFF];
        int var8 = class46.field757[arg3 & 0x3FFF];
        int var9 = class46.field755[arg4 & 0x3FFF];
        int var10 = class46.field757[arg4 & 0x3FFF];
        int var11 = class46.field755[arg5 & 0x3FFF];
        int var12 = class46.field757[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field2884 = var9 * var11 + var10 * var14 >> 15;
        this.field2892 = -var9 * var12 + var10 * var13 >> 15;
        this.field2891 = var7 * var10 >> 15;
        this.field2889 = var7 * var12 >> 15;
        this.field2883 = var7 * var11 >> 15;
        this.field2894 = -var8;
        this.field2887 = -var10 * var11 + var9 * var14 >> 15;
        this.field2888 = var9 * var13 + var10 * var12 >> 15;
        this.field2885 = var7 * var9 >> 15;
        this.field2893 = -arg0 * this.field2884 - this.field2889 * arg1 - this.field2887 * arg2 >> 15;
        this.field2886 = -arg0 * this.field2892 - this.field2883 * arg1 - this.field2888 * arg2 >> 15;
        this.field2890 = -arg0 * this.field2891 - this.field2894 * arg1 - this.field2885 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!md", name = "A", descriptor = "(I)V", line = 168)
    public final void method1248(int arg0) {
        this.field2885 = 32768;
        this.field2884 = this.field2883 = class46.field755[arg0 & 0x3FFF];
        this.field2892 = class46.field757[arg0 & 0x3FFF];
        this.field2889 = -this.field2892;
        this.field2887 = this.field2893 = this.field2888 = this.field2886 = this.field2891 = this.field2894 = this.field2890 = 0;
    }

    @OriginalMember(owner = "client!md", name = "K", descriptor = "(III[I)V", line = 175)
    public final void method1249(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field2887 * arg2 + this.field2889 * arg1 + this.field2884 * arg0 >> 15;
        arg3[1] = this.field2888 * arg2 + this.field2892 * arg0 + this.field2883 * arg1 >> 15;
        arg3[2] = this.field2885 * arg2 + this.field2894 * arg1 + this.field2891 * arg0 >> 15;
    }

    @OriginalMember(owner = "client!md", name = "ca", descriptor = "(I)V", line = 180)
    public final void method1250(int arg0) {
        this.field2883 = 32768;
        this.field2884 = this.field2885 = class46.field755[arg0 & 0x3FFF];
        this.field2887 = class46.field757[arg0 & 0x3FFF];
        this.field2891 = -this.field2887;
        this.field2889 = this.field2893 = this.field2892 = this.field2888 = this.field2886 = this.field2894 = this.field2890 = 0;
    }
}
