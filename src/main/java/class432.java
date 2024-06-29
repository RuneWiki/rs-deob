import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class432 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lht;")
    public static class582 field5946 = new class582(4, 8);

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Z")
    public static boolean field5950 = false;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Ltj;")
    public static class198 field5945;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "[Lhu;")
    public static class133[] field5948;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method2489(byte arg0) {
        if (arg0 == 117) {
            field5945 = null;
            field5946 = null;
            field5948 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lda;)V")
    public static final void method2490(class60 arg0) {
        class258.field3550 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
    public static final void method2491(int arg0, int arg1) {
        class500.field6724 = arg0;
        field5947++;
        class362.field5097.method561((byte) -78);
        int var2 = 87 % ((arg1 - 56) / 56);
    }
}
