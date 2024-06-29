import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class324 extends class499 {

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "Lfda;")
    public class324 field4601;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "Lfda;")
    public class324 field4603;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "Lwu;")
    public static class376 field4602;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "Lwu;")
    public static class376 field4604;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
    public static void method1960(byte arg0) {
        field4604 = null;
        field4602 = null;
        if (arg0 > -118) {
            method1960((byte) 111);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
    public final void method1961(int arg0) {
        field4599++;
        if (arg0 != -11364) {
            this.field4601 = null;
        }
        if (this.field4603 != null) {
            this.field4603.field4601 = this.field4601;
            this.field4601.field4603 = this.field4603;
            this.field4601 = null;
            this.field4603 = null;
        }
    }
}
