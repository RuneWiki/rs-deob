import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class38 extends class392 {

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "Z")
    public static boolean field507 = false;

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "Lq;")
    public static class487 field510;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)V", line = 3)
    public static void method210(int arg0) {
        if (arg0 != 3943) {
            field507 = false;
        }
        field510 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIB)V", line = 20)
    public final void method211(int arg0, int arg1, int arg2, byte arg3) {
        super.field5244 = arg1;
        super.field5237 = arg2;
        super.field5246 = arg0;
        ++field508;
        if (arg3 != 79) {
            this.method212(-0.31490913F, 68);
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(IIIIIF)V", line = 34)
    public class38(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(FI)V", line = 38)
    public final void method212(float arg0, int arg1) {
        ++field509;
        if (arg1 == -25467) {
            super.field5249 = arg0;
        }
    }
}
