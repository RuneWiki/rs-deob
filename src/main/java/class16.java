import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class16 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method142(int arg0, int arg1, int arg2) {
        int var3 = -101 % ((arg2 - 39) / 57);
        return (arg1 & 0x2080) != 0;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)Z", line = 13)
    public static final boolean method143(int arg0, int arg1, int arg2) {
        return arg1 == 8426 ? method155(110, arg2, arg0) & method166(arg1 - 8551, arg2, arg0) : false;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BII)Z", line = 23)
    public static final boolean method144(byte arg0, int arg1, int arg2) {
        if (arg0 == 12) {
            return method172(104, arg2, arg1) | (arg2 & 0x20000) != 0 || method148(arg2, 82, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(III)Z", line = 33)
    private static final boolean method145(int arg0, int arg1, int arg2) {
        if (arg0 <= 18) {
            method153(91, -8, 2);
        }
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBI)Z", line = 43)
    public static final boolean method146(int arg0, byte arg1, int arg2) {
        if (arg1 <= 20) {
            return true;
        } else {
            return (arg0 & 0x4000) != 0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(III)Z", line = 53)
    public static final boolean method147(int arg0, int arg1, int arg2) {
        if (arg1 != 1024) {
            method166(118, 41, -116);
        }
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(III)Z", line = 63)
    public static final boolean method148(int arg0, int arg1, int arg2) {
        if (arg1 < 30) {
            return true;
        } else if (method165(arg0, 0, arg2)) {
            return (method142(arg2, arg0, -65) | (arg0 & 0x5800) != 0 | method172(-75, arg0, arg2)) ? true : (method147(arg0, 1024, arg2) | method145(51, arg2, arg0)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(III)Z", line = 80)
    public static final boolean method149(int arg0, int arg1, int arg2) {
        if (arg2 == -10681) {
            return (arg1 & 0x21) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "(III)Z", line = 90)
    public static final boolean method150(int arg0, int arg1, int arg2) {
        if (arg0 != 52) {
            method165(8, -32, 32);
        }
        return (method149(arg1, arg2, arg0 - 10733) | method160(arg1, (byte) 7, arg2) | method169(arg1, arg2, -3932)) & method152(arg1, arg2, (byte) 85);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(IBI)Z", line = 100)
    public static final boolean method151(int arg0, byte arg1, int arg2) {
        if (arg1 < 104) {
            return true;
        } else {
            return method155(127, arg2, arg0) | (arg0 & 0x30000) != 0 || method148(arg0, 47, arg2) || method143(arg0, 8426, arg2);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIB)Z", line = 110)
    public static final boolean method152(int arg0, int arg1, byte arg2) {
        if (arg2 < 6) {
            return true;
        } else {
            return (arg1 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "(III)Z", line = 120)
    public static final boolean method153(int arg0, int arg1, int arg2) {
        return arg1 == 52 ? false : false;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(BII)Z", line = 130)
    public static final boolean method154(byte arg0, int arg1, int arg2) {
        if (arg0 >= -22) {
            return false;
        } else {
            return (arg1 & 0x400) != 0 && (arg2 & 0x37) != 0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "(III)Z", line = 141)
    public static final boolean method155(int arg0, int arg1, int arg2) {
        int var3 = 123 / ((-arg0 - 17) / 62);
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "(III)Z", line = 149)
    public static final boolean method156(int arg0, int arg1, int arg2) {
        if (arg0 == 55) {
            return (arg2 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "(III)Z", line = 159)
    public static final boolean method157(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            return (arg1 & 0x38000) != 0 | method149(arg0, arg1, -10681) || method150(52, arg0, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZI)Z", line = 169)
    public static final boolean method158(int arg0, boolean arg1, int arg2) {
        return arg1 ? false : ((arg0 & 0x1000) != 0 | method147(arg0, 1024, arg2) | method145(28, arg2, arg0)) & method154((byte) -112, arg0, arg2);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(IIB)Z", line = 179)
    public static final boolean method159(int arg0, int arg1, byte arg2) {
        if (arg2 != 50) {
            method151(-36, (byte) 64, 121);
        }
        return (arg1 & 0x38000) != 0 | method160(arg0, (byte) 7, arg1) || method150(52, arg0, arg1);
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(IBI)Z", line = 189)
    public static final boolean method160(int arg0, byte arg1, int arg2) {
        if (arg1 == 7) {
            return (arg2 & 0x22) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "(III)Z", line = 199)
    public static final boolean method161(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            return (arg2 & 0x20) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "(III)Z", line = 209)
    public static final boolean method162(int arg0, int arg1, int arg2) {
        if (arg1 != 26924) {
            method144((byte) -67, 43, 108);
        }
        return method153(arg0, 52, arg2) & method168(1024, arg2, arg0);
    }

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "(III)Z", line = 219)
    public static final boolean method163(int arg0, int arg1, int arg2) {
        if (arg2 == 229376) {
            return method169(arg1, arg0, -3932) | (arg0 & 0x38000) != 0 || method150(52, arg1, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(BII)Z", line = 230)
    public static final boolean method164(byte arg0, int arg1, int arg2) {
        int var3 = 77 / ((-arg0 - 39) / 52);
        return method153(arg1, 52, arg2) || method162(arg1, 26924, arg2);
    }

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "(III)Z", line = 238)
    public static final boolean method165(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            return (arg0 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "(III)Z", line = 248)
    public static final boolean method166(int arg0, int arg1, int arg2) {
        if (arg0 > -95) {
            return false;
        } else {
            return (arg2 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(BII)Z", line = 258)
    public static final boolean method167(byte arg0, int arg1, int arg2) {
        if (arg0 > -12) {
            method160(-1, (byte) 107, -69);
        }
        return (arg2 & 0x400) != 0 | method146(arg2, (byte) 99, arg1) || method148(arg2, 120, arg1);
    }

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "(III)Z", line = 270)
    public static final boolean method168(int arg0, int arg1, int arg2) {
        if (arg0 != 1024) {
            method170(111, true, -59);
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "(III)Z", line = 280)
    public static final boolean method169(int arg0, int arg1, int arg2) {
        if (arg2 == -3932) {
            return (arg1 & 0x34) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(IZI)Z", line = 290)
    public static final boolean method170(int arg0, boolean arg1, int arg2) {
        if ((method147(arg0, 1024, arg2) | (arg0 & 0x8000) != 0) || method158(arg0, false, arg2)) {
            return true;
        } else {
            if (arg1) {
                method146(-115, (byte) -53, 38);
            }
            return (arg2 & 0x37) == 0 && method148(arg0, 94, arg2);
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(IIB)Z", line = 304)
    public static final boolean method171(int arg0, int arg1, byte arg2) {
        int var3 = -86 % ((58 - arg2) / 45);
        return method142(arg0, arg1, -127) || method148(arg1, 56, arg0);
    }

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "(III)Z", line = 313)
    public static final boolean method172(int arg0, int arg1, int arg2) {
        int var3 = 85 % ((-arg0) / 62);
        return (arg1 & 0x100) != 0;
    }
}
