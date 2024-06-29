import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class388 extends class561 {

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!wfa", name = "o", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!wfa", name = "p", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZIII)V", line = 5)
    public final void method968(boolean arg0, int arg1, int arg2, int arg3) {
        ++field5417;
        int var5 = this.method3360(false) * super.field7977.field9575 / 10000;
        class96.field1401.method2194(arg3, arg1 + 2, var5, super.field7977.field9561 + -2, ((class597) super.field7977).field8585, 0);
        if (arg2 == -30264) {
            class96.field1401.method2194(arg3 + var5, arg1 + 2, -var5 + super.field7977.field9575, super.field7977.field9561 + -2, 0, 0);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lwu;Lwu;Lvc;)V", line = 19)
    public class388(class557 arg0, class557 arg1, class597 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method2360(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5415;
        class118 var5 = class126.method814(true, arg2, arg1);
        var5.method771(arg1 ^ -30555);
        var5.field1636 = arg0;
        var5.field1634 = arg4;
        var5.field1629 = arg3;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BZII)V", line = 36)
    public final void method971(byte arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 != 20) {
            method2360(-84, 99, 57, 121, 62);
        }
        ++field5416;
        class96.field1401.method2166(arg2 + -2, arg3, super.field7977.field9575 + 4, super.field7977.field9561 + 2, ((class597) super.field7977).field8583, 0);
        class96.field1401.method2166(arg2 + -1, arg3 + 1, super.field7977.field9575 + 2, super.field7977.field9561, 0, 0);
    }
}
