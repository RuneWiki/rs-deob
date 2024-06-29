import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 {

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[I")
    private int[] field214 = new int[5];

    @OriginalMember(owner = "client!n", name = "j", descriptor = "[I")
    private int[] field218 = new int[5];

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public int field213 = 0;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "[I")
    private int[] field221 = new int[5];

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    private int field211 = 0;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    private int field222 = 100;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public int field229 = 500;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[I")
    private static int[] field210 = new int[32768];

    @OriginalMember(owner = "client!n", name = "o", descriptor = "[I")
    private static int[] field223;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "[I")
    private static int[] field209;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "[I")
    private static int[] field225;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
    private static int[] field226;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "[I")
    private static int[] field231;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "[I")
    private static int[] field227;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "[I")
    private static int[] field232;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Ldh;")
    private class124 field233;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lll;")
    private class217 field212;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lll;")
    private class217 field215;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lll;")
    private class217 field216;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lll;")
    private class217 field217;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lll;")
    private class217 field219;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lll;")
    private class217 field220;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lll;")
    private class217 field224;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lll;")
    private class217 field228;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Lll;")
    private class217 field230;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)I")
    private final int method125(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field223[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field210[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
    public static void method126() {
        field209 = null;
        field210 = null;
        field223 = null;
        field231 = null;
        field225 = null;
        field227 = null;
        field226 = null;
        field232 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lha;)V")
    public final void method127(class31 arg0) {
        this.field217 = new class217();
        this.field217.method1496(arg0);
        this.field216 = new class217();
        this.field216.method1496(arg0);
        int var2 = arg0.method265(-105);
        if (var2 != 0) {
            arg0.field541--;
            this.field212 = new class217();
            this.field212.method1496(arg0);
            this.field224 = new class217();
            this.field224.method1496(arg0);
        }
        int var3 = arg0.method265(-103);
        if (var3 != 0) {
            arg0.field541--;
            this.field230 = new class217();
            this.field230.method1496(arg0);
            this.field228 = new class217();
            this.field228.method1496(arg0);
        }
        int var4 = arg0.method265(-97);
        if (var4 != 0) {
            arg0.field541--;
            this.field220 = new class217();
            this.field220.method1496(arg0);
            this.field215 = new class217();
            this.field215.method1496(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method276((byte) 95);
            if (var6 == 0) {
                break;
            }
            this.field218[var5] = var6;
            this.field214[var5] = arg0.method285(-2);
            this.field221[var5] = arg0.method276((byte) 63);
        }
        this.field211 = arg0.method276((byte) 91);
        this.field222 = arg0.method276((byte) 82);
        this.field229 = arg0.method260((byte) -67);
        this.field213 = arg0.method260((byte) -67);
        this.field233 = new class124();
        this.field219 = new class217();
        this.field233.method932(arg0, this.field219);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[I")
    public final int[] method128(int arg0, int arg1) {
        class81.method632(field209, 0, arg0);
        if (arg1 < 10) {
            return field209;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field217.method1499();
        this.field216.method1499();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field212 != null) {
            this.field212.method1499();
            this.field224.method1499();
            var5 = (int) ((double) (this.field212.field3321 - this.field212.field3319) * 32.768D / var3);
            var6 = (int) ((double) this.field212.field3319 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field230 != null) {
            this.field230.method1499();
            this.field228.method1499();
            var8 = (int) ((double) (this.field230.field3321 - this.field230.field3319) * 32.768D / var3);
            var9 = (int) ((double) this.field230.field3319 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field218[var11] != 0) {
                field231[var11] = 0;
                field225[var11] = (int) ((double) this.field221[var11] * var3);
                field227[var11] = (this.field218[var11] << 14) / 100;
                field226[var11] = (int) ((double) (this.field217.field3321 - this.field217.field3319) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field214[var11]) / var3);
                field232[var11] = (int) ((double) this.field217.field3319 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field217.method1497(arg0);
            int var40 = this.field216.method1497(arg0);
            if (this.field212 != null) {
                int var41 = this.field212.method1497(arg0);
                int var42 = this.field224.method1497(arg0);
                var39 += this.method125(var7, var42, this.field212.field3320) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field230 != null) {
                int var43 = this.field230.method1497(arg0);
                int var44 = this.field228.method1497(arg0);
                var40 = var40 * ((this.method125(var10, var44, this.field230.field3320) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field218[var45] != 0) {
                    int var46 = field225[var45] + var12;
                    if (var46 < arg0) {
                        field209[var46] += this.method125(field231[var45], field227[var45] * var40 >> 15, this.field217.field3320);
                        field231[var45] += (field226[var45] * var39 >> 16) + field232[var45];
                    }
                }
            }
        }
        if (this.field220 != null) {
            this.field220.method1499();
            this.field215.method1499();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field220.method1497(arg0);
                int var18 = this.field215.method1497(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field220.field3321 - this.field220.field3319) * var17 >> 8) + this.field220.field3319;
                } else {
                    var19 = ((this.field220.field3321 - this.field220.field3319) * var18 >> 8) + this.field220.field3319;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field209[var16] = 0;
                }
            }
        }
        if (this.field211 > 0 && this.field222 > 0) {
            int var20 = (int) ((double) this.field211 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field209[var21] += field209[var21 - var20] * this.field222 / 100;
            }
        }
        if (this.field233.field1868[0] > 0 || this.field233.field1868[1] > 0) {
            this.field219.method1499();
            int var22 = this.field219.method1497(arg0 + 1);
            int var23 = this.field233.method933(0, (float) var22 / 65536.0F);
            int var24 = this.field233.method933(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field209[var23 + var25] * (long) class124.field1869 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field209[var23 + var25 - var36 - 1] * (long) class124.field1873[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field209[var25 - var37 - 1] * (long) class124.field1873[1][var37] >> 16);
                    }
                    field209[var25] = var35;
                    var22 = this.field219.method1497(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field209[var23 + var25] * (long) class124.field1869 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field209[var23 + var25 - var33 - 1] * (long) class124.field1873[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field209[var25 - var34 - 1] * (long) class124.field1873[1][var34] >> 16);
                        }
                        field209[var25] = var32;
                        var22 = this.field219.method1497(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field209[var23 + var25 - var29 - 1] * (long) class124.field1873[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field209[var25 - var30 - 1] * (long) class124.field1873[1][var30] >> 16);
                            }
                            field209[var25] = var28;
                            this.field219.method1497(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field233.method933(0, (float) var22 / 65536.0F);
                    var24 = this.field233.method933(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field209[var38] < -32768) {
                field209[var38] = -32768;
            }
            if (field209[var38] > 32767) {
                field209[var38] = 32767;
            }
        }
        return field209;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field210[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field223 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field223[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field209 = new int[220500];
        field225 = new int[5];
        field226 = new int[5];
        field231 = new int[5];
        field227 = new int[5];
        field232 = new int[5];
    }
}
