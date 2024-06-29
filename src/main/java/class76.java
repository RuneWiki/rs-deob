import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class76 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lew;")
    public static class683 field1104 = new class683();

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field1108;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 8)
    public static void method636(byte arg0) {
        field1104 = null;
        field1108 = null;
        if (arg0 >= -121) {
            method637(-61);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 19)
    public static final void method637(int arg0) {
        field1106++;
        for (class394 var1 = (class394) class186.field2611.method4023((byte) -89); var1 != null; var1 = (class394) class186.field2611.method4021((byte) 80)) {
            class405.method2463((byte) -113, var1.field5659);
        }
        if (arg0 < 66) {
            method636((byte) -39);
        }
    }
}
