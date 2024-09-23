import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class Tile extends Linkable {

    @OriginalMember(owner = "bb", name = "p", descriptor = "[Lo;")
    public Location[] field403 = new Location[5];

    @OriginalMember(owner = "bb", name = "q", descriptor = "[I")
    public int[] field404 = new int[5];

    @OriginalMember(owner = "bb", name = "e", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "bb", name = "h", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "bb", name = "f", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "bb", name = "g", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "bb", name = "o", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "bb", name = "r", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "bb", name = "s", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "bb", name = "w", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "bb", name = "x", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "bb", name = "y", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "bb", name = "z", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "bb", name = "l", descriptor = "Lg;")
    public Decor field399;

    @OriginalMember(owner = "bb", name = "m", descriptor = "Li;")
    public GroundDecor field400;

    @OriginalMember(owner = "bb", name = "n", descriptor = "Lj;")
    public GroundObject field401;

    @OriginalMember(owner = "bb", name = "A", descriptor = "Lbb;")
    public Tile field414;

    @OriginalMember(owner = "bb", name = "j", descriptor = "Lh;")
    public TileOverlay field397;

    @OriginalMember(owner = "bb", name = "i", descriptor = "Ln;")
    public TileUnderlay field396;

    @OriginalMember(owner = "bb", name = "k", descriptor = "Lp;")
    public Wall field398;

    @OriginalMember(owner = "bb", name = "t", descriptor = "Z")
    public boolean field407;

    @OriginalMember(owner = "bb", name = "u", descriptor = "Z")
    public boolean field408;

    @OriginalMember(owner = "bb", name = "v", descriptor = "Z")
    public boolean field409;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field395 = this.field392 = arg0;
        this.field393 = arg1;
        this.field394 = arg2;
    }
}
