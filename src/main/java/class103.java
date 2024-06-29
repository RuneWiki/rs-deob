import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class103 extends class553 {

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "J")
    public long field1464;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)I")
    public final int method759(byte arg0) {
        if (arg0 < 38) {
            this.method763(-53);
        }
        return this.field1463;
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)I")
    public final int method760(int arg0) {
        if (arg0 < 122) {
            this.method760(-84);
        }
        return this.field1461;
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(Z)I")
    public final int method761(boolean arg0) {
        return arg0 ? 11 : this.field1465;
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)I")
    public final int method762(int arg0) {
        if (arg0 != -4) {
            this.method761(false);
        }
        return this.field1462;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)J")
    public final long method763(int arg0) {
        return arg0 == -25909 ? this.field1464 : -25L;
    }
}
