import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class168 {

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public int field2450;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "Z")
    public static boolean field2448 = false;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "Z")
    public static boolean field2446 = false;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "Lss;")
    public static class213 field2449 = new class213("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "[I")
    public static int[] field2453 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "F")
    public static float field2455 = 1.0F;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "Lbi;")
    public static class104 field2454 = new class104(29, -1);

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static void method1064(int arg0) {
        field2453 = null;
        field2449 = null;
        if (arg0 == 65280) {
            field2454 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)Lhr;")
    public final class168 method1065(int arg0, int arg1) {
        field2451++;
        return arg1 > -66 ? null : new class168(this.field2450, arg0, this.field2456, this.field2452);
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(IIII)V")
    public class168(int arg0, int arg1, int arg2, int arg3) {
        this.field2450 = arg0;
        this.field2456 = arg2;
        this.field2447 = arg1;
        this.field2452 = arg3;
    }
}
