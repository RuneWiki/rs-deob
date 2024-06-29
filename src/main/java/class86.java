import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class86 {

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public int field1404 = -1;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public int field1407 = -1;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "Lrb;")
    public static class283 field1403 = new class283(7, -2);

    @OriginalMember(owner = "client!np", name = "i", descriptor = "Lhi;")
    public static class45 field1408 = new class45(32, 7);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "[I")
    public int[] field1406;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method724(String arg0, byte arg1) {
        field1400++;
        class255.field3476 = arg0;
        if (class346.field4985.field2623 == null) {
            return;
        }
        if (arg1 <= 8) {
            method728(-48);
        }
        try {
            String var2 = class346.field4985.field2623.getParameter("cookieprefix");
            String var3 = class346.field4985.field2623.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class71.method569(11854, class254.method1522((byte) -51) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class344.method2076((byte) -126, class346.field4985.field2623, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lsv;IB)V")
    private final void method725(class319 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field1407 = arg0.method1844(-113);
        } else if (arg1 == 2) {
            this.field1406 = new int[arg0.method1869(-68)];
            for (int var4 = 0; var4 < this.field1406.length; var4++) {
                this.field1406[var4] = arg0.method1844(-119);
            }
        } else if (arg1 == 3) {
            this.field1404 = arg0.method1869(arg2 - 232);
        }
        if (arg2 != 122) {
            this.field1404 = 45;
        }
        field1402++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BLsv;)V")
    public final void method726(byte arg0, class319 arg1) {
        while (true) {
            int var3 = arg1.method1869(arg0 ^ 0xFFFFFFA9);
            if (var3 == 0) {
                field1405++;
                if (arg0 != 3) {
                    field1408 = null;
                    return;
                }
                return;
            }
            this.method725(arg1, var3, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method727(String arg0, int arg1) {
        field1401++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class75.method585(arg0, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class296.field3993; var3++) {
            String var4 = class169.field2579[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class75.method585(var4, -1);
            if (var5 != null && var5.equals(var2)) {
                class296.field3993--;
                for (int var6 = var3; var6 < class296.field3993; var6++) {
                    class169.field2579[var6] = class169.field2579[var6 + 1];
                    class508.field7421[var6] = class508.field7421[var6 + 1];
                    class148.field2266[var6] = class148.field2266[var6 + 1];
                    class51.field728[var6] = class51.field728[var6 + 1];
                    class76.field1077[var6] = class76.field1077[var6 + 1];
                }
                class12.field132++;
                class294.field3968 = class365.field5245;
                class274.method1602(arg1 + 15, class147.field2253);
                class17.field275.method1891(false, class515.method3047((byte) -59, arg0));
                class17.field275.method1879(32767, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static void method728(int arg0) {
        field1403 = null;
        field1408 = null;
        if (arg0 <= 99) {
            field1403 = null;
        }
    }
}
