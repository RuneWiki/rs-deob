import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class294 {

    @OriginalMember(owner = "client!e", name = "b", descriptor = "[I")
    private int[] field4453 = new int[5];

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    private int field4461 = 100;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public int field4459 = 0;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    private int field4458 = 0;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "[I")
    private int[] field4468 = new int[5];

    @OriginalMember(owner = "client!e", name = "n", descriptor = "[I")
    private int[] field4465 = new int[5];

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public int field4469 = 500;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "[I")
    private static int[] field4456 = new int[32768];

    @OriginalMember(owner = "client!e", name = "p", descriptor = "[I")
    private static int[] field4467;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "[I")
    private static int[] field4471;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "[I")
    private static int[] field4474;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "[I")
    private static int[] field4472;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "[I")
    private static int[] field4475;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "[I")
    private static int[] field4473;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "[I")
    private static int[] field4476;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Lfa;")
    private class255 field4454;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lfa;")
    private class255 field4455;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lfa;")
    private class255 field4457;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lfa;")
    private class255 field4460;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lfa;")
    private class255 field4462;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lfa;")
    private class255 field4463;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Lfa;")
    private class255 field4464;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lfa;")
    private class255 field4466;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lfa;")
    private class255 field4470;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Lrj;")
    private class290 field4452;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[I")
    public final int[] method1937(int arg0, int arg1) {
        class41.method337(field4471, 0, arg0);
        if (arg1 < 10) {
            return field4471;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4466.method1730();
        this.field4464.method1730();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4454 != null) {
            this.field4454.method1730();
            this.field4457.method1730();
            var5 = (int) ((double) (this.field4454.field3929 - this.field4454.field3926) * 32.768D / var3);
            var6 = (int) ((double) this.field4454.field3926 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4455 != null) {
            this.field4455.method1730();
            this.field4462.method1730();
            var8 = (int) ((double) (this.field4455.field3929 - this.field4455.field3926) * 32.768D / var3);
            var9 = (int) ((double) this.field4455.field3926 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4465[var11] != 0) {
                field4473[var11] = 0;
                field4475[var11] = (int) ((double) this.field4453[var11] * var3);
                field4472[var11] = (this.field4465[var11] << 14) / 100;
                field4476[var11] = (int) ((double) (this.field4466.field3929 - this.field4466.field3926) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4468[var11]) / var3);
                field4474[var11] = (int) ((double) this.field4466.field3926 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4466.method1729(arg0);
            int var40 = this.field4464.method1729(arg0);
            if (this.field4454 != null) {
                int var41 = this.field4454.method1729(arg0);
                int var42 = this.field4457.method1729(arg0);
                var39 += this.method1940(var7, var42, this.field4454.field3928) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4455 != null) {
                int var43 = this.field4455.method1729(arg0);
                int var44 = this.field4462.method1729(arg0);
                var40 = var40 * ((this.method1940(var10, var44, this.field4455.field3928) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4465[var45] != 0) {
                    int var46 = field4475[var45] + var12;
                    if (var46 < arg0) {
                        field4471[var46] += this.method1940(field4473[var45], field4472[var45] * var40 >> 15, this.field4466.field3928);
                        field4473[var45] += (field4476[var45] * var39 >> 16) + field4474[var45];
                    }
                }
            }
        }
        if (this.field4460 != null) {
            this.field4460.method1730();
            this.field4463.method1730();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4460.method1729(arg0);
                int var18 = this.field4463.method1729(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4460.field3929 - this.field4460.field3926) * var17 >> 8) + this.field4460.field3926;
                } else {
                    var19 = ((this.field4460.field3929 - this.field4460.field3926) * var18 >> 8) + this.field4460.field3926;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4471[var16] = 0;
                }
            }
        }
        if (this.field4458 > 0 && this.field4461 > 0) {
            int var20 = (int) ((double) this.field4458 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4471[var21] += field4471[var21 - var20] * this.field4461 / 100;
            }
        }
        if (this.field4452.field4401[0] > 0 || this.field4452.field4401[1] > 0) {
            this.field4470.method1730();
            int var22 = this.field4470.method1729(arg0 + 1);
            int var23 = this.field4452.method1922(0, (float) var22 / 65536.0F);
            int var24 = this.field4452.method1922(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4471[var23 + var25] * (long) class290.field4400 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4471[var23 + var25 - var36 - 1] * (long) class290.field4403[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4471[var25 - var37 - 1] * (long) class290.field4403[1][var37] >> 16);
                    }
                    field4471[var25] = var35;
                    var22 = this.field4470.method1729(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4471[var23 + var25] * (long) class290.field4400 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4471[var23 + var25 - var33 - 1] * (long) class290.field4403[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4471[var25 - var34 - 1] * (long) class290.field4403[1][var34] >> 16);
                        }
                        field4471[var25] = var32;
                        var22 = this.field4470.method1729(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4471[var23 + var25 - var29 - 1] * (long) class290.field4403[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4471[var25 - var30 - 1] * (long) class290.field4403[1][var30] >> 16);
                            }
                            field4471[var25] = var28;
                            this.field4470.method1729(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4452.method1922(0, (float) var22 / 65536.0F);
                    var24 = this.field4452.method1922(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4471[var38] < -32768) {
                field4471[var38] = -32768;
            }
            if (field4471[var38] > 32767) {
                field4471[var38] = 32767;
            }
        }
        return field4471;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
    public static void method1938() {
        field4471 = null;
        field4456 = null;
        field4467 = null;
        field4473 = null;
        field4475 = null;
        field4472 = null;
        field4476 = null;
        field4474 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lca;)V")
    public final void method1939(class54 arg0) {
        this.field4466 = new class255();
        this.field4466.method1731(arg0);
        this.field4464 = new class255();
        this.field4464.method1731(arg0);
        int var2 = arg0.method407(255);
        if (var2 != 0) {
            arg0.field887--;
            this.field4454 = new class255();
            this.field4454.method1731(arg0);
            this.field4457 = new class255();
            this.field4457.method1731(arg0);
        }
        int var3 = arg0.method407(255);
        if (var3 != 0) {
            arg0.field887--;
            this.field4455 = new class255();
            this.field4455.method1731(arg0);
            this.field4462 = new class255();
            this.field4462.method1731(arg0);
        }
        int var4 = arg0.method407(255);
        if (var4 != 0) {
            arg0.field887--;
            this.field4460 = new class255();
            this.field4460.method1731(arg0);
            this.field4463 = new class255();
            this.field4463.method1731(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method436(127);
            if (var6 == 0) {
                break;
            }
            this.field4465[var5] = var6;
            this.field4468[var5] = arg0.method451(-25621);
            this.field4453[var5] = arg0.method436(126);
        }
        this.field4458 = arg0.method436(127);
        this.field4461 = arg0.method436(126);
        this.field4469 = arg0.method423(52);
        this.field4459 = arg0.method423(117);
        this.field4452 = new class290();
        this.field4470 = new class255();
        this.field4452.method1927(arg0, this.field4470);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)I")
    private final int method1940(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4467[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4456[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4456[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4467 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4467[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4471 = new int[220500];
        field4474 = new int[5];
        field4472 = new int[5];
        field4475 = new int[5];
        field4473 = new int[5];
        field4476 = new int[5];
    }
}
