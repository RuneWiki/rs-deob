import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class class208 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public int field2972;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(III)V", line = 8)
    public class208(int arg0, int arg1, int arg2) {
        this.field2972 = arg1;
        this.field2971 = arg0;
        this.field2970 = arg2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
    public abstract void method818(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
    public abstract void method820(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZII)V")
    public abstract void method814(boolean arg0, int arg1, int arg2);
}
