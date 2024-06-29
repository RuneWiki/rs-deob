import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class133 {

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1039(int arg0, byte arg1, int arg2) {
        if (arg1 > -106) {
            return true;
        } else {
            return (arg0 & 0x10) != 0;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Z")
    public static final boolean method1040(int arg0, int arg1, int arg2) {
        if (arg1 == -25329) {
            return (arg2 & 0x38000) != 0 | method1048(arg2, arg0, arg1 + 25329) || method1043(arg2, arg0, 40);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(III)Z")
    public static final boolean method1041(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return (arg1 & 0x22) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1042(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1053((byte) -57, -2, 0);
        }
        return (arg1 & 0x400) != 0 | method1044(-112, arg0, arg1) || method1064((byte) -94, arg0, arg1);
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(III)Z")
    public static final boolean method1043(int arg0, int arg1, int arg2) {
        return arg2 < 35 ? false : (method1048(arg0, arg1, 0) | method1041(0, arg0, arg1) | method1058(arg1, arg0, 0)) & method1059(false, arg1, arg0);
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(III)Z")
    public static final boolean method1044(int arg0, int arg1, int arg2) {
        if (arg0 > -109) {
            return false;
        } else {
            return (arg2 & 0x4000) != 0;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZII)Z")
    private static final boolean method1045(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1065(-117, -36, 24);
        }
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "(III)Z")
    public static final boolean method1046(int arg0, int arg1, int arg2) {
        if (arg2 > -34) {
            return true;
        } else {
            return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
        }
    }

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "(III)Z")
    public static final boolean method1047(int arg0, int arg1, int arg2) {
        if (arg0 != 229376) {
            method1068(125, 113, 85);
        }
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "(III)Z")
    public static final boolean method1048(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method1051(-74, -49, (byte) -48);
        }
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(ZII)Z")
    public static final boolean method1049(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1062(-108, -23, 99);
        }
        return method1039(arg1, (byte) -110, arg2) & method1068(116, arg1, arg2);
    }

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "(III)Z")
    public static final boolean method1050(int arg0, int arg1, int arg2) {
        int var3 = 91 / ((arg1 - 50) / 47);
        if (((arg2 & 0x8000) != 0 | method1065(0, arg2, arg0)) || method1063(arg2, true, arg0)) {
            return true;
        } else {
            return (arg0 & 0x37) == 0 && method1064((byte) -77, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1051(int arg0, int arg1, byte arg2) {
        if (arg2 < 92) {
            return false;
        } else {
            return (arg1 & 0x30000) != 0 | method1039(arg1, (byte) -107, arg0) || method1064((byte) -128, arg0, arg1) || method1049(true, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "(III)Z")
    public static final boolean method1052(int arg0, int arg1, int arg2) {
        if (arg0 == 1024) {
            return (arg1 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)Z")
    public static final boolean method1053(byte arg0, int arg1, int arg2) {
        if (arg0 < 80) {
            return true;
        } else {
            return (arg1 & 0x38000) != 0 | method1041(0, arg1, arg2) || method1043(arg1, arg2, 97);
        }
    }

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "(III)Z")
    public static final boolean method1054(int arg0, int arg1, int arg2) {
        if (arg2 == 25992) {
            return (arg0 & 0x2080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(ZII)Z")
    public static final boolean method1055(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return (arg1 & 0x38000) != 0 | method1058(arg2, arg1, 0) || method1043(arg1, arg2, 120);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1056(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return false;
        } else {
            return (arg0 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "(III)Z")
    public static final boolean method1057(int arg0, int arg1, int arg2) {
        if (arg2 != 32273) {
            method1058(38, -84, -53);
        }
        return method1069(arg1, -101, arg0) || method1062(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "(III)Z")
    public static final boolean method1058(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            return (arg1 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(ZII)Z")
    public static final boolean method1059(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return true;
        } else {
            return (arg2 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(IIZ)Z")
    public static final boolean method1060(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return true;
        } else {
            return (arg1 & 0x100) != 0;
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(IBI)Z")
    public static final boolean method1061(int arg0, byte arg1, int arg2) {
        int var3 = -61 / ((arg1 - 19) / 38);
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "(III)Z")
    public static final boolean method1062(int arg0, int arg1, int arg2) {
        return arg2 == 0 ? method1069(arg1, -91, arg0) & method1052(arg2 + 1024, arg1, arg0) : false;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(IZI)Z")
    public static final boolean method1063(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1062(118, -105, 47);
        }
        return ((arg0 & 0x1000) != 0 | method1065(0, arg0, arg2) | method1045(true, arg2, arg0)) & method1046(arg0, arg2, -110);
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(BII)Z")
    public static final boolean method1064(byte arg0, int arg1, int arg2) {
        if (arg0 >= -53) {
            return false;
        } else if (method1061(arg2, (byte) -69, arg1)) {
            return ((arg2 & 0x5800) != 0 | method1054(arg2, arg1, 25992) | method1060(arg1, arg2, false)) ? true : (arg1 & 0x37) == 0 & (method1065(0, arg2, arg1) | method1045(true, arg1, arg2));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "(III)Z")
    public static final boolean method1065(int arg0, int arg1, int arg2) {
        return arg0 == 0 ? (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0 : false;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(IIB)Z")
    public static final boolean method1066(int arg0, int arg1, byte arg2) {
        if (arg2 < 101) {
            return false;
        } else {
            return method1054(arg0, arg1, 25992) || method1064((byte) -102, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "(III)Z")
    public static final boolean method1067(int arg0, int arg1, int arg2) {
        if (arg1 != 7903) {
            method1051(44, 51, (byte) 106);
        }
        return method1060(arg0, arg2, false) | (arg2 & 0x20000) != 0 || method1064((byte) -126, arg0, arg2);
    }

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "(III)Z")
    public static final boolean method1068(int arg0, int arg1, int arg2) {
        if (arg0 <= 115) {
            return false;
        } else {
            return (arg1 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "(III)Z")
    public static final boolean method1069(int arg0, int arg1, int arg2) {
        return arg1 > -68 ? false : false;
    }
}
