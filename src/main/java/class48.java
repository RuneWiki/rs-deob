import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class48 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public int field641 = 500;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[I")
    private int[] field647 = new int[5];

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public int field649 = 0;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "[I")
    private int[] field653 = new int[5];

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    private int field654 = 100;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "[I")
    private int[] field642 = new int[5];

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    private int field658 = 0;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "[I")
    private static int[] field650 = new int[32768];

    @OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
    private static int[] field646;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "[I")
    private static int[] field656;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "[I")
    private static int[] field661;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "[I")
    private static int[] field660;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "[I")
    private static int[] field659;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "[I")
    private static int[] field662;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "[I")
    private static int[] field663;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Lra;")
    private class113 field652;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lff;")
    private class224 field639;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Lff;")
    private class224 field640;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lff;")
    private class224 field643;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lff;")
    private class224 field644;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Lff;")
    private class224 field645;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Lff;")
    private class224 field648;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Lff;")
    private class224 field651;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "Lff;")
    private class224 field655;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "Lff;")
    private class224 field657;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()V")
    public static void method325() {
        field656 = null;
        field650 = null;
        field646 = null;
        field662 = null;
        field661 = null;
        field663 = null;
        field660 = null;
        field659 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)I")
    private final int method326(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field646[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field650[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lnh;)V")
    public final void method327(class112 arg0) {
        this.field639 = new class224();
        this.field639.method1464(arg0);
        this.field640 = new class224();
        this.field640.method1464(arg0);
        int var2 = arg0.method758(true);
        if (var2 != 0) {
            arg0.field1821--;
            this.field651 = new class224();
            this.field651.method1464(arg0);
            this.field644 = new class224();
            this.field644.method1464(arg0);
        }
        int var3 = arg0.method758(true);
        if (var3 != 0) {
            arg0.field1821--;
            this.field643 = new class224();
            this.field643.method1464(arg0);
            this.field657 = new class224();
            this.field657.method1464(arg0);
        }
        int var4 = arg0.method758(true);
        if (var4 != 0) {
            arg0.field1821--;
            this.field648 = new class224();
            this.field648.method1464(arg0);
            this.field645 = new class224();
            this.field645.method1464(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method747((byte) -125);
            if (var6 == 0) {
                break;
            }
            this.field647[var5] = var6;
            this.field653[var5] = arg0.method771(128);
            this.field642[var5] = arg0.method747((byte) -125);
        }
        this.field658 = arg0.method747((byte) -125);
        this.field654 = arg0.method747((byte) -125);
        this.field641 = arg0.method731(false);
        this.field649 = arg0.method731(false);
        this.field652 = new class113();
        this.field655 = new class224();
        this.field652.method779(arg0, this.field655);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
    public final int[] method328(int arg0, int arg1) {
        class22.method113(field656, 0, arg0);
        if (arg1 < 10) {
            return field656;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field639.method1465();
        this.field640.method1465();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field651 != null) {
            this.field651.method1465();
            this.field644.method1465();
            var5 = (int) ((double) (this.field651.field3838 - this.field651.field3839) * 32.768D / var3);
            var6 = (int) ((double) this.field651.field3839 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field643 != null) {
            this.field643.method1465();
            this.field657.method1465();
            var8 = (int) ((double) (this.field643.field3838 - this.field643.field3839) * 32.768D / var3);
            var9 = (int) ((double) this.field643.field3839 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field647[var11] != 0) {
                field662[var11] = 0;
                field661[var11] = (int) ((double) this.field642[var11] * var3);
                field663[var11] = (this.field647[var11] << 14) / 100;
                field660[var11] = (int) ((double) (this.field639.field3838 - this.field639.field3839) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field653[var11]) / var3);
                field659[var11] = (int) ((double) this.field639.field3839 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field639.method1462(arg0);
            int var40 = this.field640.method1462(arg0);
            if (this.field651 != null) {
                int var41 = this.field651.method1462(arg0);
                int var42 = this.field644.method1462(arg0);
                var39 += this.method326(var7, var42, this.field651.field3843) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field643 != null) {
                int var43 = this.field643.method1462(arg0);
                int var44 = this.field657.method1462(arg0);
                var40 = var40 * ((this.method326(var10, var44, this.field643.field3843) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field647[var45] != 0) {
                    int var46 = field661[var45] + var12;
                    if (var46 < arg0) {
                        field656[var46] += this.method326(field662[var45], field663[var45] * var40 >> 15, this.field639.field3843);
                        field662[var45] += (field660[var45] * var39 >> 16) + field659[var45];
                    }
                }
            }
        }
        if (this.field648 != null) {
            this.field648.method1465();
            this.field645.method1465();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field648.method1462(arg0);
                int var18 = this.field645.method1462(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field648.field3838 - this.field648.field3839) * var17 >> 8) + this.field648.field3839;
                } else {
                    var19 = ((this.field648.field3838 - this.field648.field3839) * var18 >> 8) + this.field648.field3839;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field656[var16] = 0;
                }
            }
        }
        if (this.field658 > 0 && this.field654 > 0) {
            int var20 = (int) ((double) this.field658 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field656[var21] += field656[var21 - var20] * this.field654 / 100;
            }
        }
        if (this.field652.field1847[0] > 0 || this.field652.field1847[1] > 0) {
            this.field655.method1465();
            int var22 = this.field655.method1462(arg0 + 1);
            int var23 = this.field652.method782(0, (float) var22 / 65536.0F);
            int var24 = this.field652.method782(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field656[var23 + var25] * (long) class113.field1849 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field656[var23 + var25 - var36 - 1] * (long) class113.field1850[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field656[var25 - var37 - 1] * (long) class113.field1850[1][var37] >> 16);
                    }
                    field656[var25] = var35;
                    var22 = this.field655.method1462(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field656[var23 + var25] * (long) class113.field1849 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field656[var23 + var25 - var33 - 1] * (long) class113.field1850[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field656[var25 - var34 - 1] * (long) class113.field1850[1][var34] >> 16);
                        }
                        field656[var25] = var32;
                        var22 = this.field655.method1462(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field656[var23 + var25 - var29 - 1] * (long) class113.field1850[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field656[var25 - var30 - 1] * (long) class113.field1850[1][var30] >> 16);
                            }
                            field656[var25] = var28;
                            this.field655.method1462(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field652.method782(0, (float) var22 / 65536.0F);
                    var24 = this.field652.method782(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field656[var38] < -32768) {
                field656[var38] = -32768;
            }
            if (field656[var38] > 32767) {
                field656[var38] = 32767;
            }
        }
        return field656;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field650[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field646 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field646[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field656 = new int[220500];
        field661 = new int[5];
        field660 = new int[5];
        field659 = new int[5];
        field662 = new int[5];
        field663 = new int[5];
    }
}
