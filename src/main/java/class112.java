import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class112 extends class51 {

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public int field2685 = 0;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field2684 = 0;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "Lic;")
    private static class59 field2687 = class59.method433(0, " has logged out)3");

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "Lic;")
    public static class59 field2686 = field2687;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lwf;I)I")
    public static final int method915(class159 arg0, int arg1) {
        field2692++;
        class18 var2 = (class18) class41.field1050.method35(((long) arg0.field3573 << 32) + (long) arg0.field3567, 105);
        if (var2 == null) {
            if (arg1 != -2042430560) {
                field2684 = 117;
            }
            return arg0.field3585;
        } else {
            return var2.field351;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lwd;I)V")
    public final void method916(class157 arg0, int arg1) {
        field2690++;
        if (arg1 > -26) {
            this.field2685 = 116;
        }
        while (true) {
            int var3 = arg0.method1194(false);
            if (var3 == 0) {
                return;
            }
            this.method918(-24082, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)V")
    public static void method917(byte arg0) {
        field2686 = null;
        field2687 = null;
        if (arg0 < 99) {
            method917((byte) 113);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILwd;)V")
    private final void method918(int arg0, int arg1, class157 arg2) {
        field2688++;
        if (arg1 == 2) {
            this.field2685 = arg2.method1161((byte) 60);
        }
        if (arg0 != -24082) {
            method915(null, -97);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ldd;Ldd;B)V")
    public static final void method919(class26 arg0, class26 arg1, byte arg2) {
        class125.field2828 = arg1;
        if (arg2 <= 21) {
            method915(null, -83);
        }
        class16.field310 = arg0;
        field2689++;
    }
}
