import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class94 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)Lem;")
    public static final class98 method607(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class98 var4 = var3.field2414;
            var3.field2414 = null;
            return var4;
        }
    }
}
