import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class145 extends class62 {

    @OriginalMember(owner = "client!we", name = "ub", descriptor = "[[B")
    private byte[][] field3460 = new byte[256][];

    @OriginalMember(owner = "client!we", name = "mb", descriptor = "I")
    public int field3452 = 0;

    @OriginalMember(owner = "client!we", name = "db", descriptor = "Ljava/util/Random;")
    private Random field3443 = new Random();

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "[I")
    private int[] field3447;

    @OriginalMember(owner = "client!we", name = "lb", descriptor = "[I")
    private int[] field3451;

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "[I")
    private int[] field3446;

    @OriginalMember(owner = "client!we", name = "wb", descriptor = "I")
    private int field3462;

    @OriginalMember(owner = "client!we", name = "xb", descriptor = "I")
    private int field3463;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "Lvc;")
    private static class137 field3437 = class45.method325("or2", -46);

    @OriginalMember(owner = "client!we", name = "V", descriptor = "Lvc;")
    private static class137 field3435 = class45.method325("lre", -46);

    @OriginalMember(owner = "client!we", name = "W", descriptor = "Lvc;")
    private static class137 field3436 = class45.method325("or1", -46);

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "Lvc;")
    private static class137 field3442 = class45.method325("gr2", -46);

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "Z")
    private static boolean field3439 = false;

    @OriginalMember(owner = "client!we", name = "pb", descriptor = "Lvc;")
    private static class137 field3455 = class45.method325("@str@", -46);

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "Lvc;")
    private static class137 field3441 = class45.method325("or3", -46);

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "Lvc;")
    private static class137 field3438 = class45.method325("bla", -46);

    @OriginalMember(owner = "client!we", name = "nb", descriptor = "Lvc;")
    private static class137 field3453 = class45.method325("mag", -46);

    @OriginalMember(owner = "client!we", name = "ob", descriptor = "Lvc;")
    private static class137 field3454 = class45.method325("yel", -46);

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "Lvc;")
    private static class137 field3448 = class45.method325("gr1", -46);

    @OriginalMember(owner = "client!we", name = "sb", descriptor = "Lvc;")
    private static class137 field3458 = class45.method325("cya", -46);

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "Lvc;")
    private static class137 field3445 = class45.method325("str", -46);

    @OriginalMember(owner = "client!we", name = "kb", descriptor = "Lvc;")
    private static class137 field3450 = class45.method325("gr3", -46);

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "Lvc;")
    private static class137 field3444 = class45.method325("gre", -46);

    @OriginalMember(owner = "client!we", name = "rb", descriptor = "Lvc;")
    private static class137 field3457 = class45.method325("whi", -46);

    @OriginalMember(owner = "client!we", name = "qb", descriptor = "Lvc;")
    private static class137 field3456 = class45.method325("blu", -46);

    @OriginalMember(owner = "client!we", name = "tb", descriptor = "[Lvc;")
    private static class137[] field3459 = new class137[100];

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "Lvc;")
    private static class137 field3440 = class45.method325("dbl", -46);

    @OriginalMember(owner = "client!we", name = "jb", descriptor = "Lvc;")
    private static class137 field3449 = class45.method325("red", -46);

    @OriginalMember(owner = "client!we", name = "vb", descriptor = "Lvc;")
    private static class137 field3461 = class45.method325("dre", -46);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BIIIII)V")
    private static final void method1127(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class62.field1335 * arg2 + arg1;
        int var7 = class62.field1335 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class62.field1330) {
            int var10 = class62.field1330 - arg2;
            arg4 -= var10;
            arg2 = class62.field1330;
            var9 += arg3 * var10;
            var6 += class62.field1335 * var10;
        }
        if (arg2 + arg4 > class62.field1334) {
            arg4 -= arg2 + arg4 - class62.field1334;
        }
        if (arg1 < class62.field1332) {
            int var11 = class62.field1332 - arg1;
            arg3 -= var11;
            arg1 = class62.field1332;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class62.field1333) {
            int var12 = arg1 + arg3 - class62.field1333;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1132(class62.field1331, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lvc;IIIII)V")
    public final void method1128(class137 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method1130(arg0) / 2;
        int var10 = arg2 - this.field3452;
        for (int var11 = 0; var11 < arg0.method997(-73); var11++) {
            int var12 = arg0.field3176[var11] & 0xFF;
            if (var12 != 32) {
                method1127(this.field3460[var12], var9, this.field3447[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field3451[var12], this.field3446[var12], arg3);
            }
            var9 += this.field3451[var12];
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lvc;)I")
    public final int method1129(class137 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field3182; var3++) {
            if (arg0.field3176[var3] == 64 && var3 + 4 < arg0.field3182 && arg0.field3176[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field3451[arg0.field3176[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Lvc;)I")
    public final int method1130(class137 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field3182; var3++) {
            var2 += this.field3451[arg0.field3176[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lvc;III)V")
    public final void method1131(class137 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field3452;
        for (int var6 = 0; var6 < arg0.field3182; var6++) {
            int var7 = arg0.field3176[var6] & 0xFF;
            if (var7 != 32) {
                method1127(this.field3460[var7], arg1, this.field3447[var7] + var5, this.field3451[var7], this.field3446[var7], arg3);
            }
            arg1 += this.field3451[var7];
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method1132(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lvc;IIII)V")
    public final void method1133(class137 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method1130(arg0) / 2;
        int var7 = arg2 - this.field3452;
        for (int var8 = 0; var8 < arg0.field3182; var8++) {
            int var9 = arg0.field3176[var8] & 0xFF;
            if (var9 != 32) {
                method1127(this.field3460[var9], var6, this.field3447[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field3451[var9], this.field3446[var9], arg3);
            }
            var6 += this.field3451[var9];
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lvc;IIIIIZIII)V")
    public final void method1134(class137 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        if (arg9 == 0) {
            arg9 = this.field3452;
        }
        boolean var11 = true;
        if (arg4 < this.field3463 + this.field3462 + arg9 && arg4 < arg9 + arg9) {
            var11 = false;
        }
        int var12 = this.method1149(arg0, arg3, var11);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3462 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3462 - this.field3463 - (var12 - 1) * arg9) / 2 + this.field3462 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3463 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3462 - this.field3463 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3462 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method1147(field3459[var15], arg1, var13, arg5, arg6);
            } else if (arg7 == 1) {
                this.method1138(field3459[var15], arg3 / 2 + arg1, var13, arg5, arg6);
            } else if (arg7 == 2) {
                this.method1140(field3459[var15], arg1 + arg3, var13, arg5, arg6);
            } else if (var12 - 1 == var15) {
                this.method1147(field3459[var15], arg1, var13, arg5, arg6);
            } else {
                this.method1139(field3459[var15], arg1, var13, arg5, arg6, arg3);
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Lvc;III)V")
    public final void method1135(class137 arg0, int arg1, int arg2, int arg3) {
        this.method1131(arg0, arg1 - this.method1130(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)I")
    public final int method1136(int arg0) {
        return this.field3451[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(Lvc;)I")
    private final int method1137(class137 arg0) {
        if (arg0.method1026(-1, field3449)) {
            return 16711680;
        } else if (arg0.method1026(-1, field3444)) {
            return 65280;
        } else if (arg0.method1026(-1, field3456)) {
            return 255;
        } else if (arg0.method1026(-1, field3454)) {
            return 16776960;
        } else if (arg0.method1026(-1, field3458)) {
            return 65535;
        } else if (arg0.method1026(-1, field3453)) {
            return 16711935;
        } else if (arg0.method1026(-1, field3457)) {
            return 16777215;
        } else if (arg0.method1026(-1, field3438)) {
            return 0;
        } else if (arg0.method1026(-1, field3435)) {
            return 16748608;
        } else if (arg0.method1026(-1, field3461)) {
            return 8388608;
        } else if (arg0.method1026(-1, field3440)) {
            return 128;
        } else if (arg0.method1026(-1, field3436)) {
            return 16756736;
        } else if (arg0.method1026(-1, field3437)) {
            return 16740352;
        } else if (arg0.method1026(-1, field3441)) {
            return 16723968;
        } else if (arg0.method1026(-1, field3448)) {
            return 12648192;
        } else if (arg0.method1026(-1, field3442)) {
            return 8453888;
        } else if (arg0.method1026(-1, field3450)) {
            return 4259584;
        } else {
            if (arg0.method1026(-1, field3445)) {
                field3439 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lvc;IIIZ)V")
    public final void method1138(class137 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method1147(arg0, arg1 - this.method1129(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lvc;IIIZI)V")
    private final void method1139(class137 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class137 var7 = arg0.method1034(48);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method997(-11); var9++) {
            if (var7.method1017(var9, 84) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method1129(var7)) * 256 / var8;
        }
        field3439 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field3452;
        for (int var14 = 0; var14 < var7.field3182; var14++) {
            if (var7.field3176[var14] == 64 && var14 + 4 < var7.field3182 && var7.field3176[var14 + 4] == 64) {
                int var15 = this.method1137(var7.method1013(var14 + 4, var14 + 1, (byte) 29));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field3176[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        method1127(this.field3460[var16], arg1 + 1, this.field3447[var16] + var13 + 1, this.field3451[var16], this.field3446[var16], 0);
                    }
                    method1127(this.field3460[var16], arg1, this.field3447[var16] + var13, this.field3451[var16], this.field3446[var16], arg3);
                }
                arg1 += this.field3451[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (field3439) {
            class62.method453(var12, (int) ((double) this.field3452 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Lvc;IIIZ)V")
    public final void method1140(class137 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method1147(arg0, arg1 - this.method1129(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BIIIIII)V")
    private static final void method1141(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class62.field1335 * arg2 + arg1;
        int var8 = class62.field1335 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class62.field1330) {
            int var11 = class62.field1330 - arg2;
            arg4 -= var11;
            arg2 = class62.field1330;
            var10 += arg3 * var11;
            var7 += class62.field1335 * var11;
        }
        if (arg2 + arg4 > class62.field1334) {
            arg4 -= arg2 + arg4 - class62.field1334;
        }
        if (arg1 < class62.field1332) {
            int var12 = class62.field1332 - arg1;
            arg3 -= var12;
            arg1 = class62.field1332;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class62.field1333) {
            int var13 = arg1 + arg3 - class62.field1333;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1148(class62.field1331, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Lvc;IIII)V")
    public final void method1142(class137 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method1130(arg0) / 2;
        int var7 = arg2 - this.field3452;
        for (int var8 = 0; var8 < arg0.method997(-40); var8++) {
            int var9 = arg0.field3176[var8] & 0xFF;
            if (var9 != 32) {
                method1127(this.field3460[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field3447[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field3451[var9], this.field3446[var9], arg3);
            }
            var6 += this.field3451[var9];
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Lvc;IIIZI)V")
    public final void method1143(class137 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field3443.setSeed((long) arg5);
        int var7 = (this.field3443.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field3452;
        for (int var9 = 0; var9 < arg0.field3182; var9++) {
            if (arg0.field3176[var9] == 64 && var9 + 4 < arg0.field3182 && arg0.field3176[var9 + 4] == 64) {
                int var10 = this.method1137(arg0.method1013(var9 + 4, var9 + 1, (byte) 55));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field3176[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        method1141(this.field3460[var11], arg1 + 1, this.field3447[var11] + var8 + 1, this.field3451[var11], this.field3446[var11], 0, 192);
                    }
                    method1141(this.field3460[var11], arg1, this.field3447[var11] + var8, this.field3451[var11], this.field3446[var11], arg3, var7);
                }
                arg1 += this.field3451[var11];
                if ((this.field3443.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lvc;I)I")
    public final int method1144(class137 arg0, int arg1) {
        int var3 = this.method1149(arg0, arg1, true);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1130(field3459[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "()V")
    public static void method1145() {
        field3445 = null;
        field3455 = null;
        field3449 = null;
        field3444 = null;
        field3456 = null;
        field3454 = null;
        field3458 = null;
        field3453 = null;
        field3457 = null;
        field3438 = null;
        field3435 = null;
        field3461 = null;
        field3440 = null;
        field3436 = null;
        field3437 = null;
        field3441 = null;
        field3448 = null;
        field3442 = null;
        field3450 = null;
        field3459 = null;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(Lvc;III)V")
    public final void method1146(class137 arg0, int arg1, int arg2, int arg3) {
        this.method1131(arg0, arg1 - this.method1130(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(Lvc;IIIZ)V")
    public final void method1147(class137 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3439 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field3452;
        for (int var8 = 0; var8 < arg0.field3182; var8++) {
            if (arg0.field3176[var8] == 64 && var8 + 4 < arg0.field3182 && arg0.field3176[var8 + 4] == 64) {
                int var9 = this.method1137(arg0.method1013(var8 + 4, var8 + 1, (byte) 56));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field3176[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        method1127(this.field3460[var10], arg1 + 1, this.field3447[var10] + var7 + 1, this.field3451[var10], this.field3446[var10], 0);
                    }
                    method1127(this.field3460[var10], arg1, this.field3447[var10] + var7, this.field3451[var10], this.field3446[var10], arg3);
                }
                arg1 += this.field3451[var10];
            }
        }
        if (field3439) {
            class62.method453(var6, (int) ((double) this.field3452 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method1148(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lvc;IZ)I")
    private final int method1149(class137 arg0, int arg1, boolean arg2) {
        int var4 = 0;
        int var5 = 0;
        class137 var6 = class80.method594(100, -128);
        int var7 = -1;
        int var8 = 0;
        class137 var9 = null;
        int var10 = 0;
        boolean var11 = false;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg0.method997(111);
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = arg0.method1017(var15, 81);
            if (var16 == 64 && var15 + 4 < var14 && arg0.method1017(var15 + 4, 90) == 64) {
                class137 var17 = arg0.method1013(var15 + 5, var15, (byte) 70);
                if (var17.method1026(-1, field3445)) {
                    var11 = true;
                    var12 = var6.method997(-90);
                } else {
                    var9 = var17;
                    var10 = var6.method997(127);
                }
                var6.method1027(var17, 30241);
                var15 += 4;
            } else if (var16 == 92 && var15 + 1 < var14 && arg0.method1017(var15 + 1, 43) == 110) {
                field3459[var13++] = var6.method1013(var6.method997(115), var5, (byte) 123).method1034(96);
                var5 = var6.method997(124);
                var4 = 0;
                var7 = -1;
                var15++;
                var9 = null;
                var11 = false;
            } else {
                var6.method1024(var16, 0);
                var4 += this.method1136(var16);
                if (var16 == 32 || var16 == 45) {
                    var7 = var6.method997(-66);
                    var8 = var4;
                }
                if (arg2 && var4 > arg1 && var7 >= 0) {
                    field3459[var13++] = var6.method1013(var7, var5, (byte) 57).method1034(110);
                    var5 = var7;
                    var7 = -1;
                    var4 -= var8;
                    if (var9 != null && var10 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method1025(var5, 103, var9);
                    }
                    if (var11 && var12 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method1025(var5, 90, field3455);
                    }
                }
            }
        }
        if (var6.method997(-99) > var5) {
            field3459[var13++] = var6.method1013(var6.method997(-52), var5, (byte) 70).method1034(105);
        }
        return var13;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Lvc;I)I")
    public final int method1150(class137 arg0, int arg1) {
        return this.method1149(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class145(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field3447 = arg0;
        this.field3451 = arg1;
        this.field3446 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field3460 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3447[var10] < var8 && this.field3446[var10] != 0) {
                var8 = this.field3447[var10];
            }
            if (this.field3447[var10] + this.field3446[var10] > var9) {
                var9 = this.field3447[var10] + this.field3446[var10];
            }
            byte[] var11 = this.field3460[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field3452 = this.field3447[32] + this.field3446[32];
        this.field3462 = this.field3452 - var8;
        this.field3463 = var9 - this.field3452;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([B)V")
    public class145(byte[] arg0) {
        this.field3451 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field3451.length; var2++) {
            this.field3451[var2] = arg0[var2] & 0xFF;
        }
    }
}
