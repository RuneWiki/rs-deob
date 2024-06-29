import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!w", name = "q", descriptor = "[Lq;")
    public Loc[] field389 = new Loc[5];

    @OriginalMember(owner = "client!w", name = "r", descriptor = "[I")
    public int[] field390 = new int[5];

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lk;")
    public GroundDecoration field386;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Ll;")
    public ObjStack field387;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Lw;")
    public Tile field400;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lj;")
    public TileOverlay field383;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lp;")
    public TileUnderlay field382;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lr;")
    public Wall field384;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Li;")
    public WallDecoration field385;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Z")
    public boolean field393;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
    public boolean field394;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Z")
    public boolean field395;

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field381 = this.field378 = arg0;
        this.field379 = arg1;
        this.field380 = arg2;
    }
}
