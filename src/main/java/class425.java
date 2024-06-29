import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class425 {

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lkr;")
    public static class602 field5958 = new class602(0, -2);

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
    public static int[] field5961 = null;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Luu;")
    public static class237 field5962;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static final void method2642(int arg0) {
        class720.field10024 = false;
        field5956++;
        if (arg0 != -9) {
            field5962 = null;
        }
        class235.method1566(arg0 + 16358);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
    public static final boolean method2643(int arg0, int arg1) {
        field5959++;
        if (arg1 >= -88) {
            return true;
        } else {
            return arg0 == 7 || arg0 == 8 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static final void method2644(int arg0) {
        field5960++;
        if (arg0 != -5911) {
            field5961 = null;
        }
        if (class155.field2184 != null) {
            class155.field2184.method2774(-126);
        }
        if (class368.field5215 == null) {
            return;
        }
        while (true) {
            try {
                class368.field5215.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2645(int arg0, byte arg1, int arg2) {
        if (arg1 != -33) {
            method2643(-60, 19);
        }
        field5957++;
        return false;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method2646(byte arg0) {
        field5961 = null;
        field5958 = null;
        if (arg0 <= 61) {
            method2644(46);
        }
        field5962 = null;
    }
}
