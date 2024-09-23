import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "b", descriptor = "I")
    private int field40 = -48;

    @OriginalMember(owner = "c", name = "e", descriptor = "I")
    private int field43 = -62;

    @OriginalMember(owner = "c", name = "h", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "c", name = "i", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[I")
    private int[][][] field48;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field49;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field50;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field51;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field52;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field53;

    @OriginalMember(owner = "c", name = "w", descriptor = "[[[I")
    private int[][][] field61;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[[B")
    private byte[][][] field54;

    @OriginalMember(owner = "c", name = "q", descriptor = "[[I")
    private int[][] field55;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field57;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field59;

    @OriginalMember(owner = "c", name = "v", descriptor = "[I")
    private int[] field60;

    @OriginalMember(owner = "c", name = "a", descriptor = "Z")
    private static boolean field39 = true;

    @OriginalMember(owner = "c", name = "c", descriptor = "I")
    private static int field41 = 678;

    @OriginalMember(owner = "c", name = "d", descriptor = "I")
    private static int field42 = 6;

    @OriginalMember(owner = "c", name = "f", descriptor = "Z")
    public static boolean field44 = true;

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field62 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field63 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field64 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "A", descriptor = "[I")
    private static final int[] field65 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "B", descriptor = "I")
    private static int field66 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "C", descriptor = "I")
    private static int field67 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "([[[B[[[IIII)V")
    public World(byte[][][] arg0, int[][][] arg1, int arg2, int arg3, int arg4) {
        this.field46 = arg2;
        this.field47 = arg4;
        if (arg3 < 2 || arg3 > 2) {
            field41 = 239;
        }
        this.field48 = arg1;
        this.field49 = arg0;
        this.field50 = new byte[4][this.field46][this.field47];
        this.field51 = new byte[4][this.field46][this.field47];
        this.field52 = new byte[4][this.field46][this.field47];
        this.field53 = new byte[4][this.field46][this.field47];
        this.field61 = new int[4][this.field46 + 1][this.field47 + 1];
        this.field54 = new byte[4][this.field46 + 1][this.field47 + 1];
        this.field55 = new int[this.field46 + 1][this.field47 + 1];
        this.field56 = new int[this.field47];
        this.field57 = new int[this.field47];
        this.field58 = new int[this.field47];
        this.field59 = new int[this.field47];
        this.field60 = new int[this.field47];
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(BIIII)V")
    public final void method14(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg3; var6 <= arg3 + arg4; var6++) {
            for (int var8 = arg2; var8 <= arg1 + arg2; var8++) {
                if (var8 >= 0 && var8 < this.field46 && var6 >= 0 && var6 < this.field47) {
                    this.field54[0][var8][var6] = 127;
                    if (arg2 == var8 && var8 > 0) {
                        this.field48[0][var8][var6] = this.field48[0][var8 - 1][var6];
                    }
                    if (arg1 + arg2 == var8 && var8 < this.field46 - 1) {
                        this.field48[0][var8][var6] = this.field48[0][var8 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field48[0][var8][var6] = this.field48[0][var8][var6 - 1];
                    }
                    if (arg3 + arg4 == var6 && var6 < this.field47 - 1) {
                        this.field48[0][var8][var6] = this.field48[0][var8][var6 + 1];
                    }
                }
            }
        }
        if (arg0 != 1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II[BIII)V")
    public final void method15(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        Packet var7 = new Packet(arg2, (byte) 3);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    int var12 = arg0 + var10;
                    int var13 = arg5 + var11;
                    if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                        this.field49[var8][var12][var13] = 0;
                        while (true) {
                            int var14 = var7.method239();
                            if (var14 == 0) {
                                if (var8 == 0) {
                                    this.field48[0][var12][var13] = -method22(var12 + arg1 + 932731, var13 + 556238 + arg3) * 8;
                                } else {
                                    this.field48[var8][var12][var13] = this.field48[var8 - 1][var12][var13] - 240;
                                }
                                break;
                            }
                            if (var14 == 1) {
                                int var15 = var7.method239();
                                if (var15 == 1) {
                                    var15 = 0;
                                }
                                if (var8 == 0) {
                                    this.field48[0][var12][var13] = -var15 * 8;
                                } else {
                                    this.field48[var8][var12][var13] = this.field48[var8 - 1][var12][var13] - var15 * 8;
                                }
                                break;
                            }
                            if (var14 <= 49) {
                                this.field51[var8][var12][var13] = var7.method240();
                                this.field52[var8][var12][var13] = (byte) ((var14 - 2) / 4);
                                this.field53[var8][var12][var13] = (byte) (var14 - 2 & 0x3);
                            } else if (var14 <= 81) {
                                this.field49[var8][var12][var13] = (byte) (var14 - 49);
                            } else {
                                this.field50[var8][var12][var13] = (byte) (var14 - 81);
                            }
                        }
                    } else {
                        while (true) {
                            int var16 = var7.method239();
                            if (var16 == 0) {
                                break;
                            }
                            if (var16 == 1) {
                                var7.method239();
                                break;
                            }
                            if (var16 <= 49) {
                                var7.method239();
                            }
                        }
                    }
                }
            }
        }
        if (arg4 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II[BB)Z")
    public static final boolean method16(int arg0, int arg1, byte[] arg2, byte arg3) {
        boolean var4 = true;
        Packet var5 = new Packet(arg2, (byte) 3);
        if (arg3 != 74) {
            field41 = -127;
        }
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method253();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method253();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method239() >> 2;
                    int var15 = arg1 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method334(var6);
                        if (var14 != 22 || !field44 || var17.field945 || var17.field965) {
                            var4 &= var17.method338(0);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method253();
                if (var10 == 0) {
                    break;
                }
                var5.method239();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lmb;Lvb;B)V")
    public static final void method17(Packet arg0, OnDemand arg1, byte arg2) {
        int var3 = -1;
        if (arg2 != -13) {
            field39 = !field39;
        }
        while (true) {
            int var4 = arg0.method253();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            LocType var5 = LocType.method334(var3);
            var5.method339(38488, arg1);
            while (true) {
                int var6 = arg0.method253();
                if (var6 == 0) {
                    break;
                }
                arg0.method239();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(ILs;I[B[Ljc;B)V")
    public final void method18(int arg0, World3D arg1, int arg2, byte[] arg3, CollisionMap[] arg4, byte arg5) {
        Packet var7 = new Packet(arg3, (byte) 3);
        int var8 = -1;
        if (arg5 == 2) {
            boolean var9 = false;
        } else {
            this.field40 = -35;
        }
        while (true) {
            int var10 = var7.method253();
            if (var10 == 0) {
                return;
            }
            var8 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method253();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method239();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg2 + var14;
                int var20 = arg0 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field49[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    CollisionMap var22 = null;
                    if (var21 >= 0) {
                        var22 = arg4[var21];
                    }
                    this.method19(var17, var18, var19, var8, var15, 20, var22, var20, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIIIIILjc;ILs;)V")
    private final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, CollisionMap arg6, int arg7, World3D arg8) {
        if (arg5 <= 0) {
            return;
        }
        if (field44) {
            if ((this.field49[arg4][arg2][arg7] & 0x10) != 0) {
                return;
            }
            if (this.method21(11519, arg2, arg7, arg4) != field45) {
                return;
            }
        }
        int var10 = this.field48[arg4][arg2][arg7];
        int var11 = this.field48[arg4][arg2 + 1][arg7];
        int var12 = this.field48[arg4][arg2 + 1][arg7 + 1];
        int var13 = this.field48[arg4][arg2][arg7 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.method334(arg3);
        int var16 = (arg3 << 14) + (arg7 << 7) + arg2 + 1073741824;
        if (!var15.field945) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg1 << 6) + arg0);
        if (arg0 == 22) {
            if (!field44 || var15.field945 || var15.field965) {
                Entity var18;
                if (var15.field949 == -1) {
                    var18 = var15.method340(22, arg1, var10, var11, var12, var13, -1);
                } else {
                    var18 = new LocEntity(22, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
                }
                arg8.method70(var18, arg2, var16, -741, arg4, arg7, var14, var17);
                if (var15.field943 && var15.field945 && arg6 != null) {
                    arg6.method364(arg7, arg2, 4);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            Entity var34;
            if (var15.field949 == -1) {
                var34 = var15.method340(10, arg1, var10, var11, var12, var13, -1);
            } else {
                var34 = new LocEntity(10, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
            }
            if (var34 != null) {
                int var35 = 0;
                if (arg0 == 11) {
                    var35 += 256;
                }
                int var36;
                int var37;
                if (arg1 == 1 || arg1 == 3) {
                    var36 = var15.field942;
                    var37 = var15.field941;
                } else {
                    var36 = var15.field941;
                    var37 = var15.field942;
                }
                if (arg8.method74(var17, var36, var14, var34, -38295, var37, var16, arg7, arg2, var35, arg4) && var15.field957) {
                    Model var38;
                    if (var34 instanceof Model) {
                        var38 = (Model) var34;
                    } else {
                        var38 = var15.method340(10, arg1, var10, var11, var12, var13, -1);
                    }
                    if (var38 != null) {
                        for (int var39 = 0; var39 <= var36; var39++) {
                            for (int var40 = 0; var40 <= var37; var40++) {
                                int var41 = var38.field563 / 4;
                                if (var41 > 30) {
                                    var41 = 30;
                                }
                                if (var41 > this.field54[arg4][arg2 + var39][arg7 + var40]) {
                                    this.field54[arg4][arg2 + var39][arg7 + var40] = (byte) var41;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field943 && arg6 != null) {
                arg6.method363(var15.field944, 3, arg7, arg1, var15.field941, var15.field942, arg2);
            }
        } else if (arg0 >= 12) {
            Entity var19;
            if (var15.field949 == -1) {
                var19 = var15.method340(arg0, arg1, var10, var11, var12, var13, -1);
            } else {
                var19 = new LocEntity(arg0, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
            }
            arg8.method74(var17, 1, var14, var19, -38295, 1, var16, arg7, arg2, 0, arg4);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg4 > 0) {
                this.field61[arg4][arg2][arg7] |= 0x924;
            }
            if (var15.field943 && arg6 != null) {
                arg6.method363(var15.field944, 3, arg7, arg1, var15.field941, var15.field942, arg2);
            }
        } else if (arg0 == 0) {
            Entity var20;
            if (var15.field949 == -1) {
                var20 = var15.method340(0, arg1, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(0, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
            }
            arg8.method72(var20, null, var16, 0, arg7, (byte) 54, var17, arg2, var14, field62[arg1], arg4);
            if (arg1 == 0) {
                if (var15.field957) {
                    this.field54[arg4][arg2][arg7] = 50;
                    this.field54[arg4][arg2][arg7 + 1] = 50;
                }
                if (var15.field948) {
                    this.field61[arg4][arg2][arg7] |= 0x249;
                }
            } else if (arg1 == 1) {
                if (var15.field957) {
                    this.field54[arg4][arg2][arg7 + 1] = 50;
                    this.field54[arg4][arg2 + 1][arg7 + 1] = 50;
                }
                if (var15.field948) {
                    this.field61[arg4][arg2][arg7 + 1] |= 0x492;
                }
            } else if (arg1 == 2) {
                if (var15.field957) {
                    this.field54[arg4][arg2 + 1][arg7] = 50;
                    this.field54[arg4][arg2 + 1][arg7 + 1] = 50;
                }
                if (var15.field948) {
                    this.field61[arg4][arg2 + 1][arg7] |= 0x249;
                }
            } else if (arg1 == 3) {
                if (var15.field957) {
                    this.field54[arg4][arg2][arg7] = 50;
                    this.field54[arg4][arg2 + 1][arg7] = 50;
                }
                if (var15.field948) {
                    this.field61[arg4][arg2][arg7] |= 0x492;
                }
            }
            if (var15.field943 && arg6 != null) {
                arg6.method362(arg2, arg7, 9, arg1, var15.field944, arg0);
            }
            if (var15.field950 != 16) {
                arg8.method80(arg4, arg7, (byte) -85, arg2, var15.field950);
            }
        } else if (arg0 == 1) {
            Entity var21;
            if (var15.field949 == -1) {
                var21 = var15.method340(1, arg1, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(1, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
            }
            arg8.method72(var21, null, var16, 0, arg7, (byte) 54, var17, arg2, var14, field63[arg1], arg4);
            if (var15.field957) {
                if (arg1 == 0) {
                    this.field54[arg4][arg2][arg7 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field54[arg4][arg2 + 1][arg7 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field54[arg4][arg2 + 1][arg7] = 50;
                } else if (arg1 == 3) {
                    this.field54[arg4][arg2][arg7] = 50;
                }
            }
            if (var15.field943 && arg6 != null) {
                arg6.method362(arg2, arg7, 9, arg1, var15.field944, arg0);
            }
        } else if (arg0 == 2) {
            int var22 = arg1 + 1 & 0x3;
            Entity var23;
            Entity var24;
            if (var15.field949 == -1) {
                var23 = var15.method340(2, arg1 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method340(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new LocEntity(2, arg1 + 4, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
                var24 = new LocEntity(2, var22, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
            }
            arg8.method72(var23, var24, var16, field62[var22], arg7, (byte) 54, var17, arg2, var14, field62[arg1], arg4);
            if (var15.field948) {
                if (arg1 == 0) {
                    this.field61[arg4][arg2][arg7] |= 0x249;
                    this.field61[arg4][arg2][arg7 + 1] |= 0x492;
                } else if (arg1 == 1) {
                    this.field61[arg4][arg2][arg7 + 1] |= 0x492;
                    this.field61[arg4][arg2 + 1][arg7] |= 0x249;
                } else if (arg1 == 2) {
                    this.field61[arg4][arg2 + 1][arg7] |= 0x249;
                    this.field61[arg4][arg2][arg7] |= 0x492;
                } else if (arg1 == 3) {
                    this.field61[arg4][arg2][arg7] |= 0x492;
                    this.field61[arg4][arg2][arg7] |= 0x249;
                }
            }
            if (var15.field943 && arg6 != null) {
                arg6.method362(arg2, arg7, 9, arg1, var15.field944, arg0);
            }
            if (var15.field950 != 16) {
                arg8.method80(arg4, arg7, (byte) -85, arg2, var15.field950);
            }
        } else if (arg0 == 3) {
            Entity var25;
            if (var15.field949 == -1) {
                var25 = var15.method340(3, arg1, var10, var11, var12, var13, -1);
            } else {
                var25 = new LocEntity(3, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
            }
            arg8.method72(var25, null, var16, 0, arg7, (byte) 54, var17, arg2, var14, field63[arg1], arg4);
            if (var15.field957) {
                if (arg1 == 0) {
                    this.field54[arg4][arg2][arg7 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field54[arg4][arg2 + 1][arg7 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field54[arg4][arg2 + 1][arg7] = 50;
                } else if (arg1 == 3) {
                    this.field54[arg4][arg2][arg7] = 50;
                }
            }
            if (var15.field943 && arg6 != null) {
                arg6.method362(arg2, arg7, 9, arg1, var15.field944, arg0);
            }
        } else if (arg0 == 9) {
            Entity var26;
            if (var15.field949 == -1) {
                var26 = var15.method340(arg0, arg1, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(arg0, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
            }
            arg8.method74(var17, 1, var14, var26, -38295, 1, var16, arg7, arg2, 0, arg4);
            if (var15.field943 && arg6 != null) {
                arg6.method363(var15.field944, 3, arg7, arg1, var15.field941, var15.field942, arg2);
            }
        } else if (arg0 == 4) {
            Entity var27;
            if (var15.field949 == -1) {
                var27 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var27 = new LocEntity(4, 0, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
            }
            arg8.method73(field62[arg1], 0, var17, var14, arg2, var16, arg1 * 512, arg7, 0, var27, arg4, false);
        } else if (arg0 == 5) {
            int var28 = 16;
            int var29 = arg8.method90(arg4, arg2, arg7);
            if (var29 > 0) {
                var28 = LocType.method334(var29 >> 14 & 0x7FFF).field950;
            }
            Entity var30;
            if (var15.field949 == -1) {
                var30 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var30 = new LocEntity(4, 0, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
            }
            arg8.method73(field62[arg1], field64[arg1] * var28, var17, var14, arg2, var16, arg1 * 512, arg7, field65[arg1] * var28, var30, arg4, false);
        } else if (arg0 == 6) {
            Entity var31;
            if (var15.field949 == -1) {
                var31 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var31 = new LocEntity(4, 0, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
            }
            arg8.method73(256, 0, var17, var14, arg2, var16, arg1, arg7, 0, var31, arg4, false);
        } else if (arg0 == 7) {
            Entity var32;
            if (var15.field949 == -1) {
                var32 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var32 = new LocEntity(4, 0, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
            }
            arg8.method73(512, 0, var17, var14, arg2, var16, arg1, arg7, 0, var32, arg4, false);
        } else if (arg0 == 8) {
            Entity var33;
            if (var15.field949 == -1) {
                var33 = var15.method340(4, 0, var10, var11, var12, var13, -1);
            } else {
                var33 = new LocEntity(4, 0, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
            }
            arg8.method73(768, 0, var17, var14, arg2, var16, arg1, arg7, 0, var33, arg4, false);
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Ls;[Ljc;I)V")
    public final void method20(World3D arg0, CollisionMap[] arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field49[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field49[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method364(var111, var110, 4);
                        }
                    }
                }
            }
        }
        field66 += (int) (Math.random() * 5.0D) - 2;
        if (field66 < -8) {
            field66 = -8;
        }
        if (field66 > 8) {
            field66 = 8;
        }
        field67 += (int) (Math.random() * 5.0D) - 2;
        if (field67 < -16) {
            field67 = -16;
        }
        if (field67 > 16) {
            field67 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field54[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field47 - 1; var56++) {
                for (int var101 = 1; var101 < this.field46 - 1; var101++) {
                    int var102 = this.field48[var5][var101 + 1][var56] - this.field48[var5][var101 - 1][var56];
                    int var103 = this.field48[var5][var101][var56 + 1] - this.field48[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field55[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field47; var57++) {
                this.field56[var57] = 0;
                this.field57[var57] = 0;
                this.field58[var57] = 0;
                this.field59[var57] = 0;
                this.field60[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field46 + 5; var58++) {
                for (int var61 = 0; var61 < this.field47; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field46) {
                        int var96 = this.field50[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            FloType var97 = FloType.field1077[var96 - 1];
                            this.field56[var61] += var97.field1086;
                            this.field57[var61] += var97.field1084;
                            this.field58[var61] += var97.field1085;
                            this.field59[var61] += var97.field1087;
                            var10002 = this.field60[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field46) {
                        int var99 = this.field50[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field1077[var99 - 1];
                            this.field56[var61] -= var100.field1086;
                            this.field57[var61] -= var100.field1084;
                            this.field58[var61] -= var100.field1085;
                            this.field59[var61] -= var100.field1087;
                            var10002 = this.field60[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field46 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field47 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field47) {
                            var62 += this.field56[var68];
                            var63 += this.field57[var68];
                            var64 += this.field58[var68];
                            var65 += this.field59[var68];
                            var66 += this.field60[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field47) {
                            var62 -= this.field56[var69];
                            var63 -= this.field57[var69];
                            var64 -= this.field58[var69];
                            var65 -= this.field59[var69];
                            var66 -= this.field60[var69];
                        }
                        if (var67 >= 1 && var67 < this.field47 - 1 && (!field44 || (this.field49[var5][var58][var67] & 0x10) == 0 && this.method21(11519, var58, var67, var5) == field45)) {
                            int var70 = this.field50[var5][var58][var67] & 0xFF;
                            int var71 = this.field51[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field48[var5][var58][var67];
                                int var73 = this.field48[var5][var58 + 1][var67];
                                int var74 = this.field48[var5][var58 + 1][var67 + 1];
                                int var75 = this.field48[var5][var58][var67 + 1];
                                int var76 = this.field55[var58][var67];
                                int var77 = this.field55[var58 + 1][var67];
                                int var78 = this.field55[var58 + 1][var67 + 1];
                                int var79 = this.field55[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method29(var82, var83, var84);
                                    int var85 = field66 + var82 & 0xFF;
                                    int var86 = field67 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method29(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field52[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !FloType.field1077[var71 - 1].field1081) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field61[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.field657[method27(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method69(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field52[var5][var58][var67] + 1;
                                    byte var90 = this.field53[var5][var58][var67];
                                    FloType var91 = FloType.field1077[var71 - 1];
                                    int var92 = var91.field1079;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.method183(0, var92);
                                        var94 = -1;
                                    } else if (var91.field1078 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method29(var91.field1083, var91.field1084, var91.field1085);
                                        var93 = Pix3D.field657[this.method28(var91.field1088, 96)];
                                    }
                                    arg0.method69(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), this.method28(var94, var76), this.method28(var94, var77), this.method28(var94, var78), this.method28(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field47 - 1; var59++) {
                for (int var60 = 1; var60 < this.field46 - 1; var60++) {
                    arg0.method68(var5, var60, var59, this.method21(11519, var60, var59, var5));
                }
            }
        }
        arg0.method95(768, -2568, 64, -10, -50, -50);
        for (int var6 = 0; var6 < this.field46; var6++) {
            for (int var47 = 0; var47 < this.field47; var47++) {
                if ((this.field49[1][var6][var47] & 0x2) == 2) {
                    arg0.method66(6, var47, var6);
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
                for (int var12 = 0; var12 <= this.field47; var12++) {
                    for (int var13 = 0; var13 <= this.field46; var13++) {
                        if ((this.field61[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field61[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field47 && (this.field61[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label326: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field61[var16 - 1][var13][var18] & var7) == 0) {
                                        break label326;
                                    }
                                }
                                var16--;
                            }
                            label315: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field61[var17 + 1][var13][var19] & var7) == 0) {
                                        break label315;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field48[var17][var13][var14] - var21;
                                int var23 = this.field48[var16][var13][var14];
                                World3D.method67(var13 * 128, -374, 1, var22, var13 * 128, var10, var23, var14 * 128, var15 * 128 + 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field61[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field61[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field61[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field46 && (this.field61[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label379: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field61[var28 - 1][var30][var12] & var8) == 0) {
                                        break label379;
                                    }
                                }
                                var28--;
                            }
                            label368: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field61[var29 + 1][var31][var12] & var8) == 0) {
                                        break label368;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field48[var29][var26][var12] - var33;
                                int var35 = this.field48[var28][var26][var12];
                                World3D.method67(var26 * 128, -374, 2, var34, var27 * 128 + 128, var10, var35, var12 * 128, var12 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field61[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field61[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field61[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field47 && (this.field61[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label432: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field61[var11][var38 - 1][var42] & var9) == 0) {
                                        break label432;
                                    }
                                }
                                var38--;
                            }
                            label421: while (var39 < this.field46) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field61[var11][var39 + 1][var43] & var9) == 0) {
                                        break label421;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field48[var11][var38][var40];
                                World3D.method67(var38 * 128, -374, 4, var44, var39 * 128 + 128, var10, var44, var40 * 128, var41 * 128 + 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field61[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != 44106) {
            this.field43 = 169;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IIII)I")
    public int method21(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 11519) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field49[arg3][arg1][arg2] & 0x8) == 0) {
            return arg3 <= 0 || (this.field49[1][arg1][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(II)I")
    private static final int method22(int arg0, int arg1) {
        int var2 = method23(arg0 + 45365, arg1 + 91923, 4) + (method23(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method23(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(III)I")
    private static final int method23(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method25(var3, var5);
        int var8 = method25(var3 + 1, var5);
        int var9 = method25(var3, var5 + 1);
        int var10 = method25(var3 + 1, var5 + 1);
        int var11 = method24(var7, var8, var4, arg2);
        int var12 = method24(var9, var10, var4, arg2);
        return method24(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "c", name = "b", descriptor = "(IIII)I")
    private static final int method24(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - Pix3D.field646[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "c", name = "b", descriptor = "(II)I")
    private static final int method25(int arg0, int arg1) {
        int var2 = method26(arg0 - 1, arg1 - 1) + method26(arg0 + 1, arg1 - 1) + method26(arg0 - 1, arg1 + 1) + method26(arg0 + 1, arg1 + 1);
        int var3 = method26(arg0 - 1, arg1) + method26(arg0 + 1, arg1) + method26(arg0, arg1 - 1) + method26(arg0, arg1 + 1);
        int var4 = method26(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "c", name = "c", descriptor = "(II)I")
    private static final int method26(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "c", name = "d", descriptor = "(II)I")
    private static final int method27(int arg0, int arg1) {
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
    private final int method28(int arg0, int arg1) {
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
    private final int method29(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "c", name = "c", descriptor = "(III)Z")
    public static final boolean method30(int arg0, int arg1, int arg2) {
        if (arg2 != 23745) {
            field39 = !field39;
        }
        LocType var3 = LocType.method334(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method337(arg1, true);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IILjc;IIILs;[[[IIII)V")
    public static final void method31(int arg0, int arg1, CollisionMap arg2, int arg3, int arg4, int arg5, World3D arg6, int[][][] arg7, int arg8, int arg9, int arg10) {
        int var11 = arg7[arg9][arg1][arg3];
        int var12 = arg7[arg9][arg1 + 1][arg3];
        if (field42 != arg8) {
            return;
        }
        int var13 = arg7[arg9][arg1 + 1][arg3 + 1];
        int var14 = arg7[arg9][arg1][arg3 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.method334(arg5);
        int var17 = (arg5 << 14) + (arg3 << 7) + arg1 + 1073741824;
        if (!var16.field945) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg0 << 6) + arg4);
        if (arg4 == 22) {
            Entity var19;
            if (var16.field949 == -1) {
                var19 = var16.method340(22, arg0, var11, var12, var13, var14, -1);
            } else {
                var19 = new LocEntity(22, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            arg6.method70(var19, arg1, var17, -741, arg10, arg3, var15, var18);
            if (var16.field943 && var16.field945) {
                arg2.method364(arg3, arg1, 4);
            }
        } else if (arg4 == 10 || arg4 == 11) {
            Entity var35;
            if (var16.field949 == -1) {
                var35 = var16.method340(10, arg0, var11, var12, var13, var14, -1);
            } else {
                var35 = new LocEntity(10, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            if (var35 != null) {
                int var36 = 0;
                if (arg4 == 11) {
                    var36 += 256;
                }
                int var37;
                int var38;
                if (arg0 == 1 || arg0 == 3) {
                    var37 = var16.field942;
                    var38 = var16.field941;
                } else {
                    var37 = var16.field941;
                    var38 = var16.field942;
                }
                arg6.method74(var18, var37, var15, var35, -38295, var38, var17, arg3, arg1, var36, arg10);
            }
            if (var16.field943) {
                arg2.method363(var16.field944, 3, arg3, arg0, var16.field941, var16.field942, arg1);
            }
        } else if (arg4 >= 12) {
            Entity var20;
            if (var16.field949 == -1) {
                var20 = var16.method340(arg4, arg0, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(arg4, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            arg6.method74(var18, 1, var15, var20, -38295, 1, var17, arg3, arg1, 0, arg10);
            if (var16.field943) {
                arg2.method363(var16.field944, 3, arg3, arg0, var16.field941, var16.field942, arg1);
            }
        } else if (arg4 == 0) {
            Entity var21;
            if (var16.field949 == -1) {
                var21 = var16.method340(0, arg0, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(0, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            arg6.method72(var21, null, var17, 0, arg3, (byte) 54, var18, arg1, var15, field62[arg0], arg10);
            if (var16.field943) {
                arg2.method362(arg1, arg3, 9, arg0, var16.field944, arg4);
            }
        } else if (arg4 == 1) {
            Entity var22;
            if (var16.field949 == -1) {
                var22 = var16.method340(1, arg0, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(1, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            arg6.method72(var22, null, var17, 0, arg3, (byte) 54, var18, arg1, var15, field63[arg0], arg10);
            if (var16.field943) {
                arg2.method362(arg1, arg3, 9, arg0, var16.field944, arg4);
            }
        } else if (arg4 == 2) {
            int var23 = arg0 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.field949 == -1) {
                var24 = var16.method340(2, arg0 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method340(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new LocEntity(2, arg0 + 4, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
                var25 = new LocEntity(2, var23, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            arg6.method72(var24, var25, var17, field62[var23], arg3, (byte) 54, var18, arg1, var15, field62[arg0], arg10);
            if (var16.field943) {
                arg2.method362(arg1, arg3, 9, arg0, var16.field944, arg4);
            }
        } else if (arg4 == 3) {
            Entity var26;
            if (var16.field949 == -1) {
                var26 = var16.method340(3, arg0, var11, var12, var13, var14, -1);
            } else {
                var26 = new LocEntity(3, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            arg6.method72(var26, null, var17, 0, arg3, (byte) 54, var18, arg1, var15, field63[arg0], arg10);
            if (var16.field943) {
                arg2.method362(arg1, arg3, 9, arg0, var16.field944, arg4);
            }
        } else if (arg4 == 9) {
            Entity var27;
            if (var16.field949 == -1) {
                var27 = var16.method340(arg4, arg0, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(arg4, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            arg6.method74(var18, 1, var15, var27, -38295, 1, var17, arg3, arg1, 0, arg10);
            if (var16.field943) {
                arg2.method363(var16.field944, 3, arg3, arg0, var16.field941, var16.field942, arg1);
            }
        } else if (arg4 == 4) {
            Entity var28;
            if (var16.field949 == -1) {
                var28 = var16.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var28 = new LocEntity(4, 0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            arg6.method73(field62[arg0], 0, var18, var15, arg1, var17, arg0 * 512, arg3, 0, var28, arg10, false);
        } else if (arg4 == 5) {
            int var29 = 16;
            int var30 = arg6.method90(arg10, arg1, arg3);
            if (var30 > 0) {
                var29 = LocType.method334(var30 >> 14 & 0x7FFF).field950;
            }
            Entity var31;
            if (var16.field949 == -1) {
                var31 = var16.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var31 = new LocEntity(4, 0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            arg6.method73(field62[arg0], field64[arg0] * var29, var18, var15, arg1, var17, arg0 * 512, arg3, field65[arg0] * var29, var31, arg10, false);
        } else if (arg4 == 6) {
            Entity var32;
            if (var16.field949 == -1) {
                var32 = var16.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var32 = new LocEntity(4, 0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            arg6.method73(256, 0, var18, var15, arg1, var17, arg0, arg3, 0, var32, arg10, false);
        } else if (arg4 == 7) {
            Entity var33;
            if (var16.field949 == -1) {
                var33 = var16.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var33 = new LocEntity(4, 0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            arg6.method73(512, 0, var18, var15, arg1, var17, arg0, arg3, 0, var33, arg10, false);
        } else if (arg4 == 8) {
            Entity var34;
            if (var16.field949 == -1) {
                var34 = var16.method340(4, 0, var11, var12, var13, var14, -1);
            } else {
                var34 = new LocEntity(4, 0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
            }
            arg6.method73(768, 0, var18, var15, arg1, var17, arg0, arg3, 0, var34, arg10, false);
        }
    }
}
