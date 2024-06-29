import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class60 {

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "[I")
    private int[] field949 = new int[5];

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    private int field946 = 0;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
    private int[] field957 = new int[5];

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    private int field947 = 100;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
    private int[] field960 = new int[5];

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public int field964 = 0;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public int field962 = 500;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[I")
    private static int[] field944 = new int[32768];

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
    private static int[] field950;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[I")
    private static int[] field948;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "[I")
    private static int[] field961;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "[I")
    private static int[] field963;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "[I")
    private static int[] field966;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "[I")
    private static int[] field967;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "[I")
    private static int[] field968;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lma;")
    private class193 field945;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lma;")
    private class193 field951;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lma;")
    private class193 field952;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lma;")
    private class193 field953;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lma;")
    private class193 field954;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lma;")
    private class193 field955;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lma;")
    private class193 field956;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Lma;")
    private class193 field959;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "Lma;")
    private class193 field965;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Lve;")
    private class194 field958;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I")
    private final int method481(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field950[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field944[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lf;)V")
    public final void method482(class37 arg0) {
        this.field952 = new class193();
        this.field952.method1298(arg0);
        this.field954 = new class193();
        this.field954.method1298(arg0);
        int var2 = arg0.method333((byte) -59);
        if (var2 != 0) {
            arg0.field588--;
            this.field959 = new class193();
            this.field959.method1298(arg0);
            this.field956 = new class193();
            this.field956.method1298(arg0);
        }
        int var3 = arg0.method333((byte) -59);
        if (var3 != 0) {
            arg0.field588--;
            this.field965 = new class193();
            this.field965.method1298(arg0);
            this.field953 = new class193();
            this.field953.method1298(arg0);
        }
        int var4 = arg0.method333((byte) -59);
        if (var4 != 0) {
            arg0.field588--;
            this.field945 = new class193();
            this.field945.method1298(arg0);
            this.field955 = new class193();
            this.field955.method1298(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method285((byte) 35);
            if (var6 == 0) {
                break;
            }
            this.field957[var5] = var6;
            this.field949[var5] = arg0.method282(128);
            this.field960[var5] = arg0.method285((byte) 35);
        }
        this.field946 = arg0.method285((byte) 35);
        this.field947 = arg0.method285((byte) 35);
        this.field962 = arg0.method293(116);
        this.field964 = arg0.method293(0);
        this.field958 = new class194();
        this.field951 = new class193();
        this.field958.method1300(arg0, this.field951);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I")
    public final int[] method483(int arg0, int arg1) {
        class236.method1590(field948, 0, arg0);
        if (arg1 < 10) {
            return field948;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field952.method1299();
        this.field954.method1299();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field959 != null) {
            this.field959.method1299();
            this.field956.method1299();
            var5 = (int) ((double) (this.field959.field3052 - this.field959.field3049) * 32.768D / var3);
            var6 = (int) ((double) this.field959.field3049 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field965 != null) {
            this.field965.method1299();
            this.field953.method1299();
            var8 = (int) ((double) (this.field965.field3052 - this.field965.field3049) * 32.768D / var3);
            var9 = (int) ((double) this.field965.field3049 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field957[var11] != 0) {
                field967[var11] = 0;
                field968[var11] = (int) ((double) this.field960[var11] * var3);
                field966[var11] = (this.field957[var11] << 14) / 100;
                field963[var11] = (int) ((double) (this.field952.field3052 - this.field952.field3049) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field949[var11]) / var3);
                field961[var11] = (int) ((double) this.field952.field3049 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field952.method1297(arg0);
            int var40 = this.field954.method1297(arg0);
            if (this.field959 != null) {
                int var41 = this.field959.method1297(arg0);
                int var42 = this.field956.method1297(arg0);
                var39 += this.method481(var7, var42, this.field959.field3053) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field965 != null) {
                int var43 = this.field965.method1297(arg0);
                int var44 = this.field953.method1297(arg0);
                var40 = var40 * ((this.method481(var10, var44, this.field965.field3053) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field957[var45] != 0) {
                    int var46 = field968[var45] + var12;
                    if (var46 < arg0) {
                        field948[var46] += this.method481(field967[var45], field966[var45] * var40 >> 15, this.field952.field3053);
                        field967[var45] += (field963[var45] * var39 >> 16) + field961[var45];
                    }
                }
            }
        }
        if (this.field945 != null) {
            this.field945.method1299();
            this.field955.method1299();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field945.method1297(arg0);
                int var18 = this.field955.method1297(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field945.field3052 - this.field945.field3049) * var17 >> 8) + this.field945.field3049;
                } else {
                    var19 = ((this.field945.field3052 - this.field945.field3049) * var18 >> 8) + this.field945.field3049;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field948[var16] = 0;
                }
            }
        }
        if (this.field946 > 0 && this.field947 > 0) {
            int var20 = (int) ((double) this.field946 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field948[var21] += field948[var21 - var20] * this.field947 / 100;
            }
        }
        if (this.field958.field3062[0] > 0 || this.field958.field3062[1] > 0) {
            this.field951.method1299();
            int var22 = this.field951.method1297(arg0 + 1);
            int var23 = this.field958.method1304(0, (float) var22 / 65536.0F);
            int var24 = this.field958.method1304(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field948[var23 + var25] * (long) class194.field3061 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field948[var23 + var25 - var36 - 1] * (long) class194.field3066[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field948[var25 - var37 - 1] * (long) class194.field3066[1][var37] >> 16);
                    }
                    field948[var25] = var35;
                    var22 = this.field951.method1297(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field948[var23 + var25] * (long) class194.field3061 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field948[var23 + var25 - var33 - 1] * (long) class194.field3066[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field948[var25 - var34 - 1] * (long) class194.field3066[1][var34] >> 16);
                        }
                        field948[var25] = var32;
                        var22 = this.field951.method1297(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field948[var23 + var25 - var29 - 1] * (long) class194.field3066[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field948[var25 - var30 - 1] * (long) class194.field3066[1][var30] >> 16);
                            }
                            field948[var25] = var28;
                            this.field951.method1297(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field958.method1304(0, (float) var22 / 65536.0F);
                    var24 = this.field958.method1304(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field948[var38] < -32768) {
                field948[var38] = -32768;
            }
            if (field948[var38] > 32767) {
                field948[var38] = 32767;
            }
        }
        return field948;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
    public static void method484() {
        field948 = null;
        field944 = null;
        field950 = null;
        field967 = null;
        field968 = null;
        field966 = null;
        field963 = null;
        field961 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field944[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field950 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field950[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field948 = new int[220500];
        field961 = new int[5];
        field963 = new int[5];
        field966 = new int[5];
        field967 = new int[5];
        field968 = new int[5];
    }
}
