import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZIKPHIFI")
public class GroundDecor {

    @OriginalMember(owner = "ZIKPHIFI", name = "f", descriptor = "B")
    public byte info;

    @OriginalMember(owner = "ZIKPHIFI", name = "e", descriptor = "I")
    public int bitset;

    @OriginalMember(owner = "ZIKPHIFI", name = "a", descriptor = "I")
    public int level;

    @OriginalMember(owner = "ZIKPHIFI", name = "b", descriptor = "I")
    public int x;

    @OriginalMember(owner = "ZIKPHIFI", name = "c", descriptor = "I")
    public int z;

    @OriginalMember(owner = "ZIKPHIFI", name = "d", descriptor = "LXHHRODPC;")
    public Entity model;
}
