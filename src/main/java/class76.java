import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class76 {

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "B")
    private byte field1046;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!fca", name = "j", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!fca", name = "i", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "Z")
    public static volatile boolean field1043 = false;

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "F")
    public static float field1050;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!fca", name = "k", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "[[[B")
    public static byte[][][] field1049;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)I", line = 14)
    public final int method601(byte arg0) {
        field1044++;
        if (arg0 < 70) {
            this.method602((byte) -99);
        }
        return this.field1046 & 0x7;
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)I", line = 25)
    public final int method602(byte arg0) {
        field1053++;
        if (arg0 != 56) {
            this.method602((byte) -17);
        }
        return (this.field1046 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(B)V", line = 36)
    public static void method603(byte arg0) {
        if (arg0 >= -78) {
            field1049 = null;
        }
        field1049 = null;
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V", line = 52)
    public class76() {
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Ljr;)V", line = 54)
    public class76(class96 arg0) {
        this.field1046 = arg0.method748(-813976688);
        this.field1045 = arg0.method743((byte) -126);
        this.field1047 = arg0.method714(false);
        this.field1052 = arg0.method714(false);
        this.field1048 = arg0.method714(false);
        this.field1051 = arg0.method714(false);
    }
}
