import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class InputTracking {

    @OriginalMember(owner = "e", name = "b", descriptor = "B")
    private static byte field75 = 5;

    @OriginalMember(owner = "e", name = "c", descriptor = "I")
    private static int field76 = -366;

    @OriginalMember(owner = "e", name = "f", descriptor = "Lkb;")
    public static Packet field79 = null;

    @OriginalMember(owner = "e", name = "g", descriptor = "Lkb;")
    public static Packet field80 = null;

    @OriginalMember(owner = "e", name = "a", descriptor = "I")
    private static int field74;

    @OriginalMember(owner = "e", name = "j", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "e", name = "k", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "e", name = "l", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "e", name = "h", descriptor = "J")
    public static long field81;

    @OriginalMember(owner = "e", name = "i", descriptor = "J")
    public static long field82;

    @OriginalMember(owner = "e", name = "d", descriptor = "Z")
    private static boolean field77;

    @OriginalMember(owner = "e", name = "e", descriptor = "Z")
    public static boolean field78;

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)V")
    public static final synchronized void method34(int arg0) {
        field79 = Packet.method196((byte) 2, 1);
        field82 = System.currentTimeMillis();
        field78 = true;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(ZZ)V")
    public static final synchronized void method35(boolean arg0, boolean arg1) {
        field78 = false;
        if (!arg1) {
            return;
        }
        if (arg0) {
            method37(field75, 499);
        } else {
            if (field79 != null) {
                field79.field621 = 0;
            }
            field80 = null;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(Z)Lkb;")
    public static final synchronized Packet method36(boolean arg0) {
        Packet var1 = null;
        if (!arg0) {
            throw new NullPointerException();
        }
        if (field80 != null) {
            var1 = field80;
            field80 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(BI)V")
    public static final synchronized void method37(byte arg0, int arg1) {
        if (field75 == arg0 && field79.field621 + arg1 >= 500) {
            Packet var2 = field79;
            field79 = Packet.method196((byte) 2, 1);
            field80 = var2;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IIII)V")
    public static final synchronized void method38(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 || arg2 >= 789 || arg0 < 0 || arg0 >= 532) {
            return;
        }
        field83++;
        long var4 = System.currentTimeMillis();
        long var6 = (var4 - field82) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field82 = var4;
        method37(field75, 5);
        if (arg1 >= 0) {
            field74 = -487;
        }
        if (arg3 == 1) {
            field79.method199(1);
        } else {
            field79.method199(2);
        }
        field79.method199((int) var6);
        field79.method202((arg0 << 10) + arg2);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method39(int arg0, boolean arg1) {
        field83++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field82) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field82 = var2;
        method37(field75, 2);
        if (!arg1) {
            field74 = 31;
        }
        if (arg0 == 1) {
            field79.method199(3);
        } else {
            field79.method199(4);
        }
        field79.method199((int) var4);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(III)V")
    public static final synchronized void method40(int arg0, int arg1, int arg2) {
        if (arg2 < 0 || arg2 >= 789 || arg1 < 0 || arg1 >= 532) {
            return;
        }
        long var3 = System.currentTimeMillis();
        while (arg0 >= 0) {
            field77 = !field77;
        }
        if (var3 - field81 < 50L) {
            return;
        }
        field81 = var3;
        field83++;
        long var5 = (var3 - field82) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field82 = var3;
        if (arg2 - field84 < 8 && arg2 - field84 >= -8 && arg1 - field85 < 8 && arg1 - field85 >= -8) {
            method37(field75, 3);
            field79.method199(5);
            field79.method199((int) var5);
            field79.method199((arg1 + 8 - field85 << 4) + arg2 + 8 - field84);
        } else if (arg2 - field84 < 128 && arg2 - field84 >= -128 && arg1 - field85 < 128 && arg1 - field85 >= -128) {
            method37(field75, 4);
            field79.method199(6);
            field79.method199((int) var5);
            field79.method199(arg2 + 128 - field84);
            field79.method199(arg1 + 128 - field85);
        } else {
            method37(field75, 5);
            field79.method199(7);
            field79.method199((int) var5);
            field79.method202((arg1 << 10) + arg2);
        }
        field84 = arg2;
        field85 = arg1;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method41(boolean arg0, int arg1) {
        field83++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field82) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field82 = var2;
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
        method37(field75, 3);
        field79.method199(8);
        if (arg0) {
            field74 = -260;
        }
        field79.method199((int) var4);
        field79.method199(arg1);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IB)V")
    public static final synchronized void method42(int arg0, byte arg1) {
        field83++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field82) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field82 = var2;
        if (arg1 == 5) {
            boolean var6 = false;
        } else {
            field74 = 203;
        }
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
        method37(field75, 3);
        field79.method199(9);
        field79.method199((int) var4);
        field79.method199(arg0);
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(I)V")
    public static final synchronized void method43(int arg0) {
        field83++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field82) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field82 = var1;
        method37(field75, 2);
        if (arg0 < 0) {
            field79.method199(10);
            field79.method199((int) var3);
        }
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "(I)V")
    public static final synchronized void method44(int arg0) {
        if (arg0 >= 0) {
            field77 = !field77;
        }
        field83++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field82) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field82 = var1;
        method37(field75, 2);
        field79.method199(11);
        field79.method199((int) var3);
    }

    @OriginalMember(owner = "e", name = "d", descriptor = "(I)V")
    public static final synchronized void method45(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field83++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field82) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field82 = var2;
        method37(field75, 2);
        field79.method199(12);
        field79.method199((int) var4);
    }

    @OriginalMember(owner = "e", name = "e", descriptor = "(I)V")
    public static final synchronized void method46(int arg0) {
        if (arg0 != 45508) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field83++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field82) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field82 = var2;
        method37(field75, 2);
        field79.method199(13);
        field79.method199((int) var4);
    }
}
