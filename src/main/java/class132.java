import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class132 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "[I")
    public static int[] field1813 = new int[16];

    @OriginalMember(owner = "client!d", name = "e", descriptor = "[I")
    public static int[] field1815 = new int[13];

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field1814 = 1;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lus;")
    public static class1 field1816 = new class1();

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Z")
    public static boolean field1820 = false;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B[B)[B", line = 4)
    public static final byte[] method914(byte arg0, byte[] arg1) {
        field1817++;
        if (arg0 <= 29) {
            return null;
        }
        class148 var2 = new class148(arg1);
        int var3 = var2.method1032((byte) -33);
        int var4 = var2.method1026(-917302120);
        if (var4 < 0 || !(class423.field5716 == 0 || var4 <= class423.field5716)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method1060((byte) 72, var8, 0, var4);
            return var8;
        } else {
            int var5 = var2.method1026(-917302120);
            if (var5 < 0 || class423.field5716 != 0 && class423.field5716 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class534.method3223(var6, var5, arg1, var4, 9);
            } else {
                class615 var7 = class336.field4649;
                synchronized (class336.field4649) {
                    class336.field4649.method3608(var6, var2, 111);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 63)
    public static final void method915(byte arg0) {
        field1818++;
        class378.field5211 = 1;
        class84.field1208 = -1;
        long var1 = 0L;
        if (class183.field2754 == null) {
            class469.method2832(-55, 35);
            return;
        }
        class148 var3 = new class148(class641.method3705((byte) -115, class165.method1191(class183.field2754, -71)));
        long var4 = var3.method1004((byte) 112);
        class18.field162 = var3.method1004((byte) 123);
        if (arg0 != 16) {
            field1816 = null;
        }
        class263.method1665(class217.method1415(var4, arg0 ^ 0xFFFFFF95), true, -122, "");
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIB)I", line = 95)
    public static final int method916(int arg0, boolean arg1, int arg2, byte arg3) {
        field1819++;
        class38 var4 = class487.method2920(arg1, 13993, arg0);
        if (arg3 != -93) {
            field1813 = null;
        }
        if (var4 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var4.field466.length) {
            return var4.field466[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII)V", line = 117)
    public static final void method917(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1811++;
        if (arg1 == arg4) {
            class210.method1386((byte) -78, arg3, arg5, arg1, arg0);
            return;
        }
        if (arg2 != 11467) {
            method919(-52, 59, -22, (byte) 38);
        }
        if (class14.field136 <= arg3 - arg1 && class130.field1801 >= arg1 + arg3 && arg0 - arg4 >= class3.field25 && class100.field1452 >= arg0 + arg4) {
            class596.method3529(arg0, arg4, arg3, arg1, arg5, 0);
        } else {
            class473.method2848(arg4, arg5, arg0, arg3, (byte) 32, arg1);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 141)
    public static void method918(int arg0) {
        if (arg0 > -121) {
            method917(18, -113, 50, 88, 127, -97);
        }
        field1813 = null;
        field1815 = null;
        field1816 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIB)I", line = 161)
    public static final int method919(int arg0, int arg1, int arg2, byte arg3) {
        field1812++;
        if (class165.field2609 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        if (arg3 != -82) {
            method915((byte) 8);
        }
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > class146.field2125 - 1 || (class410.field5609 - 1) < var5) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class146.field2114[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class165.field2609[var6].method1233(arg2, arg1);
    }
}
