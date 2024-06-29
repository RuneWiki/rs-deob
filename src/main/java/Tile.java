import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "[Lp;")
    public Loc[] field437 = new Loc[5];

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "[I")
    public int[] field438 = new int[5];

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lj;")
    public GroundDecoration field434;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lk;")
    public ObjStack field435;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "Lcb;")
    public Tile field448;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Li;")
    public TileOverlay field431;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lo;")
    public TileUnderlay field430;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lq;")
    public Wall field432;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lh;")
    public WallDecoration field433;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Z")
    public boolean field441;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Z")
    public boolean field442;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Z")
    public boolean field443;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field429 = this.field426 = arg0;
        this.field427 = arg1;
        this.field428 = arg2;
    }
}
