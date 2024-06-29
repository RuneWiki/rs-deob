import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QTKGMFHL")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!QTKGMFHL", name = "f", descriptor = "I")
    private int _flowObfuscator3 = -589;

    @OriginalMember(owner = "client!QTKGMFHL", name = "r", descriptor = "[LOPNPFUJE;")
    public Loc[] locs = new Loc[5];

    @OriginalMember(owner = "client!QTKGMFHL", name = "s", descriptor = "[I")
    public int[] locSpan = new int[5];

    @OriginalMember(owner = "client!QTKGMFHL", name = "g", descriptor = "I")
    public int level;

    @OriginalMember(owner = "client!QTKGMFHL", name = "j", descriptor = "I")
    public int occludeLevel;

    @OriginalMember(owner = "client!QTKGMFHL", name = "h", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!QTKGMFHL", name = "i", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!QTKGMFHL", name = "B", descriptor = "I")
    public int backWallTypes;

    @OriginalMember(owner = "client!QTKGMFHL", name = "z", descriptor = "I")
    public int blockLocSpans;

    @OriginalMember(owner = "client!QTKGMFHL", name = "y", descriptor = "I")
    public int checkLocSpans;

    @OriginalMember(owner = "client!QTKGMFHL", name = "u", descriptor = "I")
    public int drawLevel;

    @OriginalMember(owner = "client!QTKGMFHL", name = "A", descriptor = "I")
    public int inverseBlockLocSpans;

    @OriginalMember(owner = "client!QTKGMFHL", name = "q", descriptor = "I")
    public int locCount;

    @OriginalMember(owner = "client!QTKGMFHL", name = "t", descriptor = "I")
    public int locSpans;

    @OriginalMember(owner = "client!QTKGMFHL", name = "o", descriptor = "LZIKPHIFI;")
    public GroundDecoration groundDecoration;

    @OriginalMember(owner = "client!QTKGMFHL", name = "p", descriptor = "LBMEXSMOV;")
    public ObjStack objStack;

    @OriginalMember(owner = "client!QTKGMFHL", name = "C", descriptor = "LQTKGMFHL;")
    public Tile bridge;

    @OriginalMember(owner = "client!QTKGMFHL", name = "l", descriptor = "LVBAXKVMG;")
    public TileOverlay overlay;

    @OriginalMember(owner = "client!QTKGMFHL", name = "k", descriptor = "LXPBACSMK;")
    public TileUnderlay underlay;

    @OriginalMember(owner = "client!QTKGMFHL", name = "m", descriptor = "LFEHPTPDG;")
    public Wall wall;

    @OriginalMember(owner = "client!QTKGMFHL", name = "n", descriptor = "LOFQAEXFV;")
    public WallDecoration wallDecoration;

    @OriginalMember(owner = "client!QTKGMFHL", name = "x", descriptor = "Z")
    public boolean containsLocs;

    @OriginalMember(owner = "client!QTKGMFHL", name = "w", descriptor = "Z")
    public boolean update;

    @OriginalMember(owner = "client!QTKGMFHL", name = "v", descriptor = "Z")
    public boolean visible;

    @OriginalMember(owner = "client!QTKGMFHL", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.occludeLevel = this.level = arg0;
        this.x = arg1;
        this.z = arg2;
    }
}
