import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class class223 {

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public int field3005;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "[C")
    public static char[] field3007 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Z")
    public static boolean field3009 = false;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZI)V")
    public static final void method1400(String arg0, int arg1, String arg2, String arg3, boolean arg4, int arg5) {
        class413.method2394(-4694, arg3, arg2, arg0, -1, arg5, null, arg1);
        if (arg4) {
            method1400(null, -50, null, null, false, 63);
        }
        field3004++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static final void method1401(int arg0) {
        field3006++;
        if (class27.field459 == 5) {
            class27.field459 = 6;
            int var1 = -18 % ((-arg0 - 19) / 59);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V")
    public abstract void method209(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)V")
    public abstract void method211(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(III)V")
    public abstract void method205(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static void method1402(boolean arg0) {
        if (arg0) {
            method1402(false);
        }
        field3007 = null;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(III)V")
    public class223(int arg0, int arg1, int arg2) {
        this.field3010 = arg1;
        this.field3003 = arg2;
        this.field3005 = arg0;
    }
}
