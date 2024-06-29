import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class190 extends class161 {

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public int field3329;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Lp;")
    public static class280 field3327 = class18.method140((byte) -126, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field3330 = 2;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "Z")
    public static boolean field3332 = true;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Ltg;")
    public static class180 field3333;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static void method1320(byte arg0) {
        field3333 = null;
        if (arg0 == -68) {
            field3327 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class190() {
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(I)V")
    public class190(int arg0) {
        this.field3329 = arg0;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
    public static final void method1321(int arg0) {
        field3334++;
        class193.field3413.method1481(false);
        if (arg0 != 2) {
            method1321(42);
        }
        class97.field1552.method1481(false);
    }
}
