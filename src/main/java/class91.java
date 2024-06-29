import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class91 {

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
    private int[] field1249 = new int[5];

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public int field1246 = 500;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public int field1247 = 0;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "[I")
    private int[] field1259 = new int[5];

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    private int field1258 = 100;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "[I")
    private int[] field1253 = new int[5];

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    private int field1262 = 0;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[I")
    private static int[] field1245 = new int[32768];

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "[I")
    private static int[] field1256;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "[I")
    private static int[] field1257;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "[I")
    private static int[] field1265;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "[I")
    private static int[] field1266;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "[I")
    private static int[] field1268;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "[I")
    private static int[] field1269;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "[I")
    private static int[] field1267;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lvca;")
    private class297 field1248;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lvca;")
    private class297 field1250;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lvca;")
    private class297 field1252;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Lvca;")
    private class297 field1254;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Lvca;")
    private class297 field1255;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lvca;")
    private class297 field1260;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Lvca;")
    private class297 field1261;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Lvca;")
    private class297 field1263;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Lvca;")
    private class297 field1264;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Lnl;")
    private class578 field1251;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1245[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1256 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1256[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1257 = new int[220500];
        field1265 = new int[5];
        field1266 = new int[5];
        field1268 = new int[5];
        field1269 = new int[5];
        field1267 = new int[5];
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)I", line = 5)
    private final int method729(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1256[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1245[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I", line = 27)
    public final int[] method730(int arg0, int arg1) {
        class278.method1797(field1257, 0, arg0);
        if (arg1 < 10) {
            return field1257;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1248.method1888();
        this.field1254.method1888();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1261 != null) {
            this.field1261.method1888();
            this.field1260.method1888();
            var5 = (int) ((double) (this.field1261.field4305 - this.field1261.field4308) * 32.768D / var3);
            var6 = (int) ((double) this.field1261.field4308 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1264 != null) {
            this.field1264.method1888();
            this.field1255.method1888();
            var8 = (int) ((double) (this.field1264.field4305 - this.field1264.field4308) * 32.768D / var3);
            var9 = (int) ((double) this.field1264.field4308 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1259[var11] != 0) {
                field1265[var11] = 0;
                field1267[var11] = (int) ((double) this.field1249[var11] * var3);
                field1269[var11] = (this.field1259[var11] << 14) / 100;
                field1266[var11] = (int) ((double) (this.field1248.field4305 - this.field1248.field4308) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1253[var11]) / var3);
                field1268[var11] = (int) ((double) this.field1248.field4308 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1248.method1887(arg0);
            int var40 = this.field1254.method1887(arg0);
            if (this.field1261 != null) {
                int var41 = this.field1261.method1887(arg0);
                int var42 = this.field1260.method1887(arg0);
                var39 += this.method729(var7, var42, this.field1261.field4303) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1264 != null) {
                int var43 = this.field1264.method1887(arg0);
                int var44 = this.field1255.method1887(arg0);
                var40 = var40 * ((this.method729(var10, var44, this.field1264.field4303) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1259[var45] != 0) {
                    int var46 = field1267[var45] + var12;
                    if (var46 < arg0) {
                        field1257[var46] += this.method729(field1265[var45], field1269[var45] * var40 >> 15, this.field1248.field4303);
                        field1265[var45] += (field1266[var45] * var39 >> 16) + field1268[var45];
                    }
                }
            }
        }
        if (this.field1250 != null) {
            this.field1250.method1888();
            this.field1263.method1888();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1250.method1887(arg0);
                int var18 = this.field1263.method1887(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1250.field4305 - this.field1250.field4308) * var17 >> 8) + this.field1250.field4308;
                } else {
                    var19 = ((this.field1250.field4305 - this.field1250.field4308) * var18 >> 8) + this.field1250.field4308;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1257[var16] = 0;
                }
            }
        }
        if (this.field1262 > 0 && this.field1258 > 0) {
            int var20 = (int) ((double) this.field1262 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1257[var21] += field1257[var21 - var20] * this.field1258 / 100;
            }
        }
        if (this.field1251.field7757[0] > 0 || this.field1251.field7757[1] > 0) {
            this.field1252.method1888();
            int var22 = this.field1252.method1887(arg0 + 1);
            int var23 = this.field1251.method3225(0, (float) var22 / 65536.0F);
            int var24 = this.field1251.method3225(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1257[var23 + var25] * (long) class578.field7754 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1257[var23 + var25 - var36 - 1] * (long) class578.field7756[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1257[var25 - var37 - 1] * (long) class578.field7756[1][var37] >> 16);
                    }
                    field1257[var25] = var35;
                    var22 = this.field1252.method1887(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1257[var23 + var25] * (long) class578.field7754 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1257[var23 + var25 - var33 - 1] * (long) class578.field7756[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1257[var25 - var34 - 1] * (long) class578.field7756[1][var34] >> 16);
                        }
                        field1257[var25] = var32;
                        var22 = this.field1252.method1887(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1257[var23 + var25 - var29 - 1] * (long) class578.field7756[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1257[var25 - var30 - 1] * (long) class578.field7756[1][var30] >> 16);
                            }
                            field1257[var25] = var28;
                            this.field1252.method1887(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1251.method3225(0, (float) var22 / 65536.0F);
                    var24 = this.field1251.method3225(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1257[var38] < -32768) {
                field1257[var38] = -32768;
            }
            if (field1257[var38] > 32767) {
                field1257[var38] = 32767;
            }
        }
        return field1257;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V", line = 325)
    public static void method731() {
        field1257 = null;
        field1245 = null;
        field1256 = null;
        field1265 = null;
        field1267 = null;
        field1269 = null;
        field1266 = null;
        field1268 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljp;)V", line = 359)
    public final void method732(class376 arg0) {
        this.field1248 = new class297();
        this.field1248.method1886(arg0);
        this.field1254 = new class297();
        this.field1254.method1886(arg0);
        int var2 = arg0.method2398(-1372747256);
        if (var2 != 0) {
            arg0.field5459--;
            this.field1261 = new class297();
            this.field1261.method1886(arg0);
            this.field1260 = new class297();
            this.field1260.method1886(arg0);
        }
        int var3 = arg0.method2398(-1372747256);
        if (var3 != 0) {
            arg0.field5459--;
            this.field1264 = new class297();
            this.field1264.method1886(arg0);
            this.field1255 = new class297();
            this.field1255.method1886(arg0);
        }
        int var4 = arg0.method2398(-1372747256);
        if (var4 != 0) {
            arg0.field5459--;
            this.field1250 = new class297();
            this.field1250.method1886(arg0);
            this.field1263 = new class297();
            this.field1263.method1886(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2370(-2);
            if (var6 == 0) {
                break;
            }
            this.field1259[var5] = var6;
            this.field1253[var5] = arg0.method2357(true);
            this.field1249[var5] = arg0.method2370(-2);
        }
        this.field1262 = arg0.method2370(-2);
        this.field1258 = arg0.method2370(-2);
        this.field1246 = arg0.method2359(-1);
        this.field1247 = arg0.method2359(-1);
        this.field1251 = new class578();
        this.field1252 = new class297();
        this.field1251.method3227(arg0, this.field1252);
    }
}
