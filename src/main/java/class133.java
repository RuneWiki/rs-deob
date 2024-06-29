import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class133 extends class28 {

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Lpi;")
    public class172 field2410;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Ls;")
    public static class194 field2411 = new class194(16);

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "Lqe;")
    public static class179 field2418 = class206.method1380("Hierhin gehen", (byte) -127);

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Lqe;")
    private static class179 field2412 = class206.method1380("Login server offline)3", (byte) 44);

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Lqe;")
    public static class179 field2414 = field2412;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Lqe;")
    public static class179 field2419 = class206.method1380("mapscene", (byte) -127);

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "J")
    public static long field2416;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "J")
    public static long field2417;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "Lpc;")
    public static class166 field2413;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
    public static final void method850(byte arg0) {
        if (arg0 > -12) {
            field2418 = null;
        }
        if (class87.field1663 != null) {
            class87.field1663.method303(1);
        }
        field2415++;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lpi;)V")
    public class133(class172 arg0) {
        this.field2410 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static void method851(int arg0) {
        field2419 = null;
        field2414 = null;
        field2412 = null;
        field2418 = null;
        field2413 = null;
        if (arg0 != 16) {
            method850((byte) -110);
        }
        field2411 = null;
    }
}
