import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class54 extends class120 {

    @OriginalMember(owner = "client!j", name = "db", descriptor = "[[B")
    private byte[][] field1239 = new byte[256][];

    @OriginalMember(owner = "client!j", name = "tb", descriptor = "I")
    public int field1255 = 0;

    @OriginalMember(owner = "client!j", name = "nb", descriptor = "Ljava/util/Random;")
    private Random field1249 = new Random();

    @OriginalMember(owner = "client!j", name = "ub", descriptor = "Z")
    private boolean field1256 = false;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "[I")
    private int[] field1241;

    @OriginalMember(owner = "client!j", name = "kb", descriptor = "[I")
    private int[] field1246;

    @OriginalMember(owner = "client!j", name = "lb", descriptor = "[I")
    private int[] field1247;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "Lec;")
    private static class28 field1236 = class28.method210(-46, "dre");

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "Lec;")
    private static class28 field1237 = class28.method210(-46, "mag");

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "Lec;")
    private static class28 field1235 = class28.method210(-46, "whi");

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "Lec;")
    private static class28 field1238 = class28.method210(-46, "red");

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "Lec;")
    private static class28 field1234 = class28.method210(-46, "yel");

    @OriginalMember(owner = "client!j", name = "U", descriptor = "Lec;")
    private static class28 field1233 = class28.method210(-46, "gr1");

    @OriginalMember(owner = "client!j", name = "ib", descriptor = "Lec;")
    private static class28 field1244 = class28.method210(-46, "or3");

    @OriginalMember(owner = "client!j", name = "pb", descriptor = "Lec;")
    private static class28 field1251 = class28.method210(-46, "str");

    @OriginalMember(owner = "client!j", name = "ob", descriptor = "Lec;")
    private static class28 field1250 = class28.method210(-46, "gre");

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "Lec;")
    private static class28 field1242 = class28.method210(-46, "gr3");

    @OriginalMember(owner = "client!j", name = "mb", descriptor = "Lec;")
    private static class28 field1248 = class28.method210(-46, "or2");

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "Lec;")
    private static class28 field1243 = class28.method210(-46, "dbl");

    @OriginalMember(owner = "client!j", name = "jb", descriptor = "Lec;")
    private static class28 field1245 = class28.method210(-46, "or1");

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "Lec;")
    private static class28 field1240 = class28.method210(-46, "blu");

    @OriginalMember(owner = "client!j", name = "rb", descriptor = "Lec;")
    private static class28 field1253 = class28.method210(-46, "cya");

    @OriginalMember(owner = "client!j", name = "qb", descriptor = "Lec;")
    private static class28 field1252 = class28.method210(-46, "lre");

    @OriginalMember(owner = "client!j", name = "sb", descriptor = "Lec;")
    private static class28 field1254 = class28.method210(-46, "gr2");

    @OriginalMember(owner = "client!j", name = "vb", descriptor = "Lec;")
    private static class28 field1257 = class28.method210(-46, "bla");

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lec;IIIZ)V")
    public final void method433(class28 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method441(arg0, arg1 - this.method446(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I[BIIIIIIII)V")
    private final void method434(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var12 = 256 - arg9;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var15 = arg0[arg4];
                    arg0[arg4++] = (((var15 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * var12 & 0xFF0000) >> 8) + var11;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lec;III)V")
    public final void method435(class28 arg0, int arg1, int arg2, int arg3) {
        this.method449(arg0, arg1 - this.method437(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lec;)I")
    private final int method436(class28 arg0) {
        if (arg0.method219(70, field1238)) {
            return 16711680;
        } else if (arg0.method219(63, field1250)) {
            return 65280;
        } else if (arg0.method219(79, field1240)) {
            return 255;
        } else if (arg0.method219(86, field1234)) {
            return 16776960;
        } else if (arg0.method219(96, field1253)) {
            return 65535;
        } else if (arg0.method219(44, field1237)) {
            return 16711935;
        } else if (arg0.method219(96, field1235)) {
            return 16777215;
        } else if (arg0.method219(63, field1257)) {
            return 0;
        } else if (arg0.method219(104, field1252)) {
            return 16748608;
        } else if (arg0.method219(90, field1236)) {
            return 8388608;
        } else if (arg0.method219(126, field1243)) {
            return 128;
        } else if (arg0.method219(73, field1245)) {
            return 16756736;
        } else if (arg0.method219(51, field1248)) {
            return 16740352;
        } else if (arg0.method219(63, field1244)) {
            return 16723968;
        } else if (arg0.method219(64, field1233)) {
            return 12648192;
        } else if (arg0.method219(107, field1254)) {
            return 8453888;
        } else if (arg0.method219(46, field1242)) {
            return 4259584;
        } else {
            if (arg0.method219(42, field1251)) {
                this.field1256 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Lec;)I")
    public final int method437(class28 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field606; var3++) {
            var2 += this.field1246[arg0.field628[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lec;IIII)V")
    public final void method438(class28 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method437(arg0) / 2;
        int var7 = arg2 - this.field1255;
        for (int var8 = 0; var8 < arg0.method214(118); var8++) {
            int var9 = arg0.field628[var8] & 0xFF;
            if (var9 != 32) {
                this.method443(this.field1239[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field1241[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field1246[var9], this.field1247[var9], arg3);
            }
            var6 += this.field1246[var9];
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lec;IIIII)V")
    public final void method439(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method437(arg0) / 2;
        int var10 = arg2 - this.field1255;
        for (int var11 = 0; var11 < arg0.method214(120); var11++) {
            int var12 = arg0.field628[var11] & 0xFF;
            if (var12 != 32) {
                this.method443(this.field1239[var12], var9, this.field1241[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field1246[var12], this.field1247[var12], arg3);
            }
            var9 += this.field1246[var12];
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Lec;IIII)V")
    public final void method440(class28 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method437(arg0) / 2;
        int var7 = arg2 - this.field1255;
        for (int var8 = 0; var8 < arg0.field606; var8++) {
            int var9 = arg0.field628[var8] & 0xFF;
            if (var9 != 32) {
                this.method443(this.field1239[var9], var6, this.field1241[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field1246[var9], this.field1247[var9], arg3);
            }
            var6 += this.field1246[var9];
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Lec;IIIZ)V")
    public final void method441(class28 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1256 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field1255;
        for (int var8 = 0; var8 < arg0.field606; var8++) {
            if (arg0.field628[var8] == 64 && var8 + 4 < arg0.field606 && arg0.field628[var8 + 4] == 64) {
                int var9 = this.method436(arg0.method228(var8 + 4, true, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field628[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method443(this.field1239[var10], arg1 + 1, this.field1241[var10] + var7 + 1, this.field1246[var10], this.field1247[var10], 0);
                    }
                    this.method443(this.field1239[var10], arg1, this.field1241[var10] + var7, this.field1246[var10], this.field1247[var10], arg3);
                }
                arg1 += this.field1246[var10];
            }
        }
        if (this.field1256) {
            class120.method909(var6, (int) ((double) this.field1255 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([BIIIIII)V")
    private final void method442(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class120.field2591 * arg2 + arg1;
        int var9 = class120.field2591 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class120.field2593) {
            int var12 = class120.field2593 - arg2;
            arg4 -= var12;
            arg2 = class120.field2593;
            var11 += arg3 * var12;
            var8 += class120.field2591 * var12;
        }
        if (arg2 + arg4 > class120.field2592) {
            arg4 -= arg2 + arg4 - class120.field2592;
        }
        if (arg1 < class120.field2596) {
            int var13 = class120.field2596 - arg1;
            arg3 -= var13;
            arg1 = class120.field2596;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class120.field2590) {
            int var14 = arg1 + arg3 - class120.field2590;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method434(class120.field2594, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([BIIIII)V")
    private final void method443(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class120.field2591 * arg2 + arg1;
        int var8 = class120.field2591 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class120.field2593) {
            int var11 = class120.field2593 - arg2;
            arg4 -= var11;
            arg2 = class120.field2593;
            var10 += arg3 * var11;
            var7 += class120.field2591 * var11;
        }
        if (arg2 + arg4 > class120.field2592) {
            arg4 -= arg2 + arg4 - class120.field2592;
        }
        if (arg1 < class120.field2596) {
            int var12 = class120.field2596 - arg1;
            arg3 -= var12;
            arg1 = class120.field2596;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class120.field2590) {
            int var13 = arg1 + arg3 - class120.field2590;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method447(class120.field2594, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Lec;III)V")
    public final void method444(class28 arg0, int arg1, int arg2, int arg3) {
        this.method449(arg0, arg1 - this.method437(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()V")
    public static void method445() {
        field1238 = null;
        field1250 = null;
        field1240 = null;
        field1234 = null;
        field1253 = null;
        field1237 = null;
        field1235 = null;
        field1257 = null;
        field1252 = null;
        field1236 = null;
        field1243 = null;
        field1245 = null;
        field1248 = null;
        field1244 = null;
        field1233 = null;
        field1254 = null;
        field1242 = null;
        field1251 = null;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Lec;)I")
    public final int method446(class28 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field606; var3++) {
            if (arg0.field628[var3] == 64 && var3 + 4 < arg0.field606 && arg0.field628[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field1246[arg0.field628[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I[BIIIIIII)V")
    private final void method447(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
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
            for (int var14 = var11; var14 < 0; var14++) {
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

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lec;IIIZI)V")
    public final void method448(class28 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field1249.setSeed((long) arg5);
        int var7 = (this.field1249.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field1255;
        for (int var9 = 0; var9 < arg0.field606; var9++) {
            if (arg0.field628[var9] == 64 && var9 + 4 < arg0.field606 && arg0.field628[var9 + 4] == 64) {
                int var10 = this.method436(arg0.method228(var9 + 4, true, var9 + 1));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field628[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method442(this.field1239[var11], arg1 + 1, this.field1241[var11] + var8 + 1, this.field1246[var11], this.field1247[var11], 0, 192);
                    }
                    this.method442(this.field1239[var11], arg1, this.field1241[var11] + var8, this.field1246[var11], this.field1247[var11], arg3, var7);
                }
                arg1 += this.field1246[var11];
                if ((this.field1249.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Lec;III)V")
    public final void method449(class28 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field1255;
        for (int var6 = 0; var6 < arg0.field606; var6++) {
            int var7 = arg0.field628[var6] & 0xFF;
            if (var7 != 32) {
                this.method443(this.field1239[var7], arg1, this.field1241[var7] + var5, this.field1246[var7], this.field1247[var7], arg3);
            }
            arg1 += this.field1246[var7];
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class54(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field1241 = arg0;
        this.field1246 = arg1;
        this.field1247 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field1239 = arg4;
        for (int var8 = 0; var8 < 256; var8++) {
            byte[] var9 = this.field1239[var8];
            int var10 = var9.length;
            for (int var11 = 0; var11 < var10; var11++) {
                var9[var11] = (byte) (var9[var11] == var6 ? 0 : 1);
            }
        }
        this.field1255 = this.field1247[32] + this.field1241[32];
    }
}
