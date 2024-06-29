import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class474 {

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "[I")
    private int[] field6772 = new int[5];

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "[I")
    private int[] field6776 = new int[5];

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    private int field6774 = 100;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "[I")
    private int[] field6783 = new int[5];

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
    public int field6787 = 0;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
    public int field6786 = 500;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
    private int field6784 = 0;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "[I")
    private static int[] field6791 = new int[32768];

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "[I")
    private static int[] field6790;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "[I")
    private static int[] field6780;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "[I")
    private static int[] field6793;

    @OriginalMember(owner = "client!dp", name = "y", descriptor = "[I")
    private static int[] field6796;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "[I")
    private static int[] field6794;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "[I")
    private static int[] field6792;

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "[I")
    private static int[] field6795;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "Luia;")
    private class564 field6788;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Lud;")
    private class94 field6773;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "Lud;")
    private class94 field6775;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Lud;")
    private class94 field6777;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "Lud;")
    private class94 field6778;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "Lud;")
    private class94 field6779;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "Lud;")
    private class94 field6781;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "Lud;")
    private class94 field6782;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "Lud;")
    private class94 field6785;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "Lud;")
    private class94 field6789;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ltn;)V")
    public final void method2780(class179 arg0) {
        this.field6777 = new class94();
        this.field6777.method646(arg0);
        this.field6782 = new class94();
        this.field6782.method646(arg0);
        int var2 = arg0.method1094(255);
        if (var2 != 0) {
            arg0.field2354--;
            this.field6778 = new class94();
            this.field6778.method646(arg0);
            this.field6775 = new class94();
            this.field6775.method646(arg0);
        }
        int var3 = arg0.method1094(255);
        if (var3 != 0) {
            arg0.field2354--;
            this.field6773 = new class94();
            this.field6773.method646(arg0);
            this.field6785 = new class94();
            this.field6785.method646(arg0);
        }
        int var4 = arg0.method1094(255);
        if (var4 != 0) {
            arg0.field2354--;
            this.field6789 = new class94();
            this.field6789.method646(arg0);
            this.field6781 = new class94();
            this.field6781.method646(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1158(-32768);
            if (var6 == 0) {
                break;
            }
            this.field6776[var5] = var6;
            this.field6783[var5] = arg0.method1128(-1);
            this.field6772[var5] = arg0.method1158(-32768);
        }
        this.field6784 = arg0.method1158(-32768);
        this.field6774 = arg0.method1158(-32768);
        this.field6786 = arg0.method1107(false);
        this.field6787 = arg0.method1107(false);
        this.field6788 = new class564();
        this.field6779 = new class94();
        this.field6788.method3188(arg0, this.field6779);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)I")
    private final int method2781(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field6790[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field6791[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "()V")
    public static void method2782() {
        field6780 = null;
        field6791 = null;
        field6790 = null;
        field6792 = null;
        field6794 = null;
        field6795 = null;
        field6796 = null;
        field6793 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)[I")
    public final int[] method2783(int arg0, int arg1) {
        class617.method3386(field6780, 0, arg0);
        if (arg1 < 10) {
            return field6780;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field6777.method644();
        this.field6782.method644();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field6778 != null) {
            this.field6778.method644();
            this.field6775.method644();
            var5 = (int) ((double) (this.field6778.field1194 - this.field6778.field1191) * 32.768D / var3);
            var6 = (int) ((double) this.field6778.field1191 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field6773 != null) {
            this.field6773.method644();
            this.field6785.method644();
            var8 = (int) ((double) (this.field6773.field1194 - this.field6773.field1191) * 32.768D / var3);
            var9 = (int) ((double) this.field6773.field1191 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field6776[var11] != 0) {
                field6792[var11] = 0;
                field6794[var11] = (int) ((double) this.field6772[var11] * var3);
                field6795[var11] = (this.field6776[var11] << 14) / 100;
                field6796[var11] = (int) ((double) (this.field6777.field1194 - this.field6777.field1191) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field6783[var11]) / var3);
                field6793[var11] = (int) ((double) this.field6777.field1191 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field6777.method647(arg0);
            int var40 = this.field6782.method647(arg0);
            if (this.field6778 != null) {
                int var41 = this.field6778.method647(arg0);
                int var42 = this.field6775.method647(arg0);
                var39 += this.method2781(var7, var42, this.field6778.field1195) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field6773 != null) {
                int var43 = this.field6773.method647(arg0);
                int var44 = this.field6785.method647(arg0);
                var40 = var40 * ((this.method2781(var10, var44, this.field6773.field1195) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field6776[var45] != 0) {
                    int var46 = field6794[var45] + var12;
                    if (var46 < arg0) {
                        field6780[var46] += this.method2781(field6792[var45], field6795[var45] * var40 >> 15, this.field6777.field1195);
                        field6792[var45] += (field6796[var45] * var39 >> 16) + field6793[var45];
                    }
                }
            }
        }
        if (this.field6789 != null) {
            this.field6789.method644();
            this.field6781.method644();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field6789.method647(arg0);
                int var18 = this.field6781.method647(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field6789.field1194 - this.field6789.field1191) * var17 >> 8) + this.field6789.field1191;
                } else {
                    var19 = ((this.field6789.field1194 - this.field6789.field1191) * var18 >> 8) + this.field6789.field1191;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field6780[var16] = 0;
                }
            }
        }
        if (this.field6784 > 0 && this.field6774 > 0) {
            int var20 = (int) ((double) this.field6784 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field6780[var21] += field6780[var21 - var20] * this.field6774 / 100;
            }
        }
        if (this.field6788.field7901[0] > 0 || this.field6788.field7901[1] > 0) {
            this.field6779.method644();
            int var22 = this.field6779.method647(arg0 + 1);
            int var23 = this.field6788.method3185(0, (float) var22 / 65536.0F);
            int var24 = this.field6788.method3185(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field6780[var23 + var25] * (long) class564.field7895 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field6780[var23 + var25 - var36 - 1] * (long) class564.field7899[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field6780[var25 - var37 - 1] * (long) class564.field7899[1][var37] >> 16);
                    }
                    field6780[var25] = var35;
                    var22 = this.field6779.method647(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field6780[var23 + var25] * (long) class564.field7895 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field6780[var23 + var25 - var33 - 1] * (long) class564.field7899[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field6780[var25 - var34 - 1] * (long) class564.field7899[1][var34] >> 16);
                        }
                        field6780[var25] = var32;
                        var22 = this.field6779.method647(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field6780[var23 + var25 - var29 - 1] * (long) class564.field7899[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field6780[var25 - var30 - 1] * (long) class564.field7899[1][var30] >> 16);
                            }
                            field6780[var25] = var28;
                            this.field6779.method647(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field6788.method3185(0, (float) var22 / 65536.0F);
                    var24 = this.field6788.method3185(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field6780[var38] < -32768) {
                field6780[var38] = -32768;
            }
            if (field6780[var38] > 32767) {
                field6780[var38] = 32767;
            }
        }
        return field6780;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field6791[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field6790 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field6790[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field6780 = new int[220500];
        field6793 = new int[5];
        field6796 = new int[5];
        field6794 = new int[5];
        field6792 = new int[5];
        field6795 = new int[5];
    }
}
