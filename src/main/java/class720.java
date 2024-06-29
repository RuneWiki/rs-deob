import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class720 implements class681 {

    @OriginalMember(owner = "client!co", name = "c", descriptor = "Lla;")
    private class423 field10138;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field10137;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I")
    public final int method2020(int arg0) {
        field10136++;
        if (this.field10138.method2620(true)) {
            return 100;
        } else {
            if (arg0 != 28170) {
                this.method2020(-119);
            }
            return this.field10138.method2610(0);
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)Lwea;")
    public final class115 method2019(int arg0) {
        if (arg0 == 10251) {
            field10137++;
            return class115.field1598;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lla;)V")
    public class720(class423 arg0) {
        this.field10138 = arg0;
    }
}
