import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class198 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "Lfn;")
    public static class52 field2837 = new class52(44, 3);

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field2842 = 0;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lms;I)Lms;")
    public static final class363 method1258(class363 arg0, int arg1) {
        field2843++;
        if (arg0.field5062 != -1) {
            return class292.method1804((byte) -83, arg0.field5062);
        }
        int var2 = arg0.field5096 >>> 16;
        class293 var3 = new class293(class231.field3258);
        for (class465 var4 = (class465) var3.method1813(24004); var4 != null; var4 = (class465) var3.method1811((byte) 119)) {
            if (var4.field6527 == var2) {
                return class292.method1804((byte) -123, (int) var4.field2608);
            }
        }
        int var5 = -80 / ((arg1 - 76) / 33);
        return null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1259(byte[] arg0, byte arg1) {
        field2841++;
        class425 var2 = new class425(arg0);
        int var3 = var2.method2503(true);
        if (arg1 <= 93) {
            method1260((byte) -72);
        }
        int var4 = var2.method2502((byte) -86);
        if (var4 < 0 || !(class205.field2949 == 0 || class205.field2949 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2507(var5, (byte) 67, 0, var4);
            return var5;
        } else {
            int var6 = var2.method2502((byte) -86);
            if (var6 < 0 || !(class205.field2949 == 0 || var6 <= class205.field2949)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class313.method1892(var7, var6, arg0, var4, 9);
            } else {
                class448.field6174.method914(var2, var7, 69);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public static void method1260(byte arg0) {
        int var1 = -98 / ((-arg0 - 37) / 60);
        field2837 = null;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Lms;I)Z")
    public static final boolean method1261(class363 arg0, int arg1) {
        field2840++;
        if (class112.field1572 == arg0.field5080) {
            class60.field933 = 250;
            return true;
        } else {
            if (arg1 != -1) {
                method1259((byte[]) null, (byte) 71);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZ)Z")
    public static final boolean method1262(boolean arg0, boolean arg1) {
        field2839++;
        if (arg0) {
            field2837 = null;
        }
        boolean var2 = class338.field4636.method1096();
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class338.field4636.method1119();
        } else if (!class338.field4636.method1136()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class163.field2336 = arg1;
            class155.method941(17201, class343.field4703);
            return true;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lfc;B)V")
    public static final void method1263(class343 arg0, byte arg1) {
        class261.field3640 = 0;
        class466.field6537 = 0;
        field2838++;
        class70.field1038 = new class479();
        if (arg1 <= -62) {
            class351.field4797 = new class217[1024];
            class465.method2742(arg0, true);
            class13.method109((byte) 82, arg0);
        }
    }
}
