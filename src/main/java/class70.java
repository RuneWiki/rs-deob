import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class70 {

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    private int field950 = 100;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public int field955 = 0;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "[I")
    private int[] field961 = new int[5];

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public int field946 = 500;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "[I")
    private int[] field959 = new int[5];

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    private int field958 = 0;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "[I")
    private int[] field960 = new int[5];

    @OriginalMember(owner = "client!af", name = "n", descriptor = "[I")
    private static int[] field956 = new int[32768];

    @OriginalMember(owner = "client!af", name = "k", descriptor = "[I")
    private static int[] field953;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "[I")
    private static int[] field957;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "[I")
    private static int[] field965;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "[I")
    private static int[] field964;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "[I")
    private static int[] field966;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "[I")
    private static int[] field963;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "[I")
    private static int[] field967;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lmb;")
    private class162 field943;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lmb;")
    private class162 field944;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lmb;")
    private class162 field945;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lmb;")
    private class162 field948;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lmb;")
    private class162 field949;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lmb;")
    private class162 field951;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lmb;")
    private class162 field952;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Lmb;")
    private class162 field954;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Lmb;")
    private class162 field962;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lnh;")
    private class55 field947;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lql;)V")
    public final void method435(class224 arg0) {
        this.field949 = new class162();
        this.field949.method1076(arg0);
        this.field948 = new class162();
        this.field948.method1076(arg0);
        int var2 = arg0.method1453((byte) -128);
        if (var2 != 0) {
            arg0.field3402--;
            this.field954 = new class162();
            this.field954.method1076(arg0);
            this.field944 = new class162();
            this.field944.method1076(arg0);
        }
        int var3 = arg0.method1453((byte) -128);
        if (var3 != 0) {
            arg0.field3402--;
            this.field945 = new class162();
            this.field945.method1076(arg0);
            this.field943 = new class162();
            this.field943.method1076(arg0);
        }
        int var4 = arg0.method1453((byte) -127);
        if (var4 != 0) {
            arg0.field3402--;
            this.field962 = new class162();
            this.field962.method1076(arg0);
            this.field952 = new class162();
            this.field952.method1076(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1461(true);
            if (var6 == 0) {
                break;
            }
            this.field960[var5] = var6;
            this.field961[var5] = arg0.method1471((byte) -47);
            this.field959[var5] = arg0.method1461(true);
        }
        this.field958 = arg0.method1461(true);
        this.field950 = arg0.method1461(true);
        this.field946 = arg0.method1445(false);
        this.field955 = arg0.method1445(false);
        this.field947 = new class55();
        this.field951 = new class162();
        this.field947.method344(arg0, this.field951);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)I")
    private final int method436(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field953[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field956[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I")
    public final int[] method437(int arg0, int arg1) {
        class115.method777(field957, 0, arg0);
        if (arg1 < 10) {
            return field957;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field949.method1077();
        this.field948.method1077();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field954 != null) {
            this.field954.method1077();
            this.field944.method1077();
            var5 = (int) ((double) (this.field954.field2249 - this.field954.field2251) * 32.768D / var3);
            var6 = (int) ((double) this.field954.field2251 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field945 != null) {
            this.field945.method1077();
            this.field943.method1077();
            var8 = (int) ((double) (this.field945.field2249 - this.field945.field2251) * 32.768D / var3);
            var9 = (int) ((double) this.field945.field2251 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field960[var11] != 0) {
                field965[var11] = 0;
                field964[var11] = (int) ((double) this.field959[var11] * var3);
                field963[var11] = (this.field960[var11] << 14) / 100;
                field967[var11] = (int) ((double) (this.field949.field2249 - this.field949.field2251) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field961[var11]) / var3);
                field966[var11] = (int) ((double) this.field949.field2251 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field949.method1079(arg0);
            int var40 = this.field948.method1079(arg0);
            if (this.field954 != null) {
                int var41 = this.field954.method1079(arg0);
                int var42 = this.field944.method1079(arg0);
                var39 += this.method436(var7, var42, this.field954.field2254) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field945 != null) {
                int var43 = this.field945.method1079(arg0);
                int var44 = this.field943.method1079(arg0);
                var40 = var40 * ((this.method436(var10, var44, this.field945.field2254) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field960[var45] != 0) {
                    int var46 = field964[var45] + var12;
                    if (var46 < arg0) {
                        field957[var46] += this.method436(field965[var45], field963[var45] * var40 >> 15, this.field949.field2254);
                        field965[var45] += (field967[var45] * var39 >> 16) + field966[var45];
                    }
                }
            }
        }
        if (this.field962 != null) {
            this.field962.method1077();
            this.field952.method1077();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field962.method1079(arg0);
                int var18 = this.field952.method1079(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field962.field2249 - this.field962.field2251) * var17 >> 8) + this.field962.field2251;
                } else {
                    var19 = ((this.field962.field2249 - this.field962.field2251) * var18 >> 8) + this.field962.field2251;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field957[var16] = 0;
                }
            }
        }
        if (this.field958 > 0 && this.field950 > 0) {
            int var20 = (int) ((double) this.field958 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field957[var21] += field957[var21 - var20] * this.field950 / 100;
            }
        }
        if (this.field947.field794[0] > 0 || this.field947.field794[1] > 0) {
            this.field951.method1077();
            int var22 = this.field951.method1079(arg0 + 1);
            int var23 = this.field947.method341(0, (float) var22 / 65536.0F);
            int var24 = this.field947.method341(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field957[var23 + var25] * (long) class55.field796 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field957[var23 + var25 - var36 - 1] * (long) class55.field799[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field957[var25 - var37 - 1] * (long) class55.field799[1][var37] >> 16);
                    }
                    field957[var25] = var35;
                    var22 = this.field951.method1079(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field957[var23 + var25] * (long) class55.field796 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field957[var23 + var25 - var33 - 1] * (long) class55.field799[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field957[var25 - var34 - 1] * (long) class55.field799[1][var34] >> 16);
                        }
                        field957[var25] = var32;
                        var22 = this.field951.method1079(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field957[var23 + var25 - var29 - 1] * (long) class55.field799[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field957[var25 - var30 - 1] * (long) class55.field799[1][var30] >> 16);
                            }
                            field957[var25] = var28;
                            this.field951.method1079(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field947.method341(0, (float) var22 / 65536.0F);
                    var24 = this.field947.method341(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field957[var38] < -32768) {
                field957[var38] = -32768;
            }
            if (field957[var38] > 32767) {
                field957[var38] = 32767;
            }
        }
        return field957;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V")
    public static void method438() {
        field957 = null;
        field956 = null;
        field953 = null;
        field965 = null;
        field964 = null;
        field963 = null;
        field967 = null;
        field966 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field956[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field953 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field953[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field957 = new int[220500];
        field965 = new int[5];
        field964 = new int[5];
        field966 = new int[5];
        field963 = new int[5];
        field967 = new int[5];
    }
}
