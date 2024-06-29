import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HRIUIFAV")
public class ObjStackEntity extends Entity {

    @OriginalMember(owner = "client!HRIUIFAV", name = "m", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!HRIUIFAV", name = "n", descriptor = "I")
    private int field874;

    @OriginalMember(owner = "client!HRIUIFAV", name = "o", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!HRIUIFAV", name = "a", descriptor = "(B)LLZYQDKJV;")
    public final Model method239(byte arg0) {
        if (arg0 != 3) {
            this.field874 = -358;
        }
        ObjType var2 = ObjType.method221(this.field873);
        return var2.method229(this.field875);
    }
}
