import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class154 {

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lim;")
    public static class598 field2526 = new class598("game3", 2);

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "J")
    public long field2528;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lwk;")
    public class154 field2524;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lwk;")
    public class154 field2527;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Lnn;")
    public static class439 field2531;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
    public static void method1206(byte arg0) {
        if (arg0 != 43) {
            field2526 = null;
        }
        field2526 = null;
        field2531 = null;
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
    public final void method1207(int arg0) {
        field2530++;
        if (this.field2527 != null && arg0 >= 79) {
            this.field2527.field2524 = this.field2524;
            this.field2524.field2527 = this.field2527;
            this.field2527 = null;
            this.field2524 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)Z")
    public final boolean method1208(int arg0) {
        field2529++;
        if (this.field2527 == null) {
            return false;
        } else {
            if (arg0 >= -102) {
                field2526 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1209(int arg0, byte arg1, int arg2) {
        field2525++;
        int var3 = -66 / ((arg1 + 33) / 48);
        return false;
    }
}
