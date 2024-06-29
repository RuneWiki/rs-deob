import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class112 {

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lng;")
    public class80 field1722;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field1716;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1717 = 0;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "J")
    public static long field1720 = 0L;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "[Z")
    public static boolean[] field1721 = new boolean[200];

    @OriginalMember(owner = "client!c", name = "h", descriptor = "[Z")
    public static boolean[] field1723 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1719 = 0;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(II)V")
    public class112(int arg0, int arg1) {
        this.field1722 = class200.method1377(arg0, 105);
        this.field1716 = arg1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static void method783(byte arg0) {
        field1723 = null;
        field1721 = null;
        int var1 = -30 / ((-arg0 - 54) / 37);
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lng;I)V")
    public class112(class80 arg0, int arg1) {
        this.field1722 = arg0;
        this.field1716 = arg1;
    }
}
