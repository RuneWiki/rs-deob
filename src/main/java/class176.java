import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class176 {

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field2604 = 0;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field2602 = 0;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Z")
    public static boolean field2606 = false;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Z")
    public static boolean field2607 = false;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)Z")
    public static final boolean method1318(int arg0, int arg1, int arg2) {
        int var3 = class144.field2184[arg0][arg1][arg2];
        if (-class19.field378 == var3) {
            return false;
        } else if (class19.field378 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class10.method51(var4 + 1, class91.field1351[arg0].method1509(arg1, arg2), var5 + 1) && class10.method51(var4 + 128 - 1, class91.field1351[arg0].method1509(arg1 + 1, arg2), var5 + 1) && class10.method51(var4 + 128 - 1, class91.field1351[arg0].method1509(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class10.method51(var4 + 1, class91.field1351[arg0].method1509(arg1, arg2 + 1), var5 + 128 - 1)) {
                class144.field2184[arg0][arg1][arg2] = class19.field378;
                return true;
            } else {
                class144.field2184[arg0][arg1][arg2] = -class19.field378;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)Lel;")
    public static final class329 method1319(int arg0, byte arg1) {
        field2605++;
        if (arg1 <= 12) {
            method1318(122, 87, -58);
        }
        return (class329) class19.field374.method614(-88, (long) arg0);
    }
}
