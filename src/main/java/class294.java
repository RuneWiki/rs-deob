import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class294 extends class38 {

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field3994 = 0;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field3995 = 0;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V", line = 8)
    public static final void method1731(byte arg0) {
        field3992++;
        class114 var1 = class330.field4399;
        synchronized (class330.field4399) {
            class330.field4399.method606((byte) 122);
        }
        if (arg0 < 100) {
            return;
        }
        class114 var2 = class376.field5277;
        synchronized (class376.field5277) {
            class376.field5277.method606((byte) 97);
        }
        class131 var3 = class119.field1482;
        synchronized (class119.field1482) {
            class119.field1482.method706((byte) 42);
        }
    }
}
