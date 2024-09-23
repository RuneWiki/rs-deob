import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class InputTracking {

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    private static int field148 = -258;

    @OriginalMember(owner = "f", name = "c", descriptor = "I")
    private static int field149 = 164;

    @OriginalMember(owner = "f", name = "d", descriptor = "I")
    private static int field150 = 1;

    @OriginalMember(owner = "f", name = "e", descriptor = "I")
    private static int field151 = 7;

    @OriginalMember(owner = "f", name = "h", descriptor = "Lmb;")
    public static Packet field154 = null;

    @OriginalMember(owner = "f", name = "i", descriptor = "Lmb;")
    public static Packet field155 = null;

    @OriginalMember(owner = "f", name = "k", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "f", name = "m", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "f", name = "n", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "f", name = "j", descriptor = "J")
    public static long field156;

    @OriginalMember(owner = "f", name = "l", descriptor = "J")
    public static long field158;

    @OriginalMember(owner = "f", name = "a", descriptor = "Z")
    private static boolean field147;

    @OriginalMember(owner = "f", name = "f", descriptor = "Z")
    private static boolean field152;

    @OriginalMember(owner = "f", name = "g", descriptor = "Z")
    public static boolean field153;

    @OriginalMember(owner = "f", name = "a", descriptor = "(I)V")
    public static final synchronized void method44(int arg0) {
        field154 = Packet.method226(1, false);
        if (arg0 == 5) {
            field155 = null;
            field156 = System.currentTimeMillis();
            field153 = true;
        }
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(B)V")
    public static final synchronized void method45(byte arg0) {
        if (arg0 == 2) {
            field153 = false;
            field154 = null;
            field155 = null;
        }
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(Z)Lmb;")
    public static final synchronized Packet method46(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        Packet var1 = null;
        if (field155 != null && field153) {
            var1 = field155;
        }
        field155 = null;
        return var1;
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(I)Lmb;")
    public static final synchronized Packet method47(int arg0) {
        if (arg0 != 0) {
            field147 = !field147;
        }
        Packet var1 = null;
        if (field154 != null && field154.field717 > 0 && field153) {
            var1 = field154;
        }
        method45((byte) 2);
        return var1;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(ZI)V")
    private static final synchronized void method48(boolean arg0, int arg1) {
        if (!arg0) {
            field151 = 301;
        }
        if (field154.field717 + arg1 >= 500) {
            Packet var2 = field154;
            field154 = Packet.method226(1, false);
            field155 = var2;
        }
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IIII)V")
    public static final synchronized void method49(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            field149 = -385;
        }
        if (!field153 || (arg1 < 0 || arg1 >= 789 || arg3 < 0 || arg3 >= 532)) {
            return;
        }
        field157++;
        long var4 = System.currentTimeMillis();
        long var6 = (var4 - field156) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field156 = var4;
        method48(true, 5);
        if (arg2 == 1) {
            field154.method229(1);
        } else {
            field154.method229(2);
        }
        field154.method229((int) var6);
        field154.method232((arg3 << 10) + arg1);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IB)V")
    public static final synchronized void method50(int arg0, byte arg1) {
        if (!field153) {
            return;
        }
        field157++;
        long var2 = System.currentTimeMillis();
        if (arg1 == 1) {
            boolean var4 = false;
        } else {
            field149 = -481;
        }
        long var5 = (var2 - field156) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field156 = var2;
        method48(true, 2);
        if (arg0 == 1) {
            field154.method229(3);
        } else {
            field154.method229(4);
        }
        field154.method229((int) var5);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(BII)V")
    public static final synchronized void method51(byte arg0, int arg1, int arg2) {
        if (!field153 || (arg1 < 0 || arg1 >= 789 || arg2 < 0 || arg2 >= 532)) {
            return;
        }
        long var3 = System.currentTimeMillis();
        if (arg0 != 9) {
            return;
        }
        boolean var5 = false;
        if (var3 - field158 < 50L) {
            return;
        }
        field158 = var3;
        field157++;
        long var6 = (var3 - field156) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field156 = var3;
        if (arg1 - field159 < 8 && arg1 - field159 >= -8 && arg2 - field160 < 8 && arg2 - field160 >= -8) {
            method48(true, 3);
            field154.method229(5);
            field154.method229((int) var6);
            field154.method229((arg2 + 8 - field160 << 4) + arg1 + 8 - field159);
        } else if (arg1 - field159 < 128 && arg1 - field159 >= -128 && arg2 - field160 < 128 && arg2 - field160 >= -128) {
            method48(true, 4);
            field154.method229(6);
            field154.method229((int) var6);
            field154.method229(arg1 + 128 - field159);
            field154.method229(arg2 + 128 - field160);
        } else {
            method48(true, 5);
            field154.method229(7);
            field154.method229((int) var6);
            field154.method232((arg2 << 10) + arg1);
        }
        field159 = arg1;
        field160 = arg2;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(II)V")
    public static final synchronized void method52(int arg0, int arg1) {
        if (arg0 != 344) {
            field148 = -94;
        }
        if (!field153) {
            return;
        }
        field157++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field156) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field156 = var2;
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
        method48(true, 3);
        field154.method229(8);
        field154.method229((int) var4);
        field154.method229(arg1);
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(II)V")
    public static final synchronized void method53(int arg0, int arg1) {
        if (!field153) {
            return;
        }
        field157++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field156) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field156 = var2;
        if (arg0 < field150 || arg0 > field150) {
            field152 = !field152;
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
        method48(true, 3);
        field154.method229(9);
        field154.method229((int) var4);
        field154.method229(arg1);
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(B)V")
    public static final synchronized void method54(byte arg0) {
        if (!field153) {
            return;
        }
        field157++;
        long var1 = System.currentTimeMillis();
        if (arg0 != 60) {
            field148 = 162;
        }
        long var3 = (var1 - field156) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field156 = var1;
        method48(true, 2);
        field154.method229(10);
        field154.method229((int) var3);
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(I)V")
    public static final synchronized void method55(int arg0) {
        if (!field153) {
            return;
        }
        field157++;
        long var1 = System.currentTimeMillis();
        if (arg0 != 0) {
            field151 = 165;
        }
        long var3 = (var1 - field156) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field156 = var1;
        method48(true, 2);
        field154.method229(11);
        field154.method229((int) var3);
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(B)V")
    public static final synchronized void method56(byte arg0) {
        if (!field153) {
            return;
        }
        field157++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field156) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field156 = var1;
        if (arg0 != 9) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        method48(true, 2);
        field154.method229(12);
        field154.method229((int) var3);
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(Z)V")
    public static final synchronized void method57(boolean arg0) {
        if (!field153) {
            return;
        }
        field157++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field156) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field156 = var1;
        method48(true, 2);
        field154.method229(13);
        if (arg0) {
            field152 = !field152;
        }
        field154.method229((int) var3);
    }
}
