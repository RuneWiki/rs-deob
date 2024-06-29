import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FEHPTPDG")
public class Wall {

    @OriginalMember(owner = "client!FEHPTPDG", name = "i", descriptor = "B")
    public byte info;

    @OriginalMember(owner = "client!FEHPTPDG", name = "h", descriptor = "I")
    public int bitset;

    @OriginalMember(owner = "client!FEHPTPDG", name = "a", descriptor = "I")
    public int level;

    @OriginalMember(owner = "client!FEHPTPDG", name = "d", descriptor = "I")
    public int typeA;

    @OriginalMember(owner = "client!FEHPTPDG", name = "e", descriptor = "I")
    public int typeB;

    @OriginalMember(owner = "client!FEHPTPDG", name = "b", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!FEHPTPDG", name = "c", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!FEHPTPDG", name = "f", descriptor = "LXHHRODPC;")
    public Entity modelA;

    @OriginalMember(owner = "client!FEHPTPDG", name = "g", descriptor = "LXHHRODPC;")
    public Entity modelB;
}
