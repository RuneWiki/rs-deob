import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class44 {

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public int field551 = 500;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "[I")
    private int[] field553 = new int[5];

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "[I")
    private int[] field547 = new int[5];

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public int field559 = 0;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    private int field557 = 100;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "[I")
    private int[] field552 = new int[5];

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    private int field562 = 0;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "[I")
    private static int[] field550 = new int[32768];

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "[I")
    private static int[] field555;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[I")
    private static int[] field548;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "[I")
    private static int[] field563;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "[I")
    private static int[] field565;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "[I")
    private static int[] field564;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "[I")
    private static int[] field566;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "[I")
    private static int[] field567;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Lje;")
    private class228 field558;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Lnm;")
    private class276 field543;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lnm;")
    private class276 field544;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lnm;")
    private class276 field545;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Lnm;")
    private class276 field546;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Lnm;")
    private class276 field549;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "Lnm;")
    private class276 field554;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Lnm;")
    private class276 field556;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Lnm;")
    private class276 field560;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "Lnm;")
    private class276 field561;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field550[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field555 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field555[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field548 = new int[220500];
        field563 = new int[5];
        field565 = new int[5];
        field564 = new int[5];
        field566 = new int[5];
        field567 = new int[5];
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)I", line = 10)
    private final int method291(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field555[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field550[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljg;)V", line = 39)
    public final void method292(class186 arg0) {
        this.field546 = new class276();
        this.field546.method1860(arg0);
        this.field543 = new class276();
        this.field543.method1860(arg0);
        int var2 = arg0.method1322(false);
        if (var2 != 0) {
            arg0.field3044--;
            this.field560 = new class276();
            this.field560.method1860(arg0);
            this.field549 = new class276();
            this.field549.method1860(arg0);
        }
        int var3 = arg0.method1322(false);
        if (var3 != 0) {
            arg0.field3044--;
            this.field561 = new class276();
            this.field561.method1860(arg0);
            this.field544 = new class276();
            this.field544.method1860(arg0);
        }
        int var4 = arg0.method1322(false);
        if (var4 != 0) {
            arg0.field3044--;
            this.field545 = new class276();
            this.field545.method1860(arg0);
            this.field556 = new class276();
            this.field556.method1860(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1299(-127);
            if (var6 == 0) {
                break;
            }
            this.field552[var5] = var6;
            this.field553[var5] = arg0.method1289(-1);
            this.field547[var5] = arg0.method1299(-102);
        }
        this.field562 = arg0.method1299(-101);
        this.field557 = arg0.method1299(-106);
        this.field551 = arg0.method1272((byte) -63);
        this.field559 = arg0.method1272((byte) -90);
        this.field558 = new class228();
        this.field554 = new class276();
        this.field558.method1630(arg0, this.field554);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()V", line = 103)
    public static void method293() {
        field548 = null;
        field550 = null;
        field555 = null;
        field565 = null;
        field564 = null;
        field563 = null;
        field567 = null;
        field566 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[I", line = 126)
    public final int[] method294(int arg0, int arg1) {
        class408.method2556(field548, 0, arg0);
        if (arg1 < 10) {
            return field548;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field546.method1862();
        this.field543.method1862();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field560 != null) {
            this.field560.method1862();
            this.field549.method1862();
            var5 = (int) ((double) (this.field560.field4401 - this.field560.field4402) * 32.768D / var3);
            var6 = (int) ((double) this.field560.field4402 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field561 != null) {
            this.field561.method1862();
            this.field544.method1862();
            var8 = (int) ((double) (this.field561.field4401 - this.field561.field4402) * 32.768D / var3);
            var9 = (int) ((double) this.field561.field4402 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field552[var11] != 0) {
                field565[var11] = 0;
                field564[var11] = (int) ((double) this.field547[var11] * var3);
                field563[var11] = (this.field552[var11] << 14) / 100;
                field567[var11] = (int) ((double) (this.field546.field4401 - this.field546.field4402) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field553[var11]) / var3);
                field566[var11] = (int) ((double) this.field546.field4402 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field546.method1861(arg0);
            int var40 = this.field543.method1861(arg0);
            if (this.field560 != null) {
                int var41 = this.field560.method1861(arg0);
                int var42 = this.field549.method1861(arg0);
                var39 += this.method291(var7, var42, this.field560.field4404) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field561 != null) {
                int var43 = this.field561.method1861(arg0);
                int var44 = this.field544.method1861(arg0);
                var40 = var40 * ((this.method291(var10, var44, this.field561.field4404) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field552[var45] != 0) {
                    int var46 = field564[var45] + var12;
                    if (var46 < arg0) {
                        field548[var46] += this.method291(field565[var45], field563[var45] * var40 >> 15, this.field546.field4404);
                        field565[var45] += (field567[var45] * var39 >> 16) + field566[var45];
                    }
                }
            }
        }
        if (this.field545 != null) {
            this.field545.method1862();
            this.field556.method1862();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field545.method1861(arg0);
                int var18 = this.field556.method1861(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field545.field4401 - this.field545.field4402) * var17 >> 8) + this.field545.field4402;
                } else {
                    var19 = ((this.field545.field4401 - this.field545.field4402) * var18 >> 8) + this.field545.field4402;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field548[var16] = 0;
                }
            }
        }
        if (this.field562 > 0 && this.field557 > 0) {
            int var20 = (int) ((double) this.field562 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field548[var21] += field548[var21 - var20] * this.field557 / 100;
            }
        }
        if (this.field558.field3826[0] > 0 || this.field558.field3826[1] > 0) {
            this.field554.method1862();
            int var22 = this.field554.method1861(arg0 + 1);
            int var23 = this.field558.method1626(0, (float) var22 / 65536.0F);
            int var24 = this.field558.method1626(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field548[var23 + var25] * (long) class228.field3828 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field548[var23 + var25 - var36 - 1] * (long) class228.field3822[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field548[var25 - var37 - 1] * (long) class228.field3822[1][var37] >> 16);
                    }
                    field548[var25] = var35;
                    var22 = this.field554.method1861(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field548[var23 + var25] * (long) class228.field3828 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field548[var23 + var25 - var33 - 1] * (long) class228.field3822[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field548[var25 - var34 - 1] * (long) class228.field3822[1][var34] >> 16);
                        }
                        field548[var25] = var32;
                        var22 = this.field554.method1861(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field548[var23 + var25 - var29 - 1] * (long) class228.field3822[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field548[var25 - var30 - 1] * (long) class228.field3822[1][var30] >> 16);
                            }
                            field548[var25] = var28;
                            this.field554.method1861(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field558.method1626(0, (float) var22 / 65536.0F);
                    var24 = this.field558.method1626(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field548[var38] < -32768) {
                field548[var38] = -32768;
            }
            if (field548[var38] > 32767) {
                field548[var38] = 32767;
            }
        }
        return field548;
    }
}
