import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BMEXSMOV")
public class ObjStack {

    @OriginalMember(owner = "client!BMEXSMOV", name = "g", descriptor = "I")
    public int bitset;

    @OriginalMember(owner = "client!BMEXSMOV", name = "a", descriptor = "I")
    public int level;

    @OriginalMember(owner = "client!BMEXSMOV", name = "h", descriptor = "I")
    public int offset;

    @OriginalMember(owner = "client!BMEXSMOV", name = "b", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!BMEXSMOV", name = "c", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!BMEXSMOV", name = "e", descriptor = "LXHHRODPC;")
    public Entity bottomObj;

    @OriginalMember(owner = "client!BMEXSMOV", name = "f", descriptor = "LXHHRODPC;")
    public Entity middleObj;

    @OriginalMember(owner = "client!BMEXSMOV", name = "d", descriptor = "LXHHRODPC;")
    public Entity topObj;
}
