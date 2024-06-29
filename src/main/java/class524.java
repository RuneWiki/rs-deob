import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class524 {

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "[I")
    public static int[] field7405 = new int[25];

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "[I")
    public static int[] field7409 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "[I")
    public static int[] field7410 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "Lda;")
    public static class423 field7408;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "Ld;")
    public static class96 field7407;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lha;I)V")
    public static final void method3009(class454 arg0, int arg1) {
        field7413++;
        if (arg1 == 2 && class102.field1258 != class339.field4374.field5779 && class495.field7002 != null && class696.method3873(arg0, class339.field4374.field5779, arg1 + 20002)) {
            class102.field1258 = class339.field4374.field5779;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static void method3010(int arg0) {
        field7408 = null;
        field7409 = null;
        field7410 = null;
        field7407 = null;
        field7405 = null;
        if (arg0 != 7) {
            field7407 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)V")
    public static final void method3011(int arg0, int arg1) {
        int var2 = 103 / ((26 - arg0) / 54);
        field7406++;
        class548 var3 = class696.method3872(arg1, 7, -1633381944);
        var3.method3127((byte) 12);
    }
}
