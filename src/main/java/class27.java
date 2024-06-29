import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class27 {

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "[I")
    private int[] field535 = new int[5];

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "[I")
    private int[] field531 = new int[5];

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    private int field530 = 0;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "[I")
    private int[] field533 = new int[5];

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    private int field537 = 100;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public int field544 = 500;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public int field547 = 0;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "[I")
    private static int[] field546 = new int[32768];

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "[I")
    private static int[] field545;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "[I")
    private static int[] field536;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "[I")
    private static int[] field548;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "[I")
    private static int[] field549;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "[I")
    private static int[] field551;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "[I")
    private static int[] field552;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "[I")
    private static int[] field550;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Llg;")
    private class11 field534;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Lce;")
    private class172 field528;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Lce;")
    private class172 field529;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Lce;")
    private class172 field532;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Lce;")
    private class172 field538;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "Lce;")
    private class172 field539;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Lce;")
    private class172 field540;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "Lce;")
    private class172 field541;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "Lce;")
    private class172 field542;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "Lce;")
    private class172 field543;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
    public static void method191() {
        field536 = null;
        field546 = null;
        field545 = null;
        field549 = null;
        field550 = null;
        field551 = null;
        field552 = null;
        field548 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)I")
    private final int method192(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field545[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field546[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[I")
    public final int[] method193(int arg0, int arg1) {
        class104.method783(field536, 0, arg0);
        if (arg1 < 10) {
            return field536;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field532.method1226();
        this.field538.method1226();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field543 != null) {
            this.field543.method1226();
            this.field541.method1226();
            var5 = (int) ((double) (this.field543.field3065 - this.field543.field3066) * 32.768D / var3);
            var6 = (int) ((double) this.field543.field3066 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field540 != null) {
            this.field540.method1226();
            this.field542.method1226();
            var8 = (int) ((double) (this.field540.field3065 - this.field540.field3066) * 32.768D / var3);
            var9 = (int) ((double) this.field540.field3066 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field531[var11] != 0) {
                field549[var11] = 0;
                field550[var11] = (int) ((double) this.field533[var11] * var3);
                field551[var11] = (this.field531[var11] << 14) / 100;
                field552[var11] = (int) ((double) (this.field532.field3065 - this.field532.field3066) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field535[var11]) / var3);
                field548[var11] = (int) ((double) this.field532.field3066 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field532.method1227(arg0);
            int var40 = this.field538.method1227(arg0);
            if (this.field543 != null) {
                int var41 = this.field543.method1227(arg0);
                int var42 = this.field541.method1227(arg0);
                var39 += this.method192(var7, var42, this.field543.field3067) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field540 != null) {
                int var43 = this.field540.method1227(arg0);
                int var44 = this.field542.method1227(arg0);
                var40 = var40 * ((this.method192(var10, var44, this.field540.field3067) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field531[var45] != 0) {
                    int var46 = field550[var45] + var12;
                    if (var46 < arg0) {
                        field536[var46] += this.method192(field549[var45], field551[var45] * var40 >> 15, this.field532.field3067);
                        field549[var45] += (field552[var45] * var39 >> 16) + field548[var45];
                    }
                }
            }
        }
        if (this.field539 != null) {
            this.field539.method1226();
            this.field529.method1226();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field539.method1227(arg0);
                int var18 = this.field529.method1227(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field539.field3065 - this.field539.field3066) * var17 >> 8) + this.field539.field3066;
                } else {
                    var19 = ((this.field539.field3065 - this.field539.field3066) * var18 >> 8) + this.field539.field3066;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field536[var16] = 0;
                }
            }
        }
        if (this.field530 > 0 && this.field537 > 0) {
            int var20 = (int) ((double) this.field530 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field536[var21] += field536[var21 - var20] * this.field537 / 100;
            }
        }
        if (this.field534.field181[0] > 0 || this.field534.field181[1] > 0) {
            this.field528.method1226();
            int var22 = this.field528.method1227(arg0 + 1);
            int var23 = this.field534.method59(0, (float) var22 / 65536.0F);
            int var24 = this.field534.method59(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field536[var23 + var25] * (long) class11.field187 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field536[var23 + var25 - var36 - 1] * (long) class11.field186[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field536[var25 - var37 - 1] * (long) class11.field186[1][var37] >> 16);
                    }
                    field536[var25] = var35;
                    var22 = this.field528.method1227(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field536[var23 + var25] * (long) class11.field187 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field536[var23 + var25 - var33 - 1] * (long) class11.field186[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field536[var25 - var34 - 1] * (long) class11.field186[1][var34] >> 16);
                        }
                        field536[var25] = var32;
                        var22 = this.field528.method1227(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field536[var23 + var25 - var29 - 1] * (long) class11.field186[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field536[var25 - var30 - 1] * (long) class11.field186[1][var30] >> 16);
                            }
                            field536[var25] = var28;
                            this.field528.method1227(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field534.method59(0, (float) var22 / 65536.0F);
                    var24 = this.field534.method59(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field536[var38] < -32768) {
                field536[var38] = -32768;
            }
            if (field536[var38] > 32767) {
                field536[var38] = 32767;
            }
        }
        return field536;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lwe;)V")
    public final void method194(class75 arg0) {
        this.field532 = new class172();
        this.field532.method1228(arg0);
        this.field538 = new class172();
        this.field538.method1228(arg0);
        int var2 = arg0.method558(1);
        if (var2 != 0) {
            arg0.field1380--;
            this.field543 = new class172();
            this.field543.method1228(arg0);
            this.field541 = new class172();
            this.field541.method1228(arg0);
        }
        int var3 = arg0.method558(1);
        if (var3 != 0) {
            arg0.field1380--;
            this.field540 = new class172();
            this.field540.method1228(arg0);
            this.field542 = new class172();
            this.field542.method1228(arg0);
        }
        int var4 = arg0.method558(1);
        if (var4 != 0) {
            arg0.field1380--;
            this.field539 = new class172();
            this.field539.method1228(arg0);
            this.field529 = new class172();
            this.field529.method1228(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method557(-22718);
            if (var6 == 0) {
                break;
            }
            this.field531[var5] = var6;
            this.field535[var5] = arg0.method549(-115);
            this.field533[var5] = arg0.method557(-22718);
        }
        this.field530 = arg0.method557(-22718);
        this.field537 = arg0.method557(-22718);
        this.field544 = arg0.method545((byte) 58);
        this.field547 = arg0.method545((byte) 115);
        this.field534 = new class11();
        this.field528 = new class172();
        this.field534.method58(arg0, this.field528);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field546[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field545 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field545[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field536 = new int[220500];
        field548 = new int[5];
        field549 = new int[5];
        field551 = new int[5];
        field552 = new int[5];
        field550 = new int[5];
    }
}
