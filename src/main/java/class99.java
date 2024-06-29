import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class99 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZI)Z", line = 4)
    public static final boolean method644(int arg0, boolean arg1, int arg2) {
        if (!method661(arg2, -1, arg0)) {
            return false;
        } else if (((arg0 & 0x5800) != 0 | method655(arg2, arg0, 8320) | method648(arg0, arg2, 1024))) {
            return true;
        } else {
            if (!arg1) {
                method654(-12, -99, -100);
            }
            return (arg2 & 0x37) == 0 & (method663(8970, arg2, arg0) | method652(arg0, true, arg2));
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z", line = 22)
    public static final boolean method645(int arg0, int arg1, int arg2) {
        if (arg1 != 6422) {
            method669(-92, -116, -2);
        }
        return method670((byte) -122, arg0, arg2) & method650(arg0, arg2, arg1 - 6389);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)Z", line = 32)
    public static final boolean method646(int arg0, int arg1, int arg2) {
        if (arg1 == -14331) {
            return (arg2 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(III)Z", line = 42)
    public static final boolean method647(int arg0, int arg1, int arg2) {
        if (arg0 <= 46) {
            return true;
        } else {
            return (arg1 & 0x38000) != 0 | method669(544, arg2, arg1) || method672(arg2, (byte) -123, arg1);
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(III)Z", line = 52)
    public static final boolean method648(int arg0, int arg1, int arg2) {
        if (arg2 != 1024) {
            method647(-7, -35, -65);
        }
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(III)Z", line = 62)
    public static final boolean method649(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method656(-79, -34, 94);
        }
        return method655(arg0, arg2, 8320) || method644(arg2, true, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(III)Z", line = 72)
    public static final boolean method650(int arg0, int arg1, int arg2) {
        if (arg2 == 33) {
            return (arg1 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBI)Z", line = 82)
    public static final boolean method651(int arg0, byte arg1, int arg2) {
        if (arg1 == 19) {
            return (arg0 & 0x4000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(IZI)Z", line = 92)
    private static final boolean method652(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (arg0 & 0x8000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "(III)Z", line = 102)
    public static final boolean method653(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method651(-56, (byte) 57, 89);
        }
        return method670((byte) -95, arg2, arg0) || method645(arg2, 6422, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "(III)Z", line = 112)
    public static final boolean method654(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            return (arg0 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "(III)Z", line = 122)
    public static final boolean method655(int arg0, int arg1, int arg2) {
        if (arg2 != 8320) {
            method646(82, -52, 54);
        }
        return (arg1 & 0x2080) != 0;
    }

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "(III)Z", line = 132)
    public static final boolean method656(int arg0, int arg1, int arg2) {
        return arg0 == 32768 ? (method663(8970, arg1, arg2) | (arg2 & 0x1000) != 0 | method652(arg2, true, arg1)) & method664(arg1, arg2, -113) : false;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(IZI)Z", line = 142)
    public static final boolean method657(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return method662(arg0, arg2, (byte) 120) | (arg0 & 0x38000) != 0 || method672(arg2, (byte) -105, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "(III)Z", line = 152)
    public static final boolean method658(int arg0, int arg1, int arg2) {
        if (arg2 == 1024) {
            return (arg1 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "(III)Z", line = 162)
    public static final boolean method659(int arg0, int arg1, int arg2) {
        if (((arg0 & arg1) != 0 | method663(8970, arg2, arg0)) || method656(32768, arg2, arg0)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && method644(arg0, true, arg2);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BII)Z", line = 172)
    public static final boolean method660(byte arg0, int arg1, int arg2) {
        if (arg0 < 117) {
            return true;
        } else {
            return method651(arg1, (byte) 19, arg2) | (arg1 & 0x400) != 0 || method644(arg1, true, arg2);
        }
    }

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "(III)Z", line = 182)
    public static final boolean method661(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method663(113, 28, 19);
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)Z", line = 193)
    public static final boolean method662(int arg0, int arg1, byte arg2) {
        int var3 = -6 % ((15 - arg2) / 50);
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "(III)Z", line = 201)
    public static final boolean method663(int arg0, int arg1, int arg2) {
        return arg0 == 8970 ? (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0 : false;
    }

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "(III)Z", line = 211)
    public static final boolean method664(int arg0, int arg1, int arg2) {
        if (arg2 >= -107) {
            return false;
        } else {
            return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(BII)Z", line = 223)
    public static final boolean method665(byte arg0, int arg1, int arg2) {
        if (arg0 < 55) {
            return false;
        } else {
            return (arg1 & 0x10) != 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(IBI)Z", line = 233)
    public static final boolean method666(int arg0, byte arg1, int arg2) {
        if (arg1 == 78) {
            return method668(arg2, -1, arg0) | (arg2 & 0x38000) != 0 || method672(arg0, (byte) 34, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(IBI)Z", line = 244)
    public static final boolean method667(int arg0, byte arg1, int arg2) {
        int var3 = 117 / ((arg1 - 1) / 61);
        return method648(arg2, arg0, 1024) | (arg2 & 0x20000) != 0 || method644(arg2, true, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "(III)Z", line = 252)
    public static final boolean method668(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            return (arg0 & 0x21) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "(III)Z", line = 262)
    public static final boolean method669(int arg0, int arg1, int arg2) {
        if (arg0 == 544) {
            return (arg2 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(BII)Z", line = 272)
    public static final boolean method670(byte arg0, int arg1, int arg2) {
        return arg0 > -80 ? false : false;
    }

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "(III)Z", line = 282)
    public static final boolean method671(int arg0, int arg1, int arg2) {
        if (arg2 == 16) {
            return (arg1 & 0x30000) != 0 | method665((byte) 71, arg1, arg0) || method644(arg1, true, arg0) || method674(arg1, arg0, arg2 ^ 0xFFFFEF1A);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(IBI)Z", line = 293)
    public static final boolean method672(int arg0, byte arg1, int arg2) {
        int var3 = -78 % ((-arg1 - 37) / 61);
        return (method668(arg2, -1, arg0) | method662(arg2, arg0, (byte) 102) | method669(544, arg0, arg2)) & method654(arg2, arg0, -1);
    }

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "(III)Z", line = 301)
    public static final boolean method673(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method662(78, -94, (byte) 28);
        }
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "(III)Z", line = 311)
    public static final boolean method674(int arg0, int arg1, int arg2) {
        return arg2 == -4342 ? method665((byte) 56, arg0, arg1) & method646(arg1, -14331, arg0) : true;
    }
}
