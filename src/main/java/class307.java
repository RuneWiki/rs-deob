import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class307 extends class73 {

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public int field3821;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "J")
    public long field3823;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I", line = 7)
    public final int method532(int arg0) {
        int var2 = 16 / ((arg0 + 19) / 35);
        return this.field3824;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I", line = 16)
    public final int method535(byte arg0) {
        return arg0 == -25 ? this.field3821 : 14;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I", line = 27)
    public final int method530(int arg0) {
        if (arg0 != -1) {
            this.method530(66);
        }
        return this.field3825;
    }

    @OriginalMember(owner = "client!le", name = "g", descriptor = "(I)J", line = 37)
    public final long method534(int arg0) {
        if (arg0 != -1) {
            this.field3823 = -6L;
        }
        return this.field3823;
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)I", line = 47)
    public final int method533(int arg0) {
        return arg0 >= -99 ? 68 : this.field3822;
    }
}
