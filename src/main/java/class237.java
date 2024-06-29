import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class237 extends class245 {

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public int field3345;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public int field3346;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public int field3348;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "J")
    public long field3349;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)I")
    public final int method1567(int arg0) {
        if (arg0 != -20707) {
            this.field3348 = 7;
        }
        return this.field3347;
    }

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)J")
    public final long method1568(int arg0) {
        return arg0 == -14188 ? this.field3349 : 40L;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)I")
    public final int method1569(int arg0) {
        if (arg0 != 3) {
            this.field3348 = -106;
        }
        return this.field3346;
    }

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)I")
    public final int method1570(int arg0) {
        return arg0 == 3 ? this.field3345 : 12;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)I")
    public final int method1571(boolean arg0) {
        if (!arg0) {
            this.method1570(-23);
        }
        return this.field3348;
    }
}
