import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "cb", name = "l", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "cb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        ObjType var3 = ObjType.method348(this.field495);
        return var3.method352(this.field496);
    }
}
