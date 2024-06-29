import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class27 {

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "Lnr;")
    public class147 field399 = new class147();

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "[Lbq;")
    public static class462[] field402 = null;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "[Lf;")
    public static class536[] field400;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 3)
    public static void method183(int arg0) {
        if (arg0 < 28) {
            method185(false);
        }
        field402 = null;
        field400 = null;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V", line = 16)
    public static final void method184(int arg0) {
        class514.field6997 = null;
        class160.field2101 = null;
        class423.field5310 = null;
        class596.field8385 = null;
        class157.field2048 = null;
        class188.field2362 = null;
        field403++;
        class478.field6077 = null;
        if (arg0 != 17381) {
            method183(-57);
        }
        class645.field9071 = null;
        class238.field2972 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)Z", line = 46)
    public static final boolean method185(boolean arg0) {
        field401++;
        if (!arg0) {
            field402 = null;
        }
        return class235.field2946 == 0 ? class598.field8405.method1341(false) : true;
    }
}
