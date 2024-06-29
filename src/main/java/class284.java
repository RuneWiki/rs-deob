import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class284 extends class382 {

    @OriginalMember(owner = "client!ria", name = "m", descriptor = "I")
    public int field4030;

    @OriginalMember(owner = "client!ria", name = "n", descriptor = "I")
    public int field4031;

    @OriginalMember(owner = "client!ria", name = "o", descriptor = "I")
    public int field4032;

    @OriginalMember(owner = "client!ria", name = "p", descriptor = "I")
    public int field4033;

    @OriginalMember(owner = "client!ria", name = "l", descriptor = "J")
    public long field4029;

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(B)I")
    public final int method779(byte arg0) {
        int var2 = -67 % ((arg0 + 14) / 60);
        return this.field4030;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)I")
    public final int method776(int arg0) {
        if (arg0 > -111) {
            this.field4031 = 45;
        }
        return this.field4031;
    }

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "(I)I")
    public final int method772(int arg0) {
        if (arg0 != -5) {
            this.method779((byte) -105);
        }
        return this.field4033;
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(I)I")
    public final int method778(int arg0) {
        return arg0 == 0 ? this.field4032 : -86;
    }

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "(I)J")
    public final long method773(int arg0) {
        if (arg0 < 75) {
            this.field4033 = 55;
        }
        return this.field4029;
    }
}
