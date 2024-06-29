import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class592 {

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    public int field8290;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "Ltba;")
    private class147 field8291;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public static int field8293 = 0;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public static int field8295;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3352(int arg0) {
        field8292++;
        if (arg0 != -15934) {
            field8294 = 67;
        }
        class541.field7327 = false;
        class48.method384(class627.field8692, 1, class426.field5970, class603.field8403, class568.field8040);
    }

    @OriginalMember(owner = "client!wda", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() throws Throwable {
        field8295++;
        this.field8291.method1067(this.field8290, 5888);
        super.finalize();
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ltba;II)V", line = 32)
    public class592(class147 arg0, int arg1, int arg2) {
        this.field8290 = arg2;
        this.field8291 = arg0;
    }
}
