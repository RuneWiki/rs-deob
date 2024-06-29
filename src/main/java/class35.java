import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class35 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public int field869 = 500;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public int field872 = 0;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    private int field883 = 100;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    private int field871 = 0;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
    private int[] field870 = new int[5];

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "[I")
    private int[] field880 = new int[5];

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "[I")
    private int[] field886 = new int[5];

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "[I")
    private static int[] field887 = new int[32768];

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "[I")
    private static int[] field876;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[I")
    private static int[] field875;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "[I")
    private static int[] field888;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "[I")
    private static int[] field890;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "[I")
    private static int[] field889;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "[I")
    private static int[] field892;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "[I")
    private static int[] field891;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lub;")
    private class140 field868;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lub;")
    private class140 field873;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Lub;")
    private class140 field874;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lub;")
    private class140 field877;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Lub;")
    private class140 field878;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lub;")
    private class140 field879;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lub;")
    private class140 field881;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Lub;")
    private class140 field882;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "Lub;")
    private class140 field884;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Lwd;")
    private class154 field885;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
    public final int[] method312(int arg0, int arg1) {
        class125.method1040(field875, 0, arg0);
        if (arg1 < 10) {
            return field875;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field874.method1147();
        this.field878.method1147();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field879 != null) {
            this.field879.method1147();
            this.field884.method1147();
            var5 = (int) ((double) (this.field879.field3310 - this.field879.field3309) * 32.768D / var3);
            var6 = (int) ((double) this.field879.field3309 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field881 != null) {
            this.field881.method1147();
            this.field873.method1147();
            var8 = (int) ((double) (this.field881.field3310 - this.field881.field3309) * 32.768D / var3);
            var9 = (int) ((double) this.field881.field3309 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field886[var11] != 0) {
                field891[var11] = 0;
                field888[var11] = (int) ((double) this.field870[var11] * var3);
                field892[var11] = (this.field886[var11] << 14) / 100;
                field890[var11] = (int) ((double) (this.field874.field3310 - this.field874.field3309) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field880[var11]) / var3);
                field889[var11] = (int) ((double) this.field874.field3309 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field874.method1149(arg0);
            int var40 = this.field878.method1149(arg0);
            if (this.field879 != null) {
                int var41 = this.field879.method1149(arg0);
                int var42 = this.field884.method1149(arg0);
                var39 += this.method313(var7, var42, this.field879.field3306) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field881 != null) {
                int var43 = this.field881.method1149(arg0);
                int var44 = this.field873.method1149(arg0);
                var40 = var40 * ((this.method313(var10, var44, this.field881.field3306) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field886[var45] != 0) {
                    int var46 = field888[var45] + var12;
                    if (var46 < arg0) {
                        field875[var46] += this.method313(field891[var45], field892[var45] * var40 >> 15, this.field874.field3306);
                        field891[var45] += (field890[var45] * var39 >> 16) + field889[var45];
                    }
                }
            }
        }
        if (this.field868 != null) {
            this.field868.method1147();
            this.field877.method1147();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field868.method1149(arg0);
                int var18 = this.field877.method1149(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field868.field3310 - this.field868.field3309) * var17 >> 8) + this.field868.field3309;
                } else {
                    var19 = ((this.field868.field3310 - this.field868.field3309) * var18 >> 8) + this.field868.field3309;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field875[var16] = 0;
                }
            }
        }
        if (this.field871 > 0 && this.field883 > 0) {
            int var20 = (int) ((double) this.field871 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field875[var21] += field875[var21 - var20] * this.field883 / 100;
            }
        }
        if (this.field885.field3586[0] > 0 || this.field885.field3586[1] > 0) {
            this.field882.method1147();
            int var22 = this.field882.method1149(arg0 + 1);
            int var23 = this.field885.method1208(0, (float) var22 / 65536.0F);
            int var24 = this.field885.method1208(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field875[var23 + var25] * (long) class154.field3590 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field875[var23 + var25 - var36 - 1] * (long) class154.field3593[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field875[var25 - var37 - 1] * (long) class154.field3593[1][var37] >> 16);
                    }
                    field875[var25] = var35;
                    var22 = this.field882.method1149(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field875[var23 + var25] * (long) class154.field3590 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field875[var23 + var25 - var33 - 1] * (long) class154.field3593[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field875[var25 - var34 - 1] * (long) class154.field3593[1][var34] >> 16);
                        }
                        field875[var25] = var32;
                        var22 = this.field882.method1149(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field875[var23 + var25 - var29 - 1] * (long) class154.field3593[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field875[var25 - var30 - 1] * (long) class154.field3593[1][var30] >> 16);
                            }
                            field875[var25] = var28;
                            this.field882.method1149(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field885.method1208(0, (float) var22 / 65536.0F);
                    var24 = this.field885.method1208(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field875[var38] < -32768) {
                field875[var38] = -32768;
            }
            if (field875[var38] > 32767) {
                field875[var38] = 32767;
            }
        }
        return field875;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
    private final int method313(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field876[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field887[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
    public static void method314() {
        field875 = null;
        field887 = null;
        field876 = null;
        field891 = null;
        field888 = null;
        field892 = null;
        field890 = null;
        field889 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lrd;)V")
    public final void method315(class122 arg0) {
        this.field874 = new class140();
        this.field874.method1146(arg0);
        this.field878 = new class140();
        this.field878.method1146(arg0);
        int var2 = arg0.method931((byte) 124);
        if (var2 != 0) {
            arg0.field2903--;
            this.field879 = new class140();
            this.field879.method1146(arg0);
            this.field884 = new class140();
            this.field884.method1146(arg0);
        }
        int var3 = arg0.method931((byte) 124);
        if (var3 != 0) {
            arg0.field2903--;
            this.field881 = new class140();
            this.field881.method1146(arg0);
            this.field873 = new class140();
            this.field873.method1146(arg0);
        }
        int var4 = arg0.method931((byte) 124);
        if (var4 != 0) {
            arg0.field2903--;
            this.field868 = new class140();
            this.field868.method1146(arg0);
            this.field877 = new class140();
            this.field877.method1146(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method934(-99);
            if (var6 == 0) {
                break;
            }
            this.field886[var5] = var6;
            this.field880[var5] = arg0.method958(-24839);
            this.field870[var5] = arg0.method934(-86);
        }
        this.field871 = arg0.method934(-91);
        this.field883 = arg0.method934(-128);
        this.field869 = arg0.method965(false);
        this.field872 = arg0.method965(false);
        this.field885 = new class154();
        this.field882 = new class140();
        this.field885.method1207(arg0, this.field882);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field887[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field876 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field876[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field875 = new int[220500];
        field888 = new int[5];
        field890 = new int[5];
        field889 = new int[5];
        field892 = new int[5];
        field891 = new int[5];
    }
}
