import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        ObjType var2 = ObjType.method350(this.field501);
        if (arg0 != 45160) {
            throw new NullPointerException();
        }
        return var2.method354(this.field502);
    }
}
