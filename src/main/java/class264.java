import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class264 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[I")
    private int[] field4233 = new int[5];

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    private int field4248 = 100;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "[I")
    private int[] field4241 = new int[5];

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public int field4240 = 500;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "[I")
    private int[] field4255 = new int[5];

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    private int field4245 = 0;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public int field4243 = 0;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "[I")
    private static int[] field4239 = new int[32768];

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[I")
    private static int[] field4244;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "[I")
    private static int[] field4247;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "[I")
    private static int[] field4249;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "[I")
    private static int[] field4253;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "[I")
    private static int[] field4256;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "[I")
    private static int[] field4257;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "[I")
    private static int[] field4251;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lfi;")
    private class22 field4235;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lfj;")
    private class293 field4234;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lfj;")
    private class293 field4236;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lfj;")
    private class293 field4237;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lfj;")
    private class293 field4238;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Lfj;")
    private class293 field4242;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Lfj;")
    private class293 field4246;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "Lfj;")
    private class293 field4250;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Lfj;")
    private class293 field4252;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Lfj;")
    private class293 field4254;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
    public static void method1712() {
        field4247 = null;
        field4239 = null;
        field4244 = null;
        field4256 = null;
        field4251 = null;
        field4253 = null;
        field4249 = null;
        field4257 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)I")
    private final int method1713(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4244[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4239[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I")
    public final int[] method1714(int arg0, int arg1) {
        class285.method1881(field4247, 0, arg0);
        if (arg1 < 10) {
            return field4247;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4246.method1970();
        this.field4234.method1970();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4254 != null) {
            this.field4254.method1970();
            this.field4236.method1970();
            var5 = (int) ((double) (this.field4254.field4672 - this.field4254.field4673) * 32.768D / var3);
            var6 = (int) ((double) this.field4254.field4673 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4242 != null) {
            this.field4242.method1970();
            this.field4238.method1970();
            var8 = (int) ((double) (this.field4242.field4672 - this.field4242.field4673) * 32.768D / var3);
            var9 = (int) ((double) this.field4242.field4673 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4233[var11] != 0) {
                field4256[var11] = 0;
                field4251[var11] = (int) ((double) this.field4241[var11] * var3);
                field4253[var11] = (this.field4233[var11] << 14) / 100;
                field4249[var11] = (int) ((double) (this.field4246.field4672 - this.field4246.field4673) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4255[var11]) / var3);
                field4257[var11] = (int) ((double) this.field4246.field4673 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4246.method1967(arg0);
            int var40 = this.field4234.method1967(arg0);
            if (this.field4254 != null) {
                int var41 = this.field4254.method1967(arg0);
                int var42 = this.field4236.method1967(arg0);
                var39 += this.method1713(var7, var42, this.field4254.field4674) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4242 != null) {
                int var43 = this.field4242.method1967(arg0);
                int var44 = this.field4238.method1967(arg0);
                var40 = var40 * ((this.method1713(var10, var44, this.field4242.field4674) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4233[var45] != 0) {
                    int var46 = field4251[var45] + var12;
                    if (var46 < arg0) {
                        field4247[var46] += this.method1713(field4256[var45], field4253[var45] * var40 >> 15, this.field4246.field4674);
                        field4256[var45] += (field4249[var45] * var39 >> 16) + field4257[var45];
                    }
                }
            }
        }
        if (this.field4252 != null) {
            this.field4252.method1970();
            this.field4237.method1970();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4252.method1967(arg0);
                int var18 = this.field4237.method1967(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4252.field4672 - this.field4252.field4673) * var17 >> 8) + this.field4252.field4673;
                } else {
                    var19 = ((this.field4252.field4672 - this.field4252.field4673) * var18 >> 8) + this.field4252.field4673;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4247[var16] = 0;
                }
            }
        }
        if (this.field4245 > 0 && this.field4248 > 0) {
            int var20 = (int) ((double) this.field4245 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4247[var21] += field4247[var21 - var20] * this.field4248 / 100;
            }
        }
        if (this.field4235.field353[0] > 0 || this.field4235.field353[1] > 0) {
            this.field4250.method1970();
            int var22 = this.field4250.method1967(arg0 + 1);
            int var23 = this.field4235.method145(0, (float) var22 / 65536.0F);
            int var24 = this.field4235.method145(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4247[var23 + var25] * (long) class22.field356 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4247[var23 + var25 - var36 - 1] * (long) class22.field352[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4247[var25 - var37 - 1] * (long) class22.field352[1][var37] >> 16);
                    }
                    field4247[var25] = var35;
                    var22 = this.field4250.method1967(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4247[var23 + var25] * (long) class22.field356 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4247[var23 + var25 - var33 - 1] * (long) class22.field352[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4247[var25 - var34 - 1] * (long) class22.field352[1][var34] >> 16);
                        }
                        field4247[var25] = var32;
                        var22 = this.field4250.method1967(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4247[var23 + var25 - var29 - 1] * (long) class22.field352[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4247[var25 - var30 - 1] * (long) class22.field352[1][var30] >> 16);
                            }
                            field4247[var25] = var28;
                            this.field4250.method1967(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4235.method145(0, (float) var22 / 65536.0F);
                    var24 = this.field4235.method145(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4247[var38] < -32768) {
                field4247[var38] = -32768;
            }
            if (field4247[var38] > 32767) {
                field4247[var38] = 32767;
            }
        }
        return field4247;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lbj;)V")
    public final void method1715(class215 arg0) {
        this.field4246 = new class293();
        this.field4246.method1969(arg0);
        this.field4234 = new class293();
        this.field4234.method1969(arg0);
        int var2 = arg0.method1374((byte) -60);
        if (var2 != 0) {
            arg0.field3280--;
            this.field4254 = new class293();
            this.field4254.method1969(arg0);
            this.field4236 = new class293();
            this.field4236.method1969(arg0);
        }
        int var3 = arg0.method1374((byte) -60);
        if (var3 != 0) {
            arg0.field3280--;
            this.field4242 = new class293();
            this.field4242.method1969(arg0);
            this.field4238 = new class293();
            this.field4238.method1969(arg0);
        }
        int var4 = arg0.method1374((byte) -60);
        if (var4 != 0) {
            arg0.field3280--;
            this.field4252 = new class293();
            this.field4252.method1969(arg0);
            this.field4237 = new class293();
            this.field4237.method1969(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1347(true);
            if (var6 == 0) {
                break;
            }
            this.field4233[var5] = var6;
            this.field4255[var5] = arg0.method1352((byte) -16);
            this.field4241[var5] = arg0.method1347(true);
        }
        this.field4245 = arg0.method1347(true);
        this.field4248 = arg0.method1347(true);
        this.field4240 = arg0.method1379(-89);
        this.field4243 = arg0.method1379(-123);
        this.field4235 = new class22();
        this.field4250 = new class293();
        this.field4235.method143(arg0, this.field4250);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4239[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4244 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4244[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4247 = new int[220500];
        field4249 = new int[5];
        field4253 = new int[5];
        field4256 = new int[5];
        field4257 = new int[5];
        field4251 = new int[5];
    }
}
