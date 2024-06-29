import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class39 implements class331 {

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Llw;")
    public class687 field508;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lwia;")
    private class791 field507;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Ljd;")
    public class241 field505;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 10)
    public final void method297(int arg0) {
        field510++;
        this.field505 = class611.method3549(0, this.field507, this.field508.field9553);
        int var2 = -11 / ((arg0 - 83) / 32);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Z", line = 21)
    public final boolean method298(byte arg0) {
        field509++;
        if (arg0 != -98) {
            this.field508 = null;
        }
        return this.field507.method4349((byte) -102, this.field508.field9553);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lwia;Llw;)V", line = 32)
    public class39(class791 arg0, class687 arg1) {
        this.field508 = arg1;
        this.field507 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZ)V", line = 42)
    public void method299(boolean arg0, boolean arg1) {
        field506++;
        if (arg0) {
            int var3 = this.field508.field9547.method703(this.field505.method1507(), class527.field7532, (byte) 38) + this.field508.field9548;
            int var4 = this.field508.field9552.method2781(this.field505.method1505(), 0, class296.field4307) + this.field508.field9555;
            this.field505.method1604(var3, var4);
        }
        if (arg1) {
            this.field505 = null;
        }
    }
}
