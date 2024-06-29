import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class117 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB)Z", line = 4)
    private static final boolean method768(int arg0, int arg1, byte arg2) {
        if (arg2 == -72) {
            return (arg1 & 0x8000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)Z", line = 14)
    public static final boolean method769(byte arg0, int arg1, int arg2) {
        if (arg0 == 72) {
            return (arg1 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZI)Z", line = 24)
    public static final boolean method770(int arg0, boolean arg1, int arg2) {
        return arg1 ? method786(arg0, arg2, 86) & method796(arg2, arg0, 16) : true;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method771(int arg0, int arg1, int arg2) {
        if (arg2 == 8320) {
            return (arg1 & 0x2080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(BII)Z", line = 44)
    public static final boolean method772(byte arg0, int arg1, int arg2) {
        if (arg0 != 12) {
            method788(-109, -108, (byte) 113);
        }
        return method775(arg2, arg1, (byte) -120) & method785(arg1, arg2, (byte) 28);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)Z", line = 55)
    public static final boolean method773(int arg0, int arg1, int arg2) {
        int var3 = -112 / ((arg2 - 7) / 52);
        return (method778((byte) 127, arg0, arg1) | method791(arg1, arg0, (byte) 5) | method794(arg1, true, arg0)) & method769((byte) 72, arg0, arg1);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(BII)Z", line = 63)
    public static final boolean method774(byte arg0, int arg1, int arg2) {
        if (!method790(arg1, -1, arg2)) {
            return false;
        } else if (method771(arg2, arg1, 8320) | (arg1 & 0x5800) != 0 | method792(arg1, 125, arg2)) {
            return true;
        } else if (arg0 == 111) {
            return (method788(arg1, arg2, (byte) -41) | method768(arg2, arg1, (byte) -72)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IIB)Z", line = 81)
    public static final boolean method775(int arg0, int arg1, byte arg2) {
        int var3 = 48 / ((-arg2 - 16) / 57);
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)Z", line = 89)
    public static final boolean method776(int arg0, int arg1, int arg2) {
        if (arg0 > -120) {
            return false;
        } else if ((method788(arg1, arg2, (byte) -41) | (arg1 & 0x8000) != 0) || method793(arg1, -127, arg2)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && method774((byte) 111, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(III)Z", line = 103)
    public static final boolean method777(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method788(-125, -109, (byte) -96);
        }
        return method786(arg1, arg0, 81) || method770(arg1, true, arg0);
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(BII)Z", line = 114)
    public static final boolean method778(byte arg0, int arg1, int arg2) {
        int var3 = -27 % ((arg0 - 70) / 56);
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(III)Z", line = 122)
    public static final boolean method779(int arg0, int arg1, int arg2) {
        if (arg2 != -30371) {
            method798(16, 86, 12);
        }
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(III)Z", line = 132)
    public static final boolean method780(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            return method778((byte) 127, arg2, arg1) | (arg2 & 0x38000) != 0 || method773(arg2, arg1, arg0 ^ 0xFFFFFF8A);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "(III)Z", line = 142)
    public static final boolean method781(int arg0, int arg1, int arg2) {
        if (arg0 == 18919) {
            return (arg1 & 0x20000) != 0 | method792(arg1, arg0 - 18819, arg2) || method774((byte) 111, arg1, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZ)Z", line = 152)
    public static final boolean method782(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return false;
        } else {
            return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)Z", line = 162)
    public static final boolean method783(int arg0, byte arg1, int arg2) {
        if (arg1 < 49) {
            return true;
        } else {
            return method771(arg2, arg0, 8320) || method774((byte) 111, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(BII)Z", line = 173)
    public static final boolean method784(byte arg0, int arg1, int arg2) {
        int var3 = 112 / ((30 - arg0) / 63);
        return method794(arg2, true, arg1) | (arg1 & 0x38000) != 0 || method773(arg1, arg2, -118);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(IIB)Z", line = 182)
    public static final boolean method785(int arg0, int arg1, byte arg2) {
        int var3 = 110 % ((arg2 + 51) / 52);
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "(III)Z", line = 190)
    public static final boolean method786(int arg0, int arg1, int arg2) {
        return arg2 < 22 ? false : false;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IBI)Z", line = 200)
    public static final boolean method787(int arg0, byte arg1, int arg2) {
        if (arg1 <= 122) {
            method780(12, -4, 113);
        }
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(IIB)Z", line = 210)
    public static final boolean method788(int arg0, int arg1, byte arg2) {
        return arg2 == -41 ? (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0 : true;
    }

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "(III)Z", line = 220)
    public static final boolean method789(int arg0, int arg1, int arg2) {
        if (arg0 != -24796) {
            method786(-28, 112, 94);
        }
        return method797(arg2, false, arg1) | (arg1 & 0x400) != 0 || method774((byte) 111, arg1, arg2);
    }

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "(III)Z", line = 232)
    public static final boolean method790(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            return (arg0 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(IIB)Z", line = 242)
    public static final boolean method791(int arg0, int arg1, byte arg2) {
        if (arg2 != 5) {
            method781(106, -66, -8);
        }
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "(III)Z", line = 252)
    public static final boolean method792(int arg0, int arg1, int arg2) {
        if (arg1 <= 96) {
            return false;
        } else {
            return (arg0 & 0x100) != 0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "(III)Z", line = 262)
    public static final boolean method793(int arg0, int arg1, int arg2) {
        return arg1 >= -110 ? false : (method788(arg0, arg2, (byte) -41) | (arg0 & 0x1000) != 0 | method768(arg2, arg0, (byte) -72)) & method782(arg2, arg0, false);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IZI)Z", line = 272)
    public static final boolean method794(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (arg2 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(IIB)Z", line = 282)
    public static final boolean method795(int arg0, int arg1, byte arg2) {
        if (arg2 <= 46) {
            return true;
        } else {
            return method791(arg1, arg0, (byte) 5) | (arg0 & 0x38000) != 0 || method773(arg0, arg1, 99);
        }
    }

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "(III)Z", line = 292)
    public static final boolean method796(int arg0, int arg1, int arg2) {
        if (arg2 == 16) {
            return (arg0 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(IZI)Z", line = 302)
    public static final boolean method797(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return true;
        } else {
            return (arg2 & 0x4000) != 0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "(III)Z", line = 312)
    public static final boolean method798(int arg0, int arg1, int arg2) {
        if (arg2 >= -1) {
            method796(-105, 124, -5);
        }
        return (arg0 & 0x30000) != 0 | method775(arg1, arg0, (byte) 48) || method774((byte) 111, arg0, arg1) || method772((byte) 12, arg0, arg1);
    }
}
