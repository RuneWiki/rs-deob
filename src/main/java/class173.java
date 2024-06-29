import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class173 extends class354 implements class670 {

    @OriginalMember(owner = "client!op", name = "R", descriptor = "Lpq;")
    public class177 field2079;

    @OriginalMember(owner = "client!op", name = "M", descriptor = "Z")
    private boolean field2074;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "[B")
    public static byte[] field2062 = new byte[2048];

    @OriginalMember(owner = "client!op", name = "y", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!op", name = "G", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!op", name = "H", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!op", name = "J", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!op", name = "K", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!op", name = "N", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!op", name = "O", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!op", name = "P", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!op", name = "Q", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!op", name = "S", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!op", name = "T", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!op", name = "U", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "Lgr;")
    private class396 field2063;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(Loa;I)Lok;")
    public final class231 method442(class635 arg0, int arg1) {
        ++field2066;
        class350 var3 = this.field2079.method1041(super.field4647, false, arg0, true, 2048, super.field4641, true);
        if (var3 == null) {
            return null;
        } else {
            class389 var4 = arg0.method297();
            var4.method228(super.field4641, super.field4646, super.field4647);
            if (arg1 != 0) {
                return null;
            } else {
                class231 var5 = null;
                if (this.field2074) {
                    var5 = class526.method2993(1, 32671);
                }
                this.field2079.method1034(super.field4639, super.field4645, super.field4642, var4, super.field4648, arg0, 126, var3, true);
                if (this.field2079.field2126 != null) {
                    class211 var6 = this.field2079.field2126.method1241();
                    arg0.method301(var3, var6, var4, var5 != null ? var5.field2947[0] : null, 0);
                } else {
                    var3.method904(var4, var5 == null ? null : var5.field2947[0], 0);
                }
                if (this.field2063 == null) {
                    this.field2063 = class426.method2298(super.field4641, var3, 12409, super.field4647, super.field4646);
                } else {
                    class644.method3611(var3, super.field4641, this.field2063, (byte) -122, super.field4647, super.field4646);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Loa;B)V")
    public final void method446(class635 arg0, byte arg1) {
        ++field2072;
        this.field2079.method1033(arg0, (byte) 121);
        if (arg1 >= -126) {
            this.method444((byte) 17);
        }
    }

    @OriginalMember(owner = "client!op", name = "e", descriptor = "(I)I")
    public final int method740(int arg0) {
        ++field2070;
        int var2 = -105 / ((arg0 - -31) / 48);
        return this.field2079.method1037((byte) 8);
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(B)I")
    public final int method443(byte arg0) {
        ++field2076;
        int var2 = -70 / ((arg0 - -82) / 37);
        return this.field2079.field2145;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Loa;Lbfa;IIIIIZIIIIIII)V")
    public class173(class635 arg0, class335 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field4402 == 1, class330.method1863(arg12, arg13, 2841));
        this.field2079 = new class177(arg0, arg1, arg12, arg13, super.field4638, arg3, arg4, arg6, arg7, arg14);
        this.field2074 = arg1.field4407 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method457(int arg0, int arg1, class635 arg2, int arg3) {
        if (arg1 != 1) {
            return true;
        } else {
            ++field2082;
            class350 var5 = this.field2079.method1041(super.field4647, false, arg2, true, 131072, super.field4641, false);
            if (var5 == null) {
                return false;
            } else {
                class389 var6 = arg2.method297();
                var6.method228(super.field4641, super.field4646, super.field4647);
                return var5.method910(arg3, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Loa;I)V")
    public final void method456(class635 arg0, int arg1) {
        if (arg1 < 97) {
            this.field2074 = true;
        }
        this.field2079.method1040(262144, arg0);
        ++field2068;
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(B)Z")
    public final boolean method449(byte arg0) {
        ++field2064;
        if (arg0 != -126) {
            field2062 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!op", name = "g", descriptor = "(I)V")
    public static void method1019(int arg0) {
        if (arg0 != -98) {
            field2062 = null;
        }
        field2062 = null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)I")
    public final int method444(byte arg0) {
        int var2 = 118 % ((7 - arg0) / 46);
        ++field2080;
        return this.field2079.field2153;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZIZIILfl;Loa;)V")
    public final void method453(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class673 arg5, class635 arg6) {
        ++field2067;
        if (arg2) {
            this.field2063 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(Loa;I)V")
    public final void method451(class635 arg0, int arg1) {
        ++field2073;
        class350 var3 = this.field2079.method1041(super.field4647, true, arg0, true, 262144, super.field4641, true);
        if (arg1 == 31055) {
            if (var3 != null) {
                class389 var4 = arg0.method297();
                var4.method228(super.field4641, super.field4646, super.field4647);
                this.field2079.method1034(super.field4639, super.field4645, super.field4642, var4, super.field4648, arg0, 127, var3, false);
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        ++field2061;
        if (arg0 != 29877) {
            this.field2074 = false;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1020(String arg0, int arg1) {
        ++field2069;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        int var4 = 0;
        if (arg1 != -2) {
            return null;
        } else {
            while (~var4 > ~var3) {
                char var5 = arg0.charAt(var4);
                if (var5 == '%' && ~var3 < ~(var4 - -2)) {
                    label84: {
                        char var6 = arg0.charAt(var4 - -1);
                        boolean var7 = false;
                        int var8;
                        if (var6 >= '0' && ~var6 >= -58) {
                            var8 = var6 + -48;
                        } else if (~var6 <= -98 && ~var6 >= -103) {
                            var8 = var6 + -97 + 10;
                        } else {
                            if (~var6 > -66 || var6 > 'F') {
                                var2.append('%');
                                break label84;
                            }
                            var8 = var6 + '\n' + -65;
                        }
                        int var9 = var8 * 16;
                        char var10 = arg0.charAt(var4 - -2);
                        int var11;
                        if (~var10 <= -49 && ~var10 >= -58) {
                            var11 = var10 + -48 + var9;
                        } else if (var10 >= 'a' && var10 <= 'f') {
                            var11 = 10 - (-var10 + 97) + var9;
                        } else {
                            if (var10 < 'A' || ~var10 < -71) {
                                var2.append('%');
                                break label84;
                            }
                            var11 = -55 - -var10 + var9;
                        }
                        if (~var11 != -1 && class522.method2977((byte) var11, 127)) {
                            var2.append(class278.method1589((byte) var11, false));
                        }
                        var4 += 2;
                    }
                } else if (~var5 == -44) {
                    var2.append(' ');
                } else {
                    var2.append(var5);
                }
                ++var4;
            }
            return var2.toString();
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILoa;)Lba;")
    public final class350 method455(int arg0, int arg1, class635 arg2) {
        ++field2065;
        return arg1 >= -20 ? null : this.field2079.method1041(0, false, arg2, true, arg0, 0, false);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLjo;I)Lu;")
    public static final class67 method1021(byte arg0, class303 arg1, int arg2) {
        ++field2077;
        if (arg0 != 35) {
            method1019(83);
        }
        byte[] var3 = arg1.method1722(arg2, arg0 ^ 35);
        return var3 == null ? null : new class67(var3);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Z")
    public final boolean method454(int arg0) {
        ++field2078;
        if (arg0 <= 49) {
            this.field2063 = null;
        }
        return this.field2079.method1032(-28959);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)I")
    public final int method447(byte arg0) {
        if (arg0 != -91) {
            this.method453(false, 11, true, -33, -39, (class673) null, (class635) null);
        }
        ++field2081;
        return this.field2079.field2139;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILoa;)Lgr;")
    public final class396 method450(int arg0, class635 arg1) {
        int var3 = -3 % ((arg0 - 47) / 34);
        ++field2071;
        return this.field2063;
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(I)V")
    public final void method448(int arg0) {
        ++field2075;
        int var2 = -21 / ((arg0 - 12) / 56);
        throw new IllegalStateException();
    }
}
