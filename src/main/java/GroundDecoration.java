import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZIKPHIFI")
public class GroundDecoration {

    @OriginalMember(owner = "client!ZIKPHIFI", name = "f", descriptor = "B")
    public byte info;

    @OriginalMember(owner = "client!ZIKPHIFI", name = "e", descriptor = "I")
    public int bitset;

    @OriginalMember(owner = "client!ZIKPHIFI", name = "a", descriptor = "I")
    public int level;

    @OriginalMember(owner = "client!ZIKPHIFI", name = "b", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!ZIKPHIFI", name = "c", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!ZIKPHIFI", name = "d", descriptor = "LXHHRODPC;")
    public Entity model;
}
