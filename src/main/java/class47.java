import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SIBDNEIR")
public class class47 extends class4 {

    @OriginalMember(owner = "SIBDNEIR", name = "n", descriptor = "I")
    private int field1209 = -23175;

    @OriginalMember(owner = "SIBDNEIR", name = "q", descriptor = "Z")
    private boolean field1212 = true;

    @OriginalMember(owner = "SIBDNEIR", name = "o", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "SIBDNEIR", name = "p", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "SIBDNEIR", name = "a", descriptor = "(Z)LYABPKWWG;")
    public final class67 method16(boolean arg0) {
        if (!arg0) {
            this.field1209 = 468;
        }
        class46 var2 = class46.method438(this.field1211);
        return var2.method441(this.field1210);
    }
}
