import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class420 extends class66 {

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "Z")
    public boolean field6309 = false;

    @OriginalMember(owner = "client!rj", name = "ib", descriptor = "Z")
    public boolean field6321 = false;

    @OriginalMember(owner = "client!rj", name = "jb", descriptor = "Lri;")
    public static class73 field6322 = new class73(70, -1);

    @OriginalMember(owner = "client!rj", name = "lb", descriptor = "Ljava/lang/String;")
    public static String field6324 = "";

    @OriginalMember(owner = "client!rj", name = "kb", descriptor = "[I")
    public static int[] field6323 = new int[500];

    @OriginalMember(owner = "client!rj", name = "mb", descriptor = "Lng;")
    public static class226 field6325 = new class226(10);

    @OriginalMember(owner = "client!rj", name = "ob", descriptor = "I")
    public static int field6327 = -2;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!rj", name = "fb", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!rj", name = "gb", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!rj", name = "hb", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!rj", name = "nb", descriptor = "Z")
    public static boolean field6326;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V", line = 3)
    public static void method2521(byte arg0) {
        if (arg0 < 36) {
            method2528(false);
        }
        field6322 = null;
        field6325 = null;
        field6324 = null;
        field6323 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(JI)V", line = 18)
    public static final void method2522(long arg0, int arg1) {
        ++field6318;
        if (class108.field1553 != null) {
            if (~class140.field2103 != -2 && class140.field2103 != 5) {
                if (class140.field2103 == 4) {
                    class57.method348(arg0, 0);
                }
            } else {
                class456.method2737(-1, arg0);
            }
        }
        class287.method1853((long) class317.field4559, (byte) 125, class348.field5015);
        if (~class6.field79 != 0) {
            class325.method2011(class6.field79, arg1 + 8254);
        }
        if (arg1 != -8137) {
            method2528(false);
        }
        for (int var3 = 0; class446.field6641 > var3; ++var3) {
            if (class315.field4503[var3]) {
                class343.field4944[var3] = true;
            }
            class16.field183[var3] = class315.field4503[var3];
            class315.field4503[var3] = false;
        }
        field6327 = class317.field4559;
        if (class348.field5015.method1073()) {
            class57.field879 = true;
        }
        if (class6.field79 != -1) {
            class446.field6641 = 0;
            class197.method1343((byte) 9);
        }
        class348.field5015.method1112();
        class250.method1673((byte) 44, class348.field5015);
        int var4 = class289.method1857(0);
        if (var4 == -1) {
            var4 = class195.field2839;
        }
        if (~var4 == 0) {
            var4 = class202.field2925;
        }
        class30.method176(false, var4);
        class109.method671(99, class500.field7365.field1768, class500.field7364, class500.field7365.field1769, class500.field7365.field1763);
        class500.field7364 = 0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lji;I)V", line = 88)
    public final void method2523(class432 arg0, int arg1) {
        ++field6314;
        class71 var3 = null;
        try {
            if (arg1 > -18) {
                this.method2525(63);
            }
            class281 var4 = arg0.method2589("", true);
            while (var4.field4032 == 0) {
                class246.method1659((byte) 117, 1L);
            }
            if (~var4.field4032 == -2) {
                var3 = (class71) var4.field4030;
                class209 var5 = this.method2525(2);
                var3.method408(var5.field3037, 0, -120, var5.field3036);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method410(-121);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)I", line = 127)
    public final int method2524(int arg0, int arg1) {
        ++field6315;
        if (this.field6309) {
            return 0;
        } else if (!this.method2532(1, arg0)) {
            return 1;
        } else if (arg1 != -14120) {
            return -104;
        } else {
            return super.field988 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Ldh;", line = 146)
    public final class209 method2525(int arg0) {
        ++field6316;
        class209 var2 = new class209(41);
        var2.method1410(17, arg0 + -27647);
        var2.method1410(super.field1024, arg0 + -27647);
        var2.method1410(super.field992 ? 1 : 0, -27645);
        var2.method1410(super.field988 ? 1 : 0, arg0 + -27647);
        var2.method1410(super.field993 ? 1 : 0, -27645);
        var2.method1410(super.field1004 ? 1 : 0, arg0 + -27647);
        var2.method1410(0, -27645);
        var2.method1410(!super.field1014 ? 0 : 1, -27645);
        var2.method1410(super.field1020 ? 1 : 0, -27645);
        var2.method1410(super.field1017 ? 1 : 0, -27645);
        var2.method1410(super.field984, -27645);
        if (arg0 != 2) {
            return null;
        } else {
            var2.method1410(super.field1003, -27645);
            var2.method1410(super.field986 ? 1 : 0, arg0 + -27647);
            var2.method1410(super.field985 ? 1 : 0, -27645);
            var2.method1410(!super.field997 ? 0 : 1, -27645);
            var2.method1410(!super.field1019 ? 0 : 1, -27645);
            var2.method1410(super.field1002, -27645);
            var2.method1410(!super.field1006 ? 0 : 1, -27645);
            var2.method1410(super.field1022, -27645);
            var2.method1410(super.field1018, -27645);
            var2.method1410(super.field996, -27645);
            var2.method1413(arg0 + -126, super.field1026);
            var2.method1413(-123, super.field1000);
            var2.method1410(class107.method662((byte) -127), -27645);
            var2.method1415(super.field995, (byte) -91);
            var2.method1410(super.field991, -27645);
            var2.method1410(super.field979 ? 1 : 0, -27645);
            var2.method1410(!super.field1013 ? 0 : 1, -27645);
            var2.method1410(super.field1001, -27645);
            var2.method1410(super.field980 ? 1 : 0, arg0 + -27647);
            var2.method1410(super.field1016 ? 1 : 0, arg0 + -27647);
            var2.method1410(super.field987, -27645);
            var2.method1410(super.field998 ? 1 : 0, arg0 ^ -27647);
            var2.method1410(super.field994, -27645);
            var2.method1410(super.field1007, arg0 ^ -27647);
            var2.method1410(super.field989 ? 1 : 0, arg0 + -27647);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lrb;IZ)V", line = 196)
    public static final void method2526(class234 arg0, int arg1, boolean arg2) {
        if (class337.field4745) {
            arg1 = 0;
            class337.field4745 = false;
        }
        if (arg2) {
            field6323 = null;
        }
        ++field6311;
        if (class261.field3839 == null || !class261.field3839.method1595(128, arg0)) {
            class261.field3839 = arg0;
            class321.field4606 = class256.method1708((byte) 118);
            class451.field6717 = arg1;
            class229.field3426 = arg1;
            if (class229.field3426 != 0) {
                class317.field4538 = class202.field2926;
                class62.field936 = class293.field4194;
                class419.field6306 = class246.field3628;
                class141.field2116 = class242.field3576;
                class429.field6413 = class169.field2506;
                class509.field7431 = class369.field5648;
                class92.field1374 = class357.field5492;
                class20.field227 = class381.field5777;
                class289.field4158 = class43.field677;
                class424.field6372 = class343.field4966;
                return;
            }
            class133.method888(-1);
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lji;)V", line = 302)
    public class420(class432 arg0) {
        super.field1024 = 3;
        this.method2529(14110, true);
        super.field984 = 2;
        super.field996 = 127;
        super.field1014 = true;
        super.field982 = 0;
        super.field986 = true;
        super.field987 = 1;
        super.field1020 = true;
        super.field993 = true;
        super.field988 = true;
        super.field1003 = 0;
        super.field1017 = true;
        super.field1000 = 0;
        super.field1004 = true;
        super.field985 = false;
        super.field997 = true;
        super.field1006 = true;
        super.field1002 = 0;
        super.field1026 = 0;
        super.field1022 = 127;
        super.field1019 = true;
        super.field1018 = 255;
        if (class34.field363 < 96) {
            class66.method388((byte) -49, 0);
        } else {
            class66.method388((byte) -49, 2);
        }
        super.field991 = 2;
        super.field1001 = 0;
        super.field998 = true;
        super.field980 = false;
        super.field1007 = ~class473.field6960 == -2 ? 2 : 4;
        super.field994 = 2;
        super.field1013 = false;
        super.field1016 = true;
        super.field995 = 0;
        super.field979 = false;
        class71 var2 = null;
        try {
            class281 var3 = arg0.method2589("", true);
            while (var3.field4032 == 0) {
                class246.method1659((byte) 117, 1L);
            }
            if (~var3.field4032 == -2) {
                var2 = (class71) var3.field4030;
                byte[] var4 = new byte[(int) var2.method409((byte) -98)];
                int var6;
                for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                    var6 = var2.method411(var5, (byte) -112, var4.length + -var5, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method2531(false, new class209(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method410(-116);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V", line = 241)
    public static final void method2527(boolean arg0) {
        class29.field302.method1539(-86);
        ++field6313;
        if (arg0) {
            method2526((class234) null, 105, false);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V", line = 254)
    public static final void method2528(boolean arg0) {
        if (arg0) {
            method2528(false);
        }
        if (class282.field4041 != null) {
            class282.field4041.method1108(-7682);
            class282.field4041 = null;
            class220.field3240 = null;
        }
        ++field6317;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)V", line = 273)
    public final void method2529(int arg0, boolean arg1) {
        super.field992 = arg1;
        ++field6310;
        if (arg0 == 14110) {
            if (class252.field3743 != null) {
                class252.field3743.method2688((byte) 116, !this.method2532(1, class170.field2529));
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(II)Z", line = 287)
    public final boolean method2530(int arg0, int arg1) {
        ++field6320;
        return ~arg0 != arg1 ? true : super.field992;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLdh;)V", line = 387)
    private final void method2531(boolean arg0, class209 arg1) {
        ++field6312;
        if (~(arg1.field3036.length + -arg1.field3037) <= -2) {
            int var3 = arg1.method1428(32122);
            if (var3 >= 0 && ~var3 >= -18) {
                byte var4;
                if (var3 == 17) {
                    var4 = 40;
                } else if (var3 != 16) {
                    if (~var3 != -16) {
                        if (~var3 != -15) {
                            if (var3 != 13) {
                                if (var3 != 12) {
                                    if (~var3 == -12) {
                                        var4 = 33;
                                    } else if (~var3 != -11) {
                                        if (~var3 != -10) {
                                            if (var3 == 8) {
                                                var4 = 30;
                                            } else if (var3 != 7) {
                                                if (var3 != 6) {
                                                    if (~var3 != -6) {
                                                        if (var3 == 4) {
                                                            var4 = 24;
                                                        } else if (var3 != 3) {
                                                            if (~var3 == -3) {
                                                                var4 = 22;
                                                            } else if (~var3 == -2) {
                                                                var4 = 23;
                                                            } else {
                                                                var4 = 19;
                                                            }
                                                        } else {
                                                            var4 = 23;
                                                        }
                                                    } else {
                                                        var4 = 28;
                                                    }
                                                } else {
                                                    var4 = 28;
                                                }
                                            } else {
                                                var4 = 29;
                                            }
                                        } else {
                                            var4 = 31;
                                        }
                                    } else {
                                        var4 = 32;
                                    }
                                } else {
                                    var4 = 34;
                                }
                            } else {
                                var4 = 35;
                            }
                        } else {
                            var4 = 36;
                        }
                    } else {
                        var4 = 37;
                    }
                } else {
                    var4 = 38;
                }
                if (~var4 >= ~(arg1.field3036.length + -arg1.field3037)) {
                    super.field1024 = arg1.method1428(32122);
                    if (super.field1024 >= 1) {
                        if (super.field1024 > 4) {
                            super.field1024 = 4;
                        }
                    } else {
                        super.field1024 = 1;
                    }
                    this.method2529(14110, arg1.method1428(32122) == 1);
                    super.field988 = arg1.method1428(32122) == 1;
                    super.field993 = arg1.method1428(32122) == 1;
                    super.field1004 = arg1.method1428(32122) == 1;
                    super.field987 = arg1.method1428(32122) == 1 ? 1 : 0;
                    super.field1014 = ~arg1.method1428(32122) == -2;
                    super.field1020 = ~arg1.method1428(32122) == -2;
                    super.field1017 = arg1.method1428(32122) == 1;
                    super.field984 = arg1.method1428(32122);
                    if (super.field984 > 2) {
                        super.field984 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field1003 = arg1.method1428(32122);
                    }
                    if (var3 < 2) {
                        super.field986 = ~arg1.method1428(32122) == -2;
                        arg1.method1428(32122);
                    } else {
                        super.field986 = arg1.method1428(32122) == 1;
                        if (~var3 <= -18) {
                            super.field985 = arg1.method1428(32122) == 1;
                        }
                    }
                    super.field997 = ~arg1.method1428(32122) == -2;
                    super.field1019 = ~arg1.method1428(32122) == -2;
                    super.field1002 = arg1.method1428(32122);
                    if (super.field1002 > 2) {
                        super.field1002 = 2;
                    }
                    super.field982 = super.field1002;
                    super.field1006 = ~arg1.method1428(32122) == -2;
                    super.field1022 = arg1.method1428(32122);
                    if (~super.field1022 < -128) {
                        super.field1022 = 127;
                    }
                    super.field1018 = arg1.method1428(32122);
                    super.field996 = arg1.method1428(32122);
                    if (!arg0) {
                        if (super.field996 > 127) {
                            super.field996 = 127;
                        }
                        if (var3 >= 1) {
                            super.field1026 = arg1.method1450((byte) 101);
                            super.field1000 = arg1.method1450((byte) 105);
                        }
                        if (~var3 <= -4 && ~var3 > -7) {
                            arg1.method1428(32122);
                        }
                        if (~var3 <= -5) {
                            int var5 = arg1.method1428(32122);
                            if (~var5 > -1 || ~var5 < -3) {
                                var5 = 0;
                            }
                            if (~class34.field363 > -97) {
                                var5 = 0;
                            }
                            class66.method388((byte) -49, var5);
                        }
                        if (~var3 <= -6) {
                            super.field995 = arg1.method1452(65280);
                        }
                        int var6 = 0;
                        if (var3 >= 6) {
                            super.field991 = var6 = arg1.method1428(32122);
                        }
                        if (~super.field991 != -2 && ~super.field991 != -3) {
                            super.field991 = 2;
                        }
                        if (~var3 <= -8) {
                            super.field979 = arg1.method1428(32122) == 1;
                        }
                        if (var3 >= 8) {
                            super.field1013 = ~arg1.method1428(32122) == -2;
                        }
                        if (var3 >= 9) {
                            super.field1001 = arg1.method1428(32122);
                        }
                        if (super.field1001 < 0 || ~super.field1001 < ~class184.method1270(class34.field363, 2)) {
                            super.field1001 = 0;
                        }
                        if (var3 >= 10) {
                            super.field980 = arg1.method1428(32122) != 0;
                        }
                        if (~var3 <= -12) {
                            super.field1016 = ~arg1.method1428(32122) != -1;
                        }
                        if (~var3 <= -13) {
                            super.field987 = arg1.method1428(32122);
                        }
                        if (~super.field987 > -1 || super.field987 > 2) {
                            super.field987 = 1;
                        }
                        if (~var3 <= -14) {
                            super.field998 = arg1.method1428(32122) == 1;
                        }
                        if (~var3 <= -15) {
                            super.field994 = arg1.method1428(32122);
                        } else if (~var6 != -1) {
                            super.field994 = 1;
                        } else {
                            super.field994 = 2;
                        }
                        if (~super.field994 > -1 || super.field994 > 3) {
                            super.field994 = 2;
                        }
                        if (var3 >= 15) {
                            super.field1007 = arg1.method1428(32122);
                            if (super.field1007 < 0 || super.field1007 > 4) {
                                super.field1007 = class473.field6960 != 1 ? 4 : 2;
                            }
                        }
                        if (var3 >= 16) {
                            super.field989 = arg1.method1428(32122) == 1;
                        }
                        if (var3 < 17 && super.field994 == 0) {
                            super.field994 = 2;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(II)Z", line = 640)
    public final boolean method2532(int arg0, int arg1) {
        ++field6319;
        if (arg0 != 1) {
            this.method2532(-122, -22);
        }
        return ~arg1 == -1 && !this.field6321 ? super.field992 : true;
    }
}
