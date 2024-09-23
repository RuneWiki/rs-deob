import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class InputTracking {

    @OriginalMember(owner = "e", name = "a", descriptor = "I")
    private static int field72 = 505;

    @OriginalMember(owner = "e", name = "b", descriptor = "I")
    private static int field73 = 3;

    @OriginalMember(owner = "e", name = "g", descriptor = "Lkb;")
    public static Packet field78 = null;

    @OriginalMember(owner = "e", name = "h", descriptor = "Lkb;")
    public static Packet field79 = null;

    @OriginalMember(owner = "e", name = "j", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "e", name = "l", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "e", name = "m", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "e", name = "i", descriptor = "J")
    public static long field80;

    @OriginalMember(owner = "e", name = "k", descriptor = "J")
    public static long field82;

    @OriginalMember(owner = "e", name = "c", descriptor = "Z")
    private static boolean field74;

    @OriginalMember(owner = "e", name = "d", descriptor = "Z")
    private static boolean field75;

    @OriginalMember(owner = "e", name = "e", descriptor = "Z")
    private static boolean field76;

    @OriginalMember(owner = "e", name = "f", descriptor = "Z")
    public static boolean field77;

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)V")
    public static final synchronized void method34(int arg0) {
        field78 = Packet.method203(3, 1);
        field79 = null;
        if (arg0 == -42259) {
            field80 = System.currentTimeMillis();
            field77 = true;
        }
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(I)V")
    public static final synchronized void method35(int arg0) {
        if (arg0 != 0) {
            field76 = !field76;
        }
        field77 = false;
        field78 = null;
        field79 = null;
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "(I)Lkb;")
    public static final synchronized Packet method36(int arg0) {
        Packet var1 = null;
        if (field79 != null && field77) {
            var1 = field79;
        }
        field79 = null;
        int var2 = 75 / arg0;
        return var1;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(B)Lkb;")
    public static final synchronized Packet method37(byte arg0) {
        if (arg0 != 29) {
            field75 = !field75;
        }
        Packet var1 = null;
        if (field78 != null && field78.field624 > 0 && field77) {
            var1 = field78;
        }
        method35(0);
        return var1;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(II)V")
    private static final synchronized void method38(int arg0, int arg1) {
        while (arg0 >= 0) {
            field72 = -392;
        }
        if (field78.field624 + arg1 >= 500) {
            Packet var2 = field78;
            field78 = Packet.method203(3, 1);
            field79 = var2;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IIIZ)V")
    public static final synchronized void method39(int arg0, int arg1, int arg2, boolean arg3) {
        if (!field77 || (arg2 < 0 || arg2 >= 789 || arg1 < 0 || arg1 >= 532)) {
            return;
        }
        field81++;
        if (!arg3) {
            return;
        }
        long var4 = System.currentTimeMillis();
        long var6 = (var4 - field80) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field80 = var4;
        method38(-490, 5);
        if (arg0 == 1) {
            field78.method206(1);
        } else {
            field78.method206(2);
        }
        field78.method206((int) var6);
        field78.method209((arg1 << 10) + arg2);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(BI)V")
    public static final synchronized void method40(byte arg0, int arg1) {
        if (!field77) {
            return;
        }
        field81++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field80) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field80 = var2;
        method38(-490, 2);
        if (arg0 != -8) {
            return;
        }
        if (arg1 == 1) {
            field78.method206(3);
        } else {
            field78.method206(4);
        }
        field78.method206((int) var4);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(III)V")
    public static final synchronized void method41(int arg0, int arg1, int arg2) {
        if (!field77 || (arg1 < 0 || arg1 >= 789 || arg2 < 0 || arg2 >= 532)) {
            return;
        }
        long var3 = System.currentTimeMillis();
        if (arg0 >= 0 || var3 - field82 < 50L) {
            return;
        }
        field82 = var3;
        field81++;
        long var5 = (var3 - field80) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field80 = var3;
        if (arg1 - field83 < 8 && arg1 - field83 >= -8 && arg2 - field84 < 8 && arg2 - field84 >= -8) {
            method38(-490, 3);
            field78.method206(5);
            field78.method206((int) var5);
            field78.method206((arg2 + 8 - field84 << 4) + arg1 + 8 - field83);
        } else if (arg1 - field83 < 128 && arg1 - field83 >= -128 && arg2 - field84 < 128 && arg2 - field84 >= -128) {
            method38(-490, 4);
            field78.method206(6);
            field78.method206((int) var5);
            field78.method206(arg1 + 128 - field83);
            field78.method206(arg2 + 128 - field84);
        } else {
            method38(-490, 5);
            field78.method206(7);
            field78.method206((int) var5);
            field78.method209((arg2 << 10) + arg1);
        }
        field83 = arg1;
        field84 = arg2;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(II)V")
    public static final synchronized void method42(int arg0, int arg1) {
        if (!field77) {
            return;
        }
        field81++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field80) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field80 = var2;
        if (arg0 != 11306) {
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
        method38(-490, 3);
        field78.method206(8);
        field78.method206((int) var4);
        field78.method206(arg1);
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "(II)V")
    public static final synchronized void method43(int arg0, int arg1) {
        if (!field77) {
            return;
        }
        field81++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field80) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field80 = var2;
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
        method38(-490, 3);
        field78.method206(9);
        field78.method206((int) var4);
        field78.method206(arg0);
        if (arg1 < 6 || arg1 > 6) {
            field74 = !field74;
        }
    }

    @OriginalMember(owner = "e", name = "d", descriptor = "(I)V")
    public static final synchronized void method44(int arg0) {
        if (!field77) {
            return;
        }
        field81++;
        long var1 = System.currentTimeMillis();
        if (arg0 < field73 || arg0 > field73) {
            field72 = 77;
        }
        long var3 = (var1 - field80) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field80 = var1;
        method38(-490, 2);
        field78.method206(10);
        field78.method206((int) var3);
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(B)V")
    public static final synchronized void method45(byte arg0) {
        if (!field77) {
            return;
        }
        field81++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field80) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field80 = var1;
        if (arg0 != 125) {
            field74 = !field74;
        }
        method38(-490, 2);
        field78.method206(11);
        field78.method206((int) var3);
    }

    @OriginalMember(owner = "e", name = "e", descriptor = "(I)V")
    public static final synchronized void method46(int arg0) {
        if (!field77) {
            return;
        }
        field81++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field80) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field80 = var1;
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        method38(-490, 2);
        field78.method206(12);
        field78.method206((int) var3);
    }

    @OriginalMember(owner = "e", name = "f", descriptor = "(I)V")
    public static final synchronized void method47(int arg0) {
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        if (!field77) {
            return;
        }
        field81++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field80) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field80 = var2;
        method38(-490, 2);
        field78.method206(13);
        field78.method206((int) var4);
    }
}
