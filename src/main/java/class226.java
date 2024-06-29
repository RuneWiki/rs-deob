import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class226 extends class28 {

    @OriginalMember(owner = "client!ew", name = "w", descriptor = "I")
    public int field2933 = 0;

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "Z")
    public static boolean field2936 = false;

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "Lnj;")
    public static class415 field2935 = new class415(16, -1);

    @OriginalMember(owner = "client!ew", name = "u", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ew", name = "v", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ew", name = "x", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lfd;II)V")
    private final void method1417(class418 arg0, int arg1, int arg2) {
        if (arg2 == 2) {
            this.field2933 = arg0.method2393(-30727);
        }
        if (arg1 >= -75) {
            field2936 = false;
        }
        field2934++;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lfd;I)V")
    public final void method1418(class418 arg0, int arg1) {
        if (arg1 != 0) {
            field2936 = false;
        }
        field2931++;
        while (true) {
            int var3 = arg0.method2396(34);
            if (var3 == 0) {
                return;
            }
            this.method1417(arg0, -111, var3);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IB)Z")
    public static final boolean method1419(int arg0, byte arg1) {
        if (arg1 < 96) {
            method1419(81, (byte) 19);
        }
        field2932++;
        if (arg0 == 49 || arg0 == 48 || arg0 == 18 || arg0 == 57 || arg0 == 1006) {
            return true;
        } else {
            return arg0 == 60 || arg0 == 1004;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V")
    public static void method1420(byte arg0) {
        field2935 = null;
        if (arg0 >= -70) {
            field2935 = null;
        }
    }
}
