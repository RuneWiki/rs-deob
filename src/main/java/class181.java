import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class181 extends class89 implements class149 {

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Lni;")
    public class304 field2969;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Z")
    private boolean field2953;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "[I")
    public static int[] field2955 = new int[14];

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "J")
    public static volatile long field2972 = 0L;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "[Llf;")
    public static class129[] field2961;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "[Lgl;")
    public static class356[] field2960;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method190(byte arg0) {
        if (arg0 >= -126) {
            this.field2969 = null;
        }
        ++field2970;
        return this.field2969.method2043((byte) -83);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Le;Z)Lum;", line = 18)
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field2974;
        class348 var3 = this.field2969.method2038(arg1, super.field1113, 1, 1024, false, super.field1118, arg0);
        if (var3 == null) {
            return null;
        } else {
            class435 var4 = arg0.method713();
            var4.method1984(super.field1118, super.field1119, super.field1113);
            class306 var5 = null;
            if (this.field2953) {
                var5 = class203.method1443(-101, 1);
            }
            if (this.field2969.field4819 == null) {
                var3.method26(var4, var5 != null ? var5.field4856[0] : null, 0);
            } else {
                class198 var6 = this.field2969.field4819.method489();
                arg0.method561(var3, var6, var4, var5 != null ? var5.field4856[0] : null, 0);
            }
            this.field2969.method2046(true, arg0, super.field1118 >> 7, super.field1113 >> 7, super.field1113 >> 7, super.field1118 >> 7, 2, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Le;Lfa;IIIIIIIZI)V", line = 54)
    public class181(class312 arg0, class127 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class232.method1646(arg3, (byte) 120, arg2));
        this.field2969 = new class304(arg0, arg1, arg2, arg3, arg4, arg5, super.field1118, super.field1113, arg9, arg10);
        this.field2953 = arg1.field2021 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 64)
    public final void method198(int arg0) {
        if (arg0 != -32289) {
            field2966 = 104;
        }
        ++field2952;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)I", line = 74)
    public static final int method1243(int arg0, byte arg1) {
        ++field2963;
        int var2 = 0;
        if (~arg0 > -1 || arg0 >= 65536) {
            arg0 >>>= 16;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 8;
        }
        if (arg1 <= 103) {
            field2960 = null;
        }
        if (~arg0 <= -17) {
            var2 += 4;
            arg0 >>>= 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 2;
        }
        if (arg0 >= 1) {
            ++var2;
            arg0 >>>= 1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)I", line = 121)
    public final int method183(byte arg0) {
        int var2 = -109 % ((49 - arg0) / 47);
        ++field2965;
        return this.field2969.field4805;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)I", line = 131)
    public final int method195(int arg0) {
        ++field2956;
        if (arg0 != 3076) {
            field2960 = null;
        }
        return this.field2969.field4808;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Z", line = 147)
    public final boolean method186(int arg0) {
        ++field2971;
        if (arg0 != 0) {
            method1243(-119, (byte) -72);
        }
        return false;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)I", line = 159)
    public final int method197(boolean arg0) {
        if (!arg0) {
            field2960 = null;
        }
        ++field2964;
        return this.field2969.field4834;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILe;IIZLhm;I)V", line = 174)
    public final void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6) {
        ++field2954;
        if (arg3 != 0) {
            this.method183((byte) 81);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIILe;)Z", line = 186)
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        ++field2957;
        class348 var5 = this.field2969.method2038(false, super.field1113, 1, arg1, false, super.field1118, arg3);
        if (var5 == null) {
            return false;
        } else {
            class435 var6 = arg3.method713();
            var6.method1984(super.field1118, super.field1119, super.field1113);
            return var5.method39(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V", line = 204)
    public final void method193(int arg0) {
        ++field2973;
        if (arg0 != 0) {
            this.method186(26);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ltm;B)V", line = 215)
    public static final void method1244(class219 arg0, byte arg1) {
        ++field2975;
        if (class144.field2267 < 400) {
            if (class261.field4201 != arg0) {
                if (arg1 != -94) {
                    method1245(-50);
                }
                String var8;
                if (~arg0.field3605 == -1) {
                    boolean var2 = true;
                    if (class261.field4201.field3604 != -1 && ~arg0.field3604 != 0) {
                        int var3 = arg0.field3603 < class261.field4201.field3603 ? class261.field4201.field3603 : arg0.field3603;
                        int var4 = class261.field4201.field3604 < arg0.field3604 ? class261.field4201.field3604 : arg0.field3604;
                        int var5 = var3 * 10 / 100 + 5 - -var4;
                        int var6 = class261.field4201.field3603 - arg0.field3603;
                        if (~var6 > -1) {
                            var6 = -var6;
                        }
                        if (var6 > var5) {
                            var2 = false;
                        }
                    }
                    String var7 = ~class61.field787 != -2 ? class60.field771 : class235.field3941;
                    if (~arg0.field3603 <= ~arg0.field3593) {
                        var8 = arg0.method1566(true, arg1 ^ 13899) + (var2 ? class447.method2763((byte) -5, arg0.field3603, class261.field4201.field3603) : "<col=ffffff>") + " (" + var7 + arg0.field3603 + ")";
                    } else {
                        var8 = arg0.method1566(true, -13847) + (!var2 ? "<col=ffffff>" : class447.method2763((byte) -5, arg0.field3603, class261.field4201.field3603)) + " (" + var7 + arg0.field3603 + "+" + (-arg0.field3603 + arg0.field3593) + ")";
                    }
                } else {
                    var8 = arg0.method1566(true, arg1 ^ 13899) + " (" + class108.field1515 + arg0.field3605 + ")";
                }
                if (class374.field5639 != 1) {
                    if (class449.field6546) {
                        if (~(class379.field5737 & 8) != -1) {
                            ++class217.field3556;
                            class413.method2587((long) arg0.field1868, class306.field4854, 0, class248.field4058, 44, 0, class213.field3414 + " -> <col=ffffff>" + var8, -233);
                        }
                    } else {
                        for (int var9 = 7; ~var9 <= -1; --var9) {
                            if (class223.field3703[var9] != null) {
                                short var10 = 0;
                                if (~class61.field787 == -1 && class223.field3703[var9].equalsIgnoreCase(class354.field5450)) {
                                    if (arg0.field3603 > class261.field4201.field3603) {
                                        var10 = 2000;
                                    }
                                    if (class261.field4201.field3586 != 0 && arg0.field3586 != 0) {
                                        if (~class261.field4201.field3586 == ~arg0.field3586) {
                                            var10 = 2000;
                                        } else {
                                            var10 = 0;
                                        }
                                    }
                                } else if (class343.field5284[var9]) {
                                    var10 = 2000;
                                }
                                short var11 = (short) (class351.field5420[var9] + var10);
                                int var12 = ~class64.field836[var9] == 0 ? class32.field398 : class64.field836[var9];
                                ++class238.field3967;
                                class413.method2587((long) arg0.field1868, class223.field3703[var9], 0, var12, var11, 0, "<col=ffffff>" + var8, -233);
                            }
                        }
                    }
                } else {
                    class413.method2587((long) arg0.field1868, class318.field4986, 0, class71.field878, 32, 0, class287.field4606 + " -> <col=ffffff>" + var8, -233);
                    ++class241.field3990;
                }
                for (class418 var13 = (class418) class86.field1089.method253((byte) -6); var13 != null; var13 = (class418) class86.field1089.method247((byte) -122)) {
                    if (~var13.field6192 == -35) {
                        var13.field6197 = "<col=ffffff>" + var8;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Le;B)V", line = 354)
    public final void method196(class312 arg0, byte arg1) {
        ++field2951;
        if (arg1 <= -66) {
            class348 var3 = this.field2969.method2038(true, super.field1113, 1, 131072, true, super.field1118, arg0);
            if (var3 != null) {
                this.field2969.method2046(false, arg0, super.field1118 >> 7, super.field1113 >> 7, super.field1113 >> 7, super.field1118 >> 7, 2, var3);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Le;IB)Lid;", line = 373)
    public final class348 method200(class312 arg0, int arg1, byte arg2) {
        if (arg2 != -52) {
            method1245(13);
        }
        ++field2967;
        return this.field2969.method2038(false, 0, 1, arg1, false, 0, arg0);
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V", line = 384)
    public static void method1245(int arg0) {
        field2961 = null;
        if (arg0 < 96) {
            field2955 = null;
        }
        field2960 = null;
        field2955 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Le;B)V", line = 400)
    public final void method199(class312 arg0, byte arg1) {
        ++field2968;
        this.field2969.method2049(arg0, (byte) -115);
        if (arg1 != -22) {
            field2959 = 69;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Le;I)V", line = 413)
    public final void method194(class312 arg0, int arg1) {
        int var3 = 96 / ((-19 - arg1) / 62);
        ++field2958;
        this.field2969.method2051((byte) 126, arg0);
    }
}
