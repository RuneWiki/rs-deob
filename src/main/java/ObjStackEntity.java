import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "db", name = "l", descriptor = "I")
    private int field501 = 650;

    @OriginalMember(owner = "db", name = "m", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "db", name = "n", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "db", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        int var2 = 41 / arg0;
        ObjType var3 = ObjType.method350(this.field502);
        return var3.method354(this.field503);
    }
}
