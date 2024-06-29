import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class465 {

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "Lgn;")
    public static class475 field6731 = new class475(28, 3);

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public static int field6737 = -1;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2722(int arg0, byte arg1, int arg2) {
        if (arg1 < 126) {
            method2723(-13);
        }
        field6732++;
        return class339.method2059(arg0, arg2, -1) | (arg0 & 0x70000) != 0 || class466.method2729(arg0, arg2, (byte) -93);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)I")
    public static final int method2723(int arg0) {
        field6735++;
        return arg0 < 26 ? 14 : 6;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2724(int arg0, String arg1) {
        if (class388.field5759 == null) {
            class146.method910(arg0 ^ 0x66BE);
        }
        field6736++;
        String[] var2 = class452.method2628(arg1, 0, '\n');
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class251.field3614; var4 > 0; var4--) {
                class388.field5759[var4] = class388.field5759[var4 - 1];
            }
            class388.field5759[0] = var2[var3];
            if (class388.field5759.length - 1 > class251.field3614) {
                if (class81.field1124 > 0) {
                    class81.field1124++;
                }
                class251.field3614++;
            }
        }
        if (arg0 != -26334) {
            method2723(58);
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
    public static void method2725(int arg0) {
        field6731 = null;
        if (arg0 != 0) {
            method2723(-91);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lhe;ILeq;)V")
    public static final void method2726(class239 arg0, int arg1, class134 arg2) {
        field6733++;
        if (class308.field4472) {
            return;
        }
        arg2.method811(0);
        if (arg1 >= -96) {
            field6731 = null;
        }
        class490.field7494 = arg2.method804(class328.method1970(arg0, class46.field695), true);
        class490.field7494.method1845((class223.field3156 - class490.field7494.method87()) / 2, (class207.field2874 - class490.field7494.method94()) / 2);
        class138.field1806 = arg2.method804(class328.method1970(arg0, class122.field1598), true);
        class138.field1806.method1845((class223.field3156 - class138.field1806.method87()) / 2, 18);
        class308.field4472 = true;
    }
}
