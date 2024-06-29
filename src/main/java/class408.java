import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class408 {

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public int field6299;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Ljava/lang/String;", line = 10)
    public static final String method2612(int arg0) {
        field6300++;
        if (arg0 != 32768) {
            method2612(68);
        }
        return class453.field6808 || class572.field8178 == null ? "" : class572.field8178.field4626;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(I)V", line = 26)
    public class408(int arg0) {
        this.field6299 = arg0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method2613(int arg0, int arg1, int arg2) {
        field6298++;
        if (arg2 == 32768) {
            return (arg1 & 0x8000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!os", name = "toString", descriptor = "()Ljava/lang/String;", line = 45)
    public final String toString() {
        field6297++;
        throw new IllegalStateException();
    }
}
