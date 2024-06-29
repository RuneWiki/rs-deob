import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class706 implements class318 {

    @OriginalMember(owner = "client!io", name = "b", descriptor = "Lwr;")
    private class240 field9942;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "Llc;")
    public static class435 field9946 = new class435(105, -1);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field9941;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field9943;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field9944;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field9945;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)Z")
    public final boolean method418(boolean arg0) {
        if (!arg0) {
            field9946 = null;
        }
        field9945++;
        return true;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
    public static final void method3956(int arg0, int arg1) {
        field9944++;
        if (arg1 == -1 || !class542.field7863[arg1]) {
            return;
        }
        class316.field4267.method2614((byte) 98, arg1);
        class600.field8524[arg1] = null;
        class313.field4239[arg1] = null;
        if (arg0 != 0) {
            field9946 = null;
        }
        class542.field7863[arg1] = false;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static void method3957(int arg0) {
        if (arg0 != 105) {
            method3956(40, -17);
        }
        field9946 = null;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lwr;)V")
    public class706(class240 arg0) {
        this.field9942 = arg0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public final void method414(byte arg0) {
        field9943++;
        if (arg0 <= 126) {
            method3956(-44, 2);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZB)V")
    public final void method678(boolean arg0, byte arg1) {
        field9941++;
        if (arg1 != -53) {
            this.field9942 = null;
        }
        if (arg0) {
            class211.field3164.method397(0, 0, class68.field1042, class565.field8187, this.field9942.field3553, 0);
        }
    }
}
