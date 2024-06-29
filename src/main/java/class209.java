import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class209 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1225(int arg0, int arg1, int arg2) {
        if (arg1 > -69) {
            return true;
        } else {
            return (arg0 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)Z", line = 14)
    public static final boolean method1226(int arg0, byte arg1, int arg2) {
        if (arg1 == 62) {
            return method1237(arg2, arg1 ^ 0x2535, arg0) | (arg2 & 0x20000) != 0 || method1229(arg0, arg2, 27);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)Z", line = 24)
    public static final boolean method1227(int arg0, int arg1, int arg2) {
        if (arg1 == 8320) {
            return method1235(arg2, arg0, 74) || method1229(arg2, arg0, arg1 - 8193);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(III)Z", line = 34)
    public static final boolean method1228(int arg0, int arg1, int arg2) {
        if ((method1234(544, arg0, arg2) | ~(arg0 & 0x8000) != arg1) || method1244(-1, arg0, arg2)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && method1229(arg2, arg0, -118);
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(III)Z", line = 45)
    public static final boolean method1229(int arg0, int arg1, int arg2) {
        if (!method1233(arg0, (byte) -84, arg1)) {
            return false;
        } else if ((arg1 & 0x5800) != 0 | method1235(arg0, arg1, 28) | method1237(arg1, 9483, arg0)) {
            return true;
        } else {
            int var3 = 51 % ((arg2 - 78) / 41);
            return (arg0 & 0x37) == 0 & (method1234(544, arg1, arg0) | method1232(32768, arg0, arg1));
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)Z", line = 60)
    public static final boolean method1230(int arg0, int arg1, byte arg2) {
        if (arg2 != 39) {
            method1225(-85, -101, -28);
        }
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(III)Z", line = 70)
    public static final boolean method1231(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            return (arg0 & 0x30000) != 0 | method1248(arg2, arg0, arg1 + 49) || method1229(arg2, arg0, arg1 + 127) || method1240(arg2, arg0, 6471);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(III)Z", line = 80)
    private static final boolean method1232(int arg0, int arg1, int arg2) {
        if (arg0 == 32768) {
            return (arg2 & 0x8000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IBI)Z", line = 90)
    public static final boolean method1233(int arg0, byte arg1, int arg2) {
        if (arg1 == -84) {
            return (arg2 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(III)Z", line = 100)
    public static final boolean method1234(int arg0, int arg1, int arg2) {
        if (arg0 != 544) {
            method1250(-7, 15, (byte) 21);
        }
        return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "(III)Z", line = 111)
    public static final boolean method1235(int arg0, int arg1, int arg2) {
        int var3 = -97 % ((arg2 + 17) / 39);
        return (arg1 & 0x2080) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "(III)Z", line = 119)
    public static final boolean method1236(int arg0, int arg1, int arg2) {
        if (arg1 >= -52) {
            method1238(-23, 51, -90);
        }
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "(III)Z", line = 129)
    public static final boolean method1237(int arg0, int arg1, int arg2) {
        if (arg1 != 9483) {
            method1249(25, -36, (byte) -91);
        }
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "(III)Z", line = 139)
    public static final boolean method1238(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method1232(-36, -99, -15);
        }
        return (arg2 & 0x400) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "(III)Z", line = 149)
    public static final boolean method1239(int arg0, int arg1, int arg2) {
        if (arg2 < 46) {
            return true;
        } else {
            return (arg1 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "(III)Z", line = 159)
    public static final boolean method1240(int arg0, int arg1, int arg2) {
        return arg2 == 6471 ? method1248(arg0, arg1, arg2 ^ 0x1946) & method1241((byte) -2, arg0, arg1) : false;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)Z", line = 169)
    public static final boolean method1241(byte arg0, int arg1, int arg2) {
        if (arg0 == -2) {
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(IBI)Z", line = 179)
    public static final boolean method1242(int arg0, byte arg1, int arg2) {
        if (arg1 == 78) {
            return (arg2 & 0x400) != 0 | method1246(arg0, true, arg2) || method1229(arg0, arg2, 22);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(BII)Z", line = 189)
    public static final boolean method1243(byte arg0, int arg1, int arg2) {
        if (arg0 == 86) {
            return (arg1 & 0x38000) != 0 | method1230(arg2, arg1, (byte) 39) || method1253(arg2, arg1, arg0 + 8234);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "(III)Z", line = 199)
    public static final boolean method1244(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            method1243((byte) -99, 101, 86);
        }
        return (method1234(544, arg1, arg2) | (arg1 & 0x1000) != 0 | method1232(arg0 ^ 0xFFFF7FFF, arg2, arg1)) & method1238(arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIB)Z", line = 210)
    public static final boolean method1245(int arg0, int arg1, byte arg2) {
        int var3 = -116 % ((arg2 + 36) / 32);
        return method1254(arg0, 50, arg1) & method1249(arg1, arg0, (byte) 77);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZI)Z", line = 218)
    public static final boolean method1246(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1240(19, 47, -64);
        }
        return (arg2 & 0x4000) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "(III)Z", line = 228)
    public static final boolean method1247(int arg0, int arg1, int arg2) {
        if (arg2 == 229376) {
            return method1255(-48, arg0, arg1) | (arg0 & 0x38000) != 0 || method1253(arg1, arg0, 8320);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "(III)Z", line = 239)
    public static final boolean method1248(int arg0, int arg1, int arg2) {
        int var3 = 58 / ((-arg2 - 69) / 49);
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(IIB)Z", line = 247)
    public static final boolean method1249(int arg0, int arg1, byte arg2) {
        if (arg2 == 77) {
            return (arg0 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(IIB)Z", line = 257)
    public static final boolean method1250(int arg0, int arg1, byte arg2) {
        if (arg2 < 46) {
            method1252((byte) -45, -119, 1);
        }
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IZI)Z", line = 267)
    public static final boolean method1251(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1238(-105, -103, -73);
        }
        return (arg2 & 0x38000) != 0 | method1239(arg0, arg2, 118) || method1253(arg0, arg2, 8320);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(BII)Z", line = 277)
    public static final boolean method1252(byte arg0, int arg1, int arg2) {
        if (arg0 > -61) {
            return false;
        } else {
            return method1254(arg2, 39, arg1) || method1245(arg2, arg1, (byte) 85);
        }
    }

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "(III)Z", line = 287)
    public static final boolean method1253(int arg0, int arg1, int arg2) {
        return arg2 == 8320 ? (method1239(arg0, arg1, 89) | method1230(arg0, arg1, (byte) 39) | method1255(-31, arg1, arg0)) & method1225(arg1, -72, arg0) : false;
    }

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "(III)Z", line = 299)
    public static final boolean method1254(int arg0, int arg1, int arg2) {
        return arg1 < 30;
    }

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "(III)Z", line = 309)
    public static final boolean method1255(int arg0, int arg1, int arg2) {
        if (arg0 >= -27) {
            return false;
        } else {
            return (arg1 & 0x34) != 0;
        }
    }
}
