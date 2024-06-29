import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class761 extends class521 {

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field10596;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field10594;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field10595;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method3102(boolean arg0) {
        if (arg0) {
            field10595++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 16)
    public class761(Object arg0, int arg1) {
        super(arg1);
        this.field10596 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 28)
    public final Object method3108(byte arg0) {
        int var2 = -124 / ((arg0 - 32) / 47);
        field10594++;
        return this.field10596;
    }
}
