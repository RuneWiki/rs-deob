import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class46 {

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    private int field988 = 0;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public int field993 = 0;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "[I")
    private int[] field989 = new int[5];

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
    private int[] field997 = new int[5];

    @OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
    private int[] field1000 = new int[5];

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    private int field1001 = 100;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public int field995 = 500;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
    private static int[] field981 = new int[32768];

    @OriginalMember(owner = "client!f", name = "m", descriptor = "[I")
    private static int[] field992;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[I")
    private static int[] field987;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "[I")
    private static int[] field1002;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "[I")
    private static int[] field998;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "[I")
    private static int[] field1003;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "[I")
    private static int[] field999;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "[I")
    private static int[] field1004;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lce;")
    private class24 field986;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Ljg;")
    private class87 field980;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Ljg;")
    private class87 field982;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Ljg;")
    private class87 field983;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Ljg;")
    private class87 field984;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Ljg;")
    private class87 field985;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Ljg;")
    private class87 field990;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Ljg;")
    private class87 field991;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "Ljg;")
    private class87 field994;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Ljg;")
    private class87 field996;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lva;)V")
    public final void method360(class189 arg0) {
        this.field984 = new class87();
        this.field984.method581(arg0);
        this.field980 = new class87();
        this.field980.method581(arg0);
        int var2 = arg0.method1202(122);
        if (var2 != 0) {
            arg0.field3752--;
            this.field990 = new class87();
            this.field990.method581(arg0);
            this.field991 = new class87();
            this.field991.method581(arg0);
        }
        int var3 = arg0.method1202(121);
        if (var3 != 0) {
            arg0.field3752--;
            this.field985 = new class87();
            this.field985.method581(arg0);
            this.field996 = new class87();
            this.field996.method581(arg0);
        }
        int var4 = arg0.method1202(111);
        if (var4 != 0) {
            arg0.field3752--;
            this.field983 = new class87();
            this.field983.method581(arg0);
            this.field994 = new class87();
            this.field994.method581(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1210(false);
            if (var6 == 0) {
                break;
            }
            this.field1000[var5] = var6;
            this.field989[var5] = arg0.method1205(7470);
            this.field997[var5] = arg0.method1210(false);
        }
        this.field988 = arg0.method1210(false);
        this.field1001 = arg0.method1210(false);
        this.field995 = arg0.method1197(-1);
        this.field993 = arg0.method1197(-1);
        this.field986 = new class24();
        this.field982 = new class87();
        this.field986.method175(arg0, this.field982);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)I")
    private final int method361(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field992[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field981[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
    public static void method362() {
        field987 = null;
        field981 = null;
        field992 = null;
        field1004 = null;
        field999 = null;
        field998 = null;
        field1003 = null;
        field1002 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
    public final int[] method363(int arg0, int arg1) {
        class93.method609(field987, 0, arg0);
        if (arg1 < 10) {
            return field987;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field984.method579();
        this.field980.method579();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field990 != null) {
            this.field990.method579();
            this.field991.method579();
            var5 = (int) ((double) (this.field990.field1858 - this.field990.field1856) * 32.768D / var3);
            var6 = (int) ((double) this.field990.field1856 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field985 != null) {
            this.field985.method579();
            this.field996.method579();
            var8 = (int) ((double) (this.field985.field1858 - this.field985.field1856) * 32.768D / var3);
            var9 = (int) ((double) this.field985.field1856 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1000[var11] != 0) {
                field1004[var11] = 0;
                field999[var11] = (int) ((double) this.field997[var11] * var3);
                field998[var11] = (this.field1000[var11] << 14) / 100;
                field1003[var11] = (int) ((double) (this.field984.field1858 - this.field984.field1856) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field989[var11]) / var3);
                field1002[var11] = (int) ((double) this.field984.field1856 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field984.method578(arg0);
            int var40 = this.field980.method578(arg0);
            if (this.field990 != null) {
                int var41 = this.field990.method578(arg0);
                int var42 = this.field991.method578(arg0);
                var39 += this.method361(var7, var42, this.field990.field1855) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field985 != null) {
                int var43 = this.field985.method578(arg0);
                int var44 = this.field996.method578(arg0);
                var40 = var40 * ((this.method361(var10, var44, this.field985.field1855) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1000[var45] != 0) {
                    int var46 = field999[var45] + var12;
                    if (var46 < arg0) {
                        field987[var46] += this.method361(field1004[var45], field998[var45] * var40 >> 15, this.field984.field1855);
                        field1004[var45] += (field1003[var45] * var39 >> 16) + field1002[var45];
                    }
                }
            }
        }
        if (this.field983 != null) {
            this.field983.method579();
            this.field994.method579();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field983.method578(arg0);
                int var18 = this.field994.method578(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field983.field1858 - this.field983.field1856) * var17 >> 8) + this.field983.field1856;
                } else {
                    var19 = ((this.field983.field1858 - this.field983.field1856) * var18 >> 8) + this.field983.field1856;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field987[var16] = 0;
                }
            }
        }
        if (this.field988 > 0 && this.field1001 > 0) {
            int var20 = (int) ((double) this.field988 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field987[var21] += field987[var21 - var20] * this.field1001 / 100;
            }
        }
        if (this.field986.field524[0] > 0 || this.field986.field524[1] > 0) {
            this.field982.method579();
            int var22 = this.field982.method578(arg0 + 1);
            int var23 = this.field986.method179(0, (float) var22 / 65536.0F);
            int var24 = this.field986.method179(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field987[var23 + var25] * (long) class24.field529 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field987[var23 + var25 - var36 - 1] * (long) class24.field527[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field987[var25 - var37 - 1] * (long) class24.field527[1][var37] >> 16);
                    }
                    field987[var25] = var35;
                    var22 = this.field982.method578(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field987[var23 + var25] * (long) class24.field529 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field987[var23 + var25 - var33 - 1] * (long) class24.field527[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field987[var25 - var34 - 1] * (long) class24.field527[1][var34] >> 16);
                        }
                        field987[var25] = var32;
                        var22 = this.field982.method578(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field987[var23 + var25 - var29 - 1] * (long) class24.field527[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field987[var25 - var30 - 1] * (long) class24.field527[1][var30] >> 16);
                            }
                            field987[var25] = var28;
                            this.field982.method578(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field986.method179(0, (float) var22 / 65536.0F);
                    var24 = this.field986.method179(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field987[var38] < -32768) {
                field987[var38] = -32768;
            }
            if (field987[var38] > 32767) {
                field987[var38] = 32767;
            }
        }
        return field987;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field981[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field992 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field992[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field987 = new int[220500];
        field1002 = new int[5];
        field998 = new int[5];
        field1003 = new int[5];
        field999 = new int[5];
        field1004 = new int[5];
    }
}
