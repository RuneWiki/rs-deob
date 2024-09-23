import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix3D extends Pix2D {

    @OriginalMember(owner = "ib", name = "z", descriptor = "I")
    private static int field634 = -324;

    @OriginalMember(owner = "ib", name = "B", descriptor = "Z")
    public static boolean field636 = true;

    @OriginalMember(owner = "ib", name = "E", descriptor = "Z")
    public static boolean field639 = true;

    @OriginalMember(owner = "ib", name = "I", descriptor = "[I")
    public static int[] field643 = new int[512];

    @OriginalMember(owner = "ib", name = "J", descriptor = "[I")
    public static int[] field644 = new int[2048];

    @OriginalMember(owner = "ib", name = "K", descriptor = "[I")
    public static int[] field645 = new int[2048];

    @OriginalMember(owner = "ib", name = "L", descriptor = "[I")
    public static int[] field646 = new int[2048];

    @OriginalMember(owner = "ib", name = "O", descriptor = "[Lkb;")
    public static Pix8[] field649;

    @OriginalMember(owner = "ib", name = "P", descriptor = "[Z")
    public static boolean[] field650;

    @OriginalMember(owner = "ib", name = "Q", descriptor = "[I")
    public static int[] field651;

    @OriginalMember(owner = "ib", name = "T", descriptor = "[[I")
    public static int[][] field654;

    @OriginalMember(owner = "ib", name = "U", descriptor = "[I")
    public static int[] field655;

    @OriginalMember(owner = "ib", name = "W", descriptor = "[I")
    public static int[] field657;

    @OriginalMember(owner = "ib", name = "X", descriptor = "[[I")
    public static int[][] field658;

    @OriginalMember(owner = "ib", name = "A", descriptor = "I")
    private static int field635;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "ib", name = "N", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "ib", name = "R", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "ib", name = "V", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "ib", name = "C", descriptor = "Z")
    public static boolean field637;

    @OriginalMember(owner = "ib", name = "D", descriptor = "Z")
    public static boolean field638;

    @OriginalMember(owner = "ib", name = "M", descriptor = "[I")
    public static int[] field647;

    @OriginalMember(owner = "ib", name = "S", descriptor = "[[I")
    public static int[][] field653;

    @OriginalMember(owner = "ib", name = "c", descriptor = "(I)V")
    public static final void method177(int arg0) {
        int var1 = 53 / arg0;
        field643 = null;
        field643 = null;
        field645 = null;
        field646 = null;
        field647 = null;
        field649 = null;
        field650 = null;
        field651 = null;
        field653 = null;
        field654 = null;
        field655 = null;
        field657 = null;
        field658 = null;
    }

    @OriginalMember(owner = "ib", name = "d", descriptor = "(I)V")
    public static final void method178(int arg0) {
        field647 = new int[Pix2D.field625];
        int var1 = 24 / arg0;
        for (int var2 = 0; var2 < Pix2D.field625; var2++) {
            field647[var2] = Pix2D.field624 * var2;
        }
        field641 = Pix2D.field624 / 2;
        field642 = Pix2D.field625 / 2;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public static final void method179(int arg0, int arg1, int arg2) {
        field647 = new int[arg2];
        if (arg1 != 0) {
            field634 = 327;
        }
        for (int var3 = 0; var3 < arg2; var3++) {
            field647[var3] = arg0 * var3;
        }
        field641 = arg0 / 2;
        field642 = arg2 / 2;
    }

    @OriginalMember(owner = "ib", name = "e", descriptor = "(I)V")
    public static final void method180(int arg0) {
        field653 = null;
        if (arg0 != 2) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        for (int var2 = 0; var2 < 50; var2++) {
            field654[var2] = null;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(II)V")
    public static final void method181(int arg0, int arg1) {
        if (arg0 != 0 || field653 != null) {
            return;
        }
        field652 = arg1;
        if (field636) {
            field653 = new int[field652][16384];
        } else {
            field653 = new int[field652][65536];
        }
        for (int var2 = 0; var2 < 50; var2++) {
            field654[var2] = null;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(Lyb;Z)V")
    public static final void method182(Jagfile arg0, boolean arg1) {
        field648 = 0;
        if (arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < 50; var3++) {
            try {
                field649[var3] = new Pix8(arg0, String.valueOf(var3), 0);
                if (field636 && field649[var3].field680 == 128) {
                    field649[var3].method207(true);
                } else {
                    field649[var3].method208((byte) -86);
                }
                field648++;
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(II)I")
    public static final int method183(int arg0, int arg1) {
        if (arg0 < field635 || arg0 > field635) {
            field634 = 184;
        }
        if (field651[arg1] != 0) {
            return field651[arg1];
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = field658[arg1].length;
        for (int var6 = 0; var6 < var5; var6++) {
            var2 += field658[arg1][var6] >> 16 & 0xFF;
            var3 += field658[arg1][var6] >> 8 & 0xFF;
            var4 += field658[arg1][var6] & 0xFF;
        }
        int var7 = var4 / var5 + (var2 / var5 << 16) + (var3 / var5 << 8);
        int var8 = method187(var7, 1.4D);
        if (var8 == 0) {
            var8 = 1;
        }
        field651[arg1] = var8;
        return var8;
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(II)V")
    public static final void method184(int arg0, int arg1) {
        if (field654[arg1] != null) {
            field653[field652++] = field654[arg1];
            if (arg0 == 3) {
                field654[arg1] = null;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "f", descriptor = "(I)[I")
    public static final int[] method185(int arg0) {
        field655[arg0] = field656++;
        if (field654[arg0] != null) {
            return field654[arg0];
        }
        int[] var1;
        if (field652 > 0) {
            var1 = field653[--field652];
            field653[field652] = null;
        } else {
            int var2 = 0;
            int var3 = -1;
            for (int var4 = 0; var4 < field648; var4++) {
                if (field654[var4] != null && (field655[var4] < var2 || var3 == -1)) {
                    var2 = field655[var4];
                    var3 = var4;
                }
            }
            var1 = field654[var3];
            field654[var3] = null;
        }
        field654[arg0] = var1;
        Pix8 var5 = field649[arg0];
        int[] var6 = field658[arg0];
        if (field636) {
            field650[arg0] = false;
            for (int var7 = 0; var7 < 4096; var7++) {
                int var8 = var1[var7] = var6[var5.field674[var7]] & 0xF8F8FF;
                if (var8 == 0) {
                    field650[arg0] = true;
                }
                var1[var7 + 4096] = var8 - (var8 >>> 3) & 0xF8F8FF;
                var1[var7 + 8192] = var8 - (var8 >>> 2) & 0xF8F8FF;
                var1[var7 + 12288] = var8 - (var8 >>> 2) - (var8 >>> 3) & 0xF8F8FF;
            }
        } else {
            if (var5.field676 == 64) {
                for (int var9 = 0; var9 < 128; var9++) {
                    for (int var10 = 0; var10 < 128; var10++) {
                        var1[(var9 << 7) + var10] = var6[var5.field674[(var9 >> 1 << 6) + (var10 >> 1)]];
                    }
                }
            } else {
                for (int var11 = 0; var11 < 16384; var11++) {
                    var1[var11] = var6[var5.field674[var11]];
                }
            }
            field650[arg0] = false;
            for (int var12 = 0; var12 < 16384; var12++) {
                var1[var12] &= 0xF8F8FF;
                int var13 = var1[var12];
                if (var13 == 0) {
                    field650[arg0] = true;
                }
                var1[var12 + 16384] = var13 - (var13 >>> 3) & 0xF8F8FF;
                var1[var12 + 32768] = var13 - (var13 >>> 2) & 0xF8F8FF;
                var1[var12 + 49152] = var13 - (var13 >>> 2) - (var13 >>> 3) & 0xF8F8FF;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ID)V")
    public static final void method186(int arg0, double arg1) {
        double var3 = arg1 + Math.random() * 0.03D - 0.015D;
        int var5 = 0;
        int var6 = 17 / arg0;
        for (int var7 = 0; var7 < 512; var7++) {
            double var12 = (double) (var7 / 8) / 64.0D + 0.0078125D;
            double var14 = (double) (var7 & 0x7) / 8.0D + 0.0625D;
            for (int var16 = 0; var16 < 128; var16++) {
                double var17 = (double) var16 / 128.0D;
                double var19 = var17;
                double var21 = var17;
                double var23 = var17;
                if (var14 != 0.0D) {
                    double var25;
                    if (var17 < 0.5D) {
                        var25 = (var14 + 1.0D) * var17;
                    } else {
                        var25 = var14 + var17 - var14 * var17;
                    }
                    double var27 = var17 * 2.0D - var25;
                    double var29 = var12 + 0.3333333333333333D;
                    if (var29 > 1.0D) {
                        var29--;
                    }
                    double var33 = var12 - 0.3333333333333333D;
                    if (var33 < 0.0D) {
                        var33++;
                    }
                    if (var29 * 6.0D < 1.0D) {
                        var19 = (var25 - var27) * 6.0D * var29 + var27;
                    } else if (var29 * 2.0D < 1.0D) {
                        var19 = var25;
                    } else if (var29 * 3.0D < 2.0D) {
                        var19 = (var25 - var27) * (0.6666666666666666D - var29) * 6.0D + var27;
                    } else {
                        var19 = var27;
                    }
                    if (var12 * 6.0D < 1.0D) {
                        var21 = (var25 - var27) * 6.0D * var12 + var27;
                    } else if (var12 * 2.0D < 1.0D) {
                        var21 = var25;
                    } else if (var12 * 3.0D < 2.0D) {
                        var21 = (var25 - var27) * (0.6666666666666666D - var12) * 6.0D + var27;
                    } else {
                        var21 = var27;
                    }
                    if (var33 * 6.0D < 1.0D) {
                        var23 = (var25 - var27) * 6.0D * var33 + var27;
                    } else if (var33 * 2.0D < 1.0D) {
                        var23 = var25;
                    } else if (var33 * 3.0D < 2.0D) {
                        var23 = (var25 - var27) * (0.6666666666666666D - var33) * 6.0D + var27;
                    } else {
                        var23 = var27;
                    }
                }
                int var35 = (int) (var19 * 256.0D);
                int var36 = (int) (var21 * 256.0D);
                int var37 = (int) (var23 * 256.0D);
                int var38 = (var35 << 16) + (var36 << 8) + var37;
                int var39 = method187(var38, var3);
                field657[var5++] = var39;
            }
        }
        for (int var8 = 0; var8 < 50; var8++) {
            if (field649[var8] != null) {
                int[] var10 = field649[var8].field675;
                field658[var8] = new int[var10.length];
                for (int var11 = 0; var11 < var10.length; var11++) {
                    field658[var8][var11] = method187(var10[var11], var3);
                }
            }
        }
        for (int var9 = 0; var9 < 50; var9++) {
            method184(3, var9);
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(ID)I")
    public static int method187(int arg0, double arg1) {
        double var3 = (double) (arg0 >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = Math.pow(var3, arg1);
        double var11 = Math.pow(var5, arg1);
        double var13 = Math.pow(var7, arg1);
        int var15 = (int) (var9 * 256.0D);
        int var16 = (int) (var11 * 256.0D);
        int var17 = (int) (var13 * 256.0D);
        return (var15 << 16) + (var16 << 8) + var17;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 0;
        int var10 = 0;
        if (arg0 != arg1) {
            var9 = (arg4 - arg3 << 16) / (arg1 - arg0);
            var10 = (arg7 - arg6 << 15) / (arg1 - arg0);
        }
        int var11 = 0;
        int var12 = 0;
        if (arg1 != arg2) {
            var11 = (arg5 - arg4 << 16) / (arg2 - arg1);
            var12 = (arg8 - arg7 << 15) / (arg2 - arg1);
        }
        int var13 = 0;
        int var14 = 0;
        if (arg0 != arg2) {
            var13 = (arg3 - arg5 << 16) / (arg0 - arg2);
            var14 = (arg6 - arg8 << 15) / (arg0 - arg2);
        }
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < Pix2D.field627) {
                if (arg1 > Pix2D.field627) {
                    arg1 = Pix2D.field627;
                }
                if (arg2 > Pix2D.field627) {
                    arg2 = Pix2D.field627;
                }
                if (arg1 < arg2) {
                    int var15;
                    int var16 = var15 = arg3 << 16;
                    int var17;
                    int var18 = var17 = arg6 << 15;
                    if (arg0 < 0) {
                        var16 -= arg0 * var13;
                        var15 -= arg0 * var9;
                        var18 -= arg0 * var14;
                        var17 -= arg0 * var10;
                        arg0 = 0;
                    }
                    int var19 = arg4 << 16;
                    int var20 = arg7 << 15;
                    if (arg1 < 0) {
                        var19 -= arg1 * var11;
                        var20 -= arg1 * var12;
                        arg1 = 0;
                    }
                    if (arg0 != arg1 && var13 < var9 || arg0 == arg1 && var13 > var11) {
                        int var21 = arg2 - arg1;
                        int var22 = arg1 - arg0;
                        int var23 = field647[arg0];
                        while (true) {
                            var22--;
                            if (var22 < 0) {
                                while (true) {
                                    var21--;
                                    if (var21 < 0) {
                                        return;
                                    }
                                    method189(Pix2D.field623, var23, 0, 0, var16 >> 16, var19 >> 16, var18 >> 7, var20 >> 7);
                                    var16 += var13;
                                    var19 += var11;
                                    var18 += var14;
                                    var20 += var12;
                                    var23 += Pix2D.field624;
                                }
                            }
                            method189(Pix2D.field623, var23, 0, 0, var16 >> 16, var15 >> 16, var18 >> 7, var17 >> 7);
                            var16 += var13;
                            var15 += var9;
                            var18 += var14;
                            var17 += var10;
                            var23 += Pix2D.field624;
                        }
                    } else {
                        int var24 = arg2 - arg1;
                        int var25 = arg1 - arg0;
                        int var26 = field647[arg0];
                        while (true) {
                            var25--;
                            if (var25 < 0) {
                                while (true) {
                                    var24--;
                                    if (var24 < 0) {
                                        return;
                                    }
                                    method189(Pix2D.field623, var26, 0, 0, var19 >> 16, var16 >> 16, var20 >> 7, var18 >> 7);
                                    var16 += var13;
                                    var19 += var11;
                                    var18 += var14;
                                    var20 += var12;
                                    var26 += Pix2D.field624;
                                }
                            }
                            method189(Pix2D.field623, var26, 0, 0, var15 >> 16, var16 >> 16, var17 >> 7, var18 >> 7);
                            var16 += var13;
                            var15 += var9;
                            var18 += var14;
                            var17 += var10;
                            var26 += Pix2D.field624;
                        }
                    }
                } else {
                    int var27;
                    int var28 = var27 = arg3 << 16;
                    int var29;
                    int var30 = var29 = arg6 << 15;
                    if (arg0 < 0) {
                        var28 -= arg0 * var13;
                        var27 -= arg0 * var9;
                        var30 -= arg0 * var14;
                        var29 -= arg0 * var10;
                        arg0 = 0;
                    }
                    int var31 = arg5 << 16;
                    int var32 = arg8 << 15;
                    if (arg2 < 0) {
                        var31 -= arg2 * var11;
                        var32 -= arg2 * var12;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var13 < var9 || arg0 == arg2 && var11 > var9) {
                        int var33 = arg1 - arg2;
                        int var34 = arg2 - arg0;
                        int var35 = field647[arg0];
                        while (true) {
                            var34--;
                            if (var34 < 0) {
                                while (true) {
                                    var33--;
                                    if (var33 < 0) {
                                        return;
                                    }
                                    method189(Pix2D.field623, var35, 0, 0, var31 >> 16, var27 >> 16, var32 >> 7, var29 >> 7);
                                    var31 += var11;
                                    var27 += var9;
                                    var32 += var12;
                                    var29 += var10;
                                    var35 += Pix2D.field624;
                                }
                            }
                            method189(Pix2D.field623, var35, 0, 0, var28 >> 16, var27 >> 16, var30 >> 7, var29 >> 7);
                            var28 += var13;
                            var27 += var9;
                            var30 += var14;
                            var29 += var10;
                            var35 += Pix2D.field624;
                        }
                    } else {
                        int var36 = arg1 - arg2;
                        int var37 = arg2 - arg0;
                        int var38 = field647[arg0];
                        while (true) {
                            var37--;
                            if (var37 < 0) {
                                while (true) {
                                    var36--;
                                    if (var36 < 0) {
                                        return;
                                    }
                                    method189(Pix2D.field623, var38, 0, 0, var27 >> 16, var31 >> 16, var29 >> 7, var32 >> 7);
                                    var31 += var11;
                                    var27 += var9;
                                    var32 += var12;
                                    var29 += var10;
                                    var38 += Pix2D.field624;
                                }
                            }
                            method189(Pix2D.field623, var38, 0, 0, var27 >> 16, var28 >> 16, var29 >> 7, var30 >> 7);
                            var28 += var13;
                            var27 += var9;
                            var30 += var14;
                            var29 += var10;
                            var38 += Pix2D.field624;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < Pix2D.field627) {
                if (arg2 > Pix2D.field627) {
                    arg2 = Pix2D.field627;
                }
                if (arg0 > Pix2D.field627) {
                    arg0 = Pix2D.field627;
                }
                if (arg2 < arg0) {
                    int var39;
                    int var40 = var39 = arg4 << 16;
                    int var41;
                    int var42 = var41 = arg7 << 15;
                    if (arg1 < 0) {
                        var40 -= arg1 * var9;
                        var39 -= arg1 * var11;
                        var42 -= arg1 * var10;
                        var41 -= arg1 * var12;
                        arg1 = 0;
                    }
                    int var43 = arg5 << 16;
                    int var44 = arg8 << 15;
                    if (arg2 < 0) {
                        var43 -= arg2 * var13;
                        var44 -= arg2 * var14;
                        arg2 = 0;
                    }
                    if (arg1 != arg2 && var9 < var11 || arg1 == arg2 && var9 > var13) {
                        int var45 = arg0 - arg2;
                        int var46 = arg2 - arg1;
                        int var47 = field647[arg1];
                        while (true) {
                            var46--;
                            if (var46 < 0) {
                                while (true) {
                                    var45--;
                                    if (var45 < 0) {
                                        return;
                                    }
                                    method189(Pix2D.field623, var47, 0, 0, var40 >> 16, var43 >> 16, var42 >> 7, var44 >> 7);
                                    var40 += var9;
                                    var43 += var13;
                                    var42 += var10;
                                    var44 += var14;
                                    var47 += Pix2D.field624;
                                }
                            }
                            method189(Pix2D.field623, var47, 0, 0, var40 >> 16, var39 >> 16, var42 >> 7, var41 >> 7);
                            var40 += var9;
                            var39 += var11;
                            var42 += var10;
                            var41 += var12;
                            var47 += Pix2D.field624;
                        }
                    } else {
                        int var48 = arg0 - arg2;
                        int var49 = arg2 - arg1;
                        int var50 = field647[arg1];
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return;
                                    }
                                    method189(Pix2D.field623, var50, 0, 0, var43 >> 16, var40 >> 16, var44 >> 7, var42 >> 7);
                                    var40 += var9;
                                    var43 += var13;
                                    var42 += var10;
                                    var44 += var14;
                                    var50 += Pix2D.field624;
                                }
                            }
                            method189(Pix2D.field623, var50, 0, 0, var39 >> 16, var40 >> 16, var41 >> 7, var42 >> 7);
                            var40 += var9;
                            var39 += var11;
                            var42 += var10;
                            var41 += var12;
                            var50 += Pix2D.field624;
                        }
                    }
                } else {
                    int var51;
                    int var52 = var51 = arg4 << 16;
                    int var53;
                    int var54 = var53 = arg7 << 15;
                    if (arg1 < 0) {
                        var52 -= arg1 * var9;
                        var51 -= arg1 * var11;
                        var54 -= arg1 * var10;
                        var53 -= arg1 * var12;
                        arg1 = 0;
                    }
                    int var55 = arg3 << 16;
                    int var56 = arg6 << 15;
                    if (arg0 < 0) {
                        var55 -= arg0 * var13;
                        var56 -= arg0 * var14;
                        arg0 = 0;
                    }
                    if (var9 < var11) {
                        int var57 = arg2 - arg0;
                        int var58 = arg0 - arg1;
                        int var59 = field647[arg1];
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return;
                                    }
                                    method189(Pix2D.field623, var59, 0, 0, var55 >> 16, var51 >> 16, var56 >> 7, var53 >> 7);
                                    var55 += var13;
                                    var51 += var11;
                                    var56 += var14;
                                    var53 += var12;
                                    var59 += Pix2D.field624;
                                }
                            }
                            method189(Pix2D.field623, var59, 0, 0, var52 >> 16, var51 >> 16, var54 >> 7, var53 >> 7);
                            var52 += var9;
                            var51 += var11;
                            var54 += var10;
                            var53 += var12;
                            var59 += Pix2D.field624;
                        }
                    } else {
                        int var60 = arg2 - arg0;
                        int var61 = arg0 - arg1;
                        int var62 = field647[arg1];
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return;
                                    }
                                    method189(Pix2D.field623, var62, 0, 0, var51 >> 16, var55 >> 16, var53 >> 7, var56 >> 7);
                                    var55 += var13;
                                    var51 += var11;
                                    var56 += var14;
                                    var53 += var12;
                                    var62 += Pix2D.field624;
                                }
                            }
                            method189(Pix2D.field623, var62, 0, 0, var51 >> 16, var52 >> 16, var53 >> 7, var54 >> 7);
                            var52 += var9;
                            var51 += var11;
                            var54 += var10;
                            var53 += var12;
                            var62 += Pix2D.field624;
                        }
                    }
                }
            }
        } else if (arg2 < Pix2D.field627) {
            if (arg0 > Pix2D.field627) {
                arg0 = Pix2D.field627;
            }
            if (arg1 > Pix2D.field627) {
                arg1 = Pix2D.field627;
            }
            if (arg0 < arg1) {
                int var63;
                int var64 = var63 = arg5 << 16;
                int var65;
                int var66 = var65 = arg8 << 15;
                if (arg2 < 0) {
                    var64 -= arg2 * var11;
                    var63 -= arg2 * var13;
                    var66 -= arg2 * var12;
                    var65 -= arg2 * var14;
                    arg2 = 0;
                }
                int var67 = arg3 << 16;
                int var68 = arg6 << 15;
                if (arg0 < 0) {
                    var67 -= arg0 * var9;
                    var68 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var11 < var13) {
                    int var69 = arg1 - arg0;
                    int var70 = arg0 - arg2;
                    int var71 = field647[arg2];
                    while (true) {
                        var70--;
                        if (var70 < 0) {
                            while (true) {
                                var69--;
                                if (var69 < 0) {
                                    return;
                                }
                                method189(Pix2D.field623, var71, 0, 0, var64 >> 16, var67 >> 16, var66 >> 7, var68 >> 7);
                                var64 += var11;
                                var67 += var9;
                                var66 += var12;
                                var68 += var10;
                                var71 += Pix2D.field624;
                            }
                        }
                        method189(Pix2D.field623, var71, 0, 0, var64 >> 16, var63 >> 16, var66 >> 7, var65 >> 7);
                        var64 += var11;
                        var63 += var13;
                        var66 += var12;
                        var65 += var14;
                        var71 += Pix2D.field624;
                    }
                } else {
                    int var72 = arg1 - arg0;
                    int var73 = arg0 - arg2;
                    int var74 = field647[arg2];
                    while (true) {
                        var73--;
                        if (var73 < 0) {
                            while (true) {
                                var72--;
                                if (var72 < 0) {
                                    return;
                                }
                                method189(Pix2D.field623, var74, 0, 0, var67 >> 16, var64 >> 16, var68 >> 7, var66 >> 7);
                                var64 += var11;
                                var67 += var9;
                                var66 += var12;
                                var68 += var10;
                                var74 += Pix2D.field624;
                            }
                        }
                        method189(Pix2D.field623, var74, 0, 0, var63 >> 16, var64 >> 16, var65 >> 7, var66 >> 7);
                        var64 += var11;
                        var63 += var13;
                        var66 += var12;
                        var65 += var14;
                        var74 += Pix2D.field624;
                    }
                }
            } else {
                int var75;
                int var76 = var75 = arg5 << 16;
                int var77;
                int var78 = var77 = arg8 << 15;
                if (arg2 < 0) {
                    var76 -= arg2 * var11;
                    var75 -= arg2 * var13;
                    var78 -= arg2 * var12;
                    var77 -= arg2 * var14;
                    arg2 = 0;
                }
                int var79 = arg4 << 16;
                int var80 = arg7 << 15;
                if (arg1 < 0) {
                    var79 -= arg1 * var9;
                    var80 -= arg1 * var10;
                    arg1 = 0;
                }
                if (var11 < var13) {
                    int var81 = arg0 - arg1;
                    int var82 = arg1 - arg2;
                    int var83 = field647[arg2];
                    while (true) {
                        var82--;
                        if (var82 < 0) {
                            while (true) {
                                var81--;
                                if (var81 < 0) {
                                    return;
                                }
                                method189(Pix2D.field623, var83, 0, 0, var79 >> 16, var75 >> 16, var80 >> 7, var77 >> 7);
                                var79 += var9;
                                var75 += var13;
                                var80 += var10;
                                var77 += var14;
                                var83 += Pix2D.field624;
                            }
                        }
                        method189(Pix2D.field623, var83, 0, 0, var76 >> 16, var75 >> 16, var78 >> 7, var77 >> 7);
                        var76 += var11;
                        var75 += var13;
                        var78 += var12;
                        var77 += var14;
                        var83 += Pix2D.field624;
                    }
                } else {
                    int var84 = arg0 - arg1;
                    int var85 = arg1 - arg2;
                    int var86 = field647[arg2];
                    while (true) {
                        var85--;
                        if (var85 < 0) {
                            while (true) {
                                var84--;
                                if (var84 < 0) {
                                    return;
                                }
                                method189(Pix2D.field623, var86, 0, 0, var75 >> 16, var79 >> 16, var77 >> 7, var80 >> 7);
                                var79 += var9;
                                var75 += var13;
                                var80 += var10;
                                var77 += var14;
                                var86 += Pix2D.field624;
                            }
                        }
                        method189(Pix2D.field623, var86, 0, 0, var75 >> 16, var76 >> 16, var77 >> 7, var78 >> 7);
                        var76 += var11;
                        var75 += var13;
                        var78 += var12;
                        var77 += var14;
                        var86 += Pix2D.field624;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([IIIIIIII)V")
    public static final void method189(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (field639) {
            int var9;
            int var10;
            int var11;
            if (field637) {
                int var8;
                if (arg5 - arg4 > 3) {
                    var8 = (arg7 - arg6) / (arg5 - arg4);
                } else {
                    var8 = 0;
                }
                if (arg5 > Pix2D.field630) {
                    arg5 = Pix2D.field630;
                }
                if (arg4 < 0) {
                    arg6 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg4 >= arg5) {
                    return;
                }
                var9 = arg1 + arg4;
                var10 = arg5 - arg4 >> 2;
                var11 = var8 << 2;
            } else if (arg4 < arg5) {
                var9 = arg1 + arg4;
                var10 = arg5 - arg4 >> 2;
                if (var10 > 0) {
                    var11 = (arg7 - arg6) * field643[var10] >> 15;
                } else {
                    var11 = 0;
                }
            } else {
                return;
            }
            if (field640 == 0) {
                while (true) {
                    var10--;
                    if (var10 < 0) {
                        int var12 = arg5 - arg4 & 0x3;
                        if (var12 > 0) {
                            int var13 = field657[arg6 >> 8];
                            do {
                                arg0[var9++] = var13;
                                var12--;
                            } while (var12 > 0);
                            return;
                        }
                        break;
                    }
                    int var14 = field657[arg6 >> 8];
                    arg6 += var11;
                    arg0[var9++] = var14;
                    arg0[var9++] = var14;
                    arg0[var9++] = var14;
                    arg0[var9++] = var14;
                }
            } else {
                int var15 = field640;
                int var16 = 256 - field640;
                while (true) {
                    var10--;
                    if (var10 < 0) {
                        int var17 = arg5 - arg4 & 0x3;
                        if (var17 > 0) {
                            int var18 = field657[arg6 >> 8];
                            int var19 = ((var18 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + ((var18 & 0xFF00) * var16 >> 8 & 0xFF00);
                            do {
                                arg0[var9++] = ((arg0[var9] & 0xFF00) * var15 >> 8 & 0xFF00) + ((arg0[var9] & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var19;
                                var17--;
                            } while (var17 > 0);
                        }
                        break;
                    }
                    int var20 = field657[arg6 >> 8];
                    arg6 += var11;
                    int var21 = ((var20 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var16 >> 8 & 0xFF00);
                    arg0[var9++] = ((arg0[var9] & 0xFF00) * var15 >> 8 & 0xFF00) + ((arg0[var9] & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var21;
                    arg0[var9++] = ((arg0[var9] & 0xFF00) * var15 >> 8 & 0xFF00) + ((arg0[var9] & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var21;
                    arg0[var9++] = ((arg0[var9] & 0xFF00) * var15 >> 8 & 0xFF00) + ((arg0[var9] & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var21;
                    arg0[var9++] = ((arg0[var9] & 0xFF00) * var15 >> 8 & 0xFF00) + ((arg0[var9] & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + var21;
                }
            }
        } else if (arg4 < arg5) {
            int var22 = (arg7 - arg6) / (arg5 - arg4);
            if (field637) {
                if (arg5 > Pix2D.field630) {
                    arg5 = Pix2D.field630;
                }
                if (arg4 < 0) {
                    arg6 -= arg4 * var22;
                    arg4 = 0;
                }
                if (arg4 >= arg5) {
                    return;
                }
            }
            int var23 = arg1 + arg4;
            int var24 = arg5 - arg4;
            if (field640 == 0) {
                do {
                    arg0[var23++] = field657[arg6 >> 8];
                    arg6 += var22;
                    var24--;
                } while (var24 > 0);
            } else {
                int var25 = field640;
                int var26 = 256 - field640;
                do {
                    int var27 = field657[arg6 >> 8];
                    arg6 += var22;
                    int var28 = ((var27 & 0xFF00FF) * var26 >> 8 & 0xFF00FF) + ((var27 & 0xFF00) * var26 >> 8 & 0xFF00);
                    arg0[var23++] = ((arg0[var23] & 0xFF00) * var25 >> 8 & 0xFF00) + ((arg0[var23] & 0xFF00FF) * var25 >> 8 & 0xFF00FF) + var28;
                    var24--;
                } while (var24 > 0);
            }
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(IIIIIII)V")
    public static final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        if (arg0 != arg1) {
            var7 = (arg4 - arg3 << 16) / (arg1 - arg0);
        }
        int var8 = 0;
        if (arg1 != arg2) {
            var8 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var9 = 0;
        if (arg0 != arg2) {
            var9 = (arg3 - arg5 << 16) / (arg0 - arg2);
        }
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < Pix2D.field627) {
                if (arg1 > Pix2D.field627) {
                    arg1 = Pix2D.field627;
                }
                if (arg2 > Pix2D.field627) {
                    arg2 = Pix2D.field627;
                }
                if (arg1 < arg2) {
                    int var10;
                    int var11 = var10 = arg3 << 16;
                    if (arg0 < 0) {
                        var11 -= arg0 * var9;
                        var10 -= arg0 * var7;
                        arg0 = 0;
                    }
                    int var12 = arg4 << 16;
                    if (arg1 < 0) {
                        var12 -= arg1 * var8;
                        arg1 = 0;
                    }
                    if (arg0 != arg1 && var9 < var7 || arg0 == arg1 && var9 > var8) {
                        int var13 = arg2 - arg1;
                        int var14 = arg1 - arg0;
                        int var15 = field647[arg0];
                        while (true) {
                            var14--;
                            if (var14 < 0) {
                                while (true) {
                                    var13--;
                                    if (var13 < 0) {
                                        return;
                                    }
                                    method191(Pix2D.field623, var15, arg6, 0, var11 >> 16, var12 >> 16);
                                    var11 += var9;
                                    var12 += var8;
                                    var15 += Pix2D.field624;
                                }
                            }
                            method191(Pix2D.field623, var15, arg6, 0, var11 >> 16, var10 >> 16);
                            var11 += var9;
                            var10 += var7;
                            var15 += Pix2D.field624;
                        }
                    } else {
                        int var16 = arg2 - arg1;
                        int var17 = arg1 - arg0;
                        int var18 = field647[arg0];
                        while (true) {
                            var17--;
                            if (var17 < 0) {
                                while (true) {
                                    var16--;
                                    if (var16 < 0) {
                                        return;
                                    }
                                    method191(Pix2D.field623, var18, arg6, 0, var12 >> 16, var11 >> 16);
                                    var11 += var9;
                                    var12 += var8;
                                    var18 += Pix2D.field624;
                                }
                            }
                            method191(Pix2D.field623, var18, arg6, 0, var10 >> 16, var11 >> 16);
                            var11 += var9;
                            var10 += var7;
                            var18 += Pix2D.field624;
                        }
                    }
                } else {
                    int var19;
                    int var20 = var19 = arg3 << 16;
                    if (arg0 < 0) {
                        var20 -= arg0 * var9;
                        var19 -= arg0 * var7;
                        arg0 = 0;
                    }
                    int var21 = arg5 << 16;
                    if (arg2 < 0) {
                        var21 -= arg2 * var8;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var9 < var7 || arg0 == arg2 && var8 > var7) {
                        int var22 = arg1 - arg2;
                        int var23 = arg2 - arg0;
                        int var24 = field647[arg0];
                        while (true) {
                            var23--;
                            if (var23 < 0) {
                                while (true) {
                                    var22--;
                                    if (var22 < 0) {
                                        return;
                                    }
                                    method191(Pix2D.field623, var24, arg6, 0, var21 >> 16, var19 >> 16);
                                    var21 += var8;
                                    var19 += var7;
                                    var24 += Pix2D.field624;
                                }
                            }
                            method191(Pix2D.field623, var24, arg6, 0, var20 >> 16, var19 >> 16);
                            var20 += var9;
                            var19 += var7;
                            var24 += Pix2D.field624;
                        }
                    } else {
                        int var25 = arg1 - arg2;
                        int var26 = arg2 - arg0;
                        int var27 = field647[arg0];
                        while (true) {
                            var26--;
                            if (var26 < 0) {
                                while (true) {
                                    var25--;
                                    if (var25 < 0) {
                                        return;
                                    }
                                    method191(Pix2D.field623, var27, arg6, 0, var19 >> 16, var21 >> 16);
                                    var21 += var8;
                                    var19 += var7;
                                    var27 += Pix2D.field624;
                                }
                            }
                            method191(Pix2D.field623, var27, arg6, 0, var19 >> 16, var20 >> 16);
                            var20 += var9;
                            var19 += var7;
                            var27 += Pix2D.field624;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < Pix2D.field627) {
                if (arg2 > Pix2D.field627) {
                    arg2 = Pix2D.field627;
                }
                if (arg0 > Pix2D.field627) {
                    arg0 = Pix2D.field627;
                }
                if (arg2 < arg0) {
                    int var28;
                    int var29 = var28 = arg4 << 16;
                    if (arg1 < 0) {
                        var29 -= arg1 * var7;
                        var28 -= arg1 * var8;
                        arg1 = 0;
                    }
                    int var30 = arg5 << 16;
                    if (arg2 < 0) {
                        var30 -= arg2 * var9;
                        arg2 = 0;
                    }
                    if (arg1 != arg2 && var7 < var8 || arg1 == arg2 && var7 > var9) {
                        int var31 = arg0 - arg2;
                        int var32 = arg2 - arg1;
                        int var33 = field647[arg1];
                        while (true) {
                            var32--;
                            if (var32 < 0) {
                                while (true) {
                                    var31--;
                                    if (var31 < 0) {
                                        return;
                                    }
                                    method191(Pix2D.field623, var33, arg6, 0, var29 >> 16, var30 >> 16);
                                    var29 += var7;
                                    var30 += var9;
                                    var33 += Pix2D.field624;
                                }
                            }
                            method191(Pix2D.field623, var33, arg6, 0, var29 >> 16, var28 >> 16);
                            var29 += var7;
                            var28 += var8;
                            var33 += Pix2D.field624;
                        }
                    } else {
                        int var34 = arg0 - arg2;
                        int var35 = arg2 - arg1;
                        int var36 = field647[arg1];
                        while (true) {
                            var35--;
                            if (var35 < 0) {
                                while (true) {
                                    var34--;
                                    if (var34 < 0) {
                                        return;
                                    }
                                    method191(Pix2D.field623, var36, arg6, 0, var30 >> 16, var29 >> 16);
                                    var29 += var7;
                                    var30 += var9;
                                    var36 += Pix2D.field624;
                                }
                            }
                            method191(Pix2D.field623, var36, arg6, 0, var28 >> 16, var29 >> 16);
                            var29 += var7;
                            var28 += var8;
                            var36 += Pix2D.field624;
                        }
                    }
                } else {
                    int var37;
                    int var38 = var37 = arg4 << 16;
                    if (arg1 < 0) {
                        var38 -= arg1 * var7;
                        var37 -= arg1 * var8;
                        arg1 = 0;
                    }
                    int var39 = arg3 << 16;
                    if (arg0 < 0) {
                        var39 -= arg0 * var9;
                        arg0 = 0;
                    }
                    if (var7 < var8) {
                        int var40 = arg2 - arg0;
                        int var41 = arg0 - arg1;
                        int var42 = field647[arg1];
                        while (true) {
                            var41--;
                            if (var41 < 0) {
                                while (true) {
                                    var40--;
                                    if (var40 < 0) {
                                        return;
                                    }
                                    method191(Pix2D.field623, var42, arg6, 0, var39 >> 16, var37 >> 16);
                                    var39 += var9;
                                    var37 += var8;
                                    var42 += Pix2D.field624;
                                }
                            }
                            method191(Pix2D.field623, var42, arg6, 0, var38 >> 16, var37 >> 16);
                            var38 += var7;
                            var37 += var8;
                            var42 += Pix2D.field624;
                        }
                    } else {
                        int var43 = arg2 - arg0;
                        int var44 = arg0 - arg1;
                        int var45 = field647[arg1];
                        while (true) {
                            var44--;
                            if (var44 < 0) {
                                while (true) {
                                    var43--;
                                    if (var43 < 0) {
                                        return;
                                    }
                                    method191(Pix2D.field623, var45, arg6, 0, var37 >> 16, var39 >> 16);
                                    var39 += var9;
                                    var37 += var8;
                                    var45 += Pix2D.field624;
                                }
                            }
                            method191(Pix2D.field623, var45, arg6, 0, var37 >> 16, var38 >> 16);
                            var38 += var7;
                            var37 += var8;
                            var45 += Pix2D.field624;
                        }
                    }
                }
            }
        } else if (arg2 < Pix2D.field627) {
            if (arg0 > Pix2D.field627) {
                arg0 = Pix2D.field627;
            }
            if (arg1 > Pix2D.field627) {
                arg1 = Pix2D.field627;
            }
            if (arg0 < arg1) {
                int var46;
                int var47 = var46 = arg5 << 16;
                if (arg2 < 0) {
                    var47 -= arg2 * var8;
                    var46 -= arg2 * var9;
                    arg2 = 0;
                }
                int var48 = arg3 << 16;
                if (arg0 < 0) {
                    var48 -= arg0 * var7;
                    arg0 = 0;
                }
                if (var8 < var9) {
                    int var49 = arg1 - arg0;
                    int var50 = arg0 - arg2;
                    int var51 = field647[arg2];
                    while (true) {
                        var50--;
                        if (var50 < 0) {
                            while (true) {
                                var49--;
                                if (var49 < 0) {
                                    return;
                                }
                                method191(Pix2D.field623, var51, arg6, 0, var47 >> 16, var48 >> 16);
                                var47 += var8;
                                var48 += var7;
                                var51 += Pix2D.field624;
                            }
                        }
                        method191(Pix2D.field623, var51, arg6, 0, var47 >> 16, var46 >> 16);
                        var47 += var8;
                        var46 += var9;
                        var51 += Pix2D.field624;
                    }
                } else {
                    int var52 = arg1 - arg0;
                    int var53 = arg0 - arg2;
                    int var54 = field647[arg2];
                    while (true) {
                        var53--;
                        if (var53 < 0) {
                            while (true) {
                                var52--;
                                if (var52 < 0) {
                                    return;
                                }
                                method191(Pix2D.field623, var54, arg6, 0, var48 >> 16, var47 >> 16);
                                var47 += var8;
                                var48 += var7;
                                var54 += Pix2D.field624;
                            }
                        }
                        method191(Pix2D.field623, var54, arg6, 0, var46 >> 16, var47 >> 16);
                        var47 += var8;
                        var46 += var9;
                        var54 += Pix2D.field624;
                    }
                }
            } else {
                int var55;
                int var56 = var55 = arg5 << 16;
                if (arg2 < 0) {
                    var56 -= arg2 * var8;
                    var55 -= arg2 * var9;
                    arg2 = 0;
                }
                int var57 = arg4 << 16;
                if (arg1 < 0) {
                    var57 -= arg1 * var7;
                    arg1 = 0;
                }
                if (var8 < var9) {
                    int var58 = arg0 - arg1;
                    int var59 = arg1 - arg2;
                    int var60 = field647[arg2];
                    while (true) {
                        var59--;
                        if (var59 < 0) {
                            while (true) {
                                var58--;
                                if (var58 < 0) {
                                    return;
                                }
                                method191(Pix2D.field623, var60, arg6, 0, var57 >> 16, var55 >> 16);
                                var57 += var7;
                                var55 += var9;
                                var60 += Pix2D.field624;
                            }
                        }
                        method191(Pix2D.field623, var60, arg6, 0, var56 >> 16, var55 >> 16);
                        var56 += var8;
                        var55 += var9;
                        var60 += Pix2D.field624;
                    }
                } else {
                    int var61 = arg0 - arg1;
                    int var62 = arg1 - arg2;
                    int var63 = field647[arg2];
                    while (true) {
                        var62--;
                        if (var62 < 0) {
                            while (true) {
                                var61--;
                                if (var61 < 0) {
                                    return;
                                }
                                method191(Pix2D.field623, var63, arg6, 0, var55 >> 16, var57 >> 16);
                                var57 += var7;
                                var55 += var9;
                                var63 += Pix2D.field624;
                            }
                        }
                        method191(Pix2D.field623, var63, arg6, 0, var55 >> 16, var56 >> 16);
                        var56 += var8;
                        var55 += var9;
                        var63 += Pix2D.field624;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([IIIIII)V")
    public static final void method191(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field637) {
            if (arg5 > Pix2D.field630) {
                arg5 = Pix2D.field630;
            }
            if (arg4 < 0) {
                arg4 = 0;
            }
        }
        if (arg4 >= arg5) {
            return;
        }
        int var6 = arg1 + arg4;
        int var7 = arg5 - arg4 >> 2;
        if (field640 == 0) {
            while (true) {
                var7--;
                if (var7 < 0) {
                    int var8 = arg5 - arg4 & 0x3;
                    while (true) {
                        var8--;
                        if (var8 < 0) {
                            return;
                        }
                        arg0[var6++] = arg2;
                    }
                }
                arg0[var6++] = arg2;
                arg0[var6++] = arg2;
                arg0[var6++] = arg2;
                arg0[var6++] = arg2;
            }
        }
        int var9 = field640;
        int var10 = 256 - field640;
        int var11 = ((arg2 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * var10 >> 8 & 0xFF00);
        while (true) {
            var7--;
            if (var7 < 0) {
                int var12 = arg5 - arg4 & 0x3;
                while (true) {
                    var12--;
                    if (var12 < 0) {
                        return;
                    }
                    arg0[var6++] = ((arg0[var6] & 0xFF00) * var9 >> 8 & 0xFF00) + ((arg0[var6] & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + var11;
                }
            }
            arg0[var6++] = ((arg0[var6] & 0xFF00) * var9 >> 8 & 0xFF00) + ((arg0[var6] & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + var11;
            arg0[var6++] = ((arg0[var6] & 0xFF00) * var9 >> 8 & 0xFF00) + ((arg0[var6] & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + var11;
            arg0[var6++] = ((arg0[var6] & 0xFF00) * var9 >> 8 & 0xFF00) + ((arg0[var6] & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + var11;
            arg0[var6++] = ((arg0[var6] & 0xFF00) * var9 >> 8 & 0xFF00) + ((arg0[var6] & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + var11;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
    public static final void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        int[] var19 = method185(arg18);
        field638 = !field650[arg18];
        int var20 = arg9 - arg10;
        int var21 = arg12 - arg13;
        int var22 = arg15 - arg16;
        int var23 = arg11 - arg9;
        int var24 = arg14 - arg12;
        int var25 = arg17 - arg15;
        int var26 = arg12 * var23 - arg9 * var24 << 14;
        int var27 = arg15 * var24 - arg12 * var25 << 8;
        int var28 = arg9 * var25 - arg15 * var23 << 5;
        int var29 = arg12 * var20 - arg9 * var21 << 14;
        int var30 = arg15 * var21 - arg12 * var22 << 8;
        int var31 = arg9 * var22 - arg15 * var20 << 5;
        int var32 = var21 * var23 - var20 * var24 << 14;
        int var33 = var22 * var24 - var21 * var25 << 8;
        int var34 = var20 * var25 - var22 * var23 << 5;
        int var35 = 0;
        int var36 = 0;
        if (arg0 != arg1) {
            var35 = (arg4 - arg3 << 16) / (arg1 - arg0);
            var36 = (arg7 - arg6 << 16) / (arg1 - arg0);
        }
        int var37 = 0;
        int var38 = 0;
        if (arg1 != arg2) {
            var37 = (arg5 - arg4 << 16) / (arg2 - arg1);
            var38 = (arg8 - arg7 << 16) / (arg2 - arg1);
        }
        int var39 = 0;
        int var40 = 0;
        if (arg0 != arg2) {
            var39 = (arg3 - arg5 << 16) / (arg0 - arg2);
            var40 = (arg6 - arg8 << 16) / (arg0 - arg2);
        }
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < Pix2D.field627) {
                if (arg1 > Pix2D.field627) {
                    arg1 = Pix2D.field627;
                }
                if (arg2 > Pix2D.field627) {
                    arg2 = Pix2D.field627;
                }
                if (arg1 < arg2) {
                    int var41;
                    int var42 = var41 = arg3 << 16;
                    int var43;
                    int var44 = var43 = arg6 << 16;
                    if (arg0 < 0) {
                        var42 -= arg0 * var39;
                        var41 -= arg0 * var35;
                        var44 -= arg0 * var40;
                        var43 -= arg0 * var36;
                        arg0 = 0;
                    }
                    int var45 = arg4 << 16;
                    int var46 = arg7 << 16;
                    if (arg1 < 0) {
                        var45 -= arg1 * var37;
                        var46 -= arg1 * var38;
                        arg1 = 0;
                    }
                    int var47 = arg0 - field642;
                    int var48 = var28 * var47 + var26;
                    int var49 = var31 * var47 + var29;
                    int var50 = var34 * var47 + var32;
                    if (arg0 != arg1 && var39 < var35 || arg0 == arg1 && var39 > var37) {
                        int var51 = arg2 - arg1;
                        int var52 = arg1 - arg0;
                        int var53 = field647[arg0];
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return;
                                    }
                                    method193(Pix2D.field623, var19, 0, 0, var53, var42 >> 16, var45 >> 16, var44 >> 8, var46 >> 8, var48, var49, var50, var27, var30, var33);
                                    var42 += var39;
                                    var45 += var37;
                                    var44 += var40;
                                    var46 += var38;
                                    var53 += Pix2D.field624;
                                    var48 += var28;
                                    var49 += var31;
                                    var50 += var34;
                                }
                            }
                            method193(Pix2D.field623, var19, 0, 0, var53, var42 >> 16, var41 >> 16, var44 >> 8, var43 >> 8, var48, var49, var50, var27, var30, var33);
                            var42 += var39;
                            var41 += var35;
                            var44 += var40;
                            var43 += var36;
                            var53 += Pix2D.field624;
                            var48 += var28;
                            var49 += var31;
                            var50 += var34;
                        }
                    } else {
                        int var54 = arg2 - arg1;
                        int var55 = arg1 - arg0;
                        int var56 = field647[arg0];
                        while (true) {
                            var55--;
                            if (var55 < 0) {
                                while (true) {
                                    var54--;
                                    if (var54 < 0) {
                                        return;
                                    }
                                    method193(Pix2D.field623, var19, 0, 0, var56, var45 >> 16, var42 >> 16, var46 >> 8, var44 >> 8, var48, var49, var50, var27, var30, var33);
                                    var42 += var39;
                                    var45 += var37;
                                    var44 += var40;
                                    var46 += var38;
                                    var56 += Pix2D.field624;
                                    var48 += var28;
                                    var49 += var31;
                                    var50 += var34;
                                }
                            }
                            method193(Pix2D.field623, var19, 0, 0, var56, var41 >> 16, var42 >> 16, var43 >> 8, var44 >> 8, var48, var49, var50, var27, var30, var33);
                            var42 += var39;
                            var41 += var35;
                            var44 += var40;
                            var43 += var36;
                            var56 += Pix2D.field624;
                            var48 += var28;
                            var49 += var31;
                            var50 += var34;
                        }
                    }
                } else {
                    int var57;
                    int var58 = var57 = arg3 << 16;
                    int var59;
                    int var60 = var59 = arg6 << 16;
                    if (arg0 < 0) {
                        var58 -= arg0 * var39;
                        var57 -= arg0 * var35;
                        var60 -= arg0 * var40;
                        var59 -= arg0 * var36;
                        arg0 = 0;
                    }
                    int var61 = arg5 << 16;
                    int var62 = arg8 << 16;
                    if (arg2 < 0) {
                        var61 -= arg2 * var37;
                        var62 -= arg2 * var38;
                        arg2 = 0;
                    }
                    int var63 = arg0 - field642;
                    int var64 = var28 * var63 + var26;
                    int var65 = var31 * var63 + var29;
                    int var66 = var34 * var63 + var32;
                    if ((arg0 == arg2 || var39 >= var35) && (arg0 != arg2 || var37 <= var35)) {
                        int var70 = arg1 - arg2;
                        int var71 = arg2 - arg0;
                        int var72 = field647[arg0];
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return;
                                    }
                                    method193(Pix2D.field623, var19, 0, 0, var72, var57 >> 16, var61 >> 16, var59 >> 8, var62 >> 8, var64, var65, var66, var27, var30, var33);
                                    var61 += var37;
                                    var57 += var35;
                                    var62 += var38;
                                    var59 += var36;
                                    var72 += Pix2D.field624;
                                    var64 += var28;
                                    var65 += var31;
                                    var66 += var34;
                                }
                            }
                            method193(Pix2D.field623, var19, 0, 0, var72, var57 >> 16, var58 >> 16, var59 >> 8, var60 >> 8, var64, var65, var66, var27, var30, var33);
                            var58 += var39;
                            var57 += var35;
                            var60 += var40;
                            var59 += var36;
                            var72 += Pix2D.field624;
                            var64 += var28;
                            var65 += var31;
                            var66 += var34;
                        }
                    } else {
                        int var67 = arg1 - arg2;
                        int var68 = arg2 - arg0;
                        int var69 = field647[arg0];
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return;
                                    }
                                    method193(Pix2D.field623, var19, 0, 0, var69, var61 >> 16, var57 >> 16, var62 >> 8, var59 >> 8, var64, var65, var66, var27, var30, var33);
                                    var61 += var37;
                                    var57 += var35;
                                    var62 += var38;
                                    var59 += var36;
                                    var69 += Pix2D.field624;
                                    var64 += var28;
                                    var65 += var31;
                                    var66 += var34;
                                }
                            }
                            method193(Pix2D.field623, var19, 0, 0, var69, var58 >> 16, var57 >> 16, var60 >> 8, var59 >> 8, var64, var65, var66, var27, var30, var33);
                            var58 += var39;
                            var57 += var35;
                            var60 += var40;
                            var59 += var36;
                            var69 += Pix2D.field624;
                            var64 += var28;
                            var65 += var31;
                            var66 += var34;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < Pix2D.field627) {
                if (arg2 > Pix2D.field627) {
                    arg2 = Pix2D.field627;
                }
                if (arg0 > Pix2D.field627) {
                    arg0 = Pix2D.field627;
                }
                if (arg2 < arg0) {
                    int var73;
                    int var74 = var73 = arg4 << 16;
                    int var75;
                    int var76 = var75 = arg7 << 16;
                    if (arg1 < 0) {
                        var74 -= arg1 * var35;
                        var73 -= arg1 * var37;
                        var76 -= arg1 * var36;
                        var75 -= arg1 * var38;
                        arg1 = 0;
                    }
                    int var77 = arg5 << 16;
                    int var78 = arg8 << 16;
                    if (arg2 < 0) {
                        var77 -= arg2 * var39;
                        var78 -= arg2 * var40;
                        arg2 = 0;
                    }
                    int var79 = arg1 - field642;
                    int var80 = var28 * var79 + var26;
                    int var81 = var31 * var79 + var29;
                    int var82 = var34 * var79 + var32;
                    if (arg1 != arg2 && var35 < var37 || arg1 == arg2 && var35 > var39) {
                        int var83 = arg0 - arg2;
                        int var84 = arg2 - arg1;
                        int var85 = field647[arg1];
                        while (true) {
                            var84--;
                            if (var84 < 0) {
                                while (true) {
                                    var83--;
                                    if (var83 < 0) {
                                        return;
                                    }
                                    method193(Pix2D.field623, var19, 0, 0, var85, var74 >> 16, var77 >> 16, var76 >> 8, var78 >> 8, var80, var81, var82, var27, var30, var33);
                                    var74 += var35;
                                    var77 += var39;
                                    var76 += var36;
                                    var78 += var40;
                                    var85 += Pix2D.field624;
                                    var80 += var28;
                                    var81 += var31;
                                    var82 += var34;
                                }
                            }
                            method193(Pix2D.field623, var19, 0, 0, var85, var74 >> 16, var73 >> 16, var76 >> 8, var75 >> 8, var80, var81, var82, var27, var30, var33);
                            var74 += var35;
                            var73 += var37;
                            var76 += var36;
                            var75 += var38;
                            var85 += Pix2D.field624;
                            var80 += var28;
                            var81 += var31;
                            var82 += var34;
                        }
                    } else {
                        int var86 = arg0 - arg2;
                        int var87 = arg2 - arg1;
                        int var88 = field647[arg1];
                        while (true) {
                            var87--;
                            if (var87 < 0) {
                                while (true) {
                                    var86--;
                                    if (var86 < 0) {
                                        return;
                                    }
                                    method193(Pix2D.field623, var19, 0, 0, var88, var77 >> 16, var74 >> 16, var78 >> 8, var76 >> 8, var80, var81, var82, var27, var30, var33);
                                    var74 += var35;
                                    var77 += var39;
                                    var76 += var36;
                                    var78 += var40;
                                    var88 += Pix2D.field624;
                                    var80 += var28;
                                    var81 += var31;
                                    var82 += var34;
                                }
                            }
                            method193(Pix2D.field623, var19, 0, 0, var88, var73 >> 16, var74 >> 16, var75 >> 8, var76 >> 8, var80, var81, var82, var27, var30, var33);
                            var74 += var35;
                            var73 += var37;
                            var76 += var36;
                            var75 += var38;
                            var88 += Pix2D.field624;
                            var80 += var28;
                            var81 += var31;
                            var82 += var34;
                        }
                    }
                } else {
                    int var89;
                    int var90 = var89 = arg4 << 16;
                    int var91;
                    int var92 = var91 = arg7 << 16;
                    if (arg1 < 0) {
                        var90 -= arg1 * var35;
                        var89 -= arg1 * var37;
                        var92 -= arg1 * var36;
                        var91 -= arg1 * var38;
                        arg1 = 0;
                    }
                    int var93 = arg3 << 16;
                    int var94 = arg6 << 16;
                    if (arg0 < 0) {
                        var93 -= arg0 * var39;
                        var94 -= arg0 * var40;
                        arg0 = 0;
                    }
                    int var95 = arg1 - field642;
                    int var96 = var28 * var95 + var26;
                    int var97 = var31 * var95 + var29;
                    int var98 = var34 * var95 + var32;
                    if (var35 < var37) {
                        int var99 = arg2 - arg0;
                        int var100 = arg0 - arg1;
                        int var101 = field647[arg1];
                        while (true) {
                            var100--;
                            if (var100 < 0) {
                                while (true) {
                                    var99--;
                                    if (var99 < 0) {
                                        return;
                                    }
                                    method193(Pix2D.field623, var19, 0, 0, var101, var93 >> 16, var89 >> 16, var94 >> 8, var91 >> 8, var96, var97, var98, var27, var30, var33);
                                    var93 += var39;
                                    var89 += var37;
                                    var94 += var40;
                                    var91 += var38;
                                    var101 += Pix2D.field624;
                                    var96 += var28;
                                    var97 += var31;
                                    var98 += var34;
                                }
                            }
                            method193(Pix2D.field623, var19, 0, 0, var101, var90 >> 16, var89 >> 16, var92 >> 8, var91 >> 8, var96, var97, var98, var27, var30, var33);
                            var90 += var35;
                            var89 += var37;
                            var92 += var36;
                            var91 += var38;
                            var101 += Pix2D.field624;
                            var96 += var28;
                            var97 += var31;
                            var98 += var34;
                        }
                    } else {
                        int var102 = arg2 - arg0;
                        int var103 = arg0 - arg1;
                        int var104 = field647[arg1];
                        while (true) {
                            var103--;
                            if (var103 < 0) {
                                while (true) {
                                    var102--;
                                    if (var102 < 0) {
                                        return;
                                    }
                                    method193(Pix2D.field623, var19, 0, 0, var104, var89 >> 16, var93 >> 16, var91 >> 8, var94 >> 8, var96, var97, var98, var27, var30, var33);
                                    var93 += var39;
                                    var89 += var37;
                                    var94 += var40;
                                    var91 += var38;
                                    var104 += Pix2D.field624;
                                    var96 += var28;
                                    var97 += var31;
                                    var98 += var34;
                                }
                            }
                            method193(Pix2D.field623, var19, 0, 0, var104, var89 >> 16, var90 >> 16, var91 >> 8, var92 >> 8, var96, var97, var98, var27, var30, var33);
                            var90 += var35;
                            var89 += var37;
                            var92 += var36;
                            var91 += var38;
                            var104 += Pix2D.field624;
                            var96 += var28;
                            var97 += var31;
                            var98 += var34;
                        }
                    }
                }
            }
        } else if (arg2 < Pix2D.field627) {
            if (arg0 > Pix2D.field627) {
                arg0 = Pix2D.field627;
            }
            if (arg1 > Pix2D.field627) {
                arg1 = Pix2D.field627;
            }
            if (arg0 < arg1) {
                int var105;
                int var106 = var105 = arg5 << 16;
                int var107;
                int var108 = var107 = arg8 << 16;
                if (arg2 < 0) {
                    var106 -= arg2 * var37;
                    var105 -= arg2 * var39;
                    var108 -= arg2 * var38;
                    var107 -= arg2 * var40;
                    arg2 = 0;
                }
                int var109 = arg3 << 16;
                int var110 = arg6 << 16;
                if (arg0 < 0) {
                    var109 -= arg0 * var35;
                    var110 -= arg0 * var36;
                    arg0 = 0;
                }
                int var111 = arg2 - field642;
                int var112 = var28 * var111 + var26;
                int var113 = var31 * var111 + var29;
                int var114 = var34 * var111 + var32;
                if (var37 < var39) {
                    int var115 = arg1 - arg0;
                    int var116 = arg0 - arg2;
                    int var117 = field647[arg2];
                    while (true) {
                        var116--;
                        if (var116 < 0) {
                            while (true) {
                                var115--;
                                if (var115 < 0) {
                                    return;
                                }
                                method193(Pix2D.field623, var19, 0, 0, var117, var106 >> 16, var109 >> 16, var108 >> 8, var110 >> 8, var112, var113, var114, var27, var30, var33);
                                var106 += var37;
                                var109 += var35;
                                var108 += var38;
                                var110 += var36;
                                var117 += Pix2D.field624;
                                var112 += var28;
                                var113 += var31;
                                var114 += var34;
                            }
                        }
                        method193(Pix2D.field623, var19, 0, 0, var117, var106 >> 16, var105 >> 16, var108 >> 8, var107 >> 8, var112, var113, var114, var27, var30, var33);
                        var106 += var37;
                        var105 += var39;
                        var108 += var38;
                        var107 += var40;
                        var117 += Pix2D.field624;
                        var112 += var28;
                        var113 += var31;
                        var114 += var34;
                    }
                } else {
                    int var118 = arg1 - arg0;
                    int var119 = arg0 - arg2;
                    int var120 = field647[arg2];
                    while (true) {
                        var119--;
                        if (var119 < 0) {
                            while (true) {
                                var118--;
                                if (var118 < 0) {
                                    return;
                                }
                                method193(Pix2D.field623, var19, 0, 0, var120, var109 >> 16, var106 >> 16, var110 >> 8, var108 >> 8, var112, var113, var114, var27, var30, var33);
                                var106 += var37;
                                var109 += var35;
                                var108 += var38;
                                var110 += var36;
                                var120 += Pix2D.field624;
                                var112 += var28;
                                var113 += var31;
                                var114 += var34;
                            }
                        }
                        method193(Pix2D.field623, var19, 0, 0, var120, var105 >> 16, var106 >> 16, var107 >> 8, var108 >> 8, var112, var113, var114, var27, var30, var33);
                        var106 += var37;
                        var105 += var39;
                        var108 += var38;
                        var107 += var40;
                        var120 += Pix2D.field624;
                        var112 += var28;
                        var113 += var31;
                        var114 += var34;
                    }
                }
            } else {
                int var121;
                int var122 = var121 = arg5 << 16;
                int var123;
                int var124 = var123 = arg8 << 16;
                if (arg2 < 0) {
                    var122 -= arg2 * var37;
                    var121 -= arg2 * var39;
                    var124 -= arg2 * var38;
                    var123 -= arg2 * var40;
                    arg2 = 0;
                }
                int var125 = arg4 << 16;
                int var126 = arg7 << 16;
                if (arg1 < 0) {
                    var125 -= arg1 * var35;
                    var126 -= arg1 * var36;
                    arg1 = 0;
                }
                int var127 = arg2 - field642;
                int var128 = var28 * var127 + var26;
                int var129 = var31 * var127 + var29;
                int var130 = var34 * var127 + var32;
                if (var37 < var39) {
                    int var131 = arg0 - arg1;
                    int var132 = arg1 - arg2;
                    int var133 = field647[arg2];
                    while (true) {
                        var132--;
                        if (var132 < 0) {
                            while (true) {
                                var131--;
                                if (var131 < 0) {
                                    return;
                                }
                                method193(Pix2D.field623, var19, 0, 0, var133, var125 >> 16, var121 >> 16, var126 >> 8, var123 >> 8, var128, var129, var130, var27, var30, var33);
                                var125 += var35;
                                var121 += var39;
                                var126 += var36;
                                var123 += var40;
                                var133 += Pix2D.field624;
                                var128 += var28;
                                var129 += var31;
                                var130 += var34;
                            }
                        }
                        method193(Pix2D.field623, var19, 0, 0, var133, var122 >> 16, var121 >> 16, var124 >> 8, var123 >> 8, var128, var129, var130, var27, var30, var33);
                        var122 += var37;
                        var121 += var39;
                        var124 += var38;
                        var123 += var40;
                        var133 += Pix2D.field624;
                        var128 += var28;
                        var129 += var31;
                        var130 += var34;
                    }
                } else {
                    int var134 = arg0 - arg1;
                    int var135 = arg1 - arg2;
                    int var136 = field647[arg2];
                    while (true) {
                        var135--;
                        if (var135 < 0) {
                            while (true) {
                                var134--;
                                if (var134 < 0) {
                                    return;
                                }
                                method193(Pix2D.field623, var19, 0, 0, var136, var121 >> 16, var125 >> 16, var123 >> 8, var126 >> 8, var128, var129, var130, var27, var30, var33);
                                var125 += var35;
                                var121 += var39;
                                var126 += var36;
                                var123 += var40;
                                var136 += Pix2D.field624;
                                var128 += var28;
                                var129 += var31;
                                var130 += var34;
                            }
                        }
                        method193(Pix2D.field623, var19, 0, 0, var136, var121 >> 16, var122 >> 16, var123 >> 8, var124 >> 8, var128, var129, var130, var27, var30, var33);
                        var122 += var37;
                        var121 += var39;
                        var124 += var38;
                        var123 += var40;
                        var136 += Pix2D.field624;
                        var128 += var28;
                        var129 += var31;
                        var130 += var34;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
    public static final void method193(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if (arg5 >= arg6) {
            return;
        }
        int var16;
        int var17;
        int var18;
        if (field637) {
            int var15 = (arg8 - arg7) / (arg6 - arg5);
            if (arg6 > Pix2D.field630) {
                arg6 = Pix2D.field630;
            }
            if (arg5 < 0) {
                arg7 -= arg5 * var15;
                arg5 = 0;
            }
            if (arg5 >= arg6) {
                return;
            }
            var16 = arg6 - arg5 >> 3;
            var17 = var15 << 12;
            var18 = arg7 << 9;
        } else {
            if (arg6 - arg5 > 7) {
                var16 = arg6 - arg5 >> 3;
                var17 = (arg8 - arg7) * field643[var16] >> 6;
            } else {
                var16 = 0;
                var17 = 0;
            }
            var18 = arg7 << 9;
        }
        int var19 = arg4 + arg5;
        if (!field636) {
            int var78 = 0;
            int var79 = 0;
            int var80 = arg5 - field641;
            int var81 = (arg12 >> 3) * var80 + arg9;
            int var82 = (arg13 >> 3) * var80 + arg10;
            int var83 = (arg14 >> 3) * var80 + arg11;
            int var84 = var83 >> 14;
            if (var84 != 0) {
                arg2 = var81 / var84;
                arg3 = var82 / var84;
                if (arg2 < 0) {
                    arg2 = 0;
                } else if (arg2 > 16256) {
                    arg2 = 16256;
                }
            }
            int var85 = arg12 + var81;
            int var86 = arg13 + var82;
            int var87 = arg14 + var83;
            int var88 = var87 >> 14;
            if (var88 != 0) {
                var78 = var85 / var88;
                var79 = var86 / var88;
                if (var78 < 7) {
                    var78 = 7;
                } else if (var78 > 16256) {
                    var78 = 16256;
                }
            }
            int var89 = var78 - arg2 >> 3;
            int var90 = var79 - arg3 >> 3;
            int var91 = (var18 & 0x600000) + arg2;
            int var92 = var18 >> 23;
            if (field638) {
                while (var16-- > 0) {
                    arg0[var19++] = arg1[(var91 >> 7) + (arg3 & 0x3F80)] >>> var92;
                    int var94 = var89 + var91;
                    int var95 = arg3 + var90;
                    arg0[var19++] = arg1[(var94 >> 7) + (var95 & 0x3F80)] >>> var92;
                    int var96 = var89 + var94;
                    int var97 = var90 + var95;
                    arg0[var19++] = arg1[(var96 >> 7) + (var97 & 0x3F80)] >>> var92;
                    int var98 = var89 + var96;
                    int var99 = var90 + var97;
                    arg0[var19++] = arg1[(var98 >> 7) + (var99 & 0x3F80)] >>> var92;
                    int var100 = var89 + var98;
                    int var101 = var90 + var99;
                    arg0[var19++] = arg1[(var100 >> 7) + (var101 & 0x3F80)] >>> var92;
                    int var102 = var89 + var100;
                    int var103 = var90 + var101;
                    arg0[var19++] = arg1[(var102 >> 7) + (var103 & 0x3F80)] >>> var92;
                    int var104 = var89 + var102;
                    int var105 = var90 + var103;
                    arg0[var19++] = arg1[(var104 >> 7) + (var105 & 0x3F80)] >>> var92;
                    int var106 = var89 + var104;
                    int var107 = var90 + var105;
                    arg0[var19++] = arg1[(var106 >> 7) + (var107 & 0x3F80)] >>> var92;
                    int var108 = var78;
                    arg3 = var79;
                    var85 += arg12;
                    var86 += arg13;
                    var87 += arg14;
                    int var109 = var87 >> 14;
                    if (var109 != 0) {
                        var78 = var85 / var109;
                        var79 = var86 / var109;
                        if (var78 < 7) {
                            var78 = 7;
                        } else if (var78 > 16256) {
                            var78 = 16256;
                        }
                    }
                    var89 = var78 - var108 >> 3;
                    var90 = var79 - arg3 >> 3;
                    var18 += var17;
                    var91 = (var18 & 0x600000) + var108;
                    var92 = var18 >> 23;
                }
                int var93 = arg6 - arg5 & 0x7;
                while (var93-- > 0) {
                    arg0[var19++] = arg1[(var91 >> 7) + (arg3 & 0x3F80)] >>> var92;
                    var91 += var89;
                    arg3 += var90;
                }
            } else {
                while (var16-- > 0) {
                    int var112;
                    if ((var112 = arg1[(var91 >> 7) + (arg3 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var112;
                    }
                    var19++;
                    int var113 = var89 + var91;
                    int var114 = arg3 + var90;
                    int var115;
                    if ((var115 = arg1[(var113 >> 7) + (var114 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var115;
                    }
                    var19++;
                    int var116 = var89 + var113;
                    int var117 = var90 + var114;
                    int var118;
                    if ((var118 = arg1[(var116 >> 7) + (var117 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var118;
                    }
                    var19++;
                    int var119 = var89 + var116;
                    int var120 = var90 + var117;
                    int var121;
                    if ((var121 = arg1[(var119 >> 7) + (var120 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var121;
                    }
                    var19++;
                    int var122 = var89 + var119;
                    int var123 = var90 + var120;
                    int var124;
                    if ((var124 = arg1[(var122 >> 7) + (var123 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var124;
                    }
                    var19++;
                    int var125 = var89 + var122;
                    int var126 = var90 + var123;
                    int var127;
                    if ((var127 = arg1[(var125 >> 7) + (var126 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var127;
                    }
                    var19++;
                    int var128 = var89 + var125;
                    int var129 = var90 + var126;
                    int var130;
                    if ((var130 = arg1[(var128 >> 7) + (var129 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var130;
                    }
                    var19++;
                    int var131 = var89 + var128;
                    int var132 = var90 + var129;
                    int var133;
                    if ((var133 = arg1[(var131 >> 7) + (var132 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var133;
                    }
                    var19++;
                    int var134 = var78;
                    arg3 = var79;
                    var85 += arg12;
                    var86 += arg13;
                    var87 += arg14;
                    int var135 = var87 >> 14;
                    if (var135 != 0) {
                        var78 = var85 / var135;
                        var79 = var86 / var135;
                        if (var78 < 7) {
                            var78 = 7;
                        } else if (var78 > 16256) {
                            var78 = 16256;
                        }
                    }
                    var89 = var78 - var134 >> 3;
                    var90 = var79 - arg3 >> 3;
                    var18 += var17;
                    var91 = (var18 & 0x600000) + var134;
                    var92 = var18 >> 23;
                }
                int var110 = arg6 - arg5 & 0x7;
                while (var110-- > 0) {
                    int var111;
                    if ((var111 = arg1[(var91 >> 7) + (arg3 & 0x3F80)] >>> var92) != 0) {
                        arg0[var19] = var111;
                    }
                    var19++;
                    var91 += var89;
                    arg3 += var90;
                }
            }
            return;
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = arg5 - field641;
        int var23 = (arg12 >> 3) * var22 + arg9;
        int var24 = (arg13 >> 3) * var22 + arg10;
        int var25 = (arg14 >> 3) * var22 + arg11;
        int var26 = var25 >> 12;
        if (var26 != 0) {
            arg2 = var23 / var26;
            arg3 = var24 / var26;
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 4032) {
                arg2 = 4032;
            }
        }
        int var27 = arg12 + var23;
        int var28 = arg13 + var24;
        int var29 = arg14 + var25;
        int var30 = var29 >> 12;
        if (var30 != 0) {
            var20 = var27 / var30;
            var21 = var28 / var30;
            if (var20 < 7) {
                var20 = 7;
            } else if (var20 > 4032) {
                var20 = 4032;
            }
        }
        int var31 = var20 - arg2 >> 3;
        int var32 = var21 - arg3 >> 3;
        int var33 = (var18 >> 3 & 0xC0000) + arg2;
        int var34 = var18 >> 23;
        if (field638) {
            while (var16-- > 0) {
                arg0[var19++] = arg1[(var33 >> 6) + (arg3 & 0xFC0)] >>> var34;
                int var36 = var31 + var33;
                int var37 = arg3 + var32;
                arg0[var19++] = arg1[(var36 >> 6) + (var37 & 0xFC0)] >>> var34;
                int var38 = var31 + var36;
                int var39 = var32 + var37;
                arg0[var19++] = arg1[(var38 >> 6) + (var39 & 0xFC0)] >>> var34;
                int var40 = var31 + var38;
                int var41 = var32 + var39;
                arg0[var19++] = arg1[(var40 >> 6) + (var41 & 0xFC0)] >>> var34;
                int var42 = var31 + var40;
                int var43 = var32 + var41;
                arg0[var19++] = arg1[(var42 >> 6) + (var43 & 0xFC0)] >>> var34;
                int var44 = var31 + var42;
                int var45 = var32 + var43;
                arg0[var19++] = arg1[(var44 >> 6) + (var45 & 0xFC0)] >>> var34;
                int var46 = var31 + var44;
                int var47 = var32 + var45;
                arg0[var19++] = arg1[(var46 >> 6) + (var47 & 0xFC0)] >>> var34;
                int var48 = var31 + var46;
                int var49 = var32 + var47;
                arg0[var19++] = arg1[(var48 >> 6) + (var49 & 0xFC0)] >>> var34;
                int var50 = var20;
                arg3 = var21;
                var27 += arg12;
                var28 += arg13;
                var29 += arg14;
                int var51 = var29 >> 12;
                if (var51 != 0) {
                    var20 = var27 / var51;
                    var21 = var28 / var51;
                    if (var20 < 7) {
                        var20 = 7;
                    } else if (var20 > 4032) {
                        var20 = 4032;
                    }
                }
                var31 = var20 - var50 >> 3;
                var32 = var21 - arg3 >> 3;
                var18 += var17;
                var33 = (var18 >> 3 & 0xC0000) + var50;
                var34 = var18 >> 23;
            }
            int var35 = arg6 - arg5 & 0x7;
            while (var35-- > 0) {
                arg0[var19++] = arg1[(var33 >> 6) + (arg3 & 0xFC0)] >>> var34;
                var33 += var31;
                arg3 += var32;
            }
            return;
        }
        while (var16-- > 0) {
            int var54;
            if ((var54 = arg1[(var33 >> 6) + (arg3 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var54;
            }
            var19++;
            int var55 = var31 + var33;
            int var56 = arg3 + var32;
            int var57;
            if ((var57 = arg1[(var55 >> 6) + (var56 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var57;
            }
            var19++;
            int var58 = var31 + var55;
            int var59 = var32 + var56;
            int var60;
            if ((var60 = arg1[(var58 >> 6) + (var59 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var60;
            }
            var19++;
            int var61 = var31 + var58;
            int var62 = var32 + var59;
            int var63;
            if ((var63 = arg1[(var61 >> 6) + (var62 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var63;
            }
            var19++;
            int var64 = var31 + var61;
            int var65 = var32 + var62;
            int var66;
            if ((var66 = arg1[(var64 >> 6) + (var65 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var66;
            }
            var19++;
            int var67 = var31 + var64;
            int var68 = var32 + var65;
            int var69;
            if ((var69 = arg1[(var67 >> 6) + (var68 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var69;
            }
            var19++;
            int var70 = var31 + var67;
            int var71 = var32 + var68;
            int var72;
            if ((var72 = arg1[(var70 >> 6) + (var71 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var72;
            }
            var19++;
            int var73 = var31 + var70;
            int var74 = var32 + var71;
            int var75;
            if ((var75 = arg1[(var73 >> 6) + (var74 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var75;
            }
            var19++;
            int var76 = var20;
            arg3 = var21;
            var27 += arg12;
            var28 += arg13;
            var29 += arg14;
            int var77 = var29 >> 12;
            if (var77 != 0) {
                var20 = var27 / var77;
                var21 = var28 / var77;
                if (var20 < 7) {
                    var20 = 7;
                } else if (var20 > 4032) {
                    var20 = 4032;
                }
            }
            var31 = var20 - var76 >> 3;
            var32 = var21 - arg3 >> 3;
            var18 += var17;
            var33 = (var18 >> 3 & 0xC0000) + var76;
            var34 = var18 >> 23;
        }
        int var52 = arg6 - arg5 & 0x7;
        while (var52-- > 0) {
            int var53;
            if ((var53 = arg1[(var33 >> 6) + (arg3 & 0xFC0)] >>> var34) != 0) {
                arg0[var19] = var53;
            }
            var19++;
            var33 += var31;
            arg3 += var32;
        }
    }

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            field643[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            field644[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            field645[var2] = (int) (Math.sin((double) var2 * 0.0030679615D) * 65536.0D);
            field646[var2] = (int) (Math.cos((double) var2 * 0.0030679615D) * 65536.0D);
        }
        field649 = new Pix8[50];
        field650 = new boolean[50];
        field651 = new int[50];
        field654 = new int[50][];
        field655 = new int[50];
        field657 = new int[65536];
        field658 = new int[50][];
    }
}
