import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 extends class145 {

    @OriginalMember(owner = "client!cd", name = "Ab", descriptor = "I")
    public int field484 = 0;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "[[B")
    private byte[][] field467 = new byte[256][];

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "Ljava/util/Random;")
    private Random field463 = new Random();

    @OriginalMember(owner = "client!cd", name = "sb", descriptor = "[I")
    private int[] field476;

    @OriginalMember(owner = "client!cd", name = "xb", descriptor = "[I")
    private int[] field481;

    @OriginalMember(owner = "client!cd", name = "yb", descriptor = "[I")
    private int[] field482;

    @OriginalMember(owner = "client!cd", name = "Fb", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client!cd", name = "Hb", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "Lrd;")
    private static class117 field465 = class95.method812("gre", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "Lrd;")
    private static class117 field469 = class95.method812("or1", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "vb", descriptor = "[Lrd;")
    private static class117[] field479 = new class117[100];

    @OriginalMember(owner = "client!cd", name = "nb", descriptor = "Lrd;")
    private static class117 field471 = class95.method812("red", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "Lrd;")
    private static class117 field466 = class95.method812("yel", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "wb", descriptor = "Lrd;")
    private static class117 field480 = class95.method812("@str@", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "ub", descriptor = "Lrd;")
    private static class117 field478 = class95.method812("whi", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "zb", descriptor = "Lrd;")
    private static class117 field483 = class95.method812("str", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "Lrd;")
    private static class117 field464 = class95.method812("blu", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "Lrd;")
    private static class117 field468 = class95.method812("lre", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "mb", descriptor = "Lrd;")
    private static class117 field470 = class95.method812("or3", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "ob", descriptor = "Lrd;")
    private static class117 field472 = class95.method812("gr1", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "pb", descriptor = "Lrd;")
    private static class117 field473 = class95.method812("dbl", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "qb", descriptor = "Z")
    private static boolean field474 = false;

    @OriginalMember(owner = "client!cd", name = "Db", descriptor = "Lrd;")
    private static class117 field487 = class95.method812("gr3", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "Bb", descriptor = "Lrd;")
    private static class117 field485 = class95.method812("cya", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "tb", descriptor = "Lrd;")
    private static class117 field477 = class95.method812("or2", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "rb", descriptor = "Lrd;")
    private static class117 field475 = class95.method812("bla", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "Cb", descriptor = "Lrd;")
    private static class117 field486 = class95.method812("gr2", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "Eb", descriptor = "Lrd;")
    private static class117 field488 = class95.method812("dre", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "Gb", descriptor = "Lrd;")
    private static class117 field490 = class95.method812("mag", (byte) 8);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lrd;IIIII)V")
    public final void method198(class117 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method209(arg0) / 2;
        int var10 = arg2 - this.field484;
        for (int var11 = 0; var11 < arg0.method954(108); var11++) {
            int var12 = arg0.field2851[var11] & 0xFF;
            if (var12 != 32) {
                method207(this.field467[var12], var9, this.field476[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field481[var12], this.field482[var12], arg3);
            }
            var9 += this.field481[var12];
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lrd;IIIZ)V")
    public final void method199(class117 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field474 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field484;
        for (int var8 = 0; var8 < arg0.field2858; var8++) {
            if (arg0.field2851[var8] == 64 && var8 + 4 < arg0.field2858 && arg0.field2851[var8 + 4] == 64) {
                int var9 = this.method218(arg0.method963(var8 + 4, var8 + 1, (byte) -127));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field2851[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        method207(this.field467[var10], arg1 + 1, this.field476[var10] + var7 + 1, this.field481[var10], this.field482[var10], 0);
                    }
                    method207(this.field467[var10], arg1, this.field476[var10] + var7, this.field481[var10], this.field482[var10], arg3);
                }
                arg1 += this.field481[var10];
            }
        }
        if (field474) {
            class145.method1164(var6, (int) ((double) this.field484 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lrd;IIIZI)V")
    public final void method200(class117 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field463.setSeed((long) arg5);
        int var7 = (this.field463.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field484;
        for (int var9 = 0; var9 < arg0.field2858; var9++) {
            if (arg0.field2851[var9] == 64 && var9 + 4 < arg0.field2858 && arg0.field2851[var9 + 4] == 64) {
                int var10 = this.method218(arg0.method963(var9 + 4, var9 + 1, (byte) -127));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field2851[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        method212(this.field467[var11], arg1 + 1, this.field476[var11] + var8 + 1, this.field481[var11], this.field482[var11], 0, 192);
                    }
                    method212(this.field467[var11], arg1, this.field476[var11] + var8, this.field481[var11], this.field482[var11], arg3, var7);
                }
                arg1 += this.field481[var11];
                if ((this.field463.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)I")
    public final int method201(int arg0) {
        return this.field481[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lrd;I)I")
    public final int method202(class117 arg0, int arg1) {
        int var3 = this.method210(arg0, arg1, true);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method209(field479[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lrd;)I")
    public final int method203(class117 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2858; var3++) {
            if (arg0.field2851[var3] == 64 && var3 + 4 < arg0.field2858 && arg0.field2851[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field481[arg0.field2851[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lrd;IIIIIZIII)V")
    public final void method204(class117 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        if (arg9 == 0) {
            arg9 = this.field484;
        }
        boolean var11 = true;
        if (arg4 < this.field491 + this.field489 + arg9 && arg4 < arg9 + arg9) {
            var11 = false;
        }
        int var12 = this.method210(arg0, arg3, var11);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field489 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field489 - this.field491 - (var12 - 1) * arg9) / 2 + this.field489 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field491 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field489 - this.field491 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field489 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method199(field479[var15], arg1, var13, arg5, arg6);
            } else if (arg7 == 1) {
                this.method219(field479[var15], arg3 / 2 + arg1, var13, arg5, arg6);
            } else if (arg7 == 2) {
                this.method221(field479[var15], arg1 + arg3, var13, arg5, arg6);
            } else if (var12 - 1 == var15) {
                this.method199(field479[var15], arg1, var13, arg5, arg6);
            } else {
                this.method217(field479[var15], arg1, var13, arg5, arg6, arg3);
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lrd;I)I")
    public final int method205(class117 arg0, int arg1) {
        return this.method210(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "()V")
    public static void method206() {
        field483 = null;
        field480 = null;
        field471 = null;
        field465 = null;
        field464 = null;
        field466 = null;
        field485 = null;
        field490 = null;
        field478 = null;
        field475 = null;
        field468 = null;
        field488 = null;
        field473 = null;
        field469 = null;
        field477 = null;
        field470 = null;
        field472 = null;
        field486 = null;
        field487 = null;
        field479 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([BIIIII)V")
    private static final void method207(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class145.field3552 * arg2 + arg1;
        int var7 = class145.field3552 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class145.field3553) {
            int var10 = class145.field3553 - arg2;
            arg4 -= var10;
            arg2 = class145.field3553;
            var9 += arg3 * var10;
            var6 += class145.field3552 * var10;
        }
        if (arg2 + arg4 > class145.field3551) {
            arg4 -= arg2 + arg4 - class145.field3551;
        }
        if (arg1 < class145.field3550) {
            int var11 = class145.field3550 - arg1;
            arg3 -= var11;
            arg1 = class145.field3550;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class145.field3549) {
            int var12 = arg1 + arg3 - class145.field3549;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method220(class145.field3548, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method208(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lrd;)I")
    public final int method209(class117 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2858; var3++) {
            var2 += this.field481[arg0.field2851[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lrd;IZ)I")
    private final int method210(class117 arg0, int arg1, boolean arg2) {
        int var4 = 0;
        int var5 = 0;
        class117 var6 = class71.method683(100, 26702);
        int var7 = -1;
        int var8 = 0;
        class117 var9 = null;
        int var10 = 0;
        boolean var11 = false;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg0.method954(103);
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = arg0.method953(var15, 2);
            if (var16 == 64 && var15 + 4 < var14 && arg0.method953(var15 + 4, 2) == 64) {
                class117 var17 = arg0.method963(var15 + 5, var15, (byte) -127);
                if (var17.method962(field483, true)) {
                    var11 = true;
                    var12 = var6.method954(-53);
                } else {
                    var9 = var17;
                    var10 = var6.method954(125);
                }
                var6.method956(var17, -128);
                var15 += 4;
            } else if (var16 == 92 && var15 + 1 < var14 && arg0.method953(var15 + 1, 2) == 110) {
                field479[var13++] = var6.method963(var6.method954(-60), var5, (byte) -127).method976(125);
                var5 = var6.method954(64);
                var4 = 0;
                var7 = -1;
                var15++;
                var9 = null;
                var11 = false;
            } else {
                var6.method958(-105, var16);
                var4 += this.method201(var16);
                if (var16 == 32 || var16 == 45) {
                    var7 = var6.method954(115);
                    var8 = var4;
                }
                if (arg2 && var4 > arg1 && var7 >= 0) {
                    field479[var13++] = var6.method963(var7, var5, (byte) -127).method976(74);
                    var5 = var7;
                    var7 = -1;
                    var4 -= var8;
                    if (var9 != null && var10 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method960(var5, (byte) -92, var9);
                    }
                    if (var11 && var12 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method960(var5, (byte) -64, field480);
                    }
                }
            }
        }
        if (var6.method954(108) > var5) {
            field479[var13++] = var6.method963(var6.method954(-103), var5, (byte) -127).method976(95);
        }
        return var13;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lrd;IIII)V")
    public final void method211(class117 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method209(arg0) / 2;
        int var7 = arg2 - this.field484;
        for (int var8 = 0; var8 < arg0.field2858; var8++) {
            int var9 = arg0.field2851[var8] & 0xFF;
            if (var9 != 32) {
                method207(this.field467[var9], var6, this.field476[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field481[var9], this.field482[var9], arg3);
            }
            var6 += this.field481[var9];
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([BIIIIII)V")
    private static final void method212(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class145.field3552 * arg2 + arg1;
        int var8 = class145.field3552 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class145.field3553) {
            int var11 = class145.field3553 - arg2;
            arg4 -= var11;
            arg2 = class145.field3553;
            var10 += arg3 * var11;
            var7 += class145.field3552 * var11;
        }
        if (arg2 + arg4 > class145.field3551) {
            arg4 -= arg2 + arg4 - class145.field3551;
        }
        if (arg1 < class145.field3550) {
            int var12 = class145.field3550 - arg1;
            arg3 -= var12;
            arg1 = class145.field3550;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class145.field3549) {
            int var13 = arg1 + arg3 - class145.field3549;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method208(class145.field3548, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lrd;IIII)V")
    public final void method213(class117 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method209(arg0) / 2;
        int var7 = arg2 - this.field484;
        for (int var8 = 0; var8 < arg0.method954(-104); var8++) {
            int var9 = arg0.field2851[var8] & 0xFF;
            if (var9 != 32) {
                method207(this.field467[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field476[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field481[var9], this.field482[var9], arg3);
            }
            var6 += this.field481[var9];
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lrd;III)V")
    public final void method214(class117 arg0, int arg1, int arg2, int arg3) {
        this.method215(arg0, arg1 - this.method209(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lrd;III)V")
    public final void method215(class117 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field484;
        for (int var6 = 0; var6 < arg0.field2858; var6++) {
            int var7 = arg0.field2851[var6] & 0xFF;
            if (var7 != 32) {
                method207(this.field467[var7], arg1, this.field476[var7] + var5, this.field481[var7], this.field482[var7], arg3);
            }
            arg1 += this.field481[var7];
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lrd;III)V")
    public final void method216(class117 arg0, int arg1, int arg2, int arg3) {
        this.method215(arg0, arg1 - this.method209(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lrd;IIIZI)V")
    private final void method217(class117 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class117 var7 = arg0.method976(68);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method954(77); var9++) {
            if (var7.method953(var9, 2) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method203(var7)) * 256 / var8;
        }
        field474 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field484;
        for (int var14 = 0; var14 < var7.field2858; var14++) {
            if (var7.field2851[var14] == 64 && var14 + 4 < var7.field2858 && var7.field2851[var14 + 4] == 64) {
                int var15 = this.method218(var7.method963(var14 + 4, var14 + 1, (byte) -127));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field2851[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        method207(this.field467[var16], arg1 + 1, this.field476[var16] + var13 + 1, this.field481[var16], this.field482[var16], 0);
                    }
                    method207(this.field467[var16], arg1, this.field476[var16] + var13, this.field481[var16], this.field482[var16], arg3);
                }
                arg1 += this.field481[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (field474) {
            class145.method1164(var12, (int) ((double) this.field484 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lrd;)I")
    private final int method218(class117 arg0) {
        if (arg0.method962(field471, true)) {
            return 16711680;
        } else if (arg0.method962(field465, true)) {
            return 65280;
        } else if (arg0.method962(field464, true)) {
            return 255;
        } else if (arg0.method962(field466, true)) {
            return 16776960;
        } else if (arg0.method962(field485, true)) {
            return 65535;
        } else if (arg0.method962(field490, true)) {
            return 16711935;
        } else if (arg0.method962(field478, true)) {
            return 16777215;
        } else if (arg0.method962(field475, true)) {
            return 0;
        } else if (arg0.method962(field468, true)) {
            return 16748608;
        } else if (arg0.method962(field488, true)) {
            return 8388608;
        } else if (arg0.method962(field473, true)) {
            return 128;
        } else if (arg0.method962(field469, true)) {
            return 16756736;
        } else if (arg0.method962(field477, true)) {
            return 16740352;
        } else if (arg0.method962(field470, true)) {
            return 16723968;
        } else if (arg0.method962(field472, true)) {
            return 12648192;
        } else if (arg0.method962(field486, true)) {
            return 8453888;
        } else if (arg0.method962(field487, true)) {
            return 4259584;
        } else {
            if (arg0.method962(field483, true)) {
                field474 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lrd;IIIZ)V")
    public final void method219(class117 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method199(arg0, arg1 - this.method203(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method220(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lrd;IIIZ)V")
    public final void method221(class117 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method199(arg0, arg1 - this.method203(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class19(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field476 = arg0;
        this.field481 = arg1;
        this.field482 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field467 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field476[var10] < var8 && this.field482[var10] != 0) {
                var8 = this.field476[var10];
            }
            if (this.field482[var10] + this.field476[var10] > var9) {
                var9 = this.field482[var10] + this.field476[var10];
            }
            byte[] var11 = this.field467[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field484 = this.field482[32] + this.field476[32];
        this.field489 = this.field484 - var8;
        this.field491 = var9 - this.field484;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([B)V")
    public class19(byte[] arg0) {
        this.field481 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field481.length; var2++) {
            this.field481[var2] = arg0[var2] & 0xFF;
        }
    }
}
