import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class504 {

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lbea;")
    private class205 field7376;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "J")
    public long field7374;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field7375 = 0;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lhga;")
    public static class158 field7377 = new class158(25, -1);

    @OriginalMember(owner = "client!md", name = "g", descriptor = "[Lqe;")
    public static class433[] field7378 = new class433[5];

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field7373;

    static {
        for (int var0 = 0; var0 < field7378.length; var0++) {
            field7378[var0] = new class433();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 7)
    public static void method3061(int arg0) {
        if (arg0 >= 73) {
            field7378 = null;
            field7377 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() throws Throwable {
        this.field7376.method1579((byte) -78, this.field7374);
        field7372++;
        super.finalize();
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lbea;J[Ldg;)V", line = 38)
    public class504(class205 arg0, long arg1, class379[] arg2) {
        this.field7376 = arg0;
        this.field7374 = arg1;
    }
}
