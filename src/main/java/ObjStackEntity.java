import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "db", name = "l", descriptor = "Z")
    private boolean field499 = true;

    @OriginalMember(owner = "db", name = "m", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "db", name = "n", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "db", name = "a", descriptor = "(I)Lfb;")
    public final Model method122(int arg0) {
        ObjType var2 = ObjType.method348(this.field500);
        if (arg0 != 5560) {
            this.field499 = !this.field499;
        }
        return var2.method352(this.field501);
    }
}
