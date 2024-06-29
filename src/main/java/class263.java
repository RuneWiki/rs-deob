import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class263 extends class111 {

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public int field3616;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public int field3618;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public int field3619;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public int field3620;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public int field3621;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public int field3622;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public int field3623;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
    public int field3624;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
    public int field3625;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public int field3626;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public int field3627;

    @OriginalMember(owner = "client!bt", name = "R", descriptor = "(III[I)V")
    public final void method598(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field3617 * arg2 + this.field3624 * arg1 + this.field3616 * arg0 >> 14;
        arg3[1] = this.field3619 * arg2 + this.field3627 * arg1 + this.field3620 * arg0 >> 14;
        arg3[2] = this.field3621 * arg2 + this.field3625 * arg0 + this.field3618 * arg1 >> 14;
    }

    @OriginalMember(owner = "client!bt", name = "la", descriptor = "(Lq;)V")
    public final void method597(class111 arg0) {
        class263 var2 = (class263) arg0;
        this.field3616 = var2.field3616;
        this.field3624 = var2.field3624;
        this.field3617 = var2.field3617;
        this.field3626 = var2.field3626;
        this.field3620 = var2.field3620;
        this.field3627 = var2.field3627;
        this.field3619 = var2.field3619;
        this.field3622 = var2.field3622;
        this.field3625 = var2.field3625;
        this.field3618 = var2.field3618;
        this.field3621 = var2.field3621;
        this.field3623 = var2.field3623;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "()Lq;")
    public final class111 method596() {
        class263 var1 = new class263();
        var1.field3616 = this.field3616;
        var1.field3624 = this.field3624;
        var1.field3617 = this.field3617;
        var1.field3626 = this.field3626;
        var1.field3620 = this.field3620;
        var1.field3627 = this.field3627;
        var1.field3619 = this.field3619;
        var1.field3622 = this.field3622;
        var1.field3625 = this.field3625;
        var1.field3618 = this.field3618;
        var1.field3621 = this.field3621;
        var1.field3623 = this.field3623;
        return var1;
    }

    @OriginalMember(owner = "client!bt", name = "XA", descriptor = "(I)V")
    public final void method603(int arg0) {
        this.field3616 = 16384;
        this.field3627 = this.field3621 = class654.field9260[arg0 & 0x3FFF];
        this.field3618 = class654.field9259[arg0 & 0x3FFF];
        this.field3619 = -this.field3618;
        this.field3624 = this.field3617 = this.field3626 = this.field3620 = this.field3622 = this.field3625 = this.field3623 = 0;
    }

    @OriginalMember(owner = "client!bt", name = "GA", descriptor = "(III)V")
    public final void method609(int arg0, int arg1, int arg2) {
        this.field3620 = this.field3625 = this.field3624 = this.field3618 = this.field3617 = this.field3619 = 0;
        this.field3616 = this.field3627 = this.field3621 = 16384;
        this.field3626 = arg0;
        this.field3622 = arg1;
        this.field3623 = arg2;
    }

    @OriginalMember(owner = "client!bt", name = "pa", descriptor = "(IIIIII)V")
    public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class654.field9260[arg3 & 0x3FFF];
        int var8 = class654.field9259[arg3 & 0x3FFF];
        int var9 = class654.field9260[arg4 & 0x3FFF];
        int var10 = class654.field9259[arg4 & 0x3FFF];
        int var11 = class654.field9260[arg5 & 0x3FFF];
        int var12 = class654.field9259[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 14;
        int var14 = var8 * var12 >> 14;
        this.field3616 = var9 * var11 + var10 * var14 >> 14;
        this.field3620 = -var9 * var12 + var10 * var13 >> 14;
        this.field3625 = var7 * var10 >> 14;
        this.field3624 = var7 * var12 >> 14;
        this.field3627 = var7 * var11 >> 14;
        this.field3618 = -var8;
        this.field3617 = -var10 * var11 + var9 * var14 >> 14;
        this.field3619 = var9 * var13 + var10 * var12 >> 14;
        this.field3621 = var7 * var9 >> 14;
        this.field3626 = -arg0 * this.field3616 - this.field3624 * arg1 - this.field3617 * arg2 >> 14;
        this.field3622 = -arg0 * this.field3620 - this.field3627 * arg1 - this.field3619 * arg2 >> 14;
        this.field3623 = -arg0 * this.field3625 - this.field3618 * arg1 - this.field3621 * arg2 >> 14;
    }

    @OriginalMember(owner = "client!bt", name = "P", descriptor = "(I)V")
    public final void method601(int arg0) {
        int var2 = class654.field9260[arg0 & 0x3FFF];
        int var3 = class654.field9259[arg0 & 0x3FFF];
        int var4 = this.field3616;
        int var5 = this.field3624;
        int var6 = this.field3617;
        int var7 = this.field3626;
        this.field3616 = this.field3625 * var3 + var2 * var4 >> 14;
        this.field3625 = this.field3625 * var2 - var3 * var4 >> 14;
        this.field3624 = this.field3618 * var3 + var2 * var5 >> 14;
        this.field3618 = this.field3618 * var2 - var3 * var5 >> 14;
        this.field3617 = this.field3621 * var3 + var2 * var6 >> 14;
        this.field3621 = this.field3621 * var2 - var3 * var6 >> 14;
        this.field3626 = this.field3623 * var3 + var2 * var7 >> 14;
        this.field3623 = this.field3623 * var2 - var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!bt", name = "O", descriptor = "([I)V")
    public final void method599(int[] arg0) {
        int var2 = arg0[0] - this.field3626;
        int var3 = arg0[1] - this.field3622;
        int var4 = arg0[2] - this.field3623;
        arg0[0] = this.field3625 * var4 + this.field3620 * var3 + this.field3616 * var2 >> 14;
        arg0[1] = this.field3618 * var4 + this.field3627 * var3 + this.field3624 * var2 >> 14;
        arg0[2] = this.field3621 * var4 + this.field3619 * var3 + this.field3617 * var2 >> 14;
    }

    @OriginalMember(owner = "client!bt", name = "S", descriptor = "(I)V")
    public final void method606(int arg0) {
        int var2 = class654.field9260[arg0 & 0x3FFF];
        int var3 = class654.field9259[arg0 & 0x3FFF];
        int var4 = this.field3620;
        int var5 = this.field3627;
        int var6 = this.field3619;
        int var7 = this.field3622;
        this.field3620 = var2 * var4 - this.field3625 * var3 >> 14;
        this.field3625 = this.field3625 * var2 + var3 * var4 >> 14;
        this.field3627 = var2 * var5 - this.field3618 * var3 >> 14;
        this.field3618 = this.field3618 * var2 + var3 * var5 >> 14;
        this.field3619 = var2 * var6 - this.field3621 * var3 >> 14;
        this.field3621 = this.field3621 * var2 + var3 * var6 >> 14;
        this.field3622 = var2 * var7 - this.field3623 * var3 >> 14;
        this.field3623 = this.field3623 * var2 + var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "(III)V")
    public final void method595(int arg0, int arg1, int arg2) {
        this.field3626 += arg0;
        this.field3622 += arg1;
        this.field3623 += arg2;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(III[I)V")
    public final void method608(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field3617 * arg2 + this.field3624 * arg1 + this.field3616 * arg0 >> 14) + this.field3626;
        arg3[1] = (this.field3619 * arg2 + this.field3627 * arg1 + this.field3620 * arg0 >> 14) + this.field3622;
        arg3[2] = (this.field3621 * arg2 + this.field3625 * arg0 + this.field3618 * arg1 >> 14) + this.field3623;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public final void method604(int arg0) {
        this.field3627 = 16384;
        this.field3616 = this.field3621 = class654.field9260[arg0 & 0x3FFF];
        this.field3617 = class654.field9259[arg0 & 0x3FFF];
        this.field3625 = -this.field3617;
        this.field3624 = this.field3626 = this.field3620 = this.field3619 = this.field3622 = this.field3618 = this.field3623 = 0;
    }

    @OriginalMember(owner = "client!bt", name = "ra", descriptor = "(I)V")
    public final void method605(int arg0) {
        this.field3621 = 16384;
        this.field3616 = this.field3627 = class654.field9260[arg0 & 0x3FFF];
        this.field3620 = class654.field9259[arg0 & 0x3FFF];
        this.field3624 = -this.field3620;
        this.field3617 = this.field3626 = this.field3619 = this.field3622 = this.field3625 = this.field3618 = this.field3623 = 0;
    }

    @OriginalMember(owner = "client!bt", name = "Y", descriptor = "()V")
    public final void method600() {
        this.field3620 = this.field3625 = this.field3624 = this.field3618 = this.field3617 = this.field3619 = this.field3626 = this.field3622 = this.field3623 = 0;
        this.field3616 = this.field3627 = this.field3621 = 16384;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
    public class263() {
        this.method600();
    }
}
