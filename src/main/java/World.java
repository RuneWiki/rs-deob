import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CRRWDRTI")
public class World {

    @OriginalMember(owner = "CRRWDRTI", name = "j", descriptor = "Z")
    private boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "CRRWDRTI", name = "u", descriptor = "Z")
    private boolean _flowObfuscator4 = false;

    @OriginalMember(owner = "CRRWDRTI", name = "B", descriptor = "I")
    private int _flowObfuscator6 = -53;

    @OriginalMember(owner = "CRRWDRTI", name = "x", descriptor = "I")
    private int maxTileX;

    @OriginalMember(owner = "CRRWDRTI", name = "y", descriptor = "I")
    private int maxTileZ;

    @OriginalMember(owner = "CRRWDRTI", name = "g", descriptor = "[[[I")
    private int[][][] levelHeightmap;

    @OriginalMember(owner = "CRRWDRTI", name = "A", descriptor = "[[[B")
    private byte[][][] levelTileFlags;

    @OriginalMember(owner = "CRRWDRTI", name = "t", descriptor = "[[[B")
    private byte[][][] levelTileUnderlayIds;

    @OriginalMember(owner = "CRRWDRTI", name = "h", descriptor = "[[[B")
    private byte[][][] levelTileOverlayIds;

    @OriginalMember(owner = "CRRWDRTI", name = "n", descriptor = "[[[B")
    private byte[][][] levelTileOverlayShape;

    @OriginalMember(owner = "CRRWDRTI", name = "z", descriptor = "[[[B")
    private byte[][][] levelTileOverlayRotation;

    @OriginalMember(owner = "CRRWDRTI", name = "m", descriptor = "[[[I")
    private int[][][] levelOccludemap;

    @OriginalMember(owner = "CRRWDRTI", name = "l", descriptor = "[[[B")
    private byte[][][] levelShademap;

    @OriginalMember(owner = "CRRWDRTI", name = "q", descriptor = "[[I")
    private int[][] levelLightmap;

    @OriginalMember(owner = "CRRWDRTI", name = "b", descriptor = "[I")
    private int[] blendChroma;

    @OriginalMember(owner = "CRRWDRTI", name = "c", descriptor = "[I")
    private int[] blendSaturation;

    @OriginalMember(owner = "CRRWDRTI", name = "d", descriptor = "[I")
    private int[] blendLightness;

    @OriginalMember(owner = "CRRWDRTI", name = "e", descriptor = "[I")
    private int[] blendLuminance;

    @OriginalMember(owner = "CRRWDRTI", name = "f", descriptor = "[I")
    private int[] blendMagnitude;

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "I")
    private static int randomHueOffset = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "CRRWDRTI", name = "k", descriptor = "I")
    private static int randomLightnessOffset = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "CRRWDRTI", name = "o", descriptor = "[I")
    private static final int[] WALL_DECORATION_ROTATION_FORWARD_X = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "CRRWDRTI", name = "p", descriptor = "I")
    private static int _flowObfuscator2 = 323;

    @OriginalMember(owner = "CRRWDRTI", name = "r", descriptor = "[I")
    private static final int[] ROTATION_WALL_CORNER_TYPE = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "CRRWDRTI", name = "v", descriptor = "[I")
    private static final int[] WALL_DECORATION_ROTATION_FORWARD_Z = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "CRRWDRTI", name = "w", descriptor = "I")
    public static int currentLevel = 99;

    @OriginalMember(owner = "CRRWDRTI", name = "C", descriptor = "Z")
    public static boolean lowMemory = true;

    @OriginalMember(owner = "CRRWDRTI", name = "D", descriptor = "[I")
    private static final int[] ROTATION_WALL_TYPE = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "CRRWDRTI", name = "E", descriptor = "I")
    private static int _flowObfuscator7 = -388;

    @OriginalMember(owner = "CRRWDRTI", name = "i", descriptor = "I")
    public static int levelBuilt;

    @OriginalMember(owner = "CRRWDRTI", name = "s", descriptor = "Z")
    private static boolean _flowObfuscator3;

    @OriginalMember(owner = "CRRWDRTI", name = "<init>", descriptor = "([[[BIII[[[I)V")
    public World(byte[][][] arg0, int arg1, int arg2, int arg3, int[][][] arg4) {
        currentLevel = 99;
        this.maxTileX = arg3;
        this.maxTileZ = arg2;
        while (arg1 >= 0) {
            _flowObfuscator7 = -320;
        }
        this.levelHeightmap = arg4;
        this.levelTileFlags = arg0;
        this.levelTileUnderlayIds = new byte[4][this.maxTileX][this.maxTileZ];
        this.levelTileOverlayIds = new byte[4][this.maxTileX][this.maxTileZ];
        this.levelTileOverlayShape = new byte[4][this.maxTileX][this.maxTileZ];
        this.levelTileOverlayRotation = new byte[4][this.maxTileX][this.maxTileZ];
        this.levelOccludemap = new int[4][this.maxTileX + 1][this.maxTileZ + 1];
        this.levelShademap = new byte[4][this.maxTileX + 1][this.maxTileZ + 1];
        this.levelLightmap = new int[this.maxTileX + 1][this.maxTileZ + 1];
        this.blendChroma = new int[this.maxTileZ];
        this.blendSaturation = new int[this.maxTileZ];
        this.blendLightness = new int[this.maxTileZ];
        this.blendLuminance = new int[this.maxTileZ];
        this.blendMagnitude = new int[this.maxTileZ];
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "(II)I")
    private static final int noise(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "([LFTPNODIB;LNYFUGYQS;I)V")
    public final void build(CollisionMap[] arg0, World3D arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.levelTileFlags[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.levelTileFlags[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].setBlocked(var111, 0, var110);
                        }
                    }
                }
            }
        }
        if (arg2 < 2 || arg2 > 2) {
            _flowObfuscator2 = 329;
        }
        randomHueOffset += (int) (Math.random() * 5.0D) - 2;
        if (randomHueOffset < -8) {
            randomHueOffset = -8;
        }
        if (randomHueOffset > 8) {
            randomHueOffset = 8;
        }
        randomLightnessOffset += (int) (Math.random() * 5.0D) - 2;
        if (randomLightnessOffset < -16) {
            randomLightnessOffset = -16;
        }
        if (randomLightnessOffset > 16) {
            randomLightnessOffset = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.levelShademap[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.maxTileZ - 1; var56++) {
                for (int var101 = 1; var101 < this.maxTileX - 1; var101++) {
                    int var102 = this.levelHeightmap[var5][var101 + 1][var56] - this.levelHeightmap[var5][var101 - 1][var56];
                    int var103 = this.levelHeightmap[var5][var101][var56 + 1] - this.levelHeightmap[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.levelLightmap[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.maxTileZ; var57++) {
                this.blendChroma[var57] = 0;
                this.blendSaturation[var57] = 0;
                this.blendLightness[var57] = 0;
                this.blendLuminance[var57] = 0;
                this.blendMagnitude[var57] = 0;
            }
            for (int var58 = -5; var58 < this.maxTileX + 5; var58++) {
                for (int var61 = 0; var61 < this.maxTileZ; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.maxTileX) {
                        int var96 = this.levelTileUnderlayIds[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            FloType var97 = FloType.instances[var96 - 1];
                            this.blendChroma[var61] += var97.chroma;
                            this.blendSaturation[var61] += var97.saturation;
                            this.blendLightness[var61] += var97.lightness;
                            this.blendLuminance[var61] += var97.luminance;
                            var10002 = this.blendMagnitude[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.maxTileX) {
                        int var99 = this.levelTileUnderlayIds[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.instances[var99 - 1];
                            this.blendChroma[var61] -= var100.chroma;
                            this.blendSaturation[var61] -= var100.saturation;
                            this.blendLightness[var61] -= var100.lightness;
                            this.blendLuminance[var61] -= var100.luminance;
                            var10002 = this.blendMagnitude[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.maxTileX - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.maxTileZ + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.maxTileZ) {
                            var62 += this.blendChroma[var68];
                            var63 += this.blendSaturation[var68];
                            var64 += this.blendLightness[var68];
                            var65 += this.blendLuminance[var68];
                            var66 += this.blendMagnitude[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.maxTileZ) {
                            var62 -= this.blendChroma[var69];
                            var63 -= this.blendSaturation[var69];
                            var64 -= this.blendLightness[var69];
                            var65 -= this.blendLuminance[var69];
                            var66 -= this.blendMagnitude[var69];
                        }
                        if (var67 >= 1 && var67 < this.maxTileZ - 1 && (!lowMemory || (this.levelTileFlags[0][var58][var67] & 0x2) != 0 || (this.levelTileFlags[var5][var58][var67] & 0x10) == 0 && this.getDrawLevel(var67, var5, var58, 0) == levelBuilt)) {
                            if (var5 < currentLevel) {
                                currentLevel = var5;
                            }
                            int var70 = this.levelTileUnderlayIds[var5][var58][var67] & 0xFF;
                            int var71 = this.levelTileOverlayIds[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.levelHeightmap[var5][var58][var67];
                                int var73 = this.levelHeightmap[var5][var58 + 1][var67];
                                int var74 = this.levelHeightmap[var5][var58 + 1][var67 + 1];
                                int var75 = this.levelHeightmap[var5][var58][var67 + 1];
                                int var76 = this.levelLightmap[var58][var67];
                                int var77 = this.levelLightmap[var58 + 1][var67];
                                int var78 = this.levelLightmap[var58 + 1][var67 + 1];
                                int var79 = this.levelLightmap[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.hsl24to16(var82, var83, var84);
                                    int var85 = randomHueOffset + var82 & 0xFF;
                                    int var86 = randomLightnessOffset + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.hsl24to16(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.levelTileOverlayShape[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !FloType.instances[var71 - 1].occlude) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.levelOccludemap[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.colourTable[mulHSL(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.setTile(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, mulHSL(var80, var76), mulHSL(var80, var77), mulHSL(var80, var78), mulHSL(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.levelTileOverlayShape[var5][var58][var67] + 1;
                                    byte var90 = this.levelTileOverlayRotation[var5][var58][var67];
                                    FloType var91 = FloType.instances[var71 - 1];
                                    int var92 = var91.texture;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.getAverageTextureRGB(var92, 12660);
                                        var94 = -1;
                                    } else if (var91.rgb == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.hsl24to16(var91.hue, var91.saturation, var91.lightness);
                                        var93 = Pix3D.colourTable[this.adjustLightness(var91.hsl, 96)];
                                    }
                                    arg1.setTile(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, mulHSL(var80, var76), mulHSL(var80, var77), mulHSL(var80, var78), mulHSL(var80, var79), this.adjustLightness(var94, var76), this.adjustLightness(var94, var77), this.adjustLightness(var94, var78), this.adjustLightness(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.maxTileZ - 1; var59++) {
                for (int var60 = 1; var60 < this.maxTileX - 1; var60++) {
                    arg1.setDrawLevel(var5, var60, var59, this.getDrawLevel(var59, var5, var60, 0));
                }
            }
        }
        arg1.buildModels(-10, (byte) 3, 64, -50, 768, -50);
        for (int var6 = 0; var6 < this.maxTileX; var6++) {
            for (int var47 = 0; var47 < this.maxTileZ; var47++) {
                if ((this.levelTileFlags[1][var6][var47] & 0x2) == 2) {
                    arg1.setBridge(var47, var6, -438);
                }
            }
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.maxTileZ; var12++) {
                    for (int var13 = 0; var13 <= this.maxTileX; var13++) {
                        if ((this.levelOccludemap[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.levelOccludemap[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.maxTileZ && (this.levelOccludemap[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label329: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.levelOccludemap[var16 - 1][var13][var18] & var7) == 0) {
                                        break label329;
                                    }
                                }
                                var16--;
                            }
                            label318: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.levelOccludemap[var17 + 1][var13][var19] & var7) == 0) {
                                        break label318;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.levelHeightmap[var17][var13][var14] - var21;
                                int var23 = this.levelHeightmap[var16][var13][var14];
                                World3D.addOccluder(var10, var13 * 128, var23, var13 * 128, var15 * 128 + 128, var22, this._flowObfuscator6, var14 * 128, 1);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.levelOccludemap[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.levelOccludemap[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.levelOccludemap[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.maxTileX && (this.levelOccludemap[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label382: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.levelOccludemap[var28 - 1][var30][var12] & var8) == 0) {
                                        break label382;
                                    }
                                }
                                var28--;
                            }
                            label371: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.levelOccludemap[var29 + 1][var31][var12] & var8) == 0) {
                                        break label371;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.levelHeightmap[var29][var26][var12] - var33;
                                int var35 = this.levelHeightmap[var28][var26][var12];
                                World3D.addOccluder(var10, var26 * 128, var35, var27 * 128 + 128, var12 * 128, var34, this._flowObfuscator6, var12 * 128, 2);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.levelOccludemap[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.levelOccludemap[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.levelOccludemap[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.maxTileZ && (this.levelOccludemap[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label435: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.levelOccludemap[var11][var38 - 1][var42] & var9) == 0) {
                                        break label435;
                                    }
                                }
                                var38--;
                            }
                            label424: while (var39 < this.maxTileX) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.levelOccludemap[var11][var39 + 1][var43] & var9) == 0) {
                                        break label424;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.levelHeightmap[var11][var38][var40];
                                World3D.addOccluder(var10, var38 * 128, var44, var39 * 128 + 128, var41 * 128 + 128, var44, this._flowObfuscator6, var40 * 128, 4);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.levelOccludemap[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "CRRWDRTI", name = "b", descriptor = "(II)I")
    private static final int perlinNoise(int arg0, int arg1) {
        int var2 = interpolatedNoise(arg0 + 45365, arg1 + 91923, 4) + (interpolatedNoise(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (interpolatedNoise(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "(BLMBMGIXGO;LGHOWLKWN;)V")
    public static final void prefetchLocs(byte arg0, Packet arg1, OnDemand arg2) {
        int var3 = -1;
        if (arg0 != -107) {
            _flowObfuscator3 = !_flowObfuscator3;
        }
        while (true) {
            int var4 = arg1.gsmarts();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            LocType var5 = LocType.get(var3);
            var5.prefetch(arg2, -235);
            while (true) {
                int var6 = arg1.gsmarts();
                if (var6 == 0) {
                    break;
                }
                arg1.g1();
            }
        }
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "(IIIII)V")
    public final void stitchHeightmap(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg0; var6 <= arg0 + arg1; var6++) {
            for (int var7 = arg4; var7 <= arg3 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.maxTileX && var6 >= 0 && var6 < this.maxTileZ) {
                    this.levelShademap[0][var7][var6] = 127;
                    if (arg4 == var7 && var7 > 0) {
                        this.levelHeightmap[0][var7][var6] = this.levelHeightmap[0][var7 - 1][var6];
                    }
                    if (arg3 + arg4 == var7 && var7 < this.maxTileX - 1) {
                        this.levelHeightmap[0][var7][var6] = this.levelHeightmap[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        this.levelHeightmap[0][var7][var6] = this.levelHeightmap[0][var7][var6 - 1];
                    }
                    if (arg0 + arg1 == var6 && var6 < this.maxTileZ - 1) {
                        this.levelHeightmap[0][var7][var6] = this.levelHeightmap[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg2 != 0) {
            _flowObfuscator7 = 284;
        }
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "(ILNYFUGYQS;LFTPNODIB;IIIIZI)V")
    private final void addLoc(int arg0, World3D arg1, CollisionMap arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (lowMemory && (this.levelTileFlags[0][arg5][arg0] & 0x2) == 0) {
            if ((this.levelTileFlags[arg4][arg5][arg0] & 0x10) != 0) {
                return;
            }
            if (this.getDrawLevel(arg0, arg4, arg5, 0) != levelBuilt) {
                return;
            }
        }
        if (arg4 < currentLevel) {
            currentLevel = arg4;
        }
        int var10 = this.levelHeightmap[arg4][arg5][arg0];
        int var11 = this.levelHeightmap[arg4][arg5 + 1][arg0];
        int var12 = this.levelHeightmap[arg4][arg5 + 1][arg0 + 1];
        int var13 = this.levelHeightmap[arg4][arg5][arg0 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.get(arg6);
        int var16 = (arg6 << 14) + (arg0 << 7) + arg5 + 1073741824;
        if (!var15.active) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg8 << 6) + arg3);
        if (arg7) {
            return;
        }
        if (arg3 == 22) {
            if (!lowMemory || var15.active || var15.forcedecor) {
                Entity var18;
                if (var15.anim == -1 && var15.multiloc == null) {
                    var18 = var15.getModel(22, arg8, var10, var11, var12, var13, -1);
                } else {
                    var18 = new LocEntity(arg6, arg8, 22, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                }
                arg1.addGroundDecoration(arg4, var14, arg0, 68, var18, var17, var16, arg5);
                if (var15.blockwalk && var15.active && arg2 != null) {
                    arg2.setBlocked(arg0, 0, arg5);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            Entity var38;
            if (var15.anim == -1 && var15.multiloc == null) {
                var38 = var15.getModel(10, arg8, var10, var11, var12, var13, -1);
            } else {
                var38 = new LocEntity(arg6, arg8, 10, var11, (byte) 7, var12, var10, var13, var15.anim, true);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg3 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg8 == 1 || arg8 == 3) {
                    var40 = var15.length;
                    var41 = var15.width;
                } else {
                    var40 = var15.width;
                    var41 = var15.length;
                }
                if (arg1.add(var16, var17, var14, var41, var38, var40, arg4, var39, (byte) 110, arg0, arg5) && var15.shadow) {
                    Model var42;
                    if (var38 instanceof Model) {
                        var42 = (Model) var38;
                    } else {
                        var42 = var15.getModel(10, arg8, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.radius / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.levelShademap[arg4][arg5 + var43][arg0 + var44]) {
                                    this.levelShademap[arg4][arg5 + var43][arg0 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.blockwalk && arg2 != null) {
                arg2.addLoc(var15.blockrange, _flowObfuscator2, var15.width, var15.length, arg5, arg0, arg8);
            }
        } else if (arg3 >= 12) {
            Entity var19;
            if (var15.anim == -1 && var15.multiloc == null) {
                var19 = var15.getModel(arg3, arg8, var10, var11, var12, var13, -1);
            } else {
                var19 = new LocEntity(arg6, arg8, arg3, var11, (byte) 7, var12, var10, var13, var15.anim, true);
            }
            arg1.add(var16, var17, var14, 1, var19, 1, arg4, 0, (byte) 110, arg0, arg5);
            if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
                this.levelOccludemap[arg4][arg5][arg0] |= 0x924;
            }
            if (var15.blockwalk && arg2 != null) {
                arg2.addLoc(var15.blockrange, _flowObfuscator2, var15.width, var15.length, arg5, arg0, arg8);
            }
        } else if (arg3 == 0) {
            Entity var20;
            if (var15.anim == -1 && var15.multiloc == null) {
                var20 = var15.getModel(0, arg8, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(arg6, arg8, 0, var11, (byte) 7, var12, var10, var13, var15.anim, true);
            }
            arg1.setWall(ROTATION_WALL_TYPE[arg8], var20, true, var16, arg0, var17, arg5, null, var14, 0, arg4);
            if (arg8 == 0) {
                if (var15.shadow) {
                    this.levelShademap[arg4][arg5][arg0] = 50;
                    this.levelShademap[arg4][arg5][arg0 + 1] = 50;
                }
                if (var15.occlude) {
                    this.levelOccludemap[arg4][arg5][arg0] |= 0x249;
                }
            } else if (arg8 == 1) {
                if (var15.shadow) {
                    this.levelShademap[arg4][arg5][arg0 + 1] = 50;
                    this.levelShademap[arg4][arg5 + 1][arg0 + 1] = 50;
                }
                if (var15.occlude) {
                    this.levelOccludemap[arg4][arg5][arg0 + 1] |= 0x492;
                }
            } else if (arg8 == 2) {
                if (var15.shadow) {
                    this.levelShademap[arg4][arg5 + 1][arg0] = 50;
                    this.levelShademap[arg4][arg5 + 1][arg0 + 1] = 50;
                }
                if (var15.occlude) {
                    this.levelOccludemap[arg4][arg5 + 1][arg0] |= 0x249;
                }
            } else if (arg8 == 3) {
                if (var15.shadow) {
                    this.levelShademap[arg4][arg5][arg0] = 50;
                    this.levelShademap[arg4][arg5 + 1][arg0] = 50;
                }
                if (var15.occlude) {
                    this.levelOccludemap[arg4][arg5][arg0] |= 0x492;
                }
            }
            if (var15.blockwalk && arg2 != null) {
                arg2.addWall(arg0, arg8, arg5, arg3, (byte) 1, var15.blockrange);
            }
            if (var15.wallwidth != 16) {
                arg1.setWallDecorationOffset(arg0, 441, var15.wallwidth, arg5, arg4);
            }
        } else if (arg3 == 1) {
            Entity var21;
            if (var15.anim == -1 && var15.multiloc == null) {
                var21 = var15.getModel(1, arg8, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(arg6, arg8, 1, var11, (byte) 7, var12, var10, var13, var15.anim, true);
            }
            arg1.setWall(ROTATION_WALL_CORNER_TYPE[arg8], var21, true, var16, arg0, var17, arg5, null, var14, 0, arg4);
            if (var15.shadow) {
                if (arg8 == 0) {
                    this.levelShademap[arg4][arg5][arg0 + 1] = 50;
                } else if (arg8 == 1) {
                    this.levelShademap[arg4][arg5 + 1][arg0 + 1] = 50;
                } else if (arg8 == 2) {
                    this.levelShademap[arg4][arg5 + 1][arg0] = 50;
                } else if (arg8 == 3) {
                    this.levelShademap[arg4][arg5][arg0] = 50;
                }
            }
            if (var15.blockwalk && arg2 != null) {
                arg2.addWall(arg0, arg8, arg5, arg3, (byte) 1, var15.blockrange);
            }
        } else if (arg3 == 2) {
            int var22 = arg8 + 1 & 0x3;
            Entity var23;
            Entity var24;
            if (var15.anim == -1 && var15.multiloc == null) {
                var23 = var15.getModel(2, arg8 + 4, var10, var11, var12, var13, -1);
                var24 = var15.getModel(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new LocEntity(arg6, arg8 + 4, 2, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                var24 = new LocEntity(arg6, var22, 2, var11, (byte) 7, var12, var10, var13, var15.anim, true);
            }
            arg1.setWall(ROTATION_WALL_TYPE[arg8], var23, true, var16, arg0, var17, arg5, var24, var14, ROTATION_WALL_TYPE[var22], arg4);
            if (var15.occlude) {
                if (arg8 == 0) {
                    this.levelOccludemap[arg4][arg5][arg0] |= 0x249;
                    this.levelOccludemap[arg4][arg5][arg0 + 1] |= 0x492;
                } else if (arg8 == 1) {
                    this.levelOccludemap[arg4][arg5][arg0 + 1] |= 0x492;
                    this.levelOccludemap[arg4][arg5 + 1][arg0] |= 0x249;
                } else if (arg8 == 2) {
                    this.levelOccludemap[arg4][arg5 + 1][arg0] |= 0x249;
                    this.levelOccludemap[arg4][arg5][arg0] |= 0x492;
                } else if (arg8 == 3) {
                    this.levelOccludemap[arg4][arg5][arg0] |= 0x492;
                    this.levelOccludemap[arg4][arg5][arg0] |= 0x249;
                }
            }
            if (var15.blockwalk && arg2 != null) {
                arg2.addWall(arg0, arg8, arg5, arg3, (byte) 1, var15.blockrange);
            }
            if (var15.wallwidth != 16) {
                arg1.setWallDecorationOffset(arg0, 441, var15.wallwidth, arg5, arg4);
            }
        } else if (arg3 == 3) {
            Entity var25;
            if (var15.anim == -1 && var15.multiloc == null) {
                var25 = var15.getModel(3, arg8, var10, var11, var12, var13, -1);
            } else {
                var25 = new LocEntity(arg6, arg8, 3, var11, (byte) 7, var12, var10, var13, var15.anim, true);
            }
            arg1.setWall(ROTATION_WALL_CORNER_TYPE[arg8], var25, true, var16, arg0, var17, arg5, null, var14, 0, arg4);
            if (var15.shadow) {
                if (arg8 == 0) {
                    this.levelShademap[arg4][arg5][arg0 + 1] = 50;
                } else if (arg8 == 1) {
                    this.levelShademap[arg4][arg5 + 1][arg0 + 1] = 50;
                } else if (arg8 == 2) {
                    this.levelShademap[arg4][arg5 + 1][arg0] = 50;
                } else if (arg8 == 3) {
                    this.levelShademap[arg4][arg5][arg0] = 50;
                }
            }
            if (var15.blockwalk && arg2 != null) {
                arg2.addWall(arg0, arg8, arg5, arg3, (byte) 1, var15.blockrange);
            }
        } else if (arg3 == 9) {
            Entity var26;
            if (var15.anim == -1 && var15.multiloc == null) {
                var26 = var15.getModel(arg3, arg8, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(arg6, arg8, arg3, var11, (byte) 7, var12, var10, var13, var15.anim, true);
            }
            arg1.add(var16, var17, var14, 1, var26, 1, arg4, 0, (byte) 110, arg0, arg5);
            if (var15.blockwalk && arg2 != null) {
                arg2.addLoc(var15.blockrange, _flowObfuscator2, var15.width, var15.length, arg5, arg0, arg8);
            }
        } else {
            if (var15.hillskew) {
                if (arg8 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg8 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg8 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg3 == 4) {
                Entity var31;
                if (var15.anim == -1 && var15.multiloc == null) {
                    var31 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new LocEntity(arg6, 0, 4, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                }
                arg1.setWallDecoration(var16, arg0, arg8 * 512, -460, arg4, 0, var14, var31, arg5, var17, 0, ROTATION_WALL_TYPE[arg8]);
            } else if (arg3 == 5) {
                int var32 = 16;
                int var33 = arg1.getWallBitset(arg4, arg5, arg0);
                if (var33 > 0) {
                    var32 = LocType.get(var33 >> 14 & 0x7FFF).wallwidth;
                }
                Entity var34;
                if (var15.anim == -1 && var15.multiloc == null) {
                    var34 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new LocEntity(arg6, 0, 4, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                }
                arg1.setWallDecoration(var16, arg0, arg8 * 512, -460, arg4, WALL_DECORATION_ROTATION_FORWARD_X[arg8] * var32, var14, var34, arg5, var17, WALL_DECORATION_ROTATION_FORWARD_Z[arg8] * var32, ROTATION_WALL_TYPE[arg8]);
            } else if (arg3 == 6) {
                Entity var35;
                if (var15.anim == -1 && var15.multiloc == null) {
                    var35 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new LocEntity(arg6, 0, 4, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                }
                arg1.setWallDecoration(var16, arg0, arg8, -460, arg4, 0, var14, var35, arg5, var17, 0, 256);
            } else if (arg3 == 7) {
                Entity var36;
                if (var15.anim == -1 && var15.multiloc == null) {
                    var36 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new LocEntity(arg6, 0, 4, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                }
                arg1.setWallDecoration(var16, arg0, arg8, -460, arg4, 0, var14, var36, arg5, var17, 0, 512);
            } else if (arg3 == 8) {
                Entity var37;
                if (var15.anim == -1 && var15.multiloc == null) {
                    var37 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new LocEntity(arg6, 0, 4, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                }
                arg1.setWallDecoration(var16, arg0, arg8, -460, arg4, 0, var14, var37, arg5, var17, 0, 768);
            }
        }
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "(III)I")
    private static final int interpolatedNoise(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = smoothNoise(var3, var5);
        int var8 = smoothNoise(var3 + 1, var5);
        int var9 = smoothNoise(var3, var5 + 1);
        int var10 = smoothNoise(var3 + 1, var5 + 1);
        int var11 = interpolate(var7, var8, var4, arg2);
        int var12 = interpolate(var9, var10, var4, arg2);
        return interpolate(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "CRRWDRTI", name = "b", descriptor = "(III)I")
    private final int hsl24to16(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @OriginalMember(owner = "CRRWDRTI", name = "c", descriptor = "(III)Z")
    public static final boolean isLocReady(int arg0, int arg1, int arg2) {
        LocType var3 = LocType.get(arg0);
        if (arg2 != 8) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.validate(arg1, true);
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "(II[LFTPNODIB;III[BIII)V")
    public final void loadGroundRegion(int arg0, int arg1, CollisionMap[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var17 = 0; var17 < 8; var17++) {
                if (arg4 + var11 > 0 && arg4 + var11 < 103 && arg9 + var17 > 0 && arg9 + var17 < 103) {
                    arg2[arg8].flags[arg4 + var11][arg9 + var17] &= 0xFEFFFFFF;
                }
            }
        }
        if (arg3 < 9 || arg3 > 9) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        Packet var13 = new Packet(arg6, 891);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg0 == var14 && var15 >= arg5 && var15 < arg5 + 8 && var16 >= arg7 && var16 < arg7 + 8) {
                        this.loadGroundSquare(arg9 + WorldRegion.rotateZ(var16 & 0x7, arg1, -383, var15 & 0x7), 0, var13, arg4 + WorldRegion.rotateX(arg1, var16 & 0x7, var15 & 0x7, false), arg8, arg1, 942, 0);
                    } else {
                        this.loadGroundSquare(-1, 0, var13, -1, 0, 0, 942, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "([BIIIIB[LFTPNODIB;)V")
    public final void loadGround(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, CollisionMap[] arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg2 + var13 > 0 && arg2 + var13 < 103 && arg1 + var14 > 0 && arg1 + var14 < 103) {
                        arg6[var8].flags[arg2 + var13][arg1 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        Packet var9 = new Packet(arg0, 891);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.loadGroundSquare(arg1 + var12, arg4, var9, arg2 + var11, var10, 0, 942, arg3);
                }
            }
        }
        if (arg5 != 4) {
            this._flowObfuscator4 = !this._flowObfuscator4;
        }
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "(IILMBMGIXGO;IIIII)V")
    private final void loadGroundSquare(int arg0, int arg1, Packet arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 36 / arg6;
        if (arg3 < 0 || arg3 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var12 = arg2.g1();
                if (var12 == 0) {
                    return;
                }
                if (var12 == 1) {
                    arg2.g1();
                    return;
                }
                if (var12 <= 49) {
                    arg2.g1();
                }
            }
        }
        this.levelTileFlags[arg4][arg3][arg0] = 0;
        while (true) {
            int var10 = arg2.g1();
            if (var10 == 0) {
                if (arg4 == 0) {
                    this.levelHeightmap[0][arg3][arg0] = -perlinNoise(arg3 + arg7 + 932731, arg0 + 556238 + arg1) * 8;
                    return;
                } else {
                    this.levelHeightmap[arg4][arg3][arg0] = this.levelHeightmap[arg4 - 1][arg3][arg0] - 240;
                    return;
                }
            }
            if (var10 == 1) {
                int var11 = arg2.g1();
                if (var11 == 1) {
                    var11 = 0;
                }
                if (arg4 == 0) {
                    this.levelHeightmap[0][arg3][arg0] = -var11 * 8;
                    return;
                }
                this.levelHeightmap[arg4][arg3][arg0] = this.levelHeightmap[arg4 - 1][arg3][arg0] - var11 * 8;
                return;
            }
            if (var10 <= 49) {
                this.levelTileOverlayIds[arg4][arg3][arg0] = arg2.g1b();
                this.levelTileOverlayShape[arg4][arg3][arg0] = (byte) ((var10 - 2) / 4);
                this.levelTileOverlayRotation[arg4][arg3][arg0] = (byte) (var10 + arg5 - 2 & 0x3);
            } else if (var10 <= 81) {
                this.levelTileFlags[arg4][arg3][arg0] = (byte) (var10 - 49);
            } else {
                this.levelTileUnderlayIds[arg4][arg3][arg0] = (byte) (var10 - 81);
            }
        }
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "(IIII)I")
    public int getDrawLevel(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return 2;
        } else if ((this.levelTileFlags[arg1][arg2][arg0] & 0x8) == 0) {
            return arg1 <= 0 || (this.levelTileFlags[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "([LFTPNODIB;LNYFUGYQS;IIIZI[BIII)V")
    public final void loadLocationsRegion(CollisionMap[] arg0, World3D arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        Packet var12 = new Packet(arg7, 891);
        int var13 = -1;
        if (!arg5) {
            this._flowObfuscator4 = !this._flowObfuscator4;
        }
        while (true) {
            int var14 = var12.gsmarts();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.gsmarts();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.g1();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg2 == var19 && var18 >= arg8 && var18 < arg8 + 8 && var17 >= arg4 && var17 < arg4 + 8) {
                    LocType var23 = LocType.get(var13);
                    int var24 = arg3 + WorldRegion.rotateLocX(arg9, var23.length, var18 & 0x7, (byte) 113, var17 & 0x7, var23.width);
                    int var25 = arg10 + WorldRegion.rotateLocZ(-433, var17 & 0x7, var23.length, arg9, var23.width, var18 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = var19;
                        if ((this.levelTileFlags[1][var24][var25] & 0x2) == 2) {
                            var26 = var19 - 1;
                        }
                        CollisionMap var27 = null;
                        if (var26 >= 0) {
                            var27 = arg0[var26];
                        }
                        this.addLoc(var25, arg1, var27, var21, arg6, var24, var13, false, arg9 + var22 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "CRRWDRTI", name = "b", descriptor = "(IIII)I")
    private static final int interpolate(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - Pix3D.cosTable[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "CRRWDRTI", name = "c", descriptor = "(II)I")
    private final int adjustLightness(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "CRRWDRTI", name = "d", descriptor = "(II)I")
    private static final int smoothNoise(int arg0, int arg1) {
        int var2 = noise(arg0 - 1, arg1 - 1) + noise(arg0 + 1, arg1 - 1) + noise(arg0 - 1, arg1 + 1) + noise(arg0 + 1, arg1 + 1);
        int var3 = noise(arg0 - 1, arg1) + noise(arg0 + 1, arg1) + noise(arg0, arg1 - 1) + noise(arg0, arg1 + 1);
        int var4 = noise(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "CRRWDRTI", name = "e", descriptor = "(II)I")
    private static final int mulHSL(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "(LNYFUGYQS;IIIILFTPNODIB;[[[IIIIB)V")
    public static final void addLoc(World3D arg0, int arg1, int arg2, int arg3, int arg4, CollisionMap arg5, int[][][] arg6, int arg7, int arg8, int arg9, byte arg10) {
        int var11 = arg6[arg4][arg7][arg2];
        int var12 = arg6[arg4][arg7 + 1][arg2];
        int var13 = arg6[arg4][arg7 + 1][arg2 + 1];
        int var14 = arg6[arg4][arg7][arg2 + 1];
        if (arg10 != 93) {
            _flowObfuscator7 = -145;
        }
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.get(arg8);
        int var17 = (arg8 << 14) + (arg2 << 7) + arg7 + 1073741824;
        if (!var16.active) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg1 << 6) + arg3);
        if (arg3 == 22) {
            Entity var19;
            if (var16.anim == -1 && var16.multiloc == null) {
                var19 = var16.getModel(22, arg1, var11, var12, var13, var14, -1);
            } else {
                var19 = new LocEntity(arg8, arg1, 22, var12, (byte) 7, var13, var11, var14, var16.anim, true);
            }
            arg0.addGroundDecoration(arg9, var15, arg2, 68, var19, var18, var17, arg7);
            if (var16.blockwalk && var16.active) {
                arg5.setBlocked(arg2, 0, arg7);
            }
        } else if (arg3 == 10 || arg3 == 11) {
            Entity var39;
            if (var16.anim == -1 && var16.multiloc == null) {
                var39 = var16.getModel(10, arg1, var11, var12, var13, var14, -1);
            } else {
                var39 = new LocEntity(arg8, arg1, 10, var12, (byte) 7, var13, var11, var14, var16.anim, true);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg3 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg1 == 1 || arg1 == 3) {
                    var41 = var16.length;
                    var42 = var16.width;
                } else {
                    var41 = var16.width;
                    var42 = var16.length;
                }
                arg0.add(var17, var18, var15, var42, var39, var41, arg9, var40, (byte) 110, arg2, arg7);
            }
            if (var16.blockwalk) {
                arg5.addLoc(var16.blockrange, _flowObfuscator2, var16.width, var16.length, arg7, arg2, arg1);
            }
        } else if (arg3 >= 12) {
            Entity var20;
            if (var16.anim == -1 && var16.multiloc == null) {
                var20 = var16.getModel(arg3, arg1, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(arg8, arg1, arg3, var12, (byte) 7, var13, var11, var14, var16.anim, true);
            }
            arg0.add(var17, var18, var15, 1, var20, 1, arg9, 0, (byte) 110, arg2, arg7);
            if (var16.blockwalk) {
                arg5.addLoc(var16.blockrange, _flowObfuscator2, var16.width, var16.length, arg7, arg2, arg1);
            }
        } else if (arg3 == 0) {
            Entity var21;
            if (var16.anim == -1 && var16.multiloc == null) {
                var21 = var16.getModel(0, arg1, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(arg8, arg1, 0, var12, (byte) 7, var13, var11, var14, var16.anim, true);
            }
            arg0.setWall(ROTATION_WALL_TYPE[arg1], var21, true, var17, arg2, var18, arg7, null, var15, 0, arg9);
            if (var16.blockwalk) {
                arg5.addWall(arg2, arg1, arg7, arg3, (byte) 1, var16.blockrange);
            }
        } else if (arg3 == 1) {
            Entity var22;
            if (var16.anim == -1 && var16.multiloc == null) {
                var22 = var16.getModel(1, arg1, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(arg8, arg1, 1, var12, (byte) 7, var13, var11, var14, var16.anim, true);
            }
            arg0.setWall(ROTATION_WALL_CORNER_TYPE[arg1], var22, true, var17, arg2, var18, arg7, null, var15, 0, arg9);
            if (var16.blockwalk) {
                arg5.addWall(arg2, arg1, arg7, arg3, (byte) 1, var16.blockrange);
            }
        } else if (arg3 == 2) {
            int var23 = arg1 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.anim == -1 && var16.multiloc == null) {
                var24 = var16.getModel(2, arg1 + 4, var11, var12, var13, var14, -1);
                var25 = var16.getModel(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new LocEntity(arg8, arg1 + 4, 2, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                var25 = new LocEntity(arg8, var23, 2, var12, (byte) 7, var13, var11, var14, var16.anim, true);
            }
            arg0.setWall(ROTATION_WALL_TYPE[arg1], var24, true, var17, arg2, var18, arg7, var25, var15, ROTATION_WALL_TYPE[var23], arg9);
            if (var16.blockwalk) {
                arg5.addWall(arg2, arg1, arg7, arg3, (byte) 1, var16.blockrange);
            }
        } else if (arg3 == 3) {
            Entity var26;
            if (var16.anim == -1 && var16.multiloc == null) {
                var26 = var16.getModel(3, arg1, var11, var12, var13, var14, -1);
            } else {
                var26 = new LocEntity(arg8, arg1, 3, var12, (byte) 7, var13, var11, var14, var16.anim, true);
            }
            arg0.setWall(ROTATION_WALL_CORNER_TYPE[arg1], var26, true, var17, arg2, var18, arg7, null, var15, 0, arg9);
            if (var16.blockwalk) {
                arg5.addWall(arg2, arg1, arg7, arg3, (byte) 1, var16.blockrange);
            }
        } else if (arg3 == 9) {
            Entity var27;
            if (var16.anim == -1 && var16.multiloc == null) {
                var27 = var16.getModel(arg3, arg1, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(arg8, arg1, arg3, var12, (byte) 7, var13, var11, var14, var16.anim, true);
            }
            arg0.add(var17, var18, var15, 1, var27, 1, arg9, 0, (byte) 110, arg2, arg7);
            if (var16.blockwalk) {
                arg5.addLoc(var16.blockrange, _flowObfuscator2, var16.width, var16.length, arg7, arg2, arg1);
            }
        } else {
            if (var16.hillskew) {
                if (arg1 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg1 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg1 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg3 == 4) {
                Entity var32;
                if (var16.anim == -1 && var16.multiloc == null) {
                    var32 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new LocEntity(arg8, 0, 4, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                }
                arg0.setWallDecoration(var17, arg2, arg1 * 512, -460, arg9, 0, var15, var32, arg7, var18, 0, ROTATION_WALL_TYPE[arg1]);
            } else if (arg3 == 5) {
                int var33 = 16;
                int var34 = arg0.getWallBitset(arg9, arg7, arg2);
                if (var34 > 0) {
                    var33 = LocType.get(var34 >> 14 & 0x7FFF).wallwidth;
                }
                Entity var35;
                if (var16.anim == -1 && var16.multiloc == null) {
                    var35 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new LocEntity(arg8, 0, 4, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                }
                arg0.setWallDecoration(var17, arg2, arg1 * 512, -460, arg9, WALL_DECORATION_ROTATION_FORWARD_X[arg1] * var33, var15, var35, arg7, var18, WALL_DECORATION_ROTATION_FORWARD_Z[arg1] * var33, ROTATION_WALL_TYPE[arg1]);
            } else if (arg3 == 6) {
                Entity var36;
                if (var16.anim == -1 && var16.multiloc == null) {
                    var36 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new LocEntity(arg8, 0, 4, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                }
                arg0.setWallDecoration(var17, arg2, arg1, -460, arg9, 0, var15, var36, arg7, var18, 0, 256);
            } else if (arg3 == 7) {
                Entity var37;
                if (var16.anim == -1 && var16.multiloc == null) {
                    var37 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new LocEntity(arg8, 0, 4, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                }
                arg0.setWallDecoration(var17, arg2, arg1, -460, arg9, 0, var15, var37, arg7, var18, 0, 512);
            } else if (arg3 == 8) {
                Entity var38;
                if (var16.anim == -1 && var16.multiloc == null) {
                    var38 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new LocEntity(arg8, 0, 4, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                }
                arg0.setWallDecoration(var17, arg2, arg1, -460, arg9, 0, var15, var38, arg7, var18, 0, 768);
            }
        }
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "(I[BII)Z")
    public static final boolean validateLocs(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 < 6 || arg3 > 6) {
            throw new NullPointerException();
        }
        boolean var4 = true;
        Packet var5 = new Packet(arg1, 891);
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.gsmarts();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.gsmarts();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.g1() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.get(var6);
                        if (var14 != 22 || !lowMemory || var17.active || var17.forcedecor) {
                            var4 &= var17.validate(true);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.gsmarts();
                if (var10 == 0) {
                    break;
                }
                var5.g1();
            }
        }
    }

    @OriginalMember(owner = "CRRWDRTI", name = "a", descriptor = "(I[LFTPNODIB;IILNYFUGYQS;[B)V")
    public final void loadLocations(int arg0, CollisionMap[] arg1, int arg2, int arg3, World3D arg4, byte[] arg5) {
        if (arg3 < 7 || arg3 > 7) {
            return;
        }
        Packet var7 = new Packet(arg5, 891);
        int var8 = -1;
        while (true) {
            int var9 = var7.gsmarts();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.gsmarts();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.g1();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg0 + var13;
                int var19 = arg2 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.levelTileFlags[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    CollisionMap var21 = null;
                    if (var20 >= 0) {
                        var21 = arg1[var20];
                    }
                    this.addLoc(var19, arg4, var21, var16, var14, var18, var8, false, var17);
                }
            }
        }
    }
}
