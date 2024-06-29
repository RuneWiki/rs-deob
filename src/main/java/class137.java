import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class137 extends class247 {

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "[F")
    private static float[] field1755 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "F")
    public float field1747;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "F")
    public float field1748;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "F")
    public float field1749;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "F")
    public float field1750;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "F")
    public float field1751;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "F")
    public float field1752;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "F")
    public float field1753;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "F")
    public float field1754;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "F")
    public float field1756;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "F")
    public float field1757;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "F")
    public float field1758;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "F")
    public float field1759;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "()Lbi;")
    public final class137 method736() {
        class137 var1 = new class137();
        var1.field1751 = this.field1751;
        var1.field1756 = this.field1756;
        var1.field1759 = this.field1759;
        var1.field1757 = this.field1757;
        var1.field1747 = this.field1747;
        var1.field1748 = this.field1748;
        var1.field1749 = this.field1749;
        var1.field1753 = this.field1753;
        var1.field1758 = this.field1758;
        var1.field1752 = this.field1752;
        var1.field1750 = this.field1750;
        var1.field1754 = this.field1754;
        return var1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)[F")
    public final float[] method737(byte arg0) {
        field1755[4] = this.field1759;
        field1755[6] = this.field1757;
        field1755[12] = this.field1754;
        field1755[10] = this.field1749;
        field1755[9] = this.field1756;
        field1755[8] = this.field1747;
        int var2 = -17 % ((arg0 + 58) / 59);
        field1755[1] = this.field1752;
        field1755[14] = this.field1753;
        field1755[13] = this.field1751;
        field1755[5] = this.field1748;
        field1755[2] = this.field1750;
        field1755[0] = this.field1758;
        return field1755;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
    public final void method738(int arg0) {
        this.field1758 = 1.0F;
        this.field1748 = this.field1749 = class197.field2641[arg0 & 0x3FFF];
        this.field1757 = class197.field2640[arg0 & 0x3FFF];
        this.field1759 = this.field1747 = this.field1754 = this.field1752 = this.field1751 = this.field1750 = this.field1753 = 0.0F;
        this.field1756 = -this.field1757;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([I)V")
    public final void method739(int[] arg0) {
        float var2 = (float) arg0[0] - this.field1754;
        float var3 = (float) arg0[1] - this.field1751;
        float var4 = (float) arg0[2] - this.field1753;
        arg0[2] = (int) (this.field1749 * var4 + this.field1756 * var3 + this.field1747 * var2);
        arg0[0] = (int) (this.field1750 * var4 + this.field1758 * var2 + this.field1752 * var3);
        arg0[1] = (int) (this.field1757 * var4 + this.field1759 * var2 + this.field1748 * var3);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lib;)V")
    public final void method740(class247 arg0) {
        class137 var2 = (class137) arg0;
        this.field1749 = var2.field1749;
        this.field1752 = var2.field1752;
        this.field1747 = var2.field1747;
        this.field1750 = var2.field1750;
        this.field1756 = var2.field1756;
        this.field1758 = var2.field1758;
        this.field1753 = var2.field1753;
        this.field1757 = var2.field1757;
        this.field1748 = var2.field1748;
        this.field1759 = var2.field1759;
        this.field1754 = var2.field1754;
        this.field1751 = var2.field1751;
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)[F")
    public final float[] method741(int arg0) {
        field1755[10] = this.field1749;
        field1755[13] = 0.0F;
        field1755[6] = this.field1757;
        field1755[0] = this.field1758;
        field1755[9] = this.field1756;
        field1755[8] = this.field1747;
        field1755[1] = this.field1752;
        field1755[5] = this.field1748;
        field1755[12] = 0.0F;
        field1755[4] = this.field1759;
        field1755[14] = 0.0F;
        field1755[2] = this.field1750;
        if (arg0 >= -7) {
            this.field1759 = -0.13219585F;
        }
        return field1755;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
    public final void method742(int arg0, int arg1, int arg2) {
        this.field1754 += (float) arg0;
        this.field1753 += (float) arg2;
        this.field1751 += (float) arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public final void method743(int arg0) {
        float var2 = class197.field2641[arg0 & 0x3FFF];
        float var3 = class197.field2640[arg0 & 0x3FFF];
        float var4 = this.field1752;
        float var5 = this.field1748;
        float var6 = this.field1756;
        float var7 = this.field1751;
        this.field1752 = var2 * var4 - (this.field1750 * var3);
        this.field1750 = this.field1750 * var2 + var3 * var4;
        this.field1748 = var2 * var5 - this.field1757 * var3;
        this.field1757 = this.field1757 * var2 + var3 * var5;
        this.field1756 = var2 * var6 - this.field1749 * var3;
        this.field1751 = var2 * var7 - this.field1753 * var3;
        this.field1749 = this.field1749 * var2 + var3 * var6;
        this.field1753 = this.field1753 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
    public final void method744(int arg0) {
        this.field1749 = 1.0F;
        this.field1758 = this.field1748 = class197.field2641[arg0 & 0x3FFF];
        this.field1752 = class197.field2640[arg0 & 0x3FFF];
        this.field1747 = this.field1754 = this.field1756 = this.field1751 = this.field1750 = this.field1757 = this.field1753 = 0.0F;
        this.field1759 = -this.field1752;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[I)V")
    public final void method745(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field1747 + (float) arg0 * this.field1758 + (float) arg1 * this.field1759 + this.field1754);
        arg3[2] = (int) ((float) arg2 * this.field1749 + (float) arg0 * this.field1750 + (float) arg1 * this.field1757 + this.field1753);
        arg3[1] = (int) ((float) arg2 * this.field1756 + (float) arg0 * this.field1752 + (float) arg1 * this.field1748 + this.field1751);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
    public final void method746() {
        this.field1752 = this.field1750 = this.field1759 = this.field1757 = this.field1747 = this.field1756 = this.field1754 = this.field1751 = this.field1753 = 0.0F;
        this.field1758 = this.field1748 = this.field1749 = 1.0F;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
    public final void method747(int arg0, int arg1, int arg2) {
        this.field1753 = (float) arg2;
        this.field1752 = this.field1750 = this.field1759 = this.field1757 = this.field1747 = this.field1756 = 0.0F;
        this.field1751 = (float) arg1;
        this.field1758 = this.field1748 = this.field1749 = 1.0F;
        this.field1754 = (float) arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lib;I)V")
    public final void method748(class247 arg0, int arg1) {
        class137 var3 = (class137) arg0;
        this.field1747 = var3.field1750;
        this.field1759 = var3.field1752;
        this.field1758 = var3.field1758;
        this.field1748 = var3.field1748;
        this.field1756 = var3.field1757;
        this.field1752 = var3.field1759;
        this.field1750 = var3.field1747;
        this.field1757 = var3.field1756;
        this.field1749 = var3.field1749;
        this.field1754 = -(this.field1747 * var3.field1753 + this.field1759 * var3.field1751 + this.field1758 * var3.field1754);
        this.field1751 = -(this.field1756 * var3.field1753 + this.field1752 * var3.field1754 + this.field1748 * var3.field1751);
        int var4 = 110 / ((arg1 + 34) / 51);
        this.field1753 = -(this.field1749 * var3.field1753 + this.field1757 * var3.field1751 + this.field1750 * var3.field1754);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public final void method749(int arg0) {
        float var2 = class197.field2641[arg0 & 0x3FFF];
        float var3 = class197.field2640[arg0 & 0x3FFF];
        float var4 = this.field1758;
        float var5 = this.field1759;
        float var6 = this.field1747;
        this.field1758 = this.field1750 * var3 + var2 * var4;
        float var7 = this.field1754;
        this.field1759 = this.field1757 * var3 + var2 * var5;
        this.field1750 = this.field1750 * var2 - var3 * var4;
        this.field1747 = this.field1749 * var3 + var2 * var6;
        this.field1757 = this.field1757 * var2 - var3 * var5;
        this.field1749 = this.field1749 * var2 - (var3 * var6);
        this.field1754 = this.field1753 * var3 + var2 * var7;
        this.field1753 = this.field1753 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V")
    public final void method750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class197.field2641[arg3 & 0x3FFF];
        float var8 = class197.field2640[arg3 & 0x3FFF];
        float var9 = class197.field2641[arg4 & 0x3FFF];
        float var10 = class197.field2640[arg4 & 0x3FFF];
        float var11 = class197.field2641[arg5 & 0x3FFF];
        float var12 = class197.field2640[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1756 = var9 * var13 + var10 * var12;
        this.field1748 = var7 * var11;
        this.field1752 = -var9 * var12 + var10 * var13;
        this.field1750 = var7 * var10;
        this.field1759 = var7 * var12;
        this.field1747 = -var10 * var11 + var9 * var14;
        this.field1749 = var7 * var9;
        this.field1758 = var9 * var11 + var10 * var14;
        this.field1757 = -var8;
        this.field1754 = (float) (-arg0) * this.field1758 - (float) arg1 * this.field1759 - (float) arg2 * this.field1747;
        this.field1753 = (float) (-arg0) * this.field1750 - ((float) arg1 * this.field1757) - (float) arg2 * this.field1749;
        this.field1751 = (float) (-arg0) * this.field1752 - (float) arg1 * this.field1748 - (float) arg2 * this.field1756;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class137() {
        this.method746();
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    public final void method751(int arg0) {
        this.field1748 = 1.0F;
        this.field1758 = this.field1749 = class197.field2641[arg0 & 0x3FFF];
        this.field1747 = class197.field2640[arg0 & 0x3FFF];
        this.field1759 = this.field1754 = this.field1752 = this.field1756 = this.field1751 = this.field1757 = this.field1753 = 0.0F;
        this.field1750 = -this.field1747;
    }
}
