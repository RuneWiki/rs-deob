import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class249 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "[S")
    public static short[] field3443 = new short[256];

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "[I")
    public static int[] field3445 = new int[1];

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lqp;")
    public static class466 field3446 = new class466("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static final void method1495(byte arg0) {
        class225.field3205.method1068(0);
        field3447++;
        class89.field1301.method1068(0);
        class74.field1005.method1068(0);
        class88.field1287.method1068(0);
        if (arg0 < -18) {
            class446.field6572.method1068(0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ldr;ILjava/lang/Object;)V")
    public static final void method1496(class504 arg0, int arg1, Object arg2) {
        field3444++;
        if (arg0.field7419 == null || arg1 != 50) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field7419.peekEvent() != null; var3++) {
            class157.method1046(-128, 1L);
        }
        if (arg2 != null) {
            arg0.field7419.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method1497(int arg0) {
        if (arg0 != 1) {
            field3445 = null;
        }
        field3445 = null;
        field3443 = null;
        field3446 = null;
    }
}
