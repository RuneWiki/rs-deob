import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class350 extends class184 {

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)V")
    public final void method699(int arg0, boolean arg1) {
        if (arg0 <= -54) {
            super.field2626.method3487(false, true);
            ++field4946;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Liia;ZI)V")
    public final void method700(class87 arg0, boolean arg1, int arg2) {
        super.field2626.method3425(arg0, -114);
        ++field4948;
        if (!arg1) {
            super.field2626.method3417(arg2, 0);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIZ)V")
    public final void method705(int arg0, int arg1, boolean arg2) {
        ++field4943;
        if (arg2) {
            this.method702(true);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI)V")
    public final void method704(boolean arg0, int arg1) {
        ++field4944;
        if (arg1 != -28981) {
            this.method705(-48, 43, true);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)Z")
    public final boolean method698(int arg0) {
        if (arg0 != -20958) {
            return true;
        } else {
            ++field4945;
            return true;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Loea;)V")
    public class350(class594 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V")
    public final void method702(boolean arg0) {
        super.field2626.method3487(false, false);
        if (arg0) {
            ++field4947;
        }
    }
}
