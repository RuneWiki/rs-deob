import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class454 {

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIB)Z", line = 4)
    public static final boolean method2656(int arg0, int arg1, byte arg2) {
        if (arg2 == 59) {
            return (arg1 & 0x400) != 0 | method2657(arg0, arg1, (byte) -121) || method2677(arg0, arg1, (byte) -114);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(IIB)Z", line = 14)
    public static final boolean method2657(int arg0, int arg1, byte arg2) {
        if (arg2 > -23) {
            return true;
        } else {
            return (arg1 & 0x4000) != 0;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)Z", line = 24)
    public static final boolean method2658(int arg0, int arg1, int arg2) {
        if (arg0 != 384) {
            method2672(58, -33, -44);
        }
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BII)Z", line = 34)
    public static final boolean method2659(byte arg0, int arg1, int arg2) {
        if (arg0 <= 26) {
            return false;
        } else {
            return (arg1 & 0x22) != 0;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(BII)Z", line = 44)
    public static final boolean method2660(byte arg0, int arg1, int arg2) {
        if (arg0 != 89) {
            method2684(73, -93, 61);
        }
        return method2664((byte) -85, arg1, arg2) | (arg2 & 0x38000) != 0 || method2665(arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBI)Z", line = 54)
    public static final boolean method2661(int arg0, byte arg1, int arg2) {
        if (arg1 != 42) {
            method2671(-96, false, -63);
        }
        return method2683(-1, arg2, arg0) || method2676(arg0, arg2, arg1 - 43);
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(III)Z", line = 65)
    public static final boolean method2662(int arg0, int arg1, int arg2) {
        int var3 = -20 % ((arg1 + 31) / 54);
        return (arg2 & 0x2080) != 0;
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(III)Z", line = 73)
    public static final boolean method2663(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2680(48, 99, -67);
        }
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(BII)Z", line = 83)
    public static final boolean method2664(byte arg0, int arg1, int arg2) {
        if (arg0 == -85) {
            return (arg2 & 0x34) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(III)Z", line = 93)
    public static final boolean method2665(int arg0, int arg1, int arg2) {
        return arg2 == 0 ? (method2678(arg0, arg1, true) | method2659((byte) 76, arg0, arg1) | method2664((byte) -85, arg1, arg0)) & method2666(arg1, arg0, ~arg2) : false;
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(III)Z", line = 103)
    public static final boolean method2666(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            return (arg1 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(IIB)Z", line = 113)
    public static final boolean method2667(int arg0, int arg1, byte arg2) {
        return arg2 < 84 ? true : (method2673(arg1, (byte) 118, arg0) | (arg0 & 0x1000) != 0 | method2675(arg1, (byte) 12, arg0)) & method2674(arg1, -107, arg0);
    }

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(III)Z", line = 123)
    public static final boolean method2668(int arg0, int arg1, int arg2) {
        if (arg2 < 72) {
            method2664((byte) -118, -6, 25);
        }
        return method2663(arg0, arg1, 0) & method2679(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(BII)Z", line = 134)
    public static final boolean method2669(byte arg0, int arg1, int arg2) {
        int var3 = 0 % ((37 - arg0) / 45);
        return (arg1 & 0x38000) != 0 | method2659((byte) 116, arg1, arg2) || method2665(arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(III)Z", line = 142)
    public static final boolean method2670(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return (arg2 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZI)Z", line = 152)
    public static final boolean method2671(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return false;
        } else {
            return (arg0 & 0x38000) != 0 | method2678(arg0, arg2, true) || method2665(arg0, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "(III)Z", line = 162)
    public static final boolean method2672(int arg0, int arg1, int arg2) {
        if (arg0 > -18) {
            return false;
        } else {
            return (arg2 & 0x100) != 0;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(IBI)Z", line = 172)
    public static final boolean method2673(int arg0, byte arg1, int arg2) {
        if (arg1 <= 69) {
            method2681((byte) 8, 9, 35);
        }
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "(III)Z", line = 183)
    public static final boolean method2674(int arg0, int arg1, int arg2) {
        int var3 = 99 / ((arg1 + 22) / 62);
        return (arg2 & 0x400) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(IBI)Z", line = 191)
    private static final boolean method2675(int arg0, byte arg1, int arg2) {
        if (arg1 == 12) {
            return (arg2 & 0x8000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "(III)Z", line = 201)
    public static final boolean method2676(int arg0, int arg1, int arg2) {
        return arg2 == -1 ? method2683(-1, arg1, arg0) & method2670(0, arg1, arg0) : false;
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(IIB)Z", line = 211)
    public static final boolean method2677(int arg0, int arg1, byte arg2) {
        if (!method2685(arg1, arg0, -85)) {
            return false;
        } else if (method2662(arg0, -128, arg1) | (arg1 & 0x5800) != 0 | method2672(-118, arg0, arg1)) {
            return true;
        } else if (arg2 >= -76) {
            return false;
        } else {
            return (method2673(arg0, (byte) 88, arg1) | method2675(arg0, (byte) 12, arg1)) & (arg0 & 0x37) == 0;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZ)Z", line = 227)
    public static final boolean method2678(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2658(-123, 107, -49);
        }
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "(III)Z", line = 237)
    public static final boolean method2679(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "(III)Z", line = 249)
    public static final boolean method2680(int arg0, int arg1, int arg2) {
        if (arg2 == 131072) {
            return (arg1 & 0x30000) != 0 | method2663(arg0, arg1, 0) || method2677(arg0, arg1, (byte) -126) || method2668(arg0, arg1, 86);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(BII)Z", line = 260)
    public static final boolean method2681(byte arg0, int arg1, int arg2) {
        int var3 = -109 % ((arg0 - 1) / 40);
        return method2662(arg1, 62, arg2) || method2677(arg1, arg2, (byte) -95);
    }

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(BII)Z", line = 268)
    public static final boolean method2682(byte arg0, int arg1, int arg2) {
        if (((arg2 & 0x8000) != 0 | method2673(arg1, (byte) 80, arg2)) || method2667(arg2, arg1, (byte) 121)) {
            return true;
        } else {
            int var3 = 62 % ((-arg0 - 22) / 43);
            return (arg1 & 0x37) == 0 && method2677(arg1, arg2, (byte) -98);
        }
    }

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "(III)Z", line = 280)
    public static final boolean method2683(int arg0, int arg1, int arg2) {
        return arg0 == -1 ? false : false;
    }

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "(III)Z", line = 290)
    public static final boolean method2684(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            return (arg0 & 0x20000) != 0 | method2672(-124, arg1, arg0) || method2677(arg1, arg0, (byte) -92);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "(III)Z", line = 300)
    public static final boolean method2685(int arg0, int arg1, int arg2) {
        if (arg2 >= -69) {
            return false;
        } else {
            return (arg0 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "(III)Z", line = 310)
    public static final boolean method2686(int arg0, int arg1, int arg2) {
        if (arg0 == 261) {
            return (arg1 & 0x20) != 0;
        } else {
            return true;
        }
    }
}
