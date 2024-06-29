import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class297 {

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public int field3888;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "Lra;")
    public static class361 field3887 = new class361(2, 3);

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "Ldn;")
    public static class548 field3891;

    @OriginalMember(owner = "client!mv", name = "toString", descriptor = "()Ljava/lang/String;", line = 8)
    public final String toString() {
        field3892++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(IIII)V", line = 19)
    public class297(int arg0, int arg1, int arg2, int arg3) {
        this.field3889 = arg0;
        this.field3886 = arg3;
        this.field3888 = arg1;
        this.field3890 = arg2;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V", line = 34)
    public static void method1757(boolean arg0) {
        field3891 = null;
        field3887 = null;
        if (arg0) {
            method1757(false);
        }
    }
}
