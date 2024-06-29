import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class239 {

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[I")
    private int[] field3441 = new int[5];

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    private int field3440 = 100;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "[I")
    private int[] field3452 = new int[5];

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    private int field3443 = 0;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "[I")
    private int[] field3453 = new int[5];

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public int field3445 = 500;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public int field3458 = 0;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "[I")
    private static int[] field3457 = new int[32768];

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "[I")
    private static int[] field3450;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "[I")
    private static int[] field3459;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "[I")
    private static int[] field3463;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "[I")
    private static int[] field3461;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "[I")
    private static int[] field3462;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "[I")
    private static int[] field3460;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "[I")
    private static int[] field3464;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Lnl;")
    private class242 field3454;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lia;")
    private class83 field3442;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Lia;")
    private class83 field3444;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lia;")
    private class83 field3446;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lia;")
    private class83 field3447;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Lia;")
    private class83 field3448;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Lia;")
    private class83 field3449;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lia;")
    private class83 field3451;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Lia;")
    private class83 field3455;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "Lia;")
    private class83 field3456;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lqi;)V")
    public final void method1552(class216 arg0) {
        this.field3451 = new class83();
        this.field3451.method497(arg0);
        this.field3449 = new class83();
        this.field3449.method497(arg0);
        int var2 = arg0.method1407(127);
        if (var2 != 0) {
            arg0.field3021--;
            this.field3448 = new class83();
            this.field3448.method497(arg0);
            this.field3446 = new class83();
            this.field3446.method497(arg0);
        }
        int var3 = arg0.method1407(114);
        if (var3 != 0) {
            arg0.field3021--;
            this.field3444 = new class83();
            this.field3444.method497(arg0);
            this.field3447 = new class83();
            this.field3447.method497(arg0);
        }
        int var4 = arg0.method1407(105);
        if (var4 != 0) {
            arg0.field3021--;
            this.field3455 = new class83();
            this.field3455.method497(arg0);
            this.field3442 = new class83();
            this.field3442.method497(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1378((byte) -121);
            if (var6 == 0) {
                break;
            }
            this.field3453[var5] = var6;
            this.field3441[var5] = arg0.method1408(false);
            this.field3452[var5] = arg0.method1378((byte) -109);
        }
        this.field3443 = arg0.method1378((byte) -128);
        this.field3440 = arg0.method1378((byte) -112);
        this.field3445 = arg0.method1380(true);
        this.field3458 = arg0.method1380(true);
        this.field3454 = new class242();
        this.field3456 = new class83();
        this.field3454.method1575(arg0, this.field3456);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)[I")
    public final int[] method1553(int arg0, int arg1) {
        class194.method1258(field3459, 0, arg0);
        if (arg1 < 10) {
            return field3459;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3451.method500();
        this.field3449.method500();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3448 != null) {
            this.field3448.method500();
            this.field3446.method500();
            var5 = (int) ((double) (this.field3448.field1144 - this.field3448.field1143) * 32.768D / var3);
            var6 = (int) ((double) this.field3448.field1143 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3444 != null) {
            this.field3444.method500();
            this.field3447.method500();
            var8 = (int) ((double) (this.field3444.field1144 - this.field3444.field1143) * 32.768D / var3);
            var9 = (int) ((double) this.field3444.field1143 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3453[var11] != 0) {
                field3463[var11] = 0;
                field3460[var11] = (int) ((double) this.field3452[var11] * var3);
                field3462[var11] = (this.field3453[var11] << 14) / 100;
                field3464[var11] = (int) ((double) (this.field3451.field1144 - this.field3451.field1143) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3441[var11]) / var3);
                field3461[var11] = (int) ((double) this.field3451.field1143 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3451.method499(arg0);
            int var40 = this.field3449.method499(arg0);
            if (this.field3448 != null) {
                int var41 = this.field3448.method499(arg0);
                int var42 = this.field3446.method499(arg0);
                var39 += this.method1555(var7, var42, this.field3448.field1146) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3444 != null) {
                int var43 = this.field3444.method499(arg0);
                int var44 = this.field3447.method499(arg0);
                var40 = var40 * ((this.method1555(var10, var44, this.field3444.field1146) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3453[var45] != 0) {
                    int var46 = field3460[var45] + var12;
                    if (var46 < arg0) {
                        field3459[var46] += this.method1555(field3463[var45], field3462[var45] * var40 >> 15, this.field3451.field1146);
                        field3463[var45] += (field3464[var45] * var39 >> 16) + field3461[var45];
                    }
                }
            }
        }
        if (this.field3455 != null) {
            this.field3455.method500();
            this.field3442.method500();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3455.method499(arg0);
                int var18 = this.field3442.method499(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3455.field1144 - this.field3455.field1143) * var17 >> 8) + this.field3455.field1143;
                } else {
                    var19 = ((this.field3455.field1144 - this.field3455.field1143) * var18 >> 8) + this.field3455.field1143;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3459[var16] = 0;
                }
            }
        }
        if (this.field3443 > 0 && this.field3440 > 0) {
            int var20 = (int) ((double) this.field3443 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3459[var21] += field3459[var21 - var20] * this.field3440 / 100;
            }
        }
        if (this.field3454.field3517[0] > 0 || this.field3454.field3517[1] > 0) {
            this.field3456.method500();
            int var22 = this.field3456.method499(arg0 + 1);
            int var23 = this.field3454.method1578(0, (float) var22 / 65536.0F);
            int var24 = this.field3454.method1578(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3459[var23 + var25] * (long) class242.field3523 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3459[var23 + var25 - var36 - 1] * (long) class242.field3518[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3459[var25 - var37 - 1] * (long) class242.field3518[1][var37] >> 16);
                    }
                    field3459[var25] = var35;
                    var22 = this.field3456.method499(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3459[var23 + var25] * (long) class242.field3523 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3459[var23 + var25 - var33 - 1] * (long) class242.field3518[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3459[var25 - var34 - 1] * (long) class242.field3518[1][var34] >> 16);
                        }
                        field3459[var25] = var32;
                        var22 = this.field3456.method499(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3459[var23 + var25 - var29 - 1] * (long) class242.field3518[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3459[var25 - var30 - 1] * (long) class242.field3518[1][var30] >> 16);
                            }
                            field3459[var25] = var28;
                            this.field3456.method499(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3454.method1578(0, (float) var22 / 65536.0F);
                    var24 = this.field3454.method1578(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3459[var38] < -32768) {
                field3459[var38] = -32768;
            }
            if (field3459[var38] > 32767) {
                field3459[var38] = 32767;
            }
        }
        return field3459;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V")
    public static void method1554() {
        field3459 = null;
        field3457 = null;
        field3450 = null;
        field3463 = null;
        field3460 = null;
        field3462 = null;
        field3464 = null;
        field3461 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)I")
    private final int method1555(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3450[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3457[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3457[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3450 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3450[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3459 = new int[220500];
        field3463 = new int[5];
        field3461 = new int[5];
        field3462 = new int[5];
        field3460 = new int[5];
        field3464 = new int[5];
    }
}
