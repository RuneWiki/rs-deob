import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class107 {

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "B")
    private byte field1470;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "Lmga;")
    public static class739 field1475 = new class739(84, 5);

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)I", line = 6)
    public final int method813(boolean arg0) {
        if (arg0) {
            return 35;
        } else {
            field1476++;
            return this.field1470 & 0x7;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)I", line = 20)
    public final int method814(byte arg0) {
        field1473++;
        if (arg0 == 23) {
            return (this.field1470 & 0x8) == 8 ? 1 : 0;
        } else {
            return -91;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)V", line = 33)
    public static void method815(byte arg0) {
        if (arg0 != 12) {
            method815((byte) -65);
        }
        field1475 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "()V", line = 49)
    public class107() {
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ljp;)V", line = 54)
    public class107(class376 arg0) {
        this.field1470 = arg0.method2387((byte) -109);
        this.field1477 = arg0.method2359(-1);
        this.field1478 = arg0.method2384(107);
        this.field1471 = arg0.method2384(109);
        this.field1474 = arg0.method2384(91);
        this.field1472 = arg0.method2384(55);
    }
}
