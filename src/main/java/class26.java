import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class26 extends class12 {

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    private int field459 = 4096;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "Lnd;")
    public static class127 field463 = new class127(64);

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "Ltg;")
    public static class184 field468 = class135.method812("Wordpack geladen)3", 3);

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    public static int field470 = 0;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field466 = 0;

    @OriginalMember(owner = "client!cf", name = "db", descriptor = "Ltg;")
    public static class184 field475 = class135.method812("(Z", 3);

    @OriginalMember(owner = "client!cf", name = "bb", descriptor = "Ltg;")
    private static class184 field473 = class135.method812("glow1:", 3);

    @OriginalMember(owner = "client!cf", name = "eb", descriptor = "Ltg;")
    public static class184 field476 = class135.method812("<col=ff9040>", 3);

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "Ltg;")
    public static class184 field471 = field473;

    @OriginalMember(owner = "client!cf", name = "cb", descriptor = "Ltg;")
    public static class184 field474 = field473;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "Lcb;")
    public static class22 field467;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "[I")
    public static int[] field472;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(III)V")
    public static final void method169(int arg0, int arg1, int arg2) {
        class90 var3 = class190.field3704[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1693 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
    public static void method170(int arg0) {
        field473 = null;
        field476 = null;
        field471 = null;
        field472 = null;
        if (arg0 > -122) {
            method171((class159) null, -125);
        }
        field463 = null;
        field474 = null;
        field475 = null;
        field467 = null;
        field468 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class26() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field464;
        if (arg1 != 17) {
            field471 = null;
        }
        int[] var3 = super.field224.method7((byte) -86, arg0);
        if (super.field224.field53) {
            int[] var4 = this.method77(0, arg0 - 1 & class173.field3274, -120);
            int[] var5 = this.method77(0, arg0, -127);
            int[] var6 = this.method77(0, arg0 + 1 & class173.field3274, -121);
            for (int var7 = 0; var7 < class201.field3889; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field459;
                int var9 = (var5[var7 - -1 & class51.field937] + -var5[class51.field937 & var7 + -1]) * this.field459;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((var11 + 4096 - -var13) / 4096)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field465;
        if (arg1 == 0) {
            this.field459 = arg0.method611(false);
        }
        if (arg2) {
            field466 = 104;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lr;I)V")
    public static final void method171(class159 arg0, int arg1) {
        ++field462;
        if (class49.field903) {
            class16.method96(arg0, 0);
        } else {
            if (~class133.field2410 == -2 && class158.field2823 >= 715 && class134.field2429 >= 453) {
                class68.field1310 = !class68.field1310;
                if (!class68.field1310) {
                    class196.method1245(0, -124, false, class21.field389, class180.field3427, 255);
                } else {
                    class190.method1218((byte) 106);
                }
            }
            if (class127.field2281 != 5) {
                ++class182.field3500;
                if (class127.field2281 == 10) {
                    if (class176.field3335 != 2 && ~class141.field2565 == -1) {
                        if (class133.field2410 == 1) {
                            short var2 = 463;
                            byte var3 = 35;
                            byte var4 = 100;
                            byte var5 = 5;
                            if (class158.field2823 >= var5 && ~class158.field2823 >= ~(var4 + var5) && ~var2 >= ~class134.field2429 && var2 + var3 >= class134.field2429) {
                                class202.method1292(0);
                                return;
                            }
                        }
                        if (class43.field823 != null) {
                            class202.method1292(arg1);
                        }
                    }
                    int var6 = class133.field2410;
                    int var7 = class158.field2823;
                    int var8 = class134.field2429;
                    if (class2.field54 == arg1) {
                        short var9 = 302;
                        boolean var10 = false;
                        short var11 = 291;
                        if (~var6 == -2 && var7 >= var9 + -75 && ~var7 >= ~(var9 + 75) && var8 >= var11 + -20 && ~var8 >= ~(var11 + 20)) {
                            class172.field3260 = 0;
                            class2.field54 = 3;
                        }
                        if (~class65.field1247 != -1) {
                            while (class64.method368(0)) {
                                if (class3.field58 == 84) {
                                    var10 = true;
                                    break;
                                }
                            }
                        }
                        short var12 = 462;
                        if (var10 || var6 == 1 && ~(var12 + -75) >= ~var7 && var12 + 75 >= var7 && ~(var11 + -20) >= ~var8 && var11 + 20 >= var8) {
                            class2.field54 = 2;
                            class188.field3632 = class168.field3142;
                            class188.field3620 = class208.field4000;
                            class188.field3625 = class168.field3180;
                            class172.field3260 = 0;
                        }
                    } else {
                        if (class2.field54 != 2) {
                            if (~class2.field54 == -4) {
                                short var13 = 382;
                                short var14 = 321;
                                if (var6 == 1 && ~var7 <= ~(var13 - 75) && ~(var13 - -75) <= ~var7 && ~var8 <= ~(var14 - 20) && ~var8 >= ~(var14 - -20)) {
                                    class2.field54 = 0;
                                    return;
                                }
                            }
                        } else {
                            short var15 = 231;
                            int var21 = var15 + 30;
                            short var16 = 302;
                            short var17 = 321;
                            if (var6 == 1 && var21 + -15 <= var8 && ~var21 < ~var8) {
                                class172.field3260 = 0;
                            }
                            var21 += 15;
                            if (var6 == 1 && ~(var21 - 15) >= ~var8 && ~var21 < ~var8) {
                                class172.field3260 = 1;
                            }
                            var21 += 15;
                            if (~var6 == -2 && var7 >= var16 - 75 && ~(var16 - -75) <= ~var7 && ~var8 <= ~(var17 + -20) && var8 <= var17 + 20) {
                                class188.field3651 = class188.field3651.method1138(40).method1147(true);
                                if (~class188.field3651.method1159(false) == -1) {
                                    class186.method1179(class159.field2842, class168.field3169, class168.field3155, (byte) -40);
                                    return;
                                }
                                if (~class188.field3626.method1159(false) == -1) {
                                    class186.method1179(class127.field2285, class168.field3162, class168.field3164, (byte) -56);
                                    return;
                                }
                                class186.method1179(class164.field2937, class168.field3170, class168.field3152, (byte) -47);
                                class161.method972(20, (byte) 112);
                                return;
                            }
                            short var18 = 462;
                            if (~var6 == -2 && var18 + -75 <= var7 && var18 + 75 >= var7 && var17 + -20 <= var8 && ~var8 >= ~(var17 + 20)) {
                                class188.field3626 = class188.field3649;
                                class2.field54 = 0;
                                class188.field3651 = class188.field3649;
                            }
                            while (true) {
                                while (class64.method368(0)) {
                                    boolean var19 = false;
                                    for (int var20 = 0; ~class63.field1191.method1159(false) < ~var20; ++var20) {
                                        if (class16.field299 == class63.field1191.method1165(var20, false)) {
                                            var19 = true;
                                            break;
                                        }
                                    }
                                    if (class172.field3260 == 0) {
                                        if (class3.field58 == 85 && class188.field3651.method1159(false) > 0) {
                                            class188.field3651 = class188.field3651.method1162(0, -711833726, -1 + class188.field3651.method1159(false));
                                        }
                                        if (class3.field58 == 84 || ~class3.field58 == -81) {
                                            class172.field3260 = 1;
                                        }
                                        if (var19 && class188.field3651.method1159(false) < 12) {
                                            class188.field3651 = class188.field3651.method1163(class16.field299, -31334);
                                        }
                                    } else if (~class172.field3260 == -2) {
                                        if (~class3.field58 == -86 && ~class188.field3626.method1159(false) < -1) {
                                            class188.field3626 = class188.field3626.method1162(0, -711833726, class188.field3626.method1159(false) + -1);
                                        }
                                        if (~class3.field58 == -85 || ~class3.field58 == -81) {
                                            class172.field3260 = 0;
                                        }
                                        if (class65.field1247 != 0 && class3.field58 == 84) {
                                            class188.field3651 = class188.field3651.method1138(40).method1147(true);
                                            if (~class188.field3651.method1159(false) == -1) {
                                                class186.method1179(class159.field2842, class168.field3169, class168.field3155, (byte) -124);
                                                return;
                                            }
                                            if (~class188.field3626.method1159(false) == -1) {
                                                class186.method1179(class127.field2285, class168.field3162, class168.field3164, (byte) -99);
                                                return;
                                            }
                                            class186.method1179(class164.field2937, class168.field3170, class168.field3152, (byte) -89);
                                            class161.method972(20, (byte) 127);
                                            return;
                                        }
                                        if (var19 && class188.field3626.method1159(false) < 20) {
                                            class188.field3626 = class188.field3626.method1163(class16.field299, -31334);
                                        }
                                    }
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IB)Lsb;")
    public static final class170 method172(int arg0, byte arg1) {
        ++field461;
        class170 var2 = (class170) field463.method773((long) arg0, arg1 ^ -106);
        if (var2 != null) {
            return var2;
        } else if (arg1 != -105) {
            return null;
        } else {
            byte[] var3 = class194.field3760.method1249((byte) -115, arg0, 3);
            class170 var4 = new class170();
            if (var3 != null) {
                var4.method1054(-1, new class97(var3));
            }
            field463.method776(var4, (long) arg0, (byte) 83);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(II)V")
    public static final void method173(int arg0, int arg1) {
        if (arg0 != 3) {
            field466 = -29;
        }
        if (~arg1 == 0 && !class159.field2856) {
            class190.method1218((byte) 106);
        } else if (~arg1 != 0 && (class7.field131 != arg1 || !class59.method329(125)) && ~class136.field2480 != -1 && !class159.field2856) {
            class209.method1328(arg0 + -2, class180.field3427, class136.field2480, 2, arg1, false, 0);
        }
        ++field460;
        class7.field131 = arg1;
    }
}
