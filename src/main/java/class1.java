import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 {

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Lcd;")
    public static class64 field3 = class44.method335((byte) 71, "hitbar_default");

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lnm;")
    public class176 field1;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lqm;")
    public static class222 field2;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Lqm;")
    public static class222 field4;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "La;")
    public class262 field6;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 7)
    public static void method1(int arg0) {
        field4 = null;
        field2 = null;
        field3 = null;
        if (arg0 != 1) {
            field3 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)V", line = 19)
    public static final void method2(boolean arg0, int arg1) {
        field5++;
        if (!arg0 || arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class218.method1561((byte) -102);
        } else if (arg1 == 2) {
            class64.method499((byte) -93);
        } else {
            throw new RuntimeException();
        }
    }
}
