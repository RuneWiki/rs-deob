import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class Tile extends Linkable {

    @OriginalMember(owner = "w", name = "p", descriptor = "[Lq;")
    public Location[] field405 = new Location[5];

    @OriginalMember(owner = "w", name = "q", descriptor = "[I")
    public int[] field406 = new int[5];

    @OriginalMember(owner = "w", name = "e", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "w", name = "h", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "w", name = "f", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "w", name = "g", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "w", name = "o", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "w", name = "r", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "w", name = "s", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "w", name = "w", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "w", name = "x", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "w", name = "y", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "w", name = "z", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "w", name = "l", descriptor = "Li;")
    public Decor field401;

    @OriginalMember(owner = "w", name = "m", descriptor = "Lk;")
    public GroundDecor field402;

    @OriginalMember(owner = "w", name = "n", descriptor = "Ll;")
    public GroundObject field403;

    @OriginalMember(owner = "w", name = "A", descriptor = "Lw;")
    public Tile field416;

    @OriginalMember(owner = "w", name = "j", descriptor = "Lj;")
    public TileOverlay field399;

    @OriginalMember(owner = "w", name = "i", descriptor = "Lp;")
    public TileUnderlay field398;

    @OriginalMember(owner = "w", name = "k", descriptor = "Lr;")
    public Wall field400;

    @OriginalMember(owner = "w", name = "t", descriptor = "Z")
    public boolean field409;

    @OriginalMember(owner = "w", name = "u", descriptor = "Z")
    public boolean field410;

    @OriginalMember(owner = "w", name = "v", descriptor = "Z")
    public boolean field411;

    @OriginalMember(owner = "w", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field397 = this.field394 = arg0;
        this.field395 = arg1;
        this.field396 = arg2;
    }
}
