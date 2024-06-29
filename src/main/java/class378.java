import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class378 extends class7 {

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "Ljava/lang/String;")
    private String field5702 = "null";

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "Z")
    public static boolean field5701 = false;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "I")
    public static int field5705 = 0;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "C")
    public char field5708;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "C")
    public char field5712;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
    private int field5707;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "Lbn;")
    private class256 field5711;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "Lbn;")
    public class256 field5718;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(BI)Ljava/lang/String;", line = 3)
    public final String method2403(byte arg0, int arg1) {
        field5704++;
        if (this.field5718 == null) {
            return this.field5702;
        } else if (arg0 < 28) {
            return null;
        } else {
            class249 var3 = (class249) this.field5718.method1770(-880, (long) arg1);
            return var3 == null ? this.field5702 : var3.field4069;
        }
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)V", line = 23)
    private final void method2404(byte arg0) {
        this.field5711 = new class256(this.field5718.method1763((byte) 35));
        field5719++;
        int var2 = -22 % ((28 - arg0) / 45);
        for (class249 var3 = (class249) this.field5718.method1776(true); var3 != null; var3 = (class249) this.field5718.method1773(-1)) {
            class28 var4 = new class28(var3.field4069, (int) var3.field2539);
            this.field5711.method1766(class250.method1736(128, var3.field4069), var4, 108);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 50)
    public final boolean method2405(String arg0, byte arg1) {
        field5709++;
        if (arg1 > -5) {
            return true;
        } else if (this.field5718 == null) {
            return false;
        } else {
            if (this.field5711 == null) {
                this.method2404((byte) -75);
            }
            for (class28 var3 = (class28) this.field5711.method1770(-880, class250.method1736(128, arg0)); var3 != null; var3 = (class28) this.field5711.method1771(false)) {
                if (var3.field322.equals(arg0)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljg;I)Lna;", line = 77)
    public static final class30 method2406(class186 arg0, int arg1) {
        arg0.method1322(false);
        field5717++;
        int var2 = arg0.method1322(false);
        class30 var3 = class155.method1089(arg1 - 22, var2);
        var3.field363 = arg0.method1322(false);
        int var4 = arg0.method1322(false);
        for (int var5 = arg1; var5 < var4; var5++) {
            int var6 = arg0.method1322(false);
            var3.method115(arg0, 6456, var6);
        }
        var3.method111((byte) 117);
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I", line = 119)
    public final int method2407(int arg0, int arg1) {
        if (arg0 != 0) {
            return 127;
        }
        field5703++;
        if (this.field5718 == null) {
            return this.field5707;
        } else {
            class160 var3 = (class160) this.field5718.method1770(-880, (long) arg1);
            return var3 == null ? this.field5707 : var3.field2527;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljg;II)V", line = 141)
    private final void method2408(class186 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field5712 = class394.method2488(arg1 - 1206145454, arg0.method1327((byte) -122));
        } else if (arg2 == 2) {
            this.field5708 = class394.method2488(-1206145460, arg0.method1327((byte) -92));
        } else if (arg2 == 3) {
            this.field5702 = arg0.method1270(-9970);
        } else if (arg2 == 4) {
            this.field5707 = arg0.method1284(8388607);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1272((byte) -87);
            this.field5718 = new class256(class111.method822((byte) 84, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1284(8388607);
                class161 var7;
                if (arg2 == 5) {
                    var7 = new class249(arg0.method1270(-9970));
                } else {
                    var7 = new class160(arg0.method1284(8388607));
                }
                this.field5718.method1766((long) var6, var7, 66);
            }
        }
        if (arg1 == -6) {
            field5714++;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)Z", line = 197)
    public final boolean method2409(int arg0, int arg1) {
        field5710++;
        if (this.field5718 == null) {
            return false;
        }
        if (this.field5711 == null) {
            this.method2412(102);
        }
        class160 var3 = (class160) this.field5711.method1770(-880, (long) arg1);
        if (arg0 == -6) {
            return var3 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(Ljg;I)V", line = 222)
    public final void method2410(class186 arg0, int arg1) {
        field5706++;
        if (arg1 < 114) {
            this.method2412(-65);
        }
        while (true) {
            int var3 = arg0.method1322(false);
            if (var3 == 0) {
                return;
            }
            this.method2408(arg0, -6, var3);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lmo;Lah;I)V", line = 245)
    public static final void method2411(class447 arg0, class215 arg1, int arg2) {
        class285.field4583 = arg1;
        int var3 = -91 / ((arg2 + 13) / 42);
        field5713++;
        class300.field4765 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V", line = 258)
    private final void method2412(int arg0) {
        field5716++;
        this.field5711 = new class256(this.field5718.method1763((byte) 30));
        for (class160 var2 = (class160) this.field5718.method1776(true); var2 != null; var2 = (class160) this.field5718.method1773(-1)) {
            class160 var3 = new class160((int) var2.field2539);
            this.field5711.method1766((long) var2.field2527, var3, -116);
        }
        if (arg0 <= 57) {
            this.field5718 = null;
        }
    }
}
