import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class337 {

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Ltn;")
    public static class109 field4556 = new class109(16);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Lge;")
    public static class104 field4554;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Lij;")
    public static class316 field4557;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Lcp;")
    public static class399 field4558;

    static {
        new class65(64);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 4)
    public static void method2045(int arg0) {
        field4556 = null;
        field4558 = null;
        field4557 = null;
        if (arg0 != 64) {
            field4557 = null;
        }
        field4554 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V", line = 17)
    public static final void method2046(int arg0) {
        field4555++;
        class367.field5097.method2522((byte) 58);
        if (arg0 >= -18) {
            field4557 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLwk;)Z", line = 37)
    public static final boolean method2047(byte arg0, class430 arg1) {
        field4552++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field6012) {
            return false;
        } else if (!arg1.method2650((byte) 40)) {
            return false;
        } else if (class113.field1744.method837((byte) -72, (long) arg1.field6009) != null) {
            return false;
        } else if (class204.field2903.method837((byte) -72, (long) arg1.field6021) == null) {
            if (arg0 != 1) {
                method2046(-123);
            }
            return true;
        } else {
            return false;
        }
    }
}
