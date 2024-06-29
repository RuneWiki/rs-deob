import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class158 {

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public int field2451;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public int field2446;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Lsn;")
    public class158 field2450;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Lpha;")
    public static class553 field2456;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Ltc;")
    public class73 field2449;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "[[Lraa;")
    public static class353[][] field2453;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "[[[I")
    public static int[][][] field2452;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)Lsn;")
    public final class158 method1178(int arg0, byte arg1) {
        if (arg1 > -98) {
            return null;
        } else {
            field2457++;
            return new class158(this.field2446, arg0);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)Ltda;")
    public final class338 method1179(int arg0) {
        field2447++;
        return arg0 == 20416 ? class257.method1733(arg0 - 48137, this.field2446) : null;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
    public static void method1180(int arg0) {
        field2453 = null;
        field2456 = null;
        if (arg0 != -25934) {
            field2452 = null;
        }
        field2452 = null;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(II)V")
    public class158(int arg0, int arg1) {
        this.field2451 = arg1;
        this.field2446 = arg0;
    }
}
