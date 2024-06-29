import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class102 extends class117 {

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "[I")
    public static int[] field1457 = new int[128];

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field1455 = -1;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "I")
    public static int field1473 = 2301979;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "Z")
    public static boolean field1459 = false;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "Lin;")
    public static class177 field1470;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "[[[B")
    public static byte[][][] field1454;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V", line = 5)
    public static final void method788(byte arg0) {
        class119.field1677 = new class359[class3.field104.method2526((byte) 89)][];
        class121.field1709 = new boolean[class3.field104.method2526((byte) 101)];
        field1460++;
        if (arg0 != -64) {
            method788((byte) 47);
        }
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V", line = 41)
    public static void method789(int arg0) {
        field1457 = null;
        if (arg0 == -1) {
            field1470 = null;
            field1454 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "(I)V", line = 54)
    public static final void method790(int arg0) {
        field1472++;
        class247.field3658.method462(24);
        if (arg0 < 14) {
            method788((byte) 104);
        }
        class59.field866.method462(24);
    }
}
