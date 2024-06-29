import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class62 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    private int field1004 = 0;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
    private int[] field1008 = new int[5];

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
    private int[] field1011 = new int[5];

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public int field1012 = 500;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public int field1010 = 0;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "[I")
    private int[] field1017 = new int[5];

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    private int field1014 = 100;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "[I")
    private static int[] field1016 = new int[32768];

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "[I")
    private static int[] field1015;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
    private static int[] field1006;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "[I")
    private static int[] field1023;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "[I")
    private static int[] field1020;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "[I")
    private static int[] field1024;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "[I")
    private static int[] field1021;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "[I")
    private static int[] field1022;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Lqk;")
    private class208 field1013;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lue;")
    private class88 field1005;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lue;")
    private class88 field1007;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Lue;")
    private class88 field1009;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "Lue;")
    private class88 field1018;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "Lue;")
    private class88 field1019;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "Lue;")
    private class88 field1025;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "Lue;")
    private class88 field1026;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Lue;")
    private class88 field1027;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "Lue;")
    private class88 field1028;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)[I")
    public final int[] method441(int arg0, int arg1) {
        class140.method968(field1006, 0, arg0);
        if (arg1 < 10) {
            return field1006;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1027.method635();
        this.field1018.method635();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1025 != null) {
            this.field1025.method635();
            this.field1007.method635();
            var5 = (int) ((double) (this.field1025.field1397 - this.field1025.field1400) * 32.768D / var3);
            var6 = (int) ((double) this.field1025.field1400 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1009 != null) {
            this.field1009.method635();
            this.field1026.method635();
            var8 = (int) ((double) (this.field1009.field1397 - this.field1009.field1400) * 32.768D / var3);
            var9 = (int) ((double) this.field1009.field1400 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1011[var11] != 0) {
                field1022[var11] = 0;
                field1023[var11] = (int) ((double) this.field1008[var11] * var3);
                field1024[var11] = (this.field1011[var11] << 14) / 100;
                field1020[var11] = (int) ((double) (this.field1027.field1397 - this.field1027.field1400) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1017[var11]) / var3);
                field1021[var11] = (int) ((double) this.field1027.field1400 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1027.method638(arg0);
            int var40 = this.field1018.method638(arg0);
            if (this.field1025 != null) {
                int var41 = this.field1025.method638(arg0);
                int var42 = this.field1007.method638(arg0);
                var39 += this.method443(var7, var42, this.field1025.field1398) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1009 != null) {
                int var43 = this.field1009.method638(arg0);
                int var44 = this.field1026.method638(arg0);
                var40 = var40 * ((this.method443(var10, var44, this.field1009.field1398) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1011[var45] != 0) {
                    int var46 = field1023[var45] + var12;
                    if (var46 < arg0) {
                        field1006[var46] += this.method443(field1022[var45], field1024[var45] * var40 >> 15, this.field1027.field1398);
                        field1022[var45] += (field1020[var45] * var39 >> 16) + field1021[var45];
                    }
                }
            }
        }
        if (this.field1005 != null) {
            this.field1005.method635();
            this.field1028.method635();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1005.method638(arg0);
                int var18 = this.field1028.method638(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1005.field1397 - this.field1005.field1400) * var17 >> 8) + this.field1005.field1400;
                } else {
                    var19 = ((this.field1005.field1397 - this.field1005.field1400) * var18 >> 8) + this.field1005.field1400;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1006[var16] = 0;
                }
            }
        }
        if (this.field1004 > 0 && this.field1014 > 0) {
            int var20 = (int) ((double) this.field1004 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1006[var21] += field1006[var21 - var20] * this.field1014 / 100;
            }
        }
        if (this.field1013.field3415[0] > 0 || this.field1013.field3415[1] > 0) {
            this.field1019.method635();
            int var22 = this.field1019.method638(arg0 + 1);
            int var23 = this.field1013.method1444(0, (float) var22 / 65536.0F);
            int var24 = this.field1013.method1444(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1006[var23 + var25] * (long) class208.field3417 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1006[var23 + var25 - var36 - 1] * (long) class208.field3414[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1006[var25 - var37 - 1] * (long) class208.field3414[1][var37] >> 16);
                    }
                    field1006[var25] = var35;
                    var22 = this.field1019.method638(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1006[var23 + var25] * (long) class208.field3417 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1006[var23 + var25 - var33 - 1] * (long) class208.field3414[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1006[var25 - var34 - 1] * (long) class208.field3414[1][var34] >> 16);
                        }
                        field1006[var25] = var32;
                        var22 = this.field1019.method638(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1006[var23 + var25 - var29 - 1] * (long) class208.field3414[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1006[var25 - var30 - 1] * (long) class208.field3414[1][var30] >> 16);
                            }
                            field1006[var25] = var28;
                            this.field1019.method638(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1013.method1444(0, (float) var22 / 65536.0F);
                    var24 = this.field1013.method1444(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1006[var38] < -32768) {
                field1006[var38] = -32768;
            }
            if (field1006[var38] > 32767) {
                field1006[var38] = 32767;
            }
        }
        return field1006;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Log;)V")
    public final void method442(class221 arg0) {
        this.field1027 = new class88();
        this.field1027.method637(arg0);
        this.field1018 = new class88();
        this.field1018.method637(arg0);
        int var2 = arg0.method1517((byte) -96);
        if (var2 != 0) {
            arg0.field3655--;
            this.field1025 = new class88();
            this.field1025.method637(arg0);
            this.field1007 = new class88();
            this.field1007.method637(arg0);
        }
        int var3 = arg0.method1517((byte) -96);
        if (var3 != 0) {
            arg0.field3655--;
            this.field1009 = new class88();
            this.field1009.method637(arg0);
            this.field1026 = new class88();
            this.field1026.method637(arg0);
        }
        int var4 = arg0.method1517((byte) -96);
        if (var4 != 0) {
            arg0.field3655--;
            this.field1005 = new class88();
            this.field1005.method637(arg0);
            this.field1028 = new class88();
            this.field1028.method637(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1528(19380);
            if (var6 == 0) {
                break;
            }
            this.field1011[var5] = var6;
            this.field1017[var5] = arg0.method1541(false);
            this.field1008[var5] = arg0.method1528(19380);
        }
        this.field1004 = arg0.method1528(19380);
        this.field1014 = arg0.method1528(19380);
        this.field1012 = arg0.method1521((byte) 113);
        this.field1010 = arg0.method1521((byte) 113);
        this.field1013 = new class208();
        this.field1019 = new class88();
        this.field1013.method1441(arg0, this.field1019);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)I")
    private final int method443(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1015[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1016[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
    public static void method444() {
        field1006 = null;
        field1016 = null;
        field1015 = null;
        field1022 = null;
        field1023 = null;
        field1024 = null;
        field1020 = null;
        field1021 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1016[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1015 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1015[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1006 = new int[220500];
        field1023 = new int[5];
        field1020 = new int[5];
        field1024 = new int[5];
        field1021 = new int[5];
        field1022 = new int[5];
    }
}
