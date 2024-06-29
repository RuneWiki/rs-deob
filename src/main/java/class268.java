import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class268 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    private int field3598 = 100;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public int field3600 = 500;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public int field3613 = 0;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    private int field3602 = 0;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[I")
    private int[] field3607 = new int[5];

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "[I")
    private int[] field3621 = new int[5];

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[I")
    private int[] field3605 = new int[5];

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "[I")
    private static int[] field3609 = new int[32768];

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "[I")
    private static int[] field3611;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[I")
    private static int[] field3599;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "[I")
    private static int[] field3617;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "[I")
    private static int[] field3622;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "[I")
    private static int[] field3618;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "[I")
    private static int[] field3620;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "[I")
    private static int[] field3619;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lph;")
    private class362 field3601;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Lpv;")
    private class46 field3603;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lpv;")
    private class46 field3604;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Lpv;")
    private class46 field3606;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Lpv;")
    private class46 field3608;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "Lpv;")
    private class46 field3610;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "Lpv;")
    private class46 field3612;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "Lpv;")
    private class46 field3614;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "Lpv;")
    private class46 field3615;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Lpv;")
    private class46 field3616;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
    public static void method1576() {
        field3599 = null;
        field3609 = null;
        field3611 = null;
        field3622 = null;
        field3620 = null;
        field3619 = null;
        field3618 = null;
        field3617 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lsv;)V")
    public final void method1577(class319 arg0) {
        this.field3612 = new class46();
        this.field3612.method307(arg0);
        this.field3608 = new class46();
        this.field3608.method307(arg0);
        int var2 = arg0.method1869(-89);
        if (var2 != 0) {
            arg0.field4360--;
            this.field3603 = new class46();
            this.field3603.method307(arg0);
            this.field3614 = new class46();
            this.field3614.method307(arg0);
        }
        int var3 = arg0.method1869(-121);
        if (var3 != 0) {
            arg0.field4360--;
            this.field3610 = new class46();
            this.field3610.method307(arg0);
            this.field3604 = new class46();
            this.field3604.method307(arg0);
        }
        int var4 = arg0.method1869(-67);
        if (var4 != 0) {
            arg0.field4360--;
            this.field3606 = new class46();
            this.field3606.method307(arg0);
            this.field3616 = new class46();
            this.field3616.method307(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1877(-2);
            if (var6 == 0) {
                break;
            }
            this.field3621[var5] = var6;
            this.field3605[var5] = arg0.method1870(1);
            this.field3607[var5] = arg0.method1877(-63);
        }
        this.field3602 = arg0.method1877(21);
        this.field3598 = arg0.method1877(-51);
        this.field3600 = arg0.method1844(-103);
        this.field3613 = arg0.method1844(-118);
        this.field3601 = new class362();
        this.field3615 = new class46();
        this.field3601.method2164(arg0, this.field3615);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[I")
    public final int[] method1578(int arg0, int arg1) {
        class57.method375(field3599, 0, arg0);
        if (arg1 < 10) {
            return field3599;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3612.method305();
        this.field3608.method305();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3603 != null) {
            this.field3603.method305();
            this.field3614.method305();
            var5 = (int) ((double) (this.field3603.field645 - this.field3603.field647) * 32.768D / var3);
            var6 = (int) ((double) this.field3603.field647 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3610 != null) {
            this.field3610.method305();
            this.field3604.method305();
            var8 = (int) ((double) (this.field3610.field645 - this.field3610.field647) * 32.768D / var3);
            var9 = (int) ((double) this.field3610.field647 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3621[var11] != 0) {
                field3622[var11] = 0;
                field3620[var11] = (int) ((double) this.field3607[var11] * var3);
                field3619[var11] = (this.field3621[var11] << 14) / 100;
                field3618[var11] = (int) ((double) (this.field3612.field645 - this.field3612.field647) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3605[var11]) / var3);
                field3617[var11] = (int) ((double) this.field3612.field647 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3612.method304(arg0);
            int var40 = this.field3608.method304(arg0);
            if (this.field3603 != null) {
                int var41 = this.field3603.method304(arg0);
                int var42 = this.field3614.method304(arg0);
                var39 += this.method1579(var7, var42, this.field3603.field644) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3610 != null) {
                int var43 = this.field3610.method304(arg0);
                int var44 = this.field3604.method304(arg0);
                var40 = var40 * ((this.method1579(var10, var44, this.field3610.field644) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3621[var45] != 0) {
                    int var46 = field3620[var45] + var12;
                    if (var46 < arg0) {
                        field3599[var46] += this.method1579(field3622[var45], field3619[var45] * var40 >> 15, this.field3612.field644);
                        field3622[var45] += (field3618[var45] * var39 >> 16) + field3617[var45];
                    }
                }
            }
        }
        if (this.field3606 != null) {
            this.field3606.method305();
            this.field3616.method305();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3606.method304(arg0);
                int var18 = this.field3616.method304(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3606.field645 - this.field3606.field647) * var17 >> 8) + this.field3606.field647;
                } else {
                    var19 = ((this.field3606.field645 - this.field3606.field647) * var18 >> 8) + this.field3606.field647;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3599[var16] = 0;
                }
            }
        }
        if (this.field3602 > 0 && this.field3598 > 0) {
            int var20 = (int) ((double) this.field3602 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3599[var21] += field3599[var21 - var20] * this.field3598 / 100;
            }
        }
        if (this.field3601.field5197[0] > 0 || this.field3601.field5197[1] > 0) {
            this.field3615.method305();
            int var22 = this.field3615.method304(arg0 + 1);
            int var23 = this.field3601.method2162(0, (float) var22 / 65536.0F);
            int var24 = this.field3601.method2162(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3599[var23 + var25] * (long) class362.field5196 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3599[var23 + var25 - var36 - 1] * (long) class362.field5194[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3599[var25 - var37 - 1] * (long) class362.field5194[1][var37] >> 16);
                    }
                    field3599[var25] = var35;
                    var22 = this.field3615.method304(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3599[var23 + var25] * (long) class362.field5196 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3599[var23 + var25 - var33 - 1] * (long) class362.field5194[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3599[var25 - var34 - 1] * (long) class362.field5194[1][var34] >> 16);
                        }
                        field3599[var25] = var32;
                        var22 = this.field3615.method304(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3599[var23 + var25 - var29 - 1] * (long) class362.field5194[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3599[var25 - var30 - 1] * (long) class362.field5194[1][var30] >> 16);
                            }
                            field3599[var25] = var28;
                            this.field3615.method304(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3601.method2162(0, (float) var22 / 65536.0F);
                    var24 = this.field3601.method2162(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3599[var38] < -32768) {
                field3599[var38] = -32768;
            }
            if (field3599[var38] > 32767) {
                field3599[var38] = 32767;
            }
        }
        return field3599;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I")
    private final int method1579(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3611[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3609[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3609[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3611 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3611[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3599 = new int[220500];
        field3617 = new int[5];
        field3622 = new int[5];
        field3618 = new int[5];
        field3620 = new int[5];
        field3619 = new int[5];
    }
}
