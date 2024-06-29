import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class128 extends class135 {

    @OriginalMember(owner = "client!pq", name = "P", descriptor = "Ltl;")
    public static class91 field1807 = new class91(1);

    @OriginalMember(owner = "client!pq", name = "R", descriptor = "F")
    public static float field1809 = 0.0F;

    @OriginalMember(owner = "client!pq", name = "Q", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!pq", name = "T", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!pq", name = "U", descriptor = "Loj;")
    public static class441 field1812;

    @OriginalMember(owner = "client!pq", name = "S", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1810;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V", line = 5)
    public static void method816(int arg0) {
        field1810 = null;
        if (arg0 > -123) {
            method816(-97);
        }
        field1807 = null;
        field1812 = null;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(II)V", line = 19)
    public static final void method817(int arg0, int arg1) {
        class310.field4640 = arg1;
        if (arg0 != 1) {
            return;
        }
        field1808++;
        class157 var2 = class166.field2417;
        synchronized (class166.field2417) {
            class166.field2417.method1015((byte) 95);
        }
        class157 var3 = class295.field4360;
        synchronized (class295.field4360) {
            class295.field4360.method1015((byte) 89);
        }
    }
}
