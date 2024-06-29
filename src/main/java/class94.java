import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class94 {

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lge;")
    private class608 field1439;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Lri;")
    public static class94 field1441 = new class94(0, 3, class608.field8763);

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lri;")
    public static class94 field1443 = new class94(1, 3, class608.field8763);

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lri;")
    public static class94 field1445 = new class94(2, 4, class608.field8759);

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "Lri;")
    public static class94 field1446 = new class94(3, 1, class608.field8763);

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Lri;")
    public static class94 field1447 = new class94(4, 2, class608.field8763);

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Lri;")
    public static class94 field1448 = new class94(5, 3, class608.field8763);

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Lri;")
    private static class94 field1449 = new class94(6, 4, class608.field8763);

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field1450 = class98.method703(16, 0);

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1451 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field1453 = 0;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "[B")
    public static byte[] field1454 = new byte[520];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "[[B")
    public static byte[][] field1452;

    @OriginalMember(owner = "client!ri", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1437++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)[Lri;")
    public static final class94[] method683(int arg0) {
        field1436++;
        if (arg0 != 1) {
            method684((byte) -39);
        }
        return new class94[] { field1441, field1443, field1445, field1446, field1447, field1448, field1449 };
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method684(byte arg0) {
        field1449 = null;
        field1454 = null;
        field1445 = null;
        field1448 = null;
        field1446 = null;
        field1451 = null;
        field1443 = null;
        field1441 = null;
        if (arg0 != 44) {
            method683(52);
        }
        field1452 = null;
        field1447 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIZII)V")
    public static final void method685(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 >= class326.field4387 && arg0 <= class596.field8621) {
            int var5 = class646.method3722(arg3, class264.field3687, class591.field8435, false);
            int var6 = class646.method3722(arg1, class264.field3687, class591.field8435, false);
            class105.method742(arg4, (byte) 113, var5, var6, arg0);
        }
        if (!arg2) {
            field1440++;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(IILge;)V")
    private class94(int arg0, int arg1, class608 arg2) {
        this.field1444 = arg0;
        this.field1439 = arg2;
        this.field1442 = arg1;
        this.field1438 = this.field1439.field8755 * this.field1442;
        if (this.field1444 >= 16) {
            throw new RuntimeException();
        }
    }
}
