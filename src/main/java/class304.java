import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class304 {

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    private int field4050 = 0;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public int field4057 = 0;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public int field4052 = 500;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "[I")
    private int[] field4056 = new int[5];

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "[I")
    private int[] field4055 = new int[5];

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    private int field4064 = 100;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
    private int[] field4048 = new int[5];

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "[I")
    private static int[] field4047 = new int[32768];

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "[I")
    private static int[] field4054;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "[I")
    private static int[] field4058;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "[I")
    private static int[] field4066;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "[I")
    private static int[] field4067;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "[I")
    private static int[] field4068;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "[I")
    private static int[] field4065;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "[I")
    private static int[] field4070;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Luw;")
    private class194 field4062;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lvaa;")
    private class261 field4046;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lvaa;")
    private class261 field4049;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lvaa;")
    private class261 field4051;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lvaa;")
    private class261 field4053;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Lvaa;")
    private class261 field4059;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lvaa;")
    private class261 field4060;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lvaa;")
    private class261 field4061;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Lvaa;")
    private class261 field4063;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Lvaa;")
    private class261 field4069;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4047[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4054 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4054[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4058 = new int[220500];
        field4066 = new int[5];
        field4067 = new int[5];
        field4068 = new int[5];
        field4065 = new int[5];
        field4070 = new int[5];
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I", line = 3)
    private final int method1783(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4054[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4047[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lio;)V", line = 25)
    public final void method1784(class157 arg0) {
        this.field4061 = new class261();
        this.field4061.method1571(arg0);
        this.field4046 = new class261();
        this.field4046.method1571(arg0);
        int var2 = arg0.method930(255);
        if (var2 != 0) {
            arg0.field2219--;
            this.field4053 = new class261();
            this.field4053.method1571(arg0);
            this.field4059 = new class261();
            this.field4059.method1571(arg0);
        }
        int var3 = arg0.method930(255);
        if (var3 != 0) {
            arg0.field2219--;
            this.field4063 = new class261();
            this.field4063.method1571(arg0);
            this.field4049 = new class261();
            this.field4049.method1571(arg0);
        }
        int var4 = arg0.method930(255);
        if (var4 != 0) {
            arg0.field2219--;
            this.field4051 = new class261();
            this.field4051.method1571(arg0);
            this.field4060 = new class261();
            this.field4060.method1571(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method964(90);
            if (var6 == 0) {
                break;
            }
            this.field4055[var5] = var6;
            this.field4048[var5] = arg0.method971(16);
            this.field4056[var5] = arg0.method964(61);
        }
        this.field4050 = arg0.method964(72);
        this.field4064 = arg0.method964(95);
        this.field4052 = arg0.method963(-124);
        this.field4057 = arg0.method963(-128);
        this.field4062 = new class194();
        this.field4069 = new class261();
        this.field4062.method1271(arg0, this.field4069);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[I", line = 89)
    public final int[] method1785(int arg0, int arg1) {
        class2.method5(field4058, 0, arg0);
        if (arg1 < 10) {
            return field4058;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4061.method1570();
        this.field4046.method1570();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4053 != null) {
            this.field4053.method1570();
            this.field4059.method1570();
            var5 = (int) ((double) (this.field4053.field3394 - this.field4053.field3392) * 32.768D / var3);
            var6 = (int) ((double) this.field4053.field3392 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4063 != null) {
            this.field4063.method1570();
            this.field4049.method1570();
            var8 = (int) ((double) (this.field4063.field3394 - this.field4063.field3392) * 32.768D / var3);
            var9 = (int) ((double) this.field4063.field3392 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4055[var11] != 0) {
                field4067[var11] = 0;
                field4066[var11] = (int) ((double) this.field4056[var11] * var3);
                field4065[var11] = (this.field4055[var11] << 14) / 100;
                field4068[var11] = (int) ((double) (this.field4061.field3394 - this.field4061.field3392) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4048[var11]) / var3);
                field4070[var11] = (int) ((double) this.field4061.field3392 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4061.method1569(arg0);
            int var40 = this.field4046.method1569(arg0);
            if (this.field4053 != null) {
                int var41 = this.field4053.method1569(arg0);
                int var42 = this.field4059.method1569(arg0);
                var39 += this.method1783(var7, var42, this.field4053.field3395) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4063 != null) {
                int var43 = this.field4063.method1569(arg0);
                int var44 = this.field4049.method1569(arg0);
                var40 = var40 * ((this.method1783(var10, var44, this.field4063.field3395) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4055[var45] != 0) {
                    int var46 = field4066[var45] + var12;
                    if (var46 < arg0) {
                        field4058[var46] += this.method1783(field4067[var45], field4065[var45] * var40 >> 15, this.field4061.field3395);
                        field4067[var45] += (field4068[var45] * var39 >> 16) + field4070[var45];
                    }
                }
            }
        }
        if (this.field4051 != null) {
            this.field4051.method1570();
            this.field4060.method1570();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4051.method1569(arg0);
                int var18 = this.field4060.method1569(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4051.field3394 - this.field4051.field3392) * var17 >> 8) + this.field4051.field3392;
                } else {
                    var19 = ((this.field4051.field3394 - this.field4051.field3392) * var18 >> 8) + this.field4051.field3392;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4058[var16] = 0;
                }
            }
        }
        if (this.field4050 > 0 && this.field4064 > 0) {
            int var20 = (int) ((double) this.field4050 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4058[var21] += field4058[var21 - var20] * this.field4064 / 100;
            }
        }
        if (this.field4062.field2662[0] > 0 || this.field4062.field2662[1] > 0) {
            this.field4069.method1570();
            int var22 = this.field4069.method1569(arg0 + 1);
            int var23 = this.field4062.method1267(0, (float) var22 / 65536.0F);
            int var24 = this.field4062.method1267(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4058[var23 + var25] * (long) class194.field2663 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4058[var23 + var25 - var36 - 1] * (long) class194.field2668[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4058[var25 - var37 - 1] * (long) class194.field2668[1][var37] >> 16);
                    }
                    field4058[var25] = var35;
                    var22 = this.field4069.method1569(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4058[var23 + var25] * (long) class194.field2663 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4058[var23 + var25 - var33 - 1] * (long) class194.field2668[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4058[var25 - var34 - 1] * (long) class194.field2668[1][var34] >> 16);
                        }
                        field4058[var25] = var32;
                        var22 = this.field4069.method1569(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4058[var23 + var25 - var29 - 1] * (long) class194.field2668[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4058[var25 - var30 - 1] * (long) class194.field2668[1][var30] >> 16);
                            }
                            field4058[var25] = var28;
                            this.field4069.method1569(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4062.method1267(0, (float) var22 / 65536.0F);
                    var24 = this.field4062.method1267(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4058[var38] < -32768) {
                field4058[var38] = -32768;
            }
            if (field4058[var38] > 32767) {
                field4058[var38] = 32767;
            }
        }
        return field4058;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 378)
    public static void method1786() {
        field4058 = null;
        field4047 = null;
        field4054 = null;
        field4067 = null;
        field4066 = null;
        field4065 = null;
        field4068 = null;
        field4070 = null;
    }
}
