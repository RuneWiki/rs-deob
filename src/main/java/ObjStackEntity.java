import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "cb", name = "l", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "cb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        ObjType var2 = ObjType.method341(this.field491);
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var2.method345(this.field492);
    }
}
