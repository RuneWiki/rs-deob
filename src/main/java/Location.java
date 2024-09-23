import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OPNPFUJE")
public class Location {

    @OriginalMember(owner = "OPNPFUJE", name = "n", descriptor = "B")
    public byte info;

    @OriginalMember(owner = "OPNPFUJE", name = "m", descriptor = "I")
    public int bitset;

    @OriginalMember(owner = "OPNPFUJE", name = "l", descriptor = "I")
    public int cycle;

    @OriginalMember(owner = "OPNPFUJE", name = "k", descriptor = "I")
    public int distance;

    @OriginalMember(owner = "OPNPFUJE", name = "a", descriptor = "I")
    public int level;

    @OriginalMember(owner = "OPNPFUJE", name = "h", descriptor = "I")
    public int maxSceneTileX;

    @OriginalMember(owner = "OPNPFUJE", name = "j", descriptor = "I")
    public int maxSceneTileZ;

    @OriginalMember(owner = "OPNPFUJE", name = "g", descriptor = "I")
    public int minSceneTileX;

    @OriginalMember(owner = "OPNPFUJE", name = "i", descriptor = "I")
    public int minSceneTileZ;

    @OriginalMember(owner = "OPNPFUJE", name = "c", descriptor = "I")
    public int x;

    @OriginalMember(owner = "OPNPFUJE", name = "b", descriptor = "I")
    public int y;

    @OriginalMember(owner = "OPNPFUJE", name = "f", descriptor = "I")
    public int yaw;

    @OriginalMember(owner = "OPNPFUJE", name = "d", descriptor = "I")
    public int z;

    @OriginalMember(owner = "OPNPFUJE", name = "e", descriptor = "LXHHRODPC;")
    public Entity model;
}
