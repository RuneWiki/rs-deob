import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class290 extends class59 {

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    private int field4747 = 1;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    private int field4746 = 0;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    private int field4755 = 0;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "Lph;")
    public static class229 field4754 = class266.method1858("_labels", 0);

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    public static int field4759 = 0;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method1981(int arg0, boolean arg1) {
        field4760++;
        if (arg0 != 64) {
            method1986(-21);
        }
        if (class230.field3820.field5147 >> 7 == class68.field1086 && class230.field3820.field5168 >> 7 == class133.field2155) {
            class68.field1086 = 0;
        }
        int var2 = class139.field2248;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class209 var6;
            if (arg1) {
                var4 = 8791798054912L;
                var6 = class230.field3820;
            } else {
                var4 = (long) class166.field2708[var3] << 32;
                var6 = class114.field1931[class166.field2708[var3]];
            }
            if (var6 != null && var6.method1459(0)) {
                var6.field3472 = false;
                if ((class298.field4847 && class139.field2248 > 200 || class139.field2248 > 50) && !arg1 && var6.field5153 == var6.field5115) {
                    var6.field3472 = true;
                }
                int var7 = var6.field5147 >> 7;
                int var8 = var6.field5168 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field3449 == null || var6.field3461 > class319.field5393 || class319.field5393 >= var6.field3440) {
                        if (var6.method1457(0) == 1 && (var6.field5147 & 0x7F) == 64 && (var6.field5168 & 0x7F) == 64) {
                            if (class244.field4017[var7][var8] == class188.field3055) {
                                continue;
                            }
                            class244.field4017[var7][var8] = class188.field3055;
                        }
                        var6.field5133 = class259.method1801(var6.field5168, arg0 - 20492, class298.field4849, var6.field5147);
                        class237.method1670(class298.field4849, var6.field5147, var6.field5168, var6.field5133, (var6.method1457(arg0 ^ 0x40) - 1) * 64 + 60, var6, var6.field5122, var4, var6.field5169);
                    } else {
                        var6.field3472 = false;
                        var6.field5133 = class259.method1801(var6.field5168, -20428, class298.field4849, var6.field5147);
                        class103.method793(class298.field4849, var6.field5147, var6.field5168, var6.field5133, var6, var6.field5122, var4, var6.field3451, var6.field3467, var6.field3437, var6.field3477);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V", line = 94)
    public static final void method1982(byte arg0) {
        field4749++;
        int var1 = 0;
        if (arg0 >= -95) {
            method1981(-24, false);
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class24.method150(var1, class225.field3705, true, 10807, var3, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 439)
    public class290() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[Lcl;[Lcl;[Lcl;Lsi;[Lrl;[Lcl;)V", line = 143)
    public static final void method1983(int arg0, class32[] arg1, class32[] arg2, class32[] arg3, class66 arg4, class327[] arg5, class32[] arg6) {
        class5.field65 = arg1;
        int var7 = 99 / ((arg0 + 44) / 55);
        class135.field2200 = arg3;
        class68.field1088 = arg2;
        class33.field543 = arg4;
        field4758++;
        class214.field3530 = arg5;
        class10.field129 = arg6;
        class328.field5596 = new boolean[class214.field3530.length];
        class142.field2309.method1573((byte) -48);
        int var8 = class33.field543.method498(class51.field734, -1);
        int[] var9 = class33.field543.method524(var8, -109);
        for (int var10 = 0; var10 < var9.length; var10++) {
            class142.field2309.method1582(class139.method1003(new class164(class33.field543.method523(-107, var9[var10], var8)), -87), 4);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIIII)V", line = 173)
    public static final void method1984(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class99.field1675) {
            class212.method1502(arg4, arg2, arg3 + arg4, arg1 + arg2);
            class212.method1494(arg4, arg2, arg3, arg1, 0);
        } else {
            class210.method1472(arg4, arg2, arg3 + arg4, arg1 + arg2);
            class210.method1465(arg4, arg2, arg3, arg1, 0);
        }
        field4745++;
        if (class119.field2001 < 100) {
            return;
        }
        if (class25.field332 == null || class25.field332.field4785 != arg3 || class25.field332.field4786 != arg1) {
            class327 var5 = new class327(arg3, arg1);
            class210.method1481(var5.field5579, arg3, arg1);
            class269.method1872(class50.field716, (byte) -103, 0, 0, arg1, class214.field3537, 0, 0, arg3);
            if (class99.field1675) {
                class25.field332 = new class87(var5);
            } else {
                class25.field332 = var5;
            }
            if (class99.field1675) {
                class210.field3485 = null;
            } else {
                class156.field2534.method2131((byte) 40);
            }
        }
        if (arg0) {
            field4754 = (class229) null;
        }
        class25.field332.method647(arg4, arg2);
        int var6 = class280.field4641 * arg3 / class50.field716 + arg4;
        int var7 = arg2 + (class230.field3824 * arg1 / class214.field3537);
        int var8 = class320.field5401 * arg3 / class50.field716;
        int var9 = class221.field3624 * arg1 / class214.field3537;
        if (class99.field1675) {
            class212.method1503(var6, var7, var8, var9, 16711680, 128);
            class212.method1501(var6, var7, var8, var9, 16711680);
        } else {
            class210.method1461(var6, var7, var8, var9, 16711680, 128);
            class210.method1463(var6, var7, var8, var9, 16711680);
        }
        if (class214.field3527 <= 0 || (class214.field3527 % 10) >= 5) {
            return;
        }
        for (class129 var10 = (class129) class25.field330.method1580((byte) -39); var10 != null; var10 = (class129) class25.field330.method1579((byte) 28)) {
            if (class48.field696 == var10.field2119) {
                int var11 = arg4 + (var10.field2126 * arg3 / class50.field716);
                int var12 = var10.field2120 * arg1 / class214.field3537 + arg2;
                if (class99.field1675) {
                    class212.method1494(var11 - 2, var12 + -2, 4, 4, 16776960);
                } else {
                    class210.method1465(var11 - 2, var12 + -2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lrk;IIIII)V", line = 260)
    public static final void method1985(class216 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class206.field3397 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class88.field1504) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class129.field2114 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class72 var14 = class225.field3705[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class192.field3174[var11][var12 + 1][var13] + class192.field3174[var11][var12][var13] + class192.field3174[var11][var12][var13 + 1] + class192.field3174[var11][var12 + 1][var13 + 1]) / 4 - (class192.field3174[arg1][arg2 + 1][arg3] + class192.field3174[arg1][arg2][arg3] + class192.field3174[arg1][arg2][arg3 + 1] + class192.field3174[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class207 var16 = var14.field1224;
                                    if (var16 != null) {
                                        if (var16.field3416.method222()) {
                                            arg0.method212(var16.field3416, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3403 != null && var16.field3403.method222()) {
                                            arg0.method212(var16.field3403, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1211; var17++) {
                                        class152 var18 = var14.field1216[var17];
                                        if (var18 != null && var18.field2461.method222() && (var18.field2464 == var12 || var7 == var12) && (var18.field2468 == var13 || var9 == var13)) {
                                            int var19 = var18.field2478 + 1 - var18.field2464;
                                            int var20 = var18.field2463 + 1 - var18.field2468;
                                            arg0.method212(var18.field2461, (var18.field2464 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2468 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "(I)V", line = 355)
    public static void method1986(int arg0) {
        field4754 = null;
        if (arg0 != 31621) {
            method1987((class66) null, (byte) 56);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BILhb;)V", line = 390)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg1 == 0) {
            this.field4746 = arg2.method1178(8);
        } else if (arg1 == 1) {
            this.field4755 = arg2.method1178(8);
        } else if (arg1 == 3) {
            this.field4747 = arg2.method1178(8);
        }
        if (arg0 != 115) {
            method1986(-6);
        }
        field4751++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lsi;B)V", line = 424)
    public static final void method1987(class66 arg0, byte arg1) {
        class294.field4815 = arg0;
        field4752++;
        if (arg1 != -105) {
            method1983(66, (class32[]) null, (class32[]) null, (class32[]) null, (class66) null, (class327[]) null, (class32[]) null);
        }
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V", line = 445)
    public final void method65(int arg0) {
        if (arg0 > 110) {
            field4748++;
            class189.method1320(4096);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IIB)I", line = 456)
    public static final int method1988(int arg0, int arg1, byte arg2) {
        if (arg2 != 111) {
            return 80;
        }
        class285 var3 = (class285) class243.field4004.method713(3365, (long) arg1);
        field4750++;
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field4707.length > arg0) {
            return var3.field4707[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)[I", line = 477)
    public final int[] method63(boolean arg0, int arg1) {
        field4757++;
        if (!arg0) {
            this.field4747 = -93;
        }
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int var4 = class269.field4504[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class293.field4789; var6++) {
                int var7 = class219.field3608[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field4746 == 0) {
                    var9 = (var7 - var4) * this.field4747;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field4747 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field4755 == 0) {
                    var12 = class198.field3288[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field4755 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lsi;Z)V", line = 552)
    public static final void method1989(class66 arg0, boolean arg1) {
        if (arg1) {
            field4754 = (class229) null;
        }
        field4761++;
        class221.field3637 = arg0;
    }
}
