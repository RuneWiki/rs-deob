import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class598 {

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public int field8378;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Ljava/lang/String;")
    public String field8380;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "[I")
    public static int[] field8376 = new int[8];

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Lmaa;")
    public static class498 field8377;

    @OriginalMember(owner = "client!im", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field8379++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 16)
    public static void method3400(byte arg0) {
        field8377 = null;
        if (arg0 != -102) {
            field8376 = null;
        }
        field8376 = null;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 32)
    public class598(String arg0, int arg1) {
        this.field8378 = arg1;
        this.field8380 = arg0;
    }
}
