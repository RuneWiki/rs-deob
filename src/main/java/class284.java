import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class284 extends class303 implements class149 {

    @OriginalMember(owner = "client!np", name = "J", descriptor = "Lni;")
    public class304 field4555;

    @OriginalMember(owner = "client!np", name = "P", descriptor = "Z")
    private boolean field4561;

    @OriginalMember(owner = "client!np", name = "A", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!np", name = "H", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!np", name = "I", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!np", name = "K", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!np", name = "L", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!np", name = "M", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!np", name = "N", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!np", name = "O", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!np", name = "R", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!np", name = "S", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!np", name = "T", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!np", name = "U", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!np", name = "W", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!np", name = "X", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!np", name = "Y", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!np", name = "B", descriptor = "Le;")
    public static class312 field4547;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(B)Z", line = 4)
    public final boolean method190(byte arg0) {
        if (arg0 >= -126) {
            this.field4561 = false;
        }
        ++field4562;
        return this.field4555.method2043((byte) -83);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Le;IB)Lid;", line = 16)
    public final class348 method200(class312 arg0, int arg1, byte arg2) {
        ++field4549;
        return arg2 != -52 ? null : this.field4555.method2038(false, 0, arg2 + 53, arg1, false, 0, arg0);
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Le;B)V", line = 28)
    public final void method196(class312 arg0, byte arg1) {
        if (arg1 > -66) {
            this.field4555 = null;
        }
        ++field4558;
        class348 var3 = this.field4555.method2038(true, super.field4786, 1, 131072, false, super.field4787, arg0);
        if (var3 != null) {
            this.field4555.method2046(false, arg0, super.field4787 >> 7, super.field4786 >> 7, super.field4786 >> 7, super.field4787 >> 7, 2, var3);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)I", line = 45)
    public final int method183(byte arg0) {
        int var2 = 94 % ((49 - arg0) / 47);
        ++field4565;
        return this.field4555.field4805;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)I", line = 56)
    public final int method195(int arg0) {
        ++field4553;
        if (arg0 != 3076) {
            method1928(51, 23, 46, (byte[]) null);
        }
        return this.field4555.field4808;
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(I)I", line = 67)
    public final int method1925(int arg0) {
        ++field4568;
        return arg0 != -9990 ? -2 : this.field4555.method2045((byte) 2);
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Le;Lfa;IIIIIIIZIIII)V", line = 78)
    public class284(class312 arg0, class127 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class12.method114(arg2, arg3, -107));
        this.field4555 = new class304(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field4561 = ~arg1.field2021 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIILe;)Z", line = 88)
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        ++field4557;
        class348 var5 = this.field4555.method2038(false, super.field4786, arg1 ^ 65537, arg1, false, super.field4787, arg3);
        if (var5 == null) {
            return false;
        } else {
            class435 var6 = arg3.method713();
            var6.method1984(super.field4801 + super.field4787, super.field4791, super.field4786 - -super.field4794);
            return var5.method39(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Le;I)V", line = 106)
    public final void method194(class312 arg0, int arg1) {
        ++field4563;
        int var3 = 13 % ((-19 - arg1) / 62);
        this.field4555.method2051((byte) 125, arg0);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)I", line = 117)
    public final int method197(boolean arg0) {
        if (!arg0) {
            field4551 = 124;
        }
        ++field4548;
        return this.field4555.field4834;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III[B)Ljava/lang/String;", line = 128)
    public static final String method1928(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field4552;
        char[] var4 = new char[arg2];
        if (arg1 != -1) {
            return null;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2; ++var6) {
                int var7 = 255 & arg3[arg0 + var6];
                if (~var7 != -1) {
                    if (~var7 <= -129 && ~var7 > -161) {
                        char var8 = class249.field4073[var7 + -128];
                        if (var8 == 0) {
                            var8 = '?';
                        }
                        var7 = var8;
                    }
                    var4[var5++] = (char) var7;
                }
            }
            return new String(var4, 0, var5);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ltf;BLtf;)V", line = 171)
    public static final void method1929(class161 arg0, byte arg1, class161 arg2) {
        ++field4550;
        if (arg1 != 85) {
            field4547 = null;
        }
        if (arg0.field2536 != null) {
            arg0.method1120(-92);
        }
        arg0.field2537 = arg2;
        arg0.field2536 = arg2.field2536;
        arg0.field2536.field2537 = arg0;
        arg0.field2537.field2536 = arg0;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI[Lne;)V", line = 188)
    public static final void method1930(boolean arg0, int arg1, class172[] arg2) {
        for (int var3 = 0; var3 < arg2.length; ++var3) {
            class172 var4 = arg2[var3];
            if (var4 != null && var4.field2735 == arg1 && (!var4.field2712 || !client.method1144(var4))) {
                if (var4.field2707 == 0) {
                    if (!var4.field2712 && client.method1144(var4) && class391.field5872 != var4) {
                        continue;
                    }
                    method1930(true, var4.field2865, arg2);
                    if (var4.field2866 != null) {
                        method1930(true, var4.field2865, var4.field2866);
                    }
                    class196 var5 = (class196) class392.field5891.method1770(-880, (long) var4.field2865);
                    if (var5 != null) {
                        class11.method108(var5.field3171, (byte) -87);
                    }
                }
                if (~var4.field2707 == -7) {
                    if (var4.field2840 != -1 || ~var4.field2819 != 0) {
                        boolean var6 = class3.method64((byte) 87, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2819;
                        } else {
                            var7 = var4.field2840;
                        }
                        if (var7 != -1) {
                            class417 var8 = class156.method1099(var7, 76);
                            if (var8 != null) {
                                var4.field2839 += class62.field807;
                                while (~var8.field6171[var4.field2754] > ~var4.field2839) {
                                    var4.field2839 -= var8.field6171[var4.field2754];
                                    ++var4.field2754;
                                    if (~var4.field2754 <= ~var8.field6177.length) {
                                        var4.field2754 -= var8.field6162;
                                        if (~var4.field2754 > -1 || ~var8.field6177.length >= ~var4.field2754) {
                                            var4.field2754 = 0;
                                        }
                                    }
                                    var4.field2738 = var4.field2754 - -1;
                                    if (var4.field2738 >= var8.field6177.length) {
                                        var4.field2738 -= var8.field6162;
                                        if (var4.field2738 < 0 || ~var8.field6177.length >= ~var4.field2738) {
                                            var4.field2738 = -1;
                                        }
                                    }
                                    class336.method2219((byte) 6, var4);
                                }
                            }
                        }
                    }
                    if (~var4.field2730 != -1 && !var4.field2712) {
                        int var9 = var4.field2730 >> 16;
                        int var10 = var4.field2730 << 16 >> 16;
                        int var11 = class62.field807 * var9;
                        var4.field2771 = var4.field2771 + var11 & 16383;
                        int var12 = class62.field807 * var10;
                        var4.field2818 = 16383 & var4.field2818 + var12;
                        class336.method2219((byte) 6, var4);
                    }
                }
            }
        }
        if (!arg0) {
            method1928(-4, 117, 46, (byte[]) null);
        }
        ++field4556;
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(B)V", line = 301)
    public static void method1931(byte arg0) {
        if (arg0 != 43) {
            field4551 = -94;
        }
        field4547 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I[JI[IB)V", line = 311)
    public static final void method1932(int arg0, long[] arg1, int arg2, int[] arg3, byte arg4) {
        if (arg4 <= 94) {
            method1928(9, -119, 97, (byte[]) null);
        }
        ++field4554;
        if (~arg2 > ~arg0) {
            int var5 = (arg2 - -arg0) / 2;
            int var6 = arg2;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var9;
            for (int var10 = arg2; ~arg0 < ~var10; ++var10) {
                if ((long) (var10 & 1) + var7 > arg1[var10]) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var13 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var13;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var9;
            method1932(var6 + -1, arg1, arg2, arg3, (byte) 115);
            method1932(arg0, arg1, var6 - -1, arg3, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Le;Z)Lum;", line = 365)
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field4546;
        class348 var3 = this.field4555.method2038(arg1, super.field4786, 1, 1024, false, super.field4787, arg0);
        if (var3 == null) {
            return null;
        } else {
            class435 var4 = arg0.method713();
            var4.method1984(super.field4801 + super.field4787, super.field4791, super.field4794 + super.field4786);
            class306 var5 = null;
            if (this.field4561) {
                var5 = class203.method1443(-40, 1);
            }
            if (this.field4555.field4819 == null) {
                var3.method26(var4, var5 == null ? null : var5.field4856[0], 0);
            } else {
                class198 var6 = this.field4555.field4819.method489();
                arg0.method561(var3, var6, var4, var5 != null ? var5.field4856[0] : null, 0);
            }
            this.field4555.method2046(true, arg0, super.field4787 >> 7, super.field4786 >> 7, super.field4786 >> 7, super.field4787 >> 7, 2, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I[Ljava/lang/Object;[I)V", line = 399)
    public static final void method1933(int arg0, Object[] arg1, int[] arg2) {
        class311.method2082(arg0, arg2, arg2.length + -1, (byte) 115, arg1);
        ++field4566;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Le;B)V", line = 409)
    public final void method199(class312 arg0, byte arg1) {
        ++field4560;
        if (arg1 != -22) {
            this.field4561 = false;
        }
        this.field4555.method2049(arg0, (byte) -115);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIII)V", line = 431)
    public static final void method1934(int arg0, int arg1, int arg2, int arg3) {
        ++field4564;
        class375 var4 = class136.field2139[arg1][arg2];
        if (arg3 == -18047) {
            class216.method1545(arg0, var4 != null ? var4 : class267.field4302, -7286);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 446)
    public final void method198(int arg0) {
        if (arg0 != -32289) {
            this.method199((class312) null, (byte) -56);
        }
        ++field4559;
    }
}
