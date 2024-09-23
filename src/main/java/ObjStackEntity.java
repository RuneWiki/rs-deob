import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "db", name = "l", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "db", name = "m", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "db", name = "a", descriptor = "(I)Lfb;")
    public final Model method122(int arg0) {
        if (arg0 != -13634) {
            throw new NullPointerException();
        }
        ObjType var2 = ObjType.method348(this.field509);
        return var2.method352(this.field510);
    }
}
