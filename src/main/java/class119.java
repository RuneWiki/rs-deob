import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class119 {

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2292 = 0;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field2289 = -2;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lai;")
    private static class10 field2297 = class44.method278("Loading interfaces )2 ", -15);

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lai;")
    public static class10 field2296 = field2297;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "J")
    public long field2291;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "J")
    public static long field2299;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lna;")
    public class119 field2287;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lna;")
    public class119 field2295;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Lc;")
    public static class21 field2298;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Z")
    public final boolean method845(boolean arg0) {
        if (!arg0) {
            method846(40, 45);
        }
        field2286++;
        return this.field2295 != null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lai;")
    public static final class10 method846(int arg0, int arg1) {
        field2288++;
        if (arg0 != 0) {
            field2294 = -96;
        }
        return class149.method1024(false, 10, arg1, 69);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method847(int arg0) {
        field2297 = null;
        if (arg0 > 6) {
            field2298 = null;
            field2296 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
    public final void method848(boolean arg0) {
        field2290++;
        if (this.field2295 == null) {
            return;
        }
        this.field2295.field2287 = this.field2287;
        this.field2287.field2295 = this.field2295;
        if (arg0) {
            this.field2287 = null;
        }
        this.field2287 = null;
        this.field2295 = null;
    }
}
