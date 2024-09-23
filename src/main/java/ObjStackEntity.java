import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "cb", name = "m", descriptor = "Z")
    private boolean field493 = false;

    @OriginalMember(owner = "cb", name = "n", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "cb", name = "o", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "cb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (arg0) {
            this.field493 = !this.field493;
        }
        ObjType var2 = ObjType.method341(this.field494);
        return var2.method345(this.field495);
    }
}
