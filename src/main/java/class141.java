import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class141 extends class70 {

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Ljava/lang/String;")
    public String field2382;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field2381 = 0;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field2383 = 0;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "[I")
    public static int[] field2379 = new int[500];

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V", line = 13)
    public static void method971(int arg0) {
        field2379 = null;
        int var1 = -42 / ((arg0 + 25) / 55);
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V", line = 34)
    public class141() {
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 36)
    public class141(String arg0, int arg1) {
        this.field2382 = arg0;
    }
}
