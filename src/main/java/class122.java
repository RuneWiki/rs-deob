import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class122 extends class7 {

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "J")
    public long field1533;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)J")
    public final long method31(int arg0) {
        if (arg0 != 0) {
            this.method29((byte) -24);
        }
        return this.field1533;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)I")
    public final int method30(byte arg0) {
        int var2 = 80 % ((arg0 + 8) / 40);
        return this.field1531;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)I")
    public final int method27(int arg0) {
        return arg0 == 2 ? this.field1532 : 75;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)I")
    public final int method29(byte arg0) {
        return arg0 > -61 ? -55 : this.field1535;
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)I")
    public final int method32(int arg0) {
        if (arg0 != 32679) {
            this.method32(72);
        }
        return this.field1534;
    }
}
