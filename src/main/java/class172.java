import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class172 extends class132 {

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!efa", name = "s", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!efa", name = "t", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "J")
    public long field2020;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(Z)I")
    public final int method860(boolean arg0) {
        return arg0 ? this.field2021 : -20;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)I")
    public final int method861(byte arg0) {
        int var2 = -9 / ((-arg0 - 10) / 43);
        return this.field2022;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)I")
    public final int method851(int arg0) {
        if (arg0 != -1160828951) {
            this.field2019 = 63;
        }
        return this.field2019;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)J")
    public final long method854(int arg0) {
        return arg0 == 32055 ? this.field2020 : 77L;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)I")
    public final int method855(byte arg0) {
        if (arg0 >= -70) {
            this.method860(true);
        }
        return this.field2023;
    }
}
