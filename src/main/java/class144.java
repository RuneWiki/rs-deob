import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class144 extends class450 {

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "[F")
    private static float[] field1690 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "F")
    public float field1687;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "F")
    public float field1688;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "F")
    public float field1689;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "F")
    public float field1691;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "F")
    public float field1692;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "F")
    public float field1693;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "F")
    public float field1694;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "F")
    public float field1695;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "F")
    public float field1696;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "F")
    public float field1697;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "F")
    public float field1698;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "F")
    public float field1699;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lwr;)V")
    public final void method923(class450 arg0) {
        class144 var2 = (class144) arg0;
        this.field1699 = var2.field1699;
        this.field1688 = var2.field1688;
        this.field1695 = var2.field1695;
        this.field1697 = var2.field1697;
        this.field1693 = var2.field1693;
        this.field1692 = var2.field1692;
        this.field1698 = var2.field1698;
        this.field1694 = var2.field1694;
        this.field1687 = var2.field1687;
        this.field1696 = var2.field1696;
        this.field1689 = var2.field1689;
        this.field1691 = var2.field1691;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III[I)V")
    public final void method924(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field1692 + (float) arg0 * this.field1698 + (float) arg1 * this.field1694 + this.field1693);
        arg3[1] = (int) ((float) arg2 * this.field1687 + (float) arg0 * this.field1689 + (float) arg1 * this.field1697 + this.field1688);
        arg3[0] = (int) ((float) arg2 * this.field1695 + (float) arg0 * this.field1696 + (float) arg1 * this.field1699 + this.field1691);
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)[F")
    public final float[] method925(int arg0) {
        field1690[9] = this.field1687;
        field1690[4] = this.field1699;
        int var2 = 92 / ((35 - arg0) / 42);
        field1690[14] = this.field1693;
        field1690[2] = this.field1698;
        field1690[6] = this.field1694;
        field1690[1] = this.field1689;
        field1690[12] = this.field1691;
        field1690[10] = this.field1692;
        field1690[8] = this.field1695;
        field1690[5] = this.field1697;
        field1690[13] = this.field1688;
        field1690[0] = this.field1696;
        return field1690;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([I)V")
    public final void method926(int[] arg0) {
        float var2 = (float) arg0[0] - this.field1691;
        float var3 = (float) arg0[1] - this.field1688;
        float var4 = (float) arg0[2] - this.field1693;
        arg0[2] = (int) (this.field1692 * var4 + this.field1695 * var2 + this.field1687 * var3);
        arg0[1] = (int) (this.field1694 * var4 + this.field1699 * var2 + this.field1697 * var3);
        arg0[0] = (int) (this.field1698 * var4 + this.field1696 * var2 + this.field1689 * var3);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLwr;)V")
    public final void method927(byte arg0, class450 arg1) {
        class144 var3 = (class144) arg1;
        this.field1695 = var3.field1698;
        if (arg0 >= -2) {
            this.method931();
        }
        this.field1699 = var3.field1689;
        this.field1696 = var3.field1696;
        this.field1689 = var3.field1699;
        this.field1687 = var3.field1694;
        this.field1697 = var3.field1697;
        this.field1698 = var3.field1695;
        this.field1694 = var3.field1687;
        this.field1692 = var3.field1692;
        this.field1691 = -(this.field1695 * var3.field1693 + this.field1699 * var3.field1688 + this.field1696 * var3.field1691);
        this.field1688 = -(this.field1687 * var3.field1693 + this.field1697 * var3.field1688 + this.field1689 * var3.field1691);
        this.field1693 = -(this.field1692 * var3.field1693 + this.field1698 * var3.field1691 + this.field1694 * var3.field1688);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIII)V")
    public final void method928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class123.field1392[arg3 & 0x3FFF];
        float var8 = class123.field1391[arg3 & 0x3FFF];
        float var9 = class123.field1392[arg4 & 0x3FFF];
        float var10 = class123.field1391[arg4 & 0x3FFF];
        float var11 = class123.field1392[arg5 & 0x3FFF];
        float var12 = class123.field1391[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1696 = var9 * var11 + var10 * var14;
        this.field1694 = -var8;
        this.field1697 = var7 * var11;
        this.field1687 = var9 * var13 + var10 * var12;
        this.field1689 = -var9 * var12 + var10 * var13;
        this.field1699 = var7 * var12;
        this.field1692 = var7 * var9;
        this.field1695 = -var10 * var11 + var9 * var14;
        this.field1698 = var7 * var10;
        this.field1688 = (float) (-arg0) * this.field1689 - ((float) arg1 * this.field1697) - (float) arg2 * this.field1687;
        this.field1693 = (float) (-arg0) * this.field1698 - (float) arg1 * this.field1694 - ((float) arg2 * this.field1692);
        this.field1691 = (float) (-arg0) * this.field1696 - (float) arg1 * this.field1699 - ((float) arg2 * this.field1695);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
    public final void method929(int arg0, int arg1, int arg2) {
        this.field1693 = (float) arg2;
        this.field1689 = this.field1698 = this.field1699 = this.field1694 = this.field1695 = this.field1687 = 0.0F;
        this.field1688 = (float) arg1;
        this.field1691 = (float) arg0;
        this.field1696 = this.field1697 = this.field1692 = 1.0F;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
    public final void method930(int arg0) {
        this.field1697 = 1.0F;
        this.field1696 = this.field1692 = class123.field1392[arg0 & 0x3FFF];
        this.field1695 = class123.field1391[arg0 & 0x3FFF];
        this.field1699 = this.field1691 = this.field1689 = this.field1687 = this.field1688 = this.field1694 = this.field1693 = 0.0F;
        this.field1698 = -this.field1695;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
    public final void method931() {
        this.field1696 = this.field1697 = this.field1692 = 1.0F;
        this.field1689 = this.field1698 = this.field1699 = this.field1694 = this.field1695 = this.field1687 = this.field1691 = this.field1688 = this.field1693 = 0.0F;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public final void method932(int arg0) {
        this.field1696 = 1.0F;
        this.field1697 = this.field1692 = class123.field1392[arg0 & 0x3FFF];
        this.field1694 = class123.field1391[arg0 & 0x3FFF];
        this.field1699 = this.field1695 = this.field1691 = this.field1689 = this.field1688 = this.field1698 = this.field1693 = 0.0F;
        this.field1687 = -this.field1694;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)V")
    public final void method933(int arg0, int arg1, int arg2) {
        this.field1688 += (float) arg1;
        this.field1691 += (float) arg0;
        this.field1693 += (float) arg2;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    public final void method934(int arg0) {
        float var2 = class123.field1392[arg0 & 0x3FFF];
        float var3 = class123.field1391[arg0 & 0x3FFF];
        float var4 = this.field1696;
        float var5 = this.field1699;
        float var6 = this.field1695;
        this.field1696 = this.field1698 * var3 + var2 * var4;
        float var7 = this.field1691;
        this.field1698 = this.field1698 * var2 - (var3 * var4);
        this.field1699 = this.field1694 * var3 + var2 * var5;
        this.field1695 = this.field1692 * var3 + var2 * var6;
        this.field1694 = this.field1694 * var2 - var3 * var5;
        this.field1692 = this.field1692 * var2 - (var3 * var6);
        this.field1691 = this.field1693 * var3 + var2 * var7;
        this.field1693 = this.field1693 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)[F")
    public final float[] method935(int arg0) {
        field1690[12] = 0.0F;
        field1690[10] = this.field1692;
        field1690[5] = this.field1697;
        field1690[8] = this.field1695;
        if (arg0 != -10795) {
            this.field1696 = -1.9225755F;
        }
        field1690[1] = this.field1689;
        field1690[6] = this.field1694;
        field1690[13] = 0.0F;
        field1690[14] = 0.0F;
        field1690[9] = this.field1687;
        field1690[2] = this.field1698;
        field1690[0] = this.field1696;
        field1690[4] = this.field1699;
        return field1690;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "()Lng;")
    public final class144 method936() {
        class144 var1 = new class144();
        var1.field1692 = this.field1692;
        var1.field1687 = this.field1687;
        var1.field1688 = this.field1688;
        var1.field1695 = this.field1695;
        var1.field1696 = this.field1696;
        var1.field1697 = this.field1697;
        var1.field1694 = this.field1694;
        var1.field1689 = this.field1689;
        var1.field1693 = this.field1693;
        var1.field1691 = this.field1691;
        var1.field1698 = this.field1698;
        var1.field1699 = this.field1699;
        return var1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public final void method937(int arg0) {
        this.field1692 = 1.0F;
        this.field1696 = this.field1697 = class123.field1392[arg0 & 0x3FFF];
        this.field1689 = class123.field1391[arg0 & 0x3FFF];
        this.field1699 = -this.field1689;
        this.field1695 = this.field1691 = this.field1687 = this.field1688 = this.field1698 = this.field1694 = this.field1693 = 0.0F;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V")
    public final void method938(int arg0) {
        float var2 = class123.field1392[arg0 & 0x3FFF];
        float var3 = class123.field1391[arg0 & 0x3FFF];
        float var4 = this.field1689;
        float var5 = this.field1697;
        float var6 = this.field1687;
        float var7 = this.field1688;
        this.field1689 = var2 * var4 - this.field1698 * var3;
        this.field1698 = this.field1698 * var2 + var3 * var4;
        this.field1697 = var2 * var5 - (this.field1694 * var3);
        this.field1687 = var2 * var6 - (this.field1692 * var3);
        this.field1694 = this.field1694 * var2 + var3 * var5;
        this.field1688 = var2 * var7 - (this.field1693 * var3);
        this.field1692 = this.field1692 * var2 + var3 * var6;
        this.field1693 = this.field1693 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class144() {
        this.method931();
    }
}
