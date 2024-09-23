import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YSIOSDRV")
public class class69 extends class2 {

    @OriginalMember(owner = "YSIOSDRV", name = "m", descriptor = "I")
    private int field1682 = 5;

    @OriginalMember(owner = "YSIOSDRV", name = "n", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "YSIOSDRV", name = "o", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "YSIOSDRV", name = "a", descriptor = "(I)LJLNSJQDR;")
    public final class26 method2(int arg0) {
        class33 var2 = class33.method409(this.field1683);
        if (arg0 < this.field1682 || arg0 > this.field1682) {
            throw new NullPointerException();
        }
        return var2.method420(this.field1684);
    }
}
