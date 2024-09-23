import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FEHPTPDG")
public class Wall {

    @OriginalMember(owner = "FEHPTPDG", name = "i", descriptor = "B")
    public byte info;

    @OriginalMember(owner = "FEHPTPDG", name = "h", descriptor = "I")
    public int bitset;

    @OriginalMember(owner = "FEHPTPDG", name = "a", descriptor = "I")
    public int level;

    @OriginalMember(owner = "FEHPTPDG", name = "d", descriptor = "I")
    public int typeA;

    @OriginalMember(owner = "FEHPTPDG", name = "e", descriptor = "I")
    public int typeB;

    @OriginalMember(owner = "FEHPTPDG", name = "b", descriptor = "I")
    public int x;

    @OriginalMember(owner = "FEHPTPDG", name = "c", descriptor = "I")
    public int z;

    @OriginalMember(owner = "FEHPTPDG", name = "f", descriptor = "LXHHRODPC;")
    public Entity modelA;

    @OriginalMember(owner = "FEHPTPDG", name = "g", descriptor = "LXHHRODPC;")
    public Entity modelB;
}
