import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class183 extends class594 {

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Lhc;")
    public class391 field2791;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[I")
    public static int[] field2792 = new int[200];

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lnj;")
    public static class487 field2793 = new class487("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 3)
    public static void method1210(int arg0) {
        if (arg0 == -21647) {
            field2793 = null;
            field2792 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lkw;II[B)V", line = 22)
    public class183(class174 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2791 = arg0.method1165(false, arg3, arg1, arg2, -128, class566.field8401);
        this.field2791.method563(false, 32, false);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lkw;II[I)V", line = 34)
    public class183(class174 arg0, int arg1, int arg2, int[] arg3) {
        this.field2791 = arg0.method1105(arg3, false, arg2, 6978, arg1);
        this.field2791.method563(false, -116, false);
    }
}
