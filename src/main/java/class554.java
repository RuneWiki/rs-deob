import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class554 extends class623 {

    @OriginalMember(owner = "client!oea", name = "y", descriptor = "I")
    public int field8020;

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "I")
    public int field8021;

    @OriginalMember(owner = "client!oea", name = "A", descriptor = "I")
    public int field8022;

    @OriginalMember(owner = "client!oea", name = "B", descriptor = "I")
    public int field8023;

    @OriginalMember(owner = "client!oea", name = "x", descriptor = "J")
    public long field8019;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)I")
    public final int method2600(int arg0) {
        return arg0 == 25 ? this.field8022 : -52;
    }

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "(B)I")
    public final int method2594(byte arg0) {
        if (arg0 >= -15) {
            this.method2598(-61);
        }
        return this.field8023;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)I")
    public final int method2596(boolean arg0) {
        if (!arg0) {
            this.method2600(7);
        }
        return this.field8020;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)J")
    public final long method2598(int arg0) {
        return arg0 == 16209 ? this.field8019 : -114L;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(Z)I")
    public final int method2599(boolean arg0) {
        return arg0 ? this.field8021 : -31;
    }
}
