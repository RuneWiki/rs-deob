import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class154 extends class90 {

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
    public int field3463 = 0;

    @OriginalMember(owner = "client!wa", name = "Hb", descriptor = "[[B")
    private byte[][] field3488 = new byte[256][];

    @OriginalMember(owner = "client!wa", name = "Ib", descriptor = "[I")
    private int[] field3489;

    @OriginalMember(owner = "client!wa", name = "lb", descriptor = "[I")
    private int[] field3466;

    @OriginalMember(owner = "client!wa", name = "pb", descriptor = "[I")
    private int[] field3470;

    @OriginalMember(owner = "client!wa", name = "vb", descriptor = "[I")
    private int[] field3476;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "I")
    private int field3459;

    @OriginalMember(owner = "client!wa", name = "Db", descriptor = "I")
    private int field3484;

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "Lhe;")
    private static class54 field3464 = class6.method58(")4col", false);

    @OriginalMember(owner = "client!wa", name = "nb", descriptor = "Lhe;")
    private static class54 field3468 = class6.method58(")4shad", false);

    @OriginalMember(owner = "client!wa", name = "ob", descriptor = "Lhe;")
    private static class54 field3469 = class6.method58("br", false);

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
    private static int field3460 = 0;

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
    private static int field3461 = -1;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
    private static int field3462 = -1;

    @OriginalMember(owner = "client!wa", name = "kb", descriptor = "Lhe;")
    private static class54 field3465 = class6.method58("str", false);

    @OriginalMember(owner = "client!wa", name = "qb", descriptor = "Lhe;")
    private static class54 field3471 = class6.method58("shad", false);

    @OriginalMember(owner = "client!wa", name = "yb", descriptor = "I")
    private static int field3479 = 256;

    @OriginalMember(owner = "client!wa", name = "Ab", descriptor = "Lhe;")
    private static class54 field3481 = class6.method58(")4u", false);

    @OriginalMember(owner = "client!wa", name = "mb", descriptor = "Lhe;")
    private static class54 field3467 = class6.method58(")4str", false);

    @OriginalMember(owner = "client!wa", name = "tb", descriptor = "Lhe;")
    private static class54 field3474 = class6.method58("u=", false);

    @OriginalMember(owner = "client!wa", name = "Fb", descriptor = "Lhe;")
    private static class54 field3486 = class6.method58("str=", false);

    @OriginalMember(owner = "client!wa", name = "zb", descriptor = "Lhe;")
    private static class54 field3480 = class6.method58("shad=", false);

    @OriginalMember(owner = "client!wa", name = "Bb", descriptor = "Lhe;")
    private static class54 field3482 = class6.method58("col=", false);

    @OriginalMember(owner = "client!wa", name = "Eb", descriptor = "Lhe;")
    private static class54 field3485 = class6.method58("gt", false);

    @OriginalMember(owner = "client!wa", name = "rb", descriptor = "I")
    private static int field3472 = 0;

    @OriginalMember(owner = "client!wa", name = "wb", descriptor = "Lhe;")
    private static class54 field3477 = class6.method58("lt", false);

    @OriginalMember(owner = "client!wa", name = "Jb", descriptor = "I")
    private static int field3490 = 0;

    @OriginalMember(owner = "client!wa", name = "xb", descriptor = "I")
    private static int field3478 = -1;

    @OriginalMember(owner = "client!wa", name = "Kb", descriptor = "Lhe;")
    private static class54 field3491 = class6.method58("img=", false);

    @OriginalMember(owner = "client!wa", name = "Nb", descriptor = "I")
    private static int field3494 = 0;

    @OriginalMember(owner = "client!wa", name = "Mb", descriptor = "Lhe;")
    private static class54 field3493 = class6.method58("u", false);

    @OriginalMember(owner = "client!wa", name = "Lb", descriptor = "I")
    private static int field3492 = -1;

    @OriginalMember(owner = "client!wa", name = "Gb", descriptor = "Ljava/util/Random;")
    private static Random field3487 = new Random();

    @OriginalMember(owner = "client!wa", name = "Ob", descriptor = "[Lhe;")
    private static class54[] field3495 = new class54[100];

    @OriginalMember(owner = "client!wa", name = "ub", descriptor = "[B")
    private byte[] field3475;

    @OriginalMember(owner = "client!wa", name = "sb", descriptor = "[I")
    private int[] field3473;

    @OriginalMember(owner = "client!wa", name = "Cb", descriptor = "[Lce;")
    public static class20[] field3483;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([BIIIIII)V")
    private static final void method1168(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class90.field2205 * arg2 + arg1;
        int var8 = class90.field2205 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class90.field2210) {
            int var11 = class90.field2210 - arg2;
            arg4 -= var11;
            arg2 = class90.field2210;
            var10 += arg3 * var11;
            var7 += class90.field2205 * var11;
        }
        if (arg2 + arg4 > class90.field2207) {
            arg4 -= arg2 + arg4 - class90.field2207;
        }
        if (arg1 < class90.field2208) {
            int var12 = class90.field2208 - arg1;
            arg3 -= var12;
            arg1 = class90.field2208;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class90.field2204) {
            int var13 = arg1 + arg3 - class90.field2204;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1193(class90.field2206, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lhe;II)V")
    private final void method1169(class54 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3463;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field1325; var7++) {
            int var8 = arg0.field1323[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class54 var9 = arg0.method408((byte) -108, var5 + 1, var7);
                    var5 = -1;
                    if (var9.method381(1, field3477)) {
                        var8 = 60;
                    } else {
                        if (!var9.method381(1, field3485)) {
                            if (var9.method387(field3491, (byte) -95)) {
                                try {
                                    int var10 = var9.method384(4, 89).method383((byte) -83);
                                    class20 var11 = field3483[var10];
                                    var11.method161(arg1, this.field3463 + var4 - var11.field570);
                                    arg1 += var11.field572;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method1191(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field3475 != null && var6 != -1) {
                        arg1 += this.field3475[(var6 << 8) + var8];
                    }
                    int var12 = this.field3470[var8];
                    int var13 = this.field3476[var8];
                    if (var8 == 32) {
                        if (field3490 > 0) {
                            field3460 += field3490;
                            arg1 += field3460 >> 8;
                            field3460 &= 0xFF;
                        }
                    } else if (field3479 == 256) {
                        if (field3492 != -1) {
                            method1177(this.field3488[var8], this.field3489[var8] + arg1 + 1, this.field3466[var8] + var4 + 1, var12, var13, field3492);
                        }
                        this.method798(this.field3488[var8], this.field3489[var8] + arg1, this.field3466[var8] + var4, var12, var13, field3494);
                    } else {
                        if (field3492 != -1) {
                            method1168(this.field3488[var8], this.field3489[var8] + arg1 + 1, this.field3466[var8] + var4 + 1, var12, var13, field3492, field3479);
                        }
                        this.method797(this.field3488[var8], this.field3489[var8] + arg1, this.field3466[var8] + var4, var12, var13, field3494, field3479);
                    }
                    int var14 = this.field3473[var8];
                    if (field3461 != -1) {
                        class90.method727(arg1, (int) ((double) this.field3463 * 0.7D) + var4, var14, field3461);
                    }
                    if (field3478 != -1) {
                        class90.method727(arg1, this.field3463 + var4 + 1, var14, field3478);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lhe;IIII)V")
    public final void method1170(class54 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1188(arg3, arg4);
            this.method1169(arg0, arg1 - this.method1172(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "([BIIIIII)V")
    public abstract void method797(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method1171(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lhe;)I")
    public final int method1172(class54 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field1325; var5++) {
            int var6 = arg0.field1323[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class54 var7 = arg0.method408((byte) 13, var2 + 1, var5);
                    var2 = -1;
                    if (var7.method381(1, field3477)) {
                        var6 = 60;
                    } else {
                        if (!var7.method381(1, field3485)) {
                            if (var7.method387(field3491, (byte) -95)) {
                                try {
                                    int var8 = var7.method384(4, 107).method383((byte) -126);
                                    var4 += field3483[var8].field572;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field3473[var6];
                    if (this.field3475 != null && var3 != -1) {
                        var4 += this.field3475[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lhe;[I[Lhe;)I")
    private final int method1173(class54 arg0, int[] arg1, class54[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class54 var6 = class72.method565((byte) -126, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method404(-101);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method413(21340, var14);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class54 var16 = arg0.method408((byte) -108, var10 + 1, var14);
                    var10 = -1;
                    var6.method403(60, 0);
                    var6.method411(var16, (byte) -28);
                    var6.method403(62, 0);
                    if (var16.method381(1, field3469)) {
                        arg2[var12++] = var6.method408((byte) 76, var5, var6.method404(-111));
                        var5 = var6.method404(-114);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method381(1, field3477)) {
                        var4 += this.method1190(60);
                        if (this.field3475 != null && var11 != -1) {
                            var4 += this.field3475[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method381(1, field3485)) {
                        var4 += this.method1190(62);
                        if (this.field3475 != null && var11 != -1) {
                            var4 += this.field3475[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method387(field3491, (byte) -95)) {
                        try {
                            int var17 = var16.method384(4, -23).method383((byte) -88);
                            var4 += field3483[var17].field572;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method403(var15, 0);
                        var4 += this.method1190(var15);
                        if (this.field3475 != null && var11 != -1) {
                            var4 += this.field3475[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method404(-121);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method408((byte) -120, var5, var7 - var9);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method404(-126);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method404(-99) > var5) {
            arg2[var12++] = var6.method408((byte) 63, var5, var6.method404(-107));
        }
        return var12;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([B)V")
    private final void method1174(byte[] arg0) {
        this.field3473 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3473.length; var2++) {
                this.field3473[var2] = arg0[var2] & 0xFF;
            }
            this.field3463 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3473[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field3475 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field3475[(var13 << 8) + var14] = (byte) method1171(var9, var11, var6, this.field3473, var5, var13, var14);
                    }
                }
            }
        }
        this.field3463 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lhe;IIIII)V")
    public final void method1175(class54 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1188(arg3, arg4);
        int[] var7 = new int[arg0.field1325];
        for (int var8 = 0; var8 < arg0.field1325; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method1184(arg0, arg1 - this.method1172(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "()V")
    public static void method1176() {
        field3477 = null;
        field3485 = null;
        field3491 = null;
        field3469 = null;
        field3482 = null;
        field3464 = null;
        field3474 = null;
        field3493 = null;
        field3481 = null;
        field3480 = null;
        field3471 = null;
        field3468 = null;
        field3486 = null;
        field3465 = null;
        field3467 = null;
        field3483 = null;
        field3487 = null;
        field3495 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([BIIIII)V")
    private static final void method1177(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class90.field2205 * arg2 + arg1;
        int var7 = class90.field2205 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class90.field2210) {
            int var10 = class90.field2210 - arg2;
            arg4 -= var10;
            arg2 = class90.field2210;
            var9 += arg3 * var10;
            var6 += class90.field2205 * var10;
        }
        if (arg2 + arg4 > class90.field2207) {
            arg4 -= arg2 + arg4 - class90.field2207;
        }
        if (arg1 < class90.field2208) {
            int var11 = class90.field2208 - arg1;
            arg3 -= var11;
            arg1 = class90.field2208;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class90.field2204) {
            int var12 = arg1 + arg3 - class90.field2204;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1192(class90.field2206, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lhe;IIIIIIIII)I")
    public final int method1178(class54 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method1188(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3463;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3484 + this.field3459 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method1173(arg0, var11, field3495);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3459 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3459 - this.field3484 - (var12 - 1) * arg9) / 2 + this.field3459 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3484 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3459 - this.field3484 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3459 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method1169(field3495[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method1169(field3495[var15], arg1 + (arg3 - this.method1172(field3495[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method1169(field3495[var15], arg1 + arg3 - this.method1172(field3495[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method1169(field3495[var15], arg1, var13);
            } else {
                this.method1185(field3495[var15], arg3);
                this.method1169(field3495[var15], arg1, var13);
                field3490 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lhe;IIIIII)V")
    public final void method1179(class54 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1188(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field1325];
        for (int var11 = 0; var11 < arg0.field1325; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method1184(arg0, arg1 - this.method1172(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lhe;I)I")
    public final int method1180(class54 arg0, int arg1) {
        int var3 = this.method1173(arg0, new int[] { arg1 }, field3495);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1172(field3495[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Lhe;IIIII)V")
    public final void method1181(class54 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1188(arg3, arg4);
        int[] var7 = new int[arg0.field1325];
        int[] var8 = new int[arg0.field1325];
        for (int var9 = 0; var9 < arg0.field1325; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method1184(arg0, arg1 - this.method1172(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Lhe;I)I")
    public final int method1182(class54 arg0, int arg1) {
        return this.method1173(arg0, new int[] { arg1 }, field3495);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Lhe;IIII)V")
    public final void method1183(class54 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1188(arg3, arg4);
            this.method1169(arg0, arg1 - this.method1172(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lhe;II[I[I)V")
    private final void method1184(class54 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3463;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field1325; var10++) {
            int var11 = arg0.field1323[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class54 var12 = arg0.method408((byte) 110, var7 + 1, var10);
                    var7 = -1;
                    if (var12.method381(1, field3477)) {
                        var11 = 60;
                    } else {
                        if (!var12.method381(1, field3485)) {
                            if (var12.method387(field3491, (byte) -95)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method384(4, 77).method383((byte) -103);
                                    class20 var16 = field3483[var15];
                                    var16.method161(arg1 + var13, this.field3463 + var6 - var16.field570 + var14);
                                    arg1 += var16.field572;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method1191(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field3475 != null && var8 != -1) {
                        arg1 += this.field3475[(var8 << 8) + var11];
                    }
                    int var17 = this.field3470[var11];
                    int var18 = this.field3476[var11];
                    int var19;
                    if (arg3 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg3[var9];
                    }
                    int var20;
                    if (arg4 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field3490 > 0) {
                            field3460 += field3490;
                            arg1 += field3460 >> 8;
                            field3460 &= 0xFF;
                        }
                    } else if (field3479 == 256) {
                        if (field3492 != -1) {
                            method1177(this.field3488[var11], this.field3489[var11] + arg1 + var19 + 1, this.field3466[var11] + var6 + 1 + var20, var17, var18, field3492);
                        }
                        this.method798(this.field3488[var11], this.field3489[var11] + arg1 + var19, this.field3466[var11] + var6 + var20, var17, var18, field3494);
                    } else {
                        if (field3492 != -1) {
                            method1168(this.field3488[var11], this.field3489[var11] + arg1 + var19 + 1, this.field3466[var11] + var6 + 1 + var20, var17, var18, field3492, field3479);
                        }
                        this.method797(this.field3488[var11], this.field3489[var11] + arg1 + var19, this.field3466[var11] + var6 + var20, var17, var18, field3494, field3479);
                    }
                    int var21 = this.field3473[var11];
                    if (field3461 != -1) {
                        class90.method727(arg1, (int) ((double) this.field3463 * 0.7D) + var6, var21, field3461);
                    }
                    if (field3478 != -1) {
                        class90.method727(arg1, this.field3463 + var6, var21, field3478);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Lhe;I)V")
    private final void method1185(class54 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method404(-127); var5++) {
            int var6 = arg0.method413(21340, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field3490 = (arg1 - this.method1172(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Lhe;)Lhe;")
    public static final class54 method1186(class54 arg0) {
        int var1 = arg0.method404(-103);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field1323[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class54 var4 = new class54();
        var4.field1325 = var1 + var2;
        var4.field1323 = new byte[var4.field1325];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field1323[var6];
            if (var7 == 60) {
                var4.field1323[var5++] = 60;
                var4.field1323[var5++] = 108;
                var4.field1323[var5++] = 116;
                var4.field1323[var5++] = 62;
            } else if (var7 == 62) {
                var4.field1323[var5++] = 60;
                var4.field1323[var5++] = 103;
                var4.field1323[var5++] = 116;
                var4.field1323[var5++] = 62;
            } else {
                var4.field1323[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Lhe;IIIII)V")
    public final void method1187(class54 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1188(arg3, arg4);
        field3487.setSeed((long) arg5);
        field3479 = (field3487.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field1325];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field1325; var9++) {
            var7[var9] = var8;
            if ((field3487.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method1184(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
    private final void method1188(int arg0, int arg1) {
        field3461 = -1;
        field3478 = -1;
        field3462 = arg1;
        field3492 = arg1;
        field3472 = arg0;
        field3494 = arg0;
        field3479 = 256;
        field3490 = 0;
        field3460 = 0;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Lhe;IIII)V")
    public final void method1189(class54 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1188(arg3, arg4);
            this.method1169(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "([BIIIII)V")
    public abstract void method798(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)I")
    private final int method1190(int arg0) {
        return this.field3473[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Lhe;)V")
    private final void method1191(class54 arg0) {
        try {
            if (arg0.method387(field3482, (byte) -95)) {
                field3494 = arg0.method384(4, -23).method414(-9613, 16);
                return;
            }
            if (arg0.method381(1, field3464)) {
                field3494 = field3472;
                return;
            }
            if (arg0.method387(field3486, (byte) -95)) {
                field3461 = arg0.method384(4, -88).method414(-9613, 16);
                return;
            }
            if (arg0.method381(1, field3465)) {
                field3461 = 8388608;
                return;
            }
            if (arg0.method381(1, field3467)) {
                field3461 = -1;
                return;
            }
            if (arg0.method387(field3474, (byte) -95)) {
                field3478 = arg0.method384(2, -39).method414(-9613, 16);
                return;
            }
            if (arg0.method381(1, field3493)) {
                field3478 = 0;
                return;
            }
            if (arg0.method381(1, field3481)) {
                field3478 = -1;
                return;
            }
            if (arg0.method387(field3480, (byte) -95)) {
                field3492 = arg0.method384(5, -61).method414(-9613, 16);
                return;
            }
            if (arg0.method381(1, field3471)) {
                field3492 = 0;
                return;
            }
            if (arg0.method381(1, field3468)) {
                field3492 = field3462;
                return;
            }
            if (arg0.method381(1, field3469)) {
                this.method1188(field3472, field3462);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method1192(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method1193(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class154(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3489 = arg1;
        this.field3466 = arg2;
        this.field3470 = arg3;
        this.field3476 = arg4;
        this.method1174(arg0);
        this.field3488 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3466[var10] < var8 && this.field3476[var10] != 0) {
                var8 = this.field3466[var10];
            }
            if (this.field3476[var10] + this.field3466[var10] > var9) {
                var9 = this.field3476[var10] + this.field3466[var10];
            }
        }
        this.field3459 = this.field3463 - var8;
        this.field3484 = var9 - this.field3463;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "([B)V")
    public class154(byte[] arg0) {
        this.method1174(arg0);
    }
}
