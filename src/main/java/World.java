import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("c")
public class World {

    @OriginalMember(owner = "c", name = "a", descriptor = "I")
    private int field38 = 618;

    @OriginalMember(owner = "c", name = "b", descriptor = "I")
    private int field39 = 587;

    @OriginalMember(owner = "c", name = "c", descriptor = "Z")
    private boolean field40 = false;

    @OriginalMember(owner = "c", name = "g", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "c", name = "h", descriptor = "I")
    private int field45;

    @OriginalMember(owner = "c", name = "i", descriptor = "[[[I")
    private int[][][] field46;

    @OriginalMember(owner = "c", name = "j", descriptor = "[[[B")
    private byte[][][] field47;

    @OriginalMember(owner = "c", name = "k", descriptor = "[[[B")
    private byte[][][] field48;

    @OriginalMember(owner = "c", name = "l", descriptor = "[[[B")
    private byte[][][] field49;

    @OriginalMember(owner = "c", name = "m", descriptor = "[[[B")
    private byte[][][] field50;

    @OriginalMember(owner = "c", name = "n", descriptor = "[[[B")
    private byte[][][] field51;

    @OriginalMember(owner = "c", name = "v", descriptor = "[[[I")
    private int[][][] field59;

    @OriginalMember(owner = "c", name = "o", descriptor = "[[[B")
    private byte[][][] field52;

    @OriginalMember(owner = "c", name = "p", descriptor = "[[I")
    private int[][] field53;

    @OriginalMember(owner = "c", name = "q", descriptor = "[I")
    private int[] field54;

    @OriginalMember(owner = "c", name = "r", descriptor = "[I")
    private int[] field55;

    @OriginalMember(owner = "c", name = "s", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "c", name = "t", descriptor = "[I")
    private int[] field57;

    @OriginalMember(owner = "c", name = "u", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "c", name = "e", descriptor = "Z")
    public static boolean field42 = true;

    @OriginalMember(owner = "c", name = "w", descriptor = "[I")
    private static final int[] field60 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "c", name = "x", descriptor = "[I")
    private static final int[] field61 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "c", name = "y", descriptor = "[I")
    private static final int[] field62 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "c", name = "z", descriptor = "[I")
    private static final int[] field63 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "c", name = "A", descriptor = "I")
    private static int field64 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "c", name = "B", descriptor = "I")
    private static int field65 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "c", name = "d", descriptor = "I")
    private static int field41;

    @OriginalMember(owner = "c", name = "f", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "c", name = "<init>", descriptor = "(I[[[III[[[B)V")
    public World(int arg0, int[][][] arg1, int arg2, int arg3, byte[][][] arg4) {
        this.field44 = arg0;
        this.field45 = arg2;
        this.field46 = arg1;
        this.field47 = arg4;
        this.field48 = new byte[4][this.field44][this.field45];
        this.field49 = new byte[4][this.field44][this.field45];
        this.field50 = new byte[4][this.field44][this.field45];
        if (arg3 >= 0) {
            throw new NullPointerException();
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
        if (arg2 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = arg0; var7 <= arg0 + arg4; var7++) {
            for (int var8 = arg1; var8 <= arg1 + arg3; var8++) {
                if (var8 >= 0 && var8 < this.field44 && var7 >= 0 && var7 < this.field45) {
                    this.field52[0][var8][var7] = 127;
                    if (arg1 == var8 && var8 > 0) {
                        this.field46[0][var8][var7] = this.field46[0][var8 - 1][var7];
                    }
                    if (arg1 + arg3 == var8 && var8 < this.field44 - 1) {
                        this.field46[0][var8][var7] = this.field46[0][var8 + 1][var7];
                    }
                    if (arg0 == var7 && var7 > 0) {
                        this.field46[0][var8][var7] = this.field46[0][var8][var7 - 1];
                    }
                    if (arg0 + arg4 == var7 && var7 < this.field45 - 1) {
                        this.field46[0][var8][var7] = this.field46[0][var8][var7 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(ZI[BIII)V")
    public final void method15(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            return;
        }
        Packet var7 = new Packet(arg2, (byte) 1);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    int var11 = arg5 + var9;
                    int var12 = arg3 + var10;
                    if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                        this.field47[var8][var11][var12] = 0;
                        while (true) {
                            int var13 = var7.method224();
                            if (var13 == 0) {
                                if (var8 == 0) {
                                    this.field46[0][var11][var12] = -method22(var11 + arg1 + 932731, var12 + 556238 + arg4) * 8;
                                } else {
                                    this.field46[var8][var11][var12] = this.field46[var8 - 1][var11][var12] - 240;
                                }
                                break;
                            }
                            if (var13 == 1) {
                                int var14 = var7.method224();
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
                                this.field49[var8][var11][var12] = var7.method225();
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
                            int var15 = var7.method224();
                            if (var15 == 0) {
                                break;
                            }
                            if (var15 == 1) {
                                var7.method224();
                                break;
                            }
                            if (var15 <= 49) {
                                var7.method224();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(B[BII)Z")
    public static final boolean method16(byte arg0, byte[] arg1, int arg2, int arg3) {
        boolean var4 = true;
        Packet var5 = new Packet(arg1, (byte) 1);
        int var6 = -1;
        if (arg0 != 106) {
            throw new NullPointerException();
        }
        label52: while (true) {
            int var7 = var5.method238();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method238();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method224() >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        LocType var17 = LocType.method325(var6);
                        if (var14 != 22 || !field42 || var17.field964 || var17.field984) {
                            var4 &= var17.method329(true);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method238();
                if (var10 == 0) {
                    break;
                }
                var5.method224();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(BLlb;Lub;)V")
    public static final void method17(byte arg0, Packet arg1, OnDemand arg2) {
        if (arg0 != -47) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = -1;
        while (true) {
            int var5 = arg1.method238();
            if (var5 == 0) {
                return;
            }
            var4 += var5;
            LocType var6 = LocType.method325(var4);
            var6.method330((byte) 0, arg2);
            while (true) {
                int var7 = arg1.method238();
                if (var7 == 0) {
                    break;
                }
                arg1.method224();
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(I[BZLr;I[Ljc;)V")
    public final void method18(int arg0, byte[] arg1, boolean arg2, World3D arg3, int arg4, CollisionMap[] arg5) {
        Packet var7 = new Packet(arg1, (byte) 1);
        int var8 = -1;
        if (arg2) {
            this.field40 = !this.field40;
        }
        while (true) {
            int var9 = var7.method238();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method238();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method224();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg4 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field47[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    CollisionMap var21 = null;
                    if (var20 >= 0) {
                        var21 = arg5[var20];
                    }
                    this.method19(8, var14, var21, var17, var16, var19, arg3, var8, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(IILjc;IIILr;II)V")
    private final void method19(int arg0, int arg1, CollisionMap arg2, int arg3, int arg4, int arg5, World3D arg6, int arg7, int arg8) {
        if (field42) {
            if ((this.field47[arg1][arg8][arg5] & 0x10) != 0) {
                return;
            }
            if (this.method21(arg1, arg5, 11451, arg8) != field43) {
                return;
            }
        }
        int var10 = this.field46[arg1][arg8][arg5];
        int var11 = this.field46[arg1][arg8 + 1][arg5];
        int var12 = this.field46[arg1][arg8 + 1][arg5 + 1];
        int var13 = this.field46[arg1][arg8][arg5 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.method325(arg7);
        if (arg0 < 8 || arg0 > 8) {
            return;
        }
        int var16 = (arg7 << 14) + (arg5 << 7) + arg8 + 1073741824;
        if (!var15.field964) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg3 << 6) + arg4);
        if (arg4 == 22) {
            if (!field42 || var15.field964 || var15.field984) {
                Entity var18;
                if (var15.field968 == -1) {
                    var18 = var15.method331(22, arg3, var10, var11, var12, var13, -1);
                } else {
                    var18 = new LocEntity(22, arg3, var15.field968, arg7, var12, field41, true, var11, var13, var10);
                }
                arg6.method56(var14, var18, arg8, arg1, var16, true, var17, arg5);
                if (var15.field962 && var15.field964 && arg2 != null) {
                    arg2.method355(true, arg8, arg5);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            Entity var38;
            if (var15.field968 == -1) {
                var38 = var15.method331(10, arg3, var10, var11, var12, var13, -1);
            } else {
                var38 = new LocEntity(10, arg3, var15.field968, arg7, var12, field41, true, var11, var13, var10);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg4 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg3 == 1 || arg3 == 3) {
                    var40 = var15.field961;
                    var41 = var15.field960;
                } else {
                    var40 = var15.field960;
                    var41 = var15.field961;
                }
                if (arg6.method60(-323, arg8, arg5, var41, arg1, var14, var38, var17, var40, var39, var16) && var15.field976) {
                    Model var42;
                    if (var38 instanceof Model) {
                        var42 = (Model) var38;
                    } else {
                        var42 = var15.method331(10, arg3, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field560 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field52[arg1][arg8 + var43][arg5 + var44]) {
                                    this.field52[arg1][arg8 + var43][arg5 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field962 && arg2 != null) {
                arg2.method354(var15.field960, arg8, var15.field961, arg5, arg3, var15.field963, 9);
            }
        } else if (arg4 >= 12) {
            Entity var19;
            if (var15.field968 == -1) {
                var19 = var15.method331(arg4, arg3, var10, var11, var12, var13, -1);
            } else {
                var19 = new LocEntity(arg4, arg3, var15.field968, arg7, var12, field41, true, var11, var13, var10);
            }
            arg6.method60(-323, arg8, arg5, 1, arg1, var14, var19, var17, 1, 0, var16);
            if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg1 > 0) {
                this.field59[arg1][arg8][arg5] |= 0x924;
            }
            if (var15.field962 && arg2 != null) {
                arg2.method354(var15.field960, arg8, var15.field961, arg5, arg3, var15.field963, 9);
            }
        } else if (arg4 == 0) {
            Entity var20;
            if (var15.field968 == -1) {
                var20 = var15.method331(0, arg3, var10, var11, var12, var13, -1);
            } else {
                var20 = new LocEntity(0, arg3, var15.field968, arg7, var12, field41, true, var11, var13, var10);
            }
            arg6.method58(field60[arg3], null, var14, arg8, arg1, var17, -30992, 0, var16, var20, arg5);
            if (arg3 == 0) {
                if (var15.field976) {
                    this.field52[arg1][arg8][arg5] = 50;
                    this.field52[arg1][arg8][arg5 + 1] = 50;
                }
                if (var15.field967) {
                    this.field59[arg1][arg8][arg5] |= 0x249;
                }
            } else if (arg3 == 1) {
                if (var15.field976) {
                    this.field52[arg1][arg8][arg5 + 1] = 50;
                    this.field52[arg1][arg8 + 1][arg5 + 1] = 50;
                }
                if (var15.field967) {
                    this.field59[arg1][arg8][arg5 + 1] |= 0x492;
                }
            } else if (arg3 == 2) {
                if (var15.field976) {
                    this.field52[arg1][arg8 + 1][arg5] = 50;
                    this.field52[arg1][arg8 + 1][arg5 + 1] = 50;
                }
                if (var15.field967) {
                    this.field59[arg1][arg8 + 1][arg5] |= 0x249;
                }
            } else if (arg3 == 3) {
                if (var15.field976) {
                    this.field52[arg1][arg8][arg5] = 50;
                    this.field52[arg1][arg8 + 1][arg5] = 50;
                }
                if (var15.field967) {
                    this.field59[arg1][arg8][arg5] |= 0x492;
                }
            }
            if (var15.field962 && arg2 != null) {
                arg2.method353(arg3, arg4, var15.field963, arg5, (byte) 25, arg8);
            }
            if (var15.field969 != 16) {
                arg6.method66(false, arg8, arg5, arg1, var15.field969);
            }
        } else if (arg4 == 1) {
            Entity var21;
            if (var15.field968 == -1) {
                var21 = var15.method331(1, arg3, var10, var11, var12, var13, -1);
            } else {
                var21 = new LocEntity(1, arg3, var15.field968, arg7, var12, field41, true, var11, var13, var10);
            }
            arg6.method58(field61[arg3], null, var14, arg8, arg1, var17, -30992, 0, var16, var21, arg5);
            if (var15.field976) {
                if (arg3 == 0) {
                    this.field52[arg1][arg8][arg5 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field52[arg1][arg8 + 1][arg5 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field52[arg1][arg8 + 1][arg5] = 50;
                } else if (arg3 == 3) {
                    this.field52[arg1][arg8][arg5] = 50;
                }
            }
            if (var15.field962 && arg2 != null) {
                arg2.method353(arg3, arg4, var15.field963, arg5, (byte) 25, arg8);
            }
        } else if (arg4 == 2) {
            int var22 = arg3 + 1 & 0x3;
            Entity var23;
            Entity var24;
            if (var15.field968 == -1) {
                var23 = var15.method331(2, arg3 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method331(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new LocEntity(2, arg3 + 4, var15.field968, arg7, var12, field41, true, var11, var13, var10);
                var24 = new LocEntity(2, var22, var15.field968, arg7, var12, field41, true, var11, var13, var10);
            }
            arg6.method58(field60[arg3], var24, var14, arg8, arg1, var17, -30992, field60[var22], var16, var23, arg5);
            if (var15.field967) {
                if (arg3 == 0) {
                    this.field59[arg1][arg8][arg5] |= 0x249;
                    this.field59[arg1][arg8][arg5 + 1] |= 0x492;
                } else if (arg3 == 1) {
                    this.field59[arg1][arg8][arg5 + 1] |= 0x492;
                    this.field59[arg1][arg8 + 1][arg5] |= 0x249;
                } else if (arg3 == 2) {
                    this.field59[arg1][arg8 + 1][arg5] |= 0x249;
                    this.field59[arg1][arg8][arg5] |= 0x492;
                } else if (arg3 == 3) {
                    this.field59[arg1][arg8][arg5] |= 0x492;
                    this.field59[arg1][arg8][arg5] |= 0x249;
                }
            }
            if (var15.field962 && arg2 != null) {
                arg2.method353(arg3, arg4, var15.field963, arg5, (byte) 25, arg8);
            }
            if (var15.field969 != 16) {
                arg6.method66(false, arg8, arg5, arg1, var15.field969);
            }
        } else if (arg4 == 3) {
            Entity var25;
            if (var15.field968 == -1) {
                var25 = var15.method331(3, arg3, var10, var11, var12, var13, -1);
            } else {
                var25 = new LocEntity(3, arg3, var15.field968, arg7, var12, field41, true, var11, var13, var10);
            }
            arg6.method58(field61[arg3], null, var14, arg8, arg1, var17, -30992, 0, var16, var25, arg5);
            if (var15.field976) {
                if (arg3 == 0) {
                    this.field52[arg1][arg8][arg5 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field52[arg1][arg8 + 1][arg5 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field52[arg1][arg8 + 1][arg5] = 50;
                } else if (arg3 == 3) {
                    this.field52[arg1][arg8][arg5] = 50;
                }
            }
            if (var15.field962 && arg2 != null) {
                arg2.method353(arg3, arg4, var15.field963, arg5, (byte) 25, arg8);
            }
        } else if (arg4 == 9) {
            Entity var26;
            if (var15.field968 == -1) {
                var26 = var15.method331(arg4, arg3, var10, var11, var12, var13, -1);
            } else {
                var26 = new LocEntity(arg4, arg3, var15.field968, arg7, var12, field41, true, var11, var13, var10);
            }
            arg6.method60(-323, arg8, arg5, 1, arg1, var14, var26, var17, 1, 0, var16);
            if (var15.field962 && arg2 != null) {
                arg2.method354(var15.field960, arg8, var15.field961, arg5, arg3, var15.field963, 9);
            }
        } else {
            if (var15.field965) {
                if (arg3 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg3 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg3 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg4 == 4) {
                Entity var31;
                if (var15.field968 == -1) {
                    var31 = var15.method331(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new LocEntity(4, 0, var15.field968, arg7, var12, field41, true, var11, var13, var10);
                }
                arg6.method59(field60[arg3], var31, var17, arg5, var14, 0, (byte) -18, arg3 * 512, arg1, arg8, 0, var16);
            } else if (arg4 == 5) {
                int var32 = 16;
                int var33 = arg6.method76(arg1, arg8, arg5);
                if (var33 > 0) {
                    var32 = LocType.method325(var33 >> 14 & 0x7FFF).field969;
                }
                Entity var34;
                if (var15.field968 == -1) {
                    var34 = var15.method331(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new LocEntity(4, 0, var15.field968, arg7, var12, field41, true, var11, var13, var10);
                }
                arg6.method59(field60[arg3], var34, var17, arg5, var14, field62[arg3] * var32, (byte) -18, arg3 * 512, arg1, arg8, field63[arg3] * var32, var16);
            } else if (arg4 == 6) {
                Entity var35;
                if (var15.field968 == -1) {
                    var35 = var15.method331(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new LocEntity(4, 0, var15.field968, arg7, var12, field41, true, var11, var13, var10);
                }
                arg6.method59(256, var35, var17, arg5, var14, 0, (byte) -18, arg3, arg1, arg8, 0, var16);
            } else if (arg4 == 7) {
                Entity var36;
                if (var15.field968 == -1) {
                    var36 = var15.method331(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new LocEntity(4, 0, var15.field968, arg7, var12, field41, true, var11, var13, var10);
                }
                arg6.method59(512, var36, var17, arg5, var14, 0, (byte) -18, arg3, arg1, arg8, 0, var16);
            } else if (arg4 == 8) {
                Entity var37;
                if (var15.field968 == -1) {
                    var37 = var15.method331(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new LocEntity(4, 0, var15.field968, arg7, var12, field41, true, var11, var13, var10);
                }
                arg6.method59(768, var37, var17, arg5, var14, 0, (byte) -18, arg3, arg1, arg8, 0, var16);
            }
        }
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "([Ljc;ZLr;)V")
    public final void method20(CollisionMap[] arg0, boolean arg1, World3D arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field47[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field47[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method355(true, var110, var111);
                        }
                    }
                }
            }
        }
        field64 += (int) (Math.random() * 5.0D) - 2;
        if (arg1) {
            return;
        }
        if (field64 < -8) {
            field64 = -8;
        }
        if (field64 > 8) {
            field64 = 8;
        }
        field65 += (int) (Math.random() * 5.0D) - 2;
        if (field65 < -16) {
            field65 = -16;
        }
        if (field65 > 16) {
            field65 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field52[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field45 - 1; var56++) {
                for (int var101 = 1; var101 < this.field44 - 1; var101++) {
                    int var102 = this.field46[var5][var101 + 1][var56] - this.field46[var5][var101 - 1][var56];
                    int var103 = this.field46[var5][var101][var56 + 1] - this.field46[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field53[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field45; var57++) {
                this.field54[var57] = 0;
                this.field55[var57] = 0;
                this.field56[var57] = 0;
                this.field57[var57] = 0;
                this.field58[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field44 + 5; var58++) {
                for (int var61 = 0; var61 < this.field45; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field44) {
                        int var96 = this.field48[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            FloType var97 = FloType.field1098[var96 - 1];
                            this.field54[var61] += var97.field1107;
                            this.field55[var61] += var97.field1105;
                            this.field56[var61] += var97.field1106;
                            this.field57[var61] += var97.field1108;
                            var10002 = this.field58[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field44) {
                        int var99 = this.field48[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            FloType var100 = FloType.field1098[var99 - 1];
                            this.field54[var61] -= var100.field1107;
                            this.field55[var61] -= var100.field1105;
                            this.field56[var61] -= var100.field1106;
                            this.field57[var61] -= var100.field1108;
                            var10002 = this.field58[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field44 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field45 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field45) {
                            var62 += this.field54[var68];
                            var63 += this.field55[var68];
                            var64 += this.field56[var68];
                            var65 += this.field57[var68];
                            var66 += this.field58[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field45) {
                            var62 -= this.field54[var69];
                            var63 -= this.field55[var69];
                            var64 -= this.field56[var69];
                            var65 -= this.field57[var69];
                            var66 -= this.field58[var69];
                        }
                        if (var67 >= 1 && var67 < this.field45 - 1 && (!field42 || (this.field47[var5][var58][var67] & 0x10) == 0 && this.method21(var5, var67, 11451, var58) == field43)) {
                            int var70 = this.field48[var5][var58][var67] & 0xFF;
                            int var71 = this.field49[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field46[var5][var58][var67];
                                int var73 = this.field46[var5][var58 + 1][var67];
                                int var74 = this.field46[var5][var58 + 1][var67 + 1];
                                int var75 = this.field46[var5][var58][var67 + 1];
                                int var76 = this.field53[var58][var67];
                                int var77 = this.field53[var58 + 1][var67];
                                int var78 = this.field53[var58 + 1][var67 + 1];
                                int var79 = this.field53[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method29(var82, var83, var84);
                                    int var85 = field64 + var82 & 0xFF;
                                    int var86 = field65 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method29(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field50[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !FloType.field1098[var71 - 1].field1102) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field59[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = Pix3D.field649[method27(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg2.method55(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field50[var5][var58][var67] + 1;
                                    byte var90 = this.field51[var5][var58][var67];
                                    FloType var91 = FloType.field1098[var71 - 1];
                                    int var92 = var91.field1100;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = Pix3D.method169(false, var92);
                                        var94 = -1;
                                    } else if (var91.field1099 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method29(var91.field1104, var91.field1105, var91.field1106);
                                        var93 = Pix3D.field649[this.method28(var91.field1109, 96)];
                                    }
                                    arg2.method55(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), this.method28(var94, var76), this.method28(var94, var77), this.method28(var94, var78), this.method28(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field45 - 1; var59++) {
                for (int var60 = 1; var60 < this.field44 - 1; var60++) {
                    arg2.method54(var5, var60, var59, this.method21(var5, var59, 11451, var60));
                }
            }
        }
        arg2.method81(-50, 64, -10, -52, -50, 768);
        for (int var6 = 0; var6 < this.field44; var6++) {
            for (int var47 = 0; var47 < this.field45; var47++) {
                if ((this.field47[1][var6][var47] & 0x2) == 2) {
                    arg2.method52((byte) -28, var6, var47);
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
                for (int var12 = 0; var12 <= this.field45; var12++) {
                    for (int var13 = 0; var13 <= this.field44; var13++) {
                        if ((this.field59[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field59[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field45 && (this.field59[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label326: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field59[var16 - 1][var13][var18] & var7) == 0) {
                                        break label326;
                                    }
                                }
                                var16--;
                            }
                            label315: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field59[var17 + 1][var13][var19] & var7) == 0) {
                                        break label315;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field46[var17][var13][var14] - var21;
                                int var23 = this.field46[var16][var13][var14];
                                World3D.method53(var10, var22, var15 * 128 + 128, (byte) 0, var13 * 128, var13 * 128, var14 * 128, var23, 1);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field59[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field59[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field59[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field44 && (this.field59[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label379: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field59[var28 - 1][var30][var12] & var8) == 0) {
                                        break label379;
                                    }
                                }
                                var28--;
                            }
                            label368: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field59[var29 + 1][var31][var12] & var8) == 0) {
                                        break label368;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field46[var29][var26][var12] - var33;
                                int var35 = this.field46[var28][var26][var12];
                                World3D.method53(var10, var34, var12 * 128, (byte) 0, var26 * 128, var27 * 128 + 128, var12 * 128, var35, 2);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field59[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field59[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field59[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field45 && (this.field59[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label432: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field59[var11][var38 - 1][var42] & var9) == 0) {
                                        break label432;
                                    }
                                }
                                var38--;
                            }
                            label421: while (var39 < this.field44) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field59[var11][var39 + 1][var43] & var9) == 0) {
                                        break label421;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field46[var11][var38][var40];
                                World3D.method53(var10, var44, var41 * 128 + 128, (byte) 0, var38 * 128, var39 * 128 + 128, var40 * 128, var44, 4);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field59[var11][var45][var46] &= ~var9;
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
    public int method21(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 11451) {
            return this.field38;
        } else if ((this.field47[arg0][arg3][arg1] & 0x8) == 0) {
            return arg0 <= 0 || (this.field47[1][arg3][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
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
        int var4 = 65536 - Pix3D.field638[arg2 * 1024 / arg3] >> 1;
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
        if (arg2 <= 0) {
            throw new NullPointerException();
        }
        LocType var3 = LocType.method325(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method328(0, arg1);
    }

    @OriginalMember(owner = "c", name = "a", descriptor = "(Lr;IIZIIILjc;[[[III)V")
    public static final void method31(World3D arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, CollisionMap arg7, int[][][] arg8, int arg9, int arg10) {
        int var11 = arg8[arg1][arg10][arg9];
        int var12 = arg8[arg1][arg10 + 1][arg9];
        int var13 = arg8[arg1][arg10 + 1][arg9 + 1];
        int var14 = arg8[arg1][arg10][arg9 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        if (!arg3) {
            return;
        }
        LocType var16 = LocType.method325(arg4);
        int var17 = (arg4 << 14) + (arg9 << 7) + arg10 + 1073741824;
        if (!var16.field964) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg6 << 6) + arg5);
        if (arg5 == 22) {
            Entity var19;
            if (var16.field968 == -1) {
                var19 = var16.method331(22, arg6, var11, var12, var13, var14, -1);
            } else {
                var19 = new LocEntity(22, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
            }
            arg0.method56(var15, var19, arg10, arg2, var17, true, var18, arg9);
            if (var16.field962 && var16.field964) {
                arg7.method355(true, arg10, arg9);
            }
        } else if (arg5 == 10 || arg5 == 11) {
            Entity var39;
            if (var16.field968 == -1) {
                var39 = var16.method331(10, arg6, var11, var12, var13, var14, -1);
            } else {
                var39 = new LocEntity(10, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg5 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg6 == 1 || arg6 == 3) {
                    var41 = var16.field961;
                    var42 = var16.field960;
                } else {
                    var41 = var16.field960;
                    var42 = var16.field961;
                }
                arg0.method60(-323, arg10, arg9, var42, arg2, var15, var39, var18, var41, var40, var17);
            }
            if (var16.field962) {
                arg7.method354(var16.field960, arg10, var16.field961, arg9, arg6, var16.field963, 9);
            }
        } else if (arg5 >= 12) {
            Entity var20;
            if (var16.field968 == -1) {
                var20 = var16.method331(arg5, arg6, var11, var12, var13, var14, -1);
            } else {
                var20 = new LocEntity(arg5, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
            }
            arg0.method60(-323, arg10, arg9, 1, arg2, var15, var20, var18, 1, 0, var17);
            if (var16.field962) {
                arg7.method354(var16.field960, arg10, var16.field961, arg9, arg6, var16.field963, 9);
            }
        } else if (arg5 == 0) {
            Entity var21;
            if (var16.field968 == -1) {
                var21 = var16.method331(0, arg6, var11, var12, var13, var14, -1);
            } else {
                var21 = new LocEntity(0, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
            }
            arg0.method58(field60[arg6], null, var15, arg10, arg2, var18, -30992, 0, var17, var21, arg9);
            if (var16.field962) {
                arg7.method353(arg6, arg5, var16.field963, arg9, (byte) 25, arg10);
            }
        } else if (arg5 == 1) {
            Entity var22;
            if (var16.field968 == -1) {
                var22 = var16.method331(1, arg6, var11, var12, var13, var14, -1);
            } else {
                var22 = new LocEntity(1, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
            }
            arg0.method58(field61[arg6], null, var15, arg10, arg2, var18, -30992, 0, var17, var22, arg9);
            if (var16.field962) {
                arg7.method353(arg6, arg5, var16.field963, arg9, (byte) 25, arg10);
            }
        } else if (arg5 == 2) {
            int var23 = arg6 + 1 & 0x3;
            Entity var24;
            Entity var25;
            if (var16.field968 == -1) {
                var24 = var16.method331(2, arg6 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method331(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new LocEntity(2, arg6 + 4, var16.field968, arg4, var13, field41, true, var12, var14, var11);
                var25 = new LocEntity(2, var23, var16.field968, arg4, var13, field41, true, var12, var14, var11);
            }
            arg0.method58(field60[arg6], var25, var15, arg10, arg2, var18, -30992, field60[var23], var17, var24, arg9);
            if (var16.field962) {
                arg7.method353(arg6, arg5, var16.field963, arg9, (byte) 25, arg10);
            }
        } else if (arg5 == 3) {
            Entity var26;
            if (var16.field968 == -1) {
                var26 = var16.method331(3, arg6, var11, var12, var13, var14, -1);
            } else {
                var26 = new LocEntity(3, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
            }
            arg0.method58(field61[arg6], null, var15, arg10, arg2, var18, -30992, 0, var17, var26, arg9);
            if (var16.field962) {
                arg7.method353(arg6, arg5, var16.field963, arg9, (byte) 25, arg10);
            }
        } else if (arg5 == 9) {
            Entity var27;
            if (var16.field968 == -1) {
                var27 = var16.method331(arg5, arg6, var11, var12, var13, var14, -1);
            } else {
                var27 = new LocEntity(arg5, arg6, var16.field968, arg4, var13, field41, true, var12, var14, var11);
            }
            arg0.method60(-323, arg10, arg9, 1, arg2, var15, var27, var18, 1, 0, var17);
            if (var16.field962) {
                arg7.method354(var16.field960, arg10, var16.field961, arg9, arg6, var16.field963, 9);
            }
        } else {
            if (var16.field965) {
                if (arg6 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg6 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg6 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg5 == 4) {
                Entity var32;
                if (var16.field968 == -1) {
                    var32 = var16.method331(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new LocEntity(4, 0, var16.field968, arg4, var13, field41, true, var12, var14, var11);
                }
                arg0.method59(field60[arg6], var32, var18, arg9, var15, 0, (byte) -18, arg6 * 512, arg2, arg10, 0, var17);
            } else if (arg5 == 5) {
                int var33 = 16;
                int var34 = arg0.method76(arg2, arg10, arg9);
                if (var34 > 0) {
                    var33 = LocType.method325(var34 >> 14 & 0x7FFF).field969;
                }
                Entity var35;
                if (var16.field968 == -1) {
                    var35 = var16.method331(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new LocEntity(4, 0, var16.field968, arg4, var13, field41, true, var12, var14, var11);
                }
                arg0.method59(field60[arg6], var35, var18, arg9, var15, field62[arg6] * var33, (byte) -18, arg6 * 512, arg2, arg10, field63[arg6] * var33, var17);
            } else if (arg5 == 6) {
                Entity var36;
                if (var16.field968 == -1) {
                    var36 = var16.method331(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new LocEntity(4, 0, var16.field968, arg4, var13, field41, true, var12, var14, var11);
                }
                arg0.method59(256, var36, var18, arg9, var15, 0, (byte) -18, arg6, arg2, arg10, 0, var17);
            } else if (arg5 == 7) {
                Entity var37;
                if (var16.field968 == -1) {
                    var37 = var16.method331(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new LocEntity(4, 0, var16.field968, arg4, var13, field41, true, var12, var14, var11);
                }
                arg0.method59(512, var37, var18, arg9, var15, 0, (byte) -18, arg6, arg2, arg10, 0, var17);
            } else if (arg5 == 8) {
                Entity var38;
                if (var16.field968 == -1) {
                    var38 = var16.method331(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new LocEntity(4, 0, var16.field968, arg4, var13, field41, true, var12, var14, var11);
                }
                arg0.method59(768, var38, var18, arg9, var15, 0, (byte) -18, arg6, arg2, arg10, 0, var17);
            }
        }
    }
}
