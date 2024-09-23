import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "db", name = "l", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "db", name = "m", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "db", name = "a", descriptor = "(I)Lfb;")
    public final Model method121(int arg0) {
        ObjType var2 = ObjType.method335(this.field487);
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var2.method339(this.field488);
    }
}
