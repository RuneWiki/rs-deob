import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class class301 {

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4042 = null;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "[B")
    public static byte[] field4044 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4048 = "Allocated memory";

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "Lrk;")
    public static class427 field4045;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V", line = 8)
    public static void method1928(byte arg0) {
        field4045 = null;
        field4044 = null;
        field4048 = null;
        field4042 = null;
        int var1 = -50 % ((-arg0 - 27) / 40);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(CZ)Z", line = 27)
    public static final boolean method1929(char arg0, boolean arg1) {
        field4043++;
        if (arg1) {
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)V", line = 42)
    public static final void method1931(boolean arg0, int arg1) {
        field4046++;
        if (arg0) {
            class450 var2 = class59.method540(3, arg1, 1000);
            var2.method2798(-664528978);
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V", line = 59)
    public static final void method1932(byte arg0) {
        field4049++;
        if (!class3.field16) {
            return;
        }
        class139 var1 = class44.method411(class328.field4456, true, class418.field5864);
        if (var1 != null && var1.field2012 != null) {
            class361 var2 = new class361();
            var2.field4903 = var1;
            var2.field4905 = var1.field2012;
            class18.method267(var2);
        }
        class124.field1733 = -1;
        int var3 = 6 % ((-arg0 - 82) / 43);
        class3.field16 = false;
        class10.method52(var1, (byte) -89);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lbi;B)Lbi;", line = 91)
    public static final class139 method1933(class139 arg0, byte arg1) {
        field4047++;
        if (arg0.field2042 != -1) {
            return class10.method57(65535, arg0.field2042);
        }
        int var2 = arg0.field1968 >>> 16;
        class160 var3 = new class160(class204.field2865);
        class64 var4 = (class64) var3.method1206(12274);
        if (arg1 > -31) {
            method1933((class139) null, (byte) 48);
        }
        while (var4 != null) {
            if (var4.field976 == var2) {
                return class10.method57(65535, (int) var4.field5349);
            }
            var4 = (class64) var3.method1205(0);
        }
        return null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lgn;B)Lgn;")
    public abstract class172 method1930(class172 arg0, byte arg1);
}
