import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class478 {

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "I")
    public int field6782 = 0;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
    public int field6783 = 500;

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    private int field6784 = 0;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
    private int field6786 = 100;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "[I")
    private int[] field6787 = new int[5];

    @OriginalMember(owner = "client!nda", name = "r", descriptor = "[I")
    private int[] field6796 = new int[5];

    @OriginalMember(owner = "client!nda", name = "q", descriptor = "[I")
    private int[] field6795 = new int[5];

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "[I")
    private static int[] field6790 = new int[32768];

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "[I")
    private static int[] field6788;

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "[I")
    private static int[] field6792;

    @OriginalMember(owner = "client!nda", name = "x", descriptor = "[I")
    private static int[] field6802;

    @OriginalMember(owner = "client!nda", name = "y", descriptor = "[I")
    private static int[] field6803;

    @OriginalMember(owner = "client!nda", name = "u", descriptor = "[I")
    private static int[] field6799;

    @OriginalMember(owner = "client!nda", name = "v", descriptor = "[I")
    private static int[] field6800;

    @OriginalMember(owner = "client!nda", name = "w", descriptor = "[I")
    private static int[] field6801;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "Lsu;")
    private class179 field6779;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "Lsu;")
    private class179 field6780;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "Lsu;")
    private class179 field6781;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "Lsu;")
    private class179 field6789;

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "Lsu;")
    private class179 field6791;

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "Lsu;")
    private class179 field6793;

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "Lsu;")
    private class179 field6794;

    @OriginalMember(owner = "client!nda", name = "s", descriptor = "Lsu;")
    private class179 field6797;

    @OriginalMember(owner = "client!nda", name = "t", descriptor = "Lsu;")
    private class179 field6798;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "Lae;")
    private class211 field6785;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)I")
    private final int method2878(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field6788[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field6790[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lgw;)V")
    public final void method2879(class148 arg0) {
        this.field6798 = new class179();
        this.field6798.method1261(arg0);
        this.field6791 = new class179();
        this.field6791.method1261(arg0);
        int var2 = arg0.method1032((byte) -33);
        if (var2 != 0) {
            arg0.field2177--;
            this.field6780 = new class179();
            this.field6780.method1261(arg0);
            this.field6779 = new class179();
            this.field6779.method1261(arg0);
        }
        int var3 = arg0.method1032((byte) -33);
        if (var3 != 0) {
            arg0.field2177--;
            this.field6793 = new class179();
            this.field6793.method1261(arg0);
            this.field6781 = new class179();
            this.field6781.method1261(arg0);
        }
        int var4 = arg0.method1032((byte) -33);
        if (var4 != 0) {
            arg0.field2177--;
            this.field6789 = new class179();
            this.field6789.method1261(arg0);
            this.field6794 = new class179();
            this.field6794.method1261(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1055(1957696096);
            if (var6 == 0) {
                break;
            }
            this.field6796[var5] = var6;
            this.field6787[var5] = arg0.method1067((byte) -118);
            this.field6795[var5] = arg0.method1055(1957696096);
        }
        this.field6784 = arg0.method1055(1957696096);
        this.field6786 = arg0.method1055(1957696096);
        this.field6783 = arg0.method1045(true);
        this.field6782 = arg0.method1045(true);
        this.field6785 = new class211();
        this.field6797 = new class179();
        this.field6785.method1391(arg0, this.field6797);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "()V")
    public static void method2880() {
        field6792 = null;
        field6790 = null;
        field6788 = null;
        field6803 = null;
        field6800 = null;
        field6799 = null;
        field6802 = null;
        field6801 = null;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)[I")
    public final int[] method2881(int arg0, int arg1) {
        class648.method3735(field6792, 0, arg0);
        if (arg1 < 10) {
            return field6792;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field6798.method1259();
        this.field6791.method1259();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field6780 != null) {
            this.field6780.method1259();
            this.field6779.method1259();
            var5 = (int) ((double) (this.field6780.field2728 - this.field6780.field2727) * 32.768D / var3);
            var6 = (int) ((double) this.field6780.field2727 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field6793 != null) {
            this.field6793.method1259();
            this.field6781.method1259();
            var8 = (int) ((double) (this.field6793.field2728 - this.field6793.field2727) * 32.768D / var3);
            var9 = (int) ((double) this.field6793.field2727 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field6796[var11] != 0) {
                field6803[var11] = 0;
                field6800[var11] = (int) ((double) this.field6795[var11] * var3);
                field6799[var11] = (this.field6796[var11] << 14) / 100;
                field6802[var11] = (int) ((double) (this.field6798.field2728 - this.field6798.field2727) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field6787[var11]) / var3);
                field6801[var11] = (int) ((double) this.field6798.field2727 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field6798.method1258(arg0);
            int var40 = this.field6791.method1258(arg0);
            if (this.field6780 != null) {
                int var41 = this.field6780.method1258(arg0);
                int var42 = this.field6779.method1258(arg0);
                var39 += this.method2878(var7, var42, this.field6780.field2724) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field6793 != null) {
                int var43 = this.field6793.method1258(arg0);
                int var44 = this.field6781.method1258(arg0);
                var40 = var40 * ((this.method2878(var10, var44, this.field6793.field2724) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field6796[var45] != 0) {
                    int var46 = field6800[var45] + var12;
                    if (var46 < arg0) {
                        field6792[var46] += this.method2878(field6803[var45], field6799[var45] * var40 >> 15, this.field6798.field2724);
                        field6803[var45] += (field6802[var45] * var39 >> 16) + field6801[var45];
                    }
                }
            }
        }
        if (this.field6789 != null) {
            this.field6789.method1259();
            this.field6794.method1259();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field6789.method1258(arg0);
                int var18 = this.field6794.method1258(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field6789.field2728 - this.field6789.field2727) * var17 >> 8) + this.field6789.field2727;
                } else {
                    var19 = ((this.field6789.field2728 - this.field6789.field2727) * var18 >> 8) + this.field6789.field2727;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field6792[var16] = 0;
                }
            }
        }
        if (this.field6784 > 0 && this.field6786 > 0) {
            int var20 = (int) ((double) this.field6784 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field6792[var21] += field6792[var21 - var20] * this.field6786 / 100;
            }
        }
        if (this.field6785.field3110[0] > 0 || this.field6785.field3110[1] > 0) {
            this.field6797.method1259();
            int var22 = this.field6797.method1258(arg0 + 1);
            int var23 = this.field6785.method1389(0, (float) var22 / 65536.0F);
            int var24 = this.field6785.method1389(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field6792[var23 + var25] * (long) class211.field3116 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field6792[var23 + var25 - var36 - 1] * (long) class211.field3109[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field6792[var25 - var37 - 1] * (long) class211.field3109[1][var37] >> 16);
                    }
                    field6792[var25] = var35;
                    var22 = this.field6797.method1258(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field6792[var23 + var25] * (long) class211.field3116 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field6792[var23 + var25 - var33 - 1] * (long) class211.field3109[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field6792[var25 - var34 - 1] * (long) class211.field3109[1][var34] >> 16);
                        }
                        field6792[var25] = var32;
                        var22 = this.field6797.method1258(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field6792[var23 + var25 - var29 - 1] * (long) class211.field3109[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field6792[var25 - var30 - 1] * (long) class211.field3109[1][var30] >> 16);
                            }
                            field6792[var25] = var28;
                            this.field6797.method1258(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field6785.method1389(0, (float) var22 / 65536.0F);
                    var24 = this.field6785.method1389(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field6792[var38] < -32768) {
                field6792[var38] = -32768;
            }
            if (field6792[var38] > 32767) {
                field6792[var38] = 32767;
            }
        }
        return field6792;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field6790[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field6788 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field6788[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field6792 = new int[220500];
        field6802 = new int[5];
        field6803 = new int[5];
        field6799 = new int[5];
        field6800 = new int[5];
        field6801 = new int[5];
    }
}
