import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class54 extends class66 {

    @OriginalMember(owner = "client!j", name = "rb", descriptor = "I")
    public int field1341 = 0;

    @OriginalMember(owner = "client!j", name = "ob", descriptor = "[[B")
    private byte[][] field1338 = new byte[256][];

    @OriginalMember(owner = "client!j", name = "ib", descriptor = "Ljava/util/Random;")
    private Random field1332 = new Random();

    @OriginalMember(owner = "client!j", name = "xb", descriptor = "Z")
    private boolean field1347 = false;

    @OriginalMember(owner = "client!j", name = "jb", descriptor = "[I")
    private int[] field1333;

    @OriginalMember(owner = "client!j", name = "tb", descriptor = "[I")
    private int[] field1343;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "[I")
    private int[] field1322;

    @OriginalMember(owner = "client!j", name = "yb", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client!j", name = "zb", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client!j", name = "db", descriptor = "Lmc;")
    private static class75 field1327 = class30.method234(true, "gr1");

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "Lmc;")
    private static class75 field1324 = class30.method234(true, "lre");

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "Lmc;")
    private static class75 field1329 = class30.method234(true, "dbl");

    @OriginalMember(owner = "client!j", name = "nb", descriptor = "Lmc;")
    private static class75 field1337 = class30.method234(true, "gr2");

    @OriginalMember(owner = "client!j", name = "lb", descriptor = "Lmc;")
    private static class75 field1335 = class30.method234(true, "red");

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "Lmc;")
    private static class75 field1328 = class30.method234(true, "whi");

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "Lmc;")
    private static class75 field1330 = class30.method234(true, "str");

    @OriginalMember(owner = "client!j", name = "mb", descriptor = "Lmc;")
    private static class75 field1336 = class30.method234(true, "or2");

    @OriginalMember(owner = "client!j", name = "qb", descriptor = "Lmc;")
    private static class75 field1340 = class30.method234(true, "dre");

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "Lmc;")
    private static class75 field1326 = class30.method234(true, "gr3");

    @OriginalMember(owner = "client!j", name = "pb", descriptor = "Lmc;")
    private static class75 field1339 = class30.method234(true, "gre");

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "Lmc;")
    private static class75 field1331 = class30.method234(true, "blu");

    @OriginalMember(owner = "client!j", name = "vb", descriptor = "[Lmc;")
    private static class75[] field1345 = new class75[100];

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "Lmc;")
    private static class75 field1323 = class30.method234(true, "or3");

    @OriginalMember(owner = "client!j", name = "sb", descriptor = "Lmc;")
    private static class75 field1342 = class30.method234(true, "cya");

    @OriginalMember(owner = "client!j", name = "ub", descriptor = "Lmc;")
    private static class75 field1344 = class30.method234(true, "bla");

    @OriginalMember(owner = "client!j", name = "kb", descriptor = "Lmc;")
    private static class75 field1334 = class30.method234(true, "yel");

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "Lmc;")
    private static class75 field1325 = class30.method234(true, "or1");

    @OriginalMember(owner = "client!j", name = "wb", descriptor = "Lmc;")
    private static class75 field1346 = class30.method234(true, "mag");

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lmc;IIIIIZIII)V", line = 5)
    public final void method408(class75 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        int var12 = 0;
        class75 var13 = class6.method29(100, 120);
        int var14 = -1;
        int var15 = 0;
        class75 var16 = null;
        if (arg9 == 0) {
            arg9 = this.field1348;
        }
        boolean var17 = true;
        if (arg4 < this.field1349 + this.field1348 + arg9 && arg4 < arg9 + arg9) {
            var17 = false;
        }
        int var18 = 0;
        int var19 = arg0.method621(-19198);
        for (int var20 = 0; var20 < var19; var20++) {
            int var24 = arg0.method656(true, var20);
            if (var24 == 64 && var20 + 4 < var19 && arg0.method656(true, var20 + 4) == 64) {
                var16 = arg0.method647(0, var20, var20 + 5);
                var13.method654(13, var16);
                var20 += 4;
            } else if (var24 == 92 && var20 + 1 < var19 && arg0.method656(true, var20 + 1) == 110) {
                var16 = null;
                field1345[var18++] = var13.method647(0, var12, var13.method621(-19198)).method637(90);
                var12 = var13.method621(-19198);
                var11 = 0;
                var14 = -1;
                var20++;
            } else {
                var13.method649(99, var24);
                var11 += this.method425(var24);
                if (var24 == 32 || var24 == 45) {
                    var14 = var13.method621(-19198);
                    var15 = var11;
                }
                if (var17 && var11 > arg3 && var14 >= 0) {
                    field1345[var18++] = var13.method647(0, var12, var14).method637(90);
                    var12 = var14;
                    var14 = -1;
                    var11 -= var15;
                    if (var16 != null && var12 > 4) {
                        var12 -= 5;
                        var13.method622(var12, 27642, var16);
                    }
                }
            }
        }
        if (var13.method621(-19198) > var12) {
            field1345[var18++] = var13.method647(0, var12, var13.method621(-19198)).method637(90);
        }
        if (arg8 == 3 && var18 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field1348 + arg2;
        } else if (arg8 == 1) {
            var21 = (arg4 - this.field1348 - this.field1349 - (var18 - 1) * arg9) / 2 + this.field1348 + arg2;
        } else if (arg8 == 2) {
            var21 = arg2 + arg4 - this.field1349 - (var18 - 1) * arg9;
        } else {
            int var22 = (arg4 - this.field1348 - this.field1349 - (var18 - 1) * arg9) / (var18 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            var21 = this.field1348 + arg2 + var22;
            arg9 += var22;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            if (arg7 == 0) {
                this.method412(field1345[var23], arg1, var21, arg5, arg6);
            } else if (arg7 == 1) {
                this.method424(field1345[var23], arg3 / 2 + arg1, var21, arg5, arg6);
            } else if (arg7 == 2) {
                this.method426(field1345[var23], arg1 + arg3, var21, arg5, arg6);
            } else if (var18 - 1 == var23) {
                this.method412(field1345[var23], arg1, var21, arg5, arg6);
            } else {
                this.method422(field1345[var23], arg1, var21, arg5, arg6, arg3);
            }
            var21 += arg9;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lmc;IIII)V", line = 144)
    public final void method409(class75 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method410(arg0) / 2;
        int var7 = arg2 - this.field1341;
        for (int var8 = 0; var8 < arg0.field1869; var8++) {
            int var9 = arg0.field1912[var8] & 0xFF;
            if (var9 != 32) {
                this.method415(this.field1338[var9], var6, this.field1333[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field1343[var9], this.field1322[var9], arg3);
            }
            var6 += this.field1343[var9];
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lmc;)I", line = 168)
    public final int method410(class75 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field1869; var3++) {
            var2 += this.field1343[arg0.field1912[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Lmc;IIII)V", line = 183)
    public final void method411(class75 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method410(arg0) / 2;
        int var7 = arg2 - this.field1341;
        for (int var8 = 0; var8 < arg0.method621(-19198); var8++) {
            int var9 = arg0.field1912[var8] & 0xFF;
            if (var9 != 32) {
                this.method415(this.field1338[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field1333[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field1343[var9], this.field1322[var9], arg3);
            }
            var6 += this.field1343[var9];
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lmc;IIIZ)V", line = 206)
    public final void method412(class75 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1347 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field1341;
        for (int var8 = 0; var8 < arg0.field1869; var8++) {
            if (arg0.field1912[var8] == 64 && var8 + 4 < arg0.field1869 && arg0.field1912[var8 + 4] == 64) {
                int var9 = this.method413(arg0.method647(0, var8 + 1, var8 + 4));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field1912[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method415(this.field1338[var10], arg1 + 1, this.field1333[var10] + var7 + 1, this.field1343[var10], this.field1322[var10], 0);
                    }
                    this.method415(this.field1338[var10], arg1, this.field1333[var10] + var7, this.field1343[var10], this.field1322[var10], arg3);
                }
                arg1 += this.field1343[var10];
            }
        }
        if (this.field1347) {
            class66.method580(var6, (int) ((double) this.field1341 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Lmc;)I", line = 251)
    private final int method413(class75 arg0) {
        if (arg0.method635(field1335, 18573)) {
            return 16711680;
        } else if (arg0.method635(field1339, 18573)) {
            return 65280;
        } else if (arg0.method635(field1331, 18573)) {
            return 255;
        } else if (arg0.method635(field1334, 18573)) {
            return 16776960;
        } else if (arg0.method635(field1342, 18573)) {
            return 65535;
        } else if (arg0.method635(field1346, 18573)) {
            return 16711935;
        } else if (arg0.method635(field1328, 18573)) {
            return 16777215;
        } else if (arg0.method635(field1344, 18573)) {
            return 0;
        } else if (arg0.method635(field1324, 18573)) {
            return 16748608;
        } else if (arg0.method635(field1340, 18573)) {
            return 8388608;
        } else if (arg0.method635(field1329, 18573)) {
            return 128;
        } else if (arg0.method635(field1325, 18573)) {
            return 16756736;
        } else if (arg0.method635(field1336, 18573)) {
            return 16740352;
        } else if (arg0.method635(field1323, 18573)) {
            return 16723968;
        } else if (arg0.method635(field1327, 18573)) {
            return 12648192;
        } else if (arg0.method635(field1337, 18573)) {
            return 8453888;
        } else if (arg0.method635(field1326, 18573)) {
            return 4259584;
        } else {
            if (arg0.method635(field1330, 18573)) {
                this.field1347 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([BIIIIII)V", line = 315)
    private final void method414(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class66.field1721 * arg2 + arg1;
        int var9 = class66.field1721 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class66.field1717) {
            int var12 = class66.field1717 - arg2;
            arg4 -= var12;
            arg2 = class66.field1717;
            var11 += arg3 * var12;
            var8 += class66.field1721 * var12;
        }
        if (arg2 + arg4 > class66.field1718) {
            arg4 -= arg2 + arg4 - class66.field1718;
        }
        if (arg1 < class66.field1716) {
            int var13 = class66.field1716 - arg1;
            arg3 -= var13;
            arg1 = class66.field1716;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class66.field1719) {
            int var14 = arg1 + arg3 - class66.field1719;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method416(class66.field1722, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([BIIIII)V", line = 369)
    private final void method415(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class66.field1721 * arg2 + arg1;
        int var8 = class66.field1721 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class66.field1717) {
            int var11 = class66.field1717 - arg2;
            arg4 -= var11;
            arg2 = class66.field1717;
            var10 += arg3 * var11;
            var7 += class66.field1721 * var11;
        }
        if (arg2 + arg4 > class66.field1718) {
            arg4 -= arg2 + arg4 - class66.field1718;
        }
        if (arg1 < class66.field1716) {
            int var12 = class66.field1716 - arg1;
            arg3 -= var12;
            arg1 = class66.field1716;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class66.field1719) {
            int var13 = arg1 + arg3 - class66.field1719;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method420(class66.field1722, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I[BIIIIIIII)V", line = 417)
    private final void method416(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lmc;IIIII)V", line = 448)
    public final void method417(class75 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method410(arg0) / 2;
        int var10 = arg2 - this.field1341;
        for (int var11 = 0; var11 < arg0.method621(-19198); var11++) {
            int var12 = arg0.field1912[var11] & 0xFF;
            if (var12 != 32) {
                this.method415(this.field1338[var12], var9, this.field1333[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field1343[var12], this.field1322[var12], arg3);
            }
            var9 += this.field1343[var12];
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lmc;IIIZI)V", line = 479)
    public final void method418(class75 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field1332.setSeed((long) arg5);
        int var7 = (this.field1332.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field1341;
        for (int var9 = 0; var9 < arg0.field1869; var9++) {
            if (arg0.field1912[var9] == 64 && var9 + 4 < arg0.field1869 && arg0.field1912[var9 + 4] == 64) {
                int var10 = this.method413(arg0.method647(0, var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field1912[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method414(this.field1338[var11], arg1 + 1, this.field1333[var11] + var8 + 1, this.field1343[var11], this.field1322[var11], 0, 192);
                    }
                    this.method414(this.field1338[var11], arg1, this.field1333[var11] + var8, this.field1343[var11], this.field1322[var11], arg3, var7);
                }
                arg1 += this.field1343[var11];
                if ((this.field1332.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()V", line = 522)
    public static void method419() {
        field1335 = null;
        field1339 = null;
        field1331 = null;
        field1334 = null;
        field1342 = null;
        field1346 = null;
        field1328 = null;
        field1344 = null;
        field1324 = null;
        field1340 = null;
        field1329 = null;
        field1325 = null;
        field1336 = null;
        field1323 = null;
        field1327 = null;
        field1337 = null;
        field1326 = null;
        field1330 = null;
        field1345 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I[BIIIIIII)V", line = 549)
    private final void method420(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Lmc;)I", line = 607)
    public final int method421(class75 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field1869; var3++) {
            if (arg0.field1912[var3] == 64 && var3 + 4 < arg0.field1869 && arg0.field1912[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field1343[arg0.field1912[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Lmc;IIIZI)V", line = 630)
    private final void method422(class75 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class75 var7 = arg0.method637(90);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method621(-19198); var9++) {
            if (var7.method656(true, var9) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method421(var7)) * 256 / var8;
        }
        this.field1347 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field1341;
        for (int var14 = 0; var14 < var7.field1869; var14++) {
            if (var7.field1912[var14] == 64 && var14 + 4 < var7.field1869 && var7.field1912[var14 + 4] == 64) {
                int var15 = this.method413(var7.method647(0, var14 + 1, var14 + 4));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field1912[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method415(this.field1338[var16], arg1 + 1, this.field1333[var16] + var13 + 1, this.field1343[var16], this.field1322[var16], 0);
                    }
                    this.method415(this.field1338[var16], arg1, this.field1333[var16] + var13, this.field1343[var16], this.field1322[var16], arg3);
                }
                arg1 += this.field1343[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field1347) {
            class66.method580(var12, (int) ((double) this.field1341 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lmc;III)V", line = 706)
    public final void method423(class75 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field1341;
        for (int var6 = 0; var6 < arg0.field1869; var6++) {
            int var7 = arg0.field1912[var6] & 0xFF;
            if (var7 != 32) {
                this.method415(this.field1338[var7], arg1, this.field1333[var7] + var5, this.field1343[var7], this.field1322[var7], arg3);
            }
            arg1 += this.field1343[var7];
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Lmc;IIIZ)V", line = 737)
    public final void method424(class75 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method412(arg0, arg1 - this.method421(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 802)
    public class54(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field1333 = arg0;
        this.field1343 = arg1;
        this.field1322 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field1338 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field1333[var10] < var8) {
                var8 = this.field1333[var10];
            }
            if (this.field1333[var10] + this.field1322[var10] > var9) {
                var9 = this.field1333[var10] + this.field1322[var10];
            }
            byte[] var11 = this.field1338[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field1341 = this.field1333[32] + this.field1322[32];
        this.field1348 = this.field1341 - var8;
        this.field1349 = var9 - this.field1341;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)I", line = 744)
    public final int method425(int arg0) {
        return this.field1343[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Lmc;IIIZ)V", line = 760)
    public final void method426(class75 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method412(arg0, arg1 - this.method421(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Lmc;III)V", line = 783)
    public final void method427(class75 arg0, int arg1, int arg2, int arg3) {
        this.method423(arg0, arg1 - this.method410(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Lmc;III)V", line = 800)
    public final void method428(class75 arg0, int arg1, int arg2, int arg3) {
        this.method423(arg0, arg1 - this.method410(arg0), arg2, arg3);
    }
}
