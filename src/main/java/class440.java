import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class440 {

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIZ)Z", line = 4)
    public static final boolean method2704(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return true;
        } else {
            return (arg0 & 0x22) != 0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIB)Z", line = 14)
    public static final boolean method2705(int arg0, int arg1, byte arg2) {
        if (arg2 > 0) {
            return false;
        } else if (method2729(arg0, -30410, arg1)) {
            return (arg1 & 0x5800) != 0 | method2710(arg1, arg0, (byte) 23) | method2711(arg0, (byte) -55, arg1) ? true : (arg0 & 0x37) == 0 & (method2730((byte) -58, arg0, arg1) | method2713(arg0, 0, arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBI)Z", line = 31)
    public static final boolean method2706(int arg0, byte arg1, int arg2) {
        if (arg1 == 47) {
            return method2707(arg2, 32768, arg0) || method2727(arg1 ^ 0x59, arg0, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)Z", line = 41)
    public static final boolean method2707(int arg0, int arg1, int arg2) {
        if (arg1 != 32768) {
            method2726(17, -5, 61);
        }
        return false;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIZ)Z", line = 51)
    public static final boolean method2708(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return (arg1 & 0x20) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)Z", line = 61)
    public static final boolean method2709(byte arg0, int arg1, int arg2) {
        if (arg0 > -51) {
            return true;
        } else {
            return method2704(arg1, arg2, false) | (arg1 & 0x38000) != 0 || method2731(-205, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIB)Z", line = 71)
    public static final boolean method2710(int arg0, int arg1, byte arg2) {
        if (arg2 != 23) {
            method2711(-117, (byte) 27, -4);
        }
        return (arg0 & 0x2080) != 0;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IBI)Z", line = 81)
    public static final boolean method2711(int arg0, byte arg1, int arg2) {
        if (arg1 > -15) {
            method2731(80, -81, -87);
        }
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(III)Z", line = 91)
    public static final boolean method2712(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2730((byte) -72, -9, -70);
        }
        return (method2730((byte) -110, arg2, arg0) | (arg0 & 0x1000) != 0 | method2713(arg2, arg1 + 1, arg0)) & method2721(arg0, (byte) 108, arg2);
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(III)Z", line = 101)
    private static final boolean method2713(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            return (arg2 & 0x8000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(IBI)Z", line = 111)
    public static final boolean method2714(int arg0, byte arg1, int arg2) {
        if (arg1 < 26) {
            method2708(-5, 34, false);
        }
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(III)Z", line = 121)
    public static final boolean method2715(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            return method2710(arg2, arg0, (byte) 23) || method2705(arg0, arg2, (byte) -4);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "(III)Z", line = 131)
    public static final boolean method2716(int arg0, int arg1, int arg2) {
        return arg0 <= 74 ? false : method2714(arg1, (byte) 70, arg2) & method2726(arg1, arg2, -109);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(BII)Z", line = 142)
    public static final boolean method2717(byte arg0, int arg1, int arg2) {
        int var3 = 42 / ((81 - arg0) / 40);
        if ((method2730((byte) -63, arg2, arg1) | (arg1 & 0x8000) != 0) || method2712(arg1, -1, arg2)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && method2705(arg2, arg1, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "(III)Z", line = 153)
    public static final boolean method2718(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2710(92, -59, (byte) -47);
        }
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(IBI)Z", line = 163)
    public static final boolean method2719(int arg0, byte arg1, int arg2) {
        if (arg1 > -96) {
            return true;
        } else {
            return (arg0 & 0x400) != 0 | method2733(arg0, (byte) -123, arg2) || method2705(arg2, arg0, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "(III)Z", line = 173)
    public static final boolean method2720(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method2714(-55, (byte) -128, 88);
        }
        return (arg1 & 0x38000) != 0 | method2725(arg1, (byte) 111, arg0) || method2731(-205, arg0, arg1);
    }

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "(IBI)Z", line = 184)
    public static final boolean method2721(int arg0, byte arg1, int arg2) {
        int var3 = 9 / ((-arg1 - 36) / 41);
        return (arg0 & 0x400) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "(III)Z", line = 192)
    public static final boolean method2722(int arg0, int arg1, int arg2) {
        if (arg2 == -8426) {
            return (arg0 & 0x21) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "(III)Z", line = 202)
    public static final boolean method2723(int arg0, int arg1, int arg2) {
        if (arg1 < 33) {
            method2705(78, -3, (byte) -81);
        }
        return (arg0 & 0x38000) != 0 | method2722(arg0, arg2, -8426) || method2731(-205, arg2, arg0);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZI)Z", line = 212)
    public static final boolean method2724(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (arg2 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "(IBI)Z", line = 222)
    public static final boolean method2725(int arg0, byte arg1, int arg2) {
        if (arg1 <= 73) {
            return true;
        } else {
            return (arg0 & 0x34) != 0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "(III)Z", line = 232)
    public static final boolean method2726(int arg0, int arg1, int arg2) {
        if (arg2 > -9) {
            return true;
        } else {
            return (arg0 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "(III)Z", line = 242)
    public static final boolean method2727(int arg0, int arg1, int arg2) {
        return arg0 <= 46 ? false : method2707(arg2, 32768, arg1) & method2732(arg2, arg1, 55);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IZI)Z", line = 252)
    public static final boolean method2728(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return true;
        } else {
            return (arg2 & 0x30000) != 0 | method2714(arg2, (byte) 99, arg0) || method2705(arg0, arg2, (byte) -41) || method2716(124, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "(III)Z", line = 262)
    public static final boolean method2729(int arg0, int arg1, int arg2) {
        if (arg1 == -30410) {
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(BII)Z", line = 272)
    public static final boolean method2730(byte arg0, int arg1, int arg2) {
        if (arg0 > -17) {
            method2711(116, (byte) 80, -74);
        }
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "(III)Z", line = 282)
    public static final boolean method2731(int arg0, int arg1, int arg2) {
        return arg0 == -205 ? (method2722(arg2, arg1, arg0 - 8221) | method2704(arg2, arg1, false) | method2725(arg2, (byte) 92, arg1)) & method2724(arg1, true, arg2) : true;
    }

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "(III)Z", line = 292)
    public static final boolean method2732(int arg0, int arg1, int arg2) {
        if (arg2 != 55) {
            method2710(-24, -67, (byte) 34);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "(IBI)Z", line = 302)
    public static final boolean method2733(int arg0, byte arg1, int arg2) {
        if (arg1 > -71) {
            return false;
        } else {
            return (arg0 & 0x4000) != 0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "(IBI)Z", line = 312)
    public static final boolean method2734(int arg0, byte arg1, int arg2) {
        if (arg1 != 74) {
            method2713(-35, -108, 34);
        }
        return (arg0 & 0x20000) != 0 | method2711(arg2, (byte) -112, arg0) || method2705(arg2, arg0, (byte) -25);
    }
}
