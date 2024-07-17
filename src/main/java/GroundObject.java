import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BMEXSMOV")
public class GroundObject {

    @OriginalMember(owner = "BMEXSMOV", name = "g", descriptor = "I")
    public int bitset;

    @OriginalMember(owner = "BMEXSMOV", name = "a", descriptor = "I")
    public int level;

    @OriginalMember(owner = "BMEXSMOV", name = "h", descriptor = "I")
    public int offset;

    @OriginalMember(owner = "BMEXSMOV", name = "b", descriptor = "I")
    public int x;

    @OriginalMember(owner = "BMEXSMOV", name = "c", descriptor = "I")
    public int z;

    @OriginalMember(owner = "BMEXSMOV", name = "e", descriptor = "LXHHRODPC;")
    public Entity bottomObj;

    @OriginalMember(owner = "BMEXSMOV", name = "f", descriptor = "LXHHRODPC;")
    public Entity middleObj;

    @OriginalMember(owner = "BMEXSMOV", name = "d", descriptor = "LXHHRODPC;")
    public Entity topObj;
}
