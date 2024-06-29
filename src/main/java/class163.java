import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class class163 extends class117 {

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "Lqo;")
    public class19 field2459;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field2460 = new String[100];

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Lvp;")
    public static class123 field2463 = new class123(42, 4);

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "Lao;")
    public static class188 field2464 = new class188(56, 4);

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Z")
    public static boolean field2465 = true;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)Z")
    public abstract boolean method801(int arg0);

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method800(byte arg0);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFFZ)F")
    public static final float method1180(float arg0, float arg1, float arg2, boolean arg3) {
        if (arg3) {
            method1182((byte) 102);
        }
        field2461++;
        return (arg2 - arg1) * arg0 + arg1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
    public static final void method1181(boolean arg0, int arg1) {
        field2457++;
        class292.method1811(true);
        if (class17.field266 != 30 && class17.field266 != 25) {
            return;
        }
        class57.field830++;
        if (arg1 != 4) {
            field2465 = false;
        }
        if (class57.field830 < 50 && !arg0) {
            return;
        }
        class57.field830 = 0;
        if (!class359.field5432 && class138.field2091 != null) {
            class114.method841(false, class297.field4241);
            class414.field6097++;
            try {
                class138.field2091.method695(class86.field1436.field4333, 0, class86.field1436.field4326, (byte) 123);
                class86.field1436.field4333 = 0;
            } catch (IOException var2) {
                class359.field5432 = true;
            }
        }
        class292.method1811(true);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        field2464 = null;
        if (arg0 != -85) {
            field2460 = null;
        }
        field2463 = null;
        field2460 = null;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lqo;I)V")
    public class163(class19 arg0, int arg1) {
        this.field2458 = arg1;
        this.field2459 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILtn;I)V")
    public static final void method1183(int arg0, int arg1, class58 arg2, int arg3) {
        field2462++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field833 != null) {
            class519 var4 = new class519();
            var4.field7625 = arg2;
            var4.field7627 = arg2.field833;
            class150.method1086(var4);
        }
        if (arg3 != -51) {
            field2464 = null;
        }
        class189.field2797 = arg2.field951;
        class301.field4287 = true;
        class288.field4144 = arg0;
        class153.field2343 = arg2.field840;
        class458.field6759 = arg1;
        class114.field1817 = arg2.field955;
        class135.field2070 = arg2.field946;
        class508.field7429 = arg2.field986;
        class139.method1027(arg2, false);
    }
}
