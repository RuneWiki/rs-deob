import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class83 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Z")
    public static final boolean method655(int arg0, int arg1, int arg2) {
        if (arg0 == 1024) {
            return (arg2 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZII)Z")
    public static final boolean method656(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return false;
        } else {
            return method669(arg1, arg2, (byte) -92) || method672(arg1, (byte) 74, arg2);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)Z")
    public static final boolean method657(int arg0, byte arg1, int arg2) {
        int var3 = 11 % ((48 - arg1) / 42);
        return (arg0 & 0x20000) != 0 | method683(arg0, arg2, 544) || method671(arg2, (byte) 111, arg0);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)Z")
    public static final boolean method658(int arg0, int arg1, int arg2) {
        if (arg0 == 384) {
            return (arg2 & 0x4000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(III)Z")
    public static final boolean method659(int arg0, int arg1, int arg2) {
        if (arg1 == 1024) {
            return (arg0 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII)Z")
    public static final boolean method660(byte arg0, int arg1, int arg2) {
        if (arg0 <= 21) {
            method680(6, -31, -82);
        }
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(III)Z")
    public static final boolean method661(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method684(47, 74, 76);
        }
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(III)Z")
    public static final boolean method662(int arg0, int arg1, int arg2) {
        if (arg1 >= -121) {
            return true;
        } else {
            return method661(arg2, arg0, -1) | (arg2 & 0x30000) != 0 || method671(arg0, (byte) 111, arg2) || method681(arg0, false, arg2);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(BII)Z")
    public static final boolean method663(byte arg0, int arg1, int arg2) {
        if (arg0 < 64) {
            return false;
        } else {
            return (arg2 & 0x22) != 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIB)Z")
    public static final boolean method664(int arg0, int arg1, byte arg2) {
        if (arg2 != 85) {
            method657(41, (byte) -77, 104);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIB)Z")
    public static final boolean method665(int arg0, int arg1, byte arg2) {
        if (arg2 <= 87) {
            return false;
        } else {
            return (arg0 & 0x2080) != 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IBI)Z")
    public static final boolean method666(int arg0, byte arg1, int arg2) {
        if (arg1 < 64) {
            return false;
        } else {
            return (arg2 & 0x34) != 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(III)Z")
    public static final boolean method667(int arg0, int arg1, int arg2) {
        if (arg0 == -7181) {
            return method666(arg1, (byte) 114, arg2) | (arg2 & 0x38000) != 0 || method685(-110, arg1, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZI)Z")
    public static final boolean method668(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method656(false, 112, 2);
        }
        return method663((byte) 78, arg2, arg0) | (arg0 & 0x38000) != 0 || method685(36, arg2, arg0);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(IIB)Z")
    public static final boolean method669(int arg0, int arg1, byte arg2) {
        int var3 = 37 % ((2 - arg2) / 52);
        return false;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(IIB)Z")
    public static final boolean method670(int arg0, int arg1, byte arg2) {
        if (arg2 == -103) {
            return (arg0 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(IBI)Z")
    public static final boolean method671(int arg0, byte arg1, int arg2) {
        if (!method664(arg2, arg0, (byte) 85)) {
            return false;
        } else if (arg1 == 111) {
            return (arg2 & 0x5800) != 0 | method665(arg2, arg0, (byte) 97) | method683(arg2, arg0, 544) ? true : (arg0 & 0x37) == 0 & (method684(8320, arg2, arg0) | method677(arg0, arg2, -1));
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(IBI)Z")
    public static final boolean method672(int arg0, byte arg1, int arg2) {
        return arg1 <= 32 ? false : method669(arg0, arg2, (byte) -61) & method655(1024, arg2, arg0);
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(III)Z")
    public static final boolean method673(int arg0, int arg1, int arg2) {
        if ((method684(arg2 + 8321, arg1, arg0) | (arg1 & 0x8000) != 0) || method682(80, arg1, arg0)) {
            return true;
        } else if (arg2 == -1) {
            return (arg0 & 0x37) == 0 && method671(arg0, (byte) 111, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "(III)Z")
    public static final boolean method674(int arg0, int arg1, int arg2) {
        int var3 = -14 / ((arg0 - 49) / 62);
        return (arg2 & 0x400) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "(III)Z")
    public static final boolean method675(int arg0, int arg1, int arg2) {
        if (arg2 > -41) {
            return true;
        } else {
            return (arg1 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(BII)Z")
    public static final boolean method676(byte arg0, int arg1, int arg2) {
        if (arg0 >= -53) {
            return true;
        } else {
            return (arg2 & 0x400) != 0 | method658(384, arg1, arg2) || method671(arg1, (byte) 111, arg2);
        }
    }

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "(III)Z")
    private static final boolean method677(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            return (arg1 & 0x8000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "(III)Z")
    public static final boolean method678(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            return (arg1 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(BII)Z")
    public static final boolean method679(byte arg0, int arg1, int arg2) {
        if (arg0 == 106) {
            return method660((byte) 46, arg2, arg1) | (arg1 & 0x38000) != 0 || method685(115, arg2, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "(III)Z")
    public static final boolean method680(int arg0, int arg1, int arg2) {
        if (arg0 != -8216) {
            method674(-34, -18, 120);
        }
        return method665(arg1, arg2, (byte) 109) || method671(arg2, (byte) 111, arg1);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IZI)Z")
    public static final boolean method681(int arg0, boolean arg1, int arg2) {
        return arg1 ? false : method661(arg2, arg0, -1) & method659(arg2, 1024, arg0);
    }

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "(III)Z")
    public static final boolean method682(int arg0, int arg1, int arg2) {
        if (arg0 <= 47) {
            method674(-43, -90, -98);
        }
        return ((arg1 & 0x1000) != 0 | method684(8320, arg1, arg2) | method677(arg2, arg1, -1)) & method674(-37, arg2, arg1);
    }

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "(III)Z")
    public static final boolean method683(int arg0, int arg1, int arg2) {
        if (arg2 != 544) {
            method657(-73, (byte) 35, 37);
        }
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "(III)Z")
    public static final boolean method684(int arg0, int arg1, int arg2) {
        return arg0 == 8320 ? (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544 : true;
    }

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "(III)Z")
    public static final boolean method685(int arg0, int arg1, int arg2) {
        int var3 = 22 % ((arg0 + 53) / 35);
        return (method660((byte) 95, arg1, arg2) | method663((byte) 90, arg1, arg2) | method666(arg1, (byte) 92, arg2)) & method678(arg1, arg2, -1);
    }
}
