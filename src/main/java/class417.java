import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class417 extends class598 {

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "Lbr;")
    public class196 field5585;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "Lsb;")
    public static class305 field5586 = new class305(49, 2);

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZLwn;)V", line = 3)
    public static final void method2344(boolean arg0, class236 arg1) {
        field5587++;
        if (!arg0) {
            method2344(true, null);
        }
        class273 var2 = (class273) class79.field800.method3669((long) arg1.field9434, -1);
        if (var2 == null) {
            class394.method2232(null, null, 0, arg1.field9517[0], arg1.field5166, 1480634889, arg1, arg1.field9513[0]);
        } else {
            var2.method1606(-128);
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lvj;II[B)V", line = 22)
    public class417(class422 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5585 = class254.method1503(6406, arg3, false, -82, arg1, arg2, arg0, 6406);
        this.field5585.method3148(10243, false, false);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V", line = 35)
    public static void method2345(int arg0) {
        field5586 = null;
        if (arg0 <= 21) {
            method2345(-126);
        }
    }
}
