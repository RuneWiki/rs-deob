import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class111 {

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "Lcu;")
    public static class145 field1588 = new class145(21, 5);

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "Lmv;")
    public static class252 field1590 = new class252(16);

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIBI)V")
    public static final void method766(int arg0, int arg1, byte arg2, int arg3) {
        field1589++;
        class193.field2708.method2214(32, arg0);
        int var4 = -17 % ((29 - arg2) / 49);
        class193.field2708.method2246(arg3, (byte) -58);
        class193.field2708.method2246(arg1, (byte) -84);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static void method767(int arg0) {
        field1588 = null;
        if (arg0 == 5) {
            field1590 = null;
        }
    }
}
