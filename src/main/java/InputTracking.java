import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class InputTracking {

    @OriginalMember(owner = "e", name = "b", descriptor = "B")
    private static byte field69 = 7;

    @OriginalMember(owner = "e", name = "g", descriptor = "Lkb;")
    public static Packet field74 = null;

    @OriginalMember(owner = "e", name = "h", descriptor = "Lkb;")
    public static Packet field75 = null;

    @OriginalMember(owner = "e", name = "a", descriptor = "I")
    private static int field68;

    @OriginalMember(owner = "e", name = "c", descriptor = "I")
    private static int field70;

    @OriginalMember(owner = "e", name = "k", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "e", name = "l", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "e", name = "m", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "e", name = "i", descriptor = "J")
    public static long field76;

    @OriginalMember(owner = "e", name = "j", descriptor = "J")
    public static long field77;

    @OriginalMember(owner = "e", name = "d", descriptor = "Z")
    private static boolean field71;

    @OriginalMember(owner = "e", name = "e", descriptor = "Z")
    private static boolean field72;

    @OriginalMember(owner = "e", name = "f", descriptor = "Z")
    public static boolean field73;

    @OriginalMember(owner = "e", name = "a", descriptor = "(B)V")
    public static final synchronized void method34(byte arg0) {
        if (arg0 == 4) {
            field74 = Packet.method196(1, true);
            field77 = System.currentTimeMillis();
            field73 = true;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(BZ)V")
    public static final synchronized void method35(byte arg0, boolean arg1) {
        field73 = false;
        if (field69 != arg0) {
            field72 = true;
        }
        if (arg1) {
            method37(499, (byte) 3);
        } else {
            if (field74 != null) {
                field74.field612 = 0;
            }
            field75 = null;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)Lkb;")
    public static final synchronized Packet method36(int arg0) {
        if (arg0 <= 0) {
            field71 = !field71;
        }
        Packet var1 = null;
        if (field75 != null) {
            var1 = field75;
            field75 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IB)V")
    public static final synchronized void method37(int arg0, byte arg1) {
        if (arg1 == 3) {
            boolean var2 = false;
        }
        if (field74.field612 + arg0 >= 500) {
            Packet var3 = field74;
            field74 = Packet.method196(1, true);
            field75 = var3;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IIZI)V")
    public static final synchronized void method38(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 < 0 || arg1 >= 789 || arg3 < 0 || arg3 >= 532) {
            return;
        }
        field78++;
        if (!arg2) {
            field70 = 132;
        }
        long var4 = System.currentTimeMillis();
        long var6 = (var4 - field77) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field77 = var4;
        method37(5, (byte) 3);
        if (arg0 == 1) {
            field74.method199(1);
        } else {
            field74.method199(2);
        }
        field74.method199((int) var6);
        field74.method202((arg3 << 10) + arg1);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(II)V")
    public static final synchronized void method39(int arg0, int arg1) {
        field78++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field77) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field77 = var2;
        if (arg0 < 1 || arg0 > 1) {
            field70 = 341;
        }
        method37(2, (byte) 3);
        if (arg1 == 1) {
            field74.method199(3);
        } else {
            field74.method199(4);
        }
        field74.method199((int) var4);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(III)V")
    public static final synchronized void method40(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field70 = -471;
        }
        if (arg1 < 0 || arg1 >= 789 || arg0 < 0 || arg0 >= 532) {
            return;
        }
        long var3 = System.currentTimeMillis();
        if (var3 - field76 < 50L) {
            return;
        }
        field76 = var3;
        field78++;
        long var5 = (var3 - field77) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field77 = var3;
        if (arg1 - field79 < 8 && arg1 - field79 >= -8 && arg0 - field80 < 8 && arg0 - field80 >= -8) {
            method37(3, (byte) 3);
            field74.method199(5);
            field74.method199((int) var5);
            field74.method199((arg0 + 8 - field80 << 4) + arg1 + 8 - field79);
        } else if (arg1 - field79 < 128 && arg1 - field79 >= -128 && arg0 - field80 < 128 && arg0 - field80 >= -128) {
            method37(4, (byte) 3);
            field74.method199(6);
            field74.method199((int) var5);
            field74.method199(arg1 + 128 - field79);
            field74.method199(arg0 + 128 - field80);
        } else {
            method37(5, (byte) 3);
            field74.method199(7);
            field74.method199((int) var5);
            field74.method202((arg0 << 10) + arg1);
        }
        field79 = arg1;
        field80 = arg0;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(II)V")
    public static final synchronized void method41(int arg0, int arg1) {
        if (arg0 <= 0) {
            field70 = -320;
        }
        field78++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field77) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field77 = var2;
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
        method37(3, (byte) 3);
        field74.method199(8);
        field74.method199((int) var4);
        field74.method199(arg1);
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "(II)V")
    public static final synchronized void method42(int arg0, int arg1) {
        field78++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field77) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field77 = var2;
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
        method37(3, (byte) 3);
        field74.method199(9);
        if (arg1 != 0) {
            field68 = 138;
        }
        field74.method199((int) var4);
        field74.method199(arg0);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(Z)V")
    public static final synchronized void method43(boolean arg0) {
        field78++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field77) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field77 = var1;
        if (!arg0) {
            field72 = true;
        }
        method37(2, (byte) 3);
        field74.method199(10);
        field74.method199((int) var3);
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(I)V")
    public static final synchronized void method44(int arg0) {
        field78++;
        if (arg0 <= 0) {
            field72 = true;
        }
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field77) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field77 = var1;
        method37(2, (byte) 3);
        field74.method199(11);
        field74.method199((int) var3);
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(Z)V")
    public static final synchronized void method45(boolean arg0) {
        field78++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field77) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field77 = var1;
        method37(2, (byte) 3);
        field74.method199(12);
        if (!arg0) {
            field74.method199((int) var3);
        }
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "(I)V")
    public static final synchronized void method46(int arg0) {
        field78++;
        long var1 = System.currentTimeMillis();
        if (arg0 >= 0) {
            return;
        }
        long var3 = (var1 - field77) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field77 = var1;
        method37(2, (byte) 3);
        field74.method199(13);
        field74.method199((int) var3);
    }
}
