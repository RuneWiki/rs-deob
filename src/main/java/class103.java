import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class103 extends class60 {

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    private final int field1866;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    private final int field1876;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    private final int field1869;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    private final int field1877;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "Lha;")
    public static class46 field1864 = class271.method1828(" ", -46);

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "Lha;")
    public static class46 field1873 = class271.method1828("", -46);

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "[[[Laa;")
    public static class39[][][] field1874 = new class39[4][104][104];

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
    public static void method779(byte arg0) {
        field1873 = null;
        field1864 = null;
        field1874 = null;
        if (arg0 < 40) {
            field1864 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
    public final void method410(int arg0, int arg1, int arg2) {
        ++field1867;
        int var4 = 30 / ((53 - arg2) / 54);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZLpi;I)[Lhh;")
    public static final class263[] method780(int arg0, boolean arg1, class181 arg2, int arg3) {
        ++field1868;
        if (!class146.method1083(arg2, arg0, arg3, (byte) 28)) {
            return null;
        } else {
            if (!arg1) {
                method781(-14);
            }
            return class268.method1793(115);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZII)V")
    public final void method405(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field1873 = null;
        }
        ++field1863;
        int var4 = this.field1869 * arg1 >> 12;
        int var5 = this.field1877 * arg1 >> 12;
        int var6 = this.field1876 * arg2 >> 12;
        int var7 = this.field1866 * arg2 >> 12;
        class178.method1275(var7, 101, super.field1005, var4, var6, var5);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BII)V")
    public final void method412(byte arg0, int arg1, int arg2) {
        ++field1875;
        int var4 = 36 % ((arg0 - 45) / 42);
        int var5 = this.field1869 * arg2 >> 12;
        int var6 = this.field1877 * arg2 >> 12;
        int var7 = this.field1876 * arg1 >> 12;
        int var8 = this.field1866 * arg1 >> 12;
        class222.method1534(super.field1005, var5, super.field1009, var6, var8, false, var7, super.field1010);
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIIIII)V")
    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1866 = arg3;
        this.field1876 = arg1;
        this.field1869 = arg0;
        this.field1877 = arg2;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
    public static final void method781(int arg0) {
        ++field1870;
        class96.method755(-22551, 5);
        class69.method498((byte) 124, 5);
        class108.method846(5, 0);
        class261.method1743(5, -18568);
        class56.method388(-21800, 5);
        class263.method1775(15, 5);
        if (arg0 < -84) {
            client.method1814(true, 5);
            class26.method187(30945, 5);
            class210.method1480((byte) 115, 5);
            class53.method383((byte) 120, 5);
            class198.method1410(5, 1152);
            class20.method104(false, 50);
            class23.method160((byte) -57, 5);
            class6.method25((byte) -116, 5);
            class220.field3871.method81((byte) 30, 5);
        }
    }
}
