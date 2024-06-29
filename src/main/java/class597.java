import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class597 extends class364 {

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public int field8715;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public int field8716;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public int field8717;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public int field8718;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public int field8719;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public int field8720;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public int field8721;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public int field8722;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public int field8723;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public int field8724;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public int field8725;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public int field8726;

    @OriginalMember(owner = "client!vm", name = "P", descriptor = "(I)V", line = 4)
    public final void method2002(int arg0) {
        int var2 = class605.field8858[arg0 & 0x3FFF];
        int var3 = class605.field8859[arg0 & 0x3FFF];
        int var4 = this.field8715;
        int var5 = this.field8726;
        int var6 = this.field8723;
        int var7 = this.field8717;
        this.field8715 = this.field8721 * var3 + var2 * var4 >> 14;
        this.field8721 = this.field8721 * var2 - var3 * var4 >> 14;
        this.field8726 = this.field8720 * var3 + var2 * var5 >> 14;
        this.field8720 = this.field8720 * var2 - var3 * var5 >> 14;
        this.field8723 = this.field8725 * var3 + var2 * var6 >> 14;
        this.field8725 = this.field8725 * var2 - var3 * var6 >> 14;
        this.field8717 = this.field8722 * var3 + var2 * var7 >> 14;
        this.field8722 = this.field8722 * var2 - var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "([I)V", line = 26)
    public final void method2016(int[] arg0) {
        int var2 = arg0[0] - this.field8717;
        int var3 = arg0[1] - this.field8716;
        int var4 = arg0[2] - this.field8722;
        arg0[0] = this.field8721 * var4 + this.field8718 * var3 + this.field8715 * var2 >> 14;
        arg0[1] = this.field8720 * var4 + this.field8726 * var2 + this.field8724 * var3 >> 14;
        arg0[2] = this.field8725 * var4 + this.field8723 * var2 + this.field8719 * var3 >> 14;
    }

    @OriginalMember(owner = "client!vm", name = "pa", descriptor = "(IIIIII)V", line = 37)
    public final void method2019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class605.field8858[arg3 & 0x3FFF];
        int var8 = class605.field8859[arg3 & 0x3FFF];
        int var9 = class605.field8858[arg4 & 0x3FFF];
        int var10 = class605.field8859[arg4 & 0x3FFF];
        int var11 = class605.field8858[arg5 & 0x3FFF];
        int var12 = class605.field8859[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 14;
        int var14 = var8 * var12 >> 14;
        this.field8715 = var9 * var11 + var10 * var14 >> 14;
        this.field8718 = -var9 * var12 + var10 * var13 >> 14;
        this.field8721 = var7 * var10 >> 14;
        this.field8726 = var7 * var12 >> 14;
        this.field8724 = var7 * var11 >> 14;
        this.field8720 = -var8;
        this.field8723 = -var10 * var11 + var9 * var14 >> 14;
        this.field8719 = var9 * var13 + var10 * var12 >> 14;
        this.field8725 = var7 * var9 >> 14;
        this.field8717 = -arg0 * this.field8715 - this.field8726 * arg1 - this.field8723 * arg2 >> 14;
        this.field8716 = -arg0 * this.field8718 - this.field8724 * arg1 - this.field8719 * arg2 >> 14;
        this.field8722 = -arg0 * this.field8721 - this.field8720 * arg1 - this.field8725 * arg2 >> 14;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 68)
    public final void method2023(int arg0) {
        this.field8724 = 16384;
        this.field8715 = this.field8725 = class605.field8858[arg0 & 0x3FFF];
        this.field8723 = class605.field8859[arg0 & 0x3FFF];
        this.field8721 = -this.field8723;
        this.field8726 = this.field8717 = this.field8718 = this.field8719 = this.field8716 = this.field8720 = this.field8722 = 0;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "()Lq;", line = 76)
    public final class364 method2020() {
        class597 var1 = new class597();
        var1.field8715 = this.field8715;
        var1.field8726 = this.field8726;
        var1.field8723 = this.field8723;
        var1.field8717 = this.field8717;
        var1.field8718 = this.field8718;
        var1.field8724 = this.field8724;
        var1.field8719 = this.field8719;
        var1.field8716 = this.field8716;
        var1.field8721 = this.field8721;
        var1.field8720 = this.field8720;
        var1.field8725 = this.field8725;
        var1.field8722 = this.field8722;
        return var1;
    }

    @OriginalMember(owner = "client!vm", name = "la", descriptor = "(Lq;)V", line = 93)
    public final void method2004(class364 arg0) {
        class597 var2 = (class597) arg0;
        this.field8715 = var2.field8715;
        this.field8726 = var2.field8726;
        this.field8723 = var2.field8723;
        this.field8717 = var2.field8717;
        this.field8718 = var2.field8718;
        this.field8724 = var2.field8724;
        this.field8719 = var2.field8719;
        this.field8716 = var2.field8716;
        this.field8721 = var2.field8721;
        this.field8720 = var2.field8720;
        this.field8725 = var2.field8725;
        this.field8722 = var2.field8722;
    }

    @OriginalMember(owner = "client!vm", name = "S", descriptor = "(I)V", line = 111)
    public final void method2007(int arg0) {
        int var2 = class605.field8858[arg0 & 0x3FFF];
        int var3 = class605.field8859[arg0 & 0x3FFF];
        int var4 = this.field8718;
        int var5 = this.field8724;
        int var6 = this.field8719;
        int var7 = this.field8716;
        this.field8718 = var2 * var4 - this.field8721 * var3 >> 14;
        this.field8721 = this.field8721 * var2 + var3 * var4 >> 14;
        this.field8724 = var2 * var5 - this.field8720 * var3 >> 14;
        this.field8720 = this.field8720 * var2 + var3 * var5 >> 14;
        this.field8719 = var2 * var6 - this.field8725 * var3 >> 14;
        this.field8725 = this.field8725 * var2 + var3 * var6 >> 14;
        this.field8716 = var2 * var7 - this.field8722 * var3 >> 14;
        this.field8722 = this.field8722 * var2 + var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!vm", name = "R", descriptor = "(III[I)V", line = 135)
    public final void method2003(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field8723 * arg2 + this.field8726 * arg1 + this.field8715 * arg0 >> 14;
        arg3[1] = this.field8719 * arg2 + this.field8724 * arg1 + this.field8718 * arg0 >> 14;
        arg3[2] = this.field8725 * arg2 + this.field8721 * arg0 + this.field8720 * arg1 >> 14;
    }

    @OriginalMember(owner = "client!vm", name = "GA", descriptor = "(III)V", line = 140)
    public final void method2014(int arg0, int arg1, int arg2) {
        this.field8718 = this.field8721 = this.field8726 = this.field8720 = this.field8723 = this.field8719 = 0;
        this.field8715 = this.field8724 = this.field8725 = 16384;
        this.field8717 = arg0;
        this.field8716 = arg1;
        this.field8722 = arg2;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III[I)V", line = 151)
    public final void method2018(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field8723 * arg2 + this.field8726 * arg1 + this.field8715 * arg0 >> 14) + this.field8717;
        arg3[1] = (this.field8719 * arg2 + this.field8724 * arg1 + this.field8718 * arg0 >> 14) + this.field8716;
        arg3[2] = (this.field8725 * arg2 + this.field8721 * arg0 + this.field8720 * arg1 >> 14) + this.field8722;
    }

    @OriginalMember(owner = "client!vm", name = "ra", descriptor = "(I)V", line = 159)
    public final void method2011(int arg0) {
        this.field8725 = 16384;
        this.field8715 = this.field8724 = class605.field8858[arg0 & 0x3FFF];
        this.field8718 = class605.field8859[arg0 & 0x3FFF];
        this.field8726 = -this.field8718;
        this.field8723 = this.field8717 = this.field8719 = this.field8716 = this.field8721 = this.field8720 = this.field8722 = 0;
    }

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "(III)V", line = 167)
    public final void method2006(int arg0, int arg1, int arg2) {
        this.field8717 += arg0;
        this.field8716 += arg1;
        this.field8722 += arg2;
    }

    @OriginalMember(owner = "client!vm", name = "XA", descriptor = "(I)V", line = 172)
    public final void method2017(int arg0) {
        this.field8715 = 16384;
        this.field8724 = this.field8725 = class605.field8858[arg0 & 0x3FFF];
        this.field8720 = class605.field8859[arg0 & 0x3FFF];
        this.field8719 = -this.field8720;
        this.field8726 = this.field8723 = this.field8717 = this.field8718 = this.field8716 = this.field8721 = this.field8722 = 0;
    }

    @OriginalMember(owner = "client!vm", name = "Y", descriptor = "()V", line = 179)
    public final void method2021() {
        this.field8718 = this.field8721 = this.field8726 = this.field8720 = this.field8723 = this.field8719 = this.field8717 = this.field8716 = this.field8722 = 0;
        this.field8715 = this.field8724 = this.field8725 = 16384;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V", line = 184)
    public class597() {
        this.method2021();
    }
}
