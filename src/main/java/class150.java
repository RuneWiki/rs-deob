import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class150 {

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "Lhv;")
    public class150 field2408;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "Lc;")
    public class202 field2412;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "Lvv;")
    public static class313 field2405 = new class313(78, -2);

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V", line = 12)
    public static void method1070(int arg0) {
        if (arg0 >= -47) {
            field2406 = -45;
        }
        field2405 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)Lnp;", line = 23)
    public final class115 method1071(boolean arg0) {
        field2414++;
        return arg0 ? null : class69.method485(this.field2411, -71);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)Lhv;", line = 38)
    public final class150 method1072(int arg0, int arg1) {
        field2409++;
        if (arg1 != -2) {
            method1070(-126);
        }
        return new class150(this.field2411, arg0);
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(II)V", line = 49)
    public class150(int arg0, int arg1) {
        this.field2407 = arg1;
        this.field2411 = arg0;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lhv;I)V", line = 57)
    public class150(class150 arg0, int arg1) {
        this.field2408 = arg0;
        this.field2411 = this.field2408.field2411;
        this.field2412 = this.field2408.field2412;
        this.field2407 = this.field2408.field2407 + arg1;
    }
}
