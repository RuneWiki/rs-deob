import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("v")
public class Tile extends Linkable {

    @OriginalMember(owner = "v", name = "e", descriptor = "Z")
    private boolean field362 = false;

    @OriginalMember(owner = "v", name = "q", descriptor = "[Lp;")
    public Location[] field374 = new Location[5];

    @OriginalMember(owner = "v", name = "r", descriptor = "[I")
    public int[] field375 = new int[5];

    @OriginalMember(owner = "v", name = "f", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "v", name = "i", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "v", name = "g", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "v", name = "h", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "v", name = "p", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "v", name = "s", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "v", name = "t", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "v", name = "x", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "v", name = "y", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "v", name = "z", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "v", name = "A", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "v", name = "m", descriptor = "Lh;")
    public Decor field370;

    @OriginalMember(owner = "v", name = "n", descriptor = "Lj;")
    public GroundDecor field371;

    @OriginalMember(owner = "v", name = "o", descriptor = "Lk;")
    public GroundObject field372;

    @OriginalMember(owner = "v", name = "B", descriptor = "Lv;")
    public Tile field385;

    @OriginalMember(owner = "v", name = "k", descriptor = "Li;")
    public TileOverlay field368;

    @OriginalMember(owner = "v", name = "j", descriptor = "Lo;")
    public TileUnderlay field367;

    @OriginalMember(owner = "v", name = "l", descriptor = "Lq;")
    public Wall field369;

    @OriginalMember(owner = "v", name = "u", descriptor = "Z")
    public boolean field378;

    @OriginalMember(owner = "v", name = "v", descriptor = "Z")
    public boolean field379;

    @OriginalMember(owner = "v", name = "w", descriptor = "Z")
    public boolean field380;

    @OriginalMember(owner = "v", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field366 = this.field363 = arg0;
        this.field364 = arg1;
        this.field365 = arg2;
    }
}
