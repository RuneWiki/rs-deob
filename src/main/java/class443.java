import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class443 {

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)Z")
    public static final boolean method2718(int arg0, int arg1, int arg2) {
        if (arg2 != 6580) {
            method2743(68, (byte) -35, -32);
        }
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)Z")
    public static final boolean method2719(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method2722(-44, (byte) 92, -21);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2720(int arg0, byte arg1, int arg2) {
        if (arg1 == -49) {
            return method2741(125, arg0, arg2) | (arg0 & 0x38000) != 0 || method2723((byte) -121, arg0, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(III)Z")
    public static final boolean method2721(int arg0, int arg1, int arg2) {
        if (arg0 == 55) {
            return (arg1 & 0x10) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(IBI)Z")
    public static final boolean method2722(int arg0, byte arg1, int arg2) {
        if (arg1 == -120) {
            return (arg0 & 0x400) != 0 && (arg2 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BII)Z")
    public static final boolean method2723(byte arg0, int arg1, int arg2) {
        int var3 = 52 / ((arg0 + 39) / 39);
        return (method2739(arg2, (byte) -128, arg1) | method2724(arg2, (byte) -127, arg1) | method2741(123, arg1, arg2)) & method2719(arg1, arg2, -1);
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(IBI)Z")
    public static final boolean method2724(int arg0, byte arg1, int arg2) {
        if (arg1 != -127) {
            method2738(-49, 1, 95);
        }
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(III)Z")
    public static final boolean method2725(int arg0, int arg1, int arg2) {
        if (((arg1 & 0x8000) != 0 | method2733((byte) -120, arg1, arg0)) || method2737(arg0, 1024, arg1)) {
            return true;
        } else if (arg2 == -1) {
            return (arg0 & 0x37) == 0 && method2747(arg0, -24477, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(III)Z")
    public static final boolean method2726(int arg0, int arg1, int arg2) {
        if (arg0 == 32) {
            return (arg1 & 0x20) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(III)Z")
    public static final boolean method2727(int arg0, int arg1, int arg2) {
        if (arg2 <= 75) {
            return false;
        } else {
            return (arg1 & 0x100) != 0;
        }
    }

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "(III)Z")
    public static final boolean method2728(int arg0, int arg1, int arg2) {
        if (arg1 < 98) {
            return false;
        } else {
            return method2739(arg2, (byte) -128, arg0) | (arg0 & 0x38000) != 0 || method2723((byte) 44, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2729(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return true;
        } else {
            return (arg0 & 0x2080) != 0;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(IIZ)Z")
    public static final boolean method2730(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method2720(98, (byte) 94, 50);
        }
        return method2748(arg0, -24184, arg1) || method2731(-17058, arg0, arg1);
    }

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "(III)Z")
    public static final boolean method2731(int arg0, int arg1, int arg2) {
        return arg0 == -17058 ? method2748(arg1, -24184, arg2) & method2738(arg2, arg0 ^ 0x42A1, arg1) : true;
    }

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "(III)Z")
    public static final boolean method2732(int arg0, int arg1, int arg2) {
        return arg1 < 17 ? true : method2721(55, arg2, arg0) & method2734(arg0, -128, arg2);
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(BII)Z")
    public static final boolean method2733(byte arg0, int arg1, int arg2) {
        int var3 = 34 / ((arg0 + 31) / 33);
        return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "(III)Z")
    public static final boolean method2734(int arg0, int arg1, int arg2) {
        int var3 = 41 / ((arg1 + 65) / 45);
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "(III)Z")
    public static final boolean method2735(int arg0, int arg1, int arg2) {
        if (arg2 == 32768) {
            return (arg1 & 0x30000) != 0 | method2721(arg2 - 32713, arg1, arg0) || method2747(arg0, arg2 - 57245, arg1) || method2732(arg0, 92, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(BII)Z")
    public static final boolean method2736(byte arg0, int arg1, int arg2) {
        int var3 = 51 % ((arg0 - 32) / 55);
        return (arg1 & 0x400) != 0 | method2740(arg2, arg1, 90) || method2747(arg2, -24477, arg1);
    }

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "(III)Z")
    public static final boolean method2737(int arg0, int arg1, int arg2) {
        return arg1 == 1024 ? (method2733((byte) 102, arg2, arg0) | (arg2 & 0x1000) != 0 | method2746((byte) -122, arg2, arg0)) & method2722(arg2, (byte) -120, arg0) : false;
    }

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "(III)Z")
    public static final boolean method2738(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2748(85, 121, -76);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(IBI)Z")
    public static final boolean method2739(int arg0, byte arg1, int arg2) {
        if (arg1 != -128) {
            method2728(-82, 13, -27);
        }
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "(III)Z")
    public static final boolean method2740(int arg0, int arg1, int arg2) {
        int var3 = 65 / ((-arg2) / 50);
        return (arg1 & 0x4000) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "(III)Z")
    public static final boolean method2741(int arg0, int arg1, int arg2) {
        if (arg0 < 122) {
            return true;
        } else {
            return (arg1 & 0x34) != 0;
        }
    }

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "(III)Z")
    public static final boolean method2742(int arg0, int arg1, int arg2) {
        if (arg2 == 1024) {
            return (arg0 & 0x20000) != 0 | method2727(arg1, arg0, 95) || method2747(arg1, -24477, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(IBI)Z")
    public static final boolean method2743(int arg0, byte arg1, int arg2) {
        if (arg1 == 73) {
            return method2729(arg2, arg0, false) || method2747(arg0, -24477, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2744(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method2732(26, 73, -127);
        }
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "(III)Z")
    public static final boolean method2745(int arg0, int arg1, int arg2) {
        int var3 = 115 / ((arg1 + 89) / 37);
        return method2724(arg2, (byte) -127, arg0) | (arg0 & 0x38000) != 0 || method2723((byte) 3, arg0, arg2);
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(BII)Z")
    private static final boolean method2746(byte arg0, int arg1, int arg2) {
        int var3 = -98 / ((arg0 + 17) / 42);
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "(III)Z")
    public static final boolean method2747(int arg0, int arg1, int arg2) {
        if (!method2744(false, arg2, arg0)) {
            return false;
        } else if ((method2729(arg2, arg0, false) | (arg2 & 0x5800) != 0 | method2727(arg0, arg2, 119))) {
            return true;
        } else if (arg1 == -24477) {
            return (method2733((byte) 28, arg2, arg0) | method2746((byte) -122, arg2, arg0)) & (arg0 & 0x37) == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "(III)Z")
    public static final boolean method2748(int arg0, int arg1, int arg2) {
        if (arg1 != -24184) {
            method2736((byte) -26, -83, 55);
        }
        return false;
    }
}
