import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "cb", name = "o", descriptor = "I")
    private int field494 = -241;

    @OriginalMember(owner = "cb", name = "p", descriptor = "Z")
    private boolean field495 = true;

    @OriginalMember(owner = "cb", name = "q", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "cb", name = "r", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "cb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        ObjType var2 = ObjType.method342(this.field496);
        if (!arg0) {
            this.field494 = -45;
        }
        return var2.method346(this.field497);
    }
}
