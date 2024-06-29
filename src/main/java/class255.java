import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class255 extends class357 {

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public int field3907 = -1;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public static int field3906 = 0;

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "[Lei;")
    public static class119[] field3915 = new class119[14];

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "Z")
    public static boolean field3908 = false;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
    public int field3910;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "Ljava/lang/String;")
    public String field3912;

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "Ljava/lang/String;")
    public String field3914;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIII)V", line = 15)
    public static final void method1643(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class216.field3415 = arg3;
        ++field3911;
        if (arg2 != 0) {
            method1645((byte) -40);
        }
        class372.field5455 = arg4;
        class43.field600 = arg1;
        class467.field6940 = arg0;
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)Lts;", line = 34)
    public final class376 method1644(int arg0) {
        if (arg0 != -1) {
            this.field3907 = 62;
        }
        ++field3913;
        return class91.field1813[super.field5240];
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(B)V", line = 54)
    public static void method1645(byte arg0) {
        if (arg0 > 65) {
            field3915 = null;
        }
    }
}
