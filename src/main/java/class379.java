import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class379 {

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "J")
    public long field4809;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "Loq;")
    public class379 field4806;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "Loq;")
    public class379 field4808;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Ldr;")
    public static class750 field4811;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "[Lpt;")
    public static class557[] field4807;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "(I)V", line = 6)
    public final void method2219(int arg0) {
        field4810++;
        if (this.field4808 == null) {
            return;
        }
        this.field4808.field4806 = this.field4806;
        this.field4806.field4808 = this.field4808;
        if (arg0 == 13630) {
            this.field4806 = null;
            this.field4808 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V", line = 29)
    public static void method2220(boolean arg0) {
        field4807 = null;
        if (arg0) {
            method2220(false);
        }
        field4811 = null;
    }

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "(I)Z", line = 42)
    public final boolean method2221(int arg0) {
        if (arg0 != 8763) {
            this.field4806 = null;
        }
        field4812++;
        return this.field4808 != null;
    }
}
