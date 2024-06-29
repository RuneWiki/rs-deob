import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class322 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z")
    public static final boolean method2004(int arg0, int arg1, int arg2) {
        return arg0 == 32768 ? method2009(arg1, arg2, 121) & method2024(arg2, arg1, (byte) 65) : false;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)Z")
    public static final boolean method2005(int arg0, int arg1, int arg2) {
        if (arg0 != -22784) {
            return true;
        } else if ((method2025(arg2, arg1, (byte) -77) | (arg1 & 0x8000) != 0) || method2006(arg2, arg0 ^ 0x58D6, arg1)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && method2019(arg1, arg2, arg0 ^ 0x58D6);
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(III)Z")
    public static final boolean method2006(int arg0, int arg1, int arg2) {
        int var3 = 92 / ((13 - arg1) / 35);
        return (method2025(arg0, arg2, (byte) -77) | (arg2 & 0x1000) != 0 | method2030(arg2, false, arg0)) & method2012(arg2, arg0, -120);
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(III)Z")
    public static final boolean method2007(int arg0, int arg1, int arg2) {
        if (arg2 == 21318) {
            return (arg1 & 0x400) != 0 | method2018(arg0, true, arg1) || method2019(arg1, arg0, -4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(III)Z")
    public static final boolean method2008(int arg0, int arg1, int arg2) {
        if (arg2 == 16888) {
            return (arg0 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(III)Z")
    public static final boolean method2009(int arg0, int arg1, int arg2) {
        int var3 = -122 % ((-arg2 - 19) / 49);
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(III)Z")
    public static final boolean method2010(int arg0, int arg1, int arg2) {
        if (arg0 != 55) {
            method2030(-63, true, 66);
        }
        return (arg1 & 0x38000) != 0 | method2011(-14, arg1, arg2) || method2020(-27195, arg1, arg2);
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(III)Z")
    public static final boolean method2011(int arg0, int arg1, int arg2) {
        int var3 = -39 / ((arg0 - 47) / 48);
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "(III)Z")
    public static final boolean method2012(int arg0, int arg1, int arg2) {
        int var3 = 100 % ((-arg2 - 69) / 38);
        return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)Z")
    public static final boolean method2013(byte arg0, int arg1, int arg2) {
        if (arg0 == 101) {
            return (arg1 & 0x2080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "(III)Z")
    public static final boolean method2014(int arg0, int arg1, int arg2) {
        int var3 = -2 % ((-arg0 - 19) / 61);
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "(III)Z")
    public static final boolean method2015(int arg0, int arg1, int arg2) {
        if (arg1 != -12269) {
            method2030(80, true, 36);
        }
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2016(int arg0, byte arg1, int arg2) {
        if (arg1 == 95) {
            return method2014(arg1 + 28, arg0, arg2) | (arg0 & 0x38000) != 0 || method2020(-27195, arg0, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "(III)Z")
    public static final boolean method2017(int arg0, int arg1, int arg2) {
        if (arg0 <= 106) {
            return false;
        } else {
            return (arg2 & 0x30000) != 0 | method2015(arg1, -12269, arg2) || method2019(arg2, arg1, 10) || method2032(arg2, 52, arg1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2018(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (arg2 & 0x4000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "(III)Z")
    public static final boolean method2019(int arg0, int arg1, int arg2) {
        if (method2026(1024, arg0, arg1)) {
            int var3 = -5 / ((63 - arg2) / 47);
            return (arg0 & 0x5800) != 0 | method2013((byte) 101, arg0, arg1) | method2022(arg1, -1, arg0) ? true : (method2025(arg1, arg0, (byte) -77) | method2030(arg0, false, arg1)) & (arg1 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "(III)Z")
    public static final boolean method2020(int arg0, int arg1, int arg2) {
        return arg0 == -27195 ? (method2011(116, arg1, arg2) | method2033(arg1, false, arg2) | method2014(56, arg1, arg2)) & method2023(arg1, arg2, (byte) 78) : false;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IZI)Z")
    public static final boolean method2021(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method2008(104, 127, -105);
        }
        return method2009(arg0, arg2, -70) || method2004(32768, arg0, arg2);
    }

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "(III)Z")
    public static final boolean method2022(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2012(28, 44, -74);
        }
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2023(int arg0, int arg1, byte arg2) {
        if (arg2 != 78) {
            method2015(-41, -7, -86);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IIB)Z")
    public static final boolean method2024(int arg0, int arg1, byte arg2) {
        if (arg2 == 65) {
            return (arg1 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(IIB)Z")
    public static final boolean method2025(int arg0, int arg1, byte arg2) {
        return arg2 == -77 ? (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544 : false;
    }

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "(III)Z")
    public static final boolean method2026(int arg0, int arg1, int arg2) {
        if (arg0 == 1024) {
            return (arg1 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(BII)Z")
    public static final boolean method2027(byte arg0, int arg1, int arg2) {
        int var3 = -123 / ((arg0 + 1) / 38);
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(IIB)Z")
    public static final boolean method2028(int arg0, int arg1, byte arg2) {
        if (arg2 == 39) {
            return method2022(arg1, -1, arg0) | (arg0 & 0x20000) != 0 || method2019(arg0, arg1, 112);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "(III)Z")
    public static final boolean method2029(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2006(-94, 70, 11);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(IZI)Z")
    private static final boolean method2030(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return true;
        } else {
            return (arg0 & 0x8000) != 0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(IIB)Z")
    public static final boolean method2031(int arg0, int arg1, byte arg2) {
        if (arg2 >= -66) {
            return true;
        } else {
            return method2033(arg1, false, arg0) | (arg1 & 0x38000) != 0 || method2020(-27195, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "(III)Z")
    public static final boolean method2032(int arg0, int arg1, int arg2) {
        if (arg1 != 52) {
            method2014(66, 17, 16);
        }
        return method2015(arg2, -12269, arg0) & method2029(arg0, -1, arg2);
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(IZI)Z")
    public static final boolean method2033(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method2013((byte) 41, 59, -125);
        }
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IBI)Z")
    public static final boolean method2034(int arg0, byte arg1, int arg2) {
        int var3 = 82 / ((-arg1 - 10) / 39);
        return method2013((byte) 101, arg2, arg0) || method2019(arg2, arg0, 114);
    }
}
