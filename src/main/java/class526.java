import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class526 extends class517 {

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public int field7701;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public int field7702;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public int field7703;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public int field7704;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public int field7705;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public int field7706;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public int field7707;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public int field7708;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public int field7709;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public int field7710;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public int field7711;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public int field7712;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "(III)V")
    public final void method951(int arg0, int arg1, int arg2) {
        this.field7702 = this.field7712 = this.field7711 = this.field7710 = this.field7708 = this.field7701 = 0;
        this.field7705 = this.field7703 = this.field7706 = 32768;
        this.field7707 = arg0;
        this.field7709 = arg1;
        this.field7704 = arg2;
    }

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "(III)V")
    public final void method957(int arg0, int arg1, int arg2) {
        this.field7707 += arg0;
        this.field7709 += arg1;
        this.field7704 += arg2;
    }

    @OriginalMember(owner = "client!lc", name = "ea", descriptor = "(I)V")
    public final void method959(int arg0) {
        int var2 = class58.field889[arg0 & 0x3FFF];
        int var3 = class58.field891[arg0 & 0x3FFF];
        int var4 = this.field7702;
        int var5 = this.field7703;
        int var6 = this.field7701;
        int var7 = this.field7709;
        this.field7702 = var2 * var4 - this.field7712 * var3 >> 15;
        this.field7712 = this.field7712 * var2 + var3 * var4 >> 15;
        this.field7703 = var2 * var5 - this.field7710 * var3 >> 15;
        this.field7710 = this.field7710 * var2 + var3 * var5 >> 15;
        this.field7701 = var2 * var6 - this.field7706 * var3 >> 15;
        this.field7706 = this.field7706 * var2 + var3 * var6 >> 15;
        this.field7709 = var2 * var7 - this.field7704 * var3 >> 15;
        this.field7704 = this.field7704 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "(III[I)V")
    public final void method965(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field7708 * arg2 + this.field7711 * arg1 + this.field7705 * arg0 >> 15;
        arg3[1] = this.field7701 * arg2 + this.field7703 * arg1 + this.field7702 * arg0 >> 15;
        arg3[2] = this.field7706 * arg2 + this.field7712 * arg0 + this.field7710 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "()V")
    public final void method964() {
        this.field7702 = this.field7712 = this.field7711 = this.field7710 = this.field7708 = this.field7701 = this.field7707 = this.field7709 = this.field7704 = 0;
        this.field7705 = this.field7703 = this.field7706 = 32768;
    }

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "(I)V")
    public final void method954(int arg0) {
        this.field7706 = 32768;
        this.field7705 = this.field7703 = class58.field889[arg0 & 0x3FFF];
        this.field7702 = class58.field891[arg0 & 0x3FFF];
        this.field7711 = -this.field7702;
        this.field7708 = this.field7707 = this.field7701 = this.field7709 = this.field7712 = this.field7710 = this.field7704 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()Lc;")
    public final class517 method950() {
        class526 var1 = new class526();
        var1.field7705 = this.field7705;
        var1.field7711 = this.field7711;
        var1.field7708 = this.field7708;
        var1.field7707 = this.field7707;
        var1.field7702 = this.field7702;
        var1.field7703 = this.field7703;
        var1.field7701 = this.field7701;
        var1.field7709 = this.field7709;
        var1.field7712 = this.field7712;
        var1.field7710 = this.field7710;
        var1.field7706 = this.field7706;
        var1.field7704 = this.field7704;
        return var1;
    }

    @OriginalMember(owner = "client!lc", name = "ca", descriptor = "(I)V")
    public final void method960(int arg0) {
        this.field7703 = 32768;
        this.field7705 = this.field7706 = class58.field889[arg0 & 0x3FFF];
        this.field7708 = class58.field891[arg0 & 0x3FFF];
        this.field7712 = -this.field7708;
        this.field7711 = this.field7707 = this.field7702 = this.field7701 = this.field7709 = this.field7710 = this.field7704 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "wa", descriptor = "([I)V")
    public final void method958(int[] arg0) {
        int var2 = arg0[0] - this.field7707;
        int var3 = arg0[1] - this.field7709;
        int var4 = arg0[2] - this.field7704;
        arg0[0] = this.field7712 * var4 + this.field7705 * var2 + this.field7702 * var3 >> 15;
        arg0[1] = this.field7710 * var4 + this.field7711 * var2 + this.field7703 * var3 >> 15;
        arg0[2] = this.field7706 * var4 + this.field7708 * var2 + this.field7701 * var3 >> 15;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
    public final void method963(int arg0) {
        this.field7705 = 32768;
        this.field7703 = this.field7706 = class58.field889[arg0 & 0x3FFF];
        this.field7710 = class58.field891[arg0 & 0x3FFF];
        this.field7701 = -this.field7710;
        this.field7711 = this.field7708 = this.field7707 = this.field7702 = this.field7709 = this.field7712 = this.field7704 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "ha", descriptor = "(Lc;)V")
    public final void method962(class517 arg0) {
        class526 var2 = (class526) arg0;
        this.field7705 = var2.field7705;
        this.field7711 = var2.field7711;
        this.field7708 = var2.field7708;
        this.field7707 = var2.field7707;
        this.field7702 = var2.field7702;
        this.field7703 = var2.field7703;
        this.field7701 = var2.field7701;
        this.field7709 = var2.field7709;
        this.field7712 = var2.field7712;
        this.field7710 = var2.field7710;
        this.field7706 = var2.field7706;
        this.field7704 = var2.field7704;
    }

    @OriginalMember(owner = "client!lc", name = "EA", descriptor = "(I)V")
    public final void method952(int arg0) {
        int var2 = class58.field889[arg0 & 0x3FFF];
        int var3 = class58.field891[arg0 & 0x3FFF];
        int var4 = this.field7705;
        int var5 = this.field7711;
        int var6 = this.field7708;
        int var7 = this.field7707;
        this.field7705 = this.field7712 * var3 + var2 * var4 >> 15;
        this.field7712 = this.field7712 * var2 - var3 * var4 >> 15;
        this.field7711 = this.field7710 * var3 + var2 * var5 >> 15;
        this.field7710 = this.field7710 * var2 - var3 * var5 >> 15;
        this.field7708 = this.field7706 * var3 + var2 * var6 >> 15;
        this.field7706 = this.field7706 * var2 - var3 * var6 >> 15;
        this.field7707 = this.field7704 * var3 + var2 * var7 >> 15;
        this.field7704 = this.field7704 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III[I)V")
    public final void method961(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field7708 * arg2 + this.field7711 * arg1 + this.field7705 * arg0 >> 15) + this.field7707;
        arg3[1] = (this.field7701 * arg2 + this.field7703 * arg1 + this.field7702 * arg0 >> 15) + this.field7709;
        arg3[2] = (this.field7706 * arg2 + this.field7712 * arg0 + this.field7710 * arg1 >> 15) + this.field7704;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class526() {
        this.method964();
    }

    @OriginalMember(owner = "client!lc", name = "YA", descriptor = "(IIIIII)V")
    public final void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class58.field889[arg3 & 0x3FFF];
        int var8 = class58.field891[arg3 & 0x3FFF];
        int var9 = class58.field889[arg4 & 0x3FFF];
        int var10 = class58.field891[arg4 & 0x3FFF];
        int var11 = class58.field889[arg5 & 0x3FFF];
        int var12 = class58.field891[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field7705 = var9 * var11 + var10 * var14 >> 15;
        this.field7702 = -var9 * var12 + var10 * var13 >> 15;
        this.field7712 = var7 * var10 >> 15;
        this.field7711 = var7 * var12 >> 15;
        this.field7703 = var7 * var11 >> 15;
        this.field7710 = -var8;
        this.field7708 = -var10 * var11 + var9 * var14 >> 15;
        this.field7701 = var9 * var13 + var10 * var12 >> 15;
        this.field7706 = var7 * var9 >> 15;
        this.field7707 = -arg0 * this.field7705 - this.field7711 * arg1 - this.field7708 * arg2 >> 15;
        this.field7709 = -arg0 * this.field7702 - this.field7703 * arg1 - this.field7701 * arg2 >> 15;
        this.field7704 = -arg0 * this.field7712 - this.field7710 * arg1 - this.field7706 * arg2 >> 15;
    }
}
