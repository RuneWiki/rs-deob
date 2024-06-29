import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class214 implements class419 {

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "Lpfa;")
    private class275 field2509;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Ljava/lang/String;")
    private String field2507;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "Lkp;")
    public static class456 field2512 = new class456();

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V", line = 4)
    public static void method1247(byte arg0) {
        field2512 = null;
        if (arg0 != 68) {
            method1248(79, 23, 26);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I", line = 15)
    public final int method909(int arg0) {
        field2510++;
        if (arg0 != -1038) {
            field2512 = null;
        }
        return this.field2509.method1640(arg0 - 20618, this.field2507) ? 100 : this.field2509.method1643(this.field2507, true);
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lpfa;Ljava/lang/String;)V", line = 33)
    public class214(class275 arg0, String arg1) {
        this.field2509 = arg0;
        this.field2507 = arg1;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Z", line = 43)
    public static final boolean method1248(int arg0, int arg1, int arg2) {
        field2511++;
        int var3 = 94 % ((arg0 + 56) / 33);
        return class518.method2808(arg1, 108, arg2) | (arg1 & 0x70000) != 0 || class632.method3547((byte) 104, arg1, arg2);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)Ldda;", line = 53)
    public final class354 method908(byte arg0) {
        field2508++;
        int var2 = 85 % ((26 - arg0) / 46);
        return class354.field4573;
    }
}
