import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KBARUPZK")
public class class30 extends class44 {

    @OriginalMember(owner = "client!KBARUPZK", name = "o", descriptor = "Z")
    private boolean field905 = false;

    @OriginalMember(owner = "client!KBARUPZK", name = "n", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!KBARUPZK", name = "p", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!KBARUPZK", name = "a", descriptor = "(B)LRMLAXPMV;")
    public final class47 method344(byte arg0) {
        if (arg0 != 3) {
            this.field905 = !this.field905;
        }
        class45 var2 = class45.method455(this.field906);
        return var2.method456(this.field904);
    }
}
