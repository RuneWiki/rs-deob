import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class39 {

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public int field534 = 500;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[I")
    private int[] field536 = new int[5];

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    private int field543 = 0;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public int field540 = 0;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "[I")
    private int[] field548 = new int[5];

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "[I")
    private int[] field542 = new int[5];

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    private int field532 = 100;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "[I")
    private static int[] field537 = new int[32768];

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "[I")
    private static int[] field538;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "[I")
    private static int[] field535;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "[I")
    private static int[] field549;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "[I")
    private static int[] field545;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "[I")
    private static int[] field555;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "[I")
    private static int[] field544;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "[I")
    private static int[] field556;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Lsr;")
    private class323 field533;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Lsr;")
    private class323 field539;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Lsr;")
    private class323 field541;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Lsr;")
    private class323 field546;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Lsr;")
    private class323 field547;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Lsr;")
    private class323 field550;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "Lsr;")
    private class323 field551;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Lsr;")
    private class323 field553;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "Lsr;")
    private class323 field554;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Lka;")
    private class437 field552;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I")
    public final int[] method298(int arg0, int arg1) {
        class149.method1013(field535, 0, arg0);
        if (arg1 < 10) {
            return field535;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field554.method1994();
        this.field546.method1994();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field533 != null) {
            this.field533.method1994();
            this.field553.method1994();
            var5 = (int) ((double) (this.field533.field4853 - this.field533.field4854) * 32.768D / var3);
            var6 = (int) ((double) this.field533.field4854 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field539 != null) {
            this.field539.method1994();
            this.field547.method1994();
            var8 = (int) ((double) (this.field539.field4853 - this.field539.field4854) * 32.768D / var3);
            var9 = (int) ((double) this.field539.field4854 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field536[var11] != 0) {
                field555[var11] = 0;
                field549[var11] = (int) ((double) this.field548[var11] * var3);
                field545[var11] = (this.field536[var11] << 14) / 100;
                field556[var11] = (int) ((double) (this.field554.field4853 - this.field554.field4854) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field542[var11]) / var3);
                field544[var11] = (int) ((double) this.field554.field4854 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field554.method1991(arg0);
            int var40 = this.field546.method1991(arg0);
            if (this.field533 != null) {
                int var41 = this.field533.method1991(arg0);
                int var42 = this.field553.method1991(arg0);
                var39 += this.method299(var7, var42, this.field533.field4852) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field539 != null) {
                int var43 = this.field539.method1991(arg0);
                int var44 = this.field547.method1991(arg0);
                var40 = var40 * ((this.method299(var10, var44, this.field539.field4852) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field536[var45] != 0) {
                    int var46 = field549[var45] + var12;
                    if (var46 < arg0) {
                        field535[var46] += this.method299(field555[var45], field545[var45] * var40 >> 15, this.field554.field4852);
                        field555[var45] += (field556[var45] * var39 >> 16) + field544[var45];
                    }
                }
            }
        }
        if (this.field541 != null) {
            this.field541.method1994();
            this.field551.method1994();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field541.method1991(arg0);
                int var18 = this.field551.method1991(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field541.field4853 - this.field541.field4854) * var17 >> 8) + this.field541.field4854;
                } else {
                    var19 = ((this.field541.field4853 - this.field541.field4854) * var18 >> 8) + this.field541.field4854;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field535[var16] = 0;
                }
            }
        }
        if (this.field543 > 0 && this.field532 > 0) {
            int var20 = (int) ((double) this.field543 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field535[var21] += field535[var21 - var20] * this.field532 / 100;
            }
        }
        if (this.field552.field6181[0] > 0 || this.field552.field6181[1] > 0) {
            this.field550.method1994();
            int var22 = this.field550.method1991(arg0 + 1);
            int var23 = this.field552.method2544(0, (float) var22 / 65536.0F);
            int var24 = this.field552.method2544(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field535[var23 + var25] * (long) class437.field6177 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field535[var23 + var25 - var36 - 1] * (long) class437.field6176[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field535[var25 - var37 - 1] * (long) class437.field6176[1][var37] >> 16);
                    }
                    field535[var25] = var35;
                    var22 = this.field550.method1991(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field535[var23 + var25] * (long) class437.field6177 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field535[var23 + var25 - var33 - 1] * (long) class437.field6176[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field535[var25 - var34 - 1] * (long) class437.field6176[1][var34] >> 16);
                        }
                        field535[var25] = var32;
                        var22 = this.field550.method1991(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field535[var23 + var25 - var29 - 1] * (long) class437.field6176[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field535[var25 - var30 - 1] * (long) class437.field6176[1][var30] >> 16);
                            }
                            field535[var25] = var28;
                            this.field550.method1991(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field552.method2544(0, (float) var22 / 65536.0F);
                    var24 = this.field552.method2544(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field535[var38] < -32768) {
                field535[var38] = -32768;
            }
            if (field535[var38] > 32767) {
                field535[var38] = 32767;
            }
        }
        return field535;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)I")
    private final int method299(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field538[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field537[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()V")
    public static void method300() {
        field535 = null;
        field537 = null;
        field538 = null;
        field555 = null;
        field549 = null;
        field545 = null;
        field556 = null;
        field544 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lre;)V")
    public final void method301(class446 arg0) {
        this.field554 = new class323();
        this.field554.method1993(arg0);
        this.field546 = new class323();
        this.field546.method1993(arg0);
        int var2 = arg0.method2628(49152);
        if (var2 != 0) {
            arg0.field6315--;
            this.field533 = new class323();
            this.field533.method1993(arg0);
            this.field553 = new class323();
            this.field553.method1993(arg0);
        }
        int var3 = arg0.method2628(49152);
        if (var3 != 0) {
            arg0.field6315--;
            this.field539 = new class323();
            this.field539.method1993(arg0);
            this.field547 = new class323();
            this.field547.method1993(arg0);
        }
        int var4 = arg0.method2628(49152);
        if (var4 != 0) {
            arg0.field6315--;
            this.field541 = new class323();
            this.field541.method1993(arg0);
            this.field551 = new class323();
            this.field551.method1993(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2635(12);
            if (var6 == 0) {
                break;
            }
            this.field536[var5] = var6;
            this.field542[var5] = arg0.method2590(101);
            this.field548[var5] = arg0.method2635(80);
        }
        this.field543 = arg0.method2635(32);
        this.field532 = arg0.method2635(81);
        this.field534 = arg0.method2631(2530);
        this.field540 = arg0.method2631(2530);
        this.field552 = new class437();
        this.field550 = new class323();
        this.field552.method2547(arg0, this.field550);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field537[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field538 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field538[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field535 = new int[220500];
        field549 = new int[5];
        field545 = new int[5];
        field555 = new int[5];
        field544 = new int[5];
        field556 = new int[5];
    }
}
