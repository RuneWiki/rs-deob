import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class9 {

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[I")
    private int[] field94 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[I")
    private int[] field90 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    private int field93 = 100;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public int field89 = 500;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public int field106 = 0;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "[I")
    private int[] field107 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    private int field98 = 0;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "[I")
    private static int[] field102 = new int[32768];

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "[I")
    private static int[] field99;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "[I")
    private static int[] field101;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "[I")
    private static int[] field105;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "[I")
    private static int[] field109;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "[I")
    private static int[] field111;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "[I")
    private static int[] field108;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "[I")
    private static int[] field112;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Lvd;")
    private class135 field100;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Lvd;")
    private class135 field103;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Lvd;")
    private class135 field104;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Lvd;")
    private class135 field110;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lvd;")
    private class135 field88;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lvd;")
    private class135 field92;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lvd;")
    private class135 field95;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lvd;")
    private class135 field96;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Lvd;")
    private class135 field97;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lql;")
    private class17 field91;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)I", line = 3)
    private final int method47(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field99[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field102[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[I", line = 27)
    public final int[] method48(int arg0, int arg1) {
        class36.method324(field101, 0, arg0);
        if (arg1 < 10) {
            return field101;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field103.method928();
        this.field100.method928();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field110 != null) {
            this.field110.method928();
            this.field96.method928();
            var5 = (int) ((double) (this.field110.field2357 - this.field110.field2358) * 32.768D / var3);
            var6 = (int) ((double) this.field110.field2358 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field97 != null) {
            this.field97.method928();
            this.field92.method928();
            var8 = (int) ((double) (this.field97.field2357 - this.field97.field2358) * 32.768D / var3);
            var9 = (int) ((double) this.field97.field2358 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field94[var11] != 0) {
                field105[var11] = 0;
                field109[var11] = (int) ((double) this.field90[var11] * var3);
                field112[var11] = (this.field94[var11] << 14) / 100;
                field111[var11] = (int) ((double) (this.field103.field2357 - this.field103.field2358) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field107[var11]) / var3);
                field108[var11] = (int) ((double) this.field103.field2358 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field103.method927(arg0);
            int var14 = this.field100.method927(arg0);
            if (this.field110 != null) {
                int var15 = this.field110.method927(arg0);
                int var16 = this.field96.method927(arg0);
                var13 += this.method47(var7, var16, this.field110.field2356) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field97 != null) {
                int var17 = this.field97.method927(arg0);
                int var18 = this.field92.method927(arg0);
                var14 = var14 * ((this.method47(var10, var18, this.field97.field2356) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field94[var19] != 0) {
                    int var20 = field109[var19] + var12;
                    if (var20 < arg0) {
                        field101[var20] += this.method47(field105[var19], field112[var19] * var14 >> 15, this.field103.field2356);
                        field105[var19] += (field111[var19] * var13 >> 16) + field108[var19];
                    }
                }
            }
        }
        if (this.field104 != null) {
            this.field104.method928();
            this.field88.method928();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field104.method927(arg0);
                int var26 = this.field88.method927(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field104.field2357 - this.field104.field2358) * var25 >> 8) + this.field104.field2358;
                } else {
                    var27 = ((this.field104.field2357 - this.field104.field2358) * var26 >> 8) + this.field104.field2358;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field101[var24] = 0;
                }
            }
        }
        if (this.field98 > 0 && this.field93 > 0) {
            int var28 = (int) ((double) this.field98 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field101[var29] += field101[var29 - var28] * this.field93 / 100;
            }
        }
        if (this.field91.field274[0] > 0 || this.field91.field274[1] > 0) {
            this.field95.method928();
            int var30 = this.field95.method927(arg0 + 1);
            int var31 = this.field91.method169(0, (float) var30 / 65536.0F);
            int var32 = this.field91.method169(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field101[var31 + var33] * (long) class17.field273 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field101[var31 + var33 - var36 - 1] * (long) class17.field270[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field101[var33 - var37 - 1] * (long) class17.field270[1][var37] >> 16);
                    }
                    field101[var33] = var35;
                    var30 = this.field95.method927(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field101[var31 + var33] * (long) class17.field273 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field101[var31 + var33 - var40 - 1] * (long) class17.field270[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field101[var33 - var41 - 1] * (long) class17.field270[1][var41] >> 16);
                        }
                        field101[var33] = var39;
                        var30 = this.field95.method927(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field101[var31 + var33 - var43 - 1] * (long) class17.field270[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field101[var33 - var44 - 1] * (long) class17.field270[1][var44] >> 16);
                            }
                            field101[var33] = var42;
                            this.field95.method927(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field91.method169(0, (float) var30 / 65536.0F);
                    var32 = this.field91.method169(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field101[var46] < -32768) {
                field101[var46] = -32768;
            }
            if (field101[var46] > 32767) {
                field101[var46] = 32767;
            }
        }
        return field101;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lkh;)V", line = 308)
    public final void method49(class14 arg0) {
        this.field103 = new class135();
        this.field103.method929(arg0);
        this.field100 = new class135();
        this.field100.method929(arg0);
        int var2 = arg0.method93(false);
        if (var2 != 0) {
            arg0.field195--;
            this.field110 = new class135();
            this.field110.method929(arg0);
            this.field96 = new class135();
            this.field96.method929(arg0);
        }
        int var3 = arg0.method93(false);
        if (var3 != 0) {
            arg0.field195--;
            this.field97 = new class135();
            this.field97.method929(arg0);
            this.field92 = new class135();
            this.field92.method929(arg0);
        }
        int var4 = arg0.method93(false);
        if (var4 != 0) {
            arg0.field195--;
            this.field104 = new class135();
            this.field104.method929(arg0);
            this.field88 = new class135();
            this.field88.method929(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method104(64);
            if (var6 == 0) {
                break;
            }
            this.field94[var5] = var6;
            this.field107[var5] = arg0.method129(-49152);
            this.field90[var5] = arg0.method104(-26);
        }
        this.field98 = arg0.method104(101);
        this.field93 = arg0.method104(68);
        this.field89 = arg0.method116(-1);
        this.field106 = arg0.method116(-1);
        this.field91 = new class17();
        this.field95 = new class135();
        this.field91.method171(arg0, this.field95);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V", line = 373)
    public static void method50() {
        field101 = null;
        field102 = null;
        field99 = null;
        field105 = null;
        field109 = null;
        field112 = null;
        field111 = null;
        field108 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field102[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field99 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field99[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field101 = new int[220500];
        field105 = new int[5];
        field109 = new int[5];
        field111 = new int[5];
        field108 = new int[5];
        field112 = new int[5];
    }
}
