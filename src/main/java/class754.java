import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class754 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field10516 = 0;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Leda;")
    public static class14 field10518 = new class14(64);

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field10521 = -1;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field10515;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public int field10517;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field10520;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Ljava/lang/String;")
    public String field10519;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 8)
    public static void method4201(byte arg0) {
        field10518 = null;
        if (arg0 < 114) {
            field10521 = -4;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)V", line = 24)
    public static final void method4202(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1007) {
            class464.method2851(class196.field3383, arg0, arg3);
        } else if (arg2 == 1003) {
            class464.method2851(class129.field2094, arg0, arg3);
        } else if (arg2 == 1008) {
            class464.method2851(class37.field375, arg0, arg3);
        } else if (arg2 == 1012) {
            class464.method2851(class548.field7822, arg0, arg3);
        } else if (arg2 == 1002) {
            class464.method2851(class72.field1092, arg0, arg3);
        }
        if (arg1 != 23673) {
            method4202(-44, 84, 127, 95);
        }
        field10520++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lha;Z)V", line = 59)
    public static final void method4203(class544 arg0, boolean arg1) {
        field10515++;
        if (class32.field304) {
            class149.method1129(0, arg0);
        } else {
            class520.method3101(1, arg0);
        }
        if (arg1) {
            field10516 = -59;
        }
    }
}
