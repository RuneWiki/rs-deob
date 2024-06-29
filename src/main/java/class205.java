import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class205 extends class617 {

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public int field2431 = 0;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "Ljava/applet/Applet;")
    public static Applet field2428;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "[Lwca;")
    public static class339[] field2430;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V", line = 3)
    public static void method1229(byte arg0) {
        field2428 = null;
        field2430 = null;
        if (arg0 < 0) {
            field2430 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Z", line = 16)
    public static final boolean method1230(int arg0, int arg1, int arg2) {
        field2432++;
        if (arg2 != 14726) {
            field2428 = null;
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        class638 var3 = class364.field4891.method2134(arg1, true);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method3581(-16543, arg0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lnp;I)V", line = 36)
    public final void method1231(class115 arg0, int arg1) {
        field2429++;
        if (arg1 != 8) {
            return;
        }
        while (true) {
            int var3 = arg0.method620((byte) -128);
            if (var3 == 0) {
                return;
            }
            this.method1232(arg0, (byte) 27, var3);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lnp;BI)V", line = 59)
    private final void method1232(class115 arg0, byte arg1, int arg2) {
        if (arg1 == 27) {
            field2426++;
            if (arg2 == 2) {
                this.field2431 = arg0.method643((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)Lwl;", line = 78)
    public static final class679 method1233(int arg0) {
        field2427++;
        if (class482.field6939 == null || class234.field2868 == null) {
            return null;
        }
        if (arg0 != 28458) {
            method1233(-4);
        }
        class234.field2868.method1266(65, class482.field6939);
        class679 var1 = (class679) class234.field2868.method1270(true);
        if (var1 == null) {
            return null;
        } else {
            class655 var2 = class482.field6927.method705(var1.field9562, arg0 ^ 0xFFFF90AE);
            return var2 != null && var2.field9224 && var2.method3644(arg0 ^ 0xFFFFA48D, class482.field6931) ? var1 : class651.method3631((byte) -89);
        }
    }
}
