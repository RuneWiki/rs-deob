import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LCFGLQPE")
public class class30 extends class62 {

    @OriginalMember(owner = "LCFGLQPE", name = "n", descriptor = "I")
    private int field975 = 7;

    @OriginalMember(owner = "LCFGLQPE", name = "l", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "LCFGLQPE", name = "m", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "LCFGLQPE", name = "a", descriptor = "(I)LPSGMMDJS;")
    public final class45 method196(int arg0) {
        if (arg0 != 27243) {
            this.field975 = 126;
        }
        class21 var2 = class21.method236(this.field974);
        return var2.method243(this.field973);
    }
}
