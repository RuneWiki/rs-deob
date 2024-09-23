import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class Tile extends Linkable {

    @OriginalMember(owner = "w", name = "q", descriptor = "[Lq;")
    public Location[] field384 = new Location[5];

    @OriginalMember(owner = "w", name = "r", descriptor = "[I")
    public int[] field385 = new int[5];

    @OriginalMember(owner = "w", name = "f", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "w", name = "i", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "w", name = "g", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "w", name = "h", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "w", name = "p", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "w", name = "s", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "w", name = "t", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "w", name = "x", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "w", name = "y", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "w", name = "z", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "w", name = "A", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "w", name = "m", descriptor = "Li;")
    public Decor field380;

    @OriginalMember(owner = "w", name = "n", descriptor = "Lk;")
    public GroundDecor field381;

    @OriginalMember(owner = "w", name = "o", descriptor = "Ll;")
    public GroundObject field382;

    @OriginalMember(owner = "w", name = "B", descriptor = "Lw;")
    public Tile field395;

    @OriginalMember(owner = "w", name = "k", descriptor = "Lj;")
    public TileOverlay field378;

    @OriginalMember(owner = "w", name = "j", descriptor = "Lp;")
    public TileUnderlay field377;

    @OriginalMember(owner = "w", name = "l", descriptor = "Lr;")
    public Wall field379;

    @OriginalMember(owner = "w", name = "u", descriptor = "Z")
    public boolean field388;

    @OriginalMember(owner = "w", name = "v", descriptor = "Z")
    public boolean field389;

    @OriginalMember(owner = "w", name = "w", descriptor = "Z")
    public boolean field390;

    @OriginalMember(owner = "w", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field376 = this.field373 = arg0;
        this.field374 = arg1;
        this.field375 = arg2;
    }
}
