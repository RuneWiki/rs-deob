import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class193 {

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Z")
    public boolean field3335 = true;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "C")
    private char field3343;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "F")
    public static float field3345;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lvr;")
    public static class197 field3333;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lit;")
    public static class34 field3340;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lit;")
    public static class34 field3341;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Lla;")
    public static class422 field3342;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lvm;")
    public static class72 field3337;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Ljava/lang/String;")
    public String field3338;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1463(int arg0) {
        field3334++;
        if (arg0 == -6764) {
            return this.field3343 == 's';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 17)
    public static void method1464(int arg0) {
        field3340 = null;
        field3342 = null;
        if (arg0 >= -53) {
            field3337 = null;
        }
        field3333 = null;
        field3341 = null;
        field3337 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lofa;B)V", line = 38)
    public final void method1465(class301 arg0, byte arg1) {
        if (arg1 != -3) {
            this.method1465(null, (byte) -1);
        }
        field3344++;
        while (true) {
            int var3 = arg0.method1987(-62);
            if (var3 == 0) {
                return;
            }
            this.method1466(var3, (byte) 77, arg0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBLofa;)V", line = 67)
    private final void method1466(int arg0, byte arg1, class301 arg2) {
        if (arg0 == 1) {
            this.field3343 = class232.method1610(-21630, arg2.method1984(4));
        } else if (arg0 == 2) {
            this.field3339 = arg2.method1934(-2);
        } else if (arg0 == 4) {
            this.field3335 = false;
        } else if (arg0 == 5) {
            this.field3338 = arg2.method1958(-3438);
        }
        field3336++;
        if (arg1 != 77) {
            this.method1466(-27, (byte) -63, null);
        }
    }
}
