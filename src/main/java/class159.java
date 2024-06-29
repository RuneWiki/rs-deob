import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class159 extends class140 implements class68 {

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "S")
    private short field2066;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "Z")
    private boolean field2078;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "B")
    private byte field2055;

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "B")
    private byte field2083;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "Z")
    private boolean field2074;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "B")
    private byte field2061;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "Z")
    private boolean field2068;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "Z")
    private boolean field2065;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "Lka;")
    public class334 field2057;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "Lia;")
    private class423 field2075;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Lof;")
    public static class446 field2051 = new class446("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "Luu;")
    public static class191 field2063;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)I")
    public final int method338(int arg0) {
        if (arg0 <= 75) {
            this.method176(false);
        }
        ++field2080;
        return 65535 & this.field2066;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILa;IIILqa;Z)V")
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        if (arg2 >= -4) {
            this.method333(true, (class165) null);
        }
        ++field2059;
        if (arg1 instanceof class52) {
            class52 var8 = (class52) arg1;
            if (this.field2057 != null && var8.field710 != null) {
                this.field2057.method50(var8.field710, arg3, arg0, arg4, arg6);
            }
        } else {
            if (arg1 instanceof class159) {
                class159 var9 = (class159) arg1;
                if (this.field2057 != null && var9.field2057 != null) {
                    this.field2057.method50(var9.field2057, arg3, arg0, arg4, arg6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILqa;I)Lka;")
    public final class334 method337(int arg0, class165 arg1, int arg2) {
        if (arg2 != 14221) {
            this.method1034(-13);
        }
        ++field2073;
        return this.method1031(arg0, -1, arg1);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 != 1) {
            field2063 = null;
        }
        ++field2062;
        if (~arg2 <= -2 && arg4 >= 1 && class398.field6071 + -2 >= arg2 && ~arg4 >= ~(class528.field7734 - 2)) {
            int var9 = arg5;
            if (arg5 < 3 && class28.method249(arg2, arg4, -128)) {
                var9 = arg5 + 1;
            }
            if (!class203.field2716.method15(class378.field5771, arg8 ^ 1) && !class519.method3091(arg4, class253.field3515, arg2, var9, 92)) {
                return;
            }
            if (class443.field6672 == null) {
                return;
            }
            class274.field3811.method2183(arg4, class9.field174[arg5], arg0, arg2, (byte) -44, class400.field6090, arg5);
            if (~arg3 <= -1) {
                boolean var10 = class203.field2716.field1155;
                class203.field2716.field1155 = true;
                class274.field3811.method2180(31774, arg1, arg4, arg5, class400.field6090, arg6, var9, arg3, class9.field174[arg5], arg7, arg2);
                class203.field2716.field1155 = var10;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIILqa;)Z")
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        ++field2052;
        class334 var5 = this.method1031(131072, -1, arg3);
        if (arg0 <= 121) {
            return false;
        } else if (var5 != null) {
            class14 var6 = arg3.method751();
            var6.method141(super.field1867, super.field1873, super.field1862);
            return var5.method68(arg2, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
    public final int method174(byte arg0) {
        ++field2079;
        if (arg0 >= -126) {
            this.field2068 = false;
        }
        return this.field2057 != null ? this.field2057.method77() : 0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILqa;)Lka;")
    private final class334 method1031(int arg0, int arg1, class165 arg2) {
        ++field2053;
        if (this.field2057 != null && ~arg2.method775(this.field2057.method46(), arg0) == -1) {
            return this.field2057;
        } else {
            class404 var4 = this.method1036(arg2, -12, arg0, false);
            if (arg1 != -1) {
                this.field2057 = null;
            }
            return var4 != null ? var4.field6128 : null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILi;IILga;IBLqa;I)V")
    public static final void method1032(int arg0, class30 arg1, int arg2, int arg3, class282 arg4, int arg5, byte arg6, class165 arg7, int arg8) {
        ++field2069;
        class38 var9 = class509.field7484.method1851(36, arg2);
        int var10 = -68 % ((arg6 - 48) / 63);
        if (var9 != null && var9.field554 && var9.method320(class288.field4208, (byte) 69)) {
            if (var9.field576 != null) {
                int[] var11 = new int[var9.field576.length];
                for (int var12 = 0; var11.length / 2 > var12; ++var12) {
                    int var14;
                    if (class340.field5269 != 4) {
                        var14 = (int) class53.field744 + class303.field4433 & 16383;
                    } else {
                        var14 = (int) class53.field744 & 16383;
                    }
                    int var15 = class428.field6502[var14];
                    int var16 = class428.field6501[var14];
                    if (~class340.field5269 != -5) {
                        var16 = var16 * 256 / (class514.field7549 + 256);
                        var15 = var15 * 256 / (class514.field7549 + 256);
                    }
                    var11[var12 * 2] = arg4.field3991 / 2 + ((var9.field576[var12 * 2] * 4 + arg0) * var16 + (var9.field576[var12 * 2 - -1] * 4 + arg5) * var15 >> 15) + arg3;
                    var11[var12 * 2 + 1] = arg4.field4043 / 2 + arg8 + -((var9.field576[var12 * 2 + 1] * 4 + arg5) * var16 - (var9.field576[var12 * 2] * 4 + arg0) * var15 >> 15);
                }
                class285.method1828(arg7, var11, var9.field573, arg4.field4118, arg4.field4047);
                for (int var13 = 0; var13 < var11.length / 2 + -1; ++var13) {
                    arg7.method819(var11[var13 * 2], var11[var13 * 2 + 1], var11[var13 * 2 + 2], var11[var13 * 2 + 2 + 1], var9.field542, 1, arg1, arg3, arg8);
                }
                arg7.method819(var11[var11.length - 2], var11[var11.length - 1], var11[0], var11[1], var9.field542, 1, arg1, arg3, arg8);
            }
            class341 var17 = null;
            if (~var9.field536 != 0) {
                var17 = var9.method321(false, -6858, arg7);
                if (var17 != null) {
                    class429.method2619(arg5, arg4, arg0, var17, arg1, arg3, arg8, -118);
                }
            }
            if (var9.field550 != null) {
                int var18 = 0;
                if (var17 != null) {
                    var18 = var17.method305();
                }
                class268 var19 = class536.field7867;
                class82 var20 = class55.field768;
                if (~var9.field547 == -2) {
                    var20 = class263.field3684;
                    var19 = class94.field1380;
                }
                if (~var9.field547 == -3) {
                    var20 = class175.field2338;
                    var19 = class199.field2653;
                }
                class458.method2776(arg8, 0, arg0, var9.field550, arg1, arg4, var18, var19, var20, arg3, var9.field552, arg5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(Z)V")
    public static void method1033(boolean arg0) {
        field2051 = null;
        field2063 = null;
        if (arg0) {
            method1035((String) null, 22);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILqa;)Lou;")
    public final class437 method136(int arg0, class165 arg1) {
        ++field2064;
        if (this.field2057 == null) {
            return null;
        } else {
            class14 var3 = arg1.method751();
            var3.method141(super.field1867, super.field1873, super.field1862);
            class437 var4 = null;
            if (this.field2078) {
                var4 = class530.method3133(false, 1);
            }
            this.field2057.method53(var3, var4 != null ? var4.field6608[0] : null, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
    public final void method334(int arg0) {
        if (arg0 == 29893) {
            ++field2082;
            if (this.field2057 != null) {
                this.field2057.method83();
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lqa;I)V")
    public final void method330(class165 arg0, int arg1) {
        if (arg1 != 14470) {
            this.field2083 = 33;
        }
        ++field2076;
        Object var3 = null;
        class423 var5;
        if (this.field2075 == null && this.field2065) {
            class404 var4 = this.method1036(arg0, -12, 262144, true);
            var5 = var4 == null ? null : var4.field6124;
        } else {
            var5 = this.field2075;
            this.field2075 = null;
        }
        if (var5 != null) {
            class235.method1562(var5, this.field2083, super.field1867, super.field1862, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "(I)I")
    public final int method1034(int arg0) {
        ++field2050;
        if (arg0 != 0) {
            this.method174((byte) -41);
        }
        return this.field2057 == null ? 15 : this.field2057.method88() / 4;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLqa;)V")
    public final void method333(boolean arg0, class165 arg1) {
        if (arg0) {
            ++field2056;
            Object var3 = null;
            class423 var5;
            if (this.field2075 == null && this.field2065) {
                class404 var4 = this.method1036(arg1, -12, 262144, true);
                var5 = var4 == null ? null : var4.field6124;
            } else {
                var5 = this.field2075;
                this.field2075 = null;
            }
            if (var5 != null) {
                class335.method2169(var5, this.field2083, super.field1867, super.field1862, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1035(String arg0, int arg1) {
        ++field2081;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; ~var5 > ~var2; ++var5) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) + -var3;
        }
        if (arg1 != 21879) {
            method1032(10, (class30) null, 66, 1, (class282) null, -7, (byte) 29, (class165) null, -91);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lqa;Lcd;IIIIIZIIIIIIZ)V")
    public class159(class165 arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field2909 == 1, class539.method3185(arg13, (byte) 45, arg12));
        this.field2066 = (short) arg1.field2936;
        this.field2078 = ~arg1.field2930 != -1 && !arg7;
        this.field2055 = (byte) arg12;
        this.field2083 = (byte) arg3;
        this.field2074 = arg7;
        this.field2061 = (byte) arg13;
        this.field2068 = arg14;
        this.field2065 = arg0.method786() && arg1.field2889 && !this.field2074 && ~class203.field2716.method552(-4, class378.field5771) != -1;
        int var16 = 2048;
        if (this.field2068) {
            var16 |= 65536;
        }
        class404 var17 = this.method1036(arg0, -12, var16, this.field2065);
        if (var17 != null) {
            this.field2057 = var17.field6128;
            this.field2075 = var17.field6124;
            if (this.field2068) {
                this.field2057 = this.field2057.method47((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(ZLqa;)V")
    public final void method135(boolean arg0, class165 arg1) {
        if (arg0) {
            this.method333(true, (class165) null);
        }
        ++field2077;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lqa;IIZ)Lkj;")
    private final class404 method1036(class165 arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 != -12) {
            return null;
        } else {
            ++field2060;
            class209 var5 = class432.field6575.method1872(65535 & this.field2066, false);
            class23 var6;
            class23 var7;
            if (!this.field2074) {
                if (~this.field2083 <= -4) {
                    var6 = null;
                } else {
                    var6 = class414.field6317[this.field2083 - -1];
                }
                var7 = class414.field6317[this.field2083];
            } else {
                var6 = class414.field6317[0];
                var7 = class71.field988[this.field2083];
            }
            return var5.method1446(var6, ~this.field2055 == -12 ? 4 - -this.field2061 : this.field2061, super.field1873, arg2, 262144, arg0, arg3, ~this.field2055 != -12 ? this.field2055 : 10, var7, super.field1862, super.field1867);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)I")
    public final int method336(int arg0) {
        if (arg0 != -6130) {
            this.field2078 = false;
        }
        ++field2058;
        return this.field2055;
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (arg0 != 0) {
            this.field2078 = false;
        }
        this.field2068 = false;
        ++field2070;
        if (this.field2057 != null) {
            this.field2057.method62(this.field2057.method46() & -65537);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLnj;)V")
    public static final void method1037(byte arg0, class164 arg1) {
        if (arg0 >= -21) {
            field2051 = null;
        }
        ++field2072;
        if (arg1.field2219.length + -arg1.field2185 >= 1) {
            int var2 = arg1.method1087(false);
            if (var2 >= 0 && var2 <= 1) {
                if (~(arg1.field2219.length - arg1.field2185) <= -3) {
                    int var3 = arg1.method1074(-635989152);
                    if (~(arg1.field2219.length + -arg1.field2185) <= ~(var3 * 6)) {
                        for (int var4 = 0; var3 > var4; ++var4) {
                            int var5 = arg1.method1074(-635989152);
                            int var6 = arg1.method1099(94);
                            if (~var5 > ~class331.field5170.length && class534.field7852[var5] && (class99.field1447.method440(var5, 13367).field1929 != '1' || ~var6 <= 0 && var6 <= 1)) {
                                class331.field5170[var5] = var6;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)Z")
    public final boolean method176(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field2054;
            return this.field2068;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Z")
    public final boolean method339(int arg0) {
        if (arg0 != 3583) {
            this.field2066 = -6;
        }
        ++field2071;
        return this.field2065;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)I")
    public final int method332(int arg0) {
        if (arg0 != 6359) {
            this.method337(-86, (class165) null, 77);
        }
        ++field2067;
        return this.field2061;
    }
}
