import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class104 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Loi;")
    public static class169 field1429 = new class169("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field1431 = 0;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field1430;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "[I")
    public static int[] field1432;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V")
    public static final void method695(byte arg0, int arg1) {
        if (arg0 == -107) {
            field1427++;
            class436 var2 = class459.method2712(6, arg1, -1759243680);
            var2.method2567(arg0 ^ 0xFFFFC118);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lhs;Ljava/lang/Object;I)V")
    public static final void method696(class441 arg0, Object arg1, int arg2) {
        field1428++;
        if (arg0.field6156 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field6156.peekEvent() != null; var3++) {
            class463.method2773(1L, 29);
        }
        if (arg1 != null) {
            arg0.field6156.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
        if (arg2 != -51) {
            method696(null, null, 41);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method697(byte arg0) {
        int var1 = 100 % ((arg0 - 1) / 43);
        field1430 = null;
        field1429 = null;
        field1432 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
    public static final void method698(int[] arg0, Object[] arg1, int arg2) {
        class78.method456(103, arg1, arg0.length - 1, arg0, 0);
        field1426++;
        if (arg2 <= 118) {
            field1429 = null;
        }
    }
}
