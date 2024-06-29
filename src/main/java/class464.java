import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class464 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lfc;")
    public static class343 field6523;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)B", line = 3)
    public static final byte method2735(int arg0, byte arg1, int arg2) {
        if (arg1 >= -99) {
            field6523 = null;
        }
        field6521++;
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V", line = 26)
    public static final void method2736(boolean arg0) {
        field6525++;
        if (class182.field2652 == -1) {
            return;
        }
        if (arg0) {
            field6523 = null;
        }
        int var1 = class56.field902.method1301(13820);
        int var2 = class56.field902.method1305(255);
        if (class8.field169 != null) {
            var1 = class8.field169.method980(77);
            var2 = class8.field169.method972(arg0);
        }
        class99.method632(0, var2, 0, 0, class371.field5248, var1, 0, class67.field987, class182.field2652, 3);
        if (class233.field3307 != null) {
            class345.method2060((byte) -125, var1, var2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 58)
    public static void method2737(int arg0) {
        if (arg0 != 2) {
            method2736(true);
        }
        field6523 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)I", line = 69)
    public static final int method2738(int arg0) {
        field6519++;
        return arg0 >= -81 ? 117 : ((class256.field3582 == 0 ? 0 : 1) << 20) + (class222.field3135 << 17) + ((class327.field4526 ? 1 : 0) << 15) + ((class312.field4249 ? 1 : 0) << 13) + ((class47.field761 & 0x3) << 11) + ((class80.field1205 ? 1 : 0) << 6) + ((class216.field3068 ? 1 : 0) << 5) + ((class67.field1000 ? 1 : 0) << 3) + ((class400.field5591 & 0x7) - (-((class460.field6481 ? 1 : 0) << 4) + -((class216.field3069 ? 1 : 0) << 8)) + ((class164.field2424 ? 1 : 0) << 9) - (-((class191.field2723 ? 1 : 0) << 10) + -((class301.field4127 ? 1 : 0) << 16))) + ((class491.field6932 == 0 ? 0 : 1) << 22) + ((class344.method2059(-22511) << 23) - (-(class181.field2629 << 25) - (((class255.field3580 ? 1 : 0) << 27) + (class47.field768 << 28)))) - (-((class255.field3578 ? 1 : 0) << 19) + -((class47.field766 == 0 ? 0 : 1) << 21));
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)I", line = 82)
    public static final int method2739(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field6523 = null;
        }
        field6524++;
        int var4 = ((arg0 & 0xFF00) * arg3 & 0xFF0000 | (arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) >>> 8;
        int var5 = 255 - arg3;
        return (((arg1 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg1 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!bd", name = "toString", descriptor = "()Ljava/lang/String;", line = 98)
    public final String toString() {
        field6520++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z[BI)I", line = 110)
    public static final int method2740(boolean arg0, byte[] arg1, int arg2) {
        field6522++;
        return arg0 ? -24 : class349.method2086(arg2, 0, (byte) 122, arg1);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(II)V", line = 122)
    public class464(int arg0, int arg1) {
    }
}
