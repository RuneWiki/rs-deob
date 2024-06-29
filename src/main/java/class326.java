import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class326 implements class716 {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lie;")
    private class6 field4190;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field4189 = -1;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field4187 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lria;III)V", line = 5)
    public static final void method1901(class288 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            method1901(null, -15, 72, -18);
        }
        class185.field2559 = arg2;
        class753.field10505 = arg0;
        field4186++;
        class82.field1124 = arg3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZB)V", line = 18)
    public final void method368(boolean arg0, byte arg1) {
        if (arg1 > -57) {
            method1901(null, 65, -27, -42);
        }
        field4188++;
        if (arg0) {
            class386.field4930.method528(0, 0, class356.field4586, class466.field6263, this.field4190.field57, 0);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Z", line = 33)
    public final boolean method369(int arg0) {
        field4184++;
        if (arg0 != 11107) {
            field4187 = 15;
        }
        return true;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 44)
    public final void method366(int arg0) {
        field4185++;
        if (arg0 != 18295) {
            field4189 = -89;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lie;)V", line = 64)
    public class326(class6 arg0) {
        this.field4190 = arg0;
    }
}
