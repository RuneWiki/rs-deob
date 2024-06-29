import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class501 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public int field7346;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lba;")
    public static class354 field7344;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 7)
    public static void method3052(int arg0) {
        field7344 = null;
        if (arg0 != 1) {
            field7344 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "toString", descriptor = "()Ljava/lang/String;", line = 21)
    public final String toString() {
        field7345++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 30)
    public class501(String arg0, int arg1) {
        this.field7346 = arg1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lpn;Z)V", line = 40)
    public static final void method3053(class692 arg0, boolean arg1) {
        if (!class413.field6343) {
            class401.method2578(arg0, class698.field9852);
        } else if (arg1) {
            class235.field3744[class235.field3744.length - 1].method2433(123, arg0);
        } else {
            int var2 = class644.method3732(arg0.field9700);
            int var3 = class590.field8385[2] * arg0.method406((byte) 116) / arg0.field9699;
            int var4 = class644.method3732(arg0.field9700 - var3);
            int var5 = class644.method3732(arg0.field9700 + var3);
            if (var4 == var5) {
                class235.field3744[var2].method2433(123, arg0);
            } else if (var5 - var4 == 1) {
                class235.field3744[class180.field3034 + var4].method2433(119, arg0);
            } else {
                class235.field3744[class235.field3744.length - 1].method2433(117, arg0);
            }
        }
    }
}
