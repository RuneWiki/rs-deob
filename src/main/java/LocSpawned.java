import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DYMVKFXP")
public class LocSpawned extends Linkable {

    @OriginalMember(owner = "DYMVKFXP", name = "i", descriptor = "I")
    public int duration = -1;

    @OriginalMember(owner = "DYMVKFXP", name = "q", descriptor = "I")
    public int delay;

    @OriginalMember(owner = "DYMVKFXP", name = "k", descriptor = "I")
    public int layer;

    @OriginalMember(owner = "DYMVKFXP", name = "j", descriptor = "I")
    public int level;

    @OriginalMember(owner = "DYMVKFXP", name = "l", descriptor = "I")
    public int localX;

    @OriginalMember(owner = "DYMVKFXP", name = "m", descriptor = "I")
    public int localZ;

    @OriginalMember(owner = "DYMVKFXP", name = "o", descriptor = "I")
    public int previousRotation;

    @OriginalMember(owner = "DYMVKFXP", name = "p", descriptor = "I")
    public int previousShape;

    @OriginalMember(owner = "DYMVKFXP", name = "n", descriptor = "I")
    public int previousType;

    @OriginalMember(owner = "DYMVKFXP", name = "g", descriptor = "I")
    public int rotation;

    @OriginalMember(owner = "DYMVKFXP", name = "h", descriptor = "I")
    public int shape;

    @OriginalMember(owner = "DYMVKFXP", name = "f", descriptor = "I")
    public int type;
}
