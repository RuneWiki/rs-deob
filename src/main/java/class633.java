import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class633 extends class703 {

    @OriginalMember(owner = "client!fca", name = "m", descriptor = "I")
    public int field8883;

    @OriginalMember(owner = "client!fca", name = "n", descriptor = "I")
    public int field8884;

    @OriginalMember(owner = "client!fca", name = "o", descriptor = "I")
    public int field8885;

    @OriginalMember(owner = "client!fca", name = "q", descriptor = "I")
    public int field8887;

    @OriginalMember(owner = "client!fca", name = "p", descriptor = "J")
    public long field8886;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)I")
    public final int method3022(int arg0) {
        return arg0 <= 29 ? 46 : this.field8884;
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)I")
    public final int method3020(int arg0) {
        if (arg0 != -4) {
            this.method3024(true);
        }
        return this.field8883;
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)I")
    public final int method3023(int arg0) {
        if (arg0 >= -96) {
            this.method3023(45);
        }
        return this.field8887;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)J")
    public final long method3024(boolean arg0) {
        if (arg0) {
            this.field8884 = 13;
        }
        return this.field8886;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)I")
    public final int method3017(byte arg0) {
        return arg0 == 61 ? this.field8885 : -38;
    }
}
