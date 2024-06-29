import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class676 extends class562 {

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "B")
    public byte field9568 = 5;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field9567 = -2;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9575 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field9579 = 0;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field9581 = 0;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public int field9566;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public int field9569;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public static int field9570;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public int field9571;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public int field9573;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public int field9576;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field9577;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public int field9578;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "Loh;")
    public static class404 field9580;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "Z")
    public boolean field9574;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "[[B")
    public static byte[][] field9572;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(IB)I", line = 18)
    public static final int method3843(int arg0, byte arg1) {
        if (arg1 != 121) {
            method3843(115, (byte) -9);
        }
        field9570++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(Z)V", line = 31)
    public static void method3844(boolean arg0) {
        if (!arg0) {
            method3844(false);
        }
        field9575 = null;
        field9572 = null;
        field9580 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)I", line = 43)
    public static final int method3845(int arg0, int arg1, int arg2, int arg3) {
        field9577++;
        if (class504.field7120 == null) {
            return 0;
        }
        int var4 = arg1 >> 9;
        int var5 = arg0 >> 9;
        if (var4 < arg2 || var5 < 0 || var4 > (class489.field6976 - 1) || var5 > (class153.field1677 - 1)) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class100.field1043[1][var4][var5] & 0x2) != 0) {
            var6 = arg3 + 1;
        }
        return class504.field7120[var6].method1675(arg0, arg1, 65286);
    }
}
