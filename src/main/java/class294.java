import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class294 extends class435 {

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public int field4698;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public int field4699;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public int field4700;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public int field4701;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public int field4702;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public int field4703;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public int field4704;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public int field4705;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public int field4707;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public int field4708;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public int field4709;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V", line = 7)
    public final void method1984(int arg0, int arg1, int arg2) {
        this.field4706 = this.field4707 = this.field4709 = this.field4704 = this.field4699 = this.field4702 = 0;
        this.field4705 = this.field4698 = this.field4701 = 32768;
        this.field4703 = arg0;
        this.field4708 = arg1;
        this.field4700 = arg2;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([I)V", line = 15)
    public final void method1985(int[] arg0) {
        int var2 = arg0[0] - this.field4703;
        int var3 = arg0[1] - this.field4708;
        int var4 = arg0[2] - this.field4700;
        arg0[0] = this.field4707 * var4 + this.field4706 * var3 + this.field4705 * var2 >> 15;
        arg0[1] = this.field4704 * var4 + this.field4709 * var2 + this.field4698 * var3 >> 15;
        arg0[2] = this.field4701 * var4 + this.field4702 * var3 + this.field4699 * var2 >> 15;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V", line = 27)
    public final void method1986(int arg0) {
        this.field4705 = 32768;
        this.field4698 = this.field4701 = class258.field4173[arg0 & 0x3FFF];
        this.field4704 = class258.field4177[arg0 & 0x3FFF];
        this.field4702 = -this.field4704;
        this.field4709 = this.field4699 = this.field4703 = this.field4706 = this.field4708 = this.field4707 = this.field4700 = 0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)V", line = 36)
    public final void method1987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class258.field4173[arg3 & 0x3FFF];
        int var8 = class258.field4177[arg3 & 0x3FFF];
        int var9 = class258.field4173[arg4 & 0x3FFF];
        int var10 = class258.field4177[arg4 & 0x3FFF];
        int var11 = class258.field4173[arg5 & 0x3FFF];
        int var12 = class258.field4177[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field4705 = var9 * var11 + var10 * var14 >> 15;
        this.field4706 = -var9 * var12 + var10 * var13 >> 15;
        this.field4707 = var7 * var10 >> 15;
        this.field4709 = var7 * var12 >> 15;
        this.field4698 = var7 * var11 >> 15;
        this.field4704 = -var8;
        this.field4699 = -var10 * var11 + var9 * var14 >> 15;
        this.field4702 = var9 * var13 + var10 * var12 >> 15;
        this.field4701 = var7 * var9 >> 15;
        this.field4703 = -arg0 * this.field4705 - this.field4709 * arg1 - this.field4699 * arg2 >> 15;
        this.field4708 = -arg0 * this.field4706 - this.field4698 * arg1 - this.field4702 * arg2 >> 15;
        this.field4700 = -arg0 * this.field4707 - this.field4704 * arg1 - this.field4701 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V", line = 69)
    public final void method1988() {
        this.field4706 = this.field4707 = this.field4709 = this.field4704 = this.field4699 = this.field4702 = this.field4703 = this.field4708 = this.field4700 = 0;
        this.field4705 = this.field4698 = this.field4701 = 32768;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 73)
    public final void method1989(int arg0) {
        this.field4701 = 32768;
        this.field4705 = this.field4698 = class258.field4173[arg0 & 0x3FFF];
        this.field4706 = class258.field4177[arg0 & 0x3FFF];
        this.field4709 = -this.field4706;
        this.field4699 = this.field4703 = this.field4702 = this.field4708 = this.field4707 = this.field4704 = this.field4700 = 0;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()Lek;", line = 81)
    public final class294 method1990() {
        class294 var1 = new class294();
        var1.field4705 = this.field4705;
        var1.field4709 = this.field4709;
        var1.field4699 = this.field4699;
        var1.field4703 = this.field4703;
        var1.field4706 = this.field4706;
        var1.field4698 = this.field4698;
        var1.field4702 = this.field4702;
        var1.field4708 = this.field4708;
        var1.field4707 = this.field4707;
        var1.field4704 = this.field4704;
        var1.field4701 = this.field4701;
        var1.field4700 = this.field4700;
        return var1;
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V", line = 97)
    public final void method1991(int arg0) {
        this.field4698 = 32768;
        this.field4705 = this.field4701 = class258.field4173[arg0 & 0x3FFF];
        this.field4699 = class258.field4177[arg0 & 0x3FFF];
        this.field4707 = -this.field4699;
        this.field4709 = this.field4703 = this.field4706 = this.field4702 = this.field4708 = this.field4704 = this.field4700 = 0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lpg;)V", line = 105)
    public final void method1992(class435 arg0) {
        class294 var2 = (class294) arg0;
        this.field4705 = var2.field4705;
        this.field4709 = var2.field4709;
        this.field4699 = var2.field4699;
        this.field4703 = var2.field4703;
        this.field4706 = var2.field4706;
        this.field4698 = var2.field4698;
        this.field4702 = var2.field4702;
        this.field4708 = var2.field4708;
        this.field4707 = var2.field4707;
        this.field4704 = var2.field4704;
        this.field4701 = var2.field4701;
        this.field4700 = var2.field4700;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V", line = 121)
    public final void method1993(int arg0) {
        int var2 = class258.field4173[arg0 & 0x3FFF];
        int var3 = class258.field4177[arg0 & 0x3FFF];
        int var4 = this.field4706;
        int var5 = this.field4698;
        int var6 = this.field4702;
        int var7 = this.field4708;
        this.field4706 = var2 * var4 - this.field4707 * var3 >> 15;
        this.field4707 = this.field4707 * var2 + var3 * var4 >> 15;
        this.field4698 = var2 * var5 - this.field4704 * var3 >> 15;
        this.field4704 = this.field4704 * var2 + var3 * var5 >> 15;
        this.field4702 = var2 * var6 - this.field4701 * var3 >> 15;
        this.field4701 = this.field4701 * var2 + var3 * var6 >> 15;
        this.field4708 = var2 * var7 - this.field4700 * var3 >> 15;
        this.field4700 = this.field4700 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 143)
    public final void method1994(int arg0) {
        int var2 = class258.field4173[arg0 & 0x3FFF];
        int var3 = class258.field4177[arg0 & 0x3FFF];
        int var4 = this.field4705;
        int var5 = this.field4709;
        int var6 = this.field4699;
        int var7 = this.field4703;
        this.field4705 = this.field4707 * var3 + var2 * var4 >> 15;
        this.field4707 = this.field4707 * var2 - var3 * var4 >> 15;
        this.field4709 = this.field4704 * var3 + var2 * var5 >> 15;
        this.field4704 = this.field4704 * var2 - var3 * var5 >> 15;
        this.field4699 = this.field4701 * var3 + var2 * var6 >> 15;
        this.field4701 = this.field4701 * var2 - var3 * var6 >> 15;
        this.field4703 = this.field4700 * var3 + var2 * var7 >> 15;
        this.field4700 = this.field4700 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)V", line = 164)
    public final void method1995(int arg0, int arg1, int arg2) {
        this.field4703 += arg0;
        this.field4708 += arg1;
        this.field4700 += arg2;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[I)V", line = 170)
    public final void method1996(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field4699 * arg2 + this.field4709 * arg1 + this.field4705 * arg0 >> 15) + this.field4703;
        arg3[1] = (this.field4702 * arg2 + this.field4706 * arg0 + this.field4698 * arg1 >> 15) + this.field4708;
        arg3[2] = (this.field4701 * arg2 + this.field4707 * arg0 + this.field4704 * arg1 >> 15) + this.field4700;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 177)
    public class294() {
        this.method1988();
    }
}
