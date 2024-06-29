import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class162 extends class431 {

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    public int field2403 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public int field2401 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public int field2411 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
    public int field2410 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public int field2402 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
    public int field2412 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
    public int field2408 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public int field2405 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "Lkn;")
    public class523 field2404;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "Lhn;")
    public static class509 field2409 = new class509(72, 6);

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
    public static int field2414 = 0;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "Lti;")
    public static class307 field2413;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
    public static void method1097(byte arg0) {
        field2413 = null;
        field2409 = null;
        if (arg0 >= -81) {
            method1097((byte) -71);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)Z")
    public final boolean method1098(int arg0, int arg1, int arg2) {
        if (arg1 != Integer.MIN_VALUE) {
            return false;
        }
        field2407++;
        if (this.field2411 <= arg2 && this.field2405 >= arg2 && arg0 >= this.field2410 && arg0 <= this.field2401) {
            return true;
        } else {
            return this.field2412 <= arg2 && arg2 <= this.field2402 && arg0 >= this.field2408 && this.field2403 >= arg0;
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lkn;)V")
    public class162(class523 arg0) {
        this.field2404 = arg0;
    }
}
