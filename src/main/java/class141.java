import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class141 {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lpk;")
    public static class98 field2534 = new class98();

    @OriginalMember(owner = "client!w", name = "d", descriptor = "[I")
    public static int[] field2535 = new int[128];

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Leb;")
    public static class230 field2537 = class68.method589(0, "M");

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lkk;")
    public static class223 field2533;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1081(int arg0) {
        field2533 = null;
        if (arg0 > 9) {
            field2534 = null;
            field2537 = null;
            field2535 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLkk;Lkk;)I")
    public static final int method1082(boolean arg0, class223 arg1, class223 arg2) {
        field2532++;
        int var3 = 0;
        if (arg1.method1550(class271.field4788, 25648)) {
            var3++;
        }
        if (arg1.method1550(class121.field2136, 25648)) {
            var3++;
        }
        if (!arg0) {
            return -125;
        }
        if (arg1.method1550(class124.field2168, 25648)) {
            var3++;
        }
        if (arg2.method1550(class271.field4788, 25648)) {
            var3++;
        }
        if (arg2.method1550(class121.field2136, 25648)) {
            var3++;
        }
        if (arg2.method1550(class124.field2168, 25648)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[B)V")
    public abstract void method1083(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1084(int arg0);
}
