import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class159 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[Z")
    public static boolean[] field2535 = new boolean[100];

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[Lv;")
    public static class122[] field2536 = new class122[8];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 19)
    public static void method1285(int arg0) {
        if (arg0 != 6817) {
            field2535 = (boolean[]) null;
        }
        field2536 = null;
        field2535 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lrn;Lrn;B)I", line = 32)
    public static final int method1286(class18 arg0, class18 arg1, byte arg2) {
        field2534++;
        if (arg2 != -3) {
            method1285(-13);
        }
        int var3 = 0;
        if (arg1.method199(arg2 + 2212, class286.field4442)) {
            var3++;
        }
        if (arg1.method199(2209, class281.field4352)) {
            var3++;
        }
        if (arg1.method199(2209, class264.field4097)) {
            var3++;
        }
        if (arg0.method199(2209, class286.field4442)) {
            var3++;
        }
        if (arg0.method199(arg2 + 2212, class281.field4352)) {
            var3++;
        }
        if (arg0.method199(2209, class264.field4097)) {
            var3++;
        }
        return var3;
    }
}
