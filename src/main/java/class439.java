import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class439 {

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public int field6502;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "Z")
    public static boolean field6504 = false;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "Z")
    public static boolean field6503 = false;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)I")
    public static final int method2715(int arg0, int arg1) {
        if (arg1 != 117717096) {
            field6504 = true;
        }
        field6500++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!io", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6505++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(II)V")
    public class439(int arg0, int arg1) {
        this.field6502 = arg1;
    }
}
