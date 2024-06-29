import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    private int field85 = 100;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "[I")
    private int[] field84 = new int[5];

    @OriginalMember(owner = "client!il", name = "d", descriptor = "[I")
    private int[] field87 = new int[5];

    @OriginalMember(owner = "client!il", name = "n", descriptor = "[I")
    private int[] field97 = new int[5];

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    private int field100 = 0;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public int field99 = 500;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public int field102 = 0;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "[I")
    private static int[] field93 = new int[32768];

    @OriginalMember(owner = "client!il", name = "r", descriptor = "[I")
    private static int[] field101;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "[I")
    private static int[] field86;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "[I")
    private static int[] field104;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "[I")
    private static int[] field107;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "[I")
    private static int[] field105;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "[I")
    private static int[] field106;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "[I")
    private static int[] field108;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "Ljr;")
    private class72 field103;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Ljr;")
    private class72 field89;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "Ljr;")
    private class72 field90;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Ljr;")
    private class72 field91;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Ljr;")
    private class72 field92;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "Ljr;")
    private class72 field94;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Ljr;")
    private class72 field95;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Ljr;")
    private class72 field96;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "Ljr;")
    private class72 field98;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Lmr;")
    private class95 field88;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ldh;)V")
    public final void method41(class209 arg0) {
        this.field92 = new class72();
        this.field92.method417(arg0);
        this.field91 = new class72();
        this.field91.method417(arg0);
        int var2 = arg0.method1428(32122);
        if (var2 != 0) {
            arg0.field3037--;
            this.field98 = new class72();
            this.field98.method417(arg0);
            this.field103 = new class72();
            this.field103.method417(arg0);
        }
        int var3 = arg0.method1428(32122);
        if (var3 != 0) {
            arg0.field3037--;
            this.field90 = new class72();
            this.field90.method417(arg0);
            this.field95 = new class72();
            this.field95.method417(arg0);
        }
        int var4 = arg0.method1428(32122);
        if (var4 != 0) {
            arg0.field3037--;
            this.field96 = new class72();
            this.field96.method417(arg0);
            this.field94 = new class72();
            this.field94.method417(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1434(16887);
            if (var6 == 0) {
                break;
            }
            this.field87[var5] = var6;
            this.field84[var5] = arg0.method1414((byte) 106);
            this.field97[var5] = arg0.method1434(16887);
        }
        this.field100 = arg0.method1434(16887);
        this.field85 = arg0.method1434(16887);
        this.field99 = arg0.method1450((byte) 83);
        this.field102 = arg0.method1450((byte) 36);
        this.field88 = new class95();
        this.field89 = new class72();
        this.field88.method550(arg0, this.field89);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)I")
    private final int method42(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field101[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field93[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()V")
    public static void method43() {
        field86 = null;
        field93 = null;
        field101 = null;
        field107 = null;
        field105 = null;
        field106 = null;
        field104 = null;
        field108 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        class520.method3072(field86, 0, arg0);
        if (arg1 < 10) {
            return field86;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field92.method414();
        this.field91.method414();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field98 != null) {
            this.field98.method414();
            this.field103.method414();
            var5 = (int) ((double) (this.field98.field1072 - this.field98.field1068) * 32.768D / var3);
            var6 = (int) ((double) this.field98.field1068 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field90 != null) {
            this.field90.method414();
            this.field95.method414();
            var8 = (int) ((double) (this.field90.field1072 - this.field90.field1068) * 32.768D / var3);
            var9 = (int) ((double) this.field90.field1068 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field87[var11] != 0) {
                field107[var11] = 0;
                field105[var11] = (int) ((double) this.field97[var11] * var3);
                field106[var11] = (this.field87[var11] << 14) / 100;
                field104[var11] = (int) ((double) (this.field92.field1072 - this.field92.field1068) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field84[var11]) / var3);
                field108[var11] = (int) ((double) this.field92.field1068 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field92.method416(arg0);
            int var40 = this.field91.method416(arg0);
            if (this.field98 != null) {
                int var41 = this.field98.method416(arg0);
                int var42 = this.field103.method416(arg0);
                var39 += this.method42(var7, var42, this.field98.field1070) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field90 != null) {
                int var43 = this.field90.method416(arg0);
                int var44 = this.field95.method416(arg0);
                var40 = var40 * ((this.method42(var10, var44, this.field90.field1070) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field87[var45] != 0) {
                    int var46 = field105[var45] + var12;
                    if (var46 < arg0) {
                        field86[var46] += this.method42(field107[var45], field106[var45] * var40 >> 15, this.field92.field1070);
                        field107[var45] += (field104[var45] * var39 >> 16) + field108[var45];
                    }
                }
            }
        }
        if (this.field96 != null) {
            this.field96.method414();
            this.field94.method414();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field96.method416(arg0);
                int var18 = this.field94.method416(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field96.field1072 - this.field96.field1068) * var17 >> 8) + this.field96.field1068;
                } else {
                    var19 = ((this.field96.field1072 - this.field96.field1068) * var18 >> 8) + this.field96.field1068;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field86[var16] = 0;
                }
            }
        }
        if (this.field100 > 0 && this.field85 > 0) {
            int var20 = (int) ((double) this.field100 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field86[var21] += field86[var21 - var20] * this.field85 / 100;
            }
        }
        if (this.field88.field1404[0] > 0 || this.field88.field1404[1] > 0) {
            this.field89.method414();
            int var22 = this.field89.method416(arg0 + 1);
            int var23 = this.field88.method548(0, (float) var22 / 65536.0F);
            int var24 = this.field88.method548(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field86[var23 + var25] * (long) class95.field1405 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field86[var23 + var25 - var36 - 1] * (long) class95.field1401[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field86[var25 - var37 - 1] * (long) class95.field1401[1][var37] >> 16);
                    }
                    field86[var25] = var35;
                    var22 = this.field89.method416(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field86[var23 + var25] * (long) class95.field1405 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field86[var23 + var25 - var33 - 1] * (long) class95.field1401[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field86[var25 - var34 - 1] * (long) class95.field1401[1][var34] >> 16);
                        }
                        field86[var25] = var32;
                        var22 = this.field89.method416(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field86[var23 + var25 - var29 - 1] * (long) class95.field1401[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field86[var25 - var30 - 1] * (long) class95.field1401[1][var30] >> 16);
                            }
                            field86[var25] = var28;
                            this.field89.method416(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field88.method548(0, (float) var22 / 65536.0F);
                    var24 = this.field88.method548(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field86[var38] < -32768) {
                field86[var38] = -32768;
            }
            if (field86[var38] > 32767) {
                field86[var38] = 32767;
            }
        }
        return field86;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field93[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field101 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field101[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field86 = new int[220500];
        field104 = new int[5];
        field107 = new int[5];
        field105 = new int[5];
        field106 = new int[5];
        field108 = new int[5];
    }
}
