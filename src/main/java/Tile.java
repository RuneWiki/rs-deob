import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "[Lp;")
    public Loc[] field418 = new Loc[5];

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "[I")
    public int[] field419 = new int[5];

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lj;")
    public GroundDecoration field415;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lk;")
    public ObjStack field416;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "Lcb;")
    public Tile field429;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Li;")
    public TileOverlay field412;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lo;")
    public TileUnderlay field411;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lq;")
    public Wall field413;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lh;")
    public WallDecoration field414;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Z")
    public boolean field422;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Z")
    public boolean field423;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Z")
    public boolean field424;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field410 = this.field407 = arg0;
        this.field408 = arg1;
        this.field409 = arg2;
    }
}
