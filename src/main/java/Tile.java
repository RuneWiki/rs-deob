import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Z")
    private boolean field368 = true;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Z")
    private boolean field369 = true;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    private int field370 = 763;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "[Lp;")
    public Loc[] field382 = new Loc[5];

    @OriginalMember(owner = "client!v", name = "u", descriptor = "[I")
    public int[] field383 = new int[5];

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Lj;")
    public GroundDecoration field379;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "Lk;")
    public ObjStack field380;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "Lv;")
    public Tile field393;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Li;")
    public TileOverlay field376;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lo;")
    public TileUnderlay field375;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lq;")
    public Wall field377;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lh;")
    public WallDecoration field378;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "Z")
    public boolean field386;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "Z")
    public boolean field387;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "Z")
    public boolean field388;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field374 = this.field371 = arg0;
        this.field372 = arg1;
        this.field373 = arg2;
    }
}
