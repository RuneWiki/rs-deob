import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class189 {

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lhe;")
    public static class79 field2680 = new class79(5000);

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[[[B")
    public static byte[][][] field2684 = new byte[4][104][104];

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Lve;")
    public static class233 field2683;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2682;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IJ)V")
    public static final void method1211(int arg0, long arg1) {
        if (arg0 != 5676) {
            field2682 = null;
        }
        field2681++;
        if (arg1 != 0L) {
            class175.field2487++;
            class95.field1451.method522(104, 28727);
            class95.field1451.method765(arg0 + 532395636, arg1);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method1212(byte arg0) {
        field2680 = null;
        field2682 = null;
        field2684 = null;
        if (arg0 >= -127) {
            method1211(32, -106L);
        }
        field2683 = null;
    }
}
