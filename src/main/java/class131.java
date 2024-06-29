import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class131 extends class116 {

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public int field1754;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public int field1756;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "()Lue;", line = 5)
    public final class131 method890() {
        class131 var1 = new class131();
        var1.field1753 = this.field1753;
        var1.field1751 = this.field1751;
        var1.field1754 = this.field1754;
        var1.field1762 = this.field1762;
        var1.field1761 = this.field1761;
        var1.field1752 = this.field1752;
        var1.field1758 = this.field1758;
        var1.field1760 = this.field1760;
        var1.field1759 = this.field1759;
        var1.field1757 = this.field1757;
        var1.field1756 = this.field1756;
        var1.field1755 = this.field1755;
        return var1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III[I)V", line = 21)
    public final void method814(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field1754 * arg2 + this.field1753 * arg0 + this.field1751 * arg1 >> 15) + this.field1762;
        arg3[1] = (this.field1758 * arg2 + this.field1761 * arg0 + this.field1752 * arg1 >> 15) + this.field1760;
        arg3[2] = (this.field1756 * arg2 + this.field1759 * arg0 + this.field1757 * arg1 >> 15) + this.field1755;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V", line = 26)
    public final void method806(int arg0) {
        this.field1753 = 32768;
        this.field1752 = this.field1756 = class190.field2635[arg0 & 0x3FFF];
        this.field1757 = class190.field2644[arg0 & 0x3FFF];
        this.field1758 = -this.field1757;
        this.field1751 = this.field1754 = this.field1762 = this.field1761 = this.field1760 = this.field1759 = this.field1755 = 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 33)
    public final void method803(int arg0) {
        this.field1756 = 32768;
        this.field1753 = this.field1752 = class190.field2635[arg0 & 0x3FFF];
        this.field1761 = class190.field2644[arg0 & 0x3FFF];
        this.field1751 = -this.field1761;
        this.field1754 = this.field1762 = this.field1758 = this.field1760 = this.field1759 = this.field1757 = this.field1755 = 0;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 40)
    public final void method805(int arg0) {
        this.field1752 = 32768;
        this.field1753 = this.field1756 = class190.field2635[arg0 & 0x3FFF];
        this.field1754 = class190.field2644[arg0 & 0x3FFF];
        this.field1759 = -this.field1754;
        this.field1751 = this.field1762 = this.field1761 = this.field1758 = this.field1760 = this.field1757 = this.field1755 = 0;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V", line = 52)
    public final void method820(int arg0) {
        int var2 = class190.field2635[arg0 & 0x3FFF];
        int var3 = class190.field2644[arg0 & 0x3FFF];
        int var4 = this.field1753;
        int var5 = this.field1751;
        int var6 = this.field1754;
        int var7 = this.field1762;
        this.field1753 = this.field1759 * var3 + var2 * var4 >> 15;
        this.field1759 = this.field1759 * var2 - var3 * var4 >> 15;
        this.field1751 = this.field1757 * var3 + var2 * var5 >> 15;
        this.field1757 = this.field1757 * var2 - var3 * var5 >> 15;
        this.field1754 = this.field1756 * var3 + var2 * var6 >> 15;
        this.field1756 = this.field1756 * var2 - var3 * var6 >> 15;
        this.field1762 = this.field1755 * var3 + var2 * var7 >> 15;
        this.field1755 = this.field1755 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V", line = 74)
    public final void method817() {
        this.field1761 = this.field1759 = this.field1751 = this.field1757 = this.field1754 = this.field1758 = this.field1762 = this.field1760 = this.field1755 = 0;
        this.field1753 = this.field1752 = this.field1756 = 32768;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V", line = 78)
    public final void method802(int arg0, int arg1, int arg2) {
        this.field1762 += arg0;
        this.field1760 += arg1;
        this.field1755 += arg2;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIII)V", line = 87)
    public final void method816(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class190.field2635[arg3 & 0x3FFF];
        int var8 = class190.field2644[arg3 & 0x3FFF];
        int var9 = class190.field2635[arg4 & 0x3FFF];
        int var10 = class190.field2644[arg4 & 0x3FFF];
        int var11 = class190.field2635[arg5 & 0x3FFF];
        int var12 = class190.field2644[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field1753 = var9 * var11 + var10 * var14 >> 15;
        this.field1761 = -var9 * var12 + var10 * var13 >> 15;
        this.field1759 = var7 * var10 >> 15;
        this.field1751 = var7 * var12 >> 15;
        this.field1752 = var7 * var11 >> 15;
        this.field1757 = -var8;
        this.field1754 = -var10 * var11 + var9 * var14 >> 15;
        this.field1758 = var9 * var13 + var10 * var12 >> 15;
        this.field1756 = var7 * var9 >> 15;
        this.field1762 = -arg0 * this.field1753 - this.field1751 * arg1 - this.field1754 * arg2 >> 15;
        this.field1760 = -arg0 * this.field1761 - this.field1752 * arg1 - this.field1758 * arg2 >> 15;
        this.field1755 = -arg0 * this.field1759 - this.field1757 * arg1 - this.field1756 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([I)V", line = 117)
    public final void method818(int[] arg0) {
        int var2 = arg0[0] - this.field1762;
        int var3 = arg0[1] - this.field1760;
        int var4 = arg0[2] - this.field1755;
        arg0[0] = this.field1759 * var4 + this.field1761 * var3 + this.field1753 * var2 >> 15;
        arg0[1] = this.field1757 * var4 + this.field1752 * var3 + this.field1751 * var2 >> 15;
        arg0[2] = this.field1756 * var4 + this.field1758 * var3 + this.field1754 * var2 >> 15;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 130)
    public final void method807(int arg0) {
        int var2 = class190.field2635[arg0 & 0x3FFF];
        int var3 = class190.field2644[arg0 & 0x3FFF];
        int var4 = this.field1761;
        int var5 = this.field1752;
        int var6 = this.field1758;
        int var7 = this.field1760;
        this.field1761 = var2 * var4 - this.field1759 * var3 >> 15;
        this.field1759 = this.field1759 * var2 + var3 * var4 >> 15;
        this.field1752 = var2 * var5 - this.field1757 * var3 >> 15;
        this.field1757 = this.field1757 * var2 + var3 * var5 >> 15;
        this.field1758 = var2 * var6 - this.field1756 * var3 >> 15;
        this.field1756 = this.field1756 * var2 + var3 * var6 >> 15;
        this.field1760 = var2 * var7 - this.field1755 * var3 >> 15;
        this.field1755 = this.field1755 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lao;)V", line = 152)
    public final void method808(class116 arg0) {
        class131 var2 = (class131) arg0;
        this.field1753 = var2.field1753;
        this.field1751 = var2.field1751;
        this.field1754 = var2.field1754;
        this.field1762 = var2.field1762;
        this.field1761 = var2.field1761;
        this.field1752 = var2.field1752;
        this.field1758 = var2.field1758;
        this.field1760 = var2.field1760;
        this.field1759 = var2.field1759;
        this.field1757 = var2.field1757;
        this.field1756 = var2.field1756;
        this.field1755 = var2.field1755;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V", line = 169)
    public final void method809(int arg0, int arg1, int arg2) {
        this.field1761 = this.field1759 = this.field1751 = this.field1757 = this.field1754 = this.field1758 = 0;
        this.field1753 = this.field1752 = this.field1756 = 32768;
        this.field1762 = arg0;
        this.field1760 = arg1;
        this.field1755 = arg2;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 177)
    public class131() {
        this.method817();
    }
}
