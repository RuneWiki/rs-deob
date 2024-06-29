import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class199 extends class105 {

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public int field2825;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public int field2826;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public int field2827;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    public int field2835;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!kv", name = "ha", descriptor = "()V")
    public final void method883() {
        this.field2836 = this.field2833 = this.field2828 = this.field2835 = this.field2827 = this.field2829 = this.field2830 = this.field2831 = this.field2832 = 0;
        this.field2826 = this.field2825 = this.field2834 = 32768;
    }

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "(I)V")
    public final void method887(int arg0) {
        int var2 = class285.field4152[arg0 & 0x3FFF];
        int var3 = class285.field4154[arg0 & 0x3FFF];
        int var4 = this.field2836;
        int var5 = this.field2825;
        int var6 = this.field2829;
        int var7 = this.field2831;
        this.field2836 = var2 * var4 - this.field2833 * var3 >> 15;
        this.field2833 = this.field2833 * var2 + var3 * var4 >> 15;
        this.field2825 = var2 * var5 - this.field2835 * var3 >> 15;
        this.field2835 = this.field2835 * var2 + var3 * var5 >> 15;
        this.field2829 = var2 * var6 - this.field2834 * var3 >> 15;
        this.field2834 = this.field2834 * var2 + var3 * var6 >> 15;
        this.field2831 = var2 * var7 - this.field2832 * var3 >> 15;
        this.field2832 = this.field2832 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "(III[I)V")
    public final void method885(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field2827 * arg2 + this.field2828 * arg1 + this.field2826 * arg0 >> 15;
        arg3[1] = this.field2829 * arg2 + this.field2836 * arg0 + this.field2825 * arg1 >> 15;
        arg3[2] = this.field2834 * arg2 + this.field2835 * arg1 + this.field2833 * arg0 >> 15;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "()Lm;")
    public final class105 method879() {
        class199 var1 = new class199();
        var1.field2826 = this.field2826;
        var1.field2828 = this.field2828;
        var1.field2827 = this.field2827;
        var1.field2830 = this.field2830;
        var1.field2836 = this.field2836;
        var1.field2825 = this.field2825;
        var1.field2829 = this.field2829;
        var1.field2831 = this.field2831;
        var1.field2833 = this.field2833;
        var1.field2835 = this.field2835;
        var1.field2834 = this.field2834;
        var1.field2832 = this.field2832;
        return var1;
    }

    @OriginalMember(owner = "client!kv", name = "XA", descriptor = "(I)V")
    public final void method882(int arg0) {
        int var2 = class285.field4152[arg0 & 0x3FFF];
        int var3 = class285.field4154[arg0 & 0x3FFF];
        int var4 = this.field2826;
        int var5 = this.field2828;
        int var6 = this.field2827;
        int var7 = this.field2830;
        this.field2826 = this.field2833 * var3 + var2 * var4 >> 15;
        this.field2833 = this.field2833 * var2 - var3 * var4 >> 15;
        this.field2828 = this.field2835 * var3 + var2 * var5 >> 15;
        this.field2835 = this.field2835 * var2 - var3 * var5 >> 15;
        this.field2827 = this.field2834 * var3 + var2 * var6 >> 15;
        this.field2834 = this.field2834 * var2 - var3 * var6 >> 15;
        this.field2830 = this.field2832 * var3 + var2 * var7 >> 15;
        this.field2832 = this.field2832 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III[I)V")
    public final void method880(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field2827 * arg2 + this.field2828 * arg1 + this.field2826 * arg0 >> 15) + this.field2830;
        arg3[1] = (this.field2829 * arg2 + this.field2836 * arg0 + this.field2825 * arg1 >> 15) + this.field2831;
        arg3[2] = (this.field2834 * arg2 + this.field2835 * arg1 + this.field2833 * arg0 >> 15) + this.field2832;
    }

    @OriginalMember(owner = "client!kv", name = "B", descriptor = "(IIIIII)V")
    public final void method888(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class285.field4152[arg3 & 0x3FFF];
        int var8 = class285.field4154[arg3 & 0x3FFF];
        int var9 = class285.field4152[arg4 & 0x3FFF];
        int var10 = class285.field4154[arg4 & 0x3FFF];
        int var11 = class285.field4152[arg5 & 0x3FFF];
        int var12 = class285.field4154[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field2826 = var9 * var11 + var10 * var14 >> 15;
        this.field2836 = -var9 * var12 + var10 * var13 >> 15;
        this.field2833 = var7 * var10 >> 15;
        this.field2828 = var7 * var12 >> 15;
        this.field2825 = var7 * var11 >> 15;
        this.field2835 = -var8;
        this.field2827 = -var10 * var11 + var9 * var14 >> 15;
        this.field2829 = var9 * var13 + var10 * var12 >> 15;
        this.field2834 = var7 * var9 >> 15;
        this.field2830 = -arg0 * this.field2826 - this.field2828 * arg1 - this.field2827 * arg2 >> 15;
        this.field2831 = -arg0 * this.field2836 - this.field2825 * arg1 - this.field2829 * arg2 >> 15;
        this.field2832 = -arg0 * this.field2833 - this.field2835 * arg1 - this.field2834 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!kv", name = "EA", descriptor = "(Lm;)V")
    public final void method878(class105 arg0) {
        class199 var2 = (class199) arg0;
        this.field2826 = var2.field2826;
        this.field2828 = var2.field2828;
        this.field2827 = var2.field2827;
        this.field2830 = var2.field2830;
        this.field2836 = var2.field2836;
        this.field2825 = var2.field2825;
        this.field2829 = var2.field2829;
        this.field2831 = var2.field2831;
        this.field2833 = var2.field2833;
        this.field2835 = var2.field2835;
        this.field2834 = var2.field2834;
        this.field2832 = var2.field2832;
    }

    @OriginalMember(owner = "client!kv", name = "ta", descriptor = "(I)V")
    public final void method876(int arg0) {
        this.field2834 = 32768;
        this.field2826 = this.field2825 = class285.field4152[arg0 & 0x3FFF];
        this.field2836 = class285.field4154[arg0 & 0x3FFF];
        this.field2828 = -this.field2836;
        this.field2827 = this.field2830 = this.field2829 = this.field2831 = this.field2833 = this.field2835 = this.field2832 = 0;
    }

    @OriginalMember(owner = "client!kv", name = "va", descriptor = "([I)V")
    public final void method891(int[] arg0) {
        int var2 = arg0[0] - this.field2830;
        int var3 = arg0[1] - this.field2831;
        int var4 = arg0[2] - this.field2832;
        arg0[0] = this.field2833 * var4 + this.field2836 * var3 + this.field2826 * var2 >> 15;
        arg0[1] = this.field2835 * var4 + this.field2828 * var2 + this.field2825 * var3 >> 15;
        arg0[2] = this.field2834 * var4 + this.field2829 * var3 + this.field2827 * var2 >> 15;
    }

    @OriginalMember(owner = "client!kv", name = "KA", descriptor = "(I)V")
    public final void method881(int arg0) {
        this.field2826 = 32768;
        this.field2825 = this.field2834 = class285.field4152[arg0 & 0x3FFF];
        this.field2835 = class285.field4154[arg0 & 0x3FFF];
        this.field2829 = -this.field2835;
        this.field2828 = this.field2827 = this.field2830 = this.field2836 = this.field2831 = this.field2833 = this.field2832 = 0;
    }

    @OriginalMember(owner = "client!kv", name = "oa", descriptor = "(III)V")
    public final void method884(int arg0, int arg1, int arg2) {
        this.field2836 = this.field2833 = this.field2828 = this.field2835 = this.field2827 = this.field2829 = 0;
        this.field2826 = this.field2825 = this.field2834 = 32768;
        this.field2830 = arg0;
        this.field2831 = arg1;
        this.field2832 = arg2;
    }

    @OriginalMember(owner = "client!kv", name = "ma", descriptor = "(I)V")
    public final void method875(int arg0) {
        this.field2825 = 32768;
        this.field2826 = this.field2834 = class285.field4152[arg0 & 0x3FFF];
        this.field2827 = class285.field4154[arg0 & 0x3FFF];
        this.field2833 = -this.field2827;
        this.field2828 = this.field2830 = this.field2836 = this.field2829 = this.field2831 = this.field2835 = this.field2832 = 0;
    }

    @OriginalMember(owner = "client!kv", name = "TA", descriptor = "(III)V")
    public final void method877(int arg0, int arg1, int arg2) {
        this.field2830 += arg0;
        this.field2831 += arg1;
        this.field2832 += arg2;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V")
    public class199() {
        this.method883();
    }
}
