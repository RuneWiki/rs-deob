import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class164 extends class326 {

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Lrm;")
    public static class184 field2656 = new class184(50);

    @OriginalMember(owner = "client!he", name = "M", descriptor = "Z")
    public static boolean field2659 = false;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "Lhc;")
    public static class59 field2658 = null;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "[I")
    public static int[] field2660 = new int[100];

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field2657 = 0;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V", line = 9)
    public static void method1212(int arg0) {
        if (arg0 > -24) {
            field2657 = -62;
        }
        field2656 = null;
        field2660 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[I", line = 22)
    public final int[] method103(int arg0, int arg1) {
        field2655++;
        if (arg0 >= -25) {
            field2658 = (class59) null;
        }
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            class54.method425(var3, 0, class166.field2731, class34.field508[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 48)
    public class164() {
        super(0, true);
    }
}
