import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "a", descriptor = "I")
    private int field31 = 8;

    @OriginalMember(owner = "c", name = "b", descriptor = "I")
    private int field32 = -836;

    @OriginalMember(owner = "c", name = "c", descriptor = "Z")
    private boolean field33 = false;

    @OriginalMember(owner = "c", name = "d", descriptor = "B")
    private byte field34 = 2;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "c", name = "h", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "c", name = "i", descriptor = "[[[I")
    private int[][][] field39;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[B")
    private byte[][][] field40;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field41;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field42;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field43;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field44;

    @OriginalMember(owner = "c", name = "v", descriptor = "[[[I")
    private int[][][] field52;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field45;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[I")
    private int[][] field46;

    @OriginalMember(owner = "c", name = "q", descriptor = "[I")
    private int[] field47;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field48;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field49;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field50;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field51;

    @OriginalMember(owner = "c", name = "e", descriptor = "Z")
    public static boolean field35 = true;

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private static final int[] field53 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field54 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field55 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field56 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "f", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "([[[B[[[IIII)V")
    public World(byte[][][] arg0, int[][][] arg1, int arg2, int arg3, int arg4) {
        this.field37 = arg2;
        this.field38 = arg3;
        this.field39 = arg1;
        this.field40 = arg0;
        this.field41 = new byte[4][this.field37][this.field38];
        this.field42 = new byte[4][this.field37][this.field38];
        this.field43 = new byte[4][this.field37][this.field38];
        this.field44 = new byte[4][this.field37][this.field38];
        if (this.field31 != arg4) {
            this.field32 = 395;
        }
        this.field52 = new int[4][this.field37 + 1][this.field38 + 1];
        this.field45 = new byte[4][this.field37 + 1][this.field38 + 1];
        this.field46 = new int[this.field37 + 1][this.field38 + 1];
        this.field47 = new int[this.field38];
        this.field48 = new int[this.field38];
        this.field49 = new int[this.field38];
        this.field50 = new int[this.field38];
        this.field51 = new int[this.field38];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIIB)V")
    public final void method14(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        byte var6 = 0;
        if (arg4 != -98) {
            this.field33 = !this.field33;
        }
        for (int var7 = 0; var7 < FloType.field837; var7++) {
            if (FloType.field838[var7].field843.equalsIgnoreCase("water")) {
                var6 = (byte) (var7 + 1);
                break;
            }
        }
        for (int var8 = arg0; var8 < arg0 + arg2; var8++) {
            for (int var9 = arg3; var9 < arg1 + arg3; var9++) {
                if (var9 >= 0 && var9 < this.field37 && var8 >= 0 && var8 < this.field38) {
                    this.field42[0][var9][var8] = var6;
                    for (int var10 = 0; var10 < 4; var10++) {
                        this.field39[var10][var9][var8] = 0;
                        this.field40[var10][var9][var8] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(I[BIIII)V")
    public final void method15(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -16770) {
            return;
        }
        Packet var7 = new Packet(arg1, (byte) 63);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg4 + var9;
                    int var12 = arg3 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field40[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method185();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field39[0][var11][var12] = -method19(var11 + arg2 + 932731, var12 + 556238 + arg5) * 8;
                                } else {
                                    this.field39[var8][var11][var12] = this.field39[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method185();
                                if (var14 == 1) {
                                    var14 = 0;
                                }
                                if (var8 == 0) {
                                    this.field39[0][var11][var12] = -var14 * 8;
                                } else {
                                    this.field39[var8][var11][var12] = this.field39[var8 - 1][var11][var12] - var14 * 8;
                                }
                                break;
                            }
                            if (var13 <= 49) {
                                this.field42[var8][var11][var12] = var7.method186();
                                this.field43[var8][var11][var12] = (byte) ((var13 - 2) / 4);
                                this.field44[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
                            } else if (var13 <= 81) {
                                this.field40[var8][var11][var12] = (byte) (var13 - 49);
                            } else {
                                this.field41[var8][var11][var12] = (byte) (var13 - 81);
                            }
                        }
                    } else {
                        while (true) {
                            int var15 = var7.method185();
                            if (var15 == 0) {
                                break;
                            }
                            if (var15 == 1) {
                                var7.method185();
                                break;
                            }
                            if (var15 <= 49) {
                                var7.method185();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([BLnb;[Lac;Lq;III)V")
    public final void method16(byte[] arg0, LinkList arg1, CollisionMap[] arg2, World3D arg3, int arg4, int arg5, int arg6) {
        Packet var8 = new Packet(arg0, (byte) 63);
        while (arg6 >= 0) {
            for (int var21 = 1; var21 > 0; var21++) {
            }
        }
        int var9 = -1;
        while (true) {
            int var10 = var8.method199();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method199();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var8.method185();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg5 + var14;
                int var20 = arg4 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    this.method17(arg3, arg1, var9, var15, var17, var18, -420, var20, arg2[var15], var19);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lq;Lnb;IIIIIILac;I)V")
    private final void method17(World3D arg0, LinkList arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, CollisionMap arg8, int arg9) {
        if (field35) {
            int var11 = arg3;
            if (arg3 > 0 && (this.field40[1][arg9][arg7] & 0x2) != 0) {
                var11 = arg3 - 1;
            }
            if ((this.field40[arg3][arg9][arg7] & 0x8) != 0) {
                var11 = 0;
            }
            if (field36 != var11) {
                return;
            }
            if ((this.field40[arg3][arg9][arg7] & 0x10) != 0) {
                return;
            }
        }
        int var12 = this.field39[arg3][arg9][arg7];
        int var13 = this.field39[arg3][arg9 + 1][arg7];
        int var14 = this.field39[arg3][arg9 + 1][arg7 + 1];
        int var15 = this.field39[arg3][arg9][arg7 + 1];
        if (arg6 >= 0) {
            return;
        }
        int var16 = var12 + var13 + var14 + var15 >> 2;
        LocType var17 = LocType.method237(arg2);
        int var18 = (arg2 << 14) + (arg7 << 7) + arg9 + 1073741824;
        if (!var17.field730) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg5 << 6) + arg4);
        if (arg4 == 22) {
            if (!field35 || var17.field730) {
                Model var20 = var17.method240(22, arg5, var12, var13, var14, var15, -1);
                arg0.method42(var20, arg9, var19, 0, var16, arg3, arg7, var18);
                if (var17.field728 && var17.field730) {
                    arg8.method259((byte) 0, arg7, arg9);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            Model var36 = var17.method240(10, arg5, var12, var13, var14, var15, -1);
            if (var36 != null) {
                int var37 = 0;
                if (arg4 == 11) {
                    var37 += 256;
                }
                int var38;
                int var39;
                if (arg5 == 1 || arg5 == 3) {
                    var38 = var17.field727;
                    var39 = var17.field726;
                } else {
                    var38 = var17.field726;
                    var39 = var17.field727;
                }
                if (arg0.method46(var18, arg7, var36, var39, (byte) -14, var37, arg3, arg9, var16, var19, null, var38) && var17.field743) {
                    for (int var40 = 0; var40 <= var38; var40++) {
                        for (int var41 = 0; var41 <= var39; var41++) {
                            int var42 = var36.field446 / 4;
                            if (var42 > 30) {
                                var42 = 30;
                            }
                            if (var42 > this.field45[arg3][arg9 + var40][arg7 + var41]) {
                                this.field45[arg3][arg9 + var40][arg7 + var41] = (byte) var42;
                            }
                        }
                    }
                }
            }
            if (var17.field728) {
                arg8.method258(true, var17.field726, arg9, arg7, var17.field729, arg5, var17.field727);
            }
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(2, arg3, arg2, 5858, SeqType.field927[var17.field734], arg9, arg7));
            }
        } else if (arg4 >= 12) {
            Model var21 = var17.method240(arg4, arg5, var12, var13, var14, var15, -1);
            arg0.method46(var18, arg7, var21, 1, (byte) -14, 0, arg3, arg9, var16, var19, null, 1);
            if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg3 > 0) {
                this.field52[arg3][arg9][arg7] |= 0x924;
            }
            if (var17.field728) {
                arg8.method258(true, var17.field726, arg9, arg7, var17.field729, arg5, var17.field727);
            }
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(2, arg3, arg2, 5858, SeqType.field927[var17.field734], arg9, arg7));
            }
        } else if (arg4 == 0) {
            Model var22 = var17.method240(0, arg5, var12, var13, var14, var15, -1);
            arg0.method44(var16, field53[arg5], var19, 0, var18, (byte) -120, arg7, arg9, null, arg3, var22);
            if (arg5 == 0) {
                if (var17.field743) {
                    this.field45[arg3][arg9][arg7] = 50;
                    this.field45[arg3][arg9][arg7 + 1] = 50;
                }
                if (var17.field733) {
                    this.field52[arg3][arg9][arg7] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var17.field743) {
                    this.field45[arg3][arg9][arg7 + 1] = 50;
                    this.field45[arg3][arg9 + 1][arg7 + 1] = 50;
                }
                if (var17.field733) {
                    this.field52[arg3][arg9][arg7 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var17.field743) {
                    this.field45[arg3][arg9 + 1][arg7] = 50;
                    this.field45[arg3][arg9 + 1][arg7 + 1] = 50;
                }
                if (var17.field733) {
                    this.field52[arg3][arg9 + 1][arg7] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var17.field743) {
                    this.field45[arg3][arg9][arg7] = 50;
                    this.field45[arg3][arg9 + 1][arg7] = 50;
                }
                if (var17.field733) {
                    this.field52[arg3][arg9][arg7] |= 0x492;
                }
            }
            if (var17.field728) {
                arg8.method257(arg9, var17.field729, arg4, arg7, -34301, arg5);
            }
        } else if (arg4 == 1) {
            Model var23 = var17.method240(1, arg5, var12, var13, var14, var15, -1);
            arg0.method44(var16, field54[arg5], var19, 0, var18, (byte) -120, arg7, arg9, null, arg3, var23);
            if (var17.field743) {
                if (arg5 == 0) {
                    this.field45[arg3][arg9][arg7 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field45[arg3][arg9 + 1][arg7 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field45[arg3][arg9 + 1][arg7] = 50;
                } else if (arg5 == 3) {
                    this.field45[arg3][arg9][arg7] = 50;
                }
            }
            if (var17.field728) {
                arg8.method257(arg9, var17.field729, arg4, arg7, -34301, arg5);
            }
        } else if (arg4 == 2) {
            int var24 = arg5 + 1 & 0x3;
            Model var25 = var17.method240(2, arg5 + 4, var12, var13, var14, var15, -1);
            Model var26 = var17.method240(2, var24, var12, var13, var14, var15, -1);
            arg0.method44(var16, field53[arg5], var19, field53[var24], var18, (byte) -120, arg7, arg9, var26, arg3, var25);
            if (var17.field733) {
                if (arg5 == 0) {
                    this.field52[arg3][arg9][arg7] |= 0x249;
                    this.field52[arg3][arg9][arg7 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    this.field52[arg3][arg9][arg7 + 1] |= 0x492;
                    this.field52[arg3][arg9 + 1][arg7] |= 0x249;
                } else if (arg5 == 2) {
                    this.field52[arg3][arg9 + 1][arg7] |= 0x249;
                    this.field52[arg3][arg9][arg7] |= 0x492;
                } else if (arg5 == 3) {
                    this.field52[arg3][arg9][arg7] |= 0x492;
                    this.field52[arg3][arg9][arg7] |= 0x249;
                }
            }
            if (var17.field728) {
                arg8.method257(arg9, var17.field729, arg4, arg7, -34301, arg5);
            }
        } else if (arg4 == 3) {
            Model var27 = var17.method240(3, arg5, var12, var13, var14, var15, -1);
            arg0.method44(var16, field54[arg5], var19, 0, var18, (byte) -120, arg7, arg9, null, arg3, var27);
            if (var17.field743) {
                if (arg5 == 0) {
                    this.field45[arg3][arg9][arg7 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field45[arg3][arg9 + 1][arg7 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field45[arg3][arg9 + 1][arg7] = 50;
                } else if (arg5 == 3) {
                    this.field45[arg3][arg9][arg7] = 50;
                }
            }
            if (var17.field728) {
                arg8.method257(arg9, var17.field729, arg4, arg7, -34301, arg5);
            }
        } else if (arg4 == 9) {
            Model var28 = var17.method240(arg4, arg5, var12, var13, var14, var15, -1);
            arg0.method46(var18, arg7, var28, 1, (byte) -14, 0, arg3, arg9, var16, var19, null, 1);
            if (var17.field728) {
                arg8.method258(true, var17.field726, arg9, arg7, var17.field729, arg5, var17.field727);
            }
        } else if (arg4 == 4) {
            Model var29 = var17.method240(4, 0, var12, var13, var14, var15, -1);
            arg0.method45(var19, var18, var29, 0, arg9, false, field53[arg5], arg3, var16, arg7, arg5 * 512, 0);
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(1, arg3, arg2, 5858, SeqType.field927[var17.field734], arg9, arg7));
            }
        } else if (arg4 == 5) {
            int var30 = 16;
            int var31 = arg0.method59(arg3, arg9, arg7);
            if (var31 > 0) {
                var30 = LocType.method237(var31 >> 14 & 0x7FFF).field735;
            }
            Model var32 = var17.method240(4, 0, var12, var13, var14, var15, -1);
            arg0.method45(var19, var18, var32, field56[arg5] * var30, arg9, false, field53[arg5], arg3, var16, arg7, arg5 * 512, field55[arg5] * var30);
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(1, arg3, arg2, 5858, SeqType.field927[var17.field734], arg9, arg7));
            }
        } else if (arg4 == 6) {
            Model var33 = var17.method240(4, 0, var12, var13, var14, var15, -1);
            arg0.method45(var19, var18, var33, 0, arg9, false, 256, arg3, var16, arg7, arg5, 0);
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(1, arg3, arg2, 5858, SeqType.field927[var17.field734], arg9, arg7));
            }
        } else if (arg4 == 7) {
            Model var34 = var17.method240(4, 0, var12, var13, var14, var15, -1);
            arg0.method45(var19, var18, var34, 0, arg9, false, 512, arg3, var16, arg7, arg5, 0);
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(1, arg3, arg2, 5858, SeqType.field927[var17.field734], arg9, arg7));
            }
        } else if (arg4 == 8) {
            Model var35 = var17.method240(4, 0, var12, var13, var14, var15, -1);
            arg0.method45(var19, var18, var35, 0, arg9, false, 768, arg3, var16, arg7, arg5, 0);
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(1, arg3, arg2, 5858, SeqType.field927[var17.field734], arg9, arg7));
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([Lac;Lq;I)V")
    public final void method18(CollisionMap[] arg0, World3D arg1, int arg2) {
        CollisionMap var4 = null;
        for (int var5 = 0; var5 < 4; var5++) {
            CollisionMap var108 = arg0[var5];
            for (int var109 = 0; var109 < 104; var109++) {
                for (int var110 = 0; var110 < 104; var110++) {
                    if ((this.field40[var5][var109][var110] & 0x1) == 1) {
                        var108.method259((byte) 0, var110, var109);
                    }
                    if (var5 > 0 && (this.field40[1][var109][var110] & 0x2) == 2) {
                        var4.field835[var109][var110] = var108.field835[var109][var110];
                    }
                }
            }
            var4 = var108;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var50 = this.field45[var6];
            byte var51 = 96;
            short var52 = 768;
            byte var53 = -50;
            byte var54 = -10;
            byte var55 = -50;
            int var56 = (int) Math.sqrt((double) (var55 * var55 + var53 * var53 + var54 * var54));
            int var57 = var52 * var56 >> 8;
            for (int var58 = 1; var58 < this.field38 - 1; var58++) {
                for (int var99 = 1; var99 < this.field37 - 1; var99++) {
                    int var100 = this.field39[var6][var99 + 1][var58] - this.field39[var6][var99 - 1][var58];
                    int var101 = this.field39[var6][var99][var58 + 1] - this.field39[var6][var99][var58 - 1];
                    int var102 = (int) Math.sqrt((double) (var101 * var101 + var100 * var100 + 65536));
                    int var103 = (var100 << 8) / var102;
                    int var104 = 65536 / var102;
                    int var105 = (var101 << 8) / var102;
                    int var106 = (var55 * var105 + var53 * var103 + var54 * var104) / var57 + var51;
                    int var107 = (var50[var99][var58] >> 1) + (var50[var99][var58 + 1] >> 3) + (var50[var99][var58 - 1] >> 2) + (var50[var99 - 1][var58] >> 2) + (var50[var99 + 1][var58] >> 3);
                    this.field46[var99][var58] = var106 - var107;
                }
            }
            for (int var59 = 0; var59 < this.field38; var59++) {
                this.field47[var59] = 0;
                this.field48[var59] = 0;
                this.field49[var59] = 0;
                this.field50[var59] = 0;
                this.field51[var59] = 0;
            }
            for (int var60 = -5; var60 < this.field37 + 5; var60++) {
                for (int var64 = 0; var64 < this.field38; var64++) {
                    int var93 = var60 + 5;
                    int var10002;
                    if (var93 >= 0 && var93 < this.field37) {
                        int var94 = this.field41[var6][var93][var64] & 0xFF;
                        if (var94 > 0) {
                            FloType var95 = FloType.field838[var94 - 1];
                            this.field47[var64] += var95.field847;
                            this.field48[var64] += var95.field845;
                            this.field49[var64] += var95.field846;
                            this.field50[var64] += var95.field848;
                            var10002 = this.field51[var64]++;
                        }
                    }
                    int var96 = var60 - 5;
                    if (var96 >= 0 && var96 < this.field37) {
                        int var97 = this.field41[var6][var96][var64] & 0xFF;
                        if (var97 > 0) {
                            FloType var98 = FloType.field838[var97 - 1];
                            this.field47[var64] -= var98.field847;
                            this.field48[var64] -= var98.field845;
                            this.field49[var64] -= var98.field846;
                            this.field50[var64] -= var98.field848;
                            var10002 = this.field51[var64]--;
                        }
                    }
                }
                if (var60 >= 1 && var60 < this.field37 - 1) {
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    int var68 = 0;
                    int var69 = 0;
                    for (int var70 = -5; var70 < this.field38 + 5; var70++) {
                        int var71 = var70 + 5;
                        if (var71 >= 0 && var71 < this.field38) {
                            var65 += this.field47[var71];
                            var66 += this.field48[var71];
                            var67 += this.field49[var71];
                            var68 += this.field50[var71];
                            var69 += this.field51[var71];
                        }
                        int var72 = var70 - 5;
                        if (var72 >= 0 && var72 < this.field38) {
                            var65 -= this.field47[var72];
                            var66 -= this.field48[var72];
                            var67 -= this.field49[var72];
                            var68 -= this.field50[var72];
                            var69 -= this.field51[var72];
                        }
                        if (var70 >= 1 && var70 < this.field38 - 1) {
                            if (field35) {
                                int var73 = var6;
                                if (var6 > 0 && (this.field40[1][var60][var70] & 0x2) != 0) {
                                    var73 = var6 - 1;
                                }
                                if ((this.field40[var6][var60][var70] & 0x8) != 0) {
                                    var73 = 0;
                                }
                                if (field36 != var73 || (this.field40[var6][var60][var70] & 0x10) != 0) {
                                    continue;
                                }
                            }
                            int var74 = this.field41[var6][var60][var70] & 0xFF;
                            int var75 = this.field42[var6][var60][var70] & 0xFF;
                            if (var74 > 0 || var75 > 0) {
                                int var76 = this.field39[var6][var60][var70];
                                int var77 = this.field39[var6][var60 + 1][var70];
                                int var78 = this.field39[var6][var60 + 1][var70 + 1];
                                int var79 = this.field39[var6][var60][var70 + 1];
                                int var80 = this.field46[var60][var70];
                                int var81 = this.field46[var60 + 1][var70];
                                int var82 = this.field46[var60 + 1][var70 + 1];
                                int var83 = this.field46[var60][var70 + 1];
                                int var84 = -1;
                                if (var74 > 0) {
                                    var84 = this.method26(var65 * 256 / var68, var66 / var69, var67 / var69);
                                }
                                if (var6 > 0 && !field35) {
                                    boolean var85 = true;
                                    if (var74 == 0 && this.field43[var6][var60][var70] != 0) {
                                        var85 = false;
                                    }
                                    if (var75 > 0 && !FloType.field838[var75 - 1].field842) {
                                        var85 = false;
                                    }
                                    if (var85 && var76 == var77 && var76 == var78 && var76 == var79) {
                                        this.field52[var6][var60][var70] |= 0x924;
                                    }
                                }
                                int var86 = 0;
                                if (var84 != -1) {
                                    var86 = Pix3D.field541[method24(var84, 96)];
                                }
                                if (var75 == 0) {
                                    arg1.method41(var6, var60, var70, 0, 0, -1, var76, var77, var78, var79, method24(var84, var80), method24(var84, var81), method24(var84, var82), method24(var84, var83), 0, 0, 0, 0, var86, 0);
                                } else {
                                    int var87 = this.field43[var6][var60][var70] + 1;
                                    byte var88 = this.field44[var6][var60][var70];
                                    FloType var89 = FloType.field838[var75 - 1];
                                    int var90 = var89.field840;
                                    int var91;
                                    int var92;
                                    if (var90 >= 0) {
                                        var91 = Pix3D.method141(var90, 47117);
                                        var92 = -1;
                                    } else if (var89.field839 == 16711935) {
                                        var91 = 0;
                                        var92 = -2;
                                        var90 = -1;
                                    } else {
                                        var92 = this.method26(var89.field844, var89.field845, var89.field846);
                                        var91 = Pix3D.field541[this.method25(var92, 96)];
                                    }
                                    arg1.method41(var6, var60, var70, var87, var88, var90, var76, var77, var78, var79, method24(var84, var80), method24(var84, var81), method24(var84, var82), method24(var84, var83), this.method25(var92, var80), this.method25(var92, var81), this.method25(var92, var82), this.method25(var92, var83), var86, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var61 = 1; var61 < this.field38 - 1; var61++) {
                for (int var62 = 1; var62 < this.field37 - 1; var62++) {
                    int var63 = var6;
                    if (var6 > 0 && (this.field40[1][var62][var61] & 0x2) != 0) {
                        var63 = var6 - 1;
                    }
                    if ((this.field40[var6][var62][var61] & 0x8) != 0) {
                        var63 = 0;
                    }
                    arg1.method40(var6, var62, var61, var63);
                }
            }
        }
        arg1.method64(-50, 64, this.field34, 768, -10, -50);
        for (int var7 = 0; var7 < this.field37; var7++) {
            for (int var49 = 0; var49 < this.field38; var49++) {
                if ((this.field40[1][var7][var49] & 0x2) == 2) {
                    arg1.method38(var7, 53, var49);
                }
            }
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
            for (int var13 = 0; var13 <= var11; var13++) {
                for (int var14 = 0; var14 <= this.field38; var14++) {
                    for (int var15 = 0; var15 <= this.field37; var15++) {
                        if ((this.field52[var13][var15][var14] & var8) != 0) {
                            int var16 = var14;
                            int var17 = var14;
                            int var18 = var13;
                            int var19 = var13;
                            while (var16 > 0 && (this.field52[var13][var15][var16 - 1] & var8) != 0) {
                                var16--;
                            }
                            while (var17 < this.field38 && (this.field52[var13][var15][var17 + 1] & var8) != 0) {
                                var17++;
                            }
                            label331: while (var18 > 0) {
                                for (int var20 = var16; var20 <= var17; var20++) {
                                    if ((this.field52[var18 - 1][var15][var20] & var8) == 0) {
                                        break label331;
                                    }
                                }
                                var18--;
                            }
                            label320: while (var19 < var11) {
                                for (int var21 = var16; var21 <= var17; var21++) {
                                    if ((this.field52[var19 + 1][var15][var21] & var8) == 0) {
                                        break label320;
                                    }
                                }
                                var19++;
                            }
                            int var22 = (var19 + 1 - var18) * (var17 + 1 - var16);
                            if (var22 >= 8) {
                                short var23 = 240;
                                int var24 = this.field39[var19][var15][var16] - var23;
                                int var25 = this.field39[var18][var15][var16];
                                World3D.method39(var15 * 128, var17 * 128 + 128, var24, var16 * 128, 508, 1, var15 * 128, var25, var11);
                                for (int var26 = var18; var26 <= var19; var26++) {
                                    for (int var27 = var16; var27 <= var17; var27++) {
                                        this.field52[var26][var15][var27] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field52[var13][var15][var14] & var9) != 0) {
                            int var28 = var15;
                            int var29 = var15;
                            int var30 = var13;
                            int var31 = var13;
                            while (var28 > 0 && (this.field52[var13][var28 - 1][var14] & var9) != 0) {
                                var28--;
                            }
                            while (var29 < this.field37 && (this.field52[var13][var29 + 1][var14] & var9) != 0) {
                                var29++;
                            }
                            label384: while (var30 > 0) {
                                for (int var32 = var28; var32 <= var29; var32++) {
                                    if ((this.field52[var30 - 1][var32][var14] & var9) == 0) {
                                        break label384;
                                    }
                                }
                                var30--;
                            }
                            label373: while (var31 < var11) {
                                for (int var33 = var28; var33 <= var29; var33++) {
                                    if ((this.field52[var31 + 1][var33][var14] & var9) == 0) {
                                        break label373;
                                    }
                                }
                                var31++;
                            }
                            int var34 = (var31 + 1 - var30) * (var29 + 1 - var28);
                            if (var34 >= 8) {
                                short var35 = 240;
                                int var36 = this.field39[var31][var28][var14] - var35;
                                int var37 = this.field39[var30][var28][var14];
                                World3D.method39(var28 * 128, var14 * 128, var36, var14 * 128, 508, 2, var29 * 128 + 128, var37, var11);
                                for (int var38 = var30; var38 <= var31; var38++) {
                                    for (int var39 = var28; var39 <= var29; var39++) {
                                        this.field52[var38][var39][var14] &= ~var9;
                                    }
                                }
                            }
                        }
                        if (!field35 && (this.field52[var13][var15][var14] & var10) != 0) {
                            int var40 = var15;
                            int var41 = var15;
                            int var42 = var14;
                            int var43 = var14;
                            while (var42 > 0 && (this.field52[var13][var15][var42 - 1] & var10) != 0) {
                                var42--;
                            }
                            while (var43 < this.field38 && (this.field52[var13][var15][var43 + 1] & var10) != 0) {
                                var43++;
                            }
                            label439: while (var40 > 0) {
                                for (int var44 = var42; var44 <= var43; var44++) {
                                    if ((this.field52[var13][var40 - 1][var44] & var10) == 0) {
                                        break label439;
                                    }
                                }
                                var40--;
                            }
                            label428: while (var41 < this.field37) {
                                for (int var45 = var42; var45 <= var43; var45++) {
                                    if ((this.field52[var13][var41 + 1][var45] & var10) == 0) {
                                        break label428;
                                    }
                                }
                                var41++;
                            }
                            if ((var41 + 1 - var40) * (var43 + 1 - var42) >= 4) {
                                int var46 = this.field39[var13][var40][var42];
                                World3D.method39(var40 * 128, var43 * 128 + 128, var46, var42 * 128, 508, 4, var41 * 128 + 128, var46, var11);
                                for (int var47 = var40; var47 <= var41; var47++) {
                                    for (int var48 = var42; var48 <= var43; var48++) {
                                        this.field52[var13][var47][var48] &= ~var10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 >= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
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
        int var4 = 65536 - Pix3D.field530[arg2 * 1024 / arg3] >> 1;
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(ILnb;IIILac;[[[IILq;III)V")
    public static final void method27(int arg0, LinkList arg1, int arg2, int arg3, int arg4, CollisionMap arg5, int[][][] arg6, int arg7, World3D arg8, int arg9, int arg10, int arg11) {
        int var12 = arg6[arg0][arg9][arg2];
        int var13 = arg6[arg0][arg9 + 1][arg2];
        int var14 = arg6[arg0][arg9 + 1][arg2 + 1];
        int var15 = arg6[arg0][arg9][arg2 + 1];
        int var16 = var12 + var13 + var14 + var15 >> 2;
        LocType var17 = LocType.method237(arg7);
        int var18 = (arg7 << 14) + (arg2 << 7) + arg9 + 1073741824;
        int var19 = 62 / arg11;
        if (!var17.field730) {
            var18 += Integer.MIN_VALUE;
        }
        byte var20 = (byte) ((arg4 << 6) + arg10);
        if (arg10 == 22) {
            Model var21 = var17.method240(22, arg4, var12, var13, var14, var15, -1);
            arg8.method42(var21, arg9, var20, 0, var16, arg3, arg2, var18);
            if (var17.field728 && var17.field730) {
                arg5.method259((byte) 0, arg2, arg9);
            }
        } else if (arg10 == 10 || arg10 == 11) {
            Model var37 = var17.method240(10, arg4, var12, var13, var14, var15, -1);
            if (var37 != null) {
                int var38 = 0;
                if (arg10 == 11) {
                    var38 += 256;
                }
                int var39;
                int var40;
                if (arg4 == 1 || arg4 == 3) {
                    var39 = var17.field727;
                    var40 = var17.field726;
                } else {
                    var39 = var17.field726;
                    var40 = var17.field727;
                }
                arg8.method46(var18, arg2, var37, var40, (byte) -14, var38, arg3, arg9, var16, var20, null, var39);
            }
            if (var17.field728) {
                arg5.method258(true, var17.field726, arg9, arg2, var17.field729, arg4, var17.field727);
            }
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(2, arg3, arg7, 5858, SeqType.field927[var17.field734], arg9, arg2));
            }
        } else if (arg10 >= 12) {
            Model var22 = var17.method240(arg10, arg4, var12, var13, var14, var15, -1);
            arg8.method46(var18, arg2, var22, 1, (byte) -14, 0, arg3, arg9, var16, var20, null, 1);
            if (var17.field728) {
                arg5.method258(true, var17.field726, arg9, arg2, var17.field729, arg4, var17.field727);
            }
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(2, arg3, arg7, 5858, SeqType.field927[var17.field734], arg9, arg2));
            }
        } else if (arg10 == 0) {
            Model var23 = var17.method240(0, arg4, var12, var13, var14, var15, -1);
            arg8.method44(var16, field53[arg4], var20, 0, var18, (byte) -120, arg2, arg9, null, arg3, var23);
            if (var17.field728) {
                arg5.method257(arg9, var17.field729, arg10, arg2, -34301, arg4);
            }
        } else if (arg10 == 1) {
            Model var24 = var17.method240(1, arg4, var12, var13, var14, var15, -1);
            arg8.method44(var16, field54[arg4], var20, 0, var18, (byte) -120, arg2, arg9, null, arg3, var24);
            if (var17.field728) {
                arg5.method257(arg9, var17.field729, arg10, arg2, -34301, arg4);
            }
        } else if (arg10 == 2) {
            int var25 = arg4 + 1 & 0x3;
            Model var26 = var17.method240(2, arg4 + 4, var12, var13, var14, var15, -1);
            Model var27 = var17.method240(2, var25, var12, var13, var14, var15, -1);
            arg8.method44(var16, field53[arg4], var20, field53[var25], var18, (byte) -120, arg2, arg9, var27, arg3, var26);
            if (var17.field728) {
                arg5.method257(arg9, var17.field729, arg10, arg2, -34301, arg4);
            }
        } else if (arg10 == 3) {
            Model var28 = var17.method240(3, arg4, var12, var13, var14, var15, -1);
            arg8.method44(var16, field54[arg4], var20, 0, var18, (byte) -120, arg2, arg9, null, arg3, var28);
            if (var17.field728) {
                arg5.method257(arg9, var17.field729, arg10, arg2, -34301, arg4);
            }
        } else if (arg10 == 9) {
            Model var29 = var17.method240(arg10, arg4, var12, var13, var14, var15, -1);
            arg8.method46(var18, arg2, var29, 1, (byte) -14, 0, arg3, arg9, var16, var20, null, 1);
            if (var17.field728) {
                arg5.method258(true, var17.field726, arg9, arg2, var17.field729, arg4, var17.field727);
            }
        } else if (arg10 == 4) {
            Model var30 = var17.method240(4, 0, var12, var13, var14, var15, -1);
            arg8.method45(var20, var18, var30, 0, arg9, false, field53[arg4], arg3, var16, arg2, arg4 * 512, 0);
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(1, arg3, arg7, 5858, SeqType.field927[var17.field734], arg9, arg2));
            }
        } else if (arg10 == 5) {
            int var31 = 16;
            int var32 = arg8.method59(arg3, arg9, arg2);
            if (var32 > 0) {
                var31 = LocType.method237(var32 >> 14 & 0x7FFF).field735;
            }
            Model var33 = var17.method240(4, 0, var12, var13, var14, var15, -1);
            arg8.method45(var20, var18, var33, field56[arg4] * var31, arg9, false, field53[arg4], arg3, var16, arg2, arg4 * 512, field55[arg4] * var31);
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(1, arg3, arg7, 5858, SeqType.field927[var17.field734], arg9, arg2));
            }
        } else if (arg10 == 6) {
            Model var34 = var17.method240(4, 0, var12, var13, var14, var15, -1);
            arg8.method45(var20, var18, var34, 0, arg9, false, 256, arg3, var16, arg2, arg4, 0);
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(1, arg3, arg7, 5858, SeqType.field927[var17.field734], arg9, arg2));
            }
        } else if (arg10 == 7) {
            Model var35 = var17.method240(4, 0, var12, var13, var14, var15, -1);
            arg8.method45(var20, var18, var35, 0, arg9, false, 512, arg3, var16, arg2, arg4, 0);
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(1, arg3, arg7, 5858, SeqType.field927[var17.field734], arg9, arg2));
            }
        } else if (arg10 == 8) {
            Model var36 = var17.method240(4, 0, var12, var13, var14, var15, -1);
            arg8.method45(var20, var18, var36, 0, arg9, false, 768, arg3, var16, arg2, arg4, 0);
            if (var17.field734 != -1) {
                arg1.method201(new LocEntity(1, arg3, arg7, 5858, SeqType.field927[var17.field734], arg9, arg2));
            }
        }
    }
}
