import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CVTFWCOC")
public class class11 extends class12 {

    @OriginalMember(owner = "CVTFWCOC", name = "n", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "CVTFWCOC", name = "o", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "CVTFWCOC", name = "a", descriptor = "(I)LLFTMDGKK;")
    public final class37 method1(int arg0) {
        class34 var2 = class34.method329(this.field579);
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var2.method332(this.field580);
    }
}
