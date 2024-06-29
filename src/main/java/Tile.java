import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "[Lp;")
    public Loc[] field433 = new Loc[5];

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "[I")
    public int[] field434 = new int[5];

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lj;")
    public GroundDecoration field430;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Lk;")
    public ObjStack field431;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "Lcb;")
    public Tile field444;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Li;")
    public TileOverlay field427;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lo;")
    public TileUnderlay field426;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lq;")
    public Wall field428;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lh;")
    public WallDecoration field429;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Z")
    public boolean field437;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Z")
    public boolean field438;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "Z")
    public boolean field439;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field425 = this.field422 = arg0;
        this.field423 = arg1;
        this.field424 = arg2;
    }
}
