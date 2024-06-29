import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class63 extends class199 {

    @OriginalMember(owner = "client!gg", name = "Db", descriptor = "I")
    private int field1272 = 0;

    @OriginalMember(owner = "client!gg", name = "Cb", descriptor = "B")
    private byte field1271 = 0;

    @OriginalMember(owner = "client!gg", name = "Fb", descriptor = "[I")
    private int[] field1274;

    @OriginalMember(owner = "client!gg", name = "Ib", descriptor = "[I")
    private int[] field1277;

    @OriginalMember(owner = "client!gg", name = "vb", descriptor = "[I")
    private int[] field1264;

    @OriginalMember(owner = "client!gg", name = "zb", descriptor = "[B")
    private byte[] field1268;

    @OriginalMember(owner = "client!gg", name = "Kb", descriptor = "[B")
    private byte[] field1279;

    @OriginalMember(owner = "client!gg", name = "ub", descriptor = "[I")
    private int[] field1263;

    @OriginalMember(owner = "client!gg", name = "Bb", descriptor = "[I")
    private int[] field1270;

    @OriginalMember(owner = "client!gg", name = "xb", descriptor = "[I")
    private int[] field1266;

    @OriginalMember(owner = "client!gg", name = "wb", descriptor = "[S")
    private short[] field1265;

    @OriginalMember(owner = "client!gg", name = "Ab", descriptor = "[I")
    private int[] field1269;

    @OriginalMember(owner = "client!gg", name = "Gb", descriptor = "[I")
    private int[] field1275;

    @OriginalMember(owner = "client!gg", name = "Lb", descriptor = "[I")
    private int[] field1280;

    @OriginalMember(owner = "client!gg", name = "Eb", descriptor = "[B")
    private byte[] field1273;

    @OriginalMember(owner = "client!gg", name = "yb", descriptor = "Lgg;")
    private static class63 field1267 = new class63();

    @OriginalMember(owner = "client!gg", name = "Hb", descriptor = "[B")
    private static byte[] field1276 = new byte[1];

    @OriginalMember(owner = "client!gg", name = "Jb", descriptor = "Lgg;")
    private static class63 field1278 = new class63();

    @OriginalMember(owner = "client!gg", name = "Rb", descriptor = "[I")
    private static int[] field1286 = new int[4096];

    @OriginalMember(owner = "client!gg", name = "Xb", descriptor = "[I")
    private static int[] field1292 = new int[4096];

    @OriginalMember(owner = "client!gg", name = "Sb", descriptor = "[I")
    private static int[] field1287 = new int[10];

    @OriginalMember(owner = "client!gg", name = "Ub", descriptor = "[I")
    private static int[] field1289 = new int[1600];

    @OriginalMember(owner = "client!gg", name = "Pb", descriptor = "[I")
    private static int[] field1284 = class135.field2798;

    @OriginalMember(owner = "client!gg", name = "Yb", descriptor = "[I")
    private static int[] field1293 = new int[4096];

    @OriginalMember(owner = "client!gg", name = "Vb", descriptor = "[Z")
    private static boolean[] field1290 = new boolean[4096];

    @OriginalMember(owner = "client!gg", name = "dc", descriptor = "[I")
    private static int[] field1298 = new int[10];

    @OriginalMember(owner = "client!gg", name = "Mb", descriptor = "[I")
    private static int[] field1281 = new int[10];

    @OriginalMember(owner = "client!gg", name = "ec", descriptor = "[[I")
    private static int[][] field1299 = new int[1600][512];

    @OriginalMember(owner = "client!gg", name = "Tb", descriptor = "[I")
    private static int[] field1288 = new int[2000];

    @OriginalMember(owner = "client!gg", name = "hc", descriptor = "[I")
    private static int[] field1302 = class135.field2797;

    @OriginalMember(owner = "client!gg", name = "Wb", descriptor = "[B")
    private static byte[] field1291 = new byte[1];

    @OriginalMember(owner = "client!gg", name = "fc", descriptor = "[I")
    private static int[] field1300 = new int[12];

    @OriginalMember(owner = "client!gg", name = "Ob", descriptor = "[I")
    private static int[] field1283 = new int[4096];

    @OriginalMember(owner = "client!gg", name = "ac", descriptor = "[I")
    private static int[] field1295 = new int[2000];

    @OriginalMember(owner = "client!gg", name = "bc", descriptor = "[I")
    private static int[] field1296 = new int[12];

    @OriginalMember(owner = "client!gg", name = "gc", descriptor = "[[I")
    private static int[][] field1301 = new int[12][2000];

    @OriginalMember(owner = "client!gg", name = "Qb", descriptor = "[I")
    private static int[] field1285 = new int[4096];

    @OriginalMember(owner = "client!gg", name = "kc", descriptor = "[I")
    private static int[] field1305 = class135.field2806;

    @OriginalMember(owner = "client!gg", name = "ic", descriptor = "[I")
    private static int[] field1303 = class135.field2807;

    @OriginalMember(owner = "client!gg", name = "lc", descriptor = "[I")
    private static int[] field1306 = new int[4096];

    @OriginalMember(owner = "client!gg", name = "cc", descriptor = "[Z")
    private static boolean[] field1297 = new boolean[4096];

    @OriginalMember(owner = "client!gg", name = "Nb", descriptor = "I")
    private static int field1282;

    @OriginalMember(owner = "client!gg", name = "Zb", descriptor = "I")
    private static int field1294;

    @OriginalMember(owner = "client!gg", name = "jc", descriptor = "I")
    private static int field1304;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)Lw;")
    public final class199 method389(boolean arg0) {
        if (!arg0 && field1291.length < super.field3912) {
            field1291 = new byte[super.field3912 + 100];
        }
        return this.method390(arg0, field1278, field1291);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLgg;[B)Lgg;")
    private final class63 method390(boolean arg0, class63 arg1, byte[] arg2) {
        arg1.field3915 = super.field3915;
        arg1.field3912 = super.field3912;
        arg1.field1272 = this.field1272;
        if (arg1.field3924 == null || arg1.field3924.length < super.field3915) {
            arg1.field3924 = new int[super.field3915 + 100];
            arg1.field3920 = new int[super.field3915 + 100];
            arg1.field3911 = new int[super.field3915 + 100];
        }
        for (int var4 = 0; var4 < super.field3915; ++var4) {
            arg1.field3924[var4] = super.field3924[var4];
            arg1.field3920[var4] = super.field3920[var4];
            arg1.field3911[var4] = super.field3911[var4];
        }
        if (arg0) {
            arg1.field1279 = this.field1279;
        } else {
            arg1.field1279 = arg2;
            if (this.field1279 == null) {
                for (int var5 = 0; var5 < super.field3912; ++var5) {
                    arg1.field1279[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field3912; ++var6) {
                    arg1.field1279[var6] = this.field1279[var6];
                }
            }
        }
        arg1.field1274 = this.field1274;
        arg1.field1277 = this.field1277;
        arg1.field1264 = this.field1264;
        arg1.field1263 = this.field1263;
        arg1.field1270 = this.field1270;
        arg1.field1266 = this.field1266;
        arg1.field1268 = this.field1268;
        arg1.field1273 = this.field1273;
        arg1.field1265 = this.field1265;
        arg1.field1271 = this.field1271;
        arg1.field1269 = this.field1269;
        arg1.field1275 = this.field1275;
        arg1.field1280 = this.field1280;
        arg1.field3919 = super.field3919;
        arg1.field3916 = super.field3916;
        arg1.field3921 = super.field3921;
        arg1.field3910 = false;
        return arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([[IIIIZI)Lw;")
    public final class199 method391(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1304();
        int var7 = super.field3928 + arg1;
        int var8 = super.field3925 + arg1;
        int var9 = super.field3922 + arg3;
        int var10 = super.field3917 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class63 var15;
                if (arg4) {
                    var15 = new class63();
                    var15.field3915 = super.field3915;
                    var15.field3912 = super.field3912;
                    var15.field1272 = this.field1272;
                    var15.field3924 = super.field3924;
                    var15.field3911 = super.field3911;
                    var15.field1274 = this.field1274;
                    var15.field1277 = this.field1277;
                    var15.field1264 = this.field1264;
                    var15.field1263 = this.field1263;
                    var15.field1270 = this.field1270;
                    var15.field1266 = this.field1266;
                    var15.field1268 = this.field1268;
                    var15.field1279 = this.field1279;
                    var15.field1273 = this.field1273;
                    var15.field1265 = this.field1265;
                    var15.field1271 = this.field1271;
                    var15.field1269 = this.field1269;
                    var15.field1275 = this.field1275;
                    var15.field1280 = this.field1280;
                    var15.field3919 = super.field3919;
                    var15.field3916 = super.field3916;
                    var15.field3921 = super.field3921;
                    var15.field3920 = new int[var15.field3915];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field3915; ++var16) {
                        int var17 = super.field3924[var16] + arg1;
                        int var18 = super.field3911[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field3920[var16] = super.field3920[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field3915; ++var26) {
                        int var27 = (super.field3920[var26] << 16) / super.field1819;
                        if (var27 < arg5) {
                            int var28 = super.field3924[var26] + arg1;
                            int var29 = super.field3911[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field3920[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field3920[var26];
                        } else {
                            var15.field3920[var26] = super.field3920[var26];
                        }
                    }
                }
                super.field3910 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIII)V")
    public final void method392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method1304();
            int var9 = class135.field2813;
            int var10 = class135.field2800;
            int var11 = field1302[arg0];
            int var12 = field1284[arg0];
            int var13 = field1302[arg1];
            int var14 = field1284[arg1];
            int var15 = field1302[arg2];
            int var16 = field1284[arg2];
            int var17 = field1302[arg3];
            int var18 = field1284[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field3915; ++var20) {
                int var21 = super.field3924[var20];
                int var22 = super.field3920[var20];
                int var23 = super.field3911[var20];
                if (arg2 != 0) {
                    int var24 = var15 * var22 + var16 * var21 >> 16;
                    var22 = var16 * var22 - var15 * var21 >> 16;
                    var21 = var24;
                }
                if (arg0 != 0) {
                    int var25 = var12 * var22 - var11 * var23 >> 16;
                    var23 = var11 * var22 + var12 * var23 >> 16;
                    var22 = var25;
                }
                if (arg1 != 0) {
                    int var26 = var13 * var23 + var14 * var21 >> 16;
                    var23 = var14 * var23 - var13 * var21 >> 16;
                    var21 = var26;
                }
                int var27 = arg4 + var21;
                int var28 = arg5 + var22;
                int var29 = arg6 + var23;
                int var30 = var18 * var28 - var17 * var29 >> 16;
                int var31 = var17 * var28 + var18 * var29 >> 16;
                field1285[var20] = var31 - var19;
                field1292[var20] = (var27 << 9) / arg7 + var9;
                field1286[var20] = (var30 << 9) / arg7 + var10;
                if (this.field1272 > 0) {
                    field1293[var20] = var27;
                    field1306[var20] = var30;
                    field1283[var20] = var31;
                }
            }
            this.method402(false, false, 0, super.field3914, super.field3914 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lw;)Lw;")
    public final class199 method393(class199 arg0) {
        return new class63(new class63[] { this, (class63) arg0 }, 2);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I")
    private static final int method394(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lla;I)V")
    public final void method395(class101 arg0, int arg1) {
        if (super.field3919 != null) {
            if (arg1 != -1) {
                class146 var3 = arg0.field1925[arg1];
                class145 var4 = var3.field2989;
                field1282 = 0;
                field1294 = 0;
                field1304 = 0;
                for (int var5 = 0; var5 < var3.field2999; ++var5) {
                    int var6 = var3.field2993[var5];
                    this.method404(var4.field2982[var6], var4.field2974[var6], var3.field2992[var5], var3.field2990[var5], var3.field2998[var5]);
                }
                super.field3910 = false;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "(I)V")
    private final void method396(int arg0) {
        if (field1297[arg0]) {
            this.method403(arg0);
        } else {
            int var2 = this.field1274[arg0];
            int var3 = this.field1277[arg0];
            int var4 = this.field1264[arg0];
            class135.field2794 = field1290[arg0];
            if (this.field1279 == null) {
                class135.field2812 = 0;
            } else {
                class135.field2812 = this.field1279[arg0] & 255;
            }
            if (this.field1265 != null && this.field1265[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field1273 != null && this.field1273[arg0] != -1) {
                    int var5 = this.field1273[arg0] & 255;
                    var6 = this.field1269[var5];
                    var7 = this.field1275[var5];
                    var8 = this.field1280[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field1266[arg0] == -1) {
                    class135.method871(field1286[var2], field1286[var3], field1286[var4], field1292[var2], field1292[var3], field1292[var4], this.field1263[arg0], this.field1263[arg0], this.field1263[arg0], field1293[var6], field1293[var7], field1293[var8], field1306[var6], field1306[var7], field1306[var8], field1283[var6], field1283[var7], field1283[var8], this.field1265[arg0]);
                } else {
                    class135.method871(field1286[var2], field1286[var3], field1286[var4], field1292[var2], field1292[var3], field1292[var4], this.field1263[arg0], this.field1270[arg0], this.field1266[arg0], field1293[var6], field1293[var7], field1293[var8], field1306[var6], field1306[var7], field1306[var8], field1283[var6], field1283[var7], field1283[var8], this.field1265[arg0]);
                }
            } else if (this.field1266[arg0] == -1) {
                class135.method874(field1286[var2], field1286[var3], field1286[var4], field1292[var2], field1292[var3], field1292[var4], field1303[this.field1263[arg0]]);
            } else {
                class135.method873(field1286[var2], field1286[var3], field1286[var4], field1292[var2], field1292[var3], field1292[var4], this.field1263[arg0], this.field1270[arg0], this.field1266[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(IIIIIIII)Z")
    private final boolean method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lla;ILla;I[I)V")
    public final void method398(class101 arg0, int arg1, class101 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class146 var6 = arg0.field1925[arg1];
                class146 var7 = arg2.field1925[arg3];
                class145 var8 = var6.field2989;
                field1282 = 0;
                field1294 = 0;
                field1304 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field2999; ++var11) {
                    int var16 = var6.field2993[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field2982[var16] == 0) {
                        this.method404(var8.field2982[var16], var8.field2974[var16], var6.field2992[var11], var6.field2990[var11], var6.field2998[var11]);
                    }
                }
                field1282 = 0;
                field1294 = 0;
                field1304 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field2999; ++var14) {
                    int var15 = var7.field2993[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field2982[var15] == 0) {
                        this.method404(var8.field2982[var15], var8.field2974[var15], var7.field2992[var14], var7.field2990[var14], var7.field2998[var14]);
                    }
                }
                super.field3910 = false;
            } else {
                this.method395(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIII)V")
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method1304();
            int var8 = class135.field2813;
            int var9 = class135.field2800;
            int var10 = field1302[arg0];
            int var11 = field1284[arg0];
            int var12 = field1302[arg1];
            int var13 = field1284[arg1];
            int var14 = field1302[arg2];
            int var15 = field1284[arg2];
            int var16 = field1302[arg3];
            int var17 = field1284[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field3915; ++var19) {
                int var20 = super.field3924[var19];
                int var21 = super.field3920[var19];
                int var22 = super.field3911[var19];
                if (arg2 != 0) {
                    int var23 = var14 * var21 + var15 * var20 >> 16;
                    var21 = var15 * var21 - var14 * var20 >> 16;
                    var20 = var23;
                }
                if (arg0 != 0) {
                    int var24 = var11 * var21 - var10 * var22 >> 16;
                    var22 = var10 * var21 + var11 * var22 >> 16;
                    var21 = var24;
                }
                if (arg1 != 0) {
                    int var25 = var12 * var22 + var13 * var20 >> 16;
                    var22 = var13 * var22 - var12 * var20 >> 16;
                    var20 = var25;
                }
                int var26 = arg4 + var20;
                int var27 = arg5 + var21;
                int var28 = arg6 + var22;
                int var29 = var17 * var27 - var16 * var28 >> 16;
                int var30 = var16 * var27 + var17 * var28 >> 16;
                field1285[var19] = var30 - var18;
                field1292[var19] = (var26 << 9) / var30 + var8;
                field1286[var19] = (var29 << 9) / var30 + var9;
                if (this.field1272 > 0) {
                    field1293[var19] = var26;
                    field1306[var19] = var29;
                    field1283[var19] = var30;
                }
            }
            this.method402(false, false, 0, super.field3914, super.field3914 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "(I)I")
    private static final int method400(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)Lw;")
    public final class199 method401(boolean arg0) {
        if (!arg0 && field1276.length < super.field3912) {
            field1276 = new byte[super.field3912 + 100];
        }
        return this.method390(arg0, field1267, field1276);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZZIII)V")
    private final void method402(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var6 = 0; var6 < arg4; ++var6) {
                field1289[var6] = 0;
            }
            for (int var7 = 0; var7 < super.field3912; ++var7) {
                if (this.field1266[var7] != -2) {
                    int var32 = this.field1274[var7];
                    int var33 = this.field1277[var7];
                    int var34 = this.field1264[var7];
                    int var35 = field1292[var32];
                    int var36 = field1292[var33];
                    int var37 = field1292[var34];
                    if (!arg0 || var35 != -5000 && var36 != -5000 && var37 != -5000) {
                        if (arg1 && this.method397(class199.field3907, class199.field3918, field1286[var32], field1286[var33], field1286[var34], var35, var36, var37)) {
                            class199.field3927[class199.field3908++] = arg2;
                            arg1 = false;
                        }
                        if ((field1286[var34] - field1286[var33]) * (var35 - var36) - (field1286[var32] - field1286[var33]) * (var37 - var36) > 0) {
                            field1297[var7] = false;
                            if (var35 >= 0 && var36 >= 0 && var37 >= 0 && var35 <= class135.field2803 && var36 <= class135.field2803 && var37 <= class135.field2803) {
                                field1290[var7] = false;
                            } else {
                                field1290[var7] = true;
                            }
                            int var57 = (field1285[var32] + field1285[var33] + field1285[var34]) / 3 + arg3;
                            field1299[var57][field1289[var57]++] = var7;
                        }
                    } else {
                        int var38 = field1293[var32];
                        int var39 = field1293[var33];
                        int var40 = field1293[var34];
                        int var41 = field1306[var32];
                        int var42 = field1306[var33];
                        int var43 = field1306[var34];
                        int var44 = field1283[var32];
                        int var45 = field1283[var33];
                        int var46 = field1283[var34];
                        int var47 = var38 - var39;
                        int var48 = var40 - var39;
                        int var49 = var41 - var42;
                        int var50 = var43 - var42;
                        int var51 = var44 - var45;
                        int var52 = var46 - var45;
                        int var53 = var49 * var52 - var50 * var51;
                        int var54 = var48 * var51 - var47 * var52;
                        int var55 = var47 * var50 - var48 * var49;
                        if (var45 * var55 + var39 * var53 + var42 * var54 > 0) {
                            field1297[var7] = true;
                            int var56 = (field1285[var32] + field1285[var33] + field1285[var34]) / 3 + arg3;
                            field1299[var56][field1289[var56]++] = var7;
                        }
                    }
                }
            }
            if (this.field1268 == null) {
                for (int var8 = arg4 - 1; var8 >= 0; --var8) {
                    int var9 = field1289[var8];
                    if (var9 > 0) {
                        int[] var10 = field1299[var8];
                        for (int var11 = 0; var11 < var9; ++var11) {
                            this.method396(var10[var11]);
                        }
                    }
                }
            } else {
                for (int var12 = 0; var12 < 12; ++var12) {
                    field1296[var12] = 0;
                    field1300[var12] = 0;
                }
                for (int var13 = arg4 - 1; var13 >= 0; --var13) {
                    int var26 = field1289[var13];
                    if (var26 > 0) {
                        int[] var27 = field1299[var13];
                        for (int var28 = 0; var28 < var26; ++var28) {
                            int var29 = var27[var28];
                            byte var30 = this.field1268[var29];
                            int var31 = field1296[var30]++;
                            field1301[var30][var31] = var29;
                            if (var30 < 10) {
                                field1300[var30] += var13;
                            } else if (var30 == 10) {
                                field1295[var31] = var13;
                            } else {
                                field1288[var31] = var13;
                            }
                        }
                    }
                }
                int var14 = 0;
                if (field1296[1] > 0 || field1296[2] > 0) {
                    var14 = (field1300[1] + field1300[2]) / (field1296[1] + field1296[2]);
                }
                int var15 = 0;
                if (field1296[3] > 0 || field1296[4] > 0) {
                    var15 = (field1300[3] + field1300[4]) / (field1296[3] + field1296[4]);
                }
                int var16 = 0;
                if (field1296[6] > 0 || field1296[8] > 0) {
                    var16 = (field1300[6] + field1300[8]) / (field1296[6] + field1296[8]);
                }
                int var17 = 0;
                int var18 = field1296[10];
                int[] var19 = field1301[10];
                int[] var20 = field1295;
                if (var17 == var18) {
                    var17 = 0;
                    var18 = field1296[11];
                    var19 = field1301[11];
                    var20 = field1288;
                }
                int var21;
                if (var17 < var18) {
                    var21 = var20[var17];
                } else {
                    var21 = -1000;
                }
                for (int var22 = 0; var22 < 10; ++var22) {
                    while (var22 == 0 && var21 > var14) {
                        this.method396(var19[var17++]);
                        if (var17 == var18 && field1301[11] != var19) {
                            var17 = 0;
                            var18 = field1296[11];
                            var19 = field1301[11];
                            var20 = field1288;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    while (var22 == 3 && var21 > var15) {
                        this.method396(var19[var17++]);
                        if (var17 == var18 && field1301[11] != var19) {
                            var17 = 0;
                            var18 = field1296[11];
                            var19 = field1301[11];
                            var20 = field1288;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    while (var22 == 5 && var21 > var16) {
                        this.method396(var19[var17++]);
                        if (var17 == var18 && field1301[11] != var19) {
                            var17 = 0;
                            var18 = field1296[11];
                            var19 = field1301[11];
                            var20 = field1288;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    int var23 = field1296[var22];
                    int[] var24 = field1301[var22];
                    for (int var25 = 0; var25 < var23; ++var25) {
                        this.method396(var24[var25]);
                    }
                }
                while (var21 != -1000) {
                    this.method396(var19[var17++]);
                    if (var17 == var18 && field1301[11] != var19) {
                        var17 = 0;
                        var19 = field1301[11];
                        var18 = field1296[11];
                        var20 = field1288;
                    }
                    if (var17 < var18) {
                        var21 = var20[var17];
                    } else {
                        var21 = -1000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "(I)V")
    private final void method403(int arg0) {
        int var2 = class135.field2813;
        int var3 = class135.field2800;
        int var4 = 0;
        int var5 = this.field1274[arg0];
        int var6 = this.field1277[arg0];
        int var7 = this.field1264[arg0];
        int var8 = field1283[var5];
        int var9 = field1283[var6];
        int var10 = field1283[var7];
        if (this.field1279 == null) {
            class135.field2812 = 0;
        } else {
            class135.field2812 = this.field1279[arg0] & 255;
        }
        if (var8 >= 50) {
            field1287[var4] = field1292[var5];
            field1298[var4] = field1286[var5];
            field1281[var4++] = this.field1263[arg0];
        } else {
            int var11 = field1293[var5];
            int var12 = field1306[var5];
            int var13 = this.field1263[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1305[var10 - var8];
                field1287[var4] = (((field1293[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1298[var4] = (((field1306[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1281[var4++] = ((this.field1266[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1305[var9 - var8];
                field1287[var4] = (((field1293[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1298[var4] = (((field1306[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1281[var4++] = ((this.field1270[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1287[var4] = field1292[var6];
            field1298[var4] = field1286[var6];
            field1281[var4++] = this.field1270[arg0];
        } else {
            int var16 = field1293[var6];
            int var17 = field1306[var6];
            int var18 = this.field1270[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1305[var8 - var9];
                field1287[var4] = (((field1293[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1298[var4] = (((field1306[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1281[var4++] = ((this.field1263[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1305[var10 - var9];
                field1287[var4] = (((field1293[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1298[var4] = (((field1306[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1281[var4++] = ((this.field1266[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1287[var4] = field1292[var7];
            field1298[var4] = field1286[var7];
            field1281[var4++] = this.field1266[arg0];
        } else {
            int var21 = field1293[var7];
            int var22 = field1306[var7];
            int var23 = this.field1266[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1305[var9 - var10];
                field1287[var4] = (((field1293[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1298[var4] = (((field1306[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1281[var4++] = ((this.field1270[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1305[var8 - var10];
                field1287[var4] = (((field1293[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1298[var4] = (((field1306[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1281[var4++] = ((this.field1263[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1287[0];
        int var27 = field1287[1];
        int var28 = field1287[2];
        int var29 = field1298[0];
        int var30 = field1298[1];
        int var31 = field1298[2];
        class135.field2794 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class135.field2803 || var27 > class135.field2803 || var28 > class135.field2803) {
                class135.field2794 = true;
            }
            if (this.field1265 != null && this.field1265[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1273 != null && this.field1273[arg0] != -1) {
                    int var32 = this.field1273[arg0] & 255;
                    var33 = this.field1269[var32];
                    var34 = this.field1275[var32];
                    var35 = this.field1280[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field1266[arg0] == -1) {
                    class135.method871(var29, var30, var31, var26, var27, var28, this.field1263[arg0], this.field1263[arg0], this.field1263[arg0], field1293[var33], field1293[var34], field1293[var35], field1306[var33], field1306[var34], field1306[var35], field1283[var33], field1283[var34], field1283[var35], this.field1265[arg0]);
                } else {
                    class135.method871(var29, var30, var31, var26, var27, var28, field1281[0], field1281[1], field1281[2], field1293[var33], field1293[var34], field1293[var35], field1306[var33], field1306[var34], field1306[var35], field1283[var33], field1283[var34], field1283[var35], this.field1265[arg0]);
                }
            } else if (this.field1266[arg0] == -1) {
                class135.method874(var29, var30, var31, var26, var27, var28, field1303[this.field1263[arg0]]);
            } else {
                class135.method873(var29, var30, var31, var26, var27, var28, field1281[0], field1281[1], field1281[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class135.field2803 || var27 > class135.field2803 || var28 > class135.field2803 || field1287[3] < 0 || field1287[3] > class135.field2803) {
                class135.field2794 = true;
            }
            if (this.field1265 == null || this.field1265[arg0] == -1) {
                if (this.field1266[arg0] == -1) {
                    int var41 = field1303[this.field1263[arg0]];
                    class135.method874(var29, var30, var31, var26, var27, var28, var41);
                    class135.method874(var29, var31, field1298[3], var26, var28, field1287[3], var41);
                    return;
                }
                class135.method873(var29, var30, var31, var26, var27, var28, field1281[0], field1281[1], field1281[2]);
                class135.method873(var29, var31, field1298[3], var26, var28, field1287[3], field1281[0], field1281[2], field1281[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field1273 != null && this.field1273[arg0] != -1) {
                int var36 = this.field1273[arg0] & 255;
                var37 = this.field1269[var36];
                var38 = this.field1275[var36];
                var39 = this.field1280[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field1265[arg0];
            if (this.field1266[arg0] == -1) {
                class135.method871(var29, var30, var31, var26, var27, var28, this.field1263[arg0], this.field1263[arg0], this.field1263[arg0], field1293[var37], field1293[var38], field1293[var39], field1306[var37], field1306[var38], field1306[var39], field1283[var37], field1283[var38], field1283[var39], var40);
                class135.method871(var29, var31, field1298[3], var26, var28, field1287[3], this.field1263[arg0], this.field1263[arg0], this.field1263[arg0], field1293[var37], field1293[var38], field1293[var39], field1306[var37], field1306[var38], field1306[var39], field1283[var37], field1283[var38], field1283[var39], var40);
                return;
            }
            class135.method871(var29, var30, var31, var26, var27, var28, field1281[0], field1281[1], field1281[2], field1293[var37], field1293[var38], field1293[var39], field1306[var37], field1306[var38], field1306[var39], field1283[var37], field1283[var38], field1283[var39], var40);
            class135.method871(var29, var31, field1298[3], var26, var28, field1287[3], field1281[0], field1281[2], field1281[3], field1293[var37], field1293[var38], field1293[var39], field1306[var37], field1306[var38], field1306[var39], field1283[var37], field1283[var38], field1283[var39], var40);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[IIII)V")
    private final void method404(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field1282 = 0;
            field1294 = 0;
            field1304 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field3919.length) {
                    int[] var10 = super.field3919[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field1282 += super.field3924[var12];
                        field1294 += super.field3920[var12];
                        field1304 += super.field3911[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field1282 = field1282 / var7 + arg2;
                field1294 = field1294 / var7 + arg3;
                field1304 = field1304 / var7 + arg4;
            } else {
                field1282 = arg2;
                field1294 = arg3;
                field1304 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field3919.length) {
                    int[] var15 = super.field3919[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field3924[var17] += arg2;
                        super.field3920[var17] += arg3;
                        super.field3911[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field3919.length) {
                    int[] var20 = super.field3919[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field3924[var22] -= field1282;
                        super.field3920[var22] -= field1294;
                        super.field3911[var22] -= field1304;
                        int var23 = (arg2 & 255) * 8;
                        int var24 = (arg3 & 255) * 8;
                        int var25 = (arg4 & 255) * 8;
                        if (var25 != 0) {
                            int var26 = field1302[var25];
                            int var27 = field1284[var25];
                            int var28 = super.field3924[var22] * var27 + super.field3920[var22] * var26 + 32767 >> 16;
                            super.field3920[var22] = super.field3920[var22] * var27 - super.field3924[var22] * var26 + 32767 >> 16;
                            super.field3924[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1302[var23];
                            int var30 = field1284[var23];
                            int var31 = super.field3920[var22] * var30 - super.field3911[var22] * var29 + 32767 >> 16;
                            super.field3911[var22] = super.field3920[var22] * var29 + super.field3911[var22] * var30 + 32767 >> 16;
                            super.field3920[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1302[var24];
                            int var33 = field1284[var24];
                            int var34 = super.field3924[var22] * var33 + super.field3911[var22] * var32 + 32767 >> 16;
                            super.field3911[var22] = super.field3911[var22] * var33 - super.field3924[var22] * var32 + 32767 >> 16;
                            super.field3924[var22] = var34;
                        }
                        super.field3924[var22] += field1282;
                        super.field3920[var22] += field1294;
                        super.field3911[var22] += field1304;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; ++var35) {
                int var36 = arg1[var35];
                if (var36 < super.field3919.length) {
                    int[] var37 = super.field3919[var36];
                    for (int var38 = 0; var38 < var37.length; ++var38) {
                        int var39 = var37[var38];
                        super.field3924[var39] -= field1282;
                        super.field3920[var39] -= field1294;
                        super.field3911[var39] -= field1304;
                        super.field3924[var39] = super.field3924[var39] * arg2 / 128;
                        super.field3920[var39] = super.field3920[var39] * arg3 / 128;
                        super.field3911[var39] = super.field3911[var39] * arg4 / 128;
                        super.field3924[var39] += field1282;
                        super.field3920[var39] += field1294;
                        super.field3911[var39] += field1304;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field3916 != null && this.field1279 != null) {
                for (int var40 = 0; var40 < var6; ++var40) {
                    int var41 = arg1[var40];
                    if (var41 < super.field3916.length) {
                        int[] var42 = super.field3916[var41];
                        for (int var43 = 0; var43 < var42.length; ++var43) {
                            int var44 = var42[var43];
                            int var45 = (this.field1279[var44] & 255) + arg2 * 8;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                            this.field1279[var44] = (byte) var45;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "()V")
    public static void method405() {
        field1267 = null;
        field1276 = null;
        field1278 = null;
        field1291 = null;
        field1290 = null;
        field1297 = null;
        field1292 = null;
        field1286 = null;
        field1285 = null;
        field1293 = null;
        field1306 = null;
        field1283 = null;
        field1289 = null;
        field1299 = null;
        field1296 = null;
        field1301 = null;
        field1295 = null;
        field1288 = null;
        field1300 = null;
        field1287 = null;
        field1298 = null;
        field1281 = null;
        field1302 = null;
        field1284 = null;
        field1303 = null;
        field1305 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!super.field3910) {
            this.method1304();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = (super.field3929 * arg1 + super.field3909 * arg2 >> 16) + var11;
        if (var12 > 50) {
            int var13 = (-super.field3909 * arg2 + super.field1819 * arg1 >> 16) + var11;
            if (var13 < 3500) {
                int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var15 = super.field3909 + var14 << 9;
                if (var15 / var12 > class135.field2795) {
                    int var16 = var14 - super.field3909 << 9;
                    if (var16 / var12 < class135.field2810) {
                        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
                        int var18 = (super.field3929 * arg2 + super.field3909 * arg1 >> 16) + var17 << 9;
                        if (var18 / var12 > class135.field2814) {
                            int var19 = (-super.field3909 * arg1 + super.field1819 * arg2 >> 16) + var17 << 9;
                            if (var19 / var12 < class135.field2811) {
                                boolean var20 = false;
                                boolean var21 = var13 <= 50;
                                boolean var22 = var21 || this.field1272 > 0;
                                int var23 = class135.field2813;
                                int var24 = class135.field2800;
                                int var25 = 0;
                                int var26 = 0;
                                if (arg0 != 0) {
                                    var25 = field1302[arg0];
                                    var26 = field1284[arg0];
                                }
                                boolean var27 = false;
                                if (arg8 > 0 && class199.field3926 && var13 > 0) {
                                    int var28;
                                    int var29;
                                    if (var14 > 0) {
                                        var28 = var16 / var12;
                                        var29 = var15 / var13;
                                    } else {
                                        var28 = var16 / var13;
                                        var29 = var15 / var12;
                                    }
                                    int var30;
                                    int var31;
                                    if (var17 > 0) {
                                        var30 = var19 / var12;
                                        var31 = var18 / var13;
                                    } else {
                                        var30 = var19 / var13;
                                        var31 = var18 / var12;
                                    }
                                    int var32 = class199.field3907 - class135.field2813;
                                    int var33 = class199.field3918 - class135.field2800;
                                    if (var32 >= var28 && var32 <= var29 && var33 >= var30 && var33 <= var31) {
                                        int var34 = 999999;
                                        int var35 = -999999;
                                        int var36 = 999999;
                                        int var37 = -999999;
                                        int[] var38 = new int[] { super.field3928, super.field3925, super.field3928, super.field3925, super.field3928, super.field3925, super.field3928, super.field3925 };
                                        int[] var39 = new int[] { super.field3922, super.field3922, super.field3917, super.field3917, super.field3922, super.field3922, super.field3917, super.field3917 };
                                        int[] var40 = new int[] { super.field1819, super.field1819, super.field1819, super.field1819, super.field3929, super.field3929, super.field3929, super.field3929 };
                                        for (int var41 = 0; var41 < 8; ++var41) {
                                            int var42 = var38[var41];
                                            int var43 = var40[var41];
                                            int var44 = var39[var41];
                                            if (arg0 != 0) {
                                                int var45 = var25 * var44 + var26 * var42 >> 16;
                                                var44 = var26 * var44 - var25 * var42 >> 16;
                                                var42 = var45;
                                            }
                                            int var46 = arg5 + var42;
                                            int var47 = arg6 + var43;
                                            int var48 = arg7 + var44;
                                            int var49 = arg3 * var48 + arg4 * var46 >> 16;
                                            int var50 = arg4 * var48 - arg3 * var46 >> 16;
                                            int var52 = arg2 * var47 - arg1 * var50 >> 16;
                                            int var53 = arg1 * var47 + arg2 * var50 >> 16;
                                            if (var53 > 0) {
                                                int var55 = (var49 << 9) / var53;
                                                int var56 = (var52 << 9) / var53;
                                                if (var55 < var34) {
                                                    var34 = var55;
                                                }
                                                if (var55 > var35) {
                                                    var35 = var55;
                                                }
                                                if (var56 < var36) {
                                                    var36 = var56;
                                                }
                                                if (var56 > var37) {
                                                    var37 = var56;
                                                }
                                            }
                                        }
                                        if (var32 >= var34 && var32 <= var35 && var33 >= var36 && var33 <= var37) {
                                            if (super.field3921) {
                                                class199.field3927[class199.field3908++] = arg8;
                                            } else {
                                                var27 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var57 = 0; var57 < super.field3915; ++var57) {
                                    int var58 = super.field3924[var57];
                                    int var59 = super.field3920[var57];
                                    int var60 = super.field3911[var57];
                                    if (arg0 != 0) {
                                        int var61 = var25 * var60 + var26 * var58 >> 16;
                                        var60 = var26 * var60 - var25 * var58 >> 16;
                                        var58 = var61;
                                    }
                                    int var62 = arg5 + var58;
                                    int var63 = arg6 + var59;
                                    int var64 = arg7 + var60;
                                    int var65 = arg3 * var64 + arg4 * var62 >> 16;
                                    int var66 = arg4 * var64 - arg3 * var62 >> 16;
                                    int var68 = arg2 * var63 - arg1 * var66 >> 16;
                                    int var69 = arg1 * var63 + arg2 * var66 >> 16;
                                    field1285[var57] = var69 - var11;
                                    if (var69 >= 50) {
                                        field1292[var57] = (var65 << 9) / var69 + var23;
                                        field1286[var57] = (var68 << 9) / var69 + var24;
                                    } else {
                                        field1292[var57] = -5000;
                                        var20 = true;
                                    }
                                    if (var22) {
                                        field1293[var57] = var65;
                                        field1306[var57] = var68;
                                        field1283[var57] = var69;
                                    }
                                }
                                try {
                                    this.method402(var20, var27, arg8, var11 - var13, var12 - var13 + 2);
                                } catch (Exception var71) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class63() {
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lsf;IIIII)V")
    public class63(class169 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method1061();
        arg0.method1057();
        super.field3915 = arg0.field3380;
        super.field3924 = arg0.field3356;
        super.field3920 = arg0.field3387;
        super.field3911 = arg0.field3366;
        super.field3912 = arg0.field3348;
        this.field1274 = arg0.field3343;
        this.field1277 = arg0.field3374;
        this.field1264 = arg0.field3377;
        this.field1268 = arg0.field3383;
        this.field1279 = arg0.field3386;
        this.field1271 = arg0.field3346;
        super.field3919 = arg0.field3370;
        super.field3916 = arg0.field3385;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field1263 = new int[super.field3912];
        this.field1270 = new int[super.field3912];
        this.field1266 = new int[super.field3912];
        if (arg0.field3376 != null) {
            this.field1265 = new short[super.field3912];
            for (int var9 = 0; var9 < super.field3912; ++var9) {
                short var10 = arg0.field3376[var9];
                if (var10 != -1 && class135.field2802.method10(var10, true)) {
                    this.field1265[var9] = var10;
                } else {
                    this.field1265[var9] = -1;
                }
            }
        } else {
            this.field1265 = null;
        }
        if (arg0.field3375 > 0 && arg0.field3365 != null) {
            int[] var11 = new int[arg0.field3375];
            for (int var12 = 0; var12 < super.field3912; ++var12) {
                if (arg0.field3365[var12] != -1) {
                    ++var11[arg0.field3365[var12] & 255];
                }
            }
            this.field1272 = 0;
            for (int var13 = 0; var13 < arg0.field3375; ++var13) {
                if (var11[var13] > 0 && arg0.field3354[var13] == 0) {
                    ++this.field1272;
                }
            }
            this.field1269 = new int[this.field1272];
            this.field1275 = new int[this.field1272];
            this.field1280 = new int[this.field1272];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field3375; ++var15) {
                if (var11[var15] > 0 && arg0.field3354[var15] == 0) {
                    this.field1269[var14] = arg0.field3363[var15] & 65535;
                    this.field1275[var14] = arg0.field3372[var15] & 65535;
                    this.field1280[var14] = arg0.field3384[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field1273 = new byte[super.field3912];
            for (int var16 = 0; var16 < super.field3912; ++var16) {
                if (arg0.field3365[var16] != -1) {
                    this.field1273[var16] = (byte) var11[arg0.field3365[var16] & 255];
                    if (this.field1273[var16] == -1 && this.field1265 != null) {
                        this.field1265[var16] = -1;
                    }
                } else {
                    this.field1273[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field3912; ++var17) {
            byte var18;
            if (arg0.field3381 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field3381[var17];
            }
            byte var19;
            if (arg0.field3386 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field3386[var17];
            }
            short var20;
            if (this.field1265 == null) {
                var20 = -1;
            } else {
                var20 = this.field1265[var17];
            }
            if (var19 == -2) {
                var18 = 3;
            }
            if (var19 == -1) {
                var18 = 2;
            }
            if (var20 == -1) {
                if (var18 != 0) {
                    if (var18 == 1) {
                        class104 var28 = arg0.field3369[var17];
                        int var29 = (var28.field1987 * arg5 + var28.field1985 * arg4 + var28.field1973 * arg3) / (var8 / 2 + var8) + arg1;
                        this.field1263[var17] = method394(arg0.field3388[var17] & 65535, var29);
                        this.field1266[var17] = -1;
                    } else if (var18 == 3) {
                        this.field1263[var17] = 128;
                        this.field1266[var17] = -1;
                    } else {
                        this.field1266[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field3388[var17] & 65535;
                    class186 var22;
                    if (arg0.field3345 != null && arg0.field3345[this.field1274[var17]] != null) {
                        var22 = arg0.field3345[this.field1274[var17]];
                    } else {
                        var22 = arg0.field3368[this.field1274[var17]];
                    }
                    int var23 = (var22.field3659 * arg5 + var22.field3663 * arg4 + var22.field3656 * arg3) / (var22.field3661 * var8) + arg1;
                    this.field1263[var17] = method394(var21, var23);
                    class186 var24;
                    if (arg0.field3345 != null && arg0.field3345[this.field1277[var17]] != null) {
                        var24 = arg0.field3345[this.field1277[var17]];
                    } else {
                        var24 = arg0.field3368[this.field1277[var17]];
                    }
                    int var25 = (var24.field3659 * arg5 + var24.field3663 * arg4 + var24.field3656 * arg3) / (var24.field3661 * var8) + arg1;
                    this.field1270[var17] = method394(var21, var25);
                    class186 var26;
                    if (arg0.field3345 != null && arg0.field3345[this.field1264[var17]] != null) {
                        var26 = arg0.field3345[this.field1264[var17]];
                    } else {
                        var26 = arg0.field3368[this.field1264[var17]];
                    }
                    int var27 = (var26.field3659 * arg5 + var26.field3663 * arg4 + var26.field3656 * arg3) / (var26.field3661 * var8) + arg1;
                    this.field1266[var17] = method394(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class104 var36 = arg0.field3369[var17];
                    int var37 = (var36.field1987 * arg5 + var36.field1985 * arg4 + var36.field1973 * arg3) / (var8 / 2 + var8) + arg1;
                    this.field1263[var17] = method400(var37);
                    this.field1266[var17] = -1;
                } else {
                    this.field1266[var17] = -2;
                }
            } else {
                class186 var30;
                if (arg0.field3345 != null && arg0.field3345[this.field1274[var17]] != null) {
                    var30 = arg0.field3345[this.field1274[var17]];
                } else {
                    var30 = arg0.field3368[this.field1274[var17]];
                }
                int var31 = (var30.field3659 * arg5 + var30.field3663 * arg4 + var30.field3656 * arg3) / (var30.field3661 * var8) + arg1;
                this.field1263[var17] = method400(var31);
                class186 var32;
                if (arg0.field3345 != null && arg0.field3345[this.field1277[var17]] != null) {
                    var32 = arg0.field3345[this.field1277[var17]];
                } else {
                    var32 = arg0.field3368[this.field1277[var17]];
                }
                int var33 = (var32.field3659 * arg5 + var32.field3663 * arg4 + var32.field3656 * arg3) / (var32.field3661 * var8) + arg1;
                this.field1270[var17] = method400(var33);
                class186 var34;
                if (arg0.field3345 != null && arg0.field3345[this.field1264[var17]] != null) {
                    var34 = arg0.field3345[this.field1264[var17]];
                } else {
                    var34 = arg0.field3368[this.field1264[var17]];
                }
                int var35 = (var34.field3659 * arg5 + var34.field3663 * arg4 + var34.field3656 * arg3) / (var34.field3661 * var8) + arg1;
                this.field1266[var17] = method400(var35);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "([Lgg;I)V")
    private class63(class63[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field3915 = 0;
        super.field3912 = 0;
        this.field1272 = 0;
        this.field1271 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class63 var13 = arg0[var7];
            if (var13 != null) {
                super.field3915 += var13.field3915;
                super.field3912 += var13.field3912;
                this.field1272 += var13.field1272;
                if (var13.field1268 != null) {
                    var3 = true;
                } else {
                    if (this.field1271 == -1) {
                        this.field1271 = var13.field1271;
                    }
                    if (this.field1271 != var13.field1271) {
                        var3 = true;
                    }
                }
                var4 |= var13.field1279 != null;
                var5 |= var13.field1265 != null;
                var6 |= var13.field1273 != null;
            }
        }
        super.field3924 = new int[super.field3915];
        super.field3920 = new int[super.field3915];
        super.field3911 = new int[super.field3915];
        this.field1274 = new int[super.field3912];
        this.field1277 = new int[super.field3912];
        this.field1264 = new int[super.field3912];
        this.field1263 = new int[super.field3912];
        this.field1270 = new int[super.field3912];
        this.field1266 = new int[super.field3912];
        if (var3) {
            this.field1268 = new byte[super.field3912];
        }
        if (var4) {
            this.field1279 = new byte[super.field3912];
        }
        if (var5) {
            this.field1265 = new short[super.field3912];
        }
        if (var6) {
            this.field1273 = new byte[super.field3912];
        }
        if (this.field1272 > 0) {
            this.field1269 = new int[this.field1272];
            this.field1275 = new int[this.field1272];
            this.field1280 = new int[this.field1272];
        }
        super.field3915 = 0;
        super.field3912 = 0;
        this.field1272 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class63 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field3912; ++var10) {
                    this.field1274[super.field3912] = var9.field1274[var10] + super.field3915;
                    this.field1277[super.field3912] = var9.field1277[var10] + super.field3915;
                    this.field1264[super.field3912] = var9.field1264[var10] + super.field3915;
                    this.field1263[super.field3912] = var9.field1263[var10];
                    this.field1270[super.field3912] = var9.field1270[var10];
                    this.field1266[super.field3912] = var9.field1266[var10];
                    if (var3) {
                        if (var9.field1268 != null) {
                            this.field1268[super.field3912] = var9.field1268[var10];
                        } else {
                            this.field1268[super.field3912] = var9.field1271;
                        }
                    }
                    if (var4 && var9.field1279 != null) {
                        this.field1279[super.field3912] = var9.field1279[var10];
                    }
                    if (var5) {
                        if (var9.field1265 != null) {
                            this.field1265[super.field3912] = var9.field1265[var10];
                        } else {
                            this.field1265[super.field3912] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field1273 != null && var9.field1273[var10] != -1) {
                            this.field1273[super.field3912] = (byte) (var9.field1273[var10] + this.field1272);
                        } else {
                            this.field1273[super.field3912] = -1;
                        }
                    }
                    ++super.field3912;
                }
                for (int var11 = 0; var11 < var9.field1272; ++var11) {
                    this.field1269[this.field1272] = var9.field1269[var11] + super.field3915;
                    this.field1275[this.field1272] = var9.field1275[var11] + super.field3915;
                    this.field1280[this.field1272] = var9.field1280[var11] + super.field3915;
                    ++this.field1272;
                }
                for (int var12 = 0; var12 < var9.field3915; ++var12) {
                    super.field3924[super.field3915] = var9.field3924[var12];
                    super.field3920[super.field3915] = var9.field3920[var12];
                    super.field3911[super.field3915] = var9.field3911[var12];
                    ++super.field3915;
                }
            }
        }
    }
}
