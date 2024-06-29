import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class469 {

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
    private int field6774 = 100;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "[I")
    private int[] field6761 = new int[5];

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "[I")
    private int[] field6769 = new int[5];

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public int field6759 = 0;

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
    private int field6778 = 0;

    @OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
    public int field6780 = 500;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "[I")
    private int[] field6766 = new int[5];

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "[I")
    private static int[] field6760 = new int[32768];

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "[I")
    private static int[] field6764;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "[I")
    private static int[] field6763;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "[I")
    private static int[] field6768;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "[I")
    private static int[] field6772;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "[I")
    private static int[] field6771;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "[I")
    private static int[] field6770;

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "[I")
    private static int[] field6779;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "Lrc;")
    private class162 field6757;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "Lrc;")
    private class162 field6758;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "Lrc;")
    private class162 field6762;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "Lrc;")
    private class162 field6765;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "Lrc;")
    private class162 field6767;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "Lrc;")
    private class162 field6773;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "Lrc;")
    private class162 field6775;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "Lrc;")
    private class162 field6776;

    @OriginalMember(owner = "client!bt", name = "y", descriptor = "Lrc;")
    private class162 field6781;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "Lbm;")
    private class633 field6777;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lek;)V")
    public final void method2769(class465 arg0) {
        this.field6781 = new class162();
        this.field6781.method1229(arg0);
        this.field6765 = new class162();
        this.field6765.method1229(arg0);
        int var2 = arg0.method2705(-54);
        if (var2 != 0) {
            arg0.field6710--;
            this.field6776 = new class162();
            this.field6776.method1229(arg0);
            this.field6762 = new class162();
            this.field6762.method1229(arg0);
        }
        int var3 = arg0.method2705(-48);
        if (var3 != 0) {
            arg0.field6710--;
            this.field6757 = new class162();
            this.field6757.method1229(arg0);
            this.field6758 = new class162();
            this.field6758.method1229(arg0);
        }
        int var4 = arg0.method2705(-51);
        if (var4 != 0) {
            arg0.field6710--;
            this.field6775 = new class162();
            this.field6775.method1229(arg0);
            this.field6767 = new class162();
            this.field6767.method1229(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2720(-127);
            if (var6 == 0) {
                break;
            }
            this.field6766[var5] = var6;
            this.field6769[var5] = arg0.method2718((byte) 123);
            this.field6761[var5] = arg0.method2720(-128);
        }
        this.field6778 = arg0.method2720(-124);
        this.field6774 = arg0.method2720(-127);
        this.field6780 = arg0.method2755((byte) -115);
        this.field6759 = arg0.method2755((byte) -119);
        this.field6777 = new class633();
        this.field6773 = new class162();
        this.field6777.method3567(arg0, this.field6773);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "()V")
    public static void method2770() {
        field6763 = null;
        field6760 = null;
        field6764 = null;
        field6772 = null;
        field6771 = null;
        field6770 = null;
        field6779 = null;
        field6768 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)[I")
    public final int[] method2771(int arg0, int arg1) {
        class553.method3239(field6763, 0, arg0);
        if (arg1 < 10) {
            return field6763;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field6781.method1231();
        this.field6765.method1231();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field6776 != null) {
            this.field6776.method1231();
            this.field6762.method1231();
            var5 = (int) ((double) (this.field6776.field2649 - this.field6776.field2644) * 32.768D / var3);
            var6 = (int) ((double) this.field6776.field2644 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field6757 != null) {
            this.field6757.method1231();
            this.field6758.method1231();
            var8 = (int) ((double) (this.field6757.field2649 - this.field6757.field2644) * 32.768D / var3);
            var9 = (int) ((double) this.field6757.field2644 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field6766[var11] != 0) {
                field6772[var11] = 0;
                field6771[var11] = (int) ((double) this.field6761[var11] * var3);
                field6770[var11] = (this.field6766[var11] << 14) / 100;
                field6779[var11] = (int) ((double) (this.field6781.field2649 - this.field6781.field2644) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field6769[var11]) / var3);
                field6768[var11] = (int) ((double) this.field6781.field2644 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field6781.method1230(arg0);
            int var40 = this.field6765.method1230(arg0);
            if (this.field6776 != null) {
                int var41 = this.field6776.method1230(arg0);
                int var42 = this.field6762.method1230(arg0);
                var39 += this.method2772(var7, var42, this.field6776.field2646) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field6757 != null) {
                int var43 = this.field6757.method1230(arg0);
                int var44 = this.field6758.method1230(arg0);
                var40 = var40 * ((this.method2772(var10, var44, this.field6757.field2646) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field6766[var45] != 0) {
                    int var46 = field6771[var45] + var12;
                    if (var46 < arg0) {
                        field6763[var46] += this.method2772(field6772[var45], field6770[var45] * var40 >> 15, this.field6781.field2646);
                        field6772[var45] += (field6779[var45] * var39 >> 16) + field6768[var45];
                    }
                }
            }
        }
        if (this.field6775 != null) {
            this.field6775.method1231();
            this.field6767.method1231();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field6775.method1230(arg0);
                int var18 = this.field6767.method1230(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field6775.field2649 - this.field6775.field2644) * var17 >> 8) + this.field6775.field2644;
                } else {
                    var19 = ((this.field6775.field2649 - this.field6775.field2644) * var18 >> 8) + this.field6775.field2644;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field6763[var16] = 0;
                }
            }
        }
        if (this.field6778 > 0 && this.field6774 > 0) {
            int var20 = (int) ((double) this.field6778 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field6763[var21] += field6763[var21 - var20] * this.field6774 / 100;
            }
        }
        if (this.field6777.field8969[0] > 0 || this.field6777.field8969[1] > 0) {
            this.field6773.method1231();
            int var22 = this.field6773.method1230(arg0 + 1);
            int var23 = this.field6777.method3566(0, (float) var22 / 65536.0F);
            int var24 = this.field6777.method3566(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field6763[var23 + var25] * (long) class633.field8972 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field6763[var23 + var25 - var36 - 1] * (long) class633.field8975[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field6763[var25 - var37 - 1] * (long) class633.field8975[1][var37] >> 16);
                    }
                    field6763[var25] = var35;
                    var22 = this.field6773.method1230(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field6763[var23 + var25] * (long) class633.field8972 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field6763[var23 + var25 - var33 - 1] * (long) class633.field8975[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field6763[var25 - var34 - 1] * (long) class633.field8975[1][var34] >> 16);
                        }
                        field6763[var25] = var32;
                        var22 = this.field6773.method1230(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field6763[var23 + var25 - var29 - 1] * (long) class633.field8975[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field6763[var25 - var30 - 1] * (long) class633.field8975[1][var30] >> 16);
                            }
                            field6763[var25] = var28;
                            this.field6773.method1230(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field6777.method3566(0, (float) var22 / 65536.0F);
                    var24 = this.field6777.method3566(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field6763[var38] < -32768) {
                field6763[var38] = -32768;
            }
            if (field6763[var38] > 32767) {
                field6763[var38] = 32767;
            }
        }
        return field6763;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)I")
    private final int method2772(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field6764[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field6760[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field6760[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field6764 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field6764[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field6763 = new int[220500];
        field6768 = new int[5];
        field6772 = new int[5];
        field6771 = new int[5];
        field6770 = new int[5];
        field6779 = new int[5];
    }
}
