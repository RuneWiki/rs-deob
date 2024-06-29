import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class130 {

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Z")
    public boolean field1742;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lqe;")
    public static class469 field1746 = new class469(65, 7);

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1748 = -1;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lll;")
    public class366 field1743;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lll;")
    public class366 field1744;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "Lbs;")
    public static class689 field1749;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Z")
    public boolean field1747;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 5)
    public static void method923(int arg0) {
        field1749 = null;
        field1746 = null;
        if (arg0 != 65) {
            method923(100);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V", line = 16)
    public static final void method924(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1745++;
        class150 var5 = class676.method3885(1000, arg2, arg4);
        var5.method1116(arg2 ^ 0x21);
        var5.field2346 = arg3;
        var5.field2342 = arg1;
        var5.field2345 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 29)
    public final void method925(int arg0) {
        field1740++;
        if (this.field1744 != null) {
            this.field1744.method1284(true);
        }
        if (arg0 == 7) {
            this.field1747 = false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)Z", line = 48)
    public final boolean method926(int arg0) {
        if (arg0 != 65) {
            method924(91, 33, 35, -28, 75);
        }
        field1741++;
        return this.field1747 && !this.field1742;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Z)V", line = 61)
    public class130(boolean arg0) {
        this.field1742 = arg0;
    }
}
