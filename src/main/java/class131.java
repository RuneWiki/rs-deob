import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class131 extends class261 {

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "[F")
    private static float[] field1821 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "F")
    public float field1817;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "F")
    public float field1818;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "F")
    public float field1819;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "F")
    public float field1820;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "F")
    public float field1822;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "F")
    public float field1823;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "F")
    public float field1824;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "F")
    public float field1825;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "F")
    public float field1826;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "F")
    public float field1827;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "F")
    public float field1828;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "F")
    public float field1829;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III[I)V", line = 8)
    public final void method881(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field1820 + (float) arg0 * this.field1819 + (float) arg1 * this.field1829 + this.field1818);
        arg3[0] = (int) ((float) arg2 * this.field1823 + (float) arg0 * this.field1824 + (float) arg1 * this.field1826 + this.field1817);
        arg3[1] = (int) ((float) arg2 * this.field1825 + (float) arg0 * this.field1827 + (float) arg1 * this.field1828 + this.field1822);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)V", line = 18)
    public final void method882(int arg0, int arg1, int arg2) {
        this.field1822 = (float) arg1;
        this.field1817 = (float) arg0;
        this.field1827 = this.field1819 = this.field1826 = this.field1829 = this.field1823 = this.field1825 = 0.0F;
        this.field1818 = (float) arg2;
        this.field1824 = this.field1828 = this.field1820 = 1.0F;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 30)
    public final void method883(int arg0) {
        float var2 = class159.field2240[arg0 & 0x3FFF];
        float var3 = class159.field2241[arg0 & 0x3FFF];
        float var4 = this.field1824;
        float var5 = this.field1826;
        float var6 = this.field1823;
        float var7 = this.field1817;
        this.field1824 = this.field1819 * var3 + var2 * var4;
        this.field1826 = this.field1829 * var3 + var2 * var5;
        this.field1819 = this.field1819 * var2 - var3 * var4;
        this.field1829 = this.field1829 * var2 - var3 * var5;
        this.field1823 = this.field1820 * var3 + var2 * var6;
        this.field1820 = this.field1820 * var2 - var3 * var6;
        this.field1817 = this.field1818 * var3 + var2 * var7;
        this.field1818 = this.field1818 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lci;)V", line = 56)
    public final void method884(class261 arg0) {
        class131 var2 = (class131) arg0;
        this.field1824 = var2.field1824;
        this.field1829 = var2.field1829;
        this.field1817 = var2.field1817;
        this.field1819 = var2.field1819;
        this.field1826 = var2.field1826;
        this.field1818 = var2.field1818;
        this.field1823 = var2.field1823;
        this.field1827 = var2.field1827;
        this.field1825 = var2.field1825;
        this.field1828 = var2.field1828;
        this.field1822 = var2.field1822;
        this.field1820 = var2.field1820;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lci;I)V", line = 77)
    public final void method885(class261 arg0, int arg1) {
        class131 var3 = (class131) arg0;
        this.field1823 = var3.field1819;
        this.field1824 = var3.field1824;
        this.field1826 = var3.field1827;
        this.field1819 = var3.field1823;
        this.field1828 = var3.field1828;
        this.field1825 = var3.field1829;
        this.field1827 = var3.field1826;
        this.field1817 = -(this.field1823 * var3.field1818 + this.field1826 * var3.field1822 + this.field1824 * var3.field1817);
        this.field1820 = var3.field1820;
        if (arg1 < 68) {
            this.method888(-102, 48, 73);
        }
        this.field1829 = var3.field1825;
        this.field1822 = -(this.field1825 * var3.field1818 + this.field1828 * var3.field1822 + this.field1827 * var3.field1817);
        this.field1818 = -(this.field1820 * var3.field1818 + this.field1829 * var3.field1822 + this.field1819 * var3.field1817);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 102)
    public final void method886(int arg0) {
        this.field1820 = 1.0F;
        this.field1824 = this.field1828 = class159.field2240[arg0 & 0x3FFF];
        this.field1827 = class159.field2241[arg0 & 0x3FFF];
        this.field1826 = -this.field1827;
        this.field1823 = this.field1817 = this.field1825 = this.field1822 = this.field1819 = this.field1829 = this.field1818 = 0.0F;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIII)V", line = 115)
    public final void method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class159.field2240[arg3 & 0x3FFF];
        float var8 = class159.field2241[arg3 & 0x3FFF];
        float var9 = class159.field2240[arg4 & 0x3FFF];
        float var10 = class159.field2241[arg4 & 0x3FFF];
        float var11 = class159.field2240[arg5 & 0x3FFF];
        float var12 = class159.field2241[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1826 = var7 * var12;
        this.field1828 = var7 * var11;
        this.field1824 = var9 * var11 + var10 * var14;
        this.field1825 = var9 * var13 + var10 * var12;
        this.field1819 = var7 * var10;
        this.field1820 = var7 * var9;
        this.field1823 = -var10 * var11 + var9 * var14;
        this.field1827 = -var9 * var12 + var10 * var13;
        this.field1829 = -var8;
        this.field1817 = (float) (-arg0) * this.field1824 - ((float) arg1 * this.field1826) - (float) arg2 * this.field1823;
        this.field1822 = (float) (-arg0) * this.field1827 - ((float) arg1 * this.field1828) - ((float) arg2 * this.field1825);
        this.field1818 = (float) (-arg0) * this.field1819 - ((float) arg1 * this.field1829) - (float) arg2 * this.field1820;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V", line = 147)
    public final void method888(int arg0, int arg1, int arg2) {
        this.field1818 += (float) arg2;
        this.field1817 += (float) arg0;
        this.field1822 += (float) arg1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([I)V", line = 158)
    public final void method889(int[] arg0) {
        float var2 = (float) arg0[0] - this.field1817;
        float var3 = (float) arg0[1] - this.field1822;
        float var4 = (float) arg0[2] - this.field1818;
        arg0[2] = (int) (this.field1820 * var4 + this.field1825 * var3 + this.field1823 * var2);
        arg0[0] = (int) (this.field1819 * var4 + this.field1827 * var3 + this.field1824 * var2);
        arg0[1] = (int) (this.field1829 * var4 + this.field1828 * var3 + this.field1826 * var2);
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V", line = 172)
    public final void method890(int arg0) {
        this.field1824 = 1.0F;
        this.field1828 = this.field1820 = class159.field2240[arg0 & 0x3FFF];
        this.field1829 = class159.field2241[arg0 & 0x3FFF];
        this.field1826 = this.field1823 = this.field1817 = this.field1827 = this.field1822 = this.field1819 = this.field1818 = 0.0F;
        this.field1825 = -this.field1829;
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V", line = 183)
    public final void method891(int arg0) {
        this.field1828 = 1.0F;
        this.field1824 = this.field1820 = class159.field2240[arg0 & 0x3FFF];
        this.field1823 = class159.field2241[arg0 & 0x3FFF];
        this.field1826 = this.field1817 = this.field1827 = this.field1825 = this.field1822 = this.field1829 = this.field1818 = 0.0F;
        this.field1819 = -this.field1823;
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V", line = 197)
    public final void method892(int arg0) {
        float var2 = class159.field2240[arg0 & 0x3FFF];
        float var3 = class159.field2241[arg0 & 0x3FFF];
        float var4 = this.field1827;
        float var5 = this.field1828;
        float var6 = this.field1825;
        this.field1827 = var2 * var4 - (this.field1819 * var3);
        float var7 = this.field1822;
        this.field1828 = var2 * var5 - (this.field1829 * var3);
        this.field1819 = this.field1819 * var2 + var3 * var4;
        this.field1825 = var2 * var6 - (this.field1820 * var3);
        this.field1829 = this.field1829 * var2 + var3 * var5;
        this.field1822 = var2 * var7 - this.field1818 * var3;
        this.field1820 = this.field1820 * var2 + var3 * var6;
        this.field1818 = this.field1818 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V", line = 221)
    public final void method893() {
        this.field1827 = this.field1819 = this.field1826 = this.field1829 = this.field1823 = this.field1825 = this.field1817 = this.field1822 = this.field1818 = 0.0F;
        this.field1824 = this.field1828 = this.field1820 = 1.0F;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()Lbj;", line = 235)
    public final class131 method894() {
        class131 var1 = new class131();
        var1.field1817 = this.field1817;
        var1.field1824 = this.field1824;
        var1.field1823 = this.field1823;
        var1.field1820 = this.field1820;
        var1.field1828 = this.field1828;
        var1.field1822 = this.field1822;
        var1.field1818 = this.field1818;
        var1.field1825 = this.field1825;
        var1.field1826 = this.field1826;
        var1.field1819 = this.field1819;
        var1.field1827 = this.field1827;
        var1.field1829 = this.field1829;
        return var1;
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)[F", line = 255)
    public final float[] method895(int arg0) {
        field1821[9] = this.field1825;
        field1821[13] = this.field1822;
        field1821[8] = this.field1823;
        field1821[arg0] = this.field1824;
        field1821[1] = this.field1827;
        field1821[2] = this.field1819;
        field1821[5] = this.field1828;
        field1821[10] = this.field1820;
        field1821[6] = this.field1829;
        field1821[14] = this.field1818;
        field1821[4] = this.field1826;
        field1821[12] = this.field1817;
        return field1821;
    }

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "(I)[F", line = 279)
    public final float[] method896(int arg0) {
        field1821[14] = 0.0F;
        field1821[0] = this.field1824;
        field1821[13] = 0.0F;
        field1821[9] = this.field1825;
        field1821[2] = this.field1819;
        field1821[12] = 0.0F;
        field1821[6] = this.field1829;
        field1821[10] = this.field1820;
        field1821[8] = this.field1823;
        field1821[5] = this.field1828;
        field1821[4] = this.field1826;
        field1821[arg0] = this.field1827;
        return field1821;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 296)
    public class131() {
        this.method893();
    }
}
