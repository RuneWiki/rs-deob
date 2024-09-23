import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FIJVWXBZ")
public class class9 extends class66 {

    @OriginalMember(owner = "FIJVWXBZ", name = "l", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "FIJVWXBZ", name = "m", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "FIJVWXBZ", name = "a", descriptor = "(Z)LCSGBDGDY;")
    public final class4 method187(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        class19 var2 = class19.method254(this.field693);
        return var2.method258(this.field692);
    }
}
