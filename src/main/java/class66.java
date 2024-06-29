import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class66 extends class584 {

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "Z")
    private boolean field701 = false;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Z")
    private boolean field703;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "[Lvfa;")
    private class614[] field699;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Lep;")
    public static class382 field694 = null;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "Lkfa;")
    public static class549 field704 = new class549(30, 1);

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V", line = 4)
    public final void method174(int arg0) {
        if (!this.field701) {
            super.field8309.method2723(class67.field708, -30892, 0);
        } else {
            super.field8309.method2690(1, 5);
            super.field8309.method2696(-2, (class155) null);
            super.field8309.method1180(6, class392.field5226);
            super.field8309.method2699((byte) -51);
            if (!this.field703) {
                super.field8309.method2759(class193.field2323, (byte) -5, class193.field2323);
                super.field8309.method2757(class67.field708, (byte) -73, 0);
                super.field8309.method2690(2, 5);
                super.field8309.method2759(class193.field2323, (byte) -5, class193.field2323);
                super.field8309.method2757(class67.field708, (byte) -73, 0);
                super.field8309.method2757(class19.field171, (byte) -73, 1);
                super.field8309.method2723(class67.field708, -30892, 0);
                super.field8309.method2696(-2, (class155) null);
            } else {
                super.field8309.method2759(class193.field2323, (byte) -5, class193.field2323);
                super.field8309.method2757(class67.field708, (byte) -73, 0);
                super.field8309.method2723(class67.field708, -30892, 0);
            }
            super.field8309.method2690(0, 5);
            this.field701 = false;
        }
        ++field705;
        int var2 = 86 % ((arg0 - 86) / 40);
        super.field8309.method2759(class193.field2323, (byte) -5, class193.field2323);
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)Z", line = 54)
    public final boolean method178(byte arg0) {
        if (arg0 > -6) {
            field694 = null;
        }
        ++field693;
        return true;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIBII)V", line = 65)
    public static final void method431(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field696;
        int var7 = class512.method2932((byte) -46, arg5, class501.field7217, class58.field602);
        int var8 = class512.method2932((byte) -46, arg1, class501.field7217, class58.field602);
        int var9 = class512.method2932((byte) -46, arg6, class163.field1942, class326.field4246);
        int var10 = class512.method2932((byte) -46, arg2, class163.field1942, class326.field4246);
        int var11 = class512.method2932((byte) -46, arg3 + arg5, class501.field7217, class58.field602);
        int var12 = class512.method2932((byte) -46, -arg3 + arg1, class501.field7217, class58.field602);
        for (int var13 = var7; ~var13 > ~var11; ++var13) {
            class445.method2463(var9, arg4 + 56, var10, arg0, class156.field1755[var13]);
        }
        for (int var14 = var8; ~var12 > ~var14; --var14) {
            class445.method2463(var9, 97, var10, arg0, class156.field1755[var14]);
        }
        int var15 = class512.method2932((byte) -46, arg6 - -arg3, class163.field1942, class326.field4246);
        int var16 = class512.method2932((byte) -46, -arg3 + arg2, class163.field1942, class326.field4246);
        if (arg4 != 70) {
            method432(-93, 38, 73);
        }
        for (int var17 = var11; ~var17 >= ~var12; ++var17) {
            int[] var18 = class156.field1755[var17];
            class445.method2463(var9, 117, var15, arg0, var18);
            class445.method2463(var16, 122, var10, arg0, var18);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)V", line = 119)
    public static final void method432(int arg0, int arg1, int arg2) {
        boolean var3 = class97.field1074[0][arg1][arg2] != null && class97.field1074[0][arg1][arg2].field3688 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class97.field1074[var4][arg1][arg2] == null) {
                class287 var5 = class97.field1074[var4][arg1][arg2] = new class287(var4, arg1, arg2);
                if (var3) {
                    ++var5.field3685;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)V", line = 139)
    public static final void method433(int arg0) {
        ++field700;
        if (arg0 < 65) {
            field694 = null;
        }
        class389.field5193.method3687((byte) -10);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZZ)V", line = 153)
    public final void method177(boolean arg0, boolean arg1) {
        super.field8309.method2759(class676.field9584, (byte) -5, class193.field2323);
        if (arg1) {
            ++field695;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILld;B)V", line = 164)
    public final void method185(int arg0, class155 arg1, byte arg2) {
        ++field698;
        super.field8309.method2696(-2, arg1);
        super.field8309.method2725(arg0, -31628);
        if (arg2 <= 17) {
            this.method180(true, -127);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lfo;)V", line = 182)
    public class66(class473 arg0) {
        super(arg0);
        if (arg0.field6863) {
            this.field703 = arg0.field6824 < 3;
            int var2 = this.field703 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 == -2) {
                                var15 = var13;
                            } else if (~var14 != -3) {
                                if (var14 != 3) {
                                    if (var14 != 4) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = -var12;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field699 = new class614[3];
            this.field699[0] = super.field8309.method1193(false, var4, -113, 64);
            this.field699[1] = super.field8309.method1193(false, var5, -112, 64);
            this.field699[2] = super.field8309.method1193(false, var3, -88, 64);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V", line = 294)
    public final void method175(int arg0, int arg1, int arg2) {
        ++field702;
        if (arg2 < 116) {
            this.method174(-75);
        }
        if (this.field701) {
            super.field8309.method2690(1, 5);
            super.field8309.method2696(-2, this.field699[arg0 + -1]);
            super.field8309.method2690(0, 5);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lvp;III)V", line = 312)
    public static final void method434(class172 arg0, int arg1, int arg2, int arg3) {
        long var4 = class2.field17[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field2054 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field2056[arg0.field2054++] = class256.field3279[var8 - 1].field3189;
            var6 += 16L;
        }
        for (int var9 = arg0.field2054; var9 < 4; ++var9) {
            arg0.field2056[var9] = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V", line = 340)
    public static void method435(byte arg0) {
        field704 = null;
        if (arg0 > -72) {
            method434((class172) null, -47, -66, -28);
        }
        field694 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(ZI)V", line = 354)
    public final void method180(boolean arg0, int arg1) {
        if (arg1 != -1) {
            this.field703 = false;
        }
        ++field697;
        if (this.field699 != null && arg0) {
            super.field8309.method2690(1, 5);
            super.field8309.method1180(arg1 ^ -7, class223.field2831);
            class667 var3 = super.field8309.method2730(106);
            var3.method226(1024);
            super.field8309.method2689(false, class136.field1555);
            if (!this.field703) {
                super.field8309.method2759(class193.field2323, (byte) -5, class676.field9584);
                super.field8309.method2757(class19.field171, (byte) -73, 0);
                super.field8309.method2690(2, 5);
                super.field8309.method2759(class676.field9584, (byte) -5, class250.field3212);
                super.field8309.method2757(class19.field171, (byte) -73, 0);
                super.field8309.method1168(false, true, class19.field171, 1, 30);
                super.field8309.method2723(class561.field7981, arg1 + -30891, 0);
                super.field8309.method2696(arg1 + -1, super.field8309.field6872);
            } else {
                super.field8309.method2759(class676.field9584, (byte) -5, class250.field3212);
                super.field8309.method1168(false, true, class67.field708, 0, 107);
                super.field8309.method2723(class561.field7981, -30892, 0);
            }
            super.field8309.method2690(0, 5);
            this.field701 = true;
        } else {
            super.field8309.method2723(class561.field7981, -30892, 0);
        }
    }
}
