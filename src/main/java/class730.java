import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class730 {

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "[I")
    private int[] field10079 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "[I")
    private int[] field10096 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "Lwn;")
    private class573 field10090;

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
    public int field10098;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public int field10077;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "Lvk;")
    private class446 field10094;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "Z")
    public boolean field10088;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public int field10087;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "[[[I")
    public int[][][] field10085;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "[[[B")
    private byte[][][] field10082;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "[[[B")
    public byte[][][] field10092;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "[[[B")
    private byte[][][] field10095;

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "[[[B")
    private byte[][][] field10100;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "[[[B")
    private byte[][][] field10081;

    @OriginalMember(owner = "client!rs", name = "D", descriptor = "[[Ljava/lang/String;")
    public static String[][] field10103 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "Ljn;")
    public static class134 field10089 = new class134(58, 6);

    @OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
    public static int field10105 = 0;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field10074;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field10075;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field10076;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field10078;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field10080;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field10083;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field10084;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public static int field10091;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public static int field10093;

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "I")
    public static int field10097;

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "I")
    public static int field10099;

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "I")
    public static int field10101;

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "I")
    public static int field10102;

    @OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
    public static int field10104;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "[[[B")
    public byte[][][] field10086;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILgga;[Lsn;II)V", line = 6)
    public final void method4053(int arg0, int arg1, int arg2, class511 arg3, class739[] arg4, int arg5, int arg6) {
        field10091++;
        if (!this.field10088) {
            for (int var8 = 0; var8 < 4; var8++) {
                class739 var9 = arg4[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg6 + var10;
                        int var13 = arg0 + var11;
                        if (var12 >= 0 && var12 < this.field10077 && var13 >= 0 && var13 < this.field10087) {
                            var9.method4096(var13, var12, 6936);
                        }
                    }
                }
            }
        }
        if (arg5 != 152) {
            this.field10086 = null;
        }
        int var14 = arg2 + arg6;
        int var15 = arg0 + arg1;
        for (int var16 = 0; var16 < this.field10098; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method4065(arg3, arg5 ^ 0x99, var14 + var17, 0, var16, arg0 + var18, var15 + var18, false, var17 + arg6, 0, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z[[II)V", line = 83)
    public final void method4054(boolean arg0, int[][] arg1, int arg2) {
        field10101++;
        int[][] var4 = this.field10085[arg2];
        if (arg0) {
            return;
        }
        for (int var5 = 0; var5 < this.field10077 + 1; var5++) {
            for (int var6 = 0; var6 < this.field10087 + 1; var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)[Lqha;", line = 110)
    public static final class396[] method4055(int arg0) {
        if (arg0 == 1) {
            field10074++;
            return new class396[] { class65.field721, class483.field6691, class521.field7192 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZII)V", line = 123)
    public final void method4056(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field10076++;
        for (int var6 = 0; var6 < this.field10098; var6++) {
            this.method4061((byte) 98, arg1, arg0, arg3, arg4, var6);
        }
        if (arg2) {
            method4057(-9);
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V", line = 140)
    public static void method4057(int arg0) {
        if (arg0 != 2) {
            field10089 = null;
        }
        field10103 = null;
        field10089 = null;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(IIIZLvk;Lwn;)V", line = 2356)
    public class730(int arg0, int arg1, int arg2, boolean arg3, class446 arg4, class573 arg5) {
        this.field10090 = arg5;
        this.field10098 = arg0;
        this.field10077 = arg1;
        this.field10094 = arg4;
        this.field10088 = arg3;
        this.field10087 = arg2;
        this.field10085 = new int[this.field10098][this.field10077 + 1][this.field10087 + 1];
        this.field10082 = new byte[this.field10098][this.field10077][this.field10087];
        this.field10092 = new byte[this.field10098][this.field10077 + 1][this.field10087 + 1];
        this.field10095 = new byte[this.field10098][this.field10077][this.field10087];
        this.field10100 = new byte[this.field10098][this.field10077][this.field10087];
        this.field10081 = new byte[this.field10098][this.field10077][this.field10087];
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIII[Lsn;IIILgga;)V", line = 158)
    public final void method4058(int arg0, int arg1, int arg2, int arg3, int arg4, class739[] arg5, int arg6, int arg7, int arg8, class511 arg9) {
        field10084++;
        int var11 = (arg8 & 0x7) * 8;
        int var12 = (arg4 & arg3) * 8;
        if (!this.field10088) {
            class739 var13 = arg5[arg2];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class457.method2749(var15 & 0x7, var14 & 0x7, arg7, arg3 ^ 0xFFFFFFF8) + arg0;
                    int var17 = class32.method266(var15 & 0x7, (byte) -74, var14 & 0x7, arg7) + arg6;
                    if (var16 > 0 && var16 < this.field10077 - 1 && var17 > 0 && (this.field10087 - 1) > var17) {
                        var13.method4096(var17, var16, 6936);
                    }
                }
            }
        }
        int var18 = (arg8 & 0xFFFFFFF8) << 3;
        int var19 = arg4 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg7 == 1) {
            var21 = 1;
        } else if (arg7 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg7 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field10098; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 == var22 && var11 <= var23 && var11 + 8 >= var23 && var12 <= var24 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var12 + 8 == var24) {
                            if (arg7 == 0) {
                                var25 = var23 - (var11 - arg0);
                                var26 = var24 + arg6 - var12;
                            } else if (arg7 == 1) {
                                var26 = var11 + 8 - (var23 - arg6);
                                var25 = -var12 - (-var24 - arg0);
                            } else if (arg7 == 2) {
                                var25 = var11 + arg0 + 8 - var23;
                                var26 = var12 + arg6 + 8 - var24;
                            } else {
                                var26 = arg6 + var23 - var11;
                                var25 = -var24 - (-var12 - arg0 - 8);
                            }
                            this.method4065(arg9, 1, var18 + var23, 0, arg2, var26, var19 + var24, true, var25, 0, 0);
                        } else {
                            var25 = class457.method2749(var24 & 0x7, var23 & 0x7, arg7, arg3 ^ 0xFFFFFFF8) + arg0;
                            var26 = class32.method266(var24 & 0x7, (byte) -74, var23 & 0x7, arg7) + arg6;
                            this.method4065(arg9, 1, var18 + var23, var21, arg2, var26, var19 + var24, false, var25, var20, arg7);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var30 = var24 == 63 ? 64 : var24;
                                    var29 = var23 == 63 ? 64 : var23;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg7 == 0) {
                                    var31 = var30 + arg6 - var12;
                                    var32 = var29 + arg0 - var11;
                                } else if (arg7 == 1) {
                                    var32 = var30 + arg0 - var12;
                                    var31 = arg6 + var11 + 8 - var29;
                                } else if (arg7 == 2) {
                                    var32 = arg0 + 8 - (-var11 + var29);
                                    var31 = arg6 + (var12 - var30) + 8;
                                } else {
                                    var32 = arg0 - (var30 - var12 - 8);
                                    var31 = var29 + arg6 - var11;
                                }
                                if (var32 >= 0 && var32 < this.field10077 && var31 >= 0 && this.field10087 > var31) {
                                    this.field10085[arg2][var32][var31] = this.field10085[arg2][var25 + var20][var26 + var21];
                                }
                            }
                        }
                    } else {
                        this.method4065(arg9, 1, 0, 0, 0, -1, 0, false, -1, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([[[ILha;B[Lsn;)V", line = 362)
    public final void method4059(int[][][] arg0, class473 arg1, byte arg2, class739[] arg3) {
        if (!this.field10088) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field10077; var6++) {
                    for (int var7 = 0; var7 < this.field10087; var7++) {
                        if ((class533.field7338[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class533.field7338[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method4101(arg2 - 8991, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        field10099++;
        if (arg2 != 85) {
            method4055(-93);
        }
        for (int var9 = 0; var9 < this.field10098; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field10088) {
                if (class713.field9926) {
                    var10 |= 0x2;
                }
                if (class647.field9049) {
                    var11 |= 0x8;
                }
                if (class715.field9931 != 0) {
                    if (class93.field1084 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class713.field9926) {
                var11 |= 0x7;
            }
            if (!class91.field1064) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || var9 >= arg0.length ? this.field10085[var9] : arg0[var9];
            class492.method2905(var9, arg1.method204(this.field10077, this.field10087, this.field10085[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ls;Ls;[[ILha;Ls;II)V", line = 459)
    private final void method4060(class418 arg0, class418 arg1, int[][] arg2, class473 arg3, class418 arg4, int arg5, int arg6) {
        field10075++;
        byte[][] var8 = this.field10095[arg6];
        byte[][] var9 = this.field10100[arg6];
        byte[][] var10 = this.field10081[arg6];
        if (arg5 != -1) {
            this.method4053(-53, 79, -30, null, null, 88, 53);
        }
        byte[][] var11 = this.field10082[arg6];
        for (int var12 = 0; var12 < this.field10077; var12++) {
            int var13 = (this.field10077 - 1) > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field10087; var14++) {
                int var15 = (this.field10087 - 1) > var14 ? var14 + 1 : var14;
                if (class151.field1983 == -1 || class421.method2541(arg6, class151.field1983, -1, var14, var12)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class250 var26 = var21 == 0 ? null : this.field10094.method2703(true, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class189 var27 = var22 == 0 ? null : this.field10090.method3366(var22 - 1, -111);
                        class250 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3713 == -1 && var26.field3716 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3715;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field10077 > var12 && var14 < this.field10087) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var35++;
                            } else {
                                var35--;
                                var33--;
                            }
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var33--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var36--;
                                var34--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var35++;
                                var36++;
                            } else {
                                var35--;
                                var36--;
                            }
                            int var37 = var35 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg4.method2525(var12, var14, (byte) 114) - arg4.method2525(var13, var15, (byte) 114);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg4.method2525(var13, var14, (byte) 114) - arg4.method2525(var12, var15, (byte) 114);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class769.field10588[var39] = -1;
                            class504.field6871[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3715 ? class107.field1253[var19] : class521.field7191[var19];
                        this.method4063(var27, var8, arg3, var14, var18, var12, 1, var20, var11, var26, this.field10087, var9, var19, this.field10077);
                        boolean var41 = var26 != null && var26.field3716 != var26.field3713;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class769.field10588[var42] >= 0 && class634.field8848[var42] != class470.field6514[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class512.method3052(var18[1], class407.method2490(class504.field6871[2], class504.field6871[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class512.method3052(var18[3], class407.method2490(class504.field6871[0], class504.field6871[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class512.method3052(var18[0], class407.method2490(class504.field6871[2], class504.field6871[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class512.method3052(var18[2], class407.method2490(class504.field6871[4], class504.field6871[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var45 = var26 == null ? 0 : class422.field5873[var19];
                            var46 = class507.field6887[var19];
                            var47 = class95.field1111[var19];
                            var48 = class793.field10865[var19];
                            var49 = var27 == null ? 0 : class386.field5514[var19];
                        } else if (var17) {
                            var48 = class708.field9829[var19];
                            var46 = class451.field6296[var19];
                            var44 = class568.field8014[var19];
                            var45 = var26 == null ? 0 : class660.field9296[var19];
                            var47 = class772.field10634[var19];
                            var49 = var27 == null ? 0 : class214.field2964[var19];
                        } else {
                            var47 = class213.field2945[var19];
                            var45 = var26 == null ? 0 : class653.field9111[var19];
                            var48 = class736.field10135[var19];
                            var49 = var27 == null ? 0 : class403.field5678[var19];
                            var44 = class404.field5703[var19];
                            var46 = class294.field4316[var19];
                        }
                        int var50 = var45 + var49;
                        if (var50 <= 0) {
                            class208.method1321(arg6, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg0 == null ? null : new int[var53];
                            int[] var61 = arg0 == null && arg1 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var64 = var26.field3712;
                                var62 = var26.field3713;
                                var63 = var26.field3706;
                                int var65 = class623.method3583(-1, var26, arg3);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class453.field6313[0] = var46[var51];
                                        class453.field6313[1] = 1;
                                        class453.field6313[2] = var47[var51];
                                        class453.field6313[3] = 1;
                                        class453.field6313[4] = var48[var51];
                                        var68 = 6;
                                        class453.field6313[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class453.field6313[0] = var46[var51];
                                        class453.field6313[1] = 5;
                                        class453.field6313[2] = var47[var51];
                                        class453.field6313[3] = 5;
                                        class453.field6313[4] = var48[var51];
                                        var68 = 6;
                                        class453.field6313[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class453.field6313[0] = var46[var51];
                                        class453.field6313[1] = 3;
                                        class453.field6313[2] = var47[var51];
                                        class453.field6313[3] = 3;
                                        class453.field6313[4] = var48[var51];
                                        class453.field6313[5] = var47[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class453.field6313[0] = var46[var51];
                                        class453.field6313[1] = 7;
                                        class453.field6313[2] = var47[var51];
                                        class453.field6313[3] = 7;
                                        class453.field6313[4] = var48[var51];
                                        var68 = 6;
                                        class453.field6313[5] = var47[var51];
                                    } else {
                                        class453.field6313[0] = var46[var51];
                                        class453.field6313[1] = var48[var51];
                                        class453.field6313[2] = var47[var51];
                                        var68 = 3;
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class453.field6313[var69];
                                        int var71 = var70 - var20 * 2 & 0x7;
                                        int var72 = this.field10096[var70];
                                        int var73 = this.field10079[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 512 - var72;
                                        } else if (var20 == 2) {
                                            var75 = 512 - var73;
                                            var74 = 512 - var72;
                                        } else if (var20 == 3) {
                                            var75 = var72;
                                            var74 = 512 - var73;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class373.field5366[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg0.method2529(var77, var76, (byte) -128) - arg4.method2529(var77, var76, (byte) -128);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class373.field5366[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg4.method2529(var79, var78, (byte) -128) - arg0.method2529(var79, var78, (byte) -128);
                                            } else if (arg1 != null && !class154.field2011[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg1.method2529(var81, var80, (byte) -128) - arg4.method2529(var81, var80, (byte) -128);
                                            }
                                        }
                                        if (var70 < 8 && class769.field10588[var71] > var26.field3717) {
                                            if (var54 != null) {
                                                var54[var52] = class634.field8848[var71];
                                            }
                                            var59[var52] = class502.field6862[var71];
                                            var58[var52] = class378.field5426[var71];
                                            var57[var52] = class470.field6514[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field3706;
                                            var59[var52] = var26.field3712;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field10088 && arg6 == 0) {
                                    class528.method3137(var12, var14, var26.field3714, var26.field3721 * 8, var26.field3718);
                                }
                                if (var19 != 12 && var26.field3713 != -1 && var26.field3705) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class422.field5873[var19];
                            } else if (var17) {
                                var51 += class660.field9296[var19];
                            } else {
                                var51 += class653.field9111[var19];
                            }
                            if (var27 != null) {
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class189 var82 = this.field10090.method3366(var22 - 1, -113);
                                class189 var83 = this.field10090.method3366(var23 - 1, -115);
                                class189 var84 = this.field10090.method3366(var24 - 1, -112);
                                class189 var85 = this.field10090.method3366(var25 - 1, -120);
                                for (int var86 = 0; var86 < var49; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class453.field6313[0] = var46[var51];
                                        class453.field6313[1] = 1;
                                        class453.field6313[2] = var47[var51];
                                        class453.field6313[3] = 1;
                                        class453.field6313[4] = var48[var51];
                                        class453.field6313[5] = var47[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class453.field6313[0] = var46[var51];
                                        class453.field6313[1] = 5;
                                        class453.field6313[2] = var47[var51];
                                        class453.field6313[3] = 5;
                                        class453.field6313[4] = var48[var51];
                                        var88 = 6;
                                        class453.field6313[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class453.field6313[0] = var46[var51];
                                        class453.field6313[1] = 3;
                                        class453.field6313[2] = var47[var51];
                                        class453.field6313[3] = 3;
                                        class453.field6313[4] = var48[var51];
                                        var88 = 6;
                                        class453.field6313[5] = var47[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class453.field6313[0] = var46[var51];
                                        class453.field6313[1] = 7;
                                        class453.field6313[2] = var47[var51];
                                        class453.field6313[3] = 7;
                                        class453.field6313[4] = var48[var51];
                                        var88 = 6;
                                        class453.field6313[5] = var47[var51];
                                    } else {
                                        class453.field6313[0] = var46[var51];
                                        class453.field6313[1] = var48[var51];
                                        var88 = 3;
                                        class453.field6313[2] = var47[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class453.field6313[var89];
                                        int var91 = var90 - var20 * 2 & 0x7;
                                        int var92 = this.field10096[var90];
                                        int var93 = this.field10079[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = 512 - var92;
                                            var95 = var93;
                                        } else if (var20 == 2) {
                                            var95 = 512 - var92;
                                            var94 = 512 - var93;
                                        } else if (var20 == 3) {
                                            var94 = var92;
                                            var95 = 512 - var93;
                                        } else {
                                            var95 = var92;
                                            var94 = var93;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class373.field5366[var19][var90]) {
                                            int var96 = (var12 << 9) + var95;
                                            int var97 = (var14 << 9) + var94;
                                            var60[var52] = arg0.method2529(var97, var96, (byte) -128) - arg4.method2529(var97, var96, (byte) -128);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class373.field5366[var19][var90]) {
                                                int var98 = (var12 << 9) + var95;
                                                int var99 = (var14 << 9) + var94;
                                                var61[var52] = arg4.method2529(var99, var98, (byte) -128) - arg0.method2529(var99, var98, (byte) -128);
                                            } else if (arg1 != null && !class154.field2011[var19][var90]) {
                                                int var100 = (var12 << 9) + var95;
                                                int var101 = (var14 << 9) + var94;
                                                var61[var52] = arg1.method2529(var101, var100, (byte) -128) - arg4.method2529(var101, var100, (byte) -128);
                                            }
                                        }
                                        if (var90 < 8 && class769.field10588[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class634.field8848[var91];
                                            }
                                            var59[var52] = class502.field6862[var91];
                                            var58[var52] = class378.field5426[var91];
                                            var57[var52] = class470.field6514[var91];
                                        } else {
                                            if (var17 && class373.field5366[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg2[var12][var14];
                                                var58[var52] = var82.field2355;
                                                var59[var52] = var82.field2354;
                                            } else if (var95 == 0 && var94 == 512) {
                                                var57[var52] = arg2[var12][var15];
                                                var58[var52] = var83.field2355;
                                                var59[var52] = var83.field2354;
                                            } else if (var95 == 512 && var94 == 512) {
                                                var57[var52] = arg2[var13][var15];
                                                var58[var52] = var84.field2355;
                                                var59[var52] = var84.field2354;
                                            } else if (var95 == 512 && var94 == 0) {
                                                var57[var52] = arg2[var13][var14];
                                                var58[var52] = var85.field2355;
                                                var59[var52] = var85.field2354;
                                            } else {
                                                if (var95 >= 256) {
                                                    if (var94 < 256) {
                                                        var58[var52] = var85.field2355;
                                                        var59[var52] = var85.field2354;
                                                    } else {
                                                        var58[var52] = var84.field2355;
                                                        var59[var52] = var84.field2354;
                                                    }
                                                } else if (var94 >= 256) {
                                                    var58[var52] = var83.field2355;
                                                    var59[var52] = var83.field2354;
                                                } else {
                                                    var58[var52] = var82.field2355;
                                                    var59[var52] = var82.field2354;
                                                }
                                                int var102 = class268.method1752(arg2[var12][var14], false, arg2[var13][var14], var95 << 7 >> 9);
                                                int var103 = class268.method1752(arg2[var12][var15], false, arg2[var13][var15], var95 << 7 >> 9);
                                                var57[var52] = class268.method1752(var102, false, var103, var94 << 7 >> 9);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field2369) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg4.method2525(var12, var14, (byte) 114);
                            int var105 = arg4.method2525(var13, var14, (byte) 114);
                            int var106 = arg4.method2525(var13, var15, (byte) 114);
                            int var107 = arg4.method2525(var12, var15, (byte) 114);
                            boolean var108 = class123.method865(var12, var14, 22);
                            if (var108 && arg6 > 1 || !var108 && arg6 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field2367) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field3704) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field10092[arg6][var12][var14] = (byte) class613.method3544(this.field10092[arg6][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field10088) {
                                var110 = class666.method3796(var12, var14);
                                var111 = class497.method2924(var12, var14);
                                var112 = class418.method2530(var12, var14);
                            }
                            arg4.method1371(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class208.method1321(arg6, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BIIIII)V", line = 1329)
    public final void method4061(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg3; var7 < arg2 + arg3; var7++) {
            for (int var10 = arg1; var10 < (arg1 + arg4); var10++) {
                if (var10 >= 0 && this.field10077 > var10 && var7 >= 0 && var7 < this.field10087) {
                    this.field10085[arg5][var10][var7] = arg5 <= 0 ? 0 : this.field10085[arg5 - 1][var10][var7] - 960;
                }
            }
        }
        field10097++;
        if (arg1 > 0 && arg1 < this.field10077) {
            for (int var8 = arg3 + 1; var8 < arg2 + arg3; var8++) {
                if (var8 >= 0 && var8 < this.field10087) {
                    this.field10085[arg5][arg1][var8] = this.field10085[arg5][arg1 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < this.field10087) {
            for (int var9 = arg1 + 1; var9 < (arg1 + arg4); var9++) {
                if (var9 >= 0 && this.field10077 > var9) {
                    this.field10085[arg5][var9][arg3] = this.field10085[arg5][var9][arg3 - 1];
                }
            }
        }
        if (arg1 >= 0 && arg3 >= 0 && arg1 < this.field10077 && this.field10087 > arg3) {
            if (arg5 == 0) {
                if (arg1 > 0 && this.field10085[arg5][arg1 - 1][arg3] != 0) {
                    this.field10085[arg5][arg1][arg3] = this.field10085[arg5][arg1 - 1][arg3];
                } else if (arg3 > 0 && this.field10085[arg5][arg1][arg3 - 1] != 0) {
                    this.field10085[arg5][arg1][arg3] = this.field10085[arg5][arg1][arg3 - 1];
                } else if (arg1 > 0 && arg3 > 0 && this.field10085[arg5][arg1 - 1][arg3 - 1] != 0) {
                    this.field10085[arg5][arg1][arg3] = this.field10085[arg5][arg1 - 1][arg3 - 1];
                }
            } else if (arg1 > 0 && this.field10085[arg5 - 1][arg1 - 1][arg3] != this.field10085[arg5][arg1 - 1][arg3]) {
                this.field10085[arg5][arg1][arg3] = this.field10085[arg5][arg1 - 1][arg3];
            } else if (arg3 > 0 && this.field10085[arg5 - 1][arg1][arg3 - 1] != this.field10085[arg5][arg1][arg3 - 1]) {
                this.field10085[arg5][arg1][arg3] = this.field10085[arg5][arg1][arg3 - 1];
            } else if (arg1 > 0 && arg3 > 0 && this.field10085[arg5][arg1 - 1][arg3 - 1] != this.field10085[arg5 - 1][arg1 - 1][arg3 - 1]) {
                this.field10085[arg5][arg1][arg3] = this.field10085[arg5][arg1 - 1][arg3 - 1];
            }
        }
        if (arg0 != 98) {
            this.method4063(null, null, null, -56, null, 45, -112, -85, null, null, 86, null, 118, -108);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ls;BLs;Lha;)V", line = 1427)
    public final void method4062(class418 arg0, byte arg1, class418 arg2, class473 arg3) {
        field10078++;
        if (class544.field7578 == null || class544.field7578.length != this.field10087) {
            class130.field1680 = new int[this.field10087];
            class48.field579 = new int[this.field10087];
            class151.field1984 = new int[this.field10087];
            class442.field6092 = new int[this.field10087];
            class544.field7578 = new int[this.field10087];
        }
        if (arg1 != 16) {
            return;
        }
        int[][] var5 = new int[this.field10077][this.field10087];
        for (int var6 = 0; var6 < this.field10098; var6++) {
            for (int var8 = 0; var8 < this.field10087; var8++) {
                class544.field7578[var8] = 0;
                class151.field1984[var8] = 0;
                class442.field6092[var8] = 0;
                class130.field1680[var8] = 0;
                class48.field579[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field10077; var9++) {
                for (int var10 = 0; var10 < this.field10087; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field10077 > var19) {
                        int var20 = this.field10081[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class189 var21 = this.field10090.method3366(var20 - 1, -112);
                            class544.field7578[var10] += var21.field2366;
                            class151.field1984[var10] += var21.field2359;
                            class442.field6092[var10] += var21.field2362;
                            class130.field1680[var10] += var21.field2353;
                            var10002 = class48.field579[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field10081[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class189 var24 = this.field10090.method3366(var23 - 1, arg1 ^ 0xFFFFFF9C);
                            class544.field7578[var10] -= var24.field2366;
                            class151.field1984[var10] -= var24.field2359;
                            class442.field6092[var10] -= var24.field2362;
                            class130.field1680[var10] -= var24.field2353;
                            var10002 = class48.field579[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field10087; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field10087) {
                            var15 += class48.field579[var17];
                            var14 += class130.field1680[var17];
                            var11 += class544.field7578[var17];
                            var13 += class442.field6092[var17];
                            var12 += class151.field1984[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var15 -= class48.field579[var18];
                            var14 -= class130.field1680[var18];
                            var13 -= class442.field6092[var18];
                            var11 -= class544.field7578[var18];
                            var12 -= class151.field1984[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class176.method1128((byte) 111, var12 / var15, var11 * 256 / var14, var13 / var15);
                        }
                    }
                }
            }
            if (class452.field6301) {
                this.method4060(var6 == 0 ? arg2 : null, var6 == 0 ? arg0 : null, var5, arg3, class661.field9303[var6], -1, var6);
            } else {
                this.method4064(class661.field9303[var6], -11645, var5, var6, var6 == 0 ? arg2 : null, var6 == 0 ? arg0 : null, arg3);
            }
            this.field10081[var6] = null;
            this.field10082[var6] = null;
            this.field10095[var6] = null;
            this.field10100[var6] = null;
        }
        if (!this.field10088) {
            if (class715.field9931 != 0) {
                class35.method284();
            }
            if (class713.field9926) {
                class727.method4045();
            }
        }
        for (int var7 = 0; var7 < this.field10098; var7++) {
            class661.field9303[var7].method1369();
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lpv;[[BLha;I[ZIII[[BLbja;I[[BII)V", line = 1606)
    private final void method4063(class189 arg0, byte[][] arg1, class473 arg2, int arg3, boolean[] arg4, int arg5, int arg6, int arg7, byte[][] arg8, class250 arg9, int arg10, byte[][] arg11, int arg12, int arg13) {
        field10080++;
        boolean[] var15 = arg9 != null && arg9.field3715 ? class107.field1253[arg12] : class521.field7191[arg12];
        if (arg3 > 0) {
            if (arg5 > 0) {
                int var16 = arg8[arg5 - 1][arg3 - 1] & 0xFF;
                if (var16 > 0) {
                    class250 var17 = this.field10094.method2703(true, var16 - 1);
                    if (var17.field3713 != -1 && var17.field3715) {
                        byte var18 = arg1[arg5 - 1][arg3 - 1];
                        int var19 = arg11[arg5 - 1][arg3 - 1] * 2 + 4 & 0x7;
                        int var20 = class623.method3583(arg6 - 2, var17, arg2);
                        if (class373.field5366[var18][var19]) {
                            class470.field6514[0] = var17.field3713;
                            class634.field8848[0] = var20;
                            class378.field5426[0] = var17.field3706;
                            class502.field6862[0] = var17.field3712;
                            class769.field10588[0] = var17.field3717;
                            class504.field6871[0] = 256;
                        }
                    }
                }
            }
            if (arg5 < arg13 - 1) {
                int var21 = arg8[arg5 + 1][arg3 - 1] & 0xFF;
                if (var21 > 0) {
                    class250 var22 = this.field10094.method2703(true, var21 - 1);
                    if (var22.field3713 != -1 && var22.field3715) {
                        byte var23 = arg1[arg5 + 1][arg3 - 1];
                        int var24 = arg11[arg5 + 1][arg3 - 1] * 2 + 6 & 0x7;
                        int var25 = class623.method3583(-1, var22, arg2);
                        if (class373.field5366[var23][var24]) {
                            class470.field6514[2] = var22.field3713;
                            class634.field8848[2] = var25;
                            class378.field5426[2] = var22.field3706;
                            class502.field6862[2] = var22.field3712;
                            class769.field10588[2] = var22.field3717;
                            class504.field6871[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg10 - 1 > arg3) {
            if (arg5 > 0) {
                int var26 = arg8[arg5 - 1][arg3 + 1] & 0xFF;
                if (var26 > 0) {
                    class250 var27 = this.field10094.method2703(true, var26 - 1);
                    if (var27.field3713 != -1 && var27.field3715) {
                        byte var28 = arg1[arg5 - 1][arg3 + 1];
                        int var29 = arg11[arg5 - 1][arg3 + 1] * 2 + 2 & 0x7;
                        int var30 = class623.method3583(-1, var27, arg2);
                        if (class373.field5366[var28][var29]) {
                            class470.field6514[6] = var27.field3713;
                            class634.field8848[6] = var30;
                            class378.field5426[6] = var27.field3706;
                            class502.field6862[6] = var27.field3712;
                            class769.field10588[6] = var27.field3717;
                            class504.field6871[6] = 64;
                        }
                    }
                }
            }
            if (arg13 - 1 > arg5) {
                int var31 = arg8[arg5 + 1][arg3 + 1] & 0xFF;
                if (var31 > 0) {
                    class250 var32 = this.field10094.method2703(true, var31 - 1);
                    if (var32.field3713 != -1 && var32.field3715) {
                        byte var33 = arg1[arg5 + 1][arg3 + 1];
                        int var34 = arg11[arg5 + 1][arg3 + 1] * 2 & 0x7;
                        int var35 = class623.method3583(arg6 - 2, var32, arg2);
                        if (class373.field5366[var33][var34]) {
                            class470.field6514[4] = var32.field3713;
                            class634.field8848[4] = var35;
                            class378.field5426[4] = var32.field3706;
                            class502.field6862[4] = var32.field3712;
                            class769.field10588[4] = var32.field3717;
                            class504.field6871[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var36 = arg8[arg5][arg3 - 1] & 0xFF;
            if (var36 > 0) {
                class250 var37 = this.field10094.method2703(true, var36 - 1);
                if (var37.field3713 != -1) {
                    byte var38 = arg1[arg5][arg3 - 1];
                    byte var39 = arg11[arg5][arg3 - 1];
                    if (var37.field3715) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class623.method3583(-1, var37, arg2);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class373.field5366[var38][var41] && var37.field3717 >= class769.field10588[var40]) {
                                class470.field6514[var40] = var37.field3713;
                                class634.field8848[var40] = var42;
                                class378.field5426[var40] = var37.field3706;
                                class502.field6862[var40] = var37.field3712;
                                if (class769.field10588[var40] == var37.field3717) {
                                    class504.field6871[var40] = class613.method3544(class504.field6871[var40], 32);
                                } else {
                                    class504.field6871[var40] = 32;
                                }
                                class769.field10588[var40] = var37.field3717;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg7 & 0x3]) {
                            arg4[0] = class107.field1253[var38][class407.method2490(3, var39 + 2)];
                        }
                    } else if (!var15[arg7 & 0x3]) {
                        arg4[0] = class521.field7191[var38][class407.method2490(var39 + 2, 3)];
                    }
                }
            }
        }
        if ((arg10 - arg6) > arg3) {
            int var44 = arg8[arg5][arg3 + 1] & 0xFF;
            if (var44 > 0) {
                class250 var45 = this.field10094.method2703(true, var44 - 1);
                if (var45.field3713 != -1) {
                    byte var46 = arg1[arg5][arg3 + 1];
                    byte var47 = arg11[arg5][arg3 + 1];
                    if (var45.field3715) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class623.method3583(-1, var45, arg2);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class373.field5366[var46][var49] && var45.field3717 >= class769.field10588[var48]) {
                                class470.field6514[var48] = var45.field3713;
                                class634.field8848[var48] = var50;
                                class378.field5426[var48] = var45.field3706;
                                class502.field6862[var48] = var45.field3712;
                                if (class769.field10588[var48] == var45.field3717) {
                                    class504.field6871[var48] = class613.method3544(class504.field6871[var48], 16);
                                } else {
                                    class504.field6871[var48] = 16;
                                }
                                class769.field10588[var48] = var45.field3717;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg7 + 2 & 0x3]) {
                            arg4[2] = class107.field1253[var46][class407.method2490(3, var47)];
                        }
                    } else if (!var15[arg7 + 2 & 0x3]) {
                        arg4[2] = class521.field7191[var46][class407.method2490(3, var47)];
                    }
                }
            }
        }
        if (arg5 > 0) {
            int var52 = arg8[arg5 - 1][arg3] & 0xFF;
            if (var52 > 0) {
                class250 var53 = this.field10094.method2703(true, var52 - 1);
                if (var53.field3713 != -1) {
                    byte var54 = arg1[arg5 - 1][arg3];
                    byte var55 = arg11[arg5 - 1][arg3];
                    if (var53.field3715) {
                        int var56 = 6;
                        int var57 = (var55 * 2) + 4;
                        int var58 = class623.method3583(-1, var53, arg2);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class373.field5366[var54][var57] && var53.field3717 >= class769.field10588[var56]) {
                                class470.field6514[var56] = var53.field3713;
                                class634.field8848[var56] = var58;
                                class378.field5426[var56] = var53.field3706;
                                class502.field6862[var56] = var53.field3712;
                                if (class769.field10588[var56] == var53.field3717) {
                                    class504.field6871[var56] = class613.method3544(class504.field6871[var56], 8);
                                } else {
                                    class504.field6871[var56] = 8;
                                }
                                class769.field10588[var56] = var53.field3717;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg7 + 3 & 0x3]) {
                            arg4[3] = class107.field1253[var54][class407.method2490(3, var55 + 1)];
                        }
                    } else if (!var15[arg7 + 3 & 0x3]) {
                        arg4[3] = class521.field7191[var54][class407.method2490(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg5 < arg13 - 1) {
            int var60 = arg8[arg5 + 1][arg3] & 0xFF;
            if (var60 > 0) {
                class250 var61 = this.field10094.method2703(true, var60 - 1);
                if (var61.field3713 != -1) {
                    byte var62 = arg1[arg5 + 1][arg3];
                    byte var63 = arg11[arg5 + 1][arg3];
                    if (var61.field3715) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class623.method3583(-1, var61, arg2);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class373.field5366[var62][var65] && var61.field3717 >= class769.field10588[var64]) {
                                class470.field6514[var64] = var61.field3713;
                                class634.field8848[var64] = var66;
                                class378.field5426[var64] = var61.field3706;
                                class502.field6862[var64] = var61.field3712;
                                if (class769.field10588[var64] == var61.field3717) {
                                    class504.field6871[var64] = class613.method3544(class504.field6871[var64], 4);
                                } else {
                                    class504.field6871[var64] = 4;
                                }
                                class769.field10588[var64] = var61.field3717;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg7 + 1 & 0x3]) {
                            arg4[1] = class107.field1253[var62][class407.method2490(var63 + 3, 3)];
                        }
                    } else if (!var15[arg7 + 1 & 0x3]) {
                        arg4[1] = class521.field7191[var62][class407.method2490(3, var63 + 3)];
                    }
                }
            }
        }
        if (arg9 == null) {
            return;
        }
        int var68 = class623.method3583(-1, arg9, arg2);
        if (!arg9.field3715) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg7 * 2) & 0x7;
            if (class373.field5366[arg12][var69] && arg9.field3717 >= class769.field10588[var70]) {
                class470.field6514[var70] = arg9.field3713;
                class634.field8848[var70] = var68;
                class378.field5426[var70] = arg9.field3706;
                class502.field6862[var70] = arg9.field3712;
                if (class769.field10588[var70] == arg9.field3717) {
                    class504.field6871[var70] = class613.method3544(class504.field6871[var70], 2);
                } else {
                    class504.field6871[var70] = 2;
                }
                class769.field10588[var70] = arg9.field3717;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ls;I[[IILs;Ls;Lha;)V", line = 2075)
    private final void method4064(class418 arg0, int arg1, int[][] arg2, int arg3, class418 arg4, class418 arg5, class473 arg6) {
        field10102++;
        int var8 = 0;
        if (arg1 != -11645) {
            field10089 = null;
        }
        while (var8 < this.field10077) {
            for (int var9 = 0; var9 < this.field10087; var9++) {
                if (class151.field1983 == -1 || class421.method2541(arg3, class151.field1983, -1, var9, var8)) {
                    byte var10 = this.field10095[arg3][var8][var9];
                    byte var11 = this.field10100[arg3][var8][var9];
                    int var12 = this.field10082[arg3][var8][var9] & 0xFF;
                    int var13 = this.field10081[arg3][var8][var9] & 0xFF;
                    class250 var14 = var12 == 0 ? null : this.field10094.method2703(true, var12 - 1);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class189 var15 = var13 == 0 ? null : this.field10090.method3366(var13 - 1, arg1 ^ 0x2D13);
                    class250 var16 = var14;
                    if (var14 != null && var14.field3713 == -1 && var14.field3716 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class386.field5514[var10];
                        int var18 = class422.field5873[var10];
                        int var19 = (var15 == null ? 0 : var17) + (var14 == null ? 0 : var18);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field3706;
                        int var23 = var15 == null ? -1 : var15.field2355;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field3716 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class507.field6887[var10][var21];
                                var25[var20] = class793.field10865[var10][var21];
                                var26[var20] = class95.field1111[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field3712;
                                var27[var20] = var14.field3713;
                                if (var30 != null) {
                                    var30[var20] = var14.field3716;
                                }
                                var21++;
                                var20++;
                            }
                            if (!this.field10088 && arg3 == 0) {
                                class528.method3137(var8, var9, var14.field3714, var14.field3721 * 8, var14.field3718);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class507.field6887[var10][var21];
                                var25[var20] = class793.field10865[var10][var21];
                                var26[var20] = class95.field1111[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field2354;
                                var27[var20] = arg2[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var21++;
                                var20++;
                            }
                        }
                        int var33 = this.field10096.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg4 == null ? null : new int[var33];
                        int[] var37 = arg4 == null && arg5 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field10096[var38];
                            int var49 = this.field10079[var38];
                            if (var11 == 0) {
                                var34[var38] = var48;
                                var35[var38] = var49;
                            } else if (var11 == 1) {
                                var34[var38] = var49;
                                var35[var38] = 512 - var48;
                            } else if (var11 == 2) {
                                var34[var38] = 512 - var48;
                                var35[var38] = 512 - var49;
                            } else if (var11 == 3) {
                                var34[var38] = 512 - var49;
                                var35[var38] = var48;
                            }
                            if (var36 != null && class373.field5366[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg4.method2529(var53, var52, (byte) -128) - arg0.method2529(var53, var52, (byte) -128);
                            }
                            if (var37 != null) {
                                if (arg4 != null && !class373.field5366[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg0.method2529(var55, var54, (byte) -128) - arg4.method2529(var55, var54, (byte) -128);
                                } else if (arg5 != null && !class154.field2011[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg5.method2529(var57, var56, (byte) -128) - arg0.method2529(var57, var56, (byte) -128);
                                }
                            }
                        }
                        int var39 = arg0.method2525(var8, var9, (byte) 114);
                        int var40 = arg0.method2525(var8 + 1, var9, (byte) 114);
                        int var41 = arg0.method2525(var8 + 1, var9 - -1, (byte) 114);
                        int var42 = arg0.method2525(var8, var9 + 1, (byte) 114);
                        boolean var43 = class123.method865(var8, var9, -122);
                        if (var43 && arg3 > 1 || !var43 && arg3 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field2367) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field3704) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field10092[arg3][var8][var9] = (byte) class613.method3544(this.field10092[arg3][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field10088) {
                            var45 = class666.method3796(var8, var9);
                            var46 = class497.method2924(var8, var9);
                            var47 = class418.method2530(var8, var9);
                        }
                        arg0.method1363(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class208.method1321(arg3, var8, var9);
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lgga;IIIIIIZIII)V", line = 2375)
    private final void method4065(class511 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field10093++;
        if (arg1 == arg10) {
            arg3 = 1;
        } else if (arg10 == 2) {
            arg3 = 1;
            arg9 = 1;
        } else if (arg10 == 3) {
            arg9 = 1;
        }
        if (arg8 < 0 || arg8 >= this.field10077 || arg5 < 0 || arg5 >= this.field10087) {
            while (true) {
                int var14 = arg0.method3013(-2);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg0.method3013(arg1 - 111);
                    return;
                }
                if (var14 <= 49) {
                    arg0.method3013(-94);
                }
            }
        }
        if (!this.field10088 && !arg7) {
            class533.field7338[arg4][arg8][arg5] = 0;
        }
        while (true) {
            int var12 = arg0.method3013(arg1 + 34);
            if (var12 == 0) {
                if (this.field10088) {
                    this.field10085[0][arg8 + arg9][arg3 + arg5] = 0;
                    return;
                } else if (arg4 == 0) {
                    this.field10085[0][arg8 + arg9][arg3 + arg5] = -class493.method2909(arg2 + 932731, arg6 + 556238, 60) * 8 << 2;
                    return;
                } else {
                    this.field10085[arg4][arg8 + arg9][arg3 + arg5] = this.field10085[arg4 - 1][arg8 + arg9][arg5 + arg3] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg0.method3013(-91);
                if (!this.field10088) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg4 == 0) {
                        this.field10085[0][arg8 + arg9][arg5 + arg3] = -var13 * 8 << 2;
                        return;
                    }
                    this.field10085[arg4][arg8 + arg9][arg3 + arg5] = this.field10085[arg4 - 1][arg8 + arg9][arg5 + arg3] - (var13 * 8 << 2);
                    return;
                }
                this.field10085[0][arg8 + arg9][arg3 + arg5] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg7) {
                    arg0.method3013(-122);
                } else {
                    this.field10082[arg4][arg8][arg5] = arg0.method3030(arg1 - 25985);
                    this.field10095[arg4][arg8][arg5] = (byte) ((var12 - 2) / 4);
                    this.field10100[arg4][arg8][arg5] = (byte) class407.method2490(var12 + arg10 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field10088 && !arg7) {
                    class533.field7338[arg4][arg8][arg5] = (byte) (var12 - 49);
                }
            } else if (!arg7) {
                this.field10081[arg4][arg8][arg5] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BJ)V", line = 2498)
    public static final void method4066(byte arg0, long arg1) {
        if (arg0 != -45) {
            field10105 = -113;
        }
        field10083++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class697.method3933((byte) -35, arg1 - 1L);
            class697.method3933((byte) -35, 1L);
        } else {
            class697.method3933((byte) -35, arg1);
        }
    }
}
