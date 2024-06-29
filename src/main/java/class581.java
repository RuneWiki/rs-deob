import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class581 {

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public int field8541;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Lwf;")
    public static class117 field8544 = new class117(8);

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)I", line = 4)
    public final int method3469(boolean arg0) {
        if (arg0) {
            this.toString();
        }
        field8540++;
        return this.field8541;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 23)
    public static void method3470(int arg0) {
        int var1 = 112 % ((-arg0 - 75) / 45);
        field8544 = null;
    }

    @OriginalMember(owner = "client!lt", name = "toString", descriptor = "()Ljava/lang/String;", line = 34)
    public final String toString() {
        field8542++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 44)
    public class581(String arg0, int arg1) {
        this.field8541 = arg1;
    }
}
