import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class409 {

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
    private int field5786 = 0;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    private int field5779 = 100;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "[I")
    private int[] field5778 = new int[5];

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public int field5787 = 500;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public int field5788 = 0;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "[I")
    private int[] field5789 = new int[5];

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "[I")
    private int[] field5781 = new int[5];

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "[I")
    private static int[] field5795 = new int[32768];

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "[I")
    private static int[] field5780;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "[I")
    private static int[] field5785;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "[I")
    private static int[] field5796;

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "[I")
    private static int[] field5797;

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "[I")
    private static int[] field5798;

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "[I")
    private static int[] field5799;

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "[I")
    private static int[] field5800;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "Ltca;")
    private class157 field5777;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "Ltca;")
    private class157 field5782;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "Ltca;")
    private class157 field5783;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "Ltca;")
    private class157 field5784;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "Ltca;")
    private class157 field5790;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "Ltca;")
    private class157 field5791;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "Ltca;")
    private class157 field5792;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "Ltca;")
    private class157 field5794;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "Ltca;")
    private class157 field5801;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "Lmw;")
    private class452 field5793;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field5795[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field5780 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field5780[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field5785 = new int[220500];
        field5796 = new int[5];
        field5797 = new int[5];
        field5798 = new int[5];
        field5799 = new int[5];
        field5800 = new int[5];
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)I", line = 14)
    private final int method2339(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field5780[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field5795[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "()V", line = 35)
    public static void method2340() {
        field5785 = null;
        field5795 = null;
        field5780 = null;
        field5800 = null;
        field5797 = null;
        field5796 = null;
        field5798 = null;
        field5799 = null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljr;)V", line = 59)
    public final void method2341(class96 arg0) {
        this.field5782 = new class157();
        this.field5782.method1091(arg0);
        this.field5791 = new class157();
        this.field5791.method1091(arg0);
        int var2 = arg0.method718(-124);
        if (var2 != 0) {
            arg0.field1301--;
            this.field5783 = new class157();
            this.field5783.method1091(arg0);
            this.field5801 = new class157();
            this.field5801.method1091(arg0);
        }
        int var3 = arg0.method718(-102);
        if (var3 != 0) {
            arg0.field1301--;
            this.field5777 = new class157();
            this.field5777.method1091(arg0);
            this.field5790 = new class157();
            this.field5790.method1091(arg0);
        }
        int var4 = arg0.method718(104);
        if (var4 != 0) {
            arg0.field1301--;
            this.field5784 = new class157();
            this.field5784.method1091(arg0);
            this.field5794 = new class157();
            this.field5794.method1091(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method733((byte) 71);
            if (var6 == 0) {
                break;
            }
            this.field5778[var5] = var6;
            this.field5789[var5] = arg0.method709(false);
            this.field5781[var5] = arg0.method733((byte) 83);
        }
        this.field5786 = arg0.method733((byte) 116);
        this.field5779 = arg0.method733((byte) 97);
        this.field5787 = arg0.method743((byte) -75);
        this.field5788 = arg0.method743((byte) -45);
        this.field5793 = new class452();
        this.field5792 = new class157();
        this.field5793.method2593(arg0, this.field5792);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)[I", line = 119)
    public final int[] method2342(int arg0, int arg1) {
        class282.method1704(field5785, 0, arg0);
        if (arg1 < 10) {
            return field5785;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field5782.method1092();
        this.field5791.method1092();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field5783 != null) {
            this.field5783.method1092();
            this.field5801.method1092();
            var5 = (int) ((double) (this.field5783.field2364 - this.field5783.field2363) * 32.768D / var3);
            var6 = (int) ((double) this.field5783.field2363 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field5777 != null) {
            this.field5777.method1092();
            this.field5790.method1092();
            var8 = (int) ((double) (this.field5777.field2364 - this.field5777.field2363) * 32.768D / var3);
            var9 = (int) ((double) this.field5777.field2363 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field5778[var11] != 0) {
                field5800[var11] = 0;
                field5797[var11] = (int) ((double) this.field5781[var11] * var3);
                field5796[var11] = (this.field5778[var11] << 14) / 100;
                field5798[var11] = (int) ((double) (this.field5782.field2364 - this.field5782.field2363) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field5789[var11]) / var3);
                field5799[var11] = (int) ((double) this.field5782.field2363 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field5782.method1090(arg0);
            int var40 = this.field5791.method1090(arg0);
            if (this.field5783 != null) {
                int var41 = this.field5783.method1090(arg0);
                int var42 = this.field5801.method1090(arg0);
                var39 += this.method2339(var7, var42, this.field5783.field2362) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field5777 != null) {
                int var43 = this.field5777.method1090(arg0);
                int var44 = this.field5790.method1090(arg0);
                var40 = var40 * ((this.method2339(var10, var44, this.field5777.field2362) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field5778[var45] != 0) {
                    int var46 = field5797[var45] + var12;
                    if (var46 < arg0) {
                        field5785[var46] += this.method2339(field5800[var45], field5796[var45] * var40 >> 15, this.field5782.field2362);
                        field5800[var45] += (field5798[var45] * var39 >> 16) + field5799[var45];
                    }
                }
            }
        }
        if (this.field5784 != null) {
            this.field5784.method1092();
            this.field5794.method1092();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field5784.method1090(arg0);
                int var18 = this.field5794.method1090(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field5784.field2364 - this.field5784.field2363) * var17 >> 8) + this.field5784.field2363;
                } else {
                    var19 = ((this.field5784.field2364 - this.field5784.field2363) * var18 >> 8) + this.field5784.field2363;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field5785[var16] = 0;
                }
            }
        }
        if (this.field5786 > 0 && this.field5779 > 0) {
            int var20 = (int) ((double) this.field5786 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field5785[var21] += field5785[var21 - var20] * this.field5779 / 100;
            }
        }
        if (this.field5793.field6307[0] > 0 || this.field5793.field6307[1] > 0) {
            this.field5792.method1092();
            int var22 = this.field5792.method1090(arg0 + 1);
            int var23 = this.field5793.method2597(0, (float) var22 / 65536.0F);
            int var24 = this.field5793.method2597(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field5785[var23 + var25] * (long) class452.field6313 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field5785[var23 + var25 - var36 - 1] * (long) class452.field6309[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field5785[var25 - var37 - 1] * (long) class452.field6309[1][var37] >> 16);
                    }
                    field5785[var25] = var35;
                    var22 = this.field5792.method1090(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field5785[var23 + var25] * (long) class452.field6313 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field5785[var23 + var25 - var33 - 1] * (long) class452.field6309[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field5785[var25 - var34 - 1] * (long) class452.field6309[1][var34] >> 16);
                        }
                        field5785[var25] = var32;
                        var22 = this.field5792.method1090(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field5785[var23 + var25 - var29 - 1] * (long) class452.field6309[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field5785[var25 - var30 - 1] * (long) class452.field6309[1][var30] >> 16);
                            }
                            field5785[var25] = var28;
                            this.field5792.method1090(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field5793.method2597(0, (float) var22 / 65536.0F);
                    var24 = this.field5793.method2597(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field5785[var38] < -32768) {
                field5785[var38] = -32768;
            }
            if (field5785[var38] > 32767) {
                field5785[var38] = 32767;
            }
        }
        return field5785;
    }
}
