import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "cb", name = "l", descriptor = "I")
    private int field497 = 2;

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "cb", name = "n", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "cb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (arg0 != -21173) {
            this.field497 = 179;
        }
        ObjType var2 = ObjType.method345(this.field498);
        return var2.method349(this.field499);
    }
}
