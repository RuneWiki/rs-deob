import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class166 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public int field2897 = 500;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "[I")
    private int[] field2907 = new int[5];

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    private int field2898 = 0;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "[I")
    private int[] field2913 = new int[5];

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public int field2902 = 0;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    private int field2915 = 100;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "[I")
    private int[] field2911 = new int[5];

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "[I")
    private static int[] field2901 = new int[32768];

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "[I")
    private static int[] field2916;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "[I")
    private static int[] field2910;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "[I")
    private static int[] field2919;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "[I")
    private static int[] field2920;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "[I")
    private static int[] field2917;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "[I")
    private static int[] field2918;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "[I")
    private static int[] field2921;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lpi;")
    private class138 field2909;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Log;")
    private class217 field2899;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Log;")
    private class217 field2900;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Log;")
    private class217 field2903;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Log;")
    private class217 field2904;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Log;")
    private class217 field2905;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Log;")
    private class217 field2906;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Log;")
    private class217 field2908;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Log;")
    private class217 field2912;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Log;")
    private class217 field2914;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
    private final int method1163(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2916[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2901[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Llj;)V")
    public final void method1164(class25 arg0) {
        this.field2908 = new class217();
        this.field2908.method1452(arg0);
        this.field2906 = new class217();
        this.field2906.method1452(arg0);
        int var2 = arg0.method189((byte) -103);
        if (var2 != 0) {
            arg0.field481--;
            this.field2905 = new class217();
            this.field2905.method1452(arg0);
            this.field2900 = new class217();
            this.field2900.method1452(arg0);
        }
        int var3 = arg0.method189((byte) -103);
        if (var3 != 0) {
            arg0.field481--;
            this.field2904 = new class217();
            this.field2904.method1452(arg0);
            this.field2912 = new class217();
            this.field2912.method1452(arg0);
        }
        int var4 = arg0.method189((byte) -103);
        if (var4 != 0) {
            arg0.field481--;
            this.field2899 = new class217();
            this.field2899.method1452(arg0);
            this.field2914 = new class217();
            this.field2914.method1452(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method210(65536);
            if (var6 == 0) {
                break;
            }
            this.field2907[var5] = var6;
            this.field2913[var5] = arg0.method204(109);
            this.field2911[var5] = arg0.method210(65536);
        }
        this.field2898 = arg0.method210(65536);
        this.field2915 = arg0.method210(65536);
        this.field2897 = arg0.method193((byte) 77);
        this.field2902 = arg0.method193((byte) 77);
        this.field2909 = new class138();
        this.field2903 = new class217();
        this.field2909.method954(arg0, this.field2903);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()V")
    public static void method1165() {
        field2910 = null;
        field2901 = null;
        field2916 = null;
        field2920 = null;
        field2918 = null;
        field2917 = null;
        field2921 = null;
        field2919 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[I")
    public final int[] method1166(int arg0, int arg1) {
        class143.method990(field2910, 0, arg0);
        if (arg1 < 10) {
            return field2910;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2908.method1455();
        this.field2906.method1455();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2905 != null) {
            this.field2905.method1455();
            this.field2900.method1455();
            var5 = (int) ((double) (this.field2905.field3728 - this.field2905.field3727) * 32.768D / var3);
            var6 = (int) ((double) this.field2905.field3727 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2904 != null) {
            this.field2904.method1455();
            this.field2912.method1455();
            var8 = (int) ((double) (this.field2904.field3728 - this.field2904.field3727) * 32.768D / var3);
            var9 = (int) ((double) this.field2904.field3727 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2907[var11] != 0) {
                field2920[var11] = 0;
                field2918[var11] = (int) ((double) this.field2911[var11] * var3);
                field2917[var11] = (this.field2907[var11] << 14) / 100;
                field2921[var11] = (int) ((double) (this.field2908.field3728 - this.field2908.field3727) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2913[var11]) / var3);
                field2919[var11] = (int) ((double) this.field2908.field3727 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2908.method1453(arg0);
            int var40 = this.field2906.method1453(arg0);
            if (this.field2905 != null) {
                int var41 = this.field2905.method1453(arg0);
                int var42 = this.field2900.method1453(arg0);
                var39 += this.method1163(var7, var42, this.field2905.field3724) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2904 != null) {
                int var43 = this.field2904.method1453(arg0);
                int var44 = this.field2912.method1453(arg0);
                var40 = var40 * ((this.method1163(var10, var44, this.field2904.field3724) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2907[var45] != 0) {
                    int var46 = field2918[var45] + var12;
                    if (var46 < arg0) {
                        field2910[var46] += this.method1163(field2920[var45], field2917[var45] * var40 >> 15, this.field2908.field3724);
                        field2920[var45] += (field2921[var45] * var39 >> 16) + field2919[var45];
                    }
                }
            }
        }
        if (this.field2899 != null) {
            this.field2899.method1455();
            this.field2914.method1455();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2899.method1453(arg0);
                int var18 = this.field2914.method1453(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2899.field3728 - this.field2899.field3727) * var17 >> 8) + this.field2899.field3727;
                } else {
                    var19 = ((this.field2899.field3728 - this.field2899.field3727) * var18 >> 8) + this.field2899.field3727;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2910[var16] = 0;
                }
            }
        }
        if (this.field2898 > 0 && this.field2915 > 0) {
            int var20 = (int) ((double) this.field2898 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2910[var21] += field2910[var21 - var20] * this.field2915 / 100;
            }
        }
        if (this.field2909.field2416[0] > 0 || this.field2909.field2416[1] > 0) {
            this.field2903.method1455();
            int var22 = this.field2903.method1453(arg0 + 1);
            int var23 = this.field2909.method953(0, (float) var22 / 65536.0F);
            int var24 = this.field2909.method953(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2910[var23 + var25] * (long) class138.field2417 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2910[var23 + var25 - var36 - 1] * (long) class138.field2413[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2910[var25 - var37 - 1] * (long) class138.field2413[1][var37] >> 16);
                    }
                    field2910[var25] = var35;
                    var22 = this.field2903.method1453(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2910[var23 + var25] * (long) class138.field2417 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2910[var23 + var25 - var33 - 1] * (long) class138.field2413[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2910[var25 - var34 - 1] * (long) class138.field2413[1][var34] >> 16);
                        }
                        field2910[var25] = var32;
                        var22 = this.field2903.method1453(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2910[var23 + var25 - var29 - 1] * (long) class138.field2413[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2910[var25 - var30 - 1] * (long) class138.field2413[1][var30] >> 16);
                            }
                            field2910[var25] = var28;
                            this.field2903.method1453(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2909.method953(0, (float) var22 / 65536.0F);
                    var24 = this.field2909.method953(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2910[var38] < -32768) {
                field2910[var38] = -32768;
            }
            if (field2910[var38] > 32767) {
                field2910[var38] = 32767;
            }
        }
        return field2910;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2901[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2916 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2916[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2910 = new int[220500];
        field2919 = new int[5];
        field2920 = new int[5];
        field2917 = new int[5];
        field2918 = new int[5];
        field2921 = new int[5];
    }
}
