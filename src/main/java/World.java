import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "c", descriptor = "B")
    private byte field34 = 80;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "c", name = "h", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "c", name = "i", descriptor = "[[[I")
    private int[][][] field40;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[B")
    private byte[][][] field41;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field42;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field43;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field44;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field45;

    @OriginalMember(owner = "c", name = "v", descriptor = "[[[I")
    private int[][][] field53;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field46;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[I")
    private int[][] field47;

    @OriginalMember(owner = "c", name = "q", descriptor = "[I")
    private int[] field48;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field49;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field50;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field51;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field52;

    @OriginalMember(owner = "c", name = "d", descriptor = "Z")
    public static boolean field35 = true;

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private static final int[] field54 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field55 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field56 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field57 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "a", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "c", name = "e", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "c", name = "b", descriptor = "Z")
    private static boolean field33;

    @OriginalMember(owner = "c", name = "f", descriptor = "Z")
    public static boolean field37;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "([[[BII[[[II)V")
    public World(byte[][][] arg0, int arg1, int arg2, int[][][] arg3, int arg4) {
        this.field38 = arg1;
        this.field39 = arg2;
        int var6 = 89 / arg4;
        this.field40 = arg3;
        this.field41 = arg0;
        this.field42 = new byte[4][this.field38][this.field39];
        this.field43 = new byte[4][this.field38][this.field39];
        this.field44 = new byte[4][this.field38][this.field39];
        this.field45 = new byte[4][this.field38][this.field39];
        this.field53 = new int[4][this.field38 + 1][this.field39 + 1];
        this.field46 = new byte[4][this.field38 + 1][this.field39 + 1];
        this.field47 = new int[this.field38 + 1][this.field39 + 1];
        this.field48 = new int[this.field39];
        this.field49 = new int[this.field39];
        this.field50 = new int[this.field39];
        this.field51 = new int[this.field39];
        this.field52 = new int[this.field39];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII)V")
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 88 / arg0;
        byte var7 = 0;
        for (int var8 = 0; var8 < FloType.field850; var8++) {
            if (FloType.field851[var8].field856.equalsIgnoreCase("water")) {
                var7 = (byte) (var8 + 1);
                break;
            }
        }
        for (int var9 = arg1; var9 < arg1 + arg2; var9++) {
            for (int var10 = arg3; var10 < arg3 + arg4; var10++) {
                if (var10 >= 0 && var10 < this.field38 && var9 >= 0 && var9 < this.field39) {
                    this.field43[0][var10][var9] = var7;
                    for (int var11 = 0; var11 < 4; var11++) {
                        this.field40[var11][var10][var9] = 0;
                        this.field41[var11][var10][var9] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII[BI)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        Packet var7 = new Packet(arg4, 4);
        if (arg1 >= 0) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg5 + var9;
                    int var12 = arg0 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field41[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method201();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field40[0][var11][var12] = -method19(var11 + arg2 + 932731, var12 + 556238 + arg3) * 8;
                                } else {
                                    this.field40[var8][var11][var12] = this.field40[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method201();
                                if (var14 == 1) {
                                    var14 = 0;
                                }
                                if (var8 == 0) {
                                    this.field40[0][var11][var12] = -var14 * 8;
                                } else {
                                    this.field40[var8][var11][var12] = this.field40[var8 - 1][var11][var12] - var14 * 8;
                                }
                                break;
                            }
                            if (var13 <= 49) {
                                this.field43[var8][var11][var12] = var7.method202();
                                this.field44[var8][var11][var12] = (byte) ((var13 - 2) / 4);
                                this.field45[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
                            } else if (var13 <= 81) {
                                this.field41[var8][var11][var12] = (byte) (var13 - 49);
                            } else {
                                this.field42[var8][var11][var12] = (byte) (var13 - 81);
                            }
                        }
                    } else {
                        while (true) {
                            int var15 = var7.method201();
                            if (var15 == 0) {
                                break;
                            }
                            if (var15 == 1) {
                                var7.method201();
                                break;
                            }
                            if (var15 <= 49) {
                                var7.method201();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([BBLr;[Lbc;IILob;)V")
    public final void method16(byte[] arg0, byte arg1, World3D arg2, CollisionMap[] arg3, int arg4, int arg5, LinkList arg6) {
        Packet var8 = new Packet(arg0, 4);
        if (arg1 != 4) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = -1;
        while (true) {
            int var11 = var8.method215();
            if (var11 == 0) {
                return;
            }
            var10 += var11;
            int var12 = 0;
            while (true) {
                int var13 = var8.method215();
                if (var13 == 0) {
                    break;
                }
                var12 += var13 - 1;
                int var14 = var12 & 0x3F;
                int var15 = var12 >> 6 & 0x3F;
                int var16 = var12 >> 12;
                int var17 = var8.method201();
                int var18 = var17 >> 2;
                int var19 = var17 & 0x3;
                int var20 = arg5 + var15;
                int var21 = arg4 + var14;
                if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                    this.method17(var10, var19, var21, var18, this.field32, arg3[var16], var20, var16, arg6, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIIILbc;IILob;Lr;)V")
    private final void method17(int arg0, int arg1, int arg2, int arg3, int arg4, CollisionMap arg5, int arg6, int arg7, LinkList arg8, World3D arg9) {
        if (field35) {
            int var11 = arg7;
            if (arg7 > 0 && (this.field41[1][arg6][arg2] & 0x2) != 0) {
                var11 = arg7 - 1;
            }
            if ((this.field41[arg7][arg6][arg2] & 0x8) != 0) {
                var11 = 0;
            }
            if (field36 != var11) {
                return;
            }
            if ((this.field41[arg7][arg6][arg2] & 0x10) != 0) {
                return;
            }
        }
        int var12 = this.field40[arg7][arg6][arg2];
        int var13 = this.field40[arg7][arg6 + 1][arg2];
        int var14 = this.field40[arg7][arg6 + 1][arg2 + 1];
        int var15 = this.field40[arg7][arg6][arg2 + 1];
        if (arg4 != 0) {
            return;
        }
        int var16 = var12 + var13 + var14 + var15 >> 2;
        LocType var17 = LocType.method253(arg0);
        int var18 = (arg0 << 14) + (arg2 << 7) + arg6 + 1073741824;
        if (!var17.field749) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg1 << 6) + arg3);
        if (arg3 == 22) {
            if (!field35 || var17.field749 || var17.field770) {
                Model var20 = var17.method256(22, arg1, var12, var13, var14, var15, -1);
                arg9.method56(var18, arg2, var19, var20, arg6, var16, true, arg7);
                if (var17.field747 && var17.field749) {
                    arg5.method275(2, arg2, arg6);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            Model var36 = var17.method256(10, arg1, var12, var13, var14, var15, -1);
            if (var36 != null) {
                int var37 = 0;
                if (arg3 == 11) {
                    var37 += 256;
                }
                int var38;
                int var39;
                if (arg1 == 1 || arg1 == 3) {
                    var38 = var17.field746;
                    var39 = var17.field745;
                } else {
                    var38 = var17.field745;
                    var39 = var17.field746;
                }
                if (arg9.method60(var36, var19, null, var16, arg6, var39, var38, arg7, var18, arg2, 0, var37) && var17.field762) {
                    for (int var40 = 0; var40 <= var38; var40++) {
                        for (int var41 = 0; var41 <= var39; var41++) {
                            int var42 = var36.field460 / 4;
                            if (var42 > 30) {
                                var42 = 30;
                            }
                            if (var42 > this.field46[arg7][arg6 + var40][arg2 + var41]) {
                                this.field46[arg7][arg6 + var40][arg2 + var41] = (byte) var42;
                            }
                        }
                    }
                }
            }
            if (var17.field747) {
                arg5.method274(arg6, var17.field746, var17.field748, var17.field745, -532, arg2, arg1);
            }
            if (var17.field753 != -1) {
                arg8.method217(new LocEntity(2, -69, arg7, arg0, true, SeqType.field938[var17.field753], arg2, arg6));
            }
        } else if (arg3 >= 12) {
            Model var21 = var17.method256(arg3, arg1, var12, var13, var14, var15, -1);
            arg9.method60(var21, var19, null, var16, arg6, 1, 1, arg7, var18, arg2, 0, 0);
            if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg7 > 0) {
                this.field53[arg7][arg6][arg2] |= 0x924;
            }
            if (var17.field747) {
                arg5.method274(arg6, var17.field746, var17.field748, var17.field745, -532, arg2, arg1);
            }
            if (var17.field753 != -1) {
                arg8.method217(new LocEntity(2, -69, arg7, arg0, true, SeqType.field938[var17.field753], arg2, arg6));
            }
        } else if (arg3 == 0) {
            Model var22 = var17.method256(0, arg1, var12, var13, var14, var15, -1);
            arg9.method58(431, var18, 0, var16, var22, arg2, arg6, null, var19, field54[arg1], arg7);
            if (arg1 == 0) {
                if (var17.field762) {
                    this.field46[arg7][arg6][arg2] = 50;
                    this.field46[arg7][arg6][arg2 + 1] = 50;
                }
                if (var17.field752) {
                    this.field53[arg7][arg6][arg2] |= 0x249;
                }
            } else if (arg1 == 1) {
                if (var17.field762) {
                    this.field46[arg7][arg6][arg2 + 1] = 50;
                    this.field46[arg7][arg6 + 1][arg2 + 1] = 50;
                }
                if (var17.field752) {
                    this.field53[arg7][arg6][arg2 + 1] |= 0x492;
                }
            } else if (arg1 == 2) {
                if (var17.field762) {
                    this.field46[arg7][arg6 + 1][arg2] = 50;
                    this.field46[arg7][arg6 + 1][arg2 + 1] = 50;
                }
                if (var17.field752) {
                    this.field53[arg7][arg6 + 1][arg2] |= 0x249;
                }
            } else if (arg1 == 3) {
                if (var17.field762) {
                    this.field46[arg7][arg6][arg2] = 50;
                    this.field46[arg7][arg6 + 1][arg2] = 50;
                }
                if (var17.field752) {
                    this.field53[arg7][arg6][arg2] |= 0x492;
                }
            }
            if (var17.field747) {
                arg5.method273(arg3, arg2, arg1, arg6, 757, var17.field748);
            }
            if (var17.field753 != -1) {
                arg8.method217(new LocEntity(0, -69, arg7, arg0, true, SeqType.field938[var17.field753], arg2, arg6));
            }
        } else if (arg3 == 1) {
            Model var23 = var17.method256(1, arg1, var12, var13, var14, var15, -1);
            arg9.method58(431, var18, 0, var16, var23, arg2, arg6, null, var19, field55[arg1], arg7);
            if (var17.field762) {
                if (arg1 == 0) {
                    this.field46[arg7][arg6][arg2 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field46[arg7][arg6 + 1][arg2 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field46[arg7][arg6 + 1][arg2] = 50;
                } else if (arg1 == 3) {
                    this.field46[arg7][arg6][arg2] = 50;
                }
            }
            if (var17.field747) {
                arg5.method273(arg3, arg2, arg1, arg6, 757, var17.field748);
            }
            if (var17.field753 != -1) {
                arg8.method217(new LocEntity(0, -69, arg7, arg0, true, SeqType.field938[var17.field753], arg2, arg6));
            }
        } else if (arg3 == 2) {
            int var24 = arg1 + 1 & 0x3;
            Model var25 = var17.method256(2, arg1 + 4, var12, var13, var14, var15, -1);
            Model var26 = var17.method256(2, var24, var12, var13, var14, var15, -1);
            arg9.method58(431, var18, field54[var24], var16, var25, arg2, arg6, var26, var19, field54[arg1], arg7);
            if (var17.field752) {
                if (arg1 == 0) {
                    this.field53[arg7][arg6][arg2] |= 0x249;
                    this.field53[arg7][arg6][arg2 + 1] |= 0x492;
                } else if (arg1 == 1) {
                    this.field53[arg7][arg6][arg2 + 1] |= 0x492;
                    this.field53[arg7][arg6 + 1][arg2] |= 0x249;
                } else if (arg1 == 2) {
                    this.field53[arg7][arg6 + 1][arg2] |= 0x249;
                    this.field53[arg7][arg6][arg2] |= 0x492;
                } else if (arg1 == 3) {
                    this.field53[arg7][arg6][arg2] |= 0x492;
                    this.field53[arg7][arg6][arg2] |= 0x249;
                }
            }
            if (var17.field747) {
                arg5.method273(arg3, arg2, arg1, arg6, 757, var17.field748);
            }
        } else if (arg3 == 3) {
            Model var27 = var17.method256(3, arg1, var12, var13, var14, var15, -1);
            arg9.method58(431, var18, 0, var16, var27, arg2, arg6, null, var19, field55[arg1], arg7);
            if (var17.field762) {
                if (arg1 == 0) {
                    this.field46[arg7][arg6][arg2 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field46[arg7][arg6 + 1][arg2 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field46[arg7][arg6 + 1][arg2] = 50;
                } else if (arg1 == 3) {
                    this.field46[arg7][arg6][arg2] = 50;
                }
            }
            if (var17.field747) {
                arg5.method273(arg3, arg2, arg1, arg6, 757, var17.field748);
            }
            if (var17.field753 != -1) {
                arg8.method217(new LocEntity(0, -69, arg7, arg0, true, SeqType.field938[var17.field753], arg2, arg6));
            }
        } else if (arg3 == 9) {
            Model var28 = var17.method256(arg3, arg1, var12, var13, var14, var15, -1);
            arg9.method60(var28, var19, null, var16, arg6, 1, 1, arg7, var18, arg2, 0, 0);
            if (var17.field747) {
                arg5.method274(arg6, var17.field746, var17.field748, var17.field745, -532, arg2, arg1);
            }
            if (var17.field753 != -1) {
                arg8.method217(new LocEntity(2, -69, arg7, arg0, true, SeqType.field938[var17.field753], arg2, arg6));
            }
        } else if (arg3 == 4) {
            Model var29 = var17.method256(4, 0, var12, var13, var14, var15, -1);
            arg9.method59(arg6, var19, var16, 0, var18, field54[arg1], 414, arg1 * 512, 0, var29, arg2, arg7);
            if (var17.field753 != -1) {
                arg8.method217(new LocEntity(1, -69, arg7, arg0, true, SeqType.field938[var17.field753], arg2, arg6));
            }
        } else if (arg3 == 5) {
            int var30 = 16;
            int var31 = arg9.method74(arg7, arg6, arg2);
            if (var31 > 0) {
                var30 = LocType.method253(var31 >> 14 & 0x7FFF).field754;
            }
            Model var32 = var17.method256(4, 0, var12, var13, var14, var15, -1);
            arg9.method59(arg6, var19, var16, field57[arg1] * var30, var18, field54[arg1], 414, arg1 * 512, field56[arg1] * var30, var32, arg2, arg7);
            if (var17.field753 != -1) {
                arg8.method217(new LocEntity(1, -69, arg7, arg0, true, SeqType.field938[var17.field753], arg2, arg6));
            }
        } else if (arg3 == 6) {
            Model var33 = var17.method256(4, 0, var12, var13, var14, var15, -1);
            arg9.method59(arg6, var19, var16, 0, var18, 256, 414, arg1, 0, var33, arg2, arg7);
            if (var17.field753 != -1) {
                arg8.method217(new LocEntity(1, -69, arg7, arg0, true, SeqType.field938[var17.field753], arg2, arg6));
            }
        } else if (arg3 == 7) {
            Model var34 = var17.method256(4, 0, var12, var13, var14, var15, -1);
            arg9.method59(arg6, var19, var16, 0, var18, 512, 414, arg1, 0, var34, arg2, arg7);
            if (var17.field753 != -1) {
                arg8.method217(new LocEntity(1, -69, arg7, arg0, true, SeqType.field938[var17.field753], arg2, arg6));
            }
        } else if (arg3 == 8) {
            Model var35 = var17.method256(4, 0, var12, var13, var14, var15, -1);
            arg9.method59(arg6, var19, var16, 0, var18, 768, 414, arg1, 0, var35, arg2, arg7);
            if (var17.field753 != -1) {
                arg8.method217(new LocEntity(1, -69, arg7, arg0, true, SeqType.field938[var17.field753], arg2, arg6));
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;Z[Lbc;)V")
    public final void method18(World3D arg0, boolean arg1, CollisionMap[] arg2) {
        CollisionMap var4 = null;
        for (int var5 = 0; var5 < 4; var5++) {
            CollisionMap var107 = arg2[var5];
            for (int var108 = 0; var108 < 104; var108++) {
                for (int var109 = 0; var109 < 104; var109++) {
                    if ((this.field41[var5][var108][var109] & 0x1) == 1) {
                        var107.method275(2, var109, var108);
                    }
                    if (var5 > 0 && (this.field41[1][var108][var109] & 0x2) == 2) {
                        var4.field849[var108][var109] = var107.field849[var108][var109];
                    }
                }
            }
            var4 = var107;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var49 = this.field46[var6];
            byte var50 = 96;
            short var51 = 768;
            byte var52 = -50;
            byte var53 = -10;
            byte var54 = -50;
            int var55 = (int) Math.sqrt((double) (var54 * var54 + var52 * var52 + var53 * var53));
            int var56 = var51 * var55 >> 8;
            for (int var57 = 1; var57 < this.field39 - 1; var57++) {
                for (int var98 = 1; var98 < this.field38 - 1; var98++) {
                    int var99 = this.field40[var6][var98 + 1][var57] - this.field40[var6][var98 - 1][var57];
                    int var100 = this.field40[var6][var98][var57 + 1] - this.field40[var6][var98][var57 - 1];
                    int var101 = (int) Math.sqrt((double) (var100 * var100 + var99 * var99 + 65536));
                    int var102 = (var99 << 8) / var101;
                    int var103 = 65536 / var101;
                    int var104 = (var100 << 8) / var101;
                    int var105 = (var54 * var104 + var52 * var102 + var53 * var103) / var56 + var50;
                    int var106 = (var49[var98][var57] >> 1) + (var49[var98][var57 + 1] >> 3) + (var49[var98][var57 - 1] >> 2) + (var49[var98 - 1][var57] >> 2) + (var49[var98 + 1][var57] >> 3);
                    this.field47[var98][var57] = var105 - var106;
                }
            }
            for (int var58 = 0; var58 < this.field39; var58++) {
                this.field48[var58] = 0;
                this.field49[var58] = 0;
                this.field50[var58] = 0;
                this.field51[var58] = 0;
                this.field52[var58] = 0;
            }
            for (int var59 = -5; var59 < this.field38 + 5; var59++) {
                for (int var63 = 0; var63 < this.field39; var63++) {
                    int var92 = var59 + 5;
                    int var10002;
                    if (var92 >= 0 && var92 < this.field38) {
                        int var93 = this.field42[var6][var92][var63] & 0xFF;
                        if (var93 > 0) {
                            FloType var94 = FloType.field851[var93 - 1];
                            this.field48[var63] += var94.field860;
                            this.field49[var63] += var94.field858;
                            this.field50[var63] += var94.field859;
                            this.field51[var63] += var94.field861;
                            var10002 = this.field52[var63]++;
                        }
                    }
                    int var95 = var59 - 5;
                    if (var95 >= 0 && var95 < this.field38) {
                        int var96 = this.field42[var6][var95][var63] & 0xFF;
                        if (var96 > 0) {
                            FloType var97 = FloType.field851[var96 - 1];
                            this.field48[var63] -= var97.field860;
                            this.field49[var63] -= var97.field858;
                            this.field50[var63] -= var97.field859;
                            this.field51[var63] -= var97.field861;
                            var10002 = this.field52[var63]--;
                        }
                    }
                }
                if (var59 >= 1 && var59 < this.field38 - 1) {
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    int var68 = 0;
                    for (int var69 = -5; var69 < this.field39 + 5; var69++) {
                        int var70 = var69 + 5;
                        if (var70 >= 0 && var70 < this.field39) {
                            var64 += this.field48[var70];
                            var65 += this.field49[var70];
                            var66 += this.field50[var70];
                            var67 += this.field51[var70];
                            var68 += this.field52[var70];
                        }
                        int var71 = var69 - 5;
                        if (var71 >= 0 && var71 < this.field39) {
                            var64 -= this.field48[var71];
                            var65 -= this.field49[var71];
                            var66 -= this.field50[var71];
                            var67 -= this.field51[var71];
                            var68 -= this.field52[var71];
                        }
                        if (var69 >= 1 && var69 < this.field39 - 1) {
                            if (field35) {
                                int var72 = var6;
                                if (var6 > 0 && (this.field41[1][var59][var69] & 0x2) != 0) {
                                    var72 = var6 - 1;
                                }
                                if ((this.field41[var6][var59][var69] & 0x8) != 0) {
                                    var72 = 0;
                                }
                                if (field36 != var72 || (this.field41[var6][var59][var69] & 0x10) != 0) {
                                    continue;
                                }
                            }
                            int var73 = this.field42[var6][var59][var69] & 0xFF;
                            int var74 = this.field43[var6][var59][var69] & 0xFF;
                            if (var73 > 0 || var74 > 0) {
                                int var75 = this.field40[var6][var59][var69];
                                int var76 = this.field40[var6][var59 + 1][var69];
                                int var77 = this.field40[var6][var59 + 1][var69 + 1];
                                int var78 = this.field40[var6][var59][var69 + 1];
                                int var79 = this.field47[var59][var69];
                                int var80 = this.field47[var59 + 1][var69];
                                int var81 = this.field47[var59 + 1][var69 + 1];
                                int var82 = this.field47[var59][var69 + 1];
                                int var83 = -1;
                                if (var73 > 0) {
                                    var83 = this.method26(var64 * 256 / var67, var65 / var68, var66 / var68);
                                }
                                if (var6 > 0) {
                                    boolean var84 = true;
                                    if (var73 == 0 && this.field44[var6][var59][var69] != 0) {
                                        var84 = false;
                                    }
                                    if (var74 > 0 && !FloType.field851[var74 - 1].field855) {
                                        var84 = false;
                                    }
                                    if (var84 && var75 == var76 && var75 == var77 && var75 == var78) {
                                        this.field53[var6][var59][var69] |= 0x924;
                                    }
                                }
                                int var85 = 0;
                                if (var83 != -1) {
                                    var85 = Pix3D.field556[method24(var83, 96)];
                                }
                                if (var74 == 0) {
                                    arg0.method55(var6, var59, var69, 0, 0, -1, var75, var76, var77, var78, method24(var83, var79), method24(var83, var80), method24(var83, var81), method24(var83, var82), 0, 0, 0, 0, var85, 0);
                                } else {
                                    int var86 = this.field44[var6][var59][var69] + 1;
                                    byte var87 = this.field45[var6][var59][var69];
                                    FloType var88 = FloType.field851[var74 - 1];
                                    int var89 = var88.field853;
                                    int var90;
                                    int var91;
                                    if (var89 >= 0) {
                                        var90 = Pix3D.method155((byte) -29, var89);
                                        var91 = -1;
                                    } else if (var88.field852 == 16711935) {
                                        var90 = 0;
                                        var91 = -2;
                                        var89 = -1;
                                    } else {
                                        var91 = this.method26(var88.field857, var88.field858, var88.field859);
                                        var90 = Pix3D.field556[this.method25(var91, 96)];
                                    }
                                    arg0.method55(var6, var59, var69, var86, var87, var89, var75, var76, var77, var78, method24(var83, var79), method24(var83, var80), method24(var83, var81), method24(var83, var82), this.method25(var91, var79), this.method25(var91, var80), this.method25(var91, var81), this.method25(var91, var82), var85, var90);
                                }
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < this.field39 - 1; var60++) {
                for (int var61 = 1; var61 < this.field38 - 1; var61++) {
                    int var62 = var6;
                    if (var6 > 0 && (this.field41[1][var61][var60] & 0x2) != 0) {
                        var62 = var6 - 1;
                    }
                    if ((this.field41[var6][var61][var60] & 0x8) != 0) {
                        var62 = 0;
                    }
                    arg0.method54(var6, var61, var60, var62);
                }
            }
        }
        if (!field37) {
            arg0.method79(64, 768, -10, -50, -50, 0);
        }
        for (int var7 = 0; var7 < this.field38; var7++) {
            for (int var48 = 0; var48 < this.field39; var48++) {
                if ((this.field41[1][var7][var48] & 0x2) == 2) {
                    arg0.method52(var48, var7, 9);
                }
            }
        }
        if (field37) {
            return;
        }
        int var8 = 1;
        int var9 = 2;
        int var10 = 4;
        for (int var11 = 0; var11 < 4; var11++) {
            if (var11 > 0) {
                var8 <<= 0x3;
                var9 <<= 0x3;
                var10 <<= 0x3;
            }
            for (int var12 = 0; var12 <= var11; var12++) {
                for (int var13 = 0; var13 <= this.field39; var13++) {
                    for (int var14 = 0; var14 <= this.field38; var14++) {
                        if ((this.field53[var12][var14][var13] & var8) != 0) {
                            int var15 = var13;
                            int var16 = var13;
                            int var17 = var12;
                            int var18 = var12;
                            while (var15 > 0 && (this.field53[var12][var14][var15 - 1] & var8) != 0) {
                                var15--;
                            }
                            while (var16 < this.field39 && (this.field53[var12][var14][var16 + 1] & var8) != 0) {
                                var16++;
                            }
                            label328: while (var17 > 0) {
                                for (int var19 = var15; var19 <= var16; var19++) {
                                    if ((this.field53[var17 - 1][var14][var19] & var8) == 0) {
                                        break label328;
                                    }
                                }
                                var17--;
                            }
                            label317: while (var18 < var11) {
                                for (int var20 = var15; var20 <= var16; var20++) {
                                    if ((this.field53[var18 + 1][var14][var20] & var8) == 0) {
                                        break label317;
                                    }
                                }
                                var18++;
                            }
                            int var21 = (var18 + 1 - var17) * (var16 - var15 + 1);
                            if (var21 >= 8) {
                                short var22 = 240;
                                int var23 = this.field40[var18][var14][var15] - var22;
                                int var24 = this.field40[var17][var14][var15];
                                World3D.method53(var14 * 128, var23, var14 * 128, this.field34, var16 * 128 + 128, var15 * 128, 1, var24, var11);
                                for (int var25 = var17; var25 <= var18; var25++) {
                                    for (int var26 = var15; var26 <= var16; var26++) {
                                        this.field53[var25][var14][var26] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field53[var12][var14][var13] & var9) != 0) {
                            int var27 = var14;
                            int var28 = var14;
                            int var29 = var12;
                            int var30 = var12;
                            while (var27 > 0 && (this.field53[var12][var27 - 1][var13] & var9) != 0) {
                                var27--;
                            }
                            while (var28 < this.field38 && (this.field53[var12][var28 + 1][var13] & var9) != 0) {
                                var28++;
                            }
                            label381: while (var29 > 0) {
                                for (int var31 = var27; var31 <= var28; var31++) {
                                    if ((this.field53[var29 - 1][var31][var13] & var9) == 0) {
                                        break label381;
                                    }
                                }
                                var29--;
                            }
                            label370: while (var30 < var11) {
                                for (int var32 = var27; var32 <= var28; var32++) {
                                    if ((this.field53[var30 + 1][var32][var13] & var9) == 0) {
                                        break label370;
                                    }
                                }
                                var30++;
                            }
                            int var33 = (var30 + 1 - var29) * (var28 - var27 + 1);
                            if (var33 >= 8) {
                                short var34 = 240;
                                int var35 = this.field40[var30][var27][var13] - var34;
                                int var36 = this.field40[var29][var27][var13];
                                World3D.method53(var27 * 128, var35, var28 * 128 + 128, this.field34, var13 * 128, var13 * 128, 2, var36, var11);
                                for (int var37 = var29; var37 <= var30; var37++) {
                                    for (int var38 = var27; var38 <= var28; var38++) {
                                        this.field53[var37][var38][var13] &= ~var9;
                                    }
                                }
                            }
                        }
                        if ((this.field53[var12][var14][var13] & var10) != 0) {
                            int var39 = var14;
                            int var40 = var14;
                            int var41 = var13;
                            int var42 = var13;
                            while (var41 > 0 && (this.field53[var12][var14][var41 - 1] & var10) != 0) {
                                var41--;
                            }
                            while (var42 < this.field39 && (this.field53[var12][var14][var42 + 1] & var10) != 0) {
                                var42++;
                            }
                            label434: while (var39 > 0) {
                                for (int var43 = var41; var43 <= var42; var43++) {
                                    if ((this.field53[var12][var39 - 1][var43] & var10) == 0) {
                                        break label434;
                                    }
                                }
                                var39--;
                            }
                            label423: while (var40 < this.field38) {
                                for (int var44 = var41; var44 <= var42; var44++) {
                                    if ((this.field53[var12][var40 + 1][var44] & var10) == 0) {
                                        break label423;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var39) * (var42 - var41 + 1) >= 4) {
                                int var45 = this.field40[var12][var39][var41];
                                World3D.method53(var39 * 128, var45, var40 * 128 + 128, this.field34, var42 * 128 + 128, var41 * 128, 4, var45, var11);
                                for (int var46 = var39; var46 <= var40; var46++) {
                                    for (int var47 = var41; var47 <= var42; var47++) {
                                        this.field53[var12][var46][var47] &= ~var10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II)I")
    private static final int method19(int arg0, int arg1) {
        int var2 = method20(arg0 + 45365, arg1 + 91923, 4) + (method20(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method20(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(III)I")
    private static final int method20(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method22(var3, var5);
        int var8 = method22(var3 + 1, var5);
        int var9 = method22(var3, var5 + 1);
        int var10 = method22(var3 + 1, var5 + 1);
        int var11 = method21(var7, var8, var4, arg2);
        int var12 = method21(var9, var10, var4, arg2);
        return method21(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII)I")
    private static final int method21(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - Pix3D.field545[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "c", name = "b", descriptor = "(II)I")
    private static final int method22(int arg0, int arg1) {
        int var2 = method23(arg0 - 1, arg1 - 1) + method23(arg0 + 1, arg1 - 1) + method23(arg0 - 1, arg1 + 1) + method23(arg0 + 1, arg1 + 1);
        int var3 = method23(arg0 - 1, arg1) + method23(arg0 + 1, arg1) + method23(arg0, arg1 - 1) + method23(arg0, arg1 + 1);
        int var4 = method23(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "c", name = "c", descriptor = "(II)I")
    private static final int method23(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "c", name = "d", descriptor = "(II)I")
    private static final int method24(int arg0, int arg1) {
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

    @OriginalMember(owner = "c", name = "e", descriptor = "(II)I")
    private final int method25(int arg0, int arg1) {
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

    @OriginalMember(owner = "c", name = "b", descriptor = "(III)I")
    private final int method26(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(ILr;IIIILbc;Lob;[[[IIBI)V")
    public static final void method27(int arg0, World3D arg1, int arg2, int arg3, int arg4, int arg5, CollisionMap arg6, LinkList arg7, int[][][] arg8, int arg9, byte arg10, int arg11) {
        int var12 = arg8[arg11][arg5][arg9];
        int var13 = arg8[arg11][arg5 + 1][arg9];
        int var14 = arg8[arg11][arg5 + 1][arg9 + 1];
        int var15 = arg8[arg11][arg5][arg9 + 1];
        int var16 = var12 + var13 + var14 + var15 >> 2;
        LocType var17 = LocType.method253(arg0);
        int var18 = (arg0 << 14) + (arg9 << 7) + arg5 + 1073741824;
        if (!var17.field749) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg3 << 6) + arg2);
        if (arg10 != 1) {
            field33 = !field33;
        }
        if (arg2 == 22) {
            Model var20 = var17.method256(22, arg3, var12, var13, var14, var15, -1);
            arg1.method56(var18, arg9, var19, var20, arg5, var16, true, arg4);
            if (var17.field747 && var17.field749) {
                arg6.method275(2, arg9, arg5);
            }
        } else if (arg2 == 10 || arg2 == 11) {
            Model var36 = var17.method256(10, arg3, var12, var13, var14, var15, -1);
            if (var36 != null) {
                int var37 = 0;
                if (arg2 == 11) {
                    var37 += 256;
                }
                int var38;
                int var39;
                if (arg3 == 1 || arg3 == 3) {
                    var38 = var17.field746;
                    var39 = var17.field745;
                } else {
                    var38 = var17.field745;
                    var39 = var17.field746;
                }
                arg1.method60(var36, var19, null, var16, arg5, var39, var38, arg4, var18, arg9, 0, var37);
            }
            if (var17.field747) {
                arg6.method274(arg5, var17.field746, var17.field748, var17.field745, -532, arg9, arg3);
            }
            if (var17.field753 != -1) {
                arg7.method217(new LocEntity(2, -69, arg4, arg0, true, SeqType.field938[var17.field753], arg9, arg5));
            }
        } else if (arg2 >= 12) {
            Model var21 = var17.method256(arg2, arg3, var12, var13, var14, var15, -1);
            arg1.method60(var21, var19, null, var16, arg5, 1, 1, arg4, var18, arg9, 0, 0);
            if (var17.field747) {
                arg6.method274(arg5, var17.field746, var17.field748, var17.field745, -532, arg9, arg3);
            }
            if (var17.field753 != -1) {
                arg7.method217(new LocEntity(2, -69, arg4, arg0, true, SeqType.field938[var17.field753], arg9, arg5));
            }
        } else if (arg2 == 0) {
            Model var22 = var17.method256(0, arg3, var12, var13, var14, var15, -1);
            arg1.method58(431, var18, 0, var16, var22, arg9, arg5, null, var19, field54[arg3], arg4);
            if (var17.field747) {
                arg6.method273(arg2, arg9, arg3, arg5, 757, var17.field748);
            }
        } else if (arg2 == 1) {
            Model var23 = var17.method256(1, arg3, var12, var13, var14, var15, -1);
            arg1.method58(431, var18, 0, var16, var23, arg9, arg5, null, var19, field55[arg3], arg4);
            if (var17.field747) {
                arg6.method273(arg2, arg9, arg3, arg5, 757, var17.field748);
            }
        } else if (arg2 == 2) {
            int var24 = arg3 + 1 & 0x3;
            Model var25 = var17.method256(2, arg3 + 4, var12, var13, var14, var15, -1);
            Model var26 = var17.method256(2, var24, var12, var13, var14, var15, -1);
            arg1.method58(431, var18, field54[var24], var16, var25, arg9, arg5, var26, var19, field54[arg3], arg4);
            if (var17.field747) {
                arg6.method273(arg2, arg9, arg3, arg5, 757, var17.field748);
            }
        } else if (arg2 == 3) {
            Model var27 = var17.method256(3, arg3, var12, var13, var14, var15, -1);
            arg1.method58(431, var18, 0, var16, var27, arg9, arg5, null, var19, field55[arg3], arg4);
            if (var17.field747) {
                arg6.method273(arg2, arg9, arg3, arg5, 757, var17.field748);
            }
        } else if (arg2 == 9) {
            Model var28 = var17.method256(arg2, arg3, var12, var13, var14, var15, -1);
            arg1.method60(var28, var19, null, var16, arg5, 1, 1, arg4, var18, arg9, 0, 0);
            if (var17.field747) {
                arg6.method274(arg5, var17.field746, var17.field748, var17.field745, -532, arg9, arg3);
            }
        } else if (arg2 == 4) {
            Model var29 = var17.method256(4, 0, var12, var13, var14, var15, -1);
            arg1.method59(arg5, var19, var16, 0, var18, field54[arg3], 414, arg3 * 512, 0, var29, arg9, arg4);
            if (var17.field753 != -1) {
                arg7.method217(new LocEntity(1, -69, arg4, arg0, true, SeqType.field938[var17.field753], arg9, arg5));
            }
        } else if (arg2 == 5) {
            int var30 = 16;
            int var31 = arg1.method74(arg4, arg5, arg9);
            if (var31 > 0) {
                var30 = LocType.method253(var31 >> 14 & 0x7FFF).field754;
            }
            Model var32 = var17.method256(4, 0, var12, var13, var14, var15, -1);
            arg1.method59(arg5, var19, var16, field57[arg3] * var30, var18, field54[arg3], 414, arg3 * 512, field56[arg3] * var30, var32, arg9, arg4);
            if (var17.field753 != -1) {
                arg7.method217(new LocEntity(1, -69, arg4, arg0, true, SeqType.field938[var17.field753], arg9, arg5));
            }
        } else if (arg2 == 6) {
            Model var33 = var17.method256(4, 0, var12, var13, var14, var15, -1);
            arg1.method59(arg5, var19, var16, 0, var18, 256, 414, arg3, 0, var33, arg9, arg4);
            if (var17.field753 != -1) {
                arg7.method217(new LocEntity(1, -69, arg4, arg0, true, SeqType.field938[var17.field753], arg9, arg5));
            }
        } else if (arg2 == 7) {
            Model var34 = var17.method256(4, 0, var12, var13, var14, var15, -1);
            arg1.method59(arg5, var19, var16, 0, var18, 512, 414, arg3, 0, var34, arg9, arg4);
            if (var17.field753 != -1) {
                arg7.method217(new LocEntity(1, -69, arg4, arg0, true, SeqType.field938[var17.field753], arg9, arg5));
            }
        } else if (arg2 == 8) {
            Model var35 = var17.method256(4, 0, var12, var13, var14, var15, -1);
            arg1.method59(arg5, var19, var16, 0, var18, 768, 414, arg3, 0, var35, arg9, arg4);
            if (var17.field753 != -1) {
                arg7.method217(new LocEntity(1, -69, arg4, arg0, true, SeqType.field938[var17.field753], arg9, arg5));
            }
        }
    }
}
