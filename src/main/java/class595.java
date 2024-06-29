import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class595 {

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "Lwa;")
    public static class661 field8386 = new class661(512);

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "Lgk;")
    public static class616 field8388 = new class616();

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8389 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "Lps;")
    public static class469 field8390 = new class469(3, 5);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field8385;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Ltf;Z)V")
    public static final void method3341(class701 arg0, boolean arg1) {
        field8385++;
        if (!arg1) {
            method3341(null, true);
        }
        class425.field5992 = arg0;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V")
    public static void method3342(byte arg0) {
        if (arg0 != 83) {
            method3345(false, 87, -3);
        }
        field8389 = null;
        field8386 = null;
        field8388 = null;
        field8390 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILnp;)Ltr;")
    public static final class337 method3343(int arg0, class115 arg1) {
        field8383++;
        if (arg0 != 5) {
            field8389 = null;
        }
        return new class337(arg1.method676(arg0 - 10), arg1.method676(-5), arg1.method676(-5), arg1.method676(-5), arg1.method675(-125), arg1.method620((byte) -40));
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)I")
    public static final int method3344(byte arg0) {
        if (arg0 == 82) {
            field8387++;
            return 46;
        } else {
            return 9;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3345(boolean arg0, int arg1, int arg2) {
        field8384++;
        if (!arg0) {
            field8388 = null;
        }
        return (arg2 & 0x100) != 0;
    }
}
