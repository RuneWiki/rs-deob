import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class InputTracking {

    @OriginalMember(owner = "f", name = "a", descriptor = "Z")
    private static boolean field140 = true;

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    private static int field141 = 800;

    @OriginalMember(owner = "f", name = "c", descriptor = "I")
    private static int field142 = -884;

    @OriginalMember(owner = "f", name = "e", descriptor = "Lmb;")
    public static Packet field144 = null;

    @OriginalMember(owner = "f", name = "f", descriptor = "Lmb;")
    public static Packet field145 = null;

    @OriginalMember(owner = "f", name = "h", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "f", name = "j", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "f", name = "k", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "f", name = "g", descriptor = "J")
    public static long field146;

    @OriginalMember(owner = "f", name = "i", descriptor = "J")
    public static long field148;

    @OriginalMember(owner = "f", name = "d", descriptor = "Z")
    public static boolean field143;

    @OriginalMember(owner = "f", name = "a", descriptor = "(Z)V")
    public static final synchronized void method43(boolean arg0) {
        if (!arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field144 = Packet.method218(527, 1);
        field145 = null;
        field146 = System.currentTimeMillis();
        field143 = true;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(B)V")
    public static final synchronized void method44(byte arg0) {
        if (arg0 == 3) {
            boolean var1 = false;
            field143 = false;
            field144 = null;
            field145 = null;
        }
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(B)Lmb;")
    public static final synchronized Packet method45(byte arg0) {
        Packet var1 = null;
        if (field145 != null && field143) {
            var1 = field145;
        }
        field145 = null;
        if (arg0 != -7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return var1;
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(Z)Lmb;")
    public static final synchronized Packet method46(boolean arg0) {
        Packet var1 = null;
        if (field144 != null && field144.field698 > 0 && field143) {
            var1 = field144;
        }
        method44((byte) 3);
        if (arg0) {
            field142 = 46;
        }
        return var1;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(ZI)V")
    private static final synchronized void method47(boolean arg0, int arg1) {
        if (!arg0) {
            field142 = 8;
        }
        if (field144.field698 + arg1 >= 500) {
            Packet var2 = field144;
            field144 = Packet.method218(527, 1);
            field145 = var2;
        }
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IBII)V")
    public static final synchronized void method48(int arg0, byte arg1, int arg2, int arg3) {
        if (!field143 || (arg2 < 0 || arg2 >= 789 || arg3 < 0 || arg3 >= 532)) {
            return;
        }
        field147++;
        long var4 = System.currentTimeMillis();
        long var6 = (var4 - field146) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field146 = var4;
        method47(true, 5);
        if (arg0 == 1) {
            field144.method221(1);
        } else {
            field144.method221(2);
        }
        field144.method221((int) var6);
        field144.method224((arg3 << 10) + arg2);
        if (arg1 == 7) {
            boolean var8 = false;
        } else {
            field140 = true;
        }
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(ZI)V")
    public static final synchronized void method49(boolean arg0, int arg1) {
        if (!field143) {
            return;
        }
        field147++;
        if (arg0) {
            field140 = true;
        }
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field146) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field146 = var2;
        method47(true, 2);
        if (arg1 == 1) {
            field144.method221(3);
        } else {
            field144.method221(4);
        }
        field144.method221((int) var4);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(ZII)V")
    public static final synchronized void method50(boolean arg0, int arg1, int arg2) {
        if (!field143 || (arg2 < 0 || arg2 >= 789 || arg1 < 0 || arg1 >= 532)) {
            return;
        }
        long var3 = System.currentTimeMillis();
        if (!arg0 || var3 - field148 < 50L) {
            return;
        }
        field148 = var3;
        field147++;
        long var5 = (var3 - field146) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field146 = var3;
        if (arg2 - field149 < 8 && arg2 - field149 >= -8 && arg1 - field150 < 8 && arg1 - field150 >= -8) {
            method47(true, 3);
            field144.method221(5);
            field144.method221((int) var5);
            field144.method221((arg1 + 8 - field150 << 4) + arg2 + 8 - field149);
        } else if (arg2 - field149 < 128 && arg2 - field149 >= -128 && arg1 - field150 < 128 && arg1 - field150 >= -128) {
            method47(true, 4);
            field144.method221(6);
            field144.method221((int) var5);
            field144.method221(arg2 + 128 - field149);
            field144.method221(arg1 + 128 - field150);
        } else {
            method47(true, 5);
            field144.method221(7);
            field144.method221((int) var5);
            field144.method224((arg1 << 10) + arg2);
        }
        field149 = arg2;
        field150 = arg1;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IB)V")
    public static final synchronized void method51(int arg0, byte arg1) {
        if (arg1 != 7) {
            return;
        }
        boolean var2 = false;
        if (!field143) {
            return;
        }
        field147++;
        long var3 = System.currentTimeMillis();
        long var5 = (var3 - field146) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field146 = var3;
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
        method47(true, 3);
        field144.method221(8);
        field144.method221((int) var5);
        field144.method221(arg0);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(II)V")
    public static final synchronized void method52(int arg0, int arg1) {
        if (!field143) {
            return;
        }
        field147++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field146) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field146 = var2;
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
        method47(true, 3);
        field144.method221(9);
        if (arg0 > 0) {
            field144.method221((int) var4);
            field144.method221(arg1);
        }
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(B)V")
    public static final synchronized void method53(byte arg0) {
        if (!field143) {
            return;
        }
        field147++;
        long var1 = System.currentTimeMillis();
        if (arg0 == 5) {
            boolean var3 = false;
        }
        long var4 = (var1 - field146) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field146 = var1;
        method47(true, 2);
        field144.method221(10);
        field144.method221((int) var4);
    }

    @OriginalMember(owner = "f", name = "d", descriptor = "(B)V")
    public static final synchronized void method54(byte arg0) {
        if (!field143) {
            return;
        }
        field147++;
        long var1 = System.currentTimeMillis();
        if (arg0 != -91) {
            return;
        }
        long var3 = (var1 - field146) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field146 = var1;
        method47(true, 2);
        field144.method221(11);
        field144.method221((int) var3);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(I)V")
    public static final synchronized void method55(int arg0) {
        if (!field143) {
            return;
        }
        field147++;
        long var1 = System.currentTimeMillis();
        if (arg0 < 6 || arg0 > 6) {
            return;
        }
        long var3 = (var1 - field146) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field146 = var1;
        method47(true, 2);
        field144.method221(12);
        field144.method221((int) var3);
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(Z)V")
    public static final synchronized void method56(boolean arg0) {
        if (!field143) {
            return;
        }
        field147++;
        long var1 = System.currentTimeMillis();
        if (!arg0) {
            field141 = 414;
        }
        long var3 = (var1 - field146) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field146 = var1;
        method47(true, 2);
        field144.method221(13);
        field144.method221((int) var3);
    }
}
