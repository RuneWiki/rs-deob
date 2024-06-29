import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class303 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[[I")
    public static int[][] field4930 = new int[5][5000];

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
    public static int[] field4933 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4931 = 0;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[S")
    public static short[] field4938;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLjava/lang/String;)V", line = 26)
    public static final void method2164(byte arg0, String arg1) {
        class200.field3359 = arg1;
        field4932++;
        if (class59.field1164.field2658 == null) {
            return;
        }
        try {
            if (arg0 != 60) {
                field4936 = 39;
            }
            String var2 = class59.field1164.field2658.getParameter("cookieprefix");
            String var3 = class59.field1164.field2658.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class271.method1917(class218.method1520((byte) 30) + 94608000000L, 21606) + "; Max-Age=" + 94608000L;
            }
            class186.method1304(6681, class59.field1164.field2658, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Ldj;", line = 60)
    public static final class361 method2165(int arg0, int arg1) {
        class361 var2 = (class361) class296.field4832.method893((long) arg1, 122);
        field4935++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class124.field2186.method1404(arg1, 0, (byte) -64);
        class361 var4 = new class361(var3);
        if (arg0 == 15580) {
            var4.method624(class144.field2424, (int[]) null);
            class296.field4832.method888((long) arg1, var4, arg0 - 15557);
            return var4;
        } else {
            return (class361) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Lgb;", line = 92)
    public static final class191 method2166(int arg0, int arg1) {
        if (arg0 <= 12) {
            return (class191) null;
        } else {
            field4937++;
            return class205.field3416 && arg1 >= class310.field5057 && arg1 <= class282.field4619 ? class212.field3509[arg1 - class310.field5057] : null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 108)
    public static void method2167(byte arg0) {
        field4933 = null;
        if (arg0 != -50) {
            field4930 = (int[][]) ((int[][]) null);
        }
        field4930 = (int[][]) null;
        field4938 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z[B)Lje;", line = 145)
    public static final class84 method2168(boolean arg0, byte[] arg1) {
        field4939++;
        if (arg1 == null) {
            return null;
        }
        class84 var2;
        if (class241.field4016) {
            var2 = new class179(arg1, class321.field5218, class232.field3804, class9.field284, class76.field1367, class309.field5053);
        } else {
            var2 = new class361(arg1, class321.field5218, class232.field3804, class9.field284, class76.field1367, class309.field5053);
        }
        if (arg0) {
            class213.method1470(!arg0);
            return var2;
        } else {
            return (class84) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V", line = 174)
    public static final void method2169(int arg0, int arg1, int arg2) {
        if (arg2 == 32) {
            field4934++;
            class199 var3 = class173.method1231(false, 13, arg0);
            var3.method1367((byte) 126);
            var3.field3338 = arg1;
        }
    }
}
