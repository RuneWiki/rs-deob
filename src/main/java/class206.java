import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class206 {

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3454 = null;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "Leda;")
    public static class14 field3455 = new class14(30);

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3456 = new String[100];

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "Leda;")
    public static class14 field3457 = new class14(64);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "Ltp;")
    public static class294 field3459;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIB)Z", line = 10)
    public static final boolean method1510(int arg0, int arg1, byte arg2) {
        int var3 = -18 % ((arg2 + 17) / 43);
        field3452++;
        boolean var4 = (arg0 & 0x37) == 0 ? class515.method3082(arg1, arg0, 91) : class257.method1730(arg0, -72, arg1);
        return var4 | class315.method2073(arg1, arg0, (byte) -81) | (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 22)
    public static void method1511(int arg0) {
        field3454 = null;
        field3455 = null;
        field3456 = null;
        if (arg0 != -21318) {
            field3455 = null;
        }
        field3457 = null;
        field3459 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lha;B)V", line = 37)
    public static final void method1512(class544 arg0, byte arg1) {
        field3453++;
        if (class263.field4079 == class145.field2251.field9470 || class488.field7062 == null) {
            return;
        }
        if (class741.method4147(arg0, (byte) 22, class145.field2251.field9470)) {
            class263.field4079 = class145.field2251.field9470;
        }
        if (arg1 != -112) {
            field3457 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "toString", descriptor = "()Ljava/lang/String;", line = 61)
    public final String toString() {
        field3458++;
        throw new IllegalStateException();
    }
}
