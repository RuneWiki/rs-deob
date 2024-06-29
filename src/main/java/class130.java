import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class130 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2303 = 0;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Ljf;")
    public static class229 field2302 = class212.method1457((byte) 78, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Z")
    public static boolean field2307 = true;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Ljf;")
    public static class229 field2308 = class212.method1457((byte) 71, "::rebuild");

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2309 = 0;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Ljf;")
    public static class229 field2304 = class212.method1457((byte) 58, "d-Broulement:");

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Ljf;")
    public static class229 field2306 = class212.method1457((byte) 124, "");

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 22)
    public static void method911(int arg0) {
        field2304 = null;
        field2306 = null;
        field2308 = null;
        if (arg0 > 25) {
            field2302 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)Ljf;", line = 135)
    public static final class229 method912(int arg0, byte arg1) {
        field2305++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        } else if (arg1 == 119) {
            class229 var2 = new class229();
            var2.field3973 = 1;
            var2.field3944 = new byte[1];
            var2.field3944[0] = (byte) arg0;
            return var2;
        } else {
            return (class229) null;
        }
    }
}
