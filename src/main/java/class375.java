import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class375 extends class57 implements class111 {

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "Lpl;")
    public class447 field5278;

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "Z")
    private boolean field5275;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    public static int field5270 = 1;

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "I")
    public static int field5277 = 0;

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "Ljava/lang/String;")
    public static String field5279 = "Select";

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "I")
    public static int field5280 = 0;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!vl", name = "V", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!vl", name = "W", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!vl", name = "Y", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!vl", name = "Z", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!vl", name = "ab", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!vl", name = "bb", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!vl", name = "cb", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!vl", name = "db", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!vl", name = "eb", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "Lbi;")
    public static class139 field5276;

    @OriginalMember(owner = "client!vl", name = "X", descriptor = "[I")
    public static int[] field5283;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 5)
    public final void method573(byte arg0) {
        ++field5289;
        if (arg0 > -100) {
            this.method572((class391) null, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)I", line = 19)
    public final int method582(byte arg0) {
        if (arg0 != 22) {
            this.method580(-55);
        }
        ++field5284;
        return this.field5278.field6458;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILpe;)V", line = 31)
    public final void method581(int arg0, class391 arg1) {
        ++field5272;
        class73 var3 = this.field5278.method2782(super.field919, arg1, true, 131072, super.field910, arg0, false);
        if (var3 != null) {
            this.field5278.method2776(var3, super.field919 >> 7, super.field919 >> 7, super.field910 >> 7, arg1, super.field910 >> 7, 13, false);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIII)V", line = 46)
    public static final void method2341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class76 var7 = new class76();
        var7.field1128 = arg1 >> 7;
        var7.field1134 = arg2 >> 7;
        var7.field1138 = arg3 >> 7;
        var7.field1126 = arg4 >> 7;
        var7.field1146 = arg0;
        var7.field1135 = arg1;
        var7.field1149 = arg2;
        var7.field1140 = arg3;
        var7.field1150 = arg4;
        var7.field1141 = arg5;
        var7.field1127 = arg6;
        class421.field5894[class223.field3091++] = var7;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)I", line = 61)
    public final int method575(int arg0) {
        ++field5268;
        return arg0 != -15863 ? 13 : this.field5278.field6450;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lpe;I)V", line = 74)
    public final void method574(class391 arg0, int arg1) {
        ++field5274;
        this.field5278.method2783(arg0, (byte) -25);
        if (arg1 != -28992) {
            this.method573((byte) -34);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V", line = 85)
    public static final void method2342(boolean arg0) {
        ++field5287;
        class410 var1 = class107.field1569;
        synchronized (class107.field1569) {
            if (arg0) {
                field5280 = -36;
            }
            class107.field1569.method2533(0);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lpe;II)Lsj;", line = 99)
    public final class73 method576(class391 arg0, int arg1, int arg2) {
        ++field5286;
        if (arg2 != -2705) {
            field5279 = null;
        }
        return this.field5278.method2782(0, arg0, false, arg1, 0, arg2 ^ -2705, false);
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)Z", line = 118)
    public final boolean method577(int arg0) {
        if (arg0 != -16528) {
            field5280 = 59;
        }
        ++field5266;
        return this.field5278.method2787(arg0 ^ 16626);
    }

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "(I)V", line = 129)
    public static void method2343(int arg0) {
        if (arg0 != -21594) {
            field5280 = 19;
        }
        field5276 = null;
        field5279 = null;
        field5283 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLpe;)V", line = 141)
    public final void method570(byte arg0, class391 arg1) {
        int var3 = -105 / ((66 - arg0) / 39);
        ++field5273;
        this.field5278.method2781(arg1, -4136);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lpe;B)Lca;", line = 151)
    public final class415 method572(class391 arg0, byte arg1) {
        ++field5290;
        class73 var3 = this.field5278.method2782(super.field919, arg0, true, 1024, super.field910, 0, false);
        if (var3 == null) {
            return null;
        } else {
            class156 var4 = arg0.method226();
            var4.method308(super.field922 + super.field919, super.field920, super.field913 + super.field910);
            if (arg1 >= -45) {
                return null;
            } else {
                class415 var5 = null;
                if (this.field5275) {
                    var5 = class340.method2159(24579, 1);
                }
                if (this.field5278.field6484 == null) {
                    var3.method478(var4, var5 == null ? null : var5.field5799[0], 0);
                } else {
                    class374 var6 = this.field5278.field6484.method489();
                    arg0.method166(var3, var6, var4, var5 != null ? var5.field5799[0] : null, 0);
                }
                this.field5278.method2776(var3, super.field919 >> 7, super.field919 >> 7, super.field910 >> 7, arg0, super.field910 >> 7, 13, true);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)I", line = 188)
    public static final int method2344(int arg0, int arg1) {
        ++field5282;
        if (arg0 < 0) {
            return 0;
        } else {
            class329 var2 = (class329) class19.field374.method614(-103, (long) arg0);
            if (var2 == null) {
                return class407.method2504(arg1 + 15349, arg0).field886;
            } else {
                int var3 = 0;
                for (int var4 = 0; var4 < var2.field4472.length; ++var4) {
                    if (var2.field4472[var4] == -1) {
                        ++var3;
                    }
                }
                int var5 = var3 + (class407.method2504(-9372, arg0).field886 - var2.field4472.length);
                if (arg1 != -24721) {
                    field5270 = -107;
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I", line = 223)
    public final int method580(int arg0) {
        if (arg0 != 24493) {
            field5277 = -61;
        }
        ++field5271;
        return this.field5278.field6462;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILpe;I)Z", line = 237)
    public final boolean method583(int arg0, int arg1, class391 arg2, int arg3) {
        ++field5281;
        class73 var5 = this.field5278.method2782(super.field919, arg2, false, arg3, super.field910, 0, false);
        if (var5 == null) {
            return false;
        } else {
            class156 var6 = arg2.method226();
            var6.method308(super.field922 + super.field919, super.field920, super.field910 - -super.field913);
            return var5.method455(arg1, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "(I)V", line = 256)
    public static final void method2345(int arg0) {
        ++field5269;
        if (class184.method1345(arg0 ^ 127) == 2) {
            byte var1 = (byte) (255 & class128.field1811 - 4);
            int var2 = class128.field1811 % class116.field1621;
            for (int var3 = 0; ~var3 > -5; ++var3) {
                for (int var16 = 0; class385.field5425 > var16; ++var16) {
                    class163.field2408[var3][var2][var16] = var1;
                }
            }
            if (~class69.field1046 != -4) {
                for (int var4 = arg0; var4 < 2; ++var4) {
                    class386.field5442[var4] = -1000000;
                    class69.field1036[var4] = 1000000;
                    class365.field5036[var4] = 0;
                    class368.field5053[var4] = 1000000;
                    class12.field89[var4] = 0;
                }
                if (class184.field2675 != 1) {
                    int var5 = class22.method281(1, class69.field1046, class374.field5261, class356.field4842);
                    if (var5 - class443.field6389 < 800 && (class7.field57[class69.field1046][class356.field4842 >> 7][class374.field5261 >> 7] & 4) != 0) {
                        class24.method295(class374.field5261 >> 7, 1, class356.field4842 >> 7, class118.field1653, (byte) 118, false);
                    }
                } else {
                    if (~(class7.field57[class69.field1046][class95.field1379.field3176 >> 7][class95.field1379.field3167 >> 7] & 4) != -1) {
                        class24.method295(class95.field1379.field3167 >> 7, 0, class95.field1379.field3176 >> 7, class118.field1653, (byte) 22, false);
                    }
                    if (class167.field2488 < 2560) {
                        int var6 = class356.field4842 >> 7;
                        int var7 = class374.field5261 >> 7;
                        int var8 = class95.field1379.field3176 >> 7;
                        int var9 = class95.field1379.field3167 >> 7;
                        int var10;
                        if (var8 > var6) {
                            var10 = -var6 + var8;
                        } else {
                            var10 = -var8 + var6;
                        }
                        int var11;
                        if (var9 > var7) {
                            var11 = -var7 + var9;
                        } else {
                            var11 = -var9 + var7;
                        }
                        if ((var10 != 0 || ~var11 != -1) && ~var10 < ~(-class116.field1621) && ~var10 > ~class116.field1621 && var11 > -class385.field5425 && ~class385.field5425 < ~var11) {
                            if (~var10 >= ~var11) {
                                int var12 = var10 * 65536 / var11;
                                int var13 = 32768;
                                while (~var7 != ~var9) {
                                    if (var7 >= var9) {
                                        if (var9 < var7) {
                                            --var7;
                                        }
                                    } else {
                                        ++var7;
                                    }
                                    if ((4 & class7.field57[class69.field1046][var6][var7]) != 0) {
                                        class24.method295(var7, 1, var6, class118.field1653, (byte) 104, false);
                                        return;
                                    }
                                    var13 += var12;
                                    if (~var13 <= -65537) {
                                        if (var6 >= var8) {
                                            if (var8 < var6) {
                                                --var6;
                                            }
                                        } else {
                                            ++var6;
                                        }
                                        var13 -= 65536;
                                        if ((class7.field57[class69.field1046][var6][var7] & 4) != 0) {
                                            class24.method295(var7, 1, var6, class118.field1653, (byte) 12, false);
                                            return;
                                        }
                                    }
                                }
                            } else {
                                int var14 = var11 * 65536 / var10;
                                int var15 = 32768;
                                while (var6 != var8) {
                                    if (~var8 < ~var6) {
                                        ++var6;
                                    } else if (var8 < var6) {
                                        --var6;
                                    }
                                    if (~(class7.field57[class69.field1046][var6][var7] & 4) != -1) {
                                        class24.method295(var7, 1, var6, class118.field1653, (byte) 35, false);
                                        return;
                                    }
                                    var15 += var14;
                                    if (~var15 <= -65537) {
                                        if (var9 > var7) {
                                            ++var7;
                                        } else if (var7 > var9) {
                                            --var7;
                                        }
                                        var15 -= 65536;
                                        if (~(4 & class7.field57[class69.field1046][var6][var7]) != -1) {
                                            class24.method295(var7, 1, var6, class118.field1653, (byte) 118, false);
                                            return;
                                        }
                                    }
                                }
                            }
                        } else {
                            class380.method2365(arg0 ^ -2, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class283.field3794 + "," + class296.field3988, (Throwable) null);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "(I)I", line = 461)
    public final int method530(int arg0) {
        if (arg0 > -100) {
            return 1;
        } else {
            ++field5267;
            return this.field5278.method2789((byte) 102);
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lpe;Lkk;IIIIIIIZIIII)V", line = 474)
    public class375(class391 arg0, class372 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class269.method1726(arg3, arg2, 40));
        this.field5278 = new class447(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field5275 = arg1.field5204 != 0;
    }
}
