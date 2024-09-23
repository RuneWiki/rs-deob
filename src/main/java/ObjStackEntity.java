import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "cb", name = "l", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "cb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        ObjType var2 = ObjType.method348(this.field501);
        return var2.method352(this.field502);
    }
}
