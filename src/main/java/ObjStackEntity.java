import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "cb", name = "n", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "cb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        ObjType var2 = ObjType.method348(this.field512);
        if (arg0 != -47094) {
            throw new NullPointerException();
        }
        return var2.method352(this.field513);
    }
}
