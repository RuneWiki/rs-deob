import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class658 extends class617 {

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "Lbv;")
    public class618 field9244;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "J")
    public static long field9243 = 0L;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lbv;)V")
    public class658(class618 arg0) {
        this.field9244 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILtf;)Lho;")
    public static final class463 method3651(int arg0, int arg1, class701 arg2) {
        if (arg0 >= -108) {
            return null;
        } else {
            field9245++;
            byte[] var3 = arg2.method3859((byte) 123, arg1);
            return var3 == null ? null : new class463(var3);
        }
    }
}
