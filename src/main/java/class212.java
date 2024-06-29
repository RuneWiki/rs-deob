import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class212 extends class379 {

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public int field2580;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "J")
    public long field2581;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I")
    public final int method705(int arg0) {
        if (arg0 != 5) {
            this.method705(12);
        }
        return this.field2583;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)I")
    public final int method700(byte arg0) {
        int var2 = -21 / ((-arg0 - 63) / 59);
        return this.field2584;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)I")
    public final int method703(int arg0) {
        int var2 = 21 / ((arg0 - 61) / 47);
        return this.field2582;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)J")
    public final long method704(byte arg0) {
        if (arg0 != -87) {
            this.field2583 = -28;
        }
        return this.field2581;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)I")
    public final int method701(int arg0) {
        if (arg0 != 5) {
            this.field2582 = -50;
        }
        return this.field2580;
    }
}
