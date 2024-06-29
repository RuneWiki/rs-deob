import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class221 extends class239 {

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "[S")
    public static short[] field3085 = new short[256];

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Ljm;")
    public static class485 field3084 = new class485(23, 11);

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V", line = 12)
    public static void method1300(int arg0) {
        if (arg0 != 10634) {
            field3084 = null;
        }
        field3084 = null;
        field3085 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILqa;)V", line = 23)
    public static final void method1301(int arg0, class162 arg1) {
        if (arg0 != 23) {
            field3085 = null;
        }
        field3086++;
        if (class9.field86) {
            class493.method2924(false, arg1);
        } else {
            class400.method2318(-10840, arg1);
        }
    }
}
