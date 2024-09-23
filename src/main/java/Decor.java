import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OFQAEXFV")
public class Decor {

    @OriginalMember(owner = "OFQAEXFV", name = "h", descriptor = "B")
    public byte info;

    @OriginalMember(owner = "OFQAEXFV", name = "e", descriptor = "I")
    public int angle;

    @OriginalMember(owner = "OFQAEXFV", name = "g", descriptor = "I")
    public int bitset;

    @OriginalMember(owner = "OFQAEXFV", name = "d", descriptor = "I")
    public int type;

    @OriginalMember(owner = "OFQAEXFV", name = "b", descriptor = "I")
    public int x;

    @OriginalMember(owner = "OFQAEXFV", name = "a", descriptor = "I")
    public int y;

    @OriginalMember(owner = "OFQAEXFV", name = "c", descriptor = "I")
    public int z;

    @OriginalMember(owner = "OFQAEXFV", name = "f", descriptor = "LXHHRODPC;")
    public Entity model;
}
