import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class273 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4256 = "Checking for updates - ";

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Lwm;")
    public static class254 field4260 = new class254(new byte[5000]);

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "J")
    public static long field4261 = 0L;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "[I")
    public static int[] field4262 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "Z")
    public static boolean field4266 = false;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "J")
    public static long field4259;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Ljd;")
    public static class95 field4264;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "[S")
    public static short[] field4263;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lth;I)V", line = 4)
    public static final void method1902(class270 arg0, int arg1) {
        field4255++;
        class239 var2 = (class239) class173.field2788.method1716(-1, class49.method374(arg0.field4218, arg1 + 11209));
        if (var2 != null) {
            if (var2.field3632 != null) {
                class322.field4961.method147(var2.field3632);
                var2.field3632 = null;
            }
            var2.method39(10717);
        }
        if (arg1 != -11210) {
            field4264 = (class95) null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)I", line = 33)
    public static final int method1903(int arg0, int arg1, int arg2) {
        field4258++;
        if (arg1 == arg2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 71)
    public static void method1905(int arg0) {
        field4256 = null;
        field4262 = null;
        field4260 = null;
        field4264 = null;
        if (arg0 == 0) {
            field4263 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZB)I", line = 89)
    public static final int method1907(boolean arg0, byte arg1) {
        field4257++;
        long var2 = class105.method789((byte) 55);
        if (arg1 != 79) {
            field4262 = (int[]) null;
        }
        for (class300 var4 = arg0 ? (class300) class272.field4251.method1706(0) : (class300) class272.field4251.method1705((byte) 124); var4 != null; var4 = (class300) class272.field4251.method1705((byte) 120)) {
            if ((var4.field4617 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field4617 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field69;
                    class154.field2330[var5] = class245.field3708[var5];
                    var4.method39(arg1 ^ 0x2992);
                    return var5;
                }
                var4.method39(arg1 + 10638);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)Lof;")
    public abstract class283 method1904(boolean arg0);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)V")
    public abstract void method1906(byte arg0, int arg1);

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(BI)I")
    public abstract int method1908(byte arg0, int arg1);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1909(int arg0, int arg1);
}
