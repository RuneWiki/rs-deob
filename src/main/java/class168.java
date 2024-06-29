import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class168 {

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "[C")
    public static char[] field2343 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Lfi;")
    public static class332 field2342 = new class332(5000);

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "[Ldi;")
    public static class64[] field2345 = new class64[14];

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)V", line = 7)
    public static final void method1134(byte arg0, int arg1) {
        field2344++;
        class237 var2 = class88.field1060;
        synchronized (class88.field1060) {
            class88.field1060.method1629(arg1, 112);
            if (arg0 >= -2) {
                method1135((byte) -94);
            }
        }
        class237 var3 = class285.field4005;
        synchronized (class285.field4005) {
            class285.field4005.method1629(arg1, 39);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 25)
    public static void method1135(byte arg0) {
        field2345 = null;
        if (arg0 > -12) {
            method1134((byte) -111, 59);
        }
        field2343 = null;
        field2342 = null;
    }
}
