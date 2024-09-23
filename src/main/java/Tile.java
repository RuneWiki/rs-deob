import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class Tile extends Linkable {

    @OriginalMember(owner = "cb", name = "p", descriptor = "[Lp;")
    public Location[] field437 = new Location[5];

    @OriginalMember(owner = "cb", name = "q", descriptor = "[I")
    public int[] field438 = new int[5];

    @OriginalMember(owner = "cb", name = "e", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "cb", name = "h", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "cb", name = "f", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "cb", name = "g", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "cb", name = "o", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "cb", name = "r", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "cb", name = "s", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "cb", name = "w", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "cb", name = "x", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "cb", name = "y", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "cb", name = "z", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "cb", name = "l", descriptor = "Lh;")
    public Decor field433;

    @OriginalMember(owner = "cb", name = "m", descriptor = "Lj;")
    public GroundDecor field434;

    @OriginalMember(owner = "cb", name = "n", descriptor = "Lk;")
    public GroundObject field435;

    @OriginalMember(owner = "cb", name = "A", descriptor = "Lcb;")
    public Tile field448;

    @OriginalMember(owner = "cb", name = "j", descriptor = "Li;")
    public TileOverlay field431;

    @OriginalMember(owner = "cb", name = "i", descriptor = "Lo;")
    public TileUnderlay field430;

    @OriginalMember(owner = "cb", name = "k", descriptor = "Lq;")
    public Wall field432;

    @OriginalMember(owner = "cb", name = "t", descriptor = "Z")
    public boolean field441;

    @OriginalMember(owner = "cb", name = "u", descriptor = "Z")
    public boolean field442;

    @OriginalMember(owner = "cb", name = "v", descriptor = "Z")
    public boolean field443;

    @OriginalMember(owner = "cb", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field429 = this.field426 = arg0;
        this.field427 = arg1;
        this.field428 = arg2;
    }
}
