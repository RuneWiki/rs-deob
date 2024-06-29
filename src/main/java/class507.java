import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class507 {

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public static int field7055 = 2;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)Lnba;")
    public static final class363 method2859(int arg0, int arg1, int arg2) {
        class184 var3 = class277.field4051[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2669;
    }
}
