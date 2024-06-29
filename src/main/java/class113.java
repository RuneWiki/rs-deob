import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class113 {

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "Lcda;")
    public class113 field1586;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "Lcda;")
    public class113 field1589;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "Lpo;")
    public static class577 field1587;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V")
    public final void method814(int arg0) {
        if (arg0 <= 40) {
            this.field1586 = null;
        }
        field1588++;
        if (this.field1586 != null) {
            this.field1586.field1589 = this.field1589;
            this.field1589.field1586 = this.field1586;
            this.field1586 = null;
            this.field1589 = null;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "()V")
    public static final void method815() {
        for (int var0 = 0; var0 < class186.field2604.length; var0++) {
            class186.field2604[var0].method828();
        }
        class186.field2604 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)V")
    public static void method816(boolean arg0) {
        field1587 = null;
        if (arg0) {
            field1587 = null;
        }
    }
}
