import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FGBEUODV")
public class class14 extends class31 {

    @OriginalMember(owner = "client!FGBEUODV", name = "n", descriptor = "I")
    private int field740 = 2;

    @OriginalMember(owner = "client!FGBEUODV", name = "l", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!FGBEUODV", name = "m", descriptor = "I")
    public int field739;

    @OriginalMember(owner = "client!FGBEUODV", name = "a", descriptor = "(B)LXBVYIDUH;")
    public final class65 method39(byte arg0) {
        class45 var2 = class45.method456(this.field738);
        if (arg0 == 3) {
            boolean var3 = false;
        } else {
            this.field740 = -283;
        }
        return var2.method454(this.field739);
    }
}
