import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XXIPNARK")
public class class65 extends class63 {

    @OriginalMember(owner = "XXIPNARK", name = "n", descriptor = "Z")
    private boolean field1620 = true;

    @OriginalMember(owner = "XXIPNARK", name = "l", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "XXIPNARK", name = "m", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "XXIPNARK", name = "a", descriptor = "(I)LKPUOCBCE;")
    public final class35 method11(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field1620 = !this.field1620;
        }
        class24 var2 = class24.method293(this.field1618);
        return var2.method301(this.field1619);
    }
}
