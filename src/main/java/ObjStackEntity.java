import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Z")
    private boolean field495 = true;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        ObjType var2 = ObjType.method344(this.field496);
        if (arg0 != -37770) {
            this.field495 = !this.field495;
        }
        return var2.method348(this.field497);
    }
}
