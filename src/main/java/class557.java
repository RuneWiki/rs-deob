import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class557 extends class113 {

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
    public static int field7751 = -1;

    @OriginalMember(owner = "client!jw", name = "p", descriptor = "Lok;")
    public static class257 field7753 = new class257();

    @OriginalMember(owner = "client!jw", name = "q", descriptor = "Lhg;")
    public static class693 field7754 = new class693(31, 3);

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lnd;Lnd;Lih;)V", line = 4)
    public class557(class547 arg0, class547 arg1, class702 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZBII)V", line = 14)
    public final void method891(boolean arg0, byte arg1, int arg2, int arg3) {
        ++field7750;
        if (arg1 >= -77) {
            this.method892(true, 100, true, 62);
        }
        int var5 = this.method893(true) * super.field1627.field5988 / 10000;
        class386.field4930.method528(arg3, arg2 + 2, var5, super.field1627.field5978 + -2, ((class702) super.field1627).field9762, 0);
        class386.field4930.method528(arg3 + var5, arg2 + 2, -var5 + super.field1627.field5988, super.field1627.field5978 - 2, 0, 0);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZIZI)V", line = 28)
    public final void method892(boolean arg0, int arg1, boolean arg2, int arg3) {
        ++field7752;
        class386.field4930.method460(arg3 + -2, arg1, super.field1627.field5988 - -4, super.field1627.field5978 - -2, ((class702) super.field1627).field9763, 0);
        if (!arg0) {
            field7753 = null;
        }
        class386.field4930.method460(arg3 + -1, arg1 - -1, super.field1627.field5988 + 2, super.field1627.field5978, 0, 0);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)V", line = 49)
    public static void method3214(byte arg0) {
        field7753 = null;
        if (arg0 > 7) {
            field7754 = null;
        }
    }
}
