import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class53 extends class23 {

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public int field712;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "client!lp", name = "na", descriptor = "(I)V")
    public final void method186(int arg0) {
        int var2 = class525.field7763[arg0 & 0x3FFF];
        int var3 = class525.field7760[arg0 & 0x3FFF];
        int var4 = this.field710;
        int var5 = this.field709;
        int var6 = this.field717;
        int var7 = this.field716;
        this.field710 = var2 * var4 - this.field711 * var3 >> 15;
        this.field711 = this.field711 * var2 + var3 * var4 >> 15;
        this.field709 = var2 * var5 - this.field707 * var3 >> 15;
        this.field707 = this.field707 * var2 + var3 * var5 >> 15;
        this.field717 = var2 * var6 - this.field713 * var3 >> 15;
        this.field713 = this.field713 * var2 + var3 * var6 >> 15;
        this.field716 = var2 * var7 - this.field718 * var3 >> 15;
        this.field718 = this.field718 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "(III[I)V")
    public final void method188(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field715 * arg2 + this.field712 * arg1 + this.field708 * arg0 >> 15;
        arg3[1] = this.field717 * arg2 + this.field710 * arg0 + this.field709 * arg1 >> 15;
        arg3[2] = this.field713 * arg2 + this.field711 * arg0 + this.field707 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!lp", name = "ZA", descriptor = "(III)V")
    public final void method177(int arg0, int arg1, int arg2) {
        this.field714 += arg0;
        this.field716 += arg1;
        this.field718 += arg2;
    }

    @OriginalMember(owner = "client!lp", name = "O", descriptor = "(I)V")
    public final void method175(int arg0) {
        this.field709 = 32768;
        this.field708 = this.field713 = class525.field7763[arg0 & 0x3FFF];
        this.field715 = class525.field7760[arg0 & 0x3FFF];
        this.field711 = -this.field715;
        this.field712 = this.field714 = this.field710 = this.field717 = this.field716 = this.field707 = this.field718 = 0;
    }

    @OriginalMember(owner = "client!lp", name = "ba", descriptor = "(Lia;)V")
    public final void method179(class23 arg0) {
        class53 var2 = (class53) arg0;
        this.field708 = var2.field708;
        this.field712 = var2.field712;
        this.field715 = var2.field715;
        this.field714 = var2.field714;
        this.field710 = var2.field710;
        this.field709 = var2.field709;
        this.field717 = var2.field717;
        this.field716 = var2.field716;
        this.field711 = var2.field711;
        this.field707 = var2.field707;
        this.field713 = var2.field713;
        this.field718 = var2.field718;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III[I)V")
    public final void method174(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field715 * arg2 + this.field712 * arg1 + this.field708 * arg0 >> 15) + this.field714;
        arg3[1] = (this.field717 * arg2 + this.field710 * arg0 + this.field709 * arg1 >> 15) + this.field716;
        arg3[2] = (this.field713 * arg2 + this.field711 * arg0 + this.field707 * arg1 >> 15) + this.field718;
    }

    @OriginalMember(owner = "client!lp", name = "R", descriptor = "(III)V")
    public final void method185(int arg0, int arg1, int arg2) {
        this.field710 = this.field711 = this.field712 = this.field707 = this.field715 = this.field717 = 0;
        this.field708 = this.field709 = this.field713 = 32768;
        this.field714 = arg0;
        this.field716 = arg1;
        this.field718 = arg2;
    }

    @OriginalMember(owner = "client!lp", name = "Q", descriptor = "(IIIIII)V")
    public final void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class525.field7763[arg3 & 0x3FFF];
        int var8 = class525.field7760[arg3 & 0x3FFF];
        int var9 = class525.field7763[arg4 & 0x3FFF];
        int var10 = class525.field7760[arg4 & 0x3FFF];
        int var11 = class525.field7763[arg5 & 0x3FFF];
        int var12 = class525.field7760[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field708 = var9 * var11 + var10 * var14 >> 15;
        this.field710 = -var9 * var12 + var10 * var13 >> 15;
        this.field711 = var7 * var10 >> 15;
        this.field712 = var7 * var12 >> 15;
        this.field709 = var7 * var11 >> 15;
        this.field707 = -var8;
        this.field715 = -var10 * var11 + var9 * var14 >> 15;
        this.field717 = var9 * var13 + var10 * var12 >> 15;
        this.field713 = var7 * var9 >> 15;
        this.field714 = -arg0 * this.field708 - this.field712 * arg1 - this.field715 * arg2 >> 15;
        this.field716 = -arg0 * this.field710 - this.field709 * arg1 - this.field717 * arg2 >> 15;
        this.field718 = -arg0 * this.field711 - this.field707 * arg1 - this.field713 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!lp", name = "ma", descriptor = "(I)V")
    public final void method178(int arg0) {
        this.field713 = 32768;
        this.field708 = this.field709 = class525.field7763[arg0 & 0x3FFF];
        this.field710 = class525.field7760[arg0 & 0x3FFF];
        this.field712 = -this.field710;
        this.field715 = this.field714 = this.field717 = this.field716 = this.field711 = this.field707 = this.field718 = 0;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "()Lia;")
    public final class23 method183() {
        class53 var1 = new class53();
        var1.field708 = this.field708;
        var1.field712 = this.field712;
        var1.field715 = this.field715;
        var1.field714 = this.field714;
        var1.field710 = this.field710;
        var1.field709 = this.field709;
        var1.field717 = this.field717;
        var1.field716 = this.field716;
        var1.field711 = this.field711;
        var1.field707 = this.field707;
        var1.field713 = this.field713;
        var1.field718 = this.field718;
        return var1;
    }

    @OriginalMember(owner = "client!lp", name = "HA", descriptor = "()V")
    public final void method189() {
        this.field710 = this.field711 = this.field712 = this.field707 = this.field715 = this.field717 = this.field714 = this.field716 = this.field718 = 0;
        this.field708 = this.field709 = this.field713 = 32768;
    }

    @OriginalMember(owner = "client!lp", name = "X", descriptor = "([I)V")
    public final void method176(int[] arg0) {
        int var2 = arg0[0] - this.field714;
        int var3 = arg0[1] - this.field716;
        int var4 = arg0[2] - this.field718;
        arg0[0] = this.field711 * var4 + this.field710 * var3 + this.field708 * var2 >> 15;
        arg0[1] = this.field707 * var4 + this.field712 * var2 + this.field709 * var3 >> 15;
        arg0[2] = this.field713 * var4 + this.field717 * var3 + this.field715 * var2 >> 15;
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
    public final void method181(int arg0) {
        int var2 = class525.field7763[arg0 & 0x3FFF];
        int var3 = class525.field7760[arg0 & 0x3FFF];
        int var4 = this.field708;
        int var5 = this.field712;
        int var6 = this.field715;
        int var7 = this.field714;
        this.field708 = this.field711 * var3 + var2 * var4 >> 15;
        this.field711 = this.field711 * var2 - var3 * var4 >> 15;
        this.field712 = this.field707 * var3 + var2 * var5 >> 15;
        this.field707 = this.field707 * var2 - var3 * var5 >> 15;
        this.field715 = this.field713 * var3 + var2 * var6 >> 15;
        this.field713 = this.field713 * var2 - var3 * var6 >> 15;
        this.field714 = this.field718 * var3 + var2 * var7 >> 15;
        this.field718 = this.field718 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!lp", name = "YA", descriptor = "(I)V")
    public final void method182(int arg0) {
        this.field708 = 32768;
        this.field709 = this.field713 = class525.field7763[arg0 & 0x3FFF];
        this.field707 = class525.field7760[arg0 & 0x3FFF];
        this.field717 = -this.field707;
        this.field712 = this.field715 = this.field714 = this.field710 = this.field716 = this.field711 = this.field718 = 0;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
    public class53() {
        this.method189();
    }
}
