import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class InputTracking {

    @OriginalMember(owner = "e", name = "a", descriptor = "B")
    private static byte field72 = 65;

    @OriginalMember(owner = "e", name = "b", descriptor = "I")
    private static int field73 = 78;

    @OriginalMember(owner = "e", name = "f", descriptor = "Lkb;")
    public static Packet field77 = null;

    @OriginalMember(owner = "e", name = "g", descriptor = "Lkb;")
    public static Packet field78 = null;

    @OriginalMember(owner = "e", name = "i", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "e", name = "k", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "e", name = "l", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "e", name = "h", descriptor = "J")
    public static long field79;

    @OriginalMember(owner = "e", name = "j", descriptor = "J")
    public static long field81;

    @OriginalMember(owner = "e", name = "c", descriptor = "Z")
    private static boolean field74;

    @OriginalMember(owner = "e", name = "d", descriptor = "Z")
    private static boolean field75;

    @OriginalMember(owner = "e", name = "e", descriptor = "Z")
    public static boolean field76;

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)V")
    public static final synchronized void method34(int arg0) {
        field77 = Packet.method203(1, -737);
        field78 = null;
        field79 = System.currentTimeMillis();
        if (arg0 != -31717) {
            field75 = !field75;
        }
        field76 = true;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(B)V")
    public static final synchronized void method35(byte arg0) {
        field76 = false;
        field77 = null;
        if (field72 == arg0) {
            field78 = null;
        }
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(I)Lkb;")
    public static final synchronized Packet method36(int arg0) {
        Packet var1 = null;
        if (field78 != null && field76) {
            var1 = field78;
        }
        field78 = null;
        if (arg0 >= 0) {
            field74 = !field74;
        }
        return var1;
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "(I)Lkb;")
    public static final synchronized Packet method37(int arg0) {
        if (arg0 <= 0) {
            field75 = !field75;
        }
        Packet var1 = null;
        if (field77 != null && field77.field622 > 0 && field76) {
            var1 = field77;
        }
        method35((byte) 65);
        return var1;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(II)V")
    private static final synchronized void method38(int arg0, int arg1) {
        if (arg0 <= 0) {
            field74 = !field74;
        }
        if (field77.field622 + arg1 >= 500) {
            Packet var2 = field77;
            field77 = Packet.method203(1, -737);
            field78 = var2;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IIIB)V")
    public static final synchronized void method39(int arg0, int arg1, int arg2, byte arg3) {
        if (!field76 || (arg0 < 0 || arg0 >= 789 || arg2 < 0 || arg2 >= 532)) {
            return;
        }
        field80++;
        long var4 = System.currentTimeMillis();
        long var6 = (var4 - field79) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field79 = var4;
        method38(field73, 5);
        if (arg3 != 4) {
            return;
        }
        if (arg1 == 1) {
            field77.method206(1);
        } else {
            field77.method206(2);
        }
        field77.method206((int) var6);
        field77.method209((arg2 << 10) + arg0);
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(II)V")
    public static final synchronized void method40(int arg0, int arg1) {
        if (!field76) {
            return;
        }
        field80++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field79) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field79 = var2;
        if (arg1 != 0) {
            return;
        }
        method38(field73, 2);
        if (arg0 == 1) {
            field77.method206(3);
        } else {
            field77.method206(4);
        }
        field77.method206((int) var4);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IZI)V")
    public static final synchronized void method41(int arg0, boolean arg1, int arg2) {
        if (!field76 || (arg2 < 0 || arg2 >= 789 || arg0 < 0 || arg0 >= 532)) {
            return;
        }
        long var3 = System.currentTimeMillis();
        if (!arg1) {
            field73 = 445;
        }
        if (var3 - field81 < 50L) {
            return;
        }
        field81 = var3;
        field80++;
        long var5 = (var3 - field79) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field79 = var3;
        if (arg2 - field82 < 8 && arg2 - field82 >= -8 && arg0 - field83 < 8 && arg0 - field83 >= -8) {
            method38(field73, 3);
            field77.method206(5);
            field77.method206((int) var5);
            field77.method206((arg0 + 8 - field83 << 4) + arg2 + 8 - field82);
        } else if (arg2 - field82 < 128 && arg2 - field82 >= -128 && arg0 - field83 < 128 && arg0 - field83 >= -128) {
            method38(field73, 4);
            field77.method206(6);
            field77.method206((int) var5);
            field77.method206(arg2 + 128 - field82);
            field77.method206(arg0 + 128 - field83);
        } else {
            method38(field73, 5);
            field77.method206(7);
            field77.method206((int) var5);
            field77.method209((arg0 << 10) + arg2);
        }
        field82 = arg2;
        field83 = arg0;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method42(int arg0, boolean arg1) {
        if (!field76) {
            return;
        }
        field80++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field79) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field79 = var2;
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
        method38(field73, 3);
        if (!arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        field77.method206(8);
        field77.method206((int) var4);
        field77.method206(arg0);
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "(II)V")
    public static final synchronized void method43(int arg0, int arg1) {
        if (!field76) {
            return;
        }
        field80++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field79) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field79 = var2;
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
        method38(field73, 3);
        field77.method206(9);
        field77.method206((int) var4);
        field77.method206(arg0);
        if (arg1 == 1) {
            ;
        }
    }

    @OriginalMember(owner = "e", name = "d", descriptor = "(I)V")
    public static final synchronized void method44(int arg0) {
        if (!field76) {
            return;
        }
        field80++;
        if (arg0 >= 0) {
            return;
        }
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field79) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field79 = var1;
        method38(field73, 2);
        field77.method206(10);
        field77.method206((int) var3);
    }

    @OriginalMember(owner = "e", name = "e", descriptor = "(I)V")
    public static final synchronized void method45(int arg0) {
        if (!field76) {
            return;
        }
        field80++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field79) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field79 = var1;
        method38(field73, 2);
        if (arg0 != 0) {
            field75 = !field75;
        }
        field77.method206(11);
        field77.method206((int) var3);
    }

    @OriginalMember(owner = "e", name = "f", descriptor = "(I)V")
    public static final synchronized void method46(int arg0) {
        if (!field76) {
            return;
        }
        field80++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field79) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field79 = var1;
        method38(field73, 2);
        if (arg0 < 0) {
            field77.method206(12);
            field77.method206((int) var3);
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(Z)V")
    public static final synchronized void method47(boolean arg0) {
        if (arg0 || !field76) {
            return;
        }
        field80++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field79) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field79 = var1;
        method38(field73, 2);
        field77.method206(13);
        field77.method206((int) var3);
    }
}
