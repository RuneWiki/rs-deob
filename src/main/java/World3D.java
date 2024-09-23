import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NYFUGYQS")
public class World3D {

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "NYFUGYQS", name = "f", descriptor = "Z")
    private boolean _flowObfuscator6 = true;

    @OriginalMember(owner = "NYFUGYQS", name = "g", descriptor = "Z")
    private boolean _flowObfuscator7 = false;

    @OriginalMember(owner = "NYFUGYQS", name = "p", descriptor = "[LOPNPFUJE;")
    public Location[] temporaryLocs = new Location[5000];

    @OriginalMember(owner = "NYFUGYQS", name = "fb", descriptor = "[I")
    public int[] mergeIndexA = new int[10000];

    @OriginalMember(owner = "NYFUGYQS", name = "gb", descriptor = "[I")
    public int[] mergeIndexB = new int[10000];

    @OriginalMember(owner = "NYFUGYQS", name = "ib", descriptor = "[[I")
    public int[][] MINIMAP_OVERLAY_SHAPE = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "NYFUGYQS", name = "jb", descriptor = "[[I")
    public int[][] MINIMAP_OVERLAY_ROTATION = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "NYFUGYQS", name = "i", descriptor = "I")
    public int maxLevel;

    @OriginalMember(owner = "NYFUGYQS", name = "j", descriptor = "I")
    public int maxTileX;

    @OriginalMember(owner = "NYFUGYQS", name = "k", descriptor = "I")
    public int maxTileZ;

    @OriginalMember(owner = "NYFUGYQS", name = "m", descriptor = "[[[LQTKGMFHL;")
    public Ground[][][] levelTiles;

    @OriginalMember(owner = "NYFUGYQS", name = "q", descriptor = "[[[I")
    public int[][][] levelTileOcclusionCycles;

    @OriginalMember(owner = "NYFUGYQS", name = "l", descriptor = "[[[I")
    public int[][][] levelHeightmaps;

    @OriginalMember(owner = "NYFUGYQS", name = "c", descriptor = "I")
    private static int _flowObfuscator3 = 360;

    @OriginalMember(owner = "NYFUGYQS", name = "d", descriptor = "I")
    private static int _flowObfuscator4 = 1;

    @OriginalMember(owner = "NYFUGYQS", name = "e", descriptor = "I")
    private static int _flowObfuscator5 = -460;

    @OriginalMember(owner = "NYFUGYQS", name = "h", descriptor = "Z")
    public static boolean lowMemory = true;

    @OriginalMember(owner = "NYFUGYQS", name = "H", descriptor = "[LOPNPFUJE;")
    public static Location[] locBuffer = new Location[100];

    @OriginalMember(owner = "NYFUGYQS", name = "I", descriptor = "[I")
    public static final int[] WALL_DECORATION_INSET_X = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "NYFUGYQS", name = "J", descriptor = "[I")
    public static final int[] WALL_DECORATION_INSET_Z = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "NYFUGYQS", name = "K", descriptor = "[I")
    public static final int[] WALL_DECORATION_OUTSET_X = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "NYFUGYQS", name = "L", descriptor = "[I")
    public static final int[] WALL_DECORATION_OUTSET_Z = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "NYFUGYQS", name = "P", descriptor = "I")
    public static int clickTileX = -1;

    @OriginalMember(owner = "NYFUGYQS", name = "Q", descriptor = "I")
    public static int clickTileZ = -1;

    @OriginalMember(owner = "NYFUGYQS", name = "R", descriptor = "I")
    public static int levelCount = 4;

    @OriginalMember(owner = "NYFUGYQS", name = "S", descriptor = "[I")
    public static int[] levelOccluderCount = new int[levelCount];

    @OriginalMember(owner = "NYFUGYQS", name = "T", descriptor = "[[LZARDZRHZ;")
    public static Occlude[][] levelOccluders = new Occlude[levelCount][500];

    @OriginalMember(owner = "NYFUGYQS", name = "V", descriptor = "[LZARDZRHZ;")
    public static Occlude[] activeOccluders = new Occlude[500];

    @OriginalMember(owner = "NYFUGYQS", name = "W", descriptor = "LLHGXPZPG;")
    public static LinkList drawTileQueue = new LinkList(169);

    @OriginalMember(owner = "NYFUGYQS", name = "X", descriptor = "[I")
    public static final int[] FRONT_WALL_TYPES = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "NYFUGYQS", name = "Y", descriptor = "[I")
    public static final int[] DIRECTION_ALLOW_WALL_CORNER_TYPE = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "NYFUGYQS", name = "Z", descriptor = "[I")
    public static final int[] BACK_WALL_TYPES = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "NYFUGYQS", name = "ab", descriptor = "[I")
    public static final int[] WALL_CORNER_TYPE_16_BLOCK_LOC_SPANS = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "NYFUGYQS", name = "bb", descriptor = "[I")
    public static final int[] WALL_CORNER_TYPE_32_BLOCK_LOC_SPANS = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "NYFUGYQS", name = "cb", descriptor = "[I")
    public static final int[] WALL_CORNER_TYPE_64_BLOCK_LOC_SPANS = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "NYFUGYQS", name = "db", descriptor = "[I")
    public static final int[] WALL_CORNER_TYPE_128_BLOCK_LOC_SPANS = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "NYFUGYQS", name = "eb", descriptor = "[I")
    public static final int[] TEXTURE_HSL = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "NYFUGYQS", name = "kb", descriptor = "[[[[Z")
    public static boolean[][][][] visibilityMatrix = new boolean[8][32][51][51];

    @OriginalMember(owner = "NYFUGYQS", name = "b", descriptor = "I")
    private int _flowObfuscator2;

    @OriginalMember(owner = "NYFUGYQS", name = "U", descriptor = "I")
    public static int activeOccluderCount;

    @OriginalMember(owner = "NYFUGYQS", name = "E", descriptor = "I")
    public static int cosEyePitch;

    @OriginalMember(owner = "NYFUGYQS", name = "G", descriptor = "I")
    public static int cosEyeYaw;

    @OriginalMember(owner = "NYFUGYQS", name = "t", descriptor = "I")
    public static int cycle;

    @OriginalMember(owner = "NYFUGYQS", name = "y", descriptor = "I")
    public static int eyeTileX;

    @OriginalMember(owner = "NYFUGYQS", name = "z", descriptor = "I")
    public static int eyeTileZ;

    @OriginalMember(owner = "NYFUGYQS", name = "A", descriptor = "I")
    public static int eyeX;

    @OriginalMember(owner = "NYFUGYQS", name = "B", descriptor = "I")
    public static int eyeY;

    @OriginalMember(owner = "NYFUGYQS", name = "C", descriptor = "I")
    public static int eyeZ;

    @OriginalMember(owner = "NYFUGYQS", name = "v", descriptor = "I")
    public static int maxDrawTileX;

    @OriginalMember(owner = "NYFUGYQS", name = "x", descriptor = "I")
    public static int maxDrawTileZ;

    @OriginalMember(owner = "NYFUGYQS", name = "u", descriptor = "I")
    public static int minDrawTileX;

    @OriginalMember(owner = "NYFUGYQS", name = "w", descriptor = "I")
    public static int minDrawTileZ;

    @OriginalMember(owner = "NYFUGYQS", name = "n", descriptor = "I")
    public int minLevel;

    @OriginalMember(owner = "NYFUGYQS", name = "N", descriptor = "I")
    public static int mouseX;

    @OriginalMember(owner = "NYFUGYQS", name = "O", descriptor = "I")
    public static int mouseY;

    @OriginalMember(owner = "NYFUGYQS", name = "D", descriptor = "I")
    public static int sinEyePitch;

    @OriginalMember(owner = "NYFUGYQS", name = "F", descriptor = "I")
    public static int sinEyeYaw;

    @OriginalMember(owner = "NYFUGYQS", name = "o", descriptor = "I")
    public int temporaryLocCount;

    @OriginalMember(owner = "NYFUGYQS", name = "r", descriptor = "I")
    public static int tilesRemaining;

    @OriginalMember(owner = "NYFUGYQS", name = "hb", descriptor = "I")
    public int tmpMergeIndex;

    @OriginalMember(owner = "NYFUGYQS", name = "s", descriptor = "I")
    public static int topLevel;

    @OriginalMember(owner = "NYFUGYQS", name = "rb", descriptor = "I")
    public static int viewportBottom;

    @OriginalMember(owner = "NYFUGYQS", name = "mb", descriptor = "I")
    public static int viewportCenterX;

    @OriginalMember(owner = "NYFUGYQS", name = "nb", descriptor = "I")
    public static int viewportCenterY;

    @OriginalMember(owner = "NYFUGYQS", name = "ob", descriptor = "I")
    public static int viewportLeft;

    @OriginalMember(owner = "NYFUGYQS", name = "qb", descriptor = "I")
    public static int viewportRight;

    @OriginalMember(owner = "NYFUGYQS", name = "pb", descriptor = "I")
    public static int viewportTop;

    @OriginalMember(owner = "NYFUGYQS", name = "M", descriptor = "Z")
    public static boolean takingInput;

    @OriginalMember(owner = "NYFUGYQS", name = "lb", descriptor = "[[Z")
    public static boolean[][] visibilityMap;

    @OriginalMember(owner = "NYFUGYQS", name = "<init>", descriptor = "(IBI[[[II)V")
    public World3D(int arg0, byte arg1, int arg2, int[][][] arg3, int arg4) {
        this.maxLevel = arg4;
        this.maxTileX = arg2;
        this.maxTileZ = arg0;
        if (arg1 != 43) {
            throw new NullPointerException();
        }
        this.levelTiles = new Ground[arg4][arg2][arg0];
        this.levelTileOcclusionCycles = new int[arg4][arg2 + 1][arg0 + 1];
        this.levelHeightmaps = arg3;
        this.reset(619);
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(I)V")
    public static void unload(int arg0) {
        locBuffer = null;
        while (arg0 >= 0) {
            _flowObfuscator4 = -333;
        }
        levelOccluderCount = null;
        levelOccluders = null;
        drawTileQueue = null;
        visibilityMatrix = null;
        visibilityMap = null;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "b", descriptor = "(I)V")
    public void reset(int arg0) {
        for (int var2 = 0; var2 < this.maxLevel; var2++) {
            for (int var8 = 0; var8 < this.maxTileX; var8++) {
                for (int var9 = 0; var9 < this.maxTileZ; var9++) {
                    this.levelTiles[var2][var8][var9] = null;
                }
            }
        }
        int var3 = 37 / arg0;
        for (int var4 = 0; var4 < levelCount; var4++) {
            for (int var7 = 0; var7 < levelOccluderCount[var4]; var7++) {
                levelOccluders[var4][var7] = null;
            }
            levelOccluderCount[var4] = 0;
        }
        for (int var5 = 0; var5 < this.temporaryLocCount; var5++) {
            this.temporaryLocs[var5] = null;
        }
        this.temporaryLocCount = 0;
        for (int var6 = 0; var6 < locBuffer.length; var6++) {
            locBuffer[var6] = null;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(II)V")
    public void setMinLevel(int arg0, int arg1) {
        if (arg1 != -34686) {
            return;
        }
        this.minLevel = arg0;
        for (int var3 = 0; var3 < this.maxTileX; var3++) {
            for (int var4 = 0; var4 < this.maxTileZ; var4++) {
                if (this.levelTiles[arg0][var3][var4] == null) {
                    this.levelTiles[arg0][var3][var4] = new Ground(arg0, var3, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(III)V")
    public void setBridge(int arg0, int arg1, int arg2) {
        Ground var4 = this.levelTiles[0][arg1][arg0];
        for (int var5 = 0; var5 < 3; var5++) {
            Ground var7 = this.levelTiles[var5][arg1][arg0] = this.levelTiles[var5 + 1][arg1][arg0];
            if (var7 != null) {
                var7.level--;
                for (int var8 = 0; var8 < var7.locCount; var8++) {
                    Location var9 = var7.locs[var8];
                    if ((var9.bitset >> 29 & 0x3) == 2 && var9.minSceneTileX == arg1 && var9.minSceneTileZ == arg0) {
                        var9.level--;
                    }
                }
            }
        }
        while (arg2 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (this.levelTiles[0][arg1][arg0] == null) {
            this.levelTiles[0][arg1][arg0] = new Ground(0, arg1, arg0);
        }
        this.levelTiles[0][arg1][arg0].bridge = var4;
        this.levelTiles[3][arg1][arg0] = null;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIIIIIIII)V")
    public static void addOccluder(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        while (arg6 >= 0) {
            _flowObfuscator4 = -170;
        }
        Occlude var9 = new Occlude();
        var9.minTileX = arg1 / 128;
        var9.maxTileX = arg3 / 128;
        var9.minTileZ = arg7 / 128;
        var9.maxTileZ = arg4 / 128;
        var9.type = arg8;
        var9.minX = arg1;
        var9.maxX = arg3;
        var9.minZ = arg7;
        var9.maxZ = arg4;
        var9.minY = arg5;
        var9.maxY = arg2;
        levelOccluders[arg0][levelOccluderCount[arg0]++] = var9;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIII)V")
    public void setDrawLevel(int arg0, int arg1, int arg2, int arg3) {
        Ground var5 = this.levelTiles[arg0][arg1][arg2];
        if (var5 != null) {
            this.levelTiles[arg0][arg1][arg2].drawLevel = arg3;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void setTile(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var22 = arg0; var22 >= 0; var22--) {
                if (this.levelTiles[var22][arg1][arg2] == null) {
                    this.levelTiles[var22][arg1][arg2] = new Ground(var22, arg1, arg2);
                }
            }
            this.levelTiles[arg0][arg1][arg2].underlay = var21;
        } else if (arg3 == 1) {
            TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var24 = arg0; var24 >= 0; var24--) {
                if (this.levelTiles[var24][arg1][arg2] == null) {
                    this.levelTiles[var24][arg1][arg2] = new Ground(var24, arg1, arg2);
                }
            }
            this.levelTiles[arg0][arg1][arg2].underlay = var23;
        } else {
            TileOverlay var25 = new TileOverlay(arg2, arg14, arg13, arg8, arg5, arg16, arg4, arg10, arg18, arg12, arg9, arg7, arg6, arg3, arg17, arg15, arg11, 3, arg1, arg19);
            for (int var26 = arg0; var26 >= 0; var26--) {
                if (this.levelTiles[var26][arg1][arg2] == null) {
                    this.levelTiles[var26][arg1][arg2] = new Ground(var26, arg1, arg2);
                }
            }
            this.levelTiles[arg0][arg1][arg2].overlay = var25;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIIILXHHRODPC;BII)V")
    public void addGroundDecoration(int arg0, int arg1, int arg2, int arg3, Entity arg4, byte arg5, int arg6, int arg7) {
        if (arg4 == null) {
            return;
        }
        GroundDecor var9 = new GroundDecor();
        var9.model = arg4;
        var9.x = arg7 * 128 + 64;
        var9.z = arg2 * 128 + 64;
        if (arg3 <= 0) {
            this._flowObfuscator7 = !this._flowObfuscator7;
        }
        var9.level = arg1;
        var9.bitset = arg6;
        var9.info = arg5;
        if (this.levelTiles[arg0][arg7][arg2] == null) {
            this.levelTiles[arg0][arg7][arg2] = new Ground(arg0, arg7, arg2);
        }
        this.levelTiles[arg0][arg7][arg2].groundDecor = var9;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(BIILXHHRODPC;ILXHHRODPC;LXHHRODPC;II)V")
    public void addObjStack(byte arg0, int arg1, int arg2, Entity arg3, int arg4, Entity arg5, Entity arg6, int arg7, int arg8) {
        GroundObject var10 = new GroundObject();
        var10.topObj = arg6;
        var10.x = arg1 * 128 + 64;
        var10.z = arg8 * 128 + 64;
        if (arg0 != 7) {
            return;
        }
        var10.level = arg4;
        var10.bitset = arg2;
        var10.bottomObj = arg3;
        var10.middleObj = arg5;
        int var11 = 0;
        Ground var12 = this.levelTiles[arg7][arg1][arg8];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.locCount; var13++) {
                if (var12.locs[var13].model instanceof Model) {
                    int var14 = ((Model) var12.locs[var13].model).objRaise;
                    if (var14 > var11) {
                        var11 = var14;
                    }
                }
            }
        }
        var10.offset = var11;
        if (this.levelTiles[arg7][arg1][arg8] == null) {
            this.levelTiles[arg7][arg1][arg8] = new Ground(arg7, arg1, arg8);
        }
        this.levelTiles[arg7][arg1][arg8].groundObj = var10;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(ILXHHRODPC;ZIIBILXHHRODPC;III)V")
    public void setWall(int arg0, Entity arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6, Entity arg7, int arg8, int arg9, int arg10) {
        if (!arg2) {
            this._flowObfuscator6 = !this._flowObfuscator6;
        }
        if (arg1 == null && arg7 == null) {
            return;
        }
        Wall var12 = new Wall();
        var12.bitset = arg3;
        var12.info = arg5;
        var12.x = arg6 * 128 + 64;
        var12.z = arg4 * 128 + 64;
        var12.level = arg8;
        var12.modelA = arg1;
        var12.modelB = arg7;
        var12.typeA = arg0;
        var12.typeB = arg9;
        for (int var13 = arg10; var13 >= 0; var13--) {
            if (this.levelTiles[var13][arg6][arg4] == null) {
                this.levelTiles[var13][arg6][arg4] = new Ground(var13, arg6, arg4);
            }
        }
        this.levelTiles[arg10][arg6][arg4].wall = var12;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIIIIIILXHHRODPC;IBII)V")
    public void setWallDecoration(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Entity arg7, int arg8, byte arg9, int arg10, int arg11) {
        if (arg7 == null) {
            return;
        }
        Decor var13 = new Decor();
        var13.bitset = arg0;
        while (arg3 >= 0) {
            this._flowObfuscator7 = !this._flowObfuscator7;
        }
        var13.info = arg9;
        var13.x = arg8 * 128 + arg5 + 64;
        var13.z = arg1 * 128 + arg10 + 64;
        var13.y = arg6;
        var13.model = arg7;
        var13.type = arg11;
        var13.angle = arg2;
        for (int var14 = arg4; var14 >= 0; var14--) {
            if (this.levelTiles[var14][arg8][arg1] == null) {
                this.levelTiles[var14][arg8][arg1] = new Ground(var14, arg8, arg1);
            }
        }
        this.levelTiles[arg4][arg8][arg1].decor = var13;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IBIILXHHRODPC;IIIBII)Z")
    public boolean add(int arg0, byte arg1, int arg2, int arg3, Entity arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        if (arg8 != 110) {
            _flowObfuscator3 = 250;
        }
        if (arg4 == null) {
            return true;
        } else {
            int var12 = arg5 * 64 + arg10 * 128;
            int var13 = arg3 * 64 + arg9 * 128;
            return this.add(arg6, arg10, arg9, arg5, arg3, var12, var13, arg2, arg4, arg7, false, arg0, arg1);
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIBIIIIILXHHRODPC;Z)Z")
    public boolean addTemporary(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, boolean arg9) {
        if (arg8 == null) {
            return true;
        }
        int var11 = arg7 - arg6;
        int var12 = arg5 - arg6;
        int var13 = arg6 + arg7;
        int var14 = arg5 + arg6;
        if (arg9) {
            if (arg1 > 640 && arg1 < 1408) {
                var14 += 128;
            }
            if (arg1 > 1152 && arg1 < 1920) {
                var13 += 128;
            }
            if (arg1 > 1664 || arg1 < 384) {
                var12 -= 128;
            }
            if (arg1 > 128 && arg1 < 896) {
                var11 -= 128;
            }
        }
        int var15 = var11 / 128;
        if (arg2 != 6) {
            throw new NullPointerException();
        }
        boolean var16 = false;
        int var17 = var12 / 128;
        int var18 = var13 / 128;
        int var19 = var14 / 128;
        return this.add(arg0, var15, var17, var18 + 1 - var15, var19 - var17 + 1, arg7, arg5, arg3, arg8, arg1, true, arg4, (byte) 0);
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIILXHHRODPC;IIIIIIIIB)Z")
    public boolean addTemporary(int arg0, int arg1, int arg2, Entity arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte arg12) {
        if (arg12 != 35) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        return arg3 == null ? true : this.add(arg1, arg8, arg11, arg9 + 1 - arg8, arg5 - arg11 + 1, arg6, arg2, arg7, arg3, arg4, true, arg10, (byte) 0);
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIIIIIIILXHHRODPC;IZIB)Z")
    private boolean add(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
        for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
            for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
                if (var14 < 0 || var21 < 0 || var14 >= this.maxTileX || var21 >= this.maxTileZ) {
                    return false;
                }
                Ground var22 = this.levelTiles[arg0][var14][var21];
                if (var22 != null && var22.locCount >= 5) {
                    return false;
                }
            }
        }
        Location var15 = new Location();
        var15.bitset = arg11;
        var15.info = arg12;
        var15.level = arg0;
        var15.x = arg5;
        var15.z = arg6;
        var15.y = arg7;
        var15.model = arg8;
        var15.yaw = arg9;
        var15.minSceneTileX = arg1;
        var15.minSceneTileZ = arg2;
        var15.maxSceneTileX = arg1 + arg3 - 1;
        var15.maxSceneTileZ = arg2 + arg4 - 1;
        for (int var16 = arg1; var16 < arg1 + arg3; var16++) {
            for (int var17 = arg2; var17 < arg2 + arg4; var17++) {
                int var18 = 0;
                if (var16 > arg1) {
                    var18++;
                }
                if (var16 < arg1 + arg3 - 1) {
                    var18 += 4;
                }
                if (var17 > arg2) {
                    var18 += 8;
                }
                if (var17 < arg2 + arg4 - 1) {
                    var18 += 2;
                }
                for (int var19 = arg0; var19 >= 0; var19--) {
                    if (this.levelTiles[var19][var16][var17] == null) {
                        this.levelTiles[var19][var16][var17] = new Ground(var19, var16, var17);
                    }
                }
                Ground var20 = this.levelTiles[arg0][var16][var17];
                var20.locs[var20.locCount] = var15;
                var20.locSpan[var20.locCount] = var18;
                var20.locSpans |= var18;
                var20.locCount++;
            }
        }
        if (arg10) {
            this.temporaryLocs[this.temporaryLocCount++] = var15;
        }
        return true;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(B)V")
    public void clearTemporaryLocs(byte arg0) {
        if (arg0 != 104) {
            this._flowObfuscator7 = !this._flowObfuscator7;
        }
        for (int var2 = 0; var2 < this.temporaryLocCount; var2++) {
            Location var3 = this.temporaryLocs[var2];
            this.removeLoc(-997, var3);
            this.temporaryLocs[var2] = null;
        }
        this.temporaryLocCount = 0;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(ILOPNPFUJE;)V")
    private void removeLoc(int arg0, Location arg1) {
        if (arg0 >= 0) {
            return;
        }
        for (int var3 = arg1.minSceneTileX; var3 <= arg1.maxSceneTileX; var3++) {
            for (int var4 = arg1.minSceneTileZ; var4 <= arg1.maxSceneTileZ; var4++) {
                Ground var5 = this.levelTiles[arg1.level][var3][var4];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.locCount; var6++) {
                        if (var5.locs[var6] == arg1) {
                            var5.locCount--;
                            for (int var7 = var6; var7 < var5.locCount; var7++) {
                                var5.locs[var7] = var5.locs[var7 + 1];
                                var5.locSpan[var7] = var5.locSpan[var7 + 1];
                            }
                            var5.locs[var5.locCount] = null;
                            break;
                        }
                    }
                    var5.locSpans = 0;
                    for (int var8 = 0; var8 < var5.locCount; var8++) {
                        var5.locSpans |= var5.locSpan[var8];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIIII)V")
    public void setWallDecorationOffset(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Ground var6 = this.levelTiles[arg4][arg3][arg0];
        if (arg1 <= 0) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
        if (var6 == null) {
            return;
        }
        Decor var7 = var6.decor;
        if (var7 != null) {
            int var8 = arg3 * 128 + 64;
            int var9 = arg0 * 128 + 64;
            var7.x = (var7.x - var8) * arg2 / 16 + var8;
            var7.z = (var7.z - var9) * arg2 / 16 + var9;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIIB)V")
    public void removeWall(int arg0, int arg1, int arg2, byte arg3) {
        Ground var5 = this.levelTiles[arg1][arg0][arg2];
        if (arg3 != -119) {
            this._flowObfuscator6 = !this._flowObfuscator6;
        }
        if (var5 != null) {
            var5.wall = null;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "b", descriptor = "(IIII)V")
    public void removeWallDecoration(int arg0, int arg1, int arg2, int arg3) {
        Ground var5 = this.levelTiles[arg2][arg3][arg1];
        if (var5 != null) {
            var5.decor = null;
            if (arg0 == 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "c", descriptor = "(IIII)V")
    public void removeLoc(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Ground var6 = this.levelTiles[arg0][arg2][arg3];
        if (var6 == null) {
            return;
        }
        for (int var7 = 0; var7 < var6.locCount; var7++) {
            Location var8 = var6.locs[var7];
            if ((var8.bitset >> 29 & 0x3) == 2 && var8.minSceneTileX == arg2 && var8.minSceneTileZ == arg3) {
                this.removeLoc(-997, var8);
                return;
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(BIII)V")
    public void removeGroundDecoration(byte arg0, int arg1, int arg2, int arg3) {
        Ground var5 = this.levelTiles[arg1][arg3][arg2];
        if (var5 != null) {
            var5.groundDecor = null;
            if (arg0 == 9) {
                boolean var6 = false;
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "b", descriptor = "(III)V")
    public void removeObjStack(int arg0, int arg1, int arg2) {
        Ground var4 = this.levelTiles[arg0][arg1][arg2];
        if (var4 != null) {
            var4.groundObj = null;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIIZ)LFEHPTPDG;")
    public Wall getWall(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            _flowObfuscator5 = -195;
        }
        Ground var5 = this.levelTiles[arg0][arg1][arg2];
        return var5 == null ? null : var5.wall;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "d", descriptor = "(IIII)LOFQAEXFV;")
    public Decor getWallDecoration(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        Ground var5 = this.levelTiles[arg3][arg0][arg2];
        return var5 == null ? null : var5.decor;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIBI)LOPNPFUJE;")
    public Location getLoc(int arg0, int arg1, byte arg2, int arg3) {
        Ground var5 = this.levelTiles[arg3][arg0][arg1];
        if (var5 == null) {
            return null;
        }
        for (int var6 = 0; var6 < var5.locCount; var6++) {
            Location var8 = var5.locs[var6];
            if ((var8.bitset >> 29 & 0x3) == 2 && var8.minSceneTileX == arg0 && var8.minSceneTileZ == arg1) {
                return var8;
            }
        }
        if (arg2 == 4) {
            boolean var7 = false;
        } else {
            _flowObfuscator4 = -376;
        }
        return null;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "e", descriptor = "(IIII)LZIKPHIFI;")
    public GroundDecor getGroundDecoration(int arg0, int arg1, int arg2, int arg3) {
        Ground var5 = this.levelTiles[arg2][arg1][arg0];
        if (arg3 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return var5 == null || var5.groundDecor == null ? null : var5.groundDecor;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "c", descriptor = "(III)I")
    public int getWallBitset(int arg0, int arg1, int arg2) {
        Ground var4 = this.levelTiles[arg0][arg1][arg2];
        return var4 == null || var4.wall == null ? 0 : var4.wall.bitset;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "f", descriptor = "(IIII)I")
    public int getWallDecorationBitset(int arg0, int arg1, int arg2, int arg3) {
        Ground var5 = this.levelTiles[arg0][arg1][arg3];
        if (arg2 == 0) {
            return var5 == null || var5.decor == null ? 0 : var5.decor.bitset;
        } else {
            return this._flowObfuscator2;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "d", descriptor = "(III)I")
    public int getLocBitset(int arg0, int arg1, int arg2) {
        Ground var4 = this.levelTiles[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        }
        for (int var5 = 0; var5 < var4.locCount; var5++) {
            Location var6 = var4.locs[var5];
            if ((var6.bitset >> 29 & 0x3) == 2 && var6.minSceneTileX == arg1 && var6.minSceneTileZ == arg2) {
                return var6.bitset;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "e", descriptor = "(III)I")
    public int getGroundDecorationBitset(int arg0, int arg1, int arg2) {
        Ground var4 = this.levelTiles[arg0][arg1][arg2];
        return var4 == null || var4.groundDecor == null ? 0 : var4.groundDecor.bitset;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "g", descriptor = "(IIII)I")
    public int getInfo(int arg0, int arg1, int arg2, int arg3) {
        Ground var5 = this.levelTiles[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.wall != null && var5.wall.bitset == arg3) {
            return var5.wall.info & 0xFF;
        } else if (var5.decor != null && var5.decor.bitset == arg3) {
            return var5.decor.info & 0xFF;
        } else if (var5.groundDecor != null && var5.groundDecor.bitset == arg3) {
            return var5.groundDecor.info & 0xFF;
        } else {
            for (int var6 = 0; var6 < var5.locCount; var6++) {
                if (var5.locs[var6].bitset == arg3) {
                    return var5.locs[var6].info & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IBIIII)V")
    public void buildModels(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg0 * arg0 + arg3 * arg3));
        int var8 = arg4 * var7 >> 8;
        if (arg1 != 3) {
            this._flowObfuscator6 = !this._flowObfuscator6;
        }
        for (int var9 = 0; var9 < this.maxLevel; var9++) {
            for (int var10 = 0; var10 < this.maxTileX; var10++) {
                for (int var11 = 0; var11 < this.maxTileZ; var11++) {
                    Ground var12 = this.levelTiles[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.wall;
                        if (var13 != null && var13.modelA != null && var13.modelA.vertexNormal != null) {
                            this.mergeLocNormals(var9, 1, 1, var10, (byte) 115, var11, (Model) var13.modelA);
                            if (var13.modelB != null && var13.modelB.vertexNormal != null) {
                                this.mergeLocNormals(var9, 1, 1, var10, (byte) 115, var11, (Model) var13.modelB);
                                this.mergeNormals((Model) var13.modelA, (Model) var13.modelB, 0, 0, 0, false);
                                ((Model) var13.modelB).applyLighting(arg2, var8, arg3, arg0, arg5);
                            }
                            ((Model) var13.modelA).applyLighting(arg2, var8, arg3, arg0, arg5);
                        }
                        for (int var14 = 0; var14 < var12.locCount; var14++) {
                            Location var16 = var12.locs[var14];
                            if (var16 != null && var16.model != null && var16.model.vertexNormal != null) {
                                this.mergeLocNormals(var9, var16.maxSceneTileX + 1 - var16.minSceneTileX, var16.maxSceneTileZ - var16.minSceneTileZ + 1, var10, (byte) 115, var11, (Model) var16.model);
                                ((Model) var16.model).applyLighting(arg2, var8, arg3, arg0, arg5);
                            }
                        }
                        GroundDecor var15 = var12.groundDecor;
                        if (var15 != null && var15.model.vertexNormal != null) {
                            this.mergeGroundDecorationNormals(var10, var9, (Model) var15.model, (byte) 37, var11);
                            ((Model) var15.model).applyLighting(arg2, var8, arg3, arg0, arg5);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IILZKARKDQW;BI)V")
    private void mergeGroundDecorationNormals(int arg0, int arg1, Model arg2, byte arg3, int arg4) {
        if (arg3 != 37) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg0 < this.maxTileX) {
            Ground var7 = this.levelTiles[arg1][arg0 + 1][arg4];
            if (var7 != null && var7.groundDecor != null && var7.groundDecor.model.vertexNormal != null) {
                this.mergeNormals(arg2, (Model) var7.groundDecor.model, 128, 0, 0, true);
            }
        }
        if (arg4 < this.maxTileX) {
            Ground var8 = this.levelTiles[arg1][arg0][arg4 + 1];
            if (var8 != null && var8.groundDecor != null && var8.groundDecor.model.vertexNormal != null) {
                this.mergeNormals(arg2, (Model) var8.groundDecor.model, 0, 0, 128, true);
            }
        }
        if (arg0 < this.maxTileX && arg4 < this.maxTileZ) {
            Ground var9 = this.levelTiles[arg1][arg0 + 1][arg4 + 1];
            if (var9 != null && var9.groundDecor != null && var9.groundDecor.model.vertexNormal != null) {
                this.mergeNormals(arg2, (Model) var9.groundDecor.model, 128, 0, 128, true);
            }
        }
        if (arg0 >= this.maxTileX || arg4 <= 0) {
            return;
        }
        Ground var10 = this.levelTiles[arg1][arg0 + 1][arg4 - 1];
        if (var10 != null && var10.groundDecor != null && var10.groundDecor.model.vertexNormal != null) {
            this.mergeNormals(arg2, (Model) var10.groundDecor.model, 128, 0, -128, true);
            return;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIIIBILZKARKDQW;)V")
    private void mergeLocNormals(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, Model arg6) {
        boolean var8 = true;
        if (arg4 != 115) {
            _flowObfuscator3 = 350;
        }
        int var9 = arg3;
        int var10 = arg1 + arg3;
        int var11 = arg5 - 1;
        int var12 = arg2 + arg5;
        for (int var13 = arg0; var13 <= arg0 + 1; var13++) {
            if (this.maxLevel != var13) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.maxTileX) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.maxTileZ && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg5 && arg3 != var14)) {
                                Ground var16 = this.levelTiles[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.levelHeightmaps[var13][var14 + 1][var15] + this.levelHeightmaps[var13][var14][var15] + this.levelHeightmaps[var13][var14][var15 + 1] + this.levelHeightmaps[var13][var14 + 1][var15 + 1]) / 4 - (this.levelHeightmaps[arg0][arg3 + 1][arg5] + this.levelHeightmaps[arg0][arg3][arg5] + this.levelHeightmaps[arg0][arg3][arg5 + 1] + this.levelHeightmaps[arg0][arg3 + 1][arg5 + 1]) / 4;
                                    Wall var18 = var16.wall;
                                    if (var18 != null && var18.modelA != null && var18.modelA.vertexNormal != null) {
                                        this.mergeNormals(arg6, (Model) var18.modelA, (1 - arg1) * 64 + (var14 - arg3) * 128, var17, (1 - arg2) * 64 + (var15 - arg5) * 128, var8);
                                    }
                                    if (var18 != null && var18.modelB != null && var18.modelB.vertexNormal != null) {
                                        this.mergeNormals(arg6, (Model) var18.modelB, (1 - arg1) * 64 + (var14 - arg3) * 128, var17, (1 - arg2) * 64 + (var15 - arg5) * 128, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.locCount; var19++) {
                                        Location var20 = var16.locs[var19];
                                        if (var20 != null && var20.model != null && var20.model.vertexNormal != null) {
                                            int var21 = var20.maxSceneTileX + 1 - var20.minSceneTileX;
                                            int var22 = var20.maxSceneTileZ + 1 - var20.minSceneTileZ;
                                            this.mergeNormals(arg6, (Model) var20.model, (var20.minSceneTileX - arg3) * 128 + (var21 - arg1) * 64, var17, (var20.minSceneTileZ - arg5) * 128 + (var22 - arg2) * 64, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var9--;
                var8 = false;
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(LZKARKDQW;LZKARKDQW;IIIZ)V")
    private void mergeNormals(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.tmpMergeIndex++;
        int var7 = 0;
        int[] var8 = arg1.vertexX;
        int var9 = arg1.vertexCount;
        for (int var10 = 0; var10 < arg0.vertexCount; var10++) {
            VertexNormal var13 = arg0.vertexNormal[var10];
            VertexNormal var14 = arg0.vertexNormalOriginal[var10];
            if (var14.w != 0) {
                int var15 = arg0.vertexY[var10] - arg3;
                if (var15 <= arg1.maxY) {
                    int var16 = arg0.vertexX[var10] - arg2;
                    if (var16 >= arg1.minX && var16 <= arg1.maxX) {
                        int var17 = arg0.vertexZ[var10] - arg4;
                        if (var17 >= arg1.minZ && var17 <= arg1.maxZ) {
                            for (int var18 = 0; var18 < var9; var18++) {
                                VertexNormal var19 = arg1.vertexNormal[var18];
                                VertexNormal var20 = arg1.vertexNormalOriginal[var18];
                                if (var8[var18] == var16 && arg1.vertexZ[var18] == var17 && arg1.vertexY[var18] == var15 && var20.w != 0) {
                                    var13.x += var20.x;
                                    var13.y += var20.y;
                                    var13.z += var20.z;
                                    var13.w += var20.w;
                                    var19.x += var14.x;
                                    var19.y += var14.y;
                                    var19.z += var14.z;
                                    var19.w += var14.w;
                                    var7++;
                                    this.mergeIndexA[var10] = this.tmpMergeIndex;
                                    this.mergeIndexB[var18] = this.tmpMergeIndex;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg5) {
            return;
        }
        for (int var11 = 0; var11 < arg0.faceCount; var11++) {
            if (this.mergeIndexA[arg0.faceVertexA[var11]] == this.tmpMergeIndex && this.mergeIndexA[arg0.faceVertexB[var11]] == this.tmpMergeIndex && this.mergeIndexA[arg0.faceVertexC[var11]] == this.tmpMergeIndex) {
                arg0.faceInfo[var11] = -1;
            }
        }
        for (int var12 = 0; var12 < arg1.faceCount; var12++) {
            if (this.mergeIndexB[arg1.faceVertexA[var12]] == this.tmpMergeIndex && this.mergeIndexB[arg1.faceVertexB[var12]] == this.tmpMergeIndex && this.mergeIndexB[arg1.faceVertexC[var12]] == this.tmpMergeIndex) {
                arg1.faceInfo[var12] = -1;
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "([IIIIII)V")
    public void drawMinimapTile(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Ground var7 = this.levelTiles[arg3][arg4][arg5];
        if (var7 == null) {
            return;
        }
        TileUnderlay var8 = var7.underlay;
        if (var8 != null) {
            int var9 = var8.rgb;
            if (var9 != 0) {
                for (int var10 = 0; var10 < 4; var10++) {
                    arg0[arg1] = var9;
                    arg0[arg1 + 1] = var9;
                    arg0[arg1 + 2] = var9;
                    arg0[arg1 + 3] = var9;
                    arg1 += arg2;
                }
            }
            return;
        }
        TileOverlay var11 = var7.overlay;
        if (var11 == null) {
            return;
        }
        int var12 = var11.shape;
        int var13 = var11.rotation;
        int var14 = var11.backgroundRgb;
        int var15 = var11.foregroundRgb;
        int[] var16 = this.MINIMAP_OVERLAY_SHAPE[var12];
        int[] var17 = this.MINIMAP_OVERLAY_ROTATION[var13];
        int var18 = 0;
        if (var14 != 0) {
            for (int var19 = 0; var19 < 4; var19++) {
                arg0[arg1] = var16[var17[var18++]] == 0 ? var14 : var15;
                arg0[arg1 + 1] = var16[var17[var18++]] == 0 ? var14 : var15;
                arg0[arg1 + 2] = var16[var17[var18++]] == 0 ? var14 : var15;
                arg0[arg1 + 3] = var16[var17[var18++]] == 0 ? var14 : var15;
                arg1 += arg2;
            }
            return;
        }
        for (int var20 = 0; var20 < 4; var20++) {
            if (var16[var17[var18++]] != 0) {
                arg0[arg1] = var15;
            }
            if (var16[var17[var18++]] != 0) {
                arg0[arg1 + 1] = var15;
            }
            if (var16[var17[var18++]] != 0) {
                arg0[arg1 + 2] = var15;
            }
            if (var16[var17[var18++]] != 0) {
                arg0[arg1 + 3] = var15;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIII[IZ)V")
    public static void init(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5) {
        viewportLeft = 0;
        viewportTop = 0;
        viewportRight = arg2;
        viewportBottom = arg3;
        viewportCenterX = arg2 / 2;
        viewportCenterY = arg3 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        if (arg5) {
            _flowObfuscator5 = 168;
        }
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (int var15 = 0; var15 < 2048; var15 += 64) {
                sinEyePitch = Model.sin[var7];
                cosEyePitch = Model.cos[var7];
                sinEyeYaw = Model.sin[var15];
                cosEyeYaw = Model.cos[var15];
                int var16 = (var7 - 128) / 32;
                int var17 = var15 / 64;
                for (int var18 = -26; var18 <= 26; var18++) {
                    for (int var19 = -26; var19 <= 26; var19++) {
                        int var20 = var18 * 128;
                        int var21 = var19 * 128;
                        boolean var22 = false;
                        for (int var23 = -arg0; var23 <= arg1; var23 += 128) {
                            if (testPoint((byte) 9, arg4[var16] + var23, var21, var20)) {
                                var22 = true;
                                break;
                            }
                        }
                        var6[var16][var17][var18 + 25 + 1][var19 + 25 + 1] = var22;
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            for (int var9 = 0; var9 < 32; var9++) {
                for (int var10 = -25; var10 < 25; var10++) {
                    for (int var11 = -25; var11 < 25; var11++) {
                        boolean var12 = false;
                        label82: for (int var13 = -1; var13 <= 1; var13++) {
                            for (int var14 = -1; var14 <= 1; var14++) {
                                if (var6[var8][var9][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var12 = true;
                                    break label82;
                                }
                                if (var6[var8][(var9 + 1) % 31][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var12 = true;
                                    break label82;
                                }
                                if (var6[var8 + 1][var9][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var12 = true;
                                    break label82;
                                }
                                if (var6[var8 + 1][(var9 + 1) % 31][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var12 = true;
                                    break label82;
                                }
                            }
                        }
                        visibilityMatrix[var8][var9][var10 + 25][var11 + 25] = var12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "b", descriptor = "(BIII)Z")
    public static boolean testPoint(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = sinEyeYaw * arg2 + cosEyeYaw * arg3 >> 16;
        int var5 = cosEyeYaw * arg2 - sinEyeYaw * arg3 >> 16;
        if (arg0 != 9) {
            _flowObfuscator3 = -346;
        }
        int var6 = sinEyePitch * arg1 + cosEyePitch * var5 >> 16;
        int var7 = cosEyePitch * arg1 - sinEyePitch * var5 >> 16;
        if (var6 >= 50 && var6 <= 3500) {
            int var8 = (var4 << 9) / var6 + viewportCenterX;
            int var9 = (var7 << 9) / var6 + viewportCenterY;
            return var8 >= viewportLeft && var8 <= viewportRight && var9 >= viewportTop && var9 <= viewportBottom;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(ZII)V")
    public void click(boolean arg0, int arg1, int arg2) {
        takingInput = true;
        mouseX = arg2;
        mouseY = arg1;
        clickTileX = -1;
        clickTileZ = -1;
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIIIIIZ)V")
    public void draw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= this.maxTileX * 128) {
            arg0 = this.maxTileX * 128 - 1;
        }
        if (arg1 < 0) {
            arg1 = 0;
        } else if (arg1 >= this.maxTileZ * 128) {
            arg1 = this.maxTileZ * 128 - 1;
        }
        cycle++;
        sinEyePitch = Model.sin[arg5];
        cosEyePitch = Model.cos[arg5];
        if (arg6) {
            return;
        }
        sinEyeYaw = Model.sin[arg2];
        cosEyeYaw = Model.cos[arg2];
        visibilityMap = visibilityMatrix[(arg5 - 128) / 32][arg2 / 64];
        eyeX = arg0;
        eyeY = arg3;
        eyeZ = arg1;
        eyeTileX = arg0 / 128;
        eyeTileZ = arg1 / 128;
        topLevel = arg4;
        minDrawTileX = eyeTileX - 25;
        if (minDrawTileX < 0) {
            minDrawTileX = 0;
        }
        minDrawTileZ = eyeTileZ - 25;
        if (minDrawTileZ < 0) {
            minDrawTileZ = 0;
        }
        maxDrawTileX = eyeTileX + 25;
        if (maxDrawTileX > this.maxTileX) {
            maxDrawTileX = this.maxTileX;
        }
        maxDrawTileZ = eyeTileZ + 25;
        if (maxDrawTileZ > this.maxTileZ) {
            maxDrawTileZ = this.maxTileZ;
        }
        this.updateActiveOccluders(0);
        tilesRemaining = 0;
        for (int var8 = this.minLevel; var8 < this.maxLevel; var8++) {
            Ground[][] var33 = this.levelTiles[var8];
            for (int var34 = minDrawTileX; var34 < maxDrawTileX; var34++) {
                for (int var35 = minDrawTileZ; var35 < maxDrawTileZ; var35++) {
                    Ground var36 = var33[var34][var35];
                    if (var36 != null) {
                        if (var36.drawLevel <= arg4 && (visibilityMap[var34 + 25 - eyeTileX][var35 + 25 - eyeTileZ] || this.levelHeightmaps[var8][var34][var35] - arg3 >= 2000)) {
                            var36.visible = true;
                            var36.update = true;
                            if (var36.locCount > 0) {
                                var36.containsLocs = true;
                            } else {
                                var36.containsLocs = false;
                            }
                            tilesRemaining++;
                        } else {
                            var36.visible = false;
                            var36.update = false;
                            var36.checkLocSpans = 0;
                        }
                    }
                }
            }
        }
        for (int var9 = this.minLevel; var9 < this.maxLevel; var9++) {
            Ground[][] var22 = this.levelTiles[var9];
            for (int var23 = -25; var23 <= 0; var23++) {
                int var24 = eyeTileX + var23;
                int var25 = eyeTileX - var23;
                if (var24 >= minDrawTileX || var25 < maxDrawTileX) {
                    for (int var26 = -25; var26 <= 0; var26++) {
                        int var27 = eyeTileZ + var26;
                        int var28 = eyeTileZ - var26;
                        if (var24 >= minDrawTileX) {
                            if (var27 >= minDrawTileZ) {
                                Ground var29 = var22[var24][var27];
                                if (var29 != null && var29.visible) {
                                    this.drawTile(var29, true);
                                }
                            }
                            if (var28 < maxDrawTileZ) {
                                Ground var30 = var22[var24][var28];
                                if (var30 != null && var30.visible) {
                                    this.drawTile(var30, true);
                                }
                            }
                        }
                        if (var25 < maxDrawTileX) {
                            if (var27 >= minDrawTileZ) {
                                Ground var31 = var22[var25][var27];
                                if (var31 != null && var31.visible) {
                                    this.drawTile(var31, true);
                                }
                            }
                            if (var28 < maxDrawTileZ) {
                                Ground var32 = var22[var25][var28];
                                if (var32 != null && var32.visible) {
                                    this.drawTile(var32, true);
                                }
                            }
                        }
                        if (tilesRemaining == 0) {
                            takingInput = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var10 = this.minLevel; var10 < this.maxLevel; var10++) {
            Ground[][] var11 = this.levelTiles[var10];
            for (int var12 = -25; var12 <= 0; var12++) {
                int var13 = eyeTileX + var12;
                int var14 = eyeTileX - var12;
                if (var13 >= minDrawTileX || var14 < maxDrawTileX) {
                    for (int var15 = -25; var15 <= 0; var15++) {
                        int var16 = eyeTileZ + var15;
                        int var17 = eyeTileZ - var15;
                        if (var13 >= minDrawTileX) {
                            if (var16 >= minDrawTileZ) {
                                Ground var18 = var11[var13][var16];
                                if (var18 != null && var18.visible) {
                                    this.drawTile(var18, false);
                                }
                            }
                            if (var17 < maxDrawTileZ) {
                                Ground var19 = var11[var13][var17];
                                if (var19 != null && var19.visible) {
                                    this.drawTile(var19, false);
                                }
                            }
                        }
                        if (var14 < maxDrawTileX) {
                            if (var16 >= minDrawTileZ) {
                                Ground var20 = var11[var14][var16];
                                if (var20 != null && var20.visible) {
                                    this.drawTile(var20, false);
                                }
                            }
                            if (var17 < maxDrawTileZ) {
                                Ground var21 = var11[var14][var17];
                                if (var21 != null && var21.visible) {
                                    this.drawTile(var21, false);
                                }
                            }
                        }
                        if (tilesRemaining == 0) {
                            takingInput = false;
                            return;
                        }
                    }
                }
            }
        }
        takingInput = false;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(LQTKGMFHL;Z)V")
    public void drawTile(Ground arg0, boolean arg1) {
        drawTileQueue.addTail(arg0);
        while (true) {
            Ground var3;
            int var4;
            int var5;
            int var6;
            int var7;
            Ground[][] var8;
            Ground var70;
            do {
                Ground var69;
                do {
                    Ground var68;
                    do {
                        Ground var67;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var3 = (Ground) drawTileQueue.removeHead();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.update);
                                            var4 = var3.x;
                                            var5 = var3.z;
                                            var6 = var3.level;
                                            var7 = var3.occludeLevel;
                                            var8 = this.levelTiles[var6];
                                            if (!var3.visible) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    Ground var9 = this.levelTiles[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.update) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= eyeTileX && var4 > minDrawTileX) {
                                                    Ground var10 = var8[var4 - 1][var5];
                                                    if (var10 != null && var10.update && (var10.visible || (var3.locSpans & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= eyeTileX && var4 < maxDrawTileX - 1) {
                                                    Ground var11 = var8[var4 + 1][var5];
                                                    if (var11 != null && var11.update && (var11.visible || (var3.locSpans & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= eyeTileZ && var5 > minDrawTileZ) {
                                                    Ground var12 = var8[var4][var5 - 1];
                                                    if (var12 != null && var12.update && (var12.visible || (var3.locSpans & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= eyeTileZ && var5 < maxDrawTileZ - 1) {
                                                    Ground var13 = var8[var4][var5 + 1];
                                                    if (var13 != null && var13.update && (var13.visible || (var3.locSpans & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.visible = false;
                                            if (var3.bridge != null) {
                                                Ground var14 = var3.bridge;
                                                if (var14.underlay == null) {
                                                    if (var14.overlay != null && !this.tileVisible(0, var4, var5)) {
                                                        this.drawTileOverlay(var4, (byte) 99, sinEyePitch, sinEyeYaw, var14.overlay, cosEyePitch, var5, cosEyeYaw);
                                                    }
                                                } else if (!this.tileVisible(0, var4, var5)) {
                                                    this.drawTileUnderlay(var14.underlay, 0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var4, var5);
                                                }
                                                Wall var15 = var14.wall;
                                                if (var15 != null) {
                                                    var15.modelA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var15.x - eyeX, var15.level - eyeY, var15.z - eyeZ, var15.bitset);
                                                }
                                                for (int var16 = 0; var16 < var14.locCount; var16++) {
                                                    Location var17 = var14.locs[var16];
                                                    if (var17 != null) {
                                                        var17.model.draw(var17.yaw, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var17.x - eyeX, var17.y - eyeY, var17.z - eyeZ, var17.bitset);
                                                    }
                                                }
                                            }
                                            boolean var18 = false;
                                            if (var3.underlay == null) {
                                                if (var3.overlay != null && !this.tileVisible(var7, var4, var5)) {
                                                    var18 = true;
                                                    this.drawTileOverlay(var4, (byte) 99, sinEyePitch, sinEyeYaw, var3.overlay, cosEyePitch, var5, cosEyeYaw);
                                                }
                                            } else if (!this.tileVisible(var7, var4, var5)) {
                                                var18 = true;
                                                this.drawTileUnderlay(var3.underlay, var7, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var4, var5);
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            Wall var21 = var3.wall;
                                            Decor var22 = var3.decor;
                                            if (var21 != null || var22 != null) {
                                                if (eyeTileX == var4) {
                                                    var19++;
                                                } else if (eyeTileX < var4) {
                                                    var19 += 2;
                                                }
                                                if (eyeTileZ == var5) {
                                                    var19 += 3;
                                                } else if (eyeTileZ > var5) {
                                                    var19 += 6;
                                                }
                                                var20 = FRONT_WALL_TYPES[var19];
                                                var3.backWallTypes = BACK_WALL_TYPES[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.typeA & DIRECTION_ALLOW_WALL_CORNER_TYPE[var19]) == 0) {
                                                    var3.checkLocSpans = 0;
                                                } else if (var21.typeA == 16) {
                                                    var3.checkLocSpans = 3;
                                                    var3.blockLocSpans = WALL_CORNER_TYPE_16_BLOCK_LOC_SPANS[var19];
                                                    var3.inverseBlockLocSpans = 3 - var3.blockLocSpans;
                                                } else if (var21.typeA == 32) {
                                                    var3.checkLocSpans = 6;
                                                    var3.blockLocSpans = WALL_CORNER_TYPE_32_BLOCK_LOC_SPANS[var19];
                                                    var3.inverseBlockLocSpans = 6 - var3.blockLocSpans;
                                                } else if (var21.typeA == 64) {
                                                    var3.checkLocSpans = 12;
                                                    var3.blockLocSpans = WALL_CORNER_TYPE_64_BLOCK_LOC_SPANS[var19];
                                                    var3.inverseBlockLocSpans = 12 - var3.blockLocSpans;
                                                } else {
                                                    var3.checkLocSpans = 9;
                                                    var3.blockLocSpans = WALL_CORNER_TYPE_128_BLOCK_LOC_SPANS[var19];
                                                    var3.inverseBlockLocSpans = 9 - var3.blockLocSpans;
                                                }
                                                if ((var21.typeA & var20) != 0 && !this.wallVisible(var7, var4, var5, var21.typeA)) {
                                                    var21.modelA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var21.x - eyeX, var21.level - eyeY, var21.z - eyeZ, var21.bitset);
                                                }
                                                if ((var21.typeB & var20) != 0 && !this.wallVisible(var7, var4, var5, var21.typeB)) {
                                                    var21.modelB.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var21.x - eyeX, var21.level - eyeY, var21.z - eyeZ, var21.bitset);
                                                }
                                            }
                                            if (var22 != null && !this.visible(var7, var4, var5, var22.model.minY)) {
                                                if ((var22.type & var20) != 0) {
                                                    var22.model.draw(var22.angle, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var22.x - eyeX, var22.y - eyeY, var22.z - eyeZ, var22.bitset);
                                                } else if ((var22.type & 0x300) != 0) {
                                                    int var23 = var22.x - eyeX;
                                                    int var24 = var22.y - eyeY;
                                                    int var25 = var22.z - eyeZ;
                                                    int var26 = var22.angle;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if ((var22.type & 0x100) != 0 && var28 < var27) {
                                                        int var29 = WALL_DECORATION_INSET_X[var26] + var23;
                                                        int var30 = WALL_DECORATION_INSET_Z[var26] + var25;
                                                        var22.model.draw(var26 * 512 + 256, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var29, var24, var30, var22.bitset);
                                                    }
                                                    if ((var22.type & 0x200) != 0 && var28 > var27) {
                                                        int var31 = WALL_DECORATION_OUTSET_X[var26] + var23;
                                                        int var32 = WALL_DECORATION_OUTSET_Z[var26] + var25;
                                                        var22.model.draw(var26 * 512 + 1280 & 0x7FF, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var31, var24, var32, var22.bitset);
                                                    }
                                                }
                                            }
                                            if (var18) {
                                                GroundDecor var33 = var3.groundDecor;
                                                if (var33 != null) {
                                                    var33.model.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var33.x - eyeX, var33.level - eyeY, var33.z - eyeZ, var33.bitset);
                                                }
                                                GroundObject var34 = var3.groundObj;
                                                if (var34 != null && var34.offset == 0) {
                                                    if (var34.bottomObj != null) {
                                                        var34.bottomObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var34.x - eyeX, var34.level - eyeY, var34.z - eyeZ, var34.bitset);
                                                    }
                                                    if (var34.middleObj != null) {
                                                        var34.middleObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var34.x - eyeX, var34.level - eyeY, var34.z - eyeZ, var34.bitset);
                                                    }
                                                    if (var34.topObj != null) {
                                                        var34.topObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var34.x - eyeX, var34.level - eyeY, var34.z - eyeZ, var34.bitset);
                                                    }
                                                }
                                            }
                                            int var35 = var3.locSpans;
                                            if (var35 != 0) {
                                                if (var4 < eyeTileX && (var35 & 0x4) != 0) {
                                                    Ground var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.update) {
                                                        drawTileQueue.addTail(var36);
                                                    }
                                                }
                                                if (var5 < eyeTileZ && (var35 & 0x2) != 0) {
                                                    Ground var37 = var8[var4][var5 + 1];
                                                    if (var37 != null && var37.update) {
                                                        drawTileQueue.addTail(var37);
                                                    }
                                                }
                                                if (var4 > eyeTileX && (var35 & 0x1) != 0) {
                                                    Ground var38 = var8[var4 - 1][var5];
                                                    if (var38 != null && var38.update) {
                                                        drawTileQueue.addTail(var38);
                                                    }
                                                }
                                                if (var5 > eyeTileZ && (var35 & 0x8) != 0) {
                                                    Ground var39 = var8[var4][var5 - 1];
                                                    if (var39 != null && var39.update) {
                                                        drawTileQueue.addTail(var39);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.checkLocSpans != 0) {
                                            boolean var40 = true;
                                            for (int var41 = 0; var41 < var3.locCount; var41++) {
                                                if (cycle != var3.locs[var41].cycle && (var3.locSpan[var41] & var3.checkLocSpans) == var3.blockLocSpans) {
                                                    var40 = false;
                                                    break;
                                                }
                                            }
                                            if (var40) {
                                                Wall var42 = var3.wall;
                                                if (!this.wallVisible(var7, var4, var5, var42.typeA)) {
                                                    var42.modelA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var42.x - eyeX, var42.level - eyeY, var42.z - eyeZ, var42.bitset);
                                                }
                                                var3.checkLocSpans = 0;
                                            }
                                        }
                                        if (!var3.containsLocs) {
                                            break;
                                        }
                                        try {
                                            int var43 = var3.locCount;
                                            var3.containsLocs = false;
                                            int var44 = 0;
                                            label559: for (int var45 = 0; var45 < var43; var45++) {
                                                Location var46 = var3.locs[var45];
                                                if (cycle != var46.cycle) {
                                                    for (int var47 = var46.minSceneTileX; var47 <= var46.maxSceneTileX; var47++) {
                                                        for (int var48 = var46.minSceneTileZ; var48 <= var46.maxSceneTileZ; var48++) {
                                                            Ground var49 = var8[var47][var48];
                                                            if (var49.visible) {
                                                                var3.containsLocs = true;
                                                                continue label559;
                                                            }
                                                            if (var49.checkLocSpans != 0) {
                                                                int var50 = 0;
                                                                if (var47 > var46.minSceneTileX) {
                                                                    var50++;
                                                                }
                                                                if (var47 < var46.maxSceneTileX) {
                                                                    var50 += 4;
                                                                }
                                                                if (var48 > var46.minSceneTileZ) {
                                                                    var50 += 8;
                                                                }
                                                                if (var48 < var46.maxSceneTileZ) {
                                                                    var50 += 2;
                                                                }
                                                                if ((var50 & var49.checkLocSpans) == var3.inverseBlockLocSpans) {
                                                                    var3.containsLocs = true;
                                                                    continue label559;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    locBuffer[var44++] = var46;
                                                    int var51 = eyeTileX - var46.minSceneTileX;
                                                    int var52 = var46.maxSceneTileX - eyeTileX;
                                                    if (var52 > var51) {
                                                        var51 = var52;
                                                    }
                                                    int var53 = eyeTileZ - var46.minSceneTileZ;
                                                    int var54 = var46.maxSceneTileZ - eyeTileZ;
                                                    if (var54 > var53) {
                                                        var46.distance = var51 + var54;
                                                    } else {
                                                        var46.distance = var51 + var53;
                                                    }
                                                }
                                            }
                                            while (var44 > 0) {
                                                int var55 = -50;
                                                int var56 = -1;
                                                for (int var57 = 0; var57 < var44; var57++) {
                                                    Location var58 = locBuffer[var57];
                                                    if (cycle != var58.cycle) {
                                                        if (var58.distance > var55) {
                                                            var55 = var58.distance;
                                                            var56 = var57;
                                                        } else if (var58.distance == var55) {
                                                            int var59 = var58.x - eyeX;
                                                            int var60 = var58.z - eyeZ;
                                                            int var61 = locBuffer[var56].x - eyeX;
                                                            int var62 = locBuffer[var56].z - eyeZ;
                                                            if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
                                                                var56 = var57;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var56 == -1) {
                                                    break;
                                                }
                                                Location var63 = locBuffer[var56];
                                                var63.cycle = cycle;
                                                if (!this.locVisible(var7, var63.minSceneTileX, var63.maxSceneTileX, var63.minSceneTileZ, var63.maxSceneTileZ, var63.model.minY)) {
                                                    var63.model.draw(var63.yaw, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var63.x - eyeX, var63.y - eyeY, var63.z - eyeZ, var63.bitset);
                                                }
                                                for (int var64 = var63.minSceneTileX; var64 <= var63.maxSceneTileX; var64++) {
                                                    for (int var65 = var63.minSceneTileZ; var65 <= var63.maxSceneTileZ; var65++) {
                                                        Ground var66 = var8[var64][var65];
                                                        if (var66.checkLocSpans != 0) {
                                                            drawTileQueue.addTail(var66);
                                                        } else if ((var4 != var64 || var5 != var65) && var66.update) {
                                                            drawTileQueue.addTail(var66);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var3.containsLocs) {
                                                break;
                                            }
                                        } catch (Exception var89) {
                                            var3.containsLocs = false;
                                            break;
                                        }
                                    }
                                } while (!var3.update);
                            } while (var3.checkLocSpans != 0);
                            if (var4 > eyeTileX || var4 <= minDrawTileX) {
                                break;
                            }
                            var67 = var8[var4 - 1][var5];
                        } while (var67 != null && var67.update);
                        if (var4 < eyeTileX || var4 >= maxDrawTileX - 1) {
                            break;
                        }
                        var68 = var8[var4 + 1][var5];
                    } while (var68 != null && var68.update);
                    if (var5 > eyeTileZ || var5 <= minDrawTileZ) {
                        break;
                    }
                    var69 = var8[var4][var5 - 1];
                } while (var69 != null && var69.update);
                if (var5 < eyeTileZ || var5 >= maxDrawTileZ - 1) {
                    break;
                }
                var70 = var8[var4][var5 + 1];
            } while (var70 != null && var70.update);
            var3.update = false;
            tilesRemaining--;
            GroundObject var71 = var3.groundObj;
            if (var71 != null && var71.offset != 0) {
                if (var71.bottomObj != null) {
                    var71.bottomObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var71.x - eyeX, var71.level - eyeY - var71.offset, var71.z - eyeZ, var71.bitset);
                }
                if (var71.middleObj != null) {
                    var71.middleObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var71.x - eyeX, var71.level - eyeY - var71.offset, var71.z - eyeZ, var71.bitset);
                }
                if (var71.topObj != null) {
                    var71.topObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var71.x - eyeX, var71.level - eyeY - var71.offset, var71.z - eyeZ, var71.bitset);
                }
            }
            if (var3.backWallTypes != 0) {
                Decor var72 = var3.decor;
                if (var72 != null && !this.visible(var7, var4, var5, var72.model.minY)) {
                    if ((var72.type & var3.backWallTypes) != 0) {
                        var72.model.draw(var72.angle, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var72.x - eyeX, var72.y - eyeY, var72.z - eyeZ, var72.bitset);
                    } else if ((var72.type & 0x300) != 0) {
                        int var73 = var72.x - eyeX;
                        int var74 = var72.y - eyeY;
                        int var75 = var72.z - eyeZ;
                        int var76 = var72.angle;
                        int var77;
                        if (var76 == 1 || var76 == 2) {
                            var77 = -var73;
                        } else {
                            var77 = var73;
                        }
                        int var78;
                        if (var76 == 2 || var76 == 3) {
                            var78 = -var75;
                        } else {
                            var78 = var75;
                        }
                        if ((var72.type & 0x100) != 0 && var78 >= var77) {
                            int var79 = WALL_DECORATION_INSET_X[var76] + var73;
                            int var80 = WALL_DECORATION_INSET_Z[var76] + var75;
                            var72.model.draw(var76 * 512 + 256, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var79, var74, var80, var72.bitset);
                        }
                        if ((var72.type & 0x200) != 0 && var78 <= var77) {
                            int var81 = WALL_DECORATION_OUTSET_X[var76] + var73;
                            int var82 = WALL_DECORATION_OUTSET_Z[var76] + var75;
                            var72.model.draw(var76 * 512 + 1280 & 0x7FF, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var81, var74, var82, var72.bitset);
                        }
                    }
                }
                Wall var83 = var3.wall;
                if (var83 != null) {
                    if ((var83.typeB & var3.backWallTypes) != 0 && !this.wallVisible(var7, var4, var5, var83.typeB)) {
                        var83.modelB.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var83.x - eyeX, var83.level - eyeY, var83.z - eyeZ, var83.bitset);
                    }
                    if ((var83.typeA & var3.backWallTypes) != 0 && !this.wallVisible(var7, var4, var5, var83.typeA)) {
                        var83.modelA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var83.x - eyeX, var83.level - eyeY, var83.z - eyeZ, var83.bitset);
                    }
                }
            }
            if (var6 < this.maxLevel - 1) {
                Ground var84 = this.levelTiles[var6 + 1][var4][var5];
                if (var84 != null && var84.update) {
                    drawTileQueue.addTail(var84);
                }
            }
            if (var4 < eyeTileX) {
                Ground var85 = var8[var4 + 1][var5];
                if (var85 != null && var85.update) {
                    drawTileQueue.addTail(var85);
                }
            }
            if (var5 < eyeTileZ) {
                Ground var86 = var8[var4][var5 + 1];
                if (var86 != null && var86.update) {
                    drawTileQueue.addTail(var86);
                }
            }
            if (var4 > eyeTileX) {
                Ground var87 = var8[var4 - 1][var5];
                if (var87 != null && var87.update) {
                    drawTileQueue.addTail(var87);
                }
            }
            if (var5 > eyeTileZ) {
                Ground var88 = var8[var4][var5 - 1];
                if (var88 != null && var88.update) {
                    drawTileQueue.addTail(var88);
                }
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(LXPBACSMK;IIIIIII)V")
    public void drawTileUnderlay(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - eyeX;
        int var11;
        int var12 = var11 = (arg7 << 7) - eyeZ;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.levelHeightmaps[arg1][arg6][arg7] - eyeY;
        int var18 = this.levelHeightmaps[arg1][arg6 + 1][arg7] - eyeY;
        int var19 = this.levelHeightmaps[arg1][arg6 + 1][arg7 + 1] - eyeY;
        int var20 = this.levelHeightmaps[arg1][arg6][arg7 + 1] - eyeY;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + Pix3D.centerW3D;
        int var46 = (var24 << 9) / var25 + Pix3D.centerH3D;
        int var47 = (var27 << 9) / var31 + Pix3D.centerW3D;
        int var48 = (var30 << 9) / var31 + Pix3D.centerH3D;
        int var49 = (var33 << 9) / var37 + Pix3D.centerW3D;
        int var50 = (var36 << 9) / var37 + Pix3D.centerH3D;
        int var51 = (var39 << 9) / var43 + Pix3D.centerW3D;
        int var52 = (var42 << 9) / var43 + Pix3D.centerH3D;
        Pix3D.trans = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            Pix3D.clipX = false;
            if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.safeWidth || var51 > Pix2D.safeWidth || var47 > Pix2D.safeWidth) {
                Pix3D.clipX = true;
            }
            if (takingInput && this.pointInsideTriangle(mouseX, mouseY, var50, var52, var48, var49, var51, var47)) {
                clickTileX = arg6;
                clickTileZ = arg7;
            }
            if (arg0.textureId == -1) {
                if (arg0.northeastColor != 12345678) {
                    Pix3D.gouraudTriangle(var50, var52, var48, var49, var51, var47, arg0.northeastColor, arg0.northwestColor, arg0.southeastColor);
                }
            } else if (lowMemory) {
                int var53 = TEXTURE_HSL[arg0.textureId];
                Pix3D.gouraudTriangle(var50, var52, var48, var49, var51, var47, this.mulLightness(-361, var53, arg0.northeastColor), this.mulLightness(-361, var53, arg0.northwestColor), this.mulLightness(-361, var53, arg0.southeastColor));
            } else if (arg0.flat) {
                Pix3D.textureTriangle(var50, var52, var48, var49, var51, var47, arg0.northeastColor, arg0.northwestColor, arg0.southeastColor, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.textureId);
            } else {
                Pix3D.textureTriangle(var50, var52, var48, var49, var51, var47, arg0.northeastColor, arg0.northwestColor, arg0.southeastColor, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.textureId);
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        Pix3D.clipX = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.safeWidth || var47 > Pix2D.safeWidth || var51 > Pix2D.safeWidth) {
            Pix3D.clipX = true;
        }
        if (takingInput && this.pointInsideTriangle(mouseX, mouseY, var46, var48, var52, var45, var47, var51)) {
            clickTileX = arg6;
            clickTileZ = arg7;
        }
        if (arg0.textureId != -1) {
            if (!lowMemory) {
                Pix3D.textureTriangle(var46, var48, var52, var45, var47, var51, arg0.southwestColor, arg0.southeastColor, arg0.northwestColor, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.textureId);
                return;
            }
            int var54 = TEXTURE_HSL[arg0.textureId];
            Pix3D.gouraudTriangle(var46, var48, var52, var45, var47, var51, this.mulLightness(-361, var54, arg0.southwestColor), this.mulLightness(-361, var54, arg0.southeastColor), this.mulLightness(-361, var54, arg0.northwestColor));
        } else if (arg0.southwestColor != 12345678) {
            Pix3D.gouraudTriangle(var46, var48, var52, var45, var47, var51, arg0.southwestColor, arg0.southeastColor, arg0.northwestColor);
            return;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IBIILVBAXKVMG;III)V")
    public void drawTileOverlay(int arg0, byte arg1, int arg2, int arg3, TileOverlay arg4, int arg5, int arg6, int arg7) {
        int var9 = arg4.vertexX.length;
        if (arg1 != 99) {
            return;
        }
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg4.vertexX[var10] - eyeX;
            int var24 = arg4.vertexY[var10] - eyeY;
            int var25 = arg4.vertexZ[var10] - eyeZ;
            int var26 = arg3 * var25 + arg7 * var23 >> 16;
            int var27 = arg7 * var25 - arg3 * var23 >> 16;
            int var29 = arg5 * var24 - arg2 * var27 >> 16;
            int var30 = arg2 * var24 + arg5 * var27 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg4.triangleTextureIds != null) {
                TileOverlay.tmpViewspaceX[var10] = var26;
                TileOverlay.tmpViewspaceY[var10] = var29;
                TileOverlay.tmpViewspaceZ[var10] = var30;
            }
            TileOverlay.tmpScreenX[var10] = (var26 << 9) / var30 + Pix3D.centerW3D;
            TileOverlay.tmpScreenY[var10] = (var29 << 9) / var30 + Pix3D.centerH3D;
        }
        Pix3D.trans = 0;
        int var11 = arg4.triangleVertexA.length;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg4.triangleVertexA[var12];
            int var14 = arg4.triangleVertexB[var12];
            int var15 = arg4.triangleVertexC[var12];
            int var16 = TileOverlay.tmpScreenX[var13];
            int var17 = TileOverlay.tmpScreenX[var14];
            int var18 = TileOverlay.tmpScreenX[var15];
            int var19 = TileOverlay.tmpScreenY[var13];
            int var20 = TileOverlay.tmpScreenY[var14];
            int var21 = TileOverlay.tmpScreenY[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                Pix3D.clipX = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.safeWidth || var17 > Pix2D.safeWidth || var18 > Pix2D.safeWidth) {
                    Pix3D.clipX = true;
                }
                if (takingInput && this.pointInsideTriangle(mouseX, mouseY, var19, var20, var21, var16, var17, var18)) {
                    clickTileX = arg0;
                    clickTileZ = arg6;
                }
                if (arg4.triangleTextureIds == null || arg4.triangleTextureIds[var12] == -1) {
                    if (arg4.triangleColorA[var12] != 12345678) {
                        Pix3D.gouraudTriangle(var19, var20, var21, var16, var17, var18, arg4.triangleColorA[var12], arg4.triangleColorB[var12], arg4.triangleColorC[var12]);
                    }
                } else if (lowMemory) {
                    int var22 = TEXTURE_HSL[arg4.triangleTextureIds[var12]];
                    Pix3D.gouraudTriangle(var19, var20, var21, var16, var17, var18, this.mulLightness(-361, var22, arg4.triangleColorA[var12]), this.mulLightness(-361, var22, arg4.triangleColorB[var12]), this.mulLightness(-361, var22, arg4.triangleColorC[var12]));
                } else if (arg4.flat) {
                    Pix3D.textureTriangle(var19, var20, var21, var16, var17, var18, arg4.triangleColorA[var12], arg4.triangleColorB[var12], arg4.triangleColorC[var12], TileOverlay.tmpViewspaceX[0], TileOverlay.tmpViewspaceX[1], TileOverlay.tmpViewspaceX[3], TileOverlay.tmpViewspaceY[0], TileOverlay.tmpViewspaceY[1], TileOverlay.tmpViewspaceY[3], TileOverlay.tmpViewspaceZ[0], TileOverlay.tmpViewspaceZ[1], TileOverlay.tmpViewspaceZ[3], arg4.triangleTextureIds[var12]);
                } else {
                    Pix3D.textureTriangle(var19, var20, var21, var16, var17, var18, arg4.triangleColorA[var12], arg4.triangleColorB[var12], arg4.triangleColorC[var12], TileOverlay.tmpViewspaceX[var13], TileOverlay.tmpViewspaceX[var14], TileOverlay.tmpViewspaceX[var15], TileOverlay.tmpViewspaceY[var13], TileOverlay.tmpViewspaceY[var14], TileOverlay.tmpViewspaceY[var15], TileOverlay.tmpViewspaceZ[var13], TileOverlay.tmpViewspaceZ[var14], TileOverlay.tmpViewspaceZ[var15], arg4.triangleTextureIds[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "f", descriptor = "(III)I")
    public int mulLightness(int arg0, int arg1, int arg2) {
        int var4 = 127 - arg2;
        int var5 = (arg1 & 0x7F) * var4 / 160;
        if (arg0 >= 0) {
            return this._flowObfuscator2;
        }
        if (var5 < 2) {
            var5 = 2;
        } else if (var5 > 126) {
            var5 = 126;
        }
        return (arg1 & 0xFF80) + var5;
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean pointInsideTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var9 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var10 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var11 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var9 * var11 > 0 && var10 * var11 > 0;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "c", descriptor = "(I)V")
    private void updateActiveOccluders(int arg0) {
        if (arg0 != 0) {
            return;
        }
        int var2 = levelOccluderCount[topLevel];
        Occlude[] var3 = levelOccluders[topLevel];
        activeOccluderCount = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            Occlude var5 = var3[var4];
            if (var5.type == 1) {
                int var6 = var5.minTileX + 25 - eyeTileX;
                if (var6 >= 0 && var6 <= 50) {
                    int var7 = var5.minTileZ + 25 - eyeTileZ;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = var5.maxTileZ + 25 - eyeTileZ;
                    if (var8 > 50) {
                        var8 = 50;
                    }
                    boolean var9 = false;
                    while (var7 <= var8) {
                        if (visibilityMap[var6][var7++]) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var9) {
                        int var10 = eyeX - var5.minX;
                        if (var10 > 32) {
                            var5.mode = 1;
                        } else {
                            if (var10 >= -32) {
                                continue;
                            }
                            var5.mode = 2;
                            var10 = -var10;
                        }
                        var5.minDeltaZ = (var5.minZ - eyeZ << 8) / var10;
                        var5.maxDeltaZ = (var5.maxZ - eyeZ << 8) / var10;
                        var5.minDeltaY = (var5.minY - eyeY << 8) / var10;
                        var5.maxDeltaY = (var5.maxY - eyeY << 8) / var10;
                        activeOccluders[activeOccluderCount++] = var5;
                    }
                }
            } else if (var5.type == 2) {
                int var11 = var5.minTileZ + 25 - eyeTileZ;
                if (var11 >= 0 && var11 <= 50) {
                    int var12 = var5.minTileX + 25 - eyeTileX;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = var5.maxTileX + 25 - eyeTileX;
                    if (var13 > 50) {
                        var13 = 50;
                    }
                    boolean var14 = false;
                    while (var12 <= var13) {
                        if (visibilityMap[var12++][var11]) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        int var15 = eyeZ - var5.minZ;
                        if (var15 > 32) {
                            var5.mode = 3;
                        } else {
                            if (var15 >= -32) {
                                continue;
                            }
                            var5.mode = 4;
                            var15 = -var15;
                        }
                        var5.minDeltaX = (var5.minX - eyeX << 8) / var15;
                        var5.maxDeltaX = (var5.maxX - eyeX << 8) / var15;
                        var5.minDeltaY = (var5.minY - eyeY << 8) / var15;
                        var5.maxDeltaY = (var5.maxY - eyeY << 8) / var15;
                        activeOccluders[activeOccluderCount++] = var5;
                    }
                }
            } else if (var5.type == 4) {
                int var16 = var5.minY - eyeY;
                if (var16 > 128) {
                    int var17 = var5.minTileZ + 25 - eyeTileZ;
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    int var18 = var5.maxTileZ + 25 - eyeTileZ;
                    if (var18 > 50) {
                        var18 = 50;
                    }
                    if (var17 <= var18) {
                        int var19 = var5.minTileX + 25 - eyeTileX;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var20 = var5.maxTileX + 25 - eyeTileX;
                        if (var20 > 50) {
                            var20 = 50;
                        }
                        boolean var21 = false;
                        label149: for (int var22 = var19; var22 <= var20; var22++) {
                            for (int var23 = var17; var23 <= var18; var23++) {
                                if (visibilityMap[var22][var23]) {
                                    var21 = true;
                                    break label149;
                                }
                            }
                        }
                        if (var21) {
                            var5.mode = 5;
                            var5.minDeltaX = (var5.minX - eyeX << 8) / var16;
                            var5.maxDeltaX = (var5.maxX - eyeX << 8) / var16;
                            var5.minDeltaZ = (var5.minZ - eyeZ << 8) / var16;
                            var5.maxDeltaZ = (var5.maxZ - eyeZ << 8) / var16;
                            activeOccluders[activeOccluderCount++] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "g", descriptor = "(III)Z")
    private boolean tileVisible(int arg0, int arg1, int arg2) {
        int var4 = this.levelTileOcclusionCycles[arg0][arg1][arg2];
        if (-cycle == var4) {
            return false;
        } else if (cycle == var4) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2], var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2], var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.levelTileOcclusionCycles[arg0][arg1][arg2] = cycle;
                return true;
            } else {
                this.levelTileOcclusionCycles[arg0][arg1][arg2] = -cycle;
                return false;
            }
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "h", descriptor = "(IIII)Z")
    private boolean wallVisible(int arg0, int arg1, int arg2, int arg3) {
        if (!this.tileVisible(arg0, arg1, arg2)) {
            return false;
        }
        int var5 = arg1 << 7;
        int var6 = arg2 << 7;
        int var7 = this.levelHeightmaps[arg0][arg1][arg2] - 1;
        int var8 = var7 - 120;
        int var9 = var7 - 230;
        int var10 = var7 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var5 > eyeX) {
                    if (!this.occluded(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.occluded(var5, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.occluded(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.occluded(var5, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.occluded(var5, var9, var6)) {
                    return false;
                }
                if (!this.occluded(var5, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var6 < eyeZ) {
                    if (!this.occluded(var5, var7, var6 + 128)) {
                        return false;
                    }
                    if (!this.occluded(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.occluded(var5, var8, var6 + 128)) {
                        return false;
                    }
                    if (!this.occluded(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.occluded(var5, var9, var6 + 128)) {
                    return false;
                }
                if (!this.occluded(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var5 < eyeX) {
                    if (!this.occluded(var5 + 128, var7, var6)) {
                        return false;
                    }
                    if (!this.occluded(var5 + 128, var7, var6 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.occluded(var5 + 128, var8, var6)) {
                        return false;
                    }
                    if (!this.occluded(var5 + 128, var8, var6 + 128)) {
                        return false;
                    }
                }
                if (!this.occluded(var5 + 128, var9, var6)) {
                    return false;
                }
                if (!this.occluded(var5 + 128, var9, var6 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var6 > eyeZ) {
                    if (!this.occluded(var5, var7, var6)) {
                        return false;
                    }
                    if (!this.occluded(var5 + 128, var7, var6)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.occluded(var5, var8, var6)) {
                        return false;
                    }
                    if (!this.occluded(var5 + 128, var8, var6)) {
                        return false;
                    }
                }
                if (!this.occluded(var5, var9, var6)) {
                    return false;
                }
                if (!this.occluded(var5 + 128, var9, var6)) {
                    return false;
                }
                return true;
            }
        }
        if (!this.occluded(var5 + 64, var10, var6 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return this.occluded(var5, var9, var6 + 128);
        } else if (arg3 == 32) {
            return this.occluded(var5 + 128, var9, var6 + 128);
        } else if (arg3 == 64) {
            return this.occluded(var5 + 128, var9, var6);
        } else if (arg3 == 128) {
            return this.occluded(var5, var9, var6);
        } else {
            System.out.println("Warning unsupported wall type");
            return true;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "i", descriptor = "(IIII)Z")
    private boolean visible(int arg0, int arg1, int arg2, int arg3) {
        if (this.tileVisible(arg0, arg1, arg2)) {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "a", descriptor = "(IIIIII)Z")
    private boolean locVisible(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var9 = arg1; var9 <= arg2; var9++) {
                for (int var15 = arg3; var15 <= arg4; var15++) {
                    if (this.levelTileOcclusionCycles[arg0][var9][var15] == -cycle) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = this.levelHeightmaps[arg0][arg1][arg3] - arg5;
            if (!this.occluded(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!this.occluded(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!this.occluded(var10, var12, var14)) {
                return false;
            } else if (this.occluded(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (this.tileVisible(arg0, arg1, arg3)) {
            int var7 = arg1 << 7;
            int var8 = arg3 << 7;
            return this.occluded(var7 + 1, this.levelHeightmaps[arg0][arg1][arg3] - arg5, var8 + 1) && this.occluded(var7 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.occluded(var7 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.occluded(var7 + 1, this.levelHeightmaps[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "NYFUGYQS", name = "h", descriptor = "(III)Z")
    private boolean occluded(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < activeOccluderCount; var4++) {
            Occlude var5 = activeOccluders[var4];
            if (var5.mode == 1) {
                int var6 = var5.minX - arg0;
                if (var6 > 0) {
                    int var7 = (var5.minDeltaZ * var6 >> 8) + var5.minZ;
                    int var8 = (var5.maxDeltaZ * var6 >> 8) + var5.maxZ;
                    int var9 = (var5.minDeltaY * var6 >> 8) + var5.minY;
                    int var10 = (var5.maxDeltaY * var6 >> 8) + var5.maxY;
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.mode == 2) {
                int var11 = arg0 - var5.minX;
                if (var11 > 0) {
                    int var12 = (var5.minDeltaZ * var11 >> 8) + var5.minZ;
                    int var13 = (var5.maxDeltaZ * var11 >> 8) + var5.maxZ;
                    int var14 = (var5.minDeltaY * var11 >> 8) + var5.minY;
                    int var15 = (var5.maxDeltaY * var11 >> 8) + var5.maxY;
                    if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
                        return true;
                    }
                }
            } else if (var5.mode == 3) {
                int var16 = var5.minZ - arg2;
                if (var16 > 0) {
                    int var17 = (var5.minDeltaX * var16 >> 8) + var5.minX;
                    int var18 = (var5.maxDeltaX * var16 >> 8) + var5.maxX;
                    int var19 = (var5.minDeltaY * var16 >> 8) + var5.minY;
                    int var20 = (var5.maxDeltaY * var16 >> 8) + var5.maxY;
                    if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
                        return true;
                    }
                }
            } else if (var5.mode == 4) {
                int var21 = arg2 - var5.minZ;
                if (var21 > 0) {
                    int var22 = (var5.minDeltaX * var21 >> 8) + var5.minX;
                    int var23 = (var5.maxDeltaX * var21 >> 8) + var5.maxX;
                    int var24 = (var5.minDeltaY * var21 >> 8) + var5.minY;
                    int var25 = (var5.maxDeltaY * var21 >> 8) + var5.maxY;
                    if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
                        return true;
                    }
                }
            } else if (var5.mode == 5) {
                int var26 = arg1 - var5.minY;
                if (var26 > 0) {
                    int var27 = (var5.minDeltaX * var26 >> 8) + var5.minX;
                    int var28 = (var5.maxDeltaX * var26 >> 8) + var5.maxX;
                    int var29 = (var5.minDeltaZ * var26 >> 8) + var5.minZ;
                    int var30 = (var5.maxDeltaZ * var26 >> 8) + var5.maxZ;
                    if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
