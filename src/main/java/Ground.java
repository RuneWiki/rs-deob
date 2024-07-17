import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QTKGMFHL")
public class Ground extends Linkable {

    @OriginalMember(owner = "QTKGMFHL", name = "f", descriptor = "I")
    private int _flowObfuscator3 = -589;

    @OriginalMember(owner = "QTKGMFHL", name = "r", descriptor = "[LOPNPFUJE;")
    public Location[] locs = new Location[5];

    @OriginalMember(owner = "QTKGMFHL", name = "s", descriptor = "[I")
    public int[] locSpan = new int[5];

    @OriginalMember(owner = "QTKGMFHL", name = "g", descriptor = "I")
    public int level;

    @OriginalMember(owner = "QTKGMFHL", name = "j", descriptor = "I")
    public int occludeLevel;

    @OriginalMember(owner = "QTKGMFHL", name = "h", descriptor = "I")
    public int x;

    @OriginalMember(owner = "QTKGMFHL", name = "i", descriptor = "I")
    public int z;

    @OriginalMember(owner = "QTKGMFHL", name = "B", descriptor = "I")
    public int backWallTypes;

    @OriginalMember(owner = "QTKGMFHL", name = "z", descriptor = "I")
    public int blockLocSpans;

    @OriginalMember(owner = "QTKGMFHL", name = "y", descriptor = "I")
    public int checkLocSpans;

    @OriginalMember(owner = "QTKGMFHL", name = "u", descriptor = "I")
    public int drawLevel;

    @OriginalMember(owner = "QTKGMFHL", name = "A", descriptor = "I")
    public int inverseBlockLocSpans;

    @OriginalMember(owner = "QTKGMFHL", name = "q", descriptor = "I")
    public int locCount;

    @OriginalMember(owner = "QTKGMFHL", name = "t", descriptor = "I")
    public int locSpans;

    @OriginalMember(owner = "QTKGMFHL", name = "n", descriptor = "LOFQAEXFV;")
    public Decor decor;

    @OriginalMember(owner = "QTKGMFHL", name = "C", descriptor = "LQTKGMFHL;")
    public Ground bridge;

    @OriginalMember(owner = "QTKGMFHL", name = "o", descriptor = "LZIKPHIFI;")
    public GroundDecor groundDecor;

    @OriginalMember(owner = "QTKGMFHL", name = "p", descriptor = "LBMEXSMOV;")
    public GroundObject groundObj;

    @OriginalMember(owner = "QTKGMFHL", name = "l", descriptor = "LVBAXKVMG;")
    public TileOverlay overlay;

    @OriginalMember(owner = "QTKGMFHL", name = "k", descriptor = "LXPBACSMK;")
    public TileUnderlay underlay;

    @OriginalMember(owner = "QTKGMFHL", name = "m", descriptor = "LFEHPTPDG;")
    public Wall wall;

    @OriginalMember(owner = "QTKGMFHL", name = "x", descriptor = "Z")
    public boolean containsLocs;

    @OriginalMember(owner = "QTKGMFHL", name = "w", descriptor = "Z")
    public boolean update;

    @OriginalMember(owner = "QTKGMFHL", name = "v", descriptor = "Z")
    public boolean visible;

    @OriginalMember(owner = "QTKGMFHL", name = "<init>", descriptor = "(III)V")
    public Ground(int arg0, int arg1, int arg2) {
        this.occludeLevel = this.level = arg0;
        this.x = arg1;
        this.z = arg2;
    }
}
