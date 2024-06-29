import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[Lq;")
    public Loc[] field405 = new Loc[5];

    @OriginalMember(owner = "client!w", name = "q", descriptor = "[I")
    public int[] field406 = new int[5];

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lk;")
    public GroundDecoration field402;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Ll;")
    public ObjStack field403;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Lw;")
    public Tile field416;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lj;")
    public TileOverlay field399;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lp;")
    public TileUnderlay field398;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lr;")
    public Wall field400;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Li;")
    public WallDecoration field401;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Z")
    public boolean field409;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Z")
    public boolean field410;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
    public boolean field411;

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field397 = this.field394 = arg0;
        this.field395 = arg1;
        this.field396 = arg2;
    }
}
