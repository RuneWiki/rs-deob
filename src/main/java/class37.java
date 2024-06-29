import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class37 extends class564 {

    @OriginalMember(owner = "client!bea", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field377;

    @OriginalMember(owner = "client!bea", name = "E", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!bea", name = "F", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)Z", line = 5)
    public final boolean method293(boolean arg0) {
        field378++;
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(B)Ljava/lang/Object;", line = 16)
    public final Object method294(byte arg0) {
        field379++;
        if (arg0 != 36) {
            this.field377 = null;
        }
        return this.field377;
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lwt;Ljava/lang/Object;I)V", line = 28)
    public class37(class520 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field377 = arg1;
    }
}
