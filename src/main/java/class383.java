import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class383 {

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Z")
    public boolean field5783;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "J")
    public static long field5781 = 0L;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "Lcca;")
    public class209 field5779;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "Lcca;")
    public class209 field5782;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "Z")
    public boolean field5780;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
    public final void method2448(byte arg0) {
        if (this.field5779 != null) {
            this.field5779.method650(true);
        }
        field5778++;
        this.field5780 = false;
        if (arg0 != -44) {
            this.field5783 = false;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)Z")
    public final boolean method2449(byte arg0) {
        field5784++;
        if (arg0 == -36) {
            return this.field5780 && !this.field5783;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Z)V")
    public class383(boolean arg0) {
        this.field5783 = arg0;
    }
}
