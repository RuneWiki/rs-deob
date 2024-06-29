import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class107 extends class128 {

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public int field1710 = 0;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field1701 = 0;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field1706 = -1;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field1692 = 0;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "Loi;")
    public class102 field1699;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "Loi;")
    public class102 field1715;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "Lbm;")
    public class131 field1720;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "Lfc;")
    public class158 field1703;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "Lbc;")
    public class299 field1709;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "Z")
    public boolean field1705;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "[I")
    public int[] field1714;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "[[[B")
    public static byte[][][] field1702;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)V")
    public static void method761(boolean arg0) {
        if (!arg0) {
            method764(-69, 110, -109, -67, -94);
        }
        field1702 = null;
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
    public static final void method762(int arg0) {
        if (arg0 != 128) {
            field1692 = 12;
        }
        field1697++;
        class198.field3184.method1257(95);
        class104.field1665.method1257(-108);
    }

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)V")
    public static final void method763(int arg0) {
        if (arg0 <= 6) {
            field1693 = 108;
        }
        class296 var1 = (class296) class62.field1020.method1643((byte) -80);
        field1719++;
        while (var1 != null) {
            if (var1.field4739 == -1) {
                var1.field4729 = 0;
                class41.method273(var1, 0);
            } else {
                var1.method913(-3542);
            }
            var1 = (class296) class62.field1020.method1642((byte) 127);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
    public static final void method764(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1716++;
        if (arg2 <= 47) {
            return;
        }
        class175 var5 = class182.method1317(4, arg4, false);
        var5.method1279((byte) -80);
        var5.field2855 = arg1;
        var5.field2857 = arg3;
        var5.field2865 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V")
    public final void method765(int arg0) {
        field1696++;
        if (arg0 != 0) {
            return;
        }
        int var2 = this.field1707;
        if (this.field1703 != null) {
            class158 var3 = this.field1703.method1077(arg0 - 6291);
            if (var3 == null) {
                this.field1691 = 0;
                this.field1694 = 0;
                this.field1714 = null;
                this.field1698 = 0;
                this.field1707 = -1;
                this.field1717 = 0;
            } else {
                this.field1698 = var3.field2458 * 128;
                this.field1691 = var3.field2508;
                this.field1717 = var3.field2452;
                this.field1714 = var3.field2517;
                this.field1707 = var3.field2466;
                this.field1694 = var3.field2498;
            }
        } else if (this.field1720 != null) {
            int var4 = class267.method1794(this.field1720, (byte) 100);
            if (var2 != var4) {
                this.field1707 = var4;
                class253 var5 = this.field1720.field2056;
                if (var5.field4062 != null) {
                    var5 = var5.method1711(true);
                }
                if (var5 == null) {
                    this.field1694 = this.field1698 = 0;
                } else {
                    this.field1694 = var5.field4073;
                    this.field1698 = var5.field4032 * 128;
                }
            }
        } else if (this.field1709 != null) {
            this.field1707 = class74.method502(this.field1709, -77);
            this.field1694 = this.field1709.field4771;
            this.field1698 = this.field1709.field4788 * 128;
        }
        if (this.field1707 != var2 && this.field1699 != null) {
            class6.field68.method1594(this.field1699);
            this.field1699 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static final void method766(byte arg0) {
        int var1 = 74 % ((13 - arg0) / 39);
        for (class97 var2 = (class97) class244.field3880.method1063(-125); var2 != null; var2 = (class97) class244.field3880.method1055(18178)) {
            int var3 = var2.field1556;
            if (class67.method473(var3, (byte) -108)) {
                boolean var4 = true;
                class211[] var5 = class34.field519[var3];
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        var4 = var5[var6].field3337;
                        break;
                    }
                }
                if (!var4) {
                    int var7 = (int) var2.field2012;
                    class211 var8 = class17.method87(var7, -20055);
                    if (var8 != null) {
                        class117.method834(var8, (byte) -57);
                    }
                }
            }
        }
        field1695++;
    }
}
