import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class511 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field7603 = 0;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field7604 = -1;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field7605 = 0;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Lej;")
    public static final class528 method3088(int arg0, int arg1, int arg2) {
        class409 var3 = class217.field3699[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class528 var4 = var3.field6186;
            var3.field6186 = null;
            return var4;
        }
    }
}
