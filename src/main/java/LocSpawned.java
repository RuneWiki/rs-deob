import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DYMVKFXP")
public class LocSpawned extends Linkable {

    @OriginalMember(owner = "client!DYMVKFXP", name = "i", descriptor = "I")
    public int duration = -1;

    @OriginalMember(owner = "client!DYMVKFXP", name = "q", descriptor = "I")
    public int delay;

    @OriginalMember(owner = "client!DYMVKFXP", name = "k", descriptor = "I")
    public int layer;

    @OriginalMember(owner = "client!DYMVKFXP", name = "j", descriptor = "I")
    public int level;

    @OriginalMember(owner = "client!DYMVKFXP", name = "l", descriptor = "I")
    public int localX;

    @OriginalMember(owner = "client!DYMVKFXP", name = "m", descriptor = "I")
    public int localZ;

    @OriginalMember(owner = "client!DYMVKFXP", name = "o", descriptor = "I")
    public int previousRotation;

    @OriginalMember(owner = "client!DYMVKFXP", name = "p", descriptor = "I")
    public int previousShape;

    @OriginalMember(owner = "client!DYMVKFXP", name = "n", descriptor = "I")
    public int previousType;

    @OriginalMember(owner = "client!DYMVKFXP", name = "g", descriptor = "I")
    public int rotation;

    @OriginalMember(owner = "client!DYMVKFXP", name = "h", descriptor = "I")
    public int shape;

    @OriginalMember(owner = "client!DYMVKFXP", name = "f", descriptor = "I")
    public int type;
}
