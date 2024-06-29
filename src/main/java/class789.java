import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class789 extends class394 {

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
    public int field11498;

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "I")
    public int field11499;

    @OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
    public int field11500;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public int field11502;

    @OriginalMember(owner = "client!eca", name = "r", descriptor = "J")
    public long field11501;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)I")
    public final int method2177(byte arg0) {
        if (arg0 != 107) {
            this.field11498 = 99;
        }
        return this.field11500;
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(B)I")
    public final int method2182(byte arg0) {
        if (arg0 != 117) {
            this.field11498 = -75;
        }
        return this.field11499;
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)J")
    public final long method2176(int arg0) {
        return arg0 > -67 ? -7L : this.field11501;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)I")
    public final int method2181(int arg0) {
        if (arg0 != -2) {
            this.field11499 = -32;
        }
        return this.field11502;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z)I")
    public final int method2178(boolean arg0) {
        if (arg0) {
            this.field11501 = -61L;
        }
        return this.field11498;
    }
}
