import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class153 {

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    private int field3437 = 0;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "[I")
    private int[] field3434 = new int[5];

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public int field3449 = 500;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[I")
    private int[] field3448 = new int[5];

    @OriginalMember(owner = "client!w", name = "u", descriptor = "[I")
    private int[] field3454 = new int[5];

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public int field3439 = 0;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    private int field3435 = 100;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "[I")
    private static int[] field3440 = new int[32768];

    @OriginalMember(owner = "client!w", name = "m", descriptor = "[I")
    private static int[] field3446;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[I")
    private static int[] field3441;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "[I")
    private static int[] field3451;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
    private static int[] field3456;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "[I")
    private static int[] field3453;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[I")
    private static int[] field3457;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[I")
    private static int[] field3458;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Lpf;")
    private class110 field3455;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lf;")
    private class36 field3436;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Lf;")
    private class36 field3438;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lf;")
    private class36 field3442;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lf;")
    private class36 field3443;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lf;")
    private class36 field3444;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lf;")
    private class36 field3445;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lf;")
    private class36 field3447;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lf;")
    private class36 field3450;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lf;")
    private class36 field3452;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
    public static void method1164() {
        field3441 = null;
        field3440 = null;
        field3446 = null;
        field3458 = null;
        field3456 = null;
        field3453 = null;
        field3457 = null;
        field3451 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)I")
    private final int method1165(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3446[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3440[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lm;)V")
    public final void method1166(class83 arg0) {
        this.field3445 = new class36();
        this.field3445.method279(arg0);
        this.field3443 = new class36();
        this.field3443.method279(arg0);
        int var2 = arg0.method638(0);
        if (var2 != 0) {
            arg0.field2076--;
            this.field3450 = new class36();
            this.field3450.method279(arg0);
            this.field3444 = new class36();
            this.field3444.method279(arg0);
        }
        int var3 = arg0.method638(0);
        if (var3 != 0) {
            arg0.field2076--;
            this.field3452 = new class36();
            this.field3452.method279(arg0);
            this.field3438 = new class36();
            this.field3438.method279(arg0);
        }
        int var4 = arg0.method638(0);
        if (var4 != 0) {
            arg0.field2076--;
            this.field3447 = new class36();
            this.field3447.method279(arg0);
            this.field3442 = new class36();
            this.field3442.method279(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method636((byte) -50);
            if (var6 == 0) {
                break;
            }
            this.field3434[var5] = var6;
            this.field3454[var5] = arg0.method682(-77);
            this.field3448[var5] = arg0.method636((byte) -50);
        }
        this.field3437 = arg0.method636((byte) -50);
        this.field3435 = arg0.method636((byte) -50);
        this.field3449 = arg0.method631((byte) -124);
        this.field3439 = arg0.method631((byte) -112);
        this.field3455 = new class110();
        this.field3436 = new class36();
        this.field3455.method829(arg0, this.field3436);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[I")
    public final int[] method1167(int arg0, int arg1) {
        class45.method332(field3441, 0, arg0);
        if (arg1 < 10) {
            return field3441;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3445.method281();
        this.field3443.method281();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3450 != null) {
            this.field3450.method281();
            this.field3444.method281();
            var5 = (int) ((double) (this.field3450.field913 - this.field3450.field912) * 32.768D / var3);
            var6 = (int) ((double) this.field3450.field912 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3452 != null) {
            this.field3452.method281();
            this.field3438.method281();
            var8 = (int) ((double) (this.field3452.field913 - this.field3452.field912) * 32.768D / var3);
            var9 = (int) ((double) this.field3452.field912 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3434[var11] != 0) {
                field3458[var11] = 0;
                field3456[var11] = (int) ((double) this.field3448[var11] * var3);
                field3453[var11] = (this.field3434[var11] << 14) / 100;
                field3457[var11] = (int) ((double) (this.field3445.field913 - this.field3445.field912) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3454[var11]) / var3);
                field3451[var11] = (int) ((double) this.field3445.field912 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3445.method280(arg0);
            int var40 = this.field3443.method280(arg0);
            if (this.field3450 != null) {
                int var41 = this.field3450.method280(arg0);
                int var42 = this.field3444.method280(arg0);
                var39 += this.method1165(var7, var42, this.field3450.field911) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3452 != null) {
                int var43 = this.field3452.method280(arg0);
                int var44 = this.field3438.method280(arg0);
                var40 = var40 * ((this.method1165(var10, var44, this.field3452.field911) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3434[var45] != 0) {
                    int var46 = field3456[var45] + var12;
                    if (var46 < arg0) {
                        field3441[var46] += this.method1165(field3458[var45], field3453[var45] * var40 >> 15, this.field3445.field911);
                        field3458[var45] += (field3457[var45] * var39 >> 16) + field3451[var45];
                    }
                }
            }
        }
        if (this.field3447 != null) {
            this.field3447.method281();
            this.field3442.method281();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3447.method280(arg0);
                int var18 = this.field3442.method280(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3447.field913 - this.field3447.field912) * var17 >> 8) + this.field3447.field912;
                } else {
                    var19 = ((this.field3447.field913 - this.field3447.field912) * var18 >> 8) + this.field3447.field912;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3441[var16] = 0;
                }
            }
        }
        if (this.field3437 > 0 && this.field3435 > 0) {
            int var20 = (int) ((double) this.field3437 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3441[var21] += field3441[var21 - var20] * this.field3435 / 100;
            }
        }
        if (this.field3455.field2644[0] > 0 || this.field3455.field2644[1] > 0) {
            this.field3436.method281();
            int var22 = this.field3436.method280(arg0 + 1);
            int var23 = this.field3455.method825(0, (float) var22 / 65536.0F);
            int var24 = this.field3455.method825(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3441[var23 + var25] * (long) class110.field2648 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3441[var23 + var25 - var36 - 1] * (long) class110.field2642[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3441[var25 - var37 - 1] * (long) class110.field2642[1][var37] >> 16);
                    }
                    field3441[var25] = var35;
                    var22 = this.field3436.method280(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3441[var23 + var25] * (long) class110.field2648 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3441[var23 + var25 - var33 - 1] * (long) class110.field2642[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3441[var25 - var34 - 1] * (long) class110.field2642[1][var34] >> 16);
                        }
                        field3441[var25] = var32;
                        var22 = this.field3436.method280(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3441[var23 + var25 - var29 - 1] * (long) class110.field2642[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3441[var25 - var30 - 1] * (long) class110.field2642[1][var30] >> 16);
                            }
                            field3441[var25] = var28;
                            this.field3436.method280(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3455.method825(0, (float) var22 / 65536.0F);
                    var24 = this.field3455.method825(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3441[var38] < -32768) {
                field3441[var38] = -32768;
            }
            if (field3441[var38] > 32767) {
                field3441[var38] = 32767;
            }
        }
        return field3441;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3440[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3446 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3446[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3441 = new int[220500];
        field3451 = new int[5];
        field3456 = new int[5];
        field3453 = new int[5];
        field3457 = new int[5];
        field3458 = new int[5];
    }
}
