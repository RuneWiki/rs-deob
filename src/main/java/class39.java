import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OBDRPXUY")
public class class39 {

    @OriginalMember(owner = "client!OBDRPXUY", name = "b", descriptor = "I")
    private int field1248 = 6;

    @OriginalMember(owner = "client!OBDRPXUY", name = "k", descriptor = "[I")
    private int[] field1257 = new int[5];

    @OriginalMember(owner = "client!OBDRPXUY", name = "l", descriptor = "[I")
    private int[] field1258 = new int[5];

    @OriginalMember(owner = "client!OBDRPXUY", name = "m", descriptor = "[I")
    private int[] field1259 = new int[5];

    @OriginalMember(owner = "client!OBDRPXUY", name = "o", descriptor = "I")
    private int field1261 = 100;

    @OriginalMember(owner = "client!OBDRPXUY", name = "r", descriptor = "I")
    public int field1264 = 500;

    @OriginalMember(owner = "client!OBDRPXUY", name = "w", descriptor = "[I")
    private static int[] field1269 = new int[5];

    @OriginalMember(owner = "client!OBDRPXUY", name = "x", descriptor = "[I")
    private static int[] field1270 = new int[5];

    @OriginalMember(owner = "client!OBDRPXUY", name = "y", descriptor = "[I")
    private static int[] field1271 = new int[5];

    @OriginalMember(owner = "client!OBDRPXUY", name = "z", descriptor = "[I")
    private static int[] field1272 = new int[5];

    @OriginalMember(owner = "client!OBDRPXUY", name = "A", descriptor = "[I")
    private static int[] field1273 = new int[5];

    @OriginalMember(owner = "client!OBDRPXUY", name = "a", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client!OBDRPXUY", name = "n", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client!OBDRPXUY", name = "s", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!OBDRPXUY", name = "c", descriptor = "LGTUIGVXS;")
    private class25 field1249;

    @OriginalMember(owner = "client!OBDRPXUY", name = "d", descriptor = "LGTUIGVXS;")
    private class25 field1250;

    @OriginalMember(owner = "client!OBDRPXUY", name = "e", descriptor = "LGTUIGVXS;")
    private class25 field1251;

    @OriginalMember(owner = "client!OBDRPXUY", name = "f", descriptor = "LGTUIGVXS;")
    private class25 field1252;

    @OriginalMember(owner = "client!OBDRPXUY", name = "g", descriptor = "LGTUIGVXS;")
    private class25 field1253;

    @OriginalMember(owner = "client!OBDRPXUY", name = "h", descriptor = "LGTUIGVXS;")
    private class25 field1254;

    @OriginalMember(owner = "client!OBDRPXUY", name = "i", descriptor = "LGTUIGVXS;")
    private class25 field1255;

    @OriginalMember(owner = "client!OBDRPXUY", name = "j", descriptor = "LGTUIGVXS;")
    private class25 field1256;

    @OriginalMember(owner = "client!OBDRPXUY", name = "q", descriptor = "LGTUIGVXS;")
    private class25 field1263;

    @OriginalMember(owner = "client!OBDRPXUY", name = "p", descriptor = "LWSKKAWXJ;")
    private class59 field1262;

    @OriginalMember(owner = "client!OBDRPXUY", name = "t", descriptor = "[I")
    private static int[] field1266;

    @OriginalMember(owner = "client!OBDRPXUY", name = "u", descriptor = "[I")
    private static int[] field1267;

    @OriginalMember(owner = "client!OBDRPXUY", name = "v", descriptor = "[I")
    private static int[] field1268;

    @OriginalMember(owner = "client!OBDRPXUY", name = "a", descriptor = "()V")
    public static final void method347() {
        field1267 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1267[var0] = 1;
            } else {
                field1267[var0] = -1;
            }
        }
        field1268 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1268[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1266 = new int[220500];
    }

    @OriginalMember(owner = "client!OBDRPXUY", name = "a", descriptor = "(II)[I")
    public final int[] method348(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1266[var3] = 0;
        }
        if (arg1 < 10) {
            return field1266;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1249.method271((byte) 0);
        this.field1250.method271((byte) 0);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1251 != null) {
            this.field1251.method271((byte) 0);
            this.field1252.method271((byte) 0);
            var6 = (int) ((double) (this.field1251.field953 - this.field1251.field952) * 32.768D / var4);
            var7 = (int) ((double) this.field1251.field952 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1253 != null) {
            this.field1253.method271((byte) 0);
            this.field1254.method271((byte) 0);
            var9 = (int) ((double) (this.field1253.field953 - this.field1253.field952) * 32.768D / var4);
            var10 = (int) ((double) this.field1253.field952 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1257[var12] != 0) {
                field1269[var12] = 0;
                field1270[var12] = (int) ((double) this.field1259[var12] * var4);
                field1271[var12] = (this.field1257[var12] << 14) / 100;
                field1272[var12] = (int) ((double) (this.field1249.field953 - this.field1249.field952) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1258[var12]) / var4);
                field1273[var12] = (int) ((double) this.field1249.field952 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1249.method272(18303, arg0);
            int var42 = this.field1250.method272(18303, arg0);
            if (this.field1251 != null) {
                int var43 = this.field1251.method272(18303, arg0);
                int var44 = this.field1252.method272(18303, arg0);
                var41 += this.method349(var8, this.field1251.field954, 312, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1253 != null) {
                int var45 = this.field1253.method272(18303, arg0);
                int var46 = this.field1254.method272(18303, arg0);
                var42 = var42 * ((this.method349(var11, this.field1253.field954, 312, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1257[var47] != 0) {
                    int var48 = field1270[var47] + var13;
                    if (var48 < arg0) {
                        field1266[var48] += this.method349(field1269[var47], this.field1249.field954, 312, field1271[var47] * var42 >> 15);
                        field1269[var47] += (field1272[var47] * var41 >> 16) + field1273[var47];
                    }
                }
            }
        }
        if (this.field1255 != null) {
            this.field1255.method271((byte) 0);
            this.field1256.method271((byte) 0);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1255.method272(18303, arg0);
                int var19 = this.field1256.method272(18303, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1255.field953 - this.field1255.field952) * var18 >> 8) + this.field1255.field952;
                } else {
                    var20 = ((this.field1255.field953 - this.field1255.field952) * var19 >> 8) + this.field1255.field952;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1266[var17] = 0;
                }
            }
        }
        if (this.field1260 > 0 && this.field1261 > 0) {
            int var21 = (int) ((double) this.field1260 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1266[var22] += field1266[var22 - var21] * this.field1261 / 100;
            }
        }
        if (this.field1262.field1629[0] > 0 || this.field1262.field1629[1] > 0) {
            this.field1263.method271((byte) 0);
            int var23 = this.field1263.method272(18303, arg0 + 1);
            int var24 = this.field1262.method556((float) var23 / 65536.0F, 0, false);
            int var25 = this.field1262.method556((float) var23 / 65536.0F, 1, false);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1266[var24 + var26] * (long) class59.field1636 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1266[var24 + var26 - var38 - 1] * (long) class59.field1634[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1266[var26 - var39 - 1] * (long) class59.field1634[1][var39] >> 16);
                    }
                    field1266[var26] = var37;
                    var23 = this.field1263.method272(18303, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1266[var24 + var26] * (long) class59.field1636 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1266[var24 + var26 - var35 - 1] * (long) class59.field1634[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1266[var26 - var36 - 1] * (long) class59.field1634[1][var36] >> 16);
                        }
                        field1266[var26] = var34;
                        var23 = this.field1263.method272(18303, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1266[var24 + var26 - var31 - 1] * (long) class59.field1634[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1266[var26 - var32 - 1] * (long) class59.field1634[1][var32] >> 16);
                            }
                            field1266[var26] = var30;
                            this.field1263.method272(18303, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1262.method556((float) var23 / 65536.0F, 0, false);
                    var25 = this.field1262.method556((float) var23 / 65536.0F, 1, false);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1266[var40] < -32768) {
                field1266[var40] = -32768;
            }
            if (field1266[var40] > 32767) {
                field1266[var40] = 32767;
            }
        }
        return field1266;
    }

    @OriginalMember(owner = "client!OBDRPXUY", name = "a", descriptor = "(IIII)I")
    private final int method349(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0) {
            this.field1247 = 383;
        }
        if (arg1 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg1 == 2) {
            return field1268[arg0 & 0x7FFF] * arg3 >> 14;
        } else if (arg1 == 3) {
            return ((arg0 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg1 == 4) {
            return field1267[arg0 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!OBDRPXUY", name = "a", descriptor = "(LWBEWPIXO;I)V")
    public final void method350(class58 arg0, int arg1) {
        this.field1249 = new class25();
        this.field1249.method269(arg0, 767);
        this.field1250 = new class25();
        this.field1250.method269(arg0, 767);
        int var3 = arg0.method515();
        if (var3 != 0) {
            arg0.field1615--;
            this.field1251 = new class25();
            this.field1251.method269(arg0, 767);
            this.field1252 = new class25();
            this.field1252.method269(arg0, 767);
        }
        int var4 = arg0.method515();
        if (var4 != 0) {
            arg0.field1615--;
            this.field1253 = new class25();
            this.field1253.method269(arg0, 767);
            this.field1254 = new class25();
            this.field1254.method269(arg0, 767);
        }
        int var5 = arg0.method515();
        if (var5 != 0) {
            arg0.field1615--;
            this.field1255 = new class25();
            this.field1255.method269(arg0, 767);
            this.field1256 = new class25();
            this.field1256.method269(arg0, 767);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method529();
            if (var7 == 0) {
                break;
            }
            this.field1257[var6] = var7;
            this.field1258[var6] = arg0.method528();
            this.field1259[var6] = arg0.method529();
        }
        int var8 = 14 / arg1;
        this.field1260 = arg0.method529();
        this.field1261 = arg0.method529();
        this.field1264 = arg0.method517();
        this.field1265 = arg0.method517();
        this.field1262 = new class59();
        this.field1263 = new class25();
        this.field1262.method557(arg0, this.field1263, this.field1248);
    }
}
