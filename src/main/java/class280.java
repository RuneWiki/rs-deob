import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class280 {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1765(int arg0, int arg1, int arg2) {
        if (arg2 != 229376) {
            method1780(55, -8, -119);
        }
        return (arg0 & 0x38000) != 0 | method1790(arg0, arg1, 0) || method1775(arg0, 99, arg1);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBI)Z", line = 14)
    public static final boolean method1766(int arg0, byte arg1, int arg2) {
        if (arg1 == -32) {
            return method1769(arg2, (byte) 117, arg0) | (arg0 & 0x30000) != 0 || method1787(arg0, arg2, -24919) || method1773((byte) 124, arg2, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIB)Z", line = 24)
    public static final boolean method1767(int arg0, int arg1, byte arg2) {
        if (arg2 >= -20) {
            method1781(-106, true, 113);
        }
        return method1793(1024, arg0, arg1) | (arg1 & 0x20000) != 0 || method1787(arg1, arg0, -24919);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(III)Z", line = 34)
    public static final boolean method1768(int arg0, int arg1, int arg2) {
        if (arg2 <= 8) {
            method1765(69, 112, -26);
        }
        return (arg1 & 0x4000) != 0;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(IBI)Z", line = 44)
    public static final boolean method1769(int arg0, byte arg1, int arg2) {
        if (arg1 != 117) {
            method1784(93, 26, -109);
        }
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZI)Z", line = 54)
    public static final boolean method1770(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1795(-91, 49, 60);
        }
        return (method1794(arg0, (byte) 120, arg2) | (arg2 & 0x1000) != 0 | method1786(0, arg0, arg2)) & method1781(arg0, true, arg2);
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(III)Z", line = 64)
    public static final boolean method1771(int arg0, int arg1, int arg2) {
        if (arg2 != 3542) {
            method1792(-3, -116, true);
        }
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(III)Z", line = 74)
    public static final boolean method1772(int arg0, int arg1, int arg2) {
        if (arg0 == 1024) {
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BII)Z", line = 84)
    public static final boolean method1773(byte arg0, int arg1, int arg2) {
        return arg0 == 124 ? method1769(arg1, (byte) 117, arg2) & method1779(arg1, (byte) 68, arg2) : true;
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(III)Z", line = 94)
    public static final boolean method1774(int arg0, int arg1, int arg2) {
        return arg2 == 0 ? method1784(arg2 - 1, arg1, arg0) & method1772(arg2 + 1024, arg1, arg0) : true;
    }

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "(III)Z", line = 105)
    public static final boolean method1775(int arg0, int arg1, int arg2) {
        int var3 = 98 / ((48 - arg1) / 48);
        return (method1785(0, arg2, arg0) | method1790(arg0, arg2, 0) | method1780(229376, arg0, arg2)) & method1792(arg2, arg0, true);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(BII)Z", line = 113)
    public static final boolean method1776(byte arg0, int arg1, int arg2) {
        if (arg0 == -24) {
            return method1780(229376, arg1, arg2) | (arg1 & 0x38000) != 0 || method1775(arg1, arg0 ^ 0x10, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "(III)Z", line = 123)
    public static final boolean method1777(int arg0, int arg1, int arg2) {
        if (arg1 == 32768) {
            return (arg2 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(IBI)Z", line = 134)
    public static final boolean method1778(int arg0, byte arg1, int arg2) {
        int var3 = 57 % ((-arg1 - 59) / 33);
        return method1768(arg0, arg2, 86) | (arg2 & 0x400) != 0 || method1787(arg2, arg0, -24919);
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(IBI)Z", line = 142)
    public static final boolean method1779(int arg0, byte arg1, int arg2) {
        if (arg1 <= 27) {
            return true;
        } else {
            return (arg2 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "(III)Z", line = 152)
    public static final boolean method1780(int arg0, int arg1, int arg2) {
        if (arg0 == 229376) {
            return (arg1 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(IZI)Z", line = 162)
    public static final boolean method1781(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (arg2 & 0x400) != 0 && (arg0 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "(III)Z", line = 172)
    public static final boolean method1782(int arg0, int arg1, int arg2) {
        if (arg0 != -25943) {
            method1768(23, -120, -22);
        }
        return method1783(arg2, arg1, (byte) 74) || method1787(arg2, arg1, -24919);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(IIB)Z", line = 182)
    public static final boolean method1783(int arg0, int arg1, byte arg2) {
        if (arg2 == 74) {
            return (arg0 & 0x2080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "(III)Z", line = 192)
    public static final boolean method1784(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            method1784(-116, -108, -124);
        }
        return false;
    }

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "(III)Z", line = 202)
    public static final boolean method1785(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return (arg2 & 0x21) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "(III)Z", line = 212)
    private static final boolean method1786(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return (arg2 & 0x8000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "(III)Z", line = 222)
    public static final boolean method1787(int arg0, int arg1, int arg2) {
        if (method1788(true, arg1, arg0)) {
            if (arg2 != -24919) {
                method1776((byte) 9, -77, -80);
            }
            return method1783(arg0, arg1, (byte) 74) | (arg0 & 0x5800) != 0 | method1793(1024, arg1, arg0) ? true : (arg1 & 0x37) == 0 & (method1794(arg1, (byte) 120, arg0) | method1786(0, arg1, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZII)Z", line = 239)
    public static final boolean method1788(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1786(96, -111, 98);
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "(III)Z", line = 249)
    public static final boolean method1789(int arg0, int arg1, int arg2) {
        if (((arg2 & 0x8000) != 0 | method1794(arg0, (byte) 120, arg2)) || method1770(arg0, false, arg2)) {
            return true;
        } else if (arg1 > -22) {
            return false;
        } else {
            return (arg0 & 0x37) == 0 && method1787(arg2, arg0, -24919);
        }
    }

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "(III)Z", line = 262)
    public static final boolean method1790(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            return (arg0 & 0x22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "(III)Z", line = 275)
    public static final boolean method1791(int arg0, int arg1, int arg2) {
        int var3 = -121 % ((arg2 + 64) / 40);
        return method1784(-1, arg0, arg1) || method1774(arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIZ)Z", line = 283)
    public static final boolean method1792(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return (arg1 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "(III)Z", line = 293)
    public static final boolean method1793(int arg0, int arg1, int arg2) {
        if (arg0 != 1024) {
            method1791(-13, -21, -75);
        }
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(IBI)Z", line = 303)
    public static final boolean method1794(int arg0, byte arg1, int arg2) {
        return arg1 == 120 ? (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544 : true;
    }

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "(III)Z", line = 313)
    public static final boolean method1795(int arg0, int arg1, int arg2) {
        if (arg2 != 55) {
            method1769(-109, (byte) 34, -64);
        }
        return (arg1 & 0x38000) != 0 | method1785(arg2 ^ 0x37, arg0, arg1) || method1775(arg1, -36, arg0);
    }
}
