import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class InputTracking {

    @OriginalMember(owner = "f", name = "a", descriptor = "Z")
    private static boolean field146 = true;

    @OriginalMember(owner = "f", name = "f", descriptor = "Lmb;")
    public static Packet field151 = null;

    @OriginalMember(owner = "f", name = "g", descriptor = "Lmb;")
    public static Packet field152 = null;

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    private static int field147;

    @OriginalMember(owner = "f", name = "d", descriptor = "I")
    private static int field149;

    @OriginalMember(owner = "f", name = "i", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "f", name = "k", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "f", name = "l", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "f", name = "h", descriptor = "J")
    public static long field153;

    @OriginalMember(owner = "f", name = "j", descriptor = "J")
    public static long field155;

    @OriginalMember(owner = "f", name = "c", descriptor = "Z")
    private static boolean field148;

    @OriginalMember(owner = "f", name = "e", descriptor = "Z")
    public static boolean field150;

    @OriginalMember(owner = "f", name = "a", descriptor = "(I)V")
    public static final synchronized void method44(int arg0) {
        field151 = Packet.method225(false, 1);
        field152 = null;
        field153 = System.currentTimeMillis();
        if (arg0 == 7) {
            field150 = true;
        }
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(Z)V")
    public static final synchronized void method45(boolean arg0) {
        field150 = false;
        field151 = null;
        field152 = null;
        if (!arg0) {
            field146 = !field146;
        }
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(I)Lmb;")
    public static final synchronized Packet method46(int arg0) {
        Packet var1 = null;
        if (field152 != null && field150) {
            var1 = field152;
        }
        field152 = null;
        if (arg0 != 43763) {
            throw new NullPointerException();
        }
        return var1;
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(I)Lmb;")
    public static final synchronized Packet method47(int arg0) {
        Packet var1 = null;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        if (field151 != null && field151.field713 > 0 && field150) {
            var1 = field151;
        }
        method45(true);
        return var1;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IZ)V")
    private static final synchronized void method48(int arg0, boolean arg1) {
        if (!arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (field151.field713 + arg0 >= 500) {
            Packet var3 = field151;
            field151 = Packet.method225(false, 1);
            field152 = var3;
        }
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IIII)V")
    public static final synchronized void method49(int arg0, int arg1, int arg2, int arg3) {
        if (!field150 || (arg2 < 0 || arg2 >= 789 || arg0 < 0 || arg0 >= 532)) {
            return;
        }
        field154++;
        long var4 = System.currentTimeMillis();
        long var6 = (var4 - field153) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field153 = var4;
        if (arg3 != -241) {
            field149 = -1;
        }
        method48(5, true);
        if (arg1 == 1) {
            field151.method228(1);
        } else {
            field151.method228(2);
        }
        field151.method228((int) var6);
        field151.method231((arg0 << 10) + arg2);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(II)V")
    public static final synchronized void method50(int arg0, int arg1) {
        if (!field150) {
            return;
        }
        field154++;
        if (arg0 != 0) {
            return;
        }
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field153) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field153 = var2;
        method48(2, true);
        if (arg1 == 1) {
            field151.method228(3);
        } else {
            field151.method228(4);
        }
        field151.method228((int) var4);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(ZII)V")
    public static final synchronized void method51(boolean arg0, int arg1, int arg2) {
        if (!field150 || (arg1 < 0 || arg1 >= 789 || arg2 < 0 || arg2 >= 532)) {
            return;
        }
        long var3 = System.currentTimeMillis();
        if (!arg0) {
            field149 = 79;
        }
        if (var3 - field155 < 50L) {
            return;
        }
        field155 = var3;
        field154++;
        long var5 = (var3 - field153) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field153 = var3;
        if (arg1 - field156 < 8 && arg1 - field156 >= -8 && arg2 - field157 < 8 && arg2 - field157 >= -8) {
            method48(3, true);
            field151.method228(5);
            field151.method228((int) var5);
            field151.method228((arg2 + 8 - field157 << 4) + arg1 + 8 - field156);
        } else if (arg1 - field156 < 128 && arg1 - field156 >= -128 && arg2 - field157 < 128 && arg2 - field157 >= -128) {
            method48(4, true);
            field151.method228(6);
            field151.method228((int) var5);
            field151.method228(arg1 + 128 - field156);
            field151.method228(arg2 + 128 - field157);
        } else {
            method48(5, true);
            field151.method228(7);
            field151.method228((int) var5);
            field151.method231((arg2 << 10) + arg1);
        }
        field156 = arg1;
        field157 = arg2;
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(IZ)V")
    public static final synchronized void method52(int arg0, boolean arg1) {
        if (!field150) {
            return;
        }
        field154++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field153) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field153 = var2;
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
        method48(3, true);
        field151.method228(8);
        field151.method228((int) var4);
        field151.method228(arg0);
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(II)V")
    public static final synchronized void method53(int arg0, int arg1) {
        if (!field150) {
            return;
        }
        field154++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field153) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field153 = var2;
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
        method48(3, true);
        field151.method228(9);
        field151.method228((int) var4);
        field151.method228(arg1);
        if (arg0 < field147 || arg0 > field147) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "f", name = "d", descriptor = "(I)V")
    public static final synchronized void method54(int arg0) {
        if (!field150) {
            return;
        }
        field154++;
        if (arg0 >= 0) {
            return;
        }
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field153) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field153 = var1;
        method48(2, true);
        field151.method228(10);
        field151.method228((int) var3);
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(Z)V")
    public static final synchronized void method55(boolean arg0) {
        if (!field150) {
            return;
        }
        field154++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field153) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field153 = var1;
        if (!arg0) {
            field146 = !field146;
        }
        method48(2, true);
        field151.method228(11);
        field151.method228((int) var3);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(B)V")
    public static final synchronized void method56(byte arg0) {
        if (!field150) {
            return;
        }
        field154++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field153) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field153 = var1;
        method48(2, true);
        field151.method228(12);
        if (arg0 != 73) {
            field148 = !field148;
        }
        field151.method228((int) var3);
    }

    @OriginalMember(owner = "f", name = "e", descriptor = "(I)V")
    public static final synchronized void method57(int arg0) {
        if (arg0 >= 0 || !field150) {
            return;
        }
        field154++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field153) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field153 = var1;
        method48(2, true);
        field151.method228(13);
        field151.method228((int) var3);
    }
}
