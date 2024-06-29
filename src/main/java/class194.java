import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class194 extends RuntimeException {

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Ljava/lang/String;")
    public String field3493;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3497;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field3496 = 0;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Le;")
    public static class191 field3490 = class54.method368("null", 2047);

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method1377(int arg0) {
        field3490 = null;
        if (arg0 >= -80) {
            field3490 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)I")
    public static final int method1378(int arg0, int arg1, int arg2) {
        field3494++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else if (arg2 == 2) {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIII)V")
    public static final void method1379(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= arg4) {
            class242.method1700(7, arg3, arg4, class232.field4151[arg2], arg0);
        } else {
            class242.method1700(7, arg3, arg0, class232.field4151[arg2], arg4);
        }
        if (arg1 != 2) {
            method1377(91);
        }
        field3491++;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class194(Throwable arg0, String arg1) {
        this.field3493 = arg1;
        this.field3497 = arg0;
    }
}
