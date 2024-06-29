import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class102 extends class280 {

    @OriginalMember(owner = "client!qha", name = "F", descriptor = "Lqe;")
    public static class465 field1714 = new class465(42, -2);

    @OriginalMember(owner = "client!qha", name = "M", descriptor = "[Lhn;")
    public static class718[] field1721 = new class718[14];

    @OriginalMember(owner = "client!qha", name = "i", descriptor = "F")
    public float field1691;

    @OriginalMember(owner = "client!qha", name = "j", descriptor = "F")
    public float field1692;

    @OriginalMember(owner = "client!qha", name = "m", descriptor = "F")
    public float field1695;

    @OriginalMember(owner = "client!qha", name = "p", descriptor = "F")
    public float field1698;

    @OriginalMember(owner = "client!qha", name = "u", descriptor = "F")
    public float field1703;

    @OriginalMember(owner = "client!qha", name = "v", descriptor = "F")
    public float field1704;

    @OriginalMember(owner = "client!qha", name = "w", descriptor = "F")
    public float field1705;

    @OriginalMember(owner = "client!qha", name = "z", descriptor = "F")
    public float field1708;

    @OriginalMember(owner = "client!qha", name = "C", descriptor = "F")
    public float field1711;

    @OriginalMember(owner = "client!qha", name = "D", descriptor = "F")
    public float field1712;

    @OriginalMember(owner = "client!qha", name = "J", descriptor = "F")
    public float field1718;

    @OriginalMember(owner = "client!qha", name = "L", descriptor = "F")
    public float field1720;

    @OriginalMember(owner = "client!qha", name = "h", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!qha", name = "k", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!qha", name = "l", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!qha", name = "n", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!qha", name = "o", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!qha", name = "q", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!qha", name = "r", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!qha", name = "s", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!qha", name = "t", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!qha", name = "x", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!qha", name = "y", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!qha", name = "A", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!qha", name = "B", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!qha", name = "E", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!qha", name = "G", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!qha", name = "H", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!qha", name = "I", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!qha", name = "K", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "(I)V", line = 12)
    public final void method172(int arg0) {
        field1701++;
        this.field1698 = 1.0F;
        this.field1695 = this.field1692 = class14.field186[arg0 & 0x3FFF];
        this.field1720 = class14.field175[arg0 & 0x3FFF];
        this.field1704 = -this.field1720;
        this.field1703 = this.field1691 = this.field1712 = this.field1718 = this.field1711 = this.field1705 = this.field1708 = 0.0F;
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "()Lkd;", line = 30)
    public final class280 method174() {
        field1716++;
        class102 var1 = new class102();
        var1.field1704 = this.field1704;
        var1.field1695 = this.field1695;
        var1.field1720 = this.field1720;
        var1.field1712 = this.field1712;
        var1.field1711 = this.field1711;
        var1.field1703 = this.field1703;
        var1.field1718 = this.field1718;
        var1.field1708 = this.field1708;
        var1.field1705 = this.field1705;
        var1.field1692 = this.field1692;
        var1.field1691 = this.field1691;
        var1.field1698 = this.field1698;
        return var1;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)V", line = 53)
    public final void method150(int arg0) {
        field1713++;
        this.field1695 = 1.0F;
        this.field1698 = this.field1692 = class14.field186[arg0 & 0x3FFF];
        this.field1691 = class14.field175[arg0 & 0x3FFF];
        this.field1703 = this.field1712 = this.field1718 = this.field1704 = this.field1711 = this.field1720 = this.field1708 = 0.0F;
        this.field1705 = -this.field1691;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lkd;)V", line = 72)
    public final void method160(class280 arg0) {
        field1717++;
        class102 var2 = (class102) arg0;
        this.field1712 = var2.field1712;
        this.field1695 = var2.field1695;
        this.field1708 = var2.field1708;
        this.field1691 = var2.field1691;
        this.field1720 = var2.field1720;
        this.field1718 = var2.field1718;
        this.field1692 = var2.field1692;
        this.field1704 = var2.field1704;
        this.field1705 = var2.field1705;
        this.field1703 = var2.field1703;
        this.field1711 = var2.field1711;
        this.field1698 = var2.field1698;
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(III[I)V", line = 94)
    public final void method155(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field1692 + (float) arg0 * this.field1705 + (float) arg1 * this.field1720 + this.field1708);
        field1702++;
        arg3[1] = (int) ((float) arg2 * this.field1704 + (float) arg0 * this.field1718 + (float) arg1 * this.field1695 + this.field1711);
        arg3[0] = (int) ((float) arg2 * this.field1691 + (float) arg0 * this.field1698 + (float) arg1 * this.field1703 + this.field1712);
    }

    @OriginalMember(owner = "client!qha", name = "g", descriptor = "(I)V", line = 109)
    public final void method156(int arg0) {
        field1719++;
        float var2 = class14.field186[arg0 & 0x3FFF];
        float var3 = class14.field175[arg0 & 0x3FFF];
        float var4 = this.field1698;
        float var5 = this.field1703;
        float var6 = this.field1691;
        this.field1698 = var2 * var4 - this.field1718 * var3;
        float var7 = this.field1712;
        this.field1703 = var2 * var5 - (this.field1695 * var3);
        this.field1718 = this.field1718 * var2 + var3 * var4;
        this.field1691 = var2 * var6 - (this.field1704 * var3);
        this.field1695 = this.field1695 * var2 + var3 * var5;
        this.field1704 = this.field1704 * var2 + var3 * var6;
        this.field1712 = var2 * var7 - this.field1711 * var3;
        this.field1711 = this.field1711 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "()V", line = 139)
    public final void method181() {
        field1690++;
        this.field1718 = this.field1705 = this.field1703 = this.field1720 = this.field1691 = this.field1704 = this.field1712 = this.field1711 = this.field1708 = 0.0F;
        this.field1698 = this.field1695 = this.field1692 = 1.0F;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIIII)V", line = 151)
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1700++;
        float var7 = class14.field186[arg3 & 0x3FFF];
        float var8 = class14.field175[arg3 & 0x3FFF];
        float var9 = class14.field186[arg4 & 0x3FFF];
        float var10 = class14.field175[arg4 & 0x3FFF];
        float var11 = class14.field186[arg5 & 0x3FFF];
        float var12 = class14.field175[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1703 = var7 * var12;
        this.field1692 = var7 * var9;
        this.field1720 = -var8;
        this.field1704 = var9 * var13 + var10 * var12;
        this.field1695 = var7 * var11;
        this.field1691 = -var10 * var11 + var9 * var14;
        this.field1718 = -var9 * var12 + var10 * var13;
        this.field1705 = var7 * var10;
        this.field1698 = var9 * var11 + var10 * var14;
        this.field1712 = (float) (-arg0) * this.field1698 - (float) arg1 * this.field1703 - (float) arg2 * this.field1691;
        this.field1711 = (float) (-arg0) * this.field1718 - (float) arg1 * this.field1695 - (float) arg2 * this.field1704;
        this.field1708 = (float) (-arg0) * this.field1705 - ((float) arg1 * this.field1720) - ((float) arg2 * this.field1692);
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIB)Z", line = 186)
    public static final boolean method892(int arg0, int arg1, byte arg2) {
        if (arg2 == 109) {
            field1696++;
            return class154.method1180((byte) -67, arg0, arg1) & class471.method2856(7, arg1, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qha", name = "h", descriptor = "(I)V", line = 198)
    public static void method893(int arg0) {
        field1721 = null;
        field1714 = null;
        if (arg0 > -14) {
            method893(-41);
        }
    }

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "(III[I)V", line = 212)
    public final void method151(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field1712);
        int var6 = (int) ((float) arg1 - this.field1711);
        int var7 = (int) ((float) arg2 - this.field1708);
        field1699++;
        arg3[0] = (int) ((float) var7 * this.field1705 + (float) var5 * this.field1698 + (float) var6 * this.field1718);
        arg3[2] = (int) ((float) var7 * this.field1692 + (float) var5 * this.field1691 + (float) var6 * this.field1704);
        arg3[1] = (int) ((float) var7 * this.field1720 + (float) var5 * this.field1703 + (float) var6 * this.field1695);
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "([I)V", line = 228)
    public final void method187(int[] arg0) {
        field1710++;
        float var2 = (float) arg0[0] - this.field1712;
        float var3 = (float) arg0[1] - this.field1711;
        float var4 = (float) arg0[2] - this.field1708;
        arg0[1] = (int) (this.field1720 * var4 + this.field1703 * var2 + this.field1695 * var3);
        arg0[0] = (int) (this.field1705 * var4 + this.field1718 * var3 + this.field1698 * var2);
        arg0[2] = (int) (this.field1692 * var4 + this.field1704 * var3 + this.field1691 * var2);
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(BII)I", line = 258)
    public static final int method894(byte arg0, int arg1, int arg2) {
        field1694++;
        if (arg0 != -47) {
            method894((byte) 73, -77, -103);
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(III[I)V", line = 277)
    public final void method162(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field1704 + (float) arg0 * this.field1718 + (float) arg1 * this.field1695);
        arg3[0] = (int) ((float) arg2 * this.field1691 + (float) arg0 * this.field1698 + (float) arg1 * this.field1703);
        arg3[2] = (int) ((float) arg2 * this.field1692 + (float) arg0 * this.field1705 + (float) arg1 * this.field1720);
        field1697++;
    }

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "(I)V", line = 291)
    public final void method182(int arg0) {
        field1693++;
        float var2 = class14.field186[arg0 & 0x3FFF];
        float var3 = class14.field175[arg0 & 0x3FFF];
        float var4 = this.field1698;
        float var5 = this.field1703;
        float var6 = this.field1691;
        float var7 = this.field1712;
        this.field1698 = this.field1705 * var3 + var2 * var4;
        this.field1705 = this.field1705 * var2 - var3 * var4;
        this.field1703 = this.field1720 * var3 + var2 * var5;
        this.field1720 = this.field1720 * var2 - var3 * var5;
        this.field1691 = this.field1692 * var3 + var2 * var6;
        this.field1712 = this.field1708 * var3 + var2 * var7;
        this.field1692 = this.field1692 * var2 - var3 * var6;
        this.field1708 = this.field1708 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)V", line = 318)
    public final void method188(int arg0) {
        field1709++;
        float var2 = class14.field186[arg0 & 0x3FFF];
        float var3 = class14.field175[arg0 & 0x3FFF];
        float var4 = this.field1718;
        float var5 = this.field1695;
        float var6 = this.field1704;
        this.field1718 = var2 * var4 - this.field1705 * var3;
        float var7 = this.field1711;
        this.field1705 = this.field1705 * var2 + var3 * var4;
        this.field1695 = var2 * var5 - this.field1720 * var3;
        this.field1720 = this.field1720 * var2 + var3 * var5;
        this.field1704 = var2 * var6 - this.field1692 * var3;
        this.field1692 = this.field1692 * var2 + var3 * var6;
        this.field1711 = var2 * var7 - this.field1708 * var3;
        this.field1708 = this.field1708 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "()V", line = 345)
    public class102() {
        this.method181();
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(III)V", line = 353)
    public final void method149(int arg0, int arg1, int arg2) {
        this.field1708 += arg2;
        this.field1711 += arg1;
        this.field1712 += arg0;
        field1715++;
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(III)V", line = 363)
    public final void method157(int arg0, int arg1, int arg2) {
        this.field1718 = this.field1705 = this.field1703 = this.field1720 = this.field1691 = this.field1704 = 0.0F;
        this.field1708 = arg2;
        this.field1712 = arg0;
        this.field1711 = arg1;
        this.field1698 = this.field1695 = this.field1692 = 1.0F;
        field1707++;
    }

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "(I)V", line = 375)
    public final void method190(int arg0) {
        field1706++;
        this.field1692 = 1.0F;
        this.field1698 = this.field1695 = class14.field186[arg0 & 0x3FFF];
        this.field1718 = class14.field175[arg0 & 0x3FFF];
        this.field1691 = this.field1712 = this.field1704 = this.field1711 = this.field1705 = this.field1720 = this.field1708 = 0.0F;
        this.field1703 = -this.field1718;
    }
}
