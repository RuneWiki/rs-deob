import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class133 {

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "Leg;")
    public static class188 field2095 = new class188(50);

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Z")
    public static boolean field2098 = false;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field2099 = 0;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2101 = "wave:";

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "Lwf;")
    public static class306 field2096;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "Lrg;")
    public static class70 field2102;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 8)
    public static void method908(int arg0) {
        field2096 = null;
        if (arg0 > -38) {
            field2102 = (class70) null;
        }
        field2095 = null;
        field2101 = null;
        field2102 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)V", line = 23)
    public static final void method909(int arg0, byte arg1) {
        field2100++;
        if (arg1 > -49) {
            method908(83);
        }
        class75 var2 = class204.method1371(3, 7, arg0);
        var2.method533(22461);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZI)V", line = 45)
    public static final void method910(boolean arg0, int arg1) {
        field2094++;
        class233.method1592(true);
        if (class304.field4758 != 30 && class304.field4758 != 25) {
            return;
        }
        class190.field2877++;
        if (class190.field2877 < 50 && !arg0) {
            return;
        }
        class190.field2877 = arg1;
        if (!class269.field4144 && class308.field4851 != null) {
            class265.field4095.method2064(255, 242);
            class64.field973++;
            try {
                class308.field4851.method598(0, class265.field4095.field4679, 1, class265.field4095.field4716);
                class265.field4095.field4679 = 0;
            } catch (IOException var3) {
                class269.field4144 = true;
            }
        }
        class233.method1592(true);
    }
}
