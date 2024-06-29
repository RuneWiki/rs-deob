import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class102 extends class185 {

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1558 = 0;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1559 = "wishes to trade with you.";

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "J")
    public static long field1563 = 0L;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field1568 = 0;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Lva;")
    public static class156 field1557;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "Lok;")
    public static class160 field1564;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Lkb;")
    public static class39 field1561;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V", line = 6)
    public final void method717(int arg0, byte arg1, int arg2) {
        field1567++;
        if (arg1 <= 43) {
            this.method718(-106, 66, (byte) -103);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)V", line = 17)
    public final void method718(int arg0, int arg1, byte arg2) {
        int var4 = -124 / ((-arg2 - 39) / 61);
        field1566++;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(BI)V", line = 30)
    public static final void method719(byte arg0, int arg1) {
        class240.field3799.method1625(arg1, (byte) 48);
        class218.field3501.method1625(arg1, (byte) 20);
        if (arg0 > -90) {
            field1557 = (class156) null;
        }
        field1556++;
        class129.field1911.method1625(arg1, (byte) 92);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 43)
    public static void method720(byte arg0) {
        if (arg0 != 37) {
            method719((byte) 113, 43);
        }
        field1561 = null;
        field1559 = null;
        field1557 = null;
        field1564 = null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIII)V", line = 58)
    public class102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1554 = arg2;
        this.field1562 = arg1;
        this.field1553 = arg0;
        this.field1555 = arg3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V", line = 72)
    public final void method721(int arg0, int arg1, int arg2) {
        int var4 = this.field1553 * arg0 >> 12;
        int var5 = this.field1562 * arg2 >> 12;
        int var6 = this.field1555 * arg2 >> 12;
        if (arg1 != -1) {
            this.field1555 = 118;
        }
        field1565++;
        int var7 = this.field1554 * arg0 >> 12;
        class145.method1020(var5, -1, var4, var6, var7, this.field2974);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZI)Z", line = 90)
    public static final boolean method722(int arg0, boolean arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg1) {
            return false;
        }
        field1569++;
        class149 var3 = class291.method2043(arg0, 23006);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1040(arg2, (byte) -122);
    }
}
