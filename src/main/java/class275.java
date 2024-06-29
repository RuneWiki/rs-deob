import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class275 {

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Lrga;")
    public static class280 field3455 = new class280(56, -1);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Lha;")
    public class119 field3457;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Lda;")
    public class474 field3456;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)V")
    public static final void method1570(int arg0, byte arg1) {
        field3454++;
        if (arg1 <= -93) {
            class198.field2501 = arg0;
            class330.field4217 = -1;
            class91.field1281 = -1;
            class28.method189(-2488);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method1571(byte arg0) {
        field3455 = null;
        int var1 = 54 % ((arg0 - 11) / 42);
    }
}
