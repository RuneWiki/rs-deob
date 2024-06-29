import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class335 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    private int field4198 = 100;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    private int field4196 = 0;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[I")
    private int[] field4199 = new int[5];

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[I")
    private int[] field4212 = new int[5];

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "[I")
    private int[] field4214 = new int[5];

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public int field4205 = 500;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public int field4215 = 0;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "[I")
    private static int[] field4202 = new int[32768];

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "[I")
    private static int[] field4204;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "[I")
    private static int[] field4209;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "[I")
    private static int[] field4218;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "[I")
    private static int[] field4217;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "[I")
    private static int[] field4216;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "[I")
    private static int[] field4219;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "[I")
    private static int[] field4220;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Ltb;")
    private class449 field4197;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Ltb;")
    private class449 field4200;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Ltb;")
    private class449 field4201;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Ltb;")
    private class449 field4203;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Ltb;")
    private class449 field4206;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Ltb;")
    private class449 field4207;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Ltb;")
    private class449 field4210;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Ltb;")
    private class449 field4211;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Ltb;")
    private class449 field4213;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "Lnca;")
    private class55 field4208;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I")
    public final int[] method1930(int arg0, int arg1) {
        class567.method3218(field4209, 0, arg0);
        if (arg1 < 10) {
            return field4209;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4211.method2592();
        this.field4210.method2592();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4203 != null) {
            this.field4203.method2592();
            this.field4213.method2592();
            var5 = (int) ((double) (this.field4203.field6301 - this.field4203.field6299) * 32.768D / var3);
            var6 = (int) ((double) this.field4203.field6299 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4207 != null) {
            this.field4207.method2592();
            this.field4201.method2592();
            var8 = (int) ((double) (this.field4207.field6301 - this.field4207.field6299) * 32.768D / var3);
            var9 = (int) ((double) this.field4207.field6299 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4214[var11] != 0) {
                field4218[var11] = 0;
                field4220[var11] = (int) ((double) this.field4199[var11] * var3);
                field4217[var11] = (this.field4214[var11] << 14) / 100;
                field4219[var11] = (int) ((double) (this.field4211.field6301 - this.field4211.field6299) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4212[var11]) / var3);
                field4216[var11] = (int) ((double) this.field4211.field6299 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4211.method2593(arg0);
            int var40 = this.field4210.method2593(arg0);
            if (this.field4203 != null) {
                int var41 = this.field4203.method2593(arg0);
                int var42 = this.field4213.method2593(arg0);
                var39 += this.method1931(var7, var42, this.field4203.field6303) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4207 != null) {
                int var43 = this.field4207.method2593(arg0);
                int var44 = this.field4201.method2593(arg0);
                var40 = var40 * ((this.method1931(var10, var44, this.field4207.field6303) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4214[var45] != 0) {
                    int var46 = field4220[var45] + var12;
                    if (var46 < arg0) {
                        field4209[var46] += this.method1931(field4218[var45], field4217[var45] * var40 >> 15, this.field4211.field6303);
                        field4218[var45] += (field4219[var45] * var39 >> 16) + field4216[var45];
                    }
                }
            }
        }
        if (this.field4200 != null) {
            this.field4200.method2592();
            this.field4197.method2592();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4200.method2593(arg0);
                int var18 = this.field4197.method2593(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4200.field6301 - this.field4200.field6299) * var17 >> 8) + this.field4200.field6299;
                } else {
                    var19 = ((this.field4200.field6301 - this.field4200.field6299) * var18 >> 8) + this.field4200.field6299;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4209[var16] = 0;
                }
            }
        }
        if (this.field4196 > 0 && this.field4198 > 0) {
            int var20 = (int) ((double) this.field4196 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4209[var21] += field4209[var21 - var20] * this.field4198 / 100;
            }
        }
        if (this.field4208.field552[0] > 0 || this.field4208.field552[1] > 0) {
            this.field4206.method2592();
            int var22 = this.field4206.method2593(arg0 + 1);
            int var23 = this.field4208.method292(0, (float) var22 / 65536.0F);
            int var24 = this.field4208.method292(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4209[var23 + var25] * (long) class55.field556 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4209[var23 + var25 - var36 - 1] * (long) class55.field557[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4209[var25 - var37 - 1] * (long) class55.field557[1][var37] >> 16);
                    }
                    field4209[var25] = var35;
                    var22 = this.field4206.method2593(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4209[var23 + var25] * (long) class55.field556 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4209[var23 + var25 - var33 - 1] * (long) class55.field557[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4209[var25 - var34 - 1] * (long) class55.field557[1][var34] >> 16);
                        }
                        field4209[var25] = var32;
                        var22 = this.field4206.method2593(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4209[var23 + var25 - var29 - 1] * (long) class55.field557[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4209[var25 - var30 - 1] * (long) class55.field557[1][var30] >> 16);
                            }
                            field4209[var25] = var28;
                            this.field4206.method2593(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4208.method292(0, (float) var22 / 65536.0F);
                    var24 = this.field4208.method292(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4209[var38] < -32768) {
                field4209[var38] = -32768;
            }
            if (field4209[var38] > 32767) {
                field4209[var38] = 32767;
            }
        }
        return field4209;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
    private final int method1931(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4204[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4202[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lnp;)V")
    public final void method1932(class115 arg0) {
        this.field4211 = new class449();
        this.field4211.method2591(arg0);
        this.field4210 = new class449();
        this.field4210.method2591(arg0);
        int var2 = arg0.method620((byte) -126);
        if (var2 != 0) {
            arg0.field1218--;
            this.field4203 = new class449();
            this.field4203.method2591(arg0);
            this.field4213 = new class449();
            this.field4213.method2591(arg0);
        }
        int var3 = arg0.method620((byte) -126);
        if (var3 != 0) {
            arg0.field1218--;
            this.field4207 = new class449();
            this.field4207.method2591(arg0);
            this.field4201 = new class449();
            this.field4201.method2591(arg0);
        }
        int var4 = arg0.method620((byte) -126);
        if (var4 != 0) {
            arg0.field1218--;
            this.field4200 = new class449();
            this.field4200.method2591(arg0);
            this.field4197 = new class449();
            this.field4197.method2591(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method662(true);
            if (var6 == 0) {
                break;
            }
            this.field4214[var5] = var6;
            this.field4212[var5] = arg0.method617(-26046);
            this.field4199[var5] = arg0.method662(true);
        }
        this.field4196 = arg0.method662(true);
        this.field4198 = arg0.method662(true);
        this.field4205 = arg0.method643((byte) -77);
        this.field4215 = arg0.method643((byte) -77);
        this.field4208 = new class55();
        this.field4206 = new class449();
        this.field4208.method291(arg0, this.field4206);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
    public static void method1933() {
        field4209 = null;
        field4202 = null;
        field4204 = null;
        field4218 = null;
        field4220 = null;
        field4217 = null;
        field4219 = null;
        field4216 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4202[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4204 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4204[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4209 = new int[220500];
        field4218 = new int[5];
        field4217 = new int[5];
        field4216 = new int[5];
        field4219 = new int[5];
        field4220 = new int[5];
    }
}
