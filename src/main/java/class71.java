import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class71 {

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lef;")
    public static class488 field769 = new class488();

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field771 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lgj;")
    public class634 field768;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lufa;")
    public static class680 field770;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[I")
    public int[] field766;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method531(byte arg0) {
        field770 = null;
        field769 = null;
        if (arg0 > -53) {
            method531((byte) -5);
        }
        field771 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lji;B)Lsr;")
    public static final class255 method532(class611 arg0, byte arg1) {
        if (arg1 != 51) {
            field769 = null;
        }
        field767++;
        return new class255(arg0.method3413(false), arg0.method3413(false), arg0.method3413(false), arg0.method3413(false), arg0.method3385(-127), arg0.method3385(-128), arg0.method3428((byte) -114));
    }
}
