import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class122 extends class187 {

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V", line = 4)
    public final void method821(int arg0) {
        int var2 = class327.field4862[arg0 & 0x3FFF];
        int var3 = class327.field4863[arg0 & 0x3FFF];
        int var4 = this.field1630;
        int var5 = this.field1629;
        int var6 = this.field1627;
        int var7 = this.field1624;
        this.field1630 = this.field1625 * var3 + var2 * var4 >> 15;
        this.field1625 = this.field1625 * var2 - var3 * var4 >> 15;
        this.field1629 = this.field1623 * var3 + var2 * var5 >> 15;
        this.field1623 = this.field1623 * var2 - var3 * var5 >> 15;
        this.field1627 = this.field1628 * var3 + var2 * var6 >> 15;
        this.field1628 = this.field1628 * var2 - var3 * var6 >> 15;
        this.field1624 = this.field1622 * var3 + var2 * var7 >> 15;
        this.field1622 = this.field1622 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIII)V", line = 27)
    public final void method822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class327.field4862[arg3 & 0x3FFF];
        int var8 = class327.field4863[arg3 & 0x3FFF];
        int var9 = class327.field4862[arg4 & 0x3FFF];
        int var10 = class327.field4863[arg4 & 0x3FFF];
        int var11 = class327.field4862[arg5 & 0x3FFF];
        int var12 = class327.field4863[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field1630 = var9 * var11 + var10 * var14 >> 15;
        this.field1631 = -var9 * var12 + var10 * var13 >> 15;
        this.field1625 = var7 * var10 >> 15;
        this.field1629 = var7 * var12 >> 15;
        this.field1620 = var7 * var11 >> 15;
        this.field1623 = -var8;
        this.field1627 = -var10 * var11 + var9 * var14 >> 15;
        this.field1621 = var9 * var13 + var10 * var12 >> 15;
        this.field1628 = var7 * var9 >> 15;
        this.field1624 = -arg0 * this.field1630 - this.field1629 * arg1 - this.field1627 * arg2 >> 15;
        this.field1626 = -arg0 * this.field1631 - this.field1620 * arg1 - this.field1621 * arg2 >> 15;
        this.field1622 = -arg0 * this.field1625 - this.field1623 * arg1 - this.field1628 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)V", line = 57)
    public final void method823(int arg0, int arg1, int arg2) {
        this.field1624 += arg0;
        this.field1626 += arg1;
        this.field1622 += arg2;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "()Loi;", line = 64)
    public final class122 method824() {
        class122 var1 = new class122();
        var1.field1630 = this.field1630;
        var1.field1629 = this.field1629;
        var1.field1627 = this.field1627;
        var1.field1624 = this.field1624;
        var1.field1631 = this.field1631;
        var1.field1620 = this.field1620;
        var1.field1621 = this.field1621;
        var1.field1626 = this.field1626;
        var1.field1625 = this.field1625;
        var1.field1623 = this.field1623;
        var1.field1628 = this.field1628;
        var1.field1622 = this.field1622;
        return var1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([I)V", line = 82)
    public final void method825(int[] arg0) {
        int var2 = arg0[0] - this.field1624;
        int var3 = arg0[1] - this.field1626;
        int var4 = arg0[2] - this.field1622;
        arg0[0] = this.field1625 * var4 + this.field1631 * var3 + this.field1630 * var2 >> 15;
        arg0[1] = this.field1623 * var4 + this.field1629 * var2 + this.field1620 * var3 >> 15;
        arg0[2] = this.field1628 * var4 + this.field1627 * var2 + this.field1621 * var3 >> 15;
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V", line = 95)
    public final void method826(int arg0) {
        this.field1630 = 32768;
        this.field1620 = this.field1628 = class327.field4862[arg0 & 0x3FFF];
        this.field1623 = class327.field4863[arg0 & 0x3FFF];
        this.field1621 = -this.field1623;
        this.field1629 = this.field1627 = this.field1624 = this.field1631 = this.field1626 = this.field1625 = this.field1622 = 0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()V", line = 102)
    public final void method827() {
        this.field1631 = this.field1625 = this.field1629 = this.field1623 = this.field1627 = this.field1621 = this.field1624 = this.field1626 = this.field1622 = 0;
        this.field1630 = this.field1620 = this.field1628 = 32768;
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V", line = 107)
    public final void method828(int arg0) {
        this.field1620 = 32768;
        this.field1630 = this.field1628 = class327.field4862[arg0 & 0x3FFF];
        this.field1627 = class327.field4863[arg0 & 0x3FFF];
        this.field1625 = -this.field1627;
        this.field1629 = this.field1624 = this.field1631 = this.field1621 = this.field1626 = this.field1623 = this.field1622 = 0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III[I)V", line = 116)
    public final void method829(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field1627 * arg2 + this.field1630 * arg0 + this.field1629 * arg1 >> 15) + this.field1624;
        arg3[1] = (this.field1621 * arg2 + this.field1631 * arg0 + this.field1620 * arg1 >> 15) + this.field1626;
        arg3[2] = (this.field1628 * arg2 + this.field1625 * arg0 + this.field1623 * arg1 >> 15) + this.field1622;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V", line = 122)
    public final void method830(int arg0) {
        int var2 = class327.field4862[arg0 & 0x3FFF];
        int var3 = class327.field4863[arg0 & 0x3FFF];
        int var4 = this.field1631;
        int var5 = this.field1620;
        int var6 = this.field1621;
        int var7 = this.field1626;
        this.field1631 = var2 * var4 - this.field1625 * var3 >> 15;
        this.field1625 = this.field1625 * var2 + var3 * var4 >> 15;
        this.field1620 = var2 * var5 - this.field1623 * var3 >> 15;
        this.field1623 = this.field1623 * var2 + var3 * var5 >> 15;
        this.field1621 = var2 * var6 - this.field1628 * var3 >> 15;
        this.field1628 = this.field1628 * var2 + var3 * var6 >> 15;
        this.field1626 = var2 * var7 - this.field1622 * var3 >> 15;
        this.field1622 = this.field1622 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V", line = 143)
    public final void method831(int arg0, int arg1, int arg2) {
        this.field1631 = this.field1625 = this.field1629 = this.field1623 = this.field1627 = this.field1621 = 0;
        this.field1630 = this.field1620 = this.field1628 = 32768;
        this.field1624 = arg0;
        this.field1626 = arg1;
        this.field1622 = arg2;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lm;)V", line = 151)
    public final void method832(class187 arg0) {
        class122 var2 = (class122) arg0;
        this.field1630 = var2.field1630;
        this.field1629 = var2.field1629;
        this.field1627 = var2.field1627;
        this.field1624 = var2.field1624;
        this.field1631 = var2.field1631;
        this.field1620 = var2.field1620;
        this.field1621 = var2.field1621;
        this.field1626 = var2.field1626;
        this.field1625 = var2.field1625;
        this.field1623 = var2.field1623;
        this.field1628 = var2.field1628;
        this.field1622 = var2.field1622;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 167)
    public final void method833(int arg0) {
        this.field1628 = 32768;
        this.field1630 = this.field1620 = class327.field4862[arg0 & 0x3FFF];
        this.field1631 = class327.field4863[arg0 & 0x3FFF];
        this.field1629 = -this.field1631;
        this.field1627 = this.field1624 = this.field1621 = this.field1626 = this.field1625 = this.field1623 = this.field1622 = 0;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 177)
    public class122() {
        this.method827();
    }
}
