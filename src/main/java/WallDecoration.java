import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OFQAEXFV")
public class WallDecoration {

    @OriginalMember(owner = "client!OFQAEXFV", name = "h", descriptor = "B")
    public byte info;

    @OriginalMember(owner = "client!OFQAEXFV", name = "e", descriptor = "I")
    public int angle;

    @OriginalMember(owner = "client!OFQAEXFV", name = "g", descriptor = "I")
    public int bitset;

    @OriginalMember(owner = "client!OFQAEXFV", name = "d", descriptor = "I")
    public int type;

    @OriginalMember(owner = "client!OFQAEXFV", name = "b", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!OFQAEXFV", name = "a", descriptor = "I")
    public int y;

    @OriginalMember(owner = "client!OFQAEXFV", name = "c", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!OFQAEXFV", name = "f", descriptor = "LXHHRODPC;")
    public Entity model;
}
