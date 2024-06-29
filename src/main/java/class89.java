import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class89 extends class54 {

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Ldc;")
    private static class37 field1548 = class185.method1233((byte) 86, "Starting 3d library");

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Ldc;")
    public static class37 field1551 = field1548;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Ldc;")
    public static class37 field1553 = class185.method1233((byte) 86, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Ldc;")
    public static class37 field1554 = class185.method1233((byte) 86, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "Ldc;")
    public static class37 field1555 = class185.method1233((byte) 86, "weiss:");

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lwa;I)V")
    public static final void method592(class238 arg0, int arg1) {
        class59.field1097 = arg0;
        if (arg1 != 0) {
            method592(null, -37);
        }
        field1546++;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public static void method593(int arg0) {
        field1553 = null;
        int var1 = -125 % ((-arg0 - 33) / 63);
        field1555 = null;
        field1551 = null;
        field1554 = null;
        field1548 = null;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public static final void method594(int arg0) {
        class68.field1225++;
        if (arg0 != -2415) {
            method592(null, -17);
        }
        class49.field970.method1503(244, 2976);
        class49.field970.method190(0L, (byte) -114);
        field1552++;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
    public class89(int arg0, int arg1) {
        this.field1556 = arg0;
        this.field1549 = arg1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I")
    public static final int method595(int arg0, int arg1, int arg2) {
        field1547++;
        if (arg0 != 4) {
            method594(105);
        }
        int var3 = class225.method1477(-128, arg1 - 1, arg2 + -1) + class225.method1477(-128, arg1 - 1, arg2 + 1) + class225.method1477(-123, arg1 + 1, arg2 + -1) + class225.method1477(-124, arg1 + 1, arg2 - -1);
        int var4 = class225.method1477(-123, arg1, arg2 - 1) + class225.method1477(-128, arg1, arg2 + 1) + class225.method1477(-122, arg1 + -1, arg2) + class225.method1477(-125, arg1 - -1, arg2);
        int var5 = class225.method1477(-126, arg1, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }
}
