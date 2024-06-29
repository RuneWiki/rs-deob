import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class290 extends class247 {

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public int field3944;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public int field3945;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public int field3947;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public int field3949;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public int field3950;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public int field3951;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public int field3952;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public final void method743(int arg0) {
        int var2 = class356.field5025[arg0 & 0x3FFF];
        int var3 = class356.field5037[arg0 & 0x3FFF];
        int var4 = this.field3942;
        int var5 = this.field3950;
        int var6 = this.field3949;
        int var7 = this.field3952;
        this.field3942 = var2 * var4 - this.field3948 * var3 >> 15;
        this.field3948 = this.field3948 * var2 + var3 * var4 >> 15;
        this.field3950 = var2 * var5 - this.field3943 * var3 >> 15;
        this.field3943 = this.field3943 * var2 + var3 * var5 >> 15;
        this.field3949 = var2 * var6 - this.field3951 * var3 >> 15;
        this.field3951 = this.field3951 * var2 + var3 * var6 >> 15;
        this.field3952 = var2 * var7 - this.field3947 * var3 >> 15;
        this.field3947 = this.field3947 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIII)V")
    public final void method750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class356.field5025[arg3 & 0x3FFF];
        int var8 = class356.field5037[arg3 & 0x3FFF];
        int var9 = class356.field5025[arg4 & 0x3FFF];
        int var10 = class356.field5037[arg4 & 0x3FFF];
        int var11 = class356.field5025[arg5 & 0x3FFF];
        int var12 = class356.field5037[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field3944 = var9 * var11 + var10 * var14 >> 15;
        this.field3942 = -var9 * var12 + var10 * var13 >> 15;
        this.field3948 = var7 * var10 >> 15;
        this.field3941 = var7 * var12 >> 15;
        this.field3950 = var7 * var11 >> 15;
        this.field3943 = -var8;
        this.field3946 = -var10 * var11 + var9 * var14 >> 15;
        this.field3949 = var9 * var13 + var10 * var12 >> 15;
        this.field3951 = var7 * var9 >> 15;
        this.field3945 = -arg0 * this.field3944 - this.field3941 * arg1 - this.field3946 * arg2 >> 15;
        this.field3952 = -arg0 * this.field3942 - this.field3950 * arg1 - this.field3949 * arg2 >> 15;
        this.field3947 = -arg0 * this.field3948 - this.field3943 * arg1 - this.field3951 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
    public final void method744(int arg0) {
        this.field3951 = 32768;
        this.field3944 = this.field3950 = class356.field5025[arg0 & 0x3FFF];
        this.field3942 = class356.field5037[arg0 & 0x3FFF];
        this.field3941 = -this.field3942;
        this.field3946 = this.field3945 = this.field3949 = this.field3952 = this.field3948 = this.field3943 = this.field3947 = 0;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()Ltc;")
    public final class290 method1716() {
        class290 var1 = new class290();
        var1.field3944 = this.field3944;
        var1.field3941 = this.field3941;
        var1.field3946 = this.field3946;
        var1.field3945 = this.field3945;
        var1.field3942 = this.field3942;
        var1.field3950 = this.field3950;
        var1.field3949 = this.field3949;
        var1.field3952 = this.field3952;
        var1.field3948 = this.field3948;
        var1.field3943 = this.field3943;
        var1.field3951 = this.field3951;
        var1.field3947 = this.field3947;
        return var1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[I)V")
    public final void method745(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field3946 * arg2 + this.field3944 * arg0 + this.field3941 * arg1 >> 15) + this.field3945;
        arg3[1] = (this.field3949 * arg2 + this.field3950 * arg1 + this.field3942 * arg0 >> 15) + this.field3952;
        arg3[2] = (this.field3951 * arg2 + this.field3948 * arg0 + this.field3943 * arg1 >> 15) + this.field3947;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public final void method749(int arg0) {
        int var2 = class356.field5025[arg0 & 0x3FFF];
        int var3 = class356.field5037[arg0 & 0x3FFF];
        int var4 = this.field3944;
        int var5 = this.field3941;
        int var6 = this.field3946;
        int var7 = this.field3945;
        this.field3944 = this.field3948 * var3 + var2 * var4 >> 15;
        this.field3948 = this.field3948 * var2 - var3 * var4 >> 15;
        this.field3941 = this.field3943 * var3 + var2 * var5 >> 15;
        this.field3943 = this.field3943 * var2 - var3 * var5 >> 15;
        this.field3946 = this.field3951 * var3 + var2 * var6 >> 15;
        this.field3951 = this.field3951 * var2 - var3 * var6 >> 15;
        this.field3945 = this.field3947 * var3 + var2 * var7 >> 15;
        this.field3947 = this.field3947 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
    public final void method742(int arg0, int arg1, int arg2) {
        this.field3945 += arg0;
        this.field3952 += arg1;
        this.field3947 += arg2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lib;)V")
    public final void method740(class247 arg0) {
        class290 var2 = (class290) arg0;
        this.field3944 = var2.field3944;
        this.field3941 = var2.field3941;
        this.field3946 = var2.field3946;
        this.field3945 = var2.field3945;
        this.field3942 = var2.field3942;
        this.field3950 = var2.field3950;
        this.field3949 = var2.field3949;
        this.field3952 = var2.field3952;
        this.field3948 = var2.field3948;
        this.field3943 = var2.field3943;
        this.field3951 = var2.field3951;
        this.field3947 = var2.field3947;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
    public final void method738(int arg0) {
        this.field3944 = 32768;
        this.field3950 = this.field3951 = class356.field5025[arg0 & 0x3FFF];
        this.field3943 = class356.field5037[arg0 & 0x3FFF];
        this.field3949 = -this.field3943;
        this.field3941 = this.field3946 = this.field3945 = this.field3942 = this.field3952 = this.field3948 = this.field3947 = 0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()V")
    public final void method746() {
        this.field3942 = this.field3948 = this.field3941 = this.field3943 = this.field3946 = this.field3949 = this.field3945 = this.field3952 = this.field3947 = 0;
        this.field3944 = this.field3950 = this.field3951 = 32768;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([I)V")
    public final void method739(int[] arg0) {
        int var2 = arg0[0] - this.field3945;
        int var3 = arg0[1] - this.field3952;
        int var4 = arg0[2] - this.field3947;
        arg0[0] = this.field3948 * var4 + this.field3944 * var2 + this.field3942 * var3 >> 15;
        arg0[1] = this.field3943 * var4 + this.field3950 * var3 + this.field3941 * var2 >> 15;
        arg0[2] = this.field3951 * var4 + this.field3949 * var3 + this.field3946 * var2 >> 15;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class290() {
        this.method746();
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)V")
    public final void method747(int arg0, int arg1, int arg2) {
        this.field3942 = this.field3948 = this.field3941 = this.field3943 = this.field3946 = this.field3949 = 0;
        this.field3944 = this.field3950 = this.field3951 = 32768;
        this.field3945 = arg0;
        this.field3952 = arg1;
        this.field3947 = arg2;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
    public final void method751(int arg0) {
        this.field3950 = 32768;
        this.field3944 = this.field3951 = class356.field5025[arg0 & 0x3FFF];
        this.field3946 = class356.field5037[arg0 & 0x3FFF];
        this.field3948 = -this.field3946;
        this.field3941 = this.field3945 = this.field3942 = this.field3949 = this.field3952 = this.field3943 = this.field3947 = 0;
    }
}
