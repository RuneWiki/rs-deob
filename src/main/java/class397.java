import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class397 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    private int field5555;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    private int field5556;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    private int field5551;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    private int field5563;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    private int field5564;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    private int field5550;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    private int field5560;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    private int field5554;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    private int field5553;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    private int field5558;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lqe;")
    public static class465 field5557 = new class465(87, 3);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lth;")
    public static class593 field5562;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 8)
    public static void method2460(int arg0) {
        field5557 = null;
        field5562 = null;
        if (arg0 != 65280) {
            method2465((byte) 99, 26);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBII)Z", line = 19)
    public final boolean method2461(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 75) {
            field5557 = null;
        }
        field5561++;
        if (arg0 < this.field5550 || this.field5564 < arg0) {
            return false;
        } else if (arg2 < this.field5554 || arg2 > this.field5553) {
            return false;
        } else if (this.field5560 <= arg3 && this.field5558 >= arg3) {
            int var5 = arg0 - this.field5556;
            int var6 = arg3 - this.field5555;
            return this.field5563 > (var5 * var5 + var6 * var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIIII)V", line = 45)
    public final void method2462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field5556 = arg4;
        field5552++;
        this.field5555 = arg5;
        this.field5551 = arg0;
        this.field5563 = arg6 * arg6;
        this.field5564 = this.field5556 + arg3;
        this.field5553 = this.field5551 + arg8;
        this.field5558 = this.field5555 + arg1;
        this.field5554 = this.field5551 + arg2;
        if (arg10 != 16711935) {
            this.field5555 = -42;
        }
        this.field5550 = this.field5556 + arg9;
        this.field5560 = this.field5555 + arg7;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)I", line = 67)
    public static final int method2463(int arg0, int arg1, byte arg2) {
        field5559++;
        if (arg2 == -10) {
            int var3 = arg0 >>> 24;
            int var4 = ((arg0 & 0xFF00) * var3 & 0xFF0000 | (arg0 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
            int var5 = 255 - var3;
            return (((arg1 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg1 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 85)
    public static final void method2464(int arg0, String arg1) {
        field5565++;
        class611.field8844 = arg1;
        if (class476.field6812 == null) {
            return;
        }
        try {
            String var2 = class476.field6812.getParameter("cookieprefix");
            if (arg0 == 0) {
                String var3 = class476.field6812.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg1.length() == 0) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class342.method2167(arg0 + 43, class742.method4128(1) + 94608000000L) + "; Max-Age=" + 94608000L;
                }
                class101.method891(28521, class476.field6812, "document.cookie=\"" + var5 + "\"");
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)V", line = 120)
    public static final void method2465(byte arg0, int arg1) {
        field5549++;
        if (arg0 >= -74) {
            field5557 = null;
        }
        if (arg1 != -1 && class525.field7464[arg1]) {
            class127.field1923.method1480(arg1, (byte) 31);
            class117.field1849[arg1] = null;
            class463.field6662[arg1] = null;
            class525.field7464[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIILht;)V", line = 148)
    public static final void method2466(int arg0, int arg1, int arg2, class578 arg3) {
        class416 var4 = class442.method2653(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field5846 = arg3;
        int var5 = class4.field56 == class138.field2153 ? 1 : 0;
        if (arg3.method395((byte) 84)) {
            if (arg3.method399((byte) 38)) {
                class319.field4524[var5][class444.field6176[var5]++] = arg3;
                return;
            }
            class307.field4351[var5][class189.field2729[var5]++] = arg3;
            class70.field1267 = true;
            return;
        }
        class598.field8718[var5][class579.field8176[var5]++] = arg3;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 176)
    public class397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5555 = arg2;
        this.field5556 = arg0;
        this.field5551 = arg1;
        this.field5563 = arg3 * arg3;
        this.field5564 = this.field5556 + arg5;
        this.field5550 = this.field5556 + arg4;
        this.field5560 = this.field5555 + arg8;
        this.field5554 = this.field5551 + arg6;
        this.field5553 = this.field5551 + arg7;
        this.field5558 = this.field5555 + arg9;
    }
}
