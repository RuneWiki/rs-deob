import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[Lp;")
    public Loc[] field377 = new Loc[5];

    @OriginalMember(owner = "client!v", name = "r", descriptor = "[I")
    public int[] field378 = new int[5];

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Lj;")
    public GroundDecoration field374;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lk;")
    public ObjStack field375;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "Lv;")
    public Tile field388;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Li;")
    public TileOverlay field371;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lo;")
    public TileUnderlay field370;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lq;")
    public Wall field372;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lh;")
    public WallDecoration field373;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "Z")
    public boolean field381;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "Z")
    public boolean field382;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Z")
    public boolean field383;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field369 = this.field366 = arg0;
        this.field367 = arg1;
        this.field368 = arg2;
    }
}
