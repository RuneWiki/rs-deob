import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "cb", name = "l", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "cb", name = "a", descriptor = "(B)Leb;")
    public final Model method109(byte arg0) {
        if (arg0 != -59) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        ObjType var3 = ObjType.method348(this.field503);
        return var3.method352(this.field504);
    }
}
