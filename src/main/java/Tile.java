import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[Lq;")
    public Loc[] field387 = new Loc[5];

    @OriginalMember(owner = "client!w", name = "q", descriptor = "[I")
    public int[] field388 = new int[5];

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lk;")
    public GroundDecoration field384;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Ll;")
    public ObjStack field385;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Lw;")
    public Tile field398;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lj;")
    public TileOverlay field381;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lp;")
    public TileUnderlay field380;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lr;")
    public Wall field382;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Li;")
    public WallDecoration field383;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Z")
    public boolean field391;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Z")
    public boolean field392;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
    public boolean field393;

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field379 = this.field376 = arg0;
        this.field377 = arg1;
        this.field378 = arg2;
    }
}
