import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GUTBTNML")
public class class16 extends class3 {

    @OriginalMember(owner = "client!GUTBTNML", name = "k", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!GUTBTNML", name = "l", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!GUTBTNML", name = "a", descriptor = "(B)LUNLYQRUD;")
    public final class56 method10(byte arg0) {
        class12 var2 = class12.method218(this.field801);
        if (arg0 != 93) {
            throw new NullPointerException();
        }
        return var2.method222(this.field800);
    }
}
