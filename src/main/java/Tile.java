import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Z")
    private boolean field363 = true;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[Lp;")
    public Loc[] field375 = new Loc[5];

    @OriginalMember(owner = "client!v", name = "t", descriptor = "[I")
    public int[] field376 = new int[5];

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lj;")
    public GroundDecoration field372;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Lk;")
    public ObjStack field373;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "Lv;")
    public Tile field386;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Li;")
    public TileOverlay field369;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lo;")
    public TileUnderlay field368;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Lq;")
    public Wall field370;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lh;")
    public WallDecoration field371;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Z")
    public boolean field379;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "Z")
    public boolean field380;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "Z")
    public boolean field381;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field367 = this.field364 = arg0;
        this.field365 = arg1;
        this.field366 = arg2;
    }
}
