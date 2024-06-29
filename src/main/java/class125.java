import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class125 {

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    private int field2058;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field2059 = -50;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lvh;")
    public static class125 field2057 = new class125(74, 3);

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "F")
    public static float field2056;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lpa;")
    public static class587 field2052;

    @OriginalMember(owner = "client!vh", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field2053++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I", line = 16)
    public final int method997(byte arg0) {
        field2051++;
        if (arg0 < 20) {
            this.field2054 = 12;
        }
        return this.field2058;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)V", line = 32)
    public static final void method998(int arg0, int arg1, int arg2, int arg3) {
        field2055++;
        if (arg1 != -50) {
            field2056 = -0.4358284F;
        }
        class449 var4 = class611.method3463(arg2, (byte) -112, 11);
        var4.method2615((byte) -73);
        var4.field6472 = arg3;
        var4.field6480 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(II)V", line = 48)
    public class125(int arg0, int arg1) {
        this.field2054 = arg1;
        this.field2058 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 57)
    public static void method999(int arg0) {
        if (arg0 > -77) {
            method999(67);
        }
        field2052 = null;
        field2057 = null;
    }
}
