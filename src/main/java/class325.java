import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class325 {

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "[I")
    private int[] field4421 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "[I")
    private int[] field4435 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lks;")
    private class303 field4413;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public int field4426;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lcs;")
    private class226 field4419;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public int field4430;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public int field4434;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "Z")
    public boolean field4433;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "[[[B")
    private byte[][][] field4425;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "[[[B")
    private byte[][][] field4436;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "[[[B")
    private byte[][][] field4432;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "[[[B")
    public byte[][][] field4420;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[[[B")
    private byte[][][] field4412;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[[[I")
    public int[][][] field4410;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "J")
    public static long field4423 = 0L;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Ldi;")
    public static class83 field4427 = new class83(81, 3);

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "Lqp;")
    public static class466 field4439 = new class466("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "[[[B")
    public byte[][][] field4441;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILta;[[ILya;Lta;ILta;)V")
    private final void method1876(int arg0, class142 arg1, int[][] arg2, class38 arg3, class142 arg4, int arg5, class142 arg6) {
        field4417++;
        if (arg5 != 23668) {
            this.method1881(null, (byte) -37, null, null);
        }
        for (int var8 = 0; var8 < this.field4434; var8++) {
            for (int var9 = 0; var9 < this.field4426; var9++) {
                if (class182.field2677 == -1 || class6.method39(class182.field2677, arg0, (byte) -107, var9, var8)) {
                    byte var10 = this.field4412[arg0][var8][var9];
                    byte var11 = this.field4436[arg0][var8][var9];
                    int var12 = this.field4432[arg0][var8][var9] & 0xFF;
                    int var13 = this.field4425[arg0][var8][var9] & 0xFF;
                    class28 var14 = var12 == 0 ? null : this.field4413.method1765(105, var12 - 1);
                    class26 var15 = var13 == 0 ? null : this.field4419.method1408(var13 - 1, (byte) 83);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class368.field5397[var10];
                        var17 = var14 == null ? 0 : class242.field3391[var10];
                    } else if (var14 != null) {
                        var17 = class242.field3391[var10];
                    } else if (var15 != null) {
                        var16 = class242.field3391[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field370 == -1 && var14.field372 == -1 && var14.field378 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg3.method308() ? var14.field378 : var14.field379;
                            if (class466.field6838) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field371;
                                if (var14.field370 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field370;
                                }
                                if (var14.field372 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field372;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field4433 && arg0 == 0) {
                                class316.method1847(var8, var9, var14.field381, var14.field361 * 8, var14.field367);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field337;
                            if (class466.field6838) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field343;
                                var20[var19] = arg2[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field4421.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg6 == null ? null : new int[var31];
                        int[] var35 = arg6 == null && arg4 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field4421[var36];
                            int var46 = this.field4435[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class416.field6051[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg6.method361(var49, var50) - arg1.method361(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg6 != null && !class416.field6051[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg1.method361(var51, var52) - arg6.method361(var51, var52);
                                } else if (arg4 != null && !class320.field4379[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg4.method361(var53, var54) - arg1.method361(var53, var54);
                                }
                            }
                        }
                        int var37 = arg1.method351(var8, var9);
                        int var38 = arg1.method351(var8 + 1, var9);
                        int var39 = arg1.method351(var8 + 1, var9 + 1);
                        int var40 = arg1.method351(var8, var9 + 1);
                        if (arg0 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field362) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field4420[arg0][var8][var9] = (byte) class255.method1532(this.field4420[arg0][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field4433) {
                            var42 = class398.method2393(var8, var9);
                            var43 = class11.method54(var8, var9);
                            var44 = class140.method937(var8, var9);
                        }
                        arg1.method353(var8, var9, var32, var34, var33, var35, class235.field3339[var10], class316.field4326[var10], class285.field3962[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class19.method121(arg0, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[Leq;IIIIILsi;II)V")
    public final void method1877(int arg0, class141[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class391 arg7, int arg8, int arg9) {
        field4438++;
        int var11 = (arg9 & 0x7) * 8;
        int var12 = (arg5 & 0x7) * 8;
        if (!this.field4433) {
            class141 var13 = arg1[arg8];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class438.method2578((byte) -90, var14 & 0x7, var15 & 0x7, arg3) + arg6;
                    int var17 = arg0 + class316.method1848(arg3, (byte) 114, var15 & 0x7, var14 & 0x7);
                    if (var16 > 0 && this.field4434 - 1 > var16 && var17 > 0 && (this.field4426 - 1) > var17) {
                        var13.method954(-2097153, var16, var17);
                    }
                }
            }
        }
        int var18 = (arg9 & 0xFFFFFFF8) << 3;
        int var19 = -52 / ((50 - arg4) / 44);
        int var20 = arg5 & 0x1FFFFFF8 << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg3 == 1) {
            var22 = 1;
        } else if (arg3 == 2) {
            var22 = 1;
            var21 = 1;
        } else if (arg3 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < this.field4430; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg2 != var23 || var24 < var11 || var24 > (var11 + 8) || var25 < var12 || var25 > (var12 + 8)) {
                        this.method1886(0, 0, false, 0, arg7, -1, 0, false, -1, 0, 0);
                    } else if (var11 + 8 == var24 || (var12 + 8) == var25) {
                        int var32;
                        int var33;
                        if (arg3 == 0) {
                            var32 = var25 + arg0 - var12;
                            var33 = var24 + arg6 - var11;
                        } else if (arg3 == 1) {
                            var32 = arg0 + var11 + 8 - var24;
                            var33 = arg6 + var25 - var12;
                        } else if (arg3 == 2) {
                            var33 = arg6 + var11 + 8 - var24;
                            var32 = arg0 + var12 + 8 - var25;
                        } else {
                            var32 = arg0 + var24 - var11;
                            var33 = arg6 + var12 + 8 - var25;
                        }
                        this.method1886(var20 + var25, 0, false, 0, arg7, var33, arg8, true, var32, var18 + var24, 0);
                    } else {
                        int var26 = class438.method2578((byte) -62, var24 & 0x7, var25 & 0x7, arg3) + arg6;
                        int var27 = arg0 + class316.method1848(arg3, (byte) 126, var25 & 0x7, var24 & 0x7);
                        this.method1886(var20 + var25, var22, false, var21, arg7, var26, arg8, false, var27, var18 + var24, arg3);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg3 == 0) {
                                var30 = arg0 - (var12 - var29);
                                var31 = var28 + arg6 - var11;
                            } else if (arg3 == 1) {
                                var30 = var11 + arg0 + 8 - var28;
                                var31 = arg6 + var29 - var12;
                            } else if (arg3 == 2) {
                                var31 = var11 + arg6 + 8 - var28;
                                var30 = arg0 - var29 - (-var12 - 8);
                            } else {
                                var30 = -var11 - (-var28 - arg0);
                                var31 = var12 + arg6 + 8 - var29;
                            }
                            if (var31 >= 0 && var31 < this.field4434 && var30 >= 0 && this.field4426 > var30) {
                                this.field4410[arg8][var31][var30] = this.field4410[arg8][var21 + var26][var22 + var27];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILsi;[Leq;III)V")
    public final void method1878(int arg0, int arg1, class391 arg2, class141[] arg3, int arg4, int arg5, int arg6) {
        field4442++;
        if (!this.field4433) {
            for (int var8 = 0; var8 < 4; var8++) {
                class141 var9 = arg3[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg6 + var11;
                        if (var12 >= 0 && var12 < this.field4434 && var13 >= 0 && this.field4426 > var13) {
                            var9.method954(-2097153, var12, var13);
                        }
                    }
                }
            }
        }
        int var14 = arg0 + arg4;
        int var15 = arg1 + arg6;
        for (int var16 = 0; var16 < this.field4430; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1886(var15 + var18, 0, false, 0, arg2, arg4 + var17, var16, false, arg6 + var18, var14 + var17, 0);
                }
            }
        }
        if (arg5 != 1) {
            field4423 = -52L;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZI)B")
    public static final byte method1879(int arg0, boolean arg1, int arg2) {
        field4424++;
        if (!arg1) {
            return -77;
        } else if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([[III)V")
    public final void method1880(int[][] arg0, int arg1, int arg2) {
        int var4 = 31 / ((91 - arg2) / 32);
        field4431++;
        int[][] var5 = this.field4410[arg1];
        for (int var6 = 0; var6 < (this.field4434 + 1); var6++) {
            for (int var7 = 0; var7 < this.field4426 + 1; var7++) {
                var5[var6][var7] += arg0[var6][var7];
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lya;B[Leq;[[[I)V")
    public final void method1881(class38 arg0, byte arg1, class141[] arg2, int[][][] arg3) {
        field4428++;
        if (!this.field4433) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field4434; var6++) {
                    for (int var7 = 0; var7 < this.field4426; var7++) {
                        if ((class267.field3700[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class267.field3700[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method952(95, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 > -92) {
            return;
        }
        for (int var9 = 0; var9 < this.field4430; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field4433) {
                if (class106.field1593) {
                    var10 |= 0x2;
                }
                if (class113.field1690) {
                    var11 |= 0x8;
                }
                if (class132.field1931 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class14.field210) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class106.field1593) {
                var11 |= 0x7;
            }
            if (!class83.field1242) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || arg3.length <= var9 ? this.field4410[var9] : arg3[var9];
            class203.method1261(var9, arg0.method304(this.field4434, this.field4426, this.field4410[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method1882(String arg0, boolean arg1) {
        if (arg1) {
            field4443 = -126;
        }
        field4418++;
        return class89.method671(true, arg0, false, 10);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIBIII)V")
    public final void method1883(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg0; var7 < (arg0 + arg5); var7++) {
            for (int var10 = arg1; var10 < (arg1 + arg4); var10++) {
                if (var10 >= 0 && var10 < this.field4434 && var7 >= 0 && this.field4426 > var7) {
                    this.field4410[arg3][var10][var7] = arg3 <= 0 ? 0 : this.field4410[arg3 - 1][var10][var7] - 240;
                }
            }
        }
        field4437++;
        if (arg1 > 0 && this.field4434 > arg1) {
            for (int var8 = arg0 + 1; var8 < (arg0 + arg5); var8++) {
                if (var8 >= 0 && this.field4426 > var8) {
                    this.field4410[arg3][arg1][var8] = this.field4410[arg3][arg1 - 1][var8];
                }
            }
        }
        if (arg2 != 85) {
            this.field4421 = null;
        }
        if (arg0 > 0 && this.field4426 > arg0) {
            for (int var9 = arg1 + 1; var9 < arg1 + arg4; var9++) {
                if (var9 >= 0 && var9 < this.field4434) {
                    this.field4410[arg3][var9][arg0] = this.field4410[arg3][var9][arg0 - 1];
                }
            }
        }
        if (arg1 < 0 || arg0 < 0 || arg1 >= this.field4434 || this.field4426 <= arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 > 0 && this.field4410[arg3][arg1 - 1][arg0] != 0) {
                this.field4410[arg3][arg1][arg0] = this.field4410[arg3][arg1 - 1][arg0];
                return;
            }
            if (arg0 > 0 && this.field4410[arg3][arg1][arg0 - 1] != 0) {
                this.field4410[arg3][arg1][arg0] = this.field4410[arg3][arg1][arg0 - 1];
                return;
            }
            if (arg1 > 0 && arg0 > 0 && this.field4410[arg3][arg1 - 1][arg0 - 1] != 0) {
                this.field4410[arg3][arg1][arg0] = this.field4410[arg3][arg1 - 1][arg0 - 1];
                return;
            }
            return;
        }
        if (arg1 > 0 && this.field4410[arg3 - 1][arg1 - 1][arg0] != this.field4410[arg3][arg1 - 1][arg0]) {
            this.field4410[arg3][arg1][arg0] = this.field4410[arg3][arg1 - 1][arg0];
            return;
        }
        if (arg0 > 0 && this.field4410[arg3 - 1][arg1][arg0 - 1] != this.field4410[arg3][arg1][arg0 - 1]) {
            this.field4410[arg3][arg1][arg0] = this.field4410[arg3][arg1][arg0 - 1];
            return;
        }
        if (arg1 > 0 && arg0 > 0 && this.field4410[arg3][arg1 - 1][arg0 - 1] != this.field4410[arg3 - 1][arg1 - 1][arg0 - 1]) {
            this.field4410[arg3][arg1][arg0] = this.field4410[arg3][arg1 - 1][arg0 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method1884(byte arg0) {
        if (arg0 <= 95) {
            method1882(null, true);
        }
        field4439 = null;
        field4427 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lta;Lta;Lya;I)V")
    public final void method1885(class142 arg0, class142 arg1, class38 arg2, int arg3) {
        field4411++;
        int[][] var5 = new int[this.field4434][this.field4426];
        if (class211.field2951 == null || class211.field2951.length != this.field4426) {
            class479.field7008 = new int[this.field4426];
            class121.field1816 = new int[this.field4426];
            class211.field2951 = new int[this.field4426];
            class217.field3024 = new int[this.field4426];
            class260.field3621 = new int[this.field4426];
        }
        for (int var6 = 0; var6 < this.field4430; var6++) {
            for (int var8 = 0; var8 < this.field4426; var8++) {
                class211.field2951[var8] = 0;
                class260.field3621[var8] = 0;
                class217.field3024[var8] = 0;
                class479.field7008[var8] = 0;
                class121.field1816[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field4434; var9++) {
                for (int var10 = 0; var10 < this.field4426; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field4434 > var19) {
                        int var20 = this.field4425[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class26 var21 = this.field4419.method1408(var20 - 1, (byte) 53);
                            class211.field2951[var10] += var21.field334;
                            class260.field3621[var10] += var21.field335;
                            class217.field3024[var10] += var21.field342;
                            class479.field7008[var10] += var21.field339;
                            var10002 = class121.field1816[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field4425[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class26 var24 = this.field4419.method1408(var23 - 1, (byte) 120);
                            class211.field2951[var10] -= var24.field334;
                            class260.field3621[var10] -= var24.field335;
                            class217.field3024[var10] -= var24.field342;
                            class479.field7008[var10] -= var24.field339;
                            var10002 = class121.field1816[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field4426; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field4426) {
                            var14 += class479.field7008[var17];
                            var13 += class217.field3024[var17];
                            var15 += class121.field1816[var17];
                            var12 += class260.field3621[var17];
                            var11 += class211.field2951[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var15 -= class121.field1816[var18];
                            var12 -= class260.field3621[var18];
                            var11 -= class211.field2951[var18];
                            var13 -= class217.field3024[var18];
                            var14 -= class479.field7008[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class118.method833(var13 / var15, 4, var12 / var15, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class474.field6930) {
                this.method1888(var5, var6 == 0 ? arg1 : null, arg2, var6, var6 == 0 ? arg0 : null, false, class211.field2950[var6]);
            } else {
                this.method1876(var6, class211.field2950[var6], var5, arg2, var6 == 0 ? arg0 : null, 23668, var6 == 0 ? arg1 : null);
            }
            this.field4425[var6] = null;
            this.field4432[var6] = null;
            this.field4412[var6] = null;
            this.field4436[var6] = null;
        }
        if (!this.field4433) {
            if (class132.field1931 != 0) {
                class126.method870();
            }
            if (class106.field1593) {
                class514.method3071();
            }
        }
        if (arg3 != 1) {
            this.method1880(null, 87, -8);
        }
        for (int var7 = 0; var7 < this.field4430; var7++) {
            class211.field2950[var7].method365();
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZILsi;IIZIII)V")
    private final void method1886(int arg0, int arg1, boolean arg2, int arg3, class391 arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field4422++;
        if (arg2) {
            this.field4412 = null;
        }
        if (arg10 == 1) {
            arg1 = 1;
        } else if (arg10 == 2) {
            arg3 = 1;
            arg1 = 1;
        } else if (arg10 == 3) {
            arg3 = 1;
        }
        if (arg5 < 0 || this.field4434 <= arg5 || arg8 < 0 || arg8 >= this.field4426) {
            while (true) {
                int var14 = arg4.method2348(-2);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg4.method2348(-2);
                    return;
                }
                if (var14 <= 49) {
                    arg4.method2348(-2);
                }
            }
        }
        if (!this.field4433 && !arg7) {
            class267.field3700[arg6][arg5][arg8] = 0;
        }
        while (true) {
            int var12 = arg4.method2348(-2);
            if (var12 == 0) {
                if (this.field4433) {
                    this.field4410[0][arg3 + arg5][arg1 + arg8] = 0;
                    return;
                } else if (arg6 == 0) {
                    this.field4410[0][arg3 + arg5][arg8 + arg1] = -class172.method1119(arg9 + 932731, arg0 + 556238, 4) * 8 << 0;
                    return;
                } else {
                    this.field4410[arg6][arg3 + arg5][arg1 + arg8] = this.field4410[arg6 - 1][arg3 + arg5][arg1 + arg8] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg4.method2348(-2);
                if (!this.field4433) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg6 != 0) {
                        this.field4410[arg6][arg3 + arg5][arg1 + arg8] = this.field4410[arg6 - 1][arg3 + arg5][arg1 + arg8] - (var13 * 8 << 0);
                        return;
                    }
                    this.field4410[0][arg3 + arg5][arg1 + arg8] = -var13 * 8 << 0;
                    return;
                }
                this.field4410[0][arg3 + arg5][arg1 + arg8] = var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg7) {
                    arg4.method2348(-2);
                } else {
                    this.field4432[arg6][arg5][arg8] = arg4.method2337(-1);
                    this.field4412[arg6][arg5][arg8] = (byte) ((var12 - 2) / 4);
                    this.field4436[arg6][arg5][arg8] = (byte) class251.method1501(3, var12 + arg10 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field4433 && !arg7) {
                    class267.field3700[arg6][arg5][arg8] = (byte) (var12 - 49);
                }
            } else if (!arg7) {
                this.field4425[arg6][arg5][arg8] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V")
    public final void method1887(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 0;
        if (arg3 != -1) {
            return;
        }
        while (var6 < this.field4430) {
            this.method1883(arg2, arg4, (byte) 85, var6, arg1, arg0);
            var6++;
        }
        field4440++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([[ILta;Lya;ILta;ZLta;)V")
    private final void method1888(int[][] arg0, class142 arg1, class38 arg2, int arg3, class142 arg4, boolean arg5, class142 arg6) {
        field4429++;
        byte[][] var8 = this.field4412[arg3];
        if (arg5) {
            this.field4433 = true;
        }
        byte[][] var9 = this.field4436[arg3];
        byte[][] var10 = this.field4425[arg3];
        byte[][] var11 = this.field4432[arg3];
        for (int var12 = 0; var12 < this.field4434; var12++) {
            int var13 = var12 < this.field4434 - 1 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field4426; var14++) {
                int var15 = this.field4426 - 1 > var14 ? var14 + 1 : var14;
                if (class182.field2677 == -1 || class6.method39(class182.field2677, arg3, (byte) -107, var14, var12)) {
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
                        class28 var26 = var21 == 0 ? null : this.field4413.method1765(89, var21 - 1);
                        class26 var27 = var22 == 0 ? null : this.field4419.method1408(var22 - 1, (byte) 82);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class28 var28 = var26;
                        if (var26 != null) {
                            if (var26.field370 == -1 && var26.field372 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field368;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field4434 && var14 < this.field4426) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var35++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var35++;
                            } else {
                                var32--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var34--;
                                var36--;
                            }
                            int var37 = var34 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg6.method351(var12, var14) - arg6.method351(var13, var15);
                                var38 = arg6.method351(var13, var14) - arg6.method351(var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class507.field7467[var39] = -1;
                            class515.field7612[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field368 ? class6.field109[var19] : class405.field5944[var19];
                        this.method1889(var11, var12, this.field4426, var26, arg2, 0, var18, var27, var20, var19, var14, var8, this.field4434, var9);
                        boolean var41 = var26 != null && var26.field372 != var26.field370;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class507.field7467[var42] >= 0 && class422.field6185[var42] != class270.field3728[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class295.method1737(var18[1], class251.method1501(class515.field7612[2], class515.field7612[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class295.method1737(var18[3], class251.method1501(class515.field7612[0], class515.field7612[6]) == 0);
                        }
                        if (!var40[-(-var20) & 0x3]) {
                            var18[0] = class295.method1737(var18[0], class251.method1501(class515.field7612[2], class515.field7612[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class295.method1737(var18[2], class251.method1501(class515.field7612[4], class515.field7612[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var45 = class285.field3962[var19];
                            var46 = class316.field4326[var19];
                            var47 = var27 == null ? 0 : class368.field5397[var19];
                            var48 = var26 == null ? 0 : class242.field3391[var19];
                            var49 = class235.field3339[var19];
                        } else if (var17) {
                            var47 = var27 == null ? 0 : class148.field2142[var19];
                            var48 = var26 == null ? 0 : class279.field3814[var19];
                            var45 = class79.field1161[var19];
                            var49 = class247.field3438[var19];
                            var44 = class385.field5609[var19];
                            var46 = class309.field4201[var19];
                        } else {
                            var47 = var27 == null ? 0 : class263.field3637[var19];
                            var44 = class93.field1332[var19];
                            var49 = class506.field7448[var19];
                            var45 = class209.field2918[var19];
                            var48 = var26 == null ? 0 : class446.field6578[var19];
                            var46 = class382.field5587[var19];
                        }
                        int var50 = var47 + var48;
                        if (var50 <= 0) {
                            class19.method121(arg3, var12, var14);
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
                            int[] var60 = arg1 == null ? null : new int[var53];
                            int[] var61 = arg1 == null && arg4 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field370;
                                var63 = arg2.method308() ? var26.field378 : var26.field379;
                                var64 = var26.field371;
                                int var65 = class256.method1542(arg2, 1, var26);
                                for (int var66 = 0; var66 < var48; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class49.field592[0] = var49[var51];
                                        class49.field592[1] = 1;
                                        class49.field592[2] = var45[var51];
                                        class49.field592[3] = 1;
                                        class49.field592[4] = var46[var51];
                                        class49.field592[5] = var45[var51];
                                        var98 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class49.field592[0] = var49[var51];
                                        class49.field592[1] = 5;
                                        class49.field592[2] = var45[var51];
                                        class49.field592[3] = 5;
                                        class49.field592[4] = var46[var51];
                                        class49.field592[5] = var45[var51];
                                        var98 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class49.field592[0] = var49[var51];
                                        class49.field592[1] = 3;
                                        class49.field592[2] = var45[var51];
                                        class49.field592[3] = 3;
                                        class49.field592[4] = var46[var51];
                                        var98 = 6;
                                        class49.field592[5] = var45[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class49.field592[0] = var49[var51];
                                        class49.field592[1] = 7;
                                        class49.field592[2] = var45[var51];
                                        class49.field592[3] = 7;
                                        class49.field592[4] = var46[var51];
                                        class49.field592[5] = var45[var51];
                                        var98 = 6;
                                    } else {
                                        class49.field592[0] = var49[var51];
                                        class49.field592[1] = var46[var51];
                                        var98 = 3;
                                        class49.field592[2] = var45[var51];
                                    }
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class49.field592[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field4421[var100];
                                        int var103 = this.field4435[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = 128 - var102;
                                            var105 = var103;
                                        } else if (var20 == 2) {
                                            var104 = 128 - var103;
                                            var105 = 128 - var102;
                                        } else if (var20 == 3) {
                                            var105 = 128 - var103;
                                            var104 = var102;
                                        } else {
                                            var104 = var103;
                                            var105 = var102;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var104;
                                        if (var60 != null && class416.field6051[var19][var100]) {
                                            int var106 = (var12 << 7) + var105;
                                            int var107 = (var14 << 7) + var104;
                                            var60[var52] = arg1.method361(var106, var107) - arg6.method361(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class416.field6051[var19][var100]) {
                                                int var108 = (var12 << 7) + var105;
                                                int var109 = (var14 << 7) + var104;
                                                var61[var52] = arg6.method361(var108, var109) - arg1.method361(var108, var109);
                                            } else if (arg4 != null && !class320.field4379[var19][var100]) {
                                                int var110 = (var12 << 7) + var105;
                                                int var111 = (var14 << 7) + var104;
                                                var61[var52] = arg4.method361(var110, var111) - arg6.method361(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field364 < class507.field7467[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class422.field6185[var101];
                                            }
                                            var59[var52] = class401.field5884[var101];
                                            var58[var52] = class175.field2593[var101];
                                            var57[var52] = class270.field3728[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg2.method308() ? var26.field378 : var26.field379;
                                            var59[var52] = var26.field371;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field4433 && arg3 == 0) {
                                    class316.method1847(var12, var14, var26.field381, var26.field361 * 8, var26.field367);
                                }
                                if (var19 != 12 && var26.field370 != -1 && var26.field377) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class242.field3391[var19];
                            } else if (var17) {
                                var51 += class279.field3814[var19];
                            } else {
                                var51 += class446.field6578[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class26 var67 = this.field4419.method1408(var22 - 1, (byte) 113);
                                class26 var68 = this.field4419.method1408(var23 - 1, (byte) 96);
                                class26 var69 = this.field4419.method1408(var24 - 1, (byte) 68);
                                class26 var70 = this.field4419.method1408(var25 - 1, (byte) 95);
                                for (int var71 = 0; var71 < var47; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class49.field592[0] = var49[var51];
                                        class49.field592[1] = 1;
                                        class49.field592[2] = var45[var51];
                                        class49.field592[3] = 1;
                                        class49.field592[4] = var46[var51];
                                        class49.field592[5] = var45[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class49.field592[0] = var49[var51];
                                        class49.field592[1] = 5;
                                        class49.field592[2] = var45[var51];
                                        class49.field592[3] = 5;
                                        class49.field592[4] = var46[var51];
                                        var73 = 6;
                                        class49.field592[5] = var45[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class49.field592[0] = var49[var51];
                                        class49.field592[1] = 3;
                                        class49.field592[2] = var45[var51];
                                        class49.field592[3] = 3;
                                        class49.field592[4] = var46[var51];
                                        class49.field592[5] = var45[var51];
                                        var73 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class49.field592[0] = var49[var51];
                                        class49.field592[1] = 7;
                                        class49.field592[2] = var45[var51];
                                        class49.field592[3] = 7;
                                        class49.field592[4] = var46[var51];
                                        var73 = 6;
                                        class49.field592[5] = var45[var51];
                                    } else {
                                        class49.field592[0] = var49[var51];
                                        class49.field592[1] = var46[var51];
                                        var73 = 3;
                                        class49.field592[2] = var45[var51];
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class49.field592[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field4421[var75];
                                        int var78 = this.field4435[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 128 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var79 = 128 - var78;
                                            var80 = 128 - var77;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 128 - var78;
                                        } else {
                                            var79 = var78;
                                            var80 = var77;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class416.field6051[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg1.method361(var81, var82) - arg6.method361(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class416.field6051[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg6.method361(var83, var84) - arg1.method361(var83, var84);
                                            } else if (arg4 != null && !class320.field4379[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg4.method361(var85, var86) - arg6.method361(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class507.field7467[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class422.field6185[var76];
                                            }
                                            var59[var52] = class401.field5884[var76];
                                            var58[var52] = class175.field2593[var76];
                                            var57[var52] = class270.field3728[var76];
                                        } else {
                                            if (var17 && class416.field6051[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg0[var12][var14];
                                                var58[var52] = var67.field337;
                                                var59[var52] = var67.field343;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg0[var12][var15];
                                                var58[var52] = var68.field337;
                                                var59[var52] = var68.field343;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg0[var13][var15];
                                                var58[var52] = var69.field337;
                                                var59[var52] = var69.field343;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg0[var13][var14];
                                                var58[var52] = var70.field337;
                                                var59[var52] = var70.field343;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var79 >= 64) {
                                                        var58[var52] = var68.field337;
                                                        var59[var52] = var68.field343;
                                                    } else {
                                                        var58[var52] = var67.field337;
                                                        var59[var52] = var67.field343;
                                                    }
                                                } else if (var79 < 64) {
                                                    var58[var52] = var70.field337;
                                                    var59[var52] = var70.field343;
                                                } else {
                                                    var58[var52] = var69.field337;
                                                    var59[var52] = var69.field343;
                                                }
                                                int var87 = class485.method2852(arg0[var12][var14], true, arg0[var13][var14], var80 << 7 >> 7);
                                                int var88 = class485.method2852(arg0[var12][var15], true, arg0[var13][var15], var80 << 7 >> 7);
                                                var57[var52] = class485.method2852(var87, true, var88, var79 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field336) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg6.method351(var12, var14);
                            int var90 = arg6.method351(var13, var14);
                            int var91 = arg6.method351(var13, var15);
                            int var92 = arg6.method351(var12, var15);
                            if (arg3 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field362) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field4420[arg3][var12][var14] = (byte) class255.method1532(this.field4420[arg3][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field4433) {
                                var94 = class398.method2393(var12, var14);
                                var95 = class11.method54(var12, var14);
                                var96 = class140.method937(var12, var14);
                            }
                            arg6.method360(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class19.method121(arg3, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIZLks;Lcs;)V")
    public class325(int arg0, int arg1, int arg2, boolean arg3, class303 arg4, class226 arg5) {
        this.field4413 = arg4;
        this.field4426 = arg2;
        this.field4419 = arg5;
        this.field4430 = arg0;
        this.field4434 = arg1;
        this.field4433 = arg3;
        this.field4425 = new byte[this.field4430][this.field4434][this.field4426];
        this.field4436 = new byte[this.field4430][this.field4434][this.field4426];
        this.field4432 = new byte[this.field4430][this.field4434][this.field4426];
        this.field4420 = new byte[this.field4430][this.field4434 + 1][this.field4426 + 1];
        this.field4412 = new byte[this.field4430][this.field4434][this.field4426];
        this.field4410 = new int[this.field4430][this.field4434 + 1][this.field4426 + 1];
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([[BIILbh;Lya;I[ZLwv;III[[BI[[B)V")
    private final void method1889(byte[][] arg0, int arg1, int arg2, class28 arg3, class38 arg4, int arg5, boolean[] arg6, class26 arg7, int arg8, int arg9, int arg10, byte[][] arg11, int arg12, byte[][] arg13) {
        if (arg3 != null && arg7 != null || arg7 != null && arg9 == 12 || arg3 != null && arg9 == 0) {
            boolean[] var15 = arg3 != null && arg3.field368 ? class6.field109[arg9] : class405.field5944[arg9];
            if (arg10 > 0) {
                if (arg1 > 0) {
                    int var16 = arg0[arg1 - 1][arg10 - 1] & 0xFF;
                    if (var16 > 0) {
                        class28 var17 = this.field4413.method1765(100, var16 - 1);
                        if (var17.field370 != -1 && var17.field368) {
                            byte var18 = arg11[arg1 - 1][arg10 - 1];
                            int var19 = arg13[arg1 - 1][arg10 - 1] * 2 + 4 & 0x7;
                            int var20 = class256.method1542(arg4, 1, var17);
                            if (class416.field6051[var18][var19]) {
                                class270.field3728[0] = var17.field370;
                                class422.field6185[0] = var20;
                                class175.field2593[0] = arg4.method308() ? var17.field378 : var17.field379;
                                class401.field5884[0] = var17.field371;
                                class507.field7467[0] = var17.field364;
                                class515.field7612[0] = 256;
                            }
                        }
                    }
                }
                if (arg1 < (arg12 - 1)) {
                    int var21 = arg0[arg1 + 1][arg10 - 1] & 0xFF;
                    if (var21 > 0) {
                        class28 var22 = this.field4413.method1765(127, var21 - 1);
                        if (var22.field370 != -1 && var22.field368) {
                            byte var23 = arg11[arg1 + 1][arg10 - 1];
                            int var24 = arg13[arg1 + 1][arg10 - 1] * 2 + 6 & 0x7;
                            int var25 = class256.method1542(arg4, 1, var22);
                            if (class416.field6051[var23][var24]) {
                                class270.field3728[2] = var22.field370;
                                class422.field6185[2] = var25;
                                class175.field2593[2] = arg4.method308() ? var22.field378 : var22.field379;
                                class401.field5884[2] = var22.field371;
                                class507.field7467[2] = var22.field364;
                                class515.field7612[2] = 512;
                            }
                        }
                    }
                }
            }
            if ((arg2 - 1) > arg10) {
                if (arg1 > 0) {
                    int var26 = arg0[arg1 - 1][arg10 + 1] & 0xFF;
                    if (var26 > 0) {
                        class28 var27 = this.field4413.method1765(79, var26 - 1);
                        if (var27.field370 != -1 && var27.field368) {
                            byte var28 = arg11[arg1 - 1][arg10 + 1];
                            int var29 = (arg13[arg1 - 1][arg10 + 1] * 2) + 2 & 0x7;
                            int var30 = class256.method1542(arg4, 1, var27);
                            if (class416.field6051[var28][var29]) {
                                class270.field3728[6] = var27.field370;
                                class422.field6185[6] = var30;
                                class175.field2593[6] = arg4.method308() ? var27.field378 : var27.field379;
                                class401.field5884[6] = var27.field371;
                                class507.field7467[6] = var27.field364;
                                class515.field7612[6] = 64;
                            }
                        }
                    }
                }
                if (arg1 < (arg12 - 1)) {
                    int var31 = arg0[arg1 + 1][arg10 + 1] & 0xFF;
                    if (var31 > 0) {
                        class28 var32 = this.field4413.method1765(117, var31 - 1);
                        if (var32.field370 != -1 && var32.field368) {
                            byte var33 = arg11[arg1 + 1][arg10 + 1];
                            int var34 = -(-(arg13[arg1 + 1][arg10 + 1] * 2)) & 0x7;
                            int var35 = class256.method1542(arg4, arg5 ^ 0x1, var32);
                            if (class416.field6051[var33][var34]) {
                                class270.field3728[4] = var32.field370;
                                class422.field6185[4] = var35;
                                class175.field2593[4] = arg4.method308() ? var32.field378 : var32.field379;
                                class401.field5884[4] = var32.field371;
                                class507.field7467[4] = var32.field364;
                                class515.field7612[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg10 > 0) {
                int var36 = arg0[arg1][arg10 - 1] & 0xFF;
                if (var36 > 0) {
                    class28 var37 = this.field4413.method1765(81, var36 - 1);
                    if (var37.field370 != -1) {
                        byte var38 = arg11[arg1][arg10 - 1];
                        byte var39 = arg13[arg1][arg10 - 1];
                        if (var37.field368) {
                            int var40 = 2;
                            int var41 = (var39 * 2) + 4;
                            int var42 = class256.method1542(arg4, 1, var37);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var40 &= 0x7;
                                var41 &= 0x7;
                                if (class416.field6051[var38][var41] && var37.field364 >= class507.field7467[var40]) {
                                    class270.field3728[var40] = var37.field370;
                                    class422.field6185[var40] = var42;
                                    class175.field2593[var40] = arg4.method308() ? var37.field378 : var37.field379;
                                    class401.field5884[var40] = var37.field371;
                                    if (class507.field7467[var40] == var37.field364) {
                                        class515.field7612[var40] = class255.method1532(class515.field7612[var40], 32);
                                    } else {
                                        class515.field7612[var40] = 32;
                                    }
                                    class507.field7467[var40] = var37.field364;
                                }
                                var40--;
                                var41++;
                            }
                            if (!var15[arg8 & 0x3]) {
                                arg6[0] = class6.field109[var38][class251.method1501(var39 + 2, 3)];
                            }
                        } else if (!var15[arg8 & 0x3]) {
                            arg6[0] = class405.field5944[var38][class251.method1501(var39 + 2, 3)];
                        }
                    }
                }
            }
            if (arg2 - 1 > arg10) {
                int var44 = arg0[arg1][arg10 + 1] & 0xFF;
                if (var44 > 0) {
                    class28 var45 = this.field4413.method1765(120, var44 - 1);
                    if (var45.field370 != -1) {
                        byte var46 = arg11[arg1][arg10 + 1];
                        byte var47 = arg13[arg1][arg10 + 1];
                        if (var45.field368) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class256.method1542(arg4, 1, var45);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var48 &= 0x7;
                                var49 &= 0x7;
                                if (class416.field6051[var46][var49] && class507.field7467[var48] <= var45.field364) {
                                    class270.field3728[var48] = var45.field370;
                                    class422.field6185[var48] = var50;
                                    class175.field2593[var48] = arg4.method308() ? var45.field378 : var45.field379;
                                    class401.field5884[var48] = var45.field371;
                                    if (class507.field7467[var48] == var45.field364) {
                                        class515.field7612[var48] = class255.method1532(class515.field7612[var48], 16);
                                    } else {
                                        class515.field7612[var48] = 16;
                                    }
                                    class507.field7467[var48] = var45.field364;
                                }
                                var49--;
                                var48++;
                            }
                            if (!var15[arg8 + 2 & 0x3]) {
                                arg6[2] = class6.field109[var46][class251.method1501(3, var47)];
                            }
                        } else if (!var15[arg8 + 2 & 0x3]) {
                            arg6[2] = class405.field5944[var46][class251.method1501(-(-var47), 3)];
                        }
                    }
                }
            }
            if (arg1 > 0) {
                int var52 = arg0[arg1 - 1][arg10] & 0xFF;
                if (var52 > 0) {
                    class28 var53 = this.field4413.method1765(arg5 ^ 0x5B, var52 - 1);
                    if (var53.field370 != -1) {
                        byte var54 = arg11[arg1 - 1][arg10];
                        byte var55 = arg13[arg1 - 1][arg10];
                        if (var53.field368) {
                            int var56 = 6;
                            int var57 = var55 * 2 + 4;
                            int var58 = class256.method1542(arg4, 1, var53);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var56 &= 0x7;
                                var57 &= 0x7;
                                if (class416.field6051[var54][var57] && var53.field364 >= class507.field7467[var56]) {
                                    class270.field3728[var56] = var53.field370;
                                    class422.field6185[var56] = var58;
                                    class175.field2593[var56] = arg4.method308() ? var53.field378 : var53.field379;
                                    class401.field5884[var56] = var53.field371;
                                    if (class507.field7467[var56] == var53.field364) {
                                        class515.field7612[var56] = class255.method1532(class515.field7612[var56], 8);
                                    } else {
                                        class515.field7612[var56] = 8;
                                    }
                                    class507.field7467[var56] = var53.field364;
                                }
                                var56++;
                                var57--;
                            }
                            if (!var15[arg8 + 3 & 0x3]) {
                                arg6[3] = class6.field109[var54][class251.method1501(3, var55 + 1)];
                            }
                        } else if (!var15[arg8 + 3 & 0x3]) {
                            arg6[3] = class405.field5944[var54][class251.method1501(3, var55 + 1)];
                        }
                    }
                }
            }
            if (arg12 - 1 > arg1) {
                int var60 = arg0[arg1 + 1][arg10] & 0xFF;
                if (var60 > 0) {
                    class28 var61 = this.field4413.method1765(108, var60 - 1);
                    if (var61.field370 != -1) {
                        byte var62 = arg11[arg1 + 1][arg10];
                        byte var63 = arg13[arg1 + 1][arg10];
                        if (var61.field368) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class256.method1542(arg4, 1, var61);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var64 &= 0x7;
                                var65 &= 0x7;
                                if (class416.field6051[var62][var65] && class507.field7467[var64] <= var61.field364) {
                                    class270.field3728[var64] = var61.field370;
                                    class422.field6185[var64] = var66;
                                    class175.field2593[var64] = arg4.method308() ? var61.field378 : var61.field379;
                                    class401.field5884[var64] = var61.field371;
                                    if (class507.field7467[var64] == var61.field364) {
                                        class515.field7612[var64] = class255.method1532(class515.field7612[var64], 4);
                                    } else {
                                        class515.field7612[var64] = 4;
                                    }
                                    class507.field7467[var64] = var61.field364;
                                }
                                var65++;
                                var64--;
                            }
                            if (!var15[arg8 + 1 & 0x3]) {
                                arg6[1] = class6.field109[var62][class251.method1501(3, var63 + 3)];
                            }
                        } else if (!var15[arg8 + 1 & 0x3]) {
                            arg6[1] = class405.field5944[var62][class251.method1501(3, var63 + 3)];
                        }
                    }
                }
            }
        }
        field4416++;
        if (arg3 != null) {
            int var68 = class256.method1542(arg4, arg5 + 1, arg3);
            if (arg3.field368) {
                for (int var69 = 0; var69 < 8; var69++) {
                    int var70 = var69 - (arg8 * 2) & 0x7;
                    if (class416.field6051[arg9][var69] && class507.field7467[var70] <= arg3.field364) {
                        class270.field3728[var70] = arg3.field370;
                        class422.field6185[var70] = var68;
                        class175.field2593[var70] = arg4.method308() ? arg3.field378 : arg3.field379;
                        class401.field5884[var70] = arg3.field371;
                        if (class507.field7467[var70] == arg3.field364) {
                            class515.field7612[var70] = class255.method1532(class515.field7612[var70], 2);
                        } else {
                            class515.field7612[var70] = 2;
                        }
                        class507.field7467[var70] = arg3.field364;
                    }
                }
            }
        }
        if (arg5 != 0) {
            field4414 = 48;
        }
    }
}
