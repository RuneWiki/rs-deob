import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class404 {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Lla;")
    public static class319 field6125 = new class319(19, -1);

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Luu;")
    public static class191 field6129;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Lka;")
    public class334 field6128;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lia;")
    public class423 field6124;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method2489(int arg0) {
        field6129 = null;
        field6125 = null;
        if (arg0 != 6) {
            field6129 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V")
    public static final void method2490(int arg0, boolean arg1) {
        field6127++;
        class365.method2332(class107.field1525, arg1, -10287, class147.field1961, class337.field5232);
        if (arg0 <= 27) {
            method2491(-119, -65);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Z")
    public static final boolean method2491(int arg0, int arg1) {
        if (arg1 != -9) {
            method2489(99);
        }
        field6130++;
        return arg0 == 6 || arg0 == 7 || arg0 == 8;
    }
}
