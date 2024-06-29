import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class69 extends class703 {

    @OriginalMember(owner = "client!sga", name = "h", descriptor = "I")
    public static int field844 = 765;

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "Lro;")
    public static class2 field842 = new class2();

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "F")
    public static float field843;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "Ljb;")
    public static class496 field845;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V", line = 5)
    public static void method570(int arg0) {
        field842 = null;
        field845 = null;
        if (arg0 != -6937) {
            field845 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)V", line = 21)
    public static final void method571(byte arg0) {
        class491.method2782();
        field841++;
        if (arg0 != 37) {
            field842 = null;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class456.field6226[var1].method3888((byte) 12);
        }
        class586.method3207(-31736);
        class1.method1(true);
        class259.method1575(arg0 + 20465);
        System.gc();
        class341.field4807.method454();
    }
}
