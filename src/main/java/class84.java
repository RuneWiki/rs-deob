import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class84 extends class147 {

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "J")
    public long field1325;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)I")
    public final int method475(int arg0) {
        if (arg0 != -2) {
            this.field1322 = 29;
        }
        return this.field1324;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)I")
    public final int method476(boolean arg0) {
        if (arg0) {
            this.method475(115);
        }
        return this.field1326;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)J")
    public final long method477(byte arg0) {
        return arg0 == 55 ? this.field1325 : -91L;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)I")
    public final int method478(int arg0) {
        if (arg0 != 0) {
            this.method479((byte) -59);
        }
        return this.field1322;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)I")
    public final int method479(byte arg0) {
        if (arg0 != 41) {
            this.method476(false);
        }
        return this.field1323;
    }
}
