import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class130 {

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public int field2322 = 500;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[I")
    private int[] field2323 = new int[5];

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "[I")
    private int[] field2330 = new int[5];

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "[I")
    private int[] field2331 = new int[5];

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    private int field2329 = 0;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public int field2333 = 0;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    private int field2321 = 100;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
    private static int[] field2319 = new int[32768];

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
    private static int[] field2317;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "[I")
    private static int[] field2328;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "[I")
    private static int[] field2334;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "[I")
    private static int[] field2337;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "[I")
    private static int[] field2335;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "[I")
    private static int[] field2338;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "[I")
    private static int[] field2336;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Ljd;")
    private class234 field2314;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Ljd;")
    private class234 field2315;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Ljd;")
    private class234 field2316;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Ljd;")
    private class234 field2318;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Ljd;")
    private class234 field2320;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Ljd;")
    private class234 field2324;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Ljd;")
    private class234 field2325;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Ljd;")
    private class234 field2326;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Ljd;")
    private class234 field2332;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lvc;")
    private class97 field2327;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)I")
    private final int method902(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2317[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2319[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
    public static void method903() {
        field2328 = null;
        field2319 = null;
        field2317 = null;
        field2336 = null;
        field2334 = null;
        field2337 = null;
        field2338 = null;
        field2335 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[I")
    public final int[] method904(int arg0, int arg1) {
        class86.method646(field2328, 0, arg0);
        if (arg1 < 10) {
            return field2328;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2326.method1543();
        this.field2324.method1543();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2325 != null) {
            this.field2325.method1543();
            this.field2332.method1543();
            var5 = (int) ((double) (this.field2325.field4026 - this.field2325.field4029) * 32.768D / var3);
            var6 = (int) ((double) this.field2325.field4029 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2316 != null) {
            this.field2316.method1543();
            this.field2320.method1543();
            var8 = (int) ((double) (this.field2316.field4026 - this.field2316.field4029) * 32.768D / var3);
            var9 = (int) ((double) this.field2316.field4029 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2330[var11] != 0) {
                field2336[var11] = 0;
                field2334[var11] = (int) ((double) this.field2331[var11] * var3);
                field2337[var11] = (this.field2330[var11] << 14) / 100;
                field2338[var11] = (int) ((double) (this.field2326.field4026 - this.field2326.field4029) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2323[var11]) / var3);
                field2335[var11] = (int) ((double) this.field2326.field4029 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2326.method1545(arg0);
            int var40 = this.field2324.method1545(arg0);
            if (this.field2325 != null) {
                int var41 = this.field2325.method1545(arg0);
                int var42 = this.field2332.method1545(arg0);
                var39 += this.method902(var7, var42, this.field2325.field4025) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2316 != null) {
                int var43 = this.field2316.method1545(arg0);
                int var44 = this.field2320.method1545(arg0);
                var40 = var40 * ((this.method902(var10, var44, this.field2316.field4025) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2330[var45] != 0) {
                    int var46 = field2334[var45] + var12;
                    if (var46 < arg0) {
                        field2328[var46] += this.method902(field2336[var45], field2337[var45] * var40 >> 15, this.field2326.field4025);
                        field2336[var45] += (field2338[var45] * var39 >> 16) + field2335[var45];
                    }
                }
            }
        }
        if (this.field2315 != null) {
            this.field2315.method1543();
            this.field2318.method1543();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2315.method1545(arg0);
                int var18 = this.field2318.method1545(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2315.field4026 - this.field2315.field4029) * var17 >> 8) + this.field2315.field4029;
                } else {
                    var19 = ((this.field2315.field4026 - this.field2315.field4029) * var18 >> 8) + this.field2315.field4029;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2328[var16] = 0;
                }
            }
        }
        if (this.field2329 > 0 && this.field2321 > 0) {
            int var20 = (int) ((double) this.field2329 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2328[var21] += field2328[var21 - var20] * this.field2321 / 100;
            }
        }
        if (this.field2327.field1816[0] > 0 || this.field2327.field1816[1] > 0) {
            this.field2314.method1543();
            int var22 = this.field2314.method1545(arg0 + 1);
            int var23 = this.field2327.method703(0, (float) var22 / 65536.0F);
            int var24 = this.field2327.method703(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2328[var23 + var25] * (long) class97.field1821 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2328[var23 + var25 - var36 - 1] * (long) class97.field1818[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2328[var25 - var37 - 1] * (long) class97.field1818[1][var37] >> 16);
                    }
                    field2328[var25] = var35;
                    var22 = this.field2314.method1545(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2328[var23 + var25] * (long) class97.field1821 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2328[var23 + var25 - var33 - 1] * (long) class97.field1818[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2328[var25 - var34 - 1] * (long) class97.field1818[1][var34] >> 16);
                        }
                        field2328[var25] = var32;
                        var22 = this.field2314.method1545(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2328[var23 + var25 - var29 - 1] * (long) class97.field1818[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2328[var25 - var30 - 1] * (long) class97.field1818[1][var30] >> 16);
                            }
                            field2328[var25] = var28;
                            this.field2314.method1545(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2327.method703(0, (float) var22 / 65536.0F);
                    var24 = this.field2327.method703(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2328[var38] < -32768) {
                field2328[var38] = -32768;
            }
            if (field2328[var38] > 32767) {
                field2328[var38] = 32767;
            }
        }
        return field2328;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lk;)V")
    public final void method905(class152 arg0) {
        this.field2326 = new class234();
        this.field2326.method1542(arg0);
        this.field2324 = new class234();
        this.field2324.method1542(arg0);
        int var2 = arg0.method1051((byte) 82);
        if (var2 != 0) {
            arg0.field2677--;
            this.field2325 = new class234();
            this.field2325.method1542(arg0);
            this.field2332 = new class234();
            this.field2332.method1542(arg0);
        }
        int var3 = arg0.method1051((byte) -85);
        if (var3 != 0) {
            arg0.field2677--;
            this.field2316 = new class234();
            this.field2316.method1542(arg0);
            this.field2320 = new class234();
            this.field2320.method1542(arg0);
        }
        int var4 = arg0.method1051((byte) -36);
        if (var4 != 0) {
            arg0.field2677--;
            this.field2315 = new class234();
            this.field2315.method1542(arg0);
            this.field2318 = new class234();
            this.field2318.method1542(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1055(-32768);
            if (var6 == 0) {
                break;
            }
            this.field2330[var5] = var6;
            this.field2323[var5] = arg0.method1046(-93);
            this.field2331[var5] = arg0.method1055(-32768);
        }
        this.field2329 = arg0.method1055(-32768);
        this.field2321 = arg0.method1055(-32768);
        this.field2322 = arg0.method1063(-17162);
        this.field2333 = arg0.method1063(-17162);
        this.field2327 = new class97();
        this.field2314 = new class234();
        this.field2327.method705(arg0, this.field2314);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2319[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2317 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2317[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2328 = new int[220500];
        field2334 = new int[5];
        field2337 = new int[5];
        field2335 = new int[5];
        field2338 = new int[5];
        field2336 = new int[5];
    }
}
