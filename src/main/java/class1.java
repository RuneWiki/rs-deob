import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class1 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "[Lkb;")
    public static class757[] field2 = new class757[8];

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lib;")
    public class1 field3;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lib;")
    public class1 field4;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V", line = 5)
    public final void method1(int arg0) {
        int var2 = -1 / ((arg0 - 20) / 56);
        field1++;
        if (this.field4 != null) {
            this.field4.field3 = this.field3;
            this.field3.field4 = this.field4;
            this.field3 = null;
            this.field4 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V", line = 21)
    public static void method2(int arg0) {
        field2 = null;
        if (arg0 != 8) {
            method2(57);
        }
    }
}
