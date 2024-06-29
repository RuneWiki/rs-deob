import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class212 extends class191 implements class149 {

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Lni;")
    public class304 field3390;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "Z")
    private boolean field3396;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3405 = "shake:";

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "Ljm;")
    public static class409 field3404;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "Lmo;")
    public static class447 field3401;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILe;IIZLhm;I)V", line = 3)
    public final void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6) {
        if (arg3 != 0) {
            this.method189((class312) null, false);
        }
        ++field3407;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V", line = 14)
    public static void method1491(int arg0) {
        if (arg0 <= 85) {
            method1492((byte) 8, 100, -117, -111, 20, 61, -7);
        }
        field3404 = null;
        field3401 = null;
        field3405 = null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(Le;B)V", line = 26)
    public final void method196(class312 arg0, byte arg1) {
        ++field3402;
        if (arg1 >= -66) {
            field3401 = null;
        }
        class348 var3 = this.field3390.method2038(true, super.field3118, 1, 131072, true, super.field3112, arg0);
        if (var3 != null) {
            this.field3390.method2046(false, arg0, super.field3112 >> 7, super.field3118 >> 7, super.field3118 >> 7, super.field3112 >> 7, 2, var3);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)I", line = 43)
    public final int method197(boolean arg0) {
        if (!arg0) {
            method1492((byte) 124, -42, -53, -11, -79, 110, 57);
        }
        ++field3410;
        return this.field3390.field4834;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Le;Z)Lum;", line = 56)
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field3406;
        class348 var3 = this.field3390.method2038(true, super.field3118, 1, 1024, false, super.field3112, arg0);
        if (var3 == null) {
            return null;
        } else {
            class435 var4 = arg0.method713();
            var4.method1984(super.field3112, super.field3113, super.field3118);
            class306 var5 = null;
            if (this.field3396) {
                var5 = class203.method1443(-99, 1);
            }
            if (this.field3390.field4819 != null) {
                class198 var6 = this.field3390.field4819.method489();
                arg0.method561(var3, var6, var4, var5 == null ? null : var5.field4856[0], 0);
            } else {
                var3.method26(var4, var5 == null ? null : var5.field4856[0], 0);
            }
            this.field3390.method2046(arg1, arg0, super.field3112 >> 7, super.field3118 >> 7, super.field3118 >> 7, super.field3112 >> 7, 2, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIILe;)Z", line = 90)
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        ++field3394;
        class348 var5 = this.field3390.method2038(false, super.field3118, arg1 + -65535, arg1, false, super.field3112, arg3);
        if (var5 == null) {
            return false;
        } else {
            class435 var6 = arg3.method713();
            var6.method1984(super.field3112, super.field3113, super.field3118);
            return var5.method39(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)I", line = 108)
    public final int method195(int arg0) {
        ++field3409;
        return arg0 != 3076 ? 45 : this.field3390.field4808;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Le;B)V", line = 119)
    public final void method199(class312 arg0, byte arg1) {
        if (arg1 != -22) {
            method1491(27);
        }
        ++field3393;
        this.field3390.method2049(arg0, (byte) -115);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIIIIII)V", line = 130)
    public static final void method1492(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class309.field4882 = arg3;
        class104.field1465 = arg2;
        class158.field2518 = arg6;
        class321.field5017 = arg4;
        ++field3395;
        class224.field3732 = arg1;
        class414.field6128 = arg5;
        if (arg0 <= 47) {
            method1491(93);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I", line = 148)
    public static final int method1493(int arg0, int arg1) {
        ++field3388;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (arg0 != 65536) {
                method1492((byte) 125, -110, 105, -71, -93, 52, -98);
            }
            return class222.method1592(arg0 ^ 65646, arg1);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)Z", line = 167)
    public final boolean method190(byte arg0) {
        ++field3389;
        return arg0 >= -126 ? true : this.field3390.method2043((byte) -83);
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V", line = 182)
    public final void method193(int arg0) {
        ++field3408;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)Z", line = 195)
    public static final boolean method1494(int arg0, int arg1) {
        if (arg1 != 953622695) {
            return false;
        } else {
            ++field3400;
            if (~arg0 != -46 && ~arg0 != -29 && arg0 != 58 && arg0 != 12 && ~arg0 != -9 && arg0 != 7 && ~arg0 != -44 && arg0 != 23) {
                if (~arg0 != -38 && arg0 != 29 && ~arg0 != -1004 && arg0 != 1004) {
                    if (arg0 != 17 && ~arg0 != -52 && arg0 != 31 && arg0 != 35 && arg0 != 15) {
                        return arg0 == 22 || ~arg0 == -47 || ~arg0 == -11 || arg0 == 20 || ~arg0 == -25 || ~arg0 == -26;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 221)
    public final void method198(int arg0) {
        if (arg0 != -32289) {
            method1495(41, (byte) -4);
        }
        ++field3403;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Le;I)V", line = 232)
    public final void method194(class312 arg0, int arg1) {
        int var3 = -109 % ((arg1 - -19) / 62);
        this.field3390.method2051((byte) 127, arg0);
        ++field3398;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)Z", line = 245)
    public final boolean method186(int arg0) {
        ++field3397;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Le;Lfa;IIIIIIZI)V", line = 256)
    public class212(class312 arg0, class127 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field1956, arg1.field1942);
        this.field3390 = new class304(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field3396 = arg1.field2021 != 0 && !arg8;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Le;IB)Lid;", line = 266)
    public final class348 method200(class312 arg0, int arg1, byte arg2) {
        if (arg2 != -52) {
            field3405 = null;
        }
        ++field3399;
        return this.field3390.method2038(false, 0, 1, arg1, false, 0, arg0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I", line = 280)
    public final int method183(byte arg0) {
        int var2 = -98 / ((arg0 - 49) / 47);
        ++field3391;
        return this.field3390.field4805;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)V", line = 295)
    public static final void method1495(int arg0, byte arg1) {
        class381.field5758 = new class52(arg0);
        ++field3392;
        if (arg1 != -100) {
            field3404 = null;
        }
    }
}
