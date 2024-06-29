import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    private int field501 = 650;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        int var2 = 41 / arg0;
        ObjType var3 = ObjType.method350(this.field502);
        return var3.method354(this.field503);
    }
}
