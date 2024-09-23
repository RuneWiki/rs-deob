import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "cb", name = "n", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "cb", name = "a", descriptor = "(B)Leb;")
    public final Model method109(byte arg0) {
        if (arg0 != -67) {
            throw new NullPointerException();
        }
        ObjType var2 = ObjType.method348(this.field500);
        return var2.method352(this.field501);
    }
}
