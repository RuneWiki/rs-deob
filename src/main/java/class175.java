import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class175 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Lus;")
    private class1 field2880;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lqfa;")
    public static class85 field2882 = new class85(77, 2);

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2883++;
        this.field2880.method97(this.field2881, (byte) -121);
        super.finalize();
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static void method1314(int arg0) {
        if (arg0 > 45) {
            field2882 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lus;II)V")
    public class175(class1 arg0, int arg1, int arg2) {
        this.field2880 = arg0;
        this.field2881 = arg2;
    }
}
