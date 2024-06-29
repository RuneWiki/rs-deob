import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class15 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Lmk;")
    public static final class212 method88(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1957;
    }
}
