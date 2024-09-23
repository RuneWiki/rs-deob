import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class InputTracking {

    @OriginalMember(owner = "f", name = "a", descriptor = "I")
    private static int field158 = 32319;

    @OriginalMember(owner = "f", name = "b", descriptor = "B")
    private static byte field159 = 9;

    @OriginalMember(owner = "f", name = "c", descriptor = "Z")
    private static boolean field160 = true;

    @OriginalMember(owner = "f", name = "f", descriptor = "Lmb;")
    public static Packet field163 = null;

    @OriginalMember(owner = "f", name = "g", descriptor = "Lmb;")
    public static Packet field164 = null;

    @OriginalMember(owner = "f", name = "d", descriptor = "I")
    private static int field161;

    @OriginalMember(owner = "f", name = "i", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "f", name = "k", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "f", name = "l", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "f", name = "h", descriptor = "J")
    public static long field165;

    @OriginalMember(owner = "f", name = "j", descriptor = "J")
    public static long field167;

    @OriginalMember(owner = "f", name = "e", descriptor = "Z")
    public static boolean field162;

    @OriginalMember(owner = "f", name = "a", descriptor = "(I)V")
    public static final synchronized void method44(int arg0) {
        field163 = Packet.method226(0, 1);
        field164 = null;
        if (arg0 != 0) {
            field160 = !field160;
        }
        field165 = System.currentTimeMillis();
        field162 = true;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(B)V")
    public static final synchronized void method45(byte arg0) {
        field162 = false;
        field163 = null;
        field164 = null;
        if (arg0 != 86) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(I)Lmb;")
    public static final synchronized Packet method46(int arg0) {
        Packet var1 = null;
        if (field164 != null && field162) {
            var1 = field164;
        }
        field164 = null;
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return var1;
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(I)Lmb;")
    public static final synchronized Packet method47(int arg0) {
        Packet var1 = null;
        if (field163 != null && field163.field736 > 0 && field162) {
            var1 = field163;
        }
        method45((byte) 86);
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var1;
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IB)V")
    private static final synchronized void method48(int arg0, byte arg1) {
        if (arg1 != -106) {
            field160 = !field160;
        }
        if (field163.field736 + arg0 >= 500) {
            Packet var2 = field163;
            field163 = Packet.method226(0, 1);
            field164 = var2;
        }
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(IIIB)V")
    public static final synchronized void method49(int arg0, int arg1, int arg2, byte arg3) {
        if (!field162 || (arg2 < 0 || arg2 >= 789 || arg0 < 0 || arg0 >= 532)) {
            return;
        }
        field166++;
        long var4 = System.currentTimeMillis();
        if (arg3 != 118) {
            field160 = !field160;
        }
        long var6 = (var4 - field165) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field165 = var4;
        method48(5, (byte) -106);
        if (arg1 == 1) {
            field163.method229(1);
        } else {
            field163.method229(2);
        }
        field163.method229((int) var6);
        field163.method232((arg0 << 10) + arg2);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(II)V")
    public static final synchronized void method50(int arg0, int arg1) {
        if (!field162) {
            return;
        }
        field166++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field165) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field165 = var2;
        method48(2, (byte) -106);
        if (arg1 != 0) {
            field160 = !field160;
        }
        if (arg0 == 1) {
            field163.method229(3);
        } else {
            field163.method229(4);
        }
        field163.method229((int) var4);
    }

    @OriginalMember(owner = "f", name = "a", descriptor = "(III)V")
    public static final synchronized void method51(int arg0, int arg1, int arg2) {
        if (!field162 || (arg2 < 0 || arg2 >= 789 || arg1 < 0 || arg1 >= 532)) {
            return;
        }
        long var3 = System.currentTimeMillis();
        if (field158 != arg0) {
            field161 = -260;
        }
        if (var3 - field167 < 50L) {
            return;
        }
        field167 = var3;
        field166++;
        long var5 = (var3 - field165) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field165 = var3;
        if (arg2 - field168 < 8 && arg2 - field168 >= -8 && arg1 - field169 < 8 && arg1 - field169 >= -8) {
            method48(3, (byte) -106);
            field163.method229(5);
            field163.method229((int) var5);
            field163.method229((arg1 + 8 - field169 << 4) + arg2 + 8 - field168);
        } else if (arg2 - field168 < 128 && arg2 - field168 >= -128 && arg1 - field169 < 128 && arg1 - field169 >= -128) {
            method48(4, (byte) -106);
            field163.method229(6);
            field163.method229((int) var5);
            field163.method229(arg2 + 128 - field168);
            field163.method229(arg1 + 128 - field169);
        } else {
            method48(5, (byte) -106);
            field163.method229(7);
            field163.method229((int) var5);
            field163.method232((arg1 << 10) + arg2);
        }
        field168 = arg2;
        field169 = arg1;
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(II)V")
    public static final synchronized void method52(int arg0, int arg1) {
        if (!field162) {
            return;
        }
        field166++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field165) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field165 = var2;
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
        method48(3, (byte) -106);
        if (arg1 == -1837) {
            field163.method229(8);
            field163.method229((int) var4);
            field163.method229(arg0);
        }
    }

    @OriginalMember(owner = "f", name = "c", descriptor = "(II)V")
    public static final synchronized void method53(int arg0, int arg1) {
        if (!field162) {
            return;
        }
        field166++;
        long var2 = System.currentTimeMillis();
        if (arg0 != 0) {
            return;
        }
        long var4 = (var2 - field165) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field165 = var2;
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
        method48(3, (byte) -106);
        field163.method229(9);
        field163.method229((int) var4);
        field163.method229(arg1);
    }

    @OriginalMember(owner = "f", name = "b", descriptor = "(B)V")
    public static final synchronized void method54(byte arg0) {
        if (!field162) {
            return;
        }
        field166++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field165) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field165 = var1;
        if (field159 == arg0) {
            boolean var5 = false;
            method48(2, (byte) -106);
            field163.method229(10);
            field163.method229((int) var3);
        }
    }

    @OriginalMember(owner = "f", name = "d", descriptor = "(I)V")
    public static final synchronized void method55(int arg0) {
        if (!field162) {
            return;
        }
        field166++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field165) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field165 = var1;
        if (arg0 <= 0) {
            field160 = !field160;
        }
        method48(2, (byte) -106);
        field163.method229(11);
        field163.method229((int) var3);
    }

    @OriginalMember(owner = "f", name = "e", descriptor = "(I)V")
    public static final synchronized void method56(int arg0) {
        if (!field162) {
            return;
        }
        field166++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field165) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field165 = var1;
        method48(2, (byte) -106);
        field163.method229(12);
        if (arg0 == 0) {
            field163.method229((int) var3);
        }
    }

    @OriginalMember(owner = "f", name = "f", descriptor = "(I)V")
    public static final synchronized void method57(int arg0) {
        if (!field162) {
            return;
        }
        field166++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field165) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field165 = var1;
        method48(2, (byte) -106);
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field163.method229(13);
        field163.method229((int) var3);
    }
}
