import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class316 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field4221 = -1;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Laa;")
    public static final class274 method1828(int arg0, int arg1, int arg2) {
        class96 var3 = class176.field2209[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1126;
    }
}
