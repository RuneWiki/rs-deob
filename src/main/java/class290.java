import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class290 {

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1895(int arg0, int arg1, int arg2) {
        if (arg2 == 13511) {
            return (arg1 & 0x2080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIB)Z", line = 14)
    public static final boolean method1896(int arg0, int arg1, byte arg2) {
        if (arg2 != -60) {
            method1908(-84, 121, 102);
        }
        return method1895(arg1, arg0, arg2 + 13571) || method1918(arg0, arg2 - 68, arg1);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBI)Z", line = 24)
    public static final boolean method1897(int arg0, byte arg1, int arg2) {
        if (arg1 < 40) {
            method1907(-88, -128, -70);
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(III)Z", line = 34)
    public static final boolean method1898(int arg0, int arg1, int arg2) {
        if (arg0 <= 58) {
            return false;
        } else {
            return (arg1 & 0x10) != 0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IIB)Z", line = 44)
    public static final boolean method1899(int arg0, int arg1, byte arg2) {
        if (arg2 == -86) {
            return (arg1 & 0x100) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZI)Z", line = 54)
    public static final boolean method1900(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1922(-25, -12, 126);
        }
        return method1911(arg0, arg2, 114) | (arg2 & 0x38000) != 0 || method1914(arg2, arg0, -107);
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(III)Z", line = 64)
    public static final boolean method1901(int arg0, int arg1, int arg2) {
        if (arg1 == 11092) {
            return (arg2 & 0x20) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(III)Z", line = 74)
    public static final boolean method1902(int arg0, int arg1, int arg2) {
        if (arg0 == 55) {
            return (arg2 & 0x4000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(III)Z", line = 84)
    public static final boolean method1903(int arg0, int arg1, int arg2) {
        if (arg1 != -11553) {
            method1907(77, 65, -4);
        }
        return ((arg0 & 0x1000) != 0 | method1925(arg2, arg1 ^ 0xFFFFEE60, arg0) | method1921(arg0, (byte) -126, arg2)) & method1920(arg2, true, arg0);
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "(III)Z", line = 94)
    public static final boolean method1904(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            return (arg0 & 0x20000) != 0 | method1899(arg1, arg0, (byte) -86) || method1918(arg0, arg2 ^ 0xFFFFFF82, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IBI)Z", line = 105)
    public static final boolean method1905(int arg0, byte arg1, int arg2) {
        int var3 = -19 % ((-arg1 - 17) / 60);
        return false;
    }

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "(III)Z", line = 113)
    public static final boolean method1906(int arg0, int arg1, int arg2) {
        if (arg1 != 1024) {
            method1924(93, (byte) -11, 61);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "(III)Z", line = 125)
    public static final boolean method1907(int arg0, int arg1, int arg2) {
        if (arg1 < 54) {
            return true;
        } else {
            return method1898(127, arg2, arg0) | (arg2 & 0x30000) != 0 || method1918(arg2, -127, arg0) || method1919(arg2, (byte) -117, arg0);
        }
    }

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "(III)Z", line = 136)
    public static final boolean method1908(int arg0, int arg1, int arg2) {
        int var3 = -74 % ((arg0 + 14) / 57);
        return method1905(arg1, (byte) -126, arg2) || method1912((byte) -115, arg2, arg1);
    }

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "(III)Z", line = 144)
    public static final boolean method1909(int arg0, int arg1, int arg2) {
        if (arg1 == -32378) {
            return (arg0 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BII)Z", line = 155)
    public static final boolean method1910(byte arg0, int arg1, int arg2) {
        int var3 = 69 % ((-arg0 - 22) / 60);
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "(III)Z", line = 164)
    public static final boolean method1911(int arg0, int arg1, int arg2) {
        int var3 = -90 / ((43 - arg2) / 48);
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(BII)Z", line = 172)
    public static final boolean method1912(byte arg0, int arg1, int arg2) {
        return arg0 > -97 ? false : method1905(arg2, (byte) -90, arg1) & method1897(arg1, (byte) 45, arg2);
    }

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "(III)Z", line = 182)
    public static final boolean method1913(int arg0, int arg1, int arg2) {
        if (arg2 < 35) {
            method1921(29, (byte) -97, 56);
        }
        return (arg0 & 0x400) != 0 | method1902(55, arg1, arg0) || method1918(arg0, -126, arg1);
    }

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "(III)Z", line = 193)
    public static final boolean method1914(int arg0, int arg1, int arg2) {
        int var3 = 59 / ((7 - arg2) / 59);
        return (method1910((byte) 56, arg0, arg1) | method1915(arg0, arg1, 34) | method1911(arg1, arg0, 117)) & method1922(33, arg1, arg0);
    }

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "(III)Z", line = 201)
    public static final boolean method1915(int arg0, int arg1, int arg2) {
        if (arg2 == 34) {
            return (arg0 & 0x22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "(III)Z", line = 211)
    public static final boolean method1916(int arg0, int arg1, int arg2) {
        if (arg1 != 4096) {
            method1902(-116, 59, -2);
        }
        return method1915(arg0, arg2, arg1 ^ 0x1022) | (arg0 & 0x38000) != 0 || method1914(arg0, arg2, 90);
    }

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "(III)Z", line = 221)
    public static final boolean method1917(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method1904(26, -5, 0);
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "(III)Z", line = 231)
    public static final boolean method1918(int arg0, int arg1, int arg2) {
        if (arg1 >= -125) {
            return true;
        } else if (method1917(arg2, -1, arg0)) {
            return (method1895(arg2, arg0, 13511) | (arg0 & 0x5800) != 0 | method1899(arg2, arg0, (byte) -86)) ? true : (method1925(arg2, 15551, arg0) | method1921(arg0, (byte) 29, arg2)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(IBI)Z", line = 248)
    public static final boolean method1919(int arg0, byte arg1, int arg2) {
        return arg1 >= -102 ? true : method1898(88, arg0, arg2) & method1906(arg0, 1024, arg2);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IZI)Z", line = 258)
    public static final boolean method1920(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (arg2 & 0x400) != 0 && (arg0 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(IBI)Z", line = 269)
    private static final boolean method1921(int arg0, byte arg1, int arg2) {
        int var3 = 90 / ((-arg1 - 81) / 44);
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "(III)Z", line = 277)
    public static final boolean method1922(int arg0, int arg1, int arg2) {
        if (arg0 == 33) {
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "(III)Z", line = 287)
    public static final boolean method1923(int arg0, int arg1, int arg2) {
        if (arg2 == 229376) {
            return (arg1 & 0x38000) != 0 | method1910((byte) -118, arg1, arg0) || method1914(arg1, arg0, 68);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(IBI)Z", line = 297)
    public static final boolean method1924(int arg0, byte arg1, int arg2) {
        if (((arg2 & 0x8000) != 0 | method1925(arg0, 15551, arg2)) || method1903(arg2, -11553, arg0)) {
            return true;
        } else if (arg1 == -39) {
            return (arg0 & 0x37) == 0 && method1918(arg2, -128, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "(III)Z", line = 310)
    public static final boolean method1925(int arg0, int arg1, int arg2) {
        return arg1 == 15551 ? (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0 : true;
    }
}
