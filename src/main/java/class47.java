import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class47 extends class27 {

    @OriginalMember(owner = "client!he", name = "gb", descriptor = "I")
    public int field1171 = 0;

    @OriginalMember(owner = "client!he", name = "ib", descriptor = "[[B")
    private byte[][] field1173 = new byte[256][];

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "Ljava/util/Random;")
    private Random field1170 = new Random();

    @OriginalMember(owner = "client!he", name = "Fb", descriptor = "Z")
    private boolean field1196 = false;

    @OriginalMember(owner = "client!he", name = "pb", descriptor = "[I")
    private int[] field1180;

    @OriginalMember(owner = "client!he", name = "kb", descriptor = "[I")
    private int[] field1175;

    @OriginalMember(owner = "client!he", name = "qb", descriptor = "[I")
    private int[] field1181;

    @OriginalMember(owner = "client!he", name = "Cb", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client!he", name = "Db", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client!he", name = "jb", descriptor = "Lgd;")
    private static class40 field1174 = class14.method90(false, "gre");

    @OriginalMember(owner = "client!he", name = "lb", descriptor = "Lgd;")
    private static class40 field1176 = class14.method90(false, "str");

    @OriginalMember(owner = "client!he", name = "nb", descriptor = "Lgd;")
    private static class40 field1178 = class14.method90(false, "gr2");

    @OriginalMember(owner = "client!he", name = "ob", descriptor = "Lgd;")
    private static class40 field1179 = class14.method90(false, "blu");

    @OriginalMember(owner = "client!he", name = "tb", descriptor = "Lgd;")
    private static class40 field1184 = class14.method90(false, "dbl");

    @OriginalMember(owner = "client!he", name = "mb", descriptor = "Lgd;")
    private static class40 field1177 = class14.method90(false, "cya");

    @OriginalMember(owner = "client!he", name = "rb", descriptor = "Lgd;")
    private static class40 field1182 = class14.method90(false, "mag");

    @OriginalMember(owner = "client!he", name = "wb", descriptor = "Lgd;")
    private static class40 field1187 = class14.method90(false, "whi");

    @OriginalMember(owner = "client!he", name = "xb", descriptor = "Lgd;")
    private static class40 field1188 = class14.method90(false, "@str@");

    @OriginalMember(owner = "client!he", name = "yb", descriptor = "Lgd;")
    private static class40 field1189 = class14.method90(false, "gr3");

    @OriginalMember(owner = "client!he", name = "zb", descriptor = "[Lgd;")
    private static class40[] field1190 = new class40[100];

    @OriginalMember(owner = "client!he", name = "vb", descriptor = "Lgd;")
    private static class40 field1186 = class14.method90(false, "dre");

    @OriginalMember(owner = "client!he", name = "hb", descriptor = "Lgd;")
    private static class40 field1172 = class14.method90(false, "or2");

    @OriginalMember(owner = "client!he", name = "Bb", descriptor = "Lgd;")
    private static class40 field1192 = class14.method90(false, "gr1");

    @OriginalMember(owner = "client!he", name = "Ab", descriptor = "Lgd;")
    private static class40 field1191 = class14.method90(false, "bla");

    @OriginalMember(owner = "client!he", name = "ub", descriptor = "Lgd;")
    private static class40 field1185 = class14.method90(false, "red");

    @OriginalMember(owner = "client!he", name = "Eb", descriptor = "Lgd;")
    private static class40 field1195 = class14.method90(false, "or3");

    @OriginalMember(owner = "client!he", name = "sb", descriptor = "Lgd;")
    private static class40 field1183 = class14.method90(false, "lre");

    @OriginalMember(owner = "client!he", name = "Gb", descriptor = "Lgd;")
    private static class40 field1197 = class14.method90(false, "or1");

    @OriginalMember(owner = "client!he", name = "Hb", descriptor = "Lgd;")
    private static class40 field1198 = class14.method90(false, "yel");

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()V", line = 3)
    public static void method344() {
        field1176 = null;
        field1188 = null;
        field1185 = null;
        field1174 = null;
        field1179 = null;
        field1198 = null;
        field1177 = null;
        field1182 = null;
        field1187 = null;
        field1191 = null;
        field1183 = null;
        field1186 = null;
        field1184 = null;
        field1197 = null;
        field1172 = null;
        field1195 = null;
        field1192 = null;
        field1178 = null;
        field1189 = null;
        field1190 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([I[BIIIIIIII)V", line = 25)
    private final void method345(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgd;)I", line = 56)
    private final int method346(class40 arg0) {
        if (arg0.method269(field1185, -62)) {
            return 16711680;
        } else if (arg0.method269(field1174, -62)) {
            return 65280;
        } else if (arg0.method269(field1179, -62)) {
            return 255;
        } else if (arg0.method269(field1198, -62)) {
            return 16776960;
        } else if (arg0.method269(field1177, -62)) {
            return 65535;
        } else if (arg0.method269(field1182, -62)) {
            return 16711935;
        } else if (arg0.method269(field1187, -62)) {
            return 16777215;
        } else if (arg0.method269(field1191, -62)) {
            return 0;
        } else if (arg0.method269(field1183, -62)) {
            return 16748608;
        } else if (arg0.method269(field1186, -62)) {
            return 8388608;
        } else if (arg0.method269(field1184, -62)) {
            return 128;
        } else if (arg0.method269(field1197, -62)) {
            return 16756736;
        } else if (arg0.method269(field1172, -62)) {
            return 16740352;
        } else if (arg0.method269(field1195, -62)) {
            return 16723968;
        } else if (arg0.method269(field1192, -62)) {
            return 12648192;
        } else if (arg0.method269(field1178, -62)) {
            return 8453888;
        } else if (arg0.method269(field1189, -62)) {
            return 4259584;
        } else {
            if (arg0.method269(field1176, -62)) {
                this.field1196 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgd;I)I", line = 113)
    public final int method347(class40 arg0, int arg1) {
        return this.method361(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgd;III)V", line = 117)
    public final void method348(class40 arg0, int arg1, int arg2, int arg3) {
        this.method353(arg0, arg1 - this.method367(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Lgd;III)V", line = 123)
    public final void method349(class40 arg0, int arg1, int arg2, int arg3) {
        this.method353(arg0, arg1 - this.method367(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I", line = 127)
    public final int method350(int arg0) {
        return this.field1175[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgd;IIIZ)V", line = 130)
    public final void method351(class40 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method358(arg0, arg1 - this.method362(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgd;IIIZI)V", line = 133)
    private final void method352(class40 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class40 var7 = arg0.method259((byte) 113);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method255(-10); var9++) {
            if (var7.method249((byte) -95, var9) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method362(var7)) * 256 / var8;
        }
        this.field1196 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field1171;
        for (int var14 = 0; var14 < var7.field950; var14++) {
            if (var7.field948[var14] == 64 && var14 + 4 < var7.field950 && var7.field948[var14 + 4] == 64) {
                int var15 = this.method346(var7.method242(var14 + 1, -12448, var14 + 4));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field948[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method363(this.field1173[var16], arg1 + 1, this.field1180[var16] + var13 + 1, this.field1175[var16], this.field1181[var16], 0);
                    }
                    this.method363(this.field1173[var16], arg1, this.field1180[var16] + var13, this.field1175[var16], this.field1181[var16], arg3);
                }
                arg1 += this.field1175[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field1196) {
            class27.method171(var12, (int) ((double) this.field1171 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(Lgd;III)V", line = 201)
    public final void method353(class40 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field1171;
        for (int var6 = 0; var6 < arg0.field950; var6++) {
            int var7 = arg0.field948[var6] & 0xFF;
            if (var7 != 32) {
                this.method363(this.field1173[var7], arg1, this.field1180[var7] + var5, this.field1175[var7], this.field1181[var7], arg3);
            }
            arg1 += this.field1175[var7];
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Lgd;IIIZI)V", line = 222)
    public final void method354(class40 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field1170.setSeed((long) arg5);
        int var7 = (this.field1170.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field1171;
        for (int var9 = 0; var9 < arg0.field950; var9++) {
            if (arg0.field948[var9] == 64 && var9 + 4 < arg0.field950 && arg0.field948[var9 + 4] == 64) {
                int var10 = this.method346(arg0.method242(var9 + 1, -12448, var9 + 4));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field948[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method365(this.field1173[var11], arg1 + 1, this.field1180[var11] + var8 + 1, this.field1175[var11], this.field1181[var11], 0, 192);
                    }
                    this.method365(this.field1173[var11], arg1, this.field1180[var11] + var8, this.field1175[var11], this.field1181[var11], arg3, var7);
                }
                arg1 += this.field1175[var11];
                if ((this.field1170.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgd;IIII)V", line = 264)
    public final void method355(class40 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method367(arg0) / 2;
        int var7 = arg2 - this.field1171;
        for (int var8 = 0; var8 < arg0.field950; var8++) {
            int var9 = arg0.field948[var8] & 0xFF;
            if (var9 != 32) {
                this.method363(this.field1173[var9], var6, this.field1180[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field1175[var9], this.field1181[var9], arg3);
            }
            var6 += this.field1175[var9];
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Lgd;I)I", line = 287)
    public final int method356(class40 arg0, int arg1) {
        int var3 = this.method361(arg0, arg1, true);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method367(field1190[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([I[BIIIIIII)V", line = 322)
    private final void method357(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Lgd;IIIZ)V", line = 378)
    public final void method358(class40 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1196 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field1171;
        for (int var8 = 0; var8 < arg0.field950; var8++) {
            if (arg0.field948[var8] == 64 && var8 + 4 < arg0.field950 && arg0.field948[var8 + 4] == 64) {
                int var9 = this.method346(arg0.method242(var8 + 1, -12448, var8 + 4));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field948[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method363(this.field1173[var10], arg1 + 1, this.field1180[var10] + var7 + 1, this.field1175[var10], this.field1181[var10], 0);
                    }
                    this.method363(this.field1173[var10], arg1, this.field1180[var10] + var7, this.field1175[var10], this.field1181[var10], arg3);
                }
                arg1 += this.field1175[var10];
            }
        }
        if (this.field1196) {
            class27.method171(var6, (int) ((double) this.field1171 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Lgd;IIII)V", line = 421)
    public final void method359(class40 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method367(arg0) / 2;
        int var7 = arg2 - this.field1171;
        for (int var8 = 0; var8 < arg0.method255(-10); var8++) {
            int var9 = arg0.field948[var8] & 0xFF;
            if (var9 != 32) {
                this.method363(this.field1173[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field1180[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field1175[var9], this.field1181[var9], arg3);
            }
            var6 += this.field1175[var9];
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgd;IIIII)V", line = 445)
    public final void method360(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method367(arg0) / 2;
        int var10 = arg2 - this.field1171;
        for (int var11 = 0; var11 < arg0.method255(-10); var11++) {
            int var12 = arg0.field948[var11] & 0xFF;
            if (var12 != 32) {
                this.method363(this.field1173[var12], var9, this.field1180[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field1175[var12], this.field1181[var12], arg3);
            }
            var9 += this.field1175[var12];
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgd;IZ)I", line = 472)
    private final int method361(class40 arg0, int arg1, boolean arg2) {
        int var4 = 0;
        int var5 = 0;
        class40 var6 = class48.method369(100, true);
        int var7 = -1;
        int var8 = 0;
        class40 var9 = null;
        int var10 = 0;
        boolean var11 = false;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg0.method255(-10);
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = arg0.method249((byte) -126, var15);
            if (var16 == 64 && var15 + 4 < var14 && arg0.method249((byte) -96, var15 + 4) == 64) {
                class40 var17 = arg0.method242(var15, -12448, var15 + 5);
                if (var17.method269(field1176, -62)) {
                    var11 = true;
                    var12 = var6.method255(-10);
                } else {
                    var9 = var17;
                    var10 = var6.method255(-10);
                }
                var6.method248(var17, 12348);
                var15 += 4;
            } else if (var16 == 92 && var15 + 1 < var14 && arg0.method249((byte) -77, var15 + 1) == 110) {
                field1190[var13++] = var6.method242(var5, -12448, var6.method255(-10)).method259((byte) -37);
                var5 = var6.method255(-10);
                var4 = 0;
                var7 = -1;
                var15++;
                var9 = null;
                var11 = false;
            } else {
                var6.method264((byte) -33, var16);
                var4 += this.method350(var16);
                if (var16 == 32 || var16 == 45) {
                    var7 = var6.method255(-10);
                    var8 = var4;
                }
                if (arg2 && var4 > arg1 && var7 >= 0) {
                    field1190[var13++] = var6.method242(var5, -12448, var7).method259((byte) -8);
                    var5 = var7;
                    var7 = -1;
                    var4 -= var8;
                    if (var9 != null && var10 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method272(var5, var9, (byte) 62);
                    }
                    if (var11 && var12 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method272(var5, field1188, (byte) 62);
                    }
                }
            }
        }
        if (var6.method255(-10) > var5) {
            field1190[var13++] = var6.method242(var5, -12448, var6.method255(-10)).method259((byte) 106);
        }
        return var13;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 774)
    public class47(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field1180 = arg0;
        this.field1175 = arg1;
        this.field1181 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field1173 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field1180[var10] < var8) {
                var8 = this.field1180[var10];
            }
            if (this.field1181[var10] + this.field1180[var10] > var9) {
                var9 = this.field1181[var10] + this.field1180[var10];
            }
            byte[] var11 = this.field1173[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field1171 = this.field1181[32] + this.field1180[32];
        this.field1193 = this.field1171 - var8;
        this.field1194 = var9 - this.field1171;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V", line = 909)
    public class47(byte[] arg0) {
        this.field1175 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field1175.length; var2++) {
            this.field1175[var2] = arg0[var2] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Lgd;)I", line = 579)
    public final int method362(class40 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field950; var3++) {
            if (arg0.field948[var3] == 64 && var3 + 4 < arg0.field950 && arg0.field948[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field1175[arg0.field948[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([BIIIII)V", line = 614)
    private final void method363(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class27.field601 * arg2 + arg1;
        int var8 = class27.field601 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class27.field602) {
            int var11 = class27.field602 - arg2;
            arg4 -= var11;
            arg2 = class27.field602;
            var10 += arg3 * var11;
            var7 += class27.field601 * var11;
        }
        if (arg2 + arg4 > class27.field603) {
            arg4 -= arg2 + arg4 - class27.field603;
        }
        if (arg1 < class27.field604) {
            int var12 = class27.field604 - arg1;
            arg3 -= var12;
            arg1 = class27.field604;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class27.field600) {
            int var13 = arg1 + arg3 - class27.field600;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method357(class27.field605, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(Lgd;IIIZ)V", line = 667)
    public final void method364(class40 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method358(arg0, arg1 - this.method362(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([BIIIIII)V", line = 707)
    private final void method365(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class27.field601 * arg2 + arg1;
        int var9 = class27.field601 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class27.field602) {
            int var12 = class27.field602 - arg2;
            arg4 -= var12;
            arg2 = class27.field602;
            var11 += arg3 * var12;
            var8 += class27.field601 * var12;
        }
        if (arg2 + arg4 > class27.field603) {
            arg4 -= arg2 + arg4 - class27.field603;
        }
        if (arg1 < class27.field604) {
            int var13 = class27.field604 - arg1;
            arg3 -= var13;
            arg1 = class27.field604;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class27.field600) {
            int var14 = arg1 + arg3 - class27.field600;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method345(class27.field605, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgd;IIIIIZIII)V", line = 836)
    public final void method366(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        if (arg9 == 0) {
            arg9 = this.field1193;
        }
        boolean var11 = true;
        if (arg4 < this.field1194 + this.field1193 + arg9 && arg4 < arg9 + arg9) {
            var11 = false;
        }
        int var12 = this.method361(arg0, arg3, var11);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field1193 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field1193 - this.field1194 - (var12 - 1) * arg9) / 2 + this.field1193 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field1194 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field1193 - this.field1194 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field1193 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method358(field1190[var15], arg1, var13, arg5, arg6);
            } else if (arg7 == 1) {
                this.method364(field1190[var15], arg3 / 2 + arg1, var13, arg5, arg6);
            } else if (arg7 == 2) {
                this.method351(field1190[var15], arg1 + arg3, var13, arg5, arg6);
            } else if (var12 - 1 == var15) {
                this.method358(field1190[var15], arg1, var13, arg5, arg6);
            } else {
                this.method352(field1190[var15], arg1, var13, arg5, arg6, arg3);
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(Lgd;)I", line = 920)
    public final int method367(class40 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field950; var3++) {
            var2 += this.field1175[arg0.field948[var3] & 0xFF];
        }
        return var2;
    }
}
