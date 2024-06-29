import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class153 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Lhr;")
    public static class57 field2228 = new class57(5, 1);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    public static final void method1106(int arg0, int arg1) {
        field2226++;
        int var2 = 100 / ((arg0 - 70) / 46);
        class394 var3 = (class394) class186.field2611.method4020((long) arg1, (byte) -82);
        if (var3 != null) {
            var3.field5657 = !var3.field5657;
            var3.field5658.method3997(-96, var3.field5657);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method1107(int arg0) {
        if (arg0 <= 32) {
            method1106(84, -25);
        }
        field2228 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V")
    public static final void method1108(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 14065) {
            method1106(75, 45);
        }
        if (arg1 == 1006) {
            class529.method3206(class621.field8831, arg2, arg0);
        } else if (arg1 == 1008) {
            class529.method3206(class339.field4670, arg2, arg0);
        } else if (arg1 == 1001) {
            class529.method3206(class78.field1128, arg2, arg0);
        } else if (arg1 == 1007) {
            class529.method3206(class217.field3244, arg2, arg0);
        } else if (arg1 == 1010) {
            class529.method3206(class279.field3913, arg2, arg0);
        }
        field2227++;
    }
}
