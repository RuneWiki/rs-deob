import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class54 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public int field957 = 0;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    private int field958 = 0;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
    private int[] field961 = new int[5];

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public int field962 = 500;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "[I")
    private int[] field975 = new int[5];

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    private int field971 = 100;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "[I")
    private int[] field973 = new int[5];

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[I")
    private static int[] field964 = new int[32768];

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "[I")
    private static int[] field969;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[I")
    private static int[] field963;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "[I")
    private static int[] field977;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "[I")
    private static int[] field974;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "[I")
    private static int[] field978;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "[I")
    private static int[] field979;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "[I")
    private static int[] field981;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Lud;")
    private class51 field972;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Ljl;")
    private class53 field959;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Ljl;")
    private class53 field960;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Ljl;")
    private class53 field965;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Ljl;")
    private class53 field966;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Ljl;")
    private class53 field967;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Ljl;")
    private class53 field968;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Ljl;")
    private class53 field970;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Ljl;")
    private class53 field976;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "Ljl;")
    private class53 field980;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I")
    private final int method441(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field969[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field964[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
    public static void method442() {
        field963 = null;
        field964 = null;
        field969 = null;
        field981 = null;
        field974 = null;
        field978 = null;
        field977 = null;
        field979 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
    public final int[] method443(int arg0, int arg1) {
        class68.method535(field963, 0, arg0);
        if (arg1 < 10) {
            return field963;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field976.method439();
        this.field970.method439();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field980 != null) {
            this.field980.method439();
            this.field968.method439();
            var5 = (int) ((double) (this.field980.field949 - this.field980.field948) * 32.768D / var3);
            var6 = (int) ((double) this.field980.field948 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field959 != null) {
            this.field959.method439();
            this.field966.method439();
            var8 = (int) ((double) (this.field959.field949 - this.field959.field948) * 32.768D / var3);
            var9 = (int) ((double) this.field959.field948 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field975[var11] != 0) {
                field981[var11] = 0;
                field974[var11] = (int) ((double) this.field973[var11] * var3);
                field978[var11] = (this.field975[var11] << 14) / 100;
                field977[var11] = (int) ((double) (this.field976.field949 - this.field976.field948) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field961[var11]) / var3);
                field979[var11] = (int) ((double) this.field976.field948 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field976.method440(arg0);
            int var40 = this.field970.method440(arg0);
            if (this.field980 != null) {
                int var41 = this.field980.method440(arg0);
                int var42 = this.field968.method440(arg0);
                var39 += this.method441(var7, var42, this.field980.field951) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field959 != null) {
                int var43 = this.field959.method440(arg0);
                int var44 = this.field966.method440(arg0);
                var40 = var40 * ((this.method441(var10, var44, this.field959.field951) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field975[var45] != 0) {
                    int var46 = field974[var45] + var12;
                    if (var46 < arg0) {
                        field963[var46] += this.method441(field981[var45], field978[var45] * var40 >> 15, this.field976.field951);
                        field981[var45] += (field977[var45] * var39 >> 16) + field979[var45];
                    }
                }
            }
        }
        if (this.field965 != null) {
            this.field965.method439();
            this.field960.method439();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field965.method440(arg0);
                int var18 = this.field960.method440(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field965.field949 - this.field965.field948) * var17 >> 8) + this.field965.field948;
                } else {
                    var19 = ((this.field965.field949 - this.field965.field948) * var18 >> 8) + this.field965.field948;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field963[var16] = 0;
                }
            }
        }
        if (this.field958 > 0 && this.field971 > 0) {
            int var20 = (int) ((double) this.field958 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field963[var21] += field963[var21 - var20] * this.field971 / 100;
            }
        }
        if (this.field972.field930[0] > 0 || this.field972.field930[1] > 0) {
            this.field967.method439();
            int var22 = this.field967.method440(arg0 + 1);
            int var23 = this.field972.method431(0, (float) var22 / 65536.0F);
            int var24 = this.field972.method431(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field963[var23 + var25] * (long) class51.field932 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field963[var23 + var25 - var36 - 1] * (long) class51.field931[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field963[var25 - var37 - 1] * (long) class51.field931[1][var37] >> 16);
                    }
                    field963[var25] = var35;
                    var22 = this.field967.method440(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field963[var23 + var25] * (long) class51.field932 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field963[var23 + var25 - var33 - 1] * (long) class51.field931[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field963[var25 - var34 - 1] * (long) class51.field931[1][var34] >> 16);
                        }
                        field963[var25] = var32;
                        var22 = this.field967.method440(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field963[var23 + var25 - var29 - 1] * (long) class51.field931[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field963[var25 - var30 - 1] * (long) class51.field931[1][var30] >> 16);
                            }
                            field963[var25] = var28;
                            this.field967.method440(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field972.method431(0, (float) var22 / 65536.0F);
                    var24 = this.field972.method431(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field963[var38] < -32768) {
                field963[var38] = -32768;
            }
            if (field963[var38] > 32767) {
                field963[var38] = 32767;
            }
        }
        return field963;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lig;)V")
    public final void method444(class136 arg0) {
        this.field976 = new class53();
        this.field976.method437(arg0);
        this.field970 = new class53();
        this.field970.method437(arg0);
        int var2 = arg0.method1012(4);
        if (var2 != 0) {
            arg0.field2231--;
            this.field980 = new class53();
            this.field980.method437(arg0);
            this.field968 = new class53();
            this.field968.method437(arg0);
        }
        int var3 = arg0.method1012(4);
        if (var3 != 0) {
            arg0.field2231--;
            this.field959 = new class53();
            this.field959.method437(arg0);
            this.field966 = new class53();
            this.field966.method437(arg0);
        }
        int var4 = arg0.method1012(4);
        if (var4 != 0) {
            arg0.field2231--;
            this.field965 = new class53();
            this.field965.method437(arg0);
            this.field960 = new class53();
            this.field960.method437(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1004(122);
            if (var6 == 0) {
                break;
            }
            this.field975[var5] = var6;
            this.field961[var5] = arg0.method992(-31623);
            this.field973[var5] = arg0.method1004(122);
        }
        this.field958 = arg0.method1004(122);
        this.field971 = arg0.method1004(122);
        this.field962 = arg0.method996(65280);
        this.field957 = arg0.method996(65280);
        this.field972 = new class51();
        this.field967 = new class53();
        this.field972.method428(arg0, this.field967);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field964[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field969 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field969[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field963 = new int[220500];
        field977 = new int[5];
        field974 = new int[5];
        field978 = new int[5];
        field979 = new int[5];
        field981 = new int[5];
    }
}
