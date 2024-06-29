import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class188 extends class18 implements class265 {

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
    public static boolean field2614 = false;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Z")
    public static boolean field2616 = true;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V", line = 3)
    public final void method110(byte arg0) {
        ++field2620;
        super.field225.method2659(34963, this);
        if (arg0 != -122) {
            method1242(13);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI[B)V", line = 14)
    public final void method1241(int arg0, byte arg1, int arg2, byte[] arg3) {
        this.method109(arg3, arg0, 121);
        ++field2612;
        if (arg1 == -23) {
            this.field2618 = arg2;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lag;I[BIZ)V", line = 29)
    public class188(class469 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field2618 = arg1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)I", line = 42)
    public static final int method1242(int arg0) {
        ++field2615;
        int var1 = class226.field2934.method3928(false);
        if (var1 < class51.field636.length + arg0) {
            class226.field2934 = class51.field636[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIIII)Lfca;", line = 59)
    public static final class137 method1243(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2613;
        class137 var5 = new class137();
        var5.field1872 = arg1;
        var5.field1870 = arg4;
        class152.field2079.method3061(127, (long) arg2, var5);
        class545.method3049(arg4, -20934);
        class423 var6 = class592.method3271(arg2, (byte) -116);
        if (var6 != null) {
            class552.method3091(var6, 12618);
        }
        if (class495.field6823 != null) {
            class552.method3091(class495.field6823, 12618);
            class495.field6823 = null;
        }
        class402.method2298((byte) -46);
        if (var6 != null) {
            class583.method3218(var6, (byte) -64, !arg0);
        }
        if (arg3 < 91) {
            return null;
        } else {
            if (!arg0) {
                class656.method3741(arg4);
            }
            if (!arg0 && class164.field2349 != -1) {
                class367.method2131(class164.field2349, 1, -1156546040);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)I", line = 99)
    public final int method1244(byte arg0) {
        if (arg0 != 87) {
            field2616 = true;
        }
        ++field2617;
        return super.field228;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I", line = 110)
    public static final int method1245(int arg0) {
        if (arg0 != -18302) {
            method1245(-30);
        }
        ++field2611;
        return 46;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)J", line = 130)
    public final long method1246(byte arg0) {
        if (arg0 >= -81) {
            this.field2618 = -81;
        }
        ++field2619;
        return 0L;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)I", line = 141)
    public final int method1247(byte arg0) {
        ++field2610;
        if (arg0 != 116) {
            field2616 = false;
        }
        return this.field2618;
    }
}
