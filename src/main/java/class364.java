import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class364 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
    public static int[] field5100 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field5104 = 0;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lqj;")
    public static class296 field5108;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Z")
    public static boolean field5105;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([[IB)V", line = 5)
    public static final void method2338(int[][] arg0, byte arg1) {
        if (arg1 <= -14) {
            class84.field1286 = arg0;
            field5102++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 18)
    public static final boolean method2339(String arg0, byte arg1) {
        field5103++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        int var3 = -31 / ((36 - arg1) / 43);
        while (var2 < class157.field2221) {
            if (arg0.equalsIgnoreCase(class32.field501[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class394.field5757[var2])) {
                return true;
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)Lto;", line = 58)
    public static final class6 method2340(boolean arg0, int arg1) {
        field5106++;
        class6 var2 = (class6) class362.field5087.method1246((byte) -106, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class163.field2292.method1920(arg1, !arg0, 4);
        class6 var4 = new class6();
        if (!arg0) {
            method2340(false, -13);
        }
        if (var3 != null) {
            var4.method49(127, new class371(var3), arg1);
        }
        var4.method46(arg1, -2511);
        class362.field5087.method1247((long) arg1, (byte) 41, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLeb;)Ls;", line = 89)
    public static final class154 method2341(byte arg0, class371 arg1) {
        if (arg0 != 65) {
            method2338((int[][]) null, (byte) -108);
        }
        field5107++;
        return new class154(arg1.method2378(-1), arg1.method2378(-1), arg1.method2378(-1), arg1.method2378(-1), arg1.method2378(arg0 - 66), arg1.method2378(arg0 - 66), arg1.method2378(-1), arg1.method2378(-1), arg1.method2425(-8), arg1.method2429(0));
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V", line = 100)
    public static void method2342(byte arg0) {
        field5100 = null;
        field5108 = null;
        if (arg0 < 49) {
            method2339((String) null, (byte) 23);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)[B")
    public abstract byte[] method723(byte arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([BI)V")
    public abstract void method722(byte[] arg0, int arg1);
}
