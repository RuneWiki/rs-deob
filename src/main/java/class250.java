import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class250 {

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    private int field4379 = 0;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "[I")
    private int[] field4377 = new int[5];

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public int field4381 = 500;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    private int field4383 = 100;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "[I")
    private int[] field4390 = new int[5];

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public int field4387 = 0;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "[I")
    private int[] field4391 = new int[5];

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "[I")
    private static int[] field4385 = new int[32768];

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "[I")
    private static int[] field4380;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "[I")
    private static int[] field4394;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "[I")
    private static int[] field4397;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "[I")
    private static int[] field4395;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "[I")
    private static int[] field4396;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "[I")
    private static int[] field4398;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "[I")
    private static int[] field4399;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Leb;")
    private class239 field4375;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Leb;")
    private class239 field4378;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Leb;")
    private class239 field4382;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Leb;")
    private class239 field4384;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "Leb;")
    private class239 field4386;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "Leb;")
    private class239 field4388;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "Leb;")
    private class239 field4389;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "Leb;")
    private class239 field4392;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "Leb;")
    private class239 field4393;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lub;")
    private class89 field4376;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()V")
    public static void method1736() {
        field4394 = null;
        field4385 = null;
        field4380 = null;
        field4396 = null;
        field4397 = null;
        field4399 = null;
        field4395 = null;
        field4398 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)I")
    private final int method1737(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4380[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4385[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I")
    public final int[] method1738(int arg0, int arg1) {
        class209.method1423(field4394, 0, arg0);
        if (arg1 < 10) {
            return field4394;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4382.method1646();
        this.field4393.method1646();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4392 != null) {
            this.field4392.method1646();
            this.field4386.method1646();
            var5 = (int) ((double) (this.field4392.field4177 - this.field4392.field4175) * 32.768D / var3);
            var6 = (int) ((double) this.field4392.field4175 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4389 != null) {
            this.field4389.method1646();
            this.field4378.method1646();
            var8 = (int) ((double) (this.field4389.field4177 - this.field4389.field4175) * 32.768D / var3);
            var9 = (int) ((double) this.field4389.field4175 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4377[var11] != 0) {
                field4396[var11] = 0;
                field4397[var11] = (int) ((double) this.field4390[var11] * var3);
                field4399[var11] = (this.field4377[var11] << 14) / 100;
                field4395[var11] = (int) ((double) (this.field4382.field4177 - this.field4382.field4175) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4391[var11]) / var3);
                field4398[var11] = (int) ((double) this.field4382.field4175 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4382.method1649(arg0);
            int var40 = this.field4393.method1649(arg0);
            if (this.field4392 != null) {
                int var41 = this.field4392.method1649(arg0);
                int var42 = this.field4386.method1649(arg0);
                var39 += this.method1737(var7, var42, this.field4392.field4176) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4389 != null) {
                int var43 = this.field4389.method1649(arg0);
                int var44 = this.field4378.method1649(arg0);
                var40 = var40 * ((this.method1737(var10, var44, this.field4389.field4176) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4377[var45] != 0) {
                    int var46 = field4397[var45] + var12;
                    if (var46 < arg0) {
                        field4394[var46] += this.method1737(field4396[var45], field4399[var45] * var40 >> 15, this.field4382.field4176);
                        field4396[var45] += (field4395[var45] * var39 >> 16) + field4398[var45];
                    }
                }
            }
        }
        if (this.field4384 != null) {
            this.field4384.method1646();
            this.field4375.method1646();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4384.method1649(arg0);
                int var18 = this.field4375.method1649(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4384.field4177 - this.field4384.field4175) * var17 >> 8) + this.field4384.field4175;
                } else {
                    var19 = ((this.field4384.field4177 - this.field4384.field4175) * var18 >> 8) + this.field4384.field4175;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4394[var16] = 0;
                }
            }
        }
        if (this.field4379 > 0 && this.field4383 > 0) {
            int var20 = (int) ((double) this.field4379 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4394[var21] += field4394[var21 - var20] * this.field4383 / 100;
            }
        }
        if (this.field4376.field1601[0] > 0 || this.field4376.field1601[1] > 0) {
            this.field4388.method1646();
            int var22 = this.field4388.method1649(arg0 + 1);
            int var23 = this.field4376.method654(0, (float) var22 / 65536.0F);
            int var24 = this.field4376.method654(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4394[var23 + var25] * (long) class89.field1595 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4394[var23 + var25 - var36 - 1] * (long) class89.field1594[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4394[var25 - var37 - 1] * (long) class89.field1594[1][var37] >> 16);
                    }
                    field4394[var25] = var35;
                    var22 = this.field4388.method1649(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4394[var23 + var25] * (long) class89.field1595 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4394[var23 + var25 - var33 - 1] * (long) class89.field1594[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4394[var25 - var34 - 1] * (long) class89.field1594[1][var34] >> 16);
                        }
                        field4394[var25] = var32;
                        var22 = this.field4388.method1649(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4394[var23 + var25 - var29 - 1] * (long) class89.field1594[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4394[var25 - var30 - 1] * (long) class89.field1594[1][var30] >> 16);
                            }
                            field4394[var25] = var28;
                            this.field4388.method1649(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4376.method654(0, (float) var22 / 65536.0F);
                    var24 = this.field4376.method654(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4394[var38] < -32768) {
                field4394[var38] = -32768;
            }
            if (field4394[var38] > 32767) {
                field4394[var38] = 32767;
            }
        }
        return field4394;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lgd;)V")
    public final void method1739(class74 arg0) {
        this.field4382 = new class239();
        this.field4382.method1647(arg0);
        this.field4393 = new class239();
        this.field4393.method1647(arg0);
        int var2 = arg0.method489((byte) 111);
        if (var2 != 0) {
            arg0.field1340--;
            this.field4392 = new class239();
            this.field4392.method1647(arg0);
            this.field4386 = new class239();
            this.field4386.method1647(arg0);
        }
        int var3 = arg0.method489((byte) -14);
        if (var3 != 0) {
            arg0.field1340--;
            this.field4389 = new class239();
            this.field4389.method1647(arg0);
            this.field4378 = new class239();
            this.field4378.method1647(arg0);
        }
        int var4 = arg0.method489((byte) 103);
        if (var4 != 0) {
            arg0.field1340--;
            this.field4384 = new class239();
            this.field4384.method1647(arg0);
            this.field4375 = new class239();
            this.field4375.method1647(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method512(-96);
            if (var6 == 0) {
                break;
            }
            this.field4377[var5] = var6;
            this.field4391[var5] = arg0.method486(-15839);
            this.field4390[var5] = arg0.method512(-83);
        }
        this.field4379 = arg0.method512(-92);
        this.field4383 = arg0.method512(-70);
        this.field4381 = arg0.method485(-2386);
        this.field4387 = arg0.method485(-2386);
        this.field4376 = new class89();
        this.field4388 = new class239();
        this.field4376.method655(arg0, this.field4388);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4385[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4380 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4380[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4394 = new int[220500];
        field4397 = new int[5];
        field4395 = new int[5];
        field4396 = new int[5];
        field4398 = new int[5];
        field4399 = new int[5];
    }
}
