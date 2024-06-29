import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class348 {

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2110(int arg0, int arg1, int arg2) {
        if (arg0 == 827) {
            return (arg1 & 0x38000) != 0 | method2125(arg1, 52, arg2) || method2135((byte) 121, arg1, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(III)Z", line = 14)
    public static final boolean method2111(int arg0, int arg1, int arg2) {
        if (arg1 != 16384) {
            return true;
        } else if (method2120(0, arg2, arg0)) {
            return ((arg2 & 0x5800) != 0 | method2119(arg2, arg0, (byte) 92) | method2134(-31568, arg2, arg0)) ? true : (method2123((byte) 64, arg0, arg2) | method2126(131072, arg0, arg2)) & (arg0 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(III)Z", line = 31)
    public static final boolean method2112(int arg0, int arg1, int arg2) {
        if (arg2 != 256) {
            method2135((byte) -85, 32, 105);
        }
        return (arg1 & 0x4000) != 0;
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(III)Z", line = 41)
    public static final boolean method2113(int arg0, int arg1, int arg2) {
        if (arg2 >= -32) {
            return false;
        } else {
            return (arg1 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIB)Z", line = 51)
    public static final boolean method2114(int arg0, int arg1, byte arg2) {
        if (arg2 != -19) {
            method2117(-38, -41, 60);
        }
        return false;
    }

    @OriginalMember(owner = "client!br", name = "e", descriptor = "(III)Z", line = 61)
    public static final boolean method2115(int arg0, int arg1, int arg2) {
        if (arg0 <= 87) {
            return true;
        } else {
            return method2134(-31568, arg1, arg2) | (arg1 & 0x20000) != 0 || method2111(arg2, 16384, arg1);
        }
    }

    @OriginalMember(owner = "client!br", name = "f", descriptor = "(III)Z", line = 71)
    public static final boolean method2116(int arg0, int arg1, int arg2) {
        if (arg2 != -61) {
            method2127(68, -83, true);
        }
        return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!br", name = "g", descriptor = "(III)Z", line = 82)
    public static final boolean method2117(int arg0, int arg1, int arg2) {
        int var3 = -73 % ((52 - arg0) / 57);
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!br", name = "h", descriptor = "(III)Z", line = 90)
    public static final boolean method2118(int arg0, int arg1, int arg2) {
        if (arg1 == -19700) {
            return (arg0 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(IIB)Z", line = 100)
    public static final boolean method2119(int arg0, int arg1, byte arg2) {
        if (arg2 < 53) {
            return true;
        } else {
            return (arg0 & 0x2080) != 0;
        }
    }

    @OriginalMember(owner = "client!br", name = "i", descriptor = "(III)Z", line = 110)
    public static final boolean method2120(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return (arg1 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZI)Z", line = 120)
    public static final boolean method2121(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (arg2 & 0x38000) != 0 | method2124(false, arg0, arg2) || method2135((byte) 123, arg2, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "j", descriptor = "(III)Z", line = 130)
    public static final boolean method2122(int arg0, int arg1, int arg2) {
        if (arg1 != 196608) {
            method2113(-55, -37, 123);
        }
        return method2117(-105, arg0, arg2) | (arg0 & 0x30000) != 0 || method2111(arg2, 16384, arg0) || method2129(-1, arg0, arg2);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BII)Z", line = 140)
    public static final boolean method2123(byte arg0, int arg1, int arg2) {
        return arg0 <= 51 ? true : (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZII)Z", line = 150)
    public static final boolean method2124(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method2137((byte) 64, 82, -5);
        }
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!br", name = "k", descriptor = "(III)Z", line = 160)
    public static final boolean method2125(int arg0, int arg1, int arg2) {
        if (arg1 != 52) {
            method2129(-100, 34, -85);
        }
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!br", name = "l", descriptor = "(III)Z", line = 170)
    private static final boolean method2126(int arg0, int arg1, int arg2) {
        if (arg0 == 131072) {
            return (arg2 & 0x8000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIZ)Z", line = 180)
    public static final boolean method2127(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2134(101, 3, -44);
        }
        return (arg0 & 0x38000) != 0 | method2138(arg0, (byte) -67, arg1) || method2135((byte) 125, arg0, arg1);
    }

    @OriginalMember(owner = "client!br", name = "m", descriptor = "(III)Z", line = 190)
    public static final boolean method2128(int arg0, int arg1, int arg2) {
        if (arg2 != -1821) {
            method2134(86, -106, 52);
        }
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!br", name = "n", descriptor = "(III)Z", line = 200)
    public static final boolean method2129(int arg0, int arg1, int arg2) {
        return arg0 == -1 ? method2117(arg0 - 27, arg1, arg2) & method2139(27403, arg1, arg2) : false;
    }

    @OriginalMember(owner = "client!br", name = "o", descriptor = "(III)Z", line = 210)
    public static final boolean method2130(int arg0, int arg1, int arg2) {
        return arg1 > -118 ? true : (method2123((byte) 52, arg2, arg0) | (arg0 & 0x1000) != 0 | method2126(131072, arg2, arg0)) & method2116(arg2, arg0, -61);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IBI)Z", line = 220)
    public static final boolean method2131(int arg0, byte arg1, int arg2) {
        if (arg1 != -45) {
            method2128(90, -26, -52);
        }
        return (arg2 & 0x400) != 0 | method2112(arg0, arg2, arg1 ^ 0xFFFFFED3) || method2111(arg0, 16384, arg2);
    }

    @OriginalMember(owner = "client!br", name = "p", descriptor = "(III)Z", line = 230)
    public static final boolean method2132(int arg0, int arg1, int arg2) {
        if (arg2 != -11631) {
            method2133(28, 58, -38);
        }
        return method2114(arg1, arg0, (byte) -19) & method2118(arg0, arg2 ^ 0x619D, arg1);
    }

    @OriginalMember(owner = "client!br", name = "q", descriptor = "(III)Z", line = 240)
    public static final boolean method2133(int arg0, int arg1, int arg2) {
        if (arg0 == 16965) {
            return method2114(arg1, arg2, (byte) -19) || method2132(arg2, arg1, arg0 ^ 0xFFFF90D4);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!br", name = "r", descriptor = "(III)Z", line = 250)
    public static final boolean method2134(int arg0, int arg1, int arg2) {
        if (arg0 == -31568) {
            return (arg1 & 0x100) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(BII)Z", line = 261)
    public static final boolean method2135(byte arg0, int arg1, int arg2) {
        int var3 = 28 % ((52 - arg0) / 43);
        return (method2124(false, arg2, arg1) | method2125(arg1, 52, arg2) | method2138(arg1, (byte) -67, arg2)) & method2140(arg2, (byte) 112, arg1);
    }

    @OriginalMember(owner = "client!br", name = "s", descriptor = "(III)Z", line = 270)
    public static final boolean method2136(int arg0, int arg1, int arg2) {
        int var3 = -39 % ((arg1) / 55);
        return method2119(arg0, arg2, (byte) 85) || method2111(arg2, 16384, arg0);
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(BII)Z", line = 280)
    public static final boolean method2137(byte arg0, int arg1, int arg2) {
        if ((method2123((byte) 52, arg1, arg2) | (arg2 & 0x8000) != 0) || method2130(arg2, -122, arg1)) {
            return true;
        } else {
            if (arg0 < 84) {
                method2121(-7, false, -54);
            }
            return (arg1 & 0x37) == 0 && method2111(arg1, 16384, arg2);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(IBI)Z", line = 293)
    public static final boolean method2138(int arg0, byte arg1, int arg2) {
        if (arg1 != -67) {
            method2138(113, (byte) -95, 69);
        }
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!br", name = "t", descriptor = "(III)Z", line = 303)
    public static final boolean method2139(int arg0, int arg1, int arg2) {
        if (arg0 == 27403) {
            return (arg1 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(IBI)Z", line = 313)
    public static final boolean method2140(int arg0, byte arg1, int arg2) {
        if (arg1 <= 77) {
            return false;
        } else {
            return (arg2 & 0x400) != 0;
        }
    }
}
