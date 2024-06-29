import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class82 extends class448 {

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Lff;")
    public static class9 field1152 = new class9(64);

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Lhl;")
    public static class367 field1154;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Ldi;")
    public class82 field1150;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Ldi;")
    public class82 field1151;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)V")
    public static void method586(byte arg0) {
        field1154 = null;
        int var1 = -111 % ((arg0 - 13) / 42);
        field1152 = null;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V")
    public final void method587(byte arg0) {
        if (arg0 < 28) {
            this.field1150 = null;
        }
        field1153++;
        if (this.field1150 != null) {
            this.field1150.field1151 = this.field1151;
            this.field1151.field1150 = this.field1150;
            this.field1151 = null;
            this.field1150 = null;
        }
    }
}
