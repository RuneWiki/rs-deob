import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
    private int[] field148 = new int[5];

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    private int field150 = 0;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public int field155 = 500;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "[I")
    private int[] field151 = new int[5];

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public int field161 = 0;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    private int field157 = 100;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "[I")
    private int[] field165 = new int[5];

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "[I")
    private static int[] field149 = new int[32768];

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "[I")
    private static int[] field167;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "[I")
    private static int[] field163;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "[I")
    private static int[] field168;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "[I")
    private static int[] field170;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "[I")
    private static int[] field169;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "[I")
    private static int[] field171;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "[I")
    private static int[] field172;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Lub;")
    private class18 field152;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Lub;")
    private class18 field153;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lub;")
    private class18 field154;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lub;")
    private class18 field156;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "Lub;")
    private class18 field158;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Lub;")
    private class18 field159;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Lub;")
    private class18 field160;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Lub;")
    private class18 field162;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "Lub;")
    private class18 field164;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "Lde;")
    private class341 field166;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lrp;)V")
    public final void method99(class276 arg0) {
        this.field152 = new class18();
        this.field152.method121(arg0);
        this.field158 = new class18();
        this.field158.method121(arg0);
        int var2 = arg0.method1701(-23121);
        if (var2 != 0) {
            arg0.field4021--;
            this.field156 = new class18();
            this.field156.method121(arg0);
            this.field153 = new class18();
            this.field153.method121(arg0);
        }
        int var3 = arg0.method1701(-23121);
        if (var3 != 0) {
            arg0.field4021--;
            this.field159 = new class18();
            this.field159.method121(arg0);
            this.field160 = new class18();
            this.field160.method121(arg0);
        }
        int var4 = arg0.method1701(-23121);
        if (var4 != 0) {
            arg0.field4021--;
            this.field162 = new class18();
            this.field162.method121(arg0);
            this.field164 = new class18();
            this.field164.method121(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1712(-1);
            if (var6 == 0) {
                break;
            }
            this.field148[var5] = var6;
            this.field165[var5] = arg0.method1726(-101);
            this.field151[var5] = arg0.method1712(-1);
        }
        this.field150 = arg0.method1712(-1);
        this.field157 = arg0.method1712(-1);
        this.field155 = arg0.method1729(65280);
        this.field161 = arg0.method1729(65280);
        this.field166 = new class341();
        this.field154 = new class18();
        this.field166.method2147(arg0, this.field154);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)I")
    private final int method100(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field167[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field149[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "()V")
    public static void method101() {
        field163 = null;
        field149 = null;
        field167 = null;
        field169 = null;
        field170 = null;
        field168 = null;
        field171 = null;
        field172 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I")
    public final int[] method102(int arg0, int arg1) {
        class415.method2447(field163, 0, arg0);
        if (arg1 < 10) {
            return field163;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field152.method123();
        this.field158.method123();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field156 != null) {
            this.field156.method123();
            this.field153.method123();
            var5 = (int) ((double) (this.field156.field214 - this.field156.field218) * 32.768D / var3);
            var6 = (int) ((double) this.field156.field218 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field159 != null) {
            this.field159.method123();
            this.field160.method123();
            var8 = (int) ((double) (this.field159.field214 - this.field159.field218) * 32.768D / var3);
            var9 = (int) ((double) this.field159.field218 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field148[var11] != 0) {
                field169[var11] = 0;
                field170[var11] = (int) ((double) this.field151[var11] * var3);
                field168[var11] = (this.field148[var11] << 14) / 100;
                field171[var11] = (int) ((double) (this.field152.field214 - this.field152.field218) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field165[var11]) / var3);
                field172[var11] = (int) ((double) this.field152.field218 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field152.method122(arg0);
            int var40 = this.field158.method122(arg0);
            if (this.field156 != null) {
                int var41 = this.field156.method122(arg0);
                int var42 = this.field153.method122(arg0);
                var39 += this.method100(var7, var42, this.field156.field217) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field159 != null) {
                int var43 = this.field159.method122(arg0);
                int var44 = this.field160.method122(arg0);
                var40 = var40 * ((this.method100(var10, var44, this.field159.field217) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field148[var45] != 0) {
                    int var46 = field170[var45] + var12;
                    if (var46 < arg0) {
                        field163[var46] += this.method100(field169[var45], field168[var45] * var40 >> 15, this.field152.field217);
                        field169[var45] += (field171[var45] * var39 >> 16) + field172[var45];
                    }
                }
            }
        }
        if (this.field162 != null) {
            this.field162.method123();
            this.field164.method123();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field162.method122(arg0);
                int var18 = this.field164.method122(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field162.field214 - this.field162.field218) * var17 >> 8) + this.field162.field218;
                } else {
                    var19 = ((this.field162.field214 - this.field162.field218) * var18 >> 8) + this.field162.field218;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field163[var16] = 0;
                }
            }
        }
        if (this.field150 > 0 && this.field157 > 0) {
            int var20 = (int) ((double) this.field150 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field163[var21] += field163[var21 - var20] * this.field157 / 100;
            }
        }
        if (this.field166.field4959[0] > 0 || this.field166.field4959[1] > 0) {
            this.field154.method123();
            int var22 = this.field154.method122(arg0 + 1);
            int var23 = this.field166.method2151(0, (float) var22 / 65536.0F);
            int var24 = this.field166.method2151(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field163[var23 + var25] * (long) class341.field4958 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field163[var23 + var25 - var36 - 1] * (long) class341.field4963[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field163[var25 - var37 - 1] * (long) class341.field4963[1][var37] >> 16);
                    }
                    field163[var25] = var35;
                    var22 = this.field154.method122(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field163[var23 + var25] * (long) class341.field4958 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field163[var23 + var25 - var33 - 1] * (long) class341.field4963[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field163[var25 - var34 - 1] * (long) class341.field4963[1][var34] >> 16);
                        }
                        field163[var25] = var32;
                        var22 = this.field154.method122(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field163[var23 + var25 - var29 - 1] * (long) class341.field4963[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field163[var25 - var30 - 1] * (long) class341.field4963[1][var30] >> 16);
                            }
                            field163[var25] = var28;
                            this.field154.method122(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field166.method2151(0, (float) var22 / 65536.0F);
                    var24 = this.field166.method2151(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field163[var38] < -32768) {
                field163[var38] = -32768;
            }
            if (field163[var38] > 32767) {
                field163[var38] = 32767;
            }
        }
        return field163;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field149[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field167 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field167[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field163 = new int[220500];
        field168 = new int[5];
        field170 = new int[5];
        field169 = new int[5];
        field171 = new int[5];
        field172 = new int[5];
    }
}
