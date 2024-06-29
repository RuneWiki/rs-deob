import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 {

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "[I")
    private int[] field218 = new int[5];

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public int field221 = 0;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "[I")
    private int[] field226 = new int[5];

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    private int field222 = 0;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public int field229 = 500;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    private int field235 = 100;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "[I")
    private int[] field232 = new int[5];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "[I")
    private static int[] field215 = new int[32768];

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "[I")
    private static int[] field227;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "[I")
    private static int[] field233;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "[I")
    private static int[] field236;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "[I")
    private static int[] field234;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "[I")
    private static int[] field238;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "[I")
    private static int[] field239;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "[I")
    private static int[] field237;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Ljh;")
    private class273 field217;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lhj;")
    private class69 field216;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Lhj;")
    private class69 field219;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lhj;")
    private class69 field220;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Lhj;")
    private class69 field223;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lhj;")
    private class69 field224;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lhj;")
    private class69 field225;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lhj;")
    private class69 field228;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Lhj;")
    private class69 field230;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Lhj;")
    private class69 field231;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I")
    public final int[] method80(int arg0, int arg1) {
        class149.method976(field233, 0, arg0);
        if (arg1 < 10) {
            return field233;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field216.method443();
        this.field219.method443();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field220 != null) {
            this.field220.method443();
            this.field225.method443();
            var5 = (int) ((double) (this.field220.field1390 - this.field220.field1387) * 32.768D / var3);
            var6 = (int) ((double) this.field220.field1387 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field231 != null) {
            this.field231.method443();
            this.field228.method443();
            var8 = (int) ((double) (this.field231.field1390 - this.field231.field1387) * 32.768D / var3);
            var9 = (int) ((double) this.field231.field1387 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field232[var11] != 0) {
                field239[var11] = 0;
                field236[var11] = (int) ((double) this.field226[var11] * var3);
                field234[var11] = (this.field232[var11] << 14) / 100;
                field238[var11] = (int) ((double) (this.field216.field1390 - this.field216.field1387) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field218[var11]) / var3);
                field237[var11] = (int) ((double) this.field216.field1387 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field216.method442(arg0);
            int var40 = this.field219.method442(arg0);
            if (this.field220 != null) {
                int var41 = this.field220.method442(arg0);
                int var42 = this.field225.method442(arg0);
                var39 += this.method82(var7, var42, this.field220.field1392) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field231 != null) {
                int var43 = this.field231.method442(arg0);
                int var44 = this.field228.method442(arg0);
                var40 = var40 * ((this.method82(var10, var44, this.field231.field1392) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field232[var45] != 0) {
                    int var46 = field236[var45] + var12;
                    if (var46 < arg0) {
                        field233[var46] += this.method82(field239[var45], field234[var45] * var40 >> 15, this.field216.field1392);
                        field239[var45] += (field238[var45] * var39 >> 16) + field237[var45];
                    }
                }
            }
        }
        if (this.field224 != null) {
            this.field224.method443();
            this.field223.method443();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field224.method442(arg0);
                int var18 = this.field223.method442(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field224.field1390 - this.field224.field1387) * var17 >> 8) + this.field224.field1387;
                } else {
                    var19 = ((this.field224.field1390 - this.field224.field1387) * var18 >> 8) + this.field224.field1387;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field233[var16] = 0;
                }
            }
        }
        if (this.field222 > 0 && this.field235 > 0) {
            int var20 = (int) ((double) this.field222 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field233[var21] += field233[var21 - var20] * this.field235 / 100;
            }
        }
        if (this.field217.field4808[0] > 0 || this.field217.field4808[1] > 0) {
            this.field230.method443();
            int var22 = this.field230.method442(arg0 + 1);
            int var23 = this.field217.method1859(0, (float) var22 / 65536.0F);
            int var24 = this.field217.method1859(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field233[var23 + var25] * (long) class273.field4806 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field233[var23 + var25 - var36 - 1] * (long) class273.field4807[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field233[var25 - var37 - 1] * (long) class273.field4807[1][var37] >> 16);
                    }
                    field233[var25] = var35;
                    var22 = this.field230.method442(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field233[var23 + var25] * (long) class273.field4806 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field233[var23 + var25 - var33 - 1] * (long) class273.field4807[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field233[var25 - var34 - 1] * (long) class273.field4807[1][var34] >> 16);
                        }
                        field233[var25] = var32;
                        var22 = this.field230.method442(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field233[var23 + var25 - var29 - 1] * (long) class273.field4807[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field233[var25 - var30 - 1] * (long) class273.field4807[1][var30] >> 16);
                            }
                            field233[var25] = var28;
                            this.field230.method442(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field217.method1859(0, (float) var22 / 65536.0F);
                    var24 = this.field217.method1859(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field233[var38] < -32768) {
                field233[var38] = -32768;
            }
            if (field233[var38] > 32767) {
                field233[var38] = 32767;
            }
        }
        return field233;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
    public static void method81() {
        field233 = null;
        field215 = null;
        field227 = null;
        field239 = null;
        field236 = null;
        field234 = null;
        field238 = null;
        field237 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)I")
    private final int method82(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field227[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field215[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lsi;)V")
    public final void method83(class194 arg0) {
        this.field216 = new class69();
        this.field216.method444(arg0);
        this.field219 = new class69();
        this.field219.method444(arg0);
        int var2 = arg0.method1301(-8317);
        if (var2 != 0) {
            arg0.field3497--;
            this.field220 = new class69();
            this.field220.method444(arg0);
            this.field225 = new class69();
            this.field225.method444(arg0);
        }
        int var3 = arg0.method1301(-8317);
        if (var3 != 0) {
            arg0.field3497--;
            this.field231 = new class69();
            this.field231.method444(arg0);
            this.field228 = new class69();
            this.field228.method444(arg0);
        }
        int var4 = arg0.method1301(-8317);
        if (var4 != 0) {
            arg0.field3497--;
            this.field224 = new class69();
            this.field224.method444(arg0);
            this.field223 = new class69();
            this.field223.method444(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1311(-126);
            if (var6 == 0) {
                break;
            }
            this.field232[var5] = var6;
            this.field218[var5] = arg0.method1307(5);
            this.field226[var5] = arg0.method1311(32);
        }
        this.field222 = arg0.method1311(121);
        this.field235 = arg0.method1311(102);
        this.field229 = arg0.method1294((byte) 3);
        this.field221 = arg0.method1294((byte) 3);
        this.field217 = new class273();
        this.field230 = new class69();
        this.field217.method1858(arg0, this.field230);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field215[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field227 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field227[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field233 = new int[220500];
        field236 = new int[5];
        field234 = new int[5];
        field238 = new int[5];
        field239 = new int[5];
        field237 = new int[5];
    }
}
