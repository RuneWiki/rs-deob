import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class552 {

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lmf;")
    private class382 field7825 = new class382(16);

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Lpu;")
    private class522 field7826;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "[Lli;")
    public static class392[] field7824 = new class392[5];

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lr;I)V")
    public static final void method3125(class166 arg0, int arg1) {
        field7823++;
        int var2 = 69 / ((-arg1 - 5) / 52);
        if (class623.field8731) {
            class164.method1133(arg0, -321);
        } else {
            class549.method3105(arg0, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public final void method3126(byte arg0) {
        field7821++;
        if (arg0 < 56) {
            method3132(104, -45, -4, -28, 58, 22);
        }
        class382 var2 = this.field7825;
        synchronized (this.field7825) {
            this.field7825.method2285((byte) -113);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method3127(int arg0) {
        if (arg0 == 0) {
            field7824 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
    public final void method3128(int arg0, int arg1) {
        class382 var3 = this.field7825;
        synchronized (this.field7825) {
            this.field7825.method2290(false, arg0);
            if (arg1 > -94) {
                this.method3129(-99, null, -93, 113, 93, -23);
            }
        }
        field7829++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILqv;IIII)Lkt;")
    public final class142 method3129(int arg0, class409 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 0) {
            this.field7826 = null;
        }
        field7828++;
        class337[] var7 = null;
        class493 var8 = this.method3133(false, arg3);
        if (var8.field7017 != null) {
            var7 = new class337[var8.field7017.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class473 var10 = arg1.method2469((byte) 15, var8.field7017[var9]);
                var7[var9] = new class337(var10.field6760, var10.field6762, var10.field6756, var10.field6755, var10.field6749, var10.field6752, var10.field6753, var10.field6750);
            }
        }
        return new class142(var8.field7012, var7, var8.field7014, arg0, arg5, arg4);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZIII[[[Lbt;)Z")
    public static final boolean method3130(int arg0, boolean arg1, int arg2, int arg3, int arg4, class40[][][] arg5) {
        if (arg0 != -1) {
            return false;
        }
        field7832++;
        byte var6 = arg1 ? 1 : (byte) (class534.field7501 & 0xFF);
        if (class262.field3977[class58.field1112][arg2][arg3] == var6) {
            return false;
        } else if ((class672.field9500[class58.field1112][arg2][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class87.field1438[var7] = arg2;
            int var8 = 0;
            int var35 = var7 + 1;
            class120.field1827[var7] = arg3;
            class262.field3977[class58.field1112][arg2][arg3] = var6;
            while (var35 != var8) {
                int var9 = class87.field1438[var8] & 0xFFFF;
                int var10 = class87.field1438[var8] >> 16 & 0xFF;
                int var11 = class87.field1438[var8] >> 24 & 0xFF;
                int var12 = class120.field1827[var8] & 0xFFFF;
                int var13 = class120.field1827[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class672.field9500[class58.field1112][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class58.field1112 + 1; var16 <= 3; var16++) {
                    if ((class672.field9500[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field658 != null) {
                                int var20 = class668.method3701(var10, (byte) -103);
                                if (arg5[var16][var9][var12].field658.field3795 == var20 || arg5[var16][var9][var12].field669 != null && arg5[var16][var9][var12].field669.field3795 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class668.method3701(var11, (byte) 73);
                                    if (arg5[var16][var9][var12].field658.field3795 == var21 || arg5[var16][var9][var12].field669 != null && arg5[var16][var9][var12].field669.field3795 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class668.method3701(var13, (byte) -89);
                                    if (arg5[var16][var9][var12].field658.field3795 == var22 || arg5[var16][var9][var12].field669 != null && arg5[var16][var9][var12].field669.field3795 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class40 var23 = arg5[var16][var9][var12];
                            if (var23.field671 != null) {
                                for (class106 var24 = var23.field671; var24 != null; var24 = var24.field1641) {
                                    class454 var25 = var24.field1638;
                                    if (var25 instanceof class614) {
                                        class614 var26 = (class614) var25;
                                        int var27 = var26.method1186(-9960);
                                        int var28 = var26.method1175(arg0 ^ 0xFFFFA00C);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class40 var30 = arg5[var16][var9][var12];
                        if (var30 != null && var30.field671 != null) {
                            for (class106 var31 = var30.field671; var31 != null; var31 = var31.field1641) {
                                class454 var32 = var31.field1638;
                                if (var32.field6526 != var32.field6524 || var32.field6521 != var32.field6516) {
                                    for (int var33 = var32.field6524; var33 <= var32.field6526; var33++) {
                                        for (int var34 = var32.field6521; var34 <= var32.field6516; var34++) {
                                            class262.field3977[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class262.field3977[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class296.field4340[class58.field1112 + 1].method432(var9, false, var12);
                    if (var17 > class166.field2387[arg4]) {
                        class166.field2387[arg4] = var17;
                    }
                    int var18 = var9 << 9;
                    if (var18 < class539.field7552[arg4]) {
                        class539.field7552[arg4] = var18;
                    } else if (class158.field2274[arg4] < var18) {
                        class158.field2274[arg4] = var18;
                    }
                    int var19 = var12 << 9;
                    if (class117.field1784[arg4] > var19) {
                        class117.field1784[arg4] = var19;
                    } else if (class692.field9728[arg4] < var19) {
                        class692.field9728[arg4] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class262.field3977[class58.field1112][var9 - 1][var12] != var6) {
                        class87.field1438[var35] = class486.method2826(class486.method2826(var9 - 1, 1179648), -754974720);
                        class120.field1827[var35] = class486.method2826(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class262.field3977[class58.field1112][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (class232.field3611 > var12) {
                        if (var9 - 1 >= 0 && class262.field3977[class58.field1112][var9 - 1][var12] != var6 && (class672.field9500[class58.field1112][var9][var12] & 0x4) == 0 && (class672.field9500[class58.field1112][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class87.field1438[var35] = class486.method2826(1375731712, class486.method2826(1179648, var9 - 1));
                            class120.field1827[var35] = class486.method2826(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class262.field3977[class58.field1112][var9 - 1][var12] = var6;
                        }
                        if (class262.field3977[class58.field1112][var9][var12] != var6) {
                            class87.field1438[var35] = class486.method2826(318767104, class486.method2826(5373952, var9));
                            class120.field1827[var35] = class486.method2826(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class262.field3977[class58.field1112][var9][var12] = var6;
                        }
                        if ((var9 + 1) < class199.field2812 && class262.field3977[class58.field1112][var9 + 1][var12] != var6 && (class672.field9500[class58.field1112][var9][var12] & 0x4) == 0 && (class672.field9500[class58.field1112][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class87.field1438[var35] = class486.method2826(class486.method2826(var9 + 1, 5373952), -1845493760);
                            class120.field1827[var35] = class486.method2826(5439488, var12);
                            class262.field3977[class58.field1112][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class199.field2812 > var9 + 1 && class262.field3977[class58.field1112][var9 + 1][var12] != var6) {
                        class87.field1438[var35] = class486.method2826(class486.method2826(9568256, var9 + 1), 1392508928);
                        class120.field1827[var35] = class486.method2826(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class262.field3977[class58.field1112][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class262.field3977[class58.field1112][var9 - 1][var12] != var6 && (class672.field9500[class58.field1112][var9][var12] & 0x4) == 0 && (class672.field9500[class58.field1112][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class87.field1438[var35] = class486.method2826(301989888, class486.method2826(13762560, var9 - 1));
                            class120.field1827[var35] = class486.method2826(var12, 13828096);
                            class262.field3977[class58.field1112][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class262.field3977[class58.field1112][var9][var12] != var6) {
                            class87.field1438[var35] = class486.method2826(-1828716544, class486.method2826(var9, 13762560));
                            class120.field1827[var35] = class486.method2826(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class262.field3977[class58.field1112][var9][var12] = var6;
                        }
                        if (class199.field2812 > (var9 + 1) && class262.field3977[class58.field1112][var9 + 1][var12] != var6 && (class672.field9500[class58.field1112][var9][var12] & 0x4) == 0 && (class672.field9500[class58.field1112][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class87.field1438[var35] = class486.method2826(class486.method2826(9568256, var9 + 1), -771751936);
                            class120.field1827[var35] = class486.method2826(var12, 9633792);
                            class262.field3977[class58.field1112][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class166.field2387[arg4] != -1000000) {
                class166.field2387[arg4] += 40;
                class539.field7552[arg4] -= 512;
                class158.field2274[arg4] += 512;
                class692.field9728[arg4] += 512;
                class117.field1784[arg4] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public final void method3131(int arg0) {
        class382 var2 = this.field7825;
        synchronized (this.field7825) {
            this.field7825.method2279(arg0);
        }
        field7822++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII)V")
    public static final void method3132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7820++;
        int var6 = 0;
        if (arg1 != 22099) {
            return;
        }
        int var7 = arg3;
        int var8 = arg5 * arg5;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg3 - 1) * var15;
        if (class520.field7329 <= arg0 && class239.field3747 >= arg0) {
            int var21 = class537.method3051(-10168, arg2 + arg5, class248.field3859, class15.field153);
            int var22 = class537.method3051(-10168, arg2 - arg5, class248.field3859, class15.field153);
            class58.method623(arg4, var21, arg1 ^ 0xD5E, class651.field9125[arg0], var22);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var6++;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (class520.field7329 <= var24 && class239.field3747 >= var23) {
                int var25 = class537.method3051(arg1 - 32267, arg2 + var6, class248.field3859, class15.field153);
                int var26 = class537.method3051(arg1 ^ 0xFFFF8E1B, arg2 - var6, class248.field3859, class15.field153);
                if (class520.field7329 <= var23) {
                    class58.method623(arg4, var25, 23309, class651.field9125[var23], var26);
                }
                if (var24 <= class239.field3747) {
                    class58.method623(arg4, var25, 23309, class651.field9125[var24], var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lkr;ILpu;)V")
    public class552(class693 arg0, int arg1, class522 arg2) {
        this.field7826 = arg2;
        this.field7826.method2988(94, 29);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)Ltp;")
    private final class493 method3133(boolean arg0, int arg1) {
        field7831++;
        class382 var3 = this.field7825;
        class493 var4;
        synchronized (this.field7825) {
            var4 = (class493) this.field7825.method2287(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field7826;
        byte[] var6;
        synchronized (this.field7826) {
            var6 = this.field7826.method3007(29, arg1, 5);
        }
        if (arg0) {
            this.field7825 = null;
        }
        class493 var7 = new class493();
        if (var6 != null) {
            var7.method2858(new class695(var6), 20746);
        }
        class382 var8 = this.field7825;
        synchronized (this.field7825) {
            this.field7825.method2291(var7, (long) arg1, 1);
            return var7;
        }
    }

    static {
        for (int var0 = 0; var0 < field7824.length; var0++) {
            field7824[var0] = new class392();
        }
        field7830 = 0;
    }
}
