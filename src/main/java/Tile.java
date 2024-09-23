import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("v")
public class Tile extends Linkable {

    @OriginalMember(owner = "v", name = "f", descriptor = "Z")
    private boolean field369 = false;

    @OriginalMember(owner = "v", name = "g", descriptor = "Z")
    private boolean field370 = true;

    @OriginalMember(owner = "v", name = "s", descriptor = "[Lp;")
    public Location[] field382 = new Location[5];

    @OriginalMember(owner = "v", name = "t", descriptor = "[I")
    public int[] field383 = new int[5];

    @OriginalMember(owner = "v", name = "h", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "v", name = "k", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "v", name = "i", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "v", name = "j", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "v", name = "r", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "v", name = "u", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "v", name = "v", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "v", name = "z", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "v", name = "A", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "v", name = "B", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "v", name = "C", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "v", name = "o", descriptor = "Lh;")
    public Decor field378;

    @OriginalMember(owner = "v", name = "p", descriptor = "Lj;")
    public GroundDecor field379;

    @OriginalMember(owner = "v", name = "q", descriptor = "Lk;")
    public GroundObject field380;

    @OriginalMember(owner = "v", name = "D", descriptor = "Lv;")
    public Tile field393;

    @OriginalMember(owner = "v", name = "m", descriptor = "Li;")
    public TileOverlay field376;

    @OriginalMember(owner = "v", name = "l", descriptor = "Lo;")
    public TileUnderlay field375;

    @OriginalMember(owner = "v", name = "n", descriptor = "Lq;")
    public Wall field377;

    @OriginalMember(owner = "v", name = "w", descriptor = "Z")
    public boolean field386;

    @OriginalMember(owner = "v", name = "x", descriptor = "Z")
    public boolean field387;

    @OriginalMember(owner = "v", name = "y", descriptor = "Z")
    public boolean field388;

    @OriginalMember(owner = "v", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field374 = this.field371 = arg0;
        this.field372 = arg1;
        this.field373 = arg2;
    }
}
