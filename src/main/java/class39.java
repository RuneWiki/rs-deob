import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class39 {

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    private int field597 = 0;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
    private int[] field600 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public int field595 = 0;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "[I")
    private int[] field599 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "[I")
    private int[] field590 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    private int field614 = 100;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public int field593 = 500;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[I")
    private static int[] field596 = new int[32768];

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "[I")
    private static int[] field606;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "[I")
    private static int[] field605;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "[I")
    private static int[] field609;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "[I")
    private static int[] field611;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "[I")
    private static int[] field613;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "[I")
    private static int[] field610;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[I")
    private static int[] field612;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lnb;")
    private class302 field598;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lv;")
    private class66 field591;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lv;")
    private class66 field592;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Lv;")
    private class66 field594;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Lv;")
    private class66 field601;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lv;")
    private class66 field602;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lv;")
    private class66 field603;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Lv;")
    private class66 field604;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lv;")
    private class66 field607;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lv;")
    private class66 field608;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I", line = 4)
    private final int method229(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field606[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field596[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V", line = 26)
    public static void method230() {
        field605 = null;
        field596 = null;
        field606 = null;
        field609 = null;
        field613 = null;
        field610 = null;
        field612 = null;
        field611 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lpb;)V", line = 43)
    public final void method231(class70 arg0) {
        this.field604 = new class66();
        this.field604.method405(arg0);
        this.field591 = new class66();
        this.field591.method405(arg0);
        int var2 = arg0.method481(0);
        if (var2 != 0) {
            arg0.field1068--;
            this.field603 = new class66();
            this.field603.method405(arg0);
            this.field607 = new class66();
            this.field607.method405(arg0);
        }
        int var3 = arg0.method481(0);
        if (var3 != 0) {
            arg0.field1068--;
            this.field601 = new class66();
            this.field601.method405(arg0);
            this.field608 = new class66();
            this.field608.method405(arg0);
        }
        int var4 = arg0.method481(0);
        if (var4 != 0) {
            arg0.field1068--;
            this.field592 = new class66();
            this.field592.method405(arg0);
            this.field602 = new class66();
            this.field602.method405(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method486((byte) 104);
            if (var6 == 0) {
                break;
            }
            this.field600[var5] = var6;
            this.field599[var5] = arg0.method448(false);
            this.field590[var5] = arg0.method486((byte) 104);
        }
        this.field597 = arg0.method486((byte) 92);
        this.field614 = arg0.method486((byte) 116);
        this.field593 = arg0.method423(255);
        this.field595 = arg0.method423(255);
        this.field598 = new class302();
        this.field594 = new class66();
        this.field598.method2107(arg0, this.field594);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[I", line = 123)
    public final int[] method232(int arg0, int arg1) {
        class36.method214(field605, 0, arg0);
        if (arg1 < 10) {
            return field605;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field604.method403();
        this.field591.method403();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field603 != null) {
            this.field603.method403();
            this.field607.method403();
            var5 = (int) ((double) (this.field603.field984 - this.field603.field983) * 32.768D / var3);
            var6 = (int) ((double) this.field603.field983 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field601 != null) {
            this.field601.method403();
            this.field608.method403();
            var8 = (int) ((double) (this.field601.field984 - this.field601.field983) * 32.768D / var3);
            var9 = (int) ((double) this.field601.field983 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field600[var11] != 0) {
                field609[var11] = 0;
                field613[var11] = (int) ((double) this.field590[var11] * var3);
                field610[var11] = (this.field600[var11] << 14) / 100;
                field612[var11] = (int) ((double) (this.field604.field984 - this.field604.field983) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field599[var11]) / var3);
                field611[var11] = (int) ((double) this.field604.field983 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field604.method406(arg0);
            int var14 = this.field591.method406(arg0);
            if (this.field603 != null) {
                int var15 = this.field603.method406(arg0);
                int var16 = this.field607.method406(arg0);
                var13 += this.method229(var7, var16, this.field603.field981) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field601 != null) {
                int var17 = this.field601.method406(arg0);
                int var18 = this.field608.method406(arg0);
                var14 = var14 * ((this.method229(var10, var18, this.field601.field981) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field600[var19] != 0) {
                    int var20 = field613[var19] + var12;
                    if (var20 < arg0) {
                        field605[var20] += this.method229(field609[var19], field610[var19] * var14 >> 15, this.field604.field981);
                        field609[var19] += (field612[var19] * var13 >> 16) + field611[var19];
                    }
                }
            }
        }
        if (this.field592 != null) {
            this.field592.method403();
            this.field602.method403();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field592.method406(arg0);
                int var26 = this.field602.method406(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field592.field984 - this.field592.field983) * var25 >> 8) + this.field592.field983;
                } else {
                    var27 = ((this.field592.field984 - this.field592.field983) * var26 >> 8) + this.field592.field983;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field605[var24] = 0;
                }
            }
        }
        if (this.field597 > 0 && this.field614 > 0) {
            int var28 = (int) ((double) this.field597 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field605[var29] += field605[var29 - var28] * this.field614 / 100;
            }
        }
        if (this.field598.field5187[0] > 0 || this.field598.field5187[1] > 0) {
            this.field594.method403();
            int var30 = this.field594.method406(arg0 + 1);
            int var31 = this.field598.method2106(0, (float) var30 / 65536.0F);
            int var32 = this.field598.method2106(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field605[var31 + var33] * (long) class302.field5182 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field605[var31 + var33 - var36 - 1] * (long) class302.field5186[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field605[var33 - var37 - 1] * (long) class302.field5186[1][var37] >> 16);
                    }
                    field605[var33] = var35;
                    var30 = this.field594.method406(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field605[var31 + var33] * (long) class302.field5182 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field605[var31 + var33 - var40 - 1] * (long) class302.field5186[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field605[var33 - var41 - 1] * (long) class302.field5186[1][var41] >> 16);
                        }
                        field605[var33] = var39;
                        var30 = this.field594.method406(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field605[var31 + var33 - var43 - 1] * (long) class302.field5186[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field605[var33 - var44 - 1] * (long) class302.field5186[1][var44] >> 16);
                            }
                            field605[var33] = var42;
                            this.field594.method406(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field598.method2106(0, (float) var30 / 65536.0F);
                    var32 = this.field598.method2106(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field605[var46] < -32768) {
                field605[var46] = -32768;
            }
            if (field605[var46] > 32767) {
                field605[var46] = 32767;
            }
        }
        return field605;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field596[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field606 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field606[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field605 = new int[220500];
        field609 = new int[5];
        field611 = new int[5];
        field613 = new int[5];
        field610 = new int[5];
        field612 = new int[5];
    }
}
