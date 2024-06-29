import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class423 {

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Llc;")
    public static class385 field6251 = new class385();

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[I")
    public static int[] field6253 = new int[1024];

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[[[Lwe;")
    public static class232[][][] field6252;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method2627(int arg0) {
        if (arg0 != 0) {
            method2628((class447) null, 34);
        }
        field6251 = null;
        field6253 = null;
        field6252 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lmo;I)I")
    public static final int method2628(class447 arg0, int arg1) {
        if (arg1 != 1024) {
            field6252 = null;
        }
        field6250++;
        int var2 = 0;
        if (arg0.method2762(1, class270.field4341)) {
            var2++;
        }
        if (arg0.method2762(arg1 - 1023, class11.field160)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
    public static final void method2629(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6248++;
        class211 var5 = class281.method1921(arg0, arg1, (byte) -111);
        var5.method1490((byte) 117);
        var5.field3379 = arg2;
        var5.field3376 = arg3;
        var5.field3383 = arg4;
    }
}
