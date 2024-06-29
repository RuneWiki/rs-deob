import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class464 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public int field6820;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Ljava/lang/String;")
    public String field6822;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "[[Z")
    public static boolean[][] field6819;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method2824(byte arg0) {
        field6819 = null;
        int var1 = -84 / ((20 - arg0) / 32);
    }

    @OriginalMember(owner = "client!qg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6821++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class464(String arg0, int arg1) {
        this.field6820 = arg1;
        this.field6822 = arg0;
    }
}
