import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class368 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)Z", line = 4)
    public static final boolean method2246(int arg0, byte arg1, int arg2) {
        if (arg1 < 102) {
            method2251(-93, -87, -121);
        }
        return (arg0 & 0x400) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)Z", line = 14)
    public static final boolean method2247(int arg0, int arg1, int arg2) {
        if (arg0 == 229376) {
            return (arg1 & 0x38000) != 0 | method2256((byte) 94, arg2, arg1) || method2259(arg2, false, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)Z", line = 24)
    private static final boolean method2248(int arg0, int arg1, int arg2) {
        if (arg1 == 32768) {
            return (arg2 & 0x8000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BII)Z", line = 34)
    public static final boolean method2249(byte arg0, int arg1, int arg2) {
        if (arg0 >= -73) {
            return false;
        } else {
            return (arg2 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(BII)Z", line = 44)
    public static final boolean method2250(byte arg0, int arg1, int arg2) {
        if (arg0 <= 97) {
            return true;
        } else {
            return (arg1 & 0x400) != 0 | method2251(3246, arg2, arg1) || method2266(arg1, arg2, -1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(III)Z", line = 54)
    public static final boolean method2251(int arg0, int arg1, int arg2) {
        if (arg0 != 3246) {
            method2257(-72, -126, (byte) -10);
        }
        return (arg2 & 0x4000) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZ)Z", line = 64)
    public static final boolean method2252(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return true;
        } else {
            return method2274(arg1, arg0, arg2) || method2268((byte) -116, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(III)Z", line = 75)
    public static final boolean method2253(int arg0, int arg1, int arg2) {
        int var3 = -61 % ((arg1 + 42) / 62);
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(III)Z", line = 83)
    public static final boolean method2254(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method2255(-118, -16, 26);
        }
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(III)Z", line = 93)
    public static final boolean method2255(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            return method2271(arg1, arg2 ^ 0x100, arg0) | (arg1 & 0x20000) != 0 || method2266(arg1, arg0, -1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(BII)Z", line = 103)
    public static final boolean method2256(byte arg0, int arg1, int arg2) {
        if (arg0 == 94) {
            return (arg2 & 0x21) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)Z", line = 113)
    public static final boolean method2257(int arg0, int arg1, byte arg2) {
        if (arg2 < 7) {
            method2273(14, false, 12);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIB)Z", line = 123)
    public static final boolean method2258(int arg0, int arg1, byte arg2) {
        if (arg2 != -54) {
            method2262(94, -109, 97);
        }
        return method2273(arg0, false, arg1) | (arg0 & 0x38000) != 0 || method2259(arg1, false, arg0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZI)Z", line = 133)
    public static final boolean method2259(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method2268((byte) 58, 92, -58);
        }
        return (method2256((byte) 94, arg0, arg2) | method2273(arg2, arg1, arg0) | method2267(arg0, arg2, (byte) 101)) & method2254(0, arg2, arg0);
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(III)Z", line = 144)
    public static final boolean method2260(int arg0, int arg1, int arg2) {
        int var3 = -40 / ((-arg2 - 91) / 34);
        return (method2276(false, arg1, arg0) | (arg0 & 0x1000) != 0 | method2248(arg1, 32768, arg0)) & method2246(arg0, (byte) 116, arg1);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(IIB)Z", line = 152)
    public static final boolean method2261(int arg0, int arg1, byte arg2) {
        if (arg2 != -114) {
            method2257(-78, 107, (byte) 28);
        }
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "(III)Z", line = 162)
    public static final boolean method2262(int arg0, int arg1, int arg2) {
        if (arg2 <= 81) {
            return true;
        } else {
            return (arg1 & 0x2080) != 0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIZ)Z", line = 172)
    public static final boolean method2263(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return false;
        } else {
            return (arg1 & 0x38000) != 0 | method2267(arg0, arg1, (byte) 111) || method2259(arg0, false, arg1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "(III)Z", line = 182)
    public static final boolean method2264(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            return (arg1 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IBI)Z", line = 192)
    public static final boolean method2265(int arg0, byte arg1, int arg2) {
        if (arg1 < 81) {
            return false;
        } else {
            return (arg2 & 0x30000) != 0 | method2253(arg2, -128, arg0) || method2266(arg2, arg0, -1) || method2269(arg0, arg2, 24);
        }
    }

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "(III)Z", line = 204)
    public static final boolean method2266(int arg0, int arg1, int arg2) {
        if (method2257(arg0, arg1, (byte) 8)) {
            return (method2262(arg1, arg0, 88) | ~(arg0 & 0x5800) != arg2 | method2271(arg0, 256, arg1)) ? true : (arg1 & 0x37) == 0 & (method2276(false, arg1, arg0) | method2248(arg1, 32768, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(IIB)Z", line = 219)
    public static final boolean method2267(int arg0, int arg1, byte arg2) {
        int var3 = 41 / ((55 - arg2) / 32);
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(BII)Z", line = 227)
    public static final boolean method2268(byte arg0, int arg1, int arg2) {
        return arg0 > -57 ? false : method2274(arg2, arg1, false) & method2270(arg2, arg1, (byte) 34);
    }

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "(III)Z", line = 237)
    public static final boolean method2269(int arg0, int arg1, int arg2) {
        return arg2 == 24 ? method2253(arg1, 108, arg0) & method2264(arg2 - 25, arg1, arg0) : false;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(IIB)Z", line = 248)
    public static final boolean method2270(int arg0, int arg1, byte arg2) {
        int var3 = -44 / ((-arg2 - 60) / 60);
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "(III)Z", line = 256)
    public static final boolean method2271(int arg0, int arg1, int arg2) {
        if (arg1 != 256) {
            method2262(111, -12, -58);
        }
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(IBI)Z", line = 266)
    public static final boolean method2272(int arg0, byte arg1, int arg2) {
        if (arg1 > -4) {
            method2255(58, -75, 102);
        }
        if (((arg2 & 0x8000) != 0 | method2276(false, arg0, arg2)) || method2260(arg2, arg0, -125)) {
            return true;
        } else {
            return (arg0 & 0x37) == 0 && method2266(arg2, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IZI)Z", line = 280)
    public static final boolean method2273(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method2268((byte) -123, 16, -10);
        }
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(IIZ)Z", line = 290)
    public static final boolean method2274(int arg0, int arg1, boolean arg2) {
        return arg2 ? false : false;
    }

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "(III)Z", line = 300)
    public static final boolean method2275(int arg0, int arg1, int arg2) {
        if (arg2 > -89) {
            method2253(-59, 50, 100);
        }
        return method2262(arg1, arg0, 107) || method2266(arg0, arg1, -1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZII)Z", line = 310)
    public static final boolean method2276(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method2246(-44, (byte) -80, -23);
        }
        return (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
    }
}
