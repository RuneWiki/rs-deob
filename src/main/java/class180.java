import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class180 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Z")
    public static boolean field2203 = false;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "[J")
    public static long[] field2202 = new long[10];

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "Lbja;")
    public static class34 field2205 = new class34(0, 2, 2, 1);

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "[Lne;")
    public static class338[] field2206 = new class338[14];

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static void method1211(int arg0) {
        field2206 = null;
        if (arg0 != -26880) {
            field2203 = false;
        }
        field2205 = null;
        field2202 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILha;IIIII)V")
    public static final void method1212(int arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2204++;
        if ((class662.field9090 == null || class522.field7403 == null || class86.field1148 == null) && class208.field2470.method433((byte) -113, class784.field10833) && class208.field2470.method433((byte) -123, class342.field4297) && class208.field2470.method433((byte) -115, class699.field9509)) {
            class600 var7 = class600.method3429(class208.field2470, class342.field4297, 0);
            class522.field7403 = arg1.method640(var7, true);
            var7.method3423();
            class787.field10857 = arg1.method640(var7, true);
            class662.field9090 = arg1.method640(class600.method3429(class208.field2470, class784.field10833, 0), true);
            class600 var8 = class600.method3429(class208.field2470, class699.field9509, 0);
            class86.field1148 = arg1.method640(var8, true);
            var8.method3423();
            class648.field8843 = arg1.method640(var8, true);
        }
        if (arg4 >= -107 || class662.field9090 == null || class522.field7403 == null || class86.field1148 == null) {
            return;
        }
        int var9 = (arg2 - (class86.field1148.method1640() * 2)) / class662.field9090.method1640();
        for (int var10 = 0; var10 < var9; var10++) {
            class662.field9090.method1838(class86.field1148.method1640() + (arg0 + (class662.field9090.method1640() * var10)), arg6 - (-arg5 - -class662.field9090.method1637()));
        }
        int var11 = (arg5 - arg3 - class86.field1148.method1637()) / class522.field7403.method1637();
        for (int var12 = 0; var12 < var11; var12++) {
            class522.field7403.method1838(arg0, arg3 + arg6 + var12 * class522.field7403.method1637());
            class787.field10857.method1838((arg0 + arg2) - class787.field10857.method1640(), var12 * class522.field7403.method1637() + (arg6 - -arg3));
        }
        class86.field1148.method1838(arg0, arg5 + arg6 - class86.field1148.method1637());
        class648.field8843.method1838((arg0 + arg2) - class86.field1148.method1640(), -class86.field1148.method1637() + (arg6 - -arg5));
    }
}
