import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class InputTracking {

    @OriginalMember(owner = "f", name = "a", descriptor = "B")
    private static byte field145 = 54;

    @OriginalMember(owner = "f", name = "b", descriptor = "Z")
    private static boolean field146 = true;

    @OriginalMember(owner = "f", name = "c", descriptor = "I")
    private static int field147 = 398;

    @OriginalMember(owner = "f", name = "d", descriptor = "I")
    private static int field148 = 35546;

    @OriginalMember(owner = "f", name = "f", descriptor = "Lmb;")
    public static Packet field150 = null;

    @OriginalMember(owner = "f", name = "g", descriptor = "Lmb;")
    public static Packet field151 = null;

    @OriginalMember(owner = "f", name = "i", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "f", name = "k", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "f", name = "l", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "f", name = "h", descriptor = "J")
    public static long field152;

    @OriginalMember(owner = "f", name = "j", descriptor = "J")
    public static long field154;

    @OriginalMember(owner = "f", name = "e", descriptor = "Z")
    public static boolean field149;

    @OriginalMember(owner = "f", name = "a", descriptor = "(I)V")
    public static final synchronized void method44(int arg0) {
        field150 = Packet.method225(5, 1);
        int var1 = 79 / arg0;
        field151 = null;
        field152 = System.currentTimeMillis();
        field149 = true;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(B)V")
    public static final synchronized void method45(byte arg0) {
        field149 = false;
        field150 = null;
        if (field145 == arg0) {
            field151 = null;
        }
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(I)Lmb;")
    public static final synchronized Packet method46(int arg0) {
        if (arg0 != 3) {
            field148 = -97;
        }
        Packet var1 = null;
        if (field151 != null && field149) {
            var1 = field151;
        }
        field151 = null;
        return var1;
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(I)Lmb;")
    public static final synchronized Packet method47(int arg0) {
        Packet var1 = null;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (field150 != null && field150.field719 > 0 && field149) {
            var1 = field150;
        }
        method45(field145);
        return var1;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(ZI)V")
    private static final synchronized void method48(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (field150.field719 + arg1 >= 500) {
            Packet var3 = field150;
            field150 = Packet.method225(5, 1);
            field151 = var3;
        }
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IZII)V")
    public static final synchronized void method49(int arg0, boolean arg1, int arg2, int arg3) {
        if (!field149 || (arg0 < 0 || arg0 >= 789 || arg2 < 0 || arg2 >= 532)) {
            return;
        }
        field153++;
        long var4 = System.currentTimeMillis();
        long var6 = (var4 - field152) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field152 = var4;
        method48(field146, 5);
        if (!arg1) {
            field147 = -235;
        }
        if (arg3 == 1) {
            field150.method228(1);
        } else {
            field150.method228(2);
        }
        field150.method228((int) var6);
        field150.method231((arg2 << 10) + arg0);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(II)V")
    public static final synchronized void method50(int arg0, int arg1) {
        if (!field149) {
            return;
        }
        field153++;
        int var2 = 0 / arg0;
        long var3 = System.currentTimeMillis();
        long var5 = (var3 - field152) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field152 = var3;
        method48(field146, 2);
        if (arg1 == 1) {
            field150.method228(3);
        } else {
            field150.method228(4);
        }
        field150.method228((int) var5);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(III)V")
    public static final synchronized void method51(int arg0, int arg1, int arg2) {
        if (arg1 != -7388) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (!field149 || (arg0 < 0 || arg0 >= 789 || arg2 < 0 || arg2 >= 532)) {
            return;
        }
        long var4 = System.currentTimeMillis();
        if (var4 - field154 < 50L) {
            return;
        }
        field154 = var4;
        field153++;
        long var6 = (var4 - field152) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field152 = var4;
        if (arg0 - field155 < 8 && arg0 - field155 >= -8 && arg2 - field156 < 8 && arg2 - field156 >= -8) {
            method48(field146, 3);
            field150.method228(5);
            field150.method228((int) var6);
            field150.method228((arg2 + 8 - field156 << 4) + arg0 + 8 - field155);
        } else if (arg0 - field155 < 128 && arg0 - field155 >= -128 && arg2 - field156 < 128 && arg2 - field156 >= -128) {
            method48(field146, 4);
            field150.method228(6);
            field150.method228((int) var6);
            field150.method228(arg0 + 128 - field155);
            field150.method228(arg2 + 128 - field156);
        } else {
            method48(field146, 5);
            field150.method228(7);
            field150.method228((int) var6);
            field150.method231((arg2 << 10) + arg0);
        }
        field155 = arg0;
        field156 = arg2;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IB)V")
    public static final synchronized void method52(int arg0, byte arg1) {
        if (!field149) {
            return;
        }
        field153++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field152) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field152 = var2;
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
        method48(field146, 3);
        if (arg1 != 6) {
            field146 = !field146;
        }
        field150.method228(8);
        field150.method228((int) var4);
        field150.method228(arg0);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method53(int arg0, boolean arg1) {
        if (!field149) {
            return;
        }
        field153++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field152) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field152 = var2;
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
        method48(field146, 3);
        field150.method228(9);
        if (arg1) {
            field150.method228((int) var4);
            field150.method228(arg0);
        }
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(B)V")
    public static final synchronized void method54(byte arg0) {
        if (!field149) {
            return;
        }
        field153++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field152) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field152 = var1;
        method48(field146, 2);
        if (arg0 != 4) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field150.method228(10);
        field150.method228((int) var3);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(Z)V")
    public static final synchronized void method55(boolean arg0) {
        if (!field149) {
            return;
        }
        field153++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field152) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field152 = var1;
        method48(field146, 2);
        if (arg0) {
            field150.method228(11);
            field150.method228((int) var3);
        }
    }

    @OriginalMember(owner = "f", name = "d", descriptor = "(I)V")
    public static final synchronized void method56(int arg0) {
        if (!field149) {
            return;
        }
        field153++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field152) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field152 = var1;
        method48(field146, 2);
        if (arg0 == 19919) {
            field150.method228(12);
            field150.method228((int) var3);
        }
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(B)V")
    public static final synchronized void method57(byte arg0) {
        if (!field149) {
            return;
        }
        field153++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field152) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field152 = var1;
        method48(field146, 2);
        field150.method228(13);
        if (arg0 == 6) {
            boolean var5 = false;
            field150.method228((int) var3);
        }
    }
}
