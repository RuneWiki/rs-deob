import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class191 extends class235 {

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "Lfk;")
    public class23 field2663;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "J")
    public static long field2656 = -1L;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2667 = null;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2666 = "Connected to update server";

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public static int field2659 = -1;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field2662 = 0;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "[I")
    public static int[] field2658;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)V", line = 4)
    public static final void method1185(byte arg0) {
        for (int var1 = 0; var1 < class335.field4948; var1++) {
            class7 var3 = class411.method2673((byte) -87, var1);
            if (var3 != null && var3.field66 == 0) {
                class315.field4512[var1] = 0;
                class192.field2668[var1] = 0;
            }
        }
        int var2 = 109 / ((arg0 + 62) / 47);
        field2665++;
        class146.field1923 = new class143(128);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIZ)V", line = 32)
    public static final void method1186(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2657++;
        if (arg4) {
            method1189(-68, (byte) -54);
        }
        if (arg0 >= arg2) {
            for (int var5 = arg2; var5 < arg0; var5++) {
                class227.field3201[var5][arg1] = arg3;
            }
        } else {
            for (int var6 = arg0; var6 < arg2; var6++) {
                class227.field3201[var6][arg1] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)V", line = 80)
    public static void method1187(byte arg0) {
        field2667 = null;
        field2666 = null;
        int var1 = -8 % ((arg0 + 19) / 47);
        field2658 = null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)Lia;", line = 92)
    public static final class363 method1188(int arg0, int arg1) {
        field2661++;
        if (arg1 != 0) {
            method1187((byte) 124);
        }
        return (class363) class157.field2069.method954(81, (long) arg0);
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lfk;)V", line = 106)
    public class191(class23 arg0) {
        this.field2663 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V", line = 121)
    public static final void method1189(int arg0, byte arg1) {
        field2655++;
        class24 var2 = class104.field1396;
        synchronized (class104.field1396) {
            class104.field1396.method215(arg1 ^ 0x67, arg0);
        }
        class24 var3 = class197.field2822;
        synchronized (class197.field2822) {
            if (arg1 == 103) {
                class197.field2822.method215(arg1 - 103, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;", line = 145)
    public static final Class method1190(boolean arg0, String arg1) throws ClassNotFoundException {
        field2660++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg0) {
            return null;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }
}
