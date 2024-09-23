import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class Tile extends Linkable {

    @OriginalMember(owner = "cb", name = "q", descriptor = "[Lp;")
    public Location[] field425 = new Location[5];

    @OriginalMember(owner = "cb", name = "r", descriptor = "[I")
    public int[] field426 = new int[5];

    @OriginalMember(owner = "cb", name = "f", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "cb", name = "i", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "cb", name = "g", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "cb", name = "h", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "cb", name = "p", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "cb", name = "s", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "cb", name = "t", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "cb", name = "x", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "cb", name = "y", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "cb", name = "z", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "cb", name = "A", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "cb", name = "m", descriptor = "Lh;")
    public Decor field421;

    @OriginalMember(owner = "cb", name = "n", descriptor = "Lj;")
    public GroundDecor field422;

    @OriginalMember(owner = "cb", name = "o", descriptor = "Lk;")
    public GroundObject field423;

    @OriginalMember(owner = "cb", name = "B", descriptor = "Lcb;")
    public Tile field436;

    @OriginalMember(owner = "cb", name = "k", descriptor = "Li;")
    public TileOverlay field419;

    @OriginalMember(owner = "cb", name = "j", descriptor = "Lo;")
    public TileUnderlay field418;

    @OriginalMember(owner = "cb", name = "l", descriptor = "Lq;")
    public Wall field420;

    @OriginalMember(owner = "cb", name = "u", descriptor = "Z")
    public boolean field429;

    @OriginalMember(owner = "cb", name = "v", descriptor = "Z")
    public boolean field430;

    @OriginalMember(owner = "cb", name = "w", descriptor = "Z")
    public boolean field431;

    @OriginalMember(owner = "cb", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field417 = this.field414 = arg0;
        this.field415 = arg1;
        this.field416 = arg2;
    }
}
