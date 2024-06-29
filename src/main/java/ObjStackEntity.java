import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Z")
    private boolean field503 = false;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        ObjType var2 = ObjType.method348(this.field504);
        if (!arg0) {
            this.field503 = !this.field503;
        }
        return var2.method352(this.field505);
    }
}
