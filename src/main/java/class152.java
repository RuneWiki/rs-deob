import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class152 extends class69 {

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "J")
    public long field2699;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lwf;")
    public static class16 field2698 = new class16(50);

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "[I")
    public static int[] field2703 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Le;")
    public static class155 field2702;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lfa;")
    public static class211 field2701;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "[Lhh;")
    public static class263[] field2700;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static void method1115(int arg0) {
        field2702 = null;
        field2703 = null;
        field2698 = null;
        field2700 = null;
        if (arg0 != 0) {
            field2703 = null;
        }
        field2701 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class152() {
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(J)V")
    public class152(long arg0) {
        this.field2699 = arg0;
    }
}
