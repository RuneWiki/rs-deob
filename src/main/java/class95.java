import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class95 extends class184 {

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "[I")
    public static int[] field1517 = new int[100];

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "Z")
    public static boolean field1524 = false;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field1523 = 0;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "J")
    public long field1520;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Llj;")
    public static class51 field1513;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "Lib;")
    public class95 field1518;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "Lib;")
    public class95 field1522;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "[Lse;")
    public static class12[] field1521;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "[[[B")
    public static byte[][][] field1516;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method647(byte arg0) {
        if (arg0 != 106) {
            field1519 = -48;
        }
        field1515++;
        return this.field1522 != null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 44)
    public final void method648(int arg0) {
        field1514++;
        if (this.field1522 != null && arg0 == 26562) {
            this.field1522.field1518 = this.field1518;
            this.field1518.field1522 = this.field1522;
            this.field1522 = null;
            this.field1518 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V", line = 67)
    public static void method649(byte arg0) {
        field1513 = null;
        field1521 = null;
        field1517 = null;
        field1516 = (byte[][][]) null;
        int var1 = 31 / ((-arg0 - 68) / 56);
    }
}
