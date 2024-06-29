import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OPNPFUJE")
public class Loc {

    @OriginalMember(owner = "client!OPNPFUJE", name = "n", descriptor = "B")
    public byte info;

    @OriginalMember(owner = "client!OPNPFUJE", name = "m", descriptor = "I")
    public int bitset;

    @OriginalMember(owner = "client!OPNPFUJE", name = "l", descriptor = "I")
    public int cycle;

    @OriginalMember(owner = "client!OPNPFUJE", name = "k", descriptor = "I")
    public int distance;

    @OriginalMember(owner = "client!OPNPFUJE", name = "a", descriptor = "I")
    public int level;

    @OriginalMember(owner = "client!OPNPFUJE", name = "h", descriptor = "I")
    public int maxSceneTileX;

    @OriginalMember(owner = "client!OPNPFUJE", name = "j", descriptor = "I")
    public int maxSceneTileZ;

    @OriginalMember(owner = "client!OPNPFUJE", name = "g", descriptor = "I")
    public int minSceneTileX;

    @OriginalMember(owner = "client!OPNPFUJE", name = "i", descriptor = "I")
    public int minSceneTileZ;

    @OriginalMember(owner = "client!OPNPFUJE", name = "c", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!OPNPFUJE", name = "b", descriptor = "I")
    public int y;

    @OriginalMember(owner = "client!OPNPFUJE", name = "f", descriptor = "I")
    public int yaw;

    @OriginalMember(owner = "client!OPNPFUJE", name = "d", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!OPNPFUJE", name = "e", descriptor = "LXHHRODPC;")
    public Entity model;
}
