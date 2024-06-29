import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class403 {

    @OriginalMember(owner = "client!no", name = "c", descriptor = "[Lio;")
    public static class118[] field6086 = new class118[4];

    @OriginalMember(owner = "client!no", name = "d", descriptor = "Ljo;")
    public static class382 field6087 = new class382(10);

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLb;)Z", line = 8)
    public static final boolean method2432(byte arg0, class473 arg1) {
        field6084++;
        if (arg0 != 0) {
            field6086 = null;
        }
        if (arg1 == null) {
            return false;
        } else if (!arg1.field6966) {
            return false;
        } else if (!arg1.method2818(class137.field2016, -120)) {
            return false;
        } else if (class261.field3901.method3059(86, (long) arg1.field6968) == null) {
            return class285.field4286.method3059(69, (long) arg1.field6967) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 49)
    public static void method2433(byte arg0) {
        field6087 = null;
        if (arg0 <= -26) {
            field6086 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IBI)Z", line = 60)
    public static final boolean method2434(int arg0, byte arg1, int arg2) {
        int var3 = -121 % ((37 - arg1) / 42);
        field6085++;
        return (arg0 & 0x800) != 0;
    }
}
