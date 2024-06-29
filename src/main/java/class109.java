import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class109 extends class202 {

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "Llg;")
    public class13 field2050;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "Z")
    public static boolean field2054 = false;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "Loh;")
    public static class263 field2055 = class253.method1681(-120, "(U(Y");

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "Loh;")
    public static class263 field2051 = class253.method1681(-123, "scrollen:");

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "Loh;")
    public static class263 field2056 = class253.method1681(-128, "scape main");

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "[[I")
    public static int[][] field2057 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "Loh;")
    private static class263 field2053 = class253.method1681(-120, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "Loh;")
    public static class263 field2058 = field2053;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "Ltf;")
    public static class104 field2052;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBIZI)V")
    public static final void method725(int arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        boolean var5 = false;
        class2.field23 = 0L;
        int var6 = class220.method1506((byte) -88);
        if (arg4 == 3 || var6 == 3) {
            arg3 = true;
        }
        if (var6 > 0 != arg4 > 0) {
            var5 = true;
        }
        int var7 = -105 / ((-arg1 - 69) / 41);
        field2049++;
        if (class262.field4551.startsWith("mac") && arg4 > 0) {
            arg3 = true;
        }
        if (arg3 && arg4 > 0) {
            var5 = true;
        }
        class85.method568(arg3, var6, arg4, arg0, arg2, var5, -7415);
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public static void method726(int arg0) {
        field2051 = null;
        field2056 = null;
        field2053 = null;
        if (arg0 == 0) {
            field2055 = null;
            field2057 = null;
            field2058 = null;
            field2052 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Llg;)V")
    public class109(class13 arg0) {
        this.field2050 = arg0;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lsi;I)Loh;")
    public static final class263 method727(class194 arg0, int arg1) {
        if (arg1 != 0) {
            field2054 = false;
        }
        field2059++;
        return class200.method1389((byte) -12, arg0, 32767);
    }
}
