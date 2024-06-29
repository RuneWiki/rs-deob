import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class283 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
    public static int[] field5075 = new int[50];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lnh;")
    public static class54 field5073 = new class54(50);

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field5078 = 0;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lg;")
    public static class276 field5079 = new class276(64);

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field5081 = 0;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "[J")
    public static long[] field5083 = new long[1000];

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Lhg;")
    public static class177 field5080;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)V")
    public static final void method1939(byte arg0, int arg1) {
        class167.field2939.method298(true, arg1);
        field5077++;
        if (arg0 <= -29) {
            class238.field4255.method298(true, arg1);
            class260.field4672.method298(true, arg1);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZZI)V")
    public static final void method1940(int arg0, boolean arg1, boolean arg2, int arg3) {
        field5076++;
        if (!arg2) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class140.field2443 = arg3;
        class204.field3687 = arg1;
        class267.field4751 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method1941(int arg0) {
        int var1 = 108 % ((arg0 + 41) / 63);
        field5079 = null;
        field5073 = null;
        field5075 = null;
        field5083 = null;
        field5080 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLhg;I)Ldh;")
    public static final class120 method1942(byte arg0, class177 arg1, int arg2) {
        field5074++;
        int var3 = 101 % ((arg0 - 29) / 48);
        return class231.method1581((byte) 106, arg1, arg2) ? class188.method1361(-111) : null;
    }
}
