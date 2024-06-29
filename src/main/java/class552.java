import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class552 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "Z")
    public static boolean field7808 = false;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Lfc;")
    public static class262 field7810 = new class262(260);

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Lea;")
    public static class547 field7811 = new class547(7, 8);

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Lea;")
    public static class547 field7812 = new class547(79, 0);

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 9)
    public static void method3138(int arg0) {
        if (arg0 != 79) {
            method3138(-80);
        }
        field7810 = null;
        field7812 = null;
        field7811 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V", line = 23)
    public static final void method3139(Rectangle[] arg0, int arg1, int arg2) throws class353 {
        if (class392.field5553 == 1) {
            class603.field8409.method429(arg0, arg1, class435.field6103, class99.field1312);
        } else {
            class603.field8409.method429(arg0, arg1, 0, 0);
        }
        field7809++;
        if (arg2 != 260) {
            field7811 = null;
        }
    }
}
