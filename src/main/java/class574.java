import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class574 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public int field7464;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public int field7479;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public int field7474;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "B")
    public byte field7476;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    private int field7469;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Lgi;")
    public class574 field7465;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Ljh;")
    public static class501 field7477 = new class501();

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7481 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "[I")
    public static int[] field7485 = new int[13];

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Lra;")
    public static class361 field7484 = new class361(27, 12);

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public int field7466;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public int field7467;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public int field7468;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public int field7470;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public int field7471;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public int field7472;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public int field7475;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public int field7480;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public int field7483;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 13)
    public static void method3060(int arg0) {
        field7485 = null;
        int var1 = -33 % ((45 - arg0) / 50);
        field7484 = null;
        field7477 = null;
        field7481 = null;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lhm;", line = 29)
    public final class216 method3061(int arg0) {
        if (arg0 == -20239) {
            field7478++;
            return class314.method1831(this.field7469, (byte) -96);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBII)Lgi;", line = 44)
    public final class574 method3062(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = 118 % ((21 - arg1) / 32);
        field7473++;
        return new class574(this.field7469, arg2, arg0, arg3, this.field7476);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(IIIIB)V", line = 61)
    public class574(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field7464 = arg1;
        this.field7479 = arg3;
        this.field7474 = arg2;
        this.field7476 = arg4;
        this.field7469 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lgi;I)V", line = 83)
    public class574(class574 arg0, int arg1) {
        this.field7465 = arg0;
        this.field7469 = this.field7465.field7469;
        this.field7476 = this.field7465.field7476;
        this.field7464 = this.field7465.field7464 + arg1;
        this.field7479 = this.field7465.field7479 + arg1;
        this.field7474 = this.field7465.field7474 + arg1;
    }
}
