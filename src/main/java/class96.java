import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class96 {

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public int field1705;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "F")
    public float field1714;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "F")
    public float field1700;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "F")
    public float field1701;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "J")
    public static long field1698 = 0L;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field1703 = -1;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "[I")
    public static int[] field1713 = new int[32];

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Ljf;")
    public static class229 field1715 = class212.method1457((byte) 113, " loggt sich aus)3");

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "[Ljf;")
    public static class229[] field1710;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 9)
    public static void method659(byte arg0) {
        field1715 = null;
        field1713 = null;
        field1710 = null;
        if (arg0 > -103) {
            method662(122, true);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V", line = 22)
    public static final void method660(int arg0, int arg1, int arg2) {
        field1712++;
        if (arg0 != -30588) {
            field1710 = (class229[]) null;
        }
        class122 var3 = class323.method2175(6, arg1, arg0 + 4715);
        var3.method862(-29044);
        var3.field2144 = arg2;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 39)
    public static final void method661(int arg0) {
        field1708++;
        class89 var1 = (class89) class83.field1532.method2078(arg0 + 30237);
        if (arg0 != -30334) {
            return;
        }
        while (var1 != null) {
            if (var1.field1626 == -1) {
                var1.field1632 = 0;
                class277.method1950(arg0 ^ 0xFFFFCE09, var1);
            } else {
                var1.method1747((byte) -107);
            }
            var1 = (class89) class83.field1532.method2080(5);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)Lnf;", line = 94)
    public static final class67 method662(int arg0, boolean arg1) {
        field1706++;
        if (!arg1) {
            return (class67) null;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class23.field423[var2] == null || class23.field423[var2][var3] == null) {
            boolean var4 = class192.method1314(var2, -100);
            if (!var4) {
                return null;
            }
        }
        return class23.field423[var2][var3];
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 126)
    public class96() {
        this.field1705 = 0;
        this.field1714 = 1.1523438F;
        this.field1704 = -60;
        this.field1709 = class276.field4750;
        this.field1700 = 1.2F;
        this.field1711 = -50;
        this.field1707 = -50;
        this.field1696 = class276.field4754;
        this.field1701 = 0.69921875F;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lkh;)V", line = 141)
    public class96(class14 arg0) {
        int var2 = arg0.method93(false);
        if ((var2 & 0x1) == 0) {
            this.field1709 = class276.field4750;
        } else {
            this.field1709 = arg0.method128((byte) 4);
        }
        if ((var2 & 0x2) == 0) {
            this.field1714 = 1.1523438F;
        } else {
            this.field1714 = (float) arg0.method116(-1) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field1701 = 0.69921875F;
        } else {
            this.field1701 = (float) arg0.method116(-1) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field1700 = 1.2F;
        } else {
            this.field1700 = (float) arg0.method116(-1) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1704 = -60;
            this.field1707 = -50;
            this.field1711 = -50;
        } else {
            this.field1707 = arg0.method113((byte) 73);
            this.field1704 = arg0.method113((byte) -87);
            this.field1711 = arg0.method113((byte) 105);
        }
        if ((var2 & 0x20) == 0) {
            this.field1696 = class276.field4754;
        } else {
            this.field1696 = arg0.method128((byte) 4);
        }
        if ((var2 & 0x40) == 0) {
            this.field1705 = 0;
        } else {
            this.field1705 = arg0.method116(-1);
        }
    }
}
