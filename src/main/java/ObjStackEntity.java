import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "db", name = "l", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "db", name = "m", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "db", name = "a", descriptor = "(B)Lfb;")
    public final Model method123(byte arg0) {
        ObjType var2 = ObjType.method350(this.field520);
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        return var2.method354(this.field521);
    }
}
