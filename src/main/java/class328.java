import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class328 implements class231 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Lbi;")
    private class449 field4517;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field4520 = 0;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Z")
    public static boolean field4521 = false;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[Ldv;")
    public static class616[] field4522 = new class616[14];

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Lfu;")
    public static class362 field4518;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    public static void method1962(int arg0) {
        field4522 = null;
        field4518 = null;
        if (arg0 != 0) {
            field4520 = 34;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
    public final int method592(int arg0) {
        field4519++;
        if (arg0 == -11428) {
            return this.field4517.method2533((byte) -115) ? 100 : this.field4517.method2526(-1);
        } else {
            return 119;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Liaa;")
    public final class462 method590(byte arg0) {
        int var2 = -30 % ((arg0 - 6) / 57);
        field4523++;
        return class462.field6252;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lbi;)V")
    public class328(class449 arg0) {
        this.field4517 = arg0;
    }
}
