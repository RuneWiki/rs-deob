import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class InputTracking {

    @OriginalMember(owner = "e", name = "a", descriptor = "Z")
    private static boolean field69 = true;

    @OriginalMember(owner = "e", name = "b", descriptor = "I")
    private static int field70 = 339;

    @OriginalMember(owner = "e", name = "d", descriptor = "Lkb;")
    public static Packet field72 = null;

    @OriginalMember(owner = "e", name = "e", descriptor = "Lkb;")
    public static Packet field73 = null;

    @OriginalMember(owner = "e", name = "h", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "e", name = "i", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "e", name = "j", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "e", name = "f", descriptor = "J")
    public static long field74;

    @OriginalMember(owner = "e", name = "g", descriptor = "J")
    public static long field75;

    @OriginalMember(owner = "e", name = "c", descriptor = "Z")
    public static boolean field71;

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)V")
    public static final synchronized void method34(int arg0) {
        field72 = Packet.method195(1, 0);
        field75 = System.currentTimeMillis();
        int var1 = 22 / arg0;
        field71 = true;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(ZZ)V")
    public static final synchronized void method35(boolean arg0, boolean arg1) {
        field71 = false;
        if (!arg0) {
            field69 = !field69;
        }
        if (arg1) {
            method37(499, -604);
        } else {
            if (field72 != null) {
                field72.field622 = 0;
            }
            field73 = null;
        }
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(I)Lkb;")
    public static final synchronized Packet method36(int arg0) {
        if (arg0 != 38238) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        Packet var2 = null;
        if (field73 != null) {
            var2 = field73;
            field73 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(II)V")
    public static final synchronized void method37(int arg0, int arg1) {
        while (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field72.field622 + arg0 >= 500) {
            Packet var2 = field72;
            field72 = Packet.method195(1, 0);
            field73 = var2;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IIIZ)V")
    public static final synchronized void method38(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field70 = 272;
        }
        if (arg0 < 0 || arg0 >= 789 || arg1 < 0 || arg1 >= 532) {
            return;
        }
        field76++;
        long var4 = System.currentTimeMillis();
        long var6 = (var4 - field75) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field75 = var4;
        method37(5, -604);
        if (arg2 == 1) {
            field72.method198(1);
        } else {
            field72.method198(2);
        }
        field72.method198((int) var6);
        field72.method201((arg1 << 10) + arg0);
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(II)V")
    public static final synchronized void method39(int arg0, int arg1) {
        field76++;
        if (arg1 < 1 || arg1 > 1) {
            field69 = !field69;
        }
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field75) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field75 = var2;
        method37(2, -604);
        if (arg0 == 1) {
            field72.method198(3);
        } else {
            field72.method198(4);
        }
        field72.method198((int) var4);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(III)V")
    public static final synchronized void method40(int arg0, int arg1, int arg2) {
        if (arg2 < 0 || arg2 >= 789 || arg1 < 0 || arg1 >= 532) {
            return;
        }
        long var3 = System.currentTimeMillis();
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var3 - field74 < 50L) {
            return;
        }
        field74 = var3;
        field76++;
        long var6 = (var3 - field75) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field75 = var3;
        if (arg2 - field77 < 8 && arg2 - field77 >= -8 && arg1 - field78 < 8 && arg1 - field78 >= -8) {
            method37(3, -604);
            field72.method198(5);
            field72.method198((int) var6);
            field72.method198((arg1 + 8 - field78 << 4) + arg2 + 8 - field77);
        } else if (arg2 - field77 < 128 && arg2 - field77 >= -128 && arg1 - field78 < 128 && arg1 - field78 >= -128) {
            method37(4, -604);
            field72.method198(6);
            field72.method198((int) var6);
            field72.method198(arg2 + 128 - field77);
            field72.method198(arg1 + 128 - field78);
        } else {
            method37(5, -604);
            field72.method198(7);
            field72.method198((int) var6);
            field72.method201((arg1 << 10) + arg2);
        }
        field77 = arg2;
        field78 = arg1;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method41(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field76++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field75) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field75 = var2;
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
        method37(3, -604);
        field72.method198(8);
        field72.method198((int) var4);
        field72.method198(arg0);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(BI)V")
    public static final synchronized void method42(byte arg0, int arg1) {
        field76++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field75) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field75 = var2;
        if (arg0 != -11) {
            return;
        }
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
        method37(3, -604);
        field72.method198(9);
        field72.method198((int) var4);
        field72.method198(arg1);
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "(I)V")
    public static final synchronized void method43(int arg0) {
        field76++;
        long var1 = System.currentTimeMillis();
        if (arg0 != 0) {
            field70 = 494;
        }
        long var3 = (var1 - field75) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field75 = var1;
        method37(2, -604);
        field72.method198(10);
        field72.method198((int) var3);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(B)V")
    public static final synchronized void method44(byte arg0) {
        if (arg0 != 3) {
            return;
        }
        field76++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field75) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field75 = var1;
        method37(2, -604);
        field72.method198(11);
        field72.method198((int) var3);
    }

    @OriginalMember(owner = "e", name = "d", descriptor = "(I)V")
    public static final synchronized void method45(int arg0) {
        field76++;
        long var1 = System.currentTimeMillis();
        if (arg0 != -27585) {
            field69 = !field69;
        }
        long var3 = (var1 - field75) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field75 = var1;
        method37(2, -604);
        field72.method198(12);
        field72.method198((int) var3);
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(B)V")
    public static final synchronized void method46(byte arg0) {
        field76++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field75) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field75 = var1;
        method37(2, -604);
        if (arg0 != -124) {
            field70 = 423;
        }
        field72.method198(13);
        field72.method198((int) var3);
    }
}
