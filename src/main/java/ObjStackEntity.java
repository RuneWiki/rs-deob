import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "cb", name = "o", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "cb", name = "p", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "cb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        ObjType var2 = ObjType.method348(this.field498);
        return var2.method352(this.field499);
    }
}
