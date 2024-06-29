import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class119 extends class122 {

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    public int field1657;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public int field1658;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    public int field1665;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "client!wp", name = "N", descriptor = "(I)V", line = 3)
    public final void method252(int arg0) {
        this.field1667 = 32768;
        this.field1659 = this.field1658 = class340.field4715[arg0 & 0x3FFF];
        this.field1663 = class340.field4724[arg0 & 0x3FFF];
        this.field1660 = -this.field1663;
        this.field1661 = this.field1665 = this.field1662 = this.field1664 = this.field1657 = this.field1656 = this.field1666 = 0;
    }

    @OriginalMember(owner = "client!wp", name = "O", descriptor = "(I)V", line = 13)
    public final void method243(int arg0) {
        this.field1658 = 32768;
        this.field1667 = this.field1659 = class340.field4715[arg0 & 0x3FFF];
        this.field1664 = class340.field4724[arg0 & 0x3FFF];
        this.field1661 = -this.field1664;
        this.field1665 = this.field1662 = this.field1660 = this.field1657 = this.field1656 = this.field1663 = this.field1666 = 0;
    }

    @OriginalMember(owner = "client!wp", name = "ka", descriptor = "(I)V", line = 22)
    public final void method254(int arg0) {
        int var2 = class340.field4715[arg0 & 0x3FFF];
        int var3 = class340.field4724[arg0 & 0x3FFF];
        int var4 = this.field1664;
        int var5 = this.field1659;
        int var6 = this.field1660;
        int var7 = this.field1657;
        this.field1664 = var2 * var4 - this.field1656 * var3 >> 15;
        this.field1656 = this.field1656 * var2 + var3 * var4 >> 15;
        this.field1659 = var2 * var5 - this.field1663 * var3 >> 15;
        this.field1663 = this.field1663 * var2 + var3 * var5 >> 15;
        this.field1660 = var2 * var6 - this.field1658 * var3 >> 15;
        this.field1658 = this.field1658 * var2 + var3 * var6 >> 15;
        this.field1657 = var2 * var7 - this.field1666 * var3 >> 15;
        this.field1666 = this.field1666 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!wp", name = "xa", descriptor = "()V", line = 44)
    public final void method250() {
        this.field1664 = this.field1656 = this.field1661 = this.field1663 = this.field1665 = this.field1660 = this.field1662 = this.field1657 = this.field1666 = 0;
        this.field1667 = this.field1659 = this.field1658 = 32768;
    }

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "([I)V", line = 51)
    public final void method244(int[] arg0) {
        int var2 = arg0[0] - this.field1662;
        int var3 = arg0[1] - this.field1657;
        int var4 = arg0[2] - this.field1666;
        arg0[0] = this.field1656 * var4 + this.field1667 * var2 + this.field1664 * var3 >> 15;
        arg0[1] = this.field1663 * var4 + this.field1661 * var2 + this.field1659 * var3 >> 15;
        arg0[2] = this.field1658 * var4 + this.field1665 * var2 + this.field1660 * var3 >> 15;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "()Lc;", line = 65)
    public final class122 method245() {
        class119 var1 = new class119();
        var1.field1667 = this.field1667;
        var1.field1661 = this.field1661;
        var1.field1665 = this.field1665;
        var1.field1662 = this.field1662;
        var1.field1664 = this.field1664;
        var1.field1659 = this.field1659;
        var1.field1660 = this.field1660;
        var1.field1657 = this.field1657;
        var1.field1656 = this.field1656;
        var1.field1663 = this.field1663;
        var1.field1658 = this.field1658;
        var1.field1666 = this.field1666;
        return var1;
    }

    @OriginalMember(owner = "client!wp", name = "ja", descriptor = "(I)V", line = 83)
    public final void method247(int arg0) {
        int var2 = class340.field4715[arg0 & 0x3FFF];
        int var3 = class340.field4724[arg0 & 0x3FFF];
        int var4 = this.field1667;
        int var5 = this.field1661;
        int var6 = this.field1665;
        int var7 = this.field1662;
        this.field1667 = this.field1656 * var3 + var2 * var4 >> 15;
        this.field1656 = this.field1656 * var2 - var3 * var4 >> 15;
        this.field1661 = this.field1663 * var3 + var2 * var5 >> 15;
        this.field1663 = this.field1663 * var2 - var3 * var5 >> 15;
        this.field1665 = this.field1658 * var3 + var2 * var6 >> 15;
        this.field1658 = this.field1658 * var2 - var3 * var6 >> 15;
        this.field1662 = this.field1666 * var3 + var2 * var7 >> 15;
        this.field1666 = this.field1666 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "(III[I)V", line = 104)
    public final void method241(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field1665 * arg2 + this.field1667 * arg0 + this.field1661 * arg1 >> 15;
        arg3[1] = this.field1660 * arg2 + this.field1664 * arg0 + this.field1659 * arg1 >> 15;
        arg3[2] = this.field1658 * arg2 + this.field1663 * arg1 + this.field1656 * arg0 >> 15;
    }

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "(III)V", line = 109)
    public final void method251(int arg0, int arg1, int arg2) {
        this.field1662 += arg0;
        this.field1657 += arg1;
        this.field1666 += arg2;
    }

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "(III)V", line = 114)
    public final void method249(int arg0, int arg1, int arg2) {
        this.field1664 = this.field1656 = this.field1661 = this.field1663 = this.field1665 = this.field1660 = 0;
        this.field1667 = this.field1659 = this.field1658 = 32768;
        this.field1662 = arg0;
        this.field1657 = arg1;
        this.field1666 = arg2;
    }

    @OriginalMember(owner = "client!wp", name = "ra", descriptor = "(I)V", line = 122)
    public final void method253(int arg0) {
        this.field1659 = 32768;
        this.field1667 = this.field1658 = class340.field4715[arg0 & 0x3FFF];
        this.field1665 = class340.field4724[arg0 & 0x3FFF];
        this.field1656 = -this.field1665;
        this.field1661 = this.field1662 = this.field1664 = this.field1660 = this.field1657 = this.field1663 = this.field1666 = 0;
    }

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "(IIIIII)V", line = 130)
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class340.field4715[arg3 & 0x3FFF];
        int var8 = class340.field4724[arg3 & 0x3FFF];
        int var9 = class340.field4715[arg4 & 0x3FFF];
        int var10 = class340.field4724[arg4 & 0x3FFF];
        int var11 = class340.field4715[arg5 & 0x3FFF];
        int var12 = class340.field4724[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field1667 = var9 * var11 + var10 * var14 >> 15;
        this.field1664 = -var9 * var12 + var10 * var13 >> 15;
        this.field1656 = var7 * var10 >> 15;
        this.field1661 = var7 * var12 >> 15;
        this.field1659 = var7 * var11 >> 15;
        this.field1663 = -var8;
        this.field1665 = -var10 * var11 + var9 * var14 >> 15;
        this.field1660 = var9 * var13 + var10 * var12 >> 15;
        this.field1658 = var7 * var9 >> 15;
        this.field1662 = -arg0 * this.field1667 - this.field1661 * arg1 - this.field1665 * arg2 >> 15;
        this.field1657 = -arg0 * this.field1664 - this.field1659 * arg1 - this.field1660 * arg2 >> 15;
        this.field1666 = -arg0 * this.field1656 - this.field1663 * arg1 - this.field1658 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V", line = 161)
    public class119() {
        this.method250();
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(III[I)V", line = 165)
    public final void method255(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field1665 * arg2 + this.field1667 * arg0 + this.field1661 * arg1 >> 15) + this.field1662;
        arg3[1] = (this.field1660 * arg2 + this.field1664 * arg0 + this.field1659 * arg1 >> 15) + this.field1657;
        arg3[2] = (this.field1658 * arg2 + this.field1663 * arg1 + this.field1656 * arg0 >> 15) + this.field1666;
    }

    @OriginalMember(owner = "client!wp", name = "za", descriptor = "(Lc;)V", line = 171)
    public final void method256(class122 arg0) {
        class119 var2 = (class119) arg0;
        this.field1667 = var2.field1667;
        this.field1661 = var2.field1661;
        this.field1665 = var2.field1665;
        this.field1662 = var2.field1662;
        this.field1664 = var2.field1664;
        this.field1659 = var2.field1659;
        this.field1660 = var2.field1660;
        this.field1657 = var2.field1657;
        this.field1656 = var2.field1656;
        this.field1663 = var2.field1663;
        this.field1658 = var2.field1658;
        this.field1666 = var2.field1666;
    }
}
