import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class549 extends class497 {

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public static int field7888 = 0;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "Lfba;")
    public static class27 field7883 = new class27(22, -1);

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field7894 = 0;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "[[I")
    public static int[][] field7895 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!um", name = "x", descriptor = "Lmea;")
    public static class451 field7893 = null;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)Z", line = 4)
    public final boolean method921(int arg0) {
        int var2 = -91 % ((19 - arg0) / 52);
        ++field7886;
        return false;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V", line = 15)
    public static void method3277(int arg0) {
        field7895 = null;
        int var1 = 32 % ((arg0 - -3) / 58);
        field7883 = null;
        field7893 = null;
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)Ljq;", line = 26)
    public static final class536 method3278(int arg0) {
        if (arg0 != 7) {
            field7893 = null;
        }
        ++field7887;
        try {
            return (class536) Class.forName("pr").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZBLjava/lang/String;I)V", line = 44)
    public static final void method3279(boolean arg0, byte arg1, String arg2, int arg3) {
        ++field7882;
        class544.method3251((byte) -126);
        class84.method640(arg1 + 40);
        class190.method1327(-22101);
        class716.method4020(arg0, (byte) 47, arg2, arg3);
        class514.method3101(arg1 + 153);
        class455.method2711(class37.field491, -128);
        class262.method1699(class37.field491, (byte) 106);
        class662.method3779(class152.field2163, (byte) 88, class37.field491);
        class74.method586((byte) -64);
        class346.method2193(class459.field6425, 4523);
        class351.method2224((byte) 119);
        class594.method3464(true);
        if (arg1 != -40) {
            method3280(-95, (class330) null, false);
        }
        if (class266.field3873 == 3) {
            class225.method1539(false, 4);
        } else if (~class266.field3873 == -8) {
            class225.method1539(false, 8);
        } else if (~class266.field3873 == -11) {
            class225.method1539(false, 11);
        } else {
            if (~class266.field3873 == -2 || ~class266.field3873 == -3) {
                class309.method1990((byte) -16);
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILvn;Z)V", line = 81)
    public static final void method3280(int arg0, class330 arg1, boolean arg2) {
        ++field7881;
        class539 var3 = arg1.method2096(0);
        if (~arg1.field4668 == -1) {
            class348.field4868 = -1;
            arg1.field4676 = 0;
            class206.field3194 = 0;
        } else {
            if (arg1.field4604 != -1 && arg1.field4580 == 0) {
                class607 var4 = class563.field7993.method651(arg1.field4604, (byte) 96);
                if (~arg1.field4675 < -1 && ~var4.field8489 == -1) {
                    class348.field4868 = -1;
                    class206.field3194 = 0;
                    ++arg1.field4676;
                    return;
                }
                if (arg1.field4675 <= 0 && ~var4.field8503 == -1) {
                    ++arg1.field4676;
                    class206.field3194 = 0;
                    class348.field4868 = -1;
                    return;
                }
            }
            if (arg0 != 5) {
                field7895 = null;
            }
            for (int var5 = 0; ~arg1.field4638.length < ~var5; ++var5) {
                if (~arg1.field4638[var5].field10142 != 0 && class192.field2961 >= arg1.field4638[var5].field10149) {
                    class278 var20 = class456.field6385.method2382(arg1.field4638[var5].field10142, (byte) -127);
                    if (var20.field4042 && ~var20.field4040 != 0) {
                        class607 var21 = class563.field7993.method651(var20.field4040, (byte) 119);
                        if (arg1.field4675 > 0 && ~var21.field8489 == -1) {
                            class206.field3194 = 0;
                            class348.field4868 = -1;
                            ++arg1.field4676;
                            return;
                        }
                        if (~arg1.field4675 >= -1 && var21.field8503 == 0) {
                            class348.field4868 = -1;
                            ++arg1.field4676;
                            class206.field3194 = 0;
                            return;
                        }
                    }
                }
            }
            int var6 = arg1.field5742;
            int var7 = arg1.field5746;
            int var8 = arg1.field4670[arg1.field4668 - 1] * 512 - -(256 * arg1.method2102(true));
            int var9 = arg1.field4672[arg1.field4668 + -1] * 512 - -(arg1.method2102(true) * 256);
            if (~var8 < ~var6) {
                if (var7 >= var9) {
                    if (~var7 < ~var9) {
                        arg1.method2099(14336, -107);
                    } else {
                        arg1.method2099(12288, arg0 ^ -128);
                    }
                } else {
                    arg1.method2099(10240, arg0 ^ 23);
                }
            } else if (~var6 >= ~var8) {
                if (var9 <= var7) {
                    if (var7 > var9) {
                        arg1.method2099(0, 52);
                    }
                } else {
                    arg1.method2099(8192, 124);
                }
            } else if (var7 < var9) {
                arg1.method2099(6144, -95);
            } else if (~var9 <= ~var7) {
                arg1.method2099(4096, -97);
            } else {
                arg1.method2099(2048, -106);
            }
            byte var10 = arg1.field4674[arg1.field4668 + -1];
            if (!arg2 && (~(-var6 + var8) < -1025 || -var6 + var8 < -1024 || var9 - var7 > 1024 || -var7 + var9 < -1024)) {
                arg1.field5746 = var9;
                arg1.field5742 = var8;
                arg1.method2103(false, false, arg1.field4628);
                class206.field3194 = 0;
                if (~arg1.field4675 < -1) {
                    --arg1.field4675;
                }
                class348.field4868 = -1;
                --arg1.field4668;
            } else {
                int var11 = 16;
                boolean var12 = true;
                if (arg1 instanceof class665) {
                    var12 = ((class665) arg1).field9240.field1674;
                }
                if (var12) {
                    int var13 = -arg1.field4647.field10428 + arg1.field4628;
                    if (var13 != 0 && ~arg1.field4584 == 0 && ~arg1.field4619 != -1) {
                        var11 = 8;
                    }
                    if (!arg2 && arg1.field4668 > 2) {
                        var11 = 24;
                    }
                    if (!arg2 && arg1.field4668 > 3) {
                        var11 = 32;
                    }
                } else {
                    if (!arg2 && ~arg1.field4668 < -2) {
                        var11 = 24;
                    }
                    if (!arg2 && ~arg1.field4668 < -3) {
                        var11 = 32;
                    }
                }
                if (arg1.field4676 > 0 && arg1.field4668 > 1) {
                    var11 = 32;
                    --arg1.field4676;
                }
                if (~var10 == -3) {
                    var11 <<= 1;
                } else if (var10 == 0) {
                    var11 >>= 1;
                }
                if (~var3.field7780 != 0) {
                    int var14 = var11 << 9;
                    if (~arg1.field4668 == -2) {
                        int var15 = arg1.field4671 * arg1.field4671;
                        int var16 = (~arg1.field5742 >= ~var8 ? var8 - arg1.field5742 : -var8 + arg1.field5742) << 9;
                        int var17 = (var9 < arg1.field5746 ? -var9 + arg1.field5746 : var9 - arg1.field5746) << 9;
                        int var18 = ~var17 <= ~var16 ? var17 : var16;
                        int var19 = var3.field7780 * 2 * var18;
                        if (~var15 < ~var19) {
                            arg1.field4671 /= 2;
                        } else if (~(var15 / 2) < ~var18) {
                            arg1.field4671 -= var3.field7780;
                            if (arg1.field4671 < 0) {
                                arg1.field4671 = 0;
                            }
                        } else if (~arg1.field4671 > ~var14) {
                            arg1.field4671 += var3.field7780;
                            if (~var14 > ~arg1.field4671) {
                                arg1.field4671 = var14;
                            }
                        }
                    } else if (~var14 < ~arg1.field4671) {
                        arg1.field4671 += var3.field7780;
                        if (arg1.field4671 > var14) {
                            arg1.field4671 = var14;
                        }
                    } else if (~arg1.field4671 < -1) {
                        arg1.field4671 -= var3.field7780;
                        if (~arg1.field4671 > -1) {
                            arg1.field4671 = 0;
                        }
                    }
                    var11 = arg1.field4671 >> 9;
                    if (~var11 > -2) {
                        var11 = 1;
                    }
                }
                class206.field3194 = 0;
                if (~var6 == ~var8 && var7 == var9) {
                    class348.field4868 = -1;
                } else {
                    if (~var6 <= ~var8) {
                        if (var8 < var6) {
                            arg1.field5742 -= var11;
                            class206.field3194 |= 8;
                            if (~arg1.field5742 > ~var8) {
                                arg1.field5742 = var8;
                            }
                        }
                    } else {
                        class206.field3194 |= 4;
                        arg1.field5742 += var11;
                        if (arg1.field5742 > var8) {
                            arg1.field5742 = var8;
                        }
                    }
                    if (~var11 <= -33) {
                        class348.field4868 = 2;
                    } else {
                        class348.field4868 = var10;
                    }
                    if (~var9 < ~var7) {
                        arg1.field5746 += var11;
                        class206.field3194 |= 1;
                        if (~var9 > ~arg1.field5746) {
                            arg1.field5746 = var9;
                        }
                    } else if (var7 > var9) {
                        arg1.field5746 -= var11;
                        class206.field3194 |= 2;
                        if (~arg1.field5746 > ~var9) {
                            arg1.field5746 = var9;
                        }
                    }
                }
                if (~arg1.field5742 == ~var8 && arg1.field5746 == var9) {
                    --arg1.field4668;
                    if (~arg1.field4675 < -1) {
                        --arg1.field4675;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZB)V", line = 406)
    public final void method928(boolean arg0, byte arg1) {
        ++field7890;
        int var3 = -60 / ((24 - arg1) / 46);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V", line = 415)
    public final void method929(int arg0, boolean arg1) {
        if (arg0 >= -83) {
            method3278(107);
        }
        ++field7884;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BILkja;)V", line = 425)
    public final void method925(byte arg0, int arg1, class684 arg2) {
        ++field7889;
        super.field7086.method1118(0, arg2);
        if (arg0 < 83) {
            this.method921(-113);
        }
        super.field7086.method1189(76, arg1);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IBI)V", line = 439)
    public final void method923(int arg0, byte arg1, int arg2) {
        if (arg1 <= 5) {
            this.method928(true, (byte) 95);
        }
        ++field7892;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lpj;)V", line = 454)
    public class549(class156 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V", line = 457)
    public static final void method3281(int arg0) {
        class791.field10851 = new class266();
        ++field7891;
        if (arg0 != 0) {
            method3281(-36);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 472)
    public final void method926(int arg0) {
        ++field7885;
        if (arg0 != -339) {
            field7883 = null;
        }
    }
}
