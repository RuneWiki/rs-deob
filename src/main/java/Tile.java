import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RIEEXHOP")
public class Tile extends Linkable {

    @OriginalMember(owner = "client!RIEEXHOP", name = "e", descriptor = "Z")
    private boolean field1379 = false;

    @OriginalMember(owner = "client!RIEEXHOP", name = "q", descriptor = "[LBHOSVTIT;")
    public Loc[] field1391 = new Loc[5];

    @OriginalMember(owner = "client!RIEEXHOP", name = "r", descriptor = "[I")
    public int[] field1392 = new int[5];

    @OriginalMember(owner = "client!RIEEXHOP", name = "f", descriptor = "I")
    public int field1380;

    @OriginalMember(owner = "client!RIEEXHOP", name = "i", descriptor = "I")
    public int field1383;

    @OriginalMember(owner = "client!RIEEXHOP", name = "g", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!RIEEXHOP", name = "h", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!RIEEXHOP", name = "p", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!RIEEXHOP", name = "s", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!RIEEXHOP", name = "t", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!RIEEXHOP", name = "x", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!RIEEXHOP", name = "y", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!RIEEXHOP", name = "z", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!RIEEXHOP", name = "A", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!RIEEXHOP", name = "n", descriptor = "LMOLUZZPG;")
    public GroundDecoration field1388;

    @OriginalMember(owner = "client!RIEEXHOP", name = "o", descriptor = "LDVWJFUCK;")
    public ObjStack field1389;

    @OriginalMember(owner = "client!RIEEXHOP", name = "B", descriptor = "LRIEEXHOP;")
    public Tile field1402;

    @OriginalMember(owner = "client!RIEEXHOP", name = "k", descriptor = "LJQCVNYYR;")
    public TileOverlay field1385;

    @OriginalMember(owner = "client!RIEEXHOP", name = "j", descriptor = "LAYYYSATX;")
    public TileUnderlay field1384;

    @OriginalMember(owner = "client!RIEEXHOP", name = "l", descriptor = "LWQXKHZYN;")
    public Wall field1386;

    @OriginalMember(owner = "client!RIEEXHOP", name = "m", descriptor = "LSEMZHDXN;")
    public WallDecoration field1387;

    @OriginalMember(owner = "client!RIEEXHOP", name = "u", descriptor = "Z")
    public boolean field1395;

    @OriginalMember(owner = "client!RIEEXHOP", name = "v", descriptor = "Z")
    public boolean field1396;

    @OriginalMember(owner = "client!RIEEXHOP", name = "w", descriptor = "Z")
    public boolean field1397;

    @OriginalMember(owner = "client!RIEEXHOP", name = "<init>", descriptor = "(III)V")
    public Tile(int arg0, int arg1, int arg2) {
        this.field1383 = this.field1380 = arg0;
        this.field1381 = arg1;
        this.field1382 = arg2;
    }
}
