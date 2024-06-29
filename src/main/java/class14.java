import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HJHNNPSW")
public class class14 {

    @OriginalMember(owner = "client!HJHNNPSW", name = "c", descriptor = "Z")
    private boolean field705 = true;

    @OriginalMember(owner = "client!HJHNNPSW", name = "l", descriptor = "[I")
    private int[] field714 = new int[5];

    @OriginalMember(owner = "client!HJHNNPSW", name = "m", descriptor = "[I")
    private int[] field715 = new int[5];

    @OriginalMember(owner = "client!HJHNNPSW", name = "n", descriptor = "[I")
    private int[] field716 = new int[5];

    @OriginalMember(owner = "client!HJHNNPSW", name = "p", descriptor = "I")
    private int field718 = 100;

    @OriginalMember(owner = "client!HJHNNPSW", name = "s", descriptor = "I")
    public int field721 = 500;

    @OriginalMember(owner = "client!HJHNNPSW", name = "a", descriptor = "B")
    private static byte field703 = 52;

    @OriginalMember(owner = "client!HJHNNPSW", name = "b", descriptor = "I")
    private static int field704 = 245;

    @OriginalMember(owner = "client!HJHNNPSW", name = "x", descriptor = "[I")
    private static int[] field726 = new int[5];

    @OriginalMember(owner = "client!HJHNNPSW", name = "y", descriptor = "[I")
    private static int[] field727 = new int[5];

    @OriginalMember(owner = "client!HJHNNPSW", name = "z", descriptor = "[I")
    private static int[] field728 = new int[5];

    @OriginalMember(owner = "client!HJHNNPSW", name = "A", descriptor = "[I")
    private static int[] field729 = new int[5];

    @OriginalMember(owner = "client!HJHNNPSW", name = "B", descriptor = "[I")
    private static int[] field730 = new int[5];

    @OriginalMember(owner = "client!HJHNNPSW", name = "o", descriptor = "I")
    private int field717;

    @OriginalMember(owner = "client!HJHNNPSW", name = "t", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!HJHNNPSW", name = "q", descriptor = "LRHVCMDPL;")
    private class49 field719;

    @OriginalMember(owner = "client!HJHNNPSW", name = "d", descriptor = "LXJHYQMBH;")
    private class70 field706;

    @OriginalMember(owner = "client!HJHNNPSW", name = "e", descriptor = "LXJHYQMBH;")
    private class70 field707;

    @OriginalMember(owner = "client!HJHNNPSW", name = "f", descriptor = "LXJHYQMBH;")
    private class70 field708;

    @OriginalMember(owner = "client!HJHNNPSW", name = "g", descriptor = "LXJHYQMBH;")
    private class70 field709;

    @OriginalMember(owner = "client!HJHNNPSW", name = "h", descriptor = "LXJHYQMBH;")
    private class70 field710;

    @OriginalMember(owner = "client!HJHNNPSW", name = "i", descriptor = "LXJHYQMBH;")
    private class70 field711;

    @OriginalMember(owner = "client!HJHNNPSW", name = "j", descriptor = "LXJHYQMBH;")
    private class70 field712;

    @OriginalMember(owner = "client!HJHNNPSW", name = "k", descriptor = "LXJHYQMBH;")
    private class70 field713;

    @OriginalMember(owner = "client!HJHNNPSW", name = "r", descriptor = "LXJHYQMBH;")
    private class70 field720;

    @OriginalMember(owner = "client!HJHNNPSW", name = "u", descriptor = "[I")
    private static int[] field723;

    @OriginalMember(owner = "client!HJHNNPSW", name = "v", descriptor = "[I")
    private static int[] field724;

    @OriginalMember(owner = "client!HJHNNPSW", name = "w", descriptor = "[I")
    private static int[] field725;

    @OriginalMember(owner = "client!HJHNNPSW", name = "a", descriptor = "()V")
    public static final void method240() {
        field724 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field724[var0] = 1;
            } else {
                field724[var0] = -1;
            }
        }
        field725 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field725[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field723 = new int[220500];
    }

    @OriginalMember(owner = "client!HJHNNPSW", name = "a", descriptor = "(II)[I")
    public final int[] method241(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field723[var3] = 0;
        }
        if (arg1 < 10) {
            return field723;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field706.method592(823);
        this.field707.method592(823);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field708 != null) {
            this.field708.method592(823);
            this.field709.method592(823);
            var6 = (int) ((double) (this.field708.field1688 - this.field708.field1687) * 32.768D / var4);
            var7 = (int) ((double) this.field708.field1687 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field710 != null) {
            this.field710.method592(823);
            this.field711.method592(823);
            var9 = (int) ((double) (this.field710.field1688 - this.field710.field1687) * 32.768D / var4);
            var10 = (int) ((double) this.field710.field1687 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field714[var12] != 0) {
                field726[var12] = 0;
                field727[var12] = (int) ((double) this.field716[var12] * var4);
                field728[var12] = (this.field714[var12] << 14) / 100;
                field729[var12] = (int) ((double) (this.field706.field1688 - this.field706.field1687) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field715[var12]) / var4);
                field730[var12] = (int) ((double) this.field706.field1687 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field706.method593(field703, arg0);
            int var42 = this.field707.method593(field703, arg0);
            if (this.field708 != null) {
                int var43 = this.field708.method593(field703, arg0);
                int var44 = this.field709.method593(field703, arg0);
                var41 += this.method242(this.field708.field1689, var8, field704, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field710 != null) {
                int var45 = this.field710.method593(field703, arg0);
                int var46 = this.field711.method593(field703, arg0);
                var42 = var42 * ((this.method242(this.field710.field1689, var11, field704, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field714[var47] != 0) {
                    int var48 = field727[var47] + var13;
                    if (var48 < arg0) {
                        field723[var48] += this.method242(this.field706.field1689, field726[var47], field704, field728[var47] * var42 >> 15);
                        field726[var47] += (field729[var47] * var41 >> 16) + field730[var47];
                    }
                }
            }
        }
        if (this.field712 != null) {
            this.field712.method592(823);
            this.field713.method592(823);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field712.method593(field703, arg0);
                int var19 = this.field713.method593(field703, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field712.field1688 - this.field712.field1687) * var18 >> 8) + this.field712.field1687;
                } else {
                    var20 = ((this.field712.field1688 - this.field712.field1687) * var19 >> 8) + this.field712.field1687;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field723[var17] = 0;
                }
            }
        }
        if (this.field717 > 0 && this.field718 > 0) {
            int var21 = (int) ((double) this.field717 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field723[var22] += field723[var22 - var21] * this.field718 / 100;
            }
        }
        if (this.field719.field1344[0] > 0 || this.field719.field1344[1] > 0) {
            this.field720.method592(823);
            int var23 = this.field720.method593(field703, arg0 + 1);
            int var24 = this.field719.method444(0, -15631, (float) var23 / 65536.0F);
            int var25 = this.field719.method444(1, -15631, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field723[var24 + var26] * (long) class49.field1351 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field723[var24 + var26 - var38 - 1] * (long) class49.field1349[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field723[var26 - var39 - 1] * (long) class49.field1349[1][var39] >> 16);
                    }
                    field723[var26] = var37;
                    var23 = this.field720.method593(field703, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field723[var24 + var26] * (long) class49.field1351 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field723[var24 + var26 - var35 - 1] * (long) class49.field1349[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field723[var26 - var36 - 1] * (long) class49.field1349[1][var36] >> 16);
                        }
                        field723[var26] = var34;
                        var23 = this.field720.method593(field703, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field723[var24 + var26 - var31 - 1] * (long) class49.field1349[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field723[var26 - var32 - 1] * (long) class49.field1349[1][var32] >> 16);
                            }
                            field723[var26] = var30;
                            this.field720.method593(field703, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field719.method444(0, -15631, (float) var23 / 65536.0F);
                    var25 = this.field719.method444(1, -15631, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field723[var40] < -32768) {
                field723[var40] = -32768;
            }
            if (field723[var40] > 32767) {
                field723[var40] = 32767;
            }
        }
        return field723;
    }

    @OriginalMember(owner = "client!HJHNNPSW", name = "a", descriptor = "(IIII)I")
    private final int method242(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0) {
            this.field705 = !this.field705;
        }
        if (arg0 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg0 == 2) {
            return field725[arg1 & 0x7FFF] * arg3 >> 14;
        } else if (arg0 == 3) {
            return ((arg1 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg0 == 4) {
            return field724[arg1 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!HJHNNPSW", name = "a", descriptor = "(ILSVWJKJVI;)V")
    public final void method243(int arg0, class52 arg1) {
        this.field706 = new class70();
        this.field706.method590(-13096, arg1);
        this.field707 = new class70();
        this.field707.method590(-13096, arg1);
        int var3 = arg1.method461();
        if (var3 != 0) {
            arg1.field1434--;
            this.field708 = new class70();
            this.field708.method590(-13096, arg1);
            this.field709 = new class70();
            this.field709.method590(-13096, arg1);
        }
        int var4 = arg1.method461();
        if (var4 != 0) {
            arg1.field1434--;
            this.field710 = new class70();
            this.field710.method590(-13096, arg1);
            this.field711 = new class70();
            this.field711.method590(-13096, arg1);
        }
        int var5 = arg1.method461();
        if (var5 != 0) {
            arg1.field1434--;
            this.field712 = new class70();
            this.field712.method590(-13096, arg1);
            this.field713 = new class70();
            this.field713.method590(-13096, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method475();
            if (var7 == 0) {
                break;
            }
            this.field714[var6] = var7;
            this.field715[var6] = arg1.method474();
            this.field716[var6] = arg1.method475();
        }
        this.field717 = arg1.method475();
        this.field718 = arg1.method475();
        this.field721 = arg1.method463();
        this.field722 = arg1.method463();
        this.field719 = new class49();
        this.field720 = new class70();
        if (arg0 != -13096) {
            field704 = -163;
        }
        this.field719.method445(this.field720, false, arg1);
    }
}
