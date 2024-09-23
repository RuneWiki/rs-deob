import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "a", descriptor = "Z")
    private boolean field37 = false;

    @OriginalMember(owner = "c", name = "c", descriptor = "I")
    private int field39 = -80;

    @OriginalMember(owner = "c", name = "h", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "c", name = "i", descriptor = "I")
    private int field45;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[I")
    private int[][][] field46;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field47;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field48;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field49;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field50;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field51;

    @OriginalMember(owner = "c", name = "w", descriptor = "[[[I")
    private int[][][] field59;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[[B")
    private byte[][][] field52;

    @OriginalMember(owner = "c", name = "q", descriptor = "[[I")
    private int[][] field53;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field54;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field55;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field57;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "c", name = "b", descriptor = "I")
    private static int field38 = -43626;

    @OriginalMember(owner = "c", name = "d", descriptor = "I")
    private static int field40 = 4;

    @OriginalMember(owner = "c", name = "e", descriptor = "Z")
    public static boolean field41 = true;

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field60 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field61 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field62 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "A", descriptor = "[I")
    private static final int[] field63 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "f", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "c", name = "g", descriptor = "Z")
    public static boolean field43;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(I[[[III[[[B)V")
    public World(int arg0, int[][][] arg1, int arg2, int arg3, byte[][][] arg4) {
        this.field44 = arg3;
        this.field45 = arg0;
        this.field46 = arg1;
        this.field47 = arg4;
        this.field48 = new byte[4][this.field44][this.field45];
        this.field49 = new byte[4][this.field44][this.field45];
        this.field50 = new byte[4][this.field44][this.field45];
        if (arg2 != 0) {
            field38 = -148;
        }
        this.field51 = new byte[4][this.field44][this.field45];
        this.field59 = new int[4][this.field44 + 1][this.field45 + 1];
        this.field52 = new byte[4][this.field44 + 1][this.field45 + 1];
        this.field53 = new int[this.field44 + 1][this.field45 + 1];
        this.field54 = new int[this.field45];
        this.field55 = new int[this.field45];
        this.field56 = new int[this.field45];
        this.field57 = new int[this.field45];
        this.field58 = new int[this.field45];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIII)V")
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 0;
        for (int var7 = 0; var7 < FloType.field931; var7++) {
            if (FloType.field932[var7].field937.equalsIgnoreCase("water")) {
                var6 = (byte) (var7 + 1);
                break;
            }
        }
        for (int var8 = arg1; var8 < arg1 + arg4; var8++) {
            for (int var9 = arg2; var9 < arg2 + arg3; var9++) {
                if (var9 >= 0 && var9 < this.field44 && var8 >= 0 && var8 < this.field45) {
                    this.field49[0][var9][var8] = var6;
                    for (int var10 = 0; var10 < 4; var10++) {
                        this.field46[var10][var9][var8] = 0;
                        this.field47[var10][var9][var8] = 0;
                    }
                }
            }
        }
        if (arg0 == -41617) {
            ;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(I[BIIII)V")
    public final void method15(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        Packet var7 = new Packet(0, arg1);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg3 + var9;
                    int var12 = arg5 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field47[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method209();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field46[0][var11][var12] = -method20(var11 + arg4 + 932731, var12 + 556238 + arg2) * 8;
                                } else {
                                    this.field46[var8][var11][var12] = this.field46[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method209();
                                if (var14 == 1) {
                                    var14 = 0;
                                }
                                if (var8 == 0) {
                                    this.field46[0][var11][var12] = -var14 * 8;
                                } else {
                                    this.field46[var8][var11][var12] = this.field46[var8 - 1][var11][var12] - var14 * 8;
                                }
                                break;
                            }
                            if (var13 <= 49) {
                                this.field49[var8][var11][var12] = var7.method210();
                                this.field50[var8][var11][var12] = (byte) ((var13 - 2) / 4);
                                this.field51[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
                            } else if (var13 <= 81) {
                                this.field47[var8][var11][var12] = (byte) (var13 - 49);
                            } else {
                                this.field48[var8][var11][var12] = (byte) (var13 - 81);
                            }
                        }
                    } else {
                        while (true) {
                            int var15 = var7.method209();
                            if (var15 == 0) {
                                break;
                            }
                            if (var15 == 1) {
                                var7.method209();
                                break;
                            }
                            if (var15 <= 49) {
                                var7.method209();
                            }
                        }
                    }
                }
            }
        }
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(I[BLob;[Lec;IILr;)V")
    public final void method16(int arg0, byte[] arg1, LinkList arg2, CollisionMap[] arg3, int arg4, int arg5, World3D arg6) {
        Packet var8 = new Packet(0, arg1);
        if (arg5 != -31192) {
            return;
        }
        int var9 = -1;
        while (true) {
            int var10 = var8.method223();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method223();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var8.method209();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg0 + var14;
                int var20 = arg4 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field47[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    CollisionMap var22 = null;
                    if (var21 >= 0) {
                        var22 = arg3[var21];
                    }
                    this.method17(var9, arg6, var19, arg2, var18, var20, var15, var22, var17, (byte) 8);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(ILr;ILob;IIILec;IB)V")
    private final void method17(int arg0, World3D arg1, int arg2, LinkList arg3, int arg4, int arg5, int arg6, CollisionMap arg7, int arg8, byte arg9) {
        if (field41) {
            if ((this.field47[arg6][arg2][arg5] & 0x10) != 0) {
                return;
            }
            if (this.method19(-80, arg6, arg5, arg2) != field42) {
                return;
            }
        }
        int var11 = this.field46[arg6][arg2][arg5];
        int var12 = this.field46[arg6][arg2 + 1][arg5];
        int var13 = this.field46[arg6][arg2 + 1][arg5 + 1];
        int var14 = this.field46[arg6][arg2][arg5 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        if (arg9 == 8) {
            boolean var16 = false;
        } else {
            for (int var17 = 1; var17 > 0; var17++) {
            }
        }
        LocType var18 = LocType.method275(arg0);
        int var19 = (arg0 << 14) + (arg5 << 7) + arg2 + 1073741824;
        if (!var18.field817) {
            var19 += Integer.MIN_VALUE;
        }
        byte var20 = (byte) ((arg4 << 6) + arg8);
        if (arg8 == 22) {
            if (!field41 || var18.field817 || var18.field838) {
                Model var21 = var18.method278(22, arg4, var11, var12, var13, var14, -1);
                arg1.method56(var19, arg2, var21, arg6, var20, var15, 1, arg5);
                if (var18.field815 && var18.field817 && arg7 != null) {
                    arg7.method298(arg5, arg2, 4);
                }
                if (var18.field821 != -1) {
                    arg3.method225(new LocEntity(3, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            Model var37 = var18.method278(10, arg4, var11, var12, var13, var14, -1);
            if (var37 != null) {
                int var38 = 0;
                if (arg8 == 11) {
                    var38 += 256;
                }
                int var39;
                int var40;
                if (arg4 == 1 || arg4 == 3) {
                    var39 = var18.field814;
                    var40 = var18.field813;
                } else {
                    var39 = var18.field813;
                    var40 = var18.field814;
                }
                if (arg1.method60(arg2, var19, var20, var37, null, var39, var38, var40, -16736, arg6, arg5, var15) && var18.field830) {
                    for (int var41 = 0; var41 <= var39; var41++) {
                        for (int var42 = 0; var42 <= var40; var42++) {
                            int var43 = var37.field470 / 4;
                            if (var43 > 30) {
                                var43 = 30;
                            }
                            if (var43 > this.field52[arg6][arg2 + var41][arg5 + var42]) {
                                this.field52[arg6][arg2 + var41][arg5 + var42] = (byte) var43;
                            }
                        }
                    }
                }
            }
            if (var18.field815 && arg7 != null) {
                arg7.method297(arg2, 3, var18.field813, var18.field814, arg4, var18.field816, arg5);
            }
            if (var18.field821 != -1) {
                arg3.method225(new LocEntity(2, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
            }
        } else if (arg8 >= 12) {
            Model var22 = var18.method278(arg8, arg4, var11, var12, var13, var14, -1);
            arg1.method60(arg2, var19, var20, var22, null, 1, 0, 1, -16736, arg6, arg5, var15);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg6 > 0) {
                this.field59[arg6][arg2][arg5] |= 0x924;
            }
            if (var18.field815 && arg7 != null) {
                arg7.method297(arg2, 3, var18.field813, var18.field814, arg4, var18.field816, arg5);
            }
            if (var18.field821 != -1) {
                arg3.method225(new LocEntity(2, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
            }
        } else if (arg8 == 0) {
            Model var23 = var18.method278(0, arg4, var11, var12, var13, var14, -1);
            arg1.method58(null, 0, arg5, field60[arg4], arg2, 0, var19, arg6, var20, var15, var23);
            if (arg4 == 0) {
                if (var18.field830) {
                    this.field52[arg6][arg2][arg5] = 50;
                    this.field52[arg6][arg2][arg5 + 1] = 50;
                }
                if (var18.field820) {
                    this.field59[arg6][arg2][arg5] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var18.field830) {
                    this.field52[arg6][arg2][arg5 + 1] = 50;
                    this.field52[arg6][arg2 + 1][arg5 + 1] = 50;
                }
                if (var18.field820) {
                    this.field59[arg6][arg2][arg5 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var18.field830) {
                    this.field52[arg6][arg2 + 1][arg5] = 50;
                    this.field52[arg6][arg2 + 1][arg5 + 1] = 50;
                }
                if (var18.field820) {
                    this.field59[arg6][arg2 + 1][arg5] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var18.field830) {
                    this.field52[arg6][arg2][arg5] = 50;
                    this.field52[arg6][arg2 + 1][arg5] = 50;
                }
                if (var18.field820) {
                    this.field59[arg6][arg2][arg5] |= 0x492;
                }
            }
            if (var18.field815 && arg7 != null) {
                arg7.method296(var18.field816, 8, arg4, arg2, arg5, arg8);
            }
            if (var18.field821 != -1) {
                arg3.method225(new LocEntity(0, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
            }
            if (var18.field822 != 16) {
                arg1.method67(var18.field822, arg5, arg6, arg2, (byte) 4);
            }
        } else if (arg8 == 1) {
            Model var24 = var18.method278(1, arg4, var11, var12, var13, var14, -1);
            arg1.method58(null, 0, arg5, field61[arg4], arg2, 0, var19, arg6, var20, var15, var24);
            if (var18.field830) {
                if (arg4 == 0) {
                    this.field52[arg6][arg2][arg5 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field52[arg6][arg2 + 1][arg5 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field52[arg6][arg2 + 1][arg5] = 50;
                } else if (arg4 == 3) {
                    this.field52[arg6][arg2][arg5] = 50;
                }
            }
            if (var18.field815 && arg7 != null) {
                arg7.method296(var18.field816, 8, arg4, arg2, arg5, arg8);
            }
            if (var18.field821 != -1) {
                arg3.method225(new LocEntity(0, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
            }
        } else if (arg8 == 2) {
            int var25 = arg4 + 1 & 0x3;
            Model var26 = var18.method278(2, arg4 + 4, var11, var12, var13, var14, -1);
            Model var27 = var18.method278(2, var25, var11, var12, var13, var14, -1);
            arg1.method58(var27, field60[var25], arg5, field60[arg4], arg2, 0, var19, arg6, var20, var15, var26);
            if (var18.field820) {
                if (arg4 == 0) {
                    this.field59[arg6][arg2][arg5] |= 0x249;
                    this.field59[arg6][arg2][arg5 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    this.field59[arg6][arg2][arg5 + 1] |= 0x492;
                    this.field59[arg6][arg2 + 1][arg5] |= 0x249;
                } else if (arg4 == 2) {
                    this.field59[arg6][arg2 + 1][arg5] |= 0x249;
                    this.field59[arg6][arg2][arg5] |= 0x492;
                } else if (arg4 == 3) {
                    this.field59[arg6][arg2][arg5] |= 0x492;
                    this.field59[arg6][arg2][arg5] |= 0x249;
                }
            }
            if (var18.field815 && arg7 != null) {
                arg7.method296(var18.field816, 8, arg4, arg2, arg5, arg8);
            }
            if (var18.field821 != -1) {
                arg3.method225(new LocEntity(0, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
            }
            if (var18.field822 != 16) {
                arg1.method67(var18.field822, arg5, arg6, arg2, (byte) 4);
            }
        } else if (arg8 == 3) {
            Model var28 = var18.method278(3, arg4, var11, var12, var13, var14, -1);
            arg1.method58(null, 0, arg5, field61[arg4], arg2, 0, var19, arg6, var20, var15, var28);
            if (var18.field830) {
                if (arg4 == 0) {
                    this.field52[arg6][arg2][arg5 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field52[arg6][arg2 + 1][arg5 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field52[arg6][arg2 + 1][arg5] = 50;
                } else if (arg4 == 3) {
                    this.field52[arg6][arg2][arg5] = 50;
                }
            }
            if (var18.field815 && arg7 != null) {
                arg7.method296(var18.field816, 8, arg4, arg2, arg5, arg8);
            }
            if (var18.field821 != -1) {
                arg3.method225(new LocEntity(0, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
            }
        } else if (arg8 == 9) {
            Model var29 = var18.method278(arg8, arg4, var11, var12, var13, var14, -1);
            arg1.method60(arg2, var19, var20, var29, null, 1, 0, 1, -16736, arg6, arg5, var15);
            if (var18.field815 && arg7 != null) {
                arg7.method297(arg2, 3, var18.field813, var18.field814, arg4, var18.field816, arg5);
            }
            if (var18.field821 != -1) {
                arg3.method225(new LocEntity(2, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
            }
        } else if (arg8 == 4) {
            Model var30 = var18.method278(4, 0, var11, var12, var13, var14, -1);
            arg1.method59(var20, var30, (byte) 45, field60[arg4], arg4 * 512, arg2, 0, var15, 0, arg5, var19, arg6);
            if (var18.field821 != -1) {
                arg3.method225(new LocEntity(1, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
            }
        } else if (arg8 == 5) {
            int var31 = 16;
            int var32 = arg1.method77(arg6, arg2, arg5);
            if (var32 > 0) {
                var31 = LocType.method275(var32 >> 14 & 0x7FFF).field822;
            }
            Model var33 = var18.method278(4, 0, var11, var12, var13, var14, -1);
            arg1.method59(var20, var33, (byte) 45, field60[arg4], arg4 * 512, arg2, field62[arg4] * var31, var15, field63[arg4] * var31, arg5, var19, arg6);
            if (var18.field821 != -1) {
                arg3.method225(new LocEntity(1, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
            }
        } else if (arg8 == 6) {
            Model var34 = var18.method278(4, 0, var11, var12, var13, var14, -1);
            arg1.method59(var20, var34, (byte) 45, 256, arg4, arg2, 0, var15, 0, arg5, var19, arg6);
            if (var18.field821 != -1) {
                arg3.method225(new LocEntity(1, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
            }
        } else if (arg8 == 7) {
            Model var35 = var18.method278(4, 0, var11, var12, var13, var14, -1);
            arg1.method59(var20, var35, (byte) 45, 512, arg4, arg2, 0, var15, 0, arg5, var19, arg6);
            if (var18.field821 != -1) {
                arg3.method225(new LocEntity(1, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
            }
        } else if (arg8 == 8) {
            Model var36 = var18.method278(4, 0, var11, var12, var13, var14, -1);
            arg1.method59(var20, var36, (byte) 45, 768, arg4, arg2, 0, var15, 0, arg5, var19, arg6);
            if (var18.field821 != -1) {
                arg3.method225(new LocEntity(1, arg5, arg6, true, SeqType.field1023[var18.field821], field40, arg0, arg2));
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;B[Lec;)V")
    public final void method18(World3D arg0, byte arg1, CollisionMap[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var105 = 0; var105 < 104; var105++) {
                for (int var106 = 0; var106 < 104; var106++) {
                    if ((this.field47[var4][var105][var106] & 0x1) == 1) {
                        int var107 = var4;
                        if ((this.field47[1][var105][var106] & 0x2) == 2) {
                            var107 = var4 - 1;
                        }
                        if (var107 >= 0) {
                            arg2[var107].method298(var106, var105, 4);
                        }
                    }
                }
            }
        }
        if (arg1 != 8) {
            return;
        }
        boolean var5 = false;
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var49 = this.field52[var6];
            byte var50 = 96;
            short var51 = 768;
            byte var52 = -50;
            byte var53 = -10;
            byte var54 = -50;
            int var55 = (int) Math.sqrt((double) (var54 * var54 + var52 * var52 + var53 * var53));
            int var56 = var51 * var55 >> 8;
            for (int var57 = 1; var57 < this.field45 - 1; var57++) {
                for (int var96 = 1; var96 < this.field44 - 1; var96++) {
                    int var97 = this.field46[var6][var96 + 1][var57] - this.field46[var6][var96 - 1][var57];
                    int var98 = this.field46[var6][var96][var57 + 1] - this.field46[var6][var96][var57 - 1];
                    int var99 = (int) Math.sqrt((double) (var98 * var98 + var97 * var97 + 65536));
                    int var100 = (var97 << 8) / var99;
                    int var101 = 65536 / var99;
                    int var102 = (var98 << 8) / var99;
                    int var103 = (var54 * var102 + var52 * var100 + var53 * var101) / var56 + var50;
                    int var104 = (var49[var96][var57] >> 1) + (var49[var96][var57 + 1] >> 3) + (var49[var96][var57 - 1] >> 2) + (var49[var96 - 1][var57] >> 2) + (var49[var96 + 1][var57] >> 3);
                    this.field53[var96][var57] = var103 - var104;
                }
            }
            for (int var58 = 0; var58 < this.field45; var58++) {
                this.field54[var58] = 0;
                this.field55[var58] = 0;
                this.field56[var58] = 0;
                this.field57[var58] = 0;
                this.field58[var58] = 0;
            }
            for (int var59 = -5; var59 < this.field44 + 5; var59++) {
                for (int var62 = 0; var62 < this.field45; var62++) {
                    int var90 = var59 + 5;
                    int var10002;
                    if (var90 >= 0 && var90 < this.field44) {
                        int var91 = this.field48[var6][var90][var62] & 0xFF;
                        if (var91 > 0) {
                            FloType var92 = FloType.field932[var91 - 1];
                            this.field54[var62] += var92.field941;
                            this.field55[var62] += var92.field939;
                            this.field56[var62] += var92.field940;
                            this.field57[var62] += var92.field942;
                            var10002 = this.field58[var62]++;
                        }
                    }
                    int var93 = var59 - 5;
                    if (var93 >= 0 && var93 < this.field44) {
                        int var94 = this.field48[var6][var93][var62] & 0xFF;
                        if (var94 > 0) {
                            FloType var95 = FloType.field932[var94 - 1];
                            this.field54[var62] -= var95.field941;
                            this.field55[var62] -= var95.field939;
                            this.field56[var62] -= var95.field940;
                            this.field57[var62] -= var95.field942;
                            var10002 = this.field58[var62]--;
                        }
                    }
                }
                if (var59 >= 1 && var59 < this.field44 - 1) {
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    for (int var68 = -5; var68 < this.field45 + 5; var68++) {
                        int var69 = var68 + 5;
                        if (var69 >= 0 && var69 < this.field45) {
                            var63 += this.field54[var69];
                            var64 += this.field55[var69];
                            var65 += this.field56[var69];
                            var66 += this.field57[var69];
                            var67 += this.field58[var69];
                        }
                        int var70 = var68 - 5;
                        if (var70 >= 0 && var70 < this.field45) {
                            var63 -= this.field54[var70];
                            var64 -= this.field55[var70];
                            var65 -= this.field56[var70];
                            var66 -= this.field57[var70];
                            var67 -= this.field58[var70];
                        }
                        if (var68 >= 1 && var68 < this.field45 - 1 && (!field41 || (this.field47[var6][var59][var68] & 0x10) == 0 && this.method19(-80, var6, var68, var59) == field42)) {
                            int var71 = this.field48[var6][var59][var68] & 0xFF;
                            int var72 = this.field49[var6][var59][var68] & 0xFF;
                            if (var71 > 0 || var72 > 0) {
                                int var73 = this.field46[var6][var59][var68];
                                int var74 = this.field46[var6][var59 + 1][var68];
                                int var75 = this.field46[var6][var59 + 1][var68 + 1];
                                int var76 = this.field46[var6][var59][var68 + 1];
                                int var77 = this.field53[var59][var68];
                                int var78 = this.field53[var59 + 1][var68];
                                int var79 = this.field53[var59 + 1][var68 + 1];
                                int var80 = this.field53[var59][var68 + 1];
                                int var81 = -1;
                                if (var71 > 0) {
                                    var81 = this.method27(var63 * 256 / var66, var64 / var67, var65 / var67);
                                }
                                if (var6 > 0) {
                                    boolean var82 = true;
                                    if (var71 == 0 && this.field50[var6][var59][var68] != 0) {
                                        var82 = false;
                                    }
                                    if (var72 > 0 && !FloType.field932[var72 - 1].field936) {
                                        var82 = false;
                                    }
                                    if (var82 && var73 == var74 && var73 == var75 && var73 == var76) {
                                        this.field59[var6][var59][var68] |= 0x924;
                                    }
                                }
                                int var83 = 0;
                                if (var81 != -1) {
                                    var83 = Pix3D.field571[method25(var81, 96)];
                                }
                                if (var72 == 0) {
                                    arg0.method55(var6, var59, var68, 0, 0, -1, var73, var74, var75, var76, method25(var81, var77), method25(var81, var78), method25(var81, var79), method25(var81, var80), 0, 0, 0, 0, var83, 0);
                                } else {
                                    int var84 = this.field50[var6][var59][var68] + 1;
                                    byte var85 = this.field51[var6][var59][var68];
                                    FloType var86 = FloType.field932[var72 - 1];
                                    int var87 = var86.field934;
                                    int var88;
                                    int var89;
                                    if (var87 >= 0) {
                                        var88 = Pix3D.method159((byte) -127, var87);
                                        var89 = -1;
                                    } else if (var86.field933 == 16711935) {
                                        var88 = 0;
                                        var89 = -2;
                                        var87 = -1;
                                    } else {
                                        var89 = this.method27(var86.field938, var86.field939, var86.field940);
                                        var88 = Pix3D.field571[this.method26(var89, 96)];
                                    }
                                    arg0.method55(var6, var59, var68, var84, var85, var87, var73, var74, var75, var76, method25(var81, var77), method25(var81, var78), method25(var81, var79), method25(var81, var80), this.method26(var89, var77), this.method26(var89, var78), this.method26(var89, var79), this.method26(var89, var80), var83, var88);
                                }
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < this.field45 - 1; var60++) {
                for (int var61 = 1; var61 < this.field44 - 1; var61++) {
                    arg0.method54(var6, var61, var60, this.method19(-80, var6, var60, var61));
                }
            }
        }
        if (!field43) {
            arg0.method82(768, -10, 64, -50, true, -50);
        }
        for (int var7 = 0; var7 < this.field44; var7++) {
            for (int var48 = 0; var48 < this.field45; var48++) {
                if ((this.field47[1][var7][var48] & 0x2) == 2) {
                    arg0.method52(var7, var48, (byte) 26);
                }
            }
        }
        if (field43) {
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
                for (int var13 = 0; var13 <= this.field45; var13++) {
                    for (int var14 = 0; var14 <= this.field44; var14++) {
                        if ((this.field59[var12][var14][var13] & var8) != 0) {
                            int var15 = var13;
                            int var16 = var13;
                            int var17 = var12;
                            int var18 = var12;
                            while (var15 > 0 && (this.field59[var12][var14][var15 - 1] & var8) != 0) {
                                var15--;
                            }
                            while (var16 < this.field45 && (this.field59[var12][var14][var16 + 1] & var8) != 0) {
                                var16++;
                            }
                            label311: while (var17 > 0) {
                                for (int var19 = var15; var19 <= var16; var19++) {
                                    if ((this.field59[var17 - 1][var14][var19] & var8) == 0) {
                                        break label311;
                                    }
                                }
                                var17--;
                            }
                            label300: while (var18 < var11) {
                                for (int var20 = var15; var20 <= var16; var20++) {
                                    if ((this.field59[var18 + 1][var14][var20] & var8) == 0) {
                                        break label300;
                                    }
                                }
                                var18++;
                            }
                            int var21 = (var18 + 1 - var17) * (var16 - var15 + 1);
                            if (var21 >= 8) {
                                short var22 = 240;
                                int var23 = this.field46[var18][var14][var15] - var22;
                                int var24 = this.field46[var17][var14][var15];
                                World3D.method53(true, var16 * 128 + 128, var15 * 128, var14 * 128, var11, var23, var24, var14 * 128, 1);
                                for (int var25 = var17; var25 <= var18; var25++) {
                                    for (int var26 = var15; var26 <= var16; var26++) {
                                        this.field59[var25][var14][var26] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field59[var12][var14][var13] & var9) != 0) {
                            int var27 = var14;
                            int var28 = var14;
                            int var29 = var12;
                            int var30 = var12;
                            while (var27 > 0 && (this.field59[var12][var27 - 1][var13] & var9) != 0) {
                                var27--;
                            }
                            while (var28 < this.field44 && (this.field59[var12][var28 + 1][var13] & var9) != 0) {
                                var28++;
                            }
                            label364: while (var29 > 0) {
                                for (int var31 = var27; var31 <= var28; var31++) {
                                    if ((this.field59[var29 - 1][var31][var13] & var9) == 0) {
                                        break label364;
                                    }
                                }
                                var29--;
                            }
                            label353: while (var30 < var11) {
                                for (int var32 = var27; var32 <= var28; var32++) {
                                    if ((this.field59[var30 + 1][var32][var13] & var9) == 0) {
                                        break label353;
                                    }
                                }
                                var30++;
                            }
                            int var33 = (var30 + 1 - var29) * (var28 - var27 + 1);
                            if (var33 >= 8) {
                                short var34 = 240;
                                int var35 = this.field46[var30][var27][var13] - var34;
                                int var36 = this.field46[var29][var27][var13];
                                World3D.method53(true, var13 * 128, var13 * 128, var28 * 128 + 128, var11, var35, var36, var27 * 128, 2);
                                for (int var37 = var29; var37 <= var30; var37++) {
                                    for (int var38 = var27; var38 <= var28; var38++) {
                                        this.field59[var37][var38][var13] &= ~var9;
                                    }
                                }
                            }
                        }
                        if ((this.field59[var12][var14][var13] & var10) != 0) {
                            int var39 = var14;
                            int var40 = var14;
                            int var41 = var13;
                            int var42 = var13;
                            while (var41 > 0 && (this.field59[var12][var14][var41 - 1] & var10) != 0) {
                                var41--;
                            }
                            while (var42 < this.field45 && (this.field59[var12][var14][var42 + 1] & var10) != 0) {
                                var42++;
                            }
                            label417: while (var39 > 0) {
                                for (int var43 = var41; var43 <= var42; var43++) {
                                    if ((this.field59[var12][var39 - 1][var43] & var10) == 0) {
                                        break label417;
                                    }
                                }
                                var39--;
                            }
                            label406: while (var40 < this.field44) {
                                for (int var44 = var41; var44 <= var42; var44++) {
                                    if ((this.field59[var12][var40 + 1][var44] & var10) == 0) {
                                        break label406;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var39) * (var42 - var41 + 1) >= 4) {
                                int var45 = this.field46[var12][var39][var41];
                                World3D.method53(true, var42 * 128 + 128, var41 * 128, var40 * 128 + 128, var11, var45, var45, var39 * 128, 4);
                                for (int var46 = var39; var46 <= var40; var46++) {
                                    for (int var47 = var41; var47 <= var42; var47++) {
                                        this.field59[var12][var46][var47] &= ~var10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII)I")
    public int method19(int arg0, int arg1, int arg2, int arg3) {
        while (arg0 >= 0) {
            this.field37 = !this.field37;
        }
        if ((this.field47[arg1][arg3][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (this.field47[1][arg3][arg2] & 0x2) == 0) {
            return arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II)I")
    private static final int method20(int arg0, int arg1) {
        int var2 = method21(arg0 + 45365, arg1 + 91923, 4) + (method21(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method21(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(III)I")
    private static final int method21(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method23(var3, var5);
        int var8 = method23(var3 + 1, var5);
        int var9 = method23(var3, var5 + 1);
        int var10 = method23(var3 + 1, var5 + 1);
        int var11 = method22(var7, var8, var4, arg2);
        int var12 = method22(var9, var10, var4, arg2);
        return method22(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "c", name = "b", descriptor = "(IIII)I")
    private static final int method22(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - Pix3D.field560[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "c", name = "b", descriptor = "(II)I")
    private static final int method23(int arg0, int arg1) {
        int var2 = method24(arg0 - 1, arg1 - 1) + method24(arg0 + 1, arg1 - 1) + method24(arg0 - 1, arg1 + 1) + method24(arg0 + 1, arg1 + 1);
        int var3 = method24(arg0 - 1, arg1) + method24(arg0 + 1, arg1) + method24(arg0, arg1 - 1) + method24(arg0, arg1 + 1);
        int var4 = method24(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "c", name = "c", descriptor = "(II)I")
    private static final int method24(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "c", name = "d", descriptor = "(II)I")
    private static final int method25(int arg0, int arg1) {
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
    private final int method26(int arg0, int arg1) {
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
    private final int method27(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lec;II[[[IBILob;IILr;II)V")
    public static final void method28(CollisionMap arg0, int arg1, int arg2, int[][][] arg3, byte arg4, int arg5, LinkList arg6, int arg7, int arg8, World3D arg9, int arg10, int arg11) {
        int var12 = arg3[arg10][arg7][arg2];
        int var13 = arg3[arg10][arg7 + 1][arg2];
        if (arg4 != 1) {
            field38 = 366;
        }
        int var14 = arg3[arg10][arg7 + 1][arg2 + 1];
        int var15 = arg3[arg10][arg7][arg2 + 1];
        int var16 = var12 + var13 + var14 + var15 >> 2;
        LocType var17 = LocType.method275(arg5);
        int var18 = (arg5 << 14) + (arg2 << 7) + arg7 + 1073741824;
        if (!var17.field817) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg11 << 6) + arg8);
        if (arg8 == 22) {
            Model var20 = var17.method278(22, arg11, var12, var13, var14, var15, -1);
            arg9.method56(var18, arg7, var20, arg1, var19, var16, 1, arg2);
            if (var17.field815 && var17.field817) {
                arg0.method298(arg2, arg7, 4);
            }
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(3, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        } else if (arg8 == 10 || arg8 == 11) {
            Model var36 = var17.method278(10, arg11, var12, var13, var14, var15, -1);
            if (var36 != null) {
                int var37 = 0;
                if (arg8 == 11) {
                    var37 += 256;
                }
                int var38;
                int var39;
                if (arg11 == 1 || arg11 == 3) {
                    var38 = var17.field814;
                    var39 = var17.field813;
                } else {
                    var38 = var17.field813;
                    var39 = var17.field814;
                }
                arg9.method60(arg7, var18, var19, var36, null, var38, var37, var39, -16736, arg1, arg2, var16);
            }
            if (var17.field815) {
                arg0.method297(arg7, 3, var17.field813, var17.field814, arg11, var17.field816, arg2);
            }
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(2, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        } else if (arg8 >= 12) {
            Model var21 = var17.method278(arg8, arg11, var12, var13, var14, var15, -1);
            arg9.method60(arg7, var18, var19, var21, null, 1, 0, 1, -16736, arg1, arg2, var16);
            if (var17.field815) {
                arg0.method297(arg7, 3, var17.field813, var17.field814, arg11, var17.field816, arg2);
            }
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(2, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        } else if (arg8 == 0) {
            Model var22 = var17.method278(0, arg11, var12, var13, var14, var15, -1);
            arg9.method58(null, 0, arg2, field60[arg11], arg7, 0, var18, arg1, var19, var16, var22);
            if (var17.field815) {
                arg0.method296(var17.field816, 8, arg11, arg7, arg2, arg8);
            }
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(0, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        } else if (arg8 == 1) {
            Model var23 = var17.method278(1, arg11, var12, var13, var14, var15, -1);
            arg9.method58(null, 0, arg2, field61[arg11], arg7, 0, var18, arg1, var19, var16, var23);
            if (var17.field815) {
                arg0.method296(var17.field816, 8, arg11, arg7, arg2, arg8);
            }
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(0, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        } else if (arg8 == 2) {
            int var24 = arg11 + 1 & 0x3;
            Model var25 = var17.method278(2, arg11 + 4, var12, var13, var14, var15, -1);
            Model var26 = var17.method278(2, var24, var12, var13, var14, var15, -1);
            arg9.method58(var26, field60[var24], arg2, field60[arg11], arg7, 0, var18, arg1, var19, var16, var25);
            if (var17.field815) {
                arg0.method296(var17.field816, 8, arg11, arg7, arg2, arg8);
            }
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(0, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        } else if (arg8 == 3) {
            Model var27 = var17.method278(3, arg11, var12, var13, var14, var15, -1);
            arg9.method58(null, 0, arg2, field61[arg11], arg7, 0, var18, arg1, var19, var16, var27);
            if (var17.field815) {
                arg0.method296(var17.field816, 8, arg11, arg7, arg2, arg8);
            }
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(0, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        } else if (arg8 == 9) {
            Model var28 = var17.method278(arg8, arg11, var12, var13, var14, var15, -1);
            arg9.method60(arg7, var18, var19, var28, null, 1, 0, 1, -16736, arg1, arg2, var16);
            if (var17.field815) {
                arg0.method297(arg7, 3, var17.field813, var17.field814, arg11, var17.field816, arg2);
            }
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(2, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        } else if (arg8 == 4) {
            Model var29 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg9.method59(var19, var29, (byte) 45, field60[arg11], arg11 * 512, arg7, 0, var16, 0, arg2, var18, arg1);
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(1, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        } else if (arg8 == 5) {
            int var30 = 16;
            int var31 = arg9.method77(arg1, arg7, arg2);
            if (var31 > 0) {
                var30 = LocType.method275(var31 >> 14 & 0x7FFF).field822;
            }
            Model var32 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg9.method59(var19, var32, (byte) 45, field60[arg11], arg11 * 512, arg7, field62[arg11] * var30, var16, field63[arg11] * var30, arg2, var18, arg1);
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(1, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        } else if (arg8 == 6) {
            Model var33 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg9.method59(var19, var33, (byte) 45, 256, arg11, arg7, 0, var16, 0, arg2, var18, arg1);
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(1, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        } else if (arg8 == 7) {
            Model var34 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg9.method59(var19, var34, (byte) 45, 512, arg11, arg7, 0, var16, 0, arg2, var18, arg1);
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(1, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        } else if (arg8 == 8) {
            Model var35 = var17.method278(4, 0, var12, var13, var14, var15, -1);
            arg9.method59(var19, var35, (byte) 45, 768, arg11, arg7, 0, var16, 0, arg2, var18, arg1);
            if (var17.field821 != -1) {
                arg6.method225(new LocEntity(1, arg2, arg1, true, SeqType.field1023[var17.field821], field40, arg5, arg7));
            }
        }
    }
}
