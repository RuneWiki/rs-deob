import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class300 {

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)Z")
    public static final boolean method1842(int arg0, int arg1, int arg2) {
        return arg1 == 4684 ? method1859(arg0, arg2, arg1 + 224692) & method1850(arg2, (byte) 91, arg0) : true;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(III)Z")
    public static final boolean method1843(int arg0, int arg1, int arg2) {
        if (arg2 != 384) {
            method1866(58, 20, -35);
        }
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZII)Z")
    private static final boolean method1844(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return (arg2 & 0x8000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BII)Z")
    public static final boolean method1845(byte arg0, int arg1, int arg2) {
        if (arg0 <= 26) {
            return true;
        } else {
            return (arg1 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1846(int arg0, int arg1, byte arg2) {
        if (arg2 <= 45) {
            method1867(-121, -39, -68);
        }
        return method1853(arg0, -101, arg1) | (arg1 & 0x30000) != 0 || method1863(22528, arg1, arg0) || method1851(arg0, 20786, arg1);
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(III)Z")
    public static final boolean method1847(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            return method1857(-17743, arg2, arg1) | (arg1 & 0x400) != 0 || method1863(22528, arg1, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(III)Z")
    public static final boolean method1848(int arg0, int arg1, int arg2) {
        return arg1 == 1024 ? (method1872(33, arg0, arg2) | method1862(arg0, arg2, (byte) -63) | method1869(arg0, -1, arg2)) & method1866(arg2, 1024, arg0) : true;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIB)Z")
    public static final boolean method1849(int arg0, int arg1, byte arg2) {
        if (arg2 == 64) {
            return (arg1 & 0x38000) != 0 | method1872(33, arg1, arg0) || method1848(arg1, 1024, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1850(int arg0, byte arg1, int arg2) {
        if (arg1 <= 65) {
            method1856(-28, -43, (byte) -65);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "(III)Z")
    public static final boolean method1851(int arg0, int arg1, int arg2) {
        return arg1 == 20786 ? method1853(arg0, -74, arg2) & method1860((byte) 64, arg0, arg2) : false;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1852(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1858(-74, 82, -67);
        }
        return ((arg1 & 0x1000) != 0 | method1870(arg0, -11764, arg1) | method1844(arg2, arg0, arg1)) & method1855(15947, arg0, arg1);
    }

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "(III)Z")
    public static final boolean method1853(int arg0, int arg1, int arg2) {
        if (arg1 >= -32) {
            return true;
        } else {
            return (arg2 & 0x10) != 0;
        }
    }

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "(III)Z")
    public static final boolean method1854(int arg0, int arg1, int arg2) {
        if (arg1 == -30926) {
            return (arg0 & 0x2080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "(III)Z")
    public static final boolean method1855(int arg0, int arg1, int arg2) {
        if (arg0 == 15947) {
            return (arg2 & 0x400) != 0 && (arg1 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(IIB)Z")
    public static final boolean method1856(int arg0, int arg1, byte arg2) {
        if (arg2 == -100) {
            return method1859(arg1, arg0, 229376) || method1842(arg1, 4684, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "(III)Z")
    public static final boolean method1857(int arg0, int arg1, int arg2) {
        if (arg0 == -17743) {
            return (arg2 & 0x4000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "(III)Z")
    public static final boolean method1858(int arg0, int arg1, int arg2) {
        if (arg0 <= 98) {
            return true;
        } else {
            return (arg2 & 0x38000) != 0 | method1862(arg2, arg1, (byte) -63) || method1848(arg2, 1024, arg1);
        }
    }

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "(III)Z")
    public static final boolean method1859(int arg0, int arg1, int arg2) {
        return arg2 != 229376;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(BII)Z")
    public static final boolean method1860(byte arg0, int arg1, int arg2) {
        if (arg0 <= 8) {
            method1847(-31, -107, -42);
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "(III)Z")
    public static final boolean method1861(int arg0, int arg1, int arg2) {
        if (arg0 != -1295) {
            method1847(-78, -38, 79);
        }
        return method1854(arg1, -30926, arg2) || method1863(arg0 + 23823, arg1, arg2);
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(IIB)Z")
    public static final boolean method1862(int arg0, int arg1, byte arg2) {
        if (arg2 == -63) {
            return (arg0 & 0x22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "(III)Z")
    public static final boolean method1863(int arg0, int arg1, int arg2) {
        if (method1871(arg2, arg1, -119)) {
            return (arg1 & arg0) != 0 | method1854(arg1, arg0 ^ 0xFFFFDF32, arg2) | method1864(arg1, 55, arg2) ? true : (arg2 & 0x37) == 0 & (method1870(arg2, -11764, arg1) | method1844(true, arg2, arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "(III)Z")
    public static final boolean method1864(int arg0, int arg1, int arg2) {
        if (arg1 == 55) {
            return (arg0 & 0x100) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IBI)Z")
    public static final boolean method1865(int arg0, byte arg1, int arg2) {
        int var3 = -25 % ((-arg1 - 7) / 40);
        return method1864(arg2, 55, arg0) | (arg2 & 0x20000) != 0 || method1863(22528, arg2, arg0);
    }

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "(III)Z")
    public static final boolean method1866(int arg0, int arg1, int arg2) {
        if (arg1 == 1024) {
            return (arg2 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "(III)Z")
    public static final boolean method1867(int arg0, int arg1, int arg2) {
        if (((arg0 & 0x8000) != 0 | method1870(arg1, arg2 - 11819, arg0)) || method1852(arg1, arg0, true)) {
            return true;
        } else if (arg2 == 55) {
            return (arg1 & 0x37) == 0 && method1863(arg2 ^ 0x5837, arg0, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIZ)Z")
    public static final boolean method1868(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1847(-23, -16, 98);
        }
        return method1869(arg1, -1, arg0) | (arg1 & 0x38000) != 0 || method1848(arg1, 1024, arg0);
    }

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "(III)Z")
    public static final boolean method1869(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            return (arg0 & 0x34) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "(III)Z")
    public static final boolean method1870(int arg0, int arg1, int arg2) {
        return arg1 == -11764 ? (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544 : true;
    }

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "(III)Z")
    public static final boolean method1871(int arg0, int arg1, int arg2) {
        if (arg2 >= -118) {
            return false;
        } else {
            return (arg1 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "(III)Z")
    public static final boolean method1872(int arg0, int arg1, int arg2) {
        if (arg0 == 33) {
            return (arg1 & 0x21) != 0;
        } else {
            return true;
        }
    }
}
