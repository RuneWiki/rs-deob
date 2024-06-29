import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class15 {

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public int field73;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public int field75;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public int field80;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "()V", line = 6)
    public final void method34() {
        this.field80 = this.field79 = this.field73 = this.field72 = this.field78 = this.field75 = this.field83 = this.field77 = this.field74 = 0;
        this.field82 = this.field81 = this.field76 = 32768;
    }

    @OriginalMember(owner = "client!ff", name = "IA", descriptor = "(IIIIII)V", line = 11)
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class358.field5203[arg3 & 0x3FFF];
        int var8 = class358.field5204[arg3 & 0x3FFF];
        int var9 = class358.field5203[arg4 & 0x3FFF];
        int var10 = class358.field5204[arg4 & 0x3FFF];
        int var11 = class358.field5203[arg5 & 0x3FFF];
        int var12 = class358.field5204[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field82 = var9 * var11 + var10 * var14 >> 15;
        this.field80 = -var9 * var12 + var10 * var13 >> 15;
        this.field79 = var7 * var10 >> 15;
        this.field73 = var7 * var12 >> 15;
        this.field81 = var7 * var11 >> 15;
        this.field72 = -var8;
        this.field78 = -var10 * var11 + var9 * var14 >> 15;
        this.field75 = var9 * var13 + var10 * var12 >> 15;
        this.field76 = var7 * var9 >> 15;
        this.field83 = -arg0 * this.field82 - this.field73 * arg1 - this.field78 * arg2 >> 15;
        this.field77 = -arg0 * this.field80 - this.field81 * arg1 - this.field75 * arg2 >> 15;
        this.field74 = -arg0 * this.field79 - this.field72 * arg1 - this.field76 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ff", name = "CA", descriptor = "(I)V", line = 41)
    public final void method36(int arg0) {
        int var2 = class358.field5203[arg0 & 0x3FFF];
        int var3 = class358.field5204[arg0 & 0x3FFF];
        int var4 = this.field82;
        int var5 = this.field73;
        int var6 = this.field78;
        int var7 = this.field83;
        this.field82 = this.field79 * var3 + var2 * var4 >> 15;
        this.field79 = this.field79 * var2 - var3 * var4 >> 15;
        this.field73 = this.field72 * var3 + var2 * var5 >> 15;
        this.field72 = this.field72 * var2 - var3 * var5 >> 15;
        this.field78 = this.field76 * var3 + var2 * var6 >> 15;
        this.field76 = this.field76 * var2 - var3 * var6 >> 15;
        this.field83 = this.field74 * var3 + var2 * var7 >> 15;
        this.field74 = this.field74 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "(III)V", line = 65)
    public final void method37(int arg0, int arg1, int arg2) {
        this.field83 += arg0;
        this.field77 += arg1;
        this.field74 += arg2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()Ln;", line = 75)
    public final class15 method38() {
        class9 var1 = new class9();
        var1.field82 = this.field82;
        var1.field73 = this.field73;
        var1.field78 = this.field78;
        var1.field83 = this.field83;
        var1.field80 = this.field80;
        var1.field81 = this.field81;
        var1.field75 = this.field75;
        var1.field77 = this.field77;
        var1.field79 = this.field79;
        var1.field72 = this.field72;
        var1.field76 = this.field76;
        var1.field74 = this.field74;
        return var1;
    }

    @OriginalMember(owner = "client!ff", name = "ba", descriptor = "(I)V", line = 94)
    public final void method39(int arg0) {
        int var2 = class358.field5203[arg0 & 0x3FFF];
        int var3 = class358.field5204[arg0 & 0x3FFF];
        int var4 = this.field80;
        int var5 = this.field81;
        int var6 = this.field75;
        int var7 = this.field77;
        this.field80 = var2 * var4 - this.field79 * var3 >> 15;
        this.field79 = this.field79 * var2 + var3 * var4 >> 15;
        this.field81 = var2 * var5 - this.field72 * var3 >> 15;
        this.field72 = this.field72 * var2 + var3 * var5 >> 15;
        this.field75 = var2 * var6 - this.field76 * var3 >> 15;
        this.field76 = this.field76 * var2 + var3 * var6 >> 15;
        this.field77 = var2 * var7 - this.field74 * var3 >> 15;
        this.field74 = this.field74 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "([I)V", line = 116)
    public final void method40(int[] arg0) {
        int var2 = arg0[0] - this.field83;
        int var3 = arg0[1] - this.field77;
        int var4 = arg0[2] - this.field74;
        arg0[0] = this.field79 * var4 + this.field82 * var2 + this.field80 * var3 >> 15;
        arg0[1] = this.field72 * var4 + this.field81 * var3 + this.field73 * var2 >> 15;
        arg0[2] = this.field76 * var4 + this.field78 * var2 + this.field75 * var3 >> 15;
    }

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "(I)V", line = 126)
    public final void method41(int arg0) {
        this.field81 = 32768;
        this.field82 = this.field76 = class358.field5203[arg0 & 0x3FFF];
        this.field78 = class358.field5204[arg0 & 0x3FFF];
        this.field79 = -this.field78;
        this.field73 = this.field83 = this.field80 = this.field75 = this.field77 = this.field72 = this.field74 = 0;
    }

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "(III[I)V", line = 135)
    public final void method42(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field78 * arg2 + this.field82 * arg0 + this.field73 * arg1 >> 15;
        arg3[1] = this.field75 * arg2 + this.field81 * arg1 + this.field80 * arg0 >> 15;
        arg3[2] = this.field76 * arg2 + this.field79 * arg0 + this.field72 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III[I)V", line = 142)
    public final void method43(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field78 * arg2 + this.field82 * arg0 + this.field73 * arg1 >> 15) + this.field83;
        arg3[1] = (this.field75 * arg2 + this.field81 * arg1 + this.field80 * arg0 >> 15) + this.field77;
        arg3[2] = (this.field76 * arg2 + this.field79 * arg0 + this.field72 * arg1 >> 15) + this.field74;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 146)
    public class9() {
        this.method34();
    }

    @OriginalMember(owner = "client!ff", name = "SA", descriptor = "(I)V", line = 150)
    public final void method44(int arg0) {
        this.field82 = 32768;
        this.field81 = this.field76 = class358.field5203[arg0 & 0x3FFF];
        this.field72 = class358.field5204[arg0 & 0x3FFF];
        this.field75 = -this.field72;
        this.field73 = this.field78 = this.field83 = this.field80 = this.field77 = this.field79 = this.field74 = 0;
    }

    @OriginalMember(owner = "client!ff", name = "ya", descriptor = "(Ln;)V", line = 158)
    public final void method45(class15 arg0) {
        class9 var2 = (class9) arg0;
        this.field82 = var2.field82;
        this.field73 = var2.field73;
        this.field78 = var2.field78;
        this.field83 = var2.field83;
        this.field80 = var2.field80;
        this.field81 = var2.field81;
        this.field75 = var2.field75;
        this.field77 = var2.field77;
        this.field79 = var2.field79;
        this.field72 = var2.field72;
        this.field76 = var2.field76;
        this.field74 = var2.field74;
    }

    @OriginalMember(owner = "client!ff", name = "WA", descriptor = "(I)V", line = 173)
    public final void method46(int arg0) {
        this.field76 = 32768;
        this.field82 = this.field81 = class358.field5203[arg0 & 0x3FFF];
        this.field80 = class358.field5204[arg0 & 0x3FFF];
        this.field73 = -this.field80;
        this.field78 = this.field83 = this.field75 = this.field77 = this.field79 = this.field72 = this.field74 = 0;
    }

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "(III)V", line = 180)
    public final void method47(int arg0, int arg1, int arg2) {
        this.field80 = this.field79 = this.field73 = this.field72 = this.field78 = this.field75 = 0;
        this.field82 = this.field81 = this.field76 = 32768;
        this.field83 = arg0;
        this.field77 = arg1;
        this.field74 = arg2;
    }
}
