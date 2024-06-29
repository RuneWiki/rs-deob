import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class362 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2167(int arg0, int arg1, int arg2) {
        return arg0 > -108 ? true : method2184(92, arg2, arg1) & method2173(46, arg2, arg1);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(III)Z", line = 14)
    public static final boolean method2168(int arg0, int arg1, int arg2) {
        if (arg1 == 13366) {
            return (arg2 & 0x34) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(III)Z", line = 24)
    public static final boolean method2169(int arg0, int arg1, int arg2) {
        if (arg2 != -9869) {
            return false;
        } else if (((arg1 & 0x8000) != 0 | method2194(arg1, arg0, -27851)) || method2192(arg0, arg1, -1)) {
            return true;
        } else {
            return (arg0 & 0x37) == 0 && method2172(-118, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(III)Z", line = 38)
    public static final boolean method2170(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2188(84, -99, 38);
        }
        return method2186(229376, arg0, arg2) & method2179(arg2, true, arg0);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIZ)Z", line = 48)
    public static final boolean method2171(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method2172(3, -106, 45);
        }
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "(III)Z", line = 58)
    public static final boolean method2172(int arg0, int arg1, int arg2) {
        if (arg0 > -95) {
            return true;
        } else if (method2171(arg2, arg1, false)) {
            return ((arg1 & 0x5800) != 0 | method2189(arg1, 8320, arg2) | method2182(true, arg1, arg2)) ? true : (arg2 & 0x37) == 0 & (method2194(arg1, arg2, -27851) | method2176(arg1, arg2, (byte) -95));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(III)Z", line = 76)
    public static final boolean method2173(int arg0, int arg1, int arg2) {
        int var3 = -77 % ((-arg0 - 67) / 42);
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "(III)Z", line = 84)
    public static final boolean method2174(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2183(false, 62, -71);
        }
        return method2182(true, arg1, arg0) | (arg1 & 0x20000) != 0 || method2172(-127, arg1, arg0);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZI)Z", line = 94)
    public static final boolean method2175(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return true;
        } else {
            return (arg0 & 0x38000) != 0 | method2195((byte) 29, arg0, arg2) || method2177((byte) 120, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIB)Z", line = 104)
    private static final boolean method2176(int arg0, int arg1, byte arg2) {
        if (arg2 == -95) {
            return (arg0 & 0x8000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BII)Z", line = 115)
    public static final boolean method2177(byte arg0, int arg1, int arg2) {
        int var3 = 49 % ((71 - arg0) / 43);
        return (method2185(0, arg2, arg1) | method2195((byte) 29, arg1, arg2) | method2168(arg2, 13366, arg1)) & method2197(arg2, arg1, (byte) 65);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBI)Z", line = 123)
    public static final boolean method2178(int arg0, byte arg1, int arg2) {
        if (arg1 > -28) {
            return false;
        } else {
            return (arg0 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(IZI)Z", line = 133)
    public static final boolean method2179(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (arg0 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(IIB)Z", line = 143)
    public static final boolean method2180(int arg0, int arg1, byte arg2) {
        if (arg2 == 69) {
            return (arg0 & 0x38000) != 0 | method2185(arg2 ^ 0x45, arg1, arg0) || method2177((byte) -17, arg0, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(IBI)Z", line = 153)
    public static final boolean method2181(int arg0, byte arg1, int arg2) {
        if (arg1 < 76) {
            return true;
        } else {
            return method2184(88, arg0, arg2) || method2167(-126, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZII)Z", line = 163)
    public static final boolean method2182(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return (arg1 & 0x100) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(ZII)Z", line = 173)
    public static final boolean method2183(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return false;
        } else {
            return (arg1 & 0x400) != 0 && (arg2 & 0x37) != 0;
        }
    }

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "(III)Z", line = 183)
    public static final boolean method2184(int arg0, int arg1, int arg2) {
        return arg0 < 36 ? false : false;
    }

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "(III)Z", line = 193)
    public static final boolean method2185(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return (arg2 & 0x21) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "(III)Z", line = 203)
    public static final boolean method2186(int arg0, int arg1, int arg2) {
        if (arg0 == 229376) {
            return (arg2 & 0x10) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "(III)Z", line = 213)
    public static final boolean method2187(int arg0, int arg1, int arg2) {
        if (arg0 == 229376) {
            return method2168(arg2, 13366, arg1) | (arg1 & 0x38000) != 0 || method2177((byte) 124, arg1, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "(III)Z", line = 223)
    public static final boolean method2188(int arg0, int arg1, int arg2) {
        if (arg0 == -19264) {
            return method2186(229376, arg2, arg1) | (arg1 & 0x30000) != 0 || method2172(-109, arg1, arg2) || method2170(arg2, 0, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "(III)Z", line = 233)
    public static final boolean method2189(int arg0, int arg1, int arg2) {
        if (arg1 == 8320) {
            return (arg0 & 0x2080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(BII)Z", line = 243)
    public static final boolean method2190(byte arg0, int arg1, int arg2) {
        if (arg0 <= 78) {
            method2183(false, -112, -89);
        }
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "(III)Z", line = 255)
    public static final boolean method2191(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            return method2189(arg0, 8320, arg2) || method2172(-103, arg0, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "(III)Z", line = 265)
    public static final boolean method2192(int arg0, int arg1, int arg2) {
        return arg2 == -1 ? ((arg1 & 0x1000) != 0 | method2194(arg1, arg0, -27851) | method2176(arg1, arg0, (byte) -95)) & method2183(false, arg1, arg0) : false;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(IBI)Z", line = 275)
    public static final boolean method2193(int arg0, byte arg1, int arg2) {
        if (arg1 != -63) {
            method2187(-3, -72, -45);
        }
        return method2196(arg0, -1, arg2) | (arg2 & 0x400) != 0 || method2172(-119, arg2, arg0);
    }

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "(III)Z", line = 285)
    public static final boolean method2194(int arg0, int arg1, int arg2) {
        return arg2 == -27851 ? (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544 : true;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(BII)Z", line = 295)
    public static final boolean method2195(byte arg0, int arg1, int arg2) {
        if (arg0 == 29) {
            return (arg1 & 0x22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "(III)Z", line = 305)
    public static final boolean method2196(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2183(true, -93, 99);
        }
        return (arg2 & 0x4000) != 0;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(IIB)Z", line = 315)
    public static final boolean method2197(int arg0, int arg1, byte arg2) {
        if (arg2 == 65) {
            return (arg1 & 0x400) != 0;
        } else {
            return true;
        }
    }
}
