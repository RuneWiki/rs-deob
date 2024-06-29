import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Z")
    private boolean field362 = false;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[Lp;")
    public Loc[] field374 = new Loc[5];

    @OriginalMember(owner = "client!v", name = "r", descriptor = "[I")
    public int[] field375 = new int[5];

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Lj;")
    public GroundDecoration field371;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lk;")
    public ObjStack field372;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "Lv;")
    public Tile field385;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Li;")
    public TileOverlay field368;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lo;")
    public TileUnderlay field367;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lq;")
    public Wall field369;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lh;")
    public WallDecoration field370;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "Z")
    public boolean field378;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "Z")
    public boolean field379;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Z")
    public boolean field380;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field366 = this.field363 = arg0;
        this.field364 = arg1;
        this.field365 = arg2;
    }
}
