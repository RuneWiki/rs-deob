import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class257 extends RuntimeException {

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Ljava/lang/String;")
    public String field4340;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4336;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4332 = 0;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lbe;")
    private static class283 field4335 = class153.method941(127, "Prepared sound engine");

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lbe;")
    public static class283 field4333 = field4335;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[Lsd;")
    public static class26[] field4338 = new class26[5000];

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lhm;")
    public static class19 field4334;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 12)
    public static void method1735(int arg0) {
        if (arg0 == 95) {
            field4335 = null;
            field4338 = null;
            field4334 = null;
            field4333 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIZILkd;)V", line = 64)
    public static final void method1736(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class70 arg6) {
        field4337++;
        class288.method1975(false, arg6.field1210, arg6.field1193, arg0, arg3, arg1, arg2, arg5);
        if (!arg4) {
            field4334 = (class19) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lug;", line = 79)
    public static final class291 method1737(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2642;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 88)
    public class257(Throwable arg0, String arg1) {
        this.field4340 = arg1;
        this.field4336 = arg0;
    }
}
