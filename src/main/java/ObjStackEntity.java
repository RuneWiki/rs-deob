import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "db", name = "m", descriptor = "Z")
    private boolean field500 = true;

    @OriginalMember(owner = "db", name = "n", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "db", name = "o", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "db", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        if (arg0 != -28205) {
            this.field500 = !this.field500;
        }
        ObjType var2 = ObjType.method350(this.field501);
        return var2.method354(this.field502);
    }
}
