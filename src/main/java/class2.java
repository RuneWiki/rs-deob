import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!APQXVAYL")
public class class2 extends class31 {

    @OriginalMember(owner = "client!APQXVAYL", name = "g", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!APQXVAYL", name = "e", descriptor = "LAPQXVAYL;")
    public class2 field27;

    @OriginalMember(owner = "client!APQXVAYL", name = "f", descriptor = "LAPQXVAYL;")
    public class2 field28;

    @OriginalMember(owner = "client!APQXVAYL", name = "b", descriptor = "()V")
    public void method4() {
        if (this.field28 != null) {
            this.field28.field27 = this.field27;
            this.field27.field28 = this.field28;
            this.field27 = null;
            this.field28 = null;
        }
    }
}
