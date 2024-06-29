import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class232 extends class740 {

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "B")
    public byte field3302 = 5;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3301 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public int field3300;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public int field3303;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public int field3305;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Lth;")
    public static class593 field3298;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Z")
    public boolean field3299;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method1585(byte arg0) {
        field3298 = null;
        field3301 = null;
        if (arg0 >= -80) {
            method1585((byte) 9);
        }
    }
}
