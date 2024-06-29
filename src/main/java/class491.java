import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class491 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public int field6853 = 500;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "[I")
    private int[] field6858 = new int[5];

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
    private int field6867 = 0;

    @OriginalMember(owner = "client!pt", name = "x", descriptor = "[I")
    private int[] field6876 = new int[5];

    @OriginalMember(owner = "client!pt", name = "v", descriptor = "I")
    public int field6874 = 0;

    @OriginalMember(owner = "client!pt", name = "w", descriptor = "I")
    private int field6875 = 100;

    @OriginalMember(owner = "client!pt", name = "y", descriptor = "[I")
    private int[] field6877 = new int[5];

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "[I")
    private static int[] field6861 = new int[32768];

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "[I")
    private static int[] field6855;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "[I")
    private static int[] field6856;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "[I")
    private static int[] field6863;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "[I")
    private static int[] field6865;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "[I")
    private static int[] field6864;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "[I")
    private static int[] field6868;

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "[I")
    private static int[] field6873;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "Lkc;")
    private class117 field6854;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "Lkc;")
    private class117 field6857;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Lkc;")
    private class117 field6859;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "Lkc;")
    private class117 field6860;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "Lkc;")
    private class117 field6866;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "Lkc;")
    private class117 field6869;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "Lkc;")
    private class117 field6870;

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "Lkc;")
    private class117 field6871;

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "Lkc;")
    private class117 field6872;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "Lfaa;")
    private class138 field6862;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field6861[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field6855 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field6855[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field6856 = new int[220500];
        field6863 = new int[5];
        field6865 = new int[5];
        field6864 = new int[5];
        field6868 = new int[5];
        field6873 = new int[5];
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "()V", line = 15)
    public static void method2861() {
        field6856 = null;
        field6861 = null;
        field6855 = null;
        field6865 = null;
        field6864 = null;
        field6873 = null;
        field6863 = null;
        field6868 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lun;)V", line = 29)
    public final void method2862(class389 arg0) {
        this.field6866 = new class117();
        this.field6866.method831(arg0);
        this.field6857 = new class117();
        this.field6857.method831(arg0);
        int var2 = arg0.method2229(255);
        if (var2 != 0) {
            arg0.field5195--;
            this.field6872 = new class117();
            this.field6872.method831(arg0);
            this.field6860 = new class117();
            this.field6860.method831(arg0);
        }
        int var3 = arg0.method2229(255);
        if (var3 != 0) {
            arg0.field5195--;
            this.field6870 = new class117();
            this.field6870.method831(arg0);
            this.field6869 = new class117();
            this.field6869.method831(arg0);
        }
        int var4 = arg0.method2229(255);
        if (var4 != 0) {
            arg0.field5195--;
            this.field6854 = new class117();
            this.field6854.method831(arg0);
            this.field6871 = new class117();
            this.field6871.method831(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2266((byte) 110);
            if (var6 == 0) {
                break;
            }
            this.field6877[var5] = var6;
            this.field6858[var5] = arg0.method2228(0);
            this.field6876[var5] = arg0.method2266((byte) 110);
        }
        this.field6867 = arg0.method2266((byte) 110);
        this.field6875 = arg0.method2266((byte) 110);
        this.field6853 = arg0.method2260(-45);
        this.field6874 = arg0.method2260(-103);
        this.field6862 = new class138();
        this.field6859 = new class117();
        this.field6862.method916(arg0, this.field6859);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)[I", line = 118)
    public final int[] method2863(int arg0, int arg1) {
        class252.method1542(field6856, 0, arg0);
        if (arg1 < 10) {
            return field6856;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field6866.method829();
        this.field6857.method829();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field6872 != null) {
            this.field6872.method829();
            this.field6860.method829();
            var5 = (int) ((double) (this.field6872.field1512 - this.field6872.field1511) * 32.768D / var3);
            var6 = (int) ((double) this.field6872.field1511 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field6870 != null) {
            this.field6870.method829();
            this.field6869.method829();
            var8 = (int) ((double) (this.field6870.field1512 - this.field6870.field1511) * 32.768D / var3);
            var9 = (int) ((double) this.field6870.field1511 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field6877[var11] != 0) {
                field6865[var11] = 0;
                field6864[var11] = (int) ((double) this.field6876[var11] * var3);
                field6873[var11] = (this.field6877[var11] << 14) / 100;
                field6863[var11] = (int) ((double) (this.field6866.field1512 - this.field6866.field1511) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field6858[var11]) / var3);
                field6868[var11] = (int) ((double) this.field6866.field1511 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field6866.method830(arg0);
            int var40 = this.field6857.method830(arg0);
            if (this.field6872 != null) {
                int var41 = this.field6872.method830(arg0);
                int var42 = this.field6860.method830(arg0);
                var39 += this.method2864(var7, var42, this.field6872.field1515) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field6870 != null) {
                int var43 = this.field6870.method830(arg0);
                int var44 = this.field6869.method830(arg0);
                var40 = var40 * ((this.method2864(var10, var44, this.field6870.field1515) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field6877[var45] != 0) {
                    int var46 = field6864[var45] + var12;
                    if (var46 < arg0) {
                        field6856[var46] += this.method2864(field6865[var45], field6873[var45] * var40 >> 15, this.field6866.field1515);
                        field6865[var45] += (field6863[var45] * var39 >> 16) + field6868[var45];
                    }
                }
            }
        }
        if (this.field6854 != null) {
            this.field6854.method829();
            this.field6871.method829();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field6854.method830(arg0);
                int var18 = this.field6871.method830(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field6854.field1512 - this.field6854.field1511) * var17 >> 8) + this.field6854.field1511;
                } else {
                    var19 = ((this.field6854.field1512 - this.field6854.field1511) * var18 >> 8) + this.field6854.field1511;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field6856[var16] = 0;
                }
            }
        }
        if (this.field6867 > 0 && this.field6875 > 0) {
            int var20 = (int) ((double) this.field6867 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field6856[var21] += field6856[var21 - var20] * this.field6875 / 100;
            }
        }
        if (this.field6862.field1746[0] > 0 || this.field6862.field1746[1] > 0) {
            this.field6859.method829();
            int var22 = this.field6859.method830(arg0 + 1);
            int var23 = this.field6862.method912(0, (float) var22 / 65536.0F);
            int var24 = this.field6862.method912(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field6856[var23 + var25] * (long) class138.field1744 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field6856[var23 + var25 - var36 - 1] * (long) class138.field1741[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field6856[var25 - var37 - 1] * (long) class138.field1741[1][var37] >> 16);
                    }
                    field6856[var25] = var35;
                    var22 = this.field6859.method830(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field6856[var23 + var25] * (long) class138.field1744 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field6856[var23 + var25 - var33 - 1] * (long) class138.field1741[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field6856[var25 - var34 - 1] * (long) class138.field1741[1][var34] >> 16);
                        }
                        field6856[var25] = var32;
                        var22 = this.field6859.method830(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field6856[var23 + var25 - var29 - 1] * (long) class138.field1741[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field6856[var25 - var30 - 1] * (long) class138.field1741[1][var30] >> 16);
                            }
                            field6856[var25] = var28;
                            this.field6859.method830(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field6862.method912(0, (float) var22 / 65536.0F);
                    var24 = this.field6862.method912(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field6856[var38] < -32768) {
                field6856[var38] = -32768;
            }
            if (field6856[var38] > 32767) {
                field6856[var38] = 32767;
            }
        }
        return field6856;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)I", line = 400)
    private final int method2864(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field6855[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field6861[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
