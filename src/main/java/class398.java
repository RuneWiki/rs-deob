import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class398 {

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
    public int field5796;

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "Ljava/lang/String;")
    public String field5799;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public static int field5793 = 0;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "I")
    public static int field5798 = -1;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "[I")
    public static int[] field5795 = new int[1];

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "[I")
    public static int[] field5797;

    @OriginalMember(owner = "client!mea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5802++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILpl;B)V")
    public static final void method2447(int arg0, class604 arg1, byte arg2) {
        field5803++;
        if (arg2 != -88) {
            return;
        }
        int var3 = -1;
        int var4 = 0;
        if (class336.field5031 < arg1.field8729) {
            class55.method644(-3, arg1);
        } else if (class336.field5031 <= arg1.field8719) {
            class99.method936(arg1, 75);
        } else {
            class388.method2393(false, arg1, (byte) -1);
            var4 = class301.field4487;
            var3 = class183.field2941;
        }
        if (arg1.field9806 < 512 || arg1.field9815 < 512 || class675.field9604 * 512 - 512 <= arg1.field9806 || arg1.field9815 >= (class218.field3316 * 512 - 512)) {
            arg1.field8760 = null;
            arg1.field8729 = 0;
            arg1.field8755 = -1;
            arg1.field8719 = 0;
            arg1.field8676 = -1;
            var4 = 0;
            arg1.field8723 = -1;
            var3 = -1;
            arg1.field9806 = arg1.field8787[0] * 512 + arg1.method3446(0) * 256;
            arg1.field9815 = arg1.field8785[0] * 512 + arg1.method3446(0) * 256;
            arg1.method3464(arg2 + 88);
        }
        if (class532.field7456 == arg1 && (arg1.field9806 < 6144 || arg1.field9815 < 6144 || arg1.field9806 >= ((class675.field9604 - 12) * 512) || arg1.field9815 >= ((class218.field3316 - 12) * 512))) {
            arg1.field8719 = 0;
            arg1.field8729 = 0;
            arg1.field8760 = null;
            arg1.field8676 = -1;
            var4 = 0;
            var3 = -1;
            arg1.field8723 = -1;
            arg1.field8755 = -1;
            arg1.field9806 = arg1.field8787[0] * 512 + arg1.method3446(0) * 256;
            arg1.field9815 = arg1.field8785[0] * 512 + arg1.method3446(0) * 256;
            arg1.method3464(0);
        }
        int var5 = class437.method2645((byte) -107, arg1);
        class337.method2172(arg1, var4, var5, 105, var3);
        class216.method1507(var3, (byte) 33, arg1);
        class182.method1334(21463, arg1);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
    public static void method2448(boolean arg0) {
        field5797 = null;
        if (!arg0) {
            method2448(true);
        }
        field5795 = null;
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class398(String arg0, int arg1) {
        this.field5796 = arg1;
        this.field5799 = arg0;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BII)Z")
    public static final boolean method2449(byte arg0, int arg1, int arg2) {
        if (arg0 == -33) {
            field5794++;
            return (arg2 & 0x8000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lan;B)V")
    public static final void method2450(class22 arg0, byte arg1) {
        field5800++;
        if (arg1 >= -69) {
            method2450(null, (byte) -12);
        }
        for (class509 var2 = (class509) class614.field8925.method1224(-2); var2 != null; var2 = (class509) class614.field8925.method1232(-2)) {
            if (var2.field7195 == arg0) {
                if (var2.field7212 != null) {
                    class50.field1184.method2073(var2.field7212);
                    var2.field7212 = null;
                }
                var2.method2588(300);
                return;
            }
        }
    }
}
