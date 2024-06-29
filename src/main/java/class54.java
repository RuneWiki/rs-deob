import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class54 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Ljm;")
    public static class485 field747 = new class485(63, 8);

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field748 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Lof;")
    public static class438 field749 = new class438("WTWIP", 3);

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field753 = 100;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field754 = -2;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
    public static int[] field750 = new int[1024];

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Lm;")
    public static class126 field755;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "Lrs;")
    public static class462 field752;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field751;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 8)
    public static void method351(byte arg0) {
        field747 = null;
        field752 = null;
        field750 = null;
        field748 = null;
        field751 = null;
        if (arg0 < 28) {
            field752 = null;
        }
        field749 = null;
        field755 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
    public abstract int method349(int arg0, int arg1);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method350(byte arg0, int arg1);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Ljn;")
    public abstract class504 method352(int arg0);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V")
    public abstract void method353(int arg0, byte arg1);
}
