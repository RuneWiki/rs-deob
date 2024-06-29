import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class31 extends class69 {

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "S")
    public static short field584 = 320;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "[J")
    public static long[] field590 = new long[500];

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field585 = 0;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Z")
    public static boolean field588 = true;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Lhc;")
    public static class167 field589 = new class167();

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "[Z")
    public static boolean[] field592 = new boolean[100];

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "Lmc;")
    public static class165 field594;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)Lwe;")
    public static final class75 method206(byte arg0) {
        field587++;
        class75 var1 = new class75(30);
        var1.method570(7, 15619);
        var1.method570(class65.field1111, 15619);
        var1.method570(class141.field2586 ? 1 : 0, 15619);
        var1.method570(class217.field3840 ? 1 : 0, 15619);
        var1.method570(class268.field4631 ? 1 : 0, 15619);
        var1.method570(class46.field809 ? 1 : 0, 15619);
        var1.method570(class264.field4596 ? 1 : 0, 15619);
        var1.method570(class68.field1177 ? 1 : 0, 15619);
        var1.method570(class111.field2103 ? 1 : 0, 15619);
        var1.method570(class250.field4416 ? 1 : 0, 15619);
        var1.method570(class186.field3326, 15619);
        var1.method570(class70.field1206 ? 1 : 0, 15619);
        var1.method570(class65.field1102 ? 1 : 0, 15619);
        var1.method570(field588 ? 1 : 0, 15619);
        var1.method570(class24.field396, 15619);
        var1.method570(class42.field715 ? 1 : 0, 15619);
        var1.method570(class38.field668, 15619);
        var1.method570(class205.field3685, 15619);
        int var2 = -97 / ((46 - arg0) / 58);
        var1.method570(class135.field2452, 15619);
        var1.method546((byte) 127, class140.field2504);
        var1.method546((byte) 97, class112.field2119);
        var1.method570(2, 15619);
        var1.method581(true, class170.field3030);
        var1.method570(class138.field2484, 15619);
        var1.method570(class149.field2672 ? 1 : 0, 15619);
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLha;)V")
    public static final void method207(byte arg0, class46 arg1) {
        client.method1812((byte) 55);
        if (arg0 > 51) {
            class69.method499(-2, arg1);
            field583++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
    public static void method208(byte arg0) {
        field589 = null;
        field592 = null;
        if (arg0 < -28) {
            field594 = null;
            field590 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLpi;)V")
    public static final void method209(boolean arg0, class181 arg1) {
        if (arg0) {
            method206((byte) -7);
        }
        class176.field3169 = arg1;
        field586++;
    }
}
