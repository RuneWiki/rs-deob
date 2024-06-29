import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class170 extends class476 {

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Lkb;")
    public static class139 field2587 = new class139(1);

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Lhi;")
    public static class45 field2590 = new class45(25, -1);

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Z")
    public static boolean field2591 = false;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 3)
    public static void method1169(int arg0) {
        if (arg0 != -15676) {
            field2587 = null;
        }
        field2587 = null;
        field2590 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)B", line = 15)
    public static final byte method1170(int arg0, int arg1, int arg2) {
        field2588++;
        if (arg2 == 9) {
            return (byte) ((arg0 & arg1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(II)V", line = 41)
    public class170(int arg0, int arg1) {
        this.field2589 = arg1;
        this.field2586 = arg0;
    }
}
