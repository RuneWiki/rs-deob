import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class7 extends class497 {

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!sda", name = "n", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!sda", name = "o", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!sda", name = "q", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!sda", name = "p", descriptor = "J")
    public long field63;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)I")
    public final int method30(boolean arg0) {
        return arg0 ? this.field62 : -62;
    }

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "(I)I")
    public final int method31(int arg0) {
        return arg0 < 1 ? -126 : this.field60;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)I")
    public final int method32(byte arg0) {
        int var2 = 3 % ((arg0 + 70) / 43);
        return this.field61;
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)J")
    public final long method33(int arg0) {
        if (arg0 != 3) {
            this.method31(2);
        }
        return this.field63;
    }

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "(I)I")
    public final int method34(int arg0) {
        if (arg0 != -3797) {
            this.method30(true);
        }
        return this.field64;
    }
}
