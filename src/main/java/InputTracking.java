import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class InputTracking {

    @OriginalMember(owner = "f", name = "a", descriptor = "I")
    private static int field147 = -106;

    @OriginalMember(owner = "f", name = "f", descriptor = "Lmb;")
    public static Packet field152 = null;

    @OriginalMember(owner = "f", name = "g", descriptor = "Lmb;")
    public static Packet field153 = null;

    @OriginalMember(owner = "f", name = "c", descriptor = "I")
    private static int field149;

    @OriginalMember(owner = "f", name = "i", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "f", name = "k", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "f", name = "l", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "f", name = "h", descriptor = "J")
    public static long field154;

    @OriginalMember(owner = "f", name = "j", descriptor = "J")
    public static long field156;

    @OriginalMember(owner = "f", name = "b", descriptor = "Z")
    private static boolean field148;

    @OriginalMember(owner = "f", name = "d", descriptor = "Z")
    private static boolean field150;

    @OriginalMember(owner = "f", name = "e", descriptor = "Z")
    public static boolean field151;

    @OriginalMember(owner = "f", name = "a", descriptor = "(I)V")
    public static final synchronized void method44(int arg0) {
        field152 = Packet.method226(1, (byte) 73);
        field153 = null;
        field154 = System.currentTimeMillis();
        field151 = true;
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(I)V")
    public static final synchronized void method45(int arg0) {
        field151 = false;
        field152 = null;
        if (arg0 == 32268) {
            field153 = null;
        }
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(I)Lmb;")
    public static final synchronized Packet method46(int arg0) {
        if (arg0 != -9917) {
            throw new NullPointerException();
        }
        Packet var1 = null;
        if (field153 != null && field151) {
            var1 = field153;
        }
        field153 = null;
        return var1;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(Z)Lmb;")
    public static final synchronized Packet method47(boolean arg0) {
        Packet var1 = null;
        if (arg0) {
            field149 = -402;
        }
        if (field152 != null && field152.field711 > 0 && field151) {
            var1 = field152;
        }
        method45(32268);
        return var1;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(II)V")
    private static final synchronized void method48(int arg0, int arg1) {
        if (arg0 != 44660) {
            field150 = !field150;
        }
        if (field152.field711 + arg1 >= 500) {
            Packet var2 = field152;
            field152 = Packet.method226(1, (byte) 73);
            field153 = var2;
        }
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IBII)V")
    public static final synchronized void method49(int arg0, byte arg1, int arg2, int arg3) {
        if (!field151 || (arg0 < 0 || arg0 >= 789 || arg2 < 0 || arg2 >= 532)) {
            return;
        }
        field155++;
        long var4 = System.currentTimeMillis();
        long var6 = (var4 - field154) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field154 = var4;
        method48(44660, 5);
        if (arg3 == 1) {
            field152.method229(1);
        } else {
            field152.method229(2);
        }
        field152.method229((int) var6);
        field152.method232((arg2 << 10) + arg0);
        if (arg1 == 9) {
            ;
        }
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IB)V")
    public static final synchronized void method50(int arg0, byte arg1) {
        if (!field151) {
            return;
        }
        field155++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field154) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field154 = var2;
        method48(44660, 2);
        if (arg1 == 2) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (arg0 == 1) {
            field152.method229(3);
        } else {
            field152.method229(4);
        }
        field152.method229((int) var4);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(III)V")
    public static final synchronized void method51(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (!field151 || (arg1 < 0 || arg1 >= 789 || arg2 < 0 || arg2 >= 532)) {
            return;
        }
        long var4 = System.currentTimeMillis();
        if (var4 - field156 < 50L) {
            return;
        }
        field156 = var4;
        field155++;
        long var6 = (var4 - field154) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field154 = var4;
        if (arg1 - field157 < 8 && arg1 - field157 >= -8 && arg2 - field158 < 8 && arg2 - field158 >= -8) {
            method48(44660, 3);
            field152.method229(5);
            field152.method229((int) var6);
            field152.method229((arg2 + 8 - field158 << 4) + arg1 + 8 - field157);
        } else if (arg1 - field157 < 128 && arg1 - field157 >= -128 && arg2 - field158 < 128 && arg2 - field158 >= -128) {
            method48(44660, 4);
            field152.method229(6);
            field152.method229((int) var6);
            field152.method229(arg1 + 128 - field157);
            field152.method229(arg2 + 128 - field158);
        } else {
            method48(44660, 5);
            field152.method229(7);
            field152.method229((int) var6);
            field152.method232((arg2 << 10) + arg1);
        }
        field157 = arg1;
        field158 = arg2;
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(II)V")
    public static final synchronized void method52(int arg0, int arg1) {
        if (!field151) {
            return;
        }
        field155++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field154) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field154 = var2;
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
        method48(44660, 3);
        field152.method229(8);
        int var6 = 56 / arg1;
        field152.method229((int) var4);
        field152.method229(arg0);
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(II)V")
    public static final synchronized void method53(int arg0, int arg1) {
        if (arg0 != -10167 || !field151) {
            return;
        }
        field155++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field154) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field154 = var2;
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
        method48(44660, 3);
        field152.method229(9);
        field152.method229((int) var4);
        field152.method229(arg1);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(B)V")
    public static final synchronized void method54(byte arg0) {
        if (!field151) {
            return;
        }
        field155++;
        if (arg0 == 3) {
            boolean var1 = false;
        } else {
            field147 = 149;
        }
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field154) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field154 = var2;
        method48(44660, 2);
        field152.method229(10);
        field152.method229((int) var4);
    }

    @OriginalMember(owner = "f", name = "d", descriptor = "(I)V")
    public static final synchronized void method55(int arg0) {
        if (!field151) {
            return;
        }
        field155++;
        if (arg0 != 8) {
            return;
        }
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field154) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field154 = var1;
        method48(44660, 2);
        field152.method229(11);
        field152.method229((int) var3);
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(Z)V")
    public static final synchronized void method56(boolean arg0) {
        if (!field151) {
            return;
        }
        field155++;
        long var1 = System.currentTimeMillis();
        if (arg0) {
            field148 = !field148;
        }
        long var3 = (var1 - field154) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field154 = var1;
        method48(44660, 2);
        field152.method229(12);
        field152.method229((int) var3);
    }

    @OriginalMember(owner = "f", name = "e", descriptor = "(I)V")
    public static final synchronized void method57(int arg0) {
        int var1 = 87 / arg0;
        if (!field151) {
            return;
        }
        field155++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field154) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field154 = var2;
        method48(44660, 2);
        field152.method229(13);
        field152.method229((int) var4);
    }
}
