import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class179 extends class43 {

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "J")
    public long field2090;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lra;")
    public class179 field2085;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lra;")
    public class179 field2089;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lwr;")
    public static class450 field2092;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
    public static void method1120(boolean arg0) {
        if (arg0) {
            field2092 = null;
        }
        field2092 = null;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)Z")
    public final boolean method1121(byte arg0) {
        if (arg0 > -44) {
            return true;
        } else {
            field2087++;
            return this.field2089 != null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I")
    public static final int method1122(int arg0, int arg1, int arg2) {
        if (arg0 != -4196) {
            field2092 = null;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        field2088++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V")
    public final void method1123(byte arg0) {
        field2086++;
        if (this.field2089 == null) {
            return;
        }
        if (arg0 != -31) {
            this.field2089 = null;
        }
        this.field2089.field2085 = this.field2085;
        this.field2085.field2089 = this.field2089;
        this.field2085 = null;
        this.field2089 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Lfh;")
    public static final class167 method1124(byte arg0, int arg1) {
        field2091++;
        class365 var2 = class414.field5683;
        class167 var3;
        synchronized (class414.field5683) {
            var3 = (class167) class414.field5683.method2295((long) arg1, (byte) 74);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class320.field4301.method1794(5860, class92.method576(arg0 ^ 0xFFFFFFDB, arg1), class274.method1724((byte) 105, arg1));
        class167 var5 = new class167();
        var5.field1954 = arg1;
        if (var4 != null) {
            var5.method1064(-5207, new class242(var4));
        }
        if (arg0 != -42) {
            return null;
        }
        class365 var6 = class414.field5683;
        synchronized (class414.field5683) {
            class414.field5683.method2294(var5, (byte) 35, (long) arg1);
            return var5;
        }
    }
}
