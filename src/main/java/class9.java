import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DBFHRNVI")
public class class9 {

    @OriginalMember(owner = "client!DBFHRNVI", name = "g", descriptor = "B")
    private byte field629 = 40;

    @OriginalMember(owner = "client!DBFHRNVI", name = "k", descriptor = "Z")
    private boolean field633 = true;

    @OriginalMember(owner = "client!DBFHRNVI", name = "o", descriptor = "Z")
    private boolean field637 = false;

    @OriginalMember(owner = "client!DBFHRNVI", name = "u", descriptor = "I")
    private int field643 = -942;

    @OriginalMember(owner = "client!DBFHRNVI", name = "z", descriptor = "Z")
    private boolean field648 = true;

    @OriginalMember(owner = "client!DBFHRNVI", name = "e", descriptor = "I")
    private int field627;

    @OriginalMember(owner = "client!DBFHRNVI", name = "f", descriptor = "I")
    private int field628;

    @OriginalMember(owner = "client!DBFHRNVI", name = "A", descriptor = "[[[I")
    private int[][][] field649;

    @OriginalMember(owner = "client!DBFHRNVI", name = "y", descriptor = "[[[B")
    private byte[][][] field647;

    @OriginalMember(owner = "client!DBFHRNVI", name = "l", descriptor = "[[[B")
    private byte[][][] field634;

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "[[[B")
    private byte[][][] field623;

    @OriginalMember(owner = "client!DBFHRNVI", name = "s", descriptor = "[[[B")
    private byte[][][] field641;

    @OriginalMember(owner = "client!DBFHRNVI", name = "p", descriptor = "[[[B")
    private byte[][][] field638;

    @OriginalMember(owner = "client!DBFHRNVI", name = "b", descriptor = "[[[I")
    private int[][][] field624;

    @OriginalMember(owner = "client!DBFHRNVI", name = "h", descriptor = "[[[B")
    private byte[][][] field630;

    @OriginalMember(owner = "client!DBFHRNVI", name = "x", descriptor = "[[I")
    private int[][] field646;

    @OriginalMember(owner = "client!DBFHRNVI", name = "C", descriptor = "[I")
    private int[] field651;

    @OriginalMember(owner = "client!DBFHRNVI", name = "D", descriptor = "[I")
    private int[] field652;

    @OriginalMember(owner = "client!DBFHRNVI", name = "E", descriptor = "[I")
    private int[] field653;

    @OriginalMember(owner = "client!DBFHRNVI", name = "F", descriptor = "[I")
    private int[] field654;

    @OriginalMember(owner = "client!DBFHRNVI", name = "G", descriptor = "[I")
    private int[] field655;

    @OriginalMember(owner = "client!DBFHRNVI", name = "c", descriptor = "Z")
    public static boolean field625 = true;

    @OriginalMember(owner = "client!DBFHRNVI", name = "d", descriptor = "I")
    public static int field626 = 99;

    @OriginalMember(owner = "client!DBFHRNVI", name = "i", descriptor = "[I")
    private static final int[] field631 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!DBFHRNVI", name = "m", descriptor = "[I")
    private static final int[] field635 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!DBFHRNVI", name = "n", descriptor = "I")
    private static int field636 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!DBFHRNVI", name = "q", descriptor = "I")
    private static int field639 = -578;

    @OriginalMember(owner = "client!DBFHRNVI", name = "r", descriptor = "I")
    private static int field640 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!DBFHRNVI", name = "v", descriptor = "[I")
    private static final int[] field644 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!DBFHRNVI", name = "B", descriptor = "[I")
    private static final int[] field650 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!DBFHRNVI", name = "t", descriptor = "I")
    private static int field642;

    @OriginalMember(owner = "client!DBFHRNVI", name = "w", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!DBFHRNVI", name = "j", descriptor = "Z")
    private static boolean field632;

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(IBI)Z")
    public static final boolean method164(int arg0, byte arg1, int arg2) {
        if (arg1 != -78) {
            throw new NullPointerException();
        }
        class14 var3 = class14.method196(arg0);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method199(arg2, 8);
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(IIIII)V")
    public final void method165(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg4; var6 <= arg2 + arg4; var6++) {
            for (int var8 = arg3; var8 <= arg0 + arg3; var8++) {
                if (var8 >= 0 && var8 < this.field627 && var6 >= 0 && var6 < this.field628) {
                    this.field630[0][var8][var6] = 127;
                    if (arg3 == var8 && var8 > 0) {
                        this.field649[0][var8][var6] = this.field649[0][var8 - 1][var6];
                    }
                    if (arg0 + arg3 == var8 && var8 < this.field627 - 1) {
                        this.field649[0][var8][var6] = this.field649[0][var8 + 1][var6];
                    }
                    if (arg4 == var6 && var6 > 0) {
                        this.field649[0][var8][var6] = this.field649[0][var8][var6 - 1];
                    }
                    if (arg2 + arg4 == var6 && var6 < this.field628 - 1) {
                        this.field649[0][var8][var6] = this.field649[0][var8][var6 + 1];
                    }
                }
            }
        }
        if (arg1 <= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(IIIIIIILPQBRPYKE;)V")
    private final void method166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class41 arg7) {
        if (arg5 != 0) {
            field642 = 170;
        }
        if (arg1 < 0 || arg1 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var11 = arg7.method340();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg7.method340();
                    return;
                }
                if (var11 <= 49) {
                    arg7.method340();
                }
            }
        }
        this.field647[arg4][arg1][arg3] = 0;
        while (true) {
            int var9 = arg7.method340();
            if (var9 == 0) {
                if (arg4 == 0) {
                    this.field649[0][arg1][arg3] = -method167(arg1 + arg6 + 932731, arg3 + 556238 + arg2) * 8;
                    return;
                } else {
                    this.field649[arg4][arg1][arg3] = this.field649[arg4 - 1][arg1][arg3] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg7.method340();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg4 == 0) {
                    this.field649[0][arg1][arg3] = -var10 * 8;
                    return;
                }
                this.field649[arg4][arg1][arg3] = this.field649[arg4 - 1][arg1][arg3] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field623[arg4][arg1][arg3] = arg7.method341();
                this.field641[arg4][arg1][arg3] = (byte) ((var9 - 2) / 4);
                this.field638[arg4][arg1][arg3] = (byte) (var9 + arg0 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field647[arg4][arg1][arg3] = (byte) (var9 - 49);
            } else {
                this.field634[arg4][arg1][arg3] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(II)I")
    private static final int method167(int arg0, int arg1) {
        int var2 = method174(arg0 + 45365, arg1 + 91923, 4) + (method174(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method174(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "([BIIB[LEOSBSGLH;II)V")
    public final void method168(byte[] arg0, int arg1, int arg2, byte arg3, class15[] arg4, int arg5, int arg6) {
        if (arg3 != -108) {
            this.field637 = !this.field637;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg2 + var13 > 0 && arg2 + var13 < 103 && arg5 + var14 > 0 && arg5 + var14 < 103) {
                        arg4[var8].field760[arg2 + var13][arg5 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class41 var9 = new class41(888, arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method166(0, arg2 + var11, arg6, arg5 + var12, var10, 0, arg1, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "([[[IIIILEOSBSGLH;IIIIILUMNOCQQA;)V")
    public static final void method169(int[][][] arg0, int arg1, int arg2, int arg3, class15 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class52 arg10) {
        int var11 = arg0[arg2][arg3][arg5];
        int var12 = arg0[arg2][arg3 + 1][arg5];
        int var13 = arg0[arg2][arg3 + 1][arg5 + 1];
        int var14 = arg0[arg2][arg3][arg5 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        int var16 = 48 / arg7;
        class14 var17 = class14.method196(arg6);
        int var18 = (arg6 << 14) + (arg5 << 7) + arg3 + 1073741824;
        if (!var17.field746) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg8 << 6) + arg9);
        if (arg9 == 22) {
            class20 var20;
            if (var17.field709 == -1 && var17.field738 == null) {
                var20 = var17.method201(22, arg8, var11, var12, var13, var14, -1);
            } else {
                var20 = new class13(var17.field709, arg6, 0, arg8, var12, var13, var11, 22, true, var14);
            }
            arg10.method477(var18, -953, var20, arg5, arg3, arg1, var19, var15);
            if (var17.field710 && var17.field746) {
                arg4.method205(arg3, arg5, 0);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class20 var40;
            if (var17.field709 == -1 && var17.field738 == null) {
                var40 = var17.method201(10, arg8, var11, var12, var13, var14, -1);
            } else {
                var40 = new class13(var17.field709, arg6, 0, arg8, var12, var13, var11, 10, true, var14);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg9 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg8 == 1 || arg8 == 3) {
                    var42 = var17.field735;
                    var43 = var17.field702;
                } else {
                    var42 = var17.field702;
                    var43 = var17.field735;
                }
                arg10.method481(arg3, var42, var18, var40, var41, var19, var43, arg5, 7, var15, arg1);
            }
            if (var17.field710) {
                arg4.method204(var17.field702, arg5, var17.field735, -7465, arg3, var17.field708, arg8);
            }
        } else if (arg9 >= 12) {
            class20 var21;
            if (var17.field709 == -1 && var17.field738 == null) {
                var21 = var17.method201(arg9, arg8, var11, var12, var13, var14, -1);
            } else {
                var21 = new class13(var17.field709, arg6, 0, arg8, var12, var13, var11, arg9, true, var14);
            }
            arg10.method481(arg3, 1, var18, var21, 0, var19, 1, arg5, 7, var15, arg1);
            if (var17.field710) {
                arg4.method204(var17.field702, arg5, var17.field735, -7465, arg3, var17.field708, arg8);
            }
        } else if (arg9 == 0) {
            class20 var22;
            if (var17.field709 == -1 && var17.field738 == null) {
                var22 = var17.method201(0, arg8, var11, var12, var13, var14, -1);
            } else {
                var22 = new class13(var17.field709, arg6, 0, arg8, var12, var13, var11, 0, true, var14);
            }
            arg10.method479(var15, null, arg5, field631[arg8], arg3, 0, arg1, var18, 893, var22, var19);
            if (var17.field710) {
                arg4.method203(var17.field708, arg3, arg8, arg5, arg9, true);
            }
        } else if (arg9 == 1) {
            class20 var23;
            if (var17.field709 == -1 && var17.field738 == null) {
                var23 = var17.method201(1, arg8, var11, var12, var13, var14, -1);
            } else {
                var23 = new class13(var17.field709, arg6, 0, arg8, var12, var13, var11, 1, true, var14);
            }
            arg10.method479(var15, null, arg5, field644[arg8], arg3, 0, arg1, var18, 893, var23, var19);
            if (var17.field710) {
                arg4.method203(var17.field708, arg3, arg8, arg5, arg9, true);
            }
        } else if (arg9 == 2) {
            int var24 = arg8 + 1 & 0x3;
            class20 var25;
            class20 var26;
            if (var17.field709 == -1 && var17.field738 == null) {
                var25 = var17.method201(2, arg8 + 4, var11, var12, var13, var14, -1);
                var26 = var17.method201(2, var24, var11, var12, var13, var14, -1);
            } else {
                var25 = new class13(var17.field709, arg6, 0, arg8 + 4, var12, var13, var11, 2, true, var14);
                var26 = new class13(var17.field709, arg6, 0, var24, var12, var13, var11, 2, true, var14);
            }
            arg10.method479(var15, var26, arg5, field631[arg8], arg3, field631[var24], arg1, var18, 893, var25, var19);
            if (var17.field710) {
                arg4.method203(var17.field708, arg3, arg8, arg5, arg9, true);
            }
        } else if (arg9 == 3) {
            class20 var27;
            if (var17.field709 == -1 && var17.field738 == null) {
                var27 = var17.method201(3, arg8, var11, var12, var13, var14, -1);
            } else {
                var27 = new class13(var17.field709, arg6, 0, arg8, var12, var13, var11, 3, true, var14);
            }
            arg10.method479(var15, null, arg5, field644[arg8], arg3, 0, arg1, var18, 893, var27, var19);
            if (var17.field710) {
                arg4.method203(var17.field708, arg3, arg8, arg5, arg9, true);
            }
        } else if (arg9 == 9) {
            class20 var28;
            if (var17.field709 == -1 && var17.field738 == null) {
                var28 = var17.method201(arg9, arg8, var11, var12, var13, var14, -1);
            } else {
                var28 = new class13(var17.field709, arg6, 0, arg8, var12, var13, var11, arg9, true, var14);
            }
            arg10.method481(arg3, 1, var18, var28, 0, var19, 1, arg5, 7, var15, arg1);
            if (var17.field710) {
                arg4.method204(var17.field702, arg5, var17.field735, -7465, arg3, var17.field708, arg8);
            }
        } else {
            if (var17.field732) {
                if (arg8 == 1) {
                    int var29 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg8 == 2) {
                    int var30 = var14;
                    var14 = var12;
                    var12 = var30;
                    int var31 = var13;
                    var13 = var11;
                    var11 = var31;
                } else if (arg8 == 3) {
                    int var32 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var32;
                }
            }
            if (arg9 == 4) {
                class20 var33;
                if (var17.field709 == -1 && var17.field738 == null) {
                    var33 = var17.method201(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var33 = new class13(var17.field709, arg6, 0, 0, var12, var13, var11, 4, true, var14);
                }
                arg10.method480(field631[arg8], 0, var18, var15, arg3, 0, var19, arg1, arg5, arg8 * 512, -981, var33);
            } else if (arg9 == 5) {
                int var34 = 16;
                int var35 = arg10.method497(arg1, arg3, arg5);
                if (var35 > 0) {
                    var34 = class14.method196(var35 >> 14 & 0x7FFF).field712;
                }
                class20 var36;
                if (var17.field709 == -1 && var17.field738 == null) {
                    var36 = var17.method201(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class13(var17.field709, arg6, 0, 0, var12, var13, var11, 4, true, var14);
                }
                arg10.method480(field631[arg8], field635[arg8] * var34, var18, var15, arg3, field650[arg8] * var34, var19, arg1, arg5, arg8 * 512, -981, var36);
            } else if (arg9 == 6) {
                class20 var37;
                if (var17.field709 == -1 && var17.field738 == null) {
                    var37 = var17.method201(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class13(var17.field709, arg6, 0, 0, var12, var13, var11, 4, true, var14);
                }
                arg10.method480(256, 0, var18, var15, arg3, 0, var19, arg1, arg5, arg8, -981, var37);
            } else if (arg9 == 7) {
                class20 var38;
                if (var17.field709 == -1 && var17.field738 == null) {
                    var38 = var17.method201(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class13(var17.field709, arg6, 0, 0, var12, var13, var11, 4, true, var14);
                }
                arg10.method480(512, 0, var18, var15, arg3, 0, var19, arg1, arg5, arg8, -981, var38);
            } else if (arg9 == 8) {
                class20 var39;
                if (var17.field709 == -1 && var17.field738 == null) {
                    var39 = var17.method201(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var39 = new class13(var17.field709, arg6, 0, 0, var12, var13, var11, 4, true, var14);
                }
                arg10.method480(768, 0, var18, var15, arg3, 0, var19, arg1, arg5, arg8, -981, var39);
            }
        }
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(LUMNOCQQA;[LEOSBSGLH;[BIIB)V")
    public final void method170(class52 arg0, class15[] arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        if (this.field629 != arg5) {
            this.field643 = 483;
        }
        class41 var7 = new class41(888, arg2);
        int var8 = -1;
        while (true) {
            int var9 = var7.method354();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method354();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method340();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg3 + var13;
                int var19 = arg4 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field647[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class15 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg1[var20];
                    }
                    this.method171(arg0, var8, var19, var14, false, var18, var21, var16, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "<init>", descriptor = "(II[[[B[[[II)V")
    public class9(int arg0, int arg1, byte[][][] arg2, int[][][] arg3, int arg4) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        field626 = 99;
        this.field627 = arg0;
        this.field628 = arg4;
        this.field649 = arg3;
        this.field647 = arg2;
        this.field634 = new byte[4][this.field627][this.field628];
        this.field623 = new byte[4][this.field627][this.field628];
        this.field641 = new byte[4][this.field627][this.field628];
        this.field638 = new byte[4][this.field627][this.field628];
        this.field624 = new int[4][this.field627 + 1][this.field628 + 1];
        this.field630 = new byte[4][this.field627 + 1][this.field628 + 1];
        this.field646 = new int[this.field627 + 1][this.field628 + 1];
        this.field651 = new int[this.field628];
        this.field652 = new int[this.field628];
        this.field653 = new int[this.field628];
        this.field654 = new int[this.field628];
        this.field655 = new int[this.field628];
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(LUMNOCQQA;IIIZILEOSBSGLH;II)V")
    private final void method171(class52 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class15 arg6, int arg7, int arg8) {
        if (field625 && (this.field647[0][arg5][arg2] & 0x2) == 0) {
            if ((this.field647[arg3][arg5][arg2] & 0x10) != 0) {
                return;
            }
            if (this.method173(-16053, arg2, arg3, arg5) != field645) {
                return;
            }
        }
        if (arg3 < field626) {
            field626 = arg3;
        }
        int var10 = this.field649[arg3][arg5][arg2];
        int var11 = this.field649[arg3][arg5 + 1][arg2];
        int var12 = this.field649[arg3][arg5 + 1][arg2 + 1];
        int var13 = this.field649[arg3][arg5][arg2 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class14 var15 = class14.method196(arg1);
        int var16 = (arg1 << 14) + (arg2 << 7) + arg5 + 1073741824;
        if (arg4) {
            field632 = !field632;
        }
        if (!var15.field746) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg8 << 6) + arg7);
        if (arg7 == 22) {
            if (!field625 || var15.field746 || var15.field740) {
                class20 var18;
                if (var15.field709 == -1 && var15.field738 == null) {
                    var18 = var15.method201(22, arg8, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class13(var15.field709, arg1, 0, arg8, var11, var12, var10, 22, true, var13);
                }
                arg0.method477(var16, -953, var18, arg2, arg5, arg3, var17, var14);
                if (var15.field710 && var15.field746 && arg6 != null) {
                    arg6.method205(arg5, arg2, 0);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class20 var38;
            if (var15.field709 == -1 && var15.field738 == null) {
                var38 = var15.method201(10, arg8, var10, var11, var12, var13, -1);
            } else {
                var38 = new class13(var15.field709, arg1, 0, arg8, var11, var12, var10, 10, true, var13);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg7 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg8 == 1 || arg8 == 3) {
                    var40 = var15.field735;
                    var41 = var15.field702;
                } else {
                    var40 = var15.field702;
                    var41 = var15.field735;
                }
                if (arg0.method481(arg5, var40, var16, var38, var39, var17, var41, arg2, 7, var14, arg3) && var15.field701) {
                    class16 var42;
                    if (var38 instanceof class16) {
                        var42 = (class16) var38;
                    } else {
                        var42 = var15.method201(10, arg8, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field799 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field630[arg3][arg5 + var43][arg2 + var44]) {
                                    this.field630[arg3][arg5 + var43][arg2 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field710 && arg6 != null) {
                arg6.method204(var15.field702, arg2, var15.field735, -7465, arg5, var15.field708, arg8);
            }
        } else if (arg7 >= 12) {
            class20 var19;
            if (var15.field709 == -1 && var15.field738 == null) {
                var19 = var15.method201(arg7, arg8, var10, var11, var12, var13, -1);
            } else {
                var19 = new class13(var15.field709, arg1, 0, arg8, var11, var12, var10, arg7, true, var13);
            }
            arg0.method481(arg5, 1, var16, var19, 0, var17, 1, arg2, 7, var14, arg3);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg3 > 0) {
                this.field624[arg3][arg5][arg2] |= 0x924;
            }
            if (var15.field710 && arg6 != null) {
                arg6.method204(var15.field702, arg2, var15.field735, -7465, arg5, var15.field708, arg8);
            }
        } else if (arg7 == 0) {
            class20 var20;
            if (var15.field709 == -1 && var15.field738 == null) {
                var20 = var15.method201(0, arg8, var10, var11, var12, var13, -1);
            } else {
                var20 = new class13(var15.field709, arg1, 0, arg8, var11, var12, var10, 0, true, var13);
            }
            arg0.method479(var14, null, arg2, field631[arg8], arg5, 0, arg3, var16, 893, var20, var17);
            if (arg8 == 0) {
                if (var15.field701) {
                    this.field630[arg3][arg5][arg2] = 50;
                    this.field630[arg3][arg5][arg2 + 1] = 50;
                }
                if (var15.field714) {
                    this.field624[arg3][arg5][arg2] |= 0x249;
                }
            } else if (arg8 == 1) {
                if (var15.field701) {
                    this.field630[arg3][arg5][arg2 + 1] = 50;
                    this.field630[arg3][arg5 + 1][arg2 + 1] = 50;
                }
                if (var15.field714) {
                    this.field624[arg3][arg5][arg2 + 1] |= 0x492;
                }
            } else if (arg8 == 2) {
                if (var15.field701) {
                    this.field630[arg3][arg5 + 1][arg2] = 50;
                    this.field630[arg3][arg5 + 1][arg2 + 1] = 50;
                }
                if (var15.field714) {
                    this.field624[arg3][arg5 + 1][arg2] |= 0x249;
                }
            } else if (arg8 == 3) {
                if (var15.field701) {
                    this.field630[arg3][arg5][arg2] = 50;
                    this.field630[arg3][arg5 + 1][arg2] = 50;
                }
                if (var15.field714) {
                    this.field624[arg3][arg5][arg2] |= 0x492;
                }
            }
            if (var15.field710 && arg6 != null) {
                arg6.method203(var15.field708, arg5, arg8, arg2, arg7, true);
            }
            if (var15.field712 != 16) {
                arg0.method487(arg3, arg2, arg5, var15.field712, -413);
            }
        } else if (arg7 == 1) {
            class20 var21;
            if (var15.field709 == -1 && var15.field738 == null) {
                var21 = var15.method201(1, arg8, var10, var11, var12, var13, -1);
            } else {
                var21 = new class13(var15.field709, arg1, 0, arg8, var11, var12, var10, 1, true, var13);
            }
            arg0.method479(var14, null, arg2, field644[arg8], arg5, 0, arg3, var16, 893, var21, var17);
            if (var15.field701) {
                if (arg8 == 0) {
                    this.field630[arg3][arg5][arg2 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field630[arg3][arg5 + 1][arg2 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field630[arg3][arg5 + 1][arg2] = 50;
                } else if (arg8 == 3) {
                    this.field630[arg3][arg5][arg2] = 50;
                }
            }
            if (var15.field710 && arg6 != null) {
                arg6.method203(var15.field708, arg5, arg8, arg2, arg7, true);
            }
        } else if (arg7 == 2) {
            int var22 = arg8 + 1 & 0x3;
            class20 var23;
            class20 var24;
            if (var15.field709 == -1 && var15.field738 == null) {
                var23 = var15.method201(2, arg8 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method201(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class13(var15.field709, arg1, 0, arg8 + 4, var11, var12, var10, 2, true, var13);
                var24 = new class13(var15.field709, arg1, 0, var22, var11, var12, var10, 2, true, var13);
            }
            arg0.method479(var14, var24, arg2, field631[arg8], arg5, field631[var22], arg3, var16, 893, var23, var17);
            if (var15.field714) {
                if (arg8 == 0) {
                    this.field624[arg3][arg5][arg2] |= 0x249;
                    this.field624[arg3][arg5][arg2 + 1] |= 0x492;
                } else if (arg8 == 1) {
                    this.field624[arg3][arg5][arg2 + 1] |= 0x492;
                    this.field624[arg3][arg5 + 1][arg2] |= 0x249;
                } else if (arg8 == 2) {
                    this.field624[arg3][arg5 + 1][arg2] |= 0x249;
                    this.field624[arg3][arg5][arg2] |= 0x492;
                } else if (arg8 == 3) {
                    this.field624[arg3][arg5][arg2] |= 0x492;
                    this.field624[arg3][arg5][arg2] |= 0x249;
                }
            }
            if (var15.field710 && arg6 != null) {
                arg6.method203(var15.field708, arg5, arg8, arg2, arg7, true);
            }
            if (var15.field712 != 16) {
                arg0.method487(arg3, arg2, arg5, var15.field712, -413);
            }
        } else if (arg7 == 3) {
            class20 var25;
            if (var15.field709 == -1 && var15.field738 == null) {
                var25 = var15.method201(3, arg8, var10, var11, var12, var13, -1);
            } else {
                var25 = new class13(var15.field709, arg1, 0, arg8, var11, var12, var10, 3, true, var13);
            }
            arg0.method479(var14, null, arg2, field644[arg8], arg5, 0, arg3, var16, 893, var25, var17);
            if (var15.field701) {
                if (arg8 == 0) {
                    this.field630[arg3][arg5][arg2 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field630[arg3][arg5 + 1][arg2 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field630[arg3][arg5 + 1][arg2] = 50;
                } else if (arg8 == 3) {
                    this.field630[arg3][arg5][arg2] = 50;
                }
            }
            if (var15.field710 && arg6 != null) {
                arg6.method203(var15.field708, arg5, arg8, arg2, arg7, true);
            }
        } else if (arg7 == 9) {
            class20 var26;
            if (var15.field709 == -1 && var15.field738 == null) {
                var26 = var15.method201(arg7, arg8, var10, var11, var12, var13, -1);
            } else {
                var26 = new class13(var15.field709, arg1, 0, arg8, var11, var12, var10, arg7, true, var13);
            }
            arg0.method481(arg5, 1, var16, var26, 0, var17, 1, arg2, 7, var14, arg3);
            if (var15.field710 && arg6 != null) {
                arg6.method204(var15.field702, arg2, var15.field735, -7465, arg5, var15.field708, arg8);
            }
        } else {
            if (var15.field732) {
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
            if (arg7 == 4) {
                class20 var31;
                if (var15.field709 == -1 && var15.field738 == null) {
                    var31 = var15.method201(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class13(var15.field709, arg1, 0, 0, var11, var12, var10, 4, true, var13);
                }
                arg0.method480(field631[arg8], 0, var16, var14, arg5, 0, var17, arg3, arg2, arg8 * 512, -981, var31);
            } else if (arg7 == 5) {
                int var32 = 16;
                int var33 = arg0.method497(arg3, arg5, arg2);
                if (var33 > 0) {
                    var32 = class14.method196(var33 >> 14 & 0x7FFF).field712;
                }
                class20 var34;
                if (var15.field709 == -1 && var15.field738 == null) {
                    var34 = var15.method201(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class13(var15.field709, arg1, 0, 0, var11, var12, var10, 4, true, var13);
                }
                arg0.method480(field631[arg8], field635[arg8] * var32, var16, var14, arg5, field650[arg8] * var32, var17, arg3, arg2, arg8 * 512, -981, var34);
            } else if (arg7 == 6) {
                class20 var35;
                if (var15.field709 == -1 && var15.field738 == null) {
                    var35 = var15.method201(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class13(var15.field709, arg1, 0, 0, var11, var12, var10, 4, true, var13);
                }
                arg0.method480(256, 0, var16, var14, arg5, 0, var17, arg3, arg2, arg8, -981, var35);
            } else if (arg7 == 7) {
                class20 var36;
                if (var15.field709 == -1 && var15.field738 == null) {
                    var36 = var15.method201(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class13(var15.field709, arg1, 0, 0, var11, var12, var10, 4, true, var13);
                }
                arg0.method480(512, 0, var16, var14, arg5, 0, var17, arg3, arg2, arg8, -981, var36);
            } else if (arg7 == 8) {
                class20 var37;
                if (var15.field709 == -1 && var15.field738 == null) {
                    var37 = var15.method201(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class13(var15.field709, arg1, 0, 0, var11, var12, var10, 4, true, var13);
                }
                arg0.method480(768, 0, var16, var14, arg5, 0, var17, arg3, arg2, arg8, -981, var37);
            }
        }
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "([LEOSBSGLH;IIIZIII[BI)V")
    public final void method172(class15[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg3 + var11 > 0 && arg3 + var11 < 103 && arg2 + var16 > 0 && arg2 + var16 < 103) {
                    arg0[arg7].field760[arg3 + var11][arg2 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        if (arg4) {
            return;
        }
        class41 var12 = new class41(888, arg8);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg6 == var13 && var14 >= arg1 && var14 < arg1 + 8 && var15 >= arg9 && var15 < arg9 + 8) {
                        this.method166(arg5, arg3 + class68.method575(var14 & 0x7, this.field633, var15 & 0x7, arg5), 0, arg2 + class68.method576(arg5, field632, var15 & 0x7, var14 & 0x7), arg7, 0, 0, var12);
                    } else {
                        this.method166(0, -1, 0, -1, 0, 0, 0, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(IIII)I")
    public int method173(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -16053) {
            this.field633 = !this.field633;
        }
        if ((this.field647[arg2][arg3][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (this.field647[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(III)I")
    private static final int method174(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method176(var3, var5);
        int var8 = method176(var3 + 1, var5);
        int var9 = method176(var3, var5 + 1);
        int var10 = method176(var3 + 1, var5 + 1);
        int var11 = method180(var7, var8, var4, arg2);
        int var12 = method180(var9, var10, var4, arg2);
        return method180(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "b", descriptor = "(II)I")
    private static final int method175(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!DBFHRNVI", name = "c", descriptor = "(II)I")
    private static final int method176(int arg0, int arg1) {
        int var2 = method182(arg0 - 1, arg1 - 1) + method182(arg0 + 1, arg1 - 1) + method182(arg0 - 1, arg1 + 1) + method182(arg0 + 1, arg1 + 1);
        int var3 = method182(arg0 - 1, arg1) + method182(arg0 + 1, arg1) + method182(arg0, arg1 - 1) + method182(arg0, arg1 + 1);
        int var4 = method182(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "b", descriptor = "(IIII)V")
    public final void method177(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var9 = 0; var9 < 8; var9++) {
                this.field649[arg1][arg2 + var5][arg3 + var9] = 0;
            }
        }
        if (arg0 != -11121) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg2 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field649[arg1][arg2][arg3 + var7] = this.field649[arg1][arg2 - 1][arg3 + var7];
            }
        }
        if (arg3 > 0) {
            for (int var8 = 1; var8 < 8; var8++) {
                this.field649[arg1][arg2 + var8][arg3] = this.field649[arg1][arg2 + var8][arg3 - 1];
            }
        }
        if (arg2 > 0 && this.field649[arg1][arg2 - 1][arg3] != 0) {
            this.field649[arg1][arg2][arg3] = this.field649[arg1][arg2 - 1][arg3];
        } else if (arg3 > 0 && this.field649[arg1][arg2][arg3 - 1] != 0) {
            this.field649[arg1][arg2][arg3] = this.field649[arg1][arg2][arg3 - 1];
        } else if (arg2 > 0 && arg3 > 0 && this.field649[arg1][arg2 - 1][arg3 - 1] != 0) {
            this.field649[arg1][arg2][arg3] = this.field649[arg1][arg2 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(IIB[B)Z")
    public static final boolean method178(int arg0, int arg1, byte arg2, byte[] arg3) {
        boolean var4 = true;
        if (arg2 == 1) {
            boolean var5 = false;
        } else {
            field632 = !field632;
        }
        class41 var6 = new class41(888, arg3);
        int var7 = -1;
        label60: while (true) {
            int var8 = var6.method354();
            if (var8 == 0) {
                return var4;
            }
            var7 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var6.method354();
                    if (var12 == 0) {
                        continue label60;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 & 0x3F;
                    int var14 = var9 >> 6 & 0x3F;
                    int var15 = var6.method340() >> 2;
                    int var16 = arg0 + var14;
                    int var17 = arg1 + var13;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        class14 var18 = class14.method196(var7);
                        if (var15 != 22 || !field625 || var18.field746 || var18.field740) {
                            var4 &= var18.method200(9814);
                            var10 = true;
                        }
                    }
                }
                int var11 = var6.method354();
                if (var11 == 0) {
                    break;
                }
                var6.method340();
            }
        }
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(LPQBRPYKE;ILQUPTMIEH;)V")
    public static final void method179(class41 arg0, int arg1, class42 arg2) {
        if (arg1 != 39766) {
            field642 = 262;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg0.method354();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class14 var5 = class14.method196(var3);
            var5.method192(field639, arg2);
            while (true) {
                int var6 = arg0.method354();
                if (var6 == 0) {
                    break;
                }
                arg0.method340();
            }
        }
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "c", descriptor = "(IIII)I")
    private static final int method180(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class39.field1198[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "d", descriptor = "(II)I")
    private final int method181(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!DBFHRNVI", name = "e", descriptor = "(II)I")
    private static final int method182(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "b", descriptor = "(III)I")
    private final int method183(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(IIILUMNOCQQA;I[LEOSBSGLH;III[BI)V")
    public final void method184(int arg0, int arg1, int arg2, class52 arg3, int arg4, class15[] arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        class41 var12 = new class41(888, arg9);
        if (arg4 != 0) {
            this.field637 = !this.field637;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method354();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method354();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method340();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg0 == var19 && var18 >= arg10 && var18 < arg10 + 8 && var17 >= arg2 && var17 < arg2 + 8) {
                    class14 var23 = class14.method196(var13);
                    int var24 = arg1 + class68.method577(var18 & 0x7, var23.field702, 9, arg8, var23.field735, var22, var17 & 0x7);
                    int var25 = arg7 + class68.method578(arg8, this.field648, var17 & 0x7, var23.field735, var18 & 0x7, var22, var23.field702);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg6;
                        if ((this.field647[1][var24][var25] & 0x2) == 2) {
                            var26 = arg6 - 1;
                        }
                        class15 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg5[var26];
                        }
                        this.method171(arg3, var13, var25, arg6, false, var24, var27, var21, arg8 + var22 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(I[LEOSBSGLH;LUMNOCQQA;)V")
    public final void method185(int arg0, class15[] arg1, class52 arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field647[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field647[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method205(var110, var111, 0);
                        }
                    }
                }
            }
        }
        field640 += (int) (Math.random() * 5.0D) - 2;
        if (field640 < -8) {
            field640 = -8;
        }
        if (field640 > 8) {
            field640 = 8;
        }
        field636 += (int) (Math.random() * 5.0D) - 2;
        if (field636 < -16) {
            field636 = -16;
        }
        if (field636 > 16) {
            field636 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field630[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field628 - 1; var56++) {
                for (int var101 = 1; var101 < this.field627 - 1; var101++) {
                    int var102 = this.field649[var5][var101 + 1][var56] - this.field649[var5][var101 - 1][var56];
                    int var103 = this.field649[var5][var101][var56 + 1] - this.field649[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field646[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field628; var57++) {
                this.field651[var57] = 0;
                this.field652[var57] = 0;
                this.field653[var57] = 0;
                this.field654[var57] = 0;
                this.field655[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field627 + 5; var58++) {
                for (int var61 = 0; var61 < this.field628; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field627) {
                        int var96 = this.field634[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class33 var97 = class33.field1116[var96 - 1];
                            this.field651[var61] += var97.field1125;
                            this.field652[var61] += var97.field1123;
                            this.field653[var61] += var97.field1124;
                            this.field654[var61] += var97.field1126;
                            var10002 = this.field655[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field627) {
                        int var99 = this.field634[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class33 var100 = class33.field1116[var99 - 1];
                            this.field651[var61] -= var100.field1125;
                            this.field652[var61] -= var100.field1123;
                            this.field653[var61] -= var100.field1124;
                            this.field654[var61] -= var100.field1126;
                            var10002 = this.field655[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field627 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field628 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field628) {
                            var62 += this.field651[var68];
                            var63 += this.field652[var68];
                            var64 += this.field653[var68];
                            var65 += this.field654[var68];
                            var66 += this.field655[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field628) {
                            var62 -= this.field651[var69];
                            var63 -= this.field652[var69];
                            var64 -= this.field653[var69];
                            var65 -= this.field654[var69];
                            var66 -= this.field655[var69];
                        }
                        if (var67 >= 1 && var67 < this.field628 - 1 && (!field625 || (this.field647[0][var58][var67] & 0x2) != 0 || (this.field647[var5][var58][var67] & 0x10) == 0 && this.method173(-16053, var67, var5, var58) == field645)) {
                            if (var5 < field626) {
                                field626 = var5;
                            }
                            int var70 = this.field634[var5][var58][var67] & 0xFF;
                            int var71 = this.field623[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field649[var5][var58][var67];
                                int var73 = this.field649[var5][var58 + 1][var67];
                                int var74 = this.field649[var5][var58 + 1][var67 + 1];
                                int var75 = this.field649[var5][var58][var67 + 1];
                                int var76 = this.field646[var58][var67];
                                int var77 = this.field646[var58 + 1][var67];
                                int var78 = this.field646[var58 + 1][var67 + 1];
                                int var79 = this.field646[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method183(var82, var83, var84);
                                    int var85 = field640 + var82 & 0xFF;
                                    int var86 = field636 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method183(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field641[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class33.field1116[var71 - 1].field1121) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field624[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class39.field1209[method175(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg2.method476(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method175(var80, var76), method175(var80, var77), method175(var80, var78), method175(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field641[var5][var58][var67] + 1;
                                    byte var90 = this.field638[var5][var58][var67];
                                    class33 var91 = class33.field1116[var71 - 1];
                                    int var92 = var91.field1119;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class39.method312(0, var92);
                                        var94 = -1;
                                    } else if (var91.field1118 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class39.field1209[this.method181(var91.field1127, 96)];
                                    } else {
                                        var94 = this.method183(var91.field1122, var91.field1123, var91.field1124);
                                        var93 = class39.field1209[this.method181(var91.field1127, 96)];
                                    }
                                    arg2.method476(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method175(var80, var76), method175(var80, var77), method175(var80, var78), method175(var80, var79), this.method181(var94, var76), this.method181(var94, var77), this.method181(var94, var78), this.method181(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field628 - 1; var59++) {
                for (int var60 = 1; var60 < this.field627 - 1; var60++) {
                    arg2.method475(var5, var60, var59, this.method173(-16053, var59, var5, var60));
                }
            }
        }
        arg2.method502(-50, -50, -10, 83);
        for (int var6 = 0; var6 < this.field627; var6++) {
            for (int var47 = 0; var47 < this.field628; var47++) {
                if ((this.field647[1][var6][var47] & 0x2) == 2) {
                    arg2.method473(var6, 4, var47);
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
                for (int var12 = 0; var12 <= this.field628; var12++) {
                    for (int var13 = 0; var13 <= this.field627; var13++) {
                        if ((this.field624[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field624[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field628 && (this.field624[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field624[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field624[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field649[var17][var13][var14] - var21;
                                int var23 = this.field649[var16][var13][var14];
                                class52.method474(var23, var13 * 128, var15 * 128 + 128, false, var13 * 128, var14 * 128, 1, var10, var22);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field624[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field624[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field624[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field627 && (this.field624[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field624[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field624[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field649[var29][var26][var12] - var33;
                                int var35 = this.field649[var28][var26][var12];
                                class52.method474(var35, var26 * 128, var12 * 128, false, var27 * 128 + 128, var12 * 128, 2, var10, var34);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field624[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field624[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field624[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field628 && (this.field624[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field624[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field627) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field624[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field649[var11][var38][var40];
                                class52.method474(var44, var38 * 128, var41 * 128 + 128, false, var39 * 128 + 128, var40 * 128, 4, var10, var44);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field624[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 > 0) {
            ;
        }
    }
}
