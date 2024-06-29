import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class246 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Lgh;")
    public static class500 field3174;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1421(int arg0) {
        if (arg0 != -1232) {
            field3174 = null;
        }
        if (class465.field6456 != null) {
            class307[] var1 = class465.field6456;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class307 var3 = var1[var2];
                var3.method1750((byte) 39);
            }
        }
        field3173++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V", line = 28)
    public static void method1422(boolean arg0) {
        field3174 = null;
        if (!arg0) {
            method1421(-64);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V", line = 39)
    public static final void method1423(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class232.field2956 == 1) {
            class232.field2957[class329.field4268 / 100].method2612(class519.field7418 - 8, class568.field8060 + -8);
        }
        field3172++;
        if (arg2 != 100) {
            method1421(-26);
        }
        if (class232.field2956 == 2) {
            class232.field2957[class329.field4268 / 100 + 4].method2612(class519.field7418 - 8, class568.field8060 + -8);
        }
        class574.method3244((byte) -124);
    }
}
