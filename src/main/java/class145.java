import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class145 extends class601 {

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
    public static int field2037 = -1;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "Los;")
    public static class173 field2038;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "Lcu;")
    public static class203 field2035;

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "Lav;")
    public static class416 field2041;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)I")
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            return 26;
        } else {
            ++field2040;
            if (super.field8137.method2161(0)) {
                return 3;
            } else {
                return ~super.field8137.field4792.method3641(arg1 + -22) == -1 ? 3 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)Z")
    public final boolean method940(int arg0) {
        ++field2034;
        if (super.field8137.method2161(0)) {
            return false;
        } else if (~super.field8137.field4792.method3641(arg0 + -2048) == -1) {
            return false;
        } else {
            if (arg0 != 2048) {
                this.method940(101);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lha;BI)Lej;")
    public static final class179 method941(class548 arg0, byte arg1, int arg2) {
        ++field2030;
        class685 var3 = class38.method205(arg2, 0, true, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != 87) {
                field2038 = null;
            }
            return var3.field9523;
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I")
    public final int method942(int arg0) {
        if (arg0 != 0) {
            return -31;
        } else {
            ++field2031;
            return super.field8131;
        }
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)V")
    public static void method943(int arg0) {
        field2038 = null;
        if (arg0 != -1) {
            field2037 = 43;
        }
        field2041 = null;
        field2035 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        ++field2036;
        if (arg0 != 8976) {
            field2037 = 52;
        }
        return 2;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZLni;)V")
    public static final void method944(int arg0, boolean arg1, class515 arg2) {
        ++field2033;
        if (arg0 == -15636) {
            class32 var3 = arg2.method3084((byte) -92);
            if (~arg2.field7203 == -1) {
                class219.field2861 = -1;
                class657.field8769 = 0;
                arg2.field7201 = 0;
            } else {
                if (~arg2.field7132 != 0 && arg2.field7170 == 0) {
                    class57 var4 = class607.field8188.method3001(-12575, arg2.field7132);
                    if (~arg2.field7199 < -1 && var4.field799 == 0) {
                        class219.field2861 = -1;
                        ++arg2.field7201;
                        class657.field8769 = 0;
                        return;
                    }
                    if (arg2.field7199 <= 0 && var4.field797 == 0) {
                        class657.field8769 = 0;
                        class219.field2861 = -1;
                        ++arg2.field7201;
                        return;
                    }
                }
                for (int var5 = 0; ~arg2.field7190.length < ~var5; ++var5) {
                    if (arg2.field7190[var5].field7339 != -1 && arg2.field7190[var5].field7349 <= class483.field6741) {
                        class46 var20 = class129.field1776.method4073(-7428, arg2.field7190[var5].field7339);
                        if (var20.field592 && ~var20.field596 != 0) {
                            class57 var21 = class607.field8188.method3001(-12575, var20.field596);
                            if (arg2.field7199 > 0 && var21.field799 == 0) {
                                ++arg2.field7201;
                                class219.field2861 = -1;
                                class657.field8769 = 0;
                                return;
                            }
                            if (~arg2.field7199 >= -1 && var21.field797 == 0) {
                                class219.field2861 = -1;
                                ++arg2.field7201;
                                class657.field8769 = 0;
                                return;
                            }
                        }
                    }
                }
                int var6 = arg2.field4410;
                int var7 = arg2.field4418;
                int var8 = arg2.field7197[arg2.field7203 + -1] * 512 + 256 * arg2.method662((byte) 15);
                int var9 = arg2.field7198[arg2.field7203 + -1] * 512 + arg2.method662((byte) 15) * 256;
                if (var6 < var8) {
                    if (var7 >= var9) {
                        if (~var7 < ~var9) {
                            arg2.method3086(14336, -89);
                        } else {
                            arg2.method3086(12288, arg0 ^ -15622);
                        }
                    } else {
                        arg2.method3086(10240, -108);
                    }
                } else if (var8 < var6) {
                    if (~var9 < ~var7) {
                        arg2.method3086(6144, 56);
                    } else if (var9 < var7) {
                        arg2.method3086(2048, -119);
                    } else {
                        arg2.method3086(4096, 58);
                    }
                } else if (var7 >= var9) {
                    if (var9 < var7) {
                        arg2.method3086(0, arg0 ^ -15697);
                    }
                } else {
                    arg2.method3086(8192, arg0 + 15530);
                }
                byte var10 = arg2.field7195[arg2.field7203 + -1];
                if (!arg1 && (~(-var6 + var8) < -1025 || -var6 + var8 < -1024 || -var7 + var9 > 1024 || -var7 + var9 < -1024)) {
                    arg2.field4410 = var8;
                    arg2.field4418 = var9;
                    arg2.method3073(true, false, arg2.field7189);
                    if (~arg2.field7199 < -1) {
                        --arg2.field7199;
                    }
                    class219.field2861 = -1;
                    class657.field8769 = 0;
                    --arg2.field7203;
                } else {
                    int var11 = 16;
                    boolean var12 = true;
                    if (arg2 instanceof class679) {
                        var12 = ((class679) arg2).field9436.field1636;
                    }
                    if (!var12) {
                        if (!arg1 && arg2.field7203 > 1) {
                            var11 = 24;
                        }
                        if (!arg1 && arg2.field7203 > 2) {
                            var11 = 32;
                        }
                    } else {
                        int var13 = -arg2.field7125.field365 + arg2.field7189;
                        if (var13 != 0 && arg2.field7122 == -1 && arg2.field7136 != 0) {
                            var11 = 8;
                        }
                        if (!arg1 && arg2.field7203 > 2) {
                            var11 = 24;
                        }
                        if (!arg1 && arg2.field7203 > 3) {
                            var11 = 32;
                        }
                    }
                    if (arg2.field7201 > 0 && arg2.field7203 > 1) {
                        var11 = 32;
                        --arg2.field7201;
                    }
                    if (var10 == 2) {
                        var11 <<= 1;
                    } else if (~var10 == -1) {
                        var11 >>= 1;
                    }
                    class657.field8769 = 0;
                    if (~var3.field431 != 0) {
                        int var14 = var11 << 9;
                        if (~arg2.field7203 != -2) {
                            if (~var14 < ~arg2.field7193) {
                                arg2.field7193 += var3.field431;
                                if (~var14 > ~arg2.field7193) {
                                    arg2.field7193 = var14;
                                }
                            } else if (arg2.field7193 > 0) {
                                arg2.field7193 -= var3.field431;
                                if (arg2.field7193 < 0) {
                                    arg2.field7193 = 0;
                                }
                            }
                        } else {
                            int var15 = arg2.field7193 * arg2.field7193;
                            int var16 = (var8 >= arg2.field4410 ? -arg2.field4410 + var8 : -var8 + arg2.field4410) << 9;
                            int var17 = (~arg2.field4418 >= ~var9 ? var9 - arg2.field4418 : -var9 + arg2.field4418) << 9;
                            int var18 = ~var17 > ~var16 ? var16 : var17;
                            int var19 = var3.field431 * var18 * 2;
                            if (var15 <= var19) {
                                if (~var18 > ~(var15 / 2)) {
                                    arg2.field7193 -= var3.field431;
                                    if (arg2.field7193 < 0) {
                                        arg2.field7193 = 0;
                                    }
                                } else if (var14 > arg2.field7193) {
                                    arg2.field7193 += var3.field431;
                                    if (var14 < arg2.field7193) {
                                        arg2.field7193 = var14;
                                    }
                                }
                            } else {
                                arg2.field7193 /= 2;
                            }
                        }
                        var11 = arg2.field7193 >> 9;
                        if (~var11 > -2) {
                            var11 = 1;
                        }
                    }
                    if (~var6 == ~var8 && ~var7 == ~var9) {
                        class219.field2861 = -1;
                    } else {
                        if (var8 <= var6) {
                            if (~var6 < ~var8) {
                                class657.field8769 |= 8;
                                arg2.field4410 -= var11;
                                if (~arg2.field4410 > ~var8) {
                                    arg2.field4410 = var8;
                                }
                            }
                        } else {
                            class657.field8769 |= 4;
                            arg2.field4410 += var11;
                            if (arg2.field4410 > var8) {
                                arg2.field4410 = var8;
                            }
                        }
                        if (~var11 > -33) {
                            class219.field2861 = var10;
                        } else {
                            class219.field2861 = 2;
                        }
                        if (var9 <= var7) {
                            if (var9 < var7) {
                                arg2.field4418 -= var11;
                                class657.field8769 |= 2;
                                if (arg2.field4418 < var9) {
                                    arg2.field4418 = var9;
                                }
                            }
                        } else {
                            class657.field8769 |= 1;
                            arg2.field4418 += var11;
                            if (~var9 > ~arg2.field4418) {
                                arg2.field4418 = var9;
                            }
                        }
                    }
                    if (arg2.field4410 == var8 && arg2.field4418 == var9) {
                        --arg2.field7203;
                        if (~arg2.field7199 < -1) {
                            --arg2.field7199;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        ++field2032;
        int var2 = -11 % ((59 - arg0) / 33);
        if (super.field8137.method2161(0)) {
            super.field8131 = 0;
        }
        if (~super.field8137.field4792.method3641(0) == -1) {
            super.field8131 = 0;
        }
        if (super.field8131 < 0 || super.field8131 > 2) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lqea;)V")
    public class145(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        int var3 = 37 % ((arg0 - 22) / 34);
        super.field8131 = arg1;
        ++field2039;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(ILqea;)V")
    public class145(int arg0, class339 arg1) {
        super(arg0, arg1);
    }
}
