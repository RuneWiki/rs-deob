import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class277 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1880(int arg0, int arg1, int arg2) {
        if (arg1 == 1024) {
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZI)Z", line = 14)
    public static final boolean method1881(int arg0, boolean arg1, int arg2) {
        return arg1 ? (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544 : true;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)Z", line = 24)
    public static final boolean method1882(int arg0, int arg1, int arg2) {
        if (!method1900(arg2, (byte) -35, arg0)) {
            return false;
        } else if (method1896(arg2, arg0, -1) | (arg2 & 0x5800) != 0 | method1888(arg2, arg0, 116)) {
            return true;
        } else if (arg1 >= -44) {
            return false;
        } else {
            return (method1881(arg2, true, arg0) | method1893((byte) 34, arg0, arg2)) & (arg0 & 0x37) == 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB)Z", line = 40)
    public static final boolean method1883(int arg0, int arg1, byte arg2) {
        if (arg2 > -117) {
            return false;
        } else {
            return (arg1 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBI)Z", line = 50)
    public static final boolean method1884(int arg0, byte arg1, int arg2) {
        if (arg1 >= -11) {
            return true;
        } else {
            return method1896(arg0, arg2, -1) || method1882(arg2, -69, arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(III)Z", line = 60)
    public static final boolean method1885(int arg0, int arg1, int arg2) {
        if (arg2 >= -29) {
            method1890(-28, -125, 11);
        }
        return method1899(arg1, (byte) -48, arg0) | (arg0 & 0x38000) != 0 || method1890(arg0, 32, arg1);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIB)Z", line = 70)
    public static final boolean method1886(int arg0, int arg1, byte arg2) {
        if (arg2 != 50) {
            method1886(-77, 73, (byte) 92);
        }
        return (arg0 & 0x400) != 0 | method1892(arg1, arg0, 21766) || method1882(arg1, -45, arg0);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZ)Z", line = 80)
    public static final boolean method1887(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return true;
        } else {
            return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(III)Z", line = 90)
    public static final boolean method1888(int arg0, int arg1, int arg2) {
        if (arg2 <= 79) {
            method1909(-17, -60, false);
        }
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(III)Z", line = 100)
    public static final boolean method1889(int arg0, int arg1, int arg2) {
        if ((method1881(arg2, true, arg1) | (arg2 & 0x8000) != 0) || method1894(89, arg1, arg2)) {
            return true;
        } else if (arg0 == 32) {
            return (arg1 & 0x37) == 0 && method1882(arg1, -93, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(III)Z", line = 114)
    public static final boolean method1890(int arg0, int arg1, int arg2) {
        return arg1 == 32 ? (method1883(arg2, arg0, (byte) -120) | method1895(arg2, arg0, (byte) -76) | method1899(arg2, (byte) -115, arg0)) & method1880(arg2, 1024, arg0) : true;
    }

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "(III)Z", line = 124)
    public static final boolean method1891(int arg0, int arg1, int arg2) {
        if (arg0 < 2) {
            return true;
        } else {
            return method1898(arg2, (byte) -116, arg1) | (arg2 & 0x30000) != 0 || method1882(arg1, -84, arg2) || method1909(arg1, arg2, false);
        }
    }

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "(III)Z", line = 134)
    public static final boolean method1892(int arg0, int arg1, int arg2) {
        if (arg2 == 21766) {
            return (arg1 & 0x4000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII)Z", line = 145)
    private static final boolean method1893(byte arg0, int arg1, int arg2) {
        int var3 = -61 % ((arg0 + 33) / 47);
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "(III)Z", line = 153)
    public static final boolean method1894(int arg0, int arg1, int arg2) {
        if (arg0 <= 82) {
            method1897(120, false, -11);
        }
        return ((arg2 & 0x1000) != 0 | method1881(arg2, true, arg1) | method1893((byte) 23, arg1, arg2)) & method1887(arg2, arg1, false);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(IIB)Z", line = 163)
    public static final boolean method1895(int arg0, int arg1, byte arg2) {
        if (arg2 == -76) {
            return (arg1 & 0x22) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "(III)Z", line = 173)
    public static final boolean method1896(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            return (arg0 & 0x2080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IZI)Z", line = 183)
    public static final boolean method1897(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1909(-122, 25, true);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IBI)Z", line = 193)
    public static final boolean method1898(int arg0, byte arg1, int arg2) {
        if (arg1 == -116) {
            return (arg0 & 0x10) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(IBI)Z", line = 203)
    public static final boolean method1899(int arg0, byte arg1, int arg2) {
        if (arg1 > -33) {
            return false;
        } else {
            return (arg2 & 0x34) != 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(IBI)Z", line = 214)
    public static final boolean method1900(int arg0, byte arg1, int arg2) {
        int var3 = 46 % ((arg1 - 62) / 40);
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(III)Z", line = 222)
    public static final boolean method1901(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            return method1895(arg2, arg0, (byte) -76) | (arg0 & 0x38000) != 0 || method1890(arg0, 32, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(IBI)Z", line = 233)
    public static final boolean method1902(int arg0, byte arg1, int arg2) {
        int var3 = 108 / ((arg1 - 48) / 63);
        return method1910((byte) 31, arg0, arg2) || method1906(arg2, arg0, 32768);
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(IIB)Z", line = 241)
    public static final boolean method1903(int arg0, int arg1, byte arg2) {
        if (arg2 != -3) {
            method1896(98, 62, -95);
        }
        return method1883(arg0, arg1, (byte) -127) | (arg1 & 0x38000) != 0 || method1890(arg1, 32, arg0);
    }

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "(III)Z", line = 254)
    public static final boolean method1904(int arg0, int arg1, int arg2) {
        int var3 = -79 % ((30 - arg1) / 59);
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "(III)Z", line = 262)
    public static final boolean method1905(int arg0, int arg1, int arg2) {
        if (arg2 != 14868) {
            method1887(-11, 85, true);
        }
        return (arg0 & 0x20000) != 0 | method1888(arg0, arg1, arg2 ^ 0x3A48) || method1882(arg1, -119, arg0);
    }

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "(III)Z", line = 272)
    public static final boolean method1906(int arg0, int arg1, int arg2) {
        if (arg2 != 32768) {
            method1899(-15, (byte) 62, 54);
        }
        return method1910((byte) 31, arg1, arg0) & method1897(arg1, false, arg0);
    }

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "(III)Z", line = 282)
    public static final boolean method1907(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method1895(54, -67, (byte) -44);
        }
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(III)Z", line = 292)
    public static final boolean method1908(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            return (arg0 & 0x20) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIZ)Z", line = 302)
    public static final boolean method1909(int arg0, int arg1, boolean arg2) {
        return arg2 ? false : method1898(arg1, (byte) -116, arg0) & method1907(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(BII)Z", line = 312)
    public static final boolean method1910(byte arg0, int arg1, int arg2) {
        if (arg0 != 31) {
            method1885(-69, 16, 18);
        }
        return false;
    }
}
