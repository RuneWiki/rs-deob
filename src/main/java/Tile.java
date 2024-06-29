import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "[Lp;")
    public Loc[] field428 = new Loc[5];

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "[I")
    public int[] field429 = new int[5];

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lj;")
    public GroundDecoration field425;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lk;")
    public ObjStack field426;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "Lcb;")
    public Tile field439;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Li;")
    public TileOverlay field422;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lo;")
    public TileUnderlay field421;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lq;")
    public Wall field423;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lh;")
    public WallDecoration field424;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Z")
    public boolean field432;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Z")
    public boolean field433;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Z")
    public boolean field434;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field420 = this.field417 = arg0;
        this.field418 = arg1;
        this.field419 = arg2;
    }
}
