import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class607 {

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Z")
    public static boolean field8573 = true;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public int field8574;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public int field8575;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public int field8577;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lifa;")
    public static class388 field8572;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 5)
    public static void method3382(byte arg0) {
        field8572 = null;
        if (arg0 >= -88) {
            field8573 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 27)
    public static final void method3383(byte arg0) {
        field8571++;
        class29.field344 = null;
        class136.method761(-29365, 0, 0, 0, -1, class416.field5524, class397.field5320, 0, class399.field5336);
        if (arg0 <= -73 && class29.field344 != null) {
            class351.method1947(class29.field344, class227.field2905, class326.field4241, 0, 0, class399.field5336, -1412584499, class416.field5524, (byte) 118, class66.field694.field5011);
            class29.field344 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)Lgi;", line = 45)
    public static final class620 method3384(boolean arg0) {
        if (arg0) {
            field8568++;
            return class520.field7448.length > class559.field7966 ? class520.field7448[class559.field7966++] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILiaa;I)V", line = 60)
    private final void method3385(int arg0, class452 arg1, int arg2) {
        if (arg2 == 1) {
            this.field8575 = arg1.method2574(arg0 - 1758460282);
            this.field8577 = arg1.method2541(98);
            this.field8574 = arg1.method2541(arg0 ^ 0x1A);
        }
        field8569++;
        if (arg0 != 34) {
            this.method3386(null, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Liaa;B)V", line = 81)
    public final void method3386(class452 arg0, byte arg1) {
        field8570++;
        while (true) {
            int var3 = arg0.method2541(121);
            if (var3 == 0) {
                if (arg1 == 20) {
                    return;
                } else {
                    this.method3385(9, null, -119);
                    return;
                }
            }
            this.method3385(arg1 ^ 0x36, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Z", line = 101)
    public static final boolean method3387(int arg0, int arg1, int arg2) {
        if (arg0 == 34) {
            field8576++;
            return (arg1 & 0x22) != 0;
        } else {
            return false;
        }
    }
}
