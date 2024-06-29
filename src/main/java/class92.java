import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class92 extends class124 {

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public int field1822;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!vr", name = "EA", descriptor = "(I)V")
    public final void method826(int arg0) {
        int var2 = class407.field6168[arg0 & 0x3FFF];
        int var3 = class407.field6169[arg0 & 0x3FFF];
        int var4 = this.field1827;
        int var5 = this.field1823;
        int var6 = this.field1824;
        int var7 = this.field1828;
        this.field1827 = this.field1829 * var3 + var2 * var4 >> 15;
        this.field1829 = this.field1829 * var2 - var3 * var4 >> 15;
        this.field1823 = this.field1825 * var3 + var2 * var5 >> 15;
        this.field1825 = this.field1825 * var2 - var3 * var5 >> 15;
        this.field1824 = this.field1830 * var3 + var2 * var6 >> 15;
        this.field1830 = this.field1830 * var2 - var3 * var6 >> 15;
        this.field1828 = this.field1831 * var3 + var2 * var7 >> 15;
        this.field1831 = this.field1831 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "()V")
    public final void method827() {
        this.field1833 = this.field1829 = this.field1823 = this.field1825 = this.field1824 = this.field1826 = this.field1828 = this.field1832 = this.field1831 = 0;
        this.field1827 = this.field1822 = this.field1830 = 32768;
    }

    @OriginalMember(owner = "client!vr", name = "ha", descriptor = "(Lc;)V")
    public final void method828(class124 arg0) {
        class92 var2 = (class92) arg0;
        this.field1827 = var2.field1827;
        this.field1823 = var2.field1823;
        this.field1824 = var2.field1824;
        this.field1828 = var2.field1828;
        this.field1833 = var2.field1833;
        this.field1822 = var2.field1822;
        this.field1826 = var2.field1826;
        this.field1832 = var2.field1832;
        this.field1829 = var2.field1829;
        this.field1825 = var2.field1825;
        this.field1830 = var2.field1830;
        this.field1831 = var2.field1831;
    }

    @OriginalMember(owner = "client!vr", name = "K", descriptor = "(III[I)V")
    public final void method829(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field1824 * arg2 + this.field1827 * arg0 + this.field1823 * arg1 >> 15;
        arg3[1] = this.field1826 * arg2 + this.field1833 * arg0 + this.field1822 * arg1 >> 15;
        arg3[2] = this.field1830 * arg2 + this.field1829 * arg0 + this.field1825 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!vr", name = "ea", descriptor = "(I)V")
    public final void method830(int arg0) {
        int var2 = class407.field6168[arg0 & 0x3FFF];
        int var3 = class407.field6169[arg0 & 0x3FFF];
        int var4 = this.field1833;
        int var5 = this.field1822;
        int var6 = this.field1826;
        int var7 = this.field1832;
        this.field1833 = var2 * var4 - this.field1829 * var3 >> 15;
        this.field1829 = this.field1829 * var2 + var3 * var4 >> 15;
        this.field1822 = var2 * var5 - this.field1825 * var3 >> 15;
        this.field1825 = this.field1825 * var2 + var3 * var5 >> 15;
        this.field1826 = var2 * var6 - this.field1830 * var3 >> 15;
        this.field1830 = this.field1830 * var2 + var3 * var6 >> 15;
        this.field1832 = var2 * var7 - this.field1831 * var3 >> 15;
        this.field1831 = this.field1831 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!vr", name = "wa", descriptor = "([I)V")
    public final void method831(int[] arg0) {
        int var2 = arg0[0] - this.field1828;
        int var3 = arg0[1] - this.field1832;
        int var4 = arg0[2] - this.field1831;
        arg0[0] = this.field1829 * var4 + this.field1833 * var3 + this.field1827 * var2 >> 15;
        arg0[1] = this.field1825 * var4 + this.field1823 * var2 + this.field1822 * var3 >> 15;
        arg0[2] = this.field1830 * var4 + this.field1826 * var3 + this.field1824 * var2 >> 15;
    }

    @OriginalMember(owner = "client!vr", name = "ca", descriptor = "(I)V")
    public final void method832(int arg0) {
        this.field1822 = 32768;
        this.field1827 = this.field1830 = class407.field6168[arg0 & 0x3FFF];
        this.field1824 = class407.field6169[arg0 & 0x3FFF];
        this.field1829 = -this.field1824;
        this.field1823 = this.field1828 = this.field1833 = this.field1826 = this.field1832 = this.field1825 = this.field1831 = 0;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "()Lc;")
    public final class124 method833() {
        class92 var1 = new class92();
        var1.field1827 = this.field1827;
        var1.field1823 = this.field1823;
        var1.field1824 = this.field1824;
        var1.field1828 = this.field1828;
        var1.field1833 = this.field1833;
        var1.field1822 = this.field1822;
        var1.field1826 = this.field1826;
        var1.field1832 = this.field1832;
        var1.field1829 = this.field1829;
        var1.field1825 = this.field1825;
        var1.field1830 = this.field1830;
        var1.field1831 = this.field1831;
        return var1;
    }

    @OriginalMember(owner = "client!vr", name = "W", descriptor = "(III)V")
    public final void method834(int arg0, int arg1, int arg2) {
        this.field1828 += arg0;
        this.field1832 += arg1;
        this.field1831 += arg2;
    }

    @OriginalMember(owner = "client!vr", name = "U", descriptor = "(III)V")
    public final void method835(int arg0, int arg1, int arg2) {
        this.field1833 = this.field1829 = this.field1823 = this.field1825 = this.field1824 = this.field1826 = 0;
        this.field1827 = this.field1822 = this.field1830 = 32768;
        this.field1828 = arg0;
        this.field1832 = arg1;
        this.field1831 = arg2;
    }

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "(I)V")
    public final void method836(int arg0) {
        this.field1830 = 32768;
        this.field1827 = this.field1822 = class407.field6168[arg0 & 0x3FFF];
        this.field1833 = class407.field6169[arg0 & 0x3FFF];
        this.field1823 = -this.field1833;
        this.field1824 = this.field1828 = this.field1826 = this.field1832 = this.field1829 = this.field1825 = this.field1831 = 0;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III[I)V")
    public final void method837(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field1824 * arg2 + this.field1827 * arg0 + this.field1823 * arg1 >> 15) + this.field1828;
        arg3[1] = (this.field1826 * arg2 + this.field1833 * arg0 + this.field1822 * arg1 >> 15) + this.field1832;
        arg3[2] = (this.field1830 * arg2 + this.field1829 * arg0 + this.field1825 * arg1 >> 15) + this.field1831;
    }

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)V")
    public final void method838(int arg0) {
        this.field1827 = 32768;
        this.field1822 = this.field1830 = class407.field6168[arg0 & 0x3FFF];
        this.field1825 = class407.field6169[arg0 & 0x3FFF];
        this.field1826 = -this.field1825;
        this.field1823 = this.field1824 = this.field1828 = this.field1833 = this.field1832 = this.field1829 = this.field1831 = 0;
    }

    @OriginalMember(owner = "client!vr", name = "YA", descriptor = "(IIIIII)V")
    public final void method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class407.field6168[arg3 & 0x3FFF];
        int var8 = class407.field6169[arg3 & 0x3FFF];
        int var9 = class407.field6168[arg4 & 0x3FFF];
        int var10 = class407.field6169[arg4 & 0x3FFF];
        int var11 = class407.field6168[arg5 & 0x3FFF];
        int var12 = class407.field6169[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field1827 = var9 * var11 + var10 * var14 >> 15;
        this.field1833 = -var9 * var12 + var10 * var13 >> 15;
        this.field1829 = var7 * var10 >> 15;
        this.field1823 = var7 * var12 >> 15;
        this.field1822 = var7 * var11 >> 15;
        this.field1825 = -var8;
        this.field1824 = -var10 * var11 + var9 * var14 >> 15;
        this.field1826 = var9 * var13 + var10 * var12 >> 15;
        this.field1830 = var7 * var9 >> 15;
        this.field1828 = -arg0 * this.field1827 - this.field1823 * arg1 - this.field1824 * arg2 >> 15;
        this.field1832 = -arg0 * this.field1833 - this.field1822 * arg1 - this.field1826 * arg2 >> 15;
        this.field1831 = -arg0 * this.field1829 - this.field1825 * arg1 - this.field1830 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
    public class92() {
        this.method827();
    }
}
