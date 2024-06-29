import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class99 extends class286 {

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    public static volatile int field1493 = 0;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "Lrc;")
    public static class217 field1491 = new class217(5000);

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "[I")
    public static int[] field1495 = new int[32];

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "B")
    public byte field1485;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "Lug;")
    public class25 field1486;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "Lrg;")
    public static class342 field1496;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V", line = 7)
    public static void method869(int arg0) {
        field1491 = null;
        field1495 = null;
        int var1 = 86 / ((arg0 + 2) / 60);
        field1496 = null;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)I", line = 19)
    public final int method870(boolean arg0) {
        field1494++;
        if (this.field1486 == null) {
            return 0;
        } else if (arg0) {
            return -49;
        } else {
            return this.field1486.field397 * 100 / (this.field1486.field448.length - this.field1485);
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)[B", line = 47)
    public final byte[] method871(byte arg0) {
        if (arg0 > -86) {
            return (byte[]) null;
        }
        field1488++;
        if (this.field4435 || this.field1486.field448.length - this.field1485 > this.field1486.field397) {
            throw new RuntimeException();
        }
        return this.field1486.field448;
    }
}
