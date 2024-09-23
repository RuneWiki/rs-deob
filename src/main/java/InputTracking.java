import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class InputTracking {

    @OriginalMember(owner = "f", name = "e", descriptor = "Lmb;")
    public static Packet field146 = null;

    @OriginalMember(owner = "f", name = "f", descriptor = "Lmb;")
    public static Packet field147 = null;

    @OriginalMember(owner = "f", name = "a", descriptor = "I")
    private static int field142;

    @OriginalMember(owner = "f", name = "h", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "f", name = "j", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "f", name = "k", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "f", name = "g", descriptor = "J")
    public static long field148;

    @OriginalMember(owner = "f", name = "i", descriptor = "J")
    public static long field150;

    @OriginalMember(owner = "f", name = "b", descriptor = "Z")
    private static boolean field143;

    @OriginalMember(owner = "f", name = "c", descriptor = "Z")
    private static boolean field144;

    @OriginalMember(owner = "f", name = "d", descriptor = "Z")
    public static boolean field145;

    @OriginalMember(owner = "f", name = "a", descriptor = "(I)V")
    public static final synchronized void method44(int arg0) {
        field146 = Packet.method226(1, false);
        field147 = null;
        if (arg0 < 0 || arg0 > 0) {
            field144 = !field144;
        }
        field148 = System.currentTimeMillis();
        field145 = true;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(Z)V")
    public static final synchronized void method45(boolean arg0) {
        if (!arg0) {
            field145 = false;
            field146 = null;
            field147 = null;
        }
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(Z)Lmb;")
    public static final synchronized Packet method46(boolean arg0) {
        Packet var1 = null;
        if (arg0) {
            throw new NullPointerException();
        }
        if (field147 != null && field145) {
            var1 = field147;
        }
        field147 = null;
        return var1;
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(I)Lmb;")
    public static final synchronized Packet method47(int arg0) {
        Packet var1 = null;
        if (field146 != null && field146.field710 > 0 && field145) {
            var1 = field146;
        }
        method45(field143);
        if (arg0 <= 0) {
            field144 = !field144;
        }
        return var1;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(II)V")
    private static final synchronized void method48(int arg0, int arg1) {
        if (arg0 > 0 && field146.field710 + arg1 >= 500) {
            Packet var2 = field146;
            field146 = Packet.method226(1, false);
            field147 = var2;
        }
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IIII)V")
    public static final synchronized void method49(int arg0, int arg1, int arg2, int arg3) {
        if (!field145 || (arg3 < 0 || arg3 >= 789 || arg2 < 0 || arg2 >= 532)) {
            return;
        }
        field149++;
        long var4 = System.currentTimeMillis();
        long var6 = (var4 - field148) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field148 = var4;
        method48(479, 5);
        if (arg1 != 39216) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg0 == 1) {
            field146.method229(1);
        } else {
            field146.method229(2);
        }
        field146.method229((int) var6);
        field146.method232((arg2 << 10) + arg3);
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(II)V")
    public static final synchronized void method50(int arg0, int arg1) {
        if (!field145) {
            return;
        }
        field149++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field148) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field148 = var2;
        if (arg1 != 0) {
            field143 = true;
        }
        method48(479, 2);
        if (arg0 == 1) {
            field146.method229(3);
        } else {
            field146.method229(4);
        }
        field146.method229((int) var4);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(III)V")
    public static final synchronized void method51(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (!field145 || (arg1 < 0 || arg1 >= 789 || arg0 < 0 || arg0 >= 532)) {
            return;
        }
        long var4 = System.currentTimeMillis();
        if (var4 - field150 < 50L) {
            return;
        }
        field150 = var4;
        field149++;
        long var6 = (var4 - field148) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field148 = var4;
        if (arg1 - field151 < 8 && arg1 - field151 >= -8 && arg0 - field152 < 8 && arg0 - field152 >= -8) {
            method48(479, 3);
            field146.method229(5);
            field146.method229((int) var6);
            field146.method229((arg0 + 8 - field152 << 4) + arg1 + 8 - field151);
        } else if (arg1 - field151 < 128 && arg1 - field151 >= -128 && arg0 - field152 < 128 && arg0 - field152 >= -128) {
            method48(479, 4);
            field146.method229(6);
            field146.method229((int) var6);
            field146.method229(arg1 + 128 - field151);
            field146.method229(arg0 + 128 - field152);
        } else {
            method48(479, 5);
            field146.method229(7);
            field146.method229((int) var6);
            field146.method232((arg0 << 10) + arg1);
        }
        field151 = arg1;
        field152 = arg0;
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(II)V")
    public static final synchronized void method52(int arg0, int arg1) {
        if (!field145) {
            return;
        }
        field149++;
        long var2 = System.currentTimeMillis();
        if (arg0 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        long var5 = (var2 - field148) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field148 = var2;
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
        method48(479, 3);
        field146.method229(8);
        field146.method229((int) var5);
        field146.method229(arg1);
    }

    @OriginalMember(owner = "f", name = "d", descriptor = "(II)V")
    public static final synchronized void method53(int arg0, int arg1) {
        if (!field145) {
            return;
        }
        field149++;
        long var2 = System.currentTimeMillis();
        if (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        long var5 = (var2 - field148) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field148 = var2;
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
        method48(479, 3);
        field146.method229(9);
        field146.method229((int) var5);
        field146.method229(arg0);
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(I)V")
    public static final synchronized void method54(int arg0) {
        if (!field145) {
            return;
        }
        field149++;
        long var1 = System.currentTimeMillis();
        while (arg0 >= 0) {
        }
        long var3 = (var1 - field148) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field148 = var1;
        method48(479, 2);
        field146.method229(10);
        field146.method229((int) var3);
    }

    @OriginalMember(owner = "f", name = "d", descriptor = "(I)V")
    public static final synchronized void method55(int arg0) {
        if (!field145) {
            return;
        }
        field149++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field148) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field148 = var1;
        while (arg0 >= 0) {
            field142 = 474;
        }
        method48(479, 2);
        field146.method229(11);
        field146.method229((int) var3);
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(Z)V")
    public static final synchronized void method56(boolean arg0) {
        if (!field145) {
            return;
        }
        field149++;
        long var1 = System.currentTimeMillis();
        if (arg0) {
            return;
        }
        long var3 = (var1 - field148) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field148 = var1;
        method48(479, 2);
        field146.method229(12);
        field146.method229((int) var3);
    }

    @OriginalMember(owner = "f", name = "e", descriptor = "(I)V")
    public static final synchronized void method57(int arg0) {
        if (!field145) {
            return;
        }
        field149++;
        long var1 = System.currentTimeMillis();
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        long var4 = (var1 - field148) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field148 = var1;
        method48(479, 2);
        field146.method229(13);
        field146.method229((int) var4);
    }
}
