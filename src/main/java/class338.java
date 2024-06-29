import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class338 extends class189 {

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Lbg;")
    public class464 field4698 = new class464();

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lkt;I)I")
    public static final int method2192(class155 arg0, int arg1) {
        field4697++;
        if (arg1 != 34166) {
            field4700 = 127;
        }
        if (class597.field8397 == arg0) {
            return 5890;
        } else if (class539.field7554 == arg0) {
            return 34167;
        } else if (class240.field3203 == arg0) {
            return 34168;
        } else if (class679.field9315 == arg0) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILfp;)V")
    public static final void method2193(int arg0, class323 arg1) {
        if (arg0 != 34166) {
            method2193(-10, null);
        }
        field4699++;
        class711.field9887 = arg1;
    }
}
