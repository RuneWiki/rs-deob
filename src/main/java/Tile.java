import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class Tile extends Linkable {

    @OriginalMember(owner = "w", name = "q", descriptor = "[Lq;")
    public Location[] field389 = new Location[5];

    @OriginalMember(owner = "w", name = "r", descriptor = "[I")
    public int[] field390 = new int[5];

    @OriginalMember(owner = "w", name = "f", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "w", name = "i", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "w", name = "g", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "w", name = "h", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "w", name = "p", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "w", name = "s", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "w", name = "t", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "w", name = "x", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "w", name = "y", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "w", name = "z", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "w", name = "A", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "w", name = "m", descriptor = "Li;")
    public Decor field385;

    @OriginalMember(owner = "w", name = "n", descriptor = "Lk;")
    public GroundDecor field386;

    @OriginalMember(owner = "w", name = "o", descriptor = "Ll;")
    public GroundObject field387;

    @OriginalMember(owner = "w", name = "B", descriptor = "Lw;")
    public Tile field400;

    @OriginalMember(owner = "w", name = "k", descriptor = "Lj;")
    public TileOverlay field383;

    @OriginalMember(owner = "w", name = "j", descriptor = "Lp;")
    public TileUnderlay field382;

    @OriginalMember(owner = "w", name = "l", descriptor = "Lr;")
    public Wall field384;

    @OriginalMember(owner = "w", name = "u", descriptor = "Z")
    public boolean field393;

    @OriginalMember(owner = "w", name = "v", descriptor = "Z")
    public boolean field394;

    @OriginalMember(owner = "w", name = "w", descriptor = "Z")
    public boolean field395;

    @OriginalMember(owner = "w", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field381 = this.field378 = arg0;
        this.field379 = arg1;
        this.field380 = arg2;
    }
}
