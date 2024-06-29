import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class134 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "J")
    public long field1522;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lmc;")
    public class134 field1520;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lmc;")
    public class134 field1521;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[[B")
    public static byte[][] field1518;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V", line = 3)
    public static void method862(int arg0) {
        field1518 = null;
        if (arg0 <= 2) {
            field1515 = 97;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Z", line = 18)
    public final boolean method863(int arg0) {
        if (arg0 <= 20) {
            field1518 = null;
        }
        field1516++;
        return this.field1520 != null;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V", line = 42)
    public final void method864(int arg0) {
        field1517++;
        if (this.field1520 == null) {
            return;
        }
        if (arg0 != 12983) {
            field1515 = 59;
        }
        this.field1520.field1521 = this.field1521;
        this.field1521.field1520 = this.field1520;
        this.field1521 = null;
        this.field1520 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BII)[B", line = 59)
    public static final byte[] method865(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != -24901) {
            method862(-62);
        }
        field1523++;
        byte[] var4 = new byte[arg0];
        class143.method894(arg1, arg2, var4, 0, arg0);
        return var4;
    }
}
