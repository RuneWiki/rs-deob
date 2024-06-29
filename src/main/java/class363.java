import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class363 extends class261 {

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public int field5088;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public int field5089;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public int field5090;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public int field5091;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public int field5092;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public int field5093;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public int field5094;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public int field5095;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public int field5096;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public int field5097;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public int field5098;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public int field5099;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 5)
    public final void method886(int arg0) {
        this.field5094 = 32768;
        this.field5096 = this.field5091 = class362.field5082[arg0 & 0x3FFF];
        this.field5099 = class362.field5083[arg0 & 0x3FFF];
        this.field5097 = -this.field5099;
        this.field5095 = this.field5089 = this.field5088 = this.field5098 = this.field5090 = this.field5093 = this.field5092 = 0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lci;)V", line = 14)
    public final void method884(class261 arg0) {
        class363 var2 = (class363) arg0;
        this.field5096 = var2.field5096;
        this.field5097 = var2.field5097;
        this.field5095 = var2.field5095;
        this.field5089 = var2.field5089;
        this.field5099 = var2.field5099;
        this.field5091 = var2.field5091;
        this.field5088 = var2.field5088;
        this.field5098 = var2.field5098;
        this.field5090 = var2.field5090;
        this.field5093 = var2.field5093;
        this.field5094 = var2.field5094;
        this.field5092 = var2.field5092;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V", line = 32)
    public final void method892(int arg0) {
        int var2 = class362.field5082[arg0 & 0x3FFF];
        int var3 = class362.field5083[arg0 & 0x3FFF];
        int var4 = this.field5099;
        int var5 = this.field5091;
        int var6 = this.field5088;
        int var7 = this.field5098;
        this.field5099 = var2 * var4 - this.field5090 * var3 >> 15;
        this.field5090 = this.field5090 * var2 + var3 * var4 >> 15;
        this.field5091 = var2 * var5 - this.field5093 * var3 >> 15;
        this.field5093 = this.field5093 * var2 + var3 * var5 >> 15;
        this.field5088 = var2 * var6 - this.field5094 * var3 >> 15;
        this.field5094 = this.field5094 * var2 + var3 * var6 >> 15;
        this.field5098 = var2 * var7 - this.field5092 * var3 >> 15;
        this.field5092 = this.field5092 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V", line = 56)
    public final void method890(int arg0) {
        this.field5096 = 32768;
        this.field5091 = this.field5094 = class362.field5082[arg0 & 0x3FFF];
        this.field5093 = class362.field5083[arg0 & 0x3FFF];
        this.field5088 = -this.field5093;
        this.field5097 = this.field5095 = this.field5089 = this.field5099 = this.field5098 = this.field5090 = this.field5092 = 0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III[I)V", line = 67)
    public final void method881(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field5095 * arg2 + this.field5097 * arg1 + this.field5096 * arg0 >> 15) + this.field5089;
        arg3[1] = (this.field5088 * arg2 + this.field5099 * arg0 + this.field5091 * arg1 >> 15) + this.field5098;
        arg3[2] = (this.field5094 * arg2 + this.field5093 * arg1 + this.field5090 * arg0 >> 15) + this.field5092;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V", line = 74)
    public final void method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class362.field5082[arg3 & 0x3FFF];
        int var8 = class362.field5083[arg3 & 0x3FFF];
        int var9 = class362.field5082[arg4 & 0x3FFF];
        int var10 = class362.field5083[arg4 & 0x3FFF];
        int var11 = class362.field5082[arg5 & 0x3FFF];
        int var12 = class362.field5083[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field5096 = var9 * var11 + var10 * var14 >> 15;
        this.field5099 = -var9 * var12 + var10 * var13 >> 15;
        this.field5090 = var7 * var10 >> 15;
        this.field5097 = var7 * var12 >> 15;
        this.field5091 = var7 * var11 >> 15;
        this.field5093 = -var8;
        this.field5095 = -var10 * var11 + var9 * var14 >> 15;
        this.field5088 = var9 * var13 + var10 * var12 >> 15;
        this.field5094 = var7 * var9 >> 15;
        this.field5089 = -arg0 * this.field5096 - this.field5097 * arg1 - this.field5095 * arg2 >> 15;
        this.field5098 = -arg0 * this.field5099 - this.field5091 * arg1 - this.field5088 * arg2 >> 15;
        this.field5092 = -arg0 * this.field5090 - this.field5093 * arg1 - this.field5094 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([I)V", line = 104)
    public final void method889(int[] arg0) {
        int var2 = arg0[0] - this.field5089;
        int var3 = arg0[1] - this.field5098;
        int var4 = arg0[2] - this.field5092;
        arg0[0] = this.field5090 * var4 + this.field5099 * var3 + this.field5096 * var2 >> 15;
        arg0[1] = this.field5093 * var4 + this.field5097 * var2 + this.field5091 * var3 >> 15;
        arg0[2] = this.field5094 * var4 + this.field5095 * var2 + this.field5088 * var3 >> 15;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V", line = 114)
    public final void method891(int arg0) {
        this.field5091 = 32768;
        this.field5096 = this.field5094 = class362.field5082[arg0 & 0x3FFF];
        this.field5095 = class362.field5083[arg0 & 0x3FFF];
        this.field5090 = -this.field5095;
        this.field5097 = this.field5089 = this.field5099 = this.field5088 = this.field5098 = this.field5093 = this.field5092 = 0;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 123)
    public final void method883(int arg0) {
        int var2 = class362.field5082[arg0 & 0x3FFF];
        int var3 = class362.field5083[arg0 & 0x3FFF];
        int var4 = this.field5096;
        int var5 = this.field5097;
        int var6 = this.field5095;
        int var7 = this.field5089;
        this.field5096 = this.field5090 * var3 + var2 * var4 >> 15;
        this.field5090 = this.field5090 * var2 - var3 * var4 >> 15;
        this.field5097 = this.field5093 * var3 + var2 * var5 >> 15;
        this.field5093 = this.field5093 * var2 - var3 * var5 >> 15;
        this.field5095 = this.field5094 * var3 + var2 * var6 >> 15;
        this.field5094 = this.field5094 * var2 - var3 * var6 >> 15;
        this.field5089 = this.field5092 * var3 + var2 * var7 >> 15;
        this.field5092 = this.field5092 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V", line = 144)
    public final void method893() {
        this.field5099 = this.field5090 = this.field5097 = this.field5093 = this.field5095 = this.field5088 = this.field5089 = this.field5098 = this.field5092 = 0;
        this.field5096 = this.field5091 = this.field5094 = 32768;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()Lji;", line = 150)
    public final class363 method2337() {
        class363 var1 = new class363();
        var1.field5096 = this.field5096;
        var1.field5097 = this.field5097;
        var1.field5095 = this.field5095;
        var1.field5089 = this.field5089;
        var1.field5099 = this.field5099;
        var1.field5091 = this.field5091;
        var1.field5088 = this.field5088;
        var1.field5098 = this.field5098;
        var1.field5090 = this.field5090;
        var1.field5093 = this.field5093;
        var1.field5094 = this.field5094;
        var1.field5092 = this.field5092;
        return var1;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)V", line = 166)
    public final void method882(int arg0, int arg1, int arg2) {
        this.field5099 = this.field5090 = this.field5097 = this.field5093 = this.field5095 = this.field5088 = 0;
        this.field5096 = this.field5091 = this.field5094 = 32768;
        this.field5089 = arg0;
        this.field5098 = arg1;
        this.field5092 = arg2;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V", line = 173)
    public final void method888(int arg0, int arg1, int arg2) {
        this.field5089 += arg0;
        this.field5098 += arg1;
        this.field5092 += arg2;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 177)
    public class363() {
        this.method893();
    }
}
