import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class Tile extends Linkable {

    @OriginalMember(owner = "w", name = "p", descriptor = "[Lq;")
    public Location[] field377 = new Location[5];

    @OriginalMember(owner = "w", name = "q", descriptor = "[I")
    public int[] field378 = new int[5];

    @OriginalMember(owner = "w", name = "e", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "w", name = "h", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "w", name = "f", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "w", name = "g", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "w", name = "o", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "w", name = "r", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "w", name = "s", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "w", name = "w", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "w", name = "x", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "w", name = "y", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "w", name = "z", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "w", name = "l", descriptor = "Li;")
    public Decor field373;

    @OriginalMember(owner = "w", name = "m", descriptor = "Lk;")
    public GroundDecor field374;

    @OriginalMember(owner = "w", name = "n", descriptor = "Ll;")
    public GroundObject field375;

    @OriginalMember(owner = "w", name = "A", descriptor = "Lw;")
    public Tile field388;

    @OriginalMember(owner = "w", name = "j", descriptor = "Lj;")
    public TileOverlay field371;

    @OriginalMember(owner = "w", name = "i", descriptor = "Lp;")
    public TileUnderlay field370;

    @OriginalMember(owner = "w", name = "k", descriptor = "Lr;")
    public Wall field372;

    @OriginalMember(owner = "w", name = "t", descriptor = "Z")
    public boolean field381;

    @OriginalMember(owner = "w", name = "u", descriptor = "Z")
    public boolean field382;

    @OriginalMember(owner = "w", name = "v", descriptor = "Z")
    public boolean field383;

    @OriginalMember(owner = "w", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field369 = this.field366 = arg0;
        this.field367 = arg1;
        this.field368 = arg2;
    }
}
