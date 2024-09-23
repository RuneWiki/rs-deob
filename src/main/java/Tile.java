import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class Tile extends Linkable {

    @OriginalMember(owner = "cb", name = "q", descriptor = "[Lp;")
    public Location[] field433 = new Location[5];

    @OriginalMember(owner = "cb", name = "r", descriptor = "[I")
    public int[] field434 = new int[5];

    @OriginalMember(owner = "cb", name = "f", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "cb", name = "i", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "cb", name = "g", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "cb", name = "h", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "cb", name = "p", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "cb", name = "s", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "cb", name = "t", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "cb", name = "x", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "cb", name = "y", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "cb", name = "z", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "cb", name = "A", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "cb", name = "m", descriptor = "Lh;")
    public Decor field429;

    @OriginalMember(owner = "cb", name = "n", descriptor = "Lj;")
    public GroundDecor field430;

    @OriginalMember(owner = "cb", name = "o", descriptor = "Lk;")
    public GroundObject field431;

    @OriginalMember(owner = "cb", name = "B", descriptor = "Lcb;")
    public Tile field444;

    @OriginalMember(owner = "cb", name = "k", descriptor = "Li;")
    public TileOverlay field427;

    @OriginalMember(owner = "cb", name = "j", descriptor = "Lo;")
    public TileUnderlay field426;

    @OriginalMember(owner = "cb", name = "l", descriptor = "Lq;")
    public Wall field428;

    @OriginalMember(owner = "cb", name = "u", descriptor = "Z")
    public boolean field437;

    @OriginalMember(owner = "cb", name = "v", descriptor = "Z")
    public boolean field438;

    @OriginalMember(owner = "cb", name = "w", descriptor = "Z")
    public boolean field439;

    @OriginalMember(owner = "cb", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field425 = this.field422 = arg0;
        this.field423 = arg1;
        this.field424 = arg2;
    }
}
