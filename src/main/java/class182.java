import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class182 extends class168 {

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "Lcha;")
    public static class220 field2546 = new class220(2, 19);

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "[B")
    public static byte[] field2548 = new byte[2048];

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "F")
    public static float field2547;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V", line = 5)
    public static void method1241(byte arg0) {
        if (arg0 != 118) {
            method1242(0, 59);
        }
        field2546 = null;
        field2548 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)Z", line = 16)
    public static final boolean method1242(int arg0, int arg1) {
        field2545++;
        if (arg0 == -4) {
            return arg1 == 3 || arg1 == 5 || arg1 == 6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(II)V", line = 34)
    public class182(int arg0, int arg1) {
        this.field2543 = arg0;
        this.field2544 = arg1;
    }
}
