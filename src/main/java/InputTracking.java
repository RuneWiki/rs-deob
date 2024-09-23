import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class InputTracking {

    @OriginalMember(owner = "e", name = "b", descriptor = "I")
    private static int field70 = -992;

    @OriginalMember(owner = "e", name = "e", descriptor = "Lkb;")
    public static Packet field73 = null;

    @OriginalMember(owner = "e", name = "f", descriptor = "Lkb;")
    public static Packet field74 = null;

    @OriginalMember(owner = "e", name = "c", descriptor = "I")
    private static int field71;

    @OriginalMember(owner = "e", name = "h", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "e", name = "i", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "e", name = "g", descriptor = "J")
    public static long field75;

    @OriginalMember(owner = "e", name = "a", descriptor = "Z")
    private static boolean field69;

    @OriginalMember(owner = "e", name = "d", descriptor = "Z")
    public static boolean field72;

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)V")
    public static final void method33(int arg0) {
        field73 = Packet.method190(1, 32206);
        field75 = System.currentTimeMillis();
        if (arg0 >= 0) {
            field70 = -286;
        }
        field72 = true;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(I)V")
    public static final void method34(int arg0) {
        if (arg0 >= 6 && arg0 <= 6) {
            field72 = false;
        }
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "(I)Lkb;")
    public static final Packet method35(int arg0) {
        Packet var1 = null;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        if (field74 != null) {
            var1 = field74;
            field74 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IBI)V")
    public static final void method36(int arg0, byte arg1, int arg2) {
        if (arg2 < 0 || arg2 >= 789 || arg0 < 0 || arg0 >= 532) {
            return;
        }
        int var3 = method45(34564);
        method46(-178, 5);
        field73.method193(1);
        if (arg1 != -58) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field73.method193(var3);
        field73.method195((arg0 << 10) + arg2);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(Z)V")
    public static final void method37(boolean arg0) {
        int var1 = method45(34564);
        method46(-178, 2);
        if (!arg0) {
            field70 = -325;
        }
        field73.method193(3);
        field73.method193(var1);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(ZII)V")
    public static final void method38(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field71 = 142;
        }
        if (arg2 < 0 || arg2 >= 789 || arg1 < 0 || arg1 >= 532) {
            return;
        }
        int var3 = method45(34564);
        if (field76 - arg2 < 8 && field76 - arg2 >= -8 && field77 - arg1 < 8 && field77 - arg1 >= -8) {
            method46(-178, 3);
            field73.method193(5);
            field73.method193(var3);
            field73.method193((field77 + 8 - arg1 << 4) + field76 + 8 - arg2);
        } else if (field76 - arg2 < 128 && field76 - arg2 >= -128 && field77 - arg1 < 128 && field77 - arg1 >= -128) {
            method46(-178, 4);
            field73.method193(6);
            field73.method193(var3);
            field73.method193(field76 + 128 - arg2);
            field73.method193(field77 + 128 - arg1);
        } else {
            method46(-178, 5);
            field73.method193(7);
            field73.method193(var3);
            field73.method195((arg1 << 10) + arg2);
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IZ)V")
    public static final void method39(int arg0, boolean arg1) {
        int var2 = method45(34564);
        if (arg0 == 1000) {
            arg0 = 11;
        }
        if (arg0 == 1001) {
            arg0 = 12;
        }
        if (arg0 == 1002) {
            arg0 = 14;
        }
        if (arg0 == 1003) {
            arg0 = 15;
        }
        if (arg0 >= 1008) {
            arg0 -= 992;
        }
        method46(-178, 3);
        if (arg1) {
            field73.method193(8);
            field73.method193(var2);
            field73.method193(arg0);
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(BI)V")
    public static final void method40(byte arg0, int arg1) {
        int var2 = method45(34564);
        if (arg1 == 1000) {
            arg1 = 11;
        }
        if (arg1 == 1001) {
            arg1 = 12;
        }
        if (arg1 == 1002) {
            arg1 = 14;
        }
        if (arg1 == 1003) {
            arg1 = 15;
        }
        if (arg1 >= 1008) {
            arg1 -= 992;
        }
        method46(-178, 3);
        if (arg0 == -63) {
            field73.method193(9);
            field73.method193(var2);
            field73.method193(arg1);
        }
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(Z)V")
    public static final void method41(boolean arg0) {
        int var1 = method45(34564);
        method46(-178, 2);
        field73.method193(10);
        if (arg0) {
            field69 = !field69;
        }
        field73.method193(var1);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(B)V")
    public static final void method42(byte arg0) {
        if (arg0 == 9) {
            boolean var1 = false;
        } else {
            field70 = 107;
        }
        int var2 = method45(34564);
        method46(-178, 2);
        field73.method193(11);
        field73.method193(var2);
    }

    @OriginalMember(owner = "e", name = "d", descriptor = "(I)V")
    public static final void method43(int arg0) {
        if (arg0 < 0) {
            int var1 = method45(34564);
            method46(-178, 2);
            field73.method193(12);
            field73.method193(var1);
        }
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(B)V")
    public static final void method44(byte arg0) {
        int var1 = method45(34564);
        method46(-178, 2);
        if (arg0 != 66) {
            field71 = -423;
        }
        field73.method193(13);
        field73.method193(var1);
    }

    @OriginalMember(owner = "e", name = "e", descriptor = "(I)I")
    private static final int method45(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != 34564) {
            field71 = 454;
        }
        long var3 = (var1 - field75) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field75 = var1;
        return (int) var3;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(II)V")
    private static final void method46(int arg0, int arg1) {
        if (arg0 < 0 && field73.field606 + arg1 >= 500) {
            Packet var2 = field73;
            field73 = Packet.method190(1, 32206);
            field74 = var2;
        }
    }
}
