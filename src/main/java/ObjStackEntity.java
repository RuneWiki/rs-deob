import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Lfb;")
    public final Model method121(boolean arg0) {
        ObjType var2 = ObjType.method339(this.field494);
        if (arg0) {
            this.field493 = -111;
        }
        return var2.method343(this.field495);
    }
}
