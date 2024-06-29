import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class19 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field225 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field227 = -1;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Z")
    public static boolean field228 = true;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lqj;I)Z")
    public static final boolean method104(class196 arg0, int arg1) {
        if (arg1 != 2) {
            method105((byte) 80);
        }
        field226++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class211.field3796; var2++) {
            if (arg0.method1320(false, class198.field3511[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static void method105(byte arg0) {
        if (arg0 != 100) {
            method105((byte) 2);
        }
        field225 = null;
    }
}
