import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class409 {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field5793 = 1;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lfe;")
    public class409 field5792;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lfe;")
    public class409 field5794;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 4)
    public final void method2429(int arg0) {
        field5795++;
        if (this.field5792 == null) {
            return;
        }
        this.field5792.field5794 = this.field5794;
        this.field5794.field5792 = this.field5792;
        this.field5792 = null;
        this.field5794 = null;
        if (arg0 <= 115) {
            method2430(-32, 60);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V", line = 23)
    public static final void method2430(int arg0, int arg1) {
        field5790++;
        int var2 = -109 / ((30 - arg1) / 34);
        if (arg0 != -1 && class92.field1473[arg0]) {
            class106.field1605.method2025(arg0, 0);
            class283.field4217[arg0] = null;
            class472.field6869[arg0] = null;
            class92.field1473[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZ)Z", line = 56)
    public static final boolean method2431(int arg0, int arg1, boolean arg2) {
        field5791++;
        if (!arg2) {
            method2432(-114, 34, 55, null);
        }
        return (class463.method2749(arg1, arg0, 96) | class513.method2999(arg1, (byte) -70, arg0) | class431.method2551(-3, arg0, arg1)) & class514.method3003((byte) -118, arg1, arg0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIILib;)V", line = 69)
    public static final void method2432(int arg0, int arg1, int arg2, class108 arg3) {
        class188 var4 = class53.method468(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field2756 = arg3;
        }
    }
}
