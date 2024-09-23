import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KWSTKWPH")
public class class27 extends class34 {

    @OriginalMember(owner = "KWSTKWPH", name = "l", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "KWSTKWPH", name = "m", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "KWSTKWPH", name = "a", descriptor = "(Z)LWEVRTBOZ;")
    public final class66 method225(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        class31 var2 = class31.method322(this.field896);
        return var2.method320(this.field897);
    }
}
