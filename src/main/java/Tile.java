import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class Tile extends Linkable {

    @OriginalMember(owner = "w", name = "p", descriptor = "[Lq;")
    public Location[] field393 = new Location[5];

    @OriginalMember(owner = "w", name = "q", descriptor = "[I")
    public int[] field394 = new int[5];

    @OriginalMember(owner = "w", name = "e", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "w", name = "h", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "w", name = "f", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "w", name = "g", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "w", name = "o", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "w", name = "r", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "w", name = "s", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "w", name = "w", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "w", name = "x", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "w", name = "y", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "w", name = "z", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "w", name = "l", descriptor = "Li;")
    public Decor field389;

    @OriginalMember(owner = "w", name = "m", descriptor = "Lk;")
    public GroundDecor field390;

    @OriginalMember(owner = "w", name = "n", descriptor = "Ll;")
    public GroundObject field391;

    @OriginalMember(owner = "w", name = "A", descriptor = "Lw;")
    public Tile field404;

    @OriginalMember(owner = "w", name = "j", descriptor = "Lj;")
    public TileOverlay field387;

    @OriginalMember(owner = "w", name = "i", descriptor = "Lp;")
    public TileUnderlay field386;

    @OriginalMember(owner = "w", name = "k", descriptor = "Lr;")
    public Wall field388;

    @OriginalMember(owner = "w", name = "t", descriptor = "Z")
    public boolean field397;

    @OriginalMember(owner = "w", name = "u", descriptor = "Z")
    public boolean field398;

    @OriginalMember(owner = "w", name = "v", descriptor = "Z")
    public boolean field399;

    @OriginalMember(owner = "w", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field385 = this.field382 = arg0;
        this.field383 = arg1;
        this.field384 = arg2;
    }
}
