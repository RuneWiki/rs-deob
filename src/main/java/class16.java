import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GEPRJOHJ")
public class class16 extends class67 {

    @OriginalMember(owner = "client!GEPRJOHJ", name = "l", descriptor = "I")
    private int field733 = 3;

    @OriginalMember(owner = "client!GEPRJOHJ", name = "m", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!GEPRJOHJ", name = "n", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!GEPRJOHJ", name = "a", descriptor = "(B)LPDVZPZLT;")
    public final class42 method3(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.field733 = 274;
        }
        class3 var3 = class3.method11(this.field735);
        return var3.method14(this.field734);
    }
}
