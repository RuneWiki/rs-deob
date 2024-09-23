import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class InputTracking {

    @OriginalMember(owner = "f", name = "a", descriptor = "Z")
    private static boolean field136 = true;

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    private static int field137 = 353;

    @OriginalMember(owner = "f", name = "c", descriptor = "I")
    private static int field138 = 668;

    @OriginalMember(owner = "f", name = "e", descriptor = "Lmb;")
    public static Packet field140 = null;

    @OriginalMember(owner = "f", name = "f", descriptor = "Lmb;")
    public static Packet field141 = null;

    @OriginalMember(owner = "f", name = "h", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "f", name = "j", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "f", name = "k", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "f", name = "g", descriptor = "J")
    public static long field142;

    @OriginalMember(owner = "f", name = "i", descriptor = "J")
    public static long field144;

    @OriginalMember(owner = "f", name = "d", descriptor = "Z")
    public static boolean field139;

    @OriginalMember(owner = "f", name = "a", descriptor = "(Z)V")
    public static final synchronized void method43(boolean arg0) {
        field140 = Packet.method218(false, 1);
        field141 = null;
        if (!arg0) {
            field136 = !field136;
        }
        field142 = System.currentTimeMillis();
        field139 = true;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(I)V")
    public static final synchronized void method44(int arg0) {
        field139 = false;
        if (arg0 != 49423) {
            field136 = !field136;
        }
        field140 = null;
        field141 = null;
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(I)Lmb;")
    public static final synchronized Packet method45(int arg0) {
        Packet var1 = null;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        if (field141 != null && field139) {
            var1 = field141;
        }
        field141 = null;
        return var1;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(B)Lmb;")
    public static final synchronized Packet method46(byte arg0) {
        Packet var1 = null;
        if (arg0 != 106) {
            throw new NullPointerException();
        }
        if (field140 != null && field140.field694 > 0 && field139) {
            var1 = field140;
        }
        method44(49423);
        return var1;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IZ)V")
    private static final synchronized void method47(int arg0, boolean arg1) {
        if (arg1) {
            field136 = !field136;
        }
        if (field140.field694 + arg0 >= 500) {
            Packet var2 = field140;
            field140 = Packet.method218(false, 1);
            field141 = var2;
        }
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IIII)V")
    public static final synchronized void method48(int arg0, int arg1, int arg2, int arg3) {
        if (!field139 || (arg1 < 0 || arg1 >= 789 || arg3 < 0 || arg3 >= 532)) {
            return;
        }
        field143++;
        long var4 = System.currentTimeMillis();
        long var6 = (var4 - field142) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field142 = var4;
        if (arg0 != 4) {
            field136 = !field136;
        }
        method47(5, false);
        if (arg2 == 1) {
            field140.method221(1);
        } else {
            field140.method221(2);
        }
        field140.method221((int) var6);
        field140.method224((arg3 << 10) + arg1);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method49(boolean arg0, int arg1) {
        if (!field139) {
            return;
        }
        field143++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field142) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field142 = var2;
        method47(2, false);
        if (arg0) {
            return;
        }
        if (arg1 == 1) {
            field140.method221(3);
        } else {
            field140.method221(4);
        }
        field140.method221((int) var4);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IIZ)V")
    public static final synchronized void method50(int arg0, int arg1, boolean arg2) {
        if (arg2 || (!field139 || (arg1 < 0 || arg1 >= 789 || arg0 < 0 || arg0 >= 532))) {
            return;
        }
        long var3 = System.currentTimeMillis();
        if (var3 - field144 < 50L) {
            return;
        }
        field144 = var3;
        field143++;
        long var5 = (var3 - field142) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field142 = var3;
        if (arg1 - field145 < 8 && arg1 - field145 >= -8 && arg0 - field146 < 8 && arg0 - field146 >= -8) {
            method47(3, false);
            field140.method221(5);
            field140.method221((int) var5);
            field140.method221((arg0 + 8 - field146 << 4) + arg1 + 8 - field145);
        } else if (arg1 - field145 < 128 && arg1 - field145 >= -128 && arg0 - field146 < 128 && arg0 - field146 >= -128) {
            method47(4, false);
            field140.method221(6);
            field140.method221((int) var5);
            field140.method221(arg1 + 128 - field145);
            field140.method221(arg0 + 128 - field146);
        } else {
            method47(5, false);
            field140.method221(7);
            field140.method221((int) var5);
            field140.method224((arg0 << 10) + arg1);
        }
        field145 = arg1;
        field146 = arg0;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IB)V")
    public static final synchronized void method51(int arg0, byte arg1) {
        if (!field139) {
            return;
        }
        field143++;
        if (arg1 != 1) {
            field138 = -144;
        }
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field142) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field142 = var2;
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
        method47(3, false);
        field140.method221(8);
        field140.method221((int) var4);
        field140.method221(arg0);
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(ZI)V")
    public static final synchronized void method52(boolean arg0, int arg1) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (!field139) {
            return;
        }
        field143++;
        long var3 = System.currentTimeMillis();
        long var5 = (var3 - field142) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field142 = var3;
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
        method47(3, false);
        field140.method221(9);
        field140.method221((int) var5);
        field140.method221(arg1);
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(B)V")
    public static final synchronized void method53(byte arg0) {
        if (!field139) {
            return;
        }
        field143++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field142) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field142 = var1;
        method47(2, false);
        if (arg0 == -35) {
            field140.method221(10);
            field140.method221((int) var3);
        }
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(I)V")
    public static final synchronized void method54(int arg0) {
        if (!field139) {
            return;
        }
        field143++;
        int var1 = 34 / arg0;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field142) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field142 = var2;
        method47(2, false);
        field140.method221(11);
        field140.method221((int) var4);
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(Z)V")
    public static final synchronized void method55(boolean arg0) {
        if (!field139) {
            return;
        }
        field143++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field142) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field142 = var1;
        method47(2, false);
        if (!arg0) {
            field137 = 92;
        }
        field140.method221(12);
        field140.method221((int) var3);
    }

    @OriginalMember(owner = "f", name = "d", descriptor = "(I)V")
    public static final synchronized void method56(int arg0) {
        if (!field139) {
            return;
        }
        field143++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field142) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field142 = var1;
        method47(2, false);
        if (arg0 < 0) {
            field140.method221(13);
            field140.method221((int) var3);
        }
    }
}
