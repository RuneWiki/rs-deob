import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class160 {

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2559 = "purple:";

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIILfh;)V", line = 8)
    private final void method1133(int arg0, int arg1, int arg2, class313 arg3) {
        field2564++;
        if (arg2 == 1) {
            this.field2563 = arg3.method2250(-1613178296);
        } else if (arg2 == 2) {
            this.field2562 = arg3.method2224(-128);
            this.field2560 = arg3.method2224(-120);
        }
        if (arg0 != 2) {
            field2555 = 97;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBI)V", line = 38)
    public static final void method1134(int arg0, byte arg1, int arg2) {
        if (arg1 != -70) {
            method1134(61, (byte) -12, 57);
        }
        field2556++;
        if (class31.method266(arg2, 1)) {
            class172.method1185(class167.field2627[arg2], 18376, arg0);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 53)
    public static void method1135(int arg0) {
        field2559 = null;
        if (arg0 != -9783) {
            method1134(-20, (byte) 6, 61);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lfh;IB)V", line = 65)
    public final void method1136(class313 arg0, int arg1, byte arg2) {
        int var4 = 29 / ((arg2 + 61) / 46);
        field2554++;
        while (true) {
            int var5 = arg0.method2224(-123);
            if (var5 == 0) {
                return;
            }
            this.method1133(2, arg1, var5, arg0);
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Lle;", line = 90)
    public final class137 method1137(int arg0) {
        class137 var2 = (class137) class123.field1826.method652((long) this.field2563, false);
        field2561++;
        if (var2 != null) {
            return var2;
        }
        class137 var3 = class203.method1383(this.field2563, arg0, class2.field6, true);
        if (var3 != null) {
            class123.field1826.method642(var3, (long) this.field2563, arg0 - 86);
        }
        return var3;
    }
}
