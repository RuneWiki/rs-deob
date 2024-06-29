import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class40 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method254(int arg0, int arg1, int arg2) {
        if (arg1 == -30021) {
            return (arg0 & 0x400) != 0 && (arg2 & 0x37) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BII)Z", line = 15)
    public static final boolean method255(byte arg0, int arg1, int arg2) {
        int var3 = -106 / ((62 - arg0) / 52);
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBI)Z", line = 23)
    public static final boolean method256(int arg0, byte arg1, int arg2) {
        if (arg1 < 57) {
            return true;
        } else {
            return (arg2 & 0x38000) != 0 | method264(arg2, arg0, true) || method281(arg0, false, arg2);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)Z", line = 33)
    public static final boolean method257(int arg0, int arg1, int arg2) {
        return arg2 == 33 ? (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0 : false;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)Z", line = 43)
    public static final boolean method258(int arg0, int arg1, int arg2) {
        return arg2 == -25232 ? method274(arg1, arg0, -7404) & method277(2277, arg0, arg1) : true;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(III)Z", line = 54)
    public static final boolean method259(int arg0, int arg1, int arg2) {
        int var3 = 14 % ((88 - arg1) / 32);
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(III)Z", line = 64)
    public static final boolean method260(int arg0, int arg1, int arg2) {
        if (!method255((byte) 125, arg0, arg2)) {
            return false;
        } else if (((arg2 & 0x5800) != 0 | method265(arg0, (byte) -16, arg2) | method272(12625, arg2, arg0))) {
            return true;
        } else {
            if (arg1 != 21683) {
                method255((byte) 88, 49, -125);
            }
            return (arg0 & 0x37) == 0 & (method257(arg0, arg2, 33) | method262((byte) -128, arg0, arg2));
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIB)Z", line = 82)
    public static final boolean method261(int arg0, int arg1, byte arg2) {
        int var3 = -82 % ((arg2 - 23) / 57);
        return (arg0 & 0x30000) != 0 | method274(arg0, arg1, -7404) || method260(arg1, 21683, arg0) || method258(arg1, arg0, -25232);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(BII)Z", line = 90)
    private static final boolean method262(byte arg0, int arg1, int arg2) {
        if (arg0 >= -127) {
            method284(-63, -106, 91);
        }
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZII)Z", line = 100)
    public static final boolean method263(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return method272(12625, arg1, arg2) | (arg1 & 0x20000) != 0 || method260(arg2, 21683, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZ)Z", line = 110)
    public static final boolean method264(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return (arg0 & 0x21) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IBI)Z", line = 120)
    public static final boolean method265(int arg0, byte arg1, int arg2) {
        if (arg1 == -16) {
            return (arg2 & 0x2080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(III)Z", line = 130)
    public static final boolean method266(int arg0, int arg1, int arg2) {
        if (arg1 != 229376) {
            method264(-128, 96, false);
        }
        return (arg0 & 0x38000) != 0 | method268(arg0, (byte) -104, arg2) || method281(arg2, false, arg0);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IIB)Z", line = 140)
    public static final boolean method267(int arg0, int arg1, byte arg2) {
        if (arg2 > -50) {
            method268(-127, (byte) 89, -5);
        }
        return method276((byte) -99, arg0, arg1) & method259(arg0, 120, arg1);
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(IBI)Z", line = 150)
    public static final boolean method268(int arg0, byte arg1, int arg2) {
        if (arg1 != -104) {
            method262((byte) 32, 111, -31);
        }
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IIZ)Z", line = 160)
    public static final boolean method269(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method282(-96, 54, -80);
        }
        return (arg1 & 0x38000) != 0 | method270(arg1, 34, arg0) || method281(arg0, false, arg1);
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(III)Z", line = 170)
    public static final boolean method270(int arg0, int arg1, int arg2) {
        if (arg1 == 34) {
            return (arg0 & 0x22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(III)Z", line = 180)
    public static final boolean method271(int arg0, int arg1, int arg2) {
        if (arg2 == -4797) {
            return (arg1 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "(III)Z", line = 190)
    public static final boolean method272(int arg0, int arg1, int arg2) {
        if (arg0 != 12625) {
            method261(88, -48, (byte) -1);
        }
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "(III)Z", line = 200)
    public static final boolean method273(int arg0, int arg1, int arg2) {
        if (((arg1 & 0x8000) != 0 | method257(arg2, arg1, 33)) || method283(arg1, (byte) -113, arg2)) {
            return true;
        } else {
            int var3 = -40 % ((arg0 - 50) / 49);
            return (arg2 & 0x37) == 0 && method260(arg2, 21683, arg1);
        }
    }

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "(III)Z", line = 212)
    public static final boolean method274(int arg0, int arg1, int arg2) {
        if (arg2 == -7404) {
            return (arg0 & 0x10) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "(III)Z", line = 222)
    public static final boolean method275(int arg0, int arg1, int arg2) {
        if (arg1 == -27764) {
            return (arg2 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(BII)Z", line = 232)
    public static final boolean method276(byte arg0, int arg1, int arg2) {
        if (arg0 != -99) {
            method280(99, -60, (byte) 2);
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "(III)Z", line = 242)
    public static final boolean method277(int arg0, int arg1, int arg2) {
        if (arg0 == 2277) {
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "(III)Z", line = 253)
    public static final boolean method278(int arg0, int arg1, int arg2) {
        int var3 = 67 / ((arg2 + 40) / 37);
        return method265(arg0, (byte) -16, arg1) || method260(arg0, 21683, arg1);
    }

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "(III)Z", line = 261)
    public static final boolean method279(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            return (arg0 & 0x20) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(IIB)Z", line = 271)
    public static final boolean method280(int arg0, int arg1, byte arg2) {
        if (arg2 != 95) {
            method282(-83, -119, 66);
        }
        return (arg1 & 0x400) != 0 | method284(55, arg1, arg0) || method260(arg0, 21683, arg1);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZI)Z", line = 281)
    public static final boolean method281(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method284(-51, -92, -5);
        }
        return (method264(arg2, arg0, true) | method270(arg2, 34, arg0) | method268(arg2, (byte) -104, arg0)) & method271(arg0, arg2, -4797);
    }

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "(III)Z", line = 291)
    public static final boolean method282(int arg0, int arg1, int arg2) {
        if (arg1 == 1024) {
            return method276((byte) -99, arg0, arg2) || method267(arg0, arg2, (byte) -85);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(IBI)Z", line = 301)
    public static final boolean method283(int arg0, byte arg1, int arg2) {
        if (arg1 >= -103) {
            method261(124, -36, (byte) 65);
        }
        return (method257(arg2, arg0, 33) | (arg0 & 0x1000) != 0 | method262((byte) -128, arg2, arg0)) & method254(arg0, -30021, arg2);
    }

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "(III)Z", line = 311)
    public static final boolean method284(int arg0, int arg1, int arg2) {
        if (arg0 == 55) {
            return (arg1 & 0x4000) != 0;
        } else {
            return true;
        }
    }
}
