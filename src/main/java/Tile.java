import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("v")
public class Tile extends Linkable {

    @OriginalMember(owner = "v", name = "f", descriptor = "B")
    private byte field365 = 4;

    @OriginalMember(owner = "v", name = "r", descriptor = "[Lp;")
    public Location[] field377 = new Location[5];

    @OriginalMember(owner = "v", name = "s", descriptor = "[I")
    public int[] field378 = new int[5];

    @OriginalMember(owner = "v", name = "g", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "v", name = "j", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "v", name = "h", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "v", name = "i", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "v", name = "q", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "v", name = "t", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "v", name = "u", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "v", name = "y", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "v", name = "z", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "v", name = "A", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "v", name = "B", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "v", name = "n", descriptor = "Lh;")
    public Decor field373;

    @OriginalMember(owner = "v", name = "o", descriptor = "Lj;")
    public GroundDecor field374;

    @OriginalMember(owner = "v", name = "p", descriptor = "Lk;")
    public GroundObject field375;

    @OriginalMember(owner = "v", name = "C", descriptor = "Lv;")
    public Tile field388;

    @OriginalMember(owner = "v", name = "l", descriptor = "Li;")
    public TileOverlay field371;

    @OriginalMember(owner = "v", name = "k", descriptor = "Lo;")
    public TileUnderlay field370;

    @OriginalMember(owner = "v", name = "m", descriptor = "Lq;")
    public Wall field372;

    @OriginalMember(owner = "v", name = "v", descriptor = "Z")
    public boolean field381;

    @OriginalMember(owner = "v", name = "w", descriptor = "Z")
    public boolean field382;

    @OriginalMember(owner = "v", name = "x", descriptor = "Z")
    public boolean field383;

    @OriginalMember(owner = "v", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field369 = this.field366 = arg0;
        this.field367 = arg1;
        this.field368 = arg2;
    }
}
