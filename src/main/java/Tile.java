import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "[Lo;")
    public Loc[] field403 = new Loc[5];

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "[I")
    public int[] field404 = new int[5];

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Li;")
    public GroundDecoration field400;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Lj;")
    public ObjStack field401;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Lbb;")
    public Tile field414;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lh;")
    public TileOverlay field397;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Ln;")
    public TileUnderlay field396;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Lp;")
    public Wall field398;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lg;")
    public WallDecoration field399;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Z")
    public boolean field407;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Z")
    public boolean field408;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Z")
    public boolean field409;

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field395 = this.field392 = arg0;
        this.field393 = arg1;
        this.field394 = arg2;
    }
}
