import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("v")
public class Tile extends Linkable {

    @OriginalMember(owner = "v", name = "p", descriptor = "[Lp;")
    public Location[] field372 = new Location[5];

    @OriginalMember(owner = "v", name = "q", descriptor = "[I")
    public int[] field373 = new int[5];

    @OriginalMember(owner = "v", name = "e", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "v", name = "h", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "v", name = "f", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "v", name = "g", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "v", name = "o", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "v", name = "r", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "v", name = "s", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "v", name = "w", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "v", name = "x", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "v", name = "y", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "v", name = "z", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "v", name = "l", descriptor = "Lh;")
    public Decor field368;

    @OriginalMember(owner = "v", name = "m", descriptor = "Lj;")
    public GroundDecor field369;

    @OriginalMember(owner = "v", name = "n", descriptor = "Lk;")
    public GroundObject field370;

    @OriginalMember(owner = "v", name = "A", descriptor = "Lv;")
    public Tile field383;

    @OriginalMember(owner = "v", name = "j", descriptor = "Li;")
    public TileOverlay field366;

    @OriginalMember(owner = "v", name = "i", descriptor = "Lo;")
    public TileUnderlay field365;

    @OriginalMember(owner = "v", name = "k", descriptor = "Lq;")
    public Wall field367;

    @OriginalMember(owner = "v", name = "t", descriptor = "Z")
    public boolean field376;

    @OriginalMember(owner = "v", name = "u", descriptor = "Z")
    public boolean field377;

    @OriginalMember(owner = "v", name = "v", descriptor = "Z")
    public boolean field378;

    @OriginalMember(owner = "v", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field364 = this.field361 = arg0;
        this.field362 = arg1;
        this.field363 = arg2;
    }
}
