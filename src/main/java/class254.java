import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class254 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIB)Z", line = 4)
    public static final boolean method1675(int arg0, int arg1, byte arg2) {
        if (arg2 != -21) {
            method1687(-111, true, 0);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Z", line = 14)
    public static final boolean method1676(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return (arg2 & 0x10) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBI)Z", line = 24)
    public static final boolean method1677(int arg0, byte arg1, int arg2) {
        return arg1 >= -88 ? false : (method1688(101, arg2, arg0) | method1679(arg0, arg2, 34) | method1687(arg0, true, arg2)) & method1698(-1, arg2, arg0);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)Z", line = 34)
    public static final boolean method1678(int arg0, int arg1, int arg2) {
        if (arg2 != 16384) {
            method1676(120, 68, -18);
        }
        return (arg1 & 0x4000) != 0;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(III)Z", line = 44)
    public static final boolean method1679(int arg0, int arg1, int arg2) {
        if (arg2 == 34) {
            return (arg0 & 0x22) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIB)Z", line = 54)
    public static final boolean method1680(int arg0, int arg1, byte arg2) {
        return arg2 == 20 ? false : false;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(IIB)Z", line = 64)
    public static final boolean method1681(int arg0, int arg1, byte arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x2080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(III)Z", line = 74)
    public static final boolean method1682(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            return (arg2 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(III)Z", line = 84)
    public static final boolean method1683(int arg0, int arg1, int arg2) {
        return arg2 > -5 ? false : (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BII)Z", line = 94)
    public static final boolean method1684(byte arg0, int arg1, int arg2) {
        if (!method1675(arg1, arg2, (byte) -21)) {
            return false;
        } else if ((method1681(arg1, arg2, (byte) 1) | (arg1 & 0x5800) != 0 | method1686(arg2, -19827, arg1))) {
            return true;
        } else if (arg0 == 12) {
            return (method1683(arg1, arg2, -33) | method1695(arg2, 0, arg1)) & (arg2 & 0x37) == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(IIB)Z", line = 112)
    public static final boolean method1685(int arg0, int arg1, byte arg2) {
        if (arg2 < 114) {
            return false;
        } else {
            return method1688(95, arg1, arg0) | (arg0 & 0x38000) != 0 || method1677(arg0, (byte) -125, arg1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(III)Z", line = 122)
    public static final boolean method1686(int arg0, int arg1, int arg2) {
        if (arg1 != -19827) {
            method1693(27, -103, 10);
        }
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZI)Z", line = 132)
    public static final boolean method1687(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (arg0 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(III)Z", line = 142)
    public static final boolean method1688(int arg0, int arg1, int arg2) {
        if (arg0 < 92) {
            return true;
        } else {
            return (arg2 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "(III)Z", line = 152)
    public static final boolean method1689(int arg0, int arg1, int arg2) {
        if (arg0 < 118) {
            return true;
        } else if (((arg2 & 0x8000) != 0 | method1683(arg2, arg1, -91)) || method1696(arg2, (byte) -77, arg1)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && method1684((byte) 12, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "(III)Z", line = 165)
    public static final boolean method1690(int arg0, int arg1, int arg2) {
        if (arg1 != -12948) {
            method1697(51, 101, 41);
        }
        return method1679(arg2, arg0, 34) | (arg2 & 0x38000) != 0 || method1677(arg2, (byte) -109, arg0);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IZI)Z", line = 175)
    public static final boolean method1691(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (arg0 & 0x20000) != 0 | method1686(arg2, -19827, arg0) || method1684((byte) 12, arg0, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IBI)Z", line = 185)
    public static final boolean method1692(int arg0, byte arg1, int arg2) {
        if (arg1 > -3) {
            return true;
        } else {
            return method1687(arg0, true, arg2) | (arg0 & 0x38000) != 0 || method1677(arg0, (byte) -105, arg2);
        }
    }

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "(III)Z", line = 195)
    public static final boolean method1693(int arg0, int arg1, int arg2) {
        if (arg2 >= -44) {
            return true;
        } else {
            return method1678(arg1, arg0, 16384) | (arg0 & 0x400) != 0 || method1684((byte) 12, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "(III)Z", line = 206)
    public static final boolean method1694(int arg0, int arg1, int arg2) {
        int var3 = -3 % ((arg1 - 34) / 45);
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "(III)Z", line = 214)
    private static final boolean method1695(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            return (arg2 & 0x8000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(IBI)Z", line = 225)
    public static final boolean method1696(int arg0, byte arg1, int arg2) {
        int var3 = 30 % ((arg1 - 11) / 44);
        return (method1683(arg0, arg2, -119) | (arg0 & 0x1000) != 0 | method1695(arg2, 0, arg0)) & method1703(1024, arg2, arg0);
    }

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "(III)Z", line = 233)
    public static final boolean method1697(int arg0, int arg1, int arg2) {
        if (arg0 != 1024) {
            method1676(23, -64, -23);
        }
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "(III)Z", line = 243)
    public static final boolean method1698(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            return (arg2 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(IZI)Z", line = 253)
    public static final boolean method1699(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (arg2 & 0x20) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "(III)Z", line = 265)
    public static final boolean method1700(int arg0, int arg1, int arg2) {
        if (arg0 == 52) {
            return method1680(arg1, arg2, (byte) 20) || method1701(arg1, arg2, 126);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "(III)Z", line = 276)
    public static final boolean method1701(int arg0, int arg1, int arg2) {
        int var3 = 16 / ((arg2 - 90) / 32);
        return method1680(arg0, arg1, (byte) 20) & method1694(arg0, 100, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(IBI)Z", line = 285)
    public static final boolean method1702(int arg0, byte arg1, int arg2) {
        int var3 = -63 / ((14 - arg1) / 58);
        return (arg0 & 0x30000) != 0 | method1676(0, arg2, arg0) || method1684((byte) 12, arg0, arg2) || method1705(-120, arg0, arg2);
    }

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "(III)Z", line = 293)
    public static final boolean method1703(int arg0, int arg1, int arg2) {
        if (arg0 == 1024) {
            return (arg2 & 0x400) != 0 && (arg1 & 0x37) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(BII)Z", line = 303)
    public static final boolean method1704(byte arg0, int arg1, int arg2) {
        if (arg0 != 18) {
            method1693(-2, 112, -54);
        }
        return method1681(arg2, arg1, (byte) 1) || method1684((byte) 12, arg2, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "(III)Z", line = 313)
    public static final boolean method1705(int arg0, int arg1, int arg2) {
        if (arg0 > -104) {
            method1691(-15, false, 0);
        }
        return method1676(0, arg2, arg1) & method1697(1024, arg1, arg2);
    }
}
