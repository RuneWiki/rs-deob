import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[Lq;")
    public Loc[] field381 = new Loc[5];

    @OriginalMember(owner = "client!w", name = "q", descriptor = "[I")
    public int[] field382 = new int[5];

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lk;")
    public GroundDecoration field378;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Ll;")
    public ObjStack field379;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Lw;")
    public Tile field392;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lj;")
    public TileOverlay field375;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lp;")
    public TileUnderlay field374;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lr;")
    public Wall field376;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Li;")
    public WallDecoration field377;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Z")
    public boolean field385;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Z")
    public boolean field386;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
    public boolean field387;

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field373 = this.field370 = arg0;
        this.field371 = arg1;
        this.field372 = arg2;
    }
}
