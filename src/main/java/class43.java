import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class43 extends class458 {

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "J")
    public long field463;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)I")
    public final int method227(int arg0) {
        return arg0 == -4915 ? this.field460 : -55;
    }

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "(I)I")
    public final int method228(int arg0) {
        if (arg0 != -12152) {
            this.field462 = 4;
        }
        return this.field461;
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)J")
    public final long method229(int arg0) {
        if (arg0 > -64) {
            this.field461 = 15;
        }
        return this.field463;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)I")
    public final int method230(byte arg0) {
        return arg0 == 54 ? this.field462 : -124;
    }

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "(I)I")
    public final int method231(int arg0) {
        if (arg0 >= -84) {
            this.method227(1);
        }
        return this.field464;
    }
}
